
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AKHIL
 */
public class Dashboard_Form extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Form
     */
    
    //default border for the menu item
    Border default_border=BorderFactory.createMatteBorder(1,0,1,0,new Color(46,49,49));
        
    //yellow border for the menu items
    Border yellow_border=BorderFactory.createMatteBorder(1,0,1,0,Color.YELLOW);
        
    
   //create ana rray of jlabels
    JLabel[] menuLabels = new JLabel[5];
    
    JPanel[] panels=new JPanel[7];
    
    public Dashboard_Form() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        //jLabel_appLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/logo.png")) );
        //panel logo border
        Border panelborder=BorderFactory.createMatteBorder(0,0,2,0,Color.lightGray);
        jPanel_logoANDname.setBorder(panelborder);
        //panel container border
        
        //populate the menulabels array
        //you can use a for loop to do that
        menuLabels[0]=jLabel_menuitem1;
        menuLabels[1]=jLabel_menuitem2;
        menuLabels[2]=jLabel_menuitem3;
        menuLabels[3]=jLabel_menuitem4;
        menuLabels[4]=jLabel_menuitem5;
        
         //populate the panels array
         panels[0]=jPanel_dashboard;
         panels[1]=jPanel_colleges;
         panels[2]=jPanel_careerpaths;
         panels[3]=jPanel_myprofile;
         panels[4]=jPanel_analysis;
        
        
        
        addActionToMenuLabels();
       
    }
    
    
    //create a function to set label the label background color
    public void setLabelBackground(JLabel label)
    {
        //reset 
        for(JLabel menuitem:menuLabels)
        {
            menuitem.setBackground(new Color(46,49,49));
         
         menuitem.setForeground(Color.white);
            
        }
            
            
 
         label.setBackground(Color.white);
         
         label.setForeground(Color.blue);
    }
    
    
    
    //create a function to show the selected panel
    public void showPanel(JPanel panel)
    {
        //hide panels
        for(JPanel pnl : panels)
        {
            pnl.setVisible(false);
        }
        panel.setVisible(true);
    }
    public void addActionToMenuLabels()
    {
        //get labels in the jpanel menu
        Component[] components=jPanel_menu.getComponents();
        
        for (Component component : components)
            if(component instanceof JLabel )
            {
                JLabel label= (JLabel) component;
                
                label.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                       
                       setLabelBackground(label);
                       
                       switch (label.getText().trim()){
                           case "Dashboard":
                               showPanel(jPanel_dashboard);
                               jPanel_dashboard.setBackground(Color.red);
                               break;
                           case "Colleges":
                               showPanel(jPanel_colleges);
                               jPanel_colleges.setBackground(Color.blue);
                               break;  
                           case "My profile":
                               showPanel(jPanel_myprofile);
                               jPanel_myprofile.setBackground(Color.green);
                               break;
                           case "Career paths":
                               showPanel(jPanel_careerpaths);
                               jPanel_careerpaths.setBackground(Color.yellow);
                               break;
                           case "Analysis":
                               showPanel(jPanel_analysis);
                               jPanel_analysis.setBackground(Color.gray);
                               break;
                                
                       }
                       
                        
                   }

                    @Override
                    public void mousePressed(MouseEvent e) {
                  }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        
                        
                            label.setBorder(yellow_border);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        
                        label.setBorder(default_border);
                        
                    
                    }
                });
                
                
                
            }
    }
                    
                        
            
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel_logoANDname = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menuitem2 = new javax.swing.JLabel();
        jLabel_menuitem1 = new javax.swing.JLabel();
        jLabel_menuitem4 = new javax.swing.JLabel();
        jLabel_menuitem5 = new javax.swing.JLabel();
        jLabel_menuitem3 = new javax.swing.JLabel();
        jPanel_dashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel_container = new javax.swing.JPanel();
        jPanel_colleges = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_myprofile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_careerpaths = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_analysis = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_logoANDname.setBackground(new java.awt.Color(46, 49, 49));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("What's Next");

        jPanel_menu.setBackground(new java.awt.Color(51, 0, 51));

        jLabel_menuitem2.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuitem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_menuitem2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menuitem2.setText("My profile");
        jLabel_menuitem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem2.setOpaque(true);

        jLabel_menuitem1.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuitem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_menuitem1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menuitem1.setText("Dashboard");
        jLabel_menuitem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem1.setOpaque(true);

        jLabel_menuitem4.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuitem4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_menuitem4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menuitem4.setText("Analysis");
        jLabel_menuitem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem4.setOpaque(true);

        jLabel_menuitem5.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuitem5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_menuitem5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menuitem5.setText("Career paths");
        jLabel_menuitem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem5.setOpaque(true);

        jLabel_menuitem3.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuitem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_menuitem3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menuitem3.setText("Colleges");
        jLabel_menuitem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem3.setOpaque(true);

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_menuitem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_menuitem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jLabel_menuitem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_menuitem2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_logoANDnameLayout = new javax.swing.GroupLayout(jPanel_logoANDname);
        jPanel_logoANDname.setLayout(jPanel_logoANDnameLayout);
        jPanel_logoANDnameLayout.setHorizontalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_logoANDnameLayout.setVerticalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_logoANDname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel_logoANDname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_dashboard.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(211, 84, 0));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Career paths");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(68, 108, 179));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Colleges");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(3, 166, 120));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Analysis");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(150, 54, 148));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("My profile");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        jPanel_container.setBackground(new java.awt.Color(46, 49, 49));

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel_colleges.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Colleges");

        javax.swing.GroupLayout jPanel_collegesLayout = new javax.swing.GroupLayout(jPanel_colleges);
        jPanel_colleges.setLayout(jPanel_collegesLayout);
        jPanel_collegesLayout.setHorizontalGroup(
            jPanel_collegesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_collegesLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        jPanel_collegesLayout.setVerticalGroup(
            jPanel_collegesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_collegesLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        jPanel_myprofile.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("My Profile");

        javax.swing.GroupLayout jPanel_myprofileLayout = new javax.swing.GroupLayout(jPanel_myprofile);
        jPanel_myprofile.setLayout(jPanel_myprofileLayout);
        jPanel_myprofileLayout.setHorizontalGroup(
            jPanel_myprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_myprofileLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel_myprofileLayout.setVerticalGroup(
            jPanel_myprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_myprofileLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jPanel_careerpaths.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Career paths");

        javax.swing.GroupLayout jPanel_careerpathsLayout = new javax.swing.GroupLayout(jPanel_careerpaths);
        jPanel_careerpaths.setLayout(jPanel_careerpathsLayout);
        jPanel_careerpathsLayout.setHorizontalGroup(
            jPanel_careerpathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_careerpathsLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel_careerpathsLayout.setVerticalGroup(
            jPanel_careerpathsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_careerpathsLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jPanel_analysis.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Analysis");

        javax.swing.GroupLayout jPanel_analysisLayout = new javax.swing.GroupLayout(jPanel_analysis);
        jPanel_analysis.setLayout(jPanel_analysisLayout);
        jPanel_analysisLayout.setHorizontalGroup(
            jPanel_analysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_analysisLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel_analysisLayout.setVerticalGroup(
            jPanel_analysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_analysisLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_dashboardLayout = new javax.swing.GroupLayout(jPanel_dashboard);
        jPanel_dashboard.setLayout(jPanel_dashboardLayout);
        jPanel_dashboardLayout.setHorizontalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(316, Short.MAX_VALUE))
            .addComponent(jPanel_container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_colleges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_careerpaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_analysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_dashboardLayout.setVerticalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dashboardLayout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(jPanel_colleges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dashboardLayout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(jPanel_myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dashboardLayout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jPanel_careerpaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_dashboardLayout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(jPanel_analysis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_menuitem1;
    private javax.swing.JLabel jLabel_menuitem2;
    private javax.swing.JLabel jLabel_menuitem3;
    private javax.swing.JLabel jLabel_menuitem4;
    private javax.swing.JLabel jLabel_menuitem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel_analysis;
    private javax.swing.JPanel jPanel_careerpaths;
    private javax.swing.JPanel jPanel_colleges;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPanel jPanel_dashboard;
    private javax.swing.JPanel jPanel_logoANDname;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_myprofile;
    // End of variables declaration//GEN-END:variables

   
       
}
