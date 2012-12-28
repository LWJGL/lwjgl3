/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*

val GLvoid = NativeType("GLvoid", TypeMapping.VOID)

val GLboolean = NativeType("GLboolean", TypeMapping.BOOLEAN)
val GLbyte = PrimitiveType("GLbyte", PrimitiveMapping.BYTE)
val GLubyte = PrimitiveType("GLubyte", PrimitiveMapping.BYTE)
val GLshort = PrimitiveType("GLshort", PrimitiveMapping.SHORT)
val GLushort = PrimitiveType("GLushort", PrimitiveMapping.SHORT)
val GLenum = PrimitiveType("GLenum", PrimitiveMapping.INT)
val GLint = PrimitiveType("GLint", PrimitiveMapping.INT)
val GLuint = PrimitiveType("GLuint", PrimitiveMapping.INT)
val GLsizei = PrimitiveType("GLsizei", PrimitiveMapping.INT)
val GLbitfield = PrimitiveType("GLbitfield", PrimitiveMapping.INT)

val GLfloat = PrimitiveType("GLfloat", PrimitiveMapping.FLOAT)
val GLdouble = PrimitiveType("GLdouble", PrimitiveMapping.DOUBLE)

val GLvoid_p = PointerType(name = "GLvoid", mapping = PointerMapping.DATA)
val GLvoid_pp = PointerType(name = "GLvoid*", mapping = PointerMapping.DATA_POINTER)

val GLboolean_p = PointerType(name = "GLboolean", mapping = PointerMapping.DATA_BOOLEAN)
val GLbyte_p = PointerType(name = "GLbyte", mapping = PointerMapping.DATA_BYTE)
val GLubyte_p = PointerType(name = "GLubyte", mapping = PointerMapping.DATA_BYTE)
val GLshort_p = PointerType(name = "GLshort", mapping = PointerMapping.DATA_SHORT)
val GLushort_p = PointerType(name = "GLushort", mapping = PointerMapping.DATA_SHORT)
val GLint_p = PointerType(name = "GLint", mapping = PointerMapping.DATA_INT)
val GLuint_p = PointerType(name = "GLuint", mapping = PointerMapping.DATA_INT)
val GLfloat_p = PointerType(name = "GLfloat", mapping = PointerMapping.DATA_FLOAT)
val GLdouble_p = PointerType(name = "GLdouble", mapping = PointerMapping.DATA_DOUBLE)

val GLsizei_p = PointerType(name = "GLsizei", mapping = PointerMapping.DATA_INT)

val GLintptr = PointerType(name = "GLintptr", includesPointer = true)
val GLsizeiptr = PrimitiveType("GLsizeiptr", PrimitiveMapping.LONG)

val GLubyteCharSequence = CharSequenceType(name = "GLubyte", charMapping = CharMapping.UTF8)