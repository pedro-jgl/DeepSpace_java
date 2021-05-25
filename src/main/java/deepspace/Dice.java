package deepspace;

import java.util.Random;

public class Dice {
        
    private final float NHANGARSPROB;
    private final float NSHIELDSPROB;
    private final float NWEAPONSPROB;
    private final float FIRSTSHOTPROB;
    private final float EXTRAEFFICIENCYPROB;

    private Random generator;
    
    

    Dice(){
        NHANGARSPROB= 0.25f;
        NSHIELDSPROB= 0.25f;
        NWEAPONSPROB= 0.33f;
        FIRSTSHOTPROB= 0.5f;
        EXTRAEFFICIENCYPROB = 0.8f;
        this.generator = new Random();
    }

    public int initWithNHangar(){
        double prob = this.generator.nextDouble();

        if(prob <= NHANGARSPROB){
            return 0;
        }else{
            return 1;
        }
    }

    public int initWithNWeapons(){
        final float PROB_CASO1 = 1-2*NWEAPONSPROB;
        final float PROB_CASO2 = PROB_CASO1 + ( (1 - PROB_CASO1) / 2 );
        double prob = this.generator.nextDouble();

        if(prob <= PROB_CASO1){
            return 3;
        }else if (prob <= PROB_CASO2){
            return 1;
        }else{
            return 2;
        }
    }

    public int initWithNShields(){
        double prob = this.generator.nextDouble();

        if (prob <= NSHIELDSPROB){
            return 0;
        }else{
            return 1;
        }
    }

    public int whoStarts(int nPlayers){
        int player = this.generator.nextInt(nPlayers);
        return player;
    }

    public GameCharacter firstShot(){
        double prob = this.generator.nextDouble();
        GameCharacter firstshot = GameCharacter.SPACESTATION;

        if (prob > FIRSTSHOTPROB){
            firstshot = GameCharacter.ENEMYSTARSHIP;
        }

        return firstshot;
    }

    public boolean spaceStationMoves(float speed){
        //Cambiar la float prob con nextFloat();
        double prob = this.generator.nextDouble();
        //Comprobar excepción??

        if(prob <= speed){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString() {
        String cadena = "NHANGARSPROB: " + NHANGARSPROB +
        "\nNSHIELDSPROB: " + NSHIELDSPROB + "\nNWEAPONSPROB: " + NWEAPONSPROB + 
        "\nFIRSTSHOTPROB: " + FIRSTSHOTPROB; 

        return cadena;
    }

    public boolean extraEfficiency(){
        double prob = this.generator.nextDouble();
        
        return (prob <= EXTRAEFFICIENCYPROB);
    }
}