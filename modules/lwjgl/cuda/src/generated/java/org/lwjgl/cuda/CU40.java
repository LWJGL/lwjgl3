/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU40 extends CU {

    /** End of array terminator for the {@code extra} parameter to {@link #cuLaunchKernel LaunchKernel}. */
    public static final long CU_LAUNCH_PARAM_END = 0x0L;

    /**
     * Indicator that the next value in the {@code extra} parameter to {@link #cuLaunchKernel LaunchKernel} will be a pointer to a buffer containing all kernel parameters used for
     * launching kernel {@code f}.
     * 
     * <p>This buffer needs to honor all alignment/padding requirements of the individual parameters. If {@link #CU_LAUNCH_PARAM_BUFFER_SIZE LAUNCH_PARAM_BUFFER_SIZE} is not also specified in the
     * {@code extra} array, then {@link #CU_LAUNCH_PARAM_BUFFER_POINTER LAUNCH_PARAM_BUFFER_POINTER} will have no effect.</p>
     */
    public static final long CU_LAUNCH_PARAM_BUFFER_POINTER = 0x1L;

    /**
     * Indicator that the next value in the {@code extra} parameter to {@link #cuLaunchKernel LaunchKernel} will be a pointer to a {@code size_t} which contains the size of the
     * buffer specified with {@link #CU_LAUNCH_PARAM_BUFFER_POINTER LAUNCH_PARAM_BUFFER_POINTER}.
     * 
     * <p>It is required that {@code CU_LAUNCH_PARAM_BUFFER_POINTER} also be specified in the {@code extra} array if the value associated with
     * {@code CU_LAUNCH_PARAM_BUFFER_SIZE} is not zero.</p>
     */
    public static final long CU_LAUNCH_PARAM_BUFFER_SIZE = 0x2L;

    /**
     * Pointer information. ({@code CUpointer_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT} - The {@code CUcontext} on which a pointer was allocated or registered</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMORY_TYPE POINTER_ATTRIBUTE_MEMORY_TYPE} - The {@code CUmemorytype} describing the physical location of a pointer</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER} - The address at which a pointer's memory may be accessed on the device</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER} - The address at which a pointer's memory may be accessed on the host</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS} - A pair of tokens for use with the nv-p2p.h Linux kernel interface</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS} - Synchronize every synchronous memory operation initiated on this region</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID} - A process-wide unique ID for an allocated memory region</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED} - Indicates if the pointer points to managed memory</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL} - A device ordinal of a device on which a pointer was allocated or registered</li>
     * </ul>
     */
    public static final int
        CU_POINTER_ATTRIBUTE_CONTEXT        = 0x1,
        CU_POINTER_ATTRIBUTE_MEMORY_TYPE    = 0x2,
        CU_POINTER_ATTRIBUTE_DEVICE_POINTER = 0x3,
        CU_POINTER_ATTRIBUTE_HOST_POINTER   = 0x4,
        CU_POINTER_ATTRIBUTE_P2P_TOKENS     = 0x5,
        CU_POINTER_ATTRIBUTE_SYNC_MEMOPS    = 0x6,
        CU_POINTER_ATTRIBUTE_BUFFER_ID      = 0x7,
        CU_POINTER_ATTRIBUTE_IS_MANAGED     = 0x8,
        CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL = 0x9;

    protected CU40() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CtxDestroy           = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuCtxDestroy", 2)),
            CtxPushCurrent       = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuCtxPushCurrent", 2)),
            CtxPopCurrent        = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuCtxPopCurrent", 2)),
            CtxSetCurrent        = apiGetFunctionAddress(CU.getLibrary(), "cuCtxSetCurrent"),
            CtxGetCurrent        = apiGetFunctionAddress(CU.getLibrary(), "cuCtxGetCurrent"),
            MemHostRegister      = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuMemHostRegister", 2)),
            MemHostUnregister    = apiGetFunctionAddress(CU.getLibrary(), "cuMemHostUnregister"),
            Memcpy               = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTDS("cuMemcpy")),
            MemcpyPeer           = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTDS("cuMemcpyPeer")),
            Memcpy3DPeer         = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTDS("cuMemcpy3DPeer")),
            MemcpyAsync          = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuMemcpyAsync")),
            MemcpyPeerAsync      = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuMemcpyPeerAsync")),
            Memcpy3DPeerAsync    = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuMemcpy3DPeerAsync")),
            PointerGetAttribute  = apiGetFunctionAddress(CU.getLibrary(), "cuPointerGetAttribute"),
            StreamDestroy        = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuStreamDestroy", 2)),
            EventDestroy         = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuEventDestroy", 2)),
            LaunchKernel         = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuLaunchKernel")),
            DeviceCanAccessPeer  = apiGetFunctionAddress(CU.getLibrary(), "cuDeviceCanAccessPeer"),
            CtxEnablePeerAccess  = apiGetFunctionAddress(CU.getLibrary(), "cuCtxEnablePeerAccess"),
            CtxDisablePeerAccess = apiGetFunctionAddress(CU.getLibrary(), "cuCtxDisablePeerAccess");

    }

    // --- [ cuCtxDestroy ] ---

    @NativeType("CUresult")
    public static int cuCtxDestroy(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxDestroy;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuCtxPushCurrent ] ---

    @NativeType("CUresult")
    public static int cuCtxPushCurrent(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxPushCurrent;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuCtxPopCurrent ] ---

    public static int ncuCtxPopCurrent(long pctx) {
        long __functionAddress = Functions.CtxPopCurrent;
        return callPI(pctx, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxPopCurrent(@NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxPopCurrent(memAddress(pctx));
    }

    // --- [ cuCtxSetCurrent ] ---

    @NativeType("CUresult")
    public static int cuCtxSetCurrent(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxSetCurrent;
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuCtxGetCurrent ] ---

    public static int ncuCtxGetCurrent(long pctx) {
        long __functionAddress = Functions.CtxGetCurrent;
        return callPI(pctx, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetCurrent(@NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxGetCurrent(memAddress(pctx));
    }

    // --- [ cuMemHostRegister ] ---

    public static int ncuMemHostRegister(long p, long bytesize, int Flags) {
        long __functionAddress = Functions.MemHostRegister;
        return callPPI(p, bytesize, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemHostRegister(@NativeType("void *") ByteBuffer p, @NativeType("unsigned int") int Flags) {
        return ncuMemHostRegister(memAddress(p), p.remaining(), Flags);
    }

    // --- [ cuMemHostUnregister ] ---

    public static int ncuMemHostUnregister(long p) {
        long __functionAddress = Functions.MemHostUnregister;
        return callPI(p, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemHostUnregister(@NativeType("void *") ByteBuffer p) {
        return ncuMemHostUnregister(memAddress(p));
    }

    // --- [ cuMemcpy ] ---

    @NativeType("CUresult")
    public static int cuMemcpy(@NativeType("CUdeviceptr") long dst, @NativeType("CUdeviceptr") long src, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.Memcpy;
        if (CHECKS) {
            check(dst);
            check(src);
        }
        return callPPPI(dst, src, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyPeer ] ---

    @NativeType("CUresult")
    public static int cuMemcpyPeer(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUcontext") long dstContext, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUcontext") long srcContext, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyPeer;
        if (CHECKS) {
            check(dstDevice);
            check(dstContext);
            check(srcDevice);
            check(srcContext);
        }
        return callPPPPPI(dstDevice, dstContext, srcDevice, srcContext, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpy3DPeer ] ---

    public static int ncuMemcpy3DPeer(long pCopy) {
        long __functionAddress = Functions.Memcpy3DPeer;
        if (CHECKS) {
            CUDA_MEMCPY3D_PEER.validate(pCopy);
        }
        return callPI(pCopy, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy3DPeer(@NativeType("CUDA_MEMCPY3D_PEER const *") CUDA_MEMCPY3D_PEER pCopy) {
        return ncuMemcpy3DPeer(pCopy.address());
    }

    // --- [ cuMemcpyAsync ] ---

    @NativeType("CUresult")
    public static int cuMemcpyAsync(@NativeType("CUdeviceptr") long dst, @NativeType("CUdeviceptr") long src, @NativeType("size_t") long ByteCount, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemcpyAsync;
        if (CHECKS) {
            check(dst);
            check(src);
        }
        return callPPPPI(dst, src, ByteCount, hStream, __functionAddress);
    }

    // --- [ cuMemcpyPeerAsync ] ---

    @NativeType("CUresult")
    public static int cuMemcpyPeerAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUcontext") long dstContext, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUcontext") long srcContext, @NativeType("size_t") long ByteCount, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemcpyPeerAsync;
        if (CHECKS) {
            check(dstDevice);
            check(dstContext);
            check(srcDevice);
            check(srcContext);
        }
        return callPPPPPPI(dstDevice, dstContext, srcDevice, srcContext, ByteCount, hStream, __functionAddress);
    }

    // --- [ cuMemcpy3DPeerAsync ] ---

    public static int ncuMemcpy3DPeerAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy3DPeerAsync;
        if (CHECKS) {
            CUDA_MEMCPY3D_PEER.validate(pCopy);
        }
        return callPPI(pCopy, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy3DPeerAsync(@NativeType("CUDA_MEMCPY3D_PEER const *") CUDA_MEMCPY3D_PEER pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy3DPeerAsync(pCopy.address(), hStream);
    }

    // --- [ cuPointerGetAttribute ] ---

    public static int ncuPointerGetAttribute(long data, int attribute, long ptr) {
        long __functionAddress = Functions.PointerGetAttribute;
        if (CHECKS) {
            check(ptr);
        }
        return callPPI(data, attribute, ptr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") ByteBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    // --- [ cuStreamDestroy ] ---

    @NativeType("CUresult")
    public static int cuStreamDestroy(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamDestroy;
        if (CHECKS) {
            check(hStream);
        }
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuEventDestroy ] ---

    @NativeType("CUresult")
    public static int cuEventDestroy(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventDestroy;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuLaunchKernel ] ---

    public static int ncuLaunchKernel(long f, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, long hStream, long kernelParams, long extra) {
        long __functionAddress = Functions.LaunchKernel;
        if (CHECKS) {
            check(f);
        }
        return callPPPPI(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, kernelParams, extra, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLaunchKernel(@NativeType("CUfunction") long f, @NativeType("unsigned int") int gridDimX, @NativeType("unsigned int") int gridDimY, @NativeType("unsigned int") int gridDimZ, @NativeType("unsigned int") int blockDimX, @NativeType("unsigned int") int blockDimY, @NativeType("unsigned int") int blockDimZ, @NativeType("unsigned int") int sharedMemBytes, @NativeType("CUstream") long hStream, @Nullable @NativeType("void **") PointerBuffer kernelParams, @Nullable @NativeType("void **") PointerBuffer extra) {
        return ncuLaunchKernel(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, memAddressSafe(kernelParams), memAddressSafe(extra));
    }

    // --- [ cuDeviceCanAccessPeer ] ---

    public static int ncuDeviceCanAccessPeer(long canAccessPeer, int dev, int peerDev) {
        long __functionAddress = Functions.DeviceCanAccessPeer;
        return callPI(canAccessPeer, dev, peerDev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceCanAccessPeer(@NativeType("int *") IntBuffer canAccessPeer, @NativeType("CUdevice") int dev, @NativeType("CUdevice") int peerDev) {
        if (CHECKS) {
            check(canAccessPeer, 1);
        }
        return ncuDeviceCanAccessPeer(memAddress(canAccessPeer), dev, peerDev);
    }

    // --- [ cuCtxEnablePeerAccess ] ---

    @NativeType("CUresult")
    public static int cuCtxEnablePeerAccess(@NativeType("CUcontext") long peerContext, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.CtxEnablePeerAccess;
        if (CHECKS) {
            check(peerContext);
        }
        return callPI(peerContext, Flags, __functionAddress);
    }

    // --- [ cuCtxDisablePeerAccess ] ---

    @NativeType("CUresult")
    public static int cuCtxDisablePeerAccess(@NativeType("CUcontext") long peerContext) {
        long __functionAddress = Functions.CtxDisablePeerAccess;
        if (CHECKS) {
            check(peerContext);
        }
        return callPI(peerContext, __functionAddress);
    }

}