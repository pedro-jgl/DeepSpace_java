package deepspace;

import java.util.ArrayList;

public abstract class Damage {    
    public int nShields;

    Damage(int s){
        nShields = s;
    }

    //bien?¿
    void copy(Damage d){
        this.nShields = d.nShields;
    }

    public abstract DamageToUI getUIversion();

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