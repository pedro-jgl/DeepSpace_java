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

        return Transformation.NOTRANSFORM;
    }
}
