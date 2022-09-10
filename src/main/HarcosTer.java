package main;

import java.awt.Color;
import java.awt.Component;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HarcosTer extends javax.swing.JFrame {

    private final URL[] kepekURL = {getClass().getResource("harcTer.jpg"), getClass().getResource("lovag.jpg"), getClass().getResource("varazslo.jpg"),getClass().getResource("harc.jpg")};
    private final ImageIcon[] kepek = new ImageIcon[4];
    private Karakter varazslo = new Karakter("Varázsló", 0, 1);
    private Karakter harcos = new Karakter("Harcos", 2, 2);
    int korSzamlalo = 0;
    private JButton[] harcosTerek;
    private JButton[] varazsloElete;
    private JButton[] harcosElete;

    public HarcosTer() {
        initComponents();
        jatek();
    }

    private JButton[] komponensekLekeres(JPanel panelNev) {
        Component[] components = panelNev.getComponents();
        JButton[] gombok = new JButton[components.length];
        for (int i = 0; i < components.length; i++) {

            if (components[i].getClass().equals(JButton.class)) {
                gombok[i] = (JButton) components[i];
            }
        }
        return gombok;
    }

    private void kepekkeAlakitas() {
        for (int i = 0; i < kepek.length; i++) {
            ImageIcon icon = new ImageIcon(kepekURL[i]);
            kepek[i] = icon;
        }
    }

    private void jatek() {
        kezdoAllapot();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        harcosTer = new javax.swing.JPanel();
        mezo1 = new javax.swing.JButton();
        mezo2 = new javax.swing.JButton();
        mezo3 = new javax.swing.JButton();
        jatekIranyitasTer = new javax.swing.JPanel();
        ujJatekGomb = new javax.swing.JButton();
        kovetkezoKorGomb = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        varazsloEletEro = new javax.swing.JPanel();
        varazsloElet1 = new javax.swing.JButton();
        varazsloElet3 = new javax.swing.JButton();
        varazsloElet2 = new javax.swing.JButton();
        varazsloElet4 = new javax.swing.JButton();
        korSzamlaloMezo = new javax.swing.JTextField();
        harcosEletEro = new javax.swing.JPanel();
        hacosElet1 = new javax.swing.JButton();
        harcosElet4 = new javax.swing.JButton();
        harcosElet2 = new javax.swing.JButton();
        harcosElet3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Játék");

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

        jatekIranyitasTer.setBorder(javax.swing.BorderFactory.createTitledBorder("Játék irányítás:"));

        ujJatekGomb.setText("Új játék");

        kovetkezoKorGomb.setText("Következő kör");
        kovetkezoKorGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kovetkezoKorGombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jatekIranyitasTerLayout = new javax.swing.GroupLayout(jatekIranyitasTer);
        jatekIranyitasTer.setLayout(jatekIranyitasTerLayout);
        jatekIranyitasTerLayout.setHorizontalGroup(
            jatekIranyitasTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jatekIranyitasTerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kovetkezoKorGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adatok:"));

        varazsloEletEro.setBorder(javax.swing.BorderFactory.createTitledBorder("Varázsló élet ereje:"));

        varazsloElet1.setBackground(new java.awt.Color(32, 255, 0));

        varazsloElet3.setBackground(new java.awt.Color(32, 255, 0));

        varazsloElet2.setBackground(new java.awt.Color(32, 255, 0));

        varazsloElet4.setBackground(new java.awt.Color(32, 255, 0));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varazsloElet4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        varazsloEletEroLayout.setVerticalGroup(
            varazsloEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varazsloEletEroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(varazsloEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varazsloElet3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(varazsloElet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varazsloElet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varazsloElet4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        korSzamlaloMezo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        korSzamlaloMezo.setText("kör: 0");
        korSzamlaloMezo.setBorder(null);

        harcosEletEro.setBorder(javax.swing.BorderFactory.createTitledBorder("Harcos élet ereje:"));

        hacosElet1.setBackground(new java.awt.Color(32, 255, 0));
        hacosElet1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        harcosElet4.setBackground(new java.awt.Color(32, 255, 0));

        harcosElet2.setBackground(new java.awt.Color(32, 255, 0));

        harcosElet3.setBackground(new java.awt.Color(32, 255, 0));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(harcosElet4))
        );
        harcosEletEroLayout.setVerticalGroup(
            harcosEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(harcosEletEroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(harcosEletEroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacosElet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(harcosElet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(harcosElet4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(harcosElet3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(varazsloEletEro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(korSzamlaloMezo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(harcosEletEro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(harcosEletEro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varazsloEletEro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(korSzamlaloMezo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jatekIranyitasTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harcosTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(harcosTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jatekIranyitasTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kovetkezoKorGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kovetkezoKorGombActionPerformed
        egyKor();
    }//GEN-LAST:event_kovetkezoKorGombActionPerformed

    private void kezdoAllapot() {
        harcosTerek = komponensekLekeres(harcosTer);
        varazsloElete = komponensekLekeres(varazsloEletEro);
        harcosElete = komponensekLekeres(harcosEletEro);
        KezdoHelyzetLetrehoz(harcosTerek);
    }

    private void KezdoHelyzetLetrehoz(JButton[] harcosTer) {
        kepekkeAlakitas();
        harcosTer[0].setIcon((ImageIcon) kepek[2]);
        harcosTer[1].setIcon((ImageIcon) kepek[0]);
        harcosTer[2].setIcon((ImageIcon) kepek[1]);
    }

    private void egyKor() {
        Random rnd = new Random();
        int varazsloLepes = rnd.nextInt(harcosTerek.length);
        int harcosLepes = rnd.nextInt(harcosTerek.length);
        karakterMozgatas(varazsloLepes, harcosLepes);
        sebzesVanE(varazsloLepes, harcosLepes);
        korSzamlalo++;
        korSzamlaloMezo.setText("kör: "+Integer.toString(korSzamlalo));
        nyertekE();
        
    }
    private void karakterMozgatas(int varazsloLepes, int harcosLepes) {
        int kozosHely = 0;
        if(varazsloLepes == harcosLepes){
            harcosTerek[kozosHely].setIcon(kepek[0]);
            harcosTerek[varazslo.getHelyzet()].setIcon(kepek[0]);
            harcosTerek[harcos.getHelyzet()].setIcon(kepek[0]);
            harcosTerek[varazsloLepes].setIcon(kepek[3]);
            kozosHely = varazsloLepes;
        }else{
            harcosTerek[kozosHely].setIcon(kepek[0]);
            harcosTerek[varazslo.getHelyzet()].setIcon(kepek[0]);
            harcosTerek[harcos.getHelyzet()].setIcon(kepek[0]);
            varazslo.setHelyzet(varazsloLepes);
            harcos.setHelyzet(harcosLepes);
            harcosTerek[varazsloLepes].setIcon(kepek[2]);
            harcosTerek[harcosLepes].setIcon(kepek[1]);     
        }
    }
    private void nyertekE() {
        if(varazslo.getELETERO()==0 && harcos.getELETERO()==0){
            int ablak = new JOptionPane().showConfirmDialog(null, "A harc döntetlen lett!");
        }else if(varazslo.getELETERO()==0){
            int ablak = new JOptionPane().showConfirmDialog(null, "A harcos nyert!");
        }else if(harcos.getELETERO()==0){
            int ablak = new JOptionPane().showConfirmDialog(null, "A varázsló nyert!");
        }
    }

    private void sebzesVanE(int varazsloLepes, int harcosLepes) {
        if (varazsloLepes == harcosLepes) {
            eletEroLevonas(varazslo, harcos.getTamadoEro());
            eletEroLevonas(harcos, varazslo.getTamadoEro());
        }else if(harcosLepes+1 == varazsloLepes || harcosLepes-1 == varazsloLepes){
            eletEroLevonas(harcos, varazslo.getTamadoEro());
        }

    }

    private void eletEroLevonas(Karakter karakter, int mennyit) {
        karakter.setELETERO(karakter.getELETERO() - mennyit);
        vizualisEletEroValtas(karakter);
    }

    private void vizualisEletEroValtas(Karakter karakter) {
        for (int i = karakter.getELETERO(); i < karakter.getEredetiEletEro(); i++) {
            if (karakter.getTipus().equals("Varázsló")) {
                varazsloElete[i].setBackground(Color.red);
            } else {
                harcosElete[i].setBackground(Color.red);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hacosElet1;
    private javax.swing.JButton harcosElet2;
    private javax.swing.JButton harcosElet3;
    private javax.swing.JButton harcosElet4;
    private javax.swing.JPanel harcosEletEro;
    private javax.swing.JPanel harcosTer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jatekIranyitasTer;
    private javax.swing.JTextField korSzamlaloMezo;
    private javax.swing.JButton kovetkezoKorGomb;
    private javax.swing.JButton mezo1;
    private javax.swing.JButton mezo2;
    private javax.swing.JButton mezo3;
    private javax.swing.JButton ujJatekGomb;
    private javax.swing.JButton varazsloElet1;
    private javax.swing.JButton varazsloElet2;
    private javax.swing.JButton varazsloElet3;
    private javax.swing.JButton varazsloElet4;
    private javax.swing.JPanel varazsloEletEro;
    // End of variables declaration//GEN-END:variables

    

    

}
