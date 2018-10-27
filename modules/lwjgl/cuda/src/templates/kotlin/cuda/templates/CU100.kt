/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU100 = "CU100".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU92
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    IntConstant(
        "Indicates that the external memory object is a dedicated resource.",

        "CUDA_EXTERNAL_MEMORY_DEDICATED"..0x1
    ).noPrefix()

    EnumConstant(
        "Graph node types. ({@code CUgraphNodeType})",

        "GRAPH_NODE_TYPE_KERNEL".enum("GPU kernel node", 0),
        "GRAPH_NODE_TYPE_MEMCPY".enum("Memcpy node", 1),
        "GRAPH_NODE_TYPE_MEMSET".enum("Memset node", 2),
        "GRAPH_NODE_TYPE_HOST".enum("Host (executable) node", 3),
        "GRAPH_NODE_TYPE_GRAPH".enum("Node which executes an embedded graph", 4),
        "GRAPH_NODE_TYPE_EMPTY".enum("Empty (no-op) node", 5)
    )

    EnumConstant(
        "Possible stream capture statuses returned by #StreamIsCapturing(). ({@code CUstreamCaptureStatus})",

        "STREAM_CAPTURE_STATUS_NONE".enum("Stream is not capturing", 0),
        "STREAM_CAPTURE_STATUS_ACTIVE".enum("Stream is actively capturing", 1),
        "STREAM_CAPTURE_STATUS_INVALIDATED".enum("Stream is part of a capture sequence that has been invalidated, but not terminated", 2)
    )

    EnumConstant(
        "External memory handle types. ({@code CUexternalMemoryHandleType})",

        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD".enum("Handle is an opaque file descriptor", 1),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32".enum("Handle is an opaque shared NT handle", 2),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT".enum("Handle is an opaque, globally shared handle", 3),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP".enum("Handle is a D3D12 heap object", 4),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE".enum("Handle is a D3D12 committed resource", 5)
    )

    EnumConstant(
        "External semaphore handle types. ({@code CUexternalSemaphoreHandleType})",

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD".enum("Handle is an opaque file descriptor", 1),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32".enum("Handle is an opaque shared NT handle", 2),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT".enum("Handle is an opaque, globally shared handle", 3),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE".enum("Handle is a shared NT handle referencing a D3D12 fence object", 4)
    )

    IgnoreMissing..CUresult(
        "DeviceGetLuid",
        "",

        Check(8)..char.p.OUT("luid", ""), // TODO: 8?
        Check(1)..unsigned_int.p.OUT("deviceNodeMask", ""),
        CUdevice.IN("dev", "")
    )

    CUresult(
        "StreamBeginCapture",
        "",

        nullable..CUstream.IN("hStream", "")
    ).ptsz()

    CUresult(
        "StreamEndCapture",
        "",

        nullable..CUstream.IN("hStream", ""),
        Check(1)..CUgraph.p.OUT("phGraph", "")
    ).ptsz()

    CUresult(
        "StreamIsCapturing",
        "",

        nullable..CUstream.IN("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p.OUT("captureStatus", "")
    ).ptsz()

    CUresult(
        "ImportExternalMemory",
        "",

        Check(1)..CUexternalMemory.p.OUT("extMem_out", ""),
        CUDA_EXTERNAL_MEMORY_HANDLE_DESC.const.p.IN("memHandleDesc", "")
    )

    CUresult(
        "ExternalMemoryGetMappedBuffer",
        "",

        Check(1)..CUdeviceptr.p.OUT("devPtr", ""),
        CUexternalMemory.IN("extMem", ""),
        CUDA_EXTERNAL_MEMORY_BUFFER_DESC.const.p.IN("bufferDesc", "")
    )

    CUresult(
        "ExternalMemoryGetMappedMipmappedArray",
        "",

        Check(1)..CUmipmappedArray.p.OUT("mipmap", ""),
        CUexternalMemory.IN("extMem", ""),
        CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.const.p.IN("mipmapDesc", "")
    )

    CUresult(
        "DestroyExternalMemory",
        "",

        CUexternalMemory.IN("extMem", "")
    )

    CUresult(
        "ImportExternalSemaphore",
        "",

        Check(1)..CUexternalSemaphore.p.OUT("extSem_out", ""),
        CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.const.p.IN("semHandleDesc", "")
    )

    CUresult(
        "SignalExternalSemaphoresAsync",
        "",

        CUexternalSemaphore.const.p.IN("extSemArray", ""),
        nullable..CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.const.p.IN("paramsArray", ""),
        AutoSize("extSemArray", "paramsArray")..unsigned_int.IN("numExtSems", ""),
        nullable..CUstream.IN("stream", "")
    ).ptsz()

    CUresult(
        "WaitExternalSemaphoresAsync",
        "",

        CUexternalSemaphore.const.p.IN("extSemArray", ""),
        nullable..CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.const.p.IN("paramsArray", ""),
        AutoSize("extSemArray", "paramsArray")..unsigned_int.IN("numExtSems", ""),
        nullable..CUstream.IN("stream", "")
    ).ptsz()

    CUresult(
        "DestroyExternalSemaphore",
        "",

        CUexternalSemaphore.IN("extSem", "")
    )

    CUresult(
        "LaunchHostFunc",
        "",

        nullable..CUstream.IN("hStream", ""),
        CUhostFn.IN("fn", ""),
        opaque_p.IN("userData", "")
    ).ptsz()

    CUresult(
        "GraphCreate",
        "",

        Check(1)..CUgraph.p.OUT("phGraph", ""),
        unsigned_int.IN("flags", "")
    )

    CUresult(
        "GraphAddKernelNode",
        "",

        Check(1)..CUgraphNode.p.OUT("phGraphNode", ""),
        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.IN("dependencies", ""),
        AutoSize("dependencies")..size_t.IN("numDependencies", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p.IN("nodeParams", "")
    )

    CUresult(
        "GraphKernelNodeGetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.p.OUT("nodeParams", "")
    )

    CUresult(
        "GraphKernelNodeSetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p.IN("nodeParams", "")
    )

    CUresult(
        "GraphAddMemcpyNode",
        "",

        Check(1)..CUgraphNode.p.OUT("phGraphNode", ""),
        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.IN("dependencies", ""),
        AutoSize("dependencies")..size_t.IN("numDependencies", ""),
        CUDA_MEMCPY3D.const.p.IN("copyParams", ""),
        CUcontext.IN("ctx", "")
    )

    CUresult(
        "GraphMemcpyNodeGetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_MEMCPY3D.p.OUT("nodeParams", "")
    )

    CUresult(
        "GraphMemcpyNodeSetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_MEMCPY3D.const.p.IN("nodeParams", "")
    )

    CUresult(
        "GraphAddMemsetNode",
        "",

        Check(1)..CUgraphNode.p.OUT("phGraphNode", ""),
        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.IN("dependencies", ""),
        AutoSize("dependencies")..size_t.IN("numDependencies", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p.IN("memsetParams", ""),
        CUcontext.IN("ctx", "")
    )

    CUresult(
        "GraphMemsetNodeGetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.p.OUT("nodeParams", "")
    )

    CUresult(
        "GraphMemsetNodeSetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p.IN("nodeParams", "")
    )

    CUresult(
        "GraphAddHostNode",
        "",

        Check(1)..CUgraphNode.p.OUT("phGraphNode", ""),
        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.IN("dependencies", ""),
        AutoSize("dependencies")..size_t.IN("numDependencies", ""),
        CUDA_HOST_NODE_PARAMS.const.p.IN("nodeParams", "")
    )

    CUresult(
        "GraphHostNodeGetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_HOST_NODE_PARAMS.p.OUT("nodeParams", "")
    )

    CUresult(
        "GraphHostNodeSetParams",
        "",

        CUgraphNode.IN("hNode", ""),
        CUDA_HOST_NODE_PARAMS.const.p.IN("nodeParams", "")
    )

    CUresult(
        "GraphAddChildGraphNode",
        "",

        Check(1)..CUgraphNode.p.OUT("phGraphNode", ""),
        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.IN("dependencies", ""),
        AutoSize("dependencies")..size_t.IN("numDependencies", ""),
        CUgraph.IN("childGraph", "")
    )

    CUresult(
        "GraphChildGraphNodeGetGraph",
        "",

        CUgraphNode.IN("hNode", ""),
        Check(1)..CUgraph.p.OUT("phGraph", "")
    )

    CUresult(
        "GraphAddEmptyNode",
        "",

        Check(1)..CUgraphNode.p.OUT("phGraphNode", ""),
        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.IN("dependencies", ""),
        AutoSize("dependencies")..size_t.IN("numDependencies", "")
    )

    CUresult(
        "GraphClone",
        "",

        Check(1)..CUgraph.p.OUT("phGraphClone", ""),
        CUgraph.IN("originalGraph", "")
    )

    CUresult(
        "GraphNodeFindInClone",
        "",

        Check(1)..CUgraphNode.p.OUT("phNode", ""),
        CUgraphNode.IN("hOriginalNode", ""),
        CUgraph.IN("hClonedGraph", "")
    )

    CUresult(
        "GraphNodeGetType",
        "",

        CUgraphNode.IN("hNode", ""),
        Check(1)..CUgraphNodeType.p.OUT("type", "")
    )

    CUresult(
        "GraphGetNodes",
        "",

        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.OUT("nodes", ""),
        AutoSize("nodes")..Check(1)..size_t.p.INOUT("numNodes", "")
    )

    CUresult(
        "GraphGetRootNodes",
        "",

        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.OUT("rootNodes", ""),
        AutoSize("rootNodes")..Check(1)..size_t.p.INOUT("numRootNodes", "")
    )

    CUresult(
        "GraphGetEdges",
        "",

        CUgraph.IN("hGraph", ""),
        nullable..CUgraphNode.p.OUT("from", ""),
        nullable..CUgraphNode.p.OUT("to", ""),
        AutoSize("from", "to")..Check(1)..size_t.p.INOUT("numEdges", "")
    )

    CUresult(
        "GraphNodeGetDependencies",
        "",

        CUgraphNode.IN("hNode", ""),
        nullable..CUgraphNode.p.OUT("dependencies", ""),
        AutoSize("dependencies")..Check(1)..size_t.p.INOUT("numDependencies", "")
    )

    CUresult(
        "GraphNodeGetDependentNodes",
        "",

        CUgraphNode.IN("hNode", ""),
        nullable..CUgraphNode.p.OUT("dependentNodes", ""),
        AutoSize("dependentNodes")..Check(1)..size_t.p.INOUT("numDependentNodes", "")
    )

    CUresult(
        "GraphAddDependencies",
        "",

        CUgraph.IN("hGraph", ""),
        CUgraphNode.p.IN("from", ""),
        CUgraphNode.p.IN("to", ""),
        AutoSize("from", "to")..size_t.IN("numDependencies", "")
    )

    CUresult(
        "GraphRemoveDependencies",
        "",

        CUgraph.IN("hGraph", ""),
        CUgraphNode.p.IN("from", ""),
        CUgraphNode.p.IN("to", ""),
        AutoSize("from", "to")..size_t.IN("numDependencies", "")
    )

    CUresult(
        "GraphDestroyNode",
        "",

        CUgraphNode.IN("hNode", "")
    )

    CUresult(
        "GraphInstantiate",
        "",

        Check(1)..CUgraphExec.p.OUT("phGraphExec", ""),
        CUgraph.IN("hGraph", ""),
        Check(1)..CUgraphNode.p.OUT("phErrorNode", ""),
        charASCII.p.OUT("logBuffer", ""),
        AutoSize("logBuffer")..size_t.IN("bufferSize", "")
    )

    CUresult(
        "GraphLaunch",
        "",

        CUgraphExec.IN("hGraphExec", ""),
        nullable..CUstream.IN("hStream", "")
    ).ptsz()

    CUresult(
        "GraphExecDestroy",
        "",

        CUgraphExec.IN("hGraphExec", "")
    )

    CUresult(
        "GraphDestroy",
        "",

        CUgraph.IN("hGraph", "")
    )
}