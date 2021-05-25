package deepspace;

import java.util.ArrayList;

public class SpecificDamage extends Damage{
    private ArrayList<WeaponType> weapons;

    SpecificDamage(ArrayList<WeaponType> wl, int s){
        super(s);
        weapons = new ArrayList<WeaponType>(wl);
    }

    SpecificDamage(SpecificDamage danio){
        super(danio.nShields);
        weapons = new ArrayList<WeaponType>();
        if (danio.weapons != null)
            for (int i = 0; i < danio.weapons.size(); i++)
                weapons.add(danio.weapons.get(i));
    }

    @Override
    public SpecificDamage copy(){
        return new SpecificDamage(this);
    }

    @Override
    public void discardWeapon(Weapon w){
        weapons.remove(w.getType());
    }

    @Override
    public boolean hasNoEffect(){
        boolean noeffect = getNShields() == 0 && getWeapons().isEmpty();

        return noeffect;
    }

    public ArrayList<WeaponType> getWeapons(){
        return weapons;

    }

    @Override
    public SpecificDamage adjust(ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        SpecificDamage danio = copy();
        int indice;
        
        danio.adjust_shields(s);
                    
        ArrayList<Weapon> copiaw = new ArrayList<Weapon>();
            
        for(int i=0; i<w.size(); i++){
            copiaw.add(w.get(i));
        }

        for (int i = 0; i < danio.getWeapons().size(); ){
            indice = arrayContainsType(copiaw, danio.getWeapons().get(i));

            if (indice == -1){
                danio.weapons.remove(i);
            }else{
                copiaw.remove(indice);
                i++;
            }
        }
        
        return danio;
    }

    private int arrayContainsType(ArrayList<Weapon> w, WeaponType t){
        ArrayList<WeaponType> weaptype = new ArrayList<WeaponType>();    
        int index = -1;

        for (int i = 0; i < w.size(); i++){
            weaptype.add(w.get(i).getType());
        }

        index = weaptype.indexOf(t);
        
        return index;
    }

    @Override
    public DamageToUI getUIversion(){
        return new SpecificDamageToUI(this);
    }

    @Override
    public String toString(){
        String cadena = super.toString();
            cadena += ", tipos de armas a descartar: ";

            for (int i = 0; i < weapons.size(); i++){
                cadena += "Arma " + (i+1) + ": ";
                cadena += weapons.get(i).toString();
                cadena += "\n";
            }
            
        return cadena;
    }
}
