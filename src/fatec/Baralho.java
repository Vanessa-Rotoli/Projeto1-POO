package fatec;
import java.util.ArrayList;
import java.util.Collections;


public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();


    public Baralho(){
        montar();
        embaralhar();
        exibir();
    }


    private void montar(){
        for (Naipe n:Naipe.values()) {
            for (Valor v:Valor.values()) {
                Carta c = new Carta();
                c.setNaipe(n);
                c.setValor(v);
                cartas.add(c);
            }
        }
    }


    private void embaralhar(){
        Collections.shuffle(cartas);
    }


    private void exibir(){
        for (Carta carta : cartas) System.out.println(carta.toString());
    }
}
