/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_EXT_future">XR_EXT_future</a> extension.
 * 
 * <p>In XR systems there are certain operations that are long running and do not reasonably complete within a normal frame loop. This extension introduces the concept of a <em>future</em> which supports creation of asynchronous (async) functions for such long running operations. This extension does not include any asynchronous operations: it is expected that other extensions will use these <em>futures</em> and their associated conventions in this extension to define their asynchronous operations.</p>
 * 
 * <p>An {@code XrFutureEXT} represents the future result of an asynchronous operation, comprising an {@code XrResult} and possibly additional outputs. Long running operations immediately return an {@code XrFutureEXT} when started, letting the application poll the state of the future, and get the result once ready by calling a "complete"-function.</p>
 */
public class EXTFuture {

    /** The extension specification version. */
    public static final int XR_EXT_future_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_FUTURE_EXTENSION_NAME = "XR_EXT_future";

    /** XR_NULL_FUTURE_EXT */
    public static final int XR_NULL_FUTURE_EXT = 0;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link #XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_FUTURE_PENDING_EXT = -1000469001,
        XR_ERROR_FUTURE_INVALID_EXT = -1000469002;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_FUTURE_CANCEL_INFO_EXT TYPE_FUTURE_CANCEL_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_FUTURE_POLL_INFO_EXT TYPE_FUTURE_POLL_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_FUTURE_COMPLETION_EXT TYPE_FUTURE_COMPLETION_EXT}</li>
     * <li>{@link #XR_TYPE_FUTURE_POLL_RESULT_EXT TYPE_FUTURE_POLL_RESULT_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_FUTURE_CANCEL_INFO_EXT = 1000469000,
        XR_TYPE_FUTURE_POLL_INFO_EXT   = 1000469001,
        XR_TYPE_FUTURE_COMPLETION_EXT  = 1000469002,
        XR_TYPE_FUTURE_POLL_RESULT_EXT = 1000469003;

    /**
     * XrFutureStateEXT - Information on future to cancel
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FUTURE_STATE_PENDING_EXT FUTURE_STATE_PENDING_EXT}. The state of a future that is waiting for the async operation to conclude. This is typically the initial state of a future returned from an async function.</li>
     * <li>{@link #XR_FUTURE_STATE_READY_EXT FUTURE_STATE_READY_EXT}. The state of a future when the result of the async operation is ready. The application <b>can</b> retrieve the result by calling the associated completion function.</li>
     * </ul>
     * 
     * <p>A future that is not invalidated (or completed) <b>may</b> be in one of two states, {@code Pending} and {@code Ready}, represented by {@link #XR_FUTURE_STATE_PENDING_EXT FUTURE_STATE_PENDING_EXT} and {@link #XR_FUTURE_STATE_READY_EXT FUTURE_STATE_READY_EXT} respectively.</p>
     * 
     * <ul>
     * <li>When successfully returned from an async function the future starts out as {@code Pending}. In this state the future <b>may</b> be polled, but <b>must</b> not be passed to a completion function. Applications <b>should</b> wait for the future to become ready and keep polling the state of the future. If a pending future is passed to the associated completion function, it <b>must</b> return {@link #XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}.</li>
     * <li>Once the asynchronous operation succeeds or fails, the state of the future moves to {@code Ready}. In the ready state the future <b>may</b> be "Completed" with the {@code Complete} function. See <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#ext_future-completing">ext_future-completing</a>.</li>
     * <li>After being successfully completed, the future becomes invalidated if the completion function returns a success code, and in the case of two-call idioms, the array was not {@code NULL}.</li>
     * <li>After a call to {@link #xrCancelFutureEXT CancelFutureEXT}, the future becomes invalidated immediately and any resources associated with it <b>may</b> be freed (including handles)</li>
     * <li>When the associated handle is destroyed, the futures become invalidated. See <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#ext_future-scope">ext_future-scope</a>.</li>
     * </ul>
     * 
     * <p>A future returned from an async function <b>must</b> be in either the state {@link #XR_FUTURE_STATE_PENDING_EXT FUTURE_STATE_PENDING_EXT} or {@link #XR_FUTURE_STATE_READY_EXT FUTURE_STATE_READY_EXT}. A runtime <b>may</b> skip the {@code Pending} state and go directly to {@code Ready} if the result is immediately available.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFuturePollResultEXT}, {@link #xrCancelFutureEXT CancelFutureEXT}</p>
     */
    public static final int
        XR_FUTURE_STATE_PENDING_EXT = 1,
        XR_FUTURE_STATE_READY_EXT   = 2;

    protected EXTFuture() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPollFutureEXT ] ---

    /** Unsafe version of: {@link #xrPollFutureEXT PollFutureEXT} */
    public static int nxrPollFutureEXT(XrInstance instance, long pollInfo, long pollResult) {
        long __functionAddress = instance.getCapabilities().xrPollFutureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pollInfo, pollResult, __functionAddress);
    }

    /**
     * Polls the lifecycle state of an XrFuture.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPollFutureEXT PollFutureEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPollFutureEXT(
     *     XrInstance                                  instance,
     *     const XrFuturePollInfoEXT*                  pollInfo,
     *     XrFuturePollResultEXT*                      pollResult);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Applications <b>can</b> use this function to check the current state of a future, typically while waiting for the async operation to complete and the future to become "ready" to complete.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Each {@code XrFutureEXT} value <b>must</b> be externally synchronized by the application when calling completion, polling, and cancellation functions, and when destroying the associated handle.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTFuture XR_EXT_future} extension <b>must</b> be enabled prior to calling {@link #xrPollFutureEXT PollFutureEXT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code pollInfo} <b>must</b> be a pointer to a valid {@link XrFuturePollInfoEXT} structure</li>
     * <li>{@code pollResult} <b>must</b> be a pointer to an {@link XrFuturePollResultEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFuturePollInfoEXT}, {@link XrFuturePollResultEXT}</p>
     *
     * @param instance   an {@code XrInstance} handle
     * @param pollInfo   a pointer to an {@link XrFuturePollInfoEXT} structure.
     * @param pollResult a pointer to an {@link XrFuturePollResultEXT} structure to be populated on a successful call.
     */
    @NativeType("XrResult")
    public static int xrPollFutureEXT(XrInstance instance, @NativeType("XrFuturePollInfoEXT const *") XrFuturePollInfoEXT pollInfo, @NativeType("XrFuturePollResultEXT *") XrFuturePollResultEXT pollResult) {
        return nxrPollFutureEXT(instance, pollInfo.address(), pollResult.address());
    }

    // --- [ xrCancelFutureEXT ] ---

    /** Unsafe version of: {@link #xrCancelFutureEXT CancelFutureEXT} */
    public static int nxrCancelFutureEXT(XrInstance instance, long cancelInfo) {
        long __functionAddress = instance.getCapabilities().xrCancelFutureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), cancelInfo, __functionAddress);
    }

    /**
     * Cancel future.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCancelFutureEXT CancelFutureEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCancelFutureEXT(
     *     XrInstance                                  instance,
     *     const XrFutureCancelInfoEXT*                cancelInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function cancels the future and signals that the async operation is not required. After a future has been cancelled any functions using this future <b>must</b> return {@link #XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}.</p>
     * 
     * <p>A runtime <b>may</b> stop the asynchronous operation associated with a future after an app has cancelled it.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Each {@code XrFutureEXT} value <b>must</b> be externally synchronized by the application when calling completion, polling, and cancellation functions, or destroying the associated handle.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTFuture XR_EXT_future} extension <b>must</b> be enabled prior to calling {@link #xrCancelFutureEXT CancelFutureEXT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code cancelInfo} <b>must</b> be a pointer to a valid {@link XrFutureCancelInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to the {@code future} member of the {@code cancelInfo} parameter <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link #XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFutureCancelInfoEXT}</p>
     *
     * @param instance   an {@code XrInstance} handle
     * @param cancelInfo a pointer to an {@link XrFutureCancelInfoEXT} structure.
     */
    @NativeType("XrResult")
    public static int xrCancelFutureEXT(XrInstance instance, @NativeType("XrFutureCancelInfoEXT const *") XrFutureCancelInfoEXT cancelInfo) {
        return nxrCancelFutureEXT(instance, cancelInfo.address());
    }

}