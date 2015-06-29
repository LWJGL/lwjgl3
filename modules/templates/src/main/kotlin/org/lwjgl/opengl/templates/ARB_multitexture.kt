/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_multitexture = "ARBMultitexture".nativeClassGL("ARB_multitexture", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows application of multiple textures to a fragment in one rendering pass.

		${GL13.promoted}
		"""

	IntConstant(
		"Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.",

		"TEXTURE0_ARB" _ 0x84C0,
		"TEXTURE1_ARB" _ 0x84C1,
		"TEXTURE2_ARB" _ 0x84C2,
		"TEXTURE3_ARB" _ 0x84C3,
		"TEXTURE4_ARB" _ 0x84C4,
		"TEXTURE5_ARB" _ 0x84C5,
		"TEXTURE6_ARB" _ 0x84C6,
		"TEXTURE7_ARB" _ 0x84C7,
		"TEXTURE8_ARB" _ 0x84C8,
		"TEXTURE9_ARB" _ 0x84C9,
		"TEXTURE10_ARB" _ 0x84CA,
		"TEXTURE11_ARB" _ 0x84CB,
		"TEXTURE12_ARB" _ 0x84CC,
		"TEXTURE13_ARB" _ 0x84CD,
		"TEXTURE14_ARB" _ 0x84CE,
		"TEXTURE15_ARB" _ 0x84CF,
		"TEXTURE16_ARB" _ 0x84D0,
		"TEXTURE17_ARB" _ 0x84D1,
		"TEXTURE18_ARB" _ 0x84D2,
		"TEXTURE19_ARB" _ 0x84D3,
		"TEXTURE20_ARB" _ 0x84D4,
		"TEXTURE21_ARB" _ 0x84D5,
		"TEXTURE22_ARB" _ 0x84D6,
		"TEXTURE23_ARB" _ 0x84D7,
		"TEXTURE24_ARB" _ 0x84D8,
		"TEXTURE25_ARB" _ 0x84D9,
		"TEXTURE26_ARB" _ 0x84DA,
		"TEXTURE27_ARB" _ 0x84DB,
		"TEXTURE28_ARB" _ 0x84DC,
		"TEXTURE29_ARB" _ 0x84DD,
		"TEXTURE30_ARB" _ 0x84DE,
		"TEXTURE31_ARB" _ 0x84DF
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"ACTIVE_TEXTURE_ARB" _ 0x84E0,
		"CLIENT_ACTIVE_TEXTURE_ARB" _ 0x84E1,
		"MAX_TEXTURE_UNITS_ARB" _ 0x84E2
	)

	GLvoid(
		"ActiveTextureARB",
		"""
		Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
		dependent.
		""",

		GLenum.IN("texture", "which texture unit to make active", "#TEXTURE0_ARB GL_TEXTURE[1-31]")
	)

	GLvoid(
		"ClientActiveTextureARB",
		"""
		Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
		DisableClientState with parameter TEXTURE_COORD_ARRAY.
		""",

		GLenum.IN("texture", "which texture coordinate array to make active", "#TEXTURE0_ARB GL_TEXTURE[1-31]")
	)

	// MultiTexCoord functions javadoc
	val texCoordTex = "the coordinate set to be modified"
	val texCoordS = "the s component of the current texture coordinates"
	val texCoordT = "the t component of the current texture coordinates"
	val texCoordR = "the r component of the current texture coordinates"
	val texCoordQ = "the q component of the current texture coordinates"
	val texCoordBuffer = "the texture coordinate buffer"

	GLvoid(
		"MultiTexCoord1fARB",
		"Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.",

		GLenum.IN("texture", texCoordTex),
		GLfloat.IN("s", texCoordS)
	)

	GLvoid("MultiTexCoord1sARB", "Short version of #MultiTexCoord1fARB().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS))
	GLvoid("MultiTexCoord1iARB", "Integer version of #MultiTexCoord1fARB().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS))
	GLvoid("MultiTexCoord1dARB", "Double version of #MultiTexCoord1fARB().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS))

	GLvoid("MultiTexCoord1fvARB", "Pointer version of #MultiTexCoord1fARB().", GLenum.IN("texture", texCoordTex), const _ Check(1) _ GLfloat_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord1svARB", "Pointer version of #MultiTexCoord1sARB().", GLenum.IN("texture", texCoordTex), const _ Check(1) _ GLshort_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord1ivARB", "Pointer version of #MultiTexCoord1iARB().", GLenum.IN("texture", texCoordTex), const _ Check(1) _ GLint_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord1dvARB", "Pointer version of #MultiTexCoord1dARB().", GLenum.IN("texture", texCoordTex), const _ Check(1) _ GLdouble_p.IN("v", texCoordBuffer))

	GLvoid(
		"MultiTexCoord2fARB",
		"Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.",

		GLenum.IN("texture", texCoordTex),
		GLfloat.IN("s", texCoordS),
		GLfloat.IN("t", texCoordT)
	)

	GLvoid("MultiTexCoord2sARB", "Short version of #MultiTexCoord2fARB().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT))
	GLvoid("MultiTexCoord2iARB", "Integer version of #MultiTexCoord2fARB().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS), GLint.IN("t", texCoordT))
	GLvoid("MultiTexCoord2dARB", "Double version of #MultiTexCoord2fARB().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT))

	GLvoid("MultiTexCoord2fvARB", "Pointer version of #MultiTexCoord2fARB().", GLenum.IN("texture", texCoordTex), const _ Check(2) _ GLfloat_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord2svARB", "Pointer version of #MultiTexCoord2sARB().", GLenum.IN("texture", texCoordTex), const _ Check(2) _ GLshort_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord2ivARB", "Pointer version of #MultiTexCoord2iARB().", GLenum.IN("texture", texCoordTex), const _ Check(2) _ GLint_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord2dvARB", "Pointer version of #MultiTexCoord2dARB().", GLenum.IN("texture", texCoordTex), const _ Check(2) _ GLdouble_p.IN("v", texCoordBuffer))

	GLvoid(
		"MultiTexCoord3fARB",
		"Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.",

		GLenum.IN("texture", texCoordTex),
		GLfloat.IN("s", texCoordS),
		GLfloat.IN("t", texCoordT),
		GLfloat.IN("r", texCoordR)
	)

	GLvoid("MultiTexCoord3sARB", "Short version of #MultiTexCoord3fARB().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR))
	GLvoid("MultiTexCoord3iARB", "Integer version of #MultiTexCoord3fARB().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR))
	GLvoid("MultiTexCoord3dARB", "Double version of #MultiTexCoord3fARB().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR))

	GLvoid("MultiTexCoord3fvARB", "Pointer version of #MultiTexCoord3fARB().", GLenum.IN("texture", texCoordTex), const _ Check(3) _ GLfloat_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord3svARB", "Pointer version of #MultiTexCoord3sARB().", GLenum.IN("texture", texCoordTex), const _ Check(3) _ GLshort_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord3ivARB", "Pointer version of #MultiTexCoord3iARB().", GLenum.IN("texture", texCoordTex), const _ Check(3) _ GLint_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord3dvARB", "Pointer version of #MultiTexCoord3dARB().", GLenum.IN("texture", texCoordTex), const _ Check(3) _ GLdouble_p.IN("v", texCoordBuffer))

	GLvoid(
		"MultiTexCoord4fARB",
		"Sets the current four-dimensional texture coordinate for the specified texture coordinate set.",

		GLenum.IN("texture", texCoordTex),
		GLfloat.IN("s", texCoordS),
		GLfloat.IN("t", texCoordT),
		GLfloat.IN("r", texCoordR),
		GLfloat.IN("q", texCoordQ)
	)

	GLvoid("MultiTexCoord4sARB", "Short version of #MultiTexCoord4fARB().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR), GLshort.IN("q", texCoordQ))
	GLvoid("MultiTexCoord4iARB", "Integer version of #MultiTexCoord4fARB().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR), GLint.IN("q", texCoordQ))
	GLvoid("MultiTexCoord4dARB", "Double version of #MultiTexCoord4fARB().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR), GLdouble.IN("q", texCoordQ))

	GLvoid("MultiTexCoord4fvARB", "Pointer version of #MultiTexCoord4fARB().", GLenum.IN("texture", texCoordTex), const _ Check(4) _ GLfloat_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord4svARB", "Pointer version of #MultiTexCoord4sARB().", GLenum.IN("texture", texCoordTex), const _ Check(4) _ GLshort_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord4ivARB", "Pointer version of #MultiTexCoord4iARB().", GLenum.IN("texture", texCoordTex), const _ Check(4) _ GLint_p.IN("v", texCoordBuffer))
	GLvoid("MultiTexCoord4dvARB", "Pointer version of #MultiTexCoord4dARB().", GLenum.IN("texture", texCoordTex), const _ Check(4) _ GLdouble_p.IN("v", texCoordBuffer))
}