package br.com.luizfernando;

public class Main {
    static void main() {
        System.out.println(somaArray(new int[]{1, 2, 3, 4, 5}));
    }

    private static Integer somaArray(int[] array) {
        int soma = 0;

        for (int n : array) {
            soma += n;
        }

        return soma;
    }
}
