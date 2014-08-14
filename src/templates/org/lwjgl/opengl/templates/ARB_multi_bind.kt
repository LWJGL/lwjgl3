/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_multi_bind() = "ARBMultiBind".nativeClassGL("ARB_multi_bind") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/multi_bind.txt", templateName)} extension."

	GLvoid.func(
		"BindBuffersBase",
		"""
		Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
		corresponding to {@code target}. If {@code buffers} is not $NULL, it specifies an array of {@code count} values, each of which must be zero or the name
		of an existing buffer object. It is equivalent to:
		${codeBlock("""
for ( i = 0; i < count; i++ ) {
	if ( buffers == NULL ) {
		glBindBufferBase(target, first + i, 0);
	} else {
		glBindBufferBase(target, first + i, buffers[i]);
	}
}
		""")}
		except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.
		""",

		GLenum.IN("target", "the buffer object target", BUFFER_OBJECT_TARGETS),
		GLuint.IN("first", "the first binding"),
		AutoSize("buffers") _ GLsizei.IN("count", "the number of bindings"),
		mods (nullable, const) _ GLuint_p.IN("buffers", "an array of zeros or names of existing buffers objects")
	)

	GLvoid.func(
		"BindBuffersRange",
		"""
		Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
		corresponding to {@code target}. {@code offsets} and {@code sizes} specify arrays of {@code count} values indicating the range of each buffer to bind.
		If {@code buffers} is $NULL, all bindings from {@code first} through {@code first+count-1} are reset to their unbound (zero) state. In this
		case, the offsets and sizes associated with the binding points are set to default values, ignoring {@code offsets} and {@code sizes}. It is equivalent
		to:
		${codeBlock("""
for ( i = 0; i < count; i++ ) {
	if ( buffers == NULL ) {
		glBindBufferRange(target, first + i, 0, 0, 0);
	} else {
		glBindBufferRange(target, first + i, buffers[i], offsets[i], sizes[i]);
	}
}
		""")}
		except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.

		The values specified in {@code buffers}, {@code offsets}, and {@code sizes} will be checked separately for each binding point. When values for a
		specific binding point are invalid, the state for that binding point will be unchanged and an error will be generated. However, state for other binding
		points will still be changed if their corresponding values are valid.
		""",

		GLenum.IN("target", "the buffer object target", BUFFER_OBJECT_TARGETS),
		GLuint.IN("first", "the first binding"),
		AutoSize("buffers", "offsets", "sizes") _ GLsizei.IN("count", "the number of bindings"),
		mods(nullable, const) _ GLuint_p.IN("buffers", "an array of names of existing buffers objects"),
		mods(nullable, const) _ GLintptr_p.IN("offsets", "an array of offsets"),
		mods(nullable, const) _ GLsizeiptr_p.IN("sizes", "an array of sizes")
	)

	GLvoid.func(
		"BindTextures",
		"""
		Binds {@code count} existing texture objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not
		$NULL, it specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. When an entry in
		{@code textures} is the name of an existing texture object, that object is bound to corresponding texture unit for the target specified when the texture
		object was created. When an entry in {@code textures} is zero, each of the targets enumerated at the beginning of this section is reset to its default
		texture for the corresponding texture image unit. If {@code textures} is $NULL, each target of each affected texture image unit from {@code first}
		through {@code first+count-1} is reset to its default texture.

		{@code BindTextures} is equivalent to:
		${codeBlock("""
for ( i = 0; i < count; i++ ) {
	uint texture;
	if ( textures == NULL ) {
		texture = 0;
	} else {
		texture = textures[i];
	}
	ActiveTexture(TEXTURE0 + first + i);
	if ( texture != 0 ) {
		enum target; // target of texture object textures[i]
		BindTexture(target, textures[i]);
	} else {
		for ( target in all supported targets ) {
			BindTexture(target, 0);
		}
	}
}
		""")}
		except that the active texture selector retains its original value upon completion of the command, and that textures will not be created if they do not
		exist.

		The values specified in {@code textures} will be checked separately for each texture image unit. When a value for a specific texture image unit is
		invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
		be changed if their corresponding values are valid.
		""",

		GLuint.IN("first", "the first texture objects"),
		AutoSize("textures") _ GLsizei.IN("count", "the number of texture objects"),
		mods(nullable, const) _ GLuint_p.IN("textures", "an array of zeros or names of existing texture objects")
	)

	GLvoid.func(
		"BindSamplers",
		"""
		Binds {@code count} existing sampler objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code samplers} is not
		$NULL, it specifies an array of {@code count} values, each of which must be zero or the name of an existing sampler object. If {@code samplers} is $NULL,
		each affected texture image unit from {@code first} through {@code first+count-1} will be reset to have no bound sampler object.

		{@code BindSamplers} is equivalent to:
		${codeBlock("""
for ( i = 0; i < count; i++ ) {
	if ( samplers == NULL ) {
		glBindSampler(first + i, 0);
	} else {
		glBindSampler(first + i, samplers[i]);
	}
}
		""")}
		The values specified in {@code samplers} will be checked separately for each texture image unit. When a value for a specific texture image unit is
		invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
		be changed if their corresponding values are valid.
		""",

		GLuint.IN("first", "the first sampler object"),
		AutoSize("samplers") _ GLsizei.IN("count", "the number of sampler objects"),
		mods(nullable, const) _ GLuint_p.IN("samplers", "an array of zeros or names of existing sampler objects")
	)

	GLvoid.func(
		"BindImageTextures",
		"""
		Binds {@code count} existing texture objects to image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not $NULL, it
		specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. If {@code textures} is $NULL, each
		affected image unit from {@code first} through {@code first+count-1} will be reset to have no bound texture object.

		When binding a non-zero texture object to an image unit, the image unit {@code level}, {@code layered}, {@code layer}, and {@code access} parameters are
		set to zero, GL11#TRUE, zero, and GL15#READ_WRITE, respectively. The image unit {@code format} parameter is taken from the internal
		format of the texture image at level zero of the texture object identified by {@code textures}. For cube map textures, the internal format of the
		GL13#TEXTURE_CUBE_MAP_POSITIVE_X image of level zero is used. For multisample, multisample array, buffer, and rectangle textures, the internal
		format of the single texture level is used.

		When unbinding a texture object from an image unit, the image unit parameters {@code level}, {@code layered}, {@code layer}, and {@code format} will be
		reset to their default values of zero, GL11#FALSE, 0, and GL30#R8, respectively.

		{@code BindImageTextures} is equivalent to:
		${codeBlock("""
for ( i = 0; i < count; i++ ) {
	if ( textures == NULL || textures[i] = 0 ) {
		glBindImageTexture(first + i, 0, 0, FALSE, 0, READ_ONLY, R8);
	} else {
		glBindImageTexture(first + i, textures[i], 0, TRUE, 0, READ_WRITE, lookupInternalFormat(textures[i]));
	}
}
		""")}
		where {@code lookupInternalFormat} returns the internal format of the specified texture object.

		The values specified in {@code textures} will be checked separately for each image unit. When a value for a specific image unit is invalid, the state
		for that image unit will be unchanged and an error will be generated. However, state for other image units will still be changed if their corresponding
		values are valid.
		""",

		GLuint.IN("first", "the first image unit"),
		AutoSize("textures") _ GLsizei.IN("count", "the number of image units"),
		mods(nullable, const) _ GLuint_p.IN("textures", "an array of zeros or names of existing texture objects")
	)

	GLvoid.func(
		"BindVertexBuffers",
		"""
		Binds {@code count} existing buffer objects to vertex buffer binding points numbered {@code first} through {@code first+count-1}. If {@code buffers} is
		not $NULL, it specifies an array of {@code count} values, each of which must be zero or the name of an existing buffer object. {@code offsets} and
		{@code strides} specify arrays of {@code count} values indicating the offset of the first element and stride between elements in each buffer,
		respectively. If {@code buffers} is $NULL, each affected vertex buffer binding point from {@code first} through {@code first+count-1} will be reset to
		have no bound buffer object. In this case, the offsets and strides associated with the binding points are set to default values, ignoring
		{@code offsets} and {@code strides}.

		{@code BindVertexBuffers} is equivalent to:
		${codeBlock("""
for ( i = 0; i < count; i++ ) {
	if ( buffers == NULL ) {
		glBindVertexBuffer(first + i, 0, 0, 16);
	} else {
		glBindVertexBuffer(first + i, buffers[i], offsets[i], strides[i]);
	}
}
		""")}
		except that buffers will not be created if they do not exist.

		The values specified in {@code buffers}, {@code offsets}, and {@code strides} will be checked separately for each vertex buffer binding point. When a
		value for a specific binding point is invalid, the state for that binding point will be unchanged and an error will be generated. However, state for
		other binding points will still be changed if their corresponding values are valid.
		""",

		GLuint.IN("first", "the first vertex buffer binding point"),
		AutoSize("buffers", "offsets", "strides") _ GLsizei.IN("count", "the number of vertex buffer binding points"),
		mods(nullable, const) _ GLuint_p.IN("buffers", "an array of zeros or names of existing buffers objects"),
		mods(nullable, const) _ GLintptr_p.IN("offsets", "an array of offses"),
		mods(nullable, const) _ GLsizei_p.IN("strides", "an array of stride values")
	)

}