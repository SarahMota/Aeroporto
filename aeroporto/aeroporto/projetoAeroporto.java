package aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/*import java.util.Queue;
import java.util.LinkedList;*/

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
    class Passageiro {
        String nome;
        int idade;
        String cpf;
        String email;

        Passageiro(String nome, int idade, String cpf, String email) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.email = email;
        }
    }

    public class projetoAeroporto {
        List<Voo> voos;
        boolean adminLogado;
        Stack<Passageiro> passageirosCheckIn;
    
    public projetoAeroporto() {
        voos = new ArrayList<>();
        adminLogado = false;
        passageirosCheckIn = new Stack<>();
    }
    
    public void loginComoAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha do administrador: ");
        if (scanner.hasNextLine()) {
         String senha = scanner.nextLine();
         if ("1234".equals(senha)) {
            adminLogado = true;
            System.out.println("Logado como administrador.");
        } else {
            System.out.println("Senha incorreta.");
        }   
        } else {
            scanner.close();
        }
    }
        public void criarVoo(String numeroVoo, String origem, String destino, String horarioPartida, String horarioChegada, int maxPassageiros) {
        Voo voo = new Voo(numeroVoo, origem, destino, horarioPartida, horarioChegada, maxPassageiros);
        voos.add(voo);
        System.out.println("Voo " + numeroVoo + " criado.");
    }

    public void reservarVoo(String numeroVoo, Passageiro passageiro) {
        for (Voo voo : voos) {
            if (voo.numeroVoo.equals(numeroVoo)) {
                voo.reservasPendentes.add(passageiro);
                System.out.println("Reserva pendente para o voo " + numeroVoo);
                return;
            }
        }
        System.out.println("Voo não encontrado.");
    }
    public void processarReservas(String numeroVoo) {
        if (adminLogado) {
            for (Voo voo : voos) {
                if (voo.numeroVoo.equals(numeroVoo)) {
                   voo.passageiros.addAll(voo.reservasPendentes);
                    voo.reservasPendentes.clear();
                    System.out.println("Reservas processadas para o voo " + numeroVoo);
                    return;
                }
            }
            System.out.println("Voo não encontrado.");
        } else {
            System.out.println("Login de administrador necessário.");
        }
    }
    public void fazerCheckIn(String numeroVoo, Passageiro passageiro) {
        for (Voo voo : voos) {
            if (voo.numeroVoo.equals(numeroVoo) && voo.passageiros.contains(passageiro)) {
                passageirosCheckIn.push(passageiro);
                System.out.println(passageiro.nome + " fez check-in para o voo " + numeroVoo);
                return;
            }
        }
        System.out.println("Passageiro não encontrado ou não reservou este voo.");
    }

    public void mostrarInfoVoo(String numeroVoo) {
        for (Voo voo : voos) {
            if (voo.numeroVoo.equals(numeroVoo)) {
                System.out.println("Voo: " + voo.numeroVoo);
                System.out.println("Origem: " + voo.origem);
                System.out.println("Destino: " + voo.destino);
                System.out.println("Horário de Partida: " + voo.horarioPartida);
                System.out.println("Horário de Chegada: " + voo.horarioChegada);
                System.out.println("Max Passageiros: " + voo.maxPassageiros);
                System.out.print("Passageiros: ");
                for (Passageiro passageiro : voo.passageiros) {
                    System.out.print(passageiro.nome + ", ");
                }
                System.out.println();
                System.out.print("Reservas Pendentes: ");
                for (Passageiro passageiroPendente : voo.reservasPendentes) {
                    System.out.print(passageiroPendente.nome + ", ");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Voo não encontrado."); 
    }
     public static void main(String[] args) {
        Plane sistema = new Plane();
        Scanner scanner = new Scanner(System.in);
}
    
}
