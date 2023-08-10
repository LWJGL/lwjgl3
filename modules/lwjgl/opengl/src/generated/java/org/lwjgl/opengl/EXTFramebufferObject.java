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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_object.txt">EXT_framebuffer_object</a> extension.
 * 
 * <p>This extension defines a simple interface for drawing to rendering destinations other than the buffers provided to the GL by the window-system.</p>
 * 
 * <p>In this extension, these newly defined rendering destinations are known collectively as "framebuffer-attachable images". This extension provides a
 * mechanism for attaching framebuffer-attachable images to the GL framebuffer as one of the standard GL logical buffers: color, depth, and stencil.
 * (Attaching a framebuffer-attachable image to the accum logical buffer is left for a future extension to define). When a framebuffer-attachable image is
 * attached to the framebuffer, it is used as the source and destination of fragment operations.</p>
 * 
 * <p>By allowing the use of a framebuffer-attachable image as a rendering destination, this extension enables a form of "offscreen" rendering. Furthermore,
 * "render to texture" is supported by allowing the images of a texture to be used as framebuffer-attachable images. A particular image of a texture object
 * is selected for use as a framebuffer-attachable image by specifying the mipmap level, cube map face (for a cube map texture), and z-offset (for a 3D
 * texture) that identifies the image. The "render to texture" semantics of this extension are similar to performing traditional rendering to the
 * framebuffer, followed immediately by a call to CopyTexSubImage. However, by using this extension instead, an application can achieve the same effect,
 * but with the advantage that the GL can usually eliminate the data copy that would have been incurred by calling CopyTexSubImage.</p>
 * 
 * <p>This extension also defines a new GL object type, called a "renderbuffer", which encapsulates a single 2D pixel image. The image of renderbuffer can be
 * used as a framebuffer-attachable image for generalized offscreen rendering and it also provides a means to support rendering to GL logical buffer types
 * which have no corresponding texture format (stencil, accum, etc). A renderbuffer is similar to a texture in that both renderbuffers and textures can be
 * independently allocated and shared among multiple contexts. The framework defined by this extension is general enough that support for attaching images
 * from GL objects other than textures and renderbuffers could be added by layered extensions.</p>
 * 
 * <p>To facilitate efficient switching between collections of framebuffer-attachable images, this extension introduces another new GL object, called a
 * framebuffer object. A framebuffer object contains the state that defines the traditional GL framebuffer, including its set of images. Prior to this
 * extension, it was the window-system which defined and managed this collection of images, traditionally by grouping them into a "drawable". The
 * window-system API's would also provide a function (i.e., wglMakeCurrent, glXMakeCurrent, aglSetDrawable, etc.) to bind a drawable with a GL context (as
 * is done in the WGL_ARB_pbuffer extension). In this extension however, this functionality is subsumed by the GL and the GL provides the function
 * BindFramebufferEXT to bind a framebuffer object to the current context. Later, the context can bind back to the window-system-provided framebuffer in
 * order to display rendered content.</p>
 * 
 * <p>Previous extensions that enabled rendering to a texture have been much more complicated. One example is the combination of ARB_pbuffer and
 * ARB_render_texture, both of which are window-system extensions. This combination requires calling MakeCurrent, an operation that may be expensive, to
 * switch between the window and the pbuffer drawables. An application must create one pbuffer per renderable texture in order to portably use
 * ARB_render_texture. An application must maintain at least one GL context per texture format, because each context can only operate on a single
 * pixelformat or FBConfig. All of these characteristics make ARB_render_texture both inefficient and cumbersome to use.</p>
 * 
 * <p>EXT_framebuffer_object, on the other hand, is both simpler to use and more efficient than ARB_render_texture. The EXT_framebuffer_object API is
 * contained wholly within the GL API and has no (non-portable) window-system components. Under EXT_framebuffer_object, it is not necessary to create a
 * second GL context when rendering to a texture image whose format differs from that of the window. Finally, unlike the pbuffers of ARB_render_texture, a
 * single framebuffer object can facilitate rendering to an unlimited number of texture objects.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class EXTFramebufferObject {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
     * and GetFramebufferAttachmentParameterivEXT.
     */
    public static final int GL_FRAMEBUFFER_EXT = 0x8D40;

    /**
     * Accepted by the {@code target} parameter of BindRenderbufferEXT, RenderbufferStorageEXT, and GetRenderbufferParameterivEXT, and returned by
     * GetFramebufferAttachmentParameterivEXT.
     */
    public static final int GL_RENDERBUFFER_EXT = 0x8D41;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorageEXT. */
    public static final int
        GL_STENCIL_INDEX1_EXT  = 0x8D46,
        GL_STENCIL_INDEX4_EXT  = 0x8D47,
        GL_STENCIL_INDEX8_EXT  = 0x8D48,
        GL_STENCIL_INDEX16_EXT = 0x8D49;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT. */
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

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameterivEXT. */
    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT    = 0x8CD4;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT, and GetFramebufferAttachmentParameterivEXT. */
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

    /** Returned by CheckFramebufferStatusEXT(). */
    public static final int
        GL_FRAMEBUFFER_COMPLETE_EXT                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT         = 0x8CD9,
        GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT            = 0x8CDA,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED_EXT                   = 0x8CDD;

    /** Accepted by GetIntegerv(). */
    public static final int
        GL_FRAMEBUFFER_BINDING_EXT   = 0x8CA6,
        GL_RENDERBUFFER_BINDING_EXT  = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE_EXT = 0x84E8;

    /** Returned by GetError(). */
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 0x506;

    protected EXTFramebufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glIsRenderbufferEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glIsRenderbufferEXT(@NativeType("GLuint") int renderbuffer);

    // --- [ glBindRenderbufferEXT ] ---

    public static native void glBindRenderbufferEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glDeleteRenderbuffersEXT ] ---

    public static native void nglDeleteRenderbuffersEXT(int n, long renderbuffers);

    public static void glDeleteRenderbuffersEXT(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        nglDeleteRenderbuffersEXT(renderbuffers.remaining(), memAddress(renderbuffers));
    }

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

    public static native void nglGenRenderbuffersEXT(int n, long renderbuffers);

    public static void glGenRenderbuffersEXT(@NativeType("GLuint *") IntBuffer renderbuffers) {
        nglGenRenderbuffersEXT(renderbuffers.remaining(), memAddress(renderbuffers));
    }

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

    public static native void glRenderbufferStorageEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetRenderbufferParameterivEXT ] ---

    public static native void nglGetRenderbufferParameterivEXT(int target, int pname, long params);

    public static void glGetRenderbufferParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetRenderbufferParameterivEXT(target, pname, memAddress(params));
    }

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

    @NativeType("GLboolean")
    public static native boolean glIsFramebufferEXT(@NativeType("GLuint") int framebuffer);

    // --- [ glBindFramebufferEXT ] ---

    public static native void glBindFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer);

    // --- [ glDeleteFramebuffersEXT ] ---

    public static native void nglDeleteFramebuffersEXT(int n, long framebuffers);

    public static void glDeleteFramebuffersEXT(@NativeType("GLuint const *") IntBuffer framebuffers) {
        nglDeleteFramebuffersEXT(framebuffers.remaining(), memAddress(framebuffers));
    }

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

    public static native void nglGenFramebuffersEXT(int n, long framebuffers);

    public static void glGenFramebuffersEXT(@NativeType("GLuint *") IntBuffer framebuffers) {
        nglGenFramebuffersEXT(framebuffers.remaining(), memAddress(framebuffers));
    }

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

    @NativeType("GLenum")
    public static native int glCheckFramebufferStatusEXT(@NativeType("GLenum") int target);

    // --- [ glFramebufferTexture1DEXT ] ---

    public static native void glFramebufferTexture1DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture2DEXT ] ---

    public static native void glFramebufferTexture2DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture3DEXT ] ---

    public static native void glFramebufferTexture3DEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset);

    // --- [ glFramebufferRenderbufferEXT ] ---

    public static native void glFramebufferRenderbufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glGetFramebufferAttachmentParameterivEXT ] ---

    public static native void nglGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, long params);

    public static void glGetFramebufferAttachmentParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, memAddress(params));
    }

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

    public static native void glGenerateMipmapEXT(@NativeType("GLenum") int target);

    /** Array version of: {@link #glDeleteRenderbuffersEXT DeleteRenderbuffersEXT} */
    public static void glDeleteRenderbuffersEXT(@NativeType("GLuint const *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glDeleteRenderbuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** Array version of: {@link #glGenRenderbuffersEXT GenRenderbuffersEXT} */
    public static void glGenRenderbuffersEXT(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glGenRenderbuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** Array version of: {@link #glGetRenderbufferParameterivEXT GetRenderbufferParameterivEXT} */
    public static void glGetRenderbufferParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glDeleteFramebuffersEXT DeleteFramebuffersEXT} */
    public static void glDeleteFramebuffersEXT(@NativeType("GLuint const *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glDeleteFramebuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** Array version of: {@link #glGenFramebuffersEXT GenFramebuffersEXT} */
    public static void glGenFramebuffersEXT(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glGenFramebuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** Array version of: {@link #glGetFramebufferAttachmentParameterivEXT GetFramebufferAttachmentParameterivEXT} */
    public static void glGetFramebufferAttachmentParameterivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }

}