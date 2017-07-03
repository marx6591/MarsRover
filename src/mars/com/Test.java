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
			boolean pointer = false;
			int x = 0, y = 0;
			String p = "";
			
			while (pointer == false){ // loop para validar a entrada dos caracteres
				System.out.println("Entre com a posição x, y e o posicionamento(Norte=N, Sul=S, Leste=E, Oeste=W) do robô "+i+" separados por um espaço");
				System.out.println("Exemplo: 1 2 N");
				String part1 = reader.next(); 
				String part2  = reader.next(); 
				p = reader.next(); 
				
				// Se alguma entrada for inválida, entra no loop até o usuario entrar os caracteres corretos
				if((p.equalsIgnoreCase("N") || p.equalsIgnoreCase("S") || p.equalsIgnoreCase("E") || p.equalsIgnoreCase("W")) && verificaInt(part1) && verificaInt(part2)){
					x = Integer.parseInt(part1);
					y = Integer.parseInt(part2);
					pointer = true;
				} else {
					System.out.println("Entrada inválida... (Norte=N, Sul=S, Leste=E, Oeste=W)");
				}
				// Verifica se o robô está dentro da area de trabalho
				if(x > xMax || y > yMax){ 
					System.out.println("Entrada inválida... a posição do robô excede o tamanho máximo do local");
					pointer = false;
				}
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
	
	public static boolean verificaInt( String s ) {
	    // cria um array de char
	    char[] c = s.toCharArray();
	    boolean d = true;
	    for ( int i = 0; i < c.length; i++ ){
	        // verifica se o char não é um dígito
	        if ( !Character.isDigit( c[ i ] ) ) {
	            d = false;
	            break;
	        }
	    }
	    return d;
	}

}
