/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

fun GLX_SGIX_pbuffer() = "GLXSGIXPBuffer".nativeClassGLX("GLX_SGIX_pbuffer", SGIX) {
	nativeImport (
		"OpenGL.h",
		"GLX.h"
	)

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/SGIX/pbuffer.txt", templateName)} extension.

		This extension defines pixel buffers (GLXPbuffers, or pbuffer for short). GLXPbuffers are additional non-visible rendering buffers for an OpenGL
		renderer.
		"""
	)

	IntConstant.block(
		"Accepted by the {@code attribute} parameter of {@link GLXSGIXFBConfig#glXGetFBConfigAttribSGIX}:",

		"MAX_PBUFFER_WIDTH_SGIX" _ 0x8016,
		"MAX_PBUFFER_HEIGHT_SGIX" _ 0x8017,
		"MAX_PBUFFER_PIXELS_SGIX" _ 0x8018,
		"OPTIMAL_PBUFFER_WIDTH_SGIX" _ 0x8019,
		"OPTIMAL_PBUFFER_HEIGHT_SGIX" _ 0x801A
	)

	IntConstant.block(
		"""
		Returned by {@link GLXSGIXFBConfig#glXGetFBConfigAttribSGIX} (when {@code attribute} is set to {@link GLXSGIXFBConfig#GLX_DRAWABLE_TYPE_SGIX}) and
		accepted by the {@code attrib_list} parameter of {@link GLXSGIXFBConfig#glXChooseFBConfigSGIX} (following the
		{@link GLXSGIXFBConfig#GLX_DRAWABLE_TYPE_SGIX} token):
		""",

		"PBUFFER_BIT_SGIX" _ 0x00000004
	)

	IntConstant.block(
		"Accepted by the {@code attrib_list} parameter of {@link #glXCreateGLXPbufferSGIX} and by the {@code attribute} parameter of {@link #glXQueryGLXPbufferSGIX}:",

		"PRESERVED_CONTENTS_SGIX" _ 0x801B,
		"LARGEST_PBUFFER_SGIX" _ 0x801C
	)

	IntConstant.block(
		"Accepted by the {@code attribute} parameter of {@link #glXQueryGLXPbufferSGIX}:",

		"WIDTH_SGIX" _ 0x801D,
		"HEIGHT_SGIX" _ 0x801E,
		"EVENT_MASK_SGIX" _ 0x801F
	)

	IntConstant.block(
		"Accepted by the {@code mask} parameter of {@link #glXSelectEventSGIX} and returned in the {@code mask} parameter of #glXGetSelectedEventSGIX}:",

		"BUFFER_CLOBBER_MASK_SGIX" _ 0x08000000
	)

	IntConstant.block(
		"Returned in the {@code event_type} field of a \"buffer clobber\" event:",

		"DAMAGED_SGIX" _ 0x8020,
		"SAVED_SGIX" _ 0x8021
	)

	IntConstant.block(
		"Returned in the {@code draw_type} field of a \"buffer clobber\" event:",

		"WINDOW_SGIX" _ 0x8022,
		"PBUFFER_SGIX" _ 0x8023
	)

	IntConstant.block(
		"Returned in the {@code mask} field of a \"buffer clobber\" event:",

		"FRONT_LEFT_BUFFER_BIT_SGIX" _ 0x00000001,
		"FRONT_RIGHT_BUFFER_BIT_SGIX" _ 0x00000002,
		"BACK_LEFT_BUFFER_BIT_SGIX" _ 0x00000004,
		"BACK_RIGHT_BUFFER_BIT_SGIX" _ 0x00000008,
		"AUX_BUFFERS_BIT_SGIX" _ 0x00000010,
		"DEPTH_BUFFER_BIT_SGIX" _ 0x00000020,
		"STENCIL_BUFFER_BIT_SGIX" _ 0x00000040,
		"ACCUM_BUFFER_BIT_SGIX" _ 0x00000080,
		"SAMPLE_BUFFERS_BIT_SGIX" _ 0x00000100
	)

	GLXPbuffer.func(
		"CreateGLXPbufferSGIX",
		"Creates a single GLXPbuffer and returns its XID.",

		DISPLAY,
		GLXFBConfig.IN("config", "the {@code GLXFBConfig}"),
		unsigned_int.IN("width", "the pbuffer width"),
		unsigned_int.IN("height", "the pbuffer height"),
		mods(nullable, nullTerminated) _ int_p.IN("attrib_list", "an optional null-terminated list of attributes")
	)

	void.func(
		"DestroyGLXPbufferSGIX",
		"Destroys a GLXPbuffer.",

		DISPLAY,
		GLXPbuffer.IN("pbuf", "the pbuffer to destroy")
	)

	void.func(
		"QueryGLXPbufferSGIX",
		"Queries an attribute associated with a GLXPbuffer.",

		DISPLAY,
		GLXPbuffer.IN("pbuf", "the pbuffer being queried"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ unsigned_int_p.OUT("value", "returns the attribute value")
	)

	void.func(
		"SelectEventSGIX",
		"Selects which GLX events should be received on a GLXdrawable.",

		DISPLAY,
		GLXDrawable.IN("drawable", "the GLXDrawable"),
		unsigned_long.IN("mask", "the selection mask")
	)

	void.func(
		"GetSelectedEventSGIX",
		"Returns which GLX events are selected for a GLXdrawable.",

		DISPLAY,
		GLXDrawable.IN("drawable", "the GLXDrawable"),
		Check(1) _ unsigned_long_p.OUT("mask", "returns the selection mask")
	)

}