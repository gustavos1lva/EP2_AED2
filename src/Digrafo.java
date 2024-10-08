/*
    EP2 AED2 - Turma 94 - Alexandre Freire
    Gustavo Ryan Nascimento Silva - 11796785
    Bruno Daniel Moreira Plada - 11796274
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

    public void insercaoAleatoria(double p, int k){
        this.k = k;
        for (int i = 0; i < v-1; i++){
            for (int j = 0; j < v; j++){
                if (i == j) continue;
                boolean random = (Math.random() < p) ? true : false;
                if (random){
                    Random f = new Random();
                    int c = (int) Math.floor(Math.random()*(k-0+1)+0);
                    vertices[i].add(new Arco(i , j, c));
                    a++;
                }
            }
        }
    }

    public void insercaoAleatoriaDAG(double p, int k){
        this.k = k;
        for (int i = 0; i < v-1; i++){
            for (int j = i+1; j < v; j++){
                if (i == j) continue;
                boolean random = (Math.random() < p) ? true : false;
                if (random){
                    Random f = new Random();
                    int c = (int) Math.floor(Math.random()*(k-0+1)+0);
                    vertices[i].add(new Arco(i , j, c));
                    a++;
                }
            }
        }
    }

    public void imprimePesos(){
        for(int i = 0; i < vertices.length;i++){
            System.out.print(i+": ");
            for(int j = 0; j < vertices[i].size(); j++){
                System.out.print(vertices[i].get(j).peso + " ");
            }
            System.out.println("");
        }
    }

    public void mostraDigrafo(){
        for (int i = 0; i < vertices.length; i++) {
            System.out.println("-----------------------------------------");
            if(vertices[i].size() != 0){
                for (int j = 0; j < vertices[i].size(); j++) {
                    if (j == 0) {
                        System.out.println("Vertice: " + i);
                        System.out.println("Endereços das arestas: " + vertices[i]);
                        System.out.println("Qtd de arestas dele: " + vertices[i].size());
                    }
                    System.out.println("Aresta " + j + " vai pro vertice:" + vertices[i].get(j).verticeDestino);
                }
            } else {
                System.out.println("Vertice: " + i);
                System.out.println("Endereços das arestas: " + vertices[i]);
                System.out.println("Qtd de arestas dele: " + vertices[i].size());
            }
        }
    }
}
