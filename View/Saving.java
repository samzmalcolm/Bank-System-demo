
package View;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Saving {
    public JFrame frame;
    public JButton transfer;
    public JButton back;
    public JTextField text;
    public JCheckBox freedom;
    public JCheckBox current;
    
    public Saving()
    {
        initGUI();
        
    }
    
    public void initGUI()
    {
        frame= new JFrame("Saving Account");
        frame.setLayout(null);
        
        text= new JTextField();
        text.setBounds(100, 100, 250, 30);
        text.setHorizontalAlignment(JTextField.CENTER);
        frame.add(text);
        
        current = new JCheckBox("Current");
        current.setBounds(140, 200, 100, 50);
        current.setSelected(true);
        frame.add(current);
        
        freedom = new JCheckBox("Freedom");
        freedom.setBounds(250, 200, 140, 50);
        frame.add(freedom);
        
        
        current.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                  if(e.getStateChange() == ItemEvent.SELECTED){
                         freedom.setSelected(false);
                    }
            }
        });
        
        freedom.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) 
            {
                if(e.getStateChange() == ItemEvent.SELECTED){
                         current.setSelected(false);
                    }
            }
        });
        
        
        
        transfer = new JButton("Transfer Savings");
        transfer.setBounds(150, 300, 150, 30);
        frame.add(transfer);
        
        back = new JButton("<<<");
        back.setBounds(10, 10, 60, 30);
        frame.add(back);
        
       frame.setSize(450, 500);
       frame.setLocation(400, 150);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
