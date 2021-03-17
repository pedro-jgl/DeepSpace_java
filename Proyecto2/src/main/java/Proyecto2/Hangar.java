package deepspace;

public class Hangar {
    private int maxElements;

    Hangar(int capacity){
        maxElements = capacity;
    }

    Hangar(Hangar h){
        maxElements = h.maxElements;
    }

    HangarToUI getUIversion(){
        return new HangarToUI(this);
    }

    private boolean spaceAvailable(){
        throw new UnsupportedOperationException();
    }

    public boolean addWeapon(Weapon w){
        throw new UnsupportedOperationException();
    }

    boolean addShieldBooster(ShieldBooster s){
        throw new UnsupportedOperationException();
    }

    int getMaxElements(){
        return maxElements;
    }

    ShieldBooster[] getShieldBoosters(){
        throw new UnsupportedOperationException();
    }

    Weapon[] getWeapons(){
        throw new UnsupportedOperationException();
    }

    ShieldBooster removeShieldBooster(int s){
        throw new UnsupportedOperationException();
    }

    Weapon removeWeapon(int w){
        throw new UnsupportedOperationException();
    }
}
