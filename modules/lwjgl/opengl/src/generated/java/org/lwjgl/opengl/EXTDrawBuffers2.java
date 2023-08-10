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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_buffers2.txt">EXT_draw_buffers2</a> extension.
 * 
 * <p>This extension builds upon the ARB_draw_buffers extension and provides separate blend enables and color write masks for each color output. In
 * ARB_draw_buffers (part of OpenGL 2.0), separate values can be written to each color buffer, but the blend enable and color write mask are global and
 * apply to all color outputs.</p>
 * 
 * <p>While this extension does provide separate blend enables, it does not provide separate blend functions or blend equations per color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class EXTDrawBuffers2 {

    static { GL.initialize(); }

    protected EXTDrawBuffers2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glColorMaskIndexedEXT ] ---

    public static native void glColorMaskIndexedEXT(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glGetBooleanIndexedvEXT ] ---

    public static native void nglGetBooleanIndexedvEXT(int target, int index, long data);

    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleanIndexedvEXT(target, index, memAddress(data));
    }

    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleanIndexedvEXT(target, index, memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegerIndexedvEXT ] ---

    public static native void nglGetIntegerIndexedvEXT(int target, int index, long data);

    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegerIndexedvEXT(target, index, memAddress(data));
    }

    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegerIndexedvEXT(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableIndexedEXT ] ---

    public static native void glEnableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableIndexedEXT ] ---

    public static native void glDisableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glIsEnabledIndexedEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glIsEnabledIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    /** Array version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}