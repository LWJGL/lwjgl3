/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_debug.txt">KHR_debug</a> extension.
 * 
 * <p>This extension allows EGL to notify applications when various events occur that may be useful during application development and debugging.</p>
 * 
 * <p>These events are represented in the form of debug messages with a human-readable string representation. Examples of debug events include errors due to
 * incorrect use of the EGL API, warnings of undefined behavior, and performance warnings.</p>
 * 
 * <p>The "type" of the message roughly identifies the nature of the event that caused the message. Examples include input errors, performance information,
 * or warnings about undefined behavior.</p>
 * 
 * <p>Messages are communicated to the application through an application- defined callback function that is called by the EGL implementation on each debug
 * message. The motivation for the callback routine is to free application developers from actively having to query whether an EGL error, or any other
 * debuggable event has happened after each call to a EGL function. With a callback, developers can keep their code free of debug checks, set breakpoints
 * in the callback function, and only have to react to messages as they occur. The callback also offers much more information than just an error code.</p>
 * 
 * <p>To control the volume of debug output, types of messages can be enabled or disabled. The mechanism is controlled by attributes passed to EGL. The state
 * of the message type control can be queried.</p>
 * 
 * <p>Debug output can be enabled and disabled by changing the callback function. {@code NULL} will disable the feature while a valid function pointer will enable
 * it.</p>
 * 
 * <p>Finally, this extension defines a mechanism for EGL applications to label their objects (contexts, surfaces, syncs, etc.) with a pointer to an
 * application provided structure. This pointer can be a descriptive string, identifier or pointer to a structure. This enables the application to
 * associate the EGL object with application information. EGL will not interpret this pointer as a string or any other meaning - just attach to the object
 * and pass back in the callback when that object is the primary object of an event.</p>
 */
public class KHRDebug {

    /** Tokens accepted by the {@code objectType} parameter of function {@link #eglLabelObjectKHR LabelObjectKHR}. */
    public static final int
        EGL_OBJECT_THREAD_KHR  = 0x33B0,
        EGL_OBJECT_DISPLAY_KHR = 0x33B1,
        EGL_OBJECT_CONTEXT_KHR = 0x33B2,
        EGL_OBJECT_SURFACE_KHR = 0x33B3,
        EGL_OBJECT_IMAGE_KHR   = 0x33B4,
        EGL_OBJECT_SYNC_KHR    = 0x33B5,
        EGL_OBJECT_STREAM_KHR  = 0x33B6;

    /**
     * Tokens provided by the {@code messageType} parameter of EGLDEBUGPROCKHR or the attributes input to {@link #eglDebugMessageControlKHR DebugMessageControlKHR} or attribute of
     * {@link #eglQueryDebugKHR QueryDebugKHR}.
     */
    public static final int
        EGL_DEBUG_MSG_CRITICAL_KHR = 0x33B9,
        EGL_DEBUG_MSG_ERROR_KHR    = 0x33BA,
        EGL_DEBUG_MSG_WARN_KHR     = 0x33BB,
        EGL_DEBUG_MSG_INFO_KHR     = 0x33BC;

    /** Tokens provided by the input attribute to eglQueryDebugKHR. */
    public static final int EGL_DEBUG_CALLBACK_KHR = 0x33B8;

    protected KHRDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglDebugMessageControlKHR ] ---

    public static int neglDebugMessageControlKHR(long callback, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglDebugMessageControlKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(callback, attrib_list, __functionAddress);
    }

    @NativeType("EGLint")
    public static int eglDebugMessageControlKHR(@NativeType("EGLDEBUGPROCKHR") EGLDebugMessageKHRCallbackI callback, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglDebugMessageControlKHR(callback.address(), memAddressSafe(attrib_list));
    }

    // --- [ eglQueryDebugKHR ] ---

    public static int neglQueryDebugKHR(int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDebugKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDebugKHR(@NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDebugKHR(attribute, memAddress(value)) != 0;
    }

    // --- [ eglLabelObjectKHR ] ---

    @NativeType("EGLint")
    public static int eglLabelObjectKHR(@NativeType("EGLDisplay") long display, @NativeType("EGLenum") int objectType, @NativeType("EGLObjectKHR") long object, @NativeType("EGLLabelKHR") long label) {
        long __functionAddress = EGL.getCapabilities().eglLabelObjectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(object);
            check(label);
        }
        return callPPPI(display, objectType, object, label, __functionAddress);
    }

}