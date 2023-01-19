package com.example.salestax;

public enum ItemType {
    FOOD {
        public double getSalesTaxRate() {
            return 0.0;
        }
    },
    BOOK {
        public double getSalesTaxRate() {
            return 0.0;
        }
    },
    MEDICINE {
        public double getSalesTaxRate() {
            return 0.0;
        }
    },
    OTHER {
        public double getSalesTaxRate() {
            return 10.0;
        }

    };
    private ItemType(){

    }

    public abstract double getSalesTaxRate();
}
