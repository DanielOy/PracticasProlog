package Forms;

import Logic.consultas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Danny
 */
public class vntPrincipal extends javax.swing.JFrame {

    private Logic.consultas consulta;
    
    public vntPrincipal() {
        initComponents();
    }
    
    private void cargarResultatos(String result)
    {
        try {
            if (!result.isEmpty()) {
                String[] _list = result.split(",");
                String _aux = "";
                for (int i = 0; i < _list.length; i++) {
                    _aux = _list[i];
                     if ((_aux.charAt(0)=='\'')||(_aux.charAt(0)=='\"')) { _aux = _aux.substring(1, _aux.length()-1); }
                     _list[i]=_aux;
                }
                jList1.setListData(_list);
            }else 
            {
                jList1.setListData(new String[]{"(No se encontre coincidencias.)"});
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    private void cargarResultados2(String result)
    {
        try {
            if (!result.isEmpty()) {
                String[] _list = result.split(",");
                String _aux = "";
                for (int i = 0; i < _list.length; i++) {
                    _aux = _list[i];
                     if ((_aux.charAt(0)=='\'')||(_aux.charAt(0)=='\"')) { _aux = _aux.substring(1, _aux.length()-1); }
                     _list[i]=_aux;
                }
                jList3.setListData(_list);
            }else 
            {
                jList1.setListData(new String[]{"(No se encontre coincidencias.)"});
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    private void cargarResultados(String result)
    {
        try {
            if (!result.isEmpty()) {
                String[] _list = result.split(",");
                String _aux ="";
                for (int i = 0; i < _list.length; i++) {
                   _aux = _list[i];
                     if ((_aux.charAt(0)=='\'')||(_aux.charAt(0)=='\"')) { _aux = _aux.substring(1, _aux.length()-1); }
                     _list[i]=_aux;
                }
                jList2.setListData(_list);
            }else 
            {
                jList1.setListData(new String[]{"(No se encontre coincidencias.)"});
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    private String[] deleteDuplicates(String result)
    {
        try {
            if (!result.isEmpty()) {
                
                ArrayList<String> _array = new ArrayList<>(Arrays.asList(result.split(",")));
                List<String> _datos = _array.stream().distinct().collect(Collectors.toList());
                 String[] items = new String[_datos.size()];
                for (int i = 0; i < _datos.size(); i++) {
                    String _aux = _datos.get(i).toString().toUpperCase();
                    if ((_aux.charAt(0)=='\'')||(_aux.charAt(0)=='\"')) { _aux = _aux.substring(1, _aux.length()-1); }
                   items[i] = _aux;
                }
                return items;
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        TypebuttonGroup = new javax.swing.ButtonGroup();
        ActDirbuttonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        AniojSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        AlljRadioButton = new javax.swing.JRadioButton();
        MoviejRadioButton = new javax.swing.JRadioButton();
        SeriejRadioButton = new javax.swing.JRadioButton();
        AnimejRadioButton = new javax.swing.JRadioButton();
        BuscarjButton = new javax.swing.JButton();
        ResultjLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GenerojComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ActorjRadioButton = new javax.swing.JRadioButton();
        DirectorjRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NamejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ValoracionjComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Año");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        AniojSpinner.setValue(2019);

        jLabel1.setText("Tipo:");

        TypebuttonGroup.add(AlljRadioButton);
        AlljRadioButton.setText("Cualquiera");
        AlljRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AlljRadioButtonStateChanged(evt);
            }
        });
        AlljRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlljRadioButtonMouseClicked(evt);
            }
        });
        AlljRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlljRadioButtonActionPerformed(evt);
            }
        });

        TypebuttonGroup.add(MoviejRadioButton);
        MoviejRadioButton.setText("Pelicula");
        MoviejRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoviejRadioButtonMouseClicked(evt);
            }
        });

        TypebuttonGroup.add(SeriejRadioButton);
        SeriejRadioButton.setText("Serie");
        SeriejRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeriejRadioButtonMouseClicked(evt);
            }
        });

        TypebuttonGroup.add(AnimejRadioButton);
        AnimejRadioButton.setText("Anime");
        AnimejRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnimejRadioButtonMouseClicked(evt);
            }
        });
        AnimejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimejRadioButtonActionPerformed(evt);
            }
        });
        AnimejRadioButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                AnimejRadioButtonPropertyChange(evt);
            }
        });

        BuscarjButton.setText("Buscar");
        BuscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarjButtonActionPerformed(evt);
            }
        });

        ResultjLabel.setText("Result: ");

        jLabel2.setText("Genero:");

        GenerojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        GenerojComboBox.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText("Seleccione un tipo de contenido.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setText("Seleccione una opcion");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel11.setText("Inserte 0 para omitir el año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResultjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(BuscarjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(AlljRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MoviejRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SeriejRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnimejRadioButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GenerojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(AniojSpinner)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AlljRadioButton)
                    .addComponent(MoviejRadioButton)
                    .addComponent(SeriejRadioButton)
                    .addComponent(AnimejRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GenerojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AniojSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addComponent(BuscarjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ResultjLabel)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Recomendaciones", jPanel1);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ActDirbuttonGroup.add(ActorjRadioButton);
        ActorjRadioButton.setSelected(true);
        ActorjRadioButton.setText("Actor");
        ActorjRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActorjRadioButtonMouseClicked(evt);
            }
        });

        ActDirbuttonGroup.add(DirectorjRadioButton);
        DirectorjRadioButton.setText("Director");
        DirectorjRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DirectorjRadioButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Peliculas/Series por:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("BUSCAR");

        jLabel6.setText("Nombre:");

        jScrollPane2.setViewportView(jList2);

        jList4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jScrollPane4.setViewportView(jList4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Ayuda:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(144, 144, 144))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(ActorjRadioButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(DirectorjRadioButton))
                                .addComponent(NamejTextField))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActorjRadioButton)
                            .addComponent(DirectorjRadioButton)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Persona -> Pelicula", jPanel2);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Valoracion");

        ValoracionjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "buena", "regular", "mala" }));

        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7)
                        .addGap(55, 55, 55)
                        .addComponent(ValoracionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton2)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ValoracionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("X Valoracion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        consulta = new consultas();
    }//GEN-LAST:event_formWindowOpened

    private void BuscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButtonActionPerformed
        jList1.setListData(new String[]{});
        String result = "";
        int Anio = Integer.parseInt(AniojSpinner.getValue().toString());
        String genero = GenerojComboBox.getSelectedItem().toString().toLowerCase();
        if (AlljRadioButton.isSelected()) {
         result = consulta.getMultimedia("all",genero,Anio);   
        }else if (MoviejRadioButton.isSelected()) {
         result = consulta.getMultimedia("pelicula",genero,Anio);   
        }else if (SeriejRadioButton.isSelected()) {
         result = consulta.getMultimedia("serie",genero,Anio);   
        }else if (AnimejRadioButton.isSelected()) {
         result = consulta.getMultimedia("anime",genero,Anio);
        }
        cargarResultatos(result);
    }//GEN-LAST:event_BuscarjButtonActionPerformed

    
    
    private void AlljRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlljRadioButtonActionPerformed
        
    }//GEN-LAST:event_AlljRadioButtonActionPerformed

    private void AnimejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimejRadioButtonActionPerformed
        
    }//GEN-LAST:event_AnimejRadioButtonActionPerformed

    private void AnimejRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnimejRadioButtonMouseClicked
        try {
            String result = "";
            result = consulta.getGenres("anime");
            if (!result.isEmpty()) {
                GenerojComboBox.setEnabled(true);
                String[] _datos = deleteDuplicates(result);
                GenerojComboBox.removeAllItems();
                GenerojComboBox.setModel(new DefaultComboBoxModel<>(_datos));
                GenerojComboBox.setMaximumRowCount(_datos.length);
                
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_AnimejRadioButtonMouseClicked

    private void AnimejRadioButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_AnimejRadioButtonPropertyChange
        
    }//GEN-LAST:event_AnimejRadioButtonPropertyChange

    private void SeriejRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriejRadioButtonMouseClicked
       try {
            String result = "";
            result = consulta.getGenres("serie");
            if (!result.isEmpty()) {
                GenerojComboBox.setEnabled(true);
                String[] _datos = deleteDuplicates(result);
                GenerojComboBox.removeAllItems();
                GenerojComboBox.setModel(new DefaultComboBoxModel<>(_datos));
                GenerojComboBox.setMaximumRowCount(_datos.length);
                
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_SeriejRadioButtonMouseClicked

    private void MoviejRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoviejRadioButtonMouseClicked
       try {
            String result = "";
            result = consulta.getGenres("pelicula");
            if (!result.isEmpty()) {
                GenerojComboBox.setEnabled(true);
                String[] _datos = deleteDuplicates(result);
                GenerojComboBox.removeAllItems();
                GenerojComboBox.setModel(new DefaultComboBoxModel<>(_datos));
                GenerojComboBox.setMaximumRowCount(_datos.length);
                
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_MoviejRadioButtonMouseClicked

    private void AlljRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AlljRadioButtonStateChanged
    
    }//GEN-LAST:event_AlljRadioButtonStateChanged

    private void AlljRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlljRadioButtonMouseClicked
       try {
            String result = "";
            result = consulta.getGenres("all");
            if (!result.isEmpty()) {
                GenerojComboBox.setEnabled(true);
                String[] _datos = deleteDuplicates(result);
                GenerojComboBox.removeAllItems();
                GenerojComboBox.setModel(new DefaultComboBoxModel<>(_datos));
                GenerojComboBox.setMaximumRowCount(_datos.length);
                
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_AlljRadioButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jList2.setListData(new String[]{});
            String result = "";
            String _name = NamejTextField.getText();
                if (ActorjRadioButton.isSelected()) {
                result = consulta.getColaboraciones("act", _name.toLowerCase());
            }else if (DirectorjRadioButton.isSelected()) {
                result = consulta.getColaboraciones("dir", _name.toLowerCase());
            }
                cargarResultados(result);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
                jList3.setListData(new String[]{});
            String result = "";
            String _name = ValoracionjComboBox.getSelectedItem().toString();
            result = consulta.getbyValoracion(_name.toLowerCase());
                cargarResultados2(result);
                
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ActorjRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActorjRadioButtonMouseClicked
        try {
            String result = "";
            jList4.setListData(new String[]{});
            result = consulta.getActors();
            if (!result.isEmpty()) {
                String[] _datos = deleteDuplicates(result);
                String _aux = "";
                for (int i = 0; i < _datos.length; i++) {
                    _aux = _datos[i];
                     if ((_aux.charAt(0)=='\'')||(_aux.charAt(0)=='\"')) { _aux = _aux.substring(1, _aux.length()-1); }
                     _datos[i]=_aux;
                }
                jList4.setListData(_datos);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_ActorjRadioButtonMouseClicked

    private void DirectorjRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DirectorjRadioButtonMouseClicked
        String result = "";
            jList4.setListData(new String[]{});
            result = consulta.getDirectors();
            if (!result.isEmpty()) {
                String[] _datos = deleteDuplicates(result);
                String _aux = "";
                for (int i = 0; i < _datos.length; i++) {
                    _aux = _datos[i];
                     if ((_aux.charAt(0)=='\'')||(_aux.charAt(0)=='\"')) { _aux = _aux.substring(1, _aux.length()-1); }
                     _datos[i]=_aux;
                }
                jList4.setListData(_datos);
            }
    }//GEN-LAST:event_DirectorjRadioButtonMouseClicked

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
            java.util.logging.Logger.getLogger(vntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vntPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ActDirbuttonGroup;
    private javax.swing.JRadioButton ActorjRadioButton;
    private javax.swing.JRadioButton AlljRadioButton;
    private javax.swing.JRadioButton AnimejRadioButton;
    private javax.swing.JSpinner AniojSpinner;
    private javax.swing.JButton BuscarjButton;
    private javax.swing.JRadioButton DirectorjRadioButton;
    private javax.swing.JComboBox<String> GenerojComboBox;
    private javax.swing.JRadioButton MoviejRadioButton;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JLabel ResultjLabel;
    private javax.swing.JRadioButton SeriejRadioButton;
    private javax.swing.ButtonGroup TypebuttonGroup;
    private javax.swing.JComboBox<String> ValoracionjComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
