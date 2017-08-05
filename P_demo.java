/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_demo;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Jagruti
 */
public class P_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Stegno s = new Stegno();

        s.setTitle("Main Menu");
        s.pack();
        s.show();
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		try
		{
			   	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           // javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
       
    }

    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class StegnoLayout implements LayoutManager {

    public StegnoLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 700 + insets.left + insets.right;
        dim.height = 400 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+45,insets.top+30,648,42);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+235,insets.top+108,240,48);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+235,insets.top+170,240,48);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+260,insets.top+310,184,48);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+536,insets.top+378,58,22);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+593,insets.top+378,105,22);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+235,insets.top+232,240,48);}
        
    }
}


    










