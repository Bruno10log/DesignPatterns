package design.patterns.singleton;

public class AircraftEnumTest {

    public static void main(String[] args) {
        System.out.println(AircraftEnum.A);
        AircraftEnum instance = AircraftEnum.A;
        System.out.println(instance.bookSeat("1A"));
        System.out.println(instance.bookSeat("2A"));
    }
}
