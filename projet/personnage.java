class personnage extends position{
		
	
	private int habilite;
	private int force;
	private int armure;
	private int esquive;
	private int vie;
	private int resurrection;
	private boolean isAlive;
	private position position;
	private char equipe;
	
	position getPosition(){
		return position;
	}	
	
	char getEquipe(){
		return equipe;
	}
	
	personnage(){
		this.habilite = statRandom();
		this.force = statRandom();
		this.armure = statRandom();
		this.esquive = statRandom();
		this.vie = statRandom();
		this.resurrection = statRandom();
		this.isAlive = true;
		this.position = new position();
		this.equipe = genEquipe();
	}
		
	private char genEquipe(){
		if(Math.random()>=0.5){
			return 'A';
		}
		return 'B';
	}
	
	//retourne int entre 0 et 10
	private int statRandom(){
		return (int)(Math.random()*11);
	}
	
}