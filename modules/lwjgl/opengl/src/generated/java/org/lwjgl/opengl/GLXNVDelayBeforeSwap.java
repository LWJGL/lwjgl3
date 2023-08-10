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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/GLX_NV_delay_before_swap.txt">GLX_NV_delay_before_swap</a> extension.
 * 
 * <p>For most interactive applications, the standard rendering loop responding to input events on a frame granularity is sufficient. Some more demanding
 * applications may want to exchange performance for the ability to sample input closer to the final frame swap and adjust rendering accordingly. This
 * extension adds functionality to allow the application to wait until a specified time before a swapbuffers command would be able to execute.</p>
 * 
 * <p>Requires {@link GLX11 GLX11} and {@link GLXEXTSwapControl GLX_EXT_swap_control}.</p>
 */
public class GLXNVDelayBeforeSwap {

    protected GLXNVDelayBeforeSwap() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXDelayBeforeSwapNV ] ---

    /**
     * Blocks the CPU until {@code seconds} seconds before a synchronized swap would occur on a particular GLX window drawable. It also returns a boolean value
     * equal to {@code True} when the implementation had to wait for the synchronized swap and {@code False} otherwise.
     * 
     * <p>The parameter {@code seconds} accepts positive floating point values not larger than the length in seconds of the swap period on the associated
     * drawable. When buffer swaps are synchronized, the swap period is composed of one or multiple video frame periods. A video frame period is the time
     * required by the monitor to display a full frame of video data. A swap interval set to a value of 2 means that the color buffers will be swapped at most
     * every other video frame. If {@code seconds} is smaller than 0, {@code DelayBeforeSwapNV} will return False and will not wait for the end of the swap
     * period. If {@code seconds} is greater than a swap period, {@code DelayBeforeSwapNV} will return immediately without generating any error and the return
     * value will be False.</p>
     * 
     * <p>The application should use a {@code seconds} delay large enough to have time to complete its work before the end of the swap period. If {@code seconds}
     * is close to 0.0, the application may miss the end of the swap period and it will have to wait an additional swap period before it can swap.</p>
     * 
     * <p>If {@code DelayBeforeSwapNV} detects that there is less than {@code seconds} seconds before the end of the swap period, it will return immediately and
     * the return value will be False. The implementation will not wait an additional video frame period to have an exact delay of {@code seconds} seconds.</p>
     * 
     * <p>If buffer swaps are unsynchronized, {@code DelayBeforeSwapNV} will return immediately and the return value will be False. It could happen for multiple
     * reasons, for example if the swap interval is equal to 0, if the window is in a mode switch or if no monitors are active.</p>
     *
     * @param display  the connection to the X server
     * @param drawable the window drawable
     * @param seconds  the delay, in seconds
     */
    @NativeType("Bool")
    public static boolean glXDelayBeforeSwapNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLfloat") float seconds) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDelayBeforeSwapNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        return callPPI(display, drawable, seconds, __functionAddress) != 0;
    }

}