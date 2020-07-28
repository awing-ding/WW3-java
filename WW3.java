import java.util.Scanner;
class ClasseMain{

  public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    int exCaisse = sc.nextInt();
    System.out.println("quels sont vos anciennes caisses ? ");
    int recettePublique = sc.nextInt();
    System.out.println("quels sont vos recette publique en % mais sans le <<%>> ? ");
    int annexion = sc.nextInt();
    System.out.println("quel est le total du PIB des pays que vous avez annexé ? ");
    int tauxDePertePopularite = sc.nextInt();
    System.out.println("par combien votre population est-elle divisé pour calculer votre popularité (si vous ne savez pas, contactez le staff) ? ");
    int population = sc.nextInt();
    System.out.println("quel est votre population ? ");
    int Musee = sc.nextInt();
    System.out.println("combien de musée avez vous construit ? ");
    int Propagande = sc.nextInt();
    System.out.println("combien de propagande avez vous fait ? ");
    int Cinemas = sc.nextInt();
    System.out.println("combien de cinéma avez vous construit ? ");
    int Usine = sc.nextInt();
    System.out.println("combien d'usine avez vous construit ? ");
    int Nucleaire = sc.nextInt();
    System.out.println("combien de centrale nucléaire avez vous construit ? ");
    int Ferme = sc.nextInt();
    System.out.println("combien de ferme avez vous construit ? ");
    int Port = sc.nextInt();
    System.out.println("combien de port avez vous construit ? ");
    int PopulariteArbitrairePerdu = sc.nextInt();
    System.out.println("Combien de popularité les MJ/roll vous ont fait perdre ? ");
    int PopulariteArbitraireGagne = sc.nextInt();
    System.out.println("Combien de popularité les MJ/roll vous ont fait gagner ? ");
    int Popularite = 75+(Propagande+(Musee*2)+(Cinemas*2)+PopulariteArbitraireGagne)-(5*Nucleaire+PopulariteArbitrairePerdu+(population/tauxDePertePopularite));
    int PIB = exCaisse+(Usine*2)+(Nucleaire*6)+(Ferme*4)+(Port*3)+((recettePublique/1000)*annexion);
    if Popularite <= 40 : #calcul
        caisse = PIB-(exCaisse*0.2)
    else if Popularite > 40 and Popularite <= 60:
        caisse = PIB-(exCaisse*0.1)
    else if Popularite > 60 and Popularite <= 80:
        caisse = PIB+(exCaisse*0.1)
    else if Popularite > 80 and Popularite <= 100:
        caisse = PIB+(exCaisse*0.2)
    if caisse < 10;
        caisse = 10
    System.out.println("vos caisse sont de " + caisse)
    System.out.println("votre popularité est égale à:" + Popularite)
  }//Fin de la méthode main

}//Fin de votre classe
