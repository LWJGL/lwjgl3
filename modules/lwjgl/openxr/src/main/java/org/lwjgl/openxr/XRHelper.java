/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import org.lwjgl.system.linux.*;
import org.lwjgl.system.windows.*;

import java.nio.*;

import static org.lwjgl.glfw.GLFWNativeGLX.*;
import static org.lwjgl.glfw.GLFWNativeWGL.*;
import static org.lwjgl.glfw.GLFWNativeWayland.*;
import static org.lwjgl.glfw.GLFWNativeWin32.*;
import static org.lwjgl.glfw.GLFWNativeX11.*;
import static org.lwjgl.opengl.GLX13.*;
import static org.lwjgl.openxr.XR10.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A helper class with some static methods to help applications with OpenXR related tasks that are cumbersome in
 * some way.
 */
public class XRHelper {

    private static ByteBuffer mallocAndFillBufferStack(MemoryStack stack, int capacity, int sizeof, int type) {
        ByteBuffer b = stack.malloc(capacity * sizeof);

        for (int i = 0; i < capacity; i++) {
            b.position(i * sizeof);
            b.putInt(type);
        }
        b.rewind();
        return b;
    }

    /**
     * Allocates an {@link XrApiLayerProperties.Buffer} onto the given stack with the given number of layers and
     * sets the type of each element in the Buffer to XR_TYPE_API_LAYER_PROPERTIES.
     *
     * Note: you can't use the Buffer after the stack is gone!
     * @param stack The stack to allocate the Buffer on
     * @param numLayers The number of elements the Buffer should get
     * @return The created Buffer
     */
    public static XrApiLayerProperties.Buffer prepareApiLayerProperties(MemoryStack stack, int numLayers) {
        return new XrApiLayerProperties.Buffer(
            mallocAndFillBufferStack(stack, numLayers, XrApiLayerProperties.SIZEOF, XR_TYPE_API_LAYER_PROPERTIES)
        );
    }

    /**
     * Allocates an {@link XrExtensionProperties.Buffer} onto the given stack with the given number of extensions
     * and sets the type of each element in the Buffer to XR_TYPE_EXTENSION_PROPERTIES.
     *
     * Note: you can't use the Buffer after the stack is gone!
     * @param stack The stack onto which to allocate the Buffer
     * @param numExtensions The number of elements the Buffer should get
     * @return The created Buffer
     */
    public static XrExtensionProperties.Buffer prepareExtensionProperties(MemoryStack stack, int numExtensions) {
        return new XrExtensionProperties.Buffer(
            mallocAndFillBufferStack(stack, numExtensions, XrExtensionProperties.SIZEOF, XR_TYPE_EXTENSION_PROPERTIES)
        );
    }

    /**
     * Allocates a {@link FloatBuffer} onto the given stack and fills it such that it can be used as parameter
     * to the <b>set</b> method of <b>Matrix4f</b>. The buffer will be filled such that it represents a projection
     * matrix with the given <b>fov</b>, <b>nearZ</b> (a.k.a. near plane), <b>farZ</b> (a.k.a. far plane).
     * @param stack The stack onto which the buffer should be allocated
     * @param fov The desired Field of View for the projection matrix. You should normally use the value of
     *            {@link XrCompositionLayerProjectionView#fov}.
     * @param nearZ The nearest Z value that the user should see (also known as the near plane)
     * @param farZ The furthest Z value that the user should see (also known as far plane)
     * @param zZeroToOne True if the z-axis of the coordinate system goes from 0 to 1 (Vulkan).
     *                   False if the z-axis of the coordinate system goes from -1 to 1 (OpenGL).
     * @return A {@link FloatBuffer} that contains the matrix data of the desired projection matrix. Use the
     * <b>set</b> method of a <b>Matrix4f</b> instance to copy the buffer values to that matrix.
     */
    public static FloatBuffer createProjectionMatrixBuffer(
        MemoryStack stack, XrFovf fov, float nearZ, float farZ, boolean zZeroToOne
    ) {
        float tanLeft        = (float)Math.tan(fov.angleLeft());
        float tanRight       = (float)Math.tan(fov.angleRight());
        float tanDown        = (float)Math.tan(fov.angleDown());
        float tanUp          = (float)Math.tan(fov.angleUp());
        float tanAngleWidth  = tanRight - tanLeft;
        float tanAngleHeight;
        if (zZeroToOne) {
            tanAngleHeight = tanDown - tanUp;
        } else {
            tanAngleHeight = tanUp - tanDown;
        }

        FloatBuffer m = stack.mallocFloat(16);
        m.put(0, 2.0f / tanAngleWidth);
        m.put(4, 0.0f);
        m.put(8, (tanRight + tanLeft) / tanAngleWidth);
        m.put(12, 0.0f);

        m.put(1, 0.0f);
        m.put(5, 2.0f / tanAngleHeight);
        m.put(9, (tanUp + tanDown) / tanAngleHeight);
        m.put(13, 0.0f);

        m.put(2, 0.0f);
        m.put(6, 0.0f);
        if (zZeroToOne) {
            m.put(10, -farZ / (farZ - nearZ));
            m.put(14, -(farZ * nearZ) / (farZ - nearZ));
        } else {
            m.put(10, -(farZ + nearZ) / (farZ - nearZ));
            m.put(14, -(farZ * (nearZ + nearZ)) / (farZ - nearZ));
        }

        m.put(3, 0.0f);
        m.put(7, 0.0f);
        m.put(11, -1.0f);
        m.put(15, 0.0f);

        return m;
    }

    /**
     * <p>
     * Allocates a <b>XrGraphicsBindingOpenGL**</b> struct for the current platform onto the given stack. It should
     * be included in the next-chain of the {@link XrSessionCreateInfo} that will be used to create an
     * OpenXR session with OpenGL rendering. (Every platform requires a different OpenGL graphics binding
     * struct, so this method spares users the trouble of working with all these cases themselves.)
     * </p>
     *
     * <p>
     * Note: {@link XR10#xrCreateSession} must be called <b>before</b> the given stack is dropped!
     * </p>
     *
     * <p>
     * Note: Linux support is not finished, so only Windows works at the moment. This should be fixed in the
     * future. Until then, Vulkan is the only cross-platform rendering API for the OpenXR Java bindings.
     * </p>
     * @param stack The stack onto which to allocate the graphics binding struct
     * @param window The GLFW window handle used to create the OpenGL context
     * @return A XrGraphicsBindingOpenGL** struct that can be used to create a session
     * @throws IllegalStateException If the current platform is not supported
     */
    public static Struct createGraphicsBindingOpenGL(MemoryStack stack, long window) throws IllegalStateException {
        switch (Platform.get()) {
            case LINUX:

                // Test which windowing system is used
                boolean supportsWayland = false;
                boolean supportsX11 = false;
                try {
                    glfwGetWaylandDisplay();
                    supportsWayland = true;
                } catch (ExceptionInInitializerError noWayland) {
                    // I don't know a better way to test this
                }
                try {
                    glfwGetX11Display();
                    supportsX11 = true;
                } catch (ExceptionInInitializerError noX11) {
                    // I don't know a better way to test this
                }

                /*
                 * NOTE: X11 is preferred over Wayland because Monado, the most promising Linux OpenXR runtime,
                 * doesn't handle XrGraphicsBindingOpenGLWaylandKHR at the moment. See
                 * https://gitlab.freedesktop.org/monado/monado/-/issues/128 for the current status on this.
                 */
                if (supportsX11) {
                    XrGraphicsBindingOpenGLXlibKHR graphicsBinding = XrGraphicsBindingOpenGLXlibKHR.mallocStack(stack);
                    long display = glfwGetX11Display();

                    /*
                     * To continue, we need the GLXFBConfig that was used to create the GLFW window. Unfortunately,
                     * GLFW doesn't expose this to us. I created a pull request for this:
                     * https://github.com/glfw/glfw/pull/1925
                     * Linux X11 support will be blocked until it is merged. When it is merged, the GLFW bindings of
                     * GLFW will need to be updated as well.
                     */
                    long glxConfig = -1;
                    // long glxConfig = glfwGetGLXFBConfig();

                    if (glxConfig == -1) {
                        throw new IllegalStateException("Linux X11 support is not finished");
                    }

                    XVisualInfo visualInfo = glXGetVisualFromFBConfig(display, glxConfig);
                    if (visualInfo == null) {
                        throw new IllegalStateException("Failed to get visual info");
                    }
                    long visualid = visualInfo.visualid();
                    graphicsBinding.set(
                        KHROpenglEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR,
                        NULL,
                        display,
                        (int) visualid,
                        glxConfig,
                        glXGetCurrentDrawable(),
                        glfwGetGLXContext(window)
                    );
                    return graphicsBinding;
                } else if (supportsWayland) {
                    XrGraphicsBindingOpenGLWaylandKHR graphicsBinding = XrGraphicsBindingOpenGLWaylandKHR.mallocStack(stack);
                    graphicsBinding.set(
                        KHROpenglEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR,
                        NULL,
                        glfwGetWaylandDisplay()
                    );
                    return graphicsBinding;
                } else {
                    throw new IllegalStateException("Unsupported Linux windowing system. Only X11 and Wayland are supported");
                }
            case WINDOWS:
                XrGraphicsBindingOpenGLWin32KHR winGraphicsBinding = XrGraphicsBindingOpenGLWin32KHR.mallocStack(stack);
                winGraphicsBinding.set(
                    KHROpenglEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR,
                    NULL,
                    User32.GetDC(glfwGetWin32Window(window)),
                    glfwGetWGLContext(window)
                );
                return winGraphicsBinding;
            default:
                throw new IllegalStateException("Unsupported operation system: " + Platform.get());
        }
    }
}
