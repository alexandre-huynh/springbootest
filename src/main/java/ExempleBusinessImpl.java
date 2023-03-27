package fr.einfolearning.business;

public class ExempleBusinessImpl {

    // service métier
    // interface publique de la classe métier
    // somme tableau entier
    public int calculerSomme(int [] data){

        int som = 0;

        for (int val:data){
            som += som + val;
        }

        return som;
    }
}