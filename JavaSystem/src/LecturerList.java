import java.util.ArrayList;

/**
 * A class used to store all the lecturers in an ArrayList
 * 
 * @author Andrei Cioanca
*/
public class LecturerList
{

   private ArrayList<Lecturer> lecturers;

   public LecturerList()
   {
      lecturers = new ArrayList<Lecturer>();
   }

   public void addLecturer(Lecturer lecturer)
   {
      lecturers.add(lecturer);
   }

   /**
    * @see EventList#getEventById(int id)
    */
   public Lecturer getLecturerById(int id)
   {
      Lecturer lecturer = new Lecturer(1);

      for (int i = 0; i < lecturers.size(); i++)
      {
         if (lecturers.get(i).getId() == id)
         {
            lecturer = lecturers.get(i);
         }
      }
      return lecturer;
   }

   /**
    * Method used to delete the provided lecturer from the list
    * 
    * @param lecturer
    */
   public void removeLecturer(Lecturer lecturer)
   {
      lecturers.remove(lecturer);
      lecturer.getFile().delete();
   }

   public int getNumberOfLecturers()
   {
      return lecturers.size();
   }

   /**
    * Method used for searching lecturers by name
    * 
   */ 
   public Lecturer getLecturer(String name)
   {
      Lecturer lecturer = new Lecturer(1);
      for (int i = 0; i < lecturers.size(); i++)
      {
         if (lecturers.get(i).getName().equals(name))
         {
            lecturer = (Lecturer) lecturers.get(i);
         }
      }

      return lecturer;
   }

   /**
    * Method used for searching lecturers by subject
    * 
    * @return an array of lecturers that match the parameter. If no lecturers match
    *          the parameter an empty array will be returned
    */
   public Lecturer[] getLecturerBySubject(String subject)
   {

      Lecturer[] lecturerlist = new Lecturer[lecturers.size()];
      int k = 0;
      for (int i = 0; i < lecturers.size(); i++)
      {
         if (lecturers.get(i).getSubject().equals(subject))
         {
            lecturerlist[k] = (Lecturer) lecturers.get(i);
            k++;
         }
      }

      return lecturerlist;
   }
   
   /**
    * Method used to search lecturers by phone
    * 
    * @return an array of lecturers that match the parameter. If no lecturers match
    *          the parameter an empty array will be returned
    */
   public Lecturer[] getLecturerByPhone(String phone)
   {

      Lecturer[] lecturerlist = new Lecturer[lecturers.size()];
      int k = 0;
      for (int i = 0; i < lecturers.size(); i++)
      {
         if (lecturers.get(i).getPhone().equals(phone))
         {
            lecturerlist[k] = lecturers.get(i);
            k++;
         }
      }

      return lecturerlist;
   }
   
   /**
    * Method used to search lecturers that are considered sponsors or not
    * 
    * @return an array of lecturers that match the parameter. If no lecturers match
    *          the parameter an empty array will be returned
    */
   public Lecturer[] getLecturer(boolean sponsored)
   {
      Lecturer[] lecturerList = new Lecturer[lecturers.size()];
      
      int k = 0;
      for(int i = 0; i < lecturers.size(); i++)
      {
         if(sponsored == lecturers.get(i).isSponsor())
         {
            lecturerList[k] = lecturers.get(i);
            k++;
         }
      }
      
      return lecturerList;
   }
   
   /**
    * Method used to search lecturers by email
    * 
    * @return an array of lecturers that match the parameter. If no lecturers match
    *          the parameter an empty array will be returned
    */
   public Lecturer[] getLecturerByEmail(String email)
   {
      Lecturer[] lecturerList = new Lecturer[lecturers.size()];
      int k = 0;
      for(int i = 0; i < lecturers.size(); i++)
      {
         if(lecturers.get(i).getEmail().equals(email))
         {
            lecturerList[k] = lecturers.get(i);
            k++;
         }
      }
      
      return lecturerList;
   }

   public ArrayList<Lecturer> getAllLecturers()
   {
      return lecturers;
   }

   public Lecturer[] getAllLecturersArray()
   {
      Lecturer[] lecturersArr = new Lecturer[lecturers.size()];
      for (int i = 0; i < lecturers.size(); i++)
      {
         lecturersArr[i] = lecturers.get(i);
      }
      
      return lecturersArr;
   }

   public String toString()
   {
      String list = "";
      for (int i = 0; i < lecturers.size(); i++)
      {
         list = list + lecturers.get(i).toString() + "\n" + "\n";
      }
      return list;
   }

}