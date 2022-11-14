
package oopdolgozat_1;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;


public class OOPdolgozat_1 {
    private static final int gombokDB = 10;
    private JFrame frame;
    private JButton[] GombLista;
    

    public static void main(String[] args) {
       new OOPdolgozat_1();
    }
    public OOPdolgozat_1(){
        ini();
    }
    
    
     private void ini(){
        Formkinezet();
        MenuKinezet();
        PinKodGombok();
     }
     
     private void Formkinezet(){
        frame = new JFrame("Dolgozat");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension kep = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(kep.width/2-150, kep.height/2-125, 300, 250);
        frame.setSize(410, 350);
        frame.setVisible(true);
     }
    private void MenuKinezet(){
        JMenuBar mb=new JMenuBar();  
        JMenu ProgramMenu =new JMenu("program"); 
        JMenu JatekelrendMenu = new JMenu("Jatek elrendezes");
        JMenuItem UjraAL=new JMenuItem("Ujra");  
        JMenuItem KilepAL=new JMenuItem("Kilépés");
        JMenuItem VizszintesAL=new JMenuItem("Vízszintes");  
        JMenuItem FuggolegesAL=new JMenuItem("Fuggoleges");
        ProgramMenu.add(UjraAL);
        ProgramMenu.add(KilepAL);
        JatekelrendMenu.add(VizszintesAL);
        JatekelrendMenu.add(FuggolegesAL);
        
        mb.add(ProgramMenu);  
        mb.add(JatekelrendMenu); 
        frame.setJMenuBar(mb);  
       
    }
        
    private void PinKodGombok(){ 
        JPanel p1=new JPanel();   
        LayoutManager lymGridFrame = new GridLayout(2, 1);
        p1.setLayout(lymGridFrame);
        JTextField Iromezo = new JTextField();
        JPanel p2=new JPanel();   
        JTabbedPane tp=new JTabbedPane();  
        tp.setSize(150, 150);
        tp.add("Bejelentkezes",p1);  
        tp.add("Játék",p2);
        JPanel pinesmez = new JPanel();
        JPanel chekboxosmez = new JPanel();
        chekboxosmez.add(Iromezo);
        chekboxosmez.setSize(200, 250);
        chekboxosmez.setBorder(new TitledBorder("Beállítás"));
        p1.add(pinesmez);
        p1.add(chekboxosmez);
        LayoutManager pinesGrid = new GridLayout(4, 1);
        pinesmez.setLayout(pinesGrid);
        pinesmez.setSize(200, 250);
        pinesmez.setBorder(new TitledBorder("Pinkód"));
        
        
        GombLista = new JButton[gombokDB];
        gombokIni();
        for (JButton g : GombLista) {
            pinesmez.add(g);
        }
        
        frame.add(tp);    
          
     }
    
    
    private void gombokIni(){
        JButton gomb1 = new JButton("1");
        JButton gomb2 = new JButton("2");
        JButton gomb3 = new JButton("3");
        JButton gomb4 = new JButton("4");
        JButton gomb5 = new JButton("5");
        JButton gomb6 = new JButton("6");
        JButton gomb7 = new JButton("7");
        JButton gomb8 = new JButton("8");
        JButton gomb9 = new JButton("9");
        JButton gomb0 = new JButton("0");

        GombLista[0] = (gomb1);
        GombLista[1] = (gomb2);
        GombLista[2] = (gomb3);
        GombLista[3] = (gomb4);
        GombLista[4] =(gomb5);
        GombLista[5] = (gomb6);
        GombLista[6] = (gomb7);
        GombLista[7] = (gomb8);
        GombLista[8] = (gomb9);
        GombLista[9] = (gomb0);
    }
     
}
