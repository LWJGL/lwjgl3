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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/SGIX/GLX_SGIX_swap_group.txt">GLX_SGIX_swap_group</a> extension.
 * 
 * <p>This extension provides the capability to synchronize the buffer swaps of a group of GLX drawables.  A swap group is created, and drawables are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.</p>
 * 
 * <p>This extension extends the set of conditions that must be met before a buffer swap can take place.</p>
 */
public class GLXSGIXSwapGroup {

    protected GLXSGIXSwapGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXJoinSwapGroupSGIX ] ---

    /**
     * Adds {@code drawable} to the swap group containing {@code member} as a member. If {@code drawable} is already a member of a different group, it is
     * implicitly removed from that group first. If {@code member} is {@code None}, {@code drawable} is removed from the swap group that it belongs to, if
     * any.
     *
     * @param display  the connection to the X server
     * @param drawable the GLXDrawable to add to the swap group
     * @param member   a member of the swap group or {@code None}
     */
    public static void glXJoinSwapGroupSGIX(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLXDrawable") long member) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXJoinSwapGroupSGIX;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPPV(display, drawable, member, __functionAddress);
    }

}