/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GDI32 {

    private static final SharedLibrary GDI32 = Library.loadNative(GDI32.class, "org.lwjgl", "gdi32");

    /** Contains the function pointers loaded from the gdi32 {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ChoosePixelFormat   = apiGetFunctionAddress(GDI32, "ChoosePixelFormat"),
            DescribePixelFormat = apiGetFunctionAddress(GDI32, "DescribePixelFormat"),
            GetPixelFormat      = apiGetFunctionAddress(GDI32, "GetPixelFormat"),
            SetPixelFormat      = apiGetFunctionAddress(GDI32, "SetPixelFormat"),
            SwapBuffers         = apiGetFunctionAddress(GDI32, "SwapBuffers");

    }

    /** Returns the gdi32 {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return GDI32;
    }

    public static final int
        DISPLAY_DEVICE_ATTACHED_TO_DESKTOP = 0x1,
        DISPLAY_DEVICE_MULTI_DRIVER        = 0x2,
        DISPLAY_DEVICE_PRIMARY_DEVICE      = 0x4,
        DISPLAY_DEVICE_MIRRORING_DRIVER    = 0x8,
        DISPLAY_DEVICE_VGA_COMPATIBLE      = 0x10,
        DISPLAY_DEVICE_REMOVABLE           = 0x20,
        DISPLAY_DEVICE_MODESPRUNED         = 0x8000000,
        DISPLAY_DEVICE_REMOTE              = 0x4000000,
        DISPLAY_DEVICE_DISCONNECT          = 0x2000000,
        DISPLAY_DEVICE_TS_COMPATIBLE       = 0x200000,
        DISPLAY_DEVICE_UNSAFE_MODES_ON     = 0x80000;

    public static final int
        DISPLAY_DEVICE_ACTIVE   = 0x1,
        DISPLAY_DEVICE_ATTACHED = 0x2;

    public static final int DM_SPECVERSION = 0x401;

    public static final int
        DM_ORIENTATION        = 0x1,
        DM_PAPERSIZE          = 0x2,
        DM_PAPERLENGTH        = 0x4,
        DM_PAPERWIDTH         = 0x8,
        DM_SCALE              = 0x10,
        DM_POSITION           = 0x20,
        DM_NUP                = 0x40,
        DM_DISPLAYORIENTATION = 0x80,
        DM_COPIES             = 0x100,
        DM_DEFAULTSOURCE      = 0x200,
        DM_PRINTQUALITY       = 0x400,
        DM_COLOR              = 0x800,
        DM_DUPLEX             = 0x1000,
        DM_YRESOLUTION        = 0x2000,
        DM_TTOPTION           = 0x4000,
        DM_COLLATE            = 0x8000,
        DM_FORMNAME           = 0x10000,
        DM_LOGPIXELS          = 0x20000,
        DM_BITSPERPEL         = 0x40000,
        DM_PELSWIDTH          = 0x80000,
        DM_PELSHEIGHT         = 0x100000,
        DM_DISPLAYFLAGS       = 0x200000,
        DM_DISPLAYFREQUENCY   = 0x400000,
        DM_ICMMETHOD          = 0x800000,
        DM_ICMINTENT          = 0x1000000,
        DM_MEDIATYPE          = 0x2000000,
        DM_DITHERTYPE         = 0x4000000,
        DM_PANNINGWIDTH       = 0x8000000,
        DM_PANNINGHEIGHT      = 0x10000000,
        DM_DISPLAYFIXEDOUTPUT = 0x20000000;

    public static final int
        DMDO_DEFAULT = 0,
        DMDO_90      = 1,
        DMDO_180     = 2,
        DMDO_270     = 3;

    public static final int
        DMDFO_DEFAULT = 0,
        DMDFO_STRETCH = 1,
        DMDFO_CENTER  = 2;

    public static final int
        DM_INTERLACED           = 0x2,
        DMDISPLAYFLAGS_TEXTMODE = 0x4;

    public static final int
        PFD_DOUBLEBUFFER          = 0x1,
        PFD_STEREO                = 0x2,
        PFD_DRAW_TO_WINDOW        = 0x4,
        PFD_DRAW_TO_BITMAP        = 0x8,
        PFD_SUPPORT_GDI           = 0x10,
        PFD_SUPPORT_OPENGL        = 0x20,
        PFD_GENERIC_FORMAT        = 0x40,
        PFD_NEED_PALETTE          = 0x80,
        PFD_NEED_SYSTEM_PALETTE   = 0x100,
        PFD_SWAP_EXCHANGE         = 0x200,
        PFD_SWAP_COPY             = 0x400,
        PFD_SWAP_LAYER_BUFFERS    = 0x800,
        PFD_GENERIC_ACCELERATED   = 0x1000,
        PFD_SUPPORT_DIRECTDRAW    = 0x2000,
        PFD_DIRECT3D_ACCELERATED  = 0x4000,
        PFD_SUPPORT_COMPOSITION   = 0x8000,
        PFD_DEPTH_DONTCARE        = 0x20000000,
        PFD_DOUBLEBUFFER_DONTCARE = 0x40000000,
        PFD_STEREO_DONTCARE       = 0x80000000;

    public static final byte
        PFD_TYPE_RGBA       = 0,
        PFD_TYPE_COLORINDEX = 1;

    public static final byte
        PFD_MAIN_PLANE     = 0,
        PFD_OVERLAY_PLANE  = 1,
        PFD_UNDERLAY_PLANE = (byte)-1;

    protected GDI32() {
        throw new UnsupportedOperationException();
    }

    // --- [ ChoosePixelFormat ] ---

    /** {@code int ChoosePixelFormat(HDC hdc, PIXELFORMATDESCRIPTOR const * pixelFormatDescriptor)} */
    public static native int nChoosePixelFormat(long _GetLastError, long hdc, long pixelFormatDescriptor, long __functionAddress);

    /** {@code int ChoosePixelFormat(HDC hdc, PIXELFORMATDESCRIPTOR const * pixelFormatDescriptor)} */
    public static int nChoosePixelFormat(long _GetLastError, long hdc, long pixelFormatDescriptor) {
        long __functionAddress = Functions.ChoosePixelFormat;
        if (CHECKS) {
            check(hdc);
        }
        return nChoosePixelFormat(_GetLastError, hdc, pixelFormatDescriptor, __functionAddress);
    }

    /** {@code int ChoosePixelFormat(HDC hdc, PIXELFORMATDESCRIPTOR const * pixelFormatDescriptor)} */
    public static int ChoosePixelFormat(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc, @NativeType("PIXELFORMATDESCRIPTOR const *") PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nChoosePixelFormat(memAddressSafe(_GetLastError), hdc, pixelFormatDescriptor.address());
    }

    // --- [ DescribePixelFormat ] ---

    /** {@code int DescribePixelFormat(HDC hdc, int pixelFormat, UINT bytes, LPPIXELFORMATDESCRIPTOR pixelFormatDescriptor)} */
    public static native int nDescribePixelFormat(long _GetLastError, long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor, long __functionAddress);

    /** {@code int DescribePixelFormat(HDC hdc, int pixelFormat, UINT bytes, LPPIXELFORMATDESCRIPTOR pixelFormatDescriptor)} */
    public static int nDescribePixelFormat(long _GetLastError, long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor) {
        long __functionAddress = Functions.DescribePixelFormat;
        if (CHECKS) {
            check(hdc);
        }
        return nDescribePixelFormat(_GetLastError, hdc, pixelFormat, bytes, pixelFormatDescriptor, __functionAddress);
    }

    /** {@code int DescribePixelFormat(HDC hdc, int pixelFormat, UINT bytes, LPPIXELFORMATDESCRIPTOR pixelFormatDescriptor)} */
    public static int DescribePixelFormat(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc, int pixelFormat, @NativeType("UINT") int bytes, @NativeType("LPPIXELFORMATDESCRIPTOR") @Nullable PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nDescribePixelFormat(memAddressSafe(_GetLastError), hdc, pixelFormat, bytes, memAddressSafe(pixelFormatDescriptor));
    }

    /** {@code int DescribePixelFormat(HDC hdc, int pixelFormat, UINT bytes, LPPIXELFORMATDESCRIPTOR pixelFormatDescriptor)} */
    public static int DescribePixelFormat(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc, int pixelFormat, @NativeType("LPPIXELFORMATDESCRIPTOR") @Nullable PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nDescribePixelFormat(memAddressSafe(_GetLastError), hdc, pixelFormat, PIXELFORMATDESCRIPTOR.SIZEOF, memAddressSafe(pixelFormatDescriptor));
    }

    // --- [ GetPixelFormat ] ---

    /** {@code int GetPixelFormat(HDC hdc)} */
    public static native int nGetPixelFormat(long _GetLastError, long hdc, long __functionAddress);

    /** {@code int GetPixelFormat(HDC hdc)} */
    public static int nGetPixelFormat(long _GetLastError, long hdc) {
        long __functionAddress = Functions.GetPixelFormat;
        if (CHECKS) {
            check(hdc);
        }
        return nGetPixelFormat(_GetLastError, hdc, __functionAddress);
    }

    /** {@code int GetPixelFormat(HDC hdc)} */
    public static int GetPixelFormat(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetPixelFormat(memAddressSafe(_GetLastError), hdc);
    }

    // --- [ SetPixelFormat ] ---

    /** {@code BOOL SetPixelFormat(HDC hdc, int pixelFormat, PIXELFORMATDESCRIPTOR const * pixelFormatDescriptor)} */
    public static native int nSetPixelFormat(long _GetLastError, long hdc, int pixelFormat, long pixelFormatDescriptor, long __functionAddress);

    /** {@code BOOL SetPixelFormat(HDC hdc, int pixelFormat, PIXELFORMATDESCRIPTOR const * pixelFormatDescriptor)} */
    public static int nSetPixelFormat(long _GetLastError, long hdc, int pixelFormat, long pixelFormatDescriptor) {
        long __functionAddress = Functions.SetPixelFormat;
        if (CHECKS) {
            check(hdc);
        }
        return nSetPixelFormat(_GetLastError, hdc, pixelFormat, pixelFormatDescriptor, __functionAddress);
    }

    /** {@code BOOL SetPixelFormat(HDC hdc, int pixelFormat, PIXELFORMATDESCRIPTOR const * pixelFormatDescriptor)} */
    @NativeType("BOOL")
    public static boolean SetPixelFormat(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long hdc, int pixelFormat, @NativeType("PIXELFORMATDESCRIPTOR const *") @Nullable PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSetPixelFormat(memAddressSafe(_GetLastError), hdc, pixelFormat, memAddressSafe(pixelFormatDescriptor)) != 0;
    }

    // --- [ SwapBuffers ] ---

    /** {@code BOOL SwapBuffers(HDC dc)} */
    public static native int nSwapBuffers(long _GetLastError, long dc, long __functionAddress);

    /** {@code BOOL SwapBuffers(HDC dc)} */
    public static int nSwapBuffers(long _GetLastError, long dc) {
        long __functionAddress = Functions.SwapBuffers;
        if (CHECKS) {
            check(dc);
        }
        return nSwapBuffers(_GetLastError, dc, __functionAddress);
    }

    /** {@code BOOL SwapBuffers(HDC dc)} */
    @NativeType("BOOL")
    public static boolean SwapBuffers(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HDC") long dc) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSwapBuffers(memAddressSafe(_GetLastError), dc) != 0;
    }

}