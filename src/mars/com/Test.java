package mars.com;

import java.util.Scanner;

public class Test {
	
	public static void main(String args []){
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		System.out.println("Entre com o tamanho máximo de X do platô: ");
		int xMax = reader.nextInt(); // Scans the next token of the input as an int.
		
		System.out.println("Entre com o tamanho máximo de Y do platô: ");
		int yMax = reader.nextInt();
		
		System.out.println("Entre com o número de robôs que estarão trabalhando no platô: ");
		int n = reader.nextInt();
		
		for(int i = 1; i <= n; i++){ //Executa todos robôs
			
			System.out.println("Entre com a posição x do robô "+i+": ");
			int x = reader.nextInt();
			
			System.out.println("Entre com a posição y do robô "+i+": ");
			int y = reader.nextInt();
			
			System.out.println("Entre com o posicionamento do robô "+i+" de acordo com os pontos cardeais (Norte=N, Sul=S, Leste=E, Oeste=W): ");
			String p = reader.next(); 
			
			// Se entrar em algum caso inválido entra no loop até o usuario entrar um dos caracteres corretos
			while(!p.equalsIgnoreCase("N") && !p.equalsIgnoreCase("S") && !p.equalsIgnoreCase("E") && !p.equalsIgnoreCase("W")){
				System.out.println("Posicionamento inválido... (Norte=N, Sul=S, Leste=E, Oeste=W)");
				p = reader.next();
			}
			
			Rover wally = new Rover(x, y, p, xMax, yMax); // Cria o Objeto robô
			
			System.out.println("Entre com os comandos que serão executados pelo robô "+i+" (Mover=M, Girar Esquerda=L, Girar Direita=R): ");
			String commands = reader.next();
			
			code(commands, wally); // chama o método responsável por executar os comandos
			
			result(wally, i); // Imprime a posição final do robô
		}
	}
	
	public static void code(String command, Rover r){
		for (int i = 0; i < command.length(); i++){
			
			char c = command.charAt(i); // Pega os comandos um por um em sequencia
			
			if( c == 'M' || c == 'm'){
				r.move();
			}
			else if( c == 'L' || c == 'l'){
				r.left();
			}
			else if( c == 'R' || c == 'r'){
				r.right();
			}
			else { // Ignora um comando inválido e continua a execução.
				System.out.println("Comando "+ c +" inválido. Executando próximo comando...");
			}
		}
	}
	
	public static void result(Rover r, int i){
		System.out.println("a posição final do Robô "+i+ " é X = " +r.getX()+", Y = "+r.getY()+", posicionamento = "+r.getPosition());
	}

}
