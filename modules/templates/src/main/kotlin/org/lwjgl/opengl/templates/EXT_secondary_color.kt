/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.AutoType
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.generator.opengl.ARRAY_BUFFER

val EXT_secondary_color = "EXTSecondaryColor".nativeClassGL("EXT_secondary_color", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows specifying the RGB components of the secondary color used in the Color Sum stage, instead of using the default (0,0,0,0) color.
		It applies only in RGBA mode and when LIGHTING is disabled.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"COLOR_SUM_EXT" _ 0x8458
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CURRENT_SECONDARY_COLOR_EXT" _ 0x8459,
		"SECONDARY_COLOR_ARRAY_SIZE_EXT" _ 0x845A,
		"SECONDARY_COLOR_ARRAY_TYPE_EXT" _ 0x845B,
		"SECONDARY_COLOR_ARRAY_STRIDE_EXT" _ 0x845C
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetPointerv.",

		"SECONDARY_COLOR_ARRAY_POINTER_EXT" _ 0x845D
	)

	IntConstant(
		"Accepted by the {@code array} parameter of EnableClientState and DisableClientState.",

		"SECONDARY_COLOR_ARRAY_EXT" _ 0x845E
	)

	val colorRed = "the red component of the current secondary color"
	val colorGreen = "the green component of the current secondary color"
	val colorBlue = "the blue component of the current secondary color"
	val colorBuffer = "the secondary color buffer"

	GLvoid(
		"SecondaryColor3bEXT",
		"Sets the R, G, and B components of the current secondary color.",

		GLbyte.IN("red", colorRed),
		GLbyte.IN("green", colorGreen),
		GLbyte.IN("blue", colorBlue)
	)
	GLvoid("SecondaryColor3sEXT", "Short version of #SecondaryColor3bEXT()", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue))
	GLvoid("SecondaryColor3iEXT", "Integer version of #SecondaryColor3bEXT()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))
	GLvoid("SecondaryColor3fEXT", "Float version of #SecondaryColor3bEXT()", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue))
	GLvoid("SecondaryColor3dEXT", "Double version of #SecondaryColor3bEXT()", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue))
	GLvoid("SecondaryColor3ubEXT", "Unsigned version of #SecondaryColor3bEXT()", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue))
	GLvoid("SecondaryColor3usEXT", "Unsigned short version of #SecondaryColor3bEXT()", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue))
	GLvoid("SecondaryColor3uiEXT", "Unsigned int version of #SecondaryColor3bEXT()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))

	GLvoid("SecondaryColor3bvEXT", "Byte pointer version of #SecondaryColor3bEXT().", const _ Check(3) _ GLbyte_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3svEXT", "Pointer version of #SecondaryColor3sEXT().", const _ Check(3) _ GLshort_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3ivEXT", "Pointer version of #SecondaryColor3iEXT().", const _ Check(3) _ GLint_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3fvEXT", "Pointer version of #SecondaryColor3fEXT().", const _ Check(3) _ GLfloat_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3dvEXT", "Pointer version of #SecondaryColor3dEXT().", const _ Check(3) _ GLdouble_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3ubvEXT", "Pointer version of #SecondaryColor3ubEXT().", const _ Check(3) _ GLubyte_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3usvEXT", "Pointer version of #SecondaryColor3usEXT().", const _ Check(3) _ GLushort_p.IN("v", colorBuffer))
	GLvoid("SecondaryColor3uivEXT", "Pointer version of #SecondaryColor3uiEXT().", const _ Check(3) _ GLuint_p.IN("v", colorBuffer))

	GLvoid(
		"SecondaryColorPointerEXT",
		"Specifies the location and organization of a secondary color array.",

		GLint.IN("size", "the number of values per vertex that are stored in the array, as well as their component ordering", "3"),
		AutoType("pointer", GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT, GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"GL11#BYTE GL11#UNSIGNED_BYTE GL11#SHORT GL11#UNSIGNED_SHORT GL11#INT GL11#UNSIGNED_INT GL30#HALF_FLOAT GL11#FLOAT GL11#DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		const _ ARRAY_BUFFER _ GLvoid_p.IN("pointer", "the secondary color array data")
	)
}