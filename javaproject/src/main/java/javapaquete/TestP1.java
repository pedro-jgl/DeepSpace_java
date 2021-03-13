package javapaquete;

public class TestP1 {
    public static void main(String[] args){
        final int VECES_A_TIRAR = 100;
        final int PLAYERS = 3;  
        final float SPEED = 0.25f;
        
        Dice dado1 = new Dice();
        Loot lote = new Loot(0,1,10,3,5);
        ShieldBooster escudo2 = new ShieldBooster("nombre", 0.5f, 0);
        SuppliesPackage paquete2 = new SuppliesPackage(2.0f,2.0f,2.0f);
        Weapon arma2 = new Weapon("Pistola", WeaponType.LASER, 1);
        
        SuppliesPackage paquete = new SuppliesPackage(paquete2);
        Weapon arma = new Weapon(arma2);
        ShieldBooster escudo = new ShieldBooster(escudo2);
        
        System.out.println("Dado Hangar: " + dado1.initWithNHangar());
        System.out.println("Dado Escudo: " + dado1.initWithNShields());
        System.out.println("Dado Arma: " + dado1.initWithNWeapons());
        System.out.println("Dado Empieza: " + dado1.whoStarts(3));
        System.out.println("Dado Se Mueve: " + dado1.spaceStationMoves(0.7f));
        System.out.println("Dado Primer Tiro: " + dado1.firstShot());
    
        System.out.println("Loot Hangars: " + lote.getNHangars());
        System.out.println("Loot Medals: " + lote.getNMedals());
        System.out.println("Loot Shields: " + lote.getNShields());
        System.out.println("Loot Supplies: " + lote.getNSupplies());
        System.out.println("Loot Weapons: " + lote.getNWeapons());

        System.out.println("Escudo Boost: " + escudo.getBoost());
        System.out.println("Escudo Usos: " + escudo.getUses());
        System.out.println("Escudo Usar: " + escudo.UseIt());
        System.out.println("Escudo Usos: " + escudo.getUses());


        System.out.println("Paquete Potencia: " + paquete.getAmmoPower());
        System.out.println("Paquete Combustible: " + paquete.getFuelUnits());
        System.out.println("Paquete Escudo: " + paquete.getShieldPower());

        System.out.println("Weapon Uses: " + arma.getUses());
        System.out.println("Weapon Usar: " + arma.UseIt());
        System.out.println("Weapon Uses: " + arma.getUses());
        System.out.println("Weapon WeaponType: " + arma.getWeaponType());
        System.out.println("Weapon power: " + arma.power());
        

        Dice dado = new Dice();
        int nhangar = 0;
        int nescudo = 0;
        int arma_1 = 0;
        int arma_2 = 0;
        int empieza_pl1 = 0;
        int empieza_pl2 = 0;
        int tiro = 0;
        int semueve = 0;
        int aux;

        for(int i = 0; i < VECES_A_TIRAR; i++){
            if(dado.initWithNHangar() == 1)
                nhangar ++;
            
            if(dado.initWithNShields() == 1)
                nescudo ++;
            
            aux = dado.initWithNWeapons();
            if(aux == 1)
                arma_1 ++;
            else if(aux == 2)
                arma_2 ++;
            

            switch (dado.whoStarts(PLAYERS)) {
                case 1:
                    empieza_pl1 ++;
                    break;
                case 2:
                    empieza_pl2 ++;
                    break;
            }
            
            if(dado.spaceStationMoves(SPEED) == true)
                semueve ++;
            
            if(dado.firstShot() == GameCharacter.SPACESTATION)
                tiro ++;
        }
        
        
        System.out.println("Número de Hangars con resultado 1: " + nhangar);
        System.out.println("Número de Hangars con resultado 0: " + (VECES_A_TIRAR - nhangar));
        System.out.println("Número de Shields con resultado 1: " + nescudo);
        System.out.println("Número de Shields con resultado 0: " + (VECES_A_TIRAR - nescudo));
        System.out.println("Número de Weapons con resultado 3: " + arma_1);
        System.out.println("Número de Weapons con resultado 2: " + arma_2);
        System.out.println("Número de Weapons con resultado 1: " + (VECES_A_TIRAR - arma_1 - arma_2));
        System.out.println("Empieza jugador número 1: " + empieza_pl1);
        System.out.println("Empieza jugador número 2: " + empieza_pl2);
        System.out.println("Empieza jugador número 3: " + (VECES_A_TIRAR - empieza_pl1 - empieza_pl2));
        System.out.println("Primer tiro ESTACIÓN: " + tiro);
        System.out.println("Primer tiro VILLANOS: " + (VECES_A_TIRAR - tiro));
        System.out.println("Número de veces que se mueve: " + semueve);
        System.out.println("Número de veces que no se mueve: " + (VECES_A_TIRAR - semueve));
    }
}
