/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_bindless_texture = "ARBBindlessTexture".nativeClassGL("ARB_bindless_texture", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows OpenGL applications to access texture objects in shaders without first binding each texture to one of a limited number of texture
        image units. Using this extension, an application can query a 64-bit unsigned integer texture handle for each texture that it wants to access and then
        use that handle directly in GLSL or assembly-based shaders. The ability to access textures without having to bind and/or re-bind them is similar to the
        capability provided by the ${NV_shader_buffer_load.link} extension that allows shaders to access buffer objects without binding them. In both cases,
        these extensions significantly reduce the amount of API and internal GL driver overhead needed to manage resource bindings.

        This extension also provides similar capability for the image load, store, and atomic functionality provided by OpenGL 4.2 and the
        ${ARB_shader_image_load_store.link} and ${EXT_shader_image_load_store.link} extensions, where a texture can be accessed without first binding it to an
        image unit. An image handle can be extracted from a texture object using an API with a set of parameters similar to those for
        #BindImageTextureEXT().

        This extension adds no new data types to GLSL. Instead, it uses existing sampler and image data types and allows them to be populated with texture and
        image handles. This extension does permit sampler and image data types to be used in more contexts than in unextended GLSL 4.00. In particular, sampler
        and image types may be used as shader inputs/outputs, temporary variables, and uniform block members, and may be assigned to by shader code.
        Constructors are provided to convert unsigned integer values to and from sampler and image data types. Additionally, new APIs are provided to load
        values for sampler and image uniforms with 64-bit handle inputs. The use of existing integer-based Uniform* APIs is still permitted, in which case the
        integer specified will identify a texture image or image unit. For samplers and images with values specified as texture image or image units, the GL
        implemenation will translate the unit number to an internal handle as required.

        To access texture or image resources using handles, the handles must first be made resident. Accessing a texture or image by handle without first
        making it resident can result in undefined results, including program termination. Since the amount of texture memory required by an application may
        exceed the amount of memory available to the system, this extension provides API calls allowing applications to manage overall texture memory
        consumption by making a texture resident and non-resident as required.

        Requires ${GL40.core}.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of VertexAttribLPointer.",

        "UNSIGNED_INT64_ARB"..0x140F
    )

    GLuint64(
        "GetTextureHandleARB",
        """
        Creates a texture handle using the current state of the texture named {@code texture}, including any embedded sampler state. See
        #GetTextureSamplerHandleARB() for details.
        """,

        GLuint.IN("texture", "the texture object")
    )

    GLuint64(
        "GetTextureSamplerHandleARB",
        """
        Creates a texture handle using the current non-sampler state from the texture named {@code texture} and the sampler state from the sampler object
        {@code sampler}. In both cases, a 64-bit unsigned integer handle is returned. The error #INVALID_VALUE is generated if {@code texture} is zero or is
        not the name of an existing texture object or if {@code sampler} is zero or is not the name of an existing sampler object. The error
        #INVALID_OPERATION is generated if the texture object {@code texture} is not complete. If an error occurs, a handle of zero is returned.

        The error #INVALID_OPERATION is generated if the border color (taken from the embedded sampler for GetTextureHandleARB or from the {@code sampler}
        for GetTextureSamplerHandleARB) is not one of the following allowed values. If the texture's base internal format is signed or unsigned integer, allowed
        values are (0,0,0,0), (0,0,0,1), (1,1,1,0), and (1,1,1,1). If the base internal format is not integer, allowed values are (0.0,0.0,0.0,0.0),
        (0.0,0.0,0.0,1.0), (1.0,1.0,1.0,0.0), and (1.0,1.0,1.0,1.0).

        The handle for each texture or texture/sampler pair is unique; the same handle will be returned if GetTextureHandleARB is called multiple times for the
        same texture or if GetTextureSamplerHandleARB is called multiple times for the same texture/sampler pair.

        When a texture object is referenced by one or more texture handles, the texture parameters of the object may not be changed, and the size and format of
        the images in the texture object may not be re-specified. The error #INVALID_OPERATION is generated if the functions TexImage*, CopyTexImage*,
        CompressedTexImage*, TexBuffer*, or TexParameter* are called to modify a texture object referenced by one or more texture handles. The contents of the
        images in a texture object may still be updated via commands such as TexSubImage*, CopyTexSubImage*, and CompressedTexSubImage*, and by rendering to a
        framebuffer object, even if the texture object is referenced by one or more texture handles.

        The error #INVALID_OPERATION is generated by #BufferData() if it is called to modify a buffer object bound to a buffer texture while that
        texture object is referenced by one or more texture handles. The contents of the buffer object may still be updated via buffer update commands such as
        #BufferSubData() and MapBuffer*, or via the texture update commands, even if the buffer is bound to a texture while that buffer texture object is
        referenced by one or more texture handles.

        When a sampler object is referenced by one or more texture handles, the sampler parameters of the object may not be changed. The error
        #INVALID_OPERATION is generated when calling SamplerParameter* functions to modify a sampler object referenced by one or more texture handles.
        """,

        GLuint.IN("texture", "the texture object"),
        GLuint.IN("sampler", "the sampler object")
    )

    void(
        "MakeTextureHandleResidentARB",
        """
        Make a texture handle resident, so that it is accessible to shaders for texture mapping operations.

        While the texture handle is resident, it may be used in texture mapping operations. If a shader attempts to perform a texture mapping operation using a
        handle that is not resident, the results of that operation are undefined and may lead to application termination. When a texture handle is resident, the
        texture it references is also considered resident for the purposes of the #AreTexturesResident() command. The error #INVALID_OPERATION is
        generated if {@code handle} is not a valid texture handle, or if {@code handle} is already resident in the current GL context.
        """,

        GLuint64.IN("handle", "the texture handle")
    )

    void(
        "MakeTextureHandleNonResidentARB",
        """
        Makes a texture handle inaccessible to shaders.

        The error #INVALID_OPERATION is generated if {@code handle} is not a valid texture handle, or if {@code handle} is not resident in the current GL
        context.
        """,

        GLuint64.IN("handle", "the texture handle")
    )

    GLuint64(
        "GetImageHandleARB",
        """
        Creates and returns an image handle for level {@code level} of the texture named {@code texture}. If {@code layered} is #TRUE, a handle is created
        for the entire texture level. If {@code layered} is #FALSE, a handle is created for only the layer {@code layer} of the texture level.
        {@code format} specifies a format used to interpret the texels of the image when used for image loads, stores, and atomics, and has the same meaning as
        the {@code format} parameter of #BindImageTextureEXT(). A 64-bit unsigned integer handle is returned if the command succeeds; otherwise, zero is
        returned.

        The error #INVALID_VALUE is generated by GetImageHandleARB if:
        ${ul(
            "{@code texture} is zero or not the name of an existing texture object;",
            "the image for the texture level {@code level} doesn't exist (i.e., has a size of zero in {@code texture}); or",
            "{@code layered} is FALSE and {@code layer} is greater than or equal to the number of layers in the image at level {@code level}."
        )}
        The error #INVALID_OPERATION is generated by GetImageHandleARB if:
        ${ul(
            "the texture object {@code texture} is not complete (section 3.9.14);",
            """
            {@code layered} is TRUE and the texture is not a three-dimensional, one-dimensional array, two dimensional array, cube map, or cube map array
            texture.
            """
        )}
        When a texture object is referenced by one or more image handles, the texture parameters of the object may not be changed, and the size and format of
        the images in the texture object may not be re-specified. The error #INVALID_OPERATION is generated when calling TexImage*, CopyTexImage*,
        CompressedTexImage*, TexBuffer*, or TexParameter* functions while a texture object is referenced by one or more image handles. The contents of the
        images in a texture object may still be updated via commands such as TexSubImage*, CopyTexSubImage*, and CompressedTexSubImage*, and by rendering to a
        framebuffer object, even if the texture object is referenced by one or more image handles.

        The error #INVALID_OPERATION is generated by #BufferData() if it is called to modify a buffer object bound to a buffer texture while that texture
        object is referenced by one or more image handles. The contents of the buffer object may still be updated via buffer update commands such as
        #BufferSubData() and MapBuffer*, or via the texture update commands, even if the buffer is bound to a texture while that buffer texture object is
        referenced by one or more image handles.

        The handle returned for each combination of {@code texture}, {@code level}, {@code layered}, {@code layer}, and {@code format} is unique; the same
        handle will be returned if GetImageHandleARB is called multiple times with the same parameters.
        """,

        GLuint.IN("texture", "the texture object"),
        GLint.IN("level", "the texture level"),
        GLboolean.IN("layered", "the layered flag"),
        GLint.IN("layer", "the texture layer"),
        GLenum.IN("format", "the texture format")
    )

    void(
        "MakeImageHandleResidentARB",
        """
        Makes an image handle resident, so that it is accessible to shaders for image loads, stores, and atomic operations.

        {@code access} specifies whether the texture bound to the image handle will be treated as #READ_ONLY, #WRITE_ONLY, or #READ_WRITE. If a
        shader reads from an image handle made resident as #WRITE_ONLY, or writes to an image handle made resident as #READ_ONLY, the results of that
        shader operation are undefined and may lead to application termination. The error #INVALID_OPERATION is generated if {@code handle} is not a valid
        image handle, or if {@code handle} is already resident in the current GL context.

        While the image handle is resident, it may be used in image load, store, and atomic operations. If a shader attempts to perform an image operation using
        a handle that is not resident, the results of that operation are undefined and may lead to application termination. When an image handle is resident,
        the texture it references is not necessarily considered resident for the purposes of the #AreTexturesResident() command.
        """,

        GLuint64.IN("handle", "the image handle"),
        GLenum.IN("access", "the access type", "#READ_ONLY #WRITE_ONLY #READ_WRITE")
    )

    void(
        "MakeImageHandleNonResidentARB",
        "Makes an image handle inaccessible to shaders.",

        GLuint64.IN("handle", "the image handle")
    )

    val location = GLint.IN("location", "the uniform location")
    val UniformHandleui64ARB = void(
        "UniformHandleui64ARB",
        "Loads a 64-bit unsigned integer handle into a uniform location corresponding to sampler or image variable types.",

        location,
        GLuint64.IN("value", "the handle value")
    )

    val UniformHandleui64vARB = void(
        "UniformHandleui64vARB",
        "Loads {@code count} 64-bit unsigned integer handles into a uniform location corresponding to sampler or image variable types.",

        location,
        AutoSize("values")..GLsizei.IN("count", "the number of handles to load"),
        GLuint64.const.p.IN("values", "a buffer from which to load the handles")
    )

    void(
        "ProgramUniformHandleui64ARB",
        "DSA version of #UniformHandleui64ARB().",

        GLuint.IN("program", "the program object"),
        location,
        UniformHandleui64ARB["value"]
    )

    void(
        "ProgramUniformHandleui64vARB",
        "DSA version of #UniformHandleui64vARB().",

        GLuint.IN("program", "the program object"),
        location,
        UniformHandleui64vARB["count"],
        UniformHandleui64vARB["values"]
    )

    GLboolean(
        "IsTextureHandleResidentARB",
        "Returns #TRUE if the specified texture handle is resident in the current context.",

        GLuint64.IN("handle", "the texture handle")
    )

    GLboolean(
        "IsImageHandleResidentARB",
        "Returns #TRUE if the specified image handle is resident in the current context.",

        GLuint64.IN("handle", "the image handle")
    )

    void(
        "VertexAttribL1ui64ARB",
        "Specifies the 64-bit unsigned integer handle value of a generic vertex attribute.",

        GLuint.IN("index", "the index of the generic vertex attribute to be modified"),
        GLuint64.IN("x", "the handle value")
    )

    void(
        "VertexAttribL1ui64vARB",
        "Pointer version of #VertexAttribL1ui64ARB().",

        GLuint.IN("index", "the index of the generic vertex attribute to be modified"),
        Check(1)..GLuint64.const.p.IN("v", "the vertex attribute buffer")
    )

    void(
        "GetVertexAttribLui64vARB",
        "Returns the 64-bit unsigned integer handle value of a generic vertex attribute parameter.",

        GLuint.IN("index", "the generic vertex attribute index"),
        GLenum.IN("pname", "the parameter to query"),
        Check(1)..ReturnParam..GLuint64.p.OUT("params", "a buffer in which to place the returned data")
    )
}