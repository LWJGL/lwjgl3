/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

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

public class CU {

    private static final SharedLibrary NVCUDA = Library.loadNative(CU.class, "org.lwjgl.cuda", Configuration.CUDA_LIBRARY_NAME, Platform.get() == Platform.WINDOWS ? "nvcuda" : "cuda");

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
            DeviceGetUuid                                      = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetUuid"),
            DeviceGetUuid_v2                                   = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetUuid_v2"),
            DeviceGetLuid                                      = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetLuid"),
            DeviceTotalMem                                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuDeviceTotalMem", 2)),
            DeviceGetTexture1DLinearMaxWidth                   = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetTexture1DLinearMaxWidth"),
            DeviceGetAttribute                                 = apiGetFunctionAddress(NVCUDA, "cuDeviceGetAttribute"),
            DeviceGetNvSciSyncAttributes                       = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetNvSciSyncAttributes"),
            DeviceSetMemPool                                   = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceSetMemPool"),
            DeviceGetMemPool                                   = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetMemPool"),
            DeviceGetDefaultMemPool                            = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetDefaultMemPool"),
            DeviceGetExecAffinitySupport                       = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetExecAffinitySupport"),
            FlushGPUDirectRDMAWrites                           = apiGetFunctionAddressOptional(NVCUDA, "cuFlushGPUDirectRDMAWrites"),
            DeviceGetProperties                                = apiGetFunctionAddress(NVCUDA, "cuDeviceGetProperties"),
            DeviceComputeCapability                            = apiGetFunctionAddress(NVCUDA, "cuDeviceComputeCapability"),
            DevicePrimaryCtxRetain                             = apiGetFunctionAddressOptional(NVCUDA, "cuDevicePrimaryCtxRetain"),
            DevicePrimaryCtxRelease                            = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuDevicePrimaryCtxRelease", 2)),
            DevicePrimaryCtxSetFlags                           = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuDevicePrimaryCtxSetFlags", 2)),
            DevicePrimaryCtxGetState                           = apiGetFunctionAddressOptional(NVCUDA, "cuDevicePrimaryCtxGetState"),
            DevicePrimaryCtxReset                              = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuDevicePrimaryCtxReset", 2)),
            CtxCreate                                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuCtxCreate", 2)),
            CtxCreate_v3                                       = apiGetFunctionAddressOptional(NVCUDA, "cuCtxCreate_v3"),
            CtxCreate_v4                                       = apiGetFunctionAddressOptional(NVCUDA, "cuCtxCreate_v4"),
            CtxDestroy                                         = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuCtxDestroy", 2)),
            CtxPushCurrent                                     = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuCtxPushCurrent", 2)),
            CtxPopCurrent                                      = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuCtxPopCurrent", 2)),
            CtxSetCurrent                                      = apiGetFunctionAddressOptional(NVCUDA, "cuCtxSetCurrent"),
            CtxGetCurrent                                      = apiGetFunctionAddressOptional(NVCUDA, "cuCtxGetCurrent"),
            CtxGetDevice                                       = apiGetFunctionAddress(NVCUDA, "cuCtxGetDevice"),
            CtxGetFlags                                        = apiGetFunctionAddressOptional(NVCUDA, "cuCtxGetFlags"),
            CtxSetFlags                                        = apiGetFunctionAddressOptional(NVCUDA, "cuCtxSetFlags"),
            CtxGetId                                           = apiGetFunctionAddressOptional(NVCUDA, "cuCtxGetId"),
            CtxSynchronize                                     = apiGetFunctionAddress(NVCUDA, "cuCtxSynchronize"),
            CtxSetLimit                                        = apiGetFunctionAddress(NVCUDA, "cuCtxSetLimit"),
            CtxGetLimit                                        = apiGetFunctionAddress(NVCUDA, "cuCtxGetLimit"),
            CtxGetCacheConfig                                  = apiGetFunctionAddress(NVCUDA, "cuCtxGetCacheConfig"),
            CtxSetCacheConfig                                  = apiGetFunctionAddress(NVCUDA, "cuCtxSetCacheConfig"),
            CtxGetSharedMemConfig                              = apiGetFunctionAddressOptional(NVCUDA, "cuCtxGetSharedMemConfig"),
            CtxSetSharedMemConfig                              = apiGetFunctionAddressOptional(NVCUDA, "cuCtxSetSharedMemConfig"),
            CtxGetApiVersion                                   = apiGetFunctionAddress(NVCUDA, "cuCtxGetApiVersion"),
            CtxGetStreamPriorityRange                          = apiGetFunctionAddress(NVCUDA, "cuCtxGetStreamPriorityRange"),
            CtxResetPersistingL2Cache                          = apiGetFunctionAddressOptional(NVCUDA, "cuCtxResetPersistingL2Cache"),
            CtxGetExecAffinity                                 = apiGetFunctionAddressOptional(NVCUDA, "cuCtxGetExecAffinity"),
            CtxRecordEvent                                     = apiGetFunctionAddressOptional(NVCUDA, "cuCtxRecordEvent"),
            CtxWaitEvent                                       = apiGetFunctionAddressOptional(NVCUDA, "cuCtxWaitEvent"),
            CtxAttach                                          = apiGetFunctionAddress(NVCUDA, "cuCtxAttach"),
            CtxDetach                                          = apiGetFunctionAddress(NVCUDA, "cuCtxDetach"),
            ModuleLoad                                         = apiGetFunctionAddress(NVCUDA, "cuModuleLoad"),
            ModuleLoadData                                     = apiGetFunctionAddress(NVCUDA, "cuModuleLoadData"),
            ModuleLoadDataEx                                   = apiGetFunctionAddress(NVCUDA, "cuModuleLoadDataEx"),
            ModuleLoadFatBinary                                = apiGetFunctionAddress(NVCUDA, "cuModuleLoadFatBinary"),
            ModuleUnload                                       = apiGetFunctionAddress(NVCUDA, "cuModuleUnload"),
            ModuleGetLoadingMode                               = apiGetFunctionAddressOptional(NVCUDA, "cuModuleGetLoadingMode"),
            ModuleGetFunction                                  = apiGetFunctionAddress(NVCUDA, "cuModuleGetFunction"),
            ModuleGetFunctionCount                             = apiGetFunctionAddressOptional(NVCUDA, "cuModuleGetFunctionCount"),
            ModuleEnumerateFunctions                           = apiGetFunctionAddressOptional(NVCUDA, "cuModuleEnumerateFunctions"),
            ModuleGetGlobal                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuModuleGetGlobal", 2)),
            LinkCreate                                         = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuLinkCreate", 2)),
            LinkAddData                                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuLinkAddData", 2)),
            LinkAddFile                                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuLinkAddFile", 2)),
            LinkComplete                                       = apiGetFunctionAddressOptional(NVCUDA, "cuLinkComplete"),
            LinkDestroy                                        = apiGetFunctionAddressOptional(NVCUDA, "cuLinkDestroy"),
            ModuleGetTexRef                                    = apiGetFunctionAddress(NVCUDA, "cuModuleGetTexRef"),
            ModuleGetSurfRef                                   = apiGetFunctionAddress(NVCUDA, "cuModuleGetSurfRef"),
            LibraryLoadData                                    = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryLoadData"),
            LibraryLoadFromFile                                = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryLoadFromFile"),
            LibraryUnload                                      = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryUnload"),
            LibraryGetKernel                                   = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryGetKernel"),
            LibraryGetKernelCount                              = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryGetKernelCount"),
            LibraryEnumerateKernels                            = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryEnumerateKernels"),
            LibraryGetModule                                   = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryGetModule"),
            KernelGetFunction                                  = apiGetFunctionAddressOptional(NVCUDA, "cuKernelGetFunction"),
            KernelGetLibrary                                   = apiGetFunctionAddressOptional(NVCUDA, "cuKernelGetLibrary"),
            LibraryGetGlobal                                   = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryGetGlobal"),
            LibraryGetManaged                                  = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryGetManaged"),
            LibraryGetUnifiedFunction                          = apiGetFunctionAddressOptional(NVCUDA, "cuLibraryGetUnifiedFunction"),
            KernelGetAttribute                                 = apiGetFunctionAddressOptional(NVCUDA, "cuKernelGetAttribute"),
            KernelSetAttribute                                 = apiGetFunctionAddressOptional(NVCUDA, "cuKernelSetAttribute"),
            KernelSetCacheConfig                               = apiGetFunctionAddressOptional(NVCUDA, "cuKernelSetCacheConfig"),
            KernelGetName                                      = apiGetFunctionAddressOptional(NVCUDA, "cuKernelGetName"),
            KernelGetParamInfo                                 = apiGetFunctionAddressOptional(NVCUDA, "cuKernelGetParamInfo"),
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
            MemAllocManaged                                    = apiGetFunctionAddressOptional(NVCUDA, "cuMemAllocManaged"),
            DeviceRegisterAsyncNotification                    = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceRegisterAsyncNotification"),
            DeviceUnregisterAsyncNotification                  = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceUnregisterAsyncNotification"),
            DeviceGetByPCIBusId                                = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetByPCIBusId"),
            DeviceGetPCIBusId                                  = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetPCIBusId"),
            IpcGetEventHandle                                  = apiGetFunctionAddressOptional(NVCUDA, "cuIpcGetEventHandle"),
            IpcOpenEventHandle                                 = apiGetFunctionAddressOptional(NVCUDA, "cuIpcOpenEventHandle"),
            IpcGetMemHandle                                    = apiGetFunctionAddressOptional(NVCUDA, "cuIpcGetMemHandle"),
            IpcOpenMemHandle                                   = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuIpcOpenMemHandle", 2)),
            IpcCloseMemHandle                                  = apiGetFunctionAddressOptional(NVCUDA, "cuIpcCloseMemHandle"),
            MemHostRegister                                    = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuMemHostRegister", 2)),
            MemHostUnregister                                  = apiGetFunctionAddressOptional(NVCUDA, "cuMemHostUnregister"),
            Memcpy                                             = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTDS("cuMemcpy")),
            MemcpyPeer                                         = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTDS("cuMemcpyPeer")),
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
            Memcpy3DPeer                                       = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTDS("cuMemcpy3DPeer")),
            MemcpyAsync                                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemcpyAsync")),
            MemcpyPeerAsync                                    = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemcpyPeerAsync")),
            MemcpyHtoDAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyHtoDAsync", 2))),
            MemcpyDtoHAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyDtoHAsync", 2))),
            MemcpyDtoDAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyDtoDAsync", 2))),
            MemcpyHtoAAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyHtoAAsync", 2))),
            MemcpyAtoHAsync                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyAtoHAsync", 2))),
            Memcpy2DAsync                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpy2DAsync", 2))),
            Memcpy3DAsync                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpy3DAsync", 2))),
            Memcpy3DPeerAsync                                  = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemcpy3DPeerAsync")),
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
            ArrayGetSparseProperties                           = apiGetFunctionAddressOptional(NVCUDA, "cuArrayGetSparseProperties"),
            MipmappedArrayGetSparseProperties                  = apiGetFunctionAddressOptional(NVCUDA, "cuMipmappedArrayGetSparseProperties"),
            ArrayGetMemoryRequirements                         = apiGetFunctionAddressOptional(NVCUDA, "cuArrayGetMemoryRequirements"),
            MipmappedArrayGetMemoryRequirements                = apiGetFunctionAddressOptional(NVCUDA, "cuMipmappedArrayGetMemoryRequirements"),
            ArrayGetPlane                                      = apiGetFunctionAddressOptional(NVCUDA, "cuArrayGetPlane"),
            ArrayDestroy                                       = apiGetFunctionAddress(NVCUDA, "cuArrayDestroy"),
            Array3DCreate                                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArray3DCreate", 2)),
            Array3DGetDescriptor                               = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArray3DGetDescriptor", 2)),
            MipmappedArrayCreate                               = apiGetFunctionAddressOptional(NVCUDA, "cuMipmappedArrayCreate"),
            MipmappedArrayGetLevel                             = apiGetFunctionAddressOptional(NVCUDA, "cuMipmappedArrayGetLevel"),
            MipmappedArrayDestroy                              = apiGetFunctionAddressOptional(NVCUDA, "cuMipmappedArrayDestroy"),
            MemGetHandleForAddressRange                        = apiGetFunctionAddressOptional(NVCUDA, "cuMemGetHandleForAddressRange"),
            MemAddressReserve                                  = apiGetFunctionAddressOptional(NVCUDA, "cuMemAddressReserve"),
            MemAddressFree                                     = apiGetFunctionAddressOptional(NVCUDA, "cuMemAddressFree"),
            MemCreate                                          = apiGetFunctionAddressOptional(NVCUDA, "cuMemCreate"),
            MemRelease                                         = apiGetFunctionAddressOptional(NVCUDA, "cuMemRelease"),
            MemMap                                             = apiGetFunctionAddressOptional(NVCUDA, "cuMemMap"),
            MemMapArrayAsync                                   = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemMapArrayAsync")),
            MemUnmap                                           = apiGetFunctionAddressOptional(NVCUDA, "cuMemUnmap"),
            MemSetAccess                                       = apiGetFunctionAddressOptional(NVCUDA, "cuMemSetAccess"),
            MemGetAccess                                       = apiGetFunctionAddressOptional(NVCUDA, "cuMemGetAccess"),
            MemExportToShareableHandle                         = apiGetFunctionAddressOptional(NVCUDA, "cuMemExportToShareableHandle"),
            MemImportFromShareableHandle                       = apiGetFunctionAddressOptional(NVCUDA, "cuMemImportFromShareableHandle"),
            MemGetAllocationGranularity                        = apiGetFunctionAddressOptional(NVCUDA, "cuMemGetAllocationGranularity"),
            MemGetAllocationPropertiesFromHandle               = apiGetFunctionAddressOptional(NVCUDA, "cuMemGetAllocationPropertiesFromHandle"),
            MemRetainAllocationHandle                          = apiGetFunctionAddressOptional(NVCUDA, "cuMemRetainAllocationHandle"),
            MemFreeAsync                                       = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemFreeAsync")),
            MemAllocAsync                                      = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemAllocAsync")),
            MemPoolTrimTo                                      = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolTrimTo"),
            MemPoolSetAttribute                                = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolSetAttribute"),
            MemPoolGetAttribute                                = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolGetAttribute"),
            MemPoolSetAccess                                   = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolSetAccess"),
            MemPoolGetAccess                                   = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolGetAccess"),
            MemPoolCreate                                      = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolCreate"),
            MemPoolDestroy                                     = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolDestroy"),
            MemAllocFromPoolAsync                              = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemAllocFromPoolAsync")),
            MemPoolExportToShareableHandle                     = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolExportToShareableHandle"),
            MemPoolImportFromShareableHandle                   = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolImportFromShareableHandle"),
            MemPoolExportPointer                               = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolExportPointer"),
            MemPoolImportPointer                               = apiGetFunctionAddressOptional(NVCUDA, "cuMemPoolImportPointer"),
            MulticastCreate                                    = apiGetFunctionAddressOptional(NVCUDA, "cuMulticastCreate"),
            MulticastAddDevice                                 = apiGetFunctionAddressOptional(NVCUDA, "cuMulticastAddDevice"),
            MulticastBindMem                                   = apiGetFunctionAddressOptional(NVCUDA, "cuMulticastBindMem"),
            MulticastBindAddr                                  = apiGetFunctionAddressOptional(NVCUDA, "cuMulticastBindAddr"),
            MulticastUnbind                                    = apiGetFunctionAddressOptional(NVCUDA, "cuMulticastUnbind"),
            MulticastGetGranularity                            = apiGetFunctionAddressOptional(NVCUDA, "cuMulticastGetGranularity"),
            PointerGetAttribute                                = apiGetFunctionAddressOptional(NVCUDA, "cuPointerGetAttribute"),
            MemPrefetchAsync                                   = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemPrefetchAsync")),
            MemPrefetchAsync_v2                                = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuMemPrefetchAsync_v2")),
            MemAdvise                                          = apiGetFunctionAddressOptional(NVCUDA, "cuMemAdvise"),
            MemAdvise_v2                                       = apiGetFunctionAddressOptional(NVCUDA, "cuMemAdvise_v2"),
            MemRangeGetAttribute                               = apiGetFunctionAddressOptional(NVCUDA, "cuMemRangeGetAttribute"),
            MemRangeGetAttributes                              = apiGetFunctionAddressOptional(NVCUDA, "cuMemRangeGetAttributes"),
            PointerSetAttribute                                = apiGetFunctionAddressOptional(NVCUDA, "cuPointerSetAttribute"),
            PointerGetAttributes                               = apiGetFunctionAddressOptional(NVCUDA, "cuPointerGetAttributes"),
            StreamCreate                                       = apiGetFunctionAddress(NVCUDA, "cuStreamCreate"),
            StreamCreateWithPriority                           = apiGetFunctionAddress(NVCUDA, "cuStreamCreateWithPriority"),
            StreamGetPriority                                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamGetPriority")),
            StreamGetFlags                                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamGetFlags")),
            StreamGetId                                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetId")),
            StreamGetCtx                                       = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetCtx")),
            StreamGetCtx_v2                                    = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetCtx_v2")),
            StreamWaitEvent                                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamWaitEvent")),
            StreamAddCallback                                  = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamAddCallback")),
            StreamBeginCapture                                 = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamBeginCapture")),
            StreamBeginCapture_v2                              = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamBeginCapture_v2")),
            StreamBeginCaptureToGraph                          = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamBeginCaptureToGraph")),
            ThreadExchangeStreamCaptureMode                    = apiGetFunctionAddressOptional(NVCUDA, "cuThreadExchangeStreamCaptureMode"),
            StreamEndCapture                                   = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamEndCapture")),
            StreamIsCapturing                                  = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamIsCapturing")),
            StreamGetCaptureInfo_v3                            = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetCaptureInfo_v3")),
            StreamGetCaptureInfo                               = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetCaptureInfo")),
            StreamGetCaptureInfo_v2                            = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetCaptureInfo_v2")),
            StreamUpdateCaptureDependencies                    = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamUpdateCaptureDependencies")),
            StreamUpdateCaptureDependencies_v2                 = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamUpdateCaptureDependencies_v2")),
            StreamAttachMemAsync                               = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamAttachMemAsync")),
            StreamQuery                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamQuery")),
            StreamSynchronize                                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamSynchronize")),
            StreamDestroy                                      = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuStreamDestroy", 2)),
            StreamCopyAttributes                               = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamCopyAttributes")),
            StreamGetAttribute                                 = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamGetAttribute")),
            StreamSetAttribute                                 = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuStreamSetAttribute")),
            EventCreate                                        = apiGetFunctionAddress(NVCUDA, "cuEventCreate"),
            EventRecord                                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuEventRecord")),
            EventRecordWithFlags                               = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuEventRecordWithFlags")),
            EventQuery                                         = apiGetFunctionAddress(NVCUDA, "cuEventQuery"),
            EventSynchronize                                   = apiGetFunctionAddress(NVCUDA, "cuEventSynchronize"),
            EventDestroy                                       = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuEventDestroy", 2)),
            EventElapsedTime                                   = apiGetFunctionAddress(NVCUDA, "cuEventElapsedTime"),
            ImportExternalMemory                               = apiGetFunctionAddressOptional(NVCUDA, "cuImportExternalMemory"),
            ExternalMemoryGetMappedBuffer                      = apiGetFunctionAddressOptional(NVCUDA, "cuExternalMemoryGetMappedBuffer"),
            ExternalMemoryGetMappedMipmappedArray              = apiGetFunctionAddressOptional(NVCUDA, "cuExternalMemoryGetMappedMipmappedArray"),
            DestroyExternalMemory                              = apiGetFunctionAddressOptional(NVCUDA, "cuDestroyExternalMemory"),
            ImportExternalSemaphore                            = apiGetFunctionAddressOptional(NVCUDA, "cuImportExternalSemaphore"),
            SignalExternalSemaphoresAsync                      = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuSignalExternalSemaphoresAsync")),
            WaitExternalSemaphoresAsync                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuWaitExternalSemaphoresAsync")),
            DestroyExternalSemaphore                           = apiGetFunctionAddressOptional(NVCUDA, "cuDestroyExternalSemaphore"),
            StreamWaitValue32                                  = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuStreamWaitValue32", 2))),
            StreamWaitValue64                                  = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuStreamWaitValue64", 2))),
            StreamWriteValue32                                 = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuStreamWriteValue32", 2))),
            StreamWriteValue64                                 = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuStreamWriteValue64", 2))),
            StreamBatchMemOp                                   = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuStreamBatchMemOp", 2))),
            FuncGetAttribute                                   = apiGetFunctionAddress(NVCUDA, "cuFuncGetAttribute"),
            FuncSetAttribute                                   = apiGetFunctionAddressOptional(NVCUDA, "cuFuncSetAttribute"),
            FuncSetCacheConfig                                 = apiGetFunctionAddress(NVCUDA, "cuFuncSetCacheConfig"),
            FuncSetSharedMemConfig                             = apiGetFunctionAddressOptional(NVCUDA, "cuFuncSetSharedMemConfig"),
            FuncGetModule                                      = apiGetFunctionAddressOptional(NVCUDA, "cuFuncGetModule"),
            FuncGetName                                        = apiGetFunctionAddressOptional(NVCUDA, "cuFuncGetName"),
            FuncGetParamInfo                                   = apiGetFunctionAddressOptional(NVCUDA, "cuFuncGetParamInfo"),
            FuncIsLoaded                                       = apiGetFunctionAddressOptional(NVCUDA, "cuFuncIsLoaded"),
            FuncLoad                                           = apiGetFunctionAddressOptional(NVCUDA, "cuFuncLoad"),
            LaunchKernel                                       = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuLaunchKernel")),
            LaunchKernelEx                                     = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuLaunchKernelEx")),
            LaunchCooperativeKernel                            = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuLaunchCooperativeKernel")),
            LaunchCooperativeKernelMultiDevice                 = apiGetFunctionAddressOptional(NVCUDA, "cuLaunchCooperativeKernelMultiDevice"),
            LaunchHostFunc                                     = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuLaunchHostFunc")),
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
            GraphCreate                                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphCreate"),
            GraphAddKernelNode                                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddKernelNode"),
            GraphAddKernelNode_v2                              = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddKernelNode_v2"),
            GraphKernelNodeGetParams                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeGetParams"),
            GraphKernelNodeGetParams_v2                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeGetParams_v2"),
            GraphKernelNodeSetParams                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeSetParams"),
            GraphKernelNodeSetParams_v2                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeSetParams_v2"),
            GraphAddMemcpyNode                                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddMemcpyNode"),
            GraphMemcpyNodeGetParams                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphMemcpyNodeGetParams"),
            GraphMemcpyNodeSetParams                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphMemcpyNodeSetParams"),
            GraphAddMemsetNode                                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddMemsetNode"),
            GraphMemsetNodeGetParams                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphMemsetNodeGetParams"),
            GraphMemsetNodeSetParams                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphMemsetNodeSetParams"),
            GraphAddHostNode                                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddHostNode"),
            GraphHostNodeGetParams                             = apiGetFunctionAddressOptional(NVCUDA, "cuGraphHostNodeGetParams"),
            GraphHostNodeSetParams                             = apiGetFunctionAddressOptional(NVCUDA, "cuGraphHostNodeSetParams"),
            GraphAddChildGraphNode                             = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddChildGraphNode"),
            GraphChildGraphNodeGetGraph                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphChildGraphNodeGetGraph"),
            GraphAddEmptyNode                                  = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddEmptyNode"),
            GraphAddEventRecordNode                            = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddEventRecordNode"),
            GraphEventRecordNodeGetEvent                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphEventRecordNodeGetEvent"),
            GraphEventRecordNodeSetEvent                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphEventRecordNodeSetEvent"),
            GraphAddEventWaitNode                              = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddEventWaitNode"),
            GraphEventWaitNodeGetEvent                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphEventWaitNodeGetEvent"),
            GraphEventWaitNodeSetEvent                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphEventWaitNodeSetEvent"),
            GraphAddExternalSemaphoresSignalNode               = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddExternalSemaphoresSignalNode"),
            GraphExternalSemaphoresSignalNodeGetParams         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExternalSemaphoresSignalNodeGetParams"),
            GraphExternalSemaphoresSignalNodeSetParams         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExternalSemaphoresSignalNodeSetParams"),
            GraphAddExternalSemaphoresWaitNode                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddExternalSemaphoresWaitNode"),
            GraphExternalSemaphoresWaitNodeGetParams           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExternalSemaphoresWaitNodeGetParams"),
            GraphExternalSemaphoresWaitNodeSetParams           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExternalSemaphoresWaitNodeSetParams"),
            GraphAddBatchMemOpNode                             = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddBatchMemOpNode"),
            GraphBatchMemOpNodeGetParams                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphBatchMemOpNodeGetParams"),
            GraphBatchMemOpNodeSetParams                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphBatchMemOpNodeSetParams"),
            GraphExecBatchMemOpNodeSetParams                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecBatchMemOpNodeSetParams"),
            GraphAddMemAllocNode                               = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddMemAllocNode"),
            GraphMemAllocNodeGetParams                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphMemAllocNodeGetParams"),
            GraphAddMemFreeNode                                = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddMemFreeNode"),
            GraphMemFreeNodeGetParams                          = apiGetFunctionAddressOptional(NVCUDA, "cuGraphMemFreeNodeGetParams"),
            DeviceGraphMemTrim                                 = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGraphMemTrim"),
            DeviceGetGraphMemAttribute                         = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetGraphMemAttribute"),
            DeviceSetGraphMemAttribute                         = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceSetGraphMemAttribute"),
            GraphClone                                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphClone"),
            GraphNodeFindInClone                               = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeFindInClone"),
            GraphNodeGetType                                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeGetType"),
            GraphGetNodes                                      = apiGetFunctionAddressOptional(NVCUDA, "cuGraphGetNodes"),
            GraphGetRootNodes                                  = apiGetFunctionAddressOptional(NVCUDA, "cuGraphGetRootNodes"),
            GraphGetEdges                                      = apiGetFunctionAddressOptional(NVCUDA, "cuGraphGetEdges"),
            GraphGetEdges_v2                                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphGetEdges_v2"),
            GraphNodeGetDependencies                           = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeGetDependencies"),
            GraphNodeGetDependencies_v2                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeGetDependencies_v2"),
            GraphNodeGetDependentNodes                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeGetDependentNodes"),
            GraphNodeGetDependentNodes_v2                      = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeGetDependentNodes_v2"),
            GraphAddDependencies                               = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddDependencies"),
            GraphAddDependencies_v2                            = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddDependencies_v2"),
            GraphRemoveDependencies                            = apiGetFunctionAddressOptional(NVCUDA, "cuGraphRemoveDependencies"),
            GraphRemoveDependencies_v2                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphRemoveDependencies_v2"),
            GraphDestroyNode                                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphDestroyNode"),
            GraphInstantiate                                   = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_VERSION("cuGraphInstantiate", 2)),
            GraphInstantiateWithFlags                          = apiGetFunctionAddressOptional(NVCUDA, "cuGraphInstantiateWithFlags"),
            GraphInstantiateWithParams                         = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuGraphInstantiateWithParams")),
            GraphExecGetFlags                                  = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecGetFlags"),
            GraphExecKernelNodeSetParams                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecKernelNodeSetParams"),
            GraphExecKernelNodeSetParams_v2                    = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecKernelNodeSetParams_v2"),
            GraphExecMemcpyNodeSetParams                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecMemcpyNodeSetParams"),
            GraphExecMemsetNodeSetParams                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecMemsetNodeSetParams"),
            GraphExecHostNodeSetParams                         = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecHostNodeSetParams"),
            GraphExecChildGraphNodeSetParams                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecChildGraphNodeSetParams"),
            GraphExecEventRecordNodeSetEvent                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecEventRecordNodeSetEvent"),
            GraphExecEventWaitNodeSetEvent                     = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecEventWaitNodeSetEvent"),
            GraphExecExternalSemaphoresSignalNodeSetParams     = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecExternalSemaphoresSignalNodeSetParams"),
            GraphExecExternalSemaphoresWaitNodeSetParams       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecExternalSemaphoresWaitNodeSetParams"),
            GraphNodeSetEnabled                                = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeSetEnabled"),
            GraphNodeGetEnabled                                = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeGetEnabled"),
            GraphUpload                                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuGraphUpload")),
            GraphLaunch                                        = apiGetFunctionAddressOptional(NVCUDA, __CUDA_API_PTSZ("cuGraphLaunch")),
            GraphExecDestroy                                   = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecDestroy"),
            GraphDestroy                                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphDestroy"),
            GraphExecUpdate                                    = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecUpdate"),
            GraphExecUpdate_v2                                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecUpdate_v2"),
            GraphKernelNodeCopyAttributes                      = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeCopyAttributes"),
            GraphKernelNodeGetAttribute                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeGetAttribute"),
            GraphKernelNodeSetAttribute                        = apiGetFunctionAddressOptional(NVCUDA, "cuGraphKernelNodeSetAttribute"),
            GraphDebugDotPrint                                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphDebugDotPrint"),
            UserObjectCreate                                   = apiGetFunctionAddressOptional(NVCUDA, "cuUserObjectCreate"),
            UserObjectRetain                                   = apiGetFunctionAddressOptional(NVCUDA, "cuUserObjectRetain"),
            UserObjectRelease                                  = apiGetFunctionAddressOptional(NVCUDA, "cuUserObjectRelease"),
            GraphRetainUserObject                              = apiGetFunctionAddressOptional(NVCUDA, "cuGraphRetainUserObject"),
            GraphReleaseUserObject                             = apiGetFunctionAddressOptional(NVCUDA, "cuGraphReleaseUserObject"),
            GraphAddNode                                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddNode"),
            GraphAddNode_v2                                    = apiGetFunctionAddressOptional(NVCUDA, "cuGraphAddNode_v2"),
            GraphNodeSetParams                                 = apiGetFunctionAddressOptional(NVCUDA, "cuGraphNodeSetParams"),
            GraphExecNodeSetParams                             = apiGetFunctionAddressOptional(NVCUDA, "cuGraphExecNodeSetParams"),
            GraphConditionalHandleCreate                       = apiGetFunctionAddressOptional(NVCUDA, "cuGraphConditionalHandleCreate"),
            OccupancyMaxActiveBlocksPerMultiprocessor          = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyMaxActiveBlocksPerMultiprocessor"),
            OccupancyMaxActiveBlocksPerMultiprocessorWithFlags = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags"),
            OccupancyMaxPotentialBlockSize                     = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyMaxPotentialBlockSize"),
            OccupancyMaxPotentialBlockSizeWithFlags            = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyMaxPotentialBlockSizeWithFlags"),
            OccupancyAvailableDynamicSMemPerBlock              = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyAvailableDynamicSMemPerBlock"),
            OccupancyMaxPotentialClusterSize                   = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyMaxPotentialClusterSize"),
            OccupancyMaxActiveClusters                         = apiGetFunctionAddressOptional(NVCUDA, "cuOccupancyMaxActiveClusters"),
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
            TexObjectCreate                                    = apiGetFunctionAddressOptional(NVCUDA, "cuTexObjectCreate"),
            TexObjectDestroy                                   = apiGetFunctionAddressOptional(NVCUDA, "cuTexObjectDestroy"),
            TexObjectGetResourceDesc                           = apiGetFunctionAddressOptional(NVCUDA, "cuTexObjectGetResourceDesc"),
            TexObjectGetTextureDesc                            = apiGetFunctionAddressOptional(NVCUDA, "cuTexObjectGetTextureDesc"),
            TexObjectGetResourceViewDesc                       = apiGetFunctionAddressOptional(NVCUDA, "cuTexObjectGetResourceViewDesc"),
            SurfObjectCreate                                   = apiGetFunctionAddressOptional(NVCUDA, "cuSurfObjectCreate"),
            SurfObjectDestroy                                  = apiGetFunctionAddressOptional(NVCUDA, "cuSurfObjectDestroy"),
            SurfObjectGetResourceDesc                          = apiGetFunctionAddressOptional(NVCUDA, "cuSurfObjectGetResourceDesc"),
            TensorMapEncodeTiled                               = apiGetFunctionAddressOptional(NVCUDA, "cuTensorMapEncodeTiled"),
            TensorMapEncodeIm2col                              = apiGetFunctionAddressOptional(NVCUDA, "cuTensorMapEncodeIm2col"),
            TensorMapReplaceAddress                            = apiGetFunctionAddressOptional(NVCUDA, "cuTensorMapReplaceAddress"),
            DeviceCanAccessPeer                                = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceCanAccessPeer"),
            CtxEnablePeerAccess                                = apiGetFunctionAddressOptional(NVCUDA, "cuCtxEnablePeerAccess"),
            CtxDisablePeerAccess                               = apiGetFunctionAddressOptional(NVCUDA, "cuCtxDisablePeerAccess"),
            DeviceGetP2PAttribute                              = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetP2PAttribute"),
            GraphicsUnregisterResource                         = apiGetFunctionAddress(NVCUDA, "cuGraphicsUnregisterResource"),
            GraphicsSubResourceGetMappedArray                  = apiGetFunctionAddress(NVCUDA, "cuGraphicsSubResourceGetMappedArray"),
            GraphicsResourceGetMappedMipmappedArray            = apiGetFunctionAddressOptional(NVCUDA, "cuGraphicsResourceGetMappedMipmappedArray"),
            GraphicsResourceGetMappedPointer                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuGraphicsResourceGetMappedPointer", 2)),
            GraphicsResourceSetMapFlags                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuGraphicsResourceSetMapFlags", 2)),
            GraphicsMapResources                               = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuGraphicsMapResources")),
            GraphicsUnmapResources                             = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuGraphicsUnmapResources")),
            GetProcAddress                                     = apiGetFunctionAddressOptional(NVCUDA, "cuGetProcAddress"),
            GetProcAddress_v2                                  = apiGetFunctionAddressOptional(NVCUDA, "cuGetProcAddress_v2"),
            CoredumpGetAttribute                               = apiGetFunctionAddressOptional(NVCUDA, "cuCoredumpGetAttribute"),
            CoredumpGetAttributeGlobal                         = apiGetFunctionAddressOptional(NVCUDA, "cuCoredumpGetAttributeGlobal"),
            CoredumpSetAttribute                               = apiGetFunctionAddressOptional(NVCUDA, "cuCoredumpSetAttribute"),
            CoredumpSetAttributeGlobal                         = apiGetFunctionAddressOptional(NVCUDA, "cuCoredumpSetAttributeGlobal"),
            GetExportTable                                     = apiGetFunctionAddress(NVCUDA, "cuGetExportTable"),
            GreenCtxCreate                                     = apiGetFunctionAddressOptional(NVCUDA, "cuGreenCtxCreate"),
            GreenCtxDestroy                                    = apiGetFunctionAddressOptional(NVCUDA, "cuGreenCtxDestroy"),
            CtxFromGreenCtx                                    = apiGetFunctionAddressOptional(NVCUDA, "cuCtxFromGreenCtx"),
            DeviceGetDevResource                               = apiGetFunctionAddressOptional(NVCUDA, "cuDeviceGetDevResource"),
            CtxGetDevResource                                  = apiGetFunctionAddressOptional(NVCUDA, "cuCtxGetDevResource"),
            GreenCtxGetDevResource                             = apiGetFunctionAddressOptional(NVCUDA, "cuGreenCtxGetDevResource"),
            DevSmResourceSplitByCount                          = apiGetFunctionAddressOptional(NVCUDA, "cuDevSmResourceSplitByCount"),
            DevResourceGenerateDesc                            = apiGetFunctionAddressOptional(NVCUDA, "cuDevResourceGenerateDesc"),
            GreenCtxRecordEvent                                = apiGetFunctionAddressOptional(NVCUDA, "cuGreenCtxRecordEvent"),
            GreenCtxWaitEvent                                  = apiGetFunctionAddressOptional(NVCUDA, "cuGreenCtxWaitEvent"),
            StreamGetGreenCtx                                  = apiGetFunctionAddressOptional(NVCUDA, "cuStreamGetGreenCtx"),
            GreenCtxStreamCreate                               = apiGetFunctionAddressOptional(NVCUDA, "cuGreenCtxStreamCreate");

    }

    /** Returns the NVCUDA {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVCUDA;
    }

    public static final int CU_CUDA_VERSION = 12050;

    public static final int CU_IPC_HANDLE_SIZE = 64;

    public static final int CU_IPC_MEM_LAZY_ENABLE_PEER_ACCESS = 0x1;

    public static final int
        CU_MEM_ATTACH_GLOBAL = 0x1,
        CU_MEM_ATTACH_HOST   = 0x2,
        CU_MEM_ATTACH_SINGLE = 0x4;

    public static final int
        CU_CTX_SCHED_AUTO           = 0x0,
        CU_CTX_SCHED_SPIN           = 0x1,
        CU_CTX_SCHED_YIELD          = 0x2,
        CU_CTX_SCHED_BLOCKING_SYNC  = 0x4,
        CU_CTX_BLOCKING_SYNC        = 0x4,
        CU_CTX_SCHED_MASK           = 0x7,
        CU_CTX_MAP_HOST             = 0x8,
        CU_CTX_LMEM_RESIZE_TO_MAX   = 0x10,
        CU_CTX_COREDUMP_ENABLE      = 0x20,
        CU_CTX_USER_COREDUMP_ENABLE = 0x40,
        CU_CTX_SYNC_MEMOPS          = 0x80,
        CU_CTX_FLAGS_MASK           = 0xFF;

    public static final int
        CU_EVENT_SCHED_AUTO          = 0x0,
        CU_EVENT_SCHED_SPIN          = 0x1,
        CU_EVENT_SCHED_YIELD         = 0x2,
        CU_EVENT_SCHED_BLOCKING_SYNC = 0x4;

    public static final int
        NVCL_EVENT_SCHED_AUTO          = 0x0,
        NVCL_EVENT_SCHED_SPIN          = 0x1,
        NVCL_EVENT_SCHED_YIELD         = 0x2,
        NVCL_EVENT_SCHED_BLOCKING_SYNC = 0x4;

    public static final int
        NVCL_CTX_SCHED_AUTO          = 0x0,
        NVCL_CTX_SCHED_SPIN          = 0x1,
        NVCL_CTX_SCHED_YIELD         = 0x2,
        NVCL_CTX_SCHED_BLOCKING_SYNC = 0x4;

    public static final int
        CU_STREAM_DEFAULT      = 0x0,
        CU_STREAM_NON_BLOCKING = 0x1;

    public static final long
        CU_STREAM_LEGACY     = 0x1L,
        CU_STREAM_PER_THREAD = 0x2L;

    public static final int
        CU_EVENT_DEFAULT        = 0x0,
        CU_EVENT_BLOCKING_SYNC  = 0x1,
        CU_EVENT_DISABLE_TIMING = 0x2,
        CU_EVENT_INTERPROCESS   = 0x4;

    public static final int
        CU_EVENT_RECORD_DEFAULT  = 0x0,
        CU_EVENT_RECORD_EXTERNAL = 0x1;

    public static final int
        CU_EVENT_WAIT_DEFAULT  = 0x0,
        CU_EVENT_WAIT_EXTERNAL = 0x1;

    public static final int
        CU_STREAM_WAIT_VALUE_GEQ   = 0x0,
        CU_STREAM_WAIT_VALUE_EQ    = 0x1,
        CU_STREAM_WAIT_VALUE_AND   = 0x2,
        CU_STREAM_WAIT_VALUE_NOR   = 0x3,
        CU_STREAM_WAIT_VALUE_FLUSH = 1<<30;

    public static final int
        CU_STREAM_WRITE_VALUE_DEFAULT           = 0x0,
        CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER = 0x1;

    public static final int
        CU_STREAM_MEM_OP_WAIT_VALUE_32       = 1,
        CU_STREAM_MEM_OP_WRITE_VALUE_32      = 2,
        CU_STREAM_MEM_OP_WAIT_VALUE_64       = 4,
        CU_STREAM_MEM_OP_WRITE_VALUE_64      = 5,
        CU_STREAM_MEM_OP_BARRIER             = 6,
        CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES = 3;

    public static final int
        CU_STREAM_MEMORY_BARRIER_TYPE_SYS = 0x0,
        CU_STREAM_MEMORY_BARRIER_TYPE_GPU = 0x1;

    public static final int
        CU_OCCUPANCY_DEFAULT                  = 0x0,
        CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE = 0x1;

    public static final int
        CU_STREAM_ADD_CAPTURE_DEPENDENCIES = 0x0,
        CU_STREAM_SET_CAPTURE_DEPENDENCIES = 0x1;

    public static final int CU_ASYNC_NOTIFICATION_TYPE_OVER_BUDGET = 0x1;

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
        CU_AD_FORMAT_BC7_UNORM_SRGB = 0x9e,
        CU_AD_FORMAT_P010           = 0x9f,
        CU_AD_FORMAT_P016           = 0xa1,
        CU_AD_FORMAT_NV16           = 0xa2,
        CU_AD_FORMAT_P210           = 0xa3,
        CU_AD_FORMAT_P216           = 0xa4,
        CU_AD_FORMAT_YUY2           = 0xa5,
        CU_AD_FORMAT_Y210           = 0xa6,
        CU_AD_FORMAT_Y216           = 0xa7,
        CU_AD_FORMAT_AYUV           = 0xa8,
        CU_AD_FORMAT_Y410           = 0xa9,
        CU_AD_FORMAT_Y416           = 0xb1,
        CU_AD_FORMAT_Y444_PLANAR8   = 0xb2,
        CU_AD_FORMAT_Y444_PLANAR10  = 0xb3;

    public static final int
        CU_TR_ADDRESS_MODE_WRAP   = 0x0,
        CU_TR_ADDRESS_MODE_CLAMP  = 0x1,
        CU_TR_ADDRESS_MODE_MIRROR = 0x2,
        CU_TR_ADDRESS_MODE_BORDER = 0x3;

    public static final int
        CU_TR_FILTER_MODE_POINT  = 0x0,
        CU_TR_FILTER_MODE_LINEAR = 0x1;

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
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS_V1                    = 92,
        CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS_V1             = 93,
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR_V1             = 94,
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
        CU_DEVICE_ATTRIBUTE_MEMPOOL_SUPPORTED_HANDLE_TYPES               = 119,
        CU_DEVICE_ATTRIBUTE_CLUSTER_LAUNCH                               = 120,
        CU_DEVICE_ATTRIBUTE_DEFERRED_MAPPING_CUDA_ARRAY_SUPPORTED        = 121,
        CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS                = 122,
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR                = 123,
        CU_DEVICE_ATTRIBUTE_DMA_BUF_SUPPORTED                            = 124,
        CU_DEVICE_ATTRIBUTE_IPC_EVENT_SUPPORTED                          = 125,
        CU_DEVICE_ATTRIBUTE_MEM_SYNC_DOMAIN_COUNT                        = 126,
        CU_DEVICE_ATTRIBUTE_TENSOR_MAP_ACCESS_SUPPORTED                  = 127,
        CU_DEVICE_ATTRIBUTE_HANDLE_TYPE_FABRIC_SUPPORTED                 = 128,
        CU_DEVICE_ATTRIBUTE_UNIFIED_FUNCTION_POINTERS                    = 129,
        CU_DEVICE_ATTRIBUTE_NUMA_CONFIG                                  = 130,
        CU_DEVICE_ATTRIBUTE_NUMA_ID                                      = 131,
        CU_DEVICE_ATTRIBUTE_MULTICAST_SUPPORTED                          = 132,
        CU_DEVICE_ATTRIBUTE_MPS_ENABLED                                  = 133,
        CU_DEVICE_ATTRIBUTE_HOST_NUMA_ID                                 = 134,
        CU_DEVICE_ATTRIBUTE_D3D12_CIG_SUPPORTED                          = 135;

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
        CU_POINTER_ATTRIBUTE_MEMPOOL_HANDLE             = 17,
        CU_POINTER_ATTRIBUTE_MAPPING_SIZE               = 18,
        CU_POINTER_ATTRIBUTE_MAPPING_BASE_ADDR          = 19,
        CU_POINTER_ATTRIBUTE_MEMORY_BLOCK_ID            = 20;

    public static final int
        CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK                = 0,
        CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES                    = 1,
        CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES                     = 2,
        CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES                     = 3,
        CU_FUNC_ATTRIBUTE_NUM_REGS                             = 4,
        CU_FUNC_ATTRIBUTE_PTX_VERSION                          = 5,
        CU_FUNC_ATTRIBUTE_BINARY_VERSION                       = 6,
        CU_FUNC_ATTRIBUTE_CACHE_MODE_CA                        = 7,
        CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES        = 8,
        CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT     = 9,
        CU_FUNC_ATTRIBUTE_CLUSTER_SIZE_MUST_BE_SET             = 10,
        CU_FUNC_ATTRIBUTE_REQUIRED_CLUSTER_WIDTH               = 11,
        CU_FUNC_ATTRIBUTE_REQUIRED_CLUSTER_HEIGHT              = 12,
        CU_FUNC_ATTRIBUTE_REQUIRED_CLUSTER_DEPTH               = 13,
        CU_FUNC_ATTRIBUTE_NON_PORTABLE_CLUSTER_SIZE_ALLOWED    = 14,
        CU_FUNC_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE = 15;

    public static final int
        CU_FUNC_CACHE_PREFER_NONE   = 0x0,
        CU_FUNC_CACHE_PREFER_SHARED = 0x1,
        CU_FUNC_CACHE_PREFER_L1     = 0x2,
        CU_FUNC_CACHE_PREFER_EQUAL  = 0x3;

    public static final int
        CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE    = 0x0,
        CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE  = 0x1,
        CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE = 0x2;

    public static final int
        CU_SHAREDMEM_CARVEOUT_DEFAULT    = 0xFFFFFFFF,
        CU_SHAREDMEM_CARVEOUT_MAX_SHARED = 0x64,
        CU_SHAREDMEM_CARVEOUT_MAX_L1     = 0x0;

    public static final int
        CU_MEMORYTYPE_HOST    = 0x1,
        CU_MEMORYTYPE_DEVICE  = 0x2,
        CU_MEMORYTYPE_ARRAY   = 0x3,
        CU_MEMORYTYPE_UNIFIED = 0x4;

    public static final int
        CU_COMPUTEMODE_DEFAULT           = 0x0,
        CU_COMPUTEMODE_PROHIBITED        = 0x2,
        CU_COMPUTEMODE_EXCLUSIVE_PROCESS = 0x3;

    public static final int
        CU_MEM_ADVISE_SET_READ_MOSTLY          = 0x1,
        CU_MEM_ADVISE_UNSET_READ_MOSTLY        = 0x2,
        CU_MEM_ADVISE_SET_PREFERRED_LOCATION   = 0x3,
        CU_MEM_ADVISE_UNSET_PREFERRED_LOCATION = 0x4,
        CU_MEM_ADVISE_SET_ACCESSED_BY          = 0x5,
        CU_MEM_ADVISE_UNSET_ACCESSED_BY        = 0x6;

    public static final int
        CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY                 = 1,
        CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION          = 2,
        CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY                 = 3,
        CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION      = 4,
        CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION_TYPE     = 5,
        CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION_ID       = 6,
        CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION_TYPE = 7,
        CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION_ID   = 8;

    public static final int
        CU_JIT_MAX_REGISTERS                    = 0,
        CU_JIT_THREADS_PER_BLOCK                = 1,
        CU_JIT_WALL_TIME                        = 2,
        CU_JIT_INFO_LOG_BUFFER                  = 3,
        CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES       = 4,
        CU_JIT_ERROR_LOG_BUFFER                 = 5,
        CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES      = 6,
        CU_JIT_OPTIMIZATION_LEVEL               = 7,
        CU_JIT_TARGET_FROM_CUCONTEXT            = 8,
        CU_JIT_TARGET                           = 9,
        CU_JIT_FALLBACK_STRATEGY                = 10,
        CU_JIT_GENERATE_DEBUG_INFO              = 11,
        CU_JIT_LOG_VERBOSE                      = 12,
        CU_JIT_GENERATE_LINE_INFO               = 13,
        CU_JIT_CACHE_MODE                       = 14,
        CU_JIT_NEW_SM3X_OPT                     = 15,
        CU_JIT_FAST_COMPILE                     = 16,
        CU_JIT_GLOBAL_SYMBOL_NAMES              = 17,
        CU_JIT_GLOBAL_SYMBOL_ADDRESSES          = 18,
        CU_JIT_GLOBAL_SYMBOL_COUNT              = 19,
        CU_JIT_LTO                              = 20,
        CU_JIT_FTZ                              = 21,
        CU_JIT_PREC_DIV                         = 22,
        CU_JIT_PREC_SQRT                        = 23,
        CU_JIT_FMA                              = 24,
        CU_JIT_REFERENCED_KERNEL_NAMES          = 25,
        CU_JIT_REFERENCED_KERNEL_COUNT          = 26,
        CU_JIT_REFERENCED_VARIABLE_NAMES        = 27,
        CU_JIT_REFERENCED_VARIABLE_COUNT        = 28,
        CU_JIT_OPTIMIZE_UNUSED_DEVICE_VARIABLES = 29,
        CU_JIT_POSITION_INDEPENDENT_CODE        = 30,
        CU_JIT_MIN_CTA_PER_SM                   = 31,
        CU_JIT_MAX_THREADS_PER_BLOCK            = 32,
        CU_JIT_OVERRIDE_DIRECTIVE_VALUES        = 33,
        CU_JIT_NUM_OPTIONS                      = 34;

    public static final int CU_COMPUTE_ACCELERATED_TARGET_BASE = 0x10000;

    public static final int
        CU_TARGET_COMPUTE_20  = 20,
        CU_TARGET_COMPUTE_21  = 21,
        CU_TARGET_COMPUTE_30  = 30,
        CU_TARGET_COMPUTE_32  = 32,
        CU_TARGET_COMPUTE_35  = 35,
        CU_TARGET_COMPUTE_37  = 37,
        CU_TARGET_COMPUTE_50  = 50,
        CU_TARGET_COMPUTE_52  = 52,
        CU_TARGET_COMPUTE_53  = 53,
        CU_TARGET_COMPUTE_60  = 60,
        CU_TARGET_COMPUTE_61  = 61,
        CU_TARGET_COMPUTE_62  = 62,
        CU_TARGET_COMPUTE_70  = 70,
        CU_TARGET_COMPUTE_72  = 72,
        CU_TARGET_COMPUTE_75  = 75,
        CU_TARGET_COMPUTE_80  = 80,
        CU_TARGET_COMPUTE_86  = 86,
        CU_TARGET_COMPUTE_87  = 87,
        CU_TARGET_COMPUTE_89  = 89,
        CU_TARGET_COMPUTE_90  = 90,
        CU_TARGET_COMPUTE_90A = CU_COMPUTE_ACCELERATED_TARGET_BASE + CU_TARGET_COMPUTE_90;

    public static final int
        CU_PREFER_PTX    = 0x0,
        CU_PREFER_BINARY = 0x1;

    public static final int
        CU_JIT_CACHE_OPTION_NONE = 0x0,
        CU_JIT_CACHE_OPTION_CG   = 0x1,
        CU_JIT_CACHE_OPTION_CA   = 0x2;

    public static final int
        CU_JIT_INPUT_CUBIN     = 0,
        CU_JIT_INPUT_PTX       = 1,
        CU_JIT_INPUT_FATBINARY = 2,
        CU_JIT_INPUT_OBJECT    = 3,
        CU_JIT_INPUT_LIBRARY   = 4,
        CU_JIT_INPUT_NVVM      = 5,
        CU_JIT_NUM_INPUT_TYPES = 6;

    public static final int
        CU_GRAPHICS_REGISTER_FLAGS_NONE           = 0x0,
        CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY      = 0x1,
        CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD  = 0x2,
        CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST   = 0x4,
        CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER = 0x8;

    public static final int
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE          = 0x0,
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY     = 0x1,
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD = 0x2;

    public static final int
        CU_CUBEMAP_FACE_POSITIVE_X = 0x0,
        CU_CUBEMAP_FACE_NEGATIVE_X = 0x1,
        CU_CUBEMAP_FACE_POSITIVE_Y = 0x2,
        CU_CUBEMAP_FACE_NEGATIVE_Y = 0x3,
        CU_CUBEMAP_FACE_POSITIVE_Z = 0x4,
        CU_CUBEMAP_FACE_NEGATIVE_Z = 0x5;

    public static final int
        CU_LIMIT_STACK_SIZE                       = 0x00,
        CU_LIMIT_PRINTF_FIFO_SIZE                 = 0x01,
        CU_LIMIT_MALLOC_HEAP_SIZE                 = 0x02,
        CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH           = 0x03,
        CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT = 0x04,
        CU_LIMIT_MAX_L2_FETCH_GRANULARITY         = 0x05,
        CU_LIMIT_PERSISTING_L2_CACHE_SIZE         = 0x06,
        CU_LIMIT_SHMEM_SIZE                       = 0x07,
        CU_LIMIT_CIG_ENABLED                      = 0x08,
        CU_LIMIT_CIG_SHMEM_FALLBACK_ENABLED       = 0x09;

    public static final int
        CU_RESOURCE_TYPE_ARRAY           = 0x0,
        CU_RESOURCE_TYPE_MIPMAPPED_ARRAY = 0x1,
        CU_RESOURCE_TYPE_LINEAR          = 0x2,
        CU_RESOURCE_TYPE_PITCH2D         = 0x3;

    public static final int
        CU_ACCESS_PROPERTY_NORMAL     = 0,
        CU_ACCESS_PROPERTY_STREAMING  = 1,
        CU_ACCESS_PROPERTY_PERSISTING = 2;

    public static final int CU_GRAPH_COND_ASSIGN_DEFAULT = 0x1;

    public static final int
        CU_GRAPH_COND_TYPE_IF    = 0,
        CU_GRAPH_COND_TYPE_WHILE = 1;

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
        CU_GRAPH_NODE_TYPE_MEM_FREE         = 11,
        CU_GRAPH_NODE_TYPE_BATCH_MEM_OP     = 12,
        CU_GRAPH_NODE_TYPE_CONDITIONAL      = 13;

    public static final int
        CU_GRAPH_DEPENDENCY_TYPE_DEFAULT      = 0,
        CU_GRAPH_DEPENDENCY_TYPE_PROGRAMMATIC = 1;

    public static final int
        CU_GRAPH_KERNEL_NODE_PORT_DEFAULT      = 0,
        CU_GRAPH_KERNEL_NODE_PORT_PROGRAMMATIC = 1,
        CU_GRAPH_KERNEL_NODE_PORT_LAUNCH_ORDER = 2;

    public static final int
        CUDA_GRAPH_INSTANTIATE_SUCCESS                      = 0,
        CUDA_GRAPH_INSTANTIATE_ERROR                        = 1,
        CUDA_GRAPH_INSTANTIATE_INVALID_STRUCTURE            = 2,
        CUDA_GRAPH_INSTANTIATE_NODE_OPERATION_NOT_SUPPORTED = 3,
        CUDA_GRAPH_INSTANTIATE_MULTIPLE_CTXS_NOT_SUPPORTED  = 4;

    public static final int
        CU_SYNC_POLICY_AUTO          = 1,
        CU_SYNC_POLICY_SPIN          = 2,
        CU_SYNC_POLICY_YIELD         = 3,
        CU_SYNC_POLICY_BLOCKING_SYNC = 4;

    public static final int
        CU_CLUSTER_SCHEDULING_POLICY_DEFAULT        = 0,
        CU_CLUSTER_SCHEDULING_POLICY_SPREAD         = 1,
        CU_CLUSTER_SCHEDULING_POLICY_LOAD_BALANCING = 2;

    public static final int
        CU_LAUNCH_MEM_SYNC_DOMAIN_DEFAULT = 0,
        CU_LAUNCH_MEM_SYNC_DOMAIN_REMOTE  = 1;

    public static final int
        CU_LAUNCH_ATTRIBUTE_IGNORE                               = 0,
        CU_LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW                 = 1,
        CU_LAUNCH_ATTRIBUTE_COOPERATIVE                          = 2,
        CU_LAUNCH_ATTRIBUTE_SYNCHRONIZATION_POLICY               = 3,
        CU_LAUNCH_ATTRIBUTE_CLUSTER_DIMENSION                    = 4,
        CU_LAUNCH_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE = 5,
        CU_LAUNCH_ATTRIBUTE_PROGRAMMATIC_STREAM_SERIALIZATION    = 6,
        CU_LAUNCH_ATTRIBUTE_PROGRAMMATIC_EVENT                   = 7,
        CU_LAUNCH_ATTRIBUTE_PRIORITY                             = 8,
        CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP                  = 9,
        CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN                      = 10,
        CU_LAUNCH_ATTRIBUTE_LAUNCH_COMPLETION_EVENT              = 12,
        CU_LAUNCH_ATTRIBUTE_DEVICE_UPDATABLE_KERNEL_NODE         = 13,
        CU_LAUNCH_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT     = 14;

    public static final int
        CU_KERNEL_NODE_ATTRIBUTE_ACCESS_POLICY_WINDOW                 = CU_LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW,
        CU_KERNEL_NODE_ATTRIBUTE_COOPERATIVE                          = CU_LAUNCH_ATTRIBUTE_COOPERATIVE,
        CU_KERNEL_NODE_ATTRIBUTE_CLUSTER_DIMENSION                    = CU_LAUNCH_ATTRIBUTE_CLUSTER_DIMENSION,
        CU_KERNEL_NODE_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE = CU_LAUNCH_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE,
        CU_KERNEL_NODE_ATTRIBUTE_PRIORITY                             = CU_LAUNCH_ATTRIBUTE_PRIORITY,
        CU_KERNEL_NODE_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP                  = CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP,
        CU_KERNEL_NODE_ATTRIBUTE_MEM_SYNC_DOMAIN                      = CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN,
        CU_KERNEL_NODE_ATTRIBUTE_DEVICE_UPDATABLE_KERNEL_NODE         = CU_LAUNCH_ATTRIBUTE_DEVICE_UPDATABLE_KERNEL_NODE,
        CU_KERNEL_NODE_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT     = CU_LAUNCH_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT;

    public static final int
        CU_STREAM_CAPTURE_STATUS_NONE        = 0x0,
        CU_STREAM_CAPTURE_STATUS_ACTIVE      = 0x1,
        CU_STREAM_CAPTURE_STATUS_INVALIDATED = 0x2;

    public static final int
        CU_STREAM_CAPTURE_MODE_GLOBAL       = 0,
        CU_STREAM_CAPTURE_MODE_THREAD_LOCAL = 1,
        CU_STREAM_CAPTURE_MODE_RELAXED      = 2;

    public static final int
        CU_STREAM_ATTRIBUTE_ACCESS_POLICY_WINDOW   = CU_LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW,
        CU_STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY = CU_LAUNCH_ATTRIBUTE_SYNCHRONIZATION_POLICY,
        CU_STREAM_ATTRIBUTE_PRIORITY               = CU_LAUNCH_ATTRIBUTE_PRIORITY,
        CU_STREAM_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP    = CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP,
        CU_STREAM_ATTRIBUTE_MEM_SYNC_DOMAIN        = CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN;

    public static final int
        CU_GET_PROC_ADDRESS_DEFAULT                   = 0,
        CU_GET_PROC_ADDRESS_LEGACY_STREAM             = 1 << 0,
        CU_GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM = 1 << 1;

    public static final int
        CU_GET_PROC_ADDRESS_SUCCESS                = 0,
        CU_GET_PROC_ADDRESS_SYMBOL_NOT_FOUND       = 1,
        CU_GET_PROC_ADDRESS_VERSION_NOT_SUFFICIENT = 2;

    public static final int
        CU_EXEC_AFFINITY_TYPE_SM_COUNT = 0,
        CU_EXEC_AFFINITY_TYPE_MAX      = 1;

    public static final int CU_DATA_TYPE_D3D12_COMMAND_QUEUE = 0x1;

    public static final int
        CU_LIBRARY_HOST_UNIVERSAL_FUNCTION_AND_DATA_TABLE = 0,
        CU_LIBRARY_BINARY_IS_PRESERVED                    = 1,
        CU_LIBRARY_NUM_OPTIONS                            = 2;

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
        CUDA_ERROR_DEVICE_UNAVAILABLE             = 46,
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
        CUDA_ERROR_UNSUPPORTED_DEVSIDE_SYNC       = 225,
        CUDA_ERROR_INVALID_SOURCE                 = 300,
        CUDA_ERROR_FILE_NOT_FOUND                 = 301,
        CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND = 302,
        CUDA_ERROR_SHARED_OBJECT_INIT_FAILED      = 303,
        CUDA_ERROR_OPERATING_SYSTEM               = 304,
        CUDA_ERROR_INVALID_HANDLE                 = 400,
        CUDA_ERROR_ILLEGAL_STATE                  = 401,
        CUDA_ERROR_LOSSY_QUERY                    = 402,
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
        CUDA_ERROR_MPS_CLIENT_TERMINATED          = 810,
        CUDA_ERROR_CDP_NOT_SUPPORTED              = 811,
        CUDA_ERROR_CDP_VERSION_MISMATCH           = 812,
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
        CUDA_ERROR_INVALID_CLUSTER_SIZE           = 912,
        CUDA_ERROR_FUNCTION_NOT_LOADED            = 913,
        CUDA_ERROR_INVALID_RESOURCE_TYPE          = 914,
        CUDA_ERROR_INVALID_RESOURCE_CONFIGURATION = 915,
        CUDA_ERROR_UNKNOWN                        = 999;

    public static final int
        CU_DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK            = 0x1,
        CU_DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED            = 0x2,
        CU_DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED     = 0x3,
        CU_DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED     = 0x4,
        CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED = 0x4;

    public static final int
        CU_MEMHOSTALLOC_PORTABLE      = 0x1,
        CU_MEMHOSTALLOC_DEVICEMAP     = 0x2,
        CU_MEMHOSTALLOC_WRITECOMBINED = 0x4;

    public static final int
        CU_MEMHOSTREGISTER_PORTABLE  = 0x01,
        CU_MEMHOSTREGISTER_DEVICEMAP = 0x02,
        CU_MEMHOSTREGISTER_IOMEMORY  = 0x04,
        CU_MEMHOSTREGISTER_READ_ONLY = 0x08;

    public static final int CU_ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL = 0x1;

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

    public static final int CU_TENSOR_MAP_NUM_QWORDS = 16;

    public static final int
        CU_TENSOR_MAP_DATA_TYPE_UINT8        = 0,
        CU_TENSOR_MAP_DATA_TYPE_UINT16       = 1,
        CU_TENSOR_MAP_DATA_TYPE_UINT32       = 2,
        CU_TENSOR_MAP_DATA_TYPE_INT32        = 3,
        CU_TENSOR_MAP_DATA_TYPE_UINT64       = 4,
        CU_TENSOR_MAP_DATA_TYPE_INT64        = 5,
        CU_TENSOR_MAP_DATA_TYPE_FLOAT16      = 6,
        CU_TENSOR_MAP_DATA_TYPE_FLOAT32      = 7,
        CU_TENSOR_MAP_DATA_TYPE_FLOAT64      = 8,
        CU_TENSOR_MAP_DATA_TYPE_BFLOAT16     = 9,
        CU_TENSOR_MAP_DATA_TYPE_FLOAT32_FTZ  = 10,
        CU_TENSOR_MAP_DATA_TYPE_TFLOAT32     = 11,
        CU_TENSOR_MAP_DATA_TYPE_TFLOAT32_FTZ = 12;

    public static final int
        CU_TENSOR_MAP_INTERLEAVE_NONE = 0,
        CU_TENSOR_MAP_INTERLEAVE_16B  = 1,
        CU_TENSOR_MAP_INTERLEAVE_32B  = 2;

    public static final int
        CU_TENSOR_MAP_SWIZZLE_NONE = 0,
        CU_TENSOR_MAP_SWIZZLE_32B  = 1,
        CU_TENSOR_MAP_SWIZZLE_64B  = 2,
        CU_TENSOR_MAP_SWIZZLE_128B = 3;

    public static final int
        CU_TENSOR_MAP_L2_PROMOTION_NONE    = 0,
        CU_TENSOR_MAP_L2_PROMOTION_L2_64B  = 1,
        CU_TENSOR_MAP_L2_PROMOTION_L2_128B = 2,
        CU_TENSOR_MAP_L2_PROMOTION_L2_256B = 3;

    public static final int
        CU_TENSOR_MAP_FLOAT_OOB_FILL_NONE                 = 0,
        CU_TENSOR_MAP_FLOAT_OOB_FILL_NAN_REQUEST_ZERO_FMA = 1;

    public static final int
        CU_POINTER_ATTRIBUTE_ACCESS_FLAG_NONE      = 0x0,
        CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READ      = 0x1,
        CU_POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE = 0x3;

    public static final int
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD          = 1,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32       = 2,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT   = 3,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP         = 4,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE     = 5,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE     = 6,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT = 7,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF           = 8;

    public static final int CUDA_EXTERNAL_MEMORY_DEDICATED = 0x1;

    public static final int
        CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC = 0x01,
        CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC   = 0x02;

    public static final int
        CUDA_NVSCISYNC_ATTR_SIGNAL = 0x1,
        CUDA_NVSCISYNC_ATTR_WAIT   = 0x2;

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

    public static final int
        CU_MEM_HANDLE_TYPE_NONE                  = 0x0,
        CU_MEM_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR = 0x1,
        CU_MEM_HANDLE_TYPE_WIN32                 = 0x2,
        CU_MEM_HANDLE_TYPE_WIN32_KMT             = 0x4,
        CU_MEM_HANDLE_TYPE_FABRIC                = 0x8;

    public static final int
        CU_MEM_ACCESS_FLAGS_PROT_NONE      = 0x0,
        CU_MEM_ACCESS_FLAGS_PROT_READ      = 0x1,
        CU_MEM_ACCESS_FLAGS_PROT_READWRITE = 0x3;

    public static final int
        CU_MEM_LOCATION_TYPE_INVALID           = 0x0,
        CU_MEM_LOCATION_TYPE_DEVICE            = 0x1,
        CU_MEM_LOCATION_TYPE_HOST              = 0x2,
        CU_MEM_LOCATION_TYPE_HOST_NUMA         = 0x3,
        CU_MEM_LOCATION_TYPE_HOST_NUMA_CURRENT = 0x4;

    public static final int
        CU_MEM_ALLOCATION_TYPE_INVALID = 0x0,
        CU_MEM_ALLOCATION_TYPE_PINNED  = 0x1;

    public static final int
        CU_MEM_ALLOC_GRANULARITY_MINIMUM     = 0x0,
        CU_MEM_ALLOC_GRANULARITY_RECOMMENDED = 0x1;

    public static final int
        CU_MEM_RANGE_HANDLE_TYPE_DMA_BUF_FD = 0x1,
        CU_MEM_RANGE_HANDLE_TYPE_MAX        = 0x7FFFFFFF;

    public static final int
        CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL = 0,
        CU_ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL      = 1;

    public static final int
        CU_MEM_OPERATION_TYPE_MAP   = 1,
        CU_MEM_OPERATION_TYPE_UNMAP = 2;

    public static final int CU_MEM_HANDLE_TYPE_GENERIC = 0;

    public static final int
        CU_MEM_ALLOCATION_COMP_NONE    = 0x0,
        CU_MEM_ALLOCATION_COMP_GENERIC = 0x1;

    public static final int CU_MEM_CREATE_USAGE_TILE_POOL = 0x1;

    public static final int
        CU_MULTICAST_GRANULARITY_MINIMUM     = 0x0,
        CU_MULTICAST_GRANULARITY_RECOMMENDED = 0x1;

    public static final int
        CU_GRAPH_EXEC_UPDATE_SUCCESS                           = 0x0,
        CU_GRAPH_EXEC_UPDATE_ERROR                             = 0x1,
        CU_GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED            = 0x2,
        CU_GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED           = 0x3,
        CU_GRAPH_EXEC_UPDATE_ERROR_FUNCTION_CHANGED            = 0x4,
        CU_GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED          = 0x5,
        CU_GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED               = 0x6,
        CU_GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE = 0x7,
        CU_GRAPH_EXEC_UPDATE_ERROR_ATTRIBUTES_CHANGED          = 0x8;

    public static final int
        CU_MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES   = 1,
        CU_MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC         = 2,
        CU_MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES = 3,
        CU_MEMPOOL_ATTR_RELEASE_THRESHOLD                 = 4,
        CU_MEMPOOL_ATTR_RESERVED_MEM_CURRENT              = 5,
        CU_MEMPOOL_ATTR_RESERVED_MEM_HIGH                 = 6,
        CU_MEMPOOL_ATTR_USED_MEM_CURRENT                  = 7,
        CU_MEMPOOL_ATTR_USED_MEM_HIGH                     = 8;

    public static final int
        CU_GRAPH_MEM_ATTR_USED_MEM_CURRENT     = 0,
        CU_GRAPH_MEM_ATTR_USED_MEM_HIGH        = 1,
        CU_GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT = 2,
        CU_GRAPH_MEM_ATTR_RESERVED_MEM_HIGH    = 3;

    public static final int
        CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC  = 0x1,
        CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC = 0x2;

    public static final int
        CUDA_ARRAY3D_LAYERED             = 0x01,
        CUDA_ARRAY3D_2DARRAY             = 0x01,
        CUDA_ARRAY3D_SURFACE_LDST        = 0x02,
        CUDA_ARRAY3D_CUBEMAP             = 0x04,
        CUDA_ARRAY3D_TEXTURE_GATHER      = 0x08,
        CUDA_ARRAY3D_DEPTH_TEXTURE       = 0x10,
        CUDA_ARRAY3D_COLOR_ATTACHMENT    = 0x20,
        CUDA_ARRAY3D_SPARSE              = 0x40,
        CUDA_ARRAY3D_DEFERRED_MAPPING    = 0x80,
        CUDA_ARRAY3D_VIDEO_ENCODE_DECODE = 0x100;

    public static final int CU_TRSA_OVERRIDE_FORMAT = 0x1;

    public static final int
        CU_TRSF_READ_AS_INTEGER                = 0x01,
        CU_TRSF_NORMALIZED_COORDINATES         = 0x02,
        CU_TRSF_SRGB                           = 0x10,
        CU_TRSF_DISABLE_TRILINEAR_OPTIMIZATION = 0x20,
        CU_TRSF_SEAMLESS_CUBEMAP               = 0x40;

    public static final long
        CU_LAUNCH_PARAM_END            = 0x0L,
        CU_LAUNCH_PARAM_BUFFER_POINTER = 0x1L,
        CU_LAUNCH_PARAM_BUFFER_SIZE    = 0x2L;

    public static final int CU_PARAM_TR_DEFAULT = -1;

    public static final int
        CU_DEVICE_CPU     = -1,
        CU_DEVICE_INVALID = -2;

    public static final int
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_HOST   = 1<<0,
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_MEMOPS = 1<<1;

    public static final int
        CU_GPU_DIRECT_RDMA_WRITES_ORDERING_NONE        = 0,
        CU_GPU_DIRECT_RDMA_WRITES_ORDERING_OWNER       = 100,
        CU_GPU_DIRECT_RDMA_WRITES_ORDERING_ALL_DEVICES = 200;

    public static final int
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TO_OWNER       = 100,
        CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TO_ALL_DEVICES = 200;

    public static final int CU_FLUSH_GPU_DIRECT_RDMA_WRITES_TARGET_CURRENT_CTX = 0;

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
        CU_GRAPH_DEBUG_DOT_FLAGS_MEM_FREE_NODE_PARAMS         = 1<<12,
        CU_GRAPH_DEBUG_DOT_FLAGS_BATCH_MEM_OP_NODE_PARAMS     = 1<<13,
        CU_GRAPH_DEBUG_DOT_FLAGS_EXTRA_TOPO_INFO              = 1<<14,
        CU_GRAPH_DEBUG_DOT_FLAGS_CONDITIONAL_NODE_PARAMS      = 1<<15;

    public static final int CU_USER_OBJECT_NO_DESTRUCTOR_SYNC = 1;

    public static final int CU_GRAPH_USER_OBJECT_MOVE = 1;

    public static final int
        CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH = 1,
        CUDA_GRAPH_INSTANTIATE_FLAG_UPLOAD              = 2,
        CUDA_GRAPH_INSTANTIATE_FLAG_DEVICE_LAUNCH       = 4,
        CUDA_GRAPH_INSTANTIATE_FLAG_USE_NODE_PRIORITY   = 8;

    public static final int
        CU_DEVICE_NUMA_CONFIG_NONE      = 0,
        CU_DEVICE_NUMA_CONFIG_NUMA_NODE = 1;

    public static final int
        CU_MODULE_EAGER_LOADING = 0x1,
        CU_MODULE_LAZY_LOADING  = 0x2;

    public static final int
        CU_FUNCTION_LOADING_STATE_UNLOADED = 0,
        CU_FUNCTION_LOADING_STATE_LOADED   = 1,
        CU_FUNCTION_LOADING_STATE_MAX      = 2;

    public static final int
        CU_COREDUMP_ENABLE_ON_EXCEPTION = 1,
        CU_COREDUMP_TRIGGER_HOST        = 2,
        CU_COREDUMP_LIGHTWEIGHT         = 3,
        CU_COREDUMP_ENABLE_USER_TRIGGER = 4,
        CU_COREDUMP_FILE                = 5,
        CU_COREDUMP_PIPE                = 6,
        CU_COREDUMP_GENERATION_FLAGS    = 7,
        CU_COREDUMP_MAX                 = 8;

    public static final int
        CU_COREDUMP_DEFAULT_FLAGS                = 0,
        CU_COREDUMP_SKIP_NONRELOCATED_ELF_IMAGES = 1 << 0,
        CU_COREDUMP_SKIP_GLOBAL_MEMORY           = 1 << 1,
        CU_COREDUMP_SKIP_SHARED_MEMORY           = 1 << 2,
        CU_COREDUMP_SKIP_LOCAL_MEMORY            = 1 << 3,
        CU_COREDUMP_SKIP_ABORT                   = 1 << 4,
        CU_COREDUMP_LIGHTWEIGHT_FLAGS            = CU_COREDUMP_SKIP_NONRELOCATED_ELF_IMAGES | CU_COREDUMP_SKIP_GLOBAL_MEMORY | CU_COREDUMP_SKIP_SHARED_MEMORY | CU_COREDUMP_SKIP_LOCAL_MEMORY;

    public static final int CU_GREEN_CTX_DEFAULT_STREAM = 0x1;

    public static final int
        CU_DEV_SM_RESOURCE_SPLIT_IGNORE_SM_COSCHEDULING     = 0x1,
        CU_DEV_SM_RESOURCE_SPLIT_MAX_POTENTIAL_CLUSTER_SIZE = 0x2;

    public static final int
        CU_DEV_RESOURCE_TYPE_INVALID = 0,
        CU_DEV_RESOURCE_TYPE_SM      = 1;

    protected CU() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuGetErrorString ] ---

    /** {@code CUresult cuGetErrorString(CUresult error, char const ** pStr)} */
    public static int ncuGetErrorString(int error, long pStr) {
        long __functionAddress = Functions.GetErrorString;
        return callPI(error, pStr, __functionAddress);
    }

    /** {@code CUresult cuGetErrorString(CUresult error, char const ** pStr)} */
    @NativeType("CUresult")
    public static int cuGetErrorString(@NativeType("CUresult") int error, @NativeType("char const **") PointerBuffer pStr) {
        if (CHECKS) {
            check(pStr, 1);
        }
        return ncuGetErrorString(error, memAddress(pStr));
    }

    // --- [ cuGetErrorName ] ---

    /** {@code CUresult cuGetErrorName(CUresult error, char const ** pStr)} */
    public static int ncuGetErrorName(int error, long pStr) {
        long __functionAddress = Functions.GetErrorName;
        return callPI(error, pStr, __functionAddress);
    }

    /** {@code CUresult cuGetErrorName(CUresult error, char const ** pStr)} */
    @NativeType("CUresult")
    public static int cuGetErrorName(@NativeType("CUresult") int error, @NativeType("char const **") PointerBuffer pStr) {
        if (CHECKS) {
            check(pStr, 1);
        }
        return ncuGetErrorName(error, memAddress(pStr));
    }

    // --- [ cuInit ] ---

    /** {@code CUresult cuInit(unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuInit(@NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.Init;
        return callI(Flags, __functionAddress);
    }

    // --- [ cuDriverGetVersion ] ---

    /** {@code CUresult cuDriverGetVersion(int * driverVersion)} */
    public static int ncuDriverGetVersion(long driverVersion) {
        long __functionAddress = Functions.DriverGetVersion;
        return callPI(driverVersion, __functionAddress);
    }

    /** {@code CUresult cuDriverGetVersion(int * driverVersion)} */
    @NativeType("CUresult")
    public static int cuDriverGetVersion(@NativeType("int *") IntBuffer driverVersion) {
        if (CHECKS) {
            check(driverVersion, 1);
        }
        return ncuDriverGetVersion(memAddress(driverVersion));
    }

    // --- [ cuDeviceGet ] ---

    /** {@code CUresult cuDeviceGet(CUdevice * device, int ordinal)} */
    public static int ncuDeviceGet(long device, int ordinal) {
        long __functionAddress = Functions.DeviceGet;
        return callPI(device, ordinal, __functionAddress);
    }

    /** {@code CUresult cuDeviceGet(CUdevice * device, int ordinal)} */
    @NativeType("CUresult")
    public static int cuDeviceGet(@NativeType("CUdevice *") IntBuffer device, int ordinal) {
        if (CHECKS) {
            check(device, 1);
        }
        return ncuDeviceGet(memAddress(device), ordinal);
    }

    // --- [ cuDeviceGetCount ] ---

    /** {@code CUresult cuDeviceGetCount(int * count)} */
    public static int ncuDeviceGetCount(long count) {
        long __functionAddress = Functions.DeviceGetCount;
        return callPI(count, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetCount(int * count)} */
    @NativeType("CUresult")
    public static int cuDeviceGetCount(@NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return ncuDeviceGetCount(memAddress(count));
    }

    // --- [ cuDeviceGetName ] ---

    /** {@code CUresult cuDeviceGetName(char * name, int len, CUdevice dev)} */
    public static int ncuDeviceGetName(long name, int len, int dev) {
        long __functionAddress = Functions.DeviceGetName;
        return callPI(name, len, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetName(char * name, int len, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetName(@NativeType("char *") ByteBuffer name, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetName(memAddress(name), name.remaining(), dev);
    }

    // --- [ cuDeviceGetUuid ] ---

    /** {@code CUresult cuDeviceGetUuid(CUuuid * uuid, CUdevice dev)} */
    public static int ncuDeviceGetUuid(long uuid, int dev) {
        long __functionAddress = Functions.DeviceGetUuid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(uuid, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetUuid(CUuuid * uuid, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetUuid(@NativeType("CUuuid *") CUuuid uuid, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetUuid(uuid.address(), dev);
    }

    // --- [ cuDeviceGetUuid_v2 ] ---

    /** {@code CUresult cuDeviceGetUuid_v2(CUuuid * uuid, CUdevice dev)} */
    public static int ncuDeviceGetUuid_v2(long uuid, int dev) {
        long __functionAddress = Functions.DeviceGetUuid_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(uuid, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetUuid_v2(CUuuid * uuid, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetUuid_v2(@NativeType("CUuuid *") CUuuid uuid, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetUuid_v2(uuid.address(), dev);
    }

    // --- [ cuDeviceGetLuid ] ---

    /** {@code CUresult cuDeviceGetLuid(char * luid, unsigned int * deviceNodeMask, CUdevice dev)} */
    public static int ncuDeviceGetLuid(long luid, long deviceNodeMask, int dev) {
        long __functionAddress = Functions.DeviceGetLuid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(luid, deviceNodeMask, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetLuid(char * luid, unsigned int * deviceNodeMask, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetLuid(@NativeType("char *") ByteBuffer luid, @NativeType("unsigned int *") IntBuffer deviceNodeMask, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(deviceNodeMask, 1);
        }
        return ncuDeviceGetLuid(memAddress(luid), memAddress(deviceNodeMask), dev);
    }

    // --- [ cuDeviceTotalMem ] ---

    /** {@code CUresult cuDeviceTotalMem(size_t * bytes, CUdevice dev)} */
    public static int ncuDeviceTotalMem(long bytes, int dev) {
        long __functionAddress = Functions.DeviceTotalMem;
        return callPI(bytes, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceTotalMem(size_t * bytes, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceTotalMem(@NativeType("size_t *") PointerBuffer bytes, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(bytes, 1);
        }
        return ncuDeviceTotalMem(memAddress(bytes), dev);
    }

    // --- [ cuDeviceGetTexture1DLinearMaxWidth ] ---

    /** {@code CUresult cuDeviceGetTexture1DLinearMaxWidth(size_t * maxWidthInElements, CUarray_format format, unsigned int numChannels, CUdevice dev)} */
    public static int ncuDeviceGetTexture1DLinearMaxWidth(long maxWidthInElements, int format, int numChannels, int dev) {
        long __functionAddress = Functions.DeviceGetTexture1DLinearMaxWidth;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(maxWidthInElements, format, numChannels, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetTexture1DLinearMaxWidth(size_t * maxWidthInElements, CUarray_format format, unsigned int numChannels, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetTexture1DLinearMaxWidth(@NativeType("size_t *") PointerBuffer maxWidthInElements, @NativeType("CUarray_format") int format, @NativeType("unsigned int") int numChannels, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(maxWidthInElements, 1);
        }
        return ncuDeviceGetTexture1DLinearMaxWidth(memAddress(maxWidthInElements), format, numChannels, dev);
    }

    // --- [ cuDeviceGetAttribute ] ---

    /** {@code CUresult cuDeviceGetAttribute(int * pi, CUdevice_attribute attrib, CUdevice dev)} */
    public static int ncuDeviceGetAttribute(long pi, int attrib, int dev) {
        long __functionAddress = Functions.DeviceGetAttribute;
        return callPI(pi, attrib, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetAttribute(int * pi, CUdevice_attribute attrib, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUdevice_attribute") int attrib, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuDeviceGetAttribute(memAddress(pi), attrib, dev);
    }

    // --- [ cuDeviceGetNvSciSyncAttributes ] ---

    /** {@code CUresult cuDeviceGetNvSciSyncAttributes(void * nvSciSyncAttrList, CUdevice dev, int flags)} */
    public static int ncuDeviceGetNvSciSyncAttributes(long nvSciSyncAttrList, int dev, int flags) {
        long __functionAddress = Functions.DeviceGetNvSciSyncAttributes;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nvSciSyncAttrList, dev, flags, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetNvSciSyncAttributes(void * nvSciSyncAttrList, CUdevice dev, int flags)} */
    @NativeType("CUresult")
    public static int cuDeviceGetNvSciSyncAttributes(@NativeType("void *") ByteBuffer nvSciSyncAttrList, @NativeType("CUdevice") int dev, int flags) {
        return ncuDeviceGetNvSciSyncAttributes(memAddress(nvSciSyncAttrList), dev, flags);
    }

    // --- [ cuDeviceSetMemPool ] ---

    /** {@code CUresult cuDeviceSetMemPool(CUdevice dev, CUmemoryPool pool)} */
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

    /** {@code CUresult cuDeviceGetMemPool(CUmemoryPool * pool, CUdevice dev)} */
    public static int ncuDeviceGetMemPool(long pool, int dev) {
        long __functionAddress = Functions.DeviceGetMemPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pool, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetMemPool(CUmemoryPool * pool, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetMemPool(@NativeType("CUmemoryPool *") PointerBuffer pool, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pool, 1);
        }
        return ncuDeviceGetMemPool(memAddress(pool), dev);
    }

    // --- [ cuDeviceGetDefaultMemPool ] ---

    /** {@code CUresult cuDeviceGetDefaultMemPool(CUmemoryPool * pool_out, CUdevice dev)} */
    public static int ncuDeviceGetDefaultMemPool(long pool_out, int dev) {
        long __functionAddress = Functions.DeviceGetDefaultMemPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pool_out, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetDefaultMemPool(CUmemoryPool * pool_out, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetDefaultMemPool(@NativeType("CUmemoryPool *") PointerBuffer pool_out, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pool_out, 1);
        }
        return ncuDeviceGetDefaultMemPool(memAddress(pool_out), dev);
    }

    // --- [ cuDeviceGetExecAffinitySupport ] ---

    /** {@code CUresult cuDeviceGetExecAffinitySupport(int * pi, CUexecAffinityType type, CUdevice dev)} */
    public static int ncuDeviceGetExecAffinitySupport(long pi, int type, int dev) {
        long __functionAddress = Functions.DeviceGetExecAffinitySupport;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pi, type, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetExecAffinitySupport(int * pi, CUexecAffinityType type, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetExecAffinitySupport(@NativeType("int *") IntBuffer pi, @NativeType("CUexecAffinityType") int type, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuDeviceGetExecAffinitySupport(memAddress(pi), type, dev);
    }

    // --- [ cuFlushGPUDirectRDMAWrites ] ---

    /** {@code CUresult cuFlushGPUDirectRDMAWrites(CUflushGPUDirectRDMAWritesTarget target, CUflushGPUDirectRDMAWritesScope scope)} */
    @NativeType("CUresult")
    public static int cuFlushGPUDirectRDMAWrites(@NativeType("CUflushGPUDirectRDMAWritesTarget") int target, @NativeType("CUflushGPUDirectRDMAWritesScope") int scope) {
        long __functionAddress = Functions.FlushGPUDirectRDMAWrites;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(target, scope, __functionAddress);
    }

    // --- [ cuDeviceGetProperties ] ---

    /** {@code CUresult cuDeviceGetProperties(CUdevprop * prop, CUdevice dev)} */
    public static int ncuDeviceGetProperties(long prop, int dev) {
        long __functionAddress = Functions.DeviceGetProperties;
        return callPI(prop, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetProperties(CUdevprop * prop, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetProperties(@NativeType("CUdevprop *") CUdevprop prop, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetProperties(prop.address(), dev);
    }

    // --- [ cuDeviceComputeCapability ] ---

    /** {@code CUresult cuDeviceComputeCapability(int * major, int * minor, CUdevice dev)} */
    public static int ncuDeviceComputeCapability(long major, long minor, int dev) {
        long __functionAddress = Functions.DeviceComputeCapability;
        return callPPI(major, minor, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceComputeCapability(int * major, int * minor, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceComputeCapability(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return ncuDeviceComputeCapability(memAddress(major), memAddress(minor), dev);
    }

    // --- [ cuDevicePrimaryCtxRetain ] ---

    /** {@code CUresult cuDevicePrimaryCtxRetain(CUcontext * pctx, CUdevice dev)} */
    public static int ncuDevicePrimaryCtxRetain(long pctx, int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxRetain;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pctx, dev, __functionAddress);
    }

    /** {@code CUresult cuDevicePrimaryCtxRetain(CUcontext * pctx, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxRetain(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuDevicePrimaryCtxRetain(memAddress(pctx), dev);
    }

    // --- [ cuDevicePrimaryCtxRelease ] ---

    /** {@code CUresult cuDevicePrimaryCtxRelease(CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxRelease(@NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxRelease;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(dev, __functionAddress);
    }

    // --- [ cuDevicePrimaryCtxSetFlags ] ---

    /** {@code CUresult cuDevicePrimaryCtxSetFlags(CUdevice dev, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxSetFlags(@NativeType("CUdevice") int dev, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.DevicePrimaryCtxSetFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(dev, flags, __functionAddress);
    }

    // --- [ cuDevicePrimaryCtxGetState ] ---

    /** {@code CUresult cuDevicePrimaryCtxGetState(CUdevice dev, unsigned int * flags, int * active)} */
    public static int ncuDevicePrimaryCtxGetState(int dev, long flags, long active) {
        long __functionAddress = Functions.DevicePrimaryCtxGetState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dev, flags, active, __functionAddress);
    }

    /** {@code CUresult cuDevicePrimaryCtxGetState(CUdevice dev, unsigned int * flags, int * active)} */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxGetState(@NativeType("CUdevice") int dev, @NativeType("unsigned int *") IntBuffer flags, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(flags, 1);
            check(active, 1);
        }
        return ncuDevicePrimaryCtxGetState(dev, memAddress(flags), memAddress(active));
    }

    // --- [ cuDevicePrimaryCtxReset ] ---

    /** {@code CUresult cuDevicePrimaryCtxReset(CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxReset(@NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxReset;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(dev, __functionAddress);
    }

    // --- [ cuCtxCreate ] ---

    /** {@code CUresult cuCtxCreate(CUcontext * pctx, unsigned int flags, CUdevice dev)} */
    public static int ncuCtxCreate(long pctx, int flags, int dev) {
        long __functionAddress = Functions.CtxCreate;
        return callPI(pctx, flags, dev, __functionAddress);
    }

    /** {@code CUresult cuCtxCreate(CUcontext * pctx, unsigned int flags, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuCtxCreate(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("unsigned int") int flags, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxCreate(memAddress(pctx), flags, dev);
    }

    // --- [ cuCtxCreate_v3 ] ---

    /** {@code CUresult cuCtxCreate_v3(CUcontext * pctx, CUexecAffinityParam * paramsArray, int numParams, unsigned int flags, CUdevice dev)} */
    public static int ncuCtxCreate_v3(long pctx, long paramsArray, int numParams, int flags, int dev) {
        long __functionAddress = Functions.CtxCreate_v3;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pctx, paramsArray, numParams, flags, dev, __functionAddress);
    }

    /** {@code CUresult cuCtxCreate_v3(CUcontext * pctx, CUexecAffinityParam * paramsArray, int numParams, unsigned int flags, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuCtxCreate_v3(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUexecAffinityParam *") CUexecAffinityParam.Buffer paramsArray, @NativeType("unsigned int") int flags, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxCreate_v3(memAddress(pctx), paramsArray.address(), paramsArray.remaining(), flags, dev);
    }

    // --- [ cuCtxCreate_v4 ] ---

    /** {@code CUresult cuCtxCreate_v4(CUcontext * pctx, CUctxCreateParams * ctxCreateParams, unsigned int flags, CUdevice dev)} */
    public static int ncuCtxCreate_v4(long pctx, long ctxCreateParams, int flags, int dev) {
        long __functionAddress = Functions.CtxCreate_v4;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pctx, ctxCreateParams, flags, dev, __functionAddress);
    }

    /** {@code CUresult cuCtxCreate_v4(CUcontext * pctx, CUctxCreateParams * ctxCreateParams, unsigned int flags, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuCtxCreate_v4(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUctxCreateParams *") CUctxCreateParams ctxCreateParams, @NativeType("unsigned int") int flags, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxCreate_v4(memAddress(pctx), ctxCreateParams.address(), flags, dev);
    }

    // --- [ cuCtxDestroy ] ---

    /** {@code CUresult cuCtxDestroy(CUcontext ctx)} */
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

    /** {@code CUresult cuCtxPushCurrent(CUcontext ctx)} */
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

    /** {@code CUresult cuCtxPopCurrent(CUcontext * pctx)} */
    public static int ncuCtxPopCurrent(long pctx) {
        long __functionAddress = Functions.CtxPopCurrent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pctx, __functionAddress);
    }

    /** {@code CUresult cuCtxPopCurrent(CUcontext * pctx)} */
    @NativeType("CUresult")
    public static int cuCtxPopCurrent(@NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxPopCurrent(memAddress(pctx));
    }

    // --- [ cuCtxSetCurrent ] ---

    /** {@code CUresult cuCtxSetCurrent(CUcontext ctx)} */
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

    /** {@code CUresult cuCtxGetCurrent(CUcontext * pctx)} */
    public static int ncuCtxGetCurrent(long pctx) {
        long __functionAddress = Functions.CtxGetCurrent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pctx, __functionAddress);
    }

    /** {@code CUresult cuCtxGetCurrent(CUcontext * pctx)} */
    @NativeType("CUresult")
    public static int cuCtxGetCurrent(@NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxGetCurrent(memAddress(pctx));
    }

    // --- [ cuCtxGetDevice ] ---

    /** {@code CUresult cuCtxGetDevice(CUdevice * device)} */
    public static int ncuCtxGetDevice(long device) {
        long __functionAddress = Functions.CtxGetDevice;
        return callPI(device, __functionAddress);
    }

    /** {@code CUresult cuCtxGetDevice(CUdevice * device)} */
    @NativeType("CUresult")
    public static int cuCtxGetDevice(@NativeType("CUdevice *") IntBuffer device) {
        if (CHECKS) {
            check(device, 1);
        }
        return ncuCtxGetDevice(memAddress(device));
    }

    // --- [ cuCtxGetFlags ] ---

    /** {@code CUresult cuCtxGetFlags(unsigned int * flags)} */
    public static int ncuCtxGetFlags(long flags) {
        long __functionAddress = Functions.CtxGetFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(flags, __functionAddress);
    }

    /** {@code CUresult cuCtxGetFlags(unsigned int * flags)} */
    @NativeType("CUresult")
    public static int cuCtxGetFlags(@NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuCtxGetFlags(memAddress(flags));
    }

    // --- [ cuCtxSetFlags ] ---

    /** {@code CUresult cuCtxSetFlags(unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuCtxSetFlags(@NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.CtxSetFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(flags, __functionAddress);
    }

    // --- [ cuCtxGetId ] ---

    /** {@code CUresult cuCtxGetId(CUcontext ctx, unsigned long long * ctxId)} */
    public static int ncuCtxGetId(long ctx, long ctxId) {
        long __functionAddress = Functions.CtxGetId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(ctx, ctxId, __functionAddress);
    }

    /** {@code CUresult cuCtxGetId(CUcontext ctx, unsigned long long * ctxId)} */
    @NativeType("CUresult")
    public static int cuCtxGetId(@NativeType("CUcontext") long ctx, @NativeType("unsigned long long *") LongBuffer ctxId) {
        if (CHECKS) {
            check(ctxId, 1);
        }
        return ncuCtxGetId(ctx, memAddress(ctxId));
    }

    // --- [ cuCtxSynchronize ] ---

    /** {@code CUresult cuCtxSynchronize(void)} */
    @NativeType("CUresult")
    public static int cuCtxSynchronize() {
        long __functionAddress = Functions.CtxSynchronize;
        return callI(__functionAddress);
    }

    // --- [ cuCtxSetLimit ] ---

    /** {@code CUresult cuCtxSetLimit(CUlimit limit, size_t value)} */
    @NativeType("CUresult")
    public static int cuCtxSetLimit(@NativeType("CUlimit") int limit, @NativeType("size_t") long value) {
        long __functionAddress = Functions.CtxSetLimit;
        return callPI(limit, value, __functionAddress);
    }

    // --- [ cuCtxGetLimit ] ---

    /** {@code CUresult cuCtxGetLimit(size_t * pvalue, CUlimit limit)} */
    public static int ncuCtxGetLimit(long pvalue, int limit) {
        long __functionAddress = Functions.CtxGetLimit;
        return callPI(pvalue, limit, __functionAddress);
    }

    /** {@code CUresult cuCtxGetLimit(size_t * pvalue, CUlimit limit)} */
    @NativeType("CUresult")
    public static int cuCtxGetLimit(@NativeType("size_t *") PointerBuffer pvalue, @NativeType("CUlimit") int limit) {
        if (CHECKS) {
            check(pvalue, 1);
        }
        return ncuCtxGetLimit(memAddress(pvalue), limit);
    }

    // --- [ cuCtxGetCacheConfig ] ---

    /** {@code CUresult cuCtxGetCacheConfig(CUfunc_cache * pconfig)} */
    public static int ncuCtxGetCacheConfig(long pconfig) {
        long __functionAddress = Functions.CtxGetCacheConfig;
        return callPI(pconfig, __functionAddress);
    }

    /** {@code CUresult cuCtxGetCacheConfig(CUfunc_cache * pconfig)} */
    @NativeType("CUresult")
    public static int cuCtxGetCacheConfig(@NativeType("CUfunc_cache *") IntBuffer pconfig) {
        if (CHECKS) {
            check(pconfig, 1);
        }
        return ncuCtxGetCacheConfig(memAddress(pconfig));
    }

    // --- [ cuCtxSetCacheConfig ] ---

    /** {@code CUresult cuCtxSetCacheConfig(CUfunc_cache config)} */
    @NativeType("CUresult")
    public static int cuCtxSetCacheConfig(@NativeType("CUfunc_cache") int config) {
        long __functionAddress = Functions.CtxSetCacheConfig;
        return callI(config, __functionAddress);
    }

    // --- [ cuCtxGetSharedMemConfig ] ---

    /** {@code CUresult cuCtxGetSharedMemConfig(CUsharedconfig * pConfig)} */
    public static int ncuCtxGetSharedMemConfig(long pConfig) {
        long __functionAddress = Functions.CtxGetSharedMemConfig;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pConfig, __functionAddress);
    }

    /** {@code CUresult cuCtxGetSharedMemConfig(CUsharedconfig * pConfig)} */
    @NativeType("CUresult")
    public static int cuCtxGetSharedMemConfig(@NativeType("CUsharedconfig *") IntBuffer pConfig) {
        if (CHECKS) {
            check(pConfig, 1);
        }
        return ncuCtxGetSharedMemConfig(memAddress(pConfig));
    }

    // --- [ cuCtxSetSharedMemConfig ] ---

    /** {@code CUresult cuCtxSetSharedMemConfig(CUsharedconfig config)} */
    @NativeType("CUresult")
    public static int cuCtxSetSharedMemConfig(@NativeType("CUsharedconfig") int config) {
        long __functionAddress = Functions.CtxSetSharedMemConfig;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(config, __functionAddress);
    }

    // --- [ cuCtxGetApiVersion ] ---

    /** {@code CUresult cuCtxGetApiVersion(CUcontext ctx, unsigned int * version)} */
    public static int ncuCtxGetApiVersion(long ctx, long version) {
        long __functionAddress = Functions.CtxGetApiVersion;
        return callPPI(ctx, version, __functionAddress);
    }

    /** {@code CUresult cuCtxGetApiVersion(CUcontext ctx, unsigned int * version)} */
    @NativeType("CUresult")
    public static int cuCtxGetApiVersion(@NativeType("CUcontext") long ctx, @NativeType("unsigned int *") IntBuffer version) {
        if (CHECKS) {
            check(version, 1);
        }
        return ncuCtxGetApiVersion(ctx, memAddress(version));
    }

    // --- [ cuCtxGetStreamPriorityRange ] ---

    /** {@code CUresult cuCtxGetStreamPriorityRange(int * leastPriority, int * greatestPriority)} */
    public static int ncuCtxGetStreamPriorityRange(long leastPriority, long greatestPriority) {
        long __functionAddress = Functions.CtxGetStreamPriorityRange;
        return callPPI(leastPriority, greatestPriority, __functionAddress);
    }

    /** {@code CUresult cuCtxGetStreamPriorityRange(int * leastPriority, int * greatestPriority)} */
    @NativeType("CUresult")
    public static int cuCtxGetStreamPriorityRange(@NativeType("int *") @Nullable IntBuffer leastPriority, @NativeType("int *") @Nullable IntBuffer greatestPriority) {
        if (CHECKS) {
            checkSafe(leastPriority, 1);
            checkSafe(greatestPriority, 1);
        }
        return ncuCtxGetStreamPriorityRange(memAddressSafe(leastPriority), memAddressSafe(greatestPriority));
    }

    // --- [ cuCtxResetPersistingL2Cache ] ---

    /** {@code CUresult cuCtxResetPersistingL2Cache(void)} */
    @NativeType("CUresult")
    public static int cuCtxResetPersistingL2Cache() {
        long __functionAddress = Functions.CtxResetPersistingL2Cache;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ cuCtxGetExecAffinity ] ---

    /** {@code CUresult cuCtxGetExecAffinity(CUexecAffinityParam * pExecAffinity, CUexecAffinityType type)} */
    public static int ncuCtxGetExecAffinity(long pExecAffinity, int type) {
        long __functionAddress = Functions.CtxGetExecAffinity;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pExecAffinity, type, __functionAddress);
    }

    /** {@code CUresult cuCtxGetExecAffinity(CUexecAffinityParam * pExecAffinity, CUexecAffinityType type)} */
    @NativeType("CUresult")
    public static int cuCtxGetExecAffinity(@NativeType("CUexecAffinityParam *") CUexecAffinityParam.Buffer pExecAffinity, @NativeType("CUexecAffinityType") int type) {
        if (CHECKS) {
            check(pExecAffinity, 1);
        }
        return ncuCtxGetExecAffinity(pExecAffinity.address(), type);
    }

    // --- [ cuCtxRecordEvent ] ---

    /** {@code CUresult cuCtxRecordEvent(CUcontext hCtx, CUevent hEvent)} */
    @NativeType("CUresult")
    public static int cuCtxRecordEvent(@NativeType("CUcontext") long hCtx, @NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.CtxRecordEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
            check(hEvent);
        }
        return callPPI(hCtx, hEvent, __functionAddress);
    }

    // --- [ cuCtxWaitEvent ] ---

    /** {@code CUresult cuCtxWaitEvent(CUcontext hCtx, CUevent hEvent)} */
    @NativeType("CUresult")
    public static int cuCtxWaitEvent(@NativeType("CUcontext") long hCtx, @NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.CtxWaitEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
            check(hEvent);
        }
        return callPPI(hCtx, hEvent, __functionAddress);
    }

    // --- [ cuCtxAttach ] ---

    /** {@code CUresult cuCtxAttach(CUcontext * pctx, unsigned int flags)} */
    public static int ncuCtxAttach(long pctx, int flags) {
        long __functionAddress = Functions.CtxAttach;
        return callPI(pctx, flags, __functionAddress);
    }

    /** {@code CUresult cuCtxAttach(CUcontext * pctx, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuCtxAttach(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxAttach(memAddress(pctx), flags);
    }

    // --- [ cuCtxDetach ] ---

    /** {@code CUresult cuCtxDetach(CUcontext ctx)} */
    @NativeType("CUresult")
    public static int cuCtxDetach(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxDetach;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuModuleLoad ] ---

    /** {@code CUresult cuModuleLoad(CUmodule * module, char const * fname)} */
    public static int ncuModuleLoad(long module, long fname) {
        long __functionAddress = Functions.ModuleLoad;
        return callPPI(module, fname, __functionAddress);
    }

    /** {@code CUresult cuModuleLoad(CUmodule * module, char const * fname)} */
    @NativeType("CUresult")
    public static int cuModuleLoad(@NativeType("CUmodule *") PointerBuffer module, @NativeType("char const *") ByteBuffer fname) {
        if (CHECKS) {
            check(module, 1);
            checkNT1(fname);
        }
        return ncuModuleLoad(memAddress(module), memAddress(fname));
    }

    /** {@code CUresult cuModuleLoad(CUmodule * module, char const * fname)} */
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

    /** {@code CUresult cuModuleLoadData(CUmodule * module, void const * image)} */
    public static int ncuModuleLoadData(long module, long image) {
        long __functionAddress = Functions.ModuleLoadData;
        return callPPI(module, image, __functionAddress);
    }

    /** {@code CUresult cuModuleLoadData(CUmodule * module, void const * image)} */
    @NativeType("CUresult")
    public static int cuModuleLoadData(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer image) {
        if (CHECKS) {
            check(module, 1);
        }
        return ncuModuleLoadData(memAddress(module), memAddress(image));
    }

    // --- [ cuModuleLoadDataEx ] ---

    /** {@code CUresult cuModuleLoadDataEx(CUmodule * module, void const * image, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
    public static int ncuModuleLoadDataEx(long module, long image, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.ModuleLoadDataEx;
        return callPPPPI(module, image, numOptions, options, optionValues, __functionAddress);
    }

    /** {@code CUresult cuModuleLoadDataEx(CUmodule * module, void const * image, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
    @NativeType("CUresult")
    public static int cuModuleLoadDataEx(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer image, @NativeType("CUjit_option *") @Nullable IntBuffer options, @NativeType("void **") @Nullable PointerBuffer optionValues) {
        if (CHECKS) {
            check(module, 1);
            checkSafe(optionValues, remainingSafe(options));
        }
        return ncuModuleLoadDataEx(memAddress(module), memAddress(image), remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
    }

    // --- [ cuModuleLoadFatBinary ] ---

    /** {@code CUresult cuModuleLoadFatBinary(CUmodule * module, void const * fatCubin)} */
    public static int ncuModuleLoadFatBinary(long module, long fatCubin) {
        long __functionAddress = Functions.ModuleLoadFatBinary;
        return callPPI(module, fatCubin, __functionAddress);
    }

    /** {@code CUresult cuModuleLoadFatBinary(CUmodule * module, void const * fatCubin)} */
    @NativeType("CUresult")
    public static int cuModuleLoadFatBinary(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer fatCubin) {
        if (CHECKS) {
            check(module, 1);
        }
        return ncuModuleLoadFatBinary(memAddress(module), memAddress(fatCubin));
    }

    // --- [ cuModuleUnload ] ---

    /** {@code CUresult cuModuleUnload(CUmodule hmod)} */
    @NativeType("CUresult")
    public static int cuModuleUnload(@NativeType("CUmodule") long hmod) {
        long __functionAddress = Functions.ModuleUnload;
        if (CHECKS) {
            check(hmod);
        }
        return callPI(hmod, __functionAddress);
    }

    // --- [ cuModuleGetLoadingMode ] ---

    /** {@code CUresult cuModuleGetLoadingMode(CUmoduleLoadingMode * mode)} */
    public static int ncuModuleGetLoadingMode(long mode) {
        long __functionAddress = Functions.ModuleGetLoadingMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mode, __functionAddress);
    }

    /** {@code CUresult cuModuleGetLoadingMode(CUmoduleLoadingMode * mode)} */
    @NativeType("CUresult")
    public static int cuModuleGetLoadingMode(@NativeType("CUmoduleLoadingMode *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return ncuModuleGetLoadingMode(memAddress(mode));
    }

    // --- [ cuModuleGetFunction ] ---

    /** {@code CUresult cuModuleGetFunction(CUfunction * hfunc, CUmodule hmod, char const * name)} */
    public static int ncuModuleGetFunction(long hfunc, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetFunction;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(hfunc, hmod, name, __functionAddress);
    }

    /** {@code CUresult cuModuleGetFunction(CUfunction * hfunc, CUmodule hmod, char const * name)} */
    @NativeType("CUresult")
    public static int cuModuleGetFunction(@NativeType("CUfunction *") PointerBuffer hfunc, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(hfunc, 1);
            checkNT1(name);
        }
        return ncuModuleGetFunction(memAddress(hfunc), hmod, memAddress(name));
    }

    /** {@code CUresult cuModuleGetFunction(CUfunction * hfunc, CUmodule hmod, char const * name)} */
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

    // --- [ cuModuleGetFunctionCount ] ---

    /** {@code CUresult cuModuleGetFunctionCount(unsigned int * count, CUmodule mod)} */
    public static int ncuModuleGetFunctionCount(long count, long mod) {
        long __functionAddress = Functions.ModuleGetFunctionCount;
        if (CHECKS) {
            check(__functionAddress);
            check(mod);
        }
        return callPPI(count, mod, __functionAddress);
    }

    /** {@code CUresult cuModuleGetFunctionCount(unsigned int * count, CUmodule mod)} */
    @NativeType("CUresult")
    public static int cuModuleGetFunctionCount(@NativeType("unsigned int *") IntBuffer count, @NativeType("CUmodule") long mod) {
        if (CHECKS) {
            check(count, 1);
        }
        return ncuModuleGetFunctionCount(memAddress(count), mod);
    }

    // --- [ cuModuleEnumerateFunctions ] ---

    /** {@code CUresult cuModuleEnumerateFunctions(CUfunction * functions, unsigned int numFunctions, CUmodule mod)} */
    public static int ncuModuleEnumerateFunctions(long functions, int numFunctions, long mod) {
        long __functionAddress = Functions.ModuleEnumerateFunctions;
        if (CHECKS) {
            check(__functionAddress);
            check(mod);
        }
        return callPPI(functions, numFunctions, mod, __functionAddress);
    }

    /** {@code CUresult cuModuleEnumerateFunctions(CUfunction * functions, unsigned int numFunctions, CUmodule mod)} */
    @NativeType("CUresult")
    public static int cuModuleEnumerateFunctions(@NativeType("CUfunction *") PointerBuffer functions, @NativeType("CUmodule") long mod) {
        return ncuModuleEnumerateFunctions(memAddress(functions), functions.remaining(), mod);
    }

    // --- [ cuModuleGetGlobal ] ---

    /** {@code CUresult cuModuleGetGlobal(CUdeviceptr * dptr, size_t * bytes, CUmodule hmod, char const * name)} */
    public static int ncuModuleGetGlobal(long dptr, long bytes, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetGlobal;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPPI(dptr, bytes, hmod, name, __functionAddress);
    }

    /** {@code CUresult cuModuleGetGlobal(CUdeviceptr * dptr, size_t * bytes, CUmodule hmod, char const * name)} */
    @NativeType("CUresult")
    public static int cuModuleGetGlobal(@NativeType("CUdeviceptr *") @Nullable PointerBuffer dptr, @NativeType("size_t *") @Nullable PointerBuffer bytes, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(dptr, 1);
            checkSafe(bytes, 1);
            checkNT1(name);
        }
        return ncuModuleGetGlobal(memAddressSafe(dptr), memAddressSafe(bytes), hmod, memAddress(name));
    }

    /** {@code CUresult cuModuleGetGlobal(CUdeviceptr * dptr, size_t * bytes, CUmodule hmod, char const * name)} */
    @NativeType("CUresult")
    public static int cuModuleGetGlobal(@NativeType("CUdeviceptr *") @Nullable PointerBuffer dptr, @NativeType("size_t *") @Nullable PointerBuffer bytes, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
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

    // --- [ cuLinkCreate ] ---

    /** {@code CUresult cuLinkCreate(unsigned int numOptions, CUjit_option * options, void ** optionValues, CUlinkState * stateOut)} */
    public static int ncuLinkCreate(int numOptions, long options, long optionValues, long stateOut) {
        long __functionAddress = Functions.LinkCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(numOptions, options, optionValues, stateOut, __functionAddress);
    }

    /** {@code CUresult cuLinkCreate(unsigned int numOptions, CUjit_option * options, void ** optionValues, CUlinkState * stateOut)} */
    @NativeType("CUresult")
    public static int cuLinkCreate(@NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues, @NativeType("CUlinkState *") PointerBuffer stateOut) {
        if (CHECKS) {
            check(optionValues, options.remaining());
            check(stateOut, 1);
        }
        return ncuLinkCreate(options.remaining(), memAddress(options), memAddress(optionValues), memAddress(stateOut));
    }

    // --- [ cuLinkAddData ] ---

    /** {@code CUresult cuLinkAddData(CUlinkState state, CUjitInputType type, void * data, size_t size, char const * name, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
    public static int ncuLinkAddData(long state, int type, long data, long size, long name, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.LinkAddData;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPPPPPPI(state, type, data, size, name, numOptions, options, optionValues, __functionAddress);
    }

    /** {@code CUresult cuLinkAddData(CUlinkState state, CUjitInputType type, void * data, size_t size, char const * name, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
    @NativeType("CUresult")
    public static int cuLinkAddData(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("void *") ByteBuffer data, @NativeType("char const *") ByteBuffer name, @NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkNT1(name);
            check(optionValues, options.remaining());
        }
        return ncuLinkAddData(state, type, memAddress(data), data.remaining(), memAddress(name), options.remaining(), memAddress(options), memAddress(optionValues));
    }

    /** {@code CUresult cuLinkAddData(CUlinkState state, CUjitInputType type, void * data, size_t size, char const * name, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
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

    /** {@code CUresult cuLinkAddFile(CUlinkState state, CUjitInputType type, char const * path, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
    public static int ncuLinkAddFile(long state, int type, long path, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.LinkAddFile;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPPPPI(state, type, path, numOptions, options, optionValues, __functionAddress);
    }

    /** {@code CUresult cuLinkAddFile(CUlinkState state, CUjitInputType type, char const * path, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
    @NativeType("CUresult")
    public static int cuLinkAddFile(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("char const *") ByteBuffer path, @NativeType("CUjit_option *") IntBuffer options, @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkNT1(path);
            check(optionValues, options.remaining());
        }
        return ncuLinkAddFile(state, type, memAddress(path), options.remaining(), memAddress(options), memAddress(optionValues));
    }

    /** {@code CUresult cuLinkAddFile(CUlinkState state, CUjitInputType type, char const * path, unsigned int numOptions, CUjit_option * options, void ** optionValues)} */
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

    /** {@code CUresult cuLinkComplete(CUlinkState state, void ** cubinOut, size_t * sizeOut)} */
    public static int ncuLinkComplete(long state, long cubinOut, long sizeOut) {
        long __functionAddress = Functions.LinkComplete;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPPPI(state, cubinOut, sizeOut, __functionAddress);
    }

    /** {@code CUresult cuLinkComplete(CUlinkState state, void ** cubinOut, size_t * sizeOut)} */
    @NativeType("CUresult")
    public static int cuLinkComplete(@NativeType("CUlinkState") long state, @NativeType("void **") PointerBuffer cubinOut, @NativeType("size_t *") PointerBuffer sizeOut) {
        if (CHECKS) {
            check(cubinOut, 1);
            check(sizeOut, 1);
        }
        return ncuLinkComplete(state, memAddress(cubinOut), memAddress(sizeOut));
    }

    // --- [ cuLinkDestroy ] ---

    /** {@code CUresult cuLinkDestroy(CUlinkState state)} */
    @NativeType("CUresult")
    public static int cuLinkDestroy(@NativeType("CUlinkState") long state) {
        long __functionAddress = Functions.LinkDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(state);
        }
        return callPI(state, __functionAddress);
    }

    // --- [ cuModuleGetTexRef ] ---

    /** {@code CUresult cuModuleGetTexRef(CUtexref * pTexRef, CUmodule hmod, char const * name)} */
    public static int ncuModuleGetTexRef(long pTexRef, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetTexRef;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(pTexRef, hmod, name, __functionAddress);
    }

    /** {@code CUresult cuModuleGetTexRef(CUtexref * pTexRef, CUmodule hmod, char const * name)} */
    @NativeType("CUresult")
    public static int cuModuleGetTexRef(@NativeType("CUtexref *") PointerBuffer pTexRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pTexRef, 1);
            checkNT1(name);
        }
        return ncuModuleGetTexRef(memAddress(pTexRef), hmod, memAddress(name));
    }

    /** {@code CUresult cuModuleGetTexRef(CUtexref * pTexRef, CUmodule hmod, char const * name)} */
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

    /** {@code CUresult cuModuleGetSurfRef(CUsurfref * pSurfRef, CUmodule hmod, char const * name)} */
    public static int ncuModuleGetSurfRef(long pSurfRef, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetSurfRef;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(pSurfRef, hmod, name, __functionAddress);
    }

    /** {@code CUresult cuModuleGetSurfRef(CUsurfref * pSurfRef, CUmodule hmod, char const * name)} */
    @NativeType("CUresult")
    public static int cuModuleGetSurfRef(@NativeType("CUsurfref *") PointerBuffer pSurfRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pSurfRef, 1);
            checkNT1(name);
        }
        return ncuModuleGetSurfRef(memAddress(pSurfRef), hmod, memAddress(name));
    }

    /** {@code CUresult cuModuleGetSurfRef(CUsurfref * pSurfRef, CUmodule hmod, char const * name)} */
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

    // --- [ cuLibraryLoadData ] ---

    /** {@code CUresult cuLibraryLoadData(CUlibrary * library, void const * code, CUjit_option * jitOptions, void ** jitOptionsValues, unsigned int numJitOptions, CUlibraryOption * libraryOptions, void ** libraryOptionValues, unsigned int numLibraryOptions)} */
    public static int ncuLibraryLoadData(long library, long code, long jitOptions, long jitOptionsValues, int numJitOptions, long libraryOptions, long libraryOptionValues, int numLibraryOptions) {
        long __functionAddress = Functions.LibraryLoadData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(library, code, jitOptions, jitOptionsValues, numJitOptions, libraryOptions, libraryOptionValues, numLibraryOptions, __functionAddress);
    }

    /** {@code CUresult cuLibraryLoadData(CUlibrary * library, void const * code, CUjit_option * jitOptions, void ** jitOptionsValues, unsigned int numJitOptions, CUlibraryOption * libraryOptions, void ** libraryOptionValues, unsigned int numLibraryOptions)} */
    @NativeType("CUresult")
    public static int cuLibraryLoadData(@NativeType("CUlibrary *") PointerBuffer library, @NativeType("void const *") ByteBuffer code, @NativeType("CUjit_option *") @Nullable IntBuffer jitOptions, @NativeType("void **") @Nullable PointerBuffer jitOptionsValues, @NativeType("CUlibraryOption *") @Nullable IntBuffer libraryOptions, @NativeType("void **") @Nullable PointerBuffer libraryOptionValues) {
        if (CHECKS) {
            check(library, 1);
            checkSafe(jitOptionsValues, remainingSafe(jitOptions));
            checkSafe(libraryOptionValues, remainingSafe(libraryOptions));
        }
        return ncuLibraryLoadData(memAddress(library), memAddress(code), memAddressSafe(jitOptions), memAddressSafe(jitOptionsValues), remainingSafe(jitOptions), memAddressSafe(libraryOptions), memAddressSafe(libraryOptionValues), remainingSafe(libraryOptions));
    }

    // --- [ cuLibraryLoadFromFile ] ---

    /** {@code CUresult cuLibraryLoadFromFile(CUlibrary * library, char const * fileName, CUjit_option * jitOptions, void ** jitOptionsValues, unsigned int numJitOptions, CUlibraryOption * libraryOptions, void ** libraryOptionValues, unsigned int numLibraryOptions)} */
    public static int ncuLibraryLoadFromFile(long library, long fileName, long jitOptions, long jitOptionsValues, int numJitOptions, long libraryOptions, long libraryOptionValues, int numLibraryOptions) {
        long __functionAddress = Functions.LibraryLoadFromFile;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(library, fileName, jitOptions, jitOptionsValues, numJitOptions, libraryOptions, libraryOptionValues, numLibraryOptions, __functionAddress);
    }

    /** {@code CUresult cuLibraryLoadFromFile(CUlibrary * library, char const * fileName, CUjit_option * jitOptions, void ** jitOptionsValues, unsigned int numJitOptions, CUlibraryOption * libraryOptions, void ** libraryOptionValues, unsigned int numLibraryOptions)} */
    @NativeType("CUresult")
    public static int cuLibraryLoadFromFile(@NativeType("CUlibrary *") PointerBuffer library, @NativeType("char const *") ByteBuffer fileName, @NativeType("CUjit_option *") @Nullable IntBuffer jitOptions, @NativeType("void **") @Nullable PointerBuffer jitOptionsValues, @NativeType("CUlibraryOption *") @Nullable IntBuffer libraryOptions, @NativeType("void **") @Nullable PointerBuffer libraryOptionValues) {
        if (CHECKS) {
            check(library, 1);
            checkNT1(fileName);
            checkSafe(jitOptionsValues, remainingSafe(jitOptions));
            checkSafe(libraryOptionValues, remainingSafe(libraryOptions));
        }
        return ncuLibraryLoadFromFile(memAddress(library), memAddress(fileName), memAddressSafe(jitOptions), memAddressSafe(jitOptionsValues), remainingSafe(jitOptions), memAddressSafe(libraryOptions), memAddressSafe(libraryOptionValues), remainingSafe(libraryOptions));
    }

    /** {@code CUresult cuLibraryLoadFromFile(CUlibrary * library, char const * fileName, CUjit_option * jitOptions, void ** jitOptionsValues, unsigned int numJitOptions, CUlibraryOption * libraryOptions, void ** libraryOptionValues, unsigned int numLibraryOptions)} */
    @NativeType("CUresult")
    public static int cuLibraryLoadFromFile(@NativeType("CUlibrary *") PointerBuffer library, @NativeType("char const *") CharSequence fileName, @NativeType("CUjit_option *") @Nullable IntBuffer jitOptions, @NativeType("void **") @Nullable PointerBuffer jitOptionsValues, @NativeType("CUlibraryOption *") @Nullable IntBuffer libraryOptions, @NativeType("void **") @Nullable PointerBuffer libraryOptionValues) {
        if (CHECKS) {
            check(library, 1);
            checkSafe(jitOptionsValues, remainingSafe(jitOptions));
            checkSafe(libraryOptionValues, remainingSafe(libraryOptions));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return ncuLibraryLoadFromFile(memAddress(library), fileNameEncoded, memAddressSafe(jitOptions), memAddressSafe(jitOptionsValues), remainingSafe(jitOptions), memAddressSafe(libraryOptions), memAddressSafe(libraryOptionValues), remainingSafe(libraryOptions));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLibraryUnload ] ---

    /** {@code CUresult cuLibraryUnload(CUlibrary library)} */
    @NativeType("CUresult")
    public static int cuLibraryUnload(@NativeType("CUlibrary") long library) {
        long __functionAddress = Functions.LibraryUnload;
        if (CHECKS) {
            check(__functionAddress);
            check(library);
        }
        return callPI(library, __functionAddress);
    }

    // --- [ cuLibraryGetKernel ] ---

    /** {@code CUresult cuLibraryGetKernel(CUkernel * pKernel, CUlibrary library, char const * name)} */
    public static int ncuLibraryGetKernel(long pKernel, long library, long name) {
        long __functionAddress = Functions.LibraryGetKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(library);
        }
        return callPPPI(pKernel, library, name, __functionAddress);
    }

    /** {@code CUresult cuLibraryGetKernel(CUkernel * pKernel, CUlibrary library, char const * name)} */
    @NativeType("CUresult")
    public static int cuLibraryGetKernel(@NativeType("CUkernel *") PointerBuffer pKernel, @NativeType("CUlibrary") long library, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pKernel, 1);
            checkNT1(name);
        }
        return ncuLibraryGetKernel(memAddress(pKernel), library, memAddress(name));
    }

    /** {@code CUresult cuLibraryGetKernel(CUkernel * pKernel, CUlibrary library, char const * name)} */
    @NativeType("CUresult")
    public static int cuLibraryGetKernel(@NativeType("CUkernel *") PointerBuffer pKernel, @NativeType("CUlibrary") long library, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(pKernel, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuLibraryGetKernel(memAddress(pKernel), library, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLibraryGetKernelCount ] ---

    /** {@code CUresult cuLibraryGetKernelCount(unsigned int * count, CUlibrary lib)} */
    public static int ncuLibraryGetKernelCount(long count, long lib) {
        long __functionAddress = Functions.LibraryGetKernelCount;
        if (CHECKS) {
            check(__functionAddress);
            check(lib);
        }
        return callPPI(count, lib, __functionAddress);
    }

    /** {@code CUresult cuLibraryGetKernelCount(unsigned int * count, CUlibrary lib)} */
    @NativeType("CUresult")
    public static int cuLibraryGetKernelCount(@NativeType("unsigned int *") IntBuffer count, @NativeType("CUlibrary") long lib) {
        if (CHECKS) {
            check(count, 1);
        }
        return ncuLibraryGetKernelCount(memAddress(count), lib);
    }

    // --- [ cuLibraryEnumerateKernels ] ---

    /** {@code CUresult cuLibraryEnumerateKernels(CUkernel * kernels, unsigned int numKernels, CUlibrary lib)} */
    public static int ncuLibraryEnumerateKernels(long kernels, int numKernels, long lib) {
        long __functionAddress = Functions.LibraryEnumerateKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(lib);
        }
        return callPPI(kernels, numKernels, lib, __functionAddress);
    }

    /** {@code CUresult cuLibraryEnumerateKernels(CUkernel * kernels, unsigned int numKernels, CUlibrary lib)} */
    @NativeType("CUresult")
    public static int cuLibraryEnumerateKernels(@NativeType("CUkernel *") PointerBuffer kernels, @NativeType("CUlibrary") long lib) {
        return ncuLibraryEnumerateKernels(memAddress(kernels), kernels.remaining(), lib);
    }

    // --- [ cuLibraryGetModule ] ---

    /** {@code CUresult cuLibraryGetModule(CUmodule * pMod, CUlibrary library)} */
    public static int ncuLibraryGetModule(long pMod, long library) {
        long __functionAddress = Functions.LibraryGetModule;
        if (CHECKS) {
            check(__functionAddress);
            check(library);
        }
        return callPPI(pMod, library, __functionAddress);
    }

    /** {@code CUresult cuLibraryGetModule(CUmodule * pMod, CUlibrary library)} */
    @NativeType("CUresult")
    public static int cuLibraryGetModule(@NativeType("CUmodule *") PointerBuffer pMod, @NativeType("CUlibrary") long library) {
        if (CHECKS) {
            check(pMod, 1);
        }
        return ncuLibraryGetModule(memAddress(pMod), library);
    }

    // --- [ cuKernelGetFunction ] ---

    /** {@code CUresult cuKernelGetFunction(CUfunction * pFunc, CUkernel kernel)} */
    public static int ncuKernelGetFunction(long pFunc, long kernel) {
        long __functionAddress = Functions.KernelGetFunction;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(pFunc, kernel, __functionAddress);
    }

    /** {@code CUresult cuKernelGetFunction(CUfunction * pFunc, CUkernel kernel)} */
    @NativeType("CUresult")
    public static int cuKernelGetFunction(@NativeType("CUfunction *") PointerBuffer pFunc, @NativeType("CUkernel") long kernel) {
        if (CHECKS) {
            check(pFunc, 1);
        }
        return ncuKernelGetFunction(memAddress(pFunc), kernel);
    }

    // --- [ cuKernelGetLibrary ] ---

    /** {@code CUresult cuKernelGetLibrary(CUlibrary * pLib, CUkernel kernel)} */
    public static int ncuKernelGetLibrary(long pLib, long kernel) {
        long __functionAddress = Functions.KernelGetLibrary;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(pLib, kernel, __functionAddress);
    }

    /** {@code CUresult cuKernelGetLibrary(CUlibrary * pLib, CUkernel kernel)} */
    @NativeType("CUresult")
    public static int cuKernelGetLibrary(@NativeType("CUlibrary *") PointerBuffer pLib, @NativeType("CUkernel") long kernel) {
        if (CHECKS) {
            check(pLib, 1);
        }
        return ncuKernelGetLibrary(memAddress(pLib), kernel);
    }

    // --- [ cuLibraryGetGlobal ] ---

    /** {@code CUresult cuLibraryGetGlobal(CUdeviceptr * dptr, size_t * bytes, CUlibrary library, char const * name)} */
    public static int ncuLibraryGetGlobal(long dptr, long bytes, long library, long name) {
        long __functionAddress = Functions.LibraryGetGlobal;
        if (CHECKS) {
            check(__functionAddress);
            check(library);
        }
        return callPPPPI(dptr, bytes, library, name, __functionAddress);
    }

    /** {@code CUresult cuLibraryGetGlobal(CUdeviceptr * dptr, size_t * bytes, CUlibrary library, char const * name)} */
    @NativeType("CUresult")
    public static int cuLibraryGetGlobal(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUlibrary") long library, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(dptr, 1);
            check(bytes, 1);
            checkNT1(name);
        }
        return ncuLibraryGetGlobal(memAddress(dptr), memAddress(bytes), library, memAddress(name));
    }

    /** {@code CUresult cuLibraryGetGlobal(CUdeviceptr * dptr, size_t * bytes, CUlibrary library, char const * name)} */
    @NativeType("CUresult")
    public static int cuLibraryGetGlobal(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUlibrary") long library, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(dptr, 1);
            check(bytes, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuLibraryGetGlobal(memAddress(dptr), memAddress(bytes), library, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLibraryGetManaged ] ---

    /** {@code CUresult cuLibraryGetManaged(CUdeviceptr * dptr, size_t * bytes, CUlibrary library, char const * name)} */
    public static int ncuLibraryGetManaged(long dptr, long bytes, long library, long name) {
        long __functionAddress = Functions.LibraryGetManaged;
        if (CHECKS) {
            check(__functionAddress);
            check(library);
        }
        return callPPPPI(dptr, bytes, library, name, __functionAddress);
    }

    /** {@code CUresult cuLibraryGetManaged(CUdeviceptr * dptr, size_t * bytes, CUlibrary library, char const * name)} */
    @NativeType("CUresult")
    public static int cuLibraryGetManaged(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUlibrary") long library, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(dptr, 1);
            check(bytes, 1);
            checkNT1(name);
        }
        return ncuLibraryGetManaged(memAddress(dptr), memAddress(bytes), library, memAddress(name));
    }

    /** {@code CUresult cuLibraryGetManaged(CUdeviceptr * dptr, size_t * bytes, CUlibrary library, char const * name)} */
    @NativeType("CUresult")
    public static int cuLibraryGetManaged(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUlibrary") long library, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(dptr, 1);
            check(bytes, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuLibraryGetManaged(memAddress(dptr), memAddress(bytes), library, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLibraryGetUnifiedFunction ] ---

    /** {@code CUresult cuLibraryGetUnifiedFunction(void ** fptr, CUlibrary library, char const * symbol)} */
    public static int ncuLibraryGetUnifiedFunction(long fptr, long library, long symbol) {
        long __functionAddress = Functions.LibraryGetUnifiedFunction;
        if (CHECKS) {
            check(__functionAddress);
            check(library);
        }
        return callPPPI(fptr, library, symbol, __functionAddress);
    }

    /** {@code CUresult cuLibraryGetUnifiedFunction(void ** fptr, CUlibrary library, char const * symbol)} */
    @NativeType("CUresult")
    public static int cuLibraryGetUnifiedFunction(@NativeType("void **") PointerBuffer fptr, @NativeType("CUlibrary") long library, @NativeType("char const *") ByteBuffer symbol) {
        if (CHECKS) {
            check(fptr, 1);
            checkNT1(symbol);
        }
        return ncuLibraryGetUnifiedFunction(memAddress(fptr), library, memAddress(symbol));
    }

    /** {@code CUresult cuLibraryGetUnifiedFunction(void ** fptr, CUlibrary library, char const * symbol)} */
    @NativeType("CUresult")
    public static int cuLibraryGetUnifiedFunction(@NativeType("void **") PointerBuffer fptr, @NativeType("CUlibrary") long library, @NativeType("char const *") CharSequence symbol) {
        if (CHECKS) {
            check(fptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(symbol, true);
            long symbolEncoded = stack.getPointerAddress();
            return ncuLibraryGetUnifiedFunction(memAddress(fptr), library, symbolEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuKernelGetAttribute ] ---

    /** {@code CUresult cuKernelGetAttribute(int * pi, CUfunction_attribute attrib, CUkernel kernel, CUdevice dev)} */
    public static int ncuKernelGetAttribute(long pi, int attrib, long kernel, int dev) {
        long __functionAddress = Functions.KernelGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(pi, attrib, kernel, dev, __functionAddress);
    }

    /** {@code CUresult cuKernelGetAttribute(int * pi, CUfunction_attribute attrib, CUkernel kernel, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuKernelGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUfunction_attribute") int attrib, @NativeType("CUkernel") long kernel, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuKernelGetAttribute(memAddress(pi), attrib, kernel, dev);
    }

    // --- [ cuKernelSetAttribute ] ---

    /** {@code CUresult cuKernelSetAttribute(CUfunction_attribute attrib, int val, CUkernel kernel, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuKernelSetAttribute(@NativeType("CUfunction_attribute") int attrib, int val, @NativeType("CUkernel") long kernel, @NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.KernelSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPI(attrib, val, kernel, dev, __functionAddress);
    }

    // --- [ cuKernelSetCacheConfig ] ---

    /** {@code CUresult cuKernelSetCacheConfig(CUkernel kernel, CUfunc_cache config, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuKernelSetCacheConfig(@NativeType("CUkernel") long kernel, @NativeType("CUfunc_cache") int config, @NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.KernelSetCacheConfig;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPI(kernel, config, dev, __functionAddress);
    }

    // --- [ cuKernelGetName ] ---

    /** {@code CUresult cuKernelGetName(char const ** name, CUkernel hfunc)} */
    public static int ncuKernelGetName(long name, long hfunc) {
        long __functionAddress = Functions.KernelGetName;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPPI(name, hfunc, __functionAddress);
    }

    /** {@code CUresult cuKernelGetName(char const ** name, CUkernel hfunc)} */
    @NativeType("CUresult")
    public static int cuKernelGetName(@NativeType("char const **") PointerBuffer name, @NativeType("CUkernel") long hfunc) {
        if (CHECKS) {
            check(name, 1);
        }
        return ncuKernelGetName(memAddress(name), hfunc);
    }

    // --- [ cuKernelGetParamInfo ] ---

    /** {@code CUresult cuKernelGetParamInfo(CUkernel kernel, size_t paramIndex, size_t * paramOffset, size_t * paramSize)} */
    public static int ncuKernelGetParamInfo(long kernel, long paramIndex, long paramOffset, long paramSize) {
        long __functionAddress = Functions.KernelGetParamInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPI(kernel, paramIndex, paramOffset, paramSize, __functionAddress);
    }

    /** {@code CUresult cuKernelGetParamInfo(CUkernel kernel, size_t paramIndex, size_t * paramOffset, size_t * paramSize)} */
    @NativeType("CUresult")
    public static int cuKernelGetParamInfo(@NativeType("CUkernel") long kernel, @NativeType("size_t") long paramIndex, @NativeType("size_t *") @Nullable PointerBuffer paramOffset, @NativeType("size_t *") @Nullable PointerBuffer paramSize) {
        if (CHECKS) {
            checkSafe(paramOffset, 1);
            checkSafe(paramSize, 1);
        }
        return ncuKernelGetParamInfo(kernel, paramIndex, memAddressSafe(paramOffset), memAddressSafe(paramSize));
    }

    // --- [ cuMemGetInfo ] ---

    /** {@code CUresult cuMemGetInfo(size_t * free, size_t * total)} */
    public static int ncuMemGetInfo(long free, long total) {
        long __functionAddress = Functions.MemGetInfo;
        return callPPI(free, total, __functionAddress);
    }

    /** {@code CUresult cuMemGetInfo(size_t * free, size_t * total)} */
    @NativeType("CUresult")
    public static int cuMemGetInfo(@NativeType("size_t *") PointerBuffer free, @NativeType("size_t *") PointerBuffer total) {
        if (CHECKS) {
            check(free, 1);
            check(total, 1);
        }
        return ncuMemGetInfo(memAddress(free), memAddress(total));
    }

    // --- [ cuMemAlloc ] ---

    /** {@code CUresult cuMemAlloc(CUdeviceptr * dptr, size_t bytesize)} */
    public static int ncuMemAlloc(long dptr, long bytesize) {
        long __functionAddress = Functions.MemAlloc;
        return callPPI(dptr, bytesize, __functionAddress);
    }

    /** {@code CUresult cuMemAlloc(CUdeviceptr * dptr, size_t bytesize)} */
    @NativeType("CUresult")
    public static int cuMemAlloc(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAlloc(memAddress(dptr), bytesize);
    }

    // --- [ cuMemAllocPitch ] ---

    /** {@code CUresult cuMemAllocPitch(CUdeviceptr * dptr, size_t * pPitch, size_t WidthInBytes, size_t Height, unsigned int ElementSizeBytes)} */
    public static int ncuMemAllocPitch(long dptr, long pPitch, long WidthInBytes, long Height, int ElementSizeBytes) {
        long __functionAddress = Functions.MemAllocPitch;
        return callPPPPI(dptr, pPitch, WidthInBytes, Height, ElementSizeBytes, __functionAddress);
    }

    /** {@code CUresult cuMemAllocPitch(CUdeviceptr * dptr, size_t * pPitch, size_t WidthInBytes, size_t Height, unsigned int ElementSizeBytes)} */
    @NativeType("CUresult")
    public static int cuMemAllocPitch(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer pPitch, @NativeType("size_t") long WidthInBytes, @NativeType("size_t") long Height, @NativeType("unsigned int") int ElementSizeBytes) {
        if (CHECKS) {
            check(dptr, 1);
            check(pPitch, 1);
        }
        return ncuMemAllocPitch(memAddress(dptr), memAddress(pPitch), WidthInBytes, Height, ElementSizeBytes);
    }

    // --- [ cuMemFree ] ---

    /** {@code CUresult cuMemFree(CUdeviceptr dptr)} */
    @NativeType("CUresult")
    public static int cuMemFree(@NativeType("CUdeviceptr") long dptr) {
        long __functionAddress = Functions.MemFree;
        if (CHECKS) {
            check(dptr);
        }
        return callPI(dptr, __functionAddress);
    }

    // --- [ cuMemGetAddressRange ] ---

    /** {@code CUresult cuMemGetAddressRange(CUdeviceptr * pbase, size_t * psize, CUdeviceptr dptr)} */
    public static int ncuMemGetAddressRange(long pbase, long psize, long dptr) {
        long __functionAddress = Functions.MemGetAddressRange;
        if (CHECKS) {
            check(dptr);
        }
        return callPPPI(pbase, psize, dptr, __functionAddress);
    }

    /** {@code CUresult cuMemGetAddressRange(CUdeviceptr * pbase, size_t * psize, CUdeviceptr dptr)} */
    @NativeType("CUresult")
    public static int cuMemGetAddressRange(@NativeType("CUdeviceptr *") @Nullable PointerBuffer pbase, @NativeType("size_t *") @Nullable PointerBuffer psize, @NativeType("CUdeviceptr") long dptr) {
        if (CHECKS) {
            checkSafe(pbase, 1);
            checkSafe(psize, 1);
        }
        return ncuMemGetAddressRange(memAddressSafe(pbase), memAddressSafe(psize), dptr);
    }

    // --- [ cuMemAllocHost ] ---

    /** {@code CUresult cuMemAllocHost(void ** pp, size_t bytesize)} */
    public static int ncuMemAllocHost(long pp, long bytesize) {
        long __functionAddress = Functions.MemAllocHost;
        return callPPI(pp, bytesize, __functionAddress);
    }

    /** {@code CUresult cuMemAllocHost(void ** pp, size_t bytesize)} */
    @NativeType("CUresult")
    public static int cuMemAllocHost(@NativeType("void **") PointerBuffer pp, @NativeType("size_t") long bytesize) {
        if (CHECKS) {
            check(pp, 1);
        }
        return ncuMemAllocHost(memAddress(pp), bytesize);
    }

    // --- [ cuMemFreeHost ] ---

    /** {@code CUresult cuMemFreeHost(void * p)} */
    public static int ncuMemFreeHost(long p) {
        long __functionAddress = Functions.MemFreeHost;
        return callPI(p, __functionAddress);
    }

    /** {@code CUresult cuMemFreeHost(void * p)} */
    @NativeType("CUresult")
    public static int cuMemFreeHost(@NativeType("void *") ByteBuffer p) {
        return ncuMemFreeHost(memAddress(p));
    }

    // --- [ cuMemHostAlloc ] ---

    /** {@code CUresult cuMemHostAlloc(void ** pp, size_t bytesize, unsigned int Flags)} */
    public static int ncuMemHostAlloc(long pp, long bytesize, int Flags) {
        long __functionAddress = Functions.MemHostAlloc;
        return callPPI(pp, bytesize, Flags, __functionAddress);
    }

    /** {@code CUresult cuMemHostAlloc(void ** pp, size_t bytesize, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuMemHostAlloc(@NativeType("void **") PointerBuffer pp, @NativeType("size_t") long bytesize, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pp, 1);
        }
        return ncuMemHostAlloc(memAddress(pp), bytesize, Flags);
    }

    // --- [ cuMemHostGetDevicePointer ] ---

    /** {@code CUresult cuMemHostGetDevicePointer(CUdeviceptr * pdptr, void * p, unsigned int Flags)} */
    public static int ncuMemHostGetDevicePointer(long pdptr, long p, int Flags) {
        long __functionAddress = Functions.MemHostGetDevicePointer;
        return callPPI(pdptr, p, Flags, __functionAddress);
    }

    /** {@code CUresult cuMemHostGetDevicePointer(CUdeviceptr * pdptr, void * p, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuMemHostGetDevicePointer(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("void *") ByteBuffer p, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuMemHostGetDevicePointer(memAddress(pdptr), memAddress(p), Flags);
    }

    // --- [ cuMemHostGetFlags ] ---

    /** {@code CUresult cuMemHostGetFlags(unsigned int * pFlags, void * p)} */
    public static int ncuMemHostGetFlags(long pFlags, long p) {
        long __functionAddress = Functions.MemHostGetFlags;
        return callPPI(pFlags, p, __functionAddress);
    }

    /** {@code CUresult cuMemHostGetFlags(unsigned int * pFlags, void * p)} */
    @NativeType("CUresult")
    public static int cuMemHostGetFlags(@NativeType("unsigned int *") IntBuffer pFlags, @NativeType("void *") ByteBuffer p) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return ncuMemHostGetFlags(memAddress(pFlags), memAddress(p));
    }

    // --- [ cuMemAllocManaged ] ---

    /** {@code CUresult cuMemAllocManaged(CUdeviceptr * dptr, size_t bytesize, unsigned int flags)} */
    public static int ncuMemAllocManaged(long dptr, long bytesize, int flags) {
        long __functionAddress = Functions.MemAllocManaged;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dptr, bytesize, flags, __functionAddress);
    }

    /** {@code CUresult cuMemAllocManaged(CUdeviceptr * dptr, size_t bytesize, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuMemAllocManaged(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocManaged(memAddress(dptr), bytesize, flags);
    }

    // --- [ cuDeviceRegisterAsyncNotification ] ---

    /** {@code CUresult cuDeviceRegisterAsyncNotification(CUdevice device, void (*) (CUasyncNotificationInfo *, void *, CUasyncCallbackHandle) callbackFunc, void * userData, CUasyncCallbackHandle * callback)} */
    public static int ncuDeviceRegisterAsyncNotification(int device, long callbackFunc, long userData, long callback) {
        long __functionAddress = Functions.DeviceRegisterAsyncNotification;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device, callbackFunc, userData, callback, __functionAddress);
    }

    /** {@code CUresult cuDeviceRegisterAsyncNotification(CUdevice device, void (*) (CUasyncNotificationInfo *, void *, CUasyncCallbackHandle) callbackFunc, void * userData, CUasyncCallbackHandle * callback)} */
    @NativeType("CUresult")
    public static int cuDeviceRegisterAsyncNotification(@NativeType("CUdevice") int device, @NativeType("void (*) (CUasyncNotificationInfo *, void *, CUasyncCallbackHandle)") CUasyncCallbackI callbackFunc, @NativeType("void *") long userData, @NativeType("CUasyncCallbackHandle *") PointerBuffer callback) {
        if (CHECKS) {
            check(callback, 1);
        }
        return ncuDeviceRegisterAsyncNotification(device, callbackFunc.address(), userData, memAddress(callback));
    }

    // --- [ cuDeviceUnregisterAsyncNotification ] ---

    /** {@code CUresult cuDeviceUnregisterAsyncNotification(CUdevice device, CUasyncCallbackHandle callback)} */
    @NativeType("CUresult")
    public static int cuDeviceUnregisterAsyncNotification(@NativeType("CUdevice") int device, @NativeType("CUasyncCallbackHandle") long callback) {
        long __functionAddress = Functions.DeviceUnregisterAsyncNotification;
        if (CHECKS) {
            check(__functionAddress);
            check(callback);
        }
        return callPI(device, callback, __functionAddress);
    }

    // --- [ cuDeviceGetByPCIBusId ] ---

    /** {@code CUresult cuDeviceGetByPCIBusId(CUdevice * dev, char const * pciBusId)} */
    public static int ncuDeviceGetByPCIBusId(long dev, long pciBusId) {
        long __functionAddress = Functions.DeviceGetByPCIBusId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dev, pciBusId, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetByPCIBusId(CUdevice * dev, char const * pciBusId)} */
    @NativeType("CUresult")
    public static int cuDeviceGetByPCIBusId(@NativeType("CUdevice *") IntBuffer dev, @NativeType("char const *") ByteBuffer pciBusId) {
        if (CHECKS) {
            check(dev, 1);
            checkNT1(pciBusId);
        }
        return ncuDeviceGetByPCIBusId(memAddress(dev), memAddress(pciBusId));
    }

    /** {@code CUresult cuDeviceGetByPCIBusId(CUdevice * dev, char const * pciBusId)} */
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

    /** {@code CUresult cuDeviceGetPCIBusId(char * pciBusId, int len, CUdevice dev)} */
    public static int ncuDeviceGetPCIBusId(long pciBusId, int len, int dev) {
        long __functionAddress = Functions.DeviceGetPCIBusId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pciBusId, len, dev, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetPCIBusId(char * pciBusId, int len, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuDeviceGetPCIBusId(@NativeType("char *") ByteBuffer pciBusId, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetPCIBusId(memAddress(pciBusId), pciBusId.remaining(), dev);
    }

    // --- [ cuIpcGetEventHandle ] ---

    /** {@code CUresult cuIpcGetEventHandle(CUipcEventHandle * pHandle, CUevent event)} */
    public static int ncuIpcGetEventHandle(long pHandle, long event) {
        long __functionAddress = Functions.IpcGetEventHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(event);
        }
        return callPPI(pHandle, event, __functionAddress);
    }

    /** {@code CUresult cuIpcGetEventHandle(CUipcEventHandle * pHandle, CUevent event)} */
    @NativeType("CUresult")
    public static int cuIpcGetEventHandle(@NativeType("CUipcEventHandle *") CUIPCEventHandle pHandle, @NativeType("CUevent") long event) {
        return ncuIpcGetEventHandle(pHandle.address(), event);
    }

    // --- [ cuIpcOpenEventHandle ] ---

    private static final FFICIF cuIpcOpenEventHandleCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(apiCreateArray(ffi_type_sint8, CU_IPC_HANDLE_SIZE))
    );

    /** {@code CUresult cuIpcOpenEventHandle(CUevent * phEvent, CUipcEventHandle handle)} */
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

    /** {@code CUresult cuIpcOpenEventHandle(CUevent * phEvent, CUipcEventHandle handle)} */
    @NativeType("CUresult")
    public static int cuIpcOpenEventHandle(@NativeType("CUevent *") PointerBuffer phEvent, @NativeType("CUipcEventHandle") CUIPCEventHandle handle) {
        if (CHECKS) {
            check(phEvent, 1);
        }
        return ncuIpcOpenEventHandle(memAddress(phEvent), handle.address());
    }

    // --- [ cuIpcGetMemHandle ] ---

    /** {@code CUresult cuIpcGetMemHandle(CUipcMemHandle * pHandle, CUdeviceptr dptr)} */
    public static int ncuIpcGetMemHandle(long pHandle, long dptr) {
        long __functionAddress = Functions.IpcGetMemHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(dptr);
        }
        return callPPI(pHandle, dptr, __functionAddress);
    }

    /** {@code CUresult cuIpcGetMemHandle(CUipcMemHandle * pHandle, CUdeviceptr dptr)} */
    @NativeType("CUresult")
    public static int cuIpcGetMemHandle(@NativeType("CUipcMemHandle *") CUIPCMemHandle pHandle, @NativeType("CUdeviceptr") long dptr) {
        return ncuIpcGetMemHandle(pHandle.address(), dptr);
    }

    // --- [ cuIpcOpenMemHandle ] ---

    private static final FFICIF cuIpcOpenMemHandleCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(apiCreateArray(ffi_type_sint8, CU_IPC_HANDLE_SIZE)), ffi_type_uint32
    );

    /** {@code CUresult cuIpcOpenMemHandle(CUdeviceptr * pdptr, CUipcMemHandle handle, unsigned int Flags)} */
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

    /** {@code CUresult cuIpcOpenMemHandle(CUdeviceptr * pdptr, CUipcMemHandle handle, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuIpcOpenMemHandle(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("CUipcMemHandle") CUIPCMemHandle handle, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuIpcOpenMemHandle(memAddress(pdptr), handle.address(), Flags);
    }

    // --- [ cuIpcCloseMemHandle ] ---

    /** {@code CUresult cuIpcCloseMemHandle(CUdeviceptr dptr)} */
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

    /** {@code CUresult cuMemHostRegister(void * p, size_t bytesize, unsigned int Flags)} */
    public static int ncuMemHostRegister(long p, long bytesize, int Flags) {
        long __functionAddress = Functions.MemHostRegister;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(p, bytesize, Flags, __functionAddress);
    }

    /** {@code CUresult cuMemHostRegister(void * p, size_t bytesize, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuMemHostRegister(@NativeType("void *") ByteBuffer p, @NativeType("unsigned int") int Flags) {
        return ncuMemHostRegister(memAddress(p), p.remaining(), Flags);
    }

    // --- [ cuMemHostUnregister ] ---

    /** {@code CUresult cuMemHostUnregister(void * p)} */
    public static int ncuMemHostUnregister(long p) {
        long __functionAddress = Functions.MemHostUnregister;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(p, __functionAddress);
    }

    /** {@code CUresult cuMemHostUnregister(void * p)} */
    @NativeType("CUresult")
    public static int cuMemHostUnregister(@NativeType("void *") ByteBuffer p) {
        return ncuMemHostUnregister(memAddress(p));
    }

    // --- [ cuMemcpy ] ---

    /** {@code CUresult cuMemcpy(CUdeviceptr dst, CUdeviceptr src, size_t ByteCount)} */
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

    /** {@code CUresult cuMemcpyPeer(CUdeviceptr dstDevice, CUcontext dstContext, CUdeviceptr srcDevice, CUcontext srcContext, size_t ByteCount)} */
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

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    public static int ncuMemcpyHtoD(long dstDevice, long srcHost, long ByteCount) {
        long __functionAddress = Functions.MemcpyHtoD;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, srcHost, ByteCount, __functionAddress);
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ByteBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), srcHost.remaining());
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ShortBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1);
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") IntBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") LongBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") FloatBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") DoubleBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyHtoD(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") PointerBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyDtoH ] ---

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    public static int ncuMemcpyDtoH(long dstHost, long srcDevice, long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoH;
        if (CHECKS) {
            check(srcDevice);
        }
        return callPPPI(dstHost, srcDevice, ByteCount, __functionAddress);
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, dstHost.remaining());
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 1);
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") IntBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") LongBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyDtoH(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyDtoD ] ---

    /** {@code CUresult cuMemcpyDtoD(CUdeviceptr dstDevice, CUdeviceptr srcDevice, size_t ByteCount)} */
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

    /** {@code CUresult cuMemcpyDtoA(CUarray dstArray, size_t dstOffset, CUdeviceptr srcDevice, size_t ByteCount)} */
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

    /** {@code CUresult cuMemcpyAtoD(CUdeviceptr dstDevice, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
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

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    public static int ncuMemcpyHtoA(long dstArray, long dstOffset, long srcHost, long ByteCount) {
        long __functionAddress = Functions.MemcpyHtoA;
        if (CHECKS) {
            check(dstArray);
        }
        return callPPPPI(dstArray, dstOffset, srcHost, ByteCount, __functionAddress);
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ByteBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), srcHost.remaining());
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ShortBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1);
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") IntBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") LongBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") FloatBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") DoubleBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyHtoA(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") PointerBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyAtoH ] ---

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    public static int ncuMemcpyAtoH(long dstHost, long srcArray, long srcOffset, long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoH;
        if (CHECKS) {
            check(srcArray);
        }
        return callPPPPI(dstHost, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, dstHost.remaining());
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 1);
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") IntBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") LongBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    /** {@code CUresult cuMemcpyAtoH(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyAtoA ] ---

    /** {@code CUresult cuMemcpyAtoA(CUarray dstArray, size_t dstOffset, CUarray srcArray, size_t srcOffset, size_t ByteCount)} */
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

    /** {@code CUresult cuMemcpy2D(CUDA_MEMCPY2D const * pCopy)} */
    public static int ncuMemcpy2D(long pCopy) {
        long __functionAddress = Functions.Memcpy2D;
        return callPI(pCopy, __functionAddress);
    }

    /** {@code CUresult cuMemcpy2D(CUDA_MEMCPY2D const * pCopy)} */
    @NativeType("CUresult")
    public static int cuMemcpy2D(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy) {
        return ncuMemcpy2D(pCopy.address());
    }

    // --- [ cuMemcpy2DUnaligned ] ---

    /** {@code CUresult cuMemcpy2DUnaligned(CUDA_MEMCPY2D const * pCopy)} */
    public static int ncuMemcpy2DUnaligned(long pCopy) {
        long __functionAddress = Functions.Memcpy2DUnaligned;
        return callPI(pCopy, __functionAddress);
    }

    /** {@code CUresult cuMemcpy2DUnaligned(CUDA_MEMCPY2D const * pCopy)} */
    @NativeType("CUresult")
    public static int cuMemcpy2DUnaligned(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy) {
        return ncuMemcpy2DUnaligned(pCopy.address());
    }

    // --- [ cuMemcpy3D ] ---

    /** {@code CUresult cuMemcpy3D(CUDA_MEMCPY3D const * pCopy)} */
    public static int ncuMemcpy3D(long pCopy) {
        long __functionAddress = Functions.Memcpy3D;
        return callPI(pCopy, __functionAddress);
    }

    /** {@code CUresult cuMemcpy3D(CUDA_MEMCPY3D const * pCopy)} */
    @NativeType("CUresult")
    public static int cuMemcpy3D(@NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D pCopy) {
        return ncuMemcpy3D(pCopy.address());
    }

    // --- [ cuMemcpy3DPeer ] ---

    /** {@code CUresult cuMemcpy3DPeer(CUDA_MEMCPY3D_PEER const * pCopy)} */
    public static int ncuMemcpy3DPeer(long pCopy) {
        long __functionAddress = Functions.Memcpy3DPeer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pCopy, __functionAddress);
    }

    /** {@code CUresult cuMemcpy3DPeer(CUDA_MEMCPY3D_PEER const * pCopy)} */
    @NativeType("CUresult")
    public static int cuMemcpy3DPeer(@NativeType("CUDA_MEMCPY3D_PEER const *") CUDA_MEMCPY3D_PEER pCopy) {
        return ncuMemcpy3DPeer(pCopy.address());
    }

    // --- [ cuMemcpyAsync ] ---

    /** {@code CUresult cuMemcpyAsync(CUdeviceptr dst, CUdeviceptr src, size_t ByteCount, CUstream hStream)} */
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

    /** {@code CUresult cuMemcpyPeerAsync(CUdeviceptr dstDevice, CUcontext dstContext, CUdeviceptr srcDevice, CUcontext srcContext, size_t ByteCount, CUstream hStream)} */
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

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    public static int ncuMemcpyHtoDAsync(long dstDevice, long srcHost, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyHtoDAsync;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, srcHost, ByteCount, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ByteBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), srcHost.remaining(), hStream);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ShortBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1, hStream);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") IntBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") LongBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") FloatBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") DoubleBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyHtoDAsync(CUdeviceptr dstDevice, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") PointerBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyDtoHAsync ] ---

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    public static int ncuMemcpyDtoHAsync(long dstHost, long srcDevice, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyDtoHAsync;
        if (CHECKS) {
            check(srcDevice);
        }
        return callPPPPI(dstHost, srcDevice, ByteCount, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, dstHost.remaining(), hStream);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 1, hStream);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") IntBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") LongBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyDtoHAsync(void * dstHost, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyDtoDAsync ] ---

    /** {@code CUresult cuMemcpyDtoDAsync(CUdeviceptr dstDevice, CUdeviceptr srcDevice, size_t ByteCount, CUstream hStream)} */
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

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    public static int ncuMemcpyHtoAAsync(long dstArray, long dstOffset, long srcHost, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyHtoAAsync;
        if (CHECKS) {
            check(dstArray);
        }
        return callPPPPPI(dstArray, dstOffset, srcHost, ByteCount, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ByteBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), srcHost.remaining(), hStream);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ShortBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1, hStream);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") IntBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") LongBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") FloatBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") DoubleBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyHtoAAsync(CUarray dstArray, size_t dstOffset, void const * srcHost, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") PointerBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyAtoHAsync ] ---

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    public static int ncuMemcpyAtoHAsync(long dstHost, long srcArray, long srcOffset, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyAtoHAsync;
        if (CHECKS) {
            check(srcArray);
        }
        return callPPPPPI(dstHost, srcArray, srcOffset, ByteCount, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, dstHost.remaining(), hStream);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 1, hStream);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") IntBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") LongBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    /** {@code CUresult cuMemcpyAtoHAsync(void * dstHost, CUarray srcArray, size_t srcOffset, size_t ByteCount, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpy2DAsync ] ---

    /** {@code CUresult cuMemcpy2DAsync(CUDA_MEMCPY2D const * pCopy, CUstream hStream)} */
    public static int ncuMemcpy2DAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy2DAsync;
        return callPPI(pCopy, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpy2DAsync(CUDA_MEMCPY2D const * pCopy, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpy2DAsync(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy2DAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemcpy3DAsync ] ---

    /** {@code CUresult cuMemcpy3DAsync(CUDA_MEMCPY3D const * pCopy, CUstream hStream)} */
    public static int ncuMemcpy3DAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy3DAsync;
        return callPPI(pCopy, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpy3DAsync(CUDA_MEMCPY3D const * pCopy, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpy3DAsync(@NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy3DAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemcpy3DPeerAsync ] ---

    /** {@code CUresult cuMemcpy3DPeerAsync(CUDA_MEMCPY3D_PEER const * pCopy, CUstream hStream)} */
    public static int ncuMemcpy3DPeerAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy3DPeerAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pCopy, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemcpy3DPeerAsync(CUDA_MEMCPY3D_PEER const * pCopy, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemcpy3DPeerAsync(@NativeType("CUDA_MEMCPY3D_PEER const *") CUDA_MEMCPY3D_PEER pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy3DPeerAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemsetD8 ] ---

    /** {@code CUresult cuMemsetD8(CUdeviceptr dstDevice, unsigned char uc, size_t N)} */
    @NativeType("CUresult")
    public static int cuMemsetD8(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned char") byte uc, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD8;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPUPI(dstDevice, uc, N, __functionAddress);
    }

    // --- [ cuMemsetD16 ] ---

    /** {@code CUresult cuMemsetD16(CUdeviceptr dstDevice, unsigned short us, size_t N)} */
    @NativeType("CUresult")
    public static int cuMemsetD16(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned short") short us, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD16;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPCPI(dstDevice, us, N, __functionAddress);
    }

    // --- [ cuMemsetD32 ] ---

    /** {@code CUresult cuMemsetD32(CUdeviceptr dstDevice, unsigned int ui, size_t N)} */
    @NativeType("CUresult")
    public static int cuMemsetD32(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned int") int ui, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD32;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, ui, N, __functionAddress);
    }

    // --- [ cuMemsetD2D8 ] ---

    /** {@code CUresult cuMemsetD2D8(CUdeviceptr dstDevice, size_t dstPitch, unsigned char uc, size_t Width, size_t Height)} */
    @NativeType("CUresult")
    public static int cuMemsetD2D8(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned char") byte uc, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D8;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPUPPI(dstDevice, dstPitch, uc, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD2D16 ] ---

    /** {@code CUresult cuMemsetD2D16(CUdeviceptr dstDevice, size_t dstPitch, unsigned short us, size_t Width, size_t Height)} */
    @NativeType("CUresult")
    public static int cuMemsetD2D16(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned short") short us, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D16;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPCPPI(dstDevice, dstPitch, us, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD2D32 ] ---

    /** {@code CUresult cuMemsetD2D32(CUdeviceptr dstDevice, size_t dstPitch, unsigned int ui, size_t Width, size_t Height)} */
    @NativeType("CUresult")
    public static int cuMemsetD2D32(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned int") int ui, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D32;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, ui, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD8Async ] ---

    /** {@code CUresult cuMemsetD8Async(CUdeviceptr dstDevice, unsigned char uc, size_t N, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemsetD8Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned char") byte uc, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD8Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPUPPI(dstDevice, uc, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD16Async ] ---

    /** {@code CUresult cuMemsetD16Async(CUdeviceptr dstDevice, unsigned short us, size_t N, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemsetD16Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned short") short us, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD16Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPCPPI(dstDevice, us, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD32Async ] ---

    /** {@code CUresult cuMemsetD32Async(CUdeviceptr dstDevice, unsigned int ui, size_t N, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemsetD32Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned int") int ui, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD32Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, ui, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D8Async ] ---

    /** {@code CUresult cuMemsetD2D8Async(CUdeviceptr dstDevice, size_t dstPitch, unsigned char uc, size_t Width, size_t Height, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemsetD2D8Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned char") byte uc, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D8Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPUPPPI(dstDevice, dstPitch, uc, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D16Async ] ---

    /** {@code CUresult cuMemsetD2D16Async(CUdeviceptr dstDevice, size_t dstPitch, unsigned short us, size_t Width, size_t Height, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemsetD2D16Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned short") short us, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D16Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPCPPPI(dstDevice, dstPitch, us, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D32Async ] ---

    /** {@code CUresult cuMemsetD2D32Async(CUdeviceptr dstDevice, size_t dstPitch, unsigned int ui, size_t Width, size_t Height, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemsetD2D32Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned int") int ui, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D32Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, ui, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuArrayCreate ] ---

    /** {@code CUresult cuArrayCreate(CUarray * pHandle, CUDA_ARRAY_DESCRIPTOR const * pAllocateArray)} */
    public static int ncuArrayCreate(long pHandle, long pAllocateArray) {
        long __functionAddress = Functions.ArrayCreate;
        return callPPI(pHandle, pAllocateArray, __functionAddress);
    }

    /** {@code CUresult cuArrayCreate(CUarray * pHandle, CUDA_ARRAY_DESCRIPTOR const * pAllocateArray)} */
    @NativeType("CUresult")
    public static int cuArrayCreate(@NativeType("CUarray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY_DESCRIPTOR const *") CUDA_ARRAY_DESCRIPTOR pAllocateArray) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuArrayCreate(memAddress(pHandle), pAllocateArray.address());
    }

    // --- [ cuArrayGetDescriptor ] ---

    /** {@code CUresult cuArrayGetDescriptor(CUDA_ARRAY_DESCRIPTOR * pArrayDescriptor, CUarray hArray)} */
    public static int ncuArrayGetDescriptor(long pArrayDescriptor, long hArray) {
        long __functionAddress = Functions.ArrayGetDescriptor;
        if (CHECKS) {
            check(hArray);
        }
        return callPPI(pArrayDescriptor, hArray, __functionAddress);
    }

    /** {@code CUresult cuArrayGetDescriptor(CUDA_ARRAY_DESCRIPTOR * pArrayDescriptor, CUarray hArray)} */
    @NativeType("CUresult")
    public static int cuArrayGetDescriptor(@NativeType("CUDA_ARRAY_DESCRIPTOR *") CUDA_ARRAY_DESCRIPTOR pArrayDescriptor, @NativeType("CUarray") long hArray) {
        return ncuArrayGetDescriptor(pArrayDescriptor.address(), hArray);
    }

    // --- [ cuArrayGetSparseProperties ] ---

    /** {@code CUresult cuArrayGetSparseProperties(CUDA_ARRAY_SPARSE_PROPERTIES * sparseProperties, CUarray array)} */
    public static int ncuArrayGetSparseProperties(long sparseProperties, long array) {
        long __functionAddress = Functions.ArrayGetSparseProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(array);
        }
        return callPPI(sparseProperties, array, __functionAddress);
    }

    /** {@code CUresult cuArrayGetSparseProperties(CUDA_ARRAY_SPARSE_PROPERTIES * sparseProperties, CUarray array)} */
    @NativeType("CUresult")
    public static int cuArrayGetSparseProperties(@NativeType("CUDA_ARRAY_SPARSE_PROPERTIES *") CUDA_ARRAY_SPARSE_PROPERTIES sparseProperties, @NativeType("CUarray") long array) {
        return ncuArrayGetSparseProperties(sparseProperties.address(), array);
    }

    // --- [ cuMipmappedArrayGetSparseProperties ] ---

    /** {@code CUresult cuMipmappedArrayGetSparseProperties(CUDA_ARRAY_SPARSE_PROPERTIES * sparseProperties, CUmipmappedArray mipmap)} */
    public static int ncuMipmappedArrayGetSparseProperties(long sparseProperties, long mipmap) {
        long __functionAddress = Functions.MipmappedArrayGetSparseProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(mipmap);
        }
        return callPPI(sparseProperties, mipmap, __functionAddress);
    }

    /** {@code CUresult cuMipmappedArrayGetSparseProperties(CUDA_ARRAY_SPARSE_PROPERTIES * sparseProperties, CUmipmappedArray mipmap)} */
    @NativeType("CUresult")
    public static int cuMipmappedArrayGetSparseProperties(@NativeType("CUDA_ARRAY_SPARSE_PROPERTIES *") CUDA_ARRAY_SPARSE_PROPERTIES sparseProperties, @NativeType("CUmipmappedArray") long mipmap) {
        return ncuMipmappedArrayGetSparseProperties(sparseProperties.address(), mipmap);
    }

    // --- [ cuArrayGetMemoryRequirements ] ---

    /** {@code CUresult cuArrayGetMemoryRequirements(CUDA_ARRAY_MEMORY_REQUIREMENTS * memoryRequirements, CUarray array, CUdevice device)} */
    public static int ncuArrayGetMemoryRequirements(long memoryRequirements, long array, int device) {
        long __functionAddress = Functions.ArrayGetMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            check(array);
        }
        return callPPI(memoryRequirements, array, device, __functionAddress);
    }

    /** {@code CUresult cuArrayGetMemoryRequirements(CUDA_ARRAY_MEMORY_REQUIREMENTS * memoryRequirements, CUarray array, CUdevice device)} */
    @NativeType("CUresult")
    public static int cuArrayGetMemoryRequirements(@NativeType("CUDA_ARRAY_MEMORY_REQUIREMENTS *") CUDA_ARRAY_MEMORY_REQUIREMENTS memoryRequirements, @NativeType("CUarray") long array, @NativeType("CUdevice") int device) {
        return ncuArrayGetMemoryRequirements(memoryRequirements.address(), array, device);
    }

    // --- [ cuMipmappedArrayGetMemoryRequirements ] ---

    /** {@code CUresult cuMipmappedArrayGetMemoryRequirements(CUDA_ARRAY_MEMORY_REQUIREMENTS * memoryRequirements, CUmipmappedArray mipmap, CUdevice device)} */
    public static int ncuMipmappedArrayGetMemoryRequirements(long memoryRequirements, long mipmap, int device) {
        long __functionAddress = Functions.MipmappedArrayGetMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            check(mipmap);
        }
        return callPPI(memoryRequirements, mipmap, device, __functionAddress);
    }

    /** {@code CUresult cuMipmappedArrayGetMemoryRequirements(CUDA_ARRAY_MEMORY_REQUIREMENTS * memoryRequirements, CUmipmappedArray mipmap, CUdevice device)} */
    @NativeType("CUresult")
    public static int cuMipmappedArrayGetMemoryRequirements(@NativeType("CUDA_ARRAY_MEMORY_REQUIREMENTS *") CUDA_ARRAY_MEMORY_REQUIREMENTS memoryRequirements, @NativeType("CUmipmappedArray") long mipmap, @NativeType("CUdevice") int device) {
        return ncuMipmappedArrayGetMemoryRequirements(memoryRequirements.address(), mipmap, device);
    }

    // --- [ cuArrayGetPlane ] ---

    /** {@code CUresult cuArrayGetPlane(CUarray * pPlaneArray, CUarray hArray, unsigned int planeIdx)} */
    public static int ncuArrayGetPlane(long pPlaneArray, long hArray, int planeIdx) {
        long __functionAddress = Functions.ArrayGetPlane;
        if (CHECKS) {
            check(__functionAddress);
            check(hArray);
        }
        return callPPI(pPlaneArray, hArray, planeIdx, __functionAddress);
    }

    /** {@code CUresult cuArrayGetPlane(CUarray * pPlaneArray, CUarray hArray, unsigned int planeIdx)} */
    @NativeType("CUresult")
    public static int cuArrayGetPlane(@NativeType("CUarray *") PointerBuffer pPlaneArray, @NativeType("CUarray") long hArray, @NativeType("unsigned int") int planeIdx) {
        if (CHECKS) {
            check(pPlaneArray, 1);
        }
        return ncuArrayGetPlane(memAddress(pPlaneArray), hArray, planeIdx);
    }

    // --- [ cuArrayDestroy ] ---

    /** {@code CUresult cuArrayDestroy(CUarray hArray)} */
    @NativeType("CUresult")
    public static int cuArrayDestroy(@NativeType("CUarray") long hArray) {
        long __functionAddress = Functions.ArrayDestroy;
        if (CHECKS) {
            check(hArray);
        }
        return callPI(hArray, __functionAddress);
    }

    // --- [ cuArray3DCreate ] ---

    /** {@code CUresult cuArray3DCreate(CUarray * pHandle, CUDA_ARRAY3D_DESCRIPTOR const * pAllocateArray)} */
    public static int ncuArray3DCreate(long pHandle, long pAllocateArray) {
        long __functionAddress = Functions.Array3DCreate;
        return callPPI(pHandle, pAllocateArray, __functionAddress);
    }

    /** {@code CUresult cuArray3DCreate(CUarray * pHandle, CUDA_ARRAY3D_DESCRIPTOR const * pAllocateArray)} */
    @NativeType("CUresult")
    public static int cuArray3DCreate(@NativeType("CUarray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY3D_DESCRIPTOR const *") CUDA_ARRAY3D_DESCRIPTOR pAllocateArray) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuArray3DCreate(memAddress(pHandle), pAllocateArray.address());
    }

    // --- [ cuArray3DGetDescriptor ] ---

    /** {@code CUresult cuArray3DGetDescriptor(CUDA_ARRAY3D_DESCRIPTOR * pArrayDescriptor, CUarray hArray)} */
    public static int ncuArray3DGetDescriptor(long pArrayDescriptor, long hArray) {
        long __functionAddress = Functions.Array3DGetDescriptor;
        if (CHECKS) {
            check(hArray);
        }
        return callPPI(pArrayDescriptor, hArray, __functionAddress);
    }

    /** {@code CUresult cuArray3DGetDescriptor(CUDA_ARRAY3D_DESCRIPTOR * pArrayDescriptor, CUarray hArray)} */
    @NativeType("CUresult")
    public static int cuArray3DGetDescriptor(@NativeType("CUDA_ARRAY3D_DESCRIPTOR *") CUDA_ARRAY3D_DESCRIPTOR pArrayDescriptor, @NativeType("CUarray") long hArray) {
        return ncuArray3DGetDescriptor(pArrayDescriptor.address(), hArray);
    }

    // --- [ cuMipmappedArrayCreate ] ---

    /** {@code CUresult cuMipmappedArrayCreate(CUmipmappedArray * pHandle, CUDA_ARRAY3D_DESCRIPTOR const * pMipmappedArrayDesc, unsigned int numMipmapLevels)} */
    public static int ncuMipmappedArrayCreate(long pHandle, long pMipmappedArrayDesc, int numMipmapLevels) {
        long __functionAddress = Functions.MipmappedArrayCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pHandle, pMipmappedArrayDesc, numMipmapLevels, __functionAddress);
    }

    /** {@code CUresult cuMipmappedArrayCreate(CUmipmappedArray * pHandle, CUDA_ARRAY3D_DESCRIPTOR const * pMipmappedArrayDesc, unsigned int numMipmapLevels)} */
    @NativeType("CUresult")
    public static int cuMipmappedArrayCreate(@NativeType("CUmipmappedArray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY3D_DESCRIPTOR const *") CUDA_ARRAY3D_DESCRIPTOR pMipmappedArrayDesc, @NativeType("unsigned int") int numMipmapLevels) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuMipmappedArrayCreate(memAddress(pHandle), pMipmappedArrayDesc.address(), numMipmapLevels);
    }

    // --- [ cuMipmappedArrayGetLevel ] ---

    /** {@code CUresult cuMipmappedArrayGetLevel(CUarray * pLevelArray, CUmipmappedArray hMipmappedArray, unsigned int level)} */
    public static int ncuMipmappedArrayGetLevel(long pLevelArray, long hMipmappedArray, int level) {
        long __functionAddress = Functions.MipmappedArrayGetLevel;
        if (CHECKS) {
            check(__functionAddress);
            check(hMipmappedArray);
        }
        return callPPI(pLevelArray, hMipmappedArray, level, __functionAddress);
    }

    /** {@code CUresult cuMipmappedArrayGetLevel(CUarray * pLevelArray, CUmipmappedArray hMipmappedArray, unsigned int level)} */
    @NativeType("CUresult")
    public static int cuMipmappedArrayGetLevel(@NativeType("CUarray *") PointerBuffer pLevelArray, @NativeType("CUmipmappedArray") long hMipmappedArray, @NativeType("unsigned int") int level) {
        if (CHECKS) {
            check(pLevelArray, 1);
        }
        return ncuMipmappedArrayGetLevel(memAddress(pLevelArray), hMipmappedArray, level);
    }

    // --- [ cuMipmappedArrayDestroy ] ---

    /** {@code CUresult cuMipmappedArrayDestroy(CUmipmappedArray hMipmappedArray)} */
    @NativeType("CUresult")
    public static int cuMipmappedArrayDestroy(@NativeType("CUmipmappedArray") long hMipmappedArray) {
        long __functionAddress = Functions.MipmappedArrayDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(hMipmappedArray);
        }
        return callPI(hMipmappedArray, __functionAddress);
    }

    // --- [ cuMemGetHandleForAddressRange ] ---

    /** {@code CUresult cuMemGetHandleForAddressRange(void * handle, CUdeviceptr dptr, size_t size, CUmemRangeHandleType handleType, unsigned long long flags)} */
    public static int ncuMemGetHandleForAddressRange(long handle, long dptr, long size, int handleType, long flags) {
        long __functionAddress = Functions.MemGetHandleForAddressRange;
        if (CHECKS) {
            check(__functionAddress);
            check(dptr);
        }
        return callPPPJI(handle, dptr, size, handleType, flags, __functionAddress);
    }

    /** {@code CUresult cuMemGetHandleForAddressRange(void * handle, CUdeviceptr dptr, size_t size, CUmemRangeHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemGetHandleForAddressRange(@NativeType("void *") ByteBuffer handle, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long size, @NativeType("CUmemRangeHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemGetHandleForAddressRange(memAddress(handle), dptr, size, handleType, flags);
    }

    // --- [ cuMemAddressReserve ] ---

    /** {@code CUresult cuMemAddressReserve(CUdeviceptr * ptr, size_t size, size_t alignment, CUdeviceptr addr, unsigned long long flags)} */
    public static int ncuMemAddressReserve(long ptr, long size, long alignment, long addr, long flags) {
        long __functionAddress = Functions.MemAddressReserve;
        if (CHECKS) {
            check(__functionAddress);
            check(addr);
        }
        return callPPPPJI(ptr, size, alignment, addr, flags, __functionAddress);
    }

    /** {@code CUresult cuMemAddressReserve(CUdeviceptr * ptr, size_t size, size_t alignment, CUdeviceptr addr, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemAddressReserve(@NativeType("CUdeviceptr *") PointerBuffer ptr, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("CUdeviceptr") long addr, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(ptr, 1);
        }
        return ncuMemAddressReserve(memAddress(ptr), size, alignment, addr, flags);
    }

    // --- [ cuMemAddressFree ] ---

    /** {@code CUresult cuMemAddressFree(CUdeviceptr ptr, size_t size)} */
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

    /** {@code CUresult cuMemCreate(CUmemGenericAllocationHandle * handle, size_t size, CUmemAllocationProp const * prop, unsigned long long flags)} */
    public static int ncuMemCreate(long handle, long size, long prop, long flags) {
        long __functionAddress = Functions.MemCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPJI(handle, size, prop, flags, __functionAddress);
    }

    /** {@code CUresult cuMemCreate(CUmemGenericAllocationHandle * handle, size_t size, CUmemAllocationProp const * prop, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemCreate(@NativeType("CUmemGenericAllocationHandle *") LongBuffer handle, @NativeType("size_t") long size, @NativeType("CUmemAllocationProp const *") CUmemAllocationProp prop, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(handle, 1);
        }
        return ncuMemCreate(memAddress(handle), size, prop.address(), flags);
    }

    // --- [ cuMemRelease ] ---

    /** {@code CUresult cuMemRelease(CUmemGenericAllocationHandle handle)} */
    @NativeType("CUresult")
    public static int cuMemRelease(@NativeType("CUmemGenericAllocationHandle") long handle) {
        long __functionAddress = Functions.MemRelease;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(handle, __functionAddress);
    }

    // --- [ cuMemMap ] ---

    /** {@code CUresult cuMemMap(CUdeviceptr ptr, size_t size, size_t offset, CUmemGenericAllocationHandle handle, unsigned long long flags)} */
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

    /** {@code CUresult cuMemMapArrayAsync(CUarrayMapInfo * mapInfoList, unsigned int count, CUstream hStream)} */
    public static int ncuMemMapArrayAsync(long mapInfoList, int count, long hStream) {
        long __functionAddress = Functions.MemMapArrayAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mapInfoList, count, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemMapArrayAsync(CUarrayMapInfo * mapInfoList, unsigned int count, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemMapArrayAsync(@NativeType("CUarrayMapInfo *") CUarrayMapInfo.Buffer mapInfoList, @NativeType("CUstream") long hStream) {
        return ncuMemMapArrayAsync(mapInfoList.address(), mapInfoList.remaining(), hStream);
    }

    // --- [ cuMemUnmap ] ---

    /** {@code CUresult cuMemUnmap(CUdeviceptr ptr, size_t size)} */
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

    /** {@code CUresult cuMemSetAccess(CUdeviceptr ptr, size_t size, CUmemAccessDesc const * desc, size_t count)} */
    public static int ncuMemSetAccess(long ptr, long size, long desc, long count) {
        long __functionAddress = Functions.MemSetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPPI(ptr, size, desc, count, __functionAddress);
    }

    /** {@code CUresult cuMemSetAccess(CUdeviceptr ptr, size_t size, CUmemAccessDesc const * desc, size_t count)} */
    @NativeType("CUresult")
    public static int cuMemSetAccess(@NativeType("CUdeviceptr") long ptr, @NativeType("size_t") long size, @NativeType("CUmemAccessDesc const *") CUmemAccessDesc.Buffer desc) {
        return ncuMemSetAccess(ptr, size, desc.address(), desc.remaining());
    }

    // --- [ cuMemGetAccess ] ---

    /** {@code CUresult cuMemGetAccess(unsigned long long * flags, CUmemLocation const * location, CUdeviceptr ptr)} */
    public static int ncuMemGetAccess(long flags, long location, long ptr) {
        long __functionAddress = Functions.MemGetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPI(flags, location, ptr, __functionAddress);
    }

    /** {@code CUresult cuMemGetAccess(unsigned long long * flags, CUmemLocation const * location, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuMemGetAccess(@NativeType("unsigned long long *") LongBuffer flags, @NativeType("CUmemLocation const *") CUmemLocation location, @NativeType("CUdeviceptr") long ptr) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuMemGetAccess(memAddress(flags), location.address(), ptr);
    }

    // --- [ cuMemExportToShareableHandle ] ---

    /** {@code CUresult cuMemExportToShareableHandle(void * shareableHandle, CUmemGenericAllocationHandle handle, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    public static int ncuMemExportToShareableHandle(long shareableHandle, long handle, int handleType, long flags) {
        long __functionAddress = Functions.MemExportToShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(shareableHandle, handle, handleType, flags, __functionAddress);
    }

    /** {@code CUresult cuMemExportToShareableHandle(void * shareableHandle, CUmemGenericAllocationHandle handle, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemExportToShareableHandle(@NativeType("void *") ByteBuffer shareableHandle, @NativeType("CUmemGenericAllocationHandle") long handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemExportToShareableHandle(memAddress(shareableHandle), handle, handleType, flags);
    }

    /** {@code CUresult cuMemExportToShareableHandle(void * shareableHandle, CUmemGenericAllocationHandle handle, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemExportToShareableHandle(@NativeType("void *") PointerBuffer shareableHandle, @NativeType("CUmemGenericAllocationHandle") long handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemExportToShareableHandle(memAddress(shareableHandle), handle, handleType, flags);
    }

    // --- [ cuMemImportFromShareableHandle ] ---

    /** {@code CUresult cuMemImportFromShareableHandle(CUmemGenericAllocationHandle * handle, void * osHandle, CUmemAllocationHandleType shHandleType)} */
    public static int ncuMemImportFromShareableHandle(long handle, long osHandle, int shHandleType) {
        long __functionAddress = Functions.MemImportFromShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(osHandle);
        }
        return callPPI(handle, osHandle, shHandleType, __functionAddress);
    }

    /** {@code CUresult cuMemImportFromShareableHandle(CUmemGenericAllocationHandle * handle, void * osHandle, CUmemAllocationHandleType shHandleType)} */
    @NativeType("CUresult")
    public static int cuMemImportFromShareableHandle(@NativeType("CUmemGenericAllocationHandle *") LongBuffer handle, @NativeType("void *") long osHandle, @NativeType("CUmemAllocationHandleType") int shHandleType) {
        if (CHECKS) {
            check(handle, 1);
        }
        return ncuMemImportFromShareableHandle(memAddress(handle), osHandle, shHandleType);
    }

    // --- [ cuMemGetAllocationGranularity ] ---

    /** {@code CUresult cuMemGetAllocationGranularity(size_t * granularity, CUmemAllocationProp const * prop, CUmemAllocationGranularity_flags option)} */
    public static int ncuMemGetAllocationGranularity(long granularity, long prop, int option) {
        long __functionAddress = Functions.MemGetAllocationGranularity;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(granularity, prop, option, __functionAddress);
    }

    /** {@code CUresult cuMemGetAllocationGranularity(size_t * granularity, CUmemAllocationProp const * prop, CUmemAllocationGranularity_flags option)} */
    @NativeType("CUresult")
    public static int cuMemGetAllocationGranularity(@NativeType("size_t *") PointerBuffer granularity, @NativeType("CUmemAllocationProp const *") CUmemAllocationProp prop, @NativeType("CUmemAllocationGranularity_flags") int option) {
        if (CHECKS) {
            check(granularity, 1);
        }
        return ncuMemGetAllocationGranularity(memAddress(granularity), prop.address(), option);
    }

    // --- [ cuMemGetAllocationPropertiesFromHandle ] ---

    /** {@code CUresult cuMemGetAllocationPropertiesFromHandle(CUmemAllocationProp * prop, CUmemGenericAllocationHandle handle)} */
    public static int ncuMemGetAllocationPropertiesFromHandle(long prop, long handle) {
        long __functionAddress = Functions.MemGetAllocationPropertiesFromHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(prop, handle, __functionAddress);
    }

    /** {@code CUresult cuMemGetAllocationPropertiesFromHandle(CUmemAllocationProp * prop, CUmemGenericAllocationHandle handle)} */
    @NativeType("CUresult")
    public static int cuMemGetAllocationPropertiesFromHandle(@NativeType("CUmemAllocationProp *") CUmemAllocationProp prop, @NativeType("CUmemGenericAllocationHandle") long handle) {
        return ncuMemGetAllocationPropertiesFromHandle(prop.address(), handle);
    }

    // --- [ cuMemRetainAllocationHandle ] ---

    /** {@code CUresult cuMemRetainAllocationHandle(CUmemGenericAllocationHandle * handle, void * addr)} */
    public static int ncuMemRetainAllocationHandle(long handle, long addr) {
        long __functionAddress = Functions.MemRetainAllocationHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(handle, addr, __functionAddress);
    }

    /** {@code CUresult cuMemRetainAllocationHandle(CUmemGenericAllocationHandle * handle, void * addr)} */
    @NativeType("CUresult")
    public static int cuMemRetainAllocationHandle(@NativeType("CUmemGenericAllocationHandle *") LongBuffer handle, @NativeType("void *") ByteBuffer addr) {
        if (CHECKS) {
            check(handle, 1);
        }
        return ncuMemRetainAllocationHandle(memAddress(handle), memAddress(addr));
    }

    // --- [ cuMemFreeAsync ] ---

    /** {@code CUresult cuMemFreeAsync(CUdeviceptr dptr, CUstream hStream)} */
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

    /** {@code CUresult cuMemAllocAsync(CUdeviceptr * dptr, size_t bytesize, CUstream hStream)} */
    public static int ncuMemAllocAsync(long dptr, long bytesize, long hStream) {
        long __functionAddress = Functions.MemAllocAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(dptr, bytesize, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemAllocAsync(CUdeviceptr * dptr, size_t bytesize, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemAllocAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocAsync(memAddress(dptr), bytesize, hStream);
    }

    // --- [ cuMemPoolTrimTo ] ---

    /** {@code CUresult cuMemPoolTrimTo(CUmemoryPool pool, size_t minBytesToKeep)} */
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

    /** {@code CUresult cuMemPoolSetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    public static int ncuMemPoolSetAttribute(long pool, int attr, long value) {
        long __functionAddress = Functions.MemPoolSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPI(pool, attr, value, __functionAddress);
    }

    /** {@code CUresult cuMemPoolSetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuMemPoolSetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuMemPoolSetAttribute(pool, attr, memAddress(value));
    }

    /** {@code CUresult cuMemPoolSetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuMemPoolSetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") IntBuffer value) {
        return ncuMemPoolSetAttribute(pool, attr, memAddress(value));
    }

    /** {@code CUresult cuMemPoolSetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuMemPoolSetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuMemPoolSetAttribute(pool, attr, memAddress(value));
    }

    // --- [ cuMemPoolGetAttribute ] ---

    /** {@code CUresult cuMemPoolGetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    public static int ncuMemPoolGetAttribute(long pool, int attr, long value) {
        long __functionAddress = Functions.MemPoolGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPI(pool, attr, value, __functionAddress);
    }

    /** {@code CUresult cuMemPoolGetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuMemPoolGetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuMemPoolGetAttribute(pool, attr, memAddress(value));
    }

    /** {@code CUresult cuMemPoolGetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuMemPoolGetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") IntBuffer value) {
        return ncuMemPoolGetAttribute(pool, attr, memAddress(value));
    }

    /** {@code CUresult cuMemPoolGetAttribute(CUmemoryPool pool, CUmemPool_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuMemPoolGetAttribute(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemPool_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuMemPoolGetAttribute(pool, attr, memAddress(value));
    }

    // --- [ cuMemPoolSetAccess ] ---

    /** {@code CUresult cuMemPoolSetAccess(CUmemoryPool pool, CUmemAccessDesc const * map, size_t count)} */
    public static int ncuMemPoolSetAccess(long pool, long map, long count) {
        long __functionAddress = Functions.MemPoolSetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPPI(pool, map, count, __functionAddress);
    }

    /** {@code CUresult cuMemPoolSetAccess(CUmemoryPool pool, CUmemAccessDesc const * map, size_t count)} */
    @NativeType("CUresult")
    public static int cuMemPoolSetAccess(@NativeType("CUmemoryPool") long pool, @NativeType("CUmemAccessDesc const *") CUmemAccessDesc.Buffer map) {
        return ncuMemPoolSetAccess(pool, map.address(), map.remaining());
    }

    // --- [ cuMemPoolGetAccess ] ---

    /** {@code CUresult cuMemPoolGetAccess(CUmemAccess_flags * flags, CUmemoryPool memPool, CUmemLocation * location)} */
    public static int ncuMemPoolGetAccess(long flags, long memPool, long location) {
        long __functionAddress = Functions.MemPoolGetAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(memPool);
        }
        return callPPPI(flags, memPool, location, __functionAddress);
    }

    /** {@code CUresult cuMemPoolGetAccess(CUmemAccess_flags * flags, CUmemoryPool memPool, CUmemLocation * location)} */
    @NativeType("CUresult")
    public static int cuMemPoolGetAccess(@NativeType("CUmemAccess_flags *") IntBuffer flags, @NativeType("CUmemoryPool") long memPool, @NativeType("CUmemLocation *") CUmemLocation location) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuMemPoolGetAccess(memAddress(flags), memPool, location.address());
    }

    // --- [ cuMemPoolCreate ] ---

    /** {@code CUresult cuMemPoolCreate(CUmemoryPool * pool, CUmemPoolProps const * poolProps)} */
    public static int ncuMemPoolCreate(long pool, long poolProps) {
        long __functionAddress = Functions.MemPoolCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pool, poolProps, __functionAddress);
    }

    /** {@code CUresult cuMemPoolCreate(CUmemoryPool * pool, CUmemPoolProps const * poolProps)} */
    @NativeType("CUresult")
    public static int cuMemPoolCreate(@NativeType("CUmemoryPool *") PointerBuffer pool, @NativeType("CUmemPoolProps const *") CUmemPoolProps poolProps) {
        if (CHECKS) {
            check(pool, 1);
        }
        return ncuMemPoolCreate(memAddress(pool), poolProps.address());
    }

    // --- [ cuMemPoolDestroy ] ---

    /** {@code CUresult cuMemPoolDestroy(CUmemoryPool pool)} */
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

    /** {@code CUresult cuMemAllocFromPoolAsync(CUdeviceptr * dptr, size_t bytesize, CUmemoryPool pool, CUstream hStream)} */
    public static int ncuMemAllocFromPoolAsync(long dptr, long bytesize, long pool, long hStream) {
        long __functionAddress = Functions.MemAllocFromPoolAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPPPI(dptr, bytesize, pool, hStream, __functionAddress);
    }

    /** {@code CUresult cuMemAllocFromPoolAsync(CUdeviceptr * dptr, size_t bytesize, CUmemoryPool pool, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemAllocFromPoolAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize, @NativeType("CUmemoryPool") long pool, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAllocFromPoolAsync(memAddress(dptr), bytesize, pool, hStream);
    }

    // --- [ cuMemPoolExportToShareableHandle ] ---

    /** {@code CUresult cuMemPoolExportToShareableHandle(void * handle_out, CUmemoryPool pool, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    public static int ncuMemPoolExportToShareableHandle(long handle_out, long pool, int handleType, long flags) {
        long __functionAddress = Functions.MemPoolExportToShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPJI(handle_out, pool, handleType, flags, __functionAddress);
    }

    /** {@code CUresult cuMemPoolExportToShareableHandle(void * handle_out, CUmemoryPool pool, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemPoolExportToShareableHandle(@NativeType("void *") ByteBuffer handle_out, @NativeType("CUmemoryPool") long pool, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemPoolExportToShareableHandle(memAddress(handle_out), pool, handleType, flags);
    }

    /** {@code CUresult cuMemPoolExportToShareableHandle(void * handle_out, CUmemoryPool pool, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemPoolExportToShareableHandle(@NativeType("void *") PointerBuffer handle_out, @NativeType("CUmemoryPool") long pool, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        return ncuMemPoolExportToShareableHandle(memAddress(handle_out), pool, handleType, flags);
    }

    // --- [ cuMemPoolImportFromShareableHandle ] ---

    /** {@code CUresult cuMemPoolImportFromShareableHandle(CUmemoryPool * pool_out, void * handle, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    public static int ncuMemPoolImportFromShareableHandle(long pool_out, long handle, int handleType, long flags) {
        long __functionAddress = Functions.MemPoolImportFromShareableHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(pool_out, handle, handleType, flags, __functionAddress);
    }

    /** {@code CUresult cuMemPoolImportFromShareableHandle(CUmemoryPool * pool_out, void * handle, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemPoolImportFromShareableHandle(@NativeType("CUmemoryPool *") PointerBuffer pool_out, @NativeType("void *") ByteBuffer handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(pool_out, 1);
        }
        return ncuMemPoolImportFromShareableHandle(memAddress(pool_out), memAddress(handle), handleType, flags);
    }

    /** {@code CUresult cuMemPoolImportFromShareableHandle(CUmemoryPool * pool_out, void * handle, CUmemAllocationHandleType handleType, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMemPoolImportFromShareableHandle(@NativeType("CUmemoryPool *") PointerBuffer pool_out, @NativeType("void *") PointerBuffer handle, @NativeType("CUmemAllocationHandleType") int handleType, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(pool_out, 1);
        }
        return ncuMemPoolImportFromShareableHandle(memAddress(pool_out), memAddress(handle), handleType, flags);
    }

    // --- [ cuMemPoolExportPointer ] ---

    /** {@code CUresult cuMemPoolExportPointer(CUmemPoolPtrExportData * shareData_out, CUdeviceptr ptr)} */
    public static int ncuMemPoolExportPointer(long shareData_out, long ptr) {
        long __functionAddress = Functions.MemPoolExportPointer;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(shareData_out, ptr, __functionAddress);
    }

    /** {@code CUresult cuMemPoolExportPointer(CUmemPoolPtrExportData * shareData_out, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuMemPoolExportPointer(@NativeType("CUmemPoolPtrExportData *") CUmemPoolPtrExportData shareData_out, @NativeType("CUdeviceptr") long ptr) {
        return ncuMemPoolExportPointer(shareData_out.address(), ptr);
    }

    // --- [ cuMemPoolImportPointer ] ---

    /** {@code CUresult cuMemPoolImportPointer(CUdeviceptr * ptr_out, CUmemoryPool pool, CUmemPoolPtrExportData * shareData)} */
    public static int ncuMemPoolImportPointer(long ptr_out, long pool, long shareData) {
        long __functionAddress = Functions.MemPoolImportPointer;
        if (CHECKS) {
            check(__functionAddress);
            check(pool);
        }
        return callPPPI(ptr_out, pool, shareData, __functionAddress);
    }

    /** {@code CUresult cuMemPoolImportPointer(CUdeviceptr * ptr_out, CUmemoryPool pool, CUmemPoolPtrExportData * shareData)} */
    @NativeType("CUresult")
    public static int cuMemPoolImportPointer(@NativeType("CUdeviceptr *") PointerBuffer ptr_out, @NativeType("CUmemoryPool") long pool, @NativeType("CUmemPoolPtrExportData *") CUmemPoolPtrExportData shareData) {
        if (CHECKS) {
            check(ptr_out, 1);
        }
        return ncuMemPoolImportPointer(memAddress(ptr_out), pool, shareData.address());
    }

    // --- [ cuMulticastCreate ] ---

    /** {@code CUresult cuMulticastCreate(CUmemGenericAllocationHandle * mcHandle, CUmulticastObjectProp const * prop)} */
    public static int ncuMulticastCreate(long mcHandle, long prop) {
        long __functionAddress = Functions.MulticastCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mcHandle, prop, __functionAddress);
    }

    /** {@code CUresult cuMulticastCreate(CUmemGenericAllocationHandle * mcHandle, CUmulticastObjectProp const * prop)} */
    @NativeType("CUresult")
    public static int cuMulticastCreate(@NativeType("CUmemGenericAllocationHandle *") LongBuffer mcHandle, @NativeType("CUmulticastObjectProp const *") CUmulticastObjectProp prop) {
        if (CHECKS) {
            check(mcHandle, 1);
        }
        return ncuMulticastCreate(memAddress(mcHandle), prop.address());
    }

    // --- [ cuMulticastAddDevice ] ---

    /** {@code CUresult cuMulticastAddDevice(CUmemGenericAllocationHandle mcHandle, CUdevice dev)} */
    @NativeType("CUresult")
    public static int cuMulticastAddDevice(@NativeType("CUmemGenericAllocationHandle") long mcHandle, @NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.MulticastAddDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(mcHandle, dev, __functionAddress);
    }

    // --- [ cuMulticastBindMem ] ---

    /** {@code CUresult cuMulticastBindMem(CUmemGenericAllocationHandle mcHandle, size_t mcOffset, CUmemGenericAllocationHandle memHandle, size_t memOffset, size_t size, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMulticastBindMem(@NativeType("CUmemGenericAllocationHandle") long mcHandle, @NativeType("size_t") long mcOffset, @NativeType("CUmemGenericAllocationHandle") long memHandle, @NativeType("size_t") long memOffset, @NativeType("size_t") long size, @NativeType("unsigned long long") long flags) {
        long __functionAddress = Functions.MulticastBindMem;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJPPJI(mcHandle, mcOffset, memHandle, memOffset, size, flags, __functionAddress);
    }

    // --- [ cuMulticastBindAddr ] ---

    /** {@code CUresult cuMulticastBindAddr(CUmemGenericAllocationHandle mcHandle, size_t mcOffset, CUdeviceptr memptr, size_t size, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuMulticastBindAddr(@NativeType("CUmemGenericAllocationHandle") long mcHandle, @NativeType("size_t") long mcOffset, @NativeType("CUdeviceptr") long memptr, @NativeType("size_t") long size, @NativeType("unsigned long long") long flags) {
        long __functionAddress = Functions.MulticastBindAddr;
        if (CHECKS) {
            check(__functionAddress);
            check(memptr);
        }
        return callJPPPJI(mcHandle, mcOffset, memptr, size, flags, __functionAddress);
    }

    // --- [ cuMulticastUnbind ] ---

    /** {@code CUresult cuMulticastUnbind(CUmemGenericAllocationHandle mcHandle, CUdevice dev, size_t mcOffset, size_t size)} */
    @NativeType("CUresult")
    public static int cuMulticastUnbind(@NativeType("CUmemGenericAllocationHandle") long mcHandle, @NativeType("CUdevice") int dev, @NativeType("size_t") long mcOffset, @NativeType("size_t") long size) {
        long __functionAddress = Functions.MulticastUnbind;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(mcHandle, dev, mcOffset, size, __functionAddress);
    }

    // --- [ cuMulticastGetGranularity ] ---

    /** {@code CUresult cuMulticastGetGranularity(size_t * granularity, CUmulticastObjectProp const * prop, CUmulticastGranularity_flags option)} */
    public static int ncuMulticastGetGranularity(long granularity, long prop, int option) {
        long __functionAddress = Functions.MulticastGetGranularity;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(granularity, prop, option, __functionAddress);
    }

    /** {@code CUresult cuMulticastGetGranularity(size_t * granularity, CUmulticastObjectProp const * prop, CUmulticastGranularity_flags option)} */
    @NativeType("CUresult")
    public static int cuMulticastGetGranularity(@NativeType("size_t *") PointerBuffer granularity, @NativeType("CUmulticastObjectProp const *") CUmulticastObjectProp prop, @NativeType("CUmulticastGranularity_flags") int option) {
        if (CHECKS) {
            check(granularity, 1);
        }
        return ncuMulticastGetGranularity(memAddress(granularity), prop.address(), option);
    }

    // --- [ cuPointerGetAttribute ] ---

    /** {@code CUresult cuPointerGetAttribute(void * data, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    public static int ncuPointerGetAttribute(long data, int attribute, long ptr) {
        long __functionAddress = Functions.PointerGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(data, attribute, ptr, __functionAddress);
    }

    /** {@code CUresult cuPointerGetAttribute(void * data, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") ByteBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    /** {@code CUresult cuPointerGetAttribute(void * data, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") PointerBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    /** {@code CUresult cuPointerGetAttribute(void * data, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") IntBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    /** {@code CUresult cuPointerGetAttribute(void * data, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuPointerGetAttribute(@NativeType("void *") LongBuffer data, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerGetAttribute(memAddress(data), attribute, ptr);
    }

    // --- [ cuMemPrefetchAsync ] ---

    /** {@code CUresult cuMemPrefetchAsync(CUdeviceptr devPtr, size_t count, CUdevice dstDevice, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemPrefetchAsync(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUdevice") int dstDevice, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemPrefetchAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPPI(devPtr, count, dstDevice, hStream, __functionAddress);
    }

    // --- [ cuMemPrefetchAsync_v2 ] ---

    private static final FFICIF cuMemPrefetchAsync_v2CIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_sint32), ffi_type_uint32, ffi_type_pointer
    );

    /** {@code CUresult cuMemPrefetchAsync_v2(CUdeviceptr devPtr, size_t count, CUmemLocation location, unsigned int flags, CUstream hStream)} */
    public static int ncuMemPrefetchAsync_v2(long devPtr, long count, long location, int flags, long hStream) {
        long __functionAddress = Functions.MemPrefetchAsync_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 5);
            memPutAddress(arguments, stack.npointer(devPtr));
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(count));
            memPutAddress(arguments + 2 * POINTER_SIZE, location);
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.nint(flags));
            memPutAddress(arguments + 4 * POINTER_SIZE, stack.npointer(hStream));

            nffi_call(cuMemPrefetchAsync_v2CIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code CUresult cuMemPrefetchAsync_v2(CUdeviceptr devPtr, size_t count, CUmemLocation location, unsigned int flags, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuMemPrefetchAsync_v2(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, CUmemLocation location, @NativeType("unsigned int") int flags, @NativeType("CUstream") long hStream) {
        return ncuMemPrefetchAsync_v2(devPtr, count, location.address(), flags, hStream);
    }

    // --- [ cuMemAdvise ] ---

    /** {@code CUresult cuMemAdvise(CUdeviceptr devPtr, size_t count, CUmem_advise advice, CUdevice device)} */
    @NativeType("CUresult")
    public static int cuMemAdvise(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUmem_advise") int advice, @NativeType("CUdevice") int device) {
        long __functionAddress = Functions.MemAdvise;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPI(devPtr, count, advice, device, __functionAddress);
    }

    // --- [ cuMemAdvise_v2 ] ---

    private static final FFICIF cuMemAdvise_v2CIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, apiCreateStruct(ffi_type_uint32, ffi_type_sint32)
    );

    /** {@code CUresult cuMemAdvise_v2(CUdeviceptr devPtr, size_t count, CUmem_advise advice, CUmemLocation location)} */
    public static int ncuMemAdvise_v2(long devPtr, long count, int advice, long location) {
        long __functionAddress = Functions.MemAdvise_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(devPtr));
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(count));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nint(advice));
            memPutAddress(arguments + 3 * POINTER_SIZE, location);

            nffi_call(cuMemAdvise_v2CIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code CUresult cuMemAdvise_v2(CUdeviceptr devPtr, size_t count, CUmem_advise advice, CUmemLocation location)} */
    @NativeType("CUresult")
    public static int cuMemAdvise_v2(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUmem_advise") int advice, CUmemLocation location) {
        return ncuMemAdvise_v2(devPtr, count, advice, location.address());
    }

    // --- [ cuMemRangeGetAttribute ] ---

    /** {@code CUresult cuMemRangeGetAttribute(void * data, size_t dataSize, CUmem_range_attribute attribute, CUdeviceptr devPtr, size_t count)} */
    public static int ncuMemRangeGetAttribute(long data, long dataSize, int attribute, long devPtr, long count) {
        long __functionAddress = Functions.MemRangeGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPPPI(data, dataSize, attribute, devPtr, count, __functionAddress);
    }

    /** {@code CUresult cuMemRangeGetAttribute(void * data, size_t dataSize, CUmem_range_attribute attribute, CUdeviceptr devPtr, size_t count)} */
    @NativeType("CUresult")
    public static int cuMemRangeGetAttribute(@NativeType("void *") ByteBuffer data, @NativeType("CUmem_range_attribute") int attribute, @NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count) {
        return ncuMemRangeGetAttribute(memAddress(data), data.remaining(), attribute, devPtr, count);
    }

    // --- [ cuMemRangeGetAttributes ] ---

    /** {@code CUresult cuMemRangeGetAttributes(void ** data, size_t * dataSizes, CUmem_range_attribute * attributes, size_t numAttributes, CUdeviceptr devPtr, size_t count)} */
    public static int ncuMemRangeGetAttributes(long data, long dataSizes, long attributes, long numAttributes, long devPtr, long count) {
        long __functionAddress = Functions.MemRangeGetAttributes;
        if (CHECKS) {
            check(__functionAddress);
            check(devPtr);
        }
        return callPPPPPPI(data, dataSizes, attributes, numAttributes, devPtr, count, __functionAddress);
    }

    /** {@code CUresult cuMemRangeGetAttributes(void ** data, size_t * dataSizes, CUmem_range_attribute * attributes, size_t numAttributes, CUdeviceptr devPtr, size_t count)} */
    @NativeType("CUresult")
    public static int cuMemRangeGetAttributes(@NativeType("void **") PointerBuffer data, @NativeType("size_t *") PointerBuffer dataSizes, @NativeType("CUmem_range_attribute *") IntBuffer attributes, @NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count) {
        if (CHECKS) {
            check(data, attributes.remaining());
            check(dataSizes, attributes.remaining());
        }
        return ncuMemRangeGetAttributes(memAddress(data), memAddress(dataSizes), memAddress(attributes), attributes.remaining(), devPtr, count);
    }

    // --- [ cuPointerSetAttribute ] ---

    /** {@code CUresult cuPointerSetAttribute(void const * value, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    public static int ncuPointerSetAttribute(long value, int attribute, long ptr) {
        long __functionAddress = Functions.PointerSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPI(value, attribute, ptr, __functionAddress);
    }

    /** {@code CUresult cuPointerSetAttribute(void const * value, CUpointer_attribute attribute, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuPointerSetAttribute(@NativeType("void const *") ByteBuffer value, @NativeType("CUpointer_attribute") int attribute, @NativeType("CUdeviceptr") long ptr) {
        return ncuPointerSetAttribute(memAddress(value), attribute, ptr);
    }

    // --- [ cuPointerGetAttributes ] ---

    /** {@code CUresult cuPointerGetAttributes(unsigned int numAttributes, CUpointer_attribute * attributes, void ** data, CUdeviceptr ptr)} */
    public static int ncuPointerGetAttributes(int numAttributes, long attributes, long data, long ptr) {
        long __functionAddress = Functions.PointerGetAttributes;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPI(numAttributes, attributes, data, ptr, __functionAddress);
    }

    /** {@code CUresult cuPointerGetAttributes(unsigned int numAttributes, CUpointer_attribute * attributes, void ** data, CUdeviceptr ptr)} */
    @NativeType("CUresult")
    public static int cuPointerGetAttributes(@NativeType("CUpointer_attribute *") IntBuffer attributes, @NativeType("void **") PointerBuffer data, @NativeType("CUdeviceptr") long ptr) {
        if (CHECKS) {
            check(data, attributes.remaining());
        }
        return ncuPointerGetAttributes(attributes.remaining(), memAddress(attributes), memAddress(data), ptr);
    }

    // --- [ cuStreamCreate ] ---

    /** {@code CUresult cuStreamCreate(CUstream * phStream, unsigned int Flags)} */
    public static int ncuStreamCreate(long phStream, int Flags) {
        long __functionAddress = Functions.StreamCreate;
        return callPI(phStream, Flags, __functionAddress);
    }

    /** {@code CUresult cuStreamCreate(CUstream * phStream, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuStreamCreate(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuStreamCreate(memAddress(phStream), Flags);
    }

    // --- [ cuStreamCreateWithPriority ] ---

    /** {@code CUresult cuStreamCreateWithPriority(CUstream * phStream, unsigned int flags, int priority)} */
    public static int ncuStreamCreateWithPriority(long phStream, int flags, int priority) {
        long __functionAddress = Functions.StreamCreateWithPriority;
        return callPI(phStream, flags, priority, __functionAddress);
    }

    /** {@code CUresult cuStreamCreateWithPriority(CUstream * phStream, unsigned int flags, int priority)} */
    @NativeType("CUresult")
    public static int cuStreamCreateWithPriority(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("unsigned int") int flags, int priority) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuStreamCreateWithPriority(memAddress(phStream), flags, priority);
    }

    // --- [ cuStreamGetPriority ] ---

    /** {@code CUresult cuStreamGetPriority(CUstream hStream, int * priority)} */
    public static int ncuStreamGetPriority(long hStream, long priority) {
        long __functionAddress = Functions.StreamGetPriority;
        return callPPI(hStream, priority, __functionAddress);
    }

    /** {@code CUresult cuStreamGetPriority(CUstream hStream, int * priority)} */
    @NativeType("CUresult")
    public static int cuStreamGetPriority(@NativeType("CUstream") long hStream, @NativeType("int *") IntBuffer priority) {
        if (CHECKS) {
            check(priority, 1);
        }
        return ncuStreamGetPriority(hStream, memAddress(priority));
    }

    // --- [ cuStreamGetFlags ] ---

    /** {@code CUresult cuStreamGetFlags(CUstream hStream, unsigned int * flags)} */
    public static int ncuStreamGetFlags(long hStream, long flags) {
        long __functionAddress = Functions.StreamGetFlags;
        return callPPI(hStream, flags, __functionAddress);
    }

    /** {@code CUresult cuStreamGetFlags(CUstream hStream, unsigned int * flags)} */
    @NativeType("CUresult")
    public static int cuStreamGetFlags(@NativeType("CUstream") long hStream, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuStreamGetFlags(hStream, memAddress(flags));
    }

    // --- [ cuStreamGetId ] ---

    /** {@code CUresult cuStreamGetId(CUstream hStream, unsigned long long * streamId)} */
    public static int ncuStreamGetId(long hStream, long streamId) {
        long __functionAddress = Functions.StreamGetId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, streamId, __functionAddress);
    }

    /** {@code CUresult cuStreamGetId(CUstream hStream, unsigned long long * streamId)} */
    @NativeType("CUresult")
    public static int cuStreamGetId(@NativeType("CUstream") long hStream, @NativeType("unsigned long long *") LongBuffer streamId) {
        if (CHECKS) {
            check(streamId, 1);
        }
        return ncuStreamGetId(hStream, memAddress(streamId));
    }

    // --- [ cuStreamGetCtx ] ---

    /** {@code CUresult cuStreamGetCtx(CUstream hStream, CUcontext * pctx)} */
    public static int ncuStreamGetCtx(long hStream, long pctx) {
        long __functionAddress = Functions.StreamGetCtx;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, pctx, __functionAddress);
    }

    /** {@code CUresult cuStreamGetCtx(CUstream hStream, CUcontext * pctx)} */
    @NativeType("CUresult")
    public static int cuStreamGetCtx(@NativeType("CUstream") long hStream, @NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuStreamGetCtx(hStream, memAddress(pctx));
    }

    // --- [ cuStreamGetCtx_v2 ] ---

    /** {@code CUresult cuStreamGetCtx_v2(CUstream hStream, CUcontext * pctx, CUgreenCtx * pGreenCtx)} */
    public static int ncuStreamGetCtx_v2(long hStream, long pctx, long pGreenCtx) {
        long __functionAddress = Functions.StreamGetCtx_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(hStream, pctx, pGreenCtx, __functionAddress);
    }

    /** {@code CUresult cuStreamGetCtx_v2(CUstream hStream, CUcontext * pctx, CUgreenCtx * pGreenCtx)} */
    @NativeType("CUresult")
    public static int cuStreamGetCtx_v2(@NativeType("CUstream") long hStream, @NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUgreenCtx *") PointerBuffer pGreenCtx) {
        if (CHECKS) {
            check(pctx, 1);
            check(pGreenCtx, 1);
        }
        return ncuStreamGetCtx_v2(hStream, memAddress(pctx), memAddress(pGreenCtx));
    }

    // --- [ cuStreamWaitEvent ] ---

    /** {@code CUresult cuStreamWaitEvent(CUstream hStream, CUevent hEvent, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuStreamWaitEvent(@NativeType("CUstream") long hStream, @NativeType("CUevent") long hEvent, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.StreamWaitEvent;
        if (CHECKS) {
            check(hEvent);
        }
        return callPPI(hStream, hEvent, Flags, __functionAddress);
    }

    // --- [ cuStreamAddCallback ] ---

    /** {@code CUresult cuStreamAddCallback(CUstream hStream, void (*) (CUstream, CUresult, void *) callback, void * userData, unsigned int flags)} */
    public static int ncuStreamAddCallback(long hStream, long callback, long userData, int flags) {
        long __functionAddress = Functions.StreamAddCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(userData);
        }
        return callPPPI(hStream, callback, userData, flags, __functionAddress);
    }

    /** {@code CUresult cuStreamAddCallback(CUstream hStream, void (*) (CUstream, CUresult, void *) callback, void * userData, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuStreamAddCallback(@NativeType("CUstream") long hStream, @NativeType("void (*) (CUstream, CUresult, void *)") CUstreamCallbackI callback, @NativeType("void *") long userData, @NativeType("unsigned int") int flags) {
        return ncuStreamAddCallback(hStream, callback.address(), userData, flags);
    }

    // --- [ cuStreamBeginCapture ] ---

    /** {@code CUresult cuStreamBeginCapture(CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuStreamBeginCapture(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamBeginCapture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamBeginCapture_v2 ] ---

    /** {@code CUresult cuStreamBeginCapture_v2(CUstream hStream, CUstreamCaptureMode mode)} */
    @NativeType("CUresult")
    public static int cuStreamBeginCapture_v2(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureMode") int mode) {
        long __functionAddress = Functions.StreamBeginCapture_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(hStream, mode, __functionAddress);
    }

    // --- [ cuStreamBeginCaptureToGraph ] ---

    /** {@code CUresult cuStreamBeginCaptureToGraph(CUstream hStream, CUgraph hGraph, CUgraphNode const * dependencies, CUgraphEdgeData const * dependencyData, size_t numDependencies, CUstreamCaptureMode mode)} */
    public static int ncuStreamBeginCaptureToGraph(long hStream, long hGraph, long dependencies, long dependencyData, long numDependencies, int mode) {
        long __functionAddress = Functions.StreamBeginCaptureToGraph;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(hStream, hGraph, dependencies, dependencyData, numDependencies, mode, __functionAddress);
    }

    /** {@code CUresult cuStreamBeginCaptureToGraph(CUstream hStream, CUgraph hGraph, CUgraphNode const * dependencies, CUgraphEdgeData const * dependencyData, size_t numDependencies, CUstreamCaptureMode mode)} */
    @NativeType("CUresult")
    public static int cuStreamBeginCaptureToGraph(@NativeType("CUstream") long hStream, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUgraphEdgeData const *") CUgraphEdgeData.@Nullable Buffer dependencyData, @NativeType("CUstreamCaptureMode") int mode) {
        if (CHECKS) {
            checkSafe(dependencyData, remainingSafe(dependencies));
        }
        return ncuStreamBeginCaptureToGraph(hStream, hGraph, memAddressSafe(dependencies), memAddressSafe(dependencyData), remainingSafe(dependencies), mode);
    }

    // --- [ cuThreadExchangeStreamCaptureMode ] ---

    /** {@code CUresult cuThreadExchangeStreamCaptureMode(CUstreamCaptureMode * mode)} */
    public static int ncuThreadExchangeStreamCaptureMode(long mode) {
        long __functionAddress = Functions.ThreadExchangeStreamCaptureMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mode, __functionAddress);
    }

    /** {@code CUresult cuThreadExchangeStreamCaptureMode(CUstreamCaptureMode * mode)} */
    @NativeType("CUresult")
    public static int cuThreadExchangeStreamCaptureMode(@NativeType("CUstreamCaptureMode *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return ncuThreadExchangeStreamCaptureMode(memAddress(mode));
    }

    // --- [ cuStreamEndCapture ] ---

    /** {@code CUresult cuStreamEndCapture(CUstream hStream, CUgraph * phGraph)} */
    public static int ncuStreamEndCapture(long hStream, long phGraph) {
        long __functionAddress = Functions.StreamEndCapture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, phGraph, __functionAddress);
    }

    /** {@code CUresult cuStreamEndCapture(CUstream hStream, CUgraph * phGraph)} */
    @NativeType("CUresult")
    public static int cuStreamEndCapture(@NativeType("CUstream") long hStream, @NativeType("CUgraph *") PointerBuffer phGraph) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuStreamEndCapture(hStream, memAddress(phGraph));
    }

    // --- [ cuStreamIsCapturing ] ---

    /** {@code CUresult cuStreamIsCapturing(CUstream hStream, CUstreamCaptureStatus * captureStatus)} */
    public static int ncuStreamIsCapturing(long hStream, long captureStatus) {
        long __functionAddress = Functions.StreamIsCapturing;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, captureStatus, __functionAddress);
    }

    /** {@code CUresult cuStreamIsCapturing(CUstream hStream, CUstreamCaptureStatus * captureStatus)} */
    @NativeType("CUresult")
    public static int cuStreamIsCapturing(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus) {
        if (CHECKS) {
            check(captureStatus, 1);
        }
        return ncuStreamIsCapturing(hStream, memAddress(captureStatus));
    }

    // --- [ cuStreamGetCaptureInfo_v3 ] ---

    /** {@code CUresult cuStreamGetCaptureInfo_v3(CUstream hStream, CUstreamCaptureStatus * captureStatus_out, cuuint64_t * id_out, CUgraph * graph_out, CUgraphNode const ** dependencies_out, CUgraphEdgeData const ** edgeData_out, size_t * numDependencies_out)} */
    public static int ncuStreamGetCaptureInfo_v3(long hStream, long captureStatus_out, long id_out, long graph_out, long dependencies_out, long edgeData_out, long numDependencies_out) {
        long __functionAddress = Functions.StreamGetCaptureInfo_v3;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPPI(hStream, captureStatus_out, id_out, graph_out, dependencies_out, edgeData_out, numDependencies_out, __functionAddress);
    }

    /** {@code CUresult cuStreamGetCaptureInfo_v3(CUstream hStream, CUstreamCaptureStatus * captureStatus_out, cuuint64_t * id_out, CUgraph * graph_out, CUgraphNode const ** dependencies_out, CUgraphEdgeData const ** edgeData_out, size_t * numDependencies_out)} */
    @NativeType("CUresult")
    public static int cuStreamGetCaptureInfo_v3(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus_out, @NativeType("cuuint64_t *") @Nullable LongBuffer id_out, @NativeType("CUgraph *") @Nullable PointerBuffer graph_out, @NativeType("CUgraphNode const **") @Nullable PointerBuffer dependencies_out, @NativeType("CUgraphEdgeData const **") @Nullable PointerBuffer edgeData_out, @NativeType("size_t *") @Nullable PointerBuffer numDependencies_out) {
        if (CHECKS) {
            check(captureStatus_out, 1);
            checkSafe(id_out, 1);
            checkSafe(graph_out, 1);
            checkSafe(dependencies_out, 1);
            checkSafe(edgeData_out, 1);
            checkSafe(numDependencies_out, 1);
        }
        return ncuStreamGetCaptureInfo_v3(hStream, memAddress(captureStatus_out), memAddressSafe(id_out), memAddressSafe(graph_out), memAddressSafe(dependencies_out), memAddressSafe(edgeData_out), memAddressSafe(numDependencies_out));
    }

    // --- [ cuStreamGetCaptureInfo ] ---

    /** {@code CUresult cuStreamGetCaptureInfo(CUstream hStream, CUstreamCaptureStatus * captureStatus, cuuint64_t * id)} */
    public static int ncuStreamGetCaptureInfo(long hStream, long captureStatus, long id) {
        long __functionAddress = Functions.StreamGetCaptureInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(hStream, captureStatus, id, __functionAddress);
    }

    /** {@code CUresult cuStreamGetCaptureInfo(CUstream hStream, CUstreamCaptureStatus * captureStatus, cuuint64_t * id)} */
    @NativeType("CUresult")
    public static int cuStreamGetCaptureInfo(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus, @NativeType("cuuint64_t *") LongBuffer id) {
        if (CHECKS) {
            check(captureStatus, 1);
            check(id, 1);
        }
        return ncuStreamGetCaptureInfo(hStream, memAddress(captureStatus), memAddress(id));
    }

    // --- [ cuStreamGetCaptureInfo_v2 ] ---

    /** {@code CUresult cuStreamGetCaptureInfo_v2(CUstream hStream, CUstreamCaptureStatus * captureStatus_out, cuuint64_t * id_out, CUgraph * graph_out, CUgraphNode const ** dependencies_out, size_t * numDependencies_out)} */
    public static int ncuStreamGetCaptureInfo_v2(long hStream, long captureStatus_out, long id_out, long graph_out, long dependencies_out, long numDependencies_out) {
        long __functionAddress = Functions.StreamGetCaptureInfo_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(hStream, captureStatus_out, id_out, graph_out, dependencies_out, numDependencies_out, __functionAddress);
    }

    /** {@code CUresult cuStreamGetCaptureInfo_v2(CUstream hStream, CUstreamCaptureStatus * captureStatus_out, cuuint64_t * id_out, CUgraph * graph_out, CUgraphNode const ** dependencies_out, size_t * numDependencies_out)} */
    @NativeType("CUresult")
    public static int cuStreamGetCaptureInfo_v2(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus_out, @NativeType("cuuint64_t *") @Nullable LongBuffer id_out, @NativeType("CUgraph *") @Nullable PointerBuffer graph_out, @NativeType("CUgraphNode const **") @Nullable PointerBuffer dependencies_out, @NativeType("size_t *") @Nullable PointerBuffer numDependencies_out) {
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

    /** {@code CUresult cuStreamUpdateCaptureDependencies(CUstream hStream, CUgraphNode * dependencies, size_t numDependencies, unsigned int flags)} */
    public static int ncuStreamUpdateCaptureDependencies(long hStream, long dependencies, long numDependencies, int flags) {
        long __functionAddress = Functions.StreamUpdateCaptureDependencies;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(hStream, dependencies, numDependencies, flags, __functionAddress);
    }

    /** {@code CUresult cuStreamUpdateCaptureDependencies(CUstream hStream, CUgraphNode * dependencies, size_t numDependencies, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuStreamUpdateCaptureDependencies(@NativeType("CUstream") long hStream, @NativeType("CUgraphNode *") PointerBuffer dependencies, @NativeType("unsigned int") int flags) {
        return ncuStreamUpdateCaptureDependencies(hStream, memAddress(dependencies), dependencies.remaining(), flags);
    }

    // --- [ cuStreamUpdateCaptureDependencies_v2 ] ---

    /** {@code CUresult cuStreamUpdateCaptureDependencies_v2(CUstream hStream, CUgraphNode * dependencies, CUgraphEdgeData const * dependencyData, size_t numDependencies, unsigned int flags)} */
    public static int ncuStreamUpdateCaptureDependencies_v2(long hStream, long dependencies, long dependencyData, long numDependencies, int flags) {
        long __functionAddress = Functions.StreamUpdateCaptureDependencies_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(hStream, dependencies, dependencyData, numDependencies, flags, __functionAddress);
    }

    /** {@code CUresult cuStreamUpdateCaptureDependencies_v2(CUstream hStream, CUgraphNode * dependencies, CUgraphEdgeData const * dependencyData, size_t numDependencies, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuStreamUpdateCaptureDependencies_v2(@NativeType("CUstream") long hStream, @NativeType("CUgraphNode *") PointerBuffer dependencies, @NativeType("CUgraphEdgeData const *") CUgraphEdgeData.@Nullable Buffer dependencyData, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            checkSafe(dependencyData, dependencies.remaining());
        }
        return ncuStreamUpdateCaptureDependencies_v2(hStream, memAddress(dependencies), memAddressSafe(dependencyData), dependencies.remaining(), flags);
    }

    // --- [ cuStreamAttachMemAsync ] ---

    /** {@code CUresult cuStreamAttachMemAsync(CUstream hStream, CUdeviceptr dptr, size_t length, unsigned int flags)} */
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

    /** {@code CUresult cuStreamQuery(CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuStreamQuery(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamQuery;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamSynchronize ] ---

    /** {@code CUresult cuStreamSynchronize(CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuStreamSynchronize(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamSynchronize;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamDestroy ] ---

    /** {@code CUresult cuStreamDestroy(CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuStreamDestroy(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamDestroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamCopyAttributes ] ---

    /** {@code CUresult cuStreamCopyAttributes(CUstream dst, CUstream src)} */
    @NativeType("CUresult")
    public static int cuStreamCopyAttributes(@NativeType("CUstream") long dst, @NativeType("CUstream") long src) {
        long __functionAddress = Functions.StreamCopyAttributes;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(dst, src, __functionAddress);
    }

    // --- [ cuStreamGetAttribute ] ---

    /** {@code CUresult cuStreamGetAttribute(CUstream hStream, CUstreamAttrID attr, CUstreamAttrValue * value_out)} */
    public static int ncuStreamGetAttribute(long hStream, int attr, long value_out) {
        long __functionAddress = Functions.StreamGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, attr, value_out, __functionAddress);
    }

    /** {@code CUresult cuStreamGetAttribute(CUstream hStream, CUstreamAttrID attr, CUstreamAttrValue * value_out)} */
    @NativeType("CUresult")
    public static int cuStreamGetAttribute(@NativeType("CUstream") long hStream, @NativeType("CUstreamAttrID") int attr, @NativeType("CUstreamAttrValue *") CUstreamAttrValue value_out) {
        return ncuStreamGetAttribute(hStream, attr, value_out.address());
    }

    // --- [ cuStreamSetAttribute ] ---

    /** {@code CUresult cuStreamSetAttribute(CUstream hStream, CUstreamAttrID attr, CUstreamAttrValue const * value)} */
    public static int ncuStreamSetAttribute(long hStream, int attr, long value) {
        long __functionAddress = Functions.StreamSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(hStream, attr, value, __functionAddress);
    }

    /** {@code CUresult cuStreamSetAttribute(CUstream hStream, CUstreamAttrID attr, CUstreamAttrValue const * value)} */
    @NativeType("CUresult")
    public static int cuStreamSetAttribute(@NativeType("CUstream") long hStream, @NativeType("CUstreamAttrID") int attr, @NativeType("CUstreamAttrValue const *") CUstreamAttrValue value) {
        return ncuStreamSetAttribute(hStream, attr, value.address());
    }

    // --- [ cuEventCreate ] ---

    /** {@code CUresult cuEventCreate(CUevent * phEvent, unsigned int Flags)} */
    public static int ncuEventCreate(long phEvent, int Flags) {
        long __functionAddress = Functions.EventCreate;
        return callPI(phEvent, Flags, __functionAddress);
    }

    /** {@code CUresult cuEventCreate(CUevent * phEvent, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuEventCreate(@NativeType("CUevent *") PointerBuffer phEvent, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(phEvent, 1);
        }
        return ncuEventCreate(memAddress(phEvent), Flags);
    }

    // --- [ cuEventRecord ] ---

    /** {@code CUresult cuEventRecord(CUevent hEvent, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuEventRecord(@NativeType("CUevent") long hEvent, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.EventRecord;
        if (CHECKS) {
            check(hEvent);
        }
        return callPPI(hEvent, hStream, __functionAddress);
    }

    // --- [ cuEventRecordWithFlags ] ---

    /** {@code CUresult cuEventRecordWithFlags(CUevent hEvent, CUstream hStream, unsigned int flags)} */
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

    /** {@code CUresult cuEventQuery(CUevent hEvent)} */
    @NativeType("CUresult")
    public static int cuEventQuery(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventQuery;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventSynchronize ] ---

    /** {@code CUresult cuEventSynchronize(CUevent hEvent)} */
    @NativeType("CUresult")
    public static int cuEventSynchronize(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventSynchronize;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventDestroy ] ---

    /** {@code CUresult cuEventDestroy(CUevent hEvent)} */
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

    /** {@code CUresult cuEventElapsedTime(float * pMilliseconds, CUevent hStart, CUevent hEnd)} */
    public static int ncuEventElapsedTime(long pMilliseconds, long hStart, long hEnd) {
        long __functionAddress = Functions.EventElapsedTime;
        if (CHECKS) {
            check(hStart);
            check(hEnd);
        }
        return callPPPI(pMilliseconds, hStart, hEnd, __functionAddress);
    }

    /** {@code CUresult cuEventElapsedTime(float * pMilliseconds, CUevent hStart, CUevent hEnd)} */
    @NativeType("CUresult")
    public static int cuEventElapsedTime(@NativeType("float *") FloatBuffer pMilliseconds, @NativeType("CUevent") long hStart, @NativeType("CUevent") long hEnd) {
        if (CHECKS) {
            check(pMilliseconds, 1);
        }
        return ncuEventElapsedTime(memAddress(pMilliseconds), hStart, hEnd);
    }

    // --- [ cuImportExternalMemory ] ---

    /** {@code CUresult cuImportExternalMemory(CUexternalMemory * extMem_out, CUDA_EXTERNAL_MEMORY_HANDLE_DESC const * memHandleDesc)} */
    public static int ncuImportExternalMemory(long extMem_out, long memHandleDesc) {
        long __functionAddress = Functions.ImportExternalMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(extMem_out, memHandleDesc, __functionAddress);
    }

    /** {@code CUresult cuImportExternalMemory(CUexternalMemory * extMem_out, CUDA_EXTERNAL_MEMORY_HANDLE_DESC const * memHandleDesc)} */
    @NativeType("CUresult")
    public static int cuImportExternalMemory(@NativeType("CUexternalMemory *") PointerBuffer extMem_out, @NativeType("CUDA_EXTERNAL_MEMORY_HANDLE_DESC const *") CUDA_EXTERNAL_MEMORY_HANDLE_DESC memHandleDesc) {
        if (CHECKS) {
            check(extMem_out, 1);
        }
        return ncuImportExternalMemory(memAddress(extMem_out), memHandleDesc.address());
    }

    // --- [ cuExternalMemoryGetMappedBuffer ] ---

    /** {@code CUresult cuExternalMemoryGetMappedBuffer(CUdeviceptr * devPtr, CUexternalMemory extMem, CUDA_EXTERNAL_MEMORY_BUFFER_DESC const * bufferDesc)} */
    public static int ncuExternalMemoryGetMappedBuffer(long devPtr, long extMem, long bufferDesc) {
        long __functionAddress = Functions.ExternalMemoryGetMappedBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(extMem);
        }
        return callPPPI(devPtr, extMem, bufferDesc, __functionAddress);
    }

    /** {@code CUresult cuExternalMemoryGetMappedBuffer(CUdeviceptr * devPtr, CUexternalMemory extMem, CUDA_EXTERNAL_MEMORY_BUFFER_DESC const * bufferDesc)} */
    @NativeType("CUresult")
    public static int cuExternalMemoryGetMappedBuffer(@NativeType("CUdeviceptr *") PointerBuffer devPtr, @NativeType("CUexternalMemory") long extMem, @NativeType("CUDA_EXTERNAL_MEMORY_BUFFER_DESC const *") CUDA_EXTERNAL_MEMORY_BUFFER_DESC bufferDesc) {
        if (CHECKS) {
            check(devPtr, 1);
        }
        return ncuExternalMemoryGetMappedBuffer(memAddress(devPtr), extMem, bufferDesc.address());
    }

    // --- [ cuExternalMemoryGetMappedMipmappedArray ] ---

    /** {@code CUresult cuExternalMemoryGetMappedMipmappedArray(CUmipmappedArray * mipmap, CUexternalMemory extMem, CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC const * mipmapDesc)} */
    public static int ncuExternalMemoryGetMappedMipmappedArray(long mipmap, long extMem, long mipmapDesc) {
        long __functionAddress = Functions.ExternalMemoryGetMappedMipmappedArray;
        if (CHECKS) {
            check(__functionAddress);
            check(extMem);
        }
        return callPPPI(mipmap, extMem, mipmapDesc, __functionAddress);
    }

    /** {@code CUresult cuExternalMemoryGetMappedMipmappedArray(CUmipmappedArray * mipmap, CUexternalMemory extMem, CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC const * mipmapDesc)} */
    @NativeType("CUresult")
    public static int cuExternalMemoryGetMappedMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer mipmap, @NativeType("CUexternalMemory") long extMem, @NativeType("CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC const *") CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC mipmapDesc) {
        if (CHECKS) {
            check(mipmap, 1);
        }
        return ncuExternalMemoryGetMappedMipmappedArray(memAddress(mipmap), extMem, mipmapDesc.address());
    }

    // --- [ cuDestroyExternalMemory ] ---

    /** {@code CUresult cuDestroyExternalMemory(CUexternalMemory extMem)} */
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

    /** {@code CUresult cuImportExternalSemaphore(CUexternalSemaphore * extSem_out, CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC const * semHandleDesc)} */
    public static int ncuImportExternalSemaphore(long extSem_out, long semHandleDesc) {
        long __functionAddress = Functions.ImportExternalSemaphore;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(extSem_out, semHandleDesc, __functionAddress);
    }

    /** {@code CUresult cuImportExternalSemaphore(CUexternalSemaphore * extSem_out, CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC const * semHandleDesc)} */
    @NativeType("CUresult")
    public static int cuImportExternalSemaphore(@NativeType("CUexternalSemaphore *") PointerBuffer extSem_out, @NativeType("CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC const *") CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC semHandleDesc) {
        if (CHECKS) {
            check(extSem_out, 1);
        }
        return ncuImportExternalSemaphore(memAddress(extSem_out), semHandleDesc.address());
    }

    // --- [ cuSignalExternalSemaphoresAsync ] ---

    /** {@code CUresult cuSignalExternalSemaphoresAsync(CUexternalSemaphore const * extSemArray, CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const * paramsArray, unsigned int numExtSems, CUstream stream)} */
    public static int ncuSignalExternalSemaphoresAsync(long extSemArray, long paramsArray, int numExtSems, long stream) {
        long __functionAddress = Functions.SignalExternalSemaphoresAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(extSemArray, paramsArray, numExtSems, stream, __functionAddress);
    }

    /** {@code CUresult cuSignalExternalSemaphoresAsync(CUexternalSemaphore const * extSemArray, CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const * paramsArray, unsigned int numExtSems, CUstream stream)} */
    @NativeType("CUresult")
    public static int cuSignalExternalSemaphoresAsync(@NativeType("CUexternalSemaphore const *") PointerBuffer extSemArray, @NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer paramsArray, @NativeType("CUstream") long stream) {
        if (CHECKS) {
            check(paramsArray, extSemArray.remaining());
        }
        return ncuSignalExternalSemaphoresAsync(memAddress(extSemArray), paramsArray.address(), extSemArray.remaining(), stream);
    }

    // --- [ cuWaitExternalSemaphoresAsync ] ---

    /** {@code CUresult cuWaitExternalSemaphoresAsync(CUexternalSemaphore const * extSemArray, CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const * paramsArray, unsigned int numExtSems, CUstream stream)} */
    public static int ncuWaitExternalSemaphoresAsync(long extSemArray, long paramsArray, int numExtSems, long stream) {
        long __functionAddress = Functions.WaitExternalSemaphoresAsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(extSemArray, paramsArray, numExtSems, stream, __functionAddress);
    }

    /** {@code CUresult cuWaitExternalSemaphoresAsync(CUexternalSemaphore const * extSemArray, CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const * paramsArray, unsigned int numExtSems, CUstream stream)} */
    @NativeType("CUresult")
    public static int cuWaitExternalSemaphoresAsync(@NativeType("CUexternalSemaphore const *") PointerBuffer extSemArray, @NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer paramsArray, @NativeType("CUstream") long stream) {
        if (CHECKS) {
            check(paramsArray, extSemArray.remaining());
        }
        return ncuWaitExternalSemaphoresAsync(memAddress(extSemArray), paramsArray.address(), extSemArray.remaining(), stream);
    }

    // --- [ cuDestroyExternalSemaphore ] ---

    /** {@code CUresult cuDestroyExternalSemaphore(CUexternalSemaphore extSem)} */
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

    /** {@code CUresult cuStreamWaitValue32(CUstream stream, CUdeviceptr addr, cuuint32_t value, unsigned int flags)} */
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

    /** {@code CUresult cuStreamWaitValue64(CUstream stream, CUdeviceptr addr, cuuint64_t value, unsigned int flags)} */
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

    /** {@code CUresult cuStreamWriteValue32(CUstream stream, CUdeviceptr addr, cuuint32_t value, unsigned int flags)} */
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

    /** {@code CUresult cuStreamWriteValue64(CUstream stream, CUdeviceptr addr, cuuint64_t value, unsigned int flags)} */
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

    /** {@code CUresult cuStreamBatchMemOp(CUstream stream, unsigned int count, CUstreamBatchMemOpParams * paramArray, unsigned int flags)} */
    public static int ncuStreamBatchMemOp(long stream, int count, long paramArray, int flags) {
        long __functionAddress = Functions.StreamBatchMemOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(stream, count, paramArray, flags, __functionAddress);
    }

    /** {@code CUresult cuStreamBatchMemOp(CUstream stream, unsigned int count, CUstreamBatchMemOpParams * paramArray, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuStreamBatchMemOp(@NativeType("CUstream") long stream, @NativeType("CUstreamBatchMemOpParams *") CUstreamBatchMemOpParams.Buffer paramArray, @NativeType("unsigned int") int flags) {
        return ncuStreamBatchMemOp(stream, paramArray.remaining(), paramArray.address(), flags);
    }

    // --- [ cuFuncGetAttribute ] ---

    /** {@code CUresult cuFuncGetAttribute(int * pi, CUfunction_attribute attrib, CUfunction hfunc)} */
    public static int ncuFuncGetAttribute(long pi, int attrib, long hfunc) {
        long __functionAddress = Functions.FuncGetAttribute;
        if (CHECKS) {
            check(hfunc);
        }
        return callPPI(pi, attrib, hfunc, __functionAddress);
    }

    /** {@code CUresult cuFuncGetAttribute(int * pi, CUfunction_attribute attrib, CUfunction hfunc)} */
    @NativeType("CUresult")
    public static int cuFuncGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUfunction_attribute") int attrib, @NativeType("CUfunction") long hfunc) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuFuncGetAttribute(memAddress(pi), attrib, hfunc);
    }

    // --- [ cuFuncSetAttribute ] ---

    /** {@code CUresult cuFuncSetAttribute(CUfunction hfunc, CUfunction_attribute attrib, int value)} */
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

    /** {@code CUresult cuFuncSetCacheConfig(CUfunction hfunc, CUfunc_cache config)} */
    @NativeType("CUresult")
    public static int cuFuncSetCacheConfig(@NativeType("CUfunction") long hfunc, @NativeType("CUfunc_cache") int config) {
        long __functionAddress = Functions.FuncSetCacheConfig;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, config, __functionAddress);
    }

    // --- [ cuFuncSetSharedMemConfig ] ---

    /** {@code CUresult cuFuncSetSharedMemConfig(CUfunction hfunc, CUsharedconfig config)} */
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

    /** {@code CUresult cuFuncGetModule(CUmodule * hmod, CUfunction hfunc)} */
    public static int ncuFuncGetModule(long hmod, long hfunc) {
        long __functionAddress = Functions.FuncGetModule;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPPI(hmod, hfunc, __functionAddress);
    }

    /** {@code CUresult cuFuncGetModule(CUmodule * hmod, CUfunction hfunc)} */
    @NativeType("CUresult")
    public static int cuFuncGetModule(@NativeType("CUmodule *") PointerBuffer hmod, @NativeType("CUfunction") long hfunc) {
        if (CHECKS) {
            check(hmod, 1);
        }
        return ncuFuncGetModule(memAddress(hmod), hfunc);
    }

    // --- [ cuFuncGetName ] ---

    /** {@code CUresult cuFuncGetName(char ** name, CUfunction hfunc)} */
    public static int ncuFuncGetName(long name, long hfunc) {
        long __functionAddress = Functions.FuncGetName;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPPI(name, hfunc, __functionAddress);
    }

    /** {@code CUresult cuFuncGetName(char ** name, CUfunction hfunc)} */
    @NativeType("CUresult")
    public static int cuFuncGetName(@NativeType("char **") PointerBuffer name, @NativeType("CUfunction") long hfunc) {
        if (CHECKS) {
            check(name, 1);
        }
        return ncuFuncGetName(memAddress(name), hfunc);
    }

    // --- [ cuFuncGetParamInfo ] ---

    /** {@code CUresult cuFuncGetParamInfo(CUfunction hfunc, size_t paramIndex, size_t * paramOffset, size_t * paramSize)} */
    public static int ncuFuncGetParamInfo(long hfunc, long paramIndex, long paramOffset, long paramSize) {
        long __functionAddress = Functions.FuncGetParamInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(hfunc);
        }
        return callPPPPI(hfunc, paramIndex, paramOffset, paramSize, __functionAddress);
    }

    /** {@code CUresult cuFuncGetParamInfo(CUfunction hfunc, size_t paramIndex, size_t * paramOffset, size_t * paramSize)} */
    @NativeType("CUresult")
    public static int cuFuncGetParamInfo(@NativeType("CUfunction") long hfunc, @NativeType("size_t") long paramIndex, @NativeType("size_t *") PointerBuffer paramOffset, @NativeType("size_t *") @Nullable PointerBuffer paramSize) {
        if (CHECKS) {
            check(paramOffset, 1);
            checkSafe(paramSize, 1);
        }
        return ncuFuncGetParamInfo(hfunc, paramIndex, memAddress(paramOffset), memAddressSafe(paramSize));
    }

    // --- [ cuFuncIsLoaded ] ---

    /** {@code CUresult cuFuncIsLoaded(CUfunctionLoadingState * state, CUfunction function)} */
    public static int ncuFuncIsLoaded(long state, long function) {
        long __functionAddress = Functions.FuncIsLoaded;
        if (CHECKS) {
            check(__functionAddress);
            check(function);
        }
        return callPPI(state, function, __functionAddress);
    }

    /** {@code CUresult cuFuncIsLoaded(CUfunctionLoadingState * state, CUfunction function)} */
    @NativeType("CUresult")
    public static int cuFuncIsLoaded(@NativeType("CUfunctionLoadingState *") IntBuffer state, @NativeType("CUfunction") long function) {
        if (CHECKS) {
            check(state, 1);
        }
        return ncuFuncIsLoaded(memAddress(state), function);
    }

    // --- [ cuFuncLoad ] ---

    /** {@code CUresult cuFuncLoad(CUfunction function)} */
    @NativeType("CUresult")
    public static int cuFuncLoad(@NativeType("CUfunction") long function) {
        long __functionAddress = Functions.FuncLoad;
        if (CHECKS) {
            check(__functionAddress);
            check(function);
        }
        return callPI(function, __functionAddress);
    }

    // --- [ cuLaunchKernel ] ---

    /** {@code CUresult cuLaunchKernel(CUfunction f, unsigned int gridDimX, unsigned int gridDimY, unsigned int gridDimZ, unsigned int blockDimX, unsigned int blockDimY, unsigned int blockDimZ, unsigned int sharedMemBytes, CUstream hStream, void ** kernelParams, void ** extra)} */
    public static int ncuLaunchKernel(long f, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, long hStream, long kernelParams, long extra) {
        long __functionAddress = Functions.LaunchKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(f);
        }
        return callPPPPI(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, kernelParams, extra, __functionAddress);
    }

    /** {@code CUresult cuLaunchKernel(CUfunction f, unsigned int gridDimX, unsigned int gridDimY, unsigned int gridDimZ, unsigned int blockDimX, unsigned int blockDimY, unsigned int blockDimZ, unsigned int sharedMemBytes, CUstream hStream, void ** kernelParams, void ** extra)} */
    @NativeType("CUresult")
    public static int cuLaunchKernel(@NativeType("CUfunction") long f, @NativeType("unsigned int") int gridDimX, @NativeType("unsigned int") int gridDimY, @NativeType("unsigned int") int gridDimZ, @NativeType("unsigned int") int blockDimX, @NativeType("unsigned int") int blockDimY, @NativeType("unsigned int") int blockDimZ, @NativeType("unsigned int") int sharedMemBytes, @NativeType("CUstream") long hStream, @NativeType("void **") @Nullable PointerBuffer kernelParams, @NativeType("void **") @Nullable PointerBuffer extra) {
        return ncuLaunchKernel(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, memAddressSafe(kernelParams), memAddressSafe(extra));
    }

    // --- [ cuLaunchKernelEx ] ---

    /** {@code CUresult cuLaunchKernelEx(CUlaunchConfig const * config, CUfunction f, void ** kernelParams, void ** extra)} */
    public static int ncuLaunchKernelEx(long config, long f, long kernelParams, long extra) {
        long __functionAddress = Functions.LaunchKernelEx;
        if (CHECKS) {
            check(__functionAddress);
            check(f);
        }
        return callPPPPI(config, f, kernelParams, extra, __functionAddress);
    }

    /** {@code CUresult cuLaunchKernelEx(CUlaunchConfig const * config, CUfunction f, void ** kernelParams, void ** extra)} */
    @NativeType("CUresult")
    public static int cuLaunchKernelEx(@NativeType("CUlaunchConfig const *") CUlaunchConfig config, @NativeType("CUfunction") long f, @NativeType("void **") @Nullable PointerBuffer kernelParams, @NativeType("void **") @Nullable PointerBuffer extra) {
        return ncuLaunchKernelEx(config.address(), f, memAddressSafe(kernelParams), memAddressSafe(extra));
    }

    // --- [ cuLaunchCooperativeKernel ] ---

    /** {@code CUresult cuLaunchCooperativeKernel(CUfunction f, unsigned int gridDimX, unsigned int gridDimY, unsigned int gridDimZ, unsigned int blockDimX, unsigned int blockDimY, unsigned int blockDimZ, unsigned int sharedMemBytes, CUstream hStream, void ** kernelParams)} */
    public static int ncuLaunchCooperativeKernel(long f, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, long hStream, long kernelParams) {
        long __functionAddress = Functions.LaunchCooperativeKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(f);
        }
        return callPPPI(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, kernelParams, __functionAddress);
    }

    /** {@code CUresult cuLaunchCooperativeKernel(CUfunction f, unsigned int gridDimX, unsigned int gridDimY, unsigned int gridDimZ, unsigned int blockDimX, unsigned int blockDimY, unsigned int blockDimZ, unsigned int sharedMemBytes, CUstream hStream, void ** kernelParams)} */
    @NativeType("CUresult")
    public static int cuLaunchCooperativeKernel(@NativeType("CUfunction") long f, @NativeType("unsigned int") int gridDimX, @NativeType("unsigned int") int gridDimY, @NativeType("unsigned int") int gridDimZ, @NativeType("unsigned int") int blockDimX, @NativeType("unsigned int") int blockDimY, @NativeType("unsigned int") int blockDimZ, @NativeType("unsigned int") int sharedMemBytes, @NativeType("CUstream") long hStream, @NativeType("void **") @Nullable PointerBuffer kernelParams) {
        return ncuLaunchCooperativeKernel(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, memAddressSafe(kernelParams));
    }

    // --- [ cuLaunchCooperativeKernelMultiDevice ] ---

    /** {@code CUresult cuLaunchCooperativeKernelMultiDevice(CUDA_LAUNCH_PARAMS * launchParamsList, unsigned int numDevices, unsigned int flags)} */
    public static int ncuLaunchCooperativeKernelMultiDevice(long launchParamsList, int numDevices, int flags) {
        long __functionAddress = Functions.LaunchCooperativeKernelMultiDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(launchParamsList, numDevices, flags, __functionAddress);
    }

    /** {@code CUresult cuLaunchCooperativeKernelMultiDevice(CUDA_LAUNCH_PARAMS * launchParamsList, unsigned int numDevices, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuLaunchCooperativeKernelMultiDevice(@NativeType("CUDA_LAUNCH_PARAMS *") CUDA_LAUNCH_PARAMS.Buffer launchParamsList, @NativeType("unsigned int") int flags) {
        return ncuLaunchCooperativeKernelMultiDevice(launchParamsList.address(), launchParamsList.remaining(), flags);
    }

    // --- [ cuLaunchHostFunc ] ---

    /** {@code CUresult cuLaunchHostFunc(CUstream hStream, void (*) (void *) fn, void * userData)} */
    public static int ncuLaunchHostFunc(long hStream, long fn, long userData) {
        long __functionAddress = Functions.LaunchHostFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(userData);
        }
        return callPPPI(hStream, fn, userData, __functionAddress);
    }

    /** {@code CUresult cuLaunchHostFunc(CUstream hStream, void (*) (void *) fn, void * userData)} */
    @NativeType("CUresult")
    public static int cuLaunchHostFunc(@NativeType("CUstream") long hStream, @NativeType("void (*) (void *)") CUhostFnI fn, @NativeType("void *") long userData) {
        return ncuLaunchHostFunc(hStream, fn.address(), userData);
    }

    // --- [ cuFuncSetBlockShape ] ---

    /** {@code CUresult cuFuncSetBlockShape(CUfunction hfunc, int x, int y, int z)} */
    @NativeType("CUresult")
    public static int cuFuncSetBlockShape(@NativeType("CUfunction") long hfunc, int x, int y, int z) {
        long __functionAddress = Functions.FuncSetBlockShape;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, x, y, z, __functionAddress);
    }

    // --- [ cuFuncSetSharedSize ] ---

    /** {@code CUresult cuFuncSetSharedSize(CUfunction hfunc, unsigned int bytes)} */
    @NativeType("CUresult")
    public static int cuFuncSetSharedSize(@NativeType("CUfunction") long hfunc, @NativeType("unsigned int") int bytes) {
        long __functionAddress = Functions.FuncSetSharedSize;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, bytes, __functionAddress);
    }

    // --- [ cuParamSetSize ] ---

    /** {@code CUresult cuParamSetSize(CUfunction hfunc, unsigned int numbytes)} */
    @NativeType("CUresult")
    public static int cuParamSetSize(@NativeType("CUfunction") long hfunc, @NativeType("unsigned int") int numbytes) {
        long __functionAddress = Functions.ParamSetSize;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, numbytes, __functionAddress);
    }

    // --- [ cuParamSeti ] ---

    /** {@code CUresult cuParamSeti(CUfunction hfunc, int offset, unsigned int value)} */
    @NativeType("CUresult")
    public static int cuParamSeti(@NativeType("CUfunction") long hfunc, int offset, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.ParamSeti;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, offset, value, __functionAddress);
    }

    // --- [ cuParamSetf ] ---

    /** {@code CUresult cuParamSetf(CUfunction hfunc, int offset, float value)} */
    @NativeType("CUresult")
    public static int cuParamSetf(@NativeType("CUfunction") long hfunc, int offset, float value) {
        long __functionAddress = Functions.ParamSetf;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, offset, value, __functionAddress);
    }

    // --- [ cuParamSetv ] ---

    /** {@code CUresult cuParamSetv(CUfunction hfunc, int offset, void * ptr, unsigned int numbytes)} */
    public static int ncuParamSetv(long hfunc, int offset, long ptr, int numbytes) {
        long __functionAddress = Functions.ParamSetv;
        if (CHECKS) {
            check(hfunc);
        }
        return callPPI(hfunc, offset, ptr, numbytes, __functionAddress);
    }

    /** {@code CUresult cuParamSetv(CUfunction hfunc, int offset, void * ptr, unsigned int numbytes)} */
    @NativeType("CUresult")
    public static int cuParamSetv(@NativeType("CUfunction") long hfunc, int offset, @NativeType("void *") ByteBuffer ptr) {
        return ncuParamSetv(hfunc, offset, memAddress(ptr), ptr.remaining());
    }

    // --- [ cuLaunch ] ---

    /** {@code CUresult cuLaunch(CUfunction f)} */
    @NativeType("CUresult")
    public static int cuLaunch(@NativeType("CUfunction") long f) {
        long __functionAddress = Functions.Launch;
        if (CHECKS) {
            check(f);
        }
        return callPI(f, __functionAddress);
    }

    // --- [ cuLaunchGrid ] ---

    /** {@code CUresult cuLaunchGrid(CUfunction f, int grid_width, int grid_height)} */
    @NativeType("CUresult")
    public static int cuLaunchGrid(@NativeType("CUfunction") long f, int grid_width, int grid_height) {
        long __functionAddress = Functions.LaunchGrid;
        if (CHECKS) {
            check(f);
        }
        return callPI(f, grid_width, grid_height, __functionAddress);
    }

    // --- [ cuLaunchGridAsync ] ---

    /** {@code CUresult cuLaunchGridAsync(CUfunction f, int grid_width, int grid_height, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuLaunchGridAsync(@NativeType("CUfunction") long f, int grid_width, int grid_height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.LaunchGridAsync;
        if (CHECKS) {
            check(f);
        }
        return callPPI(f, grid_width, grid_height, hStream, __functionAddress);
    }

    // --- [ cuParamSetTexRef ] ---

    /** {@code CUresult cuParamSetTexRef(CUfunction hfunc, int texunit, CUtexref hTexRef)} */
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

    /** {@code CUresult cuGraphCreate(CUgraph * phGraph, unsigned int flags)} */
    public static int ncuGraphCreate(long phGraph, int flags) {
        long __functionAddress = Functions.GraphCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(phGraph, flags, __functionAddress);
    }

    /** {@code CUresult cuGraphCreate(CUgraph * phGraph, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuGraphCreate(@NativeType("CUgraph *") PointerBuffer phGraph, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuGraphCreate(memAddress(phGraph), flags);
    }

    // --- [ cuGraphAddKernelNode ] ---

    /** {@code CUresult cuGraphAddKernelNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_KERNEL_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphAddKernelNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddKernelNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddKernelNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_KERNEL_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddKernelNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddKernelNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphAddKernelNode_v2 ] ---

    /** {@code CUresult cuGraphAddKernelNode_v2(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_KERNEL_NODE_PARAMS_v2 const * nodeParams)} */
    public static int ncuGraphAddKernelNode_v2(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddKernelNode_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddKernelNode_v2(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_KERNEL_NODE_PARAMS_v2 const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddKernelNode_v2(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_KERNEL_NODE_PARAMS_v2 const *") CUDA_KERNEL_NODE_PARAMS_v2 nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddKernelNode_v2(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphKernelNodeGetParams ] ---

    /** {@code CUresult cuGraphKernelNodeGetParams(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS * nodeParams)} */
    public static int ncuGraphKernelNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphKernelNodeGetParams(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphKernelNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphKernelNodeGetParams_v2 ] ---

    /** {@code CUresult cuGraphKernelNodeGetParams_v2(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS_v2 * nodeParams)} */
    public static int ncuGraphKernelNodeGetParams_v2(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeGetParams_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphKernelNodeGetParams_v2(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS_v2 * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeGetParams_v2(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS_v2 *") CUDA_KERNEL_NODE_PARAMS_v2 nodeParams) {
        return ncuGraphKernelNodeGetParams_v2(hNode, nodeParams.address());
    }

    // --- [ cuGraphKernelNodeSetParams ] ---

    /** {@code CUresult cuGraphKernelNodeSetParams(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphKernelNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphKernelNodeSetParams(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphKernelNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphKernelNodeSetParams_v2 ] ---

    /** {@code CUresult cuGraphKernelNodeSetParams_v2(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS_v2 const * nodeParams)} */
    public static int ncuGraphKernelNodeSetParams_v2(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeSetParams_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphKernelNodeSetParams_v2(CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS_v2 const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeSetParams_v2(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS_v2 const *") CUDA_KERNEL_NODE_PARAMS_v2 nodeParams) {
        return ncuGraphKernelNodeSetParams_v2(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemcpyNode ] ---

    /** {@code CUresult cuGraphAddMemcpyNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_MEMCPY3D const * copyParams, CUcontext ctx)} */
    public static int ncuGraphAddMemcpyNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long copyParams, long ctx) {
        long __functionAddress = Functions.GraphAddMemcpyNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(ctx);
        }
        return callPPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, copyParams, ctx, __functionAddress);
    }

    /** {@code CUresult cuGraphAddMemcpyNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_MEMCPY3D const * copyParams, CUcontext ctx)} */
    @NativeType("CUresult")
    public static int cuGraphAddMemcpyNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D copyParams, @NativeType("CUcontext") long ctx) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemcpyNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), copyParams.address(), ctx);
    }

    // --- [ cuGraphMemcpyNodeGetParams ] ---

    /** {@code CUresult cuGraphMemcpyNodeGetParams(CUgraphNode hNode, CUDA_MEMCPY3D * nodeParams)} */
    public static int ncuGraphMemcpyNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemcpyNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphMemcpyNodeGetParams(CUgraphNode hNode, CUDA_MEMCPY3D * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphMemcpyNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D *") CUDA_MEMCPY3D nodeParams) {
        return ncuGraphMemcpyNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphMemcpyNodeSetParams ] ---

    /** {@code CUresult cuGraphMemcpyNodeSetParams(CUgraphNode hNode, CUDA_MEMCPY3D const * nodeParams)} */
    public static int ncuGraphMemcpyNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemcpyNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphMemcpyNodeSetParams(CUgraphNode hNode, CUDA_MEMCPY3D const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphMemcpyNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D nodeParams) {
        return ncuGraphMemcpyNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemsetNode ] ---

    /** {@code CUresult cuGraphAddMemsetNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_MEMSET_NODE_PARAMS const * memsetParams, CUcontext ctx)} */
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

    /** {@code CUresult cuGraphAddMemsetNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_MEMSET_NODE_PARAMS const * memsetParams, CUcontext ctx)} */
    @NativeType("CUresult")
    public static int cuGraphAddMemsetNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS memsetParams, @NativeType("CUcontext") long ctx) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemsetNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), memsetParams.address(), ctx);
    }

    // --- [ cuGraphMemsetNodeGetParams ] ---

    /** {@code CUresult cuGraphMemsetNodeGetParams(CUgraphNode hNode, CUDA_MEMSET_NODE_PARAMS * nodeParams)} */
    public static int ncuGraphMemsetNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemsetNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphMemsetNodeGetParams(CUgraphNode hNode, CUDA_MEMSET_NODE_PARAMS * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphMemsetNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS *") CUDA_MEMSET_NODE_PARAMS nodeParams) {
        return ncuGraphMemsetNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphMemsetNodeSetParams ] ---

    /** {@code CUresult cuGraphMemsetNodeSetParams(CUgraphNode hNode, CUDA_MEMSET_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphMemsetNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemsetNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_MEMSET_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphMemsetNodeSetParams(CUgraphNode hNode, CUDA_MEMSET_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphMemsetNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS nodeParams) {
        return ncuGraphMemsetNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddHostNode ] ---

    /** {@code CUresult cuGraphAddHostNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_HOST_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphAddHostNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddHostNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddHostNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_HOST_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddHostNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddHostNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphHostNodeGetParams ] ---

    /** {@code CUresult cuGraphHostNodeGetParams(CUgraphNode hNode, CUDA_HOST_NODE_PARAMS * nodeParams)} */
    public static int ncuGraphHostNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphHostNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphHostNodeGetParams(CUgraphNode hNode, CUDA_HOST_NODE_PARAMS * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphHostNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphHostNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphHostNodeSetParams ] ---

    /** {@code CUresult cuGraphHostNodeSetParams(CUgraphNode hNode, CUDA_HOST_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphHostNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphHostNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphHostNodeSetParams(CUgraphNode hNode, CUDA_HOST_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphHostNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphHostNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddChildGraphNode ] ---

    /** {@code CUresult cuGraphAddChildGraphNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUgraph childGraph)} */
    public static int ncuGraphAddChildGraphNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long childGraph) {
        long __functionAddress = Functions.GraphAddChildGraphNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(childGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, childGraph, __functionAddress);
    }

    /** {@code CUresult cuGraphAddChildGraphNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUgraph childGraph)} */
    @NativeType("CUresult")
    public static int cuGraphAddChildGraphNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUgraph") long childGraph) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddChildGraphNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), childGraph);
    }

    // --- [ cuGraphChildGraphNodeGetGraph ] ---

    /** {@code CUresult cuGraphChildGraphNodeGetGraph(CUgraphNode hNode, CUgraph * phGraph)} */
    public static int ncuGraphChildGraphNodeGetGraph(long hNode, long phGraph) {
        long __functionAddress = Functions.GraphChildGraphNodeGetGraph;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, phGraph, __functionAddress);
    }

    /** {@code CUresult cuGraphChildGraphNodeGetGraph(CUgraphNode hNode, CUgraph * phGraph)} */
    @NativeType("CUresult")
    public static int cuGraphChildGraphNodeGetGraph(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraph *") PointerBuffer phGraph) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuGraphChildGraphNodeGetGraph(hNode, memAddress(phGraph));
    }

    // --- [ cuGraphAddEmptyNode ] ---

    /** {@code CUresult cuGraphAddEmptyNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies)} */
    public static int ncuGraphAddEmptyNode(long phGraphNode, long hGraph, long dependencies, long numDependencies) {
        long __functionAddress = Functions.GraphAddEmptyNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(phGraphNode, hGraph, dependencies, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphAddEmptyNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphAddEmptyNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEmptyNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies));
    }

    // --- [ cuGraphAddEventRecordNode ] ---

    /** {@code CUresult cuGraphAddEventRecordNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUevent event)} */
    public static int ncuGraphAddEventRecordNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long event) {
        long __functionAddress = Functions.GraphAddEventRecordNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(event);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, event, __functionAddress);
    }

    /** {@code CUresult cuGraphAddEventRecordNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUevent event)} */
    @NativeType("CUresult")
    public static int cuGraphAddEventRecordNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUevent") long event) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEventRecordNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), event);
    }

    // --- [ cuGraphEventRecordNodeGetEvent ] ---

    /** {@code CUresult cuGraphEventRecordNodeGetEvent(CUgraphNode hNode, CUevent * event_out)} */
    public static int ncuGraphEventRecordNodeGetEvent(long hNode, long event_out) {
        long __functionAddress = Functions.GraphEventRecordNodeGetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, event_out, __functionAddress);
    }

    /** {@code CUresult cuGraphEventRecordNodeGetEvent(CUgraphNode hNode, CUevent * event_out)} */
    @NativeType("CUresult")
    public static int cuGraphEventRecordNodeGetEvent(@NativeType("CUgraphNode") long hNode, @NativeType("CUevent *") PointerBuffer event_out) {
        if (CHECKS) {
            check(event_out, 1);
        }
        return ncuGraphEventRecordNodeGetEvent(hNode, memAddress(event_out));
    }

    // --- [ cuGraphEventRecordNodeSetEvent ] ---

    /** {@code CUresult cuGraphEventRecordNodeSetEvent(CUgraphNode hNode, CUevent event)} */
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

    /** {@code CUresult cuGraphAddEventWaitNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUevent event)} */
    public static int ncuGraphAddEventWaitNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long event) {
        long __functionAddress = Functions.GraphAddEventWaitNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(event);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, event, __functionAddress);
    }

    /** {@code CUresult cuGraphAddEventWaitNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUevent event)} */
    @NativeType("CUresult")
    public static int cuGraphAddEventWaitNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUevent") long event) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEventWaitNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), event);
    }

    // --- [ cuGraphEventWaitNodeGetEvent ] ---

    /** {@code CUresult cuGraphEventWaitNodeGetEvent(CUgraphNode hNode, CUevent * event_out)} */
    public static int ncuGraphEventWaitNodeGetEvent(long hNode, long event_out) {
        long __functionAddress = Functions.GraphEventWaitNodeGetEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, event_out, __functionAddress);
    }

    /** {@code CUresult cuGraphEventWaitNodeGetEvent(CUgraphNode hNode, CUevent * event_out)} */
    @NativeType("CUresult")
    public static int cuGraphEventWaitNodeGetEvent(@NativeType("CUgraphNode") long hNode, @NativeType("CUevent *") PointerBuffer event_out) {
        if (CHECKS) {
            check(event_out, 1);
        }
        return ncuGraphEventWaitNodeGetEvent(hNode, memAddress(event_out));
    }

    // --- [ cuGraphEventWaitNodeSetEvent ] ---

    /** {@code CUresult cuGraphEventWaitNodeSetEvent(CUgraphNode hNode, CUevent event)} */
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

    /** {@code CUresult cuGraphAddExternalSemaphoresSignalNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphAddExternalSemaphoresSignalNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddExternalSemaphoresSignalNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddExternalSemaphoresSignalNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddExternalSemaphoresSignalNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddExternalSemaphoresSignalNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphExternalSemaphoresSignalNodeGetParams ] ---

    /** {@code CUresult cuGraphExternalSemaphoresSignalNodeGetParams(CUgraphNode hNode, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS * params_out)} */
    public static int ncuGraphExternalSemaphoresSignalNodeGetParams(long hNode, long params_out) {
        long __functionAddress = Functions.GraphExternalSemaphoresSignalNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, params_out, __functionAddress);
    }

    /** {@code CUresult cuGraphExternalSemaphoresSignalNodeGetParams(CUgraphNode hNode, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS * params_out)} */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresSignalNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS params_out) {
        return ncuGraphExternalSemaphoresSignalNodeGetParams(hNode, params_out.address());
    }

    // --- [ cuGraphExternalSemaphoresSignalNodeSetParams ] ---

    /** {@code CUresult cuGraphExternalSemaphoresSignalNodeSetParams(CUgraphNode hNode, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphExternalSemaphoresSignalNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExternalSemaphoresSignalNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphExternalSemaphoresSignalNodeSetParams(CUgraphNode hNode, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresSignalNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS nodeParams) {
        return ncuGraphExternalSemaphoresSignalNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddExternalSemaphoresWaitNode ] ---

    /** {@code CUresult cuGraphAddExternalSemaphoresWaitNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_EXT_SEM_WAIT_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphAddExternalSemaphoresWaitNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddExternalSemaphoresWaitNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            CUDA_EXT_SEM_WAIT_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddExternalSemaphoresWaitNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_EXT_SEM_WAIT_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddExternalSemaphoresWaitNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS const *") CUDA_EXT_SEM_WAIT_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddExternalSemaphoresWaitNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphExternalSemaphoresWaitNodeGetParams ] ---

    /** {@code CUresult cuGraphExternalSemaphoresWaitNodeGetParams(CUgraphNode hNode, CUDA_EXT_SEM_WAIT_NODE_PARAMS * params_out)} */
    public static int ncuGraphExternalSemaphoresWaitNodeGetParams(long hNode, long params_out) {
        long __functionAddress = Functions.GraphExternalSemaphoresWaitNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, params_out, __functionAddress);
    }

    /** {@code CUresult cuGraphExternalSemaphoresWaitNodeGetParams(CUgraphNode hNode, CUDA_EXT_SEM_WAIT_NODE_PARAMS * params_out)} */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresWaitNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS *") CUDA_EXT_SEM_WAIT_NODE_PARAMS params_out) {
        return ncuGraphExternalSemaphoresWaitNodeGetParams(hNode, params_out.address());
    }

    // --- [ cuGraphExternalSemaphoresWaitNodeSetParams ] ---

    /** {@code CUresult cuGraphExternalSemaphoresWaitNodeSetParams(CUgraphNode hNode, CUDA_EXT_SEM_WAIT_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphExternalSemaphoresWaitNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExternalSemaphoresWaitNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            CUDA_EXT_SEM_WAIT_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphExternalSemaphoresWaitNodeSetParams(CUgraphNode hNode, CUDA_EXT_SEM_WAIT_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExternalSemaphoresWaitNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS const *") CUDA_EXT_SEM_WAIT_NODE_PARAMS nodeParams) {
        return ncuGraphExternalSemaphoresWaitNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddBatchMemOpNode ] ---

    /** {@code CUresult cuGraphAddBatchMemOpNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_BATCH_MEM_OP_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphAddBatchMemOpNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddBatchMemOpNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            if (nodeParams != NULL) { CUDA_BATCH_MEM_OP_NODE_PARAMS.validate(nodeParams); }
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddBatchMemOpNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_BATCH_MEM_OP_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddBatchMemOpNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_BATCH_MEM_OP_NODE_PARAMS const *") @Nullable CUDA_BATCH_MEM_OP_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddBatchMemOpNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), memAddressSafe(nodeParams));
    }

    // --- [ cuGraphBatchMemOpNodeGetParams ] ---

    /** {@code CUresult cuGraphBatchMemOpNodeGetParams(CUgraphNode hNode, CUDA_BATCH_MEM_OP_NODE_PARAMS * nodeParams_out)} */
    public static int ncuGraphBatchMemOpNodeGetParams(long hNode, long nodeParams_out) {
        long __functionAddress = Functions.GraphBatchMemOpNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams_out, __functionAddress);
    }

    /** {@code CUresult cuGraphBatchMemOpNodeGetParams(CUgraphNode hNode, CUDA_BATCH_MEM_OP_NODE_PARAMS * nodeParams_out)} */
    @NativeType("CUresult")
    public static int cuGraphBatchMemOpNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_BATCH_MEM_OP_NODE_PARAMS *") CUDA_BATCH_MEM_OP_NODE_PARAMS nodeParams_out) {
        return ncuGraphBatchMemOpNodeGetParams(hNode, nodeParams_out.address());
    }

    // --- [ cuGraphBatchMemOpNodeSetParams ] ---

    /** {@code CUresult cuGraphBatchMemOpNodeSetParams(CUgraphNode hNode, CUDA_BATCH_MEM_OP_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphBatchMemOpNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphBatchMemOpNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
            if (nodeParams != NULL) { CUDA_BATCH_MEM_OP_NODE_PARAMS.validate(nodeParams); }
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphBatchMemOpNodeSetParams(CUgraphNode hNode, CUDA_BATCH_MEM_OP_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphBatchMemOpNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_BATCH_MEM_OP_NODE_PARAMS const *") @Nullable CUDA_BATCH_MEM_OP_NODE_PARAMS nodeParams) {
        return ncuGraphBatchMemOpNodeSetParams(hNode, memAddressSafe(nodeParams));
    }

    // --- [ cuGraphExecBatchMemOpNodeSetParams ] ---

    /** {@code CUresult cuGraphExecBatchMemOpNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_BATCH_MEM_OP_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphExecBatchMemOpNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecBatchMemOpNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
            if (nodeParams != NULL) { CUDA_BATCH_MEM_OP_NODE_PARAMS.validate(nodeParams); }
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphExecBatchMemOpNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_BATCH_MEM_OP_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecBatchMemOpNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_BATCH_MEM_OP_NODE_PARAMS const *") @Nullable CUDA_BATCH_MEM_OP_NODE_PARAMS nodeParams) {
        return ncuGraphExecBatchMemOpNodeSetParams(hGraphExec, hNode, memAddressSafe(nodeParams));
    }

    // --- [ cuGraphAddMemAllocNode ] ---

    /** {@code CUresult cuGraphAddMemAllocNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_MEM_ALLOC_NODE_PARAMS * nodeParams)} */
    public static int ncuGraphAddMemAllocNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddMemAllocNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddMemAllocNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUDA_MEM_ALLOC_NODE_PARAMS * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddMemAllocNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUDA_MEM_ALLOC_NODE_PARAMS *") CUDA_MEM_ALLOC_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemAllocNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphMemAllocNodeGetParams ] ---

    /** {@code CUresult cuGraphMemAllocNodeGetParams(CUgraphNode hNode, CUDA_MEM_ALLOC_NODE_PARAMS * params_out)} */
    public static int ncuGraphMemAllocNodeGetParams(long hNode, long params_out) {
        long __functionAddress = Functions.GraphMemAllocNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, params_out, __functionAddress);
    }

    /** {@code CUresult cuGraphMemAllocNodeGetParams(CUgraphNode hNode, CUDA_MEM_ALLOC_NODE_PARAMS * params_out)} */
    @NativeType("CUresult")
    public static int cuGraphMemAllocNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEM_ALLOC_NODE_PARAMS *") CUDA_MEM_ALLOC_NODE_PARAMS params_out) {
        return ncuGraphMemAllocNodeGetParams(hNode, params_out.address());
    }

    // --- [ cuGraphAddMemFreeNode ] ---

    /** {@code CUresult cuGraphAddMemFreeNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUdeviceptr dptr)} */
    public static int ncuGraphAddMemFreeNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long dptr) {
        long __functionAddress = Functions.GraphAddMemFreeNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(dptr);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, dptr, __functionAddress);
    }

    /** {@code CUresult cuGraphAddMemFreeNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUdeviceptr dptr)} */
    @NativeType("CUresult")
    public static int cuGraphAddMemFreeNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUdeviceptr") long dptr) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemFreeNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), dptr);
    }

    // --- [ cuGraphMemFreeNodeGetParams ] ---

    /** {@code CUresult cuGraphMemFreeNodeGetParams(CUgraphNode hNode, CUdeviceptr * dptr_out)} */
    public static int ncuGraphMemFreeNodeGetParams(long hNode, long dptr_out) {
        long __functionAddress = Functions.GraphMemFreeNodeGetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, dptr_out, __functionAddress);
    }

    /** {@code CUresult cuGraphMemFreeNodeGetParams(CUgraphNode hNode, CUdeviceptr * dptr_out)} */
    @NativeType("CUresult")
    public static int cuGraphMemFreeNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUdeviceptr *") PointerBuffer dptr_out) {
        if (CHECKS) {
            check(dptr_out, 1);
        }
        return ncuGraphMemFreeNodeGetParams(hNode, memAddress(dptr_out));
    }

    // --- [ cuDeviceGraphMemTrim ] ---

    /** {@code CUresult cuDeviceGraphMemTrim(CUdevice device)} */
    @NativeType("CUresult")
    public static int cuDeviceGraphMemTrim(@NativeType("CUdevice") int device) {
        long __functionAddress = Functions.DeviceGraphMemTrim;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(device, __functionAddress);
    }

    // --- [ cuDeviceGetGraphMemAttribute ] ---

    /** {@code CUresult cuDeviceGetGraphMemAttribute(CUdevice device, CUgraphMem_attribute attr, void * value)} */
    public static int ncuDeviceGetGraphMemAttribute(int device, int attr, long value) {
        long __functionAddress = Functions.DeviceGetGraphMemAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(device, attr, value, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetGraphMemAttribute(CUdevice device, CUgraphMem_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuDeviceGetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuDeviceGetGraphMemAttribute(device, attr, memAddress(value));
    }

    /** {@code CUresult cuDeviceGetGraphMemAttribute(CUdevice device, CUgraphMem_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuDeviceGetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuDeviceGetGraphMemAttribute(device, attr, memAddress(value));
    }

    // --- [ cuDeviceSetGraphMemAttribute ] ---

    /** {@code CUresult cuDeviceSetGraphMemAttribute(CUdevice device, CUgraphMem_attribute attr, void * value)} */
    public static int ncuDeviceSetGraphMemAttribute(int device, int attr, long value) {
        long __functionAddress = Functions.DeviceSetGraphMemAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(device, attr, value, __functionAddress);
    }

    /** {@code CUresult cuDeviceSetGraphMemAttribute(CUdevice device, CUgraphMem_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuDeviceSetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") ByteBuffer value) {
        return ncuDeviceSetGraphMemAttribute(device, attr, memAddress(value));
    }

    /** {@code CUresult cuDeviceSetGraphMemAttribute(CUdevice device, CUgraphMem_attribute attr, void * value)} */
    @NativeType("CUresult")
    public static int cuDeviceSetGraphMemAttribute(@NativeType("CUdevice") int device, @NativeType("CUgraphMem_attribute") int attr, @NativeType("void *") LongBuffer value) {
        return ncuDeviceSetGraphMemAttribute(device, attr, memAddress(value));
    }

    // --- [ cuGraphClone ] ---

    /** {@code CUresult cuGraphClone(CUgraph * phGraphClone, CUgraph originalGraph)} */
    public static int ncuGraphClone(long phGraphClone, long originalGraph) {
        long __functionAddress = Functions.GraphClone;
        if (CHECKS) {
            check(__functionAddress);
            check(originalGraph);
        }
        return callPPI(phGraphClone, originalGraph, __functionAddress);
    }

    /** {@code CUresult cuGraphClone(CUgraph * phGraphClone, CUgraph originalGraph)} */
    @NativeType("CUresult")
    public static int cuGraphClone(@NativeType("CUgraph *") PointerBuffer phGraphClone, @NativeType("CUgraph") long originalGraph) {
        if (CHECKS) {
            check(phGraphClone, 1);
        }
        return ncuGraphClone(memAddress(phGraphClone), originalGraph);
    }

    // --- [ cuGraphNodeFindInClone ] ---

    /** {@code CUresult cuGraphNodeFindInClone(CUgraphNode * phNode, CUgraphNode hOriginalNode, CUgraph hClonedGraph)} */
    public static int ncuGraphNodeFindInClone(long phNode, long hOriginalNode, long hClonedGraph) {
        long __functionAddress = Functions.GraphNodeFindInClone;
        if (CHECKS) {
            check(__functionAddress);
            check(hOriginalNode);
            check(hClonedGraph);
        }
        return callPPPI(phNode, hOriginalNode, hClonedGraph, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeFindInClone(CUgraphNode * phNode, CUgraphNode hOriginalNode, CUgraph hClonedGraph)} */
    @NativeType("CUresult")
    public static int cuGraphNodeFindInClone(@NativeType("CUgraphNode *") PointerBuffer phNode, @NativeType("CUgraphNode") long hOriginalNode, @NativeType("CUgraph") long hClonedGraph) {
        if (CHECKS) {
            check(phNode, 1);
        }
        return ncuGraphNodeFindInClone(memAddress(phNode), hOriginalNode, hClonedGraph);
    }

    // --- [ cuGraphNodeGetType ] ---

    /** {@code CUresult cuGraphNodeGetType(CUgraphNode hNode, CUgraphNodeType * type)} */
    public static int ncuGraphNodeGetType(long hNode, long type) {
        long __functionAddress = Functions.GraphNodeGetType;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, type, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeGetType(CUgraphNode hNode, CUgraphNodeType * type)} */
    @NativeType("CUresult")
    public static int cuGraphNodeGetType(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNodeType *") IntBuffer type) {
        if (CHECKS) {
            check(type, 1);
        }
        return ncuGraphNodeGetType(hNode, memAddress(type));
    }

    // --- [ cuGraphGetNodes ] ---

    /** {@code CUresult cuGraphGetNodes(CUgraph hGraph, CUgraphNode * nodes, size_t * numNodes)} */
    public static int ncuGraphGetNodes(long hGraph, long nodes, long numNodes) {
        long __functionAddress = Functions.GraphGetNodes;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPI(hGraph, nodes, numNodes, __functionAddress);
    }

    /** {@code CUresult cuGraphGetNodes(CUgraph hGraph, CUgraphNode * nodes, size_t * numNodes)} */
    @NativeType("CUresult")
    public static int cuGraphGetNodes(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") @Nullable PointerBuffer nodes, @NativeType("size_t *") PointerBuffer numNodes) {
        if (CHECKS) {
            check(numNodes, 1);
            checkSafe(nodes, numNodes.get(numNodes.position()));
        }
        return ncuGraphGetNodes(hGraph, memAddressSafe(nodes), memAddress(numNodes));
    }

    // --- [ cuGraphGetRootNodes ] ---

    /** {@code CUresult cuGraphGetRootNodes(CUgraph hGraph, CUgraphNode * rootNodes, size_t * numRootNodes)} */
    public static int ncuGraphGetRootNodes(long hGraph, long rootNodes, long numRootNodes) {
        long __functionAddress = Functions.GraphGetRootNodes;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPI(hGraph, rootNodes, numRootNodes, __functionAddress);
    }

    /** {@code CUresult cuGraphGetRootNodes(CUgraph hGraph, CUgraphNode * rootNodes, size_t * numRootNodes)} */
    @NativeType("CUresult")
    public static int cuGraphGetRootNodes(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") @Nullable PointerBuffer rootNodes, @NativeType("size_t *") PointerBuffer numRootNodes) {
        if (CHECKS) {
            check(numRootNodes, 1);
            checkSafe(rootNodes, numRootNodes.get(numRootNodes.position()));
        }
        return ncuGraphGetRootNodes(hGraph, memAddressSafe(rootNodes), memAddress(numRootNodes));
    }

    // --- [ cuGraphGetEdges ] ---

    /** {@code CUresult cuGraphGetEdges(CUgraph hGraph, CUgraphNode * from, CUgraphNode * to, size_t * numEdges)} */
    public static int ncuGraphGetEdges(long hGraph, long from, long to, long numEdges) {
        long __functionAddress = Functions.GraphGetEdges;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numEdges, __functionAddress);
    }

    /** {@code CUresult cuGraphGetEdges(CUgraph hGraph, CUgraphNode * from, CUgraphNode * to, size_t * numEdges)} */
    @NativeType("CUresult")
    public static int cuGraphGetEdges(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") @Nullable PointerBuffer from, @NativeType("CUgraphNode *") @Nullable PointerBuffer to, @NativeType("size_t *") PointerBuffer numEdges) {
        if (CHECKS) {
            check(numEdges, 1);
            checkSafe(from, numEdges.get(numEdges.position()));
            checkSafe(to, numEdges.get(numEdges.position()));
        }
        return ncuGraphGetEdges(hGraph, memAddressSafe(from), memAddressSafe(to), memAddress(numEdges));
    }

    // --- [ cuGraphGetEdges_v2 ] ---

    /** {@code CUresult cuGraphGetEdges_v2(CUgraph hGraph, CUgraphNode * from, CUgraphNode * to, CUgraphEdgeData * edgeData, size_t * numEdges)} */
    public static int ncuGraphGetEdges_v2(long hGraph, long from, long to, long edgeData, long numEdges) {
        long __functionAddress = Functions.GraphGetEdges_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(hGraph, from, to, edgeData, numEdges, __functionAddress);
    }

    /** {@code CUresult cuGraphGetEdges_v2(CUgraph hGraph, CUgraphNode * from, CUgraphNode * to, CUgraphEdgeData * edgeData, size_t * numEdges)} */
    @NativeType("CUresult")
    public static int cuGraphGetEdges_v2(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") @Nullable PointerBuffer from, @NativeType("CUgraphNode *") @Nullable PointerBuffer to, @NativeType("CUgraphEdgeData *") CUgraphEdgeData.@Nullable Buffer edgeData, @NativeType("size_t *") PointerBuffer numEdges) {
        if (CHECKS) {
            check(numEdges, 1);
            checkSafe(from, numEdges.get(numEdges.position()));
            checkSafe(to, numEdges.get(numEdges.position()));
            checkSafe(edgeData, numEdges.get(numEdges.position()));
        }
        return ncuGraphGetEdges_v2(hGraph, memAddressSafe(from), memAddressSafe(to), memAddressSafe(edgeData), memAddress(numEdges));
    }

    // --- [ cuGraphNodeGetDependencies ] ---

    /** {@code CUresult cuGraphNodeGetDependencies(CUgraphNode hNode, CUgraphNode * dependencies, size_t * numDependencies)} */
    public static int ncuGraphNodeGetDependencies(long hNode, long dependencies, long numDependencies) {
        long __functionAddress = Functions.GraphNodeGetDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPPI(hNode, dependencies, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeGetDependencies(CUgraphNode hNode, CUgraphNode * dependencies, size_t * numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphNodeGetDependencies(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNode *") @Nullable PointerBuffer dependencies, @NativeType("size_t *") PointerBuffer numDependencies) {
        if (CHECKS) {
            check(numDependencies, 1);
            checkSafe(dependencies, numDependencies.get(numDependencies.position()));
        }
        return ncuGraphNodeGetDependencies(hNode, memAddressSafe(dependencies), memAddress(numDependencies));
    }

    // --- [ cuGraphNodeGetDependencies_v2 ] ---

    /** {@code CUresult cuGraphNodeGetDependencies_v2(CUgraphNode hNode, CUgraphNode * dependencies, CUgraphEdgeData * edgeData, size_t * numDependencies)} */
    public static int ncuGraphNodeGetDependencies_v2(long hNode, long dependencies, long edgeData, long numDependencies) {
        long __functionAddress = Functions.GraphNodeGetDependencies_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPPPI(hNode, dependencies, edgeData, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeGetDependencies_v2(CUgraphNode hNode, CUgraphNode * dependencies, CUgraphEdgeData * edgeData, size_t * numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphNodeGetDependencies_v2(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNode *") @Nullable PointerBuffer dependencies, @NativeType("CUgraphEdgeData *") CUgraphEdgeData.@Nullable Buffer edgeData, @NativeType("size_t *") PointerBuffer numDependencies) {
        if (CHECKS) {
            check(numDependencies, 1);
            checkSafe(dependencies, numDependencies.get(numDependencies.position()));
            checkSafe(edgeData, numDependencies.get(numDependencies.position()));
        }
        return ncuGraphNodeGetDependencies_v2(hNode, memAddressSafe(dependencies), memAddressSafe(edgeData), memAddress(numDependencies));
    }

    // --- [ cuGraphNodeGetDependentNodes ] ---

    /** {@code CUresult cuGraphNodeGetDependentNodes(CUgraphNode hNode, CUgraphNode * dependentNodes, size_t * numDependentNodes)} */
    public static int ncuGraphNodeGetDependentNodes(long hNode, long dependentNodes, long numDependentNodes) {
        long __functionAddress = Functions.GraphNodeGetDependentNodes;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPPI(hNode, dependentNodes, numDependentNodes, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeGetDependentNodes(CUgraphNode hNode, CUgraphNode * dependentNodes, size_t * numDependentNodes)} */
    @NativeType("CUresult")
    public static int cuGraphNodeGetDependentNodes(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNode *") @Nullable PointerBuffer dependentNodes, @NativeType("size_t *") PointerBuffer numDependentNodes) {
        if (CHECKS) {
            check(numDependentNodes, 1);
            checkSafe(dependentNodes, numDependentNodes.get(numDependentNodes.position()));
        }
        return ncuGraphNodeGetDependentNodes(hNode, memAddressSafe(dependentNodes), memAddress(numDependentNodes));
    }

    // --- [ cuGraphNodeGetDependentNodes_v2 ] ---

    /** {@code CUresult cuGraphNodeGetDependentNodes_v2(CUgraphNode hNode, CUgraphNode * dependentNodes, CUgraphEdgeData * edgeData, size_t * numDependentNodes)} */
    public static int ncuGraphNodeGetDependentNodes_v2(long hNode, long dependentNodes, long edgeData, long numDependentNodes) {
        long __functionAddress = Functions.GraphNodeGetDependentNodes_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPPPI(hNode, dependentNodes, edgeData, numDependentNodes, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeGetDependentNodes_v2(CUgraphNode hNode, CUgraphNode * dependentNodes, CUgraphEdgeData * edgeData, size_t * numDependentNodes)} */
    @NativeType("CUresult")
    public static int cuGraphNodeGetDependentNodes_v2(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNode *") @Nullable PointerBuffer dependentNodes, @NativeType("CUgraphEdgeData *") CUgraphEdgeData.@Nullable Buffer edgeData, @NativeType("size_t *") PointerBuffer numDependentNodes) {
        if (CHECKS) {
            check(numDependentNodes, 1);
            checkSafe(dependentNodes, numDependentNodes.get(numDependentNodes.position()));
            checkSafe(edgeData, numDependentNodes.get(numDependentNodes.position()));
        }
        return ncuGraphNodeGetDependentNodes_v2(hNode, memAddressSafe(dependentNodes), memAddressSafe(edgeData), memAddress(numDependentNodes));
    }

    // --- [ cuGraphAddDependencies ] ---

    /** {@code CUresult cuGraphAddDependencies(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, size_t numDependencies)} */
    public static int ncuGraphAddDependencies(long hGraph, long from, long to, long numDependencies) {
        long __functionAddress = Functions.GraphAddDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphAddDependencies(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, size_t numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphAddDependencies(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer from, @NativeType("CUgraphNode const *") @Nullable PointerBuffer to) {
        if (CHECKS) {
            checkSafe(to, remainingSafe(from));
        }
        return ncuGraphAddDependencies(hGraph, memAddressSafe(from), memAddressSafe(to), remainingSafe(from));
    }

    // --- [ cuGraphAddDependencies_v2 ] ---

    /** {@code CUresult cuGraphAddDependencies_v2(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, CUgraphEdgeData const * edgeData, size_t numDependencies)} */
    public static int ncuGraphAddDependencies_v2(long hGraph, long from, long to, long edgeData, long numDependencies) {
        long __functionAddress = Functions.GraphAddDependencies_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(hGraph, from, to, edgeData, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphAddDependencies_v2(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, CUgraphEdgeData const * edgeData, size_t numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphAddDependencies_v2(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer from, @NativeType("CUgraphNode const *") @Nullable PointerBuffer to, @NativeType("CUgraphEdgeData const *") CUgraphEdgeData.@Nullable Buffer edgeData) {
        if (CHECKS) {
            checkSafe(to, remainingSafe(from));
            checkSafe(edgeData, remainingSafe(from));
        }
        return ncuGraphAddDependencies_v2(hGraph, memAddressSafe(from), memAddressSafe(to), memAddressSafe(edgeData), remainingSafe(from));
    }

    // --- [ cuGraphRemoveDependencies ] ---

    /** {@code CUresult cuGraphRemoveDependencies(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, size_t numDependencies)} */
    public static int ncuGraphRemoveDependencies(long hGraph, long from, long to, long numDependencies) {
        long __functionAddress = Functions.GraphRemoveDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphRemoveDependencies(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, size_t numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphRemoveDependencies(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer from, @NativeType("CUgraphNode const *") @Nullable PointerBuffer to) {
        if (CHECKS) {
            checkSafe(to, remainingSafe(from));
        }
        return ncuGraphRemoveDependencies(hGraph, memAddressSafe(from), memAddressSafe(to), remainingSafe(from));
    }

    // --- [ cuGraphRemoveDependencies_v2 ] ---

    /** {@code CUresult cuGraphRemoveDependencies_v2(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, CUgraphEdgeData const * edgeData, size_t numDependencies)} */
    public static int ncuGraphRemoveDependencies_v2(long hGraph, long from, long to, long edgeData, long numDependencies) {
        long __functionAddress = Functions.GraphRemoveDependencies_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(hGraph, from, to, edgeData, numDependencies, __functionAddress);
    }

    /** {@code CUresult cuGraphRemoveDependencies_v2(CUgraph hGraph, CUgraphNode const * from, CUgraphNode const * to, CUgraphEdgeData const * edgeData, size_t numDependencies)} */
    @NativeType("CUresult")
    public static int cuGraphRemoveDependencies_v2(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer from, @NativeType("CUgraphNode const *") @Nullable PointerBuffer to, @NativeType("CUgraphEdgeData const *") CUgraphEdgeData.@Nullable Buffer edgeData) {
        if (CHECKS) {
            checkSafe(to, remainingSafe(from));
            checkSafe(edgeData, remainingSafe(from));
        }
        return ncuGraphRemoveDependencies_v2(hGraph, memAddressSafe(from), memAddressSafe(to), memAddressSafe(edgeData), remainingSafe(from));
    }

    // --- [ cuGraphDestroyNode ] ---

    /** {@code CUresult cuGraphDestroyNode(CUgraphNode hNode)} */
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

    /** {@code CUresult cuGraphInstantiate(CUgraphExec * phGraphExec, CUgraph hGraph, CUgraphNode * phErrorNode, char * logBuffer, size_t bufferSize)} */
    public static int ncuGraphInstantiate(long phGraphExec, long hGraph, long phErrorNode, long logBuffer, long bufferSize) {
        long __functionAddress = Functions.GraphInstantiate;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphExec, hGraph, phErrorNode, logBuffer, bufferSize, __functionAddress);
    }

    /** {@code CUresult cuGraphInstantiate(CUgraphExec * phGraphExec, CUgraph hGraph, CUgraphNode * phErrorNode, char * logBuffer, size_t bufferSize)} */
    @NativeType("CUresult")
    public static int cuGraphInstantiate(@NativeType("CUgraphExec *") PointerBuffer phGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") PointerBuffer phErrorNode, @NativeType("char *") ByteBuffer logBuffer) {
        if (CHECKS) {
            check(phGraphExec, 1);
            check(phErrorNode, 1);
        }
        return ncuGraphInstantiate(memAddress(phGraphExec), hGraph, memAddress(phErrorNode), memAddress(logBuffer), logBuffer.remaining());
    }

    // --- [ cuGraphInstantiateWithFlags ] ---

    /** {@code CUresult cuGraphInstantiateWithFlags(CUgraphExec * phGraphExec, CUgraph hGraph, unsigned long long flags)} */
    public static int ncuGraphInstantiateWithFlags(long phGraphExec, long hGraph, long flags) {
        long __functionAddress = Functions.GraphInstantiateWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPJI(phGraphExec, hGraph, flags, __functionAddress);
    }

    /** {@code CUresult cuGraphInstantiateWithFlags(CUgraphExec * phGraphExec, CUgraph hGraph, unsigned long long flags)} */
    @NativeType("CUresult")
    public static int cuGraphInstantiateWithFlags(@NativeType("CUgraphExec *") PointerBuffer phGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("unsigned long long") long flags) {
        if (CHECKS) {
            check(phGraphExec, 1);
        }
        return ncuGraphInstantiateWithFlags(memAddress(phGraphExec), hGraph, flags);
    }

    // --- [ cuGraphInstantiateWithParams ] ---

    /** {@code CUresult cuGraphInstantiateWithParams(CUgraphExec * phGraphExec, CUgraph hGraph, CUDA_GRAPH_INSTANTIATE_PARAMS const * instantiateParams)} */
    public static int ncuGraphInstantiateWithParams(long phGraphExec, long hGraph, long instantiateParams) {
        long __functionAddress = Functions.GraphInstantiateWithParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPI(phGraphExec, hGraph, instantiateParams, __functionAddress);
    }

    /** {@code CUresult cuGraphInstantiateWithParams(CUgraphExec * phGraphExec, CUgraph hGraph, CUDA_GRAPH_INSTANTIATE_PARAMS const * instantiateParams)} */
    @NativeType("CUresult")
    public static int cuGraphInstantiateWithParams(@NativeType("CUgraphExec *") PointerBuffer phGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUDA_GRAPH_INSTANTIATE_PARAMS const *") CUDA_GRAPH_INSTANTIATE_PARAMS instantiateParams) {
        if (CHECKS) {
            check(phGraphExec, 1);
        }
        return ncuGraphInstantiateWithParams(memAddress(phGraphExec), hGraph, instantiateParams.address());
    }

    // --- [ cuGraphExecGetFlags ] ---

    /** {@code CUresult cuGraphExecGetFlags(CUgraphExec hGraphExec, unsigned long long * flags)} */
    public static int ncuGraphExecGetFlags(long hGraphExec, long flags) {
        long __functionAddress = Functions.GraphExecGetFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
        }
        return callPPI(hGraphExec, flags, __functionAddress);
    }

    /** {@code CUresult cuGraphExecGetFlags(CUgraphExec hGraphExec, unsigned long long * flags)} */
    @NativeType("CUresult")
    public static int cuGraphExecGetFlags(@NativeType("CUgraphExec") long hGraphExec, @NativeType("unsigned long long *") LongBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuGraphExecGetFlags(hGraphExec, memAddress(flags));
    }

    // --- [ cuGraphExecKernelNodeSetParams ] ---

    /** {@code CUresult cuGraphExecKernelNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS const * nodeParams)} */
    public static int ncuGraphExecKernelNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecKernelNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphExecKernelNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecKernelNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphExecKernelNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecKernelNodeSetParams_v2 ] ---

    /** {@code CUresult cuGraphExecKernelNodeSetParams_v2(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS_v2 const * nodeParams)} */
    public static int ncuGraphExecKernelNodeSetParams_v2(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecKernelNodeSetParams_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphExecKernelNodeSetParams_v2(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_KERNEL_NODE_PARAMS_v2 const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecKernelNodeSetParams_v2(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS_v2 const *") CUDA_KERNEL_NODE_PARAMS_v2 nodeParams) {
        return ncuGraphExecKernelNodeSetParams_v2(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecMemcpyNodeSetParams ] ---

    /** {@code CUresult cuGraphExecMemcpyNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_MEMCPY3D const * copyParams, CUcontext ctx)} */
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

    /** {@code CUresult cuGraphExecMemcpyNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_MEMCPY3D const * copyParams, CUcontext ctx)} */
    @NativeType("CUresult")
    public static int cuGraphExecMemcpyNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D copyParams, @NativeType("CUcontext") long ctx) {
        return ncuGraphExecMemcpyNodeSetParams(hGraphExec, hNode, copyParams.address(), ctx);
    }

    // --- [ cuGraphExecMemsetNodeSetParams ] ---

    /** {@code CUresult cuGraphExecMemsetNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_MEMSET_NODE_PARAMS const * memsetParams, CUcontext ctx)} */
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

    /** {@code CUresult cuGraphExecMemsetNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_MEMSET_NODE_PARAMS const * memsetParams, CUcontext ctx)} */
    @NativeType("CUresult")
    public static int cuGraphExecMemsetNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS memsetParams, @NativeType("CUcontext") long ctx) {
        return ncuGraphExecMemsetNodeSetParams(hGraphExec, hNode, memsetParams.address(), ctx);
    }

    // --- [ cuGraphExecHostNodeSetParams ] ---

    /** {@code CUresult cuGraphExecHostNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_HOST_NODE_PARAMS const * nodeParams)} */
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

    /** {@code CUresult cuGraphExecHostNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_HOST_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecHostNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphExecHostNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecChildGraphNodeSetParams ] ---

    /** {@code CUresult cuGraphExecChildGraphNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUgraph childGraph)} */
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

    /** {@code CUresult cuGraphExecEventRecordNodeSetEvent(CUgraphExec hGraphExec, CUgraphNode hNode, CUevent event)} */
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

    /** {@code CUresult cuGraphExecEventWaitNodeSetEvent(CUgraphExec hGraphExec, CUgraphNode hNode, CUevent event)} */
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

    /** {@code CUresult cuGraphExecExternalSemaphoresSignalNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const * nodeParams)} */
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

    /** {@code CUresult cuGraphExecExternalSemaphoresSignalNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecExternalSemaphoresSignalNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_SIGNAL_NODE_PARAMS const *") CUDA_EXT_SEM_SIGNAL_NODE_PARAMS nodeParams) {
        return ncuGraphExecExternalSemaphoresSignalNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphExecExternalSemaphoresWaitNodeSetParams ] ---

    /** {@code CUresult cuGraphExecExternalSemaphoresWaitNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_EXT_SEM_WAIT_NODE_PARAMS const * nodeParams)} */
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

    /** {@code CUresult cuGraphExecExternalSemaphoresWaitNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUDA_EXT_SEM_WAIT_NODE_PARAMS const * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecExternalSemaphoresWaitNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUDA_EXT_SEM_WAIT_NODE_PARAMS const *") CUDA_EXT_SEM_WAIT_NODE_PARAMS nodeParams) {
        return ncuGraphExecExternalSemaphoresWaitNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphNodeSetEnabled ] ---

    /** {@code CUresult cuGraphNodeSetEnabled(CUgraphExec hGraphExec, CUgraphNode hNode, unsigned int isEnabled)} */
    @NativeType("CUresult")
    public static int cuGraphNodeSetEnabled(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("unsigned int") boolean isEnabled) {
        long __functionAddress = Functions.GraphNodeSetEnabled;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
        }
        return callPPI(hGraphExec, hNode, isEnabled ? 1 : 0, __functionAddress);
    }

    // --- [ cuGraphNodeGetEnabled ] ---

    /** {@code CUresult cuGraphNodeGetEnabled(CUgraphExec hGraphExec, CUgraphNode hNode, unsigned int * isEnabled)} */
    public static int ncuGraphNodeGetEnabled(long hGraphExec, long hNode, long isEnabled) {
        long __functionAddress = Functions.GraphNodeGetEnabled;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
        }
        return callPPPI(hGraphExec, hNode, isEnabled, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeGetEnabled(CUgraphExec hGraphExec, CUgraphNode hNode, unsigned int * isEnabled)} */
    @NativeType("CUresult")
    public static int cuGraphNodeGetEnabled(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("unsigned int *") IntBuffer isEnabled) {
        if (CHECKS) {
            check(isEnabled, 1);
        }
        return ncuGraphNodeGetEnabled(hGraphExec, hNode, memAddress(isEnabled));
    }

    // --- [ cuGraphUpload ] ---

    /** {@code CUresult cuGraphUpload(CUgraphExec hGraphExec, CUstream hStream)} */
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

    /** {@code CUresult cuGraphLaunch(CUgraphExec hGraphExec, CUstream hStream)} */
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

    /** {@code CUresult cuGraphExecDestroy(CUgraphExec hGraphExec)} */
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

    /** {@code CUresult cuGraphDestroy(CUgraph hGraph)} */
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

    /** {@code CUresult cuGraphExecUpdate(CUgraphExec hGraphExec, CUgraph hGraph, CUgraphNode * hErrorNode_out, CUgraphExecUpdateResult * updateResult_out)} */
    public static int ncuGraphExecUpdate(long hGraphExec, long hGraph, long hErrorNode_out, long updateResult_out) {
        long __functionAddress = Functions.GraphExecUpdate;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hGraph);
        }
        return callPPPPI(hGraphExec, hGraph, hErrorNode_out, updateResult_out, __functionAddress);
    }

    /** {@code CUresult cuGraphExecUpdate(CUgraphExec hGraphExec, CUgraph hGraph, CUgraphNode * hErrorNode_out, CUgraphExecUpdateResult * updateResult_out)} */
    @NativeType("CUresult")
    public static int cuGraphExecUpdate(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") PointerBuffer hErrorNode_out, @NativeType("CUgraphExecUpdateResult *") IntBuffer updateResult_out) {
        if (CHECKS) {
            check(hErrorNode_out, 1);
            check(updateResult_out, 1);
        }
        return ncuGraphExecUpdate(hGraphExec, hGraph, memAddress(hErrorNode_out), memAddress(updateResult_out));
    }

    // --- [ cuGraphExecUpdate_v2 ] ---

    /** {@code CUresult cuGraphExecUpdate_v2(CUgraphExec hGraphExec, CUgraph hGraph, CUgraphExecUpdateResultInfo * resultInfo)} */
    public static int ncuGraphExecUpdate_v2(long hGraphExec, long hGraph, long resultInfo) {
        long __functionAddress = Functions.GraphExecUpdate_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hGraph);
        }
        return callPPPI(hGraphExec, hGraph, resultInfo, __functionAddress);
    }

    /** {@code CUresult cuGraphExecUpdate_v2(CUgraphExec hGraphExec, CUgraph hGraph, CUgraphExecUpdateResultInfo * resultInfo)} */
    @NativeType("CUresult")
    public static int cuGraphExecUpdate_v2(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphExecUpdateResultInfo *") CUgraphExecUpdateResultInfo resultInfo) {
        return ncuGraphExecUpdate_v2(hGraphExec, hGraph, resultInfo.address());
    }

    // --- [ cuGraphKernelNodeCopyAttributes ] ---

    /** {@code CUresult cuGraphKernelNodeCopyAttributes(CUgraphNode dst, CUgraphNode src)} */
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

    /** {@code CUresult cuGraphKernelNodeGetAttribute(CUgraphNode hNode, CUkernelNodeAttrID attr, CUkernelNodeAttrValue * value_out)} */
    public static int ncuGraphKernelNodeGetAttribute(long hNode, int attr, long value_out) {
        long __functionAddress = Functions.GraphKernelNodeGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, attr, value_out, __functionAddress);
    }

    /** {@code CUresult cuGraphKernelNodeGetAttribute(CUgraphNode hNode, CUkernelNodeAttrID attr, CUkernelNodeAttrValue * value_out)} */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeGetAttribute(@NativeType("CUgraphNode") long hNode, @NativeType("CUkernelNodeAttrID") int attr, @NativeType("CUkernelNodeAttrValue *") CUkernelNodeAttrValue value_out) {
        return ncuGraphKernelNodeGetAttribute(hNode, attr, value_out.address());
    }

    // --- [ cuGraphKernelNodeSetAttribute ] ---

    /** {@code CUresult cuGraphKernelNodeSetAttribute(CUgraphNode hNode, CUkernelNodeAttrID attr, CUkernelNodeAttrValue const * value)} */
    public static int ncuGraphKernelNodeSetAttribute(long hNode, int attr, long value) {
        long __functionAddress = Functions.GraphKernelNodeSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, attr, value, __functionAddress);
    }

    /** {@code CUresult cuGraphKernelNodeSetAttribute(CUgraphNode hNode, CUkernelNodeAttrID attr, CUkernelNodeAttrValue const * value)} */
    @NativeType("CUresult")
    public static int cuGraphKernelNodeSetAttribute(@NativeType("CUgraphNode") long hNode, @NativeType("CUkernelNodeAttrID") int attr, @NativeType("CUkernelNodeAttrValue const *") CUkernelNodeAttrValue value) {
        return ncuGraphKernelNodeSetAttribute(hNode, attr, value.address());
    }

    // --- [ cuGraphDebugDotPrint ] ---

    /** {@code CUresult cuGraphDebugDotPrint(CUgraph hGraph, char const * path, unsigned int flags)} */
    public static int ncuGraphDebugDotPrint(long hGraph, long path, int flags) {
        long __functionAddress = Functions.GraphDebugDotPrint;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPI(hGraph, path, flags, __functionAddress);
    }

    /** {@code CUresult cuGraphDebugDotPrint(CUgraph hGraph, char const * path, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuGraphDebugDotPrint(@NativeType("CUgraph") long hGraph, @NativeType("char const *") ByteBuffer path, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            checkNT1(path);
        }
        return ncuGraphDebugDotPrint(hGraph, memAddress(path), flags);
    }

    /** {@code CUresult cuGraphDebugDotPrint(CUgraph hGraph, char const * path, unsigned int flags)} */
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

    /** {@code CUresult cuUserObjectCreate(CUuserObject * object_out, void * ptr, void (*) (void *) destroy, unsigned int initialRefcount, unsigned int flags)} */
    public static int ncuUserObjectCreate(long object_out, long ptr, long destroy, int initialRefcount, int flags) {
        long __functionAddress = Functions.UserObjectCreate;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
        }
        return callPPPI(object_out, ptr, destroy, initialRefcount, flags, __functionAddress);
    }

    /** {@code CUresult cuUserObjectCreate(CUuserObject * object_out, void * ptr, void (*) (void *) destroy, unsigned int initialRefcount, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuUserObjectCreate(@NativeType("CUuserObject *") PointerBuffer object_out, @NativeType("void *") long ptr, @NativeType("void (*) (void *)") CUhostFnI destroy, @NativeType("unsigned int") int initialRefcount, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(object_out, 1);
        }
        return ncuUserObjectCreate(memAddress(object_out), ptr, destroy.address(), initialRefcount, flags);
    }

    // --- [ cuUserObjectRetain ] ---

    /** {@code CUresult cuUserObjectRetain(CUuserObject object, unsigned int count)} */
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

    /** {@code CUresult cuUserObjectRelease(CUuserObject object, unsigned int count)} */
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

    /** {@code CUresult cuGraphRetainUserObject(CUgraph graph, CUuserObject object, unsigned int count, unsigned int flags)} */
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

    /** {@code CUresult cuGraphReleaseUserObject(CUgraph graph, CUuserObject object, unsigned int count)} */
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

    // --- [ cuGraphAddNode ] ---

    /** {@code CUresult cuGraphAddNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUgraphNodeParams * nodeParams)} */
    public static int ncuGraphAddNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddNode;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddNode(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, size_t numDependencies, CUgraphNodeParams * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUgraphNodeParams *") CUgraphNodeParams nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphAddNode_v2 ] ---

    /** {@code CUresult cuGraphAddNode_v2(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, CUgraphEdgeData const * dependencyData, size_t numDependencies, CUgraphNodeParams * nodeParams)} */
    public static int ncuGraphAddNode_v2(long phGraphNode, long hGraph, long dependencies, long dependencyData, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddNode_v2;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
        }
        return callPPPPPPI(phGraphNode, hGraph, dependencies, dependencyData, numDependencies, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphAddNode_v2(CUgraphNode * phGraphNode, CUgraph hGraph, CUgraphNode const * dependencies, CUgraphEdgeData const * dependencyData, size_t numDependencies, CUgraphNodeParams * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphAddNode_v2(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") @Nullable PointerBuffer dependencies, @NativeType("CUgraphEdgeData const *") CUgraphEdgeData.@Nullable Buffer dependencyData, @NativeType("CUgraphNodeParams *") CUgraphNodeParams nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
            checkSafe(dependencyData, remainingSafe(dependencies));
        }
        return ncuGraphAddNode_v2(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), memAddressSafe(dependencyData), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphNodeSetParams ] ---

    /** {@code CUresult cuGraphNodeSetParams(CUgraphNode hNode, CUgraphNodeParams * nodeParams)} */
    public static int ncuGraphNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphNodeSetParams(CUgraphNode hNode, CUgraphNodeParams * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNodeParams *") CUgraphNodeParams nodeParams) {
        return ncuGraphNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphExecNodeSetParams ] ---

    /** {@code CUresult cuGraphExecNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUgraphNodeParams * nodeParams)} */
    public static int ncuGraphExecNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecNodeSetParams;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraphExec);
            check(hNode);
        }
        return callPPPI(hGraphExec, hNode, nodeParams, __functionAddress);
    }

    /** {@code CUresult cuGraphExecNodeSetParams(CUgraphExec hGraphExec, CUgraphNode hNode, CUgraphNodeParams * nodeParams)} */
    @NativeType("CUresult")
    public static int cuGraphExecNodeSetParams(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNodeParams *") CUgraphNodeParams nodeParams) {
        return ncuGraphExecNodeSetParams(hGraphExec, hNode, nodeParams.address());
    }

    // --- [ cuGraphConditionalHandleCreate ] ---

    /** {@code CUresult cuGraphConditionalHandleCreate(CUgraphConditionalHandle * pHandle_out, CUgraph hGraph, CUcontext ctx, unsigned int defaultLaunchValue, unsigned int flags)} */
    public static int ncuGraphConditionalHandleCreate(long pHandle_out, long hGraph, long ctx, int defaultLaunchValue, int flags) {
        long __functionAddress = Functions.GraphConditionalHandleCreate;
        if (CHECKS) {
            check(__functionAddress);
            check(hGraph);
            check(ctx);
        }
        return callPPPI(pHandle_out, hGraph, ctx, defaultLaunchValue, flags, __functionAddress);
    }

    /** {@code CUresult cuGraphConditionalHandleCreate(CUgraphConditionalHandle * pHandle_out, CUgraph hGraph, CUcontext ctx, unsigned int defaultLaunchValue, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuGraphConditionalHandleCreate(@NativeType("CUgraphConditionalHandle *") LongBuffer pHandle_out, @NativeType("CUgraph") long hGraph, @NativeType("CUcontext") long ctx, @NativeType("unsigned int") int defaultLaunchValue, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(pHandle_out, 1);
        }
        return ncuGraphConditionalHandleCreate(memAddress(pHandle_out), hGraph, ctx, defaultLaunchValue, flags);
    }

    // --- [ cuOccupancyMaxActiveBlocksPerMultiprocessor ] ---

    /** {@code CUresult cuOccupancyMaxActiveBlocksPerMultiprocessor(int * numBlocks, CUfunction func, int blockSize, size_t dynamicSMemSize)} */
    public static int ncuOccupancyMaxActiveBlocksPerMultiprocessor(long numBlocks, long func, int blockSize, long dynamicSMemSize) {
        long __functionAddress = Functions.OccupancyMaxActiveBlocksPerMultiprocessor;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPI(numBlocks, func, blockSize, dynamicSMemSize, __functionAddress);
    }

    /** {@code CUresult cuOccupancyMaxActiveBlocksPerMultiprocessor(int * numBlocks, CUfunction func, int blockSize, size_t dynamicSMemSize)} */
    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveBlocksPerMultiprocessor(@NativeType("int *") IntBuffer numBlocks, @NativeType("CUfunction") long func, int blockSize, @NativeType("size_t") long dynamicSMemSize) {
        if (CHECKS) {
            check(numBlocks, 1);
        }
        return ncuOccupancyMaxActiveBlocksPerMultiprocessor(memAddress(numBlocks), func, blockSize, dynamicSMemSize);
    }

    // --- [ cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags ] ---

    /** {@code CUresult cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(int * numBlocks, CUfunction func, int blockSize, size_t dynamicSMemSize, unsigned int flags)} */
    public static int ncuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(long numBlocks, long func, int blockSize, long dynamicSMemSize, int flags) {
        long __functionAddress = Functions.OccupancyMaxActiveBlocksPerMultiprocessorWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPI(numBlocks, func, blockSize, dynamicSMemSize, flags, __functionAddress);
    }

    /** {@code CUresult cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(int * numBlocks, CUfunction func, int blockSize, size_t dynamicSMemSize, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(@NativeType("int *") IntBuffer numBlocks, @NativeType("CUfunction") long func, int blockSize, @NativeType("size_t") long dynamicSMemSize, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(numBlocks, 1);
        }
        return ncuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(memAddress(numBlocks), func, blockSize, dynamicSMemSize, flags);
    }

    // --- [ cuOccupancyMaxPotentialBlockSize ] ---

    /** {@code CUresult cuOccupancyMaxPotentialBlockSize(int * minGridSize, int * blockSize, CUfunction func, size_t (*) (int) blockSizeToDynamicSMemSize, size_t dynamicSMemSize, int blockSizeLimit)} */
    public static int ncuOccupancyMaxPotentialBlockSize(long minGridSize, long blockSize, long func, long blockSizeToDynamicSMemSize, long dynamicSMemSize, int blockSizeLimit) {
        long __functionAddress = Functions.OccupancyMaxPotentialBlockSize;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPPPI(minGridSize, blockSize, func, blockSizeToDynamicSMemSize, dynamicSMemSize, blockSizeLimit, __functionAddress);
    }

    /** {@code CUresult cuOccupancyMaxPotentialBlockSize(int * minGridSize, int * blockSize, CUfunction func, size_t (*) (int) blockSizeToDynamicSMemSize, size_t dynamicSMemSize, int blockSizeLimit)} */
    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialBlockSize(@NativeType("int *") IntBuffer minGridSize, @NativeType("int *") IntBuffer blockSize, @NativeType("CUfunction") long func, @NativeType("size_t (*) (int)") @Nullable CUoccupancyB2DSizeI blockSizeToDynamicSMemSize, @NativeType("size_t") long dynamicSMemSize, int blockSizeLimit) {
        if (CHECKS) {
            check(minGridSize, 1);
            check(blockSize, 1);
        }
        return ncuOccupancyMaxPotentialBlockSize(memAddress(minGridSize), memAddress(blockSize), func, memAddressSafe(blockSizeToDynamicSMemSize), dynamicSMemSize, blockSizeLimit);
    }

    // --- [ cuOccupancyMaxPotentialBlockSizeWithFlags ] ---

    /** {@code CUresult cuOccupancyMaxPotentialBlockSizeWithFlags(int * minGridSize, int * blockSize, CUfunction func, size_t (*) (int) blockSizeToDynamicSMemSize, size_t dynamicSMemSize, int blockSizeLimit, unsigned int flags)} */
    public static int ncuOccupancyMaxPotentialBlockSizeWithFlags(long minGridSize, long blockSize, long func, long blockSizeToDynamicSMemSize, long dynamicSMemSize, int blockSizeLimit, int flags) {
        long __functionAddress = Functions.OccupancyMaxPotentialBlockSizeWithFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPPPI(minGridSize, blockSize, func, blockSizeToDynamicSMemSize, dynamicSMemSize, blockSizeLimit, flags, __functionAddress);
    }

    /** {@code CUresult cuOccupancyMaxPotentialBlockSizeWithFlags(int * minGridSize, int * blockSize, CUfunction func, size_t (*) (int) blockSizeToDynamicSMemSize, size_t dynamicSMemSize, int blockSizeLimit, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialBlockSizeWithFlags(@NativeType("int *") IntBuffer minGridSize, @NativeType("int *") IntBuffer blockSize, @NativeType("CUfunction") long func, @NativeType("size_t (*) (int)") @Nullable CUoccupancyB2DSizeI blockSizeToDynamicSMemSize, @NativeType("size_t") long dynamicSMemSize, int blockSizeLimit, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(minGridSize, 1);
            check(blockSize, 1);
        }
        return ncuOccupancyMaxPotentialBlockSizeWithFlags(memAddress(minGridSize), memAddress(blockSize), func, memAddressSafe(blockSizeToDynamicSMemSize), dynamicSMemSize, blockSizeLimit, flags);
    }

    // --- [ cuOccupancyAvailableDynamicSMemPerBlock ] ---

    /** {@code CUresult cuOccupancyAvailableDynamicSMemPerBlock(size_t * dynamicSmemSize, CUfunction func, int numBlocks, int blockSize)} */
    public static int ncuOccupancyAvailableDynamicSMemPerBlock(long dynamicSmemSize, long func, int numBlocks, int blockSize) {
        long __functionAddress = Functions.OccupancyAvailableDynamicSMemPerBlock;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPI(dynamicSmemSize, func, numBlocks, blockSize, __functionAddress);
    }

    /** {@code CUresult cuOccupancyAvailableDynamicSMemPerBlock(size_t * dynamicSmemSize, CUfunction func, int numBlocks, int blockSize)} */
    @NativeType("CUresult")
    public static int cuOccupancyAvailableDynamicSMemPerBlock(@NativeType("size_t *") PointerBuffer dynamicSmemSize, @NativeType("CUfunction") long func, int numBlocks, int blockSize) {
        if (CHECKS) {
            check(dynamicSmemSize, 1);
        }
        return ncuOccupancyAvailableDynamicSMemPerBlock(memAddress(dynamicSmemSize), func, numBlocks, blockSize);
    }

    // --- [ cuOccupancyMaxPotentialClusterSize ] ---

    /** {@code CUresult cuOccupancyMaxPotentialClusterSize(int * clusterSize, CUfunction func, CUlaunchConfig const * config)} */
    public static int ncuOccupancyMaxPotentialClusterSize(long clusterSize, long func, long config) {
        long __functionAddress = Functions.OccupancyMaxPotentialClusterSize;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPI(clusterSize, func, config, __functionAddress);
    }

    /** {@code CUresult cuOccupancyMaxPotentialClusterSize(int * clusterSize, CUfunction func, CUlaunchConfig const * config)} */
    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialClusterSize(@NativeType("int *") IntBuffer clusterSize, @NativeType("CUfunction") long func, @NativeType("CUlaunchConfig const *") CUlaunchConfig config) {
        if (CHECKS) {
            check(clusterSize, 1);
        }
        return ncuOccupancyMaxPotentialClusterSize(memAddress(clusterSize), func, config.address());
    }

    // --- [ cuOccupancyMaxActiveClusters ] ---

    /** {@code CUresult cuOccupancyMaxActiveClusters(int * numClusters, CUfunction func, CUlaunchConfig const * config)} */
    public static int ncuOccupancyMaxActiveClusters(long numClusters, long func, long config) {
        long __functionAddress = Functions.OccupancyMaxActiveClusters;
        if (CHECKS) {
            check(__functionAddress);
            check(func);
        }
        return callPPPI(numClusters, func, config, __functionAddress);
    }

    /** {@code CUresult cuOccupancyMaxActiveClusters(int * numClusters, CUfunction func, CUlaunchConfig const * config)} */
    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveClusters(@NativeType("int *") IntBuffer numClusters, @NativeType("CUfunction") long func, @NativeType("CUlaunchConfig const *") CUlaunchConfig config) {
        if (CHECKS) {
            check(numClusters, 1);
        }
        return ncuOccupancyMaxActiveClusters(memAddress(numClusters), func, config.address());
    }

    // --- [ cuTexRefSetArray ] ---

    /** {@code CUresult cuTexRefSetArray(CUtexref hTexRef, CUarray hArray, unsigned int Flags)} */
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

    /** {@code CUresult cuTexRefSetMipmappedArray(CUtexref hTexRef, CUmipmappedArray hMipmappedArray, unsigned int Flags)} */
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

    /** {@code CUresult cuTexRefSetAddress(size_t * ByteOffset, CUtexref hTexRef, CUdeviceptr dptr, size_t bytes)} */
    public static int ncuTexRefSetAddress(long ByteOffset, long hTexRef, long dptr, long bytes) {
        long __functionAddress = Functions.TexRefSetAddress;
        if (CHECKS) {
            check(hTexRef);
            check(dptr);
        }
        return callPPPPI(ByteOffset, hTexRef, dptr, bytes, __functionAddress);
    }

    /** {@code CUresult cuTexRefSetAddress(size_t * ByteOffset, CUtexref hTexRef, CUdeviceptr dptr, size_t bytes)} */
    @NativeType("CUresult")
    public static int cuTexRefSetAddress(@NativeType("size_t *") PointerBuffer ByteOffset, @NativeType("CUtexref") long hTexRef, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long bytes) {
        if (CHECKS) {
            check(ByteOffset, 1);
        }
        return ncuTexRefSetAddress(memAddress(ByteOffset), hTexRef, dptr, bytes);
    }

    // --- [ cuTexRefSetAddress2D ] ---

    /** {@code CUresult cuTexRefSetAddress2D(CUtexref hTexRef, CUDA_ARRAY_DESCRIPTOR const * desc, CUdeviceptr dptr, size_t Pitch)} */
    public static int ncuTexRefSetAddress2D(long hTexRef, long desc, long dptr, long Pitch) {
        long __functionAddress = Functions.TexRefSetAddress2D;
        if (CHECKS) {
            check(hTexRef);
            check(dptr);
        }
        return callPPPPI(hTexRef, desc, dptr, Pitch, __functionAddress);
    }

    /** {@code CUresult cuTexRefSetAddress2D(CUtexref hTexRef, CUDA_ARRAY_DESCRIPTOR const * desc, CUdeviceptr dptr, size_t Pitch)} */
    @NativeType("CUresult")
    public static int cuTexRefSetAddress2D(@NativeType("CUtexref") long hTexRef, @NativeType("CUDA_ARRAY_DESCRIPTOR const *") CUDA_ARRAY_DESCRIPTOR desc, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long Pitch) {
        return ncuTexRefSetAddress2D(hTexRef, desc.address(), dptr, Pitch);
    }

    // --- [ cuTexRefSetFormat ] ---

    /** {@code CUresult cuTexRefSetFormat(CUtexref hTexRef, CUarray_format fmt, int NumPackedComponents)} */
    @NativeType("CUresult")
    public static int cuTexRefSetFormat(@NativeType("CUtexref") long hTexRef, @NativeType("CUarray_format") int fmt, int NumPackedComponents) {
        long __functionAddress = Functions.TexRefSetFormat;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fmt, NumPackedComponents, __functionAddress);
    }

    // --- [ cuTexRefSetAddressMode ] ---

    /** {@code CUresult cuTexRefSetAddressMode(CUtexref hTexRef, int dim, CUaddress_mode am)} */
    @NativeType("CUresult")
    public static int cuTexRefSetAddressMode(@NativeType("CUtexref") long hTexRef, int dim, @NativeType("CUaddress_mode") int am) {
        long __functionAddress = Functions.TexRefSetAddressMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, dim, am, __functionAddress);
    }

    // --- [ cuTexRefSetFilterMode ] ---

    /** {@code CUresult cuTexRefSetFilterMode(CUtexref hTexRef, CUfilter_mode fm)} */
    @NativeType("CUresult")
    public static int cuTexRefSetFilterMode(@NativeType("CUtexref") long hTexRef, @NativeType("CUfilter_mode") int fm) {
        long __functionAddress = Functions.TexRefSetFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fm, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapFilterMode ] ---

    /** {@code CUresult cuTexRefSetMipmapFilterMode(CUtexref hTexRef, CUfilter_mode fm)} */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmapFilterMode(@NativeType("CUtexref") long hTexRef, @NativeType("CUfilter_mode") int fm) {
        long __functionAddress = Functions.TexRefSetMipmapFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fm, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapLevelBias ] ---

    /** {@code CUresult cuTexRefSetMipmapLevelBias(CUtexref hTexRef, float bias)} */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmapLevelBias(@NativeType("CUtexref") long hTexRef, float bias) {
        long __functionAddress = Functions.TexRefSetMipmapLevelBias;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, bias, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapLevelClamp ] ---

    /** {@code CUresult cuTexRefSetMipmapLevelClamp(CUtexref hTexRef, float minMipmapLevelClamp, float maxMipmapLevelClamp)} */
    @NativeType("CUresult")
    public static int cuTexRefSetMipmapLevelClamp(@NativeType("CUtexref") long hTexRef, float minMipmapLevelClamp, float maxMipmapLevelClamp) {
        long __functionAddress = Functions.TexRefSetMipmapLevelClamp;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, minMipmapLevelClamp, maxMipmapLevelClamp, __functionAddress);
    }

    // --- [ cuTexRefSetMaxAnisotropy ] ---

    /** {@code CUresult cuTexRefSetMaxAnisotropy(CUtexref hTexRef, unsigned int maxAniso)} */
    @NativeType("CUresult")
    public static int cuTexRefSetMaxAnisotropy(@NativeType("CUtexref") long hTexRef, @NativeType("unsigned int") int maxAniso) {
        long __functionAddress = Functions.TexRefSetMaxAnisotropy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, maxAniso, __functionAddress);
    }

    // --- [ cuTexRefSetBorderColor ] ---

    /** {@code CUresult cuTexRefSetBorderColor(CUtexref hTexRef, float * pBorderColor)} */
    public static int ncuTexRefSetBorderColor(long hTexRef, long pBorderColor) {
        long __functionAddress = Functions.TexRefSetBorderColor;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(hTexRef, pBorderColor, __functionAddress);
    }

    /** {@code CUresult cuTexRefSetBorderColor(CUtexref hTexRef, float * pBorderColor)} */
    @NativeType("CUresult")
    public static int cuTexRefSetBorderColor(@NativeType("CUtexref") long hTexRef, @NativeType("float *") FloatBuffer pBorderColor) {
        if (CHECKS) {
            check(pBorderColor, 4);
        }
        return ncuTexRefSetBorderColor(hTexRef, memAddress(pBorderColor));
    }

    // --- [ cuTexRefSetFlags ] ---

    /** {@code CUresult cuTexRefSetFlags(CUtexref hTexRef, unsigned int Flags)} */
    @NativeType("CUresult")
    public static int cuTexRefSetFlags(@NativeType("CUtexref") long hTexRef, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetFlags;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, Flags, __functionAddress);
    }

    // --- [ cuTexRefGetAddress ] ---

    /** {@code CUresult cuTexRefGetAddress(CUdeviceptr * pdptr, CUtexref hTexRef)} */
    public static int ncuTexRefGetAddress(long pdptr, long hTexRef) {
        long __functionAddress = Functions.TexRefGetAddress;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pdptr, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetAddress(CUdeviceptr * pdptr, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetAddress(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuTexRefGetAddress(memAddress(pdptr), hTexRef);
    }

    // --- [ cuTexRefGetArray ] ---

    /** {@code CUresult cuTexRefGetArray(CUarray * phArray, CUtexref hTexRef)} */
    public static int ncuTexRefGetArray(long phArray, long hTexRef) {
        long __functionAddress = Functions.TexRefGetArray;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(phArray, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetArray(CUarray * phArray, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetArray(@NativeType("CUarray *") PointerBuffer phArray, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(phArray, 1);
        }
        return ncuTexRefGetArray(memAddress(phArray), hTexRef);
    }

    // --- [ cuTexRefGetMipmappedArray ] ---

    /** {@code CUresult cuTexRefGetMipmappedArray(CUmipmappedArray * phMipmappedArray, CUtexref hTexRef)} */
    public static int ncuTexRefGetMipmappedArray(long phMipmappedArray, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmappedArray;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(phMipmappedArray, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetMipmappedArray(CUmipmappedArray * phMipmappedArray, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer phMipmappedArray, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(phMipmappedArray, 1);
        }
        return ncuTexRefGetMipmappedArray(memAddress(phMipmappedArray), hTexRef);
    }

    // --- [ cuTexRefGetAddressMode ] ---

    /** {@code CUresult cuTexRefGetAddressMode(CUaddress_mode * pam, CUtexref hTexRef, int dim)} */
    public static int ncuTexRefGetAddressMode(long pam, long hTexRef, int dim) {
        long __functionAddress = Functions.TexRefGetAddressMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pam, hTexRef, dim, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetAddressMode(CUaddress_mode * pam, CUtexref hTexRef, int dim)} */
    @NativeType("CUresult")
    public static int cuTexRefGetAddressMode(@NativeType("CUaddress_mode *") IntBuffer pam, @NativeType("CUtexref") long hTexRef, int dim) {
        if (CHECKS) {
            check(pam, 1);
        }
        return ncuTexRefGetAddressMode(memAddress(pam), hTexRef, dim);
    }

    // --- [ cuTexRefGetFilterMode ] ---

    /** {@code CUresult cuTexRefGetFilterMode(CUfilter_mode * pfm, CUtexref hTexRef)} */
    public static int ncuTexRefGetFilterMode(long pfm, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pfm, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetFilterMode(CUfilter_mode * pfm, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetFilterMode(@NativeType("CUfilter_mode *") IntBuffer pfm, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pfm, 1);
        }
        return ncuTexRefGetFilterMode(memAddress(pfm), hTexRef);
    }

    // --- [ cuTexRefGetFormat ] ---

    /** {@code CUresult cuTexRefGetFormat(CUarray_format * pFormat, int * pNumChannels, CUtexref hTexRef)} */
    public static int ncuTexRefGetFormat(long pFormat, long pNumChannels, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFormat;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPPI(pFormat, pNumChannels, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetFormat(CUarray_format * pFormat, int * pNumChannels, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetFormat(@NativeType("CUarray_format *") IntBuffer pFormat, @NativeType("int *") @Nullable IntBuffer pNumChannels, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pFormat, 1);
            checkSafe(pNumChannels, 1);
        }
        return ncuTexRefGetFormat(memAddress(pFormat), memAddressSafe(pNumChannels), hTexRef);
    }

    // --- [ cuTexRefGetMipmapFilterMode ] ---

    /** {@code CUresult cuTexRefGetMipmapFilterMode(CUfilter_mode * pfm, CUtexref hTexRef)} */
    public static int ncuTexRefGetMipmapFilterMode(long pfm, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pfm, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetMipmapFilterMode(CUfilter_mode * pfm, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmapFilterMode(@NativeType("CUfilter_mode *") IntBuffer pfm, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pfm, 1);
        }
        return ncuTexRefGetMipmapFilterMode(memAddress(pfm), hTexRef);
    }

    // --- [ cuTexRefGetMipmapLevelBias ] ---

    /** {@code CUresult cuTexRefGetMipmapLevelBias(float * pbias, CUtexref hTexRef)} */
    public static int ncuTexRefGetMipmapLevelBias(long pbias, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapLevelBias;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pbias, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetMipmapLevelBias(float * pbias, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmapLevelBias(@NativeType("float *") FloatBuffer pbias, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pbias, 1);
        }
        return ncuTexRefGetMipmapLevelBias(memAddress(pbias), hTexRef);
    }

    // --- [ cuTexRefGetMipmapLevelClamp ] ---

    /** {@code CUresult cuTexRefGetMipmapLevelClamp(float * pminMipmapLevelClamp, float * pmaxMipmapLevelClamp, CUtexref hTexRef)} */
    public static int ncuTexRefGetMipmapLevelClamp(long pminMipmapLevelClamp, long pmaxMipmapLevelClamp, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapLevelClamp;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPPI(pminMipmapLevelClamp, pmaxMipmapLevelClamp, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetMipmapLevelClamp(float * pminMipmapLevelClamp, float * pmaxMipmapLevelClamp, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetMipmapLevelClamp(@NativeType("float *") FloatBuffer pminMipmapLevelClamp, @NativeType("float *") FloatBuffer pmaxMipmapLevelClamp, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pminMipmapLevelClamp, 1);
            check(pmaxMipmapLevelClamp, 1);
        }
        return ncuTexRefGetMipmapLevelClamp(memAddress(pminMipmapLevelClamp), memAddress(pmaxMipmapLevelClamp), hTexRef);
    }

    // --- [ cuTexRefGetMaxAnisotropy ] ---

    /** {@code CUresult cuTexRefGetMaxAnisotropy(int * pmaxAniso, CUtexref hTexRef)} */
    public static int ncuTexRefGetMaxAnisotropy(long pmaxAniso, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMaxAnisotropy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pmaxAniso, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetMaxAnisotropy(int * pmaxAniso, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetMaxAnisotropy(@NativeType("int *") IntBuffer pmaxAniso, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pmaxAniso, 1);
        }
        return ncuTexRefGetMaxAnisotropy(memAddress(pmaxAniso), hTexRef);
    }

    // --- [ cuTexRefGetBorderColor ] ---

    /** {@code CUresult cuTexRefGetBorderColor(float * pBorderColor, CUtexref hTexRef)} */
    public static int ncuTexRefGetBorderColor(long pBorderColor, long hTexRef) {
        long __functionAddress = Functions.TexRefGetBorderColor;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pBorderColor, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetBorderColor(float * pBorderColor, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetBorderColor(@NativeType("float *") FloatBuffer pBorderColor, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pBorderColor, 4);
        }
        return ncuTexRefGetBorderColor(memAddress(pBorderColor), hTexRef);
    }

    // --- [ cuTexRefGetFlags ] ---

    /** {@code CUresult cuTexRefGetFlags(unsigned int * pFlags, CUtexref hTexRef)} */
    public static int ncuTexRefGetFlags(long pFlags, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFlags;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pFlags, hTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefGetFlags(unsigned int * pFlags, CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefGetFlags(@NativeType("unsigned int *") IntBuffer pFlags, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return ncuTexRefGetFlags(memAddress(pFlags), hTexRef);
    }

    // --- [ cuTexRefCreate ] ---

    /** {@code CUresult cuTexRefCreate(CUtexref * pTexRef)} */
    public static int ncuTexRefCreate(long pTexRef) {
        long __functionAddress = Functions.TexRefCreate;
        return callPI(pTexRef, __functionAddress);
    }

    /** {@code CUresult cuTexRefCreate(CUtexref * pTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefCreate(@NativeType("CUtexref *") PointerBuffer pTexRef) {
        if (CHECKS) {
            check(pTexRef, 1);
        }
        return ncuTexRefCreate(memAddress(pTexRef));
    }

    // --- [ cuTexRefDestroy ] ---

    /** {@code CUresult cuTexRefDestroy(CUtexref hTexRef)} */
    @NativeType("CUresult")
    public static int cuTexRefDestroy(@NativeType("CUtexref") long hTexRef) {
        long __functionAddress = Functions.TexRefDestroy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, __functionAddress);
    }

    // --- [ cuSurfRefSetArray ] ---

    /** {@code CUresult cuSurfRefSetArray(CUsurfref hSurfRef, CUarray hArray, unsigned int Flags)} */
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

    /** {@code CUresult cuSurfRefGetArray(CUarray * phArray, CUsurfref hSurfRef)} */
    public static int ncuSurfRefGetArray(long phArray, long hSurfRef) {
        long __functionAddress = Functions.SurfRefGetArray;
        if (CHECKS) {
            check(hSurfRef);
        }
        return callPPI(phArray, hSurfRef, __functionAddress);
    }

    /** {@code CUresult cuSurfRefGetArray(CUarray * phArray, CUsurfref hSurfRef)} */
    @NativeType("CUresult")
    public static int cuSurfRefGetArray(@NativeType("CUarray *") PointerBuffer phArray, @NativeType("CUsurfref") long hSurfRef) {
        if (CHECKS) {
            check(phArray, 1);
        }
        return ncuSurfRefGetArray(memAddress(phArray), hSurfRef);
    }

    // --- [ cuTexObjectCreate ] ---

    /** {@code CUresult cuTexObjectCreate(CUtexObject * pTexObject, CUDA_RESOURCE_DESC const * pResDesc, CUDA_TEXTURE_DESC const * pTexDesc, CUDA_RESOURCE_VIEW_DESC const * pResViewDesc)} */
    public static int ncuTexObjectCreate(long pTexObject, long pResDesc, long pTexDesc, long pResViewDesc) {
        long __functionAddress = Functions.TexObjectCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(pTexObject, pResDesc, pTexDesc, pResViewDesc, __functionAddress);
    }

    /** {@code CUresult cuTexObjectCreate(CUtexObject * pTexObject, CUDA_RESOURCE_DESC const * pResDesc, CUDA_TEXTURE_DESC const * pTexDesc, CUDA_RESOURCE_VIEW_DESC const * pResViewDesc)} */
    @NativeType("CUresult")
    public static int cuTexObjectCreate(@NativeType("CUtexObject *") LongBuffer pTexObject, @NativeType("CUDA_RESOURCE_DESC const *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUDA_TEXTURE_DESC const *") CUDA_TEXTURE_DESC pTexDesc, @NativeType("CUDA_RESOURCE_VIEW_DESC const *") CUDA_RESOURCE_VIEW_DESC pResViewDesc) {
        if (CHECKS) {
            check(pTexObject, 1);
        }
        return ncuTexObjectCreate(memAddress(pTexObject), pResDesc.address(), pTexDesc.address(), pResViewDesc.address());
    }

    // --- [ cuTexObjectDestroy ] ---

    /** {@code CUresult cuTexObjectDestroy(CUtexObject texObject)} */
    @NativeType("CUresult")
    public static int cuTexObjectDestroy(@NativeType("CUtexObject") long texObject) {
        long __functionAddress = Functions.TexObjectDestroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(texObject, __functionAddress);
    }

    // --- [ cuTexObjectGetResourceDesc ] ---

    /** {@code CUresult cuTexObjectGetResourceDesc(CUDA_RESOURCE_DESC * pResDesc, CUtexObject texObject)} */
    public static int ncuTexObjectGetResourceDesc(long pResDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetResourceDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pResDesc, texObject, __functionAddress);
    }

    /** {@code CUresult cuTexObjectGetResourceDesc(CUDA_RESOURCE_DESC * pResDesc, CUtexObject texObject)} */
    @NativeType("CUresult")
    public static int cuTexObjectGetResourceDesc(@NativeType("CUDA_RESOURCE_DESC *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetResourceDesc(pResDesc.address(), texObject);
    }

    // --- [ cuTexObjectGetTextureDesc ] ---

    /** {@code CUresult cuTexObjectGetTextureDesc(CUDA_TEXTURE_DESC * pTexDesc, CUtexObject texObject)} */
    public static int ncuTexObjectGetTextureDesc(long pTexDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetTextureDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pTexDesc, texObject, __functionAddress);
    }

    /** {@code CUresult cuTexObjectGetTextureDesc(CUDA_TEXTURE_DESC * pTexDesc, CUtexObject texObject)} */
    @NativeType("CUresult")
    public static int cuTexObjectGetTextureDesc(@NativeType("CUDA_TEXTURE_DESC *") CUDA_TEXTURE_DESC pTexDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetTextureDesc(pTexDesc.address(), texObject);
    }

    // --- [ cuTexObjectGetResourceViewDesc ] ---

    /** {@code CUresult cuTexObjectGetResourceViewDesc(CUDA_RESOURCE_VIEW_DESC * pResViewDesc, CUtexObject texObject)} */
    public static int ncuTexObjectGetResourceViewDesc(long pResViewDesc, long texObject) {
        long __functionAddress = Functions.TexObjectGetResourceViewDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pResViewDesc, texObject, __functionAddress);
    }

    /** {@code CUresult cuTexObjectGetResourceViewDesc(CUDA_RESOURCE_VIEW_DESC * pResViewDesc, CUtexObject texObject)} */
    @NativeType("CUresult")
    public static int cuTexObjectGetResourceViewDesc(@NativeType("CUDA_RESOURCE_VIEW_DESC *") CUDA_RESOURCE_VIEW_DESC pResViewDesc, @NativeType("CUtexObject") long texObject) {
        return ncuTexObjectGetResourceViewDesc(pResViewDesc.address(), texObject);
    }

    // --- [ cuSurfObjectCreate ] ---

    /** {@code CUresult cuSurfObjectCreate(CUsurfObject * pSurfObject, CUDA_RESOURCE_DESC const * pResDesc)} */
    public static int ncuSurfObjectCreate(long pSurfObject, long pResDesc) {
        long __functionAddress = Functions.SurfObjectCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pSurfObject, pResDesc, __functionAddress);
    }

    /** {@code CUresult cuSurfObjectCreate(CUsurfObject * pSurfObject, CUDA_RESOURCE_DESC const * pResDesc)} */
    @NativeType("CUresult")
    public static int cuSurfObjectCreate(@NativeType("CUsurfObject *") LongBuffer pSurfObject, @NativeType("CUDA_RESOURCE_DESC const *") CUDA_RESOURCE_DESC pResDesc) {
        if (CHECKS) {
            check(pSurfObject, 1);
        }
        return ncuSurfObjectCreate(memAddress(pSurfObject), pResDesc.address());
    }

    // --- [ cuSurfObjectDestroy ] ---

    /** {@code CUresult cuSurfObjectDestroy(CUsurfObject surfObject)} */
    @NativeType("CUresult")
    public static int cuSurfObjectDestroy(@NativeType("CUsurfObject") long surfObject) {
        long __functionAddress = Functions.SurfObjectDestroy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(surfObject, __functionAddress);
    }

    // --- [ cuSurfObjectGetResourceDesc ] ---

    /** {@code CUresult cuSurfObjectGetResourceDesc(CUDA_RESOURCE_DESC * pResDesc, CUsurfObject surfObject)} */
    public static int ncuSurfObjectGetResourceDesc(long pResDesc, long surfObject) {
        long __functionAddress = Functions.SurfObjectGetResourceDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pResDesc, surfObject, __functionAddress);
    }

    /** {@code CUresult cuSurfObjectGetResourceDesc(CUDA_RESOURCE_DESC * pResDesc, CUsurfObject surfObject)} */
    @NativeType("CUresult")
    public static int cuSurfObjectGetResourceDesc(@NativeType("CUDA_RESOURCE_DESC *") CUDA_RESOURCE_DESC pResDesc, @NativeType("CUsurfObject") long surfObject) {
        return ncuSurfObjectGetResourceDesc(pResDesc.address(), surfObject);
    }

    // --- [ cuTensorMapEncodeTiled ] ---

    /** {@code CUresult cuTensorMapEncodeTiled(CUtensorMap * tensorMap, CUtensorMapDataType tensorDataType, unsigned int tensorRank, void * globalAddress, cuuint64_t const * globalDim, cuuint64_t const * globalStrides, cuuint64_t const * boxDim, cuuint64_t const * elementStrides, CUtensorMapInterleave interleave, CUtensorMapSwizzle swizzle, CUtensorMapL2promotion l2Promotion, CUtensorMapFloatOOBfill oobFill)} */
    public static int ncuTensorMapEncodeTiled(long tensorMap, int tensorDataType, int tensorRank, long globalAddress, long globalDim, long globalStrides, long boxDim, long elementStrides, int interleave, int swizzle, int l2Promotion, int oobFill) {
        long __functionAddress = Functions.TensorMapEncodeTiled;
        if (CHECKS) {
            check(__functionAddress);
            check(globalAddress);
        }
        return callPPPPPPI(tensorMap, tensorDataType, tensorRank, globalAddress, globalDim, globalStrides, boxDim, elementStrides, interleave, swizzle, l2Promotion, oobFill, __functionAddress);
    }

    /** {@code CUresult cuTensorMapEncodeTiled(CUtensorMap * tensorMap, CUtensorMapDataType tensorDataType, unsigned int tensorRank, void * globalAddress, cuuint64_t const * globalDim, cuuint64_t const * globalStrides, cuuint64_t const * boxDim, cuuint64_t const * elementStrides, CUtensorMapInterleave interleave, CUtensorMapSwizzle swizzle, CUtensorMapL2promotion l2Promotion, CUtensorMapFloatOOBfill oobFill)} */
    @NativeType("CUresult")
    public static int cuTensorMapEncodeTiled(@NativeType("CUtensorMap *") CUtensorMap tensorMap, @NativeType("CUtensorMapDataType") int tensorDataType, @NativeType("unsigned int") int tensorRank, @NativeType("void *") long globalAddress, @NativeType("cuuint64_t const *") LongBuffer globalDim, @NativeType("cuuint64_t const *") LongBuffer globalStrides, @NativeType("cuuint64_t const *") LongBuffer boxDim, @NativeType("cuuint64_t const *") LongBuffer elementStrides, @NativeType("CUtensorMapInterleave") int interleave, @NativeType("CUtensorMapSwizzle") int swizzle, @NativeType("CUtensorMapL2promotion") int l2Promotion, @NativeType("CUtensorMapFloatOOBfill") int oobFill) {
        if (CHECKS) {
            check(globalDim, tensorRank);
            check(globalStrides, tensorRank);
            check(boxDim, tensorRank);
            check(elementStrides, tensorRank);
        }
        return ncuTensorMapEncodeTiled(tensorMap.address(), tensorDataType, tensorRank, globalAddress, memAddress(globalDim), memAddress(globalStrides), memAddress(boxDim), memAddress(elementStrides), interleave, swizzle, l2Promotion, oobFill);
    }

    // --- [ cuTensorMapEncodeIm2col ] ---

    /** {@code CUresult cuTensorMapEncodeIm2col(CUtensorMap * tensorMap, CUtensorMapDataType tensorDataType, cuuint32_t tensorRank, void * globalAddress, cuuint64_t const * globalDim, cuuint64_t const * globalStrides, int const * pixelBoxLowerCorner, int const * pixelBoxUpperCorner, cuuint32_t channelsPerPixel, cuuint32_t pixelsPerColumn, cuuint32_t const * elementStrides, CUtensorMapInterleave interleave, CUtensorMapSwizzle swizzle, CUtensorMapL2promotion l2Promotion, CUtensorMapFloatOOBfill oobFill)} */
    public static int ncuTensorMapEncodeIm2col(long tensorMap, int tensorDataType, int tensorRank, long globalAddress, long globalDim, long globalStrides, long pixelBoxLowerCorner, long pixelBoxUpperCorner, int channelsPerPixel, int pixelsPerColumn, long elementStrides, int interleave, int swizzle, int l2Promotion, int oobFill) {
        long __functionAddress = Functions.TensorMapEncodeIm2col;
        if (CHECKS) {
            check(__functionAddress);
            check(globalAddress);
        }
        return callPPPPPPPI(tensorMap, tensorDataType, tensorRank, globalAddress, globalDim, globalStrides, pixelBoxLowerCorner, pixelBoxUpperCorner, channelsPerPixel, pixelsPerColumn, elementStrides, interleave, swizzle, l2Promotion, oobFill, __functionAddress);
    }

    /** {@code CUresult cuTensorMapEncodeIm2col(CUtensorMap * tensorMap, CUtensorMapDataType tensorDataType, cuuint32_t tensorRank, void * globalAddress, cuuint64_t const * globalDim, cuuint64_t const * globalStrides, int const * pixelBoxLowerCorner, int const * pixelBoxUpperCorner, cuuint32_t channelsPerPixel, cuuint32_t pixelsPerColumn, cuuint32_t const * elementStrides, CUtensorMapInterleave interleave, CUtensorMapSwizzle swizzle, CUtensorMapL2promotion l2Promotion, CUtensorMapFloatOOBfill oobFill)} */
    @NativeType("CUresult")
    public static int cuTensorMapEncodeIm2col(@NativeType("CUtensorMap *") CUtensorMap tensorMap, @NativeType("CUtensorMapDataType") int tensorDataType, @NativeType("cuuint32_t") int tensorRank, @NativeType("void *") long globalAddress, @NativeType("cuuint64_t const *") LongBuffer globalDim, @NativeType("cuuint64_t const *") LongBuffer globalStrides, @NativeType("int const *") IntBuffer pixelBoxLowerCorner, @NativeType("int const *") IntBuffer pixelBoxUpperCorner, @NativeType("cuuint32_t") int channelsPerPixel, @NativeType("cuuint32_t") int pixelsPerColumn, @NativeType("cuuint32_t const *") IntBuffer elementStrides, @NativeType("CUtensorMapInterleave") int interleave, @NativeType("CUtensorMapSwizzle") int swizzle, @NativeType("CUtensorMapL2promotion") int l2Promotion, @NativeType("CUtensorMapFloatOOBfill") int oobFill) {
        if (CHECKS) {
            check(globalDim, tensorRank);
            check(globalStrides, tensorRank);
            check(pixelBoxLowerCorner, tensorRank - 2);
            check(pixelBoxUpperCorner, tensorRank - 2);
            check(elementStrides, tensorRank);
        }
        return ncuTensorMapEncodeIm2col(tensorMap.address(), tensorDataType, tensorRank, globalAddress, memAddress(globalDim), memAddress(globalStrides), memAddress(pixelBoxLowerCorner), memAddress(pixelBoxUpperCorner), channelsPerPixel, pixelsPerColumn, memAddress(elementStrides), interleave, swizzle, l2Promotion, oobFill);
    }

    // --- [ cuTensorMapReplaceAddress ] ---

    /** {@code CUresult cuTensorMapReplaceAddress(CUtensorMap * tensorMap, void * globalAddress)} */
    public static int ncuTensorMapReplaceAddress(long tensorMap, long globalAddress) {
        long __functionAddress = Functions.TensorMapReplaceAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(globalAddress);
        }
        return callPPI(tensorMap, globalAddress, __functionAddress);
    }

    /** {@code CUresult cuTensorMapReplaceAddress(CUtensorMap * tensorMap, void * globalAddress)} */
    @NativeType("CUresult")
    public static int cuTensorMapReplaceAddress(@NativeType("CUtensorMap *") CUtensorMap tensorMap, @NativeType("void *") long globalAddress) {
        return ncuTensorMapReplaceAddress(tensorMap.address(), globalAddress);
    }

    // --- [ cuDeviceCanAccessPeer ] ---

    /** {@code CUresult cuDeviceCanAccessPeer(int * canAccessPeer, CUdevice dev, CUdevice peerDev)} */
    public static int ncuDeviceCanAccessPeer(long canAccessPeer, int dev, int peerDev) {
        long __functionAddress = Functions.DeviceCanAccessPeer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(canAccessPeer, dev, peerDev, __functionAddress);
    }

    /** {@code CUresult cuDeviceCanAccessPeer(int * canAccessPeer, CUdevice dev, CUdevice peerDev)} */
    @NativeType("CUresult")
    public static int cuDeviceCanAccessPeer(@NativeType("int *") IntBuffer canAccessPeer, @NativeType("CUdevice") int dev, @NativeType("CUdevice") int peerDev) {
        if (CHECKS) {
            check(canAccessPeer, 1);
        }
        return ncuDeviceCanAccessPeer(memAddress(canAccessPeer), dev, peerDev);
    }

    // --- [ cuCtxEnablePeerAccess ] ---

    /** {@code CUresult cuCtxEnablePeerAccess(CUcontext peerContext, unsigned int Flags)} */
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

    /** {@code CUresult cuCtxDisablePeerAccess(CUcontext peerContext)} */
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

    /** {@code CUresult cuDeviceGetP2PAttribute(int * value, CUdevice_P2PAttribute attrib, CUdevice srcDevice, CUdevice dstDevice)} */
    public static int ncuDeviceGetP2PAttribute(long value, int attrib, int srcDevice, int dstDevice) {
        long __functionAddress = Functions.DeviceGetP2PAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(value, attrib, srcDevice, dstDevice, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetP2PAttribute(int * value, CUdevice_P2PAttribute attrib, CUdevice srcDevice, CUdevice dstDevice)} */
    @NativeType("CUresult")
    public static int cuDeviceGetP2PAttribute(@NativeType("int *") IntBuffer value, @NativeType("CUdevice_P2PAttribute") int attrib, @NativeType("CUdevice") int srcDevice, @NativeType("CUdevice") int dstDevice) {
        if (CHECKS) {
            check(value, 1);
        }
        return ncuDeviceGetP2PAttribute(memAddress(value), attrib, srcDevice, dstDevice);
    }

    // --- [ cuGraphicsUnregisterResource ] ---

    /** {@code CUresult cuGraphicsUnregisterResource(CUgraphicsResource resource)} */
    @NativeType("CUresult")
    public static int cuGraphicsUnregisterResource(@NativeType("CUgraphicsResource") long resource) {
        long __functionAddress = Functions.GraphicsUnregisterResource;
        if (CHECKS) {
            check(resource);
        }
        return callPI(resource, __functionAddress);
    }

    // --- [ cuGraphicsSubResourceGetMappedArray ] ---

    /** {@code CUresult cuGraphicsSubResourceGetMappedArray(CUarray * pArray, CUgraphicsResource resource, unsigned int arrayIndex, unsigned int mipLevel)} */
    public static int ncuGraphicsSubResourceGetMappedArray(long pArray, long resource, int arrayIndex, int mipLevel) {
        long __functionAddress = Functions.GraphicsSubResourceGetMappedArray;
        if (CHECKS) {
            check(resource);
        }
        return callPPI(pArray, resource, arrayIndex, mipLevel, __functionAddress);
    }

    /** {@code CUresult cuGraphicsSubResourceGetMappedArray(CUarray * pArray, CUgraphicsResource resource, unsigned int arrayIndex, unsigned int mipLevel)} */
    @NativeType("CUresult")
    public static int cuGraphicsSubResourceGetMappedArray(@NativeType("CUarray *") PointerBuffer pArray, @NativeType("CUgraphicsResource") long resource, @NativeType("unsigned int") int arrayIndex, @NativeType("unsigned int") int mipLevel) {
        if (CHECKS) {
            check(pArray, 1);
        }
        return ncuGraphicsSubResourceGetMappedArray(memAddress(pArray), resource, arrayIndex, mipLevel);
    }

    // --- [ cuGraphicsResourceGetMappedMipmappedArray ] ---

    /** {@code CUresult cuGraphicsResourceGetMappedMipmappedArray(CUmipmappedArray * pMipmappedArray, CUgraphicsResource resource)} */
    public static int ncuGraphicsResourceGetMappedMipmappedArray(long pMipmappedArray, long resource) {
        long __functionAddress = Functions.GraphicsResourceGetMappedMipmappedArray;
        if (CHECKS) {
            check(__functionAddress);
            check(resource);
        }
        return callPPI(pMipmappedArray, resource, __functionAddress);
    }

    /** {@code CUresult cuGraphicsResourceGetMappedMipmappedArray(CUmipmappedArray * pMipmappedArray, CUgraphicsResource resource)} */
    @NativeType("CUresult")
    public static int cuGraphicsResourceGetMappedMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer pMipmappedArray, @NativeType("CUgraphicsResource") long resource) {
        if (CHECKS) {
            check(pMipmappedArray, 1);
        }
        return ncuGraphicsResourceGetMappedMipmappedArray(memAddress(pMipmappedArray), resource);
    }

    // --- [ cuGraphicsResourceGetMappedPointer ] ---

    /** {@code CUresult cuGraphicsResourceGetMappedPointer(CUdeviceptr * pDevPtr, size_t * pSize, CUgraphicsResource resource)} */
    public static int ncuGraphicsResourceGetMappedPointer(long pDevPtr, long pSize, long resource) {
        long __functionAddress = Functions.GraphicsResourceGetMappedPointer;
        if (CHECKS) {
            check(resource);
        }
        return callPPPI(pDevPtr, pSize, resource, __functionAddress);
    }

    /** {@code CUresult cuGraphicsResourceGetMappedPointer(CUdeviceptr * pDevPtr, size_t * pSize, CUgraphicsResource resource)} */
    @NativeType("CUresult")
    public static int cuGraphicsResourceGetMappedPointer(@NativeType("CUdeviceptr *") PointerBuffer pDevPtr, @NativeType("size_t *") PointerBuffer pSize, @NativeType("CUgraphicsResource") long resource) {
        if (CHECKS) {
            check(pDevPtr, 1);
            check(pSize, 1);
        }
        return ncuGraphicsResourceGetMappedPointer(memAddress(pDevPtr), memAddress(pSize), resource);
    }

    // --- [ cuGraphicsResourceSetMapFlags ] ---

    /** {@code CUresult cuGraphicsResourceSetMapFlags(CUgraphicsResource resource, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuGraphicsResourceSetMapFlags(@NativeType("CUgraphicsResource") long resource, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.GraphicsResourceSetMapFlags;
        if (CHECKS) {
            check(resource);
        }
        return callPI(resource, flags, __functionAddress);
    }

    // --- [ cuGraphicsMapResources ] ---

    /** {@code CUresult cuGraphicsMapResources(unsigned int count, CUgraphicsResource * resources, CUstream hStream)} */
    public static int ncuGraphicsMapResources(int count, long resources, long hStream) {
        long __functionAddress = Functions.GraphicsMapResources;
        return callPPI(count, resources, hStream, __functionAddress);
    }

    /** {@code CUresult cuGraphicsMapResources(unsigned int count, CUgraphicsResource * resources, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuGraphicsMapResources(@NativeType("CUgraphicsResource *") PointerBuffer resources, @NativeType("CUstream") long hStream) {
        return ncuGraphicsMapResources(resources.remaining(), memAddress(resources), hStream);
    }

    // --- [ cuGraphicsUnmapResources ] ---

    /** {@code CUresult cuGraphicsUnmapResources(unsigned int count, CUgraphicsResource * resources, CUstream hStream)} */
    public static int ncuGraphicsUnmapResources(int count, long resources, long hStream) {
        long __functionAddress = Functions.GraphicsUnmapResources;
        return callPPI(count, resources, hStream, __functionAddress);
    }

    /** {@code CUresult cuGraphicsUnmapResources(unsigned int count, CUgraphicsResource * resources, CUstream hStream)} */
    @NativeType("CUresult")
    public static int cuGraphicsUnmapResources(@NativeType("CUgraphicsResource *") PointerBuffer resources, @NativeType("CUstream") long hStream) {
        return ncuGraphicsUnmapResources(resources.remaining(), memAddress(resources), hStream);
    }

    // --- [ cuGetProcAddress ] ---

    /** {@code CUresult cuGetProcAddress(char const * symbol, void ** pfn, int cudaVersion, cuuint64_t flags)} */
    public static int ncuGetProcAddress(long symbol, long pfn, int cudaVersion, long flags) {
        long __functionAddress = Functions.GetProcAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(symbol, pfn, cudaVersion, flags, __functionAddress);
    }

    /** {@code CUresult cuGetProcAddress(char const * symbol, void ** pfn, int cudaVersion, cuuint64_t flags)} */
    @NativeType("CUresult")
    public static int cuGetProcAddress(@NativeType("char const *") ByteBuffer symbol, @NativeType("void **") PointerBuffer pfn, int cudaVersion, @NativeType("cuuint64_t") long flags) {
        if (CHECKS) {
            checkNT1(symbol);
            check(pfn, 1);
        }
        return ncuGetProcAddress(memAddress(symbol), memAddress(pfn), cudaVersion, flags);
    }

    /** {@code CUresult cuGetProcAddress(char const * symbol, void ** pfn, int cudaVersion, cuuint64_t flags)} */
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

    // --- [ cuGetProcAddress_v2 ] ---

    /** {@code CUresult cuGetProcAddress_v2(char const * symbol, void ** pfn, int cudaVersion, cuuint64_t flags, CUdriverProcAddressQueryResult * symbolStatus)} */
    public static int ncuGetProcAddress_v2(long symbol, long pfn, int cudaVersion, long flags, long symbolStatus) {
        long __functionAddress = Functions.GetProcAddress_v2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJPI(symbol, pfn, cudaVersion, flags, symbolStatus, __functionAddress);
    }

    /** {@code CUresult cuGetProcAddress_v2(char const * symbol, void ** pfn, int cudaVersion, cuuint64_t flags, CUdriverProcAddressQueryResult * symbolStatus)} */
    @NativeType("CUresult")
    public static int cuGetProcAddress_v2(@NativeType("char const *") ByteBuffer symbol, @NativeType("void **") PointerBuffer pfn, int cudaVersion, @NativeType("cuuint64_t") long flags, @NativeType("CUdriverProcAddressQueryResult *") @Nullable IntBuffer symbolStatus) {
        if (CHECKS) {
            checkNT1(symbol);
            check(pfn, 1);
            checkSafe(symbolStatus, 1);
        }
        return ncuGetProcAddress_v2(memAddress(symbol), memAddress(pfn), cudaVersion, flags, memAddressSafe(symbolStatus));
    }

    /** {@code CUresult cuGetProcAddress_v2(char const * symbol, void ** pfn, int cudaVersion, cuuint64_t flags, CUdriverProcAddressQueryResult * symbolStatus)} */
    @NativeType("CUresult")
    public static int cuGetProcAddress_v2(@NativeType("char const *") CharSequence symbol, @NativeType("void **") PointerBuffer pfn, int cudaVersion, @NativeType("cuuint64_t") long flags, @NativeType("CUdriverProcAddressQueryResult *") @Nullable IntBuffer symbolStatus) {
        if (CHECKS) {
            check(pfn, 1);
            checkSafe(symbolStatus, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(symbol, true);
            long symbolEncoded = stack.getPointerAddress();
            return ncuGetProcAddress_v2(symbolEncoded, memAddress(pfn), cudaVersion, flags, memAddressSafe(symbolStatus));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuCoredumpGetAttribute ] ---

    /** {@code CUresult cuCoredumpGetAttribute(CUcoredumpSettings attrib, void * value, size_t * size)} */
    public static int ncuCoredumpGetAttribute(int attrib, long value, long size) {
        long __functionAddress = Functions.CoredumpGetAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(attrib, value, size, __functionAddress);
    }

    /** {@code CUresult cuCoredumpGetAttribute(CUcoredumpSettings attrib, void * value, size_t * size)} */
    @NativeType("CUresult")
    public static int cuCoredumpGetAttribute(@NativeType("CUcoredumpSettings") int attrib, @NativeType("void *") @Nullable ByteBuffer value, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return ncuCoredumpGetAttribute(attrib, memAddressSafe(value), memAddress(size));
    }

    // --- [ cuCoredumpGetAttributeGlobal ] ---

    /** {@code CUresult cuCoredumpGetAttributeGlobal(CUcoredumpSettings attrib, void * value, size_t * size)} */
    public static int ncuCoredumpGetAttributeGlobal(int attrib, long value, long size) {
        long __functionAddress = Functions.CoredumpGetAttributeGlobal;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(attrib, value, size, __functionAddress);
    }

    /** {@code CUresult cuCoredumpGetAttributeGlobal(CUcoredumpSettings attrib, void * value, size_t * size)} */
    @NativeType("CUresult")
    public static int cuCoredumpGetAttributeGlobal(@NativeType("CUcoredumpSettings") int attrib, @NativeType("void *") @Nullable ByteBuffer value, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return ncuCoredumpGetAttributeGlobal(attrib, memAddressSafe(value), memAddress(size));
    }

    // --- [ cuCoredumpSetAttribute ] ---

    /** {@code CUresult cuCoredumpSetAttribute(CUcoredumpSettings attrib, void const * value, size_t * size)} */
    public static int ncuCoredumpSetAttribute(int attrib, long value, long size) {
        long __functionAddress = Functions.CoredumpSetAttribute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(attrib, value, size, __functionAddress);
    }

    /** {@code CUresult cuCoredumpSetAttribute(CUcoredumpSettings attrib, void const * value, size_t * size)} */
    @NativeType("CUresult")
    public static int cuCoredumpSetAttribute(@NativeType("CUcoredumpSettings") int attrib, @NativeType("void const *") @Nullable ByteBuffer value, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return ncuCoredumpSetAttribute(attrib, memAddressSafe(value), memAddress(size));
    }

    // --- [ cuCoredumpSetAttributeGlobal ] ---

    /** {@code CUresult cuCoredumpSetAttributeGlobal(CUcoredumpSettings attrib, void const * value, size_t * size)} */
    public static int ncuCoredumpSetAttributeGlobal(int attrib, long value, long size) {
        long __functionAddress = Functions.CoredumpSetAttributeGlobal;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(attrib, value, size, __functionAddress);
    }

    /** {@code CUresult cuCoredumpSetAttributeGlobal(CUcoredumpSettings attrib, void const * value, size_t * size)} */
    @NativeType("CUresult")
    public static int cuCoredumpSetAttributeGlobal(@NativeType("CUcoredumpSettings") int attrib, @NativeType("void const *") @Nullable ByteBuffer value, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return ncuCoredumpSetAttributeGlobal(attrib, memAddressSafe(value), memAddress(size));
    }

    // --- [ cuGetExportTable ] ---

    /** {@code CUresult cuGetExportTable(void const ** ppExportTable, CUuuid const * pExportTableId)} */
    public static int ncuGetExportTable(long ppExportTable, long pExportTableId) {
        long __functionAddress = Functions.GetExportTable;
        return callPPI(ppExportTable, pExportTableId, __functionAddress);
    }

    /** {@code CUresult cuGetExportTable(void const ** ppExportTable, CUuuid const * pExportTableId)} */
    @NativeType("CUresult")
    public static int cuGetExportTable(@NativeType("void const **") PointerBuffer ppExportTable, @NativeType("CUuuid const *") CUuuid pExportTableId) {
        return ncuGetExportTable(memAddress(ppExportTable), pExportTableId.address());
    }

    // --- [ cuGreenCtxCreate ] ---

    /** {@code CUresult cuGreenCtxCreate(CUgreenCtx * phCtx, CUdevResourceDesc desc, CUdevice dev, unsigned int flags)} */
    public static int ncuGreenCtxCreate(long phCtx, long desc, int dev, int flags) {
        long __functionAddress = Functions.GreenCtxCreate;
        if (CHECKS) {
            check(__functionAddress);
            check(desc);
        }
        return callPPI(phCtx, desc, dev, flags, __functionAddress);
    }

    /** {@code CUresult cuGreenCtxCreate(CUgreenCtx * phCtx, CUdevResourceDesc desc, CUdevice dev, unsigned int flags)} */
    @NativeType("CUresult")
    public static int cuGreenCtxCreate(@NativeType("CUgreenCtx *") PointerBuffer phCtx, @NativeType("CUdevResourceDesc") long desc, @NativeType("CUdevice") int dev, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(phCtx, 1);
        }
        return ncuGreenCtxCreate(memAddress(phCtx), desc, dev, flags);
    }

    // --- [ cuGreenCtxDestroy ] ---

    /** {@code CUresult cuGreenCtxDestroy(CUgreenCtx hCtx)} */
    @NativeType("CUresult")
    public static int cuGreenCtxDestroy(@NativeType("CUgreenCtx") long hCtx) {
        long __functionAddress = Functions.GreenCtxDestroy;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
        }
        return callPI(hCtx, __functionAddress);
    }

    // --- [ cuCtxFromGreenCtx ] ---

    /** {@code CUresult cuCtxFromGreenCtx(CUcontext * pContext, CUgreenCtx hCtx)} */
    public static int ncuCtxFromGreenCtx(long pContext, long hCtx) {
        long __functionAddress = Functions.CtxFromGreenCtx;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
        }
        return callPPI(pContext, hCtx, __functionAddress);
    }

    /** {@code CUresult cuCtxFromGreenCtx(CUcontext * pContext, CUgreenCtx hCtx)} */
    @NativeType("CUresult")
    public static int cuCtxFromGreenCtx(@NativeType("CUcontext *") PointerBuffer pContext, @NativeType("CUgreenCtx") long hCtx) {
        if (CHECKS) {
            check(pContext, 1);
        }
        return ncuCtxFromGreenCtx(memAddress(pContext), hCtx);
    }

    // --- [ cuDeviceGetDevResource ] ---

    /** {@code CUresult cuDeviceGetDevResource(CUdevice device, CUdevResource * resource, CUdevResourceType type)} */
    public static int ncuDeviceGetDevResource(int device, long resource, int type) {
        long __functionAddress = Functions.DeviceGetDevResource;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(device, resource, type, __functionAddress);
    }

    /** {@code CUresult cuDeviceGetDevResource(CUdevice device, CUdevResource * resource, CUdevResourceType type)} */
    @NativeType("CUresult")
    public static int cuDeviceGetDevResource(@NativeType("CUdevice") int device, @NativeType("CUdevResource *") CUdevResource.Buffer resource, @NativeType("CUdevResourceType") int type) {
        if (CHECKS) {
            check(resource, 1);
        }
        return ncuDeviceGetDevResource(device, resource.address(), type);
    }

    // --- [ cuCtxGetDevResource ] ---

    /** {@code CUresult cuCtxGetDevResource(CUcontext hCtx, CUdevResource * resource, CUdevResourceType type)} */
    public static int ncuCtxGetDevResource(long hCtx, long resource, int type) {
        long __functionAddress = Functions.CtxGetDevResource;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
        }
        return callPPI(hCtx, resource, type, __functionAddress);
    }

    /** {@code CUresult cuCtxGetDevResource(CUcontext hCtx, CUdevResource * resource, CUdevResourceType type)} */
    @NativeType("CUresult")
    public static int cuCtxGetDevResource(@NativeType("CUcontext") long hCtx, @NativeType("CUdevResource *") CUdevResource.Buffer resource, @NativeType("CUdevResourceType") int type) {
        if (CHECKS) {
            check(resource, 1);
        }
        return ncuCtxGetDevResource(hCtx, resource.address(), type);
    }

    // --- [ cuGreenCtxGetDevResource ] ---

    /** {@code CUresult cuGreenCtxGetDevResource(CUgreenCtx hCtx, CUdevResource * resource, CUdevResourceType type)} */
    public static int ncuGreenCtxGetDevResource(long hCtx, long resource, int type) {
        long __functionAddress = Functions.GreenCtxGetDevResource;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
        }
        return callPPI(hCtx, resource, type, __functionAddress);
    }

    /** {@code CUresult cuGreenCtxGetDevResource(CUgreenCtx hCtx, CUdevResource * resource, CUdevResourceType type)} */
    @NativeType("CUresult")
    public static int cuGreenCtxGetDevResource(@NativeType("CUgreenCtx") long hCtx, @NativeType("CUdevResource *") CUdevResource.Buffer resource, @NativeType("CUdevResourceType") int type) {
        if (CHECKS) {
            check(resource, 1);
        }
        return ncuGreenCtxGetDevResource(hCtx, resource.address(), type);
    }

    // --- [ cuDevSmResourceSplitByCount ] ---

    /** {@code CUresult cuDevSmResourceSplitByCount(CUdevResource * result, unsigned int * nbGroups, CUdevResource * input, CUdevResource * remaining, unsigned int useFlags, unsigned int minCount)} */
    public static int ncuDevSmResourceSplitByCount(long result, long nbGroups, long input, long remaining, int useFlags, int minCount) {
        long __functionAddress = Functions.DevSmResourceSplitByCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(result, nbGroups, input, remaining, useFlags, minCount, __functionAddress);
    }

    /** {@code CUresult cuDevSmResourceSplitByCount(CUdevResource * result, unsigned int * nbGroups, CUdevResource * input, CUdevResource * remaining, unsigned int useFlags, unsigned int minCount)} */
    @NativeType("CUresult")
    public static int cuDevSmResourceSplitByCount(@NativeType("CUdevResource *") CUdevResource.Buffer result, @NativeType("unsigned int *") IntBuffer nbGroups, @NativeType("CUdevResource *") CUdevResource.Buffer input, @NativeType("CUdevResource *") CUdevResource.Buffer remaining, @NativeType("unsigned int") int useFlags, @NativeType("unsigned int") int minCount) {
        if (CHECKS) {
            check(result, 1);
            check(nbGroups, 1);
            check(input, 1);
            check(remaining, 1);
        }
        return ncuDevSmResourceSplitByCount(result.address(), memAddress(nbGroups), input.address(), remaining.address(), useFlags, minCount);
    }

    // --- [ cuDevResourceGenerateDesc ] ---

    /** {@code CUresult cuDevResourceGenerateDesc(CUdevResourceDesc * phDesc, CUdevResource * resources, unsigned int nbResources)} */
    public static int ncuDevResourceGenerateDesc(long phDesc, long resources, int nbResources) {
        long __functionAddress = Functions.DevResourceGenerateDesc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(phDesc, resources, nbResources, __functionAddress);
    }

    /** {@code CUresult cuDevResourceGenerateDesc(CUdevResourceDesc * phDesc, CUdevResource * resources, unsigned int nbResources)} */
    @NativeType("CUresult")
    public static int cuDevResourceGenerateDesc(@NativeType("CUdevResourceDesc *") PointerBuffer phDesc, @NativeType("CUdevResource *") CUdevResource.Buffer resources, @NativeType("unsigned int") int nbResources) {
        if (CHECKS) {
            check(phDesc, 1);
            check(resources, 1);
        }
        return ncuDevResourceGenerateDesc(memAddress(phDesc), resources.address(), nbResources);
    }

    // --- [ cuGreenCtxRecordEvent ] ---

    /** {@code CUresult cuGreenCtxRecordEvent(CUgreenCtx hCtx, CUevent hEvent)} */
    @NativeType("CUresult")
    public static int cuGreenCtxRecordEvent(@NativeType("CUgreenCtx") long hCtx, @NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.GreenCtxRecordEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
            check(hEvent);
        }
        return callPPI(hCtx, hEvent, __functionAddress);
    }

    // --- [ cuGreenCtxWaitEvent ] ---

    /** {@code CUresult cuGreenCtxWaitEvent(CUgreenCtx hCtx, CUevent hEvent)} */
    @NativeType("CUresult")
    public static int cuGreenCtxWaitEvent(@NativeType("CUgreenCtx") long hCtx, @NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.GreenCtxWaitEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(hCtx);
            check(hEvent);
        }
        return callPPI(hCtx, hEvent, __functionAddress);
    }

    // --- [ cuStreamGetGreenCtx ] ---

    /** {@code CUresult cuStreamGetGreenCtx(CUstream hStream, CUgreenCtx * phCtx)} */
    public static int ncuStreamGetGreenCtx(long hStream, long phCtx) {
        long __functionAddress = Functions.StreamGetGreenCtx;
        if (CHECKS) {
            check(__functionAddress);
            check(hStream);
        }
        return callPPI(hStream, phCtx, __functionAddress);
    }

    /** {@code CUresult cuStreamGetGreenCtx(CUstream hStream, CUgreenCtx * phCtx)} */
    @NativeType("CUresult")
    public static int cuStreamGetGreenCtx(@NativeType("CUstream") long hStream, @NativeType("CUgreenCtx *") PointerBuffer phCtx) {
        if (CHECKS) {
            check(phCtx, 1);
        }
        return ncuStreamGetGreenCtx(hStream, memAddress(phCtx));
    }

    // --- [ cuGreenCtxStreamCreate ] ---

    /** {@code CUresult cuGreenCtxStreamCreate(CUstream * phStream, CUgreenCtx greenCtx, unsigned int flags, int priority)} */
    public static int ncuGreenCtxStreamCreate(long phStream, long greenCtx, int flags, int priority) {
        long __functionAddress = Functions.GreenCtxStreamCreate;
        if (CHECKS) {
            check(__functionAddress);
            check(greenCtx);
        }
        return callPPI(phStream, greenCtx, flags, priority, __functionAddress);
    }

    /** {@code CUresult cuGreenCtxStreamCreate(CUstream * phStream, CUgreenCtx greenCtx, unsigned int flags, int priority)} */
    @NativeType("CUresult")
    public static int cuGreenCtxStreamCreate(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("CUgreenCtx") long greenCtx, @NativeType("unsigned int") int flags, int priority) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuGreenCtxStreamCreate(memAddress(phStream), greenCtx, flags, priority);
    }

}