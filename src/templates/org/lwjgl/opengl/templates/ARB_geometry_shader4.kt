/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_geometry_shader4 = "ARBGeometryShader4".nativeClassGL("ARB_geometry_shader4", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		ARB_geometry_shader4 defines a new shader type available to be run on the GPU, called a geometry shader. Geometry shaders are run after vertices are
		transformed, but prior to color clamping, flat shading and clipping.

		A geometry shader begins with a single primitive (point, line, triangle). It can read the attributes of any of the vertices in the primitive and use
		them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices to define
		a new primitive. A geometry shader can emit multiple disconnected primitives. The primitives emitted by the geometry shader are clipped and then
		processed like an equivalent OpenGL primitive specified by the application.

		Furthermore, ARB_geometry_shader4 provides four additional primitive types: lines with adjacency, line strips with adjacency, separate triangles with
		adjacency, and triangle strips with adjacency.  Some of the vertices specified in these new primitive types are not part of the ordinary primitives,
		instead they represent neighboring vertices that are adjacent to the two line segment end points (lines/strips) or the three triangle edges
		(triangles/tstrips). These vertices can be accessed by geometry shaders and used to match up the vertices emitted by the geometry shader with those of
		neighboring primitives.

		Since geometry shaders expect a specific input primitive type, an error will occur if the application presents primitives of a different type. For
		example, if a geometry shader expects points, an error will occur at GL11#Begin() time, if a primitive mode of GL11#TRIANGLES is specified.

		${GL32.promoted}
		"""

	IntConstant(
		"Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

		"GEOMETRY_SHADER_ARB" _ 0x8DD9
	)

	val Parameters = IntConstant(
		"Accepted by the {@code pname} parameter of ProgramParameteriARB and GetProgramiv.",

		"GEOMETRY_VERTICES_OUT_ARB" _ 0x8DDA,
		"GEOMETRY_INPUT_TYPE_ARB" _ 0x8DDB,
		"GEOMETRY_OUTPUT_TYPE_ARB" _ 0x8DDC
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB" _ 0x8C29,
		"MAX_GEOMETRY_VARYING_COMPONENTS_ARB" _ 0x8DDD,
		"MAX_VERTEX_VARYING_COMPONENTS_ARB" _ 0x8DDE,
		"MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB" _ 0x8DDF,
		"MAX_GEOMETRY_OUTPUT_VERTICES_ARB" _ 0x8DE0,
		"MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB" _ 0x8DE1
	)

	IntConstant(
		"Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.",

		"LINES_ADJACENCY_ARB" _ 0xA,
		"LINE_STRIP_ADJACENCY_ARB" _ 0xB,
		"TRIANGLES_ADJACENCY_ARB" _ 0xC,
		"TRIANGLE_STRIP_ADJACENCY_ARB" _ 0xD
	)

	IntConstant(
		"Returned by CheckFramebufferStatusARB.",

		"FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB" _ 0x8DA8,
		"FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB" _ 0x8DA9
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetFramebufferAttachment- ParameterivARB.",

		"FRAMEBUFFER_ATTACHMENT_LAYERED_ARB" _ 0x8DA7,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER" _ 0x8CD4
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetFloatv, GetDoublev, and
		GetBooleanv.
		""",

		"PROGRAM_POINT_SIZE_ARB" _ 0x8642
	)

	GLvoid(
		"ProgramParameteriARB",
		"""
		Sets a program object parameter.
		
		The error GL11#INVALID_VALUE is generated if {@code pname} is #GEOMETRY_INPUT_TYPE_ARB and {@code value} is not one of GL11#POINTS, GL11#LINES,
		#LINES_ADJACENCY_ARB, GL11#TRIANGLES or #TRIANGLES_ADJACENCY_ARB.

		The error GL11#INVALID_VALUE is generated if {@code pname} is #GEOMETRY_OUTPUT_TYPE_ARB and {@code value} is not one of GL11#POINTS, GL11#LINE_STRIP or
		GL11#TRIANGLE_STRIP.

		The error GL11#INVALID_VALUE is generated if {@code pname} is #GEOMETRY_VERTICES_OUT_ARB and {@code value} is negative.

		The error GL11#INVALID_VALUE is generated if {@code pname} is #GEOMETRY_VERTICES_OUT_ARB and {@code value} exceeds #MAX_GEOMETRY_OUTPUT_VERTICES_ARB.

		The error GL11#INVALID_VALUE is generated if {@code pname} is set to #GEOMETRY_VERTICES_OUT_ARB and the product of {@code value} and the sum of all
		components of all active varying variables exceeds #MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB.
		""",

		GLuint.IN("program", "the program object"),
		GLenum.IN("pname", "the parameter to set", Parameters),
		GLint.IN("value", "the value being set")
	)

	GLvoid(
		"FramebufferTextureARB",
		"""
		Attaches a specified level of a texture object as one of the logical buffers of the currently bound framebuffer object, to render directly into the
		texture image.
		
		If {@code texture} is zero, any image or array of images attached to the attachment point named by {@code attachment} is detached, and the state of the
		attachment point is reset to its initial values.  {@code level} is ignored if {@code texture} is zero.

		If {@code texture} is non-zero, FramebufferTextureARB attaches level {@code level} of the texture object named {@code texture} to the framebuffer
		attachment point named by {@code attachment}. The error GL11#INVALID_VALUE is generated if {@code texture} is not the name of a texture object, or if
		{@code level} is not a supported texture level number for textures of the type corresponding to {@code target}. The error GL11#INVALID_OPERATION is
		generated if {@code texture} is the name of a buffer texture.

		If {@code texture} is the name of a three-dimensional texture, cube map texture, or one- or two-dimensional array texture, the texture level attached to
		the framebuffer attachment point is an array of images, and the framebuffer attachment is considered layered.
		""",

		GLenum.IN("target", "the render target", "ARBFramebufferObject#FRAMEBUFFER"),
		GLenum.IN("attachment", "must be one of the attachments points of the framebuffer"),
		GLuint.IN("texture", "the texture object name"),
		GLint.IN("level", "the texture level")
	)

	GLvoid(
		"FramebufferTextureLayerARB",
		"""
		Operates like #FramebufferTextureARB(), except that only a single layer of the texture level, numbered {@code layer}, is attached to the attachment
		point.
		
		If {@code texture} is non-zero, the error GL11#INVALID_VALUE is generated if {@code layer} is negative, or if {@code texture} is not the name of a
		texture object.  The error GL11#INVALID_OPERATION is generated unless {@code texture} is zero or the name of a three-dimensional or one- or
		two-dimensional array texture.
		""",

		GLenum.IN("target", "the render target", "ARBFramebufferObject#FRAMEBUFFER"),
		GLenum.IN("attachment", "must be one of the attachments points of the framebuffer"),
		GLuint.IN("texture", "the texture object name"),
		GLint.IN("level", "the texture level"),
		GLint.IN("layer", "the texture layer")
	)

	GLvoid(
		"FramebufferTextureFaceARB",
		"""
		Operates like #FramebufferTextureARB(), except that only a single face of a cube map texture, given by {@code face}, is attached to the attachment
		point.

		If {@code texture} is non-zero, the error GL11#INVALID_VALUE is generated if {@code texture} is not the name of a texture object. The error
		GL11#INVALID_OPERATION is generated unless {@code texture} is zero or the name of a cube map texture.
		""",

		GLenum.IN("target", "the render target", "ARBFramebufferObject#FRAMEBUFFER"),
		GLenum.IN("attachment", "must be one of the attachments points of the framebuffer"),
		GLuint.IN("texture", "the texture object name"),
		GLint.IN("level", "the texture level"),
		GLenum.IN("face", "the cube map face", CUBE_MAP_FACES)
	)
}