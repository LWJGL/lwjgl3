/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_sample_locations = "NVSampleLocations".nativeClassGLES("NV_sample_locations", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "sample_locations")} extension.

        This extension allows an application to modify the locations of samples within a pixel used in multisample rasterization. Additionally, it allows
        applications to specify different sample locations for each pixel in a group of adjacent pixels, which may increase antialiasing quality (particularly
        if a custom resolve shader is used that takes advantage of these different locations).

        It is common for implementations to optimize the storage of depth values by storing values that can be used to reconstruct depth at each sample
        location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle can be represented using
        plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations
        causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated. This extension provides a command
        to "resolve" and store per-sample depth values using the currently programmed sample locations, which allows the application to manage this issue
        if/when necessary.

        The programmable sample locations are used during rasterization and for evaluation of depth functions during normal geometric rendering. The
        programmable locations are associated with a framebuffer object rather than an individual depth buffer, so if the depth buffer is used as a texture the
        texture sampling may be done at the standard sample locations. Additionally, commands that do not render geometric primitives (e.g. ReadPixels,
        BlitFramebuffer, CopyTexSubImage2D, etc.) may use the standard sample locations to resolve depth functions rather than the programmable locations. If a
        single depth buffer is used at different times with different sample locations, the depth functions may be interpreted using the current sample
        locations.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "SAMPLE_LOCATION_SUBPIXEL_BITS_NV"..0x933D,
        "SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV"..0x933E,
        "SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV"..0x933F,
        "PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV"..0x9340
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetMultisamplefv.",

        "SAMPLE_LOCATION_NV"..0x8E50,
        "PROGRAMMABLE_SAMPLE_LOCATION_NV"..0x9341
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv.",

        "FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV"..0x9342,
        "FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV"..0x9343
    )

    void(
        "FramebufferSampleLocationsfvNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("start", ""),
        AutoSize("v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "NamedFramebufferSampleLocationsfvNV",
        "",

        GLuint.IN("framebuffer", ""),
        GLuint.IN("start", ""),
        AutoSize("v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "ResolveDepthValuesNV",
        ""
    )
}