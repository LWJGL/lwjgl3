/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shader_objects = "ARBShaderObjects".nativeClassGL("ARB_shader_objects", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds API calls that are necessary to manage shader objects and program objects as defined in the OpenGL 2.0 white papers by 3Dlabs.

        The generation of an executable that runs on one of OpenGL's programmable units is modeled to that of developing a typical C/C++ application. There are
        one or more source files, each of which are stored by OpenGL in a shader object. Each shader object (source file) needs to be compiled and attached to a
        program object. Once all shader objects are compiled successfully, the program object needs to be linked to produce an executable. This executable is
        part of the program object, and can now be loaded onto the programmable units to make it part of the current OpenGL state. Both the compile and link
        stages generate a text string that can be queried to get more information. This information could be, but is not limited to, compile errors, link errors,
        optimization hints, etc. Values for uniform variables, declared in a shader, can be set by the application and used to control a shader's behavior.

        This extension defines functions for creating shader objects and program objects, for compiling shader objects, for linking program objects, for
        attaching shader objects to program objects, and for using a program object as part of current state. Functions to load uniform values are also defined.
        Some house keeping functions, like deleting an object and querying object state, are also provided.

        Although this extension defines the API for creating shader objects, it does not define any specific types of shader objects. It is assumed that this
        extension will be implemented along with at least one such additional extension for creating a specific type of OpenGL 2.0 shader (e.g., the
        ${ARB_fragment_shader.link} extension or the ${ARB_vertex_shader.link} extension).

        ${GL20.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} argument of GetHandleARB.",

        "PROGRAM_OBJECT_ARB"..0x8B40
    )

    val Parameters = IntConstant(
        "Accepted by the {@code pname} parameter of GetObjectParameter{fi}vARB.",

        "OBJECT_TYPE_ARB"..0x8B4E,
        "OBJECT_SUBTYPE_ARB"..0x8B4F,
        "OBJECT_DELETE_STATUS_ARB"..0x8B80,
        "OBJECT_COMPILE_STATUS_ARB"..0x8B81,
        "OBJECT_LINK_STATUS_ARB"..0x8B82,
        "OBJECT_VALIDATE_STATUS_ARB"..0x8B83,
        "OBJECT_INFO_LOG_LENGTH_ARB"..0x8B84,
        "OBJECT_ATTACHED_OBJECTS_ARB"..0x8B85,
        "OBJECT_ACTIVE_UNIFORMS_ARB"..0x8B86,
        "OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB"..0x8B87,
        "OBJECT_SHADER_SOURCE_LENGTH_ARB"..0x8B88
    ).javaDocLinks

    IntConstant(
        "Returned by the {@code params} parameter of GetObjectParameter{fi}vARB.",

        "SHADER_OBJECT_ARB"..0x8B48
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniformARB.",

        "FLOAT_VEC2_ARB"..0x8B50,
        "FLOAT_VEC3_ARB"..0x8B51,
        "FLOAT_VEC4_ARB"..0x8B52,
        "INT_VEC2_ARB"..0x8B53,
        "INT_VEC3_ARB"..0x8B54,
        "INT_VEC4_ARB"..0x8B55,
        "BOOL_ARB"..0x8B56,
        "BOOL_VEC2_ARB"..0x8B57,
        "BOOL_VEC3_ARB"..0x8B58,
        "BOOL_VEC4_ARB"..0x8B59,
        "FLOAT_MAT2_ARB"..0x8B5A,
        "FLOAT_MAT3_ARB"..0x8B5B,
        "FLOAT_MAT4_ARB"..0x8B5C,
        "SAMPLER_1D_ARB"..0x8B5D,
        "SAMPLER_2D_ARB"..0x8B5E,
        "SAMPLER_3D_ARB"..0x8B5F,
        "SAMPLER_CUBE_ARB"..0x8B60,
        "SAMPLER_1D_SHADOW_ARB"..0x8B61,
        "SAMPLER_2D_SHADOW_ARB"..0x8B62,
        "SAMPLER_2D_RECT_ARB"..0x8B63,
        "SAMPLER_2D_RECT_SHADOW_ARB"..0x8B64
    )

    void(
        "DeleteObjectARB",
        """
        Either deletes the object, or flags it for deletion. An object that is attached to a container object is not deleted until it is no longer attached to
        any container object, for any context. If it is still attached to at least one container object, the object is flagged for deletion. If the object is
        part of the current rendering state, it is not deleted until it is no longer part of the current rendering state for any context. If the object is still
        part of the rendering state of at least one context, it is flagged for deletion.

        If an object is flagged for deletion, its Boolean status bit #OBJECT_DELETE_STATUS_ARB is set to true.

        DeleteObjectARB will silently ignore the value zero.

        When a container object is deleted, it will detach each attached object as part of the deletion process. When an object is deleted, all information for
        the object referenced is lost. The data for the object is also deleted.
        """,

        GLhandleARB.IN("obj", "the shader object to delete")
    )

    GLhandleARB(
        "GetHandleARB",
        "Returns the handle to an object that is in use as part of current state.",

        GLenum.IN("pname", "the state item for which the current object is to be returned", "#PROGRAM_OBJECT_ARB")
    )

    void(
        "DetachObjectARB",
        "Detaches an object from the container object it is attached to.",

        GLhandleARB.IN("containerObj", "the container object"),
        GLhandleARB.IN("attachedObj", "the object to detach")
    )

    GLhandleARB(
        "CreateShaderObjectARB",
        "Creates a shader object.",

        GLenum.IN("shaderType", "the type of the shader object to be created", "#VERTEX_SHADER_ARB #FRAGMENT_SHADER_ARB")
    )

    void(
        "ShaderSourceARB",
        """
        Sets the source code for the specified shader object {@code shaderObj} to the text strings in the {@code string} array. If the object previously had
        source code loaded into it, it is completely replaced.

        The strings that are loaded into a shader object are expected to form the source code for a valid shader as defined in the OpenGL Shading Language
        Specification.
        """,

        GLhandleARB.IN("shaderObj", "the shader object"),
        AutoSize("string", "length")..GLsizei.IN("count", "the number of strings in the array"),
        PointerArray(GLcharARB_p, "string", "length")..const..GLcharARB_pp.IN("string", "an array of pointers to one or more, optionally null terminated, character strings that make up the source code"),
        nullable..const..GLint_p.IN(
            "length",
            """
            an array with the number of charARBs in each string (the string length). Each element in this array can be set to negative one (or smaller),
            indicating that its accompanying string is null terminated. If {@code length} is set to #NULL, all strings in the {@code string} argument are
            considered null terminated.
            """
        )
    )

    void(
        "CompileShaderARB",
        """
        Compiles a shader object. Each shader object has a Boolean status, #OBJECT_COMPILE_STATUS_ARB, that is modified as a result of compilation. This status
        can be queried with #GetObjectParameterivARB(). This status will be set to #TRUE if the shader {@code shaderObj} was compiled without errors and is
        ready for use, and #FALSE otherwise. Compilation can fail for a variety of reasons as listed in the OpenGL Shading Language Specification. If
        CompileShaderARB failed, any information about a previous compile is lost and is not restored. Thus a failed compile does not restore the old state of
        {@code shaderObj}. If {@code shaderObj} does not reference a shader object, the error #INVALID_OPERATION is generated.

        Note that changing the source code of a shader object, through ShaderSourceARB, does not change its compile status #OBJECT_COMPILE_STATUS_ARB.

        Each shader object has an information log that is modified as a result of compilation. This information log can be queried with #GetInfoLogARB() to
        obtain more information about the compilation attempt.
        """,

        GLhandleARB.IN("shaderObj", "the shader object to compile")
    )

    GLhandleARB(
        "CreateProgramObjectARB",
        """
        Creates a program object.

        A program object is a container object. Shader objects are attached to a program object with the command AttachObjectARB. It is permissible to attach
        shader objects to program objects before source code has been loaded into the shader object, or before the shader object has been compiled. It is
        permissible to attach multiple shader objects of the same type to a single program object, and it is permissible to attach a shader object to more than
        one program object.
        """
    )

    void(
        "AttachObjectARB",
        "Attaches an object to a container object.",

        GLhandleARB.IN("containerObj", "the container object"),
        GLhandleARB.IN("obj", "the object to attach")
    )

    void(
        "LinkProgramARB",
        """
        Links a program object.

        Each program object has a Boolean status, #OBJECT_LINK_STATUS_ARB, that is modified as a result of linking. This status can be queried with
        #GetObjectParameterivARB(). This status will be set to #TRUE if a valid executable is created, and #FALSE otherwise. Linking can fail for a
        variety of reasons as specified in the OpenGL Shading Language Specification. Linking will also fail if one or more of the shader objects, attached to
        {@code programObj}, are not compiled successfully, or if more active uniform or active sampler variables are used in {@code programObj} than allowed.
        If LinkProgramARB failed, any information about a previous link is lost and is not restored. Thus a failed link does not restore the old state of
        {@code programObj}. If {@code programObj} is not of type #PROGRAM_OBJECT_ARB, the error #INVALID_OPERATION is generated.

        Each program object has an information log that is modified as a result of a link operation. This information log can be queried with #GetInfoLogARB()
        to obtain more information about the link operation.
        """,

        GLhandleARB.IN("programObj", "the program object to link")
    )

    void(
        "UseProgramObjectARB",
        """
        Installs the executable code as part of current rendering state if the program object {@code programObj} contains valid executable code, i.e. has been
        linked successfully. If UseProgramObjectARB is called with the handle set to 0, it is as if the GL had no programmable stages and the fixed
        functionality paths will be used instead. If {@code programObj} cannot be made part of the current rendering state, an #INVALID_OPERATION error will
        be generated and the current rendering state left unmodified. This error will be set, for example, if {@code programObj} has not been linked
        successfully. If {@code programObj} is not of type #PROGRAM_OBJECT_ARB, the error #INVALID_OPERATION is generated.

        While a program object is in use, applications are free to modify attached shader objects, compile attached shader objects, attach additional shader
        objects, and detach shader objects. This does not affect the link status #OBJECT_LINK_STATUS_ARB of the program object. This does not affect the
        executable code that is part of the current state either. That executable code is only affected when the program object has been re-linked successfully.
        After such a successful re-link, the #LinkProgramARB() command will install the generated executable code as part of the current rendering state if the
        specified program object was already in use as a result of a previous call to UseProgramObjectARB. If this re-link failed, then the executable code part
        of the current state does not change.
        """,

        GLhandleARB.IN("programObj", "the program object to use")
    )

    void(
        "ValidateProgramARB",
        """
        Validates the program object {@code programObj} against the GL state at that moment. Each program object has a Boolean status,
        #OBJECT_VALIDATE_STATUS_ARB, that is modified as a result of validation. This status can be queried with #GetObjectParameterivARB(). If validation
        succeeded this status will be set to #TRUE, otherwise it will be set to #FALSE. If validation succeeded the program object is guaranteed to
        execute, given the current GL state. If validation failed, the program object is guaranteed to not execute, given the current GL state. If
        {@code programObj} is not of type #PROGRAM_OBJECT_ARB, the error #INVALID_OPERATION is generated.

        ValidateProgramARB will validate at least as much as is done when a rendering command is issued, and it could validate more. For example, it could give
        a hint on how to optimize some piece of shader code.

        ValidateProgramARB will store its information in the info log. This information will either be an empty string or it will contain validation information.

        ValidateProgramARB is typically only useful during application development. An application should not expect different OpenGL implementations to produce
        identical information.
        """,

        GLhandleARB.IN("programObj", "the program object to validate")
    )

    val uniformLocation = GLint.IN("location", "the uniform variable location")
    val uniformX = "the uniform x value"
    val uniformY = "the uniform y value"
    val uniformZ = "the uniform z value"
    val uniformW = "the uniform w value"

    void(
        "Uniform1fARB",
        "float version of #Uniform4fARB().",

        uniformLocation,
        GLfloat.IN("v0", uniformX)
    )

    void(
        "Uniform2fARB",
        "vec2 version of #Uniform4fARB().",

        uniformLocation,
        GLfloat.IN("v0", uniformX),
        GLfloat.IN("v1", uniformY)
    )

    void(
        "Uniform3fARB",
        "vec3 version of #Uniform4fARB().",

        uniformLocation,
        GLfloat.IN("v0", uniformX),
        GLfloat.IN("v1", uniformY),
        GLfloat.IN("v2", uniformZ)
    )

    void(
        "Uniform4fARB",
        "Loads a vec4 value into a uniform variable of the program object that is currently in use.",

        GLint.IN("location", "the uniform variable location"),
        GLfloat.IN("v0", uniformX),
        GLfloat.IN("v1", uniformY),
        GLfloat.IN("v2", uniformZ),
        GLfloat.IN("v3", uniformW)
    )

    void(
        "Uniform1iARB",
        "int version of #Uniform1fARB().",

        uniformLocation,
        GLint.IN("v0", uniformX)
    )

    void(
        "Uniform2iARB",
        "ivec2 version of #Uniform2fARB().",

        uniformLocation,
        GLint.IN("v0", uniformX),
        GLint.IN("v1", uniformY)
    )

    void(
        "Uniform3iARB",
        "ivec3 version of #Uniform3fARB().",

        uniformLocation,
        GLint.IN("v0", uniformX),
        GLint.IN("v1", uniformY),
        GLint.IN("v2", uniformZ)
    )

    void(
        "Uniform4iARB",
        "ivec4 version of #Uniform4fARB().",

        uniformLocation,
        GLint.IN("v0", uniformX),
        GLint.IN("v1", uniformY),
        GLint.IN("v2", uniformZ),
        GLint.IN("v3", uniformW)
    )

    void(
        "Uniform1fvARB",
        "Loads floating-point values {@code count} times into a uniform location defined as an array of float values.",

        uniformLocation,
        AutoSize("value")..GLsizei.IN("count", "the number of float values to load"),
        const..GLfloat_p.IN("value", "the values to load")
    )

    void(
        "Uniform2fvARB",
        "Loads floating-point values {@code count} times into a uniform location defined as an array of vec2 vectors.",

        uniformLocation,
        AutoSize(2, "value")..GLsizei.IN("count", "the number of vec2 vectors to load"),
        const..GLfloat_p.IN("value", "the values to load")
    )

    void(
        "Uniform3fvARB",
        "Loads floating-point values {@code count} times into a uniform location defined as an array of vec3 vectors.",

        uniformLocation,
        AutoSize(3, "value")..GLsizei.IN("count", "the number of vec3 vectors to load"),
        const..GLfloat_p.IN("value", "the values to load")
    )

    void(
        "Uniform4fvARB",
        "Loads floating-point values {@code count} times into a uniform location defined as an array of vec4 vectors.",

        uniformLocation,
        AutoSize(4, "value")..GLsizei.IN("count", "the number of vec4 vectors to load"),
        const..GLfloat_p.IN("value", "the values to load")
    )

    void(
        "Uniform1ivARB",
        "Loads integer values {@code count} times into a uniform location defined as an array of integer values.",

        uniformLocation,
        AutoSize("value")..GLsizei.IN("count", "the number of integer values to load"),
        const..GLint_p.IN("value", "the values to load")
    )

    void(
        "Uniform2ivARB",
        "Loads integer values {@code count} times into a uniform location defined as an array of ivec2 vectors.",

        uniformLocation,
        AutoSize(2, "value")..GLsizei.IN("count", "the number of ivec2 vectors to load"),
        const..GLint_p.IN("value", "the values to load")
    )

    void(
        "Uniform3ivARB",
        "Loads integer values {@code count} times into a uniform location defined as an array of ivec3 vectors.",

        uniformLocation,
        AutoSize(3, "value")..GLsizei.IN("count", "the number of ivec3 vectors to load"),
        const..GLint_p.IN("value", "the values to load")
    )

    void(
        "Uniform4ivARB",
        "Loads integer values {@code count} times into a uniform location defined as an array of ivec4 vectors.",

        uniformLocation,
        AutoSize(4, "value")..GLsizei.IN("count", "the number of ivec4 vectors to load"),
        const..GLint_p.IN("value", "the values to load")
    )

    val transpose = GLboolean.IN("transpose", "if #FALSE, the matrix is specified in column major order, otherwise in row major order")

    void(
        "UniformMatrix2fvARB",
        "Loads a 2x2 matrix of floating-point values {@code count} times into a uniform location defined as a matrix or an array of matrices.",

        uniformLocation,
        AutoSize(2 x 2, "value")..GLsizei.IN("count", "the number of 2x2 matrices to load"),
        transpose,
        const..GLfloat_p.IN("value", "the matrix values to load")
    )

    void(
        "UniformMatrix3fvARB",
        "Loads a 3x3 matrix of floating-point values {@code count} times into a uniform location defined as a matrix or an array of matrices.",

        uniformLocation,
        AutoSize(3 x 3, "value")..GLsizei.IN("count", "the number of 3x3 matrices to load"),
        transpose,
        const..GLfloat_p.IN("value", "the matrix values to load")
    )

    void(
        "UniformMatrix4fvARB",
        "Loads a 4x4 matrix of floating-point values {@code count} times into a uniform location defined as a matrix or an array of matrices.",

        uniformLocation,
        AutoSize(4 x 4, "value")..GLsizei.IN("count", "the number of 4x4 matrices to load"),
        transpose,
        const..GLfloat_p.IN("value", "the matrix values to load")
    )

    void(
        "GetObjectParameterfvARB",
        "Returns object specific parameter values.",

        GLhandleARB.IN("obj", "the object to query"),
        GLenum.IN("pname", "the parameter to query"),
        Check(1)..GLfloat_p.OUT("params", "a buffer in which to return the parameter value")
    )

    void(
        "GetObjectParameterivARB",
        "Returns object specific parameter values.",

        GLhandleARB.IN("obj", "the object to query"),
        GLenum.IN("pname", "the parameter to query", Parameters),
        Check(1)..ReturnParam..GLint_p.OUT("params", "a buffer in which to return the parameter value")
    )

    void(
        "GetInfoLogARB",
        """
        A string that contains information about the last link or validation attempt and last compilation attempt are kept per program or shader object. This
        string is called the info log and can be obtained with this command.

        This string will be null terminated. The number of characters in the info log is given by #OBJECT_INFO_LOG_LENGTH_ARB, which can be queried with
        #GetObjectParameterivARB(). If {@code obj} is a shader object, the returned info log will either be an empty string or it will contain
        information about the last compilation attempt for that object. If {@code obj} is a program object, the returned info log will either be an empty string
        or it will contain information about the last link attempt or last validation attempt for that object. If {@code obj} is not of type #PROGRAM_OBJECT_ARB
        or #SHADER_OBJECT_ARB, the error #INVALID_OPERATION is generated. If an error occurred, the return parameters {@code length} and {@code infoLog}
        will be unmodified.

        The info log is typically only useful during application development and an application should not expect different OpenGL implementations to produce
        identical info logs.
        """,

        GLhandleARB.IN("obj", "the shader object to query"),
        AutoSize("infoLog")..GLsizei.IN("maxLength", "the maximum number of characters the GL is allowed to write into {@code infoLog}"),
        Check(1)..nullable..GLsizei_p.OUT(
            "length",
            """
            the actual number of characters written by the GL into {@code infoLog} is returned in {@code length}, excluding the null termination. If
            {@code length} is #NULL then the GL ignores this parameter.
            """
        ),
        Return(
            "length",
            "glGetObjectParameteriARB(obj, GL_OBJECT_INFO_LOG_LENGTH_ARB)",
            heapAllocate = true
        )..GLcharARB_p.OUT("infoLog", "a buffer in which to return the info log")
    )

    void(
        "GetAttachedObjectsARB",
        """
        Returns the handles of objects attached to {@code containerObj} in {@code obj}. . The number of objects attached to {@code containerObj} is given by
        #OBJECT_ATTACHED_OBJECTS_ARB, which can be queried with #GetObjectParameterivARB(). If {@code containerObj} is not of type #PROGRAM_OBJECT_ARB, the
        error #INVALID_OPERATION is generated. If an error occurred, the return parameters {@code count} and {@code obj} will be unmodified.
        """,

        GLhandleARB.IN("containerObj", "the container object to query"),
        AutoSize("obj")..GLsizei.IN("maxCount", "the maximum number of handles the GL is allowed to write into {@code obj}"),
        Check(1)..nullable..GLsizei_p.OUT(
            "count",
            "a buffer in which to return the actual number of object handles written by the GL into {@code obj}. If #NULL then the GL ignores this parameter."
        ),
        GLhandleARB_p.OUT("obj", "a buffer in which to return the attached object handles")
    )

    GLint(
        "GetUniformLocationARB",
        """
        Returns the location of uniform variable {@code name}. {@code name} has to be a null terminated string, without white space. The value of -1 will be
        returned if {@code name} does not correspond to an active uniform variable name in {@code programObj} or if {@code name} starts with the reserved prefix
        "gl_". If {@code programObj} has not been successfully linked, or if {@code programObj} is not of type #PROGRAM_OBJECT_ARB, the error
        #INVALID_OPERATION is generated. The location of a uniform variable does not change until the next link command is issued.

        A valid {@code name} cannot be a structure, an array of structures, or a subcomponent of a vector or a matrix. In order to identify a valid {@code name},
        the "." (dot) and "[]" operators can be used in {@code name} to operate on a structure or to operate on an array.

        The first element of a uniform array is identified using the name of the uniform array appended with "[0]". Except if the last part of the string
        {@code name} indicates a uniform array, then the location of the first element of that array can be retrieved by either using the name of the uniform
        array, or the name of the uniform array appended with "[0]".
        """,

        GLhandleARB.IN("programObj", "the program object to query"),
        const..GLcharARB_p.IN("name", "the name of the uniform variable whose location is to be queried")
    )

    void(
        "GetActiveUniformARB",
        """
        Determines which of the declared uniform variables are active and their sizes and types.

        This command provides information about the uniform selected by {@code index}. The {@code index} of 0 selects the first active uniform, and
        {@code index} of #OBJECT_ACTIVE_UNIFORMS_ARB - 1 selects the last active uniform. The value of #OBJECT_ACTIVE_UNIFORMS_ARB can be queried with
        #GetObjectParameterivARB(). If {@code index} is greater than or equal to #OBJECT_ACTIVE_UNIFORMS_ARB, the error #INVALID_VALUE is generated.

        If an error occurred, the return parameters {@code length}, {@code size}, {@code type} and {@code name} will be unmodified.

        The returned uniform name can be the name of built-in uniform state as well. The length of the longest uniform name in {@code programObj} is given by
        #OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB, which can be queried with #GetObjectParameterivARB().

        Each uniform variable, declared in a shader, is broken down into one or more strings using the "." (dot) and "[]" operators, if necessary, to the point
        that it is legal to pass each string back into #GetUniformLocationARB(). Each of these strings constitutes one active uniform, and each string is
        assigned an index.

        If one or more elements of an array are active, GetActiveUniformARB will return the name of the array in {@code name}, subject to the restrictions
        listed above. The type of the array is returned in {@code type}. The {@code size} parameter contains the highest array element index used, plus one. The
        compiler or linker determines the highest index used. There will be only one active uniform reported by the GL per uniform array.

        This command will return as much information about active uniforms as possible. If no information is available, {@code length} will be set to zero and
        {@code name} will be an empty string. This situation could arise if GetActiveUniformARB is issued after a failed link.
        """,

        GLhandleARB.IN(
            "programObj",
            """
            a handle to a program object for which the command #LinkProgramARB() has been issued in the past. It is not necessary for {@code programObj} to have
            been linked successfully. The link could have failed because the number of active uniforms exceeded the limit.
            """
        ),
        GLuint.IN("index", "the uniform index"),
        AutoSize("name")..GLsizei.IN("maxLength", "the maximum number of characters the GL is allowed to write into {@code name}."),
        Check(1)..nullable..GLsizei_p.IN(
            "length",
            """
            a buffer in which to return the actual number of characters written by the GL into {@code name}. This count excludes the null termination. If
            {@code length} is #NULL then the GL ignores this parameter.
            """
        ),
        Check(1)..GLint_p.OUT("size", "a buffer in which to return the uniform size. The size is in units of the type returned in {@code type}."),
        Check(1)..GLenum_p.OUT("type", "a buffer in which to return the uniform type"),
        Return(
            "length",
            "glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB)"
        )..GLcharARB_p.OUT("name", "a buffer in which to return the uniform name")
    )

    void(
        "GetUniformfvARB",
        "Returns the floating-point value or values of a uniform.",

        GLhandleARB.IN("programObj", "the program object to query"),
        uniformLocation,
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "a buffer in which to return the uniform values")
    )

    void(
        "GetUniformivARB",
        "Returns the integer value or values of a uniform.",

        GLhandleARB.IN("programObj", "the program object to query"),
        uniformLocation,
        Check(1)..ReturnParam..GLint_p.OUT("params", "a buffer in which to return the uniform values")
    )

    void(
        "GetShaderSourceARB",
        """
        Returns the string making up the source code for a shader object.

        The string {@code source} is a concatenation of the strings passed to OpenGL using #ShaderSourceARB(). The length of this concatenation is given by
        #OBJECT_SHADER_SOURCE_LENGTH_ARB, which can be queried with #GetObjectParameterivARB(). If {@code obj} is not of type #SHADER_OBJECT_ARB, the error
        #INVALID_OPERATION is generated. If an error occurred, the return parameters {@code length} and {@code source} will be unmodified.
        """,

        GLhandleARB.IN("obj", "the shader object to query"),
        AutoSize("source")..GLsizei.IN("maxLength", "the maximum number of characters the GL is allowed to write into {@code source}"),
        Check(1)..nullable..GLsizei_p.OUT(
            "length",
            """
            a buffer in which to return the actual number of characters written by the GL into {@code source}, excluding the null termination. If
            {@code length} is #NULL then the GL ignores this parameter.
            """
        ),
        Return(
            "length",
            "glGetObjectParameteriARB(obj, GL_OBJECT_SHADER_SOURCE_LENGTH_ARB)",
            heapAllocate = true
        )..GLcharARB_p.OUT("source", "a buffer in which to return the shader object source")
    )
}