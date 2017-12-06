
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


}
