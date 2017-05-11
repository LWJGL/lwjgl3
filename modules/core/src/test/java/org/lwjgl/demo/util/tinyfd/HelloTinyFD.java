/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.tinyfd;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.tinyfd.TinyFileDialogs.*;

public final class HelloTinyFD {

    private HelloTinyFD() {
    }

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        long window = glfwCreateWindow(300, 300, "Hello tiny file dialogs!", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwSetKeyCallback(window, (windowHnd, key, scancode, action, mods) -> {
            if (action == GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(windowHnd, true);
                    break;
                case GLFW_KEY_1:
                    System.out.println("\nOpening message dialog...");
                    System.out.println(tinyfd_messageBox("Please read...", "...this message.", "okcancel", "info", true) ? "OK" : "Cancel");
                    break;
                case GLFW_KEY_2:
                    System.out.println("\nOpening input box dialog...");
                    System.out.println(tinyfd_inputBox("Input Value", "How old are you?", "30"));
                    break;
                case GLFW_KEY_3:
                    System.out.println("\nOpening file open dialog...");
                    System.out.println(tinyfd_openFileDialog("Open File(s)", "", null, null, true));
                    break;
                case GLFW_KEY_4:
                    try (MemoryStack stack = stackPush()) {
                        PointerBuffer aFilterPatterns = stack.mallocPointer(2);

                        aFilterPatterns.put(stack.UTF8("*.jpg"));
                        aFilterPatterns.put(stack.UTF8("*.png"));

                        aFilterPatterns.flip();

                        System.out.println("\nOpening file save dialog...");
                        System.out.println(tinyfd_saveFileDialog("Save Image", "", aFilterPatterns, "Image files (*.jpg, *.png)"));
                    }
                    break;
                case GLFW_KEY_5:
                    System.out.println("\nOpening folder select dialog...");
                    System.out.println(tinyfd_selectFolderDialog("Select Folder", ""));
                    break;
                case GLFW_KEY_6:
                    System.out.println("\nOpening color chooser dialog...");
                    try (MemoryStack stack = stackPush()) {
                        ByteBuffer color = stack.malloc(3);
                        String     hex   = tinyfd_colorChooser("Choose Color", "#FF00FF", null, color);
                        System.out.println(hex);
                        if (hex != null) {
                            System.out.println("\tR: " + (color.get(0) & 0xFF));
                            System.out.println("\tG: " + (color.get(1) & 0xFF));
                            System.out.println("\tB: " + (color.get(2) & 0xFF));
                        }
                    }
                    break;
            }
        });

        // Center window
        GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        glfwSetWindowPos(
            window,
            (vidmode.width() - 300) / 2,
            (vidmode.height() - 300) / 2
        );

        glfwMakeContextCurrent(window);
        GL.createCapabilities();

        glfwSwapInterval(1);

        tinyfd_messageBox("tinyfd_query", "", "ok", "info", true);
        System.out.println("tiny file dialogs " + tinyfd_version + " (" + tinyfd_response() + ")");
        System.out.println("Press 1 to launch a message dialog.");
        System.out.println("Press 2 to launch an input box fialog.");
        System.out.println("Press 3 to launch a file open dialog.");
        System.out.println("Press 4 to launch a file save dialog.");
        System.out.println("Press 5 to launch a folder select dialog.");
        System.out.println("Press 6 to launch a color chooser dialog.");
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);
            glfwSwapBuffers(window);
        }

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();

        glfwSetErrorCallback(null).free();
    }

}