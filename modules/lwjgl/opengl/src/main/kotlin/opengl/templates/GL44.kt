/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL44 = "GL44".nativeClassGL("GL44") {
    documentation =
        """
        The core OpenGL 4.4 functionality. OpenGL 4.4 implementations support revision 4.40 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "buffer_storage"),
            registryLinkTo("ARB", "clear_texture"),
            registryLinkTo("ARB", "enhanced_layouts"),
            registryLinkTo("ARB", "multi_bind"),
            registryLinkTo("ARB", "query_buffer_object"),
            registryLinkTo("ARB", "texture_mirror_clamp_to_edge"),
            registryLinkTo("ARB", "texture_stencil8"),
            registryLinkTo("ARB", "vertex_type_10f_11f_11f_rev")
        )}
        """

    IntConstant(
        "Implementation-dependent state which constrains the maximum value of stride parameters to vertex array pointer-setting commands.",

        "MAX_VERTEX_ATTRIB_STRIDE"..0x82E5
    )

    IntConstant(
        """
        Implementations are not required to support primitive restart for separate patch primitives (primitive type PATCHES). Support can be queried by calling
        GetBooleanv with the symbolic constant PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED. A value of FALSE indicates that primitive restart is treated as
        disabled when drawing patches, no matter the value of the enables. A value of TRUE indicates that primitive restart behaves normally for patches.
        """,

        "PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED"..0x8221
    )

    IntConstant(
        "Equivalent to #TEXTURE_BUFFER_ARB query, but named more consistently.",

        "TEXTURE_BUFFER_BINDING"..0x8C2A
    )

    // ARB_buffer_storage

    IntConstant(
        "Accepted in the {@code flags} parameter of #BufferStorage() and #NamedBufferStorageEXT().",

        "MAP_PERSISTENT_BIT"..0x0040,
        "MAP_COHERENT_BIT"..0x0080,
        "DYNAMIC_STORAGE_BIT"..0x0100,
        "CLIENT_STORAGE_BIT"..0x0200
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}.",

        "BUFFER_IMMUTABLE_STORAGE"..0x821F,
        "BUFFER_STORAGE_FLAGS"..0x8220
    )

    IntConstant(
        "Accepted by the {@code barriers} parameter of #MemoryBarrier().",

        "CLIENT_MAPPED_BUFFER_BARRIER_BIT"..0x00004000
    )

    void(
        "BufferStorage",
        """
        Creates the data store of a buffer object.

        The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
        buffer is deleted with a call to #DeleteBuffers(). Such a store may not be re-allocated through further calls to {@code BufferStorage}
        or #BufferData().

        {@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
        another thread, it is as though #UnmapBuffer() is executed in each such context prior to deleting the existing data store.
        """,

        GLenum.IN("target", "the buffer object target", BUFFER_OBJECT_TARGETS),
        AutoSize("data")..GLsizeiptr.IN("size", "the size of the data store in basic machine units"),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p.IN(
            "data",
            """
            the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is #NULL, the data store of the
            buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
            """
        ),
        GLbitfield.IN(
            "flags",
            """
            the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
            are as follows:
            ${ul(
                """
                #DYNAMIC_STORAGE_BIT &ndash; The contents of the data store may be updated after creation through calls to
                #BufferSubData(). If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
                argument may be used to specify the initial content of the buffer's data store regardless of the presence of the #DYNAMIC_STORAGE_BIT.
                Regardless of the presence of this bit, buffers may always be updated with server-side calls such as #CopyBufferSubData() and
                #ClearBufferSubData().
                """,
                """
                #MAP_READ_BIT &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
                obtained that may be read from.
                """,
                """
                #MAP_WRITE_BIT &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
                space obtained that may be written to.
                """,
                """
                #MAP_PERSISTENT_BIT &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
                pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.
                """,
                """
                #MAP_COHERENT_BIT &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
                coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
                immediately visible to the other with no further action taken by the application. In particular:
                ${ul(
                    """
                    If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the #MemoryBarrier() command with
                    the #CLIENT_MAPPED_BUFFER_BARRIER_BIT set, then in subsequent commands the server will see the writes.
                    """,
                    "If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.",
                    """
                    If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call #MemoryBarrier() with the
                    #CLIENT_MAPPED_BUFFER_BARRIER_BIT set and then call #FenceSync() with #SYNC_GPU_COMMANDS_COMPLETE (or
                    #Finish()). Then the CPU will see the writes after the sync is complete.
                    """,
                    """
                    If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call #FenceSync() with
                    #SYNC_GPU_COMMANDS_COMPLETE (or #Finish()). Then the CPU will see the writes after the sync is complete.
                    """
                )}
                """,
                """
                #CLIENT_STORAGE_BIT &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
                implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.
                """
            )}
            If {@code flags} contains #MAP_PERSISTENT_BIT, it must also contain at least one of #MAP_READ_BIT or #MAP_WRITE_BIT.

            It is an error to specify #MAP_COHERENT_BIT without also specifying #MAP_PERSISTENT_BIT.
            """
        )
    )

    // ARB_clear_texture

    IntConstant(
        "Accepted by the {@code pname} parameter for #GetInternalformativ() and #GetInternalformati64v().",

        "CLEAR_TEXTURE"..0x9365
    )

    void(
        "ClearTexSubImage",
        """
        Fills all or part of a texture image with a constant value.

        Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
        by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in #TexSubImage3D().

        For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
        textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
        treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
        corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
        clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.

        Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.
        """,

        GLuint.IN(
            "texture",
            """
            the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
            the texture image has a compressed internal format
            """
        ),
        GLint.IN("level", "the texture level to clear"),
        GLint.IN("xoffset", "the x coordinate of the texel subregion"),
        GLint.IN("yoffset", "the y coordinate of the texel subregion"),
        GLint.IN("zoffset", "the z coordinate of the texel subregion"),
        GLsizei.IN("width", "the subregion width"),
        GLsizei.IN("height", "the subregion height"),
        GLsizei.IN("depth", "the subregion depth"),
        GLenum.IN("format", "the format of the source data", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the type of the source data", PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..void.const.p.IN(
            "data",
            """
            an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is #NULL,
            then the pointer is ignored and the sub-range of the texture image is filled with zeros.
            """
        )
    )

    void(
        "ClearTexImage",
        """
        Is equivalent to calling #ClearTexSubImage() with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
        {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
        have).
        """,

        GLuint.IN(
            "texture",
            """
            the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
            the texture image has a compressed internal format
            """
        ),
        GLint.IN("level", "the texture level to clear"),
        GLenum.IN("format", "the format of the source data", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the type of the source data", PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..void.const.p.IN(
            "data",
            """
            an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is #NULL,
            then the pointer is ignored and the sub-range of the texture image is filled with zeros.
            """
        )
    )

    // ARB_enhanced_layouts

    IntConstant(
        "Accepted in the {@code props} array of #GetProgramResourceiv().",

        "LOCATION_COMPONENT"..0x934A,
        "TRANSFORM_FEEDBACK_BUFFER_INDEX"..0x934B,
        "TRANSFORM_FEEDBACK_BUFFER_STRIDE"..0x934C
    )

    // ARB_multi_bind

    void(
        "BindBuffersBase",
        """
        Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
        corresponding to {@code target}. If {@code buffers} is not #NULL, it specifies an array of {@code count} values, each of which must be zero or the name
        of an existing buffer object. It is equivalent to:
        ${codeBlock("""
for ( i = 0; i < count; i++ ) {
    if ( buffers == NULL ) {
        glBindBufferBase(target, first + i, 0);
    } else {
        glBindBufferBase(target, first + i, buffers[i]);
    }
}
        """)}
        except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.
        """,

        GLenum.IN("target", "the buffer object target", BUFFER_OBJECT_TARGETS),
        GLuint.IN("first", "the first binding"),
        AutoSize("buffers")..GLsizei.IN("count", "the number of bindings"),
        nullable..GLuint.const.p.IN("buffers", "an array of zeros or names of existing buffers objects")
    )

    void(
        "BindBuffersRange",
        """
        Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
        corresponding to {@code target}. {@code offsets} and {@code sizes} specify arrays of {@code count} values indicating the range of each buffer to bind.
        If {@code buffers} is #NULL, all bindings from {@code first} through {@code first+count-1} are reset to their unbound (zero) state. In this
        case, the offsets and sizes associated with the binding points are set to default values, ignoring {@code offsets} and {@code sizes}. It is equivalent
        to:
        ${codeBlock("""
for ( i = 0; i < count; i++ ) {
    if ( buffers == NULL ) {
        glBindBufferRange(target, first + i, 0, 0, 0);
    } else {
        glBindBufferRange(target, first + i, buffers[i], offsets[i], sizes[i]);
    }
}
        """)}
        except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.

        The values specified in {@code buffers}, {@code offsets}, and {@code sizes} will be checked separately for each binding point. When values for a
        specific binding point are invalid, the state for that binding point will be unchanged and an error will be generated. However, state for other binding
        points will still be changed if their corresponding values are valid.
        """,

        GLenum.IN("target", "the buffer object target", BUFFER_OBJECT_TARGETS),
        GLuint.IN("first", "the first binding"),
        AutoSize("buffers", "offsets", "sizes")..GLsizei.IN("count", "the number of bindings"),
        nullable..GLuint.const.p.IN("buffers", "an array of names of existing buffers objects"),
        nullable..GLintptr.const.p.IN("offsets", "an array of offsets"),
        nullable..GLsizeiptr.const.p.IN("sizes", "an array of sizes")
    )

    void(
        "BindTextures",
        """
        Binds {@code count} existing texture objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not
        #NULL, it specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. When an entry in
        {@code textures} is the name of an existing texture object, that object is bound to corresponding texture unit for the target specified when the texture
        object was created. When an entry in {@code textures} is zero, each of the targets enumerated at the beginning of this section is reset to its default
        texture for the corresponding texture image unit. If {@code textures} is #NULL, each target of each affected texture image unit from {@code first}
        through {@code first+count-1} is reset to its default texture.

        {@code BindTextures} is equivalent to:
        ${codeBlock("""
for ( i = 0; i < count; i++ ) {
    uint texture;
    if ( textures == NULL ) {
        texture = 0;
    } else {
        texture = textures[i];
    }
    ActiveTexture(TEXTURE0 + first + i);
    if ( texture != 0 ) {
        enum target; // target of texture object textures[i]
        BindTexture(target, textures[i]);
    } else {
        for ( target in all supported targets ) {
            BindTexture(target, 0);
        }
    }
}
        """)}
        except that the active texture selector retains its original value upon completion of the command, and that textures will not be created if they do not
        exist.

        The values specified in {@code textures} will be checked separately for each texture image unit. When a value for a specific texture image unit is
        invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
        be changed if their corresponding values are valid.
        """,

        GLuint.IN("first", "the first texture objects"),
        AutoSize("textures")..GLsizei.IN("count", "the number of texture objects"),
        nullable..GLuint.const.p.IN("textures", "an array of zeros or names of existing texture objects")
    )

    void(
        "BindSamplers",
        """
        Binds {@code count} existing sampler objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code samplers} is not
        #NULL, it specifies an array of {@code count} values, each of which must be zero or the name of an existing sampler object. If {@code samplers} is #NULL,
        each affected texture image unit from {@code first} through {@code first+count-1} will be reset to have no bound sampler object.

        {@code BindSamplers} is equivalent to:
        ${codeBlock("""
for ( i = 0; i < count; i++ ) {
    if ( samplers == NULL ) {
        glBindSampler(first + i, 0);
    } else {
        glBindSampler(first + i, samplers[i]);
    }
}
        """)}
        The values specified in {@code samplers} will be checked separately for each texture image unit. When a value for a specific texture image unit is
        invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
        be changed if their corresponding values are valid.
        """,

        GLuint.IN("first", "the first sampler object"),
        AutoSize("samplers")..GLsizei.IN("count", "the number of sampler objects"),
        nullable..GLuint.const.p.IN("samplers", "an array of zeros or names of existing sampler objects")
    )

    void(
        "BindImageTextures",
        """
        Binds {@code count} existing texture objects to image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not #NULL, it
        specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. If {@code textures} is #NULL, each
        affected image unit from {@code first} through {@code first+count-1} will be reset to have no bound texture object.

        When binding a non-zero texture object to an image unit, the image unit {@code level}, {@code layered}, {@code layer}, and {@code access} parameters are
        set to zero, #TRUE, zero, and #READ_WRITE, respectively. The image unit {@code format} parameter is taken from the internal
        format of the texture image at level zero of the texture object identified by {@code textures}. For cube map textures, the internal format of the
        #TEXTURE_CUBE_MAP_POSITIVE_X image of level zero is used. For multisample, multisample array, buffer, and rectangle textures, the internal
        format of the single texture level is used.

        When unbinding a texture object from an image unit, the image unit parameters {@code level}, {@code layered}, {@code layer}, and {@code format} will be
        reset to their default values of zero, #FALSE, 0, and #R8, respectively.

        {@code BindImageTextures} is equivalent to:
        ${codeBlock("""
for ( i = 0; i < count; i++ ) {
    if ( textures == NULL || textures[i] = 0 ) {
        glBindImageTexture(first + i, 0, 0, FALSE, 0, READ_ONLY, R8);
    } else {
        glBindImageTexture(first + i, textures[i], 0, TRUE, 0, READ_WRITE, lookupInternalFormat(textures[i]));
    }
}
        """)}
        where {@code lookupInternalFormat} returns the internal format of the specified texture object.

        The values specified in {@code textures} will be checked separately for each image unit. When a value for a specific image unit is invalid, the state
        for that image unit will be unchanged and an error will be generated. However, state for other image units will still be changed if their corresponding
        values are valid.
        """,

        GLuint.IN("first", "the first image unit"),
        AutoSize("textures")..GLsizei.IN("count", "the number of image units"),
        nullable..GLuint.const.p.IN("textures", "an array of zeros or names of existing texture objects")
    )

    void(
        "BindVertexBuffers",
        """
        Binds {@code count} existing buffer objects to vertex buffer binding points numbered {@code first} through {@code first+count-1}. If {@code buffers} is
        not #NULL, it specifies an array of {@code count} values, each of which must be zero or the name of an existing buffer object. {@code offsets} and
        {@code strides} specify arrays of {@code count} values indicating the offset of the first element and stride between elements in each buffer,
        respectively. If {@code buffers} is #NULL, each affected vertex buffer binding point from {@code first} through {@code first+count-1} will be reset to
        have no bound buffer object. In this case, the offsets and strides associated with the binding points are set to default values, ignoring
        {@code offsets} and {@code strides}.

        {@code BindVertexBuffers} is equivalent to:
        ${codeBlock("""
for ( i = 0; i < count; i++ ) {
    if ( buffers == NULL ) {
        glBindVertexBuffer(first + i, 0, 0, 16);
    } else {
        glBindVertexBuffer(first + i, buffers[i], offsets[i], strides[i]);
    }
}
        """)}
        except that buffers will not be created if they do not exist.

        The values specified in {@code buffers}, {@code offsets}, and {@code strides} will be checked separately for each vertex buffer binding point. When a
        value for a specific binding point is invalid, the state for that binding point will be unchanged and an error will be generated. However, state for
        other binding points will still be changed if their corresponding values are valid.
        """,

        GLuint.IN("first", "the first vertex buffer binding point"),
        AutoSize("buffers", "offsets", "strides")..GLsizei.IN("count", "the number of vertex buffer binding points"),
        nullable..GLuint.const.p.IN("buffers", "an array of zeros or names of existing buffers objects"),
        nullable..GLintptr.const.p.IN("offsets", "an array of offses"),
        nullable..GLsizei.const.p.IN("strides", "an array of stride values")
    )

    // ARB_query_buffer_object

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetQueryObjectiv(), #GetQueryObjectuiv(), #GetQueryObjecti64v() and #GetQueryObjectui64v().",

        "QUERY_RESULT_NO_WAIT"..0x9194
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of #BindBuffer(), #BufferData(), #BufferSubData(),
        #MapBuffer(), #UnmapBuffer(), #MapBufferRange(), #GetBufferSubData(),
        #GetBufferParameteriv(), #GetBufferParameteri64v(), #GetBufferPointerv(),
        #ClearBufferSubData(), and the {@code readtarget} and {@code writetarget} parameters of #CopyBufferSubData().
        """,

        "QUERY_BUFFER"..0x9192
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv(), #GetFloatv(),
        and #GetDoublev().
        """,

        "QUERY_BUFFER_BINDING"..0x9193
    )

    IntConstant(
        "Accepted in the {@code barriers} bitfield in #MemoryBarrier().",

        "QUERY_BUFFER_BARRIER_BIT"..0x00008000
    )

    // ARB_texture_mirror_clamp_to_edge

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameter{if}, SamplerParameter{if} and SamplerParameter{if}v, and by the {@code params} parameter of
        TexParameter{if}v, TexParameterI{i ui}v and SamplerParameterI{i ui}v when their {@code pname} parameter is #TEXTURE_WRAP_S, #TEXTURE_WRAP_T, or
        #TEXTURE_WRAP_R,
        """,

        "MIRROR_CLAMP_TO_EDGE"..0x8743
    )

}