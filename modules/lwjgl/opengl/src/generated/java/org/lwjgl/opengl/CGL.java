/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to CGL. */
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

    /** Attribute names for {@link #CGLChoosePixelFormat ChoosePixelFormat} and {@link #CGLDescribePixelFormat DescribePixelFormat}. */
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

    /** Property names for {@link #CGLDescribeRenderer DescribeRenderer}. */
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

    /** Enable names for {@link #CGLEnable Enable}, {@link #CGLDisable Disable}, and {@link #CGLIsEnabled IsEnabled}. */
    public static final int
        kCGLCESwapRectangle           = 201,
        kCGLCESwapLimit               = 203,
        kCGLCERasterization           = 221,
        kCGLCEStateValidation         = 301,
        kCGLCESurfaceBackingSize      = 305,
        kCGLCEDisplayListOptimization = 307,
        kCGLCEMPEngine                = 313;

    /** Parameter names for {@link #CGLSetParameter SetParameter} and {@link #CGLGetParameter GetParameter}. */
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

    /** Option names for {@link #CGLSetGlobalOption SetGlobalOption} and {@link #CGLGetGlobalOption GetGlobalOption}. */
    public static final int
        kCGLGOFormatCacheSize  = 501,
        kCGLGOClearFormatCache = 502,
        kCGLGORetainRenderers  = 503,
        kCGLGOResetLibrary     = 504,
        kCGLGOUseErrorHandler  = 505,
        kCGLGOUseBuildCache    = 506;

    /** OpenGL Implementation Profiles. */
    public static final int
        kCGLOGLPVersion_Legacy   = 0x1000,
        kCGLOGLPVersion_3_2_Core = 0x3200;

    /** CGL error return values. */
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

    /** Buffer modes. */
    public static final int
        kCGLMonoscopicBit   = 0x1,
        kCGLStereoscopicBit = 0x2,
        kCGLSingleBufferBit = 0x4,
        kCGLDoubleBufferBit = 0x8,
        kCGLTripleBufferBit = 0x10;

    /** Depth and stencil buffer depths. */
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

    /** Color and accumulation buffer formats. */
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

    /** Sampling modes. */
    public static final int
        kCGLSupersampleBit = 0x1,
        kCGLMultisampleBit = 0x2;

    protected CGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ CGLGetCurrentContext ] ---

    /** Returns the current rendering context. If there is none, returns {@code NULL}. */
    @NativeType("CGLContextObj")
    public static long CGLGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return callP(__functionAddress);
    }

    // --- [ CGLSetCurrentContext ] ---

    /**
     * Sets the specified rendering context as the current rendering context.
     * 
     * <p>There can be only one current rendering context. Subsequent OpenGL rendering calls operate on the current rendering context to modify the drawable
     * object associated with it.</p>
     * 
     * <p>You can use AGL macros to bypass the current rendering context mechanism and maintain your own current rendering context.</p>
     * 
     * <p>A context is current on a per-thread basis. Multiple threads must serialize calls into the same context.</p>
     *
     * @param context the rendering context to set as the current rendering context. Pass {@code NULL} to release the current rendering context without assigning a new one.
     */
    @NativeType("CGLError")
    public static int CGLSetCurrentContext(@NativeType("CGLContextObj") long context) {
        long __functionAddress = Functions.SetCurrentContext;
        return callPI(context, __functionAddress);
    }

    // --- [ CGLGetShareGroup ] ---

    /**
     * Returns the sharegroup of the specified rendering context.
     *
     * @param ctx a rendering context
     */
    @NativeType("CGLShareGroupObj")
    public static long CGLGetShareGroup(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.GetShareGroup;
        if (CHECKS) {
            check(ctx);
        }
        return callPP(ctx, __functionAddress);
    }

    // --- [ CGLChoosePixelFormat ] ---

    /** Unsafe version of: {@link #CGLChoosePixelFormat ChoosePixelFormat} */
    public static int nCGLChoosePixelFormat(long attribs, long pix, long npix) {
        long __functionAddress = Functions.ChoosePixelFormat;
        return callPPPI(attribs, pix, npix, __functionAddress);
    }

    /**
     * Creates a pixel format object that satisfies the constraints of the specified buffer and renderer attributes.
     *
     * @param attribs a 0 terminated array that contains a list of buffer and renderer attributes. Attributes can be Boolean or integer. If an attribute is integer, you
     *                must supply the desired value immediately following the attribute. If the attribute is Boolean, do not supply a value because its presence in the
     *                attributes array implies a true value. One of:<br><table><tr><td>{@link #kCGLPFAAllRenderers PFAAllRenderers}</td><td>{@link #kCGLPFATripleBuffer PFATripleBuffer}</td><td>{@link #kCGLPFADoubleBuffer PFADoubleBuffer}</td><td>{@link #kCGLPFAStereo PFAStereo}</td><td>{@link #kCGLPFAColorSize PFAColorSize}</td></tr><tr><td>{@link #kCGLPFAAlphaSize PFAAlphaSize}</td><td>{@link #kCGLPFADepthSize PFADepthSize}</td><td>{@link #kCGLPFAStencilSize PFAStencilSize}</td><td>{@link #kCGLPFAMinimumPolicy PFAMinimumPolicy}</td><td>{@link #kCGLPFAMaximumPolicy PFAMaximumPolicy}</td></tr><tr><td>{@link #kCGLPFASampleBuffers PFASampleBuffers}</td><td>{@link #kCGLPFASamples PFASamples}</td><td>{@link #kCGLPFAColorFloat PFAColorFloat}</td><td>{@link #kCGLPFAMultisample PFAMultisample}</td><td>{@link #kCGLPFASupersample PFASupersample}</td></tr><tr><td>{@link #kCGLPFASampleAlpha PFASampleAlpha}</td><td>{@link #kCGLPFARendererID PFARendererID}</td><td>{@link #kCGLPFASingleRenderer PFASingleRenderer}</td><td>{@link #kCGLPFANoRecovery PFANoRecovery}</td><td>{@link #kCGLPFAAccelerated PFAAccelerated}</td></tr><tr><td>{@link #kCGLPFAClosestPolicy PFAClosestPolicy}</td><td>{@link #kCGLPFABackingStore PFABackingStore}</td><td>{@link #kCGLPFABackingVolatile PFABackingVolatile}</td><td>{@link #kCGLPFADisplayMask PFADisplayMask}</td><td>{@link #kCGLPFAAllowOfflineRenderers PFAAllowOfflineRenderers}</td></tr><tr><td>{@link #kCGLPFAAcceleratedCompute PFAAcceleratedCompute}</td><td>{@link #kCGLPFAOpenGLProfile PFAOpenGLProfile}</td><td>{@link #kCGLPFASupportsAutomaticGraphicsSwitching PFASupportsAutomaticGraphicsSwitching}</td><td>{@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}</td><td>{@link #kCGLPFAAuxBuffers PFAAuxBuffers}</td></tr><tr><td>{@link #kCGLPFAAccumSize PFAAccumSize}</td><td>{@link #kCGLPFAOffScreen PFAOffScreen}</td><td>{@link #kCGLPFAAuxDepthStencil PFAAuxDepthStencil}</td><td>{@link #kCGLPFAWindow PFAWindow}</td><td>{@link #kCGLPFACompliant PFACompliant}</td></tr><tr><td>{@link #kCGLPFAPBuffer PFAPBuffer}</td><td>{@link #kCGLPFARemotePBuffer PFARemotePBuffer}</td><td>{@link #kCGLPFARobust PFARobust}</td><td>{@link #kCGLPFAMPSafe PFAMPSafe}</td><td>{@link #kCGLPFAMultiScreen PFAMultiScreen}</td></tr><tr><td>{@link #kCGLPFAFullScreen PFAFullScreen}</td></tr></table>
     * @param pix     the memory address of a pixel format object. On return, points to a new pixel format object that contains pixel format information and a list of
     *                virtual screens. If there are no pixel formats or virtual screens that satisfy the constraints of the buffer and renderer attributes, the value of
     *                pix is set to {@code NULL}.
     * @param npix    on return, points to the number of virtual screens referenced by pix. If pix is {@code NULL}, the value of {@code npix} is set to 0.
     */
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

    /**
     * Frees the memory associated with a pixel format object. Calling this function is equivalent to calling {@link #CGLReleasePixelFormat ReleasePixelFormat}.
     *
     * @param pix the pixel format object to destroy
     */
    @NativeType("CGLError")
    public static int CGLDestroyPixelFormat(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.DestroyPixelFormat;
        if (CHECKS) {
            check(pix);
        }
        return callPI(pix, __functionAddress);
    }

    // --- [ CGLDescribePixelFormat ] ---

    /** Unsafe version of: {@link #CGLDescribePixelFormat DescribePixelFormat} */
    public static int nCGLDescribePixelFormat(long pix, int pix_num, int attrib, long value) {
        long __functionAddress = Functions.DescribePixelFormat;
        if (CHECKS) {
            check(pix);
        }
        return callPPI(pix, pix_num, attrib, value, __functionAddress);
    }

    /**
     * Retrieves the values of an attribute associated with a pixel format object.
     *
     * @param pix     the pixel format object to query
     * @param pix_num the virtual screen number whose attribute value you want to retrieve. This value must be between 0 and the number of virtual screens minus one.
     * @param attrib  the attribute whose value you want to obtain. One of:<br><table><tr><td>{@link #kCGLPFAAllRenderers PFAAllRenderers}</td><td>{@link #kCGLPFATripleBuffer PFATripleBuffer}</td><td>{@link #kCGLPFADoubleBuffer PFADoubleBuffer}</td><td>{@link #kCGLPFAStereo PFAStereo}</td><td>{@link #kCGLPFAColorSize PFAColorSize}</td></tr><tr><td>{@link #kCGLPFAAlphaSize PFAAlphaSize}</td><td>{@link #kCGLPFADepthSize PFADepthSize}</td><td>{@link #kCGLPFAStencilSize PFAStencilSize}</td><td>{@link #kCGLPFAMinimumPolicy PFAMinimumPolicy}</td><td>{@link #kCGLPFAMaximumPolicy PFAMaximumPolicy}</td></tr><tr><td>{@link #kCGLPFASampleBuffers PFASampleBuffers}</td><td>{@link #kCGLPFASamples PFASamples}</td><td>{@link #kCGLPFAColorFloat PFAColorFloat}</td><td>{@link #kCGLPFAMultisample PFAMultisample}</td><td>{@link #kCGLPFASupersample PFASupersample}</td></tr><tr><td>{@link #kCGLPFASampleAlpha PFASampleAlpha}</td><td>{@link #kCGLPFARendererID PFARendererID}</td><td>{@link #kCGLPFASingleRenderer PFASingleRenderer}</td><td>{@link #kCGLPFANoRecovery PFANoRecovery}</td><td>{@link #kCGLPFAAccelerated PFAAccelerated}</td></tr><tr><td>{@link #kCGLPFAClosestPolicy PFAClosestPolicy}</td><td>{@link #kCGLPFABackingStore PFABackingStore}</td><td>{@link #kCGLPFABackingVolatile PFABackingVolatile}</td><td>{@link #kCGLPFADisplayMask PFADisplayMask}</td><td>{@link #kCGLPFAAllowOfflineRenderers PFAAllowOfflineRenderers}</td></tr><tr><td>{@link #kCGLPFAAcceleratedCompute PFAAcceleratedCompute}</td><td>{@link #kCGLPFAOpenGLProfile PFAOpenGLProfile}</td><td>{@link #kCGLPFASupportsAutomaticGraphicsSwitching PFASupportsAutomaticGraphicsSwitching}</td><td>{@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}</td><td>{@link #kCGLPFAAuxBuffers PFAAuxBuffers}</td></tr><tr><td>{@link #kCGLPFAAccumSize PFAAccumSize}</td><td>{@link #kCGLPFAOffScreen PFAOffScreen}</td><td>{@link #kCGLPFAAuxDepthStencil PFAAuxDepthStencil}</td><td>{@link #kCGLPFAWindow PFAWindow}</td><td>{@link #kCGLPFACompliant PFACompliant}</td></tr><tr><td>{@link #kCGLPFAPBuffer PFAPBuffer}</td><td>{@link #kCGLPFARemotePBuffer PFARemotePBuffer}</td><td>{@link #kCGLPFARobust PFARobust}</td><td>{@link #kCGLPFAMPSafe PFAMPSafe}</td><td>{@link #kCGLPFAMultiScreen PFAMultiScreen}</td></tr><tr><td>{@link #kCGLPFAFullScreen PFAFullScreen}</td></tr></table>
     * @param value   on return, points to the value of the attribute
     */
    @NativeType("CGLError")
    public static int CGLDescribePixelFormat(@NativeType("CGLPixelFormatObj") long pix, @NativeType("GLint") int pix_num, @NativeType("CGLPixelFormatAttribute") int attrib, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nCGLDescribePixelFormat(pix, pix_num, attrib, memAddress(value));
    }

    // --- [ CGLReleasePixelFormat ] ---

    /**
     * Decrements the reference count of a pixel format object.
     * 
     * <p>The system retains the pixel format object when you call the function {@link #CGLCreateContext CreateContext}, so you can release a pixel format object immediately
     * after passing it to the context creation function.</p>
     * 
     * <p>Each call to CGLReleasePixelFormat decreases the reference count by 1. If the reference count reaches 0, the pixel format object is destroyed.</p>
     *
     * @param pix the pixel format object whose reference count should be decremented
     */
    public static void CGLReleasePixelFormat(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.ReleasePixelFormat;
        if (CHECKS) {
            check(pix);
        }
        callPV(pix, __functionAddress);
    }

    // --- [ CGLRetainPixelFormat ] ---

    /**
     * Increments the receiver's reference count.
     * 
     * <p>Each call to CGLRetainPixelFormat increases the reference count by 1. Each call to CGLRetainPixelFormat must be matched with a call to
     * {@link #CGLReleasePixelFormat ReleasePixelFormat}.</p>
     *
     * @param pix the pixel format object whose reference count should be incremented
     */
    @NativeType("CGLPixelFormatObj")
    public static long CGLRetainPixelFormat(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.RetainPixelFormat;
        if (CHECKS) {
            check(pix);
        }
        return callPP(pix, __functionAddress);
    }

    // --- [ CGLGetPixelFormatRetainCount ] ---

    /**
     * Returns the retain count of a pixel format object.
     *
     * @param pix a pixel format object
     */
    @NativeType("GLuint")
    public static int CGLGetPixelFormatRetainCount(@NativeType("CGLPixelFormatObj") long pix) {
        long __functionAddress = Functions.GetPixelFormatRetainCount;
        if (CHECKS) {
            check(pix);
        }
        return callPI(pix, __functionAddress);
    }

    // --- [ CGLQueryRendererInfo ] ---

    /** Unsafe version of: {@link #CGLQueryRendererInfo QueryRendererInfo} */
    public static int nCGLQueryRendererInfo(int display_mask, long rend, long nrend) {
        long __functionAddress = Functions.QueryRendererInfo;
        return callPPI(display_mask, rend, nrend, __functionAddress);
    }

    /**
     * Creates a renderer information object that contains properties and values for renderers able to drive all the specified displays in a given display
     * mask.
     *
     * @param display_mask a bit field that contains the bitwise OR of OpenGL display masks returned by the CGDisplayIDToOpenGLDisplayMask function. If you want to obtain
     *                     information for all renderers in the system you must call CGLQueryRendererInfo once for each display bit.
     * @param rend         the memory address of a renderer information object. On return, points to a renderer information object that describes all renderers that are able
     *                     to drive the displays specified by the {@code display_mask} parameter. If {@code display_mask} does not specify any displays, the value of
     *                     {@code rend} is set to {@code NULL}. You must call {@link #CGLDestroyRendererInfo DestroyRendererInfo} when you no longer need this object.
     * @param nrend        on return, points to the number of renderers described in the renderer information object. If {@code display_mask} does not specify any displays,
     *                     the value of {@code nrend} is set to 0.
     */
    @NativeType("CGLError")
    public static int CGLQueryRendererInfo(@NativeType("GLuint") int display_mask, @NativeType("CGLRendererInfoObj *") PointerBuffer rend, @NativeType("GLint *") IntBuffer nrend) {
        if (CHECKS) {
            check(rend, 1);
            check(nrend, 1);
        }
        return nCGLQueryRendererInfo(display_mask, memAddress(rend), memAddress(nrend));
    }

    // --- [ CGLDestroyRendererInfo ] ---

    /**
     * Frees resources associated with a renderer information object.
     *
     * @param rend the renderer information object to destroy
     */
    @NativeType("CGLError")
    public static int CGLDestroyRendererInfo(@NativeType("CGLRendererInfoObj") long rend) {
        long __functionAddress = Functions.DestroyRendererInfo;
        if (CHECKS) {
            check(rend);
        }
        return callPI(rend, __functionAddress);
    }

    // --- [ CGLDescribeRenderer ] ---

    /** Unsafe version of: {@link #CGLDescribeRenderer DescribeRenderer} */
    public static int nCGLDescribeRenderer(long rend, int rend_num, int prop, long value) {
        long __functionAddress = Functions.DescribeRenderer;
        if (CHECKS) {
            check(rend);
        }
        return callPPI(rend, rend_num, prop, value, __functionAddress);
    }

    /**
     * Obtains the value associated with a renderer property.
     *
     * @param rend     an opaque renderer information object that contains a description of the renderer capabilities you want to inspect. You can obtain a renderer
     *                 information object by calling the function {@link #CGLQueryRendererInfo QueryRendererInfo}. You must call {@link #CGLDestroyRendererInfo DestroyRendererInfo} when you no longer need this
     *                 object.
     * @param rend_num the index of the renderer inside the renderer information object — a value between 0 and the number of renderers minus one. The number of renderers
     *                 can be obtained by calling {@link #CGLDescribeRenderer DescribeRenderer}, passing in {@code rend}, renderer number 0, and the renderer property
     *                 {@link #kCGLRPRendererCount RPRendererCount}.
     * @param prop     the renderer property whose value you want to obtain. One of:<br><table><tr><td>{@link #kCGLRPOffScreen RPOffScreen}</td><td>{@link #kCGLRPRendererID RPRendererID}</td><td>{@link #kCGLRPAccelerated RPAccelerated}</td><td>{@link #kCGLRPBackingStore RPBackingStore}</td><td>{@link #kCGLRPWindow RPWindow}</td></tr><tr><td>{@link #kCGLRPCompliant RPCompliant}</td><td>{@link #kCGLRPDisplayMask RPDisplayMask}</td><td>{@link #kCGLRPBufferModes RPBufferModes}</td><td>{@link #kCGLRPColorModes RPColorModes}</td><td>{@link #kCGLRPAccumModes RPAccumModes}</td></tr><tr><td>{@link #kCGLRPDepthModes RPDepthModes}</td><td>{@link #kCGLRPStencilModes RPStencilModes}</td><td>{@link #kCGLRPMaxAuxBuffers RPMaxAuxBuffers}</td><td>{@link #kCGLRPMaxSampleBuffers RPMaxSampleBuffers}</td><td>{@link #kCGLRPMaxSamples RPMaxSamples}</td></tr><tr><td>{@link #kCGLRPSampleModes RPSampleModes}</td><td>{@link #kCGLRPSampleAlpha RPSampleAlpha}</td><td>{@link #kCGLRPVideoMemory RPVideoMemory}</td><td>{@link #kCGLRPTextureMemory RPTextureMemory}</td><td>{@link #kCGLRPGPUVertProcCapable RPGPUVertProcCapable}</td></tr><tr><td>{@link #kCGLRPGPUFragProcCapable RPGPUFragProcCapable}</td><td>{@link #kCGLRPRendererCount RPRendererCount}</td><td>{@link #kCGLRPOnline RPOnline}</td><td>{@link #kCGLRPAcceleratedCompute RPAcceleratedCompute}</td><td>{@link #kCGLRPVideoMemoryMegabytes RPVideoMemoryMegabytes}</td></tr><tr><td>{@link #kCGLRPTextureMemoryMegabytes RPTextureMemoryMegabytes}</td><td>{@link #kCGLRPRobust RPRobust}</td><td>{@link #kCGLRPMPSafe RPMPSafe}</td><td>{@link #kCGLRPMultiScreen RPMultiScreen}</td><td>{@link #kCGLRPFullScreen RPFullScreen}</td></tr></table>
     * @param value    on return, points to the value of the requested property
     */
    @NativeType("CGLError")
    public static int CGLDescribeRenderer(@NativeType("CGLRendererInfoObj") long rend, @NativeType("GLint") int rend_num, @NativeType("CGLRendererProperty") int prop, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nCGLDescribeRenderer(rend, rend_num, prop, memAddress(value));
    }

    // --- [ CGLCreateContext ] ---

    /** Unsafe version of: {@link #CGLCreateContext CreateContext} */
    public static int nCGLCreateContext(long pix, long share, long ctx) {
        long __functionAddress = Functions.CreateContext;
        if (CHECKS) {
            check(pix);
        }
        return callPPPI(pix, share, ctx, __functionAddress);
    }

    /**
     * Creates a CGL rendering context.
     *
     * @param pix   a pixel format object created by calling the function {@link #CGLChoosePixelFormat ChoosePixelFormat}
     * @param share the rendering context with which to share the OpenGL object state — including texture objects, programs and shader display lists, vertex array
     *              objects, vertex buffer objects, pixel buffer objects, and frame buffer objects — and the object state associated which each of these object types.
     *              Pass {@code NULL} to indicate that no sharing is to take place.
     * @param ctx   the memory address of a context object. On return, points to a new context object with the buffers and attributes specified by the {@code pix}
     *              parameter. If the context can not be created as specified, the value of {@code ctx} is set to {@code NULL}.
     */
    @NativeType("CGLError")
    public static int CGLCreateContext(@NativeType("CGLPixelFormatObj") long pix, @NativeType("CGLContextObj") long share, @NativeType("CGLContextObj *") PointerBuffer ctx) {
        if (CHECKS) {
            check(ctx, 1);
        }
        return nCGLCreateContext(pix, share, memAddress(ctx));
    }

    // --- [ CGLDestroyContext ] ---

    /**
     * Frees the resources associated with a rendering context.
     * 
     * <p>Starting in Mac OS 10.5, CGL rendering contexts are reference counted. For compatibility reasons, calling CGLDestroyContext clears the drawable
     * associated with the rendering context. Calling CGLDestroyContext is the equivalent of calling both {@link #CGLClearDrawable ClearDrawable} and
     * {@link #CGLReleaseContext ReleaseContext}.</p>
     *
     * @param ctx the rendering context to destroy
     */
    @NativeType("CGLError")
    public static int CGLDestroyContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.DestroyContext;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLCopyContext ] ---

    /**
     * Copies the specified state variables from one rendering context to another.
     *
     * @param src  the source rendering context
     * @param dst  the destination rendering context
     * @param mask a mask that specifies the state variables to copy. Pass a bit field that contains the bitwise OR of the state variable names that you want to copy.
     *             Use the symbolic mask constants that are passed to the OpenGL function {@link GL11#glPushAttrib PushAttrib}. To copy as many state variables
     *             as possible, supply the constant {@link GL11#GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS}.
     */
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

    /**
     * Increments the retain count on a CGL rendering context.
     * 
     * <p>Each call to CGLRetainContext increases the retain count by 1. To prevent memory leaks, each retain call must be balanced with a call to
     * {@link #CGLReleaseContext ReleaseContext}.</p>
     *
     * @param ctx the rendering context to be retained
     *
     * @return the same context that was passed into the function.
     */
    @NativeType("CGLContextObj")
    public static long CGLRetainContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.RetainContext;
        if (CHECKS) {
            check(ctx);
        }
        return callPP(ctx, __functionAddress);
    }

    // --- [ CGLReleaseContext ] ---

    /**
     * Decrements the retain count on a CGL rendering context.
     * 
     * <p>Each call to CGLReleaseContext decreases the retain count by 1.</p>
     * 
     * <p>When the retain count reaches 0, all resources associated with the rendering context are freed. If the rendering context that you pass is the current
     * rendering context and it is freed, the current context is set to {@code NULL} and there is no current rendering context after the function executes. After the
     * context is freed, you must make sure you do not use the destroyed rendering context. This includes using CGL macros in which the rendering context is
     * explicitly passed to OpenGL.</p>
     *
     * @param ctx the rendering context to be released
     */
    public static void CGLReleaseContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.ReleaseContext;
        if (CHECKS) {
            check(ctx);
        }
        callPV(ctx, __functionAddress);
    }

    // --- [ CGLGetContextRetainCount ] ---

    /**
     * Returns the current retain count of a CGL rendering context.
     *
     * @param ctx the CGL rendering context whose retain count you wish to discover
     */
    @NativeType("GLuint")
    public static int CGLGetContextRetainCount(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.GetContextRetainCount;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLGetPixelFormat ] ---

    /**
     * Retrieves the current pixel format associated with a CGL rendering context.
     * 
     * <p>The pixel format object is not retained before being returned to your application. If your application needs to maintain this object, it should call
     * {@link #CGLRetainPixelFormat RetainPixelFormat}.</p>
     *
     * @param ctx the CGL rendering context whose format you want to receive
     */
    @NativeType("CGLPixelFormatObj")
    public static long CGLGetPixelFormat(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.GetPixelFormat;
        if (CHECKS) {
            check(ctx);
        }
        return callPP(ctx, __functionAddress);
    }

    // --- [ CGLCreatePBuffer ] ---

    /** Unsafe version of: {@link #CGLCreatePBuffer CreatePBuffer} */
    public static int nCGLCreatePBuffer(int width, int height, int target, int internalFormat, int max_level, long pbuffer) {
        long __functionAddress = Functions.CreatePBuffer;
        return callPI(width, height, target, internalFormat, max_level, pbuffer, __functionAddress);
    }

    /**
     * Creates a pixel buffer of the specified size, compatible with the specified texture target.
     * 
     * <p>This function does not have any knowledge of OpenGL contexts or pixel format objects and does not specifically allocate the storage needed for the
     * actual pixel buffer. These operations occur when you call the function {@link #CGLSetPBuffer SetPBuffer}.</p>
     * 
     * <p>You can determine the dimensional limits of a pixel buffer by calling the OpenGL function glGetInteger. You can find the maximum size supported by
     * querying GL_MAX_VIEWPORT_DIMS and the minimum size by querying GL_MIN_PBUFFER_VIEWPORT_DIMS_APPLE, which returns two integer values (similar to
     * GL_MAX_VIEWPORT_DIMS). All pixel buffer dimensions that you request with the function aglCreatePBuffer should fall within these limits (inclusively)
     * and should comply with any limitations imposed by the texture target you select.</p>
     * 
     * <p>The maximum viewport size supported in OS X is quite large. You should take into consideration the amount of video or system memory required to support
     * the requested pixel buffer size, including additional memory needed for multiple buffers and options such as multisampling.</p>
     * 
     * <p>Starting in OS X v10.5, pixel buffer objects are reference counted. Pixel buffer objects are created with a reference count of 1 and are destroyed when
     * the last reference to the object is released.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param width          the width, in pixels, of the pixel buffer
     * @param height         the height, in pixels, of the pixel buffer
     * @param target         a constant that specifies the type of the pixel buffer target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td></tr></table>
     * @param internalFormat a constant that specifies the internal color format of the pixel buffer. The format controls whether the alpha channel of the pixel buffer is used
     *                       for texturing operations. One of:<br><table><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA}</td></tr></table>
     * @param max_level      the maximum level of mipmap detail allowable. Pass 0 for a pixel buffer that is not using mipmaps. The value passed should never exceed the actual
     *                       maximum number of mipmap levels that can be represented with the given width and height.
     * @param pbuffer        on return, points to a new pixel buffer object
     */
    @NativeType("CGLError")
    public static int CGLCreatePBuffer(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int max_level, @NativeType("CGLPBufferObj *") PointerBuffer pbuffer) {
        if (CHECKS) {
            check(pbuffer, 1);
        }
        return nCGLCreatePBuffer(width, height, target, internalFormat, max_level, memAddress(pbuffer));
    }

    // --- [ CGLDestroyPBuffer ] ---

    /**
     * Releases the resources associated with a pixel buffer object.
     * 
     * <p>Starting in OS X v10.5, pixel buffer objects are reference counted. Calling this function is equivalent to calling {@link #CGLReleasePBuffer ReleasePBuffer}.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param pbuffer the pixel buffer object whose resources you want to release
     */
    @NativeType("CGLError")
    public static int CGLDestroyPBuffer(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.DestroyPBuffer;
        if (CHECKS) {
            check(pbuffer);
        }
        return callPI(pbuffer, __functionAddress);
    }

    // --- [ CGLDescribePBuffer ] ---

    /** Unsafe version of: {@link #CGLDescribePBuffer DescribePBuffer} */
    public static int nCGLDescribePBuffer(long obj, long width, long height, long target, long internalFormat, long mipmap) {
        long __functionAddress = Functions.DescribePBuffer;
        if (CHECKS) {
            check(obj);
        }
        return callPPPPPPI(obj, width, height, target, internalFormat, mipmap, __functionAddress);
    }

    /**
     * Retrieves information that describes the specified pixel buffer object.
     * 
     * <p>The width, height, texture target, and internal texture color format of a pixel buffer object are set at its creation and cannot be changed without
     * destroying and recreating the object. The level is set when the pixel buffer object is attached to a rendering context by calling the function
     * {@link #CGLSetPBuffer SetPBuffer}.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param obj            a pointer to the pixel buffer object
     * @param width          on return, points to the width, in pixels, of the pixel buffer
     * @param height         on return, points to the height, in pixels, of the pixel buffer
     * @param target         on return, points to a constant that specifies the pixel buffer texture target
     * @param internalFormat on return, points to a constant that specifies the internal color format of the pixel buffer
     * @param mipmap         on return, points to the mipmap level of the pixel buffer or 0 if it doesn't use mipmaps
     */
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

    /**
     * Binds the contents of a pixel buffer to a data source for a texture object.
     * 
     * <p>You must generate and bind a texture name (using standard OpenGL texturing calls) that is compatible with the pixel buffer texture target. Don't supply
     * a texture object that was used previously for nonpixel buffer texturing operations unless you first call glDeleteTextures to regenerate the texture
     * name.</p>
     * 
     * <p>If you modify the content of a pixel buffer that uses mipmap levels, you must call this function again before drawing with the pixel buffer, to ensure
     * that the content is synchronized with OpenGL. For pixel buffers without mipmaps, simply rebind to the texture object to synchronize content.</p>
     * 
     * <p>No OpenGL texturing calls that modify a pixel buffer texture content are permitted (such as glTexSubImage2D or glCopyTexImage2D) with the pixel buffer
     * texture as the destination. It is permitted to use texturing commands to read data from a pixel buffer texture, such as glCopyTexImage2D, with the
     * pixel buffer texture as the source. It is also legal to use OpenGL functions such as glReadPixels to read the contents of a pixel buffer directly
     * through the pixel buffer context.</p>
     * 
     * <p>Note that texturing with the CGLTexImagePBuffer function can fail to produce the intended results without error in the same way other OpenGL texturing
     * commands can normally fail. The function fails if you set an incompatible filter mode, do not enable the proper texture target, or other conditions
     * described in the OpenGL specification.</p>
     * 
     * <p>You don't need to share a context to use a pixel buffer object as a texture source. You can use independent pixel format objects and OpenGL contexts
     * for both the pixel buffer and the target drawable object without sharing resources, and still texture using a pixel buffer in the target context.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param ctx     a rendering context, which is the target context for the texture operation. This is the context that you plan to render content to. This is not the
     *                context attached to the pixel buffer.
     * @param pbuffer a pixel buffer object
     * @param source  the source buffer to get the texture from, which should be a valid OpenGL buffer such as GL_FRONT or GL_BACK and should be compatible with the
     *                buffer and renderer attributes that you used to create the rendering context attached to the pixel buffer. This means that the pixel buffer must
     *                possess the buffer in question for the texturing operation to succeed.
     */
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

    /**
     * Increments the retain count on a pixel buffer object.
     * 
     * <p>Each call to CGLRetainPBuffer increases the retain count by 1. To prevent the pixel buffer object from being leaked, each retain call must be matched
     * with a call to {@link #CGLReleasePBuffer ReleasePBuffer}.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param pbuffer the pixel buffer object whose retain count you wish to increment
     */
    @NativeType("CGLPBufferObj")
    public static long CGLRetainPBuffer(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.RetainPBuffer;
        if (CHECKS) {
            check(pbuffer);
        }
        return callPP(pbuffer, __functionAddress);
    }

    // --- [ CGLReleasePBuffer ] ---

    /**
     * Releases the resources associated with a pixel buffer object.
     * 
     * <p>Starting in OS X v10.5, pixel buffer objects are reference counted. Calling this function is equivalent to calling CGLReleasePBuffer.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param pbuffer the pixel buffer object whose resources you want to release
     */
    public static void CGLReleasePBuffer(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.ReleasePBuffer;
        if (CHECKS) {
            check(pbuffer);
        }
        callPV(pbuffer, __functionAddress);
    }

    // --- [ CGLGetPBufferRetainCount ] ---

    /**
     * Returns the retain count of a pixel buffer object.
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param pbuffer the pixel buffer object whose retain count you wish to retrieve
     */
    @NativeType("GLuint")
    public static int CGLGetPBufferRetainCount(@NativeType("CGLPBufferObj") long pbuffer) {
        long __functionAddress = Functions.GetPBufferRetainCount;
        if (CHECKS) {
            check(pbuffer);
        }
        return callPI(pbuffer, __functionAddress);
    }

    // --- [ CGLSetOffScreen ] ---

    /** Unsafe version of: {@link #CGLSetOffScreen SetOffScreen} */
    public static int nCGLSetOffScreen(long ctx, int width, int height, int rowbytes, long baseaddr) {
        long __functionAddress = Functions.SetOffScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, width, height, rowbytes, baseaddr, __functionAddress);
    }

    /**
     * Attaches a rendering context to an offscreen buffer.
     * 
     * <p>Before calling this function, you must set up the rendering context using a pixel format object created with the kCGLPFAOffScreen attribute. For more
     * information about kCGLPFAOffScreen, see Buffer and Renderer Attributes.</p>
     * 
     * <p>After calling this function, subsequent OpenGL drawing is rendered into the offscreen buffer and the viewport of the rendering context is set to the
     * full size of the offscreen area.</p>
     * 
     * <p>To exit offscreen mode, call {@link #CGLClearDrawable ClearDrawable}.</p>
     * 
     * <p>To obtain functionality similar to offscreen mode on renderers that do not support it, attach the context to a hidden window and use the OpenGL
     * function glReadPixels.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param ctx      a rendering context
     * @param width    the width, in pixels, of the offscreen buffer
     * @param height   the height, in pixels, of the offscreen buffer
     * @param rowbytes the number of bytes per row of the offscreen buffer, which must be greater than or equal to width times bytes per pixel
     * @param baseaddr a pointer to a block of memory to use as the offscreen buffer. The size of the memory must be at least {@code rowbytes*height} bytes.
     */
    @NativeType("CGLError")
    public static int CGLSetOffScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int rowbytes, @NativeType("void *") ByteBuffer baseaddr) {
        if (CHECKS) {
            check(baseaddr, rowbytes * height);
        }
        return nCGLSetOffScreen(ctx, width, height, rowbytes, memAddress(baseaddr));
    }

    // --- [ CGLGetOffScreen ] ---

    /** Unsafe version of: {@link #CGLGetOffScreen GetOffScreen} */
    public static int nCGLGetOffScreen(long ctx, long width, long height, long rowbytes, long baseaddr) {
        long __functionAddress = Functions.GetOffScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPPPPPI(ctx, width, height, rowbytes, baseaddr, __functionAddress);
    }

    /**
     * Retrieves an offscreen buffer and its parameters for a specified rendering context.
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param ctx      a rendering context
     * @param width    on return, points to the width, in pixels, of the offscreen buffer. If the rendering context is not attached to an offscreen drawable object, the
     *                 value of width is set to 0.
     * @param height   on return, points to the height, in pixels, of the offscreen buffer. If the rendering context is not attached to an offscreen drawable object, the
     *                 value of height is set to 0.
     * @param rowbytes on return, points to the number of bytes per row of the offscreen buffer. If the context is not attached to an offscreen drawable object, the value
     *                 of rowbytes is set to 0.
     * @param baseaddr on return, points to the base address of the offscreen buffer. If the context is not attached to an offscreen drawable object, the value of
     *                 {@code baseaddr} is set to {@code NULL}.
     */
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

    /**
     * Attaches a rendering context to its full-screen drawable object.
     * 
     * <p>Before calling this function, you must set up the rendering context using a pixel format object created with the kCGLPFAFullScreen attribute (see
     * Buffer and Renderer Attributes). Some OpenGL renderers, such as the software renderer, do not support full-screen mode. After you call the function
     * {@link #CGLChoosePixelFormat ChoosePixelFormat} with the full-screen attribute, you need to check whether the pixel format object is created successfully.</p>
     * 
     * <p>You must capture the display prior to entering full-screen mode and release it after exiting. After calling this function, subsequent OpenGL drawing is
     * rendered into the entire screen. For more information, see <a href="https://developer.apple.com/library/content/documentation/GraphicsImaging/Conceptual/OpenGL-MacProgGuide/opengl_intro/opengl_intro.html">OpenGL Programming Guide for Mac</a>.</p>
     * 
     * <p>To exit full-screen mode, call {@link #CGLClearDrawable ClearDrawable}.</p>
     * 
     * <p>Deprecated in OS X v10.7. Use {@link #CGLSetFullScreenOnDisplay SetFullScreenOnDisplay} instead.</p>
     *
     * @param ctx a rendering context
     */
    @NativeType("CGLError")
    public static int CGLSetFullScreen(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.SetFullScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLSetFullScreenOnDisplay ] ---

    /**
     * Attaches a rendering context to a full-screen drawable object." +
     * 
     * <p>This function obtains a drawable object that covers an entire screen and attaches it to the rendering context. A full-screen rendering context may
     * allow the underlying renderer to provide better performance compared to a context associated with a window that partially covers the screen.</p>
     * 
     * <p>Prior to calling this function, your application should ensure that the context is capable of rendering to this display by querying the appropriate
     * renderer properties. For more information, see {@link #CGLQueryRendererInfo QueryRendererInfo}. Note that some renderers, including the software renderer, do not support
     * full-screen mode.</p>
     * 
     * <p>You must capture the screen prior to entering full-screen mode and release it after exiting. After calling this function, subsequent OpenGL drawing is
     * rendered into the entire screen. For more information, see OpenGL Programming Guide for Mac.</p>
     * 
     * <p>To exit full-screen mode, call {@link #CGLClearDrawable ClearDrawable}.</p>
     * 
     * <p>In OS X v10.6 or later, this function is not deprecated, but is usually not necessary. If your application creates a window that completely covers the
     * screen, the system implicitly creates a full-screen instance, for the same potential performance benefit.</p>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param ctx          a rendering context
     * @param display_mask a bit field that contains the OpenGL display mask for the screen you wish the context to cover
     */
    @NativeType("CGLError")
    public static int CGLSetFullScreenOnDisplay(@NativeType("CGLContextObj") long ctx, @NativeType("GLuint") int display_mask) {
        long __functionAddress = Functions.SetFullScreenOnDisplay;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, display_mask, __functionAddress);
    }

    // --- [ CGLSetPBuffer ] ---

    /**
     * Attaches a pixel buffer object to a rendering context.
     * 
     * <p>The first time you call this function for a specific pixel buffer object, the system creates the necessary buffers. The buffers are created to support
     * the attributes dictated by the pixel format object used to create the rendering context and by the parameters used to create the pixel buffer object.
     * The storage requirements for pixel buffer objects, which can be quite large, are very similar to the requirements for windows or views with OpenGL
     * contexts attached. All drawable objects compete for the same scarce resources. This function can fail is there is not enough contiguous VRAM for each
     * buffer. It's best to code defensively with a scheme that reduces resource consumption without causing the application to resort to failure. Unless, of
     * course, failure is the only viable alternative.</p>
     * 
     * <p>The ability to attach a pixel buffer to a context is supported only on renderers that export GL_APPLE_pixel_buffer in the GL_EXTENSIONS string. Before
     * calling this function, you should programmatically determine if it’s possible to attach a pixel buffer to a context by querying GL_EXTENSIONS in the
     * context and looking for GL_APPLE_pixel_buffer. If that extension is not present, the renderer won’t allow setting the pixel buffer.</p>
     * 
     * <p>In order of performance, these are the renderers you should consider using when setting up a rendering context to attach to a pixel buffer:</p>
     * 
     * <ul>
     * <li>A hardware renderer.</li>
     * <li>The generic render, but only with an offscreen pixel format and glTexSubImage.</li>
     * <li>The Apple software renderer, which supports pixel buffers in OS X v10.4.8 and later.</li>
     * </ul>
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param ctx     the rendering context to attach the pixel buffer to
     * @param pbuffer a pixel buffer object
     * @param face    the cube map face to draw if the pixel buffer texture target type is {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}; otherwise pass 0.
     * @param level   the mipmap level to draw. This must not exceed the maximum mipmap level set when the pixel buffer object was created. Pass 0 for a texture target
     *                that does not support mipmaps.
     * @param screen  a virtual screen value. The virtual screen determines the renderer OpenGL uses to draw to the pixel buffer object. For best performance, for a
     *                pixel buffer used as a texture source, you should supply the virtual screen value that results in using the same renderer used by the context
     *                that's the texturing target.
     */
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

    /** Unsafe version of: {@link #CGLGetPBuffer GetPBuffer} */
    public static int nCGLGetPBuffer(long ctx, long pbuffer, long face, long level, long screen) {
        long __functionAddress = Functions.GetPBuffer;
        if (CHECKS) {
            check(ctx);
        }
        return callPPPPPI(ctx, pbuffer, face, level, screen, __functionAddress);
    }

    /**
     * Retrieves a pixel buffer and its parameters for a specified rendering context.
     * 
     * <p>Deprecated in OS X v10.7.</p>
     *
     * @param ctx     a rendering context
     * @param pbuffer on return, points to the pixel buffer object attached to the rendering context
     * @param face    on return, points to the cube map face that is set if the pixel buffer texture target type is {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}; otherwise 0 for all other
     *                texture target types.
     * @param level   on return, points to the current mipmap level for drawing
     * @param screen  on return, points to the current virtual screen number, as set by the last valid call to {@link #CGLSetPBuffer SetPBuffer}
     */
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

    /**
     * Disassociates a rendering context from any drawable objects attached to it.
     *
     * @param ctx a rendering context
     */
    @NativeType("CGLError")
    public static int CGLClearDrawable(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.ClearDrawable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLFlushDrawable ] ---

    /**
     * Copies the back buffer of a double-buffered context to the front buffer.
     * 
     * <p>To create a double-buffered context, specify the {@link #kCGLPFADoubleBuffer PFADoubleBuffer} attribute when you create the pixel format object for the rendering
     * context. If the backing store attribute is set to false, the buffers can be exchanged rather than copied. This is often the case in full-screen mode. If
     * the receiver is not a double-buffered context, this call does nothing.</p>
     * 
     * <p>If you set the swap interval attribute ({@link #kCGLCPSwapInterval CPSwapInterval}) appropriately, the copy takes place during the vertical retrace of the display,
     * rather than immediately after CGLFlushDrawable is called. An implicit {@link GL11C#glFlush Flush} operation is performed by CGLFlushDrawable
     * before it returns. For optimal performance, an application should not call glFlush immediately before calling CGLFlushDrawable. Subsequent OpenGL
     * commands can be issued immediately after calling CGLFlushDrawable, but are not executed until the buffer copy is completed.</p>
     *
     * @param ctx the context object
     */
    @NativeType("CGLError")
    public static int CGLFlushDrawable(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.FlushDrawable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLEnable ] ---

    /**
     * Enables an option for a rendering context.
     *
     * @param ctx   a rendering context
     * @param pname the option to enable. One of:<br><table><tr><td>{@link #kCGLCESwapRectangle CESwapRectangle}</td><td>{@link #kCGLCESwapLimit CESwapLimit}</td><td>{@link #kCGLCERasterization CERasterization}</td><td>{@link #kCGLCEStateValidation CEStateValidation}</td><td>{@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}</td></tr><tr><td>{@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}</td><td>{@link #kCGLCEMPEngine CEMPEngine}</td></tr></table>
     */
    @NativeType("CGLError")
    public static int CGLEnable(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname) {
        long __functionAddress = Functions.Enable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, pname, __functionAddress);
    }

    // --- [ CGLDisable ] ---

    /**
     * Disables an option for a rendering context.
     *
     * @param ctx   a rendering context
     * @param pname the option to disable. One of:<br><table><tr><td>{@link #kCGLCESwapRectangle CESwapRectangle}</td><td>{@link #kCGLCESwapLimit CESwapLimit}</td><td>{@link #kCGLCERasterization CERasterization}</td><td>{@link #kCGLCEStateValidation CEStateValidation}</td><td>{@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}</td></tr><tr><td>{@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}</td><td>{@link #kCGLCEMPEngine CEMPEngine}</td></tr></table>
     */
    @NativeType("CGLError")
    public static int CGLDisable(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname) {
        long __functionAddress = Functions.Disable;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, pname, __functionAddress);
    }

    // --- [ CGLIsEnabled ] ---

    /** Unsafe version of: {@link #CGLIsEnabled IsEnabled} */
    public static int nCGLIsEnabled(long ctx, int pname, long enable) {
        long __functionAddress = Functions.IsEnabled;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, pname, enable, __functionAddress);
    }

    /**
     * Reports whether an option is enabled for a rendering context.
     *
     * @param ctx    a rendering context
     * @param pname  the option to query. One of:<br><table><tr><td>{@link #kCGLCESwapRectangle CESwapRectangle}</td><td>{@link #kCGLCESwapLimit CESwapLimit}</td><td>{@link #kCGLCERasterization CERasterization}</td><td>{@link #kCGLCEStateValidation CEStateValidation}</td><td>{@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}</td></tr><tr><td>{@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}</td><td>{@link #kCGLCEMPEngine CEMPEngine}</td></tr></table>
     * @param enable on return, enable is set to true if the option is enabled
     */
    @NativeType("CGLError")
    public static int CGLIsEnabled(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname, @NativeType("GLint *") IntBuffer enable) {
        if (CHECKS) {
            check(enable, 1);
        }
        return nCGLIsEnabled(ctx, pname, memAddress(enable));
    }

    // --- [ CGLSetParameter ] ---

    /** Unsafe version of: {@link #CGLSetParameter SetParameter} */
    public static int nCGLSetParameter(long ctx, int pname, long params) {
        long __functionAddress = Functions.SetParameter;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /**
     * Sets the value of a rendering context parameter.
     *
     * @param ctx    a rendering context
     * @param pname  the parameter whose value you want to set. One of:<br><table><tr><td>{@link #kCGLCPSwapRectangle CPSwapRectangle}</td><td>{@link #kCGLCPSwapInterval CPSwapInterval}</td><td>{@link #kCGLCPDispatchTableSize CPDispatchTableSize}</td><td>{@link #kCGLCPClientStorage CPClientStorage}</td></tr><tr><td>{@link #kCGLCPSurfaceTexture CPSurfaceTexture}</td><td>{@link #kCGLCPSurfaceOrder CPSurfaceOrder}</td><td>{@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}</td><td>{@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}</td></tr><tr><td>{@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}</td><td>{@link #kCGLCPReclaimResources CPReclaimResources}</td><td>{@link #kCGLCPCurrentRendererID CPCurrentRendererID}</td><td>{@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}</td></tr><tr><td>{@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}</td><td>{@link #kCGLCPHasDrawable CPHasDrawable}</td><td>{@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}</td></tr></table>
     * @param params a pointer to the value to set the parameter to
     */
    @NativeType("CGLError")
    public static int CGLSetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLSetParameter(ctx, pname, memAddress(params));
    }

    /**
     * Sets the value of a rendering context parameter.
     *
     * @param ctx   a rendering context
     * @param pname the parameter whose value you want to set. One of:<br><table><tr><td>{@link #kCGLCPSwapRectangle CPSwapRectangle}</td><td>{@link #kCGLCPSwapInterval CPSwapInterval}</td><td>{@link #kCGLCPDispatchTableSize CPDispatchTableSize}</td><td>{@link #kCGLCPClientStorage CPClientStorage}</td></tr><tr><td>{@link #kCGLCPSurfaceTexture CPSurfaceTexture}</td><td>{@link #kCGLCPSurfaceOrder CPSurfaceOrder}</td><td>{@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}</td><td>{@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}</td></tr><tr><td>{@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}</td><td>{@link #kCGLCPReclaimResources CPReclaimResources}</td><td>{@link #kCGLCPCurrentRendererID CPCurrentRendererID}</td><td>{@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}</td></tr><tr><td>{@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}</td><td>{@link #kCGLCPHasDrawable CPHasDrawable}</td><td>{@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}</td></tr></table>
     */
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

    /** Unsafe version of: {@link #CGLGetParameter GetParameter} */
    public static int nCGLGetParameter(long ctx, int pname, long params) {
        long __functionAddress = Functions.GetParameter;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /**
     * Retrieves the value of a rendering context parameter.
     *
     * @param ctx    a rendering context
     * @param pname  the parameter whose value you want to retrieve. One of:<br><table><tr><td>{@link #kCGLCPSwapRectangle CPSwapRectangle}</td><td>{@link #kCGLCPSwapInterval CPSwapInterval}</td><td>{@link #kCGLCPDispatchTableSize CPDispatchTableSize}</td><td>{@link #kCGLCPClientStorage CPClientStorage}</td></tr><tr><td>{@link #kCGLCPSurfaceTexture CPSurfaceTexture}</td><td>{@link #kCGLCPSurfaceOrder CPSurfaceOrder}</td><td>{@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}</td><td>{@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}</td></tr><tr><td>{@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}</td><td>{@link #kCGLCPReclaimResources CPReclaimResources}</td><td>{@link #kCGLCPCurrentRendererID CPCurrentRendererID}</td><td>{@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}</td></tr><tr><td>{@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}</td><td>{@link #kCGLCPHasDrawable CPHasDrawable}</td><td>{@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}</td></tr></table>
     * @param params on return, points to the value of the parameter
     */
    @NativeType("CGLError")
    public static int CGLGetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLGetParameter(ctx, pname, memAddress(params));
    }

    // --- [ CGLSetVirtualScreen ] ---

    /**
     * Forces subsequent OpenGL commands to the specified virtual screen.
     * 
     * <p>Setting the virtual screen forces the renderer associated with the virtual screen to process OpenGL commands issued to the specified context. Changing
     * the virtual screen changes the current renderer. You should use this function only when it is necessary to override the default behavior. The current
     * virtual screen is normally set automatically. Because the current virtual screen determines which OpenGL renderer is processing commands, the return
     * values of all glGetXXX functions can be affected by the current virtual screen.</p>
     *
     * @param ctx    a rendering context
     * @param screen a virtual screen number, which must be a value between 0 and the number of virtual screens minus one. The number of virtual screens available in a
     *               context can be obtained by calling the function {@link #CGLDescribePixelFormat DescribePixelFormat}, passing in the pixel format object used to create the rendering
     *               context, 0 for the virtual screen number ({@code pix_num} parameter), and the attribute constant {@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}.
     */
    @NativeType("CGLError")
    public static int CGLSetVirtualScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLint") int screen) {
        long __functionAddress = Functions.SetVirtualScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, screen, __functionAddress);
    }

    // --- [ CGLGetVirtualScreen ] ---

    /** Unsafe version of: {@link #CGLGetVirtualScreen GetVirtualScreen} */
    public static int nCGLGetVirtualScreen(long ctx, long screen) {
        long __functionAddress = Functions.GetVirtualScreen;
        if (CHECKS) {
            check(ctx);
        }
        return callPPI(ctx, screen, __functionAddress);
    }

    /**
     * Gets the current virtual screen number associated with a rendering context.
     * 
     * <p>The current virtual screen can change when a drawable object is moved or resized across graphics device boundaries. A change in the current virtual
     * screen can affect the return values of some OpenGL functions and in most cases also means that the renderer has changed.</p>
     *
     * @param ctx    a rendering context
     * @param screen on return, points to the virtual screen associated with the context. The value is always 0 on a single-display system and –1 if the function fails
     *               for any reason.
     */
    @NativeType("CGLError")
    public static int CGLGetVirtualScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLint *") IntBuffer screen) {
        if (CHECKS) {
            check(screen, 1);
        }
        return nCGLGetVirtualScreen(ctx, memAddress(screen));
    }

    // --- [ CGLUpdateContext ] ---

    /**
     * Synchronizes new renderer state to that of the application context
     *
     * @param ctx a rendering context
     */
    @NativeType("CGLError")
    public static int CGLUpdateContext(@NativeType("CGLContextObj") long ctx) {
        long __functionAddress = Functions.UpdateContext;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ CGLSetGlobalOption ] ---

    /** Unsafe version of: {@link #CGLSetGlobalOption SetGlobalOption} */
    public static int nCGLSetGlobalOption(int pname, long params) {
        long __functionAddress = Functions.SetGlobalOption;
        return callPI(pname, params, __functionAddress);
    }

    /**
     * Sets the value of a global option.
     *
     * @param pname  the name of the option whose value you want to set. One of:<br><table><tr><td>{@link #kCGLGOFormatCacheSize GOFormatCacheSize}</td><td>{@link #kCGLGOClearFormatCache GOClearFormatCache}</td><td>{@link #kCGLGORetainRenderers GORetainRenderers}</td><td>{@link #kCGLGOResetLibrary GOResetLibrary}</td><td>{@link #kCGLGOUseErrorHandler GOUseErrorHandler}</td></tr><tr><td>{@link #kCGLGOUseBuildCache GOUseBuildCache}</td></tr></table>
     * @param params the value to set the option to
     */
    @NativeType("CGLError")
    public static int CGLSetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLSetGlobalOption(pname, memAddress(params));
    }

    /**
     * Sets the value of a global option.
     *
     * @param pname the name of the option whose value you want to set. One of:<br><table><tr><td>{@link #kCGLGOFormatCacheSize GOFormatCacheSize}</td><td>{@link #kCGLGOClearFormatCache GOClearFormatCache}</td><td>{@link #kCGLGORetainRenderers GORetainRenderers}</td><td>{@link #kCGLGOResetLibrary GOResetLibrary}</td><td>{@link #kCGLGOUseErrorHandler GOUseErrorHandler}</td></tr><tr><td>{@link #kCGLGOUseBuildCache GOUseBuildCache}</td></tr></table>
     */
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

    /** Unsafe version of: {@link #CGLGetGlobalOption GetGlobalOption} */
    public static int nCGLGetGlobalOption(int pname, long params) {
        long __functionAddress = Functions.GetGlobalOption;
        return callPI(pname, params, __functionAddress);
    }

    /**
     * Retrieves the value of a global option.
     *
     * @param pname  the name of the option whose value you want to get. One of:<br><table><tr><td>{@link #kCGLGOFormatCacheSize GOFormatCacheSize}</td><td>{@link #kCGLGOClearFormatCache GOClearFormatCache}</td><td>{@link #kCGLGORetainRenderers GORetainRenderers}</td><td>{@link #kCGLGOResetLibrary GOResetLibrary}</td><td>{@link #kCGLGOUseErrorHandler GOUseErrorHandler}</td></tr><tr><td>{@link #kCGLGOUseBuildCache GOUseBuildCache}</td></tr></table>
     * @param params on return, a pointer to the value of the option
     */
    @NativeType("CGLError")
    public static int CGLGetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        return nCGLGetGlobalOption(pname, memAddress(params));
    }

    // --- [ CGLLockContext ] ---

    /**
     * Locks a CGL rendering context.
     * 
     * <p>The function CGLLockContext blocks the thread it is on until all other threads have unlocked the same context using the function
     * {@link #CGLUnlockContext UnlockContext}. You can use CGLLockContext recursively. Context-specific CGL calls by themselves do not require locking, but you can
     * guarantee serial processing for a group of calls by surrounding them with CGLLockContext and CGLUnlockContext. Keep in mind that calls from the OpenGL
     * API (the API provided by the Architecture Review Board) require locking.</p>
     * 
     * <p>Applications that use NSOpenGL classes with multithreading can lock contexts using the functions CGLLockContext and CGLUnlockContext. To perform
     * rendering in a thread other than the main one, you can lock the context that you want to access and safely execute OpenGL commands. The locking calls
     * must be placed around all OpenGL calls in all threads.</p>
     *
     * @param context a rendering context
     */
    @NativeType("CGLError")
    public static int CGLLockContext(@NativeType("CGLContextObj") long context) {
        long __functionAddress = Functions.LockContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ CGLUnlockContext ] ---

    /**
     * Unlocks a CGL rendering context.
     *
     * @param context the CGL context to unlock
     */
    @NativeType("CGLError")
    public static int CGLUnlockContext(@NativeType("CGLContextObj") long context) {
        long __functionAddress = Functions.UnlockContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ CGLGetVersion ] ---

    /** Unsafe version of: {@link #CGLGetVersion GetVersion} */
    public static void nCGLGetVersion(long majorvers, long minorvers) {
        long __functionAddress = Functions.GetVersion;
        callPPV(majorvers, minorvers, __functionAddress);
    }

    /**
     * Gets the major and minor version numbers of the CGL library.
     *
     * @param majorvers on return, points to the major version number of the CGL library
     * @param minorvers on return, points to the minor version number of the CGL library
     */
    public static void CGLGetVersion(@NativeType("GLint *") IntBuffer majorvers, @NativeType("GLint *") IntBuffer minorvers) {
        if (CHECKS) {
            check(majorvers, 1);
            check(minorvers, 1);
        }
        nCGLGetVersion(memAddress(majorvers), memAddress(minorvers));
    }

    // --- [ CGLErrorString ] ---

    /** Unsafe version of: {@link #CGLErrorString ErrorString} */
    public static long nCGLErrorString(int error) {
        long __functionAddress = Functions.ErrorString;
        return callP(error, __functionAddress);
    }

    /**
     * Returns a string that describes the specified result code.
     *
     * @param error the CGL result code constant returned from a CGL function. One of:<br><table><tr><td>{@link #kCGLNoError NoError}</td><td>{@link #kCGLBadAttribute BadAttribute}</td><td>{@link #kCGLBadProperty BadProperty}</td><td>{@link #kCGLBadPixelFormat BadPixelFormat}</td><td>{@link #kCGLBadRendererInfo BadRendererInfo}</td><td>{@link #kCGLBadContext BadContext}</td><td>{@link #kCGLBadDrawable BadDrawable}</td></tr><tr><td>{@link #kCGLBadDisplay BadDisplay}</td><td>{@link #kCGLBadState BadState}</td><td>{@link #kCGLBadValue BadValue}</td><td>{@link #kCGLBadMatch BadMatch}</td><td>{@link #kCGLBadEnumeration BadEnumeration}</td><td>{@link #kCGLBadOffScreen BadOffScreen}</td><td>{@link #kCGLBadFullScreen BadFullScreen}</td></tr><tr><td>{@link #kCGLBadWindow BadWindow}</td><td>{@link #kCGLBadAddress BadAddress}</td><td>{@link #kCGLBadCodeModule BadCodeModule}</td><td>{@link #kCGLBadAlloc BadAlloc}</td><td>{@link #kCGLBadConnection BadConnection}</td></tr></table>
     */
    @Nullable
    @NativeType("char const *")
    public static String CGLErrorString(@NativeType("CGLError") int error) {
        long __result = nCGLErrorString(error);
        return memASCIISafe(__result);
    }

    /** Array version of: {@link #CGLChoosePixelFormat ChoosePixelFormat} */
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

    /** Array version of: {@link #CGLDescribePixelFormat DescribePixelFormat} */
    @NativeType("CGLError")
    public static int CGLDescribePixelFormat(@NativeType("CGLPixelFormatObj") long pix, @NativeType("GLint") int pix_num, @NativeType("CGLPixelFormatAttribute") int attrib, @NativeType("GLint *") int[] value) {
        long __functionAddress = Functions.DescribePixelFormat;
        if (CHECKS) {
            check(pix);
            check(value, 1);
        }
        return callPPI(pix, pix_num, attrib, value, __functionAddress);
    }

    /** Array version of: {@link #CGLQueryRendererInfo QueryRendererInfo} */
    @NativeType("CGLError")
    public static int CGLQueryRendererInfo(@NativeType("GLuint") int display_mask, @NativeType("CGLRendererInfoObj *") PointerBuffer rend, @NativeType("GLint *") int[] nrend) {
        long __functionAddress = Functions.QueryRendererInfo;
        if (CHECKS) {
            check(rend, 1);
            check(nrend, 1);
        }
        return callPPI(display_mask, memAddress(rend), nrend, __functionAddress);
    }

    /** Array version of: {@link #CGLDescribeRenderer DescribeRenderer} */
    @NativeType("CGLError")
    public static int CGLDescribeRenderer(@NativeType("CGLRendererInfoObj") long rend, @NativeType("GLint") int rend_num, @NativeType("CGLRendererProperty") int prop, @NativeType("GLint *") int[] value) {
        long __functionAddress = Functions.DescribeRenderer;
        if (CHECKS) {
            check(rend);
            check(value, 1);
        }
        return callPPI(rend, rend_num, prop, value, __functionAddress);
    }

    /** Array version of: {@link #CGLDescribePBuffer DescribePBuffer} */
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

    /** Array version of: {@link #CGLGetOffScreen GetOffScreen} */
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

    /** Array version of: {@link #CGLGetPBuffer GetPBuffer} */
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

    /** Array version of: {@link #CGLIsEnabled IsEnabled} */
    @NativeType("CGLError")
    public static int CGLIsEnabled(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextEnable") int pname, @NativeType("GLint *") int[] enable) {
        long __functionAddress = Functions.IsEnabled;
        if (CHECKS) {
            check(ctx);
            check(enable, 1);
        }
        return callPPI(ctx, pname, enable, __functionAddress);
    }

    /** Array version of: {@link #CGLSetParameter SetParameter} */
    @NativeType("CGLError")
    public static int CGLSetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = Functions.SetParameter;
        if (CHECKS) {
            check(ctx);
            check(params, 1);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /** Array version of: {@link #CGLGetParameter GetParameter} */
    @NativeType("CGLError")
    public static int CGLGetParameter(@NativeType("CGLContextObj") long ctx, @NativeType("CGLContextParameter") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = Functions.GetParameter;
        if (CHECKS) {
            check(ctx);
            check(params, 1);
        }
        return callPPI(ctx, pname, params, __functionAddress);
    }

    /** Array version of: {@link #CGLGetVirtualScreen GetVirtualScreen} */
    @NativeType("CGLError")
    public static int CGLGetVirtualScreen(@NativeType("CGLContextObj") long ctx, @NativeType("GLint *") int[] screen) {
        long __functionAddress = Functions.GetVirtualScreen;
        if (CHECKS) {
            check(ctx);
            check(screen, 1);
        }
        return callPPI(ctx, screen, __functionAddress);
    }

    /** Array version of: {@link #CGLSetGlobalOption SetGlobalOption} */
    @NativeType("CGLError")
    public static int CGLSetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = Functions.SetGlobalOption;
        if (CHECKS) {
            check(params, 1);
        }
        return callPI(pname, params, __functionAddress);
    }

    /** Array version of: {@link #CGLGetGlobalOption GetGlobalOption} */
    @NativeType("CGLError")
    public static int CGLGetGlobalOption(@NativeType("CGLGlobalOption") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = Functions.GetGlobalOption;
        if (CHECKS) {
            check(params, 1);
        }
        return callPI(pname, params, __functionAddress);
    }

    /** Array version of: {@link #CGLGetVersion GetVersion} */
    public static void CGLGetVersion(@NativeType("GLint *") int[] majorvers, @NativeType("GLint *") int[] minorvers) {
        long __functionAddress = Functions.GetVersion;
        if (CHECKS) {
            check(majorvers, 1);
            check(minorvers, 1);
        }
        callPPV(majorvers, minorvers, __functionAddress);
    }

}