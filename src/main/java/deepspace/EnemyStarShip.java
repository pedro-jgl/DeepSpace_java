package deepspace;

public class EnemyStarShip implements SpaceFighter{
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

    @Override
    public float fire(){
        return this.ammoPower;
    }

    public float getAmmoPower(){
        return this.ammoPower;
    }

    Damage getDamage(){
        return this.damage;
    }

    public Loot getLoot(){
        return this.loot;
    }

    public String getName(){
        return this.name;
    }

    public float getShieldPower(){
        return this.shieldPower;
    }

    @Override
    public float protection(){
        return this.shieldPower;
    }

    @Override
    public ShotResult receiveShot(float shot){
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