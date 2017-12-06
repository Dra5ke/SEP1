
public class Trip extends Event
{
   private String locations[];
   private String handlerName;
   
   public String[] getLocations()
   {
      return locations;
   }
   public void setLocations(String[] locations)
   {
      this.locations = locations;
   }
   public String getHandlerName()
   {
      return handlerName;
   }
   public void setHandlerName(String handlerName)
   {
      this.handlerName = handlerName;
   }
  
}
