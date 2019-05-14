/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

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

        GLbitfield("mask", "")
    )

    void(
        "PushClientAttribDefaultEXT",
        "",

        GLbitfield("mask", "")
    )

    /*
    OpenGL 1.0: New matrix commands add "Matrix" prefix to name,
    drops "Matrix" suffix from name, and add initial "enum matrixMode"
    parameter
     */

    void(
        "MatrixLoadfEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLfloat.const.p("m", "")
    )

    void(
        "MatrixLoaddEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLdouble.const.p("m", "")
    )

    void(
        "MatrixMultfEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLfloat.const.p("m", "")
    )

    void(
        "MatrixMultdEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLdouble.const.p("m", "")
    )

    void(
        "MatrixLoadIdentityEXT",
        "",

        GLenum("matrixMode", "")
    )

    void(
        "MatrixRotatefEXT",
        "",

        GLenum("matrixMode", ""),
        GLfloat("angle", ""),
        GLfloat("x", ""),
        GLfloat("y", ""),
        GLfloat("z", "")
    )

    void(
        "MatrixRotatedEXT",
        "",

        GLenum("matrixMode", ""),
        GLdouble("angle", ""),
        GLdouble("x", ""),
        GLdouble("y", ""),
        GLdouble("z", "")
    )

    void(
        "MatrixScalefEXT",
        "",

        GLenum("matrixMode", ""),
        GLfloat("x", ""),
        GLfloat("y", ""),
        GLfloat("z", "")
    )

    void(
        "MatrixScaledEXT",
        "",

        GLenum("matrixMode", ""),
        GLdouble("x", ""),
        GLdouble("y", ""),
        GLdouble("z", "")
    )

    void(
        "MatrixTranslatefEXT",
        "",

        GLenum("matrixMode", ""),
        GLfloat("x", ""),
        GLfloat("y", ""),
        GLfloat("z", "")
    )

    void(
        "MatrixTranslatedEXT",
        "",

        GLenum("matrixMode", ""),
        GLdouble("x", ""),
        GLdouble("y", ""),
        GLdouble("z", "")
    )

    void(
        "MatrixOrthoEXT",
        "",

        GLenum("matrixMode", ""),
        GLdouble("l", ""),
        GLdouble("r", ""),
        GLdouble("b", ""),
        GLdouble("t", ""),
        GLdouble("n", ""),
        GLdouble("f", "")
    )

    void(
        "MatrixFrustumEXT",
        "",

        GLenum("matrixMode", ""),
        GLdouble("l", ""),
        GLdouble("r", ""),
        GLdouble("b", ""),
        GLdouble("t", ""),
        GLdouble("n", ""),
        GLdouble("f", "")
    )

    void(
        "MatrixPushEXT",
        "",

        GLenum("matrixMode", "")
    )

    void(
        "MatrixPopEXT",
        "",

        GLenum("matrixMode", "")
    )

    /*
    OpenGL 1.1: New texture object commands and queries replace "Tex"
    in name with "Texture" and add initial "uint texture" parameter
     */

    void(
        "TextureParameteriEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    void(
        "TextureParameterivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLint.const.p("param", "")
    )

    void(
        "TextureParameterfEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        GLfloat("param", "")
    )

    void(
        "TextureParameterfvEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLfloat.const.p("param", "")
    )

    void(
        "TextureImage1DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..nullable..void.const.p("pixels", "")
    )

    void(
        "TextureImage2DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..nullable..void.const.p("pixels", "")
    )

    void(
        "TextureSubImage1DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLsizei("width", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    void(
        "TextureSubImage2DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    void(
        "CopyTextureImage1DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLint("border", "")
    )

    void(
        "CopyTextureImage2DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLint("border", "")
    )

    void(
        "CopyTextureSubImage1DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", "")
    )

    void(
        "CopyTextureSubImage2DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "GetTextureImageEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.p("pixels", "")
    )

    void(
        "GetTextureParameterfvEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    void(
        "GetTextureParameterivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    void(
        "GetTextureLevelParameterfvEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    void(
        "GetTextureLevelParameterivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    /*
    OpenGL 1.2: New 3D texture object commands replace "Tex" in name with
    "Texture" and adds initial "uint texture" parameter
     */

    DependsOn("OpenGL12")..void(
        "TextureImage3DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..RawPointer..void.const.p("pixels", "")
    )

    DependsOn("OpenGL12")..void(
        "TextureSubImage3DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    DependsOn("OpenGL12")..void(
        "CopyTextureSubImage3DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    /*
    OpenGL 1.2.1: New multitexture commands and queries prefix "Multi"
    before "Tex" and add an initial "enum texunit" parameter (to identify
    the texture unit).
     */

    DependsOn("OpenGL13")..void(
        "BindMultiTextureEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLuint("texture", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexCoordPointerEXT",
        "",

        GLenum("texunit", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnvfEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        GLfloat("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnvfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLfloat.const.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnviEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexEnvivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLint.const.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGendEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        GLdouble("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGendvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        Check(4)..GLdouble.const.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGenfEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        GLfloat("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGenfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        Check(4)..GLfloat.const.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGeniEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexGenivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        Check(4)..GLint.const.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexEnvfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexEnvivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexGendvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLdouble.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexGenfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexGenivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("coord", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameteriEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameterivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLint.const.p("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameterfEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        GLfloat("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexParameterfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLfloat.const.p("param", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexImage1DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..nullable..void.const.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexImage2DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..nullable..void.const.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexSubImage1DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLsizei("width", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexSubImage2DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "CopyMultiTexImage1DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLint("border", "")
    )

    DependsOn("OpenGL13")..void(
        "CopyMultiTexImage2DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLint("border", "")
    )

    DependsOn("OpenGL13")..void(
        "CopyMultiTexSubImage1DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", "")
    )

    DependsOn("OpenGL13")..void(
        "CopyMultiTexSubImage2DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexImageEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexParameterfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexParameterivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexLevelParameterfvEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetMultiTexLevelParameterivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexImage3DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..RawPointer..void.const.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "MultiTexSubImage3DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    DependsOn("OpenGL13")..void(
        "CopyMultiTexSubImage3DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
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

        GLenum("array", ""),
        GLuint("index", "")
    )

    DependsOn("OpenGL13")..void(
        "DisableClientStateIndexedEXT",
        "",

        GLenum("array", ""),
        GLuint("index", "")
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

        GLenum("array", ""),
        GLuint("index", "")
    )

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "DisableClientStateiEXT",
        "",

        GLenum("array", ""),
        GLuint("index", "")
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

        GLenum("target", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetDoubleIndexedvEXT",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLdouble.p("params", "")
    )

    DependsOn("OpenGL13")..void(
        "GetPointerIndexedvEXT",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..void.p.p("params", "")
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

        GLenum("pname", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLfloat.p("params", "")
    )

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "GetDoublei_vEXT",
        "",

        GLenum("pname", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLdouble.p("params", "")
    )

    DependsOn("OpenGL30")..IgnoreMissing..void(
        "GetPointeri_vEXT",
        "",

        GLenum("pname", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..void.p.p("params", "")
    )

    /*
    OpenGL 1.2.1:  Extend the functionality of these EXT_draw_buffers2
    commands and queries for multitexture
     */

    DependsOn("OpenGL13")..(EXT_draw_buffers2 reuse "EnableIndexedEXT")
    DependsOn("OpenGL13")..(EXT_draw_buffers2 reuse "DisableIndexedEXT")
    DependsOn("OpenGL13")..(EXT_draw_buffers2 reuse "IsEnabledIndexedEXT")

    DependsOn("OpenGL13")..(EXT_draw_buffers2 reuse "GetIntegerIndexedvEXT")
    DependsOn("OpenGL13")..(EXT_draw_buffers2 reuse "GetBooleanIndexedvEXT")

    /*
    ARB_vertex_program: New program commands and queries add "Named"
    prefix to name and adds initial "uint program" parameter
     */

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramStringEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLenum("format", ""),
        AutoSize("string")..GLsizei("len", ""),
        void.const.p("string", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramLocalParameter4dEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        GLdouble("x", ""),
        GLdouble("y", ""),
        GLdouble("z", ""),
        GLdouble("w", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramLocalParameter4dvEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLdouble.const.p("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramLocalParameter4fEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        GLfloat("x", ""),
        GLfloat("y", ""),
        GLfloat("z", ""),
        GLfloat("w", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "NamedProgramLocalParameter4fvEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLfloat.const.p("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramLocalParameterdvEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLdouble.p("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramLocalParameterfvEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLfloat.p("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    DependsOn("GL_ARB_vertex_program")..void(
        "GetNamedProgramStringEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check("glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB)", debug = true)..void.p("string", "")
    )

    /*
    OpenGL 1.3: New compressed texture object commands replace "Tex"
    in name with "Texture" and add initial "uint texture" parameter
     */

    DependsOn("OpenGL13")..void(
        "CompressedTextureImage3DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureImage2DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureImage1DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureSubImage3DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureSubImage2DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedTextureSubImage1DEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLsizei("width", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "GetCompressedTextureImageEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLint("level", ""),
        Check(
            expression = "glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("img", "")
    )

    /*
    OpenGL 1.3: New multitexture compressed texture commands and queries
    prefix "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
     */

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexImage3DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexImage2DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexImage1DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexSubImage3DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexSubImage2DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "CompressedMultiTexSubImage1DEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLsizei("width", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    DependsOn("OpenGL13")..void(
        "GetCompressedMultiTexImageEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLint("level", ""),
        Check(
            expression = "glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("img", "")
    )

    /*
    <OpenGL 1.3: New transpose matrix commands add "Matrix" suffix
    to name, drops "Matrix" suffix from name, and add initial "enum
    matrixMode" parameter
     */

    DependsOn("OpenGL13")..void(
        "MatrixLoadTransposefEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLfloat.const.p("m", "")
    )

    DependsOn("OpenGL13")..void(
        "MatrixLoadTransposedEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLdouble.const.p("m", "")
    )

    DependsOn("OpenGL13")..void(
        "MatrixMultTransposefEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLfloat.const.p("m", "")
    )

    DependsOn("OpenGL13")..void(
        "MatrixMultTransposedEXT",
        "",

        GLenum("matrixMode", ""),
        Check(16)..GLdouble.const.p("m", "")
    )

    /*
    OpenGL 1.5: New buffer commands and queries replace "Buffer" with
    "NamedBuffer" in name and replace "enum target" parameter with
    "uint buffer"
     */

    DependsOn("OpenGL15")..void(
        "NamedBufferDataEXT",
        "",

        GLuint("buffer", ""),
        AutoSize("data")..GLsizeiptr("size", ""),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data", ""),
        GLenum("usage", "")
    )

    DependsOn("OpenGL15")..void(
        "NamedBufferSubDataEXT",
        "",

        GLuint("buffer", ""),
        GLintptr("offset", ""),
        AutoSize("data")..GLsizeiptr("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data", "")
    )

    DependsOn("OpenGL15")..MapPointer("glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE)", oldBufferOverloads = true)..void.p(
        "MapNamedBufferEXT",
        "",

        GLuint("buffer", ""),
        GLenum("access", "")
    )

    DependsOn("OpenGL15")..GLboolean(
        "UnmapNamedBufferEXT",
        "",

        GLuint("buffer", "")
    )

    DependsOn("OpenGL15")..void(
        "GetNamedBufferParameterivEXT",
        "",

        GLuint("buffer", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("OpenGL15")..void(
        "GetNamedBufferSubDataEXT",
        "",

        GLuint("buffer", ""),
        GLintptr("offset", ""),
        AutoSize("data")..GLsizeiptr("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.p("data", "")
    )

    /*
    OpenGL 2.0: New uniform commands add "Program" prefix to name and
    add initial "uint program" parameter
     */

    DependsOn("OpenGL20")..void(
        "ProgramUniform1fEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2fEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", ""),
        GLfloat("v1", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3fEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", ""),
        GLfloat("v1", ""),
        GLfloat("v2", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4fEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", ""),
        GLfloat("v1", ""),
        GLfloat("v2", ""),
        GLfloat("v3", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform1iEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2iEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", ""),
        GLint("v1", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3iEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", ""),
        GLint("v1", ""),
        GLint("v2", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4iEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", ""),
        GLint("v1", ""),
        GLint("v2", ""),
        GLint("v3", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform1fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform1ivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform2ivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform3ivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniform4ivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniformMatrix2fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniformMatrix3fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL20")..void(
        "ProgramUniformMatrix4fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    /*
    OpenGL 2.1: New uniform matrix commands add "Program" prefix to
    name and add initial "uint program" parameter
     */

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix2x3fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix3x2fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix2x4fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix4x2fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix3x4fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    DependsOn("OpenGL21")..void(
        "ProgramUniformMatrix4x3fvEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    /*
    EXT_texture_buffer_object:  New texture buffer object command
    replaces "Tex" in name with "Texture" and adds initial "uint texture"
    parameter
     */

    DependsOn("GL_EXT_texture_buffer_object")..void(
        "TextureBufferEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("internalformat", ""),
        GLuint("buffer", "")
    )

    /*
    EXT_texture_buffer_object: New multitexture texture buffer command
    prefixes "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
     */

    DependsOn("GL_EXT_texture_buffer_object")..void(
        "MultiTexBufferEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("internalformat", ""),
        GLuint("buffer", "")
    )

    /*
    EXT_texture_integer: New integer texture object commands and queries
    replace "Tex" in name with "Texture" and add initial "uint texture"
    parameter
     */

    DependsOn("GL_EXT_texture_integer")..void(
        "TextureParameterIivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLint.const.p("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "TextureParameterIuivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLuint.const.p("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetTextureParameterIivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetTextureParameterIuivEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLuint.p("params", "")
    )

    /*
    EXT_texture_integer: New multitexture integer texture commands and
    queries prefix "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit).
     */

    DependsOn("GL_EXT_texture_integer")..void(
        "MultiTexParameterIivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLint.const.p("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "MultiTexParameterIuivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(4)..GLuint.const.p("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetMultiTexParameterIivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    DependsOn("GL_EXT_texture_integer")..void(
        "GetMultiTexParameterIuivEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLuint.p("params", "")
    )

    /*
    EXT_gpu_shader4: New integer uniform commands add "Program" prefix
    to name and add initial "uint program" parameter
     */

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform1uiEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform2uiEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform3uiEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", ""),
        GLuint("v2", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform4uiEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", ""),
        GLuint("v2", ""),
        GLuint("v3", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform1uivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform2uivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform3uivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    DependsOn("GL_EXT_gpu_shader4")..void(
        "ProgramUniform4uivEXT",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    /*
    EXT_gpu_program_parameters: New program command adds "Named" prefix
    to name and adds "uint program" parameter
     */

    DependsOn("GL_EXT_gpu_program_parameters")..void(
        "NamedProgramLocalParameters4fvEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        AutoSize(4, "params")..GLsizei("count", ""),
        GLfloat.const.p("params", "")
    )

    /*
    NV_gpu_program4: New program commands and queries add "Named"
    prefix to name and replace "enum target" with "uint program"
     */

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParameterI4iEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLint("z", ""),
        GLint("w", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParameterI4ivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLint.const.p("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParametersI4ivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        AutoSize(4, "params")..GLsizei("count", ""),
        GLint.const.p("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParameterI4uiEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        GLuint("x", ""),
        GLuint("y", ""),
        GLuint("z", ""),
        GLuint("w", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParameterI4uivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLuint.const.p("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "NamedProgramLocalParametersI4uivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        AutoSize(4, "params")..GLsizei("count", ""),
        GLuint.const.p("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "GetNamedProgramLocalParameterIivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLint.p("params", "")
    )

    DependsOn("GL_NV_gpu_program4")..void(
        "GetNamedProgramLocalParameterIuivEXT",
        "",

        GLuint("program", ""),
        GLenum("target", ""),
        GLuint("index", ""),
        Check(4)..GLuint.p("params", "")
    )

    /*
    OpenGL 3.0: New renderbuffer commands add "Named" prefix to name
    and replace "enum target" with "uint renderbuffer"
     */

    DependsOn("OpenGL30")..void(
        "NamedRenderbufferStorageEXT",
        "",

        GLuint("renderbuffer", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    DependsOn("OpenGL30")..void(
        "GetNamedRenderbufferParameterivEXT",
        "",

        GLuint("renderbuffer", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    /*
    OpenGL 3.0: New renderbuffer commands add "Named"
    prefix to name and replace "enum target" with "uint renderbuffer"
     */

    DependsOn("OpenGL30")..void(
        "NamedRenderbufferStorageMultisampleEXT",
        "",

        GLuint("renderbuffer", ""),
        GLsizei("samples", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    /*
    NV_framebuffer_multisample_coverage: New renderbuffer commands
    add "Named" prefix to name and replace "enum target" with "uint
    renderbuffer"
     */

    DependsOn("GL_NV_framebuffer_multisample_coverage")..void(
        "NamedRenderbufferStorageMultisampleCoverageEXT",
        "",

        GLuint("renderbuffer", ""),
        GLsizei("coverageSamples", ""),
        GLsizei("colorSamples", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    /*
    OpenGL 3.0: New framebuffer commands add "Named" prefix to name
    and replace "enum target" with "uint framebuffer"
     */

    DependsOn("OpenGL30")..GLenum(
        "CheckNamedFramebufferStatusEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("target", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferTexture1DEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLenum("textarget", ""),
        GLuint("texture", ""),
        GLint("level", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferTexture2DEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLenum("textarget", ""),
        GLuint("texture", ""),
        GLint("level", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferTexture3DEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLenum("textarget", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLint("zoffset", "")
    )

    DependsOn("OpenGL30")..void(
        "NamedFramebufferRenderbufferEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLenum("renderbuffertarget", ""),
        GLuint("renderbuffer", "")
    )

    DependsOn("OpenGL30")..void(
        "GetNamedFramebufferAttachmentParameterivEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    /*
    OpenGL 3.0: New texture commands add "Texture" within name and
    replace "enum target" with "uint texture"
     */

    DependsOn("OpenGL30")..void(
        "GenerateTextureMipmapEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", "")
    )

    /*
    OpenGL 3.0: New texture commands add "MultiTex" within name and
    replace "enum target" with "enum texunit"
     */

    DependsOn("OpenGL30")..void(
        "GenerateMultiTexMipmapEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", "")
    )

    // OpenGL 3.0: New framebuffer commands

    DependsOn("OpenGL30")..void(
        "FramebufferDrawBufferEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("mode", "")
    )

    DependsOn("OpenGL30")..void(
        "FramebufferDrawBuffersEXT",
        "",

        GLuint("framebuffer", ""),
        AutoSize("bufs")..GLsizei("n", ""),
        GLenum.const.p("bufs", "")
    )

    DependsOn("OpenGL30")..void(
        "FramebufferReadBufferEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("mode", "")
    )

    // OpenGL 3.0: New framebuffer query

    DependsOn("OpenGL30")..void(
        "GetFramebufferParameterivEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("param", "")
    )

    // OpenGL 3.0: New buffer data copy command

    DependsOn("OpenGL30")..void(
        "NamedCopyBufferSubDataEXT",
        "",

        GLuint("readBuffer", ""),
        GLuint("writeBuffer", ""),
        GLintptr("readOffset", ""),
        GLintptr("writeOffset", ""),
        GLsizeiptr("size", "")
    )

    /*
    EXT_geometry_shader4 or NV_gpu_program4: New framebuffer commands
    add "Named" prefix to name and replace "enum target" with "uint
    framebuffer"
     */

    DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")")..void(
        "NamedFramebufferTextureEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("level", "")
    )

    DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")")..void(
        "NamedFramebufferTextureLayerEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLint("layer", "")
    )

    DependsOn("ext.contains(\"GL_EXT_geometry_shader4\") || ext.contains(\"GL_NV_gpu_program4\")")..void(
        "NamedFramebufferTextureFaceEXT",
        "",

        GLuint("framebuffer", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLenum("face", "")
    )

    /*
    NV_explicit_multisample:  New texture renderbuffer object command
    replaces "Tex" in name with "Texture" and add initial "uint texture"
    parameter
     */

    DependsOn("GL_NV_explicit_multisample")..void(
        "TextureRenderbufferEXT",
        "",

        GLuint("texture", ""),
        GLenum("target", ""),
        GLuint("renderbuffer", "")
    )

    /*
    NV_explicit_multisample: New multitexture texture renderbuffer command
    prefixes "Multi" before "Tex" and add an initial "enum texunit"
    parameter (to identify the texture unit)
     */

    DependsOn("GL_NV_explicit_multisample")..void(
        "MultiTexRenderbufferEXT",
        "",

        GLenum("texunit", ""),
        GLenum("target", ""),
        GLuint("renderbuffer", "")
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

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayColorOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayEdgeFlagOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayIndexOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayNormalOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayTexCoordOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayMultiTexCoordOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLenum("texunit", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayFogCoordOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArraySecondaryColorOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayVertexAttribOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLuint("index", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLboolean("normalized", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    DependsOn("OpenGL30")..void(
        "VertexArrayVertexAttribIOffsetEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("buffer", ""),
        GLuint("index", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        GLintptr("offset", "")
    )

    /*
    OpenGL 3.0: New vertex array enable commands for vertex array
    objects change "ClientState" to "VertexArray" and add an initial
    "uint vaobj" parameter
     */

    DependsOn("OpenGL30")..void(
        "EnableVertexArrayEXT",
        "",

        GLuint("vaobj", ""),
        GLenum("array", "")
    )

    DependsOn("OpenGL30")..void(
        "DisableVertexArrayEXT",
        "",

        GLuint("vaobj", ""),
        GLenum("array", "")
    )

    /*
    OpenGL 3.0: New vertex attrib array enable commands for vertex
    array objects change "VertexAttribArray" to "VertexArrayAttrib"
    and add an initial "uint vaobj" parameter
     */

    DependsOn("OpenGL30")..void(
        "EnableVertexArrayAttribEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("index", "")
    )

    DependsOn("OpenGL30")..void(
        "DisableVertexArrayAttribEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("index", "")
    )

    // OpenGL 3.0: New queries for vertex array objects

    DependsOn("OpenGL30")..void(
        "GetVertexArrayIntegervEXT",
        "",

        GLuint("vaobj", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("param", "")
    )

    DependsOn("OpenGL30")..void(
        "GetVertexArrayPointervEXT",
        "",

        GLuint("vaobj", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..void.p.p("param", "")
    )

    DependsOn("OpenGL30")..void(
        "GetVertexArrayIntegeri_vEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("index", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("param", "")
    )

    DependsOn("OpenGL30")..void(
        "GetVertexArrayPointeri_vEXT",
        "",

        GLuint("vaobj", ""),
        GLuint("index", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..void.p.p("param", "")
    )

    /*
    OpenGL 3.0: New buffer commands replace "Buffer" with "NamedBuffer"
    in name and replace "enum target" parameter with "uint buffer"
     */

    DependsOn("OpenGL30")..MapPointer("length", oldBufferOverloads = true)..void.p(
        "MapNamedBufferRangeEXT",
        "",

        GLuint("buffer", ""),
        GLintptr("offset", ""),
        GLsizeiptr("length", ""),
        GLbitfield("access", "")
    )

    DependsOn("OpenGL30")..void(
        "FlushMappedNamedBufferRangeEXT",
        "",

        GLuint("buffer", ""),
        GLintptr("offset", ""),
        GLsizeiptr("length", "")
    )
}