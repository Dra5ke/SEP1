
public class UID
{
   private static int member_id=0;
   private static int lecturer_id=0;
   private static int event_id=0;
   
   public static int generateMemberId()
   {
      return member_id++;
   }
   public static int generateLecturerId()
   {
      return lecturer_id++;
   }
   public static int generateEventId()
   {
      return event_id++;
   }
   public static void setMember_idCounter(int member_idCounter)
   {
      member_id = member_idCounter;
   }
   public static void setLecturer_idCounter(int lecturer_idCounter)
   {
      lecturer_id = lecturer_idCounter;
   }
   public static void setEvent_idCounter(int event_idCounter)
   {
      event_id = event_idCounter;
   }
}
