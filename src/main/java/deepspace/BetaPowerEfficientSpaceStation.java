package deepspace;

public class BetaPowerEfficientSpaceStation extends PowerEfficientSpaceStation{
    static final float EXTRAEFFICIENCY = 1.2f;


    //Como hacer que una  PowerEfficientSpaceStation  podría transformase en unaBetaPowerEfficientSpaceStation y viceversa
    BetaPowerEfficientSpaceStation(SpaceStation station){
        super(station);
    }

    @Override
    public float fire(){
        Dice dado = new Dice();

        if(dado.extraEfficiency()){
            return super.fire()*EXTRAEFFICIENCY;
        }else
            return super.fire(); 
    }

    @Override
    public BetaPowerEfficientSpaceStationToUI getUIversion(){
        return new BetaPowerEfficientSpaceStationToUI(this);
    }
}
