/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.stb;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.glfw.GLFWUtil.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL12.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.stb.STBImageResize.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** STB Image demo. */
public final class Image {

    private final ByteBuffer image;

    private final int w;
    private final int h;
    private final int comp;

    private long window;
    private int  ww;
    private int  wh;

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

        try (MemoryStack stack = stackPush()) {
            IntBuffer w    = stack.mallocInt(1);
            IntBuffer h    = stack.mallocInt(1);
            IntBuffer comp = stack.mallocInt(1);

            // Use info to read image metadata without decoding the entire image.
            // We don't need this for this demo, just testing the API.
            if (!stbi_info_from_memory(imageBuffer, w, h, comp)) {
                throw new RuntimeException("Failed to read image information: " + stbi_failure_reason());
            } else {
                System.out.println("OK with reason: " + stbi_failure_reason());
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

        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(glfwGetPrimaryMonitor()));

        ww = max(800, min(w, vidmode.width() - 160));
        wh = max(600, min(h, vidmode.height() - 120));

        this.window = glfwCreateWindow(ww, wh, "STB Image Demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        // Center window
        glfwSetWindowPos(
            window,
            (vidmode.width() - ww) / 2,
            (vidmode.height() - wh) / 2
        );

        glfwSetWindowRefreshCallback(window, window -> render());
        glfwSetWindowSizeCallback(window, this::windowSizeChanged);
        glfwSetFramebufferSizeCallback(window, Image::framebufferSizeChanged);

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            switch (key) {
                case GLFW_KEY_LEFT_CONTROL:
                case GLFW_KEY_RIGHT_CONTROL:
                    ctrlDown = action != GLFW_RELEASE;
            }

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

        // Create context
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        debugProc = GLUtil.setupDebugMessageCallback();

        glfwSwapInterval(1);
        glfwShowWindow(window);

        glfwInvoke(window, this::windowSizeChanged, Image::framebufferSizeChanged);
    }

    private void setScale(int scale) {
        this.scale = max(-9, scale);
    }

    private void premultiplyAlpha() {
        int stride = w * 4;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int i = y * stride + x * 4;

                float alpha = (image.get(i + 3) & 0xFF) / 255.0f;
                image.put(i + 0, (byte)round(((image.get(i + 0) & 0xFF) * alpha)));
                image.put(i + 1, (byte)round(((image.get(i + 1) & 0xFF) * alpha)));
                image.put(i + 2, (byte)round(((image.get(i + 2) & 0xFF) * alpha)));
            }
        }
    }

    private int createTexture() {
        int texID = glGenTextures();

        glBindTexture(GL_TEXTURE_2D, texID);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);

        int format;
        if (comp == 3) {
            if ((w & 3) != 0) {
                glPixelStorei(GL_UNPACK_ALIGNMENT, 2 - (w & 1));
            }
            format = GL_RGB;
        } else {
            premultiplyAlpha();

            glEnable(GL_BLEND);
            glBlendFunc(GL_ONE, GL_ONE_MINUS_SRC_ALPHA);

            format = GL_RGBA;
        }

        glTexImage2D(GL_TEXTURE_2D, 0, format, w, h, 0, format, GL_UNSIGNED_BYTE, image);

        ByteBuffer input_pixels = image;
        int        input_w      = w;
        int        input_h      = h;
        int        mipmapLevel  = 0;
        while (1 < input_w || 1 < input_h) {
            int output_w = Math.max(1, input_w >> 1);
            int output_h = Math.max(1, input_h >> 1);

            ByteBuffer output_pixels = memAlloc(output_w * output_h * comp);
            stbir_resize_uint8_generic(
                input_pixels, input_w, input_h, input_w * comp,
                output_pixels, output_w, output_h, output_w * comp,
                comp, comp == 4 ? 3 : STBIR_ALPHA_CHANNEL_NONE, STBIR_FLAG_ALPHA_PREMULTIPLIED,
                STBIR_EDGE_CLAMP,
                STBIR_FILTER_MITCHELL,
                STBIR_COLORSPACE_SRGB
            );

            if (mipmapLevel == 0) {
                stbi_image_free(image);
            } else {
                memFree(input_pixels);
            }

            glTexImage2D(GL_TEXTURE_2D, ++mipmapLevel, format, output_w, output_h, 0, format, GL_UNSIGNED_BYTE, output_pixels);

            input_pixels = output_pixels;
            input_w = output_w;
            input_h = output_h;
        }
        if (mipmapLevel == 0) {
            stbi_image_free(image);
        } else {
            memFree(input_pixels);
        }

        return texID;
    }

    private void loop() {
        int texID = createTexture();

        glEnable(GL_TEXTURE_2D);
        glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f);

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();
            render();
        }

        glDisable(GL_TEXTURE_2D);
        glDeleteTextures(texID);
    }

    private void render() {
        glClear(GL_COLOR_BUFFER_BIT);

        float scaleFactor = 1.0f + scale * 0.1f;

        glPushMatrix();
        glTranslatef(ww * 0.5f, wh * 0.5f, 0.0f);
        glScalef(scaleFactor, scaleFactor, 1f);
        glTranslatef(-w * 0.5f, -h * 0.5f, 0.0f);

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

    private void destroy() {
        GL.setCapabilities(null);

        if (debugProc != null) {
            debugProc.free();
        }

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

}