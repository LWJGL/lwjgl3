/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_bindable_uniform.txt">EXT_bindable_uniform</a> extension.
 * 
 * <p>This extension introduces the concept of bindable uniforms to the OpenGL Shading Language. A uniform variable can be declared bindable, which means that
 * the storage for the uniform is not allocated by the compiler/linker anymore, but is backed by a buffer object. This buffer object is bound to the
 * bindable uniform through the new command UniformBufferEXT(). Binding needs to happen after linking a program object.</p>
 * 
 * <p>Binding different buffer objects to a bindable uniform allows an application to easily use different "uniform data sets", without having to re-specify
 * the data every time.</p>
 * 
 * <p>A buffer object can be bound to bindable uniforms in different program objects. If those bindable uniforms are all of the same type, accessing a
 * bindable uniform in program object A will result in the same data if the same access is made in program object B. This provides a mechanism for
 * 'environment uniforms', uniform values that can be shared among multiple program objects.</p>
 */
public class EXTBindableUniform {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT   = 0x8DE2,
        GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3,
        GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4,
        GL_MAX_BINDABLE_UNIFORM_SIZE_EXT      = 0x8DED,
        GL_UNIFORM_BUFFER_BINDING_EXT         = 0x8DEF;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
    public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;

    protected EXTBindableUniform() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniformBufferEXT ] ---

    public static native void glUniformBufferEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int buffer);

    // --- [ glGetUniformBufferSizeEXT ] ---

    @NativeType("GLint")
    public static native int glGetUniformBufferSizeEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location);

    // --- [ glGetUniformOffsetEXT ] ---

    @NativeType("GLintptr")
    public static native long glGetUniformOffsetEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location);

}