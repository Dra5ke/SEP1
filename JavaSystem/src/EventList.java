import java.util.ArrayList;

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

   public Event[] getEvent(Date startDate, Date endDate)
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
            Lecture other = new Lecture();
            other = (Lecture) events.get(i);

            if (other.getSubject() == subject)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Seminar)
         {
            Seminar other = new Seminar();
            other = (Seminar) events.get(i);

            int j = 0;
            int size = 0;
            while (other.getSubjects()[j] != null)
            {
               size++;
               j++;
            }
            for (j = 0; j < size && other.getSubjects()[j] != subject; j++);
            if (j <= size)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Workshop)
         {
            Workshop other = new Workshop();
            other = (Workshop) events.get(i);

            int j = 0;
            int size = 0;
            while (other.getSubjects()[j] != null)
            {
               size++;
               j++;
            }
            for (j = 0; j < size && other.getSubjects()[j] != subject; j++);
            if (j <= size)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
      }

      return eventsArray;
   }

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

   public Event[] getEventByAvailableTickets(int minAvailableTickets)
   {
      Event eventsArray[];
      eventsArray = new Event[events.size()];
      int i;
      int counter = 0;

      for (i = 0; i < events.size(); i++)
      {
         if (events.get(i).getAvailableTickets() >= minAvailableTickets)
            eventsArray[counter] = events.get(i);
         counter++;
      }

      return eventsArray;
   }

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
            Lecture other = new Lecture();
            other = (Lecture) events.get(i);
            if (other.getLecturer().equals(lecturer))
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Seminar)
         {
            Seminar other = new Seminar();
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
            Workshop other = new Workshop();
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
            Lecture other = new Lecture();
            other = (Lecture) events.get(i);

            if (other.getSponsorName() == sponsorName)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Seminar)
         {
            Seminar other = new Seminar();
            other = (Seminar) events.get(i);

            if (other.getSponsorName() == sponsorName)
            {
               eventsArray[counter] = events.get(i);
               counter++;
            }
         }
         else if (events.get(i) instanceof Workshop)
         {
            Workshop other = new Workshop();
            other = (Workshop) events.get(i);

            if (other.getSponsorName() == sponsorName)
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
