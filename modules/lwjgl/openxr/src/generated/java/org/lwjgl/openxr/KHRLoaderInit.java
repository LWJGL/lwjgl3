/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRLoaderInit {

    public static final int XR_KHR_loader_init_SPEC_VERSION = 2;

    public static final String XR_KHR_LOADER_INIT_EXTENSION_NAME = "XR_KHR_loader_init";

    protected KHRLoaderInit() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrInitializeLoaderKHR ] ---

    /** {@code XrResult xrInitializeLoaderKHR(XrLoaderInitInfoBaseHeaderKHR const * loaderInitInfo)} */
    public static int nxrInitializeLoaderKHR(long loaderInitInfo) {
        long __functionAddress = XR.getGlobalCommands().xrInitializeLoaderKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(loaderInitInfo, __functionAddress);
    }

    /** {@code XrResult xrInitializeLoaderKHR(XrLoaderInitInfoBaseHeaderKHR const * loaderInitInfo)} */
    @NativeType("XrResult")
    public static int xrInitializeLoaderKHR(@NativeType("XrLoaderInitInfoBaseHeaderKHR const *") XrLoaderInitInfoBaseHeaderKHR loaderInitInfo) {
        return nxrInitializeLoaderKHR(loaderInitInfo.address());
    }

}