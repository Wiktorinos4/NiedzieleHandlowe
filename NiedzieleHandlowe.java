import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.time.LocalDate;
import java.lang.Integer;

public class NiedzieleHandlowe extends JFrame implements ActionListener
{
    public static void main(String[] args)
    {
        NiedzieleHandlowe niedzieleHandlowe = new NiedzieleHandlowe();
    }

    int day;
    int month;
    int year;
    LocalDate date = LocalDate.now();
    JFrame NiedzieleHandlowe = new JFrame("Niedziele Handlowe");
    JPanel NiedzieleHandloweComponents = new JPanel();
    JLabel welcomeLabel = new JLabel("Witaj!");
    JLabel welcome2Label = new JLabel("W tym programie dowiesz się czy podana data");
    JLabel welcome3Label = new JLabel("jest niedzielą handlową");
    JLabel welcome4Label = new JLabel("Podaj datę, którą chcesz sprawdzić");
    JLabel dateLabel = new JLabel();
    JLabel pfdLabel = new JLabel("Poprawny format daty");
    JLabel ndLabel = new JLabel("Dane nie są dostępne");
    JLabel hLabel = new JLabel("Niedziela jest handlowa");
    JLabel nhLabel = new JLabel("Niedziela nie jest handlowa");
    JLabel dnjndLabel = new JLabel("Ten dzień nie jest Niedzielą");
    JLabel yearQuestionLabel = new JLabel("Rok");
    JLabel monthQuestionLabel = new JLabel("Miesiąc");
    JLabel dayQuestionLabel = new JLabel("Dzień");
    JLabel signLabel = new JLabel("Dziękuję za skorzystanie z mojego programu");
    JLabel sign2Label = new JLabel("Created by Wiktor Toporowski");
    JTextField yearAnswerField = new JTextField();
    JTextField monthAnswerField = new JTextField();
    JTextField dayAnswerField = new JTextField();
    JButton acceptButton = new JButton("Potwierdź");
    JButton resetButton = new JButton("Reset");
    JButton quitButton = new JButton("Wyjście");

    NiedzieleHandlowe()
    {
        welcomeLabel.setBounds(175,10,100,25);
        welcome2Label.setBounds(50,25,400,25);
        welcome3Label.setBounds(120,40,400,25);
        welcome4Label.setBounds(85,55,250,25);

        dateLabel.setBounds(100,90,250,25);
        dateLabel.setText("Dzisiejsza data to " + String.valueOf(date));

        yearQuestionLabel.setBounds(135,225,100,25);
        yearAnswerField.setBounds(185,225,50,25);
        
        monthQuestionLabel.setBounds(135,175,100,25);
        monthAnswerField.setBounds(185,175,50,25);
        
        dayQuestionLabel.setBounds(135,125,100,25);
        dayAnswerField.setBounds(185,125,50,25);

        hLabel.setBounds(100,265,250,25);
        hLabel.setFont(new Font("Default", Font.BOLD, 14));
        
        nhLabel.setBounds(90,265,250,25);
        nhLabel.setFont(new Font("Default", Font.BOLD, 14));

        ndLabel.setBounds(115,258,250,25);
        ndLabel.setFont(new Font("Default", Font.BOLD, 14));

        dnjndLabel.setBounds(95,265,250,25);
        dnjndLabel.setFont(new Font("Default", Font.BOLD, 14));

        pfdLabel.setBounds(115,250,250,25);
        signLabel.setBounds(50,280,400,25);
        sign2Label.setBounds(100,295,250,25);
        
        acceptButton.setBounds(50,325,100,25);
        acceptButton.setFocusable(false);
        acceptButton.addActionListener(this);

        resetButton.setBounds(150,325,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        quitButton.setBounds(250,325,100,25);
        quitButton.setFocusable(false);
        quitButton.addActionListener(this);

        NiedzieleHandlowe.setVisible(true);
        NiedzieleHandlowe.setResizable(false);
        NiedzieleHandlowe.setLocationRelativeTo(null);
        NiedzieleHandlowe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NiedzieleHandlowe.setLayout(null);
        NiedzieleHandlowe.setSize(400,400);
        NiedzieleHandlowe.add(welcomeLabel);
        NiedzieleHandlowe.add(welcome2Label);
        NiedzieleHandlowe.add(welcome3Label);
        NiedzieleHandlowe.add(welcome4Label);
        NiedzieleHandlowe.add(dateLabel);
        NiedzieleHandlowe.add(ndLabel);
        NiedzieleHandlowe.add(pfdLabel);
        NiedzieleHandlowe.add(hLabel);
        NiedzieleHandlowe.add(nhLabel);
        NiedzieleHandlowe.add(dnjndLabel);
        NiedzieleHandlowe.add(yearQuestionLabel);
        NiedzieleHandlowe.add(monthQuestionLabel);
        NiedzieleHandlowe.add(dayQuestionLabel);
        NiedzieleHandlowe.add(signLabel);
        NiedzieleHandlowe.add(sign2Label);
        NiedzieleHandlowe.add(yearAnswerField);
        NiedzieleHandlowe.add(monthAnswerField);
        NiedzieleHandlowe.add(dayAnswerField);
        NiedzieleHandlowe.add(acceptButton);
        NiedzieleHandlowe.add(resetButton);
        NiedzieleHandlowe.add(quitButton);
        ndLabel.setVisible(false);
        pfdLabel.setVisible(false);
        hLabel.setVisible(false);
        nhLabel.setVisible(false);
        dnjndLabel.setVisible(false);
        signLabel.setVisible(false);
        sign2Label.setVisible(false);
    }

    public void sign()
    {
        signLabel.setVisible(true);
        sign2Label.setVisible(true);
    }

    public void main()
    {
        year = Integer.parseInt(yearAnswerField.getText());
        month = Integer.parseInt(monthAnswerField.getText());
        day = Integer.parseInt(dayAnswerField.getText());

        if(year < 2021)
        {
            ndLabel.setVisible(true);
            sign();
        }
        else if(year == 2021 || year == 2022)
        {
            if(month == 2)
            {
                if(day >= 1 && day <= 28)
                {
                    pfdLabel.setVisible(true);
                    check();
                }
                else
                {
                    ndLabel.setVisible(true);
                }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11)
            {
                if(day >= 1 && day <= 30)
                {
                    pfdLabel.setVisible(true);
                    check();
                }
                else
                {
                    ndLabel.setVisible(true);
                }
            }
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                if(day >= 1 && day <= 31)
                {
                    pfdLabel.setVisible(true);
                    check();
                }
                else
                {
                    ndLabel.setVisible(true);
                }
            }
            else
            {
                ndLabel.setVisible(true);
            }
        }
        else if(year > 2022)
        {
            ndLabel.setVisible(true);
            sign();
        }
    }

    public void check()
    {
        if(year < 2021)
        {
            ndLabel.setVisible(true);
            sign();
        }
        else if(day == 3 && month == 1 && year == 2021 || day == 10 && month == 1 && year == 2021 || day == 17 && month == 1 && year == 2021 || day == 24 && month == 1 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 31 && month == 1 && year == 2021)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 7 && month == 2 && year == 2021 || day == 14 && month == 2 && year == 2021 || day == 21 && month == 2 && year == 2021 || day == 28 && month == 2 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 7 && month == 3 && year == 2021 || day == 14 && month == 3 && year == 2021 || day == 21 && month == 3 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 28 && month == 3 && year == 2021)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 4 && month == 4 && year == 2021 || day == 11 && month == 4 && year == 2021 || day == 18 && month == 4 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 25 && month == 4 && year == 2021)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 2 && month == 5 && year == 2021 || day == 9 && month == 5 && year == 2021 || day == 16 && month == 5 && year == 2021 || day == 23 && month == 5 && year == 2021 ||   day == 30 && month == 5 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 6 && month == 6 && year == 2021 || day == 13 && month == 6 && year == 2021 || day == 20 && month == 6 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 27 && month == 6 && year == 2021)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 4 && month == 7 && year == 2021 || day == 11 && month == 7 && year == 2021 || day == 25 && month == 7 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 1 && month == 8 && year == 2021 || day == 8 && month == 8 && year == 2021 || day == 15 && month == 8 && year == 2021 || day == 22 && month == 8 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 29 && month == 8 && year == 2021)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 5 && month == 9 && year == 2021 || day == 12 && month == 9 && year == 2021 || day == 19 && month == 9 && year == 2021 || day == 26 && month == 9 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 3 && month == 10 && year == 2021 || day == 10 && month == 10 && year == 2021 || day == 17 && month == 10 && year == 2021 || day == 24 && month == 10 && year ==  2021 || day == 31 && month == 10 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 7 && month == 11 && year == 2021 || day == 14 && month == 11 && year == 2021 || day == 21 && month == 11 && year == 2021 || day == 28 && month == 11 && year ==  2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 5 && month == 12 && year == 2021 || day == 26 && month == 12 && year == 2021)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 12 && month == 12 && year == 2021 || day == 19 && month == 12 && year == 2021)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 2 && month == 1 && year == 2022 || day == 9 && month == 1 && year == 2022 || day == 16 && month == 1 && year == 2022 || day == 23 && month == 1 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 30 && month == 1 && year == 2022)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 6 && month == 2 && year == 2022 || day == 13 && month == 2 && year == 2022 || day == 20 && month == 2 && year == 2022 || day == 27 && month == 2 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 6 && month == 3 && year == 2022 || day == 13 && month == 3 && year == 2022 || day == 20 && month == 3 && year == 2022 || day == 27 && month == 3 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 3 && month == 4 && year == 2022 || day == 17 && month == 4 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 10 && month == 4 && year == 2022)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 24 && month == 4 && year == 2022)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 1 && month == 5 && year == 2022 || day == 8 && month == 5 && year == 2022 || day == 15 && month == 5 && year == 2022 || day == 22 && month == 5 && year == 2022 ||   day == 29 && month == 5 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 5 && month == 6 && year == 2022 || day == 12 && month == 6 && year == 2022 || day == 19 && month == 6 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 26 && month == 6 && year == 2022)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 3 && month == 7 && year == 2022 || day == 10 && month == 7 && year == 2022 || day == 17 && month == 7 && year == 2022 || day == 24 && month == 7 && year == 2022 || day == 31 && month == 7 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 7 && month == 8 && year == 2022 || day == 14 && month == 8 && year == 2022 || day == 21 && month == 8 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 28 && month == 8 && year == 2022)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(day == 4 && month == 9 && year == 2022 || day == 11 && month == 9 && year == 2022 || day == 18 && month == 9 && year == 2022 || day == 25 && month == 9 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 2 && month == 10 && year == 2022 || day == 9 && month == 10 && year == 2022 || day == 16 && month == 10 && year == 2022 || day == 23 && month == 10 && year ==   2022 || day == 30 && month == 10 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 6 && month == 11 && year == 2022 || day == 13 && month == 11 && year == 2022 || day == 20 && month == 11 && year == 2022 || day == 27 && month == 11 && year ==  2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 4 && month == 12 && year == 2022 || day == 25 && month == 12 && year == 2022)
        {
            nhLabel.setVisible(true);
            sign();
        }
        else if(day == 11 && month == 12 && year == 2022 || day == 18 && month == 12 && year == 2022)
        {
            hLabel.setVisible(true);
            sign();
        }
        else if(year > 2022)
        {
            ndLabel.setVisible(true);
            sign();
        }
        else
        {
            dnjndLabel.setVisible(true);
            sign();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==acceptButton)
        {
            main();
        }
        if(e.getSource()==resetButton)
        {
            yearAnswerField.setText("");
            monthAnswerField.setText("");
            dayAnswerField.setText("");
            ndLabel.setVisible(false);
            pfdLabel.setVisible(false);
            hLabel.setVisible(false);
            nhLabel.setVisible(false);
            dnjndLabel.setVisible(false);
            signLabel.setVisible(false);
            sign2Label.setVisible(false);
        }
        if(e.getSource()==quitButton)
        {
            System.exit(0);
        }
    }
}



/*

Niedziele Handlowe 2021
31.01.2021 = Jan 31 2021
28.03.2021 = Mar 28 2021
25.04.2021 = Apr 25 2021
27.06.2021 = Jun 27 2021
29.08.2021 = Aug 29 2021
12.12.2021 = Dec 12 2021
19.12.2021 = Dec 19 2021

Niedziele Handlowe 2022
30.01.2022 = Jan 30 2022
10.04.2022 = Apr 10 2022
24.04.2022 = Apr 24 2022
26.06.2022 = Jun 26 2022
28.08.2022 = Aug 28 2022
11.12.2022 = Dec 11 2022
18.12.2022 = Dec 18 2022

Format wyświetlanego czasu
Fri Nov 19 00:44:43 2021

*/