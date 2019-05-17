package chapter1;

import java.util.*;

/**
 * 스트림 예제
 */
public class BeforeJava8Example2 {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
        for(Transaction transaction: transactions){
            if(transaction.getPrice() > 1000){
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
                if(transactionsForCurrency == null){
                    transactionsForCurrency = new ArrayList<>();
                    transactionsByCurrencies.put(currency, transactionsForCurrency);
                }

                transactionsForCurrency.add(transaction);
            }
        }
    }

    private class Transaction {
        private int price;
        private Currency currency;

        public Transaction(int price, Currency currency) {
            this.price = price;
            this.currency = currency;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


}
