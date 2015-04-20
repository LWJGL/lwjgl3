/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*

val OPENGL_PACKAGE = "org.lwjgl.opengl"

// void

val GLvoid = NativeType("GLvoid", TypeMapping.VOID)

val GLvoid_p = PointerType("GLvoid", PointerMapping.DATA)
val GLvoid_pp = PointerType(GLvoid_p)

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
val GLbyte_p = PointerType(GLbyte)
val GLubyte_p = PointerType(GLubyte)
val GLshort_p = PointerType(GLshort)
val GLushort_p = PointerType(GLushort)
val GLint_p = PointerType(GLint)
val GLuint_p = PointerType(GLuint)
val GLint64_p = PointerType(GLint64)
val GLuint64_p = PointerType(GLuint64)
val GLfloat_p = PointerType(GLfloat)
val GLdouble_p = PointerType(GLdouble)

// custom numeric

val GLsizei = IntegerType("GLsizei", PrimitiveMapping.INT)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)
val GLbitfield = IntegerType("GLbitfield", PrimitiveMapping.INT, unsigned = true)

val GLsizei_p = PointerType(GLsizei)
val GLenum_p = PointerType(GLenum)

val GLintptr = PrimitiveType("GLintptr", PrimitiveMapping.PTR)
val GLsizeiptr = PrimitiveType("GLsizeiptr", PrimitiveMapping.PTR)

val GLintptrARB = PrimitiveType("GLintptrARB", PrimitiveMapping.PTR)
val GLsizeiptrARB = PrimitiveType("GLsizeiptrARB", PrimitiveMapping.PTR)

val GLintptr_p = PointerType(GLintptr)
val GLsizeiptr_p = PointerType(GLsizeiptr)

// strings

val GLcharASCII_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.ASCII)
val GLcharASCII_pp = PointerType(GLcharASCII_p)
val GLcharASCII_p_const_p = PointerType(GLcharASCII_p, const = true)

val GLcharUTF8_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.UTF8)
val GLcharUTF8_pp = PointerType(GLcharUTF8_p)

val GLubyteString = CharSequenceType(name = "GLubyte", charMapping = CharMapping.UTF8)

// AMD_debug_output
val GLDEBUGPROCAMD = CallbackType(callback(
	OPENGL_PACKAGE, void, "GLDebugMessageAMDCallback",
	"Will be called when a debug message is generated.",
	GLuint.IN("id", "the message ID"),
	GLenum.IN("category", "the message category"),
	GLenum.IN("severity", "the message severity"),
	GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	GLvoid_p.IN("userParam", "the user-specified value that was passed when calling AMDDebugOutput##glDebugMessageCallbackAMD()"),
	samConstructor = "AMDDebugOutput"
) {
	documentation = "Instances of this interface may be passed to the AMDDebugOutput##glDebugMessageCallbackAMD() method."
	CALL_CONVENTION_SYSTEM
}, "GLDEBUGPROCAMD")
// ARB_debug_output
val GLDEBUGPROCARB = CallbackType(callback(
	OPENGL_PACKAGE, void, "GLDebugMessageARBCallback",
	"Will be called when a debug message is generated.",
	GLenum.IN("source", "the message source"),
	GLenum.IN("type", "the message type"),
	GLuint.IN("id", "the message ID"),
	GLenum.IN("severity", "the message severity"),
	GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	const _ GLvoid_p.IN("userParam", "the user-specified value that was passed when calling ARBDebugOutput##glDebugMessageCallbackARB()"),
	samConstructor = "ARBDebugOutput"
) {
	documentation = "Instances of this interface may be passed to the ARBDebugOutput##glDebugMessageCallbackARB() method."
	CALL_CONVENTION_SYSTEM
}, "GLDEBUGPROCARB")
// ARB_shader_objects
val GLcharARB_p = CharSequenceType(name = "GLcharARB", charMapping = CharMapping.UTF8)
val GLcharARB_pp = PointerType(GLcharARB_p)
val GLhandleARB = IntegerType("GLhandleARB", PrimitiveMapping.INT, unsigned = true)
val GLhandleARB_p = PointerType(GLhandleARB)
// ARB_sync
val GLsync = PointerType(name = "GLsync", includesPointer = true)
// KHR_debug
val GLDEBUGPROC = CallbackType(callback(
	OPENGL_PACKAGE, void, "GLDebugMessageCallback",
	"Will be called when a debug message is generated.",
	GLenum.IN("source", "the message source"),
	GLenum.IN("type", "the message type"),
	GLuint.IN("id", "the message ID"),
	GLenum.IN("severity", "the message severity"),
	GLsizei.IN("length", "the message length, excluding the null-terminator"),
	const _ GLcharUTF8_p.IN("message", "a pointer to the message string representation"),
	const _ GLvoid_p.IN(
		"userParam",
		"the user-specified value that was passed when calling GL43##glDebugMessageCallback() or KHRDebug##glDebugMessageCallback()"
	),
	samConstructor = "GL43,KHRDebug"
) {
	documentation = "Instances of this interface may be passed to the GL43##glDebugMessageCallback() and KHRDebug##glDebugMessageCallback() methods."
	CALL_CONVENTION_SYSTEM
}, "GLDEBUGPROC")
// EXT_timer_query
val GLuint64EXT = IntegerType("GLuint64EXT", PrimitiveMapping.LONG, unsigned = true)
val GLuint64EXT_p = PointerType(GLuint64EXT)