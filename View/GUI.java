package View;

import Controller.ButtonHandler;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class GUI {
    public JFrame frame;
    public JPanel panel;
    public JTable table;
    public DefaultTableModel model;
    public JLabel name;
    public JLabel address;
    public JLabel saving;
    public JLabel Current;
    public JLabel Freedom;
    public JLabel CurrentAmount;
    public JLabel savingAmount;
    public JLabel freedomAmount;
    public JButton savingButton;
    public JButton freedomButton;
    public JButton currentButton;
   
    
    
   public GUI()
   {
       initGUI();
   }
    
   
   
    public void initGUI()
    {
        frame= new JFrame("Bank Transfer");
        frame.setLayout(null);
        
       
        name= new JLabel("name");
        name.setHorizontalAlignment(JLabel.CENTER);
        name.setBounds(10, 10, 430, 30);
        frame.add(name);
        
        address= new JLabel("Address");
        address.setHorizontalAlignment(JLabel.CENTER);
        address.setBounds(10, 40, 430, 30);
        frame.add(address);
        
        
        saving= new JLabel("Saving Account");
        saving.setHorizontalAlignment(JLabel.CENTER);
        saving.setBounds(20, 100, 150, 30);
        frame.add(saving);
        
        savingAmount= new JLabel("$");
        savingAmount.setHorizontalAlignment(JLabel.CENTER);
        savingAmount.setBounds(20, 120, 150, 30);
        frame.add(savingAmount);
        
        Current= new JLabel("Current Account");
        Current.setHorizontalAlignment(JLabel.CENTER);
        Current.setBounds(20, 180, 150, 30);
        frame.add(Current);
        
        CurrentAmount= new JLabel("Current Account");
        CurrentAmount.setHorizontalAlignment(JLabel.CENTER);
        CurrentAmount.setBounds(20, 200, 150, 30);
        frame.add(CurrentAmount);
        
        
        Freedom= new JLabel("Freedom Account");
        Freedom.setHorizontalAlignment(JLabel.CENTER);
        Freedom.setBounds(20, 260, 150, 30);
        frame.add(Freedom);
        
        freedomAmount= new JLabel("Freedom Account");
        freedomAmount.setHorizontalAlignment(JLabel.CENTER);
        freedomAmount.setBounds(20, 280, 150, 30);
        frame.add(freedomAmount);
        
        
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setSize(250, 210);
        panel.setLocation(170, 100);
        
        String y[]={"id","From","Amount","To"}; 
        model= new DefaultTableModel(y,0);
        table=new JTable(model);  
        table.removeColumn(table.getColumnModel().getColumn(0));
        table.setRowHeight(25);
        JScrollPane tableContainer = new JScrollPane(table);
        panel.add(tableContainer, BorderLayout.CENTER);
        frame.add(panel);
        
        
        savingButton = new JButton("Saving");
        savingButton.setBounds(50, 380, 100, 30);
        frame.add(savingButton);
        
        currentButton = new JButton("Current");
        currentButton.setBounds(160, 380, 100, 30);
        frame.add(currentButton);
        
        freedomButton = new JButton("Freedom");
        freedomButton.setBounds(270, 380, 100, 30);
        frame.add(freedomButton);
        
        
        frame.setSize(450, 500);
        frame.setLocation(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void setAmounts(ButtonHandler hnd)
    {
        savingAmount.setText(String.valueOf("$"+hnd.ms.getAmount()));
        freedomAmount.setText(String.valueOf("$"+hnd.mf.getAmount()));
        CurrentAmount.setText(String.valueOf("$"+hnd.mc.getAmount()));
    }
    public void setNameAddress(ButtonHandler hnd)
    {
        name.setText("Welcome, "+hnd.cus.getName());
        address.setText("Address: "+hnd.cus.getAddress());
    }
    public void sort()
    {
    TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
    table.setRowSorter(sorter);
    ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
     
    int columnIndexToSort = 0;
    sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.DESCENDING));
     
    sorter.setSortKeys(sortKeys);
    sorter.sort();
    }
}
