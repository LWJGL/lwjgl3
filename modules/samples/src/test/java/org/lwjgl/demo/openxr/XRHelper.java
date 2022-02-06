/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.joml.Math;
import org.joml.*;
import org.lwjgl.openxr.*;
import org.lwjgl.system.*;
import org.lwjgl.system.linux.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWNativeGLX.*;
import static org.lwjgl.glfw.GLFWNativeWGL.*;
import static org.lwjgl.glfw.GLFWNativeWayland.*;
import static org.lwjgl.glfw.GLFWNativeWin32.*;
import static org.lwjgl.glfw.GLFWNativeX11.*;
import static org.lwjgl.opengl.GLX.*;
import static org.lwjgl.opengl.GLX13.*;
import static org.lwjgl.openxr.XR10.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.User32.*;

/**
 * A helper class with some static methods to help applications with OpenXR related tasks that are cumbersome in
 * some way.
 */
final class XRHelper {

    private XRHelper() {
    }

    static <S extends Struct, T extends StructBuffer<S, T>> T fill(T buffer, int offset, int value) {
        long ptr    = buffer.address() + offset;
        int  stride = buffer.sizeof();
        for (int i = 0; i < buffer.limit(); i++) {
            memPutInt(ptr + i * stride, value);
        }
        return buffer;
    }

    /**
     * Allocates an {@link XrApiLayerProperties.Buffer} onto the given stack with the given number of layers and
     * sets the type of each element in the buffer to {@link XR10#XR_TYPE_API_LAYER_PROPERTIES XR_TYPE_API_LAYER_PROPERTIES}.
     *
     * <p>Note: you can't use the buffer after the stack is gone!</p>
     *
     * @param stack     the stack to allocate the buffer on
     * @param numLayers the number of elements the buffer should get
     *
     * @return the created buffer
     */
    static XrApiLayerProperties.Buffer prepareApiLayerProperties(MemoryStack stack, int numLayers) {
        return fill(
            XrApiLayerProperties.calloc(numLayers, stack),
            XrApiLayerProperties.TYPE,
            XR_TYPE_API_LAYER_PROPERTIES
        );
    }

    /**
     * Allocates an {@link XrExtensionProperties.Buffer} onto the given stack with the given number of extensions
     * and sets the type of each element in the buffer to {@link XR10#XR_TYPE_EXTENSION_PROPERTIES XR_TYPE_EXTENSION_PROPERTIES}.
     *
     * <p>Note: you can't use the buffer after the stack is gone!</p>
     *
     * @param stack         the stack onto which to allocate the buffer
     * @param numExtensions the number of elements the buffer should get
     *
     * @return the created buffer
     */
    static XrExtensionProperties.Buffer prepareExtensionProperties(MemoryStack stack, int numExtensions) {
        return fill(
            XrExtensionProperties.calloc(numExtensions, stack),
            XrExtensionProperties.TYPE,
            XR_TYPE_EXTENSION_PROPERTIES
        );
    }

    /**
     * Applies an off-center asymmetric perspective projection transformation to the given {@link Matrix4f},
     * such that it represents a projection matrix with the given <b>fov</b>, <b>nearZ</b> (a.k.a. near plane),
     * <b>farZ</b> (a.k.a. far plane).
     *
     * @param m          The matrix to apply the perspective projection transformation to
     * @param fov        The desired Field of View for the projection matrix. You should normally use the value of
     *                   {@link XrCompositionLayerProjectionView#fov}.
     * @param nearZ      The nearest Z value that the user should see (also known as the near plane)
     * @param farZ       The furthest Z value that the user should see (also known as far plane)
     * @param zZeroToOne True if the z-axis of the coordinate system goes from 0 to 1 (Vulkan).
     *                   False if the z-axis of the coordinate system goes from -1 to 1 (OpenGL).
     *
     * @return the provided matrix
     */
    static Matrix4f applyProjectionToMatrix(Matrix4f m, XrFovf fov, float nearZ, float farZ, boolean zZeroToOne) {
        float distToLeftPlane   = Math.tan(fov.angleLeft());
        float distToRightPlane  = Math.tan(fov.angleRight());
        float distToBottomPlane = Math.tan(fov.angleDown());
        float distToTopPlane    = Math.tan(fov.angleUp());
        return m.frustum(distToLeftPlane * nearZ, distToRightPlane * nearZ, distToBottomPlane * nearZ, distToTopPlane * nearZ, nearZ, farZ, zZeroToOne);
    }

    /**
     * <p>
     * Allocates a {@code XrGraphicsBindingOpenGL**} struct for the current platform onto the given stack. It should
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
     *
     * @param stack  The stack onto which to allocate the graphics binding struct
     * @param window The GLFW window handle used to create the OpenGL context
     *
     * @return A {@code XrGraphicsBindingOpenGL**} struct that can be used to create a session
     *
     * @throws IllegalStateException If the current platform is not supported
     */
    static XrSessionCreateInfo createGraphicsBindingOpenGL(XrSessionCreateInfo sessionCreateInfo, MemoryStack stack, long window) throws IllegalStateException {
        switch (Platform.get()) {
            case LINUX:
                /*
                 * NOTE: X11 is preferred over Wayland because Monado, the most promising Linux OpenXR runtime,
                 * doesn't handle XrGraphicsBindingOpenGLWaylandKHR at the moment. See
                 * https://gitlab.freedesktop.org/monado/monado/-/issues/128 for the current status on this.
                 */
                int platform = glfwGetPlatform();
                if (platform == GLFW_PLATFORM_X11) {
                    long display   = glfwGetX11Display();
                    long glxConfig = glfwGetGLXFBConfig(window);

                    XVisualInfo visualInfo = glXGetVisualFromFBConfig(display, glxConfig);
                    if (visualInfo == null) {
                        throw new IllegalStateException("Failed to get visual info");
                    }
                    long visualid = visualInfo.visualid();

                    return sessionCreateInfo.next(
                        XrGraphicsBindingOpenGLXlibKHR.malloc(stack)
                            .type$Default()
                            .next(NULL)
                            .xDisplay(display)
                            .visualid((int)visualid)
                            .glxFBConfig(glxConfig)
                            .glxDrawable(glXGetCurrentDrawable())
                            .glxContext(glfwGetGLXContext(window))
                    );
                } else if (platform == GLFW_PLATFORM_WAYLAND) {
                    return sessionCreateInfo.next(
                        XrGraphicsBindingOpenGLWaylandKHR.malloc(stack)
                            .type$Default()
                            .next(NULL)
                            .display(glfwGetWaylandDisplay())
                    );
                } else {
                    throw new IllegalStateException("Unsupported Linux windowing system. Only X11 and Wayland are supported");
                }
            case WINDOWS:
                return sessionCreateInfo.next(
                    XrGraphicsBindingOpenGLWin32KHR.malloc(stack)
                        .type$Default()
                        .next(NULL)
                        .hDC(GetDC(glfwGetWin32Window(window)))
                        .hGLRC(glfwGetWGLContext(window))
                );
            default:
                throw new IllegalStateException("Unsupported operation system: " + Platform.get());
        }
    }
}
