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

    documentation = "Native bindings to GLX 1.3."

    IntConstant(
        "Added in GLX 1.3.",

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
        "Returns the list of all GLXFBConfigs that are available on the specified screen.",

        DISPLAY,
        int.IN("screen", "the screen number"),
        AutoSizeResult..int.p.OUT("nelements", "returns the number of GLXFBConfigs in the returned list")
    )

    GLXFBConfig.p(
        "ChooseFBConfig",
        "Returns a list of GLXFBConfigs that match a list of attributes.",

        DISPLAY,
        int.IN("screen", "the screen number"),
        nullable..NullTerminated..int.const.p.IN("attrib_list", "a list of attributes terminated with {@code None}"),
        AutoSizeResult..int.p.OUT("nelements", "returns the number of GLXFBConfigs matched")
    )

    int(
        "GetFBConfigAttrib",
        "Queries the value of a GLX attribute for a GLXFBConfig.",

        DISPLAY,
        GLXFBConfig.IN("config", "the GLXFBConfig being queried"),
        int.IN("attribute", "the attribute to query"),
        Check(1)..int.p.OUT("value", "the attribute value")
    )

    XVisualInfo.p(
        "GetVisualFromFBConfig",
        "Retrieves the associated visual of a GLXFBConfig.",

        DISPLAY,
        GLXFBConfig.IN("config", "the GLXFBConfig")
    )

    GLXWindow(
        "CreateWindow",
        "Create an onscreen rendering area from an X Window and a desired GLXFBConfig.",

        DISPLAY,
        GLXFBConfig.IN("config", "the GLXFBConfig"),
        Window.IN("win", "the X Window"),
        nullable..NullTerminated..int.const.p.IN("attrib_list", "a list of attributes terminated with {@code None}")
    )

    GLXPixmap(
        "CreatePixmap",
        "Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.",

        DISPLAY,
        GLXFBConfig.IN("config", "the GLXFBConfig"),
        Pixmap.IN("pixmap", "the X Pixmap"),
        nullable..NullTerminated..int.const.p.IN("attrib_list", "a list of attributes terminated with {@code None}")
    )

    void(
        "DestroyPixmap",
        "Destroys a GLXPixmap.",

        DISPLAY,
        GLXPixmap.IN("pixmap", "the GLXPixmap to destroy")
    )

    GLXPbuffer(
        "CreatePbuffer",
        "Creates a GLXPbuffer from a GLXFBConfig.",

        DISPLAY,
        GLXFBConfig.IN("config", "the GLXFBConfig"),
        nullable..NullTerminated..int.const.p.IN("attrib_list", "a list of attributes terminated with {@code None}")
    )

    void(
        "DestroyPbuffer",
        "Destroys a GLXPbuffer.",

        DISPLAY,
        GLXPbuffer.IN("pbuf", "the GLXPbuffer to destroy")
    )

    void(
        "QueryDrawable",
        "Queries an attribute associated with a GLXDrawable.",

        DISPLAY,
        GLXDrawable.IN("draw", "the GLXDrawable being queried"),
        int.IN("attribute", "the attribute to query"),
        ReturnParam..Check(1)..unsigned_int.p.OUT("value", "returns the attribute value")
    )

    GLXContext(
        "CreateNewContext",
        "Creates an OpenGL rendering context.",

        DISPLAY,
        GLXFBConfig.IN("config", "the GLXFBConfig"),
        int.IN("render_type", "the render type"),
        nullable..GLXContext.IN("share_list", "a GLXContext to share objects with"),
        Bool.IN("direct", "whether direct rendering is requested")
    )
    Bool(
        "MakeContextCurrent",
        "Makes a GLXContext current in the current thread.",

        DISPLAY,
        nullable..GLXDrawable.IN("draw", "the draw GLXDrawable"),
        nullable..GLXDrawable.IN("read", "the read GLXDrawable"),
        nullable..GLXContext.IN("ctx", "the GLXContext")
    )

    GLXDrawable(
        "GetCurrentReadDrawable",
        "Returns the current GLXDrawable used for reading in the current thread."
    )

    int(
        "QueryContext",
        "Queries the value of a GLXContext attribute.",

        DISPLAY,
        GLXContext.IN("ctx", "the GLXContext being queried"),
        int.IN("attribute", "the attribute to query"),
        Check(1)..int.p.OUT("value", "returns the attribute value")
    )

    void(
        "SelectEvent",
        "Selects which GLX events should be received on a GLXDrawable.",

        DISPLAY,
        GLXDrawable.IN("draw", "the GLXDrawable"),
        unsigned_long.IN("event_mask", "the selection mask")
    )

    void(
        "GetSelectedEvent",
        "Returns which GLX events are selected for a GLXDrawable.",

        DISPLAY,
        GLXDrawable.IN("draw", "the GLXDrawable"),
        Check(1)..unsigned_long.p.IN("event_mask", "returns the selection mask")
    )
}