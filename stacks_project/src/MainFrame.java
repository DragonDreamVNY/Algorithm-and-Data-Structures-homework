


import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author k00223361 Vincent Lee
 */
public class MainFrame extends javax.swing.JFrame {
   LinkedStack link = new LinkedStack(); 
    
    /**
     * Creates new form Stacks_ui
     */
    public MainFrame() {
        initComponents();
        
        System.out.println("MainFrame.<init>()");
        
        /* Notes:
        %s means it will print a string, 
        %c single character, 
        %d integer based number, 
        %f float based number. 
        String a = "hello"; 
        Character b = 'r'; 
        Integer c = 3; 
        Double d = 3.14; 
        System.out.printf("%s\t%c\n%d\t%f\n", a, b, c, d); 
        also \t put a tabulator and \n make a new line.﻿
        */  
        
        stackCounter_txtFd.setText( Integer.toString(link.size()) ); //convert int 'size' from LinkedStack to String
        System.out.println("current stack size : " + link.size());
 
    } // end main
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studID_txtF = new javax.swing.JTextField();
        fName_txtF = new javax.swing.JTextField();
        lName_txtF = new javax.swing.JTextField();
        age_txtF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        checkEmpty_Btn = new javax.swing.JButton();
        searchName_Btn = new javax.swing.JButton();
        print_Btn = new javax.swing.JButton();
        insTop_Btn = new javax.swing.JButton();
        delALL_Btn = new javax.swing.JButton();
        remTop_Btn = new javax.swing.JButton();
        checkTopData_Btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        sub_txtF1 = new javax.swing.JTextField();
        sub_txtF2 = new javax.swing.JTextField();
        sub_txtF3 = new javax.swing.JTextField();
        sub_txtF4 = new javax.swing.JTextField();
        sub_txtF5 = new javax.swing.JTextField();
        sub_txtF6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        countItems_label = new javax.swing.JLabel();
        stackCounter_txtFd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        studID_txtF.setText("studID");
        studID_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studID_txtFActionPerformed(evt);
            }
        });

        fName_txtF.setText("fName");

        lName_txtF.setText("lastName");

        age_txtF.setText("age");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studID_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fName_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lName_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(age_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studID_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fName_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        checkEmpty_Btn.setText("Check if Empty");
        checkEmpty_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmpty_BtnActionPerformed(evt);
            }
        });

        searchName_Btn.setText("Search by Name");
        searchName_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchName_BtnActionPerformed(evt);
            }
        });

        print_Btn.setText("Print Contents");
        print_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_BtnActionPerformed(evt);
            }
        });

        insTop_Btn.setText("Insert Data to TOP");
        insTop_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insTop_BtnActionPerformed(evt);
            }
        });

        delALL_Btn.setText("Clear ALL ITEMS");
        delALL_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delALL_BtnActionPerformed(evt);
            }
        });

        remTop_Btn.setText("Remove Data fro TOP");
        remTop_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remTop_BtnActionPerformed(evt);
            }
        });

        checkTopData_Btn.setText("Check Top");
        checkTopData_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTopData_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkTopData_Btn)
                            .addComponent(checkEmpty_Btn))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchName_Btn)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remTop_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(delALL_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(insTop_Btn))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEmpty_Btn)
                    .addComponent(insTop_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkTopData_Btn)
                    .addComponent(remTop_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delALL_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchName_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        sub_txtF1.setText("Subject1");
        sub_txtF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_txtF1ActionPerformed(evt);
            }
        });

        sub_txtF2.setText("Subject2");

        sub_txtF3.setText("Subject3");

        sub_txtF4.setText("Subject4");
        sub_txtF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_txtF4ActionPerformed(evt);
            }
        });

        sub_txtF5.setText("Subject5");

        sub_txtF6.setText("Subject6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(sub_txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_txtF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_txtF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub_txtF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sub_txtF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_txtF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_txtF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_txtF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_txtF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        countItems_label.setText("No. of Items in Stack");

        stackCounter_txtFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackCounter_txtFdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stackCounter_txtFd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(countItems_label)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countItems_label)
                    .addComponent(stackCounter_txtFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        statusTextArea.setColumns(20);
        statusTextArea.setRows(5);
        jScrollPane1.setViewportView(statusTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void remTop_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remTop_BtnActionPerformed
        // TODO add your handling code here:
        link.pop();
        statusTextArea.setText("POP! Top node removed from Stack ");
        JOptionPane.showMessageDialog(null, "Student data removed from stack", "Data Removed", JOptionPane.INFORMATION_MESSAGE);
        stackCounter_txtFd.setText( Integer.toString(link.size()) ); //update counter status field
    }//GEN-LAST:event_remTop_BtnActionPerformed

    private void sub_txtF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_txtF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_txtF4ActionPerformed

    private void sub_txtF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_txtF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_txtF1ActionPerformed

    private void insTop_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insTop_BtnActionPerformed
        // inserts new Node (data contains Student Object which is an arrayList) on top of Stack
        // enter new Data to Student Class
        String studIdInput = JOptionPane.showInputDialog("enter Student ID");
            int studIdIn = Integer.parseInt(studIdInput);
            System.out.println("You've entered Student ID : " + studIdInput);
            studID_txtF.setText( studIdInput);
            
        String fNameInput = JOptionPane.showInputDialog("enter First Name");
            System.out.println("You've entered First Name : " + fNameInput);
            fName_txtF.setText(fNameInput);
            
        String lNameInput = JOptionPane.showInputDialog("enter Last Name");
            System.out.println("You've entered Last Name : " + lNameInput);
            lName_txtF.setText(lNameInput);
            
        String ageInput = JOptionPane.showInputDialog("enter age");
            int ageIn = Integer.parseInt(ageInput);
            System.out.println("You've entered Age : " + ageIn);
            age_txtF.setText(ageInput);
            
        String gradeInput1 = JOptionPane.showInputDialog("enter results for Exam 1");
            int gradeIn1 = Integer.parseInt(gradeInput1);
            System.out.println("You've entered Grade 1 : " + gradeIn1);  
            sub_txtF1.setText(gradeInput1);
            
        String gradeInput2 = JOptionPane.showInputDialog("enter results for Exam 2");
            int gradeIn2 = Integer.parseInt(gradeInput2);
            System.out.println("You've entered Grade 2 : " + gradeInput2);
            sub_txtF2.setText(gradeInput2);
            
        String gradeInput3 = JOptionPane.showInputDialog("enter results for Exam 3");
            int gradeIn3 = Integer.parseInt(gradeInput3);
            System.out.println("You've entered Grade 3 : " + gradeIn3);
            sub_txtF3.setText(gradeInput3);
            
        String gradeInput4 = JOptionPane.showInputDialog("enter results for Exam 4");
            int gradeIn4 = Integer.parseInt(gradeInput4);
            System.out.println("You've entered Grade 4 : " + gradeIn4);
            sub_txtF4.setText(gradeInput4);
            
        String gradeInput5 = JOptionPane.showInputDialog("enter results for Exam 5");
            int gradeIn5 = Integer.parseInt(gradeInput5);
            System.out.println("You've entered Grade 5 : " + gradeIn5);
            sub_txtF5.setText(gradeInput5);
            
        String gradeInput6 = JOptionPane.showInputDialog("enter results for Exam 6");
            int gradeIn6 = Integer.parseInt(gradeInput6);
            System.out.println("You've entered Grade 6 : " + gradeIn6);
            sub_txtF6.setText(gradeInput6);
            
        //create new Student Object
        Student newStudentElement = new Student(studIdIn, fNameInput, lNameInput, ageIn, gradeIn1, gradeIn2, gradeIn3, gradeIn4, gradeIn5, gradeIn6 );
        
        //insert the new student Data onto the Stack, which makes a new Node (objectData or element, next position)
        link.push(newStudentElement); 
        JOptionPane.showMessageDialog(null, "New Student data added to stack", "Data Inserted", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("current stack size : " + link.size());
        stackCounter_txtFd.setText( Integer.toString(link.size()) ); //convert int 'size' from LinkedStack to String

    }//GEN-LAST:event_insTop_BtnActionPerformed

    private void checkEmpty_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmpty_BtnActionPerformed
        // CHECK if stack is empty
        // to call a non static method from another (not private) class in same package
        // ref: http://stackoverflow.com/questions/31086487/i-want-to-call-a-method-from-another-class-but-in-same-package-or-file-how-to-do
        // LinkedStack class is called as a global within the top of this MainFrame class
        
        // message dialog if stack is empty
        if (link.size == 0){
            JOptionPane.showMessageDialog(null, "Stack is Empty", "No Student Data Found", JOptionPane.INFORMATION_MESSAGE);
            statusTextArea.setText("Stack is Empty: " + link.isEmpty() ); //return Boolean true for empty
        }
        else{
            // show stack count 
            System.out.println("Stack with Student data found");
            System.out.println("current stack size : " + link.size());
            stackCounter_txtFd.setText( Integer.toString(link.size()) );
            statusTextArea.setText("current stack size: " + link.size() ); 
        }
    }//GEN-LAST:event_checkEmpty_BtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // when the Form is closed, exit
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void stackCounter_txtFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackCounter_txtFdActionPerformed
        // report Current size of Stack:
        
    }//GEN-LAST:event_stackCounter_txtFdActionPerformed

    private void studID_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studID_txtFActionPerformed
        // DISPLAY current Student's ID:
        //String studIDdisplay = Student.toString();
        //studID_txtF.setText();
    }//GEN-LAST:event_studID_txtFActionPerformed

    private void print_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_BtnActionPerformed
        // TODO Print all contents of stack, one student per line:
        
        /*
        ListIterator<String> listIterator = link.listIterator(link.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        */
        if (link.size == 0){
            JOptionPane.showMessageDialog(null, "Stack is Empty", "No Student Data Found", JOptionPane.INFORMATION_MESSAGE);
            statusTextArea.setText("Stack is Empty: " + link.isEmpty() ); //return Boolean true for empty
        }
        else{
            statusTextArea.setText( link.printStack() );
            //System.out.println(link.toString());
        }
    }//GEN-LAST:event_print_BtnActionPerformed

    private void checkTopData_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTopData_BtnActionPerformed
        // TODO add your handling code here:
        if (link.size == 0){
            JOptionPane.showMessageDialog(null, "Stack is Empty", "No Student Data Found", JOptionPane.INFORMATION_MESSAGE);
            statusTextArea.setText("Stack is Empty: " + link.isEmpty() ); //return Boolean true for empty
        }
         else{
             statusTextArea.setText( link.peek().toString() );
         }
            // update size counter
            System.out.println("current stack size : " + link.size());
            stackCounter_txtFd.setText( Integer.toString(link.size()) );
         
    }//GEN-LAST:event_checkTopData_BtnActionPerformed

    private void delALL_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delALL_BtnActionPerformed
        // ref: http://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html#clear()
        
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Are you sure you want to CLEAR ALL Data?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
        if (selectedOption == JOptionPane.YES_OPTION) {
            link.clear();
            JOptionPane.showMessageDialog(null, "Stack is Empty", "CLEARED", JOptionPane.INFORMATION_MESSAGE);
            stackCounter_txtFd.setText( Integer.toString(link.size()) );
        } 
    }//GEN-LAST:event_delALL_BtnActionPerformed

    private void searchName_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchName_BtnActionPerformed
        // User enters a Surname
        // use toLowerCase or toUpperCase. 

        String searchInp;
        searchInp = (JOptionPane.showInputDialog(null, "Enter a surname").toUpperCase());
        
        // user input is tested in searchStack method in LinkedStack Class
        link.searchStack(searchInp); //returns result String of student Data for display
        statusTextArea.setText( (link.searchStack(searchInp)));
    }//GEN-LAST:event_searchName_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_txtF;
    private javax.swing.JButton checkEmpty_Btn;
    private javax.swing.JButton checkTopData_Btn;
    private javax.swing.JLabel countItems_label;
    private javax.swing.JButton delALL_Btn;
    private javax.swing.JTextField fName_txtF;
    private javax.swing.JButton insTop_Btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lName_txtF;
    private javax.swing.JButton print_Btn;
    private javax.swing.JButton remTop_Btn;
    private javax.swing.JButton searchName_Btn;
    private javax.swing.JTextField stackCounter_txtFd;
    private javax.swing.JTextArea statusTextArea;
    private javax.swing.JTextField studID_txtF;
    private javax.swing.JTextField sub_txtF1;
    private javax.swing.JTextField sub_txtF2;
    private javax.swing.JTextField sub_txtF3;
    private javax.swing.JTextField sub_txtF4;
    private javax.swing.JTextField sub_txtF5;
    private javax.swing.JTextField sub_txtF6;
    // End of variables declaration//GEN-END:variables
}
