/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*

val EXT_direct_state_access = "EXTDirectStateAccess".nativeClassGL("EXT_direct_state_access", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces a set of new "direct state access" commands (meaning no selector is involved) to access (update and query) OpenGL state that
		previously depended on the OpenGL state selectors for access. These new commands supplement the existing selector-based OpenGL commands to access the
		same state.

		The intent of this extension is to make it more efficient for libraries to avoid disturbing selector and latched state. The extension also allows more
		efficient command usage by eliminating the need for selector update commands.

		Two derivative advantages of this extension are 1) display lists can be executed using these commands that avoid disturbing selectors that subsequent
		commands may depend on, and 2) drivers implemented with a dual-thread partitioning with OpenGL command buffering from an application thread and then
		OpenGL command dispatching in a concurrent driver thread can avoid thread synchronization created by selector saving, setting, command execution, and
		selector restoration.

		This extension does not itself add any new OpenGL state.

		We call a state variable in OpenGL an "OpenGL state selector" or simply a "selector" if OpenGL commands depend on the state variable to determine what
		state to query or update. The matrix mode and active texture are both selectors. Object bindings for buffers, programs, textures, and framebuffer
		objects are also selectors.

		We call OpenGL state "latched" if the state is set by one OpenGL command but then that state is saved by a subsequent command or the state determines
		how client memory or buffer object memory is accessed by a subsequent command. The array and element array buffer bindings are latched by vertex array
		specification commands to determine which buffer a given vertex array uses. Vertex array state and pixel pack/unpack state decides how client memory or
		buffer object memory is accessed by subsequent vertex pulling or image specification commands.

		The existence of selectors and latched state in the OpenGL API reduces the number of parameters to various sets of OpenGL commands but complicates the
		access to state for layered libraries which seek to access state without disturbing other state, namely the state of state selectors and latched state.
		In many cases, selectors and latched state were introduced by extensions as OpenGL evolved to minimize the disruption to the OpenGL API when new
		functionality, particularly the pluralization of existing functionality as when texture objects and later multiple texture units, was introduced.

		The OpenGL API involves several selectors (listed in historical order of introduction):
		${ul(
			"The matrix mode.",
			"The current bound texture for each supported texture target.",
			"The active texture.",
			"The active client texture.",
			"The current bound program for each supported program target.",
			"The current bound buffer for each supported buffer target.",
			"The current GLSL program.",
			"The current framebuffer object."
		)}  The new selector-free update commands can be compiled into display lists.

		The OpenGL API has latched state for vertex array buffer objects and pixel store state. When an application issues a GL command to unpack or pack pixels
		(for example, glTexImage2D or glReadPixels respectively), the current unpack and pack pixel store state determines how the pixels are unpacked
		from/packed to client memory or pixel buffer objects. For example, consider:
		${codeBlock("""
glPixelStorei(GL_UNPACK_SWAP_BYTES, GL_TRUE);
glPixelStorei(GL_UNPACK_ROW_LENGTH, 640);
glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 47);
glDrawPixels(100, 100, GL_RGB, GL_FLOAT, pixels);""")}
		The unpack swap bytes and row length state set by the preceding glPixelStorei commands (as well as the 6 other unpack pixel store state variables)
		control how data is read (unpacked) from buffer of data pointed to by pixels. The glBindBuffer command also specifies an unpack buffer object (47) so
		the pixel pointer is actually treated as a byte offset into buffer object 47.

		When an application issues a command to configure a vertex array, the current array buffer state is latched as the binding for the particular vertex
		array being specified. For example, consider:
		${codeBlock("""
glBindBuffer(GL_ARRAY_BUFFER, 23);
glVertexPointer(3, GL_FLOAT, 12, pointer);""")}
		The glBindBuffer command updates the array buffering binding (GL_ARRAY_BUFFER_BINDING) to the buffer object named 23. The subsequent glVertexPointer
		command specifies explicit parameters for the size, type, stride, and pointer to access the position vertex array BUT ALSO latches the current array
		buffer binding for the vertex array buffer binding (GL_VERTEX_ARRAY_BUFFER_BINDING). Effectively the current array buffer binding buffer object becomes
		an implicit fifth parameter to glVertexPointer and this applies to all the gl*Pointer vertex array specification commands.

		Selectors and latched state create problems for layered libraries using OpenGL because selectors require the selector state to be modified to update
		some other state and latched state means implicit state can affect the operation of commands specifying, packing, or unpacking data through
		pointers/offsets. For layered libraries, a state update performed by the library may attempt to save the selector state, set the selector, update/query
		some state the selector controls, and then restore the selector to its saved state. Layered libraries can skip the selector save/restore but this risks
		introducing uncertainty about the state of a selector after calling layered library routines. Such selector side-effects are difficult to document and
		lead to compatibility issues as the layered library evolves or its usage varies. For latched state, layered libraries may find commands such as
		glDrawPixels do not work as expected because latched pixel store state is not what the library expects. Querying or pushing the latched state, setting
		the latched state explicitly, performing the operation involving latched state, and then restoring or popping the latched state avoids entanglements
		with latched state but at considerable cost.

		<h3>EXAMPLE USAGE OF THIS EXTENSION'S FUNCTIONALITY</h3>

		Consider the following routine to set the modelview matrix involving the matrix mode selector:
		${codeBlock("""
void setModelviewMatrix(const GLfloat matrix[16])
{
	GLenum savedMatrixMode;

	glGetIntegerv(GL_MATRIX_MODE, &savedMatrixMode);
	glMatrixMode(GL_MODELVIEW);
	glLoadMatrixf(matrix);
	glMatrixMode(savedMatrixMode);
}""")}
		Notice that four OpenGL commands are required to update the current modelview matrix without disturbing the matrix mode selector.

		OpenGL query commands can also substantially reduce the performance of modern OpenGL implementations which may off-load OpenGL state processing to
		another CPU core/thread or to the GPU itself.

		An alternative to querying the selector is to use the glPushAttrib/glPopAttrib commands. However this approach typically involves pushing far more state
		than simply the one or two selectors that need to be saved and restored. Because so much state is associated with a given push/pop attribute bit, the
		glPushAttrib and glPopAttrib commands are considerably more costly than the save/restore approach. Additionally glPushAttrib risks overflowing the
		attribute stack.

		The reliability and performance of layered libraries and applications can be improved by adding to the OpenGL API a new set of commands to access
		directly OpenGL state that otherwise involves selectors to access.

		The above example can be reimplemented more efficiently and without selector side-effects:
		${codeBlock("""
void setModelviewMatrix(const GLfloat matrix[16])
{
	glMatrixLoadfEXT(GL_MODELVIEW, matrix);
}""")}
		Consider a layered library seeking to load a texture:
		${codeBlock("""
void loadTexture(GLint texobj, GLint width, GLint height, void *data)
{
	glBindTexture(GL_TEXTURE_2D, texobj);
	glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
}""")}
		The library expects the data to be packed into the buffer pointed to by data. But what if the current pixel unpack buffer binding is not zero so the
		current pixel unpack buffer, rather than client memory, will be read? Or what if the application has modified the GL_UNPACK_ROW_LENGTH pixel store state
		before loadTexture is called?

		We can fix the routine by calling glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0) and setting all the pixel store unpack state to the initial state the
		loadTexture routine expects, but this is expensive. It also risks disturbing the state so when loadTexture returns to the application, the application
		doesn't realize the current texture object (for whatever texture unit the current active texture happens to be) and pixel store state has changed.

		We can more efficiently implement this routine without disturbing selector or latched state as follows:
		${codeBlock("""
void loadTexture(GLint texobj, GLint width, GLint height, void *data)
{
	glPushClientAttribDefaultEXT(GL_CLIENT_PIXEL_STORE_BIT);
	glTextureImage2D(texobj, GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
	glPopClientAttrib();
}""")}
		Now loadTexture does not have to worry about inappropriately configured pixel store state or a non-zero pixel unpack buffer binding. And loadTexture has
		no unintended side-effects for selector or latched state (assuming the client attrib state does not overflow).
		"""

	IntConstant(
		"GetBooleani_v, GetIntegeri_v, GetFloati_vEXT, GetDoublei_vEXT.",

		"PROGRAM_MATRIX_EXT" _ 0x8E2D,
		"TRANSPOSE_PROGRAM_MATRIX_EXT" _ 0x8E2E,
		"PROGRAM_MATRIX_STACK_DEPTH_EXT" _ 0x8E2F
	)

	// OpenGL 1.1: New client commands

	GLvoid(
		"ClientAttribDefaultEXT",
		"",

		GLbitfield.IN("mask", "")
	)

	GLvoid(
		"PushClientAttribDefaultEXT",
		"",

		GLbitfield.IN("mask", "")
	)

	/*
	OpenGL 1.0: New matrix commands add "Matrix" prefix to name,
    drops "Matrix" suffix from name, and add initial "enum matrixMode"
    parameter
	 */

	GLvoid(
		"MatrixLoadfEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLfloat_p.IN("m", "")
	)

	GLvoid(
		"MatrixLoaddEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLdouble_p.IN("m", "")
	)

	GLvoid(
		"MatrixMultfEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLfloat_p.IN("m", "")
	)

	GLvoid(
		"MatrixMultdEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLdouble_p.IN("m", "")
	)

	GLvoid(
		"MatrixLoadIdentityEXT",
		"",

		GLenum.IN("matrixMode", "")
	)

	GLvoid(
		"MatrixRotatefEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLfloat.IN("angle", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", ""),
		GLfloat.IN("z", "")
	)

	GLvoid(
		"MatrixRotatedEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLdouble.IN("angle", ""),
		GLdouble.IN("x", ""),
		GLdouble.IN("y", ""),
		GLdouble.IN("z", "")
	)

	GLvoid(
		"MatrixScalefEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", ""),
		GLfloat.IN("z", "")
	)

	GLvoid(
		"MatrixScaledEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLdouble.IN("x", ""),
		GLdouble.IN("y", ""),
		GLdouble.IN("z", "")
	)

	GLvoid(
		"MatrixTranslatefEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", ""),
		GLfloat.IN("z", "")
	)

	GLvoid(
		"MatrixTranslatedEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLdouble.IN("x", ""),
		GLdouble.IN("y", ""),
		GLdouble.IN("z", "")
	)

	GLvoid(
		"MatrixOrthoEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLdouble.IN("l", ""),
		GLdouble.IN("r", ""),
		GLdouble.IN("b", ""),
		GLdouble.IN("t", ""),
		GLdouble.IN("n", ""),
		GLdouble.IN("f", "")
	)

	GLvoid(
		"MatrixFrustumEXT",
		"",

		GLenum.IN("matrixMode", ""),
		GLdouble.IN("l", ""),
		GLdouble.IN("r", ""),
		GLdouble.IN("b", ""),
		GLdouble.IN("t", ""),
		GLdouble.IN("n", ""),
		GLdouble.IN("f", "")
	)

	GLvoid(
		"MatrixPushEXT",
		"",

		GLenum.IN("matrixMode", "")
	)

	GLvoid(
		"MatrixPopEXT",
		"",

		GLenum.IN("matrixMode", "")
	)

	/*
	OpenGL 1.1: New texture object commands and queries replace "Tex"
    in name with "Texture" and add initial "uint texture" parameter
	 */

	GLvoid(
		"TextureParameteriEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	GLvoid(
		"TextureParameterivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLint_p.IN("param", "")
	)

	GLvoid(
		"TextureParameterfEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLfloat.IN("param", "")
	)

	GLvoid(
		"TextureParameterfvEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLfloat_p.IN("param", "")
	)

	GLvoid(
		"TextureImage1DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	GLvoid(
		"TextureImage2DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	GLvoid(
		"TextureSubImage1DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLsizei.IN("width", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	GLvoid(
		"TextureSubImage2DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	GLvoid(
		"CopyTextureImage1DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLint.IN("border", "")
	)

	GLvoid(
		"CopyTextureImage2DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", "")
	)

	GLvoid(
		"CopyTextureSubImage1DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", "")
	)

	GLvoid(
		"CopyTextureSubImage2DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	GLvoid(
		"GetTextureImageEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "")
	)

	GLvoid(
		"GetTextureParameterfvEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	GLvoid(
		"GetTextureParameterivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	GLvoid(
		"GetTextureLevelParameterfvEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	GLvoid(
		"GetTextureLevelParameterivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	/*
	OpenGL 1.2: New 3D texture object commands replace "Tex" in name with
    "Texture" and adds initial "uint texture" parameter
	 */

	DependsOn("OpenGL12") _ GLvoid(
		"TextureImage3DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL12") _ GLvoid(
		"TextureSubImage3DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL12") _ GLvoid(
		"CopyTextureSubImage3DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)
	
	/*
	OpenGL 1.2.1: New multitexture commands and queries prefix "Multi"
    before "Tex" and add an initial "enum texunit" parameter (to identify
    the texture unit).
	 */

	DependsOn("OpenGL13") _ GLvoid(
		"BindMultiTextureEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLuint.IN("texture", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexCoordPointerEXT",
		"",

		GLenum.IN("texunit", ""),
		GLint.IN("size", ""),
		AutoType("pointer", GL_HALF_FLOAT, GL_FLOAT) _ GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		const _ ARRAY_BUFFER _ GLvoid_p.IN("pointer", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexEnvfEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLfloat.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexEnvfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLfloat_p.IN("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexEnviEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexEnvivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLint_p.IN("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexGendEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		GLdouble.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexGendvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLdouble_p.IN("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexGenfEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		GLfloat.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexGenfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLfloat_p.IN("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexGeniEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexGenivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLint_p.IN("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexEnvfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexEnvivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexGendvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLdouble_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexGenfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexGenivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("coord", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexParameteriEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexParameterivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLint_p.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexParameterfEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLfloat.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexParameterfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLfloat_p.IN("param", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexImage1DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexImage2DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexSubImage1DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLsizei.IN("width", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexSubImage2DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CopyMultiTexImage1DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLint.IN("border", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CopyMultiTexImage2DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CopyMultiTexSubImage1DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CopyMultiTexSubImage2DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexImageEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexParameterfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexParameterivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexLevelParameterfvEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetMultiTexLevelParameterivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexImage3DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MultiTexSubImage3DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CopyMultiTexSubImage3DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	/*
	OpenGL 1.2.1: New indexed texture commands and queries append
    "Indexed" to name and add "uint index" parameter (to identify the
    texture unit index) after state name parameters (if any) and before
    state value parameters
	 */

	DependsOn("OpenGL13") _ GLvoid(
		"EnableClientStateIndexedEXT",
		"",

		GLenum.IN("array", ""),
		GLuint.IN("index", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"DisableClientStateIndexedEXT",
		"",

		GLenum.IN("array", ""),
		GLuint.IN("index", "")
	)

	/*
	OpenGL 3.0: New indexed texture commands and queries append "i"
    to name and add "uint index" parameter (to identify the texture
    unit index) after state name parameters (if any) and before state
    value parameters
	 */

	DependsOn("OpenGL30") _ ignoreMissing _ GLvoid(
		"EnableClientStateiEXT",
		"",

		GLenum.IN("array", ""),
		GLuint.IN("index", "")
	)

	DependsOn("OpenGL30") _ ignoreMissing _ GLvoid(
		"DisableClientStateiEXT",
		"",

		GLenum.IN("array", ""),
		GLuint.IN("index", "")
	)

	/*
	OpenGL 1.2.1: New indexed generic queries (added for indexed texture
    state) append "Indexed" to name and add "uint index" parameter
    (to identify the texture unit) after state name parameters (if any) and
    before state value parameters
	 */

	DependsOn("OpenGL13") _ GLvoid(
		"GetFloatIndexedvEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetDoubleIndexedvEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLdouble_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetPointerIndexedvEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLvoid_pp.OUT("params", "")
	)

	/*
	OpenGL 3.0: New indexed generic queries (added for indexed texture
    state) replace "v" for "i_v" to name and add "uint index" parameter
    (to identify the texture unit) after state name parameters (if any)
    and before state value parameters
	 */

	DependsOn("OpenGL30") _ ignoreMissing _ GLvoid(
		"GetFloati_vEXT",
		"",

		GLenum.IN("pname", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLfloat_p.OUT("params", "")
	)

	DependsOn("OpenGL30") _ ignoreMissing _ GLvoid(
		"GetDoublei_vEXT",
		"",

		GLenum.IN("pname", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLdouble_p.OUT("params", "")
	)

	DependsOn("OpenGL30") _ ignoreMissing _ GLvoid(
		"GetPointeri_vEXT",
		"",

		GLenum.IN("pname", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLvoid_pp.OUT("params", "")
	)

	/*
	OpenGL 1.2.1:  Extend the functionality of these EXT_draw_buffers2
    commands and queries for multitexture
	 */

	// TODO: Reuse EXT_draw_buffers2 functions

	DependsOn("OpenGL13") _ GLvoid(
		"EnableIndexedEXT",
		"",

		GLenum.IN("cap", ""),
		GLuint.IN("index", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"DisableIndexedEXT",
		"",

		GLenum.IN("cap", ""),
		GLuint.IN("index", "")
	)

	DependsOn("OpenGL13") _ GLboolean(
		"IsEnabledIndexedEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("index", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetIntegerIndexedvEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetBooleanIndexedvEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(1) _ returnValue _ GLboolean_p.OUT("params", "")
	)

	/*
	ARB_vertex_program: New program commands and queries add "Named"
    prefix to name and adds initial "uint program" parameter
	 */

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"NamedProgramStringEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLenum.IN("format", ""),
		AutoSize("string") _ GLsizei.IN("len", ""),
		const _ GLvoid_p.IN("string", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"NamedProgramLocalParameter4dEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		GLdouble.IN("x", ""),
		GLdouble.IN("y", ""),
		GLdouble.IN("z", ""),
		GLdouble.IN("w", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"NamedProgramLocalParameter4dvEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		const _ Check(4) _ GLdouble_p.IN("params", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"NamedProgramLocalParameter4fEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", ""),
		GLfloat.IN("z", ""),
		GLfloat.IN("w", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"NamedProgramLocalParameter4fvEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		const _ Check(4) _ GLfloat_p.IN("params", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"GetNamedProgramLocalParameterdvEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(4) _ GLdouble_p.OUT("params", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"GetNamedProgramLocalParameterfvEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(4) _ GLfloat_p.OUT("params", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"GetNamedProgramivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	DependsOn("GL_ARB_vertex_program") _ GLvoid(
		"GetNamedProgramStringEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check("glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB)", debug = true) _ GLvoid_p.OUT("string", "")
	)

	/*
	OpenGL 1.3: New compressed texture object commands replace "Tex"
    in name with "Texture" and add initial "uint texture" parameter
	 */

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedTextureImage3DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ nullable _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedTextureImage2DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ nullable _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedTextureImage1DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ nullable _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedTextureSubImage3DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedTextureSubImage2DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedTextureSubImage1DEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLsizei.IN("width", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetCompressedTextureImageEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		Check(
			expression = "glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
		) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("img", "")
	)

	/*
	OpenGL 1.3: New multitexture compressed texture commands and queries
    prefix "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
	 */

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedMultiTexImage3DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ nullable _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedMultiTexImage2DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ nullable _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedMultiTexImage1DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ nullable _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedMultiTexSubImage3DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedMultiTexSubImage2DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"CompressedMultiTexSubImage1DEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLsizei.IN("width", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"GetCompressedMultiTexImageEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		Check(
			expression = "glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
		) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("img", "")
	)

	/*
	<OpenGL 1.3: New transpose matrix commands add "Matrix" suffix
    to name, drops "Matrix" suffix from name, and add initial "enum
    matrixMode" parameter
	 */

	DependsOn("OpenGL13") _ GLvoid(
		"MatrixLoadTransposefEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLfloat_p.IN("m", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MatrixLoadTransposedEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLdouble_p.IN("m", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MatrixMultTransposefEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLfloat_p.IN("m", "")
	)

	DependsOn("OpenGL13") _ GLvoid(
		"MatrixMultTransposedEXT",
		"",

		GLenum.IN("matrixMode", ""),
		const _ Check(16) _ GLdouble_p.IN("m", "")
	)

	/*
	OpenGL 1.5: New buffer commands and queries replace "Buffer" with
    "NamedBuffer" in name and replace "enum target" parameter with
    "uint buffer"
	 */

	DependsOn("OpenGL15") _ GLvoid(
		"NamedBufferDataEXT",
		"",

		GLuint.IN("buffer", ""),
		AutoSize("data") _ GLsizeiptr.IN("size", ""),
		optional _ MultiType(
			PointerMapping.DATA_BYTE,
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE
		) _ const _ GLvoid_p.IN("data", ""),
		GLenum.IN("usage", "")
	)

	DependsOn("OpenGL15") _ GLvoid(
		"NamedBufferSubDataEXT",
		"",

		GLuint.IN("buffer", ""),
		GLintptr.IN("offset", ""),
		AutoSize("data") _ GLsizeiptr.IN("size", ""),
		MultiType(
			PointerMapping.DATA_BYTE,
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE
		) _ const _ GLvoid_p.IN("data", "")
	)

	DependsOn("OpenGL15") _ (MapPointer("glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE)") _ GLvoid_p)(
		"MapNamedBufferEXT",
		"",

		GLuint.IN("buffer", ""),
		GLenum.IN("access", "")
	)

	DependsOn("OpenGL15") _ GLboolean(
		"UnmapNamedBufferEXT",
		"",

		GLuint.IN("buffer", "")
	)

	DependsOn("OpenGL15") _ GLvoid(
		"GetNamedBufferParameterivEXT",
		"",

		GLuint.IN("buffer", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("OpenGL15") _ GLvoid(
		"GetNamedBufferSubDataEXT",
		"",

		GLuint.IN("buffer", ""),
		GLintptr.IN("offset", ""),
		AutoSize("data") _ GLsizeiptr.IN("size", ""),
		MultiType(
			PointerMapping.DATA_BYTE,
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE
		) _ GLvoid_p.OUT("data", "")
	)

	/*
	OpenGL 2.0: New uniform commands add "Program" prefix to name and
    add initial "uint program" parameter
	 */

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform1fEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLfloat.IN("v0", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform2fEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLfloat.IN("v0", ""),
		GLfloat.IN("v1", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform3fEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLfloat.IN("v0", ""),
		GLfloat.IN("v1", ""),
		GLfloat.IN("v2", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform4fEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLfloat.IN("v0", ""),
		GLfloat.IN("v1", ""),
		GLfloat.IN("v2", ""),
		GLfloat.IN("v3", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform1iEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLint.IN("v0", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform2iEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLint.IN("v0", ""),
		GLint.IN("v1", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform3iEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLint.IN("v0", ""),
		GLint.IN("v1", ""),
		GLint.IN("v2", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform4iEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLint.IN("v0", ""),
		GLint.IN("v1", ""),
		GLint.IN("v2", ""),
		GLint.IN("v3", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform1fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform2fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform3fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / 3) _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform4fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform1ivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform2ivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform3ivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / 3) _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniform4ivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniformMatrix2fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniformMatrix3fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL20") _ GLvoid(
		"ProgramUniformMatrix4fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 4) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	/*
	OpenGL 2.1: New uniform matrix commands add "Program" prefix to
    name and add initial "uint program" parameter
	 */

	DependsOn("OpenGL21") _ GLvoid(
		"ProgramUniformMatrix2x3fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / (2 * 3)) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL21") _ GLvoid(
		"ProgramUniformMatrix3x2fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / (3 * 2)) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL21") _ GLvoid(
		"ProgramUniformMatrix2x4fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL21") _ GLvoid(
		"ProgramUniformMatrix4x2fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL21") _ GLvoid(
		"ProgramUniformMatrix3x4fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / (3 * 4)) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	DependsOn("OpenGL21") _ GLvoid(
		"ProgramUniformMatrix4x3fvEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / (4 * 3)) _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	/*
	EXT_texture_buffer_object:  New texture buffer object command
    replaces "Tex" in name with "Texture" and adds initial "uint texture"
    parameter
	 */

	DependsOn("GL_EXT_texture_buffer_object") _ GLvoid(
		"TextureBufferEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("internalformat", ""),
		GLuint.IN("buffer", "")
	)

	/*
	EXT_texture_buffer_object: New multitexture texture buffer command
    prefixes "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
	 */

	DependsOn("GL_EXT_texture_buffer_object") _ GLvoid(
		"MultiTexBufferEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("internalformat", ""),
		GLuint.IN("buffer", "")
	)

	/*
	EXT_texture_integer: New integer texture object commands and queries
    replace "Tex" in name with "Texture" and add initial "uint texture"
    parameter
	 */

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"TextureParameterIivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLint_p.IN("params", "")
	)

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"TextureParameterIuivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLuint_p.IN("params", "")
	)

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"GetTextureParameterIivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"GetTextureParameterIuivEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "")
	)

	/*
	EXT_texture_integer: New multitexture integer texture commands and
    queries prefix "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
	 */

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"MultiTexParameterIivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLint_p.IN("params", "")
	)

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"MultiTexParameterIuivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		const _ Check(4) _ GLuint_p.IN("params", "")
	)

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"GetMultiTexParameterIivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	DependsOn("GL_EXT_texture_integer") _ GLvoid(
		"GetMultiTexParameterIuivEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "")
	)

	/*
	EXT_gpu_shader4: New integer uniform commands add "Program" prefix
    to name and add initial "uint program" parameter
	 */

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform1uiEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLuint.IN("v0", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform2uiEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLuint.IN("v0", ""),
		GLuint.IN("v1", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform3uiEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLuint.IN("v0", ""),
		GLuint.IN("v1", ""),
		GLuint.IN("v2", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform4uiEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLuint.IN("v0", ""),
		GLuint.IN("v1", ""),
		GLuint.IN("v2", ""),
		GLuint.IN("v3", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform1uivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLuint_p.IN("value", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform2uivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", ""),
		const _ GLuint_p.IN("value", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform3uivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") / 3) _ GLsizei.IN("count", ""),
		const _ GLuint_p.IN("value", "")
	)

	DependsOn("GL_EXT_gpu_shader4") _ GLvoid(
		"ProgramUniform4uivEXT",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", ""),
		const _ GLuint_p.IN("value", "")
	)

	/*
	EXT_gpu_program_parameters: New program command adds "Named" prefix
    to name and adds "uint program" parameter
	 */

	DependsOn("GL_EXT_gpu_program_parameters") _ GLvoid(
		"NamedProgramLocalParameters4fvEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		(AutoSize("params") shr 2) _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("params", "")
	)

	/*
	NV_gpu_program4: New program commands and queries add "Named"
    prefix to name and replace "enum target" with "uint program"
	 */

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"NamedProgramLocalParameterI4iEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLint.IN("z", ""),
		GLint.IN("w", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"NamedProgramLocalParameterI4ivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		const _ Check(4) _ GLint_p.IN("params", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"NamedProgramLocalParametersI4ivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		(AutoSize("params") shr 2) _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("params", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"NamedProgramLocalParameterI4uiEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		GLuint.IN("x", ""),
		GLuint.IN("y", ""),
		GLuint.IN("z", ""),
		GLuint.IN("w", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"NamedProgramLocalParameterI4uivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		const _ Check(4) _ GLuint_p.IN("params", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"NamedProgramLocalParametersI4uivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		(AutoSize("params") shr 2) _ GLsizei.IN("count", ""),
		const _ GLuint_p.IN("params", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"GetNamedProgramLocalParameterIivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(4) _ GLint_p.OUT("params", "")
	)

	DependsOn("GL_NV_gpu_program4") _ GLvoid(
		"GetNamedProgramLocalParameterIuivEXT",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("target", ""),
		GLuint.IN("index", ""),
		Check(4) _ GLuint_p.OUT("params", "")
	)

	/*
	OpenGL 3.0: New renderbuffer commands add "Named" prefix to name
    and replace "enum target" with "uint renderbuffer"
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"NamedRenderbufferStorageEXT",
		"",

		GLuint.IN("renderbuffer", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"GetNamedRenderbufferParameterivEXT",
		"",

		GLuint.IN("renderbuffer", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	/*
	OpenGL 3.0: New renderbuffer commands add "Named"
    prefix to name and replace "enum target" with "uint renderbuffer"
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"NamedRenderbufferStorageMultisampleEXT",
		"",

		GLuint.IN("renderbuffer", ""),
		GLsizei.IN("samples", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	/*
	NV_framebuffer_multisample_coverage: New renderbuffer commands
    add "Named" prefix to name and replace "enum target" with "uint
    renderbuffer"
	 */

	DependsOn("GL_NV_framebuffer_multisample_coverage") _ GLvoid(
		"NamedRenderbufferStorageMultisampleCoverageEXT",
		"",

		GLuint.IN("renderbuffer", ""),
		GLsizei.IN("coverageSamples", ""),
		GLsizei.IN("colorSamples", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	/*
	OpenGL 3.0: New framebuffer commands add "Named" prefix to name
    and replace "enum target" with "uint framebuffer"
	 */

	DependsOn("OpenGL30") _ GLenum(
		"CheckNamedFramebufferStatusEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("target", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"NamedFramebufferTexture1DEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"NamedFramebufferTexture2DEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"NamedFramebufferTexture3DEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", ""),
		GLint.IN("zoffset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"NamedFramebufferRenderbufferEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("renderbuffertarget", ""),
		GLuint.IN("renderbuffer", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"GetNamedFramebufferAttachmentParameterivEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	/*
	OpenGL 3.0: New texture commands add "Texture" within name and
    replace "enum target" with "uint texture"
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"GenerateTextureMipmapEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", "")
	)

	/*
	OpenGL 3.0: New texture commands add "MultiTex" within name and
    replace "enum target" with "enum texunit"
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"GenerateMultiTexMipmapEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", "")
	)

	// OpenGL 3.0: New framebuffer commands

	DependsOn("OpenGL30") _ GLvoid(
		"FramebufferDrawBufferEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("mode", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"FramebufferDrawBuffersEXT",
		"",

		GLuint.IN("framebuffer", ""),
		AutoSize("bufs") _ GLsizei.IN("n", ""),
		const _ GLenum_p.IN("bufs", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"FramebufferReadBufferEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("mode", "")
	)

	// OpenGL 3.0: New framebuffer query

	DependsOn("OpenGL30") _ GLvoid(
		"GetFramebufferParameterivEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("param", "")
	)

	// OpenGL 3.0: New buffer data copy command

	DependsOn("OpenGL30") _ GLvoid(
		"NamedCopyBufferSubDataEXT",
		"",

		GLuint.IN("readBuffer", ""),
		GLuint.IN("writeBuffer", ""),
		GLintptr.IN("readOffset", ""),
		GLintptr.IN("writeOffset", ""),
		GLsizeiptr.IN("size", "")
	)

	/*
	EXT_geometry_shader4 or NV_gpu_program4: New framebuffer commands
    add "Named" prefix to name and replace "enum target" with "uint
    framebuffer"
	 */

	DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")") _ GLvoid(
		"NamedFramebufferTextureEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", "")
	)

	DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")") _ GLvoid(
		"NamedFramebufferTextureLayerEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", ""),
		GLint.IN("layer", "")
	)

	DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")") _ GLvoid(
		"NamedFramebufferTextureFaceEXT",
		"",

		GLuint.IN("framebuffer", ""),
		GLenum.IN("attachment", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", ""),
		GLenum.IN("face", "")
	)

	/*
	NV_explicit_multisample:  New texture renderbuffer object command
    replaces "Tex" in name with "Texture" and add initial "uint texture"
    parameter
	 */

	DependsOn("GL_NV_explicit_multisample") _ GLvoid(
		"TextureRenderbufferEXT",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLuint.IN("renderbuffer", "")
	)

	/*
	NV_explicit_multisample: New multitexture texture renderbuffer command
    prefixes "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit)
	 */

	DependsOn("GL_NV_explicit_multisample") _ GLvoid(
		"MultiTexRenderbufferEXT",
		"",

		GLenum.IN("texunit", ""),
		GLenum.IN("target", ""),
		GLuint.IN("renderbuffer", "")
	)

	/*
	OpenGL 3.0: New vertex array specification commands for vertex
    array objects prefix "VertexArray", add initial "uint vaobj" and
    "uint buffer" parameters, change "Pointer" suffix to "Offset",
    and change the final parameter from "const void *" to "intptr offset"
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayVertexOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayColorOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayEdgeFlagOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayIndexOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayNormalOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayTexCoordOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayMultiTexCoordOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLenum.IN("texunit", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayFogCoordOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArraySecondaryColorOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayVertexAttribOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLuint.IN("index", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLboolean.IN("normalized", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"VertexArrayVertexAttribIOffsetEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("buffer", ""),
		GLuint.IN("index", ""),
		GLint.IN("size", ""),
		GLenum.IN("type", ""),
		GLsizei.IN("stride", ""),
		GLintptr.IN("offset", "")
	)

	/*
	OpenGL 3.0: New vertex array enable commands for vertex array
    objects change "ClientState" to "VertexArray" and add an initial
    "uint vaobj" parameter
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"EnableVertexArrayEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLenum.IN("array", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"DisableVertexArrayEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLenum.IN("array", "")
	)

	/*
	OpenGL 3.0: New vertex attrib array enable commands for vertex
    array objects change "VertexAttribArray" to "VertexArrayAttrib"
    and add an initial "uint vaobj" parameter
	 */

	DependsOn("OpenGL30") _ GLvoid(
		"EnableVertexArrayAttribEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("index", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"DisableVertexArrayAttribEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("index", "")
	)

	// OpenGL 3.0: New queries for vertex array objects

	DependsOn("OpenGL30") _ GLvoid(
		"GetVertexArrayIntegervEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("param", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"GetVertexArrayPointervEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLvoid_pp.OUT("param", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"GetVertexArrayIntegeri_vEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("index", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("param", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"GetVertexArrayPointeri_vEXT",
		"",

		GLuint.IN("vaobj", ""),
		GLuint.IN("index", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLvoid_pp.OUT("param", "")
	)

	/*
	OpenGL 3.0: New buffer commands replace "Buffer" with "NamedBuffer"
    in name and replace "enum target" parameter with "uint buffer"
	 */

	DependsOn("OpenGL30") _ (MapPointer("length") _ GLvoid_p)(
		"MapNamedBufferRangeEXT",
		"",

		GLuint.IN("buffer", ""),
		GLintptr.IN("offset", ""),
		GLsizeiptr.IN("length", ""),
		GLbitfield.IN("access", "")
	)

	DependsOn("OpenGL30") _ GLvoid(
		"FlushMappedNamedBufferRangeEXT",
		"",

		GLuint.IN("buffer", ""),
		GLintptr.IN("offset", ""),
		GLsizeiptr.IN("length", "")
	)
}