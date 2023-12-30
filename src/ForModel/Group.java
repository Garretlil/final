package ForModel;

public class Group {
       public Couple list[];
       String title="";
       Group(String title_, int count_couples){
             title=title_;
             list=new Couple[count_couples];
       }
       public  void Show(){
           System.out.printf("title: %s ", title);
           System.out.print("\n");
           for (int i=0 ;i<this.list.length ;i++){
               System.out.print(Integer.toString(i+1)+": "+this.list[i].namecouple
                      +" ("+this.list[i].professor+")"+"\n");
               System.out.print(this.list[i].cabinet +"\n" + this.list[i].timecouple +"\n");

        }
    }
}

