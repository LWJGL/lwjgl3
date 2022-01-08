/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.*;
import org.lwjgl.system.*;

import javax.annotation.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.openxr.XR10.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class loads the OpenXR library into the JVM process.
 *
 * @see Configuration#OPENXR_LIBRARY_NAME
 * @see Configuration#OPENXR_EXPLICIT_INIT
 */
public final class XR {

    @Nullable
    private static FunctionProvider functionProvider;

    @Nullable
    private static GlobalCommands globalCommands;

    static {
        if (!Configuration.OPENXR_EXPLICIT_INIT.get(false)) {
            create();
        }
    }

    private XR() { }

    /**
     * Loads the OpenXR shared library, using the default library name.
     *
     * @see #create(String)
     */
    public static void create() {
        create(Library.loadNative(
            XR.class,
            "org.lwjgl.openxr",
            Configuration.OPENXR_LIBRARY_NAME.get(Platform.mapLibraryNameBundled(Platform.get() == Platform.WINDOWS
                ? "openxr-loader"
                : "openxr_loader")),
            true
        ));
    }

    /**
     * Loads the OpenXR shared library, using the specified library name.
     *
     * <p>The {@link FunctionProvider} instance created by this method can only be used to retrieve global commands and commands exposed statically by the
     * OpenXR shared library.</p>
     *
     * @param libName the shared library name
     *
     * @see #create(FunctionProvider)
     */
    public static void create(String libName) {
        create(Library.loadNative(XR.class, "org.lwjgl.openxr", libName));
    }

    /**
     * Initializes OpenXR with the specified {@link FunctionProvider}. This method can be used to implement custom OpenXR library loading.
     *
     * @param functionProvider the provider of OpenXR function addresses
     */
    public static void create(FunctionProvider functionProvider) {
        if (XR.functionProvider != null) {
            throw new IllegalStateException("OpenXR has already been created.");
        }

        XR.functionProvider = functionProvider;
        globalCommands = new GlobalCommands(functionProvider);
    }

    /** Unloads the OpenXR shared library. */
    public static void destroy() {
        if (functionProvider == null) {
            return;
        }

        if (functionProvider instanceof NativeResource) {
            ((NativeResource)functionProvider).free();
        }
        functionProvider = null;
        globalCommands = null;
    }

    private static <T> T check(@Nullable T t) {
        if (t == null) {
            throw new IllegalStateException("OpenXR library has not been loaded.");
        }
        return t;
    }

    /** Returns the {@link FunctionProvider} for the OpenXR shared library. */
    public static FunctionProvider getFunctionProvider() {
        return check(functionProvider);
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
                PointerBuffer pp = stack.mallocPointer(1);

                int result = callPPPI(NULL, memAddress(stack.ASCII(name)), pp.address(), xrGetInstanceProcAddr);
                if (result != XR_SUCCESS && required) {
                    throw new IllegalArgumentException("A critical function is missing. Make sure that OpenXR is available.");
                }

                return pp.get(0);
            }
        }
    }

    /** Returns the OpenXR global commands. */
    static GlobalCommands getGlobalCommands() { return check(globalCommands); }

    static Set<String> getEnabledExtensionSet(long apiVersion, @Nullable PointerBuffer extensionNames) {
        Set<String> enabledExtensions = new HashSet<>(16);

        short majorVersion = XR_VERSION_MAJOR(apiVersion);
        short minorVersion = XR_VERSION_MINOR(apiVersion);

        int[] XR_VERSIONS = {
            0 // 1.0
        };

        int maxMajor = min(majorVersion, XR_VERSIONS.length);
        for (int M = 1; M <= maxMajor; M++) {
            int maxMinor = XR_VERSIONS[M - 1];
            if (M == majorVersion) {
                maxMinor = min(minorVersion, maxMinor);
            }
            for (int m = 0; m <= maxMinor; m++) {
                enabledExtensions.add(String.format("OpenXR%d%d", M, m));
            }
        }

        if (extensionNames != null) {
            for (int i = extensionNames.position(); i < extensionNames.limit(); i++) {
                enabledExtensions.add(extensionNames.getStringUTF8(i));
            }
        }

        return enabledExtensions;
    }

}