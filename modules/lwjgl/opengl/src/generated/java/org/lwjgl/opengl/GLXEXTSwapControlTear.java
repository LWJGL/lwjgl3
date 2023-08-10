/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extension.
 * 
 * <p>This extension extends the existing GLX_EXT_swap_control extension by allowing a negative {@code interval} parameter to
 * {@link GLXEXTSwapControl#glXSwapIntervalEXT SwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
 * reduces the visual stutter on late frames and reduces the stall on subsequent frames.</p>
 * 
 * <p>Requires {@link GLXEXTSwapControl GLX_EXT_swap_control}.</p>
 */
public final class GLXEXTSwapControlTear {

    /** Accepted by {@link GLX13#glXQueryDrawable QueryDrawable}. */
    public static final int GLX_LATE_SWAPS_TEAR_EXT = 0x20F3;

    private GLXEXTSwapControlTear() {}

}