/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*

val OPENGL_PACKAGE = "org.lwjgl.opengl"

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
val GLclampf = typedef(GLfloat, "GLclampf")
val GLdouble = PrimitiveType("GLdouble", PrimitiveMapping.DOUBLE)
val GLclampd = typedef(GLdouble, "GLclampd")

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
val GLdouble_p = GLdouble.p

// custom numeric

val GLsizei = IntegerType("GLsizei", PrimitiveMapping.INT)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)
val GLbitfield = IntegerType("GLbitfield", PrimitiveMapping.INT, unsigned = true)

val GLsizei_p = GLsizei.p
val GLenum_p = GLenum.p

val GLintptr = PrimitiveType("GLintptr", PrimitiveMapping.POINTER)
val GLsizeiptr = PrimitiveType("GLsizeiptr", PrimitiveMapping.POINTER)

val GLintptrARB = PrimitiveType("GLintptrARB", PrimitiveMapping.POINTER)
val GLsizeiptrARB = PrimitiveType("GLsizeiptrARB", PrimitiveMapping.POINTER)

val GLintptr_p = GLintptr.p
val GLsizeiptr_p = GLsizeiptr.p

// strings

val GLcharASCII_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.ASCII)
val GLcharASCII_pp = GLcharASCII_p.p
val GLcharASCII_p_const_p = GLcharASCII_p.const_p

val GLcharUTF8_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.UTF8)
val GLcharUTF8_pp = GLcharUTF8_p.p

val GLubyteString = CharSequenceType(name = "GLubyte", charMapping = CharMapping.UTF8)

// AMD_debug_output
val GLDEBUGPROCAMD = "GLDEBUGPROCAMD".callback(
	OPENGL_PACKAGE, void, "GLDebugMessageAMDCallback",
	"Will be called when a debug message is generated.",
	GLuint.IN("id", "the message ID"),
	GLenum.IN("category", "the message category"),
	GLenum.IN("severity", "the message severity"),
	GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	void_p.IN("userParam", "the user-specified value that was passed when calling AMDDebugOutput##glDebugMessageCallbackAMD()"),
	samConstructor = "AMDDebugOutput"
) {
	documentation = "Instances of this interface may be passed to the AMDDebugOutput##glDebugMessageCallbackAMD() method."
	CALL_CONVENTION_SYSTEM
}
// ARB_debug_output
val GLDEBUGPROCARB = "GLDEBUGPROCARB".callback(
	OPENGL_PACKAGE, void, "GLDebugMessageARBCallback",
	"Will be called when a debug message is generated.",
	GLenum.IN("source", "the message source"),
	GLenum.IN("type", "the message type"),
	GLuint.IN("id", "the message ID"),
	GLenum.IN("severity", "the message severity"),
	GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	const _ void_p.IN("userParam", "the user-specified value that was passed when calling ARBDebugOutput##glDebugMessageCallbackARB()"),
	samConstructor = "ARBDebugOutput"
) {
	documentation = "Instances of this interface may be passed to the ARBDebugOutput##glDebugMessageCallbackARB() method."
	CALL_CONVENTION_SYSTEM
}
// ARB_shader_objects
val GLcharARB_p = CharSequenceType(name = "GLcharARB", charMapping = CharMapping.UTF8)
val GLcharARB_pp = GLcharARB_p.p
val GLhandleARB = IntegerType("GLhandleARB", PrimitiveMapping.INT, unsigned = true)
val GLhandleARB_p = GLhandleARB.p
// ARB_sync
val GLsync = "GLsync".opaque_p
// KHR_debug
val GLDEBUGPROC = "GLDEBUGPROC".callback(
	OPENGL_PACKAGE, void, "GLDebugMessageCallback",
	"Will be called when a debug message is generated.",
	GLenum.IN("source", "the message source"),
	GLenum.IN("type", "the message type"),
	GLuint.IN("id", "the message ID"),
	GLenum.IN("severity", "the message severity"),
	GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	const _ void_p.IN("userParam",
		"the user-specified value that was passed when calling GL43##glDebugMessageCallback() or KHRDebug##glDebugMessageCallback()"
	),
	samConstructor = "GL43,KHRDebug"
) {
	documentation = "Instances of this interface may be passed to the GL43##glDebugMessageCallback() and KHRDebug##glDebugMessageCallback() methods."
	CALL_CONVENTION_SYSTEM
}
// NV_gpu_shader5
val GLint64EXT = IntegerType("GLint64EXT", PrimitiveMapping.LONG)
val GLint64EXT_p = GLint64EXT.p
val GLuint64EXT = IntegerType("GLuint64EXT", PrimitiveMapping.LONG, unsigned = true)
val GLuint64EXT_p = GLuint64EXT.p
// NV_half_float
val GLhalfNV = IntegerType("GLhalfNV", PrimitiveMapping.SHORT)
val GLhalfNV_p = GLhalfNV.p