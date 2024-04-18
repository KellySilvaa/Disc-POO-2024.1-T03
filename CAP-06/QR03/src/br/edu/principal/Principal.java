package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        
        int[] vet1 = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
        int[] vet2 = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
        int[] vet3 = new int[20];
        
        int j = 0;
        for (int i = 0; i < 10; i++) {
            vet3[j] = vet1[i];
            j++;
            vet3[j] = vet2[i];
            j++;
        }
        
        System.out.println("Vetor resultante da intercalação:");
        for (int num : vet3) {
            System.out.print(num + " ");
        }
    }
}
