/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBVertexAttribBinding {

    static { GL.initialize(); }

    public static final int
        GL_VERTEX_ATTRIB_BINDING         = 0x82D4,
        GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;

    public static final int
        GL_VERTEX_BINDING_DIVISOR = 0x82D6,
        GL_VERTEX_BINDING_OFFSET  = 0x82D7,
        GL_VERTEX_BINDING_STRIDE  = 0x82D8,
        GL_VERTEX_BINDING_BUFFER  = 0x8F4F;

    public static final int
        GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9,
        GL_MAX_VERTEX_ATTRIB_BINDINGS        = 0x82DA;

    protected ARBVertexAttribBinding() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindVertexBuffer ] ---

    /** {@code void glBindVertexBuffer(GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        GL43C.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    // --- [ glVertexAttribFormat ] ---

    /** {@code void glVertexAttribFormat(GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        GL43C.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    // --- [ glVertexAttribIFormat ] ---

    /** {@code void glVertexAttribIFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL43C.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexAttribLFormat ] ---

    /** {@code void glVertexAttribLFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static void glVertexAttribLFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL43C.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexAttribBinding ] ---

    /** {@code void glVertexAttribBinding(GLuint attribindex, GLuint bindingindex)} */
    public static void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        GL43C.glVertexAttribBinding(attribindex, bindingindex);
    }

    // --- [ glVertexBindingDivisor ] ---

    /** {@code void glVertexBindingDivisor(GLuint bindingindex, GLuint divisor)} */
    public static void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        GL43C.glVertexBindingDivisor(bindingindex, divisor);
    }

    // --- [ glVertexArrayBindVertexBufferEXT ] ---

    /** {@code void glVertexArrayBindVertexBufferEXT(GLuint vaobj, GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static native void glVertexArrayBindVertexBufferEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

    // --- [ glVertexArrayVertexAttribFormatEXT ] ---

    /** {@code void glVertexArrayVertexAttribFormatEXT(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static native void glVertexArrayVertexAttribFormatEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayVertexAttribIFormatEXT ] ---

    /** {@code void glVertexArrayVertexAttribIFormatEXT(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexArrayVertexAttribIFormatEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayVertexAttribLFormatEXT ] ---

    /** {@code void glVertexArrayVertexAttribLFormatEXT(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexArrayVertexAttribLFormatEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayVertexAttribBindingEXT ] ---

    /** {@code void glVertexArrayVertexAttribBindingEXT(GLuint vaobj, GLuint attribindex, GLuint bindingindex)} */
    public static native void glVertexArrayVertexAttribBindingEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

    // --- [ glVertexArrayVertexBindingDivisorEXT ] ---

    /** {@code void glVertexArrayVertexBindingDivisorEXT(GLuint vaobj, GLuint bindingindex, GLuint divisor)} */
    public static native void glVertexArrayVertexBindingDivisorEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor);

}