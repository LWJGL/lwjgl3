/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU101 extends CU100 {

    /**
     * Possible modes for stream capture thread interactions. ({@code CUstreamCaptureMode})
     * 
     * <p>For more details see {@link CU100#cuStreamBeginCapture StreamBeginCapture} and {@link #cuThreadExchangeStreamCaptureMode ThreadExchangeStreamCaptureMode}</p>
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

    protected CU101() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            StreamBeginCapture_v2           = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamBeginCapture_v2")),
            ThreadExchangeStreamCaptureMode = apiGetFunctionAddress(CU.getLibrary(), "cuThreadExchangeStreamCaptureMode"),
            StreamGetCaptureInfo            = apiGetFunctionAddress(CU.getLibrary(), "cuStreamGetCaptureInfo"),
            GraphExecKernelNodeSetParams    = apiGetFunctionAddress(CU.getLibrary(), "cuGraphExecKernelNodeSetParams");

    }

    // --- [ cuStreamBeginCapture_v2 ] ---

    @NativeType("CUresult")
    public static int cuStreamBeginCapture_v2(@NativeType("CUstream") long hStream, @NativeType("CUstreamCaptureMode") int mode) {
        long __functionAddress = Functions.StreamBeginCapture_v2;
        return callPI(hStream, mode, __functionAddress);
    }

    // --- [ cuThreadExchangeStreamCaptureMode ] ---

    /** Unsafe version of: {@link #cuThreadExchangeStreamCaptureMode ThreadExchangeStreamCaptureMode} */
    public static int ncuThreadExchangeStreamCaptureMode(long mode) {
        long __functionAddress = Functions.ThreadExchangeStreamCaptureMode;
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
     * <p>During stream capture (see {@link CU100#cuStreamBeginCapture StreamBeginCapture}), some actions, such as a call to {@code cudaMalloc}, may be unsafe. In the case of {@code cudaMalloc},
     * the operation is not enqueued asynchronously to a stream, and is not observed by stream capture. Therefore, if the sequence of operations captured via
     * {@code cuStreamBeginCapture} depended on the allocation being replayed whenever the graph is launched, the captured graph would be invalid.</p>
     * 
     * <p>Therefore, stream capture places restrictions on API calls that can be made within or concurrently to a {@code cuStreamBeginCapture-cuStreamEndCapture}
     * sequence. This behavior can be controlled via this API and flags to {@code cuStreamBeginCapture}.</p>
     * 
     * <p>A thread's mode is one of the following:</p>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_GLOBAL STREAM_CAPTURE_MODE_GLOBAL}: This is the default mode.
     * 
     * <p>If the local thread has an ongoing capture sequence that was not initiated with {@code CU_STREAM_CAPTURE_MODE_RELAXED} at
     * {@code cuStreamBeginCapture}, or if any other thread has a concurrent capture sequence initiated with {@code CU_STREAM_CAPTURE_MODE_GLOBAL}, this
     * thread is prohibited from potentially unsafe API calls.</p></li>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_THREAD_LOCAL STREAM_CAPTURE_MODE_THREAD_LOCAL}: If the local thread has an ongoing capture sequence not initiated with {@code CU_STREAM_CAPTURE_MODE_RELAXED},
     * it is prohibited from potentially unsafe API calls. Concurrent capture sequences in other threads are ignored.</li>
     * <li>{@link #CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED}: The local thread is not prohibited from potentially unsafe API calls. Note that the thread is still prohibited from
     * API calls which necessarily conflict with stream capture, for example, attempting {@link CU#cuEventQuery EventQuery} on an event that was last recorded inside a capture
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

    // --- [ cuStreamGetCaptureInfo ] ---

    /** Unsafe version of: {@link #cuStreamGetCaptureInfo StreamGetCaptureInfo} */
    public static int ncuStreamGetCaptureInfo(long hStream, long captureStatus, long id) {
        long __functionAddress = Functions.StreamGetCaptureInfo;
        if (CHECKS) {
            check(hStream);
        }
        return callPPPI(hStream, captureStatus, id, __functionAddress);
    }

    /**
     * Query capture status of a stream.
     * 
     * <p>Query the capture status of a stream and and get an id for the capture sequence, which is unique over the lifetime of the process.</p>
     * 
     * <p>If called on {@link CU70#CU_STREAM_LEGACY STREAM_LEGACY} (the "null stream") while a stream not created with {@link CU#CU_STREAM_NON_BLOCKING STREAM_NON_BLOCKING} is capturing, returns
     * {@link CU#CUDA_ERROR_STREAM_CAPTURE_IMPLICIT}.</p>
     * 
     * <p>A valid id is returned only if both of the following are true:</p>
     * 
     * <ul>
     * <li>the call returns {@link NVRTC#NVRTC_SUCCESS SUCCESS}</li>
     * <li>{@code captureStatus} is set to {@link CU100#CU_STREAM_CAPTURE_STATUS_ACTIVE STREAM_CAPTURE_STATUS_ACTIVE}</li>
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

    // --- [ cuGraphExecKernelNodeSetParams ] ---

    /** Unsafe version of: {@link #cuGraphExecKernelNodeSetParams GraphExecKernelNodeSetParams} */
    public static int ncuGraphExecKernelNodeSetParams(long hGraphExec, long hNode, long nodeParams) {
        long __functionAddress = Functions.GraphExecKernelNodeSetParams;
        if (CHECKS) {
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

}