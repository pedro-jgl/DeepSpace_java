package deepspace;

public class PowerEfficientSpaceStation extends SpaceStation{
    static final float EFFICIENCYFACTOR = 1.10f;

    PowerEfficientSpaceStation(SpaceStation station){
        super(station);
    }

    @Override
    public float fire(){
        return super.fire()*EFFICIENCYFACTOR;
    }

    @Override
    public float protection(){
        return super.protection()*EFFICIENCYFACTOR;
    }

    @Override
    public Transformation setLoot(Loot loot){
        super.setLoot(loot);
        
        if(loot.getEfficient())
            return Transformation.GETEFFICIENT;
        else
            return Transformation.NOTRANSFORM;
    
    }

    @Override
    public PowerEfficientSpaceStationToUI getUIversion(){
        return new PowerEfficientSpaceStationToUI(this);
    }
}
