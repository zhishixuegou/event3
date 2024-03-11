import java.text.ParseException;
import java.util.ArrayList;  
  
public class Main {    
    public static void main(String[] args) {    
      
        
        ArrayList<Attendees> attendeesList = new ArrayList<>();

        
        attendeesList.add(new Attendees(""));
        attendeesList.add(new Attendees(""));
        attendeesList.add(new Attendees(""));

        
        for (Attendees attendee : attendeesList) {
            System.out.println(attendee);
        }
    

        

         Event event = new Event();    
  
        try {    
            event.organizeEvent();    
        } catch (ParseException e) {    
            System.out.println("Error parsing event date. Please enter a valid date in the format yyyy-MM-dd.");    
            e.printStackTrace();    
        }    
    }    
}