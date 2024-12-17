/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CGL {

    /** Contains the function pointers loaded from {@code GL.getFunctionProvider()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetCurrentContext         = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetCurrentContext"),
            SetCurrentContext         = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetCurrentContext"),
            GetShareGroup             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetShareGroup"),
            ChoosePixelFormat         = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLChoosePixelFormat"),
            DestroyPixelFormat        = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDestroyPixelFormat"),
            DescribePixelFormat       = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDescribePixelFormat"),
            ReleasePixelFormat        = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLReleasePixelFormat"),
            RetainPixelFormat         = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLRetainPixelFormat"),
            GetPixelFormatRetainCount = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetPixelFormatRetainCount"),
            QueryRendererInfo         = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLQueryRendererInfo"),
            DestroyRendererInfo       = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDestroyRendererInfo"),
            DescribeRenderer          = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDescribeRenderer"),
            CreateContext             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLCreateContext"),
            DestroyContext            = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDestroyContext"),
            CopyContext               = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLCopyContext"),
            RetainContext             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLRetainContext"),
            ReleaseContext            = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLReleaseContext"),
            GetContextRetainCount     = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetContextRetainCount"),
            GetPixelFormat            = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetPixelFormat"),
            CreatePBuffer             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLCreatePBuffer"),
            DestroyPBuffer            = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDestroyPBuffer"),
            DescribePBuffer           = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDescribePBuffer"),
            TexImagePBuffer           = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLTexImagePBuffer"),
            RetainPBuffer             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLRetainPBuffer"),
            ReleasePBuffer            = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLReleasePBuffer"),
            GetPBufferRetainCount     = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetPBufferRetainCount"),
            SetOffScreen              = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetOffScreen"),
            GetOffScreen              = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetOffScreen"),
            SetFullScreen             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetFullScreen"),
            SetFullScreenOnDisplay    = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetFullScreenOnDisplay"),
            SetPBuffer                = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetPBuffer"),
            GetPBuffer                = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetPBuffer"),
            ClearDrawable             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLClearDrawable"),
            FlushDrawable             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLFlushDrawable"),
            Enable                    = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLEnable"),
            Disable                   = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLDisable"),
            IsEnabled                 = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLIsEnabled"),
            SetParameter              = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetParameter"),
            GetParameter              = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetParameter"),
            SetVirtualScreen          = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetVirtualScreen"),
            GetVirtualScreen          = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetVirtualScreen"),
            UpdateContext             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLUpdateContext"),
            SetGlobalOption           = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLSetGlobalOption"),
            GetGlobalOption           = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetGlobalOption"),
            LockContext               = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLLockContext"),
            UnlockContext             = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLUnlockContext"),
            GetVersion                = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLGetVersion"),
            ErrorString               = apiGetFunctionAddress(GL.getFunctionProvider(), "CGLErrorString");

    }

    public static final int
        kCGLPFAAllRenderers                       = 1,
        kCGLPFATripleBuffer                       = 3,
        kCGLPFADoubleBuffer                       = 5,
        kCGLPFAStereo                             = 6,
        kCGLPFAColorSize                          = 8,
        kCGLPFAAlphaSize                          = 11,
        kCGLPFADepthSize                          = 12,
        kCGLPFAStencilSize                        = 13,
        kCGLPFAMinimumPolicy                      = 51,
        kCGLPFAMaximumPolicy                      = 52,
        kCGLPFASampleBuffers                      = 55,
        kCGLPFASamples                            = 56,
        kCGLPFAColorFloat                         = 58,
        kCGLPFAMultisample                        = 59,
        kCGLPFASupersample                        = 60,
        kCGLPFASampleAlpha                        = 61,
        kCGLPFARendererID                         = 70,
        kCGLPFASingleRenderer                     = 71,
        kCGLPFANoRecovery                         = 72,
        kCGLPFAAccelerated                        = 73,
        kCGLPFAClosestPolicy                      = 74,
        kCGLPFABackingStore                       = 76,
        kCGLPFABackingVolatile                    = 77,
        kCGLPFADisplayMask                        = 84,
        kCGLPFAAllowOfflineRenderers              = 96,
        kCGLPFAAcceleratedCompute                 = 97,
        kCGLPFAOpenGLProfile                      = 99,
        kCGLPFASupportsAutomaticGraphicsSwitching = 101,
        kCGLPFAVirtualScreenCount                 = 128,
        kCGLPFAAuxBuffers                         = 7,
        kCGLPFAAccumSize                          = 14,
        kCGLPFAOffScreen                          = 53,
        kCGLPFAAuxDepthStencil                    = 57,
        kCGLPFAWindow                             = 80,
        kCGLPFACompliant                          = 83,
        kCGLPFAPBuffer                            = 90,
        kCGLPFARemotePBuffer                      = 91,
        kCGLPFARobust                             = 75,
        kCGLPFAMPSafe                             = 78,
        kCGLPFAMultiScreen                        = 81,
        kCGLPFAFullScreen                         = 54;

    public static final int
        kCGLRPOffScreen              = 53,
        kCGLRPRendererID             = 70,
        kCGLRPAccelerated            = 73,
        kCGLRPBackingStore           = 76,
        kCGLRPWindow                 = 80,
        kCGLRPCompliant              = 83,
        kCGLRPDisplayMask            = 84,
        kCGLRPBufferModes            = 100,
        kCGLRPColorModes             = 103,
        kCGLRPAccumModes             = 104,
        kCGLRPDepthModes             = 105,
        kCGLRPStencilModes           = 106,
        kCGLRPMaxAuxBuffers          = 107,
        kCGLRPMaxSampleBuffers       = 108,
        kCGLRPMaxSamples             = 109,
        kCGLRPSampleModes            = 110,
        kCGLRPSampleAlpha            = 111,
        kCGLRPVideoMemory            = 120,
        kCGLRPTextureMemory          = 121,
        kCGLRPGPUVertProcCapable     = 122,
        kCGLRPGPUFragProcCapable     = 123,
        kCGLRPRendererCount          = 128,
        kCGLRPOnline                 = 129,
        kCGLRPAcceleratedCompute     = 130,
        kCGLRPVideoMemoryMegabytes   = 131,
        kCGLRPTextureMemoryMegabytes = 132,
        kCGLRPRobust                 = 75,
        kCGLRPMPSafe                 = 78,
        kCGLRPMultiScreen            = 81,
        kCGLRPFullScreen             = 54;

    public static final int
        kCGLCESwapRectangle           = 201,
        kCGLCESwapLimit               = 203,
        kCGLCERasterization           = 221,
        kCGLCEStateValidation         = 301,
        kCGLCESurfaceBackingSize      = 305,
        kCGLCEDisplayListOptimization = 307,
        kCGLCEMPEngine                = 313;

    public static final int
        kCGLCPSwapRectangle          = 200,
        kCGLCPSwapInterval           = 222,
        kCGLCPDispatchTableSize      = 224,
        kCGLCPClientStorage          = 226,
        kCGLCPSurfaceTexture         = 228,
        kCGLCPSurfaceOrder           = 235,
        kCGLCPSurfaceOpacity         = 236,
        kCGLCPSurfaceBackingSize     = 304,
        kCGLCPSurfaceSurfaceVolatile = 306,
        kCGLCPReclaimResources       = 308,
        kCGLCPCurrentRendererID      = 309,
        kCGLCPGPUVertexProcessing    = 310,
        kCGLCPGPUFragmentProcessing  = 311,
        kCGLCPHasDrawable            = 314,
        kCGLCPMPSwapsInFlight        = 315;

    public static final int
        kCGLGOFormatCacheSize  = 501,
        kCGLGOClearFormatCache = 502,
        kCGLGORetainRenderers  = 503,
        kCGLGOResetLibrary     = 504,
        kCGLGOUseErrorHandler  = 505,
        kCGLGOUseBuildCache    = 506;

    public static final int
        kCGLOGLPVersion_Legacy   = 0x1000,
        kCGLOGLPVersion_3_2_Core = 0x3200;

    public static final int
        kCGLNoError         = 0,
        kCGLBadAttribute    = 10000,
        kCGLBadProperty     = 10001,
        kCGLBadPixelFormat  = 10002,
        kCGLBadRendererInfo = 10003,
        kCGLBadContext      = 10004,
        kCGLBadDrawable     = 10005,
        kCGLBadDisplay      = 10006,
        kCGLBadState        = 10007,
        kCGLBadValue        = 10008,
        kCGLBadMatch        = 10009,
        kCGLBadEnumeration  = 10010,
        kCGLBadOffScreen    = 10011,
        kCGLBadFullScreen   = 10012,
        kCGLBadWindow       = 10013,
        kCGLBadAddress      = 10014,
        kCGLBadCodeModule   = 10015,
        kCGLBadAlloc        = 10016,
        kCGLBadConnection   = 10017;

    public static final int
        kCGLMonoscopicBit   = 0x1,
        kCGLStereoscopicBit = 0x2,
        kCGLSingleBufferBit = 0x4,
        kCGLDoubleBufferBit = 0x8,
        kCGLTripleBufferBit = 0x10;

    public static final int
        kCGL0Bit   = 0x1,
        kCGL1Bit   = 0x2,
        kCGL2Bit   = 0x4,
        kCGL3Bit   = 0x8,
        kCGL4Bit   = 0x10,
        kCGL5Bit   = 0x20,
        kCGL6Bit   = 0x40,
        kCGL8Bit   = 0x80,
        kCGL10Bit  = 0x100,
        kCGL12Bit  = 0x200,
        kCGL16Bit  = 0x400,
        kCGL24Bit  = 0x800,
        kCGL32Bit  = 0x1000,
        kCGL48Bit  = 0x2000,
        kCGL64Bit  = 0x4000,
        kCGL96Bit  = 0x8000,
        kCGL128Bit = 0x10000;

    public static final int
        kCGLRGB444Bit       = 0x40,
        kCGLARGB4444Bit     = 0x80,
        kCGLRGB444A8Bit     = 0x100,
        kCGLRGB555Bit       = 0x200,
        kCGLARGB1555Bit     = 0x400,
        kCGLRGB555A8Bit     = 0x800,
        kCGLRGB565Bit       = 0x1000,
        kCGLRGB565A8Bit     = 0x2000,
        kCGLRGB888Bit       = 0x4000,
        kCGLARGB8888Bit     = 0x8000,
        kCGLRGB888A8Bit     = 0x10000,
        kCGLRGB101010Bit    = 0x20000,
        kCGLARGB2101010Bit  = 0x40000,
        kCGLRGB101010_A8Bit = 0x80000,
        kCGLRGB121212Bit    = 0x100000,
        kCGLARGB12121212Bit = 0x200000,
        kCGLRGB161616Bit    = 0x400000,
        kCGLRGBA16161616Bit = 0x800000,
        kCGLRGBFloat64Bit   = 0x1000000,
        kCGLRGBAFloat64Bit  = 0x2000000,
        kCGLRGBFloat128Bit  = 0x4000000,
        kCGLRGBAFloat128Bit = 0x8000000,
        kCGLRGBFloat256Bit  = 0x10000000,
        kCGLRGBAFloat256Bit = 0x20000000;

    public static final int
        kCGLSupersampleBit = 0x1,
        kCGLMultisampleBit = 0x2;

    protected CGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ CGLGetCurrentContext ] ---

    /** {@code CGLContextObj CGLGetCurrentContext(void)} */
    @NativeType("CGLContextObj")
    public static long CGLGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return callP(__functionAddress);
    }

    // --- [ CGLSetCurrentContext ] ---

    /** {@code CGLError CGLSetCurrentContext(CGLContextObj context)} */
    @NativeType("CGLError")
    public static int CGLSetCurrentContext(@NativeType("CGLContextObj") long context) {
        long __functionAddress = Functions.SetCurrentContext;
        return callPI(context, __functionAddress);
    }

    // --- [ CGLGetShareGroup ] ---

    /** {@code CGLShareGroupObj CGLGetShareGroup(CGLContextObj ctx)} */
    @NativeType("CGLShareGroupObj")
    public static long CGLGetShareGroup(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.GetShareGroup;
        if (CHECKS) {
            check(ctx);
        }
        return callPP(ctx, __functionAddress);
    }

    // --- [ CGLChoosePixelFormat ] ---

    /** {@code CGLError CGLChoosePixelFormat(CGLPixelFormatAttribute const * attribs, CGLPixelFormatObj * pix, GLint * npix)} */
    public static int nCGLChoosePixelFormat(long attribs, long pix, long npix) {
        long __functionAddress = Functions.ChoosePixelFormat;
        return callPPPI(attribs, pix, npix, __functionAddress);
    }

    /** {@code CGLError CGLChoosePixelFormat(CGLPixelFormatAttribute const * attribs, CGLPixelFormatObj * pix, GLint * npix)} */
    @NativeType("CGLError")
    public static int CGLChoosePixelFormat(@NativeType("CGLPixelFormatAttribute const *") IntBuffer attribs, @NativeType("CGLPixelFormatObj *") PointerBuffer pix, @NativeType("GLint *") IntBuffer npix) {
        if (CHECKS) {
            checkNT(attribs);
            check(pix, 1);
            check(npix, 1);
        }
        return nCGLChoosePixelFormat(memAddress(attribs), memAddress(pix), memAddress(npix));
    }

    // --- [ CGLDestroyPixelFormat ] ---

    /** {@code CGLError CGLDestroyPixelFormat(CGLPixelFormatObj pix)} */
    @NativeType("CGLError")
    public static int CGLDestroyPixelFormat(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.DestroyPixelFormat;
        if (CHECKS) {
            check(pix);
        }
        return callPI(pix, __functionAddress);
    }

    // --- [ CGLDescribePixelFormat ] ---

    /** {@code CGLError CGLDescribePixelFormat(CGLPixelFormatObj pix, GLint pix_num, CGLPixelFormatAttribute attrib, GLint * value)} */
    public static int nCGLDescribePixelFormat(long pix, int pix_num, int attrib, long value) {
        long __functionAddress = Functions.DescribePixelFormat;
        if (CHECKS) {
            check(pix);
        }
        return callPPI(pix, pix_num, attrib, value, __functionAddress);
    }

    /** {@code CGLError CGLDescribePixelFormat(CGLPixelFormatObj pix, GLint pix_num, CGLPixelFormatAttribute attrib, GLint * value)} */
    @NativeType("CGLError")
    public static int CGLDescribePixelFormat(@NativeType("CGLPixelFormatObj") long pix, @NativeType("GLint") int pix_num, @NativeType("CGLPixelFormatAttribute") int attrib, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nCGLDescribePixelFormat(pix, pix_num, attrib, memAddress(value));
    }

    // --- [ CGLReleasePixelFormat ] ---

    /** {@code void CGLReleasePixelFormat(CGLPixelFormatObj pix)} */
    public static void CGLReleasePixelFormat(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.ReleasePixelFormat;
        if (CHECKS) {
            check(pix);
        }
        callPV(pix, __functionAddress);
    }

    // --- [ CGLRetainPixelFormat ] ---

    /** {@code CGLPixelFormatObj CGLRetainPixelFormat(CGLPixelFormatObj pix)} */
    @NativeType("CGLPixelFormatObj")
    public static long CGLRetainPixelFormat(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.RetainPixelFormat;
        if (CHECKS) {
            check(pix);
        }
        return callPP(pix, __functionAddress);
    }

    // --- [ CGLGetPixelFormatRetainCount ] ---

    /** {@code GLuint CGLGetPixelFormatRetainCount(CGLPixelFormatObj pix)} */
    @NativeType("GLuint")
    public static int CGLGetPixelFormatRetainCount(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.GetPixelFormatRetainCount;
        if (CHECKS) {
            check(pix);
        }
        return callPI(pix, __functionAddress);
    }

    // --- [ CGLQueryRendererInfo ] ---

    /** {@code CGLError CGLQueryRendererInfo(GLuint display_mask, CGLRendererInfoObj * rend, GLint * nrend)} */
    public static int nCGLQueryRendererInfo(int display_mask, long rend, long nrend) {
        long __functionAddress = Functions.QueryRendererInfo;
        return callPPI(display_mask, rend, nrend, __functionAddress);
    }

    /** {@code CGLError CGLQueryRendererInfo(GLuint display_mask, CGLRendererInfoObj * rend, GLint * nrend)} */
    @NativeType("CGLError")
    public static int CGLQueryRendererInfo(@NativeType("GLuint") int display_mask, @NativeType("CGLRendererInfoObj *") PointerBuffer rend, @NativeType("GLint *") IntBuffer nrend) {
        if (CHECKS) {
            check(rend, 1);
            check(nrend, 1);
        }
        return nCGLQueryRendererInfo(display_mask, memAddress(rend), memAddress(nrend));
    }

    // --- [ CGLDestroyRendererInfo ] ---

    /** {@code CGLError CGLDestroyRendererInfo(CGLRendererInfoObj rend)} */
    @NativeType("CGLError")
    public static int CGLDestroyRendererInfo(@NativeType("CGLRendererInfoObj") long rend) {
        long __functionAddress = Functions.DestroyRendererInfo;
        if (CHECKS) {
            check(rend);
        }
        return callPI(rend, __functionAddress);
    }

    // --- [ CGLDescribeRenderer ] ---

    /** {@code CGLError CGLDescribeRenderer(CGLRendererInfoObj rend, GLint rend_num, CGLRendererProperty prop, GLint * value)} */
    public static int nCGLDescribeRenderer(long rend, int rend_num, int prop, long value) {
        long __functionAddress = Functions.DescribeRenderer;
        if (CHECKS) {
            check(rend);
        }
        return callPPI(rend, rend_num, prop, value, __functionAddress);
    }

    /** {@code CGLError CGLDescribeRenderer(CGLRendererInfoObj rend, GLint rend_num, CGLRendererProperty prop, GLint * value)} */
    @NativeType("CGLError")
    public static int CGLDescribeRenderer(@NativeType("CGLRendererInfoObj") long rend, @NativeType("GLint") int rend_num, @NativeType("CGLRendererProperty") int prop, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nCGLDescribeRenderer(rend, rend_num, prop, memAddress(value));
    }

    // --- [ CGLCreateContext ] ---

    /** {@code CGLError CGLCreateContext(CGLPixelFormatObj pix, CGLContextObj share, CGLContextObj * ctx)} */
    public static int nCGLCreateContext(long pix, long share, long ctx) {
        long __functionAddress = Functions.CreateContext;
        if (CHECKS) {
            check(pix);
        }
        return callPPPI(pix, share, ctx, __functionAddress);
    }

    /** {@code CGLError CGLCreateContext(CGLPixelFormatObj pix, CGLContextObj share, CGLContextObj * ctx)} */
    @NativeType("CGLError")
    public static int CGLCreateContext(@NativeType("CGLPixelFormatObj") long pix, @NativeType("CGLContextObj") long share, @NativeType("CGLContextObj *") PointerBuffer ctx) {
        if (CHECKS) {
            check(ctx, 1);
        }
        return nCGLCreateContext(pix, share, memAddress(ctx));
    }

    // --- [ CGLDestroyContext ] ---

    /** {@code CGLError CGLDestroyContext(CGLContextObj ctx)} */
    @NativeType("CGLError")
    public static int CGLDestroyContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.DestroyContext;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLCopyContext ] ---

    /** {@code CGLError CGLCopyContext(CGLContextObj src, CGLContextObj dst, GLbitfield mask)} */
    @NativeType("CGLError")
    public static int CGLCopyContext(@NativeType("CGLContextObj") long src, @NativeType("CGLContextObj") long dst, @NativeType("GLbitfield") int mask) {
        long __functionAddress = Functions.CopyContext;
        if (CHECKS) {
            check(src);
            check(dst);
        }
        return callPPI(src, dst, mask, __functionAddress);
    }

    // --- [ CGLRetainContext ] ---

    /** {@code CGLContextObj CGLRetainContext(CGLContextObj ctx)} */
    @NativeType("CGLContextObj")
    public static long CGLRetainContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.RetainContext;
        if (CHECKS) {
            check(ctx);
        }
        return callPP(ctx, __functionAddress);
    }

    // --- [ CGLReleaseContext ] ---

    /** {@code void CGLReleaseContext(CGLContextObj ctx)} */
    public static void CGLReleaseContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.ReleaseContext;
        if (CHECKS) {
            check(ctx);
        }
        callPV(ctx, __functionAddress);
    }

    // --- [ CGLGetContextRetainCount ] ---

    /** {@code GLuint CGLGetContextRetainCount(CGLContextObj ctx)} */
    @NativeType("GLuint")
    public static int CGLGetContextRetainCount(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.GetContextRetainCount;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLGetPixelFormat ] ---

    /** {@code CGLPixelFormatObj CGLGetPixelFormat(CGLContextObj ctx)} */
    @NativeType("CGLPixelFormatObj")
    public static long CGLGetPixelFormat(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.GetPixelFormat;
        if (CHECKS) {
            check(ctx);
        }
        return callPP(ctx, __functionAddress);
    }

    // --- [ CGLCreatePBuffer ] ---

    /** {@code CGLError CGLCreatePBuffer(GLsizei width, GLsizei height, GLenum target, GLenum internalFormat, GLint max_level, CGLPBufferObj * pbuffer)} */
    public static int nCGLCreatePBuffer(int width, int height, int target, int internalFormat, int max_level, long pbuffer) {
        long __functionAddress = Functions.CreatePBuffer;
        return callPI(width, height, target, internalFormat, max_level, pbuffer, __functionAddress);
    }

    /** {@code CGLError CGLCreatePBuffer(GLsizei width, GLsizei height, GLenum target, GLenum internalFormat, GLint max_level, CGLPBufferObj * pbuffer)} */
    @NativeType("CGLError")
    public static int CGLCreatePBuffer(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int max_level, @NativeType("CGLPBufferObj *") PointerBuffer pbuffer) {
        if (CHECKS) {
            check(pbuffer, 1);
        }
        return nCGLCreatePBuffer(width, height, target, internalFormat, max_level, memAddress(pbuffer));
    }

    // --- [ CGLDestroyPBuffer ] ---

    /** {@code CGLError CGLDestroyPBuffer(CGLPBufferObj pbuffer)} */
    @NativeType("CGLError")
    public static int CGLDestroyPBuffer(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.DestroyPBuffer;
        if (CHECKS) {
            check(pbuffer);
        }
        return callPI(pbuffer, __functionAddress);
    }

    // --- [ CGLDescribePBuffer ] ---

    /** {@code CGLError CGLDescribePBuffer(CGLPBufferObj obj, GLsizei * width, GLsizei * height, GLenum * target, GLenum * internalFormat, GLint * mipmap)} */
    public static int nCGLDescribePBuffer(long obj, long width, long height, long target, long internalFormat, long mipmap) {
        long __functionAddress = Functions.DescribePBuffer;
        if (CHECKS) {
            check(obj);
        }
        return callPPPPPPI(obj, width, height, target, internalFormat, mipmap, __functionAddress);
    }

    /** {@code CGLError CGLDescribePBuffer(CGLPBufferObj obj, GLsizei * width, GLsizei * height, GLenum * target, GLenum * internalFormat, GLint * mipmap)} */
    @NativeType("CGLError")
    public static int CGLDescribePBuffer(@NativeType("CGLPBufferObj") long obj, @NativeType("GLsizei *") IntBuffer width, @NativeType("GLsizei *") IntBuffer height, @NativeType("GLenum *") IntBuffer target, @NativeType("GLenum *") IntBuffer internalFormat, @NativeType("GLint *") IntBuffer mipmap) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(target, 1);
            check(internalFormat, 1);
            check(mipmap, 1);
        }
        return nCGLDescribePBuffer(obj, memAddress(width), memAddress(height), memAddress(target), memAddress(internalFormat), memAddress(mipmap));
    }

    // --- [ CGLTexImagePBuffer ] ---

    /** {@code CGLError CGLTexImagePBuffer(CGLContextObj ctx, CGLPBufferObj pbuffer, GLenum source)} */
    @NativeType("CGLError")
    public static int CGLTexImagePBuffer(@NativeType("CGLContextObj") long ctx, @NativeType("CGLPBufferObj") long pbuffer, @NativeType("GLenum") int source) {
        long __functionAddress = Functions.TexImagePBuffer;
        if (CHECKS) {
            check(ctx);
            check(pbuffer);
        }
        return callPPI(ctx, pbuffer, source, __functionAddress);
    }

    // --- [ CGLRetainPBuffer ] ---

    /** {@code CGLPBufferObj CGLRetainPBuffer(CGLPBufferObj pbuffer)} */
    @NativeType("CGLPBufferObj")
    public static long CGLRetainPBuffer(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.RetainPBuffer;
        if (CHECKS) {
            check(pbuffer);
        }
        return callPP(pbuffer, __functionAddress);
    }

    // --- [ CGLReleasePBuffer ] ---

    /** {@code void CGLReleasePBuffer(CGLPBufferObj pbuffer)} */
    public static void CGLReleasePBuffer(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.ReleasePBuffer;
        if (CHECKS) {
            check(pbuffer);
        }
        callPV(pbuffer, __functionAddress);
    }

    // --- [ CGLGetPBufferRetainCount ] ---

    /** {@code GLuint CGLGetPBufferRetainCount(CGLPBufferObj pbuffer)} */
    @NativeType("GLuint")
    public static int CGLGetPBufferRetainCount(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.GetPBufferRetainCount;
        if (CHECKS) {
            check(pbuffer);
        }
        return callPI(pbuffer, __functionAddress);
    }

    // --- [ CGLSetOffScreen ] ---

    /** {@code CGLError CGLSetOffScreen(CGLContextObj ctx, GLsizei width, GLsizei height, GLint rowbytes, void * baseaddr)} */
    public static int nCGLSetOffScreen(long ctx, int width, int height, int rowbytes, long baseaddr) {
        long __functionAddress = Functions.SetOffScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, width, height, rowbytes, baseaddr, __functionAddress);
    }

    /** {@code CGLError CGLSetOffScreen(CGLContextObj ctx, GLsizei width, GLsizei height, GLint rowbytes, void * baseaddr)} */
    @NativeType("CGLError")
    public static int CGLSetOffScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int rowbytes, @NativeType("void *") ByteBuffer baseaddr) {
        if (CHECKS) {
            check(baseaddr, rowbytes * height);
        }
        return nCGLSetOffScreen(ctx, width, height, rowbytes, memAddress(baseaddr));
    }

    // --- [ CGLGetOffScreen ] ---

    /** {@code CGLError CGLGetOffScreen(CGLContextObj ctx, GLsizei * width, GLsizei * height, GLint * rowbytes, void ** baseaddr)} */
    public static int nCGLGetOffScreen(long ctx, long width, long height, long rowbytes, long baseaddr) {
        long __functionAddress = Functions.GetOffScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPPPPPI(ctx, width, height, rowbytes, baseaddr, __functionAddress);
    }

    /** {@code CGLError CGLGetOffScreen(CGLContextObj ctx, GLsizei * width, GLsizei * height, GLint * rowbytes, void ** baseaddr)} */
    @NativeType("CGLError")
    public static int CGLGetOffScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLsizei *") IntBuffer width, @NativeType("GLsizei *") IntBuffer height, @NativeType("GLint *") IntBuffer rowbytes, @NativeType("void **") PointerBuffer baseaddr) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(rowbytes, 1);
            check(baseaddr, 1);
        }
        return nCGLGetOffScreen(ctx, memAddress(width), memAddress(height), memAddress(rowbytes), memAddress(baseaddr));
    }

    // --- [ CGLSetFullScreen ] ---

    /** {@code CGLError CGLSetFullScreen(CGLContextObj ctx)} */
    @NativeType("CGLError")
    public static int CGLSetFullScreen(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.SetFullScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLSetFullScreenOnDisplay ] ---

    /** {@code CGLError CGLSetFullScreenOnDisplay(CGLContextObj ctx, GLuint display_mask)} */
    @NativeType("CGLError")
    public static int CGLSetFullScreenOnDisplay(@NativeType("CGLContextObj") long ctx, @NativeType("GLuint") int display_mask) {
        long __functionAddress = Functions.SetFullScreenOnDisplay;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, display_mask, __functionAddress);
    }

    // --- [ CGLSetPBuffer ] ---

    /** {@code CGLError CGLSetPBuffer(CGLContextObj ctx, CGLPBufferObj pbuffer, GLenum face, GLint level, GLint screen)} */
    @NativeType("CGLError")
    public static int CGLSetPBuffer(@NativeType("CGLContextObj") long ctx, @NativeType("CGLPBufferObj") long pbuffer, @NativeType("GLenum") int face, @NativeType("GLint") int level, @NativeType("GLint") int screen) {
        long __functionAddress = Functions.SetPBuffer;
        if (CHECKS) {
            check(ctx);
            check(pbuffer);
        }
        return callPPI(ctx, pbuffer, face, level, screen, __functionAddress);
    }

    // --- [ CGLGetPBuffer ] ---

    /** {@code CGLError CGLGetPBuffer(CGLContextObj ctx, CGLPBufferObj * pbuffer, GLenum * face, GLint * level, GLint * screen)} */
    public static int nCGLGetPBuffer(long ctx, long pbuffer, long face, long level, long screen) {
        long __functionAddress = Functions.GetPBuffer;
        if (CHECKS) {
            check(ctx);
        }
        return callPPPPPI(ctx, pbuffer, face, level, screen, __functionAddress);
    }

    /** {@code CGLError CGLGetPBuffer(CGLContextObj ctx, CGLPBufferObj * pbuffer, GLenum * face, GLint * level, GLint * screen)} */
    @NativeType("CGLError")
    public static int CGLGetPBuffer(@NativeType("CGLContextObj") long ctx, @NativeType("CGLPBufferObj *") PointerBuffer pbuffer, @NativeType("GLenum *") IntBuffer face, @NativeType("GLint *") IntBuffer level, @NativeType("GLint *") IntBuffer screen) {
        if (CHECKS) {
            check(pbuffer, 1);
            check(face, 1);
            check(level, 1);
            check(screen, 1);
        }
        return nCGLGetPBuffer(ctx, memAddress(pbuffer), memAddress(face), memAddress(level), memAddress(screen));
    }

    // --- [ CGLClearDrawable ] ---

    /** {@code CGLError CGLClearDrawable(CGLContextObj ctx)} */
    @NativeType("CGLError")
    public static int CGLClearDrawable(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.ClearDrawable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLFlushDrawable ] ---

    /** {@code CGLError CGLFlushDrawable(CGLContextObj ctx)} */
    @NativeType("CGLError")
    public static int CGLFlushDrawable(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.FlushDrawable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLEnable ] ---

    /** {@code CGLError CGLEnable(CGLContextObj ctx, CGLContextEnable pname)} */
    @NativeType("CGLError")
    public static int CGLEnable(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname) {
        long __functionAddress = Functions.Enable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, pname, __functionAddress);
    }

    // --- [ CGLDisable ] ---

    /** {@code CGLError CGLDisable(CGLContextObj ctx, CGLContextEnable pname)} */
    @NativeType("CGLError")
    public static int CGLDisable(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname) {
        long __functionAddress = Functions.Disable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, pname, __functionAddress);
    }

    // --- [ CGLIsEnabled ] ---

    /** {@code CGLError CGLIsEnabled(CGLContextObj ctx, CGLContextEnable pname, GLint * enable)} */
    public static int nCGLIsEnabled(long ctx, int pname, long enable) {
        long __functionAddress = Functions.IsEnabled;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, pname, enable, __functionAddress);
    }

    /** {@code CGLError CGLIsEnabled(CGLContextObj ctx, CGLContextEnable pname, GLint * enable)} */
    @NativeType("CGLError")
    public static int CGLIsEnabled(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname, @NativeType("GLint *") IntBuffer enable) {
        if (CHECKS) {
            check(enable, 1);
        }
        return nCGLIsEnabled(ctx, pname, memAddress(enable));
    }

    // --- [ CGLSetParameter ] ---

    /** {@code CGLError CGLSetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint const * params)} */
    public static int nCGLSetParameter(long ctx, int pname, long params) {
        long __functionAddress = Functions.SetParameter;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /** {@code CGLError CGLSetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint const * params)} */
    @NativeType("CGLError")
    public static int CGLSetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLSetParameter(ctx, pname, memAddress(params));
    }

    /** {@code CGLError CGLSetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint const * params)} */
    @NativeType("CGLError")
    public static int CGLSetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            return nCGLSetParameter(ctx, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ CGLGetParameter ] ---

    /** {@code CGLError CGLGetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint * params)} */
    public static int nCGLGetParameter(long ctx, int pname, long params) {
        long __functionAddress = Functions.GetParameter;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /** {@code CGLError CGLGetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint * params)} */
    @NativeType("CGLError")
    public static int CGLGetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLGetParameter(ctx, pname, memAddress(params));
    }

    // --- [ CGLSetVirtualScreen ] ---

    /** {@code CGLError CGLSetVirtualScreen(CGLContextObj ctx, GLint screen)} */
    @NativeType("CGLError")
    public static int CGLSetVirtualScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLint") int screen) {
        long __functionAddress = Functions.SetVirtualScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, screen, __functionAddress);
    }

    // --- [ CGLGetVirtualScreen ] ---

    /** {@code CGLError CGLGetVirtualScreen(CGLContextObj ctx, GLint * screen)} */
    public static int nCGLGetVirtualScreen(long ctx, long screen) {
        long __functionAddress = Functions.GetVirtualScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, screen, __functionAddress);
    }

    /** {@code CGLError CGLGetVirtualScreen(CGLContextObj ctx, GLint * screen)} */
    @NativeType("CGLError")
    public static int CGLGetVirtualScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLint *") IntBuffer screen) {
        if (CHECKS) {
            check(screen, 1);
        }
        return nCGLGetVirtualScreen(ctx, memAddress(screen));
    }

    // --- [ CGLUpdateContext ] ---

    /** {@code CGLError CGLUpdateContext(CGLContextObj ctx)} */
    @NativeType("CGLError")
    public static int CGLUpdateContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.UpdateContext;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLSetGlobalOption ] ---

    /** {@code CGLError CGLSetGlobalOption(CGLGlobalOption pname, GLint const * params)} */
    public static int nCGLSetGlobalOption(int pname, long params) {
        long __functionAddress = Functions.SetGlobalOption;
        return callPI(pname, params, __functionAddress);
    }

    /** {@code CGLError CGLSetGlobalOption(CGLGlobalOption pname, GLint const * params)} */
    @NativeType("CGLError")
    public static int CGLSetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLSetGlobalOption(pname, memAddress(params));
    }

    /** {@code CGLError CGLSetGlobalOption(CGLGlobalOption pname, GLint const * params)} */
    @NativeType("CGLError")
    public static int CGLSetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            return nCGLSetGlobalOption(pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ CGLGetGlobalOption ] ---

    /** {@code CGLError CGLGetGlobalOption(CGLGlobalOption pname, GLint * params)} */
    public static int nCGLGetGlobalOption(int pname, long params) {
        long __functionAddress = Functions.GetGlobalOption;
        return callPI(pname, params, __functionAddress);
    }

    /** {@code CGLError CGLGetGlobalOption(CGLGlobalOption pname, GLint * params)} */
    @NativeType("CGLError")
    public static int CGLGetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLGetGlobalOption(pname, memAddress(params));
    }

    // --- [ CGLLockContext ] ---

    /** {@code CGLError CGLLockContext(CGLContextObj context)} */
    @NativeType("CGLError")
    public static int CGLLockContext(@NativeType("CGLContextObj") long context) {
        long __functionAddress = Functions.LockContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ CGLUnlockContext ] ---

    /** {@code CGLError CGLUnlockContext(CGLContextObj context)} */
    @NativeType("CGLError")
    public static int CGLUnlockContext(@NativeType("CGLContextObj") long context) {
        long __functionAddress = Functions.UnlockContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ CGLGetVersion ] ---

    /** {@code void CGLGetVersion(GLint * majorvers, GLint * minorvers)} */
    public static void nCGLGetVersion(long majorvers, long minorvers) {
        long __functionAddress = Functions.GetVersion;
        callPPV(majorvers, minorvers, __functionAddress);
    }

    /** {@code void CGLGetVersion(GLint * majorvers, GLint * minorvers)} */
    public static void CGLGetVersion(@NativeType("GLint *") IntBuffer majorvers, @NativeType("GLint *") IntBuffer minorvers) {
        if (CHECKS) {
            check(majorvers, 1);
            check(minorvers, 1);
        }
        nCGLGetVersion(memAddress(majorvers), memAddress(minorvers));
    }

    // --- [ CGLErrorString ] ---

    /** {@code char const * CGLErrorString(CGLError error)} */
    public static long nCGLErrorString(int error) {
        long __functionAddress = Functions.ErrorString;
        return callP(error, __functionAddress);
    }

    /** {@code char const * CGLErrorString(CGLError error)} */
    @NativeType("char const *")
    public static @Nullable String CGLErrorString(@NativeType("CGLError") int error) {
        long __result = nCGLErrorString(error);
        return memASCIISafe(__result);
    }

    /** {@code CGLError CGLChoosePixelFormat(CGLPixelFormatAttribute const * attribs, CGLPixelFormatObj * pix, GLint * npix)} */
    @NativeType("CGLError")
    public static int CGLChoosePixelFormat(@NativeType("CGLPixelFormatAttribute const *") int[] attribs, @NativeType("CGLPixelFormatObj *") PointerBuffer pix, @NativeType("GLint *") int[] npix) {
        long __functionAddress = Functions.ChoosePixelFormat;
        if (CHECKS) {
            checkNT(attribs);
            check(pix, 1);
            check(npix, 1);
        }
        return callPPPI(attribs, memAddress(pix), npix, __functionAddress);
    }

    /** {@code CGLError CGLDescribePixelFormat(CGLPixelFormatObj pix, GLint pix_num, CGLPixelFormatAttribute attrib, GLint * value)} */
    @NativeType("CGLError")
    public static int CGLDescribePixelFormat(@NativeType("CGLPixelFormatObj") long pix, @NativeType("GLint") int pix_num, @NativeType("CGLPixelFormatAttribute") int attrib, @NativeType("GLint *") int[] value) {
        long __functionAddress = Functions.DescribePixelFormat;
        if (CHECKS) {
            check(pix);
            check(value, 1);
        }
        return callPPI(pix, pix_num, attrib, value, __functionAddress);
    }

    /** {@code CGLError CGLQueryRendererInfo(GLuint display_mask, CGLRendererInfoObj * rend, GLint * nrend)} */
    @NativeType("CGLError")
    public static int CGLQueryRendererInfo(@NativeType("GLuint") int display_mask, @NativeType("CGLRendererInfoObj *") PointerBuffer rend, @NativeType("GLint *") int[] nrend) {
        long __functionAddress = Functions.QueryRendererInfo;
        if (CHECKS) {
            check(rend, 1);
            check(nrend, 1);
        }
        return callPPI(display_mask, memAddress(rend), nrend, __functionAddress);
    }

    /** {@code CGLError CGLDescribeRenderer(CGLRendererInfoObj rend, GLint rend_num, CGLRendererProperty prop, GLint * value)} */
    @NativeType("CGLError")
    public static int CGLDescribeRenderer(@NativeType("CGLRendererInfoObj") long rend, @NativeType("GLint") int rend_num, @NativeType("CGLRendererProperty") int prop, @NativeType("GLint *") int[] value) {
        long __functionAddress = Functions.DescribeRenderer;
        if (CHECKS) {
            check(rend);
            check(value, 1);
        }
        return callPPI(rend, rend_num, prop, value, __functionAddress);
    }

    /** {@code CGLError CGLDescribePBuffer(CGLPBufferObj obj, GLsizei * width, GLsizei * height, GLenum * target, GLenum * internalFormat, GLint * mipmap)} */
    @NativeType("CGLError")
    public static int CGLDescribePBuffer(@NativeType("CGLPBufferObj") long obj, @NativeType("GLsizei *") int[] width, @NativeType("GLsizei *") int[] height, @NativeType("GLenum *") int[] target, @NativeType("GLenum *") int[] internalFormat, @NativeType("GLint *") int[] mipmap) {
        long __functionAddress = Functions.DescribePBuffer;
        if (CHECKS) {
            check(obj);
            check(width, 1);
            check(height, 1);
            check(target, 1);
            check(internalFormat, 1);
            check(mipmap, 1);
        }
        return callPPPPPPI(obj, width, height, target, internalFormat, mipmap, __functionAddress);
    }

    /** {@code CGLError CGLGetOffScreen(CGLContextObj ctx, GLsizei * width, GLsizei * height, GLint * rowbytes, void ** baseaddr)} */
    @NativeType("CGLError")
    public static int CGLGetOffScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLsizei *") int[] width, @NativeType("GLsizei *") int[] height, @NativeType("GLint *") int[] rowbytes, @NativeType("void **") PointerBuffer baseaddr) {
        long __functionAddress = Functions.GetOffScreen;
        if (CHECKS) {
            check(ctx);
            check(width, 1);
            check(height, 1);
            check(rowbytes, 1);
            check(baseaddr, 1);
        }
        return callPPPPPI(ctx, width, height, rowbytes, memAddress(baseaddr), __functionAddress);
    }

    /** {@code CGLError CGLGetPBuffer(CGLContextObj ctx, CGLPBufferObj * pbuffer, GLenum * face, GLint * level, GLint * screen)} */
    @NativeType("CGLError")
    public static int CGLGetPBuffer(@NativeType("CGLContextObj") long ctx, @NativeType("CGLPBufferObj *") PointerBuffer pbuffer, @NativeType("GLenum *") int[] face, @NativeType("GLint *") int[] level, @NativeType("GLint *") int[] screen) {
        long __functionAddress = Functions.GetPBuffer;
        if (CHECKS) {
            check(ctx);
            check(pbuffer, 1);
            check(face, 1);
            check(level, 1);
            check(screen, 1);
        }
        return callPPPPPI(ctx, memAddress(pbuffer), face, level, screen, __functionAddress);
    }

    /** {@code CGLError CGLIsEnabled(CGLContextObj ctx, CGLContextEnable pname, GLint * enable)} */
    @NativeType("CGLError")
    public static int CGLIsEnabled(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname, @NativeType("GLint *") int[] enable) {
        long __functionAddress = Functions.IsEnabled;
        if (CHECKS) {
            check(ctx);
            check(enable, 1);
        }
        return callPPI(ctx, pname, enable, __functionAddress);
    }

    /** {@code CGLError CGLSetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint const * params)} */
    @NativeType("CGLError")
    public static int CGLSetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = Functions.SetParameter;
        if (CHECKS) {
            check(ctx);
            check(params, 1);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /** {@code CGLError CGLGetParameter(CGLContextObj ctx, CGLContextParameter pname, GLint * params)} */
    @NativeType("CGLError")
    public static int CGLGetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = Functions.GetParameter;
        if (CHECKS) {
            check(ctx);
            check(params, 1);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /** {@code CGLError CGLGetVirtualScreen(CGLContextObj ctx, GLint * screen)} */
    @NativeType("CGLError")
    public static int CGLGetVirtualScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLint *") int[] screen) {
        long __functionAddress = Functions.GetVirtualScreen;
        if (CHECKS) {
            check(ctx);
            check(screen, 1);
        }
        return callPPI(ctx, screen, __functionAddress);
    }

    /** {@code CGLError CGLSetGlobalOption(CGLGlobalOption pname, GLint const * params)} */
    @NativeType("CGLError")
    public static int CGLSetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = Functions.SetGlobalOption;
        if (CHECKS) {
            check(params, 1);
        }
        return callPI(pname, params, __functionAddress);
    }

    /** {@code CGLError CGLGetGlobalOption(CGLGlobalOption pname, GLint * params)} */
    @NativeType("CGLError")
    public static int CGLGetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = Functions.GetGlobalOption;
        if (CHECKS) {
            check(params, 1);
        }
        return callPI(pname, params, __functionAddress);
    }

    /** {@code void CGLGetVersion(GLint * majorvers, GLint * minorvers)} */
    public static void CGLGetVersion(@NativeType("GLint *") int[] majorvers, @NativeType("GLint *") int[] minorvers) {
        long __functionAddress = Functions.GetVersion;
        if (CHECKS) {
            check(majorvers, 1);
            check(minorvers, 1);
        }
        callPPV(majorvers, minorvers, __functionAddress);
    }

}