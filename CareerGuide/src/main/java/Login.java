//package com.mycompany.dbms;
import javax.swing.*;
//import javax.swing.JComponent.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
public class Login extends JFrame {
    //private static final Border border = null;
    private JTextField username;
    private JPasswordField pass;
    private JButton login,register;
    private JLabel l1,l2,l3;
    private JPanel p1;
    //private JPanel p1;
    public Login()
    {
        incomp();
        setTitle("WELCOME");
        setSize(1040,800);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    private void incomp()
    {
        username=new JTextField(30);
        username.setBounds(550, 83, 350, 39);
        username.setFont(new Font("Verdana", Font.PLAIN, 15));
        pass=new JPasswordField(30);
        pass.setBounds(550, 230, 350, 39);
        pass.setFont(new Font("Verdana", Font.PLAIN, 15));
        login=new JButton("Login");
        login.setBounds(200, 400, 200, 50);
        login.setFont(new Font("Verdana", Font.BOLD, 20));
        register=new JButton("Register");
        register.setBounds(600, 400, 200, 50);
        register.setFont(new Font("Verdana", Font.BOLD, 20));
        l1=new JLabel("Username",JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 27));
        l1.setBounds(200, 50, 200, 100);
        l2=new JLabel("password",JLabel.CENTER);
        l2.setFont(new Font("serif", Font.PLAIN, 27));
        l2.setBounds(200, 200, 200, 100);
        l3=new JLabel("Career Guide",JLabel.CENTER);
        l3.setFont(new Font("serif", Font.BOLD, 39));
        l3.setBounds(300, 100, 300, 600);
        add(l3);
        l2.setFont(new Font("Verdana", Font.PLAIN, 27));
        p1=new JPanel();
        add(p1,BorderLayout.SOUTH);
        p1.setPreferredSize(new Dimension(100,600));
        p1.setLayout(null);
        p1.add(l1);
        p1.add(l2);
        p1.add(username);
        p1.add(pass);
        p1.add(login);
        p1.add(register);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String uservalue=username.getText();
                String passvalue= new String(pass.getPassword());
                if(uservalue.equals("test@123") && passvalue.equals("test")){
                    //dashboard1 f1=new dashboard1();
                    //f1.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Enter a valid username or password",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
                }
    public JTextField getUsername() {
        return username;
    }
    public void setUsername(JTextField username) {
        this.username = username;
    }
    public JPasswordField getPass() {
        return pass;
    }
    public void setPass(JPasswordField pass) {
        this.pass = pass;
    }
    public static void main(String[] args) {
        new Login();
    }
}