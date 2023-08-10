/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_bindless_multi_draw_indirect.txt">NV_bindless_multi_draw_indirect</a> extension.
 * 
 * <p>This extension combines {@code NV_vertex_buffer_unified_memory} and {@code ARB_multi_draw_indirect} to allow the processing of multiple drawing
 * commands, whose vertex and index data can be sourced from arbitrary buffer locations, by a single function call.</p>
 * 
 * <p>The {@code NV_vertex_buffer_unified_memory} extension provided a mechanism to specify vertex attrib and element array locations using GPU addresses.
 * Prior to this extension, these addresses had to be set through explicit function calls. Now the ability to set the pointer addresses indirectly by
 * extending the {@link ARBDrawIndirect ARB_draw_indirect} mechanism has been added.</p>
 * 
 * <p>Combined with other "bindless" extensions, such as {@link NVBindlessTexture NV_bindless_texture} and {@link NVShaderBufferLoad NV_shader_buffer_load}, it is now possible for the GPU to
 * create draw commands that source all resource inputs, which are common to change frequently between draw calls from the GPU: vertex and index buffers,
 * samplers, images and other shader input data stored in buffers.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3} or {@link ARBMultiDrawIndirect ARB_multi_draw_indirect}, and {@link NVVertexBufferUnifiedMemory NV_vertex_buffer_unified_memory}.</p>
 */
public class NVBindlessMultiDrawIndirect {

    static { GL.initialize(); }

    protected NVBindlessMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectBindlessNV ] ---

    /** Unsafe version of: {@link #glMultiDrawArraysIndirectBindlessNV MultiDrawArraysIndirectBindlessNV} */
    public static native void nglMultiDrawArraysIndirectBindlessNV(int mode, long indirect, int drawCount, int stride, int vertexBufferCount);

    /**
     * Behaves similar to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code indirect} is treated as an array of {@code drawCount}
     * {@code DrawArraysIndirectBindlessCommandNV} structures:
     * 
     * <pre><code>
     * typedef struct {
     *   GLuint   index;
     *   GLuint   reserved;
     *   GLuint64 address;
     *   GLuint64 length;
     * } BindlessPtrNV;
     * 
     * typedef struct {
     *   DrawArraysIndirectCommand   cmd;
     *   BindlessPtrNV               vertexBuffers[];
     * } DrawArraysIndirectBindlessCommandNV;</code></pre>
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect          an array of {@code DrawArraysIndirectBindlessCommandNV} structures (see the extension spec for more information)
     * @param drawCount         the number of structures in the {@code indirect} array
     * @param stride            the size of one {@code DrawArraysIndirectBindlessCommandNV} structure
     * @param vertexBufferCount the number of vertex buffers in the {@code DrawArraysIndirectBindlessCommandNV} structure
     */
    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, drawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride));
        }
        nglMultiDrawArraysIndirectBindlessNV(mode, memAddress(indirect), drawCount, stride, vertexBufferCount);
    }

    /**
     * Behaves similar to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code indirect} is treated as an array of {@code drawCount}
     * {@code DrawArraysIndirectBindlessCommandNV} structures:
     * 
     * <pre><code>
     * typedef struct {
     *   GLuint   index;
     *   GLuint   reserved;
     *   GLuint64 address;
     *   GLuint64 length;
     * } BindlessPtrNV;
     * 
     * typedef struct {
     *   DrawArraysIndirectCommand   cmd;
     *   BindlessPtrNV               vertexBuffers[];
     * } DrawArraysIndirectBindlessCommandNV;</code></pre>
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect          an array of {@code DrawArraysIndirectBindlessCommandNV} structures (see the extension spec for more information)
     * @param drawCount         the number of structures in the {@code indirect} array
     * @param stride            the size of one {@code DrawArraysIndirectBindlessCommandNV} structure
     * @param vertexBufferCount the number of vertex buffers in the {@code DrawArraysIndirectBindlessCommandNV} structure
     */
    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawArraysIndirectBindlessNV(mode, indirect, drawCount, stride, vertexBufferCount);
    }

    // --- [ glMultiDrawElementsIndirectBindlessNV ] ---

    /** Unsafe version of: {@link #glMultiDrawElementsIndirectBindlessNV MultiDrawElementsIndirectBindlessNV} */
    public static native void nglMultiDrawElementsIndirectBindlessNV(int mode, int type, long indirect, int drawCount, int stride, int vertexBufferCount);

    /**
     * Behaves similar to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code indirect} is treated as an array of {@code drawCount}
     * {@code DrawElementsIndirectBindlessCommandNV} structures:
     * 
     * <pre><code>
     *  typedef struct {
     *   GLuint   index;
     *   GLuint   reserved;
     *   GLuint64 address;
     *   GLuint64 length;
     * } BindlessPtrNV;
     * 
     * typedef struct {
     *   DrawElementsIndirectCommand cmd;
     *   GLuint                      reserved;
     *   BindlessPtrNV               indexBuffer;
     *   BindlessPtrNV               vertexBuffers[];
     * } DrawElementsIndirectBindlessCommandNV;</code></pre>
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type              the data type of the element indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect          an array of {@code DrawElementsIndirectBindlessCommandNV} structures (see the extension spec for more information)
     * @param drawCount         the number of structures in the {@code indirect} array
     * @param stride            the size of one {@code DrawElementsIndirectBindlessCommandNV} structure
     * @param vertexBufferCount the number of vertex buffers in the {@code DrawElementsIndirectBindlessCommandNV} structure
     */
    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, drawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride));
        }
        nglMultiDrawElementsIndirectBindlessNV(mode, type, memAddress(indirect), drawCount, stride, vertexBufferCount);
    }

    /**
     * Behaves similar to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code indirect} is treated as an array of {@code drawCount}
     * {@code DrawElementsIndirectBindlessCommandNV} structures:
     * 
     * <pre><code>
     *  typedef struct {
     *   GLuint   index;
     *   GLuint   reserved;
     *   GLuint64 address;
     *   GLuint64 length;
     * } BindlessPtrNV;
     * 
     * typedef struct {
     *   DrawElementsIndirectCommand cmd;
     *   GLuint                      reserved;
     *   BindlessPtrNV               indexBuffer;
     *   BindlessPtrNV               vertexBuffers[];
     * } DrawElementsIndirectBindlessCommandNV;</code></pre>
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type              the data type of the element indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect          an array of {@code DrawElementsIndirectBindlessCommandNV} structures (see the extension spec for more information)
     * @param drawCount         the number of structures in the {@code indirect} array
     * @param stride            the size of one {@code DrawElementsIndirectBindlessCommandNV} structure
     * @param vertexBufferCount the number of vertex buffers in the {@code DrawElementsIndirectBindlessCommandNV} structure
     */
    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawElementsIndirectBindlessNV(mode, type, indirect, drawCount, stride, vertexBufferCount);
    }

}