package deepspace;

import java.util.ArrayList;

public abstract class Damage {    
    public int nShields;

    Damage(int s){
        nShields = s;
    }

    /*
    //bien?¿
    Damage copy(){
        Damage d = new Damage(this.nShields);
        return d;
    }
    */

    public abstract Damage copy();

    public abstract DamageToUI getUIversion();

    //Los escudos son un atributo común en las subclases, luego gestionamos su adjust
    //con este método y lo llamamos en el adjust completo de cada clase
    public void adjust_shields(ArrayList<ShieldBooster> s){
        nShields = Math.min(nShields,s.size());
    }

    //Este método hace un ajuste ya que el daño puede indicar que se pierdan más
    //shieldboosters de los que el jugador tiene, luego tenemos que ajustarlo
    public abstract Damage adjust(ArrayList<Weapon> w, ArrayList<ShieldBooster> s);

    public abstract void discardWeapon(Weapon w);

    public void discardShieldBooster(){
        if (nShields > 0)
            nShields--;
    }

    public abstract boolean hasNoEffect();

    public int getNShields(){
        return nShields;
    }


    public String toString(){
        String cadena = "Número de escudos perdidos: " + getNShields();

        return cadena;
    }
}