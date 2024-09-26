package design.patterns.builder;

record Product(String name, double price, String brand) {

    public static final class Builder {
        String name;
        double price;
        String brand;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Product build() {
            return new Product(name, price, brand);
        }
    }
}