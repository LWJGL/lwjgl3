/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.nanovg.templates

import org.lwjgl.generator.*
import org.lwjgl.nanovg.*
import org.lwjgl.opengl.GLuint

val nanovg_gles2 = dependsOn(Binding.OPENGLES) {
	"NanoVGGLES2".nativeClass(packageName = NANOVG_PACKAGE, prefix = "NVG") {
		nativeDirective(
			"""#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4244 4710 4711))
#endif""", beforeIncludes = true)

		includeNanoVGAPI("""#define NANOVG_GLES2_IMPLEMENTATION
#include "nanovg.h"
#include "nanovg_gl.h"
#include "nanovg_gl_utils.h"""")

		documentation =
			"""
			"""

		EnumConstant(
			"Create flags.",

			"ANTIALIAS".enumExpr("Flag indicating if geometry based anti-aliasing is used (may not be needed when using MSAA).", "1<<0"),
			"STENCIL_STROKES".enumExpr(
				"""
				Flag indicating if strokes should be drawn using stencil buffer. The rendering will be a little slower, but path overlaps (i.e.
				self-intersecting or sharp turns) will be drawn just once.
				""",
				"1<<1"
			),
			"DEBUG".enumExpr("Flag indicating that additional debug checks are done.", "1<<2")
		)

		EnumConstant(
			"These are additional flags on top of NVGimageFlags.",

			"IMAGE_NODELETE".enumExpr("Do not delete GL texture handle.", "1<<16")
		)

		int(
			"lCreateImageFromHandle",
			"",

			NVGcontext_p.IN("ctx", ""),
			GLuint.IN("textureId", ""),
			int.IN("w", ""),
			int.IN("h", ""),
			int.IN("flags", "")
		)

		GLuint(
			"lImageHandle",
			"",

			NVGcontext_p.IN("ctx", ""),
			int.IN("image", "")
		)

		Code(
			nativeCall = "\treturn (jlong)(intptr_t)nvgCreateGLES2($JNIENV, flags);"
		)..NVGcontext_p(
			"CreateGLES2",
			"",

			int.IN("flags", "")
		)

		void(
			"DeleteGLES2",
			"",

			NVGcontext_p.IN("ctx", "")
		)

		void(
			"luBindFramebuffer",
			"",

			NVGcontext_p.IN("ctx", ""),
			nullable..NVGLUframebuffer_p.IN("fb", "")
		)

		NVGLUframebuffer_p(
			"luCreateFramebuffer",
			"",

			NVGcontext_p.IN("ctx", ""),
			int.IN("w", ""),
			int.IN("h", ""),
			int.IN("imageFlags", "")
		)

		void(
			"luDeleteFramebuffer",
			"",

			NVGcontext_p.IN("ctx", ""),
			NVGLUframebuffer_p.IN("fb", "")
		)
	}
}