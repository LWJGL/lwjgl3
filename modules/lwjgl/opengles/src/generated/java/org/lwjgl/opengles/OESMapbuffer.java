/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_mapbuffer.txt">OES_mapbuffer</a> extension.
 * 
 * <p>This extension adds to the vertex buffer object functionality supported by OpenGL ES 1.1 or ES 2.0 by allowing the entire data storage of a buffer
 * object to be mapped into the client's address space.</p>
 */
public class OESMapbuffer {

    static { GLES.initialize(); }

    /** Accepted by the {@code access} parameter of MapBufferOES. */
    public static final int GL_WRITE_ONLY_OES = 0x88B9;

    /** Accepted by the {@code value} parameter of GetBufferParameteriv. */
    public static final int
        GL_BUFFER_ACCESS_OES = 0x88BB,
        GL_BUFFER_MAPPED_OES = 0x88BC;

    /** Accepted by the {@code pname} parameter of GetBufferPointervOES. */
    public static final int GL_BUFFER_MAP_POINTER_OES = 0x88BD;

    protected OESMapbuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMapBufferOES ] ---

    public static native long nglMapBufferOES(int target, int access);

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        long __result = nglMapBufferOES(target, access);
        return memByteBufferSafe(__result, GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE));
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferOES(target, access);
        int length = GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferOES(target, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapBufferOES ] ---

    @NativeType("GLboolean")
    public static native boolean glUnmapBufferOES(@NativeType("GLenum") int target);

    // --- [ glGetBufferPointervOES ] ---

    public static native void nglGetBufferPointervOES(int target, int pname, long params);

    public static void glGetBufferPointervOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointervOES(target, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glGetBufferPointerOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointervOES(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}