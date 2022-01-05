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
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

/**
 * Contains bindings to the <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>.
 * 
 * <p>Functionality up to CUDA version 3.2, which is the minimum version compatible with the LWJGL bindings, is guaranteed to be available. Functions
 * introduced after CUDA 3.2 may or may not be missing, depending on the CUDA version available at runtime.</p>
 */
public class CU {

    private static final SharedLibrary NVCUDA = Library.loadNative(CU.class, "org.lwjgl.cuda", Configuration.CUDA_LIBRARY_NAME, "nvcuda");

    /** Contains the function pointers loaded from the NVCUDA {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetErrorString                                     = apiGetFunctionAddress(NVCUDA, "cuGetErrorString"),
            GetErrorName                                       = apiGetFunctionAddress(NVCUDA, "cuGetErrorName"),
            Init                                               = apiGetFunctionAddress(NVCUDA, "cuInit"),
            DriverGetVersion                                   = apiGetFunctionAddress(NVCUDA, "cuDriverGetVersion"),
            DeviceGet                                          = apiGetFunctionAddress(NVCUDA, "cuDeviceGet"),
            DeviceGetCount                                     = apiGetFunctionAddress(NVCUDA, "cuDeviceGetCount"),
            DeviceGetName                                      = apiGetFunctionAddress(NVCUDA, "cuDeviceGetName"),
            DeviceGetUuid                                      = NVCUDA.getFunctionAddress("cuDeviceGetUuid"),
            DeviceGetUuid_v2                                   = NVCUDA.getFunctionAddress("cuDeviceGetUuid_v2"),
            DeviceGetLuid                                      = NVCUDA.getFunctionAddress("cuDeviceGetLuid"),
            DeviceTotalMem                                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuDeviceTotalMem", 2)),
            DeviceGetTexture1DLinearMaxWidth                   = NVCUDA.getFunctionAddress("cuDeviceGetTexture1DLinearMaxWidth"),
            DeviceGetAttribute                                 = apiGetFunctionAddress(NVCUDA, "cuDeviceGetAttribute"),
            DeviceGetNvSciSyncAttributes                       = NVCUDA.getFunctionAddress("cuDeviceGetNvSciSyncAttributes"),
            DeviceSetMemPool                                   = NVCUDA.getFunctionAddress("cuDeviceSetMemPool"),
            DeviceGetMemPool                                   = NVCUDA.getFunctionAddress("cuDeviceGetMemPool"),
            DeviceGetDefaultMemPool                            = NVCUDA.getFunctionAddress("cuDeviceGetDefaultMemPool"),
            FlushGPUDirectRDMAWrites                           = NVCUDA.getFunctionAddress("cuFlushGPUDirectRDMAWrites"),
            DeviceGetProperties                                = apiGetFunctionAddress(NVCUDA, "cuDeviceGetProperties"),
            DeviceComputeCapability                            = apiGetFunctionAddress(NVCUDA, "cuDeviceComputeCapability"),
            DevicePrimaryCtxRetain                             = NVCUDA.getFunctionAddress("cuDevicePrimaryCtxRetain"),
            DevicePrimaryCtxRelease                            = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuDevicePrimaryCtxRelease", 2)),
            DevicePrimaryCtxSetFlags                           = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuDevicePrimaryCtxSetFlags", 2)),
            DevicePrimaryCtxGetState                           = NVCUDA.getFunctionAddress("cuDevicePrimaryCtxGetState"),
            DevicePrimaryCtxReset                              = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuDevicePrimaryCtxReset", 2)),
            DeviceGetExecAffinitySupport                       = NVCUDA.getFunctionAddress("cuDeviceGetExecAffinitySupport"),
            CtxCreate                                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuCtxCreate", 2)),
            CtxCreate_v3                                       = NVCUDA.getFunctionAddress("cuCtxCreate_v3"),
            CtxDestroy                                         = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuCtxDestroy", 2)),
            CtxPushCurrent                                     = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuCtxPushCurrent", 2)),
            CtxPopCurrent                                      = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuCtxPopCurrent", 2)),
            CtxSetCurrent                                      = NVCUDA.getFunctionAddress("cuCtxSetCurrent"),
            CtxGetCurrent                                      = NVCUDA.getFunctionAddress("cuCtxGetCurrent"),
            CtxGetDevice                                       = apiGetFunctionAddress(NVCUDA, "cuCtxGetDevice"),
            CtxGetFlags                                        = NVCUDA.getFunctionAddress("cuCtxGetFlags"),
            CtxSynchronize                                     = apiGetFunctionAddress(NVCUDA, "cuCtxSynchronize"),
            CtxSetLimit                                        = apiGetFunctionAddress(NVCUDA, "cuCtxSetLimit"),
            CtxGetLimit                                        = apiGetFunctionAddress(NVCUDA, "cuCtxGetLimit"),
            CtxGetCacheConfig                                  = apiGetFunctionAddress(NVCUDA, "cuCtxGetCacheConfig"),
            CtxSetCacheConfig                                  = apiGetFunctionAddress(NVCUDA, "cuCtxSetCacheConfig"),
            CtxGetSharedMemConfig                              = NVCUDA.getFunctionAddress("cuCtxGetSharedMemConfig"),
            CtxSetSharedMemConfig                              = NVCUDA.getFunctionAddress("cuCtxSetSharedMemConfig"),
            CtxGetApiVersion                                   = apiGetFunctionAddress(NVCUDA, "cuCtxGetApiVersion"),
            CtxGetStreamPriorityRange                          = apiGetFunctionAddress(NVCUDA, "cuCtxGetStreamPriorityRange"),
            CtxResetPersistingL2Cache                          = NVCUDA.getFunctionAddress("cuCtxResetPersistingL2Cache"),
            CtxGetExecAffinity                                 = NVCUDA.getFunctionAddress("cuCtxGetExecAffinity"),
            CtxAttach                                          = apiGetFunctionAddress(NVCUDA, "cuCtxAttach"),
            CtxDetach                                          = apiGetFunctionAddress(NVCUDA, "cuCtxDetach"),
            ModuleLoad                                         = apiGetFunctionAddress(NVCUDA, "cuModuleLoad"),
            ModuleLoadData                                     = apiGetFunctionAddress(NVCUDA, "cuModuleLoadData"),
            ModuleLoadDataEx                                   = apiGetFunctionAddress(NVCUDA, "cuModuleLoadDataEx"),
            ModuleLoadFatBinary                                = apiGetFunctionAddress(NVCUDA, "cuModuleLoadFatBinary"),
            ModuleUnload                                       = apiGetFunctionAddress(NVCUDA, "cuModuleUnload"),
            ModuleGetFunction                                  = apiGetFunctionAddress(NVCUDA, "cuModuleGetFunction"),
            ModuleGetGlobal                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuModuleGetGlobal", 2)),
            ModuleGetTexRef                                    = apiGetFunctionAddress(NVCUDA, "cuModuleGetTexRef"),
            ModuleGetSurfRef                                   = apiGetFunctionAddress(NVCUDA, "cuModuleGetSurfRef"),
            LinkCreate                                         = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuLinkCreate", 2)),
            LinkAddData                                        = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuLinkAddData", 2)),
            LinkAddFile                                        = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuLinkAddFile", 2)),
            LinkComplete                                       = NVCUDA.getFunctionAddress("cuLinkComplete"),
            LinkDestroy                                        = NVCUDA.getFunctionAddress("cuLinkDestroy"),
            MemGetInfo                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemGetInfo", 2)),
            MemAlloc                                           = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemAlloc", 2)),
            MemAllocPitch                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemAllocPitch", 2)),
            MemFree                                            = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemFree", 2)),
            MemGetAddressRange                                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemGetAddressRange", 2)),
            MemAllocHost                                       = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemAllocHost", 2)),
            MemFreeHost                                        = apiGetFunctionAddress(NVCUDA, "cuMemFreeHost"),
            MemHostAlloc                                       = apiGetFunctionAddress(NVCUDA, "cuMemHostAlloc"),
            MemHostGetDevicePointer                            = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemHostGetDevicePointer", 2)),
            MemHostGetFlags                                    = apiGetFunctionAddress(NVCUDA, "cuMemHostGetFlags"),
            MemAllocManaged                                    = NVCUDA.getFunctionAddress("cuMemAllocManaged"),
            DeviceGetByPCIBusId                                = NVCUDA.getFunctionAddress("cuDeviceGetByPCIBusId"),
            DeviceGetPCIBusId                                  = NVCUDA.getFunctionAddress("cuDeviceGetPCIBusId"),
            IpcGetEventHandle                                  = NVCUDA.getFunctionAddress("cuIpcGetEventHandle"),
            IpcOpenEventHandle                                 = NVCUDA.getFunctionAddress("cuIpcOpenEventHandle"),
            IpcGetMemHandle                                    = NVCUDA.getFunctionAddress("cuIpcGetMemHandle"),
            IpcOpenMemHandle                                   = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuIpcOpenMemHandle", 2)),
            IpcCloseMemHandle                                  = NVCUDA.getFunctionAddress("cuIpcCloseMemHandle"),
            MemHostRegister                                    = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuMemHostRegister", 2)),
            MemHostUnregister                                  = NVCUDA.getFunctionAddress("cuMemHostUnregister"),
            Memcpy                                             = NVCUDA.getFunctionAddress(__CUDA_API_PTDS("cuMemcpy")),
            MemcpyPeer                                         = NVCUDA.getFunctionAddress(__CUDA_API_PTDS("cuMemcpyPeer")),
            MemcpyHtoD                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyHtoD", 2))),
            MemcpyDtoH                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyDtoH", 2))),
            MemcpyDtoD                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyDtoD", 2))),
            MemcpyDtoA                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyDtoA", 2))),
            MemcpyAtoD                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyAtoD", 2))),
            MemcpyHtoA                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyHtoA", 2))),
            MemcpyAtoH                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyAtoH", 2))),
            MemcpyAtoA                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyAtoA", 2))),
            Memcpy2D                                           = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpy2D", 2))),
            Memcpy2DUnaligned                                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpy2DUnaligned", 2))),
            Memcpy3D                                           = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpy3D", 2))),
            Memcpy3DPeer                                       = NVCUDA.getFunctionAddress(__CUDA_API_PTDS("cuMemcpy3DPeer")),
            MemcpyAsync                                        = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemcpyAsync")),
            MemcpyPeerAsync                                    = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemcpyPeerAsync")),
            MemcpyHtoDAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyHtoDAsync", 2))),
            MemcpyDtoHAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyDtoHAsync", 2))),
            MemcpyDtoDAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyDtoDAsync", 2))),
            MemcpyHtoAAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyHtoAAsync", 2))),
            MemcpyAtoHAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyAtoHAsync", 2))),
            Memcpy2DAsync                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpy2DAsync", 2))),
            Memcpy3DAsync                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpy3DAsync", 2))),
            Memcpy3DPeerAsync                                  = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemcpy3DPeerAsync")),
            MemsetD8                                           = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD8", 2))),
            MemsetD16                                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD16", 2))),
            MemsetD32                                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD32", 2))),
            MemsetD2D8                                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD2D8", 2))),
            MemsetD2D16                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD2D16", 2))),
            MemsetD2D32                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD2D32", 2))),
            MemsetD8Async                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD8Async")),
            MemsetD16Async                                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD16Async")),
            MemsetD32Async                                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD32Async")),
            MemsetD2D8Async                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD2D8Async")),
            MemsetD2D16Async                                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD2D16Async")),
            MemsetD2D32Async                                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD2D32Async")),
            ArrayCreate                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArrayCreate", 2)),
            ArrayGetDescriptor                                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArrayGetDescriptor", 2)),
            ArrayGetSparseProperties                           = NVCUDA.getFunctionAddress("cuArrayGetSparseProperties"),
            MipmappedArrayGetSparseProperties                  = NVCUDA.getFunctionAddress("cuMipmappedArrayGetSparseProperties"),
            ArrayGetPlane                                      = NVCUDA.getFunctionAddress("cuArrayGetPlane"),
            ArrayDestroy                                       = apiGetFunctionAddress(NVCUDA, "cuArrayDestroy"),
            Array3DCreate                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArray3DCreate", 2)),
            Array3DGetDescriptor                               = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArray3DGetDescriptor", 2)),
            MipmappedArrayCreate                               = NVCUDA.getFunctionAddress("cuMipmappedArrayCreate"),
            MipmappedArrayGetLevel                             = NVCUDA.getFunctionAddress("cuMipmappedArrayGetLevel"),
            MipmappedArrayDestroy                              = NVCUDA.getFunctionAddress("cuMipmappedArrayDestroy"),
            MemAddressReserve                                  = NVCUDA.getFunctionAddress("cuMemAddressReserve"),
            MemAddressFree                                     = NVCUDA.getFunctionAddress("cuMemAddressFree"),
            MemCreate                                          = NVCUDA.getFunctionAddress("cuMemCreate"),
            MemRelease                                         = NVCUDA.getFunctionAddress("cuMemRelease"),
            MemMap                                             = NVCUDA.getFunctionAddress("cuMemMap"),
            MemMapArrayAsync                                   = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemMapArrayAsync")),
            MemUnmap                                           = NVCUDA.getFunctionAddress("cuMemUnmap"),
            MemSetAccess                                       = NVCUDA.getFunctionAddress("cuMemSetAccess"),
            MemGetAccess                                       = NVCUDA.getFunctionAddress("cuMemGetAccess"),
            MemExportToShareableHandle                         = NVCUDA.getFunctionAddress("cuMemExportToShareableHandle"),
            MemImportFromShareableHandle                       = NVCUDA.getFunctionAddress("cuMemImportFromShareableHandle"),
            MemGetAllocationGranularity                        = NVCUDA.getFunctionAddress("cuMemGetAllocationGranularity"),
            MemGetAllocationPropertiesFromHandle               = NVCUDA.getFunctionAddress("cuMemGetAllocationPropertiesFromHandle"),
            MemRetainAllocationHandle                          = NVCUDA.getFunctionAddress("cuMemRetainAllocationHandle"),
            MemFreeAsync                                       = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemFreeAsync")),
            MemAllocAsync                                      = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemAllocAsync")),
            MemPoolTrimTo                                      = NVCUDA.getFunctionAddress("cuMemPoolTrimTo"),
            MemPoolSetAttribute                                = NVCUDA.getFunctionAddress("cuMemPoolSetAttribute"),
            MemPoolGetAttribute                                = NVCUDA.getFunctionAddress("cuMemPoolGetAttribute"),
            MemPoolSetAccess                                   = NVCUDA.getFunctionAddress("cuMemPoolSetAccess"),
            MemPoolGetAccess                                   = NVCUDA.getFunctionAddress("cuMemPoolGetAccess"),
            MemPoolCreate                                      = NVCUDA.getFunctionAddress("cuMemPoolCreate"),
            MemPoolDestroy                                     = NVCUDA.getFunctionAddress("cuMemPoolDestroy"),
            MemAllocFromPoolAsync                              = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemAllocFromPoolAsync")),
            MemPoolExportToShareableHandle                     = NVCUDA.getFunctionAddress("cuMemPoolExportToShareableHandle"),
            MemPoolImportFromShareableHandle                   = NVCUDA.getFunctionAddress("cuMemPoolImportFromShareableHandle"),
            MemPoolExportPointer                               = NVCUDA.getFunctionAddress("cuMemPoolExportPointer"),
            MemPoolImportPointer                               = NVCUDA.getFunctionAddress("cuMemPoolImportPointer"),
            PointerGetAttribute                                = NVCUDA.getFunctionAddress("cuPointerGetAttribute"),
            MemPrefetchAsync                                   = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuMemPrefetchAsync")),
            MemAdvise                                          = NVCUDA.getFunctionAddress("cuMemAdvise"),
            MemRangeGetAttribute                               = NVCUDA.getFunctionAddress("cuMemRangeGetAttribute"),
            MemRangeGetAttributes                              = NVCUDA.getFunctionAddress("cuMemRangeGetAttributes"),
            PointerSetAttribute                                = NVCUDA.getFunctionAddress("cuPointerSetAttribute"),
            PointerGetAttributes                               = NVCUDA.getFunctionAddress("cuPointerGetAttributes"),
            StreamCreate                                       = apiGetFunctionAddress(NVCUDA, "cuStreamCreate"),
            StreamCreateWithPriority                           = apiGetFunctionAddress(NVCUDA, "cuStreamCreateWithPriority"),
            StreamGetPriority                                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamGetPriority")),
            StreamGetFlags                                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamGetFlags")),
            StreamGetCtx                                       = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamGetCtx")),
            StreamWaitEvent                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamWaitEvent")),
            StreamAddCallback                                  = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamAddCallback")),
            StreamBeginCapture                                 = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamBeginCapture")),
            StreamBeginCapture_v2                              = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamBeginCapture_v2")),
            ThreadExchangeStreamCaptureMode                    = NVCUDA.getFunctionAddress("cuThreadExchangeStreamCaptureMode"),
            StreamEndCapture                                   = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamEndCapture")),
            StreamIsCapturing                                  = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamIsCapturing")),
            StreamGetCaptureInfo                               = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamGetCaptureInfo")),
            StreamGetCaptureInfo_v2                            = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamGetCaptureInfo_v2")),
            StreamUpdateCaptureDependencies                    = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamUpdateCaptureDependencies")),
            StreamAttachMemAsync                               = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamAttachMemAsync")),
            StreamQuery                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamQuery")),
            StreamSynchronize                                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamSynchronize")),
            StreamDestroy                                      = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuStreamDestroy", 2)),
            StreamCopyAttributes                               = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamCopyAttributes")),
            StreamGetAttribute                                 = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamGetAttribute")),
            StreamSetAttribute                                 = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamSetAttribute")),
            EventCreate                                        = apiGetFunctionAddress(NVCUDA, "cuEventCreate"),
            EventRecord                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuEventRecord")),
            EventRecordWithFlags                               = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuEventRecordWithFlags")),
            EventQuery                                         = apiGetFunctionAddress(NVCUDA, "cuEventQuery"),
            EventSynchronize                                   = apiGetFunctionAddress(NVCUDA, "cuEventSynchronize"),
            EventDestroy                                       = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuEventDestroy", 2)),
            EventElapsedTime                                   = apiGetFunctionAddress(NVCUDA, "cuEventElapsedTime"),
            ImportExternalMemory                               = NVCUDA.getFunctionAddress("cuImportExternalMemory"),
            ExternalMemoryGetMappedBuffer                      = NVCUDA.getFunctionAddress("cuExternalMemoryGetMappedBuffer"),
            ExternalMemoryGetMappedMipmappedArray              = NVCUDA.getFunctionAddress("cuExternalMemoryGetMappedMipmappedArray"),
            DestroyExternalMemory                              = NVCUDA.getFunctionAddress("cuDestroyExternalMemory"),
            ImportExternalSemaphore                            = NVCUDA.getFunctionAddress("cuImportExternalSemaphore"),
            SignalExternalSemaphoresAsync                      = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuSignalExternalSemaphoresAsync")),
            WaitExternalSemaphoresAsync                        = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuWaitExternalSemaphoresAsync")),
            DestroyExternalSemaphore                           = NVCUDA.getFunctionAddress("cuDestroyExternalSemaphore"),
            StreamWaitValue32                                  = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamWaitValue32")),
            StreamWaitValue64                                  = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamWaitValue64")),
            StreamWriteValue32                                 = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamWriteValue32")),
            StreamWriteValue64                                 = NVCUDA.getFunctionAddress("cuStreamWriteValue64"),
            StreamBatchMemOp                                   = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuStreamBatchMemOp")),
            FuncGetAttribute                                   = apiGetFunctionAddress(NVCUDA, "cuFuncGetAttribute"),
            FuncSetAttribute                                   = NVCUDA.getFunctionAddress("cuFuncSetAttribute"),
            FuncSetCacheConfig                                 = apiGetFunctionAddress(NVCUDA, "cuFuncSetCacheConfig"),
            FuncSetSharedMemConfig                             = NVCUDA.getFunctionAddress("cuFuncSetSharedMemConfig"),
            FuncGetModule                                      = NVCUDA.getFunctionAddress("cuFuncGetModule"),
            LaunchKernel                                       = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuLaunchKernel")),
            LaunchCooperativeKernel                            = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuLaunchCooperativeKernel")),
            LaunchCooperativeKernelMultiDevice                 = NVCUDA.getFunctionAddress("cuLaunchCooperativeKernelMultiDevice"),
            LaunchHostFunc                                     = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuLaunchHostFunc")),
            FuncSetBlockShape                                  = apiGetFunctionAddress(NVCUDA, "cuFuncSetBlockShape"),
            FuncSetSharedSize                                  = apiGetFunctionAddress(NVCUDA, "cuFuncSetSharedSize"),
            ParamSetSize                                       = apiGetFunctionAddress(NVCUDA, "cuParamSetSize"),
            ParamSeti                                          = apiGetFunctionAddress(NVCUDA, "cuParamSeti"),
            ParamSetf                                          = apiGetFunctionAddress(NVCUDA, "cuParamSetf"),
            ParamSetv                                          = apiGetFunctionAddress(NVCUDA, "cuParamSetv"),
            Launch                                             = apiGetFunctionAddress(NVCUDA, "cuLaunch"),
            LaunchGrid                                         = apiGetFunctionAddress(NVCUDA, "cuLaunchGrid"),
            LaunchGridAsync                                    = apiGetFunctionAddress(NVCUDA, "cuLaunchGridAsync"),
            ParamSetTexRef                                     = apiGetFunctionAddress(NVCUDA, "cuParamSetTexRef"),
            GraphCreate                                        = NVCUDA.getFunctionAddress("cuGraphCreate"),
            GraphAddKernelNode                                 = NVCUDA.getFunctionAddress("cuGraphAddKernelNode"),
            GraphKernelNodeGetParams                           = NVCUDA.getFunctionAddress("cuGraphKernelNodeGetParams"),
            GraphKernelNodeSetParams                           = NVCUDA.getFunctionAddress("cuGraphKernelNodeSetParams"),
            GraphAddMemcpyNode                                 = NVCUDA.getFunctionAddress("cuGraphAddMemcpyNode"),
            GraphMemcpyNodeGetParams                           = NVCUDA.getFunctionAddress("cuGraphMemcpyNodeGetParams"),
            GraphMemcpyNodeSetParams                           = NVCUDA.getFunctionAddress("cuGraphMemcpyNodeSetParams"),
            GraphAddMemsetNode                                 = NVCUDA.getFunctionAddress("cuGraphAddMemsetNode"),
            GraphMemsetNodeGetParams                           = NVCUDA.getFunctionAddress("cuGraphMemsetNodeGetParams"),
            GraphMemsetNodeSetParams                           = NVCUDA.getFunctionAddress("cuGraphMemsetNodeSetParams"),
            GraphAddHostNode                                   = NVCUDA.getFunctionAddress("cuGraphAddHostNode"),
            GraphHostNodeGetParams                             = NVCUDA.getFunctionAddress("cuGraphHostNodeGetParams"),
            GraphHostNodeSetParams                             = NVCUDA.getFunctionAddress("cuGraphHostNodeSetParams"),
            GraphAddChildGraphNode                             = NVCUDA.getFunctionAddress("cuGraphAddChildGraphNode"),
            GraphChildGraphNodeGetGraph                        = NVCUDA.getFunctionAddress("cuGraphChildGraphNodeGetGraph"),
            GraphAddEmptyNode                                  = NVCUDA.getFunctionAddress("cuGraphAddEmptyNode"),
            GraphAddEventRecordNode                            = NVCUDA.getFunctionAddress("cuGraphAddEventRecordNode"),
            GraphEventRecordNodeGetEvent                       = NVCUDA.getFunctionAddress("cuGraphEventRecordNodeGetEvent"),
            GraphEventRecordNodeSetEvent                       = NVCUDA.getFunctionAddress("cuGraphEventRecordNodeSetEvent"),
            GraphAddEventWaitNode                              = NVCUDA.getFunctionAddress("cuGraphAddEventWaitNode"),
            GraphEventWaitNodeGetEvent                         = NVCUDA.getFunctionAddress("cuGraphEventWaitNodeGetEvent"),
            GraphEventWaitNodeSetEvent                         = NVCUDA.getFunctionAddress("cuGraphEventWaitNodeSetEvent"),
            GraphAddExternalSemaphoresSignalNode               = NVCUDA.getFunctionAddress("cuGraphAddExternalSemaphoresSignalNode"),
            GraphExternalSemaphoresSignalNodeGetParams         = NVCUDA.getFunctionAddress("cuGraphExternalSemaphoresSignalNodeGetParams"),
            GraphExternalSemaphoresSignalNodeSetParams         = NVCUDA.getFunctionAddress("cuGraphExternalSemaphoresSignalNodeSetParams"),
            GraphAddExternalSemaphoresWaitNode                 = NVCUDA.getFunctionAddress("cuGraphAddExternalSemaphoresWaitNode"),
            GraphExternalSemaphoresWaitNodeGetParams           = NVCUDA.getFunctionAddress("cuGraphExternalSemaphoresWaitNodeGetParams"),
            GraphExternalSemaphoresWaitNodeSetParams           = NVCUDA.getFunctionAddress("cuGraphExternalSemaphoresWaitNodeSetParams"),
            GraphAddMemAllocNode                               = NVCUDA.getFunctionAddress("cuGraphAddMemAllocNode"),
            GraphMemAllocNodeGetParams                         = NVCUDA.getFunctionAddress("cuGraphMemAllocNodeGetParams"),
            GraphAddMemFreeNode                                = NVCUDA.getFunctionAddress("cuGraphAddMemFreeNode"),
            GraphMemFreeNodeGetParams                          = NVCUDA.getFunctionAddress("cuGraphMemFreeNodeGetParams"),
            DeviceGraphMemTrim                                 = NVCUDA.getFunctionAddress("cuDeviceGraphMemTrim"),
            DeviceGetGraphMemAttribute                         = NVCUDA.getFunctionAddress("cuDeviceGetGraphMemAttribute"),
            DeviceSetGraphMemAttribute                         = NVCUDA.getFunctionAddress("cuDeviceSetGraphMemAttribute"),
            GraphClone                                         = NVCUDA.getFunctionAddress("cuGraphClone"),
            GraphNodeFindInClone                               = NVCUDA.getFunctionAddress("cuGraphNodeFindInClone"),
            GraphNodeGetType                                   = NVCUDA.getFunctionAddress("cuGraphNodeGetType"),
            GraphGetNodes                                      = NVCUDA.getFunctionAddress("cuGraphGetNodes"),
            GraphGetRootNodes                                  = NVCUDA.getFunctionAddress("cuGraphGetRootNodes"),
            GraphGetEdges                                      = NVCUDA.getFunctionAddress("cuGraphGetEdges"),
            GraphNodeGetDependencies                           = NVCUDA.getFunctionAddress("cuGraphNodeGetDependencies"),
            GraphNodeGetDependentNodes                         = NVCUDA.getFunctionAddress("cuGraphNodeGetDependentNodes"),
            GraphAddDependencies                               = NVCUDA.getFunctionAddress("cuGraphAddDependencies"),
            GraphRemoveDependencies                            = NVCUDA.getFunctionAddress("cuGraphRemoveDependencies"),
            GraphDestroyNode                                   = NVCUDA.getFunctionAddress("cuGraphDestroyNode"),
            GraphInstantiate                                   = NVCUDA.getFunctionAddress(__CUDA_API_VERSION("cuGraphInstantiate", 2)),
            GraphInstantiateWithFlags                          = NVCUDA.getFunctionAddress("cuGraphInstantiateWithFlags"),
            GraphExecKernelNodeSetParams                       = NVCUDA.getFunctionAddress("cuGraphExecKernelNodeSetParams"),
            GraphExecMemcpyNodeSetParams                       = NVCUDA.getFunctionAddress("cuGraphExecMemcpyNodeSetParams"),
            GraphExecMemsetNodeSetParams                       = NVCUDA.getFunctionAddress("cuGraphExecMemsetNodeSetParams"),
            GraphExecHostNodeSetParams                         = NVCUDA.getFunctionAddress("cuGraphExecHostNodeSetParams"),
            GraphExecChildGraphNodeSetParams                   = NVCUDA.getFunctionAddress("cuGraphExecChildGraphNodeSetParams"),
            GraphExecEventRecordNodeSetEvent                   = NVCUDA.getFunctionAddress("cuGraphExecEventRecordNodeSetEvent"),
            GraphExecEventWaitNodeSetEvent                     = NVCUDA.getFunctionAddress("cuGraphExecEventWaitNodeSetEvent"),
            GraphExecExternalSemaphoresSignalNodeSetParams     = NVCUDA.getFunctionAddress("cuGraphExecExternalSemaphoresSignalNodeSetParams"),
            GraphExecExternalSemaphoresWaitNodeSetParams       = NVCUDA.getFunctionAddress("cuGraphExecExternalSemaphoresWaitNodeSetParams"),
            GraphUpload                                        = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuGraphUpload")),
            GraphLaunch                                        = NVCUDA.getFunctionAddress(__CUDA_API_PTSZ("cuGraphLaunch")),
            GraphExecDestroy                                   = NVCUDA.getFunctionAddress("cuGraphExecDestroy"),
            GraphDestroy                                       = NVCUDA.getFunctionAddress("cuGraphDestroy"),
            GraphExecUpdate                                    = NVCUDA.getFunctionAddress("cuGraphExecUpdate"),
            GraphKernelNodeCopyAttributes                      = NVCUDA.getFunctionAddress("cuGraphKernelNodeCopyAttributes"),
            GraphKernelNodeGetAttribute                        = NVCUDA.getFunctionAddress("cuGraphKernelNodeGetAttribute"),
            GraphKernelNodeSetAttribute                        = NVCUDA.getFunctionAddress("cuGraphKernelNodeSetAttribute"),
            GraphDebugDotPrint                                 = NVCUDA.getFunctionAddress("cuGraphDebugDotPrint"),
            UserObjectCreate                                   = NVCUDA.getFunctionAddress("cuUserObjectCreate"),
            UserObjectRetain                                   = NVCUDA.getFunctionAddress("cuUserObjectRetain"),
            UserObjectRelease                                  = NVCUDA.getFunctionAddress("cuUserObjectRelease"),
            GraphRetainUserObject                              = NVCUDA.getFunctionAddress("cuGraphRetainUserObject"),
            GraphReleaseUserObject                             = NVCUDA.getFunctionAddress("cuGraphReleaseUserObject"),
            OccupancyMaxActiveBlocksPerMultiprocessor          = NVCUDA.getFunctionAddress("cuOccupancyMaxActiveBlocksPerMultiprocessor"),
            OccupancyMaxActiveBlocksPerMultiprocessorWithFlags = NVCUDA.getFunctionAddress("cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags"),
            OccupancyMaxPotentialBlockSize                     = NVCUDA.getFunctionAddress("cuOccupancyMaxPotentialBlockSize"),
            OccupancyMaxPotentialBlockSizeWithFlags            = NVCUDA.getFunctionAddress("cuOccupancyMaxPotentialBlockSizeWithFlags"),
            OccupancyAvailableDynamicSMemPerBlock              = NVCUDA.getFunctionAddress("cuOccupancyAvailableDynamicSMemPerBlock"),
            TexRefSetArray                                     = apiGetFunctionAddress(NVCUDA, "cuTexRefSetArray"),
            TexRefSetMipmappedArray                            = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmappedArray"),
            TexRefSetAddress                                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuTexRefSetAddress", 2)),
            TexRefSetAddress2D                                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuTexRefSetAddress2D", 3)),
            TexRefSetFormat                                    = apiGetFunctionAddress(NVCUDA, "cuTexRefSetFormat"),
            TexRefSetAddressMode                               = apiGetFunctionAddress(NVCUDA, "cuTexRefSetAddressMode"),
            TexRefSetFilterMode                                = apiGetFunctionAddress(NVCUDA, "cuTexRefSetFilterMode"),
            TexRefSetMipmapFilterMode                          = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmapFilterMode"),
            TexRefSetMipmapLevelBias                           = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmapLevelBias"),
            TexRefSetMipmapLevelClamp                          = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmapLevelClamp"),
            TexRefSetMaxAnisotropy                             = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMaxAnisotropy"),
            TexRefSetBorderColor                               = apiGetFunctionAddress(NVCUDA, "cuTexRefSetBorderColor"),
            TexRefSetFlags                                     = apiGetFunctionAddress(NVCUDA, "cuTexRefSetFlags"),
            TexRefGetAddress                                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuTexRefGetAddress", 2)),
            TexRefGetArray                                     = apiGetFunctionAddress(NVCUDA, "cuTexRefGetArray"),
            TexRefGetMipmappedArray                            = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmappedArray"),
            TexRefGetAddressMode                               = apiGetFunctionAddress(NVCUDA, "cuTexRefGetAddressMode"),
            TexRefGetFilterMode                                = apiGetFunctionAddress(NVCUDA, "cuTexRefGetFilterMode"),
            TexRefGetFormat                                    = apiGetFunctionAddress(NVCUDA, "cuTexRefGetFormat"),
            TexRefGetMipmapFilterMode                          = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmapFilterMode"),
            TexRefGetMipmapLevelBias                           = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmapLevelBias"),
            TexRefGetMipmapLevelClamp                          = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmapLevelClamp"),
            TexRefGetMaxAnisotropy                             = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMaxAnisotropy"),
            TexRefGetBorderColor                               = apiGetFunctionAddress(NVCUDA, "cuTexRefGetBorderColor"),
            TexRefGetFlags                                     = apiGetFunctionAddress(NVCUDA, "cuTexRefGetFlags"),
            TexRefCreate                                       = apiGetFunctionAddress(NVCUDA, "cuTexRefCreate"),
            TexRefDestroy                                      = apiGetFunctionAddress(NVCUDA, "cuTexRefDestroy"),
            SurfRefSetArray                                    = apiGetFunctionAddress(NVCUDA, "cuSurfRefSetArray"),
            SurfRefGetArray                                    = apiGetFunctionAddress(NVCUDA, "cuSurfRefGetArray"),
            TexObjectCreate                                    = NVCUDA.getFunctionAddress("cuTexObjectCreate"),
            TexObjectDestroy                                   = NVCUDA.getFunctionAddress("cuTexObjectDestroy"),
            TexObjectGetResourceDesc                           = NVCUDA.getFunctionAddress("cuTexObjectGetResourceDesc"),
            TexObjectGetTextureDesc                            = NVCUDA.getFunctionAddress("cuTexObjectGetTextureDesc"),
            TexObjectGetResourceViewDesc                       = NVCUDA.getFunctionAddress("cuTexObjectGetResourceViewDesc"),
            SurfObjectCreate                                   = NVCUDA.getFunctionAddress("cuSurfObjectCreate"),
            SurfObjectDestroy                                  = NVCUDA.getFunctionAddress("cuSurfObjectDestroy"),
            SurfObjectGetResourceDesc                          = NVCUDA.getFunctionAddress("cuSurfObjectGetResourceDesc"),
            DeviceCanAccessPeer                                = NVCUDA.getFunctionAddress("cuDeviceCanAccessPeer"),
            CtxEnablePeerAccess                                = NVCUDA.getFunctionAddress("cuCtxEnablePeerAccess"),
            CtxDisablePeerAccess                               = NVCUDA.getFunctionAddress("cuCtxDisablePeerAccess"),
            DeviceGetP2PAttribute                              = NVCUDA.getFunctionAddress("cuDeviceGetP2PAttribute"),
            GraphicsUnregisterResource                         = apiGetFunctionAddress(NVCUDA, "cuGraphicsUnregisterResource"),
            GraphicsSubResourceGetMappedArray                  = apiGetFunctionAddress(NVCUDA, "cuGraphicsSubResourceGetMappedArray"),
            GraphicsResourceGetMappedMipmappedArray            = NVCUDA.getFunctionAddress("cuGraphicsResourceGetMappedMipmappedArray"),
            GraphicsResourceGetMappedPointer                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuGraphicsResourceGetMappedPointer", 2)),
            GraphicsResourceSetMapFlags                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuGraphicsResourceSetMapFlags", 2)),
            GraphicsMapResources                               = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuGraphicsMapResources")),
            GraphicsUnmapResources                             = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuGraphicsUnmapResources")),
            GetProcAddress                                     = NVCUDA.getFunctionAddress("cuGetProcAddress"),
            GetExportTable                                     = apiGetFunctionAddress(NVCUDA, "cuGetExportTable");

    }

    /** Returns the NVCUDA {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVCUDA;
    }

    public static final int CU_IPC_HANDLE_SIZE = 64;

    /**
     * CUDA Ipc Mem Flags. ({@code CUipcMem_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS IPC_MEM_LAZY_ENABLE_PEER_ACCESS} - Automatically enable peer access between remote devices as needed</li>
     * </ul>
     */
    public static final int CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS = 0x1;

    /**
     * CUDA Mem Attach Flags. ({@code CUmemAttach_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL} - Memory can be accessed by any stream on any device</li>
     * <li>{@link #CU_MEM_ATTACH_HOST MEM_ATTACH_HOST} - Memory cannot be accessed by any stream on any device</li>
     * <li>{@link #CU_MEM_ATTACH_SINGLE MEM_ATTACH_SINGLE} - Memory can only be accessed by a single stream on the associated device</li>
     * </ul>
     */
    public static final int
        CU_MEM_ATTACH_GLOBAL = 0x1,
        CU_MEM_ATTACH_HOST   = 0x2,
        CU_MEM_ATTACH_SINGLE = 0x4;

    /**
     * Context creation flags. ({@code CUctx_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO} - Automatic scheduling</li>
     * <li>{@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN} - Set spin as default scheduling</li>
     * <li>{@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD} - Set yield as default scheduling</li>
     * <li>{@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} - Set blocking synchronization as default scheduling</li>
     * <li>{@link #CU_CTX_BLOCKING_SYNC CTX_BLOCKING_SYNC} - Set blocking synchronization as default scheduling. This flag was deprecated as of CUDA 4.0 and was replaced with {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}.</li>
     * <li>{@link #CU_CTX_SCHED_MASK CTX_SCHED_MASK}</li>
     * <li>{@link #CU_CTX_MAP_HOST CTX_MAP_HOST} - 
     * This flag was deprecated as of CUDA 11.0 and it no longer has any effect.
     * 
     * <p>All contexts as of CUDA 3.2 behave as though the flag is enabled.</p>
     * </li>
     * <li>{@link #CU_CTX_LMEM_RESIZE_TO_MAX CTX_LMEM_RESIZE_TO_MAX} - Keep local memory allocation after launch</li>
     * <li>{@link #CU_CTX_FLAGS_MASK CTX_FLAGS_MASK}</li>
     * </ul>
     */
    public static final int
        CU_CTX_SCHED_AUTO          = 0x0,
        CU_CTX_SCHED_SPIN          = 0x1,
        CU_CTX_SCHED_YIELD         = 0x2,
        CU_CTX_SCHED_BLOCKING_SYNC = 0x4,
        CU_CTX_BLOCKING_SYNC       = 0x4,
        CU_CTX_SCHED_MASK          = 0x7,
        CU_CTX_MAP_HOST            = 0x8,
        CU_CTX_LMEM_RESIZE_TO_MAX  = 0x10,
        CU_CTX_FLAGS_MASK          = 0x1F;

    /**
     * Stream creation flags. ({@code CUstream_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_DEFAULT STREAM_DEFAULT} - Default stream flag</li>
     * <li>{@link #CU_STREAM_NON_BLOCKING STREAM_NON_BLOCKING} - Stream does not synchronize with stream 0 (the {@code NULL} stream)</li>
     * </ul>
     */
    public static final int
        CU_STREAM_DEFAULT      = 0x0,
        CU_STREAM_NON_BLOCKING = 0x1;

    /**
     * Legacy stream handle.
     * 
     * <p>Stream handle that can be passed as a {@code CUstream} to use an implicit stream with legacy synchronization behavior.</p>
     */
    public static final long CU_STREAM_LEGACY = 0x1L;

    /**
     * Per-thread stream handle.
     * 
     * <p>Stream handle that can be passed as a {@code CUstream} to use an implicit stream with per-thread synchronization behavior.</p>
     */
    public static final long CU_STREAM_PER_THREAD = 0x2L;

    /**
     * Event creation flags. ({@code CUevent_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EVENT_DEFAULT EVENT_DEFAULT} - Default event flag</li>
     * <li>{@link #CU_EVENT_BLOCKING_SYNC EVENT_BLOCKING_SYNC} - Event uses blocking synchronization</li>
     * <li>{@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} - Event will not record timing data</li>
     * <li>{@link #CU_EVENT_INTERPROCESS EVENT_INTERPROCESS} - Event is suitable for interprocess use. {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} must be set</li>
     * </ul>
     */
    public static final int
        CU_EVENT_DEFAULT        = 0x0,
        CU_EVENT_BLOCKING_SYNC  = 0x1,
        CU_EVENT_DISABLE_TIMING = 0x2,
        CU_EVENT_INTERPROCESS   = 0x4;

    /**
     * Event record flags. ({@code CUevent_record_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EVENT_RECORD_DEFAULT EVENT_RECORD_DEFAULT} - Default event record flag</li>
     * <li>{@link #CU_EVENT_RECORD_EXTERNAL EVENT_RECORD_EXTERNAL} - 
     * When using stream capture, create an event record node instead of the default behavior.
     * 
     * <p>This flag is invalid when used outside of capture.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_EVENT_RECORD_DEFAULT  = 0x0,
        CU_EVENT_RECORD_EXTERNAL = 0x1;

    /**
     * Event wait flags. ({@code CUevent_wait_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EVENT_WAIT_DEFAULT EVENT_WAIT_DEFAULT} - Default event wait flag</li>
     * <li>{@link #CU_EVENT_WAIT_EXTERNAL EVENT_WAIT_EXTERNAL} - 
     * When using stream capture, create an event wait node instead of the default behavior.
     * 
     * <p>This flag is invalid when used outside of capture.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_EVENT_WAIT_DEFAULT  = 0x0,
        CU_EVENT_WAIT_EXTERNAL = 0x1;

    /**
     * Flags for {@link #cuStreamWaitValue32 StreamWaitValue32} and {@link #cuStreamWaitValue64 StreamWaitValue64}. ({@code CUstreamWaitValue_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_WAIT_VALUE_GEQ STREAM_WAIT_VALUE_GEQ} - 
     * Wait until {@code (int32_t)(*addr - value) >= 0} (or {@code int64_t} for 64 bit values). Note this is a cyclic comparison which ignores
     * wraparound. (Default behavior.)
     * </li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_EQ STREAM_WAIT_VALUE_EQ} - Wait until {@code *addr == value}.</li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_AND STREAM_WAIT_VALUE_AND} - Wait until {@code (*addr & value) != 0}.</li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_NOR STREAM_WAIT_VALUE_NOR} - 
     * Wait until {@code ~(*addr | value) != 0}. Support for this operation can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and
     * {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR}.
     * </li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH} - 
     * Follow the wait operation with a flush of outstanding remote writes.
     * 
     * <p>This means that, if a remote write operation is guaranteed to have reached the device before the wait can be satisfied, that write is guaranteed to
     * be visible to downstream device work. The device is permitted to reorder remote writes internally. For example, this flag would be required if two
     * remote writes arrive in a defined order, the wait is satisfied by the second write, and downstream work needs to observe the first write.</p>
     * 
     * <p>Support for this operation is restricted to selected platforms and can be queried with {@code CU_DEVICE_ATTRIBUTE_CAN_USE_WAIT_VALUE_FLUSH}.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_STREAM_WAIT_VALUE_GEQ   = 0x0,
        CU_STREAM_WAIT_VALUE_EQ    = 0x1,
        CU_STREAM_WAIT_VALUE_AND   = 0x2,
        CU_STREAM_WAIT_VALUE_NOR   = 0x3,
        CU_STREAM_WAIT_VALUE_FLUSH = 1<<30;

    /**
     * Flags for {@link #cuStreamWriteValue32 StreamWriteValue32}. ({@code CUstreamWriteValue_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_WRITE_VALUE_DEFAULT STREAM_WRITE_VALUE_DEFAULT} - Default behavior</li>
     * <li>{@link #CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER STREAM_WRITE_VALUE_NO_MEMORY_BARRIER} - 
     * Permits the write to be reordered with writes which were issued before it, as a performance optimization.
     * 
     * <p>Normally, {@link #cuStreamWriteValue32 StreamWriteValue32} will provide a memory fence before the write, which has similar semantics to {@code __threadfence_system()} but is
     * scoped to the stream rather than a CUDA thread.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_STREAM_WRITE_VALUE_DEFAULT           = 0x0,
        CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER = 0x1;

    /**
     * Operations for {@link #cuStreamBatchMemOp StreamBatchMemOp}. ({@code CUstreamBatchMemOpType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_MEM_OP_WAIT_VALUE_32 STREAM_MEM_OP_WAIT_VALUE_32} - Represents a {@link #cuStreamWaitValue32 StreamWaitValue32} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_WRITE_VALUE_32 STREAM_MEM_OP_WRITE_VALUE_32} - Represents a {@link #cuStreamWriteValue32 StreamWriteValue32} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_WAIT_VALUE_64 STREAM_MEM_OP_WAIT_VALUE_64} - Represents a {@link #cuStreamWaitValue64 StreamWaitValue64} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_WRITE_VALUE_64 STREAM_MEM_OP_WRITE_VALUE_64} - Represents a {@link #cuStreamWriteValue64 StreamWriteValue64} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES STREAM_MEM_OP_FLUSH_REMOTE_WRITES} - This has the same effect as {@link #CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH}, but as a standalone operation.</li>
     * </ul>
     */
    public static final int
        CU_STREAM_MEM_OP_WAIT_VALUE_32       = 0x1,
        CU_STREAM_MEM_OP_WRITE_VALUE_32      = 0x2,
        CU_STREAM_MEM_OP_WAIT_VALUE_64       = 0x4,
        CU_STREAM_MEM_OP_WRITE_VALUE_64      = 0x5,
        CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES = 0x3;

    /**
     * Occupancy calculator flag. ({@code CUoccupancy_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_OCCUPANCY_DEFAULT OCCUPANCY_DEFAULT} - Default behavior</li>
     * <li>{@link #CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE OCCUPANCY_DISABLE_CACHING_OVERRIDE} - Assume global caching is enabled and cannot be automatically turned off</li>
     * </ul>
     */
    public static final int
        CU_OCCUPANCY_DEFAULT                  = 0x0,
        CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE = 0x1;

    /**
     * Flags for {@link #cuStreamUpdateCaptureDependencies StreamUpdateCaptureDependencies}). ({@code CUstreamUpdateCaptureDependencies_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_ADD_CAPTURE_DEPENDENCIES STREAM_ADD_CAPTURE_DEPENDENCIES} - Add new nodes to the dependency set</li>
     * <li>{@link #CU_STREAM_SET_CAPTURE_DEPENDENCIES STREAM_SET_CAPTURE_DEPENDENCIES} - Replace the dependency set with the new nodes</li>
     * </ul>
     */
    public static final int
        CU_STREAM_ADD_CAPTURE_DEPENDENCIES = 0x0,
        CU_STREAM_SET_CAPTURE_DEPENDENCIES = 0x1;

    /**
     * Array formats. ({@code CUarray_format})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_AD_FORMAT_UNSIGNED_INT8 AD_FORMAT_UNSIGNED_INT8} - Unsigned 8-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_UNSIGNED_INT16 AD_FORMAT_UNSIGNED_INT16} - Unsigned 16-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_UNSIGNED_INT32 AD_FORMAT_UNSIGNED_INT32} - Unsigned 32-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_SIGNED_INT8 AD_FORMAT_SIGNED_INT8} - Signed 8-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_SIGNED_INT16 AD_FORMAT_SIGNED_INT16} - Signed 16-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_SIGNED_INT32 AD_FORMAT_SIGNED_INT32} - Signed 32-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_HALF AD_FORMAT_HALF} - 16-bit floating point</li>
     * <li>{@link #CU_AD_FORMAT_FLOAT AD_FORMAT_FLOAT} - 32-bit floating point</li>
     * <li>{@link #CU_AD_FORMAT_NV12 AD_FORMAT_NV12} - 8-bit YUV planar format, with 4:2:0 sampling</li>
     * <li>{@link #CU_AD_FORMAT_UNORM_INT8X1 AD_FORMAT_UNORM_INT8X1} - 1 channel unsigned 8-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_UNORM_INT8X2 AD_FORMAT_UNORM_INT8X2} - 2 channel unsigned 8-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_UNORM_INT8X4 AD_FORMAT_UNORM_INT8X4} - 4 channel unsigned 8-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_UNORM_INT16X1 AD_FORMAT_UNORM_INT16X1} - 1 channel unsigned 16-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_UNORM_INT16X2 AD_FORMAT_UNORM_INT16X2} - 2 channel unsigned 16-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_UNORM_INT16X4 AD_FORMAT_UNORM_INT16X4} - 4 channel unsigned 16-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_SNORM_INT8X1 AD_FORMAT_SNORM_INT8X1} - 1 channel signed 8-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_SNORM_INT8X2 AD_FORMAT_SNORM_INT8X2} - 2 channel signed 8-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_SNORM_INT8X4 AD_FORMAT_SNORM_INT8X4} - 4 channel signed 8-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_SNORM_INT16X1 AD_FORMAT_SNORM_INT16X1} - 1 channel signed 16-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_SNORM_INT16X2 AD_FORMAT_SNORM_INT16X2} - 2 channel signed 16-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_SNORM_INT16X4 AD_FORMAT_SNORM_INT16X4} - 4 channel signed 16-bit normalized integer</li>
     * <li>{@link #CU_AD_FORMAT_BC1_UNORM AD_FORMAT_BC1_UNORM} - 4 channel unsigned normalized block-compressed (BC1 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC1_UNORM_SRGB AD_FORMAT_BC1_UNORM_SRGB} - 4 channel unsigned normalized block-compressed (BC1 compression) format with sRGB encoding</li>
     * <li>{@link #CU_AD_FORMAT_BC2_UNORM AD_FORMAT_BC2_UNORM} - 4 channel unsigned normalized block-compressed (BC2 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC2_UNORM_SRGB AD_FORMAT_BC2_UNORM_SRGB} - 4 channel unsigned normalized block-compressed (BC2 compression) format with sRGB encoding</li>
     * <li>{@link #CU_AD_FORMAT_BC3_UNORM AD_FORMAT_BC3_UNORM} - 4 channel unsigned normalized block-compressed (BC3 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC3_UNORM_SRGB AD_FORMAT_BC3_UNORM_SRGB} - 4 channel unsigned normalized block-compressed (BC3 compression) format with sRGB encoding</li>
     * <li>{@link #CU_AD_FORMAT_BC4_UNORM AD_FORMAT_BC4_UNORM} - 1 channel unsigned normalized block-compressed (BC4 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC4_SNORM AD_FORMAT_BC4_SNORM} - 1 channel signed normalized block-compressed (BC4 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC5_UNORM AD_FORMAT_BC5_UNORM} - 2 channel unsigned normalized block-compressed (BC5 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC5_SNORM AD_FORMAT_BC5_SNORM} - 2 channel signed normalized block-compressed (BC5 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC6H_UF16 AD_FORMAT_BC6H_UF16} - 3 channel unsigned half-float block-compressed (BC6H compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC6H_SF16 AD_FORMAT_BC6H_SF16} - 3 channel signed half-float block-compressed (BC6H compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC7_UNORM AD_FORMAT_BC7_UNORM} - 4 channel unsigned normalized block-compressed (BC7 compression) format</li>
     * <li>{@link #CU_AD_FORMAT_BC7_UNORM_SRGB AD_FORMAT_BC7_UNORM_SRGB} - 4 channel unsigned normalized block-compressed (BC7 compression) format with sRGB encoding</li>
     * </ul>
     */
    public static final int
        CU_AD_FORMAT_UNSIGNED_INT8  = 0x01,
        CU_AD_FORMAT_UNSIGNED_INT16 = 0x02,
        CU_AD_FORMAT_UNSIGNED_INT32 = 0x03,
        CU_AD_FORMAT_SIGNED_INT8    = 0x08,
        CU_AD_FORMAT_SIGNED_INT16   = 0x09,
        CU_AD_FORMAT_SIGNED_INT32   = 0x0a,
        CU_AD_FORMAT_HALF           = 0x10,
        CU_AD_FORMAT_FLOAT          = 0x20,
        CU_AD_FORMAT_NV12           = 0xb0,
        CU_AD_FORMAT_UNORM_INT8X1   = 0xc0,
        CU_AD_FORMAT_UNORM_INT8X2   = 0xc1,
        CU_AD_FORMAT_UNORM_INT8X4   = 0xc2,
        CU_AD_FORMAT_UNORM_INT16X1  = 0xc3,
        CU_AD_FORMAT_UNORM_INT16X2  = 0xc4,
        CU_AD_FORMAT_UNORM_INT16X4  = 0xc5,
        CU_AD_FORMAT_SNORM_INT8X1   = 0xc6,
        CU_AD_FORMAT_SNORM_INT8X2   = 0xc7,
        CU_AD_FORMAT_SNORM_INT8X4   = 0xc8,
        CU_AD_FORMAT_SNORM_INT16X1  = 0xc9,
        CU_AD_FORMAT_SNORM_INT16X2  = 0xca,
        CU_AD_FORMAT_SNORM_INT16X4  = 0xcb,
        CU_AD_FORMAT_BC1_UNORM      = 0x91,
        CU_AD_FORMAT_BC1_UNORM_SRGB = 0x92,
        CU_AD_FORMAT_BC2_UNORM      = 0x93,
        CU_AD_FORMAT_BC2_UNORM_SRGB = 0x94,
        CU_AD_FORMAT_BC3_UNORM      = 0x95,
        CU_AD_FORMAT_BC3_UNORM_SRGB = 0x96,
        CU_AD_FORMAT_BC4_UNORM      = 0x97,
        CU_AD_FORMAT_BC4_SNORM      = 0x98,
        CU_AD_FORMAT_BC5_UNORM      = 0x99,
        CU_AD_FORMAT_BC5_SNORM      = 0x9a,
        CU_AD_FORMAT_BC6H_UF16      = 0x9b,
        CU_AD_FORMAT_BC6H_SF16      = 0x9c,
        CU_AD_FORMAT_BC7_UNORM      = 0x9d,
        CU_AD_FORMAT_BC7_UNORM_SRGB = 0x9e;

    /**
     * Texture reference addressing modes. ({@code CUaddress_mode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TR_ADDRESS_MODE_WRAP TR_ADDRESS_MODE_WRAP} - Wrapping address mode</li>
     * <li>{@link #CU_TR_ADDRESS_MODE_CLAMP TR_ADDRESS_MODE_CLAMP} - Clamp to edge address mode</li>
     * <li>{@link #CU_TR_ADDRESS_MODE_MIRROR TR_ADDRESS_MODE_MIRROR} - Mirror address mode</li>
     * <li>{@link #CU_TR_ADDRESS_MODE_BORDER TR_ADDRESS_MODE_BORDER} - Border address mode</li>
     * </ul>
     */
    public static final int
        CU_TR_ADDRESS_MODE_WRAP   = 0x0,
        CU_TR_ADDRESS_MODE_CLAMP  = 0x1,
        CU_TR_ADDRESS_MODE_MIRROR = 0x2,
        CU_TR_ADDRESS_MODE_BORDER = 0x3;

    /**
     * Texture reference filtering modes. ({@code CUfilter_mode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TR_FILTER_MODE_POINT TR_FILTER_MODE_POINT} - Point filter mode</li>
     * <li>{@link #CU_TR_FILTER_MODE_LINEAR TR_FILTER_MODE_LINEAR} - Linear filter mode</li>
     * </ul>
     */
    public static final int
        CU_TR_FILTER_MODE_POINT  = 0x0,
        CU_TR_FILTER_MODE_LINEAR = 0x1;

    /**
     * Device properties. ({@code CUdevice_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK} - Maximum number of threads per block</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X} - Maximum block dimension X</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y} - Maximum block dimension Y</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z} - Maximum block dimension Z</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_X DEVICE_ATTRIBUTE_MAX_GRID_DIM_X} - Maximum grid dimension X</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y} - Maximum grid dimension Y</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z} - Maximum grid dimension Z</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK} - Maximum shared memory available per block in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY} - Memory available on device for __constant__ variables in a CUDA C kernel in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_WARP_SIZE DEVICE_ATTRIBUTE_WARP_SIZE} - Warp size in threads</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH} - Maximum pitch in bytes allowed by memory copies</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK} - Maximum number of 32-bit registers available per block</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CLOCK_RATE DEVICE_ATTRIBUTE_CLOCK_RATE} - Typical clock frequency in kilohertz</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT} - Alignment requirement for textures</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GPU_OVERLAP DEVICE_ATTRIBUTE_GPU_OVERLAP} - Device can possibly copy memory and execute a kernel concurrently. Deprecated. Use instead {@link #CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT}.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT} - Number of multiprocessors on device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT} - Specifies whether there is a run time limit on kernels</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_INTEGRATED DEVICE_ATTRIBUTE_INTEGRATED} - Device is integrated with host memory</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY} - Device can map host memory into CUDA address space</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_MODE DEVICE_ATTRIBUTE_COMPUTE_MODE} - Compute mode (See {@code CUcomputemode} for details)</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH} - Maximum 1D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH} - Maximum 2D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT} - Maximum 2D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH} - Maximum 3D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT} - Maximum 3D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH} - Maximum 3D texture depth</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH} - Maximum 2D layered texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT} - Maximum 2D layered texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS} - Maximum layers in a 2D layered texture</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT} - Alignment requirement for surfaces</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_KERNELS DEVICE_ATTRIBUTE_CONCURRENT_KERNELS} - Device can possibly execute multiple kernels concurrently</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_ECC_ENABLED DEVICE_ATTRIBUTE_ECC_ENABLED} - Device has ECC support enabled</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PCI_BUS_ID DEVICE_ATTRIBUTE_PCI_BUS_ID} - PCI bus ID of the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PCI_DEVICE_ID DEVICE_ATTRIBUTE_PCI_DEVICE_ID} - PCI device ID of the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TCC_DRIVER DEVICE_ATTRIBUTE_TCC_DRIVER} - Device is using TCC driver model</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE} - Peak memory clock frequency in kilohertz</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH} - Global memory bus width in bits</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_L2_CACHE_SIZE DEVICE_ATTRIBUTE_L2_CACHE_SIZE} - Size of L2 cache in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR} - Maximum resident threads per multiprocessor</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT} - Number of asynchronous engines</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING} - Device shares a unified address space with the host</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH} - Maximum 1D layered texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS} - Maximum layers in a 1D layered texture</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER} - Deprecated, do not use.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH} - Maximum 2D texture width if {@link #CUDA_ARRAY3D_TEXTURE_GATHER} is set</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT} - Maximum 2D texture height if {@link #CUDA_ARRAY3D_TEXTURE_GATHER} is set</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE} - Alternate maximum 3D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE} - Alternate maximum 3D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE} - Alternate maximum 3D texture depth</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PCI_DOMAIN_ID DEVICE_ATTRIBUTE_PCI_DOMAIN_ID} - PCI domain ID of the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT} - Pitch alignment requirement for textures</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH} - Maximum cubemap texture width/height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH} - Maximum cubemap layered texture width/height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS} - Maximum layers in a cubemap layered texture</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH} - Maximum 1D surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH} - Maximum 2D surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT} - Maximum 2D surface height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH} - Maximum 3D surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT} - Maximum 3D surface height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH} - Maximum 3D surface depth</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH} - Maximum 1D layered surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS} - Maximum layers in a 1D layered surface</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH} - Maximum 2D layered surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT} - Maximum 2D layered surface height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS} - Maximum layers in a 2D layered surface</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH} - Maximum cubemap surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH} - Maximum cubemap layered surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS} - Maximum layers in a cubemap layered surface</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH} - Deprecated, do not use. Use {@code cudaDeviceGetTexture1DLinearMaxWidth()} or {@link #cuDeviceGetTexture1DLinearMaxWidth DeviceGetTexture1DLinearMaxWidth} instead.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH} - Maximum 2D linear texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT} - Maximum 2D linear texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH} - Maximum 2D linear texture pitch in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH} - Maximum mipmapped 2D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT} - Maximum mipmapped 2D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR} - Major compute capability version number</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR} - Minor compute capability version number</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH} - Maximum mipmapped 1D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED} - Device supports stream priorities</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED} - Device supports caching globals in L1</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED} - Device supports caching locals in L1</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR} - Maximum shared memory available per multiprocessor in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR} - Maximum number of 32-bit registers available per multiprocessor</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY DEVICE_ATTRIBUTE_MANAGED_MEMORY} - Device can allocate managed memory on this system</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD DEVICE_ATTRIBUTE_MULTI_GPU_BOARD} - Device is on a multi-GPU board</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID} - Unique id for a group of devices on the same multi-GPU board</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED} - 
     * Link between the device and the host supports native atomic operations (this is a placeholder attribute, and is not supported on any current
     * hardware)
     * </li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO} - Ratio of single precision performance (in floating-point operations per second) to double precision performance</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS} - Device supports coherently accessing pageable memory without calling cudaHostRegister on it</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} - Device can coherently access managed memory concurrently with the CPU</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED} - Device supports compute preemption.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM} - Device can access host registered memory at the same virtual address as the CPU</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS} - {@link #cuStreamBatchMemOp StreamBatchMemOp} and related APIs are supported.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS} - 64-bit operations are supported in {@link #cuStreamBatchMemOp StreamBatchMemOp} and related APIs.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR} - {@link #CU_STREAM_WAIT_VALUE_NOR STREAM_WAIT_VALUE_NOR} is supported.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH} - Device supports launching cooperative kernels via {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH} - Deprecated, {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} is deprecated.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN} - Maximum optin shared memory per block</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES} - 
     * The {@link #CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH} flag and the {@link #CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES STREAM_MEM_OP_FLUSH_REMOTE_WRITES} MemOp are supported on the device. See {@code CUDA_MEMOP} for
     * additional details.
     * </li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED} - Device supports host memory registration via {@code cudaHostRegister()}.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES} - Device accesses pageable memory via the host's page tables.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST} - The host can directly access managed memory on the device without migration.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_VIRTUAL_ADDRESS_MANAGEMENT_SUPPORTED DEVICE_ATTRIBUTE_VIRTUAL_ADDRESS_MANAGEMENT_SUPPORTED} - Deprecated, Use {@link #CU_DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED} - Device supports virtual memory management APIs like {@link #cuMemAddressReserve MemAddressReserve}, {@link #cuMemCreate MemCreate}, {@link #cuMemMap MemMap} and related APIs</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR_SUPPORTED DEVICE_ATTRIBUTE_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR_SUPPORTED} - Device supports exporting memory to a posix file descriptor with {@link #cuMemExportToShareableHandle MemExportToShareableHandle}, if requested via {@link #cuMemCreate MemCreate}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_HANDLE_SUPPORTED DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_HANDLE_SUPPORTED} - Device supports exporting memory to a Win32 NT handle with {@link #cuMemExportToShareableHandle MemExportToShareableHandle}, if requested via {@link #cuMemCreate MemCreate}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_KMT_HANDLE_SUPPORTED DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_KMT_HANDLE_SUPPORTED} - Device supports exporting memory to a Win32 KMT handle with {@link #cuMemExportToShareableHandle MemExportToShareableHandle}, if requested via {@link #cuMemCreate MemCreate}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCKS_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_BLOCKS_PER_MULTIPROCESSOR} - Maximum number of blocks per multiprocessor</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GENERIC_COMPRESSION_SUPPORTED DEVICE_ATTRIBUTE_GENERIC_COMPRESSION_SUPPORTED} - Device supports compression of memory</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_PERSISTING_L2_CACHE_SIZE DEVICE_ATTRIBUTE_MAX_PERSISTING_L2_CACHE_SIZE} - Maximum L2 persisting lines capacity setting in bytes.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE} - Maximum value of {@link CUaccessPolicyWindow}{@code {@code num_bytes}}.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WITH_CUDA_VMM_SUPPORTED DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WITH_CUDA_VMM_SUPPORTED} - Device supports specifying the GPUDirect RDMA flag with {@link #cuMemCreate MemCreate}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_RESERVED_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_RESERVED_SHARED_MEMORY_PER_BLOCK} - Shared memory reserved by CUDA driver per block in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SPARSE_CUDA_ARRAY_SUPPORTED DEVICE_ATTRIBUTE_SPARSE_CUDA_ARRAY_SUPPORTED} - Device supports sparse CUDA arrays and sparse CUDA mipmapped arrays</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED} - Device supports using the {@link #cuMemHostRegister MemHostRegister} flag {@link #CU_MEMHOSTREGISTER_READ_ONLY MEMHOSTREGISTER_READ_ONLY} to register memory that must be mapped as read-only to the GPU</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TIMELINE_SEMAPHORE_INTEROP_SUPPORTED DEVICE_ATTRIBUTE_TIMELINE_SEMAPHORE_INTEROP_SUPPORTED} - External timeline semaphore interop is supported on the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MEMORY_POOLS_SUPPORTED DEVICE_ATTRIBUTE_MEMORY_POOLS_SUPPORTED} - Device supports using the {@link #cuMemAllocAsync MemAllocAsync} and {@code cuMemPool*} family of APIs</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_SUPPORTED DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_SUPPORTED} - Device supports GPUDirect RDMA APIs, like nvidia_p2p_get_pages (see <a target="_blank" href="https://docs.nvidia.com/cuda/gpudirect-rdma">https://docs.nvidia.com/cuda/gpudirect-rdma</a> for more information)</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS} - 
     * The returned attribute shall be interpreted as a bitmask, where the individual bits are described by the {@code CUflushGPUDirectRDMAWritesOptions}
     * enum
     * </li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING} - 
     * GPUDirect RDMA writes to the device do not need to be flushed for consumers within the scope indicated by the returned attribute. See
     * {@code CUGPUDirectRDMAWritesOrdering} for the numerical values returned here.
     * </li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MEMPOOL_SUPPORTED_HANDLE_TYPES DEVICE_ATTRIBUTE_MEMPOOL_SUPPORTED_HANDLE_TYPES} - Handle types supported with mempool based IPC</li>
     * </ul>
     */
    public static final int
        CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK                        = 1,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X                              = 2,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y                              = 3,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z                              = 4,
        CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_X                               = 5,
        CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y                               = 6,
        CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z                               = 7,
        CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK                  = 8,
        CU_DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK                      = 8,
        CU_DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY                        = 9,
        CU_DEVICE_ATTRIBUTE_WARP_SIZE                                    = 10,
        CU_DEVICE_ATTRIBUTE_MAX_PITCH                                    = 11,
        CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK                      = 12,
        CU_DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK                          = 12,
        CU_DEVICE_ATTRIBUTE_CLOCK_RATE                                   = 13,
        CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT                            = 14,
        CU_DEVICE_ATTRIBUTE_GPU_OVERLAP                                  = 15,
        CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT                         = 16,
        CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT                          = 17,
        CU_DEVICE_ATTRIBUTE_INTEGRATED                                   = 18,
        CU_DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY                          = 19,
        CU_DEVICE_ATTRIBUTE_COMPUTE_MODE                                 = 20,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH                      = 21,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH                      = 22,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT                     = 23,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH                      = 24,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT                     = 25,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH                      = 26,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH              = 27,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT             = 28,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS             = 29,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH                = 27,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT               = 28,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES            = 29,
        CU_DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT                            = 30,
        CU_DEVICE_ATTRIBUTE_CONCURRENT_KERNELS                           = 31,
        CU_DEVICE_ATTRIBUTE_ECC_ENABLED                                  = 32,
        CU_DEVICE_ATTRIBUTE_PCI_BUS_ID                                   = 33,
        CU_DEVICE_ATTRIBUTE_PCI_DEVICE_ID                                = 34,
        CU_DEVICE_ATTRIBUTE_TCC_DRIVER                                   = 35,
        CU_DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE                            = 36,
        CU_DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH                      = 37,
        CU_DEVICE_ATTRIBUTE_L2_CACHE_SIZE                                = 38,
        CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR               = 39,
        CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT                           = 40,
        CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING                           = 41,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH              = 42,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS             = 43,
        CU_DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER                             = 44,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH               = 45,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT              = 46,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE            = 47,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE           = 48,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE            = 49,
        CU_DEVICE_ATTRIBUTE_PCI_DOMAIN_ID                                = 50,
        CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT                      = 51,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH                 = 52,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH         = 53,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS        = 54,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH                      = 55,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH                      = 56,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT                     = 57,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH                      = 58,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT                     = 59,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH                      = 60,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH              = 61,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS             = 62,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH              = 63,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT             = 64,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS             = 65,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH                 = 66,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH         = 67,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS        = 68,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH               = 69,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH               = 70,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT              = 71,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH               = 72,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH            = 73,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT           = 74,
        CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR                     = 75,
        CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR                     = 76,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH            = 77,
        CU_DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED                  = 78,
        CU_DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED                    = 79,
        CU_DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED                     = 80,
        CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR         = 81,
        CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR             = 82,
        CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY                               = 83,
        CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD                              = 84,
        CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID                     = 85,
        CU_DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED                 = 86,
        CU_DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO        = 87,
        CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS                       = 88,
        CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS                    = 89,
        CU_DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED                 = 90,
        CU_DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM      = 91,
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS                       = 92,
        CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS                = 93,
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR                = 94,
        CU_DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH                           = 95,
        CU_DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH              = 96,
        CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN            = 97,
        CU_DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES                      = 98,
        CU_DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED                      = 99,
        CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES = 100,
        CU_DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST          = 101,
        CU_DEVICE_ATTRIBUTE_VIRTUAL_ADDRESS_MANAGEMENT_SUPPORTED         = 102,
        CU_DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED          = 102,
        CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR_SUPPORTED  = 103,
        CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_HANDLE_SUPPORTED           = 104,
        CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_KMT_HANDLE_SUPPORTED       = 105,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCKS_PER_MULTIPROCESSOR                = 106,
        CU_DEVICE_ATTRIBUTE_GENERIC_COMPRESSION_SUPPORTED                = 107,
        CU_DEVICE_ATTRIBUTE_MAX_PERSISTING_L2_CACHE_SIZE                 = 108,
        CU_DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE                = 109,
        CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WITH_CUDA_VMM_SUPPORTED      = 110,
        CU_DEVICE_ATTRIBUTE_RESERVED_SHARED_MEMORY_PER_BLOCK             = 111,
        CU_DEVICE_ATTRIBUTE_SPARSE_CUDA_ARRAY_SUPPORTED                  = 112,
        CU_DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED            = 113,
        CU_DEVICE_ATTRIBUTE_TIMELINE_SEMAPHORE_INTEROP_SUPPORTED         = 114,
        CU_DEVICE_ATTRIBUTE_MEMORY_POOLS_SUPPORTED                       = 115,
        CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_SUPPORTED                    = 116,
        CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS         = 117,
        CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING              = 118,
        CU_DEVICE_ATTRIBUTE_MEMPOOL_SUPPORTED_HANDLE_TYPES               = 119;

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
     * <li>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS} - A pair of tokens for use with the {@code nv-p2p.h} Linux kernel interface</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS} - Synchronize every synchronous memory operation initiated on this region</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID} - A process-wide unique ID for an allocated memory region</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED} - Indicates if the pointer points to managed memory</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL} - A device ordinal of a device on which a pointer was allocated or registered</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE} - 1 if this pointer maps to an allocation that is suitable for {@code cudaIpcGetMemHandle()}, 0 otherwise</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_START_ADDR POINTER_ATTRIBUTE_RANGE_START_ADDR} - Starting address for this requested pointer</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_SIZE POINTER_ATTRIBUTE_RANGE_SIZE} - Size of the address range for this requested pointer</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MAPPED POINTER_ATTRIBUTE_MAPPED} - 1 if this pointer is in a valid address range that is mapped to a backing allocation, 0 otherwise</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES} - Bitmask of allowed {@code CUmemAllocationHandleType} for this allocation</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE} - 1 if the memory this pointer is referencing can be used with the GPUDirect RDMA API</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAGS POINTER_ATTRIBUTE_ACCESS_FLAGS} - Returns the access flags the device associated with the current context has on the corresponding memory referenced by the pointer given</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE POINTER_ATTRIBUTE_MEMPOOL_HANDLE} - Returns the {@code mempoo}l handle for the allocation if it was allocated from a {@code mempool}. Otherwise returns {@code NULL}.</li>
     * </ul>
     */
    public static final int
        CU_POINTER_ATTRIBUTE_CONTEXT                    = 1,
        CU_POINTER_ATTRIBUTE_MEMORY_TYPE                = 2,
        CU_POINTER_ATTRIBUTE_DEVICE_POINTER             = 3,
        CU_POINTER_ATTRIBUTE_HOST_POINTER               = 4,
        CU_POINTER_ATTRIBUTE_P2P_TOKENS                 = 5,
        CU_POINTER_ATTRIBUTE_SYNC_MEMOPS                = 6,
        CU_POINTER_ATTRIBUTE_BUFFER_ID                  = 7,
        CU_POINTER_ATTRIBUTE_IS_MANAGED                 = 8,
        CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL             = 9,
        CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE = 10,
        CU_POINTER_ATTRIBUTE_RANGE_START_ADDR           = 11,
        CU_POINTER_ATTRIBUTE_RANGE_SIZE                 = 12,
        CU_POINTER_ATTRIBUTE_MAPPED                     = 13,
        CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES       = 14,
        CU_POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE = 15,
        CU_POINTER_ATTRIBUTE_ACCESS_FLAGS               = 16,
        CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE             = 17;

    /**
     * Function properties. ({@code CUfunction_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK} - 
     * The maximum number of threads per block, beyond which a launch of the function would fail. This number depends on both the function and the device
     * on which the function is currently loaded.
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_SHARED_SIZE_BYTES} - 
     * The size in bytes of statically-allocated shared memory required by this function. This does not include dynamically-allocated shared memory
     * requested by the user at runtime.
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES FUNC_ATTRIBUTE_CONST_SIZE_BYTES} - The size in bytes of user-allocated constant memory required by this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES} - The size in bytes of local memory used by each thread of this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_NUM_REGS FUNC_ATTRIBUTE_NUM_REGS} - The number of registers used by each thread of this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PTX_VERSION FUNC_ATTRIBUTE_PTX_VERSION} - 
     * The PTX virtual architecture version for which the function was compiled.
     * 
     * <p>This value is the major PTX {@code version * 10 + the minor PTX version}, so a PTX version 1.3 function would return the value 13. Note that this
     * may return the undefined value of 0 for cubins compiled prior to CUDA 3.0.</p>
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_BINARY_VERSION FUNC_ATTRIBUTE_BINARY_VERSION} - 
     * The binary architecture version for which the function was compiled.
     * 
     * <p>This value is the {@code major binary version * 10 + the minor binary version}, so a binary version 1.3 function would return the value 13. Note
     * that this will return a value of 10 for legacy cubins that do not have a properly-encoded binary architecture version.</p>
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_CACHE_MODE_CA FUNC_ATTRIBUTE_CACHE_MODE_CA} - The attribute to indicate whether the function has been compiled with user specified option {@code "-Xptxas --dlcm=ca"} set.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES} - 
     * The maximum size in bytes of dynamically-allocated shared memory that can be used by this function.
     * 
     * <p>If the user-specified dynamic shared memory size is larger than this value, the launch will fail.</p>
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT} - 
     * On devices where the L1 cache and shared memory use the same hardware resources, this sets the shared memory carveout preference, in percent of the total shared memory. Refer to {@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR}.
     * 
     * <p>This is only a hint, and the driver can choose a different ratio if required to execute the function.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK            = 0x0,
        CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES                = 0x1,
        CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES                 = 0x2,
        CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES                 = 0x3,
        CU_FUNC_ATTRIBUTE_NUM_REGS                         = 0x4,
        CU_FUNC_ATTRIBUTE_PTX_VERSION                      = 0x5,
        CU_FUNC_ATTRIBUTE_BINARY_VERSION                   = 0x6,
        CU_FUNC_ATTRIBUTE_CACHE_MODE_CA                    = 0x7,
        CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES    = 0x8,
        CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT = 0x9;

    /**
     * Function cache configurations. ({@code CUfunc_cache})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_CACHE_PREFER_NONE FUNC_CACHE_PREFER_NONE} - no preference for shared memory or L1 (default)</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_SHARED FUNC_CACHE_PREFER_SHARED} - prefer larger shared memory and smaller L1 cache</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_L1 FUNC_CACHE_PREFER_L1} - prefer larger L1 cache and smaller shared memory</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_EQUAL FUNC_CACHE_PREFER_EQUAL} - prefer equal sized L1 cache and shared memory</li>
     * </ul>
     */
    public static final int
        CU_FUNC_CACHE_PREFER_NONE   = 0x0,
        CU_FUNC_CACHE_PREFER_SHARED = 0x1,
        CU_FUNC_CACHE_PREFER_L1     = 0x2,
        CU_FUNC_CACHE_PREFER_EQUAL  = 0x3;

    /**
     * Shared memory configurations. ({@code CUsharedconfig})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE} - set default shared memory bank size</li>
     * <li>{@link #CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE} - set shared memory bank width to four bytes</li>
     * <li>{@link #CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE} - set shared memory bank width to eight bytes</li>
     * </ul>
     */
    public static final int
        CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE    = 0x0,
        CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE  = 0x1,
        CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE = 0x2;

    /**
     * Shared memory carveout configurations. ({@code CUshared_carveout})
     * 
     * <p>These may be passed to {@link #cuFuncSetAttribute FuncSetAttribute}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_SHAREDMEM_CARVEOUT_DEFAULT SHAREDMEM_CARVEOUT_DEFAULT} - no preference for shared memory or L1 (default)</li>
     * <li>{@link #CU_SHAREDMEM_CARVEOUT_MAX_SHARED SHAREDMEM_CARVEOUT_MAX_SHARED} - prefer maximum available shared memory, minimum L1 cache</li>
     * <li>{@link #CU_SHAREDMEM_CARVEOUT_MAX_L1 SHAREDMEM_CARVEOUT_MAX_L1} - prefer maximum available L1 cache, minimum shared memory</li>
     * </ul>
     */
    public static final int
        CU_SHAREDMEM_CARVEOUT_DEFAULT    = 0xFFFFFFFF,
        CU_SHAREDMEM_CARVEOUT_MAX_SHARED = 0x64,
        CU_SHAREDMEM_CARVEOUT_MAX_L1     = 0x0;

    /**
     * Memory types. ({@code CUmemorytype})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST} - Host memory</li>
     * <li>{@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE} - Device memory</li>
     * <li>{@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY} - Array memory</li>
     * <li>{@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED} - Unified device or host memory</li>
     * </ul>
     */
    public static final int
        CU_MEMORYTYPE_HOST    = 0x1,
        CU_MEMORYTYPE_DEVICE  = 0x2,
        CU_MEMORYTYPE_ARRAY   = 0x3,
        CU_MEMORYTYPE_UNIFIED = 0x4;

    /**
     * Compute Modes. ({@code CUcomputemode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_COMPUTEMODE_DEFAULT COMPUTEMODE_DEFAULT} - Default compute mode (Multiple contexts allowed per device)</li>
     * <li>{@link #CU_COMPUTEMODE_PROHIBITED COMPUTEMODE_PROHIBITED} - Compute-prohibited mode (No contexts can be created on this device at this time)</li>
     * <li>{@link #CU_COMPUTEMODE_EXCLUSIVE_PROCESS COMPUTEMODE_EXCLUSIVE_PROCESS} - Compute-exclusive-process mode (Only one context used by a single process can be present on this device at a time)</li>
     * </ul>
     */
    public static final int
        CU_COMPUTEMODE_DEFAULT           = 0x0,
        CU_COMPUTEMODE_PROHIBITED        = 0x2,
        CU_COMPUTEMODE_EXCLUSIVE_PROCESS = 0x3;

    /**
     * Memory advise values. ({@code CUmem_advise})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY} - Data will mostly be read and only occassionally be written to</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_READ_MOSTLY MEM_ADVISE_UNSET_READ_MOSTLY} - Undo the effect of {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY}</li>
     * <li>{@link #CU_MEM_ADVISE_SET_PREFERRED_LOCATION MEM_ADVISE_SET_PREFERRED_LOCATION} - Set the preferred location for the data as the specified device</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_PREFERRED_LOCATION MEM_ADVISE_UNSET_PREFERRED_LOCATION} - Clear the preferred location for the data</li>
     * <li>{@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} - Data will be accessed by the specified device, so prevent page faults as much as possible</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_ACCESSED_BY MEM_ADVISE_UNSET_ACCESSED_BY} - Let the Unified Memory subsystem decide on the page faulting policy for the specified device</li>
     * </ul>
     */
    public static final int
        CU_MEM_ADVISE_SET_READ_MOSTLY          = 0x1,
        CU_MEM_ADVISE_UNSET_READ_MOSTLY        = 0x2,
        CU_MEM_ADVISE_SET_PREFERRED_LOCATION   = 0x3,
        CU_MEM_ADVISE_UNSET_PREFERRED_LOCATION = 0x4,
        CU_MEM_ADVISE_SET_ACCESSED_BY          = 0x5,
        CU_MEM_ADVISE_UNSET_ACCESSED_BY        = 0x6;

    /**
     * ({@code CUmem_range_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY MEM_RANGE_ATTRIBUTE_READ_MOSTLY} - Whether the range will mostly be read and only occassionally be written to</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION} - The preferred location of the range</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY MEM_RANGE_ATTRIBUTE_ACCESSED_BY} - Memory range has {@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} set for specified device</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION} - The last location to which the range was prefetched</li>
     * </ul>
     */
    public static final int
        CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY            = 0x1,
        CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION     = 0x2,
        CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY            = 0x3,
        CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION = 0x4;

    /**
     * Online compiler and linker options. ({@code CUjit_option})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_JIT_MAX_REGISTERS JIT_MAX_REGISTERS} - 
     * Max number of registers that a thread may use.
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_THREADS_PER_BLOCK JIT_THREADS_PER_BLOCK} - 
     * IN: Specifies minimum number of threads per block to target compilation for
     * 
     * <p>OUT: Returns the number of threads the compiler actually targeted.</p>
     * 
     * <p>This restricts the resource utilization fo the compiler (e.g. max registers) such that a block with the given number of threads should be able to
     * launch based on register limitations. Note, this option does not currently take into account any other resource limitations, such as shared memory
     * utilization.</p>
     * 
     * <p>Cannot be combined with {@link #CU_JIT_TARGET JIT_TARGET}. Option type: {@code unsigned int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_WALL_TIME JIT_WALL_TIME} - 
     * Overwrites the option value with the total wall clock time, in milliseconds, spent in the compiler and linker.
     * 
     * <p>Option type: {@code float}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_INFO_LOG_BUFFER JIT_INFO_LOG_BUFFER} - 
     * Pointer to a buffer in which to print any log messages that are informational in nature (the buffer size is specified via option
     * {@link #CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES JIT_INFO_LOG_BUFFER_SIZE_BYTES}).
     * 
     * <p>Option type: {@code char *}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES JIT_INFO_LOG_BUFFER_SIZE_BYTES} - 
     * IN: Log buffer size in bytes. Log messages will be capped at this size (including null terminator).
     * 
     * <p>OUT: Amount of log buffer filled with messages.</p>
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_ERROR_LOG_BUFFER JIT_ERROR_LOG_BUFFER} - 
     * Pointer to a buffer in which to print any log messages that reflect errors (the buffer size is specified via option
     * {@link #CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES JIT_ERROR_LOG_BUFFER_SIZE_BYTES}).
     * 
     * <p>Option type: {@code char *}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES JIT_ERROR_LOG_BUFFER_SIZE_BYTES} - 
     * IN: Log buffer size in bytes. Log messages will be capped at this size (including null terminator).
     * 
     * <p>OUT: Amount of log buffer filled with messages.</p>
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_OPTIMIZATION_LEVEL JIT_OPTIMIZATION_LEVEL} - 
     * Level of optimizations to apply to generated code (0 - 4), with 4 being the default and highest level of optimizations.
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_TARGET_FROM_CUCONTEXT JIT_TARGET_FROM_CUCONTEXT} - 
     * No option value required. Determines the target based on the current attached context (default).
     * 
     * <p>Option type: No option value needed. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_TARGET JIT_TARGET} - 
     * Target is chosen based on supplied {@code CUjit_target}. Cannot be combined with {@link #CU_JIT_THREADS_PER_BLOCK JIT_THREADS_PER_BLOCK}.
     * 
     * <p>Option type: {@code unsigned int} for enumerated type {@code CUjit_target}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY} - 
     * Specifies choice of fallback strategy if matching cubin is not found.
     * 
     * <p>Choice is based on supplied {@code CUjit_fallback}. This option cannot be used with {@code cuLink*} APIs as the linker requires exact matches.</p>
     * 
     * <p>Option type: {@code unsigned int} for enumerated type {@code CUjit_fallback}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_GENERATE_DEBUG_INFO JIT_GENERATE_DEBUG_INFO} - 
     * Specifies whether to create debug information in output (-g) (0: false, default).
     * 
     * <p>Option type: {@code int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_LOG_VERBOSE JIT_LOG_VERBOSE} - 
     * Generate verbose log messages (0: false, default).
     * 
     * <p>Option type: {@code int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_GENERATE_LINE_INFO JIT_GENERATE_LINE_INFO} - 
     * Generate line number information (-lineinfo) (0: false, default).
     * 
     * <p>Option type: {@code int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_CACHE_MODE JIT_CACHE_MODE} - 
     * Specifies whether to enable caching explicitly (-dlcm). Choice is based on supplied {@code CUjit_cacheMode_enum}.
     * 
     * <p>Option type: {@code unsigned int} for enumerated type {@code CUjit_cacheMode_enum}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_NEW_SM3X_OPT JIT_NEW_SM3X_OPT} - Used for internal purposes only, in this version of CUDA.</li>
     * <li>{@link #CU_JIT_FAST_COMPILE JIT_FAST_COMPILE} - Used for internal purposes only, in this version of CUDA.</li>
     * <li>{@link #CU_JIT_GLOBAL_SYMBOL_NAMES JIT_GLOBAL_SYMBOL_NAMES} - 
     * Array of device symbol names that will be relocated to the corresponing host addresses stored in {@link #CU_JIT_GLOBAL_SYMBOL_ADDRESSES JIT_GLOBAL_SYMBOL_ADDRESSES}.
     * 
     * <p>Must contain {@link #CU_JIT_GLOBAL_SYMBOL_COUNT JIT_GLOBAL_SYMBOL_COUNT} entries. When loding a device module, driver will relocate all encountered unresolved symbols to the host
     * addresses. It is only allowed to register symbols that correspond to unresolved global variables. It is illegal to register the same device symbol
     * at multiple addresses.</p>
     * 
     * <p>Option type: {@code const char **}. Applies to: dynamic linker only</p>
     * </li>
     * <li>{@link #CU_JIT_GLOBAL_SYMBOL_ADDRESSES JIT_GLOBAL_SYMBOL_ADDRESSES} - 
     * Array of host addresses that will be used to relocate corresponding device symbols stored in {@link #CU_JIT_GLOBAL_SYMBOL_NAMES JIT_GLOBAL_SYMBOL_NAMES}.
     * 
     * <p>Must contain {@link #CU_JIT_GLOBAL_SYMBOL_COUNT JIT_GLOBAL_SYMBOL_COUNT} entries.</p>
     * 
     * <p>Option type: {@code void **}. Applies to: dynamic linker only</p>
     * </li>
     * <li>{@link #CU_JIT_GLOBAL_SYMBOL_COUNT JIT_GLOBAL_SYMBOL_COUNT} - 
     * Number of entries in {@link #CU_JIT_GLOBAL_SYMBOL_NAMES JIT_GLOBAL_SYMBOL_NAMES} and {@link #CU_JIT_GLOBAL_SYMBOL_ADDRESSES JIT_GLOBAL_SYMBOL_ADDRESSES} arrays.
     * 
     * <p>Option type: {@code unsigned int}. Applies to: dynamic linker only</p>
     * </li>
     * <li>{@link #CU_JIT_LTO JIT_LTO} - 
     * Enable link-time optimization (-dlto) for device code (0: false, default)
     * 
     * <p>Option type: {@code int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_FTZ JIT_FTZ} - 
     * Control single-precision denormals (-ftz) support (0: false, default).
     * 
     * <ul>
     * <li>1 : flushes denormal values to zero</li>
     * <li>0 : preserves denormal values</li>
     * </ul>
     * 
     * <p>Option type: {@code int}. Applies to: link-time optimization specified with {@link #CU_JIT_LTO JIT_LTO}</p>
     * </li>
     * <li>{@link #CU_JIT_PREC_DIV JIT_PREC_DIV} - 
     * Control single-precision floating-point division and reciprocals (-prec-div) support (1: true, default).
     * 
     * <ul>
     * <li>1 : Enables the IEEE round-to-nearest mode</li>
     * <li>0 : Enables the fast approximation mode</li>
     * </ul>
     * 
     * <p>Option type: {@code int}. Applies to: link-time optimization specified with {@link #CU_JIT_LTO JIT_LTO}</p>
     * </li>
     * <li>{@link #CU_JIT_PREC_SQRT JIT_PREC_SQRT} - 
     * Control single-precision floating-point square root (-prec-sqrt) support (1: true, default).
     * 
     * <ul>
     * <li>1 : Enables the IEEE round-to-nearest mode</li>
     * <li>0 : Enables the fast approximation mode</li>
     * </ul>
     * 
     * <p>Option type: {@code int}. Applies to: link-time optimization specified with {@link #CU_JIT_LTO JIT_LTO}</p>
     * </li>
     * <li>{@link #CU_JIT_FMA JIT_FMA} - 
     * Enable/Disable the contraction of floating-point multiplies and adds/subtracts into floating-point multiply-add (-fma) operations (1: Enable,
     * default; 0: Disable).
     * 
     * <p>Option type: {@code int}. Applies to: link-time optimization specified with {@link #CU_JIT_LTO JIT_LTO}</p>
     * </li>
     * <li>{@link #CU_JIT_NUM_OPTIONS JIT_NUM_OPTIONS} - 
     * Enable/Disable the contraction of floating-point multiplies and adds/subtracts into floating-point multiply-add (-fma) operations (1: Enable,
     * default; 0: Disable).
     * 
     * <p>Option type: {@code int}. Applies to: link-time optimization specified with {@link #CU_JIT_LTO JIT_LTO}</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_JIT_MAX_REGISTERS               = 0x0,
        CU_JIT_THREADS_PER_BLOCK           = 0x1,
        CU_JIT_WALL_TIME                   = 0x2,
        CU_JIT_INFO_LOG_BUFFER             = 0x3,
        CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES  = 0x4,
        CU_JIT_ERROR_LOG_BUFFER            = 0x5,
        CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES = 0x6,
        CU_JIT_OPTIMIZATION_LEVEL          = 0x7,
        CU_JIT_TARGET_FROM_CUCONTEXT       = 0x8,
        CU_JIT_TARGET                      = 0x9,
        CU_JIT_FALLBACK_STRATEGY           = 0xA,
        CU_JIT_GENERATE_DEBUG_INFO         = 0xB,
        CU_JIT_LOG_VERBOSE                 = 0xC,
        CU_JIT_GENERATE_LINE_INFO          = 0xD,
        CU_JIT_CACHE_MODE                  = 0xE,
        CU_JIT_NEW_SM3X_OPT                = 0xF,
        CU_JIT_FAST_COMPILE                = 0x10,
        CU_JIT_GLOBAL_SYMBOL_NAMES         = 0x11,
        CU_JIT_GLOBAL_SYMBOL_ADDRESSES     = 0x12,
        CU_JIT_GLOBAL_SYMBOL_COUNT         = 0x13,
        CU_JIT_LTO                         = 0x14,
        CU_JIT_FTZ                         = 0x15,
        CU_JIT_PREC_DIV                    = 0x16,
        CU_JIT_PREC_SQRT                   = 0x17,
        CU_JIT_FMA                         = 0x18,
        CU_JIT_NUM_OPTIONS                 = 0x19;

    /**
     * Online compilation targets. ({@code CUjit_target})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TARGET_COMPUTE_20 TARGET_COMPUTE_20} - Compute device class 2.0</li>
     * <li>{@link #CU_TARGET_COMPUTE_21 TARGET_COMPUTE_21} - Compute device class 2.1</li>
     * <li>{@link #CU_TARGET_COMPUTE_30 TARGET_COMPUTE_30} - Compute device class 3.0</li>
     * <li>{@link #CU_TARGET_COMPUTE_32 TARGET_COMPUTE_32} - Compute device class 3.2</li>
     * <li>{@link #CU_TARGET_COMPUTE_35 TARGET_COMPUTE_35} - Compute device class 3.5</li>
     * <li>{@link #CU_TARGET_COMPUTE_37 TARGET_COMPUTE_37} - Compute device class 3.7</li>
     * <li>{@link #CU_TARGET_COMPUTE_50 TARGET_COMPUTE_50} - Compute device class 5.0</li>
     * <li>{@link #CU_TARGET_COMPUTE_52 TARGET_COMPUTE_52} - Compute device class 5.2</li>
     * <li>{@link #CU_TARGET_COMPUTE_53 TARGET_COMPUTE_53} - Compute device class 5.3</li>
     * <li>{@link #CU_TARGET_COMPUTE_60 TARGET_COMPUTE_60} - Compute device class 6.0.</li>
     * <li>{@link #CU_TARGET_COMPUTE_61 TARGET_COMPUTE_61} - Compute device class 6.1.</li>
     * <li>{@link #CU_TARGET_COMPUTE_62 TARGET_COMPUTE_62} - Compute device class 6.2.</li>
     * <li>{@link #CU_TARGET_COMPUTE_70 TARGET_COMPUTE_70} - Compute device class 7.0.</li>
     * <li>{@link #CU_TARGET_COMPUTE_72 TARGET_COMPUTE_72} - Compute device class 7.2.</li>
     * <li>{@link #CU_TARGET_COMPUTE_75 TARGET_COMPUTE_75} - Compute device class 7.5.</li>
     * <li>{@link #CU_TARGET_COMPUTE_80 TARGET_COMPUTE_80} - Compute device class 8.0.</li>
     * <li>{@link #CU_TARGET_COMPUTE_86 TARGET_COMPUTE_86} - Compute device class 8.6.</li>
     * </ul>
     */
    public static final int
        CU_TARGET_COMPUTE_20 = 20,
        CU_TARGET_COMPUTE_21 = 21,
        CU_TARGET_COMPUTE_30 = 30,
        CU_TARGET_COMPUTE_32 = 32,
        CU_TARGET_COMPUTE_35 = 35,
        CU_TARGET_COMPUTE_37 = 37,
        CU_TARGET_COMPUTE_50 = 50,
        CU_TARGET_COMPUTE_52 = 52,
        CU_TARGET_COMPUTE_53 = 53,
        CU_TARGET_COMPUTE_60 = 60,
        CU_TARGET_COMPUTE_61 = 61,
        CU_TARGET_COMPUTE_62 = 62,
        CU_TARGET_COMPUTE_70 = 70,
        CU_TARGET_COMPUTE_72 = 72,
        CU_TARGET_COMPUTE_75 = 75,
        CU_TARGET_COMPUTE_80 = 80,
        CU_TARGET_COMPUTE_86 = 86;

    /**
     * Cubin matching fallback strategies. ({@code CUjit_fallback})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_PREFER_PTX PREFER_PTX} - Prefer to compile ptx if exact binary match not found</li>
     * <li>{@link #CU_PREFER_BINARY PREFER_BINARY} - Prefer to fall back to compatible binary code if exact match not found</li>
     * </ul>
     */
    public static final int
        CU_PREFER_PTX    = 0x0,
        CU_PREFER_BINARY = 0x1;

    /**
     * Caching modes for {@code dlcm}. ({@code CUjit_cacheMode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_JIT_CACHE_OPTION_NONE JIT_CACHE_OPTION_NONE} - Compile with no -dlcm flag specified</li>
     * <li>{@link #CU_JIT_CACHE_OPTION_CG JIT_CACHE_OPTION_CG} - Compile with L1 cache disabled</li>
     * <li>{@link #CU_JIT_CACHE_OPTION_CA JIT_CACHE_OPTION_CA} - Compile with L1 cache enabled</li>
     * </ul>
     */
    public static final int
        CU_JIT_CACHE_OPTION_NONE = 0x0,
        CU_JIT_CACHE_OPTION_CG   = 0x1,
        CU_JIT_CACHE_OPTION_CA   = 0x2;

    /**
     * Device code formats. ({@code CUjitInputType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_JIT_INPUT_CUBIN JIT_INPUT_CUBIN} - 
     * Compiled device-class-specific device code
     * 
     * <p>Applicable options: none</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_PTX JIT_INPUT_PTX} - 
     * PTX source code.
     * 
     * <p>Applicable options: PTX compiler options</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_FATBINARY JIT_INPUT_FATBINARY} - 
     * Bundle of multiple cubins and/or PTX of some device code.
     * 
     * <p>Applicable options: PTX compiler options, {@link #CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY}</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_OBJECT JIT_INPUT_OBJECT} - 
     * Host object with embedded device code.
     * 
     * <p>Applicable options: PTX compiler options, {@link #CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY}</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_LIBRARY JIT_INPUT_LIBRARY} - 
     * Archive of host objects with embedded device code.
     * 
     * <p>Applicable options: PTX compiler options, {@link #CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY}</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_NVVM JIT_INPUT_NVVM} - 
     * High-level intermediate code for link-time optimization. 
     * 
     * <p>Applicable options: NVVM compiler options, PTX compiler options</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_JIT_INPUT_CUBIN     = 0,
        CU_JIT_INPUT_PTX       = 1,
        CU_JIT_INPUT_FATBINARY = 2,
        CU_JIT_INPUT_OBJECT    = 3,
        CU_JIT_INPUT_LIBRARY   = 4,
        CU_JIT_INPUT_NVVM      = 5;

    /**
     * Flags to register a graphics resource. ({@code CUgraphicsRegisterFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_NONE GRAPHICS_REGISTER_FLAGS_NONE}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY GRAPHICS_REGISTER_FLAGS_READ_ONLY}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST GRAPHICS_REGISTER_FLAGS_SURFACE_LDST}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER}</li>
     * </ul>
     */
    public static final int
        CU_GRAPHICS_REGISTER_FLAGS_NONE           = 0x0,
        CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY      = 0x1,
        CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD  = 0x2,
        CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST   = 0x4,
        CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER = 0x8;

    /**
     * Flags for mapping and unmapping interop resources. ({@code CUgraphicsMapResourceFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE GRAPHICS_MAP_RESOURCE_FLAGS_NONE}</li>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY}</li>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD}</li>
     * </ul>
     */
    public static final int
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE          = 0x0,
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY     = 0x1,
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD = 0x2;

    /**
     * Array indices for cube faces. ({@code CUarray_cubemap_face})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_CUBEMAP_FACE_POSITIVE_X CUBEMAP_FACE_POSITIVE_X} - Positive X face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_NEGATIVE_X CUBEMAP_FACE_NEGATIVE_X} - Negative X face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_POSITIVE_Y CUBEMAP_FACE_POSITIVE_Y} - Positive Y face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_NEGATIVE_Y CUBEMAP_FACE_NEGATIVE_Y} - Negative Y face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_POSITIVE_Z CUBEMAP_FACE_POSITIVE_Z} - Positive Z face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_NEGATIVE_Z CUBEMAP_FACE_NEGATIVE_Z} - Negative Z face of cubemap</li>
     * </ul>
     */
    public static final int
        CU_CUBEMAP_FACE_POSITIVE_X = 0x0,
        CU_CUBEMAP_FACE_NEGATIVE_X = 0x1,
        CU_CUBEMAP_FACE_POSITIVE_Y = 0x2,
        CU_CUBEMAP_FACE_NEGATIVE_Y = 0x3,
        CU_CUBEMAP_FACE_POSITIVE_Z = 0x4,
        CU_CUBEMAP_FACE_NEGATIVE_Z = 0x5;

    /**
     * Limits. ({@code CUlimit})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_LIMIT_STACK_SIZE LIMIT_STACK_SIZE} - GPU thread stack size</li>
     * <li>{@link #CU_LIMIT_PRINTF_FIFO_SIZE LIMIT_PRINTF_FIFO_SIZE} - GPU printf FIFO size</li>
     * <li>{@link #CU_LIMIT_MALLOC_HEAP_SIZE LIMIT_MALLOC_HEAP_SIZE} - GPU malloc heap size</li>
     * <li>{@link #CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH LIMIT_DEV_RUNTIME_SYNC_DEPTH} - GPU device runtime launch synchronize depth</li>
     * <li>{@link #CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT} - GPU device runtime pending launch count</li>
     * <li>{@link #CU_LIMIT_MAX_L2_FETCH_GRANULARITY LIMIT_MAX_L2_FETCH_GRANULARITY} - A value between 0 and 128 that indicates the maximum fetch granularity of L2 (in Bytes). This is a hint</li>
     * <li>{@link #CU_LIMIT_PERSISTING_L2_CACHE_SIZE LIMIT_PERSISTING_L2_CACHE_SIZE} - A size in bytes for L2 persisting lines cache size</li>
     * </ul>
     */
    public static final int
        CU_LIMIT_STACK_SIZE                       = 0x00,
        CU_LIMIT_PRINTF_FIFO_SIZE                 = 0x01,
        CU_LIMIT_MALLOC_HEAP_SIZE                 = 0x02,
        CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH           = 0x03,
        CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT = 0x04,
        CU_LIMIT_MAX_L2_FETCH_GRANULARITY         = 0x05,
        CU_LIMIT_PERSISTING_L2_CACHE_SIZE         = 0x06;

    /**
     * Resource types. ({@code CUresourcetype})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_RESOURCE_TYPE_ARRAY RESOURCE_TYPE_ARRAY} - Array resoure</li>
     * <li>{@link #CU_RESOURCE_TYPE_MIPMAPPED_ARRAY RESOURCE_TYPE_MIPMAPPED_ARRAY} - Mipmapped array resource</li>
     * <li>{@link #CU_RESOURCE_TYPE_LINEAR RESOURCE_TYPE_LINEAR} - Linear resource</li>
     * <li>{@link #CU_RESOURCE_TYPE_PITCH2D RESOURCE_TYPE_PITCH2D} - Pitch 2D resource</li>
     * </ul>
     */
    public static final int
        CU_RESOURCE_TYPE_ARRAY           = 0x0,
        CU_RESOURCE_TYPE_MIPMAPPED_ARRAY = 0x1,
        CU_RESOURCE_TYPE_LINEAR          = 0x2,
        CU_RESOURCE_TYPE_PITCH2D         = 0x3;

    /**
     * Specifies performance hint with {@link CUaccessPolicyWindow} for {@code hitProp} and {@code missProp} members. ({@code CUaccessProperty})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_ACCESS_PROPERTY_NORMAL ACCESS_PROPERTY_NORMAL} - Normal cache persistence.</li>
     * <li>{@link #CU_ACCESS_PROPERTY_STREAMING ACCESS_PROPERTY_STREAMING} - Streaming access is less likely to persit from cache.</li>
     * <li>{@link #CU_ACCESS_PROPERTY_PERSISTING ACCESS_PROPERTY_PERSISTING} - Persisting access is more likely to persist in cache.</li>
     * </ul>
     */
    public static final int
        CU_ACCESS_PROPERTY_NORMAL     = 0,
        CU_ACCESS_PROPERTY_STREAMING  = 1,
        CU_ACCESS_PROPERTY_PERSISTING = 2;

    /**
     * Graph node types. ({@code CUgraphNodeType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_NODE_TYPE_KERNEL GRAPH_NODE_TYPE_KERNEL} - GPU kernel node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_MEMCPY GRAPH_NODE_TYPE_MEMCPY} - Memcpy node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_MEMSET GRAPH_NODE_TYPE_MEMSET} - Memset node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_HOST GRAPH_NODE_TYPE_HOST} - Host (executable) node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_GRAPH GRAPH_NODE_TYPE_GRAPH} - Node which executes an embedded graph</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_EMPTY GRAPH_NODE_TYPE_EMPTY} - Empty (no-op) node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_WAIT_EVENT GRAPH_NODE_TYPE_WAIT_EVENT} - External event wait node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_EVENT_RECORD GRAPH_NODE_TYPE_EVENT_RECORD} - External event record node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_EXT_SEMAS_SIGNAL GRAPH_NODE_TYPE_EXT_SEMAS_SIGNAL} - External semaphore signal node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_EXT_SEMAS_WAIT GRAPH_NODE_TYPE_EXT_SEMAS_WAIT} - External semaphore wait node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_MEM_ALLOC GRAPH_NODE_TYPE_MEM_ALLOC} - Memory Allocation Node</li>
     * <li>{@link #CU_GRAPH_NODE_TYPE_MEM_FREE GRAPH_NODE_TYPE_MEM_FREE} - Memory Free Node</li>
     * </ul>
     */
    public static final int
        CU_GRAPH_NODE_TYPE_KERNEL           = 0,
        CU_GRAPH_NODE_TYPE_MEMCPY           = 1,
        CU_GRAPH_NODE_TYPE_MEMSET           = 2,
        CU_GRAPH_NODE_TYPE_HOST             = 3,
        CU_GRAPH_NODE_TYPE_GRAPH            = 4,
        CU_GRAPH_NODE_TYPE_EMPTY            = 5,
        CU_GRAPH_NODE_TYPE_WAIT_EVENT       = 6,
        CU_GRAPH_NODE_TYPE_EVENT_RECORD     = 7,
        CU_GRAPH_NODE_TYPE_EXT_SEMAS_SIGNAL = 8,
        CU_GRAPH_NODE_TYPE_EXT_SEMAS_WAIT   = 9,
        CU_GRAPH_NODE_TYPE_MEM_ALLOC        = 10,
        CU_GRAPH_NODE_TYPE_MEM_FREE         = 11;

    /**
     * {@code CUsynchronizationPolicy}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_SYNC_POLICY_AUTO SYNC_POLICY_AUTO}</li>
     * <li>{@link #CU_SYNC_POLICY_SPIN SYNC_POLICY_SPIN}</li>
     * <li>{@link #CU_SYNC_POLICY_YIELD SYNC_POLICY_YIELD}</li>
     * <li>{@link #CU_SYNC_POLICY_BLOCKING_SYNC SYNC_POLICY_BLOCKING_SYNC}</li>
     * </ul>
     */
    public static final int
        CU_SYNC_POLICY_AUTO          = 1,
        CU_SYNC_POLICY_SPIN          = 2,
        CU_SYNC_POLICY_YIELD         = 3,
        CU_SYNC_POLICY_BLOCKING_SYNC = 4;

    /**
     * Graph kernel node Attributes ({@code CUkernelNodeAttrID})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_KERNEL_NODE_ATTRIBUTE_ACCESS_POLICY_WINDOW KERNEL_NODE_ATTRIBUTE_ACCESS_POLICY_WINDOW} - Identifier for {@link CUkernelNodeAttrValue}{@code {@code accessPolicyWindow}}.</li>
     * <li>{@link #CU_KERNEL_NODE_ATTRIBUTE_COOPERATIVE KERNEL_NODE_ATTRIBUTE_COOPERATIVE} - Allows a kernel node to be cooperative (see {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel}).</li>
     * </ul>
     */
    public static final int
        CU_KERNEL_NODE_ATTRIBUTE_ACCESS_POLICY_WINDOW = 1,
        CU_KERNEL_NODE_ATTRIBUTE_COOPERATIVE          = 2;

    /**
     * Possible stream capture statuses returned by {@link #cuStreamIsCapturing StreamIsCapturing}. ({@code CUstreamCaptureStatus})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_CAPTURE_STATUS_NONE STREAM_CAPTURE_STATUS_NONE} - Stream is not capturing</li>
     * <li>{@link #CU_STREAM_CAPTURE_STATUS_ACTIVE STREAM_CAPTURE_STATUS_ACTIVE} - Stream is actively capturing</li>
     * <li>{@link #CU_STREAM_CAPTURE_STATUS_INVALIDATED STREAM_CAPTURE_STATUS_INVALIDATED} - Stream is part of a capture sequence that has been invalidated, but not terminated</li>
     * </ul>
     */
    public static final int
        CU_STREAM_CAPTURE_STATUS_NONE        = 0x0,
        CU_STREAM_CAPTURE_STATUS_ACTIVE      = 0x1,
        CU_STREAM_CAPTURE_STATUS_INVALIDATED = 0x2;

    /**
     * Possible modes for stream capture thread interactions. ({@code CUstreamCaptureMode})
     * 
     * <p>For more details see {@link #cuStreamBeginCapture StreamBeginCapture} and {@link #cuThreadExchangeStreamCaptureMode ThreadExchangeStreamCaptureMode}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_GLOBAL STREAM_CAPTURE_MODE_GLOBAL}</li>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_THREAD_LOCAL STREAM_CAPTURE_MODE_THREAD_LOCAL}</li>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED}</li>
     * </ul>
     */
    public static final int
        CU_STREAM_CAPTURE_MODE_GLOBAL       = 0,
        CU_STREAM_CAPTURE_MODE_THREAD_LOCAL = 1,
        CU_STREAM_CAPTURE_MODE_RELAXED      = 2;

    /**
     * Stream Attributes ({@code CUstreamAttrID})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_ATTRIBUTE_ACCESS_POLICY_WINDOW STREAM_ATTRIBUTE_ACCESS_POLICY_WINDOW} - Identifier for {@link CUstreamAttrValue}{@code {@code accessPolicyWindow}}.</li>
     * <li>{@link #CU_STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY} - {@code CUsynchronizationPolicy} for work queued up in this stream</li>
     * </ul>
     */
    public static final int
        CU_STREAM_ATTRIBUTE_ACCESS_POLICY_WINDOW   = 1,
        CU_STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY = 3;

    /**
     * Flags to specify search options. For more details see {@link #cuGetProcAddress GetProcAddress}. ({@code CUdriverProcAddress_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GET_PROC_ADDRESS_DEFAULT GET_PROC_ADDRESS_DEFAULT} - Default search mode for driver symbols.</li>
     * <li>{@link #CU_GET_PROC_ADDRESS_LEGACY_STREAM GET_PROC_ADDRESS_LEGACY_STREAM} - Search for legacy versions of driver symbols.</li>
     * <li>{@link #CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM} - Search for per-thread versions of driver symbols.</li>
     * </ul>
     */
    public static final int
        CU_GET_PROC_ADDRESS_DEFAULT                   = 0,
        CU_GET_PROC_ADDRESS_LEGACY_STREAM             = 1 << 0,
        CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM = 1 << 1;

    /**
     * Execution Affinity Types
     * 
     * <p>({@code CUexecAffinityType})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EXEC_AFFINITY_TYPE_SM_COUNT EXEC_AFFINITY_TYPE_SM_COUNT} - Create a context with limited SMs.</li>
     * <li>{@link #CU_EXEC_AFFINITY_TYPE_MAX EXEC_AFFINITY_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        CU_EXEC_AFFINITY_TYPE_SM_COUNT = 0,
        CU_EXEC_AFFINITY_TYPE_MAX      = 1;

    /**
     * Error codes. ({@code CUresult})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CUDA_SUCCESS CUDA_SUCCESS} - 
     * The API call returned with no errors.
     * 
     * <p>In the case of query calls, this also means that the operation being queried is complete (see {@link #cuEventQuery EventQuery} and {@link #cuStreamQuery StreamQuery}).</p>
     * </li>
     * <li>{@link #CUDA_ERROR_INVALID_VALUE CUDA_ERROR_INVALID_VALUE} - This indicates that one or more of the parameters passed to the API call is not within an acceptable range of values.</li>
     * <li>{@link #CUDA_ERROR_OUT_OF_MEMORY CUDA_ERROR_OUT_OF_MEMORY} - The API call failed because it was unable to allocate enough memory to perform the requested operation.</li>
     * <li>{@link #CUDA_ERROR_NOT_INITIALIZED CUDA_ERROR_NOT_INITIALIZED} - This indicates that the CUDA driver has not been initialized with {@link #cuInit Init} or that initialization has failed.</li>
     * <li>{@link #CUDA_ERROR_DEINITIALIZED CUDA_ERROR_DEINITIALIZED} - This indicates that the CUDA driver is in the process of shutting down.</li>
     * <li>{@link #CUDA_ERROR_PROFILER_DISABLED CUDA_ERROR_PROFILER_DISABLED} - 
     * This indicates profiler is not initialized for this run. This can happen when the application is running with external profiling tools like visual
     * profiler.
     * </li>
     * <li>{@link #CUDA_ERROR_PROFILER_NOT_INITIALIZED CUDA_ERROR_PROFILER_NOT_INITIALIZED} - 
     * Deprecated: This error return is deprecated as of CUDA 5.0. It is no longer an error to attempt to enable/disable the profiling via
     * {@link CUDAProfiler#cuProfilerStart ProfilerStart} or {@link CUDAProfiler#cuProfilerStop ProfilerStop} without initialization.
     * </li>
     * <li>{@link #CUDA_ERROR_PROFILER_ALREADY_STARTED CUDA_ERROR_PROFILER_ALREADY_STARTED} - 
     * Deprecated: This error return is deprecated as of CUDA 5.0. It is no longer an error to call {@link CUDAProfiler#cuProfilerStart ProfilerStart} when profiling is already enabled.
     * </li>
     * <li>{@link #CUDA_ERROR_PROFILER_ALREADY_STOPPED CUDA_ERROR_PROFILER_ALREADY_STOPPED} - 
     * Deprecated: This error return is deprecated as of CUDA 5.0. It is no longer an error to call {@link CUDAProfiler#cuProfilerStop ProfilerStop} when profiling is already disabled.
     * </li>
     * <li>{@link #CUDA_ERROR_STUB_LIBRARY CUDA_ERROR_STUB_LIBRARY} - 
     * This indicates that the CUDA driver that the application has loaded is a stub library. Applications that run with the stub rather than a real
     * driver loaded will result in CUDA API returning this error.
     * </li>
     * <li>{@link #CUDA_ERROR_NO_DEVICE CUDA_ERROR_NO_DEVICE} - This indicates that no CUDA-capable devices were detected by the installed CUDA driver.</li>
     * <li>{@link #CUDA_ERROR_INVALID_DEVICE CUDA_ERROR_INVALID_DEVICE} - 
     * This indicates that the device ordinal supplied by the user does not correspond to a valid CUDA device or that the action requested is invalid for
     * the specified device.
     * </li>
     * <li>{@link #CUDA_ERROR_DEVICE_NOT_LICENSED CUDA_ERROR_DEVICE_NOT_LICENSED} - This error indicates that the Grid license is not applied.</li>
     * <li>{@link #CUDA_ERROR_INVALID_IMAGE CUDA_ERROR_INVALID_IMAGE} - This indicates that the device kernel image is invalid. This can also indicate an invalid CUDA module.</li>
     * <li>{@link #CUDA_ERROR_INVALID_CONTEXT CUDA_ERROR_INVALID_CONTEXT} - 
     * This most frequently indicates that there is no context bound to the current thread. This can also be returned if the context passed to an API call
     * is not a valid handle (such as a context that has had {@link #cuCtxDestroy CtxDestroy} invoked on it). This can also be returned if a user mixes different API
     * versions (i.e. 3010 context with 3020 API calls). See {@link #cuCtxGetApiVersion CtxGetApiVersion} for more details.
     * </li>
     * <li>{@link #CUDA_ERROR_CONTEXT_ALREADY_CURRENT CUDA_ERROR_CONTEXT_ALREADY_CURRENT} - 
     * This indicated that the context being supplied as a parameter to the API call was already the active context.Deprecated: This error return is
     * deprecated as of CUDA 3.2. It is no longer an error to attempt to push the active context via {@link #cuCtxPushCurrent CtxPushCurrent}.
     * </li>
     * <li>{@link #CUDA_ERROR_MAP_FAILED CUDA_ERROR_MAP_FAILED} - This indicates that a map or register operation has failed.</li>
     * <li>{@link #CUDA_ERROR_UNMAP_FAILED CUDA_ERROR_UNMAP_FAILED} - This indicates that an unmap or unregister operation has failed.</li>
     * <li>{@link #CUDA_ERROR_ARRAY_IS_MAPPED CUDA_ERROR_ARRAY_IS_MAPPED} - This indicates that the specified array is currently mapped and thus cannot be destroyed.</li>
     * <li>{@link #CUDA_ERROR_ALREADY_MAPPED CUDA_ERROR_ALREADY_MAPPED} - This indicates that the resource is already mapped.</li>
     * <li>{@link #CUDA_ERROR_NO_BINARY_FOR_GPU CUDA_ERROR_NO_BINARY_FOR_GPU} - 
     * This indicates that there is no kernel image available that is suitable for the device. This can occur when a user specifies code generation
     * options for a particular CUDA source file that do not include the corresponding device configuration.
     * </li>
     * <li>{@link #CUDA_ERROR_ALREADY_ACQUIRED CUDA_ERROR_ALREADY_ACQUIRED} - This indicates that a resource has already been acquired.</li>
     * <li>{@link #CUDA_ERROR_NOT_MAPPED CUDA_ERROR_NOT_MAPPED} - This indicates that a resource is not mapped.</li>
     * <li>{@link #CUDA_ERROR_NOT_MAPPED_AS_ARRAY CUDA_ERROR_NOT_MAPPED_AS_ARRAY} - This indicates that a mapped resource is not available for access as an array.</li>
     * <li>{@link #CUDA_ERROR_NOT_MAPPED_AS_POINTER CUDA_ERROR_NOT_MAPPED_AS_POINTER} - This indicates that a mapped resource is not available for access as a pointer.</li>
     * <li>{@link #CUDA_ERROR_ECC_UNCORRECTABLE CUDA_ERROR_ECC_UNCORRECTABLE} - This indicates that an uncorrectable ECC error was detected during execution.</li>
     * <li>{@link #CUDA_ERROR_UNSUPPORTED_LIMIT CUDA_ERROR_UNSUPPORTED_LIMIT} - This indicates that the {@code CUlimit} passed to the API call is not supported by the active device.</li>
     * <li>{@link #CUDA_ERROR_CONTEXT_ALREADY_IN_USE CUDA_ERROR_CONTEXT_ALREADY_IN_USE} - 
     * This indicates that the {@code CUcontext} passed to the API call can only be bound to a single CPU thread at a time but is already bound to a CPU thread.
     * </li>
     * <li>{@link #CUDA_ERROR_PEER_ACCESS_UNSUPPORTED CUDA_ERROR_PEER_ACCESS_UNSUPPORTED} - This indicates that peer access is not supported across the given devices.</li>
     * <li>{@link #CUDA_ERROR_INVALID_PTX CUDA_ERROR_INVALID_PTX} - This indicates that a PTX JIT compilation failed.</li>
     * <li>{@link #CUDA_ERROR_INVALID_GRAPHICS_CONTEXT CUDA_ERROR_INVALID_GRAPHICS_CONTEXT} - This indicates an error with OpenGL or DirectX context.</li>
     * <li>{@link #CUDA_ERROR_NVLINK_UNCORRECTABLE CUDA_ERROR_NVLINK_UNCORRECTABLE} - This indicates that an uncorrectable NVLink error was detected during the execution.</li>
     * <li>{@link #CUDA_ERROR_JIT_COMPILER_NOT_FOUND CUDA_ERROR_JIT_COMPILER_NOT_FOUND} - This indicates that the PTX JIT compiler library was not found.</li>
     * <li>{@link #CUDA_ERROR_UNSUPPORTED_PTX_VERSION CUDA_ERROR_UNSUPPORTED_PTX_VERSION} - This indicates that the provided PTX was compiled with an unsupported toolchain.</li>
     * <li>{@link #CUDA_ERROR_JIT_COMPILATION_DISABLED CUDA_ERROR_JIT_COMPILATION_DISABLED} - This indicates that the PTX JIT compilation was disabled.</li>
     * <li>{@link #CUDA_ERROR_UNSUPPORTED_EXEC_AFFINITY CUDA_ERROR_UNSUPPORTED_EXEC_AFFINITY} - This indicates that the {@code CUexecAffinityType} passed to the API call is not supported by the active device.</li>
     * <li>{@link #CUDA_ERROR_INVALID_SOURCE CUDA_ERROR_INVALID_SOURCE} - This indicates that the device kernel source is invalid. This includes compilation/linker errors encountered in device code or user error.</li>
     * <li>{@link #CUDA_ERROR_FILE_NOT_FOUND CUDA_ERROR_FILE_NOT_FOUND} - This indicates that the file specified was not found.</li>
     * <li>{@link #CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND} - This indicates that a link to a shared object failed to resolve.</li>
     * <li>{@link #CUDA_ERROR_SHARED_OBJECT_INIT_FAILED CUDA_ERROR_SHARED_OBJECT_INIT_FAILED} - This indicates that initialization of a shared object failed.</li>
     * <li>{@link #CUDA_ERROR_OPERATING_SYSTEM CUDA_ERROR_OPERATING_SYSTEM} - This indicates that an OS call failed.</li>
     * <li>{@link #CUDA_ERROR_INVALID_HANDLE CUDA_ERROR_INVALID_HANDLE} - 
     * This indicates that a resource handle passed to the API call was not valid. Resource handles are opaque types like {@code CUstream} and
     * {@code CUevent}.
     * </li>
     * <li>{@link #CUDA_ERROR_ILLEGAL_STATE CUDA_ERROR_ILLEGAL_STATE} - This indicates that a resource required by the API call is not in a valid state to perform the requested operation.</li>
     * <li>{@link #CUDA_ERROR_NOT_FOUND CUDA_ERROR_NOT_FOUND} - 
     * This indicates that a named symbol was not found. Examples of symbols are global/constant variable names, driver function names, texture names, and
     * surface names.
     * </li>
     * <li>{@link #CUDA_ERROR_NOT_READY CUDA_ERROR_NOT_READY} - 
     * This indicates that asynchronous operations issued previously have not completed yet. This result is not actually an error, but must be indicated
     * differently than {@link #CUDA_SUCCESS} (which indicates completion). Calls that may return this value include {@link #cuEventQuery EventQuery} and {@link #cuStreamQuery StreamQuery}.
     * </li>
     * <li>{@link #CUDA_ERROR_ILLEGAL_ADDRESS CUDA_ERROR_ILLEGAL_ADDRESS} - 
     * While executing a kernel, the device encountered a load or store instruction on an invalid memory address. This leaves the process in an
     * inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES} - 
     * This indicates that a launch did not occur because it did not have appropriate resources. This error usually indicates that the user has attempted
     * to pass too many arguments to the device kernel, or the kernel launch specifies too many threads for the kernel's register count. Passing arguments
     * of the wrong size (i.e. a 64-bit pointer when a 32-bit int is expected) is equivalent to passing too many arguments and can also result in this
     * error.
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_TIMEOUT CUDA_ERROR_LAUNCH_TIMEOUT} - 
     * This indicates that the device kernel took too long to execute. This can only occur if timeouts are enabled - see the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT} for more information. This leaves the process in an inconsistent state and any further CUDA work will
     * return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING} - This error indicates a kernel launch that uses an incompatible texturing mode.</li>
     * <li>{@link #CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED} - 
     * This error indicates that a call to {@link #cuCtxEnablePeerAccess CtxEnablePeerAccess} is trying to re-enable peer access to a context which has already had peer access to
     * it enabled.
     * </li>
     * <li>{@link #CUDA_ERROR_PEER_ACCESS_NOT_ENABLED CUDA_ERROR_PEER_ACCESS_NOT_ENABLED} - 
     * This error indicates that {@link #cuCtxDisablePeerAccess CtxDisablePeerAccess} is trying to disable peer access which has not been enabled yet via {@link #cuCtxEnablePeerAccess CtxEnablePeerAccess}.
     * </li>
     * <li>{@link #CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE} - This error indicates that the primary context for the specified device has already been initialized.</li>
     * <li>{@link #CUDA_ERROR_CONTEXT_IS_DESTROYED CUDA_ERROR_CONTEXT_IS_DESTROYED} - 
     * This error indicates that the context current to the calling thread has been destroyed using {@link #cuCtxDestroy CtxDestroy}, or is a primary context which has not
     * yet been initialized.
     * </li>
     * <li>{@link #CUDA_ERROR_ASSERT CUDA_ERROR_ASSERT} - 
     * A device-side assert triggered during kernel execution. The context cannot be used anymore, and must be destroyed. All existing device memory
     * allocations from this context are invalid and must be reconstructed if the program is to continue using CUDA.
     * </li>
     * <li>{@link #CUDA_ERROR_TOO_MANY_PEERS CUDA_ERROR_TOO_MANY_PEERS} - 
     * This error indicates that the hardware resources required to enable peer access have been exhausted for one or more of the devices passed to
     * {@link #cuCtxEnablePeerAccess CtxEnablePeerAccess}.
     * </li>
     * <li>{@link #CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED} - This error indicates that the memory range passed to {@link #cuMemHostRegister MemHostRegister} has already been registered.</li>
     * <li>{@link #CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED} - This error indicates that the pointer passed to {@link #cuMemHostUnregister MemHostUnregister} does not correspond to any currently registered memory region.</li>
     * <li>{@link #CUDA_ERROR_HARDWARE_STACK_ERROR CUDA_ERROR_HARDWARE_STACK_ERROR} - 
     * While executing a kernel, the device encountered a stack error. This can be due to stack corruption or exceeding the stack size limit. This leaves
     * the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated
     * and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_ILLEGAL_INSTRUCTION CUDA_ERROR_ILLEGAL_INSTRUCTION} - 
     * While executing a kernel, the device encountered an illegal instruction. This leaves the process in an inconsistent state and any further CUDA work
     * will return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_MISALIGNED_ADDRESS CUDA_ERROR_MISALIGNED_ADDRESS} - 
     * While executing a kernel, the device encountered a load or store instruction on a memory address which is not aligned. This leaves the process in
     * an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_INVALID_ADDRESS_SPACE CUDA_ERROR_INVALID_ADDRESS_SPACE} - 
     * While executing a kernel, the device encountered an instruction which can only operate on memory locations in certain address spaces (global,
     * shared, or local), but was supplied a memory address not belonging to an allowed address space. This leaves the process in an inconsistent state
     * and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_INVALID_PC CUDA_ERROR_INVALID_PC} - 
     * While executing a kernel, the device program counter wrapped its address space. This leaves the process in an inconsistent state and any further
     * CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_FAILED CUDA_ERROR_LAUNCH_FAILED} - 
     * An exception occurred on the device while executing a kernel. Common causes include dereferencing an invalid device pointer and accessing out of
     * bounds shared memory. Less common cases can be system specific - more information about these cases can be found in the system specific user guide.
     * This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
     * terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE} - 
     * This error indicates that the number of blocks launched per grid for a kernel that was launched via either {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel} or
     * {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} exceeds the maximum number of blocks as allowed by {@link #cuOccupancyMaxActiveBlocksPerMultiprocessor OccupancyMaxActiveBlocksPerMultiprocessor} or
     * {@link #cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags OccupancyMaxActiveBlocksPerMultiprocessorWithFlags} times the number of multiprocessors as specified by the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT}.
     * </li>
     * <li>{@link #CUDA_ERROR_NOT_PERMITTED CUDA_ERROR_NOT_PERMITTED} - This error indicates that the attempted operation is not permitted.</li>
     * <li>{@link #CUDA_ERROR_NOT_SUPPORTED CUDA_ERROR_NOT_SUPPORTED} - This error indicates that the attempted operation is not supported on the current system or device.</li>
     * <li>{@link #CUDA_ERROR_SYSTEM_NOT_READY CUDA_ERROR_SYSTEM_NOT_READY} - 
     * This error indicates that the system is not yet ready to start any CUDA work. To continue using CUDA, verify the system configuration is in a valid
     * state and all required driver daemons are actively running. More information about this error can be found in the system specific user guide.
     * </li>
     * <li>{@link #CUDA_ERROR_SYSTEM_DRIVER_MISMATCH CUDA_ERROR_SYSTEM_DRIVER_MISMATCH} - 
     * This error indicates that there is a mismatch between the versions of the display driver and the CUDA driver. Refer to the compatibility
     * documentation for supported versions.
     * </li>
     * <li>{@link #CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE} - 
     * This error indicates that the system was upgraded to run with forward compatibility but the visible hardware detected by CUDA does not support this
     * configuration. Refer to the compatibility documentation for the supported hardware matrix or ensure that only supported hardware is visible during
     * initialization via the {@code CUDA_VISIBLE_DEVICES} environment variable.
     * </li>
     * <li>{@link #CUDA_ERROR_MPS_CONNECTION_FAILED CUDA_ERROR_MPS_CONNECTION_FAILED} - This error indicates that the MPS client failed to connect to the MPS control daemon or the MPS server.</li>
     * <li>{@link #CUDA_ERROR_MPS_RPC_FAILURE CUDA_ERROR_MPS_RPC_FAILURE} - This error indicates that the remote procedural call between the MPS server and the MPS client failed.</li>
     * <li>{@link #CUDA_ERROR_MPS_SERVER_NOT_READY CUDA_ERROR_MPS_SERVER_NOT_READY} - 
     * This error indicates that the MPS server is not ready to accept new MPS client requests. This error can be returned when the MPS server is in the
     * process of recovering from a fatal failure.
     * </li>
     * <li>{@link #CUDA_ERROR_MPS_MAX_CLIENTS_REACHED CUDA_ERROR_MPS_MAX_CLIENTS_REACHED} - This error indicates that the hardware resources required to create MPS client have been exhausted.</li>
     * <li>{@link #CUDA_ERROR_MPS_MAX_CONNECTIONS_REACHED CUDA_ERROR_MPS_MAX_CONNECTIONS_REACHED} - This error indicates the the hardware resources required to support device connections have been exhausted.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED} - This error indicates that the operation is not permitted when the stream is capturing.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_INVALIDATED CUDA_ERROR_STREAM_CAPTURE_INVALIDATED} - This error indicates that the current capture sequence on the stream has been invalidated due to a previous error.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_MERGE CUDA_ERROR_STREAM_CAPTURE_MERGE} - This error indicates that the operation would have resulted in a merge of two independent capture sequences.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_UNMATCHED CUDA_ERROR_STREAM_CAPTURE_UNMATCHED} - This error indicates that the capture was not initiated in this stream.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_UNJOINED CUDA_ERROR_STREAM_CAPTURE_UNJOINED} - This error indicates that the capture sequence contains a fork that was not joined to the primary stream.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_ISOLATION CUDA_ERROR_STREAM_CAPTURE_ISOLATION} - 
     * This error indicates that a dependency would have been created which crosses the capture sequence boundary. Only implicit in-stream ordering
     * dependencies are allowed to cross the boundary.
     * </li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT CUDA_ERROR_STREAM_CAPTURE_IMPLICIT} - This error indicates a disallowed implicit dependency on a current capture sequence from cudaStreamLegacy.</li>
     * <li>{@link #CUDA_ERROR_CAPTURED_EVENT CUDA_ERROR_CAPTURED_EVENT} - This error indicates that the operation is not permitted on an event which was last recorded in a capturing stream.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD} - 
     * A stream capture sequence not initiated with the {@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED} argument to {@link #cuStreamBeginCapture StreamBeginCapture} was passed to {@link #cuStreamEndCapture StreamEndCapture}
     * in a different thread.
     * </li>
     * <li>{@link #CUDA_ERROR_TIMEOUT CUDA_ERROR_TIMEOUT} - This error indicates that the timeout specified for the wait operation has lapsed.</li>
     * <li>{@link #CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE} - 
     * This error indicates that the graph update was not performed because it included changes which violated constraints specific to instantiated graph
     * update.
     * </li>
     * <li>{@link #CUDA_ERROR_EXTERNAL_DEVICE CUDA_ERROR_EXTERNAL_DEVICE} - 
     * This indicates that an async error has occurred in a device outside of CUDA. If CUDA was waiting for an external device's signal before consuming
     * shared data, the external device signaled an error indicating that the data is not valid for consumption. This leaves the process in an
     * inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
     * </li>
     * <li>{@link #CUDA_ERROR_UNKNOWN CUDA_ERROR_UNKNOWN} - This indicates that an unknown internal error has occurred.</li>
     * </ul>
     */
    public static final int
        CUDA_SUCCESS                              = 0,
        CUDA_ERROR_INVALID_VALUE                  = 1,
        CUDA_ERROR_OUT_OF_MEMORY                  = 2,
        CUDA_ERROR_NOT_INITIALIZED                = 3,
        CUDA_ERROR_DEINITIALIZED                  = 4,
        CUDA_ERROR_PROFILER_DISABLED              = 5,
        CUDA_ERROR_PROFILER_NOT_INITIALIZED       = 6,
        CUDA_ERROR_PROFILER_ALREADY_STARTED       = 7,
        CUDA_ERROR_PROFILER_ALREADY_STOPPED       = 8,
        CUDA_ERROR_STUB_LIBRARY                   = 34,
        CUDA_ERROR_NO_DEVICE                      = 100,
        CUDA_ERROR_INVALID_DEVICE                 = 101,
        CUDA_ERROR_DEVICE_NOT_LICENSED            = 102,
        CUDA_ERROR_INVALID_IMAGE                  = 200,
        CUDA_ERROR_INVALID_CONTEXT                = 201,
        CUDA_ERROR_CONTEXT_ALREADY_CURRENT        = 202,
        CUDA_ERROR_MAP_FAILED                     = 205,
        CUDA_ERROR_UNMAP_FAILED                   = 206,
        CUDA_ERROR_ARRAY_IS_MAPPED                = 207,
        CUDA_ERROR_ALREADY_MAPPED                 = 208,
        CUDA_ERROR_NO_BINARY_FOR_GPU              = 209,
        CUDA_ERROR_ALREADY_ACQUIRED               = 210,
        CUDA_ERROR_NOT_MAPPED                     = 211,
        CUDA_ERROR_NOT_MAPPED_AS_ARRAY            = 212,
        CUDA_ERROR_NOT_MAPPED_AS_POINTER          = 213,
        CUDA_ERROR_ECC_UNCORRECTABLE              = 214,
        CUDA_ERROR_UNSUPPORTED_LIMIT              = 215,
        CUDA_ERROR_CONTEXT_ALREADY_IN_USE         = 216,
        CUDA_ERROR_PEER_ACCESS_UNSUPPORTED        = 217,
        CUDA_ERROR_INVALID_PTX                    = 218,
        CUDA_ERROR_INVALID_GRAPHICS_CONTEXT       = 219,
        CUDA_ERROR_NVLINK_UNCORRECTABLE           = 220,
        CUDA_ERROR_JIT_COMPILER_NOT_FOUND         = 221,
        CUDA_ERROR_UNSUPPORTED_PTX_VERSION        = 222,
        CUDA_ERROR_JIT_COMPILATION_DISABLED       = 223,
        CUDA_ERROR_UNSUPPORTED_EXEC_AFFINITY      = 224,
        CUDA_ERROR_INVALID_SOURCE                 = 300,
        CUDA_ERROR_FILE_NOT_FOUND                 = 301,
        CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND = 302,
        CUDA_ERROR_SHARED_OBJECT_INIT_FAILED      = 303,
        CUDA_ERROR_OPERATING_SYSTEM               = 304,
        CUDA_ERROR_INVALID_HANDLE                 = 400,
        CUDA_ERROR_ILLEGAL_STATE                  = 401,
        CUDA_ERROR_NOT_FOUND                      = 500,
        CUDA_ERROR_NOT_READY                      = 600,
        CUDA_ERROR_ILLEGAL_ADDRESS                = 700,
        CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES        = 701,
        CUDA_ERROR_LAUNCH_TIMEOUT                 = 702,
        CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING  = 703,
        CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED    = 704,
        CUDA_ERROR_PEER_ACCESS_NOT_ENABLED        = 705,
        CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE         = 708,
        CUDA_ERROR_CONTEXT_IS_DESTROYED           = 709,
        CUDA_ERROR_ASSERT                         = 710,
        CUDA_ERROR_TOO_MANY_PEERS                 = 711,
        CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED = 712,
        CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED     = 713,
        CUDA_ERROR_HARDWARE_STACK_ERROR           = 714,
        CUDA_ERROR_ILLEGAL_INSTRUCTION            = 715,
        CUDA_ERROR_MISALIGNED_ADDRESS             = 716,
        CUDA_ERROR_INVALID_ADDRESS_SPACE          = 717,
        CUDA_ERROR_INVALID_PC                     = 718,
        CUDA_ERROR_LAUNCH_FAILED                  = 719,
        CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE   = 720,
        CUDA_ERROR_NOT_PERMITTED                  = 800,
        CUDA_ERROR_NOT_SUPPORTED                  = 801,
        CUDA_ERROR_SYSTEM_NOT_READY               = 802,
        CUDA_ERROR_SYSTEM_DRIVER_MISMATCH         = 803,
        CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE = 804,
        CUDA_ERROR_MPS_CONNECTION_FAILED          = 805,
        CUDA_ERROR_MPS_RPC_FAILURE                = 806,
        CUDA_ERROR_MPS_SERVER_NOT_READY           = 807,
        CUDA_ERROR_MPS_MAX_CLIENTS_REACHED        = 808,
        CUDA_ERROR_MPS_MAX_CONNECTIONS_REACHED    = 809,
        CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED     = 900,
        CUDA_ERROR_STREAM_CAPTURE_INVALIDATED     = 901,
        CUDA_ERROR_STREAM_CAPTURE_MERGE           = 902,
        CUDA_ERROR_STREAM_CAPTURE_UNMATCHED       = 903,
        CUDA_ERROR_STREAM_CAPTURE_UNJOINED        = 904,
        CUDA_ERROR_STREAM_CAPTURE_ISOLATION       = 905,
        CUDA_ERROR_STREAM_CAPTURE_IMPLICIT        = 906,
        CUDA_ERROR_CAPTURED_EVENT                 = 907,
        CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD    = 908,
        CUDA_ERROR_TIMEOUT                        = 909,
        CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE      = 910,
        CUDA_ERROR_EXTERNAL_DEVICE                = 911,
        CUDA_ERROR_UNKNOWN                        = 999;

    /**
     * P2P Attributes. ({@code CUdevice_P2PAttribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK} - A relative value indicating the performance of the link between two devices</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED} - P2P Access is enable</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED} - Atomic operation over the link supported</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED} - Deprecated, use CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED instead</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED} - Accessing CUDA arrays over the link supported</li>
     * </ul>
     */
    public static final int
        CU_DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK            = 0x1,
        CU_DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED            = 0x2,
        CU_DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED     = 0x3,
        CU_DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED     = 0x4,
        CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED = 0x4;

    /**
     * Flags for {@link #cuMemHostAlloc MemHostAlloc}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMHOSTALLOC_PORTABLE MEMHOSTALLOC_PORTABLE} - If set, host memory is portable between CUDA contexts.</li>
     * <li>{@link #CU_MEMHOSTALLOC_DEVICEMAP MEMHOSTALLOC_DEVICEMAP} - If set, host memory is mapped into CUDA address space and {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} may be called on the host pointer.</li>
     * <li>{@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} - 
     * If set, host memory is allocated as write-combined - fast to write, faster to DMA, slow to read except via SSE4 streaming load instruction
     * ({@code MOVNTDQA}).
     * </li>
     * </ul>
     */
    public static final int
        CU_MEMHOSTALLOC_PORTABLE      = 0x1,
        CU_MEMHOSTALLOC_DEVICEMAP     = 0x2,
        CU_MEMHOSTALLOC_WRITECOMBINED = 0x4;

    /**
     * Flags for {@link #cuMemHostRegister MemHostRegister}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMHOSTREGISTER_PORTABLE MEMHOSTREGISTER_PORTABLE} - If set, host memory is portable between CUDA contexts.</li>
     * <li>{@link #CU_MEMHOSTREGISTER_DEVICEMAP MEMHOSTREGISTER_DEVICEMAP} - If set, host memory is mapped into CUDA address space and {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} may be called on the host pointer.</li>
     * <li>{@link #CU_MEMHOSTREGISTER_IOMEMORY MEMHOSTREGISTER_IOMEMORY} - 
     * If set, the passed memory pointer is treated as pointing to some memory-mapped I/O space, e.g. belonging to a third-party PCIe device.
     * 
     * <p>On Windows the flag is a no-op. On Linux that memory is marked as non cache-coherent for the GPU and is expected to be physically contiguous.
     * It may return {@link #CUDA_ERROR_NOT_PERMITTED} if run as an unprivileged user, {@link #CUDA_ERROR_NOT_SUPPORTED} on older Linux kernel versions. On all other
     * platforms, it is not supported and {@link #CUDA_ERROR_NOT_SUPPORTED} is returned.</p>
     * </li>
     * <li>{@link #CU_MEMHOSTREGISTER_READ_ONLY MEMHOSTREGISTER_READ_ONLY} - 
     * If set, the passed memory pointer is treated as pointing to memory that is considered read-only by the device.
     * 
     * <p>On platforms without {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES}, this flag is required in order to register memory mapped to
     * the CPU as read-only. Support for the use of this flag can be queried from the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED}. Using this flag with a current context associated with a device that does not have this
     * attribute set will cause {@link #cuMemHostRegister MemHostRegister} to error with {@link #CUDA_ERROR_NOT_SUPPORTED}.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_MEMHOSTREGISTER_PORTABLE  = 0x01,
        CU_MEMHOSTREGISTER_DEVICEMAP = 0x02,
        CU_MEMHOSTREGISTER_IOMEMORY  = 0x04,
        CU_MEMHOSTREGISTER_READ_ONLY = 0x08;

    /** Indicates that the layered sparse CUDA array or CUDA mipmapped array has a single mip tail region for all layers. */
    public static final int CU_ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL = 0x1;

    /**
     * Resource view format. ({@code CUresourceViewFormat})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_RES_VIEW_FORMAT_NONE RES_VIEW_FORMAT_NONE} - No resource view format (use underlying resource format)</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_1X8 RES_VIEW_FORMAT_UINT_1X8} - 1 channel unsigned 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_2X8 RES_VIEW_FORMAT_UINT_2X8} - 2 channel unsigned 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_4X8 RES_VIEW_FORMAT_UINT_4X8} - 4 channel unsigned 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_1X8 RES_VIEW_FORMAT_SINT_1X8} - 1 channel signed 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_2X8 RES_VIEW_FORMAT_SINT_2X8} - 2 channel signed 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_4X8 RES_VIEW_FORMAT_SINT_4X8} - 4 channel signed 8-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_1X16 RES_VIEW_FORMAT_UINT_1X16} - 1 channel unsigned 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_2X16 RES_VIEW_FORMAT_UINT_2X16} - 2 channel unsigned 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_4X16 RES_VIEW_FORMAT_UINT_4X16} - 4 channel unsigned 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_1X16 RES_VIEW_FORMAT_SINT_1X16} - 1 channel signed 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_2X16 RES_VIEW_FORMAT_SINT_2X16} - 2 channel signed 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_4X16 RES_VIEW_FORMAT_SINT_4X16} - 4 channel signed 16-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_1X32 RES_VIEW_FORMAT_UINT_1X32} - 1 channel unsigned 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_2X32 RES_VIEW_FORMAT_UINT_2X32} - 2 channel unsigned 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UINT_4X32 RES_VIEW_FORMAT_UINT_4X32} - 4 channel unsigned 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_1X32 RES_VIEW_FORMAT_SINT_1X32} - 1 channel signed 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_2X32 RES_VIEW_FORMAT_SINT_2X32} - 2 channel signed 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SINT_4X32 RES_VIEW_FORMAT_SINT_4X32} - 4 channel signed 32-bit integers</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_1X16 RES_VIEW_FORMAT_FLOAT_1X16} - 1 channel 16-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_2X16 RES_VIEW_FORMAT_FLOAT_2X16} - 2 channel 16-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_4X16 RES_VIEW_FORMAT_FLOAT_4X16} - 4 channel 16-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_1X32 RES_VIEW_FORMAT_FLOAT_1X32} - 1 channel 32-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_2X32 RES_VIEW_FORMAT_FLOAT_2X32} - 2 channel 32-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_FLOAT_4X32 RES_VIEW_FORMAT_FLOAT_4X32} - 4 channel 32-bit floating point</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC1 RES_VIEW_FORMAT_UNSIGNED_BC1} - Block compressed 1</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC2 RES_VIEW_FORMAT_UNSIGNED_BC2} - Block compressed 2</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC3 RES_VIEW_FORMAT_UNSIGNED_BC3} - Block compressed 3</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC4 RES_VIEW_FORMAT_UNSIGNED_BC4} - Block compressed 4 unsigned</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SIGNED_BC4 RES_VIEW_FORMAT_SIGNED_BC4} - Block compressed 4 signed</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC5 RES_VIEW_FORMAT_UNSIGNED_BC5} - Block compressed 5 unsigned</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SIGNED_BC5 RES_VIEW_FORMAT_SIGNED_BC5} - Block compressed 5 signed</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC6H RES_VIEW_FORMAT_UNSIGNED_BC6H} - Block compressed 6 unsigned half-float</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_SIGNED_BC6H RES_VIEW_FORMAT_SIGNED_BC6H} - Block compressed 6 signed half-float</li>
     * <li>{@link #CU_RES_VIEW_FORMAT_UNSIGNED_BC7 RES_VIEW_FORMAT_UNSIGNED_BC7} - Block compressed 7</li>
     * </ul>
     */
    public static final int
        CU_RES_VIEW_FORMAT_NONE          = 0x0,
        CU_RES_VIEW_FORMAT_UINT_1X8      = 0x1,
        CU_RES_VIEW_FORMAT_UINT_2X8      = 0x2,
        CU_RES_VIEW_FORMAT_UINT_4X8      = 0x3,
        CU_RES_VIEW_FORMAT_SINT_1X8      = 0x4,
        CU_RES_VIEW_FORMAT_SINT_2X8      = 0x5,
        CU_RES_VIEW_FORMAT_SINT_4X8      = 0x6,
        CU_RES_VIEW_FORMAT_UINT_1X16     = 0x7,
        CU_RES_VIEW_FORMAT_UINT_2X16     = 0x8,
        CU_RES_VIEW_FORMAT_UINT_4X16     = 0x9,
        CU_RES_VIEW_FORMAT_SINT_1X16     = 0xA,
        CU_RES_VIEW_FORMAT_SINT_2X16     = 0xB,
        CU_RES_VIEW_FORMAT_SINT_4X16     = 0xC,
        CU_RES_VIEW_FORMAT_UINT_1X32     = 0xD,
        CU_RES_VIEW_FORMAT_UINT_2X32     = 0xE,
        CU_RES_VIEW_FORMAT_UINT_4X32     = 0xF,
        CU_RES_VIEW_FORMAT_SINT_1X32     = 0x10,
        CU_RES_VIEW_FORMAT_SINT_2X32     = 0x11,
        CU_RES_VIEW_FORMAT_SINT_4X32     = 0x12,
        CU_RES_VIEW_FORMAT_FLOAT_1X16    = 0x13,
        CU_RES_VIEW_FORMAT_FLOAT_2X16    = 0x14,
        CU_RES_VIEW_FORMAT_FLOAT_4X16    = 0x15,
        CU_RES_VIEW_FORMAT_FLOAT_1X32    = 0x16,
        CU_RES_VIEW_FORMAT_FLOAT_2X32    = 0x17,
        CU_RES_VIEW_FORMAT_FLOAT_4X32    = 0x18,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC1  = 0x19,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC2  = 0x1A,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC3  = 0x1B,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC4  = 0x1C,
        CU_RES_VIEW_FORMAT_SIGNED_BC4    = 0x1D,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC5  = 0x1E,
        CU_RES_VIEW_FORMAT_SIGNED_BC5    = 0x1F,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC6H = 0x20,
        CU_RES_VIEW_FORMAT_SIGNED_BC6H   = 0x21,
        CU_RES_VIEW_FORMAT_UNSIGNED_BC7  = 0x22;

    /**
     * Access flags that specify the level of access the current context's device has on the memory referenced. ({@code CUDA_POINTER_ATTRIBUTE_ACCESS_FLAGS})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAG_NONE POINTER_ATTRIBUTE_ACCESS_FLAG_NONE} - 
     * No access, meaning the device cannot access this memory at all, thus must be staged through accessible memory in order to complete certain
     * operations
     * </li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READ POINTER_ATTRIBUTE_ACCESS_FLAG_READ} - Read-only access, meaning writes to this memory are considered invalid accesses and thus return error in that case.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE} - Read-write access, the device has full read-write access to the memory</li>
     * </ul>
     */
    public static final int
        CU_POINTER_ATTRIBUTE_ACCESS_FLAG_NONE      = 0x0,
        CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READ      = 0x1,
        CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE = 0x3;

    /**
     * External memory handle types. ({@code CUexternalMemoryHandleType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD} - Handle is an opaque file descriptor</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32 EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32} - Handle is an opaque shared NT handle</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT} - Handle is an opaque, globally shared handle</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP} - Handle is a D3D12 heap object</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE} - Handle is a D3D12 committed resource</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE} - Handle is a shared NT handle to a D3D11 resource</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT} - Handle is a globally shared handle to a D3D11 resource</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF} - Handle is an NvSciBuf object</li>
     * </ul>
     */
    public static final int
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD          = 1,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32       = 2,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT   = 3,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP         = 4,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE     = 5,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE     = 6,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT = 7,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF           = 8;

    /** Indicates that the external memory object is a dedicated resource. */
    public static final int CUDA_EXTERNAL_MEMORY_DEDICATED = 0x1;

    /**
     * When the {@code flags} parameter of {@link CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS} contains this flag, it indicates that signaling an external semaphore
     * object should skip performing appropriate memory synchronization operations over all the external memory objects that are imported as
     * {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}, which otherwise are performed by default to ensure data coherency with other importers of the same
     * {@code NvSciBuf} memory objects.
     */
    public static final int CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC = 0x01;

    /**
     * When the {@code flags} parameter of {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} contains this flag, it indicates that waiting on an external
     * semaphore object should skip performing appropriate memory synchronization operations over all the external memory objects that are imported as
     * {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}, which otherwise are performed by default to ensure data coherency with other importers of the same
     * {@code NvSciBuf} memory objects.
     */
    public static final int CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC = 0x02;

    /**
     * When {@code flags} of {@link #cuDeviceGetNvSciSyncAttributes DeviceGetNvSciSyncAttributes} is set to this, it indicates that application needs signaler specific
     * {@code NvSciSyncAttr} to be filled by {@code cuDeviceGetNvSciSyncAttributes}.
     */
    public static final int CUDA_NVSCISYNC_ATTR_SIGNAL = 0x1;

    /**
     * When {@code flags} of {@link #cuDeviceGetNvSciSyncAttributes DeviceGetNvSciSyncAttributes} is set to this, it indicates that application needs waiter specific {@code NvSciSyncAttr} to be
     * filled by {@code cuDeviceGetNvSciSyncAttributes}.
     */
    public static final int CUDA_NVSCISYNC_ATTR_WAIT = 0x2;

    /**
     * External semaphore handle types. ({@code CUexternalSemaphoreHandleType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD} - Handle is an opaque file descriptor</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32} - Handle is an opaque shared NT handle</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT} - Handle is an opaque, globally shared handle</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE} - Handle is a shared NT handle referencing a D3D12 fence object</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE} - Handle is a shared NT handle referencing a D3D11 fence object</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC} - Opaque handle to NvSciSync Object</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX} - Handle is a shared NT handle referencing a D3D11 keyed mutex object</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT} - Handle is a globally shared handle referencing a D3D11 keyed mutex object</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD} - Handle is an opaque file descriptor referencing a timeline semaphore</li>
     * <li>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32} - Handle is an opaque shared NT handle referencing a timeline semaphore</li>
     * </ul>
     */
    public static final int
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD                = 1,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32             = 2,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT         = 3,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE              = 4,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE              = 5,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC                = 6,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX        = 7,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT    = 8,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD    = 9,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 = 10;

    /**
     * Flags for specifying particular handle types. ({@code CUmemAllocationHandleType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_HANDLE_TYPE_NONE MEM_HANDLE_TYPE_NONE} - Does not allow any export mechanism.</li>
     * <li>{@link #CU_MEM_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR MEM_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR} - Allows a file descriptor to be used for exporting. Permitted only on POSIX systems. ({@code int})</li>
     * <li>{@link #CU_MEM_HANDLE_TYPE_WIN32 MEM_HANDLE_TYPE_WIN32} - Allows a Win32 NT handle to be used for exporting. ({@code HANDLE})</li>
     * <li>{@link #CU_MEM_HANDLE_TYPE_WIN32_KMT MEM_HANDLE_TYPE_WIN32_KMT} - Allows a Win32 KMT handle to be used for exporting. ({@code D3DKMT_HANDLE})</li>
     * </ul>
     */
    public static final int
        CU_MEM_HANDLE_TYPE_NONE                  = 0x0,
        CU_MEM_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR = 0x1,
        CU_MEM_HANDLE_TYPE_WIN32                 = 0x2,
        CU_MEM_HANDLE_TYPE_WIN32_KMT             = 0x4;

    /**
     * Specifies the memory protection flags for mapping. ({@code CUmemAccess_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ACCESS_FLAGS_PROT_NONE MEM_ACCESS_FLAGS_PROT_NONE} - Default, make the address range not accessible</li>
     * <li>{@link #CU_MEM_ACCESS_FLAGS_PROT_READ MEM_ACCESS_FLAGS_PROT_READ} - Make the address range read accessible</li>
     * <li>{@link #CU_MEM_ACCESS_FLAGS_PROT_READWRITE MEM_ACCESS_FLAGS_PROT_READWRITE} - Make the address range read-write accessible</li>
     * </ul>
     */
    public static final int
        CU_MEM_ACCESS_FLAGS_PROT_NONE      = 0x0,
        CU_MEM_ACCESS_FLAGS_PROT_READ      = 0x1,
        CU_MEM_ACCESS_FLAGS_PROT_READWRITE = 0x3;

    /**
     * Specifies the type of location. ({@code CUmemLocationType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_LOCATION_TYPE_INVALID MEM_LOCATION_TYPE_INVALID}</li>
     * <li>{@link #CU_MEM_LOCATION_TYPE_DEVICE MEM_LOCATION_TYPE_DEVICE} - Location is a device location, thus id is a device ordinal</li>
     * </ul>
     */
    public static final int
        CU_MEM_LOCATION_TYPE_INVALID = 0x0,
        CU_MEM_LOCATION_TYPE_DEVICE  = 0x1;

    /**
     * Defines the allocation types available. ({@code CUmemAllocationType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ALLOCATION_TYPE_INVALID MEM_ALLOCATION_TYPE_INVALID}</li>
     * <li>{@link #CU_MEM_ALLOCATION_TYPE_PINNED MEM_ALLOCATION_TYPE_PINNED} - This allocation type is 'pinned', i.e. cannot migrate from its current location while the application is actively using it</li>
     * </ul>
     */
    public static final int
        CU_MEM_ALLOCATION_TYPE_INVALID = 0x0,
        CU_MEM_ALLOCATION_TYPE_PINNED  = 0x1;

    /**
     * Flag for requesting different optimal and required granularities for an allocation. ({@code CUmemAllocationGranularity_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ALLOC_GRANULARITY_MINIMUM MEM_ALLOC_GRANULARITY_MINIMUM} - Minimum required granularity for allocation</li>
     * <li>{@link #CU_MEM_ALLOC_GRANULARITY_RECOMMENDED MEM_ALLOC_GRANULARITY_RECOMMENDED} - Recommended granularity for allocation for best performance</li>
     * </ul>
     */
    public static final int
        CU_MEM_ALLOC_GRANULARITY_MINIMUM     = 0x0,
        CU_MEM_ALLOC_GRANULARITY_RECOMMENDED = 0x1;

    /**
     * Sparse subresource types. ({@code CUarraySparseSubresourceType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL}</li>
     * <li>{@link #CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL}</li>
     * </ul>
     */
    public static final int
        CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL = 0,
        CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL      = 1;

    /**
     * Memory operation types. ({@code CUmemOperationType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_OPERATION_TYPE_MAP MEM_OPERATION_TYPE_MAP}</li>
     * <li>{@link #CU_MEM_OPERATION_TYPE_UNMAP MEM_OPERATION_TYPE_UNMAP}</li>
     * </ul>
     */
    public static final int
        CU_MEM_OPERATION_TYPE_MAP   = 1,
        CU_MEM_OPERATION_TYPE_UNMAP = 2;

    /** Memory handle types ({@code CUmemHandleType}) */
    public static final int CU_MEM_HANDLE_TYPE_GENERIC = 0;

    /**
     * Specifies compression attribute for an allocation. ({@code CUmemAllocationCompType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ALLOCATION_COMP_NONE MEM_ALLOCATION_COMP_NONE} - Allocating non-compressible memory</li>
     * <li>{@link #CU_MEM_ALLOCATION_COMP_GENERIC MEM_ALLOCATION_COMP_GENERIC} - Allocating  compressible memory</li>
     * </ul>
     */
    public static final int
        CU_MEM_ALLOCATION_COMP_NONE    = 0x0,
        CU_MEM_ALLOCATION_COMP_GENERIC = 0x1;

    /** This flag if set indicates that the memory will be used as a tile pool. */
    public static final int CU_MEM_CREATE_USAGE_TILE_POOL = 0x1;

    /**
     * {@code CUgraphExecUpdateResult}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_SUCCESS GRAPH_EXEC_UPDATE_SUCCESS} - The update succeeded</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR GRAPH_EXEC_UPDATE_ERROR} - The update failed for an unexpected reason which is described in the return value of the function</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED} - The update failed because the topology changed</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED} - The update failed because a node type changed</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_FUNCTION_CHANGED GRAPH_EXEC_UPDATE_ERROR_FUNCTION_CHANGED} - The update failed because the function of a kernel node changed (CUDA driver &lt;11.2)</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED} - The update failed because the parameters changed in a way that is not supported</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED} - The update failed because something about the node is not supported</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE} - The update failed because the function of a kernel node changed in an unsupported way</li>
     * </ul>
     */
    public static final int
        CU_GRAPH_EXEC_UPDATE_SUCCESS                           = 0x0,
        CU_GRAPH_EXEC_UPDATE_ERROR                             = 0x1,
        CU_GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED            = 0x2,
        CU_GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED           = 0x3,
        CU_GRAPH_EXEC_UPDATE_ERROR_FUNCTION_CHANGED            = 0x4,
        CU_GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED          = 0x5,
        CU_GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED               = 0x6,
        CU_GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE = 0x7;

    /**
     * CUDA memory pool attributes ({@code CUmemPool_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES} - 
     * Allow {@link #cuMemAllocAsync MemAllocAsync} to use memory asynchronously freed in another streams as long as a stream ordering dependency of the allocating stream on
     * the free action exists. Cuda events and null stream interactions can create the required stream ordered dependencies.
     * 
     * <p>(value type = {@code int}, default enabled)</p>
     * </li>
     * <li>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC} - Allow reuse of already completed frees when there is no dependency between the free and allocation. (value type = {@code int}, default enabled)</li>
     * <li>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES} - 
     * Allow {@link #cuMemAllocAsync MemAllocAsync} to insert new stream dependencies in order to establish the stream ordering required to reuse a piece of memory released by
     * {@link #cuMemFreeAsync MemFreeAsync}.
     * 
     * <p>(value type = {@code int}, default enabled).</p>
     * </li>
     * <li>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD} - 
     * Amount of reserved memory in bytes to hold onto before trying to release memory back to the OS.
     * 
     * <p>When more than the release threshold bytes of memory are held by the memory pool, the allocator will try to release memory back to the OS on the
     * next call to stream, event or context synchronize.</p>
     * 
     * <p>(value type = {@code cuuint64_t}, default 0)</p>
     * </li>
     * <li>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT} - Amount of backing memory currently allocated for the mempool. (value type = {@code cuuint64_t})</li>
     * <li>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH} - 
     * High watermark of backing memory allocated for the {@code mempool} since the last time it was reset. High watermark can only be reset to zero.
     * 
     * <p>(value type = {@code cuuint64_t})</p>
     * </li>
     * <li>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT} - Amount of memory from the pool that is currently in use by the application (value type = {@code cuuint64_t}).</li>
     * <li>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH} - 
     * High watermark of the amount of memory from the pool that was in use by the application since the last time it was reset. High watermark can only
     * be reset to zero.
     * 
     * <p>(value type = {@code cuuint64_t})</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES   = 1,
        CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC         = 2,
        CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES = 3,
        CU_MEMPOOL_ATTR_RELEASE_THRESHOLD                 = 4,
        CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT              = 5,
        CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH                 = 6,
        CU_MEMPOOL_ATTR_USED_MEM_CURRENT                  = 7,
        CU_MEMPOOL_ATTR_USED_MEM_HIGH                     = 8;

    /**
     * {@code CUgraphMem_attribute}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_CURRENT GRAPH_MEM_ATTR_USED_MEM_CURRENT} - (value type = cuuint64_t) Amount of memory, in bytes, currently associated with graphs</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_HIGH GRAPH_MEM_ATTR_USED_MEM_HIGH} - 
     * High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can only be reset to zero.
     * 
     * <p>(value type = {@code cuuint64_t})</p>
     * </li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT} - Amount of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator. (value type = {@code cuuint64_t})</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH GRAPH_MEM_ATTR_RESERVED_MEM_HIGH} - High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator. (value type = {@code cuuint64_t})</li>
     * </ul>
     */
    public static final int
        CU_GRAPH_MEM_ATTR_USED_MEM_CURRENT     = 0,
        CU_GRAPH_MEM_ATTR_USED_MEM_HIGH        = 1,
        CU_GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT = 2,
        CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH    = 3;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC} - 
     * If set, each kernel launched as part of {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} only waits for prior work in the stream corresponding to that GPU to
     * complete before the kernel begins execution.
     * </li>
     * <li>{@link #CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC} - 
     * If set, any subsequent work pushed in a stream that participated in a call to {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} will only wait for the kernel
     * launched on the GPU corresponding to that stream to complete before it begins execution.
     * </li>
     * </ul>
     */
    public static final int
        CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC  = 0x1,
        CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC = 0x2;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CUDA_ARRAY3D_LAYERED CUDA_ARRAY3D_LAYERED} - 
     * If set, the CUDA array is a collection of layers, where each layer is either a 1D or a 2D array and the Depth member of {@link CUDA_ARRAY3D_DESCRIPTOR}
     * specifies the number of layers, not the depth of a 3D array.
     * </li>
     * <li>{@link #CUDA_ARRAY3D_2DARRAY CUDA_ARRAY3D_2DARRAY} - Deprecated, use {@link #CUDA_ARRAY3D_LAYERED}.</li>
     * <li>{@link #CUDA_ARRAY3D_SURFACE_LDST CUDA_ARRAY3D_SURFACE_LDST} - This flag must be set in order to bind a surface reference to the CUDA array.</li>
     * <li>{@link #CUDA_ARRAY3D_CUBEMAP CUDA_ARRAY3D_CUBEMAP} - 
     * If set, the CUDA array is a collection of six 2D arrays, representing faces of a cube. The width of such a CUDA array must be equal to its height,
     * and Depth must be six. If {@link #CUDA_ARRAY3D_LAYERED} flag is also set, then the CUDA array is a collection of cubemaps and Depth must be a multiple of
     * six.
     * </li>
     * <li>{@link #CUDA_ARRAY3D_TEXTURE_GATHER CUDA_ARRAY3D_TEXTURE_GATHER} - This flag must be set in order to perform texture gather operations on a CUDA array.</li>
     * <li>{@link #CUDA_ARRAY3D_DEPTH_TEXTURE CUDA_ARRAY3D_DEPTH_TEXTURE} - This flag if set indicates that the CUDA array is a DEPTH_TEXTURE.</li>
     * <li>{@link #CUDA_ARRAY3D_COLOR_ATTACHMENT CUDA_ARRAY3D_COLOR_ATTACHMENT} - This flag indicates that the CUDA array may be bound as a color target in an external graphics API.</li>
     * <li>{@link #CUDA_ARRAY3D_SPARSE CUDA_ARRAY3D_SPARSE} - This flag if set indicates that the CUDA array or CUDA mipmapped array is a sparse CUDA array or CUDA mipmapped array respectively</li>
     * </ul>
     */
    public static final int
        CUDA_ARRAY3D_LAYERED          = 0x01,
        CUDA_ARRAY3D_2DARRAY          = 0x01,
        CUDA_ARRAY3D_SURFACE_LDST     = 0x02,
        CUDA_ARRAY3D_CUBEMAP          = 0x04,
        CUDA_ARRAY3D_TEXTURE_GATHER   = 0x08,
        CUDA_ARRAY3D_DEPTH_TEXTURE    = 0x10,
        CUDA_ARRAY3D_COLOR_ATTACHMENT = 0x20,
        CUDA_ARRAY3D_SPARSE           = 0x40;

    /**
     * Flag for {@link #cuTexRefSetArray TexRefSetArray}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TRSA_OVERRIDE_FORMAT TRSA_OVERRIDE_FORMAT} - Override the {@code texref} format with a format inferred from the array.</li>
     * </ul>
     */
    public static final int CU_TRSA_OVERRIDE_FORMAT = 0x1;

    /**
     * Flag for {@link #cuTexRefSetFlags TexRefSetFlags}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TRSF_READ_AS_INTEGER TRSF_READ_AS_INTEGER} - Read the texture as integers rather than promoting the values to floats in the range {@code [0,1]}.</li>
     * <li>{@link #CU_TRSF_NORMALIZED_COORDINATES TRSF_NORMALIZED_COORDINATES} - Use normalized texture coordinates in the range {@code [0,1)} instead of {@code [0,dim)}.</li>
     * <li>{@link #CU_TRSF_SRGB TRSF_SRGB} - Perform {@code sRGB->linear} conversion during texture read.</li>
     * <li>{@link #CU_TRSF_DISABLE_TRILINEAR_OPTIMIZATION TRSF_DISABLE_TRILINEAR_OPTIMIZATION} - Disable any trilinear filtering optimizations.</li>
     * </ul>
     */
    public static final int
        CU_TRSF_READ_AS_INTEGER                = 0x01,
        CU_TRSF_NORMALIZED_COORDINATES         = 0x02,
        CU_TRSF_SRGB                           = 0x10,
        CU_TRSF_DISABLE_TRILINEAR_OPTIMIZATION = 0x20;

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

    /** For texture references loaded into the module, use default texunit from texture reference. */
    public static final int CU_PARAM_TR_DEFAULT = -1;

    /** Device that represents the CPU. */
    public static final int CU_DEVICE_CPU = -1;

    /** Device that represents an invalid device. */
    public static final int CU_DEVICE_INVALID = -2;

    /**
     * Bitmasks for {@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS}. ({@code CUflushGPUDirectRDMAWritesOptions})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_HOST FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_HOST} - {@link #cuFlushGPUDirectRDMAWrites FlushGPUDirectRDMAWrites} and its CUDA Runtime API counterpart are supported on the device.</li>
     * <li>{@link #CU_FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_MEMOPS FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_MEMOPS} - The {@link #CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH} flag and the {@link #CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES STREAM_MEM_OP_FLUSH_REMOTE_WRITES} {@code MemOp} are supported on the device.</li>
     * </ul>
     */
    public static final int
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_HOST   = 1<<0,
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_MEMOPS = 1<<1;

    /**
     * Platform native ordering for GPUDirect RDMA writes. ({@code CUGPUDirectRDMAWritesOrdering})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GPU_DIRECT_RDMA_WRITES_ORDERING_NONE GPU_DIRECT_RDMA_WRITES_ORDERING_NONE} - The device does not natively support ordering of remote writes. {@link #cuFlushGPUDirectRDMAWrites FlushGPUDirectRDMAWrites} can be leveraged if supported.</li>
     * <li>{@link #CU_GPU_DIRECT_RDMA_WRITES_ORDERING_OWNER GPU_DIRECT_RDMA_WRITES_ORDERING_OWNER} - Natively, the device can consistently consume remote writes, although other CUDA devices may not.</li>
     * <li>{@link #CU_GPU_DIRECT_RDMA_WRITES_ORDERING_ALL_DEVICES GPU_DIRECT_RDMA_WRITES_ORDERING_ALL_DEVICES} - Any CUDA device in the system can consistently consume remote writes to this device.</li>
     * </ul>
     */
    public static final int
        CU_GPU_DIRECT_RDMA_WRITES_ORDERING_NONE        = 0,
        CU_GPU_DIRECT_RDMA_WRITES_ORDERING_OWNER       = 100,
        CU_GPU_DIRECT_RDMA_WRITES_ORDERING_ALL_DEVICES = 200;

    /**
     * The scopes for {@link #cuFlushGPUDirectRDMAWrites FlushGPUDirectRDMAWrites} ({@code CUflushGPUDirectRDMAWritesScope})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TO_OWNER FLUSH_GPU_DIRECT_RDMA_WRITES_TO_OWNER} - Blocks until remote writes are visible to the CUDA device context owning the data.</li>
     * <li>{@link #CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TO_ALL_DEVICES FLUSH_GPU_DIRECT_RDMA_WRITES_TO_ALL_DEVICES} - Blocks until remote writes are visible to all CUDA device contexts.</li>
     * </ul>
     */
    public static final int
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TO_OWNER       = 100,
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TO_ALL_DEVICES = 200;

    /**
     * The targets for {@link #cuFlushGPUDirectRDMAWrites FlushGPUDirectRDMAWrites} ({@code CUflushGPUDirectRDMAWritesTarget})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TARGET_CURRENT_CTX FLUSH_GPU_DIRECT_RDMA_WRITES_TARGET_CURRENT_CTX} - Sets the target for {@code cuFlushGPUDirectRDMAWrites()} to the currently active CUDA device context.</li>
     * </ul>
     */
    public static final int CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TARGET_CURRENT_CTX = 0;

    /**
     * The additional write options for {@link #cuGraphDebugDotPrint GraphDebugDotPrint} ({@code CUgraphDebugDot_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_VERBOSE GRAPH_DEBUG_DOT_FLAGS_VERBOSE}</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_RUNTIME_TYPES GRAPH_DEBUG_DOT_FLAGS_RUNTIME_TYPES} - Output all debug data as if every debug flag is enabled</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_PARAMS} - Use CUDA Runtime structures for output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_MEMCPY_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_MEMCPY_NODE_PARAMS} - Adds {@link CUDA_KERNEL_NODE_PARAMS} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_MEMSET_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_MEMSET_NODE_PARAMS} - Adds {@link CUDA_MEMCPY3D} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_HOST_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_HOST_NODE_PARAMS} - Adds {@link CUDA_MEMSET_NODE_PARAMS} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_EVENT_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_EVENT_NODE_PARAMS} - Adds {@link CUDA_HOST_NODE_PARAMS} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_SIGNAL_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_SIGNAL_NODE_PARAMS} - Adds {@code CUevent} handle from record and wait nodes to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_WAIT_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_WAIT_NODE_PARAMS} - Adds {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_ATTRIBUTES GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_ATTRIBUTES} - Adds {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_HANDLES GRAPH_DEBUG_DOT_FLAGS_HANDLES} - Adds {@code CUkernelNodeAttrValue} values to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_MEM_ALLOC_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_MEM_ALLOC_NODE_PARAMS} - Adds node handles and every kernel function handle to output</li>
     * <li>{@link #CU_GRAPH_DEBUG_DOT_FLAGS_MEM_FREE_NODE_PARAMS GRAPH_DEBUG_DOT_FLAGS_MEM_FREE_NODE_PARAMS} - Adds memory alloc node parameters to output</li>
     * </ul>
     */
    public static final int
        CU_GRAPH_DEBUG_DOT_FLAGS_VERBOSE                      = 1<<0,
        CU_GRAPH_DEBUG_DOT_FLAGS_RUNTIME_TYPES                = 1<<1,
        CU_GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_PARAMS           = 1<<2,
        CU_GRAPH_DEBUG_DOT_FLAGS_MEMCPY_NODE_PARAMS           = 1<<3,
        CU_GRAPH_DEBUG_DOT_FLAGS_MEMSET_NODE_PARAMS           = 1<<4,
        CU_GRAPH_DEBUG_DOT_FLAGS_HOST_NODE_PARAMS             = 1<<5,
        CU_GRAPH_DEBUG_DOT_FLAGS_EVENT_NODE_PARAMS            = 1<<6,
        CU_GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_SIGNAL_NODE_PARAMS = 1<<7,
        CU_GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_WAIT_NODE_PARAMS   = 1<<8,
        CU_GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_ATTRIBUTES       = 1<<9,
        CU_GRAPH_DEBUG_DOT_FLAGS_HANDLES                      = 1<<10,
        CU_GRAPH_DEBUG_DOT_FLAGS_MEM_ALLOC_NODE_PARAMS        = 1<<11,
        CU_GRAPH_DEBUG_DOT_FLAGS_MEM_FREE_NODE_PARAMS         = 1<<12;

    /**
     * Flags for user objects for graphs. ({@code CUuserObject_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_USER_OBJECT_NO_DESTRUCTOR_SYNC USER_OBJECT_NO_DESTRUCTOR_SYNC} - Indicates the destructor execution is not synchronized by any CUDA handle.</li>
     * </ul>
     */
    public static final int CU_USER_OBJECT_NO_DESTRUCTOR_SYNC = 1;

    /**
     * Flags for retaining user object references for graphs. ({@code CUuserObjectRetain_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_USER_OBJECT_MOVE GRAPH_USER_OBJECT_MOVE} - Transfer references from the caller rather than creating new references.</li>
     * </ul>
     */
    public static final int CU_GRAPH_USER_OBJECT_MOVE = 1;

    /**
     * Flags for instantiating a graph. ({@code CUgraphInstantiate_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH} - Automatically free memory allocated in a graph before relaunching.</li>
     * </ul>
     */
    public static final int CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH = 1;

    protected CU() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuGetErrorString ] ---

    /** Unsafe version of: {@link #cuGetErrorString GetErrorString} */
    public static int ncuGetErrorString(int error, long pStr) {
        long __functionAddress = Functions.GetErrorString;
        return callPI(error, pStr, __functionAddress);
    }

    /**
     * Gets the string description of an error code.
     * 
     * <p>Sets {@code *pStr} to the address of a NULL-terminated string description of the error code {@code error}. If the error code is not recognized,
     * {@link #CUDA_ERROR_INVALID_VALUE} will be returned and {@code *pStr} will be set to the {@code NULL} address.</p>
     *
     * @param error error code to convert to string
     * @param pStr  address of the string pointer
     */
    @NativeType("CUresult")
    public static int cuGetErrorString(@NativeType("CUresult") int error, @NativeType("char const **") PointerBuffer pStr) {
        if (CHECKS) {
            check(pStr, 1);
        }
        return ncuGetErrorString(error, memAddress(pStr));
    }

    // --- [ cuGetErrorName ] ---

    /** Unsafe version of: {@link #cuGetErrorName GetErrorName} */
    public static int ncuGetErrorName(int error, long pStr) {
        long __functionAddress = Functions.GetErrorName;
        return callPI(error, pStr, __functionAddress);
    }

    /**
     * Gets the string representation of an error code enum name.
     * 
     * <p>Sets {@code *pStr} to the address of a NULL-terminated string representation of the name of the enum error code {@code error}. If the error code is not
     * recognized, {@link #CUDA_ERROR_INVALID_VALUE} will be returned and {@code *pStr} will be set to the {@code NULL} address.</p>
     *
     * @param error error code to convert to string
     * @param pStr  address of the string pointer
     */
    @NativeType("CUresult")
    public static int cuGetErrorName(@NativeType("CUresult") int error, @NativeType("char const **") PointerBuffer pStr) {
        if (CHECKS) {
            check(pStr, 1);
        }
        return ncuGetErrorName(error, memAddress(pStr));
    }

    // --- [ cuInit ] ---

    /**
     * Initialize the CUDA driver API.
     * 
     * <p>Initializes the driver API and must be called before any other function from the driver API. Currently, the {@code Flags} parameter must be 0. If
     * {@code cuInit()} has not been called, any function from the driver API will return {@link #CUDA_ERROR_NOT_INITIALIZED}.</p>
     *
     * @param Flags initialization flag for CUDA
     */
    @NativeType("CUresult")
    public static int cuInit(@NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.Init;
        return callI(Flags, __functionAddress);
    }

    // --- [ cuDriverGetVersion ] ---

    /** Unsafe version of: {@link #cuDriverGetVersion DriverGetVersion} */
    public static int ncuDriverGetVersion(long driverVersion) {
        long __functionAddress = Functions.DriverGetVersion;
        return callPI(driverVersion, __functionAddress);
    }

    /**
     * Returns the latest CUDA version supported by driver.
     * 
     * <p>Returns in {@code *driverVersion} the version of CUDA supported by the driver. The version is returned as ({@code 1000 × major + 10 × minor}). For
     * example, CUDA 9.2 would be represented by 9020.</p>
     * 
     * <p>This function automatically returns {@link #CUDA_ERROR_INVALID_VALUE} if {@code driverVersion} is {@code NULL}.</p>
     *
     * @param driverVersion returns the CUDA driver version
     */
    @NativeType("CUresult")
    public static int cuDriverGetVersion(@NativeType("int *") IntBuffer driverVersion) {
        if (CHECKS) {
            check(driverVersion, 1);
        }
        return ncuDriverGetVersion(memAddress(driverVersion));
    }

    // --- [ cuDeviceGet ] ---

    /** Unsafe version of: {@link #cuDeviceGet DeviceGet} */
    public static int ncuDeviceGet(long device, int ordinal) {
        long __functionAddress = Functions.DeviceGet;
        return callPI(device, ordinal, __functionAddress);
    }

    /**
     * Returns a handle to a compute device.
     * 
     * <p>Returns in {@code *device} a device handle given an ordinal in the range {@code [0, cuDeviceGetCount()-1]}.</p>
     *
     * @param device  returned device handle
     * @param ordinal device number to get handle for
     */
    @NativeType("CUresult")
    public static int cuDeviceGet(@NativeType("CUdevice *") IntBuffer device, int ordinal) {
        if (CHECKS) {
            check(device, 1);
        }
        return ncuDeviceGet(memAddress(device), ordinal);
    }

    // --- [ cuDeviceGetCount ] ---

    /** Unsafe version of: {@link #cuDeviceGetCount DeviceGetCount} */
    public static int ncuDeviceGetCount(long count) {
        long __functionAddress = Functions.DeviceGetCount;
        return callPI(count, __functionAddress);
    }

    /**
     * Returns the number of compute-capable devices.
     * 
     * <p>Returns in {@code *count} the number of devices with compute capability greater than or equal to 2.0 that are available for execution. If there is no
     * such device, {@code cuDeviceGetCount()} returns 0.</p>
     *
     * @param count returned number of compute-capable devices
     */
    @NativeType("CUresult")
    public static int cuDeviceGetCount(@NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return ncuDeviceGetCount(memAddress(count));
    }

    // --- [ cuDeviceGetName ] ---

    /**
     * Unsafe version of: {@link #cuDeviceGetName DeviceGetName}
     *
     * @param len maximum length of string to store in {@code name}
     */
    public static int ncuDeviceGetName(long name, int len, int dev) {
        long __functionAddress = Functions.DeviceGetName;
        return callPI(name, len, dev, __functionAddress);
    }

    /**
     * Returns an identifer string for the device.
     * 
     * <p>Returns an ASCII string identifying the device {@code dev} in the NULL-terminated string pointed to by {@code name}. {@code len} specifies the maximum
     * length of the string that may be returned.</p>
     *
     * @param name returned identifier string for the device
     * @param dev  device to get identifier string for
     */
    @NativeType("CUresult")
    public static int cuDeviceGetName(@NativeType("char *") ByteBuffer name, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetName(memAddress(name), name.remaining(), dev);
    }

    // --- [ cuDeviceGetUuid ] ---

    /** Unsafe version of: {@link #cuDeviceGetUuid DeviceGetUuid} */
    public static int ncuDeviceGetUuid(long uuid, int dev) {
        long __functionAddress = Functions.DeviceGetUuid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(uuid, dev, __functionAddress);
    }

    /**
     * Return an UUID for the device.
     * 
     * <p>Note there is a later version of this API, {@link #cuDeviceGetUuid_v2 DeviceGetUuid_v2}. It will supplant this version in 12.0, which is retained for minor version.
     * compatibility.</p>
     * 
     * <p>Returns 16-octets identifing the device {@code dev} in the structure pointed by the {@code uuid}.</p>
     *
     * @param uuid returned UUID
     * @param dev  device to get identifier string for
     */
    @NativeType("CUresult")
    public static int cuDeviceGetUuid(@NativeType("CUuuid *") CUuuid uuid, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetUuid(uuid.address(), dev);
    }

    // --- [ cuDeviceGetUuid_v2 ] ---

    /** Unsafe version of: {@link #cuDeviceGetUuid_v2 DeviceGetUuid_v2} */
    public static int ncuDeviceGetUuid_v2(long uuid, int dev) {
        long __functionAddress = Functions.DeviceGetUuid_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(uuid, dev, __functionAddress);
    }

    /**
     * Return an UUID for the device (11.4+).
     * 
     * <p>Returns 16-octets identifing the device {@code dev} in the structure pointed by the {@code uuid}. If the device is in MIG mode, returns its MIG UUID
     * which uniquely identifies the subscribed MIG compute instance.</p>
     *
     * @param uuid returned UUID
     * @param dev  device to get identifier string for
     */
    @NativeType("CUresult")
    public static int cuDeviceGetUuid_v2(@NativeType("CUuuid *") CUuuid uuid, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetUuid_v2(uuid.address(), dev);
    }

    // --- [ cuDeviceGetLuid ] ---

    /** Unsafe version of: {@link #cuDeviceGetLuid DeviceGetLuid} */
    public static int ncuDeviceGetLuid(long luid, long deviceNodeMask, int dev) {
        long __functionAddress = Functions.DeviceGetLuid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(luid, deviceNodeMask, dev, __functionAddress);
    }

    /**
     * Return an LUID and device node mask for the device
     * 
     * <p>Return identifying information ({@code luid} and {@code deviceNodeMask}) to allow matching device with graphics APIs.</p>
     *
     * @param luid           returned LUID
     * @param deviceNodeMask returned device node mask
     * @param dev            device to get identifier string for
     */
    @NativeType("CUresult")
    public static int cuDeviceGetLuid(@NativeType("char *") ByteBuffer luid, @NativeType("unsigned int *") IntBuffer deviceNodeMask, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(deviceNodeMask, 1);
        }
        return ncuDeviceGetLuid(memAddress(luid), memAddress(deviceNodeMask), dev);
    }

    // --- [ cuDeviceTotalMem ] ---

    /** Unsafe version of: {@link #cuDeviceTotalMem DeviceTotalMem} */
    public static int ncuDeviceTotalMem(long bytes, int dev) {
        long __functionAddress = Functions.DeviceTotalMem;
        return callPI(bytes, dev, __functionAddress);
    }

    /**
     * Returns the total amount of memory on the device
     * 
     * <p>Returns in {@code *bytes} the total amount of memory available on the device {@code dev} in bytes.</p>
     *
     * @param bytes returned memory available on device in bytes
     * @param dev   device handle
     */
    @NativeType("CUresult")
    public static int cuDeviceTotalMem(@NativeType("size_t *") PointerBuffer bytes, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(bytes, 1);
        }
        return ncuDeviceTotalMem(memAddress(bytes), dev);
    }

    // --- [ cuDeviceGetTexture1DLinearMaxWidth ] ---

    /** Unsafe version of: {@link #cuDeviceGetTexture1DLinearMaxWidth DeviceGetTexture1DLinearMaxWidth} */
    public static int ncuDeviceGetTexture1DLinearMaxWidth(long maxWidthInElements, int format, int numChannels, int dev) {
        long __functionAddress = Functions.DeviceGetTexture1DLinearMaxWidth;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(maxWidthInElements, format, numChannels, dev, __functionAddress);
    }

    /**
     * Returns the maximum number of elements allocatable in a 1D linear texture for a given texture element size.
     * 
     * <p>Returns in {@code maxWidthInElements} the maximum number of texture elements allocatable in a 1D linear texture for given {@code format} and {@code
     * numChannels}.</p>
     *
     * @param maxWidthInElements returned maximum number of texture elements allocatable for given {@code format} and {@code numChannels}
     * @param format             texture format
     * @param numChannels        number of channels per texture element
     * @param dev                device handle
     */
    @NativeType("CUresult")
    public static int cuDeviceGetTexture1DLinearMaxWidth(@NativeType("size_t *") PointerBuffer maxWidthInElements, @NativeType("CUarray_format") int format, @NativeType("unsigned int") int numChannels, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(maxWidthInElements, 1);
        }
        return ncuDeviceGetTexture1DLinearMaxWidth(memAddress(maxWidthInElements), format, numChannels, dev);
    }

    // --- [ cuDeviceGetAttribute ] ---

    /** Unsafe version of: {@link #cuDeviceGetAttribute DeviceGetAttribute} */
    public static int ncuDeviceGetAttribute(long pi, int attrib, int dev) {
        long __functionAddress = Functions.DeviceGetAttribute;
        return callPI(pi, attrib, dev, __functionAddress);
    }

    /**
     * Returns information about the device.
     * 
     * <p>Returns in {@code *pi} the integer value of the attribute {@code attrib} on device {@code dev}. The supported attributes are:</p>
     *
     * @param pi     returned device attribute value
     * @param attrib device attribute to query
     * @param dev    device handle
     */
    @NativeType("CUresult")
    public static int cuDeviceGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUdevice_attribute") int attrib, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuDeviceGetAttribute(memAddress(pi), attrib, dev);
    }

    // --- [ cuDeviceGetNvSciSyncAttributes ] ---

    /** Unsafe version of: {@link #cuDeviceGetNvSciSyncAttributes DeviceGetNvSciSyncAttributes} */
    public static int ncuDeviceGetNvSciSyncAttributes(long nvSciSyncAttrList, int dev, int flags) {
        long __functionAddress = Functions.DeviceGetNvSciSyncAttributes;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nvSciSyncAttrList, dev, flags, __functionAddress);
    }

    /**
     * Return {@code NvSciSync} attributes that this device can support.
     * 
     * <p>Returns in {@code nvSciSyncAttrList}, the properties of {@code NvSciSync} that this CUDA device, {@code dev} can support. The returned {@code
     * nvSciSyncAttrList} can be used to create an {@code NvSciSync} object that matches this device's capabilities.</p>
     * 
     * <p>If {@code NvSciSyncAttrKey_RequiredPerm} field in {@code nvSciSyncAttrList} is already set this API will return {@link #CUDA_ERROR_INVALID_VALUE}.</p>
     * 
     * <p>The applications should set {@code nvSciSyncAttrList} to a valid {@code NvSciSyncAttrList} failing which this API will return
     * {@link #CUDA_ERROR_INVALID_HANDLE}.</p>
     * 
     * <p>The {@code flags} controls how applications intends to use the {@code NvSciSync} created from the {@code nvSciSyncAttrList}. The valid flags are:</p>
     * 
     * <ul>
     * <li>{@link #CUDA_NVSCISYNC_ATTR_SIGNAL}, specifies that the applications intends to signal an {@code NvSciSync} on this CUDA device.</li>
     * <li>{@link #CUDA_NVSCISYNC_ATTR_WAIT}, specifies that the applications intends to wait on an {@code NvSciSync} on this CUDA device.</li>
     * </ul>
     * 
     * <p>At least one of these flags must be set, failing which the API returns {@link #CUDA_ERROR_INVALID_VALUE}. Both the flags are orthogonal to one another: a
     * developer may set both these flags that allows to set both wait and signal specific attributes in the same {@code nvSciSyncAttrList}.</p>
     *
     * @param nvSciSyncAttrList return NvSciSync attributes supported
     * @param dev               valid Cuda Device to get {@code NvSciSync} attributes for
     * @param flags             flags describing {@code NvSciSync} usage
     */
    @NativeType("CUresult")
    public static int cuDeviceGetNvSciSyncAttributes(@NativeType("void *") ByteBuffer nvSciSyncAttrList, @NativeType("CUdevice") int dev, int flags) {
        return ncuDeviceGetNvSciSyncAttributes(memAddress(nvSciSyncAttrList), dev, flags);
    }

    // --- [ cuDeviceSetMemPool ] ---

    /**
     * Sets the current memory pool of a device
     * 
     * <p>The memory pool must be local to the specified device. {@link #cuMemAllocAsync MemAllocAsync} allocates from the current mempool of the provided stream's device. By default,
     * a device's current memory pool is its default memory pool.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Use {@link #cuMemAllocFromPoolAsync MemAllocFromPoolAsync} to specify asynchronous allocations from a device different than the one the stream runs on.</p></div>
     */
    @NativeType("CUresult")
    public static int cuDeviceSetMemPool(@NativeType("CUdevice") int dev, @NativeType("CUmemoryPool") long pool) {
        long __functionAddress = Functions.DeviceSetMemPool;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPI(dev, pool, __functionAddress);
    }

    // --- [ cuDeviceGetMemPool ] ---

    /** Unsafe version of: {@link #cuDeviceGetMemPool DeviceGetMemPool} */
    public static int ncuDeviceGetMemPool(long pool, int dev) {
        long __functionAddress = Functions.DeviceGetMemPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pool, dev, __functionAddress);
    }

    /**
     * Gets the current mempool for a device.
     * 
     * <p>Returns the last pool provided to {@link #cuDeviceSetMemPool DeviceSetMemPool} for this device or the device's default memory pool if {@link #cuDeviceSetMemPool DeviceSetMemPool} has never been called.
     * By default the current mempool is the default mempool for a device. Otherwise the returned pool must have been set with {@link #cuDeviceSetMemPool DeviceSetMemPool}.</p>
     */
    @NativeType("CUresult")
    public static int cuDeviceGetMemPool(@NativeType("CUmemoryPool *") PointerBuffer pool, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pool, 1);
        }
        return ncuDeviceGetMemPool(memAddress(pool), dev);
    }

    // --- [ cuDeviceGetDefaultMemPool ] ---

    /** Unsafe version of: {@link #cuDeviceGetDefaultMemPool DeviceGetDefaultMemPool} */
    public static int ncuDeviceGetDefaultMemPool(long pool_out, int dev) {
        long __functionAddress = Functions.DeviceGetDefaultMemPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pool_out, dev, __functionAddress);
    }

    /**
     * Returns the default mempool of a device.
     * 
     * <p>The default mempool of a device contains device memory from that device.</p>
     */
    @NativeType("CUresult")
    public static int cuDeviceGetDefaultMemPool(@NativeType("CUmemoryPool *") PointerBuffer pool_out, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pool_out, 1);
        }
        return ncuDeviceGetDefaultMemPool(memAddress(pool_out), dev);
    }

    // --- [ cuFlushGPUDirectRDMAWrites ] ---

    /**
     * Blocks until remote writes are visible to the specified scope.
     * 
     * <p>Blocks until GPUDirect RDMA writes to the target context via mappings created through APIs like nvidia_p2p_get_pages (see
     * <a target="_blank" href="https://docs.nvidia.com/cuda/gpudirect-rdma">https://docs.nvidia.com/cuda/gpudirect-rdma</a> for more information), are visible to the specified scope.</p>
     * 
     * <p>If the scope equals or lies within the scope indicated by {@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING}, the call will be a no-op and can be safely
     * omitted for performance. This can be determined by comparing the numerical values between the two enums, with smaller scopes having smaller values.</p>
     * 
     * <p>Users may query support for this API via {@link #CU_DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS}.</p>
     *
     * @param target the target of the operation, see {@code CUflushGPUDirectRDMAWritesTarget}
     * @param scope  the scope of the operation, see {@code CUflushGPUDirectRDMAWritesScope}
     */
    @NativeType("CUresult")
    public static int cuFlushGPUDirectRDMAWrites(@NativeType("CUflushGPUDirectRDMAWritesTarget") int target, @NativeType("CUflushGPUDirectRDMAWritesScope") int scope) {
        long __functionAddress = Functions.FlushGPUDirectRDMAWrites;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(target, scope, __functionAddress);
    }

    // --- [ cuDeviceGetProperties ] ---

    /** Unsafe version of: {@link #cuDeviceGetProperties DeviceGetProperties} */
    public static int ncuDeviceGetProperties(long prop, int dev) {
        long __functionAddress = Functions.DeviceGetProperties;
        return callPI(prop, dev, __functionAddress);
    }

    /**
     * Returns properties for a selected device.
     * 
     * <p>Deprecated: This function was deprecated as of CUDA 5.0 and replaced by {@link #cuDeviceGetAttribute DeviceGetAttribute}.</p>
     * 
     * <p>Returns in {@code *prop} the properties of device {@code dev}.</p>
     *
     * @param prop returned properties of device
     * @param dev  device to get properties for
     */
    @NativeType("CUresult")
    public static int cuDeviceGetProperties(@NativeType("CUdevprop *") CUdevprop prop, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetProperties(prop.address(), dev);
    }

    // --- [ cuDeviceComputeCapability ] ---

    /** Unsafe version of: {@link #cuDeviceComputeCapability DeviceComputeCapability} */
    public static int ncuDeviceComputeCapability(long major, long minor, int dev) {
        long __functionAddress = Functions.DeviceComputeCapability;
        return callPPI(major, minor, dev, __functionAddress);
    }

    /**
     * Returns the compute capability of the device.
     * 
     * <p>Deprecated: This function was deprecated as of CUDA 5.0 and its functionality superceded by {@link #cuDeviceGetAttribute DeviceGetAttribute}.</p>
     * 
     * <p>Returns in {@code *major} and {@code *minor} the major and minor revision numbers that define the compute capability of the device {@code dev}.</p>
     *
     * @param major major revision number
     * @param minor minor revision number
     * @param dev   device handle
     */
    @NativeType("CUresult")
    public static int cuDeviceComputeCapability(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return ncuDeviceComputeCapability(memAddress(major), memAddress(minor), dev);
    }

    // --- [ cuDevicePrimaryCtxRetain ] ---

    /** Unsafe version of: {@link #cuDevicePrimaryCtxRetain DevicePrimaryCtxRetain} */
    public static int ncuDevicePrimaryCtxRetain(long pctx, int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxRetain;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pctx, dev, __functionAddress);
    }

    /**
     * Retain the primary context on the GPU.
     * 
     * <p>Retains the primary context on the device. Once the user successfully retains the primary context, the primary context will be active and available to
     * the user until the user releases it with {@link #cuDevicePrimaryCtxRelease DevicePrimaryCtxRelease} or resets it with {@link #cuDevicePrimaryCtxReset DevicePrimaryCtxReset}. Unlike {@link #cuCtxCreate CtxCreate} the newly retained
     * context is not pushed onto the stack.</p>
     * 
     * <p>Retaining the primary context for the first time will fail with {@link #CUDA_ERROR_UNKNOWN} if the compute mode of the device is {@link #CU_COMPUTEMODE_PROHIBITED COMPUTEMODE_PROHIBITED}. The
     * function {@link #cuDeviceGetAttribute DeviceGetAttribute} can be used with {@link #CU_DEVICE_ATTRIBUTE_COMPUTE_MODE DEVICE_ATTRIBUTE_COMPUTE_MODE} to determine the compute mode of the device. The <i>nvidia-smi</i> tool
     * can be used to set the compute mode for devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a -h option to it.</p>
     * 
     * <p>Please note that the primary context always supports pinned allocations. Other flags can be specified by {@link #cuDevicePrimaryCtxSetFlags DevicePrimaryCtxSetFlags}.</p>
     *
     * @param pctx returned context handle of the new context
     * @param dev  device for which primary context is requested
     */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxRetain(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuDevicePrimaryCtxRetain(memAddress(pctx), dev);
    }

    // --- [ cuDevicePrimaryCtxRelease ] ---

    /**
     * Release the primary context on the GPU.
     * 
     * <p>Releases the primary context interop on the device. A retained context should always be released once the user is done using it. The context is
     * automatically reset once the last reference to it is released. This behavior is different when the primary context was retained by the CUDA runtime
     * from CUDA 4.0 and earlier. In this case, the primary context remains always active.</p>
     * 
     * <p>Releasing a primary context that has not been previously retained will fail with {@link #CUDA_ERROR_INVALID_CONTEXT}.</p>
     * 
     * <p>Please note that unlike {@link #cuCtxDestroy CtxDestroy} this method does not pop the context from stack in any circumstances.</p>
     *
     * @param dev device which primary context is released
     */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxRelease(@NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxRelease;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(dev, __functionAddress);
    }

    // --- [ cuDevicePrimaryCtxSetFlags ] ---

    /**
     * Set flags for the primary context.
     * 
     * <p>Sets the flags for the primary context on the device overwriting perviously set ones.</p>
     * 
     * <p>The three LSBs of the {@code flags} parameter can be used to control how the OS thread, which owns the CUDA context at the time of an API call,
     * interacts with the OS scheduler when waiting for results from the GPU. Only one of the scheduling flags can be set when creating a context:</p>
     * 
     * <ul>
     * <li>{@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN}: Instruct CUDA to actively spin when waiting for results from the GPU. This can decrease latency when waiting for the GPU, but
     * may lower the performance of CPU threads if they are performing work in parallel with the CUDA thread.</li>
     * <li>{@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD}: Instruct CUDA to yield its thread when waiting for results from the GPU. This can increase latency when waiting for the GPU,
     * but can increase the performance of CPU threads performing work in parallel with the GPU.</li>
     * <li>{@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.</li>
     * <li>{@link #CU_CTX_BLOCKING_SYNC CTX_BLOCKING_SYNC}: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.
     * 
     * <p><b> Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was replaced with {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}.</p></li>
     * <li>{@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO}: The default value if the {@code flags} parameter is zero, uses a heuristic based on the number of active CUDA contexts in the
     * process <em>C</em> and the number of logical processors in the system <em>P</em>. If <em>C</em> &gt; <em>P</em>, then CUDA will yield to other OS
     * threads when waiting for the GPU ({@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD}), otherwise CUDA will not yield while waiting for results and actively spin on the processor
     * ({@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN}). Additionally, on Tegra devices, {@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO} uses a heuristic based on the power profile of the platform and may choose
     * {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} for low-powered devices.</li>
     * <li>{@link #CU_CTX_LMEM_RESIZE_TO_MAX CTX_LMEM_RESIZE_TO_MAX}: Instruct CUDA to not reduce local memory after resizing local memory for a kernel. This can prevent thrashing by local
     * memory allocations when launching many kernels with high local memory usage at the cost of potentially increased memory usage.
     * 
     * <p><b> Deprecated:</b> This flag is deprecated and the behavior enabled by this flag is now the default and cannot be disabled.</p></li>
     * </ul>
     *
     * @param dev   device for which the primary context flags are set
     * @param flags new flags for the device
     */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxSetFlags(@NativeType("CUdevice") int dev, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.DevicePrimaryCtxSetFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(dev, flags, __functionAddress);
    }

    // --- [ cuDevicePrimaryCtxGetState ] ---

    /** Unsafe version of: {@link #cuDevicePrimaryCtxGetState DevicePrimaryCtxGetState} */
    public static int ncuDevicePrimaryCtxGetState(int dev, long flags, long active) {
        long __functionAddress = Functions.DevicePrimaryCtxGetState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dev, flags, active, __functionAddress);
    }

    /**
     * Get the state of the primary context.
     * 
     * <p>Returns in {@code *flags} the flags for the primary context of {@code dev}, and in {@code *active} whether it is active. See
     * {@link #cuDevicePrimaryCtxSetFlags DevicePrimaryCtxSetFlags} for flag values.</p>
     *
     * @param dev    device to get primary context flags for
     * @param flags  pointer to store flags
     * @param active pointer to store context state; 0 = inactive, 1 = active
     */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxGetState(@NativeType("CUdevice") int dev, @NativeType("unsigned int *") IntBuffer flags, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(flags, 1);
            check(active, 1);
        }
        return ncuDevicePrimaryCtxGetState(dev, memAddress(flags), memAddress(active));
    }

    // --- [ cuDevicePrimaryCtxReset ] ---

    /**
     * Destroy all allocations and reset all state on the primary context.
     * 
     * <p>Explicitly destroys and cleans up all resources associated with the current device in the current process.</p>
     * 
     * <p>Note that it is responsibility of the calling function to ensure that no other module in the process is using the device any more. For that reason it
     * is recommended to use {@link #cuDevicePrimaryCtxRelease DevicePrimaryCtxRelease} in most cases. However it is safe for other modules to call {@code cuDevicePrimaryCtxRelease()} even
     * after resetting the device. Resetting the primary context does not release it, an application that has retained the primary context should explicitly
     * release its usage.</p>
     *
     * @param dev device for which primary context is destroyed
     */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxReset(@NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxReset;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(dev, __functionAddress);
    }

    // --- [ cuDeviceGetExecAffinitySupport ] ---

    /** Unsafe version of: {@link #cuDeviceGetExecAffinitySupport DeviceGetExecAffinitySupport} */
    public static int ncuDeviceGetExecAffinitySupport(long pi, int type, int dev) {
        long __functionAddress = Functions.DeviceGetExecAffinitySupport;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pi, type, dev, __functionAddress);
    }

    /**
     * Returns information about the execution affinity support of the device.
     * 
     * <p>Returns in {@code *pi} whether execution affinity type {@code type} is supported by device {@code dev}. The supported types are:</p>
     * 
     * <ul>
     * <li>{@link #CU_EXEC_AFFINITY_TYPE_SM_COUNT EXEC_AFFINITY_TYPE_SM_COUNT}: 1 if context with limited SMs is supported by the device, or 0 if not;</li>
     * </ul>
     *
     * @param pi   1 if the execution affinity type {@code type} is supported by the device, or 0 if not
     * @param type execution affinity type to query
     * @param dev  device handle
     */
    @NativeType("CUresult")
    public static int cuDeviceGetExecAffinitySupport(@NativeType("int *") IntBuffer pi, @NativeType("CUexecAffinityType") int type, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuDeviceGetExecAffinitySupport(memAddress(pi), type, dev);
    }

    // --- [ cuCtxCreate ] ---

    /** Unsafe version of: {@link #cuCtxCreate CtxCreate} */
    public static int ncuCtxCreate(long pctx, int flags, int dev) {
        long __functionAddress = Functions.CtxCreate;
        return callPI(pctx, flags, dev, __functionAddress);
    }

    /**
     * Create a CUDA context.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In most cases it is recommended to use {@link #cuDevicePrimaryCtxRetain DevicePrimaryCtxRetain}.</p></div>
     * 
     * <p>Creates a new CUDA context and associates it with the calling thread. The {@code flags} parameter is described below. The context is created with a
     * usage count of 1 and the caller of {@code cuCtxCreate()} must call {@link #cuCtxDestroy CtxDestroy} or when done using the context. If a context is already current to the
     * thread, it is supplanted by the newly created context and may be restored by a subsequent call to {@link #cuCtxPopCurrent CtxPopCurrent}.</p>
     * 
     * <p>The three LSBs of the {@code flags} parameter can be used to control how the OS thread, which owns the CUDA context at the time of an API call,
     * interacts with the OS scheduler when waiting for results from the GPU. Only one of the scheduling flags can be set when creating a context:</p>
     * 
     * <ul>
     * <li>{@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN}: Instruct CUDA to actively spin when waiting for results from the GPU. This can decrease latency when waiting for the GPU, but may
     * lower the performance of CPU threads if they are performing work in parallel with the CUDA thread.</li>
     * <li>{@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD}: Instruct CUDA to yield its thread when waiting for results from the GPU. This can increase latency when waiting for the GPU, but
     * can increase the performance of CPU threads performing work in parallel with the GPU.</li>
     * <li>{@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.</li>
     * <li>{@link #CU_CTX_BLOCKING_SYNC CTX_BLOCKING_SYNC}: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.
     * 
     * <p><b> Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was replaced with {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}.</p></li>
     * <li>{@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO}: The default value if the {@code flags} parameter is zero, uses a heuristic based on the number of active CUDA contexts in the
     * process <em>C</em> and the number of logical processors in the system <em>P</em>. If <em>C</em> &gt; <em>P</em>, then CUDA will yield to other OS
     * threads when waiting for the GPU ({@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD}), otherwise CUDA will not yield while waiting for results and actively spin on the processor
     * ({@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN}). Additionally, on Tegra devices, {@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO} uses a heuristic based on the power profile of the platform and may choose
     * {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} for low-powered devices.</li>
     * <li>{@link #CU_CTX_MAP_HOST CTX_MAP_HOST}: Instruct CUDA to support mapped pinned allocations. This flag must be set in order to allocate pinned host memory that is
     * accessible to the GPU.</li>
     * <li>{@link #CU_CTX_LMEM_RESIZE_TO_MAX CTX_LMEM_RESIZE_TO_MAX}: Instruct CUDA to not reduce local memory after resizing local memory for a kernel. This can prevent thrashing by local
     * memory allocations when launching many kernels with high local memory usage at the cost of potentially increased memory usage.
     * 
     * <p><b> Deprecated:</b> This flag is deprecated and the behavior enabled by this flag is now the default and cannot be disabled. Instead, the
     * per-thread stack size can be controlled with {@link #cuCtxSetLimit CtxSetLimit}.</p></li>
     * </ul>
     * 
     * <p>Context creation will fail with {@link #CUDA_ERROR_UNKNOWN} if the compute mode of the device is {@link #CU_COMPUTEMODE_PROHIBITED COMPUTEMODE_PROHIBITED}. The function {@link #cuDeviceGetAttribute DeviceGetAttribute}
     * can be used with {@link #CU_DEVICE_ATTRIBUTE_COMPUTE_MODE DEVICE_ATTRIBUTE_COMPUTE_MODE} to determine the compute mode of the device. The <i>nvidia-smi</i> tool can be used to set the compute
     * mode for * devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a -h option to it.</p>
     *
     * @param pctx  returned context handle of the new context
     * @param flags context creation flags
     * @param dev   device to create context on
     */
    @NativeType("CUresult")
    public static int cuCtxCreate(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("unsigned int") int flags, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxCreate(memAddress(pctx), flags, dev);
    }

    // --- [ cuCtxCreate_v3 ] ---

    /**
     * Unsafe version of: {@link #cuCtxCreate_v3 CtxCreate_v3}
     *
     * @param numParams number of execution affinity parameters
     */
    public static int ncuCtxCreate_v3(long pctx, long paramsArray, int numParams, int flags, int dev) {
        long __functionAddress = Functions.CtxCreate_v3;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pctx, paramsArray, numParams, flags, dev, __functionAddress);
    }

    /**
     * Create a CUDA context with execution affinity.
     * 
     * <p>Creates a new CUDA context with execution affinity and associates it with the calling thread. The {@code paramsArray} and {@code flags} parameter are
     * described below. The context is created with a usage count of 1 and the caller of {@link #cuCtxCreate CtxCreate} must call {@link #cuCtxDestroy CtxDestroy} or when done using the
     * context. If a context is already current to the thread, it is supplanted by the newly created context and may be restored by a subsequent call to
     * {@link #cuCtxPopCurrent CtxPopCurrent}.</p>
     * 
     * <p>The type and the amount of execution resource the context can use is limited by {@code paramsArray} and {@code numParams}. The {@code paramsArray} is
     * an array of {@code CUexecAffinityParam} and the {@code numParams} describes the size of the array. If two {@code CUexecAffinityParam} in the array have
     * the same type, the latter execution affinity parameter overrides the former execution affinity parameter. The supported execution affinity types are:</p>
     * 
     * <ul>
     * <li>{@link #CU_EXEC_AFFINITY_TYPE_SM_COUNT EXEC_AFFINITY_TYPE_SM_COUNT} limits the portion of SMs that the context can use. The portion of SMs is specified as the number of SMs via
     * {@link CUexecAffinitySmCount}. This limit will be internally rounded up to the next hardware-supported amount. Hence, it is imperative to query the
     * actual execution affinity of the context via {@link #cuCtxGetExecAffinity CtxGetExecAffinity}) after context creation. Currently, this attribute is only supported under
     * Volta+ MPS.</li>
     * </ul>
     * 
     * <p>The three LSBs of the {@code flags} parameter can be used to control how the OS thread, which owns the CUDA context at the time of an API call,
     * interacts with the OS scheduler when waiting for results from the GPU. Only one of the scheduling flags can be set when creating a context:</p>
     * 
     * <ul>
     * <li>{@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN}: Instruct CUDA to actively spin when waiting for results from the GPU. This can decrease latency when waiting for the GPU, but may
     * lower the performance of CPU threads if they are performing work in parallel with the CUDA thread.</li>
     * <li>{@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD}: Instruct CUDA to yield its thread when waiting for results from the GPU. This can increase latency when waiting for the GPU, but
     * can increase the performance of CPU threads performing work in parallel with the GPU.</li>
     * <li>{@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.</li>
     * <li>{@link #CU_CTX_BLOCKING_SYNC CTX_BLOCKING_SYNC}: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.
     * 
     * <p><b> Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was replaced with {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}.</p></li>
     * <li>{@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO}: The default value if the {@code flags} parameter is zero, uses a heuristic based on the number of active CUDA contexts in the
     * process <em>C</em> and the number of logical processors in the system <em>P</em>. If <em>C</em> &gt; <em>P</em>, then CUDA will yield to other OS
     * threads when waiting for the GPU ({@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD}), otherwise CUDA will not yield while waiting for results and actively spin on the processor
     * ({@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN}). Additionally, on Tegra devices, {@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO} uses a heuristic based on the power profile of the platform and may choose
     * {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} for low-powered devices.</li>
     * <li>{@link #CU_CTX_MAP_HOST CTX_MAP_HOST}: Instruct CUDA to support mapped pinned allocations. This flag must be set in order to allocate pinned host memory that is accessible
     * to the GPU.</li>
     * <li>{@link #CU_CTX_LMEM_RESIZE_TO_MAX CTX_LMEM_RESIZE_TO_MAX}: Instruct CUDA to not reduce local memory after resizing local memory for a kernel. This can prevent thrashing by local
     * memory allocations when launching many kernels with high local memory usage at the cost of potentially increased memory usage.
     * 
     * <p><b> Deprecated:</b> This flag is deprecated and the behavior enabled by this flag is now the default and cannot be disabled. Instead, the
     * per-thread stack size can be controlled with {@link #cuCtxSetLimit CtxSetLimit}.</p></li>
     * </ul>
     * 
     * <p>Context creation will fail with {@link #CUDA_ERROR_UNKNOWN} if the compute mode of the device is {@link #CU_COMPUTEMODE_PROHIBITED COMPUTEMODE_PROHIBITED}. The function {@link #cuDeviceGetAttribute DeviceGetAttribute}
     * can be used with {@link #CU_DEVICE_ATTRIBUTE_COMPUTE_MODE DEVICE_ATTRIBUTE_COMPUTE_MODE} to determine the compute mode of the device. The <i>nvidia-smi</i> tool can be used to set the compute
     * mode for * devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a -h option to it.</p>
     *
     * @param pctx        returned context handle of the new context
     * @param paramsArray execution affinity parameters
     * @param flags       context creation flags
     * @param dev         device to create context on
     */
    @NativeType("CUresult")
    public static int cuCtxCreate_v3(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUexecAffinityParam *") CUexecAffinityParam.Buffer paramsArray, @NativeType("unsigned int") int flags, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxCreate_v3(memAddress(pctx), paramsArray.address(), paramsArray.remaining(), flags, dev);
    }

    // --- [ cuCtxDestroy ] ---

    /**
     * Destroy a CUDA context.
     * 
     * <p>Destroys the CUDA context specified by {@code ctx}. The context {@code ctx} will be destroyed regardless of how many threads it is current to. It is
     * the responsibility of the calling function to ensure that no API call issues using {@code ctx} while {@code cuCtxDestroy()} is executing.</p>
     * 
     * <p>Destroys and cleans up all resources associated with the context. It is the caller's responsibility to ensure that the context or its resources are not
     * accessed or passed in subsequent API calls and doing so will result in undefined behavior. These resources include CUDA types such as {@code CUmodule},
     * {@code CUfunction}, {@code CUstream}, {@code CUevent}, {@code CUarray}, {@code CUmipmappedArray}, {@code CUtexObject}, {@code CUsurfObject},
     * {@code CUtexref}, {@code CUsurfref}, {@code CUgraphicsResource}, {@code CUlinkState}, {@code CUexternalMemory} and {@code CUexternalSemaphore}.</p>
     * 
     * <p>If {@code ctx} is current to the calling thread then {@code ctx} will also be popped from the current thread's context stack (as though
     * {@link #cuCtxPopCurrent CtxPopCurrent} were called). If {@code ctx} is current to other threads, then {@code ctx} will remain current to those threads, and attempting to
     * access {@code ctx} from those threads will result in the error {@link #CUDA_ERROR_CONTEXT_IS_DESTROYED}.</p>
     *
     * @param ctx context to destroy
     */
    @NativeType("CUresult")
    public static int cuCtxDestroy(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuCtxPushCurrent ] ---

    /**
     * Pushes a context on the current CPU thread.
     * 
     * <p>Pushes the given context {@code ctx} onto the CPU thread's stack of current contexts. The specified context becomes the CPU thread's current context,
     * so all CUDA functions that operate on the current context are affected.</p>
     * 
     * <p>The previous current context may be made current again by calling {@link #cuCtxDestroy CtxDestroy} or {@link #cuCtxPopCurrent CtxPopCurrent}.</p>
     *
     * @param ctx context to push
     */
    @NativeType("CUresult")
    public static int cuCtxPushCurrent(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxPushCurrent;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuCtxPopCurrent ] ---

    /** Unsafe version of: {@link #cuCtxPopCurrent CtxPopCurrent} */
    public static int ncuCtxPopCurrent(long pctx) {
        long __functionAddress = Functions.CtxPopCurrent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pctx, __functionAddress);
    }

    /**
     * Pops the current CUDA context from the current CPU thread.
     * 
     * <p>Pops the current CUDA context from the CPU thread and passes back the old context handle in {@code *pctx}. That context may then be made current to a
     * different CPU thread by calling {@link #cuCtxPushCurrent CtxPushCurrent}.</p>
     * 
     * <p>If a context was current to the CPU thread before {@link #cuCtxCreate CtxCreate} or {@link #cuCtxPushCurrent CtxPushCurrent} was called, this function makes that context current to the CPU
     * thread again.</p>
     *
     * @param pctx returned new context handle
     */
    @NativeType("CUresult")
    public static int cuCtxPopCurrent(@NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxPopCurrent(memAddress(pctx));
    }

    // --- [ cuCtxSetCurrent ] ---

    /**
     * Binds the specified CUDA context to the calling CPU thread.
     * 
     * <p>Binds the specified CUDA context to the calling CPU thread. If {@code ctx} is {@code NULL} then the CUDA context previously bound to the calling CPU thread is
     * unbound and {@link #CUDA_SUCCESS} is returned.</p>
     * 
     * <p>If there exists a CUDA context stack on the calling CPU thread, this will replace the top of that stack with {@code ctx}. If {@code ctx} is {@code NULL} then
     * this will be equivalent to popping the top of the calling CPU thread's CUDA context stack (or a no-op if the calling CPU thread's CUDA context stack is
     * empty).</p>
     *
     * @param ctx context to bind to the calling CPU thread
     */
    @NativeType("CUresult")
    public static int cuCtxSetCurrent(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxSetCurrent;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuCtxGetCurrent ] ---

    /** Unsafe version of: {@link #cuCtxGetCurrent CtxGetCurrent} */
    public static int ncuCtxGetCurrent(long pctx) {
        long __functionAddress = Functions.CtxGetCurrent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pctx, __functionAddress);
    }

    /**
     * Returns the CUDA context bound to the calling CPU thread.
     * 
     * <p>Returns in {@code *pctx} the CUDA context bound to the calling CPU thread. If no context is bound to the calling CPU thread then {@code *pctx} is set
     * to {@code NULL} and {@link #CUDA_SUCCESS} is returned.</p>
     *
     * @param pctx returned context handle
     */
    @NativeType("CUresult")
    public static int cuCtxGetCurrent(@NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxGetCurrent(memAddress(pctx));
    }

    // --- [ cuCtxGetDevice ] ---

    /** Unsafe version of: {@link #cuCtxGetDevice CtxGetDevice} */
    public static int ncuCtxGetDevice(long device) {
        long __functionAddress = Functions.CtxGetDevice;
        return callPI(device, __functionAddress);
    }

    /**
     * Returns the device ID for the current context.
     * 
     * <p>Returns in {@code *device} the ordinal of the current context's device.</p>
     *
     * @param device returned device ID for the current context
     */
    @NativeType("CUresult")
    public static int cuCtxGetDevice(@NativeType("CUdevice *") IntBuffer device) {
        if (CHECKS) {
            check(device, 1);
        }
        return ncuCtxGetDevice(memAddress(device));
    }

    // --- [ cuCtxGetFlags ] ---

    /** Unsafe version of: {@link #cuCtxGetFlags CtxGetFlags} */
    public static int ncuCtxGetFlags(long flags) {
        long __functionAddress = Functions.CtxGetFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(flags, __functionAddress);
    }

    /**
     * Returns the flags for the current context.
     * 
     * <p>Returns in {@code *flags} the flags of the current context. See {@link #cuCtxCreate CtxCreate} for flag values.</p>
     *
     * @param flags pointer to store flags of current context
     */
    @NativeType("CUresult")
    public static int cuCtxGetFlags(@NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuCtxGetFlags(memAddress(flags));
    }

    // --- [ cuCtxSynchronize ] ---

    /**
     * Block for a context's tasks to complete.
     * 
     * <p>Blocks until the device has completed all preceding requested tasks. {@code cuCtxSynchronize()} returns an error if one of the preceding tasks failed.
     * If the context was created with the {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} flag, the CPU thread will block until the GPU context has finished its work.</p>
     */
    @NativeType("CUresult")
    public static int cuCtxSynchronize() {
        long __functionAddress = Functions.CtxSynchronize;
        return callI(__functionAddress);
    }

    // --- [ cuCtxSetLimit ] ---

    /**
     * Set resource limits.
     * 
     * <p>Setting {@code limit} to {@code value} is a request by the application to update the current limit maintained by the context. The driver is free to
     * modify the requested value to meet h/w requirements (this could be clamping to minimum or maximum values, rounding up to nearest element size, etc).
     * The application can use {@link #cuCtxGetLimit CtxGetLimit} to find out exactly what the limit has been set to.</p>
     * 
     * <p>Setting each {@code CUlimit} has its own specific restrictions, so each is discussed here.</p>
     * 
     * <ul>
     * <li>{@link #CU_LIMIT_STACK_SIZE LIMIT_STACK_SIZE} controls the stack size in bytes of each GPU thread. The driver automatically increases the per-thread stack size for each kernel
     * launch as needed. This size isn't reset back to the original value after each launch. Setting this value will take effect immediately, and if
     * necessary, the device will block until all preceding requested tasks are complete.</li>
     * <li>{@link #CU_LIMIT_PRINTF_FIFO_SIZE LIMIT_PRINTF_FIFO_SIZE} controls the size in bytes of the FIFO used by the {@code printf()} device system call. Setting {@link #CU_LIMIT_PRINTF_FIFO_SIZE LIMIT_PRINTF_FIFO_SIZE}
     * must be performed before launching any kernel that uses the {@code printf()} device system call, otherwise {@link #CUDA_ERROR_INVALID_VALUE} will be
     * returned.</li>
     * <li>{@link #CU_LIMIT_MALLOC_HEAP_SIZE LIMIT_MALLOC_HEAP_SIZE} controls the size in bytes of the heap used by the {@code malloc()} and {@code free()} device system calls. Setting
     * {@code CU_LIMIT_MALLOC_HEAP_SIZE} must be performed before launching any kernel that uses the {@code malloc()} or {@code free()} device system
     * calls, otherwise {@link #CUDA_ERROR_INVALID_VALUE} will be returned.</li>
     * <li>{@link #CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH LIMIT_DEV_RUNTIME_SYNC_DEPTH} controls the maximum nesting depth of a grid at which a thread can safely call {@code cudaDeviceSynchronize()}.
     * Setting this limit must be performed before any launch of a kernel that uses the device runtime and calls {@code cudaDeviceSynchronize()} above the
     * default sync depth, two levels of grids. Calls to {@code cudaDeviceSynchronize()} will fail with error code {@code cudaErrorSyncDepthExceeded} if
     * the limitation is violated. This limit can be set smaller than the default or up the maximum launch depth of 24. When setting this limit, keep in
     * mind that additional levels of sync depth require the driver to reserve large amounts of device memory which can no longer be used for user
     * allocations. If these reservations of device memory fail, {@code cuCtxSetLimit()} will return {@link #CUDA_ERROR_OUT_OF_MEMORY}, and the limit can be reset
     * to a lower value. This limit is only applicable to devices of compute capability 3.5 and higher. Attempting to set this limit on devices of compute
     * capability less than 3.5 will result in the error {@link #CUDA_ERROR_UNSUPPORTED_LIMIT} being returned.</li>
     * <li>{@link #CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT} controls the maximum number of outstanding device runtime launches that can be made from the current
     * context. A grid is outstanding from the point of launch up until the grid is known to have been completed. Device runtime launches which violate
     * this limitation fail and return {@code cudaErrorLaunchPendingCountExceeded} when {@code cudaGetLastError()} is called after launch. If more pending
     * launches than the default (2048 launches) are needed for a module using the device runtime, this limit can be increased. Keep in mind that being
     * able to sustain additional pending launches will require the driver to reserve larger amounts of device memory upfront which can no longer be used
     * for allocations. If these reservations fail, {@code cuCtxSetLimit()} will return {@link #CUDA_ERROR_OUT_OF_MEMORY}, and the limit can be reset to a lower
     * value. This limit is only applicable to devices of compute capability 3.5 and higher. Attempting to set this limit on devices of compute capability
     * less than 3.5 will result in the error {@link #CUDA_ERROR_UNSUPPORTED_LIMIT} being returned.</li>
     * <li>{@link #CU_LIMIT_MAX_L2_FETCH_GRANULARITY LIMIT_MAX_L2_FETCH_GRANULARITY} controls the L2 cache fetch granularity. Values can range from 0B to 128B. This is purely a performence hint and it
     * can be ignored or clamped depending on the platform.</li>
     * <li>{@link #CU_LIMIT_PERSISTING_L2_CACHE_SIZE LIMIT_PERSISTING_L2_CACHE_SIZE} controls size in bytes availabe for persisting L2 cache. This is purely a performance hint and it can be ignored or
     * clamped depending on the platform.</li>
     * </ul>
     *
     * @param limit limit to set
     * @param value size of limit
     */
    @NativeType("CUresult")
    public static int cuCtxSetLimit(@NativeType("CUlimit") int limit, @NativeType("size_t") long value) {
        long __functionAddress = Functions.CtxSetLimit;
        return callPI(limit, value, __functionAddress);
    }

    // --- [ cuCtxGetLimit ] ---

    /** Unsafe version of: {@link #cuCtxGetLimit CtxGetLimit} */
    public static int ncuCtxGetLimit(long pvalue, int limit) {
        long __functionAddress = Functions.CtxGetLimit;
        return callPI(pvalue, limit, __functionAddress);
    }

    /**
     * Returns resource limits.
     * 
     * <p>Returns in {@code *pvalue} the current size of {@code limit}.</p>
     *
     * @param pvalue returned size of limit
     * @param limit  limit to query
     */
    @NativeType("CUresult")
    public static int cuCtxGetLimit(@NativeType("size_t *") PointerBuffer pvalue, @NativeType("CUlimit") int limit) {
        if (CHECKS) {
            check(pvalue, 1);
        }
        return ncuCtxGetLimit(memAddress(pvalue), limit);
    }

    // --- [ cuCtxGetCacheConfig ] ---

    /** Unsafe version of: {@link #cuCtxGetCacheConfig CtxGetCacheConfig} */
    public static int ncuCtxGetCacheConfig(long pconfig) {
        long __functionAddress = Functions.CtxGetCacheConfig;
        return callPI(pconfig, __functionAddress);
    }

    /**
     * Returns the preferred cache configuration for the current context.
     * 
     * <p>On devices where the L1 cache and shared memory use the same hardware resources, this function returns through {@code pconfig} the preferred cache
     * configuration for the current context. This is only a preference. The driver will use the requested configuration if possible, but it is free to choose
     * a different configuration if required to execute functions.</p>
     * 
     * <p>This will return a {@code pconfig} of {@link #CU_FUNC_CACHE_PREFER_NONE FUNC_CACHE_PREFER_NONE} on devices where the size of the L1 cache and shared memory are fixed.</p>
     *
     * @param pconfig returned cache configuration
     */
    @NativeType("CUresult")
    public static int cuCtxGetCacheConfig(@NativeType("CUfunc_cache *") IntBuffer pconfig) {
        if (CHECKS) {
            check(pconfig, 1);
        }
        return ncuCtxGetCacheConfig(memAddress(pconfig));
    }

    // --- [ cuCtxSetCacheConfig ] ---

    /**
     * Sets the preferred cache configuration for the current context.
     * 
     * <p>On devices where the L1 cache and shared memory use the same hardware resources, this sets through {@code config} the preferred cache configuration for
     * the current context. This is only a preference. The driver will use the requested configuration if possible, but it is free to choose a different
     * configuration if required to execute the function. Any function preference set via {@code cuFuncSetCacheConfig()} will be preferred over this
     * context-wide setting. Setting the context-wide cache configuration to {@link #CU_FUNC_CACHE_PREFER_NONE FUNC_CACHE_PREFER_NONE} will cause subsequent kernel launches to prefer to not
     * change the cache configuration unless required to launch the kernel.</p>
     * 
     * <p>This setting does nothing on devices where the size of the L1 cache and shared memory are fixed.</p>
     * 
     * <p>Launching a kernel with a different preference than the most recent preference setting may insert a device-side synchronization point.</p>
     *
     * @param config requested cache configuration
     */
    @NativeType("CUresult")
    public static int cuCtxSetCacheConfig(@NativeType("CUfunc_cache") int config) {
        long __functionAddress = Functions.CtxSetCacheConfig;
        return callI(config, __functionAddress);
    }

    // --- [ cuCtxGetSharedMemConfig ] ---

    /** Unsafe version of: {@link #cuCtxGetSharedMemConfig CtxGetSharedMemConfig} */
    public static int ncuCtxGetSharedMemConfig(long pConfig) {
        long __functionAddress = Functions.CtxGetSharedMemConfig;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pConfig, __functionAddress);
    }

    /**
     * Returns the current shared memory configuration for the current context.
     * 
     * <p>This function will return in {@code pConfig} the current size of shared memory banks in the current context. On devices with configurable shared memory
     * banks, {@link #cuCtxSetSharedMemConfig CtxSetSharedMemConfig} can be used to change this setting, so that all subsequent kernel launches will by default use the new bank size.
     * When {@code cuCtxGetSharedMemConfig} is called on devices without configurable shared memory, it will return the fixed bank size of the hardware.</p>
     *
     * @param pConfig returned shared memory configuration
     */
    @NativeType("CUresult")
    public static int cuCtxGetSharedMemConfig(@NativeType("CUsharedconfig *") IntBuffer pConfig) {
        if (CHECKS) {
            check(pConfig, 1);
        }
        return ncuCtxGetSharedMemConfig(memAddress(pConfig));
    }

    // --- [ cuCtxSetSharedMemConfig ] ---

    /**
     * Sets the shared memory configuration for the current context.
     * 
     * <p>On devices with configurable shared memory banks, this function will set the context's shared memory bank size which is used for subsequent kernel
     * launches.</p>
     * 
     * <p>Changed the shared memory configuration between launches may insert a device side synchronization point between those launches.</p>
     * 
     * <p>Changing the shared memory bank size will not increase shared memory usage or affect occupancy of kernels, but may have major effects on performance.
     * Larger bank sizes will allow for greater potential bandwidth to shared memory, but will change what kinds of accesses to shared memory will result in
     * bank conflicts.</p>
     * 
     * <p>This function will do nothing on devices with fixed shared memory bank size.</p>
     *
     * @param config requested shared memory configuration
     */
    @NativeType("CUresult")
    public static int cuCtxSetSharedMemConfig(@NativeType("CUsharedconfig") int config) {
        long __functionAddress = Functions.CtxSetSharedMemConfig;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(config, __functionAddress);
    }

    // --- [ cuCtxGetApiVersion ] ---

    /** Unsafe version of: {@link #cuCtxGetApiVersion CtxGetApiVersion} */
    public static int ncuCtxGetApiVersion(long ctx, long version) {
        long __functionAddress = Functions.CtxGetApiVersion;
        return callPPI(ctx, version, __functionAddress);
    }

    /**
     * Gets the context's API version.
     * 
     * <p>Returns a version number in {@code version} corresponding to the capabilities of the context (e.g. 3010 or 3020), which library developers can use to
     * direct callers to a specific API version. If {@code ctx} is {@code NULL}, returns the API version used to create the currently bound context.</p>
     * 
     * <p>Note that new API versions are only introduced when context capabilities are changed that break binary compatibility, so the API version and driver
     * version may be different. For example, it is valid for the API version to be 3020 while the driver version is 4020.</p>
     *
     * @param ctx     context to check
     * @param version pointer to version
     */
    @NativeType("CUresult")
    public static int cuCtxGetApiVersion(@NativeType("CUcontext") long ctx, @NativeType("unsigned int *") IntBuffer version) {
        if (CHECKS) {
            check(version, 1);
        }
        return ncuCtxGetApiVersion(ctx, memAddress(version));
    }

    // --- [ cuCtxGetStreamPriorityRange ] ---

    /** Unsafe version of: {@link #cuCtxGetStreamPriorityRange CtxGetStreamPriorityRange} */
    public static int ncuCtxGetStreamPriorityRange(long leastPriority, long greatestPriority) {
        long __functionAddress = Functions.CtxGetStreamPriorityRange;
        return callPPI(leastPriority, greatestPriority, __functionAddress);
    }

    /**
     * Returns numerical values that correspond to the least and greatest stream priorities.
     * 
     * <p>Returns in {@code *leastPriority} and {@code *greatestPriority} the numerical values that correspond to the least and greatest stream priorities
     * respectively. Stream priorities follow a convention where lower numbers imply greater priorities. The range of meaningful stream priorities is given by
     * [ {@code *greatestPriority}, {@code *leastPriority]}. If the user attempts to create a stream with a priority value that is outside the meaningful
     * range as specified by this API, the priority is automatically clamped down or up to either {@code *leastPriority} or {@code *greatestPriority}
     * respectively. See {@link #cuStreamCreateWithPriority StreamCreateWithPriority} for details on creating a priority stream. A {@code NULL} may be passed in for {@code *leastPriority} or {@code
        *greatestPriority} if the value is not desired.</p>
     * 
     * <p>This function will return {@code 0} in both {@code *leastPriority} and {@code *greatestPriority} if the current context's device does not support
     * stream priorities (see {@link #cuDeviceGetAttribute DeviceGetAttribute}).</p>
     *
     * @param leastPriority    pointer to an int in which the numerical value for least stream priority is returned
     * @param greatestPriority pointer to an int in which the numerical value for greatest stream priority is returned
     */
    @NativeType("CUresult")
    public static int cuCtxGetStreamPriorityRange(@Nullable @NativeType("int *") IntBuffer leastPriority, @Nullable @NativeType("int *") IntBuffer greatestPriority) {
        if (CHECKS) {
            checkSafe(leastPriority, 1);
            checkSafe(greatestPriority, 1);
        }
        return ncuCtxGetStreamPriorityRange(memAddressSafe(leastPriority), memAddressSafe(greatestPriority));
    }

    // --- [ cuCtxResetPersistingL2Cache ] ---

    /**
     * Resets all persisting lines in cache to normal status.
     * 
     * <p>Takes effect on function return.</p>
     */
    @NativeType("CUresult")
    public static int cuCtxResetPersistingL2Cache() {
        long __functionAddress = Functions.CtxResetPersistingL2Cache;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ cuCtxGetExecAffinity ] ---

    /** Unsafe version of: {@link #cuCtxGetExecAffinity CtxGetExecAffinity} */
    public static int ncuCtxGetExecAffinity(long pExecAffinity, int type) {
        long __functionAddress = Functions.CtxGetExecAffinity;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pExecAffinity, type, __functionAddress);
    }

    /**
     * Returns the execution affinity setting for the current context.
     * 
     * <p>Returns in {@code *pExecAffinity} the current value of {@code type}.</p>
     *
     * @param pExecAffinity returned execution affinity
     * @param type          execution affinity type to query
     */
    @NativeType("CUresult")
    public static int cuCtxGetExecAffinity(@NativeType("CUexecAffinityParam *") CUexecAffinityParam.Buffer pExecAffinity, @NativeType("CUexecAffinityType") int type) {
        if (CHECKS) {
            check(pExecAffinity, 1);
        }
        return ncuCtxGetExecAffinity(pExecAffinity.address(), type);
    }

    // --- [ cuCtxAttach ] ---

    /** Unsafe version of: {@link #cuCtxAttach CtxAttach} */
    public static int ncuCtxAttach(long pctx, int flags) {
        long __functionAddress = Functions.CtxAttach;
        return callPI(pctx, flags, __functionAddress);
    }

    /**
     * Increment a context's usage-count.
     * 
     * <p>Deprecated: Note that this function is deprecated and should not be used.</p>
     * 
     * <p>Increments the usage count of the context and passes back a context handle in {@code *pctx} that must be passed to {@link #cuCtxDetach CtxDetach} when the application
     * is done with the context. {@code cuCtxAttach()} fails if there is no context current to the thread.</p>
     * 
     * <p>Currently, the {@code flags} parameter must be 0.</p>
     *
     * @param pctx  returned context handle of the current context
     * @param flags context attach flags (must be 0)
     */
    @NativeType("CUresult")
    public static int cuCtxAttach(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxAttach(memAddress(pctx), flags);
    }

    // --- [ cuCtxDetach ] ---

    /**
     * Decrement a context's usage-count
     * 
     * <p>Deprecated: Note that this function is deprecated and should not be used.</p>
     * 
     * <p>Decrements the usage count of the context {@code ctx}, and destroys the context if the usage count goes to 0. The context must be a handle that was
     * passed back by {@link #cuCtxCreate CtxCreate} or {@link #cuCtxAttach CtxAttach}, and must be current to the calling thread.</p>
     *
     * @param ctx context to destroy
     */
    @NativeType("CUresult")
    public static int cuCtxDetach(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxDetach;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuModuleLoad ] ---

    /** Unsafe version of: {@link #cuModuleLoad ModuleLoad} */
    public static int ncuModuleLoad(long module, long fname) {
        long __functionAddress = Functions.ModuleLoad;
        return callPPI(module, fname, __functionAddress);
    }

    /**
     * Loads a compute module.
     * 
     * <p>Takes a filename {@code fname} and loads the corresponding module {@code module} into the current context. The CUDA driver API does not attempt to
     * lazily allocate the resources needed by a module; if the memory for functions and data (constant and global) needed by the module cannot be allocated,
     * {@code cuModuleLoad()} fails. The file should be a <em>cubin</em> file as output by <b>nvcc</b>, or a <em>PTX</em> file either as output by <b>nvcc</b>
     * or handwritten, or a <em>fatbin</em> file as output by <b>nvcc</b> from toolchain 4.0 or later.</p>
     *
     * @param module returned module
     * @param fname  filename of module to load
     */
    @NativeType("CUresult")
    public static int cuModuleLoad(@NativeType("CUmodule *") PointerBuffer module, @NativeType("char const *") ByteBuffer fname) {
        if (CHECKS) {
            check(module, 1);
            checkNT1(fname);
        }
        return ncuModuleLoad(memAddress(module), memAddress(fname));
    }

    /**
     * Loads a compute module.
     * 
     * <p>Takes a filename {@code fname} and loads the corresponding module {@code module} into the current context. The CUDA driver API does not attempt to
     * lazily allocate the resources needed by a module; if the memory for functions and data (constant and global) needed by the module cannot be allocated,
     * {@code cuModuleLoad()} fails. The file should be a <em>cubin</em> file as output by <b>nvcc</b>, or a <em>PTX</em> file either as output by <b>nvcc</b>
     * or handwritten, or a <em>fatbin</em> file as output by <b>nvcc</b> from toolchain 4.0 or later.</p>
     *
     * @param module returned module
     * @param fname  filename of module to load
     */
    @NativeType("CUresult")
    public static int cuModuleLoad(@NativeType("CUmodule *") PointerBuffer module, @NativeType("char const *") CharSequence fname) {
        if (CHECKS) {
            check(module, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fname, true);
            long fnameEncoded = stack.getPointerAddress();
            return ncuModuleLoad(memAddress(module), fnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleLoadData ] ---

    /** Unsafe version of: {@link #cuModuleLoadData ModuleLoadData} */
    public static int ncuModuleLoadData(long module, long image) {
        long __functionAddress = Functions.ModuleLoadData;
        return callPPI(module, image, __functionAddress);
    }

    /**
     * Load a module's data.
     * 
     * <p>Takes a pointer {@code image} and loads the corresponding module {@code module} into the current context. The pointer may be obtained by mapping a
     * <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file, passing a <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file as a NULL-terminated text
     * string, or incorporating a <em>cubin</em> or <em>fatbin</em> object into the executable resources and using operating system calls such as Windows
     * {@code FindResource()} to obtain the pointer.</p>
     *
     * @param module returned module
     * @param image  module data to load
     */
    @NativeType("CUresult")
    public static int cuModuleLoadData(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer image) {
        if (CHECKS) {
            check(module, 1);
        }
        return ncuModuleLoadData(memAddress(module), memAddress(image));
    }

    // --- [ cuModuleLoadDataEx ] ---

    /**
     * Unsafe version of: {@link #cuModuleLoadDataEx ModuleLoadDataEx}
     *
     * @param numOptions number of options
     */
    public static int ncuModuleLoadDataEx(long module, long image, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.ModuleLoadDataEx;
        return callPPPPI(module, image, numOptions, options, optionValues, __functionAddress);
    }

    /**
     * Load a module's data with options.
     * 
     * <p>Takes a pointer {@code image} and loads the corresponding module {@code module} into the current context. The pointer may be obtained by mapping a
     * <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file, passing a <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file as a NULL-terminated text
     * string, or incorporating a <em>cubin</em> or <em>fatbin</em> object into the executable resources and using operating system calls such as Windows
     * {@code FindResource()} to obtain the pointer. Options are passed as an array via {@code options} and any corresponding parameters are passed in {@code
     * optionValues}. The number of total options is supplied via {@code numOptions}. Any outputs will be returned via {@code optionValues}.</p>
     *
     * @param module       returned module
     * @param image        module data to load
     * @param options      options for JIT
     * @param optionValues option values for JIT
     */
    @NativeType("CUresult")
    public static int cuModuleLoadDataEx(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer image, @Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            check(module, 1);
            checkSafe(optionValues, remainingSafe(options));
        }
        return ncuModuleLoadDataEx(memAddress(module), memAddress(image), remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
    }

    // --- [ cuModuleLoadFatBinary ] ---

    /** Unsafe version of: {@link #cuModuleLoadFatBinary ModuleLoadFatBinary} */
    public static int ncuModuleLoadFatBinary(long module, long fatCubin) {
        long __functionAddress = Functions.ModuleLoadFatBinary;
        return callPPI(module, fatCubin, __functionAddress);
    }

    /**
     * Load a module's data.
     * 
     * <p>Takes a pointer {@code fatCubin} and loads the corresponding module {@code module} into the current context. The pointer represents a <i>fat binary</i>
     * object, which is a collection of different <em>cubin</em> and/or <em>PTX</em> files, all representing the same device code, but compiled and optimized
     * for different architectures.</p>
     * 
     * <p>Prior to CUDA 4.0, there was no documented API for constructing and using fat binary objects by programmers. Starting with CUDA 4.0, fat binary objects
     * can be constructed by providing the <i>-fatbin option</i> to <b>nvcc</b>. More information can be found in the <b>nvcc</b> document.</p>
     *
     * @param module   returned module
     * @param fatCubin fat binary to load
     */
    @NativeType("CUresult")
    public static int cuModuleLoadFatBinary(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer fatCubin) {
        if (CHECKS) {
            check(module, 1);
        }
        return ncuModuleLoadFatBinary(memAddress(module), memAddress(fatCubin));
    }

    // --- [ cuModuleUnload ] ---

    /**
     * Unloads a module.
     * 
     * <p>Unloads a module {@code hmod} from the current context.</p>
     *
     * @param hmod module to unload
     */
    @NativeType("CUresult")
    public static int cuModuleUnload(@NativeType("CUmodule") long hmod) {
        long __functionAddress = Functions.ModuleUnload;
        if (CHECKS) {
            check(hmod);
        }
        return callPI(hmod, __functionAddress);
    }

    // --- [ cuModuleGetFunction ] ---

    /** Unsafe version of: {@link #cuModuleGetFunction ModuleGetFunction} */
    public static int ncuModuleGetFunction(long hfunc, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetFunction;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(hfunc, hmod, name, __functionAddress);
    }

    /**
     * Returns a function handle.
     * 
     * <p>Returns in {@code *hfunc} the handle of the function of name {@code name} located in module {@code hmod}. If no function of that name exists,
     * {@code cuModuleGetFunction()} returns {@link #CUDA_ERROR_NOT_FOUND}.</p>
     *
     * @param hfunc returned function handle
     * @param hmod  module to retrieve function from
     * @param name  name of function to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetFunction(@NativeType("CUfunction *") PointerBuffer hfunc, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(hfunc, 1);
            checkNT1(name);
        }
        return ncuModuleGetFunction(memAddress(hfunc), hmod, memAddress(name));
    }

    /**
     * Returns a function handle.
     * 
     * <p>Returns in {@code *hfunc} the handle of the function of name {@code name} located in module {@code hmod}. If no function of that name exists,
     * {@code cuModuleGetFunction()} returns {@link #CUDA_ERROR_NOT_FOUND}.</p>
     *
     * @param hfunc returned function handle
     * @param hmod  module to retrieve function from
     * @param name  name of function to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetFunction(@NativeType("CUfunction *") PointerBuffer hfunc, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(hfunc, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetFunction(memAddress(hfunc), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleGetGlobal ] ---

    /** Unsafe version of: {@link #cuModuleGetGlobal ModuleGetGlobal} */
    public static int ncuModuleGetGlobal(long dptr, long bytes, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetGlobal;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPPI(dptr, bytes, hmod, name, __functionAddress);
    }

    /**
     * Returns a global pointer from a module.
     * 
     * <p>Returns in {@code *dptr} and {@code *bytes} the base pointer and size of the global of name {@code name} located in module {@code hmod}. If no variable
     * of that name exists, {@code cuModuleGetGlobal()} returns {@link #CUDA_ERROR_NOT_FOUND}. Both parameters {@code dptr} and {@code bytes} are optional. If one of
     * them is {@code NULL}, it is ignored.</p>
     *
     * @param dptr  returned global device pointer
     * @param bytes returned global size in bytes
     * @param hmod  module to retrieve global from
     * @param name  name of global to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetGlobal(@Nullable @NativeType("CUdeviceptr *") PointerBuffer dptr, @Nullable @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(dptr, 1);
            checkSafe(bytes, 1);
            checkNT1(name);
        }
        return ncuModuleGetGlobal(memAddressSafe(dptr), memAddressSafe(bytes), hmod, memAddress(name));
    }

    /**
     * Returns a global pointer from a module.
     * 
     * <p>Returns in {@code *dptr} and {@code *bytes} the base pointer and size of the global of name {@code name} located in module {@code hmod}. If no variable
     * of that name exists, {@code cuModuleGetGlobal()} returns {@link #CUDA_ERROR_NOT_FOUND}. Both parameters {@code dptr} and {@code bytes} are optional. If one of
     * them is {@code NULL}, it is ignored.</p>
     *
     * @param dptr  returned global device pointer
     * @param bytes returned global size in bytes
     * @param hmod  module to retrieve global from
     * @param name  name of global to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetGlobal(@Nullable @NativeType("CUdeviceptr *") PointerBuffer dptr, @Nullable @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            checkSafe(dptr, 1);
            checkSafe(bytes, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetGlobal(memAddressSafe(dptr), memAddressSafe(bytes), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleGetTexRef ] ---

    /** Unsafe version of: {@link #cuModuleGetTexRef ModuleGetTexRef} */
    public static int ncuModuleGetTexRef(long pTexRef, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetTexRef;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(pTexRef, hmod, name, __functionAddress);
    }

    /**
     * Returns a handle to a texture reference.
     * 
     * <p>Returns in {@code *pTexRef} the handle of the texture reference of name {@code name} in the module {@code hmod}. If no texture reference of that name
     * exists, {@code cuModuleGetTexRef()} returns {@link #CUDA_ERROR_NOT_FOUND}. This texture reference handle should not be destroyed, since it will be destroyed
     * when the module is unloaded.</p>
     *
     * @param pTexRef returned texture reference
     * @param hmod    module to retrieve texture reference from
     * @param name    name of texture reference to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetTexRef(@NativeType("CUtexref *") PointerBuffer pTexRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pTexRef, 1);
            checkNT1(name);
        }
        return ncuModuleGetTexRef(memAddress(pTexRef), hmod, memAddress(name));
    }

    /**
     * Returns a handle to a texture reference.
     * 
     * <p>Returns in {@code *pTexRef} the handle of the texture reference of name {@code name} in the module {@code hmod}. If no texture reference of that name
     * exists, {@code cuModuleGetTexRef()} returns {@link #CUDA_ERROR_NOT_FOUND}. This texture reference handle should not be destroyed, since it will be destroyed
     * when the module is unloaded.</p>
     *
     * @param pTexRef returned texture reference
     * @param hmod    module to retrieve texture reference from
     * @param name    name of texture reference to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetTexRef(@NativeType("CUtexref *") PointerBuffer pTexRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(pTexRef, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetTexRef(memAddress(pTexRef), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleGetSurfRef ] ---

    /** Unsafe version of: {@link #cuModuleGetSurfRef ModuleGetSurfRef} */
    public static int ncuModuleGetSurfRef(long pSurfRef, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetSurfRef;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(pSurfRef, hmod, name, __functionAddress);
    }

    /**
     * Returns a handle to a surface reference.
     * 
     * <p>Returns in {@code *pSurfRef} the handle of the surface reference of name {@code name} in the module {@code hmod}. If no surface reference of that name
     * exists, {@code cuModuleGetSurfRef()} returns {@link #CUDA_ERROR_NOT_FOUND}.</p>
     *
     * @param pSurfRef returned surface reference
     * @param hmod     module to retrieve surface reference from
     * @param name     name of surface reference to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetSurfRef(@NativeType("CUsurfref *") PointerBuffer pSurfRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pSurfRef, 1);
            checkNT1(name);
        }
        return ncuModuleGetSurfRef(memAddress(pSurfRef), hmod, memAddress(name));
    }

    /**
     * Returns a handle to a surface reference.
     * 
     * <p>Returns in {@code *pSurfRef} the handle of the surface reference of name {@code name} in the module {@code hmod}. If no surface reference of that name
     * exists, {@code cuModuleGetSurfRef()} returns {@link #CUDA_ERROR_NOT_FOUND}.</p>
     *
     * @param pSurfRef returned surface reference
     * @param hmod     module to retrieve surface reference from
     * @param name     name of surface reference to retrieve
     */
    @NativeType("CUresult")
    public static int cuModuleGetSurfRef(@NativeType("CUsurfref *") PointerBuffer pSurfRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(pSurfRef, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetSurfRef(memAddress(pSurfRef), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLinkCreate ] ---

    /**
     * Unsafe version of: {@link #cuLinkCreate LinkCreate}
     *
     * @param numOptions size of options arrays
     */
    public static int ncuLinkCreate(int numOptions, long options, long optionValues, long stateOut) {
        long __functionAddress = Functions.LinkCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(numOptions, options, optionValues, stateOut, __functionAddress);
    }

    /**
     * Creates a pending JIT linker invocation.
     * 
     * <p>If the call is successful, the caller owns the returned {@code CUlinkState}, which should eventually be destroyed with {@link #cuLinkDestroy LinkDestroy}. The device code
     * machine size (32 or 64 bit) will match the calling application.</p>
     * 
     * <p>Both linker and compiler options may be specified. Compiler options will be applied to inputs to this linker action which must be compiled from PTX.
     * The options {@link #CU_JIT_WALL_TIME JIT_WALL_TIME}, {@link #CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES JIT_INFO_LOG_BUFFER_SIZE_BYTES}, and {@link #CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES JIT_ERROR_LOG_BUFFER_SIZE_BYTES} will accumulate data until the {@code CUlinkState} is
     * destroyed.</p>
     * 
     * <p>{@code optionValues} must remain valid for the life of the {@code CUlinkState} if output options are used. No other references to inputs are maintained
     * after this call returns.</p>
     *
     * @param options      array of linker and compiler options
     * @param optionValues array of option values, each cast to void *
     * @param stateOut     on success, this will contain a {@code CUlinkState} to specify and complete this action
     */
    @NativeType("CUresult")
    public static int cuLinkCreate(@NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues, @NativeType("CUlinkState *") PointerBuffer stateOut) {
        if (CHECKS) {
            check(optionValues, options.remaining());
            check(stateOut, 1);
        }
        return ncuLinkCreate(options.remaining(), memAddress(options), memAddress(optionValues), memAddress(stateOut));
    }

    // --- [ cuLinkAddData ] ---

    /**
     * Unsafe version of: {@link #cuLinkAddData LinkAddData}
     *
     * @param size       the length of the input data
     * @param numOptions size of options
     */
    public static int ncuLinkAddData(long state, int type, long data, long size, long name, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.LinkAddData;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPPPPPPI(state, type, data, size, name, numOptions, options, optionValues, __functionAddress);
    }

    /**
     * Add an input to a pending linker invocation.
     * 
     * <p>Ownership of {@code data} is retained by the caller. No reference is retained to any inputs after this call returns.</p>
     * 
     * <p>This method accepts only compiler options, which are used if the data must be compiled from PTX, and does not accept any of {@link #CU_JIT_WALL_TIME JIT_WALL_TIME},
     * {@link #CU_JIT_INFO_LOG_BUFFER JIT_INFO_LOG_BUFFER}, {@link #CU_JIT_ERROR_LOG_BUFFER JIT_ERROR_LOG_BUFFER}, {@link #CU_JIT_TARGET_FROM_CUCONTEXT JIT_TARGET_FROM_CUCONTEXT}, or {@link #CU_JIT_TARGET JIT_TARGET}.</p>
     *
     * @param state        a pending linker action
     * @param type         the type of the input data
     * @param data         the input data.  PTX must be NULL-terminated.
     * @param name         an optional name for this input in log messages
     * @param options      options to be applied only for this input (overrides options from {@link #cuLinkCreate LinkCreate})
     * @param optionValues array of option values, each cast to void *
     */
    @NativeType("CUresult")
    public static int cuLinkAddData(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("void *") ByteBuffer data, @NativeType("char const *") ByteBuffer name, @NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkNT1(name);
            check(optionValues, options.remaining());
        }
        return ncuLinkAddData(state, type, memAddress(data), data.remaining(), memAddress(name), options.remaining(), memAddress(options), memAddress(optionValues));
    }

    /**
     * Add an input to a pending linker invocation.
     * 
     * <p>Ownership of {@code data} is retained by the caller. No reference is retained to any inputs after this call returns.</p>
     * 
     * <p>This method accepts only compiler options, which are used if the data must be compiled from PTX, and does not accept any of {@link #CU_JIT_WALL_TIME JIT_WALL_TIME},
     * {@link #CU_JIT_INFO_LOG_BUFFER JIT_INFO_LOG_BUFFER}, {@link #CU_JIT_ERROR_LOG_BUFFER JIT_ERROR_LOG_BUFFER}, {@link #CU_JIT_TARGET_FROM_CUCONTEXT JIT_TARGET_FROM_CUCONTEXT}, or {@link #CU_JIT_TARGET JIT_TARGET}.</p>
     *
     * @param state        a pending linker action
     * @param type         the type of the input data
     * @param data         the input data.  PTX must be NULL-terminated.
     * @param name         an optional name for this input in log messages
     * @param options      options to be applied only for this input (overrides options from {@link #cuLinkCreate LinkCreate})
     * @param optionValues array of option values, each cast to void *
     */
    @NativeType("CUresult")
    public static int cuLinkAddData(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("void *") ByteBuffer data, @NativeType("char const *") CharSequence name, @NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            check(optionValues, options.remaining());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuLinkAddData(state, type, memAddress(data), data.remaining(), nameEncoded, options.remaining(), memAddress(options), memAddress(optionValues));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLinkAddFile ] ---

    /**
     * Unsafe version of: {@link #cuLinkAddFile LinkAddFile}
     *
     * @param numOptions size of options
     */
    public static int ncuLinkAddFile(long state, int type, long path, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.LinkAddFile;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPPPPI(state, type, path, numOptions, options, optionValues, __functionAddress);
    }

    /**
     * Add a file input to a pending linker invocation.
     * 
     * <p>No reference is retained to any inputs after this call returns.</p>
     * 
     * <p>This method accepts only compiler options, which are used if the input must be compiled from PTX, and does not accept any of {@link #CU_JIT_WALL_TIME JIT_WALL_TIME},
     * {@link #CU_JIT_INFO_LOG_BUFFER JIT_INFO_LOG_BUFFER}, {@link #CU_JIT_ERROR_LOG_BUFFER JIT_ERROR_LOG_BUFFER}, {@link #CU_JIT_TARGET_FROM_CUCONTEXT JIT_TARGET_FROM_CUCONTEXT}, or {@link #CU_JIT_TARGET JIT_TARGET}.</p>
     * 
     * <p>This method is equivalent to invoking {@link #cuLinkAddData LinkAddData} on the contents of the file.</p>
     *
     * @param state        a pending linker action
     * @param type         the type of the input data
     * @param path         path to the input file
     * @param options      options to be applied only for this input (overrides options from {@link #cuLinkCreate LinkCreate})
     * @param optionValues array of option values, each cast to void *
     */
    @NativeType("CUresult")
    public static int cuLinkAddFile(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("char const *") ByteBuffer path, @NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkNT1(path);
            check(optionValues, options.remaining());
        }
        return ncuLinkAddFile(state, type, memAddress(path), options.remaining(), memAddress(options), memAddress(optionValues));
    }

    /**
     * Add a file input to a pending linker invocation.
     * 
     * <p>No reference is retained to any inputs after this call returns.</p>
     * 
     * <p>This method accepts only compiler options, which are used if the input must be compiled from PTX, and does not accept any of {@link #CU_JIT_WALL_TIME JIT_WALL_TIME},
     * {@link #CU_JIT_INFO_LOG_BUFFER JIT_INFO_LOG_BUFFER}, {@link #CU_JIT_ERROR_LOG_BUFFER JIT_ERROR_LOG_BUFFER}, {@link #CU_JIT_TARGET_FROM_CUCONTEXT JIT_TARGET_FROM_CUCONTEXT}, or {@link #CU_JIT_TARGET JIT_TARGET}.</p>
     * 
     * <p>This method is equivalent to invoking {@link #cuLinkAddData LinkAddData} on the contents of the file.</p>
     *
     * @param state        a pending linker action
     * @param type         the type of the input data
     * @param path         path to the input file
     * @param options      options to be applied only for this input (overrides options from {@link #cuLinkCreate LinkCreate})
     * @param optionValues array of option values, each cast to void *
     */
    @NativeType("CUresult")
    public static int cuLinkAddFile(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("char const *") CharSequence path, @NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            check(optionValues, options.remaining());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return ncuLinkAddFile(state, type, pathEncoded, options.remaining(), memAddress(options), memAddress(optionValues));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLinkComplete ] ---

    /** Unsafe version of: {@link #cuLinkComplete LinkComplete} */
    public static int ncuLinkComplete(long state, long cubinOut, long sizeOut) {
        long __functionAddress = Functions.LinkComplete;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPPPI(state, cubinOut, sizeOut, __functionAddress);
    }

    /**
     * Complete a pending linker invocation.
     * 
     * <p>Completes the pending linker action and returns the cubin image for the linked device code, which can be used with {@link #cuModuleLoadData ModuleLoadData}. The cubin is
     * owned by {@code state}, so it should be loaded before {@code state} is destroyed via {@link #cuLinkDestroy LinkDestroy}. This call does not destroy {@code state}.</p>
     *
     * @param state    a pending linker invocation
     * @param cubinOut on success, this will point to the output image
     * @param sizeOut  optional parameter to receive the size of the generated image
     */
    @NativeType("CUresult")
    public static int cuLinkComplete(@NativeType("CUlinkState") long state, @NativeType("void **") PointerBuffer cubinOut, @NativeType("size_t *") PointerBuffer sizeOut) {
        if (CHECKS) {
            check(cubinOut, 1);
            check(sizeOut, 1);
        }
        return ncuLinkComplete(state, memAddress(cubinOut), memAddress(sizeOut));
    }

    // --- [ cuLinkDestroy ] ---

    /**
     * Destroys state for a JIT linker invocation.
     *
     * @param state state object for the linker invocation
     */
    @NativeType("CUresult")
    public static int cuLinkDestroy(@NativeType("CUlinkState") long state) {
        long __functionAddress = Functions.LinkDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPI(state, __functionAddress);
    }

    // --- [ cuMemGetInfo ] ---

    /** Unsafe version of: {@link #cuMemGetInfo MemGetInfo} */
    public static int ncuMemGetInfo(long free, long total) {
        long __functionAddress = Functions.MemGetInfo;
        return callPPI(free, total, __functionAddress);
    }

    /**
     * Gets free and total memory.
     * 
     * <p>Returns in {@code *total} the total amount of memory available to the the current context. Returns in {@code *free} the amount of memory on the device
     * that is free according to the OS. CUDA is not guaranteed to be able to allocate all of the memory that the OS reports as free.</p>
     *
     * @param free  returned free memory in bytes
     * @param total returned total memory in bytes
     */
    @NativeType("CUresult")
    public static int cuMemGetInfo(@NativeType("size_t *") PointerBuffer free, @NativeType("size_t *") PointerBuffer total) {
        if (CHECKS) {
            check(free, 1);
            check(total, 1);
        }
        return ncuMemGetInfo(memAddress(free), memAddress(total));
    }

    // --- [ cuMemAlloc ] ---

    /** Unsafe version of: {@link #cuMemAlloc MemAlloc} */
    public static int ncuMemAlloc(long dptr, long bytesize) {
        long __functionAddress = Functions.MemAlloc;
        return callPPI(dptr, bytesize, __functionAddress);
    }

    /**
     * Allocates device memory.
     * 
     * <p>Allocates {@code bytesize} bytes of linear memory on the device and returns in {@code *dptr} a pointer to the allocated memory. The allocated memory is
     * suitably aligned for any kind of variable. The memory is not cleared. If {@code bytesize} is 0, {@code cuMemAlloc()} returns {@link #CUDA_ERROR_INVALID_VALUE}.</p>
     *
     * @param dptr     returned device pointer
     * @param bytesize requested allocation size in bytes
     */
    @NativeType("CUresult")
    public static int cuMemAlloc(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAlloc(memAddress(dptr), bytesize);
    }

    // --- [ cuMemAllocPitch ] ---

    /** Unsafe version of: {@link #cuMemAllocPitch MemAllocPitch} */
    public static int ncuMemAllocPitch(long dptr, long pPitch, long WidthInBytes, long Height, int ElementSizeBytes) {
        long __functionAddress = Functions.MemAllocPitch;
        return callPPPPI(dptr, pPitch, WidthInBytes, Height, ElementSizeBytes, __functionAddress);
    }

    /**
     * Allocates pitched device memory.
     * 
     * <p>Allocates at least {@code WidthInBytes} * {@code Height} bytes of linear memory on the device and returns in {@code *dptr} a pointer to the allocated
     * memory. The function may pad the allocation to ensure that corresponding pointers in any given row will continue to meet the alignment requirements for
     * coalescing as the address is updated from row to row. {@code ElementSizeBytes} specifies the size of the largest reads and writes that will be
     * performed on the memory range. {@code ElementSizeBytes} may be 4, 8 or 16 (since coalesced memory transactions are not possible on other data sizes).
     * If {@code ElementSizeBytes} is smaller than the actual read/write size of a kernel, the kernel will run correctly, but possibly at reduced speed. The
     * pitch returned in {@code *pPitch} by {@code cuMemAllocPitch()} is the width in bytes of the allocation. The intended usage of pitch is as a separate
     * parameter of the allocation, used to compute addresses within the 2D array. Given the row and column of an array element of type <b>T</b>, the address
     * is computed as:</p>
     * 
     * <pre><code>
     *    T* pElement = (T*)((char*)BaseAddress + Row * Pitch) + Column;</code></pre>
     * 
     * <p>The pitch returned by {@code cuMemAllocPitch()} is guaranteed to work with {@link #cuMemcpy2D Memcpy2D} under all circumstances. For allocations of 2D arrays, it is
     * recommended that programmers consider performing pitch allocations using {@code cuMemAllocPitch()}. Due to alignment restrictions in the hardware, this
     * is especially true if the application will be performing 2D memory copies between different regions of device memory (whether linear memory or CUDA
     * arrays).</p>
     * 
     * <p>The byte alignment of the pitch returned by {@code cuMemAllocPitch()} is guaranteed to match or exceed the alignment requirement for texture binding
     * with {@link #cuTexRefSetAddress2D TexRefSetAddress2D}.</p>
     *
     * @param dptr             returned device pointer
     * @param pPitch           returned pitch of allocation in bytes
     * @param WidthInBytes     requested allocation width in bytes
     * @param Height           requested allocation height in rows
     * @param ElementSizeBytes size of largest reads/writes for range
     */
    @NativeType("CUresult")
    public static int cuMemAllocPitch(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer pPitch, @NativeType("size_t") long WidthInBytes, @NativeType("size_t") long Height, @NativeType("unsigned int") int ElementSizeBytes) {
        if (CHECKS) {
            check(dptr, 1);
            check(pPitch, 1);
        }
        return ncuMemAllocPitch(memAddress(dptr), memAddress(pPitch), WidthInBytes, Height, ElementSizeBytes);
    }

    // --- [ cuMemFree ] ---

    /**
     * Frees device memory.
     * 
     * <p>Frees the memory space pointed to by {@code dptr}, which must have been returned by a previous call to {@link #cuMemAlloc MemAlloc} or {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dptr pointer to memory to free
     */
    @NativeType("CUresult")
    public static int cuMemFree(@NativeType("CUdeviceptr") long dptr) {
        long __functionAddress = Functions.MemFree;
        if (CHECKS) {
            check(dptr);
        }
        return callPI(dptr, __functionAddress);
    }

    // --- [ cuMemGetAddressRange ] ---

    /** Unsafe version of: {@link #cuMemGetAddressRange MemGetAddressRange} */
    public static int ncuMemGetAddressRange(long pbase, long psize, long dptr) {
        long __functionAddress = Functions.MemGetAddressRange;
        if (CHECKS) {
            check(dptr);
        }
        return callPPPI(pbase, psize, dptr, __functionAddress);
    }

    /**
     * Get information on memory allocations.
     * 
     * <p>Returns the base address in {@code *pbase} and size in {@code *psize} of the allocation by {@link #cuMemAlloc MemAlloc} or {@link #cuMemAllocPitch MemAllocPitch} that contains the input
     * pointer {@code dptr}. Both parameters {@code pbase} and {@code psize} are optional. If one of them is {@code NULL}, it is ignored.</p>
     *
     * @param pbase returned base address
     * @param psize returned size of device memory allocation
     * @param dptr  device pointer to query
     */
    @NativeType("CUresult")
    public static int cuMemGetAddressRange(@Nullable @NativeType("CUdeviceptr *") PointerBuffer pbase, @Nullable @NativeType("size_t *") PointerBuffer psize, @NativeType("CUdeviceptr") long dptr) {
        if (CHECKS) {
            checkSafe(pbase, 1);
            checkSafe(psize, 1);
        }
        return ncuMemGetAddressRange(memAddressSafe(pbase), memAddressSafe(psize), dptr);
    }

    // --- [ cuMemAllocHost ] ---

    /** Unsafe version of: {@link #cuMemAllocHost MemAllocHost} */
    public static int ncuMemAllocHost(long pp, long bytesize) {
        long __functionAddress = Functions.MemAllocHost;
        return callPPI(pp, bytesize, __functionAddress);
    }

    /**
     * Allocates page-locked host memory.
     * 
     * <p>Allocates {@code bytesize} bytes of host memory that is page-locked and accessible to the device. The driver tracks the virtual memory ranges allocated
     * with this function and automatically accelerates calls to functions such as {@link #cuMemcpy Memcpy}. Since the memory can be accessed directly by the device, it can
     * be read or written with much higher bandwidth than pageable memory obtained with functions such as {@code malloc()}. Allocating excessive amounts of
     * memory with {@code cuMemAllocHost()} may degrade system performance, since it reduces the amount of memory available to the system for paging. As a
     * result, this function is best used sparingly to allocate staging areas for data exchange between host and device.</p>
     * 
     * <p>Note all host memory allocated using {@code cuMemHostAlloc()} will automatically be immediately accessible to all contexts on all devices which support
     * unified addressing (as may be queried using {@link #CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING}). The device pointer that may be used to access this host memory from
     * those contexts is always equal to the returned host pointer {@code *pp}. See {@code CUDA_UNIFIED} for additional details.</p>
     *
     * @param pp       returned host pointer to page-locked memory
     * @param bytesize requested allocation size in bytes
     */
    @NativeType("CUresult")
    public static int cuMemAllocHost(@NativeType("void **") PointerBuffer pp, @NativeType("size_t") long bytesize) {
        if (CHECKS) {
            check(pp, 1);
        }
        return ncuMemAllocHost(memAddress(pp), bytesize);
    }

    // --- [ cuMemFreeHost ] ---

    /** Unsafe version of: {@link #cuMemFreeHost MemFreeHost} */
    public static int ncuMemFreeHost(long p) {
        long __functionAddress = Functions.MemFreeHost;
        return callPI(p, __functionAddress);
    }

    /**
     * Frees page-locked host memory.
     * 
     * <p>Frees the memory space pointed to by {@code p}, which must have been returned by a previous call to {@link #cuMemAllocHost MemAllocHost}.</p>
     *
     * @param p pointer to memory to free
     */
    @NativeType("CUresult")
    public static int cuMemFreeHost(@NativeType("void *") ByteBuffer p) {
        return ncuMemFreeHost(memAddress(p));
    }

    // --- [ cuMemHostAlloc ] ---

    /** Unsafe version of: {@link #cuMemHostAlloc MemHostAlloc} */
    public static int ncuMemHostAlloc(long pp, long bytesize, int Flags) {
        long __functionAddress = Functions.MemHostAlloc;
        return callPPI(pp, bytesize, Flags, __functionAddress);
    }

    /**
     * Allocates page-locked host memory.
     * 
     * <p>Allocates {@code bytesize} bytes of host memory that is page-locked and accessible to the device. The driver tracks the virtual memory ranges allocated
     * with this function and automatically accelerates calls to functions such as {@link #cuMemcpyHtoD MemcpyHtoD}. Since the memory can be accessed directly by the device,
     * it can be read or written with much higher bandwidth than pageable memory obtained with functions such as {@code malloc()}. Allocating excessive
     * amounts of pinned memory may degrade system performance, since it reduces the amount of memory available to the system for paging. As a result, this
     * function is best used sparingly to allocate staging areas for data exchange between host and device.</p>
     * 
     * <p>The {@code Flags} parameter enables different options to be specified that affect the allocation, as follows:</p>
     * 
     * <ul>
     * <li>{@link #CU_MEMHOSTALLOC_PORTABLE MEMHOSTALLOC_PORTABLE}: The memory returned by this call will be considered as pinned memory by all CUDA contexts, not just the one that performed
     * the allocation.</li>
     * <li>{@link #CU_MEMHOSTALLOC_DEVICEMAP MEMHOSTALLOC_DEVICEMAP}: Maps the allocation into the CUDA address space. The device pointer to the memory may be obtained by calling
     * {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer}.</li>
     * <li>{@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED}: Allocates the memory as write-combined (WC). WC memory can be transferred across the PCI Express bus more quickly on
     * some system configurations, but cannot be read efficiently by most CPUs. WC memory is a good option for buffers that will be written by the CPU and
     * read by the GPU via mapped pinned memory or host-&gt;device transfers.</li>
     * </ul>
     * 
     * <p>All of these flags are orthogonal to one another: a developer may allocate memory that is portable, mapped and/or write-combined with no restrictions.</p>
     * 
     * <p>The {@link #CU_MEMHOSTALLOC_DEVICEMAP MEMHOSTALLOC_DEVICEMAP} flag may be specified on CUDA contexts for devices that do not support mapped pinned memory. The failure is deferred to
     * {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} because the memory may be mapped into other CUDA contexts via the {@link #CU_MEMHOSTALLOC_PORTABLE MEMHOSTALLOC_PORTABLE} flag.</p>
     * 
     * <p>The memory allocated by this function must be freed with {@link #cuMemFreeHost MemFreeHost}.</p>
     * 
     * <p>Note all host memory allocated using {@code cuMemHostAlloc()} will automatically be immediately accessible to all contexts on all devices which support
     * unified addressing (as may be queried using {@link #CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING}). Unless the flag {@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} is specified, the device
     * pointer that may be used to access this host memory from those contexts is always equal to the returned host pointer {@code *pp}. If the flag
     * {@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} is specified, then the function {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} must be used to query the device pointer, even if the context
     * supports unified addressing. See {@code CUDA_UNIFIED} for additional details.</p>
     *
     * @param pp       returned host pointer to page-locked memory
     * @param bytesize requested allocation size in bytes
     * @param Flags    flags for allocation request
     */
    @NativeType("CUresult")
    public static int cuMemHostAlloc(@NativeType("void **") PointerBuffer pp, @NativeType("size_t") long bytesize, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pp, 1);
        }
        return ncuMemHostAlloc(memAddress(pp), bytesize, Flags);
    }

    // --- [ cuMemHostGetDevicePointer ] ---

    /** Unsafe version of: {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} */
    public static int ncuMemHostGetDevicePointer(long pdptr, long p, int Flags) {
        long __functionAddress = Functions.MemHostGetDevicePointer;
        return callPPI(pdptr, p, Flags, __functionAddress);
    }

    /**
     * Passes back device pointer of mapped pinned memory.
     * 
     * <p>Passes back the device pointer {@code pdptr} corresponding to the mapped, pinned host buffer {@code p} allocated by {@link #cuMemHostAlloc MemHostAlloc}.</p>
     * 
     * <p>{@code cuMemHostGetDevicePointer()} will fail if the {@link #CU_MEMHOSTALLOC_DEVICEMAP MEMHOSTALLOC_DEVICEMAP} flag was not specified at the time the memory was allocated, or if the
     * function is called on a GPU that does not support mapped pinned memory.</p>
     * 
     * <p>For devices that have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM}, the memory can also be
     * accessed from the device using the host pointer {@code p}. The device pointer returned by {@code cuMemHostGetDevicePointer()} may or may not match the
     * original host pointer {@code p} and depends on the devices visible to the application. If all devices visible to the application have a non-zero value
     * for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will match the original pointer {@code p}. If any device
     * visible to the application has a zero value for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will not match
     * the original host pointer {@code p}, but it will be suitable for use on all devices provided Unified Virtual Addressing is enabled. In such systems, it
     * is valid to access the memory using either pointer on devices that have a non-zero value for the device attribute. Note however that such devices
     * should access the memory using only of the two pointers and not both.</p>
     * 
     * <p>{@code Flags} provides for future releases. For now, it must be set to 0.</p>
     *
     * @param pdptr returned device pointer
     * @param p     host pointer
     * @param Flags options (must be 0)
     */
    @NativeType("CUresult")
    public static int cuMemHostGetDevicePointer(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("void *") ByteBuffer p, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuMemHostGetDevicePointer(memAddress(pdptr), memAddress(p), Flags);
    }

    // --- [ cuMemHostGetFlags ] ---

    /** Unsafe version of: {@link #cuMemHostGetFlags MemHostGetFlags} */
    public static int ncuMemHostGetFlags(long pFlags, long p) {
        long __functionAddress = Functions.MemHostGetFlags;
        return callPPI(pFlags, p, __functionAddress);
    }

    /**
     * Passes back flags that were used for a pinned allocation
     * 
     * <p>Passes back the flags {@code pFlags} that were specified when allocating the pinned host buffer {@code p} allocated by {@link #cuMemHostAlloc MemHostAlloc}.</p>
     * 
     * <p>{@code cuMemHostGetFlags()} will fail if the pointer does not reside in an allocation performed by {@link #cuMemAllocHost MemAllocHost} or {@code cuMemHostAlloc()}.</p>
     *
     * @param pFlags returned flags word
     * @param p      host pointer
     */
    @NativeType("CUresult")
    public static int cuMemHostGetFlags(@NativeType("unsigned int *") IntBuffer pFlags, @NativeType("void *") ByteBuffer p) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return ncuMemHostGetFlags(memAddress(pFlags), memAddress(p));
    }

    // --- [ cuMemAllocManaged ] ---

    /** Unsafe version of: {@link #cuMemAllocManaged MemAllocManaged} */
    public static int ncuMemAllocManaged(long dptr, long bytesize, int flags) {
        long __functionAddress = Functions.MemAllocManaged;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dptr, bytesize, flags, __functionAddress);
    }

    /**
     * Allocates memory that will be automatically managed by the Unified Memory system.
     * 
     * <p>Allocates {@code bytesize} bytes of managed memory on the device and returns in {@code *dptr} a pointer to the allocated memory. If the device doesn't
     * support allocating managed memory, {@link #CUDA_ERROR_NOT_SUPPORTED} is returned. Support for managed memory can be queried using the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY DEVICE_ATTRIBUTE_MANAGED_MEMORY}. The allocated memory is suitably aligned for any kind of variable. The memory is not cleared. If {@code bytesize}
     * is 0, {@link #cuMemAllocManaged MemAllocManaged} returns {@link #CUDA_ERROR_INVALID_VALUE}. The pointer is valid on the CPU and on all GPUs in the system that support managed memory.
     * All accesses to this pointer must obey the Unified Memory programming model.</p>
     * 
     * <p>{@code flags} specifies the default stream association for this allocation. {@code flags} must be one of {@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL} or {@link #CU_MEM_ATTACH_HOST MEM_ATTACH_HOST}. If
     * {@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL} is specified, then this memory is accessible from any stream on any device. If {@link #CU_MEM_ATTACH_HOST MEM_ATTACH_HOST} is specified, then the allocation
     * should not be accessed from devices that have a zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}; an explicit call to
     * {@link #cuStreamAttachMemAsync StreamAttachMemAsync} will be required to enable access on such devices.</p>
     * 
     * <p>If the association is later changed via {@link #cuStreamAttachMemAsync StreamAttachMemAsync} to a single stream, the default association as specifed during {@link #cuMemAllocManaged MemAllocManaged} is
     * restored when that stream is destroyed. For __managed__ variables, the default association is always {@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL}. Note that destroying a stream
     * is an asynchronous operation, and as a result, the change to default association won't happen until all work in the stream has completed.</p>
     * 
     * <p>Memory allocated with {@link #cuMemAllocManaged MemAllocManaged} should be released with {@link #cuMemFree MemFree}.</p>
     * 
     * <p>Device memory oversubscription is possible for GPUs that have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}.
     * Managed memory on such GPUs may be evicted from device memory to host memory at any time by the Unified Memory driver in order to make room for other
     * allocations.</p>
     * 
     * <p>In a multi-GPU system where all GPUs have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}, managed memory may
     * not be populated when this API returns and instead may be populated on access. In such systems, managed memory can migrate to any processor's memory at
     * any time. The Unified Memory driver will employ heuristics to maintain data locality and prevent excessive page faults to the extent possible. The
     * application can also guide the driver about memory usage patterns via {@link #cuMemAdvise MemAdvise}. The application can also explicitly migrate memory to a desired
     * processor's memory via {@link #cuMemPrefetchAsync MemPrefetchAsync}.</p>
     * 
     * <p>In a multi-GPU system where all of the GPUs have a zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} and all the GPUs
     * have peer-to-peer support with each other, the physical storage for managed memory is created on the GPU which is active at the time
     * {@link #cuMemAllocManaged MemAllocManaged} is called. All other GPUs will reference the data at reduced bandwidth via peer mappings over the PCIe bus. The Unified Memory
     * driver does not migrate memory among such GPUs.</p>
     * 
     * <p>In a multi-GPU system where not all GPUs have peer-to-peer support with each other and where the value of the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} is zero for at least one of those GPUs, the location chosen for physical storage of managed memory is
     * system-dependent.</p>
     * 
     * <ul>
     * <li>On Linux, the location chosen will be device memory as long as the current set of active contexts are on devices that either have peer-to-peer
     * support with each other or have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}. If there is an active
     * context on a GPU that does not have a non-zero value for that device attribute and it does not have peer-to-peer support with the other devices
     * that have active contexts on them, then the location for physical storage will be 'zero-copy' or host memory. Note that this means that managed
     * memory that is located in device memory is migrated to host memory if a new context is created on a GPU that doesn't have a non-zero value for the
     * device attribute and does not support peer-to-peer with at least one of the other devices that has an active context. This in turn implies that
     * context creation may fail if there is insufficient host memory to migrate all managed allocations.</li>
     * <li>On Windows, the physical storage is always created in 'zero-copy' or host memory. All GPUs will reference the data at reduced bandwidth over the
     * PCIe bus. In these circumstances, use of the environment variable {@code CUDA_VISIBLE_DEVICES} is recommended to restrict CUDA to only use those
     * GPUs that have peer-to-peer support. Alternatively, users can also set {@code CUDA_MANAGED_FORCE_DEVICE_ALLOC} to a non-zero value to force the
     * driver to always use device memory for physical storage. When this environment variable is set to a non-zero value, all contexts created in that
     * process on devices that support managed memory have to be peer-to-peer compatible with each other. Context creation will fail if a context is
     * created on a device that supports managed memory and is not peer-to-peer compatible with any of the other managed memory supporting devices on
     * which contexts were previously created, even if those contexts have been destroyed. These environment variables are described in the CUDA
     * programming guide under the "CUDA environment variables" section.</li>
     * <li>On ARM, managed memory is not available on discrete gpu with Drive PX-2.</li>
     * </ul>
     *
     * @param dptr     returned device pointer
     * @param bytesize requested allocation size in bytes
     * @param flags    must be one of {@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL} or {@link #CU_MEM_ATTACH_HOST MEM_ATTACH_HOST}
     */
    @NativeType("CUresult")
    public static int cuMemAllocManaged(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocManaged(memAddress(dptr), bytesize, flags);
    }

    // --- [ cuDeviceGetByPCIBusId ] ---

    /** Unsafe version of: {@link #cuDeviceGetByPCIBusId DeviceGetByPCIBusId} */
    public static int ncuDeviceGetByPCIBusId(long dev, long pciBusId) {
        long __functionAddress = Functions.DeviceGetByPCIBusId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dev, pciBusId, __functionAddress);
    }

    /**
     * Returns a handle to a compute device.
     * 
     * <p>Returns in {@code *device} a device handle given a PCI bus ID string.</p>
     *
     * @param dev      returned device handle
     * @param pciBusId string in one of the following forms: {@code [domain]:[bus]:[device].[function] [domain]:[bus]:[device] [bus]:[device].[function]} where
     *                 {@code domain}, {@code bus}, {@code device}, and {@code function} are all hexadecimal values
     */
    @NativeType("CUresult")
    public static int cuDeviceGetByPCIBusId(@NativeType("CUdevice *") IntBuffer dev, @NativeType("char const *") ByteBuffer pciBusId) {
        if (CHECKS) {
            check(dev, 1);
            checkNT1(pciBusId);
        }
        return ncuDeviceGetByPCIBusId(memAddress(dev), memAddress(pciBusId));
    }

    /**
     * Returns a handle to a compute device.
     * 
     * <p>Returns in {@code *device} a device handle given a PCI bus ID string.</p>
     *
     * @param dev      returned device handle
     * @param pciBusId string in one of the following forms: {@code [domain]:[bus]:[device].[function] [domain]:[bus]:[device] [bus]:[device].[function]} where
     *                 {@code domain}, {@code bus}, {@code device}, and {@code function} are all hexadecimal values
     */
    @NativeType("CUresult")
    public static int cuDeviceGetByPCIBusId(@NativeType("CUdevice *") IntBuffer dev, @NativeType("char const *") CharSequence pciBusId) {
        if (CHECKS) {
            check(dev, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pciBusId, true);
            long pciBusIdEncoded = stack.getPointerAddress();
            return ncuDeviceGetByPCIBusId(memAddress(dev), pciBusIdEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuDeviceGetPCIBusId ] ---

    /**
     * Unsafe version of: {@link #cuDeviceGetPCIBusId DeviceGetPCIBusId}
     *
     * @param len maximum length of string to store in {@code name}
     */
    public static int ncuDeviceGetPCIBusId(long pciBusId, int len, int dev) {
        long __functionAddress = Functions.DeviceGetPCIBusId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pciBusId, len, dev, __functionAddress);
    }

    /**
     * Returns a PCI Bus Id string for the device.
     * 
     * <p>Returns an ASCII string identifying the device {@code dev} in the NULL-terminated string pointed to by {@code pciBusId}. {@code len} specifies the
     * maximum length of the string that may be returned.</p>
     *
     * @param pciBusId returned identifier string for the device in the following format {@code [domain]:[bus]:[device].[function]} where {@code domain}, {@code bus},
     *                 {@code device}, and {@code function} are all hexadecimal values. {@code pciBusId} should be large enough to store 13 characters including the
     *                 NULL-terminator.
     * @param dev      device to get identifier string for
     */
    @NativeType("CUresult")
    public static int cuDeviceGetPCIBusId(@NativeType("char *") ByteBuffer pciBusId, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetPCIBusId(memAddress(pciBusId), pciBusId.remaining(), dev);
    }

    // --- [ cuIpcGetEventHandle ] ---

    /** Unsafe version of: {@link #cuIpcGetEventHandle IpcGetEventHandle} */
    public static int ncuIpcGetEventHandle(long pHandle, long event) {
        long __functionAddress = Functions.IpcGetEventHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(event);
        }
        return callPPI(pHandle, event, __functionAddress);
    }

    /**
     * Gets an interprocess handle for a previously allocated event.
     * 
     * <p>Takes as input a previously allocated event. This event must have been created with the {@link #CU_EVENT_INTERPROCESS EVENT_INTERPROCESS} and {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} flags set. This
     * opaque handle may be copied into other processes and opened with {@link #cuIpcOpenEventHandle IpcOpenEventHandle} to allow efficient hardware
     * synchronization between GPU work in different processes.</p>
     * 
     * <p>After the event has been opened in the importing process, {@link #cuEventRecord EventRecord}, {@link #cuEventSynchronize EventSynchronize}, {@link #cuStreamWaitEvent StreamWaitEvent} and {@link #cuEventQuery EventQuery} may be used in
     * either process. Performing operations on the imported event after the exported event has been freed with {@link #cuEventDestroy EventDestroy} will result in undefined
     * behavior.</p>
     * 
     * <p>IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
     * restricted to GPUs in TCC mode.</p>
     *
     * @param pHandle pointer to a user allocated {@code CUipcEventHandle} in which to return the opaque event handle
     * @param event   event allocated with {@link #CU_EVENT_INTERPROCESS EVENT_INTERPROCESS} and {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} flags
     */
    @NativeType("CUresult")
    public static int cuIpcGetEventHandle(@NativeType("CUipcEventHandle *") CUIPCEventHandle pHandle, @NativeType("CUevent") long event) {
        return ncuIpcGetEventHandle(pHandle.address(), event);
    }

    // --- [ cuIpcOpenEventHandle ] ---

    private static final FFICIF cuIpcOpenEventHandleCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(apiCreateArray(ffi_type_sint8, CU_IPC_HANDLE_SIZE))
    );

    /** Unsafe version of: {@link #cuIpcOpenEventHandle IpcOpenEventHandle} */
    public static int ncuIpcOpenEventHandle(long phEvent, long handle) {
        long __functionAddress = Functions.IpcOpenEventHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 2);
            memPutAddress(arguments, stack.npointer(phEvent));
            memPutAddress(arguments + POINTER_SIZE, handle);

            nffi_call(cuIpcOpenEventHandleCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Opens an interprocess event handle for use in the current process.
     * 
     * <p>Opens an interprocess event handle exported from another process with {@link #cuIpcGetEventHandle IpcGetEventHandle}. This function returns a {@code CUevent} that behaves like a
     * locally created event with the {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} flag specified. This event must be freed with {@link #cuEventDestroy EventDestroy}.</p>
     * 
     * <p>Performing operations on the imported event after the exported event has been freed with {@code cuEventDestroy} will result in undefined behavior.</p>
     * 
     * <p>IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
     * restricted to GPUs in TCC mode.</p>
     *
     * @param phEvent returns the imported event
     * @param handle  interprocess handle to open
     */
    @NativeType("CUresult")
    public static int cuIpcOpenEventHandle(@NativeType("CUevent *") PointerBuffer phEvent, @NativeType("CUipcEventHandle") CUIPCEventHandle handle) {
        if (CHECKS) {
            check(phEvent, 1);
        }
        return ncuIpcOpenEventHandle(memAddress(phEvent), handle.address());
    }

    // --- [ cuIpcGetMemHandle ] ---

    /** Unsafe version of: {@link #cuIpcGetMemHandle IpcGetMemHandle} */
    public static int ncuIpcGetMemHandle(long pHandle, long dptr) {
        long __functionAddress = Functions.IpcGetMemHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(dptr);
        }
        return callPPI(pHandle, dptr, __functionAddress);
    }

    /**
     * Gets an interprocess memory handle for an existing device memory allocation.
     * 
     * <p>Takes a pointer to the base of an existing device memory allocation created with {@link #cuMemAlloc MemAlloc} and exports it for use in another process. This is a
     * lightweight operation and may be called multiple times on an allocation without adverse effects.</p>
     * 
     * <p>If a region of memory is freed with {@link #cuMemFree MemFree} and a subsequent call to {@link #cuMemAlloc MemAlloc} returns memory with the same device address, {@link #cuIpcGetMemHandle IpcGetMemHandle}
     * will return a unique handle for the new memory.</p>
     * 
     * <p>IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
     * restricted to GPUs in TCC mode.</p>
     *
     * @param pHandle pointer to user allocated {@code CUipcMemHandle} to return the handle in
     * @param dptr    base pointer to previously allocated device memory
     */
    @NativeType("CUresult")
    public static int cuIpcGetMemHandle(@NativeType("CUipcMemHandle *") CUIPCMemHandle pHandle, @NativeType("CUdeviceptr") long dptr) {
        return ncuIpcGetMemHandle(pHandle.address(), dptr);
    }

    // --- [ cuIpcOpenMemHandle ] ---

    private static final FFICIF cuIpcOpenMemHandleCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(apiCreateArray(ffi_type_sint8, CU_IPC_HANDLE_SIZE)), ffi_type_uint32
    );

    /** Unsafe version of: {@link #cuIpcOpenMemHandle IpcOpenMemHandle} */
    public static int ncuIpcOpenMemHandle(long pdptr, long handle, int Flags) {
        long __functionAddress = Functions.IpcOpenMemHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, stack.npointer(pdptr));
            memPutAddress(arguments + POINTER_SIZE, handle);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nint(Flags));

            nffi_call(cuIpcOpenMemHandleCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Opens an interprocess memory handle exported from another process and returns a device pointer usable in the local process.
     * 
     * <p>Maps memory exported from another process with {@link #cuIpcGetMemHandle IpcGetMemHandle} into the current device address space. For contexts on different devices
     * {@code cuIpcOpenMemHandle} can attempt to enable peer access between the devices as if the user called {@link #cuCtxEnablePeerAccess CtxEnablePeerAccess}. This behavior is
     * controlled by the {@link #CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS IPC_MEM_LAZY_ENABLE_PEER_ACCESS} flag. {@link #cuDeviceCanAccessPeer DeviceCanAccessPeer} can determine if a mapping is possible.</p>
     * 
     * <p>Contexts that may open {@link CUIPCMemHandle} are restricted in the following way. {@code CUipcMemHandle}s from each {@code CUdevice} in a given process may
     * only be opened by one {@code CUcontext} per {@code CUdevice} per other process.</p>
     * 
     * <p>If the memory handle has already been opened by the current context, the reference count on the handle is incremented by 1 and the existing device
     * pointer is returned.</p>
     * 
     * <p>Memory returned from {@code cuIpcOpenMemHandle} must be freed with {@link #cuIpcCloseMemHandle IpcCloseMemHandle}.</p>
     * 
     * <p>Calling {@link #cuMemFree MemFree} on an exported memory region before calling {@code cuIpcCloseMemHandle} in the importing context will result in undefined behavior.</p>
     * 
     * <p>IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
     * restricted to GPUs in TCC mode.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>No guarantees are made about the address returned in {@code *pdptr}. In particular, multiple processes may not receive the same address for the same
     * {@code handle}.</p></div>
     *
     * @param pdptr  returned device pointer
     * @param handle {@code CUipcMemHandle} to open
     * @param Flags  flags for this operation. Must be specified as {@link #CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS IPC_MEM_LAZY_ENABLE_PEER_ACCESS}.
     */
    @NativeType("CUresult")
    public static int cuIpcOpenMemHandle(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("CUipcMemHandle") CUIPCMemHandle handle, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuIpcOpenMemHandle(memAddress(pdptr), handle.address(), Flags);
    }

    // --- [ cuIpcCloseMemHandle ] ---

    /**
     * Attempts to close memory mapped with {@link #cuIpcOpenMemHandle IpcOpenMemHandle}.
     * 
     * <p>Decrements the reference count of the memory returned by {@code cuIpcOpenMemHandle()} by 1. When the reference count reaches 0, this API unmaps the
     * memory. The original allocation in the exporting process as well as imported mappings in other processes will be unaffected.</p>
     * 
     * <p>Any resources used to enable peer access will be freed if this is the last mapping using them.</p>
     * 
     * <p>IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
     * restricted to GPUs in TCC mode</p>
     *
     * @param dptr device pointer returned by {@code cuIpcOpenMemHandle()}
     */
    @NativeType("CUresult")
    public static int cuIpcCloseMemHandle(@NativeType("CUdeviceptr") long dptr) {
        long __functionAddress = Functions.IpcCloseMemHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(dptr);
        }
        return callPI(dptr, __functionAddress);
    }

    // --- [ cuMemHostRegister ] ---

    /**
     * Unsafe version of: {@link #cuMemHostRegister MemHostRegister}
     *
     * @param bytesize size in bytes of the address range to page-lock
     */
    public static int ncuMemHostRegister(long p, long bytesize, int Flags) {
        long __functionAddress = Functions.MemHostRegister;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(p, bytesize, Flags, __functionAddress);
    }

    /**
     * Registers an existing host memory range for use by CUDA.
     * 
     * <p>Page-locks the memory range specified by {@code p} and {@code bytesize} and maps it for the device(s) as specified by {@code Flags}. This memory range
     * also is added to the same tracking mechanism as {@link #cuMemHostAlloc MemHostAlloc} to automatically accelerate calls to functions such as {@link #cuMemcpyHtoD MemcpyHtoD}. Since the memory
     * can be accessed directly by the device, it can be read or written with much higher bandwidth than pageable memory that has not been registered.
     * Page-locking excessive amounts of memory may degrade system performance, since it reduces the amount of memory available to the system for paging. As a
     * result, this function is best used sparingly to register staging areas for data exchange between host and device.</p>
     * 
     * <p>This function has limited support on Mac OS X. OS 10.7 or higher is required.</p>
     * 
     * <p>All flags are orthogonal to one another: a developer may page-lock memory that is portable or mapped with no restrictions.</p>
     * 
     * <p>The {@link #CU_MEMHOSTREGISTER_DEVICEMAP MEMHOSTREGISTER_DEVICEMAP} flag may be specified on CUDA contexts for devices that do not support mapped pinned memory. The failure is deferred to
     * {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} because the memory may be mapped into other CUDA contexts via the {@link #CU_MEMHOSTREGISTER_PORTABLE MEMHOSTREGISTER_PORTABLE} flag.</p>
     * 
     * <p>For devices that have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM}, the memory can also be
     * accessed from the device using the host pointer {@code p}. The device pointer returned by {@code cuMemHostGetDevicePointer()} may or may not match the
     * original host pointer {@code ptr} and depends on the devices visible to the application. If all devices visible to the application have a non-zero
     * value for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will match the original pointer {@code ptr}. If any
     * device visible to the application has a zero value for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will
     * not match the original host pointer {@code ptr}, but it will be suitable for use on all devices provided Unified Virtual Addressing is enabled. In such
     * systems, it is valid to access the memory using either pointer on devices that have a non-zero value for the device attribute. Note however that such
     * devices should access the memory using only of the two pointers and not both.</p>
     * 
     * <p>The memory page-locked by this function must be unregistered with {@link #cuMemHostUnregister MemHostUnregister}.</p>
     *
     * @param p     host pointer to memory to page-lock
     * @param Flags flags for allocation request. One or more of:<br><table><tr><td>{@link #CU_MEMHOSTREGISTER_PORTABLE MEMHOSTREGISTER_PORTABLE}</td><td>{@link #CU_MEMHOSTREGISTER_DEVICEMAP MEMHOSTREGISTER_DEVICEMAP}</td><td>{@link #CU_MEMHOSTREGISTER_IOMEMORY MEMHOSTREGISTER_IOMEMORY}</td></tr><tr><td>{@link #CU_MEMHOSTREGISTER_READ_ONLY MEMHOSTREGISTER_READ_ONLY}</td></tr></table>
     */
    @NativeType("CUresult")
    public static int cuMemHostRegister(@NativeType("void *") ByteBuffer p, @NativeType("unsigned int") int Flags) {
        return ncuMemHostRegister(memAddress(p), p.remaining(), Flags);
    }

    // --- [ cuMemHostUnregister ] ---

    /** Unsafe version of: {@link #cuMemHostUnregister MemHostUnregister} */
    public static int ncuMemHostUnregister(long p) {
        long __functionAddress = Functions.MemHostUnregister;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(p, __functionAddress);
    }

    /**
     * Unregisters a memory range that was registered with {@link #cuMemHostRegister MemHostRegister}.
     * 
     * <p>Unmaps the memory range whose base address is specified by {@code p}, and makes it pageable again.</p>
     * 
     * <p>The base address must be the same one specified to {@link #cuMemHostRegister MemHostRegister}.</p>
     *
     * @param p host pointer to memory to unregister
     */
    @NativeType("CUresult")
    public static int cuMemHostUnregister(@NativeType("void *") ByteBuffer p) {
        return ncuMemHostUnregister(memAddress(p));
    }

    // --- [ cuMemcpy ] ---

    /**
     * Copies memory.
     * 
     * <p>Copies data between two pointers. {@code dst} and {@code src} are base pointers of the destination and source, respectively. {@code ByteCount}
     * specifies the number of bytes to copy. Note that this function infers the type of the transfer (host to host, host to device, device to device, or
     * device to host) from the pointer values. This function is only allowed in contexts which support unified addressing.</p>
     *
     * @param dst       destination unified virtual address space pointer
     * @param src       source unified virtual address space pointer
     * @param ByteCount size of memory copy in bytes
     */
    @NativeType("CUresult")
    public static int cuMemcpy(@NativeType("CUdeviceptr") long dst, @NativeType("CUdeviceptr") long src, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.Memcpy;
        if (CHECKS) {
            check(__functionAddress);
            check(dst);
            check(src);
        }
        return callPPPI(dst, src, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyPeer ] ---

    /**
     * Copies device memory between two contexts.
     * 
     * <p>Copies from device memory in one context to device memory in another context. {@code dstDevice} is the base device pointer of the destination memory
     * and {@code dstContext} is the destination context. {@code srcDevice} is the base device pointer of the source memory and {@code srcContext} is the
     * source pointer. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice  destination device pointer
     * @param dstContext destination context
     * @param srcDevice  source device pointer
     * @param srcContext source context
     * @param ByteCount  size of memory copy in bytes
     */
    @NativeType("CUresult")
    public static int cuMemcpyPeer(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUcontext") long dstContext, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUcontext") long srcContext, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyPeer;
        if (CHECKS) {
            check(__functionAddress);
            check(dstDevice);
            check(dstContext);
            check(srcDevice);
            check(srcContext);
        }
        return callPPPPPI(dstDevice, dstContext, srcDevice, srcContext, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyHtoD ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyHtoD MemcpyHtoD}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyHtoD(long dstDevice, long srcHost, long ByteCount) {
        long __functionAddress = Functions.MemcpyHtoD;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, srcHost, ByteCount, __functionAddress);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ByteBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), srcHost.remaining());
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ShortBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") IntBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") LongBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") FloatBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") DoubleBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") PointerBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyDtoH ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyDtoH MemcpyDtoH}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyDtoH(long dstHost, long srcDevice, long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoH;
        if (CHECKS) {
            check(srcDevice);
        }
        return callPPPI(dstHost, srcDevice, ByteCount, __functionAddress);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, dstHost.remaining());
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 1);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") IntBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") LongBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyDtoD ] ---

    /**
     * Copies memory from Device to Device.
     * 
     * <p>Copies from device memory to device memory. {@code dstDevice} and {@code srcDevice} are the base pointers of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcDevice source device pointer
     * @param ByteCount size of memory copy in bytes
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUdeviceptr") long srcDevice, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoD;
        if (CHECKS) {
            check(dstDevice);
            check(srcDevice);
        }
        return callPPPI(dstDevice, srcDevice, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyDtoA ] ---

    /**
     * Copies memory from Device to Array.
     * 
     * <p>Copies from device memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting index of the
     * destination data. {@code srcDevice} specifies the base pointer of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcDevice source device pointer
     * @param ByteCount size of memory copy in bytes
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("CUdeviceptr") long srcDevice, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoA;
        if (CHECKS) {
            check(dstArray);
            check(srcDevice);
        }
        return callPPPPI(dstArray, dstOffset, srcDevice, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyAtoD ] ---

    /**
     * Copies memory from Array to Device.
     * 
     * <p>Copies from one 1D CUDA array to device memory. {@code dstDevice} specifies the base pointer of the destination and must be naturally aligned with the
     * CUDA array elements. {@code srcArray} and {@code srcOffset} specify the CUDA array handle and the offset in bytes into the array where the copy is to
     * begin. {@code ByteCount} specifies the number of bytes to copy and must be evenly divisible by the array element size.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param ByteCount size of memory copy in bytes
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoD;
        if (CHECKS) {
            check(dstDevice);
            check(srcArray);
        }
        return callPPPPI(dstDevice, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyHtoA ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyHtoA MemcpyHtoA}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyHtoA(long dstArray, long dstOffset, long srcHost, long ByteCount) {
        long __functionAddress = Functions.MemcpyHtoA;
        if (CHECKS) {
            check(dstArray);
        }
        return callPPPPI(dstArray, dstOffset, srcHost, ByteCount, __functionAddress);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ByteBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), srcHost.remaining());
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ShortBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") IntBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") LongBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") FloatBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") DoubleBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") PointerBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyAtoH ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyAtoH MemcpyAtoH}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyAtoH(long dstHost, long srcArray, long srcOffset, long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoH;
        if (CHECKS) {
            check(srcArray);
        }
        return callPPPPI(dstHost, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, dstHost.remaining());
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 1);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") IntBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") LongBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination device pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyAtoA ] ---

    /**
     * Copies memory from Array to Array.
     * 
     * <p>Copies from one 1D CUDA array to another. {@code dstArray} and {@code srcArray} specify the handles of the destination and source CUDA arrays for the
     * copy, respectively. {@code dstOffset} and {@code srcOffset} specify the destination and source offsets in bytes into the CUDA arrays. {@code ByteCount}
     * is the number of bytes to be copied. The size of the elements in the CUDA arrays need not be the same format, but the elements must be the same size;
     * and count must be evenly divisible by that size.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param ByteCount size of memory copy in bytes
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoA;
        if (CHECKS) {
            check(dstArray);
            check(srcArray);
        }
        return callPPPPPI(dstArray, dstOffset, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpy2D ] ---

    /** Unsafe version of: {@link #cuMemcpy2D Memcpy2D} */
    public static int ncuMemcpy2D(long pCopy) {
        long __functionAddress = Functions.Memcpy2D;
        return callPI(pCopy, __functionAddress);
    }

    /**
     * Copies memory for 2D arrays.
     * 
     * <p>Perform a 2D memory copy according to the parameters specified in {@code pCopy}.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code srcHost} and {@code srcPitch} specify the (host) base address of the source data and the bytes per
     * row to apply. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code srcDevice} and {@code srcPitch} specify the (device) base address of the source data and the
     * bytes per row to apply. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice} and
     * {@code srcPitch} are ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data and the
     * bytes per row to apply. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data and
     * the bytes per row to apply. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice} and
     * {@code dstPitch} are ignored.</p>
     * 
     * <p>{@code srcXInBytes} and {@code srcY} specify the base address of the source data for the copy.</p>
     * 
     * <p>For host pointers, the starting address is</p>
     * 
     * <pre><code>
     * voidStart = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     * CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code dstXInBytes} and {@code dstY} specify the base address of the destination data for the copy.</p>
     * 
     * <p>For host pointers, the base address is</p>
     * 
     * <pre><code>
     * voiddstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     * CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code WidthInBytes} and {@code Height} specify the width (in bytes) and height of the 2D copy being performed.</p>
     * 
     * <p>If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
     * or equal to {@code WidthInBytes} + {@code dstXInBytes}.</p>
     * 
     * <p>{@code cuMemcpy2D()} returns an error if any pitch is greater than the maximum allowed ({@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH}). {@code cuMemAllocPitch}() passes back
     * pitches that always work with {@code cuMemcpy2D()}. On intra-device memory copies (device to device, CUDA array to device, CUDA array to CUDA array),
     * {@code cuMemcpy2D()} may fail for pitches not computed by {@link #cuMemAllocPitch MemAllocPitch}. {@link #cuMemcpy2DUnaligned Memcpy2DUnaligned} does not have this restriction, but may run
     * significantly slower in the cases where {@code cuMemcpy2D()} would have returned an error code.</p>
     *
     * @param pCopy parameters for the memory copy
     */
    @NativeType("CUresult")
    public static int cuMemcpy2D(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy) {
        return ncuMemcpy2D(pCopy.address());
    }

    // --- [ cuMemcpy2DUnaligned ] ---

    /** Unsafe version of: {@link #cuMemcpy2DUnaligned Memcpy2DUnaligned} */
    public static int ncuMemcpy2DUnaligned(long pCopy) {
        long __functionAddress = Functions.Memcpy2DUnaligned;
        return callPI(pCopy, __functionAddress);
    }

    /**
     * Copies memory for 2D arrays.
     * 
     * <p>Perform a 2D memory copy according to the parameters specified in {@code pCopy}.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code srcHost} and {@code srcPitch} specify the (host) base address of the source data and the bytes per
     * row to apply. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code srcDevice} and {@code srcPitch} specify the (device) base address of the source data and the
     * bytes per row to apply. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice} and
     * {@code srcPitch} are ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data and the
     * bytes per row to apply. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data and
     * the bytes per row to apply. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice} and
     * {@code dstPitch} are ignored.</p>
     * 
     * <p>{@code srcXInBytes} and {@code srcY} specify the base address of the source data for the copy.</p>
     * 
     * <p>For host pointers, the starting address is</p>
     * 
     * <pre><code>
     *   void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code dstXInBytes} and {@code dstY} specify the base address of the destination data for the copy.</p>
     * 
     * <p>For host pointers, the base address is</p>
     * 
     * <pre><code>
     *   void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code WidthInBytes} and {@code Height} specify the width (in bytes) and height of the 2D copy being performed.</p>
     * 
     * <p>If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
     * or equal to {@code WidthInBytes} + {@code dstXInBytes}.</p>
     * 
     * <p>{@link #cuMemcpy2D Memcpy2D} returns an error if any pitch is greater than the maximum allowed ({@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH}). {@link #cuMemAllocPitch MemAllocPitch} passes back pitches that
     * always work with {@code cuMemcpy2D()}. On intra-device memory copies (device to device, CUDA array to device, CUDA array to CUDA array),
     * {@code cuMemcpy2D()} may fail for pitches not computed by {@code cuMemAllocPitch()}. {@code cuMemcpy2DUnaligned()} does not have this restriction, but
     * may run significantly slower in the cases where {@code cuMemcpy2D()} would have returned an error code.</p>
     *
     * @param pCopy parameters for the memory copy
     */
    @NativeType("CUresult")
    public static int cuMemcpy2DUnaligned(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy) {
        return ncuMemcpy2DUnaligned(pCopy.address());
    }

    // --- [ cuMemcpy3D ] ---

    /** Unsafe version of: {@link #cuMemcpy3D Memcpy3D} */
    public static int ncuMemcpy3D(long pCopy) {
        long __functionAddress = Functions.Memcpy3D;
        return callPI(pCopy, __functionAddress);
    }

    /**
     * Copies memory for 3D arrays.
     * 
     * <p>Perform a 3D memory copy according to the parameters specified in {@code pCopy}.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code srcHost}, {@code srcPitch} and {@code srcHeight} specify the (host) base address of the source
     * data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code srcDevice}, {@code srcPitch} and {@code srcHeight} specify the (device) base address of the
     * source data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice},
     * {@code srcPitch} and {@code srcHeight} are ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data, the bytes
     * per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data, the
     * bytes per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice},
     * {@code dstPitch} and {@code dstHeight} are ignored.</p>
     * 
     * <p>{@code srcXInBytes}, {@code srcY} and {@code srcZ} specify the base address of the source data for the copy.</p>
     * 
     * <p>For host pointers, the starting address is</p>
     * 
     * <pre><code>
     *   void* Start = (void*)((char*)srcHost+(srcZ*srcHeight+srcY)*srcPitch + srcXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr Start = srcDevice+(srcZ*srcHeight+srcY)*srcPitch+srcXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code dstXInBytes}, {@code dstY} and {@code dstZ} specify the base address of the destination data for the copy.</p>
     * 
     * <p>For host pointers, the base address is</p>
     * 
     * <pre><code>
     *   void* dstStart = (void*)((char*)dstHost+(dstZ*dstHeight+dstY)*dstPitch + dstXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr dstStart = dstDevice+(dstZ*dstHeight+dstY)*dstPitch+dstXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code WidthInBytes}, {@code Height} and {@code Depth} specify the width (in bytes), height and depth of the 3D copy being performed.</p>
     * 
     * <p>If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
     * or equal to {@code WidthInBytes} + {@code dstXInBytes}.</p>
     * 
     * <p>If specified, {@code srcHeight} must be greater than or equal to {@code Height} + {@code srcY}, and {@code dstHeight} must be greater than or equal to
     * {@code Height} + {@code dstY}.</p>
     * 
     * <p>{@link #cuMemcpy3D Memcpy3D} returns an error if any pitch is greater than the maximum allowed ({@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH}).</p>
     * 
     * <p>The {@code srcLOD} and {@code dstLOD} members of the {@code CUDA_MEMCPY3D} structure must be set to 0.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>_sync</p></div>
     *
     * @param pCopy parameters for the memory copy
     */
    @NativeType("CUresult")
    public static int cuMemcpy3D(@NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D pCopy) {
        return ncuMemcpy3D(pCopy.address());
    }

    // --- [ cuMemcpy3DPeer ] ---

    /** Unsafe version of: {@link #cuMemcpy3DPeer Memcpy3DPeer} */
    public static int ncuMemcpy3DPeer(long pCopy) {
        long __functionAddress = Functions.Memcpy3DPeer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pCopy, __functionAddress);
    }

    /**
     * Copies memory between contexts.
     * 
     * <p>Perform a 3D memory copy according to the parameters specified in {@code pCopy}.</p>
     *
     * @param pCopy parameters for the memory copy
     */
    @NativeType("CUresult")
    public static int cuMemcpy3DPeer(@NativeType("CUDA_MEMCPY3D_PEER const *") CUDA_MEMCPY3D_PEER pCopy) {
        return ncuMemcpy3DPeer(pCopy.address());
    }

    // --- [ cuMemcpyAsync ] ---

    /**
     * Copies memory asynchronously.
     * 
     * <p>Copies data between two pointers. {@code dst} and {@code src} are base pointers of the destination and source, respectively. {@code ByteCount}
     * specifies the number of bytes to copy. Note that this function infers the type of the transfer (host to host, host to device, device to device, or
     * device to host) from the pointer values. This function is only allowed in contexts which support unified addressing.</p>
     *
     * @param dst       destination unified virtual address space pointer
     * @param src       source unified virtual address space pointer
     * @param ByteCount size of memory copy in bytes
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAsync(@NativeType("CUdeviceptr") long dst, @NativeType("CUdeviceptr") long src, @NativeType("size_t") long ByteCount, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemcpyAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(dst);
            check(src);
        }
        return callPPPPI(dst, src, ByteCount, hStream, __functionAddress);
    }

    // --- [ cuMemcpyPeerAsync ] ---

    /**
     * Copies device memory between two contexts asynchronously.
     * 
     * <p>Copies from device memory in one context to device memory in another context. {@code dstDevice} is the base device pointer of the destination memory
     * and {@code dstContext} is the destination context. {@code srcDevice} is the base device pointer of the source memory and {@code srcContext} is the
     * source pointer. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice  destination device pointer
     * @param dstContext destination context
     * @param srcDevice  source device pointer
     * @param srcContext source context
     * @param ByteCount  size of memory copy in bytes
     * @param hStream    stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyPeerAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUcontext") long dstContext, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUcontext") long srcContext, @NativeType("size_t") long ByteCount, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemcpyPeerAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(dstDevice);
            check(dstContext);
            check(srcDevice);
            check(srcContext);
        }
        return callPPPPPPI(dstDevice, dstContext, srcDevice, srcContext, ByteCount, hStream, __functionAddress);
    }

    // --- [ cuMemcpyHtoDAsync ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyHtoDAsync MemcpyHtoDAsync}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyHtoDAsync(long dstDevice, long srcHost, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyHtoDAsync;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, srcHost, ByteCount, hStream, __functionAddress);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ByteBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), srcHost.remaining(), hStream);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ShortBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1, hStream);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") IntBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") LongBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") FloatBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") DoubleBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Host to Device.
     * 
     * <p>Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") PointerBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyDtoHAsync ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyDtoHAsync MemcpyDtoHAsync}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyDtoHAsync(long dstHost, long srcDevice, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyDtoHAsync;
        if (CHECKS) {
            check(srcDevice);
        }
        return callPPPPI(dstHost, srcDevice, ByteCount, hStream, __functionAddress);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, dstHost.remaining(), hStream);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 1, hStream);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") IntBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") LongBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Device to Host.
     * 
     * <p>Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
     * ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination host pointer
     * @param srcDevice source device pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyDtoDAsync ] ---

    /**
     * Copies memory from Device to Device.
     * 
     * <p>Copies from device memory to device memory. {@code dstDevice} and {@code srcDevice} are the base pointers of the destination and source, respectively.
     * {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstDevice destination device pointer
     * @param srcDevice source device pointer
     * @param ByteCount size of memory copy in bytes
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyDtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUdeviceptr") long srcDevice, @NativeType("size_t") long ByteCount, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemcpyDtoDAsync;
        if (CHECKS) {
            check(dstDevice);
            check(srcDevice);
        }
        return callPPPPI(dstDevice, srcDevice, ByteCount, hStream, __functionAddress);
    }

    // --- [ cuMemcpyHtoAAsync ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyHtoAAsync MemcpyHtoAAsync}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyHtoAAsync(long dstArray, long dstOffset, long srcHost, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyHtoAAsync;
        if (CHECKS) {
            check(dstArray);
        }
        return callPPPPPI(dstArray, dstOffset, srcHost, ByteCount, hStream, __functionAddress);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ByteBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), srcHost.remaining(), hStream);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ShortBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1, hStream);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") IntBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") LongBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") FloatBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") DoubleBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Host to Array.
     * 
     * <p>Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
     * destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstArray  destination array
     * @param dstOffset offset in bytes of destination array
     * @param srcHost   source host pointer
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") PointerBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyAtoHAsync ] ---

    /**
     * Unsafe version of: {@link #cuMemcpyAtoHAsync MemcpyAtoHAsync}
     *
     * @param ByteCount size of memory copy in bytes
     */
    public static int ncuMemcpyAtoHAsync(long dstHost, long srcArray, long srcOffset, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyAtoHAsync;
        if (CHECKS) {
            check(srcArray);
        }
        return callPPPPPI(dstHost, srcArray, srcOffset, ByteCount, hStream, __functionAddress);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, dstHost.remaining(), hStream);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 1, hStream);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") IntBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") LongBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /**
     * Copies memory from Array to Host.
     * 
     * <p>Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
     * specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.</p>
     *
     * @param dstHost   destination pointer
     * @param srcArray  source array
     * @param srcOffset offset in bytes of source array
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpy2DAsync ] ---

    /** Unsafe version of: {@link #cuMemcpy2DAsync Memcpy2DAsync} */
    public static int ncuMemcpy2DAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy2DAsync;
        return callPPI(pCopy, hStream, __functionAddress);
    }

    /**
     * Copies memory for 2D arrays.
     * 
     * <p>Perform a 2D memory copy according to the parameters specified in {@code pCopy}.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code srcHost} and {@code srcPitch} specify the (host) base address of the source data and the bytes per
     * row to apply. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code srcDevice} and {@code srcPitch} specify the (device) base address of the source data and the
     * bytes per row to apply. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice} and
     * {@code srcPitch} are ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data and the
     * bytes per row to apply. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data and
     * the bytes per row to apply. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice} and
     * {@code dstPitch} are ignored.</p>
     * 
     * <p>{@code srcXInBytes} and {@code srcY} specify the base address of the source data for the copy.</p>
     * 
     * <p>For host pointers, the starting address is</p>
     * 
     * <pre><code>
     *   void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code dstXInBytes} and {@code dstY} specify the base address of the destination data for the copy.</p>
     * 
     * <p>For host pointers, the base address is</p>
     * 
     * <pre><code>
     *   void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code WidthInBytes} and {@code Height} specify the width (in bytes) and height of the 2D copy being performed.</p>
     * 
     * <p>If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
     * or equal to {@code WidthInBytes} + {@code dstXInBytes}.</p>
     * 
     * <p>If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
     * or equal to {@code WidthInBytes} + {@code dstXInBytes}.</p>
     * 
     * <p>If specified, {@code srcHeight} must be greater than or equal to {@code Height} + {@code srcY}, and {@code dstHeight} must be greater than or equal to
     * {@code Height} + {@code dstY}.</p>
     * 
     * <p>{@code cuMemcpy2DAsync()} returns an error if any pitch is greater than the maximum allowed ({@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH}). {@link #cuMemAllocPitch MemAllocPitch} passes back
     * pitches that always work with {@link #cuMemcpy2D Memcpy2D}. On intra-device memory copies (device to device, CUDA array to device, CUDA array to CUDA array),
     * {@code cuMemcpy2DAsync()} may fail for pitches not computed by {@code cuMemAllocPitch()}.</p>
     *
     * @param pCopy   parameters for the memory copy
     * @param hStream stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpy2DAsync(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy2DAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemcpy3DAsync ] ---

    /** Unsafe version of: {@link #cuMemcpy3DAsync Memcpy3DAsync} */
    public static int ncuMemcpy3DAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy3DAsync;
        return callPPI(pCopy, hStream, __functionAddress);
    }

    /**
     * Copies memory for 3D arrays.
     * 
     * <p>Perform a 3D memory copy according to the parameters specified in {@code pCopy}.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code srcHost}, {@code srcPitch} and {@code srcHeight} specify the (host) base address of the source
     * data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code srcDevice}, {@code srcPitch} and {@code srcHeight} specify the (device) base address of the
     * source data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.</p>
     * 
     * <p>If {@code srcMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice},
     * {@code srcPitch} and {@code srcHeight} are ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED}, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
     * source data and the bytes per row to apply.  {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
     * context.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data, the bytes
     * per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data, the
     * bytes per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.</p>
     * 
     * <p>If {@code dstMemoryType} is {@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY}, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice},
     * {@code dstPitch} and {@code dstHeight} are ignored.</p>
     * 
     * <p>- {@code srcXInBytes}, {@code srcY} and {@code srcZ} specify the base address of the source data for the copy.</p>
     * 
     * <p>For host pointers, the starting address is</p>
     * 
     * <pre><code>
     *   void* Start = (void*)((char*)srcHost+(srcZ*srcHeight+srcY)*srcPitch + srcXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr Start = srcDevice+(srcZ*srcHeight+srcY)*srcPitch+srcXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code dstXInBytes}, {@code dstY} and {@code dstZ} specify the base address of the destination data for the copy.</p>
     * 
     * <p>For host pointers, the base address is</p>
     * 
     * <pre><code>
     *   void* dstStart = (void*)((char*)dstHost+(dstZ*dstHeight+dstY)*dstPitch + dstXInBytes);</code></pre>
     * 
     * <p>For device pointers, the starting address is</p>
     * 
     * <pre><code>
     *   CUdeviceptr dstStart = dstDevice+(dstZ*dstHeight+dstY)*dstPitch+dstXInBytes;</code></pre>
     * 
     * <p>For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.</p>
     * 
     * <p>{@code WidthInBytes}, {@code Height} and {@code Depth} specify the width (in bytes), height and depth of the 3D copy being performed.</p>
     * 
     * <p>If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
     * or equal to {@code WidthInBytes} + {@code dstXInBytes}.</p>
     * 
     * <p>If specified, {@code srcHeight} must be greater than or equal to {@code Height} + {@code srcY}, and {@code dstHeight} must be greater than or equal to
     * {@code Height} + {@code dstY}.</p>
     * 
     * <p>{@link #cuMemcpy3DAsync Memcpy3DAsync} returns an error if any pitch is greater than the maximum allowed ({@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH}).</p>
     * 
     * <p>The {@code srcLOD} and {@code dstLOD} members of the {@code CUDA_MEMCPY3D} structure must be set to 0.</p>
     *
     * @param pCopy   parameters for the memory copy
     * @param hStream stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpy3DAsync(@NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy3DAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemcpy3DPeerAsync ] ---

    /** Unsafe version of: {@link #cuMemcpy3DPeerAsync Memcpy3DPeerAsync} */
    public static int ncuMemcpy3DPeerAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy3DPeerAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pCopy, hStream, __functionAddress);
    }

    /**
     * Copies memory between contexts asynchronously.
     * 
     * <p>Perform a 3D memory copy according to the parameters specified in {@code pCopy}.</p>
     *
     * @param pCopy   parameters for the memory copy
     * @param hStream stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemcpy3DPeerAsync(@NativeType("CUDA_MEMCPY3D_PEER const *") CUDA_MEMCPY3D_PEER pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy3DPeerAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemsetD8 ] ---

    /**
     * Initializes device memory.
     * 
     * <p>Sets the memory range of {@code N} 8-bit values to the specified value {@code uc}.</p>
     *
     * @param dstDevice destination device pointer
     * @param uc        value to set
     * @param N         number of elements
     */
    @NativeType("CUresult")
    public static int cuMemsetD8(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned char") byte uc, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD8;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, uc, N, __functionAddress);
    }

    // --- [ cuMemsetD16 ] ---

    /**
     * Initializes device memory.
     * 
     * <p>Sets the memory range of {@code N} 16-bit values to the specified value {@code us}. The {@code dstDevice} pointer must be two byte aligned.</p>
     *
     * @param dstDevice destination device pointer
     * @param us        value to set
     * @param N         number of elements
     */
    @NativeType("CUresult")
    public static int cuMemsetD16(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned short") short us, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD16;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, us, N, __functionAddress);
    }

    // --- [ cuMemsetD32 ] ---

    /**
     * Initializes device memory
     * 
     * <p>Sets the memory range of {@code N} 32-bit values to the specified value {@code ui}. The {@code dstDevice} pointer must be four byte aligned.</p>
     *
     * @param dstDevice destination device pointer
     * @param ui        value to set
     * @param N         number of elements
     */
    @NativeType("CUresult")
    public static int cuMemsetD32(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned int") int ui, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD32;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, ui, N, __functionAddress);
    }

    // --- [ cuMemsetD2D8 ] ---

    /**
     * Initializes device memory.
     * 
     * <p>Sets the 2D memory range of {@code Width} 8-bit values to the specified value {@code uc}. {@code Height} specifies the number of rows to set, and
     * {@code dstPitch} specifies the number of bytes between each row. This function performs fastest when the pitch is one that has been passed back by
     * {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dstDevice destination device pointer
     * @param dstPitch  pitch of destination device pointer(Unused if {@code Height} is 1)
     * @param uc        value to set
     * @param Width     width of row
     * @param Height    number of rows
     */
    @NativeType("CUresult")
    public static int cuMemsetD2D8(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned char") byte uc, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D8;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, uc, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD2D16 ] ---

    /**
     * Initializes device memory.
     * 
     * <p>Sets the 2D memory range of {@code Width} 16-bit values to the specified value {@code us}. {@code Height} specifies the number of rows to set, and
     * {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be two byte aligned.
     * This function performs fastest when the pitch is one that has been passed back by {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dstDevice destination device pointer
     * @param dstPitch  pitch of destination device pointer(Unused if {@code Height} is 1)
     * @param us        value to set
     * @param Width     width of row
     * @param Height    number of rows
     */
    @NativeType("CUresult")
    public static int cuMemsetD2D16(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned short") short us, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D16;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, us, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD2D32 ] ---

    /**
     * Initializes device memory.
     * 
     * <p>Sets the 2D memory range of {@code Width} 32-bit values to the specified value {@code ui}. {@code Height} specifies the number of rows to set, and
     * {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be four byte aligned.
     * This function performs fastest when the pitch is one that has been passed back by {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dstDevice destination device pointer
     * @param dstPitch  pitch of destination device pointer(Unused if {@code Height} is 1)
     * @param ui        value to set
     * @param Width     width of row
     * @param Height    number of rows
     */
    @NativeType("CUresult")
    public static int cuMemsetD2D32(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned int") int ui, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D32;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, ui, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD8Async ] ---

    /**
     * Sets device memory
     * 
     * <p>Sets the memory range of {@code N} 8-bit values to the specified value {@code uc}.</p>
     *
     * @param dstDevice destination device pointer
     * @param uc        value to set
     * @param N         number of elements
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemsetD8Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned char") byte uc, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD8Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, uc, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD16Async ] ---

    /**
     * Sets device memory
     * 
     * <p>Sets the memory range of {@code N} 16-bit values to the specified value {@code us}. The {@code dstDevice} pointer must be two byte aligned.</p>
     *
     * @param dstDevice destination device pointer
     * @param us        value to set
     * @param N         number of elements
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemsetD16Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned short") short us, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD16Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, us, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD32Async ] ---

    /**
     * Sets device memory.
     * 
     * <p>Sets the memory range of {@code N} 32-bit values to the specified value {@code ui}. The {@code dstDevice} pointer must be four byte aligned.</p>
     *
     * @param dstDevice destination device pointer
     * @param ui        value to set
     * @param N         number of elements
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemsetD32Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned int") int ui, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD32Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, ui, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D8Async ] ---

    /**
     * Sets device memory.
     * 
     * <p>Sets the 2D memory range of {@code Width} 8-bit values to the specified value {@code uc}. {@code Height} specifies the number of rows to set, and
     * {@code dstPitch} specifies the number of bytes between each row. This function performs fastest when the pitch is one that has been passed back by
     * {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dstDevice destination device pointer
     * @param dstPitch  pitch of destination device pointer(Unused if {@code Height} is 1)
     * @param uc        value to set
     * @param Width     width of row
     * @param Height    number of rows
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemsetD2D8Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned char") byte uc, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D8Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, uc, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D16Async ] ---

    /**
     * Sets device memory.
     * 
     * <p>Sets the 2D memory range of {@code Width} 16-bit values to the specified value {@code us}. {@code Height} specifies the number of rows to set, and
     * {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be two byte aligned.
     * This function performs fastest when the pitch is one that has been passed back by {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dstDevice destination device pointer
     * @param dstPitch  pitch of destination device pointer(Unused if {@code Height} is 1)
     * @param us        value to set
     * @param Width     width of row
     * @param Height    number of rows
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemsetD2D16Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned short") short us, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D16Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, us, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D32Async ] ---

    /**
     * Sets device memory.
     * 
     * <p>Sets the 2D memory range of {@code Width} 32-bit values to the specified value {@code ui}. {@code Height} specifies the number of rows to set, and
     * {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be four byte aligned.
     * This function performs fastest when the pitch is one that has been passed back by {@link #cuMemAllocPitch MemAllocPitch}.</p>
     *
     * @param dstDevice destination device pointer
     * @param dstPitch  pitch of destination device pointer(Unused if {@code Height} is 1)
     * @param ui        value to set
     * @param Width     width of row
     * @param Height    number of rows
     * @param hStream   stream identifier
     */
    @NativeType("CUresult")
    public static int cuMemsetD2D32Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned int") int ui, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D32Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, ui, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuArrayCreate ] ---

    /** Unsafe version of: {@link #cuArrayCreate ArrayCreate} */
    public static int ncuArrayCreate(long pHandle, long pAllocateArray) {
        long __functionAddress = Functions.ArrayCreate;
        return callPPI(pHandle, pAllocateArray, __functionAddress);
    }

    /**
     * Creates a 1D or 2D CUDA array.
     * 
     * <p>Creates a CUDA array according to the {@code CUDA_ARRAY_DESCRIPTOR} structure {@code pAllocateArray} and returns a handle to the new CUDA array in
     * {@code *pHandle}.</p>
     *
     * @param pHandle        returned array
     * @param pAllocateArray array descriptor
     */
    @NativeType("CUresult")
    public static int cuArrayCreate(@NativeType("CUarray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY_DESCRIPTOR const *") CUDA_ARRAY_DESCRIPTOR pAllocateArray) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuArrayCreate(memAddress(pHandle), pAllocateArray.address());
    }

    // --- [ cuArrayGetDescriptor ] ---

    /** Unsafe version of: {@link #cuArrayGetDescriptor ArrayGetDescriptor} */
    public static int ncuArrayGetDescriptor(long pArrayDescriptor, long hArray) {
        long __functionAddress = Functions.ArrayGetDescriptor;
        if (CHECKS) {
            check(hArray);
        }
        return callPPI(pArrayDescriptor, hArray, __functionAddress);
    }

    /**
     * Get a 1D or 2D CUDA array descriptor.
     * 
     * <p>Returns in {@code *pArrayDescriptor} a descriptor containing information on the format and dimensions of the CUDA array {@code hArray}. It is useful
     * for subroutines that have been passed a CUDA array, but need to know the CUDA array parameters for validation or other purposes.</p>
     *
     * @param pArrayDescriptor returned array descriptor
     * @param hArray           array to get descriptor of
     */
    @NativeType("CUresult")
    public static int cuArrayGetDescriptor(@NativeType("CUDA_ARRAY_DESCRIPTOR *") CUDA_ARRAY_DESCRIPTOR pArrayDescriptor, @NativeType("CUarray") long hArray) {
        return ncuArrayGetDescriptor(pArrayDescriptor.address(), hArray);
    }

    // --- [ cuArrayGetSparseProperties ] ---

    /** Unsafe version of: {@link #cuArrayGetSparseProperties ArrayGetSparseProperties} */
    public static int ncuArrayGetSparseProperties(long sparseProperties, long array) {
        long __functionAddress = Functions.ArrayGetSparseProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(array);
        }
        return callPPI(sparseProperties, array, __functionAddress);
    }

    /**
     * Returns the layout properties of a sparse CUDA array.
     * 
     * <p>Returns the layout properties of a sparse CUDA array in {@code sparseProperties} If the CUDA array is not allocated with flag {@link #CUDA_ARRAY3D_SPARSE}
     * {@link #CUDA_ERROR_INVALID_VALUE} will be returned.</p>
     * 
     * <p>If the returned value in {@link CUDA_ARRAY_SPARSE_PROPERTIES}{@code flags} contains {@link #CU_ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL}, then
     * {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize} represents the total size of the array. Otherwise, it will be zero. Also, the returned value in
     * {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailFirstLevel} is always zero. Note that the {@code array} must have been allocated using {@link #cuArrayCreate ArrayCreate} or
     * {@link #cuArray3DCreate Array3DCreate}. For CUDA arrays obtained using {@link #cuMipmappedArrayGetLevel MipmappedArrayGetLevel}, {@link #CUDA_ERROR_INVALID_VALUE} will be returned. Instead,
     * {@link #cuMipmappedArrayGetSparseProperties MipmappedArrayGetSparseProperties} must be used to obtain the sparse properties of the entire CUDA mipmapped array to which {@code array} belongs to.</p>
     *
     * @param sparseProperties pointer to {@code CUDA_ARRAY_SPARSE_PROPERTIES}
     * @param array            CUDA array to get the sparse properties of
     */
    @NativeType("CUresult")
    public static int cuArrayGetSparseProperties(@NativeType("CUDA_ARRAY_SPARSE_PROPERTIES *") CUDA_ARRAY_SPARSE_PROPERTIES sparseProperties, @NativeType("CUarray") long array) {
        return ncuArrayGetSparseProperties(sparseProperties.address(), array);
    }

    // --- [ cuMipmappedArrayGetSparseProperties ] ---

    /** Unsafe version of: {@link #cuMipmappedArrayGetSparseProperties MipmappedArrayGetSparseProperties} */
    public static int ncuMipmappedArrayGetSparseProperties(long sparseProperties, long mipmap) {
        long __functionAddress = Functions.MipmappedArrayGetSparseProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(mipmap);
        }
        return callPPI(sparseProperties, mipmap, __functionAddress);
    }

    /**
     * Returns the layout properties of a sparse CUDA mipmapped array.
     * 
     * <p>Returns the sparse array layout properties in {@code sparseProperties} If the CUDA mipmapped array is not allocated with flag {@link #CUDA_ARRAY3D_SPARSE}
     * {@link #CUDA_ERROR_INVALID_VALUE} will be returned.</p>
     * 
     * <p>For non-layered CUDA mipmapped arrays, {@link CUDA_ARRAY_SPARSE_PROPERTIES}{@code ::miptailSize} returns the size of the mip tail region. The mip tail region
     * includes all mip levels whose width, height or depth is less than that of the tile. For layered CUDA mipmapped arrays, if
     * {@code CUDA_ARRAY_SPARSE_PROPERTIES::flags} contains {@link #CU_ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL}, then {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize}
     * specifies the size of the mip tail of all layers combined. Otherwise, {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize} specifies mip tail size per
     * layer. The returned value of {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailFirstLevel} is valid only if {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize}
     * is non-zero.</p>
     *
     * @param sparseProperties pointer to {@code CUDA_ARRAY_SPARSE_PROPERTIES}
     * @param mipmap           CUDA mipmapped array to get the sparse properties of
     */
    @NativeType("CUresult")
    public static int cuMipmappedArrayGetSparseProperties(@NativeType("CUDA_ARRAY_SPARSE_PROPERTIES *") CUDA_ARRAY_SPARSE_PROPERTIES sparseProperties, @NativeType("CUmipmappedArray") long mipmap) {
        return ncuMipmappedArrayGetSparseProperties(sparseProperties.address(), mipmap);
    }

    // --- [ cuArrayGetPlane ] ---

    /** Unsafe version of: {@link #cuArrayGetPlane ArrayGetPlane} */
    public static int ncuArrayGetPlane(long pPlaneArray, long hArray, int planeIdx) {
        long __functionAddress = Functions.ArrayGetPlane;
        if (CHECKS) {
            check(__functionAddress);
            check(hArray);
        }
        return callPPI(pPlaneArray, hArray, planeIdx, __functionAddress);
    }

    /**
     * Gets a CUDA array plane from a CUDA array.
     * 
     * <p>Returns in {@code pPlaneArray} a CUDA array that represents a single format plane of the CUDA array {@code hArray}.</p>
     * 
     * <p>If {@code planeIdx} is greater than the maximum number of planes in this array or if the array does not have a multi-planar format e.g:
     * {@link #CU_AD_FORMAT_NV12 AD_FORMAT_NV12}, then {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>Note that if the {@code hArray} has format {@link #CU_AD_FORMAT_NV12 AD_FORMAT_NV12}, then passing in 0 for {@code planeIdx} returns a CUDA array of the same size as {@code
     * hArray} but with one channel and {@link #CU_AD_FORMAT_UNSIGNED_INT8 AD_FORMAT_UNSIGNED_INT8} as its format. If 1 is passed for {@code planeIdx}, then the returned CUDA array has half
     * the height and width of {@code hArray} with two channels and {@link #CU_AD_FORMAT_UNSIGNED_INT8 AD_FORMAT_UNSIGNED_INT8} as its format.</p>
     *
     * @param pPlaneArray returned CUDA array referenced by the {@code planeIdx}
     * @param hArray      multiplanar CUDA array
     * @param planeIdx    plane index
     */
    @NativeType("CUresult")
    public static int cuArrayGetPlane(@NativeType("CUarray *") PointerBuffer pPlaneArray, @NativeType("CUarray") long hArray, @NativeType("unsigned int") int planeIdx) {
        if (CHECKS) {
            check(pPlaneArray, 1);
        }
        return ncuArrayGetPlane(memAddress(pPlaneArray), hArray, planeIdx);
    }

    // --- [ cuArrayDestroy ] ---

    /**
     * Destroys a CUDA array.
     * 
     * <p>Destroys the CUDA array {@code hArray}.</p>
     *
     * @param hArray array to destroy
     */
    @NativeType("CUresult")
    public static int cuArrayDestroy(@NativeType("CUarray") long hArray) {
        long __functionAddress = Functions.ArrayDestroy;
        if (CHECKS) {
            check(hArray);
        }
        return callPI(hArray, __functionAddress);
    }

    // --- [ cuArray3DCreate ] ---

    /** Unsafe version of: {@link #cuArray3DCreate Array3DCreate} */
    public static int ncuArray3DCreate(long pHandle, long pAllocateArray) {
        long __functionAddress = Functions.Array3DCreate;
        return callPPI(pHandle, pAllocateArray, __functionAddress);
    }

    /**
     * Creates a 3D CUDA array.
     * 
     * <p>Creates a CUDA array according to the {@link CUDA_ARRAY3D_DESCRIPTOR} structure {@code pAllocateArray} and returns a handle to the new CUDA array in {@code
        *pHandle}.</p>
     * 
     * <ul>
     * <li>{@code Width}, {@code Height}, and {@code Depth} are the width, height, and depth of the CUDA array (in elements); the following types of CUDA
     * arrays can be allocated:
     * 
     * <ul>
     * <li>A 1D array is allocated if {@code Height} and {@code Depth} extents are both zero.</li>
     * <li>A 2D array is allocated if only {@code Depth} extent is zero.</li>
     * <li>A 3D array is allocated if all three extents are non-zero.</li>
     * <li>A 1D layered CUDA array is allocated if only {@code Height} is zero and the {@link #CUDA_ARRAY3D_LAYERED} flag is set. Each layer is a 1D array. The
     * number of layers is determined by the depth extent.</li>
     * <li>A 2D layered CUDA array is allocated if all three extents are non-zero and the {@link #CUDA_ARRAY3D_LAYERED} flag is set. Each layer is a 2D array. The
     * number of layers is determined by the depth extent.</li>
     * <li>A cubemap CUDA array is allocated if all three extents are non-zero and the {@link #CUDA_ARRAY3D_CUBEMAP} flag is set. {@code Width} must be equal to
     * {@code Height}, and {@code Depth} must be six. A cubemap is a special type of 2D layered CUDA array, where the six layers represent the six
     * faces of a cube. The order of the six layers in memory is the same as that listed in {@code CUarray_cubemap_face}.</li>
     * <li>A cubemap layered CUDA array is allocated if all three extents are non-zero, and both, {@link #CUDA_ARRAY3D_CUBEMAP} and {@link #CUDA_ARRAY3D_LAYERED} flags
     * are set. {@code Width} must be equal to {@code Height}, and {@code Depth} must be a multiple of six. A cubemap layered CUDA array is a special
     * type of 2D layered CUDA array that consists of a collection of cubemaps. The first six layers represent the first cubemap, the next six layers
     * form the second cubemap, and so on.</li>
     * </ul></li>
     * <li>{@code Format} specifies the format of the elements.</li>
     * <li>{@code NumChannels} specifies the number of packed components per CUDA array element; it may be 1, 2, or 4;</li>
     * <li>{@code Flags} may be set to
     * 
     * <ul>
     * <li>{@link #CUDA_ARRAY3D_LAYERED} to enable creation of layered CUDA arrays. If this flag is set, {@code Depth} specifies the number of layers, not the
     * depth of a 3D array.</li>
     * <li>{@link #CUDA_ARRAY3D_SURFACE_LDST} to enable surface references to be bound to the CUDA array. If this flag is not set, {@link #cuSurfRefSetArray SurfRefSetArray} will fail
     * when attempting to bind the CUDA array to a surface reference.</li>
     * <li>{@link #CUDA_ARRAY3D_CUBEMAP} to enable creation of cubemaps. If this flag is set, {@code Width} must be equal to {@code Height}, and {@code Depth}
     * must be six. If the {@link #CUDA_ARRAY3D_LAYERED} flag is also set, then {@code Depth} must be a multiple of six.</li>
     * <li>{@link #CUDA_ARRAY3D_TEXTURE_GATHER} to indicate that the CUDA array will be used for texture gather. Texture gather can only be performed on 2D CUDA
     * arrays.</li>
     * </ul></li>
     * </ul>
     * 
     * <p>{@code Width}, {@code Height} and {@code Depth} must meet certain size requirements as listed in the following table. All values are specified in
     * elements. Note that for brevity's sake, the full name of the device attribute is not specified. For ex., TEXTURE1D_WIDTH refers to the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH}.</p>
     * 
     * <p>Note that 2D CUDA arrays have different size requirements if the {@link #CUDA_ARRAY3D_TEXTURE_GATHER} flag is set. {@code Width} and {@code Height} must not
     * be greater than {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH} and {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT} respectively, in that
     * case.</p>
     * 
     * <table>
     * <tr><td><b>CUDA array type</b></td>
     * 
     * <td><b>Valid extents that must always be met<br>{(width range in elements), (height range),
     * (depth range)}</b></td>
     * 
     * <td><b>Valid extents with CUDA_ARRAY3D_SURFACE_LDST set<br>
     * {(width range in elements), (height range), (depth range)}</b></td></tr>
     * <tr><td>1D</td>
     * 
     * <td><small>{ (1,TEXTURE1D_WIDTH), 0, 0 }</small></td>
     * 
     * <td><small>{ (1,SURFACE1D_WIDTH), 0, 0 }</small></td></tr>
     * <tr><td>2D</td>
     * 
     * <td><small>{ (1,TEXTURE2D_WIDTH), (1,TEXTURE2D_HEIGHT), 0 }</small></td>
     * 
     * <td><small>{ (1,SURFACE2D_WIDTH), (1,SURFACE2D_HEIGHT), 0 }</small></td></tr>
     * <tr><td>3D</td>
     * 
     * <td><small>{ (1,TEXTURE3D_WIDTH), (1,TEXTURE3D_HEIGHT), (1,TEXTURE3D_DEPTH) }
     * <br>OR<br>{ (1,TEXTURE3D_WIDTH_ALTERNATE), (1,TEXTURE3D_HEIGHT_ALTERNATE),
     * (1,TEXTURE3D_DEPTH_ALTERNATE) }</small></td>
     * 
     * <td><small>{ (1,SURFACE3D_WIDTH), (1,SURFACE3D_HEIGHT),
     * (1,SURFACE3D_DEPTH) }</small></td></tr>
     * <tr><td>1D Layered</td>
     * 
     * <td><small>{ (1,TEXTURE1D_LAYERED_WIDTH), 0,
     * (1,TEXTURE1D_LAYERED_LAYERS) }</small></td>
     * 
     * <td><small>{ (1,SURFACE1D_LAYERED_WIDTH), 0,
     * (1,SURFACE1D_LAYERED_LAYERS) }</small></td></tr>
     * <tr><td>2D Layered</td>
     * 
     * <td><small>{ (1,TEXTURE2D_LAYERED_WIDTH), (1,TEXTURE2D_LAYERED_HEIGHT),
     * (1,TEXTURE2D_LAYERED_LAYERS) }</small></td>
     * 
     * <td><small>{ (1,SURFACE2D_LAYERED_WIDTH), (1,SURFACE2D_LAYERED_HEIGHT),
     * (1,SURFACE2D_LAYERED_LAYERS) }</small></td></tr>
     * <tr><td>Cubemap</td>
     * 
     * <td><small>{ (1,TEXTURECUBEMAP_WIDTH), (1,TEXTURECUBEMAP_WIDTH), 6 }</small></td>
     * 
     * <td><small>{ (1,SURFACECUBEMAP_WIDTH),
     * (1,SURFACECUBEMAP_WIDTH), 6 }</small></td></tr>
     * <tr><td>Cubemap Layered</td>
     * 
     * <td><small>{ (1,TEXTURECUBEMAP_LAYERED_WIDTH), (1,TEXTURECUBEMAP_LAYERED_WIDTH),
     * (1,TEXTURECUBEMAP_LAYERED_LAYERS) }</small></td>
     * 
     * <td><small>{ (1,SURFACECUBEMAP_LAYERED_WIDTH), (1,SURFACECUBEMAP_LAYERED_WIDTH),
     * (1,SURFACECUBEMAP_LAYERED_LAYERS) }</small></td></tr>
     * </table>
     *
     * @param pHandle        returned array
     * @param pAllocateArray 3D array descriptor
     */
    @NativeType("CUresult")
    public static int cuArray3DCreate(@NativeType("CUarray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY3D_DESCRIPTOR const *") CUDA_ARRAY3D_DESCRIPTOR pAllocateArray) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuArray3DCreate(memAddress(pHandle), pAllocateArray.address());
    }

    // --- [ cuArray3DGetDescriptor ] ---

    /** Unsafe version of: {@link #cuArray3DGetDescriptor Array3DGetDescriptor} */
    public static int ncuArray3DGetDescriptor(long pArrayDescriptor, long hArray) {
        long __functionAddress = Functions.Array3DGetDescriptor;
        if (CHECKS) {
            check(hArray);
        }
        return callPPI(pArrayDescriptor, hArray, __functionAddress);
    }

    /**
     * Get a 3D CUDA array descriptor.
     * 
     * <p>Returns in {@code *pArrayDescriptor} a descriptor containing information on the format and dimensions of the CUDA array {@code hArray}. It is useful
     * for subroutines that have been passed a CUDA array, but need to know the CUDA array parameters for validation or other purposes.</p>
     * 
     * <p>This function may be called on 1D and 2D arrays, in which case the {@code Height} and/or {@code Depth} members of the descriptor struct will be set to
     * 0.</p>
     *
     * @param pArrayDescriptor returned 3D array descriptor
     * @param hArray           3D array to get descriptor of
     */
    @NativeType("CUresult")
    public static int cuArray3DGetDescriptor(@NativeType("CUDA_ARRAY3D_DESCRIPTOR *") CUDA_ARRAY3D_DESCRIPTOR pArrayDescriptor, @NativeType("CUarray") long hArray) {
        return ncuArray3DGetDescriptor(pArrayDescriptor.address(), hArray);
    }

    // --- [ cuMipmappedArrayCreate ] ---

    /** Unsafe version of: {@link #cuMipmappedArrayCreate MipmappedArrayCreate} */
    public static int ncuMipmappedArrayCreate(long pHandle, long pMipmappedArrayDesc, int numMipmapLevels) {
        long __functionAddress = Functions.MipmappedArrayCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pHandle, pMipmappedArrayDesc, numMipmapLevels, __functionAddress);
    }

    /**
     * Creates a CUDA mipmapped array.
     * 
     * <p>Creates a CUDA mipmapped array according to the {@link CUDA_ARRAY3D_DESCRIPTOR} structure {@code pMipmappedArrayDesc} and returns a handle to the new CUDA
     * mipmapped array in {@code *pHandle}. {@code numMipmapLevels} specifies the number of mipmap levels to be allocated. This value is clamped to the range
     * {@code [1, 1 + floor(log2(max(width, height, depth)))]}.</p>
     * 
     * <ul>
     * <li>{@code Width}, {@code Height}, and {@code Depth} are the width, height, and depth of the CUDA array (in elements); the following types of CUDA
     * arrays can be allocated:
     * 
     * <ul>
     * <li>A 1D mipmapped array is allocated if {@code Height} and {@code Depth} extents are both zero.</li>
     * <li>A 2D mipmapped array is allocated if only {@code Depth} extent is zero.</li>
     * <li>A 3D mipmapped array is allocated if all three extents are non-zero.</li>
     * <li>A 1D layered CUDA mipmapped array is allocated if only {@code Height} is zero and the {@link #CUDA_ARRAY3D_LAYERED} flag is set. Each layer is a 1D
     * array. The number of layers is determined by the depth extent.</li>
     * <li>A 2D layered CUDA mipmapped array is allocated if all three extents are non-zero and the {@link #CUDA_ARRAY3D_LAYERED} flag is set. Each layer is a 2D
     * array. The number of layers is determined by the depth extent.</li>
     * <li>A cubemap CUDA mipmapped array is allocated if all three extents are non-zero and the {@link #CUDA_ARRAY3D_CUBEMAP} flag is set. {@code Width} must be
     * equal to {@code Height}, and {@code Depth} must be six. A cubemap is a special type of 2D layered CUDA array, where the six layers represent
     * the six faces of a cube. The order of the six layers in memory is the same as that listed in {@code CUarray_cubemap_face}.</li>
     * <li>A cubemap layered CUDA mipmapped array is allocated if all three extents are non-zero, and both, {@link #CUDA_ARRAY3D_CUBEMAP} and
     * {@link #CUDA_ARRAY3D_LAYERED} flags are set. {@code Width} must be equal to {@code Height}, and {@code Depth} must be a multiple of six. A cubemap
     * layered CUDA array is a special type of 2D layered CUDA array that consists of a collection of cubemaps. The first six layers represent the
     * first cubemap, the next six layers form the second cubemap, and so on.</li>
     * </ul></li>
     * <li>{@code Format} specifies the format of the elements.</li>
     * <li>{@code NumChannels} specifies the number of packed components per CUDA array element; it may be 1, 2, or 4;</li>
     * <li>Flags may be set to:
     * 
     * <ul>
     * <li>{@link #CUDA_ARRAY3D_LAYERED} to enable creation of layered CUDA mipmapped arrays. If this flag is set, {@code Depth} specifies the number of layers,
     * not the depth of a 3D array.</li>
     * <li>{@link #CUDA_ARRAY3D_SURFACE_LDST} to enable surface references to be bound to individual mipmap levels of the CUDA mipmapped array. If this flag is
     * not set, {@link #cuSurfRefSetArray SurfRefSetArray} will fail when attempting to bind a mipmap level of the CUDA mipmapped array to a surface reference.</li>
     * <li>{@link #CUDA_ARRAY3D_CUBEMAP} to enable creation of mipmapped cubemaps. If this flag is set, {@code Width} must be equal to {@code Height}, and
     * {@code Depth} must be six. If the {@link #CUDA_ARRAY3D_LAYERED} flag is also set, then {@code Depth} must be a multiple of six.</li>
     * <li>{@link #CUDA_ARRAY3D_TEXTURE_GATHER} to indicate that the CUDA mipmapped array will be used for texture gather. Texture gather can only be performed on
     * 2D CUDA mipmapped arrays.</li>
     * </ul></li>
     * </ul>
     * 
     * <p>{@code Width}, {@code Height} and {@code Depth} must meet certain size requirements as listed in the following table. All values are specified in
     * elements. Note that for brevity's sake, the full name of the device attribute is not specified. For ex., {@code TEXTURE1D_MIPMAPPED_WIDTH} refers to
     * the device attribute {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH}.</p>
     * 
     * <table>
     * <tr><td><b>CUDA array type</b></td>
     * 
     * <td><b>Valid extents that must always be met<br>{(width range in elements), (height range),
     * (depth range)}</b></td>
     * 
     * <td><b>Valid extents with CUDA_ARRAY3D_SURFACE_LDST set<br>
     * {(width range in elements), (height range), (depth range)}</b></td></tr>
     * <tr><td>1D</td>
     * 
     * <td><small>{ (1,TEXTURE1D_MIPMAPPED_WIDTH), 0, 0 }</small></td>
     * 
     * <td><small>{ (1,SURFACE1D_WIDTH), 0, 0 }</small></td></tr>
     * <tr><td>2D</td>
     * 
     * <td><small>{ (1,TEXTURE2D_MIPMAPPED_WIDTH), (1,TEXTURE2D_MIPMAPPED_HEIGHT), 0 }</small></td>
     * 
     * <td><small>{ (1,SURFACE2D_WIDTH), (1,SURFACE2D_HEIGHT), 0 }</small></td></tr>
     * <tr><td>3D</td>
     * 
     * <td><small>{ (1,TEXTURE3D_WIDTH), (1,TEXTURE3D_HEIGHT), (1,TEXTURE3D_DEPTH) }
     * <br>OR<br>{ (1,TEXTURE3D_WIDTH_ALTERNATE), (1,TEXTURE3D_HEIGHT_ALTERNATE),
     * (1,TEXTURE3D_DEPTH_ALTERNATE) }</small></td>
     * 
     * <td><small>{ (1,SURFACE3D_WIDTH), (1,SURFACE3D_HEIGHT),
     * (1,SURFACE3D_DEPTH) }</small></td></tr>
     * <tr><td>1D Layered</td>
     * 
     * <td><small>{ (1,TEXTURE1D_LAYERED_WIDTH), 0,
     * (1,TEXTURE1D_LAYERED_LAYERS) }</small></td>
     * 
     * <td><small>{ (1,SURFACE1D_LAYERED_WIDTH), 0,
     * (1,SURFACE1D_LAYERED_LAYERS) }</small></td></tr>
     * <tr><td>2D Layered</td>
     * 
     * <td><small>{ (1,TEXTURE2D_LAYERED_WIDTH), (1,TEXTURE2D_LAYERED_HEIGHT),
     * (1,TEXTURE2D_LAYERED_LAYERS) }</small></td>
     * 
     * <td><small>{ (1,SURFACE2D_LAYERED_WIDTH), (1,SURFACE2D_LAYERED_HEIGHT),
     * (1,SURFACE2D_LAYERED_LAYERS) }</small></td></tr>
     * <tr><td>Cubemap</td>
     * 
     * <td><small>{ (1,TEXTURECUBEMAP_WIDTH), (1,TEXTURECUBEMAP_WIDTH), 6 }</small></td>
     * 
     * <td><small>{ (1,SURFACECUBEMAP_WIDTH),
     * (1,SURFACECUBEMAP_WIDTH), 6 }</small></td></tr>
     * <tr><td>Cubemap Layered</td>
     * 
     * <td><small>{ (1,TEXTURECUBEMAP_LAYERED_WIDTH), (1,TEXTURECUBEMAP_LAYERED_WIDTH),
     * (1,TEXTURECUBEMAP_LAYERED_LAYERS) }</small></td>
     * 
     * <td><small>{ (1,SURFACECUBEMAP_LAYERED_WIDTH), (1,SURFACECUBEMAP_LAYERED_WIDTH),
     * (1,SURFACECUBEMAP_LAYERED_LAYERS) }</small></td></tr>
     * </table>
     *
     * @param pHandle             returned mipmapped array
     * @param pMipmappedArrayDesc mipmapped array descriptor
     * @param numMipmapLevels     number of mipmap levels
     */
    @NativeType("CUresult")
    public static int cuMipmappedArrayCreate(@NativeType("CUmipmappedArray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY3D_DESCRIPTOR const *") CUDA_ARRAY3D_DESCRIPTOR pMipmappedArrayDesc, @NativeType("unsigned int") int numMipmapLevels) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuMipmappedArrayCreate(memAddress(pHandle), pMipmappedArrayDesc.address(), numMipmapLevels);
    }

    // --- [ cuMipmappedArrayGetLevel ] ---

    /** Unsafe version of: {@link #cuMipmappedArrayGetLevel MipmappedArrayGetLevel} */
    public static int ncuMipmappedArrayGetLevel(long pLevelArray, long hMipmappedArray, int level) {
        long __functionAddress = Functions.MipmappedArrayGetLevel;
        if (CHECKS) {
            check(__functionAddress);
            check(hMipmappedArray);
        }
        return callPPI(pLevelArray, hMipmappedArray, level, __functionAddress);
    }

    /**
     * Gets a mipmap level of a CUDA mipmapped array.
     * 
     * <p>Returns in {@code *pLevelArray} a CUDA array that represents a single mipmap level of the CUDA mipmapped array {@code hMipmappedArray}.</p>
     * 
     * <p>If {@code level} is greater than the maximum number of levels in this mipmapped array, {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     *
     * @param pLevelArray     returned mipmap level CUDA array
     * @param hMipmappedArray CUDA mipmapped array
     * @param level           mipmap level
     */
    @NativeType("CUresult")
    public static int cuMipmappedArrayGetLevel(@NativeType("CUarray *") PointerBuffer pLevelArray, @NativeType("CUmipmappedArray") long hMipmappedArray, @NativeType("unsigned int") int level) {
        if (CHECKS) {
            check(pLevelArray, 1);
        }
        return ncuMipmappedArrayGetLevel(memAddress(pLevelArray), hMipmappedArray, level);
    }

    // --- [ cuMipmappedArrayDestroy ] ---

    /**
     * Destroys a CUDA mipmapped array.
     * 
     * <p>Destroys the CUDA mipmapped array {@code hMipmappedArray}.</p>
     *
     * @param hMipmappedArray mipmapped array to destroy
     */
    @NativeType("CUresult")
    public static int cuMipmappedArrayDestroy(@NativeType("CUmipmappedArray") long hMipmappedArray) {
        long __functionAddress = Functions.MipmappedArrayDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(hMipmappedArray);
        }
        return callPI(hMipmappedArray, __functionAddress);
    }

    // --- [ cuMemAddressReserve ] ---

    /** Unsafe version of: {@link #cuMemAddressReserve MemAddressReserve} */
    public static int ncuMemAddressReserve(long ptr, long size, long alignment, long addr, long flags) {
        long __functionAddress = Functions.MemAddressReserve;
        if (CHECKS) {
            check(__functionAddress);
            check(addr);
        }
        return callPPPPJI(ptr, size, alignment, addr, flags, __functionAddress);
    }

    /**
     * Allocate an address range reservation.
     * 
     * <p>Reserves a virtual address range based on the given parameters, giving the starting address of the range in {@code ptr}. This API requires a system
     * that supports UVA. The size and address parameters must be a multiple of the host page size and the alignment must be a power of two or zero for
     * default alignment.</p>
     *
     * @param ptr       resulting pointer to start of virtual address range allocated
     * @param size      size of the reserved virtual address range requested
     * @param alignment alignment of the reserved virtual address range requested
     * @param addr      fixed starting address range requested
     * @param flags     currently unused, must be zero
     */
    @NativeType("CUresult")
    public static int cuMemAddressReserve(@NativeType("CUdeviceptr *") PointerBuffer ptr, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("CUdeviceptr") long addr, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(ptr, 1);
        }
        return ncuMemAddressReserve(memAddress(ptr), size, alignment, addr, flags);
    }

    // --- [ cuMemAddressFree ] ---

    /**
     * Free an address range reservation.
     * 
     * <p>Frees a virtual address range reserved by {@link #cuMemAddressReserve MemAddressReserve}. The size must match what was given to {@code memAddressReserve} and the ptr given must
     * match what was returned from {@code memAddressReserve}.</p>
     *
     * @param ptr  starting address of the virtual address range to free
     * @param size size of the virtual address region to free
     */
    @NativeType("CUresult")
    public static int cuMemAddressFree(@NativeType("CUdeviceptr") long ptr, @NativeType("size_t") long size) {
        long __functionAddress = Functions.MemAddressFree;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(ptr, size, __functionAddress);
    }

    // --- [ cuMemCreate ] ---

    /** Unsafe version of: {@link #cuMemCreate MemCreate} */
    public static int ncuMemCreate(long handle, long size, long prop, long flags) {
        long __functionAddress = Functions.MemCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPJI(handle, size, prop, flags, __functionAddress);
    }

    /**
     * Create a CUDA memory handle representing a memory allocation of a given size described by the given properties.
     * 
     * <p>This creates a memory allocation on the target device specified through the {@code prop} strcuture. The created allocation will not have any device or
     * host mappings. The generic memory {@code handle} for the allocation can be mapped to the address space of calling process via {@link #cuMemMap MemMap}. This handle
     * cannot be transmitted directly to other processes (see {@link #cuMemExportToShareableHandle MemExportToShareableHandle}). On Windows, the caller must also pass an
     * {@code LPSECURITYATTRIBUTE} in {@code prop} to be associated with this handle which limits or allows access to this handle for a recepient process (see
     * {@link CUmemAllocationProp}{@code ::win32HandleMetaData} for more). The {@code size} of this allocation must be a multiple of the the value given via
     * {@link #cuMemGetAllocationGranularity MemGetAllocationGranularity} with the {@link #CU_MEM_ALLOC_GRANULARITY_MINIMUM MEM_ALLOC_GRANULARITY_MINIMUM} flag. If {@link CUmemAllocationProp}{@code ::allocFlags::usage} contains
     * {@link #CU_MEM_CREATE_USAGE_TILE_POOL MEM_CREATE_USAGE_TILE_POOL} flag then the memory allocation is intended only to be used as backing tile pool for sparse CUDA arrays and sparse CUDA
     * mipmapped arrays. (see {@link #cuMemMapArrayAsync MemMapArrayAsync}).</p>
     *
     * @param handle value of handle returned. All operations on this allocation are to be performed using this handle.
     * @param size   size of the allocation requested
     * @param prop   properties of the allocation to create
     * @param flags  flags for future use, must be zero now
     */
    @NativeType("CUresult")
    public static int cuMemCreate(@NativeType("CUmemGenericAllocationHandle *") LongBuffer handle, @NativeType("size_t") long size, @NativeType("CUmemAllocationProp const *") CUmemAllocationProp prop, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(handle, 1);
        }
        return ncuMemCreate(memAddress(handle), size, prop.address(), flags);
    }

    // --- [ cuMemRelease ] ---

    /**
     * Release a memory handle representing a memory allocation which was previously allocated through {@link #cuMemCreate MemCreate}.
     * 
     * <p>Frees the memory that was allocated on a device through {@code cuMemCreate}.</p>
     * 
     * <p>The memory allocation will be freed when all outstanding mappings to the memory are unmapped and when all outstanding references to the handle
     * (including it's shareable counterparts) are also released. The generic memory handle can be freed when there are still outstanding mappings made with
     * this handle. Each time a recepient process imports a shareable handle, it needs to pair it with {@link #cuMemRelease MemRelease} for the handle to be freed. If {@code
     * handle} is not a valid handle the behavior is undefined.</p>
     *
     * @param handle value of handle which was returned previously by {@code cuMemCreate}
     */
    @NativeType("CUresult")
    public static int cuMemRelease(@NativeType("CUmemGenericAllocationHandle") long handle) {
        long __functionAddress = Functions.MemRelease;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(handle, __functionAddress);
    }

    // --- [ cuMemMap ] ---

    /**
     * Maps an allocation handle to a reserved virtual address range.
     * 
     * <p>Maps bytes of memory represented by {@code handle} starting from byte {@code offset} to {@code size} to address range [ {@code addr}, {@code addr} +
     * {@code size]}. This range must be an address reservation previously reserved with {@link #cuMemAddressReserve MemAddressReserve}, and {@code offset} + {@code size} must be less
     * than the size of the memory allocation. Both {@code ptr}, {@code size}, and {@code offset} must be a multiple of the value given via
     * {@link #cuMemGetAllocationGranularity MemGetAllocationGranularity} with the {@link #CU_MEM_ALLOC_GRANULARITY_MINIMUM MEM_ALLOC_GRANULARITY_MINIMUM} flag.</p>
     * 
     * <p>Please note calling {@link #cuMemMap MemMap} does not make the address accessible, the caller needs to update accessibility of a contiguous mapped VA range by
     * calling {@link #cuMemSetAccess MemSetAccess}.</p>
     * 
     * <p>Once a recipient process obtains a shareable memory handle from {@link #cuMemImportFromShareableHandle MemImportFromShareableHandle}, the process must use {@link #cuMemMap MemMap} to map the memory
     * into its address ranges before setting accessibility with {@link #cuMemSetAccess MemSetAccess}.</p>
     * 
     * <p>{@link #cuMemMap MemMap} can only create mappings on VA range reservations that are not currently mapped.</p>
     *
     * @param ptr    address where memory will be mapped
     * @param size   size of the memory mapping
     * @param offset offset into the memory represented by - {@code handle} from which to start mapping - Note: currently must be zero
     * @param handle handle to a shareable memory
     * @param flags  flags for future use, must be zero now
     */
    @NativeType("CUresult")
    public static int cuMemMap(@NativeType("CUdeviceptr") long ptr, @NativeType("size_t") long size, @NativeType("size_t") long offset, @NativeType("CUmemGenericAllocationHandle") long handle, @NativeType("unsigned long long") long flags) {
        long __functionAddress = Functions.MemMap;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPJJI(ptr, size, offset, handle, flags, __functionAddress);
    }

    // --- [ cuMemMapArrayAsync ] ---

    /**
     * Unsafe version of: {@link #cuMemMapArrayAsync MemMapArrayAsync}
     *
     * @param count count of {@code CUarrayMapInfo} in {@code mapInfoList}
     */
    public static int ncuMemMapArrayAsync(long mapInfoList, int count, long hStream) {
        long __functionAddress = Functions.MemMapArrayAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mapInfoList, count, hStream, __functionAddress);
    }

    /**
     * Maps or unmaps subregions of sparse CUDA arrays and sparse CUDA mipmapped arrays.
     * 
     * <p>Performs map or unmap operations on subregions of sparse CUDA arrays and sparse CUDA mipmapped arrays. Each operation is specified by a
     * {@link CUarrayMapInfo} entry in the {@code mapInfoList} array of size {@code count}.</p>
     * 
     * <p>where {@code CUarrayMapInfo::resourceType} specifies the type of resource to be operated on. If {@code CUarrayMapInfo::resourceType} is set to
     * {@link #CU_RESOURCE_TYPE_ARRAY RESOURCE_TYPE_ARRAY} then {@code CUarrayMapInfo::resource::array} must be set to a valid sparse CUDA array handle. The CUDA array must be
     * either a 2D, 2D layered or 3D CUDA array and must have been allocated using {@link #cuArrayCreate ArrayCreate} or {@link #cuArray3DCreate Array3DCreate} with the flag {@link #CUDA_ARRAY3D_SPARSE}.
     * For CUDA arrays obtained using {@link #cuMipmappedArrayGetLevel MipmappedArrayGetLevel}, {@link #CUDA_ERROR_INVALID_VALUE} will be returned. If {@code CUarrayMapInfo::resourceType} is set to
     * {@link #CU_RESOURCE_TYPE_MIPMAPPED_ARRAY RESOURCE_TYPE_MIPMAPPED_ARRAY} then {@code CUarrayMapInfo::resource::mipmap} must be set to a valid sparse CUDA mipmapped array handle.
     * The CUDA mipmapped array must be either a 2D, 2D layered or 3D CUDA mipmapped array and must have been allocated using {@link #cuMipmappedArrayCreate MipmappedArrayCreate} with
     * the flag {@link #CUDA_ARRAY3D_SPARSE}.</p>
     * 
     * <p>{@code CUarrayMapInfo::subresourceType} specifies the type of subresource within the resource.</p>
     * 
     * <p>where {@link #CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL} indicates a sparse-miplevel which spans at least one tile in every dimension. The remaining miplevels
     * which are too small to span at least one tile in any dimension constitute the mip tail region as indicated by {@link #CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL}
     * subresource type.</p>
     * 
     * <p>If {@code CUarrayMapInfo::subresourceType} is set to {@link #CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL} then
     * {@code CUarrayMapInfo::subresource::sparseLevel} struct must contain valid array subregion offsets and extents. The
     * {@code CUarrayMapInfo::subresource::sparseLevel::offsetX}, {@code CUarrayMapInfo::subresource::sparseLevel::offsetY} and
     * {@code CUarrayMapInfo::subresource::sparseLevel::offsetZ} must specify valid X, Y and Z offsets respectively. The
     * {@code CUarrayMapInfo::subresource::sparseLevel::extentWidth}, {@code CUarrayMapInfo::subresource::sparseLevel::extentHeight} and
     * {@code CUarrayMapInfo::subresource::sparseLevel::extentDepth} must specify valid width, height and depth extents respectively. These offsets and
     * extents must be aligned to the corresponding tile dimension. For CUDA mipmapped arrays {@code CUarrayMapInfo::subresource::sparseLevel::level} must
     * specify a valid mip level index. Otherwise, must be zero. For layered CUDA arrays and layered CUDA mipmapped arrays
     * {@code CUarrayMapInfo::subresource::sparseLevel::layer} must specify a valid layer index. Otherwise, must be zero.
     * {@code CUarrayMapInfo::subresource::sparseLevel::offsetZ} must be zero and {@code CUarrayMapInfo::subresource::sparseLevel::extentDepth} must be set to
     * 1 for 2D and 2D layered CUDA arrays and CUDA mipmapped arrays. Tile extents can be obtained by calling {@link #cuArrayGetSparseProperties ArrayGetSparseProperties} and
     * {@link #cuMipmappedArrayGetSparseProperties MipmappedArrayGetSparseProperties}</p>
     * 
     * <p>If {@code CUarrayMapInfo::subresourceType} is set to {@link #CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL} then {@code CUarrayMapInfo::subresource::miptail} struct
     * must contain valid mip tail offset in {@code CUarrayMapInfo::subresource::miptail::offset} and size in
     * {@code CUarrayMapInfo::subresource::miptail::size}. Both, mip tail offset and mip tail size must be aligned to the tile size. For layered CUDA
     * mipmapped arrays which don't have the flag {@link #CU_ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL} set in {@link CUDA_ARRAY_SPARSE_PROPERTIES}{@code ::flags} as returned by
     * {@link #cuMipmappedArrayGetSparseProperties MipmappedArrayGetSparseProperties}, {@code CUarrayMapInfo::subresource::miptail::layer} must specify a valid layer index. Otherwise, must be zero.</p>
     * 
     * <p>{@code CUarrayMapInfo::memOperationType} specifies the type of operation.</p>
     * 
     * <p>If {@code CUarrayMapInfo::memOperationType} is set to {@link #CU_MEM_OPERATION_TYPE_MAP MEM_OPERATION_TYPE_MAP} then the subresource will be mapped onto the tile pool memory specified
     * by {@code CUarrayMapInfo::memHandle} at offset {@code CUarrayMapInfo::offset}. The tile pool allocation has to be created by specifying the
     * {@link #CU_MEM_CREATE_USAGE_TILE_POOL MEM_CREATE_USAGE_TILE_POOL} flag when calling {@link #cuMemCreate MemCreate}. Also, {@code CUarrayMapInfo::memHandleType} must be set to {@link #CU_MEM_HANDLE_TYPE_GENERIC MEM_HANDLE_TYPE_GENERIC}.</p>
     * 
     * <p>If {@code CUarrayMapInfo::memOperationType} is set to {@link #CU_MEM_OPERATION_TYPE_UNMAP MEM_OPERATION_TYPE_UNMAP} then an unmapping operation is performed.
     * {@code CUarrayMapInfo::memHandle} must be NULL.</p>
     * 
     * <p>{@code CUarrayMapInfo::deviceBitMask} specifies the list of devices that must map or unmap physical memory. Currently, this mask must have exactly one
     * bit set, and the corresponding device must match the device associated with the stream. If {@code CUarrayMapInfo::memOperationType} is set to
     * {@link #CU_MEM_OPERATION_TYPE_MAP MEM_OPERATION_TYPE_MAP}, the device must also match the device associated with the tile pool memory allocation as specified by
     * {@code CUarrayMapInfo::memHandle}.</p>
     * 
     * <p>{@code CUarrayMapInfo::flags} and {@code CUarrayMapInfo::reserved[]} are unused and must be set to zero.</p>
     *
     * @param mapInfoList list of {@code CUarrayMapInfo}
     * @param hStream     stream identifier for the stream to use for map or unmap operations
     */
    @NativeType("CUresult")
    public static int cuMemMapArrayAsync(@NativeType("CUarrayMapInfo *") CUarrayMapInfo.Buffer mapInfoList, @NativeType("CUstream") long hStream) {
        return ncuMemMapArrayAsync(mapInfoList.address(), mapInfoList.remaining(), hStream);
    }

    // --- [ cuMemUnmap ] ---

    /**
     * Unmap the backing memory of a given address range.
     * 
     * <p>The range must be the entire contiguous address range that was mapped to. In other words, {@link #cuMemUnmap MemUnmap} cannot unmap a sub-range of an address range
     * mapped by {@link #cuMemCreate MemCreate} / {@link #cuMemMap MemMap}. Any backing memory allocations will be freed if there are no existing mappings and there are no unreleased memory
     * handles.</p>
     * 
     * <p>When {@link #cuMemUnmap MemUnmap} returns successfully the address range is converted to an address reservation and can be used for a future calls to {@link #cuMemMap MemMap}. Any
     * new mapping to this virtual address will need to have access granted through {@link #cuMemSetAccess MemSetAccess}, as all mappings start with no accessibility setup.</p>
     *
     * @param ptr  starting address for the virtual address range to unmap
     * @param size size of the virtual address range to unmap
     */
    @NativeType("CUresult")
    public static int cuMemUnmap(@NativeType("CUdeviceptr") long ptr, @NativeType("size_t") long size) {
        long __functionAddress = Functions.MemUnmap;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(ptr, size, __functionAddress);
    }

    // --- [ cuMemSetAccess ] ---

    /**
     * Unsafe version of: {@link #cuMemSetAccess MemSetAccess}
     *
     * @param count number of {@code CUmemAccessDesc} in {@code desc}
     */
    public static int ncuMemSetAccess(long ptr, long size, long desc, long count) {
        long __functionAddress = Functions.MemSetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPPI(ptr, size, desc, count, __functionAddress);
    }

    /**
     * Set the access flags for each location specified in {@code desc} for the given virtual address range.
     * 
     * <p>Given the virtual address range via {@code ptr} and {@code size}, and the locations in the array given by {@code desc} and {@code count}, set the
     * access flags for the target locations. The range must be a fully mapped address range containing all allocations created by {@link #cuMemMap MemMap} / {@link #cuMemCreate MemCreate}.</p>
     *
     * @param ptr  starting address for the virtual address range
     * @param size length of the virtual address range
     * @param desc array of {@code CUmemAccessDesc} that describe how to change the - mapping for each location specified
     */
    @NativeType("CUresult")
    public static int cuMemSetAccess(@NativeType("CUdeviceptr") long ptr, @NativeType("size_t") long size, @NativeType("CUmemAccessDesc const *") CUmemAccessDesc.Buffer desc) {
        return ncuMemSetAccess(ptr, size, desc.address(), desc.remaining());
    }

    // --- [ cuMemGetAccess ] ---

    /** Unsafe version of: {@link #cuMemGetAccess MemGetAccess} */
    public static int ncuMemGetAccess(long flags, long location, long ptr) {
        long __functionAddress = Functions.MemGetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPI(flags, location, ptr, __functionAddress);
    }

    /**
     * Get the access {@code flags} set for the given {@code location} and {@code ptr}.
     *
     * @param flags    flags set for this location
     * @param location location in which to check the flags for
     * @param ptr      address in which to check the access flags for
     */
    @NativeType("CUresult")
    public static int cuMemGetAccess(@NativeType("unsigned long long *") LongBuffer flags, @NativeType("CUmemLocation const *") CUmemLocation location, @NativeType("CUdeviceptr") long ptr) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuMemGetAccess(memAddress(flags), location.address(), ptr);
    }

    // --- [ cuMemExportToShareableHandle ] ---

    /** Unsafe version of: {@link #cuMemExportToShareableHandle MemExportToShareableHandle} */
    public static int ncuMemExportToShareableHandle(long shareableHandle, long handle, int handleType, long flags) {
        long __functionAddress = Functions.MemExportToShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(shareableHandle, handle, handleType, flags, __functionAddress);
    }

    /**
     * Exports an allocation to a requested shareable handle type.
     * 
     * <p>Given a CUDA memory handle, create a shareable memory allocation handle that can be used to share the memory with other processes. The recipient
     * process can convert the shareable handle back into a CUDA memory handle using {@link #cuMemImportFromShareableHandle MemImportFromShareableHandle} and map it with {@link #cuMemMap MemMap}. The
     * implementation of what this handle is and how it can be transferred is defined by the requested handle type in {@code handleType}.</p>
     * 
     * <p>Once all shareable handles are closed and the allocation is released, the allocated memory referenced will be released back to the OS and uses of the
     * CUDA handle afterward will lead to undefined behavior.</p>
     * 
     * <p>This API can also be used in conjunction with other APIs (e.g. Vulkan, OpenGL) that support importing memory from the shareable type</p>
     *
     * @param shareableHandle pointer to the location in which to store the requested handle type
     * @param handle          CUDA handle for the memory allocation
     * @param handleType      type of shareable handle requested (defines type and size of the {@code shareableHandle} output parameter)
     * @param flags           reserved, must be zero
     */
    @NativeType("CUresult")
    public static int cuMemExportToShareableHandle(@NativeType("void *") ByteBuffer shareableHandle, @NativeType("CUmemGenericAllocationHandle") long handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemExportToShareableHandle(memAddress(shareableHandle), handle, handleType, flags);
    }

    /**
     * Exports an allocation to a requested shareable handle type.
     * 
     * <p>Given a CUDA memory handle, create a shareable memory allocation handle that can be used to share the memory with other processes. The recipient
     * process can convert the shareable handle back into a CUDA memory handle using {@link #cuMemImportFromShareableHandle MemImportFromShareableHandle} and map it with {@link #cuMemMap MemMap}. The
     * implementation of what this handle is and how it can be transferred is defined by the requested handle type in {@code handleType}.</p>
     * 
     * <p>Once all shareable handles are closed and the allocation is released, the allocated memory referenced will be released back to the OS and uses of the
     * CUDA handle afterward will lead to undefined behavior.</p>
     * 
     * <p>This API can also be used in conjunction with other APIs (e.g. Vulkan, OpenGL) that support importing memory from the shareable type</p>
     *
     * @param shareableHandle pointer to the location in which to store the requested handle type
     * @param handle          CUDA handle for the memory allocation
     * @param handleType      type of shareable handle requested (defines type and size of the {@code shareableHandle} output parameter)
     * @param flags           reserved, must be zero
     */
    @NativeType("CUresult")
    public static int cuMemExportToShareableHandle(@NativeType("void *") PointerBuffer shareableHandle, @NativeType("CUmemGenericAllocationHandle") long handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemExportToShareableHandle(memAddress(shareableHandle), handle, handleType, flags);
    }

    // --- [ cuMemImportFromShareableHandle ] ---

    /** Unsafe version of: {@link #cuMemImportFromShareableHandle MemImportFromShareableHandle} */
    public static int ncuMemImportFromShareableHandle(long handle, long osHandle, int shHandleType) {
        long __functionAddress = Functions.MemImportFromShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(osHandle);
        }
        return callPPI(handle, osHandle, shHandleType, __functionAddress);
    }

    /**
     * Imports an allocation from a requested shareable handle type.
     * 
     * <p>If the current process cannot support the memory described by this shareable handle, this API will error as {@link #CUDA_ERROR_NOT_SUPPORTED}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Importing shareable handles exported from some graphics APIs(VUlkan, OpenGL, etc) created on devices under an SLI group may not be supported, and thus
     * this API will return {@link #CUDA_ERROR_NOT_SUPPORTED}. There is no guarantee that the contents of {@code handle} will be the same CUDA memory handle for the
     * same given OS shareable handle, or the same underlying allocation.</p>
     * </div>
     *
     * @param handle       CUDA Memory handle for the memory allocation
     * @param osHandle     shareable Handle representing the memory allocation that is to be imported
     * @param shHandleType handle type of the exported handle {@code CUmemAllocationHandleType}
     */
    @NativeType("CUresult")
    public static int cuMemImportFromShareableHandle(@NativeType("CUmemGenericAllocationHandle *") LongBuffer handle, @NativeType("void *") long osHandle, @NativeType("CUmemAllocationHandleType") int shHandleType) {
        if (CHECKS) {
            check(handle, 1);
        }
        return ncuMemImportFromShareableHandle(memAddress(handle), osHandle, shHandleType);
    }

    // --- [ cuMemGetAllocationGranularity ] ---

    /** Unsafe version of: {@link #cuMemGetAllocationGranularity MemGetAllocationGranularity} */
    public static int ncuMemGetAllocationGranularity(long granularity, long prop, int option) {
        long __functionAddress = Functions.MemGetAllocationGranularity;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(granularity, prop, option, __functionAddress);
    }

    /**
     * Calculates either the minimal or recommended granularity.
     * 
     * <p>Calculates either the minimal or recommended granularity for a given allocation specification and returns it in granularity. This granularity can be
     * used as a multiple for alignment, size, or address mapping.</p>
     *
     * @param granularity returned granularity
     * @param prop        property for which to determine the granularity for
     * @param option      determines which granularity to return
     */
    @NativeType("CUresult")
    public static int cuMemGetAllocationGranularity(@NativeType("size_t *") PointerBuffer granularity, @NativeType("CUmemAllocationProp const *") CUmemAllocationProp prop, @NativeType("CUmemAllocationGranularity_flags") int option) {
        if (CHECKS) {
            check(granularity, 1);
        }
        return ncuMemGetAllocationGranularity(memAddress(granularity), prop.address(), option);
    }

    // --- [ cuMemGetAllocationPropertiesFromHandle ] ---

    /** Unsafe version of: {@link #cuMemGetAllocationPropertiesFromHandle MemGetAllocationPropertiesFromHandle} */
    public static int ncuMemGetAllocationPropertiesFromHandle(long prop, long handle) {
        long __functionAddress = Functions.MemGetAllocationPropertiesFromHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(prop, handle, __functionAddress);
    }

    /**
     * Retrieve the contents of the property structure defining properties for this handle.
     *
     * @param prop   pointer to a properties structure which will hold the information about this handle
     * @param handle handle which to perform the query on
     */
    @NativeType("CUresult")
    public static int cuMemGetAllocationPropertiesFromHandle(@NativeType("CUmemAllocationProp *") CUmemAllocationProp prop, @NativeType("CUmemGenericAllocationHandle") long handle) {
        return ncuMemGetAllocationPropertiesFromHandle(prop.address(), handle);
    }

    // --- [ cuMemRetainAllocationHandle ] ---

    /** Unsafe version of: {@link #cuMemRetainAllocationHandle MemRetainAllocationHandle} */
    public static int ncuMemRetainAllocationHandle(long handle, long addr) {
        long __functionAddress = Functions.MemRetainAllocationHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(handle, addr, __functionAddress);
    }

    /**
     * Given an address {@code addr}, returns the allocation handle of the backing memory allocation.
     * 
     * <p>The handle is guaranteed to be the same handle value used to map the memory. If the address requested is not mapped, the function will fail. The
     * returned handle must be released with corresponding number of calls to {@link #cuMemRelease MemRelease}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The address {@code addr}, can be any address in a range previously mapped by {@link #cuMemMap MemMap}, and not necessarily the start address.</p></div>
     *
     * @param handle CUDA Memory handle for the backing memory allocation
     * @param addr   memory address to query, that has been mapped previously
     */
    @NativeType("CUresult")
    public static int cuMemRetainAllocationHandle(@NativeType("CUmemGenericAllocationHandle *") LongBuffer handle, @NativeType("void *") ByteBuffer addr) {
        if (CHECKS) {
            check(handle, 1);
        }
        return ncuMemRetainAllocationHandle(memAddress(handle), memAddress(addr));
    }

    // --- [ cuMemFreeAsync ] ---

    /**
     * Frees memory with stream ordered semantics.
     * 
     * <p>Inserts a free operation into {@code hStream}. The allocation must not be accessed after stream execution reaches the free. After this API returns,
     * accessing the memory from any subsequent work launched on the GPU or querying its pointer attributes results in undefined behavior.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>During stream capture, this function results in the creation of a free node and must therefore be passed the address of a graph
     * allocation.</p></div>
     *
     * @param dptr    memory to free
     * @param hStream the stream establishing the stream ordering contract
     */
    @NativeType("CUresult")
    public static int cuMemFreeAsync(@NativeType("CUdeviceptr") long dptr, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemFreeAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(dptr);
        }
        return callPPI(dptr, hStream, __functionAddress);
    }

    // --- [ cuMemAllocAsync ] ---

    /** Unsafe version of: {@link #cuMemAllocAsync MemAllocAsync} */
    public static int ncuMemAllocAsync(long dptr, long bytesize, long hStream) {
        long __functionAddress = Functions.MemAllocAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(dptr, bytesize, hStream, __functionAddress);
    }

    /**
     * Allocates memory with stream ordered semantics
     * 
     * <p>Inserts an allocation operation into {@code hStream}. A pointer to the allocated memory is returned immediately in {@code *dptr}. The allocation must
     * not be accessed until the the allocation operation completes. The allocation comes from the memory pool current to the stream's device.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default memory pool of a device contains device memory from that device.</p></div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Basic stream ordering allows future work submitted into the same stream to use the allocation. Stream query, stream synchronize, and CUDA
     * events can be used to guarantee that the allocation operation completes before work submitted in a separate stream runs.</p></div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>During stream capture, this function results in the creation of an allocation node. In this case, the allocation is owned by the graph
     * instead of the memory pool. The memory pool's properties are used to set the node's creation parameters.</p></div>
     *
     * @param dptr     returned device pointer
     * @param bytesize number of bytes to allocate
     * @param hStream  the stream establishing the stream ordering contract and the memory pool to allocate from
     */
    @NativeType("CUresult")
    public static int cuMemAllocAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocAsync(memAddress(dptr), bytesize, hStream);
    }

    // --- [ cuMemPoolTrimTo ] ---

    /**
     * Tries to release memory back to the OS.
     * 
     * <p>Releases memory back to the OS until the pool contains fewer than {@code minBytesToKeep} reserved bytes, or there is no more memory that the allocator
     * can safely release. The allocator cannot release OS allocations that back outstanding asynchronous allocations. The OS allocations may happen at
     * different granularity from the user allocations.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Allocations that have not been freed count as outstanding.</p></div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Allocations that have been asynchronously freed but whose completion has not been observed on the host (eg. by a synchronize) can count as
     * outstanding.</p></div>
     *
     * @param pool           the memory pool to trim
     * @param minBytesToKeep if the pool has less than {@code minBytesToKeep} reserved, the {@code TrimTo} operation is a no-op. Otherwise the pool will be guaranteed to have
     *                       at least {@code minBytesToKeep} bytes reserved after the operation.
     */
    @NativeType("CUresult")
    public static int cuMemPoolTrimTo(@NativeType("CUmemoryPool") long pool, @NativeType("size_t") long minBytesToKeep) {
        long __functionAddress = Functions.MemPoolTrimTo;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPI(pool, minBytesToKeep, __functionAddress);
    }

    // --- [ cuMemPoolSetAttribute ] ---

    /** Unsafe version of: {@link #cuMemPoolSetAttribute MemPoolSetAttribute} */
    public static int ncuMemPoolSetAttribute(long pool, int attr, long value) {
        long __functionAddress = Functions.MemPoolSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPI(pool, attr, value, __functionAddress);
    }

    /**
     * Sets attributes of a memory pool.
     *
     * @param pool  the memory pool to modify
     * @param attr  the attribute to modify. One of:<br><table><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH}</td></tr></table>
     * @param value pointer to the value to assign
     */
    @NativeType("CUresult")
    public static int cuMemPoolSetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuMemPoolSetAttribute(pool, attr, memAddress(value));
    }

    /**
     * Sets attributes of a memory pool.
     *
     * @param pool  the memory pool to modify
     * @param attr  the attribute to modify. One of:<br><table><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH}</td></tr></table>
     * @param value pointer to the value to assign
     */
    @NativeType("CUresult")
    public static int cuMemPoolSetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") IntBuffer value) {
        return ncuMemPoolSetAttribute(pool, attr, memAddress(value));
    }

    /**
     * Sets attributes of a memory pool.
     *
     * @param pool  the memory pool to modify
     * @param attr  the attribute to modify. One of:<br><table><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH}</td></tr></table>
     * @param value pointer to the value to assign
     */
    @NativeType("CUresult")
    public static int cuMemPoolSetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuMemPoolSetAttribute(pool, attr, memAddress(value));
    }

    // --- [ cuMemPoolGetAttribute ] ---

    /** Unsafe version of: {@link #cuMemPoolGetAttribute MemPoolGetAttribute} */
    public static int ncuMemPoolGetAttribute(long pool, int attr, long value) {
        long __functionAddress = Functions.MemPoolGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPI(pool, attr, value, __functionAddress);
    }

    /**
     * Gets attributes of a memory pool.
     *
     * @param pool  the memory pool to get attributes of
     * @param attr  the attribute to get. One of:<br><table><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH}</td></tr></table>
     * @param value retrieved value
     */
    @NativeType("CUresult")
    public static int cuMemPoolGetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuMemPoolGetAttribute(pool, attr, memAddress(value));
    }

    /**
     * Gets attributes of a memory pool.
     *
     * @param pool  the memory pool to get attributes of
     * @param attr  the attribute to get. One of:<br><table><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH}</td></tr></table>
     * @param value retrieved value
     */
    @NativeType("CUresult")
    public static int cuMemPoolGetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") IntBuffer value) {
        return ncuMemPoolGetAttribute(pool, attr, memAddress(value));
    }

    /**
     * Gets attributes of a memory pool.
     *
     * @param pool  the memory pool to get attributes of
     * @param attr  the attribute to get. One of:<br><table><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES}</td><td>{@link #CU_MEMPOOL_ATTR_RELEASE_THRESHOLD MEMPOOL_ATTR_RELEASE_THRESHOLD}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT MEMPOOL_ATTR_RESERVED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH MEMPOOL_ATTR_RESERVED_MEM_HIGH}</td></tr><tr><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_CURRENT MEMPOOL_ATTR_USED_MEM_CURRENT}</td><td>{@link #CU_MEMPOOL_ATTR_USED_MEM_HIGH MEMPOOL_ATTR_USED_MEM_HIGH}</td></tr></table>
     * @param value retrieved value
     */
    @NativeType("CUresult")
    public static int cuMemPoolGetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuMemPoolGetAttribute(pool, attr, memAddress(value));
    }

    // --- [ cuMemPoolSetAccess ] ---

    /**
     * Unsafe version of: {@link #cuMemPoolSetAccess MemPoolSetAccess}
     *
     * @param count number of descriptors in the map array
     */
    public static int ncuMemPoolSetAccess(long pool, long map, long count) {
        long __functionAddress = Functions.MemPoolSetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPPI(pool, map, count, __functionAddress);
    }

    /**
     * Controls visibility of pools between devices.
     *
     * @param pool the pool being modified
     * @param map  array of access descriptors. Each descriptor instructs the access to enable for a single gpu.
     */
    @NativeType("CUresult")
    public static int cuMemPoolSetAccess(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemAccessDesc const *") CUmemAccessDesc.Buffer map) {
        return ncuMemPoolSetAccess(pool, map.address(), map.remaining());
    }

    // --- [ cuMemPoolGetAccess ] ---

    /** Unsafe version of: {@link #cuMemPoolGetAccess MemPoolGetAccess} */
    public static int ncuMemPoolGetAccess(long flags, long memPool, long location) {
        long __functionAddress = Functions.MemPoolGetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(memPool);
        }
        return callPPPI(flags, memPool, location, __functionAddress);
    }

    /**
     * Returns the accessibility of a pool from a device.
     * 
     * <p>Returns the accessibility of the pool's memory from the specified location.</p>
     *
     * @param flags    the accessibility of the pool from the specified location
     * @param memPool  the pool being queried
     * @param location the location accessing the pool
     */
    @NativeType("CUresult")
    public static int cuMemPoolGetAccess(@NativeType("CUmemAccess_flags *") IntBuffer flags, @NativeType("CUmemoryPool") long memPool, @NativeType("CUmemLocation *") CUmemLocation location) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuMemPoolGetAccess(memAddress(flags), memPool, location.address());
    }

    // --- [ cuMemPoolCreate ] ---

    /** Unsafe version of: {@link #cuMemPoolCreate MemPoolCreate} */
    public static int ncuMemPoolCreate(long pool, long poolProps) {
        long __functionAddress = Functions.MemPoolCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pool, poolProps, __functionAddress);
    }

    /**
     * Creates a memory pool.
     * 
     * <p>Creates a CUDA memory pool and returns the handle in {@code pool}. The {@code poolProps} determines the properties of the pool such as the backing
     * device and IPC capabilities.</p>
     * 
     * <p>By default, the pool's memory will be accessible from the device it is allocated on.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Specifying {@link #CU_MEM_HANDLE_TYPE_NONE MEM_HANDLE_TYPE_NONE} creates a memory pool that will not support IPC.</p></div>
     */
    @NativeType("CUresult")
    public static int cuMemPoolCreate(@NativeType("CUmemoryPool *") PointerBuffer pool, @NativeType("CUmemPoolProps const *") CUmemPoolProps poolProps) {
        if (CHECKS) {
            check(pool, 1);
        }
        return ncuMemPoolCreate(memAddress(pool), poolProps.address());
    }

    // --- [ cuMemPoolDestroy ] ---

    /**
     * Destroys the specified memory pool.
     * 
     * <p>If any pointers obtained from this pool haven't been freed or the pool has free operations that haven't completed when {@link #cuMemPoolDestroy MemPoolDestroy} is invoked,
     * the function will return immediately and the resources associated with the pool will be released automatically once there are no more outstanding
     * allocations.</p>
     * 
     * <p>Destroying the current mempool of a device sets the default mempool of that device as the current mempool for that device.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>A device's default memory pool cannot be destroyed.</p></div>
     */
    @NativeType("CUresult")
    public static int cuMemPoolDestroy(@NativeType("CUmemoryPool") long pool) {
        long __functionAddress = Functions.MemPoolDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPI(pool, __functionAddress);
    }

    // --- [ cuMemAllocFromPoolAsync ] ---

    /** Unsafe version of: {@link #cuMemAllocFromPoolAsync MemAllocFromPoolAsync} */
    public static int ncuMemAllocFromPoolAsync(long dptr, long bytesize, long pool, long hStream) {
        long __functionAddress = Functions.MemAllocFromPoolAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPPPI(dptr, bytesize, pool, hStream, __functionAddress);
    }

    /**
     * Allocates memory from a specified pool with stream ordered semantics.
     * 
     * <p>Inserts an allocation operation into {@code hStream}. A pointer to the allocated memory is returned immediately in {@code *dptr}. The allocation must
     * not be accessed until the the allocation operation completes. The allocation comes from the specified memory pool.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The specified memory pool may be from a device different than that of the specified {@code hStream}.</p></div>
     * 
     * <ul>
     * <li>Basic stream ordering allows future work submitted into the same stream to use the allocation. Stream query, stream synchronize, and CUDA events
     * can be used to guarantee that the allocation operation completes before work submitted in a separate stream runs.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>During stream capture, this function results in the creation of an allocation node. In this case, the allocation is owned by the graph
     * instead of the memory pool. The memory pool's properties are used to set the node's creation parameters.</p></div>
     *
     * @param dptr     returned device pointer
     * @param bytesize number of bytes to allocate
     * @param pool     the pool to allocate from
     * @param hStream  the stream establishing the stream ordering semantic
     */
    @NativeType("CUresult")
    public static int cuMemAllocFromPoolAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("CUmemoryPool") long pool, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocFromPoolAsync(memAddress(dptr), bytesize, pool, hStream);
    }

    // --- [ cuMemPoolExportToShareableHandle ] ---

    /** Unsafe version of: {@link #cuMemPoolExportToShareableHandle MemPoolExportToShareableHandle} */
    public static int ncuMemPoolExportToShareableHandle(long handle_out, long pool, int handleType, long flags) {
        long __functionAddress = Functions.MemPoolExportToShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPJI(handle_out, pool, handleType, flags, __functionAddress);
    }

    /**
     * Exports a memory pool to the requested handle type.
     * 
     * <p>Given an IPC capable mempool, create an OS handle to share the pool with another process. A recipient process can convert the shareable handle into a
     * mempool with {@link #cuMemPoolImportFromShareableHandle MemPoolImportFromShareableHandle}. Individual pointers can then be shared with the {@link #cuMemPoolExportPointer MemPoolExportPointer} and
     * {@link #cuMemPoolImportPointer MemPoolImportPointer} APIs. The implementation of what the shareable handle is and how it can be transferred is defined by the requested handle
     * type.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>To create an IPC capable mempool, create a mempool with a {@code CUmemAllocationHandleType} other than {@link #CU_MEM_HANDLE_TYPE_NONE MEM_HANDLE_TYPE_NONE}.</p></div>
     *
     * @param handle_out returned OS handle
     * @param pool       pool to export
     * @param handleType the type of handle to create
     * @param flags      must be 0
     */
    @NativeType("CUresult")
    public static int cuMemPoolExportToShareableHandle(@NativeType("void *") ByteBuffer handle_out, @NativeType("CUmemoryPool") long pool, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemPoolExportToShareableHandle(memAddress(handle_out), pool, handleType, flags);
    }

    /**
     * Exports a memory pool to the requested handle type.
     * 
     * <p>Given an IPC capable mempool, create an OS handle to share the pool with another process. A recipient process can convert the shareable handle into a
     * mempool with {@link #cuMemPoolImportFromShareableHandle MemPoolImportFromShareableHandle}. Individual pointers can then be shared with the {@link #cuMemPoolExportPointer MemPoolExportPointer} and
     * {@link #cuMemPoolImportPointer MemPoolImportPointer} APIs. The implementation of what the shareable handle is and how it can be transferred is defined by the requested handle
     * type.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>To create an IPC capable mempool, create a mempool with a {@code CUmemAllocationHandleType} other than {@link #CU_MEM_HANDLE_TYPE_NONE MEM_HANDLE_TYPE_NONE}.</p></div>
     *
     * @param handle_out returned OS handle
     * @param pool       pool to export
     * @param handleType the type of handle to create
     * @param flags      must be 0
     */
    @NativeType("CUresult")
    public static int cuMemPoolExportToShareableHandle(@NativeType("void *") PointerBuffer handle_out, @NativeType("CUmemoryPool") long pool, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemPoolExportToShareableHandle(memAddress(handle_out), pool, handleType, flags);
    }

    // --- [ cuMemPoolImportFromShareableHandle ] ---

    /** Unsafe version of: {@link #cuMemPoolImportFromShareableHandle MemPoolImportFromShareableHandle} */
    public static int ncuMemPoolImportFromShareableHandle(long pool_out, long handle, int handleType, long flags) {
        long __functionAddress = Functions.MemPoolImportFromShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(pool_out, handle, handleType, flags, __functionAddress);
    }

    /**
     * Imports a memory pool from a shared handle.
     * 
     * <p>Specific allocations can be imported from the imported pool with {@link #cuMemPoolImportPointer MemPoolImportPointer}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Imported memory pools do not support creating new allocations. As such imported memory pools may not be used in {@link #cuDeviceSetMemPool DeviceSetMemPool} or
     * {@link #cuMemAllocFromPoolAsync MemAllocFromPoolAsync} calls.</p></div>
     *
     * @param pool_out   returned memory pool
     * @param handle     OS handle of the pool to open
     * @param handleType the type of handle being imported
     * @param flags      must be 0
     */
    @NativeType("CUresult")
    public static int cuMemPoolImportFromShareableHandle(@NativeType("CUmemoryPool *") PointerBuffer pool_out, @NativeType("void *") ByteBuffer handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(pool_out, 1);
        }
        return ncuMemPoolImportFromShareableHandle(memAddress(pool_out), memAddress(handle), handleType, flags);
    }

    /**
     * Imports a memory pool from a shared handle.
     * 
     * <p>Specific allocations can be imported from the imported pool with {@link #cuMemPoolImportPointer MemPoolImportPointer}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Imported memory pools do not support creating new allocations. As such imported memory pools may not be used in {@link #cuDeviceSetMemPool DeviceSetMemPool} or
     * {@link #cuMemAllocFromPoolAsync MemAllocFromPoolAsync} calls.</p></div>
     *
     * @param pool_out   returned memory pool
     * @param handle     OS handle of the pool to open
     * @param handleType the type of handle being imported
     * @param flags      must be 0
     */
    @NativeType("CUresult")
    public static int cuMemPoolImportFromShareableHandle(@NativeType("CUmemoryPool *") PointerBuffer pool_out, @NativeType("void *") PointerBuffer handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(pool_out, 1);
        }
        return ncuMemPoolImportFromShareableHandle(memAddress(pool_out), memAddress(handle), handleType, flags);
    }

    // --- [ cuMemPoolExportPointer ] ---

    /** Unsafe version of: {@link #cuMemPoolExportPointer MemPoolExportPointer} */
    public static int ncuMemPoolExportPointer(long shareData_out, long ptr) {
        long __functionAddress = Functions.MemPoolExportPointer;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(shareData_out, ptr, __functionAddress);
    }

    /**
     * Export data to share a memory pool allocation between processes.
     * 
     * <p>Constructs {@code shareData_out} for sharing a specific allocation from an already shared memory pool. The recipient process can import the allocation
     * with the {@link #cuMemPoolImportPointer MemPoolImportPointer} api. The data is not a handle and may be shared through any IPC mechanism.</p>
     *
     * @param shareData_out returned export data
     * @param ptr           pointer to memory being exported
     */
    @NativeType("CUresult")
    public static int cuMemPoolExportPointer(@NativeType("CUmemPoolPtrExportData *") CUmemPoolPtrExportData shareData_out, @NativeType("CUdeviceptr") long ptr) {
        return ncuMemPoolExportPointer(shareData_out.address(), ptr);
    }

    // --- [ cuMemPoolImportPointer ] ---

    /** Unsafe version of: {@link #cuMemPoolImportPointer MemPoolImportPointer} */
    public static int ncuMemPoolImportPointer(long ptr_out, long pool, long shareData) {
        long __functionAddress = Functions.MemPoolImportPointer;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPPI(ptr_out, pool, shareData, __functionAddress);
    }

    /**
     * Import a memory pool allocation from another process.
     * 
     * <p>Returns in {@code ptr_out} a pointer to the imported memory. The imported memory must not be accessed before the allocation operation completes in the
     * exporting process. The imported memory must be freed from all importing processes before being freed in the exporting process. The pointer may be freed
     * with {@link #cuMemFree MemFree} or {@link #cuMemFreeAsync MemFreeAsync}. If {@code cuMemFreeAsync} is used, the free must be completed on the importing process before the free operation on
     * the exporting process.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code cuMemFreeAsync} api may be used in the exporting process before the cuMemFreeAsync operation completes in its stream as long as
     * the {@code cuMemFreeAsync} in the exporting process specifies a stream with a stream dependency on the importing process's {@code cuMemFreeAsync}.</p></div>
     *
     * @param ptr_out   pointer to imported memory
     * @param pool      pool from which to import
     * @param shareData data specifying the memory to import
     */
    @NativeType("CUresult")
    public static int cuMemPoolImportPointer(@NativeType("CUdeviceptr *") PointerBuffer ptr_out, @NativeType("CUmemoryPool") long pool, @NativeType("CUmemPoolPtrExportData *") CUmemPoolPtrExportData shareData) {
        if (CHECKS) {
            check(ptr_out, 1);
        }
        return ncuMemPoolImportPointer(memAddress(ptr_out), pool, shareData.address());
    }

    // --- [ cuPointerGetAttribute ] ---

    /** Unsafe version of: {@link #cuPointerGetAttribute PointerGetAttribute} */
    public static int ncuPointerGetAttribute(long data, int attribute, long ptr) {
        long __functionAddress = Functions.PointerGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(data, attribute, ptr, __functionAddress);
    }

    /**
     * Returns information about a pointer.
     * 
     * <p>The supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT}: Returns in {@code *data} the {@code CUcontext} in which {@code ptr} was allocated or registered. The type of
     * {@code data} must be {@code CUcontext *}.
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMORY_TYPE POINTER_ATTRIBUTE_MEMORY_TYPE}:
     * 
     * <p>Returns in {@code *data} the physical memory type of the memory that {@code ptr} addresses as a {@code CUmemorytype} enumerated value. The type of
     * {@code data} must be unsigned int.</p>
     * 
     * <p>If {@code ptr} addresses device memory then {@code *data} is set to {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}. The particular {@code CUdevice} on which the memory resides
     * is the {@code CUdevice} of the {@code CUcontext} returned by the {@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT} attribute of {@code ptr}.</p>
     * 
     * <p>If {@code ptr} addresses host memory then {@code *data} is set to {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}.</p>
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If the current {@code CUcontext} does not support unified virtual addressing then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER}: Returns in {@code *data} the device pointer value through which {@code ptr} may be accessed by kernels running
     * in the current {@code CUcontext}. The type of {@code data} must be {@code CUdeviceptr *}.
     * 
     * <p>If there exists no device pointer value through which kernels running in the current {@code CUcontext} may access {@code ptr} then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If there is no current {@code CUcontext} then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p>
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER}: Returns in {@code *data} the host pointer value through which {@code ptr} may be accessed by by the host program.
     * The type of {@code data} must be {@code void **}. If there exists no host pointer value through which the host program may directly access
     * {@code ptr} then {@link #CUDA_ERROR_INVALID_VALUE} is returned.
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS}: Returns in {@code *data} two tokens for use with the nv-p2p.h Linux kernel interface. {@code data} must be a struct
     * of type {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS}.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from {@link #cuMemAlloc MemAlloc}. Note that {@code p2pToken} and {@code vaSpaceToken} are only valid for the
     * lifetime of the source allocation. A subsequent allocation at the same address may return completely different tokens. Querying this attribute has
     * a side effect of setting the attribute {@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS} for the region of memory that {@code ptr} points to.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS}:
     * 
     * <p>A boolean attribute which when set, ensures that synchronous memory operations initiated on the region of memory that {@code ptr} points to will
     * always synchronize. See further documentation in the section titled "API synchronization behavior" to learn more about cases when synchronous
     * memory operations can exhibit asynchronous behavior.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID}: Returns in {@code *data} a buffer ID which is guaranteed to be unique within the process. {@code data} must point to
     * an unsigned long long.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from a CUDA memory allocation API. Every memory allocation from any of the CUDA memory allocation
     * APIs will have a unique ID over a process lifetime. Subsequent allocations do not reuse IDs from previous freed allocations. IDs are only unique
     * within a single process.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED}: Returns in {@code *data} a boolean that indicates whether the pointer points to managed memory or not.
     * 
     * <p>If {@code ptr} is not a valid CUDA pointer then {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL}: Returns in {@code *data} an integer representing a device ordinal of a device against which the memory was
     * allocated or registered.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE}: Returns in {@code *data} a boolean that indicates if this pointer maps to an allocation that is
     * suitable for {@code cudaIpcGetMemHandle()}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_START_ADDR POINTER_ATTRIBUTE_RANGE_START_ADDR}: Returns in {@code *data} the starting address for the allocation referenced by the device pointer {@code ptr}.
     * Note that this is not necessarily the address of the mapped region, but the address of the mappable address range {@code ptr} references (e.g. from
     * {@link #cuMemAddressReserve MemAddressReserve}).</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_SIZE POINTER_ATTRIBUTE_RANGE_SIZE}: Returns in {@code *data} the size for the allocation referenced by the device pointer {@code ptr}. Note that this is
     * not necessarily the size of the mapped region, but the size of the mappable address range {@code ptr} references (e.g. from {@link #cuMemAddressReserve MemAddressReserve}).
     * To retrieve the size of the mapped region, see {@link #cuMemGetAddressRange MemGetAddressRange}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MAPPED POINTER_ATTRIBUTE_MAPPED}: Returns in {@code *data} a boolean that indicates if this pointer is in a valid address range that is mapped to a
     * backing allocation.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES}: Returns a bitmask of the allowed handle types for an allocation that may be passed to
     * {@link #cuMemExportToShareableHandle MemExportToShareableHandle}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE POINTER_ATTRIBUTE_MEMPOOL_HANDLE}: Returns in {@code *data} the handle to the mempool that the allocation was obtained from.</li>
     * </ul>
     * 
     * <p>Note that for most allocations in the unified virtual address space the host and device pointer for accessing the allocation will be the same. The
     * exceptions to this are - user memory registered using {@link #cuMemHostRegister MemHostRegister} - host memory allocated using {@link #cuMemHostAlloc MemHostAlloc} with the
     * {@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} flag For these types of allocation there will exist separate, disjoint host and device addresses for accessing the
     * allocation. In particular</p>
     * 
     * <ul>
     * <li>The host address will correspond to an invalid unmapped device address (which will result in an exception if accessed from the device)</li>
     * <li>The device address will correspond to an invalid unmapped host address (which will result in an exception if accessed from the host).</li>
     * </ul>
     * 
     * <p>For these types of allocations, querying {@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER} and {@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER} may be used to retrieve the host and
     * device addresses from either address.</p>
     *
     * @param data      returned pointer attribute value
     * @param attribute pointer attribute to query
     * @param ptr       pointer
     */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") ByteBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    /**
     * Returns information about a pointer.
     * 
     * <p>The supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT}: Returns in {@code *data} the {@code CUcontext} in which {@code ptr} was allocated or registered. The type of
     * {@code data} must be {@code CUcontext *}.
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMORY_TYPE POINTER_ATTRIBUTE_MEMORY_TYPE}:
     * 
     * <p>Returns in {@code *data} the physical memory type of the memory that {@code ptr} addresses as a {@code CUmemorytype} enumerated value. The type of
     * {@code data} must be unsigned int.</p>
     * 
     * <p>If {@code ptr} addresses device memory then {@code *data} is set to {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}. The particular {@code CUdevice} on which the memory resides
     * is the {@code CUdevice} of the {@code CUcontext} returned by the {@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT} attribute of {@code ptr}.</p>
     * 
     * <p>If {@code ptr} addresses host memory then {@code *data} is set to {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}.</p>
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If the current {@code CUcontext} does not support unified virtual addressing then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER}: Returns in {@code *data} the device pointer value through which {@code ptr} may be accessed by kernels running
     * in the current {@code CUcontext}. The type of {@code data} must be {@code CUdeviceptr *}.
     * 
     * <p>If there exists no device pointer value through which kernels running in the current {@code CUcontext} may access {@code ptr} then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If there is no current {@code CUcontext} then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p>
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER}: Returns in {@code *data} the host pointer value through which {@code ptr} may be accessed by by the host program.
     * The type of {@code data} must be {@code void **}. If there exists no host pointer value through which the host program may directly access
     * {@code ptr} then {@link #CUDA_ERROR_INVALID_VALUE} is returned.
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS}: Returns in {@code *data} two tokens for use with the nv-p2p.h Linux kernel interface. {@code data} must be a struct
     * of type {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS}.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from {@link #cuMemAlloc MemAlloc}. Note that {@code p2pToken} and {@code vaSpaceToken} are only valid for the
     * lifetime of the source allocation. A subsequent allocation at the same address may return completely different tokens. Querying this attribute has
     * a side effect of setting the attribute {@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS} for the region of memory that {@code ptr} points to.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS}:
     * 
     * <p>A boolean attribute which when set, ensures that synchronous memory operations initiated on the region of memory that {@code ptr} points to will
     * always synchronize. See further documentation in the section titled "API synchronization behavior" to learn more about cases when synchronous
     * memory operations can exhibit asynchronous behavior.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID}: Returns in {@code *data} a buffer ID which is guaranteed to be unique within the process. {@code data} must point to
     * an unsigned long long.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from a CUDA memory allocation API. Every memory allocation from any of the CUDA memory allocation
     * APIs will have a unique ID over a process lifetime. Subsequent allocations do not reuse IDs from previous freed allocations. IDs are only unique
     * within a single process.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED}: Returns in {@code *data} a boolean that indicates whether the pointer points to managed memory or not.
     * 
     * <p>If {@code ptr} is not a valid CUDA pointer then {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL}: Returns in {@code *data} an integer representing a device ordinal of a device against which the memory was
     * allocated or registered.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE}: Returns in {@code *data} a boolean that indicates if this pointer maps to an allocation that is
     * suitable for {@code cudaIpcGetMemHandle()}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_START_ADDR POINTER_ATTRIBUTE_RANGE_START_ADDR}: Returns in {@code *data} the starting address for the allocation referenced by the device pointer {@code ptr}.
     * Note that this is not necessarily the address of the mapped region, but the address of the mappable address range {@code ptr} references (e.g. from
     * {@link #cuMemAddressReserve MemAddressReserve}).</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_SIZE POINTER_ATTRIBUTE_RANGE_SIZE}: Returns in {@code *data} the size for the allocation referenced by the device pointer {@code ptr}. Note that this is
     * not necessarily the size of the mapped region, but the size of the mappable address range {@code ptr} references (e.g. from {@link #cuMemAddressReserve MemAddressReserve}).
     * To retrieve the size of the mapped region, see {@link #cuMemGetAddressRange MemGetAddressRange}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MAPPED POINTER_ATTRIBUTE_MAPPED}: Returns in {@code *data} a boolean that indicates if this pointer is in a valid address range that is mapped to a
     * backing allocation.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES}: Returns a bitmask of the allowed handle types for an allocation that may be passed to
     * {@link #cuMemExportToShareableHandle MemExportToShareableHandle}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE POINTER_ATTRIBUTE_MEMPOOL_HANDLE}: Returns in {@code *data} the handle to the mempool that the allocation was obtained from.</li>
     * </ul>
     * 
     * <p>Note that for most allocations in the unified virtual address space the host and device pointer for accessing the allocation will be the same. The
     * exceptions to this are - user memory registered using {@link #cuMemHostRegister MemHostRegister} - host memory allocated using {@link #cuMemHostAlloc MemHostAlloc} with the
     * {@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} flag For these types of allocation there will exist separate, disjoint host and device addresses for accessing the
     * allocation. In particular</p>
     * 
     * <ul>
     * <li>The host address will correspond to an invalid unmapped device address (which will result in an exception if accessed from the device)</li>
     * <li>The device address will correspond to an invalid unmapped host address (which will result in an exception if accessed from the host).</li>
     * </ul>
     * 
     * <p>For these types of allocations, querying {@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER} and {@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER} may be used to retrieve the host and
     * device addresses from either address.</p>
     *
     * @param data      returned pointer attribute value
     * @param attribute pointer attribute to query
     * @param ptr       pointer
     */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") PointerBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    /**
     * Returns information about a pointer.
     * 
     * <p>The supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT}: Returns in {@code *data} the {@code CUcontext} in which {@code ptr} was allocated or registered. The type of
     * {@code data} must be {@code CUcontext *}.
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMORY_TYPE POINTER_ATTRIBUTE_MEMORY_TYPE}:
     * 
     * <p>Returns in {@code *data} the physical memory type of the memory that {@code ptr} addresses as a {@code CUmemorytype} enumerated value. The type of
     * {@code data} must be unsigned int.</p>
     * 
     * <p>If {@code ptr} addresses device memory then {@code *data} is set to {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}. The particular {@code CUdevice} on which the memory resides
     * is the {@code CUdevice} of the {@code CUcontext} returned by the {@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT} attribute of {@code ptr}.</p>
     * 
     * <p>If {@code ptr} addresses host memory then {@code *data} is set to {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}.</p>
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If the current {@code CUcontext} does not support unified virtual addressing then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER}: Returns in {@code *data} the device pointer value through which {@code ptr} may be accessed by kernels running
     * in the current {@code CUcontext}. The type of {@code data} must be {@code CUdeviceptr *}.
     * 
     * <p>If there exists no device pointer value through which kernels running in the current {@code CUcontext} may access {@code ptr} then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If there is no current {@code CUcontext} then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p>
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER}: Returns in {@code *data} the host pointer value through which {@code ptr} may be accessed by by the host program.
     * The type of {@code data} must be {@code void **}. If there exists no host pointer value through which the host program may directly access
     * {@code ptr} then {@link #CUDA_ERROR_INVALID_VALUE} is returned.
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS}: Returns in {@code *data} two tokens for use with the nv-p2p.h Linux kernel interface. {@code data} must be a struct
     * of type {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS}.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from {@link #cuMemAlloc MemAlloc}. Note that {@code p2pToken} and {@code vaSpaceToken} are only valid for the
     * lifetime of the source allocation. A subsequent allocation at the same address may return completely different tokens. Querying this attribute has
     * a side effect of setting the attribute {@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS} for the region of memory that {@code ptr} points to.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS}:
     * 
     * <p>A boolean attribute which when set, ensures that synchronous memory operations initiated on the region of memory that {@code ptr} points to will
     * always synchronize. See further documentation in the section titled "API synchronization behavior" to learn more about cases when synchronous
     * memory operations can exhibit asynchronous behavior.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID}: Returns in {@code *data} a buffer ID which is guaranteed to be unique within the process. {@code data} must point to
     * an unsigned long long.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from a CUDA memory allocation API. Every memory allocation from any of the CUDA memory allocation
     * APIs will have a unique ID over a process lifetime. Subsequent allocations do not reuse IDs from previous freed allocations. IDs are only unique
     * within a single process.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED}: Returns in {@code *data} a boolean that indicates whether the pointer points to managed memory or not.
     * 
     * <p>If {@code ptr} is not a valid CUDA pointer then {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL}: Returns in {@code *data} an integer representing a device ordinal of a device against which the memory was
     * allocated or registered.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE}: Returns in {@code *data} a boolean that indicates if this pointer maps to an allocation that is
     * suitable for {@code cudaIpcGetMemHandle()}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_START_ADDR POINTER_ATTRIBUTE_RANGE_START_ADDR}: Returns in {@code *data} the starting address for the allocation referenced by the device pointer {@code ptr}.
     * Note that this is not necessarily the address of the mapped region, but the address of the mappable address range {@code ptr} references (e.g. from
     * {@link #cuMemAddressReserve MemAddressReserve}).</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_SIZE POINTER_ATTRIBUTE_RANGE_SIZE}: Returns in {@code *data} the size for the allocation referenced by the device pointer {@code ptr}. Note that this is
     * not necessarily the size of the mapped region, but the size of the mappable address range {@code ptr} references (e.g. from {@link #cuMemAddressReserve MemAddressReserve}).
     * To retrieve the size of the mapped region, see {@link #cuMemGetAddressRange MemGetAddressRange}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MAPPED POINTER_ATTRIBUTE_MAPPED}: Returns in {@code *data} a boolean that indicates if this pointer is in a valid address range that is mapped to a
     * backing allocation.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES}: Returns a bitmask of the allowed handle types for an allocation that may be passed to
     * {@link #cuMemExportToShareableHandle MemExportToShareableHandle}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE POINTER_ATTRIBUTE_MEMPOOL_HANDLE}: Returns in {@code *data} the handle to the mempool that the allocation was obtained from.</li>
     * </ul>
     * 
     * <p>Note that for most allocations in the unified virtual address space the host and device pointer for accessing the allocation will be the same. The
     * exceptions to this are - user memory registered using {@link #cuMemHostRegister MemHostRegister} - host memory allocated using {@link #cuMemHostAlloc MemHostAlloc} with the
     * {@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} flag For these types of allocation there will exist separate, disjoint host and device addresses for accessing the
     * allocation. In particular</p>
     * 
     * <ul>
     * <li>The host address will correspond to an invalid unmapped device address (which will result in an exception if accessed from the device)</li>
     * <li>The device address will correspond to an invalid unmapped host address (which will result in an exception if accessed from the host).</li>
     * </ul>
     * 
     * <p>For these types of allocations, querying {@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER} and {@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER} may be used to retrieve the host and
     * device addresses from either address.</p>
     *
     * @param data      returned pointer attribute value
     * @param attribute pointer attribute to query
     * @param ptr       pointer
     */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") IntBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    /**
     * Returns information about a pointer.
     * 
     * <p>The supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT}: Returns in {@code *data} the {@code CUcontext} in which {@code ptr} was allocated or registered. The type of
     * {@code data} must be {@code CUcontext *}.
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMORY_TYPE POINTER_ATTRIBUTE_MEMORY_TYPE}:
     * 
     * <p>Returns in {@code *data} the physical memory type of the memory that {@code ptr} addresses as a {@code CUmemorytype} enumerated value. The type of
     * {@code data} must be unsigned int.</p>
     * 
     * <p>If {@code ptr} addresses device memory then {@code *data} is set to {@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE}. The particular {@code CUdevice} on which the memory resides
     * is the {@code CUdevice} of the {@code CUcontext} returned by the {@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT} attribute of {@code ptr}.</p>
     * 
     * <p>If {@code ptr} addresses host memory then {@code *data} is set to {@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST}.</p>
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If the current {@code CUcontext} does not support unified virtual addressing then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER}: Returns in {@code *data} the device pointer value through which {@code ptr} may be accessed by kernels running
     * in the current {@code CUcontext}. The type of {@code data} must be {@code CUdeviceptr *}.
     * 
     * <p>If there exists no device pointer value through which kernels running in the current {@code CUcontext} may access {@code ptr} then
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>If there is no current {@code CUcontext} then {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p>
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER}: Returns in {@code *data} the host pointer value through which {@code ptr} may be accessed by by the host program.
     * The type of {@code data} must be {@code void **}. If there exists no host pointer value through which the host program may directly access
     * {@code ptr} then {@link #CUDA_ERROR_INVALID_VALUE} is returned.
     * 
     * <p>Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS}: Returns in {@code *data} two tokens for use with the nv-p2p.h Linux kernel interface. {@code data} must be a struct
     * of type {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS}.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from {@link #cuMemAlloc MemAlloc}. Note that {@code p2pToken} and {@code vaSpaceToken} are only valid for the
     * lifetime of the source allocation. A subsequent allocation at the same address may return completely different tokens. Querying this attribute has
     * a side effect of setting the attribute {@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS} for the region of memory that {@code ptr} points to.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS}:
     * 
     * <p>A boolean attribute which when set, ensures that synchronous memory operations initiated on the region of memory that {@code ptr} points to will
     * always synchronize. See further documentation in the section titled "API synchronization behavior" to learn more about cases when synchronous
     * memory operations can exhibit asynchronous behavior.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID}: Returns in {@code *data} a buffer ID which is guaranteed to be unique within the process. {@code data} must point to
     * an unsigned long long.
     * 
     * <p>{@code ptr} must be a pointer to memory obtained from a CUDA memory allocation API. Every memory allocation from any of the CUDA memory allocation
     * APIs will have a unique ID over a process lifetime. Subsequent allocations do not reuse IDs from previous freed allocations. IDs are only unique
     * within a single process.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED}: Returns in {@code *data} a boolean that indicates whether the pointer points to managed memory or not.
     * 
     * <p>If {@code ptr} is not a valid CUDA pointer then {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p></li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL}: Returns in {@code *data} an integer representing a device ordinal of a device against which the memory was
     * allocated or registered.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE}: Returns in {@code *data} a boolean that indicates if this pointer maps to an allocation that is
     * suitable for {@code cudaIpcGetMemHandle()}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_START_ADDR POINTER_ATTRIBUTE_RANGE_START_ADDR}: Returns in {@code *data} the starting address for the allocation referenced by the device pointer {@code ptr}.
     * Note that this is not necessarily the address of the mapped region, but the address of the mappable address range {@code ptr} references (e.g. from
     * {@link #cuMemAddressReserve MemAddressReserve}).</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_RANGE_SIZE POINTER_ATTRIBUTE_RANGE_SIZE}: Returns in {@code *data} the size for the allocation referenced by the device pointer {@code ptr}. Note that this is
     * not necessarily the size of the mapped region, but the size of the mappable address range {@code ptr} references (e.g. from {@link #cuMemAddressReserve MemAddressReserve}).
     * To retrieve the size of the mapped region, see {@link #cuMemGetAddressRange MemGetAddressRange}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MAPPED POINTER_ATTRIBUTE_MAPPED}: Returns in {@code *data} a boolean that indicates if this pointer is in a valid address range that is mapped to a
     * backing allocation.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES}: Returns a bitmask of the allowed handle types for an allocation that may be passed to
     * {@link #cuMemExportToShareableHandle MemExportToShareableHandle}.</li>
     * <li>{@link #CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE POINTER_ATTRIBUTE_MEMPOOL_HANDLE}: Returns in {@code *data} the handle to the mempool that the allocation was obtained from.</li>
     * </ul>
     * 
     * <p>Note that for most allocations in the unified virtual address space the host and device pointer for accessing the allocation will be the same. The
     * exceptions to this are - user memory registered using {@link #cuMemHostRegister MemHostRegister} - host memory allocated using {@link #cuMemHostAlloc MemHostAlloc} with the
     * {@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} flag For these types of allocation there will exist separate, disjoint host and device addresses for accessing the
     * allocation. In particular</p>
     * 
     * <ul>
     * <li>The host address will correspond to an invalid unmapped device address (which will result in an exception if accessed from the device)</li>
     * <li>The device address will correspond to an invalid unmapped host address (which will result in an exception if accessed from the host).</li>
     * </ul>
     * 
     * <p>For these types of allocations, querying {@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER} and {@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER} may be used to retrieve the host and
     * device addresses from either address.</p>
     *
     * @param data      returned pointer attribute value
     * @param attribute pointer attribute to query
     * @param ptr       pointer
     */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") LongBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    // --- [ cuMemPrefetchAsync ] ---

    /**
     * Prefetches memory to the specified destination device,
     * 
     * <p>Prefetches memory to the specified destination device. {@code devPtr} is the base device pointer of the memory to be prefetched and {@code dstDevice}
     * is the destination device. {@code count} specifies the number of bytes to copy. {@code hStream} is the stream in which the operation is enqueued. The
     * memory range must refer to managed memory allocated via {@link #cuMemAllocManaged MemAllocManaged} or declared via __managed__ variables.</p>
     * 
     * <p>Passing in {@link #CU_DEVICE_CPU DEVICE_CPU} for {@code dstDevice} will prefetch the data to host memory. If {@code dstDevice} is a GPU, then the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} must be non-zero. Additionally, {@code hStream} must be associated with a device that has a non-zero
     * value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}.</p>
     * 
     * <p>The start address and end address of the memory range will be rounded down and rounded up respectively to be aligned to CPU page size before the
     * prefetch operation is enqueued in the stream.</p>
     * 
     * <p>If no physical memory has been allocated for this region, then this memory region will be populated and mapped on the destination device. If there's
     * insufficient memory to prefetch the desired region, the Unified Memory driver may evict pages from other {@link #cuMemAllocManaged MemAllocManaged} allocations to host memory
     * in order to make room. Device memory allocated using {@link #cuMemAlloc MemAlloc} or {@link #cuArrayCreate ArrayCreate} will not be evicted.</p>
     * 
     * <p>By default, any mappings to the previous location of the migrated pages are removed and mappings for the new location are only setup on {@code
     * dstDevice}. The exact behavior however also depends on the settings applied to this memory range via {@link #cuMemAdvise MemAdvise} as described below:</p>
     * 
     * <p>If {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY} was set on any subset of this memory range, then that subset will create a read-only copy of the pages on {@code
     * dstDevice}.</p>
     * 
     * <p>If {@link #CU_MEM_ADVISE_SET_PREFERRED_LOCATION MEM_ADVISE_SET_PREFERRED_LOCATION} was called on any subset of this memory range, then the pages will be migrated to {@code dstDevice} even if
     * {@code dstDevice} is not the preferred location of any pages in the memory range.</p>
     * 
     * <p>If {@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} was called on any subset of this memory range, then mappings to those pages from all the appropriate processors are
     * updated to refer to the new location if establishing such a mapping is possible. Otherwise, those mappings are cleared.</p>
     * 
     * <p>Note that this API is not required for functionality and only serves to improve performance by allowing the application to migrate data to a suitable
     * location before it is accessed. Memory accesses to this range are always coherent and are allowed even when the data is actively being migrated.</p>
     * 
     * <p>Note that this function is asynchronous with respect to the host and all work on other devices.</p>
     *
     * @param devPtr    pointer to be prefetched
     * @param count     size in bytes
     * @param dstDevice destination device to prefetch to
     * @param hStream   stream to enqueue prefetch operation
     */
    @NativeType("CUresult")
    public static int cuMemPrefetchAsync(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUdevice") int dstDevice, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemPrefetchAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPPI(devPtr, count, dstDevice, hStream, __functionAddress);
    }

    // --- [ cuMemAdvise ] ---

    /**
     * Advise about the usage of a given memory range.
     * 
     * <p>Advise the Unified Memory subsystem about the usage pattern for the memory range starting at {@code devPtr} with a size of {@code count} bytes. The
     * start address and end address of the memory range will be rounded down and rounded up respectively to be aligned to CPU page size before the advice is
     * applied. The memory range must refer to managed memory allocated via {@link #cuMemAllocManaged MemAllocManaged} or declared via __managed__ variables. The memory range
     * could also refer to system-allocated pageable memory provided it represents a valid, host-accessible region of memory and all additional constraints
     * imposed by {@code advice} as outlined below are also satisfied. Specifying an invalid system-allocated pageable memory range results in an error being
     * returned.</p>
     * 
     * <p>The {@code advice} parameter can take the following values:</p>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY}: This implies that the data is mostly going to be read from and only occasionally written to. Any read accesses
     * from any processor to this region will create a read-only copy of at least the accessed pages in that processor's memory. Additionally, if
     * {@link #cuMemPrefetchAsync MemPrefetchAsync} is called on this region, it will create a read-only copy of the data on the destination processor. If any processor writes to
     * this region, all copies of the corresponding page will be invalidated except for the one where the write occurred. The {@code device} argument is
     * ignored for this advice. Note that for a page to be read-duplicated, the accessing processor must either be the CPU or a GPU that has a non-zero
     * value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}. Also, if a context is created on a device that does not have the
     * device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} set, then read-duplication will not occur until all such contexts are destroyed.
     * If the memory region refers to valid system-allocated pageable memory, then the accessing device must have a non-zero value for the device
     * attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS} for a read-only copy to be created on that device. Note however that if the accessing device
     * also has a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES}, then setting this advice
     * will not create a read-only copy when that device accesses this memory region.</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_READ_MOSTLY MEM_ADVISE_UNSET_READ_MOSTLY}: Undoes the effect of {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY} and also prevents the Unified Memory driver from attempting
     * heuristic read-duplication on the memory range. Any read-duplicated copies of the data will be collapsed into a single copy. The location for the
     * collapsed copy will be the preferred location if the page has a preferred location and one of the read-duplicated copies was resident at that
     * location. Otherwise, the location chosen is arbitrary.</li>
     * <li>{@link #CU_MEM_ADVISE_SET_PREFERRED_LOCATION MEM_ADVISE_SET_PREFERRED_LOCATION}: This advice sets the preferred location for the data to be the memory belonging to {@code device}. Passing
     * in CU_DEVICE_CPU for {@code device} sets the preferred location as host memory. If {@code device} is a GPU, then it must have a non-zero value for
     * the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}. Setting the preferred location does not cause data to migrate to that
     * location immediately. Instead, it guides the migration policy when a fault occurs on that memory region. If the data is already in its preferred
     * location and the faulting processor can establish a mapping without requiring the data to be migrated, then data migration will be avoided. On the
     * other hand, if the data is not in its preferred location or if a direct mapping cannot be established, then it will be migrated to the processor
     * accessing it. It is important to note that setting the preferred location does not prevent data prefetching done using {@link #cuMemPrefetchAsync MemPrefetchAsync}. Having
     * a preferred location can override the page thrash detection and resolution logic in the Unified Memory driver. Normally, if a page is detected to
     * be constantly thrashing between for example host and device memory, the page may eventually be pinned to host memory by the Unified Memory driver.
     * But if the preferred location is set as device memory, then the page will continue to thrash indefinitely. If {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY} is
     * also set on this memory region or any subset of it, then the policies associated with that advice will override the policies of this advice, unless
     * read accesses from {@code device} will not result in a read-only copy being created on that device as outlined in description for the advice
     * {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY}. If the memory region refers to valid system-allocated pageable memory, then {@code device} must have a non-zero
     * value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS}. Additionally, if {@code device} has a non-zero value for the device
     * attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES}, then this call has no effect. Note however that this behavior may
     * change in the future.</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_PREFERRED_LOCATION MEM_ADVISE_UNSET_PREFERRED_LOCATION}: Undoes the effect of {@link #CU_MEM_ADVISE_SET_PREFERRED_LOCATION MEM_ADVISE_SET_PREFERRED_LOCATION} and changes the preferred location to none.</li>
     * <li>{@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY}: This advice implies that the data will be accessed by {@code device}. Passing in {@link #CU_DEVICE_CPU DEVICE_CPU} for {@code
     * device} will set the advice for the CPU. If {@code device} is a GPU, then the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} must
     * be non-zero. This advice does not cause data migration and has no impact on the location of the data per se. Instead, it causes the data to always
     * be mapped in the specified processor's page tables, as long as the location of the data permits a mapping to be established. If the data gets
     * migrated for any reason, the mappings are updated accordingly. This advice is recommended in scenarios where data locality is not important, but
     * avoiding faults is. Consider for example a system containing multiple GPUs with peer-to-peer access enabled, where the data located on one GPU is
     * occasionally accessed by peer GPUs. In such scenarios, migrating data over to the other GPUs is not as important because the accesses are
     * infrequent and the overhead of migration may be too high. But preventing faults can still help improve performance, and so having a mapping set up
     * in advance is useful. Note that on CPU access of this data, the data may be migrated to host memory because the CPU typically cannot access device
     * memory directly. Any GPU that had the {@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} flag set for this data will now have its mapping updated to point to the page
     * in host memory. If {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY} is also set on this memory region or any subset of it, then the policies associated with that
     * advice will override the policies of this advice. Additionally, if the preferred location of this memory region or any subset of it is also {@code
     * device}, then the policies associated with {@link #CU_MEM_ADVISE_SET_PREFERRED_LOCATION MEM_ADVISE_SET_PREFERRED_LOCATION} will override the policies of this advice. If the memory region
     * refers to valid system-allocated pageable memory, then {@code device} must have a non-zero value for the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS}. Additionally, if {@code device} has a non-zero value for the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES}, then this call has no effect.</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_ACCESSED_BY MEM_ADVISE_UNSET_ACCESSED_BY}: Undoes the effect of {@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY}. Any mappings to the data from {@code device} may be
     * removed at any time causing accesses to result in non-fatal page faults. If the memory region refers to valid system-allocated pageable memory,
     * then {@code device} must have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS}. Additionally, if {@code
     * device} has a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES}, then this call has no
     * effect.</li>
     * </ul>
     *
     * @param devPtr pointer to memory to set the advice for
     * @param count  size in bytes of the memory range
     * @param advice advice to be applied for the specified memory range
     * @param device device to apply the advice for
     */
    @NativeType("CUresult")
    public static int cuMemAdvise(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUmem_advise") int advice, @NativeType("CUdevice") int device) {
        long __functionAddress = Functions.MemAdvise;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPI(devPtr, count, advice, device, __functionAddress);
    }

    // --- [ cuMemRangeGetAttribute ] ---

    /**
     * Unsafe version of: {@link #cuMemRangeGetAttribute MemRangeGetAttribute}
     *
     * @param dataSize the size of {@code data}
     */
    public static int ncuMemRangeGetAttribute(long data, long dataSize, int attribute, long devPtr, long count) {
        long __functionAddress = Functions.MemRangeGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPPPI(data, dataSize, attribute, devPtr, count, __functionAddress);
    }

    /**
     * Query an attribute of a given memory range.
     * 
     * <p>Query an attribute about the memory range starting at {@code devPtr} with a size of {@code count} bytes. The memory range must refer to managed memory
     * allocated via {@link #cuMemAllocManaged MemAllocManaged} or declared via __managed__ variables.</p>
     * 
     * <p>The {@code attribute} parameter can take the following values:</p>
     * 
     * <ul>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY MEM_RANGE_ATTRIBUTE_READ_MOSTLY}: If this attribute is specified, {@code data} will be interpreted as a 32-bit integer, and {@code dataSize}
     * must be 4. The result returned will be 1 if all pages in the given memory range have read-duplication enabled, or 0 otherwise.</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION}: If this attribute is specified, {@code data} will be interpreted as a 32-bit integer, and {@code
     * dataSize} must be 4. The result returned will be a GPU device id if all pages in the memory range have that GPU as their preferred location, or it
     * will be CU_DEVICE_CPU if all pages in the memory range have the CPU as their preferred location, or it will be CU_DEVICE_INVALID if either all the
     * pages don't have the same preferred location or some of the pages don't have a preferred location at all. Note that the actual location of the
     * pages in the memory range at the time of the query may be different from the preferred location.</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY MEM_RANGE_ATTRIBUTE_ACCESSED_BY}: If this attribute is specified, {@code data} will be interpreted as an array of 32-bit integers, and {@code
     * dataSize} must be a non-zero multiple of 4. The result returned will be a list of device ids that had {@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} set for that
     * entire memory range. If any device does not have that advice set for the entire memory range, that device will not be included. If {@code data} is
     * larger than the number of devices that have that advice set for that memory range, CU_DEVICE_INVALID will be returned in all the extra space
     * provided. For ex., if {@code dataSize} is 12 (i.e. {@code data} has 3 elements) and only device 0 has the advice set, then the result returned will
     * be { 0, CU_DEVICE_INVALID, CU_DEVICE_INVALID }. If {@code data} is smaller than the number of devices that have that advice set, then only as many
     * devices will be returned as can fit in the array. There is no guarantee on which specific devices will be returned, however.</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION}: If this attribute is specified, {@code data} will be interpreted as a 32-bit integer, and {@code
     * dataSize} must be 4. The result returned will be the last location to which all pages in the memory range were prefetched explicitly via
     * {@link #cuMemPrefetchAsync MemPrefetchAsync}. This will either be a GPU id or CU_DEVICE_CPU depending on whether the last location for prefetch was a GPU or the CPU
     * respectively. If any page in the memory range was never explicitly prefetched or if all pages were not prefetched to the same location,
     * CU_DEVICE_INVALID will be returned. Note that this simply returns the last location that the applicaton requested to prefetch the memory range to.
     * It gives no indication as to whether the prefetch operation to that location has completed or even begun.</li>
     * </ul>
     *
     * @param data      a pointers to a memory location where the result of each attribute query will be written to
     * @param attribute the attribute to query
     * @param devPtr    start of the range to query
     * @param count     size of the range to query
     */
    @NativeType("CUresult")
    public static int cuMemRangeGetAttribute(@NativeType("void *") ByteBuffer data, @NativeType("CUmem_range_attribute") int attribute, @NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count) {
        return ncuMemRangeGetAttribute(memAddress(data), data.remaining(), attribute, devPtr, count);
    }

    // --- [ cuMemRangeGetAttributes ] ---

    /**
     * Unsafe version of: {@link #cuMemRangeGetAttributes MemRangeGetAttributes}
     *
     * @param numAttributes number of attributes to query
     */
    public static int ncuMemRangeGetAttributes(long data, long dataSizes, long attributes, long numAttributes, long devPtr, long count) {
        long __functionAddress = Functions.MemRangeGetAttributes;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPPPPPI(data, dataSizes, attributes, numAttributes, devPtr, count, __functionAddress);
    }

    /**
     * Query attributes of a given memory range.
     * 
     * <p>Query attributes of the memory range starting at {@code devPtr} with a size of {@code count} bytes. The memory range must refer to managed memory
     * allocated via {@link #cuMemAllocManaged MemAllocManaged} or declared via __managed__ variables. The {@code attributes} array will be interpreted to have {@code numAttributes}
     * entries. The {@code dataSizes} array will also be interpreted to have {@code numAttributes} entries. The results of the query will be stored in {@code data}.</p>
     * 
     * <p>The list of supported attributes are given below. Please refer to {@link #cuMemRangeGetAttribute MemRangeGetAttribute} for attribute descriptions and restrictions.</p>
     * 
     * <ul>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY MEM_RANGE_ATTRIBUTE_READ_MOSTLY}</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION}</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY MEM_RANGE_ATTRIBUTE_ACCESSED_BY}</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION}</li>
     * </ul>
     *
     * @param data       a two-dimensional array containing pointers to memory locations where the result of each attribute query will be written to
     * @param dataSizes  array containing the sizes of each result
     * @param attributes an array of attributes to query (numAttributes and the number of attributes in this array should match). One of:<br><table><tr><td>{@link #CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY MEM_RANGE_ATTRIBUTE_READ_MOSTLY}</td><td>{@link #CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION}</td></tr><tr><td>{@link #CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY MEM_RANGE_ATTRIBUTE_ACCESSED_BY}</td><td>{@link #CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION}</td></tr></table>
     * @param devPtr     start of the range to query
     * @param count      size of the range to query
     */
    @NativeType("CUresult")
    public static int cuMemRangeGetAttributes(@NativeType("void **") PointerBuffer data, @NativeType("size_t *") PointerBuffer dataSizes, @NativeType("CUmem_range_attribute *") IntBuffer attributes, @NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count) {
        if (CHECKS) {
            check(data, attributes.remaining());
            check(dataSizes, attributes.remaining());
        }
        return ncuMemRangeGetAttributes(memAddress(data), memAddress(dataSizes), memAddress(attributes), attributes.remaining(), devPtr, count);
    }

    // --- [ cuPointerSetAttribute ] ---

    /** Unsafe version of: {@link #cuPointerSetAttribute PointerSetAttribute} */
    public static int ncuPointerSetAttribute(long value, int attribute, long ptr) {
        long __functionAddress = Functions.PointerSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(value, attribute, ptr, __functionAddress);
    }

    /**
     * Set attributes on a previously allocated memory region.
     * 
     * <p>The supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS}: A boolean attribute that can either be set (1) or unset (0).
     * 
     * <p>When set, the region of memory that {@code ptr} points to is guaranteed to always synchronize memory operations that are synchronous. If there are
     * some previously initiated synchronous memory operations that are pending when this attribute is set, the function does not return until those
     * memory operations are complete. See further documentation in the section titled "API synchronization behavior" to learn more about cases when
     * synchronous memory operations can exhibit asynchronous behavior. {@code value} will be considered as a pointer to an unsigned integer to which this
     * attribute is to be set.</p></li>
     * </ul>
     *
     * @param value     pointer to memory containing the value to be set
     * @param attribute pointer attribute to set
     * @param ptr       pointer to a memory region allocated using CUDA memory allocation APIs
     */
    @NativeType("CUresult")
    public static int cuPointerSetAttribute(@NativeType("void const *") ByteBuffer value, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerSetAttribute(memAddress(value), attribute, ptr);
    }

    // --- [ cuPointerGetAttributes ] ---

    /**
     * Unsafe version of: {@link #cuPointerGetAttributes PointerGetAttributes}
     *
     * @param numAttributes number of attributes to query
     */
    public static int ncuPointerGetAttributes(int numAttributes, long attributes, long data, long ptr) {
        long __functionAddress = Functions.PointerGetAttributes;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPI(numAttributes, attributes, data, ptr, __functionAddress);
    }

    /**
     * Returns information about a pointer.
     * 
     * <p>Unlike {@link #cuPointerGetAttribute PointerGetAttribute}, this function will not return an error when the {@code ptr} encountered is not a valid CUDA pointer. Instead, the
     * attributes are assigned default {@code NULL} values and {@link #CUDA_SUCCESS} is returned.</p>
     * 
     * <p>If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses UVA (Unified Virtual Addressing),
     * {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</p>
     *
     * @param attributes an array of attributes to query (numAttributes and the number of attributes in this array should match). One of:<br><table><tr><td>{@link #CU_POINTER_ATTRIBUTE_CONTEXT POINTER_ATTRIBUTE_CONTEXT}</td><td>{@link #CU_POINTER_ATTRIBUTE_MEMORY_TYPE POINTER_ATTRIBUTE_MEMORY_TYPE}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_DEVICE_POINTER POINTER_ATTRIBUTE_DEVICE_POINTER}</td><td>{@link #CU_POINTER_ATTRIBUTE_HOST_POINTER POINTER_ATTRIBUTE_HOST_POINTER}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_P2P_TOKENS POINTER_ATTRIBUTE_P2P_TOKENS}</td><td>{@link #CU_POINTER_ATTRIBUTE_SYNC_MEMOPS POINTER_ATTRIBUTE_SYNC_MEMOPS}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_BUFFER_ID POINTER_ATTRIBUTE_BUFFER_ID}</td><td>{@link #CU_POINTER_ATTRIBUTE_IS_MANAGED POINTER_ATTRIBUTE_IS_MANAGED}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_DEVICE_ORDINAL POINTER_ATTRIBUTE_DEVICE_ORDINAL}</td><td>{@link #CU_POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_RANGE_START_ADDR POINTER_ATTRIBUTE_RANGE_START_ADDR}</td><td>{@link #CU_POINTER_ATTRIBUTE_RANGE_SIZE POINTER_ATTRIBUTE_RANGE_SIZE}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_MAPPED POINTER_ATTRIBUTE_MAPPED}</td><td>{@link #CU_POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE}</td><td>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAGS POINTER_ATTRIBUTE_ACCESS_FLAGS}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE POINTER_ATTRIBUTE_MEMPOOL_HANDLE}</td><td>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAG_NONE POINTER_ATTRIBUTE_ACCESS_FLAG_NONE}</td></tr><tr><td>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READ POINTER_ATTRIBUTE_ACCESS_FLAG_READ}</td><td>{@link #CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE}</td></tr></table>
     * @param data       a two-dimensional array containing pointers to memory locations where the result of each attribute query will be written to
     * @param ptr        pointer to query
     */
    @NativeType("CUresult")
    public static int cuPointerGetAttributes(@NativeType("CUpointer_attribute *") IntBuffer attributes, @NativeType("void **") PointerBuffer data, @NativeType("CUdeviceptr") long ptr) {
        if (CHECKS) {
            check(data, attributes.remaining());
        }
        return ncuPointerGetAttributes(attributes.remaining(), memAddress(attributes), memAddress(data), ptr);
    }

    // --- [ cuStreamCreate ] ---

    /** Unsafe version of: {@link #cuStreamCreate StreamCreate} */
    public static int ncuStreamCreate(long phStream, int Flags) {
        long __functionAddress = Functions.StreamCreate;
        return callPI(phStream, Flags, __functionAddress);
    }

    /**
     * Create a stream.
     * 
     * <p>Creates a stream and returns a handle in {@code phStream}. The {@code Flags} argument determines behaviors of the stream.</p>
     * 
     * <p>Valid values for {@code Flags} are:</p>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_DEFAULT STREAM_DEFAULT}: Default stream creation flag.</li>
     * <li>{@link #CU_STREAM_NON_BLOCKING STREAM_NON_BLOCKING}: Specifies that work running in the created stream may run concurrently with work in stream 0 (the NULL stream), and that
     * the created stream should perform no implicit synchronization with stream 0.</li>
     * </ul>
     *
     * @param phStream returned newly created stream
     * @param Flags    parameters for stream creation
     */
    @NativeType("CUresult")
    public static int cuStreamCreate(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuStreamCreate(memAddress(phStream), Flags);
    }

    // --- [ cuStreamCreateWithPriority ] ---

    /** Unsafe version of: {@link #cuStreamCreateWithPriority StreamCreateWithPriority} */
    public static int ncuStreamCreateWithPriority(long phStream, int flags, int priority) {
        long __functionAddress = Functions.StreamCreateWithPriority;
        return callPI(phStream, flags, priority, __functionAddress);
    }

    /**
     * Create a stream with the given priority.
     * 
     * <p>Creates a stream with the specified priority and returns a handle in {@code phStream}. This API alters the scheduler priority of work in the stream.
     * Work in a higher priority stream may preempt work already executing in a low priority stream.</p>
     * 
     * <p>{@code priority} follows a convention where lower numbers represent higher priorities. {@code 0} represents default priority. The range of meaningful
     * numerical priorities can be queried using {@link #cuCtxGetStreamPriorityRange CtxGetStreamPriorityRange}. If the specified priority is outside the numerical range returned by
     * {@link #cuCtxGetStreamPriorityRange CtxGetStreamPriorityRange}, it will automatically be clamped to the lowest or the highest number in the range.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Stream priorities are supported only on GPUs with compute capability 3.5 or higher.</p></div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In the current implementation, only compute kernels launched in priority streams are affected by the stream's priority. Stream priorities
     * have no effect on host-to-device and device-to-host memory operations.</p></div>
     *
     * @param phStream returned newly created stream
     * @param flags    flags for stream creation. See {@link #cuStreamCreate StreamCreate} for a list of valid flags
     * @param priority stream priority. Lower numbers represent higher priorities. See {@link #cuCtxGetStreamPriorityRange CtxGetStreamPriorityRange} for more information about meaningful stream
     *                 priorities that can be passed.
     */
    @NativeType("CUresult")
    public static int cuStreamCreateWithPriority(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("unsigned int") int flags, int priority) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuStreamCreateWithPriority(memAddress(phStream), flags, priority);
    }

    // --- [ cuStreamGetPriority ] ---

    /** Unsafe version of: {@link #cuStreamGetPriority StreamGetPriority} */
    public static int ncuStreamGetPriority(long hStream, long priority) {
        long __functionAddress = Functions.StreamGetPriority;
        return callPPI(hStream, priority, __functionAddress);
    }

    /**
     * Query the priority of a given stream.
     * 
     * <p>Query the priority of a stream created using {@link #cuStreamCreate StreamCreate} or {@link #cuStreamCreateWithPriority StreamCreateWithPriority} and return the priority in {@code priority}. Note that if
     * the stream was created with a priority outside the numerical range returned by {@link #cuCtxGetStreamPriorityRange CtxGetStreamPriorityRange}, this function returns the clamped
     * priority. See {@link #cuStreamCreateWithPriority StreamCreateWithPriority} for details about priority clamping.</p>
     *
     * @param hStream  handle to the stream to be queried
     * @param priority pointer to a signed integer in which the stream's priority is returned
     */
    @NativeType("CUresult")
    public static int cuStreamGetPriority(@NativeType("CUstream") long hStream, @NativeType("int *") IntBuffer priority) {
        if (CHECKS) {
            check(priority, 1);
        }
        return ncuStreamGetPriority(hStream, memAddress(priority));
    }

    // --- [ cuStreamGetFlags ] ---

    /** Unsafe version of: {@link #cuStreamGetFlags StreamGetFlags} */
    public static int ncuStreamGetFlags(long hStream, long flags) {
        long __functionAddress = Functions.StreamGetFlags;
        return callPPI(hStream, flags, __functionAddress);
    }

    /**
     * Query the flags of a given stream.
     * 
     * <p>Query the flags of a stream created using {@link #cuStreamCreate StreamCreate} or {@link #cuStreamCreateWithPriority StreamCreateWithPriority} and return the flags in {@code flags}.</p>
     *
     * @param hStream handle to the stream to be queried
     * @param flags   pointer to an unsigned integer in which the stream's flags are returned The value returned in {@code flags} is a logical 'OR' of all flags that
     *                were used while creating this stream. See {@link #cuStreamCreate StreamCreate} for the list of valid flags.
     */
    @NativeType("CUresult")
    public static int cuStreamGetFlags(@NativeType("CUstream") long hStream, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuStreamGetFlags(hStream, memAddress(flags));
    }

    // --- [ cuStreamGetCtx ] ---

    /** Unsafe version of: {@link #cuStreamGetCtx StreamGetCtx} */
    public static int ncuStreamGetCtx(long hStream, long pctx) {
        long __functionAddress = Functions.StreamGetCtx;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, pctx, __functionAddress);
    }

    /**
     * Query the context associated with a stream.
     * 
     * <p>Returns the CUDA context that the stream is associated with.</p>
     * 
     * <p>The stream handle {@code hStream} can refer to any of the following:</p>
     * 
     * <ul>
     * <li>a stream created via any of the CUDA driver APIs such as {@link #cuStreamCreate StreamCreate} and {@link #cuStreamCreateWithPriority StreamCreateWithPriority}, or their runtime API equivalents such as
     * {@code cudaStreamCreate()}, {@code cudaStreamCreateWithFlags()} and {@code cudaStreamCreateWithPriority()}. The returned context is the context
     * that was active in the calling thread when the stream was created. Passing an invalid handle will result in undefined behavior.</li>
     * <li>any of the special streams such as the {@code NULL} stream, {@link #CU_STREAM_LEGACY STREAM_LEGACY} and {@link #CU_STREAM_PER_THREAD STREAM_PER_THREAD}. The runtime API equivalents of these are also accepted,
     * which are {@code NULL}, {@code cudaStreamLegacy()} and {@code cudaStreamPerThread()} respectively. Specifying any of the special handles will return the
     * context current to the calling thread. If no context is current to the calling thread, {@link #CUDA_ERROR_INVALID_CONTEXT} is returned.</li>
     * </ul>
     *
     * @param hStream handle to the stream to be queried
     * @param pctx    returned context associated with the stream
     */
    @NativeType("CUresult")
    public static int cuStreamGetCtx(@NativeType("CUstream") long hStream, @NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuStreamGetCtx(hStream, memAddress(pctx));
    }

    // --- [ cuStreamWaitEvent ] ---

    /**
     * Make a compute stream wait on an event.
     * 
     * <p>Makes all future work submitted to {@code hStream} wait for all work captured in {@code hEvent}. See {@link #cuEventRecord EventRecord} for details on what is captured
     * by an event. The synchronization will be performed efficiently on the device when applicable. {@code hEvent} may be from a different context or device
     * than {@code hStream}.</p>
     *
     * @param hStream stream to wait
     * @param hEvent  event to wait on (may not be {@code NULL}). One of:<br><table><tr><td>{@link #CU_EVENT_WAIT_DEFAULT EVENT_WAIT_DEFAULT}</td><td>{@link #CU_EVENT_WAIT_EXTERNAL EVENT_WAIT_EXTERNAL}</td></tr></table>
     * @param Flags   see {@code CUevent_capture_flags}
     */
    @NativeType("CUresult")
    public static int cuStreamWaitEvent(@NativeType("CUstream") long hStream, @NativeType("CUevent") long hEvent, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.StreamWaitEvent;
        if (CHECKS) {
            check(hEvent);
        }
        return callPPI(hStream, hEvent, Flags, __functionAddress);
    }

    // --- [ cuStreamAddCallback ] ---

    /** Unsafe version of: {@link #cuStreamAddCallback StreamAddCallback} */
    public static int ncuStreamAddCallback(long hStream, long callback, long userData, int flags) {
        long __functionAddress = Functions.StreamAddCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(userData);
        }
        return callPPPI(hStream, callback, userData, flags, __functionAddress);
    }

    /**
     * Add a callback to a compute stream.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This function is slated for eventual deprecation and removal. If you do not require the callback to execute in case of a device error,
     * consider using {@link #cuLaunchHostFunc LaunchHostFunc}. Additionally, this function is not supported with {@link #cuStreamBeginCapture StreamBeginCapture} and {@link #cuStreamEndCapture StreamEndCapture}, unlike
     * {@link #cuLaunchHostFunc LaunchHostFunc}.</p></div>
     * 
     * <p>Adds a callback to be called on the host after all currently enqueued items in the stream have completed. For each {@code cuStreamAddCallback} call,
     * the callback will be executed exactly once. The callback will block later work in the stream until it is finished.</p>
     * 
     * <p>The callback may be passed {@link #CUDA_SUCCESS} or an error code. In the event of a device error, all subsequently executed callbacks will receive an
     * appropriate {@code CUresult}.</p>
     * 
     * <p>Callbacks must not make any CUDA API calls. Attempting to use a CUDA API will result in {@link #CUDA_ERROR_NOT_PERMITTED}. Callbacks must not perform any
     * synchronization that may depend on outstanding device work or other callbacks that are not mandated to run earlier. Callbacks without a mandated order
     * (in independent streams) execute in undefined order and may be serialized.</p>
     * 
     * <p>For the purposes of Unified Memory, callback execution makes a number of guarantees:</p>
     * 
     * <ul>
     * <li>The callback stream is considered idle for the duration of the callback. Thus, for example, a callback may always use memory attached to the
     * callback stream.</li>
     * <li>The start of execution of a callback has the same effect as synchronizing an event recorded in the same stream immediately prior to the callback.
     * It thus synchronizes streams which have been "joined" prior to the callback.</li>
     * <li>Adding device work to any stream does not have the effect of making the stream active until all preceding host functions and stream callbacks have
     * executed. Thus, for example, a callback might use global attached memory even if work has been added to another stream, if the work has been
     * ordered behind the callback with an event.</li>
     * <li>Completion of a callback does not cause a stream to become active except as described above. The callback stream will remain idle if no device work
     * follows the callback, and will remain idle across consecutive callbacks without device work in between. Thus, for example, stream synchronization
     * can be done by signaling from a callback at the end of the stream.</li>
     * </ul>
     *
     * @param hStream  stream to add callback to
     * @param callback the function to call once preceding stream operations are complete
     * @param userData user specified data to be passed to the callback function
     * @param flags    reserved for future use, must be 0
     */
    @NativeType("CUresult")
    public static int cuStreamAddCallback(@NativeType("CUstream") long hStream, @NativeType("void (*) (CUstream, CUresult, void *)") CUstreamCallbackI callback, @NativeType("void *") long userData, @NativeType("unsigned int") int flags) {
        return ncuStreamAddCallback(hStream, callback.address(), userData, flags);
    }

    // --- [ cuStreamBeginCapture ] ---

    /**
     * Begins graph capture on a stream.
     * 
     * <p>Begin graph capture on {@code hStream}. When a stream is in capture mode, all operations pushed into the stream will not be executed, but will instead
     * be captured into a graph, which will be returned via {@link #cuStreamEndCapture StreamEndCapture}. Capture may not be initiated if {@code stream} is {@link #CU_STREAM_LEGACY STREAM_LEGACY}. Capture
     * must be ended on the same stream in which it was initiated, and it may only be initiated if the stream is not already in capture mode. The capture mode
     * may be queried via {@link #cuStreamIsCapturing StreamIsCapturing}. A unique id representing the capture sequence may be queried via {@link #cuStreamGetCaptureInfo StreamGetCaptureInfo}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Kernels captured using this API must not use texture and surface references. Reading or writing through any texture or surface reference is
     * undefined behavior. This restriction does not apply to texture and surface objects.</p></div>
     *
     * @param hStream stream in which to initiate capture
     */
    @NativeType("CUresult")
    public static int cuStreamBeginCapture(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamBeginCapture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamBeginCapture_v2 ] ---

    /**
     * Begins graph capture on a stream.
     * 
     * <p>Begin graph capture on {@code hStream}. When a stream is in capture mode, all operations pushed into the stream will not be executed, but will instead
     * be captured into a graph, which will be returned via {@link #cuStreamEndCapture StreamEndCapture}. Capture may not be initiated if {@code stream} is {@link #CU_STREAM_LEGACY STREAM_LEGACY}. Capture
     * must be ended on the same stream in which it was initiated, and it may only be initiated if the stream is not already in capture mode. The capture mode
     * may be queried via {@link #cuStreamIsCapturing StreamIsCapturing}. A unique id representing the capture sequence may be queried via {@link #cuStreamGetCaptureInfo StreamGetCaptureInfo}.</p>
     * 
     * <p>If {@code mode} is not {@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED}, {@link #cuStreamEndCapture StreamEndCapture} must be called on this stream from the same thread.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Kernels captured using this API must not use texture and surface references. Reading or writing through any texture or surface reference is
     * undefined behavior. This restriction does not apply to texture and surface objects.</p></div>
     *
     * @param hStream stream in which to initiate capture
     * @param mode    controls the interaction of this capture sequence with other API calls that are potentially unsafe. For more details see
     *                {@link #cuThreadExchangeStreamCaptureMode ThreadExchangeStreamCaptureMode}.
     */
    @NativeType("CUresult")
    public static int cuStreamBeginCapture_v2(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureMode") int mode) {
        long __functionAddress = Functions.StreamBeginCapture_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(hStream, mode, __functionAddress);
    }

    // --- [ cuThreadExchangeStreamCaptureMode ] ---

    /** Unsafe version of: {@link #cuThreadExchangeStreamCaptureMode ThreadExchangeStreamCaptureMode} */
    public static int ncuThreadExchangeStreamCaptureMode(long mode) {
        long __functionAddress = Functions.ThreadExchangeStreamCaptureMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mode, __functionAddress);
    }

    /**
     * Swaps the stream capture interaction mode for a thread.
     * 
     * <p>Sets the calling thread's stream capture interaction mode to the value contained in {@code *mode}, and overwrites {@code *mode} with the previous mode
     * for the thread. To facilitate deterministic behavior across function or module boundaries, callers are encouraged to use this API in a push-pop
     * fashion:</p>
     * 
     * <pre><code>
     * CUstreamCaptureMode mode = desiredMode
     * cuThreadExchangeStreamCaptureMode(&amp;mode);
     * ...
     * cuThreadExchangeStreamCaptureMode(&amp;mode); // restore previous mode</code></pre>
     * 
     * <p>During stream capture (see {@link #cuStreamBeginCapture StreamBeginCapture}), some actions, such as a call to {@code cudaMalloc}, may be unsafe. In the case of {@code cudaMalloc},
     * the operation is not enqueued asynchronously to a stream, and is not observed by stream capture. Therefore, if the sequence of operations captured via
     * {@link #cuStreamBeginCapture StreamBeginCapture} depended on the allocation being replayed whenever the graph is launched, the captured graph would be invalid.</p>
     * 
     * <p>Therefore, stream capture places restrictions on API calls that can be made within or concurrently to a {@link #cuStreamBeginCapture StreamBeginCapture}-{@link #cuStreamEndCapture StreamEndCapture}
     * sequence. This behavior can be controlled via this API and flags to {@code cuStreamBeginCapture}.</p>
     * 
     * <p>A thread's mode is one of the following:</p>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_GLOBAL STREAM_CAPTURE_MODE_GLOBAL}: This is the default mode.
     * 
     * <p>If the local thread has an ongoing capture sequence that was not initiated with {@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED} at {@link #cuStreamBeginCapture StreamBeginCapture}, or if any
     * other thread has a concurrent capture sequence initiated with {@link #CU_STREAM_CAPTURE_MODE_GLOBAL STREAM_CAPTURE_MODE_GLOBAL}, this thread is prohibited from potentially unsafe API
     * calls.</p></li>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_THREAD_LOCAL STREAM_CAPTURE_MODE_THREAD_LOCAL}: If the local thread has an ongoing capture sequence not initiated with {@code CU_STREAM_CAPTURE_MODE_RELAXED},
     * it is prohibited from potentially unsafe API calls. Concurrent capture sequences in other threads are ignored.</li>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED}: The local thread is not prohibited from potentially unsafe API calls. Note that the thread is still prohibited from
     * API calls which necessarily conflict with stream capture, for example, attempting {@link #cuEventQuery EventQuery} on an event that was last recorded inside a capture
     * sequence.</li>
     * </ul>
     *
     * @param mode pointer to mode value to swap with the current mode
     */
    @NativeType("CUresult")
    public static int cuThreadExchangeStreamCaptureMode(@NativeType("CUstreamCaptureMode *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return ncuThreadExchangeStreamCaptureMode(memAddress(mode));
    }

    // --- [ cuStreamEndCapture ] ---

    /** Unsafe version of: {@link #cuStreamEndCapture StreamEndCapture} */
    public static int ncuStreamEndCapture(long hStream, long phGraph) {
        long __functionAddress = Functions.StreamEndCapture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, phGraph, __functionAddress);
    }

    /**
     * Ends capture on a stream, returning the captured graph.
     * 
     * <p>End capture on {@code hStream}, returning the captured graph via {@code phGraph}. Capture must have been initiated on {@code hStream} via a call to
     * {@link #cuStreamBeginCapture StreamBeginCapture}. If capture was invalidated, due to a violation of the rules of stream capture, then a NULL graph will be returned.</p>
     * 
     * <p>If the {@code mode} argument to {@link #cuStreamBeginCapture StreamBeginCapture} was not {@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED}, this call must be from the same thread as
     * {@link #cuStreamBeginCapture StreamBeginCapture}.</p>
     *
     * @param hStream stream to query
     * @param phGraph the captured graph
     */
    @NativeType("CUresult")
    public static int cuStreamEndCapture(@NativeType("CUstream") long hStream, @NativeType("CUgraph *") PointerBuffer phGraph) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuStreamEndCapture(hStream, memAddress(phGraph));
    }

    // --- [ cuStreamIsCapturing ] ---

    /** Unsafe version of: {@link #cuStreamIsCapturing StreamIsCapturing} */
    public static int ncuStreamIsCapturing(long hStream, long captureStatus) {
        long __functionAddress = Functions.StreamIsCapturing;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, captureStatus, __functionAddress);
    }

    /**
     * Returns a stream's capture status.
     * 
     * <p>Return the capture status of {@code hStream} via {@code captureStatus}. After a successful call, {@code *captureStatus} will contain one of the
     * following:</p>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_CAPTURE_STATUS_NONE STREAM_CAPTURE_STATUS_NONE}: The stream is not capturing.</li>
     * <li>{@link #CU_STREAM_CAPTURE_STATUS_ACTIVE STREAM_CAPTURE_STATUS_ACTIVE}: The stream is capturing.</li>
     * <li>{@link #CU_STREAM_CAPTURE_STATUS_INVALIDATED STREAM_CAPTURE_STATUS_INVALIDATED}: The stream was capturing but an error has invalidated the capture sequence. The capture sequence must be
     * terminated with {@link #cuStreamEndCapture StreamEndCapture} on the stream where it was initiated in order to continue using {@code hStream}.</li>
     * </ul>
     * 
     * <p>Note that, if this is called on {@link #CU_STREAM_LEGACY STREAM_LEGACY} (the "null stream") while a blocking stream in the same context is capturing, it will return
     * {@link #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT} and {@code *captureStatus} is unspecified after the call. The blocking stream capture is not invalidated.</p>
     * 
     * <p>When a blocking stream is capturing, the legacy stream is in an unusable state until the blocking stream capture is terminated. The legacy stream is
     * not supported for stream capture, but attempted use would have an implicit dependency on the capturing stream(s).</p>
     *
     * @param hStream       stream to query
     * @param captureStatus returns the stream's capture status
     */
    @NativeType("CUresult")
    public static int cuStreamIsCapturing(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus) {
        if (CHECKS) {
            check(captureStatus, 1);
        }
        return ncuStreamIsCapturing(hStream, memAddress(captureStatus));
    }

    // --- [ cuStreamGetCaptureInfo ] ---

    /** Unsafe version of: {@link #cuStreamGetCaptureInfo StreamGetCaptureInfo} */
    public static int ncuStreamGetCaptureInfo(long hStream, long captureStatus, long id) {
        long __functionAddress = Functions.StreamGetCaptureInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(hStream, captureStatus, id, __functionAddress);
    }

    /**
     * Query capture status of a stream.
     * 
     * <p>Query the capture status of a stream and and get an id for the capture sequence, which is unique over the lifetime of the process.</p>
     * 
     * <p>If called on {@link #CU_STREAM_LEGACY STREAM_LEGACY} (the "null stream") while a stream not created with {@link #CU_STREAM_NON_BLOCKING STREAM_NON_BLOCKING} is capturing, returns
     * {@link #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT}.</p>
     * 
     * <p>A valid id is returned only if both of the following are true:</p>
     * 
     * <ul>
     * <li>the call returns {@link NVRTC#NVRTC_SUCCESS SUCCESS}</li>
     * <li>{@code captureStatus} is set to {@link #CU_STREAM_CAPTURE_STATUS_ACTIVE STREAM_CAPTURE_STATUS_ACTIVE}</li>
     * </ul>
     */
    @NativeType("CUresult")
    public static int cuStreamGetCaptureInfo(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus, @NativeType("cuuint64_t *") LongBuffer id) {
        if (CHECKS) {
            check(captureStatus, 1);
            check(id, 1);
        }
        return ncuStreamGetCaptureInfo(hStream, memAddress(captureStatus), memAddress(id));
    }

    // --- [ cuStreamGetCaptureInfo_v2 ] ---

    /** Unsafe version of: {@link #cuStreamGetCaptureInfo_v2 StreamGetCaptureInfo_v2} */
    public static int ncuStreamGetCaptureInfo_v2(long hStream, long captureStatus_out, long id_out, long graph_out, long dependencies_out, long numDependencies_out) {
        long __functionAddress = Functions.StreamGetCaptureInfo_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(hStream, captureStatus_out, id_out, graph_out, dependencies_out, numDependencies_out, __functionAddress);
    }

    /**
     * Query a stream's capture state (11.3+).
     * 
     * <p>Query stream state related to stream capture.</p>
     * 
     * <p>If called on {@link #CU_STREAM_LEGACY STREAM_LEGACY} (the "null stream") while a stream not created with {@link #CU_STREAM_NON_BLOCKING STREAM_NON_BLOCKING} is capturing, returns
     * {@link #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT}.</p>
     * 
     * <p>Valid data (other than capture status) is returned only if both of the following are true:</p>
     * 
     * <ul>
     * <li>the call returns CUDA_SUCCESS</li>
     * <li>the returned capture status is {@link #CU_STREAM_CAPTURE_STATUS_ACTIVE STREAM_CAPTURE_STATUS_ACTIVE}</li>
     * </ul>
     * 
     * <p>This version of {@code cuStreamGetCaptureInfo} is introduced in CUDA 11.3 and will supplant the previous version in 12.0. Developers requiring
     * compatibility across minor versions to CUDA 11.0 (driver version 445) should use {@link #cuStreamGetCaptureInfo StreamGetCaptureInfo} or include a fallback path.</p>
     *
     * @param hStream             the stream to query
     * @param captureStatus_out   location to return the capture status of the stream; required
     * @param id_out              optional location to return an id for the capture sequence, which is unique over the lifetime of the process
     * @param graph_out           optional location to return the graph being captured into.
     *                            
     *                            <p>All operations other than destroy and node removal are permitted on the graph while the capture sequence is in progress. This API does not transfer
     *                            ownership of the graph, which is transferred or destroyed at {@link #cuStreamEndCapture StreamEndCapture}. Note that the graph handle may be invalidated before end of
     *                            capture for certain errors. Nodes that are or become unreachable from the original stream at {@link #cuStreamEndCapture StreamEndCapture} due to direct actions on the graph
     *                            do not trigger {@link #CUDA_ERROR_STREAM_CAPTURE_UNJOINED}.</p>
     * @param dependencies_out    optional location to store a pointer to an array of nodes.
     *                            
     *                            <p>The next node to be captured in the stream will depend on this set of nodes, absent operations such as event wait which modify this set. The array
     *                            pointer is valid until the next API call which operates on the stream or until end of capture. The node handles may be copied out and are valid
     *                            until they or the graph is destroyed. The driver-owned array may also be passed directly to APIs that operate on the graph (not the stream) without
     *                            copying.</p>
     * @param numDependencies_out optional location to store the size of the array returned in {@code dependencies_out}
     */
    @NativeType("CUresult")
    public static int cuStreamGetCaptureInfo_v2(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus_out, @Nullable @NativeType("cuuint64_t *") LongBuffer id_out, @Nullable @NativeType("CUgraph *") PointerBuffer graph_out, @Nullable @NativeType("CUgraphNode const **") PointerBuffer dependencies_out, @Nullable @NativeType("size_t *") PointerBuffer numDependencies_out) {
        if (CHECKS) {
            check(captureStatus_out, 1);
            checkSafe(id_out, 1);
            checkSafe(graph_out, 1);
            checkSafe(dependencies_out, 1);
            checkSafe(numDependencies_out, 1);
        }
        return ncuStreamGetCaptureInfo_v2(hStream, memAddress(captureStatus_out), memAddressSafe(id_out), memAddressSafe(graph_out), memAddressSafe(dependencies_out), memAddressSafe(numDependencies_out));
    }

    // --- [ cuStreamUpdateCaptureDependencies ] ---

    /** Unsafe version of: {@link #cuStreamUpdateCaptureDependencies StreamUpdateCaptureDependencies} */
    public static int ncuStreamUpdateCaptureDependencies(long hStream, long dependencies, long numDependencies, int flags) {
        long __functionAddress = Functions.StreamUpdateCaptureDependencies;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(hStream, dependencies, numDependencies, flags, __functionAddress);
    }

    /**
     * Update the set of dependencies in a capturing stream (11.3+).
     * 
     * <p>Modifies the dependency set of a capturing stream. The dependency set is the set of nodes that the next captured node in the stream will depend on.</p>
     * 
     * <p>Valid flags are {@link #CU_STREAM_ADD_CAPTURE_DEPENDENCIES STREAM_ADD_CAPTURE_DEPENDENCIES} and {@link #CU_STREAM_SET_CAPTURE_DEPENDENCIES STREAM_SET_CAPTURE_DEPENDENCIES}. These control whether the set passed to the API is added
     * to the existing set or replaces it. A flags value of 0 defaults to {@link #CU_STREAM_ADD_CAPTURE_DEPENDENCIES STREAM_ADD_CAPTURE_DEPENDENCIES}.</p>
     * 
     * <p>Nodes that are removed from the dependency set via this API do not result in {@link #CUDA_ERROR_STREAM_CAPTURE_UNJOINED} if they are unreachable from the
     * stream at {@link #cuStreamEndCapture StreamEndCapture}.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_ILLEGAL_STATE} if the stream is not capturing.</p>
     * 
     * <p>This API is new in CUDA 11.3. Developers requiring compatibility across minor versions to CUDA 11.0 should not use this API or provide a fallback.</p>
     */
    @NativeType("CUresult")
    public static int cuStreamUpdateCaptureDependencies(@NativeType("CUstream") long hStream, @NativeType("CUgraphNode *") PointerBuffer dependencies, @NativeType("unsigned int") int flags) {
        return ncuStreamUpdateCaptureDependencies(hStream, memAddress(dependencies), dependencies.remaining(), flags);
    }

    // --- [ cuStreamAttachMemAsync ] ---

    /**
     * Attach memory to a stream asynchronously.
     * 
     * <p>Enqueues an operation in {@code hStream} to specify stream association of {@code length} bytes of memory starting from {@code dptr}. This function is a
     * stream-ordered operation, meaning that it is dependent on, and will only take effect when, previous work in stream has completed. Any previous
     * association is automatically replaced.</p>
     * 
     * <p>{@code dptr} must point to one of the following types of memories:</p>
     * 
     * <ul>
     * <li>managed memory declared using the __managed__ keyword or allocated with {@link #cuMemAllocManaged MemAllocManaged}.</li>
     * <li>a valid host-accessible region of system-allocated pageable memory. This type of memory may only be specified if the device associated with the
     * stream reports a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS}.</li>
     * </ul>
     * 
     * <p>For managed allocations, {@code length} must be either zero or the entire allocation's size. Both indicate that the entire allocation's stream
     * association is being changed. Currently, it is not possible to change stream association for a portion of a managed allocation.</p>
     * 
     * <p>For pageable host allocations, {@code length} must be non-zero.</p>
     * 
     * <p>The stream association is specified using {@code flags} which must be one of {@code CUmemAttach_flags}. If the {@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL} flag is specified,
     * the memory can be accessed by any stream on any device. If the {@link #CU_MEM_ATTACH_HOST MEM_ATTACH_HOST} flag is specified, the program makes a guarantee that it won't access
     * the memory on the device from any stream on a device that has a zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}. If
     * the {@link #CU_MEM_ATTACH_SINGLE MEM_ATTACH_SINGLE} flag is specified and {@code hStream} is associated with a device that has a zero value for the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}, the program makes a guarantee that it will only access the memory on the device from {@code hStream}.
     * It is illegal to attach singly to the NULL stream, because the NULL stream is a virtual global stream and not a specific stream. An error will be
     * returned in this case.</p>
     * 
     * <p>When memory is associated with a single stream, the Unified Memory system will allow CPU access to this memory region so long as all operations in
     * {@code hStream} have completed, regardless of whether other streams are active. In effect, this constrains exclusive ownership of the managed memory
     * region by an active GPU to per-stream activity instead of whole-GPU activity.</p>
     * 
     * <p>Accessing memory on the device from streams that are not associated with it will produce undefined results. No error checking is performed by the
     * Unified Memory system to ensure that kernels launched into other streams do not access this region.</p>
     * 
     * <p>It is a program's responsibility to order calls to {@link #cuStreamAttachMemAsync StreamAttachMemAsync} via events, synchronization or other means to ensure legal access to memory
     * at all times. Data visibility and coherency will be changed appropriately for all kernels which follow a stream-association change.</p>
     * 
     * <p>If {@code hStream} is destroyed while data is associated with it, the association is removed and the association reverts to the default visibility of
     * the allocation as specified at {@link #cuMemAllocManaged MemAllocManaged}. For __managed__ variables, the default association is always {@link #CU_MEM_ATTACH_GLOBAL MEM_ATTACH_GLOBAL}. Note that
     * destroying a stream is an asynchronous operation, and as a result, the change to default association won't happen until all work in the stream has
     * completed.</p>
     *
     * @param hStream stream in which to enqueue the attach operation
     * @param dptr    pointer to memory (must be a pointer to managed memory or to a valid host-accessible region of system-allocated pageable memory)
     * @param length  length of memory
     * @param flags   must be one of {@code CUmemAttach_flags}
     */
    @NativeType("CUresult")
    public static int cuStreamAttachMemAsync(@NativeType("CUstream") long hStream, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long length, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamAttachMemAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(dptr);
        }
        return callPPPI(hStream, dptr, length, flags, __functionAddress);
    }

    // --- [ cuStreamQuery ] ---

    /**
     * Determine status of a compute stream.
     * 
     * <p>Returns {@link #CUDA_SUCCESS} if all operations in the stream specified by {@code hStream} have completed, or {@link #CUDA_ERROR_NOT_READY} if not.</p>
     * 
     * <p>For the purposes of Unified Memory, a return value of {@link #CUDA_SUCCESS} is equivalent to having called {@link #cuStreamSynchronize StreamSynchronize}.</p>
     *
     * @param hStream stream to query status of
     */
    @NativeType("CUresult")
    public static int cuStreamQuery(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamQuery;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamSynchronize ] ---

    /**
     * Wait until a stream's tasks are completed.
     * 
     * <p>Waits until the device has completed all operations in the stream specified by {@code hStream}. If the context was created with the
     * {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} flag, the CPU thread will block until the stream is finished with all of its tasks.</p>
     *
     * @param hStream stream to wait for
     */
    @NativeType("CUresult")
    public static int cuStreamSynchronize(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamSynchronize;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamDestroy ] ---

    /**
     * Destroys a stream.
     * 
     * <p>Destroys the stream specified by {@code hStream}.</p>
     * 
     * <p>In case the device is still doing work in the stream {@code hStream} when {@link #cuStreamDestroy StreamDestroy} is called, the function will return immediately and the
     * resources associated with {@code hStream} will be released automatically once the device has completed all work in {@code hStream}.</p>
     *
     * @param hStream stream to destroy
     */
    @NativeType("CUresult")
    public static int cuStreamDestroy(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamDestroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamCopyAttributes ] ---

    /**
     * Copies attributes from source stream to destination stream.
     * 
     * <p>Copies attributes from source stream {@code src} to destination stream {@code dst}. Both streams must have the same context.</p>
     *
     * @param dst destination stream
     * @param src source stream For list of attributes see {@code CUstreamAttrID}
     */
    @NativeType("CUresult")
    public static int cuStreamCopyAttributes(@NativeType("CUstream") long dst, @NativeType("CUstream") long src) {
        long __functionAddress = Functions.StreamCopyAttributes;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dst, src, __functionAddress);
    }

    // --- [ cuStreamGetAttribute ] ---

    /** Unsafe version of: {@link #cuStreamGetAttribute StreamGetAttribute} */
    public static int ncuStreamGetAttribute(long hStream, int attr, long value_out) {
        long __functionAddress = Functions.StreamGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, attr, value_out, __functionAddress);
    }

    /**
     * Queries stream attribute.
     * 
     * <p>Queries attribute {@code attr} from {@code hStream} and stores it in corresponding member of {@code value_out}.</p>
     */
    @NativeType("CUresult")
    public static int cuStreamGetAttribute(@NativeType("CUstream") long hStream, @NativeType("CUstreamAttrID") int attr, @NativeType("CUstreamAttrValue *") CUstreamAttrValue value_out) {
        return ncuStreamGetAttribute(hStream, attr, value_out.address());
    }

    // --- [ cuStreamSetAttribute ] ---

    /** Unsafe version of: {@link #cuStreamSetAttribute StreamSetAttribute} */
    public static int ncuStreamSetAttribute(long hStream, int attr, long value) {
        long __functionAddress = Functions.StreamSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, attr, value, __functionAddress);
    }

    /**
     * Sets stream attribute.
     * 
     * <p>Sets attribute {@code attr} on {@code hStream} from corresponding attribute of {@code value}. The updated attribute will be applied to subsequent work
     * submitted to the stream. It will not affect previously submitted work.</p>
     */
    @NativeType("CUresult")
    public static int cuStreamSetAttribute(@NativeType("CUstream") long hStream, @NativeType("CUstreamAttrID") int attr, @NativeType("CUstreamAttrValue const *") CUstreamAttrValue value) {
        return ncuStreamSetAttribute(hStream, attr, value.address());
    }

    // --- [ cuEventCreate ] ---

    /** Unsafe version of: {@link #cuEventCreate EventCreate} */
    public static int ncuEventCreate(long phEvent, int Flags) {
        long __functionAddress = Functions.EventCreate;
        return callPI(phEvent, Flags, __functionAddress);
    }

    /**
     * Creates an event.
     * 
     * <p>Creates an event {@code *phEvent} for the current context with the flags specified via {@code Flags}. Valid flags include:</p>
     * 
     * <ul>
     * <li>{@link #CU_EVENT_DEFAULT EVENT_DEFAULT}: Default event creation flag.</li>
     * <li>{@link #CU_EVENT_BLOCKING_SYNC EVENT_BLOCKING_SYNC}: Specifies that the created event should use blocking synchronization. A CPU thread that uses {@link #cuEventSynchronize EventSynchronize} to
     * wait on an event created with this flag will block until the event has actually been recorded.</li>
     * <li>{@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING}: Specifies that the created event does not need to record timing data. Events created with this flag specified and the
     * {@link #CU_EVENT_BLOCKING_SYNC EVENT_BLOCKING_SYNC} flag not specified will provide the best performance when used with {@link #cuStreamWaitEvent StreamWaitEvent} and {@link #cuEventQuery EventQuery}.</li>
     * <li>{@link #CU_EVENT_INTERPROCESS EVENT_INTERPROCESS}: Specifies that the created event may be used as an interprocess event by {@link #cuIpcGetEventHandle IpcGetEventHandle}. {@link #CU_EVENT_INTERPROCESS EVENT_INTERPROCESS}
     * must be specified along with {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING}.</li>
     * </ul>
     *
     * @param phEvent returns newly created event
     * @param Flags   event creation flags
     */
    @NativeType("CUresult")
    public static int cuEventCreate(@NativeType("CUevent *") PointerBuffer phEvent, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(phEvent, 1);
        }
        return ncuEventCreate(memAddress(phEvent), Flags);
    }

    // --- [ cuEventRecord ] ---

    /**
     * Records an event.
     * 
     * <p>Captures in {@code hEvent} the contents of {@code hStream} at the time of this call. {@code hEvent} and {@code hStream} must be from the same context.
     * Calls such as {@link #cuEventQuery EventQuery} or {@link #cuStreamWaitEvent StreamWaitEvent} will then examine or wait for completion of the work that was captured. Uses of {@code hStream}
     * after this call do not modify {@code hEvent}. See note on default stream behavior for what is captured in the default case.</p>
     * 
     * <p>{@link #cuEventRecord EventRecord} can be called multiple times on the same event and will overwrite the previously captured state. Other APIs such as
     * {@link #cuStreamWaitEvent StreamWaitEvent} use the most recently captured state at the time of the API call, and are not affected by later calls to {@link #cuEventRecord EventRecord}.
     * Before the first call to {@link #cuEventRecord EventRecord}, an event represents an empty set of work, so for example {@link #cuEventQuery EventQuery} would return {@link #CUDA_SUCCESS}.</p>
     *
     * @param hEvent  event to record
     * @param hStream stream to record event for
     */
    @NativeType("CUresult")
    public static int cuEventRecord(@NativeType("CUevent") long hEvent, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.EventRecord;
        if (CHECKS) {
            check(hEvent);
        }
        return callPPI(hEvent, hStream, __functionAddress);
    }

    // --- [ cuEventRecordWithFlags ] ---

    /**
     * Records an event.
     * 
     * <p>Captures in {@code hEvent} the contents of {@code hStream} at the time of this call. {@code hEvent} and {@code hStream} must be from the same context.
     * Calls such as {@link #cuEventQuery EventQuery} or {@link #cuStreamWaitEvent StreamWaitEvent} will then examine or wait for completion of the work that was captured. Uses of {@code hStream}
     * after this call do not modify {@code hEvent}. See note on default stream behavior for what is captured in the default case.</p>
     * 
     * <p>{@link #cuEventRecordWithFlags EventRecordWithFlags} can be called multiple times on the same event and will overwrite the previously captured state. Other APIs such as
     * {@link #cuStreamWaitEvent StreamWaitEvent} use the most recently captured state at the time of the API call, and are not affected by later calls to
     * {@link #cuEventRecordWithFlags EventRecordWithFlags}. Before the first call to {@link #cuEventRecordWithFlags EventRecordWithFlags}, an event represents an empty set of work, so for example
     * {@link #cuEventQuery EventQuery} would return {@link #CUDA_SUCCESS}.</p>
     * 
     * <p>flags include:</p>
     * 
     * <ul>
     * <li>{@link #CU_EVENT_RECORD_DEFAULT EVENT_RECORD_DEFAULT}: Default event creation flag.</li>
     * <li>{@link #CU_EVENT_RECORD_EXTERNAL EVENT_RECORD_EXTERNAL}: Event is captured in the graph as an external event node when performing stream capture. This flag is invalid outside
     * of stream capture.</li>
     * </ul>
     *
     * @param hEvent  event to record
     * @param hStream stream to record event for
     * @param flags   see {@code CUevent_capture_flags}
     */
    @NativeType("CUresult")
    public static int cuEventRecordWithFlags(@NativeType("CUevent") long hEvent, @NativeType("CUstream") long hStream, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.EventRecordWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(hEvent);
        }
        return callPPI(hEvent, hStream, flags, __functionAddress);
    }

    // --- [ cuEventQuery ] ---

    /**
     * Queries an event's status.
     * 
     * <p>Queries the status of all work currently captured by {@code hEvent}. See {@link #cuEventRecord EventRecord} for details on what is captured by an event.</p>
     * 
     * <p>Returns {@link #CUDA_SUCCESS} if all captured work has been completed, or {@link #CUDA_ERROR_NOT_READY} if any captured work is incomplete.</p>
     * 
     * <p>For the purposes of Unified Memory, a return value of {@link #CUDA_SUCCESS} is equivalent to having called {@link #cuEventSynchronize EventSynchronize}.</p>
     *
     * @param hEvent event to query
     */
    @NativeType("CUresult")
    public static int cuEventQuery(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventQuery;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventSynchronize ] ---

    /**
     * Waits for an event to complete.
     * 
     * <p>Waits until the completion of all work currently captured in {@code hEvent}. See {@link #cuEventRecord EventRecord} for details on what is captured by an event.</p>
     * 
     * <p>Waiting for an event that was created with the {@link #CU_EVENT_BLOCKING_SYNC EVENT_BLOCKING_SYNC} flag will cause the calling CPU thread to block until the event has been
     * completed by the device. If the {@link #CU_EVENT_BLOCKING_SYNC EVENT_BLOCKING_SYNC} flag has not been set, then the CPU thread will busy-wait until the event has been completed
     * by the device.</p>
     *
     * @param hEvent event to wait for
     */
    @NativeType("CUresult")
    public static int cuEventSynchronize(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventSynchronize;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventDestroy ] ---

    /**
     * Destroys an event.
     * 
     * <p>Destroys the event specified by {@code hEvent}.</p>
     * 
     * <p>An event may be destroyed before it is complete (i.e., while {@link #cuEventQuery EventQuery} would return {@link #CUDA_ERROR_NOT_READY}). In this case, the call does not
     * block on completion of the event, and any associated resources will automatically be released asynchronously at completion.</p>
     *
     * @param hEvent event to destroy
     */
    @NativeType("CUresult")
    public static int cuEventDestroy(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventElapsedTime ] ---

    /** Unsafe version of: {@link #cuEventElapsedTime EventElapsedTime} */
    public static int ncuEventElapsedTime(long pMilliseconds, long hStart, long hEnd) {
        long __functionAddress = Functions.EventElapsedTime;
        if (CHECKS) {
            check(hStart);
            check(hEnd);
        }
        return callPPPI(pMilliseconds, hStart, hEnd, __functionAddress);
    }

    /**
     * Computes the elapsed time between two events.
     * 
     * <p>Computes the elapsed time between two events (in milliseconds with a resolution of around 0.5 microseconds).</p>
     * 
     * <p>If either event was last recorded in a non-{@code NULL} stream, the resulting time may be greater than expected (even if both used the same stream handle).
     * This happens because the {@link #cuEventRecord EventRecord} operation takes place asynchronously and there is no guarantee that the measured latency is actually just
     * between the two events. Any number of other different stream operations could execute in between the two measured events, thus altering the timing in a
     * significant way.</p>
     * 
     * <p>If {@link #cuEventRecord EventRecord} has not been called on either event then {@link #CUDA_ERROR_INVALID_HANDLE} is returned. If {@link #cuEventRecord EventRecord} has been called on both
     * events but one or both of them has not yet been completed (that is, {@link #cuEventQuery EventQuery} would return {@link #CUDA_ERROR_NOT_READY} on at least one of the
     * events), {@link #CUDA_ERROR_NOT_READY} is returned. If either event was created with the {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} flag, then this function will return
     * {@link #CUDA_ERROR_INVALID_HANDLE}.</p>
     *
     * @param pMilliseconds time between {@code hStart} and {@code hEnd} in ms
     * @param hStart        starting event
     * @param hEnd          ending event
     */
    @NativeType("CUresult")
    public static int cuEventElapsedTime(@NativeType("float *") FloatBuffer pMilliseconds, @NativeType("CUevent") long hStart, @NativeType("CUevent") long hEnd) {
        if (CHECKS) {
            check(pMilliseconds, 1);
        }
        return ncuEventElapsedTime(memAddress(pMilliseconds), hStart, hEnd);
    }

    // --- [ cuImportExternalMemory ] ---

    /** Unsafe version of: {@link #cuImportExternalMemory ImportExternalMemory} */
    public static int ncuImportExternalMemory(long extMem_out, long memHandleDesc) {
        long __functionAddress = Functions.ImportExternalMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(extMem_out, memHandleDesc, __functionAddress);
    }

    /**
     * Imports an external memory object.
     * 
     * <p>Imports an externally allocated memory object and returns a handle to that in {@code extMem_out}.</p>
     * 
     * <p>The properties of the handle being imported must be described in {@code memHandleDesc}.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD}, then {@code ::handle::fd} must be a valid file descriptor referencing a memory object.
     * Ownership of the file descriptor is transferred to the CUDA driver when the handle is imported successfully. Performing any operations on the file
     * descriptor after it is imported results in undefined behavior.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32 EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32}, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
     * must not be {@code NULL}. If {@code ::handle::win32::handle} is not {@code NULL}, then it must represent a valid shared NT handle that references a memory object.
     * Ownership of this handle is not transferred to CUDA after the import operation, so the application must release the handle using the appropriate system
     * call. If {@code ::handle::win32::name} is not NULL, then it must point to a NULL-terminated array of UTF-16 characters that
     * refers to a memory object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT}, then {@code ::handle::win32::handle} must be non-{@code NULL} and
     * {@code ::handle::win32::name} must be {@code NULL}. The handle specified must be a globally shared KMT handle. This handle does not hold a reference to the
     * underlying object, and thus will be invalid when all references to the memory object are destroyed.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP}, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
     * must not be {@code NULL}. If {@code ::handle::win32::handle} is not {@code NULL}, then it must represent a valid shared NT handle that is returned by
     * {@code ID3D12Device::CreateSharedHandle} when referring to a {@code ID3D12Heap} object. This handle holds a reference to the underlying object. If
     * {@code ::handle::win32::name} is not {@code NULL}, then it must point to a {@code NULL}-terminated array of UTF-16 characters that refers to a {@code ID3D12Heap}
     * object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE}, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
     * must not be NULL. If {@code ::handle::win32::handle} is not {@code NULL}, then it must represent a valid shared NT handle that is returned by
     * {@code ID3D12Device::CreateSharedHandle} when referring to a {@code ID3D12Resource} object. This handle holds a reference to the underlying object. If
     * {@code ::handle::win32::name} is not {@code NULL}, then it must point to a {@code NULL}-terminated array of UTF-16 characters that refers to a {@code ID3D12Resource}
     * object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE}, then {@code ::handle::win32::handle} must represent a valid shared NT handle that is\
     * returned by {@code IDXGIResource1::CreateSharedHandle} when referring to a {@code ID3D11Resource} object. If {@code ::handle::win32::name} is not
     * {@code NULL}, then it must point to a {@code NULL}-terminated array of UTF-16 characters that refers to a {@code ID3D11Resource} object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT}, then {@code ::handle::win32::handle} must represent a valid shared KMT handle
     * that is returned by {@code IDXGIResource::GetSharedHandle} when referring to a {@code ID3D11Resource} object and {@code ::handle::win32::name} must be
     * {@code NULL}.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}, then {@code ::handle::nvSciBufObject} must be non-{@code NULL} and reference a valid
     * {@code NvSciBuf} object. If the {@code NvSciBuf} object imported into CUDA is also mapped by other drivers, then the application must use
     * {@link #cuWaitExternalSemaphoresAsync WaitExternalSemaphoresAsync} or {@link #cuSignalExternalSemaphoresAsync SignalExternalSemaphoresAsync} as appropriate barriers to maintain coherence between CUDA and the other drivers.
     * See {@link #CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC} and {@link #CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC} for memory synchronization.</p>
     * 
     * <p>The size of the memory object must be specified in {@code ::size}.</p>
     * 
     * <p>Specifying the flag {@link #CUDA_EXTERNAL_MEMORY_DEDICATED} in {@code ::flags} indicates that the resource is a dedicated resource. The definition of what a
     * dedicated resource is outside the scope of this extension. This flag must be set if {@code ::type} is one of the following:</p>
     * 
     * <ul>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE}</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE}</li>
     * <li>{@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT}</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If the Vulkan memory imported into CUDA is mapped on the CPU then the application must use
     * {@code vkInvalidateMappedMemoryRanges}/{@code vkFlushMappedMemoryRanges} as well as appropriate Vulkan pipeline barriers to maintain coherence between
     * CPU and GPU. For more information on these APIs, please refer to "Synchronization and Cache Control" chapter from Vulkan specification.</p></div>
     *
     * @param extMem_out    returned handle to an external memory object
     * @param memHandleDesc memory import handle descriptor
     */
    @NativeType("CUresult")
    public static int cuImportExternalMemory(@NativeType("CUexternalMemory *") PointerBuffer extMem_out, @NativeType("CUDA_EXTERNAL_MEMORY_HANDLE_DESC const *") CUDA_EXTERNAL_MEMORY_HANDLE_DESC memHandleDesc) {
        if (CHECKS) {
            check(extMem_out, 1);
        }
        return ncuImportExternalMemory(memAddress(extMem_out), memHandleDesc.address());
    }

    // --- [ cuExternalMemoryGetMappedBuffer ] ---

    /** Unsafe version of: {@link #cuExternalMemoryGetMappedBuffer ExternalMemoryGetMappedBuffer} */
    public static int ncuExternalMemoryGetMappedBuffer(long devPtr, long extMem, long bufferDesc) {
        long __functionAddress = Functions.ExternalMemoryGetMappedBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(extMem);
        }
        return callPPPI(devPtr, extMem, bufferDesc, __functionAddress);
    }

    /**
     * Maps a buffer onto an imported memory object.
     * 
     * <p>Maps a buffer onto an imported memory object and returns a device pointer in {@code devPtr}.</p>
     * 
     * <p>The properties of the buffer being mapped must be described in {@code bufferDesc}.</p>
     * 
     * <p>The offset and size have to be suitably aligned to match the requirements of the external API. Mapping two buffers whose ranges overlap may or may not
     * result in the same virtual address being returned for the overlapped portion. In such cases, the application must ensure that all accesses to that
     * region from the GPU are volatile. Otherwise writes made via one address are not guaranteed to be visible via the other address, even if they're issued
     * by the same thread. It is recommended that applications map the combined range instead of mapping separate buffers and then apply the appropriate
     * offsets to the returned pointer to derive the individual buffers.</p>
     * 
     * <p>The returned pointer {@code devPtr} must be freed using {@link #cuMemFree MemFree}.</p>
     *
     * @param devPtr     returned device pointer to buffer
     * @param extMem     handle to external memory object
     * @param bufferDesc buffer descriptor
     */
    @NativeType("CUresult")
    public static int cuExternalMemoryGetMappedBuffer(@NativeType("CUdeviceptr *") PointerBuffer devPtr, @NativeType("CUexternalMemory") long extMem, @NativeType("CUDA_EXTERNAL_MEMORY_BUFFER_DESC const *") CUDA_EXTERNAL_MEMORY_BUFFER_DESC bufferDesc) {
        if (CHECKS) {
            check(devPtr, 1);
        }
        return ncuExternalMemoryGetMappedBuffer(memAddress(devPtr), extMem, bufferDesc.address());
    }

    // --- [ cuExternalMemoryGetMappedMipmappedArray ] ---

    /** Unsafe version of: {@link #cuExternalMemoryGetMappedMipmappedArray ExternalMemoryGetMappedMipmappedArray} */
    public static int ncuExternalMemoryGetMappedMipmappedArray(long mipmap, long extMem, long mipmapDesc) {
        long __functionAddress = Functions.ExternalMemoryGetMappedMipmappedArray;
        if (CHECKS) {
            check(__functionAddress);
            check(extMem);
        }
        return callPPPI(mipmap, extMem, mipmapDesc, __functionAddress);
    }

    /**
     * Maps a CUDA mipmapped array onto an external memory object.
     * 
     * <p>Maps a CUDA mipmapped array onto an external object and returns a handle to it in {@code mipmap}.</p>
     * 
     * <p>The properties of the CUDA mipmapped array being mapped must be described in {@code mipmapDesc}.</p>
     * 
     * <p>{@code ::offset} is the offset in the memory object where the base level of the mipmap chain is. {@code ::arrayDesc} describes the format, dimensions
     * and type of the base level of the mipmap chain. For further details on these parameters, please refer to the documentation for {@link #cuMipmappedArrayCreate MipmappedArrayCreate}.
     * Note that if the mipmapped array is bound as a color target in the graphics API, then the flag {@link #CUDA_ARRAY3D_COLOR_ATTACHMENT} must be specified in
     * {@code ::arrayDesc::Flags}. {@code ::numLevels} specifies the total number of levels in the mipmap chain.</p>
     * 
     * <p>If {@code extMem} was imported from a handle of type {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}, then {@code ::numLevels} must be equal to 1.</p>
     * 
     * <p>The returned CUDA mipmapped array must be freed using {@link #cuMipmappedArrayDestroy MipmappedArrayDestroy}.</p>
     *
     * @param mipmap     returned CUDA mipmapped array
     * @param extMem     handle to external memory object
     * @param mipmapDesc CUDA array descriptor
     */
    @NativeType("CUresult")
    public static int cuExternalMemoryGetMappedMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer mipmap, @NativeType("CUexternalMemory") long extMem, @NativeType("CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC const *") CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC mipmapDesc) {
        if (CHECKS) {
            check(mipmap, 1);
        }
        return ncuExternalMemoryGetMappedMipmappedArray(memAddress(mipmap), extMem, mipmapDesc.address());
    }

    // --- [ cuDestroyExternalMemory ] ---

    /**
     * Destroys an external memory object.
     * 
     * <p>Destroys the specified external memory object. Any existing buffers and CUDA mipmapped arrays mapped onto this object must no longer be used and must
     * be explicitly freed using {@link #cuMemFree MemFree} and {@link #cuMipmappedArrayDestroy MipmappedArrayDestroy} respectively.</p>
     *
     * @param extMem external memory object to be destroyed
     */
    @NativeType("CUresult")
    public static int cuDestroyExternalMemory(@NativeType("CUexternalMemory") long extMem) {
        long __functionAddress = Functions.DestroyExternalMemory;
        if (CHECKS) {
            check(__functionAddress);
            check(extMem);
        }
        return callPI(extMem, __functionAddress);
    }

    // --- [ cuImportExternalSemaphore ] ---

    /** Unsafe version of: {@link #cuImportExternalSemaphore ImportExternalSemaphore} */
    public static int ncuImportExternalSemaphore(long extSem_out, long semHandleDesc) {
        long __functionAddress = Functions.ImportExternalSemaphore;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(extSem_out, semHandleDesc, __functionAddress);
    }

    /**
     * Imports an external semaphore.
     * 
     * <p>Imports an externally allocated synchronization object and returns a handle to that in {@code extSem_out}.</p>
     * 
     * <p>The properties of the handle being imported must be described in {@code semHandleDesc}.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD}, then {@code ::handle::fd} must be a valid file descriptor referencing a synchronization
     * object. Ownership of the file descriptor is transferred to the CUDA driver when the handle is imported successfully. Performing any operations on the
     * file descriptor after it is imported results in undefined behavior.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32}, then exactly one of {@code ::handle::win32::handle} and
     * {@code ::handle::win32::name} must not be {@code NULL}. If {@code ::handle::win32::handle} is not {@code NULL}, then it must represent a valid shared NT handle that
     * references a synchronization object. Ownership of this handle is not transferred to CUDA after the import operation, so the application must release
     * the handle using the appropriate system call. If {@code ::handle::win32::name} is not {@code NULL}, then it must name a valid synchronization object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT}, then {@code ::handle::win32::handle} must be non-NULL and
     * {@code ::handle::win32::name} must be {@code NULL}. The handle specified must be a globally shared KMT handle. This handle does not hold a reference to the
     * underlying object, and thus will be invalid when all references to the synchronization object are destroyed.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE}, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
     * must not be {@code NULL}. If {@code ::handle::win32::handle} is not {@code NULL}, then it must represent a valid shared NT handle that is returned by
     * {@code ID3D12Device::CreateSharedHandle} when referring to a {@code ID3D12Fence} object. This handle holds a reference to the underlying object. If
     * {@code ::handle::win32::name} is not {@code NULL}, then it must name a valid synchronization object that refers to a valid {@code ID3D12Fence} object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE}, then {@code ::handle::win32::handle} represents a valid shared NT handle that is
     * returned by {@code ID3D11Fence::CreateSharedHandle}. If {@code ::handle::win32::name} is not {@code NULL}, then it must name a valid synchronization object
     * that refers to a valid {@code ID3D11Fence} object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC}, then {@code ::handle::nvSciSyncObj} represents a valid {@code NvSciSyncObj}.</p>
     * 
     * <p>{@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX}, then {@code ::handle::win32::handle} represents a valid shared NT handle that is returned by
     * {@code IDXGIResource1::CreateSharedHandle} when referring to a {@code IDXGIKeyedMutex} object. If {@code ::handle::win32::name} is not {@code NULL}, then it
     * must name a valid synchronization object that refers to a valid {@code IDXGIKeyedMutex} object.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT}, then {@code ::handle::win32::handle} represents a valid shared KMT handle
     * that is returned by {@code IDXGIResource::GetSharedHandle} when referring to a {@code IDXGIKeyedMutex} object and {@code ::handle::win32::name} must be
     * {@code NULL}.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD}, then {@code ::handle::fd} must be a valid file descriptor referencing a
     * synchronization object. Ownership of the file descriptor is transferred to the CUDA driver when the handle is imported successfully. Performing any
     * operations on the file descriptor after it is imported results in undefined behavior.</p>
     * 
     * <p>If {@code ::type} is {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32}, then exactly one of {@code ::handle::win32::handle} and
     * {@code ::handle::win32::name} must not be {@code NULL}. If {@code ::handle::win32::handle} is not {@code NULL}, then it must represent a valid shared NT handle that
     * references a synchronization object. Ownership of this handle is not transferred to CUDA after the import operation, so the application must release
     * the handle using the appropriate system call. If {@code ::handle::win32::name} is not {@code NULL}, then it must name a valid synchronization object.</p>
     *
     * @param extSem_out    returned handle to an external semaphore
     * @param semHandleDesc semaphore import handle descriptor
     */
    @NativeType("CUresult")
    public static int cuImportExternalSemaphore(@NativeType("CUexternalSemaphore *") PointerBuffer extSem_out, @NativeType("CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC const *") CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC semHandleDesc) {
        if (CHECKS) {
            check(extSem_out, 1);
        }
        return ncuImportExternalSemaphore(memAddress(extSem_out), semHandleDesc.address());
    }

    // --- [ cuSignalExternalSemaphoresAsync ] ---

    /**
     * Unsafe version of: {@link #cuSignalExternalSemaphoresAsync SignalExternalSemaphoresAsync}
     *
     * @param numExtSems number of semaphores to signal
     */
    public static int ncuSignalExternalSemaphoresAsync(long extSemArray, long paramsArray, int numExtSems, long stream) {
        long __functionAddress = Functions.SignalExternalSemaphoresAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(extSemArray, paramsArray, numExtSems, stream, __functionAddress);
    }

    /**
     * Signals a set of external semaphore objects,
     * 
     * <p>Enqueues a signal operation on a set of externally allocated semaphore object in the specified stream. The operations will be executed when all prior
     * operations in the stream complete.</p>
     * 
     * <p>The exact semantics of signaling a semaphore depends on the type of the object.</p>
     * 
     * <p>If the semaphore object is any one of the following types: {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32}, {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT} then signaling the semaphore will set it to the
     * signaled state.</p>
     * 
     * <p>If the semaphore object is any one of the following types: {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE}, {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32} then the semaphore will be set to the value specified in {@code ::params::fence::value}.</p>
     * 
     * <p>If the semaphore object is of the type {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC} this API sets
     * {@code ::params::nvSciSync::fence} to a value that can be used by subsequent waiters of the same {@code NvSciSync} object to order operations with
     * those currently submitted in {@code stream}. Such an update will overwrite previous contents of {@code ::params::nvSciSync::fence}. By default,
     * signaling such an external semaphore object causes appropriate memory synchronization operations to be performed over all external memory objects that
     * are imported as {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}. This ensures that any subsequent accesses made by other importers of the same set of NvSciBuf
     * memory object(s) are coherent. These operations can be skipped by specifying the flag {@link #CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC}, which can
     * be used as a performance optimization when data coherency is not required. But specifying this flag in scenarios where data coherency is required
     * results in undefined behavior. Also, for semaphore object of the type {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC}, if the {@code NvSciSyncAttrList} used
     * to create the {@code NvSciSyncObj} had not set the flags in {@link #cuDeviceGetNvSciSyncAttributes DeviceGetNvSciSyncAttributes} to {@link #CUDA_NVSCISYNC_ATTR_SIGNAL}, this API will return
     * {@link #CUDA_ERROR_NOT_SUPPORTED}.</p>
     * 
     * <p>If the semaphore object is any one of the following types: {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT} then the keyed mutex will be released with the key specified in {@code ::params::keyedmutex::key}.</p>
     *
     * @param extSemArray set of external semaphores to be signaled
     * @param paramsArray array of semaphore parameters
     * @param stream      stream to enqueue the signal operations in
     */
    @NativeType("CUresult")
    public static int cuSignalExternalSemaphoresAsync(@NativeType("CUexternalSemaphore const *") PointerBuffer extSemArray, @NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer paramsArray, @NativeType("CUstream") long stream) {
        if (CHECKS) {
            check(paramsArray, extSemArray.remaining());
        }
        return ncuSignalExternalSemaphoresAsync(memAddress(extSemArray), paramsArray.address(), extSemArray.remaining(), stream);
    }

    // --- [ cuWaitExternalSemaphoresAsync ] ---

    /**
     * Unsafe version of: {@link #cuWaitExternalSemaphoresAsync WaitExternalSemaphoresAsync}
     *
     * @param numExtSems number of semaphores to wait on
     */
    public static int ncuWaitExternalSemaphoresAsync(long extSemArray, long paramsArray, int numExtSems, long stream) {
        long __functionAddress = Functions.WaitExternalSemaphoresAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(extSemArray, paramsArray, numExtSems, stream, __functionAddress);
    }

    /**
     * Waits on a set of external semaphore objects.
     * 
     * <p>Enqueues a wait operation on a set of externally allocated semaphore object in the specified stream. The operations will be executed when all prior
     * operations in the stream complete.</p>
     * 
     * <p>The exact semantics of waiting on a semaphore depends on the type of the object.</p>
     * 
     * <p>If the semaphore object is any one of the following types: {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32}, {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT} then waiting on the semaphore will wait until
     * the semaphore reaches the signaled state. The semaphore will then be reset to the unsignaled state. Therefore for every signal operation, there can
     * only be one wait operation.</p>
     * 
     * <p>If the semaphore object is any one of the following types: {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE}, {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32} then waiting on the semaphore will wait until the value of the semaphore is greater than
     * or equal to {@code ::params::fence::value}.</p>
     * 
     * <p>If the semaphore object is of the type {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC} then, waiting on the semaphore will wait until the
     * {@code ::params::nvSciSync::fence} is signaled by the signaler of the NvSciSyncObj that was associated with this semaphore object. By default, waiting
     * on such an external semaphore object causes appropriate memory synchronization operations to be performed over all external memory objects that are
     * imported as {@link #CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}. This ensures that any subsequent accesses made by other importers of the same set of
     * {@code NvSciBuf} memory object(s) are coherent. These operations can be skipped by specifying the flag
     * {@link #CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC}, which can be used as a performance optimization when data coherency is not required. But
     * specifying this flag in scenarios where data coherency is required results in undefined behavior. Also, for semaphore object of the type
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC}, if the {@code NvSciSyncAttrList} used to create the {@code NvSciSyncObj} had not set the flags in
     * {@link #cuDeviceGetNvSciSyncAttributes DeviceGetNvSciSyncAttributes} to {@link #CUDA_NVSCISYNC_ATTR_WAIT}, this API will return {@link #CUDA_ERROR_NOT_SUPPORTED}.</p>
     * 
     * <p>If the semaphore object is any one of the following types: {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX},
     * {@link #CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT} then the keyed mutex will be acquired when it is released with the key specified in
     * {@code ::params::keyedmutex::key} or until the timeout specified by {@code ::params::keyedmutex::timeoutMs} has lapsed. The timeout interval can either
     * be a finite value specified in milliseconds or an infinite value. In case an infinite value is specified the timeout never elapses. The windows
     * {@code INFINITE} macro must be used to specify infinite timeout.</p>
     *
     * @param extSemArray external semaphores to be waited on
     * @param paramsArray array of semaphore parameters
     * @param stream      stream to enqueue the wait operations in
     */
    @NativeType("CUresult")
    public static int cuWaitExternalSemaphoresAsync(@NativeType("CUexternalSemaphore const *") PointerBuffer extSemArray, @NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer paramsArray, @NativeType("CUstream") long stream) {
        if (CHECKS) {
            check(paramsArray, extSemArray.remaining());
        }
        return ncuWaitExternalSemaphoresAsync(memAddress(extSemArray), paramsArray.address(), extSemArray.remaining(), stream);
    }

    // --- [ cuDestroyExternalSemaphore ] ---

    /**
     * Destroys an external semaphore.
     * 
     * <p>Destroys an external semaphore object and releases any references to the underlying resource. Any outstanding signals or waits must have completed
     * before the semaphore is destroyed.</p>
     *
     * @param extSem external semaphore to be destroyed
     */
    @NativeType("CUresult")
    public static int cuDestroyExternalSemaphore(@NativeType("CUexternalSemaphore") long extSem) {
        long __functionAddress = Functions.DestroyExternalSemaphore;
        if (CHECKS) {
            check(__functionAddress);
            check(extSem);
        }
        return callPI(extSem, __functionAddress);
    }

    // --- [ cuStreamWaitValue32 ] ---

    /**
     * Wait on a memory location.
     * 
     * <p>Enqueues a synchronization of the stream on the given memory location. Work ordered after the operation will block until the given condition on the
     * memory is satisfied. By default, the condition is to wait for {@code (int32_t)(*addr - value) >= 0}, a cyclic greater-or-equal. Other condition types
     * can be specified via {@code flags}.</p>
     * 
     * <p>If the memory was registered via {@link #cuMemHostRegister MemHostRegister}, the device pointer should be obtained with {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer}. This function cannot be
     * used with managed memory ({@link #cuMemAllocManaged MemAllocManaged}).</p>
     * 
     * <p>Support for this can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS}.</p>
     * 
     * <p>Support for {@link #CU_STREAM_WAIT_VALUE_NOR STREAM_WAIT_VALUE_NOR} can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR}.</p>
     *
     * @param stream the stream to synchronize on the memory location
     * @param addr   the memory location to wait on
     * @param value  the value to compare with the memory location
     * @param flags  see {@code CUstreamWaitValue_flags}
     */
    @NativeType("CUresult")
    public static int cuStreamWaitValue32(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint32_t") int value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWaitValue32;
        if (CHECKS) {
            check(__functionAddress);
            check(addr);
        }
        return callPPI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamWaitValue64 ] ---

    /**
     * Wait on a memory location.
     * 
     * <p>Enqueues a synchronization of the stream on the given memory location. Work ordered after the operation will block until the given condition on the
     * memory is satisfied. By default, the condition is to wait for {@code (int64_t)(*addr - value) >= 0}, a cyclic greater-or-equal. Other condition types
     * can be specified via {@code flags}.</p>
     * 
     * <p>If the memory was registered via {@link #cuMemHostRegister MemHostRegister}, the device pointer should be obtained with {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer}.</p>
     * 
     * <p>Support for this can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS}.</p>
     *
     * @param stream the stream to synchronize on the memory location
     * @param addr   the memory location to wait on
     * @param value  the value to compare with the memory location
     * @param flags  see {@code CUstreamWaitValue_flags}
     */
    @NativeType("CUresult")
    public static int cuStreamWaitValue64(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint64_t") long value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWaitValue64;
        if (CHECKS) {
            check(__functionAddress);
            check(addr);
        }
        return callPPJI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamWriteValue32 ] ---

    /**
     * Write a value to memory.
     * 
     * <p>Write a value to memory. Unless the {@link #CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER STREAM_WRITE_VALUE_NO_MEMORY_BARRIER} flag is passed, the write is preceded by a system-wide memory fence,
     * equivalent to a {@code __threadfence_system()} but scoped to the stream rather than a CUDA thread.</p>
     * 
     * <p>If the memory was registered via {@link #cuMemHostRegister MemHostRegister}, the device pointer should be obtained with {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer}. This function cannot
     * be used with managed memory ({@link #cuMemAllocManaged MemAllocManaged}).</p>
     * 
     * <p>Support for this can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS}.</p>
     *
     * @param stream the stream to do the write in
     * @param addr   the device address to write to
     * @param value  the value to write
     * @param flags  see {@code CUstreamWriteValue_flags}
     */
    @NativeType("CUresult")
    public static int cuStreamWriteValue32(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint32_t") int value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWriteValue32;
        if (CHECKS) {
            check(__functionAddress);
            check(addr);
        }
        return callPPI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamWriteValue64 ] ---

    /**
     * Write a value to memory.
     * 
     * <p>Write a value to memory. Unless the {@link #CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER STREAM_WRITE_VALUE_NO_MEMORY_BARRIER} flag is passed, the write is preceded by a system-wide memory fence,
     * equivalent to a {@code __threadfence_system()} but scoped to the stream rather than a CUDA thread.</p>
     * 
     * <p>If the memory was registered via {@link #cuMemHostRegister MemHostRegister}, the device pointer should be obtained with {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer}.</p>
     * 
     * <p>Support for this can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS}.</p>
     *
     * @param stream the stream to do the write in
     * @param addr   the device address to write to
     * @param value  the value to write
     * @param flags  see {@code CUstreamWriteValue_flags}
     */
    @NativeType("CUresult")
    public static int cuStreamWriteValue64(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint64_t") long value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWriteValue64;
        if (CHECKS) {
            check(__functionAddress);
            check(addr);
        }
        return callPPJI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamBatchMemOp ] ---

    /**
     * Unsafe version of: {@link #cuStreamBatchMemOp StreamBatchMemOp}
     *
     * @param count the number of operations in the array. Must be less than 256.
     */
    public static int ncuStreamBatchMemOp(long stream, int count, long paramArray, int flags) {
        long __functionAddress = Functions.StreamBatchMemOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(stream, count, paramArray, flags, __functionAddress);
    }

    /**
     * Batch operations to synchronize the stream via memory operations.
     * 
     * <p>This is a batch version of {@link #cuStreamWaitValue32 StreamWaitValue32} and {@link #cuStreamWriteValue32 StreamWriteValue32}. Batching operations may avoid some performance overhead in both the
     * API call and the device execution versus adding them to the stream in separate API calls. The operations are enqueued in the order they appear in the
     * array.</p>
     * 
     * <p>See {@code CUstreamBatchMemOpType} for the full set of supported operations, and {@link #cuStreamWaitValue32 StreamWaitValue32}, {@link #cuStreamWaitValue64 StreamWaitValue64}, {@link #cuStreamWriteValue32 StreamWriteValue32},
     * and {@link #cuStreamWriteValue64 StreamWriteValue64} for details of specific operations.</p>
     * 
     * <p>Basic support for this can be queried with {@link #cuDeviceGetAttribute DeviceGetAttribute} and {@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS}. See related APIs for details on
     * querying support for specific operations.</p>
     *
     * @param stream     the stream to enqueue the operations in
     * @param paramArray the types and parameters of the individual operations
     * @param flags      reserved for future expansion; must be 0
     */
    @NativeType("CUresult")
    public static int cuStreamBatchMemOp(@NativeType("CUstream") long stream, @NativeType("CUstreamBatchMemOpParams *") CUstreamBatchMemOpParams.Buffer paramArray, @NativeType("unsigned int") int flags) {
        return ncuStreamBatchMemOp(stream, paramArray.remaining(), paramArray.address(), flags);
    }

    // --- [ cuFuncGetAttribute ] ---

    /** Unsafe version of: {@link #cuFuncGetAttribute FuncGetAttribute} */
    public static int ncuFuncGetAttribute(long pi, int attrib, long hfunc) {
        long __functionAddress = Functions.FuncGetAttribute;
        if (CHECKS) {
            check(hfunc);
        }
        return callPPI(pi, attrib, hfunc, __functionAddress);
    }

    /**
     * Returns information about a function.
     * 
     * <p>Returns in {@code *pi} the integer value of the attribute {@code attrib} on the kernel given by {@code hfunc}. The supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK}: The maximum number of threads per block, beyond which a launch of the function would fail. This number
     * depends on both the function and the device on which the function is currently loaded.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_SHARED_SIZE_BYTES}: The size in bytes of statically-allocated shared memory per block required by this function. This does not
     * include dynamically-allocated shared memory requested by the user at runtime.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES FUNC_ATTRIBUTE_CONST_SIZE_BYTES}: The size in bytes of user-allocated constant memory required by this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES}: The size in bytes of local memory used by each thread of this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_NUM_REGS FUNC_ATTRIBUTE_NUM_REGS}: The number of registers used by each thread of this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PTX_VERSION FUNC_ATTRIBUTE_PTX_VERSION}: The PTX virtual architecture version for which the function was compiled. This value is the major PTX version * 10
     * + the minor PTX version, so a PTX version 1.3 function would return the value 13. Note that this may return the undefined value of 0 for cubins
     * compiled prior to CUDA 3.0.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_BINARY_VERSION FUNC_ATTRIBUTE_BINARY_VERSION}: The binary architecture version for which the function was compiled. This value is the major binary version *
     * 10 + the minor binary version, so a binary version 1.3 function would return the value 13. Note that this will return a value of 10 for legacy
     * cubins that do not have a properly-encoded binary architecture version.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_CACHE_MODE_CA FUNC_ATTRIBUTE_CACHE_MODE_CA}: The attribute to indicate whether the function has been compiled with user specified option "-Xptxas --dlcm=ca"
     * set.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES}: The maximum size in bytes of dynamically-allocated shared memory.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT}: Preferred shared memory-L1 cache split ratio in percent of total shared memory.</li>
     * </ul>
     *
     * @param pi     returned attribute value
     * @param attrib attribute requested
     * @param hfunc  function to query attribute of
     */
    @NativeType("CUresult")
    public static int cuFuncGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUfunction_attribute") int attrib, @NativeType("CUfunction") long hfunc) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuFuncGetAttribute(memAddress(pi), attrib, hfunc);
    }

    // --- [ cuFuncSetAttribute ] ---

    /**
     * Sets information about a function.
     * 
     * <p>This call sets the value of a specified attribute {@code attrib} on the kernel given by {@code hfunc} to an integer value specified by {@code val} This
     * function returns {@link #CUDA_SUCCESS} if the new value of the attribute could be successfully set. If the set fails, this call will return an error. Not all
     * attributes can have values set. Attempting to set a value on a read-only attribute will result in an error ({@link #CUDA_ERROR_INVALID_VALUE}).</p>
     * 
     * <p>Supported attributes for the cuFuncSetAttribute call are:</p>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES}: This maximum size in bytes of dynamically-allocated shared memory. The value should contain the
     * requested maximum size of dynamically-allocated shared memory. The sum of this value and the function attribute
     * {@link #CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_SHARED_SIZE_BYTES} cannot exceed the device attribute {@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN}. The maximal size
     * of requestable dynamic shared memory may differ by GPU architecture.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT}: On devices where the L1 cache and shared memory use the same hardware resources, this sets
     * the shared memory carveout preference, in percent of the total shared memory. See {@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR} This
     * is only a hint, and the driver can choose a different ratio if required to execute the function.</li>
     * </ul>
     *
     * @param hfunc  function to query attribute of
     * @param attrib attribute requested
     * @param value  the value to set
     */
    @NativeType("CUresult")
    public static int cuFuncSetAttribute(@NativeType("CUfunction") long hfunc, @NativeType("CUfunction_attribute") int attrib, int value) {
        long __functionAddress = Functions.FuncSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPI(hfunc, attrib, value, __functionAddress);
    }

    // --- [ cuFuncSetCacheConfig ] ---

    /**
     * Sets the preferred cache configuration for a device function.
     * 
     * <p>On devices where the L1 cache and shared memory use the same hardware resources, this sets through {@code config} the preferred cache configuration for
     * the device function {@code hfunc}. This is only a preference. The driver will use the requested configuration if possible, but it is free to choose a
     * different configuration if required to execute {@code hfunc}. Any context-wide preference set via {@link #cuCtxSetCacheConfig CtxSetCacheConfig} will be overridden by this
     * per-function setting unless the per-function setting is {@link #CU_FUNC_CACHE_PREFER_NONE FUNC_CACHE_PREFER_NONE}. In that case, the current context-wide setting will be used.</p>
     * 
     * <p>This setting does nothing on devices where the size of the L1 cache and shared memory are fixed.</p>
     * 
     * <p>Launching a kernel with a different preference than the most recent preference setting may insert a device-side synchronization point.</p>
     * 
     * <p>The supported cache configurations are:</p>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_CACHE_PREFER_NONE FUNC_CACHE_PREFER_NONE}: no preference for shared memory or L1 (default)</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_SHARED FUNC_CACHE_PREFER_SHARED}: prefer larger shared memory and smaller L1 cache</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_L1 FUNC_CACHE_PREFER_L1}: prefer larger L1 cache and smaller shared memory</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_EQUAL FUNC_CACHE_PREFER_EQUAL}: prefer equal sized L1 cache and shared memory</li>
     * </ul>
     *
     * @param hfunc  kernel to configure cache for
     * @param config requested cache configuration
     */
    @NativeType("CUresult")
    public static int cuFuncSetCacheConfig(@NativeType("CUfunction") long hfunc, @NativeType("CUfunc_cache") int config) {
        long __functionAddress = Functions.FuncSetCacheConfig;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, config, __functionAddress);
    }

    // --- [ cuFuncSetSharedMemConfig ] ---

    /**
     * Sets the shared memory configuration for a device function.
     * 
     * <p>On devices with configurable shared memory banks, this function will force all subsequent launches of the specified device function to have the given
     * shared memory bank size configuration. On any given launch of the function, the shared memory configuration of the device will be temporarily changed
     * if needed to suit the function's preferred configuration. Changes in shared memory configuration between subsequent launches of functions, may
     * introduce a device side synchronization point.</p>
     * 
     * <p>Any per-function setting of shared memory bank size set via {@link #cuFuncSetSharedMemConfig FuncSetSharedMemConfig} will override the context wide setting set with
     * {@link #cuCtxSetSharedMemConfig CtxSetSharedMemConfig}.</p>
     * 
     * <p>Changing the shared memory bank size will not increase shared memory usage or affect occupancy of kernels, but may have major effects on performance.
     * Larger bank sizes will allow for greater potential bandwidth to shared memory, but will change what kinds of accesses to shared memory will result in
     * bank conflicts.</p>
     * 
     * <p>This function will do nothing on devices with fixed shared memory bank size.</p>
     * 
     * <p>The supported bank configurations are:</p>
     * 
     * <ul>
     * <li>{@link #CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE}: use the context's shared memory configuration when launching this function.</li>
     * <li>{@link #CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE}: set shared memory bank width to be natively four bytes when launching this function.</li>
     * <li>{@link #CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE}: set shared memory bank width to be natively eight bytes when launching this function.</li>
     * </ul>
     *
     * @param hfunc  kernel to be given a shared memory config
     * @param config requested shared memory configuration
     */
    @NativeType("CUresult")
    public static int cuFuncSetSharedMemConfig(@NativeType("CUfunction") long hfunc, @NativeType("CUsharedconfig") int config) {
        long __functionAddress = Functions.FuncSetSharedMemConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPI(hfunc, config, __functionAddress);
    }

    // --- [ cuFuncGetModule ] ---

    /** Unsafe version of: {@link #cuFuncGetModule FuncGetModule} */
    public static int ncuFuncGetModule(long hmod, long hfunc) {
        long __functionAddress = Functions.FuncGetModule;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPPI(hmod, hfunc, __functionAddress);
    }

    /**
     * Returns a module handle.
     * 
     * <p>Returns in {@code *hmod} the handle of the module that function {@code hfunc} is located in. The lifetime of the module corresponds to the lifetime of
     * the context it was loaded in or until the module is explicitly unloaded.</p>
     * 
     * <p>The CUDA runtime manages its own modules loaded into the primary context. If the handle returned by this API refers to a module loaded by the CUDA
     * runtime, calling {@link #cuModuleUnload ModuleUnload} on that module will result in undefined behavior.</p>
     *
     * @param hmod  returned module handle
     * @param hfunc function to retrieve module for
     */
    @NativeType("CUresult")
    public static int cuFuncGetModule(@NativeType("CUmodule *") PointerBuffer hmod, @NativeType("CUfunction") long hfunc) {
        if (CHECKS) {
            check(hmod, 1);
        }
        return ncuFuncGetModule(memAddress(hmod), hfunc);
    }

    // --- [ cuLaunchKernel ] ---

    /** Unsafe version of: {@link #cuLaunchKernel LaunchKernel} */
    public static int ncuLaunchKernel(long f, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, long hStream, long kernelParams, long extra) {
        long __functionAddress = Functions.LaunchKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(f);
        }
        return callPPPPI(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, kernelParams, extra, __functionAddress);
    }

    /**
     * Launches a CUDA function.
     * 
     * <p>Invokes the kernel {@code f} on a {@code gridDimX} x {@code gridDimY} x {@code gridDimZ} grid of blocks. Each block contains {@code blockDimX} x {@code
     * blockDimY} x {@code blockDimZ} threads.</p>
     * 
     * <p>{@code sharedMemBytes} sets the amount of dynamic shared memory that will be available to each thread block.</p>
     * 
     * <p>Kernel parameters to {@code f} can be specified in one of two ways:</p>
     * 
     * <ol>
     * <li>Kernel parameters can be specified via {@code kernelParams}.
     * 
     * <p>If {@code f} has N parameters, then {@code kernelParams} needs to be an array of N pointers. Each of {@code kernelParams[0]} through
     * {@code kernelParams[N-1]} must point to a region of memory from which the actual kernel parameter will be copied. The number of kernel parameters
     * and their offsets and sizes do not need to be specified as that information is retrieved directly from the kernel's image.</p></li>
     * <li>Kernel parameters can also be packaged by the application into a single buffer that is passed in via the {@code extra} parameter.
     * 
     * <p>This places the burden on the application of knowing each kernel parameter's size and alignment/padding within the buffer. Here is an example of
     * using the {@code extra} parameter in this manner:</p>
     * 
     * <pre><code>
     * size_t argBufferSize;
     * char argBuffer[256];
     * 
     * // populate argBuffer and argBufferSize
     * 
     * void *config[] = {
     *     CU_LAUNCH_PARAM_BUFFER_POINTER, argBuffer,
     *     CU_LAUNCH_PARAM_BUFFER_SIZE,    &amp;argBufferSize,
     *     CU_LAUNCH_PARAM_END
     * };
     * status = cuLaunchKernel(f, gx, gy, gz, bx, by, bz, sh, s, NULL, config);</code></pre></li>
     * </ol>
     * 
     * <p>The {@code extra} parameter exists to allow {@code cuLaunchKernel()} to take additional less commonly used arguments. {@code extra} specifies a list of
     * names of extra settings and their corresponding values. Each extra setting name is immediately followed by the corresponding value. The list must be
     * terminated with either {@code NULL} or {@link #CU_LAUNCH_PARAM_END LAUNCH_PARAM_END}.</p>
     * 
     * <ul>
     * <li>{@link #CU_LAUNCH_PARAM_END LAUNCH_PARAM_END}, which indicates the end of the {@code extra} array</li>
     * <li>{@link #CU_LAUNCH_PARAM_BUFFER_POINTER LAUNCH_PARAM_BUFFER_POINTER}, which specifies that the next value in {@code extra} will be a pointer to a buffer containing all the kernel
     * parameters for launching kernel {@code f}</li>
     * <li>{@link #CU_LAUNCH_PARAM_BUFFER_SIZE LAUNCH_PARAM_BUFFER_SIZE}, which specifies that the next value in {@code extra} will be a pointer to a size_t containing the size of the buffer
     * specified with {@link #CU_LAUNCH_PARAM_BUFFER_POINTER LAUNCH_PARAM_BUFFER_POINTER}</li>
     * </ul>
     * 
     * <p>The error {@link #CUDA_ERROR_INVALID_VALUE} will be returned if kernel parameters are specified with both {@code kernelParams} and {@code extra} (i.e. both
     * {@code kernelParams} and {@code extra} are non-{@code NULL}).</p>
     * 
     * <p>Calling {@code cuLaunchKernel()} invalidates the persistent function state set through the following deprecated APIs: {@link #cuFuncSetBlockShape FuncSetBlockShape},
     * {@link #cuFuncSetSharedSize FuncSetSharedSize}, {@link #cuParamSetSize ParamSetSize}, {@link #cuParamSeti ParamSeti}, {@link #cuParamSetf ParamSetf}, {@link #cuParamSetv ParamSetv}.</p>
     * 
     * <p>Note that to use {@link #cuLaunchKernel LaunchKernel}, the kernel {@code f} must either have been compiled with toolchain version 3.2 or later so that it will contain
     * kernel parameter information, or have no kernel parameters. If either of these conditions is not met, then {@link #cuLaunchKernel LaunchKernel} will return
     * {@link #CUDA_ERROR_INVALID_IMAGE}.</p>
     *
     * @param f              kernel to launch
     * @param gridDimX       width of grid in blocks
     * @param gridDimY       height of grid in blocks
     * @param gridDimZ       depth of grid in blocks
     * @param blockDimX      x dimension of each thread block
     * @param blockDimY      y dimension of each thread block
     * @param blockDimZ      z dimension of each thread block
     * @param sharedMemBytes dynamic shared-memory size per thread block in bytes
     * @param hStream        stream identifier
     * @param kernelParams   array of pointers to kernel parameters
     * @param extra          extra options
     */
    @NativeType("CUresult")
    public static int cuLaunchKernel(@NativeType("CUfunction") long f, @NativeType("unsigned int") int gridDimX, @NativeType("unsigned int") int gridDimY, @NativeType("unsigned int") int gridDimZ, @NativeType("unsigned int") int blockDimX, @NativeType("unsigned int") int blockDimY, @NativeType("unsigned int") int blockDimZ, @NativeType("unsigned int") int sharedMemBytes, @NativeType("CUstream") long hStream, @Nullable @NativeType("void **") PointerBuffer kernelParams, @Nullable @NativeType("void **") PointerBuffer extra) {
        return ncuLaunchKernel(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, memAddressSafe(kernelParams), memAddressSafe(extra));
    }

    // --- [ cuLaunchCooperativeKernel ] ---

    /** Unsafe version of: {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel} */
    public static int ncuLaunchCooperativeKernel(long f, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, long hStream, long kernelParams) {
        long __functionAddress = Functions.LaunchCooperativeKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(f);
        }
        return callPPPI(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, kernelParams, __functionAddress);
    }

    /**
     * Launches a CUDA function where thread blocks can cooperate and synchronize as they execute.
     * 
     * <p>Invokes the kernel {@code f} on a {@code gridDimX} x {@code gridDimY} x {@code gridDimZ} grid of blocks. Each block contains {@code blockDimX} x {@code
     * blockDimY} x {@code blockDimZ} threads.</p>
     * 
     * <p>{@code sharedMemBytes} sets the amount of dynamic shared memory that will be available to each thread block.</p>
     * 
     * <p>The device on which this kernel is invoked must have a non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH}.</p>
     * 
     * <p>The total number of blocks launched cannot exceed the maximum number of blocks per multiprocessor as returned by
     * {@link #cuOccupancyMaxActiveBlocksPerMultiprocessor OccupancyMaxActiveBlocksPerMultiprocessor} (or {@link #cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags OccupancyMaxActiveBlocksPerMultiprocessorWithFlags}) times the number of multiprocessors as
     * specified by the device attribute {@link #CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT}.</p>
     * 
     * <p>The kernel cannot make use of CUDA dynamic parallelism.</p>
     * 
     * <p>Kernel parameters must be specified via {@code kernelParams}. If {@code f} has N parameters, then {@code kernelParams} needs to be an array of N
     * pointers. Each of {@code kernelParams[0]} through {@code kernelParams[N-1]} must point to a region of memory from which the actual kernel parameter
     * will be copied. The number of kernel parameters and their offsets and sizes do not need to be specified as that information is retrieved directly from
     * the kernel's image.</p>
     * 
     * <p>Calling {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel} sets persistent function state that is the same as function state set through {@link #cuLaunchKernel LaunchKernel} API</p>
     * 
     * <p>When the kernel {@code f} is launched via {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel}, the previous block shape, shared size and parameter info associated with
     * {@code f} is overwritten.</p>
     * 
     * <p>Note that to use {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel}, the kernel {@code f} must either have been compiled with toolchain version 3.2 or later so that it will
     * contain kernel parameter information, or have no kernel parameters. If either of these conditions is not met, then {@link #cuLaunchCooperativeKernel LaunchCooperativeKernel} will
     * return {@link #CUDA_ERROR_INVALID_IMAGE}.</p>
     *
     * @param f              kernel to launch
     * @param gridDimX       width of grid in blocks
     * @param gridDimY       height of grid in blocks
     * @param gridDimZ       depth of grid in blocks
     * @param blockDimX      x dimension of each thread block
     * @param blockDimY      y dimension of each thread block
     * @param blockDimZ      z dimension of each thread block
     * @param sharedMemBytes dynamic shared-memory size per thread block in bytes
     * @param hStream        stream identifier
     * @param kernelParams   array of pointers to kernel parameters
     */
    @NativeType("CUresult")
    public static int cuLaunchCooperativeKernel(@NativeType("CUfunction") long f, @NativeType("unsigned int") int gridDimX, @NativeType("unsigned int") int gridDimY, @NativeType("unsigned int") int gridDimZ, @NativeType("unsigned int") int blockDimX, @NativeType("unsigned int") int blockDimY, @NativeType("unsigned int") int blockDimZ, @NativeType("unsigned int") int sharedMemBytes, @NativeType("CUstream") long hStream, @Nullable @NativeType("void **") PointerBuffer kernelParams) {
        return ncuLaunchCooperativeKernel(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, memAddressSafe(kernelParams));
    }

    // --- [ cuLaunchCooperativeKernelMultiDevice ] ---

    /**
     * Unsafe version of: {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice}
     *
     * @param numDevices size of the {@code launchParamsList} array
     */
    public static int ncuLaunchCooperativeKernelMultiDevice(long launchParamsList, int numDevices, int flags) {
        long __functionAddress = Functions.LaunchCooperativeKernelMultiDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(launchParamsList, numDevices, flags, __functionAddress);
    }

    /**
     * Launches CUDA functions on multiple devices where thread blocks can cooperate and synchronize as they executeDeprecated: This function is deprecated as
     * of CUDA 11.3.
     * 
     * <p>Invokes kernels as specified in the {@code launchParamsList} array where each element of the array specifies all the parameters required to perform a
     * single kernel launch. These kernels can cooperate and synchronize as they execute. The size of the array is specified by {@code numDevices}.</p>
     * 
     * <p>No two kernels can be launched on the same device. All the devices targeted by this multi-device launch must be identical. All devices must have a
     * non-zero value for the device attribute {@link #CU_DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH}.</p>
     * 
     * <p>All kernels launched must be identical with respect to the compiled code. Note that any __device__ __constant__ or __managed__ variables present
     * in the module that owns the kernel launched on each device, are independently instantiated on every device. It is the application's responsibility to
     * ensure these variables are initialized and used appropriately.</p>
     * 
     * <p>The size of the grids as specified in blocks, the size of the blocks themselves and the amount of shared memory used by each thread block must also
     * match across all launched kernels.</p>
     * 
     * <p>The streams used to launch these kernels must have been created via either {@link #cuStreamCreate StreamCreate} or {@link #cuStreamCreateWithPriority StreamCreateWithPriority}. The {@code NULL} stream or
     * {@link #CU_STREAM_LEGACY STREAM_LEGACY} or {@link #CU_STREAM_PER_THREAD STREAM_PER_THREAD} cannot be used.</p>
     * 
     * <p>The total number of blocks launched per kernel cannot exceed the maximum number of blocks per multiprocessor as returned by
     * {@link #cuOccupancyMaxActiveBlocksPerMultiprocessor OccupancyMaxActiveBlocksPerMultiprocessor} (or {@link #cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags OccupancyMaxActiveBlocksPerMultiprocessorWithFlags}) times the number of multiprocessors as
     * specified by the device attribute {@link #CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT}. Since the total number of blocks launched per device has to match across
     * all devices, the maximum number of blocks that can be launched per device will be limited by the device with the least number of multiprocessors.</p>
     * 
     * <p>The kernels cannot make use of CUDA dynamic parallelism.</p>
     * 
     * <ul>
     * <li>{@code CUDA_LAUNCH_PARAMS::function} specifies the kernel to be launched. All functions must be identical with respect to the compiled code.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::gridDimX} is the width of the grid in blocks. This must match across all kernels launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::gridDimY} is the height of the grid in blocks. This must match across all kernels launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::gridDimZ} is the depth of the grid in blocks. This must match across all kernels launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::blockDimX} is the X dimension of each thread block. This must match across all kernels launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::blockDimX} is the Y dimension of each thread block. This must match across all kernels launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::blockDimZ} is the Z dimension of each thread block. This must match across all kernels launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::sharedMemBytes} is the dynamic shared-memory size per thread block in bytes. This must match across all kernels
     * launched.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::hStream} is the handle to the stream to perform the launch in. This cannot be the {@code NULL} stream or {@link #CU_STREAM_LEGACY STREAM_LEGACY} or
     * {@link #CU_STREAM_PER_THREAD STREAM_PER_THREAD}. The CUDA context associated with this stream must match that associated with {@code CUDA_LAUNCH_PARAMS::function}.</li>
     * <li>{@code CUDA_LAUNCH_PARAMS::kernelParams} is an array of pointers to kernel parameters. If {@code ::function} has N parameters, then
     * {@code ::kernelParams} needs to be an array of N pointers. Each of {@code ::kernelParams[0]} through {@code ::kernelParams[N-1]} must point to a
     * region of memory from which the actual kernel parameter will be copied. The number of kernel parameters and their offsets and sizes do not need to
     * be specified as that information is retrieved directly from the kernel's image.</li>
     * </ul>
     * 
     * <p>By default, the kernel won't begin execution on any GPU until all prior work in all the specified streams has completed. This behavior can be
     * overridden by specifying the flag {@link #CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC}. When this flag is specified, each kernel will only wait
     * for prior work in the stream corresponding to that GPU to complete before it begins execution.</p>
     * 
     * <p>Similarly, by default, any subsequent work pushed in any of the specified streams will not begin execution until the kernels on all GPUs have
     * completed. This behavior can be overridden by specifying the flag {@link #CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC}. When this flag is
     * specified, any subsequent work pushed in any of the specified streams will only wait for the kernel launched on the GPU corresponding to that stream to
     * complete before it begins execution.</p>
     * 
     * <p>Calling {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} sets persistent function state that is the same as function state set through {@link #cuLaunchKernel LaunchKernel} API
     * when called individually for each element in {@code launchParamsList}.</p>
     * 
     * <p>When kernels are launched via {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice}, the previous block shape, shared size and parameter info associated with each
     * {@code CUDA_LAUNCH_PARAMS::function} in {@code launchParamsList} is overwritten.</p>
     * 
     * <p>Note that to use {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice}, the kernels must either have been compiled with toolchain version 3.2 or later so that it
     * will contain kernel parameter information, or have no kernel parameters. If either of these conditions is not met, then
     * {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} will return {@link #CUDA_ERROR_INVALID_IMAGE}.</p>
     *
     * @param launchParamsList list of launch parameters, one per device
     * @param flags            flags to control launch behavior
     */
    @NativeType("CUresult")
    public static int cuLaunchCooperativeKernelMultiDevice(@NativeType("CUDA_LAUNCH_PARAMS *") CUDA_LAUNCH_PARAMS.Buffer launchParamsList, @NativeType("unsigned int") int flags) {
        return ncuLaunchCooperativeKernelMultiDevice(launchParamsList.address(), launchParamsList.remaining(), flags);
    }

    // --- [ cuLaunchHostFunc ] ---

    /** Unsafe version of: {@link #cuLaunchHostFunc LaunchHostFunc} */
    public static int ncuLaunchHostFunc(long hStream, long fn, long userData) {
        long __functionAddress = Functions.LaunchHostFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(userData);
        }
        return callPPPI(hStream, fn, userData, __functionAddress);
    }

    /**
     * Enqueues a host function call in a stream.
     * 
     * <p>Enqueues a host function to run in a stream. The function will be called after currently enqueued work and will block work added after it.</p>
     * 
     * <p>The host function must not make any CUDA API calls. Attempting to use a CUDA API may result in {@link #CUDA_ERROR_NOT_PERMITTED}, but this is not required.
     * The host function must not perform any synchronization that may depend on outstanding CUDA work not mandated to run earlier. Host functions without a
     * mandated order (such as in independent streams) execute in undefined order and may be serialized.</p>
     * 
     * <p>For the purposes of Unified Memory, execution makes a number of guarantees:</p>
     * 
     * <ul>
     * <li>The stream is considered idle for the duration of the function's execution. Thus, for example, the function may always use memory attached to the
     * stream it was enqueued in.</li>
     * <li>The start of execution of the function has the same effect as synchronizing an event recorded in the same stream immediately prior to the function.
     * It thus synchronizes streams which have been "joined" prior to the function.</li>
     * <li>Adding device work to any stream does not have the effect of making the stream active until all preceding host functions and stream callbacks have
     * executed. Thus, for example, a function might use global attached memory even if work has been added to another stream, if the work has been
     * ordered behind the function call with an event.</li>
     * <li>Completion of the function does not cause a stream to become active except as described above. The stream will remain idle if no device work
     * follows the function, and will remain idle across consecutive host functions or stream callbacks without device work in between. Thus, for example,
     * stream synchronization can be done by signaling from a host function at the end of the stream.</li>
     * </ul>
     * 
     * <p>Note that, in contrast to {@link #cuStreamAddCallback StreamAddCallback}, the function will not be called in the event of an error in the CUDA context.</p>
     *
     * @param hStream  stream to enqueue function call in
     * @param fn       the function to call once preceding stream operations are complete
     * @param userData user-specified data to be passed to the function
     */
    @NativeType("CUresult")
    public static int cuLaunchHostFunc(@NativeType("CUstream") long hStream, @NativeType("void (*) (void *)") CUhostFnI fn, @NativeType("void *") long userData) {
        return ncuLaunchHostFunc(hStream, fn.address(), userData);
    }

    // --- [ cuFuncSetBlockShape ] ---

    /**
     * Sets the block-dimensions for the function. (Deprecated) 
     * 
     * <p>Specifies the {@code x}, {@code y}, and {@code z} dimensions of the thread blocks that are created when the kernel given by {@code hfunc} is launched.</p>
     *
     * @param hfunc kernel to specify dimensions of
     * @param x     x dimension
     * @param y     y dimension
     * @param z     z dimension
     */
    @NativeType("CUresult")
    public static int cuFuncSetBlockShape(@NativeType("CUfunction") long hfunc, int x, int y, int z) {
        long __functionAddress = Functions.FuncSetBlockShape;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, x, y, z, __functionAddress);
    }

    // --- [ cuFuncSetSharedSize ] ---

    /**
     * Sets the dynamic shared-memory size for the function. (Deprecated) 
     * 
     * <p>Sets through {@code bytes} the amount of dynamic shared memory that will be available to each thread block when the kernel given by {@code hfunc} is
     * launched.</p>
     *
     * @param hfunc kernel to specify dynamic shared-memory size for
     * @param bytes dynamic shared-memory size per thread in bytes
     */
    @NativeType("CUresult")
    public static int cuFuncSetSharedSize(@NativeType("CUfunction") long hfunc, @NativeType("unsigned int") int bytes) {
        long __functionAddress = Functions.FuncSetSharedSize;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, bytes, __functionAddress);
    }

    // --- [ cuParamSetSize ] ---

    /**
     * Sets the parameter size for the function. (Deprecated)
     * 
     * <p>Sets through {@code numbytes} the total size in bytes needed by the function parameters of the kernel corresponding to {@code hfunc}.</p>
     *
     * @param hfunc    kernel to set parameter size for
     * @param numbytes size of parameter list in bytes
     */
    @NativeType("CUresult")
    public static int cuParamSetSize(@NativeType("CUfunction") long hfunc, @NativeType("unsigned int") int numbytes) {
        long __functionAddress = Functions.ParamSetSize;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, numbytes, __functionAddress);
    }

    // --- [ cuParamSeti ] ---

    /**
     * Adds an integer parameter to the function's argument listDeprecated: 
     * 
     * <p>Sets an integer parameter that will be specified the next time the kernel corresponding to {@code hfunc} will be invoked. {@code offset} is a byte
     * offset.</p>
     *
     * @param hfunc  kernel to add parameter to
     * @param offset offset to add parameter to argument list
     * @param value  value of parameter
     */
    @NativeType("CUresult")
    public static int cuParamSeti(@NativeType("CUfunction") long hfunc, int offset, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.ParamSeti;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, offset, value, __functionAddress);
    }

    // --- [ cuParamSetf ] ---

    /**
     * Adds a floating-point parameter to the function's argument list. (Deprecated) 
     * 
     * <p>Sets a floating-point parameter that will be specified the next time the kernel corresponding to {@code hfunc} will be invoked. {@code offset} is a
     * byte offset.</p>
     *
     * @param hfunc  kernel to add parameter to
     * @param offset offset to add parameter to argument list
     * @param value  value of parameter
     */
    @NativeType("CUresult")
    public static int cuParamSetf(@NativeType("CUfunction") long hfunc, int offset, float value) {
        long __functionAddress = Functions.ParamSetf;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, offset, value, __functionAddress);
    }

    // --- [ cuParamSetv ] ---

    /**
     * Unsafe version of: {@link #cuParamSetv ParamSetv}
     *
     * @param numbytes size of data to copy in bytes
     */
    public static int ncuParamSetv(long hfunc, int offset, long ptr, int numbytes) {
        long __functionAddress = Functions.ParamSetv;
        if (CHECKS) {
            check(hfunc);
        }
        return callPPI(hfunc, offset, ptr, numbytes, __functionAddress);
    }

    /**
     * Adds arbitrary data to the function's argument list. (Deprecated) 
     * 
     * <p>Copies an arbitrary amount of data (specified in {@code numbytes}) from {@code ptr} into the parameter space of the kernel corresponding to
     * {@code hfunc}. {@code offset} is a byte offset.</p>
     *
     * @param hfunc  kernel to add data to
     * @param offset offset to add data to argument list
     * @param ptr    pointer to arbitrary data
     */
    @NativeType("CUresult")
    public static int cuParamSetv(@NativeType("CUfunction") long hfunc, int offset, @NativeType("void *") ByteBuffer ptr) {
        return ncuParamSetv(hfunc, offset, memAddress(ptr), ptr.remaining());
    }

    // --- [ cuLaunch ] ---

    /**
     * Launches a CUDA function. (Deprecated) 
     * 
     * <p>Invokes the kernel {@code f} on a 1 x 1 x 1 grid of blocks. The block contains the number of threads specified by a previous call to
     * {@link #cuFuncSetBlockShape FuncSetBlockShape}.</p>
     * 
     * <p>The block shape, dynamic shared memory size, and parameter information must be set using {@link #cuFuncSetBlockShape FuncSetBlockShape}, {@link #cuFuncSetSharedSize FuncSetSharedSize},
     * {@link #cuParamSetSize ParamSetSize}, {@link #cuParamSeti ParamSeti}, {@link #cuParamSetf ParamSetf}, and {@link #cuParamSetv ParamSetv} prior to calling this function.</p>
     * 
     * <p>Launching a function via {@link #cuLaunchKernel LaunchKernel} invalidates the function's block shape, dynamic shared memory size, and parameter information. After
     * launching via cuLaunchKernel, this state must be re-initialized prior to calling this function. Failure to do so results in undefined behavior.</p>
     *
     * @param f kernel to launch
     */
    @NativeType("CUresult")
    public static int cuLaunch(@NativeType("CUfunction") long f) {
        long __functionAddress = Functions.Launch;
        if (CHECKS) {
            check(f);
        }
        return callPI(f, __functionAddress);
    }

    // --- [ cuLaunchGrid ] ---

    /**
     * Launches a CUDA function. (Deprecated) 
     * 
     * <p>Invokes the kernel {@code f} on a {@code grid_width} x {@code grid_height} grid of blocks. Each block contains the number of threads specified by a
     * previous call to {@link #cuFuncSetBlockShape FuncSetBlockShape}.</p>
     * 
     * <p>The block shape, dynamic shared memory size, and parameter information must be set using {@link #cuFuncSetBlockShape FuncSetBlockShape}, {@link #cuFuncSetSharedSize FuncSetSharedSize},
     * {@link #cuParamSetSize ParamSetSize}, {@link #cuParamSeti ParamSeti}, {@link #cuParamSetf ParamSetf}, and {@link #cuParamSetv ParamSetv} prior to calling this function.</p>
     * 
     * <p>Launching a function via {@link #cuLaunchKernel LaunchKernel} invalidates the function's block shape, dynamic shared memory size, and parameter information. After
     * launching via cuLaunchKernel, this state must be re-initialized prior to calling this function. Failure to do so results in undefined behavior.</p>
     *
     * @param f           kernel to launch
     * @param grid_width  width of grid in blocks
     * @param grid_height height of grid in blocks
     */
    @NativeType("CUresult")
    public static int cuLaunchGrid(@NativeType("CUfunction") long f, int grid_width, int grid_height) {
        long __functionAddress = Functions.LaunchGrid;
        if (CHECKS) {
            check(f);
        }
        return callPI(f, grid_width, grid_height, __functionAddress);
    }

    // --- [ cuLaunchGridAsync ] ---

    /**
     * Launches a CUDA function. (Deprecated)
     * 
     * <p>Invokes the kernel {@code f} on a {@code grid_width} x {@code grid_height} grid of blocks. Each block contains the number of threads specified by a
     * previous call to {@link #cuFuncSetBlockShape FuncSetBlockShape}.</p>
     * 
     * <p>The block shape, dynamic shared memory size, and parameter information must be set using {@link #cuFuncSetBlockShape FuncSetBlockShape}, {@link #cuFuncSetSharedSize FuncSetSharedSize},
     * {@link #cuParamSetSize ParamSetSize}, {@link #cuParamSeti ParamSeti}, {@link #cuParamSetf ParamSetf}, and {@link #cuParamSetv ParamSetv} prior to calling this function.</p>
     * 
     * <p>Launching a function via {@link #cuLaunchKernel LaunchKernel} invalidates the function's block shape, dynamic shared memory size, and parameter information. After
     * launching via cuLaunchKernel, this state must be re-initialized prior to calling this function. Failure to do so results in undefined behavior.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In certain cases where cubins are created with no ABI (i.e., using {@code ptxas} {@code --abi-compile} {@code no}), this function may
     * serialize kernel launches. The CUDA driver retains asynchronous behavior by growing the per-thread stack as needed per launch and not shrinking it
     * afterwards.</p></div>
     *
     * @param f           kernel to launch
     * @param grid_width  width of grid in blocks
     * @param grid_height height of grid in blocks
     * @param hStream     stream identifier
     */
    @NativeType("CUresult")
    public static int cuLaunchGridAsync(@NativeType("CUfunction") long f, int grid_width, int grid_height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.LaunchGridAsync;
        if (CHECKS) {
            check(f);
        }
        return callPPI(f, grid_width, grid_height, hStream, __functionAddress);
    }

    // --- [ cuParamSetTexRef ] ---

    /**
     * Adds a texture-reference to the function's argument list. (Deprecated)
     * 
     * <p>Makes the CUDA array or linear memory bound to the texture reference {@code hTexRef} available to a device program as a texture. In this version of
     * CUDA, the texture-reference must be obtained via {@link #cuModuleGetTexRef ModuleGetTexRef} and the {@code texunit} parameter must be set to {@link #CU_PARAM_TR_DEFAULT PARAM_TR_DEFAULT}.</p>
     *
     * @param hfunc   kernel to add texture-reference to
     * @param texunit texture unit (must be {@link #CU_PARAM_TR_DEFAULT PARAM_TR_DEFAULT})
     * @param hTexRef texture-reference to add to argument list
     */
    @NativeType("CUresult")
    public static int cuParamSetTexRef(@NativeType("CUfunction") long hfunc, int texunit, @NativeType("CUtexref") long hTexRef) {
        long __functionAddress = Functions.ParamSetTexRef;
        if (CHECKS) {
            check(hfunc);
            check(hTexRef);
        }
        return callPPI(hfunc, texunit, hTexRef, __functionAddress);
    }

    // --- [ cuGraphCreate ] ---

    /** Unsafe version of: {@link #cuGraphCreate GraphCreate} */
    public static int ncuGraphCreate(long phGraph, int flags) {
        long __functionAddress = Functions.GraphCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(phGraph, flags, __functionAddress);
    }

    /**
     * Creates a graph.
     * 
     * <p>Creates an empty graph, which is returned via {@code phGraph}.</p>
     *
     * @param phGraph returns newly created graph
     * @param flags   graph creation flags, must be 0
     */
    @NativeType("CUresult")
    public static int cuGraphCreate(@NativeType("CUgraph *") PointerBuffer phGraph, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuGraphCreate(memAddress(phGraph), flags);
    }

    // --- [ cuGraphAddKernelNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddKernelNode GraphAddKernelNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddKernelNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddKernelNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_KERNEL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /**
     * Creates a kernel execution node and adds it to a graph.
     * 
     * <p>Creates a new kernel execution node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and
     * arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the
     * graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>When the graph is launched, the node will invoke kernel {@code func} on a ({@code gridDimX} x {@code gridDimY} x {@code gridDimZ}) grid of blocks. Each
     * block contains ({@code blockDimX} x {@code blockDimY} x {@code blockDimZ}) threads.</p>
     * 
     * <p>{@code sharedMemBytes} sets the amount of dynamic shared memory that will be available to each thread block.</p>
     * 
     * <p>Kernel parameters to {@code func} can be specified in one of two ways:</p>
     * 
     * <ol>
     * <li>Kernel parameters can be specified via {@code kernelParams}. If the kernel has N parameters, then {@code kernelParams} needs to be an array of N
     * pointers. Each pointer, from {@code kernelParams[0]} to {@code kernelParams[N-1]}, points to the region of memory from which the actual parameter
     * will be copied. The number of kernel parameters and their offsets and sizes do not need to be specified as that information is retrieved directly
     * from the kernel's image.</li>
     * <li>Kernel parameters for non-cooperative kernels can also be packaged by the application into a single buffer that is passed in via {@code extra}.
     * This places the burden on the application of knowing each kernel parameter's size and alignment/padding within the buffer. The {@code extra}
     * parameter exists to allow this function to take additional less commonly used arguments. {@code extra} specifies a list of names of extra settings
     * and their corresponding values. Each extra setting name is immediately followed by the corresponding value. The list must be terminated with either
     * {@code NULL} or {@link #CU_LAUNCH_PARAM_END LAUNCH_PARAM_END}.
     * 
     * <ul>
     * <li>{@link #CU_LAUNCH_PARAM_END LAUNCH_PARAM_END}, which indicates the end of the {@code extra} array;</li>
     * <li>{@link #CU_LAUNCH_PARAM_BUFFER_POINTER LAUNCH_PARAM_BUFFER_POINTER}, which specifies that the next value in {@code extra} will be a pointer to a buffer containing all the kernel
     * parameters for launching kernel {@code func;}</li>
     * <li>{@link #CU_LAUNCH_PARAM_BUFFER_SIZE LAUNCH_PARAM_BUFFER_SIZE}, which specifies that the next value in {@code extra} will be a pointer to a size_t containing the size of the buffer
     * specified with {@link #CU_LAUNCH_PARAM_BUFFER_POINTER LAUNCH_PARAM_BUFFER_POINTER};</li>
     * </ul></li>
     * </ol>
     * 
     * <p>The error {@link #CUDA_ERROR_INVALID_VALUE} will be returned if kernel parameters are specified with both {@code kernelParams} and {@code extra} (i.e. both
     * {@code kernelParams} and {@code extra} are non-NULL). {@link #CUDA_ERROR_INVALID_VALUE} will be returned if {@code extra} is used for a cooperative kernel.</p>
     * 
     * <p>The {@code kernelParams} or {@code extra} array, as well as the argument values it points to, are copied during this call.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Kernels launched using graphs must not use texture and surface references. Reading or writing through any texture or surface reference is
     * undefined behavior. This restriction does not apply to texture and surface objects.</p></div>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param nodeParams   parameters for the GPU execution node
     */
    @NativeType("CUresult")
    public static int cuGraphAddKernelNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddKernelNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphKernelNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphKernelNodeGetParams GraphKernelNodeGetParams} */
    public static int ncuGraphKernelNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Returns a kernel node's parameters.
     * 
     * <p>Returns the parameters of kernel node {@code hNode} in {@code nodeParams}. The {@code kernelParams} or {@code extra} array returned in
     * {@code nodeParams}, as well as the argument values it points to, are owned by the node. This memory remains valid until the node is destroyed or its
     * parameters are modified, and should not be modified directly. Use {@link #cuGraphKernelNodeSetParams GraphKernelNodeSetParams} to update the parameters of this node.</p>
     * 
     * <p>The params will contain either {@code kernelParams} or {@code extra}, according to which of these was most recently set on the node.</p>
     *
     * @param hNode      node to get the parameters for
     * @param nodeParams pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphKernelNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphKernelNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphKernelNodeSetParams GraphKernelNodeSetParams} */
    public static int ncuGraphKernelNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_KERNEL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets a kernel node's parameters.
     * 
     * <p>Sets the parameters of kernel node {@code hNode} to {@code nodeParams}.</p>
     *
     * @param hNode      node to set the parameters for
     * @param nodeParams parameters to copy
     */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphKernelNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemcpyNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddMemcpyNode GraphAddMemcpyNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddMemcpyNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long copyParams, long ctx) {
        long __functionAddress = Functions.GraphAddMemcpyNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(ctx);
        }
        return callPPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, copyParams, ctx, __functionAddress);
    }

    /**
     * Creates a memcpy node and adds it to a graph.
     * 
     * <p>Creates a new memcpy node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}. It is possible
     * for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies} may not have any duplicate
     * entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>When the graph is launched, the node will perform the memcpy described by {@code copyParams}. See {@link #cuMemcpy3D Memcpy3D} for a description of the structure and
     * its restrictions.</p>
     * 
     * <p>Memcpy nodes have some additional restrictions with regards to managed memory, if the system contains at least one device which has a zero value for
     * the device attribute {@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS}. If one or more of the operands refer to managed memory, then using the memory
     * type {@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED} is disallowed for those operand(s). The managed memory will be treated as residing on either the host or the device,
     * depending on which memory type is specified.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param copyParams   parameters for the memory copy
     * @param ctx          context on which to run the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddMemcpyNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D copyParams, @NativeType("CUcontext") long ctx) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemcpyNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), copyParams.address(), ctx);
    }

    // --- [ cuGraphMemcpyNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphMemcpyNodeGetParams GraphMemcpyNodeGetParams} */
    public static int ncuGraphMemcpyNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemcpyNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Returns a memcpy node's parameters.
     * 
     * <p>Returns the parameters of memcpy node {@code hNode} in {@code nodeParams}.</p>
     *
     * @param hNode      node to get the parameters for
     * @param nodeParams pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphMemcpyNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D *") CUDA_MEMCPY3D nodeParams) {
        return ncuGraphMemcpyNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphMemcpyNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphMemcpyNodeSetParams GraphMemcpyNodeSetParams} */
    public static int ncuGraphMemcpyNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemcpyNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets a memcpy node's parameters.
     * 
     * <p>Sets the parameters of memcpy node {@code hNode} to {@code nodeParams}.</p>
     *
     * @param hNode      node to set the parameters for
     * @param nodeParams parameters to copy
     */
    @NativeType("CUresult")
    public static int cuGraphMemcpyNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D nodeParams) {
        return ncuGraphMemcpyNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemsetNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddMemsetNode GraphAddMemsetNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddMemsetNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long memsetParams, long ctx) {
        long __functionAddress = Functions.GraphAddMemsetNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_MEMSET_NODE_PARAMS.validate(memsetParams);
            check(ctx);
        }
        return callPPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, memsetParams, ctx, __functionAddress);
    }

    /**
     * Creates a memset node and adds it to a graph.
     * 
     * <p>Creates a new memset node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}. It is possible
     * for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies} may not have any duplicate
     * entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>The element size must be 1, 2, or 4 bytes. When the graph is launched, the node will perform the memset described by {@code memsetParams}.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param memsetParams parameters for the memory set
     * @param ctx          context on which to run the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddMemsetNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS memsetParams, @NativeType("CUcontext") long ctx) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemsetNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), memsetParams.address(), ctx);
    }

    // --- [ cuGraphMemsetNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphMemsetNodeGetParams GraphMemsetNodeGetParams} */
    public static int ncuGraphMemsetNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemsetNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Returns a memset node's parameters.
     * 
     * <p>Returns the parameters of memset node {@code hNode} in {@code nodeParams}.</p>
     *
     * @param hNode      node to get the parameters for
     * @param nodeParams pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphMemsetNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS *") CUDA_MEMSET_NODE_PARAMS nodeParams) {
        return ncuGraphMemsetNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphMemsetNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphMemsetNodeSetParams GraphMemsetNodeSetParams} */
    public static int ncuGraphMemsetNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemsetNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_MEMSET_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets a memset node's parameters.
     * 
     * <p>Sets the parameters of memset node {@code hNode} to {@code nodeParams}.</p>
     *
     * @param hNode      node to set the parameters for
     * @param nodeParams parameters to copy
     */
    @NativeType("CUresult")
    public static int cuGraphMemsetNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS nodeParams) {
        return ncuGraphMemsetNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddHostNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddHostNode GraphAddHostNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddHostNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddHostNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /**
     * Creates a host execution node and adds it to a graph.
     * 
     * <p>Creates a new CPU execution node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and
     * arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the
     * graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>When the graph is launched, the node will invoke the specified CPU function. Host nodes are not supported under MPS with pre-Volta GPUs.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param nodeParams   parameters for the host node
     */
    @NativeType("CUresult")
    public static int cuGraphAddHostNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddHostNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphHostNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphHostNodeGetParams GraphHostNodeGetParams} */
    public static int ncuGraphHostNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphHostNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Returns a host node's parameters.
     * 
     * <p>Returns the parameters of host node {@code hNode} in {@code nodeParams}.</p>
     *
     * @param hNode      node to get the parameters for
     * @param nodeParams pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphHostNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphHostNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphHostNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphHostNodeSetParams GraphHostNodeSetParams} */
    public static int ncuGraphHostNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphHostNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets a host node's parameters.
     * 
     * <p>Sets the parameters of host node {@code hNode} to {@code nodeParams}.</p>
     *
     * @param hNode      node to set the parameters for
     * @param nodeParams parameters to copy
     */
    @NativeType("CUresult")
    public static int cuGraphHostNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphHostNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddChildGraphNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddChildGraphNode GraphAddChildGraphNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddChildGraphNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long childGraph) {
        long __functionAddress = Functions.GraphAddChildGraphNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(childGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, childGraph, __functionAddress);
    }

    /**
     * Creates a child graph node and adds it to a graph.
     * 
     * <p>Creates a new node which executes an embedded graph, and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code
     * dependencies}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies}
     * may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>If {@code hGraph} contains allocation or free nodes, this call will return an error.</p>
     * 
     * <p>The node executes an embedded child graph. The child graph is cloned in this call.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param childGraph   the graph to clone into this node
     */
    @NativeType("CUresult")
    public static int cuGraphAddChildGraphNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUgraph") long childGraph) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddChildGraphNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), childGraph);
    }

    // --- [ cuGraphChildGraphNodeGetGraph ] ---

    /** Unsafe version of: {@link #cuGraphChildGraphNodeGetGraph GraphChildGraphNodeGetGraph} */
    public static int ncuGraphChildGraphNodeGetGraph(long hNode, long phGraph) {
        long __functionAddress = Functions.GraphChildGraphNodeGetGraph;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, phGraph, __functionAddress);
    }

    /**
     * Gets a handle to the embedded graph of a child graph node.
     * 
     * <p>Gets a handle to the embedded graph in a child graph node. This call does not clone the graph. Changes to the graph will be reflected in the node, and
     * the node retains ownership of the graph.</p>
     * 
     * <p>Allocation and free nodes cannot be added to the returned graph. Attempting to do so will return an error.</p>
     *
     * @param hNode   node to get the embedded graph for
     * @param phGraph location to store a handle to the graph
     */
    @NativeType("CUresult")
    public static int cuGraphChildGraphNodeGetGraph(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraph *") PointerBuffer phGraph) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuGraphChildGraphNodeGetGraph(hNode, memAddress(phGraph));
    }

    // --- [ cuGraphAddEmptyNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddEmptyNode GraphAddEmptyNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddEmptyNode(long phGraphNode, long hGraph, long dependencies, long numDependencies) {
        long __functionAddress = Functions.GraphAddEmptyNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(phGraphNode, hGraph, dependencies, numDependencies, __functionAddress);
    }

    /**
     * Creates an empty node and adds it to a graph.
     * 
     * <p>Creates a new node which performs no operation, and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code
     * dependencies}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies}
     * may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>An empty node performs no operation during execution, but can be used for transitive ordering. For example, a phased execution graph with 2 groups of n
     * nodes with a barrier between them can be represented using an empty node and 2*n dependency edges, rather than no empty node and n^2 dependency edges.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddEmptyNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEmptyNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies));
    }

    // --- [ cuGraphAddEventRecordNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddEventRecordNode GraphAddEventRecordNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddEventRecordNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long event) {
        long __functionAddress = Functions.GraphAddEventRecordNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(event);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, event, __functionAddress);
    }

    /**
     * Creates an event record node and adds it to a graph.
     * 
     * <p>Creates a new event record node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and event
     * specified in {@code event}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code
     * dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>Each launch of the graph will record {@code event} to capture execution of the node's dependencies.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param event        event for the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddEventRecordNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUevent") long event) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEventRecordNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), event);
    }

    // --- [ cuGraphEventRecordNodeGetEvent ] ---

    /** Unsafe version of: {@link #cuGraphEventRecordNodeGetEvent GraphEventRecordNodeGetEvent} */
    public static int ncuGraphEventRecordNodeGetEvent(long hNode, long event_out) {
        long __functionAddress = Functions.GraphEventRecordNodeGetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, event_out, __functionAddress);
    }

    /**
     * Returns the event associated with an event record node.
     * 
     * <p>Returns the event of event record node {@code hNode} in {@code event_out}.</p>
     *
     * @param hNode     node to get the event for
     * @param event_out pointer to return the event
     */
    @NativeType("CUresult")
    public static int cuGraphEventRecordNodeGetEvent(@NativeType("CUgraphNode") long hNode, @NativeType("CUevent *") PointerBuffer event_out) {
        if (CHECKS) {
            check(event_out, 1);
        }
        return ncuGraphEventRecordNodeGetEvent(hNode, memAddress(event_out));
    }

    // --- [ cuGraphEventRecordNodeSetEvent ] ---

    /**
     * Sets an event record node's event.
     * 
     * <p>Sets the event of event record node {@code hNode} to {@code event}.</p>
     *
     * @param hNode node to set the event for
     * @param event event to use
     */
    @NativeType("CUresult")
    public static int cuGraphEventRecordNodeSetEvent(@NativeType("CUgraphNode") long hNode, @NativeType("CUevent") long event) {
        long __functionAddress = Functions.GraphEventRecordNodeSetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            check(event);
        }
        return callPPI(hNode, event, __functionAddress);
    }

    // --- [ cuGraphAddEventWaitNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddEventWaitNode GraphAddEventWaitNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddEventWaitNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long event) {
        long __functionAddress = Functions.GraphAddEventWaitNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(event);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, event, __functionAddress);
    }

    /**
     * Creates an event wait node and adds it to a graph.
     * 
     * <p>Creates a new event wait node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and event
     * specified in {@code event}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code
     * dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>The graph node will wait for all work captured in {@code event}. See {@link #cuEventRecord EventRecord} for details on what is captured by an event. {@code event} may
     * be from a different context or device than the launch stream.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param event        event for the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddEventWaitNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUevent") long event) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEventWaitNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), event);
    }

    // --- [ cuGraphEventWaitNodeGetEvent ] ---

    /** Unsafe version of: {@link #cuGraphEventWaitNodeGetEvent GraphEventWaitNodeGetEvent} */
    public static int ncuGraphEventWaitNodeGetEvent(long hNode, long event_out) {
        long __functionAddress = Functions.GraphEventWaitNodeGetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, event_out, __functionAddress);
    }

    /**
     * Returns the event associated with an event wait node.
     * 
     * <p>Returns the event of event wait node {@code hNode} in {@code event_out}.</p>
     *
     * @param hNode     node to get the event for
     * @param event_out pointer to return the event
     */
    @NativeType("CUresult")
    public static int cuGraphEventWaitNodeGetEvent(@NativeType("CUgraphNode") long hNode, @NativeType("CUevent *") PointerBuffer event_out) {
        if (CHECKS) {
            check(event_out, 1);
        }
        return ncuGraphEventWaitNodeGetEvent(hNode, memAddress(event_out));
    }

    // --- [ cuGraphEventWaitNodeSetEvent ] ---

    /**
     * Sets an event wait node's event.
     * 
     * <p>Sets the event of event wait node {@code hNode} to {@code event}.</p>
     *
     * @param hNode node to set the event for
     * @param event event to use
     */
    @NativeType("CUresult")
    public static int cuGraphEventWaitNodeSetEvent(@NativeType("CUgraphNode") long hNode, @NativeType("CUevent") long event) {
        long __functionAddress = Functions.GraphEventWaitNodeSetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            check(event);
        }
        return callPPI(hNode, event, __functionAddress);
    }

    // --- [ cuGraphAddExternalSemaphoresSignalNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddExternalSemaphoresSignalNode GraphAddExternalSemaphoresSignalNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddExternalSemaphoresSignalNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddExternalSemaphoresSignalNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /**
     * Creates an external semaphore signal node and adds it to a graph.
     * 
     * <p>Creates a new external semaphore signal node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}
     * and arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of
     * the graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>Performs a signal operation on a set of externally allocated semaphore objects when the node is launched. The operation(s) will occur after all of the
     * node's dependencies have completed.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param nodeParams   parameters for the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddExternalSemaphoresSignalNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddExternalSemaphoresSignalNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphExternalSemaphoresSignalNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphExternalSemaphoresSignalNodeGetParams GraphExternalSemaphoresSignalNodeGetParams} */
    public static int ncuGraphExternalSemaphoresSignalNodeGetParams(long hNode, long params_out) {
        long __functionAddress = Functions.GraphExternalSemaphoresSignalNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, params_out, __functionAddress);
    }

    /**
     * Returns an external semaphore signal node's parameters.
     * 
     * <p>Returns the parameters of an external semaphore signal node {@code hNode} in {@code params_out}. The {@code extSemArray} and {@code paramsArray}
     * returned in {@code params_out}, are owned by the node. This memory remains valid until the node is destroyed or its parameters are modified, and should
     * not be modified directly. Use {@link #cuGraphExternalSemaphoresSignalNodeSetParams GraphExternalSemaphoresSignalNodeSetParams} to update the parameters of this node.</p>
     *
     * @param hNode      node to get the parameters for
     * @param params_out pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresSignalNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS params_out) {
        return ncuGraphExternalSemaphoresSignalNodeGetParams(hNode, params_out.address());
    }

    // --- [ cuGraphExternalSemaphoresSignalNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExternalSemaphoresSignalNodeSetParams GraphExternalSemaphoresSignalNodeSetParams} */
    public static int ncuGraphExternalSemaphoresSignalNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExternalSemaphoresSignalNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets an external semaphore signal node's parameters.
     * 
     * <p>Sets the parameters of an external semaphore signal node {@code hNode} to {@code nodeParams}.</p>
     *
     * @param hNode      node to set the parameters for
     * @param nodeParams parameters to copy
     */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresSignalNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS nodeParams) {
        return ncuGraphExternalSemaphoresSignalNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddExternalSemaphoresWaitNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddExternalSemaphoresWaitNode GraphAddExternalSemaphoresWaitNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddExternalSemaphoresWaitNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddExternalSemaphoresWaitNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_EXT_SEM_WAIT_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /**
     * Creates an external semaphore wait node and adds it to a graph.
     * 
     * <p>Creates a new external semaphore wait node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}
     * and arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of
     * the graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>Performs a wait operation on a set of externally allocated semaphore objects when the node is launched. The node's dependencies will not be launched
     * until the wait operation has completed.</p>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param nodeParams   parameters for the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddExternalSemaphoresWaitNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS const *") CUDA_EXT_SEM_WAIT_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddExternalSemaphoresWaitNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphExternalSemaphoresWaitNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphExternalSemaphoresWaitNodeGetParams GraphExternalSemaphoresWaitNodeGetParams} */
    public static int ncuGraphExternalSemaphoresWaitNodeGetParams(long hNode, long params_out) {
        long __functionAddress = Functions.GraphExternalSemaphoresWaitNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, params_out, __functionAddress);
    }

    /**
     * Returns an external semaphore wait node's parameters.
     * 
     * <p>Returns the parameters of an external semaphore wait node {@code hNode} in {@code params_out}. The {@code extSemArray} and {@code paramsArray} returned
     * in {@code params_out}, are owned by the node. This memory remains valid until the node is destroyed or its parameters are modified, and should not be
     * modified directly. Use {@link #cuGraphExternalSemaphoresSignalNodeSetParams GraphExternalSemaphoresSignalNodeSetParams} to update the parameters of this node.</p>
     *
     * @param hNode      node to get the parameters for
     * @param params_out pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresWaitNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS *") CUDA_EXT_SEM_WAIT_NODE_PARAMS params_out) {
        return ncuGraphExternalSemaphoresWaitNodeGetParams(hNode, params_out.address());
    }

    // --- [ cuGraphExternalSemaphoresWaitNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExternalSemaphoresWaitNodeSetParams GraphExternalSemaphoresWaitNodeSetParams} */
    public static int ncuGraphExternalSemaphoresWaitNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExternalSemaphoresWaitNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_EXT_SEM_WAIT_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets an external semaphore wait node's parameters.
     * 
     * <p>Sets the parameters of an external semaphore wait node {@code hNode} to {@code nodeParams}.</p>
     *
     * @param hNode      node to set the parameters for
     * @param nodeParams parameters to copy
     */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresWaitNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS const *") CUDA_EXT_SEM_WAIT_NODE_PARAMS nodeParams) {
        return ncuGraphExternalSemaphoresWaitNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemAllocNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddMemAllocNode GraphAddMemAllocNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddMemAllocNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddMemAllocNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /**
     * Creates an allocation node and adds it to a graph.
     * 
     * <p>Creates a new allocation node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and arguments
     * specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph.
     * {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>When {@link #cuGraphAddMemAllocNode GraphAddMemAllocNode} creates an allocation node, it returns the address of the allocation in {@code nodeParams.dptr}. The allocation's address
     * remains fixed across instantiations and launches.</p>
     * 
     * <p>If the allocation is freed in the same graph, by creating a free node using {@link #cuGraphAddMemFreeNode GraphAddMemFreeNode}, the allocation can be accessed by nodes ordered
     * after the allocation node but before the free node. These allocations cannot be freed outside the owning graph, and they can only be freed once in the
     * owning graph.</p>
     * 
     * <p>If the allocation is not freed in the same graph, then it can be accessed not only by nodes in the graph which are ordered after the allocation node,
     * but also by stream operations ordered after the graph's execution but before the allocation is freed.</p>
     * 
     * <p>Allocations which are not freed in the same graph can be freed by:</p>
     * 
     * <ul>
     * <li>passing the allocation to {@link #cuMemFreeAsync MemFreeAsync} or {@link #cuMemFree MemFree};</li>
     * <li>launching a graph with a free node for that allocation; or</li>
     * <li>specifying {@link #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH} during instantiation, which makes each launch behave as though it called
     * {@link #cuMemFreeAsync MemFreeAsync} for every unfreed allocation.</li>
     * </ul>
     * 
     * <p>It is not possible to free an allocation in both the owning graph and another graph. If the allocation is freed in the same graph, a free node cannot
     * be added to another graph. If the allocation is freed in another graph, a free node can no longer be added to the owning graph.</p>
     * 
     * <p>The following restrictions apply to graphs which contain allocation and/or memory free nodes:</p>
     * 
     * <ul>
     * <li>Nodes and edges of the graph cannot be deleted.</li>
     * <li>The graph cannot be used in a child node.</li>
     * <li>Only one instantiation of the graph may exist at any point in time.</li>
     * <li>The graph cannot be cloned.</li>
     * </ul>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param nodeParams   parameters for the node
     */
    @NativeType("CUresult")
    public static int cuGraphAddMemAllocNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_MEM_ALLOC_NODE_PARAMS *") CUDA_MEM_ALLOC_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemAllocNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphMemAllocNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphMemAllocNodeGetParams GraphMemAllocNodeGetParams} */
    public static int ncuGraphMemAllocNodeGetParams(long hNode, long params_out) {
        long __functionAddress = Functions.GraphMemAllocNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, params_out, __functionAddress);
    }

    /**
     * Returns a memory alloc node's parameters.
     * 
     * <p>Returns the parameters of a memory alloc node {@code hNode} in {@code params_out}. The {@code poolProps} and {@code accessDescs} returned in {@code
     * params_out}, are owned by the node. This memory remains valid until the node is destroyed. The returned parameters must not be modified.</p>
     *
     * @param hNode      node to get the parameters for
     * @param params_out pointer to return the parameters
     */
    @NativeType("CUresult")
    public static int cuGraphMemAllocNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEM_ALLOC_NODE_PARAMS *") CUDA_MEM_ALLOC_NODE_PARAMS params_out) {
        return ncuGraphMemAllocNodeGetParams(hNode, params_out.address());
    }

    // --- [ cuGraphAddMemFreeNode ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddMemFreeNode GraphAddMemFreeNode}
     *
     * @param numDependencies number of dependencies
     */
    public static int ncuGraphAddMemFreeNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long dptr) {
        long __functionAddress = Functions.GraphAddMemFreeNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(dptr);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, dptr, __functionAddress);
    }

    /**
     * Creates a memory free node and adds it to a graph.
     * 
     * <p>Creates a new memory free node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and arguments
     * specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph.
     * {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.</p>
     * 
     * <p>{@link #cuGraphAddMemFreeNode GraphAddMemFreeNode} will return {@link #CUDA_ERROR_INVALID_VALUE} if the user attempts to free:</p>
     * 
     * <ul>
     * <li>an allocation twice in the same graph.</li>
     * <li>an address that was not returned by an allocation node.</li>
     * <li>an invalid address.</li>
     * </ul>
     * 
     * <p>The following restrictions apply to graphs which contain allocation and/or memory free nodes:</p>
     * 
     * <ul>
     * <li>Nodes and edges of the graph cannot be deleted.</li>
     * <li>The graph cannot be used in a child node.</li>
     * <li>Only one instantiation of the graph may exist at any point in time.</li>
     * <li>The graph cannot be cloned.</li>
     * </ul>
     *
     * @param phGraphNode  returns newly created node
     * @param hGraph       graph to which to add the node
     * @param dependencies dependencies of the node
     * @param dptr         address of memory to free
     */
    @NativeType("CUresult")
    public static int cuGraphAddMemFreeNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUdeviceptr") long dptr) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemFreeNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), dptr);
    }

    // --- [ cuGraphMemFreeNodeGetParams ] ---

    /** Unsafe version of: {@link #cuGraphMemFreeNodeGetParams GraphMemFreeNodeGetParams} */
    public static int ncuGraphMemFreeNodeGetParams(long hNode, long dptr_out) {
        long __functionAddress = Functions.GraphMemFreeNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, dptr_out, __functionAddress);
    }

    /**
     * Returns a memory free node's parameters.
     * 
     * <p>Returns the address of a memory free node {@code hNode} in {@code dptr_out}.</p>
     *
     * @param hNode    node to get the parameters for
     * @param dptr_out pointer to return the device address
     */
    @NativeType("CUresult")
    public static int cuGraphMemFreeNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUdeviceptr *") PointerBuffer dptr_out) {
        if (CHECKS) {
            check(dptr_out, 1);
        }
        return ncuGraphMemFreeNodeGetParams(hNode, memAddress(dptr_out));
    }

    // --- [ cuDeviceGraphMemTrim ] ---

    /**
     * Free unused memory that was cached on the specified device for use with graphs back to the OS.
     * 
     * <p>Blocks which are not in use by a graph that is either currently executing or scheduled to execute are freed back to the operating system.</p>
     *
     * @param device the device for which cached memory should be freed
     */
    @NativeType("CUresult")
    public static int cuDeviceGraphMemTrim(@NativeType("CUdevice") int device) {
        long __functionAddress = Functions.DeviceGraphMemTrim;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(device, __functionAddress);
    }

    // --- [ cuDeviceGetGraphMemAttribute ] ---

    /** Unsafe version of: {@link #cuDeviceGetGraphMemAttribute DeviceGetGraphMemAttribute} */
    public static int ncuDeviceGetGraphMemAttribute(int device, int attr, long value) {
        long __functionAddress = Functions.DeviceGetGraphMemAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(device, attr, value, __functionAddress);
    }

    /**
     * Query asynchronous allocation attributes related to graphs.
     * 
     * <p>Valid attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_CURRENT GRAPH_MEM_ATTR_USED_MEM_CURRENT}: Amount of memory, in bytes, currently associated with graphs</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_HIGH GRAPH_MEM_ATTR_USED_MEM_HIGH}: High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can
     * only be reset to zero.</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT}: Amount of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH GRAPH_MEM_ATTR_RESERVED_MEM_HIGH}: High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.</li>
     * </ul>
     *
     * @param device specifies the scope of the query
     * @param attr   attribute to get
     * @param value  retrieved value
     */
    @NativeType("CUresult")
    public static int cuDeviceGetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuDeviceGetGraphMemAttribute(device, attr, memAddress(value));
    }

    /**
     * Query asynchronous allocation attributes related to graphs.
     * 
     * <p>Valid attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_CURRENT GRAPH_MEM_ATTR_USED_MEM_CURRENT}: Amount of memory, in bytes, currently associated with graphs</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_HIGH GRAPH_MEM_ATTR_USED_MEM_HIGH}: High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can
     * only be reset to zero.</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT}: Amount of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH GRAPH_MEM_ATTR_RESERVED_MEM_HIGH}: High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.</li>
     * </ul>
     *
     * @param device specifies the scope of the query
     * @param attr   attribute to get
     * @param value  retrieved value
     */
    @NativeType("CUresult")
    public static int cuDeviceGetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuDeviceGetGraphMemAttribute(device, attr, memAddress(value));
    }

    // --- [ cuDeviceSetGraphMemAttribute ] ---

    /** Unsafe version of: {@link #cuDeviceSetGraphMemAttribute DeviceSetGraphMemAttribute} */
    public static int ncuDeviceSetGraphMemAttribute(int device, int attr, long value) {
        long __functionAddress = Functions.DeviceSetGraphMemAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(device, attr, value, __functionAddress);
    }

    /**
     * Set asynchronous allocation attributes related to graphs.
     * 
     * <p>Valid attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_HIGH GRAPH_MEM_ATTR_USED_MEM_HIGH}: High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can
     * only be reset to zero.</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH GRAPH_MEM_ATTR_RESERVED_MEM_HIGH}: High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.</li>
     * </ul>
     *
     * @param device specifies the scope of the query
     * @param attr   attribute to get
     * @param value  pointer to value to set
     */
    @NativeType("CUresult")
    public static int cuDeviceSetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuDeviceSetGraphMemAttribute(device, attr, memAddress(value));
    }

    /**
     * Set asynchronous allocation attributes related to graphs.
     * 
     * <p>Valid attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_MEM_ATTR_USED_MEM_HIGH GRAPH_MEM_ATTR_USED_MEM_HIGH}: High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can
     * only be reset to zero.</li>
     * <li>{@link #CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH GRAPH_MEM_ATTR_RESERVED_MEM_HIGH}: High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.</li>
     * </ul>
     *
     * @param device specifies the scope of the query
     * @param attr   attribute to get
     * @param value  pointer to value to set
     */
    @NativeType("CUresult")
    public static int cuDeviceSetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuDeviceSetGraphMemAttribute(device, attr, memAddress(value));
    }

    // --- [ cuGraphClone ] ---

    /** Unsafe version of: {@link #cuGraphClone GraphClone} */
    public static int ncuGraphClone(long phGraphClone, long originalGraph) {
        long __functionAddress = Functions.GraphClone;
        if (CHECKS) {
            check(__functionAddress);
            check(originalGraph);
        }
        return callPPI(phGraphClone, originalGraph, __functionAddress);
    }

    /**
     * Clones a graph.
     * 
     * <p>This function creates a copy of {@code originalGraph} and returns it in {@code phGraphClone}. All parameters are copied into the cloned graph. The
     * original graph may be modified after this call without affecting the clone.</p>
     * 
     * <p>Child graph nodes in the original graph are recursively copied into the clone.</p>
     *
     * @param phGraphClone  returns newly created cloned graph
     * @param originalGraph graph to clone
     */
    @NativeType("CUresult")
    public static int cuGraphClone(@NativeType("CUgraph *") PointerBuffer phGraphClone, @NativeType("CUgraph") long originalGraph) {
        if (CHECKS) {
            check(phGraphClone, 1);
        }
        return ncuGraphClone(memAddress(phGraphClone), originalGraph);
    }

    // --- [ cuGraphNodeFindInClone ] ---

    /** Unsafe version of: {@link #cuGraphNodeFindInClone GraphNodeFindInClone} */
    public static int ncuGraphNodeFindInClone(long phNode, long hOriginalNode, long hClonedGraph) {
        long __functionAddress = Functions.GraphNodeFindInClone;
        if (CHECKS) {
            check(__functionAddress);
            check(hOriginalNode);
            check(hClonedGraph);
        }
        return callPPPI(phNode, hOriginalNode, hClonedGraph, __functionAddress);
    }

    /**
     * Finds a cloned version of a node.
     * 
     * <p>This function returns the node in {@code hClonedGraph} corresponding to {@code hOriginalNode} in the original graph.</p>
     * 
     * <p>{@code hClonedGraph} must have been cloned from {@code hOriginalGraph} via {@link #cuGraphClone GraphClone}. {@code hOriginalNode} must have been in {@code
     * hOriginalGraph} at the time of the call to {@link #cuGraphClone GraphClone}, and the corresponding cloned node in {@code hClonedGraph} must not have been removed. The
     * cloned node is then returned via {@code phClonedNode}.</p>
     *
     * @param phNode        returns handle to the cloned node
     * @param hOriginalNode handle to the original node
     * @param hClonedGraph  cloned graph to query
     */
    @NativeType("CUresult")
    public static int cuGraphNodeFindInClone(@NativeType("CUgraphNode *") PointerBuffer phNode, @NativeType("CUgraphNode") long hOriginalNode, @NativeType("CUgraph") long hClonedGraph) {
        if (CHECKS) {
            check(phNode, 1);
        }
        return ncuGraphNodeFindInClone(memAddress(phNode), hOriginalNode, hClonedGraph);
    }

    // --- [ cuGraphNodeGetType ] ---

    /** Unsafe version of: {@link #cuGraphNodeGetType GraphNodeGetType} */
    public static int ncuGraphNodeGetType(long hNode, long type) {
        long __functionAddress = Functions.GraphNodeGetType;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, type, __functionAddress);
    }

    /**
     * Returns a node's type.
     * 
     * <p>Returns the node type of {@code hNode} in {@code type}.</p>
     *
     * @param hNode node to query
     * @param type  pointer to return the node type
     */
    @NativeType("CUresult")
    public static int cuGraphNodeGetType(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNodeType *") IntBuffer type) {
        if (CHECKS) {
            check(type, 1);
        }
        return ncuGraphNodeGetType(hNode, memAddress(type));
    }

    // --- [ cuGraphGetNodes ] ---

    /**
     * Unsafe version of: {@link #cuGraphGetNodes GraphGetNodes}
     *
     * @param numNodes see description
     */
    public static int ncuGraphGetNodes(long hGraph, long nodes, long numNodes) {
        long __functionAddress = Functions.GraphGetNodes;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPI(hGraph, nodes, numNodes, __functionAddress);
    }

    /**
     * Returns a graph's nodes.
     * 
     * <p>Returns a list of {@code hGraph's} nodes. {@code nodes} may be {@code NULL}, in which case this function will return the number of nodes in {@code numNodes}.
     * Otherwise, {@code numNodes} entries will be filled in. If {@code numNodes} is higher than the actual number of nodes, the remaining entries in {@code
     * nodes} will be set to {@code NULL}, and the number of nodes actually obtained will be returned in {@code numNodes}.</p>
     *
     * @param hGraph   graph to query
     * @param nodes    pointer to return the nodes
     * @param numNodes see description
     */
    @NativeType("CUresult")
    public static int cuGraphGetNodes(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode *") PointerBuffer nodes, @NativeType("size_t *") PointerBuffer numNodes) {
        if (CHECKS) {
            check(numNodes, 1);
            checkSafe(nodes, numNodes.get(numNodes.position()));
        }
        return ncuGraphGetNodes(hGraph, memAddressSafe(nodes), memAddress(numNodes));
    }

    // --- [ cuGraphGetRootNodes ] ---

    /**
     * Unsafe version of: {@link #cuGraphGetRootNodes GraphGetRootNodes}
     *
     * @param numRootNodes see description
     */
    public static int ncuGraphGetRootNodes(long hGraph, long rootNodes, long numRootNodes) {
        long __functionAddress = Functions.GraphGetRootNodes;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPI(hGraph, rootNodes, numRootNodes, __functionAddress);
    }

    /**
     * Returns a graph's root nodes.
     * 
     * <p>Returns a list of {@code hGraph's} root nodes. {@code rootNodes} may be {@code NULL}, in which case this function will return the number of root nodes in
     * {@code numRootNodes}. Otherwise, {@code numRootNodes} entries will be filled in. If {@code numRootNodes} is higher than the actual number of root
     * nodes, the remaining entries in {@code rootNodes} will be set to {@code NULL}, and the number of nodes actually obtained will be returned in {@code
     * numRootNodes}.</p>
     *
     * @param hGraph       graph to query
     * @param rootNodes    pointer to return the root nodes
     * @param numRootNodes see description
     */
    @NativeType("CUresult")
    public static int cuGraphGetRootNodes(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode *") PointerBuffer rootNodes, @NativeType("size_t *") PointerBuffer numRootNodes) {
        if (CHECKS) {
            check(numRootNodes, 1);
            checkSafe(rootNodes, numRootNodes.get(numRootNodes.position()));
        }
        return ncuGraphGetRootNodes(hGraph, memAddressSafe(rootNodes), memAddress(numRootNodes));
    }

    // --- [ cuGraphGetEdges ] ---

    /**
     * Unsafe version of: {@link #cuGraphGetEdges GraphGetEdges}
     *
     * @param numEdges see description
     */
    public static int ncuGraphGetEdges(long hGraph, long from, long to, long numEdges) {
        long __functionAddress = Functions.GraphGetEdges;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numEdges, __functionAddress);
    }

    /**
     * Returns a graph's dependency edges.
     * 
     * <p>Returns a list of {@code hGraph's} dependency edges. Edges are returned via corresponding indices in {@code from} and {@code to;} that is, the node in
     * {@code to[i]} has a dependency on the node in {@code from[i]}. {@code from} and {@code to} may both be {@code NULL}, in which case this function only returns
     * the number of edges in {@code numEdges}. Otherwise, {@code numEdges} entries will be filled in. If {@code numEdges} is higher than the actual number of
     * edges, the remaining entries in {@code from} and {@code to} will be set to {@code NULL}, and the number of edges actually returned will be written to
     * {@code numEdges}.</p>
     *
     * @param hGraph   graph to get the edges from
     * @param from     location to return edge endpoints
     * @param to       location to return edge endpoints
     * @param numEdges see description
     */
    @NativeType("CUresult")
    public static int cuGraphGetEdges(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode *") PointerBuffer from, @Nullable @NativeType("CUgraphNode *") PointerBuffer to, @NativeType("size_t *") PointerBuffer numEdges) {
        if (CHECKS) {
            check(numEdges, 1);
            checkSafe(from, numEdges.get(numEdges.position()));
            checkSafe(to, numEdges.get(numEdges.position()));
        }
        return ncuGraphGetEdges(hGraph, memAddressSafe(from), memAddressSafe(to), memAddress(numEdges));
    }

    // --- [ cuGraphNodeGetDependencies ] ---

    /**
     * Unsafe version of: {@link #cuGraphNodeGetDependencies GraphNodeGetDependencies}
     *
     * @param numDependencies see description
     */
    public static int ncuGraphNodeGetDependencies(long hNode, long dependencies, long numDependencies) {
        long __functionAddress = Functions.GraphNodeGetDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPPI(hNode, dependencies, numDependencies, __functionAddress);
    }

    /**
     * Returns a node's dependencies.
     * 
     * <p>Returns a list of {@code node's} dependencies. {@code dependencies} may be {@code NULL}, in which case this function will return the number of dependencies in
     * {@code numDependencies}. Otherwise, {@code numDependencies} entries will be filled in. If {@code numDependencies} is higher than the actual number of
     * dependencies, the remaining entries in {@code dependencies} will be set to {@code NULL}, and the number of nodes actually obtained will be returned in
     * {@code numDependencies}.</p>
     *
     * @param hNode           node to query
     * @param dependencies    pointer to return the dependencies
     * @param numDependencies see description
     */
    @NativeType("CUresult")
    public static int cuGraphNodeGetDependencies(@NativeType("CUgraphNode") long hNode, @Nullable @NativeType("CUgraphNode *") PointerBuffer dependencies, @NativeType("size_t *") PointerBuffer numDependencies) {
        if (CHECKS) {
            check(numDependencies, 1);
            checkSafe(dependencies, numDependencies.get(numDependencies.position()));
        }
        return ncuGraphNodeGetDependencies(hNode, memAddressSafe(dependencies), memAddress(numDependencies));
    }

    // --- [ cuGraphNodeGetDependentNodes ] ---

    /**
     * Unsafe version of: {@link #cuGraphNodeGetDependentNodes GraphNodeGetDependentNodes}
     *
     * @param numDependentNodes see description
     */
    public static int ncuGraphNodeGetDependentNodes(long hNode, long dependentNodes, long numDependentNodes) {
        long __functionAddress = Functions.GraphNodeGetDependentNodes;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPPI(hNode, dependentNodes, numDependentNodes, __functionAddress);
    }

    /**
     * Returns a node's dependent nodes.
     * 
     * <p>Returns a list of {@code node's} dependent nodes. {@code dependentNodes} may be {@code NULL}, in which case this function will return the number of dependent
     * nodes in {@code numDependentNodes}. Otherwise, {@code numDependentNodes} entries will be filled in. If {@code numDependentNodes} is higher than the
     * actual number of dependent nodes, the remaining entries in {@code dependentNodes} will be set to {@code NULL}, and the number of nodes actually obtained will
     * be returned in {@code numDependentNodes}.</p>
     *
     * @param hNode             node to query
     * @param dependentNodes    pointer to return the dependent nodes
     * @param numDependentNodes see description
     */
    @NativeType("CUresult")
    public static int cuGraphNodeGetDependentNodes(@NativeType("CUgraphNode") long hNode, @Nullable @NativeType("CUgraphNode *") PointerBuffer dependentNodes, @NativeType("size_t *") PointerBuffer numDependentNodes) {
        if (CHECKS) {
            check(numDependentNodes, 1);
            checkSafe(dependentNodes, numDependentNodes.get(numDependentNodes.position()));
        }
        return ncuGraphNodeGetDependentNodes(hNode, memAddressSafe(dependentNodes), memAddress(numDependentNodes));
    }

    // --- [ cuGraphAddDependencies ] ---

    /**
     * Unsafe version of: {@link #cuGraphAddDependencies GraphAddDependencies}
     *
     * @param numDependencies number of dependencies to be added
     */
    public static int ncuGraphAddDependencies(long hGraph, long from, long to, long numDependencies) {
        long __functionAddress = Functions.GraphAddDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numDependencies, __functionAddress);
    }

    /**
     * Adds dependency edges to a graph.
     * 
     * <p>The number of dependencies to be added is defined by {@code numDependencies} Elements in {@code from} and {@code to} at corresponding indices define a
     * dependency. Each node in {@code from} and {@code to} must belong to {@code hGraph}.</p>
     * 
     * <p>If {@code numDependencies} is 0, elements in {@code from} and {@code to} will be ignored. Specifying an existing dependency will return an error.</p>
     *
     * @param hGraph graph to which dependencies are added
     * @param from   array of nodes that provide the dependencies
     * @param to     array of dependent nodes
     */
    @NativeType("CUresult")
    public static int cuGraphAddDependencies(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer from, @Nullable @NativeType("CUgraphNode const *") PointerBuffer to) {
        if (CHECKS) {
            checkSafe(to, remainingSafe(from));
        }
        return ncuGraphAddDependencies(hGraph, memAddressSafe(from), memAddressSafe(to), remainingSafe(from));
    }

    // --- [ cuGraphRemoveDependencies ] ---

    /**
     * Unsafe version of: {@link #cuGraphRemoveDependencies GraphRemoveDependencies}
     *
     * @param numDependencies number of dependencies to be removed
     */
    public static int ncuGraphRemoveDependencies(long hGraph, long from, long to, long numDependencies) {
        long __functionAddress = Functions.GraphRemoveDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numDependencies, __functionAddress);
    }

    /**
     * Removes dependency edges from a graph.
     * 
     * <p>The number of {@code dependencies} to be removed is defined by {@code numDependencies}. Elements in {@code from} and {@code to} at corresponding
     * indices define a dependency. Each node in {@code from} and {@code to} must belong to {@code hGraph}.</p>
     * 
     * <p>If {@code numDependencies} is 0, elements in {@code from} and {@code to} will be ignored. Specifying a non-existing dependency will return an error.</p>
     * 
     * <p>Dependencies cannot be removed from graphs which contain allocation or free nodes. Any attempt to do so will return an error.</p>
     *
     * @param hGraph graph from which to remove dependencies
     * @param from   array of nodes that provide the dependencies
     * @param to     array of dependent nodes
     */
    @NativeType("CUresult")
    public static int cuGraphRemoveDependencies(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer from, @Nullable @NativeType("CUgraphNode const *") PointerBuffer to) {
        if (CHECKS) {
            checkSafe(to, remainingSafe(from));
        }
        return ncuGraphRemoveDependencies(hGraph, memAddressSafe(from), memAddressSafe(to), remainingSafe(from));
    }

    // --- [ cuGraphDestroyNode ] ---

    /**
     * Remove a node from the graph.
     * 
     * <p>Removes {@code hNode} from its graph. This operation also severs any dependencies of other nodes on {@code hNode} and vice versa.</p>
     * 
     * <p>Nodes which belong to a graph which contains allocation or free nodes cannot be destroyed. Any attempt to do so will return an error.</p>
     *
     * @param hNode node to remove
     */
    @NativeType("CUresult")
    public static int cuGraphDestroyNode(@NativeType("CUgraphNode") long hNode) {
        long __functionAddress = Functions.GraphDestroyNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPI(hNode, __functionAddress);
    }

    // --- [ cuGraphInstantiate ] ---

    /**
     * Unsafe version of: {@link #cuGraphInstantiate GraphInstantiate}
     *
     * @param bufferSize size of the log buffer in bytes
     */
    public static int ncuGraphInstantiate(long phGraphExec, long hGraph, long phErrorNode, long logBuffer, long bufferSize) {
        long __functionAddress = Functions.GraphInstantiate;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphExec, hGraph, phErrorNode, logBuffer, bufferSize, __functionAddress);
    }

    /**
     * Creates an executable graph from a graph.
     * 
     * <p>Instantiates {@code hGraph} as an executable graph. The graph is validated for any structural constraints or intra-node constraints which were not
     * previously validated. If instantiation is successful, a handle to the instantiated graph is returned in {@code phGraphExec}.</p>
     * 
     * <p>If there are any errors, diagnostic information may be returned in {@code errorNode} and {@code logBuffer}. This is the primary way to inspect
     * instantiation errors. The output will be null terminated unless the diagnostics overflow the buffer. In this case, they will be truncated, and the last
     * byte can be inspected to determine if truncation occurred.</p>
     *
     * @param phGraphExec returns instantiated graph
     * @param hGraph      graph to instantiate
     * @param phErrorNode in case of an instantiation error, this may be modified to indicate a node contributing to the error
     * @param logBuffer   a character buffer to store diagnostic messages
     */
    @NativeType("CUresult")
    public static int cuGraphInstantiate(@NativeType("CUgraphExec *") PointerBuffer phGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") PointerBuffer phErrorNode, @NativeType("char *") ByteBuffer logBuffer) {
        if (CHECKS) {
            check(phGraphExec, 1);
            check(phErrorNode, 1);
        }
        return ncuGraphInstantiate(memAddress(phGraphExec), hGraph, memAddress(phErrorNode), memAddress(logBuffer), logBuffer.remaining());
    }

    // --- [ cuGraphInstantiateWithFlags ] ---

    /** Unsafe version of: {@link #cuGraphInstantiateWithFlags GraphInstantiateWithFlags} */
    public static int ncuGraphInstantiateWithFlags(long phGraphExec, long hGraph, long flags) {
        long __functionAddress = Functions.GraphInstantiateWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPJI(phGraphExec, hGraph, flags, __functionAddress);
    }

    /**
     * Creates an executable graph from a graph.
     * 
     * <p>Instantiates {@code hGraph} as an executable graph. The graph is validated for any structural constraints or intra-node constraints which were not
     * previously validated. If instantiation is successful, a handle to the instantiated graph is returned in {@code phGraphExec}.</p>
     * 
     * <p>The {@code flags} parameter controls the behavior of instantiation and subsequent graph launches. Valid flags are:</p>
     * 
     * <ul>
     * <li>{@link #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH}, which configures a graph containing memory allocation nodes to automatically free any unfreed
     * memory allocations before the graph is relaunched.</li>
     * </ul>
     * 
     * <p>If {@code hGraph} contains any allocation or free nodes, there can be at most one executable graph in existence for that graph at a time.</p>
     * 
     * <p>An attempt to instantiate a second executable graph before destroying the first with {@link #cuGraphExecDestroy GraphExecDestroy} will result in an error.</p>
     *
     * @param phGraphExec returns instantiated graph
     * @param hGraph      graph to instantiate
     * @param flags       flags to control instantiation. See {@code CUgraphInstantiate_flags}.
     */
    @NativeType("CUresult")
    public static int cuGraphInstantiateWithFlags(@NativeType("CUgraphExec *") PointerBuffer phGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(phGraphExec, 1);
        }
        return ncuGraphInstantiateWithFlags(memAddress(phGraphExec), hGraph, flags);
    }

    // --- [ cuGraphExecKernelNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecKernelNodeSetParams GraphExecKernelNodeSetParams} */
    public static int ncuGraphExecKernelNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecKernelNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            CUDA_KERNEL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets the parameters for a kernel node in the given {@code graphExec}.
     * 
     * <p>Sets the parameters of a kernel node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
     * non-executable graph, from which the executable graph was instantiated.</p>
     * 
     * <p>{@code hNode} must not have been removed from the original graph. The {@code func} field of {@code nodeParams} cannot be modified and must match the
     * original value. All other values can be modified.</p>
     * 
     * <p>The modifications take effect at the next launch of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. {@code hNode} is also not modified by this call.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      kernel node from the graph from which graphExec was instantiated
     * @param nodeParams updated parameters to set
     */
    @NativeType("CUresult")
    public static int cuGraphExecKernelNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphExecKernelNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecMemcpyNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecMemcpyNodeSetParams GraphExecMemcpyNodeSetParams} */
    public static int ncuGraphExecMemcpyNodeSetParams(long hGraphExec, long hNode, long copyParams, long ctx) {
        long __functionAddress = Functions.GraphExecMemcpyNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            check(ctx);
        }
        return callPPPPI(hGraphExec, hNode, copyParams, ctx, __functionAddress);
    }

    /**
     * Sets the parameters for a memcpy node in the given {@code graphExec}.
     * 
     * <p>Updates the work represented by {@code hNode} in {@code hGraphExec} as though {@code hNode} had contained {@code copyParams} at instantiation.
     * {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges to and from {@code hNode} are ignored.</p>
     * 
     * <p>The source and destination memory in {@code copyParams} must be allocated from the same contexts as the original source and destination memory. Both
     * the instantiation-time memory operands and the memory operands in {@code copyParams} must be 1-dimensional. Zero-length operations are not supported.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. hNode is also not modified by this call.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_INVALID_VALUE} if the memory operands' mappings changed or either the original or new memory operands are multidimensional.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      memcpy node from the graph which was used to instantiate graphExec
     * @param copyParams the updated parameters to set
     * @param ctx        context on which to run the node
     */
    @NativeType("CUresult")
    public static int cuGraphExecMemcpyNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D copyParams, @NativeType("CUcontext") long ctx) {
        return ncuGraphExecMemcpyNodeSetParams(hGraphExec, hNode, copyParams.address(), ctx);
    }

    // --- [ cuGraphExecMemsetNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecMemsetNodeSetParams GraphExecMemsetNodeSetParams} */
    public static int ncuGraphExecMemsetNodeSetParams(long hGraphExec, long hNode, long memsetParams, long ctx) {
        long __functionAddress = Functions.GraphExecMemsetNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            CUDA_MEMSET_NODE_PARAMS.validate(memsetParams);
            check(ctx);
        }
        return callPPPPI(hGraphExec, hNode, memsetParams, ctx, __functionAddress);
    }

    /**
     * Sets the parameters for a {@code memset} node in the given {@code graphExec}.
     * 
     * <p>Updates the work represented by {@code hNode} in {@code hGraphExec} as though {@code hNode} had contained {@code memsetParams} at instantiation.
     * {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges to and from {@code hNode} are ignored.</p>
     * 
     * <p>The destination memory in {@code memsetParams} must be allocated from the same contexts as the original destination memory. Both the instantiation-time
     * memory operand and the memory operand in {@code memsetParams} must be 1-dimensional. Zero-length operations are not supported.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. hNode is also not modified by this call.</p>
     * 
     * <p>Returns CUDA_ERROR_INVALID_VALUE if the memory operand's mappings changed or either the original or new memory operand are multidimensional.</p>
     *
     * @param hGraphExec   the executable graph in which to set the specified node
     * @param hNode        memset node from the graph which was used to instantiate graphExec
     * @param memsetParams the updated parameters to set
     * @param ctx          context on which to run the node
     */
    @NativeType("CUresult")
    public static int cuGraphExecMemsetNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS memsetParams, @NativeType("CUcontext") long ctx) {
        return ncuGraphExecMemsetNodeSetParams(hGraphExec, hNode, memsetParams.address(), ctx);
    }

    // --- [ cuGraphExecHostNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecHostNodeSetParams GraphExecHostNodeSetParams} */
    public static int ncuGraphExecHostNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecHostNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets the parameters for a host node in the given {@code graphExec}.
     * 
     * <p>Updates the work represented by {@code hNode} in {@code hGraphExec} as though {@code hNode} had contained {@code nodeParams} at instantiation.
     * {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges to and from {@code hNode} are ignored.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. hNode is also not modified by this call.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      host node from the graph which was used to instantiate graphExec
     * @param nodeParams the updated parameters to set
     */
    @NativeType("CUresult")
    public static int cuGraphExecHostNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphExecHostNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecChildGraphNodeSetParams ] ---

    /**
     * Updates node parameters in the child graph node in the given {@code graphExec}.
     * 
     * <p>Updates the work represented by {@code hNode} in {@code hGraphExec} as though the nodes contained in {@code hNode's} graph had the parameters contained
     * in {@code childGraph's} nodes at instantiation. {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges
     * to and from {@code hNode} are ignored.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. {@code hNode} is also not modified by this call.</p>
     * 
     * <p>The topology of {@code childGraph}, as well as the node insertion order, must match that of the graph contained in {@code hNode}. See
     * {@link #cuGraphExecUpdate GraphExecUpdate} for a list of restrictions on what can be updated in an instantiated graph. The update is recursive, so child graph nodes
     * contained within the top level child graph will also be updated.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      host node from the graph which was used to instantiate {@code graphExec}
     * @param childGraph the graph supplying the updated parameters
     */
    @NativeType("CUresult")
    public static int cuGraphExecChildGraphNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUgraph") long childGraph) {
        long __functionAddress = Functions.GraphExecChildGraphNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            check(childGraph);
        }
        return callPPPI(hGraphExec, hNode, childGraph, __functionAddress);
    }

    // --- [ cuGraphExecEventRecordNodeSetEvent ] ---

    /**
     * Sets the event for an event record node in the given {@code graphExec}.
     * 
     * <p>Sets the event of an event record node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
     * non-executable graph, from which the executable graph was instantiated.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. {@code hNode} is also not modified by this call.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      event record node from the graph from which graphExec was instantiated
     * @param event      updated event to use
     */
    @NativeType("CUresult")
    public static int cuGraphExecEventRecordNodeSetEvent(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUevent") long event) {
        long __functionAddress = Functions.GraphExecEventRecordNodeSetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            check(event);
        }
        return callPPPI(hGraphExec, hNode, event, __functionAddress);
    }

    // --- [ cuGraphExecEventWaitNodeSetEvent ] ---

    /**
     * Sets the event for an event wait node in the given {@code graphExec}.
     * 
     * <p>Sets the event of an event wait node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
     * non-executable graph, from which the executable graph was instantiated.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. {@code hNode} is also not modified by this call.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      event wait node from the graph from which graphExec was instantiated
     * @param event      updated event to use
     */
    @NativeType("CUresult")
    public static int cuGraphExecEventWaitNodeSetEvent(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUevent") long event) {
        long __functionAddress = Functions.GraphExecEventWaitNodeSetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            check(event);
        }
        return callPPPI(hGraphExec, hNode, event, __functionAddress);
    }

    // --- [ cuGraphExecExternalSemaphoresSignalNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecExternalSemaphoresSignalNodeSetParams GraphExecExternalSemaphoresSignalNodeSetParams} */
    public static int ncuGraphExecExternalSemaphoresSignalNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecExternalSemaphoresSignalNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets the parameters for an external semaphore signal node in the given {@code graphExec}.
     * 
     * <p>Sets the parameters of an external semaphore signal node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node
     * {@code hNode} in the non-executable graph, from which the executable graph was instantiated.</p>
     * 
     * <p>{@code hNode} must not have been removed from the original graph.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. {@code hNode} is also not modified by this call.</p>
     * 
     * <p>Changing {@code nodeParams->numExtSems} is not supported.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      semaphore signal node from the graph from which graphExec was instantiated
     * @param nodeParams updated Parameters to set
     */
    @NativeType("CUresult")
    public static int cuGraphExecExternalSemaphoresSignalNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS nodeParams) {
        return ncuGraphExecExternalSemaphoresSignalNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecExternalSemaphoresWaitNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecExternalSemaphoresWaitNodeSetParams GraphExecExternalSemaphoresWaitNodeSetParams} */
    public static int ncuGraphExecExternalSemaphoresWaitNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecExternalSemaphoresWaitNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            CUDA_EXT_SEM_WAIT_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /**
     * Sets the parameters for an external semaphore wait node in the given graphExec.
     * 
     * <p>Sets the parameters of an external semaphore wait node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node
     * {@code hNode} in the non-executable graph, from which the executable graph was instantiated.</p>
     * 
     * <p>{@code hNode} must not have been removed from the original graph.</p>
     * 
     * <p>The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
     * this call. {@code hNode} is also not modified by this call.</p>
     * 
     * <p>Changing {@code nodeParams->numExtSems} is not supported.</p>
     *
     * @param hGraphExec the executable graph in which to set the specified node
     * @param hNode      semaphore wait node from the graph from which graphExec was instantiated
     * @param nodeParams updated Parameters to set
     */
    @NativeType("CUresult")
    public static int cuGraphExecExternalSemaphoresWaitNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS const *") CUDA_EXT_SEM_WAIT_NODE_PARAMS nodeParams) {
        return ncuGraphExecExternalSemaphoresWaitNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphUpload ] ---

    /**
     * Uploads an executable graph in a stream.
     * 
     * <p>Uploads {@code hGraphExec} to the device in {@code hStream} without executing it. Uploads of the same {@code hGraphExec} will be serialized. Each
     * upload is ordered behind both any previous work in {@code hStream} and any previous launches of {@code hGraphExec}. Uses memory cached by {@code
     * stream} to back the allocations owned by {@code hGraphExec}.</p>
     *
     * @param hGraphExec executable graph to upload
     * @param hStream    stream in which to upload the graph
     */
    @NativeType("CUresult")
    public static int cuGraphUpload(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.GraphUpload;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
        }
        return callPPI(hGraphExec, hStream, __functionAddress);
    }

    // --- [ cuGraphLaunch ] ---

    /**
     * Launches an executable graph in a stream.
     * 
     * <p>Executes {@code hGraphExec} in {@code hStream}. Only one instance of {@code hGraphExec} may be executing at a time. Each launch is ordered behind both
     * any previous work in {@code hStream} and any previous launches of {@code hGraphExec}. To execute a graph concurrently, it must be instantiated multiple
     * times into multiple executable graphs.</p>
     * 
     * <p>If any allocations created by {@code hGraphExec} remain unfreed (from a previous launch) and {@code hGraphExec} was not instantiated with
     * {@link #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH}, the launch will fail with {@link #CUDA_ERROR_INVALID_VALUE}.</p>
     *
     * @param hGraphExec executable graph to launch
     * @param hStream    stream in which to launch the graph
     */
    @NativeType("CUresult")
    public static int cuGraphLaunch(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.GraphLaunch;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
        }
        return callPPI(hGraphExec, hStream, __functionAddress);
    }

    // --- [ cuGraphExecDestroy ] ---

    /**
     * Destroys an executable graph.
     * 
     * <p>Destroys the executable graph specified by {@code hGraphExec}, as well as all of its executable nodes. If the executable graph is in-flight, it will
     * not be terminated, but rather freed asynchronously on completion.</p>
     *
     * @param hGraphExec executable graph to destroy
     */
    @NativeType("CUresult")
    public static int cuGraphExecDestroy(@NativeType("CUgraphExec") long hGraphExec) {
        long __functionAddress = Functions.GraphExecDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
        }
        return callPI(hGraphExec, __functionAddress);
    }

    // --- [ cuGraphDestroy ] ---

    /**
     * Destroys a graph.
     * 
     * <p>Destroys the graph specified by {@code hGraph}, as well as all of its nodes.</p>
     *
     * @param hGraph graph to destroy
     */
    @NativeType("CUresult")
    public static int cuGraphDestroy(@NativeType("CUgraph") long hGraph) {
        long __functionAddress = Functions.GraphDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPI(hGraph, __functionAddress);
    }

    // --- [ cuGraphExecUpdate ] ---

    /** Unsafe version of: {@link #cuGraphExecUpdate GraphExecUpdate} */
    public static int ncuGraphExecUpdate(long hGraphExec, long hGraph, long hErrorNode_out, long updateResult_out) {
        long __functionAddress = Functions.GraphExecUpdate;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hGraph);
        }
        return callPPPPI(hGraphExec, hGraph, hErrorNode_out, updateResult_out, __functionAddress);
    }

    /**
     * Check whether an executable graph can be updated with a graph and perform the update if possible.
     * 
     * <p>Updates the node parameters in the instantiated graph specified by {@code hGraphExec} with the node parameters in a topologically identical graph
     * specified by {@code hGraph}.</p>
     * 
     * <p>Limitations:</p>
     * 
     * <ul>
     * <li>Kernel nodes:
     * 
     * <ul>
     * <li>The owning context of the function cannot change.</li>
     * <li>A node whose function originally did not use CUDA dynamic parallelism cannot be updated to a function which uses CDP</li>
     * </ul></li>
     * <li>Memset and memcpy nodes:
     * 
     * <ul>
     * <li>The CUDA device(s) to which the operand(s) was allocated/mapped cannot change.</li>
     * <li>The source/destination memory must be allocated from the same contexts as the original source/destination memory.</li>
     * <li>Only 1D memsets can be changed.</li>
     * </ul></li>
     * <li>Additional memcpy node restrictions:
     * 
     * <ul>
     * <li>Changing either the source or destination memory type(i.e. CU_MEMORYTYPE_DEVICE, CU_MEMORYTYPE_ARRAY, etc.) is not supported.</li>
     * </ul></li>
     * <li>External semaphore wait nodes and record nodes:
     * 
     * <ul>
     * <li>Changing either the source or destination memory type(i.e. CU_MEMORYTYPE_DEVICE, CU_MEMORYTYPE_ARRAY, etc.) is not supported.</li>
     * </ul></li>
     * </ul>
     * 
     * <p>Note: The API may add further restrictions in future releases. The return code should always be checked.</p>
     * 
     * <p>{@code cuGraphExecUpdate} sets {@code updateResult_out} to {@link #CU_GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED} under the following conditions:</p>
     * 
     * <ul>
     * <li>The count of nodes directly in {@code hGraphExec} and {@code hGraph} differ, in which case {@code hErrorNode_out} is {@code NULL}.</li>
     * <li>A node is deleted in {@code hGraph} but not not its pair from {@code hGraphExec}, in which case {@code hErrorNode_out} is {@code NULL}.</li>
     * <li>A node is deleted in {@code hGraphExec} but not its pair from {@code hGraph}, in which case {@code hErrorNode_out} is the pairless node from {@code
     * hGraph}.</li>
     * <li>The dependent nodes of a pair differ, in which case {@code hErrorNode_out} is the node from {@code hGraph}.</li>
     * </ul>
     * 
     * <p>{@code cuGraphExecUpdate} sets {@code updateResult_out} to:</p>
     * 
     * <ul>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR GRAPH_EXEC_UPDATE_ERROR} if passed an invalid value.</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED} if the graph topology changed</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED} if the type of a node changed, in which case {@code hErrorNode_out} is set to the node from
     * {@code hGraph}.</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE} if the function changed in an unsupported way(see note above), in which case
     * {@code hErrorNode_out} is set to the node from {@code hGraph}</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED} if any parameters to a node changed in a way that is not supported, in which case
     * {@code hErrorNode_out} is set to the node from {@code hGraph}.</li>
     * <li>{@link #CU_GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED} if something about a node is unsupported, like the node's type or configuration, in which case
     * {@code hErrorNode_out} is set to the node from {@code hGraph}</li>
     * </ul>
     * 
     * <p>If {@code updateResult_out} isn't set in one of the situations described above, the update check passes and cuGraphExecUpdate updates
     * {@code hGraphExec} to match the contents of {@code hGraph}. If an error happens during the update, {@code updateResult_out} will be set to
     * {@link #CU_GRAPH_EXEC_UPDATE_ERROR GRAPH_EXEC_UPDATE_ERROR}; otherwise, {@code updateResult_out} is set to {@link #CU_GRAPH_EXEC_UPDATE_SUCCESS GRAPH_EXEC_UPDATE_SUCCESS}.</p>
     * 
     * <p>{@code cuGraphExecUpdate} returns {@link #CUDA_SUCCESS} when the updated was performed successfully. It returns {@link #CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE} if the
     * graph update was not performed because it included changes which violated constraints specific to instantiated graph update.</p>
     *
     * @param hGraphExec       the instantiated graph to be updated
     * @param hGraph           the graph containing the updated parameters
     * @param hErrorNode_out   the node which caused the permissibility check to forbid the update, if any
     * @param updateResult_out whether the graph update was permitted. If was forbidden, the reason why.
     */
    @NativeType("CUresult")
    public static int cuGraphExecUpdate(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") PointerBuffer hErrorNode_out, @NativeType("CUgraphExecUpdateResult *") IntBuffer updateResult_out) {
        if (CHECKS) {
            check(hErrorNode_out, 1);
            check(updateResult_out, 1);
        }
        return ncuGraphExecUpdate(hGraphExec, hGraph, memAddress(hErrorNode_out), memAddress(updateResult_out));
    }

    // --- [ cuGraphKernelNodeCopyAttributes ] ---

    /**
     * Copies attributes from source node to destination node.
     * 
     * <p>Copies attributes from source node {@code src} to destination node {@code dst}. Both node must have the same context.</p>
     *
     * @param dst destination node
     * @param src source node. For list of attributes see {@code CUkernelNodeAttrID}.
     */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeCopyAttributes(@NativeType("CUgraphNode") long dst, @NativeType("CUgraphNode") long src) {
        long __functionAddress = Functions.GraphKernelNodeCopyAttributes;
        if (CHECKS) {
            check(__functionAddress);
            check(dst);
            check(src);
        }
        return callPPI(dst, src, __functionAddress);
    }

    // --- [ cuGraphKernelNodeGetAttribute ] ---

    /** Unsafe version of: {@link #cuGraphKernelNodeGetAttribute GraphKernelNodeGetAttribute} */
    public static int ncuGraphKernelNodeGetAttribute(long hNode, int attr, long value_out) {
        long __functionAddress = Functions.GraphKernelNodeGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, attr, value_out, __functionAddress);
    }

    /**
     * Queries node attribute.
     * 
     * <p>Queries attribute {@code attr} from node {@code hNode} and stores it in corresponding member of {@code value_out}.</p>
     */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeGetAttribute(@NativeType("CUgraphNode") long hNode, @NativeType("CUkernelNodeAttrID") int attr, @NativeType("CUkernelNodeAttrValue *") CUkernelNodeAttrValue value_out) {
        return ncuGraphKernelNodeGetAttribute(hNode, attr, value_out.address());
    }

    // --- [ cuGraphKernelNodeSetAttribute ] ---

    /** Unsafe version of: {@link #cuGraphKernelNodeSetAttribute GraphKernelNodeSetAttribute} */
    public static int ncuGraphKernelNodeSetAttribute(long hNode, int attr, long value) {
        long __functionAddress = Functions.GraphKernelNodeSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, attr, value, __functionAddress);
    }

    /**
     * Sets node attribute.
     * 
     * <p>Sets attribute {@code attr} on node {@code hNode} from corresponding attribute of {@code value}.</p>
     */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeSetAttribute(@NativeType("CUgraphNode") long hNode, @NativeType("CUkernelNodeAttrID") int attr, @NativeType("CUkernelNodeAttrValue const *") CUkernelNodeAttrValue value) {
        return ncuGraphKernelNodeSetAttribute(hNode, attr, value.address());
    }

    // --- [ cuGraphDebugDotPrint ] ---

    /** Unsafe version of: {@link #cuGraphDebugDotPrint GraphDebugDotPrint} */
    public static int ncuGraphDebugDotPrint(long hGraph, long path, int flags) {
        long __functionAddress = Functions.GraphDebugDotPrint;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPI(hGraph, path, flags, __functionAddress);
    }

    /**
     * Write a DOT file describing graph structure.
     * 
     * <p>Using the provided {@code hGraph}, write to {@code path} a DOT formatted description of the graph. By default this includes the graph topology, node
     * types, node id, kernel names and memcpy direction. {@code flags} can be specified to write more detailed information about each node type such as
     * parameter values, kernel attributes, node and function handles.</p>
     *
     * @param hGraph the graph to create a DOT file from
     * @param path   the path to write the DOT file to
     * @param flags  flags from {@code CUgraphDebugDot_flags} for specifying which additional node information to write
     */
    @NativeType("CUresult")
    public static int cuGraphDebugDotPrint(@NativeType("CUgraph") long hGraph, @NativeType("char const *") ByteBuffer path, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            checkNT1(path);
        }
        return ncuGraphDebugDotPrint(hGraph, memAddress(path), flags);
    }

    /**
     * Write a DOT file describing graph structure.
     * 
     * <p>Using the provided {@code hGraph}, write to {@code path} a DOT formatted description of the graph. By default this includes the graph topology, node
     * types, node id, kernel names and memcpy direction. {@code flags} can be specified to write more detailed information about each node type such as
     * parameter values, kernel attributes, node and function handles.</p>
     *
     * @param hGraph the graph to create a DOT file from
     * @param path   the path to write the DOT file to
     * @param flags  flags from {@code CUgraphDebugDot_flags} for specifying which additional node information to write
     */
    @NativeType("CUresult")
    public static int cuGraphDebugDotPrint(@NativeType("CUgraph") long hGraph, @NativeType("char const *") CharSequence path, @NativeType("unsigned int") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return ncuGraphDebugDotPrint(hGraph, pathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuUserObjectCreate ] ---

    /** Unsafe version of: {@link #cuUserObjectCreate UserObjectCreate} */
    public static int ncuUserObjectCreate(long object_out, long ptr, long destroy, int initialRefcount, int flags) {
        long __functionAddress = Functions.UserObjectCreate;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPI(object_out, ptr, destroy, initialRefcount, flags, __functionAddress);
    }

    /**
     * Create a user object.
     * 
     * <p>Create a user object with the specified destructor callback and initial reference count. The initial references are owned by the caller.</p>
     * 
     * <p>Destructor callbacks cannot make CUDA API calls and should avoid blocking behavior, as they are executed by a shared internal thread. Another thread
     * may be signaled to perform such actions, if it does not block forward progress of tasks scheduled through CUDA.</p>
     * 
     * <p>See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.</p>
     *
     * @param object_out      location to return the user object handle
     * @param ptr             the pointer to pass to the destroy function
     * @param destroy         callback to free the user object when it is no longer in use
     * @param initialRefcount the initial refcount to create the object with, typically 1. The initial references are owned by the calling thread.
     * @param flags           currently it is required to pass {@link #CU_USER_OBJECT_NO_DESTRUCTOR_SYNC USER_OBJECT_NO_DESTRUCTOR_SYNC}, which is the only defined flag. This indicates that the destroy callback
     *                        cannot be waited on by any CUDA API. Users requiring synchronization of the callback should signal its completion manually.
     */
    @NativeType("CUresult")
    public static int cuUserObjectCreate(@NativeType("CUuserObject *") PointerBuffer object_out, @NativeType("void *") long ptr, @NativeType("void (*) (void *)") CUhostFnI destroy, @NativeType("unsigned int") int initialRefcount, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(object_out, 1);
        }
        return ncuUserObjectCreate(memAddress(object_out), ptr, destroy.address(), initialRefcount, flags);
    }

    // --- [ cuUserObjectRetain ] ---

    /**
     * Retain a reference to a user object.
     * 
     * <p>Retains new references to a user object. The new references are owned by the caller.</p>
     * 
     * <p>See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.</p>
     *
     * @param object the object to retain
     * @param count  the number of references to retain, typically 1. Must be nonzero and not larger than INT_MAX.
     */
    @NativeType("CUresult")
    public static int cuUserObjectRetain(@NativeType("CUuserObject") long object, @NativeType("unsigned int") int count) {
        long __functionAddress = Functions.UserObjectRetain;
        if (CHECKS) {
            check(__functionAddress);
            check(object);
        }
        return callPI(object, count, __functionAddress);
    }

    // --- [ cuUserObjectRelease ] ---

    /**
     * Release a reference to a user object.
     * 
     * <p>Releases user object references owned by the caller. The object's destructor is invoked if the reference count reaches zero.</p>
     * 
     * <p>It is undefined behavior to release references not owned by the caller, or to use a user object handle after all references are released.</p>
     * 
     * <p>See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.</p>
     *
     * @param object the object to release
     * @param count  the number of references to release, typically 1. Must be nonzero and not larger than INT_MAX.
     */
    @NativeType("CUresult")
    public static int cuUserObjectRelease(@NativeType("CUuserObject") long object, @NativeType("unsigned int") int count) {
        long __functionAddress = Functions.UserObjectRelease;
        if (CHECKS) {
            check(__functionAddress);
            check(object);
        }
        return callPI(object, count, __functionAddress);
    }

    // --- [ cuGraphRetainUserObject ] ---

    /**
     * Retain a reference to a user object from a graph.
     * 
     * <p>Creates or moves user object references that will be owned by a CUDA graph.</p>
     * 
     * <p>See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.</p>
     *
     * @param graph  the graph to associate the reference with
     * @param object the user object to retain a reference for
     * @param count  the number of references to add to the graph, typically 1. Must be nonzero and not larger than INT_MAX.
     * @param flags  the optional flag {@link #CU_GRAPH_USER_OBJECT_MOVE GRAPH_USER_OBJECT_MOVE} transfers references from the calling thread, rather than create new references. Pass 0 to create new
     *               references.
     */
    @NativeType("CUresult")
    public static int cuGraphRetainUserObject(@NativeType("CUgraph") long graph, @NativeType("CUuserObject") long object, @NativeType("unsigned int") int count, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.GraphRetainUserObject;
        if (CHECKS) {
            check(__functionAddress);
            check(graph);
            check(object);
        }
        return callPPI(graph, object, count, flags, __functionAddress);
    }

    // --- [ cuGraphReleaseUserObject ] ---

    /**
     * Release a user object reference from a graph.
     * 
     * <p>Releases user object references owned by a graph.</p>
     * 
     * <p>See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.</p>
     *
     * @param graph  the graph that will release the reference
     * @param object the user object to release a reference for
     * @param count  the number of references to release, typically 1. Must be nonzero and not larger than INT_MAX.
     */
    @NativeType("CUresult")
    public static int cuGraphReleaseUserObject(@NativeType("CUgraph") long graph, @NativeType("CUuserObject") long object, @NativeType("unsigned int") int count) {
        long __functionAddress = Functions.GraphReleaseUserObject;
        if (CHECKS) {
            check(__functionAddress);
            check(graph);
            check(object);
        }
        return callPPI(graph, object, count, __functionAddress);
    }

    // --- [ cuOccupancyMaxActiveBlocksPerMultiprocessor ] ---

    /** Unsafe version of: {@link #cuOccupancyMaxActiveBlocksPerMultiprocessor OccupancyMaxActiveBlocksPerMultiprocessor} */
    public static int ncuOccupancyMaxActiveBlocksPerMultiprocessor(long numBlocks, long func, int blockSize, long dynamicSMemSize) {
        long __functionAddress = Functions.OccupancyMaxActiveBlocksPerMultiprocessor;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPI(numBlocks, func, blockSize, dynamicSMemSize, __functionAddress);
    }

    /**
     * Returns occupancy of a function.
     * 
     * <p>Returns in {@code *numBlocks} the number of the maximum active blocks per streaming multiprocessor.</p>
     *
     * @param numBlocks       returned occupancy
     * @param func            kernel for which occupancy is calculated
     * @param blockSize       block size the kernel is intended to be launched with
     * @param dynamicSMemSize per-block dynamic shared memory usage intended, in bytes
     */
    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveBlocksPerMultiprocessor(@NativeType("int *") IntBuffer numBlocks, @NativeType("CUfunction") long func, int blockSize, @NativeType("size_t") long dynamicSMemSize) {
        if (CHECKS) {
            check(numBlocks, 1);
        }
        return ncuOccupancyMaxActiveBlocksPerMultiprocessor(memAddress(numBlocks), func, blockSize, dynamicSMemSize);
    }

    // --- [ cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags ] ---

    /** Unsafe version of: {@link #cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags OccupancyMaxActiveBlocksPerMultiprocessorWithFlags} */
    public static int ncuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(long numBlocks, long func, int blockSize, long dynamicSMemSize, int flags) {
        long __functionAddress = Functions.OccupancyMaxActiveBlocksPerMultiprocessorWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPI(numBlocks, func, blockSize, dynamicSMemSize, flags, __functionAddress);
    }

    /**
     * Returns occupancy of a function.
     * 
     * <p>Returns in {@code *numBlocks} the number of the maximum active blocks per streaming multiprocessor.</p>
     * 
     * <p>The {@code Flags} parameter controls how special cases are handled. The valid flags are:</p>
     * 
     * <ul>
     * <li>{@link #CU_OCCUPANCY_DEFAULT OCCUPANCY_DEFAULT}, which maintains the default behavior as {@link #cuOccupancyMaxActiveBlocksPerMultiprocessor OccupancyMaxActiveBlocksPerMultiprocessor};</li>
     * <li>{@link #CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE OCCUPANCY_DISABLE_CACHING_OVERRIDE}, which suppresses the default behavior on platform where global caching affects occupancy. On such
     * platforms, if caching is enabled, but per-block SM resource usage would result in zero occupancy, the occupancy calculator will calculate the
     * occupancy as if caching is disabled. Setting {@link #CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE OCCUPANCY_DISABLE_CACHING_OVERRIDE} makes the occupancy calculator to return 0 in such cases. More
     * information can be found about this feature in the "Unified L1/Texture Cache" section of the Maxwell tuning guide.</li>
     * </ul>
     *
     * @param numBlocks       returned occupancy
     * @param func            kernel for which occupancy is calculated
     * @param blockSize       block size the kernel is intended to be launched with
     * @param dynamicSMemSize per-block dynamic shared memory usage intended, in bytes
     * @param flags           requested behavior for the occupancy calculator
     */
    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(@NativeType("int *") IntBuffer numBlocks, @NativeType("CUfunction") long func, int blockSize, @NativeType("size_t") long dynamicSMemSize, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(numBlocks, 1);
        }
        return ncuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(memAddress(numBlocks), func, blockSize, dynamicSMemSize, flags);
    }

    // --- [ cuOccupancyMaxPotentialBlockSize ] ---

    /** Unsafe version of: {@link #cuOccupancyMaxPotentialBlockSize OccupancyMaxPotentialBlockSize} */
    public static int ncuOccupancyMaxPotentialBlockSize(long minGridSize, long blockSize, long func, long blockSizeToDynamicSMemSize, long dynamicSMemSize, int blockSizeLimit) {
        long __functionAddress = Functions.OccupancyMaxPotentialBlockSize;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPPPI(minGridSize, blockSize, func, blockSizeToDynamicSMemSize, dynamicSMemSize, blockSizeLimit, __functionAddress);
    }

    /**
     * Suggest a launch configuration with reasonable occupancy.
     * 
     * <p>Returns in {@code *blockSize} a reasonable block size that can achieve the maximum occupancy (or, the maximum number of active warps with the fewest
     * blocks per multiprocessor), and in {@code *minGridSize} the minimum grid size to achieve the maximum occupancy.</p>
     * 
     * <p>If {@code blockSizeLimit} is 0, the configurator will use the maximum block size permitted by the device / function instead.</p>
     * 
     * <p>If per-block dynamic shared memory allocation is not needed, the user should leave both {@code blockSizeToDynamicSMemSize} and {@code dynamicSMemSize}
     * as 0.</p>
     * 
     * <p>If per-block dynamic shared memory allocation is needed, then if the dynamic shared memory size is constant regardless of block size, the size should
     * be passed through {@code dynamicSMemSize}, and {@code blockSizeToDynamicSMemSize} should be {@code NULL}.</p>
     * 
     * <p>Otherwise, if the per-block dynamic shared memory size varies with different block sizes, the user needs to provide a unary function through {@code
     * blockSizeToDynamicSMemSize} that computes the dynamic shared memory needed by {@code func} for any given block size. {@code dynamicSMemSize} is
     * ignored. An example signature is:</p>
     * 
     * <pre><code>
     * // Take block size, returns dynamic shared memory needed
     * size_t blockToSmem(int blockSize);</code></pre>
     *
     * @param minGridSize                returned minimum grid size needed to achieve the maximum occupancy
     * @param blockSize                  returned maximum block size that can achieve the maximum occupancy
     * @param func                       kernel for which launch configuration is calculated
     * @param blockSizeToDynamicSMemSize a function that calculates how much per-block dynamic shared memory {@code func} uses based on the block size
     * @param dynamicSMemSize            dynamic shared memory usage intended, in bytes
     * @param blockSizeLimit             the maximum block size {@code func} is designed to handle
     */
    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialBlockSize(@NativeType("int *") IntBuffer minGridSize, @NativeType("int *") IntBuffer blockSize, @NativeType("CUfunction") long func, @Nullable @NativeType("size_t (*) (int)") CUoccupancyB2DSizeI blockSizeToDynamicSMemSize, @NativeType("size_t") long dynamicSMemSize, int blockSizeLimit) {
        if (CHECKS) {
            check(minGridSize, 1);
            check(blockSize, 1);
        }
        return ncuOccupancyMaxPotentialBlockSize(memAddress(minGridSize), memAddress(blockSize), func, memAddressSafe(blockSizeToDynamicSMemSize), dynamicSMemSize, blockSizeLimit);
    }

    // --- [ cuOccupancyMaxPotentialBlockSizeWithFlags ] ---

    /** Unsafe version of: {@link #cuOccupancyMaxPotentialBlockSizeWithFlags OccupancyMaxPotentialBlockSizeWithFlags} */
    public static int ncuOccupancyMaxPotentialBlockSizeWithFlags(long minGridSize, long blockSize, long func, long blockSizeToDynamicSMemSize, long dynamicSMemSize, int blockSizeLimit, int flags) {
        long __functionAddress = Functions.OccupancyMaxPotentialBlockSizeWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPPPI(minGridSize, blockSize, func, blockSizeToDynamicSMemSize, dynamicSMemSize, blockSizeLimit, flags, __functionAddress);
    }

    /**
     * Suggest a launch configuration with reasonable occupancy.
     * 
     * <p>An extended version of {@link #cuOccupancyMaxPotentialBlockSize OccupancyMaxPotentialBlockSize}. In addition to arguments passed to {@link #cuOccupancyMaxPotentialBlockSize OccupancyMaxPotentialBlockSize},
     * {@link #cuOccupancyMaxPotentialBlockSizeWithFlags OccupancyMaxPotentialBlockSizeWithFlags} also takes a {@code Flags} parameter.</p>
     * 
     * <p>The {@code Flags} parameter controls how special cases are handled. The valid flags are:</p>
     * 
     * <ul>
     * <li>{@link #CU_OCCUPANCY_DEFAULT OCCUPANCY_DEFAULT}, which maintains the default behavior as {@link #cuOccupancyMaxPotentialBlockSize OccupancyMaxPotentialBlockSize};</li>
     * <li>{@link #CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE OCCUPANCY_DISABLE_CACHING_OVERRIDE}, which suppresses the default behavior on platform where global caching affects occupancy. On such
     * platforms, the launch configurations that produces maximal occupancy might not support global caching. Setting
     * {@link #CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE OCCUPANCY_DISABLE_CACHING_OVERRIDE} guarantees that the the produced launch configuration is global caching compatible at a potential cost of
     * occupancy. More information can be found about this feature in the "Unified L1/Texture Cache" section of the Maxwell tuning guide.</li>
     * </ul>
     *
     * @param minGridSize                returned minimum grid size needed to achieve the maximum occupancy
     * @param blockSize                  returned maximum block size that can achieve the maximum occupancy
     * @param func                       kernel for which launch configuration is calculated
     * @param blockSizeToDynamicSMemSize a function that calculates how much per-block dynamic shared memory {@code func} uses based on the block size
     * @param dynamicSMemSize            dynamic shared memory usage intended, in bytes
     * @param blockSizeLimit             the maximum block size {@code func} is designed to handle
     * @param flags                      options
     */
    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialBlockSizeWithFlags(@NativeType("int *") IntBuffer minGridSize, @NativeType("int *") IntBuffer blockSize, @NativeType("CUfunction") long func, @Nullable @NativeType("size_t (*) (int)") CUoccupancyB2DSizeI blockSizeToDynamicSMemSize, @NativeType("size_t") long dynamicSMemSize, int blockSizeLimit, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(minGridSize, 1);
            check(blockSize, 1);
        }
        return ncuOccupancyMaxPotentialBlockSizeWithFlags(memAddress(minGridSize), memAddress(blockSize), func, memAddressSafe(blockSizeToDynamicSMemSize), dynamicSMemSize, blockSizeLimit, flags);
    }

    // --- [ cuOccupancyAvailableDynamicSMemPerBlock ] ---

    /** Unsafe version of: {@link #cuOccupancyAvailableDynamicSMemPerBlock OccupancyAvailableDynamicSMemPerBlock} */
    public static int ncuOccupancyAvailableDynamicSMemPerBlock(long dynamicSmemSize, long func, int numBlocks, int blockSize) {
        long __functionAddress = Functions.OccupancyAvailableDynamicSMemPerBlock;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPI(dynamicSmemSize, func, numBlocks, blockSize, __functionAddress);
    }

    /**
     * Returns dynamic shared memory available per block when launching {@code numBlocks} blocks on SM.
     * 
     * <p>Returns in {@code *dynamicSmemSize} the maximum size of dynamic shared memory to allow {@code numBlocks} blocks per SM.</p>
     *
     * @param dynamicSmemSize returned maximum dynamic shared memory
     * @param func            kernel function for which occupancy is calculated
     * @param numBlocks       number of blocks to fit on SM
     * @param blockSize       size of the blocks
     */
    @NativeType("CUresult")
    public static int cuOccupancyAvailableDynamicSMemPerBlock(@NativeType("size_t *") PointerBuffer dynamicSmemSize, @NativeType("CUfunction") long func, int numBlocks, int blockSize) {
        if (CHECKS) {
            check(dynamicSmemSize, 1);
        }
        return ncuOccupancyAvailableDynamicSMemPerBlock(memAddress(dynamicSmemSize), func, numBlocks, blockSize);
    }

    // --- [ cuTexRefSetArray ] ---

    /**
     * Binds an array as a texture reference. (Deprecated) 
     * 
     * <p>Binds the CUDA array {@code hArray} to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated with the texture
     * reference is superseded by this function. {@code Flags} must be set to {@link #CU_TRSA_OVERRIDE_FORMAT TRSA_OVERRIDE_FORMAT}. Any CUDA array previously bound to {@code hTexRef} is
     * unbound.</p>
     *
     * @param hTexRef texture reference to bind
     * @param hArray  array to bind
     * @param Flags   options (must be {@link #CU_TRSA_OVERRIDE_FORMAT TRSA_OVERRIDE_FORMAT})
     */
    @NativeType("CUresult")
    public static int cuTexRefSetArray(@NativeType("CUtexref") long hTexRef, @NativeType("CUarray") long hArray, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetArray;
        if (CHECKS) {
            check(hTexRef);
            check(hArray);
        }
        return callPPI(hTexRef, hArray, Flags, __functionAddress);
    }

    // --- [ cuTexRefSetMipmappedArray ] ---

    /**
     * Binds a mipmapped array to a texture reference. (Deprecated) 
     * 
     * <p>Binds the CUDA mipmapped array {@code hMipmappedArray} to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated
     * with the texture reference is superseded by this function. {@code Flags} must be set to {@link #CU_TRSA_OVERRIDE_FORMAT TRSA_OVERRIDE_FORMAT}. Any CUDA array previously bound to
     * {@code hTexRef} is unbound.</p>
     *
     * @param hTexRef         texture reference to bind
     * @param hMipmappedArray mipmapped array to bind
     * @param Flags           options (must be {@link #CU_TRSA_OVERRIDE_FORMAT TRSA_OVERRIDE_FORMAT})
     */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmappedArray(@NativeType("CUtexref") long hTexRef, @NativeType("CUmipmappedArray") long hMipmappedArray, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetMipmappedArray;
        if (CHECKS) {
            check(hTexRef);
            check(hMipmappedArray);
        }
        return callPPI(hTexRef, hMipmappedArray, Flags, __functionAddress);
    }

    // --- [ cuTexRefSetAddress ] ---

    /** Unsafe version of: {@link #cuTexRefSetAddress TexRefSetAddress} */
    public static int ncuTexRefSetAddress(long ByteOffset, long hTexRef, long dptr, long bytes) {
        long __functionAddress = Functions.TexRefSetAddress;
        if (CHECKS) {
            check(hTexRef);
            check(dptr);
        }
        return callPPPPI(ByteOffset, hTexRef, dptr, bytes, __functionAddress);
    }

    /**
     * Binds an address as a texture reference. (Deprecated) 
     * 
     * <p>Binds a linear address range to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated with the texture reference
     * is superseded by this function. Any memory previously bound to {@code hTexRef} is unbound.</p>
     * 
     * <p>Since the hardware enforces an alignment requirement on texture base addresses, {@link #cuTexRefSetAddress TexRefSetAddress} passes back a byte offset in {@code *ByteOffset}
     * that must be applied to texture fetches in order to read from the desired memory. This offset must be divided by the texel size and passed to kernels
     * that read from the texture so they can be applied to the {@code tex1Dfetch()} function.</p>
     * 
     * <p>If the device memory pointer was returned from {@link #cuMemAlloc MemAlloc}, the offset is guaranteed to be 0 and {@code NULL} may be passed as the {@code ByteOffset}
     * parameter.</p>
     * 
     * <p>The total number of elements (or texels) in the linear address range cannot exceed {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH}. The number of
     * elements is computed as ({@code bytes} / {@code bytesPerElement}), where {@code bytesPerElement} is determined from the data format and number of
     * components set using {@link #cuTexRefSetFormat TexRefSetFormat}.</p>
     *
     * @param ByteOffset returned byte offset
     * @param hTexRef    texture reference to bind
     * @param dptr       device pointer to bind
     * @param bytes      size of memory to bind in bytes
     */
    @NativeType("CUresult")
    public static int cuTexRefSetAddress(@NativeType("size_t *") PointerBuffer ByteOffset, @NativeType("CUtexref") long hTexRef, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long bytes) {
        if (CHECKS) {
            check(ByteOffset, 1);
        }
        return ncuTexRefSetAddress(memAddress(ByteOffset), hTexRef, dptr, bytes);
    }

    // --- [ cuTexRefSetAddress2D ] ---

    /** Unsafe version of: {@link #cuTexRefSetAddress2D TexRefSetAddress2D} */
    public static int ncuTexRefSetAddress2D(long hTexRef, long desc, long dptr, long Pitch) {
        long __functionAddress = Functions.TexRefSetAddress2D;
        if (CHECKS) {
            check(hTexRef);
            check(dptr);
        }
        return callPPPPI(hTexRef, desc, dptr, Pitch, __functionAddress);
    }

    /**
     * Binds an address as a 2D texture reference. (Deprecated)
     * 
     * <p>Binds a linear address range to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated with the texture reference
     * is superseded by this function. Any memory previously bound to {@code hTexRef} is unbound.</p>
     * 
     * <p>Using a {@code tex2D()} function inside a kernel requires a call to either {@link #cuTexRefSetArray TexRefSetArray} to bind the corresponding texture reference to an array,
     * or {@link #cuTexRefSetAddress2D TexRefSetAddress2D} to bind the texture reference to linear memory.</p>
     * 
     * <p>Function calls to {@link #cuTexRefSetFormat TexRefSetFormat} cannot follow calls to {@link #cuTexRefSetAddress2D TexRefSetAddress2D} for the same texture reference.</p>
     * 
     * <p>It is required that {@code dptr} be aligned to the appropriate hardware-specific texture alignment. You can query this value using the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT}. If an unaligned {@code dptr} is supplied, {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>{@code Pitch} has to be aligned to the hardware-specific texture pitch alignment. This value can be queried using the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT}. If an unaligned {@code Pitch} is supplied, {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     * 
     * <p>{@code Width} and {@code Height}, which are specified in elements (or texels), cannot exceed {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH} and
     * {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT} respectively. {@code Pitch}, which is specified in bytes, cannot exceed
     * {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH}.</p>
     *
     * @param hTexRef texture reference to bind
     * @param desc    descriptor of CUDA array
     * @param dptr    device pointer to bind
     * @param Pitch   line pitch in bytes
     */
    @NativeType("CUresult")
    public static int cuTexRefSetAddress2D(@NativeType("CUtexref") long hTexRef, @NativeType("CUDA_ARRAY_DESCRIPTOR const *") CUDA_ARRAY_DESCRIPTOR desc, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long Pitch) {
        return ncuTexRefSetAddress2D(hTexRef, desc.address(), dptr, Pitch);
    }

    // --- [ cuTexRefSetFormat ] ---

    /**
     * Sets the format for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the format of the data to be read by the texture reference {@code hTexRef}. {@code fmt} and {@code NumPackedComponents} are exactly analogous
     * to the {@code Format} and {@code NumChannels} members of the {@link CUDA_ARRAY_DESCRIPTOR} structure: They specify the format of each component and the
     * number of components per array element.</p>
     *
     * @param hTexRef             texture reference
     * @param fmt                 format to set
     * @param NumPackedComponents number of components per array element
     */
    @NativeType("CUresult")
    public static int cuTexRefSetFormat(@NativeType("CUtexref") long hTexRef, @NativeType("CUarray_format") int fmt, int NumPackedComponents) {
        long __functionAddress = Functions.TexRefSetFormat;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fmt, NumPackedComponents, __functionAddress);
    }

    // --- [ cuTexRefSetAddressMode ] ---

    /**
     * Sets the addressing mode for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the addressing mode {@code am} for the given dimension {@code dim} of the texture reference {@code hTexRef}. If {@code dim} is zero, the
     * addressing mode is applied to the first parameter of the functions used to fetch from the texture; if {@code dim} is 1, the second, and so on.</p>
     * 
     * <p>Note that this call has no effect if {@code hTexRef} is bound to linear memory. Also, if the flag, {@link #CU_TRSF_NORMALIZED_COORDINATES TRSF_NORMALIZED_COORDINATES}, is not set, the
     * only supported address mode is {@link #CU_TR_ADDRESS_MODE_CLAMP TR_ADDRESS_MODE_CLAMP}.</p>
     *
     * @param hTexRef texture reference
     * @param dim     dimension
     * @param am      addressing mode to set
     */
    @NativeType("CUresult")
    public static int cuTexRefSetAddressMode(@NativeType("CUtexref") long hTexRef, int dim, @NativeType("CUaddress_mode") int am) {
        long __functionAddress = Functions.TexRefSetAddressMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, dim, am, __functionAddress);
    }

    // --- [ cuTexRefSetFilterMode ] ---

    /**
     * Sets the filtering mode for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the filtering mode {@code fm} to be used when reading memory through the texture reference {@code hTexRef}.</p>
     * 
     * <p>Note that this call has no effect if {@code hTexRef} is bound to linear memory.</p>
     *
     * @param hTexRef texture reference
     * @param fm      filtering mode to set
     */
    @NativeType("CUresult")
    public static int cuTexRefSetFilterMode(@NativeType("CUtexref") long hTexRef, @NativeType("CUfilter_mode") int fm) {
        long __functionAddress = Functions.TexRefSetFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fm, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapFilterMode ] ---

    /**
     * Sets the mipmap filtering mode for a texture reference (Deprecated) 
     * 
     * <p>Specifies the mipmap filtering mode {@code fm} to be used when reading memory through the texture reference {@code hTexRef}.</p>
     * 
     * <p>Note that this call has no effect if {@code hTexRef} is not bound to a mipmapped array.</p>
     *
     * @param hTexRef texture reference
     * @param fm      filtering mode to set
     */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmapFilterMode(@NativeType("CUtexref") long hTexRef, @NativeType("CUfilter_mode") int fm) {
        long __functionAddress = Functions.TexRefSetMipmapFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fm, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapLevelBias ] ---

    /**
     * Sets the mipmap level bias for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the mipmap level bias {@code bias} to be added to the specified mipmap level when reading memory through the texture reference
     * {@code hTexRef}.</p>
     * 
     * <p>Note that this call has no effect if {@code hTexRef} is not bound to a mipmapped array.</p>
     *
     * @param hTexRef texture reference
     * @param bias    mipmap level bias
     */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmapLevelBias(@NativeType("CUtexref") long hTexRef, float bias) {
        long __functionAddress = Functions.TexRefSetMipmapLevelBias;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, bias, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapLevelClamp ] ---

    /**
     * Sets the mipmap min/max mipmap level clamps for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the min/max mipmap level clamps, {@code minMipmapLevelClamp} and {@code maxMipmapLevelClamp} respectively, to be used when reading memory
     * through the texture reference {@code hTexRef}.</p>
     * 
     * <p>Note that this call has no effect if {@code hTexRef} is not bound to a mipmapped array.</p>
     *
     * @param hTexRef             texture reference
     * @param minMipmapLevelClamp mipmap min level clamp
     * @param maxMipmapLevelClamp mipmap max level clamp
     */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmapLevelClamp(@NativeType("CUtexref") long hTexRef, float minMipmapLevelClamp, float maxMipmapLevelClamp) {
        long __functionAddress = Functions.TexRefSetMipmapLevelClamp;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, minMipmapLevelClamp, maxMipmapLevelClamp, __functionAddress);
    }

    // --- [ cuTexRefSetMaxAnisotropy ] ---

    /**
     * Sets the maximum anisotropy for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the maximum anisotropy {@code maxAniso} to be used when reading memory through the texture reference {@code hTexRef}.</p>
     * 
     * <p>Note that this call has no effect if {@code hTexRef} is bound to linear memory.</p>
     *
     * @param hTexRef  texture reference
     * @param maxAniso maximum anisotropy
     */
    @NativeType("CUresult")
    public static int cuTexRefSetMaxAnisotropy(@NativeType("CUtexref") long hTexRef, @NativeType("unsigned int") int maxAniso) {
        long __functionAddress = Functions.TexRefSetMaxAnisotropy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, maxAniso, __functionAddress);
    }

    // --- [ cuTexRefSetBorderColor ] ---

    /** Unsafe version of: {@link #cuTexRefSetBorderColor TexRefSetBorderColor} */
    public static int ncuTexRefSetBorderColor(long hTexRef, long pBorderColor) {
        long __functionAddress = Functions.TexRefSetBorderColor;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(hTexRef, pBorderColor, __functionAddress);
    }

    /**
     * Sets the border color for a texture reference. (Deprecated) 
     * 
     * <p>Specifies the value of the RGBA color via the {@code pBorderColor} to the texture reference {@code hTexRef}. The color value supports only float type
     * and holds color components in the following sequence: {@code pBorderColor[0]} holds 'R' component {@code pBorderColor[1]} holds 'G' component
     * {@code pBorderColor[2]} holds 'B' component {@code pBorderColor[3]} holds 'A' component.</p>
     * 
     * <p>Note that the color values can be set only when the Address mode is set to {@link #CU_TR_ADDRESS_MODE_BORDER TR_ADDRESS_MODE_BORDER} using {@link #cuTexRefSetAddressMode TexRefSetAddressMode}. Applications using
     * integer border color values have to "reinterpret_cast" their values to float.</p>
     *
     * @param hTexRef      texture reference
     * @param pBorderColor RGBA color
     */
    @NativeType("CUresult")
    public static int cuTexRefSetBorderColor(@NativeType("CUtexref") long hTexRef, @NativeType("float *") FloatBuffer pBorderColor) {
        if (CHECKS) {
            check(pBorderColor, 4);
        }
        return ncuTexRefSetBorderColor(hTexRef, memAddress(pBorderColor));
    }

    // --- [ cuTexRefSetFlags ] ---

    /**
     * Sets the flags for a texture reference. (Deprecated) 
     * 
     * <p>Specifies optional flags via {@code Flags} to specify the behavior of data returned through the texture reference {@code hTexRef}. The valid flags are:</p>
     * 
     * <ul>
     * <li>{@link #CU_TRSF_READ_AS_INTEGER TRSF_READ_AS_INTEGER}, which suppresses the default behavior of having the texture promote integer data to floating point data in the range [0,
     * 1]. Note that texture with 32-bit integer format would not be promoted, regardless of whether or not this flag is specified;</li>
     * <li>{@link #CU_TRSF_NORMALIZED_COORDINATES TRSF_NORMALIZED_COORDINATES}, which suppresses the default behavior of having the texture coordinates range from [0, Dim) where Dim is the
     * width or height of the CUDA array. Instead, the texture coordinates [0, 1.0) reference the entire breadth of the array dimension;</li>
     * <li>{@link #CU_TRSF_DISABLE_TRILINEAR_OPTIMIZATION TRSF_DISABLE_TRILINEAR_OPTIMIZATION}, which disables any trilinear filtering optimizations. Trilinear optimizations improve texture filtering
     * performance by allowing bilinear filtering on textures in scenarios where it can closely approximate the expected results.</li>
     * </ul>
     *
     * @param hTexRef texture reference
     * @param Flags   optional flags to set
     */
    @NativeType("CUresult")
    public static int cuTexRefSetFlags(@NativeType("CUtexref") long hTexRef, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetFlags;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, Flags, __functionAddress);
    }

    // --- [ cuTexRefGetAddress ] ---

    /** Unsafe version of: {@link #cuTexRefGetAddress TexRefGetAddress} */
    public static int ncuTexRefGetAddress(long pdptr, long hTexRef) {
        long __functionAddress = Functions.TexRefGetAddress;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pdptr, hTexRef, __functionAddress);
    }

    /**
     * Gets the address associated with a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *pdptr} the base address bound to the texture reference {@code hTexRef}, or returns {@link #CUDA_ERROR_INVALID_VALUE} if the texture
     * reference is not bound to any device memory range.</p>
     *
     * @param pdptr   returned device address
     * @param hTexRef texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetAddress(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuTexRefGetAddress(memAddress(pdptr), hTexRef);
    }

    // --- [ cuTexRefGetArray ] ---

    /** Unsafe version of: {@link #cuTexRefGetArray TexRefGetArray} */
    public static int ncuTexRefGetArray(long phArray, long hTexRef) {
        long __functionAddress = Functions.TexRefGetArray;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(phArray, hTexRef, __functionAddress);
    }

    /**
     * Gets the array bound to a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *phArray} the CUDA array bound to the texture reference {@code hTexRef}, or returns {@link #CUDA_ERROR_INVALID_VALUE} if the texture
     * reference is not bound to any CUDA array.</p>
     *
     * @param phArray returned array
     * @param hTexRef texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetArray(@NativeType("CUarray *") PointerBuffer phArray, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(phArray, 1);
        }
        return ncuTexRefGetArray(memAddress(phArray), hTexRef);
    }

    // --- [ cuTexRefGetMipmappedArray ] ---

    /** Unsafe version of: {@link #cuTexRefGetMipmappedArray TexRefGetMipmappedArray} */
    public static int ncuTexRefGetMipmappedArray(long phMipmappedArray, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmappedArray;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(phMipmappedArray, hTexRef, __functionAddress);
    }

    /**
     * Gets the mipmapped array bound to a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *phMipmappedArray} the CUDA mipmapped array bound to the texture reference {@code hTexRef}, or returns {@link #CUDA_ERROR_INVALID_VALUE} if
     * the texture reference is not bound to any CUDA mipmapped array.</p>
     *
     * @param phMipmappedArray returned mipmapped array
     * @param hTexRef          texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer phMipmappedArray, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(phMipmappedArray, 1);
        }
        return ncuTexRefGetMipmappedArray(memAddress(phMipmappedArray), hTexRef);
    }

    // --- [ cuTexRefGetAddressMode ] ---

    /** Unsafe version of: {@link #cuTexRefGetAddressMode TexRefGetAddressMode} */
    public static int ncuTexRefGetAddressMode(long pam, long hTexRef, int dim) {
        long __functionAddress = Functions.TexRefGetAddressMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pam, hTexRef, dim, __functionAddress);
    }

    /**
     * Gets the addressing mode used by a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *pam} the addressing mode corresponding to the dimension {@code dim} of the texture reference {@code hTexRef}. Currently, the only
     * valid value for {@code dim} are 0 and 1.</p>
     *
     * @param pam     returned addressing mode
     * @param hTexRef texture reference
     * @param dim     dimension
     */
    @NativeType("CUresult")
    public static int cuTexRefGetAddressMode(@NativeType("CUaddress_mode *") IntBuffer pam, @NativeType("CUtexref") long hTexRef, int dim) {
        if (CHECKS) {
            check(pam, 1);
        }
        return ncuTexRefGetAddressMode(memAddress(pam), hTexRef, dim);
    }

    // --- [ cuTexRefGetFilterMode ] ---

    /** Unsafe version of: {@link #cuTexRefGetFilterMode TexRefGetFilterMode} */
    public static int ncuTexRefGetFilterMode(long pfm, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pfm, hTexRef, __functionAddress);
    }

    /**
     * Gets the filter-mode used by a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *pfm} the filtering mode of the texture reference {@code hTexRef}.</p>
     *
     * @param pfm     returned filtering mode
     * @param hTexRef texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetFilterMode(@NativeType("CUfilter_mode *") IntBuffer pfm, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pfm, 1);
        }
        return ncuTexRefGetFilterMode(memAddress(pfm), hTexRef);
    }

    // --- [ cuTexRefGetFormat ] ---

    /** Unsafe version of: {@link #cuTexRefGetFormat TexRefGetFormat} */
    public static int ncuTexRefGetFormat(long pFormat, long pNumChannels, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFormat;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPPI(pFormat, pNumChannels, hTexRef, __functionAddress);
    }

    /**
     * Gets the format used by a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *pFormat} and {@code *pNumChannels} the format and number of components of the CUDA array bound to the texture reference
     * {@code hTexRef}. If {@code pFormat} or {@code pNumChannels} is {@code NULL}, it will be ignored.</p>
     *
     * @param pFormat      returned format
     * @param pNumChannels returned number of components
     * @param hTexRef      texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetFormat(@NativeType("CUarray_format *") IntBuffer pFormat, @Nullable @NativeType("int *") IntBuffer pNumChannels, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pFormat, 1);
            checkSafe(pNumChannels, 1);
        }
        return ncuTexRefGetFormat(memAddress(pFormat), memAddressSafe(pNumChannels), hTexRef);
    }

    // --- [ cuTexRefGetMipmapFilterMode ] ---

    /** Unsafe version of: {@link #cuTexRefGetMipmapFilterMode TexRefGetMipmapFilterMode} */
    public static int ncuTexRefGetMipmapFilterMode(long pfm, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pfm, hTexRef, __functionAddress);
    }

    /**
     * Gets the mipmap filtering mode for a texture reference. (Deprecated) 
     * 
     * <p>Returns the mipmap filtering mode in {@code pfm} that's used when reading memory through the texture reference {@code hTexRef}.</p>
     *
     * @param pfm     returned mipmap filtering mode
     * @param hTexRef texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmapFilterMode(@NativeType("CUfilter_mode *") IntBuffer pfm, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pfm, 1);
        }
        return ncuTexRefGetMipmapFilterMode(memAddress(pfm), hTexRef);
    }

    // --- [ cuTexRefGetMipmapLevelBias ] ---

    /** Unsafe version of: {@link #cuTexRefGetMipmapLevelBias TexRefGetMipmapLevelBias} */
    public static int ncuTexRefGetMipmapLevelBias(long pbias, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapLevelBias;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pbias, hTexRef, __functionAddress);
    }

    /**
     * Gets the mipmap level bias for a texture reference. (Deprecated) 
     * 
     * <p>Returns the mipmap level bias in {@code pBias} that's added to the specified mipmap level when reading memory through the texture reference {@code
     * hTexRef}.</p>
     *
     * @param pbias   returned mipmap level bias
     * @param hTexRef texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmapLevelBias(@NativeType("float *") FloatBuffer pbias, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pbias, 1);
        }
        return ncuTexRefGetMipmapLevelBias(memAddress(pbias), hTexRef);
    }

    // --- [ cuTexRefGetMipmapLevelClamp ] ---

    /** Unsafe version of: {@link #cuTexRefGetMipmapLevelClamp TexRefGetMipmapLevelClamp} */
    public static int ncuTexRefGetMipmapLevelClamp(long pminMipmapLevelClamp, long pmaxMipmapLevelClamp, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapLevelClamp;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPPI(pminMipmapLevelClamp, pmaxMipmapLevelClamp, hTexRef, __functionAddress);
    }

    /**
     * Gets the min/max mipmap level clamps for a texture reference. (Deprecated) 
     * 
     * <p>Returns the min/max mipmap level clamps in {@code pminMipmapLevelClamp} and {@code pmaxMipmapLevelClamp} that's used when reading memory through the
     * texture reference {@code hTexRef}.</p>
     *
     * @param pminMipmapLevelClamp returned mipmap min level clamp
     * @param pmaxMipmapLevelClamp returned mipmap max level clamp
     * @param hTexRef              texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmapLevelClamp(@NativeType("float *") FloatBuffer pminMipmapLevelClamp, @NativeType("float *") FloatBuffer pmaxMipmapLevelClamp, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pminMipmapLevelClamp, 1);
            check(pmaxMipmapLevelClamp, 1);
        }
        return ncuTexRefGetMipmapLevelClamp(memAddress(pminMipmapLevelClamp), memAddress(pmaxMipmapLevelClamp), hTexRef);
    }

    // --- [ cuTexRefGetMaxAnisotropy ] ---

    /** Unsafe version of: {@link #cuTexRefGetMaxAnisotropy TexRefGetMaxAnisotropy} */
    public static int ncuTexRefGetMaxAnisotropy(long pmaxAniso, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMaxAnisotropy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pmaxAniso, hTexRef, __functionAddress);
    }

    /**
     * Gets the maximum anisotropy for a texture reference. (Deprecated) 
     * 
     * <p>Returns the maximum anisotropy in {@code pmaxAniso} that's used when reading memory through the texture reference {@code hTexRef}.</p>
     *
     * @param pmaxAniso returned maximum anisotropy
     * @param hTexRef   texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetMaxAnisotropy(@NativeType("int *") IntBuffer pmaxAniso, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pmaxAniso, 1);
        }
        return ncuTexRefGetMaxAnisotropy(memAddress(pmaxAniso), hTexRef);
    }

    // --- [ cuTexRefGetBorderColor ] ---

    /** Unsafe version of: {@link #cuTexRefGetBorderColor TexRefGetBorderColor} */
    public static int ncuTexRefGetBorderColor(long pBorderColor, long hTexRef) {
        long __functionAddress = Functions.TexRefGetBorderColor;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pBorderColor, hTexRef, __functionAddress);
    }

    /**
     * Gets the border color used by a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code pBorderColor}, values of the RGBA color used by the texture reference {@code hTexRef}. The color value is of type float and holds
     * color components in the following sequence: pBorderColor[0] holds 'R' component pBorderColor[1] holds 'G' component pBorderColor[2] holds 'B' component
     * pBorderColor[3] holds 'A' component</p>
     *
     * @param pBorderColor returned Type and Value of RGBA color
     * @param hTexRef      texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetBorderColor(@NativeType("float *") FloatBuffer pBorderColor, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pBorderColor, 4);
        }
        return ncuTexRefGetBorderColor(memAddress(pBorderColor), hTexRef);
    }

    // --- [ cuTexRefGetFlags ] ---

    /** Unsafe version of: {@link #cuTexRefGetFlags TexRefGetFlags} */
    public static int ncuTexRefGetFlags(long pFlags, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFlags;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pFlags, hTexRef, __functionAddress);
    }

    /**
     * Gets the flags used by a texture reference. (Deprecated) 
     * 
     * <p>Returns in {@code *pFlags} the flags of the texture reference {@code hTexRef}.</p>
     *
     * @param pFlags  returned flags
     * @param hTexRef texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefGetFlags(@NativeType("unsigned int *") IntBuffer pFlags, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return ncuTexRefGetFlags(memAddress(pFlags), hTexRef);
    }

    // --- [ cuTexRefCreate ] ---

    /** Unsafe version of: {@link #cuTexRefCreate TexRefCreate} */
    public static int ncuTexRefCreate(long pTexRef) {
        long __functionAddress = Functions.TexRefCreate;
        return callPI(pTexRef, __functionAddress);
    }

    /**
     * Creates a texture reference. (Deprecated) 
     * 
     * <p>Creates a texture reference and returns its handle in {@code *pTexRef}. Once created, the application must call {@link #cuTexRefSetArray TexRefSetArray} or
     * {@link #cuTexRefSetAddress TexRefSetAddress} to associate the reference with allocated memory. Other texture reference functions are used to specify the format and
     * interpretation (addressing, filtering, etc.) to be used when the memory is read through this texture reference.</p>
     *
     * @param pTexRef returned texture reference
     */
    @NativeType("CUresult")
    public static int cuTexRefCreate(@NativeType("CUtexref *") PointerBuffer pTexRef) {
        if (CHECKS) {
            check(pTexRef, 1);
        }
        return ncuTexRefCreate(memAddress(pTexRef));
    }

    // --- [ cuTexRefDestroy ] ---

    /**
     * Destroys a texture reference. (Deprecated) 
     * 
     * <p>Destroys the texture reference specified by {@code hTexRef}.</p>
     *
     * @param hTexRef texture reference to destroy
     */
    @NativeType("CUresult")
    public static int cuTexRefDestroy(@NativeType("CUtexref") long hTexRef) {
        long __functionAddress = Functions.TexRefDestroy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, __functionAddress);
    }

    // --- [ cuSurfRefSetArray ] ---

    /**
     * Sets the CUDA array for a surface reference.Deprecated: 
     * 
     * <p>Sets the CUDA array {@code hArray} to be read and written by the surface reference {@code hSurfRef}. Any previous CUDA array state associated with the
     * surface reference is superseded by this function. {@code Flags} must be set to 0. The {@link #CUDA_ARRAY3D_SURFACE_LDST} flag must have been set for the CUDA
     * array. Any CUDA array previously bound to {@code hSurfRef} is unbound.</p>
     *
     * @param hSurfRef surface reference handle
     * @param hArray   CUDA array handle
     * @param Flags    set to 0
     */
    @NativeType("CUresult")
    public static int cuSurfRefSetArray(@NativeType("CUsurfref") long hSurfRef, @NativeType("CUarray") long hArray, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.SurfRefSetArray;
        if (CHECKS) {
            check(hSurfRef);
            check(hArray);
        }
        return callPPI(hSurfRef, hArray, Flags, __functionAddress);
    }

    // --- [ cuSurfRefGetArray ] ---

    /** Unsafe version of: {@link #cuSurfRefGetArray SurfRefGetArray} */
    public static int ncuSurfRefGetArray(long phArray, long hSurfRef) {
        long __functionAddress = Functions.SurfRefGetArray;
        if (CHECKS) {
            check(hSurfRef);
        }
        return callPPI(phArray, hSurfRef, __functionAddress);
    }

    /**
     * Passes back the CUDA array bound to a surface reference. (Deprecated) 
     * 
     * <p>Returns in {@code *phArray} the CUDA array bound to the surface reference {@code hSurfRef}, or returns {@link #CUDA_ERROR_INVALID_VALUE} if the surface
     * reference is not bound to any CUDA array.</p>
     *
     * @param phArray  surface reference handle
     * @param hSurfRef surface reference handle
     */
    @NativeType("CUresult")
    public static int cuSurfRefGetArray(@NativeType("CUarray *") PointerBuffer phArray, @NativeType("CUsurfref") long hSurfRef) {
        if (CHECKS) {
            check(phArray, 1);
        }
        return ncuSurfRefGetArray(memAddress(phArray), hSurfRef);
    }

    // --- [ cuTexObjectCreate ] ---

    /** Unsafe version of: {@link #cuTexObjectCreate TexObjectCreate} */
    public static int ncuTexObjectCreate(long pTexObject, long pResDesc, long pTexDesc, long pResViewDesc) {
        long __functionAddress = Functions.TexObjectCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(pTexObject, pResDesc, pTexDesc, pResViewDesc, __functionAddress);
    }

    /**
     * Creates a texture object.
     * 
     * <p>Creates a texture object and returns it in {@code pTexObject}. {@code pResDesc} describes the data to texture from. {@code pTexDesc} describes how the
     * data should be sampled. {@code pResViewDesc} is an optional argument that specifies an alternate format for the data described by {@code pResDesc}, and
     * also describes the subresource region to restrict access to when texturing. {@code pResViewDesc} can only be specified if the type of resource is a
     * CUDA array or a CUDA mipmapped array.</p>
     * 
     * <p>Texture objects are only supported on devices of compute capability 3.0 or higher. Additionally, a texture object is an opaque value, and, as such,
     * should only be accessed through CUDA API calls.</p>
     * 
     * <ul>
     * <li>If {@code CUDA_RESOURCE_DESC::resType} is set to {@link #CU_RESOURCE_TYPE_ARRAY RESOURCE_TYPE_ARRAY}, {@code CUDA_RESOURCE_DESC::res::array::hArray} must be set to a valid CUDA
     * array handle.</li>
     * <li>If {@code CUDA_RESOURCE_DESC::resType} is set to {@link #CU_RESOURCE_TYPE_MIPMAPPED_ARRAY RESOURCE_TYPE_MIPMAPPED_ARRAY}, {@code CUDA_RESOURCE_DESC::res::mipmap::hMipmappedArray} must be
     * set to a valid CUDA mipmapped array handle.</li>
     * <li>If {@code CUDA_RESOURCE_DESC::resType} is set to {@link #CU_RESOURCE_TYPE_LINEAR RESOURCE_TYPE_LINEAR}, {@code CUDA_RESOURCE_DESC::res::linear::devPtr} must be set to a valid
     * device pointer, that is aligned to {@link #CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT}. {@code CUDA_RESOURCE_DESC::res::linear::format} and
     * {@code CUDA_RESOURCE_DESC::res::linear::numChannels} describe the format of each component and the number of components per array element.
     * {@code CUDA_RESOURCE_DESC::res::linear::sizeInBytes} specifies the size of the array in bytes. The total number of elements in the linear address
     * range cannot exceed {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH}. The number of elements is computed as
     * {@code (sizeInBytes / (sizeof(format) * numChannels)).}</li>
     * <li>If {@code CUDA_RESOURCE_DESC::resType} is set to {@link #CU_RESOURCE_TYPE_PITCH2D RESOURCE_TYPE_PITCH2D}, {@code CUDA_RESOURCE_DESC::res::pitch2D::devPtr} must be set to a valid
     * device pointer, that is aligned to {@link #CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT}. {@code CUDA_RESOURCE_DESC::res::pitch2D::format} and
     * {@code CUDA_RESOURCE_DESC::res::pitch2D::numChannels} describe the format of each component and the number of components per array element.
     * {@code CUDA_RESOURCE_DESC::res::pitch2D::width} and {@code CUDA_RESOURCE_DESC::res::pitch2D::height} specify the width and height of the array in
     * elements, and cannot exceed {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH} and {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT} respectively.
     * {@code CUDA_RESOURCE_DESC::res::pitch2D::pitchInBytes} specifies the pitch between two rows in bytes and has to be aligned to
     * {@link #CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT}. Pitch cannot exceed {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH}.</li>
     * <li>{@code flags} must be set to zero.</li>
     * </ul>
     * 
     * <ul>
     * <li>{@code CUDA_TEXTURE_DESC::addressMode} specifies the addressing mode for each dimension of the texture data. This is ignored if
     * {@code CUDA_RESOURCE_DESC::resType} is {@link #CU_RESOURCE_TYPE_LINEAR RESOURCE_TYPE_LINEAR}. Also, if the flag, {@link #CU_TRSF_NORMALIZED_COORDINATES TRSF_NORMALIZED_COORDINATES} is not set, the only supported
     * address mode is {@link #CU_TR_ADDRESS_MODE_CLAMP TR_ADDRESS_MODE_CLAMP}.</li>
     * <li>{@code CUDA_TEXTURE_DESC::filterMode} specifies the filtering mode to be used when fetching from the texture. This is ignored if
     * {@code CUDA_RESOURCE_DESC::resType} is {@link #CU_RESOURCE_TYPE_LINEAR RESOURCE_TYPE_LINEAR}.</li>
     * <li>{@code CUDA_TEXTURE_DESC::flags} can be any combination of the following:
     * 
     * <ul>
     * <li>{@link #CU_TRSF_READ_AS_INTEGER TRSF_READ_AS_INTEGER}, which suppresses the default behavior of having the texture promote integer data to floating point data in the range [0,
     * 1]. Note that texture with 32-bit integer format would not be promoted, regardless of whether or not this flag is specified.</li>
     * <li>{@link #CU_TRSF_NORMALIZED_COORDINATES TRSF_NORMALIZED_COORDINATES}, which suppresses the default behavior of having the texture coordinates range from [0, Dim) where Dim is the
     * width or height of the CUDA array. Instead, the texture coordinates [0, 1.0) reference the entire breadth of the array dimension; Note that for
     * CUDA mipmapped arrays, this flag has to be set.</li>
     * <li>{@link #CU_TRSF_DISABLE_TRILINEAR_OPTIMIZATION TRSF_DISABLE_TRILINEAR_OPTIMIZATION}, which disables any trilinear filtering optimizations. Trilinear optimizations improve texture filtering
     * performance by allowing bilinear filtering on textures in scenarios where it can closely approximate the expected results.</li>
     * </ul></li>
     * <li>{@code CUDA_TEXTURE_DESC::maxAnisotropy} specifies the maximum anisotropy ratio to be used when doing anisotropic filtering. This value will be
     * clamped to the range [1,16].</li>
     * <li>{@code CUDA_TEXTURE_DESC::mipmapFilterMode} specifies the filter mode when the calculated mipmap level lies between two defined mipmap levels.</li>
     * <li>{@code CUDA_TEXTURE_DESC::mipmapLevelBias} specifies the offset to be applied to the calculated mipmap level.</li>
     * <li>{@code CUDA_TEXTURE_DESC::minMipmapLevelClamp} specifies the lower end of the mipmap level range to clamp access to.</li>
     * <li>{@code CUDA_TEXTURE_DESC::maxMipmapLevelClamp} specifies the upper end of the mipmap level range to clamp access to.</li>
     * </ul>
     * 
     * <ul>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::format} specifies how the data contained in the CUDA array or CUDA mipmapped array should be interpreted. Note that
     * this can incur a change in size of the texture data. If the resource view format is a block compressed format, then the underlying CUDA array or
     * CUDA mipmapped array has to have a base of format {@link #CU_AD_FORMAT_UNSIGNED_INT32 AD_FORMAT_UNSIGNED_INT32}. with 2 or 4 channels, depending on the block compressed format. For
     * ex., BC1 and BC4 require the underlying CUDA array to have a format of {@link #CU_AD_FORMAT_UNSIGNED_INT32 AD_FORMAT_UNSIGNED_INT32} with 2 channels. The other BC formats require
     * the underlying resource to have the same base format but with 4 channels.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::width} specifies the new width of the texture data. If the resource view format is a block compressed format, this
     * value has to be 4 times the original width of the resource. For non block compressed formats, this value has to be equal to that of the original
     * resource.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::height} specifies the new height of the texture data. If the resource view format is a block compressed format,
     * this value has to be 4 times the original height of the resource. For non block compressed formats, this value has to be equal to that of the
     * original resource.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::depth} specifies the new depth of the texture data. This value has to be equal to that of the original resource.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::firstMipmapLevel} specifies the most detailed mipmap level. This will be the new mipmap level zero. For
     * non-mipmapped resources, this value has to be zero. {@code CUDA_TEXTURE_DESC::minMipmapLevelClamp} and
     * {@code CUDA_TEXTURE_DESC::maxMipmapLevelClamp} will be relative to this value. For ex., if the {@code firstMipmapLevel} is set to 2, and a
     * {@code minMipmapLevelClamp} of 1.2 is specified, then the actual minimum mipmap level clamp will be 3.2.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::lastMipmapLevel} specifies the least detailed mipmap level. For non-mipmapped resources, this value has to be zero.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::firstLayer} specifies the first layer index for layered textures. This will be the new layer zero. For non-layered
     * resources, this value has to be zero.</li>
     * <li>{@code CUDA_RESOURCE_VIEW_DESC::lastLayer} specifies the last layer index for layered textures. For non-layered resources, this value has to be
     * zero.</li>
     * </ul>
     *
     * @param pTexObject   texture object to create
     * @param pResDesc     resource descriptor
     * @param pTexDesc     texture descriptor
     * @param pResViewDesc resource view descriptor
     */
    @NativeType("CUresult")
    public static int cuTexObjectCreate(@NativeType("CUtexObject *") LongBuffer pTexObject, @NativeType("CUDA_RESOURCE_DESC const *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUDA_TEXTURE_DESC const *") CUDA_TEXTURE_DESC pTexDesc, @NativeType("CUDA_RESOURCE_VIEW_DESC const *") CUDA_RESOURCE_VIEW_DESC pResViewDesc) {
        if (CHECKS) {
            check(pTexObject, 1);
        }
        return ncuTexObjectCreate(memAddress(pTexObject), pResDesc.address(), pTexDesc.address(), pResViewDesc.address());
    }

    // --- [ cuTexObjectDestroy ] ---

    /**
     * Destroys a texture object.
     * 
     * <p>Destroys the texture object specified by {@code texObject}.</p>
     *
     * @param texObject texture object to destroy
     */
    @NativeType("CUresult")
    public static int cuTexObjectDestroy(@NativeType("CUtexObject") long texObject) {
        long __functionAddress = Functions.TexObjectDestroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(texObject, __functionAddress);
    }

    // --- [ cuTexObjectGetResourceDesc ] ---

    /** Unsafe version of: {@link #cuTexObjectGetResourceDesc TexObjectGetResourceDesc} */
    public static int ncuTexObjectGetResourceDesc(long pResDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetResourceDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pResDesc, texObject, __functionAddress);
    }

    /**
     * Returns a texture object's resource descriptor.
     * 
     * <p>Returns the resource descriptor for the texture object specified by {@code texObject}.</p>
     *
     * @param pResDesc  resource descriptor
     * @param texObject texture object
     */
    @NativeType("CUresult")
    public static int cuTexObjectGetResourceDesc(@NativeType("CUDA_RESOURCE_DESC *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetResourceDesc(pResDesc.address(), texObject);
    }

    // --- [ cuTexObjectGetTextureDesc ] ---

    /** Unsafe version of: {@link #cuTexObjectGetTextureDesc TexObjectGetTextureDesc} */
    public static int ncuTexObjectGetTextureDesc(long pTexDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetTextureDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pTexDesc, texObject, __functionAddress);
    }

    /**
     * Returns a texture object's texture descriptor.
     * 
     * <p>Returns the texture descriptor for the texture object specified by {@code texObject}.</p>
     *
     * @param pTexDesc  texture descriptor
     * @param texObject texture object
     */
    @NativeType("CUresult")
    public static int cuTexObjectGetTextureDesc(@NativeType("CUDA_TEXTURE_DESC *") CUDA_TEXTURE_DESC pTexDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetTextureDesc(pTexDesc.address(), texObject);
    }

    // --- [ cuTexObjectGetResourceViewDesc ] ---

    /** Unsafe version of: {@link #cuTexObjectGetResourceViewDesc TexObjectGetResourceViewDesc} */
    public static int ncuTexObjectGetResourceViewDesc(long pResViewDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetResourceViewDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pResViewDesc, texObject, __functionAddress);
    }

    /**
     * Returns a texture object's resource view descriptor.
     * 
     * <p>Returns the resource view descriptor for the texture object specified by {@code texObject}. If no resource view was set for {@code texObject}, the
     * {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     *
     * @param pResViewDesc resource view descriptor
     * @param texObject    texture object
     */
    @NativeType("CUresult")
    public static int cuTexObjectGetResourceViewDesc(@NativeType("CUDA_RESOURCE_VIEW_DESC *") CUDA_RESOURCE_VIEW_DESC pResViewDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetResourceViewDesc(pResViewDesc.address(), texObject);
    }

    // --- [ cuSurfObjectCreate ] ---

    /** Unsafe version of: {@link #cuSurfObjectCreate SurfObjectCreate} */
    public static int ncuSurfObjectCreate(long pSurfObject, long pResDesc) {
        long __functionAddress = Functions.SurfObjectCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pSurfObject, pResDesc, __functionAddress);
    }

    /**
     * Creates a surface object.
     * 
     * <p>Creates a surface object and returns it in {@code pSurfObject}. {@code pResDesc} describes the data to perform surface load/stores on.
     * {@code CUDA_RESOURCE_DESC::resType} must be {@link #CU_RESOURCE_TYPE_ARRAY RESOURCE_TYPE_ARRAY} and {@code CUDA_RESOURCE_DESC::res::array::hArray} must be set to a valid CUDA array
     * handle. {@code CUDA_RESOURCE_DESC::flags} must be set to zero.</p>
     * 
     * <p>Surface objects are only supported on devices of compute capability 3.0 or higher. Additionally, a surface object is an opaque value, and, as such,
     * should only be accessed through CUDA API calls.</p>
     *
     * @param pSurfObject surface object to create
     * @param pResDesc    resource descriptor
     */
    @NativeType("CUresult")
    public static int cuSurfObjectCreate(@NativeType("CUsurfObject *") LongBuffer pSurfObject, @NativeType("CUDA_RESOURCE_DESC const *") CUDA_RESOURCE_DESC pResDesc) {
        if (CHECKS) {
            check(pSurfObject, 1);
        }
        return ncuSurfObjectCreate(memAddress(pSurfObject), pResDesc.address());
    }

    // --- [ cuSurfObjectDestroy ] ---

    /**
     * Destroys a surface object.
     * 
     * <p>Destroys the surface object specified by {@code surfObject}.</p>
     *
     * @param surfObject surface object to destroy
     */
    @NativeType("CUresult")
    public static int cuSurfObjectDestroy(@NativeType("CUsurfObject") long surfObject) {
        long __functionAddress = Functions.SurfObjectDestroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(surfObject, __functionAddress);
    }

    // --- [ cuSurfObjectGetResourceDesc ] ---

    /** Unsafe version of: {@link #cuSurfObjectGetResourceDesc SurfObjectGetResourceDesc} */
    public static int ncuSurfObjectGetResourceDesc(long pResDesc, long surfObject) {
        long __functionAddress = Functions.SurfObjectGetResourceDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pResDesc, surfObject, __functionAddress);
    }

    /**
     * Returns a surface object's resource descriptor.
     * 
     * <p>Returns the resource descriptor for the surface object specified by {@code surfObject}.</p>
     *
     * @param pResDesc   resource descriptor
     * @param surfObject surface object
     */
    @NativeType("CUresult")
    public static int cuSurfObjectGetResourceDesc(@NativeType("CUDA_RESOURCE_DESC *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUsurfObject") long surfObject) {
        return ncuSurfObjectGetResourceDesc(pResDesc.address(), surfObject);
    }

    // --- [ cuDeviceCanAccessPeer ] ---

    /** Unsafe version of: {@link #cuDeviceCanAccessPeer DeviceCanAccessPeer} */
    public static int ncuDeviceCanAccessPeer(long canAccessPeer, int dev, int peerDev) {
        long __functionAddress = Functions.DeviceCanAccessPeer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(canAccessPeer, dev, peerDev, __functionAddress);
    }

    /**
     * Queries if a device may directly access a peer device's memory.
     * 
     * <p>Returns in {@code *canAccessPeer} a value of 1 if contexts on {@code dev} are capable of directly accessing memory from contexts on {@code peerDev} and
     * 0 otherwise. If direct access of {@code peerDev} from {@code dev} is possible, then access may be enabled on two specific contexts by calling
     * {@link #cuCtxEnablePeerAccess CtxEnablePeerAccess}.</p>
     *
     * @param canAccessPeer returned access capability
     * @param dev           device from which allocations on {@code peerDev} are to be directly accessed
     * @param peerDev       device on which the allocations to be directly accessed by {@code dev} reside
     */
    @NativeType("CUresult")
    public static int cuDeviceCanAccessPeer(@NativeType("int *") IntBuffer canAccessPeer, @NativeType("CUdevice") int dev, @NativeType("CUdevice") int peerDev) {
        if (CHECKS) {
            check(canAccessPeer, 1);
        }
        return ncuDeviceCanAccessPeer(memAddress(canAccessPeer), dev, peerDev);
    }

    // --- [ cuCtxEnablePeerAccess ] ---

    /**
     * Enables direct access to memory allocations in a peer context.
     * 
     * <p>If both the current context and {@code peerContext} are on devices which support unified addressing (as may be queried using
     * {@link #CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING}) and same major compute capability, then on success all allocations from {@code peerContext} will immediately
     * be accessible by the current context. See ref for additional details.</p>
     * 
     * <p>Note that access granted by this call is unidirectional and that in order to access memory from the current context in {@code peerContext}, a separate
     * symmetric call to {@link #cuCtxEnablePeerAccess CtxEnablePeerAccess} is required.</p>
     * 
     * <p>Note that there are both device-wide and system-wide limitations per system configuration, as noted in the CUDA Programming Guide under the section
     * "Peer-to-Peer Memory Access".</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_PEER_ACCESS_UNSUPPORTED} if {@link #cuDeviceCanAccessPeer DeviceCanAccessPeer} indicates that the {@code CUdevice} of the current context cannot directly access
     * memory from the {@code CUdevice} of {@code peerContext}.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED} if direct access of {@code peerContext} from the current context has already been enabled.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_TOO_MANY_PEERS} if direct peer access is not possible because hardware resources required for peer access have been exhausted.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_INVALID_CONTEXT} if there is no current context, {@code peerContext} is not a valid context, or if the current context is {@code
     * peerContext}.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_INVALID_VALUE} if {@code Flags} is not 0.</p>
     *
     * @param peerContext peer context to enable direct access to from the current context
     * @param Flags       reserved for future use and must be set to 0
     */
    @NativeType("CUresult")
    public static int cuCtxEnablePeerAccess(@NativeType("CUcontext") long peerContext, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.CtxEnablePeerAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(peerContext);
        }
        return callPI(peerContext, Flags, __functionAddress);
    }

    // --- [ cuCtxDisablePeerAccess ] ---

    /**
     * Disables direct access to memory allocations in a peer context and unregisters any registered allocations.
     * 
     * <p>Returns {@link #CUDA_ERROR_PEER_ACCESS_NOT_ENABLED} if direct peer access has not yet been enabled from {@code peerContext} to the current context.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_INVALID_CONTEXT} if there is no current context, or if {@code peerContext} is not a valid context.</p>
     *
     * @param peerContext peer context to disable direct access to
     */
    @NativeType("CUresult")
    public static int cuCtxDisablePeerAccess(@NativeType("CUcontext") long peerContext) {
        long __functionAddress = Functions.CtxDisablePeerAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(peerContext);
        }
        return callPI(peerContext, __functionAddress);
    }

    // --- [ cuDeviceGetP2PAttribute ] ---

    /** Unsafe version of: {@link #cuDeviceGetP2PAttribute DeviceGetP2PAttribute} */
    public static int ncuDeviceGetP2PAttribute(long value, int attrib, int srcDevice, int dstDevice) {
        long __functionAddress = Functions.DeviceGetP2PAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(value, attrib, srcDevice, dstDevice, __functionAddress);
    }

    /**
     * Queries attributes of the link between two devices.
     * 
     * <p>Returns in {@code *value} the value of the requested attribute {@code attrib} of the link between {@code srcDevice} and {@code dstDevice}. The
     * supported attributes are:</p>
     * 
     * <ul>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK}: A relative value indicating the performance of the link between two devices.</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED} P2P: 1 if P2P Access is enable.</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED}: 1 if Atomic operations over the link are supported.</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED}: 1 if cudaArray can be accessed over the link.</li>
     * </ul>
     * 
     * <p>Returns {@link #CUDA_ERROR_INVALID_DEVICE} if {@code srcDevice} or {@code dstDevice} are not valid or if they represent the same device.</p>
     * 
     * <p>Returns {@link #CUDA_ERROR_INVALID_VALUE} if {@code attrib} is not valid or if {@code value} is a null pointer.</p>
     *
     * @param value     returned value of the requested attribute
     * @param attrib    the requested attribute of the link between {@code srcDevice} and {@code dstDevice}
     * @param srcDevice the source device of the target link
     * @param dstDevice the destination device of the target link
     */
    @NativeType("CUresult")
    public static int cuDeviceGetP2PAttribute(@NativeType("int *") IntBuffer value, @NativeType("CUdevice_P2PAttribute") int attrib, @NativeType("CUdevice") int srcDevice, @NativeType("CUdevice") int dstDevice) {
        if (CHECKS) {
            check(value, 1);
        }
        return ncuDeviceGetP2PAttribute(memAddress(value), attrib, srcDevice, dstDevice);
    }

    // --- [ cuGraphicsUnregisterResource ] ---

    /**
     * Unregisters a graphics resource for access by CUDA.
     * 
     * <p>Unregisters the graphics resource {@code resource} so it is not accessible by CUDA unless registered again.</p>
     * 
     * <p>If {@code resource} is invalid then {@link #CUDA_ERROR_INVALID_HANDLE} is returned.</p>
     *
     * @param resource resource to unregister
     */
    @NativeType("CUresult")
    public static int cuGraphicsUnregisterResource(@NativeType("CUgraphicsResource") long resource) {
        long __functionAddress = Functions.GraphicsUnregisterResource;
        if (CHECKS) {
            check(resource);
        }
        return callPI(resource, __functionAddress);
    }

    // --- [ cuGraphicsSubResourceGetMappedArray ] ---

    /** Unsafe version of: {@link #cuGraphicsSubResourceGetMappedArray GraphicsSubResourceGetMappedArray} */
    public static int ncuGraphicsSubResourceGetMappedArray(long pArray, long resource, int arrayIndex, int mipLevel) {
        long __functionAddress = Functions.GraphicsSubResourceGetMappedArray;
        if (CHECKS) {
            check(resource);
        }
        return callPPI(pArray, resource, arrayIndex, mipLevel, __functionAddress);
    }

    /**
     * Get an array through which to access a subresource of a mapped graphics resource.
     * 
     * <p>Returns in {@code *pArray} an array through which the subresource of the mapped graphics resource {@code resource} which corresponds to array index
     * {@code arrayIndex} and mipmap level {@code mipLevel} may be accessed. The value set in {@code *pArray} may change every time that {@code resource} is
     * mapped.</p>
     * 
     * <p>If {@code resource} is not a texture then it cannot be accessed via an array and {@link #CUDA_ERROR_NOT_MAPPED_AS_ARRAY} is returned. If {@code arrayIndex} is
     * not a valid array index for {@code resource} then {@link #CUDA_ERROR_INVALID_VALUE} is returned. If {@code mipLevel} is not a valid mipmap level for {@code
     * resource} then {@link #CUDA_ERROR_INVALID_VALUE} is returned. If {@code resource} is not mapped then {@link #CUDA_ERROR_NOT_MAPPED} is returned.</p>
     *
     * @param pArray     returned array through which a subresource of {@code resource} may be accessed
     * @param resource   mapped resource to access
     * @param arrayIndex array index for array textures or cubemap face index as defined by {@code CUarray_cubemap_face} for cubemap textures for the subresource to access
     * @param mipLevel   mipmap level for the subresource to access
     */
    @NativeType("CUresult")
    public static int cuGraphicsSubResourceGetMappedArray(@NativeType("CUarray *") PointerBuffer pArray, @NativeType("CUgraphicsResource") long resource, @NativeType("unsigned int") int arrayIndex, @NativeType("unsigned int") int mipLevel) {
        if (CHECKS) {
            check(pArray, 1);
        }
        return ncuGraphicsSubResourceGetMappedArray(memAddress(pArray), resource, arrayIndex, mipLevel);
    }

    // --- [ cuGraphicsResourceGetMappedMipmappedArray ] ---

    /** Unsafe version of: {@link #cuGraphicsResourceGetMappedMipmappedArray GraphicsResourceGetMappedMipmappedArray} */
    public static int ncuGraphicsResourceGetMappedMipmappedArray(long pMipmappedArray, long resource) {
        long __functionAddress = Functions.GraphicsResourceGetMappedMipmappedArray;
        if (CHECKS) {
            check(__functionAddress);
            check(resource);
        }
        return callPPI(pMipmappedArray, resource, __functionAddress);
    }

    /**
     * Get a mipmapped array through which to access a mapped graphics resource.
     * 
     * <p>Returns in {@code *pMipmappedArray} a mipmapped array through which the mapped graphics resource {@code resource}. The value set in
     * {@code *pMipmappedArray} may change every time that {@code resource} is mapped.</p>
     * 
     * <p>If {@code resource} is not a texture then it cannot be accessed via a mipmapped array and {@link #CUDA_ERROR_NOT_MAPPED_AS_ARRAY} is returned. If {@code
     * resource} is not mapped then {@link #CUDA_ERROR_NOT_MAPPED} is returned.</p>
     *
     * @param pMipmappedArray returned mipmapped array through which {@code resource} may be accessed
     * @param resource        mapped resource to access
     */
    @NativeType("CUresult")
    public static int cuGraphicsResourceGetMappedMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer pMipmappedArray, @NativeType("CUgraphicsResource") long resource) {
        if (CHECKS) {
            check(pMipmappedArray, 1);
        }
        return ncuGraphicsResourceGetMappedMipmappedArray(memAddress(pMipmappedArray), resource);
    }

    // --- [ cuGraphicsResourceGetMappedPointer ] ---

    /** Unsafe version of: {@link #cuGraphicsResourceGetMappedPointer GraphicsResourceGetMappedPointer} */
    public static int ncuGraphicsResourceGetMappedPointer(long pDevPtr, long pSize, long resource) {
        long __functionAddress = Functions.GraphicsResourceGetMappedPointer;
        if (CHECKS) {
            check(resource);
        }
        return callPPPI(pDevPtr, pSize, resource, __functionAddress);
    }

    /**
     * Get a device pointer through which to access a mapped graphics resource.
     * 
     * <p>Returns in {@code *pDevPtr} a pointer through which the mapped graphics resource {@code resource} may be accessed. Returns in {@code pSize} the size of
     * the memory in bytes which may be accessed from that pointer. The value set in {@code pPointer} may change every time that {@code resource} is mapped.</p>
     * 
     * <p>If {@code resource} is not a buffer then it cannot be accessed via a pointer and {@link #CUDA_ERROR_NOT_MAPPED_AS_POINTER} is returned. If {@code resource} is
     * not mapped then {@link #CUDA_ERROR_NOT_MAPPED} is returned. *</p>
     *
     * @param pDevPtr  returned pointer through which {@code resource} may be accessed
     * @param pSize    returned size of the buffer accessible starting at {@code *pPointer}
     * @param resource mapped resource to access
     */
    @NativeType("CUresult")
    public static int cuGraphicsResourceGetMappedPointer(@NativeType("CUdeviceptr *") PointerBuffer pDevPtr, @NativeType("size_t *") PointerBuffer pSize, @NativeType("CUgraphicsResource") long resource) {
        if (CHECKS) {
            check(pDevPtr, 1);
            check(pSize, 1);
        }
        return ncuGraphicsResourceGetMappedPointer(memAddress(pDevPtr), memAddress(pSize), resource);
    }

    // --- [ cuGraphicsResourceSetMapFlags ] ---

    /**
     * Set usage flags for mapping a graphics resource.
     * 
     * <p>Set {@code flags} for mapping the graphics resource {@code resource}.</p>
     * 
     * <p>Changes to {@code flags} will take effect the next time {@code resource} is mapped. The {@code flags} argument may be any of the following:</p>
     * 
     * <ul>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE GRAPHICS_MAP_RESOURCE_FLAGS_NONE}: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be
     * read from and written to by CUDA kernels. This is the default value.</li>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY}: Specifies that CUDA kernels which access this resource will not write to this resource.</li>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD}: Specifies that CUDA kernels which access this resource will not read from this resource and will
     * write over the entire contents of the resource, so none of the data previously stored in the resource will be preserved.</li>
     * </ul>
     * 
     * <p>If {@code resource} is presently mapped for access by CUDA then {@link #CUDA_ERROR_ALREADY_MAPPED} is returned. If {@code flags} is not one of the above
     * values then {@link #CUDA_ERROR_INVALID_VALUE} is returned.</p>
     *
     * @param resource registered resource to set flags for
     * @param flags    parameters for resource mapping
     */
    @NativeType("CUresult")
    public static int cuGraphicsResourceSetMapFlags(@NativeType("CUgraphicsResource") long resource, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.GraphicsResourceSetMapFlags;
        if (CHECKS) {
            check(resource);
        }
        return callPI(resource, flags, __functionAddress);
    }

    // --- [ cuGraphicsMapResources ] ---

    /**
     * Unsafe version of: {@link #cuGraphicsMapResources GraphicsMapResources}
     *
     * @param count number of resources to map
     */
    public static int ncuGraphicsMapResources(int count, long resources, long hStream) {
        long __functionAddress = Functions.GraphicsMapResources;
        return callPPI(count, resources, hStream, __functionAddress);
    }

    /**
     * Map graphics resources for access by CUDA.
     * 
     * <p>Maps the {@code count} graphics resources in {@code resources} for access by CUDA.</p>
     * 
     * <p>The resources in {@code resources} may be accessed by CUDA until they are unmapped. The graphics API from which {@code resources} were registered
     * should not access any resources while they are mapped by CUDA. If an application does so, the results are undefined.</p>
     * 
     * <p>This function provides the synchronization guarantee that any graphics calls issued before {@link #cuGraphicsMapResources GraphicsMapResources} will complete before any
     * subsequent CUDA work issued in {@code stream} begins.</p>
     * 
     * <p>If {@code resources} includes any duplicate entries then {@link #CUDA_ERROR_INVALID_HANDLE} is returned. If any of {@code resources} are presently mapped for
     * access by CUDA then {@link #CUDA_ERROR_ALREADY_MAPPED} is returned.</p>
     *
     * @param resources resources to map for CUDA usage
     * @param hStream   stream with which to synchronize
     */
    @NativeType("CUresult")
    public static int cuGraphicsMapResources(@NativeType("CUgraphicsResource *") PointerBuffer resources, @NativeType("CUstream") long hStream) {
        return ncuGraphicsMapResources(resources.remaining(), memAddress(resources), hStream);
    }

    // --- [ cuGraphicsUnmapResources ] ---

    /**
     * Unsafe version of: {@link #cuGraphicsUnmapResources GraphicsUnmapResources}
     *
     * @param count number of resources to unmap
     */
    public static int ncuGraphicsUnmapResources(int count, long resources, long hStream) {
        long __functionAddress = Functions.GraphicsUnmapResources;
        return callPPI(count, resources, hStream, __functionAddress);
    }

    /**
     * Unmap graphics resources.
     * 
     * <p>Unmaps the {@code count} graphics resources in {@code resources}.</p>
     * 
     * <p>Once unmapped, the resources in {@code resources} may not be accessed by CUDA until they are mapped again.</p>
     * 
     * <p>This function provides the synchronization guarantee that any CUDA work issued in {@code stream} before {@link #cuGraphicsUnmapResources GraphicsUnmapResources} will complete
     * before any subsequently issued graphics work begins.</p>
     * 
     * <p>If {@code resources} includes any duplicate entries then {@link #CUDA_ERROR_INVALID_HANDLE} is returned. If any of {@code resources} are not presently mapped
     * for access by CUDA then {@link #CUDA_ERROR_NOT_MAPPED} is returned.</p>
     *
     * @param resources resources to unmap
     * @param hStream   stream with which to synchronize
     */
    @NativeType("CUresult")
    public static int cuGraphicsUnmapResources(@NativeType("CUgraphicsResource *") PointerBuffer resources, @NativeType("CUstream") long hStream) {
        return ncuGraphicsUnmapResources(resources.remaining(), memAddress(resources), hStream);
    }

    // --- [ cuGetProcAddress ] ---

    /** Unsafe version of: {@link #cuGetProcAddress GetProcAddress} */
    public static int ncuGetProcAddress(long symbol, long pfn, int cudaVersion, long flags) {
        long __functionAddress = Functions.GetProcAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(symbol, pfn, cudaVersion, flags, __functionAddress);
    }

    /**
     * Returns the requested driver API function pointer.
     * 
     * <p>Returns in {@code **pfn} the address of the CUDA driver function for the requested CUDA version and flags.</p>
     * 
     * <p>The CUDA version is specified as (1000 * major + 10 * minor), so CUDA 11.2 should be specified as 11020. For a requested driver symbol, if the
     * specified CUDA version is greater than or equal to the CUDA version in which the driver symbol was introduced, this API will return the function
     * pointer to the corresponding versioned function.</p>
     * 
     * <p>The pointer returned by the API should be cast to a function pointer matching the requested driver function's definition in the API header file. The
     * function pointer typedef can be picked up from the corresponding typedefs header file. For example, cudaTypedefs.h consists of function pointer
     * typedefs for driver APIs defined in cuda.h.</p>
     * 
     * <p>The API will return {@link #CUDA_ERROR_NOT_FOUND} if the requested driver function is not supported on the platform, no ABI compatible driver function exists
     * for the specified {@code cudaVersion} or if the driver symbol is invalid.</p>
     * 
     * <p>The requested flags can be:</p>
     * 
     * <ul>
     * <li>{@link #CU_GET_PROC_ADDRESS_DEFAULT GET_PROC_ADDRESS_DEFAULT}: This is the default mode. This is equivalent to {@link #CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM} if the code is
     * compiled with --default-stream per-thread compilation flag or the macro {@code CUDA_API_PER_THREAD_DEFAULT_STREAM} is defined;
     * {@link #CU_GET_PROC_ADDRESS_LEGACY_STREAM GET_PROC_ADDRESS_LEGACY_STREAM} otherwise.</li>
     * <li>{@link #CU_GET_PROC_ADDRESS_LEGACY_STREAM GET_PROC_ADDRESS_LEGACY_STREAM}: This will enable the search for all driver symbols that match the requested driver symbol name except the
     * corresponding per-thread versions.</li>
     * <li>{@link #CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM}: This will enable the search for all driver symbols that match the requested driver symbol name
     * including the per-thread versions. If a per-thread version is not found, the API will return the legacy version of the driver function.</li>
     * </ul>
     *
     * @param symbol      the base name of the driver API function to look for. As an example, for the driver API {@code cuMemAlloc_v2()}, {@code symbol} would be
     *                    {@code cuMemAlloc} and {@code cudaVersion} would be the ABI compatible CUDA version for the {@code _v2} variant.
     * @param pfn         location to return the function pointer to the requested driver function
     * @param cudaVersion the CUDA version to look for the requested driver symbol
     * @param flags       flags to specify search options
     */
    @NativeType("CUresult")
    public static int cuGetProcAddress(@NativeType("char const *") ByteBuffer symbol, @NativeType("void **") PointerBuffer pfn, int cudaVersion, @NativeType("cuuint64_t") long flags) {
        if (CHECKS) {
            checkNT1(symbol);
            check(pfn, 1);
        }
        return ncuGetProcAddress(memAddress(symbol), memAddress(pfn), cudaVersion, flags);
    }

    /**
     * Returns the requested driver API function pointer.
     * 
     * <p>Returns in {@code **pfn} the address of the CUDA driver function for the requested CUDA version and flags.</p>
     * 
     * <p>The CUDA version is specified as (1000 * major + 10 * minor), so CUDA 11.2 should be specified as 11020. For a requested driver symbol, if the
     * specified CUDA version is greater than or equal to the CUDA version in which the driver symbol was introduced, this API will return the function
     * pointer to the corresponding versioned function.</p>
     * 
     * <p>The pointer returned by the API should be cast to a function pointer matching the requested driver function's definition in the API header file. The
     * function pointer typedef can be picked up from the corresponding typedefs header file. For example, cudaTypedefs.h consists of function pointer
     * typedefs for driver APIs defined in cuda.h.</p>
     * 
     * <p>The API will return {@link #CUDA_ERROR_NOT_FOUND} if the requested driver function is not supported on the platform, no ABI compatible driver function exists
     * for the specified {@code cudaVersion} or if the driver symbol is invalid.</p>
     * 
     * <p>The requested flags can be:</p>
     * 
     * <ul>
     * <li>{@link #CU_GET_PROC_ADDRESS_DEFAULT GET_PROC_ADDRESS_DEFAULT}: This is the default mode. This is equivalent to {@link #CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM} if the code is
     * compiled with --default-stream per-thread compilation flag or the macro {@code CUDA_API_PER_THREAD_DEFAULT_STREAM} is defined;
     * {@link #CU_GET_PROC_ADDRESS_LEGACY_STREAM GET_PROC_ADDRESS_LEGACY_STREAM} otherwise.</li>
     * <li>{@link #CU_GET_PROC_ADDRESS_LEGACY_STREAM GET_PROC_ADDRESS_LEGACY_STREAM}: This will enable the search for all driver symbols that match the requested driver symbol name except the
     * corresponding per-thread versions.</li>
     * <li>{@link #CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM}: This will enable the search for all driver symbols that match the requested driver symbol name
     * including the per-thread versions. If a per-thread version is not found, the API will return the legacy version of the driver function.</li>
     * </ul>
     *
     * @param symbol      the base name of the driver API function to look for. As an example, for the driver API {@code cuMemAlloc_v2()}, {@code symbol} would be
     *                    {@code cuMemAlloc} and {@code cudaVersion} would be the ABI compatible CUDA version for the {@code _v2} variant.
     * @param pfn         location to return the function pointer to the requested driver function
     * @param cudaVersion the CUDA version to look for the requested driver symbol
     * @param flags       flags to specify search options
     */
    @NativeType("CUresult")
    public static int cuGetProcAddress(@NativeType("char const *") CharSequence symbol, @NativeType("void **") PointerBuffer pfn, int cudaVersion, @NativeType("cuuint64_t") long flags) {
        if (CHECKS) {
            check(pfn, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(symbol, true);
            long symbolEncoded = stack.getPointerAddress();
            return ncuGetProcAddress(symbolEncoded, memAddress(pfn), cudaVersion, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuGetExportTable ] ---

    public static int ncuGetExportTable(long ppExportTable, long pExportTableId) {
        long __functionAddress = Functions.GetExportTable;
        return callPPI(ppExportTable, pExportTableId, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGetExportTable(@NativeType("void const **") PointerBuffer ppExportTable, @NativeType("CUuuid const *") CUuuid pExportTableId) {
        return ncuGetExportTable(memAddress(ppExportTable), pExportTableId.address());
    }

}