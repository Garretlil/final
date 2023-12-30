import java.util.Scanner;
import ForModel.Model;
import java.io.*;
import ForModel.dataScanner;
import ForModel.*;


public class Main{
     private static String get(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a title of group: ");
        String title = input.next();
        return title;

    }
    public static void main (String args[]){
        //ввод номера группы
        String title="A-19-22";
        //получение данных с текстового файла

         dataScanner data_=new dataScanner(title);
         data_.Show();
//       data_.group.Show();
         //dataScanner.getSQL(title);

    }
}