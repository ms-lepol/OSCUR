class grille{
		
	private int hauteur;
	private int largeur;
	
	grille(){
		this.hauteur = 10;
		this.largeur = 10;
	}
		
	//retourne int entre 5 et 25
	int tailleRandom(){
		return (int)((Math.random()*21)+5);
	}
	
	
	//affiche la grille
	void afficherGrille(personnage[] playerList){
		char perso='x';
		Ecran.afficher("+");
		for(int j=0;j<largeur;j++){
			Ecran.afficher("-");	
		}
		Ecran.afficherln("+");
		for(int i=0;i<hauteur;i++){
			Ecran.afficher("|");
			for(int j=0;j<largeur;j++){
				for(int k=0;k<playerList.length;k++){
					if(playerList[k].getPosition().getX()==j && playerList[k].getPosition().getY() ==i){
						perso = playerList[k].getEquipe();
					}
				}
				if (perso!='x'){
					Ecran.afficher(perso);
				}else{
					Ecran.afficher("·");
				}	
				perso='x';
			}
			Ecran.afficherln("|");
		}
		Ecran.afficher("+");
		for(int j=0;j<largeur;j++){
			Ecran.afficher("-");	
		}
		Ecran.afficherln("+");
	}
	
}