/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_direct_state_access = "EXTDirectStateAccess".nativeClassGL("EXT_direct_state_access", postfix = EXT) {
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
        )}

        The new selector-free update commands can be compiled into display lists.

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

        "PROGRAM_MATRIX_EXT"..0x8E2D,
        "TRANSPOSE_PROGRAM_MATRIX_EXT"..0x8E2E,
        "PROGRAM_MATRIX_STACK_DEPTH_EXT"..0x8E2F
    )

    // OpenGL 1.1: New client commands

    void(
        "ClientAttribDefaultEXT",
        "",

        GLbitfield.IN("mask", "")
    )

    void(
        "PushClientAttribDefaultEXT",
        "",

        GLbitfield.IN("mask", "")
    )

    /*
    OpenGL 1.0: New matrix commands add "Matrix" prefix to name,
    drops "Matrix" suffix from name, and add initial "enum matrixMode"
    parameter
     */

    void(
        "MatrixLoadfEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLfloat_p.IN("m", "")
    )

    void(
        "MatrixLoaddEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLdouble_p.IN("m", "")
    )

    void(
        "MatrixMultfEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLfloat_p.IN("m", "")
    )

    void(
        "MatrixMultdEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLdouble_p.IN("m", "")
    )

    void(
        "MatrixLoadIdentityEXT",
        "",

        GLenum.IN("matrixMode", "")
    )

    void(
        "MatrixRotatefEXT",
        "",

        GLenum.IN("matrixMode", ""),
        GLfloat.IN("angle", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("z", "")
    )

    void(
        "MatrixRotatedEXT",
        "",

        GLenum.IN("matrixMode", ""),
        GLdouble.IN("angle", ""),
        GLdouble.IN("x", ""),
        GLdouble.IN("y", ""),
        GLdouble.IN("z", "")
    )

    void(
        "MatrixScalefEXT",
        "",

        GLenum.IN("matrixMode", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("z", "")
    )

    void(
        "MatrixScaledEXT",
        "",

        GLenum.IN("matrixMode", ""),
        GLdouble.IN("x", ""),
        GLdouble.IN("y", ""),
        GLdouble.IN("z", "")
    )

    void(
        "MatrixTranslatefEXT",
        "",

        GLenum.IN("matrixMode", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("z", "")
    )

    void(
        "MatrixTranslatedEXT",
        "",

        GLenum.IN("matrixMode", ""),
        GLdouble.IN("x", ""),
        GLdouble.IN("y", ""),
        GLdouble.IN("z", "")
    )

    void(
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

    void(
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

    void(
        "MatrixPushEXT",
        "",

        GLenum.IN("matrixMode", "")
    )

    void(
        "MatrixPopEXT",
        "",

        GLenum.IN("matrixMode", "")
    )

    /*
    OpenGL 1.1: New texture object commands and queries replace "Tex"
    in name with "Texture" and add initial "uint texture" parameter
     */

    void(
        "TextureParameteriEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    void(
        "TextureParameterivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLint_p.IN("param", "")
    )

    void(
        "TextureParameterfEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    void(
        "TextureParameterfvEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLfloat_p.IN("param", "")
    )

    void(
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
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    void(
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
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    void(
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
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    void(
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
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    void(
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

    void(
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

    void(
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

    void(
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

    void(
        "GetTextureImageEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_PACK_BUFFER..void_p.OUT("pixels", "")
    )

    void(
        "GetTextureParameterfvEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    void(
        "GetTextureParameterivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    void(
        "GetTextureLevelParameterfvEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    void(
        "GetTextureLevelParameterivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    /*
    OpenGL 1.2: New 3D texture object commands replace "Tex" in name with
    "Texture" and adds initial "uint texture" parameter
     */

    DependsOn("OpenGL12")..void(
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
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL12")..void(
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
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL12")..void(
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

    DependsOn("OpenGL13")..void(
        "BindMultiTextureEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLuint.IN("texture", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexCoordPointerEXT",
        "",

        GLenum.IN("texunit", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..const..void_p.IN("pointer", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnvfEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnvfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLfloat_p.IN("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnviEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnvivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLint_p.IN("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGendEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        GLdouble.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGendvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLdouble_p.IN("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGenfEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGenfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLfloat_p.IN("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGeniEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGenivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLint_p.IN("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexEnvfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexEnvivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexGendvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLdouble_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexGenfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexGenivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("coord", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameteriEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameterivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLint_p.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameterfEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameterfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLfloat_p.IN("param", "")
    )

    DependsOn("OpenGL13")..void(
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
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL13")..void(
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
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL13")..void(
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
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL13")..void(
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
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL13")..void(
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

    DependsOn("OpenGL13")..void(
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

    DependsOn("OpenGL13")..void(
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

    DependsOn("OpenGL13")..void(
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

    DependsOn("OpenGL13")..void(
        "GetMultiTexImageEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_PACK_BUFFER..void_p.OUT("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexParameterfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexParameterivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexLevelParameterfvEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexLevelParameterivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
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
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL13")..void(
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
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    DependsOn("OpenGL13")..void(
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

    DependsOn("OpenGL13")..void(
        "EnableClientStateIndexedEXT",
        "",

        GLenum.IN("array", ""),
        GLuint.IN("index", "")
    )

    DependsOn("OpenGL13")..void(
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

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "EnableClientStateiEXT",
        "",

        GLenum.IN("array", ""),
        GLuint.IN("index", "")
    )

    DependsOn("OpenGL30")..IgnoreMissing..void(
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

    DependsOn("OpenGL13")..void(
        "GetFloatIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetDoubleIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLdouble_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetPointerIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..void_pp.OUT("params", "")
    )

    /*
    OpenGL 3.0: New indexed generic queries (added for indexed texture
    state) replace "v" for "i_v" to name and add "uint index" parameter
    (to identify the texture unit) after state name parameters (if any)
    and before state value parameters
     */

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "GetFloati_vEXT",
        "",

        GLenum.IN("pname", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLfloat_p.OUT("params", "")
    )

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "GetDoublei_vEXT",
        "",

        GLenum.IN("pname", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLdouble_p.OUT("params", "")
    )

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "GetPointeri_vEXT",
        "",

        GLenum.IN("pname", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..void_pp.OUT("params", "")
    )

    /*
    OpenGL 1.2.1:  Extend the functionality of these EXT_draw_buffers2
    commands and queries for multitexture
     */

    DependsOn("OpenGL13")..void(
        "EnableIndexedEXT",
        "",

        GLenum.IN("cap", ""),
        GLuint.IN("index", "")
    )

    DependsOn("OpenGL13")..void(
        "DisableIndexedEXT",
        "",

        GLenum.IN("cap", ""),
        GLuint.IN("index", "")
    )

    DependsOn("OpenGL13")..GLboolean(
        "IsEnabledIndexedEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    DependsOn("OpenGL13")..void(
        "GetIntegerIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetBooleanIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLboolean_p.OUT("params", "")
    )

    /*
    ARB_vertex_program: New program commands and queries add "Named"
    prefix to name and adds initial "uint program" parameter
     */

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramStringEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLenum.IN("format", ""),
        AutoSize("string")..GLsizei.IN("len", ""),
        const..void_p.IN("string", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
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

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramLocalParameter4dvEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..const..GLdouble_p.IN("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
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

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramLocalParameter4fvEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..const..GLfloat_p.IN("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramLocalParameterdvEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..GLdouble_p.OUT("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramLocalParameterfvEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..GLfloat_p.OUT("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramStringEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check("glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB)", debug = true)..void_p.OUT("string", "")
    )

    /*
    OpenGL 1.3: New compressed texture object commands replace "Tex"
    in name with "Texture" and add initial "uint texture" parameter
     */

    DependsOn("OpenGL13")..void(
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
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureImage2DEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureImage1DEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
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
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
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
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureSubImage1DEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLsizei.IN("width", ""),
        GLenum.IN("format", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "GetCompressedTextureImageEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        Check(
            expression = "glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..PIXEL_PACK_BUFFER..void_p.OUT("img", "")
    )

    /*
    OpenGL 1.3: New multitexture compressed texture commands and queries
    prefix "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
     */

    DependsOn("OpenGL13")..void(
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
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexImage2DEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexImage1DEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
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
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
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
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexSubImage1DEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLsizei.IN("width", ""),
        GLenum.IN("format", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL13")..void(
        "GetCompressedMultiTexImageEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        Check(
            expression = "glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..PIXEL_PACK_BUFFER..void_p.OUT("img", "")
    )

    /*
    <OpenGL 1.3: New transpose matrix commands add "Matrix" suffix
    to name, drops "Matrix" suffix from name, and add initial "enum
    matrixMode" parameter
     */

    DependsOn("OpenGL13")..void(
        "MatrixLoadTransposefEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLfloat_p.IN("m", "")
    )

    DependsOn("OpenGL13")..void(
        "MatrixLoadTransposedEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLdouble_p.IN("m", "")
    )

    DependsOn("OpenGL13")..void(
        "MatrixMultTransposefEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLfloat_p.IN("m", "")
    )

    DependsOn("OpenGL13")..void(
        "MatrixMultTransposedEXT",
        "",

        GLenum.IN("matrixMode", ""),
        Check(16)..const..GLdouble_p.IN("m", "")
    )

    /*
    OpenGL 1.5: New buffer commands and queries replace "Buffer" with
    "NamedBuffer" in name and replace "enum target" parameter with
    "uint buffer"
     */

    DependsOn("OpenGL15")..void(
        "NamedBufferDataEXT",
        "",

        GLuint.IN("buffer", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..const..void_p.IN("data", ""),
        GLenum.IN("usage", "")
    )

    DependsOn("OpenGL15")..void(
        "NamedBufferSubDataEXT",
        "",

        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..const..void_p.IN("data", "")
    )

    DependsOn("OpenGL15")..MapPointer("glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE)")..void_p(
        "MapNamedBufferEXT",
        "",

        GLuint.IN("buffer", ""),
        GLenum.IN("access", "")
    )

    DependsOn("OpenGL15")..GLboolean(
        "UnmapNamedBufferEXT",
        "",

        GLuint.IN("buffer", "")
    )

    DependsOn("OpenGL15")..void(
        "GetNamedBufferParameterivEXT",
        "",

        GLuint.IN("buffer", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("OpenGL15")..void(
        "GetNamedBufferSubDataEXT",
        "",

        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void_p.OUT("data", "")
    )

    /*
    OpenGL 2.0: New uniform commands add "Program" prefix to name and
    add initial "uint program" parameter
     */

    DependsOn("OpenGL20")..void(
        "ProgramUniform1fEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2fEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3fEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", ""),
        GLfloat.IN("v2", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4fEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", ""),
        GLfloat.IN("v2", ""),
        GLfloat.IN("v3", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform1iEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2iEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3iEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", ""),
        GLint.IN("v2", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4iEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", ""),
        GLint.IN("v2", ""),
        GLint.IN("v3", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform1fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform1ivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2ivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3ivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4ivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniformMatrix2fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniformMatrix3fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniformMatrix4fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    /*
    OpenGL 2.1: New uniform matrix commands add "Program" prefix to
    name and add initial "uint program" parameter
     */

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix2x3fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix3x2fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix2x4fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix4x2fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix3x4fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix4x3fvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    /*
    EXT_texture_buffer_object:  New texture buffer object command
    replaces "Tex" in name with "Texture" and adds initial "uint texture"
    parameter
     */

    DependsOn("GL_EXT_texture_buffer_object")..void(
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

    DependsOn("GL_EXT_texture_buffer_object")..void(
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

    DependsOn("GL_EXT_texture_integer")..void(
        "TextureParameterIivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLint_p.IN("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "TextureParameterIuivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLuint_p.IN("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetTextureParameterIivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetTextureParameterIuivEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("params", "")
    )

    /*
    EXT_texture_integer: New multitexture integer texture commands and
    queries prefix "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
     */

    DependsOn("GL_EXT_texture_integer")..void(
        "MultiTexParameterIivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLint_p.IN("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "MultiTexParameterIuivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(4)..const..GLuint_p.IN("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetMultiTexParameterIivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetMultiTexParameterIuivEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("params", "")
    )

    /*
    EXT_gpu_shader4: New integer uniform commands add "Program" prefix
    to name and add initial "uint program" parameter
     */

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform1uiEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform2uiEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform3uiEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform4uiEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", ""),
        GLuint.IN("v3", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform1uivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform2uivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform3uivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform4uivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("value", "")
    )

    /*
    EXT_gpu_program_parameters: New program command adds "Named" prefix
    to name and adds "uint program" parameter
     */

    DependsOn("GL_EXT_gpu_program_parameters")..void(
        "NamedProgramLocalParameters4fvEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        AutoSize(4, "params")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("params", "")
    )

    /*
    NV_gpu_program4: New program commands and queries add "Named"
    prefix to name and replace "enum target" with "uint program"
     */

    DependsOn("GL_NV_gpu_program4")..void(
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

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParameterI4ivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..const..GLint_p.IN("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParametersI4ivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        AutoSize(4, "params")..GLsizei.IN("count", ""),
        const..GLint_p.IN("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
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

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParameterI4uivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..const..GLuint_p.IN("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParametersI4uivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        AutoSize(4, "params")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "GetNamedProgramLocalParameterIivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..GLint_p.OUT("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "GetNamedProgramLocalParameterIuivEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(4)..GLuint_p.OUT("params", "")
    )

    /*
    OpenGL 3.0: New renderbuffer commands add "Named" prefix to name
    and replace "enum target" with "uint renderbuffer"
     */

    DependsOn("OpenGL30")..void(
        "NamedRenderbufferStorageEXT",
        "",

        GLuint.IN("renderbuffer", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    DependsOn("OpenGL30")..void(
        "GetNamedRenderbufferParameterivEXT",
        "",

        GLuint.IN("renderbuffer", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    /*
    OpenGL 3.0: New renderbuffer commands add "Named"
    prefix to name and replace "enum target" with "uint renderbuffer"
     */

    DependsOn("OpenGL30")..void(
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

    DependsOn("GL_NV_framebuffer_multisample_coverage")..void(
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

    DependsOn("OpenGL30")..GLenum(
        "CheckNamedFramebufferStatusEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("target", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferTexture1DEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferTexture2DEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferTexture3DEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("zoffset", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferRenderbufferEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("renderbuffertarget", ""),
        GLuint.IN("renderbuffer", "")
    )

    DependsOn("OpenGL30")..void(
        "GetNamedFramebufferAttachmentParameterivEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    /*
    OpenGL 3.0: New texture commands add "Texture" within name and
    replace "enum target" with "uint texture"
     */

    DependsOn("OpenGL30")..void(
        "GenerateTextureMipmapEXT",
        "",

        GLuint.IN("texture", ""),
        GLenum.IN("target", "")
    )

    /*
    OpenGL 3.0: New texture commands add "MultiTex" within name and
    replace "enum target" with "enum texunit"
     */

    DependsOn("OpenGL30")..void(
        "GenerateMultiTexMipmapEXT",
        "",

        GLenum.IN("texunit", ""),
        GLenum.IN("target", "")
    )

    // OpenGL 3.0: New framebuffer commands

    DependsOn("OpenGL30")..void(
        "FramebufferDrawBufferEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("mode", "")
    )

    DependsOn("OpenGL30")..void(
        "FramebufferDrawBuffersEXT",
        "",

        GLuint.IN("framebuffer", ""),
        AutoSize("bufs")..GLsizei.IN("n", ""),
        const..GLenum_p.IN("bufs", "")
    )

    DependsOn("OpenGL30")..void(
        "FramebufferReadBufferEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("mode", "")
    )

    // OpenGL 3.0: New framebuffer query

    DependsOn("OpenGL30")..void(
        "GetFramebufferParameterivEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("param", "")
    )

    // OpenGL 3.0: New buffer data copy command

    DependsOn("OpenGL30")..void(
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

    DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")")..void(
        "NamedFramebufferTextureEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )

    DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")")..void(
        "NamedFramebufferTextureLayerEXT",
        "",

        GLuint.IN("framebuffer", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("layer", "")
    )

    DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")")..void(
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

    DependsOn("GL_NV_explicit_multisample")..void(
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

    DependsOn("GL_NV_explicit_multisample")..void(
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

    DependsOn("OpenGL30")..void(
        "VertexArrayVertexOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayColorOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayEdgeFlagOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayIndexOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayNormalOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayTexCoordOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
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

    DependsOn("OpenGL30")..void(
        "VertexArrayFogCoordOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArraySecondaryColorOffsetEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("buffer", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        GLintptr.IN("offset", "")
    )

    DependsOn("OpenGL30")..void(
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

    DependsOn("OpenGL30")..void(
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

    DependsOn("OpenGL30")..void(
        "EnableVertexArrayEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLenum.IN("array", "")
    )

    DependsOn("OpenGL30")..void(
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

    DependsOn("OpenGL30")..void(
        "EnableVertexArrayAttribEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("index", "")
    )

    DependsOn("OpenGL30")..void(
        "DisableVertexArrayAttribEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("index", "")
    )

    // OpenGL 3.0: New queries for vertex array objects

    DependsOn("OpenGL30")..void(
        "GetVertexArrayIntegervEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("param", "")
    )

    DependsOn("OpenGL30")..void(
        "GetVertexArrayPointervEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..void_pp.OUT("param", "")
    )

    DependsOn("OpenGL30")..void(
        "GetVertexArrayIntegeri_vEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("param", "")
    )

    DependsOn("OpenGL30")..void(
        "GetVertexArrayPointeri_vEXT",
        "",

        GLuint.IN("vaobj", ""),
        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..void_pp.OUT("param", "")
    )

    /*
    OpenGL 3.0: New buffer commands replace "Buffer" with "NamedBuffer"
    in name and replace "enum target" parameter with "uint buffer"
     */

    DependsOn("OpenGL30")..MapPointer("length")..void_p(
        "MapNamedBufferRangeEXT",
        "",

        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("length", ""),
        GLbitfield.IN("access", "")
    )

    DependsOn("OpenGL30")..void(
        "FlushMappedNamedBufferRangeEXT",
        "",

        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("length", "")
    )
}