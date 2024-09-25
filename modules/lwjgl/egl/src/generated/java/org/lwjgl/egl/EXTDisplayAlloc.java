/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_display_alloc.txt">EXT_display_alloc</a> extension.
 * 
 * <p>The existing semantics of {@code EGLDisplay} object lifetimes work well for applications in which one module manages all EGL usage, and in which EGL
 * displays and the underlying native displays are expected to remain available until application termination once they are instantiated. However, EGL
 * does not provide reasonable semantics for the following use cases:</p>
 * 
 * <ol>
 * <li>Applications that rely on toolkit libraries which use EGL independently from the application itself.</li>
 * <li>Applications that use multiple native display objects with EGL and wish to completely release resources associated with EGLDisplay objects they no
 * longer need.</li>
 * <li>Platforms where the native display connection can be closed, such as X11 or Wayland. If the native display is closed, then there's no possible
 * reasonable behavior for an EGLDisplay.</li>
 * </ol>
 * 
 * <p>This extension solves these problems by adding the ability to create multiple unique, unshared {@code EGLDisplay} objects from the same native display,
 * and to destroy those {@code EGLDisplay} objects when the caller no longer needs them.</p>
 */
public class EXTDisplayAlloc {

    /** Accepted as an attribute in the {@code attrib_list} parameter of {@link EGL15#eglGetPlatformDisplay GetPlatformDisplay} and the {@code name} parameter of {@link EXTDeviceQuery#eglQueryDisplayAttribEXT QueryDisplayAttribEXT}. */
    public static final int EGL_ALLOC_NEW_DISPLAY_EXT = 0x3379;

    protected EXTDisplayAlloc() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglDestroyDisplayEXT ] ---

    /**
     * Destroys an {@code EGLDisplay} handle.
     * 
     * <p>If {@code dpy} is initialized, or if it is current to one or more threads, then is is marked for deletion, and it will be destroyed when it is
     * terminated and no longer current.</p>
     * 
     * <p>After {@code dpy} is destroyed, it is not valid to pass to any EGL function. Subsequent calls to {@link EGL15#eglGetPlatformDisplay GetPlatformDisplay} may re-use the EGLDisplay handle
     * value for new displays.</p>
     * 
     * <p>If {@code dpy} was not created with the {@link #EGL_ALLOC_NEW_DISPLAY_EXT ALLOC_NEW_DISPLAY_EXT} attribute set to {@link EGL10#EGL_TRUE TRUE}, then an {@link EGL10#EGL_BAD_ACCESS BAD_ACCESS} error is generated.</p>
     */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyDisplayEXT(@NativeType("EGLDisplay") long dpy) {
        long __functionAddress = EGL.getCapabilities().eglDestroyDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPI(dpy, __functionAddress) != 0;
    }

}