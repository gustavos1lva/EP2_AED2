import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Digrafo {

    int v = 0;
    private int a = 0;
    Vertice[] vertices;

    public Digrafo(int v){
        this.v = v;
        vertices = new Vertice[v];
        inicializaVertices();
    }

    public void inicializaVertices(){
        for (int i = 0; i < v; i++){
            this.vertices[i] = new Vertice();
        }
    }

    public void insercaoAleatoria(int n, double p, int k){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j) continue;
                boolean random = (Math.random() < p) ? true : false;
                if (random){
                    Random fodase = new Random();
                    int c = fodase.nextInt(k - 0);
                    vertices[i].getArcos().add(new Arco(i , j, c));
                    a++;
                } 
            }
        }
    }

    public void mostraDigrafo(){
        for (int i = 0; i < vertices.length; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < vertices[i].getArcos().size(); j++) {
                if (j == 0) {
                    System.out.println("Vertice: " + vertices[i].getArco(j).verticeInicio);
                    System.out.println("Endereços dos Arco: " + vertices[i].getArcos());
                    System.out.println("Qtd de Arcos dele: " + vertices[i].getArcos().size());
                }
                System.out.println("Arco " + j + " vai pro vertice:" + vertices[i].getArco(j).verticeDestino);
                System.out.println("Peso dessa aresta: " + vertices[i].getArco(j).peso);
            }
        }
    }

    public void varreduraVertice(Digrafo di, int vert) {
        int[] posicao = new int[v];
        int contador = 0;
        int atual;
        for (int i : posicao) posicao[i] = -1;
        Fila fila = new Fila(di);

        posicao[vert] = contador++;
        fila.insere(vert);
        while (!fila.filaVazia()) {
            atual = fila.removeMenorPrioridade();

            for (int j = 0; j < v; j++) {
                for (int m = 0; m < di.vertices[atual].getArcos().size(); m++) {
                    if (di.vertices[atual].getArco(m).verticeDestino == j && posicao[j] == -1) {//completar verificando se um arco existe.
                        posicao[j] = contador++;
                        fila.insere(j);
                    }
                }
            }
        }
    }

    public int getV(){
        return v;
    }
}
