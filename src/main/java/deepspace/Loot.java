package deepspace;

public class Loot {
    private int nSupplies;
    private int nWeapons;
    private int nShields;
    private int nHangars;
    private int nMedals;
    private boolean getEfficient;
    private boolean spaceCity;

    
    Loot(int S, int W, int Sh, int H, int M){
        nSupplies = S;
        nWeapons = W;
        nShields = Sh;
        nHangars = H;
        nMedals = M; 
        getEfficient = false;
        spaceCity = false; 
    }

    Loot(int S, int W, int Sh, int H, int M, boolean ef, boolean city){
        nSupplies = S;
        nWeapons = W;
        nShields = Sh;
        nHangars = H;
        nMedals = M;  
        getEfficient = ef;
        spaceCity = city;
    }
    

    public int getNSupplies(){
        return nSupplies;
    }
    
    public int getNWeapons(){
        return nWeapons;
    }
    
    public int getNShields(){
        return nShields;
    }

    public int getNHangars(){
        return nHangars;
    }

    public int getNMedals(){
        return nMedals;
    }

    public boolean getEfficient(){
        return getEfficient;
    }

    public boolean spaceCity(){
        return spaceCity;
    }

    public String toString() {
        String cadena = "NSupplies: " + getNSupplies() + "\n NShields: " + getNShields() + 
        "\nNHangars: " + getNHangars() + "\nNMedals: " + getNMedals() + "\ngetEfficient: "
        + getEfficient() + "\nspaceCity: " + spaceCity();

        return cadena;
    }

    LootToUI getUIversion(){
        return new LootToUI(this);
    }
}