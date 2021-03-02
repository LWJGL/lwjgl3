/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import javax.annotation.*;

import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

public class XR {

    @Nullable
    public static FunctionProvider functionProvider;

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

            xrInitializeLoaderKHR = NULL;

            //TODO see if its possible to get these pointers through calling xrGetInstanceProcAddr just in case they aren't directly provided by the lib file
            xrCreateInstance = library.getFunctionAddress("xrCreateInstance");
            xrEnumerateInstanceExtensionProperties = library.getFunctionAddress("xrEnumerateInstanceExtensionProperties");
            xrEnumerateApiLayerProperties = library.getFunctionAddress("xrEnumerateApiLayerProperties");
//            xrEnumerateInstanceExtensionProperties = getFunctionAddress("xrEnumerateInstanceExtensionProperties");
//            xrEnumerateApiLayerProperties = getFunctionAddress("xrEnumerateApiLayerProperties");
//            xrInitializeLoaderKHR = getFunctionAddress("xrInitializeLoaderKHR", false);
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
