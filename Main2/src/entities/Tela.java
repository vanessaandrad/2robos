package entities;

import java.util.concurrent.TimeUnit;

public class Tela {
	String ANSI_RESET = "\u001B[0m";
	String ANSI_PURPLE = "\u001B[35m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_YELLOW = "\u001B[33m";
	String ANSI_CYAN = "\u001b[36m";

	public void printTela() {
		System.out.println(ANSI_YELLOW + "----------------------------------------");
		System.out.println("Bem-vindo ao Jogo do Robô!");
		System.out.println("----------------------------------------" + ANSI_RESET);
		System.out.println("Descrição do jogo:");
		System.out.println("Dois robôs se movem randomicamente em um plano cartesiano de tamanho 5x5.");
		System.out.println(
				"O usuário digita uma posição para o alimento e os dois robôs se movimentam em busca do alimento.");
		System.out.println(ANSI_YELLOW + "----------------------------------------" + ANSI_RESET);
		System.out.println("Instruções:");
		System.out.println("Escolha uma posição para o alimento e os dois robôs competirão!");
		System.out.println(ANSI_YELLOW + "----------------------------------------");
		System.out.println("Faça suas apostas e divirta-se!");
		System.out.println("----------------------------------------" + ANSI_RESET);
		System.out.println();
		System.out.println("Cores disponíveis para os robôs: ");
		System.out.println(ANSI_CYAN + "Azul" + ANSI_RESET);
		System.out.println(ANSI_PURPLE + "Roxo" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Verde" + ANSI_RESET);
		System.out.println();
	}

	public void mostrarTransicao(int tempo) {
	    try {
	        TimeUnit.MILLISECONDS.sleep(tempo);
	    } catch (InterruptedException ex) {
	    }
	}

}
