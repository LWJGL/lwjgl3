/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_gpu_shader4 = "EXTGPUShader4".nativeClassGL("EXT_gpu_shader4", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new hardware. In particular,
        this extension provides the following functionality:
        ${ul(
            """
            New texture lookup functions are provided that allow shaders to access individual texels using integer coordinates referring to the texel location
            and level of detail. No filtering is performed. These functions allow applications to use textures as one-, two-, and three-dimensional arrays.
            """,
            "New texture lookup functions are provided that allow shaders to query the dimensions of a specific level-of-detail image of a texture object.",
            """
            New texture lookup functions variants are provided that allow shaders to pass a constant integer vector used to offset the texel locations used
            during the lookup to assist in custom texture filtering operations.
            """,
            """
            New texture lookup functions are provided that allow shaders to access one- and two-dimensional array textures. The second, or third, coordinate is
            used to select the layer of the array to access.
            """,
            """
            New "Grad" texture lookup functions are provided that allow shaders to explicitely pass in derivative values which are used by the GL to compute the
            level-of-detail when performing a texture lookup.
            """,
            "A new texture lookup function is provided to access a buffer texture.",
            "The existing absolute LOD texture lookup functions are no longer restricted to the vertex shader only.",
            """
            The ability to specify and use cubemap textures with a DEPTH_COMPONENT internal format. This also enables shadow mapping on cubemaps. The 'q'
            coordinate is used as the reference value for comparisons. A set of new texture lookup functions is provided to lookup into shadow cubemaps.
            """,
            """
            The ability to specify if varying variables are interpolated in a non-perspective correct manner, if they are flat shaded or, if multi-sampling, if
            centroid sampling should be performed.
            """,
            """
            Full signed integer and unsigned integer support in the OpenGL Shading Language:
            ${ul(
                "Integers are defined as 32 bit values using two's complement.",
                "Unsigned integers and vectors thereof are added.",
                """
                New texture lookup functions are provided that return integer values. These functions are to be used in conjunction with new texture formats
                whose components are actual integers, rather than integers that encode a floating-point value. To support these lookup functions, new integer
                and unsigned-integer sampler types are introduced.
                """,
                "Integer bitwise operators are now enabled.",
                "Several built-in functions and operators now operate on integers or vectors of integers.",
                "New vertex attribute functions are added that load integer attribute data and can be referenced in a vertex shader as integer data.",
                "New uniform loading commands are added to load unsigned integer data.",
                "Varying variables can now be (unsigned) integers. If declared as such, they have to be flat shaded.",
                """
                Fragment shaders can define their own output variables, and declare them to be of type floating-point, integer or unsigned integer. These
                variables are bound to a fragment color index with the new API command BindFragDataLocationEXT(), and directed to buffers using the existing
                DrawBuffer or DrawBuffers API commands.
                """
            )}
            """,
            "Added new built-in functions truncate() and round() to the shading language.",
            """
            A new built-in variable accessible from within vertex shaders that holds the index <i> implicitly passed to ArrayElement to specify the vertex.
            This is called the vertex ID.
            """,
            """
            A new built-in variable accessible from within fragment and geometry shaders that hold the index of the currently processed primitive. This is
            called the primitive ID.
            """
        )}
        This extension also briefly mentions a new shader type, called a geometry shader. A geometry shader is run after vertices are transformed, but before
        clipping. A geometry shader begins with a single primitive (point, line, triangle. It can read the attributes of any of the vertices in the primitive
        and use them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices
        to define a new primitive. Geometry shaders are discussed in detail in the GL_EXT_geometry_shader4 specification.

        Requires ${GL20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuivEXT and GetVertexAttribIivEXT.
        """,

        "VERTEX_ATTRIB_ARRAY_INTEGER_EXT"..0x88FD
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_1D_ARRAY_EXT"..0x8DC0,
        "SAMPLER_2D_ARRAY_EXT"..0x8DC1,
        "SAMPLER_BUFFER_EXT"..0x8DC2,
        "SAMPLER_1D_ARRAY_SHADOW_EXT"..0x8DC3,
        "SAMPLER_2D_ARRAY_SHADOW_EXT"..0x8DC4,
        "SAMPLER_CUBE_SHADOW_EXT"..0x8DC5,
        "UNSIGNED_INT_VEC2_EXT"..0x8DC6,
        "UNSIGNED_INT_VEC3_EXT"..0x8DC7,
        "UNSIGNED_INT_VEC4_EXT"..0x8DC8,
        "INT_SAMPLER_1D_EXT"..0x8DC9,
        "INT_SAMPLER_2D_EXT"..0x8DCA,
        "INT_SAMPLER_3D_EXT"..0x8DCB,
        "INT_SAMPLER_CUBE_EXT"..0x8DCC,
        "INT_SAMPLER_2D_RECT_EXT"..0x8DCD,
        "INT_SAMPLER_1D_ARRAY_EXT"..0x8DCE,
        "INT_SAMPLER_2D_ARRAY_EXT"..0x8DCF,
        "INT_SAMPLER_BUFFER_EXT"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_1D_EXT"..0x8DD1,
        "UNSIGNED_INT_SAMPLER_2D_EXT"..0x8DD2,
        "UNSIGNED_INT_SAMPLER_3D_EXT"..0x8DD3,
        "UNSIGNED_INT_SAMPLER_CUBE_EXT"..0x8DD4,
        "UNSIGNED_INT_SAMPLER_2D_RECT_EXT"..0x8DD5,
        "UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT"..0x8DD6,
        "UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT"..0x8DD7,
        "UNSIGNED_INT_SAMPLER_BUFFER_EXT"..0x8DD8
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MIN_PROGRAM_TEXEL_OFFSET_EXT"..0x8904,
        "MAX_PROGRAM_TEXEL_OFFSET_EXT"..0x8905
    )

    // Vertex attrib functions javadoc
    val vertexAttribIndex = "the index of the pure integer generic vertex attribute to be modified"
    val vertexAttribX = "the vertex attribute x component"
    val vertexAttribY = "the vertex attribute y component"
    val vertexAttribZ = "the vertex attribute z component"
    val vertexAttribW = "the vertex attribute w component"
    val vertexAttribBuffer = "the pure integer vertex attribute buffer"

    void("VertexAttribI1iEXT", "Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX))
    void("VertexAttribI2iEXT", "Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY))
    void("VertexAttribI3iEXT", "Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ))
    void("VertexAttribI4iEXT", "Specifies the value of a pure integer generic vertex attribute.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ), GLint.IN("w", vertexAttribW))

    void("VertexAttribI1uiEXT", "Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLuint.IN("x", vertexAttribX))
    void("VertexAttribI2uiEXT", "Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLuint.IN("x", vertexAttribX), GLuint.IN("y", vertexAttribY))
    void("VertexAttribI3uiEXT", "Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ))
    void("VertexAttribI4uiEXT", "Specifies the value of an unsigned pure integer generic vertex attribute.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ), GLint.IN("w", vertexAttribW))

    void("VertexAttribI1ivEXT", "Pointer version of #VertexAttribI1iEXT().", GLuint.IN("index", vertexAttribIndex), Check(1)..const..GLint_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI2ivEXT", "Pointer version of #VertexAttribI2iEXT().", GLuint.IN("index", vertexAttribIndex), Check(2)..const..GLint_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI3ivEXT", "Pointer version of #VertexAttribI3iEXT().", GLuint.IN("index", vertexAttribIndex), Check(3)..const..GLint_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI4ivEXT", "Pointer version of #VertexAttribI4iEXT().", GLuint.IN("index", vertexAttribIndex), Check(4)..const..GLint_p.IN("v", vertexAttribBuffer))

    void("VertexAttribI1uivEXT", "Pointer version of #VertexAttribI1uiEXT().", GLuint.IN("index", vertexAttribIndex), Check(1)..const..GLuint_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI2uivEXT", "Pointer version of #VertexAttribI2uiEXT().", GLuint.IN("index", vertexAttribIndex), Check(2)..const..GLuint_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI3uivEXT", "Pointer version of #VertexAttribI3uiEXT().", GLuint.IN("index", vertexAttribIndex), Check(3)..const..GLuint_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI4uivEXT", "Pointer version of #VertexAttribI4uiEXT().", GLuint.IN("index", vertexAttribIndex), Check(4)..const..GLuint_p.IN("v", vertexAttribBuffer))

    void("VertexAttribI4bvEXT", "Byte version of #VertexAttribI4ivEXT().", GLuint.IN("index", vertexAttribIndex), Check(4)..const..GLbyte_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI4svEXT", "Short version of #VertexAttribI4ivEXT().", GLuint.IN("index", vertexAttribIndex), Check(4)..const..GLshort_p.IN("v", vertexAttribBuffer))

    void("VertexAttribI4ubvEXT", "Byte version of #VertexAttribI4uivEXT().", GLuint.IN("index", vertexAttribIndex), Check(4)..const..GLbyte_p.IN("v", vertexAttribBuffer))
    void("VertexAttribI4usvEXT", "Short version of #VertexAttribI4uivEXT().", GLuint.IN("index", vertexAttribIndex), Check(4)..const..GLshort_p.IN("v", vertexAttribBuffer))

    void(
        "VertexAttribIPointerEXT",
        "Specifies the location and organization of a pure integer vertex attribute array.",

        GLuint.IN("index", vertexAttribIndex),
        GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 #BGRA"),
        GLenum.IN(
            "type",
            "the data type of each component in the array",
            "#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT"
        ),
        GLsizei.IN(
            "stride",
            """
            the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
            the array. The initial value is 0.
            """),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
        )..Unsafe..ARRAY_BUFFER..const..void_p.IN(
            "pointer",
            """
            the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
            currently bound to the #ARRAY_BUFFER target. The initial value is 0.
            """
        )
    )

    void(
        "GetVertexAttribIivEXT",
        "Returns the value of a pure integer generic vertex attribute parameter.",

        GLuint.IN("index", vertexAttribIndex),
        GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
        Check(4)..ReturnParam..GLint_p.OUT("params", "returns the requested data")
    )

    void(
        "GetVertexAttribIuivEXT",
        "Unsigned version of #GetVertexAttribIivEXT().",

        GLuint.IN("index", vertexAttribIndex),
        GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
        Check(4)..ReturnParam..GLuint_p.OUT("params", "returns the requested data")
    )

    void(
        "GetUniformuivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("params", "")
    )

    void(
        "BindFragDataLocationEXT",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("color", ""),
        const..GLcharASCII_p.IN("name", "")
    )

    GLint(
        "GetFragDataLocationEXT",
        "",

        GLuint.IN("program", ""),
        const..GLcharASCII_p.IN("name", "")
    )

    void(
        "Uniform1uiEXT",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", "")
    )

    void(
        "Uniform2uiEXT",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", "")
    )

    void(
        "Uniform3uiEXT",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", "")
    )

    void(
        "Uniform4uiEXT",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", ""),
        GLuint.IN("v3", "")
    )

    void(
        "Uniform1uivEXT",
        "",

        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    void(
        "Uniform2uivEXT",
        "",

        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    void(
        "Uniform3uivEXT",
        "",

        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    void(
        "Uniform4uivEXT",
        "",

        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )
}