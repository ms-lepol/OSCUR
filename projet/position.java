class position{
		
	private int x;
	private int y;
	
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
	
	position(){
		this.x = positionRandom(10);
		this.y = positionRandom(10);
	}
		
	//retourne int entre 0 et max
	int positionRandom(int max){
		return (int)(Math.random()*max);
	}
}