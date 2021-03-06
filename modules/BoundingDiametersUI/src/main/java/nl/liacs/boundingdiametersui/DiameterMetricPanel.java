package nl.liacs.boundingdiametersui;

import org.gephi.graph.api.GraphController;
import org.openide.util.Lookup;

public class DiameterMetricPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiameterMetricPanel2
     */
    public DiameterMetricPanel() {
        initComponents();
        
        //Hide warning if network is undirected
        GraphController graphController = Lookup.getDefault().lookup(GraphController.class);
        if(graphController.getGraphModel().isUndirected()){
            jLabelUndirected.setVisible(false);
        }
    }
    
    public void setUndirectedWarningVisible(boolean visible) {
        ;
    }
    
    public void setEccentricitiesFlag(boolean b) {
        eccentricitiesCheckbox.setSelected(b);
    }
    public boolean getEccentricitiesFlag() {
        return eccentricitiesCheckbox.isSelected();
    }
    
    public void setPeripheryFlag(boolean b) {
        peripheryCheckbox.setSelected(b);
    }
    public boolean getPeripheryFlag() {
        return peripheryCheckbox.isSelected();
    }
    
    public void setCenterFlag(boolean b) {
        centerCheckbox.setSelected(b);
    }
    public boolean getCenterFlag() {
        return centerCheckbox.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new org.jdesktop.swingx.JXHeader();
        eccentricitiesCheckbox = new javax.swing.JCheckBox();
        peripheryCheckbox = new javax.swing.JCheckBox();
        centerCheckbox = new javax.swing.JCheckBox();
        jLabelUndirected = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        header.setDescription(org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.header.description")); // NOI18N
        header.setDoubleBuffered(false);
        header.setTitle(org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.header.title")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(eccentricitiesCheckbox, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.eccentricitiesCheckbox.text")); // NOI18N
        eccentricitiesCheckbox.setToolTipText(org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.eccentricitiesCheckbox.toolTipText")); // NOI18N
        eccentricitiesCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eccentricitiesCheckboxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(peripheryCheckbox, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.peripheryCheckbox.text")); // NOI18N
        peripheryCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peripheryCheckboxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(centerCheckbox, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.centerCheckbox.text")); // NOI18N

        jLabelUndirected.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabelUndirected, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.jLabelUndirected.text")); // NOI18N

        jCheckBox1.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.jCheckBox1.text")); // NOI18N
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.jCheckBox2.text")); // NOI18N
        jCheckBox2.setEnabled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(eccentricitiesCheckbox)
                    .addComponent(peripheryCheckbox)
                    .addComponent(centerCheckbox)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabelUndirected, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(peripheryCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centerCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eccentricitiesCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabelUndirected, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelUndirected.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(DiameterMetricPanel.class, "DiameterMetricPanel.jLabelUndirected.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void eccentricitiesCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eccentricitiesCheckboxActionPerformed
        
    }//GEN-LAST:event_eccentricitiesCheckboxActionPerformed

    private void peripheryCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peripheryCheckboxActionPerformed
        
    }//GEN-LAST:event_peripheryCheckboxActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox centerCheckbox;
    private javax.swing.JCheckBox eccentricitiesCheckbox;
    private org.jdesktop.swingx.JXHeader header;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelUndirected;
    private javax.swing.JCheckBox peripheryCheckbox;
    // End of variables declaration//GEN-END:variables
}
