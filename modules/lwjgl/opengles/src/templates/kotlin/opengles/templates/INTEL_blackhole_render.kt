/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val INTEL_blackhole_render = "INTELBlackholeRender".nativeClassGLES("INTEL_blackhole_render", postfix = INTEL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The purpose of this extension is to allow an application to disable all rendering operations emitted to the GPU through the OpenGL rendering commands
        ({@code Draw*}, {@code DispatchCompute*}, {@code BlitFramebuffer}, etc...). Changes to the OpenGL pipeline are not affected.

        New preprocessor {@code \#defines} are added to the OpenGL Shading Language:
        ${codeBlock("""
\#define GL_INTEL_blackhole_render 1""")}
        """

    IntConstant(
        "Accepted by the {@code target} parameter of Enable, Disable, IsEnabled.",

        "BLACKHOLE_RENDER_INTEL"..0x83FC
    )
}