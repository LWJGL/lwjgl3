/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/MESA/MESA_program_binary_formats.txt">MESA_program_binary_formats</a> extension.
 * 
 * <p>The {@code get_program_binary} exensions require a {@code GLenum} {@code binaryFormat}. This extension documents that format for use with Mesa.</p>
 */
public final class MESAProgramBinaryFormats {

    /**
     * For {@code ARB_get_program_binary}, {@code GL_PROGRAM_BINARY_FORMAT_MESA} may be returned from {@link GLES30#glGetProgramBinary GetProgramBinary} calls in the {@code binaryFormat}
     * parameter and when retrieving the value of {@link GLES30#GL_PROGRAM_BINARY_FORMATS PROGRAM_BINARY_FORMATS}.
     * 
     * <p>For {@link OESGetProgramBinary OES_get_program_binary}, {@code GL_PROGRAM_BINARY_FORMAT_MESA} may be returned from {@link OESGetProgramBinary#glGetProgramBinaryOES GetProgramBinaryOES} calls in the {@code binaryFormat}
     * parameter and when retrieving the value of {@link OESGetProgramBinary#GL_PROGRAM_BINARY_FORMATS_OES PROGRAM_BINARY_FORMATS_OES}.</p>
     */
    public static final int GL_PROGRAM_BINARY_FORMAT_MESA = 0x875F;

    private MESAProgramBinaryFormats() {}

}