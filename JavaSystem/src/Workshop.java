import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Class that defines a more specific Event
 * 
 * @author Andrei Cioanca
 */
public class Workshop extends Event
{
   private LecturerList lecturers;
   private String[] subjects;
   private boolean food;
   private boolean vegan;
   private String sponsorName;
   private int duration;

   /**
    * @see Lecture#Lecture()
    */
   public Workshop(int id)
   {

   }

   public Workshop()
   {
      super();
      new File("./events/workshops").mkdir();
      file = new File("./events/workshops/event" + id + ".txt");
   }

   public LecturerList getLecturers()
   {
      return lecturers;
   }

   public void readFile() throws IOException
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
      setDuration(Integer.parseInt(bufferedReader.readLine()));
      setFood(Boolean.parseBoolean(bufferedReader.readLine()));
      setVegan(Boolean.parseBoolean(bufferedReader.readLine()));

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

   public boolean isFood()
   {
      return food;
   }

   public void setFood(boolean food)
   {
      this.food = food;
   }

   public boolean isVegan()
   {
      return vegan;
   }

   public void setVegan(boolean vegan)
   {
      this.vegan = vegan;
   }

   public String getSponsorName()
   {
      return sponsorName;
   }

   public void setSponsorName(String sponsorName)
   {
      this.sponsorName = sponsorName;
   }

   public int getDuration()
   {
      return duration;
   }

   public void setDuration(int duration)
   {
      this.duration = duration;
   }

   public String subjectsToString()
   {
      String list = "";
      for (int i = 0; i < subjects.length; i++)
      {
         list = list + subjects[i] + ", ";
      }

      return list;
   }

   /**
    * (non-Javadoc)
    * @see Event#userToString()
    */
   public String userToString()
   {
      String message = super.userToString();

      if (this.isFinalized())
      {
         if (this.isFood())
         {

            if (this.isVegan())
            {
               message = message + "\nThis workshop is lectured by: \\n";
               for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
                  message += lecturers.getAllLecturers().get(i).userToString()
                        + "\n";
               message = message + "This workshop is on: "
                     + this.subjectsToString() + "\nThe event is sponsored by: "
                     + sponsorName + "\nThe event provides meals."
                     + "\nEvent finalized";
            }
            else
            {
               message = message + "\nThis workshop is lectured by: \\n";
               for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
                  message += lecturers.getAllLecturers().get(i).userToString()
                        + "\n";
               message = message + "This workshop is on: "
                     + this.subjectsToString() + "\nThe event is sponsored by: "
                     + sponsorName
                     + "\nThe event provides strictly vegan meals."
                     + "\nEvent finalized";
            }
         }
         else
         {
            message = message + "\nThis workshop is lectured by: \\n";
            for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
               message += lecturers.getAllLecturers().get(i).userToString()
                     + "\n";
            message = message + "This workshop is on: "
                  + this.subjectsToString() + "\nThe event is sponsored by: "
                  + sponsorName + "\nThe event does not provide any meals."
                  + "\nEvent finalized";
         }

      }
      else
      {
         if (this.isFood())
         {
            if (this.isVegan())
            {
               message = message + "\nThis workshop is lectured by: \\n";
               for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
                  message += lecturers.getAllLecturers().get(i).userToString()
                        + "\n";
               message = message + "This workshop is on: "
                     + this.subjectsToString() + "\nThe event is sponsored by: "
                     + sponsorName + "\nThe event provides meals."
                     + "\nEvent not finalized";
            }
            else
            {
               message = message + "\nThis workshop is lectured by: \\n";
               for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
                  message += lecturers.getAllLecturers().get(i).userToString()
                        + "\n";
               message = message + "This workshop is on: "
                     + this.subjectsToString() + "\nThe event is sponsored by: "
                     + sponsorName
                     + "\nThe event provides strictly vegan meals."
                     + "\nEvent not finalized";
            }
         }
         else
         {
            message = message + "\nThis workshop is lectured by: \\n";
            for (int i = 0; i < lecturers.getAllLecturers().size(); i++)
               message += lecturers.getAllLecturers().get(i).userToString()
                     + "\n";
            message = message + "This workshop is on: "
                  + this.subjectsToString() + "\nThe event is sponsored by: "
                  + sponsorName + "\nThe event does not provide any meals."
                  + "\nEvent not finalized";
         }
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
      list = list + System.lineSeparator()
            + this.subjectsToString().replace(",", "") + System.lineSeparator()
            + Arrays.toString(lecturersid).replace(",", "").replace("[", "")
                  .replace("]", "")
            + System.lineSeparator() + sponsorName + System.lineSeparator()
            + duration + System.lineSeparator() + food + System.lineSeparator()
            + vegan;
      return list;
   }

}