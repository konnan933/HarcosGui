
package main;


public class HarcoaGui {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HarcosTer().setVisible(true);
            }
        });
    }
    
}
