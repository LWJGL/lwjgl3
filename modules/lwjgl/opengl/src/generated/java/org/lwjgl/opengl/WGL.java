/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.*;

public class WGL {

    static { GL.initialize(); }

    /** Contains the function pointers loaded from {@code GL.getFunctionProvider()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateContext      = apiGetFunctionAddress(GL.getFunctionProvider(), "wglCreateContext"),
            CreateLayerContext = apiGetFunctionAddress(GL.getFunctionProvider(), "wglCreateLayerContext"),
            CopyContext        = apiGetFunctionAddress(GL.getFunctionProvider(), "wglCopyContext"),
            DeleteContext      = apiGetFunctionAddress(GL.getFunctionProvider(), "wglDeleteContext"),
            GetCurrentContext  = apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetCurrentContext"),
            GetCurrentDC       = apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetCurrentDC"),
            GetProcAddress     = apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetProcAddress"),
            MakeCurrent        = apiGetFunctionAddress(GL.getFunctionProvider(), "wglMakeCurrent"),
            ShareLists         = apiGetFunctionAddress(GL.getFunctionProvider(), "wglShareLists");

    }

    public static final int
        WGL_FONT_LINES    = 0,
        WGL_FONT_POLYGONS = 1;

    public static final int
        WGL_SWAP_MAIN_PLANE = 0x1,
        WGL_SWAP_OVERLAY1   = 0x2,
        WGL_SWAP_OVERLAY2   = 0x4,
        WGL_SWAP_OVERLAY3   = 0x8,
        WGL_SWAP_OVERLAY4   = 0x10,
        WGL_SWAP_OVERLAY5   = 0x20,
        WGL_SWAP_OVERLAY6   = 0x40,
        WGL_SWAP_OVERLAY7   = 0x80,
        WGL_SWAP_OVERLAY8   = 0x100,
        WGL_SWAP_OVERLAY9   = 0x200,
        WGL_SWAP_OVERLAY10  = 0x400,
        WGL_SWAP_OVERLAY11  = 0x800,
        WGL_SWAP_OVERLAY12  = 0x1000,
        WGL_SWAP_OVERLAY13  = 0x2000,
        WGL_SWAP_OVERLAY14  = 0x4000,
        WGL_SWAP_OVERLAY15  = 0x8000,
        WGL_SWAP_UNDERLAY1  = 0x10000,
        WGL_SWAP_UNDERLAY2  = 0x20000,
        WGL_SWAP_UNDERLAY3  = 0x40000,
        WGL_SWAP_UNDERLAY4  = 0x80000,
        WGL_SWAP_UNDERLAY5  = 0x100000,
        WGL_SWAP_UNDERLAY6  = 0x200000,
        WGL_SWAP_UNDERLAY7  = 0x400000,
        WGL_SWAP_UNDERLAY8  = 0x800000,
        WGL_SWAP_UNDERLAY9  = 0x1000000,
        WGL_SWAP_UNDERLAY10 = 0x2000000,
        WGL_SWAP_UNDERLAY11 = 0x4000000,
        WGL_SWAP_UNDERLAY12 = 0x8000000,
        WGL_SWAP_UNDERLAY13 = 0x10000000,
        WGL_SWAP_UNDERLAY14 = 0x20000000,
        WGL_SWAP_UNDERLAY15 = 0x40000000;

    protected WGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCreateContext ] ---

    /** {@code HGLRC wglCreateContext(HDC hdc)} */
    public static native long nwglCreateContext(long _GetLastError, long hdc, long __functionAddress);

    /** {@code HGLRC wglCreateContext(HDC hdc)} */
    public static long nwglCreateContext(long _GetLastError, long hdc) {
        long __functionAddress = Functions.CreateContext;
        if (CHECKS) {
            check(hdc);
        }
        return nwglCreateContext(_GetLastError, hdc, __functionAddress);
    }

    /** {@code HGLRC wglCreateContext(HDC hdc)} */
    @NativeType("HGLRC")
    public static long wglCreateContext(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglCreateContext(memAddressSafe(_GetLastError), hdc);
    }

    // --- [ wglCreateLayerContext ] ---

    /** {@code HGLRC wglCreateLayerContext(HDC hdc, int layerPlane)} */
    public static native long nwglCreateLayerContext(long _GetLastError, long hdc, int layerPlane, long __functionAddress);

    /** {@code HGLRC wglCreateLayerContext(HDC hdc, int layerPlane)} */
    public static long nwglCreateLayerContext(long _GetLastError, long hdc, int layerPlane) {
        long __functionAddress = Functions.CreateLayerContext;
        if (CHECKS) {
            check(hdc);
        }
        return nwglCreateLayerContext(_GetLastError, hdc, layerPlane, __functionAddress);
    }

    /** {@code HGLRC wglCreateLayerContext(HDC hdc, int layerPlane)} */
    @NativeType("HGLRC")
    public static long wglCreateLayerContext(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc, int layerPlane) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglCreateLayerContext(memAddressSafe(_GetLastError), hdc, layerPlane);
    }

    // --- [ wglCopyContext ] ---

    /** {@code BOOL wglCopyContext(HGLRC src, HGLRC dst, UINT mask)} */
    public static native int nwglCopyContext(long _GetLastError, long src, long dst, int mask, long __functionAddress);

    /** {@code BOOL wglCopyContext(HGLRC src, HGLRC dst, UINT mask)} */
    public static int nwglCopyContext(long _GetLastError, long src, long dst, int mask) {
        long __functionAddress = Functions.CopyContext;
        if (CHECKS) {
            check(src);
            check(dst);
        }
        return nwglCopyContext(_GetLastError, src, dst, mask, __functionAddress);
    }

    /** {@code BOOL wglCopyContext(HGLRC src, HGLRC dst, UINT mask)} */
    @NativeType("BOOL")
    public static boolean wglCopyContext(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HGLRC") long src, @NativeType("HGLRC") long dst, @NativeType("UINT") int mask) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglCopyContext(memAddressSafe(_GetLastError), src, dst, mask) != 0;
    }

    // --- [ wglDeleteContext ] ---

    /** {@code BOOL wglDeleteContext(HGLRC context)} */
    public static native int nwglDeleteContext(long _GetLastError, long context, long __functionAddress);

    /** {@code BOOL wglDeleteContext(HGLRC context)} */
    public static int nwglDeleteContext(long _GetLastError, long context) {
        long __functionAddress = Functions.DeleteContext;
        if (CHECKS) {
            check(context);
        }
        return nwglDeleteContext(_GetLastError, context, __functionAddress);
    }

    /** {@code BOOL wglDeleteContext(HGLRC context)} */
    @NativeType("BOOL")
    public static boolean wglDeleteContext(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HGLRC") long context) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglDeleteContext(memAddressSafe(_GetLastError), context) != 0;
    }

    // --- [ wglGetCurrentContext ] ---

    /** {@code HGLRC wglGetCurrentContext(void)} */
    public static native long nwglGetCurrentContext(long _GetLastError, long __functionAddress);

    /** {@code HGLRC wglGetCurrentContext(void)} */
    public static long nwglGetCurrentContext(long _GetLastError) {
        long __functionAddress = Functions.GetCurrentContext;
        return nwglGetCurrentContext(_GetLastError, __functionAddress);
    }

    /** {@code HGLRC wglGetCurrentContext(void)} */
    @NativeType("HGLRC")
    public static long wglGetCurrentContext(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglGetCurrentContext(memAddressSafe(_GetLastError));
    }

    // --- [ wglGetCurrentDC ] ---

    /** {@code HDC wglGetCurrentDC(void)} */
    @NativeType("HDC")
    public static long wglGetCurrentDC() {
        long __functionAddress = Functions.GetCurrentDC;
        return callP(__functionAddress);
    }

    // --- [ wglGetProcAddress ] ---

    /** {@code PROC wglGetProcAddress(LPCSTR proc)} */
    public static native long nwglGetProcAddress(long _GetLastError, long proc, long __functionAddress);

    /** {@code PROC wglGetProcAddress(LPCSTR proc)} */
    public static long nwglGetProcAddress(long _GetLastError, long proc) {
        long __functionAddress = Functions.GetProcAddress;
        return nwglGetProcAddress(_GetLastError, proc, __functionAddress);
    }

    /** {@code PROC wglGetProcAddress(LPCSTR proc)} */
    @NativeType("PROC")
    public static long wglGetProcAddress(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCSTR") ByteBuffer proc) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT1(proc);
        }
        return nwglGetProcAddress(memAddressSafe(_GetLastError), memAddress(proc));
    }

    /** {@code PROC wglGetProcAddress(LPCSTR proc)} */
    @NativeType("PROC")
    public static long wglGetProcAddress(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCSTR") CharSequence proc) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            return nwglGetProcAddress(memAddressSafe(_GetLastError), procEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ wglMakeCurrent ] ---

    /** {@code BOOL wglMakeCurrent(HDC hdc, HGLRC hglrc)} */
    public static native int nwglMakeCurrent(long _GetLastError, long hdc, long hglrc, long __functionAddress);

    /** {@code BOOL wglMakeCurrent(HDC hdc, HGLRC hglrc)} */
    public static int nwglMakeCurrent(long _GetLastError, long hdc, long hglrc) {
        long __functionAddress = Functions.MakeCurrent;
        return nwglMakeCurrent(_GetLastError, hdc, hglrc, __functionAddress);
    }

    /** {@code BOOL wglMakeCurrent(HDC hdc, HGLRC hglrc)} */
    @NativeType("BOOL")
    public static boolean wglMakeCurrent(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc, @NativeType("HGLRC") long hglrc) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglMakeCurrent(memAddressSafe(_GetLastError), hdc, hglrc) != 0;
    }

    // --- [ wglShareLists ] ---

    /** {@code BOOL wglShareLists(HGLRC hglrc1, HGLRC hglrc2)} */
    public static native int nwglShareLists(long _GetLastError, long hglrc1, long hglrc2, long __functionAddress);

    /** {@code BOOL wglShareLists(HGLRC hglrc1, HGLRC hglrc2)} */
    public static int nwglShareLists(long _GetLastError, long hglrc1, long hglrc2) {
        long __functionAddress = Functions.ShareLists;
        if (CHECKS) {
            check(hglrc1);
            check(hglrc2);
        }
        return nwglShareLists(_GetLastError, hglrc1, hglrc2, __functionAddress);
    }

    /** {@code BOOL wglShareLists(HGLRC hglrc1, HGLRC hglrc2)} */
    @NativeType("BOOL")
    public static boolean wglShareLists(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HGLRC") long hglrc1, @NativeType("HGLRC") long hglrc2) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nwglShareLists(memAddressSafe(_GetLastError), hglrc1, hglrc2) != 0;
    }

}