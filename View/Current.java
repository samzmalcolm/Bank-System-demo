
package View;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Current {
    
     public JFrame frame;
    public JButton transfer;
    public JButton back;
    public JTextField text;
    public JCheckBox saving;
    public JCheckBox Freedom;
    
    public Current()
    {
        initGUI();
        
    }
    
    public void initGUI()
    {
        frame= new JFrame("Current Account");
        frame.setLayout(null);
        
        text= new JTextField();
        text.setBounds(100, 100, 250, 30);
        text.setHorizontalAlignment(JTextField.CENTER);
        frame.add(text);
        
        Freedom = new JCheckBox("Freedom");
        Freedom.setBounds(140, 200, 100, 50);
        Freedom.setSelected(true);
        frame.add(Freedom);
        
        saving = new JCheckBox("Saving");
        saving.setBounds(250, 200, 140, 50);
        frame.add(saving);
        
        
        Freedom.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                  if(e.getStateChange() == ItemEvent.SELECTED){
                         saving.setSelected(false);
                    }
            }
        });
        
        saving.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) 
            {
                if(e.getStateChange() == ItemEvent.SELECTED){
                         Freedom.setSelected(false);
                    }
            }
        });
        
        
        
        transfer = new JButton("Transfer Current");
        transfer.setBounds(150, 300, 150, 30);
        frame.add(transfer);
        
        back = new JButton("<");
        back.setBounds(10, 10, 60, 30);
        frame.add(back);
        
       frame.setSize(450, 500);
       frame.setLocation(400, 150);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    
}
