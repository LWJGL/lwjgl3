/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import javax.annotation.*;
import java.nio.*;
import java.util.*;
import java.util.function.*;

import static java.lang.Math.*;
import static org.lwjgl.opengles.GLES30.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class must be used before any OpenGL ES function is called. It has the following responsibilities:
 * <ul>
 * <li>Loads the OpenGL ES native library into the JVM process.</li>
 * <li>Creates instances of {@link GLESCapabilities} classes. A {@code GLESCapabilities} instance contains flags for functionality that is available in an
 * OpenGL ES context. Internally, it also contains function pointers that are only valid in that specific OpenGL ES context.</li>
 * <li>Maintains thread-local state for {@code GLESCapabilities} instances, corresponding to OpenGL ES contexts that are current in those threads.</li>
 * </ul>
 *
 * <h3>Library lifecycle</h3>
 * <p>The OpenGL ES library is loaded automatically when this class is initialized. Set the {@link Configuration#OPENGLES_EXPLICIT_INIT} option to override
 * this behavior. Manual loading/unloading can be achieved with the {@link #create} and {@link #destroy} functions. The name of the library loaded can
 * be overridden with the {@link Configuration#OPENGLES_LIBRARY_NAME} option. The maximum OpenGL ES version loaded can be set with the
 * {@link Configuration#OPENGLES_MAXVERSION} option. This can be useful to ensure that no functionality above a specific version is used during development.</p>
 *
 * <h3>GLESCapabilities creation</h3>
 * <p>Instances of {@code GLESCapabilities} can be created with the {@link #createCapabilities} method. An OpenGL ES context must be current in the current
 * thread before it is called. Calling this method is expensive, so the {@code GLESCapabilities} instance should be associated with the OpenGL ES context and
 * reused as necessary.</p>
 *
 * <h3>Thread-local state</h3>
 * <p>Before a function for a given OpenGL ES context can be called, the corresponding {@code GLESCapabilities} instance must be passed to the {@link
 * #setCapabilities} method. The user is also responsible for clearing the current {@code GLESCapabilities} instance when the context is destroyed or made
 * current in another thread.</p>
 *
 * <p>Note that the {@link #createCapabilities} method implicitly calls {@link #setCapabilities} with the newly created instance.</p>
 */
public final class GLES {

    @Nullable
    private static final APIVersion MAX_VERSION;

    @Nullable
    private static FunctionProvider functionProvider;

    private static final ThreadLocal<GLESCapabilities> capabilitiesTLS = new ThreadLocal<>();

    private static ICD icd = new ICDStatic();

    static {
        Library.loadSystem(System::load, System::loadLibrary, GLES.class, "org.lwjgl.opengles", Platform.mapLibraryNameBundled("lwjgl_opengles"));

        MAX_VERSION = apiParseVersion(Configuration.OPENGLES_MAXVERSION);

        if (!Configuration.OPENGLES_EXPLICIT_INIT.get(false)) {
            create();
        }
    }

    private GLES() {}

    /** Ensures that the lwjgl_opengles shared library has been loaded. */
    static void initialize() {
        // intentionally empty to trigger static initializer
    }

    /** Loads the OpenGL ES native library, using the default library name. */
    public static void create() {
        SharedLibrary GLES;
        switch (Platform.get()) {
            case LINUX:
                GLES = Library.loadNative(GLES.class, "org.lwjgl.opengles", Configuration.OPENGLES_LIBRARY_NAME, "libGLESv2.so.2");
                break;
            case MACOSX:
                GLES = Library.loadNative(GLES.class, "org.lwjgl.opengles", Configuration.OPENGLES_LIBRARY_NAME, "GLESv2");
                break;
            case WINDOWS:
                GLES = Library.loadNative(GLES.class, "org.lwjgl.opengles", Configuration.OPENGLES_LIBRARY_NAME, "libGLESv2", "GLESv2");
                break;
            default:
                throw new IllegalStateException();
        }
        create(GLES);
    }

    /**
     * Loads the OpenGL ES native library, using the specified library name.
     *
     * @param libName the native library name
     */
    public static void create(String libName) {
        create(Library.loadNative(GLES.class, "org.lwjgl.opengles", libName));
    }

    @Nullable
    private static FunctionProvider getContextProvider() {
        FunctionProvider provider = null;

        String contextAPI = Configuration.OPENGLES_CONTEXT_API.get();
        if (contextAPI == null || "EGL".equals(contextAPI)) {
            try {
                provider = (FunctionProvider)Class
                    .forName("org.lwjgl.egl.EGL")
                    .getMethod("getFunctionProvider")
                    .invoke(null);
            } catch (Throwable ignored) {
                apiLog("[GLES] Failed to initialize EGL");
            }
        }

        if (provider == null && (contextAPI == null || "native".equals(contextAPI))) {
            try {
                provider = (FunctionProvider)Class
                    .forName("org.lwjgl.opengl.GL")
                    .getMethod("getFunctionProvider")
                    .invoke(null);
            } catch (Throwable ignored) {
                apiLog("[GLES] Failed to initialize OpenGL");
            }
        }

        return provider;
    }

    private static void create(SharedLibrary GLES) {
        FunctionProvider contextProvider = getContextProvider();
        if (contextProvider == null) {
            GLES.free();
            throw new IllegalStateException("There is no OpenGL ES context management API available.");
        }

        try {
            create((FunctionProvider)new SharedLibrary.Delegate(GLES) {
                @Override
                public long getFunctionAddress(ByteBuffer functionName) {
                    long address = contextProvider.getFunctionAddress(functionName);
                    if (address == NULL) {
                        address = library.getFunctionAddress(functionName);
                        if (address == NULL && DEBUG_FUNCTIONS) {
                            apiLog("Failed to locate address for GLES function " + memASCII(functionName));
                        }
                    }

                    return address;
                }
            });
        } catch (RuntimeException e) {
            GLES.free();
            throw e;
        }
    }

    /**
     * Initializes OpenGL ES with the specified {@link FunctionProvider}. This method can be used to implement custom OpenGL ES library loading.
     *
     * @param functionProvider the provider of OpenGL ES function addresses
     */
    public static void create(FunctionProvider functionProvider) {
        if (GLES.functionProvider != null) {
            throw new IllegalStateException("OpenGL ES has already been created.");
        }

        GLES.functionProvider = functionProvider;
        ThreadLocalUtil.setFunctionMissingAddresses(GLESCapabilities.ADDRESS_BUFFER_SIZE);
    }
    /** Unloads the OpenGL ES native library. */
    public static void destroy() {
        if (functionProvider == null) {
            return;
        }

        ThreadLocalUtil.setFunctionMissingAddresses(0);

        if (functionProvider instanceof NativeResource) {
            ((NativeResource)functionProvider).free();
        }
        functionProvider = null;
    }

    /** Returns the {@link FunctionProvider} for the OpenGL ES native library. */
    @Nullable
    public static FunctionProvider getFunctionProvider() {
        return functionProvider;
    }

    /**
     * Sets the {@link GLESCapabilities} of the OpenGL ES context that is current in the current thread.
     *
     * <p>This {@code GLESCapabilities} instance will be used by any OpenGL ES call in the current thread, until {@code setCapabilities} is called again with
     * a different value.</p>
     */
    public static void setCapabilities(@Nullable GLESCapabilities caps) {
        capabilitiesTLS.set(caps);
        ThreadLocalUtil.setCapabilities(caps == null ? NULL : memAddress(caps.addresses));
        icd.set(caps);
    }

    /**
     * Returns the {@link GLESCapabilities} of the OpenGL ES context that is current in the current thread.
     *
     * @throws IllegalStateException if {@link #setCapabilities} has never been called in the current thread or was last called with a {@code null} value
     */
    public static GLESCapabilities getCapabilities() {
        return checkCapabilities(capabilitiesTLS.get());
    }

    private static GLESCapabilities checkCapabilities(@Nullable GLESCapabilities caps) {
        if (caps == null) {
            throw new IllegalStateException(
                "No GLESCapabilities instance set for the current thread. Possible solutions:\n" +
                "\ta) Call GLES.createCapabilities() after making a context current in the current thread.\n" +
                "\tb) Call GLES.setCapabilities() if a GLESCapabilities instance already exists for the current context."
            );
        }
        return caps;
    }

    /**
     * Creates a new {@link GLESCapabilities} instance for the OpenGL ES context that is current in the current thread.
     *
     * <p>This method calls {@link #setCapabilities(GLESCapabilities)} with the new instance before returning.</p>
     *
     * @return the {@code GLESCapabilities} instance
     *
     * @throws IllegalStateException if no OpenGL ES context is current in the current thread
     */
    public static GLESCapabilities createCapabilities() {
        return createCapabilities(null);
    }

    /**
     * Creates a new {@link GLESCapabilities} instance for the OpenGL ES context that is current in the current thread.
     *
     * <p>This method calls {@link #setCapabilities(GLESCapabilities)} with the new instance before returning.</p>
     *
     * @param bufferFactory a function that allocates a {@link PointerBuffer} given a size. The buffer must be filled with zeroes. If {@code null}, LWJGL will
     *                      allocate a GC-managed buffer internally.
     *
     * @return the {@code GLESCapabilities} instance
     *
     * @throws IllegalStateException if no OpenGL ES context is current in the current thread
     */
    public static GLESCapabilities createCapabilities(@Nullable IntFunction<PointerBuffer> bufferFactory) {
        FunctionProvider functionProvider = GLES.functionProvider;
        if (functionProvider == null) {
            throw new IllegalStateException("OpenGL ES library not been loaded.");
        }

        // We don't have a current GLESCapabilities when this method is called
        // so we have to use the native bindings directly.
        long GetError    = functionProvider.getFunctionAddress("glGetError");
        long GetString   = functionProvider.getFunctionAddress("glGetString");
        long GetIntegerv = functionProvider.getFunctionAddress("glGetIntegerv");

        if (GetError == NULL || GetString == NULL || GetIntegerv == NULL) {
            throw new IllegalStateException(
                "Core OpenGL ES functions could not be found. Make sure that the OpenGL ES library has been loaded correctly."
            );
        }

        int errorCode = callI(GetError);
        if (errorCode != GL_NO_ERROR) {
            apiLog(String.format("An OpenGL ES context was in an error state before the creation of its capabilities instance. Error: [0x%X]", errorCode));
        }

        int majorVersion;
        int minorVersion;

        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.ints(0);

            // Try the 3.0+ version query first
            callPV(GL_MAJOR_VERSION, memAddress(pi), GetIntegerv);
            if (callI(GetError) == GL_NO_ERROR && 3 <= (majorVersion = pi.get(0))) {
                // We're on an 3.0+ context.
                callPV(GL_MINOR_VERSION, memAddress(pi), GetIntegerv);
                minorVersion = pi.get(0);
            } else {
                // Fallback to the string query.
                String versionString = memUTF8Safe(callP(GL_VERSION, GetString));
                if (versionString == null || callI(GetError) != GL_NO_ERROR) {
                    throw new IllegalStateException("There is no OpenGL ES context current in the current thread.");
                }

                APIVersion version = apiParseVersion(versionString);

                majorVersion = version.major;
                minorVersion = version.minor;
            }
        }

        if (majorVersion < 2) {
            throw new IllegalStateException("OpenGL ES 2.0 is required.");
        }

        int[] GL_VERSIONS = {
            -1, // OpenGL ES 1.0 not supported
            0, // OpenGL ES 2.0
            2 // OpenGL ES 3.0 to 3.2
        };

        Set<String> supportedExtensions = new HashSet<>(128);

        int maxMajor = min(majorVersion, GL_VERSIONS.length);
        if (MAX_VERSION != null) {
            maxMajor = min(MAX_VERSION.major, maxMajor);
        }
        for (int M = 2; M <= maxMajor; M++) {
            int maxMinor = GL_VERSIONS[M - 1];
            if (M == majorVersion) {
                maxMinor = min(minorVersion, maxMinor);
            }
            if (MAX_VERSION != null && M == MAX_VERSION.major) {
                maxMinor = min(MAX_VERSION.minor, maxMinor);
            }

            for (int m = 0; m <= maxMinor; m++) {
                supportedExtensions.add(String.format("GLES%d%d", M, m));
            }
        }

        if (majorVersion < 3) {
            // Parse EXTENSIONS string
            String extensionsString = memASCIISafe(callP(GL_EXTENSIONS, GetString));
            if (extensionsString != null) {
                StringTokenizer tokenizer = new StringTokenizer(extensionsString);
                while (tokenizer.hasMoreTokens()) {
                    supportedExtensions.add(tokenizer.nextToken());
                }
            }
        } else {
            // Use indexed EXTENSIONS
            int extensionCount;

            try (MemoryStack stack = stackPush()) {
                IntBuffer pi = stack.ints(0);

                callPV(GL_NUM_EXTENSIONS, memAddress(pi), GetIntegerv);
                extensionCount = pi.get(0);
            }

            long GetStringi = apiGetFunctionAddress(functionProvider, "glGetStringi");
            for (int i = 0; i < extensionCount; i++) {
                supportedExtensions.add(memASCII(callP(GL_EXTENSIONS, i, GetStringi)));
            }
        }
        apiFilterExtensions(supportedExtensions, Configuration.OPENGLES_EXTENSION_FILTER);

        GLESCapabilities caps = new GLESCapabilities(functionProvider, supportedExtensions, bufferFactory == null ? BufferUtils::createPointerBuffer : bufferFactory);

        setCapabilities(caps);

        return caps;
    }

    // Only used by array overloads
    static GLESCapabilities getICD() {
        return checkCapabilities(icd.get());
    }

    /** Function pointer provider. */
    private interface ICD {
        default void set(@Nullable GLESCapabilities caps) {}
        @Nullable GLESCapabilities get();
    }

    /**
     * Write-once {@link ICD}.
     *
     * <p>This is the default implementation that skips the thread-local lookup. When a new GLESCapabilities is set, we compare it to the write-once
     * capabilities. If different function pointers are found, we fall back to the expensive lookup.</p>
     */
    private static class ICDStatic implements ICD {

        @Nullable
        private static GLESCapabilities tempCaps;

        @SuppressWarnings("AssignmentToStaticFieldFromInstanceMethod")
        @Override
        public void set(@Nullable GLESCapabilities caps) {
            if (tempCaps == null) {
                tempCaps = caps;
            } else if (caps != null && caps != tempCaps && ThreadLocalUtil.areCapabilitiesDifferent(tempCaps.addresses, caps.addresses)) {
                apiLog("[WARNING] Incompatible context detected. Falling back to thread-local lookup for GLES contexts.");
                icd = GLES::getCapabilities; // fall back to thread/process lookup
            }
        }

        @Override
        public GLESCapabilities get() {
            return WriteOnce.caps;
        }

        private static final class WriteOnce {
            // This will be initialized the first time get() above is called
            static final GLESCapabilities caps;

            static {
                GLESCapabilities tempCaps = ICDStatic.tempCaps;
                if (tempCaps == null) {
                    throw new IllegalStateException("No GLESCapabilities instance has been set");
                }
                caps = tempCaps;
            }
        }

    }

}