/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda

import org.lwjgl.generator.*

val NVCUDA_BINDING = simpleBinding(Module.CUDA, libraryName = "NVCUDA", libraryExpression = "Configuration.CUDA_LIBRARY_NAME, \"nvcuda\"")
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
val CUdevice_attribute = "CUdevice_attribute".enumType
val CUdevice_P2PAttribute = "CUdevice_P2PAttribute".enumType
val CUexecAffinityType = "CUexecAffinityType".enumType
val CUexternalMemoryHandleType = "CUexternalMemoryHandleType".enumType
val CUexternalSemaphoreHandleType = "CUexternalSemaphoreHandleType".enumType
val CUfilter_mode = "CUfilter_mode".enumType
val CUflushGPUDirectRDMAWritesScope = "CUflushGPUDirectRDMAWritesScope".enumType
val CUflushGPUDirectRDMAWritesTarget = "CUflushGPUDirectRDMAWritesTarget".enumType
val CUfunc_cache = "CUfunc_cache".enumType
val CUfunction_attribute = "CUfunction_attribute".enumType
val CUgraphMem_attribute = "CUgraphMem_attribute".enumType
val CUgraphNodeType = "CUgraphNodeType".enumType
val CUgraphExecUpdateResult = "CUgraphExecUpdateResult".enumType
val CUjit_option = "CUjit_option".enumType
val CUjitInputType = "CUjitInputType".enumType
val CUkernelNodeAttrID = "CUkernelNodeAttrID".enumType
val CUlimit = "CUlimit".enumType
val CUmemAccess_flags = "CUmemAccess_flags".enumType
val CUmemAllocationGranularity_flags = "CUmemAllocationGranularity_flags".enumType
val CUmemAllocationHandleType = "CUmemAllocationHandleType".enumType
val CUmemAllocationType = "CUmemAllocationType".enumType
val CUmemHandleType = "CUmemHandleType".enumType
val CUmemLocationType = "CUmemLocationType".enumType
val CUmemOperationType = "CUmemOperationType".enumType
val CUmemPool_attribute = "CUmemPool_attribute".enumType
val CUmem_advise = "CUmem_advise".enumType
val CUmem_range_attribute = "CUmem_range_attribute".enumType
val CUmemorytype = "CUmemorytype".enumType
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

val CUstreamCallback = Module.CUDA.callback {
    void(
        "CUstreamCallback",
        "CUDA stream callback.",

        nullable..CUstream("hStream", "the stream the callback was added to, as passed to #StreamAddCallback(). May be #NULL."),
        CUresult("status", "#CUDA_SUCCESS or any persistent error on the stream"),
        opaque_p("userData", "user parameter provided at registration")
    ) {
        documentation = "Instances of this interface may be passed to the #StreamAddCallback() method."
    }
}

val CUhostFn = Module.CUDA.callback {
    void(
        "CUhostFn",
        "CUDA host function.",

        opaque_p("userData", "argument value passed to the function")
    ) {
        documentation = "Instances of this interface may be passed to the #LaunchHostFunc() method."
    }
}

val CUoccupancyB2DSize = Module.CUDA.callback {
    size_t(
        "CUoccupancyB2DSize",
        "Block size to per-block dynamic shared memory mapping for a certain kernel.",

        int("blockSize", "block size of the kernel"),

        returnDoc = "the dynamic shared memory needed by a block"
    ) {
        documentation =
            "Instances of this interface may be passed to the #OccupancyMaxPotentialBlockSize() and #OccupancyMaxPotentialBlockSizeWithFlags() methods."
    }
}

val CUuuid = struct(Module.CUDA, "CUuuid", mutable = false) {
    documentation = "CUDA definition of UUID"
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
    documentation = "2D memory copy parameters."

    size_t("srcXInBytes", "Source X in bytes")
    size_t("srcY", "Source Y")
    CUmemorytype("srcMemoryType", "Source memory type (host, device, array)")
    nullable..void.const.p("srcHost", "Source host pointer")
    nullable..CUdeviceptr("srcDevice", "Source device pointer")
    nullable..CUarray("srcArray", "Source array reference")
    size_t("srcPitch", "Source pitch (ignored when src is array)")
    size_t("dstXInBytes", "Destination X in bytes")
    size_t("dstY", "Destination Y")
    CUmemorytype("dstMemoryType", "Destination memory type (host, device, array)")
    nullable..void.p("dstHost", "Destination host pointer")
    nullable..CUdeviceptr("dstDevice", "Destination device pointer")
    nullable..CUarray("dstArray", "Destination array reference")
    size_t("dstPitch", "Destination pitch (ignored when dst is array)")
    size_t("WidthInBytes", "Width of 2D memory copy in bytes")
    size_t("Height", "Height of 2D memory copy")
}

val CUDA_MEMCPY3D = struct(Module.CUDA, "CUDA_MEMCPY3D") {
    documentation = "3D memory copy parameters."

    size_t("srcXInBytes", "Source X in bytes")
    size_t("srcY", "Source Y")
    size_t("srcZ", "Source Z")
    size_t("srcLOD", "Source LOD")
    CUmemorytype("srcMemoryType", "Source memory type (host, device, array)")
    nullable..void.const.p("srcHost", "Source host pointer")
    nullable..CUdeviceptr("srcDevice", "Source device pointer")
    nullable..CUarray("srcArray", "Source array reference")
    nullable..opaque_p("reserved0", "Must be #NULL")
    size_t("srcPitch", "Source pitch (ignored when src is array)")
    size_t("srcHeight", "Source height (ignored when src is array; may be 0 if Depth==1)")
    size_t("dstXInBytes", "Destination X in bytes")
    size_t("dstY", "Destination Y")
    size_t("dstZ", "Destination Z")
    size_t("dstLOD", "Destination LOD")
    CUmemorytype("dstMemoryType", "Destination memory type (host, device, array)")
    nullable..void.p("dstHost", "Destination host pointer")
    nullable..CUdeviceptr("dstDevice", "Destination device pointer")
    nullable..CUarray("dstArray", "Destination array reference")
    nullable..opaque_p("reserved1", "Must be #NULL")
    size_t("dstPitch", "Destination pitch (ignored when dst is array)")
    size_t("dstHeight", "Destination height (ignored when dst is array; may be 0 if Depth==1)")
    size_t("WidthInBytes", "Width of 3D memory copy in bytes")
    size_t("Height", "Height of 3D memory copy")
    size_t("Depth", "Depth of 3D memory copy")
}

val CUDA_MEMCPY3D_PEER = struct(Module.CUDA, "CUDA_MEMCPY3D_PEER") {
    documentation = "3D memory cross-context copy parameters."

    size_t("srcXInBytes", "Source X in bytes")
    size_t("srcY", "Source Y")
    size_t("srcZ", "Source Z")
    size_t("srcLOD", "Source LOD")
    CUmemorytype("srcMemoryType", "Source memory type (host, device, array)")
    nullable..void.const.p("srcHost", "Source host pointer")
    nullable..CUdeviceptr("srcDevice", "Source device pointer")
    nullable..CUarray("srcArray", "Source array reference")
    nullable..CUcontext("srcContext", "Source context (ignored with {@code srcMemoryType} is #MEMORYTYPE_ARRAY)")
    size_t("srcPitch", "Source pitch (ignored when src is array)")
    size_t("srcHeight", "Source height (ignored when src is array; may be 0 if Depth==1)")
    size_t("dstXInBytes", "Destination X in bytes")
    size_t("dstY", "Destination Y")
    size_t("dstZ", "Destination Z")
    size_t("dstLOD", "Destination LOD")
    CUmemorytype("dstMemoryType", "Destination memory type (host, device, array)")
    nullable..void.p("dstHost", "Destination host pointer")
    nullable..CUdeviceptr("dstDevice", "Destination device pointer")
    nullable..CUarray("dstArray", "Destination array reference")
    nullable..CUcontext("dstContext", "Destination context (ignored with {@code dstMemoryType} is #MEMORYTYPE_ARRAY)")
    size_t("dstPitch", "Destination pitch (ignored when dst is array)")
    size_t("dstHeight", "Destination height (ignored when dst is array; may be 0 if Depth==1)")
    size_t("WidthInBytes", "Width of 3D memory copy in bytes")
    size_t("Height", "Height of 3D memory copy")
    size_t("Depth", "Depth of 3D memory copy")
}

val CUDA_ARRAY_DESCRIPTOR = struct(Module.CUDA, "CUDA_ARRAY_DESCRIPTOR") {
    documentation = "Array descriptor."

    size_t("Width", "Width of array")
    size_t("Height", "Height of array")
    CUarray_format("Format", "Array format")
    unsigned_int("NumChannels", "Channels per array element")
}

val CUDA_ARRAY3D_DESCRIPTOR = struct(Module.CUDA, "CUDA_ARRAY3D_DESCRIPTOR") {
    documentation = "3D array descriptor."

    size_t("Width", "Width of 3D array")
    size_t("Height", "Height of 3D array")
    size_t("Depth", "Depth of 3D array")
    CUarray_format("Format", "Array format")
    unsigned_int("NumChannels", "Channels per array element")
    unsigned_int("Flags", "Flags")
}

val CUDA_ARRAY_SPARSE_PROPERTIES = struct(Module.CUDA, "CUDA_ARRAY_SPARSE_PROPERTIES") {
    documentation = "CUDA array sparse properties."

    struct {
        unsigned_int("width", "width of sparse tile in elements")
        unsigned_int("height", "height of sparse tile in elements")
        unsigned_int("depth", "depth of sparse tile in elements")
    }("tileExtent", "")
    unsigned_int("miptailFirstLevel", "first mip level at which the mip tail begins")
    unsigned_long_long("miptailSize", "total size of the mip tail")
    unsigned_int("flags", "flags will either be zero or #ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL")
    unsigned_int("reserved", "")[4]
}

val CUDA_EXTERNAL_MEMORY_HANDLE_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_HANDLE_DESC") {
    documentation = "External memory handle descriptor."

    CUexternalMemoryHandleType("type", "Type of the handle")
    union {
        int("fd", "File descriptor referencing the memory object. Valid when type is ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD")
        struct {
            nullable..opaque_p("handle", "Valid NT handle. Must be NULL if 'name' is non-NULL")
            nullable..opaque_const_p("name", "Name of a valid memory object. Must be NULL if 'handle' is non-NULL.")
        }(
            "win32",
            """
            Win32 handle referencing the semaphore object. Valid when type is one of the following:
            ${ul(
                "#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32",
                "#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT",
                "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP",
                "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE",
                "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE",
                "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT"
            )}
             
             Exactly one of {@code handle} and {@code name} must be non-#NULL. If type is one of the following:
             ${ul(
                "#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT",
                "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT"
             )}
             then {@code name} must be #NULL.
            """
        )
        nullable..opaque_const_p("nvSciBufObject", "A handle representing an {@code NvSciBuf} Object. Valid when type is #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF");
    }("handle", "")
    unsigned_long_long("size", "Size of the memory allocation")
    unsigned_int("flags", "Flags must either be zero or #CUDA_EXTERNAL_MEMORY_DEDICATED")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_MEMORY_BUFFER_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_BUFFER_DESC") {
    documentation = "External memory buffer descriptor."

    unsigned_long_long("offset", "Offset into the memory object where the buffer's base is")
    unsigned_long_long("size", "Size of the buffer")
    unsigned_int("flags", "Flags reserved for future use. Must be zero.")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC") {
    documentation = "External memory mipmap descriptor."

    unsigned_long_long("offset", "Offset into the memory object where the base level of the mipmap chain is.")
    CUDA_ARRAY3D_DESCRIPTOR("arrayDesc", "Format, dimension and type of base level of the mipmap chain")
    unsigned_int("numLevels", "Total number of levels in the mipmap chain")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC") {
    documentation = "External semaphore handle descriptor."

    CUexternalSemaphoreHandleType("type", "type of the handle")
    union {
        int(
            "fd",
            """
            File descriptor referencing the semaphore object. Valid when type is one of the following:
            ${ul(
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD"
            )}
            """
        )
        struct {
            nullable..opaque_p("handle", "Valid NT handle. Must be NULL if 'name' is non-NULL")
            nullable..opaque_const_p("name", "Name of a valid synchronization primitive. Must be NULL if 'handle' is non-NULL.")
        }(
            "win32",
            """
            Win32 handle referencing the semaphore object. Valid when type is one of the following:
            ${ul(
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32"
            )}
            
            Exactly one of {@code handle} and {@code name} must be non-#NULL. If type is one of the following:
            ${ul(
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT",
                "#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT"
            )}
            then {@code name} must be #NULL.
            """
        )
        nullable..opaque_const_p("nvSciSyncObj", "Valid {@code NvSciSyncObj}. Must be non #NULL");
    }("handle", "")
    unsigned_int("flags", "Flags reserved for the future. Must be zero.")
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS") {
    documentation = "External semaphore signal parameters."

    struct {
        struct {
            unsigned_long_long("value", "value of fence to be signaled")
        }("fence", "")
        union {
            nullable..opaque_p(
                "fence",
                "pointer to {@code NvSciSyncFence}. Valid if {@code CUexternalSemaphoreHandleType} is of type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC."
            )
            unsigned_long_long("reserved", "")
        }("nvSciSync", "")
        struct {
            unsigned_long_long("key", "value of key to release the mutex with")
        }("keyedMutex", "")
        unsigned_int("reserved", "")("params", "")[12]
    }("params", "")
    unsigned_int(
        "flags",
        """
        only when {@code CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS} is used to signal a {@code CUexternalSemaphore} of type
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC, the valid flag is #CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC which indicates that while signaling
        the {@code CUexternalSemaphore}, no memory synchronization operations should be performed for any external memory object imported as
        #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF. For all other types of {@code CUexternalSemaphore}, {@code flags} must be zero.
        """
    )
    unsigned_int("reserved", "")[16]
}

val CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS") {
    documentation = "External semaphore wait parameters."

    struct {
        struct {
            unsigned_long_long("value", "value of fence to be waited on")
        }("fence", "")
        union {
            nullable..opaque_p("fence", "")
            unsigned_long_long("reserved", "")
        }("nvSciSync", "")
        struct {
            unsigned_long_long("key", "value of key to acquire the mutex with")
            unsigned_int("timeoutMs", "timeout in milliseconds to wait to acquire the mutex")
        }("keyedMutex", "")
        unsigned_int("reserved", "")("params", "")[10]
    }("params", "")
    unsigned_int(
        "flags",
        """
        only when {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} is used to wait on a {@code CUexternalSemaphore} of type
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC, the valid flag is #CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC which indicates that while waiting for
        the {@code CUexternalSemaphore}, no memory synchronization operations should be performed for any external memory object imported as
        #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF. For all other types of {@code CUexternalSemaphore}, {@code flags} must be zero.
        """
    )
    unsigned_int("reserved", "")[16]
}

val CUDA_EXT_SEM_SIGNAL_NODE_PARAMS = struct(Module.CUDA, "CUDA_EXT_SEM_SIGNAL_NODE_PARAMS") {
    documentation = "Semaphore signal node parameters."

    CUexternalSemaphore.p("extSemArray", "array of external semaphore handles")
    CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.const.p("paramsArray", "array of external semaphore signal parameters")
    AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", "number of handles and parameters supplied in extSemArray and paramsArray")
}

val CUDA_EXT_SEM_WAIT_NODE_PARAMS = struct(Module.CUDA, "CUDA_EXT_SEM_WAIT_NODE_PARAMS") {
    documentation = "Semaphore wait node parameters"

    CUexternalSemaphore.p("extSemArray", "array of external semaphore handles")
    CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.const.p("paramsArray", "array of external semaphore wait parameters")
    AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", "number of handles and parameters supplied in extSemArray and paramsArray")
}

val CUarrayMapInfo = struct(Module.CUDA, "CUarrayMapInfo") {
    documentation = "Specifies the CUDA array or CUDA mipmapped array memory mapping information."

    CUresourcetype("resourceType", "resource type")
    union {
        nullable..CUmipmappedArray("mipmap", "")
        nullable..CUarray("array", "")
    }("resource", "")
    CUarraySparseSubresourceType("subresourceType", "sparse subresource type")
    union {
        struct {
            unsigned_int("level", "for CUDA mipmapped arrays must a valid mipmap level. For CUDA arrays must be zero")
            unsigned_int("layer", "for CUDA layered arrays must be a valid layer index. Otherwise, must be zero")
            unsigned_int("offsetX", "starting X offset in elements")
            unsigned_int("offsetY", "starting Y offset in elements")
            unsigned_int("offsetZ", "starting Z offset in elements")
            unsigned_int("extentWidth", "width in elements")
            unsigned_int("extentHeight", "height in elements")
            unsigned_int("extentDepth", "depth in elements")
        }("sparseLevel", "")
        struct {
            unsigned_int("layer", "for CUDA layered arrays must be a valid layer index. Otherwise, must be zero")
            unsigned_long_long("offset", "offset within mip tail")
            unsigned_long_long("size", "extent in bytes")
        }("miptail", "")
    }("subresource", "")
    CUmemOperationType("memOperationType", "memory operation type")
    CUmemHandleType("memHandleType", "memory handle type")
    union {
        CUmemGenericAllocationHandle("memHandle", "")
    }("memHandle", "")
    unsigned_long_long("offset", "offset within the memory")
    unsigned_int("deviceBitMask", "device ordinal bit mask")
    unsigned_int("flags", "flags for future use, must be zero now")
    unsigned_int("reserved", "reserved for future use, must be zero now")[2]
}

val CUmemLocation = struct(Module.CUDA, "CUmemLocation") {
    documentation = "Specifies a memory location."

    CUmemLocationType("type", "specifies the location type, which modifies the meaning of id")
    int("id", "identifier for a given this location's {@code CUmemLocationType}")
}

val CUmemAllocationProp = struct(Module.CUDA, "CUmemAllocationProp") {
    documentation = "Specifies the allocation properties for a allocation."

    CUmemAllocationType("type", "allocation type")
    CUmemAllocationHandleType("requestedHandleTypes", "requested {@code CUmemAllocationHandleType}")
    CUmemLocation("location", "location of allocation")
    nullable..opaque_p(
        "win32HandleMetaData",
        """
        windows-specific {@code POBJECT_ATTRIBUTES} required when #MEM_HANDLE_TYPE_WIN32 is specified. This object atributes structure includes security
        attributes that define the scope of which exported allocations may be tranferred to other processes. In all other cases, this field is required to be
        zero.
        """
    )
    struct {
        unsigned_char(
            "compressionType",
            """
            allocation hint for requesting compressible memory.
            
            On devices that support Compute Data Compression, compressible memory can be used to accelerate accesses to data with unstructured sparsity and
            other compressible data patterns. Applications are expected to query allocation property of the handle obtained with #MemCreate() using
            #MemGetAllocationPropertiesFromHandle() to validate if the obtained allocation is compressible or not. Note that compressed memory may not be
            mappable on all devices.
            """
        )
        unsigned_char("gpuDirectRDMACapable", "")
        unsigned_short("usage", "bitmask indicating intended usage for this allocation")
        unsigned_char("reserved", "")[4]
    }("allocFlags", "")
}

val CUmemAccessDesc = struct(Module.CUDA, "CUmemAccessDesc") {
    documentation = "Memory access descriptor."

    CUmemLocation("location", "location on which the request is to change it's accessibility")
    CUmemAccess_flags("flags", "{@code CUmemProt} accessibility flags to set on the request")
}

val CUmemPoolProps = struct(Module.CUDA, "CUmemPoolProps") {
    documentation = "Specifies the properties of allocations made from the pool."

    CUmemAllocationType("allocType", "allocation type. Currently must be specified as #MEM_ALLOCATION_TYPE_PINNED.")
    CUmemAllocationHandleType("handleTypes", "handle types that will be supported by allocations from the pool")
    CUmemLocation("location", "location where allocations should reside")
    nullable..opaque_p(
        "win32SecurityAttributes",
        """
        windows-specific {@code LPSECURITYATTRIBUTES} required when #MEM_HANDLE_TYPE_WIN32 is specified. This security attribute defines the scope of which
        exported allocations may be tranferred to other processes. In all other cases, this field is required to be zero.
        """
    )
    unsigned_char("reserved", "reserved for future use, must be 0")[64]
}

val CUmemPoolPtrExportData = struct(Module.CUDA, "CUmemPoolPtrExportData") {
    documentation = "Opaque data for exporting a pool allocation."

    unsigned_char("reserved", "")[64]
}

val CUDA_MEM_ALLOC_NODE_PARAMS = struct(Module.CUDA, "CUDA_MEM_ALLOC_NODE_PARAMS") {
    documentation = "Memory allocation node parameters."

    CUmemPoolProps(
        "poolProps",
        """
        in: location where the allocation should reside (specified in {@code location}). {@code handleTypes} must be #MEM_HANDLE_TYPE_NONE. IPC is not
        supported.
        """
    )
    CUmemAccessDesc.const.p("accessDescs", "in: array of memory access descriptors. Used to describe peer GPU access")
    AutoSize("accessDescs")..size_t("accessDescCount", "in: number of memory access descriptors.  Must not exceed the number of GPUs.")
    size_t("bytesize", "in: size in bytes of the requested allocation")
    nullable..CUdeviceptr("dptr", "out: address of the allocation returned by CUDA")
}

val CUstreamBatchMemOpParams = union(Module.CUDA, "CUstreamBatchMemOpParams") {
    documentation = "Per-operation parameters for #StreamBatchMemOp()."

    CUstreamBatchMemOpType("operation", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        nullable..CUdeviceptr("address", "")
        union {
            cuuint32_t("value", "")
            cuuint64_t("value64", "")
        }
        unsigned_int("flags", "")
        nullable..CUdeviceptr("alias", "For driver internal use. Initial value is unimportant.")
    }("waitValue", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        nullable..CUdeviceptr("address", "")
        union {
            cuuint32_t("value", "")
            cuuint64_t("value64", "")
        }
        unsigned_int("flags", "")
        nullable..CUdeviceptr("alias", "For driver internal use. Initial value is unimportant.")
    }("writeValue", "")
    struct {
        CUstreamBatchMemOpType("operation", "")
        unsigned_int("flags", "")
    }("flushRemoteWrites", "")
    cuuint64_t("pad", "")[6]
}

val CUDA_LAUNCH_PARAMS = struct(Module.CUDA, "CUDA_LAUNCH_PARAMS") {
    documentation = "Kernel launch parameters."

    CUfunction("function", "Kernel to launch")
    unsigned_int("gridDimX", "Width of grid in blocks")
    unsigned_int("gridDimY", "Height of grid in blocks")
    unsigned_int("gridDimZ", "Depth of grid in blocks")
    unsigned_int("blockDimX", "X dimension of each thread block")
    unsigned_int("blockDimY", "Y dimension of each thread block")
    unsigned_int("blockDimZ", "Z dimension of each thread block")
    unsigned_int("sharedMemBytes", "Dynamic shared-memory size per thread block in bytes")
    nullable..CUstream("hStream", "Stream identifier")
    nullable..void.p.p("kernelParams", "Array of pointers to kernel parameters")
}

val CUaccessPolicyWindow = struct(Module.CUDA, "CUaccessPolicyWindow") {
    documentation =
        """
        Specifies an access policy for a window, a contiguous extent of memory beginning at {@code base_ptr} and ending at {@code base_ptr + num_bytes}.
        
        {@code num_bytes} is limited by #DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE. Partition into many segments and assign segments such that: sum of
        "hit segments" / window == approx. ratio. sum of "miss segments" / window == approx 1-ratio. Segments and ratio specifications are fitted to the
        capabilities of the architecture. Accesses in a hit segment apply the hitProp access policy. Accesses in a miss segment apply the missProp access
        policy.
        """

    opaque_p("base_ptr", "starting address of the access policy window. CUDA driver may align it.")
    size_t("num_bytes", "size in bytes of the window policy. CUDA driver may restrict the maximum size and alignment.")
    float("hitRatio", "specifies percentage of lines assigned {@code hitProp}, rest are assigned {@code missProp}")
    CUaccessProperty("hitProp", "{@code CUaccessProperty} set for hit")
    CUaccessProperty("missProp", "{@code CUaccessProperty} set for miss. Must be either #ACCESS_PROPERTY_NORMAL or #ACCESS_PROPERTY_STREAMING")
}

val CUDA_KERNEL_NODE_PARAMS = struct(Module.CUDA, "CUDA_KERNEL_NODE_PARAMS") {
    documentation = "GPU kernel node parameter."

    CUfunction("func", "Kernel to launch")
    unsigned_int("gridDimX", "Width of grid in blocks")
    unsigned_int("gridDimY", "Height of grid in blocks")
    unsigned_int("gridDimZ", "Depth of grid in blocks")
    unsigned_int("blockDimX", "X dimension of each thread block")
    unsigned_int("blockDimY", "Y dimension of each thread block")
    unsigned_int("blockDimZ", "Z dimension of each thread block")
    unsigned_int("sharedMemBytes", "Dynamic shared-memory size per thread block in bytes")
    nullable..void.p.p("kernelParams", "Array of pointers to kernel parameters")
    nullable..void.p.p("extra", "Extra options")
}

val CUDA_MEMSET_NODE_PARAMS = struct(Module.CUDA, "CUDA_MEMSET_NODE_PARAMS") {
    documentation = "Memset node parameters."

    CUdeviceptr("dst", "Destination device pointer")
    size_t("pitch", "Pitch of destination device pointer. Unused if height is 1")
    unsigned_int("value", "Value to be set")
    unsigned_int("elementSize", "Size of each element in bytes. Must be 1, 2, or 4.")
    size_t("width", "Width of the row in elements")
    size_t("height", "Number of rows")
}

val CUDA_HOST_NODE_PARAMS = struct(Module.CUDA, "CUDA_HOST_NODE_PARAMS") {
    documentation = "Host node parameters."

    CUhostFn("fn", "The function to call when the node executes")
    nullable..opaque_p("userData", "Argument to pass to the function")
}

val CUkernelNodeAttrValue = union(Module.CUDA, "CUkernelNodeAttrValue") {
    documentation = "Graph kernel node attributes union, used with #GraphKernelNodeSetAttribute()/#GraphKernelNodeGetAttribute()."

    CUaccessPolicyWindow("accessPolicyWindow", "attribute {@code CUaccessPolicyWindow}")
    int("cooperative", "nonzero indicates a cooperative kernel (see #LaunchCooperativeKernel())")
}

val CUstreamAttrValue = union(Module.CUDA, "CUstreamAttrValue") {
    documentation = "Stream attributes union, used with #StreamSetAttribute()/#StreamGetAttribute()."

    CUaccessPolicyWindow("accessPolicyWindow", "attribute ##CUaccessPolicyWindow")
    CUsynchronizationPolicy("syncPolicy", "value for #STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY")
}

val CUexecAffinitySmCount = struct(Module.CUDA, "CUexecAffinitySmCount") {
    documentation = "Value for #EXEC_AFFINITY_TYPE_SM_COUNT."

    unsigned_int("val", "the number of SMs the context is limited to use")
}

val CUexecAffinityParam = struct(Module.CUDA, "CUexecAffinityParam") {
    documentation = "Execution Affinity Parameters."

    CUexecAffinityType("type", "")
    union {
        CUexecAffinitySmCount("smCount", "value for #EXEC_AFFINITY_TYPE_SM_COUNT")
    }("param", "")
}

val CUDA_RESOURCE_DESC = struct(Module.CUDA, "CUDA_RESOURCE_DESC") {
    documentation = "CUDA Resource descriptor."

    CUresourcetype("resType", "Resource type")
    union {
        struct {
            nullable..CUarray("hArray", "CUDA array")
        }("array", "")
        struct {
            nullable..CUmipmappedArray("hMipmappedArray", "CUDA mipmapped array")
        }("mipmap", "")
        struct {
            nullable..CUdeviceptr("devPtr", "Device pointer")
            CUarray_format("format", "Array format")
            unsigned_int("numChannels", "Channels per array element")
            size_t("sizeInBytes", "Size in bytes")
        }("linear", "")
        struct {
            nullable..CUdeviceptr("devPtr", "Device pointer")
            CUarray_format("format", "Array format")
            unsigned_int("numChannels", "Channels per array element")
            size_t("width", "Width of the array in elements")
            size_t("height", "Height of the array in elements")
            size_t("pitchInBytes", "Pitch between two rows in bytes")
        }("pitch2D", "")
        struct {
            int("reserved", "")[32]
        }("reserved", "")
    }("res", "")

    unsigned_int("flags", "Flags (must be zero)")
}

val CUDA_TEXTURE_DESC = struct(Module.CUDA, "CUDA_TEXTURE_DESC") {
    documentation = "Texture descriptor."

    CUaddress_mode("addressMode", "Address modes")[3]
    CUfilter_mode("filterMode", "Filter mode")
    unsigned_int("flags", "Flags")
    unsigned_int("maxAnisotropy", "Maximum anisotropy ratio")
    CUfilter_mode("mipmapFilterMode", "Mipmap filter mode")
    float("mipmapLevelBias", "Mipmap level bias")
    float("minMipmapLevelClamp", "Mipmap minimum level clamp")
    float("maxMipmapLevelClamp", "Mipmap maximum level clamp")
    float("borderColor", "Border Color")[4]
    int("reserved", "")[12]
}

val CUDA_RESOURCE_VIEW_DESC = struct(Module.CUDA, "CUDA_RESOURCE_VIEW_DESC") {
    documentation = "Resource view descriptor."

    CUresourceViewFormat("format", "Resource view format")
    size_t("width", "Width of the resource view")
    size_t("height", "Height of the resource view")
    size_t("depth", "Depth of the resource view")
    unsigned_int("firstMipmapLevel", "First defined mipmap level")
    unsigned_int("lastMipmapLevel", "Last defined mipmap level")
    unsigned_int("firstLayer", "First layer index")
    unsigned_int("lastLayer", "Last layer index")
    unsigned_int("reserved", "")[16]
}

val CUDA_POINTER_ATTRIBUTE_P2P_TOKENS = struct(Module.CUDA, "CUDA_POINTER_ATTRIBUTE_P2P_TOKENS") {
    documentation = "GPU Direct v3 tokens."

    unsigned_long_long("p2pToken", "")
    unsigned_int("vaSpaceToken", "")
}

val CUdevprop = struct(Module.CUDA, "CUdevprop") {
    documentation = "Legacy device properties."

    int("maxThreadsPerBlock", "Maximum number of threads per block")
    int("maxThreadsDim", "Maximum size of each dimension of a block")[3]
    int("maxGridSize", "Maximum size of each dimension of a grid")[3]
    int("sharedMemPerBlock", "Shared memory available per block in bytes")
    int("totalConstantMemory", "Constant memory available on device in bytes")
    int("SIMDWidth", "Warp size in threads")
    int("memPitch", "Maximum pitch in bytes allowed by memory copies")
    int("regsPerBlock", "32-bit registers available per block")
    int("clockRate", "Clock frequency in kilohertz")
    int("textureAlign", "Alignment requirement for textures")
}

// GL Interop Types

val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)

val CUGLDeviceList = "CUGLDeviceList".enumType

val HGPUNV = "HGPUNV".handle