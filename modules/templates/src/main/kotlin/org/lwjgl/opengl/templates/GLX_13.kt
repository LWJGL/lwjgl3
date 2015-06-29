/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*
import org.lwjgl.opengl.*

val GLX13 = "GLX13".nativeClassGLX("GLX_13") {
	javaImport("org.lwjgl.system.linux.*")

	nativeImport (
		"<GL/glx.h>"
	)

	documentation = "Native bindings to GLX 1.3."

	IntConstant(
		"Added in GLX 1.3.",

		"WINDOW_BIT" _ 0x00000001,
		"PIXMAP_BIT" _ 0x00000002,
		"PBUFFER_BIT" _ 0x00000004,
		"RGBA_BIT" _ 0x00000001,
		"COLOR_INDEX_BIT" _ 0x00000002,
		"PBUFFER_CLOBBER_MASK" _ 0x08000000,
		"FRONT_LEFT_BUFFER_BIT" _ 0x00000001,
		"FRONT_RIGHT_BUFFER_BIT" _ 0x00000002,
		"BACK_LEFT_BUFFER_BIT" _ 0x00000004,
		"BACK_RIGHT_BUFFER_BIT" _ 0x00000008,
		"AUX_BUFFERS_BIT" _ 0x00000010,
		"DEPTH_BUFFER_BIT" _ 0x00000020,
		"STENCIL_BUFFER_BIT" _ 0x00000040,
		"ACCUM_BUFFER_BIT" _ 0x00000080,
		"CONFIG_CAVEAT" _ 0x20,
		"X_VISUAL_TYPE" _ 0x22,
		"TRANSPARENT_TYPE" _ 0x23,
		"TRANSPARENT_INDEX_VALUE" _ 0x24,
		"TRANSPARENT_RED_VALUE" _ 0x25,
		"TRANSPARENT_GREEN_VALUE" _ 0x26,
		"TRANSPARENT_BLUE_VALUE" _ 0x27,
		"TRANSPARENT_ALPHA_VALUE" _ 0x28,
		"DONT_CARE" _ 0xFFFFFFFF.i,
		"NONE" _ 0x8000,
		"SLOW_CONFIG" _ 0x8001,
		"TRUE_COLOR" _ 0x8002,
		"DIRECT_COLOR" _ 0x8003,
		"PSEUDO_COLOR" _ 0x8004,
		"STATIC_COLOR" _ 0x8005,
		"GRAY_SCALE" _ 0x8006,
		"STATIC_GRAY" _ 0x8007,
		"TRANSPARENT_RGB" _ 0x8008,
		"TRANSPARENT_INDEX" _ 0x8009,
		"VISUAL_ID" _ 0x800B,
		"SCREEN" _ 0x800C,
		"NON_CONFORMANT_CONFIG" _ 0x800D,
		"DRAWABLE_TYPE" _ 0x8010,
		"RENDER_TYPE" _ 0x8011,
		"X_RENDERABLE" _ 0x8012,
		"FBCONFIG_ID" _ 0x8013,
		"RGBA_TYPE" _ 0x8014,
		"COLOR_INDEX_TYPE" _ 0x8015,
		"MAX_PBUFFER_WIDTH" _ 0x8016,
		"MAX_PBUFFER_HEIGHT" _ 0x8017,
		"MAX_PBUFFER_PIXELS" _ 0x8018,
		"PRESERVED_CONTENTS" _ 0x801B,
		"LARGEST_PBUFFER" _ 0x801C,
		"WIDTH" _ 0x801D,
		"HEIGHT" _ 0x801E,
		"EVENT_MASK" _ 0x801F,
		"DAMAGED" _ 0x8020,
		"SAVED" _ 0x8021,
		"WINDOW" _ 0x8022,
		"PBUFFER" _ 0x8023,
		"PBUFFER_HEIGHT" _ 0x8040,
		"PBUFFER_WIDTH" _ 0x8041
	)

	GLXFBConfig_p(
		"GetFBConfigs",
		"Returns the list of all GLXFBConfigs that are available on the specified screen.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		autoSizeResult _ int_p.OUT("nelements", "returns the number of GLXFBConfigs in the returned list")
	)

	GLXFBConfig_p(
		"ChooseFBConfig",
		"Returns a list of GLXFBConfigs that match a list of attributes.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		const _ nullable _ nullTerminated _ int_p.IN("attrib_list", "a list of attributes terminated with X##None"),
		autoSizeResult _ int_p.OUT("nelements", "returns the number of GLXFBConfigs matched")
	)

	int(
		"GetFBConfigAttrib",
		"Queries the value of a GLX attribute for a GLXFBConfig.",

		DISPLAY,
		GLXFBConfig.IN("config", "the GLXFBConfig being queried"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ int_p.OUT("value", "the attribute value")
	)

	XVisualInfo_p(
		"GetVisualFromFBConfig",
		"Retrieves the associated visual of a GLXFBConfig.",

		DISPLAY,
		GLXFBConfig.IN("config", "the GLXFBConfig")
	)

	GLXWindow(
		"CreateWindow",
		"Create an onscreen rendering area from an X Window and a desired GLXFBConfig.",

		DISPLAY,
		GLXFBConfig.IN("config", "the GLXFBConfig"),
		Window.IN("win", "the X Window"),
		const _ nullable _ nullTerminated _ int_p.IN("attrib_list", "a list of attributes terminated with X##None")
	)

	GLXPixmap(
		"CreatePixmap",
		"Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.",

		DISPLAY,
		GLXFBConfig.IN("config", "the GLXFBConfig"),
		Pixmap.IN("pixmap", "the X Pixmap"),
		const _ nullable _ nullTerminated _ int_p.IN("attrib_list", "a list of attributes terminated with X##None")
	)

	void(
		"DestroyPixmap",
		"Destroys a GLXPixmap.",

		DISPLAY,
		GLXPixmap.IN("pixmap", "the GLXPixmap to destroy")
	)

	GLXPbuffer(
		"CreatePbuffer",
		"Creates a GLXPbuffer from a GLXFBConfig.",

		DISPLAY,
		GLXFBConfig.IN("config", "the GLXFBConfig"),
		const _ nullable _ nullTerminated _ int_p.IN("attrib_list", "a list of attributes terminated with X##None")
	)

	void(
		"DestroyPbuffer",
		"Destroys a GLXPbuffer.",

		DISPLAY,
		GLXPbuffer.IN("pbuf", "the GLXPbuffer to destroy")
	)

	void(
		"QueryDrawable",
		"Queries an attribute associated with a GLXDrawable.",

		DISPLAY,
		GLXDrawable.IN("draw", "the GLXDrawable being queried"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ unsigned_int_p.OUT("value", "returns the attribute value")
	)

	GLXContext(
		"CreateNewContext",
		"Creates an OpenGL rendering context.",

		DISPLAY,
		GLXFBConfig.IN("config", "the GLXFBConfig"),
		int.IN("render_type", "the render type"),
		nullable _ GLXContext.IN("share_list", "a GLXContext to share objects with"),
		Bool.IN("direct", "whether direct rendering is requested")
	)
	Bool(
		"MakeContextCurrent",
		"Makes a GLXContext current in the current thread.",

		DISPLAY,
		nullable _ GLXDrawable.IN("draw", "the draw GLXDrawable"),
		nullable _ GLXDrawable.IN("read", "the read GLXDrawable"),
		nullable _ GLXContext.IN("ctx", "the GLXContext")
	)

	GLXDrawable(
		"GetCurrentReadDrawable",
		"Returns the current GLXDrawable used for reading in the current thread."
	)

	int(
		"QueryContext",
		"Queries the value of a GLXContext attribute.",

		DISPLAY,
		GLXContext.IN("ctx", "the GLXContext being queried"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ int_p.OUT("value", "returns the attribute value")
	)

	void(
		"SelectEvent",
		"Selects which GLX events should be received on a GLXDrawable.",

		DISPLAY,
		GLXDrawable.IN("draw", "the GLXDrawable"),
		unsigned_long.IN("event_mask", "the selection mask")
	)

	void(
		"GetSelectedEvent",
		"Returns which GLX events are selected for a GLXDrawable.",

		DISPLAY,
		GLXDrawable.IN("draw", "the GLXDrawable"),
		unsigned_long_p.IN("event_mask", "returns the selection mask")
	)

}