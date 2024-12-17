/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBShaderAtomicCounters {

    static { GL.initialize(); }

    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;

    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;

    public static final int
        GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2,
        GL_ATOMIC_COUNTER_BUFFER_SIZE  = 0x92C3;

    public static final int
        GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE                            = 0x92C4,
        GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS               = 0x92C5,
        GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES        = 0x92C6,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER          = 0x92C7,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x92C8,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER        = 0x92CA,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER        = 0x92CB;

    public static final int
        GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS    = 0x92CD,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE,
        GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS        = 0x92CF,
        GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
        GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
        GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS           = 0x92D3,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS        = 0x92D4,
        GL_MAX_GEOMETRY_ATOMIC_COUNTERS               = 0x92D5,
        GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
        GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
        GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
        GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC;

    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;

    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;

    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;

    protected ARBShaderAtomicCounters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetActiveAtomicCounterBufferiv ] ---

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    public static void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
        GL42C.nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL42C.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveAtomicCounterBufferi(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname) {
        return GL42C.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
    }

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL42C.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

}