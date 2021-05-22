/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class XrSession extends DispatchableHandleSession {
    public XrSession(long handle, XrInstance xrInstance) {
        super(handle, getSessionCapabilities(handle, xrInstance));
    }

    private static XRCapabilitiesSession getSessionCapabilities(long handle, XrInstance xrInstance) {
        Set<String> set = new HashSet<>(1);
        set.add("OpenXR10");

        return new XRCapabilitiesSession(functionName -> {
            try (MemoryStack stack = stackPush()) {
                PointerBuffer pp = stack.mallocPointer(1);
                callPPPI(handle, memAddress(functionName), memAddress(pp), XR.getGlobalCommands().xrGetInstanceProcAddr);
                long address = pp.get();
                if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                    apiLog("Failed to locate address for XR session function " + memASCII(functionName));
                }
                return address;
            }
        },
            xrInstance.getCapabilities(),
            set
        );
    }
}
