/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import javax.annotation.*;

import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

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

    public static void create(FunctionProvider functionProvider) {
        if (XR.functionProvider != null) {
            throw new IllegalStateException("Vulkan has already been created.");
        }

        XR.functionProvider = functionProvider;
        globalCommands = new XR.GlobalCommands(functionProvider);
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

            xrCreateInstance = library.getFunctionAddress("xrCreateInstance");
            xrEnumerateInstanceExtensionProperties = getFunctionAddress("xrEnumerateInstanceExtensionProperties");
            xrEnumerateApiLayerProperties = getFunctionAddress("xrEnumerateApiLayerProperties");
            xrInitializeLoaderKHR = getFunctionAddress("xrInitializeLoaderKHR", false);
        }

        private long getFunctionAddress(String name) { return getFunctionAddress(name, true); }
        private long getFunctionAddress(String name, boolean required) {
            try (MemoryStack stack = stackPush()) {
                PointerBuffer pp = stack.mallocPointer(1);
                callPPPI(NULL, memAddress(stack.ASCII(name)), memAddress(pp), xrGetInstanceProcAddr);
                long address = pp.get();
                if (address == NULL && required) {
                    throw new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
                }
                return address;
            }
        }
    }

    static GlobalCommands getGlobalCommands() { return check(globalCommands); }

    static Set<String> getEnabledExtensionSet(long apiVersion, @Nullable PointerBuffer extensionNames) {
        Set<String> enabledExtensions = new HashSet<>(16);

//        int majorVersion = VK_VERSION_MAJOR(apiVersion);
//        int minorVersion = VK_VERSION_MINOR(apiVersion);

//        int[] VK_VERSIONS = {
//            1 // Vulkan 1.0 to 1.1
//        };

//        int maxMajor = min(majorVersion, VK_VERSIONS.length);
//        for (int M = 1; M <= maxMajor; M++) {
//            int maxMinor = VK_VERSIONS[M - 1];
//            if (M == majorVersion) {
//                maxMinor = min(minorVersion, maxMinor);
//            }
//            for (int m = 0; m <= maxMinor; m++) {
//                enabledExtensions.add(String.format("Vulkan%d%d", M, m));
//            }
//        }
        enabledExtensions.add("OpenXR10");

        if (extensionNames != null) {
            for (int i = extensionNames.position(); i < extensionNames.limit(); i++) {
                enabledExtensions.add(extensionNames.getStringUTF8(i));
            }
        }

        return enabledExtensions;
    }
}
