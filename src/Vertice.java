import java.util.LinkedList;
import java.util.List;

public class Vertice{
    private int prioridade = (int) Math.pow(10,900);
    private int valor = 0;
    private List<Arco> arcos;

    public Vertice() {
        arcos = new LinkedList();
    }

    public List<Arco> getArcos(){
        return arcos;
    }
    public Arco getArco(int i){
        return arcos.get(i);
    }

}
