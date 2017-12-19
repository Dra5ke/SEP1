import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class that defines a more specific Event
 * 
 * @author Andrei Cioanca
 */
public class Trip extends Event
{
   private String locations[];
   private String handlerName;
   private int duration;
   
   /**
    * @see Lecture#Lecture(int id)
    */
   public Trip(int id)
   {
      
   }
   public Trip()
   {
      super();
      new File("./events/trips").mkdir();
      file = new File("./events/trips/event"+id+".txt");
   }
   
   public void readFile() throws NumberFormatException, IOException
   {
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      setId(Integer.parseInt(bufferedReader.readLine()));
      setTitle(bufferedReader.readLine());
      int day, month, year;
      String[] temp1 = bufferedReader.readLine().split(" ");
      int[] dates1;
      dates1 = new int[3];
      for (int i=0;i<temp1.length;i++)
         dates1[i] = Integer.parseInt(temp1[i]);
      day = dates1[0];
      month = dates1[1];
      year = dates1[2];
      this.startDate = new Date(day,month,year).copy();
      String[] temp2 = bufferedReader.readLine().split(" ");
      int[] dates2;
      dates2 = new int[2];
      int minute, hour;
      for (int i=0;i<temp2.length;i++)
         dates2[i] = Integer.parseInt(temp2[i]);
      hour = dates2[0];
      minute = dates2[1];
      setStartTime(new Time(hour, minute).copy());
      setTotalTickets(Integer.parseInt(bufferedReader.readLine()));
      setDiscount(Integer.parseInt(bufferedReader.readLine()));
      setPrice(Integer.parseInt(bufferedReader.readLine()));
      setFinalized(Boolean.parseBoolean(bufferedReader.readLine()));
      String[] temp3 = bufferedReader.readLine().split(" ");
      this.locations = new String[temp3.length];
      for (int i=0;i<temp3.length;i++)
         this.locations[i] = temp3[i];
      setHandlerName(bufferedReader.readLine());
      setDuration(Integer.parseInt(bufferedReader.readLine()));
      bufferedReader.close();
   }
   public void writeToFile() throws FileNotFoundException
   {
      PrintWriter out = new PrintWriter(this.file);
      out.println(toString());
      out.close();
   }
   public void setFile(File file)
   {
      this.file = file;
   }
   public void setDuration(int duration)
   {
      this.duration = duration;
   }
   public int getDuration()
   {
      return duration;
   }
   public void setLocations(String[] locations)
   {
      this.locations = locations;
   }
   public String[] getLocations()
   {
      return locations;
   }
   public String getHandlerName()
   {
      return handlerName;
   }
   public void setHandlerName(String handlerName)
   {
      this.handlerName = handlerName;
   }
   public String locationsToString()
   {
      String location = "";
      for(int i = 0; i < locations.length; i++)
      {
         location = location + locations[i] + " ";
      }
      
      return location;
   }
   public String toString()
   {
      String list = super.toString();
      
      list = list + System.lineSeparator() + this.locationsToString() + System.lineSeparator() + handlerName + System.lineSeparator() + duration;
      
      return list;
   }
}
