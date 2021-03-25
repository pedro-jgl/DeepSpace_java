package deepspace;

import java.util.ArrayList;

public class Damage {
    private int nShields;
    private int nWeapons;
    private ArrayList<WeaponType> weapons;

    Damage(int w, int s){
        nShields = s;
        nWeapons = w;
        weapons = new ArrayList<WeaponType>();
    }

    Damage(ArrayList<WeaponType> wl, int s){
        nShields = s;
        weapons = wl; //Está bien asignar una referencia de wl a weapons?
        nWeapons = 0;
    }

    Damage(Damage d){
        //Usar las funciones getNShields()y getWeapons()??
        this (d.weapons,d.nShields);
        nWeapons = d.getNWeapons();

    }

    DamageToUI getUIversion(){
        return new DamageToUI(this);
    }

    private int arrayContainsType(ArrayList<Weapon> w, WeaponType t){
        weapons.clear();    //???????
        int index = -1;

        for (int i = 0; i < w.size(); i++){
            weapons.add(w.get(i).getType());
        }

        index = weapons.indexOf(t);

        return index;
    }

    public Damage adjust(ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        Damage danio = new Damage (this);

        int shields = danio.getNShields();
        shields = s.size();
        int weaps = danio.getNWeapons();
        weaps = w.size();

        danio.arrayContainsType(w, danio.getWeapons().get(0)); //????

        return danio;
    }

    public void discardWeapon(Weapon w){
        if (weapons.isEmpty()){
            if (nWeapons > 0){
                nWeapons--;
            }
        }
        else{
            if (!weapons.remove(w.getType())){ //Si no sale bien también se decrementa??
                if (nWeapons > 0){
                    nWeapons--;
                }
            }
        }

    }

    public void discardShieldBooster(){
        if (nShields > 0)
            nShields--;
    }

    public boolean hasNoEffect(){
        boolean noeffect = false;

        if (getNShields() == 0 && getNWeapons() == 0 && weapons.isEmpty())
            noeffect = true;

        return noeffect;
    }

    public int getNShields(){
        return nShields;
    }

    public int getNWeapons(){
        return nWeapons;
    }

    public ArrayList<WeaponType> getWeapons(){
        return weapons;

    }
}
