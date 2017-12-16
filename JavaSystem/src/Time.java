
public class Time
{
   private int hour;
   private int minute;
   
   public Time(int h, int m)
   {
      if (m < 0)
         m = 0;
      else if (m >= 60)
         m = 59;

      hour = h;
      minute = m;
   }
   
   public int getHour()
   {
      return hour;
   }

   public int getMinute()
   {
      return minute;
   }
   
   public void setTime(int h, int m)
   {
      if (m < 0)
         m = 0;
      else if (m >= 60)
         m = 59;

      hour = h;
      minute = m;
   }
   
   public Time copy()
   {
      Time other;
      other = new Time(hour, minute);
      return other;
   }
   
   public String toString()
   {
      String h = "";

      if (hour < 10)
         h = h + "0" + hour;
      else
         h = h + hour;

      String m = "";

      if (minute < 10)
         m = m + "0" + minute;
      else
         m = m + minute;

      return h + " " + m;
   }
}
