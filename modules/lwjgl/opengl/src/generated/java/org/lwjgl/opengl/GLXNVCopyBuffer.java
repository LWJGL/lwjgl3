/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/GLX_NV_copy_buffer.txt">GLX_NV_copy_buffer</a> extension.
 * 
 * <p>Extends {@link ARBCopyBuffer ARB_copy_buffer} to have GLX bindings.</p>
 */
public class GLXNVCopyBuffer {

    protected GLXNVCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXCopyBufferSubDataNV ] ---

    /** @param display the connection to the X server */
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

    /** @param display the connection to the X server */
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