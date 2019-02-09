/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import javax.annotation.*;
import java.lang.reflect.*;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;

/** This class supports bindings with thread-local contexts. [INTERNAL USE ONLY] */
public final class ThreadLocalUtil {

    /*
    The following applies to GL and GLES only:

    OpenGL contexts may have different capabilities (core versions, supported extensions, deprecated functionality) and different function pointers (usually
    in multi-GPU setups). A ThreadLocal is used to store the current capabilities instance for each thread. The thread-local lookup that is required for each
    function call hurts JIT code generation. We employ two strategies to eliminate this overhead:

    1) The first capabilities instance encountered is stored in a static write-once holder. This is optimistically assumed to be compatible with all other (if
    any) instances we encounter, which is indeed the case for the vast majority of programs. If an incompatible instance is encountered, there is a fall back
    to the thread-local lookup.

    The above is applicable to methods with Critical Natives (i.e. array overloads). All other methods use the following technique:

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
    - (minor) Critical Natives cannot use it, there's no JNIEnv* parameter.
    - (minor) JVMTI has the ability to intercept JNI functions with SetJNIFunctionTable. This interacts badly with the jniNativeInterface copies, but it should
    be easy to workaround (attaching the agent at startup, making sure no contexts are current when the agent is attached, clearing and setting again the
    capabilities instance).
    */

    /** The global JNIEnv. */
    private static final long JNI_NATIVE_INTERFACE = getThreadJNIEnv();

    /** A function to delegate to when an unsupported function is called. */
    private static final long FUNCTION_MISSING_ABORT = getFunctionMissingAbort();

    private static final long SIZE_OF_JNI_NATIVE_INTERFACE;

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
            default:
                jniCallCount = 230;
                DEBUG_STREAM
                    .println("[LWJGL] [ThreadLocalUtil] Unsupported JNI version detected, this may result in a crash. Please inform LWJGL developers.");
        }
        SIZE_OF_JNI_NATIVE_INTERFACE = Integer.toUnsignedLong((reservedCount + jniCallCount)) * POINTER_SIZE;
    }

    private ThreadLocalUtil() {
    }

    private static native long getThreadJNIEnv();

    private static native void setThreadJNIEnv(long JNIEnv);

    private static native long getFunctionMissingAbort();

    public static void setEnv(long capabilities, int index) {
        if (index < 0 || 3 < index) { // reserved0-3
            throw new IndexOutOfBoundsException();
        }

        // Get thread's JNIEnv
        long env = getThreadJNIEnv();

        if (capabilities == NULL) {
            if (env != JNI_NATIVE_INTERFACE) {
                setThreadJNIEnv(JNI_NATIVE_INTERFACE);
                nmemFree(env);
            }
        } else {
            if (env == JNI_NATIVE_INTERFACE) {
                long newEnv = nmemAllocChecked(SIZE_OF_JNI_NATIVE_INTERFACE);
                memCopy(env, newEnv, SIZE_OF_JNI_NATIVE_INTERFACE);
                setThreadJNIEnv(env = newEnv);
            }

            memPutAddress(env + Integer.toUnsignedLong(index) * POINTER_SIZE, capabilities);
        }
    }

    private static List<Field> getFieldsFromCapabilities(Class<?> capabilitiesClass) {
        List<Field> fields = new ArrayList<>();
        for (Field field : capabilitiesClass.getFields()) {
            if (field.getType() == long.class) {
                fields.add(field);
            }
        }
        return fields;
    }

    // Ensures FUNCTION_MISSING_ABORT will be called even if no context is current,
    public static void setFunctionMissingAddresses(@Nullable Class<?> capabilitiesClass, int index) {
        if (capabilitiesClass == null) {
            long missingCaps = memGetAddress(JNI_NATIVE_INTERFACE + Integer.toUnsignedLong(index) * POINTER_SIZE);
            if (missingCaps != NULL) {
                getAllocator().free(missingCaps);
                memPutAddress(JNI_NATIVE_INTERFACE + Integer.toUnsignedLong(index) * POINTER_SIZE, NULL);
            }
        } else {
            int functionCount = getFieldsFromCapabilities(capabilitiesClass).size();

            long missingCaps = getAllocator().malloc(Integer.toUnsignedLong(functionCount) * POINTER_SIZE);
            for (int i = 0; i < functionCount; i++) {
                memPutAddress(missingCaps + Integer.toUnsignedLong(i) * POINTER_SIZE, FUNCTION_MISSING_ABORT);
            }

            memPutAddress(JNI_NATIVE_INTERFACE + Integer.toUnsignedLong(index) * POINTER_SIZE, missingCaps);
        }
    }

    public static PointerBuffer getAddressesFromCapabilities(Object caps) {
        List<Field>   fields    = getFieldsFromCapabilities(caps.getClass());
        PointerBuffer addresses = BufferUtils.createPointerBuffer(fields.size());

        try {
            for (int i = 0; i < fields.size(); i++) {
                long a = fields.get(i).getLong(caps);
                addresses.put(i, a != NULL ? a : FUNCTION_MISSING_ABORT);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
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