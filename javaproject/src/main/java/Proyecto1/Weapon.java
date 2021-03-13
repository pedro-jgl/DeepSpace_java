package Proyecto1;

public class Weapon {
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
    
    WeaponType getWeaponType(){
        return type;
    }
    
    int getUses(){
        return uses;
    }
    
    float power(){
        return type.getPower();

    }

    float UseIt(){
        final float ZERO_USES = 1.0f;

        if(this.uses > 0){
            uses--;
            return this.power();
        }
        else{
            return ZERO_USES;
        }

    }
}
