/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_bindless_multi_draw_indirect_count = "NVBindlessMultiDrawIndirectCount".nativeClassGL("NV_bindless_multi_draw_indirect_count", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds the possibility to define the number of drawcalls within a multi-draw-indirect call from the GPU, as provided by
        {@code ARB_indirect_parameters}, for the functions added in {@code NV_bindless_multi_draw_indirect}.

        Requires ${NV_bindless_multi_draw_indirect.link}, ${ARB_indirect_parameters.link}.
        """

    void(
        "MultiDrawArraysIndirectBindlessCountNV",
        """
        Behaves similarly to #MultiDrawArraysIndirectBindlessNV(), except that {@code drawCount} defines an offset (in bytes) into
        the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
        If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
        {@code maxDrawCount} parameter sets.
        """,

        GLenum("mode", "the primitive mode", PRIMITIVE_TYPES),
        Check("maxDrawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride)")..RawPointer..void.const.p(
            "indirect",
            "an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)"
        ),
        GLintptr("drawCount", "the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4"),
        GLsizei("maxDrawCount", "the maximum number of draws that are expected to be stored in the buffer"),
        GLsizei("stride", "the size of one DrawArraysIndirectBindlessCommandNV structure"),
        GLint("vertexBufferCount", "the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure")
    )

    void(
        "MultiDrawElementsIndirectBindlessCountNV",
        """
        Behaves similarly to #MultiDrawElementsIndirectBindlessNV(), except that {@code drawCount} defines an offset (in bytes) into
        the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
        If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
        {@code maxDrawCount} parameter sets.
        """,

        GLenum("mode", "the primitive mode", PRIMITIVE_TYPES),
        GLenum("type", "the data type of the element indices", "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"),
        Check("maxDrawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride)")..RawPointer..void.const.p(
            "indirect",
            "an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)"
        ),
        GLintptr("drawCount", "the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4"),
        GLsizei("maxDrawCount", "the maximum number of draws that are expected to be stored in the buffer"),
        GLsizei("stride", "the size of one DrawElementsIndirectBindlessCommandNV structure"),
        GLint("vertexBufferCount", "the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure")
    )
}