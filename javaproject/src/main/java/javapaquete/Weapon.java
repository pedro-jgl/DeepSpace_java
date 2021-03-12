package javapaquete;

public class Weapon {
    private String name;
    private WeaponType type;
    private int uses;

    Weapon(String name, WeaponType type, int uses){
        this.name = name;
        this.type = type;
        this.uses = uses;
    }

    //Implementar como se explico en clase??
    Weapon(Weapon s){
        //this.name = s.name;
        //this.type =  s.type;
        //this.uses = s.uses;
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
