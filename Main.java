import java.util.ArrayList;
import java.util.Arrays;

//chaine.substring(10, 23)
public class Main {

	public static void main(String[] args) {
		
		String ligne1_arrets = "LYC�E_DE_POISY + POISY_COLL�GE N Vernod N Meythet_Le_Rabelais N Chorus N Mandallaz N GARE N France_Barattes N C.E.S._Barattes N VIGNI�RES N Ponchy N PARC_DES_GLAISINS";
		String ligne1_normal_sens1 = "LYC�E_DE_POISY - - - - - - - - - - - 7:43 7:52 - - - - - - - - - - - - - - - - - - - - - 12:42 - - - 13:26 - - - - - - - - - - - - - - - - - 17:11 - 17:35 - - - - - - - - - - POISY_COLL�GE 5:53 6:11 6:27 6:44 6:54 7:04 7:11 7:16 7:21 7:28 7:36 - - 8:04 8:16 8:27 8:38 8:51 9:02 9:15 9:28 9:43 9:58 10:13 10:28 10:43 10:57 11:11 11:25 11:39 11:54 12:05 12:18 12:31 - 12:59 13:12 13:20 - 13:39 13:52 14:06 14:20 14:34 14:46 14:59 15:12 15:26 15:40 15:53 16:07 16:17 16:30 16:41 16:53 17:03 - 17:25 - 17:44 17:54 18:07 18:20 18:36 18:52 19:07 19:24 19:41 19:57 Vernod 5:56 6:14 6:31 6:48 6:58 7:08 7:15 7:20 7:25 7:32 7:40 7:49 7:58 8:08 8:20 8:31 8:42 8:54 9:05 9:18 9:31 9:46 10:01 10:16 10:31 10:46 11:00 11:14 11:28 11:42 11:57 12:08 12:21 12:35 12:48 13:03 13:16 13:24 13:32 13:43 13:56 14:10 14:24 14:38 14:50 15:03 15:16 15:30 15:44 15:57 16:11 16:21 16:34 16:45 16:57 17:07 17:17 17:29 17:40 17:48 17:58 18:11 18:24 18:39 18:55 19:10 19:27 19:44 20:00 Meythet_Le_Rabelais 6:01 6:19 6:36 6:53 7:03 7:13 7:21 7:26 7:31 7:38 7:46 7:55 8:04 8:14 8:25 8:36 8:47 8:59 9:10 9:23 9:36 9:51 10:06 10:21 10:36 10:51 11:05 11:19 11:33 11:47 12:02 12:13 12:26 12:40 12:53 13:08 13:21 13:29 13:37 13:48 14:01 14:15 14:29 14:43 14:55 15:08 15:22 15:36 15:49 16:02 16:16 16:27 16:40 16:51 17:03 17:12 17:23 17:34 17:45 17:53 18:03 18:16 18:29 18:44 19:00 19:15 19:32 19:49 20:05 Chorus 6:07 6:25 6:42 6:59 7:09 7:19 7:27 7:33 7:38 7:45 7:53 8:03 8:13 8:23 8:33 8:44 8:55 9:06 9:17 9:30 9:43 9:57 10:12 10:27 10:42 10:57 11:11 11:25 11:39 11:53 12:08 12:19 12:32 12:46 12:59 13:14 13:27 13:35 13:43 13:54 14:07 14:21 14:35 14:49 15:01 15:14 15:28 15:42 15:56 16:09 16:23 16:34 16:47 16:58 17:10 17:21 17:32 17:43 17:54 18:02 18:12 18:23 18:35 18:50 19:06 19:21 19:37 19:54 20:10 Mandallaz 6:11 6:29 6:47 7:04 7:14 7:24 7:33 7:39 7:44 7:50 7:58 8:09 8:19 8:29 8:39 8:49 9:00 9:11 9:22 9:35 9:48 10:02 10:17 10:32 10:47 11:02 11:16 11:30 11:44 11:58 12:13 12:26 12:39 12:52 13:06 13:20 13:33 13:41 13:49 13:59 14:12 14:26 14:40 14:54 15:06 15:19 15:33 15:47 16:01 16:15 16:29 16:40 16:53 17:04 17:16 17:27 17:38 17:49 18:00 18:08 18:18 18:28 18:40 18:55 19:11 19:26 19:42 19:59 20:15 GARE 6:13 6:31 6:49 7:07 7:17 7:27 7:36 7:42 7:47 7:53 8:01 8:12 8:22 8:32 8:42 8:52 9:03 9:14 9:25 9:38 9:51 10:05 10:20 10:35 10:50 11:05 11:19 11:33 11:47 12:01 12:16 12:29 12:42 12:55 13:09 13:23 13:36 13:44 13:52 14:02 14:15 14:29 14:43 14:57 15:09 15:22 15:36 15:50 16:04 16:18 16:32 16:43 16:56 17:07 17:19 17:30 17:41 17:52 18:03 18:11 18:21 18:31 18:43 18:58 19:13 19:28 19:44 20:01 20:17 France_Barattes 6:18 6:36 6:54 7:13 7:25 7:35 7:44 7:50 7:55 8:01 8:09 8:20 8:30 8:40 8:50 8:59 9:10 9:21 9:32 9:45 9:58 10:12 10:28 10:43 10:58 11:13 11:27 11:41 11:55 12:09 12:24 12:36 12:49 13:02 13:17 13:31 13:44 13:52 14:00 14:10 14:23 14:37 14:51 15:06 15:18 15:31 15:45 15:59 16:13 16:27 16:41 16:52 17:05 17:16 17:28 17:39 17:50 18:01 18:12 18:20 18:30 18:39 18:51 19:06 19:21 19:35 19:51 20:07 20:22 C.E.S._Barattes 6:22 6:40 6:58 7:17 7:30 7:41 7:49 7:55 8:00 8:06 8:14 8:25 8:35 8:44 8:54 9:03 9:14 9:25 9:36 9:49 10:02 10:16 10:32 10:47 11:02 11:17 11:31 11:45 12:00 12:14 12:28 12:40 12:53 13:06 13:21 13:35 13:48 13:56 14:04 14:14 14:27 14:41 14:55 15:10 15:22 15:36 15:50 16:04 16:18 16:33 16:47 16:58 17:11 17:22 17:34 17:45 17:56 18:07 18:18 18:26 18:36 18:44 18:55 19:10 19:25 19:39 19:55 20:11 20:26 VIGNI�RES 6:25 6:43 7:01 7:20 7:33 7:44 7:53 7:59 8:03 8:09 8:17 8:28 8:38 8:47 8:57 9:06 9:17 9:28 9:39 9:52 10:05 10:19 10:35 10:50 11:05 11:20 11:34 11:48 12:03 12:17 12:31 12:43 12:56 13:09 13:24 13:38 13:51 13:59 14:07 14:17 14:30 14:44 14:58 15:13 15:25 15:39 15:53 16:07 16:21 16:37 16:50 17:01 17:14 17:25 17:37 17:48 17:59 18:10 18:21 18:29 18:39 18:47 18:58 19:13 19:28 19:42 19:58 20:14 20:29 Ponchy 6:29 6:47 7:05 7:24 7:37 7:48 7:57 8:03 8:07 8:14 8:22 8:33 8:42 8:51 9:01 - 9:21 9:32 - 9:56 - 10:23 - 10:54 - 11:24 11:38 11:52 12:07 12:21 12:35 12:47 13:00 13:13 13:28 13:42 - 14:03 14:11 14:21 14:34 14:48 15:02 15:17 15:29 15:44 15:57 16:12 - 16:42 - 17:06 - 17:30 - 17:52 - 18:14 - 18:33 18:43 18:51 19:02 19:17 19:32 19:46 20:02 20:18 20:33 PARC_DES_GLAISINS 6:36 6:54 7:12 7:33 7:46 7:57 8:06 8:12 8:16 8:23 8:31 8:42 8:51 9:00 9:09 - 9:29 9:40 - 10:04 - 10:31 - 11:02 - 11:32 11:46 12:00 12:15 12:29 12:43 12:55 13:08 13:21 13:36 13:50 - 14:11 14:19 14:29 14:42 14:56 15:10 15:25 15:37 15:53 16:06 16:21 - 16:52 - 17:16 - 17:39 - 18:01 - 18:23 - 18:42 18:52 18:59 19:10 19:25 19:40 19:53 20:09 20:25 20:40";
		String ligne1_normal_sens2 = "PARC_DES_GLAISINS 5:58 6:14 - 6:39 6:47 6:56 7:06 7:14 7:26 7:39 7:52 8:02 8:11 8:21 8:34 8:45 8:58 9:10 9:22 - 9:51 - 10:20 - 10:50 - 11:20 11:31 11:39 11:47 11:55 12:07 12:22 12:37 12:50 13:04 13:16 13:29 13:42 - 14:06 14:19 14:33 14:47 15:01 15:14 15:29 15:40 15:50 15:59 16:07 16:16 - 16:38 - 17:00 - 17:22 - 17:45 - 18:07 - 18:30 18:47 19:04 19:20 19:36 19:57 Ponchy 6:04 6:20 - 6:45 6:53 7:02 7:12 7:22 7:34 7:47 8:00 8:10 8:19 8:29 8:41 8:52 9:04 9:16 9:29 - 9:57 - 10:26 - 10:56 - 11:26 11:37 11:45 11:53 12:02 12:15 12:28 12:43 12:56 13:11 13:23 13:35 13:48 - 14:13 14:26 14:40 14:54 15:08 15:21 15:36 15:47 15:57 16:06 16:14 16:24 - 16:46 - 17:08 - 17:30 - 17:53 - 18:15 - 18:37 18:53 19:10 19:26 19:42 20:03 VIGNI�RES 6:08 6:24 6:37 6:49 6:57 7:07 7:17 7:27 7:39 7:52 8:05 8:15 8:25 8:35 8:46 8:57 9:09 9:21 9:34 9:48 10:02 10:16 10:31 10:46 11:01 11:16 11:31 11:42 11:50 11:58 12:07 12:20 12:33 12:48 13:01 13:16 13:28 13:40 13:53 14:04 14:18 14:31 14:45 14:59 15:13 15:26 15:41 15:52 16:02 16:11 16:19 16:29 16:40 16:52 17:03 17:14 17:25 17:36 17:47 17:59 18:09 18:20 18:31 18:42 18:58 19:15 19:30 19:46 20:07 C.E.S._Barattes 6:10 6:26 6:39 6:51 6:59 7:09 7:19 7:30 7:42 7:55 8:08 8:18 8:28 8:38 8:49 9:00 9:12 9:24 9:37 9:51 10:05 10:19 10:34 10:49 11:04 11:19 11:33 11:45 11:53 12:01 12:10 12:23 12:36 12:50 13:03 13:18 13:30 13:42 13:55 14:06 14:20 14:33 14:47 15:01 15:15 15:28 15:43 15:54 16:04 16:14 16:22 16:32 16:43 16:55 17:06 17:17 17:28 17:39 17:50 18:02 18:12 18:23 18:34 18:45 19:00 19:17 19:32 19:48 20:09 France_Barattes 6:14 6:30 6:43 6:55 7:03 7:13 7:23 7:34 7:46 7:59 8:12 8:22 8:32 8:42 8:53 9:04 9:16 9:28 9:41 9:55 10:09 10:23 10:38 10:53 11:08 11:23 11:37 11:49 11:57 12:05 12:15 12:27 12:40 12:54 13:07 13:22 13:34 13:46 13:59 14:10 14:24 14:37 14:51 15:05 15:19 15:33 15:47 15:58 16:08 16:18 16:27 16:38 16:49 17:00 17:11 17:22 17:33 17:44 17:55 18:07 18:17 18:28 18:38 18:49 19:04 19:21 19:36 19:52 20:13 GARE 6:20 6:36 6:50 7:02 7:11 7:21 7:32 7:43 7:55 8:08 8:21 8:31 8:41 8:51 9:02 9:13 9:25 9:37 9:50 10:04 10:18 10:32 10:47 11:02 11:17 11:32 11:46 11:58 12:06 12:14 12:26 12:38 12:52 13:06 13:19 13:32 13:44 13:56 14:09 14:20 14:34 14:47 15:01 15:15 15:29 15:43 15:57 16:08 16:18 16:28 16:37 16:48 16:59 17:10 17:21 17:32 17:43 17:54 18:05 18:17 18:27 18:37 18:47 18:58 19:13 19:28 19:43 19:59 20:20 Mandallaz 6:21 6:37 6:51 7:03 7:13 7:23 7:34 7:45 7:57 8:10 8:23 8:33 8:43 8:53 9:04 9:15 9:27 9:39 9:52 10:06 10:20 10:34 10:49 11:04 11:19 11:34 11:48 12:00 12:08 12:16 12:28 12:40 12:54 13:08 13:21 13:34 13:46 13:58 14:11 14:22 14:36 14:49 15:03 15:17 15:31 15:45 15:59 16:10 16:20 16:30 16:39 16:50 17:01 17:12 17:23 17:34 17:45 17:56 18:07 18:19 18:29 18:39 18:49 19:00 19:15 19:30 19:45 20:01 20:22 Chorus 6:26 6:42 6:56 7:08 7:18 7:28 7:39 7:51 8:03 8:16 8:29 8:39 8:48 8:58 9:09 9:20 9:32 9:44 9:57 10:11 10:25 10:39 10:54 11:09 11:24 11:39 11:54 12:06 12:14 12:22 12:34 12:45 13:00 13:14 13:27 13:40 13:52 14:03 14:16 14:27 14:42 14:55 15:09 15:23 15:37 15:51 16:05 16:16 16:26 16:36 16:46 16:57 17:08 17:19 17:30 17:41 17:52 18:03 18:13 18:25 18:35 18:45 18:54 19:05 19:20 19:35 19:50 20:06 20:27 Meythet_Le_Rabelais 6:31 6:47 7:01 7:14 7:24 7:34 7:45 7:57 8:09 8:22 8:35 8:45 8:54 9:04 9:15 9:26 9:38 9:50 10:03 10:17 10:31 10:45 11:00 11:15 11:30 11:45 12:00 12:12 12:20 12:28 12:40 12:51 13:06 13:20 13:33 13:46 13:58 14:09 14:22 14:33 14:48 15:01 15:15 15:29 15:43 15:57 16:11 16:22 16:32 16:43 16:53 17:04 17:15 17:26 17:38 17:49 18:00 18:11 18:20 18:31 18:41 18:51 19:00 19:11 19:25 19:40 19:55 20:11 20:32 Vernod 6:34 6:51 7:05 7:18 7:28 7:38 7:49 8:01 8:13 8:26 8:39 8:49 8:58 9:08 9:19 9:30 9:42 9:54 10:07 10:21 10:35 10:49 11:04 11:19 11:34 11:49 12:04 12:16 12:24 12:32 12:44 12:55 13:10 13:24 13:37 13:50 14:02 14:13 14:26 14:37 14:52 15:05 15:19 15:33 15:47 16:01 16:15 16:26 16:36 16:47 16:57 17:09 17:20 17:31 17:43 17:54 18:05 18:16 18:24 18:35 18:45 18:55 19:04 19:15 19:29 19:44 19:59 20:15 20:36 POISY_COLL�GE 6:39 6:56 7:10 7:24 7:33 7:43 7:55 8:07 8:19 8:32 8:45 8:55 9:04 9:14 9:25 9:36 9:48 10:00 10:13 10:27 10:41 10:55 11:10 11:25 11:40 11:55 12:10 12:22 12:29 12:38 12:50 13:01 13:15 13:30 13:43 13:56 14:08 14:19 14:32 14:43 14:58 15:11 15:25 15:39 15:53 16:07 16:21 16:32 16:42 16:53 17:02 17:15 17:25 17:37 17:49 18:00 18:11 18:22 18:30 18:41 18:51 19:01 19:10 19:21 19:35 19:49 20:04 20:20 20:41 LYC�E_DE_POISY - - - - 7:37 - - - - - - - - - - - - - - - - - - - - - - 7:47 12:33 - - - 13:19 - - - - - - - - - - - - - - - - - 17:06 - 17:30 - - - - - - - - - - - - - - - -";
	
		ArrayList<Arret> listeArrets = creerArrets(ligne1_arrets);
		ArrayList<String> listeHoraires = assignerHoraires(ligne1_normal_sens1);
        
		assignerLiens(listeArrets, listeHoraires, 1, "normal");


		System.out.print(listeArrets.get(5).getLiens().get(0).getPlanning().get(7).getHeureDepart());
	}
	
	
	public static ArrayList<Arret> creerArrets(String texte){
		ArrayList<Arret> listeArrets = new ArrayList<Arret>();
		int pos = 0;
		int nouvPos = 0;
		
		while (texte.indexOf(' ', pos) != -1){
			nouvPos = texte.indexOf(' ', pos);
			
			String nom_arret = texte.substring(pos, nouvPos);
				if (nom_arret.length() > 2){
					listeArrets.add(new Arret(nom_arret, new ArrayList<Lien>()));
				}
			pos = nouvPos + 1;
		}
		
		return listeArrets;
	}
	
	
	
	
	 public static ArrayList<String> assignerHoraires(String texte){
		 ArrayList<String> listeHoraires = new ArrayList<String>();
		 int pos = 0;
		 int nouvPos = 0;
		 String texte_aux = "";

			while (texte.indexOf(' ', pos) != -1){
				nouvPos = texte.indexOf(' ', pos);
				String entre_esp = texte.substring(pos, nouvPos);
				
					if (entre_esp.length() > 1){
						
						if ( !entre_esp.substring(entre_esp.length()-3, entre_esp.length()-2).equals(":") && texte_aux.length() != 0){

							listeHoraires.add(texte_aux);
							texte_aux = "";
						}
					}
				
				
				if(entre_esp.length() == 1) {
					texte_aux = texte_aux + " " + entre_esp;
				}
				else if (entre_esp.substring(entre_esp.length()-3, entre_esp.length()-2).equals(":")){
					texte_aux = texte_aux + " " + entre_esp ;
				}
				pos = nouvPos + 1;
			}
		 return listeHoraires; 
	 }
	 
	 
	 public static void assignerLiens(ArrayList<Arret> arrets, ArrayList<String> Horaires, int numLigne, String typeJour){
		 int k = 0;
		 int z = 0;
		 
		 for (k=0; k<arrets.size()-1; k++){
			 
			 for (z=1; !(RecupererNEme(z, Horaires.get(k)).equals(" ")) ; z++){
				 int x = 1;
				 boolean lienExiste = false;
				 //System.out.print(RecupererNEme(z, Horaires.get(k)) + "ici");
				 if (!(RecupererNEme(z, Horaires.get(k)).equals("-"))){
					 lienExiste = true;
					 if (RecupererNEme(z, Horaires.get(k+x)).equals("-")){
						 x += 1;
						 lienExiste = false;
					 }
					 if (lienExiste == false){
						 if (k+x<arrets.size()){
							 if (!RecupererNEme(z, Horaires.get(k+x)).equals("-")){
								 lienExiste = true;
							 }
						 }
					 }
							
					 if (lienExiste == true){
						 int y = 0;
						 boolean lien_existe_deja = false;
						 for (y=0; y<arrets.get(k).getLiens().size(); y++){
							 if (arrets.get(k).getLiens().get(y).getArretArrivee().getNom() == arrets.get(k+x).getNom()){
								 lien_existe_deja = true;
								 arrets.get(k).getLiens().get(y).getPlanning().add(new Horaire(RecupererNEme(z, Horaires.get(k)), RecupererNEme(z, Horaires.get(k+x)), typeJour));
							 }
						 }
						 if (lien_existe_deja == false){
							 System.out.print(k + " ");
							 System.out.print(z + "\n");
							 ArrayList<Horaire> planning = new ArrayList();
							 planning.add(new Horaire(RecupererNEme(z, Horaires.get(k)), RecupererNEme(z, Horaires.get(k+x)), typeJour));
							 arrets.get(k).getLiens().add(new Lien(numLigne, arrets.get(k+x), planning));
						 }
					 }
				 }
			 }
		 }
	 }

	 
	 public static String RecupererNEme(int n, String Horaires){
		 int pos = 0;
		 int nouvPos = 0;
		 int k = 0;
		 while (k<n){
			 pos = nouvPos +1;
			 nouvPos = Horaires.indexOf(' ', pos);
			 k +=1;
			 
		 }
		 if (nouvPos == -1){
			 return " ";
		 }
		 else {
			 return Horaires.substring(pos, nouvPos);
		 }
	 }
	 
	 
	//on suppose qu'on est en 2020
	public static String determinerTypeJour (int mois, int jour){
		//Le 1er janvier 2020 est un mercredi
		int numSemaine = 3;
		numSemaine += jour-1;
		numSemaine += booleanToInt(mois>1)*31 + booleanToInt(mois>2)*29 + booleanToInt(mois>3)*31+ booleanToInt(mois>4)*30 + booleanToInt(mois>5)*31 + booleanToInt(mois>6)*30 + booleanToInt(mois>7)*31 + booleanToInt(mois>8)*31 + booleanToInt(mois>9)*30+ booleanToInt(mois>10)*31 + booleanToInt(mois>11)*30;
		numSemaine = numSemaine%7;
		
		if (numSemaine == 0){
			return "special";
		}
		if ((mois==1 && jour==1) || (mois==4 && jour==13) || (mois==5 && jour==1) || (mois==5 && jour==8) || (mois==5 && jour==21) || (mois==6 && jour==1) || (mois==7 && jour==14) || (mois==8 && jour==15) || (mois==11 && jour==1) || (mois==11 && jour==11) || (mois==12 && jour==25)){
			return "special";
		}
		return "normal";
	}	
	
	public static int booleanToInt(boolean bool){
		if (bool==true){
			return 1;
		}
		return 0;
	}
	
}
