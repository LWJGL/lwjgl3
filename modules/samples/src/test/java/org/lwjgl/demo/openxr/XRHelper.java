/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.joml.Math;
import org.joml.*;
import org.lwjgl.egl.*;
import org.lwjgl.openxr.*;
import org.lwjgl.system.*;
import org.lwjgl.system.linux.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWNativeEGL.*;
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
     * Appends the right <i>XrGraphicsBinding</i>** struct to the next chain of <i>sessionCreateInfo</i>. OpenGL
     * session creation is poorly standardized in OpenXR, so the right graphics binding struct depends on the OS and
     * the windowing system, among others. There are basically 4 graphics binding structs for this:
     * <ul>
     *     <li><i>XrGraphicsBindingOpenGLWin32KHR</i>, which can only be used on Windows computers.</li>
     *     <li><i>XrGraphicsBindingOpenGLXlibKHR</i>, which can only be used on Linux computers with the X11 windowing system.</li>
     *     <li>
     *         <i>XrGraphicsBindingOpenGLWaylandKHR</i>, which can only be used on Linux computers with the
     *         Wayland windowing system. But, no OpenXR runtime has implemented the specification for this struct and
     *         the Wayland developers have claimed that the specification doesn't make sense and can't be implemented
     *         as such. For this reason, this method won't use this struct.
     *     </li>
     *     <li>
     *         <i>XrGraphicsBindingEGLMNDX</i>, which is cross-platform, but can only be used if the experimental
     *         OpenXR extension <i>XR_MNDX_egl_enable</i> is enabled. But, since the extension is experimental, it
     *         is not widely supported (at the time of writing this only by the Monado OpenXR runtime). Nevertheless,
     *         this is the only way to create an OpenXR session on the Wayland windowing system (or on systems
     *         without well-known windowing system).
     *     </li>
     * </ul>
     *
     * The parameter <b>useEGL</b> determines which graphics binding struct this method will choose:
     * <ul>
     *     <li>
     *          If <b>useEGL</b> is true, this method will use <i>XrGraphicsBindingEGLMNDX</i>.
     *          The caller must ensure that the extension <i>XR_MNDX_egl_enable</i> has been enabled.
     *     </li>
     *     <li>
     *         If <b>useEGL</b> is false, this method will try to use a platform-specific struct.
     *         If no such struct exists, it will throw an <i>IllegalStateException</i>.
     *     </li>
     * </ul>
     *
     * @param sessionCreateInfo The <i>XrSessionCreateInfo</i> whose next chain should be populated
     * @param stack The <i>MemoryStack</i> onto which this method should allocate the graphics binding struct
     * @param window The GLFW window
     * @param useEGL Whether this method should use <i>XrGraphicsBindingEGLMNDX</i>
     * @return sessionCreateInfo (after appending a graphics binding to it)
     * @throws IllegalStateException If the current OS and/or windowing system needs EGL, but <b>useEGL</b> is false
     */
    static XrSessionCreateInfo createGraphicsBindingOpenGL(
        XrSessionCreateInfo sessionCreateInfo, MemoryStack stack, long window, boolean useEGL
    ) throws IllegalStateException {
        if (useEGL) {
            System.out.println("Using XrGraphicsBindingEGLMNDX to create the session...");
            return sessionCreateInfo.next(
                XrGraphicsBindingEGLMNDX.malloc(stack)
                    .type$Default()
                    .next(NULL)
                    .getProcAddress(EGL.getCapabilities().eglGetProcAddress)
                    .display(glfwGetEGLDisplay())
                    .config(glfwGetEGLConfig(window))
                    .context(glfwGetEGLContext(window))
            );
        }
        switch (Platform.get()) {
            case LINUX:
                int platform = glfwGetPlatform();
                if (platform == GLFW_PLATFORM_X11) {
                    long display   = glfwGetX11Display();
                    long glxConfig = glfwGetGLXFBConfig(window);

                    XVisualInfo visualInfo = glXGetVisualFromFBConfig(display, glxConfig);
                    if (visualInfo == null) {
                        throw new IllegalStateException("Failed to get visual info");
                    }
                    long visualid = visualInfo.visualid();

                    System.out.println("Using XrGraphicsBindingOpenGLXlibKHR to create the session");
                    return sessionCreateInfo.next(
                        XrGraphicsBindingOpenGLXlibKHR.malloc(stack)
                            .type$Default()
                            .xDisplay(display)
                            .visualid((int)visualid)
                            .glxFBConfig(glxConfig)
                            .glxDrawable(glXGetCurrentDrawable())
                            .glxContext(glfwGetGLXContext(window))
                    );
                } else {
                    throw new IllegalStateException(
                        "X11 is the only Linux windowing system with explicit OpenXR support. All other Linux systems must use EGL."
                    );
                }
            case WINDOWS:
                System.out.println("Using XrGraphicsBindingOpenGLWin32KHR to create the session");
                return sessionCreateInfo.next(
                    XrGraphicsBindingOpenGLWin32KHR.malloc(stack)
                        .type$Default()
                        .hDC(GetDC(glfwGetWin32Window(window)))
                        .hGLRC(glfwGetWGLContext(window))
                );
            default:
                throw new IllegalStateException(
                    "Windows and Linux are the only platforms with explicit OpenXR support. All other platforms must use EGL."
                );
        }
    }
}
