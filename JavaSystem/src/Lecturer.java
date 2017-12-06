
public class Lecturer
{
   private int UID;
   private String name;
   private String email;
   private String phone;
   private boolean sponsor;
   private String subject;

   public Lecturer()
   {

   }

   public void setUID(int uID)
   {
      UID = uID;
   }

   public int getUID()
   {
      return this.UID;
   }

   public void setName(String name)
   {
      this.name = name;
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

   public String toString()
   {
      return "Name: " + this.name + System.lineSeparator() + "E-mail: "
            + this.email + System.lineSeparator() + "Phone: " + this.phone
            + System.lineSeparator() + "Sponsor: " + this.sponsor
            + System.lineSeparator() + "Subject: " + this.subject;
   }

}
