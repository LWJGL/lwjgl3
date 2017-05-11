/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_bindless_texture = "NVBindlessTexture".nativeClassGLES("NV_bindless_texture", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "bindless_texture")} extension.

        This extension allows OpenGL applications to access texture objects in shaders without first binding each texture to one of a limited number of texture
        image units. Using this extension, an application can query a 64-bit unsigned integer texture handle for each texture that it wants to access and then
        use that handle directly in GLSL or assembly-based shaders. The ability to access textures without having to bind and/or re-bind them is similar to the
        capability provided by the NV_shader_buffer_load extension that allows shaders to access buffer objects without binding them. In both cases, these
        extensions significantly reduce the amount of API and internal GL driver overhead needed to manage resource bindings.

        This extension also provides similar capability for the image load, store, and atomic functionality provided by OpenGL 4.2, OpenGL ES 3.1 and the
        ARB_shader_image_load_store and EXT_shader_image_load_store extensions, where a texture can be accessed without first binding it to an image unit. An
        image handle can be extracted from a texture object using an API with a set of parameters similar to those for BindImageTextureEXT.

        This extension adds no new data types to GLSL. Instead, it uses existing sampler and image data types and allows them to be populated with texture and
        image handles. This extension does permit sampler and image data types to be used in more contexts than in unextended GLSL 4.00. In particular, sampler
        and image types may be used as shader inputs/outputs, temporary variables, and uniform block members, and may be assigned to by shader code.
        Constructors are provided to convert 64-bit unsigned integer values to and from sampler and image data types. Additionally, new APIs are provided to
        load values for sampler and image uniforms with 64-bit handle inputs. The use of existing integer-based Uniform* APIs is still permitted, in which case
        the integer specified will identify a texture image or image unit. For samplers and images with values specified as texture image or image units, the
        GL implemenation will translate the unit number to an internal handle as required.

        To access texture or image resources using handles, the handles must first be made resident. Accessing a texture or image by handle without first
        making it resident can result in undefined results, including program termination. Since the amount of texture memory required by an application may
        exceed the amount of memory available to the system, this extension provides API calls allowing applications to manage overall texture memory
        consumption by making a texture resident and non-resident as required.

        Requires ${GLES30.core}.
        """

    GLuint64(
        "GetTextureHandleNV",
        "",

        GLuint.IN("texture", "")
    )

    GLuint64(
        "GetTextureSamplerHandleNV",
        "",

        GLuint.IN("texture", ""),
        GLuint.IN("sampler", "")
    )

    void(
        "MakeTextureHandleResidentNV",
        "",

        GLuint64.IN("handle", "")
    )

    void(
        "MakeTextureHandleNonResidentNV",
        "",

        GLuint64.IN("handle", "")
    )

    GLuint64(
        "GetImageHandleNV",
        "",

        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLboolean.IN("layered", ""),
        GLint.IN("layer", ""),
        GLenum.IN("format", "")
    )

    void(
        "MakeImageHandleResidentNV",
        "",

        GLuint64.IN("handle", ""),
        GLenum.IN("access", "")
    )

    void(
        "MakeImageHandleNonResidentNV",
        "",

        GLuint64.IN("handle", "")
    )

    void(
        "UniformHandleui64NV",
        "",

        GLint.IN("location", ""),
        GLuint64.IN("value", "")
    )

    void(
        "UniformHandleui64vNV",
        "",

        GLint.IN("location", ""),
        AutoSize("values")..GLsizei.IN("count", ""),
        const..GLuint64_p.IN("values", "")
    )

    void(
        "ProgramUniformHandleui64NV",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint64.IN("value", "")
    )

    void(
        "ProgramUniformHandleui64vNV",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("values")..GLsizei.IN("count", ""),
        const..GLuint64_p.IN("values", "")
    )

    GLboolean(
        "IsTextureHandleResidentNV",
        "",

        GLuint64.IN("handle", "")
    )

    GLboolean(
        "IsImageHandleResidentNV",
        "",

        GLuint64.IN("handle", "")
    )
}