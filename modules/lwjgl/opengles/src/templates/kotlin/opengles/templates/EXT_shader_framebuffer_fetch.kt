/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_shader_framebuffer_fetch = "EXTShaderFramebufferFetch".nativeClassGLES("EXT_shader_framebuffer_fetch", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Conventional OpenGL blending provides a configurable series of operations that can be used to combine the output values from a fragment shader with the
        values already in the framebuffer. While these operations are suitable for basic image compositing, other compositing operations or operations that
        treat fragment output as something other than a color (normals, for instance) may not be expressible without multiple passes or render-to-texture
        operations.

        This extension provides a mechanism whereby a fragment shader may read existing framebuffer data as input. This can be used to implement compositing
        operations that would have been inconvenient or impossible with fixed-function blending. It can also be used to apply a function to the framebuffer
        color, by writing a shader which uses the existing framebuffer color as its only input.

        This extension provides two alternative name strings:

        ${ul(
            """
            {@code GL_EXT_shader_framebuffer_fetch} guarantees full coherency between framebuffer reads and writes. If this extension string is exposed, the
            result of reading from the framebuffer from a fragment shader invocation is guaranteed to reflect values written by any previous overlapping
            samples in API primitive order, unless requested otherwise in the shader source using the noncoherent layout qualifier.
            """,
            """
            {@code GL_EXT_shader_framebuffer_fetch_non_coherent} provides limited implicit coherency guarantees. Instead, the application is expected to call
            the #FramebufferFetchBarrierEXT() command for previous framebuffer writes to become visible to subsequent fragment shader invocations. For this
            extension to give well-defined results applications may have to split rendering into multiple passes separated with
            {@code FramebufferFetchBarrierEXT} calls. The functionality provided by this extension is requested in the shader source using the noncoherent
            layout qualifier.
            """
        )}

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT"..0x8A52
    )
}

val EXT_shader_framebuffer_fetch_non_coherent = "EXTShaderFramebufferFetchNonCoherent".nativeClassGLES("EXT_shader_framebuffer_fetch_non_coherent", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        See ${EXT_shader_framebuffer_fetch.link}.
        """

    void(
        "FramebufferFetchBarrierEXT",
        """
        Specifies a boundary between passes when reading existing framebuffer data from fragment shaders via the {@code gl_LastFragData} built-in variable.
        Previous framebuffer object writes regardless of the mechanism (including clears, blits and primitive rendering) are guaranteed to be visible to
        subsequent fragment shader invocations that read from the framebuffer once {@code FramebufferFetchBarrierEXT} is executed.

        If {@code EXT_shader_framebuffer_fetch} is also supported: Because the implementation guarantees coherency of framebuffer reads and writes for color
        outputs not explicitly marked with the noncoherent layout qualifier, calling the {@code FramebufferFetchBarrierEXT} command is not required unless the
        application wishes to manage memory ordering of framebuffer reads and writes explicitly, which may provide better performance on some implementations
        in cases where rendering can be split into multiple passes with non-self-overlapping geometry.
        """
    )
}