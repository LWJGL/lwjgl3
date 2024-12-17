/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_pbuffer = "GLXSGIXPbuffer".nativeClassGLX("GLX_SGIX_pbuffer", SGIX) {
    IntConstant(
        "MAX_PBUFFER_WIDTH_SGIX"..0x8016,
        "MAX_PBUFFER_HEIGHT_SGIX"..0x8017,
        "MAX_PBUFFER_PIXELS_SGIX"..0x8018,
        "OPTIMAL_PBUFFER_WIDTH_SGIX"..0x8019,
        "OPTIMAL_PBUFFER_HEIGHT_SGIX"..0x801A
    )

    IntConstant(
        "PBUFFER_BIT_SGIX"..0x00000004
    )

    IntConstant(
        "PRESERVED_CONTENTS_SGIX"..0x801B,
        "LARGEST_PBUFFER_SGIX"..0x801C
    )

    IntConstant(
        "WIDTH_SGIX"..0x801D,
        "HEIGHT_SGIX"..0x801E,
        "EVENT_MASK_SGIX"..0x801F
    )

    IntConstant(
        "BUFFER_CLOBBER_MASK_SGIX"..0x08000000
    )

    IntConstant(
        "DAMAGED_SGIX"..0x8020,
        "SAVED_SGIX"..0x8021
    )

    IntConstant(
        "WINDOW_SGIX"..0x8022,
        "PBUFFER_SGIX"..0x8023
    )

    IntConstant(
        "FRONT_LEFT_BUFFER_BIT_SGIX"..0x00000001,
        "FRONT_RIGHT_BUFFER_BIT_SGIX"..0x00000002,
        "BACK_LEFT_BUFFER_BIT_SGIX"..0x00000004,
        "BACK_RIGHT_BUFFER_BIT_SGIX"..0x00000008,
        "AUX_BUFFERS_BIT_SGIX"..0x00000010,
        "DEPTH_BUFFER_BIT_SGIX"..0x00000020,
        "STENCIL_BUFFER_BIT_SGIX"..0x00000040,
        "ACCUM_BUFFER_BIT_SGIX"..0x00000080,
        "SAMPLE_BUFFERS_BIT_SGIX"..0x00000100
    )

    GLXPbuffer(
        "CreateGLXPbufferSGIX",

        DISPLAY,
        GLXFBConfig("config"),
        unsigned_int("width"),
        unsigned_int("height"),
        nullable..NullTerminated..int.p("attrib_list")
    )

    void(
        "DestroyGLXPbufferSGIX",

        DISPLAY,
        GLXPbuffer("pbuf")
    )

    void(
        "QueryGLXPbufferSGIX",

        DISPLAY,
        GLXPbuffer("pbuf"),
        int("attribute"),
        Check(1)..unsigned_int.p("value")
    )

    void(
        "SelectEventSGIX",

        DISPLAY,
        GLXDrawable("drawable"),
        unsigned_long("mask")
    )

    void(
        "GetSelectedEventSGIX",

        DISPLAY,
        GLXDrawable("drawable"),
        Check(1)..unsigned_long.p("mask")
    )

}