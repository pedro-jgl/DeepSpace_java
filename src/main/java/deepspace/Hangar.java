package deepspace;

import java.util.ArrayList;

public class Hangar {
    private int maxElements;
    private ArrayList<Weapon> weapons;
    private ArrayList<ShieldBooster> shieldboosters;

    Hangar(int capacity){
        maxElements = capacity;
        weapons = new ArrayList<Weapon>();
        shieldboosters = new ArrayList<ShieldBooster>();
    }

    Hangar(Hangar h){
        this (h.maxElements);
    }

    HangarToUI getUIversion(){
        return new HangarToUI(this);
    }

    private boolean spaceAvailable(){
        int ocupado = weapons.size() + shieldboosters.size();
        boolean libre = true;

        if (ocupado == maxElements)
            libre = false;

        return libre;

    }

    public boolean addWeapon(Weapon w){
        boolean aniadido = false;

        if (spaceAvailable()){
            aniadido = true;
            weapons.add(w);
        }

        return aniadido;
    }

    public boolean addShieldBooster(ShieldBooster s){
        boolean aniadido = false;

        if (spaceAvailable()){
            aniadido = true;
            shieldboosters.add(s);
        }

        return aniadido;
    }

    public int getMaxElements(){
        return maxElements;
    }

    public ArrayList<ShieldBooster> getShieldBoosters(){
        return shieldboosters;
    }

    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }

    public ShieldBooster removeShieldBooster(int s){
        //El método remove lanza: IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
        ShieldBooster sb = shieldboosters.remove(s);
        return sb;
    }

    public Weapon removeWeapon(int w){
        Weapon arma = weapons.remove(w);
        return arma;
    }

    public String toString(){
        //Hay que hacer un toString de ArrayList<Weapon> y del otro??
        String cadena = "Máx elementos: " + maxElements + "\nWeapons: " + weapons.toString() + "\nShieldBoosters: " + shieldboosters.toString();

        return cadena;
    }
}
