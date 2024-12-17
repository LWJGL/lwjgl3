/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBFramebufferObject {

    static { GL.initialize(); }

    public static final int
        GL_FRAMEBUFFER      = 0x8D40,
        GL_READ_FRAMEBUFFER = 0x8CA8,
        GL_DRAW_FRAMEBUFFER = 0x8CA9;

    public static final int GL_RENDERBUFFER = 0x8D41;

    public static final int
        GL_STENCIL_INDEX1  = 0x8D46,
        GL_STENCIL_INDEX4  = 0x8D47,
        GL_STENCIL_INDEX8  = 0x8D48,
        GL_STENCIL_INDEX16 = 0x8D49;

    public static final int
        GL_RENDERBUFFER_WIDTH           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55,
        GL_RENDERBUFFER_SAMPLES         = 0x8CAB;

    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4,
        GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210,
        GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211,
        GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212,
        GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213,
        GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214,
        GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215,
        GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216,
        GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;

    public static final int
        GL_UNSIGNED_NORMALIZED = 0x8C17,
        GL_FRAMEBUFFER_DEFAULT = 0x8218,
        GL_INDEX               = 0x8222;

    public static final int
        GL_COLOR_ATTACHMENT0        = 0x8CE0,
        GL_COLOR_ATTACHMENT1        = 0x8CE1,
        GL_COLOR_ATTACHMENT2        = 0x8CE2,
        GL_COLOR_ATTACHMENT3        = 0x8CE3,
        GL_COLOR_ATTACHMENT4        = 0x8CE4,
        GL_COLOR_ATTACHMENT5        = 0x8CE5,
        GL_COLOR_ATTACHMENT6        = 0x8CE6,
        GL_COLOR_ATTACHMENT7        = 0x8CE7,
        GL_COLOR_ATTACHMENT8        = 0x8CE8,
        GL_COLOR_ATTACHMENT9        = 0x8CE9,
        GL_COLOR_ATTACHMENT10       = 0x8CEA,
        GL_COLOR_ATTACHMENT11       = 0x8CEB,
        GL_COLOR_ATTACHMENT12       = 0x8CEC,
        GL_COLOR_ATTACHMENT13       = 0x8CED,
        GL_COLOR_ATTACHMENT14       = 0x8CEE,
        GL_COLOR_ATTACHMENT15       = 0x8CEF,
        GL_DEPTH_ATTACHMENT         = 0x8D00,
        GL_STENCIL_ATTACHMENT       = 0x8D20,
        GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

    public static final int GL_MAX_SAMPLES = 0x8D57;

    public static final int
        GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD,
        GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56,
        GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;

    public static final int
        GL_FRAMEBUFFER_BINDING      = 0x8CA6,
        GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING = 0x8CAA,
        GL_RENDERBUFFER_BINDING     = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    public static final int GL_DEPTH_STENCIL = 0x84F9;

    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

    protected ARBFramebufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glIsRenderbuffer ] ---

    /** {@code GLboolean glIsRenderbuffer(GLuint renderbuffer)} */
    @NativeType("GLboolean")
    public static boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        return GL30C.glIsRenderbuffer(renderbuffer);
    }

    // --- [ glBindRenderbuffer ] ---

    /** {@code void glBindRenderbuffer(GLenum target, GLuint renderbuffer)} */
    public static void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        GL30C.glBindRenderbuffer(target, renderbuffer);
    }

    // --- [ glDeleteRenderbuffers ] ---

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
        GL30C.nglDeleteRenderbuffers(n, renderbuffers);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        GL30C.glDeleteRenderbuffers(renderbuffer);
    }

    // --- [ glGenRenderbuffers ] ---

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void nglGenRenderbuffers(int n, long renderbuffers) {
        GL30C.nglGenRenderbuffers(n, renderbuffers);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    @NativeType("void")
    public static int glGenRenderbuffers() {
        return GL30C.glGenRenderbuffers();
    }

    // --- [ glRenderbufferStorage ] ---

    /** {@code void glRenderbufferStorage(GLenum target, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorage(target, internalformat, width, height);
    }

    // --- [ glRenderbufferStorageMultisample ] ---

    /** {@code void glRenderbufferStorageMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    // --- [ glGetRenderbufferParameteriv ] ---

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        GL30C.nglGetRenderbufferParameteriv(target, pname, params);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetRenderbufferParameteri(target, pname);
    }

    // --- [ glIsFramebuffer ] ---

    /** {@code GLboolean glIsFramebuffer(GLuint framebuffer)} */
    @NativeType("GLboolean")
    public static boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        return GL30C.glIsFramebuffer(framebuffer);
    }

    // --- [ glBindFramebuffer ] ---

    /** {@code void glBindFramebuffer(GLenum target, GLuint framebuffer)} */
    public static void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        GL30C.glBindFramebuffer(target, framebuffer);
    }

    // --- [ glDeleteFramebuffers ] ---

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void nglDeleteFramebuffers(int n, long framebuffers) {
        GL30C.nglDeleteFramebuffers(n, framebuffers);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        GL30C.glDeleteFramebuffers(framebuffer);
    }

    // --- [ glGenFramebuffers ] ---

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void nglGenFramebuffers(int n, long framebuffers) {
        GL30C.nglGenFramebuffers(n, framebuffers);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    @NativeType("void")
    public static int glGenFramebuffers() {
        return GL30C.glGenFramebuffers();
    }

    // --- [ glCheckFramebufferStatus ] ---

    /** {@code GLenum glCheckFramebufferStatus(GLenum target)} */
    @NativeType("GLenum")
    public static int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        return GL30C.glCheckFramebufferStatus(target);
    }

    // --- [ glFramebufferTexture1D ] ---

    /** {@code void glFramebufferTexture1D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture2D ] ---

    /** {@code void glFramebufferTexture2D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture3D ] ---

    /** {@code void glFramebufferTexture3D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint layer)} */
    public static void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    // --- [ glFramebufferTextureLayer ] ---

    /** {@code void glFramebufferTextureLayer(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    // --- [ glFramebufferRenderbuffer ] ---

    /** {@code void glFramebufferRenderbuffer(GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        GL30C.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    // --- [ glGetFramebufferAttachmentParameteriv ] ---

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        GL30C.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return GL30C.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    // --- [ glBlitFramebuffer ] ---

    /** {@code void glBlitFramebuffer(GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        GL30C.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    // --- [ glGenerateMipmap ] ---

    /** {@code void glGenerateMipmap(GLenum target)} */
    public static void glGenerateMipmap(@NativeType("GLenum") int target) {
        GL30C.glGenerateMipmap(target);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

}