/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*
import org.lwjgl.opengl.*

fun GLX() = "GLX".nativeClass(LINUX_PACKAGE, prefix = "GLX", prefixMethod = "glX") {
	javaImport(
		"org.lwjgl.opengl.*"
	)

	nativeImport (
		"LinuxLWJGL.h"
	)

	javaDoc("Native bindings to GLX.")

	IntConstant.block(
		"Names for attributes to {@link #glXGetConfig}.",

		"USE_GL" _ 1,
		"BUFFER_SIZE" _ 2,
		"LEVEL" _ 3,
		"RGBA" _ 4,
		"DOUBLEBUFFER" _ 5,
		"STEREO" _ 6,
		"AUX_BUFFERS" _ 7,
		"RED_SIZE" _ 8,
		"GREEN_SIZE" _ 9,
		"BLUE_SIZE" _ 10,
		"ALPHA_SIZE" _ 11,
		"DEPTH_SIZE" _ 12,
		"STENCIL_SIZE" _ 13,
		"ACCUM_RED_SIZE" _ 14,
		"ACCUM_GREEN_SIZE" _ 15,
		"ACCUM_BLUE_SIZE" _ 16,
		"ACCUM_ALPHA_SIZE" _ 17
	)

	IntConstant.block(
		"Error return values from {@link #glXGetConfig}. Success is indicated by a value of 0.",

		"BAD_SCREEN" _ 1,
		"BAD_ATTRIBUTE" _ 2,
		"NO_EXTENSION" _ 3,
		"BAD_VISUAL" _ 4,
		"BAD_CONTEXT" _ 5,
		"BAD_VALUE" _ 6,
		"BAD_ENUM" _ 7
	)

	// --------------------------------------------------------

	Bool.func(
		"QueryExtension",
		"Ascertains if the GLX extension is defined for an X server.",

		DISPLAY,
		Check(1) _ int_p.OUT("error_base", "returns the value of the first error code"),
		Check(1) _ int_p.OUT("event_base", "returns the value of the first event code")
	)

	Bool.func(
		"QueryVersion",
		"Queries the GLX version supported.",

		DISPLAY,
		Check(1) _ int_p.OUT("major", "returns the major version"),
		Check(1) _ int_p.OUT("minor", "returns the minor version")
	)

	int.func(
		"GetConfig",
		"Returns a description of an OpenGL attribute exported by a Visual.",

		DISPLAY,
		XVisualInfo_p.IN("visual", "a pointer to an {@link XVisualInfo} structure"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ int_p.OUT("value", "returns the attribute value")
	)

	XVisualInfo_p.func(
		"ChooseVisual",
		"Finds a visual that matches the client’s specified attributes.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		mods(nullable, nullTerminated) _ int_p.IN("attrib_list", "a list of attributes terminated with {@link X#None}"),

		returnDoc =
		"""
		a pointer to an {@code XVisualInfo} structure describing the visual that best matches the specified attributes. If no matching visual exists, $NULL is
		returned.
		"""
	)

	GLXContext.func(
		"CreateContext",
		"Creates an OpenGL context.",

		DISPLAY,
		XVisualInfo_p.IN("visual", "a pointer to an {@link XVisualInfo} structure"),
		GLXContext.IN("share_list", "the GLXContext to share objects with"),
		Bool.IN("direct", "whether direct rendering is requested")
	)

	Bool.func(
		"MakeCurrent",
		"Makes a context current in the current thread",

		DISPLAY,
		GLXDrawable.IN("draw", "the draw GLXdrawable"),
		GLXContext.IN("ctx", "the GLXContext to make current")
	)

	void.func(
		"CopyContext",
		"Copies OpenGL rendering state from one context to another.",

		DISPLAY,
		GLXContext.IN("source", "the source GLXContext"),
		GLXContext.IN("dest", "the destination GLXContext"),
		unsigned_long.IN(
			"mask",
			"indicates which groups of state variables are to be copied; it contains the bitwise OR of the symbolic names for the attribute groups"
		)
	)

	Bool.func(
		"IsDirect",
		"Determines if an OpenGL rendering context is direct.",

		DISPLAY,
		GLXContext.IN("ctx", "the GLXContext to query")
	)

	void.func(
		"DestroyContext",
		"""
		Destroys an OpenGL context.

		If {@code ctx} is still current to any thread, {@code ctx} is not destroyed until it is no longer current. In any event, the associated XID will be
		destroyed and {@code ctx} cannot subsequently be made current to any thread.
		""",

		DISPLAY,
		GLXContext.IN("ctx", "the GLXContext to destroy")
	)

	GLXContext.func(
		"GetCurrentContext",
		"Returns the GLXContext that is current in the current thread."
	)

	GLXDrawable.func(
		"GetCurrentDrawable",
		"Returns the XID of the current drawable used for rendering."
	)

	void.func(
		"WaitGL",
		"""
		Prevents X requests from executing until any outstanding OpenGL rendering is done.

		OpenGL calls made prior to {@code glXWaitGL} are guaranteed to be executed before X rendering calls made after {@code glXWaitGL}. While the same result
		can be achieved using {@link GL11#glFinish}, {@code glXWaitGL} does not require a round trip to the server, and is therefore more efficient in cases
		where the client and server are on separate machines.
		"""
	)

	void.func(
		"WaitX",
		"""
		Prevents the OpenGL command sequence from executing until any outstanding X requests are completed.

		X rendering calls made prior to {@code glXWaitX} are guaranteed to be executed before OpenGL rendering calls made after {@code glXWaitX}. While the same
		result can be achieved using {@link Xlib#XSync}, {@code glXWaitX} does not require a round trip to the server, and may therefore be more efficient.
		"""
	)

	void.func(
		"SwapBuffers",
		"""
		For drawables that are double buffered, makes the contexts of the back buffer potentially visible (i.e., become the contents of the front buffer).

		The contents of the back buffer then become undefined. This operation is a no-op if draw was created with a non-double-buffered GLXFBConfig, or if draw
		is a GLXPixmap.
		""",

		DISPLAY,
		GLXDrawable.IN("draw", "a double buffered GLXDrawable")
	)

	void.func(
		"UseXFont",
		"Provides a shortcut for using X fonts.",

		Font.IN("font", "the font to use"),
		int.IN("first", "the first glyph in the font to use"),
		int.IN("count", "the number of display lists to define"),
		int.IN("list_base", "the base list number")
	)

	GLXPixmap.func(
		"CreateGLXPixmap",
		"Creates a GLXPixmap from a Pixmap.",

		DISPLAY,
		XVisualInfo_p.IN("visual", "a pointer to a {@link XVisualInfo} structure"),
		Pixmap.IN("pixmap", "the Pixmap")
	)

	void.func(
		"DestroyGLXPixmap",
		"Destroys a GLXPixmap.",

		DISPLAY,
		GLXPixmap.IN("pixmap", "the GLXPixmap to destroy.")
	)

}