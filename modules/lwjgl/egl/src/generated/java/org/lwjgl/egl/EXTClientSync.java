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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_sync.txt">EXT_client_sync</a> extension.
 * 
 * <p>The {@link KHRReusableSync KHR_reusable_sync} extension defines an {@link KHRReusableSync#EGL_SYNC_REUSABLE_KHR SYNC_REUSABLE_KHR} {@code EGLSync} type which is signaled and unsignaled by client events. The
 * {@link EXTSyncReuse EXT_sync_reuse} extension allows all {@code EGLSyncs} to become reusable. The signaling behavior associated with {@code EGL_SYNC_REUSABLE_KHR}
 * is still desirable, but the name becomes misleading if all {@code EGLSyncs} can be reused. This extension defines an {@code EGLSync} type with
 * equivalent behavior, separating the signaling mechanism from the reusability.</p>
 * 
 * <p>Requires {@link EXTSyncReuse EXT_sync_reuse}.</p>
 */
public class EXTClientSync {

    /**
     * Accepted by the {@code type} parameter of {@link EGL15#eglCreateSync CreateSync}, and returned in {@code value} when {@link EGL15#eglGetSyncAttrib GetSyncAttrib} is called with {@code attribute}
     * {@link EGL15#EGL_SYNC_TYPE SYNC_TYPE}.
     */
    public static final int EGL_SYNC_CLIENT_EXT = 0x3364;

    /** Returned in {@code value} when {@link EGL15#eglGetSyncAttrib GetSyncAttrib} is called with attribute {@link EGL15#EGL_SYNC_CONDITION SYNC_CONDITION}. */
    public static final int EGL_SYNC_CLIENT_SIGNAL_EXT = 0x3365;

    protected EXTClientSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglClientSignalSyncEXT ] ---

    public static int neglClientSignalSyncEXT(long dpy, long sync, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglClientSignalSyncEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(dpy, sync, attrib_list, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglClientSignalSyncEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglClientSignalSyncEXT(dpy, sync, memAddressSafe(attrib_list)) != 0;
    }

}