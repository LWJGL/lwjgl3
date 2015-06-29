/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_blend_equation_advanced = "NVBlendEquationAdvanced".nativeClassGL("NV_blend_equation_advanced", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a number of "advanced" blending equations that can be
    used to perform new color blending operations, many of which are more
    complex than the standard blend modes provided by unextended OpenGL.
    
		Requires ${GL20.core}.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev
		and GetInteger64v.
		""",

		"BLEND_ADVANCED_COHERENT_NV" _ 0x9285
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of BlendParameteriNV, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.
		""",

		"BLEND_PREMULTIPLIED_SRC_NV" _ 0x9280,
		"BLEND_OVERLAP_NV" _ 0x9281
	)

	IntConstant(
		"""
		Accepted by the {@code value} parameter of BlendParameteriNV when <pname> is BLEND_OVERLAP_NV.
		""",

		"UNCORRELATED_NV" _ 0x8521,
		"DISJOINT_NV" _ 0x9283,
		"CONJOINT_NV" _ 0x9284
	)

	IntConstant(
		"""
		Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi.
		""",

		"SRC_NV" _ 0x9286,
		"DST_NV" _ 0x9287,
		"SRC_OVER_NV" _ 0x9288,
		"DST_OVER_NV" _ 0x9289,
		"SRC_IN_NV" _ 0x928A,
		"DST_IN_NV" _ 0x928B,
		"SRC_OUT_NV" _ 0x928C,
		"DST_OUT_NV" _ 0x928D,
		"SRC_ATOP_NV" _ 0x928E,
		"DST_ATOP_NV" _ 0x928F,
		"XOR_NV" _ 0x1506,
		"MULTIPLY_NV" _ 0x9294,
		"SCREEN_NV" _ 0x9295,
		"OVERLAY_NV" _ 0x9296,
		"DARKEN_NV" _ 0x9297,
		"LIGHTEN_NV" _ 0x9298,
		"COLORDODGE_NV" _ 0x9299,
		"COLORBURN_NV" _ 0x929A,
		"HARDLIGHT_NV" _ 0x929B,
		"SOFTLIGHT_NV" _ 0x929C,
		"DIFFERENCE_NV" _ 0x929E,
		"EXCLUSION_NV" _ 0x92A0,
		"INVERT_RGB_NV" _ 0x92A3,
		"LINEARDODGE_NV" _ 0x92A4,
		"LINEARBURN_NV" _ 0x92A5,
		"VIVIDLIGHT_NV" _ 0x92A6,
		"LINEARLIGHT_NV" _ 0x92A7,
		"PINLIGHT_NV" _ 0x92A8,
		"HARDMIX_NV" _ 0x92A9,
		
		"HSL_HUE_NV" _ 0x92AD,
		"HSL_SATURATION_NV" _ 0x92AE,
		"HSL_COLOR_NV" _ 0x92AF,
		"HSL_LUMINOSITY_NV" _ 0x92B0,
		
		"PLUS_NV" _ 0x9291,
		"PLUS_CLAMPED_NV" _ 0x92B1,
		"PLUS_CLAMPED_ALPHA_NV" _ 0x92B2,
		"PLUS_DARKER_NV" _ 0x9292,
		"MINUS_NV" _ 0x929F,
		"MINUS_CLAMPED_NV" _ 0x92B3,
		"CONTRAST_NV" _ 0x92A1,
		"INVERT_OVG_NV" _ 0x92B4,
		"RED_NV" _ 0x1903,
		"GREEN_NV" _ 0x1904,
		"BLUE_NV" _ 0x1905
	)

	GLvoid(
		"BlendParameteriNV",
		"",

		GLenum.IN("pname", ""),
		GLint.IN("value", "")
	)

	GLvoid(
		"BlendBarrierNV",
		""
	)
}