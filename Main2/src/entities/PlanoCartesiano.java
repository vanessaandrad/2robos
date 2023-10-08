package entities;

public class PlanoCartesiano {
	String ANSI_RESET = "\u001B[0m";
	String ANSI_RED = "\u001B[31m";
	String ANSI_PURPLE = "\u001B[35m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_YELLOW = "\u001B[33m";
	String ANSI_CYAN = "\u001b[36m";

	public void imprimirPlanoCartesiano(int tamanho, int xRobo1, int yRobo1, int xRobo2, int yRobo2, int xAlimento,
			int yAlimento, String cor1, String cor2) {
		for (int i = tamanho - 1; i >= 0; i--) {
			for (int j = 0; j < tamanho; j++) {
				if (i == yRobo1 && j == xRobo1) {
					if (cor1.equalsIgnoreCase("azul")) {
						System.out.print(ANSI_CYAN + "R " + ANSI_RESET);
					} else if (cor1.equalsIgnoreCase("roxo")) {
						System.out.print(ANSI_PURPLE + "R " + ANSI_RESET);
					} else if (cor1.equalsIgnoreCase("amarelo")) {
						System.out.print(ANSI_YELLOW + "R " + ANSI_RESET);
					} else {
						System.out.print(ANSI_GREEN + "R " + ANSI_RESET);
					}
				} else if (i == yRobo2 && j == xRobo2) {
					if (cor2.equalsIgnoreCase("azul")) {
						System.out.print(ANSI_CYAN + "R " + ANSI_RESET);
					} else if (cor2.equalsIgnoreCase("roxo")) {
						System.out.print(ANSI_PURPLE + "R " + ANSI_RESET);
					} else {
						System.out.print(ANSI_GREEN + "R " + ANSI_RESET);
					}
				} else if (i == yAlimento && j == xAlimento) {
					System.out.print(ANSI_RED + "A " + ANSI_RESET);
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void imprimirPlanoCartesianoInicial(int tamanho, int xRobo1, int yRobo1, int xRobo2, int yRobo2,
			int xAlimento, int yAlimento, String cor1, String cor2) {
		for (int i = tamanho - 1; i >= 0; i--) {
			for (int j = 0; j < tamanho; j++) {
				if (xRobo1 == xRobo2 && yRobo1 == yRobo2 && i == yRobo1 && j == xRobo1) {
					System.out.print("R ");
				} else if (i == yAlimento && j == xAlimento) {
					System.out.print(ANSI_RED + "A " + ANSI_RESET);
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}