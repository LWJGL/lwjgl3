/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*

val ARB_vertex_blend = "ARBVertexBlend".nativeClassGL("ARB_vertex_blend", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

        This extension provides the ability to replace the single modelview transformation with a set of n vertex units. (Where n is constrained to an
        implementation defined maximum.) Each unit has its own modelview transform matrix. For each unit, there is a current weight associated with the vertex.
        When this extension is enabled the vertices are transformed by the modelview matrices of all of the enabled units. Afterward, these results are scaled
        by the weights for the respective units and then summed to create the eye-space vertex. A similar procedure is followed for the normals, except they are
        transformed by the inverse transpose of the modelview matrices.
		"""

	IntConstant(
		"Accepted by the {@code value} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_UNITS_ARB" _ 0x86A4,
		"ACTIVE_VERTEX_UNITS_ARB" _ 0x86A5
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameters of Enable and Disable, by the {@code value} parameter of IsEnabled, GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"WEIGHT_SUM_UNITY_ARB" _ 0x86A6,
		"VERTEX_BLEND_ARB" _ 0x86A7
	)

	IntConstant(
		"Accepted by the {@code mode} parameter of MatrixMode and by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MODELVIEW0_ARB" _ 0x1700,
		"MODELVIEW1_ARB" _ 0x850a,
		"MODELVIEW2_ARB" _ 0x8722,
		"MODELVIEW3_ARB" _ 0x8723,
		"MODELVIEW4_ARB" _ 0x8724,
		"MODELVIEW5_ARB" _ 0x8725,
		"MODELVIEW6_ARB" _ 0x8726,
		"MODELVIEW7_ARB" _ 0x8727,
		"MODELVIEW8_ARB" _ 0x8728,
		"MODELVIEW9_ARB" _ 0x8729,
		"MODELVIEW10_ARB" _ 0x872A,
		"MODELVIEW11_ARB" _ 0x872B,
		"MODELVIEW12_ARB" _ 0x872C,
		"MODELVIEW13_ARB" _ 0x872D,
		"MODELVIEW14_ARB" _ 0x872E,
		"MODELVIEW15_ARB" _ 0x872F,
		"MODELVIEW16_ARB" _ 0x8730,
		"MODELVIEW17_ARB" _ 0x8731,
		"MODELVIEW18_ARB" _ 0x8732,
		"MODELVIEW19_ARB" _ 0x8733,
		"MODELVIEW20_ARB" _ 0x8734,
		"MODELVIEW21_ARB" _ 0x8735,
		"MODELVIEW22_ARB" _ 0x8736,
		"MODELVIEW23_ARB" _ 0x8737,
		"MODELVIEW24_ARB" _ 0x8738,
		"MODELVIEW25_ARB" _ 0x8739,
		"MODELVIEW26_ARB" _ 0x873A,
		"MODELVIEW27_ARB" _ 0x873B,
		"MODELVIEW28_ARB" _ 0x873C,
		"MODELVIEW29_ARB" _ 0x873D,
		"MODELVIEW30_ARB" _ 0x873E,
		"MODELVIEW31_ARB" _ 0x873F
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CURRENT_WEIGHT_ARB" _ 0x86A8
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"WEIGHT_ARRAY_TYPE_ARB" _ 0x86A9,
		"WEIGHT_ARRAY_STRIDE_ARB" _ 0x86AA,
		"WEIGHT_ARRAY_SIZE_ARB" _ 0x86AB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetPointerv.",

		"WEIGHT_ARRAY_POINTER_ARB" _ 0x86AC
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameters of EnableClientState and DisableClientState, by the {@code value} parameter of IsEnabled, GetBooleanv,
		GetIntegerv, GetFloatv, and GetDoublev.
		""",

		"WEIGHT_ARRAY_ARB" _ 0x86AD
	)

	val size = AutoSize("weights") _ GLint.IN("size", "the number of weights to set. Must be a value between 1 and #MAX_VERTEX_UNITS_ARB.")

	GLvoid("WeightfvARB", "Sets the current vertex weights.", size, GLfloat_p.IN("weights", "the vertex weights"))

	GLvoid("WeightbvARB", "Byte version of #WeightfvARB().", size, GLbyte_p.IN("weights", "the vertex weights"))
	GLvoid("WeightubvARB", "Unsigned byte version of #WeightfvARB().", size, GLubyte_p.IN("weights", "the vertex weights"))

	GLvoid("WeightsvARB", "Short version of #WeightfvARB().", size, GLshort_p.IN("weights", "the vertex weights"))
	GLvoid("WeightusvARB", "Unsigned short version of #WeightfvARB().", size, GLushort_p.IN("weights", "the vertex weights"))

	GLvoid("WeightivARB", "Integer version of #WeightfvARB().", size, GLint_p.IN("weights", "the vertex weights"))
	GLvoid("WeightuivARB", "Unsigned integer version of #WeightfvARB().", size, GLuint_p.IN("weights", "the vertex weights"))

	GLvoid("WeightdvARB", "Double version of #WeightfvARB().", size, GLdouble_p.IN("weights", "the vertex weights"))

	GLvoid(
		"WeightPointerARB",
		"Specifies the location and organization of a weight array.",

		GLint.IN("size", "the number of values per vertex that are stored in the array. Must be a value between 1 and #MAX_VERTEX_UNITS_ARB."),
		AutoType("pointer", GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
		    "GL11#BYTE GL11#UNSIGNED_BYTE GL11#SHORT GL11#UNSIGNED_SHORT GL11#INT GL11#UNSIGNED_INT GL11#FLOAT GL11#DOUBLE"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		ARRAY_BUFFER _ GLvoid_p.IN("pointer", "the weight data")
	)

	GLvoid(
		"VertexBlendARB",
		"Sets the number of active transformations applied.",

		GLint.IN("count", "the number of transformations to blend")
	)

}