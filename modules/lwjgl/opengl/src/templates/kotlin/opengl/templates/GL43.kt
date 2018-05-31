/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL43 = "GL43".nativeClassGL("GL43") {
    extends = GL42
    documentation =
        """
        The OpenGL functionality up to version 4.3. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 4.3 implementations support revision 4.30 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "arrays_of_arrays"),
            registryLinkTo("ARB", "ES3_compatibility"),
            registryLinkTo("ARB", "clear_buffer_object"),
            registryLinkTo("ARB", "compute_shader"),
            registryLinkTo("ARB", "copy_image"),
            "{@code ARB_debug_group}",
            registryLinkTo("EXT", "debug_label"),
            "{@code ARB_debug_output2}",
            registryLinkTo("ARB", "debug_output"),
            registryLinkTo("ARB", "explicit_uniform_location"),
            registryLinkTo("ARB", "fragment_layer_viewport"),
            registryLinkTo("ARB", "framebuffer_no_attachments"),
            registryLinkTo("ARB", "internalformat_query2"),
            registryLinkTo("ARB", "invalidate_subdata"),
            registryLinkTo("ARB", "multi_draw_indirect"),
            registryLinkTo("ARB", "program_interface_query"),
            registryLinkTo("ARB", "robust_buffer_access_behavior"),
            registryLinkTo("ARB", "shader_image_size"),
            registryLinkTo("ARB", "shader_storage_buffer_object"),
            registryLinkTo("ARB", "stencil_texturing"),
            registryLinkTo("ARB", "texture_buffer_range"),
            registryLinkTo("ARB", "texture_query_levels"),
            registryLinkTo("ARB", "texture_storage_multisample"),
            registryLinkTo("ARB", "texture_view"),
            registryLinkTo("ARB", "vertex_attrib_binding")
        )}
        """

    IntConstant(
        "No. of supported Shading Language Versions. Accepted by the {@code pname} parameter of GetIntegerv.",

        "NUM_SHADING_LANGUAGE_VERSIONS"..0x82E9
    )

    IntConstant(
        "Vertex attrib array has unconverted doubles. Accepted by the {@code pname} parameter of GetVertexAttribiv.",

        "VERTEX_ATTRIB_ARRAY_LONG"..0x874E
    )

    // ARB_ES3_compatibility

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D.",

        "COMPRESSED_RGB8_ETC2"..0x9274,
        "COMPRESSED_SRGB8_ETC2"..0x9275,
        "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9276,
        "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9277,
        "COMPRESSED_RGBA8_ETC2_EAC"..0x9278,
        "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC"..0x9279,
        "COMPRESSED_R11_EAC"..0x9270,
        "COMPRESSED_SIGNED_R11_EAC"..0x9271,
        "COMPRESSED_RG11_EAC"..0x9272,
        "COMPRESSED_SIGNED_RG11_EAC"..0x9273
    )

    IntConstant(
        "Accepted by the {@code target} parameter of Enable and Disable.",

        "PRIMITIVE_RESTART_FIXED_INDEX"..0x8D69
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv.",

        "ANY_SAMPLES_PASSED_CONSERVATIVE"..0x8D6A
    )

    IntConstant(
        "Accepted by the {@code value} parameter of the GetInteger* functions.",

        "MAX_ELEMENT_INDEX"..0x8D6B
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.",

        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    // ARB_clear_buffer_object

    GL43C reuse "ClearBufferData"
    GL43C reuse "ClearBufferSubData"

    // ARB_compute_shader

    IntConstant(
        "Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv.",

        "COMPUTE_SHADER"..0x91B9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.",

        "MAX_COMPUTE_UNIFORM_BLOCKS"..0x91BB,
        "MAX_COMPUTE_TEXTURE_IMAGE_UNITS"..0x91BC,
        "MAX_COMPUTE_IMAGE_UNIFORMS"..0x91BD,
        "MAX_COMPUTE_SHARED_MEMORY_SIZE"..0x8262,
        "MAX_COMPUTE_UNIFORM_COMPONENTS"..0x8263,
        "MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS"..0x8264,
        "MAX_COMPUTE_ATOMIC_COUNTERS"..0x8265,
        "MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS"..0x8266,
        "MAX_COMPUTE_WORK_GROUP_INVOCATIONS"..0x90EB
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v.",

        "MAX_COMPUTE_WORK_GROUP_COUNT"..0x91BE,
        "MAX_COMPUTE_WORK_GROUP_SIZE"..0x91BF
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "COMPUTE_WORK_GROUP_SIZE"..0x8267
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

        "UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER"..0x90EC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.",

        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER"..0x90ED
    )

    IntConstant(
        "Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

        "DISPATCH_INDIRECT_BUFFER"..0x90EE
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

        "DISPATCH_INDIRECT_BUFFER_BINDING"..0x90EF
    )

    IntConstant(
        "Accepted by the {@code stages} parameter of UseProgramStages.",

        "COMPUTE_SHADER_BIT"..0x00000020
    )


    GL43C reuse "DispatchCompute"
    GL43C reuse "DispatchComputeIndirect"

    // ARB_copy_image

    GL43C reuse "CopyImageSubData"

    // KHR_debug

    IntConstant(
        "Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled.",

        "DEBUG_OUTPUT"..0x92E0,
        "DEBUG_OUTPUT_SYNCHRONOUS"..0x8242
    )

    IntConstant(
        "Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.",

        "CONTEXT_FLAG_DEBUG_BIT"..0x00000002
    )

    IntConstant(
        "Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.",

        "MAX_DEBUG_MESSAGE_LENGTH"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES"..0x9144,
        "DEBUG_LOGGED_MESSAGES"..0x9145,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH"..0x8243,
        "MAX_DEBUG_GROUP_STACK_DEPTH"..0x826C,
        "DEBUG_GROUP_STACK_DEPTH"..0x826D,
        "MAX_LABEL_LENGTH"..0x82E8
    )

    IntConstant(
        "Tokens accepted by the {@code pname} parameter of GetPointerv.",

        "DEBUG_CALLBACK_FUNCTION"..0x8244,
        "DEBUG_CALLBACK_USER_PARAM"..0x8245
    )

    IntConstant(
        """
        Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter
        of GetDebugMessageLog.
        """,

        "DEBUG_SOURCE_API"..0x8246,
        "DEBUG_SOURCE_WINDOW_SYSTEM"..0x8247,
        "DEBUG_SOURCE_SHADER_COMPILER"..0x8248,
        "DEBUG_SOURCE_THIRD_PARTY"..0x8249,
        "DEBUG_SOURCE_APPLICATION"..0x824A,
        "DEBUG_SOURCE_OTHER"..0x824B
    )

    IntConstant(
        """
        Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of
        GetDebugMessageLog.
        """,

        "DEBUG_TYPE_ERROR"..0x824C,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR"..0x824D,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR"..0x824E,
        "DEBUG_TYPE_PORTABILITY"..0x824F,
        "DEBUG_TYPE_PERFORMANCE"..0x8250,
        "DEBUG_TYPE_OTHER"..0x8251,
        "DEBUG_TYPE_MARKER"..0x8268
    )

    IntConstant(
        """
        Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.
        """,

        "DEBUG_TYPE_PUSH_GROUP"..0x8269,
        "DEBUG_TYPE_POP_GROUP"..0x826A
    )

    IntConstant(
        """
        Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the
        {@code severities} parameter of GetDebugMessageLog.
        """,

        "DEBUG_SEVERITY_HIGH"..0x9146,
        "DEBUG_SEVERITY_MEDIUM"..0x9147,
        "DEBUG_SEVERITY_LOW"..0x9148,
        "DEBUG_SEVERITY_NOTIFICATION"..0x826B
    )

    IntConstant(
        "Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.",

        "BUFFER"..0x82E0,
        "SHADER"..0x82E1,
        "PROGRAM"..0x82E2,
        "QUERY"..0x82E3,
        "PROGRAM_PIPELINE"..0x82E4,
        "SAMPLER"..0x82E6,
        "DISPLAY_LIST"..0x82E7
    )

    GL43C reuse "DebugMessageControl"
    GL43C reuse "DebugMessageInsert"
    GL43C reuse "DebugMessageCallback"
    GL43C reuse "GetDebugMessageLog"
    GL43C reuse "PushDebugGroup"
    GL43C reuse "PopDebugGroup"
    GL43C reuse "ObjectLabel"
    GL43C reuse "GetObjectLabel"
    GL43C reuse "ObjectPtrLabel"
    GL43C reuse "GetObjectPtrLabel"

    // ARB_explicit_uniform_location

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

        "MAX_UNIFORM_LOCATIONS"..0x826E
    )

    // ARB_framebuffer_no_attachments

    IntConstant(
        """
        Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and
        GetNamedFramebufferParameterivEXT.
        """,

        "FRAMEBUFFER_DEFAULT_WIDTH"..0x9310,
        "FRAMEBUFFER_DEFAULT_HEIGHT"..0x9311,
        "FRAMEBUFFER_DEFAULT_LAYERS"..0x9312,
        "FRAMEBUFFER_DEFAULT_SAMPLES"..0x9313,
        "FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS"..0x9314
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

        "MAX_FRAMEBUFFER_WIDTH"..0x9315,
        "MAX_FRAMEBUFFER_HEIGHT"..0x9316,
        "MAX_FRAMEBUFFER_LAYERS"..0x9317,
        "MAX_FRAMEBUFFER_SAMPLES"..0x9318
    )

    GL43C reuse "FramebufferParameteri"
    GL43C reuse "GetFramebufferParameteriv"

    // ARB_internalformat_query2

    IntConstant(
        "Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.",

        "INTERNALFORMAT_SUPPORTED"..0x826F,
        "INTERNALFORMAT_PREFERRED"..0x8270,
        "INTERNALFORMAT_RED_SIZE"..0x8271,
        "INTERNALFORMAT_GREEN_SIZE"..0x8272,
        "INTERNALFORMAT_BLUE_SIZE"..0x8273,
        "INTERNALFORMAT_ALPHA_SIZE"..0x8274,
        "INTERNALFORMAT_DEPTH_SIZE"..0x8275,
        "INTERNALFORMAT_STENCIL_SIZE"..0x8276,
        "INTERNALFORMAT_SHARED_SIZE"..0x8277,
        "INTERNALFORMAT_RED_TYPE"..0x8278,
        "INTERNALFORMAT_GREEN_TYPE"..0x8279,
        "INTERNALFORMAT_BLUE_TYPE"..0x827A,
        "INTERNALFORMAT_ALPHA_TYPE"..0x827B,
        "INTERNALFORMAT_DEPTH_TYPE"..0x827C,
        "INTERNALFORMAT_STENCIL_TYPE"..0x827D,
        "MAX_WIDTH"..0x827E,
        "MAX_HEIGHT"..0x827F,
        "MAX_DEPTH"..0x8280,
        "MAX_LAYERS"..0x8281,
        "MAX_COMBINED_DIMENSIONS"..0x8282,
        "COLOR_COMPONENTS"..0x8283,
        "DEPTH_COMPONENTS"..0x8284,
        "STENCIL_COMPONENTS"..0x8285,
        "COLOR_RENDERABLE"..0x8286,
        "DEPTH_RENDERABLE"..0x8287,
        "STENCIL_RENDERABLE"..0x8288,
        "FRAMEBUFFER_RENDERABLE"..0x8289,
        "FRAMEBUFFER_RENDERABLE_LAYERED"..0x828A,
        "FRAMEBUFFER_BLEND"..0x828B,
        "READ_PIXELS"..0x828C,
        "READ_PIXELS_FORMAT"..0x828D,
        "READ_PIXELS_TYPE"..0x828E,
        "TEXTURE_IMAGE_FORMAT"..0x828F,
        "TEXTURE_IMAGE_TYPE"..0x8290,
        "GET_TEXTURE_IMAGE_FORMAT"..0x8291,
        "GET_TEXTURE_IMAGE_TYPE"..0x8292,
        "MIPMAP"..0x8293,
        "MANUAL_GENERATE_MIPMAP"..0x8294,
        "AUTO_GENERATE_MIPMAP"..0x8295,
        "COLOR_ENCODING"..0x8296,
        "SRGB_READ"..0x8297,
        "SRGB_WRITE"..0x8298,
        "FILTER"..0x829A,
        "VERTEX_TEXTURE"..0x829B,
        "TESS_CONTROL_TEXTURE"..0x829C,
        "TESS_EVALUATION_TEXTURE"..0x829D,
        "GEOMETRY_TEXTURE"..0x829E,
        "FRAGMENT_TEXTURE"..0x829F,
        "COMPUTE_TEXTURE"..0x82A0,
        "TEXTURE_SHADOW"..0x82A1,
        "TEXTURE_GATHER"..0x82A2,
        "TEXTURE_GATHER_SHADOW"..0x82A3,
        "SHADER_IMAGE_LOAD"..0x82A4,
        "SHADER_IMAGE_STORE"..0x82A5,
        "SHADER_IMAGE_ATOMIC"..0x82A6,
        "IMAGE_TEXEL_SIZE"..0x82A7,
        "IMAGE_COMPATIBILITY_CLASS"..0x82A8,
        "IMAGE_PIXEL_FORMAT"..0x82A9,
        "IMAGE_PIXEL_TYPE"..0x82AA,
        "SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST"..0x82AC,
        "SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST"..0x82AD,
        "SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE"..0x82AE,
        "SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE"..0x82AF,
        "TEXTURE_COMPRESSED_BLOCK_WIDTH"..0x82B1,
        "TEXTURE_COMPRESSED_BLOCK_HEIGHT"..0x82B2,
        "TEXTURE_COMPRESSED_BLOCK_SIZE"..0x82B3,
        "CLEAR_BUFFER"..0x82B4,
        "TEXTURE_VIEW"..0x82B5,
        "VIEW_COMPATIBILITY_CLASS"..0x82B6
    )

    IntConstant(
        "Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.",

        "FULL_SUPPORT"..0x82B7,
        "CAVEAT_SUPPORT"..0x82B8,
        "IMAGE_CLASS_4_X_32"..0x82B9,
        "IMAGE_CLASS_2_X_32"..0x82BA,
        "IMAGE_CLASS_1_X_32"..0x82BB,
        "IMAGE_CLASS_4_X_16"..0x82BC,
        "IMAGE_CLASS_2_X_16"..0x82BD,
        "IMAGE_CLASS_1_X_16"..0x82BE,
        "IMAGE_CLASS_4_X_8"..0x82BF,
        "IMAGE_CLASS_2_X_8"..0x82C0,
        "IMAGE_CLASS_1_X_8"..0x82C1,
        "IMAGE_CLASS_11_11_10"..0x82C2,
        "IMAGE_CLASS_10_10_10_2"..0x82C3,
        "VIEW_CLASS_128_BITS"..0x82C4,
        "VIEW_CLASS_96_BITS"..0x82C5,
        "VIEW_CLASS_64_BITS"..0x82C6,
        "VIEW_CLASS_48_BITS"..0x82C7,
        "VIEW_CLASS_32_BITS"..0x82C8,
        "VIEW_CLASS_24_BITS"..0x82C9,
        "VIEW_CLASS_16_BITS"..0x82CA,
        "VIEW_CLASS_8_BITS"..0x82CB,
        "VIEW_CLASS_S3TC_DXT1_RGB"..0x82CC,
        "VIEW_CLASS_S3TC_DXT1_RGBA"..0x82CD,
        "VIEW_CLASS_S3TC_DXT3_RGBA"..0x82CE,
        "VIEW_CLASS_S3TC_DXT5_RGBA"..0x82CF,
        "VIEW_CLASS_RGTC1_RED"..0x82D0,
        "VIEW_CLASS_RGTC2_RG"..0x82D1,
        "VIEW_CLASS_BPTC_UNORM"..0x82D2,
        "VIEW_CLASS_BPTC_FLOAT"..0x82D3
    )

    GL43C reuse "GetInternalformati64v"

    // ARB_invalidate_subdata

    GL43C reuse "InvalidateTexSubImage"
    GL43C reuse "InvalidateTexImage"
    GL43C reuse "InvalidateBufferSubData"
    GL43C reuse "InvalidateBufferData"
    GL43C reuse "InvalidateFramebuffer"
    GL43C reuse "InvalidateSubFramebuffer"

    // ARB_multi_draw_indirect

    GL43C reuse "MultiDrawArraysIndirect"
    GL43C reuse "MultiDrawElementsIndirect"

    // ARB_program_interface_query

    IntConstant(
        """
        Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
        GetProgramResourceLocation, and GetProgramResourceLocationIndex.
        """,

        "UNIFORM"..0x92E1,
        "UNIFORM_BLOCK"..0x92E2,
        "PROGRAM_INPUT"..0x92E3,
        "PROGRAM_OUTPUT"..0x92E4,
        "BUFFER_VARIABLE"..0x92E5,
        "SHADER_STORAGE_BLOCK"..0x92E6,
        "VERTEX_SUBROUTINE"..0x92E8,
        "TESS_CONTROL_SUBROUTINE"..0x92E9,
        "TESS_EVALUATION_SUBROUTINE"..0x92EA,
        "GEOMETRY_SUBROUTINE"..0x92EB,
        "FRAGMENT_SUBROUTINE"..0x92EC,
        "COMPUTE_SUBROUTINE"..0x92ED,
        "VERTEX_SUBROUTINE_UNIFORM"..0x92EE,
        "TESS_CONTROL_SUBROUTINE_UNIFORM"..0x92EF,
        "TESS_EVALUATION_SUBROUTINE_UNIFORM"..0x92F0,
        "GEOMETRY_SUBROUTINE_UNIFORM"..0x92F1,
        "FRAGMENT_SUBROUTINE_UNIFORM"..0x92F2,
        "COMPUTE_SUBROUTINE_UNIFORM"..0x92F3,
        "TRANSFORM_FEEDBACK_VARYING"..0x92F4
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramInterfaceiv.",

        "ACTIVE_RESOURCES"..0x92F5,
        "MAX_NAME_LENGTH"..0x92F6,
        "MAX_NUM_ACTIVE_VARIABLES"..0x92F7,
        "MAX_NUM_COMPATIBLE_SUBROUTINES"..0x92F8
    )

    IntConstant(
        "Accepted in the {@code props} array of GetProgramResourceiv.",

        "NAME_LENGTH"..0x92F9,
        "TYPE"..0x92FA,
        "ARRAY_SIZE"..0x92FB,
        "OFFSET"..0x92FC,
        "BLOCK_INDEX"..0x92FD,
        "ARRAY_STRIDE"..0x92FE,
        "MATRIX_STRIDE"..0x92FF,
        "IS_ROW_MAJOR"..0x9300,
        "ATOMIC_COUNTER_BUFFER_INDEX"..0x9301,
        "BUFFER_BINDING"..0x9302,
        "BUFFER_DATA_SIZE"..0x9303,
        "NUM_ACTIVE_VARIABLES"..0x9304,
        "ACTIVE_VARIABLES"..0x9305,
        "REFERENCED_BY_VERTEX_SHADER"..0x9306,
        "REFERENCED_BY_TESS_CONTROL_SHADER"..0x9307,
        "REFERENCED_BY_TESS_EVALUATION_SHADER"..0x9308,
        "REFERENCED_BY_GEOMETRY_SHADER"..0x9309,
        "REFERENCED_BY_FRAGMENT_SHADER"..0x930A,
        "REFERENCED_BY_COMPUTE_SHADER"..0x930B,
        "TOP_LEVEL_ARRAY_SIZE"..0x930C,
        "TOP_LEVEL_ARRAY_STRIDE"..0x930D,
        "LOCATION"..0x930E,
        "LOCATION_INDEX"..0x930F,
        "IS_PER_PATCH"..0x92E7
    )

    GL43C reuse "GetProgramInterfaceiv"
    GL43C reuse "GetProgramResourceIndex"
    GL43C reuse "GetProgramResourceName"
    GL43C reuse "GetProgramResourceiv"
    GL43C reuse "GetProgramResourceLocation"
    GL43C reuse "GetProgramResourceLocationIndex"

    // ARB_shader_storage_buffer_object

    IntConstant(
        "Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

        "SHADER_STORAGE_BUFFER"..0x90D2
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v,
        GetFloati_v, GetDoublei_v, and GetInteger64i_v.
        """,

        "SHADER_STORAGE_BUFFER_BINDING"..0x90D3
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.",

        "SHADER_STORAGE_BUFFER_START"..0x90D4,
        "SHADER_STORAGE_BUFFER_SIZE"..0x90D5
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_SHADER_STORAGE_BLOCKS"..0x90D6,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS"..0x90D7,
        "MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS"..0x90D8,
        "MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS"..0x90D9,
        "MAX_FRAGMENT_SHADER_STORAGE_BLOCKS"..0x90DA,
        "MAX_COMPUTE_SHADER_STORAGE_BLOCKS"..0x90DB,
        "MAX_COMBINED_SHADER_STORAGE_BLOCKS"..0x90DC,
        "MAX_SHADER_STORAGE_BUFFER_BINDINGS"..0x90DD,
        "MAX_SHADER_STORAGE_BLOCK_SIZE"..0x90DE,
        "SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT"..0x90DF
    )

    IntConstant(
        "Accepted in the {@code barriers} bitfield in glMemoryBarrier.",

        "SHADER_STORAGE_BARRIER_BIT"..0x2000
    )

    IntConstant(
        "Alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS.",

        "MAX_COMBINED_SHADER_OUTPUT_RESOURCES"..0x8F39
    )

    GL43C reuse "ShaderStorageBlockBinding"

    // ARB_stencil_texturing

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameter* and GetTexParameter*.",

        "DEPTH_STENCIL_TEXTURE_MODE"..0x90EA
    )

    // ARB_texture_buffer_range

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameter.",

        "TEXTURE_BUFFER_OFFSET"..0x919D,
        "TEXTURE_BUFFER_SIZE"..0x919E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "TEXTURE_BUFFER_OFFSET_ALIGNMENT"..0x919F
    )

    GL43C reuse "TexBufferRange"

    // ARB_texture_storage_multisample

    GL43C reuse "TexStorage2DMultisample"
    GL43C reuse "TexStorage3DMultisample"

    // ARB_texture_view

    IntConstant(
        "Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.",

        "TEXTURE_VIEW_MIN_LEVEL"..0x82DB,
        "TEXTURE_VIEW_NUM_LEVELS"..0x82DC,
        "TEXTURE_VIEW_MIN_LAYER"..0x82DD,
        "TEXTURE_VIEW_NUM_LAYERS"..0x82DE
    )

    GL43C reuse "TextureView"

    // ARB_vertex_attrib_binding

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttrib*v.",

        "VERTEX_ATTRIB_BINDING"..0x82D4,
        "VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D5
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.",

        "VERTEX_BINDING_DIVISOR"..0x82D6,
        "VERTEX_BINDING_OFFSET"..0x82D7,
        "VERTEX_BINDING_STRIDE"..0x82D8,
        "VERTEX_BINDING_BUFFER"..0x8F4F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, ....",

        "MAX_VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D9,
        "MAX_VERTEX_ATTRIB_BINDINGS"..0x82DA
    )

    GL43C reuse "BindVertexBuffer"
    GL43C reuse "VertexAttribFormat"
    GL43C reuse "VertexAttribIFormat"
    GL43C reuse "VertexAttribLFormat"
    GL43C reuse "VertexAttribBinding"
    GL43C reuse "VertexBindingDivisor"
}