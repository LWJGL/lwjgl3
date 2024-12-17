/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class WGLARBBufferRegion {

    public static final int
        WGL_FRONT_COLOR_BUFFER_BIT_ARB = 0x1,
        WGL_BACK_COLOR_BUFFER_BIT_ARB  = 0x2,
        WGL_DEPTH_BUFFER_BIT_ARB       = 0x4,
        WGL_STENCIL_BUFFER_BIT_ARB     = 0x8;

    protected WGLARBBufferRegion() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCreateBufferRegionARB ] ---

    /** {@code HANDLE wglCreateBufferRegionARB(HDC hdc, int layerPlane, UINT type)} */
    @NativeType("HANDLE")
    public static long wglCreateBufferRegionARB(@NativeType("HDC") long hdc, int layerPlane, @NativeType("UINT") int type) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPP(hdc, layerPlane, type, __functionAddress);
    }

    // --- [ wglDeleteBufferRegionARB ] ---

    /** {@code VOID wglDeleteBufferRegionARB(HANDLE region)} */
    @NativeType("VOID")
    public static void wglDeleteBufferRegionARB(@NativeType("HANDLE") long region) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDeleteBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(region);
        }
        callPV(region, __functionAddress);
    }

    // --- [ wglSaveBufferRegionARB ] ---

    /** {@code BOOL wglSaveBufferRegionARB(HANDLE region, int x, int y, int width, int height)} */
    @NativeType("BOOL")
    public static boolean wglSaveBufferRegionARB(@NativeType("HANDLE") long region, int x, int y, int width, int height) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSaveBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(region);
        }
        return callPI(region, x, y, width, height, __functionAddress) != 0;
    }

    // --- [ wglRestoreBufferRegionARB ] ---

    /** {@code BOOL wglRestoreBufferRegionARB(HANDLE region, int x, int y, int width, int height, int xSrc, int ySrc)} */
    @NativeType("BOOL")
    public static boolean wglRestoreBufferRegionARB(@NativeType("HANDLE") long region, int x, int y, int width, int height, int xSrc, int ySrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglRestoreBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(region);
        }
        return callPI(region, x, y, width, height, xSrc, ySrc, __functionAddress) != 0;
    }

}