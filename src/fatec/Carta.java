package fatec;

public class Carta {
    private Valor valor;
    private Naipe naipe;


    public Valor getValor() {
        return valor;
    }


    public void setValor(Valor valor) {
        this.valor = valor;
    }


    public Naipe getNaipe() {
        return naipe;
    }


    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }


    public String toString(){
        return getValor()+" - "+getNaipe();
    }
}