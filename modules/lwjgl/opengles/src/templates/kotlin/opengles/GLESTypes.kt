/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles

import org.lwjgl.generator.*

val GLboolean = PrimitiveType("GLboolean", PrimitiveMapping.BOOLEAN)
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

        GLenum("source"),
        GLenum("type"),
        GLuint("id"),
        GLenum("severity"),
        AutoSize("message")..GLsizei("length"),
        GLcharUTF8.const.p("message"),
        void.const.p("userParam"),

        nativeType = "GLDEBUGPROC"
    ) {
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

        GLenum("source"),
        GLenum("type"),
        GLuint("id"),
        GLenum("severity"),
        AutoSize("message")..GLsizei("length"),
        GLcharUTF8.const.p("message"),
        void.const.p("userParam"),

        nativeType = "GLDEBUGPROCKHR"
    ) {
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