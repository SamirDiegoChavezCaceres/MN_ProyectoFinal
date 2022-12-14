/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn_project;

import java.io.*;
import javax.swing.*;
import com.mathworks.engine.*;
import com.mathworks.toolbox.javabuilder.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import interPoli.*;
import javax.swing.event.*;
import org.math.plot.*;
import org.math.io.*;
/**
 *
 * @author Usuario
 */
public class Interfaz3 extends javax.swing.JFrame {

    File f;
    String xName;
    String yName;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    ArrayList<String> xS;
    ArrayList<String> yS;
    double[] a;
    double[] b;
    MWArray funcion; 
    /**
     * Creates new form Interfaz3
     */
    public Interfaz3() {
        initComponents();
        x = new ArrayList<>();
        y = new ArrayList<>();
        xS = new ArrayList<>();
        cotaInferiorTextField.setEnabled(false);
        cotaSuperiorTextField.setEnabled(false);
        cotaInferiorTextField.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    String str = cotaInferiorTextField.getText();
                    if(fechaCheckBox.isSelected())
                        mostradorCotaInferior.setText(""+xS.get(Integer.parseInt(str)-1)); 
                    else
                        mostradorCotaSuperior.setText(""+x.get(Integer.parseInt(str)-1));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ("Fuera de rango! Maximo es: " + x.size()));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        cotaSuperiorTextField.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    String str = cotaSuperiorTextField.getText();
                    if(fechaCheckBox.isSelected())
                        mostradorCotaSuperior.setText(""+xS.get(Integer.parseInt(str)-1)); 
                    else
                        mostradorCotaSuperior.setText(""+x.get(Integer.parseInt(str)-1));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ("Fuera de rango! Maximo es: " + x.size()));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resultadoTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cotaInferiorTextField = new javax.swing.JTextField();
        TrainButton = new javax.swing.JButton();
        cotaSuperiorTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PredictionButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        operacionesComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        xTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        mostradorCotaInferior = new javax.swing.JTextField();
        mostradorCotaSuperior = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nGradoTextField = new javax.swing.JTextField();
        polinomialText = new javax.swing.JLabel();
        fechaCheckBox = new javax.swing.JCheckBox();
        rCuadradoLabel = new javax.swing.JLabel();
        rCuadradoTextField = new javax.swing.JTextField();
        evaluarButton = new javax.swing.JButton();
        nombreArchivoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel7.setText("Paso 2: Presiona el boton Plot.");

        jLabel8.setText("Paso 4: Visualiza el resultado.");

        resultadoTextField.setText("-");
        resultadoTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        resultadoTextField.setEnabled(false);

        jLabel1.setText("DEMO");

        cotaInferiorTextField.setText("1");
        cotaInferiorTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cotaInferiorTextField.setEnabled(false);

        TrainButton.setText("Train");
        TrainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainButtonActionPerformed(evt);
            }
        });

        cotaSuperiorTextField.setText("10");
        cotaSuperiorTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cotaSuperiorTextField.setEnabled(false);

        jLabel2.setText("Ingrese los datos:");

        jLabel3.setText("Paso 1: Inserte un archivo de datos (.csv)");

        PredictionButton.setText("Plot");
        PredictionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PredictionButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleciona el metodo de interpolacion de datos");

        jLabel6.setText("Paso 1: Inserta intervalo de datos");

        operacionesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Interpolacion Spline", "Interpolacion Polinomial", "Interpolacion Exponencial", "Interpolacion Logaritmica" }));
        operacionesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionesComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Paso 3: Ingresa un valor para evaluarlo en la funcion");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setRequestFocusEnabled(false);
        jLabel4.setVerifyInputWhenFocusTarget(false);

        xTextField.setText("-");
        xTextField.setEnabled(false);

        funcionTextArea.setEditable(false);
        funcionTextArea.setColumns(20);
        funcionTextArea.setLineWrap(true);
        funcionTextArea.setRows(5);
        funcionTextArea.setText("f(x)=");
        funcionTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        funcionTextArea.setEnabled(false);
        jScrollPane1.setViewportView(funcionTextArea);

        jLabel9.setText("Advertencia: Usar intervalos muy grandes puede entorpecer el plot.");

        mostradorCotaInferior.setEditable(false);
        mostradorCotaInferior.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mostradorCotaInferior.setEnabled(false);

        mostradorCotaSuperior.setEditable(false);
        mostradorCotaSuperior.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mostradorCotaSuperior.setEnabled(false);

        jLabel10.setText("Usted esta revisando los datos entre:");

        nGradoTextField.setText("-");
        nGradoTextField.setEnabled(false);

        polinomialText.setLabelFor(nGradoTextField);
        polinomialText.setText("Ingrese el grado del polinomio");

        fechaCheckBox.setText("active si sus datos x son fechas");

        rCuadradoLabel.setText("R^2:");

        rCuadradoTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rCuadradoTextField.setEnabled(false);

        evaluarButton.setText("X");
        evaluarButton.setEnabled(false);
        evaluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarButtonActionPerformed(evt);
            }
        });

        nombreArchivoLabel.setText("Ninguna");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PredictionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(operacionesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cotaInferiorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cotaSuperiorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(polinomialText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nGradoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mostradorCotaInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostradorCotaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(evaluarButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoTextField))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(26, 26, 26)
                            .addComponent(rCuadradoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rCuadradoTextField))
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(fechaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreArchivoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaCheckBox)))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cotaInferiorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cotaSuperiorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel10)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostradorCotaInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostradorCotaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nGradoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(polinomialText))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PredictionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(operacionesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rCuadradoLabel)
                            .addComponent(rCuadradoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(evaluarButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(resultadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nombreArchivoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainButtonActionPerformed
        selectDataFile();
        cotaInferiorTextField.setEnabled(true);
        cotaSuperiorTextField.setEnabled(true);
        try {
            String str2 = cotaSuperiorTextField.getText();
            String str1 = cotaInferiorTextField.getText();
            if(fechaCheckBox.isSelected()){
                mostradorCotaInferior.setText(""+xS.get(Integer.parseInt(str1)-1)); 
                mostradorCotaSuperior.setText(""+xS.get(Integer.parseInt(str2)-1)); 
            }else{
                mostradorCotaInferior.setText(""+x.get(Integer.parseInt(str1)-1));
                mostradorCotaSuperior.setText(""+x.get(Integer.parseInt(str2)-1));
            }
        } catch (Exception ex) {
            //
        }
    }//GEN-LAST:event_TrainButtonActionPerformed

    private void PredictionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PredictionButtonActionPerformed
        //comprobar que tenga datos adentro
        String x1;
        if("".equals(cotaInferiorTextField.getText()) || "".equals(cotaSuperiorTextField.getText())){
            JOptionPane.showMessageDialog(null, "Falta Ingresar Datos!");
        } else if(operacionesComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un modelo");
        } else if(f == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un archivo");
        }else {
            doInterp();
            xTextField.setEnabled(true);
            evaluarButton.setEnabled(true);
        }
        //mostrar mensaje de seleccionar modelo matlab
        //obtenerlo calcular y mostrar
    }//GEN-LAST:event_PredictionButtonActionPerformed

    private void operacionesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionesComboBoxActionPerformed
        if(operacionesComboBox.getSelectedIndex() == 1){
            nGradoTextField.setEnabled(true);
            polinomialText.setText("Ponga tipo de spline (1,2,3)");
        } else if (operacionesComboBox.getSelectedIndex() == 2){
            nGradoTextField.setEnabled(true);
            polinomialText.setText("Ingrese el grado del polinomio");
        } else {
            nGradoTextField.setEnabled(false);
            nGradoTextField.setText("-");
        }
    }//GEN-LAST:event_operacionesComboBoxActionPerformed

    private void evaluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarButtonActionPerformed
        if (operacionesComboBox.getSelectedIndex() == 1) {
            try {
                Interpolacion mensaje = new Interpolacion();
                String str = xTextField.getText();
                Object[] resultadoObj = mensaje.interSplineEval(1, a,funcion,Double.parseDouble(str));
                MWArray resultado = (MWNumericArray) resultadoObj[0]; //s
                resultadoTextField.setText(""+resultado.get(1));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ("error"));
            }
        } else if (operacionesComboBox.getSelectedIndex() == 2) { //poli
            try {
                Interpolacion mensaje = new Interpolacion();
                String str = xTextField.getText();
                Object[] resultadoObj = mensaje.evaluarFuncion(1, funcion,Double.parseDouble(str));
                MWArray resultado = (MWNumericArray) resultadoObj[0]; //s
                resultadoTextField.setText(""+resultado.get(1));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ("error"));
            }
        } else if (operacionesComboBox.getSelectedIndex() == 3) { //exp
            try {
                Interpolacion mensaje = new Interpolacion();
                String str = xTextField.getText();
                Object[] resultadoObj = mensaje.interpExpEvaluar(1, funcion,Double.parseDouble(str));
                MWArray resultado = (MWNumericArray) resultadoObj[0]; //s
                resultadoTextField.setText(""+resultado.get(1));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ("error"));
            }
        } else if (operacionesComboBox.getSelectedIndex() == 4) { //log
            try {
                Interpolacion mensaje = new Interpolacion();
                String str = xTextField.getText();
                Object[] resultadoObj = mensaje.interpLogEvaluar(1, funcion,Double.parseDouble(str));
                MWArray resultado = (MWNumericArray) resultadoObj[0]; //s
                resultadoTextField.setText(""+resultado.get(1));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ("error"));
            }
        } else {
            //error
        }
    }//GEN-LAST:event_evaluarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PredictionButton;
    private javax.swing.JButton TrainButton;
    private javax.swing.JTextField cotaInferiorTextField;
    private javax.swing.JTextField cotaSuperiorTextField;
    private javax.swing.JButton evaluarButton;
    private javax.swing.JCheckBox fechaCheckBox;
    private javax.swing.JTextArea funcionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mostradorCotaInferior;
    private javax.swing.JTextField mostradorCotaSuperior;
    private javax.swing.JTextField nGradoTextField;
    private javax.swing.JLabel nombreArchivoLabel;
    private javax.swing.JComboBox<String> operacionesComboBox;
    private javax.swing.JLabel polinomialText;
    private javax.swing.JLabel rCuadradoLabel;
    private javax.swing.JTextField rCuadradoTextField;
    private javax.swing.JTextField resultadoTextField;
    private javax.swing.JTextField xTextField;
    // End of variables declaration//GEN-END:variables
    private void selectDataFile() {
        JFileChooser chooser = new JFileChooser();
        // optionally set chooser options ...
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            f = chooser.getSelectedFile();
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                int row = 0;
                String line = br.readLine();
                while(line != null){
                    String[] str = line.split(";");
                    if(row == 0) {
                        xName = str[0];
                        yName = str[1];
                        row++;
                        line = br.readLine();
                        continue;
                    }
                    if(fechaCheckBox.isSelected()){
                        x.add(row);
                        xS.add(str[0]);
                    }else{
                        x.add(Integer.parseInt(str[0]));
                    }
                    y.add(Integer.parseInt(str[1]));
                    row++;
                    line = br.readLine();
                }
                //limpiarlo
            } catch(FileNotFoundException e){
                System.err.println("Can't find: " + f +"\n");
                e.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(Interfaz3.class.getName()).log(Level.SEVERE, null, ex);
            } 
            nombreArchivoLabel.setText(f.getName());
        } else {
            // user changed their mind
        }
    }
    private void doInterp() {
        
        //spline polinomial exponencial logaritmica
        //OBTENCION DE DATOS GENERALES
        Object[] resultadoObj = null;   
        int inferior = Integer.parseInt(cotaInferiorTextField.getText());
        int superior = Integer.parseInt(cotaSuperiorTextField.getText());
        int len = superior - inferior + 1;
        a = new double[len];
        for(int i = inferior; i < superior + 1; i++){
            a[i-1] = x.get(i-1);
        }
        b = new double[len];
        for(int i = inferior; i < superior + 1; i++){
            b[i-1] = y.get(i-1);
        }
        if (operacionesComboBox.getSelectedIndex() == 1) {
            try {
                Interpolacion mensaje = new Interpolacion();

                //OBTENCION DE DATOS
                double n = Double.parseDouble(nGradoTextField.getText());
                
                //LLAMADA A MATLAB
                resultadoObj = mensaje.intersplineCoeficientes(1, a,b,n);
                funcion = (MWNumericArray) resultadoObj[0]; //Tabla de coeficientes
                
                System.out.println(funcion); //Tabla de coef
                
                rCuadradoTextField.setText("-");
                
                //PLOT SECTION
                resultadoObj = mensaje.toPlotSpline(4, a,funcion);
                MWArray xTotal = (MWNumericArray) resultadoObj[0]; 
                MWArray yTotal = (MWNumericArray) resultadoObj[1]; 
                MWArray xlen = (MWNumericArray) resultadoObj[2]; 
                MWArray ylen = (MWNumericArray) resultadoObj[3]; 
                Plot2DPanel plot = new Plot2DPanel();
                double[]x1 = new double[((Double) xlen.get(1)).intValue()];
                double[]y1 = new double[((Double) ylen.get(1)).intValue()];
                for(int i = 1; i<x1.length+1; i++){
                    x1[i-1] = (double) xTotal.get(i);
                    y1[i-1] = (double) yTotal.get(i);
                }
                
                // add a line plot to the PlotPanel
                plot.addScatterPlot("Datos", a, b);
                plot.addLinePlot("Funcion", x1 , y1);
                // put the PlotPanel in a JFrame, as a JPanel
                JFrame frame = new JFrame("PLOT");
                frame.setContentPane(plot);
                frame.setVisible(true);
                frame.setSize(600, 500);
                
                //FUNCTION SHOW SECTION
                resultadoObj = mensaje.printSplines(2, funcion,n);
                MWArray funciones = (MWStringArray) resultadoObj[0]; 
                MWArray numeroDeFunciones = (MWNumericArray) resultadoObj[1]; 
                String f = "";
                for(int i = 1; i < ((Double) numeroDeFunciones.get(1)).intValue() + 1; i++){
                    f = f + funciones.get(i) +"\n";
                }
                funcionTextArea.setText(f);
            } catch (MWException ex) {
                JOptionPane.showMessageDialog(null, ("Muchos datos para el spline"));
            }
        } else if (operacionesComboBox.getSelectedIndex() == 2) {
            try {
                
                Interpolacion mensaje = new Interpolacion();

                //OBTENCION DE DATOS
                double n = Double.parseDouble(nGradoTextField.getText());
                
                //LAMMADA A MATLAB
                resultadoObj = mensaje.interPoli(5, a,b,n);
                funcion = (MWNumericArray) resultadoObj[0]; //ec
                MWArray resultado2 = (MWNumericArray) resultadoObj[1]; //r2
                MWArray resultado3 = (MWNumericArray) resultadoObj[2]; //y1
                MWArray resultado4 = (MWNumericArray) resultadoObj[3]; //x
                MWArray resultado5 = (MWNumericArray) resultadoObj[4]; //y
                System.out.println(funcion); //ecuacion
                System.out.println(resultado2); //R2
                System.out.println(resultado3);
                System.out.println(resultado3.get(1));
                System.out.println(resultado4);
                System.out.println(resultado5);
                
                rCuadradoTextField.setText(""+resultado2.get(1));
                
                //PLOT SECTION
                Plot2DPanel plot = new Plot2DPanel();
                double[]y1 = new double[b.length];
                double[]ec;
                for(int i = 1; i<a.length+1; i++)
                    y1[i-1] = (double) resultado3.get(i);
                
                // add a line plot to the PlotPanel
                plot.addScatterPlot("Datos", a, b);
                plot.addLinePlot("Funcion", a , y1);
                // put the PlotPanel in a JFrame, as a JPanel
                JFrame frame = new JFrame("PLOT");
                frame.setContentPane(plot);
                frame.setVisible(true);
                frame.setSize(600, 500);
                
                //FUNCTION SHOW SECTION
                String f = funcionTextArea.getText();
                for(int i = 1; i < n+2; i++){
                    f = f + " " + funcion.get(i) + "*x^" + (n+1-i);
                    if(i != n+1){
                        f = f + " +";
                    }
                }
                funcionTextArea.setText(f);
            } catch (MWException ex) {
                Logger.getLogger(Interfaz3.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } else if (operacionesComboBox.getSelectedIndex() == 3){ //expo
            try {
                Interpolacion mensaje = new Interpolacion();
                
                resultadoObj = mensaje.interpExpo(3, a,b);
                funcion = (MWNumericArray) resultadoObj[0]; //ec
                MWArray resultado2 = (MWNumericArray) resultadoObj[1]; //r2
                MWArray resultado3 = (MWNumericArray) resultadoObj[2]; //y1
                System.out.println(funcion); //ecuacion
                System.out.println(resultado2); //R2
                System.out.println(resultado3); //Y1
                System.out.println(resultado3.get(1));
                
                rCuadradoTextField.setText(""+resultado2.get(1));
                
                //PLOT SECTION
                Plot2DPanel plot = new Plot2DPanel();
                double[]y1 = new double[b.length];
                double[]ec;
                for(int i = 1; i<a.length+1; i++)
                    y1[i-1] = (double) resultado3.get(i);
                
                // add a line plot to the PlotPanel
                plot.addScatterPlot("Datos", a, b);
                plot.addLinePlot("Funcion", a , y1);
                // put the PlotPanel in a JFrame, as a JPanel
                JFrame frame = new JFrame("PLOT");
                frame.setContentPane(plot);
                frame.setVisible(true);
                frame.setSize(600, 500);
                
                //FUNCTION SHOW SECTION
                String f = funcionTextArea.getText();
                f = f + " e^" + funcion.get(2) + " * e^(x*" + funcion.get(1) + ")";
                funcionTextArea.setText(f);
            } catch (MWException ex) {
                Logger.getLogger(Interfaz3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (operacionesComboBox.getSelectedIndex() == 4) {
            try {
                Interpolacion mensaje = new Interpolacion();
                
                //MATLAB CALL
                resultadoObj = mensaje.interpLoga(3, a,b);
                funcion = (MWNumericArray) resultadoObj[0]; //ec
                MWArray resultado2 = (MWNumericArray) resultadoObj[1]; //r2
                MWArray resultado3 = (MWNumericArray) resultadoObj[2]; //y1
                System.out.println(funcion); //ecuacion
                System.out.println(resultado2); //R2
                System.out.println(resultado3); //Y1
                System.out.println(resultado3.get(1));
                
                rCuadradoTextField.setText(""+resultado2.get(1));
                
                //PLOT SECTION
                Plot2DPanel plot = new Plot2DPanel();
                double[]y1 = new double[b.length];
                double[]ec;
                for(int i = 1; i<a.length+1; i++)
                    y1[i-1] = (double) resultado3.get(i);
                // add a line plot to the PlotPanel
                plot.addScatterPlot("Datos", a, b);
                plot.addLinePlot("Funcion", a , y1);
                // put the PlotPanel in a JFrame, as a JPanel
                JFrame frame = new JFrame("PLOT");
                frame.setContentPane(plot);
                frame.setVisible(true);
                frame.setSize(600, 500);
                
                //FUNCTION SHOW SECTION
                String f = funcionTextArea.getText();
                f = f + " " + funcion.get(1) + " * log(x) + " + funcion.get(1);
                funcionTextArea.setText(f);
            } catch (MWException ex) {
                Logger.getLogger(Interfaz3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //error
        }
    }
}