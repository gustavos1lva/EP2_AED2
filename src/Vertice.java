import java.util.LinkedList;
import java.util.List;

public class Vertice{
    private double prioridade = Math.pow(10,900);
    private int valor = 0;
    private List<Arco> arcos;

    public Vertice(int valor, int prioridade) {
        arcos = new LinkedList();
        this.valor = valor;
        this.prioridade = prioridade;
    }

    public List<Arco> getArcos(){
        return arcos;
    }
    public Arco getArco(int i){
        return arcos.get(i);
    }

    public int getPrioridade(){
        return prioridade;
    }
}
