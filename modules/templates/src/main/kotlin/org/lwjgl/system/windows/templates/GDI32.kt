/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val gdi32 = "GDI32".nativeClass(WINDOWS_PACKAGE, binding = simpleBinding("gdi32", callingConvention = CallingConvention.STDCALL)) {
    nativeDirective("#define APIENTRY __stdcall")

    documentation = "Native bindings to wingdi.h and gdi32.dll."

    IntConstant(
        "Display device state flags.",

        "DISPLAY_DEVICE_ATTACHED_TO_DESKTOP"..0x00000001,
        "DISPLAY_DEVICE_MULTI_DRIVER"..0x00000002,
        "DISPLAY_DEVICE_PRIMARY_DEVICE"..0x00000004,
        "DISPLAY_DEVICE_MIRRORING_DRIVER"..0x00000008,
        "DISPLAY_DEVICE_VGA_COMPATIBLE"..0x00000010,
        "DISPLAY_DEVICE_REMOVABLE"..0x00000020,
        "DISPLAY_DEVICE_MODESPRUNED"..0x08000000,
        "DISPLAY_DEVICE_REMOTE"..0x04000000,
        "DISPLAY_DEVICE_DISCONNECT"..0x02000000,
        "DISPLAY_DEVICE_TS_COMPATIBLE"..0x00200000,
        "DISPLAY_DEVICE_UNSAFE_MODES_ON"..0x00080000
    )

    IntConstant(
        "Child display device state flags.",

        "DISPLAY_DEVICE_ACTIVE"..0x00000001,
        "DISPLAY_DEVICE_ATTACHED"..0x00000002
    )

    IntConstant(
        "##DEVMODE specification version.",

        "DM_SPECVERSION"..0x0401
    )

    IntConstant(
        "##DEVMODE field selection bits.",

        "DM_ORIENTATION"..0x00000001,
        "DM_PAPERSIZE"..0x00000002,
        "DM_PAPERLENGTH"..0x00000004,
        "DM_PAPERWIDTH"..0x00000008,
        "DM_SCALE"..0x00000010,
        "DM_POSITION"..0x00000020,
        "DM_NUP"..0x00000040,
        "DM_DISPLAYORIENTATION"..0x00000080,
        "DM_COPIES"..0x00000100,
        "DM_DEFAULTSOURCE"..0x00000200,
        "DM_PRINTQUALITY"..0x00000400,
        "DM_COLOR"..0x00000800,
        "DM_DUPLEX"..0x00001000,
        "DM_YRESOLUTION"..0x00002000,
        "DM_TTOPTION"..0x00004000,
        "DM_COLLATE"..0x00008000,
        "DM_FORMNAME"..0x00010000,
        "DM_LOGPIXELS"..0x00020000,
        "DM_BITSPERPEL"..0x00040000,
        "DM_PELSWIDTH"..0x00080000,
        "DM_PELSHEIGHT"..0x00100000,
        "DM_DISPLAYFLAGS"..0x00200000,
        "DM_DISPLAYFREQUENCY"..0x00400000,
        "DM_ICMMETHOD"..0x00800000,
        "DM_ICMINTENT"..0x01000000,
        "DM_MEDIATYPE"..0x02000000,
        "DM_DITHERTYPE"..0x04000000,
        "DM_PANNINGWIDTH"..0x08000000,
        "DM_PANNINGHEIGHT"..0x10000000,
        "DM_DISPLAYFIXEDOUTPUT"..0x20000000
    )

    IntConstant(
        "##DEVMODE {@code dmDisplayOrientation} specifications.",

        "DMDO_DEFAULT".."0",
        "DMDO_90".."1",
        "DMDO_180".."2",
        "DMDO_270".."3"

    )

    IntConstant(
        "##DEVMODE {@code dmDisplayFixedOutput} specifications.",

        "DMDFO_DEFAULT".."0",
        "DMDFO_STRETCH".."1",
        "DMDFO_CENTER".."2"
    )

    IntConstant(
        "##DEVMODE {@code dmDisplayFlags} flags.",

        "DM_INTERLACED"..0x00000002,
        "DMDISPLAYFLAGS_TEXTMODE"..0x00000004
    )

    IntConstant(
        "##PIXELFORMATDESCRIPTOR flags.",

        "PFD_DOUBLEBUFFER"..0x00000001,
        "PFD_STEREO"..0x00000002,
        "PFD_DRAW_TO_WINDOW"..0x00000004,
        "PFD_DRAW_TO_BITMAP"..0x00000008,
        "PFD_SUPPORT_GDI"..0x00000010,
        "PFD_SUPPORT_OPENGL"..0x00000020,
        "PFD_GENERIC_FORMAT"..0x00000040,
        "PFD_NEED_PALETTE"..0x00000080,
        "PFD_NEED_SYSTEM_PALETTE"..0x00000100,
        "PFD_SWAP_EXCHANGE"..0x00000200,
        "PFD_SWAP_COPY"..0x00000400,
        "PFD_SWAP_LAYER_BUFFERS"..0x00000800,
        "PFD_GENERIC_ACCELERATED"..0x00001000,
        "PFD_SUPPORT_DIRECTDRAW"..0x00002000,
        "PFD_DIRECT3D_ACCELERATED"..0x00004000,
        "PFD_SUPPORT_COMPOSITION"..0x00008000,

        /* PIXELFORMATDESCRIPTOR flags for use in ChoosePixelFormat only */
        "PFD_DEPTH_DONTCARE"..0x20000000,
        "PFD_DOUBLEBUFFER_DONTCARE"..0x40000000,
        "PFD_STEREO_DONTCARE"..0x80000000.i
    )

    ByteConstant(
        "##PIXELFORMATDESCRIPTOR pixel types.",

        "PFD_TYPE_RGBA".."0",
        "PFD_TYPE_COLORINDEX".."1"
    )

    ByteConstant(
        "##PIXELFORMATDESCRIPTOR layer types.",

        "PFD_MAIN_PLANE".."0",
        "PFD_OVERLAY_PLANE".."1",
        "PFD_UNDERLAY_PLANE".."(byte)-1"
    )

    SaveLastError..int(
        "ChoosePixelFormat",
        "Attempts to match an appropriate pixel format supported by a device context to a given pixel format specification.",

        HDC.IN("hdc", "the device context that the function examines to determine the best match for the pixel format descriptor pointed to by {@code pixelFormatDescriptor}"),
        const..PIXELFORMATDESCRIPTOR_p.IN("pixelFormatDescriptor", "a ##PIXELFORMATDESCRIPTOR structure that specifies the requested pixel format")
    )

    SaveLastError..int(
        "DescribePixelFormat",
        """
        Obtains information about the pixel format identified by pixelFormat of the device associated with dc. The function sets the members of the
        ##PIXELFORMATDESCRIPTOR structure pointed to by pixelFormatDescriptor with that pixel format data. The return value is the maximum pixel format
        index of the device context.
        """,

        HDC.IN("hdc", "the device context"),
        int.IN("pixelFormat", "index that specifies the pixel format. The pixel formats that a device context supports are identified by positive one-based integer indexes."),
        Expression("PIXELFORMATDESCRIPTOR.SIZEOF")..UINT.IN(
            "bytes",
            """
            the size, in bytes, of the structure pointed to by {@code pixelFormatDescriptor}. The {@code wglDescribePixelFormat} function stores no more than
            {@code bytes} bytes of data to that structure. Set this value to PIXELFORMATDESCRIPTOR#SIZEOF.
            """
        ),
        nullable..LPPIXELFORMATDESCRIPTOR.OUT(
            "pixelFormatDescriptor",
            """
            a ##PIXELFORMATDESCRIPTOR structure whose members the function sets with pixel format data. The function stores the number of bytes copied to
            the structure in the structure's {@code size} member. If, upon entry, {@code pixelFormatDescriptor} is #NULL, the function writes no data to the
            structure. This is useful when you only want to obtain the maximum pixel format index of a device context.
            """
        )
    )

    SaveLastError..int(
        "GetPixelFormat",
        "Obtains the index of the currently selected pixel format of the specified device context.",

        HDC.IN("hdc", "the device context of the currently selected pixel format index returned by the function")
    )

    SaveLastError..BOOL(
        "SetPixelFormat",
        "Sets the pixel format of the specified device context to the format specified by the pixelFormat index.",

        HDC.IN("hdc", "the device context whose pixel format the function attempts to set"),
        int.IN("pixelFormat", "index that identifies the pixel format to set. The various pixel formats supported by a device context are identified by one-based indexes."),
        nullable..const..PIXELFORMATDESCRIPTOR_p.IN(
            "pixelFormatDescriptor",
            """
            a ##PIXELFORMATDESCRIPTOR structure that contains the logical pixel format specification. The system's metafile component uses this structure
            to record the logical pixel format specification. The structure has no other effect upon the behavior of the SetPixelFormat function.
            """
        )
    )

    SaveLastError..BOOL(
        "SwapBuffers",
        "Exchanges the front and back buffers if the current pixel format for the window referenced by the specified device context includes a back buffer.",

        HDC.IN(
            "dc",
            """
            a device context. If the current pixel format for the window referenced by this device context includes a back buffer, the function exchanges the
            front and back buffers.
            """
        )
    )
}