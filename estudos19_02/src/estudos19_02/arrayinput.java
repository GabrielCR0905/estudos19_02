package estudos19_02;


import java.util.Scanner;

public class arrayinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];
		
		System.out.print("Digite 5 numeros:");
		for(int i = 0; i <5; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		System.out.print("Numeros Digitados");
		for (int num: numeros) {
			System.out.print(num +"");
		}
		
		scanner.close();
	}

}
