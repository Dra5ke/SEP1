import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class UID
{
   private static int member_id = 0;
   private static int lecturer_id = 0;
   private static int event_id = 0;

   public static int generateMemberId()
   {
      return member_id++;
   }

   public static int generateLecturerId()
   {
      return lecturer_id++;
   }

   public static int generateEventId()
   {
      return event_id++;
   }

   public static void setMember_idCounter(int member_idCounter)
   {
      member_id = member_idCounter;
   }

   public static void setLecturer_idCounter(int lecturer_idCounter)
   {
      lecturer_id = lecturer_idCounter;
   }

   public static void setEvent_idCounter(int event_idCounter)
   {
      event_id = event_idCounter;
   }

   public static void writeIds() throws FileNotFoundException
   {
      File file = new File("./IDs/id.txt");
      PrintWriter out = new PrintWriter(file);
      String ids = member_id + System.lineSeparator() + lecturer_id
            + System.lineSeparator() + event_id;
      out.println(ids);
      out.close();
   }

   public static void readIds() throws NumberFormatException, IOException
   {
      File file = new File("./IDs/id");
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      UID.setMember_idCounter(Integer.parseInt(bufferedReader.readLine()));
      UID.setLecturer_idCounter(Integer.parseInt(bufferedReader.readLine()));
      UID.setEvent_idCounter(Integer.parseInt(bufferedReader.readLine()));
   }
}
