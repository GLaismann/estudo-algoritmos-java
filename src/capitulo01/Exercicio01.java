package src.capitulo01;

import src.util.LogUtil;

public class Exercicio01 {

    public static void main(String[] args) {
        // EXERCICIO 1.1 --- Numa lista de 128 nomes, qual seria o número maximo de etapas que levaria
        // para encontrar o nome desejado?
        int tamanho = 128;

        
        int[] minhaLista = new int[tamanho];

        // log2 minhaLista.lenght
        double maxSteps = LogUtil.myLog(minhaLista.length, 2);

        System.out.println("1.1 - Números máximo de etapas que levaria para encontrar um número: " + maxSteps);

        // EXERCICIO 1.2 --- Máximo de etapas com o número duplicado.
        int novoTamanho = tamanho * 2;

        // Lista instanciada para pratica somente, não é necessário
        int [] novaLista = new int[novoTamanho];
        double newMaxSteps = LogUtil.myLog(novaLista.length, 2);

        System.out.println("1.2 - Números máximo de etapas que levaria para encontrar um número: " + newMaxSteps);

    }

}
