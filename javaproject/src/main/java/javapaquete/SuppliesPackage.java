package javapaquete;

public class SuppliesPackage {
    private float ammoPower;
    private float fuelUnits;
    private float shieldPower;
    
    SuppliesPackage(float ammoPower, float fuelUnits, float shieldPower){
        this.ammoPower = ammoPower;
        this.fuelUnits = fuelUnits;
        this.shieldPower = shieldPower;
    }

    SuppliesPackage(SuppliesPackage s){
        this.ammoPower = s.ammoPower;
        this.ammoPower = s.fuelUnits;
        this.shieldPower = s.shieldPower;
    }

    float getAmmoPower(){ 
        return ammoPower;
    }
        

    float getFuelUnits(){
        return fuelUnits;
    }

    float getShieldPower(){
        return shieldPower;
    }

}