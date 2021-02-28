/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import javax.annotation.*;

import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class XR {

    @Nullable
    private static FunctionProvider functionProvider;

    @Nullable
    private static GlobalCommands globalCommands;

    private static <T> T check(@Nullable T t) {
        if (t == null) {
            throw new IllegalStateException("OpenXR library has not been loaded.");
        }
        return t;
    }

    static class GlobalCommands {

        final long xrGetInstanceProcAddr;

        final long xrCreateInstance;
        final long xrEnumerateInstanceExtensionProperties;
        final long xrEnumerateApiLayerProperties;
        final long xrInitializeLoaderKHR;

        GlobalCommands(FunctionProvider library) {
            xrGetInstanceProcAddr = library.getFunctionAddress("xrGetInstanceProcAddr");
            if (xrGetInstanceProcAddr == NULL) {
                throw new IllegalArgumentException("A critical function is missing. Make sure that OpenXR is available.");
            }

            xrCreateInstance = getFunctionAddress("xrCreateInstance");
            xrEnumerateInstanceExtensionProperties = getFunctionAddress("xrEnumerateInstanceExtensionProperties");
            xrEnumerateApiLayerProperties = getFunctionAddress("xrEnumerateApiLayerProperties");
            xrInitializeLoaderKHR = getFunctionAddress("xrInitializeLoaderKHR", false);
        }

        private long getFunctionAddress(String name) { return getFunctionAddress(name, true); }
        private long getFunctionAddress(String name, boolean required) {
            try (MemoryStack stack = stackPush()) {
                long address = callPPP(NULL, memAddress(stack.ASCII(name)), xrGetInstanceProcAddr);
                if (address == NULL && required) {
                    throw new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
                }
                return address;
            }
        }
    }

    static GlobalCommands getGlobalCommands() { return check(globalCommands); }
}
