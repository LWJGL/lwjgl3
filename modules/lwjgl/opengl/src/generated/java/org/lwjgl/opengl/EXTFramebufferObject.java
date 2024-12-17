/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTFramebufferObject {

    static { GL.initialize(); }

    public static final int GL_FRAMEBUFFER_EXT = 0x8D40;

    public static final int GL_RENDERBUFFER_EXT = 0x8D41;

    public static final int
        GL_STENCIL_INDEX1_EXT  = 0x8D46,
        GL_STENCIL_INDEX4_EXT  = 0x8D47,
        GL_STENCIL_INDEX8_EXT  = 0x8D48,
        GL_STENCIL_INDEX16_EXT = 0x8D49;

    public static final int
        GL_RENDERBUFFER_WIDTH_EXT           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT_EXT          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE_EXT        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE_EXT      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE_EXT       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE_EXT      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE_EXT      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE_EXT    = 0x8D55;

    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT    = 0x8CD4;

    public static final int
        GL_COLOR_ATTACHMENT0_EXT  = 0x8CE0,
        GL_COLOR_ATTACHMENT1_EXT  = 0x8CE1,
        GL_COLOR_ATTACHMENT2_EXT  = 0x8CE2,
        GL_COLOR_ATTACHMENT3_EXT  = 0x8CE3,
        GL_COLOR_ATTACHMENT4_EXT  = 0x8CE4,
        GL_COLOR_ATTACHMENT5_EXT  = 0x8CE5,
        GL_COLOR_ATTACHMENT6_EXT  = 0x8CE6,
        GL_COLOR_ATTACHMENT7_EXT  = 0x8CE7,
        GL_COLOR_ATTACHMENT8_EXT  = 0x8CE8,
        GL_COLOR_ATTACHMENT9_EXT  = 0x8CE9,
        GL_COLOR_ATTACHMENT10_EXT = 0x8CEA,
        GL_COLOR_ATTACHMENT11_EXT = 0x8CEB,
        GL_COLOR_ATTACHMENT12_EXT = 0x8CEC,
        GL_COLOR_ATTACHMENT13_EXT = 0x8CED,
        GL_COLOR_ATTACHMENT14_EXT = 0x8CEE,
        GL_COLOR_ATTACHMENT15_EXT = 0x8CEF,
        GL_DEPTH_ATTACHMENT_EXT   = 0x8D00,
        GL_STENCIL_ATTACHMENT_EXT = 0x8D20;

    public static final int
        GL_FRAMEBUFFER_COMPLETE_EXT                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT         = 0x8CD9,
        GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT            = 0x8CDA,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED_EXT                   = 0x8CDD;

    public static final int
        GL_FRAMEBUFFER_BINDING_EXT   = 0x8CA6,
        GL_RENDERBUFFER_BINDING_EXT  = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE_EXT = 0x84E8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 0x506;

    protected EXTFramebufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glIsRenderbufferEXT ] ---

    /** {@code GLboolean glIsRenderbufferEXT(GLuint renderbuffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsRenderbufferEXT(@NativeType("GLuint") int renderbuffer);

    // --- [ glBindRenderbufferEXT ] ---

    /** {@code void glBindRenderbufferEXT(GLenum target, GLuint renderbuffer)} */
    public static native void glBindRenderbufferEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glDeleteRenderbuffersEXT ] ---

    /** {@code void glDeleteRenderbuffersEXT(GLsizei n, GLuint const * renderbuffers)} */
    public static native void nglDeleteRenderbuffersEXT(int n, long renderbuffers);

    /** {@code void glDeleteRenderbuffersEXT(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffersEXT(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        nglDeleteRenderbuffersEXT(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /** {@code void glDeleteRenderbuffersEXT(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffersEXT(@NativeType("GLuint const *") int renderbuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.ints(renderbuffer);
            nglDeleteRenderbuffersEXT(1, memAddress(renderbuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenRenderbuffersEXT ] ---

    /** {@code void glGenRenderbuffersEXT(GLsizei n, GLuint * renderbuffers)} */
    public static native void nglGenRenderbuffersEXT(int n, long renderbuffers);

    /** {@code void glGenRenderbuffersEXT(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffersEXT(@NativeType("GLuint *") IntBuffer renderbuffers) {
        nglGenRenderbuffersEXT(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /** {@code void glGenRenderbuffersEXT(GLsizei n, GLuint * renderbuffers)} */
    @NativeType("void")
    public static int glGenRenderbuffersEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.callocInt(1);
            nglGenRenderbuffersEXT(1, memAddress(renderbuffers));
            return renderbuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glRenderbufferStorageEXT ] ---

    /** {@code void glRenderbufferStorageEXT(GLenum target, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetRenderbufferParameterivEXT ] ---

    /** {@code void glGetRenderbufferParameterivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetRenderbufferParameterivEXT(int target, int pname, long params);

    /** {@code void glGetRenderbufferParameterivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetRenderbufferParameterivEXT(target, pname, memAddress(params));
    }

    /** {@code void glGetRenderbufferParameterivEXT(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetRenderbufferParameteriEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetRenderbufferParameterivEXT(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsFramebufferEXT ] ---

    /** {@code GLboolean glIsFramebufferEXT(GLuint framebuffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsFramebufferEXT(@NativeType("GLuint") int framebuffer);

    // --- [ glBindFramebufferEXT ] ---

    /** {@code void glBindFramebufferEXT(GLenum target, GLuint framebuffer)} */
    public static native void glBindFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer);

    // --- [ glDeleteFramebuffersEXT ] ---

    /** {@code void glDeleteFramebuffersEXT(GLsizei n, GLuint const * framebuffers)} */
    public static native void nglDeleteFramebuffersEXT(int n, long framebuffers);

    /** {@code void glDeleteFramebuffersEXT(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffersEXT(@NativeType("GLuint const *") IntBuffer framebuffers) {
        nglDeleteFramebuffersEXT(framebuffers.remaining(), memAddress(framebuffers));
    }

    /** {@code void glDeleteFramebuffersEXT(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffersEXT(@NativeType("GLuint const *") int framebuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.ints(framebuffer);
            nglDeleteFramebuffersEXT(1, memAddress(framebuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenFramebuffersEXT ] ---

    /** {@code void glGenFramebuffersEXT(GLsizei n, GLuint * framebuffers)} */
    public static native void nglGenFramebuffersEXT(int n, long framebuffers);

    /** {@code void glGenFramebuffersEXT(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffersEXT(@NativeType("GLuint *") IntBuffer framebuffers) {
        nglGenFramebuffersEXT(framebuffers.remaining(), memAddress(framebuffers));
    }

    /** {@code void glGenFramebuffersEXT(GLsizei n, GLuint * framebuffers)} */
    @NativeType("void")
    public static int glGenFramebuffersEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.callocInt(1);
            nglGenFramebuffersEXT(1, memAddress(framebuffers));
            return framebuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCheckFramebufferStatusEXT ] ---

    /** {@code GLenum glCheckFramebufferStatusEXT(GLenum target)} */
    @NativeType("GLenum")
    public static native int glCheckFramebufferStatusEXT(@NativeType("GLenum") int target);

    // --- [ glFramebufferTexture1DEXT ] ---

    /** {@code void glFramebufferTexture1DEXT(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture1DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture2DEXT ] ---

    /** {@code void glFramebufferTexture2DEXT(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture2DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture3DEXT ] ---

    /** {@code void glFramebufferTexture3DEXT(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint zoffset)} */
    public static native void glFramebufferTexture3DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset);

    // --- [ glFramebufferRenderbufferEXT ] ---

    /** {@code void glFramebufferRenderbufferEXT(GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static native void glFramebufferRenderbufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glGetFramebufferAttachmentParameterivEXT ] ---

    /** {@code void glGetFramebufferAttachmentParameterivEXT(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static native void nglGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, long params);

    /** {@code void glGetFramebufferAttachmentParameterivEXT(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, memAddress(params));
    }

    /** {@code void glGetFramebufferAttachmentParameterivEXT(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteriEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenerateMipmapEXT ] ---

    /** {@code void glGenerateMipmapEXT(GLenum target)} */
    public static native void glGenerateMipmapEXT(@NativeType("GLenum") int target);

    /** {@code void glDeleteRenderbuffersEXT(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffersEXT(@NativeType("GLuint const *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glDeleteRenderbuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glGenRenderbuffersEXT(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffersEXT(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glGenRenderbuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glGetRenderbufferParameterivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glDeleteFramebuffersEXT(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffersEXT(@NativeType("GLuint const *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glDeleteFramebuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glGenFramebuffersEXT(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffersEXT(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glGenFramebuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glGetFramebufferAttachmentParameterivEXT(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }

}