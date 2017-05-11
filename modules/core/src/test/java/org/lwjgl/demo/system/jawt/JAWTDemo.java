/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.jawt;

import org.lwjgl.system.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** AWT integration demo using jawt. */
public final class JAWTDemo {

    private JAWTDemo() {
    }

    public static void main(String[] args) {
        if (Platform.get() != Platform.WINDOWS) {
            throw new UnsupportedOperationException("This demo can only run on Windows.");
        }

        LWJGLCanvas canvas = new LWJGLCanvas();
        canvas.setSize(640, 480);

        JFrame frame = new JFrame("JAWT Demo");

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                canvas.destroy();
            }
        });

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(e -> {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                frame.dispose();
                return true;
            }

            return false;
        });

        frame.setLayout(new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

}