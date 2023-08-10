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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_gpu_affinity.txt">WGL_NV_gpu_affinity</a> extension.
 * 
 * <p>On systems with more than one GPU it is desirable to be able to select which GPU(s) in the system become the target for OpenGL rendering commands. This
 * extension introduces the concept of a GPU affinity mask. OpenGL rendering commands are directed to the GPU(s) specified by the affinity mask. GPU
 * affinity is immutable. Once set, it cannot be changed.</p>
 * 
 * <p>This extension also introduces the concept called affinity-DC. An affinity-DC is a device context with a GPU affinity mask embedded in it. This
 * restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the affinity mask.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}.</p>
 */
public class WGLNVGPUAffinity {

    /** New error code set by wglShareLists, wglMakeCurrent and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
    public static final int ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV = 0x20D0;

    /** New error code set by {@link WGL#wglMakeCurrent MakeCurrent} and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
    public static final int ERROR_MISSING_AFFINITY_MASK_NV = 0x20D1;

    protected WGLNVGPUAffinity() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglEnumGpusNV ] ---

    /** Unsafe version of: {@link #wglEnumGpusNV EnumGpusNV} */
    public static int nwglEnumGpusNV(int gpuIndex, long gpu) {
        long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpusNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(gpuIndex, gpu, __functionAddress);
    }

    /**
     * Returns the handles for all GPUs in a system.
     * 
     * <p>By looping over {@code wglEnumGpusNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles can be queried. If the function succeeds,
     * the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The function fails if {@code gpuIndex} is
     * greater or equal than the number of GPUs supported by the system.</p>
     *
     * @param gpuIndex an index value that specifies a GPU
     * @param gpu      returns a handle for GPU number {@code gpuIndex}. The first GPU will be index 0.
     */
    @NativeType("BOOL")
    public static boolean wglEnumGpusNV(@NativeType("UINT") int gpuIndex, @NativeType("HGPUNV *") PointerBuffer gpu) {
        if (CHECKS) {
            check(gpu, 1);
        }
        return nwglEnumGpusNV(gpuIndex, memAddress(gpu)) != 0;
    }

    // --- [ wglEnumGpuDevicesNV ] ---

    /** Unsafe version of: {@link #wglEnumGpuDevicesNV EnumGpuDevicesNV} */
    public static int nwglEnumGpuDevicesNV(long gpu, int deviceIndex, long gpuDevice) {
        long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpuDevicesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(gpu);
        }
        return callPPI(gpu, deviceIndex, gpuDevice, __functionAddress);
    }

    /**
     * Retrieve information about the display devices supported by a GPU.
     *
     * @param gpu         a handle to the GPU to query
     * @param deviceIndex an index value that specifies a display device, supported by {@code gpu}, to query. The first display device will be index 0.
     * @param gpuDevice   a {@link GPU_DEVICE} structure which will receive information about the display device at index {@code deviceIndex}.
     */
    @NativeType("BOOL")
    public static boolean wglEnumGpuDevicesNV(@NativeType("HGPUNV") long gpu, @NativeType("UINT") int deviceIndex, @NativeType("PGPU_DEVICE") GPU_DEVICE gpuDevice) {
        return nwglEnumGpuDevicesNV(gpu, deviceIndex, gpuDevice.address()) != 0;
    }

    // --- [ wglCreateAffinityDCNV ] ---

    /** Unsafe version of: {@link #wglCreateAffinityDCNV CreateAffinityDCNV} */
    public static long nwglCreateAffinityDCNV(long gpuList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAffinityDCNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(gpuList, __functionAddress);
    }

    /**
     * Creates an affinity-DC. Affinity-DCs, a new type of DC, can be used to direct OpenGL commands to a specific GPU or set of GPUs. An affinity-DC is a
     * device context with a GPU affinity mask embedded in it. This restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the
     * affinity mask. An affinity-DC can be created directly, using the new function {@code wglCreateAffinityDCNV} and also indirectly by calling
     * {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} followed by {@link WGLARBPbuffer#wglGetPbufferDCARB GetPbufferDCARB}.
     * 
     * <p>If successful, the function returns an affinity-DC handle. If it fails, {@code NULL} will be returned.</p>
     *
     * @param gpuList a {@code NULL}-terminated array of GPU handles to which the affinity-DC will be restricted
     */
    @NativeType("HDC")
    public static long wglCreateAffinityDCNV(@NativeType("HGPUNV const *") PointerBuffer gpuList) {
        if (CHECKS) {
            checkNT(gpuList);
        }
        return nwglCreateAffinityDCNV(memAddress(gpuList));
    }

    // --- [ wglEnumGpusFromAffinityDCNV ] ---

    /** Unsafe version of: {@link #wglEnumGpusFromAffinityDCNV EnumGpusFromAffinityDCNV} */
    public static int nwglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, long gpu) {
        long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpusFromAffinityDCNV;
        if (CHECKS) {
            check(__functionAddress);
            check(affinityDC);
        }
        return callPPI(affinityDC, gpuIndex, gpu, __functionAddress);
    }

    /**
     * Retrieves a list of GPU handles that make up the affinity-mask of an affinity-DC.
     * 
     * <p>By looping over {@code wglEnumGpusFromAffinityDCNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles associated with the DC can
     * be queried. If the function succeeds, the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The
     * function fails if {@code gpuIndex} is greater or equal than the number of GPUs associated with {@code affinityDC}.</p>
     *
     * @param affinityDC a handle of the affinity-DC to query
     * @param gpuIndex   an index value of the GPU handle in the affinity mask of {@code affinityDC} to query
     * @param gpu        returns a handle for  GPU number {@code gpuIndex}. The first GPU will be at index 0.
     */
    @NativeType("BOOL")
    public static boolean wglEnumGpusFromAffinityDCNV(@NativeType("HDC") long affinityDC, @NativeType("UINT") int gpuIndex, @NativeType("HGPUNV *") PointerBuffer gpu) {
        if (CHECKS) {
            check(gpu, 1);
        }
        return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu)) != 0;
    }

    // --- [ wglDeleteDCNV ] ---

    /**
     * Deletes an affinity-DC.
     *
     * @param hdc a handle of an affinity-DC to delete
     */
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