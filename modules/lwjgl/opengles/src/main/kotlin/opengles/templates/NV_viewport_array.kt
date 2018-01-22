/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

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

        GLuint.IN("first", ""),
        AutoSize(4, "v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "ViewportIndexedfNV",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("w", ""),
        GLfloat.IN("h", "")
    )

    void(
        "ViewportIndexedfvNV",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLfloat_p.IN("v", "")
    )

    void(
        "ScissorArrayvNV",
        "",

        GLuint.IN("first", ""),
        AutoSize(4, "v")..GLsizei.IN("count", ""),
        const..GLint_p.IN("v", "")
    )

    void(
        "ScissorIndexedNV",
        "",

        GLuint.IN("index", ""),
        GLint.IN("left", ""),
        GLint.IN("bottom", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "ScissorIndexedvNV",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLint_p.IN("v", "")
    )

    void(
        "DepthRangeArrayfvNV",
        "",

        GLuint.IN("first", ""),
        AutoSize(2, "v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "DepthRangeIndexedfNV",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("n", ""),
        GLfloat.IN("f", "")
    )

    void(
        "GetFloati_vNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        ReturnParam..Check(1)..GLfloat_p.OUT("data", "")
    )

    void(
        "EnableiNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    void(
        "DisableiNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    GLboolean(
        "IsEnablediNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )
}