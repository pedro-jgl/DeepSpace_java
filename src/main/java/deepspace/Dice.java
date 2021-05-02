package deepspace;

import java.util.Random;

public class Dice {
        
    private final float NHANGARSPROB;
    private final float NSHIELDSPROB;
    private final float NWEAPONSPROB;
    private final float FIRSTSHOTPROB;

    private Random generator;
    
    

    Dice(){
        NHANGARSPROB= 0.25f;
        NSHIELDSPROB= 0.25f;
        NWEAPONSPROB= 0.33f;
        FIRSTSHOTPROB= 0.5f;
        this.generator = new Random();
    }

    int initWithNHangar(){
        double prob = this.generator.nextDouble();

        if(prob <= NHANGARSPROB){
            return 0;
        }else{
            return 1;
        }
    }

    int initWithNWeapons(){
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

    int initWithNShields(){
        double prob = this.generator.nextDouble();

        if (prob <= NSHIELDSPROB){
            return 0;
        }else{
            return 1;
        }
    }

    int whoStarts(int nPlayers){
        int player = this.generator.nextInt(nPlayers);
        //player++;
        return player;
    }

    GameCharacter firstShot(){
        double prob = this.generator.nextDouble();
        GameCharacter firstshot = GameCharacter.SPACESTATION;

        if (prob > FIRSTSHOTPROB){
            firstshot = GameCharacter.ENEMYSTARSHIP;
        }

        return firstshot;
    }

    boolean spaceStationMoves(float speed){
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
}