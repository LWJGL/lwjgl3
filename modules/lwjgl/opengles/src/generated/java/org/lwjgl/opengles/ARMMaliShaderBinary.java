/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_mali_shader_binary.txt">ARM_mali_shader_binary</a> extension.
 * 
 * <p>This extension enables OpenGL ES 2.0 applications running on ARM Mali graphics cores to use shaders precompiled with the Mali ESSL shader compiler.</p>
 * 
 * <p>The shader objects loaded with this extension are equivalent to shaders created from source, i.e. there are no additional restrictions on which other
 * shader objects they can be linked to, nor on which OpenGL ES states they can be used with.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class ARMMaliShaderBinary {

    /** Accepted by the {@code binaryFormat} parameter of ShaderBinary. */
    public static final int GL_MALI_SHADER_BINARY_ARM = 0x8F60;

    private ARMMaliShaderBinary() {}

}