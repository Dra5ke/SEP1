import java.util.ArrayList;

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

public int getNumberOfLecturers()
{
   return lecturers.size();
}

public Lecturer[] getLecturer(String name)
{
   
   Lecturer lecturerlist[] = new Lecturer[lecturers.size()];
   for (int i=0;i<lecturers.size();i++)
   {
      if (name == lecturers.get(i).getName())
      {
         lecturerlist[i] = (Lecturer) lecturers.get(i);
      }
   }
   
   return lecturerlist;
}

public Lecturer[] getLecturerBySubject(String subject)
{
   
   Lecturer lecturerlist[] = new Lecturer[lecturers.size()];
   for (int i=0;i<lecturers.size();i++)
   {
      if (subject == lecturers.get(i).getSubject())
      {
         lecturerlist[i] = (Lecturer) lecturers.get(i);
      }
   }
   
   return lecturerlist;
}

public ArrayList<Lecturer> getAllLecturers()
{
   return lecturers;
}

public String toString()
{
   String list = "";
   for (int i = 0; i< lecturers.size(); i++)
   {
      list = list + lecturers.get(i).toString() + "\n" + "\n";
   }
   return list;
}

}