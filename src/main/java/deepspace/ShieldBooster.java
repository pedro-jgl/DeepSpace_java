package deepspace;

public class ShieldBooster {
    private String name;
    private float boost;
    private int uses;

    ShieldBooster(String name, float boost, int uses){
        this.name = name;
        this.boost = boost;
        this.uses = uses;
    }

    ShieldBooster(ShieldBooster s){
        this.name = s.name;
        this.boost = s.boost;
        this.uses = s.uses;
    }
    
    public float getBoost(){
        return boost;
    }
    
    public int getUses(){
        return uses;
    }
    
    public float UseIt(){
        final float ZERO_USES = 1.0f;

        if(this.uses > 0){
            uses--;
            return this.boost;
        }
        else{
            return ZERO_USES;
        }

    }

    public String toString() {
        String cadena = "Name: " + name + "\nBoost: " + getBoost() + "\nUses: " + getUses();
        
        return cadena;
    }

    ShieldToUI getUIversion(){
        return new ShieldToUI(this);
    }
}