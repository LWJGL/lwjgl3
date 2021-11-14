/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_exec_by_local_thread.txt">intel_exec_by_local_thread</a> extension.
 * 
 * <p>This extension allows the user to execute OpenCL tasks and kernels with the user application's threads. The extension defines a token that can be passed
 * to {@link CL10#clCreateCommandQueue CreateCommandQueue}, creating a queue with the "thread local exec" capability.</p>
 * 
 * <p>All enqueue APIs (e.g., {@code clEnqueueRead}) submitted to such a queue never enqueue commands. An Enqueue API call is executed by the caller
 * host-thread itself without involving any of the OpenCL runtime threads, much like function calls. The queue would typically stay empty - the queue
 * handler argument is used only for compatibility of the enqueue APIs (i.e., keeping the same API signatures) and checking, at runtime, whether the
 * enqueue API needs to be executed in such a fashion. Enqueue API calls on a "local" command queue can still use event dependency lists and output
 * events. A non-{@code NULL} event dependency list will block the caller application thread until all the corresponding events are completed. Output events will
 * be accessible only after the return of the enqueue API call (as with regular command queues) and should always have <strong>completed</strong> status
 * (as expected). They might be useful for querying event status and profiling data. "Local" command queues behave the same regardless if they are defined
 * as in-order or out-of-order. However, with in-order queues, threads may be blocked until execution of previously enqueued commands (by other threads)
 * is completed. Given an enqueue API with a blocking flag (e.g., {@link CL10#clEnqueueReadBuffer EnqueueReadBuffer}), both its blocking non-blocking calls behave the same
 * and have the exact same impact on the application. Calls to {@link CL10#clFinish Finish} and {@link CL10#clFlush Flush}, {@link CL10#clEnqueueBarrier EnqueueBarrier} and
 * {@link CL10#clEnqueueMarker EnqueueMarker} are valid although meaningless for these command queues. An optimal implementation of these APIs for Immediate command
 * queues will incur the minimal overhead of a function call and possibly an if-then-else to distinguish between a local command queue and a regular one.
 * {@link CL10#clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link CL10#clEnqueueTask EnqueueTask} should have optimized implementations using a single execution thread.</p>
 */
public final class INTELExecByLocalThread {

    /** cl_command_queue_properties */
    public static final int CL_QUEUE_THREAD_LOCAL_EXEC_ENABLE_INTEL = 1 << 31;

    private INTELExecByLocalThread() {}

}