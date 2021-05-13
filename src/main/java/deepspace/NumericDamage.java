package deepspace;

import java.util.ArrayList;

public class NumericDamage extends Damage{
    private int nWeapons;
    NumericDamage(int w, int s){
        super(s);
        nWeapons = w;
    }
    
    NumericDamage(NumericDamage danio){
        super(danio.nShields);
        nWeapons = danio.nWeapons;
    }

    @Override
    public void discardWeapon(Weapon w){
        if (nWeapons > 0){
            nWeapons--;
        }
    }

    @Override
    public boolean hasNoEffect(){
        boolean noeffect = false;

        if ( getNShields() == 0 && getNWeapons() == 0 )
            noeffect = true;

        return noeffect;
    }

    public int getNWeapons(){
        return nWeapons;
    }

    @Override
    public Damage adjust(ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        NumericDamage danio = new NumericDamage (this);
        if (s.size() < danio.getNShields())
            danio.nShields = s.size();

        if (w.size() < danio.getNWeapons())
            danio.nWeapons = w.size();
        
        return danio;
    }

    @Override
    public String toString(){
        String cadena = super.toString();
        
        cadena += ", número de armas perdidas: " + getNWeapons();

        return cadena;
    }

}
