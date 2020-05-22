/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_external_buffer = "EXTExternalBuffer".nativeClassGL("EXT_external_buffer", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Extension EXT_buffer_storage introduced immutable storage buffers to OpenGL ES. This extension allows the data store for an immutable buffer to be
        sourced from an external {@code EGLClientBuffer}, allowing sharing of EGL client buffers across APIs, across processes, and across different processing
        cores such as the GPU, CPU, and DSP.

        Operations can then be performed on the external buffer using standard GL buffer object procedures. The data in the allocation is not copied to the
        buffer object's data store; the external allocation represents a single memory allocation that can be shared across multiple GL objects -- this aspect
        is similar to EGL external images. On the other hand, the external buffer does not provide lifetime guarantees including orphaning and sibling behavior
        as provided by EGL external images.

        The {@code EGLClientBuffer} must be allocated in a way which permits this shared access. For example, on Android via a shareable Android hardware
        buffer. This extension does not enable support for arbitrary {@code EGLClientBuffers} to be used as an external buffer.

        It is the application's responsibility to ensure synchronization between operations performed by separate components (DSP / CPU / GPU) and processes on
        the external buffer. Additionally the application is responsible for avoiding violating existing GL spec requirements. For example, mapping a single
        shared allocation to two GL buffer objects and then performing {@code CopyBufferSubData} such that the read and write regions overlap would violate the
        existing {@code CopyBufferSubData} spec regarding copies performed with the same buffer set for source and destination.

        The application must take any steps necessary to ensure memory access to the external buffer behaves as required by the application. For example,
        preventing compilation differences in data padding from causing data to be inadvertently corrupted by using defined structure alignment methods such as
        the std140 layout qualifier. The application is responsible for managing the lifetime of the external buffer, ensuring that the external buffer is not
        deleted as long as there are any GL buffer objects referring to it.

        Requires ${GL44.core}.
        """

    void(
        "BufferStorageExternalEXT",
        "",

        GLenum("target", ""),
        GLintptr("offset", ""),
        GLsizeiptr("size", ""),
        GLeglClientBufferEXT("clientBuffer", ""),
        GLbitfield("flags", "")
    )

    DependsOn("hasDSA(ext)")..void(
        "NamedBufferStorageExternalEXT",
        "",

        GLuint("buffer", ""),
        GLintptr("offset", ""),
        GLsizeiptr("size", ""),
        GLeglClientBufferEXT("clientBuffer", ""),
        GLbitfield("flags", "")
    )
}