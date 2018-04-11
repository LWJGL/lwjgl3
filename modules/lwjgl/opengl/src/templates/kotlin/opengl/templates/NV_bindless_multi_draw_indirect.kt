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

        This extension combines NV_vertex_buffer_unified_memory and ARB_multi_draw_indirect to allow the processing of multiple drawing commands, whose vertex
        and index data can be sourced from arbitrary buffer locations, by a single function call.

        The NV_vertex_buffer_unified_memory extension provided a mechanism to specify vertex attrib and element array locations using GPU addresses. Prior to
        this extension, these addresses had to be set through explicit function calls. Now the ability to set the pointer addresses indirectly by extending the
        GL_ARB_draw_indirect mechanism has been added.

        Combined with other "bindless" extensions, such as NV_bindless_texture and NV_shader_buffer_load, it is now possible for the GPU to create draw
        commands that source all resource inputs, which are common to change frequently between draw calls from the GPU: vertex and index buffers, samplers,
        images and other shader input data stored in buffers.

        Requires ${GL43.core}, ${NV_vertex_buffer_unified_memory.link},
        """

    void(
        "MultiDrawArraysIndirectBindlessNV",
        """
        Behaves similar to #MultiDrawArraysIndirect(), except that {@code indirect} is treated as an array of {@code drawCount}
        DrawArraysIndirectBindlessCommandNV structures:
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

        GLenum.IN("mode", "the primitive mode", PRIMITIVE_TYPES),
        Check("drawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride)")..void.const.p.IN(
            "indirect",
            "an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)"
        ),
        GLsizei.IN("drawCount", "the number of structures in the {@code indirect} array"),
        GLsizei.IN("stride", "the size of one DrawArraysIndirectBindlessCommandNV structure"),
        GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure")
    )

    void(
        "MultiDrawElementsIndirectBindlessNV",
        """
        Behaves similar to #MultiDrawElementsIndirect(), except that {@code indirect} is treated as an array of {@code drawCount}
        DrawElementsIndirectBindlessCommandNV structures:
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

        GLenum.IN("mode", "the primitive mode", PRIMITIVE_TYPES),
        GLenum.IN("type", "the data type of the element indices", "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"),
        Check("drawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride)")..void.const.p.IN(
            "indirect",
            "an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)"
        ),
        GLsizei.IN("drawCount", "the number of structures in the {@code indirect} array"),
        GLsizei.IN("stride", "the size of one DrawElementsIndirectBindlessCommandNV structure"),
        GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure")
    )
}