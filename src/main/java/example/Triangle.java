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

        boolean result = false;
        if((Ea <= 0)||(Eb <= 0)||(Ec <= 0)) {
            return false;
        }

        if((Ea == Eb) && (Eb == Ec)){
            return true;
        }

        if(((Ea+Eb)> Ec)&&((Ea+Ec)>Eb)&&((Eb+Ec)>Ea)){
            return true;
        }

        return result;
    }

}
