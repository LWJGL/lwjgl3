/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL20C = "GL20C".nativeClassGL("GL20C") {
    extends = GL15C
    documentation =
        """
        The OpenGL functionality of a forward compatible context, up to version 2.0.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "shader_objects"),
            "${registryLinkTo("ARB", "vertex_shader")} and ${registryLinkTo("ARB", "fragment_shader")}",
            registryLinkTo("ARB", "shading_language_100"),
            registryLinkTo("ARB", "draw_buffers"),
            registryLinkTo("ARB", "texture_non_power_of_two"),
            registryLinkTo("ARB", "point_sprite"),
            "${registryLinkTo("ATI", "separate_stencil")} and ${registryLinkTo("EXT", "stencil_two_side")}"
        )}
        """

    // ARB_shading_language_100

    IntConstant(
        "Accepted by the {@code name} parameter of GetString.",

        "SHADING_LANGUAGE_VERSION"..0x8B8C
    )

    // ARB_shader_objects

    IntConstant(
        "Accepted by the {@code pname} parameter of GetInteger.",

        "CURRENT_PROGRAM"..0x8B8D
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetShaderiv.",

        "SHADER_TYPE"..0x8B4F,
        "DELETE_STATUS"..0x8B80,
        "COMPILE_STATUS"..0x8B81,
        "LINK_STATUS"..0x8B82,
        "VALIDATE_STATUS"..0x8B83,
        "INFO_LOG_LENGTH"..0x8B84,
        "ATTACHED_SHADERS"..0x8B85,
        "ACTIVE_UNIFORMS"..0x8B86,
        "ACTIVE_UNIFORM_MAX_LENGTH"..0x8B87,
        "ACTIVE_ATTRIBUTES"..0x8B89,
        "ACTIVE_ATTRIBUTE_MAX_LENGTH"..0x8B8A,
        "SHADER_SOURCE_LENGTH"..0x8B88
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "FLOAT_VEC2"..0x8B50,
        "FLOAT_VEC3"..0x8B51,
        "FLOAT_VEC4"..0x8B52,
        "INT_VEC2"..0x8B53,
        "INT_VEC3"..0x8B54,
        "INT_VEC4"..0x8B55,
        "BOOL"..0x8B56,
        "BOOL_VEC2"..0x8B57,
        "BOOL_VEC3"..0x8B58,
        "BOOL_VEC4"..0x8B59,
        "FLOAT_MAT2"..0x8B5A,
        "FLOAT_MAT3"..0x8B5B,
        "FLOAT_MAT4"..0x8B5C,
        "SAMPLER_1D"..0x8B5D,
        "SAMPLER_2D"..0x8B5E,
        "SAMPLER_3D"..0x8B5F,
        "SAMPLER_CUBE"..0x8B60,
        "SAMPLER_1D_SHADOW"..0x8B61,
        "SAMPLER_2D_SHADOW"..0x8B62
    )

    GLuint("CreateProgram", "Creates a program object.")

    void(
        "DeleteProgram",
        "Deletes a program object.",

        GLuint.IN("program", "the program object to be deleted")
    )

    GLboolean(
        "IsProgram",
        """
        Returns #TRUE if {@code program} is the name of a program object. If {@code program} is zero, or a non-zero value that is not the name of a program
        object, IsProgram returns #FALSE. No error is generated if program is not a valid program object name.
        """,

        GLuint.IN("program", "the program object name to query")
    )

    GLuint(
        "CreateShader",
        "Creates a shader object.",

        GLenum.IN("type", "the type of shader to be created", SHADER_TYPES)
    )

    void(
        "DeleteShader",
        "Deletes a shader object.",

        GLuint.IN("shader", "the shader object to be deleted")
    )

    GLboolean(
        "IsShader",
        """
        Returns #TRUE if {@code shader} is the name of a shader object. If {@code shader} is zero, or a nonzero value that is not the name of a shader
        object, IsShader returns #FALSE. No error is generated if shader is not a valid shader object name.
        """,

        GLuint.IN("shader", "the shader object name to query")
    )

    void(
        "AttachShader",
        """
        Attaches a shader object to a program object.

        In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide
        this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the
        shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will
        be performed on program.

        All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to
        attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It
        is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to
        attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for
        deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.
        """,

        GLuint.IN("program", "the program object to which a shader object will be attached"),
        GLuint.IN("shader", "the shader object that is to be attached")
    )

    void(
        "DetachShader",
        "Detaches a shader object from a program object to which it is attached.",

        GLuint.IN("program", "the program object from which to detach the shader object"),
        GLuint.IN("shader", "the shader object to be detached")
    )

    void(
        "ShaderSource",
        """
        Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
        shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is #NULL, each string is
        assumed to be null terminated. If {@code length} is a value other than #NULL, it points to an array containing a string length for each of the
        corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
        counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
        parsed at this time; they are simply copied into the specified shader object.
        """,

        GLuint.IN("shader", "the shader object whose source code is to be replaced"),
        AutoSize("strings", "length")..GLsizei.IN("count", "the number of elements in the string and length arrays"),
        PointerArray(GLcharUTF8.p, "string", "length")..GLcharUTF8.const.p.p.IN(
            "strings",
            "an array of pointers to strings containing the source code to be loaded into the shader"
        ),
        nullable..GLint.const.p.IN("length", "an array of string lengths")
    )

    void(
        "CompileShader",
        "Compiles a shader object.",

        GLuint.IN("shader", "the shader object to be compiled")
    )

    void(
        "LinkProgram",
        "Links a program object.",

        GLuint.IN("program", "the program object to be linked")
    )

    void(
        "UseProgram",
        "Installs a program object as part of current rendering state.",

        GLuint.IN("program", "the program object whose executables are to be used as part of current rendering state")
    )

    void(
        "ValidateProgram",
        "Validates a program object.",

        GLuint.IN("program", "the program object to be validated")
    )

    // Uniform functions javadoc

    val uniformLocation = GLint.IN("location", "the location of the uniform variable to be modified")
    val uniformX = "the uniform x value"
    val uniformY = "the uniform y value"
    val uniformZ = "the uniform z value"
    val uniformW = "the uniform w value"

    void(
        "Uniform1f",
        "Specifies the value of a float uniform variable for the current program object.",

        uniformLocation,
        GLfloat.IN("v0", "the uniform value")
    )

    void(
        "Uniform2f",
        "Specifies the value of a vec2 uniform variable for the current program object.",

        uniformLocation,
        GLfloat.IN("v0", uniformX),
        GLfloat.IN("v1", uniformY)
    )

    void(
        "Uniform3f",
        "Specifies the value of a vec3 uniform variable for the current program object.",

        uniformLocation,
        GLfloat.IN("v0", uniformX),
        GLfloat.IN("v1", uniformY),
        GLfloat.IN("v2", uniformZ)
    )

    void(
        "Uniform4f",
        "Specifies the value of a vec4 uniform variable for the current program object.",

        uniformLocation,
        GLfloat.IN("v0", uniformX),
        GLfloat.IN("v1", uniformY),
        GLfloat.IN("v2", uniformZ),
        GLfloat.IN("v3", uniformW)
    )

    void(
        "Uniform1i",
        "Specifies the value of an int uniform variable for the current program object.",

        uniformLocation,
        GLint.IN("v0", "the uniform value")
    )

    void(
        "Uniform2i",
        "Specifies the value of an ivec2 uniform variable for the current program object.",

        uniformLocation,
        GLint.IN("v0", uniformX),
        GLint.IN("v1", uniformY)
    )

    void(
        "Uniform3i",
        "Specifies the value of an ivec3 uniform variable for the current program object.",

        uniformLocation,
        GLint.IN("v0", uniformX),
        GLint.IN("v1", uniformY),
        GLint.IN("v2", uniformZ)
    )

    void(
        "Uniform4i",
        "Specifies the value of an ivec4 uniform variable for the current program object.",

        uniformLocation,
        GLint.IN("v0", uniformX),
        GLint.IN("v1", uniformY),
        GLint.IN("v2", uniformZ),
        GLint.IN("v3", uniformW)
    )

    void(
        "Uniform1fv",
        "Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.",

        uniformLocation,
        AutoSize("value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform2fv",
        "Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(2, "value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform3fv",
        "Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(3, "value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform4fv",
        "Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(4, "value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform1iv",
        "Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.",

        uniformLocation,
        AutoSize("value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLint.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform2iv",
        "Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(2, "value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLint.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform3iv",
        "Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(3, "value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLint.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform4iv",
        "Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(4, "value")..GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLint.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix2fv",
        "Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(2 x 2, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix3fv",
        "Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(3 x 3, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "UniformMatrix4fv",
        "Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.",

        uniformLocation,
        AutoSize(4 x 4, "value")..GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
        GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
        GLfloat.const.p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "GetShaderiv",
        "Returns a parameter from a shader object.",

        GLuint.IN("shader", "the shader object to be queried"),
        GLenum.IN("pname", "the object parameter", "#SHADER_TYPE #DELETE_STATUS #COMPILE_STATUS #INFO_LOG_LENGTH #SHADER_SOURCE_LENGTH"),
        Check(1)..ReturnParam..GLint.p.OUT("params", "the requested object parameter")
    )

    void(
        "GetProgramiv",
        "Returns a parameter from a program object.",

        GLuint.IN("program", "the program object to be queried"),
        GLenum.IN(
            "pname",
            "the object parameter",
            """
            #DELETE_STATUS #LINK_STATUS #VALIDATE_STATUS #INFO_LOG_LENGTH #ATTACHED_SHADERS #ACTIVE_ATTRIBUTES #ACTIVE_ATTRIBUTE_MAX_LENGTH
            #ACTIVE_UNIFORMS #ACTIVE_UNIFORM_MAX_LENGTH #TRANSFORM_FEEDBACK_BUFFER_MODE #TRANSFORM_FEEDBACK_VARYINGS
            #TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH #ACTIVE_UNIFORM_BLOCKS #ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH
            #GEOMETRY_VERTICES_OUT #GEOMETRY_INPUT_TYPE #GEOMETRY_OUTPUT_TYPE #PROGRAM_BINARY_LENGTH
            #ACTIVE_ATOMIC_COUNTER_BUFFERS  #COMPUTE_WORK_GROUP_SIZE
            """
        ),
        Check(1)..ReturnParam..GLint.p.OUT("params", "the requested object parameter")
    )

    void(
        "GetShaderInfoLog",
        "Returns the information log for a shader object.",

        GLuint.IN("shader", "the shader object whose information log is to be queried"),
        AutoSize("infoLog")..GLsizei.IN("maxLength", "the size of the character buffer for storing the returned information log"),
        Check(1)..nullable..GLsizei.p.OUT("length", "the length of the string returned in {@code infoLog} (excluding the null terminator)"),
        Return(
            "length",
            "glGetShaderi(shader, GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p.OUT("infoLog", "an array of characters that is used to return the information log")
    )

    void(
        "GetProgramInfoLog",
        "Returns the information log for a program object.",

        GLuint.IN("program", "the program object whose information log is to be queried"),
        AutoSize("infoLog")..GLsizei.IN("maxLength", "the size of the character buffer for storing the returned information log"),
        Check(1)..nullable..GLsizei.p.OUT("length", "the length of the string returned in {@code infoLog} (excluding the null terminator)"),
        Return(
            "length",
            "glGetProgrami(program, GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p.OUT("infoLog", "an array of characters that is used to return the information log")
    )

    void(
        "GetAttachedShaders",
        "Returns the shader objects attached to a program object.",

        GLuint.IN("program", "the program object to be queried"),
        AutoSize("shaders")..GLsizei.IN("maxCount", "the size of the array for storing the returned object names"),
        Check(1)..nullable..GLsizei.p.IN("count", "the number of names actually returned in {@code shaders}"),
        GLuint.p.OUT("shaders", "an array that is used to return the names of attached shader objects")
    )

    GLint(
        "GetUniformLocation",
        "Returns the location of a uniform variable.",

        GLuint.IN("program", "the program object to be queried"),
        GLcharASCII.const.p.IN("name", "a null terminated string containing the name of the uniform variable whose location is to be queried")
    )

    void(
        "GetActiveUniform",
        "Returns information about an active uniform variable for the specified program object.",

        GLuint.IN("program", "the program object to be queried"),
        GLuint.IN("index", "the index of the uniform variable to be queried"),
        AutoSize("name")..GLsizei.IN("maxLength", "the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}"),
        Check(1)..nullable..GLsizei.p.IN("length", "the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed"),
        Check(1)..GLint.p.OUT("size", "the size of the uniform variable"),
        Check(1)..GLenum.p.OUT("type", "the data type of the uniform variable"),
        Return(
            "length",
            "glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH)"
        )..GLcharASCII.p.OUT("name", "a null terminated string containing the name of the uniform variable")
    )

    void(
        "GetUniformfv",
        "Returns the float value(s) of a uniform variable.",

        GLuint.IN("program", "the program object to be queried"),
        GLint.IN("location", "the location of the uniform variable to be queried"),
        Check(1)..ReturnParam..GLfloat.p.OUT("params", "the value of the specified uniform variable")
    )

    void(
        "GetUniformiv",
        "Returns the int value(s) of a uniform variable.",

        GLuint.IN("program", "the program object to be queried"),
        GLint.IN("location", "the location of the uniform variable to be queried"),
        Check(1)..ReturnParam..GLint.p.OUT("params", "the value of the specified uniform variable")
    )

    void(
        "GetShaderSource",
        "Returns the source code string from a shader object.",

        GLuint.IN("shader", "the shader object to be queried"),
        AutoSize("source")..GLsizei.IN("maxLength", "the size of the character buffer for storing the returned source code string"),
        Check(1)..nullable..GLsizei.p.IN("length", "the length of the string returned in source (excluding the null terminator)"),
        Return(
            "length",
            "glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p.OUT("source", "an array of characters that is used to return the source code string")
    )

    // ARB_vertex_shader

    IntConstant(
        "Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "VERTEX_SHADER"..0x8B31
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_UNIFORM_COMPONENTS"..0x8B4A,
        "MAX_VARYING_FLOATS"..0x8B4B,
        "MAX_VERTEX_ATTRIBS"..0x8869,
        "MAX_TEXTURE_IMAGE_UNITS"..0x8872,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS"..0x8B4C,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS"..0x8B4D
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "VERTEX_PROGRAM_POINT_SIZE"..0x8642
    )

    val VERTEX_ATTRIBUTES = IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}v.",

        "VERTEX_ATTRIB_ARRAY_ENABLED"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED"..0x886A,
        "CURRENT_VERTEX_ATTRIB"..0x8626
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttribPointerv.",

        "VERTEX_ATTRIB_ARRAY_POINTER"..0x8645
    )

    // Vertex attrib functions javadoc
    val vertexAttribIndex = "the index of the generic vertex attribute to be modified"
    val vertexAttribX = "the vertex attribute x component"
    val vertexAttribY = "the vertex attribute y component"
    val vertexAttribZ = "the vertex attribute z component"
    val vertexAttribW = "the vertex attribute w component"
    val vertexAttribBuffer = "the vertex attribute buffer"

    void(
        "VertexAttrib1f",
        "Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.",

        GLuint.IN("index", vertexAttribIndex),
        GLfloat.IN("v0", vertexAttribX)
    )

    void("VertexAttrib1s", "Short version of #VertexAttrib1f().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX))
    void("VertexAttrib1d", "Double version of #VertexAttrib1f().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX))

    void(
        "VertexAttrib2f",
        "Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.",

        GLuint.IN("index", vertexAttribIndex),
        GLfloat.IN("v0", vertexAttribX),
        GLfloat.IN("v1", vertexAttribY)
    )

    void("VertexAttrib2s", "Short version of #VertexAttrib2f().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY))
    void("VertexAttrib2d", "Double version of #VertexAttrib2f().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY))

    void(
        "VertexAttrib3f",
        "Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.",

        GLuint.IN("index", vertexAttribIndex),
        GLfloat.IN("v0", vertexAttribX),
        GLfloat.IN("v1", vertexAttribY),
        GLfloat.IN("v2", vertexAttribZ)
    )

    void("VertexAttrib3s", "Short version of #VertexAttrib3f().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY), GLshort.IN("v2", vertexAttribZ))
    void("VertexAttrib3d", "Double version of #VertexAttrib3f().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY), GLdouble.IN("v2", vertexAttribZ))

    void(
        "VertexAttrib4f",
        "Specifies the value of a generic vertex attribute.",

        GLuint.IN("index", vertexAttribIndex),
        GLfloat.IN("v0", vertexAttribX),
        GLfloat.IN("v1", vertexAttribY),
        GLfloat.IN("v2", vertexAttribZ),
        GLfloat.IN("v3", vertexAttribW)
    )

    void("VertexAttrib4s", "Short version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY), GLshort.IN("v2", vertexAttribZ), GLshort.IN("v3", vertexAttribW))
    void("VertexAttrib4d", "Double version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY), GLdouble.IN("v2", vertexAttribZ), GLdouble.IN("v3", vertexAttribW))
    void("VertexAttrib4Nub", "Normalized unsigned byte version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), GLubyte.IN("x", vertexAttribX), GLubyte.IN("y", vertexAttribY), GLubyte.IN("z", vertexAttribZ), GLubyte.IN("w", vertexAttribW))

    void("VertexAttrib1fv", "Pointer version of #VertexAttrib1f().", GLuint.IN("index", vertexAttribIndex), Check(1)..GLfloat.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib1sv", "Pointer version of #VertexAttrib1s().", GLuint.IN("index", vertexAttribIndex), Check(1)..GLshort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib1dv", "Pointer version of #VertexAttrib1d().", GLuint.IN("index", vertexAttribIndex), Check(1)..GLdouble.const.p.IN("v", vertexAttribBuffer))

    void("VertexAttrib2fv", "Pointer version of #VertexAttrib2f().", GLuint.IN("index", vertexAttribIndex), Check(2)..GLfloat.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib2sv", "Pointer version of #VertexAttrib2s().", GLuint.IN("index", vertexAttribIndex), Check(2)..GLshort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib2dv", "Pointer version of #VertexAttrib2d().", GLuint.IN("index", vertexAttribIndex), Check(2)..GLdouble.const.p.IN("v", vertexAttribBuffer))

    void("VertexAttrib3fv", "Pointer version of #VertexAttrib3f().", GLuint.IN("index", vertexAttribIndex), Check(3)..GLfloat.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib3sv", "Pointer version of #VertexAttrib3s().", GLuint.IN("index", vertexAttribIndex), Check(3)..GLshort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib3dv", "Pointer version of #VertexAttrib3d().", GLuint.IN("index", vertexAttribIndex), Check(3)..GLdouble.const.p.IN("v", vertexAttribBuffer))

    void("VertexAttrib4fv", "Pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLfloat.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4sv", "Pointer version of #VertexAttrib4s().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLshort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4dv", "Pointer version of #VertexAttrib4d().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLdouble.const.p.IN("v", vertexAttribBuffer))

    void("VertexAttrib4iv", "Integer pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLint.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4bv", "Byte pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLbyte.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4ubv", "Pointer version of #VertexAttrib4Nub().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLubyte.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4usv", "Unsigned short pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLushort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4uiv", "Unsigned int pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLuint.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4Nbv", "Normalized byte pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLbyte.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4Nsv", "Normalized short pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLshort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4Niv", "Normalized int pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLint.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4Nubv", "Normalized unsigned byte pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLubyte.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4Nusv", "Normalized unsigned short pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLushort.const.p.IN("v", vertexAttribBuffer))
    void("VertexAttrib4Nuiv", "Normalized unsigned int pointer version of #VertexAttrib4f().", GLuint.IN("index", vertexAttribIndex), Check(4)..GLuint.const.p.IN("v", vertexAttribBuffer))

    OffHeapOnly..void(
        "VertexAttribPointer",
        "Specifies the location and organization of a vertex attribute array.",

        GLuint.IN("index", vertexAttribIndex),
        GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 #BGRA"),
        GLenum.IN(
            "type",
            "the data type of each component in the array. The initial value is GL_FLOAT",
            """
            #BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #HALF_FLOAT #FLOAT
            #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV #FIXED
            """
        ),
        GLboolean.IN("normalized", "whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed"),
        GLsizei.IN(
            "stride",
            """
            the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
            the array. The initial value is 0.
            """
        ),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN(
            "pointer",
            """
            the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
            currently bound to the #ARRAY_BUFFER target. The initial value is 0.
            """
        )
    )

    void(
        "EnableVertexAttribArray",
        "Enables a generic vertex attribute array.",

        GLuint.IN("index", "the index of the generic vertex attribute to be enabled")
    )

    void(
        "DisableVertexAttribArray",
        "Disables a generic vertex attribute array.",

        GLuint.IN("index", "the index of the generic vertex attribute to be disabled")
    )

    void(
        "BindAttribLocation",
        "Associates a generic vertex attribute index with a named attribute variable.",

        GLuint.IN("program", "the program object in which the association is to be made"),
        GLuint.IN("index", "the index of the generic vertex attribute to be bound"),
        GLcharASCII.const.p.IN("name", "a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound")
    )

    void(
        "GetActiveAttrib",
        "Returns information about an active attribute variable for the specified program object.",

        GLuint.IN("program", "the program object to be queried"),
        GLuint.IN("index", "the index of the attribute variable to be queried"),
        AutoSize("name")..GLsizei.IN("maxLength", "the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}"),
        Check(1)..nullable..GLsizei.p.OUT(
            "length",
            """
            the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than
            #NULL is passed
            """
        ),
        Check(1)..GLint.p.OUT("size", "the size of the attribute variable"),
        Check(1)..GLenum.p.OUT("type", "the data type of the attribute variable"),
        Return(
            "length",
            "glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH)"
        )..GLcharASCII.p.OUT("name", "a null terminated string containing the name of the attribute variable")
    )

    GLint(
        "GetAttribLocation",
        "Returns the location of an attribute variable.",

        GLuint.IN("program", "the program object to be queried"),
        GLcharASCII.const.p.IN("name", "a null terminated string containing the name of the attribute variable whose location is to be queried")
    )

    void(
        "GetVertexAttribiv",
        "Returns the integer value of a generic vertex attribute parameter.",

        GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
        GLenum.IN(
            "pname",
            "the symbolic name of the vertex attribute parameter to be queried",
            "#VERTEX_ATTRIB_ARRAY_BUFFER_BINDING $VERTEX_ATTRIBUTES #VERTEX_ATTRIB_ARRAY_INTEGER #VERTEX_ATTRIB_ARRAY_DIVISOR"
        ),
        Check(1)..ReturnParam..GLint.p.OUT("params", "returns the requested data")
    )

    void(
        "GetVertexAttribfv",
        "Float version of #GetVertexAttribiv().",

        GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
        GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
        Check(4)..GLfloat.p.OUT("params", "returns the requested data")
    )

    void(
        "GetVertexAttribdv",
        "Double version of #GetVertexAttribiv().",

        GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
        GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
        Check(4)..GLdouble.p.OUT("params", "returns the requested data")
    )


    void(
        "GetVertexAttribPointerv",
        "Returns the address of the specified generic vertex attribute pointer.",

        GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
        GLenum.IN("pname", "the symbolic name of the generic vertex attribute parameter to be returned", "#VERTEX_ATTRIB_ARRAY_POINTER"),
        Check(1)..ReturnParam..void.p.p.OUT("pointer", "the pointer value")
    )

    // ARB_fragment_shader

    IntConstant(
        "Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "FRAGMENT_SHADER"..0x8B30
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_FRAGMENT_UNIFORM_COMPONENTS"..0x8B49
    )

    IntConstant(
        "Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FRAGMENT_SHADER_DERIVATIVE_HINT"..0x8B8B
    )

    // ARB_draw_buffers

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_DRAW_BUFFERS"..0x8824,
        "DRAW_BUFFER0"..0x8825,
        "DRAW_BUFFER1"..0x8826,
        "DRAW_BUFFER2"..0x8827,
        "DRAW_BUFFER3"..0x8828,
        "DRAW_BUFFER4"..0x8829,
        "DRAW_BUFFER5"..0x882A,
        "DRAW_BUFFER6"..0x882B,
        "DRAW_BUFFER7"..0x882C,
        "DRAW_BUFFER8"..0x882D,
        "DRAW_BUFFER9"..0x882E,
        "DRAW_BUFFER10"..0x882F,
        "DRAW_BUFFER11"..0x8830,
        "DRAW_BUFFER12"..0x8831,
        "DRAW_BUFFER13"..0x8832,
        "DRAW_BUFFER14"..0x8833,
        "DRAW_BUFFER15"..0x8834
    )

    void(
        "DrawBuffers",
        "Specifies a list of color buffers to be drawn into.",

        AutoSize("bufs")..GLsizei.IN("n", "the number of buffers in {@code bufs}"),
        SingleValue("buf")..GLenum.const.p.IN(
            "bufs",
            "an array of symbolic constants specifying the buffers into which fragment colors or data values will be written",
            "#NONE #FRONT_LEFT #FRONT_RIGHT #BACK_LEFT #BACK_RIGHT #COLOR_ATTACHMENT0 GL30.GL_COLOR_ATTACHMENT[1-15]"
        )
    )

    // ARB_point_sprite

    IntConstant(
        "Accepted by the {@code pname} parameter of PointParameter{if}v.",

        "POINT_SPRITE_COORD_ORIGIN"..0x8CA0
    )

    IntConstant(
        "Accepted by the {@code param} parameter of PointParameter{if}v.",

        "LOWER_LEFT"..0x8CA1,
        "UPPER_LEFT"..0x8CA2
    )

    // EXT_blend_equation_separate

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_EQUATION_RGB"..0x8009,
        "BLEND_EQUATION_ALPHA"..0x883D
    )

    void(
        "BlendEquationSeparate",
        "Sets the RGB blend equation and the alpha blend equation separately.",

        GLenum.IN(
            "modeRGB",
            "the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined",
            "#FUNC_ADD #FUNC_SUBTRACT #FUNC_REVERSE_SUBTRACT #MIN #MAX"
        ),
        GLenum.IN("modeAlpha", "the alpha blend equation, how the alpha component of the source and destination colors are combined")
    )

    // ATI_separate_stencil

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "STENCIL_BACK_FUNC"..0x8800,
        "STENCIL_BACK_FAIL"..0x8801,
        "STENCIL_BACK_PASS_DEPTH_FAIL"..0x8802,
        "STENCIL_BACK_PASS_DEPTH_PASS"..0x8803,
        "STENCIL_BACK_REF"..0x8CA3,
        "STENCIL_BACK_VALUE_MASK"..0x8CA4,
        "STENCIL_BACK_WRITEMASK"..0x8CA5
    )

    void(
        "StencilOpSeparate",
        "Sets front and/or back stencil test actions.",

        GLenum.IN("face", "whether front and/or back stencil state is updated", "#FRONT #BACK #FRONT_AND_BACK"),
        GLenum.IN(
            "sfail",
            "the action to take when the stencil test fails. The initial value is GL_KEEP",
            "#KEEP #ZERO #REPLACE #INCR #INCR_WRAP #DECR #DECR_WRAP #INVERT"
        ),
        GLenum.IN("dpfail", "the stencil action when the stencil test passes, but the depth test fails. The initial value is GL_KEEP"),
        GLenum.IN(
            "dppass",
            """
            the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth
            testing is not enabled. The initial value is GL_KEEP
            """
        )
    )

    void(
        "StencilFuncSeparate",
        "Sets front and/or back function and reference value for stencil testing.",

        GLenum.IN("face", "whether front and/or back stencil state is updated", "#FRONT #BACK #FRONT_AND_BACK"),
        GLenum.IN(
            "func",
            "the test function. The initial value is GL_ALWAYS",
            "#NEVER #LESS #LEQUAL #GREATER #GEQUAL #EQUAL #NOTEQUAL #ALWAYS"
        ),
        GLint.IN(
            "ref",
            """
            the reference value for the stencil test. {@code ref} is clamped to the range [0, 2n &ndash; 1], where {@code n} is the number of bitplanes in the stencil
            buffer. The initial value is 0.
            """
        ),
        GLuint.IN("mask", "a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.")
    )

    void(
        "StencilMaskSeparate",
        "Controls the front and/or back writing of individual bits in the stencil planes.",

        GLenum.IN("face", "whether front and/or back stencil writemask is updated", "#FRONT #BACK #FRONT_AND_BACK"),
        GLuint.IN("mask", "a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.")
    )
}