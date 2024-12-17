/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHROpenGLEnable {

    public static final int XR_KHR_opengl_enable_SPEC_VERSION = 10;

    public static final String XR_KHR_OPENGL_ENABLE_EXTENSION_NAME = "XR_KHR_opengl_enable";

    public static final int
        XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR   = 1000023000,
        XR_TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR    = 1000023001,
        XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR     = 1000023002,
        XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR = 1000023003,
        XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR          = 1000023004,
        XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR    = 1000023005;

    protected KHROpenGLEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetOpenGLGraphicsRequirementsKHR ] ---

    /** {@code XrResult xrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, XrSystemId systemId, XrGraphicsRequirementsOpenGLKHR * graphicsRequirements)} */
    public static int nxrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetOpenGLGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /** {@code XrResult xrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, XrSystemId systemId, XrGraphicsRequirementsOpenGLKHR * graphicsRequirements)} */
    @NativeType("XrResult")
    public static int xrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsOpenGLKHR *") XrGraphicsRequirementsOpenGLKHR graphicsRequirements) {
        return nxrGetOpenGLGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}