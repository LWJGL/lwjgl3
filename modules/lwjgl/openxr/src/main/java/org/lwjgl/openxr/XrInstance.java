/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.openxr.XR10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Wraps an {@code XrInstance} handle. */
public class XrInstance extends DispatchableHandle {

    /**
     * Creates an {@code XrInstance} instance for the specified native handle.
     *
     * @param handle the native {@code XrInstance} handle
     * @param ci     the {@link XrInstanceCreateInfo} structured used to create the handle.
     */
    public XrInstance(long handle, XrInstanceCreateInfo ci) {
        super(handle, getInstanceCapabilities(handle, ci));
    }

    private static XRCapabilities getInstanceCapabilities(long handle, XrInstanceCreateInfo ci) {
        XrApplicationInfo appInfo = ci.applicationInfo();

        long apiVersion = appInfo.apiVersion() != 0
            ? appInfo.apiVersion()
            : XR_MAKE_VERSION(1, 0, 0);

        return new XRCapabilities(functionName -> {
            try (MemoryStack stack = stackPush()) {
                PointerBuffer pp = stack.mallocPointer(1);

                int result = callPPPI(handle, memAddress(functionName), pp.address(), XR.getGlobalCommands().xrGetInstanceProcAddr);
                if (result != XR_SUCCESS && Checks.DEBUG_FUNCTIONS) {
                    apiLog("Failed to query address of XR function " + memASCII(functionName));
                }

                return pp.get(0);
            }
        }, apiVersion, XR.getEnabledExtensionSet(apiVersion, ci.enabledExtensionNames()));
    }

}