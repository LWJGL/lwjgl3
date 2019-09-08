/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.jawt;

import org.lwjgl.demo.opengl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.*;

import static org.lwjgl.demo.system.jawt.EmbeddedFrameUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

/** AWT frame embedded in GLFW using jawt. */
public final class EmbeddedFrameDemo {

    private static boolean focused;

    private static GLXGears gears;

    private EmbeddedFrameDemo() {
    }

    public static void main(String[] args) {
        if (Platform.get() == Platform.MACOSX) {
            Toolkit.getDefaultToolkit();
        }

        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize glfw");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        int WIDTH  = 300;
        int HEIGHT = 300;

        long window = glfwCreateWindow(WIDTH, HEIGHT, "GLFW Gears Demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        int FRAME_WIDTH  = 200;
        int FRAME_HEIGHT = 32;

        Frame ef = embeddedFrameCreate(window);
        System.out.println("Embedded frame implementation: " + ef.getClass());
        //ef.setFocusableWindowState(false);

        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
        ef.add(pane);

        JButton btn = new JButton("JButton");
        btn.addActionListener(e -> System.out.println("Button clicked!"));
        pane.add(btn);

        JTextField text = new JTextField("JTextField", 20);
        pane.add(text);

        glfwSetFramebufferSizeCallback(window, (window1, width, height) -> {
            if (width == 0 || height == 0) {
                return;
            }

            gears.setSize(width, height);

            EventQueue.invokeLater(() -> {
                embeddedFrameSetBounds(ef, width - FRAME_WIDTH, height - FRAME_HEIGHT, FRAME_WIDTH, FRAME_HEIGHT);
                ef.invalidate();
            });
        });
        glfwSetWindowFocusCallback(window, (windowHnd, focused) -> {
            EmbeddedFrameDemo.focused = focused;
            System.out.println("GLFW " + (focused ? "gained" : "lost") + " focus");
        });
        glfwSetMouseButtonCallback(window, (windowHnd, button, action, mods) -> {
            if (!focused) {
                glfwFocusWindow(windowHnd);
            }
        });
        glfwSetKeyCallback(window, (windowHnd, key, scancode, action, mods) -> {
            if (action != GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(windowHnd, true);
                    break;
                default:
                    System.out.println("GLFW key: " + key);
            }
        });

        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        Callback debugProc = GLUtil.setupDebugMessageCallback();

        gears = new GLXGears();

        glfwSetWindowRefreshCallback(window, windowHnd -> {
            gears.render();
            gears.animate();
            glfwSwapBuffers(windowHnd);
        });

        glfwSwapInterval(1);
        glfwShowWindow(window);

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            gears.render();
            gears.animate();

            glfwSwapBuffers(window);
        }

        // clean-up

        CountDownLatch latch = new CountDownLatch(1);

        EventQueue.invokeLater(() -> {
            ef.dispose();
            latch.countDown();
        });

        try {
            // Wait for the frame to be disposed
            while (!latch.await(10, TimeUnit.MILLISECONDS)) {
                glfwPollEvents();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (debugProc != null) {
            debugProc.free();
        }

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);

        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

}