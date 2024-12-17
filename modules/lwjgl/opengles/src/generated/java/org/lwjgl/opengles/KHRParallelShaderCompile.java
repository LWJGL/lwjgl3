/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class KHRParallelShaderCompile {

    static { GLES.initialize(); }

    public static final int GL_MAX_SHADER_COMPILER_THREADS_KHR = 0x91B0;

    public static final int GL_COMPLETION_STATUS_KHR = 0x91B1;

    protected KHRParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMaxShaderCompilerThreadsKHR ] ---

    /** {@code void glMaxShaderCompilerThreadsKHR(GLuint count)} */
    public static native void glMaxShaderCompilerThreadsKHR(@NativeType("GLuint") int count);

}