/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI;
import controller.Controller;
import javax.swing.JPanel;
import deepspace.EnemyToUI;
import deepspace.GameState;


public class EnemyStarShipView extends javax.swing.JPanel {
    private LootView lootView;
    private DamageView damageView;
    /**
     * Creates new form EnemyPanel
     */
    public EnemyStarShipView() {
        initComponents();
        loot_panel.setVisible(true);
        damage_panel.setVisible(true);
        lootView = new LootView();
        loot_panel.add(lootView);
        
        damageView = new DamageView();
        damage_panel.add(damageView);
        
    }
    
    void setEnemyView(EnemyToUI enemyui){
        if (enemyui == null){
            setVisible(false);
        }else{
            enemyname_label.setText(enemyui.getName());
            ammoPower_label.setText(Float.toString(enemyui.getAmmoPower()));
            shieldPower_label.setText(Float.toString(enemyui.getShieldPower()));

            lootView.setLootView(enemyui.getLoot());
            damageView.setDamageView(enemyui.getDamage());

            if (Controller.getInstance().getState() == GameState.BEFORECOMBAT || Controller.getInstance().getState() == GameState.INIT) {
                lootView.setVisible(false);
                damageView.setVisible(false);
            } else {
                lootView.setVisible(true);
                damageView.setVisible(true);
            }

            repaint();
            revalidate();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enemytext_label = new javax.swing.JLabel();
        enemyname_label = new javax.swing.JLabel();
        ammoPowertext_label = new javax.swing.JLabel();
        ammoPower_label = new javax.swing.JLabel();
        shieldPowertext_label = new javax.swing.JLabel();
        shieldPower_label = new javax.swing.JLabel();
        loot_panel = new javax.swing.JPanel();
        damage_panel = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        enemytext_label.setText("Enemigo: ");

        enemyname_label.setText("Nombre Enemigo");

        ammoPowertext_label.setText("Potencia de fuego: ");

        ammoPower_label.setText("Numero Potencia");

        shieldPowertext_label.setText("Potencia de defensa: ");

        shieldPower_label.setText("Numero Defensa");

        loot_panel.setMinimumSize(new java.awt.Dimension(12, 12));

        jLabel1.setText("Botín");

        jLabel2.setText("Pérdidas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loot_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(damage_panel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enemytext_label)
                                .addGap(18, 18, 18)
                                .addComponent(enemyname_label))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ammoPowertext_label)
                                .addGap(18, 18, 18)
                                .addComponent(ammoPower_label))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shieldPowertext_label)
                                .addGap(18, 18, 18)
                                .addComponent(shieldPower_label))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enemytext_label)
                    .addComponent(enemyname_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ammoPowertext_label)
                    .addComponent(ammoPower_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shieldPowertext_label)
                    .addComponent(shieldPower_label))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(loot_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(damage_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoPower_label;
    private javax.swing.JLabel ammoPowertext_label;
    private javax.swing.JScrollPane damage_panel;
    private javax.swing.JLabel enemyname_label;
    private javax.swing.JLabel enemytext_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel loot_panel;
    private javax.swing.JLabel shieldPower_label;
    private javax.swing.JLabel shieldPowertext_label;
    // End of variables declaration//GEN-END:variables
}
