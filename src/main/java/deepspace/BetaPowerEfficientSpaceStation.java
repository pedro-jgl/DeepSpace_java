package deepspace;

public class BetaPowerEfficientSpaceStation extends PowerEfficientSpaceStation{
    static final float EXTRAEFFICIENCY = 1.2f;
    private Dice dice = new Dice();

    //Como hacer que una  PowerEfficientSpaceStation  podría transformase en una BetaPowerEfficientSpaceStation y viceversa
    BetaPowerEfficientSpaceStation(SpaceStation station){
        super(station);
    }

    @Override
    public float fire(){
        if(dice.extraEfficiency())
            return super.fire()*EXTRAEFFICIENCY;
        
        return super.fire();
    }

    @Override
    public BetaPowerEfficientSpaceStationToUI getUIversion(){
        return new BetaPowerEfficientSpaceStationToUI(this);
    }

    @Override
    public String toString(){
        return "BETA " + super.toString();
    }
}
