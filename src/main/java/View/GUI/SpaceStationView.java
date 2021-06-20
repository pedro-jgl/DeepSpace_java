/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI;

import controller.Controller;
import deepspace.SpaceStationToUI;
import java.awt.Component;
import java.util.ArrayList;


public class SpaceStationView extends javax.swing.JPanel {
    private DamageView pendingDamageView;
    private HangarView hangarView;
    /**
     * Creates new form StationPanel
     */
    public SpaceStationView() {
        initComponents();
    }
    
    public void setSpaceStationView(SpaceStationToUI sp) {
        //Implementar
        stationName_label.setText(sp.getName());
        ammoPower_label.setText(String.valueOf(sp.getAmmoPower())); 
        shieldPower_label.setText(String.valueOf(sp.getShieldPower()));
        fuel_label.setText(String.valueOf(sp.getFuelUnits()));
        medals_label.setText(String.valueOf(sp.getnMedals()));
        
        pendingDamageView = new DamageView();
        damage_panel.add(pendingDamageView);
        
        hangarView = new HangarView();
        hangar_panel.add(hangarView);
        
        for(int i = 0; i < sp.getWeapons().size(); i++){
            WeaponView weapv = new WeaponView();
            weapv.setWeaponView(sp.getWeapons().get(i));
            fire_panel.add(weapv);
        }
        for(int i = 0; i < sp.getShieldBoosters().size(); i++){
            ShieldView shieldv = new ShieldView();
            shieldv.setShieldView(sp.getShieldBoosters().get(i));
            defense_panel.add(shieldv);
        }
        
    }
    
    public ArrayList<Integer> getSelectedWeapons(){
        ArrayList<Integer> weaponsSelected = new ArrayList<>();
        
        for(int i=0; i<fire_panel.getComponentCount(); i++){
            Component c = fire_panel.getComponent(i);
            
            if(((CombatElementView) c).isSelected()){
                weaponsSelected.add(i);
            }
        
        }
        
        
        return weaponsSelected;
    }
    
    public ArrayList<Integer> getSelectedShields(){
        ArrayList<Integer> shieldsSelected = new ArrayList<>();
        
        for(int i=0; i<defense_panel.getComponentCount(); i++){
            Component c = defense_panel.getComponent(i);
            
            if(((CombatElementView) c).isSelected()){
                shieldsSelected.add(i);
            }
        
        }
        return shieldsSelected;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fire_label = new javax.swing.JLabel();
        defense_label = new javax.swing.JLabel();
        hangar_label = new javax.swing.JLabel();
        hangarSize_label = new javax.swing.JLabel();
        hangar2_label = new javax.swing.JLabel();
        castigo_label = new javax.swing.JLabel();
        defensa_label = new javax.swing.JLabel();
        combustible_label = new javax.swing.JLabel();
        medallas_label = new javax.swing.JLabel();
        armas_label = new javax.swing.JLabel();
        stationName_label = new javax.swing.JLabel();
        ammoPower_label = new javax.swing.JLabel();
        shieldPower_label = new javax.swing.JLabel();
        fuel_label = new javax.swing.JLabel();
        medals_label = new javax.swing.JLabel();
        fire_panel = new javax.swing.JScrollPane();
        defense_panel = new javax.swing.JScrollPane();
        hangar_panel = new javax.swing.JScrollPane();
        damage_panel = new javax.swing.JScrollPane();
        equipar_button = new javax.swing.JButton();
        descartar_button = new javax.swing.JButton();
        descartarHangar_button = new javax.swing.JButton();

        fire_label.setText("Potenciadores de Fuego");

        defense_label.setText("Potenciadores de Defensa");

        hangar_label.setText("Hangar con");

        hangarSize_label.setText("jLabel4");

        hangar2_label.setText("lugares");

        castigo_label.setText("Castigo Pendiente");

        defensa_label.setText("Potencia de Defensa:");

        combustible_label.setText("Nivel de Combustible:");

        medallas_label.setText("Medallas:");

        armas_label.setText("Potencia de Armas:");

        stationName_label.setText("jLabel6");

        ammoPower_label.setText("jLabel6");

        shieldPower_label.setText("jLabel7");

        fuel_label.setText("jLabel8");

        medals_label.setText("jLabel9");

        equipar_button.setText("Equipar");
        equipar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipar_buttonActionPerformed(evt);
            }
        });

        descartar_button.setText("Descartar");
        descartar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartar_buttonActionPerformed(evt);
            }
        });

        descartarHangar_button.setText("Descartar Hangar Completo");
        descartarHangar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartarHangar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medallas_label)
                            .addComponent(stationName_label)
                            .addComponent(combustible_label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(armas_label)
                                .addComponent(defensa_label)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shieldPower_label)
                            .addComponent(ammoPower_label)
                            .addComponent(fuel_label)
                            .addComponent(medals_label))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(damage_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(castigo_label))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equipar_button)
                                .addGap(79, 79, 79)
                                .addComponent(descartar_button)
                                .addGap(71, 71, 71)
                                .addComponent(descartarHangar_button))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(defense_label)
                                .addComponent(fire_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addComponent(defense_panel))
                            .addComponent(hangar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hangar_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hangarSize_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hangar2_label))
                            .addComponent(fire_label))
                        .addGap(0, 59, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(castigo_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stationName_label))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(armas_label)
                            .addComponent(ammoPower_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(defensa_label)
                            .addComponent(shieldPower_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combustible_label)
                            .addComponent(fuel_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medallas_label)
                            .addComponent(medals_label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(damage_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(fire_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fire_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(defense_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defense_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hangar_label)
                    .addComponent(hangarSize_label)
                    .addComponent(hangar2_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hangar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipar_button)
                    .addComponent(descartar_button)
                    .addComponent(descartarHangar_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void equipar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipar_buttonActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> weaponsSelected = new ArrayList<>();
        ArrayList<Integer> shieldsSelected = new ArrayList<>();
        
        hangarView.getSelectedInHangar(weaponsSelected, shieldsSelected);
        
        Controller.getInstance().mount(weaponsSelected, shieldsSelected);
        
        MainWindow.getInstance().updateView();
    }//GEN-LAST:event_equipar_buttonActionPerformed

    private void descartar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartar_buttonActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> weaponsSelected = getSelectedWeapons();
        ArrayList<Integer> shieldsSelected = getSelectedShields();
        
        
        Controller.getInstance().discard(Controller.WEAPON, weaponsSelected, shieldsSelected);
        Controller.getInstance().discard(Controller.SHIELD, weaponsSelected, shieldsSelected);
        
        weaponsSelected.clear();
        shieldsSelected.clear();
        
        hangarView.getSelectedInHangar(weaponsSelected, shieldsSelected);
        Controller.getInstance().discard(Controller.HANGAR, weaponsSelected, shieldsSelected);
        
        MainWindow.getInstance().updateView();
    }//GEN-LAST:event_descartar_buttonActionPerformed

    private void descartarHangar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartarHangar_buttonActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().discardHangar();
        
        MainWindow.getInstance().updateView();

    }//GEN-LAST:event_descartarHangar_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoPower_label;
    private javax.swing.JLabel armas_label;
    private javax.swing.JLabel castigo_label;
    private javax.swing.JLabel combustible_label;
    private javax.swing.JScrollPane damage_panel;
    private javax.swing.JLabel defensa_label;
    private javax.swing.JLabel defense_label;
    private javax.swing.JScrollPane defense_panel;
    private javax.swing.JButton descartarHangar_button;
    private javax.swing.JButton descartar_button;
    private javax.swing.JButton equipar_button;
    private javax.swing.JLabel fire_label;
    private javax.swing.JScrollPane fire_panel;
    private javax.swing.JLabel fuel_label;
    private javax.swing.JLabel hangar2_label;
    private javax.swing.JLabel hangarSize_label;
    private javax.swing.JLabel hangar_label;
    private javax.swing.JScrollPane hangar_panel;
    private javax.swing.JLabel medallas_label;
    private javax.swing.JLabel medals_label;
    private javax.swing.JLabel shieldPower_label;
    private javax.swing.JLabel stationName_label;
    // End of variables declaration//GEN-END:variables
}
