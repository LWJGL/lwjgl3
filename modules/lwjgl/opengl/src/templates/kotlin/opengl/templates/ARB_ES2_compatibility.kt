/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_ES2_compatibility = "ARBES2Compatibility".nativeClassGL("ARB_ES2_compatibility") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for features of OpenGL ES 2.0 that are missing from OpenGL 3.x. Enabling these features will ease the process of porting
        applications from OpenGL ES 2.0 to OpenGL.

        ${GL41.promoted}
        """

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "SHADER_COMPILER"..0x8DFA,
        "SHADER_BINARY_FORMATS"..0x8DF8,
        "NUM_SHADER_BINARY_FORMATS"..0x8DF9,
        "MAX_VERTEX_UNIFORM_VECTORS"..0x8DFB,
        "MAX_VARYING_VECTORS"..0x8DFC,
        "MAX_FRAGMENT_UNIFORM_VECTORS"..0x8DFD,
        "IMPLEMENTATION_COLOR_READ_TYPE"..0x8B9A,
        "IMPLEMENTATION_COLOR_READ_FORMAT"..0x8B9B
    )

    IntConstant(
        "Accepted by the {@code type} parameter of VertexAttribPointer.",

        "FIXED"..0x140C
    )

    IntConstant(
        "Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.",

        "LOW_FLOAT"..0x8DF0,
        "MEDIUM_FLOAT"..0x8DF1,
        "HIGH_FLOAT"..0x8DF2,
        "LOW_INT"..0x8DF3,
        "MEDIUM_INT"..0x8DF4,
        "HIGH_INT"..0x8DF5
    )

    IntConstant(
        "Accepted by the {@code format} parameter of most commands taking sized internal formats.",

        "RGB565"..0x8D62
    )

    GL41C reuse "ReleaseShaderCompiler"
    GL41C reuse "ShaderBinary"
    GL41C reuse "GetShaderPrecisionFormat"
    GL41C reuse "DepthRangef"
    GL41C reuse "ClearDepthf"
}