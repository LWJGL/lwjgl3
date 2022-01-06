/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.openxr.XR10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
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
            long address = callPPP(handle, memAddress(functionName), XR.getGlobalCommands().xrGetInstanceProcAddr);
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLog("Failed to locate address for XR instance function " + memASCII(functionName));
            }
            return address;
        }, apiVersion, XR.getEnabledExtensionSet(apiVersion, ci.enabledExtensionNames()));
    }

}