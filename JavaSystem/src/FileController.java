import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileController
{

   public static void readEvents() throws NumberFormatException, IOException
   {
      File fileL = new File("./events/lectures");
      File[] filesL = fileL.listFiles();
      for(int i = 0; i < filesL.length; i++)
      {
         Lecture lecture = new Lecture(1);
         lecture.setFile(filesL[i]);
         lecture.readFile();
         VIASystem.events.addEvent(lecture);
      }
      
      File fileS = new File("./events/seminars");
      File[] filesS = fileS.listFiles();
      for(int i = 0; i < filesS.length; i++)
      {
         Seminar seminar = new Seminar(1);
         seminar.setFile(filesS[i]);
         seminar.readFile();
         VIASystem.events.addEvent(seminar);
      }
      
      File fileW = new File("./events/workshops");
      File[] filesW = fileW.listFiles();
      for(int i = 0; i < filesW.length; i++)
      {
         Workshop workshop = new Workshop(1);
         workshop.setFile(filesW[i]);
         workshop.readFile();
         VIASystem.events.addEvent(workshop);
      }
      
      File fileT = new File("./events/trips");
      File[] filesT = fileT.listFiles();
      for(int i = 0; i < filesT.length; i++)
      {
         Trip trip = new Trip(1);
         trip.setFile(filesT[i]);
         trip.readFile();
         VIASystem.events.addEvent(trip);
      }

   }
   
   public static void writeEvents() throws FileNotFoundException
   {
      for(int i = 0; i < VIASystem.events.getAllEvents().size(); i++)
      {
         if(VIASystem.events.getAllEvents().get(i) instanceof Lecture)
         {
            Lecture lecture = (Lecture) VIASystem.events.getAllEvents().get(i);
            lecture.writeToFile();
         }
         else if(VIASystem.events.getAllEvents().get(i) instanceof Seminar)
         {
            Seminar seminar = (Seminar) VIASystem.events.getAllEvents().get(i);
            seminar.writeToFile();
         }
         else if(VIASystem.events.getAllEvents().get(i) instanceof Workshop)
         {
            Workshop workshop = (Workshop) VIASystem.events.getAllEvents().get(i);
            workshop.writeToFile();
         }
         else
         {
            Trip trip = (Trip) VIASystem.events.getAllEvents().get(i);
            trip.writeToFile();
         }
      }
   }
   
   public static void readLecturers() throws IOException
   {
      File file = new File("./lecturers");
      File[] files = file.listFiles();
      for(int i = 0; i < files.length; i++)
      {
         Lecturer lecturer = new Lecturer(1);
         
         lecturer.setFile(files[i]);
         lecturer.readFile();
         VIASystem.lecturers.addLecturer(lecturer);
      }
   }
   
   public static void writeLecturers() throws FileNotFoundException
   {
      for(int i = 0; i < VIASystem.lecturers.getAllLecturers().size(); i++)
      {
         VIASystem.lecturers.getAllLecturers().get(i).writeToFile();
      }
   }
   
   public static void readMembers() throws IOException, NullPointerException
   {
      File file = new File("./members");
      File[] files = file.listFiles();
      for(int i = 0; i < files.length; i++)
      {
         Member member = new Member(1);
         
         member.setFile(files[i]);
         member.readFile();
         VIASystem.members.addMember(member);
      }
   }
   
   public static void writeMembers() throws FileNotFoundException
   {
      for(int i = 0; i < VIASystem.members.getAllMembers().size(); i++)
      {
         VIASystem.members.getAllMembers().get(i).writeToFile();
      }
   }
   
   public static int numberOfEvents()
   {
      File fileL = new File("./events/lectures");
      File[] filesL = fileL.listFiles();  
      File fileS = new File("./events/seminars");
      File[] filesS = fileS.listFiles();
      File fileW = new File("./events/workshops");
      File[] filesW = fileW.listFiles();
      File fileT = new File("./events/trips");
      File[] filesT = fileT.listFiles();
      
      return filesL.length + filesS.length + filesW.length + filesT.length;
   }
   
   public static int numberOfMembers()
   {
      File file = new File("./members");
      File[] files = file.listFiles();
      
      return files.length;
   }
   
   public static int numberOfLecturers()
   {
      File file = new File("./lecturers");
      File[] files = file.listFiles();
      
      return files.length;
   }

}
