package javapaquete;

import java.util.Random;

public class Dice {
        
    private final float NHANGARSPROB;
    private final float NSHIELDSPROB;
    private final float NWEAPONSPROB;
    private final float FIRSTSHOTPROB;

    private double generator;
    

    Dice(){
        Random generator = new Random();

        NHANGARSPROB= 0.25f;
        NSHIELDSPROB= 0.25f;
        NWEAPONSPROB= 0.33f;
        FIRSTSHOTPROB= 0.5f;
        this.generator = generator.nextDouble();
    }

    int  initWithNHangar(){
        if(this.generator < NHANGARSPROB){
            return 0;
        }else{
            return 1;
        }
    }

    int initWithNWeapons(){
        final float PROB1 = 1-2*NWEAPONSPROB;
        final float PROB2 = PROB1 + ( (1 - PROB1) / 2 );

        if(this.generator <= PROB1){
            return 3;
        }else if (this.generator <= PROB2){
            return 1;
        }else{
            return 2;
        }
    }
}
