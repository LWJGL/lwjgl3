/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_mali_program_binary.txt">ARM_mali_program_binary</a> extension.
 * 
 * <p>The OES_get_program_binary extension enables applications to retrieve program binaries using GetProgramBinaryOES and reload them using
 * ProgramBinaryOES.</p>
 * 
 * <p>The mechanism for retrieval and reloading of program binaries is vendor agnostic, but the binary format itself is vendor specific.</p>
 * 
 * <p>This extension adds a token to identify program binaries that are compatible with the ARM Mali family of GPUs.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link OESGetProgramBinary OES_get_program_binary}.</p>
 */
public final class ARMMaliProgramBinary {

    /** Accepted by the {@code binaryFormat} parameter of ProgramBinaryOES. */
    public static final int GL_MALI_PROGRAM_BINARY_ARM = 0x8F61;

    private ARMMaliProgramBinary() {}

}