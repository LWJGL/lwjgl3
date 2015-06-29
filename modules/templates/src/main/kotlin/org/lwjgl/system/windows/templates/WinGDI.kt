/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val WinGDI = "WinGDI".nativeClass(WINDOWS_PACKAGE) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	documentation = "Native bindings to WinGDI.h"

	IntConstant(
		"DEVMODE field selection bits.",
		/*
		"DM_ORIENTATION" _ 0x00000001,
		"DM_PAPERSIZE" _ 0x00000002,
		"DM_PAPERLENGTH" _ 0x00000004,
		"DM_PAPERWIDTH" _ 0x00000008,
		"DM_SCALE" _ 0x00000010,
		"DM_POSITION" _ 0x00000020,
		"DM_NUP" _ 0x00000040,
		*/

		"DM_DISPLAYORIENTATION" _ 0x00000080, // WINVER >=" _ 0x0501,

		/*
		"DM_COPIES" _ 0x00000100,
		"DM_DEFAULTSOURCE" _ 0x00000200,
		"DM_PRINTQUALITY" _ 0x00000400,
		"DM_COLOR" _ 0x00000800,
		"DM_DUPLEX" _ 0x00001000,
		"DM_YRESOLUTION" _ 0x00002000,
		"DM_TTOPTION" _ 0x00004000,
		"DM_COLLATE" _ 0x00008000,
		"DM_FORMNAME" _ 0x00010000,
		*/
		"DM_LOGPIXELS" _ 0x00020000,
		"DM_BITSPERPEL" _ 0x00040000,
		"DM_PELSWIDTH" _ 0x00080000,
		"DM_PELSHEIGHT" _ 0x00100000,
		"DM_DISPLAYFLAGS" _ 0x00200000,
		"DM_DISPLAYFREQUENCY" _ 0x00400000,

		/*
		"DM_ICMMETHOD" _ 0x00800000,
		"DM_ICMINTENT" _ 0x01000000,
		"DM_MEDIATYPE" _ 0x02000000,
		"DM_DITHERTYPE" _ 0x04000000,
		*/

		/*
		"DM_PANNINGWIDTH" _ 0x08000000,
		"DM_PANNINGHEIGHT" _ 0x10000000,
		*/

		"DM_DISPLAYFIXEDOUTPUT" _ 0x20000000 // WINVER >=" _ 0x0501,
	)

	IntConstant(
		"Stock logical objects.",
		"WHITE_BRUSH" _ 0,
		"LTGRAY_BRUSH" _ 1,
		"GRAY_BRUSH" _ 2,
		"DKGRAY_BRUSH" _ 3,
		"BLACK_BRUSH" _ 4,
		"NULL_BRUSH" _ 5,
		"HOLLOW_BRUSH" expr "NULL_BRUSH",
		"WHITE_PEN" _ 6,
		"BLACK_PEN" _ 7,
		"NULL_PEN" _ 8,
		"OEM_FIXED_FONT" _ 10,
		"ANSI_FIXED_FONT" _ 11,
		"ANSI_VAR_FONT" _ 12,
		"SYSTEM_FONT" _ 13,
		"DEVICE_DEFAULT_FONT" _ 14,
		"DEFAULT_PALETTE" _ 15,
		"SYSTEM_FIXED_FONT" _ 16,
		"DEFAULT_GUI_FONT" _ 17,
		"DC_BRUSH" _ 18,
		"DC_PEN" _ 19
	)

	IntConstant(
		"Object types for #EnumObjects() and #GetCurrentObject().",
		"OBJ_PEN" _ 1,
		"OBJ_BRUSH" _ 2,
		"OBJ_DC" _ 3,
		"OBJ_METADC" _ 4,
		"OBJ_PAL" _ 5,
		"OBJ_FONT" _ 6,
		"OBJ_BITMAP" _ 7,
		"OBJ_REGION" _ 8,
		"OBJ_METAFILE" _ 9,
		"OBJ_MEMDC" _ 10,
		"OBJ_EXTPEN" _ 11,
		"OBJ_ENHMETADC" _ 12,
		"OBJ_ENHMETAFILE" _ 13,
		"OBJ_COLORSPACE" _ 14
	)

	IntConstant(
		"Used by the index parameter of #GetDeviceCaps().",
		"DRIVERVERSION" _ 0, // Device driver version
		"TECHNOLOGY" _ 2, // Device classification
		"HORZSIZE" _ 4, // Horizontal size in millimeters
		"VERTSIZE" _ 6, // Vertical size in millimeters
		"HORZRES" _ 8, // Horizontal width in pixels
		"VERTRES" _ 10, // Vertical height in pixels
		"BITSPIXEL" _ 12, // Number of bits per pixel
		"PLANES" _ 14, // Number of planes
		"NUMBRUSHES" _ 16, // Number of brushes the device has
		"NUMPENS" _ 18, // Number of pens the device has
		"NUMMARKERS" _ 20, // Number of markers the device has
		"NUMFONTS" _ 22, // Number of fonts the device has
		"NUMCOLORS" _ 24, // Number of colors the device supports
		"PDEVICESIZE" _ 26, // Size required for device descriptor
		"CURVECAPS" _ 28, // Curve capabilities
		"LINECAPS" _ 30, // Line capabilities
		"POLYGONALCAPS" _ 32, // Polygonal capabilities
		"TEXTCAPS" _ 34, // Text capabilities
		"CLIPCAPS" _ 36, // Clipping capabilities
		"RASTERCAPS" _ 38, // Bitblt capabilities
		"ASPECTX" _ 40, // Length of the X leg
		"ASPECTY" _ 42, // Length of the Y leg
		"ASPECTXY" _ 44, // Length of the hypotenuse

		"LOGPIXELSX" _ 88, // Logical pixels/inch in X
		"LOGPIXELSY" _ 90, // Logical pixels/inch in Y

		"SIZEPALETTE" _ 104, // Number of entries in physical palette
		"NUMRESERVED" _ 106, // Number of reserved entries in palette
		"COLORRES" _ 108, // Actual color resolution

		/*
		// Printing related DeviceCaps. These replace the appropriate Escapes
		"PHYSICALWIDTH" _ 110, // Physical Width in device units
		"PHYSICALHEIGHT" _ 111, // Physical Height in device units
		"PHYSICALOFFSETX" _ 112, // Physical Printable Area x margin
		"PHYSICALOFFSETY" _ 113, // Physical Printable Area y margin
		"SCALINGFACTORX" _ 114, // Scaling factor x
		"SCALINGFACTORY" _ 115, // Scaling factor y
		*/

		// Display driver specific
		"VREFRESH" _ 116, // Current vertical refresh rate of the
		// display device (for displays only) in Hz
		"DESKTOPVERTRES" _ 117, // Horizontal width of entire desktop in
		// pixels
		"DESKTOPHORZRES" _ 118, // Vertical height of entire desktop in
		// pixels
		"BLTALIGNMENT" _ 119, // Preferred blt alignment

		"SHADEBLENDCAPS" _ 120, // Shading and blending caps
		"COLORMGMTCAPS" _ 121  // Color Management caps
	)

	IntConstant(
		"##PIXELFORMATDESCRIPTOR flags.",
		"PFD_DOUBLEBUFFER" _ 0x00000001,
		"PFD_STEREO" _ 0x00000002,
		"PFD_DRAW_TO_WINDOW" _ 0x00000004,
		"PFD_DRAW_TO_BITMAP" _ 0x00000008,
		"PFD_SUPPORT_GDI" _ 0x00000010,
		"PFD_SUPPORT_OPENGL" _ 0x00000020,
		"PFD_GENERIC_FORMAT" _ 0x00000040,
		"PFD_NEED_PALETTE" _ 0x00000080,
		"PFD_NEED_SYSTEM_PALETTE" _ 0x00000100,
		"PFD_SWAP_EXCHANGE" _ 0x00000200,
		"PFD_SWAP_COPY" _ 0x00000400,
		"PFD_SWAP_LAYER_BUFFERS" _ 0x00000800,
		"PFD_GENERIC_ACCELERATED" _ 0x00001000,
		"PFD_SUPPORT_DIRECTDRAW" _ 0x00002000,
		"PFD_DIRECT3D_ACCELERATED" _ 0x00004000,
		"PFD_SUPPORT_COMPOSITION" _ 0x00008000,

		/* PIXELFORMATDESCRIPTOR flags for use in ChoosePixelFormat only */
		"PFD_DEPTH_DONTCARE" _ 0x20000000,
		"PFD_DOUBLEBUFFER_DONTCARE" _ 0x40000000,
		"PFD_STEREO_DONTCARE" _ 0x80000000.i
	)

	IntConstant(
		"##PIXELFORMATDESCRIPTOR pixel types.",
		"PFD_TYPE_RGBA" _ 0,
		"PFD_TYPE_COLORINDEX" _ 1
	)

	IntConstant(
		"##PIXELFORMATDESCRIPTOR layer types.",
		"PFD_MAIN_PLANE" _ 0,
		"PFD_OVERLAY_PLANE" _ 1,
		"PFD_UNDERLAY_PLANE" _ -1
	)

	HGDIOBJ(
		"GetStockObject",
		"Retrieves a handle to one of the stock pens, brushes, fonts, or palettes.",

		int.IN("object", "the type of stock object")
	)

	int(
		"EnumObjects",
		"""
		Enumerates the pens or brushes available for the specified device context (DC). This function calls the application-defined callback function once for
		each available object, supplying data describing that object. EnumObjects continues calling the callback function until the callback function returns
		zero or until all of the objects have been enumerated.
		""",

		HDC.IN("hdc", "a handle to the DC"),
		int.IN("objectType", "the object type", "#OBJ_BRUSH #OBJ_PEN"),
		GOBJENUMPROC.IN("objectFunc", "the application-defined callback function"),
		LPARAM.IN("param", "the data passed to the callback function along with the object information.")
	)

	HGDIOBJ(
		"SelectObject",
		"Selects an object into the specified device context (DC). The new object replaces the previous object of the same type.",

		HDC.IN("hdc", "a handle to the DC"),
		HGDIOBJ.IN("object", "a handle to the object to be selected")
	)

	HGDIOBJ(
		"GetCurrentObject",
		"Retrieves a handle to an object of the specified type that has been selected into the specified device context (DC).",

		HDC.IN("hdc", "a handle to the DC"),
		UINT.IN("objectType", "the object type to be queried")
	)

	DWORD(
		"GetObjectType",
		"Retrieves the type of the specified object.",

		HGDIOBJ.IN("object", "a handle to the graphics object")
	)

	BOOL(
		"DeleteObject",
		"""
		Deletes a logical pen, brush, font, bitmap, region, or palette, freeing all system resources associated with the object. After the object is deleted,
		the specified handle is no longer valid.
		""",

		HGDIOBJ.IN("object", "a handle to a logical pen, brush, font, bitmap, region, or palette")
	)

	HDC(
		"CreateDC",
		"Creates a device context (DC) for a device using the specified name.",

		nullable _ LPCTSTR.IN(
			"lpszDriver",
			"""
			A pointer to a null-terminated character string that specifies either DISPLAY or the name of a specific display device. For printing, we recommend
			that you pass $NULL to {@code lpszDriver} because GDI ignores {@code lpszDriver} for printer devices.
			"""
		),
		nullable _ LPCTSTR.IN(
			"lpszDevice",
			"""
			A pointer to a null-terminated character string that specifies the name of the specific output device being used, as shown by the Print Manager (for
			example, Epson FX-80). It is not the printer model name. The {@code lpszDevice} parameter must be used.

			To obtain valid names for displays, call #EnumDisplayDevices().

			If {@code lpszDriver} is DISPLAY or the device name of a specific display device, then {@code lpszDevice} must be $NULL or that same device name. If
			{@code lpszDevice} is $NULL, then a DC is created for the primary display device.

			If there are multiple monitors on the system, calling {@code CreateDC(TEXT("DISPLAY"),NULL,NULL,NULL)} will create a DC covering all the monitors.
			"""
		),
		nullable _ LPCTSTR.OUT("lpszOutput", "this parameter is ignored and should be set to $NULL"),
		const _ nullable _ DEVMODE_p.IN(
			"lpInitData",
			"""
			A pointer to a ##DEVMODE structure containing device-specific initialization data for the device driver. The {@code DocumentProperties}
			function retrieves this structure filled in for a specified device. The {@code lpInitData} parameter must be $NULL if the device driver is to use
			the default initialization (if any) specified by the user.

			If {@code lpszDriver} is DISPLAY, {@code lpInitData} must be $NULL; GDI then uses the display device's current ##DEVMODE.
			"""
		)
	)

	HDC(
		"CreateCompatibleDC",
		"Creates a memory device context (DC) compatible with the specified device.",

		nullable _ HDC.IN("hdc", "a handle to an existing DC. If this handle is $NULL, the function creates a memory DC compatible with the application's current screen.")
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
		const _ PIXELFORMATDESCRIPTOR_p.IN("pixelFormatDescriptor", "a ##PIXELFORMATDESCRIPTOR structure that specifies the requested pixel format")
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
		Expression("PIXELFORMATDESCRIPTOR.SIZEOF") _ UINT.IN(
			"bytes",
			"""
			the size, in bytes, of the structure pointed to by {@code pixelFormatDescriptor}. The {@code wglDescribePixelFormat} function stores no more than
			{@code bytes} bytes of data to that structure. Set this value to PIXELFORMATDESCRIPTOR##SIZEOF.
			"""
		),
		nullable _ LPPIXELFORMATDESCRIPTOR.OUT(
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
		const _ PIXELFORMATDESCRIPTOR_p.IN(
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