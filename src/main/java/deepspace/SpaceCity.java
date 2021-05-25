package deepspace;

import java.util.ArrayList;

public class SpaceCity extends SpaceStation{
    private ArrayList<SpaceStation> collaborators;
    private SpaceStation base;

    SpaceCity(SpaceStation b, ArrayList<SpaceStation> rest){
        super(b);
        this.base = b;
        collaborators = new ArrayList<SpaceStation>(rest);        
    }

    
    public ArrayList<SpaceStation> getCollaborators(){
        return collaborators;
    }

    @Override
    public float fire(){
        float f = super.fire();
        
        for(int i=0; i<collaborators.size(); i++){
            f += collaborators.get(i).fire();
        }

        return f;
    }

    @Override
    public float protection(){
        float p = super.protection();

        for(int i=0; i<collaborators.size(); i++){
            p += collaborators.get(i).protection();
        }

        return p;
    }

    @Override
    public Transformation setLoot(Loot loot){
        super.setLoot(loot);

        return Transformation.NOTRANSFORM;
    }

    @Override
    public SpaceCityToUI getUIversion(){
        return new SpaceCityToUI(this);
    }
}
