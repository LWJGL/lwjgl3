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

public class ARBVertexBufferObject {

    static { GL.initialize(); }

    public static final int
        GL_ARRAY_BUFFER_ARB         = 0x8892,
        GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;

    public static final int
        GL_ARRAY_BUFFER_BINDING_ARB                 = 0x8894,
        GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB         = 0x8895,
        GL_VERTEX_ARRAY_BUFFER_BINDING_ARB          = 0x8896,
        GL_NORMAL_ARRAY_BUFFER_BINDING_ARB          = 0x8897,
        GL_COLOR_ARRAY_BUFFER_BINDING_ARB           = 0x8898,
        GL_INDEX_ARRAY_BUFFER_BINDING_ARB           = 0x8899,
        GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB   = 0x889A,
        GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB       = 0x889B,
        GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C,
        GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB  = 0x889D,
        GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB          = 0x889E;

    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;

    public static final int
        GL_STREAM_DRAW_ARB  = 0x88E0,
        GL_STREAM_READ_ARB  = 0x88E1,
        GL_STREAM_COPY_ARB  = 0x88E2,
        GL_STATIC_DRAW_ARB  = 0x88E4,
        GL_STATIC_READ_ARB  = 0x88E5,
        GL_STATIC_COPY_ARB  = 0x88E6,
        GL_DYNAMIC_DRAW_ARB = 0x88E8,
        GL_DYNAMIC_READ_ARB = 0x88E9,
        GL_DYNAMIC_COPY_ARB = 0x88EA;

    public static final int
        GL_READ_ONLY_ARB  = 0x88B8,
        GL_WRITE_ONLY_ARB = 0x88B9,
        GL_READ_WRITE_ARB = 0x88BA;

    public static final int
        GL_BUFFER_SIZE_ARB   = 0x8764,
        GL_BUFFER_USAGE_ARB  = 0x8765,
        GL_BUFFER_ACCESS_ARB = 0x88BB,
        GL_BUFFER_MAPPED_ARB = 0x88BC;

    public static final int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;

    protected ARBVertexBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindBufferARB ] ---

    /** {@code void glBindBufferARB(GLenum target, GLuint buffer)} */
    public static native void glBindBufferARB(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer);

    // --- [ glDeleteBuffersARB ] ---

    /** {@code void glDeleteBuffersARB(GLsizei n, GLuint const * buffers)} */
    public static native void nglDeleteBuffersARB(int n, long buffers);

    /** {@code void glDeleteBuffersARB(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffersARB(@NativeType("GLuint const *") IntBuffer buffers) {
        nglDeleteBuffersARB(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glDeleteBuffersARB(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffersARB(@NativeType("GLuint const *") int buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.ints(buffer);
            nglDeleteBuffersARB(1, memAddress(buffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenBuffersARB ] ---

    /** {@code void glGenBuffersARB(GLsizei n, GLuint * buffers)} */
    public static native void nglGenBuffersARB(int n, long buffers);

    /** {@code void glGenBuffersARB(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffersARB(@NativeType("GLuint *") IntBuffer buffers) {
        nglGenBuffersARB(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glGenBuffersARB(GLsizei n, GLuint * buffers)} */
    @NativeType("void")
    public static int glGenBuffersARB() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglGenBuffersARB(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsBufferARB ] ---

    /** {@code GLboolean glIsBufferARB(GLuint buffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsBufferARB(@NativeType("GLuint") int buffer);

    // --- [ glBufferDataARB ] ---

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static native void nglBufferDataARB(int target, long size, long data, int usage);

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("GLsizeiptrARB") long size, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, size, NULL, usage);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, data.remaining(), memAddress(data), usage);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glBufferSubDataARB ] ---

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static native void nglBufferSubDataARB(int target, long offset, long size, long data);

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") ByteBuffer data) {
        nglBufferSubDataARB(target, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") ShortBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") IntBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") FloatBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glGetBufferSubDataARB ] ---

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static native void nglGetBufferSubDataARB(int target, long offset, long size, long data);

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetBufferSubDataARB(target, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") IntBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMapBufferARB ] ---

    /** {@code void * glMapBufferARB(GLenum target, GLenum access)} */
    public static native long nglMapBufferARB(int target, int access);

    /** {@code void * glMapBufferARB(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        long __result = nglMapBufferARB(target, access);
        return memByteBufferSafe(__result, glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB));
    }

    /** {@code void * glMapBufferARB(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferARB(target, access);
        int length = glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapBufferARB(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferARB(target, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapBufferARB ] ---

    /** {@code GLboolean glUnmapBufferARB(GLenum target)} */
    @NativeType("GLboolean")
    public static native boolean glUnmapBufferARB(@NativeType("GLenum") int target);

    // --- [ glGetBufferParameterivARB ] ---

    /** {@code void glGetBufferParameterivARB(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetBufferParameterivARB(int target, int pname, long params);

    /** {@code void glGetBufferParameterivARB(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameterivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameterivARB(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferParameterivARB(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetBufferParameteriARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetBufferParameterivARB(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBufferPointervARB ] ---

    /** {@code void glGetBufferPointervARB(GLenum target, GLenum pname, void ** params)} */
    public static native void nglGetBufferPointervARB(int target, int pname, long params);

    /** {@code void glGetBufferPointervARB(GLenum target, GLenum pname, void ** params)} */
    public static void glGetBufferPointervARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointervARB(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferPointervARB(GLenum target, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetBufferPointerARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointervARB(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glDeleteBuffersARB(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffersARB(@NativeType("GLuint const *") int[] buffers) {
        long __functionAddress = GL.getICD().glDeleteBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glGenBuffersARB(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffersARB(@NativeType("GLuint *") int[] buffers) {
        long __functionAddress = GL.getICD().glGenBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glBufferDataARB(GLenum target, GLsizeiptrARB size, void const * data, GLenum usage)} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void const * data)} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetBufferSubDataARB(GLenum target, GLintptrARB offset, GLsizeiptrARB size, void * data)} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetBufferParameterivARB(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameterivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameterivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}