/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVCommandList {

    static { GL.initialize(); }

    public static final int
        GL_TERMINATE_SEQUENCE_COMMAND_NV      = 0x0,
        GL_NOP_COMMAND_NV                     = 0x1,
        GL_DRAW_ELEMENTS_COMMAND_NV           = 0x2,
        GL_DRAW_ARRAYS_COMMAND_NV             = 0x3,
        GL_DRAW_ELEMENTS_STRIP_COMMAND_NV     = 0x4,
        GL_DRAW_ARRAYS_STRIP_COMMAND_NV       = 0x5,
        GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x6,
        GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV   = 0x7,
        GL_ELEMENT_ADDRESS_COMMAND_NV         = 0x8,
        GL_ATTRIBUTE_ADDRESS_COMMAND_NV       = 0x9,
        GL_UNIFORM_ADDRESS_COMMAND_NV         = 0xA,
        GL_BLEND_COLOR_COMMAND_NV             = 0xB,
        GL_STENCIL_REF_COMMAND_NV             = 0xC,
        GL_LINE_WIDTH_COMMAND_NV              = 0xD,
        GL_POLYGON_OFFSET_COMMAND_NV          = 0xE,
        GL_ALPHA_REF_COMMAND_NV               = 0xF,
        GL_VIEWPORT_COMMAND_NV                = 0x10,
        GL_SCISSOR_COMMAND_NV                 = 0x11,
        GL_FRONT_FACE_COMMAND_NV              = 0x12;

    protected NVCommandList() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateStatesNV ] ---

    /** {@code void glCreateStatesNV(GLsizei n, GLuint * states)} */
    public static native void nglCreateStatesNV(int n, long states);

    /** {@code void glCreateStatesNV(GLsizei n, GLuint * states)} */
    public static void glCreateStatesNV(@NativeType("GLuint *") IntBuffer states) {
        nglCreateStatesNV(states.remaining(), memAddress(states));
    }

    /** {@code void glCreateStatesNV(GLsizei n, GLuint * states)} */
    @NativeType("void")
    public static int glCreateStatesNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer states = stack.callocInt(1);
            nglCreateStatesNV(1, memAddress(states));
            return states.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteStatesNV ] ---

    /** {@code void glDeleteStatesNV(GLsizei n, GLuint const * states)} */
    public static native void nglDeleteStatesNV(int n, long states);

    /** {@code void glDeleteStatesNV(GLsizei n, GLuint const * states)} */
    public static void glDeleteStatesNV(@NativeType("GLuint const *") IntBuffer states) {
        nglDeleteStatesNV(states.remaining(), memAddress(states));
    }

    /** {@code void glDeleteStatesNV(GLsizei n, GLuint const * states)} */
    public static void glDeleteStatesNV(@NativeType("GLuint const *") int state) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer states = stack.ints(state);
            nglDeleteStatesNV(1, memAddress(states));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsStateNV ] ---

    /** {@code GLboolean glIsStateNV(GLuint state)} */
    @NativeType("GLboolean")
    public static native boolean glIsStateNV(@NativeType("GLuint") int state);

    // --- [ glStateCaptureNV ] ---

    /** {@code void glStateCaptureNV(GLuint state, GLenum mode)} */
    public static native void glStateCaptureNV(@NativeType("GLuint") int state, @NativeType("GLenum") int mode);

    // --- [ glGetCommandHeaderNV ] ---

    /** {@code GLuint glGetCommandHeaderNV(GLenum tokenID, GLuint size)} */
    @NativeType("GLuint")
    public static native int glGetCommandHeaderNV(@NativeType("GLenum") int tokenID, @NativeType("GLuint") int size);

    // --- [ glGetStageIndexNV ] ---

    /** {@code GLushort glGetStageIndexNV(GLenum shadertype)} */
    @NativeType("GLushort")
    public static native short glGetStageIndexNV(@NativeType("GLenum") int shadertype);

    // --- [ glDrawCommandsNV ] ---

    /** {@code void glDrawCommandsNV(GLenum primitiveMode, GLuint buffer, GLintptr const * indirects, GLsizei const * sizes, GLuint count)} */
    public static native void nglDrawCommandsNV(int primitiveMode, int buffer, long indirects, long sizes, int count);

    /** {@code void glDrawCommandsNV(GLenum primitiveMode, GLuint buffer, GLintptr const * indirects, GLsizei const * sizes, GLuint count)} */
    public static void glDrawCommandsNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
        }
        nglDrawCommandsNV(primitiveMode, buffer, memAddress(indirects), memAddress(sizes), indirects.remaining());
    }

    // --- [ glDrawCommandsAddressNV ] ---

    /** {@code void glDrawCommandsAddressNV(GLenum primitiveMode, GLuint64 const * indirects, GLsizei const * sizes, GLuint count)} */
    public static native void nglDrawCommandsAddressNV(int primitiveMode, long indirects, long sizes, int count);

    /** {@code void glDrawCommandsAddressNV(GLenum primitiveMode, GLuint64 const * indirects, GLsizei const * sizes, GLuint count)} */
    public static void glDrawCommandsAddressNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint64 const *") LongBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
        }
        nglDrawCommandsAddressNV(primitiveMode, memAddress(indirects), memAddress(sizes), indirects.remaining());
    }

    // --- [ glDrawCommandsStatesNV ] ---

    /** {@code void glDrawCommandsStatesNV(GLuint buffer, GLintptr const * indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static native void nglDrawCommandsStatesNV(int buffer, long indirects, long sizes, long states, long fbos, int count);

    /** {@code void glDrawCommandsStatesNV(GLuint buffer, GLintptr const * indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static void glDrawCommandsStatesNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        nglDrawCommandsStatesNV(buffer, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
    }

    // --- [ glDrawCommandsStatesAddressNV ] ---

    /** {@code void glDrawCommandsStatesAddressNV(GLuint64 const * indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static native void nglDrawCommandsStatesAddressNV(long indirects, long sizes, long states, long fbos, int count);

    /** {@code void glDrawCommandsStatesAddressNV(GLuint64 const * indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static void glDrawCommandsStatesAddressNV(@NativeType("GLuint64 const *") LongBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        nglDrawCommandsStatesAddressNV(memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
    }

    // --- [ glCreateCommandListsNV ] ---

    /** {@code void glCreateCommandListsNV(GLsizei n, GLuint * lists)} */
    public static native void nglCreateCommandListsNV(int n, long lists);

    /** {@code void glCreateCommandListsNV(GLsizei n, GLuint * lists)} */
    public static void glCreateCommandListsNV(@NativeType("GLuint *") IntBuffer lists) {
        nglCreateCommandListsNV(lists.remaining(), memAddress(lists));
    }

    /** {@code void glCreateCommandListsNV(GLsizei n, GLuint * lists)} */
    @NativeType("void")
    public static int glCreateCommandListsNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer lists = stack.callocInt(1);
            nglCreateCommandListsNV(1, memAddress(lists));
            return lists.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteCommandListsNV ] ---

    /** {@code void glDeleteCommandListsNV(GLsizei n, GLuint const * lists)} */
    public static native void nglDeleteCommandListsNV(int n, long lists);

    /** {@code void glDeleteCommandListsNV(GLsizei n, GLuint const * lists)} */
    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") IntBuffer lists) {
        nglDeleteCommandListsNV(lists.remaining(), memAddress(lists));
    }

    /** {@code void glDeleteCommandListsNV(GLsizei n, GLuint const * lists)} */
    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") int list) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer lists = stack.ints(list);
            nglDeleteCommandListsNV(1, memAddress(lists));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsCommandListNV ] ---

    /** {@code GLboolean glIsCommandListNV(GLuint list)} */
    @NativeType("GLboolean")
    public static native boolean glIsCommandListNV(@NativeType("GLuint") int list);

    // --- [ glListDrawCommandsStatesClientNV ] ---

    /** {@code void glListDrawCommandsStatesClientNV(GLuint list, GLuint segment, void const ** indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static native void nglListDrawCommandsStatesClientNV(int list, int segment, long indirects, long sizes, long states, long fbos, int count);

    /** {@code void glListDrawCommandsStatesClientNV(GLuint list, GLuint segment, void const ** indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static void glListDrawCommandsStatesClientNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segment, @NativeType("void const **") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        nglListDrawCommandsStatesClientNV(list, segment, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
    }

    // --- [ glCommandListSegmentsNV ] ---

    /** {@code void glCommandListSegmentsNV(GLuint list, GLuint segments)} */
    public static native void glCommandListSegmentsNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segments);

    // --- [ glCompileCommandListNV ] ---

    /** {@code void glCompileCommandListNV(GLuint list)} */
    public static native void glCompileCommandListNV(@NativeType("GLuint") int list);

    // --- [ glCallCommandListNV ] ---

    /** {@code void glCallCommandListNV(GLuint list)} */
    public static native void glCallCommandListNV(@NativeType("GLuint") int list);

    /** {@code void glCreateStatesNV(GLsizei n, GLuint * states)} */
    public static void glCreateStatesNV(@NativeType("GLuint *") int[] states) {
        long __functionAddress = GL.getICD().glCreateStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(states.length, states, __functionAddress);
    }

    /** {@code void glDeleteStatesNV(GLsizei n, GLuint const * states)} */
    public static void glDeleteStatesNV(@NativeType("GLuint const *") int[] states) {
        long __functionAddress = GL.getICD().glDeleteStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(states.length, states, __functionAddress);
    }

    /** {@code void glDrawCommandsNV(GLenum primitiveMode, GLuint buffer, GLintptr const * indirects, GLsizei const * sizes, GLuint count)} */
    public static void glDrawCommandsNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes) {
        long __functionAddress = GL.getICD().glDrawCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.remaining());
        }
        callPPV(primitiveMode, buffer, memAddress(indirects), sizes, indirects.remaining(), __functionAddress);
    }

    /** {@code void glDrawCommandsAddressNV(GLenum primitiveMode, GLuint64 const * indirects, GLsizei const * sizes, GLuint count)} */
    public static void glDrawCommandsAddressNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint64 const *") long[] indirects, @NativeType("GLsizei const *") int[] sizes) {
        long __functionAddress = GL.getICD().glDrawCommandsAddressNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.length);
        }
        callPPV(primitiveMode, indirects, sizes, indirects.length, __functionAddress);
    }

    /** {@code void glDrawCommandsStatesNV(GLuint buffer, GLintptr const * indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static void glDrawCommandsStatesNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        callPPPPV(buffer, memAddress(indirects), sizes, states, fbos, indirects.remaining(), __functionAddress);
    }

    /** {@code void glDrawCommandsStatesAddressNV(GLuint64 const * indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static void glDrawCommandsStatesAddressNV(@NativeType("GLuint64 const *") long[] indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesAddressNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.length);
            check(states, indirects.length);
            check(fbos, indirects.length);
        }
        callPPPPV(indirects, sizes, states, fbos, indirects.length, __functionAddress);
    }

    /** {@code void glCreateCommandListsNV(GLsizei n, GLuint * lists)} */
    public static void glCreateCommandListsNV(@NativeType("GLuint *") int[] lists) {
        long __functionAddress = GL.getICD().glCreateCommandListsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(lists.length, lists, __functionAddress);
    }

    /** {@code void glDeleteCommandListsNV(GLsizei n, GLuint const * lists)} */
    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") int[] lists) {
        long __functionAddress = GL.getICD().glDeleteCommandListsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(lists.length, lists, __functionAddress);
    }

    /** {@code void glListDrawCommandsStatesClientNV(GLuint list, GLuint segment, void const ** indirects, GLsizei const * sizes, GLuint const * states, GLuint const * fbos, GLuint count)} */
    public static void glListDrawCommandsStatesClientNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segment, @NativeType("void const **") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glListDrawCommandsStatesClientNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        callPPPPV(list, segment, memAddress(indirects), sizes, states, fbos, indirects.remaining(), __functionAddress);
    }

}