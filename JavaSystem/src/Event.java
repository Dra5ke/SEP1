
public class Event
{
   private int id;
   private String title;
   private Date startDate;
   private Time startTime;
   private int totalTickets;
   private int availableTickets;
   private int discount;
   private int price;
   private boolean finalized;

   public Event()
   {
      id = UID.generateEventId();
   }

   public int getId()
   {
      return id;
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

   public void setstartTime(Time startTime)
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

   public void setAvailableTickets(int availableTickets)
   {
      this.availableTickets = availableTickets;
   }

   public int getAvailableTickets()
   {
      return availableTickets;
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

   public String toString()
   {
      if (this.isFinalized())
         return title + ": " + "Will be held on " + startDate.toString()
               + " at " + startTime.toString() + "\n" + "There are "
               + totalTickets + " tickets in total of which " + availableTickets
               + " are available for purchase." + "\n"
               + "The discount that is available for this event is " + discount
               + "% of the total price of " + price + "DKK." + "\n"
               + "The event is finalized.";
      else
         return title + ": " + "Will be held on " + startDate.toString()
               + " at " + startTime.toString() + "\n" + "There are "
               + totalTickets + " tickets in total of which " + availableTickets
               + " are available for purchase." + "\n"
               + "The discount that is available for this event is " + discount
               + "% of the total price of " + price + "DKK." + "\n"
               + "The event is not finalized.";
   }
}
