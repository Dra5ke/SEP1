import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * A class which represents every common attribute that the four
 * types of events have { @see Lecture, @see Seminar, @see Workshop or @see Trip}
 * 
 * @author Stefan Harabagiu
 * 
*/
public class Event
{
   protected int id;
   private String title;
   protected Date startDate;
   private Time startTime;
   private int totalTickets;
   private int discount;
   private int price;
   private boolean finalized;
   protected File file;

   public Event()
   {
      new File("events").mkdir();
      id = UID.generateEventId();
   }

   public File getFile()
   {
      return file;
   }

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public String getTitle()
   {
      return title;
   }

   public void setStartDate(Date startDate)
   {
      this.startDate = startDate.copy();
   }

   public Date getStartDate()
   {
      return startDate.copy();
   }

   protected void setStartTime(Time startTime)
   {
      this.startTime = startTime.copy();
   }

   public Time getStartTime()
   {
      return startTime.copy();
   }

   public void setTotalTickets(int totalTickets)
   {
      this.totalTickets = totalTickets;
   }

   public int getTotalTickets()
   {
      return totalTickets;
   }

   public void setDiscount(int discount)
   {
      this.discount = discount;
   }

   public int getDiscount()
   {
      return discount;
   }

   public void setPrice(int price)
   {
      this.price = price;
   }

   public int getPrice()
   {
      return price;
   }

   public void setFinalized(boolean finalized)
   {
      this.finalized = finalized;
   }

   public boolean isFinalized()
   {
      if (finalized)
         return true;
      else
         return false;
   }
   
   /**
    * A method used when displaying all the information of a certain event to the user.
    * 
    * @see Lecture#userToString()
    */
   public String userToString()
   {
      String message = new String();
      if (finalized == true)
         message = "Event title: " + title + "\n" + "Start date: "
               + startDate.toString() + "\n" + "Start time: "
               + startTime.toString() + "\n" + "Total number of tickets: "
               + totalTickets + "\n" + "Price:" + price + "\n"
               + "Discount offered: " + discount + "%";

      return message;
   }

   public String toString()
   {
      return id + System.lineSeparator() + title + System.lineSeparator()
            + startDate.toString() + System.lineSeparator()
            + startTime.toString() + System.lineSeparator() + totalTickets
            + System.lineSeparator() + discount + System.lineSeparator() + price
            + System.lineSeparator() + finalized;
   }
}
