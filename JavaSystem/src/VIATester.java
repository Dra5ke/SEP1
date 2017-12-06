
public class VIATester
{

   public static void main(String[] args)
   {
      
      Lecture lecture = new Lecture();
      Date date = new Date(15, 2, 2018);
      Time time = new Time(18, 15);
      Time duration = new Time(2, 30);
      Lecturer lecturer = new Lecturer();
      Lecturer lecturer2 = new Lecturer();
      Lecturer lecturer3 = new Lecturer();
      Lecturer lecturer4 = new Lecturer();
      Lecturer lecturer5 = new Lecturer();
      
      lecturer.setEmail("haraasdasdasdhara");
      lecturer.setPhone("0722DejaImiSunaCunoscut");
      lecturer.setName("Hara");
      lecturer.setSponsor(true);
      lecturer.setSubject("Doin a Hfadfasdara");
      
      lecturer2.setEmail("hadagahgahaharamail.hara");
      lecturer2.setPhone("0722DejaImiSunaCunoscut");
      lecturer2.setName("Hara");
      lecturer2.setSponsor(true);
      lecturer2.setSubject("Doin a Hfad3123ara");
      
      lecturer3.setEmail("hara@haradafasdfasdfmail.hara");
      lecturer3.setPhone("0722DejaImiSunaCunoscut");
      lecturer3.setName("Hara");
      lecturer3.setSponsor(true);
      lecturer3.setSubject("Doin a Hara");
      
      lecturer4.setEmail("hara@haramail.hara");
      lecturer4.setPhone("0722DejaImiSunaCunoscut");
      lecturer4.setName("Hara");
      lecturer4.setSponsor(false);
      lecturer4.setSubject("Doin a Hara");
      
      lecturer5.setEmail("hara@haramail.hara");
      lecturer5.setPhone("0722DejaImiSunagfhhhaCunoscut");
      lecturer5.setName("Harafgafgfa");
      lecturer5.setSponsor(false);
      lecturer5.setSubject("Doin a Hara");
      
      lecture.setTitle("Pula lu Hara");
      lecture.setStartDate(date);
      lecture.setstartTime(time);
      lecture.setTotalTickets(100);
      lecture.setAvailableTickets(30);
      lecture.setDiscount(30);
      lecture.setPrice(1000);
      lecture.setFinalized(false);
      
      lecture.setLecturer(lecturer);
      lecture.setSubject("About Hara");
      lecture.setSponsorName("Hara's Mom");
      lecture.setDuration(duration);
      
      
      System.out.println();
      
      Lecture lecture2 = new Lecture();
      lecture2.setTitle("Pula lu Hara2222");
      lecture2.setStartDate(date);
      lecture2.setstartTime(time);
      lecture2.setTotalTickets(10120);
      lecture2.setAvailableTickets(3055);
      lecture2.setDiscount(310);
      lecture2.setPrice(1000);
      lecture2.setFinalized(true);
      
      lecture2.setLecturer(lecturer);
      lecture2.setSubject("About Hara");
      lecture2.setSponsorName("Hara's Mom");
      lecture2.setDuration(duration);
      
      Lecture lecture3 = new Lecture();
      lecture3.setTitle("Pula lu Hara3333");
      lecture3.setStartDate(date);
      lecture3.setstartTime(time);
      lecture3.setTotalTickets(10120);
      lecture3.setAvailableTickets(3055);
      lecture3.setDiscount(310);
      lecture3.setPrice(1000);
      lecture3.setFinalized(true);
      
      lecture3.setLecturer(lecturer);
      lecture3.setSubject("About Hara");
      lecture3.setSponsorName("Hara's Mom");
      lecture3.setDuration(duration);
      
      Lecture lecture4 = new Lecture();
      lecture4.setTitle("Pula ghfdlu Hara");
      lecture4.setStartDate(date);
      lecture4.setstartTime(time);
      lecture4.setTotalTickets(10120);
      lecture4.setAvailableTickets(3055);
      lecture4.setDiscount(310);
      lecture4.setPrice(1000);
      lecture4.setFinalized(false);
      
      lecture4.setLecturer(lecturer);
      lecture4.setSubject("About Hara");
      lecture4.setSponsorName("Hara's Mom");
      lecture4.setDuration(duration);
      
      EventList events = new EventList();
      
      events.addEvent(lecture);
      events.addEvent(lecture2);
      events.addEvent(lecture3);
      events.addEvent(lecture4);
      System.out.println(events.toString());
      
      Event[] finalizedEvents = new Event[5];
      finalizedEvents = events.getEvent(true);
      
      for(int i = 1; i <= 2; i++)
      {
         System.out.println(finalizedEvents[i].toString());
         System.out.println();
      }
      
      LecturerList lecturers = new LecturerList();
      lecturers.addLecturer(lecturer);
      lecturers.addLecturer(lecturer2);
      lecturers.addLecturer(lecturer3);
      lecturers.addLecturer(lecturer4);
      lecturers.addLecturer(lecturer5);
      
      System.out.println(lecturers.toString());
      
      Lecturer[] specificLecturers = new Lecturer[lecturers.getNumberOfLecturers()];
      
      specificLecturers = lecturers.getLecturer("Hara");
      for (int i = 0; i<lecturers.getNumberOfLecturers(); i++)
      {
         System.out.println(specificLecturers[i].toString());
         System.out.println();
      }
   }

}
