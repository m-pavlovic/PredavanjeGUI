package pckg_gui_1;

import javax.swing.*;

public class BottomPanel extends JPanel {

    private JButton button;

    public BottomPanel() {
        initPanelComps();
        layoutComps();
    }

    private void initPanelComps() {
        button = new JButton("Click me!");
    }

    private void layoutComps() {
        add(button);
    }
}
