/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

/**
 * This class loads the Vulkan library into the JVM process.
 *
 * @see Configuration#VULKAN_LIBRARY_NAME
 * @see Configuration#VULKAN_EXPLICIT_INIT
 */
public final class VK {

    private static FunctionProvider functionProvider;

    private static GlobalCommands globalCommands;

    static {
        if (!Configuration.VULKAN_EXPLICIT_INIT.get(false)) {
            create();
        }
    }

    private VK() {}

    /**
     * Loads the Vulkan shared library, using the default library name.
     *
     * @see #create(String)
     */
    public static void create() {
        SharedLibrary VK;
        switch (Platform.get()) {
            case LINUX:
                VK = Library.loadNative(VK.class, Configuration.VULKAN_LIBRARY_NAME, "libvulkan.so.1");
                break;
            case WINDOWS:
                VK = Library.loadNative(VK.class, Configuration.VULKAN_LIBRARY_NAME, "vulkan-1");
                break;
            case MACOSX:
                VK = Library.loadNative(VK.class, Configuration.VULKAN_LIBRARY_NAME); // Vulkan-over-Metal emulation, e.g. MoltenVK
                break;
            default:
                throw new IllegalStateException();
        }
        create(VK);
    }

    /**
     * Loads the Vulkan shared library, using the specified library name.
     *
     * <p>The {@link FunctionProvider} instance created by this method can only be used to retrieve global commands and commands exposed statically by the
     * Vulkan shared library.</p>
     *
     * @param libName the shared library name
     *
     * @see #create(FunctionProvider)
     */
    public static void create(String libName) {
        create(Library.loadNative(VK.class, libName));
    }

    /**
     * Initializes Vulkan with the specified {@link FunctionProvider}. This method can be used to implement custom Vulkan library loading.
     *
     * @param functionProvider the provider of Vulkan function addresses
     */
    public static void create(FunctionProvider functionProvider) {
        if (VK.functionProvider != null) {
            throw new IllegalStateException("Vulkan has already been created.");
        }

        VK.functionProvider = functionProvider;
        globalCommands = new GlobalCommands(functionProvider);
    }

    /** Unloads the Vulkan shared library. */
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

    /** Returns the {@link FunctionProvider} for the Vulkan shared library. */
    public static FunctionProvider getFunctionProvider() {
        return functionProvider;
    }

    static class GlobalCommands {

        final long vkGetInstanceProcAddr;

        final long vkCreateInstance;
        final long vkEnumerateInstanceExtensionProperties;
        final long vkEnumerateInstanceLayerProperties;

        GlobalCommands(FunctionProvider library) {
            vkGetInstanceProcAddr = library.getFunctionAddress("vkGetInstanceProcAddr");
            if (vkGetInstanceProcAddr == NULL) {
                throw new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
            }

            vkCreateInstance = getFunctionAddress("vkCreateInstance");
            vkEnumerateInstanceExtensionProperties = getFunctionAddress("vkEnumerateInstanceExtensionProperties");
            vkEnumerateInstanceLayerProperties = getFunctionAddress("vkEnumerateInstanceLayerProperties");
        }

        private long getFunctionAddress(String name) {
            try (MemoryStack stack = stackPush()) {
                long address = callPPP(vkGetInstanceProcAddr, NULL, memAddress(stack.ASCII(name)));
                if (address == NULL) {
                    throw new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
                }
                return address;
            }
        }
    }

    /** Returns the Vulkan global commands. */
    static GlobalCommands getGlobalCommands() { return globalCommands; }

    static Set<String> getEnabledExtensionSet(int apiVersion, PointerBuffer extensionNames) {
        Set<String> enabledExtensions = new HashSet<>(16);

        int majorVersion = VK_VERSION_MAJOR(apiVersion);
        int minorVersion = VK_VERSION_MINOR(apiVersion);

        int[] VK_VERSIONS = {
            0, // Vulkan 1.0
        };

        int maxMajor = min(majorVersion, VK_VERSIONS.length);
        for (int M = 1; M <= maxMajor; M++) {
            int maxMinor = VK_VERSIONS[M - 1];
            if (M == majorVersion) {
                maxMinor = min(minorVersion, maxMinor);
            }
            for (int m = 0; m <= maxMinor; m++) {
                enabledExtensions.add(String.format("Vulkan%d%d", M, m));
            }
        }

        if (extensionNames != null) {
            for (int i = extensionNames.position(); i < extensionNames.limit(); i++) {
                enabledExtensions.add(extensionNames.getStringUTF8(i));
            }
        }

        return enabledExtensions;
    }

    static <T> T checkExtension(String extension, T functions) {
        if (functions != null) {
            return functions;
        }

        apiLog("[VK] " + extension + " was reported as available but an entry point is missing.");
        return null;
    }

    static long isSupported(FunctionProvider provider, String functionName, boolean extensionSupported) {
        return extensionSupported ? provider.getFunctionAddress(functionName) : NULL;
    }

}