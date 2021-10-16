package com.pts.watify.service;

import com.pts.watify.dao.ClientDao;
import com.pts.watify.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientDao dao;

    @Override
    public List<Client> getAll() {
        List<Client> actualList = new ArrayList<>();
        dao.findAll().iterator().forEachRemaining(actualList::add);
        return actualList;
    }

    @Override
    public Client create(String name, String ic, String dic, BigDecimal mdRate) {
        var client = Client.builder()
                .name(name)
                .ic(ic)
                .dic(dic)
                .mdRate(mdRate)
                .build();
        return dao.save(client);
    }

    @Override
    public Client updateRate(Long id, BigDecimal mdRate) {
        var client = dao.findById(id).get();
        client.setMdRate(mdRate);
        return dao.save(client);
    }
}
