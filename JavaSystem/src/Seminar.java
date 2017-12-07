
public class Seminar extends Event
{
   private LecturerList lecturers;
   private String[] subjects;
   private String sponsorName;
   private Time duration;

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
         list = list + subjects[i] + ", ";
      }

      return list;
   }

   public String toString()
   {
      String list = super.toString();

      list = list + "\n" + "This event is a Seminar on "
            + this.subjectsToString() + "held by the following lecturers: "
            + "\n" + "\n" + this.lecturers.toString() + "\n"
            + "The event is sponsored by " + sponsorName + "\n"
            + "The event will take " + duration.toString() + " hours.";
      return list;
   }

}
