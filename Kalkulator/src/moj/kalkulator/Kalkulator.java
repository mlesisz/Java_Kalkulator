package moj.kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import java.util.Vector;

public class Kalkulator  extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton kropka;
    private JButton siedem;
    private JButton jeden;
    private JButton cztery;
    private JButton mnozenie;
    private JButton prawy_nawias;
    private JButton dzielenie;
    private JButton osiem;
    private JButton piec;
    private JButton dwa;
    private JButton zero;
    private JButton lewy_nawias;
    private JButton sqr;
    private JButton odejmowanie;
    private JButton dziewiec;
    private JButton szeisc;
    private JButton trzy;
    private JButton C;
    private JButton dodawanie;
    private JButton Del;
    private JButton CE;
    private JButton procent;
    private JButton rowna_sie;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton tanHButton;
    private JButton logButton;
    private JButton piButton;
    private JButton xButton;
    private JButton expButton;
    private JButton modButton;
    private JButton radButton;
    private JButton degButton;
    private JTextField textField3;
    private JButton Plik;

    public Kalkulator(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        add(panel1);
        setTitle("Kalkulator");
        setMinimumSize(new Dimension(520,650));
        setMinimumSize(new Dimension(100,150));
        setPreferredSize(new Dimension(500, 510));
        setResizable(false);
        //setSize(520,650);
        panel1.setBackground(new java.awt.Color(162, 184, 255));
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panel1.setPreferredSize(new java.awt.Dimension(520, 650));

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeroActionPerformed(e);
            }
        });
        trzy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trzyActionPerformed();
            }
        });
        jeden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jedenActionPerformed();
            }
        });
        dwa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dwaActionPerformed();
            }
        });
        cztery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                czteryActionPerformed();
            }
        });
        piec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                piecActionPerformed();
            }
        });
        szeisc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sziscActionPerformed();
            }
        });
        siedem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siedemActionPerformed();
            }
        });
        osiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                osiemActionPerformed();
            }
        });
        dziewiec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dziewiecActionPerformed();
            }
        });
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cActionPerformed();
            }
        });
        kropka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kropkaActionPerformed();
            }
        });
        lewy_nawias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lewy_nawiasActionPerformed();
            }
        });
        prawy_nawias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prawy_nawiasActionPerformed();
            }
        });
        mnozenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnozenieActionPerformed();
            }
        });
        dzielenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dzielenieActionPerformed();
            }
        });
        odejmowanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                odejmowanieActionPerformed();
            }
        });
        dodawanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodawanieActionPerformed();
            }
        });
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sqrtActionPerformed();
            }
        });
        radButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radActionPerformed();
            }
        });
        degButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                degActionPerformed();
            }
        });
        procent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procentActionPerformed();
            }
        });
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CEActionPerformed();
            }
        });
        Del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delActionPerformed();
            }
        });
        piButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                piActionPerformed();
            }
        });
        tanHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tanhActionPerformed();
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cosActionPerformed();
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sinActionPerformed();
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tanActionPerformed();
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                potegaActionPerformed();
            }
        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modActionPerformed();
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logActionPerformed();
            }
        });
        expButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expActionPerformed();
            }
        });
        rowna_sie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowna_sieActionPerformed();
            }
        });
        Plik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PlikActionPerformed();
                    String tekst=textField1.getText();
                    textField1.setText(tekst+" Zrobione.");
                } catch (IOException e1) {
                    textField1.setText("Błąd odczytu/zapsiu pliku.");
                }
            }
        });
    }
    private void zeroActionPerformed(java.awt.event.ActionEvent evt)
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("0");
            //textField2.setText("0");
        }
        else
        {
            textField1.setText(tekst + "0");
        }
    }
    private void trzyActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("3");
            //textField2.setText("0");
        }
        else
        {
            textField1.setText(tekst + "3");
        }
    }
    private void jedenActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("1");
        }
        else
        {
            textField1.setText(tekst + "1");
        }
    }
    private void dwaActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("2");
        }
        else
        {
            textField1.setText(tekst + "2");
        }
    }
    private void czteryActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("4");
        }
        else
        {
            textField1.setText(tekst + "4");
        }
    }
    private void piecActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("5");
        }
        else
        {
            textField1.setText(tekst + "5");
        }
    }
    private void sziscActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("6");
        }
        else
        {
            textField1.setText(tekst + "6");
        }
    }
    private void siedemActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("7");
        }
        else
        {
            textField1.setText(tekst + "7");
        }
    }
    private void osiemActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("8");
        }
        else
        {
            textField1.setText(tekst + "8");
        }
    }
    private void dziewiecActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("9");
        }
        else
        {
            textField1.setText(tekst + "9");
        }
    }
    private void cActionPerformed(){
        textField1.setText("0");
    }
    private void CEActionPerformed(){
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("");
        }else if(tekst.equals("0")){
            textField1.setText("0");
        }else{
            int rozmiar =tekst.length();
            char a;
            int i;
            for(i=rozmiar-1;i>=0;i--){
                a=tekst.charAt(i);
                if(!(a>47 && a<58 || a=='.')){
                    break;
                }
            }
            textField1.setText(tekst.substring(0,i+1));
        }
    }
    private void kropkaActionPerformed(){
            String tekst = textField1.getText();
            textField1.setText(tekst + ".");
    }
    private void lewy_nawiasActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("(");
        }
        else
        {
            textField1.setText(tekst+"(");
        }
    }
    private void prawy_nawiasActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText(")");
        }
        else
        {
            textField1.setText(tekst+")");
        }
    }
    private void mnozenieActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0*");
        }else if (tekst.equals("0"))
        {
            textField1.setText("0*");
        }
        else
        {
            textField1.setText(tekst+"*");
        }
    }
    private void dzielenieActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0/");
        }else if (tekst.equals("0"))
        {
            textField1.setText("0/");
        }
        else
        {
            textField1.setText(tekst+"/");
        }
    }
    private void odejmowanieActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0-");
        }else if (tekst.equals("0"))
        {
            textField1.setText("0-");
        }
        else
        {
            textField1.setText(tekst+"-");
        }
    }
    private void dodawanieActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0+");
        }else if (tekst.equals("0"))
        {
            textField1.setText("0+");
        }
        else
        {
            textField1.setText(tekst+"+");
        }
    }
    private void sqrtActionPerformed()
    {
        String tekst = textField1.getText();
        if (tekst.equals("0"))
        {
            textField1.setText("sqrt(");
        }
        else
        {
            textField1.setText(tekst+"sqrt(");
        }
    }
    private void radActionPerformed()
    {
        textField3.setText("Rad");
    }
    private void degActionPerformed()
    {
        textField3.setText("Deg");
    }
    private void procentActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("0");
        }
        else
        {
            textField1.setText(tekst+"%");
        }
    }
    private void delActionPerformed()
    {
        String tekst = textField1.getText();
        if(!tekst.isEmpty())
        textField1.setText(tekst.substring(0, tekst.length() - 1));
    }
    private void piActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("PI");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("PI");
        }
        else
        {
            textField1.setText(tekst+"PI");
        }
    }
    private void tanhActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("tanh(");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("tanh(");
        }
        else
        {
            textField1.setText(tekst+"tanh(");
        }
    }
    private void cosActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("cos(");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("cos(");
        }
        else
        {
            textField1.setText(tekst+"cos(");
        }
    }
    private void sinActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("sin(");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("sin(");
        }
        else
        {
            textField1.setText(tekst+"sin(");
        }
    }
    private void tanActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("tan(");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("tan(");
        }
        else
        {
            textField1.setText(tekst+"tan(");
        }
    }
    private void potegaActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0^");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("0^");
        }
        else
        {
            textField1.setText(tekst+"^");
        }
    }
    private void modActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("0mod");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("0mod");
        }
        else
        {
            textField1.setText(tekst+"mod");
        }
    }
    private void logActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("log(");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("log(");
        }
        else
        {
            textField1.setText(tekst+"log(");
        }
    }
    private void expActionPerformed()
    {
        String tekst = textField1.getText();
        if(tekst.isEmpty()){
            textField1.setText("exp(");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("exp(");
        }
        else
        {
            textField1.setText(tekst+"exp(");
        }
    }
    private void rowna_sieActionPerformed()
    {
        String tekst = textField1.getText();
        String tekst1= textField3.getText();
        if(tekst.isEmpty()){
            textField1.setText("");
        }
        else if (tekst.equals("0"))
        {
            textField1.setText("0");
        }
        else
        {
            Liczenie a= new Liczenie();

            textField1.setText(tekst+"="+a.Liczenie(tekst,tekst1));
        }
    }
    private void PlikActionPerformed()throws IOException
    {
        String tekst = textField1.getText();
        String tekst1= textField3.getText();
        LinkedList<String> zbiór_linii=new LinkedList<>();
        BufferedReader plik1 = new BufferedReader(new FileReader(tekst));
        String linia=plik1.readLine();
        while(linia != null){
            zbiór_linii.add(linia);
            linia=plik1.readLine();
        }
        plik1.close();
        Liczenie a= new Liczenie();
        PrintWriter plik2= new PrintWriter(new FileWriter(tekst));
        for(int i=0;i<zbiór_linii.size();i++){
            linia=a.Liczenie(zbiór_linii.get(i),tekst1);
           plik2.println(zbiór_linii.get(i)+"="+linia);
        }
        plik2.close();
    }


}
