package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Traffic_light svetofor =new Traffic_light();
        Scanner in = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
      while(true)
      {
         System.out.println("Введите одну из следующих команд: Y(движение к зеленому),"+ newLine +"B(движение к красному), Work(переход в режим мигающего желтого или выход из него), либо off(завершает программу)");
         String key = in.next();
         if (key.equals("Y")) svetofor.Y();
         else
             {
                 if (key.equals("B")) svetofor.B();
                 else {
                     if (key.equals("Work")) svetofor.Work();
                     else
                     {
                         if (key.equals("off")) break;
                         else
                             System.out.println("Такой команды нет. Введите команду еще раз");
                     }
                 }
         }
      }
    }
}
