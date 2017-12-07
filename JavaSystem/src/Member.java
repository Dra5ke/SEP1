import java.util.ArrayList;


public class Member
{
   private int id;
   private String name;
   private String email;
   private String address;
   private String phone;
   private int paymentYear;
   private Date dateOfRegistraion;
   private boolean newsletterSubscripition;
   private ArrayList<Integer> attendedEvents;
   int[] listArray = new int[0];

    public Member()
   {
       id = UID.generateMemberId();
   }

   public int getId()
   {
      return id;
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
    
      this.dateOfRegistraion = dateOfRegistration.copy();
   }

   public Date getDateOfRegistration()
   {
      return dateOfRegistraion;
   }

   public void setNewsletterSubscription(boolean newsletterSubscripition)
   {
      this.newsletterSubscripition = newsletterSubscripition;

   }

   public boolean isNewsletterSubscription()
   {
      return newsletterSubscripition;
   }

   public void setAttendedEvents(ArrayList<Integer> attendedEvents)
   {
      this.attendedEvents = attendedEvents;
   }

   public EventList getAttendedEvents(EventList eventsArg)
   {
      EventList events = new EventList();
      int ok = 0;
      
      for(int j = 0 ; j < attendedEvents.size(); j++)
      {
         ok = 0;
      for(int i = 0; i < eventsArg.getAllEvents().size() && ok==0; i++)
      {
         if(attendedEvents.get(j) == eventsArg.getAllEvents().get(i).getId())
         {
            events.addEvent(eventsArg.getAllEvents().get(i));
            ok = 1;
         }
      }
      }
     
      return events;
   }

   public String toString()
   {
      return "Name : " + name + "\n" + "Address :" + address + "\n"
            + "Phone number :" + phone + "\n" + "PaymentYear :" + paymentYear + "\n"
            + "DateOfRegistraion :" + dateOfRegistraion + "\n"
            + "NewsletterSubscripition" + newsletterSubscripition + "\n"
            + "AttendedEvents" + attendedEvents;

   } 
}
