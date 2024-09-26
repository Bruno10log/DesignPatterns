package design.patterns.singleton;

import java.util.HashSet;
import java.util.Set;

public enum AircraftEnum {
    A;
    private final Set<String> seats;

    AircraftEnum() {
        seats = new HashSet<>();
        seats.add("1A");
        seats.add("2B");
    }

    public boolean bookSeat(String seat) {
        return seats.remove(seat);
    }
}
