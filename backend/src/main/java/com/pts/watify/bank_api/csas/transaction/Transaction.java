package com.pts.watify.bank_api.csas.transaction;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Transaction {
    String entryReference;
    Amount amount;
    String creditDebitIndicator;
    String status;
    DateWrapper bookingDate;
    DateWrapper valueDate;
    BankTransactionCode bankTransactionCode;
    EntryDetails entryDetails;

    @Data
    private static class Amount {
        BigDecimal value;
        String currency;
    }

    @Data
    private static class DateWrapper {
        LocalDate date;
    }

    @Data
    private static class BankTransactionCode {
        Proprietary proprietary;

        @Data
        private static class Proprietary {
            Long code;
            String issuer;
        }
    }

    @Data
    private static class EntryDetails {
        TransactionDetails transactionDetails;

        @Data
        private static class TransactionDetails {
            References references;
            AmountDetails amountDetails;
            CounterValueAmount counterValueAmount;
            RelatedParties relatedParties;
            RelatedAgents relatedAgents;
            RemittanceInformation remittanceInformation;
            String additionalTransactionInformation;

            @Data
            private static class References {
                String accountServicerReference;
            }

            @Data
            private static class AmountDetails {
                InstructedAmount instructedAmount;

                @Data
                private static class InstructedAmount {
                    Amount amount;
                }
            }

            @Data
            private static class CounterValueAmount {
                Amount amount;
                CurrencyExchange currencyExchange;

                @Data
                private static class CurrencyExchange {
                    String sourceCurrency;
                    String targetCurrency;
                }
            }

            @Data
            private static class Debtor {
                String name;
            }

            @Data
            private static class RelatedParties {
                Debtor debtor;
                DebtorAccount debtorAccount;
                CreditorAccount creditorAccount;

                @Data
                private static class DebtorAccount {
                    Identification identification;
                }

                @Data
                private static class CreditorAccount {
                    Identification identification;
                }

                @Data
                private static class Identification {
                    String iban;
                    Other other;

                    @Data
                    private static class Other {
                        String identification;
                    }
                }
            }
            @Data
            private static class RelatedAgents {
                CreditorAgent creditorAgent;
                DebtorAgent debtorAgent;

                @Data
                private static class CreditorAgent {
                    FinancialInstitutionIdentification financialInstitutionIdentification;
                }

                @Data
                private static class DebtorAgent {
                    FinancialInstitutionIdentification financialInstitutionIdentification;
                }

                @Data
                private static class FinancialInstitutionIdentification {
                    String bic;
                }
            }

            @Data
            private static class RemittanceInformation {
                String unstructured;
                Structured structured;

                @Data
                private static class Structured {
                    CreditorReferenceInformation creditorReferenceInformation;

                    @Data
                    private static class CreditorReferenceInformation {
                        List<String> reference;
                    }
                }
            }
        }
    }
}
