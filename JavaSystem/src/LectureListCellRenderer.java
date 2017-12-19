import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 * Class used to control what a JList will display to the user when a Lecture type object
 *    will be stored in it
 *    
 * @author Stefan Harabagiu
 * 
 */
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
