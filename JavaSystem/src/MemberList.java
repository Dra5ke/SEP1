import java.util.ArrayList;

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
         if (members.get(i).getName() == name) 
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

   public Member[] getMember(Date ofRegistration)
   {
      Member[] member;
      member = new Member[members.size()];
      int i;
      int counter = 0;
      
      for (i = 0; i < members.size(); i++)
      {
         if (members.get(i).getDateOfRegistration().equals(ofRegistration)) 
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
