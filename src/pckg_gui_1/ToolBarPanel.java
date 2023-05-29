package pckg_gui_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel {

    private JButton clearButton;
    private JButton readFileButton;
    private ToolBarListener toolBarListener;


    public ToolBarPanel() {
        initPanelComps();
        layoutComps();
        activateComps();

    }


    private void initPanelComps() {
        clearButton = new JButton("Clear All!");
        readFileButton = new JButton("Read File!");
    }


    private void layoutComps() {
        add(clearButton);
        add(readFileButton);
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    public void activateComps() {
        if (toolBarListener != null) {
            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ToolBarEvent tbe = new ToolBarEvent(this);
//                    tbe.setClearButtonClicked(true);
//                    tbe.setReadFileButtonClicked(false);
                    toolBarListener.clearButtonEventOccurred(tbe);
                }
            });
            readFileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ToolBarEvent tbe = new ToolBarEvent(this);
                    //tbe.setReadFileButtonClicked(true);
                    //tbe.setClearButtonClicked(false);
                    toolBarListener.readFileButtonEventOccurred(tbe);
                }
            });
        }
    }
}
