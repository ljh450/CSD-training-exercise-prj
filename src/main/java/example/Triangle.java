package example;

import sun.font.TrueTypeFont;

public class Triangle {
    private float Ea,Eb,Ec;

    public Triangle(float a, float b, float c) {
        this.Ea = a;
        this.Eb = b;
        this.Ec = c;
    }

    public boolean isAvailable() {
        return false;
    }

}
