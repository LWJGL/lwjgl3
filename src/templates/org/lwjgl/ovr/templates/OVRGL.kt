/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.GLuint
import org.lwjgl.ovr.*

val OVRGL = "OVRGL".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR", prefixConstant = "ovr") {
	includeOVRCAPI_GL()

	documentation =
		"""
		Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.

		This class contains OpenGL specific functionality.
		"""

	ovrResult(
		"Hmd_CreateSwapTextureSetGL",
	    "Creates a Texture Set suitable for use with OpenGL.",

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by OVR#Hmd_Create()."),
	    GLuint.IN("format", "the texture format"),
	    int.IN("width", "the requested texture width"),
	    int.IN("height", "the requested texture height"),
	    ovrSwapTextureSet_pp.OUT(
		    "outTextureSet",
		    """
		    the created ##OVRSwapTextureSet, which will be valid only upon a successful return value. This texture set must be eventually destroyed via
		    OVR#Hmd_DestroySwapTextureSet() before destroying the HMD with OVR#Hmd_Destroy().
		    """
	    ),

	    returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use OVR#_GetLastErrorInfo() to get more information."
	)

	ovrResult(
		"Hmd_CreateMirrorTextureGL",
		"Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by OVR#Hmd_Create()."),
		GLuint.IN("format", "the texture format"),
		int.IN("width", "the requested texture width"),
		int.IN("height", "the requested texture height"),
		ovrTexture_pp.OUT(
			"outTextureSet",
			"""
		    the created ##OVRTexture, which will be valid only upon a successful return value. This texture must be eventually destroyed via
		    OVR#Hmd_DestroyMirrorTexture() before destroying the HMD with OVR#Hmd_Destroy().
		    """
		),

		returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use OVR#_GetLastErrorInfo() to get more information."
	)
}