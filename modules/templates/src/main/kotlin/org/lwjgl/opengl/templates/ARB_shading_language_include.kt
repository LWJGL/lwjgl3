/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shading_language_include = "ARBShadingLanguageInclude".nativeClassGL("ARB_shading_language_include", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	val include = "{@code &#35;include}"

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces a $include GLSL directive to allow reusing the same shader text in multiple shaders and defines the semantics and syntax of
		the names allowed in $include directives. It also defines API mechanisms to define the named string backing a $include.

		<h3>Introduction</h3>

		The GLSL $include mechanism looks up paths in a tree built through the OpenGL API. This appendix describes the syntax and semantic model of the tree and
		paths into the tree. How the tree is used is up to users of the tree, like the OpenGL API or GLSL.

		<h3>The Tree</h3>

		The tree is a singly rooted hierarchy of tree locations. The root may have one or more child locations, and any location may in turn have its own
		children. Except for the root, each location has exactly one parent; the root has no parent.

		<h3>Paths into the Tree</h3>

		The locations in the tree are created or looked up by path strings. The path string "/" locates the root of the tree. The path "/foo" locates the child
		"foo" of the root. Formally, a valid path is a sequence of tokens delimited by the beginning of the string, by the path-separator forward slash ( / ),
		and by the end of the string. The string "foo/bar" has two tokens; "foo" and "bar". The string "/foo/./bar" has 3 tokens; "foo", ".", and "bar". The
		string "/foo/.." has two tokens; "foo" and "..". The string "/foo/.bar" has two tokens; "foo" and ".bar". A path is invalid if
		${ul(
			"""
			{@code path} contains any characters not listed in Section 3.1 "Character Set", or the double quote character, or angled brackets, or any white
			space characters other than the space character.
			""",
		    "{@code path} has consecutive forward slashes ( // ); \"/foo//bar\" is not valid (zero length tokens are not allowed).",
		    "{@code path} ends with a forward slash ( / )",
		    "{@code path} contains no characters."
		)}
		There are no path escape characters, so there is no way to get the forward slash delimiter within a single token.

		When using a path to lookup a tree location, the path tokens are used to walk the tree. The initial location to start the walk is specified by the user
		of the tree and is updated as follows by the tokens in the path. (Paths starting with "/" will start at the root.) Taken left to right:

		The token ".." walks to the parent. Or, if already at the root, then the location remains at the root.

		The token "." leaves the location unchanged.

		Any other token is considered the name of a child of the current location, and walks to that child. (If there is no child of that name, this may result
		in a failed lookup or in the child being created, as specified by the user of the tree for the operation being performed.)

		<h3>Associated Strings</h3>

		Each location in the tree can have an additional string associated with it (that a user like the $include mechanism can use as an included string). This
		is true even for locations that have children: "/foo/bar" can exist in the tree at the same time that "/foo" has an additional string associated with
		it. Typically, when a path is used to find a location in the tree, it is for the purpose of returning this associated string.

		Hence, the tree can be built from a collection of (path,string) pairs, where path is a string establishing the existence of a location in the tree and
		string is the string associated with the node. Details of how to do this are specified by the user of the tree.

		Requires GLSL 1.10.
		"""

	IntConstant(
		"Accepted by the {@code type} parameter of NamedStringARB.",

		"SHADER_INCLUDE_ARB" _ 0x8DAE
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetNamedStringivARB.",

		"NAMED_STRING_LENGTH_ARB" _ 0x8DE9,
		"NAMED_STRING_TYPE_ARB" _ 0x8DEA
	)

	GLvoid(
		"NamedStringARB",
		"""
		Specifies a string and its name. Such strings can be included by name in shaders during compilation, allowing reuse of the same code segments.

		After calling NamedStringARB, the contents of {@code string} are associated with the tree location corresponding to {@code name}. If a string is already
		associated with that tree location, it will be replaced with the new {@code string}.
		""",

		GLenum.IN("type", "the string type", "#SHADER_INCLUDE_ARB"),
		AutoSize("name") _ GLint.IN("namelen", "the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string."),
		const _ GLcharASCII_p.IN("name", "the name associated with the string"),
		AutoSize("string") _ GLint.IN("stringlen", "the number of characters in {@code string}. If negative, {@code string} is considered to be a null-terminated string."),
		const _ GLcharUTF8_p.IN("string", "an arbitrary string of characters")
	)

	GLvoid(
		"DeleteNamedStringARB",
		"Deletes a named string.",

		AutoSize("name") _ GLint.IN("namelen", "the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string."),
		const _ GLcharASCII_p.IN("name", "the name associated with the string")
	)

	GLvoid(
		"CompileShaderIncludeARB",
		"""
		Compiles a shader object.

		The ordered list of {@code path}s is used during compilation, together with the arguments of $include directives in the shader source, to search for
		named strings corresponding to the $include directives. If a $include directive does not correspond to a valid named string, compilation will fail.
		""",

		GLuint.IN("shader", "the shader object compile"),
		AutoSize("path", "length") _ GLsizei.IN("count", ""),
		const _ GLcharASCII_p_const_p.IN("path", "an ordered array of {@code count} pointers to optionally null-terminated character strings defining search paths"),
		nullable _ const _ GLint_p.IN(
			"length",
			"""
			an array {@code count} values with the number of characters in each string (the string length). If an element in {@code length} is negative, its
			accompanying string is null-terminated. If {@code length} is $NULL, all strings in the {@code path} argument are considered null-terminated.
			"""
		)
	)

	GLboolean(
		"IsNamedStringARB",
		"""
		Returns GL11#TRUE if the tree location corresponding to {@code name} has a string associated with it, and GL11#FALSE if the tree location has no string
		associated with it.
		""",

		AutoSize("name") _ GLint.IN("namelen", "the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string."),
		const _ GLcharASCII_p.IN("name", "the name associated with the string")
	)

	GLvoid(
		"GetNamedStringARB",
		"Returns in {@code string} the string corresponding to the specified {@code name}. The returned string will be null-terminated.",

		AutoSize("name") _ GLint.IN("namelen", "the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string."),
		const _ GLcharASCII_p.IN("name", "the name associated with the string"),
		AutoSize("string") _ GLsizei.IN("bufSize", "the maximum number of characters that may be written into {@code string}, including the null terminator"),
		nullable _ Check(1) _ GLint_p.OUT(
			"stringlen",
			"""
			a buffer in which to place the actual number of characters written into {@code string}, excluding the null terminator. If $NULL, no length is
			returned.
			"""
		),
		Return(
			"stringlen",
			"glGetNamedStringiARB(name, GL_NAMED_STRING_LENGTH_ARB)"
		) _ GLcharUTF8_p.OUT("string", "a buffer in which to place the returned string")
	)

	GLvoid(
		"GetNamedStringivARB",
		"Returns properties of the named string whose tree location corresponds to {@code name}.",

		AutoSize("name") _ GLint.IN("namelen", "the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string."),
		const _ GLcharASCII_p.IN("name", "the name associated with the string"),
		GLenum.IN("pname", "the parameter to query", "#NAMED_STRING_LENGTH_ARB #NAMED_STRING_TYPE_ARB"),
		Check(1) _ returnValue _ GLint_p.OUT("params", "a buffer in which to place the returned value")
	)
}