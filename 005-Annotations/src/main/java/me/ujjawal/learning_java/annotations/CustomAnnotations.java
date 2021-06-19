package me.ujjawal.learning_java.annotations;

import me.ujjawal.learning_java.annotations.custom.Product;

/**
 * Resources:
 * <ol>
 *     <li>{@link https://www.baeldung.com/java-annotation-processing-builder}</li>
 * </ol>
 */
public class CustomAnnotations {

    public static void main(String[] args) {
        Product toothpaste = new Product.Builder().setBrand("Colgate").setName("Mint Fresh").setPrice(50.5f).build();
        System.out.println("toothpaste --> " + toothpaste);
    }

}
