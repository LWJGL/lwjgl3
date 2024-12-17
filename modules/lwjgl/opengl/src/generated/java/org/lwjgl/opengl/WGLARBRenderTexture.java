/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLARBRenderTexture {

    public static final int
        WGL_BIND_TO_TEXTURE_RGB_ARB  = 0x2070,
        WGL_BIND_TO_TEXTURE_RGBA_ARB = 0x2071;

    public static final int
        WGL_TEXTURE_FORMAT_ARB = 0x2072,
        WGL_TEXTURE_TARGET_ARB = 0x2073,
        WGL_MIPMAP_TEXTURE_ARB = 0x2074;

    public static final int
        WGL_TEXTURE_RGB_ARB  = 0x2075,
        WGL_TEXTURE_RGBA_ARB = 0x2076,
        WGL_NO_TEXTURE_ARB   = 0x2077;

    public static final int
        WGL_TEXTURE_CUBE_MAP_ARB = 0x2078,
        WGL_TEXTURE_1D_ARB       = 0x2079,
        WGL_TEXTURE_2D_ARB       = 0x207A;

    public static final int
        WGL_MIPMAP_LEVEL_ARB  = 0x207B,
        WGL_CUBE_MAP_FACE_ARB = 0x207C;

    public static final int
        WGL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB = 0x207D,
        WGL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB = 0x207E,
        WGL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB = 0x207F,
        WGL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB = 0x2080,
        WGL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB = 0x2081,
        WGL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB = 0x2082;

    public static final int
        WGL_FRONT_LEFT_ARB  = 0x2083,
        WGL_FRONT_RIGHT_ARB = 0x2084,
        WGL_BACK_LEFT_ARB   = 0x2085,
        WGL_BACK_RIGHT_ARB  = 0x2086,
        WGL_AUX0_ARB        = 0x2087,
        WGL_AUX1_ARB        = 0x2088,
        WGL_AUX2_ARB        = 0x2089,
        WGL_AUX3_ARB        = 0x208A,
        WGL_AUX4_ARB        = 0x208B,
        WGL_AUX5_ARB        = 0x208C,
        WGL_AUX6_ARB        = 0x208D,
        WGL_AUX7_ARB        = 0x208E,
        WGL_AUX8_ARB        = 0x208F,
        WGL_AUX9_ARB        = 0x2090;

    protected WGLARBRenderTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglBindTexImageARB ] ---

    /** {@code BOOL wglBindTexImageARB(HPBUFFERARB pbuffer, int buffer)} */
    @NativeType("BOOL")
    public static boolean wglBindTexImageARB(@NativeType("HPBUFFERARB") long pbuffer, int buffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglBindTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPI(pbuffer, buffer, __functionAddress) != 0;
    }

    // --- [ wglReleaseTexImageARB ] ---

    /** {@code BOOL wglReleaseTexImageARB(HPBUFFERARB pbuffer, int buffer)} */
    @NativeType("BOOL")
    public static boolean wglReleaseTexImageARB(@NativeType("HPBUFFERARB") long pbuffer, int buffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglReleaseTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPI(pbuffer, buffer, __functionAddress) != 0;
    }

    // --- [ wglSetPbufferAttribARB ] ---

    /** {@code BOOL wglSetPbufferAttribARB(HPBUFFERARB pbuffer, int const * attribList)} */
    public static int nwglSetPbufferAttribARB(long pbuffer, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSetPbufferAttribARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPPI(pbuffer, attribList, __functionAddress);
    }

    /** {@code BOOL wglSetPbufferAttribARB(HPBUFFERARB pbuffer, int const * attribList)} */
    @NativeType("BOOL")
    public static boolean wglSetPbufferAttribARB(@NativeType("HPBUFFERARB") long pbuffer, @NativeType("int const *") @Nullable IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglSetPbufferAttribARB(pbuffer, memAddressSafe(attribList)) != 0;
    }

    /** {@code BOOL wglSetPbufferAttribARB(HPBUFFERARB pbuffer, int const * attribList)} */
    @NativeType("BOOL")
    public static boolean wglSetPbufferAttribARB(@NativeType("HPBUFFERARB") long pbuffer, @NativeType("int const *") int @Nullable [] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSetPbufferAttribARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
            checkNTSafe(attribList);
        }
        return callPPI(pbuffer, attribList, __functionAddress) != 0;
    }

}