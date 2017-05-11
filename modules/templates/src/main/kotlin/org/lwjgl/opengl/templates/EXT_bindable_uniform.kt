/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_bindable_uniform = "EXTBindableUniform".nativeClassGL("EXT_bindable_uniform", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the concept of bindable uniforms to the OpenGL Shading Language. A uniform variable can be declared bindable, which means that
        the storage for the uniform is not allocated by the compiler/linker anymore, but is backed by a buffer object. This buffer object is bound to the
        bindable uniform through the new command UniformBufferEXT(). Binding needs to happen after linking a program object.

        Binding different buffer objects to a bindable uniform allows an application to easily use different "uniform data sets", without having to re-specify
        the data every time.

        A buffer object can be bound to bindable uniforms in different program objects. If those bindable uniforms are all of the same type, accessing a
        bindable uniform in program object A will result in the same data if the same access is made in program object B. This provides a mechanism for
        'environment uniforms', uniform values that can be shared among multiple program objects.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_BINDABLE_UNIFORMS_EXT"..0x8DE2,
        "MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT"..0x8DE3,
        "MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT"..0x8DE4,
        "MAX_BINDABLE_UNIFORM_SIZE_EXT"..0x8DED,
        "UNIFORM_BUFFER_BINDING_EXT"..0x8DEF
    )

    IntConstant(
        "Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

        "UNIFORM_BUFFER_EXT"..0x8DEE
    )

    void(
        "UniformBufferEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("buffer", "")
    )

    GLint(
        "GetUniformBufferSizeEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", "")
    )

    GLintptr(
        "GetUniformOffsetEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", "")
    )
}