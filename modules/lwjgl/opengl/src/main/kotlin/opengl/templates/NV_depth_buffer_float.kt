/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_depth_buffer_float = "NVDepthBufferFloat".nativeClassGL("NV_depth_buffer_float", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides new texture internal formats whose depth components are stored as 32-bit floating-point values, rather than the normalized
        unsigned integers used in existing depth formats. Floating-point depth textures support all the functionality supported for fixed-point depth textures,
        including shadow mapping and rendering support via EXT_framebuffer_object. Floating-point depth textures can store values outside the range [0,1].

        By default, OpenGL entry points taking depth values implicitly clamp the values to the range [0,1]. This extension provides new DepthClear, DepthRange,
        and DepthBoundsEXT entry points that allow applications to specify depth values that are not clamped.

        Additionally, this extension provides new packed depth/stencil pixel formats (see EXT_packed_depth_stencil) that have 64-bit pixels consisting of a
        32-bit floating-point depth value, 8 bits of stencil, and 24 unused bites. A packed depth/stencil texture internal format is also provided.

        This extension does not provide support for WGL or GLX pixel formats with floating-point depth buffers. The existing (but not commonly used)
        WGL_EXT_depth_float extension could be used for this purpose.

        Requires ${GL20.core}, ${ARB_color_buffer_float.link}, ${EXT_packed_depth_stencil.link} and ${EXT_framebuffer_object.link}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT, and
        returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameterivEXT.
        """,

        "DEPTH_COMPONENT32F_NV"..0x8DAB,
        "DEPTH32F_STENCIL8_NV"..0x8DAC
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage.
        """,

        "FLOAT_32_UNSIGNED_INT_24_8_REV_NV"..0x8DAD
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "DEPTH_BUFFER_FLOAT_MODE_NV"..0x8DAF
    )

    void(
        "DepthRangedNV",
        "",

        GLdouble.IN("zNear", ""),
        GLdouble.IN("zFar", "")
    )

    void(
        "ClearDepthdNV",
        "",

        GLdouble.IN("depth", "")
    )

    void(
        "DepthBoundsdNV",
        "",

        GLdouble.IN("zmin", ""),
        GLdouble.IN("zmax", "")
    )
}