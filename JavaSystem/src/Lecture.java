import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class that defines a more specific Event
 * 
 * @author Andrei Cioanca
 */
public class Lecture extends Event
{
   private Lecturer lecturer;
   private String subject;
   private String sponsorName;
   private Time duration;

   /**
    * Constructor created in order to be able to instantiate a Lecture type object
    *    without creating a file for it
    */
   public Lecture(int id)
   {

   }

   public Lecture()
   {
      super();
      new File("./events/lectures").mkdir();
      file = new File("./events/lectures/event" + id + ".txt");
   }
   
   /**
    * Method for reading a lecture from a file
    * 
    * @see FileController#readEvents()
    */
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
      for (int i = 0; i < temp1.length; i++)
         dates1[i] = Integer.parseInt(temp1[i]);
      day = dates1[0];
      month = dates1[1];
      year = dates1[2];
      this.startDate = new Date(day, month, year).copy();
      String[] temp2 = bufferedReader.readLine().split(" ");
      int[] dates2;
      dates2 = new int[2];
      int minute, hour;
      for (int i = 0; i < temp2.length; i++)
         dates2[i] = Integer.parseInt(temp2[i]);
      hour = dates2[0];
      minute = dates2[1];
      setStartTime(new Time(hour, minute).copy());
      setTotalTickets(Integer.parseInt(bufferedReader.readLine()));
      setDiscount(Integer.parseInt(bufferedReader.readLine()));
      setPrice(Integer.parseInt(bufferedReader.readLine()));
      setFinalized(Boolean.parseBoolean(bufferedReader.readLine()));
      setSubject(bufferedReader.readLine());
      setLecturer(VIASystem.lecturers.getLecturer(bufferedReader.readLine()));
      setSponsorName(bufferedReader.readLine());
      String[] temp3 = bufferedReader.readLine().split(" ");
      int[] dates3;
      dates3 = new int[2];
      int minute2, hour2;
      for (int i = 0; i < temp3.length; i++)
         dates3[i] = Integer.parseInt(temp3[i]);

      hour2 = dates3[0];
      minute2 = dates3[1];
      this.duration = new Time(hour2, minute2).copy();
      bufferedReader.close();
   }

   public Lecturer getLecturer()
   {
      return lecturer;
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

   public void setLecturer(Lecturer lecturer)
   {
      this.lecturer = lecturer;
   }

   public String getSubject()
   {
      return subject;
   }

   public void setSubject(String subject)
   {
      this.subject = subject;
   }

   public String getSponsorName()
   {
      return sponsorName;
   }

   public void setSponsorName(String sponsorName)
   {
      this.sponsorName = sponsorName;
   }

   public Time getDuration()
   {
      return duration.copy();
   }

   public void setDuration(Time duration)
   {
      this.duration = duration;
   }

   /**
    * (non-Javadoc)
    * @see Event#userToString()
    */
   public String userToString()
   {
      String message = super.userToString();

      if (this.isFinalized())
         message = message + "\nThe lecture is presented by: "
               + lecturer.getName() + "\nThe lecture is on: " + subject
               + "\nThe event is sponsored by: " + sponsorName
               + "\nThe lecture will take: " + duration.toString() + " hours"
               + "\nEvent finalized.";
      else 
         message = message + "\nThe lecture is presented by: "
               + lecturer.getName() + "\nThe lecture is on: " + subject
               + "\nThe event is sponsored by: " + sponsorName
               + "\nThe lecture will take: " + duration.toString() + "hours"
               + "\nEvent not finalized.";
      return message;
   }

   public String toString()
   {
      String list = super.toString();

      list = list + System.lineSeparator() + subject + System.lineSeparator()
            + this.lecturer.getName() + System.lineSeparator() + sponsorName
            + System.lineSeparator() + duration.toString();
      return list;
   }
}
