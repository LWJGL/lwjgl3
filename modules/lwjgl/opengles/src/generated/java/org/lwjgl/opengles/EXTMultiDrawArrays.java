/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multi_draw_arrays.txt">EXT_multi_draw_arrays</a> extension.
 * 
 * <p>These functions behave identically to the standard OpenGL 1.1 functions glDrawArrays() and glDrawElements() except they handle multiple lists of
 * vertices in one call. Their main purpose is to allow one function call to render more than one primitive such as triangle strip, triangle fan, etc.</p>
 */
public class EXTMultiDrawArrays {

    static { GLES.initialize(); }

    protected EXTMultiDrawArrays() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysEXT ] ---

    public static native void nglMultiDrawArraysEXT(int mode, long first, long count, int drawcount);

    public static void glMultiDrawArraysEXT(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        if (CHECKS) {
            check(count, first.remaining());
        }
        nglMultiDrawArraysEXT(mode, memAddress(first), memAddress(count), first.remaining());
    }

    // --- [ glMultiDrawElementsEXT ] ---

    public static native void nglMultiDrawElementsEXT(int mode, long count, int type, long indices, int drawcount);

    public static void glMultiDrawElementsEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices) {
        if (CHECKS) {
            check(indices, count.remaining());
        }
        nglMultiDrawElementsEXT(mode, memAddress(count), type, memAddress(indices), count.remaining());
    }

    /** Array version of: {@link #glMultiDrawArraysEXT MultiDrawArraysEXT} */
    public static void glMultiDrawArraysEXT(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        long __functionAddress = GLES.getICD().glMultiDrawArraysEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(count, first.length);
        }
        callPPV(mode, first, count, first.length, __functionAddress);
    }

    /** Array version of: {@link #glMultiDrawElementsEXT MultiDrawElementsEXT} */
    public static void glMultiDrawElementsEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") int[] count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices) {
        long __functionAddress = GLES.getICD().glMultiDrawElementsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, count.length);
        }
        callPPV(mode, count, type, memAddress(indices), count.length, __functionAddress);
    }

}