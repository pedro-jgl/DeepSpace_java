package deepspace;

import java.util.ArrayList;

public class Damage {
    private final static int NO_USE = -1;
    
    //O bien se usa el número de armas o bien la lista de armas
    private int nShields;
    private int nWeapons;
    private ArrayList<WeaponType> weapons;

    Damage(int w, int s){
        nShields = s;
        nWeapons = w;
        weapons = null;
    }

    Damage(ArrayList<WeaponType> wl, int s){
        nShields = s;
        weapons = new ArrayList<WeaponType>(wl);
        nWeapons = NO_USE;
    }

    Damage(Damage d){
        this (d.getNWeapons(),d.getNShields());

        if (d.getNWeapons() == -1){
            weapons = new ArrayList<WeaponType>(d.getWeapons());
        } 
    }

    DamageToUI getUIversion(){
        return new DamageToUI(this);
    }

    private int arrayContainsType(ArrayList<Weapon> w, WeaponType t){
        ArrayList<WeaponType> weaptype = new ArrayList<WeaponType>();    
        int index = -1;

        for (int i = 0; i < w.size(); i++){
            weaptype.add(w.get(i).getType());
        }

        index = weaptype.indexOf(t);

        return index;
    }

    //Este método hace un ajuste ya que el daño puede indicar que se pierdan más
    //shieldboosters de los que el jugador tiene, luego tenemos que ajustarlo
    public Damage adjust(ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        Damage danio = new Damage (this);

        if (s.size() < danio.getNShields())
            danio.nShields = s.size();

        if (danio.getNWeapons() != NO_USE){
            if (w.size() < danio.getNWeapons())
                danio.nWeapons = w.size();
        } else{
        
            //????
            for (int i = 0; i < danio.getWeapons().size(); ){
                if ( arrayContainsType(w, danio.getWeapons().get(i)) == -1 ){
                    danio.weapons.remove(i);
                }else{
                    i++;
                }
            }
        }

        return danio;
    }

    public void discardWeapon(Weapon w){
        if (weapons != null){
            if (nWeapons > 0){
                nWeapons--;
            }
        }
        else{
            weapons.remove(w.getType());
        }

    }

    void discardShieldBooster(){
        if (nShields > 0)
            nShields--;
    }

    boolean hasNoEffect(){
        boolean noeffect = false;

        if ( getNShields() == 0 && ( ( getNWeapons() == NO_USE && getWeapons().isEmpty() ) || ( getWeapons() == null && getNWeapons() == 0 ) ) )
            noeffect = true;

        return noeffect;
    }

    int getNShields(){
        return nShields;
    }

    int getNWeapons(){
        return nWeapons;
    }

    ArrayList<WeaponType> getWeapons(){
        return weapons;

    }
}
