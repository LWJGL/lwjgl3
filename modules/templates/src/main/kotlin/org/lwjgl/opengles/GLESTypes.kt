/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles

import org.lwjgl.generator.*

val GLES_PACKAGE = "org.lwjgl.opengles"

fun config() {
    packageInfo(
        GLES_PACKAGE,
        """
        Contains bindings to the ${url("https://www.khronos.org/opengles/", "OpenGL ES")}, a royalty-free, cross-platform API for full-function 2D and 3D
        graphics on embedded systems - including consoles, phones, appliances and vehicles. It consists of well-defined subsets of desktop OpenGL, creating a
        flexible and powerful low-level interface between software and graphics acceleration.

        The ${url("https://www.khronos.org/registry/gles/", "Khronos OpenGL ES registry")} is a useful online resource that contains the OpenGL ES and OpenGL
        ES Shading Language specifications, as well as specifications of OpenGL ES extensions. The ${url(
            "https://www.khronos.org/opengles/sdk/docs/",
            "OpenGL ES Reference Pages")
        } is another convenient source of documentation.
        """
    )
}

val GLboolean = IntegerType("GLboolean", PrimitiveMapping.BOOLEAN, unsigned = true)
val GLbyte = IntegerType("GLbyte", PrimitiveMapping.BYTE)
val GLubyte = IntegerType("GLubyte", PrimitiveMapping.BYTE, unsigned = true)
val GLshort = IntegerType("GLshort", PrimitiveMapping.SHORT)
val GLushort = IntegerType("GLushort", PrimitiveMapping.SHORT, unsigned = true)
val GLint = IntegerType("GLint", PrimitiveMapping.INT)
val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)
val GLint64 = IntegerType("GLint64", PrimitiveMapping.LONG)
val GLuint64 = IntegerType("GLuint64", PrimitiveMapping.LONG, unsigned = true)
val GLfloat = PrimitiveType("GLfloat", PrimitiveMapping.FLOAT)

val GLboolean_p = GLboolean.p
val GLbyte_p = GLbyte.p
val GLubyte_p = GLubyte.p
val GLshort_p = GLshort.p
val GLushort_p = GLushort.p
val GLint_p = GLint.p
val GLuint_p = GLuint.p
val GLint64_p = GLint64.p
val GLuint64_p = GLuint64.p
val GLfloat_p = GLfloat.p

// custom numeric

val GLsizei = IntegerType("GLsizei", PrimitiveMapping.INT)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)
val GLbitfield = IntegerType("GLbitfield", PrimitiveMapping.INT, unsigned = true)

val GLsizei_p = GLsizei.p
val GLenum_p = GLenum.p

val GLintptr = IntegerType("GLintptr", PrimitiveMapping.POINTER)
val GLsizeiptr = IntegerType("GLsizeiptr", PrimitiveMapping.POINTER, unsigned = true)

val GLintptr_p = GLintptr.p
val GLsizeiptr_p = GLsizeiptr.p

// strings

val GLcharASCII_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.ASCII)
val GLcharUTF8_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.UTF8)
val GLubyteString = CharSequenceType(name = "GLubyte", charMapping = CharMapping.UTF8)

// GLES 3.0
val GLsync = "GLsync".opaque_p

// GLES 3.2
val GLDEBUGPROC = "GLDEBUGPROC".callback(
    GLES_PACKAGE, void, "GLDebugMessageCallback",
    "Will be called when a debug message is generated.",
    GLenum.IN("source", "the message source"),
    GLenum.IN("type", "the message type"),
    GLuint.IN("id", "the message ID"),
    GLenum.IN("severity", "the message severity"),
    AutoSize("message")..GLsizei.IN("length", "the message length, excluding the null-terminator"),
    const..GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
    const..void_p.IN("userParam", "the user-specified value that was passed when calling #DebugMessageCallback()")
) {
    documentation = "Instances of this interface may be passed to the #DebugMessageCallback() method."
    useSystemCallConvention()
    additionalCode = """
    /**
     * Converts the specified {@link GLDebugMessageCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageCallback invocation.</p>
     *
     * @param length  the GLDebugMessageCallback {@code length} argument
     * @param message the GLDebugMessageCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }
    """
}

// KHR_debug
val GLDEBUGPROCKHR = "GLDEBUGPROCKHR".callback(
    GLES_PACKAGE, void, "GLDebugMessageKHRCallback",
    "Will be called when a debug message is generated.",
    GLenum.IN("source", "the message source"),
    GLenum.IN("type", "the message type"),
    GLuint.IN("id", "the message ID"),
    GLenum.IN("severity", "the message severity"),
    AutoSize("message")..GLsizei.IN("length", "the message length, excluding the null-terminator"),
    const..GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
    const..void_p.IN("userParam", "the user-specified value that was passed when calling #DebugMessageCallbackKHR()")
) {
    documentation = "Instances of this interface may be passed to the #DebugMessageCallbackKHR() method."
    useSystemCallConvention()
    additionalCode = """
    /**
     * Converts the specified {@link GLDebugMessageKHRCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageKHRCallback invocation.</p>
     *
     * @param length  the GLDebugMessageKHRCallback {@code length} argument
     * @param message the GLDebugMessageKHRCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }
    """
}

// OES_EGL_image
val GLeglImageOES = "GLeglImageOES".opaque_p
// NV_draw_vulkan_image
val VULKANPROCNV = "VULKANPROCNV".opaque_p

// AutoType tokens
enum class BufferType(
    type: PointerType,
    override val className: String = "GLES20"
) : AutoTypeToken {

    GL_UNSIGNED_BYTE(GLubyte_p),
    GL_UNSIGNED_SHORT(GLushort_p),
    GL_UNSIGNED_INT(GLuint_p),

    GL_BYTE(GLbyte_p),
    GL_SHORT(GLshort_p),
    GL_INT(GLint_p),

    GL_FLOAT(GLfloat_p);

    override val mapping = type.mapping as PointerMapping

}