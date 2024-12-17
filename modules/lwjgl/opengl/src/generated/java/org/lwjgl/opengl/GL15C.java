/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL15C extends GL14C {

    static { GL.initialize(); }

    public static final int GL_SRC1_ALPHA = 0x8589;

    public static final int
        GL_ARRAY_BUFFER         = 0x8892,
        GL_ELEMENT_ARRAY_BUFFER = 0x8893;

    public static final int
        GL_ARRAY_BUFFER_BINDING         = 0x8894,
        GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;

    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

    public static final int
        GL_STREAM_DRAW  = 0x88E0,
        GL_STREAM_READ  = 0x88E1,
        GL_STREAM_COPY  = 0x88E2,
        GL_STATIC_DRAW  = 0x88E4,
        GL_STATIC_READ  = 0x88E5,
        GL_STATIC_COPY  = 0x88E6,
        GL_DYNAMIC_DRAW = 0x88E8,
        GL_DYNAMIC_READ = 0x88E9,
        GL_DYNAMIC_COPY = 0x88EA;

    public static final int
        GL_READ_ONLY  = 0x88B8,
        GL_WRITE_ONLY = 0x88B9,
        GL_READ_WRITE = 0x88BA;

    public static final int
        GL_BUFFER_SIZE   = 0x8764,
        GL_BUFFER_USAGE  = 0x8765,
        GL_BUFFER_ACCESS = 0x88BB,
        GL_BUFFER_MAPPED = 0x88BC;

    public static final int GL_BUFFER_MAP_POINTER = 0x88BD;

    public static final int GL_SAMPLES_PASSED = 0x8914;

    public static final int
        GL_QUERY_COUNTER_BITS = 0x8864,
        GL_CURRENT_QUERY      = 0x8865;

    public static final int
        GL_QUERY_RESULT           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE = 0x8867;

    protected GL15C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindBuffer ] ---

    /** {@code void glBindBuffer(GLenum target, GLuint buffer)} */
    public static native void glBindBuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer);

    // --- [ glDeleteBuffers ] ---

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static native void nglDeleteBuffers(int n, long buffers);

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") IntBuffer buffers) {
        nglDeleteBuffers(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") int buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.ints(buffer);
            nglDeleteBuffers(1, memAddress(buffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenBuffers ] ---

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static native void nglGenBuffers(int n, long buffers);

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        nglGenBuffers(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    @NativeType("void")
    public static int glGenBuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglGenBuffers(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsBuffer ] ---

    /** {@code GLboolean glIsBuffer(GLuint buffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsBuffer(@NativeType("GLuint") int buffer);

    // --- [ glBufferData ] ---

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static native void nglBufferData(int target, long size, long data, int usage);

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        nglBufferData(target, size, NULL, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, data.remaining(), memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glBufferSubData ] ---

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static native void nglBufferSubData(int target, long offset, long size, long data);

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglBufferSubData(target, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glGetBufferSubData ] ---

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static native void nglGetBufferSubData(int target, long offset, long size, long data);

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetBufferSubData(target, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        nglGetBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        nglGetBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMapBuffer ] ---

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    public static native long nglMapBuffer(int target, int access);

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        long __result = nglMapBuffer(target, access);
        return memByteBufferSafe(__result, glGetBufferParameteri(target, GL_BUFFER_SIZE));
    }

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBuffer(target, access);
        int length = glGetBufferParameteri(target, GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBuffer(target, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapBuffer ] ---

    /** {@code GLboolean glUnmapBuffer(GLenum target)} */
    @NativeType("GLboolean")
    public static native boolean glUnmapBuffer(@NativeType("GLenum") int target);

    // --- [ glGetBufferParameteriv ] ---

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetBufferParameteriv(int target, int pname, long params);

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetBufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetBufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBufferPointerv ] ---

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    public static native void nglGetBufferPointerv(int target, int pname, long params);

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    public static void glGetBufferPointerv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointerv(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetBufferPointer(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointerv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenQueries ] ---

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static native void nglGenQueries(int n, long ids);

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void glGenQueries(@NativeType("GLuint *") IntBuffer ids) {
        nglGenQueries(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenQueries() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueries(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueries ] ---

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteQueries(int n, long ids);

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteQueries(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueries(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQuery ] ---

    /** {@code GLboolean glIsQuery(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsQuery(@NativeType("GLuint") int id);

    // --- [ glBeginQuery ] ---

    /** {@code void glBeginQuery(GLenum target, GLuint id)} */
    public static native void glBeginQuery(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glEndQuery ] ---

    /** {@code void glEndQuery(GLenum target)} */
    public static native void glEndQuery(@NativeType("GLenum") int target);

    // --- [ glGetQueryiv ] ---

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetQueryiv(int target, int pname, long params);

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryiv(target, pname, memAddress(params));
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectiv ] ---

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static native void nglGetQueryObjectiv(int id, int pname, long params);

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectiv(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") long params) {
        nglGetQueryObjectiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryObjecti(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectiv(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuiv ] ---

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static native void nglGetQueryObjectuiv(int id, int pname, long params);

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuiv(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") long params) {
        nglGetQueryObjectuiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectui(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuiv(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") int[] buffers) {
        long __functionAddress = GL.getICD().glDeleteBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffers(@NativeType("GLuint *") int[] buffers) {
        long __functionAddress = GL.getICD().glGenBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void glGenQueries(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

}