import java.sql.Time;

public class practice {
    public static void main(String[] args)
    {
        String time = "12:00:00AM";
        String [] newstr = time.split(":");
        String newstr2="";
        for(int i=0;i<newstr.length;i++){
            newstr2 = newstr2.concat(newstr[i]);
        }
        System.out.println(newstr2); 

        String finalTime = newstr2.replace("AM","");
        //System.out.println(finalTime);

        int TimeInInt = Integer.parseInt(finalTime);
        //System.out.println("Time in integer: "+TimeInInt);     
        //System.out.println("Added 12 hours to time: "+addTime);
        String strTypecast = ""+ TimeInInt;
        System.out.println(strTypecast);        
    }
    
}
