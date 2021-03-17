package deepspace;

public class Damage {
    private int nShields;
    private int nWeapons;

    Damage(int w, int s){
        nShields = s;
        nWeapons = w;
    }

    Damage(WeaponType[] wl, int s){
        //?????
    }

    Damage(Damage d){
        nShields = d.nShields;
        nWeapons = d.nWeapons;
    }

    DamageToUI getUIVersion(){
        return new DamageToUI(this);
    }

    private int arrayContainsType(Weapon[] w, WeaponType t){
        throw new UnsupportedOperationException();
    }

    public Damage adjust(Weapon[] w, ShieldBooster[] s){

    }

    void discardWeapon(Weapon w){
        throw new UnsupportedOperationException();

    }

    void discardShieldBooster(){
        throw new UnsupportedOperationException();
    }

    boolean hasNoEffect(){
        throw new UnsupportedOperationException();

    }

    int getNShields(){
        return nShields;
    }

    int getNWeapons(){
        return nWeapons;
    }

    WeaponType[] getWeapons(){
        throw new UnsupportedOperationException();

    }
}
