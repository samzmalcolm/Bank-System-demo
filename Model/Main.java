
package Model;

import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        c.setBindings();
        c.g.frame.setVisible(true);
    }
}
