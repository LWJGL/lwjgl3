/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTBindableUniform {

    static { GL.initialize(); }

    public static final int
        GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT   = 0x8DE2,
        GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3,
        GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4,
        GL_MAX_BINDABLE_UNIFORM_SIZE_EXT      = 0x8DED,
        GL_UNIFORM_BUFFER_BINDING_EXT         = 0x8DEF;

    public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;

    protected EXTBindableUniform() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniformBufferEXT ] ---

    /** {@code void glUniformBufferEXT(GLuint program, GLint location, GLuint buffer)} */
    public static native void glUniformBufferEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int buffer);

    // --- [ glGetUniformBufferSizeEXT ] ---

    /** {@code GLint glGetUniformBufferSizeEXT(GLuint program, GLint location)} */
    @NativeType("GLint")
    public static native int glGetUniformBufferSizeEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location);

    // --- [ glGetUniformOffsetEXT ] ---

    /** {@code GLintptr glGetUniformOffsetEXT(GLuint program, GLint location)} */
    @NativeType("GLintptr")
    public static native long glGetUniformOffsetEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location);

}