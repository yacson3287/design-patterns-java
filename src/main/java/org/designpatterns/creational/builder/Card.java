package org.designpatterns.creational.builder;

public class Card {
    private final String type;
    private final String number;
    private final String name;
    private final int expires;
    private final boolean credit;

    private Card(CardBuilder builder) {
        this.type = builder.type;
        this.number = builder.number;
        this.name = builder.name;
        this.expires = builder.expires;
        this.credit = builder.credit;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getExpires() {
        return expires;
    }

    public boolean isCredit() {
        return credit;
    }


    public static class CardBuilder {
        private String type;
        private String number;
        private String name;
        private int expires;
        private boolean credit;

        public CardBuilder(String type, String number) {
            this.type = type;
            this.number = number;
        }

        public CardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CardBuilder expires(int expires) {
            this.expires = expires;
            return this;
        }

        public CardBuilder credit(boolean credit) {
            this.credit = credit;
            return this;
        }

        public Card build() {
            return new Card(this);
        }


    }
}
