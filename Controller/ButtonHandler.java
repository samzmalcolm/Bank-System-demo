
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener{

    public View.GUI g;
    public View.Saving vs;
    public View.Current vc;
    public View.Freedom vf;
    public Model.Current mc;
    public Model.Saving ms;
    public Model.Freedom mf;
    public Model.Customer cus;
    int counter=1;
    
    public void setRef(View.GUI gg,View.Saving vss,View.Current vcc, View.Freedom vff, Model.Current mcc, Model.Saving mss, Model.Freedom mff, Model.Customer cuss)
    {
        g =gg;
        vs=vss;
        vc= vcc;
        vf= vff;
        mc= mcc;
        ms= mss;
        mf= mff;
        cus= cuss;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getActionCommand().equalsIgnoreCase("Saving"))
       {
           g.frame.setVisible(false);
           vs.frame.setVisible(true);
       }
       
       if(e.getActionCommand().equalsIgnoreCase("<"))
       {
           vc.frame.setVisible(false);
           g.frame.setVisible(true);
       }
       
       
       if(e.getActionCommand().equalsIgnoreCase("<<"))
       {
           vf.frame.setVisible(false);
           g.frame.setVisible(true);
       }
       
       if(e.getActionCommand().equalsIgnoreCase("<<<"))
       {
           vs.frame.setVisible(false);
           g.frame.setVisible(true);
       }
       
       if(e.getActionCommand().equalsIgnoreCase("Freedom"))
       {
           g.frame.setVisible(false);
           vf.frame.setVisible(true);
       }
       
        if(e.getActionCommand().equalsIgnoreCase("Current"))
       {
           g.frame.setVisible(false);
           vc.frame.setVisible(true);
       }
        
       if(e.getActionCommand().equalsIgnoreCase("Transfer Savings"))
       {
           String amount = vs.text.getText();
           vs.text.setText("");
           int a= Integer.valueOf(amount);
           if(a<= ms.getAmount())
           {
               String [] arr = new String[4];
               if(vs.current.isSelected())
               {
                   int sav = ms.getAmount();
                   sav= sav-a;
                   ms.setAmount(sav);
                   int cur = mc.getAmount();
                   mc.setAmount(cur+a);
                   arr[0]= String.valueOf(counter);
                   counter++;
                   arr[1]="Saving";
                   arr[2]= String.valueOf(a);
                   arr[3]="Current";
               }
               else if(vs.freedom.isSelected())
               {
                    int sav = ms.getAmount();
                   sav= sav-a;
                   ms.setAmount(sav);
                   int cur = mf.getAmount();
                   mf.setAmount(cur+a);
                   arr[0]= String.valueOf(counter);
                   counter++;
                   arr[1]="Saving";
                   arr[2]= String.valueOf(a);
                   arr[3]="Freedom";
               }
               g.setAmounts(this);
               g.model.addRow(arr);
               
               g.sort();
               
               
               
               vs.frame.setVisible(false);
               g.frame.setVisible(true);
               
           }else
           {
                JOptionPane.showMessageDialog(vs.frame, "Not Enough Amount");
         
           }
       }
       
       
       if(e.getActionCommand().equalsIgnoreCase("Transfer Current"))
       {
           String amount = vc.text.getText();
           vc.text.setText("");
           int a= Integer.valueOf(amount);
           if(a<= mc.getAmount())
           {
               String [] arr = new String[4];
               if(vc.saving.isSelected())
               {
                   int curr = mc.getAmount();
                   curr= curr-a;
                   mc.setAmount(curr);
                   int cur = ms.getAmount();
                   ms.setAmount(cur+a);
                   arr[0]= String.valueOf(counter);
                   counter++;
                   arr[1]="Current";
                   arr[2]= String.valueOf(a);
                   arr[3]="Saving";
               }
               else if(vc.Freedom.isSelected())
               {
                   int curr = mc.getAmount();
                   curr= curr-a;
                   mc.setAmount(curr);
                   int cur = mf.getAmount();
                   mf.setAmount(cur+a);
                   arr[0]= String.valueOf(counter);
                   counter++;
                   arr[1]="Current";
                   arr[2]= String.valueOf(a);
                   arr[3]="Freedom";
               }
               g.setAmounts(this);
               g.model.addRow(arr);
               
               g.sort();
               
               
               
               vc.frame.setVisible(false);
               g.frame.setVisible(true);
               
           }else
           {
                JOptionPane.showMessageDialog(vs.frame, "Not Enough Amount");
         
           }
       }
       
       
       
      
       
        if(e.getActionCommand().equalsIgnoreCase("Transfer Freedom"))
       {
           String amount = vf.text.getText();
           vf.text.setText("");
           int a= Integer.valueOf(amount);
           if(a<= mf.getAmount())
           {
               String [] arr = new String[4];
               if(vf.saving.isSelected())
               {
                   int curr = mf.getAmount();
                   curr= curr-a;
                   mf.setAmount(curr);
                   int cur = ms.getAmount();
                   ms.setAmount(cur+a);
                   arr[0]= String.valueOf(counter);
                   counter++;
                   arr[1]="Freedom";
                   arr[2]= String.valueOf(a);
                   arr[3]="Saving";
               }
               else if(vf.current.isSelected())
               {
                   int curr = mf.getAmount();
                   curr= curr-a;
                   mf.setAmount(curr);
                   int cur = mc.getAmount();
                   mc.setAmount(cur+a);
                   arr[0]= String.valueOf(counter);
                   counter++;
                   arr[1]="Freedom";
                   arr[2]= String.valueOf(a);
                   arr[3]="Current";
               }
               g.setAmounts(this);
               g.model.addRow(arr);
               
               g.sort();
               
               
               
               vf.frame.setVisible(false);
               g.frame.setVisible(true);
               
           }else
           {
                JOptionPane.showMessageDialog(vs.frame, "Not Enough Amount");
         
           }
       }
       
      
       
       
       
       
       
       
       
    }
    
    
}
