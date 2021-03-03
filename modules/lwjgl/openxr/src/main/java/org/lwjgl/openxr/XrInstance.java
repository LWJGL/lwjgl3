/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class XrInstance extends DispatchableHandleInstance {
    public XrInstance(long handle, XrInstanceCreateInfo createInfo) {
        super(handle, getInstanceCapabilities(handle, createInfo));
    }

    private static XRCapabilitiesInstance getInstanceCapabilities(long handle, XrInstanceCreateInfo ci) {
        XrApplicationInfo appInfo = ci.applicationInfo();

        long apiVersion = appInfo.apiVersion();

        return new XRCapabilitiesInstance(functionName -> {
            try (MemoryStack stack = stackPush()) {
                PointerBuffer pp = stack.mallocPointer(1);
                callPPPI(handle, memAddress(functionName), memAddress(pp), XR.getGlobalCommands().xrGetInstanceProcAddr);
                long address = pp.get();
                if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                    apiLog("Failed to locate address for XR instance function " + memASCII(functionName));
                }
                return address;
            }
        }, apiVersion, XR.getEnabledExtensionSet(apiVersion, ci.enabledExtensionNames()), new HashSet<>());
    }
}