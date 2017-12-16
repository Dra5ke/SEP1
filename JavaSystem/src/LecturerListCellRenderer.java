import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class LecturerListCellRenderer extends DefaultListCellRenderer
{
   public Component getListCellRendererComponent(JList list, Object value,
         int index, boolean isSelected, boolean cellHasFocus)
   {
      if (value instanceof Lecturer)
      {
         value = ((Lecturer) value).getName();
      }
      super.getListCellRendererComponent(list, value, index, isSelected,
            cellHasFocus);
      return this;
   }
}
