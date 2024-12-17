/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLNVGPUAffinity {

    public static final int ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV = 0x20D0;

    public static final int ERROR_MISSING_AFFINITY_MASK_NV = 0x20D1;

    protected WGLNVGPUAffinity() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglEnumGpusNV ] ---

    /** {@code BOOL wglEnumGpusNV(UINT gpuIndex, HGPUNV * gpu)} */
    public static int nwglEnumGpusNV(int gpuIndex, long gpu) {
        long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpusNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(gpuIndex, gpu, __functionAddress);
    }

    /** {@code BOOL wglEnumGpusNV(UINT gpuIndex, HGPUNV * gpu)} */
    @NativeType("BOOL")
    public static boolean wglEnumGpusNV(@NativeType("UINT") int gpuIndex, @NativeType("HGPUNV *") PointerBuffer gpu) {
        if (CHECKS) {
            check(gpu, 1);
        }
        return nwglEnumGpusNV(gpuIndex, memAddress(gpu)) != 0;
    }

    // --- [ wglEnumGpuDevicesNV ] ---

    /** {@code BOOL wglEnumGpuDevicesNV(HGPUNV gpu, UINT deviceIndex, PGPU_DEVICE gpuDevice)} */
    public static int nwglEnumGpuDevicesNV(long gpu, int deviceIndex, long gpuDevice) {
        long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpuDevicesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(gpu);
        }
        return callPPI(gpu, deviceIndex, gpuDevice, __functionAddress);
    }

    /** {@code BOOL wglEnumGpuDevicesNV(HGPUNV gpu, UINT deviceIndex, PGPU_DEVICE gpuDevice)} */
    @NativeType("BOOL")
    public static boolean wglEnumGpuDevicesNV(@NativeType("HGPUNV") long gpu, @NativeType("UINT") int deviceIndex, @NativeType("PGPU_DEVICE") GPU_DEVICE gpuDevice) {
        return nwglEnumGpuDevicesNV(gpu, deviceIndex, gpuDevice.address()) != 0;
    }

    // --- [ wglCreateAffinityDCNV ] ---

    /** {@code HDC wglCreateAffinityDCNV(HGPUNV const * gpuList)} */
    public static long nwglCreateAffinityDCNV(long gpuList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAffinityDCNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(gpuList, __functionAddress);
    }

    /** {@code HDC wglCreateAffinityDCNV(HGPUNV const * gpuList)} */
    @NativeType("HDC")
    public static long wglCreateAffinityDCNV(@NativeType("HGPUNV const *") PointerBuffer gpuList) {
        if (CHECKS) {
            checkNT(gpuList);
        }
        return nwglCreateAffinityDCNV(memAddress(gpuList));
    }

    // --- [ wglEnumGpusFromAffinityDCNV ] ---

    /** {@code BOOL wglEnumGpusFromAffinityDCNV(HDC affinityDC, UINT gpuIndex, HGPUNV * gpu)} */
    public static int nwglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, long gpu) {
        long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpusFromAffinityDCNV;
        if (CHECKS) {
            check(__functionAddress);
            check(affinityDC);
        }
        return callPPI(affinityDC, gpuIndex, gpu, __functionAddress);
    }

    /** {@code BOOL wglEnumGpusFromAffinityDCNV(HDC affinityDC, UINT gpuIndex, HGPUNV * gpu)} */
    @NativeType("BOOL")
    public static boolean wglEnumGpusFromAffinityDCNV(@NativeType("HDC") long affinityDC, @NativeType("UINT") int gpuIndex, @NativeType("HGPUNV *") PointerBuffer gpu) {
        if (CHECKS) {
            check(gpu, 1);
        }
        return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu)) != 0;
    }

    // --- [ wglDeleteDCNV ] ---

    /** {@code BOOL wglDeleteDCNV(HDC hdc)} */
    @NativeType("BOOL")
    public static boolean wglDeleteDCNV(@NativeType("HDC") long hdc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDeleteDCNV;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPI(hdc, __functionAddress) != 0;
    }

}