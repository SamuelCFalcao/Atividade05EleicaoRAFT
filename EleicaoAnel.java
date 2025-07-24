public class EleicaoAnel
{
    public static void main(String[] args) 
    {
        int[] processos = {1, 2, 3, 4, 5};
        boolean[] ativos = {true, true, true, true, false};

        System.out.println("Coordenador original (P5) falhou");

        int novoCoordenador = -1;
        System.out.println("P2 iniciou a eleição.");

        for (int i = 0; i < processos.length; i++) 
        {
            if (ativos[i]) 
            {
                System.out.println("P" + processos[i] + " está ativo.");
                if (processos[i] > novoCoordenador) 
                {
                    novoCoordenador = processos[i];
                }
            }
        }

        System.out.println("Novo coordenador eleito: P" + novoCoordenador);
    }
}