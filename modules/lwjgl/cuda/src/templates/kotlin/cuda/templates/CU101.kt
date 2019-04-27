/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU101 = "CU101".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU100
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        """
        Possible modes for stream capture thread interactions. ({@code CUstreamCaptureMode})

        For more details see #StreamBeginCapture() and #ThreadExchangeStreamCaptureMode()
        """,

        "STREAM_CAPTURE_MODE_GLOBAL".enum("", "0"),
        "STREAM_CAPTURE_MODE_THREAD_LOCAL".enum,
        "STREAM_CAPTURE_MODE_RELAXED".enum
    )

    CUresult(
        "StreamBeginCapture_v2",
        "",

        nullable..CUstream("hStream", ""),
        CUstreamCaptureMode("mode", "")
    ).ptsz()

    CUresult(
        "ThreadExchangeStreamCaptureMode",
        """
        Swaps the stream capture interaction mode for a thread.

        Sets the calling thread's stream capture interaction mode to the value contained in {@code *mode}, and overwrites {@code *mode} with the previous mode
        for the thread. To facilitate deterministic behavior across function or module boundaries, callers are encouraged to use this API in a push-pop
        fashion:
        ${codeBlock("""
CUstreamCaptureMode mode = desiredMode
cuThreadExchangeStreamCaptureMode(&mode);
...
cuThreadExchangeStreamCaptureMode(&mode); // restore previous mode""")}

        During stream capture (see #StreamBeginCapture()), some actions, such as a call to {@code cudaMalloc}, may be unsafe. In the case of {@code cudaMalloc},
        the operation is not enqueued asynchronously to a stream, and is not observed by stream capture. Therefore, if the sequence of operations captured via
        {@code cuStreamBeginCapture} depended on the allocation being replayed whenever the graph is launched, the captured graph would be invalid.

        Therefore, stream capture places restrictions on API calls that can be made within or concurrently to a {@code cuStreamBeginCapture-cuStreamEndCapture}
        sequence. This behavior can be controlled via this API and flags to {@code cuStreamBeginCapture}.

        A thread's mode is one of the following:
        ${ul(
            """
            #STREAM_CAPTURE_MODE_GLOBAL: This is the default mode.

            If the local thread has an ongoing capture sequence that was not initiated with {@code CU_STREAM_CAPTURE_MODE_RELAXED} at
            {@code cuStreamBeginCapture}, or if any other thread has a concurrent capture sequence initiated with {@code CU_STREAM_CAPTURE_MODE_GLOBAL}, this
            thread is prohibited from potentially unsafe API calls.
            """,
            """
            #STREAM_CAPTURE_MODE_THREAD_LOCAL: If the local thread has an ongoing capture sequence not initiated with {@code CU_STREAM_CAPTURE_MODE_RELAXED},
            it is prohibited from potentially unsafe API calls. Concurrent capture sequences in other threads are ignored.
            """,
            """
            #STREAM_CAPTURE_MODE_RELAXED: The local thread is not prohibited from potentially unsafe API calls. Note that the thread is still prohibited from
            API calls which necessarily conflict with stream capture, for example, attempting #EventQuery() on an event that was last recorded inside a capture
            sequence.
            """
        )}
        """,

        Check(1)..CUstreamCaptureMode.p("mode", "pointer to mode value to swap with the current mode")
    )

    CUresult(
        "StreamGetCaptureInfo",
        """
        Query capture status of a stream.

        Query the capture status of a stream and and get an id for the capture sequence, which is unique over the lifetime of the process.

        If called on #STREAM_LEGACY (the "null stream") while a stream not created with #STREAM_NON_BLOCKING is capturing, returns
        #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT.

        A valid id is returned only if both of the following are true:
        ${ul(
            "the call returns #SUCCESS",
            "{@code captureStatus} is set to #STREAM_CAPTURE_STATUS_ACTIVE"
        )}
        """,
        CUstream("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p("captureStatus", ""),
        Check(1)..cuuint64_t.p("id", "")
    )

    CUresult(
        "GraphExecKernelNodeSetParams",
        """
        Sets the parameters for a kernel node in the given {@code graphExec}.

        Sets the parameters of a kernel node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
        non-executable graph, from which the executable graph was instantiated.

        {@code hNode} must not have been removed from the original graph. The {@code func} field of {@code nodeParams} cannot be modified and must match the
        original value. All other values can be modified.

        The modifications take effect at the next launch of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "kernel node from the graph from which graphExec was instantiated"),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "updated parameters to set")
    )
}