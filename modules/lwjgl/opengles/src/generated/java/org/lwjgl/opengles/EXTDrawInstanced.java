/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_instanced.txt">EXT_draw_instanced</a> extension.
 * 
 * <p>This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
 * the vertex program to compute per-instance values, typically an object's transform.</p>
 */
public class EXTDrawInstanced {

    static { GLES.initialize(); }

    protected EXTDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedEXT ] ---

    public static void glDrawArraysInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int start, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawArraysInstancedEXT(mode, start, count, primcount);
    }

    // --- [ glDrawElementsInstancedEXT ] ---

    public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
        EXTInstancedArrays.nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, type, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, indices, primcount);
    }

}