/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL = "WGL".nativeClass(Module.OPENGL, prefix = "WGL", binding = GLBinding.delegate("GL.getFunctionProvider()")) {
    nativeImport("WindowsLWJGL.h")
    javaImport("org.lwjgl.system.windows.*")

    IntConstant(
        "FONT_LINES".."0",
        "FONT_POLYGONS".."1"
    )

    IntConstant(
        "SWAP_MAIN_PLANE"..0x00000001,
        "SWAP_OVERLAY1"..0x00000002,
        "SWAP_OVERLAY2"..0x00000004,
        "SWAP_OVERLAY3"..0x00000008,
        "SWAP_OVERLAY4"..0x00000010,
        "SWAP_OVERLAY5"..0x00000020,
        "SWAP_OVERLAY6"..0x00000040,
        "SWAP_OVERLAY7"..0x00000080,
        "SWAP_OVERLAY8"..0x00000100,
        "SWAP_OVERLAY9"..0x00000200,
        "SWAP_OVERLAY10"..0x00000400,
        "SWAP_OVERLAY11"..0x00000800,
        "SWAP_OVERLAY12"..0x00001000,
        "SWAP_OVERLAY13"..0x00002000,
        "SWAP_OVERLAY14"..0x00004000,
        "SWAP_OVERLAY15"..0x00008000,
        "SWAP_UNDERLAY1"..0x00010000,
        "SWAP_UNDERLAY2"..0x00020000,
        "SWAP_UNDERLAY3"..0x00040000,
        "SWAP_UNDERLAY4"..0x00080000,
        "SWAP_UNDERLAY5"..0x00100000,
        "SWAP_UNDERLAY6"..0x00200000,
        "SWAP_UNDERLAY7"..0x00400000,
        "SWAP_UNDERLAY8"..0x00800000,
        "SWAP_UNDERLAY9"..0x01000000,
        "SWAP_UNDERLAY10"..0x02000000,
        "SWAP_UNDERLAY11"..0x04000000,
        "SWAP_UNDERLAY12"..0x08000000,
        "SWAP_UNDERLAY13"..0x10000000,
        "SWAP_UNDERLAY14"..0x20000000,
        "SWAP_UNDERLAY15"..0x40000000
    )

    HGLRC(
        "CreateContext",

        CaptureCallState.GetLastError.param,
        HDC("hdc")
    )

    HGLRC(
        "CreateLayerContext",

        CaptureCallState.GetLastError.param,
        HDC("hdc"),
        int("layerPlane")
    )

    BOOL(
        "CopyContext",

        CaptureCallState.GetLastError.param,
        HGLRC("src"),
        HGLRC("dst"),
        UINT("mask")
    )

    BOOL(
        "DeleteContext",

        CaptureCallState.GetLastError.param,
        HGLRC("context")
    )

    HGLRC(
        "GetCurrentContext",

        CaptureCallState.GetLastError.param
    )

    HDC(
        "GetCurrentDC",
        void()
    )

    PROC(
        "GetProcAddress",

        CaptureCallState.GetLastError.param,
        LPCSTR("proc")
    )

    BOOL(
        "MakeCurrent",

        CaptureCallState.GetLastError.param,
        nullable..HDC("hdc"),
        nullable..HGLRC("hglrc")
    )

    BOOL(
        "ShareLists",

        CaptureCallState.GetLastError.param,
        HGLRC("hglrc1"),
        HGLRC("hglrc2")
    )

    /*
    WINGDIAPI BOOL  WINAPI DescribeLayerPlane(HDC, int, int, UINT, LPLAYERPLANEDESCRIPTOR);
    WINGDIAPI int   WINAPI SetLayerPaletteEntries(HDC, int, int, int, CONST COLORREF *);
    WINGDIAPI int   WINAPI GetLayerPaletteEntries(HDC, int, int, int, COLORREF *);
    WINGDIAPI BOOL  WINAPI RealizeLayerPalette(HDC, int, BOOL);
    WINGDIAPI BOOL  WINAPI SwapLayerBuffers(HDC, UINT);

    // WinVer >= 0x0500
    WINGDIAPI DWORD WINAPI SwapMultipleBuffers(UINT, CONST WGLSWAP *);
    */

    /*
    SaveLastError..NativeName("wglUseFontBitmapsW")..BOOL(
        "UseFontBitmaps",

        HDC("hdc"),
        DWORD("first"),
        DWORD("count"),
        DWORD("listBase")
    )

    SaveLastError..NativeName("wglUseFontOutlinesW")..BOOL(
        "UseFontOutlines",

        HDC("hdc"),
        DWORD("first"),
        AutoSize("glyphMetrics")..DWORD("count"),
        DWORD("listBase"),
        FLOAT("deviation"),
        FLOAT("extrusion"),
        int("format"),
        nullable..LPGLYPHMETRICSFLOAT("glyphMetrics")
    )
    */
}