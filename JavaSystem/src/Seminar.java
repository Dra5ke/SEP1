import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Seminar extends Event
{
   private LecturerList lecturers;
   private String[] subjects;
   private String sponsorName;
   private Time duration;

   public Seminar(int id)
   {

   }

   public Seminar()
   {
      super();
      new File("./events/seminars").mkdir();
      file = new File("./events/seminars/event" + id + ".txt");
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
      String[] subjects = bufferedReader.readLine().split(" ");
      this.subjects = new String[subjects.length];
      setSubjects(subjects);
      String[] lecturers = bufferedReader.readLine().split(" ");
      this.lecturers = new LecturerList();
      for (int i = 0; i < lecturers.length; i++)
         this.lecturers.addLecturer(VIASystem.lecturers
               .getLecturerById((Integer.parseInt(lecturers[i]))));
      setSponsorName(bufferedReader.readLine());
      String[] temp3 = bufferedReader.readLine().split(" ");
      int[] dates3;
      dates3 = new int[2];
      int minute2, hour2;
      for (int i = 0; i < temp3.length; i++)
         dates3[i] = Integer.parseInt(temp3[i]);
      hour2 = dates3[0];
      minute2 = dates3[1];
      setDuration(new Time(hour2, minute2).copy());
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

   public LecturerList getLecturers()
   {
      return lecturers;
   }

   public void setLecturers(LecturerList lecturers)
   {
      this.lecturers = lecturers;
   }

   public String[] getSubjects()
   {
      return subjects;
   }

   public void setSubjects(String[] subjects)
   {
      this.subjects = subjects;
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

   public String subjectsToString()
   {
      String list = "";
      for (int i = 0; i < subjects.length; i++)
      {
         list = list + subjects[i] + " ";
      }

      return list;
   }

   public String userToString()
   {
      String message = super.userToString();

      if (this.isFinalized())
      {
         message = message + "\nThis seminar is lectured by: \\n";
         for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
            message += lecturers.getAllLecturers().get(i).userToString() + "\n";
         message = message + "This seminar is on: " + this.subjectsToString()
               + "\nThe event is sponsored by: " + sponsorName + "\nEvent finalized";
      }
      else
      {
         message = message + "\nThis seminar is lectured by: \\n";
      for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
         message += lecturers.getAllLecturers().get(i).userToString() + "\n";
      message = message + "This seminar is on: " + this.subjectsToString()
            + "\nThe event is sponsored by: " + sponsorName + "\nEvent not finalized";
      }
      
      return message;
   }

   public String toString()
   {
      String list = super.toString();
      String[] lecturersid;
      lecturersid = new String[lecturers.getAllLecturers().size()];
      for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
         lecturersid[i] = Integer
               .toString(lecturers.getAllLecturers().get(i).getId());
      list = list + System.lineSeparator() + this.subjectsToString()
            + System.lineSeparator()
            + Arrays.toString(lecturersid).replace(",", "").replace("[", "")
                  .replace("]", "")
            + System.lineSeparator() + sponsorName + System.lineSeparator()
            + duration.toString();
      return list;
   }

}
