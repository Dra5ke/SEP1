
public class Lecture extends Event
{
   private Lecturer lecturer;
   private String subject;
   private String sponsorName;
   private Time duration;

   public Lecturer getLecturer()
   {
      return lecturer;
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

   public String toString()
   {
      String list = super.toString();
      
      list = list + "\n" + "This event is a Lecture on " + subject + " held by " + this.lecturer.getName() + " and sponsored by " + sponsorName + "\n" + "The event will take " + duration.toString() + " hours.";
      return list;
   }
}
