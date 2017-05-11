/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.stb;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.glfw.GLFWUtil.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.MemoryUtil.*;

/** STB Image demo. */
public final class Image {

    private final ByteBuffer image;

    private final int w;
    private final int h;
    private final int comp;

    private long window;
    private int ww = 800;
    private int wh = 600;

    private boolean ctrlDown;

    private int scale;

    private Callback debugProc;

    private Image(String imagePath) {
        ByteBuffer imageBuffer;
        try {
            imageBuffer = ioResourceToByteBuffer(imagePath, 8 * 1024);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        IntBuffer w    = BufferUtils.createIntBuffer(1);
        IntBuffer h    = BufferUtils.createIntBuffer(1);
        IntBuffer comp = BufferUtils.createIntBuffer(1);

        // Use info to read image metadata without decoding the entire image.
        // We don't need this for this demo, just testing the API.
        if (!stbi_info_from_memory(imageBuffer, w, h, comp)) {
            throw new RuntimeException("Failed to read image information: " + stbi_failure_reason());
        }

        System.out.println("Image width: " + w.get(0));
        System.out.println("Image height: " + h.get(0));
        System.out.println("Image components: " + comp.get(0));
        System.out.println("Image HDR: " + stbi_is_hdr_from_memory(imageBuffer));

        // Decode the image
        image = stbi_load_from_memory(imageBuffer, w, h, comp, 0);
        if (image == null) {
            throw new RuntimeException("Failed to load image: " + stbi_failure_reason());
        }

        this.w = w.get(0);
        this.h = h.get(0);
        this.comp = comp.get(0);
    }

    public static void main(String[] args) {
        String imagePath;
        if (args.length == 0) {
            System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.Image -Dargs=<path>' to load a different image.\n");
            imagePath = "lwjgl32.png";
        } else {
            imagePath = args[0];
        }
        new Image(imagePath).run();
    }

    private void run() {
        try {
            init();

            loop();
        } finally {
            try {
                destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void windowSizeChanged(long window, int width, int height) {
        this.ww = width;
        this.wh = height;

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0.0, width, height, 0.0, -1.0, 1.0);
        glMatrixMode(GL_MODELVIEW);
    }

    private static void framebufferSizeChanged(long window, int width, int height) {
        glViewport(0, 0, width, height);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 2);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1);

        this.window = glfwCreateWindow(ww, wh, "STB Image Demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwSetWindowSizeCallback(window, this::windowSizeChanged);
        glfwSetFramebufferSizeCallback(window, Image::framebufferSizeChanged);

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            ctrlDown = (mods & GLFW_MOD_CONTROL) != 0;
            if (action == GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
                case GLFW_KEY_KP_ADD:
                case GLFW_KEY_EQUAL:
                    setScale(scale + 1);
                    break;
                case GLFW_KEY_KP_SUBTRACT:
                case GLFW_KEY_MINUS:
                    setScale(scale - 1);
                    break;
                case GLFW_KEY_0:
                case GLFW_KEY_KP_0:
                    if (ctrlDown) {
                        setScale(0);
                    }
                    break;
            }
        });

        glfwSetScrollCallback(window, (window, xoffset, yoffset) -> {
            if (ctrlDown) {
                setScale(scale + (int)yoffset);
            }
        });

        // Center window
        GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

        glfwSetWindowPos(
            window,
            (vidmode.width() - ww) / 2,
            (vidmode.height() - wh) / 2
        );

        // Create context
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        debugProc = GLUtil.setupDebugMessageCallback();

        glfwSwapInterval(1);
        glfwShowWindow(window);

        glfwInvoke(window, this::windowSizeChanged, Image::framebufferSizeChanged);
    }

    private void setScale(int scale) {
        this.scale = max(-3, scale);
    }

    private void loop() {
        int texID = glGenTextures();

        glBindTexture(GL_TEXTURE_2D, texID);

        if (comp == 3) {
            if ((w & 3) != 0) {
                glPixelStorei(GL_UNPACK_ALIGNMENT, 2 - (w & 1));
            }
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, w, h, 0, GL_RGB, GL_UNSIGNED_BYTE, image);
        } else {
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, w, h, 0, GL_RGBA, GL_UNSIGNED_BYTE, image);

            glEnable(GL_BLEND);
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }

        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);

        glEnable(GL_TEXTURE_2D);

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);

            float scaleFactor = 1.0f + scale * 0.25f;

            glPushMatrix();
            glScalef(scaleFactor, scaleFactor, 1f);

            glBegin(GL_QUADS);
            {
                glTexCoord2f(0.0f, 0.0f);
                glVertex2f(0.0f, 0.0f);

                glTexCoord2f(1.0f, 0.0f);
                glVertex2f(w, 0.0f);

                glTexCoord2f(1.0f, 1.0f);
                glVertex2f(w, h);

                glTexCoord2f(0.0f, 1.0f);
                glVertex2f(0.0f, h);
            }
            glEnd();

            glPopMatrix();

            glfwSwapBuffers(window);
        }

        glDisable(GL_TEXTURE_2D);
    }

    private void destroy() {
        stbi_image_free(image);

        if (debugProc != null) {
            debugProc.free();
        }

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

}