import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * A class representing a date
 * 
 * @author Stefan Harabagiu
 */
public class Date
{
   private int day;
   private int month;
   private int year;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public Date()
   {
      Calendar now = GregorianCalendar.getInstance();
      day = now.get(Calendar.DAY_OF_MONTH);
      month = (now.get(Calendar.MONTH) + 1);
      year = now.get(Calendar.YEAR);
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public int getDay()
   {
      return day;
   }
   
   public int getMonth()
   {
      return month;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public Date copy()
   {
      Date other;
      other = new Date(day, month, year);
      return other;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Date))
      {
         return false;
      }
      else
      {
         Date other = (Date) obj;
         if (this.day == other.day && this.month == other.month
               && this.year == other.year)
            return true;
         return false;
      }
   }
   
   /**
    * Method used to determine if the current date is larger than the one given as parameter
    * 
    * @see EventList#getEvent(Date startDate)
    */
   public boolean isLarger(Date date)
   {
      if(date.getYear() > this.year) return false;
      
      if(date.getYear() == this.year) 
      {
         if(date.getMonth() > this.month) return false;
         
         if(date.getMonth() == this.month)
            if(date.getDay() >= this.day) return false;
      }
      return true;
   }

   public String toString()
   {
      String d = null, m = null;

      if (day <= 9)
         d = "0" + day;
      else
         d = "" + day;

      if (month <= 9)
         m = "0" + month;
      else
         m = "" + month;

      return d + " " + m + " " + year;
   }   
}
