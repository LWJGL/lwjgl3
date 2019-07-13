/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.system.macosx.*;

import javax.annotation.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class loads the OpenCL library (usually via the ICD loader) into the JVM process.
 *
 * <p>The {@link CLCapabilities} instance returned by {@link #getICD()} contains function pointers for all functionality present in the ICD. This may include
 * multiple platforms with very different capabilities. It should only be used if direct access to the ICD function pointers is required, for customization
 * purposes.</p>
 *
 * <p>Platform capabilities can be created with {@link #createPlatformCapabilities}. Calling this method is expensive, so {@link CLCapabilities} instances
 * should be cached in user code.</p>
 *
 * <p>Device capabilities can be created with {@link #createDeviceCapabilities}. Calling this method is expensive, so {@link CLCapabilities} instances should
 * be cached in user code.</p>
 */
public final class CL {

    @Nullable
    private static FunctionProviderLocal functionProvider;

    @Nullable
    private static CLCapabilities icd;

    static {
        if (!Configuration.OPENCL_EXPLICIT_INIT.get(false)) {
            create();
        }
    }

    private CL() {}

    /** Loads the OpenCL native library, using the default library name. */
    public static void create() {
        SharedLibrary CL;
        switch (Platform.get()) {
            case LINUX:
            case WINDOWS:
                CL = Library.loadNative(CL.class, "org.lwjgl.opencl", Configuration.OPENCL_LIBRARY_NAME, "OpenCL");
                break;
            case MACOSX:
                String override = Configuration.OPENCL_LIBRARY_NAME.get();
                CL = override != null
                    ? Library.loadNative(CL.class, "org.lwjgl.opencl", override)
                    : MacOSXLibrary.getWithIdentifier("com.apple.opencl");
                break;
            default:
                throw new IllegalStateException();
        }
        create(CL);
    }

    /**
     * Loads the OpenCL native library, using the specified library name.
     *
     * @param libName the native library name
     */
    public static void create(String libName) {
        create(Library.loadNative(CL.class, "org.lwjgl.opencl", libName));
    }

    private static class SharedLibraryCL extends SharedLibrary.Delegate implements FunctionProviderLocal {

        private final long clGetExtensionFunctionAddress;
        private final long clGetExtensionFunctionAddressForPlatform;

        // NULL if multiple platforms are available.
        private final long platform;

        SharedLibraryCL(SharedLibrary library) {
            super(library);

            clGetExtensionFunctionAddress = library.getFunctionAddress("clGetExtensionFunctionAddress");
            clGetExtensionFunctionAddressForPlatform = library.getFunctionAddress("clGetExtensionFunctionAddressForPlatform");
            if (clGetExtensionFunctionAddress == NULL && clGetExtensionFunctionAddressForPlatform == NULL) {
                throw new IllegalStateException("A core OpenCL function is missing. Make sure that OpenCL is available.");
            }

            /*
            We'll use clGetExtensionFunctionAddress, even if it has been deprecated, because clGetExtensionFunctionAddressForPlatform is pointless
            when the ICD is used. clGetExtensionFunctionAddressForPlatform will be used only if there is just 1 platform available and that platform
            supports OpenCL 1.2 or higher.
            */
            long platform = NULL;
            if (clGetExtensionFunctionAddressForPlatform != NULL) {
                long clGetPlatformIDs = library.getFunctionAddress("clGetPlatformIDs");
                if (clGetPlatformIDs == NULL) {
                    throw new IllegalStateException("A core OpenCL function is missing. Make sure that OpenCL is available.");
                }

                try (MemoryStack stack = stackPush()) {
                    IntBuffer pi = stack.ints(0);
                    callPPI(0, NULL, memAddress(pi), clGetPlatformIDs);

                    int platforms = pi.get(0);

                    if (platforms == 1) {
                        PointerBuffer pp = stack.pointers(0);

                        callPPI(1, memAddress(pp), NULL, clGetPlatformIDs);
                        long cl_platform_id = pp.get(0);
                        if (supportsOpenCL12(stack, cl_platform_id)) {
                            platform = cl_platform_id;
                        }
                    } else if (clGetExtensionFunctionAddress == NULL) {
                        throw new IllegalStateException();
                    }
                }
            }
            this.platform = platform;
        }

        private boolean supportsOpenCL12(MemoryStack stack, long platform) {
            long clGetPlatformInfo = library.getFunctionAddress("clGetPlatformInfo");
            if (clGetPlatformInfo == NULL) {
                return false;
            }

            PointerBuffer pp = stack.mallocPointer(1);

            int errcode = callPPPPI(platform, CL_PLATFORM_VERSION, 0L, NULL, memAddress(pp), clGetPlatformInfo);
            if (errcode != CL_SUCCESS) {
                return false;
            }

            int bytes = (int)pp.get(0);

            ByteBuffer version = stack.malloc(bytes);

            errcode = callPPPPI(platform, CL_PLATFORM_VERSION, (long)bytes, memAddress(version), NULL, clGetPlatformInfo);
            if (errcode != CL_SUCCESS) {
                return false;
            }

            APIVersion apiVersion = apiParseVersion(memASCII(version, bytes - 1), "OpenCL");
            return 1 < apiVersion.major || 2 <= apiVersion.minor;
        }

        @Override
        public long getFunctionAddress(ByteBuffer functionName) {
            long nameEncoded = memAddress(functionName);

            long address = platform == NULL
                ? callPP(nameEncoded, clGetExtensionFunctionAddress)
                : callPPP(platform, nameEncoded, clGetExtensionFunctionAddressForPlatform);

            if (address == NULL) {
                address = library.getFunctionAddress(functionName);
                if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                    apiLog("Failed to locate address for CL function " + memASCII(functionName));
                }
            }

            return address;
        }

        @Override
        public long getFunctionAddress(long handle, ByteBuffer functionName) {
            long address = callPPP(handle, memAddress(functionName), clGetExtensionFunctionAddressForPlatform);
            return address != NULL ? address : getFunctionAddress(functionName);
        }
    }

    private static void create(SharedLibrary OPENCL) {
        try {
            create((FunctionProviderLocal)new SharedLibraryCL(OPENCL));
        } catch (RuntimeException e) {
            OPENCL.free();
            throw e;
        }
    }

    /**
     * Initializes OpenCL with the specified {@link FunctionProviderLocal}. This method can be used to implement custom OpenCL library loading.
     *
     * @param functionProvider the provider of OpenCL function addresses
     */
    public static void create(FunctionProviderLocal functionProvider) {
        if (CL.functionProvider != null) {
            throw new IllegalStateException("OpenCL has already been created.");
        }

        CL.functionProvider = functionProvider;

        icd = new CLCapabilities(functionProvider, Collections.emptySet());
    }

    /** Unloads the OpenCL native library. */
    public static void destroy() {
        if (functionProvider == null) {
            return;
        }

        if (functionProvider instanceof NativeResource) {
            ((NativeResource)functionProvider).free();
        }
        functionProvider = null;
        icd = null;
    }

    /** Returns the {@link FunctionProviderLocal} for the OpenCL native library. */
    @Nullable
    public static FunctionProviderLocal getFunctionProvider() {
        return functionProvider;
    }

    /** Returns the {@link CLCapabilities} of the ICD. */
    @Nullable public static CLCapabilities getICD() { return icd; }

    /**
     * Creates a {@link CLCapabilities} instance for the specified OpenCL platform.
     *
     * <p>This method call is relatively expensive. The result should be cached and reused.</p>
     *
     * @param cl_platform_id the platform to query
     *
     * @return the {@link CLCapabilities instance}
     */
    public static CLCapabilities createPlatformCapabilities(long cl_platform_id) {
        Set<String> supportedExtensions = new HashSet<>(32);

        // Parse PLATFORM_EXTENSIONS string
        CL.addExtensions(getPlatformInfoStringASCII(cl_platform_id, CL_PLATFORM_EXTENSIONS), supportedExtensions);

        // Enumerate devices
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);

            checkCLError(nclGetDeviceIDs(cl_platform_id, CL_DEVICE_TYPE_ALL, 0, NULL, memAddress(pi)));
            int num_devices = pi.get(0);
            if (num_devices != 0) {
                PointerBuffer pp = stack.mallocPointer(num_devices);

                checkCLError(nclGetDeviceIDs(cl_platform_id, CL_DEVICE_TYPE_ALL, num_devices, memAddress(pp), NULL));

                // Add device extensions to the set
                for (int i = 0; i < num_devices; i++) {
                    String extensionsString = getDeviceInfoStringASCII(pp.get(i), CL_DEVICE_EXTENSIONS);
                    CL.addExtensions(extensionsString, supportedExtensions);
                }
            }
        }

        // Parse PLATFORM_VERSION string
        APIVersion version = apiParseVersion(getPlatformInfoStringASCII(cl_platform_id, CL_PLATFORM_VERSION), "OpenCL");
        CL.addCLVersions(version.major, version.minor, supportedExtensions);

        return new CLCapabilities(functionName -> getFunctionProvider().getFunctionAddress(cl_platform_id, functionName), supportedExtensions);
    }

    /**
     * Creates a {@link CLCapabilities} instance for the specified OpenCL device.
     *
     * <p>This method call is relatively expensive. The result should be cached and reused.</p>
     *
     * @param cl_device_id the device to query
     *
     * @return the {@link CLCapabilities instance}
     */
    public static CLCapabilities createDeviceCapabilities(long cl_device_id, CLCapabilities platformCapabilities) {
        Set<String> supportedExtensions = new HashSet<>(32);

        // Parse DEVICE_EXTENSIONS string
        String extensionsString = getDeviceInfoStringASCII(cl_device_id, CL_DEVICE_EXTENSIONS);
        CL.addExtensions(extensionsString, supportedExtensions);

        // Parse DEVICE_VERSION string
        APIVersion version = apiParseVersion(getDeviceInfoStringASCII(cl_device_id, CL_DEVICE_VERSION), "OpenCL");
        CL.addCLVersions(version.major, version.minor, supportedExtensions);

        return new CLCapabilities(platformCapabilities, supportedExtensions);
    }

    static void addExtensions(String extensionsString, Set<String> supportedExtensions) {
        StringTokenizer tokenizer = new StringTokenizer(extensionsString);
        while (tokenizer.hasMoreTokens()) {
            supportedExtensions.add(tokenizer.nextToken());
        }
    }

    /** Must be called after addExtensions. */
    static void addCLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions) {
        addCLVersions(
            MAJOR, MINOR, supportedExtensions, "",
            new int[][] {
                {0, 1, 2}, // 10, 11, 12
                {0, 1, 2}, // 20, 21, 22
            }
        );

        // Detect OpenGL interop
        if (supportedExtensions.contains("cl_khr_gl_sharing") || supportedExtensions.contains("cl_APPLE_gl_sharing")) {
            addCLVersions(
                MAJOR, MINOR, supportedExtensions, "GL",
                new int[][] {
                    {0, 2},    // 10GL, 12GL
                    {}
                }
            );
        }
    }

    private static void addCLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions, String postfix, int[][] versions) {
        for (int major = 1; major <= min(MAJOR, versions.length); major++) {
            for (int minor : versions[major - 1]) {
                if (major == MAJOR && MINOR < minor) {
                    break;
                }

                supportedExtensions.add(String.format("OpenCL%d%d%s", major, minor, postfix));
            }
        }
    }

    static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[CL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

    private static String getPlatformInfoStringASCII(long cl_platform_id, int param_name) {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            checkCLError(clGetPlatformInfo(cl_platform_id, param_name, (ByteBuffer)null, pp));
            int bytes = (int)pp.get(0);

            ByteBuffer buffer = stack.malloc(bytes);
            checkCLError(clGetPlatformInfo(cl_platform_id, param_name, buffer, null));

            return memASCII(buffer, bytes - 1);
        }
    }

    private static String getDeviceInfoStringASCII(long cl_device_id, int param_name) {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            checkCLError(clGetDeviceInfo(cl_device_id, param_name, (ByteBuffer)null, pp));
            int bytes = (int)pp.get(0);

            ByteBuffer buffer = stack.malloc(bytes);
            checkCLError(clGetDeviceInfo(cl_device_id, param_name, buffer, null));

            return memASCII(buffer, bytes - 1);
        }
    }

    private static void checkCLError(int errcode) {
        if (errcode != CL_SUCCESS) {
            throw new RuntimeException(String.format("OpenCL error [%d]", errcode));
        }
    }

}