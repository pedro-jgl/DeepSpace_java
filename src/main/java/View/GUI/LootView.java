/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI;

/**
 *
 * @author german_padua
 */
public class LootView extends javax.swing.JPanel {

    /**
     * Creates new form LootView
     */
    public LootView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weap_label = new javax.swing.JLabel();
        shield_label = new javax.swing.JLabel();
        hangar_label = new javax.swing.JLabel();
        fuel_label = new javax.swing.JLabel();
        transform_label = new javax.swing.JLabel();
        medals_label = new javax.swing.JLabel();
        nweap_label = new javax.swing.JLabel();
        nshield_label = new javax.swing.JLabel();
        shangar_label = new javax.swing.JLabel();
        nfueld_label = new javax.swing.JLabel();
        nmedal_label = new javax.swing.JLabel();
        transformText_label = new javax.swing.JLabel();

        weap_label.setText("Armas:");

        shield_label.setText("Escudos:");

        hangar_label.setText("Tamaño de Hangar: ");

        fuel_label.setText("Combustible:");

        transform_label.setText("Se tansforma:");

        medals_label.setText("Medallas:");

        nweap_label.setText("jLabel1");

        nshield_label.setText("jLabel2");

        shangar_label.setText("jLabel3");

        nfueld_label.setText("jLabel4");

        nmedal_label.setText("jLabel5");

        transformText_label.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transform_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transformText_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medals_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nmedal_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fuel_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nfueld_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hangar_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shangar_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shield_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nshield_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weap_label)
                        .addGap(137, 137, 137)
                        .addComponent(nweap_label)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weap_label)
                    .addComponent(nweap_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shield_label)
                    .addComponent(nshield_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hangar_label)
                    .addComponent(shangar_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuel_label)
                    .addComponent(nfueld_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medals_label)
                    .addComponent(nmedal_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transform_label)
                    .addComponent(transformText_label))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fuel_label;
    private javax.swing.JLabel hangar_label;
    private javax.swing.JLabel medals_label;
    private javax.swing.JLabel nfueld_label;
    private javax.swing.JLabel nmedal_label;
    private javax.swing.JLabel nshield_label;
    private javax.swing.JLabel nweap_label;
    private javax.swing.JLabel shangar_label;
    private javax.swing.JLabel shield_label;
    private javax.swing.JLabel transformText_label;
    private javax.swing.JLabel transform_label;
    private javax.swing.JLabel weap_label;
    // End of variables declaration//GEN-END:variables
}
