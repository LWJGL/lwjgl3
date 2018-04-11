/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_pbuffer = "GLXSGIXPbuffer".nativeClassGLX("GLX_SGIX_pbuffer", SGIX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines pixel buffers (GLXPbuffers, or pbuffer for short). GLXPbuffers are additional non-visible rendering buffers for an OpenGL
        renderer.
        """

    IntConstant(
        "Accepted by the {@code attribute} parameter of #GetFBConfigAttribSGIX().",

        "MAX_PBUFFER_WIDTH_SGIX"..0x8016,
        "MAX_PBUFFER_HEIGHT_SGIX"..0x8017,
        "MAX_PBUFFER_PIXELS_SGIX"..0x8018,
        "OPTIMAL_PBUFFER_WIDTH_SGIX"..0x8019,
        "OPTIMAL_PBUFFER_HEIGHT_SGIX"..0x801A
    )

    IntConstant(
        """
        Returned by #GetFBConfigAttribSGIX() (when {@code attribute} is set to #DRAWABLE_TYPE_SGIX) and
        accepted by the {@code attrib_list} parameter of #ChooseFBConfigSGIX() (following the
        #DRAWABLE_TYPE_SGIX token).
        """,

        "PBUFFER_BIT_SGIX"..0x00000004
    )

    IntConstant(
        "Accepted by the {@code attrib_list} parameter of #CreateGLXPbufferSGIX() and by the {@code attribute} parameter of #QueryGLXPbufferSGIX().",

        "PRESERVED_CONTENTS_SGIX"..0x801B,
        "LARGEST_PBUFFER_SGIX"..0x801C
    )

    IntConstant(
        "Accepted by the {@code attribute} parameter of #QueryGLXPbufferSGIX().",

        "WIDTH_SGIX"..0x801D,
        "HEIGHT_SGIX"..0x801E,
        "EVENT_MASK_SGIX"..0x801F
    )

    IntConstant(
        "Accepted by the {@code mask} parameter of #SelectEventSGIX() and returned in the {@code mask} parameter of #GetSelectedEventSGIX().",

        "BUFFER_CLOBBER_MASK_SGIX"..0x08000000
    )

    IntConstant(
        "Returned in the {@code event_type} field of a \"buffer clobber\" event.",

        "DAMAGED_SGIX"..0x8020,
        "SAVED_SGIX"..0x8021
    )

    IntConstant(
        "Returned in the {@code draw_type} field of a \"buffer clobber\" event.",

        "WINDOW_SGIX"..0x8022,
        "PBUFFER_SGIX"..0x8023
    )

    IntConstant(
        "Returned in the {@code mask} field of a \"buffer clobber\" event.",

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
        "Creates a single GLXPbuffer and returns its XID.",

        DISPLAY,
        GLXFBConfig.IN("config", "the {@code GLXFBConfig}"),
        unsigned_int.IN("width", "the pbuffer width"),
        unsigned_int.IN("height", "the pbuffer height"),
        nullable..NullTerminated..int.p.IN("attrib_list", "an optional null-terminated list of attributes")
    )

    void(
        "DestroyGLXPbufferSGIX",
        "Destroys a GLXPbuffer.",

        DISPLAY,
        GLXPbuffer.IN("pbuf", "the pbuffer to destroy")
    )

    void(
        "QueryGLXPbufferSGIX",
        "Queries an attribute associated with a GLXPbuffer.",

        DISPLAY,
        GLXPbuffer.IN("pbuf", "the pbuffer being queried"),
        int.IN("attribute", "the attribute to query"),
        Check(1)..unsigned_int.p.OUT("value", "returns the attribute value")
    )

    void(
        "SelectEventSGIX",
        "Selects which GLX events should be received on a GLXdrawable.",

        DISPLAY,
        GLXDrawable.IN("drawable", "the GLXDrawable"),
        unsigned_long.IN("mask", "the selection mask")
    )

    void(
        "GetSelectedEventSGIX",
        "Returns which GLX events are selected for a GLXdrawable.",

        DISPLAY,
        GLXDrawable.IN("drawable", "the GLXDrawable"),
        Check(1)..unsigned_long.p.OUT("mask", "returns the selection mask")
    )

}