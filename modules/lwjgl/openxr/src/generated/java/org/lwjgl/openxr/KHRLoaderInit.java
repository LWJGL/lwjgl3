/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_loader_init">XR_KHR_loader_init</a> extension.
 * 
 * <p>On some platforms, before loading can occur the loader must be initialized with platform-specific parameters. Unlike other extensions, the presence of this extension is signaled by a successful call to {@link XR10#xrGetInstanceProcAddr GetInstanceProcAddr} to retrieve the function pointer for {@link #xrInitializeLoaderKHR InitializeLoaderKHR} using a null instance handle. If this extension is supported, its use may be required on some platforms and the use of the {@link #xrInitializeLoaderKHR InitializeLoaderKHR} function must precede other OpenXR calls except {@link XR10#xrGetInstanceProcAddr GetInstanceProcAddr}. This function exists as part of the loader library that the application is using.</p>
 */
public class KHRLoaderInit {

    /** The extension specification version. */
    public static final int XR_KHR_loader_init_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_LOADER_INIT_EXTENSION_NAME = "XR_KHR_loader_init";

    protected KHRLoaderInit() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrInitializeLoaderKHR ] ---

    /** Unsafe version of: {@link #xrInitializeLoaderKHR InitializeLoaderKHR} */
    public static int nxrInitializeLoaderKHR(long loaderInitInfo) {
        long __functionAddress = XR.getGlobalCommands().xrInitializeLoaderKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(loaderInitInfo, __functionAddress);
    }

    /**
     * Initializes loader.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To initialize an OpenXR loader with platform or implementation-specific parameters, call:</p>
     * 
     * <pre><code>
     * XrResult xrInitializeLoaderKHR(
     *     const XrLoaderInitInfoBaseHeaderKHR*        loaderInitInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHRLoaderInit XR_KHR_loader_init} extension <b>must</b> be enabled prior to calling {@link #xrInitializeLoaderKHR InitializeLoaderKHR}</li>
     * <li>{@code loaderInitInfo} <b>must</b> be a pointer to a valid {@link XrLoaderInitInfoBaseHeaderKHR}-based structure</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrLoaderInitInfoBaseHeaderKHR}</p>
     *
     * @param loaderInitInfo a pointer to an {@link XrLoaderInitInfoBaseHeaderKHR} structure, which is a polymorphic type defined by other platform- or implementation-specific extensions.
     */
    @NativeType("XrResult")
    public static int xrInitializeLoaderKHR(@NativeType("XrLoaderInitInfoBaseHeaderKHR const *") XrLoaderInitInfoBaseHeaderKHR loaderInitInfo) {
        return nxrInitializeLoaderKHR(loaderInitInfo.address());
    }

}