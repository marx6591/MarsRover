package mars.com;

public class Rover {
	int x;
	int y;
	String position;
	int xMax;
	int yMax;

	public Rover(int x, int y, String position, int xMax, int yMax){
		this.x = x;
		this.y = y;
		this.position = position;
		this.xMax = xMax;
		this.yMax = yMax;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void move(){
		if(this.position.equalsIgnoreCase("N")){
			if(this.y==yMax){ //verifica se o robô irá ultrapassar o limite do plato
				System.out.println("Robô, encontrou o limite do platô. Ele não se move");
			} else{
				this.y++; //move
			}
		}
		else if(this.position.equalsIgnoreCase("S")){
			if(this.y==0){ //verifica se o robô irá ultrapassar o limite do plato
				System.out.println("Robô, encontrou o limite do platô. Ele não se move");
			} else{
				this.y--;//move
			}
		}
		else if(this.position.equalsIgnoreCase("E")){
			if(this.x==xMax){ //verifica se o robô irá ultrapassar o limite do plato
				System.out.println("Robô, encontrou o limite do platô. Ele não se move");
			} else{
				this.x++;//move
			}
		}
		else if(this.position.equalsIgnoreCase("W")){
			if(this.y==0){ //verifica se o robô irá ultrapassar o limite do plato
				System.out.println("Robô, encontrou o limite do platô. Ele não se move");
			} else{
				this.x--;//move
			}
		}
	}
	
	public void left(){ // executa o movimento de rotação para a esquerda
		if(this.position.equalsIgnoreCase("N")){
			this.position = "W";
		}
		else if(this.position.equalsIgnoreCase("W")){
			this.position = "S";
		}
		else if(this.position.equalsIgnoreCase("S")){
			this.position = "E";
		}
		else if(this.position.equalsIgnoreCase("E")){
			this.position = "N";
		}
	}
		
	public void right(){ // executa o movimento de rotação para a direita
		if(this.position.equalsIgnoreCase("N")){
			this.position = "E";
		}
		else if(this.position.equalsIgnoreCase("E")){
			this.position = "S";
		}
		else if(this.position.equalsIgnoreCase("S")){
			this.position = "W";
		}
		else if(this.position.equalsIgnoreCase("W")){
			this.position = "N";
		}
	}
}
