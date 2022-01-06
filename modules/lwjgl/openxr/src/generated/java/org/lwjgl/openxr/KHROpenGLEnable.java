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
public class KHROpenGLEnable {

    /** The extension specification version. */
    public static final int XR_KHR_opengl_enable_SPEC_VERSION = 10;

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

    protected KHROpenGLEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetOpenGLGraphicsRequirementsKHR ] ---

    /** Unsafe version of: {@link #xrGetOpenGLGraphicsRequirementsKHR GetOpenGLGraphicsRequirementsKHR} */
    public static int nxrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetOpenGLGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /**
     * Retrieve the OpenGL version requirements for an instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query OpenGL API version requirements for an instance and system, call:</p>
     * 
     * <pre><code>
     * XrResult xrGetOpenGLGraphicsRequirementsKHR(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrGraphicsRequirementsOpenGLKHR*            graphicsRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetOpenGLGraphicsRequirementsKHR GetOpenGLGraphicsRequirementsKHR} function identifies to the application the minimum OpenGL version requirement and the highest known tested OpenGL version. The runtime <b>must</b> return {@link XR10#XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING} ({@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} <b>may</b> be returned due to legacy behavior) on calls to {@link XR10#xrCreateSession CreateSession} if {@link #xrGetOpenGLGraphicsRequirementsKHR GetOpenGLGraphicsRequirementsKHR} has not been called for the same {@code instance} and {@code systemId}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to calling {@link #xrGetOpenGLGraphicsRequirementsKHR GetOpenGLGraphicsRequirementsKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code graphicsRequirements} <b>must</b> be a pointer to an {@link XrGraphicsRequirementsOpenGLKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrGraphicsRequirementsOpenGLKHR}</p>
     *
     * @param instance             an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId             an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param graphicsRequirements the {@link XrGraphicsRequirementsOpenGLKHR} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetOpenGLGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsOpenGLKHR *") XrGraphicsRequirementsOpenGLKHR graphicsRequirements) {
        return nxrGetOpenGLGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}