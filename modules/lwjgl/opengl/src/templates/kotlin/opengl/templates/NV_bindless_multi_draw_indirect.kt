/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_bindless_multi_draw_indirect = "NVBindlessMultiDrawIndirect".nativeClassGL("NV_bindless_multi_draw_indirect", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension combines {@code NV_vertex_buffer_unified_memory} and {@code ARB_multi_draw_indirect} to allow the processing of multiple drawing
        commands, whose vertex and index data can be sourced from arbitrary buffer locations, by a single function call.

        The {@code NV_vertex_buffer_unified_memory} extension provided a mechanism to specify vertex attrib and element array locations using GPU addresses.
        Prior to this extension, these addresses had to be set through explicit function calls. Now the ability to set the pointer addresses indirectly by
        extending the ${ARB_draw_indirect.link} mechanism has been added.

        Combined with other "bindless" extensions, such as ${NV_bindless_texture.link} and ${NV_shader_buffer_load.link}, it is now possible for the GPU to
        create draw commands that source all resource inputs, which are common to change frequently between draw calls from the GPU: vertex and index buffers,
        samplers, images and other shader input data stored in buffers.

        Requires ${GL43.core} or ${ARB_multi_draw_indirect.link}, and ${NV_vertex_buffer_unified_memory.link}.
        """

    void(
        "MultiDrawArraysIndirectBindlessNV",
        """
        Behaves similar to #MultiDrawArraysIndirect(), except that {@code indirect} is treated as an array of {@code drawCount}
        {@code DrawArraysIndirectBindlessCommandNV} structures:
        ${codeBlock("""
typedef struct {
  GLuint   index;
  GLuint   reserved;
  GLuint64 address;
  GLuint64 length;
} BindlessPtrNV;

typedef struct {
  DrawArraysIndirectCommand   cmd;
  BindlessPtrNV               vertexBuffers[];
} DrawArraysIndirectBindlessCommandNV;"""
        )}
        """,

        GLenum("mode", "the primitive mode", PRIMITIVE_TYPES),
        Check("drawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride)")..RawPointer..void.const.p(
            "indirect",
            "an array of {@code DrawArraysIndirectBindlessCommandNV} structures (see the extension spec for more information)"
        ),
        GLsizei("drawCount", "the number of structures in the {@code indirect} array"),
        GLsizei("stride", "the size of one {@code DrawArraysIndirectBindlessCommandNV} structure"),
        GLint("vertexBufferCount", "the number of vertex buffers in the {@code DrawArraysIndirectBindlessCommandNV} structure")
    )

    void(
        "MultiDrawElementsIndirectBindlessNV",
        """
        Behaves similar to #MultiDrawElementsIndirect(), except that {@code indirect} is treated as an array of {@code drawCount}
        {@code DrawElementsIndirectBindlessCommandNV} structures:
        ${codeBlock("""
 typedef struct {
  GLuint   index;
  GLuint   reserved;
  GLuint64 address;
  GLuint64 length;
} BindlessPtrNV;

typedef struct {
  DrawElementsIndirectCommand cmd;
  GLuint                      reserved;
  BindlessPtrNV               indexBuffer;
  BindlessPtrNV               vertexBuffers[];
} DrawElementsIndirectBindlessCommandNV;""")}
        """,

        GLenum("mode", "the primitive mode", PRIMITIVE_TYPES),
        GLenum("type", "the data type of the element indices", "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"),
        Check("drawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride)")..RawPointer..void.const.p(
            "indirect",
            "an array of {@code DrawElementsIndirectBindlessCommandNV} structures (see the extension spec for more information)"
        ),
        GLsizei("drawCount", "the number of structures in the {@code indirect} array"),
        GLsizei("stride", "the size of one {@code DrawElementsIndirectBindlessCommandNV} structure"),
        GLint("vertexBufferCount", "the number of vertex buffers in the {@code DrawElementsIndirectBindlessCommandNV} structure")
    )
}