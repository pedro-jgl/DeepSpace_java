package deepspace;

import java.util.ArrayList;

public class Hangar {
    private int maxElements;
    private ArrayList<Weapon> weapons;
    private ArrayList<ShieldBooster> shieldBoosters;

    Hangar(int capacity){
        maxElements = capacity;
        weapons = new ArrayList<Weapon>();
        shieldBoosters = new ArrayList<ShieldBooster>();
    }

    Hangar(Hangar h){
        this (h.maxElements);
    }

    HangarToUI getUIversion(){
        return new HangarToUI(this);
    }

    private boolean spaceAvailable(){
        int ocupado = weapons.size() + shieldBoosters.size();
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
            shieldBoosters.add(s);
        }

        return aniadido;
    }

    public int getMaxElements(){
        return maxElements;
    }

    public ArrayList<ShieldBooster> getShieldBoosters(){
        return shieldBoosters;
    }

    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }

    public ShieldBooster removeShieldBooster(int s){
        //El método remove lanza: IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
        if(s>=0 && s<shieldBoosters.size()){
            ShieldBooster sb = shieldBoosters.remove(s);
            return sb;
        }
        return null;
    }

    public Weapon removeWeapon(int w){
        if(w >= 0 && w < weapons.size()){
            Weapon arma = weapons.remove(w);
            return arma;
        }
        return null;
    }

    public String toString(){
        //Hay que hacer un toString de ArrayList<Weapon> y del otro??
        String cadena = "Máx elementos: " + maxElements + "\nWeapons: ";

        for (int i = 0; i < weapons.size(); i++){
            cadena += "Arma " + (i+1) + ": ";
            cadena += weapons.get(i).toString();
            cadena += "\n";
        }
        
        cadena += "ShieldBoosters: ";
        
        for(int i=0; i < shieldBoosters.size(); i++){
            cadena += "ShieldBooster " + (i+1) + ": ";
            cadena += shieldBoosters.get(i).toString();
            cadena += "\n";
        }
        return cadena;
    }
}