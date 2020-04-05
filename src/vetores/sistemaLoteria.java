package vetores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class sistemaLoteria {
	public static int number;
	public static int sorteio[];
	public static int contador;
	public static int result;
	public static int resposta;
	public static int resposta2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			sorteio = new int[3];
		try {
			do {
			for (contador = 0; contador < 3; contador++) {
				System.out.println("Digite o " + (contador + 1) + " numero da sorte de 0 a 38");
				     
				number= sc.nextInt();
                
				if (number <= 38 && number >= 0) {

					sorteio[contador] = number;
				} else {
					System.out.println("Apenas numeros de 0 a 38");

					
				}
					if (sorteio[contador] % 4 == 0) {
						result = result + sorteio[contador];
					}
				
			
				
			
			}
			
			if (result / 3 > 25) {
				System.out.println("Parabens!!!!! recebeu o premio maximo");
			}else {
				if(result/3 >=20 && result/3<=25) {
					System.out.println("Parabens!!!!! recebeu o premio comum");
				}else {
					if(result/3 <20) {
						System.out.println("Infelizmente nao recebeu nenhum premio,tente novamente");
					}
				}
			}
			System.out.println(result);
			
				System.out.println("Digite 1 para participar de um novo sorteio e 2 se deseja encerrar");
				resposta = sc.nextInt();
				if(resposta == 2 ) {
					System.out.println("Obrigado por participar,volte sempre");
			}else {
				if(resposta != 1 && resposta!=2) {
					do {
						System.out.println("Erro digite novamente");
						System.out.println("Digite 1 para participar de um novo sorteio e 2 se deseja encerrar");
						resposta = sc.nextInt();
						if(resposta == 2 ) {
							System.out.println("Obrigado por participar,volte sempre");
					}
					}while(resposta!=1 && resposta!=2);
					
				}
			}
				
			
			
			
			
			
		} while (resposta == 1 );
		}	catch(Exception e) {
				System.out.println("Erro!! Digite apenas numeros,reinicie o programa");
			}	
		sc.close();
	}

}
