package ForModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.io.*;
import ForModel.Group;

public class dataScanner {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "fuck";
    public int countdays;
    public IGetData get;
    //public Couple[] list;
    public Group group_final;
    public int count;


//    void get(BufferedReader reader,Group group,int count) throws java.io.IOException {
//        for (int i=0; i<count;i++) {
//            group.list[i]=new Couple("","","","");
//            //group.list[i].couple_name=reader.readLine();
//            group.list[i].cabinet=reader.readLine();
//            group.list[i].professor=reader.readLine();
//            //group.list[i].time=reader.readLine();
//        }
//    }
    public void Show(){
        System.out.printf("title: %s ",this.group_final.title);
        System.out.print("\n");
        for (int i=0 ;i<this.group_final.list.length ;i++){
            System.out.print(Integer.toString(i+1)+": "+this.group_final.list[i].namecouple
                    +" ("+this.group_final.list[i].professor+")"+"\n");
            System.out.print(this.group_final.list[i].cabinet +"\n" + this.group_final.list[i].timecouple +"\n");

        }
    }

    public dataScanner(String title){
        try {BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ed763\\IdeaProjects\\untitled\\src\\ForModel\\s.txt"));

            //countdays=(Integer.parseInt(reader.readLine()));
            //count = (Integer.parseInt(reader.readLine()));//читать количество пар

            //get(reader, group,count);
            get=new GetFromSQL();
            group_final=get.Get(title);



        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}

