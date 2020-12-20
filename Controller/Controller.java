
package Controller;

public class Controller {
    public View.GUI g;
    public View.Saving vs;
    public View.Current vc;
    public View.Freedom vf;
    public Model.Current mc;
    public Model.Saving ms;
    public Model.Freedom mf;
    public Model.Customer cus;
    public ButtonHandler hnd;
    
    
    public Controller()
    {
        g= new View.GUI();
        vs= new View.Saving();
        vc = new View.Current();
        vf= new View.Freedom();
        mc= new Model.Current(10000);
        ms= new Model.Saving(8000);
        mf= new Model.Freedom(12000);
        cus= new Model.Customer("SamZmalcolm", "123 Main Street, New York, NY 10030");
        hnd= new ButtonHandler();
        
       
    }
    
    public void setBindings()
    {
        hnd.setRef(g, vs, vc, vf, mc, ms, mf, cus);
        g.setAmounts(hnd);
        g.setNameAddress(hnd);
        g.savingButton.addActionListener(hnd);
        g.currentButton.addActionListener(hnd);
        g.freedomButton.addActionListener(hnd);
        vs.transfer.addActionListener(hnd);
        vc.transfer.addActionListener(hnd);
        vf.transfer.addActionListener(hnd);
        vs.back.addActionListener(hnd);
        vf.back.addActionListener(hnd);
        vc.back.addActionListener(hnd);
    }
    
}
