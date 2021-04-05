package deepspace;

import java.util.ArrayList;

public class GameUniverse {
    private final int WIN = 10;

    private int turns;
    private int currentStationIndex;
    private Dice dice;
    private SpaceStation currentStation;
    private EnemyStarShip currentEnemy;
    private ArrayList<SpaceStation> spaceStations;
    private GameStateController gameState;
    
    GameUniverse(){
        turns = 0;
        dice = new Dice();
        gameState = new GameStateController();

    }
    
    public CombatResult combat(){
        throw new UnsupportedOperationException();
    }

    CombatResult combat(SpaceStation station, EnemyStarShip enemy){
        throw new UnsupportedOperationException();
    }

    public void discardHangar(){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.discardHangar();
    }

    public void discardShieldBooster(int i){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.discardShieldBooster(i);
    }

    public void discardShieldBoosterInHangar(int i){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.discardShieldBoosterInHangar(i);
    }
    
    public void discardWeapon(int i){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.discardWeapon(i);
    }

    public void discardWeaponInHangar(int i){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.discardShieldBoosterInHangar(i);
    }
    
    public GameState getState(){
        return gameState.getState();
    }


    public GameUniverseToUI getUIversion(){
        return new GameUniverseToUI(this.currentStation, this.currentEnemy);
    }

    public boolean haveAWinner(){
        if(currentStation.getNMedals() == WIN)
            return true;
        else
            return false;
    }


    public void init(ArrayList<String> names){
        throw new UnsupportedOperationException();
    }

    public void mountShieldBooster(int i){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.mountShieldBooster(i);
    }

    public void mountWeapon(int i){
        if (getState() == GameState.INIT || getState() == GameState.AFTERCOMBAT)
            currentStation.mountWeapon(i);
    }
    
    public boolean nextTurn(){
        throw new UnsupportedOperationException();
    }

}
