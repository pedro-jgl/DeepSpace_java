/**
 * @file TestP2.java
 * @author Daniel Pérez Ruiz
 * @version P-02
 * type : Java-Main
 */
package deepspace;

import java.util.ArrayList;

/**
 * @brief TEST DE DEEPSPACE 1
 */
public class TestP1 {
    //ATRIBUTOS DE CLASE
    private static String franja = "\n********************************************************************\n";
    private static String separator = "\n////////////////////////////////////////////////////////////////////\n";
    private static void titleTest(int i, String object, String type_test){
        System.out.println(franja + "TEST [" + i + "] "+ object +" : "+ type_test + franja);
    }
    
    //ATRIBUTOS DE INSTANCIA
    private ArrayList<Loot> loot = new ArrayList<>();
    private ArrayList<SuppliesPackage> suppliesPackage = new ArrayList<>();
    private ArrayList<Weapon> weapon = new ArrayList<>();
    private ArrayList<ShieldBooster> shieldBooster = new ArrayList<>();
    private Dice dice = null;
    private ArrayList<Hangar> hangar = new ArrayList<>();
    private ArrayList<Damage> damageNumeric = new ArrayList<>();
    private ArrayList<Damage> damageSpecific = new ArrayList<>();
    private ArrayList<EnemyStarShip> enemyStarShip = new ArrayList<>();
    private SpaceStation spaceStation = null;
    private GameUniverse gameUniverse = null;
    
    /**
     * @brief Constructor por defecto de la clase
     */
    TestP1(){
        loot = createLoot();
        suppliesPackage = createSuppliesPackage();
        weapon = createWeapon();
        shieldBooster = createShieldBooster();
        dice = new Dice();
        hangar = createHangar();
        damageNumeric = createDamageNumeric();
        damageSpecific = createDamageSpecific();
        enemyStarShip = createEnemyStarShip();
        spaceStation = new SpaceStation("DanielsP",suppliesPackage.get(1));
        gameUniverse = new GameUniverse();
    }
    
    /**
     * @brief Crea objetos loot para hacer el test
     * @return Array con loots
     */
    private ArrayList<Loot> createLoot(){
        ArrayList<Loot> loot = new ArrayList<>(); 
        Loot l1 = new Loot(1,2,3,4,5);
        Loot l2 = new Loot(4,5,6,7,8);
        Loot l3 = new Loot(7,8,9,10,11);
        
        loot.add(l1); loot.add(l2); loot.add(l3);
        
        return loot;
    }
    
    /**
     * @brief Crea objetos SuppliesPackage para hacer el test
     * @return Array con SuppliesPackage
     */
    private ArrayList<SuppliesPackage> createSuppliesPackage(){
        ArrayList<SuppliesPackage> supplies = new ArrayList<>();
        SuppliesPackage sp1 = new SuppliesPackage(2,3,5);
        SuppliesPackage sp2 = new SuppliesPackage(4,5,6);
        SuppliesPackage sp3 = new SuppliesPackage(7,8,9);
        
        supplies.add(sp1); supplies.add(sp2); supplies.add(sp3);
        
        return supplies;
    }
    
    /**
     * @brief Crea objetos Weapon para hacer el test
     * @return Array con Weapon
     */
    private ArrayList<Weapon> createWeapon(){
        ArrayList<Weapon> weapons = new ArrayList<>();
        Weapon w1 = new Weapon("W1",WeaponType.LASER,5);
        Weapon w2 = new Weapon("W2",WeaponType.MISSILE,7);
        Weapon w3 = new Weapon("W3",WeaponType.PLASMA,10);
        
        weapons.add(w1); weapons.add(w2); weapons.add(w3);
        
        return weapons;
    }
    
    /**
     * @brief Crea objetos ShieldBooster para hacer el test
     * @return Array con ShieldBooster
     */
    private ArrayList<ShieldBooster> createShieldBooster(){
        ArrayList<ShieldBooster> shields = new ArrayList<>();
        ShieldBooster s1 = new ShieldBooster("S1",2.0f,10);
        ShieldBooster s2 = new ShieldBooster("S2",3.0f,20);
        ShieldBooster s3 = new ShieldBooster("S3",4.0f,25);
        
        shields.add(s1); shields.add(s2); shields.add(s3);
        
        return shields;
    }
    
    /**
     * @brief Crea objetos Hangar para hacer el test
     * @return Array con Hangar
     */
    private ArrayList<Hangar> createHangar(){
        ArrayList<Hangar> hangars = new ArrayList<>();
        
        hangars.add(new Hangar(3));
        hangars.add(new Hangar(5));
        hangars.add(new Hangar(8));
        
        return hangars;
    }
    
    /**
     * @brief Crea objetos Damage Numeric para hacer el test
     * @return Array con Damage Numeric
     */
    private ArrayList<Damage> createDamageNumeric(){
        ArrayList<Damage> numeric = new ArrayList<>();
        
        numeric.add(new Damage(0,0));
        numeric.add(new Damage(2,4));
        numeric.add(new Damage(5,7));
        
        return numeric;
    }
    
    /**
     * @brief Crea objetos Damage Specific para hacer el test
     * @return Array con Damage Specific
     */
    private ArrayList<Damage> createDamageSpecific(){
        ArrayList<Damage> specific = new ArrayList<>();
        
        ArrayList<WeaponType> array1 = new ArrayList<>();
        ArrayList<WeaponType> array2 = new ArrayList<>();
        ArrayList<WeaponType> array3 = new ArrayList<>();
        ArrayList<WeaponType> array4 = new ArrayList<>();
        ArrayList<WeaponType> array5 = new ArrayList<>();
        ArrayList<WeaponType> array6 = new ArrayList<>();
        
        array1.add(WeaponType.LASER); array1.add(WeaponType.MISSILE); array1.add(WeaponType.PLASMA);
        for(int i=0; i<5; i++)
            array2.add(WeaponType.LASER);
        
        array3.add(WeaponType.LASER); array3.add(WeaponType.MISSILE); array3.add(WeaponType.MISSILE);
        array3.add(WeaponType.MISSILE); array3.add(WeaponType.PLASMA);
        
        array4.add(WeaponType.PLASMA);
        array5.add(WeaponType.LASER); array5.add(WeaponType.MISSILE);
        array6.add(WeaponType.PLASMA); array6.add(WeaponType.PLASMA);
        
        specific.add(new Damage(array1,0));
        specific.add(new Damage(array2,1));
        specific.add(new Damage(array3,2));
        specific.add(new Damage(array4,3));
        specific.add(new Damage(array5,0));
        specific.add(new Damage(array6,5));
        
        return specific;
    }
    
    /**
     * @brief Crea objetos EnemyStarShip para hacer el test
     * @return Array con EnemyStarShip
     */
    private ArrayList<EnemyStarShip> createEnemyStarShip(){
        ArrayList<EnemyStarShip> enemies = new ArrayList<>();
        
        ArrayList<Loot> loot = createLoot();
        ArrayList<Damage> damage1 = createDamageNumeric();
        ArrayList<Damage> damage2 = createDamageSpecific();
        
        enemies.add(new EnemyStarShip("E1",5,6,loot.get(0),new Damage(damage1.get(0))));
        enemies.add(new EnemyStarShip("E2",10,20,loot.get(1),new Damage(damage2.get(1))));
        enemies.add(new EnemyStarShip("E1",50,100,loot.get(2),new Damage(damage2.get(4))));
        
        return enemies;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    /**
     * @brief Test 1 -> Test Loot
     */
    private void testLoot(){
        /**
         * TESTS LOOT
         *  1: TO_S
         */
        
        int index = 1;
        String object = "LOOT";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.print(loot.get(0).toString());
        
    }
    
    /**
     * @brief Test 2 -> Test SuppliesPackage
     */
    private void testSuppliesPackage(){
        /**
         * TEST SUPPLIESPACKAGE
         *  1: TO_S
         *  2: CONSTRUCTOR COPIA
         */
        
        int index = 1;
        String object = "SUPPLIESPACKAGE";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(suppliesPackage.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "CONSTRUCTOR COPIA";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO A COPIAR:");
        System.out.println(suppliesPackage.get(0).toString());
        
        SuppliesPackage suppliesCopy = new SuppliesPackage(suppliesPackage.get(0));
        
        System.out.println("\n--> OBJETO COPIADO [SUPPLIESCOPY]:");
        System.out.println(suppliesCopy.toString());
    }
    
    /**
     * @brief Test 3 -> Test Weapon
     */
    private void testWeapon(){
        /**
         * TEST WEAPON:
         *  1: TO_S
         *  2: CONSTRUCTOR COPIA
         *  3: METODO USEIT SIN GASTAR WEAPON
         *  4: METODO USEIT GASTANDO WEAPON
         */
        
        int index = 1;
        String object = "WEAPON";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(weapon.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "CONSTRUCTOR COPIA";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO A COPIAR: ");
        System.out.println(weapon.get(1).toString());
        
        Weapon weaponCopy = new Weapon(weapon.get(1));
        
        System.out.println("--> OBJETO COPIADO [WEAPONCOPY]: ");
        System.out.println(weaponCopy.toString());
        
        System.out.println("--> MODIFICANDO OBJETO [WEAPONCOPY]...");
        weaponCopy.UseIt();
        
        System.out.println("--> COMPROBANDO INTEGRIDAD DE LAS COPIAS...");
        
        System.out.println("\n--> OBJETO ORIGINAL: ");
        System.out.println(weapon.get(1).toString());
        
        System.out.println("--> OBJETO COPIA: ");
        System.out.println(weaponCopy.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section =  "METODO USEIT SIN GASTAR ARMA";
        
        titleTest(index,object,section);
        System.out.println("--> WEAPON A USAR: ");
        System.out.println(weapon.get(2).toString());
        
        System.out.println("--> USANDO 4 VECES...");
        for(int i=1; i<=3; i++){
            weapon.get(2).UseIt();
        }
        System.out.println("\n--> POWER DE USEIT: " + weapon.get(2).UseIt());
        System.out.println("--> WEAPON TRAS 4 USOS: ");
        System.out.println(weapon.get(2).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section =  "METODO USEIT GASTANDO ARMA";
        
        titleTest(index,object,section);
        System.out.println("--> WEAPON A USAR: ");
        System.out.println(weapon.get(2).toString());
        
        System.out.println("--> USANDO 15 VECES...");
        for(int i=1; i<=14; i++){
            weapon.get(2).UseIt();
        }
        System.out.println("\n--> POWER DE USEIT: " + weapon.get(2).UseIt());
        System.out.println("--> WEAPON TRAS 15 USOS: ");
        System.out.println(weapon.get(2).toString());
    }
    
    /**
     * @brief Test 4 -> Test ShieldBooster
     */
    private void testShieldBooster(){
        /**
         * TEST SHIELDBOOSTER:
         *  1: TO_S
         *  2: CONSTRUCTOR COPIA
         *  3: METODO USEIT SIN GASTAR SHIELDBOOSTER
         *  4: METODO USEIT GASTANDO SHIELDBOOSTER
         */
        
        int index = 1;
        String object = "SHIELDBOOSTER";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(shieldBooster.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "CONSTRUCTOR COPIA";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO A COPIAR: ");
        System.out.println(shieldBooster.get(1).toString());
        
        ShieldBooster shieldCopy = new ShieldBooster(shieldBooster.get(1));
        
        System.out.println("--> OBJETO COPIADO [SHIELDCOPY]: ");
        System.out.println(shieldCopy.toString());
        
        System.out.println("--> MODIFICANDO OBJETO [SHIELDCOPY]...");
        shieldCopy.UseIt();
        
        System.out.println("--> COMPROBANDO INTEGRIDAD DE LAS COPIAS...");
        
        System.out.println("\n--> OBJETO ORIGINAL: ");
        System.out.println(shieldBooster.get(1).toString());
        
        System.out.println("--> OBJETO COPIA: ");
        System.out.println(shieldCopy.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section =  "METODO USEIT SIN GASTAR ARMA";
        
        titleTest(index,object,section);
        System.out.println("--> SHIELDBOOSTER A USAR: ");
        System.out.println(shieldBooster.get(2).toString());
        
        System.out.println("--> USANDO 20 VECES...");
        for(int i=1; i<=19; i++){
            shieldBooster.get(2).UseIt();
        }
        System.out.println("\n--> POWER DE USEIT: " + shieldBooster.get(2).UseIt());
        System.out.println("--> SHIELDBOOSTER TRAS 20 USOS: ");
        System.out.println(shieldBooster.get(2).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section =  "METODO USEIT GASTANDO ARMA";
        
        titleTest(index,object,section);
        System.out.println("--> SHIELDBOOSTER A USAR: ");
        System.out.println(shieldBooster.get(2).toString());
        
        System.out.println("--> USANDO 13 VECES...");
        for(int i=1; i<=12; i++){
            shieldBooster.get(2).UseIt();
        }
        System.out.println("\n--> POWER DE USEIT: " + shieldBooster.get(2).UseIt());
        System.out.println("--> SHIELDBOOSTER TRAS 13 USOS: ");
        System.out.println(shieldBooster.get(2).toString());
    }
    
    /**
     * @brief Test 5 -> Dice
     */
    private void testDice(){
        /**
         * TEST DICE:
         *  1: TO_S
         */
        
        int index = 1;
        String object = "DICE";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println("--> EJECUTANDO 10 VECES DADO...");
        
        for(int i=1; i<=10; i++){
            System.out.println(dice.toString());
        }
    }
    
    /**
     * @brief Test 6 -> Hangar
     */
    private void testHangar(){
        /**
         * TEST HANGAR:
         *  1: TO_S
         *  2: INSERTAR ELEMENTOS EN HANGAR
         *  3: LLENAR HANGAR
         *  4: ELIMINAR ELEMENTOS DEL HANGAR
         *  5: ELIMINAR ELEMENTOS QUE NO EXISTEN DEL HANGAR
         *  6: CONSTRUCTOR DE COPIA
         */
        
        int index = 1;
        String object = "HANGAR";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(hangar.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////

        index++;
        section = "INSERTAR ELEMENTOS EN EL HANGAR";
        
        titleTest(index,object,section);
        System.out.println("--> INSERTANDO WEAPON EN EL HANGAR");
        System.out.println(weapon.get(0).toString());
        
        System.out.println("--> ESPACIO DISPONIBLE TRAS INSERTAR WEAPON: " + hangar.get(0).addWeapon(weapon.get(0)));
        System.out.println("--> ESTADO DEL HANGAR TRAS LA INSERCIÓN:");
        System.out.println(hangar.get(0).toString());
                
        System.out.println("--> INSERTANDO SHIELDBOOSTER EN EL HANGAR");
        System.out.println(shieldBooster.get(0).toString());
        
        System.out.println("--> ESPACIO DISPONIBLE TRAS INSERTAR SHIELDBOOSTER: " + hangar.get(0).addShieldBooster(shieldBooster.get(0)));
        System.out.println("--> ESTADO DEL HANGAR TRAS LA INSERCIÓN:");
        System.out.println(hangar.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "LLENAR HANGAR A SU MAX CAPACIDAD";
        
        titleTest(index,object,section);
        System.out.println("--> INSERTANDO 10 WEAPONS EN EL HANGAR: ");
        for(int i=1; i<=10; i++){
            System.out.println("* ESPACIO DISPONIBLE TRAS INSERTAR WEAPON [" + i + "]: " + hangar.get(0).addWeapon(weapon.get(0)));
        }
        System.out.println("--> ESTADO DEL HANGAR TRAS LA INSERCIÓN");
        System.out.println(hangar.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "ELIMINAR ELEMENTOS DEL HANGAR";
        
        titleTest(index,object,section);
        System.out.println("--> ESTADO ACTUAL DEL HANGAR: ");
        System.out.println(hangar.get(0).toString());
        
        System.out.println("--> ELIMINANDO WEAPON[1] Y COPIANDO VARIABLE A [REMOVEDWEAPON]...");
        Weapon removedWeapon = hangar.get(0).removeWeapon(1);
        System.out.println("--> ARMA ELIMINADA [REMOVEDWEAPON]: ");
        System.out.println(removedWeapon.toString());
        
        System.out.println("--> ELIMINANDO SHIELD[0] Y COPIANDO VARIABLE A [REMOVEDSHIELD]...");
        ShieldBooster removedShield = hangar.get(0).removeShieldBooster(0);
        System.out.println("--> ESCUDO ELIMINADO [REMOVEDSHIELD]: ");
        System.out.println(removedShield.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "ELIMINAR ELEMENTOS QUE NO EXISTEN EN EL HANGAR";
        
        titleTest(index,object,section);
        System.out.println("--> ESTADO ACTUAL DEL HANGAR: ");
        System.out.println(hangar.get(0).toString());
        
        System.out.println("--> ELIMINANDO WEAPON[5] Y COPIANDO VARIABLE A [REMOVEDWEAPON]...");
        removedWeapon = hangar.get(0).removeWeapon(5);
        System.out.println("--> ARMA ELIMINADA [REMOVEDWEAPON]: ");
        
        if(removedWeapon != null)
            System.out.println(removedWeapon.toString());
        else
            System.out.println("Ninguna");
        
        System.out.println("--> ELIMINANDO SHIELD[7] Y COPIANDO VARIABLE A [REMOVEDSHIELD]...");
        removedShield = hangar.get(0).removeShieldBooster(7);
        System.out.println("--> ESCUDO ELIMINADO [REMOVEDSHIELD]: ");
        
        if(removedShield != null)
            System.out.println(removedShield.toString());
        else
            System.out.println("Ninguno");
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "CONSTRUCTOR COPIA";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO A COPIAR: ");
        System.out.println(hangar.get(0).toString());
        
        Hangar hangarCopy = new Hangar(hangar.get(0));
        System.out.println("--> OBJETO COPIADO [HANGARCOPY]: ");
        System.out.println(hangarCopy.toString());
        
        System.out.println("--> MODIFICANDO OBJETO [HANGARCOPY]...");
        System.out.println("--> INSERTANDO UN ESCUDO Y ELIMINANDO WEAPON[0] DE HANGAR COPY...");
        
        hangarCopy.removeWeapon(0);
        hangarCopy.addShieldBooster(shieldBooster.get(1));
        
        System.out.println("--> COMPROBANDO INTEGRIDAD DE LAS COPIAS...");
        System.out.println("--> OBJETO ORIGINAL: ");
        System.out.println(hangar.get(0).toString());
        System.out.println("--> OBJETO COPIA: ");
        System.out.println(hangarCopy.toString());
    }
    
    /**
     * @brief Test 7 -> Damage
     */
    private void testDamage(){
        /**
         * TEST :
         *  1: TO_S
         *  2: CONSTRUCTOR COPIA
         *  3: AJUSTE DAMAGE - OBJETO SIN EFECTO
         *  4: AJUSTE DAMAGE - SOLO EXISTEN SHIELDS
         *  5: AJUSTE DAMAGE - SOLO EXISTEN WEAPONS
         *  6: AJUSTE DAMAGE - SHIELDS Y WEAPONS
         */
        
        int index = 1;
        String object = "DAMAGE";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println("--> DAMAGE NUMERIC WEAPONS: ");
        System.out.println(damageNumeric.get(0).toString());
        
        System.out.println("--> DAMAGE SPECIFIC WEAPONS: ");
        System.out.println(damageSpecific.get(0).toString());
        
        ///////////////////////////////////////////////////////////////////////

        index++;
        section = "CONSTRUCTOR COPIA [NUMERIC WEAPONS]";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO A COPIAR: ");
        System.out.println(damageNumeric.get(1).toString());

        System.out.println("--> OBJETO COPIADO [NUMERICCOPY]: ");
        Damage numericCopy = new Damage(damageNumeric.get(1));
        System.out.println(numericCopy.toString());
        
        System.out.println("--> MODIFICANDO OBJETO [NUMERICCOPY]...");
        System.out.println("\n--> ELIMINANDO UN ESCUDO Y 2 WEAPONS...");
        
        numericCopy.discardShieldBooster();
        numericCopy.discardWeapon(null);
        numericCopy.discardWeapon(null);
        
        System.out.println("--> COMPROBANDO INTEGRIDAD DE LAS COPIAS...");
        System.out.println("\n--> OBJETO ORIGINAL: ");
        System.out.println(damageNumeric.get(1).toString());
        System.out.println("--> OBJETO COPIA [NUMERICCOPY]: ");
        System.out.println(numericCopy.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "CONSTRUCTOR COPIA [SPECIFIC WEAPONS]";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO A COPIAR: ");
        System.out.println(damageSpecific.get(2).toString());

        System.out.println("--> OBJETO COPIADO [SPECIFICCOPY]: ");
        Damage specificCopy = new Damage(damageSpecific.get(2));
        System.out.println(specificCopy.toString());
        
        System.out.println("--> MODIFICANDO OBJETO [SPECIFICCOPY]...");
        System.out.println("\n--> ELIMINANDO UN ESCUDO Y 3 WEAPONS [LASER,MISSILE,PLASMA]...");
        
        specificCopy.discardShieldBooster();
        specificCopy.discardWeapon(new Weapon("REMOVED",WeaponType.LASER,20));
        specificCopy.discardWeapon(new Weapon("REMOVED",WeaponType.MISSILE,20));
        specificCopy.discardWeapon(new Weapon("REMOVED",WeaponType.PLASMA,20));
        
        System.out.println("--> COMPROBANDO INTEGRIDAD DE LAS COPIAS...");
        System.out.println("\n--> OBJETO ORIGINAL: ");
        System.out.println(damageSpecific.get(2).toString());
        System.out.println("--> OBJETO COPIA [SPECIFICCOPY]: ");
        System.out.println(specificCopy.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "AJUSTE DAMAGE - SIN EFECTO";
        
        titleTest(index,object,section);
        System.out.println("--> NUMERIC DAMAGE RECIBIDO: ");
        System.out.println(damageNumeric.get(2).toString());
        
        ArrayList<Weapon> collectionWeapons = new ArrayList<>();
        ArrayList<ShieldBooster> collectionShields = new ArrayList<>();
        
        System.out.println("--> COLECCION DE WEAPONS: " + collectionWeapons.toString());
        System.out.println("--> COLLECCION DE SHIELDS: " + collectionShields.toString());
        
        Damage damageAdjust = damageNumeric.get(2).adjust(collectionWeapons,collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        System.out.println("\n--> SPECIFIC DAMAGE RECIBIDO: ");
        System.out.println(damageSpecific.get(1).toString());
        
        System.out.println("--> COLECCION DE WEAPONS: " + collectionWeapons.toString());
        System.out.println("--> COLLECCION DE SHIELDS: " + collectionShields.toString());
        
        damageAdjust = damageSpecific.get(1).adjust(collectionWeapons, collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "AJUSTE DAMAGE - SOLO EXISTEN SHIELDS";
        
        titleTest(index,object,section);
        System.out.println("--> NUMERIC DAMAGE RECIBIDO: ");
        System.out.println(damageNumeric.get(1).toString());
        
        collectionWeapons.clear();
        collectionShields.add(new ShieldBooster(shieldBooster.get(0)));
        collectionShields.add(new ShieldBooster(shieldBooster.get(1)));
        collectionShields.add(new ShieldBooster(shieldBooster.get(2)));
        
        System.out.println("--> COLECCION DE WEAPONS: ");
        if(collectionWeapons.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(Weapon w : collectionWeapons){
                System.out.println("--> " + w.getType());
            }
        }
        System.out.println("\n--> COLLECCION DE SHIELDS: ");
        if(collectionShields.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(ShieldBooster s : collectionShields){
                System.out.print("--> " + s.toString());
            }
        }
        
        damageAdjust = damageNumeric.get(1).adjust(collectionWeapons,collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        System.out.println("\n--> SPECIFIC DAMAGE RECIBIDO: ");
        System.out.println(damageSpecific.get(0).toString());
        
        System.out.println("--> COLECCION DE WEAPONS: ");
        if(collectionWeapons.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(Weapon w : collectionWeapons){
                System.out.println("--> " + w.getType());
            }
        }
        System.out.println("\n--> COLLECCION DE SHIELDS: ");
        if(collectionShields.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(ShieldBooster s : collectionShields){
                System.out.print("--> " + s.toString());
            }
        }
        
        damageAdjust = damageSpecific.get(0).adjust(collectionWeapons, collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        ///////////////////////////////////////////////////////////////////////

        index++;
        section = "AJUSTE DAMAGE - SOLO EXISTEN WEAPONS";
        
        titleTest(index,object,section);
        System.out.println("--> NUMERIC DAMAGE RECIBIDO: ");
        System.out.println(damageNumeric.get(2).toString());
        
        collectionShields.clear();
        collectionWeapons.add(new Weapon(weapon.get(1)));
        collectionWeapons.add(new Weapon(weapon.get(1)));
        collectionWeapons.add(new Weapon(weapon.get(2)));
        
        System.out.println("--> COLECCION DE WEAPONS: ");
        if(collectionWeapons.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(Weapon w : collectionWeapons){
                System.out.println("--> " + w.getType());
            }
        }
        System.out.println("\n--> COLLECCION DE SHIELDS: ");
        if(collectionShields.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(ShieldBooster s : collectionShields){
                System.out.println("--> " + s.toString());
            }
        }
        
        damageAdjust = damageNumeric.get(2).adjust(collectionWeapons,collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        System.out.println("\n--> SPECIFIC DAMAGE RECIBIDO: ");
        System.out.println(damageSpecific.get(1).toString());
        
        System.out.println("--> COLECCION DE WEAPONS: ");
        if(collectionWeapons.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(Weapon w : collectionWeapons){
                System.out.println("--> " + w.getType());
            }
        }
        System.out.println("\n--> COLLECCION DE SHIELDS: ");
        if(collectionShields.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(ShieldBooster s : collectionShields){
                System.out.println("--> " + s.toString());
            }
        }
        
        damageAdjust = damageSpecific.get(1).adjust(collectionWeapons, collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "AJUSTE DAMAGE - WEAPONS Y SHIELDS";
        
        titleTest(index,object,section);
        
        System.out.println("--> NUMERIC DAMAGE RECIBIDO: ");
        System.out.println(damageNumeric.get(1).toString());
        
        collectionWeapons.clear();
        collectionShields.clear();
        collectionWeapons.add(new Weapon(weapon.get(0)));
        collectionWeapons.add(new Weapon(weapon.get(1)));
        collectionWeapons.add(new Weapon(weapon.get(2)));
        collectionWeapons.add(new Weapon(weapon.get(2)));
        
        collectionShields.add(new ShieldBooster(shieldBooster.get(0)));
        collectionShields.add(new ShieldBooster(shieldBooster.get(1)));
        collectionShields.add(new ShieldBooster(shieldBooster.get(2)));
        
        System.out.println("--> COLECCION DE WEAPONS: ");
        if(collectionWeapons.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(Weapon w : collectionWeapons){
                System.out.println("--> " + w.getType());
            }
        }
        System.out.println("\n--> COLLECCION DE SHIELDS: ");
        if(collectionShields.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(ShieldBooster s : collectionShields){
                System.out.print("--> " + s.toString());
            }
        }
        
        damageAdjust = damageNumeric.get(1).adjust(collectionWeapons,collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
        
        System.out.println("\n--> SPECIFIC DAMAGE RECIBIDO: ");
        System.out.println(damageSpecific.get(2).toString());
        
        System.out.println("--> COLECCION DE WEAPONS: ");
        if(collectionWeapons.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(Weapon w : collectionWeapons){
                System.out.println("--> " + w.getType());
            }
        }
        System.out.println("\n--> COLLECCION DE SHIELDS: ");
        if(collectionShields.isEmpty()){
            System.out.println("Ninguno");
        }
        else{
            for(ShieldBooster s : collectionShields){
                System.out.print("--> " + s.toString());
            }
        }
        
        damageAdjust = damageSpecific.get(2).adjust(collectionWeapons, collectionShields);
        
        System.out.println("\n--> OBJETO DAMAGE AJUSTADO: ");
        System.out.println(damageAdjust.toString());
        System.out.println("--> TIENE EFECTO? : " + !damageAdjust.hasNoEffect());
    }
    
    /**
     * @brief Test 8 -> EnemyStarShip
     */
    private void testEnemyStarShip(){
        /**
         * TEST ENEMYSTARSHIP:
         *  1: TO_S
         *  2: CONSTRUCTOR COPIA
         *  3: RECEIVE SHOT METODO
         */
        
        int index = 1;
        String object = "ENEMYSTARSHIP";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(enemyStarShip.get(0));
        
        ///////////////////////////////////////////////////////////////////////

        index++;
        section = "CONSTRUCTOR COPIA";
        
        titleTest(index,object,section);
        System.out.println("--> OBJETO ORIGINAL: ");
        System.out.println(enemyStarShip.get(1).toString());
        
        EnemyStarShip enemyCopy = new EnemyStarShip(enemyStarShip.get(1));
        
        System.out.println("--> OBJETO COPIA [ENEMYCOPY]: ");
        System.out.println(enemyCopy.toString());
                
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "RECEIVE SHOT";
        
        titleTest(index,object,section);
        System.out.println("--> ENEMY: ");
        System.out.println(enemyStarShip.get(2).toString());
        
        System.out.println("--> SHOT RECEIVED [50] : RESIST? " + enemyStarShip.get(2).receiveShot(50f));
        System.out.println("--> SHOT RECEIVED [1000] : RESIST? " + enemyStarShip.get(2).receiveShot(1000f));
        
        ///////////////////////////////////////////////////////////////////////
    }
    
    /**
     * @brief Test 9 -> SpaceStation
     */
    private void testSpaceStation(){
        /**
         * TEST SPACESTATION:
         *  1: TO_S
         *  2: RECIBIR OBJETOS : ELEMENTOS SIN HANGAR
         *  3: RECIBIR OBJETOS : HANGAR
         *  4: RECIBIR OBJETOS : ELEMENTOS CON HANGAR
         *  5: RECIBIR OBJETOS : SUPPLIESPACKAGE
         *  6: MONTAR ELEMENTOS A LA NAVE
         *  7: LIMPIAR ELEMENTOS MONTADOS SIN USOS
         *  8: RECIBIR DAMAGE
         *  9: DESCARTAR HANGAR
         */
        
        int index = 1;
        String object = "SPACESTATION";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(spaceStation.toString());
        
        ///////////////////////////////////////////////////////////////////////

        index++;
        section = "RECIBIR OBJETOS : ELEMENTOS SIN HANGAR";
        
        titleTest(index,object,section);
        if(spaceStation.getHangar() == null){
            System.out.println("--> SPACESTATION POSEE HANGAR? : NO");
        }
        else{
            System.out.println("--> SPACESTATION POSEE HANGAR? : SI");
            System.out.println(spaceStation.getHangar().toString());
        }
        
        System.out.println("--> WEAPON A RECIBIR: ");
        System.out.println(weapon.get(2).toString());
        System.out.println("--> RECIBIENDO WEAPON...");
        System.out.println("--> WEAPON RECIBIDO ? : " + spaceStation.receiveWeapon(weapon.get(2)));
        
        System.out.println("--> SHIELDBOOSTER A RECIBIR: ");
        System.out.println(shieldBooster.get(2).toString());
        System.out.println("--> RECIBIENDO SHIELDBOOSTER...");
        System.out.println("--> SHIELDBOOSTER RECIBIDO ? : " + spaceStation.receiveShieldBooster(shieldBooster.get(2)));
                
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "RECIBIR OBJETOS : HANGAR";
        
        titleTest(index,object,section);
        if(spaceStation.getHangar() == null){
            System.out.println("--> SPACESTATION POSEE HANGAR? : NO");
        }
        else{
            System.out.println("--> SPACESTATION POSEE HANGAR? : SI");
            System.out.println(spaceStation.getHangar().toString());
        }
        
        System.out.println("--> HANGAR A RECIBIR: ");
        System.out.println(hangar.get(1).toString());
        spaceStation.receiveHangar(hangar.get(1));
        
        if(spaceStation.getHangar() == null){
            System.out.println("--> SPACESTATION POSEE HANGAR? : NO");
        }
        else{
            System.out.println("--> SPACESTATION POSEE HANGAR? : SI");
            System.out.println(spaceStation.getHangar().toString());
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "RECIBIR OBJETOS : ELEMENTOS CON HANGAR";
        
        titleTest(index,object,section);
        System.out.println("--> WEAPON A RECIBIR: ");
        System.out.println(weapon.get(2).toString());
        System.out.println("--> RECIBIENDO WEAPON...");
        System.out.println("--> WEAPON RECIBIDO ? : " + spaceStation.receiveWeapon(weapon.get(2)));
        
        System.out.println("--> SHIELDBOOSTER A RECIBIR: ");
        System.out.println(shieldBooster.get(2).toString());
        System.out.println("--> RECIBIENDO SHIELDBOOSTER...");
        System.out.println("--> SHIELDBOOSTER RECIBIDO ? : " + spaceStation.receiveShieldBooster(shieldBooster.get(2)));
        
        System.out.println("--> RECIBIENDO 4 WEAPONS Y 3 SHIELDBOOSTERS...");
        for(int i=1; i<=10; i++){
            weapon.get(0).UseIt();
            shieldBooster.get(0).UseIt();
        }
        
        for(int i=1; i<=7; i++){
            spaceStation.receiveWeapon(new Weapon(weapon.get(i%3)));
            spaceStation.receiveShieldBooster(new ShieldBooster(shieldBooster.get(i%3)));
        }
        
        System.out.println("--> ESTADO ACTUAL DE SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "RECIBIR ELEMENTOS : SUPPLIESPACKAGE";
        
        titleTest(index,object,section);
        System.out.println("--> PAQUETE DE SUMINISTROS A RECIBIR: ");
        System.out.println(suppliesPackage.get(1).toString());
        
        System.out.println("--> RECIBIENDO PAQUETE...");
        spaceStation.receiveSupplies(suppliesPackage.get(1));
        
        System.out.println("--> ESTADO ACTUAL DE SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        ///////////////////////////////////////////////////////////////////////

        index++;
        section = "MONTAR ELEMENTOS A LA NAVE";
        
        titleTest(index,object,section);
        System.out.println("--> MONTANDO WEAPON[1] A LA NAVE...");
        spaceStation.mountWeapon(1);
        
        System.out.println("--> MONTANDO WEAPON[10] A LA NAVE...");
        spaceStation.mountWeapon(10);
        
        System.out.println("--> MONTANDO SHIELDBOOSTER[1] A LA NAVE...");
        spaceStation.mountShieldBooster(1);
        
        System.out.println("--> MONTANDO SHIELDBOOSTER[10] A LA NAVE...");
        spaceStation.mountShieldBooster(10);
        
        System.out.println("--> ESTADO ACTUAL DE SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "LIMPIAR ELEMENTOS SIN USOS";
        
        titleTest(index,object,section);
        System.out.println("--> MONTANDO WEAPON[0] Y SHIELDBOOSTER[0]");
        spaceStation.mountWeapon(0);
        spaceStation.mountShieldBooster(0);
        
        System.out.println("--> ESTADO ACTUAL DE SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        System.out.println("--> LIMPIANDO ELEMENTOS SIN USOS...");
        spaceStation.cleanUpMountedItems();
        
        System.out.println("--> ESTADO TRAS BORRAR ELEMENTOS SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "RECIBIR DAMAGE";
        
        titleTest(index,object,section);
        System.out.println("--> DAMAGE A RECIBIR: ");
        System.out.println(damageSpecific.get(0).toString());
        spaceStation.setPendingDamage(damageSpecific.get(0));
        
        System.out.println("--> ESTADO ACTUAL DE SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        System.out.println("--> ESTADO VALIDO DE SPACESTATION ? : " + spaceStation.validState());
                
        System.out.println("--> DAMAGE A RECIBIR: ");
        System.out.println(damageSpecific.get(4));
        
        spaceStation.setPendingDamage(damageSpecific.get(4));
        
        System.out.println("--> ESTADO ACTUAL DE SPACESTATION: ");
        System.out.println(spaceStation.toString());
        
        System.out.println("--> ESTADO VALIDO DE SPACESTATION ? : " + spaceStation.validState());
        
        ///////////////////////////////////////////////////////////////////////
        
        index++;
        section = "DESCARTAR HANGAR";
        
        titleTest(index,object,section);
        System.out.println("--> DESCARTANDO HANGAR...");
        spaceStation.discardHangar();
        
        if(spaceStation.getHangar() == null){
            System.out.println("--> SPACESTATION POSEE HANGAR ? : NO");
        }
        else{
            System.out.println("--> SPACESTATION POSEE HANGAR ? : SI");
            System.out.println(spaceStation.getHangar().toString());
        }
    }
    
    /**
     * @brief Test 10 -> GameUniverse
     */
    private void testGameUniverse(){
        /**
         * TEST GAMEUNIVERSE:
         *  1: TO_S
         */
        
        int index = 1;
        String object = "GAMEUNIVERSE";
        String section = "METODO TO_S";
        
        titleTest(index,object,section);
        System.out.println(gameUniverse.toString());
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void init(ArrayList<Integer> array){
        if(array.contains(1)){
            testLoot();
            System.out.println(separator);
        }
        if(array.contains(2)){
            testSuppliesPackage();
            System.out.println(separator);
        }
        if(array.contains(3)){
            testWeapon();
            System.out.println(separator);
        }
        if(array.contains(4)){
            testShieldBooster();
            System.out.println(separator);
        }
        if(array.contains(5)){
            testDice();
            System.out.println(separator);
        }
        if(array.contains(6)){
            testHangar();
            System.out.println(separator);
        }
        if(array.contains(7)){
            testDamage();
            System.out.println(separator);
        }
        if(array.contains(8)){
            testEnemyStarShip();
            System.out.println(separator);
        }
        if(array.contains(9)){
            testSpaceStation();
            System.out.println(separator);
        }
        if(array.contains(10)){
            testGameUniverse();
            System.out.println(separator);
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Usa este array para indicar los test que quieres ejecutar
         * TEST Y SU CORRESPONDIENTE OPCION
         *  ->  1: Test Loot
         *  ->  2: Test SuppliesPackage
         *  ->  3: Test Weapon
         *  ->  4: Test ShieldBooster
         *  ->  5: Test Dice
         *  ->  6: Test Hangar
         *  ->  7: Test Damage
         *  ->  8: Test EnemyStarShip
         *  ->  9: Test SpaceStation
         *  -> 10: Test GameUniverse
         */
        TestP1 test = new TestP1();
        
        
        ArrayList<Integer> array = new ArrayList<>();
        //COMENTA LAS OPCIONES QUE NO QUIERAS EJECUTAR
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        
        test.init(array);
    }
}