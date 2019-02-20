/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles

import org.lwjgl.generator.*

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

// custom numeric

val GLsizei = IntegerType("GLsizei", PrimitiveMapping.INT)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)
val GLbitfield = IntegerType("GLbitfield", PrimitiveMapping.INT, unsigned = true)

val GLintptr = IntegerType("GLintptr", PrimitiveMapping.POINTER)
val GLsizeiptr = IntegerType("GLsizeiptr", PrimitiveMapping.POINTER, unsigned = true)

// strings

val GLcharASCII = CharType("GLchar", CharMapping.ASCII)
val GLcharUTF8 = CharType("GLchar", CharMapping.UTF8)
val GLubyteUTF8 = CharType("GLubyte", CharMapping.UTF8)

// GLES 3.0
val GLsync = "GLsync".handle

// GLES 3.2
val GLDEBUGPROC = Module.OPENGLES.callback {
    void(
        "GLDebugMessageCallback",
        "Will be called when a debug message is generated.",

        GLenum("source", "the message source"),
        GLenum("type", "the message type"),
        GLuint("id", "the message ID"),
        GLenum("severity", "the message severity"),
        AutoSize("message")..GLsizei("length", "the message length, excluding the null-terminator"),
        GLcharUTF8.const.p("message", "a pointer to the message string representation"),
        void.const.p("userParam", "the user-specified value that was passed when calling #DebugMessageCallback()"),

        nativeType = "GLDEBUGPROC"
    ) {
        documentation = "Instances of this interface may be passed to the #DebugMessageCallback() method."
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
}

// EXT_external_buffer
val GLeglClientBufferEXT = "GLeglClientBufferEXT".handle
// KHR_debug
val GLDEBUGPROCKHR = Module.OPENGLES.callback {
    void(
        "GLDebugMessageKHRCallback",
        "Will be called when a debug message is generated.",

        GLenum("source", "the message source"),
        GLenum("type", "the message type"),
        GLuint("id", "the message ID"),
        GLenum("severity", "the message severity"),
        AutoSize("message")..GLsizei("length", "the message length, excluding the null-terminator"),
        GLcharUTF8.const.p("message", "a pointer to the message string representation"),
        void.const.p("userParam", "the user-specified value that was passed when calling #DebugMessageCallbackKHR()"),

        nativeType = "GLDEBUGPROCKHR"
    ) {
        documentation = "Instances of this interface may be passed to the #DebugMessageCallbackKHR() method."
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
}
// OES_EGL_image
val GLeglImageOES = "GLeglImageOES".handle
// NV_draw_vulkan_image
val VULKANPROCNV = "VULKANPROCNV".handle

// AutoType tokens
enum class BufferType(
    type: PointerType<*>,
    override val className: String = "GLES20"
) : AutoTypeToken {

    GL_UNSIGNED_BYTE(GLubyte.p),
    GL_UNSIGNED_SHORT(GLushort.p),
    GL_UNSIGNED_INT(GLuint.p),

    GL_BYTE(GLbyte.p),
    GL_SHORT(GLshort.p),
    GL_INT(GLint.p),

    GL_FLOAT(GLfloat.p);

    override val mapping = type.mapping

}