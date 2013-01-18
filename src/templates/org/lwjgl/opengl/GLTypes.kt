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
val GLbyte = PrimitiveType("GLbyte", PrimitiveMapping.BYTE)
val GLubyte = PrimitiveType("GLubyte", PrimitiveMapping.BYTE)
val GLshort = PrimitiveType("GLshort", PrimitiveMapping.SHORT)
val GLushort = PrimitiveType("GLushort", PrimitiveMapping.SHORT)
val GLint = PrimitiveType("GLint", PrimitiveMapping.INT)
val GLuint = PrimitiveType("GLuint", PrimitiveMapping.INT)
val GLint64 = PrimitiveType("GLint64", PrimitiveMapping.LONG)
val GLuint64 = PrimitiveType("GLuint64", PrimitiveMapping.LONG)
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

val GLsizei = PrimitiveType("GLsizei", PrimitiveMapping.INT)
val GLenum = PrimitiveType("GLenum", PrimitiveMapping.INT)
val GLbitfield = PrimitiveType("GLbitfield", PrimitiveMapping.INT)

val GLsizei_p = PointerType(GLsizei)
val GLenum_p = PointerType(GLenum)

val GLintptr = PrimitiveType("GLintptr", PrimitiveMapping.LONG)
val GLsizeiptr = PrimitiveType("GLsizeiptr", PrimitiveMapping.LONG)

// strings

val GLchar_p = CharSequenceType(name = "GLchar", charMapping = CharMapping.UTF8)
val GLchar_pp = PointerType(GLchar_p)

val GLubyteCharSequence = CharSequenceType(name = "GLubyte", charMapping = CharMapping.UTF8)

// misc

val GLsync = PointerType(name = "GLsync", includesPointer = true)

val GLDEBUGPROC = PointerType(name = "GLDEBUGPROC", includesPointer = true)
val GLDEBUGPROCAMD = PointerType(name = "GLDEBUGPROCAMD", includesPointer = true)

val voidptr = PointerType("void") // Naked pointer (used in GL43)