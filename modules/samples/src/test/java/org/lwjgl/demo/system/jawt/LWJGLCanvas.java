/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.jawt;

import org.lwjgl.demo.opengl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;
import org.lwjgl.system.jawt.JAWT;
import org.lwjgl.system.jawt.*;

import java.awt.*;
import java.awt.event.*;
import java.nio.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWNativeWin32.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jawt.JAWTFunctions.*;

/**
 * A Canvas component that uses OpenGL for rendering.
 *
 * <p>This implementation supports Windows only.</p>
 */
@SuppressWarnings("serial")
public class LWJGLCanvas extends Canvas {

    private final JAWT awt;

    private JAWTDrawingSurface ds;

    private final AbstractGears gears;

    private long    glfwWindow;
    private boolean resized;

    private GLCapabilities caps;

    public LWJGLCanvas() {
        awt = JAWT.calloc();
        awt.version(JAWT_VERSION_1_4);
        if (!JAWT_GetAWT(awt)) {
            throw new IllegalStateException("GetAWT failed");
        }

        gears = new AbstractGears();

        // AWT event listeners are invoked in the EDT

        addComponentListener(new ComponentAdapter() {
            @Override public void componentResized(ComponentEvent e) {
                System.out.println(e);
                resized = true;
                if (glfwWindow != NULL) {
                    render();
                }
            }
            @Override public void componentMoved(ComponentEvent e) {
                System.out.println(e);
            }
            @Override public void componentShown(ComponentEvent e) {
                System.out.println(e);
            }
            @Override public void componentHidden(ComponentEvent e) {
                System.out.println(e);
            }
        });
        addFocusListener(new FocusListener() {
            @Override public void focusGained(FocusEvent e) {
                System.out.println(e);
            }
            @Override public void focusLost(FocusEvent e) {
                System.out.println(e);
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override public void keyPressed(KeyEvent e) {
                System.out.println(e);
            }
            @Override public void keyTyped(KeyEvent e) {
                System.out.println(e);
            }
            @Override public void keyReleased(KeyEvent e) {
                System.out.println(e);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mousePressed(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mouseReleased(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mouseEntered(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mouseExited(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println(e);
            }
            @Override public void mouseDragged(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mouseMoved(MouseEvent e) {
                System.out.println(e);
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override public void mouseDragged(MouseEvent e) {
                System.out.println(e);
            }
            @Override public void mouseMoved(MouseEvent e) {
                System.out.println(e);
            }
        });
        addMouseWheelListener(System.out::println);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {
        render();
        repaint();
    }

    private void render() {
        if (ds == null) {
            // Get the drawing surface
            ds = JAWT_GetDrawingSurface(awt.GetDrawingSurface(), this);
            if (ds == null) {
                throw new IllegalStateException("awt->GetDrawingSurface() failed");
            }
        }

        // Lock the drawing surface
        int lock = JAWT_DrawingSurface_Lock(ds.Lock(), ds);
        if ((lock & JAWT_LOCK_ERROR) != 0) {
            throw new IllegalStateException("ds->Lock() failed");
        }

        try {
            // Get the drawing surface info
            JAWTDrawingSurfaceInfo dsi = JAWT_DrawingSurface_GetDrawingSurfaceInfo(ds.GetDrawingSurfaceInfo(), ds);
            if (dsi == null) {
                throw new IllegalStateException("ds->GetDrawingSurfaceInfo() failed");
            }

            try {
                // Get the platform-specific drawing info
                JAWTWin32DrawingSurfaceInfo dsi_win = JAWTWin32DrawingSurfaceInfo.create(dsi.platformInfo());

                long hdc = dsi_win.hdc();
                if (hdc != NULL) {
                    // The render method is invoked in the EDT
                    if (glfwWindow == NULL) {
                        // glfwWindowHint can be used here to configure the GL context
                        glfwWindow = glfwAttachWin32Window(dsi_win.hwnd(), NULL);
                        if (glfwWindow == NULL) {
                            throw new IllegalStateException("Failed to attach win32 window.");
                        }

                        // Any callbacks registered here will work. But care must be taken because
                        // the callbacks are NOT invoked in the EDT, but in an AWT thread that
                        // does the event polling. Many GLFW functions that require main thread
                        // invocation, should only be called in that thread.

                        // Because of how input focus is implemented in AWT, it is recommended that AWT
                        // KeyListeners are always used for keyboard input.

                        glfwMakeContextCurrent(glfwWindow);
                        caps = GL.createCapabilities();

                        gears.initGLState();
                        resized = true;
                    } else {
                        glfwMakeContextCurrent(glfwWindow);
                        GL.setCapabilities(caps);
                    }

                    if (resized) {
                        try (MemoryStack stack = stackPush()) {
                            IntBuffer pw = stack.mallocInt(1);
                            IntBuffer ph = stack.mallocInt(1);

                            glfwGetFramebufferSize(glfwWindow, pw, ph);

                            glViewport(0, 0, pw.get(0), ph.get(0));

                            float f = ph.get(0) / (float)pw.get(0);

                            glMatrixMode(GL_PROJECTION);
                            glLoadIdentity();
                            glFrustum(-1.0f, 1.0f, -f, f, 5.0f, 100.0f);
                            glMatrixMode(GL_MODELVIEW);
                        }

                        resized = false;
                    }

                    gears.renderLoop();
                    glfwSwapBuffers(glfwWindow);

                    glfwMakeContextCurrent(NULL);
                    GL.setCapabilities(null);
                }
            } finally {
                // Free the drawing surface info
                JAWT_DrawingSurface_FreeDrawingSurfaceInfo(ds.FreeDrawingSurfaceInfo(), dsi);
            }
        } finally {
            // Unlock the drawing surface
            JAWT_DrawingSurface_Unlock(ds.Unlock(), ds);
        }
    }

    public void destroy() {
        // Free the drawing surface
        JAWT_FreeDrawingSurface(awt.FreeDrawingSurface(), ds);

        awt.free();

        if (glfwWindow != NULL) {
            glfwDestroyWindow(glfwWindow);
        }
    }

}