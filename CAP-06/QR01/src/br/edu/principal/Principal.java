package br.edu.principal;

public class Principal {
	public static void main(String[] args) {
		int[] num = new int[9];
		
		for (int i = 0; i < 9; i++) {
			
			num[i] = i + 1;
		}
		
		System.out.println("Números primos e suas respectivas posicões:");
		
		for (int i = 0; i < 9; i++) {
		     int cont = 0;
		     
		     for (int j = 1; j <= num[i]; j++) {
		    	 if (num[i] % j == 0) {
		    		 cont++;
		    	 }		    			
		     }
		     if (cont <= 2) {
			    System.out.println("Número primo: " + num[i] + ", posição: " + (i + 1));		
		}
	  }
   }
}