import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class MemberListCellRenderer extends DefaultListCellRenderer
{
   public Component getListCellRendererComponent(JList list, Object value,
         int index, boolean isSelected, boolean cellHasFocus)
   {
      if (value instanceof Member)
      {
         value = ((Member) value).getName();
      }
      super.getListCellRendererComponent(list, value, index, isSelected,
            cellHasFocus);
      return this;
   }
}
