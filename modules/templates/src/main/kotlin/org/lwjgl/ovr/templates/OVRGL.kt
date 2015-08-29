/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.GLuint
import org.lwjgl.ovr.*

val OVRGL = "OVRGL".nativeClass(packageName = OVR_PACKAGE, prefixMethod = "ovr_", prefixConstant = "ovr") {
	includeOVRCAPI_GL()

	documentation =
		"""
		Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.

		This class contains OpenGL specific functionality.
		"""

	ovrResult(
		"CreateSwapTextureSetGL",
	    """
	    Creates a Texture Set suitable for use with OpenGL.

	    Multiple calls to ovr_CreateSwapTextureSetGL for the same {@code ovrHmd} is supported, but applications cannot rely on switching between
	    {@code ovrSwapTextureSets} at runtime without a performance penalty.

	    The {@code format} provided should be thought of as the format the distortion compositor will use when reading the contents of the texture. To that
	    end, it is highly recommended that the application requests swap-texture-set formats that are in sRGB-space (e.g. {@code GL_SRGB_ALPHA8}) as the
	    distortion compositor does sRGB-correct rendering. Furthermore, the app should then make sure "{@code glEnable(GL_FRAMEBUFFER_SRGB);}" is called before
	    rendering into these textures. Even though it is not recommended, if the application would like to treat the texture as a linear format and do
	    linear-to-gamma conversion in GLSL, then the application can avoid calling "{@code glEnable(GL_FRAMEBUFFER_SRGB);}", but should still pass in
	    {@code GL_SRGB_ALPHA8} (not {@code GL_RGBA}) for the {@code format}. Failure to do so will cause the distortion compositor to apply incorrect gamma
	    conversions leading to gamma-curve artifacts.
	    """,

	    ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by OVR#_Create()."),
	    GLuint.IN("format", "the texture format"),
	    int.IN("width", "the requested texture width"),
	    int.IN("height", "the requested texture height"),
		Check(1) _ ovrSwapTextureSet_pp.OUT(
		    "outTextureSet",
		    """
		    the created ##OVRSwapTextureSet, which will be valid only upon a successful return value. This texture set must be eventually destroyed via
		    OVR#_DestroySwapTextureSet() before destroying the HMD with OVR#_Destroy().
		    """
	    ),

	    returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use OVR#_GetLastErrorInfo() to get more information."
	)

	ovrResult(
		"CreateMirrorTextureGL",
		"""
		Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.

		A second call to ovr_CreateMirrorTextureGL for a given {@code ovrHmd} before destroying the first one is not supported and will result in an error
		return.

		The {@code format} provided should be thought of as the format the distortion compositor will use when writing into the mirror texture. It is highly
		recommended that mirror textures are requested as {@code GL_SRGB_ALPHA8} because the distortion compositor does sRGB-correct rendering. If the
		application requests a non-sRGB format (e.g. {@code GL_RGBA}) as the mirror texture, then the application might have to apply a manual linear-to-gamma
		conversion when reading from the mirror texture. Failure to do so can result in incorrect gamma conversions leading to gamma-curve artifacts and color
		banding.
		""",

		ovrHmd.IN("hmd", "an {@code ovrHmd} previously returned by OVR#_Create()."),
		GLuint.IN("format", "the texture format"),
		int.IN("width", "the requested texture width"),
		int.IN("height", "the requested texture height"),
		Check(1) _ ovrTexture_pp.OUT(
			"outMirrorTexture",
			"""
		    the created {@code ovrSwapTexture}, which will be valid upon a successful return value. This texture must be eventually destroyed via
		    OVR#_DestroyMirrorTexture() before destroying the HMD with OVR#_Destroy().
		    """
		),

		returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use OVR#_GetLastErrorInfo() to get more information."
	)
}