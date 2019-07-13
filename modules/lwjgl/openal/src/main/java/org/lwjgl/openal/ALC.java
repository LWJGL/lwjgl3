/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import javax.annotation.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class must be used before any OpenAL function is called. It has the following responsibilities:
 * <ul>
 * <li>Loads the OpenAL native library into the JVM process.</li>
 * <li>Creates instances of {@link ALCCapabilities} classes. An {@code ALCCapabilities} instance contains flags for functionality that is available for an
 * OpenAL device. Internally, it also contains function pointers that are only valid for that specific OpenAL device.</li>
 * </ul>
 *
 * <h3>Library lifecycle</h3>
 * <p>The OpenAL library is loaded automatically when this class is initialized. Set the {@link Configuration#OPENAL_EXPLICIT_INIT} option to override this
 * behavior. Manual loading/unloading can be achieved with the {@link #create} and {@link #destroy} functions. The name of the library loaded can be overridden
 * with the {@link Configuration#OPENAL_LIBRARY_NAME} option.</p>
 *
 * <h3>ALCCapabilities creation</h3>
 * <p>Instances of {@code ALCCapabilities} can be created with the {@link #createCapabilities} method. Calling this method is expensive, so
 * {@code ALCCapabilities} instances should be cached in user code.</p>
 *
 * @see AL
 */
public final class ALC {

    @Nullable
    private static FunctionProviderLocal functionProvider;

    @Nullable
    private static ALCCapabilities icd;

    static {
        if (!Configuration.OPENAL_EXPLICIT_INIT.get(false)) {
            create();
        }
    }

    private ALC() {}

    /** Loads the OpenAL native library, using the default library name. */
    public static void create() {
        String libName;
        switch (Platform.get()) {
            case LINUX:
            case MACOSX:
                libName = "openal";
                break;
            case WINDOWS:
                libName = "OpenAL";
                break;
            default:
                throw new IllegalStateException();
        }

        create(Configuration.OPENAL_LIBRARY_NAME.get(Platform.mapLibraryNameBundled(libName)));
    }

    private static class SharedLibraryAL extends SharedLibrary.Delegate implements FunctionProviderLocal {

        private final long alcGetProcAddress = getFunctionAddress("alcGetProcAddress");

        protected SharedLibraryAL(SharedLibrary library) {
            super(library);
            if (alcGetProcAddress == NULL) {
                throw new RuntimeException("A core ALC function is missing. Make sure that the OpenAL library has been loaded correctly.");
            }
        }

        @Override
        public long getFunctionAddress(ByteBuffer functionName) {
            long address = library.getFunctionAddress(functionName);
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLog("Failed to locate address for ALC core function " + memASCII(functionName));
            }
            return address;
        }

        @Override
        public long getFunctionAddress(long handle, ByteBuffer functionName) {
            long address = invokePPP(handle, memAddress(functionName), alcGetProcAddress);
            if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                apiLog("Failed to locate address for ALC extension function " + memASCII(functionName));
            }
            return address;
        }

    }

    /**
     * Loads the OpenAL native library, using the specified library name.
     *
     * @param libName the native library name
     */
    public static void create(String libName) {
        SharedLibrary OPENAL = Library.loadNative(ALC.class, "org.lwjgl.openal", libName, true);
        try {
            create(new SharedLibraryAL(OPENAL));
        } catch (RuntimeException e) {
            OPENAL.free();
            throw e;
        }
    }

    /**
     * Initializes ALC with the specified {@link FunctionProviderLocal}. This method can be used to implement custom ALC library loading.
     *
     * @param functionProvider the provider of ALC function addresses
     */
    public static void create(FunctionProviderLocal functionProvider) {
        if (ALC.functionProvider != null) {
            throw new IllegalStateException("ALC has already been created.");
        }

        ALC.functionProvider = functionProvider;

        icd = new ALCCapabilities(functionProvider, NULL, Collections.emptySet());

        AL.init();
    }

    /** Unloads the OpenAL native library. */
    public static void destroy() {
        if (functionProvider == null) {
            return;
        }

        AL.destroy();

        icd = null;

        if (functionProvider instanceof NativeResource) {
            ((NativeResource)functionProvider).free();
        }
        functionProvider = null;
    }

    static <T> T check(@Nullable T t) {
        if (t == null) {
            throw new IllegalStateException("OpenAL library has not been loaded.");
        }
        return t;
    }

    /** Returns the {@link FunctionProviderLocal} for the OpenAL native library. */
    public static FunctionProviderLocal getFunctionProvider() {
        return check(ALC.functionProvider);
    }

    /** Returns the {@link ALCCapabilities} of the OpenAL implementation. */
    static ALCCapabilities getICD() {
        return check(icd);
    }

    /**
     * Creates a new {@link ALCCapabilities} instance for the specified OpenAL device.
     *
     * @return the {@code ALCCapabilities} instance
     */
    public static ALCCapabilities createCapabilities(long device) {
        FunctionProviderLocal functionProvider = getFunctionProvider();

        // We don't have an ALCCapabilities instance when this method is called
        // so we have to use the native bindings directly.
        long GetIntegerv        = functionProvider.getFunctionAddress("alcGetIntegerv");
        long GetString          = functionProvider.getFunctionAddress("alcGetString");
        long IsExtensionPresent = functionProvider.getFunctionAddress("alcIsExtensionPresent");

        if (GetIntegerv == NULL || GetString == NULL || IsExtensionPresent == NULL) {
            throw new IllegalStateException("Core ALC functions could not be found. Make sure that OpenAL has been loaded.");
        }

        int majorVersion;
        int minorVersion;

        try (MemoryStack stack = stackPush()) {
            IntBuffer version = stack.mallocInt(1);

            invokePPV(device, ALC_MAJOR_VERSION, 1, memAddress(version), GetIntegerv);
            majorVersion = version.get(0);

            invokePPV(device, ALC_MINOR_VERSION, 1, memAddress(version), GetIntegerv);
            minorVersion = version.get(0);
        }

        int[][] ALC_VERSIONS = {
            {0, 1},  // ALC 1
        };

        Set<String> supportedExtensions = new HashSet<>(16);

        for (int major = 1; major <= ALC_VERSIONS.length; major++) {
            int[] minors = ALC_VERSIONS[major - 1];
            for (int minor : minors) {
                if (major < majorVersion || (major == majorVersion && minor <= minorVersion)) {
                    supportedExtensions.add("OpenALC" + major + minor);
                }
            }
        }

        // Parse EXTENSIONS string
        String extensionsString = memASCIISafe(invokePP(device, ALC_EXTENSIONS, GetString));
        if (extensionsString != null) {
            StringTokenizer tokenizer = new StringTokenizer(extensionsString);
            while (tokenizer.hasMoreTokens()) {
                String extName = tokenizer.nextToken();
                try (MemoryStack stack = stackPush()) {
                    if (invokePPZ(device, memAddress(stack.ASCII(extName, true)), IsExtensionPresent)) {
                        supportedExtensions.add(extName);
                    }
                }
            }
        }

        return new ALCCapabilities(functionProvider, device, supportedExtensions);
    }

}