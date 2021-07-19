public class Fila {
    private int[] fila;
    private int contador = 0;
    public Fila(Digrafo	di){
        this.fila=new int[di.getV()];
        for(int i : fila) fila[i] = -1;
    }

    public boolean filaVazia(){
        if (this.contador==0) return true;
        return false;
    }

    public void insere(int vertice){
        fila[contador] = vertice;
        contador++;
    }

    public int proximo(){
        int resposta = this.fila[0];
        for(int i=0;i<contador;i++)fila[i] = fila[i+1];
        contador--;
        
        return resposta;
    }
}
