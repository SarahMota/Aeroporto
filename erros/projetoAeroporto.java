package src.Aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Voo {
    String numeroVoo;
    String origem;
    String destino;
    String horarioPartida;
    String horarioChegada;
    int maxPassageiros;
 

    public Voo(String numeroVoo, String origem, String destino, String horarioPartida, String horarioChegada, int maxPassageiros) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.maxPassageiros = maxPassageiros;
    
    }
}

