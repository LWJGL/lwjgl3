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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/GLX_NV_swap_group.txt">GLX_NV_swap_group</a> extension.
 * 
 * <p>This extension provides the capability to synchronize the buffer swaps of a group of OpenGL windows. A swap group is created, and windows are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.</p>
 * 
 * <p>This extension also provides the capability to sychronize the buffer swaps of different swap groups, which may reside on distributed systems on a
 * network. For this purpose swap groups can be bound to a swap barrier.</p>
 * 
 * <p>This extension extends the set of conditions that must be met before a buffer swap can take place.</p>
 */
public class GLXNVSwapGroup {

    protected GLXNVSwapGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXJoinSwapGroupNV ] ---

    /** @param display the connection to the X server */
    @NativeType("Bool")
    public static boolean glXJoinSwapGroupNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLuint") int group) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXJoinSwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        return callPPI(display, drawable, group, __functionAddress) != 0;
    }

    // --- [ glXBindSwapBarrierNV ] ---

    /** @param display the connection to the X server */
    @NativeType("Bool")
    public static boolean glXBindSwapBarrierNV(@NativeType("Display *") long display, @NativeType("GLuint") int group, @NativeType("GLuint") int barrier) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBindSwapBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPI(display, group, barrier, __functionAddress) != 0;
    }

    // --- [ glXQuerySwapGroupNV ] ---

    /** Unsafe version of: {@link #glXQuerySwapGroupNV QuerySwapGroupNV} */
    public static int nglXQuerySwapGroupNV(long display, long drawable, long group, long barrier) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQuerySwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        return callPPPPI(display, drawable, group, barrier, __functionAddress);
    }

    /** @param display the connection to the X server */
    @NativeType("Bool")
    public static boolean glXQuerySwapGroupNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLuint *") IntBuffer group, @NativeType("GLuint *") IntBuffer barrier) {
        if (CHECKS) {
            check(group, 1);
            check(barrier, 1);
        }
        return nglXQuerySwapGroupNV(display, drawable, memAddress(group), memAddress(barrier)) != 0;
    }

    // --- [ glXQueryMaxSwapGroupsNV ] ---

    /** Unsafe version of: {@link #glXQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
    public static int nglXQueryMaxSwapGroupsNV(long display, int screen, long maxGroups, long maxBarriers) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapGroupsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPI(display, screen, maxGroups, maxBarriers, __functionAddress);
    }

    /** @param display the connection to the X server */
    @NativeType("Bool")
    public static boolean glXQueryMaxSwapGroupsNV(@NativeType("Display *") long display, int screen, @NativeType("GLuint *") IntBuffer maxGroups, @NativeType("GLuint *") IntBuffer maxBarriers) {
        if (CHECKS) {
            check(maxGroups, 1);
            check(maxBarriers, 1);
        }
        return nglXQueryMaxSwapGroupsNV(display, screen, memAddress(maxGroups), memAddress(maxBarriers)) != 0;
    }

    // --- [ glXQueryFrameCountNV ] ---

    /** Unsafe version of: {@link #glXQueryFrameCountNV QueryFrameCountNV} */
    public static int nglXQueryFrameCountNV(long display, int screen, long count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPI(display, screen, count, __functionAddress);
    }

    /** @param display the connection to the X server */
    @NativeType("Bool")
    public static boolean glXQueryFrameCountNV(@NativeType("Display *") long display, int screen, @NativeType("GLuint *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nglXQueryFrameCountNV(display, screen, memAddress(count)) != 0;
    }

    // --- [ glXResetFrameCountNV ] ---

    /** @param display the connection to the X server */
    @NativeType("Bool")
    public static boolean glXResetFrameCountNV(@NativeType("Display *") long display, int screen) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXResetFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPI(display, screen, __functionAddress) != 0;
    }

    /** Array version of: {@link #glXQuerySwapGroupNV QuerySwapGroupNV} */
    @NativeType("Bool")
    public static boolean glXQuerySwapGroupNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLuint *") int[] group, @NativeType("GLuint *") int[] barrier) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQuerySwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
            check(group, 1);
            check(barrier, 1);
        }
        return callPPPPI(display, drawable, group, barrier, __functionAddress) != 0;
    }

    /** Array version of: {@link #glXQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
    @NativeType("Bool")
    public static boolean glXQueryMaxSwapGroupsNV(@NativeType("Display *") long display, int screen, @NativeType("GLuint *") int[] maxGroups, @NativeType("GLuint *") int[] maxBarriers) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapGroupsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(maxGroups, 1);
            check(maxBarriers, 1);
        }
        return callPPPI(display, screen, maxGroups, maxBarriers, __functionAddress) != 0;
    }

    /** Array version of: {@link #glXQueryFrameCountNV QueryFrameCountNV} */
    @NativeType("Bool")
    public static boolean glXQueryFrameCountNV(@NativeType("Display *") long display, int screen, @NativeType("GLuint *") int[] count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(count, 1);
        }
        return callPPI(display, screen, count, __functionAddress) != 0;
    }

}