package com.mycompany.concesionaria.IGU.view;

import com.mycompany.concesionaria.IGU.Principal;
import com.mycompany.concesionaria.Logica.Automovil;
import com.mycompany.concesionaria.Logica.Controladora;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class Buscar extends javax.swing.JPanel {

    Principal princ;
    
    public Buscar(Principal princ) {
        initComponents();
        initTable();
        this.princ = princ; 
    }
    
    Controladora control = new Controladora();
    Principal p = new Principal();
    
    private void initTable(){
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String titulos[] = {"Id", "Marca", "Modelo", "Motor", "Color", "Patente", "Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        List<Automovil> listaAutos = control.traerAutos();
        
        if(listaAutos!=null){
            for(Automovil auto:listaAutos){
                Object[] objeto = {auto.getId(), auto.getMarca(), auto.getModelo(),auto.getMotor(),auto.getColor(),auto.getPatente(),auto.getCant_P()};
                modeloTabla.addRow(objeto);
            }
        }
        
        
        
        tabla.setModel(modeloTabla);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        editarBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 350));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Auto");

        jSeparator1.setBackground(new java.awt.Color(2, 104, 66));

        tabla.setBackground(null);
        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 104, 66)));
        tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setToolTipText("");
        tabla.setFillsViewportHeight(true);
        tabla.setFocusCycleRoot(true);
        tabla.setGridColor(new java.awt.Color(51, 51, 51));
        tabla.setPreferredSize(new java.awt.Dimension(100, 100));
        tabla.setRowSelectionAllowed(true);
        tabla.setSelectionBackground(new java.awt.Color(154, 234, 222));
        tabla.setShowGrid(true);
        jScrollPane1.setViewportView(tabla);

        editarBtn.setBackground(new java.awt.Color(2, 104, 66));
        editarBtn.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        editarBtn.setForeground(new java.awt.Color(0, 0, 0));
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        borrarBtn.setBackground(new java.awt.Color(255, 0, 51));
        borrarBtn.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        borrarBtn.setForeground(new java.awt.Color(0, 0, 0));
        borrarBtn.setText("Borrar");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });

        buscarBtn.setBackground(new java.awt.Color(2, 104, 66));
        buscarBtn.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(0, 0, 0));
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(buscarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrarBtn)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        if(tabla.getRowCount()>0)
            if(tabla.getSelectedRow()!= -1){
                int idAuto = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                control.borrarAuto(idAuto);
                initTable();
            }
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        if(tabla.getRowCount()>0)
            if(tabla.getSelectedRow()!= -1){
                int idAuto = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                
                
                Editar edit = new Editar(idAuto);
                edit.setVisible(true);
                edit.setLocationRelativeTo(null);
                princ.dispose();

            }
    }//GEN-LAST:event_editarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
