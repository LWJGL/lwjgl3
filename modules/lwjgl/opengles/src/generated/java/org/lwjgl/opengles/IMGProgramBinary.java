/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_program_binary.txt">IMG_program_binary</a> extension.
 * 
 * <p>This extension makes available a program binary format, SGX_PROGRAM_BINARY_IMG. It enables retrieving and loading of pre-linked program objects on
 * chips designed by Imagination Technologies.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link OESGetProgramBinary OES_get_program_binary}.</p>
 */
public final class IMGProgramBinary {

    /** Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES. */
    public static final int GL_SGX_PROGRAM_BINARY_IMG = 0x9130;

    private IMGProgramBinary() {}

}