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
public class CU100 extends CU92 {

    /** Indicates that the external memory object is a dedicated resource. */
    public static final int CUDA_EXTERNAL_MEMORY_DEDICATED = 0x1;

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
     * </ul>
     */
    public static final int
        CU_GRAPH_NODE_TYPE_KERNEL = 0x0,
        CU_GRAPH_NODE_TYPE_MEMCPY = 0x1,
        CU_GRAPH_NODE_TYPE_MEMSET = 0x2,
        CU_GRAPH_NODE_TYPE_HOST   = 0x3,
        CU_GRAPH_NODE_TYPE_GRAPH  = 0x4,
        CU_GRAPH_NODE_TYPE_EMPTY  = 0x5;

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
     * </ul>
     */
    public static final int
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD        = 0x1,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32     = 0x2,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT = 0x3,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP       = 0x4,
        CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE   = 0x5;

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
     * </ul>
     */
    public static final int
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD        = 0x1,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32     = 0x2,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT = 0x3,
        CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE      = 0x4;

    protected CU100() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DeviceGetLuid                         = CU.getLibrary().getFunctionAddress("cuDeviceGetLuid"),
            StreamBeginCapture                    = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamBeginCapture")),
            StreamEndCapture                      = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamEndCapture")),
            StreamIsCapturing                     = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamIsCapturing")),
            ImportExternalMemory                  = apiGetFunctionAddress(CU.getLibrary(), "cuImportExternalMemory"),
            ExternalMemoryGetMappedBuffer         = apiGetFunctionAddress(CU.getLibrary(), "cuExternalMemoryGetMappedBuffer"),
            ExternalMemoryGetMappedMipmappedArray = apiGetFunctionAddress(CU.getLibrary(), "cuExternalMemoryGetMappedMipmappedArray"),
            DestroyExternalMemory                 = apiGetFunctionAddress(CU.getLibrary(), "cuDestroyExternalMemory"),
            ImportExternalSemaphore               = apiGetFunctionAddress(CU.getLibrary(), "cuImportExternalSemaphore"),
            SignalExternalSemaphoresAsync         = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuSignalExternalSemaphoresAsync")),
            WaitExternalSemaphoresAsync           = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuWaitExternalSemaphoresAsync")),
            DestroyExternalSemaphore              = apiGetFunctionAddress(CU.getLibrary(), "cuDestroyExternalSemaphore"),
            LaunchHostFunc                        = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuLaunchHostFunc")),
            GraphCreate                           = apiGetFunctionAddress(CU.getLibrary(), "cuGraphCreate"),
            GraphAddKernelNode                    = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddKernelNode"),
            GraphKernelNodeGetParams              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphKernelNodeGetParams"),
            GraphKernelNodeSetParams              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphKernelNodeSetParams"),
            GraphAddMemcpyNode                    = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddMemcpyNode"),
            GraphMemcpyNodeGetParams              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphMemcpyNodeGetParams"),
            GraphMemcpyNodeSetParams              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphMemcpyNodeSetParams"),
            GraphAddMemsetNode                    = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddMemsetNode"),
            GraphMemsetNodeGetParams              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphMemsetNodeGetParams"),
            GraphMemsetNodeSetParams              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphMemsetNodeSetParams"),
            GraphAddHostNode                      = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddHostNode"),
            GraphHostNodeGetParams                = apiGetFunctionAddress(CU.getLibrary(), "cuGraphHostNodeGetParams"),
            GraphHostNodeSetParams                = apiGetFunctionAddress(CU.getLibrary(), "cuGraphHostNodeSetParams"),
            GraphAddChildGraphNode                = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddChildGraphNode"),
            GraphChildGraphNodeGetGraph           = apiGetFunctionAddress(CU.getLibrary(), "cuGraphChildGraphNodeGetGraph"),
            GraphAddEmptyNode                     = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddEmptyNode"),
            GraphClone                            = apiGetFunctionAddress(CU.getLibrary(), "cuGraphClone"),
            GraphNodeFindInClone                  = apiGetFunctionAddress(CU.getLibrary(), "cuGraphNodeFindInClone"),
            GraphNodeGetType                      = apiGetFunctionAddress(CU.getLibrary(), "cuGraphNodeGetType"),
            GraphGetNodes                         = apiGetFunctionAddress(CU.getLibrary(), "cuGraphGetNodes"),
            GraphGetRootNodes                     = apiGetFunctionAddress(CU.getLibrary(), "cuGraphGetRootNodes"),
            GraphGetEdges                         = apiGetFunctionAddress(CU.getLibrary(), "cuGraphGetEdges"),
            GraphNodeGetDependencies              = apiGetFunctionAddress(CU.getLibrary(), "cuGraphNodeGetDependencies"),
            GraphNodeGetDependentNodes            = apiGetFunctionAddress(CU.getLibrary(), "cuGraphNodeGetDependentNodes"),
            GraphAddDependencies                  = apiGetFunctionAddress(CU.getLibrary(), "cuGraphAddDependencies"),
            GraphRemoveDependencies               = apiGetFunctionAddress(CU.getLibrary(), "cuGraphRemoveDependencies"),
            GraphDestroyNode                      = apiGetFunctionAddress(CU.getLibrary(), "cuGraphDestroyNode"),
            GraphInstantiate                      = apiGetFunctionAddress(CU.getLibrary(), "cuGraphInstantiate"),
            GraphLaunch                           = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuGraphLaunch")),
            GraphExecDestroy                      = apiGetFunctionAddress(CU.getLibrary(), "cuGraphExecDestroy"),
            GraphDestroy                          = apiGetFunctionAddress(CU.getLibrary(), "cuGraphDestroy");

    }

    // --- [ cuDeviceGetLuid ] ---

    public static int ncuDeviceGetLuid(long luid, long deviceNodeMask, int dev) {
        long __functionAddress = Functions.DeviceGetLuid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(luid, deviceNodeMask, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetLuid(@NativeType("char *") ByteBuffer luid, @NativeType("unsigned int *") IntBuffer deviceNodeMask, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(luid, 8);
            check(deviceNodeMask, 1);
        }
        return ncuDeviceGetLuid(memAddress(luid), memAddress(deviceNodeMask), dev);
    }

    // --- [ cuStreamBeginCapture ] ---

    @NativeType("CUresult")
    public static int cuStreamBeginCapture(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamBeginCapture;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamEndCapture ] ---

    public static int ncuStreamEndCapture(long hStream, long phGraph) {
        long __functionAddress = Functions.StreamEndCapture;
        return callPPI(hStream, phGraph, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamEndCapture(@NativeType("CUstream") long hStream, @NativeType("CUgraph *") PointerBuffer phGraph) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuStreamEndCapture(hStream, memAddress(phGraph));
    }

    // --- [ cuStreamIsCapturing ] ---

    public static int ncuStreamIsCapturing(long hStream, long captureStatus) {
        long __functionAddress = Functions.StreamIsCapturing;
        return callPPI(hStream, captureStatus, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamIsCapturing(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureStatus *") IntBuffer captureStatus) {
        if (CHECKS) {
            check(captureStatus, 1);
        }
        return ncuStreamIsCapturing(hStream, memAddress(captureStatus));
    }

    // --- [ cuImportExternalMemory ] ---

    public static int ncuImportExternalMemory(long extMem_out, long memHandleDesc) {
        long __functionAddress = Functions.ImportExternalMemory;
        return callPPI(extMem_out, memHandleDesc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuImportExternalMemory(@NativeType("CUexternalMemory *") PointerBuffer extMem_out, @NativeType("CUDA_EXTERNAL_MEMORY_HANDLE_DESC const *") CUDA_EXTERNAL_MEMORY_HANDLE_DESC memHandleDesc) {
        if (CHECKS) {
            check(extMem_out, 1);
        }
        return ncuImportExternalMemory(memAddress(extMem_out), memHandleDesc.address());
    }

    // --- [ cuExternalMemoryGetMappedBuffer ] ---

    public static int ncuExternalMemoryGetMappedBuffer(long devPtr, long extMem, long bufferDesc) {
        long __functionAddress = Functions.ExternalMemoryGetMappedBuffer;
        if (CHECKS) {
            check(extMem);
        }
        return callPPPI(devPtr, extMem, bufferDesc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuExternalMemoryGetMappedBuffer(@NativeType("CUdeviceptr *") PointerBuffer devPtr, @NativeType("CUexternalMemory") long extMem, @NativeType("CUDA_EXTERNAL_MEMORY_BUFFER_DESC const *") CUDA_EXTERNAL_MEMORY_BUFFER_DESC bufferDesc) {
        if (CHECKS) {
            check(devPtr, 1);
        }
        return ncuExternalMemoryGetMappedBuffer(memAddress(devPtr), extMem, bufferDesc.address());
    }

    // --- [ cuExternalMemoryGetMappedMipmappedArray ] ---

    public static int ncuExternalMemoryGetMappedMipmappedArray(long mipmap, long extMem, long mipmapDesc) {
        long __functionAddress = Functions.ExternalMemoryGetMappedMipmappedArray;
        if (CHECKS) {
            check(extMem);
        }
        return callPPPI(mipmap, extMem, mipmapDesc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuExternalMemoryGetMappedMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer mipmap, @NativeType("CUexternalMemory") long extMem, @NativeType("CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC const *") CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC mipmapDesc) {
        if (CHECKS) {
            check(mipmap, 1);
        }
        return ncuExternalMemoryGetMappedMipmappedArray(memAddress(mipmap), extMem, mipmapDesc.address());
    }

    // --- [ cuDestroyExternalMemory ] ---

    @NativeType("CUresult")
    public static int cuDestroyExternalMemory(@NativeType("CUexternalMemory") long extMem) {
        long __functionAddress = Functions.DestroyExternalMemory;
        if (CHECKS) {
            check(extMem);
        }
        return callPI(extMem, __functionAddress);
    }

    // --- [ cuImportExternalSemaphore ] ---

    public static int ncuImportExternalSemaphore(long extSem_out, long semHandleDesc) {
        long __functionAddress = Functions.ImportExternalSemaphore;
        return callPPI(extSem_out, semHandleDesc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuImportExternalSemaphore(@NativeType("CUexternalSemaphore *") PointerBuffer extSem_out, @NativeType("CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC const *") CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC semHandleDesc) {
        if (CHECKS) {
            check(extSem_out, 1);
        }
        return ncuImportExternalSemaphore(memAddress(extSem_out), semHandleDesc.address());
    }

    // --- [ cuSignalExternalSemaphoresAsync ] ---

    public static int ncuSignalExternalSemaphoresAsync(long extSemArray, long paramsArray, int numExtSems, long stream) {
        long __functionAddress = Functions.SignalExternalSemaphoresAsync;
        return callPPPI(extSemArray, paramsArray, numExtSems, stream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuSignalExternalSemaphoresAsync(@NativeType("CUexternalSemaphore const *") PointerBuffer extSemArray, @Nullable @NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer paramsArray, @NativeType("CUstream") long stream) {
        if (CHECKS) {
            checkSafe(paramsArray, extSemArray.remaining());
        }
        return ncuSignalExternalSemaphoresAsync(memAddress(extSemArray), memAddressSafe(paramsArray), extSemArray.remaining(), stream);
    }

    // --- [ cuWaitExternalSemaphoresAsync ] ---

    public static int ncuWaitExternalSemaphoresAsync(long extSemArray, long paramsArray, int numExtSems, long stream) {
        long __functionAddress = Functions.WaitExternalSemaphoresAsync;
        return callPPPI(extSemArray, paramsArray, numExtSems, stream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuWaitExternalSemaphoresAsync(@NativeType("CUexternalSemaphore const *") PointerBuffer extSemArray, @Nullable @NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer paramsArray, @NativeType("CUstream") long stream) {
        if (CHECKS) {
            checkSafe(paramsArray, extSemArray.remaining());
        }
        return ncuWaitExternalSemaphoresAsync(memAddress(extSemArray), memAddressSafe(paramsArray), extSemArray.remaining(), stream);
    }

    // --- [ cuDestroyExternalSemaphore ] ---

    @NativeType("CUresult")
    public static int cuDestroyExternalSemaphore(@NativeType("CUexternalSemaphore") long extSem) {
        long __functionAddress = Functions.DestroyExternalSemaphore;
        if (CHECKS) {
            check(extSem);
        }
        return callPI(extSem, __functionAddress);
    }

    // --- [ cuLaunchHostFunc ] ---

    public static int ncuLaunchHostFunc(long hStream, long fn, long userData) {
        long __functionAddress = Functions.LaunchHostFunc;
        if (CHECKS) {
            check(userData);
        }
        return callPPPI(hStream, fn, userData, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLaunchHostFunc(@NativeType("CUstream") long hStream, @NativeType("void (*) (void *)") CUhostFnI fn, @NativeType("void *") long userData) {
        return ncuLaunchHostFunc(hStream, fn.address(), userData);
    }

    // --- [ cuGraphCreate ] ---

    public static int ncuGraphCreate(long phGraph, int flags) {
        long __functionAddress = Functions.GraphCreate;
        return callPI(phGraph, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphCreate(@NativeType("CUgraph *") PointerBuffer phGraph, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuGraphCreate(memAddress(phGraph), flags);
    }

    // --- [ cuGraphAddKernelNode ] ---

    public static int ncuGraphAddKernelNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddKernelNode;
        if (CHECKS) {
            check(hGraph);
            CUDA_KERNEL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddKernelNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddKernelNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphKernelNodeGetParams ] ---

    public static int ncuGraphKernelNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeGetParams;
        if (CHECKS) {
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphKernelNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphKernelNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphKernelNodeSetParams ] ---

    public static int ncuGraphKernelNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphKernelNodeSetParams;
        if (CHECKS) {
            check(hNode);
            CUDA_KERNEL_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphKernelNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_KERNEL_NODE_PARAMS const *") CUDA_KERNEL_NODE_PARAMS nodeParams) {
        return ncuGraphKernelNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemcpyNode ] ---

    public static int ncuGraphAddMemcpyNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long copyParams, long ctx) {
        long __functionAddress = Functions.GraphAddMemcpyNode;
        if (CHECKS) {
            check(hGraph);
            CUDA_MEMCPY3D.validate(copyParams);
            check(ctx);
        }
        return callPPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, copyParams, ctx, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddMemcpyNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D copyParams, @NativeType("CUcontext") long ctx) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemcpyNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), copyParams.address(), ctx);
    }

    // --- [ cuGraphMemcpyNodeGetParams ] ---

    public static int ncuGraphMemcpyNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemcpyNodeGetParams;
        if (CHECKS) {
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphMemcpyNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D *") CUDA_MEMCPY3D nodeParams) {
        return ncuGraphMemcpyNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphMemcpyNodeSetParams ] ---

    public static int ncuGraphMemcpyNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemcpyNodeSetParams;
        if (CHECKS) {
            check(hNode);
            CUDA_MEMCPY3D.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphMemcpyNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D nodeParams) {
        return ncuGraphMemcpyNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddMemsetNode ] ---

    public static int ncuGraphAddMemsetNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long memsetParams, long ctx) {
        long __functionAddress = Functions.GraphAddMemsetNode;
        if (CHECKS) {
            check(hGraph);
            CUDA_MEMSET_NODE_PARAMS.validate(memsetParams);
            check(ctx);
        }
        return callPPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, memsetParams, ctx, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddMemsetNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS memsetParams, @NativeType("CUcontext") long ctx) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddMemsetNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), memsetParams.address(), ctx);
    }

    // --- [ cuGraphMemsetNodeGetParams ] ---

    public static int ncuGraphMemsetNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemsetNodeGetParams;
        if (CHECKS) {
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphMemsetNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS *") CUDA_MEMSET_NODE_PARAMS nodeParams) {
        return ncuGraphMemsetNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphMemsetNodeSetParams ] ---

    public static int ncuGraphMemsetNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphMemsetNodeSetParams;
        if (CHECKS) {
            check(hNode);
            CUDA_MEMSET_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphMemsetNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_MEMSET_NODE_PARAMS const *") CUDA_MEMSET_NODE_PARAMS nodeParams) {
        return ncuGraphMemsetNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddHostNode ] ---

    public static int ncuGraphAddHostNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long nodeParams) {
        long __functionAddress = Functions.GraphAddHostNode;
        if (CHECKS) {
            check(hGraph);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddHostNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddHostNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), nodeParams.address());
    }

    // --- [ cuGraphHostNodeGetParams ] ---

    public static int ncuGraphHostNodeGetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphHostNodeGetParams;
        if (CHECKS) {
            check(hNode);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphHostNodeGetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphHostNodeGetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphHostNodeSetParams ] ---

    public static int ncuGraphHostNodeSetParams(long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphHostNodeSetParams;
        if (CHECKS) {
            check(hNode);
            CUDA_HOST_NODE_PARAMS.validate(nodeParams);
        }
        return callPPI(hNode, nodeParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphHostNodeSetParams(@NativeType("CUgraphNode") long hNode, @NativeType("CUDA_HOST_NODE_PARAMS const *") CUDA_HOST_NODE_PARAMS nodeParams) {
        return ncuGraphHostNodeSetParams(hNode, nodeParams.address());
    }

    // --- [ cuGraphAddChildGraphNode ] ---

    public static int ncuGraphAddChildGraphNode(long phGraphNode, long hGraph, long dependencies, long numDependencies, long childGraph) {
        long __functionAddress = Functions.GraphAddChildGraphNode;
        if (CHECKS) {
            check(hGraph);
            check(childGraph);
        }
        return callPPPPPI(phGraphNode, hGraph, dependencies, numDependencies, childGraph, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddChildGraphNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies, @NativeType("CUgraph") long childGraph) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddChildGraphNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies), childGraph);
    }

    // --- [ cuGraphChildGraphNodeGetGraph ] ---

    public static int ncuGraphChildGraphNodeGetGraph(long hNode, long phGraph) {
        long __functionAddress = Functions.GraphChildGraphNodeGetGraph;
        if (CHECKS) {
            check(hNode);
        }
        return callPPI(hNode, phGraph, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphChildGraphNodeGetGraph(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraph *") PointerBuffer phGraph) {
        if (CHECKS) {
            check(phGraph, 1);
        }
        return ncuGraphChildGraphNodeGetGraph(hNode, memAddress(phGraph));
    }

    // --- [ cuGraphAddEmptyNode ] ---

    public static int ncuGraphAddEmptyNode(long phGraphNode, long hGraph, long dependencies, long numDependencies) {
        long __functionAddress = Functions.GraphAddEmptyNode;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPPI(phGraphNode, hGraph, dependencies, numDependencies, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddEmptyNode(@NativeType("CUgraphNode *") PointerBuffer phGraphNode, @NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode const *") PointerBuffer dependencies) {
        if (CHECKS) {
            check(phGraphNode, 1);
        }
        return ncuGraphAddEmptyNode(memAddress(phGraphNode), hGraph, memAddressSafe(dependencies), remainingSafe(dependencies));
    }

    // --- [ cuGraphClone ] ---

    public static int ncuGraphClone(long phGraphClone, long originalGraph) {
        long __functionAddress = Functions.GraphClone;
        if (CHECKS) {
            check(originalGraph);
        }
        return callPPI(phGraphClone, originalGraph, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphClone(@NativeType("CUgraph *") PointerBuffer phGraphClone, @NativeType("CUgraph") long originalGraph) {
        if (CHECKS) {
            check(phGraphClone, 1);
        }
        return ncuGraphClone(memAddress(phGraphClone), originalGraph);
    }

    // --- [ cuGraphNodeFindInClone ] ---

    public static int ncuGraphNodeFindInClone(long phNode, long hOriginalNode, long hClonedGraph) {
        long __functionAddress = Functions.GraphNodeFindInClone;
        if (CHECKS) {
            check(hOriginalNode);
            check(hClonedGraph);
        }
        return callPPPI(phNode, hOriginalNode, hClonedGraph, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphNodeFindInClone(@NativeType("CUgraphNode *") PointerBuffer phNode, @NativeType("CUgraphNode") long hOriginalNode, @NativeType("CUgraph") long hClonedGraph) {
        if (CHECKS) {
            check(phNode, 1);
        }
        return ncuGraphNodeFindInClone(memAddress(phNode), hOriginalNode, hClonedGraph);
    }

    // --- [ cuGraphNodeGetType ] ---

    public static int ncuGraphNodeGetType(long hNode, long type) {
        long __functionAddress = Functions.GraphNodeGetType;
        if (CHECKS) {
            check(hNode);
        }
        return callPPI(hNode, type, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphNodeGetType(@NativeType("CUgraphNode") long hNode, @NativeType("CUgraphNodeType *") IntBuffer type) {
        if (CHECKS) {
            check(type, 1);
        }
        return ncuGraphNodeGetType(hNode, memAddress(type));
    }

    // --- [ cuGraphGetNodes ] ---

    public static int ncuGraphGetNodes(long hGraph, long nodes, long numNodes) {
        long __functionAddress = Functions.GraphGetNodes;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPI(hGraph, nodes, numNodes, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphGetNodes(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode *") PointerBuffer nodes, @NativeType("size_t *") PointerBuffer numNodes) {
        if (CHECKS) {
            check(numNodes, 1);
            checkSafe(nodes, numNodes.get(numNodes.position()));
        }
        return ncuGraphGetNodes(hGraph, memAddressSafe(nodes), memAddress(numNodes));
    }

    // --- [ cuGraphGetRootNodes ] ---

    public static int ncuGraphGetRootNodes(long hGraph, long rootNodes, long numRootNodes) {
        long __functionAddress = Functions.GraphGetRootNodes;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPI(hGraph, rootNodes, numRootNodes, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphGetRootNodes(@NativeType("CUgraph") long hGraph, @Nullable @NativeType("CUgraphNode *") PointerBuffer rootNodes, @NativeType("size_t *") PointerBuffer numRootNodes) {
        if (CHECKS) {
            check(numRootNodes, 1);
            checkSafe(rootNodes, numRootNodes.get(numRootNodes.position()));
        }
        return ncuGraphGetRootNodes(hGraph, memAddressSafe(rootNodes), memAddress(numRootNodes));
    }

    // --- [ cuGraphGetEdges ] ---

    public static int ncuGraphGetEdges(long hGraph, long from, long to, long numEdges) {
        long __functionAddress = Functions.GraphGetEdges;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numEdges, __functionAddress);
    }

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

    public static int ncuGraphNodeGetDependencies(long hNode, long dependencies, long numDependencies) {
        long __functionAddress = Functions.GraphNodeGetDependencies;
        if (CHECKS) {
            check(hNode);
        }
        return callPPPI(hNode, dependencies, numDependencies, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphNodeGetDependencies(@NativeType("CUgraphNode") long hNode, @Nullable @NativeType("CUgraphNode *") PointerBuffer dependencies, @NativeType("size_t *") PointerBuffer numDependencies) {
        if (CHECKS) {
            check(numDependencies, 1);
            checkSafe(dependencies, numDependencies.get(numDependencies.position()));
        }
        return ncuGraphNodeGetDependencies(hNode, memAddressSafe(dependencies), memAddress(numDependencies));
    }

    // --- [ cuGraphNodeGetDependentNodes ] ---

    public static int ncuGraphNodeGetDependentNodes(long hNode, long dependentNodes, long numDependentNodes) {
        long __functionAddress = Functions.GraphNodeGetDependentNodes;
        if (CHECKS) {
            check(hNode);
        }
        return callPPPI(hNode, dependentNodes, numDependentNodes, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphNodeGetDependentNodes(@NativeType("CUgraphNode") long hNode, @Nullable @NativeType("CUgraphNode *") PointerBuffer dependentNodes, @NativeType("size_t *") PointerBuffer numDependentNodes) {
        if (CHECKS) {
            check(numDependentNodes, 1);
            checkSafe(dependentNodes, numDependentNodes.get(numDependentNodes.position()));
        }
        return ncuGraphNodeGetDependentNodes(hNode, memAddressSafe(dependentNodes), memAddress(numDependentNodes));
    }

    // --- [ cuGraphAddDependencies ] ---

    public static int ncuGraphAddDependencies(long hGraph, long from, long to, long numDependencies) {
        long __functionAddress = Functions.GraphAddDependencies;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numDependencies, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphAddDependencies(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") PointerBuffer from, @NativeType("CUgraphNode const *") PointerBuffer to) {
        if (CHECKS) {
            check(to, from.remaining());
        }
        return ncuGraphAddDependencies(hGraph, memAddress(from), memAddress(to), from.remaining());
    }

    // --- [ cuGraphRemoveDependencies ] ---

    public static int ncuGraphRemoveDependencies(long hGraph, long from, long to, long numDependencies) {
        long __functionAddress = Functions.GraphRemoveDependencies;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPPI(hGraph, from, to, numDependencies, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphRemoveDependencies(@NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode const *") PointerBuffer from, @NativeType("CUgraphNode const *") PointerBuffer to) {
        if (CHECKS) {
            check(to, from.remaining());
        }
        return ncuGraphRemoveDependencies(hGraph, memAddress(from), memAddress(to), from.remaining());
    }

    // --- [ cuGraphDestroyNode ] ---

    @NativeType("CUresult")
    public static int cuGraphDestroyNode(@NativeType("CUgraphNode") long hNode) {
        long __functionAddress = Functions.GraphDestroyNode;
        if (CHECKS) {
            check(hNode);
        }
        return callPI(hNode, __functionAddress);
    }

    // --- [ cuGraphInstantiate ] ---

    public static int ncuGraphInstantiate(long phGraphExec, long hGraph, long phErrorNode, long logBuffer, long bufferSize) {
        long __functionAddress = Functions.GraphInstantiate;
        if (CHECKS) {
            check(hGraph);
        }
        return callPPPPPI(phGraphExec, hGraph, phErrorNode, logBuffer, bufferSize, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphInstantiate(@NativeType("CUgraphExec *") PointerBuffer phGraphExec, @NativeType("CUgraph") long hGraph, @NativeType("CUgraphNode *") PointerBuffer phErrorNode, @NativeType("char *") ByteBuffer logBuffer) {
        if (CHECKS) {
            check(phGraphExec, 1);
            check(phErrorNode, 1);
        }
        return ncuGraphInstantiate(memAddress(phGraphExec), hGraph, memAddress(phErrorNode), memAddress(logBuffer), logBuffer.remaining());
    }

    // --- [ cuGraphLaunch ] ---

    @NativeType("CUresult")
    public static int cuGraphLaunch(@NativeType("CUgraphExec") long hGraphExec, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.GraphLaunch;
        if (CHECKS) {
            check(hGraphExec);
        }
        return callPPI(hGraphExec, hStream, __functionAddress);
    }

    // --- [ cuGraphExecDestroy ] ---

    @NativeType("CUresult")
    public static int cuGraphExecDestroy(@NativeType("CUgraphExec") long hGraphExec) {
        long __functionAddress = Functions.GraphExecDestroy;
        if (CHECKS) {
            check(hGraphExec);
        }
        return callPI(hGraphExec, __functionAddress);
    }

    // --- [ cuGraphDestroy ] ---

    @NativeType("CUresult")
    public static int cuGraphDestroy(@NativeType("CUgraph") long hGraph) {
        long __functionAddress = Functions.GraphDestroy;
        if (CHECKS) {
            check(hGraph);
        }
        return callPI(hGraph, __functionAddress);
    }

}