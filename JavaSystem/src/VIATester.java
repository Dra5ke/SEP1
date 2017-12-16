import java.util.ArrayList;

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
      
      /*Lecturer[] specificLecturers;
      
      specificLecturers = lecturers.getLecturer("Hara");
      for (int i = 0; i<specificLecturers.length-1; i++)
      {
         System.out.println(specificLecturers[i].toString());
         System.out.println();
      }*/
      
      for(int i = 0 ; i < lecturers.getAllLecturers().size(); i++)
      {
         System.out.println(lecturers.getAllLecturers().get(i).getId());
         System.out.println();
      }
      
      System.out.println("/////////////////////////");
      System.out.println();
      
      for(int i = 0; i < events.getAllEvents().size(); i++)
      {
         System.out.println(events.getAllEvents().get(i).getId());
         System.out.println();
      }
      
      Lecturer lecturer6 = new Lecturer();
      lecturer6.setEmail("hara@haramail.hara");
      lecturer6.setPhone("0722DejaImiSunaCunoscut");
      lecturer6.setName("Hara");
      lecturer6.setSponsor(false);
      lecturer6.setSubject("Doin a Hara");
      
      lecturers.addLecturer(lecturer6);
      
      LecturerList lecturers2 = new LecturerList();
      lecturers2.addLecturer(lecturer4);
      lecturers2.addLecturer(lecturer3);
      
      
      Seminar seminar = new Seminar();
      seminar.setTitle("Pula lu Hara");
      seminar.setStartDate(date);
      seminar.setstartTime(time);
      seminar.setTotalTickets(100);
      seminar.setAvailableTickets(30);
      seminar.setDiscount(30);
      seminar.setPrice(1000);
      seminar.setFinalized(false);
      
      String[] subjects = new String[3];
      subjects[0] = "astrology";
      subjects[1] = "hara";
      subjects[2] = "meditation";
      
      seminar.setLecturers(lecturers2);
      seminar.setSubjects(subjects);
      seminar.setSponsorName("Anca");
      seminar.setDuration(duration);
      
      events.addEvent(seminar);
      
      System.out.println();
      System.out.println(seminar.toString());
      
      for(int i = 0 ; i < lecturers.getAllLecturers().size(); i++)
      {
         System.out.println(lecturers.getAllLecturers().get(i).getId());
         System.out.println();
      }
      
      System.out.println("/////////////////////////");
      System.out.println();
      
      for(int i = 0; i < events.getAllEvents().size(); i++)
      {
         System.out.println(events.getAllEvents().get(i).getId());
         System.out.println();
      }
      
      ArrayList<Integer> eventsArray = new ArrayList<Integer>();
      eventsArray.add(1);
      eventsArray.add(3);
      ArrayList<Integer> eventsArray2 = new ArrayList<Integer>();
      eventsArray2.add(0);
      eventsArray2.add(1);
      ArrayList<Integer> eventsArray3 = new ArrayList<Integer>();
      eventsArray3.add(4);
      eventsArray3.add(2);
      Date dateOfRegistration = new Date(4, 6, 2017);
      
      Member member = new Member();
      member.setAddress("haragade");
      member.setAttendedEvents(eventsArray);
      member.setDateOfRegistration(dateOfRegistration);
      member.setEmail("hara.hara@haramail.hara");
      member.setName("The Hara");
      member.setNewsletterSubscription(true);
      member.setPaymentYear(2019);
      member.setPhone("50212345");
      
      Member member2 = new Member();
      member2.setAddress("haragade2");
      member2.setAttendedEvents(eventsArray2);
      member2.setDateOfRegistration(dateOfRegistration);
      member2.setEmail("hara.hara@haramail.hara");
      member2.setName("The Hara2");
      member2.setNewsletterSubscription(true);
      member2.setPaymentYear(2019);
      member2.setPhone("50212345");
      
      Member member3 = new Member();
      member3.setAddress("haragade3");
      member3.setAttendedEvents(eventsArray3);
      member3.setDateOfRegistration(dateOfRegistration);
      member3.setEmail("hara.hara@haramail.hara");
      member3.setName("The Hara3");
      member3.setNewsletterSubscription(true);
      member3.setPaymentYear(2019);
      member3.setPhone("50212345");
      
      MemberList members = new MemberList();
      members.addMember(member);
      members.addMember(member2);
      members.addMember(member3);
      
      System.out.println();
      System.out.println(members.toString());
      
      EventList attendedEvents = new EventList();
      
      attendedEvents = member.getAttendedEvents(events);
      
      System.out.println();
      System.out.println(attendedEvents.toString());
      
      attendedEvents = member2.getAttendedEvents(events);
      
      System.out.println();
      System.out.println(attendedEvents.toString());
      
      attendedEvents = member3.getAttendedEvents(events);
      
      System.out.println();
      System.out.println(attendedEvents.toString());
      
      String text = "15.12.2017";
      String[] numbers = new String[4];
      numbers = text.split("\\.");
      
         System.out.println(numbers[1]);
      
      
      int[] results = new int[numbers.length];
      for(int i = 0; i < numbers.length; i++)
      {
            results[i] = Integer.parseInt(numbers[i]);
      }
      System.out.println(results[0]+ " " +results[1]+ " " +results[2]);
   }

}
