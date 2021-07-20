public class Fila {

    private int[] pq;
    private int[] qp;
    private int n;


    public Fila(int max){
        pq = new int[max + 1];
        qp = new int[max];
        n = 0;
    }

    public void insere(int vertice, int[] custos){
        qp[vertice] = ++n;
        pq[n] = vertice;
        fixUp(n,custos);
    }

    public int PQdelmin(int[] custos){
        exch(1,n,custos);
        --n;
        fixDown(1, custos);
        return pq[n+1];
    }

    public void PQdec(int w, int custos[]){
        fixUp(qp[w], custos);
    }

    public void exch(int i, int j, int[] custos){
        int t;
        t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    public void fixUp(int m,int[] custos){
        while(m > 0 && custos[pq[m/2]] > custos[pq[m]]){
            exch(m/2,m,custos);
            m = m/2;
        }
    }

    public void fixDown(int i, int[] custos){
        int j;
        while(2*i <= n){
            j = 2*i;
            if (j < n && custos[pq[j]] > custos[pq[j+1]]){
                j++;
            }
            if (custos[pq[i]] <= custos[pq[j]]) break;
            exch(i,j,custos);
            i = j;
        }
    }

    public boolean PQEmpty(){
        return n == 0;
    }
}
