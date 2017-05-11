/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_gpu_program_parameters = "EXTGPUProgramParameters".nativeClassGL("EXT_gpu_program_parameters", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new set of procedures to load multiple consecutive program environment parameters more efficiently, via a single GL call
        instead of multiple calls. This will reduce the amount of CPU overhead involved in loading parameters.

        With the existing ARB_vertex_program and ARB_fragment_program APIs, program parameters must be loaded one at a time, via separate calls. While the
        NV_vertex_program extension provides a set of similar functions that can be used to load program environment parameters (which are equivalent to
        "program parameters" in NV_vertex_program), no such function exists for program local parameters.
        """

    void(
        "ProgramEnvParameters4fvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        AutoSize(4, "params")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("params", "")
    )

    void(
        "ProgramLocalParameters4fvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        AutoSize(4, "params")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("params", "")
    )
}