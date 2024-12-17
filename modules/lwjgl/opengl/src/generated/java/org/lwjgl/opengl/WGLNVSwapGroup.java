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

public class WGLNVSwapGroup {

    protected WGLNVSwapGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglJoinSwapGroupNV ] ---

    /** {@code BOOL wglJoinSwapGroupNV(HDC hDC, GLuint group)} */
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

    /** {@code BOOL wglBindSwapBarrierNV(GLuint group, GLuint barrier)} */
    @NativeType("BOOL")
    public static boolean wglBindSwapBarrierNV(@NativeType("GLuint") int group, @NativeType("GLuint") int barrier) {
        long __functionAddress = GL.getCapabilitiesWGL().wglBindSwapBarrierNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(group, barrier, __functionAddress) != 0;
    }

    // --- [ wglQuerySwapGroupNV ] ---

    /** {@code BOOL wglQuerySwapGroupNV(HDC hDC, GLuint * group, GLuint * barrier)} */
    public static int nwglQuerySwapGroupNV(long hDC, long group, long barrier) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQuerySwapGroupNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPPPI(hDC, group, barrier, __functionAddress);
    }

    /** {@code BOOL wglQuerySwapGroupNV(HDC hDC, GLuint * group, GLuint * barrier)} */
    @NativeType("BOOL")
    public static boolean wglQuerySwapGroupNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") IntBuffer group, @NativeType("GLuint *") IntBuffer barrier) {
        if (CHECKS) {
            check(group, 1);
            check(barrier, 1);
        }
        return nwglQuerySwapGroupNV(hDC, memAddress(group), memAddress(barrier)) != 0;
    }

    // --- [ wglQueryMaxSwapGroupsNV ] ---

    /** {@code BOOL wglQueryMaxSwapGroupsNV(HDC hDC, GLuint * maxGroups, GLuint * maxBarriers)} */
    public static int nwglQueryMaxSwapGroupsNV(long hDC, long maxGroups, long maxBarriers) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryMaxSwapGroupsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPPPI(hDC, maxGroups, maxBarriers, __functionAddress);
    }

    /** {@code BOOL wglQueryMaxSwapGroupsNV(HDC hDC, GLuint * maxGroups, GLuint * maxBarriers)} */
    @NativeType("BOOL")
    public static boolean wglQueryMaxSwapGroupsNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") IntBuffer maxGroups, @NativeType("GLuint *") IntBuffer maxBarriers) {
        if (CHECKS) {
            check(maxGroups, 1);
            check(maxBarriers, 1);
        }
        return nwglQueryMaxSwapGroupsNV(hDC, memAddress(maxGroups), memAddress(maxBarriers)) != 0;
    }

    // --- [ wglQueryFrameCountNV ] ---

    /** {@code BOOL wglQueryFrameCountNV(HDC hDC, GLuint * count)} */
    public static int nwglQueryFrameCountNV(long hDC, long count) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPPI(hDC, count, __functionAddress);
    }

    /** {@code BOOL wglQueryFrameCountNV(HDC hDC, GLuint * count)} */
    @NativeType("BOOL")
    public static boolean wglQueryFrameCountNV(@NativeType("HDC") long hDC, @NativeType("GLuint *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nwglQueryFrameCountNV(hDC, memAddress(count)) != 0;
    }

    // --- [ wglResetFrameCountNV ] ---

    /** {@code BOOL wglResetFrameCountNV(HDC hDC)} */
    @NativeType("BOOL")
    public static boolean wglResetFrameCountNV(@NativeType("HDC") long hDC) {
        long __functionAddress = GL.getCapabilitiesWGL().wglResetFrameCountNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hDC);
        }
        return callPI(hDC, __functionAddress) != 0;
    }

    /** {@code BOOL wglQuerySwapGroupNV(HDC hDC, GLuint * group, GLuint * barrier)} */
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

    /** {@code BOOL wglQueryMaxSwapGroupsNV(HDC hDC, GLuint * maxGroups, GLuint * maxBarriers)} */
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

    /** {@code BOOL wglQueryFrameCountNV(HDC hDC, GLuint * count)} */
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