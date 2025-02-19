
package com.repasopoo.concesionaria.igu;

import com.repasopoo.concesionaria.logica.Auto;
import com.repasopoo.concesionaria.logica.ControladorLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consultar extends javax.swing.JFrame {
    
    //Instancia de mi controlador de logica para llamar datos desde la bd
    ControladorLogica controL = new ControladorLogica();

    public Consultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAutos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Consultar Lista De Carros");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //LO QUE HARA CUANDO SE ABRA ESTA VENTANA DE CONSULTAR
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //verificar que la tabla no este vacia
        //get row count obtiene la cantidad de filas que hay
        if(tableAutos.getRowCount() > 0 ){
            
            /*
            verificar que este algo seleccionado, si es -1 no se ha seleccionado nada
            getSelectedRow obtiene si hay alguna linea seleccionada
            
            Se maneja con -1 porque es como un array, el primer indice es 0
            */
            if(tableAutos.getSelectedRow() != -1 ){
                
                /*
                1. obtener id del auto
                2. traer y asignar con el id de la tabla 
                3. convertirlo en un int
                
                primero obtenemos el valor de mi fila en la columna cero, luego la casteo a un String
                para luego hacer un casteo a un Int
                */
                int idAuto = Integer.parseInt(String.valueOf(tableAutos.getValueAt(tableAutos.getSelectedRow(), 0)));
                
                
                //llamamos a mi ventana de edicion
                EditarDatos editar = new EditarDatos(idAuto);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                
                //que me cierre esta ventana
                this.dispose();
                
            }else{
                mostrarMensaje("No selecciono ningun auto", "Error", "Error al borrar");
            }
        }else{
            mostrarMensaje("No hay datos en la tabla", "Error", "Error, no hay datos");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //verificar que la tabla no este vacia
        //get row count obtiene la cantidad de filas que hay
        if(tableAutos.getRowCount() > 0 ){
            
            /*
            verificar que este algo seleccionado, si es -1 no se ha seleccionado nada
            getSelectedRow obtiene si hay alguna linea seleccionada
            
            Se maneja con -1 porque es como un array, el primer indice es 0
            */
            if(tableAutos.getSelectedRow() != -1 ){
                
                /*
                1. obtener id del auto
                2. traer y asignar con el id de la tabla 
                3. convertirlo en un int
                
                primero obtenemos el valor de mi fila en la columna cero, luego la casteo a un String
                para luego hacer un casteo a un Int
                */
                int idAuto = Integer.parseInt(String.valueOf(tableAutos.getValueAt(tableAutos.getSelectedRow(), 0)));
                
                
                controL.borrarAuto(idAuto);
                
                //msj
                mostrarMensaje("Auto eliminado correctamente", "Info", "Borrado de Auto");
                
                //CARGAR LA TABLA PARA QUE SE MUESTRA CON EL DATO BORRADO
                cargarTabla();
            }else{
                mostrarMensaje("No selecciono ningun auto", "Error", "Error al borrar");
            }
        }else{
            mostrarMensaje("No hay datos en la tabla", "Error", "Error, no hay datos");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAutos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        //Para definir el modelo que tendra mi tabla
        DefaultTableModel modelTable = new DefaultTableModel(){
            
            //Sin importar la fila y columna donde estemos no sera editable
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };
        
        //Establecer titulos de las columnas
        String titulos[] = {"Id","Modelo","Marca","Motor","Color","Placas","Puertas"};
        //seteando nombres
        modelTable.setColumnIdentifiers(titulos);
        
        //traemos los datos y los guardamos en una lista
        List<Auto> listaAutos = controL.traerAutos();
        
        
        //si en mi lista de autos se encuentra algo recorremos mi lista
        if(listaAutos != null){
            //recorrer mi lista de carros para mostrarlos en la tabla
            for(Auto autos : listaAutos){
                
                //Regreso un array tipo object, porque manejamos diferentes tipos de datos en mi bd
                Object[] objetoAuto = {autos.getId(), autos.getModelo(), autos.getMarca(), autos.getMotor(), autos.getColor(), autos.getNumPlacas(), autos.getCantidadPuertas()};
                
                //agregamos nuestro array del tipo object a las filas
                modelTable.addRow(objetoAuto);
            }
        }
        
        //seteamos valores en mi tabla
        tableAutos.setModel(modelTable);
        
        
    }

    private void mostrarMensaje(String msj, String tipo, String titulo) {
        JOptionPane optioPane = new JOptionPane(msj);
        if(tipo.equals("Info")){
            optioPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equals("Error")){
            optioPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optioPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
