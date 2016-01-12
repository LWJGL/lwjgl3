/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.jawt.templates

import org.lwjgl.generator.*
import org.lwjgl.system.jawt.*

val jawt = "JAWTFunctions".nativeClass(JAWT_PACKAGE, prefix = "JAWT_", prefixMethod = "JAWT_", binding = simpleBinding("jawt", callingConvention = CallingConvention.STDCALL)) {
	nativeDirective(
		"""DISABLE_WARNINGS()
#include "jawt_md.h"
ENABLE_WARNINGS()
#ifndef APIENTRY
	#define APIENTRY
#endif""")

	documentation =
		"""
		Bindings to the AWT native interface (jawt.h).

		The AWT native interface allows a native C or C++ application a means by which to access native structures in AWT. This is to facilitate moving legacy
		C and C++ applications to Java and to target the needs of the community who, at present, wish to do their own native rendering to canvases for
		performance reasons. Standard extensions such as Java3D also require a means to access the underlying native data structures of AWT.

        <h3>AWT Native Drawing Surface (JAWT_DrawingSurface)</h3>

		For each platform, there is a native drawing surface structure. This platform-specific structure can be found in {@code jawt_md.h}. See
		##JAWTX11DrawingSurfaceInfo for the Linux platform, ##JAWTWin32DrawingSurfaceInfo for the Windows platform and #MACOSX_USE_CALAYER for the OS X
		platform.
		"""

	IntConstant(
		"JAWT versions.",

		"VERSION_1_3"..0x00010003,
		"VERSION_1_4"..0x00010004,
		"VERSION_1_7"..0x00010007
	)

	IntConstant(
		"""
		When calling #GetAWT() with a JAWT version less than 1.7, you must pass this flag or you will not be able to get a valid drawing surface and #GetAWT()
		will return false. This is to maintain compatibility with applications that used the interface with Java 6 which had multiple rendering models. This
		flag is not necessary when JAWT version 1.7 or greater is used as this is the only supported rendering mode.

		When the native Cocoa toolkit is in use, the pointer stored in {@code JAWT_DrawingSurfaceInfo->platformInfo} points to a {@code NSObject} that conforms
		to the {@code JAWT_SurfaceLayers} protocol. Setting the layer property of this object will cause the specified layer to be overlaid on the Component's
		rectangle. If the window the Component belongs to has a {@code CALayer} attached to it, this layer will be accessible via the {@code windowLayer}
		property.
		${codeBlock("""
&#64;protocol JAWT_SurfaceLayers
	&#64;property (readwrite, retain) CALayer *layer;
	&#64;property (readonly) CALayer *windowLayer;
&#64;end""")}
		""",

		"MACOSX_USE_CALAYER"..0x00010008
	)

	IntConstant(
		"Bitmask values returned by {@code Lock()}.",

		"LOCK_ERROR"..0x00000001,
		"LOCK_CLIP_CHANGED"..0x00000002,
		"LOCK_BOUNDS_CHANGED"..0x00000004,
		"LOCK_SURFACE_CHANGED"..0x00000008
	)

	NativeName("Pointer.BITS64 || Platform.get() != Platform.WINDOWS ? \"JAWT_GetAWT\" : \"_JAWT_GetAWT@8\"")..jboolean(
		"GetAWT",
		"Returns the AWT native structure.",

		JNI_ENV,
		JAWT_p.IN("awt", "the target {@code JAWT} struct"),

		returnDoc = "{@code JNI_FALSE} if an error occurs"
	)

	// JAWT_DrawingSurface functions

	jint(
		"DrawingSurface_Lock",
		"Locks the surface of the target component for native rendering. When finished drawing, the surface must be unlocked with #DrawingSurface_Unlock().",

		EXPLICIT_FUNCTION_ADDRESS,
		JAWT_DrawingSurface_p.IN("ds", "the surface to lock"),

		returnDoc =
		"""
		a bitmask with one or more of the following values:
		${ul(
			"#LOCK_ERROR - When an error has occurred and the surface could not be locked.",
			"#LOCK_CLIP_CHANGED - When the clip region has changed.",
			"#LOCK_BOUNDS_CHANGED - When the bounds of the surface have changed.",
			"#LOCK_SURFACE_CHANGED - When the surface itself has changed"
		)}
		"""
	)

	JAWT_DrawingSurfaceInfo_p(
		"DrawingSurface_GetDrawingSurfaceInfo",
		"""
		Returns the drawing surface info.

		The value returned may be cached, but the values may change if additional calls to #DrawingSurface_Lock() or #DrawingSurface_Unlock() are made.
		#DrawingSurface_Lock() must be called before this can return a valid value.

		When finished with the returned value, #DrawingSurface_FreeDrawingSurfaceInfo() must be called.
		""",

		EXPLICIT_FUNCTION_ADDRESS,
		JAWT_DrawingSurface_p.IN("ds", "the {@link JAWTDrawingSurface} to free"),

		returnDoc = "$NULL if an error has occurred."
	)

	void(
		"DrawingSurface_FreeDrawingSurfaceInfo",
		"Frees the drawing surface info.",

		EXPLICIT_FUNCTION_ADDRESS,
		JAWT_DrawingSurfaceInfo_p.IN("dsi", "the {@link JAWTDrawingSurfaceInfo} to free")
	)

	void(
		"DrawingSurface_Unlock",
		"Unlocks the drawing surface of the target component for native rendering.",

		EXPLICIT_FUNCTION_ADDRESS,
		JAWT_DrawingSurface_p.IN("ds", "the surface to unlock")
	)

	// JAWT struct functions

	JAWT_DrawingSurface_p(
		"GetDrawingSurface",
		"""
		Returns a drawing surface from a target {@code jobject}. This value may be cached.

		#FreeDrawingSurface() must be called when finished with the returned {@link JAWTDrawingSurface}.
		""",

		EXPLICIT_FUNCTION_ADDRESS,
		JNI_ENV,
		jobject.IN(
			"target",
			"must be a {@link java.awt.Component Component} (should be a {@link java.awt.Canvas Canvas} or {@link java.awt.Window Window} for native rendering)"
		),

		returnDoc = "$NULL if an error has occurred"
	)

	void(
		"FreeDrawingSurface",
		"Frees the drawing surface allocated in #GetDrawingSurface().",

		EXPLICIT_FUNCTION_ADDRESS,
		JAWT_DrawingSurface_p.IN("ds", "the {@link JAWTDrawingSurface} to free")
	)

	void(
		"Lock",
		"Locks the entire AWT for synchronization purposes.",

		EXPLICIT_FUNCTION_ADDRESS,
		JNI_ENV
	)

	void(
		"Unlock",
		"Unlocks the entire AWT for synchronization purposes.",

		EXPLICIT_FUNCTION_ADDRESS,
		JNI_ENV
	)

	jobject(
		"GetComponent",
		"""
		Returns a reference to a {@code java.awt.Component Component} from a native platform handle. On Windows, this corresponds to an {@code HWND}; on
		Solaris and Linux, this is a {@code Drawable}. For other platforms, see the appropriate machine-dependent header file for a description. The reference
		returned by this function is a local reference that is only valid in this environment. This function returns a $NULL reference if no component could be
		found with matching platform information.
		""",

		EXPLICIT_FUNCTION_ADDRESS,
		JNI_ENV,
		void_p.IN("platformInfo", "the native platform handle")
	)
}