/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.OPENGL,
        """
        Contains bindings to the ${url("https://www.opengl.org/", "OpenGL")} cross-platform 2D and 3D rendering API.

        The ${url("https://www.khronos.org/registry/OpenGL/index_gl.php", "OpenGL registry")} is a useful online resource that contains the OpenGL and OpenGL
        Shading Language specifications, as well as specifications of OpenGL extensions.
        The ${url("https://www.khronos.org/registry/OpenGL-Refpages/", "OpenGL Reference Pages")} is another convenient source of documentation.

        The bindings of the core OpenGL functionality are contained in two distinct class hierarchies:
        ${ul(
            "{@code GL11..GL46}: all symbols of the Compatibility Profile are included",
            "{@code GL11C..GL46C}: only symbols of the Core Profile are included"
        )}

        Each of the above classes extends the class of the previous OpenGL version in the corresponding hierarchy.

        The recommended way to write OpenGL applications with LWJGL is to statically import the class that corresponds to the minimum required OpenGL version.
        This will expose all symbols up to that version. Additional functionality (later core versions or extensions) should be guarded with appropriate checks
        using the {@link org.lwjgl.opengl.GLCapabilities GLCapabilities} instance of the OpenGL context.

        The Compatibility Profile and Core Profile class hierarchies should not be mixed with static imports, as that would result in compilation ambiguities
        when resolving the symbols. Note that the Compatibility Profile hierarchy can be used with a Core Profile context (as long as no deprecated symbol is
        used) and the Core Profile hierarchy can be used with a Compatibility Profile context. The recommendation is to use the Compatibility Profile hierarchy
        only when deprecated functionality is required. In any other case, the Core Profile hierarchy should be preferred.

        For example, an OpenGL application that requires OpenGL 3.3, must use modern OpenGL features only and needs the best possible performance:
        ${ul(
            "Should create a 3.3 Compatibility Profile context. A Core Profile context would have extra validation overhead.",
            "Should use the Core Profile hierarchy to avoid deprecated symbols. Auto-complete lists in an IDE will also be cleaner."
        )}
        """
    )
}

// numeric

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
val GLdouble = PrimitiveType("GLdouble", PrimitiveMapping.DOUBLE)

// custom numeric

val GLsizei = IntegerType("GLsizei", PrimitiveMapping.INT)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)
val GLbitfield = IntegerType("GLbitfield", PrimitiveMapping.INT, unsigned = true)

val GLintptr = IntegerType("GLintptr", PrimitiveMapping.POINTER)
val GLsizeiptr = IntegerType("GLsizeiptr", PrimitiveMapping.POINTER, unsigned = true)

val GLintptrARB = IntegerType("GLintptrARB", PrimitiveMapping.POINTER)
val GLsizeiptrARB = IntegerType("GLsizeiptrARB", PrimitiveMapping.POINTER, unsigned = true)

// strings

val GLcharASCII = CharType("GLchar", CharMapping.ASCII)
val GLcharUTF8 = CharType("GLchar", CharMapping.UTF8)
val GLubyteUTF8 = CharType("GLubyte", CharMapping.UTF8)

// AMD_debug_output
val GLDEBUGPROCAMD = Module.OPENGL.callback {
    void(
        "GLDebugMessageAMDCallback",
        "Will be called when a debug message is generated.",

        GLuint.IN("id", "the message ID"),
        GLenum.IN("category", "the message category"),
        GLenum.IN("severity", "the message severity"),
        AutoSize("message")..GLsizei.IN("length", "the message length, excluding the null-terminator"),
        GLcharUTF8.const.p.IN("message", "a pointer to the message string representation"),
        void.p.IN("userParam", "the user-specified value that was passed when calling #DebugMessageCallbackAMD()"),

        nativeType = "GLDEBUGPROCAMD"
    ) {
        documentation = "Instances of this interface may be passed to the #DebugMessageCallbackAMD() method."
        additionalCode = """
    /**
     * Converts the specified {@link GLDebugMessageAMDCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageAMDCallback invocation.</p>
     *
     * @param length  the GLDebugMessageAMDCallback {@code length} argument
     * @param message the GLDebugMessageAMDCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }
    """
    }
}
// ARB_debug_output
val GLDEBUGPROCARB = Module.OPENGL.callback {
    void(
        "GLDebugMessageARBCallback",
        "Will be called when a debug message is generated.",

        GLenum.IN("source", "the message source"),
        GLenum.IN("type", "the message type"),
        GLuint.IN("id", "the message ID"),
        GLenum.IN("severity", "the message severity"),
        AutoSize("message")..GLsizei.IN("length", "the message length, excluding the null-terminator"),
        GLcharUTF8.const.p.IN("message", "a pointer to the message string representation"),
        void.const.p.IN("userParam", "the user-specified value that was passed when calling #DebugMessageCallbackARB()"),

        nativeType = "GLDEBUGPROCARB"
    ) {
        documentation = "Instances of this interface may be passed to the #DebugMessageCallbackARB() method."
        additionalCode = """
    /**
     * Converts the specified {@link GLDebugMessageARBCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageARBCallback invocation.</p>
     *
     * @param length  the GLDebugMessageARBCallback {@code length} argument
     * @param message the GLDebugMessageARBCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }
    """
    }
}
// ARB_shader_objects
val GLcharARB = CharType("GLcharARB", CharMapping.UTF8)
val GLhandleARB = IntegerType("GLhandleARB", PrimitiveMapping.INT, unsigned = true)
// ARB_sync
val GLsync = "GLsync".handle
// EXT_EGL_image_storage
val GLeglImageOES = "GLeglImageOES".handle
// EXT_external_buffer
val GLeglClientBufferEXT = "GLeglClientBufferEXT".handle
// KHR_debug
val GLDEBUGPROC = Module.OPENGL.callback {
    void(
        "GLDebugMessageCallback",
        "Will be called when a debug message is generated.",

        GLenum.IN("source", "the message source"),
        GLenum.IN("type", "the message type"),
        GLuint.IN("id", "the message ID"),
        GLenum.IN("severity", "the message severity"),
        AutoSize("message")..GLsizei.IN("length", "the message length, excluding the null-terminator"),
        GLcharUTF8.const.p.IN("message", "a pointer to the message string representation"),
        void.const.p.IN("userParam",
            "the user-specified value that was passed when calling GL43#glDebugMessageCallback() or KHRDebug#glDebugMessageCallback()"
        ),

        nativeType = "GLDEBUGPROC"
    ) {
        documentation = "Instances of this interface may be passed to the GL43#glDebugMessageCallback() and KHRDebug#glDebugMessageCallback() methods."
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
// NV_draw_vulkan_image
val VULKANPROCNV = "VULKANPROCNV".handle
// NV_gpu_shader5
val GLint64EXT = IntegerType("GLint64EXT", PrimitiveMapping.LONG)
val GLuint64EXT = IntegerType("GLuint64EXT", PrimitiveMapping.LONG, unsigned = true)
// NV_half_float
val GLhalfNV = IntegerType("GLhalfNV", PrimitiveMapping.SHORT)

// AutoType tokens
enum class BufferType(
    type: PointerType<*>,
    override val className: String = "GL11"
) : AutoTypeToken {

    GL_UNSIGNED_BYTE(GLubyte.p),
    GL_UNSIGNED_SHORT(GLushort.p),
    GL_UNSIGNED_INT(GLuint.p),

    GL_BYTE(GLbyte.p),
    GL_SHORT(GLshort.p),
    GL_INT(GLint.p),

    GL_HALF_FLOAT(GLushort.p, className = "GL30"),
    GL_FLOAT(GLfloat.p),
    GL_DOUBLE(GLdouble.p),

    GL_2_BYTES(GLubyte.p),
    GL_3_BYTES(GLubyte.p),
    GL_4_BYTES(GLubyte.p);

    override val mapping = type.mapping

}