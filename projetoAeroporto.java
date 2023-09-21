package src.aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class projetoAeroporto {
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
    }

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
}

