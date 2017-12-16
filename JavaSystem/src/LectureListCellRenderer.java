import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class LectureListCellRenderer extends DefaultListCellRenderer
{
   public Component getListCellRendererComponent(JList list, Object value,
         int index, boolean isSelected, boolean cellHasFocus)
   {
      if (value instanceof Lecture)
      {
         value = ((Lecture) value).getTitle();
      }
      super.getListCellRendererComponent(list, value, index, isSelected,
            cellHasFocus);
      return this;
   }
}
