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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_discard_framebuffer.txt">EXT_discard_framebuffer</a> extension.
 * 
 * <p>This extension provides a new command, DiscardFramebufferEXT, which causes the contents of the named framebuffer attachable images to become undefined.
 * The contents of the specified buffers are undefined until a subsequent operation modifies the content, and only the modified region is guaranteed to
 * hold valid content. Effective usage of this command may provide an implementation with new optimization opportunities.</p>
 * 
 * <p>Some OpenGL ES implementations cache framebuffer images in a small pool of fast memory. Before rendering, these implementations must load the existing
 * contents of one or more of the logical buffers (color, depth, stencil, etc.) into this memory. After rendering, some or all of these buffers are
 * likewise stored back to external memory so their contents can be used again in the future. In many applications, some or all of the logical buffers are
 * cleared at the start of rendering. If so, the effort to load or store those buffers is wasted.</p>
 * 
 * <p>Even without this extension, if a frame of rendering begins with a full- screen Clear, an OpenGL ES implementation may optimize away the loading of
 * framebuffer contents prior to rendering the frame. With this extension, an application can use DiscardFramebufferEXT to signal that framebuffer
 * contents will no longer be needed. In this case an OpenGL ES implementation may also optimize away the storing back of framebuffer contents after
 * rendering the frame.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}</p>
 */
public class EXTDiscardFramebuffer {

    static { GLES.initialize(); }

    /** Accepted in the {@code attachments} parameter of DiscardFramebufferEXT when the default framebuffer is bound to {@code target}. */
    public static final int
        GL_COLOR_EXT   = 0x1800,
        GL_DEPTH_EXT   = 0x1801,
        GL_STENCIL_EXT = 0x1802;

    protected EXTDiscardFramebuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDiscardFramebufferEXT ] ---

    public static native void nglDiscardFramebufferEXT(int target, int numAttachments, long attachments);

    public static void glDiscardFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        nglDiscardFramebufferEXT(target, attachments.remaining(), memAddress(attachments));
    }

    public static void glDiscardFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglDiscardFramebufferEXT(target, 1, memAddress(attachments));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glDiscardFramebufferEXT DiscardFramebufferEXT} */
    public static void glDiscardFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        long __functionAddress = GLES.getICD().glDiscardFramebufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachments.length, attachments, __functionAddress);
    }

}