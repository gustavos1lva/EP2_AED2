public class Fila {
    private int[] fila;
    private int contador = 0;
    private int verticeMenorPrioridade = 0;

    public Fila(Digrafo	di){
        this.fila=new int[di.getV()];
        for(int i : fila) fila[i] = -1;
    }

    public boolean filaVazia(){
        if (this.contador==0) return true;
        return false;
    }

    public void insere(int vertice){
        if (filaVazia()) verticeMenorPrioridade = vertice;

        fila[contador] = vertice;
        contador++;
    }

    //Garantir que a fila ta sempre organizada
    public int removeMenorPrioridade(){
        int resposta = this.fila[contador];
        contador--;
        return resposta;
    }


}
