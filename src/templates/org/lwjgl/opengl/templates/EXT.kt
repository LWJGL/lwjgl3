/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_abgr = "EXTABGR".nativeClassGL("EXT_abgr", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		EXT_abgr extends the list of host-memory color formats. Specifically, it provides a reverse-order alternative to image format RGBA. The ABGR component
		order matches the cpack Iris GL format on big-endian machines.
		"""

	IntConstant(
		"Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

		"ABGR_EXT" _ 0x8000
	)
}

val EXT_bgra = "EXTBGRA".nativeClassGL("EXT_bgra", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		EXT_bgra extends the list of host-memory color formats. Specifically, it provides formats which match the memory layout of Windows DIBs so that
		applications can use the same data in both Windows API calls and OpenGL pixel API calls.

		${GL12.promoted}
		"""

	IntConstant(
		"Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

		"BGR_EXT" _ 0x80E0,
		"BGRA_EXT" _ 0x80E1
	)
}

val EXT_bindable_uniform = "EXTBindableUniform".nativeClassGL("EXT_bindable_uniform", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces the concept of bindable uniforms to the OpenGL Shading Language. A uniform variable can be declared bindable, which means that
		the storage for the uniform is not allocated by the compiler/linker anymore, but is backed by a buffer object. This buffer object is bound to the
		bindable uniform through the new command UniformBufferEXT(). Binding needs to happen after linking a program object.

		Binding different buffer objects to a bindable uniform allows an application to easily use different "uniform data sets", without having to re-specify
		the data every time.

		A buffer object can be bound to bindable uniforms in different program objects. If those bindable uniforms are all of the same type, accessing a
		bindable uniform in program object A will result in the same data if the same access is made in program object B. This provides a mechanism for
		'environment uniforms', uniform values that can be shared among multiple program objects.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_BINDABLE_UNIFORMS_EXT" _ 0x8DE2,
		"MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT" _ 0x8DE3,
		"MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT" _ 0x8DE4,
		"MAX_BINDABLE_UNIFORM_SIZE_EXT" _ 0x8DED,
		"UNIFORM_BUFFER_BINDING_EXT" _ 0x8DEF
	)

	IntConstant(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"UNIFORM_BUFFER_EXT" _ 0x8DEE
	)

	GLvoid(
		"UniformBufferEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLuint.IN("buffer", "")
	)

	GLint(
		"GetUniformBufferSizeEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", "")
	)

	GLintptr(
		"GetUniformOffsetEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", "")
	)
}

val EXT_blend_color = "EXTBlendColor".nativeClassGL("EXT_blend_color", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Blending capability is extended by defining a constant color that can be included in blending equations. A typical usage is blending two RGB images.
		Without the constant blend factor, one image must have an alpha channel with each pixel set to the desired blend factor.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.",

		"CONSTANT_COLOR_EXT" _ 0x8001,
		"ONE_MINUS_CONSTANT_COLOR_EXT" _ 0x8002,
		"CONSTANT_ALPHA_EXT" _ 0x8003,
		"ONE_MINUS_CONSTANT_ALPHA_EXT" _ 0x8004
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_COLOR_EXT" _ 0x8005
	)

	GLvoid(
		"BlendColorEXT",
		"",

		GLclampf.IN("red", ""),
		GLclampf.IN("green", ""),
		GLclampf.IN("blue", ""),
		GLclampf.IN("alpha", "")
	)
}

val EXT_blend_equation_separate = "EXTBlendEquationSeparate".nativeClassGL("EXT_blend_equation_separate", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		${registryLinkTo("EXT", "blend_func_separate")} introduced separate RGB and alpha blend factors. ${registryLinkTo("EXT", "blend_minmax")} introduced a
		distinct blend equation for combining source and destination blend terms. (${registryLinkTo("EXT_blend_subtract", "blend_subtract")} &
		${registryLinkTo("EXT", "blend_logic_op")} added other blend equation modes.) OpenGL 1.4 integrated both functionalities into the core standard.

		While there are separate blend functions for the RGB and alpha blend factors, OpenGL 1.4 provides a single blend equation that applies to both RGB and
		alpha portions of blending.

		This extension provides a separate blend equation for RGB and alpha to match the generality available for blend factors.

		Requires ${GL14.core} or ${ARB_imaging.link} or ${registryLinkTo("EXT", "blend_minmax")} and/or
		${registryLinkTo("EXT_blend_subtract", "blend_subtract")}. ${GL20.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_EQUATION_RGB_EXT" _ 0x8009,
		"BLEND_EQUATION_ALPHA_EXT" _ 0x883D
	)

	GLvoid(
		"BlendEquationSeparateEXT",
		"",

		GLenum.IN("modeRGB", ""),
		GLenum.IN("modeAlpha", "")
	)
}

val EXT_blend_func_separate = "EXTBlendFuncSeparate".nativeClassGL("EXT_blend_func_separate", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Blending capability is extended by defining a function that allows independent setting of the RGB and alpha blend factors for blend operations that
		require source and destination blend factors. It is not always desired that the blending used for RGB is also applied to alpha.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_DST_RGB_EXT" _ 0x80C8,
		"BLEND_SRC_RGB_EXT" _ 0x80C9,
		"BLEND_DST_ALPHA_EXT" _ 0x80CA,
		"BLEND_SRC_ALPHA_EXT" _ 0x80CB
	)

	GLvoid(
		"BlendFuncSeparateEXT",
		"",

		GLenum.IN("sfactorRGB", ""),
		GLenum.IN("dfactorRGB", ""),
		GLenum.IN("sfactorAlpha", ""),
		GLenum.IN("dfactorAlpha", "")
	)
}

val EXT_blend_minmax = "EXTBlendMinmax".nativeClassGL("EXT_blend_minmax", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Blending capability is extended by respecifying the entire blend equation. While this document defines only two new equations, the #BlendEquationEXT()
		procedure that it defines will be used by subsequent extensions to define additional blending equations.

		The two new equations defined by this extension produce the minimum (or maximum) color components of the source and destination colors. Taking the
		maximum is useful for applications such as maximum projection in medical imaging.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code mode} parameter of BlendEquationEXT.",

		"FUNC_ADD_EXT" _ 0x8006,
		"MIN_EXT" _ 0x8007,
		"MAX_EXT" _ 0x8008
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_EQUATION_EXT" _ 0x8009
	)

	GLvoid(
		"BlendEquationEXT",
		"",

		GLenum.IN("mode", "")
	)
}

val EXT_blend_subtract = "EXTBlendSubtract".nativeClassGL("EXT_blend_subtract", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Two additional blending equations are specified using the interface defined by ${registryLinkTo("EXT", "blend_minmax.link")}. These equations are similar to the default
		blending equation, but produce the difference of its left and right hand sides, rather than the sum.  Image differences are useful in many image
		processing applications.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code mode} parameter of BlendEquationEXT.",

		"FUNC_SUBTRACT_EXT" _ 0x800A,
		"FUNC_REVERSE_SUBTRACT_EXT" _ 0x800B
	)
}

val EXT_depth_bounds_test = "EXTDepthBoundsTest".nativeClassGL("EXT_depth_bounds_test", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a new per-fragment test that is, logically, after the scissor test and before the alpha test. The depth bounds test compares the
		depth value stored at the location given by the incoming fragment's (xw,yw) coordinates to a user-defined minimum and maximum depth value. If the stored
		depth value is outside the user-defined range (exclusive), the incoming fragment is discarded.

		Unlike the depth test, the depth bounds test has NO dependency on the fragment's window-space depth value.

		This functionality is useful in the context of attenuated stenciled shadow volume rendering. To motivate the functionality's utility in this context, we
		first describe how conventional scissor testing can be used to optimize shadow volume rendering.

		If an attenuated light source's illumination can be bounded to a rectangle in XY window-space, the conventional scissor test can be used to discard
		shadow volume fragments that are guaranteed to be outside the light source's window-space XY rectangle. The stencil increments and decrements that would
		otherwise be generated by these scissored fragments are inconsequential because the light source's illumination can pre-determined to be fully
		attenuated outside the scissored region. In other words, the scissor test can be used to discard shadow volume fragments rendered outside the scissor,
		thereby improving performance, without affecting the ultimate illumination of these pixels with respect to the attenuated light source.

		This scissoring optimization can be used both when rendering the stenciled shadow volumes to update stencil (incrementing and decrementing the stencil
		buffer) AND when adding the illumination contribution of attenuated light source's.

		In a similar fashion, we can compute the attenuated light source's window-space Z bounds (zmin,zmax) of consequential illumination. Unless a depth value
		(in the depth buffer) at a pixel is within the range [zmin,zmax], the light source's illumination can be pre-determined to be inconsequential for the
		pixel. Said another way, the pixel being illuminated is either far enough in front of or behind the attenuated light source so that the light source's
		illumination for the pixel is fully attenuated. The depth bounds test can perform this test.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"DEPTH_BOUNDS_TEST_EXT" _ 0x8890
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"DEPTH_BOUNDS_EXT" _ 0x8891
	)

	GLvoid(
		"DepthBoundsEXT",
		"",

		GLclampd.IN("zmin", ""),
		GLclampd.IN("zmax", "")
	)
}

val EXT_framebuffer_blit = "EXTFramebufferBlit".nativeClassGL("EXT_framebuffer_blit", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension modifies EXT_framebuffer_object by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows
		copying directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some
		data conversion where allowed.

		${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
		and GetFramebufferAttachmentParameterivEXT.
		""",

		"READ_FRAMEBUFFER_EXT" _ 0x8CA8,
		"DRAW_FRAMEBUFFER_EXT" _ 0x8CA9
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

		"DRAW_FRAMEBUFFER_BINDING_EXT" _ 0x8CA6,
		"READ_FRAMEBUFFER_BINDING_EXT" _ 0x8CAA
	)

	GLvoid(
		"BlitFramebufferEXT",
		"",

		GLint.IN("srcX0", ""),
		GLint.IN("srcY0", ""),
		GLint.IN("srcX1", ""),
		GLint.IN("srcY1", ""),
		GLint.IN("dstX0", ""),
		GLint.IN("dstY0", ""),
		GLint.IN("dstX1", ""),
		GLint.IN("dstY1", ""),
		GLbitfield.IN("mask", ""),
		GLenum.IN("filter", "")
	)
}

val EXT_framebuffer_multisample = "EXTFramebufferMultisample".nativeClassGL("EXT_framebuffer_multisample", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension extends the EXT_framebuffer_object framework to enable multisample rendering.

		The new operation RenderbufferStorageMultisampleEXT() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
		multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
		than zero. No method is provided for creating multisample texture images.

		All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
		"framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
		SAMPLE_BUFFERS is one.

		In traditional multisample rendering, where DRAW_FRAMEBUFFER_BINDING_EXT is zero and SAMPLE_BUFFERS is one, the GL spec states that "the color sample
		values are resolved to a single, displayable color each time a pixel is updated." There are, however, several modern hardware implementations that do
		not actually resolve for each sample update, but instead postpones the resolve operation to a later time and resolve a batch of sample updates at a
		time. This is OK as long as the implementation behaves "as if" it had resolved a sample-at-a-time. Unfortunately, however, honoring the "as if" rule can
		sometimes degrade performance.

		In contrast, when DRAW_FRAMEBUFFER_BINDING_EXT is an application-created framebuffer object, MULTISAMPLE is enabled, and SAMPLE_BUFFERS is one, there is
		no implicit per-sample-update resolve. Instead, the application explicitly controls when the resolve operation is performed. The resolve operation is
		affected by calling BlitFramebufferEXT (provided by the EXT_framebuffer_blit extension) where the source is a multisample application-created
		framebuffer object and the destination is a single-sample framebuffer object (either application-created or window-system provided).

		This design for multisample resolve more closely matches current hardware, but still permits implementations which choose to resolve a single sample at
		a time. If hardware that implementes the multisample resolution "one sample at a time" exposes EXT_framebuffer_multisample, it could perform the
		implicit resolve to a driver-managed hidden surface, then read from that surface when the application calls BlitFramebufferEXT.

		Another motivation for granting the application explicit control over the multisample resolve operation has to do with the flexibility afforded by
		EXT_framebuffer_object. Previously, a drawable (window or pbuffer) had exclusive access to all of its buffers. There was no mechanism for sharing a
		buffer across multiple drawables. Under EXT_framebuffer_object, however, a mechanism exists for sharing a framebuffer-attachable image across several
		framebuffer objects, as well as sharing an image between a framebuffer object and a texture. If we had retained the "implicit"
		resolve from traditional multisampled rendering, and allowed the creation of "multisample" format renderbuffers, then this type of sharing would have
		lead to two problematic situations:
		${ul(
			"Two contexts, which shared renderbuffers, might perform competing resolve operations into the same single-sample buffer with ambiguous results.",
		    "It would have introduced the unfortunate ability to use the single-sample buffer as a texture while MULTISAMPLE is ENABLED."
		)}
		By using the BlitFramebufferEXT from EXT_framebuffer_blit as an explicit resolve to serialize access to the multisampled contents and eliminate the
		implicit per-sample resolve operation, we avoid both of these problems.

		${GL30.promoted}
		"""

	GLvoid(
		"RenderbufferStorageMultisampleEXT",
		"",

		GLenum.IN("target", ""),
		GLsizei.IN("samples", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT.",

		"RENDERBUFFER_SAMPLES_EXT" _ 0x8CAB
	)

	IntConstant(
		"Returned by CheckFramebufferStatusEXT.",

		"FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT" _ 0x8D56
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_SAMPLES_EXT" _ 0x8D57
	)
}

val EXT_framebuffer_multisample_blit_scaled = "EXTFramebufferMultisampleBlitScaled".nativeClassGL("EXT_framebuffer_multisample_blit_scaled", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension relaxes some of the restrictions associated with multisample resolve operations, specifically to allow a combined resolve and scale
		operation through a single call to BlitFramebuffer. It also adds two new filter types to control the quality of the combined scaled resolve operation.

		In traditional multisampled framebuffer rendering, color samples must be explicitly resolved via BlitFramebuffer before any other operation on the
		resulting pixel values can be performed. This multisample resolve operation must be done using a BlitFramebuffer call where the dimensions of the source
		and destination rectangles are identical. If the resulting pixel values need to be copied to a texture with different dimensions, these resolved values
		can then be scaled with a second call to BlitFramebuffer.

		By requiring two separate calls to BlitFramebuffer, the quality of final image can be maintained to a certain degree. The samples are first resolved,
		and then these resolved values can be filtered to produce the final image. This image quality comes at the price of increased memory usage and lower
		performance. However, the scaling blit can still introduce artifacts, particularly if it is done with a simple bilinear filter.

		The new filter types introduced by this extension allow the scaled resolve to be done with a single call to BlitFramebuffer. Not all samples from the
		read framebuffer are required to be be used when producing the final pixel values, and there may be a loss in quality when compared to an image produced
		by a separate resolve and scale. However, the single-pass scaled resolve blit should be faster than the traditional two-pass resolve then scale blits.
  
		Requires ${ARB_framebuffer_object.link}.
		"""

	IntConstant(
		"Accepted by the {@code filter} parameter of BlitFramebuffer.",

		"SCALED_RESOLVE_FASTEST_EXT" _ 0x90BA,
		"SCALED_RESOLVE_NICEST_EXT" _ 0x90BB
	)
}

val EXT_framebuffer_sRGB = "EXTFramebufferSRGB".nativeClassGL("EXT_framebuffer_sRGB", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Conventionally, OpenGL assumes framebuffer color components are stored in a linear color space. In particular, framebuffer blending is a linear
		operation.

		The sRGB color space is based on typical (non-linear) monitor characteristics expected in a dimly lit office. It has been standardized by the
		International Electrotechnical Commission (IEC) as IEC 61966-2-1. The sRGB color space roughly corresponds to 2.2 gamma correction.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending. When blending is disabled but the new sRGB updated mode is
		enabled (assume the framebuffer supports the capability), high-precision linear color component values for red, green, and blue generated by fragment
		coloring are encoded for sRGB prior to being written into the framebuffer. When blending is enabled along with the new sRGB update mode, red, green, and
		blue framebuffer color components are treated as sRGB values that are converted to linear color values, blended with the high-precision color values
		generated by fragment coloring, and then the blend result is encoded for sRGB just prior to being written into the framebuffer.

		The primary motivation for this extension is that it allows OpenGL applications to render into a framebuffer that is scanned to a monitor configured to
		assume framebuffer color values are sRGB encoded. This assumption is roughly true of most PC monitors with default gamma correction. This allows
		applications to achieve faithful color reproduction for OpenGL rendering without adjusting the monitor's gamma correction.
    
		${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"FRAMEBUFFER_SRGB_EXT" _ 0x8DB9
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"FRAMEBUFFER_SRGB_CAPABLE_EXT" _ 0x8DBA
	)
}

val EXT_packed_depth_stencil = "EXTPackedDepthStencil".nativeClassGL("EXT_packed_depth_stencil", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Many OpenGL implementations have chosen to interleave the depth and stencil buffers into one buffer, often with 24 bits of depth precision and 8 bits
		of stencil data. 32 bits is more than is needed for the depth buffer much of the time; a 24-bit depth buffer, on the other hand, requires that reads
		and writes of depth data be unaligned with respect to power-of-two boundaries. On the other hand, 8 bits of stencil data is more than sufficient for
		most applications, so it is only natural to pack the two buffers into a single buffer with both depth and stencil data. OpenGL never provides direct
		access to the buffers, so the OpenGL implementation can provide an interface to applications where it appears the one merged buffer is composed of two
		logical buffers.

		One disadvantage of this scheme is that OpenGL lacks any means by which this packed data can be handled efficiently. For example, when an application
		reads from the 24-bit depth buffer, using the type GL_UNSIGNED_SHORT will lose 8 bits of data, while GL_UNSIGNED_INT has 8 too many. Both require
		expensive format conversion operations. A 24-bit format would be no more suitable, because it would also suffer from the unaligned memory accesses that
		made the standalone 24-bit depth buffer an unattractive proposition in the first place.

		Many applications, such as parallel rendering applications, may also wish to draw to or read back from both the depth and stencil buffers at the same
		time. Currently this requires two separate operations, reducing performance. Since the buffers are interleaved, drawing to or reading from both should
		be no more expensive than using just one; in some cases, it may even be cheaper.

		This extension provides a new data format, GL_DEPTH_STENCIL_EXT, that can be used with the glDrawPixels, glReadPixels, and glCopyPixels commands, as
		well as a packed data type, GL_UNSIGNED_INT_24_8_EXT, that is meant to be used with GL_DEPTH_STENCIL_EXT. No other data types are supported with
		GL_DEPTH_STENCIL_EXT. If ARB_depth_texture or SGIX_depth_texture is supported, GL_DEPTH_STENCIL_EXT/GL_UNSIGNED_INT_24_8_EXT data can also be used for
		textures; this provides a more efficient way to supply data for a 24-bit depth texture.

		GL_DEPTH_STENCIL_EXT data, when passed through the pixel path, undergoes both depth and stencil operations. The depth data is scaled and biased by the
		current GL_DEPTH_SCALE and GL_DEPTH_BIAS, while the stencil data is shifted and offset by the current GL_INDEX_SHIFT and GL_INDEX_OFFSET. The stencil
		data is also put through the stencil-to-stencil pixel map.

		glDrawPixels of GL_DEPTH_STENCIL_EXT data operates similarly to that of GL_STENCIL_INDEX data, bypassing the OpenGL fragment pipeline entirely, unlike
		the treatment of GL_DEPTH_COMPONENT data. The stencil and depth masks are applied, as are the pixel ownership and scissor tests, but all other
		operations are skipped.

		glReadPixels of GL_DEPTH_STENCIL_EXT data reads back a rectangle from both the depth and stencil buffers.

		glCopyPixels of GL_DEPTH_STENCIL_EXT data copies a rectangle from both the depth and stencil buffers. Like glDrawPixels, it applies both the stencil
		and depth masks but skips the remainder of the OpenGL fragment pipeline.

		glTex[Sub]Image[1,2,3]D of GL_DEPTH_STENCIL_EXT data loads depth and stencil data into a depth_stencil texture. glGetTexImage of GL_DEPTH_STENCIL_EXT
		data can be used to retrieve depth and stencil data from a depth/stencil texture.

		In addition, a new base internal format, GL_DEPTH_STENCIL_EXT, can be used by both texture images and renderbuffer storage. When an image with a
		DEPTH_STENCIL_EXT internal format is attached to both the depth and stencil attachment points of a framebuffer object (see EXT_framebuffer_object),
		then it becomes both the depth and stencil buffers of the framebuffer. This fits nicely with hardware that interleaves both depth and stencil data into
		a single buffer. When a texture with DEPTH_STENCIL_EXT data is bound for texturing, only the depth component is accessible through the texture fetcher.
		The stencil data can be written with TexImage or CopyTexImage, and can be read with GetTexImage. When a DEPTH_STENCIL_EXT image is attached to the
		stencil attachment of the bound framebuffer object, the stencil data can be accessed through any operation that reads from or writes to the
		framebuffer's stencil buffer.

		Requires ${EXT_framebuffer_object.link}. ${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
		CopyTexImage2D, and RenderbufferStorageEXT, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameterivEXT.
		""",

		"DEPTH_STENCIL_EXT" _ 0x84F9
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage.
		""",

		"UNSIGNED_INT_24_8_EXT" _ 0x84FA
	)

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT, and
		returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameterivEXT.
		""",

		"DEPTH24_STENCIL8_EXT" _ 0x88F0
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexLevelParameter.",

		"TEXTURE_STENCIL_SIZE_EXT" _ 0x88F1
	)
}

val EXT_packed_float = "EXTPackedFloat".nativeClassGL("EXT_packed_float", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a new 3-component floating-point texture format that fits within a single 32-bit word. This format stores 5 bits of biased exponent
		per component in the same manner as 16-bit floating-point formats, but rather than 10 mantissa bits, the red, green, and blue components have 6, 6, and
		5 bits respectively. Each mantissa is assumed to have an implied leading one except in the denorm exponent case. There is no sign bit so only
		non-negative values can be represented. Positive infinity, positive denorms, and positive NaN values are representable. The value of the fourth
		component returned by a texture fetch is always 1.0.

		This extension also provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format
		described above could also be advertised as an unsigned floating-point format for rendering.

		The extension also provides a pixel external format for specifying packed float values directly.

		${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT.",

		"R11F_G11F_B10F_EXT" _ 0x8C3A
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
		GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
		""",

		"UNSIGNED_INT_10F_11F_11F_REV_EXT" _ 0x8C3B
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

		"RGBA_SIGNED_COMPONENTS_EXT" _ 0x8C3C
	)
}

val EXT_point_parameters = "EXTPointParameters".nativeClassGL("EXT_point_parameters", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred as
		"Light points".

		The raster brightness of a point is a function of the point area, point color, point transparency, and the response of the display's electron gun and
		phosphor. The point area and the point transparency are derived from the point size, currently provided with the {@code size} parameter of
		GL11#PointSize().

		The primary motivation is to allow the size of a point to be affected by distance attenuation. When distance attenuation has an effect, the final point
		size decreases as the distance of the point from the eye increases.

		The secondary motivation is a mean to control the mapping from the point size to the raster point area and point transparency. This is done in order to
		increase the dynamic range of the raster brightness of points. In other words, the alpha component of a point may be decreased (and its transparency
		increased) as its area shrinks below a defined threshold.

		This extension defines a derived point size to be closely related to point brightness. The brightness of a point is given by:
		${codeBlock("""
						1
dist_atten(d) = -------------------
                a + b * d + c * d^2

brightness(Pe) = Brightness * dist_atten(|Pe|)""")}
		where 'Pe' is the point in eye coordinates, and 'Brightness' is some initial value proportional to the square of the size provided with glPointSize.
		Here we simplify the raster brightness to be a function of the rasterized point area and point transparency.
		${codeBlock("""
			brightness(Pe)      brightness(Pe) >= Threshold_Area
area(Pe) =
			Threshold_Area      Otherwise

factor(Pe) = brightness(Pe)/Threshold_Area

alpha(Pe) = Alpha * factor(Pe)""")}
		where 'Alpha' comes with the point color (possibly modified by lighting).

		'Threshold_Area' above is in area units. Thus, it is proportional to the square of the threshold provided by the programmer through this extension.

		The new point size derivation method applies to all points, while the threshold applies to multisample points only.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of glPointParameterfvEXT, and the {@code pname} of glGet.",

		"POINT_SIZE_MIN_EXT" _ 0x8126,
		"POINT_SIZE_MAX_EXT" _ 0x8127,
		"POINT_FADE_THRESHOLD_SIZE_EXT" _ 0x8128,
		"DISTANCE_ATTENUATION_EXT" _ 0x8129
	)

	GLvoid(
		"PointParameterfEXT",
		"",

		GLenum.IN("pname", ""),
		GLfloat.IN("param", "")
	)

	GLvoid(
		"PointParameterfvEXT",
		"",

		GLenum.IN("pname", ""),
		const _ GLfloat_p.IN("params", "")
	)
}

val EXT_shared_texture_palette = "EXTSharedTexturePalette".nativeClassGL("EXT_shared_texture_palette", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		EXT_shared_texture_palette defines a shared texture palette which may be used in place of the texture object palettes provided by
		${registryLinkTo("EXT", "paletted_texture")}. This is useful for rapidly changing a palette common to many textures, rather than having to reload the
		new palette for each texture. The extension acts as a switch, causing all lookups that would normally be done on the texture's palette to instead use
		the shared palette.

		Requires ${registryLinkTo("EXT", "paletted_texture")}.
		"""

	IntConstant(
		"""
		Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, IsEnabled, Enable, Disable, ColorTableEXT,
		ColorSubTableEXT, GetColorTableEXT, GetColorTableParameterivEXT, and GetColorTableParameterfd EXT.
		""",

		"SHARED_TEXTURE_PALETTE_EXT" _ 0x81FB
	)
}

val EXT_stencil_wrap = "EXTStencilWrap".nativeClassGL("EXT_stencil_wrap", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Various algorithms use the stencil buffer to "count" the number of surfaces that a ray passes through. As the ray passes into an object, the stencil
		buffer is incremented. As the ray passes out of an object, the stencil buffer is decremented.

		GL requires that the stencil increment operation clamps to its maximum value. For algorithms that depend on the difference between the sum of the
		increments and the sum of the decrements, clamping causes an erroneous result.

		This extension provides an enable for both maximum and minimum wrapping of stencil values. Instead, the stencil value wraps in both directions.

		Two additional stencil operations are specified. These new operations are similiar to the existing INCR and DECR operations, but they wrap their result
		instead of saturating it. This functionality matches the new stencil operations introduced by DirectX 6.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.",

		"INCR_WRAP_EXT" _ 0x8507,
		"DECR_WRAP_EXT" _ 0x8508
	)
}

val EXT_texture_compression_latc = "EXTTextureCompressionLATC".nativeClassGL("EXT_texture_compression_latc", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

        This extension introduces four new block-based texture compression formats suited for unsigned and signed luminance and luminance-alpha textures (hence
        the name "latc" for Luminance-Alpha Texture Compression).

		These formats are designed to reduce the storage requirements and memory bandwidth required for luminance and luminance-alpha textures by a factor of
		2-to-1 over conventional uncompressed luminance and luminance-alpha textures with 8-bit components (GL11#LUMINANCE8 and GL11#LUMINANCE8_ALPHA8).

		The compressed signed luminance-alpha format is reasonably suited for storing compressed normal maps.

		Requires ${GL13.core} or ${ARB_texture_compression.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
		CompressedTexSubImage2D.
		""",

		"COMPRESSED_LUMINANCE_LATC1_EXT" _ 0x8C70,
		"COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT" _ 0x8C71,
		"COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT" _ 0x8C72,
		"COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT" _ 0x8C73
	)
}

val EXT_texture_compression_rgtc = "EXTTextureCompressionRGTC".nativeClassGL("EXT_texture_compression_rgtc", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

        This extension introduces four new block-based texture compression formats suited for unsigned and signed red and red-green textures (hence the name
        "rgtc" for Red-Green Texture Compression).

		These formats are designed to reduce the storage requirements and memory bandwidth required for red and red-green textures by a factor of 2-to-1 over
		conventional uncompressed luminance and luminance-alpha textures with 8-bit components (GL11#LUMINANCE8 and GL11#LUMINANCE8_ALPHA8).

		The compressed signed red-green format is reasonably suited for storing compressed normal maps.

		This extension uses the same compression format as the EXT_texture_compression_latc extension except the color data is stored in the red and green
		components rather than luminance and alpha. Representing compressed red and green components is consistent with the BC4 and BC5 compressed formats
		supported by DirectX 10.

		Requires ${GL13.core} or ${ARB_texture_compression.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
		CompressedTexSubImage2D.
		""",

		"COMPRESSED_RED_RGTC1_EXT" _ 0x8DBB,
		"COMPRESSED_SIGNED_RED_RGTC1_EXT" _ 0x8DBC,
		"COMPRESSED_RED_GREEN_RGTC2_EXT" _ 0x8DBD,
		"COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT" _ 0x8DBE
	)
}

val EXT_texture_compression_s3tc = "EXTTextureCompressionS3TC".nativeClassGL("EXT_texture_compression_s3tc", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides additional texture compression functionality specific to S3's S3TC format (called DXTC in Microsoft's DirectX API), subject to
		all the requirements and limitations described by the extension ${ARB_texture_compression.link}.

		This extension supports DXT1, DXT3, and DXT5 texture compression formats. For the DXT1 image format, this specification supports an RGB-only mode and a
		special RGBA mode with single-bit "transparent" alpha.

		Requires ${ARB_texture_compression.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
		CompressedTexSubImage2D.
		""",

		"COMPRESSED_RGB_S3TC_DXT1_EXT" _ 0x83F0,
		"COMPRESSED_RGBA_S3TC_DXT1_EXT" _ 0x83F1,
		"COMPRESSED_RGBA_S3TC_DXT3_EXT" _ 0x83F2,
		"COMPRESSED_RGBA_S3TC_DXT5_EXT" _ 0x83F3
	)
}

val EXT_texture_filter_anisotropic = "EXTTextureFilterAnisotropic".nativeClassGL("EXT_texture_filter_anisotropic", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Texture mapping using OpenGL's existing mipmap texture filtering modes assumes that the projection of the pixel filter footprint into texture space is a
		square (ie, isotropic). In practice however, the footprint may be long and narrow (ie, anisotropic). Consequently, mipmap filtering severely blurs
		images on surfaces angled obliquely away from the viewer.

		Several approaches exist for improving texture sampling by accounting for the anisotropic nature of the pixel filter footprint into texture space. This
		extension provides a general mechanism for supporting anisotropic texturing filtering schemes without specifying a particular formulation of anisotropic
		filtering.

		The extension permits the OpenGL application to specify on a per-texture object basis the maximum degree of anisotropy to account for in texture
		filtering.

		Increasing a texture object's maximum degree of anisotropy may improve texture filtering but may also significantly reduce the implementation's texture
		filtering rate. Implementations are free to clamp the specified degree of anisotropy to the implementation's maximum supported degree of anisotropy.

		A texture's maximum degree of anisotropy is specified independent from the texture's minification and magnification filter (as opposed to being
		supported as an entirely new filtering mode). Implementations are free to use the specified minification and magnification filter to select a particular
		anisotropic texture filtering scheme. For example, a NEAREST filter with a maximum degree of anisotropy of two could be treated as a 2-tap filter that
		accounts for the direction of anisotropy. Implementations are also permitted to ignore the minification or magnification filter and implement the
		highest quality of anisotropic filtering possible.

		Applications seeking the highest quality anisotropic filtering available are advised to request a GL11#LINEAR_MIPMAP_LINEAR minification filter, a
		GL11#LINEAR magnification filter, and a large maximum degree of anisotropy.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameterfv, TexParameteri, and TexParameteriv.",

		"TEXTURE_MAX_ANISOTROPY_EXT" _ 0x84FE
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.",

		"MAX_TEXTURE_MAX_ANISOTROPY_EXT" _ 0x84FF
	)
}

val EXT_texture_mirror_clamp = "EXTTextureMirrorClamp".nativeClassGL("EXT_texture_mirror_clamp", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		EXT_texture_mirror_clamp extends the set of texture wrap modes to include three modes (#MIRROR_CLAMP_EXT, #MIRROR_CLAMP_TO_EDGE_EXT,
		#MIRROR_CLAMP_TO_BORDER_EXT) that effectively use a texture map twice as large as the original image in which the additional half of the new image is
		a mirror image of the original image.

		This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
		mode allows the texture to be mirrored only once in the negative s, t, and r directions.
		"""

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
		when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
		""",

		"MIRROR_CLAMP_EXT" _ 0x8742,
		"MIRROR_CLAMP_TO_EDGE_EXT" _ 0x8743,
		"MIRROR_CLAMP_TO_BORDER_EXT" _ 0x8912
	)
}

val EXT_texture_shared_exponent = "EXTTextureSharedExponent".nativeClassGL("EXT_texture_shared_exponent", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Existing texture formats provide either fixed-point formats with limited range and precision but with compact encodings (allowing 32 or fewer bits per
		multi-component texel), or floating-point formats with tremendous range and precision but without compact encodings (typically 16 or 32 bits per
		component).

		This extension adds a new packed format and new internal texture format for encoding 3-component vectors (typically RGB colors) with a single 5-bit
		exponent (biased up by 15) and three 9-bit mantissas for each respective component. There is no sign bit so all three components must be non-negative.
		The fractional mantissas are stored without an implied 1 to the left of the decimal point. Neither infinity nor not-a-number (NaN) are representable in
		this shared exponent format.

		This 32 bits/texel shared exponent format is particularly well-suited to high dynamic range (HDR) applications where light intensity is typically stored
		as non-negative red, green, and blue components with considerable range.

		${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT.",

		"RGB9_E5_EXT" _ 0x8C3D
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
		GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
		""",

		"UNSIGNED_INT_5_9_9_9_REV_EXT" _ 0x8C3E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

		"TEXTURE_SHARED_SIZE_EXT" _ 0x8C3F
	)
}

val EXT_texture_sRGB = "EXTTextureSRGB".nativeClassGL("EXT_texture_sRGB", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Conventional texture formats assume a linear color space.  So for a conventional internal texture format such as GL_RGB8, the 256 discrete values for
		each 8-bit color component map linearly and uniformly to the [0,1] range.

		The sRGB color space is based on typical (non-linear) monitor characteristics expected in a dimly lit office.  It has been standardized by the
		International Electrotechnical Commission (IEC) as IEC 61966-2-1. The sRGB color space roughly corresponds to 2.2 gamma correction.

		This extension adds a few new uncompressed and compressed color texture formats with sRGB color components.

		${GL21.promoted}
		"""

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.",

		"SRGB_EXT" _ 0x8C40,
		"SRGB8_EXT" _ 0x8C41,
		"SRGB_ALPHA_EXT" _ 0x8C42,
		"SRGB8_ALPHA8_EXT" _ 0x8C43,
		"SLUMINANCE_ALPHA_EXT" _ 0x8C44,
		"SLUMINANCE8_ALPHA8_EXT" _ 0x8C45,
		"SLUMINANCE_EXT" _ 0x8C46,
		"SLUMINANCE8_EXT" _ 0x8C47,
		"COMPRESSED_SRGB_EXT" _ 0x8C48,
		"COMPRESSED_SRGB_ALPHA_EXT" _ 0x8C49,
		"COMPRESSED_SLUMINANCE_EXT" _ 0x8C4A,
		"COMPRESSED_SLUMINANCE_ALPHA_EXT" _ 0x8C4B
	)

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2DARB and the {@code format} parameter of
		CompressedTexSubImage2DARB.
		""",

		"COMPRESSED_SRGB_S3TC_DXT1_EXT" _ 0x8C4C,
		"COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT" _ 0x8C4D,
		"COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT" _ 0x8C4E,
		"COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT" _ 0x8C4F
	)
}