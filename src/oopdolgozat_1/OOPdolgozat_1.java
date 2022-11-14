
package oopdolgozat_1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class OOPdolgozat_1 {
    
    private JFrame frame;
    private JButton[] GombLista;
    

    public static void main(String[] args) {
       new OOPdolgozat_1();
    }
    public OOPdolgozat_1(){
        ini();
    }
    
    
     public void ini(){
        Formkinezet();
        MenuKinezet();
     }
     
     public void Formkinezet(){
        frame = new JFrame("Dolgozat");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension kep = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(kep.width/2-150, kep.height/2-125, 300, 250);
        frame.setSize(410, 350);
        frame.setVisible(true);
     }
    public void MenuKinezet(){
         JMenuBar FelsoMenu = new JMenuBar();
         JMenu BejelentkezesMenuGomb = new JMenu("bejelentkezes");
         BejelentkezesMenuGomb.setMnemonic(KeyEvent.VK_P);
         FelsoMenu.add(BejelentkezesMenuGomb);
         JMenu JatekMenuGomb = new JMenu("játék");
         JatekMenuGomb.setMnemonic(KeyEvent.VK_E);
         FelsoMenu.add(JatekMenuGomb);
         frame.add(FelsoMenu);
    }
        
    public void PinKodGombok(){ 
        LayoutManager lymGridAlso = new GridLayout(3,1);
        JTabbedPane ablakosPanel = new JTabbedPane();
        ablakosPanel.setBorder(new TitledBorder("Pinkód"));
        
//        LayoutManager lymFlowBal = new FlowLayout(FlowLayout.LEFT);
//        ablakosPanel = new JTabbedPane(lymFlowBal);


        for (JButton jButton : GombLista) {
            ablakosPanel.add(jButton);
        }
        frame.add(ablakosPanel);
     }
    
    public void gombokIni(){
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

        GombLista[0].add(gomb1);
        GombLista[1].add(gomb2);
        GombLista[2].add(gomb3);
        GombLista[3].add(gomb4);
        GombLista[4].add(gomb5);
        GombLista[5].add(gomb6);
        GombLista[6].add(gomb7);
        GombLista[7].add(gomb8);
        GombLista[8].add(gomb9);
        GombLista[9].add(gomb0);
    }
     
}
