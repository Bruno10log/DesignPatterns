package design.patterns.factory;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    public String getSymbol() {
        return "R$";
    }
}

class Euro implements Currency {
    public String getSymbol() {
        return "€";
    }
}
