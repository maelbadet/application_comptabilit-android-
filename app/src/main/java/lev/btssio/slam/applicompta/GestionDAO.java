package lev.btssio.slam.applicompta;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author mhoareau
 *
 */
public class GestionDAO {

    static int max = 6548464;
    static int min = 1145841;
    static int range = max - min + 1;
    static int rand = (int)(Math.random() * range) + min;


    static int ncompte = 76*10000000+rand;
    public static int getNcompte() {
        return ncompte;
    }

    // Première interface
    public class SaisieEcriture {

        Date date;
        String libelle;
        double montant;

        public SaisieEcriture(int ncompte, Date date,
                              String libelle, double montant) {

            this.date = date;
            this.libelle = libelle;
            this.montant = montant;
        }
    }
    // Deuxième interface
    public class ListeEcritures {

        private ArrayList<SaisieEcriture> lesEcritures = new ArrayList<SaisieEcriture>();

        public ArrayList<SaisieEcriture> getEcritures()
        {
            return lesEcritures;
        }

        public void addEcriture(SaisieEcriture lEcriture) {
            this.lesEcritures.add(lEcriture);
        }
    }
    // Troisième interface
    public class ListeComptes {

        String description;

        private ArrayList<AjoutCompte> lesComptes = new ArrayList<AjoutCompte>();

        public ArrayList<AjoutCompte> getComptes()
        {
            return lesComptes;
        }

        public void addCompte(AjoutCompte leCompte) {
            this.lesComptes.add(leCompte);
        }
    }
    // Quatrième interface
    public static class AjoutCompte {

        String nom;
        String prenom;
        double solde;
        public double getSolde() {
            return solde;
        }

        private AjoutCompte(String nom, String prenom, double solde) {
            getNcompte();
            this.nom = nom;
            this.prenom = prenom;
            this.solde = solde;
        }

        static void Verifcompte() {

        }
    }

}
