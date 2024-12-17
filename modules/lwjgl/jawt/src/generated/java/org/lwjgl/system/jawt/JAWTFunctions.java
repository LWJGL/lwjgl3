/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import java.awt.Component;
import java.awt.Frame;

public class JAWTFunctions {

    private static final SharedLibrary JAWT = Library.loadNative(JAWTFunctions.class, "org.lwjgl.jawt", Configuration.JAWT_LIBRARY_NAME, "jawt", apiFindLibrary(System.getProperty("java.home"), "jawt"));

    /** Contains the function pointers loaded from the jawt {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetAWT = apiGetFunctionAddress(JAWT, Pointer.BITS64 || Platform.get() != Platform.WINDOWS ? "JAWT_GetAWT" : "_JAWT_GetAWT@8");

    }

    /** Returns the jawt {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return JAWT;
    }

    public static final int
        JAWT_VERSION_1_3 = 0x10003,
        JAWT_VERSION_1_4 = 0x10004,
        JAWT_VERSION_1_7 = 0x10007,
        JAWT_VERSION_9   = 0x90000;

    public static final int JAWT_MACOSX_USE_CALAYER = 0x80000000;

    public static final int
        JAWT_LOCK_ERROR           = 0x1,
        JAWT_LOCK_CLIP_CHANGED    = 0x2,
        JAWT_LOCK_BOUNDS_CHANGED  = 0x4,
        JAWT_LOCK_SURFACE_CHANGED = 0x8;

    protected JAWTFunctions() {
        throw new UnsupportedOperationException();
    }

    // --- [ JAWT_GetAWT ] ---

    /** {@code jboolean JAWT_GetAWT(JAWT * awt)} */
    public static native boolean nJAWT_GetAWT(long awt, long __functionAddress);

    /** {@code jboolean JAWT_GetAWT(JAWT * awt)} */
    public static boolean nJAWT_GetAWT(long awt) {
        long __functionAddress = Functions.GetAWT;
        return nJAWT_GetAWT(awt, __functionAddress);
    }

    /** {@code jboolean JAWT_GetAWT(JAWT * awt)} */
    @NativeType("jboolean")
    public static boolean JAWT_GetAWT(@NativeType("JAWT *") JAWT awt) {
        return nJAWT_GetAWT(awt.address());
    }

    // --- [ JAWT_DrawingSurface_Lock ] ---

    /** {@code jint JAWT_DrawingSurface_Lock(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    public static int nJAWT_DrawingSurface_Lock(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(ds, __functionAddress);
    }

    /** {@code jint JAWT_DrawingSurface_Lock(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    @NativeType("jint")
    public static int JAWT_DrawingSurface_Lock(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        return nJAWT_DrawingSurface_Lock(ds.address(), __functionAddress);
    }

    // --- [ JAWT_DrawingSurface_GetDrawingSurfaceInfo ] ---

    /** {@code JAWT_DrawingSurfaceInfo * JAWT_DrawingSurface_GetDrawingSurfaceInfo(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    public static long nJAWT_DrawingSurface_GetDrawingSurfaceInfo(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(ds, __functionAddress);
    }

    /** {@code JAWT_DrawingSurfaceInfo * JAWT_DrawingSurface_GetDrawingSurfaceInfo(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    @NativeType("JAWT_DrawingSurfaceInfo *")
    public static @Nullable JAWTDrawingSurfaceInfo JAWT_DrawingSurface_GetDrawingSurfaceInfo(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        long __result = nJAWT_DrawingSurface_GetDrawingSurfaceInfo(ds.address(), __functionAddress);
        return JAWTDrawingSurfaceInfo.createSafe(__result);
    }

    // --- [ JAWT_DrawingSurface_FreeDrawingSurfaceInfo ] ---

    /** {@code void JAWT_DrawingSurface_FreeDrawingSurfaceInfo(JAWT_DrawingSurfaceInfo * dsi, void * __functionAddress)} */
    public static void nJAWT_DrawingSurface_FreeDrawingSurfaceInfo(long dsi, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(dsi, __functionAddress);
    }

    /** {@code void JAWT_DrawingSurface_FreeDrawingSurfaceInfo(JAWT_DrawingSurfaceInfo * dsi, void * __functionAddress)} */
    public static void JAWT_DrawingSurface_FreeDrawingSurfaceInfo(@NativeType("JAWT_DrawingSurfaceInfo *") JAWTDrawingSurfaceInfo dsi, @NativeType("void *") long __functionAddress) {
        nJAWT_DrawingSurface_FreeDrawingSurfaceInfo(dsi.address(), __functionAddress);
    }

    // --- [ JAWT_DrawingSurface_Unlock ] ---

    /** {@code void JAWT_DrawingSurface_Unlock(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    public static void nJAWT_DrawingSurface_Unlock(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ds, __functionAddress);
    }

    /** {@code void JAWT_DrawingSurface_Unlock(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    public static void JAWT_DrawingSurface_Unlock(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        nJAWT_DrawingSurface_Unlock(ds.address(), __functionAddress);
    }

    // --- [ JAWT_GetDrawingSurface ] ---

    /** {@code JAWT_DrawingSurface * JAWT_GetDrawingSurface(jobject target, void * __functionAddress)} */
    public static native long nJAWT_GetDrawingSurface(Object target, long __functionAddress);

    /** {@code JAWT_DrawingSurface * JAWT_GetDrawingSurface(jobject target, void * __functionAddress)} */
    @NativeType("JAWT_DrawingSurface *")
    public static @Nullable JAWTDrawingSurface JAWT_GetDrawingSurface(@NativeType("jobject") Object target, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        long __result = nJAWT_GetDrawingSurface(target, __functionAddress);
        return JAWTDrawingSurface.createSafe(__result);
    }

    // --- [ JAWT_FreeDrawingSurface ] ---

    /** {@code void JAWT_FreeDrawingSurface(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    public static void nJAWT_FreeDrawingSurface(long ds, long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ds, __functionAddress);
    }

    /** {@code void JAWT_FreeDrawingSurface(JAWT_DrawingSurface * ds, void * __functionAddress)} */
    public static void JAWT_FreeDrawingSurface(@NativeType("JAWT_DrawingSurface *") JAWTDrawingSurface ds, @NativeType("void *") long __functionAddress) {
        nJAWT_FreeDrawingSurface(ds.address(), __functionAddress);
    }

    // --- [ JAWT_Lock ] ---

    /** {@code void JAWT_Lock(void * __functionAddress)} */
    public static native void nJAWT_Lock(long __functionAddress);

    /** {@code void JAWT_Lock(void * __functionAddress)} */
    public static void JAWT_Lock(@NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_Lock(__functionAddress);
    }

    // --- [ JAWT_Unlock ] ---

    /** {@code void JAWT_Unlock(void * __functionAddress)} */
    public static native void nJAWT_Unlock(long __functionAddress);

    /** {@code void JAWT_Unlock(void * __functionAddress)} */
    public static void JAWT_Unlock(@NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_Unlock(__functionAddress);
    }

    // --- [ JAWT_GetComponent ] ---

    /** {@code jobject JAWT_GetComponent(void * platformInfo, void * __functionAddress)} */
    public static native @Nullable Component nJAWT_GetComponent(long platformInfo, long __functionAddress);

    /** {@code jobject JAWT_GetComponent(void * platformInfo, void * __functionAddress)} */
    @NativeType("jobject")
    public static @Nullable Component JAWT_GetComponent(@NativeType("void *") long platformInfo, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(platformInfo);
            check(__functionAddress);
        }
        return nJAWT_GetComponent(platformInfo, __functionAddress);
    }

    // --- [ JAWT_CreateEmbeddedFrame ] ---

    /** {@code jobject JAWT_CreateEmbeddedFrame(void * platformInfo, void * __functionAddress)} */
    public static native @Nullable Frame nJAWT_CreateEmbeddedFrame(long platformInfo, long __functionAddress);

    /** {@code jobject JAWT_CreateEmbeddedFrame(void * platformInfo, void * __functionAddress)} */
    @NativeType("jobject")
    public static @Nullable Frame JAWT_CreateEmbeddedFrame(@NativeType("void *") long platformInfo, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(platformInfo);
            check(__functionAddress);
        }
        return nJAWT_CreateEmbeddedFrame(platformInfo, __functionAddress);
    }

    // --- [ JAWT_SetBounds ] ---

    /** {@code void JAWT_SetBounds(jobject embeddedFrame, jint x, jint y, jint w, jint h, void * __functionAddress)} */
    public static native void nJAWT_SetBounds(Frame embeddedFrame, int x, int y, int w, int h, long __functionAddress);

    /** {@code void JAWT_SetBounds(jobject embeddedFrame, jint x, jint y, jint w, jint h, void * __functionAddress)} */
    public static void JAWT_SetBounds(@NativeType("jobject") Frame embeddedFrame, @NativeType("jint") int x, @NativeType("jint") int y, @NativeType("jint") int w, @NativeType("jint") int h, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_SetBounds(embeddedFrame, x, y, w, h, __functionAddress);
    }

    // --- [ JAWT_SynthesizeWindowActivation ] ---

    /** {@code void JAWT_SynthesizeWindowActivation(jobject embeddedFrame, jboolean doActivate, void * __functionAddress)} */
    public static native void nJAWT_SynthesizeWindowActivation(Frame embeddedFrame, boolean doActivate, long __functionAddress);

    /** {@code void JAWT_SynthesizeWindowActivation(jobject embeddedFrame, jboolean doActivate, void * __functionAddress)} */
    public static void JAWT_SynthesizeWindowActivation(@NativeType("jobject") Frame embeddedFrame, @NativeType("jboolean") boolean doActivate, @NativeType("void *") long __functionAddress) {
        if (CHECKS) {
            check(__functionAddress);
        }
        nJAWT_SynthesizeWindowActivation(embeddedFrame, doActivate, __functionAddress);
    }

}