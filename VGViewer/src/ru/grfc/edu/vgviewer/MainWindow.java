/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.grfc.edu.vgviewer;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author chvl
 */
public class MainWindow extends Frame {

    public MainWindow() {
        super();
        WindowListener listeren = new MainWindowListeren();
        addWindowListener(listeren);
    }

    public class MainWindowListeren extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    }
}