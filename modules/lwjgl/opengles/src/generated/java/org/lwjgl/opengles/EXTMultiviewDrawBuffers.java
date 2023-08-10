/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_draw_buffers.txt">EXT_multiview_draw_buffers</a> extension.
 * 
 * <p>This extension allows selecting among draw buffers as the rendering target. This may be among multiple primary buffers pertaining to platform-specific
 * stereoscopic or multiview displays or among offscreen framebuffer object color attachments.</p>
 * 
 * <p>To remove any artificial limitations imposed on the number of possible buffers, draw buffers are identified not as individual enums, but as pairs of
 * values consisting of an enum representing buffer locations such as COLOR_ATTACHMENT_EXT or MULTIVIEW_EXT, and an integer representing an identifying
 * index of buffers of this location. These (location, index) pairs are used to specify draw buffer targets using a new DrawBuffersIndexedEXT call.</p>
 * 
 * <p>Rendering to buffers of location MULTIVIEW_EXT associated with the context allows rendering to multiview buffers created by EGL using
 * EGL_EXT_multiview_window for stereoscopic displays.</p>
 * 
 * <p>Rendering to COLOR_ATTACHMENT_EXT buffers allows implementations to increase the number of potential color attachments indefinitely to renderbuffers
 * and textures.</p>
 * 
 * <p>This extension allows the traditional quad buffer stereoscopic rendering method that has proven effective by indicating a left or right draw buffer and
 * rendering to each accordingly, but is also dynamic enough to handle an arbitrary number of color buffer targets all using the same shader. This grants
 * the user maximum flexibility as well as a familiar interface.</p>
 */
public class EXTMultiviewDrawBuffers {

    static { GLES.initialize(); }

    /** Accepted by the {@code location} parameter of DrawBuffersIndexedEXT. */
    public static final int
        GL_COLOR_ATTACHMENT_EXT = 0x90F0,
        GL_MULTIVIEW_EXT        = 0x90F1;

    /** Accepted by the {@code target} parameter of GetIntegeri_EXT. */
    public static final int
        GL_DRAW_BUFFER_EXT = 0xC01,
        GL_READ_BUFFER_EXT = 0xC02;

    /** Accepted by the {@code target} parameter of GetInteger. */
    public static final int GL_MAX_MULTIVIEW_BUFFERS_EXT = 0x90F2;

    protected EXTMultiviewDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReadBufferIndexedEXT ] ---

    public static native void glReadBufferIndexedEXT(@NativeType("GLenum") int src, @NativeType("GLint") int index);

    // --- [ glDrawBuffersIndexedEXT ] ---

    public static native void nglDrawBuffersIndexedEXT(int n, long location, long indices);

    public static void glDrawBuffersIndexedEXT(@NativeType("GLenum const *") IntBuffer location, @NativeType("GLint const *") IntBuffer indices) {
        if (CHECKS) {
            check(indices, location.remaining());
        }
        nglDrawBuffersIndexedEXT(location.remaining(), memAddress(location), memAddress(indices));
    }

    // --- [ glGetIntegeri_vEXT ] ---

    public static native void nglGetIntegeri_vEXT(int target, int index, long data);

    public static void glGetIntegeri_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegeri_vEXT(target, index, memAddress(data));
    }

    @NativeType("void")
    public static int glGetIntegeriEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegeri_vEXT(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glDrawBuffersIndexedEXT DrawBuffersIndexedEXT} */
    public static void glDrawBuffersIndexedEXT(@NativeType("GLenum const *") int[] location, @NativeType("GLint const *") int[] indices) {
        long __functionAddress = GLES.getICD().glDrawBuffersIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, location.length);
        }
        callPPV(location.length, location, indices, __functionAddress);
    }

    /** Array version of: {@link #glGetIntegeri_vEXT GetIntegeri_vEXT} */
    public static void glGetIntegeri_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GLES.getICD().glGetIntegeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}