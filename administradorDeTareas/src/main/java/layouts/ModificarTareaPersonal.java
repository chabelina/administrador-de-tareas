/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package layouts;

import controller.ControllerProyectos;
import java.sql.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;
import vista.TareasPendientesPorRealizar;

/**
 *
 * @author Usuario
 */
public class ModificarTareaPersonal extends javax.swing.JDialog {
    private ControllerProyectos conexion = new ControllerProyectos();
    private TareasPendientesPorRealizar ventanaTPR;
    private int id_user;
    private int id_tarea;
    private boolean activo = false;
    private CalendarioModificarTareaPersonal calendario;
    public String fechaLimite;
    int xMouse, yMouse;
    private java.awt.Frame parent;
  /**
   * Creates new form ModificarTareaPersonal
   */
  public ModificarTareaPersonal(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    this.setUndecorated(true);
    initComponents();
    this.setLocationRelativeTo(null);
    
  }
  public void dar_valores_predeterminado(int id){
      this.id_user = id;
      this.boton_cancelar.setEnabled(true)  ;
      this.boton_guardar_cambios.setEnabled(true);
  }
  public void ingresar_datos(){
      String id_ingresado = this.txt_id_proyecto.getText();
      String[] datos = this.conexion.datos_unicos(Integer.parseInt(id_ingresado),this.id_user);
      //if(datos == null || datos.length == 0 ){
       //   JOptionPane.showMessageDialog(null,"El id ingresado no existe");
       //   return;
      //}
      System.out.println(Arrays.toString(datos));
      //this.txt_nombre_tarea.setText( datos[2] );
      //this.txt_descripcion_tarea.setText(datos[3]);
  }
   
  public javax.swing.JLabel getBtnCalendario(){
    return this.btn_fecha;
  }
  
  public void obtenerPadreAnterior(TareasPendientesPorRealizar ventanaTPR){
    this.ventanaTPR = ventanaTPR;
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    boton_buscar_id = new javax.swing.JLabel();
    jPanel5 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    txt_id_proyecto = new javax.swing.JTextField();
    jPanel8 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    txt_nombre_tarea = new javax.swing.JTextField();
    jPanel9 = new javax.swing.JPanel();
    jLabel10 = new javax.swing.JLabel();
    txt_descripcion_tarea = new javax.swing.JTextField();
    jPanel6 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    lb_estado = new javax.swing.JLabel();
    jPanel10 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    boton_opciones = new javax.swing.JComboBox<>();
    jPanel11 = new javax.swing.JPanel();
    jLabel16 = new javax.swing.JLabel();
    btn_fecha = new javax.swing.JLabel();
    boton_cancelar = new javax.swing.JButton();
    boton_guardar_cambios = new javax.swing.JButton();
    jPanel7 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(19, 30, 35));

    jPanel4.setBackground(new java.awt.Color(19, 30, 35));

    boton_buscar_id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    boton_buscar_id.setForeground(new java.awt.Color(255, 255, 255));
    boton_buscar_id.setText("Buscar Tarea");
    boton_buscar_id.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        boton_buscar_idMouseClicked(evt);
      }
    });

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("icono");
    jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    txt_id_proyecto.setBorder(javax.swing.BorderFactory.createCompoundBorder());
    txt_id_proyecto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_id_proyectoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txt_id_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(1, 1, 1)
        .addComponent(txt_id_proyecto))
      .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
        .addComponent(boton_buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(1, 1, 1)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(boton_buscar_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    jPanel8.setBackground(new java.awt.Color(19, 30, 35));

    jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("NOMBRE DE LA TAREA");

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(txt_nombre_tarea)
    );
    jPanel8Layout.setVerticalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addComponent(jLabel9)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txt_nombre_tarea, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
    );

    jPanel9.setBackground(new java.awt.Color(19, 30, 35));

    jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setText("DESCRIPCIÓN");

    jLabel2.setText("ESTADO : ");

    lb_estado.setText("ACTIVO");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lb_estado)
          .addComponent(jLabel2))
        .addGap(63, 63, 63))
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addGap(0, 0, 0)
        .addComponent(lb_estado)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
      .addGroup(jPanel9Layout.createSequentialGroup()
        .addComponent(txt_descripcion_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel9Layout.setVerticalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel9Layout.createSequentialGroup()
        .addComponent(jLabel10)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txt_descripcion_tarea, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
          .addGroup(jPanel9Layout.createSequentialGroup()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))))
    );

    jPanel10.setBackground(new java.awt.Color(19, 30, 35));

    jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setText("PRIORIDAD");

    boton_opciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    boton_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "alta", "media", "baja" }));
    boton_opciones.setBorder(null);
    boton_opciones.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        boton_opcionesActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
      jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        .addGap(29, 29, 29)
        .addComponent(boton_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );
    jPanel10Layout.setVerticalGroup(
      jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
          .addComponent(boton_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jPanel11.setBackground(new java.awt.Color(19, 30, 35));

    jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("FECHA LÍMITE");

    btn_fecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btn_fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fecha.png"))); // NOI18N
    btn_fecha.setText(" M/D/YYYY");
    btn_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btn_fechaMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
      jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23))
    );
    jPanel11Layout.setVerticalGroup(
      jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel11Layout.createSequentialGroup()
        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 14, Short.MAX_VALUE))
    );

    boton_cancelar.setBackground(new java.awt.Color(174, 7, 57));
    boton_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    boton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
    boton_cancelar.setText("CANCELAR");
    boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        boton_cancelarActionPerformed(evt);
      }
    });

    boton_guardar_cambios.setBackground(new java.awt.Color(0, 135, 103));
    boton_guardar_cambios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    boton_guardar_cambios.setForeground(new java.awt.Color(255, 255, 255));
    boton_guardar_cambios.setText("GUARDAR CAMBIOS");
    boton_guardar_cambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    boton_guardar_cambios.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        boton_guardar_cambiosActionPerformed(evt);
      }
    });

    jPanel7.setBackground(new java.awt.Color(153, 153, 153));
    jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        jPanel7MouseDragged(evt);
      }
    });
    jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jPanel7MousePressed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    jLabel1.setText("MODIFICAR TAREA");

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(175, 175, 175))
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
        .addContainerGap(8, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(boton_guardar_cambios)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)))))
        .addContainerGap())
      .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(boton_guardar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(19, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void boton_guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardar_cambiosActionPerformed
        if(this.activo){
            int valor = 0;
            String nombre = this.txt_nombre_tarea.getText();
            String descripcion = this.txt_descripcion_tarea.getText();
            String prioridad = (String) this.boton_opciones.getSelectedItem();
            String fechaLimiteActualizada = btn_fecha.getText();
            valor = this.conexion.actualizar_cambios(this.id_tarea, nombre, descripcion,fechaLimiteActualizada,prioridad);
            //JOptionPane.showConfirmDialog(null, (valor == 1)?"ACTUALIZADO CON EXITO":"ERROR AL ACTUALIZAR");
            JOptionPane.showMessageDialog(null, (valor == 1)?"ACTUALIZADO CON EXITO":"ERROR AL ACTUALIZAR");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Campo vacio id");
        }
    }//GEN-LAST:event_boton_guardar_cambiosActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void btn_fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fechaMouseClicked
      this.calendario = new CalendarioModificarTareaPersonal(this.parent, true);
      this.calendario.obtenerVentanaAnterior(this);
      calendario.setVisible(true);
    }//GEN-LAST:event_btn_fechaMouseClicked

    private void boton_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_opcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_opcionesActionPerformed

    private void txt_id_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_proyectoActionPerformed

    private void boton_buscar_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscar_idMouseClicked
        String id_ingresado = this.txt_id_proyecto.getText();
        String[] datos;
        try {
            datos = this.conexion.datos_unicos(Integer.parseInt(id_ingresado),this.id_user);
            if(datos == null || datos.length == 0 ){
                JOptionPane.showMessageDialog(null,"El id ingresado no existe");
                return;
            }
            System.out.println(Arrays.toString(datos));
            this.txt_nombre_tarea.setText( datos[2] );
            this.txt_descripcion_tarea.setText(datos[3]);
            this.boton_opciones.setSelectedItem(datos[4]);
            this.btn_fecha.setText(datos[5]);
            this.activo = true;
            this.id_tarea = Integer.parseInt(id_ingresado);
        } catch (Exception e){
            this.activo = false;
            //JOptionPane.showConfirmDialog(null, "Por favor ingrese de manera correcta los campos");
            JOptionPane.showMessageDialog(null,"Por favor ingrese de manera correcta los campos");
        };

    }//GEN-LAST:event_boton_buscar_idMouseClicked

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
        
        xMouse = evt.getX(); 
        yMouse = evt.getY();    
        
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        // TODO add your handling code here:
        
        // Calcula cuánto se ha movido el mouse desde que se presionó
        int x = evt.getXOnScreen(); 
        int y = evt.getYOnScreen(); 

        // Mueve la ventana a su nueva posición 
        this.setLocation(x - xMouse, y - yMouse);

        
    }//GEN-LAST:event_jPanel7MouseDragged

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(ModificarTareaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ModificarTareaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ModificarTareaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ModificarTareaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        ModificarTareaPersonal dialog = new ModificarTareaPersonal(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel boton_buscar_id;
  private javax.swing.JButton boton_cancelar;
  private javax.swing.JButton boton_guardar_cambios;
  private javax.swing.JComboBox<String> boton_opciones;
  private javax.swing.JLabel btn_fecha;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel10;
  private javax.swing.JPanel jPanel11;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JPanel jPanel8;
  private javax.swing.JPanel jPanel9;
  private javax.swing.JLabel lb_estado;
  private javax.swing.JTextField txt_descripcion_tarea;
  private javax.swing.JTextField txt_id_proyecto;
  private javax.swing.JTextField txt_nombre_tarea;
  // End of variables declaration//GEN-END:variables
}
