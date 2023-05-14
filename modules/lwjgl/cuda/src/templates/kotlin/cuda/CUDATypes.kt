/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda

import org.lwjgl.generator.*

val NVCUDA_BINDING = simpleBinding(Module.CUDA, libraryName = "NVCUDA", libraryExpression = "Configuration.CUDA_LIBRARY_NAME, Platform.get() == Platform.WINDOWS ? \"nvcuda\" : \"cuda\"")
val NVCUDA_BINDING_DELEGATE = NVCUDA_BINDING.delegate("CU.getLibrary()")

internal fun Func.versioned(version: Int = 2): Func = NativeName("__CUDA_API_VERSION(\"${this.name}\", $version)")..this
internal fun Func.ptds(version: Int = 1): Func = "\"${this.name}\""
    .let { name ->
        (if (version == 1) name else "__CUDA_API_VERSION($name, $version)")
            .let {
                NativeName("__CUDA_API_PTDS($it)")..this
            }
    }
internal fun Func.ptsz(version: Int = 1): Func = "\"${this.name}\""
    .let { name ->
        (if (version == 1) name else "__CUDA_API_VERSION($name, $version)")
            .let {
                NativeName("__CUDA_API_PTSZ($it)")..this
            }
    }

val CUdevice = typedef(int, "CUdevice")

val cuuint32_t = typedef(uint32_t, "cuuint32_t")
val cuuint64_t = typedef(uint64_t, "cuuint64_t")

val CUarray = "CUarray".handle
val CUcontext = "CUcontext".handle
val CUdeviceptr = "CUdeviceptr".handle
val CUevent = "CUevent".handle
val CUexternalMemory = "CUexternalMemory".handle
val CUexternalSemaphore = "CUexternalSemaphore".handle
val CUfunction = "CUfunction".handle
val CUgraph = "CUgraph".handle
val CUgraphExec = "CUgraphExec".handle
val CUgraphNode = "CUgraphNode".handle
val CUgraphicsResource = "CUgraphicsResource".handle
val CUkernel = "CUkernel".handle
val CUlibrary = "CUlibrary".handle
val CUlinkState = "CUlinkState".handle
val CUmemoryPool = "CUmemoryPool".handle
val CUmipmappedArray = "CUmipmappedArray".handle
val CUmodule = "CUmodule".handle
val CUstream = "CUstream".handle
val CUsurfref = "CUsurfref".handle
val CUtexref = "CUtexref".handle
val CUuserObject = "CUuserObject".handle

val CUmemGenericAllocationHandle = typedef(unsigned_long_long, "CUmemGenericAllocationHandle")
val CUsurfObject = typedef(unsigned_long_long, "CUsurfObject")
val CUtexObject = typedef(unsigned_long_long, "CUtexObject")

val CUaccessProperty = "CUaccessProperty".enumType
val CUaddress_mode = "CUaddress_mode".enumType
val CUarraySparseSubresourceType = "CUarraySparseSubresourceType".enumType
val CUarray_format = "CUarray_format".enumType
val CUclusterSchedulingPolicy = "CUclusterSchedulingPolicy".enumType
val CUcoredumpSettings = "CUcoredumpSettings".enumType
val CUdevice_attribute = "CUdevice_attribute".enumType
val CUdevice_P2PAttribute = "CUdevice_P2PAttribute".enumType
val CUdriverProcAddressQueryResult = "CUdriverProcAddressQueryResult".enumType
val CUexecAffinityType = "CUexecAffinityType".enumType
val CUexternalMemoryHandleType = "CUexternalMemoryHandleType".enumType
val CUexternalSemaphoreHandleType = "CUexternalSemaphoreHandleType".enumType
val CUfilter_mode = "CUfilter_mode".enumType
val CUflushGPUDirectRDMAWritesScope = "CUflushGPUDirectRDMAWritesScope".enumType
val CUflushGPUDirectRDMAWritesTarget = "CUflushGPUDirectRDMAWritesTarget".enumType
val CUfunc_cache = "CUfunc_cache".enumType
val CUfunction_attribute = "CUfunction_attribute".enumType
val CUgraphInstantiateResult = "CUgraphInstantiateResult".enumType
val CUgraphMem_attribute = "CUgraphMem_attribute".enumType
val CUgraphNodeType = "CUgraphNodeType".enumType
val CUgraphExecUpdateResult = "CUgraphExecUpdateResult".enumType
val CUjit_option = "CUjit_option".enumType
val CUjitInputType = "CUjitInputType".enumType
val CUkernelNodeAttrID = "CUkernelNodeAttrID".enumType
val CUlaunchAttributeID = "CUlaunchAttributeID".enumType
val CUlaunchMemSyncDomain = "CUlaunchMemSyncDomain".enumType
val CUlibraryOption = "CUlibraryOption".enumType
val CUlimit = "CUlimit".enumType
val CUmemAccess_flags = "CUmemAccess_flags".enumType
val CUmemAllocationGranularity_flags = "CUmemAllocationGranularity_flags".enumType
val CUmemAllocationHandleType = "CUmemAllocationHandleType".enumType
val CUmemAllocationType = "CUmemAllocationType".enumType
val CUmemHandleType = "CUmemHandleType".enumType
val CUmemLocationType = "CUmemLocationType".enumType
val CUmemOperationType = "CUmemOperationType".enumType
val CUmemPool_attribute = "CUmemPool_attribute".enumType
val CUmemRangeHandleType = "CUmemRangeHandleType".enumType
val CUmem_advise = "CUmem_advise".enumType
val CUmem_range_attribute = "CUmem_range_attribute".enumType
val CUmemorytype = "CUmemorytype".enumType
val CUmoduleLoadingMode = "CUmoduleLoadingMode".enumType
val CUmulticastGranularity_flags = "CUmulticastGranularity_flags".enumType
val CUoutput_mode = "CUoutput_mode".enumType
val CUpointer_attribute = "CUpointer_attribute".enumType
val CUresourcetype = "CUresourcetype".enumType
val CUresourceViewFormat = "CUresourceViewFormat".enumType
val CUresult = "CUresult".enumType
val CUsharedconfig = "CUsharedconfig".enumType
val CUstreamAttrID = "CUstreamAttrID".enumType
val CUstreamBatchMemOpType = "CUstreamBatchMemOpType".enumType
val CUstreamCaptureMode = "CUstreamCaptureMode".enumType
val CUstreamCaptureStatus = "CUstreamCaptureStatus".enumType
val CUsynchronizationPolicy = "CUsynchronizationPolicy".enumType
val CUtensorMapDataType = "CUtensorMapDataType".enumType
val CUtensorMapFloatOOBfill = "CUtensorMapFloatOOBfill".enumType
val CUtensorMapInterleave = "CUtensorMapInterleave".enumType
val CUtensorMapL2promotion = "CUtensorMapL2promotion".enumType
val CUtensorMapSwizzle = "CUtensorMapSwizzle".enumType

val CUstreamCallback = Module.CUDA.callback {
    void(
        "CUstreamCallback",
        "CUDA stream callback.",

        nullable..CUstream("hStream", ""),
        CUresult("status", ""),
        opaque_p("userData", "")
    ) {}
}

val CUhostFn = Module.CUDA.callback {
    void(
        "CUhostFn",
        "",

        opaque_p("userData", "")
    ) {}
}

val CUoccupancyB2DSize = Module.CUDA.callback {
    size_t(
        "CUoccupancyB2DSize",
        "",

        int("blockSize", ""),

        returnDoc = "the dynamic shared memory needed by a block"
    ) {}
}

val CUuuid = struct(Module.CUDA, "CUuuid", mutable = false) {
    charASCII("bytes", "")[16]
}

val CUipcEventHandle = struct(Module.CUDA, "CUIPCEventHandle", nativeName = "CUipcEventHandle") {
    javaImport("static org.lwjgl.cuda.CU.*")

    char("reserved", "")["CU_IPC_HANDLE_SIZE"]
}

val CUipcMemHandle = struct(Module.CUDA, "CUIPCMemHandle", nativeName = "CUipcMemHandle") {
    javaImport("static org.lwjgl.cuda.CU.*")

    char("reserved", "")["CU_IPC_HANDLE_SIZE"]
}

val CUDA_MEMCPY2D = struct(Module.CUDA, "CUDA_MEMCPY2D") {
    size_t("srcXInBytes", "")
    size_t("srcY", "")
    CUmemorytype("srcMemoryType", "")
    nullable..void.const.p("srcHost", "")
    nullable..CUdeviceptr("srcDevice", "")
    nullable..CUarray("srcArray", "")
    size_t("srcPitch", "")
    size_t("dstXInBytes", "")
    size_t("dstY", "")
    CUmemorytype("dstMemoryType", "")
    nullable..void.p("dstHost", "")
    nullable..CUdeviceptr("dstDevice", "")
    nullable..CUarray("dstArray", "")
    size_t("dstPitch", "")
    size_t("WidthInBytes", "")
    size_t("Height", "")
}

val CUDA_MEMCPY3D = struct(Module.CUDA, "CUDA_MEMCPY3D") {
    size_t("srcXInBytes", "")
    size_t("srcY", "")
    size_t("srcZ", "")
    size_t("srcLOD", "")
    CUmemorytype("srcMemoryType", "")
    nullable..void.const.p("srcHost", "")
    nullable..CUdeviceptr("srcDevice", "")
    nullable..CUarray("srcArray", "")
    nullable..opaque_p("reserved0", "")
    size_t("srcPitch", "")
    size_t("srcHeight", "")
    size_t("dstXInBytes", "")
    size_t("dstY", "")
    size_t("dstZ", "")
    size_t("dstLOD", "")
    CUmemorytype("dstMemoryType", "")
    nullable..void.p("dstHost", "")
    nullable..CUdeviceptr("dstDevice", "")
    nullable..CUarray("dstArray", "")
    nullable..opaque_p("reserved1", "")
    size_t("dstPitch", "")
    size_t("dstHeight", "")
    size_t("WidthInBytes", "")
    size_t("Height", "")
    size_t("Depth", "")
}

val CUDA_MEMCPY3D_PEER = struct(Module.CUDA, "CUDA_MEMCPY3D_PEER") {
    size_t("srcXInBytes", "")
    size_t("srcY", "")
    size_t("srcZ", "")
    size_t("srcLOD", "")
    CUmemorytype("srcMemoryType", "")
    nullable..void.const.p("srcHost", "")
    nullable..CUdeviceptr("srcDevice", "")
    nullable..CUarray("srcArray", "")
    nullable..CUcontext("srcContext", "")
    size_t("srcPitch", "")
    size_t("srcHeight", "")
    size_t("dstXInBytes", "")
    size_t("dstY", "")
    size_t("dstZ", "")
    size_t("dstLOD", "")
    CUmemorytype("dstMemoryType", "")
    nullable..void.p("dstHost", "")
    nullable..CUdeviceptr("dstDevice", "")
    nullable..CUarray("dstArray", "")
    nullable..CUcontext("dstContext", "")
    size_t("dstPitch", "")
    size_t("dstHeight", "")
    size_t("WidthInBytes", "")
    size_t("Height", "")
    size_t("Depth", "")
}

val CUDA_ARRAY_DESCRIPTOR = struct(Module.CUDA, "CUDA_ARRAY_DESCRIPTOR") {
    size_t("Width", "")
    size_t("Height", "")
    CUarray_format("Format", "")
    unsigned_int("NumChannels", "")
}

val CUDA_ARRAY3D_DESCRIPTOR = struct(Module.CUDA, "CUDA_ARRAY3D_DESCRIPTOR") {
    size_t("Width", "")
    size_t("Height", "")
    size_t("Depth", "")
    CUarray_format("Format", "")
    unsigned_int("NumChannels", "")
    unsigned_int("Flags", "")
}

val CUDA_ARRAY_SPARSE_PROPERTIES = struct(Module.CUDA, "CUDA_ARRAY_SPARSE_PROPERTIES") {
    struct {
        unsigned_int("width", "")
        unsigned_int("height", "")
        unsigned_int("depth", "")
    }("tileExtent", "")
    unsigned_int("miptailFirstLevel", "")
    unsigned_long_long("miptailSize", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[4]
}

val CUDA_ARRAY_MEMORY_REQUIREMENTS = struct(Module.CUDA, "CUDA_ARRAY_MEMORY_REQUIREMENTS", mutable = false) {
    size_t("size", "")
    size_t("alignment", "")
    unsigned_int("reserved", "")[4]
}

val CUDA_EXTERNAL_MEMORY_HANDLE_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_HANDLE_DESC") {
    CUexternalMemoryHandleType("type", "")
    union {
        int("fd", "")
        struct {
            nullable..opaque_p("handle", "")
            nullable..opaque_const_p("name", "")
        }("win32", "")
        nullable..opaque_const_p("nvSciBufObject", "");
    }("handle", "")
    unsigned_long_long("size", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_MEMORY_BUFFER_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_BUFFER_DESC") {
    unsigned_long_long("offset", "")
    unsigned_long_long("size", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC") {
    unsigned_long_long("offset", "")
    CUDA_ARRAY3D_DESCRIPTOR("arrayDesc", "")
    unsigned_int("numLevels", "")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC") {
    CUexternalSemaphoreHandleType("type", "")
    union {
        int("fd", "")
        struct {
            nullable..opaque_p("handle", "")
            nullable..opaque_const_p("name", "")
        }("win32", "")
        nullable..opaque_const_p("nvSciSyncObj", "");
    }("handle", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS") {
    struct {
        struct {
            unsigned_long_long("value", "")
        }("fence", "")
        union {
            nullable..opaque_p("fence", "")
            unsigned_long_long("reserved", "")
        }("nvSciSync", "")
        struct {
            unsigned_long_long("key", "")
        }("keyedMutex", "")
        unsigned_int("reserved", "")[12]
    }("params", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS") {
    struct {
        struct {
            unsigned_long_long("value", "")
        }("fence", "")
        union {
            nullable..opaque_p("fence", "")
            unsigned_long_long("reserved", "")
        }("nvSciSync", "")
        struct {
            unsigned_long_long("key", "")
            unsigned_int("timeoutMs", "")
        }("keyedMutex", "")
        unsigned_int("reserved", "")[10]
    }("params", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXT_SEM_SIGNAL_NODE_PARAMS = struct(Module.CUDA, "CUDA_EXT_SEM_SIGNAL_NODE_PARAMS") {
    CUexternalSemaphore.p("extSemArray", "")
    CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.const.p("paramsArray", "")
    AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", "")
}

val CUDA_EXT_SEM_WAIT_NODE_PARAMS = struct(Module.CUDA, "CUDA_EXT_SEM_WAIT_NODE_PARAMS") {
    CUexternalSemaphore.p("extSemArray", "")
    CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.const.p("paramsArray", "")
    AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", "")
}

val CUarrayMapInfo = struct(Module.CUDA, "CUarrayMapInfo") {
    CUresourcetype("resourceType", "")
    union {
        nullable..CUmipmappedArray("mipmap", "")
        nullable..CUarray("array", "")
    }("resource", "")
    CUarraySparseSubresourceType("subresourceType", "")
    union {
        struct {
            unsigned_int("level", "")
            unsigned_int("layer", "")
            unsigned_int("offsetX", "")
            unsigned_int("offsetY", "")
            unsigned_int("offsetZ", "")
            unsigned_int("extentWidth", "")
            unsigned_int("extentHeight", "")
            unsigned_int("extentDepth", "")
        }("sparseLevel", "")
        struct {
            unsigned_int("layer", "")
            unsigned_long_long("offset", "")
            unsigned_long_long("size", "")
        }("miptail", "")
    }("subresource", "")
    CUmemOperationType("memOperationType", "")
    CUmemHandleType("memHandleType", "")
    union {
        CUmemGenericAllocationHandle("memHandle", "")
    }("memHandle", "")
    unsigned_long_long("offset", "")
    unsigned_int("deviceBitMask", "")
    unsigned_int("flags", "")
    unsigned_int("reserved", "")[2]
}

val CUmemLocation = struct(Module.CUDA, "CUmemLocation") {
    CUmemLocationType("type", "")
    int("id", "")
}

val CUmemAllocationProp = struct(Module.CUDA, "CUmemAllocationProp") {
    CUmemAllocationType("type", "")
    CUmemAllocationHandleType("requestedHandleTypes", "")
    CUmemLocation("location", "")
    nullable..opaque_p("win32HandleMetaData", "")
    struct {
        unsigned_char("compressionType", "")
        unsigned_char("gpuDirectRDMACapable", "")
        unsigned_short("usage", "")
        unsigned_char("reserved", "")[4]
    }("allocFlags", "")
}

val CUmulticastObjectProp = struct(Module.CUDA, "CUmulticastObjectProp") {
    unsigned_int("numDevices", "")
    size_t("size", "")
    unsigned_long_long("handleTypes", "")
    unsigned_long_long("flags", "")
}

val CUmemAccessDesc = struct(Module.CUDA, "CUmemAccessDesc") {
    CUmemLocation("location", "")
    CUmemAccess_flags("flags", "")
}

val CUgraphExecUpdateResultInfo = struct(Module.CUDA, "CUgraphExecUpdateResultInfo", mutable = false) {
    CUgraphExecUpdateResult("result", "")
    nullable..CUgraphNode("errorNode", "")
    nullable..CUgraphNode("errorFromNode", "")
}

val CUmemPoolProps = struct(Module.CUDA, "CUmemPoolProps") {
    CUmemAllocationType("allocType", "")
    CUmemAllocationHandleType("handleTypes", "")
    CUmemLocation("location", "")
    nullable..opaque_p("win32SecurityAttributes", "")
    unsigned_char("reserved", "")[64]
}

val CUmemPoolPtrExportData = struct(Module.CUDA, "CUmemPoolPtrExportData") {
    unsigned_char("reserved", "")[64]
}

val CUDA_MEM_ALLOC_NODE_PARAMS = struct(Module.CUDA, "CUDA_MEM_ALLOC_NODE_PARAMS") {
    CUmemPoolProps("poolProps", "")
    CUmemAccessDesc.const.p("accessDescs", "")
    AutoSize("accessDescs")..size_t("accessDescCount", "")
    size_t("bytesize", "")
    nullable..CUdeviceptr("dptr", "")
}

val CUstreamBatchMemOpParams = union(Module.CUDA, "CUstreamBatchMemOpParams") {
    CUstreamBatchMemOpType("operation", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        nullable..CUdeviceptr("address", "")
        union {
            cuuint32_t("value", "")
            cuuint64_t("value64", "")
        }
        unsigned_int("flags", "")
        nullable..CUdeviceptr("alias", "")
    }("waitValue", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        nullable..CUdeviceptr("address", "")
        union {
            cuuint32_t("value", "")
            cuuint64_t("value64", "")
        }
        unsigned_int("flags", "")
        nullable..CUdeviceptr("alias", "")
    }("writeValue", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        unsigned_int("flags", "")
    }("flushRemoteWrites", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        unsigned_int("flags", "")
    }("memoryBarrier", "")
    cuuint64_t("pad", "")[6]
}

val CUDA_BATCH_MEM_OP_NODE_PARAMS = struct(Module.CUDA, "CUDA_BATCH_MEM_OP_NODE_PARAMS") {
    CUcontext("ctx", "")
    AutoSize("paramArray")..unsigned_int("count", "")
    nullable..CUstreamBatchMemOpParams.p("paramArray", "")
    unsigned_int("flags", "")
}

val CUDA_LAUNCH_PARAMS = struct(Module.CUDA, "CUDA_LAUNCH_PARAMS") {
    CUfunction("function", "")
    unsigned_int("gridDimX", "")
    unsigned_int("gridDimY", "")
    unsigned_int("gridDimZ", "")
    unsigned_int("blockDimX", "")
    unsigned_int("blockDimY", "")
    unsigned_int("blockDimZ", "")
    unsigned_int("sharedMemBytes", "")
    nullable..CUstream("hStream", "")
    nullable..void.p.p("kernelParams", "")
}

val CUaccessPolicyWindow = struct(Module.CUDA, "CUaccessPolicyWindow") {
    opaque_p("base_ptr", "")
    size_t("num_bytes", "")
    float("hitRatio", "")
    CUaccessProperty("hitProp", "")
    CUaccessProperty("missProp", "")
}

val CUDA_KERNEL_NODE_PARAMS = struct(Module.CUDA, "CUDA_KERNEL_NODE_PARAMS") {
    nullable..CUfunction("func", "")
    unsigned_int("gridDimX", "")
    unsigned_int("gridDimY", "")
    unsigned_int("gridDimZ", "")
    unsigned_int("blockDimX", "")
    unsigned_int("blockDimY", "")
    unsigned_int("blockDimZ", "")
    unsigned_int("sharedMemBytes", "")
    nullable..void.p.p("kernelParams", "")
    nullable..void.p.p("extra", "")
}

val CUDA_KERNEL_NODE_PARAMS_v2 = struct(Module.CUDA, "CUDA_KERNEL_NODE_PARAMS_v2") {
    nullable..CUfunction("func", "")
    unsigned_int("gridDimX", "")
    unsigned_int("gridDimY", "")
    unsigned_int("gridDimZ", "")
    unsigned_int("blockDimX", "")
    unsigned_int("blockDimY", "")
    unsigned_int("blockDimZ", "")
    unsigned_int("sharedMemBytes", "")
    nullable..void.p.p("kernelParams", "")
    nullable..void.p.p("extra", "")
    nullable..CUkernel("kern", "")
    nullable..CUcontext("ctx", "")
}

val CUDA_MEMSET_NODE_PARAMS = struct(Module.CUDA, "CUDA_MEMSET_NODE_PARAMS") {
    CUdeviceptr("dst", "")
    size_t("pitch", "")
    unsigned_int("value", "")
    unsigned_int("elementSize", "")
    size_t("width", "")
    size_t("height", "")
}

val CUDA_HOST_NODE_PARAMS = struct(Module.CUDA, "CUDA_HOST_NODE_PARAMS") {
    CUhostFn("fn", "")
    nullable..opaque_p("userData", "")
}

val CUDA_GRAPH_INSTANTIATE_PARAMS = struct(Module.CUDA, "CUDA_GRAPH_INSTANTIATE_PARAMS", mutable = false) {
    cuuint64_t("flags", "")
    nullable..CUstream("hUploadStream", "")
    nullable..CUgraphNode("hErrNode_out", "")
    CUgraphInstantiateResult("result_out", "")
}

val CUlaunchMemSyncDomainMap = struct(Module.CUDA, "CUlaunchMemSyncDomainMap") {
    unsigned_char("default_", "")
    unsigned_char("remote", "")
}

val CUlaunchAttributeValue = union(Module.CUDA, "CUlaunchAttributeValue") {
    char("pad", "")[64]
    CUaccessPolicyWindow("accessPolicyWindow", "")
    int("cooperative", "")
    CUsynchronizationPolicy("syncPolicy", "")
    struct {
        unsigned_int("x", "")
        unsigned_int("y", "")
        unsigned_int("z", "")
    }("clusterDim", "")
    CUclusterSchedulingPolicy("clusterSchedulingPolicyPreference", "")
    int("programmaticStreamSerializationAllowed", "")
    struct {
        CUevent("event", "")
        int("flags", "")
        int("triggerAtBlockStart", "")
    }("programmaticEvent", "")
    int("priority", "")
    CUlaunchMemSyncDomainMap("memSyncDomainMap", "")
    CUlaunchMemSyncDomain("memSyncDomain", "")
}

val CUlaunchAttribute = struct(Module.CUDA, "CUlaunchAttribute") {
    CUlaunchAttributeID("id", "")
    char("pad", "")[8 - 4]
    CUlaunchAttributeValue("value", "")
}

val CUlaunchConfig = struct(Module.CUDA, "CUlaunchConfig") {
    unsigned_int("gridDimX", "")
    unsigned_int("gridDimY", "")
    unsigned_int("gridDimZ", "")
    unsigned_int("blockDimX", "")
    unsigned_int("blockDimY", "")
    unsigned_int("blockDimZ", "")
    unsigned_int("sharedMemBytes", "")
    nullable..CUstream("hStream", "")
    nullable..CUlaunchAttribute.p("attrs", "")
    AutoSize("attrs")..unsigned_int("numAttrs", "")
}

val CUkernelNodeAttrValue = union(Module.CUDA, "CUkernelNodeAttrValue") {
    CUaccessPolicyWindow("accessPolicyWindow", "")
    int("cooperative", "")
}

val CUstreamAttrValue = union(Module.CUDA, "CUstreamAttrValue") {
    CUaccessPolicyWindow("accessPolicyWindow", "")
    CUsynchronizationPolicy("syncPolicy", "")
}

val CUexecAffinitySmCount = struct(Module.CUDA, "CUexecAffinitySmCount") {
    unsigned_int("val", "")
}

val CUexecAffinityParam = struct(Module.CUDA, "CUexecAffinityParam") {
    CUexecAffinityType("type", "")
    union {
        CUexecAffinitySmCount("smCount", "")
    }("param", "")
}

val CUDA_RESOURCE_DESC = struct(Module.CUDA, "CUDA_RESOURCE_DESC") {
    CUresourcetype("resType", "")
    union {
        struct {
            nullable..CUarray("hArray", "")
        }("array", "")
        struct {
            nullable..CUmipmappedArray("hMipmappedArray", "")
        }("mipmap", "")
        struct {
            nullable..CUdeviceptr("devPtr", "")
            CUarray_format("format", "")
            unsigned_int("numChannels", "")
            size_t("sizeInBytes", "")
        }("linear", "")
        struct {
            nullable..CUdeviceptr("devPtr", "")
            CUarray_format("format", "")
            unsigned_int("numChannels", "")
            size_t("width", "")
            size_t("height", "")
            size_t("pitchInBytes", "")
        }("pitch2D", "")
        struct {
            int("reserved", "")[32]
        }("reserved", "")
    }("res", "")

    unsigned_int("flags", "")
}

val CUDA_TEXTURE_DESC = struct(Module.CUDA, "CUDA_TEXTURE_DESC") {
    CUaddress_mode("addressMode", "")[3]
    CUfilter_mode("filterMode", "")
    unsigned_int("flags", "")
    unsigned_int("maxAnisotropy", "")
    CUfilter_mode("mipmapFilterMode", "")
    float("mipmapLevelBias", "")
    float("minMipmapLevelClamp", "")
    float("maxMipmapLevelClamp", "")
    float("borderColor", "")[4]
    int("reserved", "")[12]
}

val CUDA_RESOURCE_VIEW_DESC = struct(Module.CUDA, "CUDA_RESOURCE_VIEW_DESC") {
    CUresourceViewFormat("format", "")
    size_t("width", "")
    size_t("height", "")
    size_t("depth", "")
    unsigned_int("firstMipmapLevel", "")
    unsigned_int("lastMipmapLevel", "")
    unsigned_int("firstLayer", "")
    unsigned_int("lastLayer", "")
    unsigned_int("reserved", "")[16]
}

val CUtensorMap = struct(Module.CUDA, "CUtensorMap") {
    javaImport("static org.lwjgl.cuda.CU.*")
    alignas(64)

    cuuint64_t("opaque", "")["CU_TENSOR_MAP_NUM_QWORDS"]
}

val CUDA_POINTER_ATTRIBUTE_P2P_TOKENS = struct(Module.CUDA, "CUDA_POINTER_ATTRIBUTE_P2P_TOKENS") {
    unsigned_long_long("p2pToken", "")
    unsigned_int("vaSpaceToken", "")
}

val CUdevprop = struct(Module.CUDA, "CUdevprop") {
    int("maxThreadsPerBlock", "")
    int("maxThreadsDim", "")[3]
    int("maxGridSize", "")[3]
    int("sharedMemPerBlock", "")
    int("totalConstantMemory", "")
    int("SIMDWidth", "")
    int("memPitch", "")
    int("regsPerBlock", "")
    int("clockRate", "")
    int("textureAlign", "")
}

// GL Interop Types

val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)

val CUGLDeviceList = "CUGLDeviceList".enumType

val HGPUNV = "HGPUNV".handle