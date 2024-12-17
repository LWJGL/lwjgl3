/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class GLXNVCopyBuffer {

    protected GLXNVCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXCopyBufferSubDataNV ] ---

    /** {@code void glXCopyBufferSubDataNV(Display * display, GLXContext readCtx, GLXContext writeCtx, GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static void glXCopyBufferSubDataNV(@NativeType("Display *") long display, @NativeType("GLXContext") long readCtx, @NativeType("GLXContext") long writeCtx, @NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCopyBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(readCtx);
            check(writeCtx);
        }
        callPPPPPPV(display, readCtx, writeCtx, readTarget, writeTarget, readOffset, writeOffset, size, __functionAddress);
    }

    // --- [ glXNamedCopyBufferSubDataNV ] ---

    /** {@code void glXNamedCopyBufferSubDataNV(Display * display, GLXContext readCtx, GLXContext writeCtx, GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static void glXNamedCopyBufferSubDataNV(@NativeType("Display *") long display, @NativeType("GLXContext") long readCtx, @NativeType("GLXContext") long writeCtx, @NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXNamedCopyBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(readCtx);
            check(writeCtx);
        }
        callPPPPPPV(display, readCtx, writeCtx, readBuffer, writeBuffer, readOffset, writeOffset, size, __functionAddress);
    }

}