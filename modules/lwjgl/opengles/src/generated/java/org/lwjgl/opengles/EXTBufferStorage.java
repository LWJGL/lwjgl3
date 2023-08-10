/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_buffer_storage.txt">EXT_buffer_storage</a> extension.
 * 
 * <p>OpenGL ES has long supported buffer objects as a means of storing data that may be used to source vertex attributes, pixel data for textures, uniforms
 * and other elements. In un-extended ES, buffer data stores are mutable - that is, they may be de-allocated or resized while they are in use. The
 * GL_EXT_texture_storage extension added immutable storage for texture objects (and was subsequently incorporated into OpenGL ES 3.0). This extension
 * further applies the concept of immutable storage to buffer objects. If an implementation is aware of a buffer's immutability, it may be able to make
 * certain assumptions or apply particular optimizations in order to increase performance or reliability.</p>
 * 
 * <p>Furthermore, this extension allows applications to pass additional information about a requested allocation to the implementation which it may use to
 * select memory heaps, caching behavior or allocation strategies.</p>
 * 
 * <p>Finally, this extension introduces the concept of persistent client mappings of buffer objects, which allow clients to retain pointers to a buffer's
 * data store returned as the result of a mapping, and to issue drawing commands while those mappings are in place.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public class EXTBufferStorage {

    static { GLES.initialize(); }

    /** Accepted in the {@code flags} parameter of BufferStorageEXT and NamedBufferStorageEXT. */
    public static final int
        GL_MAP_PERSISTENT_BIT_EXT  = 0x40,
        GL_MAP_COHERENT_BIT_EXT    = 0x80,
        GL_DYNAMIC_STORAGE_BIT_EXT = 0x100,
        GL_CLIENT_STORAGE_BIT_EXT  = 0x200;

    /** MAP_PERSISTENT_BIT_EXT 0x0040 (as above) MAP_COHERENT_BIT_EXT 0x0080 (as above) Accepted by the {@code pname} parameter of GetBufferParameter{i|i64}v. */
    public static final int
        GL_BUFFER_IMMUTABLE_STORAGE_EXT = 0x821F,
        GL_BUFFER_STORAGE_FLAGS_EXT     = 0x8220;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier. */
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT_EXT = 0x4000;

    protected EXTBufferStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorageEXT ] ---

    public static native void nglBufferStorageEXT(int target, long size, long data, int flags);

    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, size, NULL, flags);
    }

    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, data.remaining(), memAddress(data), flags);
    }

    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    // --- [ glNamedBufferStorageEXT ] ---

    public static native void nglNamedBufferStorageEXT(int buffer, long size, long data, int flags);

    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, size, NULL, flags);
    }

    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, data.remaining(), memAddress(data), flags);
    }

    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** Array version of: {@link #glBufferStorageEXT BufferStorageEXT} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /** Array version of: {@link #glBufferStorageEXT BufferStorageEXT} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** Array version of: {@link #glBufferStorageEXT BufferStorageEXT} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

}