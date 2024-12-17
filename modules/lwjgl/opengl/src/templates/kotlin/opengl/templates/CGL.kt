/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.macos.*

val CGL = "CGL".nativeClass(
    Module.OPENGL,
    prefix = "CGL",
    prefixConstant = "kCGL",
    prefixMethod = "CGL",
    binding = GLBinding.delegate("GL.getFunctionProvider()")
) {
    // -----------------------------------------------
    // CGLTypes.h

    IntConstant(
        "PFAAllRenderers".."1",
        "PFATripleBuffer".."3",
        "PFADoubleBuffer".."5",
        "PFAStereo".."6",
        "PFAColorSize".."8",
        "PFAAlphaSize".."11",
        "PFADepthSize".."12",
        "PFAStencilSize".."13",
        "PFAMinimumPolicy".."51",
        "PFAMaximumPolicy".."52",
        "PFASampleBuffers".."55",
        "PFASamples".."56",
        "PFAColorFloat".."58",
        "PFAMultisample".."59",
        "PFASupersample".."60",
        "PFASampleAlpha".."61",
        "PFARendererID".."70",
        "PFASingleRenderer".."71",
        "PFANoRecovery".."72",
        "PFAAccelerated".."73",
        "PFAClosestPolicy".."74",
        "PFABackingStore".."76",
        "PFABackingVolatile".."77",
        "PFADisplayMask".."84",
        "PFAAllowOfflineRenderers".."96",
        "PFAAcceleratedCompute".."97",
        "PFAOpenGLProfile".."99",
        "PFASupportsAutomaticGraphicsSwitching".."101",
        "PFAVirtualScreenCount".."128",
        "PFAAuxBuffers".."7",
        "PFAAccumSize".."14",
        "PFAOffScreen".."53",
        "PFAAuxDepthStencil".."57",
        "PFAWindow".."80",
        "PFACompliant".."83",
        "PFAPBuffer".."90",
        "PFARemotePBuffer".."91",
        "PFARobust".."75",
        "PFAMPSafe".."78",
        "PFAMultiScreen".."81",
        "PFAFullScreen".."54"
    )

    IntConstant(
        "RPOffScreen".."53",
        "RPRendererID".."70",
        "RPAccelerated".."73",
        "RPBackingStore".."76",
        "RPWindow".."80",
        "RPCompliant".."83",
        "RPDisplayMask".."84",
        "RPBufferModes".."100",
        "RPColorModes".."103",
        "RPAccumModes".."104",
        "RPDepthModes".."105",
        "RPStencilModes".."106",
        "RPMaxAuxBuffers".."107",
        "RPMaxSampleBuffers".."108",
        "RPMaxSamples".."109",
        "RPSampleModes".."110",
        "RPSampleAlpha".."111",
        "RPVideoMemory".."120",
        "RPTextureMemory".."121",
        "RPGPUVertProcCapable".."122",
        "RPGPUFragProcCapable".."123",
        "RPRendererCount".."128",
        "RPOnline".."129",
        "RPAcceleratedCompute".."130",
        "RPVideoMemoryMegabytes".."131",
        "RPTextureMemoryMegabytes".."132",
        "RPRobust".."75",
        "RPMPSafe".."78",
        "RPMultiScreen".."81",
        "RPFullScreen".."54"
    )

    IntConstant(
        "CESwapRectangle".."201",
        "CESwapLimit".."203",
        "CERasterization".."221",
        "CEStateValidation".."301",
        "CESurfaceBackingSize".."305",
        "CEDisplayListOptimization".."307",
        "CEMPEngine".."313"
    )

    IntConstant(
        "CPSwapRectangle".."200",
        "CPSwapInterval".."222",
        "CPDispatchTableSize".."224",
        "CPClientStorage".."226",
        "CPSurfaceTexture".."228",
        "CPSurfaceOrder".."235",
        "CPSurfaceOpacity".."236",
        "CPSurfaceBackingSize".."304",
        "CPSurfaceSurfaceVolatile".."306",
        "CPReclaimResources".."308",
        "CPCurrentRendererID".."309",
        "CPGPUVertexProcessing".."310",
        "CPGPUFragmentProcessing".."311",
        "CPHasDrawable".."314",
        "CPMPSwapsInFlight".."315"
    )

    IntConstant(
        "GOFormatCacheSize".."501",
        "GOClearFormatCache".."502",
        "GORetainRenderers".."503",
        "GOResetLibrary".."504",
        "GOUseErrorHandler".."505",
        "GOUseBuildCache".."506"
    )

    IntConstant(
        "OGLPVersion_Legacy"..0x1000,
        "OGLPVersion_3_2_Core"..0x3200
    )

    IntConstant(
        "NoError".."0",
        "BadAttribute".."10000",
        "BadProperty".."10001",
        "BadPixelFormat".."10002",
        "BadRendererInfo".."10003",
        "BadContext".."10004",
        "BadDrawable".."10005",
        "BadDisplay".."10006",
        "BadState".."10007",
        "BadValue".."10008",
        "BadMatch".."10009",
        "BadEnumeration".."10010",
        "BadOffScreen".."10011",
        "BadFullScreen".."10012",
        "BadWindow".."10013",
        "BadAddress".."10014",
        "BadCodeModule".."10015",
        "BadAlloc".."10016",
        "BadConnection".."10017"
    )

    IntConstant(
        "MonoscopicBit"..0x00000001,
        "StereoscopicBit"..0x00000002,
        "SingleBufferBit"..0x00000004,
        "DoubleBufferBit"..0x00000008,
        "TripleBufferBit"..0x00000010
    )

    IntConstant(
        "0Bit"..0x00000001,
        "1Bit"..0x00000002,
        "2Bit"..0x00000004,
        "3Bit"..0x00000008,
        "4Bit"..0x00000010,
        "5Bit"..0x00000020,
        "6Bit"..0x00000040,
        "8Bit"..0x00000080,
        "10Bit"..0x00000100,
        "12Bit"..0x00000200,
        "16Bit"..0x00000400,
        "24Bit"..0x00000800,
        "32Bit"..0x00001000,
        "48Bit"..0x00002000,
        "64Bit"..0x00004000,
        "96Bit"..0x00008000,
        "128Bit"..0x00010000
    )

    IntConstant(
        "RGB444Bit"..0x00000040,
        "ARGB4444Bit"..0x00000080,
        "RGB444A8Bit"..0x00000100,
        "RGB555Bit"..0x00000200,
        "ARGB1555Bit"..0x00000400,
        "RGB555A8Bit"..0x00000800,
        "RGB565Bit"..0x00001000,
        "RGB565A8Bit"..0x00002000,
        "RGB888Bit"..0x00004000,
        "ARGB8888Bit"..0x00008000,
        "RGB888A8Bit"..0x00010000,
        "RGB101010Bit"..0x00020000,
        "ARGB2101010Bit"..0x00040000,
        "RGB101010_A8Bit"..0x00080000,
        "RGB121212Bit"..0x00100000,
        "ARGB12121212Bit"..0x00200000,
        "RGB161616Bit"..0x00400000,
        "RGBA16161616Bit"..0x00800000,
        "RGBFloat64Bit"..0x01000000,
        "RGBAFloat64Bit"..0x02000000,
        "RGBFloat128Bit"..0x04000000,
        "RGBAFloat128Bit"..0x08000000,
        "RGBFloat256Bit"..0x10000000,
        "RGBAFloat256Bit"..0x20000000
    )

    IntConstant(
        "SupersampleBit"..0x00000001,
        "MultisampleBit"..0x00000002
    )

    // -----------------------------------------------
    // CGLCurrent.h

    CGLContextObj(
        "GetCurrentContext",
        void()
    )

    CGLError(
        "SetCurrentContext",

        nullable..CGLContextObj("context")
    )

    // -----------------------------------------------
    // CGLDevice.h

    CGLShareGroupObj(
        "GetShareGroup",

        CGLContextObj("ctx")
    )

    // -----------------------------------------------
    // OpenGL.h

    // Pixel format functions

    CGLError(
        "ChoosePixelFormat",

        NullTerminated..CGLPixelFormatAttribute.const.p("attribs"),
        Check(1)..CGLPixelFormatObj.p("pix"),
        Check(1)..GLint.p("npix")
    )

    CGLError(
        "DestroyPixelFormat",

        CGLPixelFormatObj("pix")
    )

    CGLError(
        "DescribePixelFormat",

        CGLPixelFormatObj("pix"),
        GLint("pix_num"),
        CGLPixelFormatAttribute("attrib"),
        Check(1)..GLint.p("value")
    )

    void(
        "ReleasePixelFormat",

        CGLPixelFormatObj("pix")
    )

    CGLPixelFormatObj(
        "RetainPixelFormat",

        CGLPixelFormatObj("pix")
    )

    GLuint(
        "GetPixelFormatRetainCount",

        CGLPixelFormatObj("pix")
    )

    // Renderer information functions

    CGLError(
        "QueryRendererInfo",

        GLuint("display_mask"),
        Check(1)..CGLRendererInfoObj.p("rend"),
        Check(1)..GLint.p("nrend")
    )

    CGLError(
        "DestroyRendererInfo",

        CGLRendererInfoObj("rend")
    )

    CGLError(
        "DescribeRenderer",

        CGLRendererInfoObj("rend"),
        GLint("rend_num"),
        CGLRendererProperty("prop"),
        Check(1)..GLint.p("value")
    )

    // Context functions

    CGLError(
        "CreateContext",

        CGLPixelFormatObj("pix"),
        nullable..CGLContextObj("share"),
        Check(1)..CGLContextObj.p("ctx")
    )

    CGLError(
        "DestroyContext",

        CGLContextObj("ctx")
    )

    CGLError(
        "CopyContext",

        CGLContextObj("src"),
        CGLContextObj("dst"),
        GLbitfield("mask")
    )

    CGLContextObj(
        "RetainContext",

        CGLContextObj("ctx")
    )

    void(
        "ReleaseContext",

        CGLContextObj("ctx")
    )

    GLuint(
        "GetContextRetainCount",

        CGLContextObj("ctx")
    )

    CGLPixelFormatObj(
        "GetPixelFormat",

        CGLContextObj("ctx")
    )

    // PBuffer functions

    CGLError(
        "CreatePBuffer",

        GLsizei("width"),
        GLsizei("height"),
        GLenum("target"),
        GLenum("internalFormat"),
        GLint("max_level"),
        Check(1)..CGLPBufferObj.p("pbuffer")
    )

    CGLError(
        "DestroyPBuffer",

        CGLPBufferObj("pbuffer")
    )

    CGLError(
        "DescribePBuffer",

        CGLPBufferObj("obj"),
        Check(1)..GLsizei.p("width"),
        Check(1)..GLsizei.p("height"),
        Check(1)..GLenum.p("target"),
        Check(1)..GLenum.p("internalFormat"),
        Check(1)..GLint.p("mipmap")
    )

    CGLError(
        "TexImagePBuffer",

        CGLContextObj("ctx"),
        CGLPBufferObj("pbuffer"),
        GLenum("source")
    )

    CGLPBufferObj(
        "RetainPBuffer",

        CGLPBufferObj("pbuffer")
    )

    void(
        "ReleasePBuffer",

        CGLPBufferObj("pbuffer")
    )

    GLuint(
        "GetPBufferRetainCount",

        CGLPBufferObj("pbuffer")
    )

    // Drawable Functions

    CGLError(
        "SetOffScreen",

        CGLContextObj("ctx"),
        GLsizei("width"),
        GLsizei("height"),
        GLint("rowbytes"),
        Check("rowbytes * height")..void.p("baseaddr")
    )

    CGLError(
        "GetOffScreen",

        CGLContextObj("ctx"),
        Check(1)..GLsizei.p("width"),
        Check(1)..GLsizei.p("height"),
        Check(1)..GLint.p("rowbytes"),
        Check(1)..opaque_p.p("baseaddr")
    )

    CGLError(
        "SetFullScreen",

        CGLContextObj("ctx")
    )

    CGLError(
        "SetFullScreenOnDisplay",

        CGLContextObj("ctx"),
        GLuint("display_mask")
    )

    CGLError(
        "SetPBuffer",

        CGLContextObj("ctx"),
        CGLPBufferObj("pbuffer"),
        GLenum("face"),
        GLint("level"),
        GLint("screen")
    )

    CGLError(
        "GetPBuffer",

        CGLContextObj("ctx"),
        Check(1)..CGLPBufferObj.p("pbuffer"),
        Check(1)..GLenum.p("face"),
        Check(1)..GLint.p("level"),
        Check(1)..GLint.p("screen")
    )

    CGLError(
        "ClearDrawable",

        CGLContextObj("ctx")
    )

    CGLError(
        "FlushDrawable",

        CGLContextObj("ctx")
    )

    // Per context enables and parameters

    CGLError(
        "Enable",

        CGLContextObj("ctx"),
        CGLContextEnable("pname")
    )

    CGLError(
        "Disable",

        CGLContextObj("ctx"),
        CGLContextEnable("pname")
    )

    CGLError(
        "IsEnabled",

        CGLContextObj("ctx"),
        CGLContextEnable("pname"),
        Check(1)..GLint.p("enable")
    )

    CGLError(
        "SetParameter",

        CGLContextObj("ctx"),
        CGLContextParameter("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    CGLError(
        "GetParameter",

        CGLContextObj("ctx"),
        CGLContextParameter("pname"),
        Check(1)..GLint.p("params")
    )

    // Virtual screen functions

    CGLError(
        "SetVirtualScreen",

        CGLContextObj("ctx"),
        GLint("screen")
    )

    CGLError(
        "GetVirtualScreen",

        CGLContextObj("ctx"),
        Check(1)..GLint.p("screen")
    )

    CGLError(
        "UpdateContext",

        CGLContextObj("ctx")
    )

    // Global library options

    CGLError(
        "SetGlobalOption",

        CGLGlobalOption("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    CGLError(
        "GetGlobalOption",

        CGLGlobalOption("pname"),
        Check(1)..GLint.p("params")
    )

    /*CGLError(
        "SetOption",

        CGLGlobalOption("pname"),
        GLint("param")
    )

    CGLError(
        "GetOption",

        CGLGlobalOption("pname"),
        GLint.p("param")
    )*/

    // Locking functions

    CGLError(
        "LockContext",

        CGLContextObj("context")
    )

    CGLError(
        "UnlockContext",

        CGLContextObj("context")
    )

    // Version numbers

    void(
        "GetVersion",

        Check(1)..GLint.p("majorvers"),
        Check(1)..GLint.p("minorvers")
    )

    // Convert an error code to a string

    charASCII.const.p(
        "ErrorString",

        CGLError("error")
    )
}