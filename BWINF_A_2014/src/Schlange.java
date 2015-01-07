public class Schlange {
    int laenge = 0;
    int top;
    double[] inhaltf;

    public Schlange() {
        init();
    }

    public int get_int_laenge() {
        return laenge;
    }

    public double get_belegungs_laenge() {
        double aus = 0;
        int i;
        i = top;
        while (i < laenge) {
            aus = aus + inhaltf[i];
            i++;
        }
        return aus;
    }

    public void init() {
        inhaltf = new double[100];
    }

    public void append(double ein) {
        inhaltf[laenge] = ein;
        laenge++;
    }

    public int laenge() {
        return laenge;
    }

    double erase_head() {
        double aus;
        aus = inhaltf[top];
        if (top < laenge) {
            top++;
        }

        return aus;
    }

    String ausgeben() {
        int i = 0;
        String aus = "";
        while (i < laenge) {
            aus = aus + inhaltf[i] + " ";
            i++;
        }
        return aus;
    }
}
