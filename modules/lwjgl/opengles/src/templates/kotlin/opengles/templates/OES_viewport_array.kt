/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_viewport_array = "OESViewportArray".nativeClassGLES("OES_viewport_array", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
        transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which
        OpenGL ES should draw primitives. Unextended OpenGL ES implementations provide a single viewport per context. In order to draw primitives into multiple
        viewports, the OpenGL ES viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an
        application to amplify geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these
        primitives to render into a selected render target. However, all render targets share the same, global OpenGL ES viewport.

        This extension enhances OpenGL ES by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
        viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
        separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
        rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
        floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.

        Requires ${GLES32.link}, ${EXT_geometry_shader.link} or ${OES_geometry_shader.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v.",

        "MAX_VIEWPORTS_OES"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS_OES"..0x825C,
        "VIEWPORT_BOUNDS_RANGE_OES"..0x825D,
        "VIEWPORT_INDEX_PROVOKING_VERTEX_OES"..0x825F
    )

    void(
        "ViewportArrayvOES",
        "",

        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLfloat.const.p("v", "")
    )

    void(
        "ViewportIndexedfOES",
        "",

        GLuint("index", ""),
        GLfloat("x", ""),
        GLfloat("y", ""),
        GLfloat("w", ""),
        GLfloat("h", "")
    )

    void(
        "ViewportIndexedfvOES",
        "",

        GLuint("index", ""),
        Check(4)..GLfloat.const.p("v", "")
    )

    void(
        "ScissorArrayvOES",
        "",

        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLint.const.p("v", "")
    )

    void(
        "ScissorIndexedOES",
        "",

        GLuint("index", ""),
        GLint("left", ""),
        GLint("bottom", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "ScissorIndexedvOES",
        "",

        GLuint("index", ""),
        Check(4)..GLint.const.p("v", "")
    )

    void(
        "DepthRangeArrayfvOES",
        "",

        GLuint("first", ""),
        AutoSize(2, "v")..GLsizei("count", ""),
        GLfloat.const.p("v", "")
    )

    void(
        "DepthRangeIndexedfOES",
        "",

        GLuint("index", ""),
        GLfloat("n", ""),
        GLfloat("f", "")
    )

    void(
        "GetFloati_vOES",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLfloat.p("data", "")
    )

    OES_draw_buffers_indexed reuse "EnableiOES"
    OES_draw_buffers_indexed reuse "DisableiOES"
    OES_draw_buffers_indexed reuse "IsEnablediOES"
}