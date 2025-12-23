package anotacoes.capitulo01;

public class BuscaBinaria {

    public static Integer pesquisaBinaria(int[] lista, int item) {
        int baixo = 0;
        int alto = (lista.length - 1);

        while (baixo <= alto) {
            // declara o meio e o chute (que começa pelo meio)
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            // Caso de acerto, boa pratica matar o caso de primeira.
            if (chute == item) {
                return meio;
            }

            // Ajustes caso não ache
            if (chute > item) {
                alto = meio - 1;
            } // se não é maior só pode ser menor
            else {
                baixo = meio + 1;
            }

        }
        // se sair do loop, o item não existe na lista
        return null;
    }

    public static void main(String[] args) {
        int[] minhaLista = { 1, 3, 5, 7, 9 };

        System.out.println("Busca pelo 3: " + pesquisaBinaria(minhaLista, 3));
        System.out.println("Busca pelo -1: " + pesquisaBinaria(minhaLista, -1));
    }

}
