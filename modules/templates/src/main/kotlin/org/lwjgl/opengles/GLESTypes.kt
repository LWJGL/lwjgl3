/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles

import org.lwjgl.generator.*

val GLES_PACKAGE = "org.lwjgl.opengles"

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

val GLboolean_p = PointerType("GLboolean", PointerMapping.DATA_BOOLEAN)
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

val GLintptr = PrimitiveType("GLintptr", PrimitiveMapping.POINTER)
val GLsizeiptr = PrimitiveType("GLsizeiptr", PrimitiveMapping.POINTER)

val GLintptr_p = GLintptr.p
val GLsizeiptr_p = GLsizeiptr.p

// strings

val GLcharASCII_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.ASCII)
val GLcharASCII_pp = GLcharASCII_p.p
val GLcharASCII_p_const_p = GLcharASCII_p.const_p

val GLcharUTF8_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.UTF8)
val GLcharUTF8_pp = GLcharUTF8_p.p
val GLcharUTF8_p_const_p = GLcharUTF8_p.const_p

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
	AutoSize("message") _ GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	const _ void_p.IN("userParam", "the user-specified value that was passed when calling GLES32##glDebugMessageCallback()"),
	samConstructor = "GLES32"
) {
	documentation = "Instances of this interface may be passed to the GLES32##glDebugMessageCallback() method."
	useSystemCallConvention()
	additionalCode = """
	/**
	 * Converts the specified {@link GLDebugMessageCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageCallback {@code length} argument
	 * @param message the the GLDebugMessageCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(int length, long message) {
		return memDecodeUTF8(memByteBuffer(message, length));
	}

	/** A functional interface for {@link GLDebugMessageCallback}. */
	public interface SAMString {
		void invoke(int source, int type, int id, int severity, String message, long userParam);
	}

	/**
	 * Creates a {@link GLDebugMessageCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLDebugMessageCallback} instance
	 */
	public static GLDebugMessageCallback createString(final SAMString sam) {
		return new GLDebugMessageCallback() {
			@Override
			public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
				sam.invoke(source, type, id, severity, getMessage(length, message), userParam);
			}
		};
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
	AutoSize("message") _ GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	const _ void_p.IN("userParam", "the user-specified value that was passed when calling KHRDebug##glDebugMessageCallbackKHR()"),
	samConstructor = "KHRDebug"
) {
	documentation = "Instances of this interface may be passed to the KHRDebug##glDebugMessageCallbackKHR() method."
	useSystemCallConvention()
	additionalCode = """
	/**
	 * Converts the specified {@link GLDebugMessageKHRCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a GLDebugMessageKHRCallback invocation.</p>
	 *
	 * @param length  the GLDebugMessageKHRCallback {@code length} argument
	 * @param message the the GLDebugMessageKHRCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(int length, long message) {
		return memDecodeUTF8(memByteBuffer(message, length));
	}

	/** A functional interface for {@link GLDebugMessageKHRCallback}. */
	public interface SAMString {
		void invoke(int source, int type, int id, int severity, String message, long userParam);
	}

	/**
	 * Creates a {@link GLDebugMessageKHRCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLDebugMessageKHRCallback} instance
	 */
	public static GLDebugMessageKHRCallback createString(final SAMString sam) {
		return new GLDebugMessageKHRCallback() {
			@Override
			public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
				sam.invoke(source, type, id, severity, getMessage(length, message), userParam);
			}
		};
	}
	"""
}

// OES_EGL_image
val GLeglImageOES = "GLeglImageOES".opaque_p

// AutoType tokens
enum class BufferType(
	type: PointerType,
	override val className: String = "GLES20"
): AutoTypeToken {

	GL_UNSIGNED_BYTE(GLubyte_p),
	GL_UNSIGNED_SHORT(GLushort_p),
	GL_UNSIGNED_INT(GLuint_p),

	GL_BYTE(GLbyte_p),
	GL_SHORT(GLshort_p),
	GL_INT(GLint_p),

	GL_FLOAT(GLfloat_p);

	override val mapping = type.mapping as PointerMapping

}