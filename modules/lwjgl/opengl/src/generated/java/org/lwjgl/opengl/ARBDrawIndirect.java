/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_indirect.txt">ARB_draw_indirect</a> extension.
 * 
 * <p>This extension provides a mechanism for supplying the arguments to a
 * DrawArraysInstanced or DrawElementsInstancedBaseVertex from buffer object
 * memory. This is not particularly useful for applications where the CPU
 * knows the values of the arguments beforehand, but is helpful when the
 * values will be generated on the GPU through any mechanism that can write
 * to a buffer object including image stores, atomic counters, or compute
 * interop. This allows the GPU to consume these arguments without a round-
 * trip to the CPU or the expensive synchronization that would involve. This
 * is similar to the DrawTransformFeedbackEXT command from
 * EXT_transform_feedback2, but offers much more flexibility in both
 * generating the arguments and in the type of Draws that can be accomplished.</p>
 * 
 * <p>Requires {@link GL31 OpenGL 3.1}. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBDrawIndirect {

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
     */
    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;

    static { GL.initialize(); }

    protected ARBDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glDrawArraysIndirect, caps.glDrawElementsIndirect
        );
    }

    // --- [ glDrawArraysIndirect ] ---

    /** Unsafe version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
    public static native void nglDrawArraysIndirect(int mode, long indirect);

    /**
     * Renders primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
     * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <code><pre>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint first;
     *     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
     * } DrawArraysIndirectCommand;
     * 
     * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
     * glDrawArraysInstancedBaseInstance(mode, cmd->first, cmd->count, cmd->primCount, cmd->baseInstance);</pre></code>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param indirect a structure containing the draw parameters
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 4 * 4);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    /**
     * Renders primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
     * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <code><pre>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint first;
     *     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
     * } DrawArraysIndirectCommand;
     * 
     * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
     * glDrawArraysInstancedBaseInstance(mode, cmd->first, cmd->count, cmd->primCount, cmd->baseInstance);</pre></code>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param indirect a structure containing the draw parameters
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        nglDrawArraysIndirect(mode, indirect);
    }

    /**
     * Renders primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
     * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <code><pre>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint first;
     *     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
     * } DrawArraysIndirectCommand;
     * 
     * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
     * glDrawArraysInstancedBaseInstance(mode, cmd->first, cmd->count, cmd->primCount, cmd->baseInstance);</pre></code>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param indirect a structure containing the draw parameters
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (4 * 4) >> 2);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    // --- [ glDrawElementsIndirect ] ---

    /** Unsafe version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
    public static native void nglDrawElementsIndirect(int mode, int type, long indirect);

    /**
     * Renders indexed primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
     * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <code><pre>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint firstIndex;
     *     uint baseVertex;
     *     uint baseInstance;
     * } DrawElementsIndirectCommand;</pre></code>
     * 
     * <p>{@code glDrawElementsIndirect} is equivalent to:</p>
     * 
     * <code><pre>
     * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
     *     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
     *     glDrawElementsInstancedBaseVertexBaseInstance(
     *         mode,
     *         cmd->count,
     *         type,
     *         cmd->firstIndex + size-of-type,
     *         cmd->primCount,
     *         cmd->baseVertex,
     *         cmd->baseInstance
     *     );
     * }</pre></code>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect the address of a structure containing the draw parameters
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 5 * 4);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    /**
     * Renders indexed primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
     * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <code><pre>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint firstIndex;
     *     uint baseVertex;
     *     uint baseInstance;
     * } DrawElementsIndirectCommand;</pre></code>
     * 
     * <p>{@code glDrawElementsIndirect} is equivalent to:</p>
     * 
     * <code><pre>
     * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
     *     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
     *     glDrawElementsInstancedBaseVertexBaseInstance(
     *         mode,
     *         cmd->count,
     *         type,
     *         cmd->firstIndex + size-of-type,
     *         cmd->primCount,
     *         cmd->baseVertex,
     *         cmd->baseInstance
     *     );
     * }</pre></code>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect the address of a structure containing the draw parameters
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        nglDrawElementsIndirect(mode, type, indirect);
    }

    /**
     * Renders indexed primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
     * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <code><pre>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint firstIndex;
     *     uint baseVertex;
     *     uint baseInstance;
     * } DrawElementsIndirectCommand;</pre></code>
     * 
     * <p>{@code glDrawElementsIndirect} is equivalent to:</p>
     * 
     * <code><pre>
     * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
     *     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
     *     glDrawElementsInstancedBaseVertexBaseInstance(
     *         mode,
     *         cmd->count,
     *         type,
     *         cmd->firstIndex + size-of-type,
     *         cmd->primCount,
     *         cmd->baseVertex,
     *         cmd->baseInstance
     *     );
     * }</pre></code>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect the address of a structure containing the draw parameters
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (5 * 4) >> 2);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    /** Array version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GL.getICD().glDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (4 * 4) >> 2);
        }
        callPV(__functionAddress, mode, indirect);
    }

    /** Array version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GL.getICD().glDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (5 * 4) >> 2);
        }
        callPV(__functionAddress, mode, type, indirect);
    }

}