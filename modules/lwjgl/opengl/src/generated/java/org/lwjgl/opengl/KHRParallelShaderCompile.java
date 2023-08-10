/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_parallel_shader_compile.txt">KHR_parallel_shader_compile</a> extension.
 * 
 * <p>Compiling GLSL into implementation-specific code can be a time consuming process, so a GL implementation may wish to perform the compilation in a
 * separate CPU thread. This extension provides a mechanism for the application to provide a hint to limit the number of threads it wants to be used to
 * compile shaders, as well as a query to determine if the compilation process is complete.</p>
 */
public class KHRParallelShaderCompile {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SHADER_COMPILER_THREADS_KHR = 0x91B0;

    /** Accepted as part of the {@code pname} parameter to {@link GL20C#glGetShaderiv GetShaderiv} and accepted as part of the {@code pname} parameter to {@link GL20C#glGetProgramiv GetProgramiv}. */
    public static final int GL_COMPLETION_STATUS_KHR = 0x91B1;

    protected KHRParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMaxShaderCompilerThreadsKHR ] ---

    /**
     * Applications may use this function to hint to the driver the maximum number background threads it would like to be used in the process of compiling
     * shaders or linking programs,
     * 
     * <p>An implementation may combine the maximum compiler thread request from multiple contexts in a share group in an implementation-specific way.</p>
     * 
     * <p>An application can query the current {@code MaxShaderCompilerThreadsKHR} {@code count} by calling {@link GL11C#glGetIntegerv GetIntegerv} with {@code pname} set to
     * {@link #GL_MAX_SHADER_COMPILER_THREADS_KHR MAX_SHADER_COMPILER_THREADS_KHR}, which returns the value of the current state.</p>
     *
     * @param count the number of background threads. A {@code count} of zero specifies a request for no parallel compiling or linking and a {@code count} of
     *              {@code 0xFFFFFFFF} requests an implementation-specific maximum.
     */
    public static native void glMaxShaderCompilerThreadsKHR(@NativeType("GLuint") int count);

}