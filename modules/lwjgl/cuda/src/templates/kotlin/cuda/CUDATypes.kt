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

fun config() {
    packageInfo(
        Module.CUDA,
        """
        Contains bindings to <a href="https://developer.nvidia.com/cuda-zone">CUDA</a>.

        <h3>UNSTABLE API</h3>

        Until these bindings are sufficiently tested, this API should be considered unstable. Also, bindings to more (and eventually, all) CUDA Toolkit
        libraries will be added in the near future.
        """
    )
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
val CUmipmappedArray = "CUmipmappedArray".handle
val CUmodule = "CUmodule".handle
val CUstream = "CUstream".handle
val CUsurfref = "CUsurfref".handle
val CUtexref = "CUtexref".handle

val CUsurfObject = typedef(unsigned_long_long, "CUsurfObject")
val CUtexObject = typedef(unsigned_long_long, "CUtexObject")

val CUaddress_mode = "CUaddress_mode".enumType
val CUarray_format = "CUarray_format".enumType
val CUdevice_attribute = "CUdevice_attribute".enumType
val CUdevice_P2PAttribute = "CUdevice_P2PAttribute".enumType
val CUexternalMemoryHandleType = "CUexternalMemoryHandleType".enumType
val CUexternalSemaphoreHandleType = "CUexternalSemaphoreHandleType".enumType
val CUfilter_mode = "CUfilter_mode".enumType
val CUfunc_cache = "CUfunc_cache".enumType
val CUfunction_attribute = "CUfunction_attribute".enumType
val CUgraphNodeType = "CUgraphNodeType".enumType
val CUjit_option = "CUjit_option".enumType
val CUjitInputType = "CUjitInputType".enumType
val CUlimit = "CUlimit".enumType
val CUmem_advise = "CUmem_advise".enumType
val CUmem_range_attribute = "CUmem_range_attribute".enumType
val CUmemorytype = "CUmemorytype".enumType
val CUoutput_mode = "CUoutput_mode".enumType
val CUpointer_attribute = "CUpointer_attribute".enumType
val CUresourcetype = "CUresourcetype".enumType
val CUresourceViewFormat = "CUresourceViewFormat".enumType
val CUresult = "CUresult".enumType
val CUsharedconfig = "CUsharedconfig".enumType
val CUstreamCaptureStatus = "CUstreamCaptureStatus".enumType
val CUstreamBatchMemOpType = "CUstreamBatchMemOpType".enumType

val CUstreamCallback = Module.CUDA.callback {
    void(
        "CUstreamCallback",
        "CUDA stream callback.",

        nullable..CUstream.IN("hStream", "the stream the callback was added to, as passed to #StreamAddCallback(). May be #NULL."),
        CUresult.IN("status", "CUDA_SUCCESS or any persistent error on the stream"), // TODO:
        opaque_p.IN("userData", "user parameter provided at registration")
    ) {
        documentation = "Instances of this interface may be passed to the #StreamAddCallback() method."
    }
}

val CUhostFn = Module.CUDA.callback {
    void(
        "CUhostFn",
        "CUDA host function.",

        opaque_p.IN("userData", "argument value passed to the function")
    ) {
        documentation = "Instances of this interface may be passed to the #LaunchHostFunc() method."
    }
}

val CUoccupancyB2DSize = Module.CUDA.callback {
    size_t(
        "CUoccupancyB2DSize",
        "Block size to per-block dynamic shared memory mapping for a certain kernel.",

        int.IN("blockSize", "block size of the kernel"),

        returnDoc = "the dynamic shared memory needed by a block"
    ) {
        documentation =
            "Instances of this interface may be passed to the #OccupancyMaxPotentialBlockSize() and #OccupancyMaxPotentialBlockSizeWithFlags() methods."
    }
}

val CUuuid = struct(Module.CUDA, "CUuuid", mutable = false) {
    documentation = "CUDA definition of UUID"
    charASCII.array("bytes", "", size = 16)
}

val CUipcEventHandle = struct(Module.CUDA, "CUIPCEventHandle", nativeName = "CUipcEventHandle") {
    javaImport("static org.lwjgl.cuda.CU41.*")

    char.array("reserved", "", size = "CU_IPC_HANDLE_SIZE")
}

val CUipcMemHandle = struct(Module.CUDA, "CUIPCMemHandle", nativeName = "CUipcMemHandle") {
    javaImport("static org.lwjgl.cuda.CU41.*")

    char.array("reserved", "", size = "CU_IPC_HANDLE_SIZE")
}

val CUDA_MEMCPY2D = struct(Module.CUDA, "CUDA_MEMCPY2D") {
    documentation = "2D memory copy parameters."

    size_t.member("srcXInBytes", "Source X in bytes")
    size_t.member("srcY", "Source Y")
    CUmemorytype.member("srcMemoryType", "Source memory type (host, device, array)")
    void.const.p.member("srcHost", "Source host pointer")
    CUdeviceptr.member("srcDevice", "Source device pointer")
    CUarray.member("srcArray", "Source array reference")
    size_t.member("srcPitch", "Source pitch (ignored when src is array)")
    size_t.member("dstXInBytes", "Destination X in bytes")
    size_t.member("dstY", "Destination Y")
    CUmemorytype.member("dstMemoryType", "Destination memory type (host, device, array)")
    void.p.member("dstHost", "Destination host pointer")
    CUdeviceptr.member("dstDevice", "Destination device pointer")
    CUarray.member("dstArray", "Destination array reference")
    size_t.member("dstPitch", "Destination pitch (ignored when dst is array)")
    size_t.member("WidthInBytes", "Width of 2D memory copy in bytes")
    size_t.member("Height", "Height of 2D memory copy")
}

val CUDA_MEMCPY3D = struct(Module.CUDA, "CUDA_MEMCPY3D") {
    documentation = "3D memory copy parameters."

    size_t.member("srcXInBytes", "Source X in bytes")
    size_t.member("srcY", "Source Y")
    size_t.member("srcZ", "Source Z")
    size_t.member("srcLOD", "Source LOD")
    CUmemorytype.member("srcMemoryType", "Source memory type (host, device, array)")
    void.const.p.member("srcHost", "Source host pointer")
    CUdeviceptr.member("srcDevice", "Source device pointer")
    CUarray.member("srcArray", "Source array reference")
    void.p.member("reserved0", "Must be #NULL")
    size_t.member("srcPitch", "Source pitch (ignored when src is array)")
    size_t.member("srcHeight", "Source height (ignored when src is array; may be 0 if Depth==1)")
    size_t.member("dstXInBytes", "Destination X in bytes")
    size_t.member("dstY", "Destination Y")
    size_t.member("dstZ", "Destination Z")
    size_t.member("dstLOD", "Destination LOD")
    CUmemorytype.member("dstMemoryType", "Destination memory type (host, device, array)")
    void.p.member("dstHost", "Destination host pointer")
    CUdeviceptr.member("dstDevice", "Destination device pointer")
    CUarray.member("dstArray", "Destination array reference")
    void.p.member("reserved1", "Must be NULL")
    size_t.member("dstPitch", "Destination pitch (ignored when dst is array)")
    size_t.member("dstHeight", "Destination height (ignored when dst is array; may be 0 if Depth==1)")
    size_t.member("WidthInBytes", "Width of 3D memory copy in bytes")
    size_t.member("Height", "Height of 3D memory copy")
    size_t.member("Depth", "Depth of 3D memory copy")
}

val CUDA_MEMCPY3D_PEER = struct(Module.CUDA, "CUDA_MEMCPY3D_PEER") {
    documentation = "3D memory cross-context copy parameters."

    size_t.member("srcXInBytes", "Source X in bytes")
    size_t.member("srcY", "Source Y")
    size_t.member("srcZ", "Source Z")
    size_t.member("srcLOD", "Source LOD")
    CUmemorytype.member("srcMemoryType", "Source memory type (host, device, array)")
    void.const.p.member("srcHost", "Source host pointer")
    CUdeviceptr.member("srcDevice", "Source device pointer")
    CUarray.member("srcArray", "Source array reference")
    CUcontext.member("srcContext", "Source context (ignored with srcMemoryType is ::CU_MEMORYTYPE_ARRAY)")
    size_t.member("srcPitch", "Source pitch (ignored when src is array)")
    size_t.member("srcHeight", "Source height (ignored when src is array; may be 0 if Depth==1)")
    size_t.member("dstXInBytes", "Destination X in bytes")
    size_t.member("dstY", "Destination Y")
    size_t.member("dstZ", "Destination Z")
    size_t.member("dstLOD", "Destination LOD")
    CUmemorytype.member("dstMemoryType", "Destination memory type (host, device, array)")
    void.p.member("dstHost", "Destination host pointer")
    CUdeviceptr.member("dstDevice", "Destination device pointer")
    CUarray.member("dstArray", "Destination array reference")
    CUcontext.member("dstContext", "Destination context (ignored with dstMemoryType is ::CU_MEMORYTYPE_ARRAY)")
    size_t.member("dstPitch", "Destination pitch (ignored when dst is array)")
    size_t.member("dstHeight", "Destination height (ignored when dst is array; may be 0 if Depth==1)")
    size_t.member("WidthInBytes", "Width of 3D memory copy in bytes")
    size_t.member("Height", "Height of 3D memory copy")
    size_t.member("Depth", "Depth of 3D memory copy")
}

val CUDA_ARRAY_DESCRIPTOR = struct(Module.CUDA, "CUDA_ARRAY_DESCRIPTOR") {
    documentation = "Array descriptor."

    size_t.member("Width", "Width of array")
    size_t.member("Height", "Height of array")
    CUarray_format.member("Format", "Array format")
    unsigned_int.member("NumChannels", "Channels per array element")
}

val CUDA_ARRAY3D_DESCRIPTOR = struct(Module.CUDA, "CUDA_ARRAY3D_DESCRIPTOR") {
    documentation = "3D array descriptor."

    size_t.member("Width", "Width of 3D array")
    size_t.member("Height", "Height of 3D array")
    size_t.member("Depth", "Depth of 3D array")
    CUarray_format.member("Format", "Array format")
    unsigned_int.member("NumChannels", "Channels per array element")
    unsigned_int.member("Flags", "Flags")
}

val CUDA_EXTERNAL_MEMORY_HANDLE_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_HANDLE_DESC") {
    documentation = "External memory handle descriptor."

    CUexternalMemoryHandleType.member("type", "Type of the handle")
    union("handle", "") {
        int.member("fd", "File descriptor referencing the memory object. Valid when type is ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD")
        struct(
            "win32",
            """
            Win32 handle referencing the semaphore object. Valid when type is one of the following:
             - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32
             - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT
             - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP
             - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE
             Exactly one of 'handle' and 'name' must be non-NULL. If type is ::CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT then 'name' must be #NULL.
            """
        ) {
            nullable..opaque_p.member("handle", "Valid NT handle. Must be NULL if 'name' is non-NULL")
            nullable..opaque_const_p.member("name", "Name of a valid memory object. Must be NULL if 'handle' is non-NULL.")
        }
    }
    unsigned_long_long.member("size", "Size of the memory allocation")
    unsigned_int.member("flags", "Flags must either be zero or ::CUDA_EXTERNAL_MEMORY_DEDICATED")
    unsigned_int.array("reserved", "", size = 16)
}

val CUDA_EXTERNAL_MEMORY_BUFFER_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_BUFFER_DESC") {
    documentation = "External memory buffer descriptor."

    unsigned_long_long.member("offset", "Offset into the memory object where the buffer's base is")
    unsigned_long_long.member("size", "Size of the buffer")
    unsigned_int.member("flags", "Flags reserved for future use. Must be zero.")
    unsigned_int.array("reserved", "", size = 16)
}

val CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC") {
    documentation = "External memory mipmap descriptor."

    unsigned_long_long.member("offset", "Offset into the memory object where the base level of the mipmap chain is.")
    CUDA_ARRAY3D_DESCRIPTOR.member("arrayDesc", "Format, dimension and type of base level of the mipmap chain")
    unsigned_int.member("numLevels", "Total number of levels in the mipmap chain")
    unsigned_int.array("reserved", "", size = 16)
}

/**
 * External semaphore handle descriptor
 */
val CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC"){
    /**
     * Type of the handle
     */
    CUexternalSemaphoreHandleType.member("type", "")
    union("handle", "") {
        int.member("fd", "File descriptor referencing the semaphore object. Valid when type is ::CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD")
        struct(
            "win32",
            """
            Win32 handle referencing the semaphore object. Valid when type is one of the following:
             - ::CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32
             - ::CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT
             - ::CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE
             Exactly one of 'handle' and 'name' must be non-NULL. If type is ::CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT then 'name' must be NULL.
            """
        ) {
            nullable..opaque_p.member("handle", "Valid NT handle. Must be NULL if 'name' is non-NULL")
            nullable..opaque_const_p.member("name", "Name of a valid synchronization primitive. Must be NULL if 'handle' is non-NULL.")
        }
    }
    unsigned_int.member("flags", "Flags reserved for the future. Must be zero.")
    unsigned_int.array("reserved", "", size = 16)
}

val CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS") {
    documentation = "External semaphore signal parameters."

    struct("params", "Parameters for fence objects") {
        struct("fence", "Value of fence to be signaled") {
            unsigned_long_long.member("value", "")
        }
        unsigned_int.array("reserved", "", size = 16)
    }
    unsigned_int.member("flags", "Flags reserved for the future. Must be zero.")
    unsigned_int.array("reserved", "", size = 16)
}

val CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS = struct(Module.CUDA, "CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS") {
    documentation = "External semaphore wait parameters"

    struct("params", "Parameters for fence objects") {
        struct("fence", "Value of fence to be waited on") {
            unsigned_long_long.member("value", "")
        }
        unsigned_int.array("reserved", "", size = 16)
    }
    unsigned_int.member("flags", "Flags reserved for the future. Must be zero.")
    unsigned_int.array("reserved", "", size = 16)
}

val CUstreamBatchMemOpParams = union(Module.CUDA, "CUstreamBatchMemOpParams") {
    documentation = "Per-operation parameters for ::cuStreamBatchMemOp."

    CUstreamBatchMemOpType.member("operation", "")
    struct("waitValue", "") {
        CUstreamBatchMemOpType.member("operation", "")
        CUdeviceptr.member("address", "")
        union {
            cuuint32_t.member("value", "")
            cuuint64_t.member("value64", "")
        }
        unsigned_int.member("flags", "")
        CUdeviceptr.member("alias", "For driver internal use. Initial value is unimportant.")
    }
    struct("writeValue", "") {
        CUstreamBatchMemOpType.member("operation", "")
        CUdeviceptr.member("address", "")
        union {
            cuuint32_t.member("value", "")
            cuuint64_t.member("value64", "")
        }
        unsigned_int.member("flags", "")
        CUdeviceptr.member("alias", "For driver internal use. Initial value is unimportant.")
    }
    struct("flushRemoteWrites", "") {
        CUstreamBatchMemOpType.member("operation", "")
        unsigned_int.member("flags", "")
    }
    cuuint64_t.array("pad", "", size = 6)
}

val CUDA_LAUNCH_PARAMS = struct(Module.CUDA, "CUDA_LAUNCH_PARAMS") {
    documentation = "Kernel launch parameters."

    CUfunction.member("function", "Kernel to launch")
    unsigned_int.member("gridDimX", "Width of grid in blocks")
    unsigned_int.member("gridDimY", "Height of grid in blocks")
    unsigned_int.member("gridDimZ", "Depth of grid in blocks")
    unsigned_int.member("blockDimX", "X dimension of each thread block")
    unsigned_int.member("blockDimY", "Y dimension of each thread block")
    unsigned_int.member("blockDimZ", "Z dimension of each thread block")
    unsigned_int.member("sharedMemBytes", "Dynamic shared-memory size per thread block in bytes")
    CUstream.member("hStream", "Stream identifier")
    void.p.p.member("kernelParams", "Array of pointers to kernel parameters")
}

val CUDA_KERNEL_NODE_PARAMS = struct(Module.CUDA, "CUDA_KERNEL_NODE_PARAMS") {
    documentation = "GPU kernel node parameter."

    CUfunction.member("func", "Kernel to launch")
    unsigned_int.member("gridDimX", "Width of grid in blocks")
    unsigned_int.member("gridDimY", "Height of grid in blocks")
    unsigned_int.member("gridDimZ", "Depth of grid in blocks")
    unsigned_int.member("blockDimX", "X dimension of each thread block")
    unsigned_int.member("blockDimY", "Y dimension of each thread block")
    unsigned_int.member("blockDimZ", "Z dimension of each thread block")
    unsigned_int.member("sharedMemBytes", "Dynamic shared-memory size per thread block in bytes")
    void.p.p.member("kernelParams", "Array of pointers to kernel parameters")
    void.p.p.member("extra", "Extra options")
}

val CUDA_MEMSET_NODE_PARAMS = struct(Module.CUDA, "CUDA_MEMSET_NODE_PARAMS") {
    documentation = "Memset node parameters."

    CUdeviceptr.member("dst", "Destination device pointer")
    size_t.member("pitch", "Pitch of destination device pointer. Unused if height is 1")
    unsigned_int.member("value", "Value to be set")
    unsigned_int.member("elementSize", "Size of each element in bytes. Must be 1, 2, or 4.")
    size_t.member("width", "Width in bytes, of the row")
    size_t.member("height", "Number of rows")
}

val CUDA_HOST_NODE_PARAMS = struct(Module.CUDA, "CUDA_HOST_NODE_PARAMS") {
    documentation = "Host node parameters."

    CUhostFn.member("fn", "The function to call when the node executes")
    opaque_p.member("userData", "Argument to pass to the function")
}

val CUDA_RESOURCE_DESC = struct(Module.CUDA, "CUDA_RESOURCE_DESC") {
    documentation = "CUDA Resource descriptor."

    CUresourcetype.member("resType", "Resource type")
    union("res", "") {
        struct("array", "") {
            CUarray.member("hArray", "CUDA array")
        }
        struct("mipmap", "") {
            CUmipmappedArray.member("hMipmappedArray", "CUDA mipmapped array")
        }
        struct("linear", "") {
            CUdeviceptr.member("devPtr", "Device pointer")
            CUarray_format.member("format", "Array format")
            unsigned_int.member("numChannels", "Channels per array element")
            size_t.member("sizeInBytes", "Size in bytes")
        }
        struct("pitch2D", "") {
            CUdeviceptr.member("devPtr", "Device pointer")
            CUarray_format.member("format", "Array format")
            unsigned_int.member("numChannels", "Channels per array element")
            size_t.member("width", "Width of the array in elements")
            size_t.member("height", "Height of the array in elements")
            size_t.member("pitchInBytes", "Pitch between two rows in bytes")
        }
        struct("reserved", "") {
            int.array("reserved", "", size = 32)
        }
    }

    unsigned_int.member("flags", "Flags (must be zero)")
}

val CUDA_TEXTURE_DESC = struct(Module.CUDA, "CUDA_TEXTURE_DESC") {
    documentation = "Texture descriptor."

    CUaddress_mode.array("addressMode", "Address modes", size = 3)
    CUfilter_mode.member("filterMode", "Filter mode")
    unsigned_int.member("flags", "Flags")
    unsigned_int.member("maxAnisotropy", "Maximum anisotropy ratio")
    CUfilter_mode.member("mipmapFilterMode", "Mipmap filter mode")
    float.member("mipmapLevelBias", "Mipmap level bias")
    float.member("minMipmapLevelClamp", "Mipmap minimum level clamp")
    float.member("maxMipmapLevelClamp", "Mipmap maximum level clamp")
    float.array("borderColor", "Border Color", size = 4)
    int.array("reserved", "", size = 12)
}

val CUDA_RESOURCE_VIEW_DESC = struct(Module.CUDA, "CUDA_RESOURCE_VIEW_DESC") {
    documentation = "Resource view descriptor."

    CUresourceViewFormat.member("format", "Resource view format")
    size_t.member("width", "Width of the resource view")
    size_t.member("height", "Height of the resource view")
    size_t.member("depth", "Depth of the resource view")
    unsigned_int.member("firstMipmapLevel", "First defined mipmap level")
    unsigned_int.member("lastMipmapLevel", "Last defined mipmap level")
    unsigned_int.member("firstLayer", "First layer index")
    unsigned_int.member("lastLayer", "Last layer index")
    unsigned_int.array("reserved", "", size = 16)
}

val CUdevprop = struct(Module.CUDA, "CUdevprop") {
    documentation = "Legacy device properties."

    int.member("maxThreadsPerBlock", "Maximum number of threads per block")
    int.array("maxThreadsDim", "Maximum size of each dimension of a block", size = 3)
    int.array("maxGridSize", "Maximum size of each dimension of a grid", size = 3)
    int.member("sharedMemPerBlock", "Shared memory available per block in bytes")
    int.member("totalConstantMemory", "Constant memory available on device in bytes")
    int.member("SIMDWidth", "Warp size in threads")
    int.member("memPitch", "Maximum pitch in bytes allowed by memory copies")
    int.member("regsPerBlock", "32-bit registers available per block")
    int.member("clockRate", "Clock frequency in kilohertz")
    int.member("textureAlign", "Alignment requirement for textures")
}

// GL Interop Types

val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)
val GLenum = IntegerType("GLenum", PrimitiveMapping.INT, unsigned = true)

val CUGLDeviceList = "CUGLDeviceList".enumType

val HGPUNV = "HGPUNV".handle