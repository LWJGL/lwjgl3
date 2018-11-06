/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shading_rate_image = "NVShadingRateImage".nativeClassGL("NV_shading_rate_image", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        By default, OpenGL runs a fragment shader once for each pixel covered by a primitive being rasterized. When using multisampling, the outputs of that
        fragment shader are broadcast to each covered sample of the fragment's pixel. When using multisampling, applications can also request that the fragment
        shader be run once per color sample (when using the {@code "sample"} qualifier on one or more active fragment shader inputs), or run a fixed number of
        times per pixel using #SAMPLE_SHADING enable and the #MinSampleShading() frequency value. In all of these approaches, the number of fragment shader
        invocations per pixel is fixed, based on API state.

        This extension allows applications to bind and enable a shading rate image that can be used to vary the number of fragment shader invocations across
        the framebuffer. This can be useful for applications like eye tracking for virtual reality, where the portion of the framebuffer that the user is
        looking at directly can be processed at high frequency, while distant corners of the image can be processed at lower frequency. The shading rate image
        is an immutable-format two-dimensional or two-dimensional array texture that uses a format of #R8UI. Each texel represents a fixed-size rectangle in
        the framebuffer, covering 16x16 pixels in the initial implementation of this extension. When rasterizing a primitive covering one of these rectangles,
        the OpenGL implementation reads the texel in the bound shading rate image and looks up the fetched value in a palette of shading rates. The shading
        rate used can vary from (finest) 16 fragment shader invocations per pixel to (coarsest) one fragment shader invocation for each 4x4 block of pixels.

        When this extension is advertised by an OpenGL implementation, the implementation must also support the GLSL extension
        {@code "GL_NV_shading_rate_image"} (documented separately), which provides new built-in variables that allow fragment shaders to determine the
        effective shading rate used for each fragment. Additionally, the GLSL extension also provides new layout qualifiers allowing the interlock
        functionality provided by ${ARB_fragment_shader_interlock.registryLink} to guarantee mutual exclusion across an entire fragment when the shading rate specifies
        multiple pixels per fragment shader invocation.

        Note that this extension requires the use of a framebuffer object; the shading rate image and related state are ignored when rendering to the default
        framebuffer.

        Requires ${GL45.core} and ${NV_framebuffer_mixed_samples.link}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of #Enable(), #Disable(), and #IsEnabled(), by the {@code target} parameter of #Enablei(), #Disablei(),
        #IsEnabledi(), #EnableIndexedEXT(), #DisableIndexedEXT(), and #IsEnabledIndexedEXT(), and by the {@code pname} parameter of #GetBooleanv(),
        #GetIntegerv(), #GetInteger64v(), #GetFloatv(), #GetDoublev(), #GetDoubleIndexedvEXT(), #GetBooleani_v(), #GetIntegeri_v(), #GetInteger64i_v(),
        #GetFloati_v(), #GetDoublei_v(), #GetBooleanIndexedvEXT(), #GetIntegerIndexedvEXT(), and #GetFloatIndexedvEXT().
        """,

        "SHADING_RATE_IMAGE_NV"..0x9563
    )

    IntConstant(
        """
        Accepted in the {@code rates} parameter of #ShadingRateImagePaletteNV() and the {@code rate} parameter of #ShadingRateSampleOrderCustomNV() and
        #GetShadingRateSampleLocationivNV(); returned in the {@code rate} parameter of #GetShadingRateImagePaletteNV().
        """,

        "SHADING_RATE_NO_INVOCATIONS_NV"..0x9564,
        "SHADING_RATE_1_INVOCATION_PER_PIXEL_NV"..0x9565,
        "SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV"..0x9566,
        "SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV"..0x9567,
        "SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV"..0x9568,
        "SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV"..0x9569,
        "SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV"..0x956A,
        "SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV"..0x956B,
        "SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV"..0x956C,
        "SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV"..0x956D,
        "SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV"..0x956E,
        "SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV"..0x956F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetBooleanv(), #GetDoublev(), #GetIntegerv(), and #GetFloatv().",

        "SHADING_RATE_IMAGE_BINDING_NV"..0x955B,
        "SHADING_RATE_IMAGE_TEXEL_WIDTH_NV"..0x955C,
        "SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV"..0x955D,
        "SHADING_RATE_IMAGE_PALETTE_SIZE_NV"..0x955E,
        "MAX_COARSE_FRAGMENT_SAMPLES_NV"..0x955F
    )

    IntConstant(
        "Accepted by the {@code order} parameter of #ShadingRateSampleOrderNV().",

        "SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV"..0x95AE,
        "SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV"..0x95AF,
        "SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV"..0x95B0
    )

    void(
        "BindShadingRateImageNV",
        "",

        GLuint("texture", "")
    )

    void(
        "ShadingRateImagePaletteNV",
        "",

        GLuint("viewport", ""),
        GLuint("first", ""),
        AutoSize("rates")..GLsizei("count", ""),
        GLenum.const.p("rates", "")
    )

    void(
        "GetShadingRateImagePaletteNV",
        "",

        GLuint("viewport", ""),
        GLuint("entry", ""),
        Check(1)..GLenum.p("rate", "")
    )

    void(
        "ShadingRateImageBarrierNV",
        "",

        GLboolean("synchronize", "")
    )

    void(
        "ShadingRateSampleOrderNV",
        "",

        GLenum("order", "")
    )

    void(
        "ShadingRateSampleOrderCustomNV",
        "",

        GLenum("rate", ""),
        GLuint("samples", ""),
        Unsafe..GLint.const.p("locations", "")
    )

    void(
        "GetShadingRateSampleLocationivNV",
        "",

        GLenum("rate", ""),
        GLuint("samples", ""),
        GLuint("index", ""),
        Check(3)..GLint.p("location", "")
    )
}