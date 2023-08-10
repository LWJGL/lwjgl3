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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_swap_group.txt">WGL_NV_swap_group</a> extension.
 * 
 * <p>This extension provides the capability to synchronize the buffer swaps of a group of OpenGL windows. A swap group is created, and windows are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.</p>
 * 
 * <p>This extension also provides the capability to sychronize the buffer swaps of different swap groups, which may reside on distributed systems on a
 * network. For this purpose swap groups can be bound to a swap barrier.</p>
 * 
 * <p>This extension extends the set of conditions that must be met before a buffer swap can take place.</p>
 */
public class WGLNVSwapGroup {

    protected WGLNVSwapGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglJoinSwapGroupNV ] ---

    @NativeType("BOOL")
    public static boolean wglJoinSwapGroupNV(@NativeType("HDC") long hDC, @NativeType("GLuint") int group) {
        long __functionAddress = GL.getCapabilitiesWGL().wglJoinSwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPI(hDC, group, __functionAddress) != 0;
    }

    // --- [ wglBindSwapBarrierNV ] ---

    @NativeType("BOOL")
    public static boolean wglBindSwapBarrierNV(@NativeType("GLuint") int group, @NativeType("GLuint") int barrier) {
        long __functionAddress = GL.getCapabilitiesWGL().wglBindSwapBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(group, barrier, __functionAddress) != 0;
    }

    // --- [ wglQuerySwapGroupNV ] ---

    public static int nwglQuerySwapGroupNV(long hDC, long group, long barrier) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQuerySwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPPPI(hDC, group, barrier, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglQuerySwapGroupNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") IntBuffer group, @NativeType("GLuint *") IntBuffer barrier) {
        if (CHECKS) {
            check(group, 1);
            check(barrier, 1);
        }
        return nwglQuerySwapGroupNV(hDC, memAddress(group), memAddress(barrier)) != 0;
    }

    // --- [ wglQueryMaxSwapGroupsNV ] ---

    public static int nwglQueryMaxSwapGroupsNV(long hDC, long maxGroups, long maxBarriers) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryMaxSwapGroupsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPPPI(hDC, maxGroups, maxBarriers, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglQueryMaxSwapGroupsNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") IntBuffer maxGroups, @NativeType("GLuint *") IntBuffer maxBarriers) {
        if (CHECKS) {
            check(maxGroups, 1);
            check(maxBarriers, 1);
        }
        return nwglQueryMaxSwapGroupsNV(hDC, memAddress(maxGroups), memAddress(maxBarriers)) != 0;
    }

    // --- [ wglQueryFrameCountNV ] ---

    public static int nwglQueryFrameCountNV(long hDC, long count) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPPI(hDC, count, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglQueryFrameCountNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nwglQueryFrameCountNV(hDC, memAddress(count)) != 0;
    }

    // --- [ wglResetFrameCountNV ] ---

    @NativeType("BOOL")
    public static boolean wglResetFrameCountNV(@NativeType("HDC") long hDC) {
        long __functionAddress = GL.getCapabilitiesWGL().wglResetFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPI(hDC, __functionAddress) != 0;
    }

    /** Array version of: {@link #wglQuerySwapGroupNV QuerySwapGroupNV} */
    @NativeType("BOOL")
    public static boolean wglQuerySwapGroupNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") int[] group, @NativeType("GLuint *") int[] barrier) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQuerySwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
            check(group, 1);
            check(barrier, 1);
        }
        return callPPPI(hDC, group, barrier, __functionAddress) != 0;
    }

    /** Array version of: {@link #wglQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
    @NativeType("BOOL")
    public static boolean wglQueryMaxSwapGroupsNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") int[] maxGroups, @NativeType("GLuint *") int[] maxBarriers) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryMaxSwapGroupsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
            check(maxGroups, 1);
            check(maxBarriers, 1);
        }
        return callPPPI(hDC, maxGroups, maxBarriers, __functionAddress) != 0;
    }

    /** Array version of: {@link #wglQueryFrameCountNV QueryFrameCountNV} */
    @NativeType("BOOL")
    public static boolean wglQueryFrameCountNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") int[] count) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
            check(count, 1);
        }
        return callPPI(hDC, count, __functionAddress) != 0;
    }

}