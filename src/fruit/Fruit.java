package fruit;

public class Fruit {
    //Definition av en attribut
    //private datatyp variabelnamn

    private String color;

    //Attributen som definieras i konstruktorn heter color och är fruktens färg

    //Definition av en konstruktor med parameter
    //public klassNamn(datatyp variabelnamn) { }
    public Fruit(String myColor) {
        color = myColor;

    }

    public String getColor() {
        return color;
    }
}
