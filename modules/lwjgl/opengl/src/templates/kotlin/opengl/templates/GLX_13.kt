/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX13 = "GLX13".nativeClassGLX("GLX13") {
    extends = GLX12
    javaImport("org.lwjgl.system.linux.*")

    IntConstant(
        "WINDOW_BIT"..0x00000001,
        "PIXMAP_BIT"..0x00000002,
        "PBUFFER_BIT"..0x00000004,
        "RGBA_BIT"..0x00000001,
        "COLOR_INDEX_BIT"..0x00000002,
        "PBUFFER_CLOBBER_MASK"..0x08000000,
        "FRONT_LEFT_BUFFER_BIT"..0x00000001,
        "FRONT_RIGHT_BUFFER_BIT"..0x00000002,
        "BACK_LEFT_BUFFER_BIT"..0x00000004,
        "BACK_RIGHT_BUFFER_BIT"..0x00000008,
        "AUX_BUFFERS_BIT"..0x00000010,
        "DEPTH_BUFFER_BIT"..0x00000020,
        "STENCIL_BUFFER_BIT"..0x00000040,
        "ACCUM_BUFFER_BIT"..0x00000080,
        "CONFIG_CAVEAT"..0x20,
        "X_VISUAL_TYPE"..0x22,
        "TRANSPARENT_TYPE"..0x23,
        "TRANSPARENT_INDEX_VALUE"..0x24,
        "TRANSPARENT_RED_VALUE"..0x25,
        "TRANSPARENT_GREEN_VALUE"..0x26,
        "TRANSPARENT_BLUE_VALUE"..0x27,
        "TRANSPARENT_ALPHA_VALUE"..0x28,
        "DONT_CARE"..0xFFFFFFFF.i,
        "NONE"..0x8000,
        "SLOW_CONFIG"..0x8001,
        "TRUE_COLOR"..0x8002,
        "DIRECT_COLOR"..0x8003,
        "PSEUDO_COLOR"..0x8004,
        "STATIC_COLOR"..0x8005,
        "GRAY_SCALE"..0x8006,
        "STATIC_GRAY"..0x8007,
        "TRANSPARENT_RGB"..0x8008,
        "TRANSPARENT_INDEX"..0x8009,
        "VISUAL_ID"..0x800B,
        "SCREEN"..0x800C,
        "NON_CONFORMANT_CONFIG"..0x800D,
        "DRAWABLE_TYPE"..0x8010,
        "RENDER_TYPE"..0x8011,
        "X_RENDERABLE"..0x8012,
        "FBCONFIG_ID"..0x8013,
        "RGBA_TYPE"..0x8014,
        "COLOR_INDEX_TYPE"..0x8015,
        "MAX_PBUFFER_WIDTH"..0x8016,
        "MAX_PBUFFER_HEIGHT"..0x8017,
        "MAX_PBUFFER_PIXELS"..0x8018,
        "PRESERVED_CONTENTS"..0x801B,
        "LARGEST_PBUFFER"..0x801C,
        "WIDTH"..0x801D,
        "HEIGHT"..0x801E,
        "EVENT_MASK"..0x801F,
        "DAMAGED"..0x8020,
        "SAVED"..0x8021,
        "WINDOW"..0x8022,
        "PBUFFER"..0x8023,
        "PBUFFER_HEIGHT"..0x8040,
        "PBUFFER_WIDTH"..0x8041
    )

    GLXFBConfig.p(
        "GetFBConfigs",

        DISPLAY,
        int("screen"),
        AutoSizeResult..int.p("nelements")
    )

    GLXFBConfig.p(
        "ChooseFBConfig",

        DISPLAY,
        int("screen"),
        nullable..NullTerminated..int.const.p("attrib_list"),
        AutoSizeResult..int.p("nelements")
    )

    int(
        "GetFBConfigAttrib",

        DISPLAY,
        GLXFBConfig("config"),
        int("attribute"),
        Check(1)..int.p("value")
    )

    XVisualInfo.p(
        "GetVisualFromFBConfig",

        DISPLAY,
        GLXFBConfig("config")
    )

    GLXWindow(
        "CreateWindow",

        DISPLAY,
        GLXFBConfig("config"),
        Window("win"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )

    GLXPixmap(
        "CreatePixmap",

        DISPLAY,
        GLXFBConfig("config"),
        Pixmap("pixmap"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )

    void(
        "DestroyPixmap",

        DISPLAY,
        GLXPixmap("pixmap")
    )

    GLXPbuffer(
        "CreatePbuffer",

        DISPLAY,
        GLXFBConfig("config"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )

    void(
        "DestroyPbuffer",

        DISPLAY,
        GLXPbuffer("pbuf")
    )

    void(
        "QueryDrawable",

        DISPLAY,
        GLXDrawable("draw"),
        int("attribute"),
        ReturnParam..Check(1)..unsigned_int.p("value")
    )

    GLXContext(
        "CreateNewContext",

        DISPLAY,
        GLXFBConfig("config"),
        int("render_type"),
        nullable..GLXContext("share_list"),
        Bool("direct")
    )
    Bool(
        "MakeContextCurrent",

        DISPLAY,
        nullable..GLXDrawable("draw"),
        nullable..GLXDrawable("read"),
        nullable..GLXContext("ctx")
    )

    GLXDrawable(
        "GetCurrentReadDrawable",
        void()
    )

    int(
        "QueryContext",

        DISPLAY,
        GLXContext("ctx"),
        int("attribute"),
        Check(1)..int.p("value")
    )

    void(
        "SelectEvent",

        DISPLAY,
        GLXDrawable("draw"),
        unsigned_long("event_mask")
    )

    void(
        "GetSelectedEvent",

        DISPLAY,
        GLXDrawable("draw"),
        Check(1)..unsigned_long.p("event_mask")
    )
}