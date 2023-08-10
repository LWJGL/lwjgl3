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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_sync_reuse.txt">EXT_sync_reuse</a> extension.
 * 
 * <p>The original {@code EGLSync} extensions separated sync objects into two types: fence sync objects signaled by one time events in an API command
 * pipeline; and reusable sync objects signaled by commands which can be issued again and again. However, this conflates reusability of the event
 * triggering a sync object with the {@code EGLSync} object itself.</p>
 * 
 * <p>Although the event associated with a fence sync object will only occur once, there is no reason that it can't be replaced with a new event. Doing so
 * would avoid unnecessary allocation and free operations in an application that repeatedly waits for events. With the current interfaces, such
 * applications must constantly create and destroy new {@code EGLSync} objects.</p>
 * 
 * <p>This extension allows all sync objects to be reusable. When a sync object is in the signaled state, it can be reset back to an unsignaled state,
 * regenerating or reevaluating the events that trigger them. For fence sync objects, this means generating a new fence in the current API. For OpenCL
 * event sync objects, this means waiting for a new OpenCL event handle. This mechanism also allows sync objects to be created in the signaled state with
 * no associated fence/event, and have one applied later. Thus all {@code EGLSyncs} required by an application can be allocated up front, before any
 * rendering operations have begun.</p>
 * 
 * <p>Requires {@link EGL15 EGL 1.5} or {@link EGL14 EGL 1.4} with {@link KHRFenceSync KHR_fence_sync}.</p>
 */
public class EXTSyncReuse {

    protected EXTSyncReuse() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglUnsignalSyncEXT ] ---

    public static int neglUnsignalSyncEXT(long dpy, long sync, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglUnsignalSyncEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(dpy, sync, attrib_list, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglUnsignalSyncEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglUnsignalSyncEXT(dpy, sync, memAddressSafe(attrib_list)) != 0;
    }

}