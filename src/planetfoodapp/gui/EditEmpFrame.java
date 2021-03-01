package planetfoodapp.gui;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import planetfoodapp.dao.EmployeeDao;
import planetfoodapp.pojo.Employee;
import planetfoodapp.pojo.UserProfile;


public class EditEmpFrame extends javax.swing.JFrame { 
   private HashMap<String,Employee> employeesList;
   private ArrayList<Employee>employees;
   private String empId,empName,empJob;
   private double empSalary;
    
   public EditEmpFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblUserName.setText("Hello "+UserProfile.getUsername());        
         
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        txtSalary = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        jcJob = new javax.swing.JComboBox<>();
        txtEmpSal = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT  EMPLOYEES DETAILS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetfoodapp/gui/employees.png"))); // NOI18N

        lblLogout.setBackground(new java.awt.Color(0, 102, 102));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        txtSalary.setBackground(new java.awt.Color(0, 102, 102));
        txtSalary.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employees Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        txtSalary.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMPID");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMPNAME");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JOB");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SALARY");

        txtEmpId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jcJob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtEmpSal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtSalaryLayout = new javax.swing.GroupLayout(txtSalary);
        txtSalary.setLayout(txtSalaryLayout);
        txtSalaryLayout.setHorizontalGroup(
            txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSalaryLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtEmpSal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcJob, 0, 187, Short.MAX_VALUE)
                    .addComponent(txtEmpName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        txtSalaryLayout.setVerticalGroup(
            txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtSalaryLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnSearch)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jcJob, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(txtSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(107, 107, 107)))
                .addComponent(lblLogout)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(142, 142, 142))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLogout)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack))
                .addGap(25, 25, 25))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         AdminOptionsFrame adminoptionsframe=new AdminOptionsFrame();
         adminoptionsframe.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
 
   try{
         String empId=txtEmpId.getText();
           employeesList=EmployeeDao.getEmployee(empId);  
         for(Employee emp:employeesList.values())
         {
           txtEmpName.setText(emp.getEName());
           jcJob.addItem(emp.getJob());
           txtEmpSal.setText(emp.getSalary().toString());
         }
    }
    catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
    }
         try{    
              employees=EmployeeDao.getAllData();
             for(Employee e:employees){
                 jcJob.addItem(e.getJob());  
             }
            }
            catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
            }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginframe=new LoginFrame();
        loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
          lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
          lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      int result=validateInput();
        if(result==0)
        {
           JOptionPane.showMessageDialog(null,"Please Fill Salary of Employees!","SALARY Field Required",JOptionPane.ERROR_MESSAGE);
           return;
        }
        else if(result==-1)
        {
            JOptionPane.showMessageDialog(null,"Please fill the Employee Id/Name!","ID/NAME  Field required",JOptionPane.ERROR_MESSAGE);
            return;      
        }
       else
        try{
            empId=txtEmpId.getText();
            empName=txtEmpName.getText();
            empSalary=Double.parseDouble(txtEmpSal.getText());
            empJob=jcJob.getSelectedItem().toString();
            
      Employee emp=new Employee();
        emp.setEmpId(empId);
        emp.setEName(empName);
        emp.setSalary(empSalary);
        emp.setJob(empJob);
        boolean status =EmployeeDao.updateEmployee(emp);
        if(status)
        {
             JOptionPane.showMessageDialog(null,"Employee details successfully Updated!","success",JOptionPane.INFORMATION_MESSAGE);
            clearAll();      
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Employee details Not Updated!","Updation Denied",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR in database connection!","ERROR",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();        
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
   public void clearAll(){
       txtEmpName.setText("");
       txtEmpId.setText("");
       txtEmpSal.setText("");
       jcJob.removeAllItems();
   }
    
    public int validateInput(){
    int result=1;
    empId=txtEmpId.getText();
    empName=txtEmpName.getText();
    empSalary=Double.parseDouble(txtEmpSal.getText());
         if(empId.isEmpty()||empName.isEmpty())
             result=-1;
         else if(String.valueOf(empSalary).isEmpty()) {
              return 0;
            } 
          else {
             result=1;
            }
    return result;
}
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
            java.util.logging.Logger.getLogger(EditEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcJob;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSal;
    private javax.swing.JPanel txtSalary;
    // End of variables declaration//GEN-END:variables
}