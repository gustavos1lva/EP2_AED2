import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Digrafo {

    public int v = 0;
    public int a = 0;
    public int k = 0;
    public List<Arco>[] vertices;

    public Digrafo(int v){
        this.v = v;
        vertices = new LinkedList[v];
        inicializaVertices();
    }

    public void inicializaVertices(){
        for (int i = 0; i < v; i++){
            this.vertices[i] = new LinkedList<Arco>();
        }
    }

    public void insercaoAleatoria(int n, double p, int k){
        this.k = k;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j) continue;
                boolean random = (Math.random() < p) ? true : false;
                if (random){
                    Random f = new Random();
                    int c = f.nextInt(k - 0);
                    vertices[i].add(new Arco(i , j, k));
                    a++;
                }
            }
        }
    }

    public void mostraDigrafo(){
        for (int i = 0; i < vertices.length; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < vertices[i].size(); j++) {
                if (j == 0) {
                    System.out.println("Vertice: " + vertices[i].get(j).verticeInicio);
                    System.out.println("Endereços das arestas: " + vertices[i]);
                    System.out.println("Qtd de arestas dele: " + vertices[i].size());
                }
                System.out.println("Aresta " + j + " vai pro vertice:" + vertices[i].get(j).verticeDestino);
            }
        }
    }

}
