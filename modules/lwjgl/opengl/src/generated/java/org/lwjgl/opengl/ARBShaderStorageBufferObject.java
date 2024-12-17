/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBShaderStorageBufferObject {

    static { GL.initialize(); }

    public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;

    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;

    public static final int
        GL_SHADER_STORAGE_BUFFER_START = 0x90D4,
        GL_SHADER_STORAGE_BUFFER_SIZE  = 0x90D5;

    public static final int
        GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS          = 0x90D6,
        GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS        = 0x90D7,
        GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS    = 0x90D8,
        GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9,
        GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS        = 0x90DA,
        GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS         = 0x90DB,
        GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS        = 0x90DC,
        GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS        = 0x90DD,
        GL_MAX_SHADER_STORAGE_BLOCK_SIZE             = 0x90DE,
        GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT    = 0x90DF;

    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x2000;

    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;

    protected ARBShaderStorageBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glShaderStorageBlockBinding ] ---

    /** {@code void glShaderStorageBlockBinding(GLuint program, GLuint storageBlockIndex, GLuint storageBlockBinding)} */
    public static void glShaderStorageBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int storageBlockIndex, @NativeType("GLuint") int storageBlockBinding) {
        GL43C.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
    }

}