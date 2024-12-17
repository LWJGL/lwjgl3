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

public class GL15 extends GL14 {

    static { GL.initialize(); }

    public static final int
        GL_FOG_COORD_SRC                  = 0x8450,
        GL_FOG_COORD                      = 0x8451,
        GL_CURRENT_FOG_COORD              = 0x8453,
        GL_FOG_COORD_ARRAY_TYPE           = 0x8454,
        GL_FOG_COORD_ARRAY_STRIDE         = 0x8455,
        GL_FOG_COORD_ARRAY_POINTER        = 0x8456,
        GL_FOG_COORD_ARRAY                = 0x8457,
        GL_FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D,
        GL_SRC0_RGB                       = 0x8580,
        GL_SRC1_RGB                       = 0x8581,
        GL_SRC2_RGB                       = 0x8582,
        GL_SRC0_ALPHA                     = 0x8588,
        GL_SRC1_ALPHA                     = 0x8589,
        GL_SRC2_ALPHA                     = 0x858A;

    public static final int
        GL_ARRAY_BUFFER         = 0x8892,
        GL_ELEMENT_ARRAY_BUFFER = 0x8893;

    public static final int
        GL_ARRAY_BUFFER_BINDING                 = 0x8894,
        GL_ELEMENT_ARRAY_BUFFER_BINDING         = 0x8895,
        GL_VERTEX_ARRAY_BUFFER_BINDING          = 0x8896,
        GL_NORMAL_ARRAY_BUFFER_BINDING          = 0x8897,
        GL_COLOR_ARRAY_BUFFER_BINDING           = 0x8898,
        GL_INDEX_ARRAY_BUFFER_BINDING           = 0x8899,
        GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING   = 0x889A,
        GL_EDGE_FLAG_ARRAY_BUFFER_BINDING       = 0x889B,
        GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C,
        GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING  = 0x889D,
        GL_WEIGHT_ARRAY_BUFFER_BINDING          = 0x889E;

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

    protected GL15() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindBuffer ] ---

    /** {@code void glBindBuffer(GLenum target, GLuint buffer)} */
    public static void glBindBuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer) {
        GL15C.glBindBuffer(target, buffer);
    }

    // --- [ glDeleteBuffers ] ---

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void nglDeleteBuffers(int n, long buffers) {
        GL15C.nglDeleteBuffers(n, buffers);
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") IntBuffer buffers) {
        GL15C.glDeleteBuffers(buffers);
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") int buffer) {
        GL15C.glDeleteBuffers(buffer);
    }

    // --- [ glGenBuffers ] ---

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void nglGenBuffers(int n, long buffers) {
        GL15C.nglGenBuffers(n, buffers);
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        GL15C.glGenBuffers(buffers);
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    @NativeType("void")
    public static int glGenBuffers() {
        return GL15C.glGenBuffers();
    }

    // --- [ glIsBuffer ] ---

    /** {@code GLboolean glIsBuffer(GLuint buffer)} */
    @NativeType("GLboolean")
    public static boolean glIsBuffer(@NativeType("GLuint") int buffer) {
        return GL15C.glIsBuffer(buffer);
    }

    // --- [ glBufferData ] ---

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void nglBufferData(int target, long size, long data, int usage) {
        GL15C.nglBufferData(target, size, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, size, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    // --- [ glBufferSubData ] ---

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void nglBufferSubData(int target, long offset, long size, long data) {
        GL15C.nglBufferSubData(target, offset, size, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    // --- [ glGetBufferSubData ] ---

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void nglGetBufferSubData(int target, long offset, long size, long data) {
        GL15C.nglGetBufferSubData(target, offset, size, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    // --- [ glMapBuffer ] ---

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    public static long nglMapBuffer(int target, int access) {
        return GL15C.nglMapBuffer(target, access);
    }

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        return GL15C.glMapBuffer(target, access);
    }

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        return GL15C.glMapBuffer(target, access, old_buffer);
    }

    /** {@code void * glMapBuffer(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        return GL15C.glMapBuffer(target, access, length, old_buffer);
    }

    // --- [ glUnmapBuffer ] ---

    /** {@code GLboolean glUnmapBuffer(GLenum target)} */
    @NativeType("GLboolean")
    public static boolean glUnmapBuffer(@NativeType("GLenum") int target) {
        return GL15C.glUnmapBuffer(target);
    }

    // --- [ glGetBufferParameteriv ] ---

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetBufferParameteriv(int target, int pname, long params) {
        GL15C.nglGetBufferParameteriv(target, pname, params);
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL15C.glGetBufferParameteriv(target, pname, params);
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetBufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL15C.glGetBufferParameteri(target, pname);
    }

    // --- [ glGetBufferPointerv ] ---

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    public static void nglGetBufferPointerv(int target, int pname, long params) {
        GL15C.nglGetBufferPointerv(target, pname, params);
    }

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    public static void glGetBufferPointerv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        GL15C.glGetBufferPointerv(target, pname, params);
    }

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetBufferPointer(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL15C.glGetBufferPointer(target, pname);
    }

    // --- [ glGenQueries ] ---

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void nglGenQueries(int n, long ids) {
        GL15C.nglGenQueries(n, ids);
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void glGenQueries(@NativeType("GLuint *") IntBuffer ids) {
        GL15C.glGenQueries(ids);
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenQueries() {
        return GL15C.glGenQueries();
    }

    // --- [ glDeleteQueries ] ---

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void nglDeleteQueries(int n, long ids) {
        GL15C.nglDeleteQueries(n, ids);
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") IntBuffer ids) {
        GL15C.glDeleteQueries(ids);
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") int id) {
        GL15C.glDeleteQueries(id);
    }

    // --- [ glIsQuery ] ---

    /** {@code GLboolean glIsQuery(GLuint id)} */
    @NativeType("GLboolean")
    public static boolean glIsQuery(@NativeType("GLuint") int id) {
        return GL15C.glIsQuery(id);
    }

    // --- [ glBeginQuery ] ---

    /** {@code void glBeginQuery(GLenum target, GLuint id)} */
    public static void glBeginQuery(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        GL15C.glBeginQuery(target, id);
    }

    // --- [ glEndQuery ] ---

    /** {@code void glEndQuery(GLenum target)} */
    public static void glEndQuery(@NativeType("GLenum") int target) {
        GL15C.glEndQuery(target);
    }

    // --- [ glGetQueryiv ] ---

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetQueryiv(int target, int pname, long params) {
        GL15C.nglGetQueryiv(target, pname, params);
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL15C.glGetQueryiv(target, pname, params);
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL15C.glGetQueryi(target, pname);
    }

    // --- [ glGetQueryObjectiv ] ---

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void nglGetQueryObjectiv(int id, int pname, long params) {
        GL15C.nglGetQueryObjectiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL15C.glGetQueryObjectiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") long params) {
        GL15C.glGetQueryObjectiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryObjecti(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL15C.glGetQueryObjecti(id, pname);
    }

    // --- [ glGetQueryObjectuiv ] ---

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void nglGetQueryObjectuiv(int id, int pname, long params) {
        GL15C.nglGetQueryObjectuiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL15C.glGetQueryObjectuiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") long params) {
        GL15C.glGetQueryObjectuiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectui(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL15C.glGetQueryObjectui(id, pname);
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") int[] buffers) {
        GL15C.glDeleteBuffers(buffers);
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffers(@NativeType("GLuint *") int[] buffers) {
        GL15C.glGenBuffers(buffers);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL15C.glGetBufferParameteriv(target, pname, params);
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void glGenQueries(@NativeType("GLuint *") int[] ids) {
        GL15C.glGenQueries(ids);
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") int[] ids) {
        GL15C.glDeleteQueries(ids);
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL15C.glGetQueryiv(target, pname, params);
    }

    /** {@code void glGetQueryObjectiv(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL15C.glGetQueryObjectiv(id, pname, params);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL15C.glGetQueryObjectuiv(id, pname, params);
    }

}