package zadTomka;

public class Student {
    int numerIdenksu;
    String imie;
    String naziwsko;
    int[] listaocen = new int[100];



    public int getNumerIdenksu() {
        return numerIdenksu;
    }

    public void setNumerIdenksu(int numerIdenksu) {
        this.numerIdenksu = numerIdenksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNaziwsko() {
        return naziwsko;
    }

    public void setNaziwsko(String naziwsko) {
        this.naziwsko = naziwsko;
    }

    public int[] getListaocen() {
        return listaocen;
    }

    public void setListaocen(int[] listaocen) {
        this.listaocen = listaocen;
    }



}
