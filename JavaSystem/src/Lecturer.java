import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecturer
{
   private int id;
   private String name;
   private String email;
   private String phone;
   private boolean sponsor;
   private String subject;
   private File file;

   public Lecturer(int id)
   {

   }

   public Lecturer() throws FileNotFoundException
   {

      new File("lecturers").mkdir();
      id = UID.generateLecturerId();
      this.file = new File("./lecturers/lecturer" + " " + id + ".txt");
   }

   public void setFile(File file)
   {
      this.file = file;
   }

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public File getFile()
   {
      return this.file;
   }

   public String getName()
   {
      return this.name;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getEmail()
   {
      return this.email;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public boolean isSponsor()
   {
      return sponsor;
   }

   public void setSponsor(boolean sponsor)
   {
      this.sponsor = sponsor;
   }

   public String getSubject()
   {
      return subject;
   }

   public void setSubject(String subject)
   {
      this.subject = subject;
   }

   public void readFile() throws IOException
   {
      String line = null;
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      setId(Integer.parseInt(bufferedReader.readLine()));
      setName(bufferedReader.readLine());
      setEmail(bufferedReader.readLine());
      setPhone(bufferedReader.readLine());
      setSponsor(Boolean.parseBoolean(bufferedReader.readLine()));
      setSubject(bufferedReader.readLine());
      bufferedReader.close();
   }

   public void writeToFile() throws FileNotFoundException
   {
      PrintWriter out = new PrintWriter(this.file);
      out.println(toString());
      out.close();
   }

   public boolean equals(Object object)
   {
      if (!(object instanceof Lecturer))
      {
         return false;
      }
      else
      {
         Lecturer other = (Lecturer) object;
         if (name == other.name && email == other.email && phone == other.phone
               && sponsor == other.sponsor && subject == other.subject)
            return true;
         else
            return false;
      }
   }

   public String userToString()
   {
      String message = new String();
      
      if(this.isSponsor())
      message = "Name: " + name + "\nSubject: " + subject + "\nEmail address: "
            + email + "\nPhone number: " + phone + "\n" + name + " is a sponsor.";
      else
         message = "Name: " + name + "\nSubject: " + subject + "\nEmail address: "
               + email + "\nPhone number: " + phone + "\n" + name + " is not a sponsor.";

      return message;
   }

   public String toString()
   {
      return id + System.lineSeparator() + name + System.lineSeparator() + email
            + System.lineSeparator() + phone + System.lineSeparator() + sponsor
            + System.lineSeparator() + subject + System.lineSeparator();
   }

}
