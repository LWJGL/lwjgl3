/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_sample_locations = "ARBSampleLocations".nativeClassGL("ARB_sample_locations") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an application to modify the locations of samples within a pixel used in multisample rasterization. Additionally, it allows
        applications to specify different sample locations for each pixel in a group of adjacent pixels, which may increase antialiasing quality (particularly
        if a custom resolve shader is used that takes advantage of these different locations).

        It is common for implementations to optimize the storage of depth values by storing values that can be used to reconstruct depth at each sample
        location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle can be represented using
        plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations
        causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated. This extension provides a command
        to "evaluate" and store per-sample depth values using the currently programmed sample locations, which allows the application to manage this issue
        if/when necessary.

        The programmable sample locations are used during rasterization and for evaluation of depth functions during normal geometric rendering. The
        programmable locations are associated with a framebuffer object rather than an individual depth buffer, so if the depth buffer is used as a texture the
        texture sampling may be done at the standard sample locations. Additionally, commands that do not render geometric primitives (e.g. ReadPixels,
        BlitFramebuffer, CopyTexSubImage2D, etc.) may use the standard sample locations to evaluate depth functions rather than the programmable locations. If
        a single depth buffer is used at different times with different sample locations, the depth functions may be interpreted using the current sample
        locations.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "SAMPLE_LOCATION_SUBPIXEL_BITS_ARB"..0x933D,
        "SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB"..0x933E,
        "SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB"..0x933F,
        "PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB"..0x9340
    )

    IntConstant(
        """
        // Alias of SAMPLE_POSITION. Before NV_expms, the spec used "location". SAMPLE_LOCATION_ARB 0x8E50 PROGRAMMABLE_SAMPLE_LOCATION_ARB 0x9341 Accepted by
        the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv.
        """,

        "FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB"..0x9342,
        "FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB"..0x9343
    )

    void(
        "FramebufferSampleLocationsfvARB",
        """
        Controls the programmable sample locations for the framebuffer bound to the specified {@code target}.

        There are {@code N} pairs of programmable sample locations values in a framebuffer, where {@code N} is the value of
        #PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB. Each programmable sample location is specified as a pair of floating point values in the range
        {@code [0,1]}, corresponding to the x and y locations respectively in GL pixel space. {@code (0.5, 0.5)} thus corresponds to the pixel center. Sample
        locations outside of {@code [0,1]} result in undefined behavior.
        """,

        GLenum.IN("target", "the framebuffer target", "#FRAMEBUFFER #DRAW_FRAMEBUFFER #READ_FRAMEBUFFER"),
        GLuint.IN("start", "the first sample location to update"),
        AutoSize(2, "v")..GLsizei.IN("count", "the number of sample locations to update"),
        const..GLfloat_p.IN("v", "a pair of values for each sample location to update")
    )

    void(
        "NamedFramebufferSampleLocationsfvARB",
        "DSA version of #FramebufferSampleLocationsfvARB().",

        GLuint.IN("framebuffer", "the framebuffer object to update"),
        this["FramebufferSampleLocationsfvARB"]["start"],
        this["FramebufferSampleLocationsfvARB"]["count"],
        this["FramebufferSampleLocationsfvARB"]["v"]
    )

    void(
        "EvaluateDepthValuesARB",
        """
        Evaluates depth values for all samples in the current depth buffer (subject to the pixel ownership and scissor tests) and stores each value in the
        depth buffer. This can be used to ensure that later accesses will use depth values consistent with the sample locations used when the samples were
        generated. If the current framebuffer has no depth buffer, EvaluateDepthValuesARB will have no effect.
        """
    )
}