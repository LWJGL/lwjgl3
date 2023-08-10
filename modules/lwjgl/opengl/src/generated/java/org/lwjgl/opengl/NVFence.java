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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fence.txt">NV_fence</a> extension.
 * 
 * <p>The goal of this extension is provide a finer granularity of synchronizing GL command completion than offered by standard OpenGL, which offers only two
 * mechanisms for synchronization: Flush and Finish. Since Flush merely assures the user that the commands complete in a finite (though undetermined)
 * amount of time, it is, thus, of only modest utility. Finish, on the other hand, stalls CPU execution until all pending GL commands have completed. This
 * extension offers a middle ground - the ability to "finish" a subset of the command stream, and the ability to determine whether a given command has
 * completed or not.</p>
 * 
 * <p>This extension introduces the concept of a "fence" to the OpenGL command stream. Once the fence is inserted into the command stream, it can be queried
 * for a given condition - typically, its completion. Moreover, the application may also request a partial Finish -- that is, all commands prior to the
 * fence will be forced to complete until control is returned to the calling process. These new mechanisms allow for synchronization between the host CPU
 * and the GPU, which may be accessing the same resources (typically memory).</p>
 * 
 * <p>This extension is useful in conjunction with NV_vertex_array_range to determine when vertex information has been pulled from the vertex array range.
 * Once a fence has been tested TRUE or finished, all vertex indices issued before the fence must have been pulled. This ensures that the vertex data
 * memory corresponding to the issued vertex indices can be safely modified (assuming no other outstanding vertex indices are issued subsequent to the
 * fence).</p>
 */
public class NVFence {

    static { GL.initialize(); }

    /** Accepted by the {@code condition} parameter of SetFenceNV. */
    public static final int GL_ALL_COMPLETED_NV = 0x84F2;

    /** Accepted by the {@code pname} parameter of GetFenceivNV. */
    public static final int
        GL_FENCE_STATUS_NV    = 0x84F3,
        GL_FENCE_CONDITION_NV = 0x84F4;

    protected NVFence() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDeleteFencesNV ] ---

    public static native void nglDeleteFencesNV(int n, long fences);

    public static void glDeleteFencesNV(@NativeType("GLuint const *") IntBuffer fences) {
        nglDeleteFencesNV(fences.remaining(), memAddress(fences));
    }

    public static void glDeleteFencesNV(@NativeType("GLuint const *") int fence) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.ints(fence);
            nglDeleteFencesNV(1, memAddress(fences));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenFencesNV ] ---

    public static native void nglGenFencesNV(int n, long fences);

    public static void glGenFencesNV(@NativeType("GLuint *") IntBuffer fences) {
        nglGenFencesNV(fences.remaining(), memAddress(fences));
    }

    @NativeType("void")
    public static int glGenFencesNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.callocInt(1);
            nglGenFencesNV(1, memAddress(fences));
            return fences.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsFenceNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsFenceNV(@NativeType("GLuint") int fence);

    // --- [ glTestFenceNV ] ---

    @NativeType("GLboolean")
    public static native boolean glTestFenceNV(@NativeType("GLuint") int fence);

    // --- [ glGetFenceivNV ] ---

    public static native void nglGetFenceivNV(int fence, int pname, long params);

    public static void glGetFenceivNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFenceivNV(fence, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetFenceiNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFenceivNV(fence, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glFinishFenceNV ] ---

    public static native void glFinishFenceNV(@NativeType("GLuint") int fence);

    // --- [ glSetFenceNV ] ---

    public static native void glSetFenceNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int condition);

    /** Array version of: {@link #glDeleteFencesNV DeleteFencesNV} */
    public static void glDeleteFencesNV(@NativeType("GLuint const *") int[] fences) {
        long __functionAddress = GL.getICD().glDeleteFencesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fences.length, fences, __functionAddress);
    }

    /** Array version of: {@link #glGenFencesNV GenFencesNV} */
    public static void glGenFencesNV(@NativeType("GLuint *") int[] fences) {
        long __functionAddress = GL.getICD().glGenFencesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fences.length, fences, __functionAddress);
    }

    /** Array version of: {@link #glGetFenceivNV GetFenceivNV} */
    public static void glGetFenceivNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFenceivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(fence, pname, params, __functionAddress);
    }

}