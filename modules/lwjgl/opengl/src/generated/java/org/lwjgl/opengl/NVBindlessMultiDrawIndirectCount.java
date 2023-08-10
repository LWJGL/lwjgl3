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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_bindless_multi_draw_indirect_count.txt">NV_bindless_multi_draw_indirect_count</a> extension.
 * 
 * <p>This extension adds the possibility to define the number of drawcalls within a multi-draw-indirect call from the GPU, as provided by
 * {@code ARB_indirect_parameters}, for the functions added in {@code NV_bindless_multi_draw_indirect}.</p>
 * 
 * <p>Requires {@link NVBindlessMultiDrawIndirect NV_bindless_multi_draw_indirect}, {@link ARBIndirectParameters ARB_indirect_parameters}.</p>
 */
public class NVBindlessMultiDrawIndirectCount {

    static { GL.initialize(); }

    protected NVBindlessMultiDrawIndirectCount() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectBindlessCountNV ] ---

    /** Unsafe version of: {@link #glMultiDrawArraysIndirectBindlessCountNV MultiDrawArraysIndirectBindlessCountNV} */
    public static native void nglMultiDrawArraysIndirectBindlessCountNV(int mode, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount);

    /**
     * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawArraysIndirectBindlessNV MultiDrawArraysIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
     * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
     * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
     * {@code maxDrawCount} parameter sets.
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect          an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)
     * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
     * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
     * @param stride            the size of one DrawArraysIndirectBindlessCommandNV structure
     * @param vertexBufferCount the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure
     */
    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, maxDrawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride));
        }
        nglMultiDrawArraysIndirectBindlessCountNV(mode, memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    /**
     * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawArraysIndirectBindlessNV MultiDrawArraysIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
     * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
     * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
     * {@code maxDrawCount} parameter sets.
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect          an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)
     * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
     * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
     * @param stride            the size of one DrawArraysIndirectBindlessCommandNV structure
     * @param vertexBufferCount the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure
     */
    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawArraysIndirectBindlessCountNV(mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    // --- [ glMultiDrawElementsIndirectBindlessCountNV ] ---

    /** Unsafe version of: {@link #glMultiDrawElementsIndirectBindlessCountNV MultiDrawElementsIndirectBindlessCountNV} */
    public static native void nglMultiDrawElementsIndirectBindlessCountNV(int mode, int type, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount);

    /**
     * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawElementsIndirectBindlessNV MultiDrawElementsIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
     * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
     * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
     * {@code maxDrawCount} parameter sets.
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type              the data type of the element indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect          an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)
     * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
     * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
     * @param stride            the size of one DrawElementsIndirectBindlessCommandNV structure
     * @param vertexBufferCount the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure
     */
    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, maxDrawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride));
        }
        nglMultiDrawElementsIndirectBindlessCountNV(mode, type, memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    /**
     * Behaves similarly to {@link NVBindlessMultiDrawIndirect#glMultiDrawElementsIndirectBindlessNV MultiDrawElementsIndirectBindlessNV}, except that {@code drawCount} defines an offset (in bytes) into
     * the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
     * If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
     * {@code maxDrawCount} parameter sets.
     *
     * @param mode              the primitive mode. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type              the data type of the element indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect          an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)
     * @param drawCount         the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4
     * @param maxDrawCount      the maximum number of draws that are expected to be stored in the buffer
     * @param stride            the size of one DrawElementsIndirectBindlessCommandNV structure
     * @param vertexBufferCount the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure
     */
    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawElementsIndirectBindlessCountNV(mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
    }

}