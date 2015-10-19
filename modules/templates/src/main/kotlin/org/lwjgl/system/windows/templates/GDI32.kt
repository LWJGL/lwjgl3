/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val gdi32 = "GDI32".nativeClass(WINDOWS_PACKAGE, binding = simpleBinding("gdi32")) {
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

	HDC(
		"CreateCompatibleDC",
		"Creates a memory device context (DC) compatible with the specified device.",

		nullable..HDC.IN("hdc", "a handle to an existing DC. If this handle is $NULL, the function creates a memory DC compatible with the application's current screen.")
	)

	BOOL(
		"DeleteDC",
		"Deletes the specified device context (DC).",

		HDC.IN("hdc", "a handle to the device context")
	)

	BOOL(
		"CancelDC",
		"Cancels any pending operation on the specified device context (DC).",

		HDC.IN("hdc", "a handle to the DC")
	)

	int(
		"SaveDC",
		"""
		Saves the current state of the specified device context (DC) by copying data describing selected objects and graphic modes (such as the bitmap, brush,
		palette, font, pen, region, drawing mode, and mapping mode) to a context stack.
		""",

		HDC.IN("hdc", "a handle to the DC whose state is to be saved")
	)

	BOOL(
		"RestoreDC",
		"""
		Restores a device context (DC) to the specified state. The DC is restored by popping state information off a stack created by earlier calls to the
		#SaveDC() function.
		""",

		HDC.IN("hdc", "a handle to the DC"),
		int.IN(
			"savedDC",
			"""
			the saved state to be restored. If this parameter is positive, {@code savedDC} represents a specific instance of the state to be restored. If this
			parameter is negative, {@code savedDC} represents an instance relative to the current state. For example, -1 restores the most recently saved state.
			"""
		)
	)

	BOOL(
		"GetDCOrgEx",
		"""
		Retrieves the final translation origin for a specified device context (DC). The final translation origin specifies an offset that the system uses to
		translate device coordinates into client coordinates (for coordinates in an application's window).
		""",

		HDC.IN("hdc", "a handle to the DC whose final translation origin is to be retrieved"),
		LPPOINT.OUT("point", "a ##POINT structure that receives the final translation origin, in device coordinates")
	)

	int(
		"GetDeviceCaps",
		"Retrieves device-specific information for the specified device.",

		HDC.IN("hdc", "a handle to the DC"),
		int.IN("index", "the item to be returned")
	)

	BOOL(
		"GetDeviceGammaRamp",
		"Sets the gamma ramp on direct color display boards having drivers that support downloadable gamma ramps in hardware.",

		HDC.IN("hdc", "the device context of the direct color display board in question"),
		LPVOID.IN(
			"lpRamp",
			"""
			pointer to a buffer containing the gamma ramp to be set. The gamma ramp is specified in three arrays of 256 WORD elements each, which contain the
			mapping between RGB values in the frame buffer and digital-analog-converter (DAC ) values. The sequence of the arrays is red, green, blue. The RGB
			values must be stored in the most significant bits of each WORD to increase DAC independence.
			"""
		)
	)

	BOOL(
		"SetDeviceGammaRamp",
		"Gets the gamma ramp on direct color display boards having drivers that support downloadable gamma ramps in hardware.",

		HDC.IN("hdc", "the device context of the direct color display board in question"),
		LPVOID.IN(
			"lpRamp",
			"""
			points to a buffer where the function can place the current gamma ramp of the color display board. The gamma ramp is specified in three arrays of
			256 WORD elements each, which contain the mapping between RGB values in the frame buffer and digital-analog-converter (DAC) values. The sequence of
			the arrays is red, green, blue.
			"""
		)
	)

	int(
		"ChoosePixelFormat",
		"Attempts to match an appropriate pixel format supported by a device context to a given pixel format specification.",

		HDC.IN("hdc", "the device context that the function examines to determine the best match for the pixel format descriptor pointed to by {@code pixelFormatDescriptor}"),
		const..PIXELFORMATDESCRIPTOR_p.IN("pixelFormatDescriptor", "a ##PIXELFORMATDESCRIPTOR structure that specifies the requested pixel format")
	)

	int(
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

	int(
		"GetPixelFormat",
		"Obtains the index of the currently selected pixel format of the specified device context.",

		HDC.IN("hdc", "the device context of the currently selected pixel format index returned by the function")
	)

	BOOL(
		"SetPixelFormat",
		"Sets the pixel format of the specified device context to the format specified by the pixelFormat index.",

		HDC.IN("hdc", "the device context whose pixel format the function attempts to set"),
		int.IN("pixelFormat", "index that identifies the pixel format to set. The various pixel formats supported by a device context are identified by one-based indexes."),
		const..PIXELFORMATDESCRIPTOR_p.IN(
			"pixelFormatDescriptor",
			"""
			a ##PIXELFORMATDESCRIPTOR structure that contains the logical pixel format specification. The system's metafile component uses this structure
			to record the logical pixel format specification. The structure has no other effect upon the behavior of the SetPixelFormat function.
			"""
		)
	)

	BOOL(
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