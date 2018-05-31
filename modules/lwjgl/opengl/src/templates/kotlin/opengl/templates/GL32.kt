/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL32 = "GL32".nativeClassGL("GL32") {
    extends = GL31
    documentation =
        """
        The OpenGL functionality up to version 3.2. Includes the deprecated symbols of the Compatibility Profile.

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

    GL32C reuse "GetBufferParameteri64v"

    // ARB_draw_elements_base_vertex

    GL32C reuse "DrawElementsBaseVertex"
    GL32C reuse "DrawRangeElementsBaseVertex"
    GL32C reuse "DrawElementsInstancedBaseVertex"
    GL32C reuse "MultiDrawElementsBaseVertex"

    // ARB_provoking_vertex

    IntConstant(
        "Accepted by the {@code mode} parameter of ProvokingVertex.",

        "FIRST_VERTEX_CONVENTION"..0x8E4D,
        "LAST_VERTEX_CONVENTION"..0x8E4E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PROVOKING_VERTEX"..0x8E4F,
        "QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION"..0x8E4C
    )

    GL32C reuse "ProvokingVertex"

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

    GL32C reuse "TexImage2DMultisample"
    GL32C reuse "TexImage3DMultisample"
    GL32C reuse "GetMultisamplefv"
    GL32C reuse "SampleMaski"

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

    GL32C reuse "FramebufferTexture"

    // ARB_sync

    IntConstant(
        "Accepted as the {@code pname} parameter of GetInteger64v.",

        "MAX_SERVER_WAIT_TIMEOUT"..0x9111
    )

    IntConstant(
        "Accepted as the {@code pname} parameter of GetSynciv.",

        "OBJECT_TYPE"..0x9112,
        "SYNC_CONDITION"..0x9113,
        "SYNC_STATUS"..0x9114,
        "SYNC_FLAGS"..0x9115
    )

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

    GL32C reuse "FenceSync"
    GL32C reuse "IsSync"
    GL32C reuse "DeleteSync"
    GL32C reuse "ClientWaitSync"
    GL32C reuse "WaitSync"
    GL32C reuse "GetInteger64v"
    GL32C reuse "GetInteger64i_v"
    GL32C reuse "GetSynciv"
}