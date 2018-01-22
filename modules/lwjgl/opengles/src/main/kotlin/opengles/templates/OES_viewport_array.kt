/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

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

        GLuint.IN("first", ""),
        AutoSize(4, "v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "ViewportIndexedfOES",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("w", ""),
        GLfloat.IN("h", "")
    )

    void(
        "ViewportIndexedfvOES",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLfloat_p.IN("v", "")
    )

    void(
        "ScissorArrayvOES",
        "",

        GLuint.IN("first", ""),
        AutoSize(4, "v")..GLsizei.IN("count", ""),
        const..GLint_p.IN("v", "")
    )

    void(
        "ScissorIndexedOES",
        "",

        GLuint.IN("index", ""),
        GLint.IN("left", ""),
        GLint.IN("bottom", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "ScissorIndexedvOES",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLint_p.IN("v", "")
    )

    void(
        "DepthRangeArrayfvOES",
        "",

        GLuint.IN("first", ""),
        AutoSize(2, "v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "DepthRangeIndexedfOES",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("n", ""),
        GLfloat.IN("f", "")
    )

    void(
        "GetFloati_vOES",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("data", "")
    )

    IgnoreMissing..void(
        "EnableiOES",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    IgnoreMissing..void(
        "DisableiOES",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    IgnoreMissing..GLboolean(
        "IsEnablediOES",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )
}