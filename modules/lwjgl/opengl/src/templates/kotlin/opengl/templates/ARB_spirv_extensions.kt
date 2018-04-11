/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_spirv_extensions = "ARBSPIRVExtensions".nativeClassGL("ARB_spirv_extensions") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        {@code ARB_gl_spirv} added support for using SPIR-V modules in OpenGL. However it only added support for SPIR-V 1.0 concepts that were part of the
        OpenGL 4.5 Core Profile.

        There are a great number of additional OpenGL ARB and vendor extensions which add shading language concepts and since they were defined prior to the
        existence of SPIR-V support in OpenGL they don't add SPIR-V support for their additional features. Ideally {@code GL_ARB_gl_spirv} would have added
        support for them, but as noted in Issue 27 of that extension, support for them was left as a future exercise.

        Now that at least some of that functionality has been defined via SPIR-V extensions, there is currently no way for an OpenGL implementation to
        advertise that is supports additional SPIR-V extensions.

        This extension provides a mechanism for an implementation to advertise which SPIR-V extensions it supports, and further provides a place where the
        SPIR-V environment for those extensions can be documented for OpenGL.

        It is expected that this document can be extended over time as SPIR-V support for additional extensions is added. The mapping between GLSL and SPIR-V
        concepts and any other pertinent information can be provided here as interactions with the corresponding OpenGL and SPIR-V extensions.

        Requires ${ARB_gl_spirv.core}.
        """

    IntConstant(
        "Accepted by the {@code name} parameter of #GetStringi().",

        "SPIR_V_EXTENSIONS"..0x9553
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetIntegerv().",

        "NUM_SPIR_V_EXTENSIONS"..0x9554
    )
}