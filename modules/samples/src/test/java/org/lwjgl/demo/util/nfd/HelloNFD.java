/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.nfd;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.nfd.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.nfd.NativeFileDialog.*;

public final class HelloNFD {

    private HelloNFD() {
    }

    public static void main(String[] args) {
        int    mod;
        String modDescr;
        if (Platform.get() == Platform.MACOSX) {
            mod = GLFW_MOD_SUPER;
            modDescr = "Cmd";
        } else {
            mod = GLFW_MOD_CONTROL;
            modDescr = "Ctrl";
        }

        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        long window = glfwCreateWindow(300, 300, "Hello NativeFileDialog!", NULL, NULL);
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
                case GLFW_KEY_O:
                    if ((mods & mod) != 0) {
                        if ((mods & GLFW_MOD_SHIFT) != 0) {
                            openMulti();
                        } else if ((mods & GLFW_MOD_ALT) != 0) {
                            openFolder();
                        } else {
                            openSingle();
                        }
                    }
                    break;
                case GLFW_KEY_S:
                    if ((mods & mod) != 0) {
                        save();
                    }
                    break;
            }
        });

        // Center window
        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(glfwGetPrimaryMonitor()));
        glfwSetWindowPos(
            window,
            (vidmode.width() - 300) / 2,
            (vidmode.height() - 300) / 2
        );

        glfwMakeContextCurrent(window);
        GL.createCapabilities();

        glfwSwapInterval(1);

        System.out.println("Press " + modDescr + "+O to launch the single file open dialog.");
        System.out.println("Press " + modDescr + "+Shift+O to launch the multi file open dialog.");
        System.out.println("Press " + modDescr + "+Alt+O to launch the folder select dialog.");
        System.out.println("Press " + modDescr + "+S to launch the file save dialog.");

        NFD_Init();

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);
            glfwSwapBuffers(window);
        }

        NFD_Quit();

        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();

        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    private static void openSingle() {
        try (MemoryStack stack = stackPush()) {
            NFDFilterItem.Buffer filters = NFDFilterItem.malloc(2);
            filters.get(0)
                .name(stack.UTF8("Images"))
                .spec(stack.UTF8("png,jpg"));
            filters.get(1)
                .name(stack.UTF8("Documents"))
                .spec(stack.UTF8("doc,pdf,txt"));

            PointerBuffer pp = stack.mallocPointer(1);
            checkResult(
                NFD_OpenDialog(pp, filters, (ByteBuffer)null),
                pp
            );
        }
    }

    private static void openMulti() {
        try (MemoryStack stack = stackPush()) {
            NFDFilterItem.Buffer filters = NFDFilterItem.malloc(2);
            filters.get(0)
                .name(stack.UTF8("Images"))
                .spec(stack.UTF8("png,jpg"));
            filters.get(1)
                .name(stack.UTF8("Documents"))
                .spec(stack.UTF8("doc,pdf,txt"));

            PointerBuffer pp = stack.mallocPointer(1);

            int result = NFD_OpenDialogMultiple(pp, filters, (ByteBuffer)null);
            switch (result) {
                case NFD_OKAY:
                    long pathSet = pp.get(0);

                    NFDPathSetEnum psEnum = NFDPathSetEnum.calloc(stack);
                    NFD_PathSet_GetEnum(pathSet, psEnum);

                    int i = 0;
                    while (NFD_PathSet_EnumNext(psEnum, pp) == NFD_OKAY && pp.get(0) != NULL) {
                        System.out.format("Path %d: %s\n", i++, pp.getStringUTF8(0));
                        NFD_PathSet_FreePath(pp.get(0));
                    }

                    NFD_PathSet_FreeEnum(psEnum);
                    NFD_PathSet_Free(pathSet);
                    break;
                case NFD_CANCEL:
                    System.out.println("User pressed cancel.");
                    break;
                default: // NFD_ERROR
                    System.err.format("Error: %s\n", NFD_GetError());
            }
        }
    }

    private static void openFolder() {
        PointerBuffer outPath = memAllocPointer(1);

        try {
            checkResult(
                NFD_PickFolder(outPath, (ByteBuffer)null),
                outPath
            );
        } finally {
            memFree(outPath);
        }
    }

    private static void save() {
        try (MemoryStack stack = stackPush()) {
            NFDFilterItem.Buffer filters = NFDFilterItem.malloc(2);
            filters.get(0)
                .name(stack.UTF8("Documents"))
                .spec(stack.UTF8("doc,pdf,txt"));
            filters.get(1)
                .name(stack.UTF8("Images"))
                .spec(stack.UTF8("png,jpg"));

            PointerBuffer pp = stack.mallocPointer(1);
            checkResult(
                NFD_SaveDialog(pp, filters, null, "test.txt"),
                pp
            );
        }
    }

    private static void checkResult(int result, PointerBuffer path) {
        switch (result) {
            case NFD_OKAY:
                System.out.println("Success!");
                System.out.println(path.getStringUTF8(0));
                NFD_FreePath(path.get(0));
                break;
            case NFD_CANCEL:
                System.out.println("User pressed cancel.");
                break;
            default: // NFD_ERROR
                System.err.format("Error: %s\n", NFD_GetError());
        }
    }

}