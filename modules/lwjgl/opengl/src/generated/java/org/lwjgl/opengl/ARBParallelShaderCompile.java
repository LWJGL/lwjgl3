/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_parallel_shader_compile.txt">ARB_parallel_shader_compile</a> extension.
 * 
 * <p>Compiling GLSL into implementation-specific code can be a time consuming process, so a GL implementation may wish to perform the compilation in a
 * separate CPU thread. This extension provides a mechanism for the application to provide a hint to limit the number of threads it wants to be used to
 * compile shaders, as well as a query to determine if the compilation process is complete.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public class ARBParallelShaderCompile {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;

    /** Accepted as part of the {@code pname} parameter to GetShaderiv() and accepted as part of the {@code pname} parameter to GetProgramiv(). */
    public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;

    protected ARBParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMaxShaderCompilerThreadsARB ] ---

    /**
     * Application may use the following to hint to the driver the maximum number background threads it would like to be used in the process of compiling
     * shaders or linking programs.
     * 
     * <p>An implementation may combine the maximum compiler thread request from multiple contexts in a share group in an implementation-specific way.</p>
     * 
     * <p>An application can query the current MaxShaderCompilerThreads() {@code count} by calling {@link GL11C#glGetIntegerv GetIntegerv} with {@code pname} set to
     * {@link #GL_MAX_SHADER_COMPILER_THREADS_ARB MAX_SHADER_COMPILER_THREADS_ARB}.</p>
     *
     * @param count the number of background threads. A {@code count} of zero specifies a request for no parallel compiling or linking and a {@code count} of
     *              {@code 0xFFFFFFFF} requests an implementation-specific maximum.
     */
    public static native void glMaxShaderCompilerThreadsARB(@NativeType("GLuint") int count);

}