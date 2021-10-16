package com.pts.watify.service;

import com.pts.watify.model.Client;

import java.math.BigDecimal;
import java.util.List;

public interface ClientService {

    List<Client> getAll();

    Client create(String name, String ic, String dic, BigDecimal mdRate);

    Client updateRate(Long id, BigDecimal mdRate);
}
