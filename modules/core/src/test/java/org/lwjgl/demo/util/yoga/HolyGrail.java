/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.yoga;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.yoga.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBEasyFont.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.yoga.Yoga.*;

/** Yoga implementation of the Holy Grail layout. Ported from: <a href="https://codepen.io/Praseetha-KR/pen/rJqEL">Holy Grail Layout with Flexbox</a>. */
public final class HolyGrail {

    private final Callback debugProc;

    private final long window;

    private final ByteBuffer charBuffer;

    private final long root;

    private final long header;
    private final long footer;

    private final long container;

    private final long navbar;
    private final long article;
    private final long sidebar;

    private int width  = 1280;
    private int height = 720;

    private HolyGrail() {
        // ----------------------
        //          GLFW
        // ----------------------
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize glfw");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        long window = glfwCreateWindow(width, height, "Holy Grail layout with Yoga", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        long        monitor = glfwGetPrimaryMonitor();
        GLFWVidMode vidmode = glfwGetVideoMode(monitor);

        // Center window
        glfwSetWindowPos(
            window,
            (vidmode.width() - width) / 2,
            (vidmode.height() - height) / 2
        );

        glfwSetKeyCallback(window, this::keyTriggered);

        glfwSetWindowSizeCallback(window, this::windowSizeChanged);

        glfwSetWindowRefreshCallback(window, windowHnd -> {
            renderLoop();
            glfwSwapBuffers(windowHnd);
        });

        // ----------------------
        //          OpenGL
        // ----------------------

        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        debugProc = GLUtil.setupDebugMessageCallback();

        glfwSwapInterval(1);

        charBuffer = BufferUtils.createByteBuffer(256 * 270);

        glEnableClientState(GL_VERTEX_ARRAY);
        glVertexPointer(2, GL_FLOAT, 16, charBuffer);

        // ----------------------
        //          Yoga
        // ----------------------

        MemoryAllocator memFuncs = MemoryUtil.getAllocator();
        nYGSetMemoryFuncs(
            memFuncs.getMalloc(),
            memFuncs.getCalloc(),
            memFuncs.getRealloc(),
            memFuncs.getFree()
        );

        root = YGNodeNew();
        YGNodeStyleSetFlexDirection(root, YGFlexDirectionColumn);

        header = YGNodeNew();
        container = YGNodeNew();
        footer = YGNodeNew();

        YGNodeStyleSetHeight(header, 100.0f);
        YGNodeStyleSetFlex(container, 1.0f);
        YGNodeStyleSetHeight(footer, 40.0f);

        YGNodeInsertChild(root, header, 0);
        YGNodeInsertChild(root, container, 1);
        YGNodeInsertChild(root, footer, 2);

        navbar = YGNodeNew();
        article = YGNodeNew();
        sidebar = YGNodeNew();

        YGNodeStyleSetFlex(navbar, 1.0f);
        YGNodeStyleSetFlex(article, 3.0f);
        YGNodeStyleSetFlex(sidebar, 1.0f);

        YGNodeInsertChild(container, navbar, 0);
        YGNodeInsertChild(container, article, 1);
        YGNodeInsertChild(container, sidebar, 2);

        // Show window
        windowSizeChanged(window, width, height);
        glfwShowWindow(window);
        this.window = window;
    }

    private void keyTriggered(long window, int key, int scancode, int action, int mods) {
        if (action != GLFW_RELEASE) {
            return;
        }

        switch (key) {
            case GLFW_KEY_ESCAPE:
                glfwSetWindowShouldClose(window, true);
                break;
            case GLFW_KEY_D:
                YGNodeStyleSetDirection(root, YGNodeStyleGetDirection(root) == YGDirectionRTL ? YGDirectionLTR : YGDirectionRTL);
                YGNodeCalculateLayout(root, width, height, YGFlexDirectionColumn);
                break;
        }
    }

    private void windowSizeChanged(long window, int width, int height) {
        this.width = width;
        this.height = height;

        glViewport(0, 0, width, height);

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0.0, width, height, 0.0, -1.0, 1.0);
        glMatrixMode(GL_MODELVIEW);

        // Toggle mobile/desktop layout when the threshold is passed
        if (width <= 480) {
            if (YGNodeStyleGetFlexDirection(container) == YGFlexDirectionRow) {
                toggleLayout(article, navbar, YGFlexDirectionColumn);
            }
        } else if (YGNodeStyleGetFlexDirection(container) == YGFlexDirectionColumn) {
            toggleLayout(navbar, article, YGFlexDirectionRow);
        }

        YGNodeCalculateLayout(root, width, height, YGFlexDirectionColumn);
    }

    private void toggleLayout(long first, long second, int direction) {
        YGNodeRemoveChild(container, first);
        YGNodeRemoveChild(container, second);
        YGNodeInsertChild(container, first, 0);
        YGNodeInsertChild(container, second, 1);
        YGNodeStyleSetFlexDirection(container, direction);
    }

    private void run() {
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            renderLoop();

            glfwSwapBuffers(window);
        }

        destroy();
    }

    private void renderLoop() {
        renderNode(header, 0xFFFFFFFF, "Header");
        {
            glPushMatrix();
            glTranslatef(YGNodeLayoutGetLeft(container), YGNodeLayoutGetTop(container), 0.0f);
            renderNode(navbar, 0xBCD39BFF, "Navbar contents\n( Box 2 )");
            renderNode(article, 0xCE9B64FF, "Article contents\n( Box 1 )");
            renderNode(sidebar, 0x62626DFF, "Sidebar contents\n( Box 3 )");
            glPopMatrix();
        }
        renderNode(footer, 0xFFFFFFFF, "Footer");
    }

    private void renderNode(long node, int color, String title) {
        glColor3f(
            ((color >> 24) & 255) / 255.0f,
            ((color >> 16) & 255) / 255.0f,
            ((color >> 8) & 255) / 255.0f
        );

		/* Public API with 4x JNI call overhead
        float l = YGNodeLayoutGetLeft(node);
		float t = YGNodeLayoutGetTop(node);
		float w = YGNodeLayoutGetWidth(node);
		float h = YGNodeLayoutGetHeight(node);
		*/

        // Internal API without overhead (plain memory accesses, assuming allocations are eliminated via EA)
        YGLayout layout = YGNode.create(node).layout();

        float l = layout.positions(YGEdgeLeft);
        float t = layout.positions(YGEdgeTop);
        float w = layout.dimensions(YGDimensionWidth);
        float h = layout.dimensions(YGDimensionHeight);

        glBegin(GL_QUADS);
        glVertex2f(l, t);
        glVertex2f(l, t + h);
        glVertex2f(l + w, t + h);
        glVertex2f(l + w, t);
        glEnd();

        glColor3f(0.0f, 0.0f, 0.0f);

        glPushMatrix();
        glTranslatef(l + 8, t + 8, 0.0f);
        glScalef(2.0f, 2.0f, 1.0f);
        glDrawArrays(GL_QUADS, 0, stb_easy_font_print(0, 0, title, null, charBuffer) * 4);
        glPopMatrix();
    }

    private void destroy() {
        YGNodeFree(sidebar);
        YGNodeFree(article);
        YGNodeFree(navbar);

        YGNodeFree(footer);
        YGNodeFree(container);
        YGNodeFree(header);

        YGNodeFree(root);

        if (debugProc != null) {
            debugProc.free();
        }

        if (window != NULL) {
            glfwFreeCallbacks(window);
            glfwDestroyWindow(window);
        }

        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public static void main(String[] args) {
        new HolyGrail().run();
    }

}