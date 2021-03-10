package javapaquete;

public enum WeaponType {
    LASER(2.0f), 
    MISSILE(3.0f), 
    PLASMA(4.0f);
    
    private float power;
    
    WeaponType(float power) {
        this.power = power;
    }

    private float getPower() { return power; }


}
