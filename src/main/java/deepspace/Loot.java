package deepspace;

public class Loot {
    private int nSupplies;
    private int nWeapons;
    private int nShields;
    private int nHangars;
    private int nMedals;

    
    Loot(int S, int W, int Sh, int H, int M){
        nSupplies = S;
        nWeapons = W;
        nShields = Sh;
        nHangars = H;
        nMedals = M;  
    }
    

    int getNSupplies(){
        return nSupplies;
    }
    
    int getNWeapons(){
        return nWeapons;
    }
    
    int getNShields(){
        return nShields;
    }

    int getNHangars(){
        return nHangars;
    }

    int getNMedals(){
        return nMedals;
    }

    public String toString() {
        String cadena = "NSupplies: " + getNSupplies() + "\n NShields: " + getNShields() + 
        "\nNHangars: " + getNHangars() + "\nNMedals: " + getNMedals();

        return cadena;
    }

    LootToUI getUIversion(){
        return new LootToUI(this);
    }
}