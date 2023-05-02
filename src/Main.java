import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        String inp;
//        String title = "Расшифровка бинарного кода ";
//        inp=JOptionPane.showInputDialog(null,"Введите бинарный код",title,JOptionPane.QUESTION_MESSAGE);
//        if (inp==null){
//            System.exit(0);
//        }
//        int num = UsingWhile.decoder(inp);
//        String text = " Вы ввели бинарный код = " + inp;
//        text+="\n Код соответствует числу: "+ num;
//        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);

       String input;
       ImageIcon img;
      String file="C:/pictures/";

       String title1 = "Введите год своего рождения ";
       String title2 = "Введите какой сегодня год  ";
       String massege1 = "Контент 18+ вам доступен ";
       String massege2 = "Контент 18+ вам  не доступен";

       input = JOptionPane.showInputDialog(null,"Дата",title1,JOptionPane.QUESTION_MESSAGE);
       if (input==null){
           System.exit(0);
       }
       int a = Integer.parseInt(input);



        System.out.println(a);
        input = JOptionPane.showInputDialog(null,"Дата",title2,JOptionPane.QUESTION_MESSAGE);
        if (input==null){
            System.exit(0);
        }
        int b = Integer.parseInt(input);
        System.out.println(b);
        int sum = b - a ;
        String title3 = "Вам " + sum;
        if(sum >= 18){
            JOptionPane.showMessageDialog(null,title3,massege1,JOptionPane.INFORMATION_MESSAGE);
            file+="black.jpg";
            img= new ImageIcon(file);

            String title5 = ";)";
            JOptionPane.showMessageDialog(null,img,title5,JOptionPane.PLAIN_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,title3,massege2,JOptionPane.INFORMATION_MESSAGE);
        }
















    }
}