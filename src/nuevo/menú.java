package nuevo;
import java.awt.Component;
import java.io.IOException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import trabajo.progra.ii.*;
public class menú extends javax.swing.JFrame {
private String wordp,excelp,ppp,firefoxp,gchromep,iexplorerp,plzom,rocp,tftp,clndr;
Connection con=null;
Statement stmt=null; 
String url = "jdbc:mysql://localhost:3306/login";
String usuario = "root";
String contraseña = "root"; 
//cambiopass cpw=new cambiopass();
public void abrir(String programa,int columna){
    try{                         
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               try{  
                   if (con!= null){
                System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);     
                stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from login.direcciones");
               while(rs.next()){//resultset.next busca cada valor de todas las columnas en la base de datos
               programa=rs.getString(columna);
               String w2=programa;
                   try{          
               Process p=Runtime.getRuntime().exec(programa);
               p.getOutputStream();
               }catch(IOException e){
                   int z=jOptionPane1.showConfirmDialog(null,"Dirección incorrecta", "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE,null);
                   //DEFAULT_OPTION muestra solo el botón Aceptar  
                   if(z==JOptionPane.OK_OPTION){ 
                JFileChooser fc=new JFileChooser();
                fc.setFileFilter(new FileNameExtensionFilter("Ejecutable","exe"));
                int opcion=fc.showOpenDialog(this);//showOpenDialog muestra al filechooser en una nueva ventana
                programa=fc.getSelectedFile().toString();//getSelectedFile obtiene la dirección del archivo; toString lo convierte a cadena
                jOptionPane1.showMessageDialog(null,programa);   
                w2=w2.replace("\\","\\\\");
                programa = programa.replace("\\","\\\\");
                stmt.executeUpdate("update login.direcciones set word = replace(word,'"+w2+"','"+programa+"')");
                if (opcion==JFileChooser.APPROVE_OPTION){
                    try{
                        Process p2=Runtime.getRuntime().exec(programa);            
                        p2.getOutputStream();  
                    } catch(IOException ex){
                        jOptionPane1.showMessageDialog(null,"Dirección incorrecta", "Confirmación", jOptionPane1.ERROR_MESSAGE);
                    } } } } } }             
            } catch(Exception e){
                
            }          
        }catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
public void cambio(String programa,int columna){
    try{
                         
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               try{         
               
            if (con!= null){
                System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);               
                                
                stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from login.direcciones");
               
               while(rs.next()){//resultset.next busca cada valor de todas las columnas en la base de datos
               programa=rs.getString(columna);
               String w2=programa;
                   
                JFileChooser fc=new JFileChooser();
                fc.setFileFilter(new FileNameExtensionFilter("Ejecutable","exe"));
                fc.showOpenDialog(this);//showOpenDialog muestra al filechooser en una nueva ventana
                programa=fc.getSelectedFile().toString();//getSelectedFile obtiene la dirección del archivo; toString lo convierte a cadena                
                w2=w2.replace("\\","\\\\");
                programa = programa.replace("\\","\\\\");                
                stmt.executeUpdate("UPDATE login.direcciones SET word = REPLACE(word,'"+w2+"','"+programa+"')");
                jOptionPane1.showMessageDialog(null,"Dirección cambiada exitosamente","Enhorabuena",2); 
                   } }             
            } catch(Exception e){
                
            }          
        }catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
public void mostrar(String programa,int columna){
    try{                         
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               try{                        
            if (con!= null){
                System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);                                
                stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from login.direcciones");
               while(rs.next()){//resultset.next busca cada valor de todas las columnas en la base de datos
               programa=rs.getString(columna);
               jOptionPane1.showMessageDialog(null,programa,"Dirección",JOptionPane.INFORMATION_MESSAGE);
               } }             
            } catch(Exception e){
                
            }          
        }catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
    public void imagen_label(String carpeta,String nombre,String tipo,JLabel frame){
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/"+carpeta+"/"+nombre+"."+tipo));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(frame.getWidth(),frame.getHeight(),Image.SCALE_DEFAULT));
        frame.setIcon(icono);
        this.repaint();
    }
    public void imagen_menuItem(String carpeta,String nombre,String tipo, JMenuItem frame,int ancho,int alto){
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/"+carpeta+"/"+nombre+"."+tipo));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
        frame.setIcon(icono);
        this.repaint();
    }
    public void imagen_menu(String carpeta,String nombre,String tipo, JMenu frame,int ancho,int alto){
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/"+carpeta+"/"+nombre+"."+tipo));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
        frame.setIcon(icono);
        this.repaint();
    }
    public menú() {
        initComponents();        
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto9.png")).getImage());
        imagen_label("iconos","gh3","jpg",fondo);
        imagen_label("iconos","guns_n_roses","jpg",fondo1);
        imagen_label("iconos","hotarubi no mori e","jpg",fondo2);
        imagen_label("iconos","orange","jpg",fondo3);        
        setTitle("Menú");
        setLocationRelativeTo(null);
        setResizable(false);       
        //word
        imagen_menuItem("iconos","word","png",word,25,25);
        imagen_menuItem("iconos","word","png",hword,25,25);
        imagen_menuItem("iconos","word","png",mword,25,25);
        //excel
        imagen_menuItem("iconos","excel","png",excel,25,25);
        imagen_menuItem("iconos","excel","png",hexcel,25,25);
        imagen_menuItem("iconos","excel","png",mexcel,25,25);
        //power point
        imagen_menuItem("iconos","power point","png",powerpoint,25,25);
        imagen_menuItem("iconos","power point","png",hpower_point,25,25);
        imagen_menuItem("iconos","power point","png",mpower_point,25,25);
        //firefox
        imagen_menuItem("iconos","firefox","png",firefox,25,25);
        imagen_menuItem("iconos","firefox","png",hfirefox,25,25);
        imagen_menuItem("iconos","firefox","png",mfirefox,25,25);
        //google chrome
        imagen_menuItem("iconos","chrome","png",googlechrome,25,25);
        imagen_menuItem("iconos","chrome","png",hchrome,25,25);
        imagen_menuItem("iconos","chrome","png",mchrome,25,25);
        //internet explorer
        imagen_menuItem("iconos","explorer","png",internetexplorer,25,25);
        imagen_menuItem("iconos","explorer","png",hexplorer,25,25);
        imagen_menuItem("iconos","explorer","png",mexplorer,25,25);        
        imagen_menuItem("iconos","Gaara del desierto","png",kats,25,25);//cuanto sabes de naruto        
        imagen_menuItem("img","java","jpg",pane,26,26);//tipos de pane        
        imagen_menuItem("iconos","mizukage","jpg",calculadorax,26,26);//calculadora        
        imagen_menuItem("iconos","naruto senpou","jpg",trab_II,26,26);//trabajo progra II        
        imagen_menuItem("iconos","calendario_naruto","jpg",calendario,36,45);//calendario
        //plantas vs zombies
        imagen_menuItem("iconos","plantas vs zombies","png",plvszom,33,26);
        imagen_menuItem("iconos","plantas vs zombies","png",plvszomh,33,26);
        imagen_menuItem("iconos","plantas vs zombies","png",mplvszom,33,26);
        //warcraft
        imagen_menu("iconos","warcraft","jpg",warcraft,26,25);     
        imagen_menu("iconos","warcraft","jpg",warcrafth,26,25); 
        imagen_menu("iconos","warcraft","jpg",mwarcraft,26,25); 
        //reign of chaos
        imagen_menuItem("iconos","Warcraft-III-Reign-of-Chaos","png",roc,26,25);
        imagen_menuItem("iconos","Warcraft-III-Reign-of-Chaos","png",roch,26,25);
        imagen_menuItem("iconos","Warcraft-III-Reign-of-Chaos","png",mroc,26,25);
        //frozen throne
        imagen_menuItem("iconos","frozen throne","jpg",tft,28,25);
        imagen_menuItem("iconos","frozen throne","jpg",tfth,28,25);
        imagen_menuItem("iconos","frozen throne","jpg",mtft,28,25);        
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        fondo = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        cambiar_user = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        herramientas = new javax.swing.JMenu();
        cambio_direccion = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        hword = new javax.swing.JMenuItem();
        hexcel = new javax.swing.JMenuItem();
        hpower_point = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        hfirefox = new javax.swing.JMenuItem();
        hexplorer = new javax.swing.JMenuItem();
        hchrome = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        juegosh = new javax.swing.JMenu();
        plvszomh = new javax.swing.JMenuItem();
        warcrafth = new javax.swing.JMenu();
        roch = new javax.swing.JMenuItem();
        tfth = new javax.swing.JMenuItem();
        mostrar_direcciones = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mword = new javax.swing.JMenuItem();
        mexcel = new javax.swing.JMenuItem();
        mpower_point = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        mfirefox = new javax.swing.JMenuItem();
        mexplorer = new javax.swing.JMenuItem();
        mchrome = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mjuegos = new javax.swing.JMenu();
        mplvszom = new javax.swing.JMenuItem();
        mwarcraft = new javax.swing.JMenu();
        mroc = new javax.swing.JMenuItem();
        mtft = new javax.swing.JMenuItem();
        cambiopass = new javax.swing.JMenuItem();
        ajustes = new javax.swing.JMenuItem();
        office = new javax.swing.JMenu();
        word = new javax.swing.JMenuItem();
        excel = new javax.swing.JMenuItem();
        powerpoint = new javax.swing.JMenuItem();
        internet = new javax.swing.JMenu();
        navegadores = new javax.swing.JMenu();
        firefox = new javax.swing.JMenuItem();
        internetexplorer = new javax.swing.JMenuItem();
        googlechrome = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        direccion = new javax.swing.JMenuItem();
        juegos = new javax.swing.JMenu();
        plvszom = new javax.swing.JMenuItem();
        warcraft = new javax.swing.JMenu();
        roc = new javax.swing.JMenuItem();
        tft = new javax.swing.JMenuItem();
        proyectos = new javax.swing.JMenu();
        kats = new javax.swing.JMenuItem();
        pane = new javax.swing.JMenuItem();
        calculadorax = new javax.swing.JMenuItem();
        trab_II = new javax.swing.JMenuItem();
        calendario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 160));
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 160));
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 160));
        getContentPane().add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 160));

        archivo.setText("Archivo");

        cambiar_user.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        cambiar_user.setText("Cambiar de usuario");
        cambiar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_userActionPerformed(evt);
            }
        });
        archivo.add(cambiar_user);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        jMenuBar1.add(archivo);

        herramientas.setText("Herramientas");

        cambio_direccion.setText("Cambiar direcciones");

        jMenu1.setText("Office");

        hword.setText("Word");
        hword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hwordActionPerformed(evt);
            }
        });
        jMenu1.add(hword);

        hexcel.setText("Excel");
        hexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexcelActionPerformed(evt);
            }
        });
        jMenu1.add(hexcel);

        hpower_point.setText("Power Point");
        hpower_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpower_pointActionPerformed(evt);
            }
        });
        jMenu1.add(hpower_point);

        cambio_direccion.add(jMenu1);
        cambio_direccion.add(jSeparator2);

        jMenu2.setText("Internet");

        hfirefox.setText("Firefox");
        hfirefox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hfirefoxActionPerformed(evt);
            }
        });
        jMenu2.add(hfirefox);

        hexplorer.setText("Internet Explorer");
        hexplorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexplorerActionPerformed(evt);
            }
        });
        jMenu2.add(hexplorer);

        hchrome.setText("Google Chrome");
        hchrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hchromeActionPerformed(evt);
            }
        });
        jMenu2.add(hchrome);

        cambio_direccion.add(jMenu2);
        cambio_direccion.add(jSeparator3);

        juegosh.setText("Juegos");

        plvszomh.setText("Plantas vs Zombies");
        plvszomh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plvszomhActionPerformed(evt);
            }
        });
        juegosh.add(plvszomh);

        warcrafth.setText("Warcraft");

        roch.setText("Reign of chaos");
        roch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rochActionPerformed(evt);
            }
        });
        warcrafth.add(roch);

        tfth.setText("The frozen throne");
        tfth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfthActionPerformed(evt);
            }
        });
        warcrafth.add(tfth);

        juegosh.add(warcrafth);

        cambio_direccion.add(juegosh);

        herramientas.add(cambio_direccion);

        mostrar_direcciones.setText("Mostrar direcciones");

        jMenu3.setText("Office");

        mword.setText("Word");
        mword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwordActionPerformed(evt);
            }
        });
        jMenu3.add(mword);

        mexcel.setText("Excel");
        mexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexcelActionPerformed(evt);
            }
        });
        jMenu3.add(mexcel);

        mpower_point.setText("Power Point");
        mpower_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpower_pointActionPerformed(evt);
            }
        });
        jMenu3.add(mpower_point);

        mostrar_direcciones.add(jMenu3);
        mostrar_direcciones.add(jSeparator4);

        jMenu4.setText("Internet");

        mfirefox.setText("Firefox");
        mfirefox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfirefoxActionPerformed(evt);
            }
        });
        jMenu4.add(mfirefox);

        mexplorer.setText("Internet Explorer");
        mexplorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexplorerActionPerformed(evt);
            }
        });
        jMenu4.add(mexplorer);

        mchrome.setText("Google Chrome");
        mchrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mchromeActionPerformed(evt);
            }
        });
        jMenu4.add(mchrome);

        mostrar_direcciones.add(jMenu4);
        mostrar_direcciones.add(jSeparator5);

        mjuegos.setText("Juegos");

        mplvszom.setText("Plantas vs zombies");
        mplvszom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mplvszomActionPerformed(evt);
            }
        });
        mjuegos.add(mplvszom);

        mwarcraft.setText("Warcraft");

        mroc.setText("Reign of chaos");
        mroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrocActionPerformed(evt);
            }
        });
        mwarcraft.add(mroc);

        mtft.setText("Frozen throne");
        mtft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtftActionPerformed(evt);
            }
        });
        mwarcraft.add(mtft);

        mjuegos.add(mwarcraft);

        mostrar_direcciones.add(mjuegos);

        herramientas.add(mostrar_direcciones);

        cambiopass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        cambiopass.setText("Cambio de contraseña");
        cambiopass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiopassActionPerformed(evt);
            }
        });
        herramientas.add(cambiopass);

        ajustes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        ajustes.setText("Ajustes");
        ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesActionPerformed(evt);
            }
        });
        herramientas.add(ajustes);

        jMenuBar1.add(herramientas);

        office.setText("Office");

        word.setText("Word");
        word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordMouseClicked(evt);
            }
        });
        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });
        office.add(word);

        excel.setText("Excel");
        excel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelMouseClicked(evt);
            }
        });
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });
        office.add(excel);

        powerpoint.setText("Power Point");
        powerpoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerpointMouseClicked(evt);
            }
        });
        powerpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerpointActionPerformed(evt);
            }
        });
        office.add(powerpoint);

        jMenuBar1.add(office);

        internet.setText("Internet");

        navegadores.setText("Navegadores");

        firefox.setText("Firefox");
        firefox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firefoxActionPerformed(evt);
            }
        });
        navegadores.add(firefox);

        internetexplorer.setText("Internet Explorer");
        internetexplorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetexplorerActionPerformed(evt);
            }
        });
        navegadores.add(internetexplorer);

        googlechrome.setText("Google Chrome");
        googlechrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googlechromeActionPerformed(evt);
            }
        });
        navegadores.add(googlechrome);

        internet.add(navegadores);
        internet.add(jSeparator1);

        direccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        direccion.setText("Páginas web");
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        internet.add(direccion);

        jMenuBar1.add(internet);

        juegos.setText("Juegos");

        plvszom.setText("Plantas vs Zombies");
        plvszom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plvszomActionPerformed(evt);
            }
        });
        juegos.add(plvszom);

        warcraft.setText("Warcraft");

        roc.setText("Reign of Chaos");
        roc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocActionPerformed(evt);
            }
        });
        warcraft.add(roc);

        tft.setText("Frozen Throne");
        tft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftActionPerformed(evt);
            }
        });
        warcraft.add(tft);

        juegos.add(warcraft);

        jMenuBar1.add(juegos);

        proyectos.setText("Proyectos");

        kats.setText("Cuánto sabes de Naruto");
        kats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katsActionPerformed(evt);
            }
        });
        proyectos.add(kats);

        pane.setText("Tipos de jOptionPane");
        pane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paneActionPerformed(evt);
            }
        });
        proyectos.add(pane);

        calculadorax.setText("Calculadora");
        calculadorax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraxActionPerformed(evt);
            }
        });
        proyectos.add(calculadorax);

        trab_II.setText("Trabajo progra II");
        trab_II.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trab_IIActionPerformed(evt);
            }
        });
        proyectos.add(trab_II);

        calendario.setText("Calendario");
        calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioActionPerformed(evt);
            }
        });
        proyectos.add(calendario);

        jMenuBar1.add(proyectos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*public: el método se puede usar desde fuera.
 static: el método pertenece a la clase (no a los objetos de la clase).
void: no retorna nada.
 String[] args: es el argumento, datos que se pasan a la operación.
 System: es una clase predefinida que representa al computador.
 out: es un objeto de la clase System, predefinido: representa la pantalla.
 println: método para poner un texto en la pantalla.*/
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void wordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordMouseClicked

    }//GEN-LAST:event_wordMouseClicked

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        abrir(wordp,1);        
    }//GEN-LAST:event_wordActionPerformed

    private void excelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelMouseClicked

    }//GEN-LAST:event_excelMouseClicked

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        abrir(excelp,2);
    }//GEN-LAST:event_excelActionPerformed

    private void powerpointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerpointMouseClicked

    }//GEN-LAST:event_powerpointMouseClicked

    private void powerpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerpointActionPerformed
        abrir(ppp,3);
    }//GEN-LAST:event_powerpointActionPerformed

    private void firefoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firefoxActionPerformed
        abrir(firefoxp,4);
    }//GEN-LAST:event_firefoxActionPerformed

    private void internetexplorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetexplorerActionPerformed
        abrir(iexplorerp,6);
    }//GEN-LAST:event_internetexplorerActionPerformed

    private void googlechromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googlechromeActionPerformed
        abrir(gchromep,5);
    }//GEN-LAST:event_googlechromeActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        paginasweb pw =new paginasweb();
        pw.setVisible(true);
    }//GEN-LAST:event_direccionActionPerformed

    private void katsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katsActionPerformed
        String [] botones = {"Fácil","Difícil"}; 
        int variable = JOptionPane.showOptionDialog (null, " Elige la dificultad de tu encuesta", "Encuesta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                null, botones, botones[1]);        
           if(botones[variable].equals("Fácil")){
               JOptionPane.showMessageDialog(null, "Ha escogido "+botones[variable]);
               naruto_facil k=new naruto_facil();
               k.setVisible(true);
           } else{
               if(botones[variable].equals("Difícil")){
                   JOptionPane.showMessageDialog(null, "Ha escogido "+botones[variable]);
                   naruto_dificil h=new naruto_dificil();
                   h.setVisible(true);
           } }
    }//GEN-LAST:event_katsActionPerformed

    private void paneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paneActionPerformed
        pane p=new pane();
        p.setVisible(true);
    }//GEN-LAST:event_paneActionPerformed

    private void trab_IIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trab_IIActionPerformed
        String[] opciones={"Inicio","Elegir ventana"};
        int val=jOptionPane1.showOptionDialog(trab_II,"¿Desea ir desde el principio o escoger\nuna ventana en específico?","Trabajo de Programación II", jOptionPane1.YES_NO_OPTION, jOptionPane1.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if(opciones[val].equals("Inicio")){
            bienvenido bn=new bienvenido();
            bn.setVisible(true);
        }else if(opciones[val].equals("Elegir ventana")){
                String[] ventanas={"Carátula","Números Impares","Poema","Imagen","Tres en raya","Matrices"};
                int val2=jOptionPane1.showOptionDialog(trab_II,"Escoja la ventana que desea ver","Opciones", jOptionPane1.YES_NO_OPTION,jOptionPane1.QUESTION_MESSAGE,null, ventanas, ventanas[0]);
                switch(ventanas[val2]){
                    case "Carátula":
                        bienvenido bn=new bienvenido();
                        bn.setVisible(true);
                        break;
                    case "Números Impares":
                        numeros n=new numeros();
                        n.setVisible(true);
                        break;
                    case "Poema":
                        poema p=new poema();
                        p.setVisible(true);
                        break;
                    case "Imagen":
                        imagen i=new imagen();
                        i.setVisible(true);
                        break;
                    case "Tres en raya":
                        tres_en_raya t=new tres_en_raya();
                        t.setVisible(true);
                        break;
                    case "Matrices":
                        matrices m=new matrices();
                        m.setVisible(true);
                        break;
                    default:
                        jOptionPane1.showMessageDialog(null,"Ninguno es correcto");
                        break;
                }               
            }                
    }//GEN-LAST:event_trab_IIActionPerformed

    private void hwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hwordActionPerformed
        cambio(wordp,1);    
    }//GEN-LAST:event_hwordActionPerformed

    private void hexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexcelActionPerformed
        cambio(excelp,2);
    }//GEN-LAST:event_hexcelActionPerformed

    private void hpower_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpower_pointActionPerformed
        cambio(ppp,3);
    }//GEN-LAST:event_hpower_pointActionPerformed

    private void hfirefoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hfirefoxActionPerformed
        cambio(firefoxp,4);
    }//GEN-LAST:event_hfirefoxActionPerformed

    private void hchromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hchromeActionPerformed
        cambio(gchromep,5);
    }//GEN-LAST:event_hchromeActionPerformed

    private void hexplorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexplorerActionPerformed
        cambio(iexplorerp,6);
    }//GEN-LAST:event_hexplorerActionPerformed

    private void mwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwordActionPerformed
        mostrar(wordp,1);
    }//GEN-LAST:event_mwordActionPerformed

    private void mexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexcelActionPerformed
        mostrar(excelp,2);
    }//GEN-LAST:event_mexcelActionPerformed

    private void mpower_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpower_pointActionPerformed
        mostrar(ppp,3);
    }//GEN-LAST:event_mpower_pointActionPerformed

    private void mfirefoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfirefoxActionPerformed
        mostrar(firefoxp,4);
    }//GEN-LAST:event_mfirefoxActionPerformed

    private void mexplorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexplorerActionPerformed
        mostrar(iexplorerp,6);
    }//GEN-LAST:event_mexplorerActionPerformed

    private void mchromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mchromeActionPerformed
        mostrar(gchromep,5);
    }//GEN-LAST:event_mchromeActionPerformed

    private void calculadoraxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraxActionPerformed
        Calculadora_new cw=new Calculadora_new();
        cw.setVisible(true);
    }//GEN-LAST:event_calculadoraxActionPerformed

    private void plvszomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plvszomActionPerformed
        abrir(plzom,7);
    }//GEN-LAST:event_plvszomActionPerformed

    private void calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioActionPerformed
        try{                         
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               try{  
                   if (con!= null){
                System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);     
                stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from login.direcciones");
               while(rs.next()){//resultset.next busca cada valor de todas las columnas en la base de datos
               clndr=rs.getString(10);
               String w2=clndr;
                   try{          
               Process p=Runtime.getRuntime().exec("cmd /c start "+clndr);
               p.getOutputStream();
               }catch(IOException e){
                   int z=jOptionPane1.showConfirmDialog(null,"Dirección incorrecta", "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE,null);
                   //DEFAULT_OPTION muestra solo el botón Aceptar  
                   if(z==JOptionPane.OK_OPTION){ 
                JFileChooser fc=new JFileChooser();
                fc.setFileFilter(new FileNameExtensionFilter("Documento de Excel","xls","xlsx"));
                int opcion=fc.showOpenDialog(this);//showOpenDialog muestra al filechooser en una nueva ventana
                clndr=fc.getSelectedFile().toString();//getSelectedFile obtiene la dirección del archivo; toString lo convierte a cadena
                jOptionPane1.showMessageDialog(null,clndr);   
                w2=w2.replace("\\","\\\\");
                clndr = clndr.replace("\\","\\\\");
                stmt.executeUpdate("update login.direcciones set word = replace(word,'"+w2+"','"+clndr+"')");
                if (opcion==JFileChooser.APPROVE_OPTION){
                    try{
                        Process p2=Runtime.getRuntime().exec("cmd /c start "+clndr);            
                        p2.getOutputStream();  
                    } catch(IOException ex){
                        jOptionPane1.showMessageDialog(null,"Dirección incorrecta", "Confirmación", jOptionPane1.ERROR_MESSAGE);
                    } } } } } }             
            } catch(Exception e){
                
            }          
        }catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_calendarioActionPerformed

    private void cambiopassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiopassActionPerformed
//        if(cpw.cp=true){
//            cambiopass cp=new cambiopass();
//            cp.setVisible(true);
//        }else if(cpw.cp=false){
//            
//        }        
    }//GEN-LAST:event_cambiopassActionPerformed

    private void ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesActionPerformed
        String opciones[]={"Eliminar usuario","Agregar usuario"};
        int opcion=jOptionPane1.showOptionDialog(null,"Selecciona una opción","Elegir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[1]);
        if(opciones[opcion].equals("Eliminar usuario")){
            eliminar_user eu=new eliminar_user();
            eu.setVisible(true);
        }else{
            if(opciones[opcion].equals("Agregar usuario")){
                registro r=new registro();
                r.setVisible(true);
            }
        }
    }//GEN-LAST:event_ajustesActionPerformed

    private void rocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocActionPerformed
        abrir(rocp,8);
    }//GEN-LAST:event_rocActionPerformed

    private void tftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftActionPerformed
        abrir(tftp,9);
    }//GEN-LAST:event_tftActionPerformed

    private void cambiar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_userActionPerformed
        dispose();
        login l=new login();
        l.setVisible(true);
    }//GEN-LAST:event_cambiar_userActionPerformed

    private void plvszomhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plvszomhActionPerformed
        cambio(plzom,7);
    }//GEN-LAST:event_plvszomhActionPerformed

    private void rochActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rochActionPerformed
        cambio(rocp,8);
    }//GEN-LAST:event_rochActionPerformed

    private void tfthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfthActionPerformed
        cambio(tftp,9);
    }//GEN-LAST:event_tfthActionPerformed

    private void mplvszomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mplvszomActionPerformed
        mostrar(plzom,7);
    }//GEN-LAST:event_mplvszomActionPerformed

    private void mrocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrocActionPerformed
        mostrar(rocp,8);
    }//GEN-LAST:event_mrocActionPerformed

    private void mtftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtftActionPerformed
        mostrar(tftp,9);
    }//GEN-LAST:event_mtftActionPerformed
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
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ajustes;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenuItem calculadorax;
    private javax.swing.JMenuItem calendario;
    private javax.swing.JMenuItem cambiar_user;
    private javax.swing.JMenu cambio_direccion;
    private javax.swing.JMenuItem cambiopass;
    private javax.swing.JMenuItem direccion;
    private javax.swing.JMenuItem excel;
    private javax.swing.JMenuItem firefox;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JMenuItem googlechrome;
    private javax.swing.JMenuItem hchrome;
    private javax.swing.JMenu herramientas;
    private javax.swing.JMenuItem hexcel;
    private javax.swing.JMenuItem hexplorer;
    private javax.swing.JMenuItem hfirefox;
    private javax.swing.JMenuItem hpower_point;
    private javax.swing.JMenuItem hword;
    private javax.swing.JMenu internet;
    private javax.swing.JMenuItem internetexplorer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu juegos;
    private javax.swing.JMenu juegosh;
    private javax.swing.JMenuItem kats;
    private javax.swing.JMenuItem mchrome;
    private javax.swing.JMenuItem mexcel;
    private javax.swing.JMenuItem mexplorer;
    private javax.swing.JMenuItem mfirefox;
    private javax.swing.JMenu mjuegos;
    private javax.swing.JMenu mostrar_direcciones;
    private javax.swing.JMenuItem mplvszom;
    private javax.swing.JMenuItem mpower_point;
    private javax.swing.JMenuItem mroc;
    private javax.swing.JMenuItem mtft;
    private javax.swing.JMenu mwarcraft;
    private javax.swing.JMenuItem mword;
    private javax.swing.JMenu navegadores;
    private javax.swing.JMenu office;
    private javax.swing.JMenuItem pane;
    private javax.swing.JMenuItem plvszom;
    private javax.swing.JMenuItem plvszomh;
    private javax.swing.JMenuItem powerpoint;
    private javax.swing.JMenu proyectos;
    private javax.swing.JMenuItem roc;
    private javax.swing.JMenuItem roch;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem tft;
    private javax.swing.JMenuItem tfth;
    private javax.swing.JMenuItem trab_II;
    private javax.swing.JMenu warcraft;
    private javax.swing.JMenu warcrafth;
    private javax.swing.JMenuItem word;
    // End of variables declaration//GEN-END:variables
}
