package asdgenerator2;

import javax.swing.JOptionPane;

import asdgenerator2.ReadWriteModel;

public class generatorForm extends javax.swing.JFrame {


	private static final long serialVersionUID = 1L;
	public generatorForm(String path_in, String name) {
        initComponents(path_in);
    }

@SuppressWarnings("unchecked")
                        
    private void initComponents(String path_in) {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASD Generator");
        setResizable(false);

        jLabel1.setText("Path input model:");
        jLabel2.setText("Number of ASD models:");
        jTextField1.setText(path_in);
        
        jButton3.setText("Generate ASD Models");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
    
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {                                      

        String path_in= jTextField1.getText();
        String n= jTextField2.getText();
        
        if (validateInformation(path_in, n)){
            this.setVisible(false);
            
            int n_models= Integer.parseInt(n); 
            String name=path_in;
            ReadWriteModel rw= new ReadWriteModel();
            for(int i=1; i<n_models+1;i++){
    			path_in=rw.modifyModel(name,path_in, i);
    		}
        
        }  
    }                                     

    private boolean validateInformation(String path_in,String n_models) {    
        boolean validate= true;
       
        if (path_in.isEmpty() || path_in.startsWith(" ")){
           validate=false;
           JOptionPane.showMessageDialog(null,"You must select a ASD model.");
        }else{
            if(!n_models.matches("[0-9]+")){
                validate=false;
                JOptionPane.showMessageDialog(null,"You must introduce the number of different ASD models that you want to generate.");
            }
        }

        return validate;
    }   
                   
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;                
}
