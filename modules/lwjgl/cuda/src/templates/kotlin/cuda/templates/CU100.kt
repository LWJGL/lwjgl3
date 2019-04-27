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

        Check(8)..char.p("luid", ""), // TODO: 8?
        Check(1)..unsigned_int.p("deviceNodeMask", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "StreamBeginCapture",
        "",

        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "StreamEndCapture",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUgraph.p("phGraph", "")
    ).ptsz()

    CUresult(
        "StreamIsCapturing",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p("captureStatus", "")
    ).ptsz()

    CUresult(
        "ImportExternalMemory",
        "",

        Check(1)..CUexternalMemory.p("extMem_out", ""),
        CUDA_EXTERNAL_MEMORY_HANDLE_DESC.const.p("memHandleDesc", "")
    )

    CUresult(
        "ExternalMemoryGetMappedBuffer",
        "",

        Check(1)..CUdeviceptr.p("devPtr", ""),
        CUexternalMemory("extMem", ""),
        CUDA_EXTERNAL_MEMORY_BUFFER_DESC.const.p("bufferDesc", "")
    )

    CUresult(
        "ExternalMemoryGetMappedMipmappedArray",
        "",

        Check(1)..CUmipmappedArray.p("mipmap", ""),
        CUexternalMemory("extMem", ""),
        CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.const.p("mipmapDesc", "")
    )

    CUresult(
        "DestroyExternalMemory",
        "",

        CUexternalMemory("extMem", "")
    )

    CUresult(
        "ImportExternalSemaphore",
        "",

        Check(1)..CUexternalSemaphore.p("extSem_out", ""),
        CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.const.p("semHandleDesc", "")
    )

    CUresult(
        "SignalExternalSemaphoresAsync",
        "",

        CUexternalSemaphore.const.p("extSemArray", ""),
        nullable..CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.const.p("paramsArray", ""),
        AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", ""),
        nullable..CUstream("stream", "")
    ).ptsz()

    CUresult(
        "WaitExternalSemaphoresAsync",
        "",

        CUexternalSemaphore.const.p("extSemArray", ""),
        nullable..CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.const.p("paramsArray", ""),
        AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", ""),
        nullable..CUstream("stream", "")
    ).ptsz()

    CUresult(
        "DestroyExternalSemaphore",
        "",

        CUexternalSemaphore("extSem", "")
    )

    CUresult(
        "LaunchHostFunc",
        "",

        nullable..CUstream("hStream", ""),
        CUhostFn("fn", ""),
        opaque_p("userData", "")
    ).ptsz()

    CUresult(
        "GraphCreate",
        "",

        Check(1)..CUgraph.p("phGraph", ""),
        unsigned_int("flags", "")
    )

    CUresult(
        "GraphAddKernelNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "")
    )

    CUresult(
        "GraphKernelNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.p("nodeParams", "")
    )

    CUresult(
        "GraphKernelNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "")
    )

    CUresult(
        "GraphAddMemcpyNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_MEMCPY3D.const.p("copyParams", ""),
        CUcontext("ctx", "")
    )

    CUresult(
        "GraphMemcpyNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMCPY3D.p("nodeParams", "")
    )

    CUresult(
        "GraphMemcpyNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMCPY3D.const.p("nodeParams", "")
    )

    CUresult(
        "GraphAddMemsetNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p("memsetParams", ""),
        CUcontext("ctx", "")
    )

    CUresult(
        "GraphMemsetNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.p("nodeParams", "")
    )

    CUresult(
        "GraphMemsetNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p("nodeParams", "")
    )

    CUresult(
        "GraphAddHostNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "")
    )

    CUresult(
        "GraphHostNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_HOST_NODE_PARAMS.p("nodeParams", "")
    )

    CUresult(
        "GraphHostNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "")
    )

    CUresult(
        "GraphAddChildGraphNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUgraph("childGraph", "")
    )

    CUresult(
        "GraphChildGraphNodeGetGraph",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUgraph.p("phGraph", "")
    )

    CUresult(
        "GraphAddEmptyNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", "")
    )

    CUresult(
        "GraphClone",
        "",

        Check(1)..CUgraph.p("phGraphClone", ""),
        CUgraph("originalGraph", "")
    )

    CUresult(
        "GraphNodeFindInClone",
        "",

        Check(1)..CUgraphNode.p("phNode", ""),
        CUgraphNode("hOriginalNode", ""),
        CUgraph("hClonedGraph", "")
    )

    CUresult(
        "GraphNodeGetType",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUgraphNodeType.p("type", "")
    )

    CUresult(
        "GraphGetNodes",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.p("nodes", ""),
        AutoSize("nodes")..Check(1)..size_t.p("numNodes", "")
    )

    CUresult(
        "GraphGetRootNodes",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.p("rootNodes", ""),
        AutoSize("rootNodes")..Check(1)..size_t.p("numRootNodes", "")
    )

    CUresult(
        "GraphGetEdges",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.p("from", ""),
        nullable..CUgraphNode.p("to", ""),
        AutoSize("from", "to")..Check(1)..size_t.p("numEdges", "")
    )

    CUresult(
        "GraphNodeGetDependencies",
        "",

        CUgraphNode("hNode", ""),
        nullable..CUgraphNode.p("dependencies", ""),
        AutoSize("dependencies")..Check(1)..size_t.p("numDependencies", "")
    )

    CUresult(
        "GraphNodeGetDependentNodes",
        "",

        CUgraphNode("hNode", ""),
        nullable..CUgraphNode.p("dependentNodes", ""),
        AutoSize("dependentNodes")..Check(1)..size_t.p("numDependentNodes", "")
    )

    CUresult(
        "GraphAddDependencies",
        "",

        CUgraph("hGraph", ""),
        CUgraphNode.const.p("from", ""),
        CUgraphNode.const.p("to", ""),
        AutoSize("from", "to")..size_t("numDependencies", "")
    )

    CUresult(
        "GraphRemoveDependencies",
        "",

        CUgraph("hGraph", ""),
        CUgraphNode.const.p("from", ""),
        CUgraphNode.const.p("to", ""),
        AutoSize("from", "to")..size_t("numDependencies", "")
    )

    CUresult(
        "GraphDestroyNode",
        "",

        CUgraphNode("hNode", "")
    )

    CUresult(
        "GraphInstantiate",
        "",

        Check(1)..CUgraphExec.p("phGraphExec", ""),
        CUgraph("hGraph", ""),
        Check(1)..CUgraphNode.p("phErrorNode", ""),
        charASCII.p("logBuffer", ""),
        AutoSize("logBuffer")..size_t("bufferSize", "")
    )

    CUresult(
        "GraphLaunch",
        "",

        CUgraphExec("hGraphExec", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "GraphExecDestroy",
        "",

        CUgraphExec("hGraphExec", "")
    )

    CUresult(
        "GraphDestroy",
        "",

        CUgraph("hGraph", "")
    )
}