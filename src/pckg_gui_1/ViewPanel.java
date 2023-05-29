package pckg_gui_1;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    public ViewPanel() {
        initPanelComps();
        layoutComps();

    }

    private void initPanelComps() {
        textArea = new JTextArea();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
    }




}