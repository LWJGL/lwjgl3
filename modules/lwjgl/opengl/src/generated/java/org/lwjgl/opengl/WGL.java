/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.*;

/** Native bindings to WGL functionality. */
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

    /** UseFontOutlines format. */
    public static final int
        WGL_FONT_LINES    = 0,
        WGL_FONT_POLYGONS = 1;

    /** SwapLayerBuffers flags. */
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

    /** Unsafe version of: {@link #wglCreateContext CreateContext} */
    public static native long nwglCreateContext(long hdc, long __functionAddress);

    /**
     * Creates a new OpenGL rendering context, which is suitable for drawing on the device referenced by device. The rendering context has the same pixel
     * format as the device context.
     *
     * @param hdc handle to a device context for which the function creates a suitable OpenGL rendering context
     */
    @NativeType("HGLRC")
    public static long wglCreateContext(@NativeType("HDC") long hdc) {
        long __functionAddress = Functions.CreateContext;
        if (CHECKS) {
            check(hdc);
        }
        return nwglCreateContext(hdc, __functionAddress);
    }

    // --- [ wglCreateLayerContext ] ---

    /** Unsafe version of: {@link #wglCreateLayerContext CreateLayerContext} */
    public static native long nwglCreateLayerContext(long hdc, int layerPlane, long __functionAddress);

    /**
     * Creates a new OpenGL rendering context for drawing to a specified layer plane on a device context.
     *
     * @param hdc        the device context for a new rendering context
     * @param layerPlane the layer plane to which you want to bind a rendering context. The value 0 identifies the main plane. Positive values of {@code layerPlace} identify
     *                   overlay planes, where 1 is the first overlay plane over the main plane, 2 is the second overlay plane over the first overlay plane, and so on.
     *                   Negative values identify underlay planes, where 1 is the first underlay plane under the main plane, 2 is the second underlay plane under the first
     *                   underlay plane, and so on. The number of overlay and underlay planes is given in the {@code reserved} member of the {@link PIXELFORMATDESCRIPTOR}
     *                   structure.
     */
    @NativeType("HGLRC")
    public static long wglCreateLayerContext(@NativeType("HDC") long hdc, int layerPlane) {
        long __functionAddress = Functions.CreateLayerContext;
        if (CHECKS) {
            check(hdc);
        }
        return nwglCreateLayerContext(hdc, layerPlane, __functionAddress);
    }

    // --- [ wglCopyContext ] ---

    /** Unsafe version of: {@link #wglCopyContext CopyContext} */
    public static native int nwglCopyContext(long src, long dst, int mask, long __functionAddress);

    /**
     * Copies selected groups of rendering states from one OpenGL rendering context to another.
     *
     * @param src  the source OpenGL rendering context whose state information is to be copied
     * @param dst  the destination OpenGL rendering context to which state information is to be copied
     * @param mask which groups of the {@code src} rendering state are to be copied to {@code dst}. It contains the bitwise-OR of the same symbolic names that are
     *             passed to the {@link GL11#glPushAttrib PushAttrib} function. You can use {@link GL11#GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS} to copy all the rendering state information.
     */
    @NativeType("BOOL")
    public static boolean wglCopyContext(@NativeType("HGLRC") long src, @NativeType("HGLRC") long dst, @NativeType("UINT") int mask) {
        long __functionAddress = Functions.CopyContext;
        if (CHECKS) {
            check(src);
            check(dst);
        }
        return nwglCopyContext(src, dst, mask, __functionAddress) != 0;
    }

    // --- [ wglDeleteContext ] ---

    /** Unsafe version of: {@link #wglDeleteContext DeleteContext} */
    public static native int nwglDeleteContext(long context, long __functionAddress);

    /**
     * Deletes a specified OpenGL rendering context.
     *
     * @param context handle to an OpenGL rendering context that the function will delete
     */
    @NativeType("BOOL")
    public static boolean wglDeleteContext(@NativeType("HGLRC") long context) {
        long __functionAddress = Functions.DeleteContext;
        if (CHECKS) {
            check(context);
        }
        return nwglDeleteContext(context, __functionAddress) != 0;
    }

    // --- [ wglGetCurrentContext ] ---

    /** Unsafe version of: {@link #wglGetCurrentContext GetCurrentContext} */
    public static native long nwglGetCurrentContext(long __functionAddress);

    /** Obtains a handle to the current OpenGL rendering context of the calling thread. */
    @NativeType("HGLRC")
    public static long wglGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return nwglGetCurrentContext(__functionAddress);
    }

    // --- [ wglGetCurrentDC ] ---

    /** Unsafe version of: {@link #wglGetCurrentDC GetCurrentDC} */
    public static native long nwglGetCurrentDC(long __functionAddress);

    /** Obtains a handle to the device context that is associated with the current OpenGL rendering context of the calling thread. */
    @NativeType("HDC")
    public static long wglGetCurrentDC() {
        long __functionAddress = Functions.GetCurrentDC;
        return nwglGetCurrentDC(__functionAddress);
    }

    // --- [ wglGetProcAddress ] ---

    /** Unsafe version of: {@link #wglGetProcAddress GetProcAddress} */
    public static native long nwglGetProcAddress(long proc, long __functionAddress);

    /** Unsafe version of: {@link #wglGetProcAddress GetProcAddress} */
    public static long nwglGetProcAddress(long proc) {
        long __functionAddress = Functions.GetProcAddress;
        return nwglGetProcAddress(proc, __functionAddress);
    }

    /**
     * Returns the address of an OpenGL extension function for use with the current OpenGL rendering context.
     *
     * @param proc points to a null-terminated string that is the name of the extension function. The name of the extension function must be identical to a
     *             corresponding function implemented by OpenGL.
     */
    @NativeType("PROC")
    public static long wglGetProcAddress(@NativeType("LPCSTR") ByteBuffer proc) {
        if (CHECKS) {
            checkNT1(proc);
        }
        return nwglGetProcAddress(memAddress(proc));
    }

    /**
     * Returns the address of an OpenGL extension function for use with the current OpenGL rendering context.
     *
     * @param proc points to a null-terminated string that is the name of the extension function. The name of the extension function must be identical to a
     *             corresponding function implemented by OpenGL.
     */
    @NativeType("PROC")
    public static long wglGetProcAddress(@NativeType("LPCSTR") CharSequence proc) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            return nwglGetProcAddress(procEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ wglMakeCurrent ] ---

    /** Unsafe version of: {@link #wglMakeCurrent MakeCurrent} */
    public static native int nwglMakeCurrent(long hdc, long hglrc, long __functionAddress);

    /**
     * Makes a specified OpenGL rendering context the calling thread's current rendering context. All subsequent OpenGL calls made by the thread are drawn on
     * the device identified by device. You can also use MakeCurrent to change the calling thread's current rendering context so it's no longer current.
     *
     * @param hdc   handle to a device context. Subsequent OpenGL calls made by the calling thread are drawn on the device identified by {@code dc}.
     * @param hglrc handle to an OpenGL rendering context that the function sets as the calling thread's rendering context. If {@code context} is {@code NULL}, the function
     *              makes the calling thread's current rendering context no longer current, and releases the device context that is used by the rendering context. In
     *              this case, {@code hdc} is ignored.
     */
    @NativeType("BOOL")
    public static boolean wglMakeCurrent(@NativeType("HDC") long hdc, @NativeType("HGLRC") long hglrc) {
        long __functionAddress = Functions.MakeCurrent;
        return nwglMakeCurrent(hdc, hglrc, __functionAddress) != 0;
    }

    // --- [ wglShareLists ] ---

    /** Unsafe version of: {@link #wglShareLists ShareLists} */
    public static native int nwglShareLists(long hglrc1, long hglrc2, long __functionAddress);

    /**
     * Enables multiple OpenGL rendering contexts to share a single display-list space.
     *
     * @param hglrc1 the OpenGL rendering context with which to share display lists.
     * @param hglrc2 the OpenGL rendering context to share display lists with {@code hglrc1}. The {@code hglrc2} parameter should not contain any existing display lists
     *               when {@code wglShareLists} is called.
     */
    @NativeType("BOOL")
    public static boolean wglShareLists(@NativeType("HGLRC") long hglrc1, @NativeType("HGLRC") long hglrc2) {
        long __functionAddress = Functions.ShareLists;
        if (CHECKS) {
            check(hglrc1);
            check(hglrc2);
        }
        return nwglShareLists(hglrc1, hglrc2, __functionAddress) != 0;
    }

}