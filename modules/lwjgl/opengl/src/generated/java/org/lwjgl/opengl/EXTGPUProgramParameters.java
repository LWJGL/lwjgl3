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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_gpu_program_parameters.txt">EXT_gpu_program_parameters</a> extension.
 * 
 * <p>This extension provides a new set of procedures to load multiple consecutive program environment parameters more efficiently, via a single GL call
 * instead of multiple calls. This will reduce the amount of CPU overhead involved in loading parameters.</p>
 * 
 * <p>With the existing ARB_vertex_program and ARB_fragment_program APIs, program parameters must be loaded one at a time, via separate calls. While the
 * NV_vertex_program extension provides a set of similar functions that can be used to load program environment parameters (which are equivalent to
 * "program parameters" in NV_vertex_program), no such function exists for program local parameters.</p>
 */
public class EXTGPUProgramParameters {

    static { GL.initialize(); }

    protected EXTGPUProgramParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProgramEnvParameters4fvEXT ] ---

    public static native void nglProgramEnvParameters4fvEXT(int target, int index, int count, long params);

    public static void glProgramEnvParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglProgramEnvParameters4fvEXT(target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glProgramLocalParameters4fvEXT ] ---

    public static native void nglProgramLocalParameters4fvEXT(int target, int index, int count, long params);

    public static void glProgramLocalParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglProgramLocalParameters4fvEXT(target, index, params.remaining() >> 2, memAddress(params));
    }

    /** Array version of: {@link #glProgramEnvParameters4fvEXT ProgramEnvParameters4fvEXT} */
    public static void glProgramEnvParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params.length >> 2, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramLocalParameters4fvEXT ProgramLocalParameters4fvEXT} */
    public static void glProgramLocalParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params.length >> 2, params, __functionAddress);
    }

}