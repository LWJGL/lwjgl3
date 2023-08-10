/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_program_binary_Z400.txt">AMD_program_binary_Z400</a> extension.
 * 
 * <p>AMD provides an offline shader compiler as part of its suite of SDK tools for AMD's Z400 family of embedded graphics accelerator IP. This extension
 * makes available a program binary format, Z400_BINARY_AMD.</p>
 * 
 * <p>The offline shader compiler accepts a pair of OpenGL Shading Language (GLSL) source shaders: one vertex shader and one fragment shader. It outputs a
 * compiled, optimized, and pre-linked program binary which can then be loaded into a program objects via the ProgramBinaryOES command.</p>
 * 
 * <p>Applications are recommended to use the OES_get_program_binary extension's program binary retrieval mechanism for install-time shader compilation where
 * applicable. That cross-vendor extension provides the performance benefits of loading pre-compiled program binaries, while providing the portability of
 * deploying GLSL source shaders with the application rather than vendor- specific binaries. The details of this extension are obviated by the use of that
 * extension.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link OESGetProgramBinary OES_get_program_binary}.</p>
 */
public final class AMDProgramBinaryZ400 {

    /** Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES. */
    public static final int GL_Z400_BINARY_AMD = 0x8740;

    private AMDProgramBinaryZ400() {}

}