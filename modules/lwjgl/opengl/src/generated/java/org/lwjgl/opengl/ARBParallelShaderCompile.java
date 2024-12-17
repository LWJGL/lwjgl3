/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBParallelShaderCompile {

    static { GL.initialize(); }

    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;

    public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;

    protected ARBParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMaxShaderCompilerThreadsARB ] ---

    /** {@code void glMaxShaderCompilerThreadsARB(GLuint count)} */
    public static native void glMaxShaderCompilerThreadsARB(@NativeType("GLuint") int count);

}