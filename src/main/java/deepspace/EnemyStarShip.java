package deepspace;

public class EnemyStarShip {
    private float ammoPower;
    private String name;
    private float shieldPower;
    private Loot loot;
    private Damage damage;

    EnemyStarShip(String n, float a, float s, Loot l, Damage d){
        name        = n;
        ammoPower   = a;
        shieldPower = s;
        loot        = l;
        damage      = d;
    }

    EnemyStarShip(EnemyStarShip e){
        this.ammoPower   = e.ammoPower;
        this.name        = e.name;
        this.shieldPower = e.shieldPower;
        this.loot        = e.loot;
        this.damage      = e. damage;
    }

    EnemyToUI getUIversion(){
        return new EnemyToUI(this);
    }

    float fire(){
        return this.ammoPower;
    }

    float getAmmoPower(){
        return this.ammoPower;
    }

    Damage getDamage(){
        return this.damage;
    }

    Loot getLoot(){
        return this.loot;
    }

    String getName(){
        return this.name;
    }

    float getShieldPower(){
        return this.shieldPower;
    }

    float protection(){
        return this.shieldPower;
    }

    ShotResult receiveShot(float shot){
        ShotResult result = ShotResult.RESIST;
        
        if(protection() < shot){
            result = ShotResult.DONOTRESIST;
        }

        return result;
    }

    public String toString(){
        String descripcion = "Name: " + name + "\nammoPower: " + ammoPower + "\nshieldPower: " + shieldPower + "\nLoot: " + loot.toString() + "\nDamage: " + damage.toString();

        return descripcion;
    }
}