package deepspace;

import java.util.ArrayList;

public class SpaceStation implements SpaceFighter{
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

    SpaceStation(SpaceStation estacion){
        this.ammoPower = estacion.ammoPower;
        this.fuelUnits = estacion.fuelUnits;
        //funciona operador =?¿
        this.hangar = estacion.hangar;
        this.nMedals = estacion.nMedals;
        this.name = estacion.name;
        this.pendindDamage = estacion.pendindDamage;
        this.shieldPower = estacion.shieldPower;
        this.weapons = new ArrayList<>();

        for(int i=0; i<estacion.weapons.size(); i++){
            this.weapons.add(estacion.weapons.get(i));
        }

        this.shieldBoosters = new ArrayList<>();

        for(int i=0; i<estacion.shieldBoosters.size(); i++){
            this.shieldBoosters.add(estacion.shieldBoosters.get(i));
        }



    }
    
    public void cleanUpMountedItems(){
        if (weapons != null)
            for (int i = 0; i < weapons.size(); ){
                if (weapons.get(i).getUses() == 0)
                    weapons.remove(i);
                else
                    i++;
            }

        if (shieldBoosters != null)
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
        if(i >= 0 && i < getShieldBoosters().size()){
            ShieldBooster sh = shieldBoosters.remove(i);

            if(getPendingDamage() != null){
                pendindDamage.discardShieldBooster();

                this.cleanPendingDamage();
            }
        }    }
    
    public void discardShieldBoosterInHangar(int i){
        if (hangar != null)
            hangar.removeShieldBooster(i);
    }
    
    public void discardWeapon(int i){
        if(i >= 0 && i < getWeapons().size()){
            Weapon w = weapons.remove(i);

            if(getPendingDamage() != null){
                pendindDamage.discardWeapon(w);

                this.cleanPendingDamage();
            }
        }
    }
    
    public void discardWeaponinHangar(int i){
        if (hangar != null)
            hangar.removeWeapon(i);
    }


    @Override
    public float fire(){
        float factor = 1;
        for(int i=0; i<this.getWeapons().size(); i++){
            factor =  (factor * this.getWeapons().get(i).UseIt());
        }

        return this.getAmmoPower()*factor;
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
        if (weapons == null)
            weapons = new ArrayList<Weapon>();
            
        if (shieldBoosters == null)
            shieldBoosters = new ArrayList<ShieldBooster>();

        return new SpaceStationToUI(this);
    }

    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }
        
    public void mountShieldBooster(int i){
        ShieldBooster sb;

        if (hangar != null){
            if (shieldBoosters != null){
                sb = hangar.removeShieldBooster(i);
                if(sb != null)
                    shieldBoosters.add(sb);
            }else{
                shieldBoosters = new ArrayList<ShieldBooster>();
                sb = hangar.removeShieldBooster(i);
                if(sb != null)
                    shieldBoosters.add(sb);
            }
        }
    }

    public void mountWeapon(int i){
        Weapon w;

        if (hangar != null){
            if (weapons != null){
                w = hangar.removeWeapon(i);
                if (w != null)
                    weapons.add(w);
            }else{
                weapons = new ArrayList<Weapon>();
                w = hangar.removeWeapon(i);
                if (w != null)
                    weapons.add(w);
            }

        }
    }
    
    public void move(){
        if (fuelUnits != 0){
            fuelUnits -= getSpeed();

            if (fuelUnits < 0)
                fuelUnits = 0;
        }
    }

    @Override
    public float protection(){
        float factor = 1;

        for(int i=0; i<this.getShieldBoosters().size(); i++){
            factor = factor * this.getShieldBoosters().get(i).UseIt();
        }
   
        return shieldPower * factor;
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

    @Override
    public ShotResult receiveShot(float shot){
        float myProtection = this.protection();
        
        if(myProtection >= shot){
            this.shieldPower-=SHIELDLOSSPERUNITSHOT*shot;
            if(this.shieldPower < 0.0)
                this.shieldPower = (float) 0.0;
            
            return ShotResult.RESIST;
        }else{
            this.shieldPower = (float) 0.0;
            return ShotResult.DONOTRESIST;
        }
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

    public Transformation setLoot(Loot loot) {
        CardDealer dealer = CardDealer.getInstance();

        int h = loot.getNHangars();
        
        if(h>0){
            Hangar hangar = dealer.nextHangar();
            this.receiveHangar(hangar);
        }

        int elements = loot.getNSupplies();
        for(int i=0; i<elements; i++){
            SuppliesPackage sup = dealer.nextSuppliesPackage();
            receiveSupplies(sup);
        }

        elements = loot.getNWeapons();
        for(int i=0; i<elements; i++){
            Weapon weap = dealer.nextWeapon();
            receiveWeapon(weap);
        }

        elements = loot.getNShields();
        for(int i=0; i<elements; i++){
            ShieldBooster sh = dealer.nextShieldBooster();
            receiveShieldBooster(sh);
        }

        this.nMedals += loot.getNMedals(); 

        if(loot.getEfficient()){
            return Transformation.GETEFFICIENT;
        }
        if(loot.spaceCity()){
            return Transformation.SPACECITY;
        }
        
        return Transformation.NOTRANSFORM;
        
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
        String cadena = "Name: " + name; 
        cadena += "\nammoPower: " + ammoPower;
        cadena += "\nFuel Units: " + fuelUnits;
        cadena += "\nMedals: " + nMedals;
        cadena += "\nShieldPower: " + shieldPower;
        
        cadena += "\nPendingDamage: ";
        
        if (pendindDamage != null)
            cadena += pendindDamage.toString();
        
        cadena += "\nHangar: ";
        
        if (hangar != null)
            cadena += hangar.toString();

        
        cadena += "\nWeapons: \n";
           
        if (weapons != null)
            for (int i = 0; i < weapons.size(); i++){
                cadena += "Arma " + (i+1) + ": ";
                cadena += weapons.get(i).toString();
                cadena += "\n";
        }
        
        
        cadena += "ShieldBoosters: ";
        
        if(shieldBoosters != null)
            for(int i=0; i < shieldBoosters.size(); i++){
                cadena += "ShieldBooster " + (i+1) + ": ";
                cadena += shieldBoosters.get(i).toString();
                cadena += "\n";
            }
            
        return cadena;
    }
}