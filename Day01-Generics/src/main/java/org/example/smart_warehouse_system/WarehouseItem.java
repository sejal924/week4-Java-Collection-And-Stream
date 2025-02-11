package org.example.smart_warehouse_system;

    public abstract  class WarehouseItem {
        // Abstract class representing a warehouse item
        private String name;
        private double price;

        public WarehouseItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{name='" + name + "', price=" + price + "}";
        }
    }







