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

public class EXTDiscardFramebuffer {

    static { GLES.initialize(); }

    public static final int
        GL_COLOR_EXT   = 0x1800,
        GL_DEPTH_EXT   = 0x1801,
        GL_STENCIL_EXT = 0x1802;

    protected EXTDiscardFramebuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDiscardFramebufferEXT ] ---

    /** {@code void glDiscardFramebufferEXT(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static native void nglDiscardFramebufferEXT(int target, int numAttachments, long attachments);

    /** {@code void glDiscardFramebufferEXT(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glDiscardFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        nglDiscardFramebufferEXT(target, attachments.remaining(), memAddress(attachments));
    }

    /** {@code void glDiscardFramebufferEXT(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glDiscardFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglDiscardFramebufferEXT(target, 1, memAddress(attachments));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glDiscardFramebufferEXT(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glDiscardFramebufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        long __functionAddress = GLES.getICD().glDiscardFramebufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachments.length, attachments, __functionAddress);
    }

}