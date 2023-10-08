
package application;

import java.util.Scanner;

import entities.PlanoCartesiano;
import entities.Robo;
import entities.Tela;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		Tela tela = new Tela();
		tela.printTela();
		System.out.print("Digite a cor do robô 1: ");
		String cor1 = scan.nextLine();
		System.out.print("Digite a cor do robô 2: ");
		String cor2 = scan.nextLine();
		Robo robo1 = new Robo(0, 0, cor1);
		Robo robo2 = new Robo(0, 0, cor2);
		PlanoCartesiano plano = new PlanoCartesiano();

		System.out.println("Digite a posição do alimento:");
		System.out.print("X: ");
		int xAlimento = scan.nextInt();
		System.out.print("Y: ");
		int yAlimento = scan.nextInt();
		scan.nextLine();
		int tamanho = 5;
		plano.imprimirPlanoCartesianoInicial(tamanho, robo1.getX(), robo1.getY(), robo2.getX(), robo2.getY(), xAlimento, yAlimento, cor1, cor2);

		while (!(xAlimento == robo1.getX() && yAlimento == robo1.getY()) && !(xAlimento == robo2.getX() && yAlimento == robo2.getY())) {
			int movimentoRobo1 = random.nextInt(4) + 1;
			int movimentoRobo2 = random.nextInt(4) + 1;
			
			System.out.print("Jogada do robô 1: ");
			robo1.moverRobo(movimentoRobo1);
			tela.mostrarTransicao(1000);
			if(robo1.verificarPosicao(xAlimento, yAlimento, xAlimento, yAlimento) == true) {
				System.out.printf("O robô 1 encontrou o alimento em %d movimentos válidos e %d movimentos inválidos", robo1.getContadorMovimentosValidosRobo(), robo1.getContadorMovimentosInvalidosRobo());
				System.out.println();
				System.out.printf("O robô 2 teve %d movimentos válidos e %d movimentos inválidos", robo2.getContadorMovimentosValidosRobo(), robo2.getContadorMovimentosInvalidosRobo());
				plano.imprimirPlanoCartesiano(tamanho, robo1.getX(), robo1.getY(), robo2.getX(), robo2.getY(), xAlimento, yAlimento, cor1, cor2);
				System.exit(0);
			}
			System.out.print("Jogada do robô 2: ");
			robo2.moverRobo(movimentoRobo2);
			tela.mostrarTransicao(1000);
			if(robo2.verificarPosicao(xAlimento, yAlimento, xAlimento, yAlimento) == true) {
				System.out.printf("O robô 2 encontrou o alimento em %d movimentos válidos e %d movimentos inválidos", robo2.getContadorMovimentosValidosRobo(), robo2.getContadorMovimentosInvalidosRobo());
				System.out.println();
				System.out.printf("O robô 1 teve %d movimentos válidos e %d movimentos inválidos\n", robo1.getContadorMovimentosValidosRobo(), robo1.getContadorMovimentosInvalidosRobo());
				tela.mostrarTransicao(1000);
				plano.imprimirPlanoCartesiano(tamanho, robo1.getX(), robo1.getY(), robo2.getX(), robo2.getY(), xAlimento, yAlimento, cor1, cor2);
				System.exit(0);
			}
		}
		scan.close();
	}
}