package deepspace;

import java.util.ArrayList;

public class SpaceStation {
    static private final int MAXFUEL = 100;
    static private final float SHIELDLOSSPERUNITSHOT = 0.1f;
    private float ammoPower;
    private float fuelUnits;
    private String name;
    private int nMedals;
    private float shieldPower;

    private Damage pendindDamage;
    private ArrayList<Weapon> weapons;
    private ArrayList<ShieldBooster> shieldBoosters;
    private Hangar hangar;

    private void assignFuelValue(float f){
        if(f <= MAXFUEL )
            fuelUnits = f;
        else
            f = MAXFUEL;
    }

    private void cleanPendingDamage(){
        if (pendindDamage.hasNoEffect())
            pendindDamage = null;
    }

    SpaceStation(String n, SuppliesPackage supplies){
        name = n;
        fuelUnits = supplies.getFuelUnits();
        ammoPower = supplies.getAmmoPower();
        shieldPower = supplies.getShieldPower();
        nMedals = 0;
        pendindDamage = null;
        weapons = null;
        hangar = null;
        shieldBoosters = null;
    }
    
    public void cleanUpMountedItems(){
        for (int i = 0; i < weapons.size(); ){
            if (weapons.get(i).getUses() == 0)
                weapons.remove(i);
            else
                i++;
        }

        for (int i = 0; i < shieldBoosters.size(); ){
            if (shieldBoosters.get(i).getUses() == 0)
                shieldBoosters.remove(i);
            else
                i++;
        }
    }

    public void discardHangar(){
        hangar = null;
    }    

    public void discardShieldBooster(int i){
        throw new UnsupportedOperationException();
    }
    
    public void discardShieldBoosterInHangar(int i){
        if (hangar != null)
            hangar.removeShieldBooster(i);
    }
    
    public void discardWeapon(int i){
        throw new UnsupportedOperationException();
    }
    
    public void discardWeaponinHangar(int i){
        if (hangar != null)
            hangar.removeWeapon(i);
    }

    public float fire(){
        throw new UnsupportedOperationException();
    }

    
    public float getAmmoPower() {
        return ammoPower;
    }
    
    public Hangar getHangar(){
        return hangar;
    }
    
    public float getFuelUnits(){
        return fuelUnits;
    }

    public String getName(){
        return name;
    }

    
    public int getNMedals(){
        return nMedals;
    }
    
    public Damage getPendingDamage(){
        return pendindDamage;
    }


    public ArrayList<ShieldBooster> getShieldBoosters(){
        return shieldBoosters;
    }
    
    public float getShieldPower(){
        return shieldPower;
    }
       
    public float getSpeed(){
        float speed = fuelUnits / MAXFUEL;
        
        return speed;
    }

    public SpaceStationToUI getUIversion(){
        return new SpaceStationToUI(this);
    }

    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }
        
    public void mountShieldBooster(int i){
        if (hangar != null){
            shieldBoosters.add(hangar.removeShieldBooster(i));
        }
    }

    public void mountWeapon(int i){
        if (hangar != null){
            weapons.add(hangar.removeWeapon(i));
        }
    }
    
    public void move(){
        if (fuelUnits != 0){
            fuelUnits -= getSpeed();

            if (fuelUnits < 0)
                fuelUnits = 0;
        }
    }

    public float protection(){
        throw new UnsupportedOperationException();
    }

    public void receiveHangar(Hangar h) {
        if(hangar == null)
            hangar = h;
        
    }

    public boolean receiveShieldBooster(ShieldBooster s){
        if(hangar != null){
            return hangar.addShieldBooster(s);
        }else{
            return false;
        }
    }

    public ShotResult receiveShot(float shot){
        throw new UnsupportedOperationException();
    }
    
    public void receiveSupplies(SuppliesPackage s){
        ammoPower += s.getAmmoPower();
        fuelUnits += s.getAmmoPower();
        shieldPower += s.getShieldPower();
    }

    public boolean receiveWeapon(Weapon w){
        if(hangar != null){
            return hangar.addWeapon(w);
        }else{
            return false;
        }
    }

    public void setLoot(Loot loot) {
        throw new UnsupportedOperationException();
    }

    public void setPendingDamage(Damage d) {
        pendindDamage = d.adjust(weapons, shieldBoosters);
    }
    
    public boolean validState(){
        if(pendindDamage == null || pendindDamage.hasNoEffect())
            return true;
        else
            return false;

    }

    public String toString(){
        //Comprobar que al ser null salga PendingDamage vacío y hangar
        String cadena = "Name: " + name + "ammoPower: " + ammoPower + "\nFuel Units: " + fuelUnits + "\nMedals: " + nMedals
        + "\nShieldPower: " + shieldPower + "\nPendingDamage: " + pendindDamage.toString() + "\nHangar: " + hangar.toString() + "\nWeapons: \n";
    
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
