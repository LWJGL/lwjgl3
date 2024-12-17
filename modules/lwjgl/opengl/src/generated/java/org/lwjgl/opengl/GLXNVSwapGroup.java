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

public class GLXNVSwapGroup {

    protected GLXNVSwapGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXJoinSwapGroupNV ] ---

    /** {@code Bool glXJoinSwapGroupNV(Display * display, GLXDrawable drawable, GLuint group)} */
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

    /** {@code Bool glXBindSwapBarrierNV(Display * display, GLuint group, GLuint barrier)} */
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

    /** {@code Bool glXQuerySwapGroupNV(Display * display, GLXDrawable drawable, GLuint * group, GLuint * barrier)} */
    public static int nglXQuerySwapGroupNV(long display, long drawable, long group, long barrier) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQuerySwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        return callPPPPI(display, drawable, group, barrier, __functionAddress);
    }

    /** {@code Bool glXQuerySwapGroupNV(Display * display, GLXDrawable drawable, GLuint * group, GLuint * barrier)} */
    @NativeType("Bool")
    public static boolean glXQuerySwapGroupNV(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, @NativeType("GLuint *") IntBuffer group, @NativeType("GLuint *") IntBuffer barrier) {
        if (CHECKS) {
            check(group, 1);
            check(barrier, 1);
        }
        return nglXQuerySwapGroupNV(display, drawable, memAddress(group), memAddress(barrier)) != 0;
    }

    // --- [ glXQueryMaxSwapGroupsNV ] ---

    /** {@code Bool glXQueryMaxSwapGroupsNV(Display * display, int screen, GLuint * maxGroups, GLuint * maxBarriers)} */
    public static int nglXQueryMaxSwapGroupsNV(long display, int screen, long maxGroups, long maxBarriers) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapGroupsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPPI(display, screen, maxGroups, maxBarriers, __functionAddress);
    }

    /** {@code Bool glXQueryMaxSwapGroupsNV(Display * display, int screen, GLuint * maxGroups, GLuint * maxBarriers)} */
    @NativeType("Bool")
    public static boolean glXQueryMaxSwapGroupsNV(@NativeType("Display *") long display, int screen, @NativeType("GLuint *") IntBuffer maxGroups, @NativeType("GLuint *") IntBuffer maxBarriers) {
        if (CHECKS) {
            check(maxGroups, 1);
            check(maxBarriers, 1);
        }
        return nglXQueryMaxSwapGroupsNV(display, screen, memAddress(maxGroups), memAddress(maxBarriers)) != 0;
    }

    // --- [ glXQueryFrameCountNV ] ---

    /** {@code Bool glXQueryFrameCountNV(Display * display, int screen, GLuint * count)} */
    public static int nglXQueryFrameCountNV(long display, int screen, long count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPPI(display, screen, count, __functionAddress);
    }

    /** {@code Bool glXQueryFrameCountNV(Display * display, int screen, GLuint * count)} */
    @NativeType("Bool")
    public static boolean glXQueryFrameCountNV(@NativeType("Display *") long display, int screen, @NativeType("GLuint *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nglXQueryFrameCountNV(display, screen, memAddress(count)) != 0;
    }

    // --- [ glXResetFrameCountNV ] ---

    /** {@code Bool glXResetFrameCountNV(Display * display, int screen)} */
    @NativeType("Bool")
    public static boolean glXResetFrameCountNV(@NativeType("Display *") long display, int screen) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXResetFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPI(display, screen, __functionAddress) != 0;
    }

    /** {@code Bool glXQuerySwapGroupNV(Display * display, GLXDrawable drawable, GLuint * group, GLuint * barrier)} */
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

    /** {@code Bool glXQueryMaxSwapGroupsNV(Display * display, int screen, GLuint * maxGroups, GLuint * maxBarriers)} */
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

    /** {@code Bool glXQueryFrameCountNV(Display * display, int screen, GLuint * count)} */
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