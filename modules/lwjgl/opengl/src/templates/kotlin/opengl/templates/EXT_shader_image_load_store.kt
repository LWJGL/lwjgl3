/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_shader_image_load_store = "EXTShaderImageLoadStore".nativeClassGL("EXT_shader_image_load_store", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides GLSL built-in functions allowing shaders to load from, store to, and perform atomic read-modify-write operations to a single
        level of a texture object from any shader stage. These built-in functions are named imageLoad(), imageStore(), and imageAtomic*(), respectively, and
        accept integer texel coordinates to identify the texel accessed. The extension adds the notion of "image units" to the OpenGL API, to which texture
        levels are bound for access by the GLSL built-in functions. To allow shaders to specify the image unit to access, GLSL provides a new set of data types
        ("image*") similar to samplers. Each image variable is assigned an integer value to identify an image unit to access, which is specified using
        Uniform*() APIs in a manner similar to samplers. For implementations supporting the NV_gpu_program5 extensions, assembly language instructions to
        perform image loads, stores, and atomics are also provided.

        This extension also provides the capability to explicitly enable "early" per-fragment tests, where operations like depth and stencil testing are
        performed prior to fragment shader execution. In unextended OpenGL, fragment shaders never have any side effects and implementations can sometimes
        perform per-fragment tests and discard some fragments prior to executing the fragment shader. Since this extension allows fragment shaders to write to
        texture and buffer object memory using the built-in image functions, such optimizations could lead to non-deterministic results. To avoid this,
        implementations supporting this extension may not perform such optimizations on shaders having such side effects. However, enabling early per-fragment
        tests guarantees that such tests will be performed prior to fragment shader execution, and ensures that image stores and atomics will not be performed
        by fragment shader invocations where these per-fragment tests fail.

        Finally, this extension provides both a GLSL built-in function and an OpenGL API function allowing applications some control over the ordering of image
        loads, stores, and atomics relative to other OpenGL pipeline operations accessing the same memory. Because the extension provides the ability to
        perform random accesses to texture or buffer object memory, such accesses are not easily tracked by the OpenGL driver. To avoid the need for
        heavy-handed synchronization at the driver level, this extension requires manual synchronization. The MemoryBarrierEXT() OpenGL API function allows
        applications to specify a bitfield indicating the set of OpenGL API operations to synchronize relative to shader memory access. The memoryBarrier()
        GLSL built-in function provides a synchronization point within a given shader invocation to ensure that all memory accesses performed prior to the
        synchronization point complete prior to any started after the synchronization point.

        Requires ${GL30.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_IMAGE_UNITS_EXT"..0x8F38,
        "MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT"..0x8F39,
        "MAX_IMAGE_SAMPLES_EXT"..0x906D
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.",

        "IMAGE_BINDING_NAME_EXT"..0x8F3A,
        "IMAGE_BINDING_LEVEL_EXT"..0x8F3B,
        "IMAGE_BINDING_LAYERED_EXT"..0x8F3C,
        "IMAGE_BINDING_LAYER_EXT"..0x8F3D,
        "IMAGE_BINDING_ACCESS_EXT"..0x8F3E,
        "IMAGE_BINDING_FORMAT_EXT"..0x906E
    )

    IntConstant(
        "Accepted by the {@code barriers} parameter of MemoryBarrierEXT.",

        "VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT"..0x00000001,
        "ELEMENT_ARRAY_BARRIER_BIT_EXT"..0x00000002,
        "UNIFORM_BARRIER_BIT_EXT"..0x00000004,
        "TEXTURE_FETCH_BARRIER_BIT_EXT"..0x00000008,
        "SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT"..0x00000020,
        "COMMAND_BARRIER_BIT_EXT"..0x00000040,
        "PIXEL_BUFFER_BARRIER_BIT_EXT"..0x00000080,
        "TEXTURE_UPDATE_BARRIER_BIT_EXT"..0x00000100,
        "BUFFER_UPDATE_BARRIER_BIT_EXT"..0x00000200,
        "FRAMEBUFFER_BARRIER_BIT_EXT"..0x00000400,
        "TRANSFORM_FEEDBACK_BARRIER_BIT_EXT"..0x00000800,
        "ATOMIC_COUNTER_BARRIER_BIT_EXT"..0x00001000,
        "ALL_BARRIER_BITS_EXT"..0xFFFFFFFF.i
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "IMAGE_1D_EXT"..0x904C,
        "IMAGE_2D_EXT"..0x904D,
        "IMAGE_3D_EXT"..0x904E,
        "IMAGE_2D_RECT_EXT"..0x904F,
        "IMAGE_CUBE_EXT"..0x9050,
        "IMAGE_BUFFER_EXT"..0x9051,
        "IMAGE_1D_ARRAY_EXT"..0x9052,
        "IMAGE_2D_ARRAY_EXT"..0x9053,
        "IMAGE_CUBE_MAP_ARRAY_EXT"..0x9054,
        "IMAGE_2D_MULTISAMPLE_EXT"..0x9055,
        "IMAGE_2D_MULTISAMPLE_ARRAY_EXT"..0x9056,
        "INT_IMAGE_1D_EXT"..0x9057,
        "INT_IMAGE_2D_EXT"..0x9058,
        "INT_IMAGE_3D_EXT"..0x9059,
        "INT_IMAGE_2D_RECT_EXT"..0x905A,
        "INT_IMAGE_CUBE_EXT"..0x905B,
        "INT_IMAGE_BUFFER_EXT"..0x905C,
        "INT_IMAGE_1D_ARRAY_EXT"..0x905D,
        "INT_IMAGE_2D_ARRAY_EXT"..0x905E,
        "INT_IMAGE_CUBE_MAP_ARRAY_EXT"..0x905F,
        "INT_IMAGE_2D_MULTISAMPLE_EXT"..0x9060,
        "INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"..0x9061,
        "UNSIGNED_INT_IMAGE_1D_EXT"..0x9062,
        "UNSIGNED_INT_IMAGE_2D_EXT"..0x9063,
        "UNSIGNED_INT_IMAGE_3D_EXT"..0x9064,
        "UNSIGNED_INT_IMAGE_2D_RECT_EXT"..0x9065,
        "UNSIGNED_INT_IMAGE_CUBE_EXT"..0x9066,
        "UNSIGNED_INT_IMAGE_BUFFER_EXT"..0x9067,
        "UNSIGNED_INT_IMAGE_1D_ARRAY_EXT"..0x9068,
        "UNSIGNED_INT_IMAGE_2D_ARRAY_EXT"..0x9069,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT"..0x906A,
        "UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT"..0x906B,
        "UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"..0x906C
    )

    void(
        "BindImageTextureEXT",
        "",

        GLuint.IN("index", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLboolean.IN("layered", ""),
        GLint.IN("layer", ""),
        GLenum.IN("access", ""),
        GLint.IN("format", "")
    )

    void(
        "MemoryBarrierEXT",
        "",

        GLbitfield.IN("barriers", "")
    )
}