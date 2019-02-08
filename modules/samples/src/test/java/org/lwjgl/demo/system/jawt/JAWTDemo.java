/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.jawt;

import org.lwjgl.glfw.*;
import org.lwjgl.system.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import static org.lwjgl.glfw.GLFW.*;

/** GLFW canvas embedded in AWT using jawt. */
public final class JAWTDemo {

    private JAWTDemo() {
    }

    public static void main(String[] args) {
        if (Platform.get() == Platform.MACOSX) {
            throw new UnsupportedOperationException("This demo cannot run on macOS.");
        }

        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize glfw");
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
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE && e.getID() == KeyEvent.KEY_PRESSED) {
                frame.dispose();

                glfwTerminate();
                Objects.requireNonNull(glfwSetErrorCallback(null)).free();

                return true;
            }

            return false;
        });

        frame.setLayout(new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(new JTextField(), BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

}