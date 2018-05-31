/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL32C = "GL32C".nativeClassGL("GL32C") {
    extends = GL31C
    documentation =
        """
        The OpenGL functionality up to version 3.2. Includes only Core Profile symbols.

        OpenGL 3.2 implementations support revision 1.50 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "vertex_array_bgra"),
            registryLinkTo("ARB", "draw_elements_base_vertex"),
            registryLinkTo("ARB", "fragment_coord_conventions"),
            registryLinkTo("ARB", "provoking_vertex"),
            registryLinkTo("ARB", "seamless_cube_map"),
            registryLinkTo("ARB", "texture_multisample"),
            registryLinkTo("ARB", "depth_clamp"),
            registryLinkTo("ARB", "geometry_shader4"),
            registryLinkTo("ARB", "sync")
        )}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "CONTEXT_PROFILE_MASK"..0x9126
    )

    IntConstant(
        "Context profile bits.",

        "CONTEXT_CORE_PROFILE_BIT"..0x00000001,
        "CONTEXT_COMPATIBILITY_PROFILE_BIT"..0x00000002
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_OUTPUT_COMPONENTS"..0x9122,
        "MAX_GEOMETRY_INPUT_COMPONENTS"..0x9123,
        "MAX_GEOMETRY_OUTPUT_COMPONENTS"..0x9124,
        "MAX_FRAGMENT_INPUT_COMPONENTS"..0x9125
    )

    void(
        "GetBufferParameteri64v",
        "Returns the value of a buffer object parameter.",

        GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
        GLenum.IN("pname", "the symbolic name of a buffer object parameter", BUFFER_OBJECT_PARAMETERS),
        Check(1)..ReturnParam..GLint64.p.OUT("params", "the requested parameter")
    )

    // ARB_draw_elements_base_vertex

    void(
        "DrawElementsBaseVertex",
        "Renders primitives from array data with a per-element offset.",

        GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of elements to be rendered"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the type of the values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "a pointer to the location where the indices are stored"),
        GLint.IN("basevertex", "a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays")
    )

    void(
        "DrawRangeElementsBaseVertex",
        "Renders primitives from array data with a per-element offset.",

        GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
        GLuint.IN("start", "the minimum array index contained in {@code indices}"),
        GLuint.IN("end", "the maximum array index contained in {@code indices}"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of elements to be rendered"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the type of the values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "a pointer to the location where the indices are stored"),
        GLint.IN("basevertex", "a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays")
    )

    void(
        "DrawElementsInstancedBaseVertex",
        "Renders multiple instances of a set of primitives from array data with a per-element offset.",

        GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of elements to be rendered"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the type of the values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "a pointer to the location where the indices are stored"),
        GLsizei.IN("primcount", "the number of instances of the indexed geometry that should be drawn"),
        GLint.IN("basevertex", "a constant that should be added to each element of indices when chosing elements from the enabled vertex arrays")
    )

    void(
        "MultiDrawElementsBaseVertex",
        """
        Renders multiple sets of primitives by specifying indices of array data elements and an offset to apply to each index.

        <b>LWJGL note</b>: Use org.lwjgl.system.MemoryUtil#memAddress() to retrieve pointers to the index buffers.
        """,

        GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
        GLsizei.const.p.IN("count", "an array of the elements counts"),
        GLenum.IN("type", "the type of the values in {@code indices}", "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"),
        void.const.p.p.IN("indices", "a pointer to the location where the indices are stored"),
        AutoSize("count", "indices", "basevertex")..GLsizei.IN("primcount", "the size of the {@code count} array"),
        GLint.p.IN("basevertex", "a pointer to the location where the base vertices are stored")
    )

    // ARB_provoking_vertex

    val ProvokingVertexModes = IntConstant(
        "Accepted by the {@code mode} parameter of ProvokingVertex.",

        "FIRST_VERTEX_CONVENTION"..0x8E4D,
        "LAST_VERTEX_CONVENTION"..0x8E4E
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PROVOKING_VERTEX"..0x8E4F,
        "QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION"..0x8E4C
    )

    void(
        "ProvokingVertex",
        "Specifies the vertex to be used as the source of data for flat shaded varyings.",

        GLenum.IN("mode", "the provoking vertex mode", ProvokingVertexModes)
    )

    // ARB_seamless_cube_map

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
        GetDoublev.
        """,

        "TEXTURE_CUBE_MAP_SEAMLESS"..0x884F
    )

    // ARB_texture_multisample

    IntConstant(
        "Accepted by the {@code pname} parameter of GetMultisamplefv.",

        "SAMPLE_POSITION"..0x8E50
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "SAMPLE_MASK"..0x8E51
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetBooleani_v and GetIntegeri_v.",

        "SAMPLE_MASK_VALUE"..0x8E52
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BindTexture and TexImage2DMultisample.",

        "TEXTURE_2D_MULTISAMPLE"..0x9100
    )

    IntConstant(
        "Accepted by the {@code target} parameter of TexImage2DMultisample.",

        "PROXY_TEXTURE_2D_MULTISAMPLE"..0x9101
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BindTexture and TexImage3DMultisample.",

        "TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9102
    )

    IntConstant(
        "Accepted by the {@code target} parameter of TexImage3DMultisample.",

        "PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9103
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MAX_SAMPLE_MASK_WORDS"..0x8E59,
        "MAX_COLOR_TEXTURE_SAMPLES"..0x910E,
        "MAX_DEPTH_TEXTURE_SAMPLES"..0x910F,
        "MAX_INTEGER_SAMPLES"..0x9110,
        "TEXTURE_BINDING_2D_MULTISAMPLE"..0x9104,
        "TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY"..0x9105
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameter.",

        "TEXTURE_SAMPLES"..0x9106,
        "TEXTURE_FIXED_SAMPLE_LOCATIONS"..0x9107
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_2D_MULTISAMPLE"..0x9108,
        "INT_SAMPLER_2D_MULTISAMPLE"..0x9109,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE"..0x910A,
        "SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910B,
        "INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910C,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910D
    )

    void(
        "TexImage2DMultisample",
        "Establishes the data storage, format, dimensions, and number of samples of a 2D multisample texture's image.",

        GLenum.IN("target", "the target of the operation", "#TEXTURE_2D_MULTISAMPLE #PROXY_TEXTURE_2D_MULTISAMPLE"),
        GLsizei.IN("samples", "the number of samples in the multisample texture's image"),
        GLint.IN(
            "internalformat",
            """
            the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
            or stencil-renderable format.
            """
        ),
        GLsizei.IN("width", "the width of the multisample texture's image, in texels"),
        GLsizei.IN("height", "the height of the multisample texture's image, in texels"),
        GLboolean.IN(
            "fixedsamplelocations",
            """
            whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
            depend on the internal format or size of the image
            """
        )
    )

    void(
        "TexImage3DMultisample",
        "Establishes the data storage, format, dimensions, and number of samples of a 3D multisample texture's image.",

        GLenum.IN("target", "the target of the operation", "#TEXTURE_2D_MULTISAMPLE_ARRAY #PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY"),
        GLsizei.IN("samples", "the number of samples in the multisample texture's image"),
        GLint.IN(
            "internalformat",
            """
            the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
            or stencil-renderable format.
            """
        ),
        GLsizei.IN("width", "the width of the multisample texture's image, in texels"),
        GLsizei.IN("height", "the height of the multisample texture's image, in texels"),
        GLsizei.IN("depth", "the depth of the multisample texture's image, in texels"),
        GLboolean.IN(
            "fixedsamplelocations",
            """
            whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
            depend on the internal format or size of the image
            """
        )
    )

    void(
        "GetMultisamplefv",
        "Retrieves the location of a sample.",

        GLenum.IN("pname", "the sample parameter name", "#SAMPLE_POSITION"),
        GLuint.IN("index", "the index of the sample whose position to query"),
        Check(1)..ReturnParam..GLfloat.p.OUT("val", "an array to receive the position of the sample")
    )

    void(
        "SampleMaski",
        "Sets the value of a sub-word of the sample mask.",

        GLuint.IN("index", "which 32-bit sub-word of the sample mask to update"),
        GLbitfield.IN("mask", "the new value of the mask sub-word")
    )

    // ARB_depth_clamp

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "DEPTH_CLAMP"..0x864F
    )

    // ARB_geometry_shader4

    IntConstant(
        "Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "GEOMETRY_SHADER"..0x8DD9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

        "GEOMETRY_VERTICES_OUT"..0x8DDA,
        "GEOMETRY_INPUT_TYPE"..0x8DDB,
        "GEOMETRY_OUTPUT_TYPE"..0x8DDC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS"..0x8C29,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS"..0x8DDF,
        "MAX_GEOMETRY_OUTPUT_VERTICES"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS"..0x8DE1
    )

    IntConstant(
        "Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.",

        "LINES_ADJACENCY"..0xA,
        "LINE_STRIP_ADJACENCY"..0xB,
        "TRIANGLES_ADJACENCY"..0xC,
        "TRIANGLE_STRIP_ADJACENCY"..0xD
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS"..0x8DA8
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachment- Parameteriv.",

        "FRAMEBUFFER_ATTACHMENT_LAYERED"..0x8DA7
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetFloatv, GetDoublev, and
        GetBooleanv.
        """,

        "PROGRAM_POINT_SIZE"..0x8642
    )

    void(
        "FramebufferTexture",
        "Attaches a level of a texture object as a logical buffer to the currently bound framebuffer object.",

        GLenum.IN("target", "the framebuffer target", "#FRAMEBUFFER #READ_FRAMEBUFFER #DRAW_FRAMEBUFFER"),
        GLenum.IN("attachment", "the attachment point of the framebuffer"),
        GLuint.IN("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
        GLint.IN("level", "the mipmap level of {@code texture} to attach")
    )

    // ARB_sync

    IntConstant(
        "Accepted as the {@code pname} parameter of GetInteger64v.",

        "MAX_SERVER_WAIT_TIMEOUT"..0x9111
    )

    val SyncProperties = IntConstant(
        "Accepted as the {@code pname} parameter of GetSynciv.",

        "OBJECT_TYPE"..0x9112,
        "SYNC_CONDITION"..0x9113,
        "SYNC_STATUS"..0x9114,
        "SYNC_FLAGS"..0x9115
    ).javaDocLinks

    IntConstant(
        "Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE.",

        "SYNC_FENCE"..0x9116
    )

    IntConstant(
        "Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION.",

        "SYNC_GPU_COMMANDS_COMPLETE"..0x9117
    )

    IntConstant(
        "Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS.",

        "UNSIGNALED"..0x9118,
        "SIGNALED"..0x9119
    )

    IntConstant(
        "Accepted in the {@code flags} parameter of ClientWaitSync.",

        "SYNC_FLUSH_COMMANDS_BIT"..0x00000001
    )

    LongConstant(
        "Accepted in the {@code timeout} parameter of WaitSync.",

        "TIMEOUT_IGNORED".."0xFFFFFFFFFFFFFFFFL" // TODO: http://youtrack.jetbrains.com/issue/KT-2780
    )

    IntConstant(
        "Returned by ClientWaitSync.",

        "ALREADY_SIGNALED"..0x911A,
        "TIMEOUT_EXPIRED"..0x911B,
        "CONDITION_SATISFIED"..0x911C,
        "WAIT_FAILED"..0x911D
    )

    GLsync(
        "FenceSync",
        "Creates a new sync object and inserts it into the GL command stream.",

        GLenum.IN("condition", "the condition that must be met to set the sync object's state to signaled", "#SYNC_GPU_COMMANDS_COMPLETE"),
        GLbitfield.IN(
            "flags",
            """
            a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must
            be zero.
            """
        )
    )

    GLboolean(
        "IsSync",
        "Determines if a name corresponds to a sync object.",

        GLsync.IN("sync", "a value that may be the name of a sync object")
    )

    void(
        "DeleteSync",
        "Deletes a sync object.",

        GLsync.IN("sync", "the sync object to be deleted")
    )

    GLenum(
        "ClientWaitSync",
        """
        Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called,
        {@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled.

        The return value is one of four status values:
        ${ul(
            "#ALREADY_SIGNALED indicates that sync was signaled at the time that glClientWaitSync was called.",
            "#TIMEOUT_EXPIRED indicates that at least timeout nanoseconds passed and sync did not become signaled.",
            "#CONDITION_SATISFIED indicates that sync was signaled before the timeout expired.",
            "#WAIT_FAILED indicates that an error occurred. Additionally, an OpenGL error will be generated."
        )}
        """,

        GLsync.IN("sync", "the sync object whose status to wait on"),
        GLbitfield.IN("flags", "a bitfield controlling the command flushing behavior", "0 #SYNC_FLUSH_COMMANDS_BIT", LinkMode.BITFIELD),
        GLuint64.IN("timeout", "the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled")
    )

    void(
        "WaitSync",
        """
        Causes the GL server to block and wait for a sync object to become signaled.

        {@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by
        with #MAX_SERVER_WAIT_TIMEOUT. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the
        sync object being waited on was signaled.

        If an error occurs, {@code glWaitSync} does not cause the GL server to block.
        """,

        GLsync.IN("sync", "the sync object whose status to wait on"),
        GLbitfield.IN("flags", "a bitfield controlling the command flushing behavior", "0"),
        GLuint64.IN("timeout", "the timeout that the server should wait before continuing", "#TIMEOUT_IGNORED")
    )

    void(
        "GetInteger64v",
        "Returns the 64bit integer value or values of a selected parameter.",

        GLenum.IN("pname", "the parameter value to be returned"),
        Check(1)..ReturnParam..GLint64.p.OUT("params", "the value or values of the specified parameter")
    )

    void(
        "GetInteger64i_v",
        "Queries the 64bit integer value of an indexed state variable.",

        GLenum.IN("pname", "the indexed state to query"),
        GLuint.IN("index", "the index of the element being queried"),
        Check(1)..ReturnParam..GLint64.p.OUT("params", "the value or values of the specified parameter")
    )

    void(
        "GetSynciv",
        "Queries the properties of a sync object.",

        GLsync.IN("sync", "the sync object whose properties to query"),
        GLenum.IN("pname", "the parameter whose value to retrieve from the sync object specified in {@code sync}", SyncProperties),
        AutoSize("values")..GLsizei.IN("bufSize", "the size of the buffer whose address is given in {@code values}"),
        Check(1)..nullable..GLsizei.p.OUT("length", "the address of an variable to receive the number of integers placed in {@code values}"),
        ReturnParam..GLint.p.OUT("values", "the address of an array to receive the values of the queried parameter")
    )
}