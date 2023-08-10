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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_swap_control.txt">WGL_EXT_swap_control</a> extension.
 * 
 * <p>This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods.</p>
 * 
 * <p>Requires {@link WGLEXTExtensionsString WGL_EXT_extensions_string}.</p>
 */
public class WGLEXTSwapControl {

    protected WGLEXTSwapControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglSwapIntervalEXT ] ---

    /**
     * Specifies the minimum number of video frame periods per buffer swap for the window associated with the current context. The interval takes effect when
     * {@link org.lwjgl.system.windows.GDI32#SwapBuffers} or wglSwapLayerBuffer is first called subsequent to the {@code wglSwapIntervalEXT} call.
     * 
     * <p>A video frame period is the time required by the monitor to display a full frame of video data.  In the case of an interlaced monitor, this is typically
     * the time required to display both the even and odd fields of a frame of video data.  An interval set to a value of 2 means that the color buffers will
     * be swapped at most every other video frame.</p>
     * 
     * <p>If {@code interval} is set to a value of 0, buffer swaps are not synchronized to a video frame.  The {@code interval} value is silently clamped to the
     * maximum implementation-dependent value supported before being stored.</p>
     * 
     * <p>The swap interval is not part of the render context state. It cannot be pushed or popped. The default swap interval is 1.</p>
     *
     * @param interval the minimum number of video frames that are displayed before a buffer swap will occur
     */
    @NativeType("BOOL")
    public static boolean wglSwapIntervalEXT(int interval) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSwapIntervalEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(interval, __functionAddress) != 0;
    }

    // --- [ wglGetSwapIntervalEXT ] ---

    /** Returns the current swap interval for the window associated with the current context. */
    public static int wglGetSwapIntervalEXT() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetSwapIntervalEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}