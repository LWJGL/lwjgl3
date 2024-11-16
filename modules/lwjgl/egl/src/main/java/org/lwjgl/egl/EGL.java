/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.egl.EGL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <p>This class must be used before any EGL function is called. It has the following responsibilities:</p>
 * <ul>
 * <li>Loads the EGL native library into the JVM process.</li>
 * <li>Creates instances of {@link EGLCapabilities} classes. An {@code EGLCapabilities} instance contains flags for functionality that is available in an
 * EGLDisplay or the EGL client library. Internally, it also contains function pointers that are only valid in that specific EGLDisplay or client library.</li>
 * </ul>
 *
 * <h3>Library lifecycle</h3>
 * <p>The EGL library is loaded automatically when this class is initialized. Set the {@link Configuration#EGL_EXPLICIT_INIT} option to override this behavior.
 * Manual loading/unloading can be achieved with the {@link #create} and {@link #destroy} functions. The name of the library loaded can be overridden with the
 * {@link Configuration#EGL_LIBRARY_NAME} option.</p>
 *
 * <h3>EGLCapabilities creation</h3>
 * <p>Instances of {@code EGLCapabilities} for an EGLDisplay can be created with the {@link #createDisplayCapabilities} method. Calling this method is
 * expensive, so the {@code EGLCapabilities} instance should be associated with the EGLDisplay and reused as necessary.</p>
 *
 * <p>The {@code EGLCapabilities} instance for the client library is created automatically when the EGL native library is loaded.</p>
 */
public final class EGL {

    private static @Nullable FunctionProvider functionProvider;

    private static @Nullable EGLCapabilities caps;

    static {
        if (!Configuration.EGL_EXPLICIT_INIT.get(false)) {
            create();
        }
    }

    private EGL() {}

    /** Loads the EGL native library, using the default library name. */
    public static void create() {
        SharedLibrary EGL;
        switch (Platform.get()) {
            case FREEBSD:
            case LINUX:
                EGL = Library.loadNative(EGL.class, "org.lwjgl.egl", Configuration.EGL_LIBRARY_NAME, "libEGL.so.1");
                break;
            case MACOSX:
                EGL = Library.loadNative(EGL.class, "org.lwjgl.egl", Configuration.EGL_LIBRARY_NAME, "EGL");
                break;
            case WINDOWS:
                EGL = Library.loadNative(EGL.class, "org.lwjgl.egl", Configuration.EGL_LIBRARY_NAME, "libEGL", "EGL");
                break;
            default:
                throw new IllegalStateException();
        }
        create(EGL);
    }

    /**
     * Loads the EGL native library, using the specified library name.
     *
     * @param libName the native library name
     */
    public static void create(String libName) {
        create(Library.loadNative(EGL.class, "org.lwjgl.egl", libName));
    }

    private static void create(SharedLibrary EGL) {
        try {
            create((FunctionProvider)new SharedLibrary.Delegate(EGL) {
                private final long eglGetProcAddress = library.getFunctionAddress("eglGetProcAddress");

                {
                    if (eglGetProcAddress == NULL) {
                        throw new IllegalStateException("A core EGL function is missing. Make sure that EGL is available.");
                    }
                }

                @Override
                public long getFunctionAddress(ByteBuffer functionName) {
                    long address = callPP(memAddress(functionName), eglGetProcAddress);
                    if (address == NULL) {
                        address = library.getFunctionAddress(functionName);
                        if (address == NULL && Checks.DEBUG_FUNCTIONS) {
                            apiLogMissing("EGL", functionName);
                        }
                    }

                    return address;
                }
            });
        } catch (RuntimeException e) {
            EGL.free();
            throw e;
        }
    }

    /**
     * Initializes EGL with the specified {@link FunctionProvider}. This method can be used to implement custom EGL library loading.
     *
     * @param functionProvider the provider of EGL function addresses
     */
    public static void create(FunctionProvider functionProvider) {
        if (EGL.functionProvider != null) {
            throw new IllegalStateException("EGL has already been created.");
        }

        EGL.functionProvider = functionProvider;

        caps = createClientCapabilities();
    }

    /** Unloads the EGL native library. */
    public static void destroy() {
        if (functionProvider == null) {
            return;
        }

        caps = null;

        if (functionProvider instanceof NativeResource) {
            ((NativeResource)functionProvider).free();
        }
        functionProvider = null;
    }

    static <T> T check(@Nullable T t) {
        if (t == null) {
            throw new IllegalStateException("EGL library has not been loaded.");
        }
        return t;
    }

    /** Returns the {@link FunctionProvider} for the EGL native library. */
    public static FunctionProvider getFunctionProvider() {
        return check(functionProvider);
    }

    /**
     * Returns the {@link EGLCapabilities} instance for the EGL client library.
     *
     * The capability flags in this instance are only set for the core EGL versions and client extensions. This may only happen if EGL 1.5 or the
     * {@link EGLCapabilities#EGL_EXT_client_extensions} extension are supported. If not, all flags will be false and the version fields zero.
     */
    public static EGLCapabilities getCapabilities() {
        return check(caps);
    }

    private static EGLCapabilities createClientCapabilities() {
        FunctionProvider functionProvider = EGL.functionProvider;
        if (functionProvider == null) {
            throw new IllegalStateException("EGL library has not been loaded.");
        }

        Set<String> supportedExtensions = new HashSet<>(32);

        long QueryString = functionProvider.getFunctionAddress("eglQueryString");

        // Available on EGL 1.5 or EGL_EXT_client_extensions
        long extensionsString = callPP(EGL_NO_DISPLAY, EGL_EXTENSIONS, QueryString);
        if (extensionsString == NULL) {
            callI(functionProvider.getFunctionAddress("eglGetError")); // clear error
        } else {
            // Available on EGL 1.5 only
            String versionString = memASCIISafe(callPP(EGL_NO_DISPLAY, EGL_VERSION, QueryString));
            if (versionString == null) {
                callI(functionProvider.getFunctionAddress("eglGetError")); // clear error
            } else {
                APIVersion version = apiParseVersion(versionString);
                addEGLVersions(version.major, version.minor, supportedExtensions);
            }
        }
        apiFilterExtensions(supportedExtensions, Configuration.EGL_EXTENSION_FILTER);

        return new EGLCapabilities(functionProvider, supportedExtensions);
    }

    /**
     * Creates an {@link EGLCapabilities} instance for the specified EGLDisplay handle.
     *
     * <p>This method call is relatively expensive. The result should be cached and reused.</p>
     *
     * @param dpy the EGLDisplay to query
     *
     * @return the {@link EGLCapabilities instance}
     */
    public static EGLCapabilities createDisplayCapabilities(long dpy) {
        String versionString = eglQueryString(dpy, EGL_VERSION);
        if (versionString == null) {
            throw new IllegalArgumentException("Invalid EGLDisplay handle specified.");
        }
        APIVersion version = apiParseVersion(versionString);
        return createDisplayCapabilities(dpy, version.major, version.minor);
    }

    /**
     * Creates an {@link EGLCapabilities} instance for the specified EGLDisplay handle.
     *
     * <p>This method call is relatively expensive. The result should be cached and reused.</p>
     *
     * @param dpy          the EGLDisplay to query
     * @param majorVersion the major EGL version supported by the EGLDisplay, as returned by {@link EGL10#eglInitialize}
     * @param minorVersion the minor EGL version supported by the EGLDisplay, as returned by {@link EGL10#eglInitialize}
     *
     * @return the {@link EGLCapabilities instance}
     */
    public static EGLCapabilities createDisplayCapabilities(long dpy, int majorVersion, int minorVersion) {
        FunctionProvider functionProvider = EGL.functionProvider;
        if (functionProvider == null) {
            throw new IllegalStateException("EGL library has not been loaded.");
        }

        Set<String> supportedExtensions = new HashSet<>(32);

        // Add EGL versions
        addEGLVersions(majorVersion, minorVersion, supportedExtensions);
        // Parse display EGL_EXTENSIONS string
        String extensionsString = eglQueryString(dpy, EGL_EXTENSIONS);
        if (extensionsString != null) {
            addExtensions(extensionsString, supportedExtensions);
        }

        return new EGLCapabilities(Objects.requireNonNull(caps), supportedExtensions);
    }

    private static void addEGLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions) {
        int[][] versions = new int[][] {
            {0, 1, 2, 3, 4, 5} // 10, 11, 12, 13, 14, 15
        };

        for (int M = 1; M <= min(MAJOR, versions.length); M++) {
            for (int m : versions[M - 1]) {
                if (M == MAJOR && MINOR < m) {
                    break;
                }

                supportedExtensions.add("EGL" + M + m);
            }
        }
    }

    private static void addExtensions(String extensionsString, Set<String> supportedExtensions) {
        StringTokenizer tokenizer = new StringTokenizer(extensionsString);
        while (tokenizer.hasMoreTokens()) {
            supportedExtensions.add(tokenizer.nextToken());
        }
    }


}