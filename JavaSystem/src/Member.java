import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Member
{
   private int id;
   private String name;
   private String email;
   private String address;
   private String phone;
   private int paymentYear;
   private Date dateOfRegistration;
   private boolean newsletterSubscription;
   private ArrayList<String> attendedEvents;
   private File file;

   public Member(int id)
   {

   }

   public Member() throws FileNotFoundException
   {
      new File("members").mkdir();
      id = UID.generateMemberId();
      this.file = new File("./members/member" + id + ".txt");
   }

   public void readFile() throws IOException
   {
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      setId(Integer.parseInt(bufferedReader.readLine()));
      setName(bufferedReader.readLine());
      setEmail(bufferedReader.readLine());
      setAddress(bufferedReader.readLine());
      setPhone(bufferedReader.readLine());
      setPaymentYear(Integer.parseInt(bufferedReader.readLine()));
      int day, month, year;
      String[] temp1 = bufferedReader.readLine().split(" ");
      int[] dates;
      dates = new int[3];
      for (int i = 0; i < temp1.length; i++)
         dates[i] = Integer.parseInt(temp1[i]);
      day = dates[0];
      month = dates[1];
      year = dates[2];
      setDateOfRegistration(new Date(day, month, year).copy());
      setNewsletterSubscription(
            Boolean.parseBoolean(bufferedReader.readLine()));
      setAttendedEvents(new ArrayList<String>());
      String[] temp2 = bufferedReader.readLine().split(" ");
      for (int i = 0; i < temp2.length; i++)
      {

         addAttendedEvents(temp2[i]);

      }
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

   public int getId()
   {
      return id;
   }

   public File getFile()
   {
      return this.file;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getEmail()
   {
      return email;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public String getAddress()
   {
      return address;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPaymentYear(int paymentYear)
   {
      this.paymentYear = paymentYear;
   }

   public int getPaymentYear()
   {
      return paymentYear;
   }

   public void setDateOfRegistration(Date dateOfRegistration)
   {

      this.dateOfRegistration = dateOfRegistration.copy();
   }

   public Date getDateOfRegistration()
   {
      return dateOfRegistration;
   }

   public void setNewsletterSubscription(boolean newsletterSubscripition)
   {
      this.newsletterSubscription = newsletterSubscripition;

   }

   public boolean isNewsletterSubscription()
   {
      return newsletterSubscription;
   }

   public void setAttendedEvents(ArrayList<String> attendedEvents)
   {
      this.attendedEvents = attendedEvents;
   }

   public void addAttendedEvents(String event)
   {
      this.attendedEvents.add(event);
   }

   public ArrayList<String> getAttendedEvents()
   {
      return attendedEvents;
   }

   public String userToString()
   {
      String message = new String();

      if (this.isNewsletterSubscription())
      {
         message = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone
               + "\nAddress: " + address + "\nPayment year: " + paymentYear
               + "\nMember registered on: " + dateOfRegistration.toString()
               + "\nThis member attended the following events:\n";
         for (int i = 0; i < attendedEvents.size(); i++)
         {
            for (int j = 0; j < VIASystem.events.getAllEvents().size(); j++)
            {
               if (Integer.parseInt(attendedEvents.get(i)) == VIASystem.events
                     .getAllEvents().get(j).getId())
               {
                  message = message
                        + VIASystem.events.getAllEvents().get(j).getTitle()
                        + " ";
               }
            }
         }
         
         message = message + "\nThis member is subscribed to the newsletter.";
      }
      else
      {
         message = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone
               + "\nAddress: " + address + "\nPayment year: " + paymentYear
               + "\nMember registered on: " + dateOfRegistration.toString()
               + "\nThis member attended the following events:\n";
         for (int i = 0; i < attendedEvents.size(); i++)
         {
            for (int j = 0; j < VIASystem.events.getAllEvents().size(); j++)
            {
               if (Integer.parseInt(attendedEvents.get(i)) == VIASystem.events
                     .getAllEvents().get(j).getId())
               {
                  message = message
                        + VIASystem.events.getAllEvents().get(j).getTitle()
                        + " ";
               }
            }
         }
         
         message = message + "\nThis member is not subscribed to the newsletter.";
      }

      return message;
   }

   public String toString()
   {
      return id + System.lineSeparator() + name + System.lineSeparator() + email
            + System.lineSeparator() + address + System.lineSeparator() + phone
            + System.lineSeparator() + paymentYear + System.lineSeparator()
            + dateOfRegistration + System.lineSeparator()
            + newsletterSubscription + System.lineSeparator()
            + attendedEvents.toString().replace("[", "").replace("]", "")
                  .replace(",", "");
   }
}
