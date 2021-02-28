/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The KHR_opengl_enable extension. */
public class KHROpenglEnable {

    /** The extension specification version. */
    public static final int XR_KHR_opengl_enable_SPEC_VERSION = 9;

    /** The extension name. */
    public static final String XR_KHR_OPENGL_ENABLE_EXTENSION_NAME = "XR_KHR_opengl_enable";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR   = 1000023000,
        XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR    = 1000023001,
        XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR     = 1000023002,
        XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR = 1000023003,
        XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR          = 1000023004,
        XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR    = 1000023005;

    protected KHROpenglEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetOpenGLGraphicsRequirementsKHR ] ---

    public static int nxrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetOpenGLGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsOpenGLKHR *") XrGraphicsRequirementsOpenGLKHR graphicsRequirements) {
        return nxrGetOpenGLGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}