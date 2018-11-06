/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_viewport_array = "NVViewportArray".nativeClassGLES("NV_viewport_array", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
        transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which
        OpenGL should draw primitives. Unextended OpenGL implementations provide a single viewport per context. In order to draw primitives into multiple
        viewports, the OpenGL viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an
        application to amplify geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these
        primitives to render into a selected render target. However, all render targets share the same, global OpenGL viewport.

        This extension enhances OpenGL by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
        viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
        separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
        rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
        floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.

        Requires ${GLES31.core} and ${EXT_geometry_shader.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v.",

        "MAX_VIEWPORTS_NV"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS_NV"..0x825C,
        "VIEWPORT_BOUNDS_RANGE_NV"..0x825D,
        "VIEWPORT_INDEX_PROVOKING_VERTEX_NV"..0x825F
    )

    void(
        "ViewportArrayvNV",
        "",

        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLfloat.const.p("v", "")
    )

    void(
        "ViewportIndexedfNV",
        "",

        GLuint("index", ""),
        GLfloat("x", ""),
        GLfloat("y", ""),
        GLfloat("w", ""),
        GLfloat("h", "")
    )

    void(
        "ViewportIndexedfvNV",
        "",

        GLuint("index", ""),
        Check(4)..GLfloat.const.p("v", "")
    )

    void(
        "ScissorArrayvNV",
        "",

        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLint.const.p("v", "")
    )

    void(
        "ScissorIndexedNV",
        "",

        GLuint("index", ""),
        GLint("left", ""),
        GLint("bottom", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "ScissorIndexedvNV",
        "",

        GLuint("index", ""),
        Check(4)..GLint.const.p("v", "")
    )

    void(
        "DepthRangeArrayfvNV",
        "",

        GLuint("first", ""),
        AutoSize(2, "v")..GLsizei("count", ""),
        GLfloat.const.p("v", "")
    )

    void(
        "DepthRangeIndexedfNV",
        "",

        GLuint("index", ""),
        GLfloat("n", ""),
        GLfloat("f", "")
    )

    void(
        "GetFloati_vNV",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        ReturnParam..Check(1)..GLfloat.p("data", "")
    )

    void(
        "EnableiNV",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )

    void(
        "DisableiNV",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )

    GLboolean(
        "IsEnablediNV",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )
}