/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_instanced.txt">EXT_draw_instanced</a> extension.
 * 
 * <p>This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
 * the vertex program to compute per-instance values, typically an object's transform.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class EXTDrawInstanced {

    static { GL.initialize(); }

    protected EXTDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedEXT ] ---

    public static native void glDrawArraysInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int start, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedEXT ] ---

    public static native void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount);

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

}