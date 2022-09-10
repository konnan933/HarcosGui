package main;


public class Karakter {
    private String tipus;
    private int eletero = 3;
    private int helyzet;
    private int tamadoEro;

    public Karakter(String tipus, int helyzet, int tamadoEro) {
        this.tipus = tipus;
        this.helyzet = helyzet;
        this.tamadoEro = tamadoEro;
    }

    public int getELETERO() {
        return eletero;
    }

    public int getHelyzet() {
        return helyzet;
    }

    public int getTamadoEro() {
        return tamadoEro;
    }
    

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setELETERO(int ELETERO) {
        this.eletero = ELETERO;
    }

    public void setHelyzet(int helyzet) {
        this.helyzet = helyzet;
    }

    public void setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
    }
    
    
    
}
