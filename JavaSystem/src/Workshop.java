
public class Workshop extends Event
{
   private LecturerList lecturers;
   private String[] subjects;
   private boolean food;
   private boolean vegan;
   private String foodType;
   private String sponsorName;
   private int duration;
   
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
   public boolean isFood()
   {
      return food;
   }
   public void setFood(boolean food)
   {
      this.food = food;
   }
   public boolean isVegan()
   {
      return vegan;
   }
   public void setVegan(boolean vegan)
   {
      this.vegan = vegan;
   }
   public String getFoodType()
   {
      return foodType;
   }
   public void setFoodType(String foodType)
   {
      this.foodType = foodType;
   }
   public String getSponsorName()
   {
      return sponsorName;
   }
   public void setSponsorName(String sponsorName)
   {
      this.sponsorName = sponsorName;
   }
   public int getDuration()
   {
      return duration;
   }
   public void setDuration(int duration)
   {
      this.duration = duration;
   }
   
   
}
