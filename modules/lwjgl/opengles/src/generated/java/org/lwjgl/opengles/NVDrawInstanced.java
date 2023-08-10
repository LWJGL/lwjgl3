/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_draw_instanced.txt">NV_draw_instanced</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while limiting the number of required API calls, and
 * keeping the amount of duplicate data to a minimum.</p>
 * 
 * <p>This extension introduces two draw calls which are conceptually equivalent to a series of draw calls. Each conceptual call in this series is considered
 * an "instance" of the actual draw call.</p>
 * 
 * <p>This extension also introduces a read-only built-in variable to GLSL which contains the "instance ID." This variable initially contains 0, but
 * increases by one after each conceptual draw call.</p>
 * 
 * <p>By using the instance ID or multiples thereof as an index into a uniform array containing transform data, vertex shaders can draw multiple instances of
 * an object with a single draw call.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class NVDrawInstanced {

    static { GLES.initialize(); }

    protected NVDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedNV ] ---

    public static native void glDrawArraysInstancedNV(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedNV ] ---

    /**
     * Unsafe version of: {@link #glDrawElementsInstancedNV DrawElementsInstancedNV}
     *
     * @param type {@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE} {@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT} {@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}
     */
    public static native void nglDrawElementsInstancedNV(int mode, int count, int type, long indices, int primcount);

    /** @param type {@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE} {@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT} {@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, count, type, indices, primcount);
    }

    /** @param type {@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE} {@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT} {@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

}