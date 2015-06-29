/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.macosx.*

val CGL = "CGL".nativeClass(OPENGL_PACKAGE, nativeSubPath = "cgl", prefix = "CGL", prefixMethod = "CGL", prefixConstant = "kCGL") {
	nativeImport (
		"MacOSXLWJGL.h",
		"<OpenGL/OpenGL.h>"
	)

	documentation = "Native bindings to CGL."

	// -----------------------------------------------
	// CGLTypes.h

	val PixelFormatAttribs = IntConstant(
		"Attribute names for #ChoosePixelFormat() and #DescribePixelFormat().",

		"PFAAllRenderers" _ 1,
		"PFATripleBuffer" _ 3,
		"PFADoubleBuffer" _ 5,
		"PFAStereo" _ 6,
		"PFAColorSize" _ 8,
		"PFAAlphaSize" _ 11,
		"PFADepthSize" _ 12,
		"PFAStencilSize" _ 13,
		"PFAMinimumPolicy" _ 51,
		"PFAMaximumPolicy" _ 52,
		"PFASampleBuffers" _ 55,
		"PFASamples" _ 56,
		"PFAColorFloat" _ 58,
		"PFAMultisample" _ 59,
		"PFASupersample" _ 60,
		"PFASampleAlpha" _ 61,
		"PFARendererID" _ 70,
		"PFASingleRenderer" _ 71,
		"PFANoRecovery" _ 72,
		"PFAAccelerated" _ 73,
		"PFAClosestPolicy" _ 74,
		"PFABackingStore" _ 76,
		"PFABackingVolatile" _ 77,
		"PFADisplayMask" _ 84,
		"PFAAllowOfflineRenderers" _ 96,
		"PFAAcceleratedCompute" _ 97,
		"PFAOpenGLProfile" _ 99,
		"PFASupportsAutomaticGraphicsSwitching" _ 101,
		"PFAVirtualScreenCount" _ 128,
		"PFAAuxBuffers" _ 7,
		"PFAAccumSize" _ 14,
		"PFAOffScreen" _ 53,
		"PFAAuxDepthStencil" _ 57,
		"PFAWindow" _ 80,
		"PFACompliant" _ 83,
		"PFAPBuffer" _ 90,
		"PFARemotePBuffer" _ 91,
		"PFARobust" _ 75,
		"PFAMPSafe" _ 78,
		"PFAMultiScreen" _ 81,
		"PFAFullScreen" _ 54
	).javaDocLinks

	val RendererProperties = IntConstant(
		"Property names for #DescribeRenderer().",

		"RPOffScreen" _ 53,
		"RPRendererID" _ 70,
		"RPAccelerated" _ 73,
		"RPBackingStore" _ 76,
		"RPWindow" _ 80,
		"RPCompliant" _ 83,
		"RPDisplayMask" _ 84,
		"RPBufferModes" _ 100,
		"RPColorModes" _ 103,
		"RPAccumModes" _ 104,
		"RPDepthModes" _ 105,
		"RPStencilModes" _ 106,
		"RPMaxAuxBuffers" _ 107,
		"RPMaxSampleBuffers" _ 108,
		"RPMaxSamples" _ 109,
		"RPSampleModes" _ 110,
		"RPSampleAlpha" _ 111,
		"RPVideoMemory" _ 120,
		"RPTextureMemory" _ 121,
		"RPGPUVertProcCapable" _ 122,
		"RPGPUFragProcCapable" _ 123,
		"RPRendererCount" _ 128,
		"RPOnline" _ 129,
		"RPAcceleratedCompute" _ 130,
		"RPVideoMemoryMegabytes" _ 131,
		"RPTextureMemoryMegabytes" _ 132,
		"RPRobust" _ 75,
		"RPMPSafe" _ 78,
		"RPMultiScreen" _ 81,
		"RPFullScreen" _ 54
	).javaDocLinks

	val ContextOptions = IntConstant(
		"Enable names for #Enable(), #Disable(), and #IsEnabled().",

		"CESwapRectangle" _ 201,
		"CESwapLimit" _ 203,
		"CERasterization" _ 221,
		"CEStateValidation" _ 301,
		"CESurfaceBackingSize" _ 305,
		"CEDisplayListOptimization" _ 307,
		"CEMPEngine" _ 313
	).javaDocLinks

	val ContextParameters = IntConstant(
		"Parameter names for #SetParameter() and #GetParameter().",

		"CPSwapRectangle" _ 200,
		"CPSwapInterval" _ 222,
		"CPDispatchTableSize" _ 224,
		"CPClientStorage" _ 226,
		"CPSurfaceTexture" _ 228,
		"CPSurfaceOrder" _ 235,
		"CPSurfaceOpacity" _ 236,
		"CPSurfaceBackingSize" _ 304,
		"CPSurfaceSurfaceVolatile" _ 306,
		"CPReclaimResources" _ 308,
		"CPCurrentRendererID" _ 309,
		"CPGPUVertexProcessing" _ 310,
		"CPGPUFragmentProcessing" _ 311,
		"CPHasDrawable" _ 314,
		"CPMPSwapsInFlight" _ 315
	).javaDocLinks

	val GlobalOptions = IntConstant(
		"Option names for #SetGlobalOption() and #GetGlobalOption().",

		"GOFormatCacheSize" _ 501,
		"GOClearFormatCache" _ 502,
		"GORetainRenderers" _ 503,
		"GOResetLibrary" _ 504,
		"GOUseErrorHandler" _ 505,
		"GOUseBuildCache" _ 506
	).javaDocLinks

	IntConstant(
		"OpenGL Implementation Profiles.",

		"OGLPVersion_Legacy" _ 0x1000,
		"OGLPVersion_3_2_Core" _ 0x3200
	)

	val Errors = IntConstant(
		"CGL error return values.",

		"NoError" _ 0,
		"BadAttribute" _ 10000,
		"BadProperty" _ 10001,
		"BadPixelFormat" _ 10002,
		"BadRendererInfo" _ 10003,
		"BadContext" _ 10004,
		"BadDrawable" _ 10005,
		"BadDisplay" _ 10006,
		"BadState" _ 10007,
		"BadValue" _ 10008,
		"BadMatch" _ 10009,
		"BadEnumeration" _ 10010,
		"BadOffScreen" _ 10011,
		"BadFullScreen" _ 10012,
		"BadWindow" _ 10013,
		"BadAddress" _ 10014,
		"BadCodeModule" _ 10015,
		"BadAlloc" _ 10016,
		"BadConnection" _ 10017
	).javaDocLinks

	IntConstant(
		"Buffer modes.",

		"MonoscopicBit" _ 0x00000001,
		"StereoscopicBit" _ 0x00000002,
		"SingleBufferBit" _ 0x00000004,
		"DoubleBufferBit" _ 0x00000008,
		"TripleBufferBit" _ 0x00000010
	)

	IntConstant(
		"Depth and stencil buffer depths.",

		"0Bit" _ 0x00000001,
		"1Bit" _ 0x00000002,
		"2Bit" _ 0x00000004,
		"3Bit" _ 0x00000008,
		"4Bit" _ 0x00000010,
		"5Bit" _ 0x00000020,
		"6Bit" _ 0x00000040,
		"8Bit" _ 0x00000080,
		"10Bit" _ 0x00000100,
		"12Bit" _ 0x00000200,
		"16Bit" _ 0x00000400,
		"24Bit" _ 0x00000800,
		"32Bit" _ 0x00001000,
		"48Bit" _ 0x00002000,
		"64Bit" _ 0x00004000,
		"96Bit" _ 0x00008000,
		"128Bit" _ 0x00010000
	)

	IntConstant(
		"Color and accumulation buffer formats.",

		"RGB444Bit" _ 0x00000040,
		"ARGB4444Bit" _ 0x00000080,
		"RGB444A8Bit" _ 0x00000100,
		"RGB555Bit" _ 0x00000200,
		"ARGB1555Bit" _ 0x00000400,
		"RGB555A8Bit" _ 0x00000800,
		"RGB565Bit" _ 0x00001000,
		"RGB565A8Bit" _ 0x00002000,
		"RGB888Bit" _ 0x00004000,
		"ARGB8888Bit" _ 0x00008000,
		"RGB888A8Bit" _ 0x00010000,
		"RGB101010Bit" _ 0x00020000,
		"ARGB2101010Bit" _ 0x00040000,
		"RGB101010_A8Bit" _ 0x00080000,
		"RGB121212Bit" _ 0x00100000,
		"ARGB12121212Bit" _ 0x00200000,
		"RGB161616Bit" _ 0x00400000,
		"RGBA16161616Bit" _ 0x00800000,
		"RGBFloat64Bit" _ 0x01000000,
		"RGBAFloat64Bit" _ 0x02000000,
		"RGBFloat128Bit" _ 0x04000000,
		"RGBAFloat128Bit" _ 0x08000000,
		"RGBFloat256Bit" _ 0x10000000,
		"RGBAFloat256Bit" _ 0x20000000
	)

	IntConstant(
		"Sampling modes.",

		"SupersampleBit" _ 0x00000001,
		"MultisampleBit" _ 0x00000002
	)

	// -----------------------------------------------
	// CGLCurrent.h

	CGLContextObj(
		"GetCurrentContext",
		"Returns the current rendering context. If there is none, returns $NULL."
	)

	CGLError(
		"SetCurrentContext",
		"""
		Sets the specified rendering context as the current rendering context.

		There can be only one current rendering context. Subsequent OpenGL rendering calls operate on the current rendering context to modify the drawable
		object associated with it.

		You can use AGL macros to bypass the current rendering context mechanism and maintain your own current rendering context.

		A context is current on a per-thread basis. Multiple threads must serialize calls into the same context.
		""",

		CGLContextObj.IN(
			"context",
			"the rendering context to set as the current rendering context. Pass $NULL to release the current rendering context without assigning a new one."
		)
	)

	// -----------------------------------------------
	// CGLDevice.h

	CGLShareGroupObj(
		"GetShareGroup",
		"Returns the sharegroup of the specified rendering context.",

		CGLContextObj.IN("ctx", "a rendering context")
	)

	// -----------------------------------------------
	// OpenGL.h

	// Pixel format functions

	CGLError(
		"ChoosePixelFormat",
		"Creates a pixel format object that satisfies the constraints of the specified buffer and renderer attributes.",

		const _ CGLPixelFormatAttribute_p.IN(
			"attribs",
			"""
			a 0 terminated array that contains a list of buffer and renderer attributes. Attributes can be Boolean or integer. If an attribute is integer, you
			must supply the desired value immediately following the attribute. If the attribute is Boolean, do not supply a value because its presence in the
			attributes array implies a true value.
			""",
			PixelFormatAttribs
		),
		nullable _ Check(1) _ CGLPixelFormatObj_p.OUT(
			"pix",
			"""
			the memory address of a pixel format object. On return, points to a new pixel format object that contains pixel format information and a list of
			virtual screens. If there are no pixel formats or virtual screens that satisfy the constraints of the buffer and renderer attributes, the value of
			pix is set to $NULL.
			"""
		),
		Check(1) _ GLint_p.OUT(
			"npix",
			"on return, points to the number of virtual screens referenced by pix. If pix is $NULL, the value of {@code npix} is set to 0."
		)
	)

	CGLError(
		"DestroyPixelFormat",
		"Frees the memory associated with a pixel format object. Calling this function is equivalent to calling #ReleasePixelFormat().",

		CGLPixelFormatObj.IN("pix", "the pixel format object to destroy")
	)

	CGLError(
		"DescribePixelFormat",
		"Retrieves the values of an attribute associated with a pixel format object.",

		CGLPixelFormatObj.IN("pix", "the pixel format object to query"),
		GLint.IN(
			"pix_num",
			"the virtual screen number whose attribute value you want to retrieve. This value must be between 0 and the number of virtual screens minus one."
		),
		CGLPixelFormatAttribute.IN("attrib", "the attribute whose value you want to obtain", PixelFormatAttribs),
		Check(1) _ GLint_p.OUT("value", "on return, points to the value of the attribute")
	)

	void(
		"ReleasePixelFormat",
		"""
		Decrements the reference count of a pixel format object.

		The system retains the pixel format object when you call the function #CreateContext(), so you can release a pixel format object immediately
		after passing it to the context creation function.

		Each call to CGLReleasePixelFormat decreases the reference count by 1. If the reference count reaches 0, the pixel format object is destroyed.
		""",

		CGLPixelFormatObj.IN("pix", "the pixel format object whose reference count should be decremented")
	)

	CGLPixelFormatObj(
		"RetainPixelFormat",
		"""
		Increments the receiver's reference count.

		Each call to CGLRetainPixelFormat increases the reference count by 1. Each call to CGLRetainPixelFormat must be matched with a call to
		#ReleasePixelFormat().
		""",

		CGLPixelFormatObj.IN("pix", "the pixel format object whose reference count should be incremented")
	)

	GLuint(
		"GetPixelFormatRetainCount",
		"Returns the retain count of a pixel format object.",

		CGLPixelFormatObj.IN("pix", "a pixel format object")
	)

	// Renderer information functions

	CGLError(
		"QueryRendererInfo",
		"""
		Creates a renderer information object that contains properties and values for renderers able to drive all the specified displays in a given display
		mask.
		""",

		GLuint.IN(
			"display_mask",
			"""
			a bit field that contains the bitwise OR of OpenGL display masks returned by the CGDisplayIDToOpenGLDisplayMask function. If you want to obtain
			information for all renderers in the system you must call CGLQueryRendererInfo once for each display bit.
			"""
		),
		Check(1) _ CGLRendererInfoObj_p.OUT(
			"rend",
			"""
			the memory address of a renderer information object. On return, points to a renderer information object that describes all renderers that are able
			to drive the displays specified by the {@code display_mask} parameter. If {@code display_mask} does not specify any displays, the value of
			{@code rend} is set to $NULL. You must call #DestroyRendererInfo() when you no longer need this object.
			"""
		),
		Check(1) _ GLint_p.OUT(
			"nrend",
			"""
			on return, points to the number of renderers described in the renderer information object. If {@code display_mask} does not specify any displays,
			the value of {@code nrend} is set to 0.
			"""
		)
	)

	CGLError(
		"DestroyRendererInfo",
		"Frees resources associated with a renderer information object.",

		CGLRendererInfoObj.IN("rend", "the renderer information object to destroy")
	)

	CGLError(
		"DescribeRenderer",
		"Obtains the value associated with a renderer property.",

		CGLRendererInfoObj.IN(
			"rend",
			"""
			an opaque renderer information object that contains a description of the renderer capabilities you want to inspect. You can obtain a renderer
			information object by calling the function #QueryRendererInfo(). You must call #DestroyRendererInfo() when you no longer need this
			object.
			"""
		),
		GLint.IN(
			"rend_num",
			"""
			the index of the renderer inside the renderer information object — a value between 0 and the number of renderers minus one. The number of renderers
			can be obtained by calling #DescribeRenderer(), passing in {@code rend}, renderer number 0, and the renderer property
			#RPRendererCount.
			"""
		),
		CGLRendererProperty.IN("prop", "the renderer property whose value you want to obtain", RendererProperties),
		Check(1) _ GLint_p.OUT("value", "on return, points to the value of the requested property")
	)

	// Context functions

	CGLError(
		"CreateContext",
		"Creates a CGL rendering context.",

		CGLPixelFormatObj.IN("pix", "a pixel format object created by calling the function #ChoosePixelFormat()"),
		CGLContextObj.IN(
			"share",
			"""
			the rendering context with which to share the OpenGL object state — including texture objects, programs and shader display lists, vertex array
			objects, vertex buffer objects, pixel buffer objects, and frame buffer objects — and the object state associated which each of these object types.
			Pass $NULL to indicate that no sharing is to take place.
			"""
		),
		Check(1) _ CGLContextObj_p.OUT(
			"ctx",
			"""
			the memory address of a context object. On return, points to a new context object with the buffers and attributes specified by the {@code pix}
			parameter. If the context can not be created as specified, the value of {@code ctx} is set to $NULL.
			"""
		)
	)

	CGLError(
		"DestroyContext",
		"""
		Frees the resources associated with a rendering context.

		Starting in Mac OS 10.5, CGL rendering contexts are reference counted. For compatibility reasons, calling CGLDestroyContext clears the drawable
		associated with the rendering context. Calling CGLDestroyContext is the equivalent of calling both #ClearDrawable() and
		#ReleaseContext().
		""",

		CGLContextObj.IN("ctx", "the rendering context to destroy")
	)

	CGLError(
		"CopyContext",
		"Copies the specified state variables from one rendering context to another.",

		CGLContextObj.IN("src", "the source rendering context"),
		CGLContextObj.IN("dst", "the destination rendering context"),
		GLbitfield.IN(
			"mask",
			"""
			a mask that specifies the state variables to copy. Pass a bit field that contains the bitwise OR of the state variable names that you want to copy.
			Use the symbolic mask constants that are passed to the OpenGL function GL11##glPushAttrib(). To copy as many state variables
			as possible, supply the constant GL11##GL_ALL_ATTRIB_BITS.
			"""
		)
	)

	CGLContextObj(
		"RetainContext",
		"""
		Increments the retain count on a CGL rendering context.

		Each call to CGLRetainContext increases the retain count by 1. To prevent memory leaks, each retain call must be balanced with a call to
		#ReleaseContext().
		""",

		CGLContextObj.IN("ctx", "the rendering context to be retained"),

		returnDoc = "the same context that was passed into the function."
	)

	void(
		"ReleaseContext",
		"""
		Decrements the retain count on a CGL rendering context.

		Each call to CGLReleaseContext decreases the retain count by 1.

		When the retain count reaches 0, all resources associated with the rendering context are freed. If the rendering context that you pass is the current
		rendering context and it is freed, the current context is set to $NULL and there is no current rendering context after the function executes. After the
		context is freed, you must make sure you do not use the destroyed rendering context. This includes using CGL macros in which the rendering context is
		explicitly passed to OpenGL.
		""",

		CGLContextObj.IN("ctx", "the rendering context to be released")
	)

	GLuint(
		"GetContextRetainCount",
		"Returns the current retain count of a CGL rendering context.",

		CGLContextObj.IN("ctx", "the CGL rendering context whose retain count you wish to discover")
	)

	CGLPixelFormatObj(
		"GetPixelFormat",
		"""
		Retrieves the current pixel format associated with a CGL rendering context.

		The pixel format object is not retained before being returned to your application. If your application needs to maintain this object, it should call
		#RetainPixelFormat().
		""",

		CGLContextObj.IN("ctx", "the CGL rendering context whose format you want to receive")
	)

	/*// PBuffer functions

	CGLError(
		"CreatePBuffer",
		"reates a pixel buffer of the specified size, compatible with the specified texture target.",

		GLsizei.IN("width", "the width, in pixels, of the pixel buffer"),
		GLsizei.IN("height", "the height, in pixels, of the pixel buffer"),
		GLenum.IN("target", ""),
		GLenum.IN("internalFormat", ""),
		GLint.IN("max_level", ""),
		CGLPBufferObj_p.IN("pbuffer", "")
	)

	CGLError(
		"DestroyPBuffer",
		"",

		CGLPBufferObj.IN("pbuffer", "")
	)

	CGLError(
		"DescribePBuffer",
		"",

		CGLPBufferObj.IN("obj", ""),
		Check(1) _ GLsizei_p.OUT("width", ""),
		Check(1) _ GLsizei_p.OUT("height", ""),
		Check(1) _ GLenum_p.OUT("target", ""),
		Check(1) _ GLenum_p.OUT("internalFormat", ""),
		Check(1) _ GLint_p.OUT("mipmap", "")
	)

	CGLError(
		"TexImagePBuffer",
		"",

		CGLContextObj.IN("ctx", ""),
		CGLPBufferObj.IN("pbuffer", ""),
		GLenum.IN("source", "")
	)

	CGLPBufferObj(
		"RetainPBuffer",
		"",

		CGLPBufferObj.IN("pbuffer", "")
	)

	void(
		"ReleasePBuffer",
		"",

		CGLPBufferObj.IN("pbuffer", "")
	)

	GLuint(
		"GetPBufferRetainCount",
		"",

		CGLPBufferObj.IN("pbuffer", "")
	)

	// Drawable Functions

	CGLError(
		"SetOffScreen",
		"",

		CGLContextObj.IN("ctx", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("rowbytes", ""),
		voidptr.IN("baseaddr", "")
	)

	CGLError(
		"GetOffScreen",
		"",

		CGLContextObj.IN("ctx", ""),
		Check(1) _ GLsizei_p.OUT("width", ""),
		Check(1) _ GLsizei_p.OUT("height", ""),
		Check(1) _ GLint_p.OUT("rowbytes", ""),
		Check(1) _ voidptr_p.OUT("baseaddr", "")
	)

	CGLError(
		"SetFullScreen",
		"",

		CGLContextObj.IN("ctx", "")
	)

	CGLError(
		"SetFullScreenOnDisplay",
		"",

		CGLContextObj.IN("ctx", ""),
		GLuint.IN("display_mask", "")
	)

	CGLError(
		"SetPBuffer",
		"",

		CGLContextObj.IN("ctx", ""),
		CGLPBufferObj.IN("pbuffer", ""),
		GLenum.IN("face", ""),
		GLint.IN("level", ""),
		GLint.IN("screen", "")
	)

	CGLError(
		"GetPBuffer",
		"",

		CGLContextObj.IN("ctx", ""),
		Check(1) _ CGLPBufferObj_p.OUT("pbuffer", ""),
		Check(1) _ GLenum_p.OUT("face", ""),
		Check(1) _ GLint_p.OUT("level", ""),
		Check(1) _ GLint_p.OUT("screen", "")
	)*/

	CGLError(
		"ClearDrawable",
		"Disassociates a rendering context from any drawable objects attached to it.",

		CGLContextObj.IN("ctx", "a rendering context")
	)

	CGLError(
		"FlushDrawable",
		"""
		Copies the back buffer of a double-buffered context to the front buffer.

		To create a double-buffered context, specify the #PFADoubleBuffer attribute when you create the pixel format object for the rendering
		context. If the backing store attribute is set to false, the buffers can be exchanged rather than copied. This is often the case in full-screen mode. If
		the receiver is not a double-buffered context, this call does nothing.

		If you set the swap interval attribute (#CPSwapInterval) appropriately, the copy takes place during the vertical retrace of the display,
		rather than immediately after CGLFlushDrawable is called. An implicit GL11##glFlush() operation is performed by CGLFlushDrawable
		before it returns. For optimal performance, an application should not call glFlush immediately before calling CGLFlushDrawable. Subsequent OpenGL
		commands can be issued immediately after calling CGLFlushDrawable, but are not executed until the buffer copy is completed.
		""",

		CGLContextObj.IN("ctx", "the context object")
	)

	// Per context enables and parameters

	CGLError(
		"Enable",
		"Enables an option for a rendering context.",

		CGLContextObj.IN("ctx", "a rendering context"),
		CGLContextEnable.IN("pname", "the option to enable", ContextOptions)
	)

	CGLError(
		"Disable",
		"Disables an option for a rendering context.",

		CGLContextObj.IN("ctx", "a rendering context"),
		CGLContextEnable.IN("pname", "the option to disable", ContextOptions)
	)

	CGLError(
		"IsEnabled",
		"Reports whether an option is enabled for a rendering context.",

		CGLContextObj.IN("ctx", "a rendering context"),
		CGLContextEnable.IN("pname", "the option to query", ContextOptions),
		Check(1) _ GLint_p.OUT("enable", "on return, enable is set to true if the option is enabled")
	)

	CGLError(
		"SetParameter",
		"Sets the value of a rendering context parameter.",

		CGLContextObj.IN("ctx", "a rendering context"),
		CGLContextParameter.IN("pname", "the parameter whose value you want to set", ContextParameters),
		SingleValue("param") _ Check(1) _ const _ GLint_p.IN("params", "a pointer to the value to set the parameter to")
	)

	CGLError(
		"GetParameter",
		"Retrieves the value of a rendering context parameter.",

		CGLContextObj.IN("ctx", "a rendering context"),
		CGLContextParameter.IN("pname", "the parameter whose value you want to retrieve", ContextParameters),
		Check(1) _ GLint_p.OUT("params", "on return, points to the value of the parameter")
	)

	// Virtual screen functions

	CGLError(
		"SetVirtualScreen",
		"""
		Forces subsequent OpenGL commands to the specified virtual screen.

		Setting the virtual screen forces the renderer associated with the virtual screen to process OpenGL commands issued to the specified context. Changing
		the virtual screen changes the current renderer. You should use this function only when it is necessary to override the default behavior. The current
		virtual screen is normally set automatically. Because the current virtual screen determines which OpenGL renderer is processing commands, the return
		values of all glGetXXX functions can be affected by the current virtual screen.
		""",

		CGLContextObj.IN("ctx", "a rendering context"),
		GLint.IN(
			"screen",
			"""
			a virtual screen number, which must be a value between 0 and the number of virtual screens minus one. The number of virtual screens available in a
			context can be obtained by calling the function #DescribePixelFormat(), passing in the pixel format object used to create the rendering
			context, 0 for the virtual screen number ({@code pix_num} parameter), and the attribute constant #PFAVirtualScreenCount.
			"""
		)
	)

	CGLError(
		"GetVirtualScreen",
		"""
		Gets the current virtual screen number associated with a rendering context.

		The current virtual screen can change when a drawable object is moved or resized across graphics device boundaries. A change in the current virtual
		screen can affect the return values of some OpenGL functions and in most cases also means that the renderer has changed.
		""",

		CGLContextObj.IN("ctx", "a rendering context"),
		Check(1) _ GLint_p.OUT(
			"screen",
			"""
			on return, points to the virtual screen associated with the context. The value is always 0 on a single-display system and –1 if the function fails
			for any reason.
			"""
		)
	)

	CGLError(
		"UpdateContext",
		"",

		CGLContextObj.IN("ctx", "a rendering context")
	)

	// Global library options

	CGLError(
		"SetGlobalOption",
		"Sets the value of a global option.",

		CGLGlobalOption.IN("pname", "the name of the option whose value you want to set", GlobalOptions),
		SingleValue("param") _ Check(1) _ const _ GLint_p.IN("params", "the value to set the option to")
	)

	CGLError(
		"GetGlobalOption",
		"Retrieves the value of a global option.",

		CGLGlobalOption.IN("pname", "the name of the option whose value you want to get", GlobalOptions),
		Check(1) _ GLint_p.OUT("params", "on return, a pointer to the value of the option")
	)

	/*CGLError(
		"SetOption",
		"",

		CGLGlobalOption.IN("pname", ""),
		GLint.IN("param", "")
	)

	CGLError(
		"GetOption",
		"",

		CGLGlobalOption.IN("pname", ""),
		GLint_p.IN("param", "")
	)*/

	// Locking functions

	CGLError(
		"LockContext",
		"""
		Locks a CGL rendering context.

		The function CGLLockContext blocks the thread it is on until all other threads have unlocked the same context using the function
		#UnlockContext(). You can use CGLLockContext recursively. Context-specific CGL calls by themselves do not require locking, but you can
		guarantee serial processing for a group of calls by surrounding them with CGLLockContext and CGLUnlockContext. Keep in mind that calls from the OpenGL
		API (the API provided by the Architecture Review Board) require locking.

		Applications that use NSOpenGL classes with multithreading can lock contexts using the functions CGLLockContext and CGLUnlockContext. To perform
		rendering in a thread other than the main one, you can lock the context that you want to access and safely execute OpenGL commands. The locking calls
		must be placed around all OpenGL calls in all threads.
		""",

		CGLContextObj.IN("context", "a rendering context")
	)

	CGLError(
		"UnlockContext",
		"Unlocks a CGL rendering context.",

		CGLContextObj.IN("context", "the CGL context to unlock")
	)

	// Version numbers

	void(
		"GetVersion",
		"Gets the major and minor version numbers of the CGL library.",

		Check(1) _ GLint_p.OUT("majorvers", "on return, points to the major version number of the CGL library"),
		Check(1) _ GLint_p.OUT("minorvers", "on return, points to the minor version number of the CGL library")
	)

	// Convert an error code to a string

	(const _ charASCII_p)(
		"ErrorString",
		"Returns a string that describes the specified result code.",

		CGLError.IN("error", "the CGL result code constant returned from a CGL function", Errors)
	)
}