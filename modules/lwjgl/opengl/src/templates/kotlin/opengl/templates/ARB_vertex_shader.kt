/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_shader = "ARBVertexShader".nativeClassGL("ARB_vertex_shader", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds programmable vertex level processing to OpenGL. The application can write vertex shaders in a high level language as defined in the
        OpenGL Shading Language specification. A vertex shader replaces the transformation, texture coordinate generation and lighting parts of OpenGL, and it
        also adds texture access at the vertex level. Furthermore, management of vertex shader objects and loading generic attributes are discussed. A vertex
        shader object, attached to a program object, can be compiled and linked to produce an executable that runs on the vertex processor in OpenGL.
        This extension also defines how such an executable interacts with the fixed functionality vertex processing of OpenGL 1.4.

        ${GL20.promoted}
        """

    IntConstant(
        "Accepted by the {@code shaderType} argument of CreateShaderObjectARB and returned by the {@code params} parameter of GetObjectParameter{if}vARB.",

        "VERTEX_SHADER_ARB"..0x8B31
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_UNIFORM_COMPONENTS_ARB"..0x8B4A,
        "MAX_VARYING_FLOATS_ARB"..0x8B4B,
        "MAX_VERTEX_ATTRIBS_ARB"..0x8869,
        "MAX_TEXTURE_IMAGE_UNITS_ARB"..0x8872,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB"..0x8B4C,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB"..0x8B4D,
        "MAX_TEXTURE_COORDS_ARB"..0x8871
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "VERTEX_PROGRAM_POINT_SIZE_ARB"..0x8642,
        "VERTEX_PROGRAM_TWO_SIDE_ARB"..0x8643
    )

    IntConstant(
        "Accepted by the {@code pname} parameter GetObjectParameter{if}vARB.",

        "OBJECT_ACTIVE_ATTRIBUTES_ARB"..0x8B89,
        "OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB"..0x8B8A
    )

    val VERTEX_ATTRIBUTES = IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}vARB.",

        "VERTEX_ATTRIB_ARRAY_ENABLED_ARB"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE_ARB"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE_ARB"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE_ARB"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB"..0x886A,
        "CURRENT_VERTEX_ATTRIB_ARB"..0x8626
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttribPointervARB.",

        "VERTEX_ATTRIB_ARRAY_POINTER_ARB"..0x8645
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveAttribARB.",

        "FLOAT_VEC2_ARB"..0x8B50,
        "FLOAT_VEC3_ARB"..0x8B51,
        "FLOAT_VEC4_ARB"..0x8B52,
        "FLOAT_MAT2_ARB"..0x8B5A,
        "FLOAT_MAT3_ARB"..0x8B5B,
        "FLOAT_MAT4_ARB"..0x8B5C
    )

    // Vertex attrib functions javadoc
    val vertexAttribIndex = "the index of the generic vertex attribute to be modified"
    val vertexAttribX = "the vertex attribute x component"
    val vertexAttribY = "the vertex attribute y component"
    val vertexAttribZ = "the vertex attribute z component"
    val vertexAttribW = "the vertex attribute w component"
    val vertexAttribBuffer = "the vertex attribute buffer"

    void(
        "VertexAttrib1fARB",
        "Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.",

        GLuint("index", vertexAttribIndex),
        GLfloat("v0", vertexAttribX)
    )

    void("VertexAttrib1sARB", "Short version of #VertexAttrib1fARB().", GLuint("index", vertexAttribIndex), GLshort("v0", vertexAttribX))
    void("VertexAttrib1dARB", "Double version of #VertexAttrib1fARB().", GLuint("index", vertexAttribIndex), GLdouble("v0", vertexAttribX))

    void(
        "VertexAttrib2fARB",
        "Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.",

        GLuint("index", vertexAttribIndex),
        GLfloat("v0", vertexAttribX),
        GLfloat("v1", vertexAttribY)
    )

    void("VertexAttrib2sARB", "Short version of #VertexAttrib2fARB().", GLuint("index", vertexAttribIndex), GLshort("v0", vertexAttribX), GLshort("v1", vertexAttribY))
    void("VertexAttrib2dARB", "Double version of #VertexAttrib2fARB().", GLuint("index", vertexAttribIndex), GLdouble("v0", vertexAttribX), GLdouble("v1", vertexAttribY))

    void(
        "VertexAttrib3fARB",
        "Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.",

        GLuint("index", vertexAttribIndex),
        GLfloat("v0", vertexAttribX),
        GLfloat("v1", vertexAttribY),
        GLfloat("v2", vertexAttribZ)
    )

    void("VertexAttrib3sARB", "Short version of #VertexAttrib3fARB().", GLuint("index", vertexAttribIndex), GLshort("v0", vertexAttribX), GLshort("v1", vertexAttribY), GLshort("v2", vertexAttribZ))
    void("VertexAttrib3dARB", "Double version of #VertexAttrib3fARB().", GLuint("index", vertexAttribIndex), GLdouble("v0", vertexAttribX), GLdouble("v1", vertexAttribY), GLdouble("v2", vertexAttribZ))

    void(
        "VertexAttrib4fARB",
        "Specifies the value of a generic vertex attribute.",

        GLuint("index", vertexAttribIndex),
        GLfloat("v0", vertexAttribX),
        GLfloat("v1", vertexAttribY),
        GLfloat("v2", vertexAttribZ),
        GLfloat("v3", vertexAttribW)
    )

    void("VertexAttrib4sARB", "Short version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), GLshort("v0", vertexAttribX), GLshort("v1", vertexAttribY), GLshort("v2", vertexAttribZ), GLshort("v3", vertexAttribW))
    void("VertexAttrib4dARB", "Double version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), GLdouble("v0", vertexAttribX), GLdouble("v1", vertexAttribY), GLdouble("v2", vertexAttribZ), GLdouble("v3", vertexAttribW))
    void("VertexAttrib4NubARB", "Normalized unsigned byte version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), GLubyte("x", vertexAttribX), GLubyte("y", vertexAttribY), GLubyte("z", vertexAttribZ), GLubyte("w", vertexAttribW))

    void("VertexAttrib1fvARB", "Pointer version of #VertexAttrib1fARB().", GLuint("index", vertexAttribIndex), Check(1)..GLfloat.const.p("v", vertexAttribBuffer))
    void("VertexAttrib1svARB", "Pointer version of #VertexAttrib1sARB().", GLuint("index", vertexAttribIndex), Check(1)..GLshort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib1dvARB", "Pointer version of #VertexAttrib1dARB().", GLuint("index", vertexAttribIndex), Check(1)..GLdouble.const.p("v", vertexAttribBuffer))

    void("VertexAttrib2fvARB", "Pointer version of #VertexAttrib2fARB().", GLuint("index", vertexAttribIndex), Check(2)..GLfloat.const.p("v", vertexAttribBuffer))
    void("VertexAttrib2svARB", "Pointer version of #VertexAttrib2sARB().", GLuint("index", vertexAttribIndex), Check(2)..GLshort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib2dvARB", "Pointer version of #VertexAttrib2dARB().", GLuint("index", vertexAttribIndex), Check(2)..GLdouble.const.p("v", vertexAttribBuffer))

    void("VertexAttrib3fvARB", "Pointer version of #VertexAttrib3fARB().", GLuint("index", vertexAttribIndex), Check(3)..GLfloat.const.p("v", vertexAttribBuffer))
    void("VertexAttrib3svARB", "Pointer version of #VertexAttrib3sARB().", GLuint("index", vertexAttribIndex), Check(3)..GLshort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib3dvARB", "Pointer version of #VertexAttrib3dARB().", GLuint("index", vertexAttribIndex), Check(3)..GLdouble.const.p("v", vertexAttribBuffer))

    void("VertexAttrib4fvARB", "Pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLfloat.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4svARB", "Pointer version of #VertexAttrib4sARB().", GLuint("index", vertexAttribIndex), Check(4)..GLshort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4dvARB", "Pointer version of #VertexAttrib4dARB().", GLuint("index", vertexAttribIndex), Check(4)..GLdouble.const.p("v", vertexAttribBuffer))

    void("VertexAttrib4ivARB", "Integer pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLint.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4bvARB", "Byte pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLbyte.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4ubvARB", "Pointer version of #VertexAttrib4NubARB().", GLuint("index", vertexAttribIndex), Check(4)..GLubyte.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4usvARB", "Unsigned short pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLushort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4uivARB", "Unsigned int pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLuint.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4NbvARB", "Normalized byte pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLbyte.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4NsvARB", "Normalized short pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLshort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4NivARB", "Normalized int pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLint.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4NubvARB", "Normalized unsigned byte pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLubyte.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4NusvARB", "Normalized unsigned short pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLushort.const.p("v", vertexAttribBuffer))
    void("VertexAttrib4NuivARB", "Normalized unsigned int pointer version of #VertexAttrib4fARB().", GLuint("index", vertexAttribIndex), Check(4)..GLuint.const.p("v", vertexAttribBuffer))

    void(
        "VertexAttribPointerARB",
        "Specifies the location and organization of a vertex attribute array.",

        GLuint("index", vertexAttribIndex),
        GLint("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 #BGRA"),
        GLenum(
            "type",
            "the data type of each component in the array. The initial value is GL_FLOAT",
            """
            #BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #HALF_FLOAT #FLOAT
            #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV #FIXED
            """
        ),
        GLboolean("normalized", "whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed"),
        GLsizei(
            "stride",
            """
            the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
            the array. The initial value is 0.
            """
        ),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p(
            "pointer",
            """
            the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
            currently bound to the #ARRAY_BUFFER target. The initial value is 0.
            """
        )
    )

    void(
        "EnableVertexAttribArrayARB",
        "Enables a generic vertex attribute array.",

        GLuint("index", "the index of the generic vertex attribute to be enabled")
    )

    void(
        "DisableVertexAttribArrayARB",
        "Disables a generic vertex attribute array.",

        GLuint("index", "the index of the generic vertex attribute to be disabled")
    )

    void(
        "BindAttribLocationARB",
        "Associates a generic vertex attribute index with a named attribute variable.",

        GLhandleARB("programObj", "the handle of the program object in which the association is to be made"),
        GLuint("index", "the index of the generic vertex attribute to be bound"),
        GLcharASCII.const.p("name", "a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound")
    )

    void(
        "GetActiveAttribARB",
        "Returns information about an active attribute variable for the specified program object.",

        GLhandleARB("programObj", "the program object to be queried"),
        GLuint("index", "the index of the attribute variable to be queried"),
        AutoSize("name")..GLsizei("maxLength", "the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}"),
        Check(1)..nullable..GLsizei.p(
            "length",
            """
            the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than
            #NULL is passed
            """
        ),
        Check(1)..GLint.p("size", "the size of the attribute variable"),
        Check(1)..GLenum.p("type", "the data type of the attribute variable"),
        Return(
            "length",
            "ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB)"
        )..GLcharASCII.p("name", "a null terminated string containing the name of the attribute variable")
    )

    GLint(
        "GetAttribLocationARB",
        "Returns the location of an attribute variable.",

        GLhandleARB("programObj", "the program object to be queried"),
        GLcharASCII.const.p("name", "a null terminated string containing the name of the attribute variable whose location is to be queried")
    )

    void(
        "GetVertexAttribivARB",
        "Returns the integer value of a generic vertex attribute parameter.",

        GLuint("index", "the generic vertex attribute parameter to be queried"),
        GLenum(
            "pname",
            "the symbolic name of the vertex attribute parameter to be queried",
            "#VERTEX_ATTRIB_ARRAY_BUFFER_BINDING $VERTEX_ATTRIBUTES #VERTEX_ATTRIB_ARRAY_INTEGER #VERTEX_ATTRIB_ARRAY_DIVISOR"
        ),
        Check(1)..ReturnParam..GLint.p("params", "returns the requested data")
    )

    void(
        "GetVertexAttribfvARB",
        "Float version of #GetVertexAttribivARB().",

        GLuint("index", "the generic vertex attribute parameter to be queried"),
        GLenum("pname", "the symbolic name of the vertex attribute parameter to be queried"),
        Check(4)..GLfloat.p("params", "returns the requested data")
    )

    void(
        "GetVertexAttribdvARB",
        "Double version of #GetVertexAttribivARB().",

        GLuint("index", "the generic vertex attribute parameter to be queried"),
        GLenum("pname", "the symbolic name of the vertex attribute parameter to be queried"),
        Check(4)..GLdouble.p("params", "returns the requested data")
    )


    void(
        "GetVertexAttribPointervARB",
        "Returns the address of the specified generic vertex attribute pointer.",

        GLuint("index", "the generic vertex attribute parameter to be queried"),
        GLenum("pname", "the symbolic name of the generic vertex attribute parameter to be returned", "#VERTEX_ATTRIB_ARRAY_POINTER_ARB"),
        Check(1)..ReturnParam..void.p.p("pointer", "the pointer value")
    )
}