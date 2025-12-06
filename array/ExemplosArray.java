package br.com.edvalmor.array;

public class ExemplosArray {
    public static void main(String[] args) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray();
        percorrendoArray2();
        arrayBidimensional();
    }

    private static void arrayBidimensional() {
        System.out.println("***** ARRAY BIDIMENSIONAL ******");
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 ={{1,2}, {3}, {4,5,6}};

        System.out.println("Valores no array1 passados na linha: ");
        output(array1);
        System.out.println("Valores no array2 passados na linha: ");
        output(array2);
    }

    private static void output(int[][] array) {
        for(int linha = 0; linha < array.length; linha++) {
            for( int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println("");
        }
    }

    private static void percorrendoArray2() {
        System.out.println("****** PERCORRENDO ARRAY2 ******");
        int[] array = {87,68,52,5,49,83,45,12,64};
        int i = 0;
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }

    private static void percorrendoArray() {
        System.out.println("****** PERCORRENDO ARRAY *******");
        int [] array = {87,68,52,5,49,83,45,12,64};
        int i = 0;

        for (int j : array) {
            i += j;
        }

        System.out.println("Soma dos elementos no array: " + i);
    }

    private static void tamanhoArray() {
        System.out.println("****** TAMANHO ARRAY ******");
        int[] array1 = {12,3,5,68,9,6,73,44,456,65,321};
        int[] array2 = {43,42,4,8,55,21,2,45};

        if(array2.length > 8) {
            System.out.println("Tamanho do ArrayDois - Maior que 8");
        } else {
            System.out.println("Tamanho do ArrayDois - Menor que 8");
        }

        System.out.println("\nTamanho do ArrayUm = " + array1.length);
    }

    private static void declaracaoArray() {
        System.out.println("****** DECLARAÇÃO ARRAY ******");
        //FORMAS DE DECLARAÇÃO DE ARRAY
        int[] a = new int[4];
        int[] b;
        b = new int[10];
        int[] r = new int[44], k = new int[23];
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
        int[] meuArray;
        meuArray = new int[10];

        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 70;
        meuArray[3] = 125;
        meuArray[4] = 200;
        meuArray[5] = 180;
        meuArray[6] = 60;
        meuArray[7] = 55;
        meuArray[8] = 40;
        meuArray[9] = 25;

        System.out.println(meuArray[9]);

    }


}
