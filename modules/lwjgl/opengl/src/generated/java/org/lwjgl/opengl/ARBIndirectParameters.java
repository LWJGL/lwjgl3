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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_indirect_parameters.txt">ARB_indirect_parameters</a> extension.
 * 
 * <p>OpenGL 4.3 (with the introduction of the {@link ARBMultiDrawIndirect ARB_multi_draw_indirect} extension) enhanced the ability of OpenGL to allow a large sets of parameters
 * for indirect draws (introduced with OpenGL 4.0) into a buffer object and dispatch the entire list with one API call. This allows, for example, a shader
 * (such as a compute shader via shader storage buffers, or a geometry shader via transform feedback) to produce lists of draw commands that can then be
 * consumed by OpenGL without a server-client round trip. However, when a variable and potentially unknown number of draws are produced by such a shader,
 * it becomes difficult to know how many draws are in the output array(s). Applications must resort to techniques such as transform feedback primitive
 * queries, or mapping buffers containing the content of atomic counters, which can cause stalls or bubbles in the OpenGL pipeline.</p>
 * 
 * <p>This extension introduces the concept of the "parameter buffer", which is a target allowing buffers to store parameters for certain drawing commands.
 * Also in this extension, new variants of {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect} and {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect} are introduced that source some of their
 * parameters from this buffer. Further commands could potentially be introduced that source other parameters from a buffer.</p>
 * 
 * <p>Requires {@link GL42 OpenGL 4.2}.</p>
 */
public class ARBIndirectParameters {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
     */
    public static final int GL_PARAMETER_BUFFER_ARB = 0x80EE;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;

    protected ARBIndirectParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectCountARB ] ---

    /** Unsafe version of: {@link #glMultiDrawArraysIndirectCountARB MultiDrawArraysIndirectCountARB} */
    public static native void nglMultiDrawArraysIndirectCountARB(int mode, long indirect, long drawcount, int maxdrawcount, int stride);

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect     an array of structures containing the draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (4 * 4) : stride));
        }
        nglMultiDrawArraysIndirectCountARB(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect     an array of structures containing the draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawArraysIndirectCountARB(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect     an array of structures containing the draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        nglMultiDrawArraysIndirectCountARB(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirectCountARB ] ---

    /** Unsafe version of: {@link #glMultiDrawElementsIndirectCountARB MultiDrawElementsIndirectCountARB} */
    public static native void nglMultiDrawElementsIndirectCountARB(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride);

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect     a structure containing an array of draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (5 * 4) : stride));
        }
        nglMultiDrawElementsIndirectCountARB(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect     a structure containing an array of draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawElementsIndirectCountARB(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect     a structure containing an array of draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        nglMultiDrawElementsIndirectCountARB(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /** Array version of: {@link #glMultiDrawArraysIndirectCountARB MultiDrawArraysIndirectCountARB} */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectCountARB;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        callPPV(mode, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

    /** Array version of: {@link #glMultiDrawElementsIndirectCountARB MultiDrawElementsIndirectCountARB} */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectCountARB;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        callPPV(mode, type, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

}