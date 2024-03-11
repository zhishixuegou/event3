import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.List;  
import java.util.Scanner;  
  
public class Event {  
    private String eventID;  
    private String eventName;  
    private String eventVenue;  
    private Date eventDate;  
    private List<String> eventAttendees;  
  
    public Event() {  
        this.eventAttendees = new ArrayList<>();  
    }  
  
    // Getters and setters  
    public String getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public Date getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(String eventDate) throws ParseException {  
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        this.eventDate = dateFormat.parse(eventDate);  
    }  
  
    public List<String> getEventAttendees() {  
        return eventAttendees;  
    }  
  
    // Other methods  
    public void organizeEvent() throws ParseException {  
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter event ID: ");  
            this.eventID = scanner.nextLine();  
  
            System.out.print("Enter event name: ");  
            this.eventName = scanner.nextLine();  
  
            System.out.print("Enter event venue: ");  
            this.eventVenue = scanner.nextLine();  
  
            System.out.print("Enter event date (yyyy-MM-dd): ");  
            this.setEventDate(scanner.nextLine());  
  
            String input;  
            do {  
                System.out.print("Enter the name of an attendee (or 'done' to finish): ");  
                input = scanner.nextLine();  
  
                if (!input.equalsIgnoreCase("done")) {  
                    eventAttendees.add(input);  
                }  
            } while (!input.equalsIgnoreCase("done"));
        }  
  
        System.out.println("Event organized successfully!");  
        System.out.println("Total number of attendees: " + eventAttendees.size());  
        System.out.println("Event details:");  
        System.out.println("Event ID: " + eventID);  
        System.out.println("Event Name: " + eventName);  
        System.out.println("Event Venue: " + eventVenue);  
        System.out.println("Event Date: " + new SimpleDateFormat("yyyy-MM-dd").format(eventDate));  
        System.out.println("Attendees:");  
        for (String attendee : eventAttendees) {  
            System.out.println(attendee);  
        }  
    }  
  
    @Override  
    public String toString() {  
        return "Event{" +  
                "eventID='" + eventID + '\'' +  
                ", eventName='" + eventName + '\'' +  
                ", eventVenue='" + eventVenue + '\'' +  
                ", eventDate=" + new SimpleDateFormat("yyyy-MM-dd").format(eventDate) +  
                ", eventAttendees=" + eventAttendees +  
                '}';  
    }  
}