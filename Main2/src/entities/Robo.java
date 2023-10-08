package entities;

import Exception.MovimentoInvalidoException;

public class Robo {
	String ANSI_RESET = "\u001B[0m";
	String ANSI_RED = "\u001B[31m";
	String ANSI_GREEN = "\u001B[32m";
	protected int x;
	protected int y;
	protected String cor;
	protected int contadorMovimentosValidosRobo = 0;
	protected int contadorMovimentosInvalidosRobo = 0;

	public Robo() {
	}

	public Robo(int x, int y) {
		this.x = 0;
		this.y = 0;
	}

	public Robo(int x, int y, String cor) {
		this.x = 0;
		this.y = 0;
		this.cor = cor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getContadorMovimentosValidosRobo() {
		return contadorMovimentosValidosRobo;
	}

	public void setContadorMovimentosValidosRobo(int contadorMovimentosValidosRobo) {
		this.contadorMovimentosValidosRobo = contadorMovimentosValidosRobo;
	}

	public int getContadorMovimentosInvalidosRobo() {
		return contadorMovimentosInvalidosRobo;
	}

	public void setContadorMovimentosInvalidosRobo(int contadorMovimentosInvalidosRobo) {
		this.contadorMovimentosInvalidosRobo = contadorMovimentosInvalidosRobo;
	}
	
	public void moverRobo(String direcao) {
		if (direcao.equalsIgnoreCase("up")) {
			try {
				if (y == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais alta"+ANSI_RESET);
				} else {
					y++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (direcao.equalsIgnoreCase("down")) {
			try {
				if (y == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais baixa!"+ANSI_RESET);
				} else {
					y--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (direcao.equalsIgnoreCase("right")) {
			try {
				if (x == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais à direita!"+ANSI_RESET);
				} else {
					x++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (direcao.equalsIgnoreCase("left")) {
			try {
				if (x == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais à esquerda!"+ANSI_RESET);
				} else {
					x--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else {
			System.out.println(ANSI_RED+"Movimento inválido!"+ANSI_RESET);
		}
	}

	public void moverRobo(int numero) {
		if (numero == 1) {
			try {
				if (y == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais alta!"+ANSI_RESET);
				} else {
					y++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (numero == 2) {
			try {
				if (y == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais baixa!"+ANSI_RESET);
				} else {
					y--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (numero == 3) {
			try {
				if (x == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais à direita!"+ANSI_RESET);
				} else {
					x++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (numero == 4) {
			try {
				if (x == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException(ANSI_RED+"Movimento inválido: você já está na posição mais à esquerda!"+ANSI_RESET);
				} else {
					x--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else {
			System.out.println(ANSI_RED+"Movimento inválido!"+ANSI_RESET);
			contadorMovimentosInvalidosRobo++;
		}
	}

	public boolean verificarPosicao(int x, int y, int xAlimento, int yAlimento) {
		if (getX() == xAlimento && getY() == yAlimento) {
			System.out.println(ANSI_GREEN+"Alimento encontrado!"+ANSI_RESET);
			return true;
		} else {
			return false;
		}
	}
}