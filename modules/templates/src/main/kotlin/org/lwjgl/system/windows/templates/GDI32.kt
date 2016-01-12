/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val gdi32 = "GDI32".nativeClass(WINDOWS_PACKAGE, binding = simpleBinding("gdi32", callingConvention = CallingConvention.STDCALL)) {
	nativeDirective("#define APIENTRY __stdcall")

	documentation = "Native bindings to gdi32.dll"

	IntConstant(
		"##PIXELFORMATDESCRIPTOR flags.",
		"PFD_DOUBLEBUFFER"..0x00000001,
		"PFD_STEREO"..0x00000002,
		"PFD_DRAW_TO_WINDOW"..0x00000004,
		"PFD_DRAW_TO_BITMAP"..0x00000008,
		"PFD_SUPPORT_GDI"..0x00000010,
		"PFD_SUPPORT_OPENGL"..0x00000020,
		"PFD_GENERIC_FORMAT"..0x00000040,
		"PFD_NEED_PALETTE"..0x00000080,
		"PFD_NEED_SYSTEM_PALETTE"..0x00000100,
		"PFD_SWAP_EXCHANGE"..0x00000200,
		"PFD_SWAP_COPY"..0x00000400,
		"PFD_SWAP_LAYER_BUFFERS"..0x00000800,
		"PFD_GENERIC_ACCELERATED"..0x00001000,
		"PFD_SUPPORT_DIRECTDRAW"..0x00002000,
		"PFD_DIRECT3D_ACCELERATED"..0x00004000,
		"PFD_SUPPORT_COMPOSITION"..0x00008000,

		/* PIXELFORMATDESCRIPTOR flags for use in ChoosePixelFormat only */
		"PFD_DEPTH_DONTCARE"..0x20000000,
		"PFD_DOUBLEBUFFER_DONTCARE"..0x40000000,
		"PFD_STEREO_DONTCARE"..0x80000000.i
	)

	IntConstant(
		"##PIXELFORMATDESCRIPTOR pixel types.",
		"PFD_TYPE_RGBA"..0,
		"PFD_TYPE_COLORINDEX"..1
	)

	IntConstant(
		"##PIXELFORMATDESCRIPTOR layer types.",
		"PFD_MAIN_PLANE"..0,
		"PFD_OVERLAY_PLANE"..1,
		"PFD_UNDERLAY_PLANE"..-1
	)

	SaveLastError..int(
		"ChoosePixelFormat",
		"Attempts to match an appropriate pixel format supported by a device context to a given pixel format specification.",

		HDC.IN("hdc", "the device context that the function examines to determine the best match for the pixel format descriptor pointed to by {@code pixelFormatDescriptor}"),
		const..PIXELFORMATDESCRIPTOR_p.IN("pixelFormatDescriptor", "a ##PIXELFORMATDESCRIPTOR structure that specifies the requested pixel format")
	)

	SaveLastError..int(
		"DescribePixelFormat",
		"""
		Obtains information about the pixel format identified by pixelFormat of the device associated with dc. The function sets the members of the
		##PIXELFORMATDESCRIPTOR structure pointed to by pixelFormatDescriptor with that pixel format data. The return value is the maximum pixel format
		index of the device context.
		""",

		HDC.IN("hdc", "the device context"),
		int.IN("pixelFormat", "index that specifies the pixel format. The pixel formats that a device context supports are identified by positive one-based integer indexes."),
		Expression("PIXELFORMATDESCRIPTOR.SIZEOF")..UINT.IN(
			"bytes",
			"""
			the size, in bytes, of the structure pointed to by {@code pixelFormatDescriptor}. The {@code wglDescribePixelFormat} function stores no more than
			{@code bytes} bytes of data to that structure. Set this value to PIXELFORMATDESCRIPTOR##SIZEOF.
			"""
		),
		nullable..LPPIXELFORMATDESCRIPTOR.OUT(
			"pixelFormatDescriptor",
			"""
			a ##PIXELFORMATDESCRIPTOR structure whose members the function sets with pixel format data. The function stores the number of bytes copied to
			the structure in the structure's {@code size} member. If, upon entry, {@code pixelFormatDescriptor} is $NULL, the function writes no data to the
			structure. This is useful when you only want to obtain the maximum pixel format index of a device context.
			"""
		)
	)

	SaveLastError..int(
		"GetPixelFormat",
		"Obtains the index of the currently selected pixel format of the specified device context.",

		HDC.IN("hdc", "the device context of the currently selected pixel format index returned by the function")
	)

	SaveLastError..BOOL(
		"SetPixelFormat",
		"Sets the pixel format of the specified device context to the format specified by the pixelFormat index.",

		HDC.IN("hdc", "the device context whose pixel format the function attempts to set"),
		int.IN("pixelFormat", "index that identifies the pixel format to set. The various pixel formats supported by a device context are identified by one-based indexes."),
		nullable..const..PIXELFORMATDESCRIPTOR_p.IN(
			"pixelFormatDescriptor",
			"""
			a ##PIXELFORMATDESCRIPTOR structure that contains the logical pixel format specification. The system's metafile component uses this structure
			to record the logical pixel format specification. The structure has no other effect upon the behavior of the SetPixelFormat function.
			"""
		)
	)

	SaveLastError..BOOL(
		"SwapBuffers",
		"Exchanges the front and back buffers if the current pixel format for the window referenced by the specified device context includes a back buffer.",

		HDC.IN(
			"dc",
			"""
			a device context. If the current pixel format for the window referenced by this device context includes a back buffer, the function exchanges the
			front and back buffers.
			"""
		)
	)
}