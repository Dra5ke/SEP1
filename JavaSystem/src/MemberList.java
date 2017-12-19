import java.util.ArrayList;

/**
 * A class used to store all the members in an ArrayList
 * 
 * @author Andrei Cioanca
*/
public class MemberList
{

  private ArrayList<Member> members;

   public MemberList()
   {
      members = new ArrayList<Member>();
   }

   public void addMember(Member member)
   {
     members.add(member);
   }

   /**
    * Method used to remove the member from the list
    * @param member
    */
   public void removeMember(Member member)
   {
      members.remove(member);
      member.getFile().delete();
   }
   
   public int getNumberOfMembers()
   {
      return members.size();
   }

   public Member[] getMember(String name)
   {
      Member[] member;
      member = new Member[members.size()];
      int i;
      int counter = 0;
      
      for (i = 0; i < members.size(); i++)
      {
         if (members.get(i).getName().equals(name)) 
         {
            member[counter] = members.get(i);
            counter ++;
         }
      }

      return member;
   }
   
   public Member[] getMember(int paymentYear)
   {
      Member[] member;
      member = new Member[members.size()];
      int i;
      int counter = 0;
      
      for (i = 0; i < members.size(); i++)
      {
         if (members.get(i).getPaymentYear() == paymentYear) 
         {
            member[counter] = members.get(i);
            counter ++;
         }
      }
      return member;
   }

   public Member[] getMember(Date dateOfRegistration)
   {
      Member[] member;
      member = new Member[members.size()];
      int i;
      int counter = 0;
      
      for (i = 0; i < members.size(); i++)
      {
         if (members.get(i).getDateOfRegistration().equals(dateOfRegistration)) 
         {
            member[counter] = members.get(i);
            counter ++;
         }
      }

      return member;

   }

   public ArrayList<Member> getAllMembers()
   {
      return members;

   }

   public String toString()
   {
      String list = "";

      for (int i = 0; i < members.size(); i++)
      {
         list = list + members.get(i).toString() + "\n" + "\n";
      }

      return list;
   }

}
