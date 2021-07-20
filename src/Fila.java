public class Fila {
    private Vertice[] fila;
    private int inicio = 0;
    private int fim = 0;


    public Fila(Digrafo	di){
        this.fila= new Vertice[di.getV()];
    }

    public boolean filaVazia(){
        return inicio == fim;
    }

    public void insere(Vertice vertice){
        fila[fim++] = vertice;
    }

    //Garantir que a fila ta sempre organizada
    public Vertice removeMenorPrioridade(){
        Vertice resposta = null;

        int i = inicio;
        for (int j = i + 1; j < fim; j++){
            if (fila[i].getPrioridade() > fila[j].getPrioridade()){
                i = j;
            }
            resposta = fila[i];
            fila[i] = fila[--fim];
        }

        return resposta;
    }
}
