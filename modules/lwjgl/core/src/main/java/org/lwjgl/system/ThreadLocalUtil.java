/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;

/** This class supports bindings with thread-local data. [INTERNAL USE ONLY] */
public final class ThreadLocalUtil {

    /*
    The following applies to GL and GLES only:

    OpenGL contexts may have different capabilities (core versions, supported extensions, deprecated functionality) and different function pointers (usually
    in multi-GPU setups). A ThreadLocal is used to store the current capabilities instance for each thread. The thread-local lookup that is required for each
    function call hurts JIT code generation. We employ two strategies to eliminate this overhead:

    1) The first capabilities instance encountered is stored in a static write-once holder. This is optimistically assumed to be compatible with all other (if
    any) instances we encounter, which is indeed the case for the vast majority of programs. If an incompatible instance is encountered, there is a fall back
    to the thread-local lookup.

    The above applies to array overload methods only. All other methods use the following technique:

    2) The function pointers of a capabilities instance are stored in an off-heap array, which is then stored in one of the reserved members of the
    jniNativeInterface struct. This struct is then injected to the Hotspot native thread that corresponds to the Java thread in which the capabilities instance
    was made current. When a JNI method is invoked in that thread, it passes its JNIEnv copy to the JNI function, which can then retrieve the correct function
    pointer.

    It works like so:

    typedef struct JNINativeInterface_ {
        void *reserved0;
        void *reserved1;
        void *reserved2;
        void *reserved3;

        // JNI function pointers
    } jniNativeInterface;

    typedef const jniNativeInterface *JNIEnv;

    // Hotspot C++ class
    class JavaThread: public Thread {
        ...
        JNIEnv _jni_environment;
        JNIEnv* jni_environment() { return &_jni_environment; }
        ..
    }

    The injection works because what we get in the JNI function is not a direct pointer to the struct, but a pointer to the JavaThread field that contains the
    pointer to the struct.

    Note that all threads point to the same jniNativeInterface struct. Also note that even though reserved0-3 is public API, the size of the struct is not
    known. New Java versions may add new function pointers at the end of the struct. JVMTI's GetJNIFunctionTable function could be used to return a valid copy,
    but JVMTI is an optional JVM feature and may not be available (e.g. with AOT compilation). The workaround is to call JNI's GetVersion and assume the struct
    has as many function pointers as were available in the corresponding JNI version.

    - On startup, a pointer to the global jniNativeInterface is stored.
    - On setCapabilities:
        * If necessary, a jniNativeInterface copy is created and injected to the current thread (JavaThread::_jni_environment points to the copy).
        * A pointer to the capabilities function pointer array is set to jniNativeInterface::reserved3.
    - On setCapabilities(null):
        * JavaThread::_jni_environment is reset to the global jniNativeInterface.
        * The jniNativeInterface copy is freed.

    The above has the following advantages:

    - Eliminates the thread-local lookup.
    - Less bytecode and perfectly clean JITed code.
    - Works when different threads have incompatible contexts.

    And the following disadvantages:

    - Depends on Hotspot implementation details.
    - Requires custom JNI code for each function.
    - (minor) Function pointers are not checked anymore. Calling an unsupported function causes a segfault.
    - (minor) JVMTI has the ability to intercept JNI functions with SetJNIFunctionTable. This interacts badly with the jniNativeInterface copies, but it should
    be easy to workaround (attaching the agent at startup, making sure no contexts are current when the agent is attached, clearing and setting again the
    capabilities instance).

    Since 3.3.1: the JNIEnv copies are now also used for storing/retrieving the thread-local errno/LastError values.
    */

    /** The global JNIEnv. */
    private static final long JNI_NATIVE_INTERFACE = memGetAddress(getThreadJNIEnv());

    /** The number of pointers in the JNIEnv struct. */
    private static final int JNI_NATIVE_INTERFACE_FUNCTION_COUNT;

    /** A function to delegate to when an unsupported function is called. */
    private static final long FUNCTION_MISSING_ABORT = getFunctionMissingAbort();

    /**
     * An array filled with {@link #FUNCTION_MISSING_ABORT}.
     *
     * <p>The array size depends on whether OpenGL or OpenGL ES is used.</p>
     */
    private static long FUNCTION_MISSING_ABORT_TABLE = NULL;

    /** The offset in JNIEnv at which to store the pointer to the capabilities array. */
    private static final int CAPABILITIES_OFFSET = 3 * POINTER_SIZE;

    static {
        int JNI_VERSION = GetVersion();

        int reservedCount;
        switch (JNI_VERSION) {
            case JNI_VERSION_1_1:
                reservedCount = 12;
                break;
            default:
                reservedCount = 4;
        }

        int jniCallCount;
        switch (JNI_VERSION) {
            case JNI_VERSION_1_1:
                jniCallCount = 208;
                break;
            case JNI_VERSION_1_2:
                jniCallCount = 225;
                break;
            case JNI_VERSION_1_4:
                jniCallCount = 228;
                break;
            case JNI_VERSION_1_6:
            case JNI_VERSION_1_8:
                jniCallCount = 229;
                break;
            case JNI_VERSION_9:
            case JNI_VERSION_10:
                jniCallCount = 230;
                break;
            case JNI_VERSION_19:
            case JNI_VERSION_20:
                jniCallCount = 231;
                break;
            case JNI_VERSION_21:
                jniCallCount = 232;
                break;
            default:
                jniCallCount = 232;
                DEBUG_STREAM
                    .println("[LWJGL] [ThreadLocalUtil] Unsupported JNI version detected, this may result in a crash. Please inform LWJGL developers.");
        }
        JNI_NATIVE_INTERFACE_FUNCTION_COUNT = reservedCount + Configuration.JNI_NATIVE_INTERFACE_FUNCTION_COUNT.get(jniCallCount);
    }

    private ThreadLocalUtil() {
    }

    private static native long getThreadJNIEnv();

    private static native long getFunctionMissingAbort();

    private static native long nsetupEnvData(int functionCount);
    public static long setupEnvData() {
        return nsetupEnvData(JNI_NATIVE_INTERFACE_FUNCTION_COUNT);
    }

    public static void setCapabilities(long capabilities) {
        // Get thread's JNIEnv
        long env_pp = getThreadJNIEnv();
        long env_p  = memGetAddress(env_pp);

        if (capabilities == NULL) {
            if (env_p != JNI_NATIVE_INTERFACE) {
                memPutAddress(env_p + CAPABILITIES_OFFSET, FUNCTION_MISSING_ABORT_TABLE);
            }
        } else {
            if (env_p == JNI_NATIVE_INTERFACE) {
                setupEnvData();
                env_p = memGetAddress(env_pp);
            }
            memPutAddress(env_p + CAPABILITIES_OFFSET, capabilities);
        }
    }

    // Ensures FUNCTION_MISSING_ABORT will be called even if no context is current,
    public static void setFunctionMissingAddresses(int functionCount) {
        // OpenJDK: NULL
        // GraalVM Native Image: pointer to UnimplementedWithJNIEnvArgument function (see #875)
        long RESERVED0_NULL = memGetAddress(JNI_NATIVE_INTERFACE);

        long ptr = JNI_NATIVE_INTERFACE + CAPABILITIES_OFFSET;

        long currentTable = memGetAddress(ptr);
        if (functionCount == 0) {
            if (currentTable != RESERVED0_NULL) {
                FUNCTION_MISSING_ABORT_TABLE = NULL;
                getAllocator().free(currentTable);
                memPutAddress(ptr, NULL);
            }
        } else {
            if (currentTable != RESERVED0_NULL) {
                throw new IllegalStateException("setFunctionMissingAddresses has been called already");
            }
            if (currentTable != NULL) {
                // silently abort on Native Image, the global JNIEnv object lives in read-only memory by default. (see #875)
                return;
            }

            FUNCTION_MISSING_ABORT_TABLE = getAllocator().malloc(Integer.toUnsignedLong(functionCount) * POINTER_SIZE);
            for (int i = 0; i < functionCount; i++) {
                memPutAddress(FUNCTION_MISSING_ABORT_TABLE + Integer.toUnsignedLong(i) * POINTER_SIZE, FUNCTION_MISSING_ABORT);
            }

            memPutAddress(ptr, FUNCTION_MISSING_ABORT_TABLE);
        }
    }

    public static PointerBuffer setupAddressBuffer(PointerBuffer addresses) {
        for (int i = addresses.position(); i < addresses.limit(); i++) {
            if (addresses.get(i) == NULL) {
                addresses.put(i, FUNCTION_MISSING_ABORT);
            }
        }
        return addresses;
    }

    public static boolean areCapabilitiesDifferent(PointerBuffer ref, PointerBuffer caps) {
        for (int i = 0; i < ref.remaining(); i++) {
            if (ref.get(i) != caps.get(i) && caps.get(i) != NULL) {
                return true;
            }
        }
        return false;
    }

}