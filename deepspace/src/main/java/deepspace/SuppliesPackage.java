package deepspace;

public class SuppliesPackage {
    private float ammoPower;
    private float fuelUnits;
    private float shieldPower;
    
    SuppliesPackage(float ammoPower, float fuelUnits, float shieldPower){
        this.ammoPower = ammoPower;
        this.fuelUnits = fuelUnits;
        this.shieldPower = shieldPower;
    }

    //Implementar como se explicó en clase??
    SuppliesPackage(SuppliesPackage s){
        this (s.ammoPower,s.fuelUnits,s.shieldPower);
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
    
    public String toString() {
        String cadena = "AmmoPower: " + getAmmoPower() + "\nFuelUnits: " + getFuelUnits() +
        "\nShieldPower: " + getShieldPower();

        return cadena;
    }
}