package transport;

import mere.Vehicule;

public class Voiture extends Vehicule { // classe = objet
    public Voiture(String marque, String couleur, int nbRoues) {
        super(marque, couleur, nbRoues);
    }

    // private String mMarque; // declaration de l'attribut de la classe
    // public String getmMarque() { // methode(qui est aussi un attribut de la classe) pour recuperer la marque
    //     return mMarque;
    // }
    // public void setmMarque(String mMarque) {
    //     this.mMarque = mMarque;
    // }
    // private String mCouleur;
    // public String getmCouleur() {
    //     return mCouleur;
    // }
    // public void setmCouleur(String mCouleur) {
    //     this.mCouleur = mCouleur;
    // }
    // private int mNbRoues; // declaration de l'attribut de la classe
    // public int getmNbroues() { // methode(qui est aussi un attribut de la classe) pour recuperer la marque
    //     return mNbRoues;
    // }
    // public void setmNbRoues(int mNbRoues) {
    //     this.mNbRoues = mNbRoues;
    // }
    // public determine que la portée est globale , que l'attribut sera accessible à l'exterieur de la classe
    // private determine que la portee est locale , attribut accessible seulement à l'interieur de la classe
}
