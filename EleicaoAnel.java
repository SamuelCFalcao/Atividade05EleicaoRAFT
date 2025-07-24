import java.util.*;

class Processo {
    int id;
    boolean ativo;

    Processo(int id) {
        this.id = id;
        this.ativo = true;
    }
}

public class EleicaoSimples {
    static List<Processo> processos = new ArrayList<>();
    static int coordenador = -1;

    public static void main(String[] args) {
        // Criar 5 processos com IDs 1 a 5
        for (int i = 1; i <= 5; i++) {
            processos.add(new Processo(i));
        }

        coordenador = 5; // Processo com maior ID é o coordenador inicial
        System.out.println("Coordenador inicial: P" + coordenador);

        // Simula falha no coordenador
        processos.get(4).ativo = false; // ID 5 -> índice 4
        System.out.println("P5 falhou!");

        // Processo 2 (ID 3) inicia eleição
        iniciarEleicao(3);
    }

    public static void iniciarEleicao(int idIniciador) {
        System.out.println("P" + idIniciador + " iniciou a eleição.");

        int novoCoordenador = -1;

        // Verifica todos os processos ativos
        for (Processo p : processos) {
            if (p.ativo) {
                System.out.println("P" + p.id + " está ativo.");
                if (p.id > novoCoordenador) {
                    novoCoordenador = p.id;
                }
            }
        }

        coordenador = novoCoordenador;
        System.out.println("Novo coordenador eleito: P" + coordenador);
    }
}