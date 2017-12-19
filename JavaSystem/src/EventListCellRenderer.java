import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 * Class used to control what a JList will display to the user when an Event type object
 *    will be stored in it
 *    
 * @author Stefan Harabagiu
 * 
 */
public class EventListCellRenderer extends DefaultListCellRenderer
{
   public Component getListCellRendererComponent(JList list, Object value,
         int index, boolean isSelected, boolean cellHasFocus)
   {
      if (value instanceof Event)
      {
         value = ((Event) value).getTitle();
      }
      super.getListCellRendererComponent(list, value, index, isSelected,
            cellHasFocus);
      return this;
   }
}
