package mars.com;

import java.util.Scanner;

public class Test {
	
	public static void main(String args []){
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		System.out.println("Entre com o tamanho m�ximo de X do plat�: ");
		int xMax = reader.nextInt(); // Scans the next token of the input as an int.
		
		System.out.println("Entre com o tamanho m�ximo de Y do plat�: ");
		int yMax = reader.nextInt();
		
		System.out.println("Entre com o n�mero de rob�s que estar�o trabalhando no plat�: ");
		int n = reader.nextInt();
		
		for(int i = 1; i <= n; i++){ //Executa todos rob�s
			
			System.out.println("Entre com a posi��o x do rob� "+i+": ");
			int x = reader.nextInt();
			
			System.out.println("Entre com a posi��o y do rob� "+i+": ");
			int y = reader.nextInt();
			
			System.out.println("Entre com o posicionamento do rob� "+i+" de acordo com os pontos cardeais (Norte=N, Sul=S, Leste=E, Oeste=W): ");
			String p = reader.next(); 
			
			// Se entrar em algum caso inv�lido entra no loop at� o usuario entrar um dos caracteres corretos
			while(!p.equalsIgnoreCase("N") && !p.equalsIgnoreCase("S") && !p.equalsIgnoreCase("E") && !p.equalsIgnoreCase("W")){
				System.out.println("Posicionamento inv�lido... (Norte=N, Sul=S, Leste=E, Oeste=W)");
				p = reader.next();
			}
			
			Rover wally = new Rover(x, y, p, xMax, yMax); // Cria o Objeto rob�
			
			System.out.println("Entre com os comandos que ser�o executados pelo rob� "+i+" (Mover=M, Girar Esquerda=L, Girar Direita=R): ");
			String commands = reader.next();
			
			code(commands, wally); // chama o m�todo respons�vel por executar os comandos
			
			result(wally, i); // Imprime a posi��o final do rob�
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
			else { // Ignora um comando inv�lido e continua a execu��o.
				System.out.println("Comando "+ c +" inv�lido. Executando pr�ximo comando...");
			}
		}
	}
	
	public static void result(Rover r, int i){
		System.out.println("a posi��o final do Rob� "+i+ " � X = " +r.getX()+", Y = "+r.getY()+", posicionamento = "+r.getPosition());
	}

}
