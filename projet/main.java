 class main {

	public static void main(String[] args) {
		personnage[] listPerso = new personnage[10];
		for(int i=0;i<10;i++){
			listPerso[i]=new personnage();
		}
		grille p=new grille();
		p.afficherGrille(listPerso);
		
	}	
 }