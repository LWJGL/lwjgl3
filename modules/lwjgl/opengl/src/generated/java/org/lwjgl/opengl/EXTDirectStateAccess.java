/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_direct_state_access.txt">EXT_direct_state_access</a> extension.
 * 
 * <p>This extension introduces a set of new "direct state access" commands (meaning no selector is involved) to access (update and query) OpenGL state that
 * previously depended on the OpenGL state selectors for access. These new commands supplement the existing selector-based OpenGL commands to access the
 * same state.</p>
 * 
 * <p>The intent of this extension is to make it more efficient for libraries to avoid disturbing selector and latched state. The extension also allows more
 * efficient command usage by eliminating the need for selector update commands.</p>
 * 
 * <p>Two derivative advantages of this extension are 1) display lists can be executed using these commands that avoid disturbing selectors that subsequent
 * commands may depend on, and 2) drivers implemented with a dual-thread partitioning with OpenGL command buffering from an application thread and then
 * OpenGL command dispatching in a concurrent driver thread can avoid thread synchronization created by selector saving, setting, command execution, and
 * selector restoration.</p>
 * 
 * <p>This extension does not itself add any new OpenGL state.</p>
 * 
 * <p>We call a state variable in OpenGL an "OpenGL state selector" or simply a "selector" if OpenGL commands depend on the state variable to determine what
 * state to query or update. The matrix mode and active texture are both selectors. Object bindings for buffers, programs, textures, and framebuffer
 * objects are also selectors.</p>
 * 
 * <p>We call OpenGL state "latched" if the state is set by one OpenGL command but then that state is saved by a subsequent command or the state determines
 * how client memory or buffer object memory is accessed by a subsequent command. The array and element array buffer bindings are latched by vertex array
 * specification commands to determine which buffer a given vertex array uses. Vertex array state and pixel pack/unpack state decides how client memory or
 * buffer object memory is accessed by subsequent vertex pulling or image specification commands.</p>
 * 
 * <p>The existence of selectors and latched state in the OpenGL API reduces the number of parameters to various sets of OpenGL commands but complicates the
 * access to state for layered libraries which seek to access state without disturbing other state, namely the state of state selectors and latched state.
 * In many cases, selectors and latched state were introduced by extensions as OpenGL evolved to minimize the disruption to the OpenGL API when new
 * functionality, particularly the pluralization of existing functionality as when texture objects and later multiple texture units, was introduced.</p>
 * 
 * <p>The OpenGL API involves several selectors (listed in historical order of introduction):</p>
 * 
 * <ul>
 * <li>The matrix mode.</li>
 * <li>The current bound texture for each supported texture target.</li>
 * <li>The active texture.</li>
 * <li>The active client texture.</li>
 * <li>The current bound program for each supported program target.</li>
 * <li>The current bound buffer for each supported buffer target.</li>
 * <li>The current GLSL program.</li>
 * <li>The current framebuffer object.</li>
 * </ul>
 * 
 * <p>The new selector-free update commands can be compiled into display lists.</p>
 * 
 * <p>The OpenGL API has latched state for vertex array buffer objects and pixel store state. When an application issues a GL command to unpack or pack pixels
 * (for example, glTexImage2D or glReadPixels respectively), the current unpack and pack pixel store state determines how the pixels are unpacked
 * from/packed to client memory or pixel buffer objects. For example, consider:</p>
 * 
 * <pre><code>
 * glPixelStorei(GL_UNPACK_SWAP_BYTES, GL_TRUE);
 * glPixelStorei(GL_UNPACK_ROW_LENGTH, 640);
 * glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 47);
 * glDrawPixels(100, 100, GL_RGB, GL_FLOAT, pixels);</code></pre>
 * 
 * <p>The unpack swap bytes and row length state set by the preceding glPixelStorei commands (as well as the 6 other unpack pixel store state variables)
 * control how data is read (unpacked) from buffer of data pointed to by pixels. The glBindBuffer command also specifies an unpack buffer object (47) so
 * the pixel pointer is actually treated as a byte offset into buffer object 47.</p>
 * 
 * <p>When an application issues a command to configure a vertex array, the current array buffer state is latched as the binding for the particular vertex
 * array being specified. For example, consider:</p>
 * 
 * <pre><code>
 * glBindBuffer(GL_ARRAY_BUFFER, 23);
 * glVertexPointer(3, GL_FLOAT, 12, pointer);</code></pre>
 * 
 * <p>The glBindBuffer command updates the array buffering binding (GL_ARRAY_BUFFER_BINDING) to the buffer object named 23. The subsequent glVertexPointer
 * command specifies explicit parameters for the size, type, stride, and pointer to access the position vertex array BUT ALSO latches the current array
 * buffer binding for the vertex array buffer binding (GL_VERTEX_ARRAY_BUFFER_BINDING). Effectively the current array buffer binding buffer object becomes
 * an implicit fifth parameter to glVertexPointer and this applies to all the gl*Pointer vertex array specification commands.</p>
 * 
 * <p>Selectors and latched state create problems for layered libraries using OpenGL because selectors require the selector state to be modified to update
 * some other state and latched state means implicit state can affect the operation of commands specifying, packing, or unpacking data through
 * pointers/offsets. For layered libraries, a state update performed by the library may attempt to save the selector state, set the selector, update/query
 * some state the selector controls, and then restore the selector to its saved state. Layered libraries can skip the selector save/restore but this risks
 * introducing uncertainty about the state of a selector after calling layered library routines. Such selector side-effects are difficult to document and
 * lead to compatibility issues as the layered library evolves or its usage varies. For latched state, layered libraries may find commands such as
 * glDrawPixels do not work as expected because latched pixel store state is not what the library expects. Querying or pushing the latched state, setting
 * the latched state explicitly, performing the operation involving latched state, and then restoring or popping the latched state avoids entanglements
 * with latched state but at considerable cost.</p>
 * 
 * <h3>EXAMPLE USAGE OF THIS EXTENSION'S FUNCTIONALITY</h3>
 * 
 * <p>Consider the following routine to set the modelview matrix involving the matrix mode selector:</p>
 * 
 * <pre><code>
 * void setModelviewMatrix(const GLfloat matrix[16])
 * {
 *     GLenum savedMatrixMode;
 * 
 *     glGetIntegerv(GL_MATRIX_MODE, &amp;savedMatrixMode);
 *     glMatrixMode(GL_MODELVIEW);
 *     glLoadMatrixf(matrix);
 *     glMatrixMode(savedMatrixMode);
 * }</code></pre>
 * 
 * <p>Notice that four OpenGL commands are required to update the current modelview matrix without disturbing the matrix mode selector.</p>
 * 
 * <p>OpenGL query commands can also substantially reduce the performance of modern OpenGL implementations which may off-load OpenGL state processing to
 * another CPU core/thread or to the GPU itself.</p>
 * 
 * <p>An alternative to querying the selector is to use the glPushAttrib/glPopAttrib commands. However this approach typically involves pushing far more state
 * than simply the one or two selectors that need to be saved and restored. Because so much state is associated with a given push/pop attribute bit, the
 * glPushAttrib and glPopAttrib commands are considerably more costly than the save/restore approach. Additionally glPushAttrib risks overflowing the
 * attribute stack.</p>
 * 
 * <p>The reliability and performance of layered libraries and applications can be improved by adding to the OpenGL API a new set of commands to access
 * directly OpenGL state that otherwise involves selectors to access.</p>
 * 
 * <p>The above example can be reimplemented more efficiently and without selector side-effects:</p>
 * 
 * <pre><code>
 * void setModelviewMatrix(const GLfloat matrix[16])
 * {
 *     glMatrixLoadfEXT(GL_MODELVIEW, matrix);
 * }</code></pre>
 * 
 * <p>Consider a layered library seeking to load a texture:</p>
 * 
 * <pre><code>
 * void loadTexture(GLint texobj, GLint width, GLint height, void *data)
 * {
 *     glBindTexture(GL_TEXTURE_2D, texobj);
 *     glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
 * }</code></pre>
 * 
 * <p>The library expects the data to be packed into the buffer pointed to by data. But what if the current pixel unpack buffer binding is not zero so the
 * current pixel unpack buffer, rather than client memory, will be read? Or what if the application has modified the GL_UNPACK_ROW_LENGTH pixel store state
 * before loadTexture is called?</p>
 * 
 * <p>We can fix the routine by calling glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0) and setting all the pixel store unpack state to the initial state the
 * loadTexture routine expects, but this is expensive. It also risks disturbing the state so when loadTexture returns to the application, the application
 * doesn't realize the current texture object (for whatever texture unit the current active texture happens to be) and pixel store state has changed.</p>
 * 
 * <p>We can more efficiently implement this routine without disturbing selector or latched state as follows:</p>
 * 
 * <pre><code>
 * void loadTexture(GLint texobj, GLint width, GLint height, void *data)
 * {
 *     glPushClientAttribDefaultEXT(GL_CLIENT_PIXEL_STORE_BIT);
 *     glTextureImage2D(texobj, GL_TEXTURE_2D, 0, GL_RGB8, width, height, GL_RGB, GL_FLOAT, data);
 *     glPopClientAttrib();
 * }</code></pre>
 * 
 * <p>Now loadTexture does not have to worry about inappropriately configured pixel store state or a non-zero pixel unpack buffer binding. And loadTexture has
 * no unintended side-effects for selector or latched state (assuming the client attrib state does not overflow).</p>
 */
public class EXTDirectStateAccess {

    static { GL.initialize(); }

    /** GetBooleani_v, GetIntegeri_v, GetFloati_vEXT, GetDoublei_vEXT. */
    public static final int
        GL_PROGRAM_MATRIX_EXT             = 0x8E2D,
        GL_TRANSPOSE_PROGRAM_MATRIX_EXT   = 0x8E2E,
        GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;

    protected EXTDirectStateAccess() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClientAttribDefaultEXT ] ---

    public static native void glClientAttribDefaultEXT(@NativeType("GLbitfield") int mask);

    // --- [ glPushClientAttribDefaultEXT ] ---

    public static native void glPushClientAttribDefaultEXT(@NativeType("GLbitfield") int mask);

    // --- [ glMatrixLoadfEXT ] ---

    public static native void nglMatrixLoadfEXT(int matrixMode, long m);

    public static void glMatrixLoadfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadfEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoaddEXT ] ---

    public static native void nglMatrixLoaddEXT(int matrixMode, long m);

    public static void glMatrixLoaddEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoaddEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultfEXT ] ---

    public static native void nglMatrixMultfEXT(int matrixMode, long m);

    public static void glMatrixMultfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultfEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultdEXT ] ---

    public static native void nglMatrixMultdEXT(int matrixMode, long m);

    public static void glMatrixMultdEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultdEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadIdentityEXT ] ---

    public static native void glMatrixLoadIdentityEXT(@NativeType("GLenum") int matrixMode);

    // --- [ glMatrixRotatefEXT ] ---

    public static native void glMatrixRotatefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float angle, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glMatrixRotatedEXT ] ---

    public static native void glMatrixRotatedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double angle, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glMatrixScalefEXT ] ---

    public static native void glMatrixScalefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glMatrixScaledEXT ] ---

    public static native void glMatrixScaledEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glMatrixTranslatefEXT ] ---

    public static native void glMatrixTranslatefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glMatrixTranslatedEXT ] ---

    public static native void glMatrixTranslatedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glMatrixOrthoEXT ] ---

    public static native void glMatrixOrthoEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

    // --- [ glMatrixFrustumEXT ] ---

    public static native void glMatrixFrustumEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

    // --- [ glMatrixPushEXT ] ---

    public static native void glMatrixPushEXT(@NativeType("GLenum") int matrixMode);

    // --- [ glMatrixPopEXT ] ---

    public static native void glMatrixPopEXT(@NativeType("GLenum") int matrixMode);

    // --- [ glTextureParameteriEXT ] ---

    public static native void glTextureParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glTextureParameterivEXT ] ---

    public static native void nglTextureParameterivEXT(int texture, int target, int pname, long param);

    public static void glTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglTextureParameterivEXT(texture, target, pname, memAddress(param));
    }

    // --- [ glTextureParameterfEXT ] ---

    public static native void glTextureParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glTextureParameterfvEXT ] ---

    public static native void nglTextureParameterfvEXT(int texture, int target, int pname, long param);

    public static void glTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglTextureParameterfvEXT(texture, target, pname, memAddress(param));
    }

    // --- [ glTextureImage1DEXT ] ---

    public static native void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureImage2DEXT ] ---

    public static native void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureSubImage1DEXT ] ---

    public static native void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels);

    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage2DEXT ] ---

    public static native void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glCopyTextureImage1DEXT ] ---

    public static native void glCopyTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border);

    // --- [ glCopyTextureImage2DEXT ] ---

    public static native void glCopyTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border);

    // --- [ glCopyTextureSubImage1DEXT ] ---

    public static native void glCopyTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyTextureSubImage2DEXT ] ---

    public static native void glCopyTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetTextureImageEXT ] ---

    public static native void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels);

    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, pixels);
    }

    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    // --- [ glGetTextureParameterfvEXT ] ---

    public static native void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static float glGetTextureParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterivEXT ] ---

    public static native void nglGetTextureParameterivEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetTextureParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameterfvEXT ] ---

    public static native void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params);

    public static void glGetTextureLevelParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
    }

    @NativeType("void")
    public static float glGetTextureLevelParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameterivEXT ] ---

    public static native void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params);

    public static void glGetTextureLevelParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetTextureLevelParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureImage3DEXT ] ---

    public static native void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureSubImage3DEXT ] ---

    public static native void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTextureSubImage3DEXT ] ---

    public static native void glCopyTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glBindMultiTextureEXT ] ---

    public static native void glBindMultiTextureEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLuint") int texture);

    // --- [ glMultiTexCoordPointerEXT ] ---

    public static native void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer);

    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, pointer);
    }

    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    // --- [ glMultiTexEnvfEXT ] ---

    public static native void glMultiTexEnvfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glMultiTexEnvfvEXT ] ---

    public static native void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexEnviEXT ] ---

    public static native void glMultiTexEnviEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glMultiTexEnvivEXT ] ---

    public static native void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexGendEXT ] ---

    public static native void glMultiTexGendEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble") double param);

    // --- [ glMultiTexGendvEXT ] ---

    public static native void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params);

    public static void glMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glMultiTexGenfEXT ] ---

    public static native void glMultiTexGenfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glMultiTexGenfvEXT ] ---

    public static native void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params);

    public static void glMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glMultiTexGeniEXT ] ---

    public static native void glMultiTexGeniEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glMultiTexGenivEXT ] ---

    public static native void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params);

    public static void glMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glGetMultiTexEnvfvEXT ] ---

    public static native void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static float glGetMultiTexEnvfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexEnvivEXT ] ---

    public static native void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetMultiTexEnviEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGendvEXT ] ---

    public static native void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params);

    public static void glGetMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
    }

    @NativeType("void")
    public static double glGetMultiTexGendEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGenfvEXT ] ---

    public static native void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params);

    public static void glGetMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
    }

    @NativeType("void")
    public static float glGetMultiTexGenfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGenivEXT ] ---

    public static native void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params);

    public static void glGetMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetMultiTexGeniEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexParameteriEXT ] ---

    public static native void glMultiTexParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glMultiTexParameterivEXT ] ---

    public static native void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param);

    public static void glMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglMultiTexParameterivEXT(texunit, target, pname, memAddress(param));
    }

    // --- [ glMultiTexParameterfEXT ] ---

    public static native void glMultiTexParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glMultiTexParameterfvEXT ] ---

    public static native void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param);

    public static void glMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglMultiTexParameterfvEXT(texunit, target, pname, memAddress(param));
    }

    // --- [ glMultiTexImage1DEXT ] ---

    public static native void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexImage2DEXT ] ---

    public static native void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexSubImage1DEXT ] ---

    public static native void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels);

    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels);
    }

    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glMultiTexSubImage2DEXT ] ---

    public static native void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glCopyMultiTexImage1DEXT ] ---

    public static native void glCopyMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border);

    // --- [ glCopyMultiTexImage2DEXT ] ---

    public static native void glCopyMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border);

    // --- [ glCopyMultiTexSubImage1DEXT ] ---

    public static native void glCopyMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyMultiTexSubImage2DEXT ] ---

    public static native void glCopyMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetMultiTexImageEXT ] ---

    public static native void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels);

    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels);
    }

    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    // --- [ glGetMultiTexParameterfvEXT ] ---

    public static native void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static float glGetMultiTexParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexParameterivEXT ] ---

    public static native void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetMultiTexParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexLevelParameterfvEXT ] ---

    public static native void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params);

    public static void glGetMultiTexLevelParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
    }

    @NativeType("void")
    public static float glGetMultiTexLevelParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexLevelParameterivEXT ] ---

    public static native void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params);

    public static void glGetMultiTexLevelParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetMultiTexLevelParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexImage3DEXT ] ---

    public static native void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexSubImage3DEXT ] ---

    public static native void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyMultiTexSubImage3DEXT ] ---

    public static native void glCopyMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glEnableClientStateIndexedEXT ] ---

    public static native void glEnableClientStateIndexedEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glDisableClientStateIndexedEXT ] ---

    public static native void glDisableClientStateIndexedEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glEnableClientStateiEXT ] ---

    public static native void glEnableClientStateiEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glDisableClientStateiEXT ] ---

    public static native void glDisableClientStateiEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glGetFloatIndexedvEXT ] ---

    public static native void nglGetFloatIndexedvEXT(int target, int index, long params);

    public static void glGetFloatIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloatIndexedvEXT(target, index, memAddress(params));
    }

    @NativeType("void")
    public static float glGetFloatIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloatIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoubleIndexedvEXT ] ---

    public static native void nglGetDoubleIndexedvEXT(int target, int index, long params);

    public static void glGetDoubleIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoubleIndexedvEXT(target, index, memAddress(params));
    }

    @NativeType("void")
    public static double glGetDoubleIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoubleIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPointerIndexedvEXT ] ---

    public static native void nglGetPointerIndexedvEXT(int target, int index, long params);

    public static void glGetPointerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointerIndexedvEXT(target, index, memAddress(params));
    }

    @NativeType("void")
    public static long glGetPointerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointerIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFloati_vEXT ] ---

    public static native void nglGetFloati_vEXT(int pname, int index, long params);

    public static void glGetFloati_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloati_vEXT(pname, index, memAddress(params));
    }

    @NativeType("void")
    public static float glGetFloatiEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloati_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoublei_vEXT ] ---

    public static native void nglGetDoublei_vEXT(int pname, int index, long params);

    public static void glGetDoublei_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoublei_vEXT(pname, index, memAddress(params));
    }

    @NativeType("void")
    public static double glGetDoubleiEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoublei_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPointeri_vEXT ] ---

    public static native void nglGetPointeri_vEXT(int pname, int index, long params);

    public static void glGetPointeri_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointeri_vEXT(pname, index, memAddress(params));
    }

    @NativeType("void")
    public static long glGetPointeriEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointeri_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableIndexedEXT ] ---

    public static void glEnableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        EXTDrawBuffers2.glEnableIndexedEXT(target, index);
    }

    // --- [ glDisableIndexedEXT ] ---

    public static void glDisableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        EXTDrawBuffers2.glDisableIndexedEXT(target, index);
    }

    // --- [ glIsEnabledIndexedEXT ] ---

    @NativeType("GLboolean")
    public static boolean glIsEnabledIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glIsEnabledIndexedEXT(target, index);
    }

    // --- [ glGetIntegerIndexedvEXT ] ---

    public static void nglGetIntegerIndexedvEXT(int target, int index, long data) {
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(target, index, data);
    }

    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        EXTDrawBuffers2.glGetIntegerIndexedvEXT(target, index, data);
    }

    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glGetIntegerIndexedEXT(target, index);
    }

    // --- [ glGetBooleanIndexedvEXT ] ---

    public static void nglGetBooleanIndexedvEXT(int target, int index, long data) {
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(target, index, data);
    }

    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        EXTDrawBuffers2.glGetBooleanIndexedvEXT(target, index, data);
    }

    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glGetBooleanIndexedEXT(target, index);
    }

    // --- [ glNamedProgramStringEXT ] ---

    public static native void nglNamedProgramStringEXT(int program, int target, int format, int len, long string);

    public static void glNamedProgramStringEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer string) {
        nglNamedProgramStringEXT(program, target, format, string.remaining(), memAddress(string));
    }

    // --- [ glNamedProgramLocalParameter4dEXT ] ---

    public static native void glNamedProgramLocalParameter4dEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glNamedProgramLocalParameter4dvEXT ] ---

    public static native void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameter4dvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameter4dvEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameter4fEXT ] ---

    public static native void glNamedProgramLocalParameter4fEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glNamedProgramLocalParameter4fvEXT ] ---

    public static native void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameter4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameter4fvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterdvEXT ] ---

    public static native void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterdvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterdvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterfvEXT ] ---

    public static native void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterfvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterfvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramivEXT ] ---

    public static native void nglGetNamedProgramivEXT(int program, int target, int pname, long params);

    public static void glGetNamedProgramivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetNamedProgramiEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedProgramStringEXT ] ---

    public static native void nglGetNamedProgramStringEXT(int program, int target, int pname, long string);

    public static void glGetNamedProgramStringEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void *") ByteBuffer string) {
        if (CHECKS) {
            if (DEBUG) {
                check(string, glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB));
            }
        }
        nglGetNamedProgramStringEXT(program, target, pname, memAddress(string));
    }

    // --- [ glCompressedTextureImage3DEXT ] ---

    public static native void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    public static void glCompressedTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public static void glCompressedTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureImage2DEXT ] ---

    public static native void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    public static void glCompressedTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data);
    }

    public static void glCompressedTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureImage1DEXT ] ---

    public static native void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data);

    public static void glCompressedTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data);
    }

    public static void glCompressedTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureSubImage3DEXT ] ---

    public static native void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    public static void glCompressedTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage2DEXT ] ---

    public static native void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    public static void glCompressedTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage1DEXT ] ---

    public static native void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data);

    public static void glCompressedTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedTextureImageEXT ] ---

    public static native void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img);

    public static void glGetCompressedTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedTextureImageEXT(texture, target, level, memAddress(img));
    }

    public static void glGetCompressedTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long img) {
        nglGetCompressedTextureImageEXT(texture, target, level, img);
    }

    // --- [ glCompressedMultiTexImage3DEXT ] ---

    public static native void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    public static void glCompressedMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public static void glCompressedMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexImage2DEXT ] ---

    public static native void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    public static void glCompressedMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data);
    }

    public static void glCompressedMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexImage1DEXT ] ---

    public static native void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data);

    public static void glCompressedMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data);
    }

    public static void glCompressedMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexSubImage3DEXT ] ---

    public static native void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    public static void glCompressedMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCompressedMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedMultiTexSubImage2DEXT ] ---

    public static native void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    public static void glCompressedMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public static void glCompressedMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedMultiTexSubImage1DEXT ] ---

    public static native void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data);

    public static void glCompressedMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data);
    }

    public static void glCompressedMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedMultiTexImageEXT ] ---

    public static native void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img);

    public static void glGetCompressedMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedMultiTexImageEXT(texunit, target, level, memAddress(img));
    }

    public static void glGetCompressedMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long img) {
        nglGetCompressedMultiTexImageEXT(texunit, target, level, img);
    }

    // --- [ glMatrixLoadTransposefEXT ] ---

    public static native void nglMatrixLoadTransposefEXT(int matrixMode, long m);

    public static void glMatrixLoadTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadTransposefEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadTransposedEXT ] ---

    public static native void nglMatrixLoadTransposedEXT(int matrixMode, long m);

    public static void glMatrixLoadTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadTransposedEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTransposefEXT ] ---

    public static native void nglMatrixMultTransposefEXT(int matrixMode, long m);

    public static void glMatrixMultTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultTransposefEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTransposedEXT ] ---

    public static native void nglMatrixMultTransposedEXT(int matrixMode, long m);

    public static void glMatrixMultTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultTransposedEXT(matrixMode, memAddress(m));
    }

    // --- [ glNamedBufferDataEXT ] ---

    public static native void nglNamedBufferDataEXT(int buffer, long size, long data, int usage);

    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, size, NULL, usage);
    }

    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining(), memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glNamedBufferSubDataEXT ] ---

    public static native void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data);

    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMapNamedBufferEXT ] ---

    public static native long nglMapNamedBufferEXT(int buffer, int access);

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        return memByteBufferSafe(__result, glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE));
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        int length = glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapNamedBufferEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glUnmapNamedBufferEXT(@NativeType("GLuint") int buffer);

    // --- [ glGetNamedBufferParameterivEXT ] ---

    public static native void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params);

    public static void glGetNamedBufferParameterivEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetNamedBufferParameteriEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferSubDataEXT ] ---

    public static native void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data);

    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glProgramUniform1fEXT ] ---

    public static native void glProgramUniform1fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glProgramUniform2fEXT ] ---

    public static native void glProgramUniform2fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glProgramUniform3fEXT ] ---

    public static native void glProgramUniform3fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glProgramUniform4fEXT ] ---

    public static native void glProgramUniform4fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glProgramUniform1iEXT ] ---

    public static native void glProgramUniform1iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glProgramUniform2iEXT ] ---

    public static native void glProgramUniform2iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glProgramUniform3iEXT ] ---

    public static native void glProgramUniform3iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glProgramUniform4iEXT ] ---

    public static native void glProgramUniform4iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glProgramUniform1fvEXT ] ---

    public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fvEXT ] ---

    public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fvEXT ] ---

    public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fvEXT ] ---

    public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1ivEXT ] ---

    public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2ivEXT ] ---

    public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3ivEXT ] ---

    public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4ivEXT ] ---

    public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fvEXT ] ---

    public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fvEXT ] ---

    public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fvEXT ] ---

    public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fvEXT ] ---

    public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fvEXT ] ---

    public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fvEXT ] ---

    public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fvEXT ] ---

    public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fvEXT ] ---

    public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fvEXT ] ---

    public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glTextureBufferEXT ] ---

    public static native void glTextureBufferEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glMultiTexBufferEXT ] ---

    public static native void glMultiTexBufferEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTextureParameterIivEXT ] ---

    public static native void nglTextureParameterIivEXT(int texture, int target, int pname, long params);

    public static void glTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterIivEXT(texture, target, pname, memAddress(params));
    }

    // --- [ glTextureParameterIuivEXT ] ---

    public static native void nglTextureParameterIuivEXT(int texture, int target, int pname, long params);

    public static void glTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterIuivEXT(texture, target, pname, memAddress(params));
    }

    // --- [ glGetTextureParameterIivEXT ] ---

    public static native void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetTextureParameterIiEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIuivEXT ] ---

    public static native void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params);

    public static void glGetTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetTextureParameterIuiEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexParameterIivEXT ] ---

    public static native void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexParameterIuivEXT ] ---

    public static native void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params);

    public static void glMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glGetMultiTexParameterIivEXT ] ---

    public static native void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetMultiTexParameterIiEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexParameterIuivEXT ] ---

    public static native void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params);

    public static void glGetMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetMultiTexParameterIuiEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniform1uiEXT ] ---

    public static native void glProgramUniform1uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glProgramUniform2uiEXT ] ---

    public static native void glProgramUniform2uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glProgramUniform3uiEXT ] ---

    public static native void glProgramUniform3uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glProgramUniform4uiEXT ] ---

    public static native void glProgramUniform4uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glProgramUniform1uivEXT ] ---

    public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uivEXT ] ---

    public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uivEXT ] ---

    public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uivEXT ] ---

    public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glNamedProgramLocalParameters4fvEXT ] ---

    public static native void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params);

    public static void glNamedProgramLocalParameters4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglNamedProgramLocalParameters4fvEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameterI4iEXT ] ---

    public static native void glNamedProgramLocalParameterI4iEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glNamedProgramLocalParameterI4ivEXT ] ---

    public static native void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameterI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameterI4ivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParametersI4ivEXT ] ---

    public static native void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params);

    public static void glNamedProgramLocalParametersI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer params) {
        nglNamedProgramLocalParametersI4ivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameterI4uiEXT ] ---

    public static native void glNamedProgramLocalParameterI4uiEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w);

    // --- [ glNamedProgramLocalParameterI4uivEXT ] ---

    public static native void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params);

    public static void glNamedProgramLocalParameterI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameterI4uivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParametersI4uivEXT ] ---

    public static native void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params);

    public static void glNamedProgramLocalParametersI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer params) {
        nglNamedProgramLocalParametersI4uivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterIivEXT ] ---

    public static native void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterIivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterIivEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterIuivEXT ] ---

    public static native void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params);

    public static void glGetNamedProgramLocalParameterIuivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterIuivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedRenderbufferStorageEXT ] ---

    public static native void glNamedRenderbufferStorageEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetNamedRenderbufferParameterivEXT ] ---

    public static native void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params);

    public static void glGetNamedRenderbufferParameterivEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetNamedRenderbufferParameteriEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedRenderbufferStorageMultisampleEXT ] ---

    public static native void glNamedRenderbufferStorageMultisampleEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glNamedRenderbufferStorageMultisampleCoverageEXT ] ---

    public static native void glNamedRenderbufferStorageMultisampleCoverageEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCheckNamedFramebufferStatusEXT ] ---

    @NativeType("GLenum")
    public static native int glCheckNamedFramebufferStatusEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target);

    // --- [ glNamedFramebufferTexture1DEXT ] ---

    public static native void glNamedFramebufferTexture1DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTexture2DEXT ] ---

    public static native void glNamedFramebufferTexture2DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTexture3DEXT ] ---

    public static native void glNamedFramebufferTexture3DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset);

    // --- [ glNamedFramebufferRenderbufferEXT ] ---

    public static native void glNamedFramebufferRenderbufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glGetNamedFramebufferAttachmentParameterivEXT ] ---

    public static native void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params);

    public static void glGetNamedFramebufferAttachmentParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenerateTextureMipmapEXT ] ---

    public static native void glGenerateTextureMipmapEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target);

    // --- [ glGenerateMultiTexMipmapEXT ] ---

    public static native void glGenerateMultiTexMipmapEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target);

    // --- [ glFramebufferDrawBufferEXT ] ---

    public static native void glFramebufferDrawBufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int mode);

    // --- [ glFramebufferDrawBuffersEXT ] ---

    public static native void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs);

    public static void glFramebufferDrawBuffersEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        nglFramebufferDrawBuffersEXT(framebuffer, bufs.remaining(), memAddress(bufs));
    }

    // --- [ glFramebufferReadBufferEXT ] ---

    public static native void glFramebufferReadBufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int mode);

    // --- [ glGetFramebufferParameterivEXT ] ---

    public static native void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param);

    public static void glGetFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
    }

    @NativeType("void")
    public static int glGetFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedCopyBufferSubDataEXT ] ---

    public static native void glNamedCopyBufferSubDataEXT(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glNamedFramebufferTextureEXT ] ---

    public static native void glNamedFramebufferTextureEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTextureLayerEXT ] ---

    public static native void glNamedFramebufferTextureLayerEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glNamedFramebufferTextureFaceEXT ] ---

    public static native void glNamedFramebufferTextureFaceEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face);

    // --- [ glTextureRenderbufferEXT ] ---

    public static native void glTextureRenderbufferEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glMultiTexRenderbufferEXT ] ---

    public static native void glMultiTexRenderbufferEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glVertexArrayVertexOffsetEXT ] ---

    public static native void glVertexArrayVertexOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayColorOffsetEXT ] ---

    public static native void glVertexArrayColorOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayEdgeFlagOffsetEXT ] ---

    public static native void glVertexArrayEdgeFlagOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayIndexOffsetEXT ] ---

    public static native void glVertexArrayIndexOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayNormalOffsetEXT ] ---

    public static native void glVertexArrayNormalOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayTexCoordOffsetEXT ] ---

    public static native void glVertexArrayTexCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayMultiTexCoordOffsetEXT ] ---

    public static native void glVertexArrayMultiTexCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayFogCoordOffsetEXT ] ---

    public static native void glVertexArrayFogCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArraySecondaryColorOffsetEXT ] ---

    public static native void glVertexArraySecondaryColorOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayVertexAttribOffsetEXT ] ---

    public static native void glVertexArrayVertexAttribOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayVertexAttribIOffsetEXT ] ---

    public static native void glVertexArrayVertexAttribIOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glEnableVertexArrayEXT ] ---

    public static native void glEnableVertexArrayEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int array);

    // --- [ glDisableVertexArrayEXT ] ---

    public static native void glDisableVertexArrayEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int array);

    // --- [ glEnableVertexArrayAttribEXT ] ---

    public static native void glEnableVertexArrayAttribEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glDisableVertexArrayAttribEXT ] ---

    public static native void glDisableVertexArrayAttribEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glGetVertexArrayIntegervEXT ] ---

    public static native void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param);

    public static void glGetVertexArrayIntegervEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
    }

    @NativeType("void")
    public static int glGetVertexArrayIntegerEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayPointervEXT ] ---

    public static native void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param);

    public static void glGetVertexArrayPointervEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
    }

    @NativeType("void")
    public static long glGetVertexArrayPointerEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer param = stack.callocPointer(1);
            nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIntegeri_vEXT ] ---

    public static native void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param);

    public static void glGetVertexArrayIntegeri_vEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
    }

    @NativeType("void")
    public static int glGetVertexArrayIntegeriEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayPointeri_vEXT ] ---

    public static native void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param);

    public static void glGetVertexArrayPointeri_vEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
    }

    @NativeType("void")
    public static long glGetVertexArrayPointeriEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer param = stack.callocPointer(1);
            nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMapNamedBufferRangeEXT ] ---

    public static native long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access);

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedNamedBufferRangeEXT ] ---

    public static native void glFlushMappedNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    /** Array version of: {@link #glMatrixLoadfEXT MatrixLoadfEXT} */
    public static void glMatrixLoadfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadfEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixLoaddEXT MatrixLoaddEXT} */
    public static void glMatrixLoaddEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixLoaddEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMultfEXT MatrixMultfEXT} */
    public static void glMatrixMultfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultfEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMultdEXT MatrixMultdEXT} */
    public static void glMatrixMultdEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixMultdEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glTextureParameterivEXT TextureParameterivEXT} */
    public static void glTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        long __functionAddress = GL.getICD().glTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texture, target, pname, param, __functionAddress);
    }

    /** Array version of: {@link #glTextureParameterfvEXT TextureParameterfvEXT} */
    public static void glTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] param) {
        long __functionAddress = GL.getICD().glTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texture, target, pname, param, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage1DEXT TextureImage1DEXT} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage2DEXT TextureImage2DEXT} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage1DEXT TextureSubImage1DEXT} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage2DEXT TextureSubImage2DEXT} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureImageEXT GetTextureImageEXT} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureParameterfvEXT GetTextureParameterfvEXT} */
    public static void glGetTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureParameterivEXT GetTextureParameterivEXT} */
    public static void glGetTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureLevelParameterfvEXT GetTextureLevelParameterfvEXT} */
    public static void glGetTextureLevelParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, level, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureLevelParameterivEXT GetTextureLevelParameterivEXT} */
    public static void glGetTextureLevelParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, level, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureImage3DEXT TextureImage3DEXT} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTextureSubImage3DEXT TextureSubImage3DEXT} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoordPointerEXT MultiTexCoordPointerEXT} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexEnvfvEXT MultiTexEnvfvEXT} */
    public static void glMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexEnvivEXT MultiTexEnvivEXT} */
    public static void glMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexGendvEXT MultiTexGendvEXT} */
    public static void glMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexGenfvEXT MultiTexGenfvEXT} */
    public static void glMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexGenivEXT MultiTexGenivEXT} */
    public static void glMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexEnvfvEXT GetMultiTexEnvfvEXT} */
    public static void glGetMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexEnvivEXT GetMultiTexEnvivEXT} */
    public static void glGetMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexGendvEXT GetMultiTexGendvEXT} */
    public static void glGetMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexGenfvEXT GetMultiTexGenfvEXT} */
    public static void glGetMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexGenivEXT GetMultiTexGenivEXT} */
    public static void glGetMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexParameterivEXT MultiTexParameterivEXT} */
    public static void glMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        long __functionAddress = GL.getICD().glMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texunit, target, pname, param, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexParameterfvEXT MultiTexParameterfvEXT} */
    public static void glMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] param) {
        long __functionAddress = GL.getICD().glMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texunit, target, pname, param, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage1DEXT MultiTexImage1DEXT} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage2DEXT MultiTexImage2DEXT} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage1DEXT MultiTexSubImage1DEXT} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage2DEXT MultiTexSubImage2DEXT} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexImageEXT GetMultiTexImageEXT} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexParameterfvEXT GetMultiTexParameterfvEXT} */
    public static void glGetMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexParameterivEXT GetMultiTexParameterivEXT} */
    public static void glGetMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexLevelParameterfvEXT GetMultiTexLevelParameterfvEXT} */
    public static void glGetMultiTexLevelParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, level, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexLevelParameterivEXT GetMultiTexLevelParameterivEXT} */
    public static void glGetMultiTexLevelParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, level, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexImage3DEXT MultiTexImage3DEXT} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexSubImage3DEXT MultiTexSubImage3DEXT} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetFloatIndexedvEXT GetFloatIndexedvEXT} */
    public static void glGetFloatIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetFloatIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetDoubleIndexedvEXT GetDoubleIndexedvEXT} */
    public static void glGetDoubleIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetDoubleIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetFloati_vEXT GetFloati_vEXT} */
    public static void glGetFloati_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetFloati_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetDoublei_vEXT GetDoublei_vEXT} */
    public static void glGetDoublei_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetDoublei_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        EXTDrawBuffers2.glGetIntegerIndexedvEXT(target, index, data);
    }

    /** Array version of: {@link #glNamedProgramLocalParameter4dvEXT NamedProgramLocalParameter4dvEXT} */
    public static void glNamedProgramLocalParameter4dvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glNamedProgramLocalParameter4fvEXT NamedProgramLocalParameter4fvEXT} */
    public static void glNamedProgramLocalParameter4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterdvEXT GetNamedProgramLocalParameterdvEXT} */
    public static void glGetNamedProgramLocalParameterdvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterdvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterfvEXT GetNamedProgramLocalParameterfvEXT} */
    public static void glGetNamedProgramLocalParameterfvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedProgramivEXT GetNamedProgramivEXT} */
    public static void glGetNamedProgramivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMatrixLoadTransposefEXT MatrixLoadTransposefEXT} */
    public static void glMatrixLoadTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixLoadTransposedEXT MatrixLoadTransposedEXT} */
    public static void glMatrixLoadTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMultTransposefEXT MatrixMultTransposefEXT} */
    public static void glMatrixMultTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMultTransposedEXT MatrixMultTransposedEXT} */
    public static void glMatrixMultTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferDataEXT NamedBufferDataEXT} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glNamedBufferSubDataEXT NamedBufferSubDataEXT} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedBufferParameterivEXT GetNamedBufferParameterivEXT} */
    public static void glGetNamedBufferParameterivEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedBufferSubDataEXT GetNamedBufferSubDataEXT} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glTextureParameterIivEXT TextureParameterIivEXT} */
    public static void glTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glTextureParameterIuivEXT TextureParameterIuivEXT} */
    public static void glTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureParameterIivEXT GetTextureParameterIivEXT} */
    public static void glGetTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTextureParameterIuivEXT GetTextureParameterIuivEXT} */
    public static void glGetTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexParameterIivEXT MultiTexParameterIivEXT} */
    public static void glMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexParameterIuivEXT MultiTexParameterIuivEXT} */
    public static void glMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexParameterIivEXT GetMultiTexParameterIivEXT} */
    public static void glGetMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMultiTexParameterIuivEXT GetMultiTexParameterIuivEXT} */
    public static void glGetMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glNamedProgramLocalParameters4fvEXT NamedProgramLocalParameters4fvEXT} */
    public static void glNamedProgramLocalParameters4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params.length >> 2, params, __functionAddress);
    }

    /** Array version of: {@link #glNamedProgramLocalParameterI4ivEXT NamedProgramLocalParameterI4ivEXT} */
    public static void glNamedProgramLocalParameterI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glNamedProgramLocalParametersI4ivEXT NamedProgramLocalParametersI4ivEXT} */
    public static void glNamedProgramLocalParametersI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params.length >> 2, params, __functionAddress);
    }

    /** Array version of: {@link #glNamedProgramLocalParameterI4uivEXT NamedProgramLocalParameterI4uivEXT} */
    public static void glNamedProgramLocalParameterI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glNamedProgramLocalParametersI4uivEXT NamedProgramLocalParametersI4uivEXT} */
    public static void glNamedProgramLocalParametersI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params.length >> 2, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterIivEXT GetNamedProgramLocalParameterIivEXT} */
    public static void glGetNamedProgramLocalParameterIivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedProgramLocalParameterIuivEXT GetNamedProgramLocalParameterIuivEXT} */
    public static void glGetNamedProgramLocalParameterIuivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedRenderbufferParameterivEXT GetNamedRenderbufferParameterivEXT} */
    public static void glGetNamedRenderbufferParameterivEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(renderbuffer, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedFramebufferAttachmentParameterivEXT GetNamedFramebufferAttachmentParameterivEXT} */
    public static void glGetNamedFramebufferAttachmentParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, attachment, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glFramebufferDrawBuffersEXT FramebufferDrawBuffersEXT} */
    public static void glFramebufferDrawBuffersEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glFramebufferDrawBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, bufs.length, bufs, __functionAddress);
    }

    /** Array version of: {@link #glGetFramebufferParameterivEXT GetFramebufferParameterivEXT} */
    public static void glGetFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(framebuffer, pname, param, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexArrayIntegervEXT GetVertexArrayIntegervEXT} */
    public static void glGetVertexArrayIntegervEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegervEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexArrayIntegeri_vEXT GetVertexArrayIntegeri_vEXT} */
    public static void glGetVertexArrayIntegeri_vEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }

}