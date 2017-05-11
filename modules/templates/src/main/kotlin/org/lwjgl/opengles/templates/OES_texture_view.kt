/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_texture_view = "OESTextureView".nativeClassGLES("OES_texture_view", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a texture's data store to be "viewed" in multiple ways, either reinterpreting the data format/type as a different format/ type
        with the same element size, or by clamping the mipmap level range or array slice range.

        The goals of this extension are to avoid having these alternate views become shared mutable containers of shared mutable objects, and to add the views
        to the API in a minimally invasive way.

        No new object types are added. Conceptually, a texture object is split into the following parts:
        ${ul(
            "A data store holding texel data.",
            "State describing which portions of the data store to use, and how to interpret the data elements.",
            "An embedded sampler object.",
            "Various other texture parameters."
        )}
        With this extension, multiple textures can share a data store and have different state describing which portions of the data store to use and how to
        interpret the data elements. The data store is refcounted and not destroyed until the last texture sharing it is deleted.

        This extension leverages the concept of an "immutable texture". Views can only be created of textures created with TexStorage*.

        Requires ${GLES31.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetTexParameterfv and GetTexParameteriv.",

        "TEXTURE_VIEW_MIN_LEVEL_OES"..0x82DB,
        "TEXTURE_VIEW_NUM_LEVELS_OES"..0x82DC,
        "TEXTURE_VIEW_MIN_LAYER_OES"..0x82DD,
        "TEXTURE_VIEW_NUM_LAYERS_OES"..0x82DE,
        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    void(
        "TextureViewOES",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLuint.IN("origtexture", ""),
        GLenum.IN("internalformat", ""),
        GLuint.IN("minlevel", ""),
        GLuint.IN("numlevels", ""),
        GLuint.IN("minlayer", ""),
        GLuint.IN("numlayers", "")
    )
}