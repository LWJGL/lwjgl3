/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*

// void

val GLvoid = NativeType("GLvoid", TypeMapping.VOID)

val GLvoid_p = PointerType("GLvoid", PointerMapping.DATA)
val GLvoid_pp = PointerType(GLvoid_p)

// numeric

val GLboolean = NativeType("GLboolean", TypeMapping.BOOLEAN)
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

// strings

val GLcharASCII_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.ASCII)
val GLcharASCII_pp = PointerType(GLcharASCII_p)

val GLcharUTF8_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.UTF8)
val GLcharUTF8_pp = PointerType(GLcharUTF8_p)

val GLubyteString = CharSequenceType(name = "GLubyte", charMapping = CharMapping.UTF8)

// misc

val GLsync = PointerType(name = "GLsync", includesPointer = true)

val GLDEBUGPROC = PointerType(name = "GLDEBUGPROC", includesPointer = true)
val GLDEBUGPROCAMD = PointerType(name = "GLDEBUGPROCAMD", includesPointer = true)

val voidptr = PointerType("void") // Naked pointer (used in GL43)