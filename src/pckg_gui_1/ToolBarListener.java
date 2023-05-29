package pckg_gui_1;

import java.util.EventListener;

public interface ToolBarListener extends EventListener {

    void clearButtonEventOccurred(ToolBarEvent tbe);
    void readFileButtonEventOccurred(ToolBarEvent tbe);
}
