package javapaquete;

import java.util.Random;

public class Dice {
        
    private final float NHANGARSPROB;
    private final float NSHIELDSPROB;
    private final float NWEAPONSPROB;
    private final float FIRSTSHOTPROB;

    private Random generator;
    //private double generator; //Debe ser una instancia de la clase Random (si no, una vez generado el objeto, siempre tiene la misma probabilidad en toda la partida)
    

    Dice(){
        //Random generator = new Random();
        NHANGARSPROB= 0.25f;
        NSHIELDSPROB= 0.25f;
        NWEAPONSPROB= 0.33f;
        FIRSTSHOTPROB= 0.5f;
        //this.generator = generator.nextDouble();
    }

    int  initWithNHangar(){
        double prob = this.generator.nextDouble();

        if(prob < NHANGARSPROB){
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
}
