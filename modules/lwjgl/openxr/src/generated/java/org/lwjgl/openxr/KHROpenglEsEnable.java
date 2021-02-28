/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The KHR_opengl_es_enable extension. */
public class KHROpenglEsEnable {

    /** The extension specification version. */
    public static final int XR_KHR_opengl_es_enable_SPEC_VERSION = 7;

    /** The extension name. */
    public static final String XR_KHR_OPENGL_ES_ENABLE_EXTENSION_NAME = "XR_KHR_opengl_es_enable";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR = 1000024001,
        XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR          = 1000024002,
        XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR    = 1000024003;

    protected KHROpenglEsEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetOpenGLESGraphicsRequirementsKHR ] ---

    public static int nxrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetOpenGLESGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsOpenGLESKHR *") XrGraphicsRequirementsOpenGLESKHR graphicsRequirements) {
        return nxrGetOpenGLESGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}