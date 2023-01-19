package com.example.salestax;

public enum ItemCategory {
    IMPORTED {
        public double getImportDutyRate() {
            return 5.0;
        }
    },
    LOCAL {
        public double getImportDutyRate() {
            return 0.0;
        }

    };

    private ItemCategory() {
    }

    public abstract double getImportDutyRate();
}