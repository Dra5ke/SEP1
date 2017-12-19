import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * A class used to store all the events in an ArrayList
 * 
 * @author Stefan Harabagiu
*/

public class EventList
{
   private ArrayList<Event> events;

   public EventList()
   {
      events = new ArrayList<Event>();
   }

   public void addEvent(Event event)
   {
      events.add(event);
   }
   
   /**
    * Method used to search for a specific event using the id as a parameter
    * 
    * @see UID 
    * 
   */
   public Event getEventById(int id)
   {
      Event event = new Event();
     
      for(int i = 0; i < events.size(); i++)
      {
         if(events.get(i).getId() == id)
         {
            event = events.get(i);
         }
      }
      return event;
   }

   /**
    * Method used to remove the event from the list
    * @param event
    */
   public void removeEvent(Event event)
   {
      events.remove(event);
      event.getFile().delete();
   }
   
   public ArrayList<Seminar> getAllSeminars()
   {
     ArrayList<Seminar> seminars = new ArrayList<Seminar>();
      for (int i=0;i<events.size();i++)
         if (events.get(i) instanceof Seminar)
         {
            seminars.add((Seminar) events.get(i));
         }
      return seminars;
   }
   
   public ArrayList<Trip> getAllTrips()
   {
     ArrayList<Trip> trips = new ArrayList<Trip>();
      for (int i=0;i<events.size();i++)
         if (events.get(i) instanceof Trip)
         {
            trips.add((Trip) events.get(i));
         }
      return trips;
   }
   
   public ArrayList<Workshop> getAllWorkshops()
   {
     ArrayList<Workshop> workshops = new ArrayList<Workshop>();
      for (int i=0;i<events.size();i++)
         if (events.get(i) instanceof Workshop)
         {
            workshops.add((Workshop) events.get(i));
         }
      return workshops;
   }
   
   public ArrayList<Lecture> getAllLectures()
   {
     ArrayList<Lecture> lectures = new ArrayList<Lecture>();
      for (int i=0;i<events.size();i++)
         if (events.get(i) instanceof Lecture)
         {
            lectures.add((Lecture) events.get(i));
         }
      return lectures;
   }

   public ArrayList<Event> getAllEvents()
   {
      return events;
   }
   
   /**
    * Method used for searching events by title
    * 
    * @return an array of events that match the parameter. If there are no events that match
    *          the parameter an empty array will be returned
   */ 
   public Event[] getEventByTitle(String title)
   {
      Event[] events = new Event[this.getAllEvents().size()];
      int i;
      int k = 0;
      for (i = 0; i < this.getAllEvents().size(); i++)
      {
         if (this.getAllEvents().get(i).getTitle().equals(title)) 
         {
            events[k] = this.getAllEvents().get(i);
            k++;
         }
      }

      return events;
   }
   
   /**
    * Method used to search events by the finalization status
    * 
    * @return an array of events that match the parameter. If there are no events that match
    *          the parameter an empty array will be returned
    */
   public Event[] getEvent(boolean finalized)
   {
      Event finalizedEvents[];
      finalizedEvents = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i).isFinalized() == finalized)
            finalizedEvents[counter] = events.get(i);
         counter++;
      }

      return finalizedEvents;
   }

   /**
    * Method used to search events by start date
    * 
    * @param startDate
    *          A date type object that will be used for comparing
    *          @see Date#isLarger(Date date)
    * 
    * @return an array of events that have a larger start date than the one provided as parameter.
    *         If there are no events that match the requirement an empty array will be returned
    */
   public Event[] getEvent(Date startDate)
   {
      Event eventsArray[];
      eventsArray = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i).getStartDate().isLarger(startDate))
            eventsArray[counter] = events.get(i);
         counter++;
      }

      return eventsArray;
   }

   /**
    * Method used to search events by subject
    * 
    * @return an array of events that match the parameter. If there are no events that match
    *          the parameter an empty array will be returned
    */
   public Event[] getEvent(String subject)
   {
      Event eventsArray[];
      eventsArray = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i) instanceof Lecture)
         {
            Lecture other = new Lecture(2);
            other = (Lecture) events.get(i);

            if (other.getSubject().equals(subject))
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Seminar)
         {
            Seminar other = new Seminar(2);
            other = (Seminar) events.get(i);

            int j = 0;
            for (j = 0; j < other.getSubjects().length && !(other.getSubjects()[j].equals(subject)); j++);
            if (j < other.getSubjects().length)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Workshop)
         {
            Workshop other = new Workshop(1);
            other = (Workshop) events.get(i);

            int j = 0;
           /* while (other.getSubjects()[j] != null)
            {
               size++;
               j++;
            }*/
            for (j = 0; j < other.getSubjects().length && !(other.getSubjects()[j].equals(subject)); j++);
            if (j < other.getSubjects().length)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
      }

      return eventsArray;
   }
   
   /**
    * Method used to search events by price
    * 
    * @return an array of events that match the parameter. If there are no events that match
    *          the parameter an empty array will be returned
    */
   public Event[] getEvent(int price)
   {
      Event eventsArray[];
      eventsArray = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i).getPrice() == price)
            eventsArray[counter] = events.get(i);
         counter++;
      }

      return eventsArray;
   }

   /**
    * Method used to search events by lecturer
    * 
    * @param lecturer
    *          A lecturer type object that will be compared with the lecturer attribute of
    *          every event
    *          @see Lecturer#equals(Object object)
    *          
    * @return an array of events that match the parameter. If there are no events that match
    *          the parameter an empty array will be returned
    */
   public Event[] getEvent(Lecturer lecturer)
   {
      Event eventsArray[];
      eventsArray = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i) instanceof Lecture)
         {
            Lecture other = new Lecture(1);
            other = (Lecture) events.get(i);
            if (other.getLecturer().equals(lecturer))
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Seminar)
         {
            Seminar other = new Seminar(2);
            other = (Seminar) events.get(i);

            int j;
            for (j = 0; j < other.getLecturers().getAllLecturers().size()
                  && !(other.getLecturers().getAllLecturers().get(j)
                        .equals(lecturer)); j++)
               ;
            if (j <= other.getLecturers().getAllLecturers().size())
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Workshop)
         {
            Workshop other = new Workshop(2);
            other = (Workshop) events.get(i);

            int j;
            for (j = 0; j < other.getLecturers().getAllLecturers().size()
                  && !(other.getLecturers().getAllLecturers().get(j)
                        .equals(lecturer)); j++)
               ;
            if (j <= other.getLecturers().getAllLecturers().size())
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
      }

      return eventsArray;
   }

   /**
    * Method used to search events by sponsor name
    * 
    * @return an array of events that match the parameter. If there are no events that match
    *          the parameter an empty array will be returned
    */
   public Event[] getEventBySponsor(String sponsorName)
   {
      Event eventsArray[];
      eventsArray = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i) instanceof Lecture)
         {
            Lecture other = new Lecture(1);
            other = (Lecture) events.get(i);

            if (other.getSponsorName().equals(sponsorName))
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Seminar)
         {
            Seminar other = new Seminar(1);
            other = (Seminar) events.get(i);

            if (other.getSponsorName().equals(sponsorName))
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Workshop)
         {
            Workshop other = new Workshop(1);
            other = (Workshop) events.get(i);

            if (other.getSponsorName().equals(sponsorName))
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
      }

      return eventsArray;
   }

   public String toString()
   {
      String list = "";

      for (int i = 0; i < events.size(); i++)
      {
         list = list + events.get(i).toString() + "\n" + "\n";
      }

      return list;
   }
}
