package deepspace;

public class Weapon implements CombatElement {
    private String name;
    private WeaponType type;
    private int uses;

    Weapon(String name, WeaponType type, int uses){
        this.name = name;
        this.type = type;
        this.uses = uses;
    }

    Weapon(Weapon s){
        this (s.name,s.type,s.uses);
    }
    
    public WeaponType getType(){
        return type;
    }
    
    @Override
    public int getUses(){
        return uses;
    }
    
    public float power(){
        return type.getPower();

    }

    @Override
    public float UseIt(){
        final float ZERO_USES = 1.0f;

        if(this.uses > 0){
            uses--;
            return this.power();
        }
        else{
            return ZERO_USES;
        }

    }

    public String toString() {
        String cadena = "Name: " + name + "\nType: " + getType() + "\nPower: " + power() + "\nUses: " + getUses();
        
        return cadena;
    }

    WeaponToUI getUIversion(){
        return new WeaponToUI(this);
    }
}