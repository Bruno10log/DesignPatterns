package design.patterns.strategy;

public class PortageTest {

    public static void main(String[] args) {
        Portage portage = new Portage(new Dhl());
        System.out.println(portage.calc(10));
        portage.setCourier(new Ctt());
        System.out.println(portage.calc(10));
    }
}
