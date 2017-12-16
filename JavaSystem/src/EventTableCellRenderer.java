import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class EventTableCellRenderer extends DefaultTableCellRenderer
{
   public Component getTableCellRendererComponent(JTable table, Object value,
          boolean isSelected, boolean hasFocus, int row, int column)
   {
      if(value instanceof Event)
      {
         value = ((Event) value).getTitle();
      }
      super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
      return this;
   }
}
