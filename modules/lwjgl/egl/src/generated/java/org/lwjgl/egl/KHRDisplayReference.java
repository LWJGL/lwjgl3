/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_display_reference.txt">KHR_display_reference</a> extension.
 * 
 * <p>The existing semantics of {@code EGLDisplay} object lifetimes work well for applications in which one module manages all EGL usage, and in which EGL
 * displays are expected to remain available until application termination once they are instantiated. However, EGL does not provide reasonable semantics
 * in the case where applications rely on toolkit libraries which use EGL independently from the application itself.</p>
 * 
 * <p>This issue can be solved by adding a per-{@code EGLDisplay} reference counter which is incremented by {@link EGL10#eglInitialize Initialize} calls. Resource destruction can
 * then be deferred until a corresponding number of {@link EGL10#eglTerminate Terminate} calls is made. However, switching to this behavior universally could cause backwards
 * incompatibility problems with existing applications that assume a single {@code eglTerminate} will immediately free resources regardless of how many
 * times the display has been initialized.</p>
 * 
 * <p>We therefore must support both behaviors. A new attribute specified when the {@code EGLDisplay} is obtained will indicate whether or not reference
 * counting is enabled. If an application requests the {@code EGLDisplay} multiple times with different values for this attribute, two separate displays
 * will be returned. The one potential drawaback is that these displays will have independent resource spaces, so objects allocated from one cannot be
 * used by the other. However, the goal here is to support modules that access EGL independently. In such a use case, they are not likely to need to share
 * resources with another module, particularly one that uses a different method for accessing the display.</p>
 * 
 * <p>Requires {@link EXTPlatformBase EXT_platform_base} or {@link EGL15 EGL 1.5}</p>
 */
public class KHRDisplayReference {

    /** Accepted as an attribute in the {@code attrib_list} parameter of {@link EGL15#eglGetPlatformDisplay GetPlatformDisplay} and the {@code name} parameter of {@link #eglQueryDisplayAttribKHR QueryDisplayAttribKHR}. */
    public static final int EGL_TRACK_REFERENCES_KHR = 0x3352;

    protected KHRDisplayReference() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDisplayAttribKHR ] ---

    public static int neglQueryDisplayAttribKHR(long dpy, int name, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, name, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int name, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDisplayAttribKHR(dpy, name, memAddress(value)) != 0;
    }

}