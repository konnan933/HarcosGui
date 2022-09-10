
package main;

import java.awt.Component;
import java.net.URL;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class HarcosTer extends javax.swing.JFrame {
    private final URL[] kepekURL = {getClass().getResource("fightingBackground.jpg"),getClass().getResource("lovag.jpg"),getClass().getResource("varazslo.jpg")};
    private final ImageIcon[] kepek = new ImageIcon[3];
    private  Karakter varazslo = new Karakter("Varázsló",0,1);
    private  Karakter harcos = new Karakter("Harcos",2,2);
    private JButton[] harcosTerek;
    private JButton[] varazsloElete;
    private JButton[] harcosElete;
    
     
    public HarcosTer() {
        initComponents();
        jatek();
    }
    
    private JButton[] komponensekLekeres(JPanel panelNev){
        Component[] components = panelNev.getComponents();
        JButton[] gombok = new JButton[components.length];       
        for (int i = 0; i < components.length; i++) {
            
            if (components[i].getClass().equals(JButton.class)) {
                gombok[i] = (JButton)components[i];
            }
        }       
        return gombok;
    }
    private void kepekkeAlakitas(){
        for (int i = 0; i < kepek.length; i++) {
            ImageIcon icon = new ImageIcon(kepekURL[i]);
            kepek[i] = icon;
        }
    }
    
    private void jatek(){
        kezdoAllapot();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        harcosTer = new javax.swing.JPanel();
        mezo1 = new javax.swing.JButton();
        mezo2 = new javax.swing.JButton();
        mezo3 = new javax.swing.JButton();
        varazsloEletEro = new javax.swing.JPanel();
        varazsloElet1 = new javax.swing.JButton();
        varazsloElet3 = new javax.swing.JButton();
        varazsloElet2 = new javax.swing.JButton();
        harcosEletEro = new javax.swing.JPanel();
        hacosElet1 = new javax.swing.JButton();
        harcosElet3 = new javax.swing.JButton();
        harcosElet2 = new javax.swing.JButton();
        jatekIranyitasTer = new javax.swing.JPanel();
        ujJatekGomb = new javax.swing.JButton();
        kovetkezoKorGomb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        harcosTer.setBorder(javax.swing.BorderFactory.createTitledBorder("Harcos tér"));

        mezo2.setToolTipText("");

        javax.swing.GroupLayout harcosTerLayout = new javax.swing.GroupLayout(harcosTer);
        harcosTer.setLayout(harcosTerLayout);
        harcosTerLayout.setHorizontalGroup(
            harcosTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(harcosTerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mezo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(mezo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(mezo3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        harcosTerLayout.setVerticalGroup(
            harcosTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(harcosTerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(harcosTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mezo3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mezo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mezo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        varazsloEletEro.setBorder(javax.swing.BorderFactory.createTitledBorder("Varázsló élet ereje:"));

        varazsloElet1.setBackground(new java.awt.Color(32, 255, 0));

        varazsloElet3.setBackground(new java.awt.Color(32, 255, 0));

        varazsloElet2.setBackground(new java.awt.Color(32, 255, 0));

        javax.swing.GroupLayout varazsloEletEroLayout = new javax.swing.GroupLayout(varazsloEletEro);
        varazsloEletEro.setLayout(varazsloEletEroLayout);
        varazsloEletEroLayout.setHorizontalGroup(
            varazsloEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varazsloEletEroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(varazsloElet1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varazsloElet2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varazsloElet3)
                .addContainerGap())
        );
        varazsloEletEroLayout.setVerticalGroup(
            varazsloEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varazsloEletEroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(varazsloEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varazsloElet3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varazsloElet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varazsloElet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        harcosEletEro.setBorder(javax.swing.BorderFactory.createTitledBorder("Harcos élet ereje:"));

        hacosElet1.setBackground(new java.awt.Color(32, 255, 0));
        hacosElet1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        harcosElet3.setBackground(new java.awt.Color(32, 255, 0));

        harcosElet2.setBackground(new java.awt.Color(32, 255, 0));

        javax.swing.GroupLayout harcosEletEroLayout = new javax.swing.GroupLayout(harcosEletEro);
        harcosEletEro.setLayout(harcosEletEroLayout);
        harcosEletEroLayout.setHorizontalGroup(
            harcosEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(harcosEletEroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hacosElet1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harcosElet2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harcosElet3)
                .addContainerGap())
        );
        harcosEletEroLayout.setVerticalGroup(
            harcosEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(harcosEletEroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(harcosEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacosElet1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(harcosElet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(harcosElet3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jatekIranyitasTer.setBorder(javax.swing.BorderFactory.createTitledBorder("Játék irányítás:"));

        ujJatekGomb.setText("Új játék");

        kovetkezoKorGomb.setText("Következő kör");

        javax.swing.GroupLayout jatekIranyitasTerLayout = new javax.swing.GroupLayout(jatekIranyitasTer);
        jatekIranyitasTer.setLayout(jatekIranyitasTerLayout);
        jatekIranyitasTerLayout.setHorizontalGroup(
            jatekIranyitasTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jatekIranyitasTerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kovetkezoKorGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ujJatekGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jatekIranyitasTerLayout.setVerticalGroup(
            jatekIranyitasTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jatekIranyitasTerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jatekIranyitasTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kovetkezoKorGomb)
                    .addComponent(ujJatekGomb))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jatekIranyitasTer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(varazsloEletEro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harcosEletEro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(harcosTer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(harcosEletEro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varazsloEletEro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(harcosTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jatekIranyitasTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   private void kezdoAllapot(){
        harcosTerek = komponensekLekeres(harcosTer);
        varazsloElete = komponensekLekeres(varazsloEletEro);
        harcosElete = komponensekLekeres(harcosEletEro);
        KezdoHelyzetLetrehoz(harcosTerek);
    }
   
   
   private void KezdoHelyzetLetrehoz(JButton[] harcosTer) {
       kepekkeAlakitas();
       harcosTer[0].setIcon((ImageIcon)kepek[2]);
       harcosTer[1].setIcon((ImageIcon)kepek[0]);
       harcosTer[2].setIcon((ImageIcon)kepek[1]);
   }
   
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hacosElet1;
    private javax.swing.JButton harcosElet2;
    private javax.swing.JButton harcosElet3;
    private javax.swing.JPanel harcosEletEro;
    private javax.swing.JPanel harcosTer;
    private javax.swing.JPanel jatekIranyitasTer;
    private javax.swing.JButton kovetkezoKorGomb;
    private javax.swing.JButton mezo1;
    private javax.swing.JButton mezo2;
    private javax.swing.JButton mezo3;
    private javax.swing.JButton ujJatekGomb;
    private javax.swing.JButton varazsloElet1;
    private javax.swing.JButton varazsloElet2;
    private javax.swing.JButton varazsloElet3;
    private javax.swing.JPanel varazsloEletEro;
    // End of variables declaration//GEN-END:variables

    
}
