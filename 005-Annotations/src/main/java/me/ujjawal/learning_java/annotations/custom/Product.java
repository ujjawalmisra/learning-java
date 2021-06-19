package me.ujjawal.learning_java.annotations.custom;

/**
 * POJOs = Plain Old Java Objects
 * Simple classes which only contain data and have accessors-mutators.
 */
public class Product {
    private String name;
    private String brand;
    private float price;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {

        private final Product product;

        public Builder() {
            product = new Product();
        }

        public Builder setName(String name) {
            product.name = name;
            return this;
        }

        public Builder setBrand(String brand) {
            product.brand = brand;
            return this;
        }

        public Builder setPrice(float price) {
            product.price = price;
            return this;
        }

        public Product build() {
            return product;
        }

    }
}
