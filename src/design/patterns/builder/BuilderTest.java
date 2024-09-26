package design.patterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Product product = new Product.Builder().name("chocolate bar")
                                                .price(2.30)
                                                .brand("nestle")
                                                .build();

        System.out.println(product);
    }
}
