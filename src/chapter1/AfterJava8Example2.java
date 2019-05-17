package chapter1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * 스트림 예제
 * 스트림의 활용으로 훨씬 간편해짐
 */
public class AfterJava8Example2 {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        Map<Currency, List<Transaction>> transactionsByCurrencies = transactions.stream()
                .filter(t -> t.getPrice() > 1000)
                .collect(groupingBy(Transaction::getCurrency));
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
