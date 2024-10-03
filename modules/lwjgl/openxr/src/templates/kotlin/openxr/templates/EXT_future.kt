/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_future = "EXTFuture".nativeClassXR("EXT_future", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_EXT_future">XR_EXT_future</a> extension.

        In XR systems there are certain operations that are long running and do not reasonably complete within a normal frame loop. This extension introduces the concept of a <em>future</em> which supports creation of asynchronous (async) functions for such long running operations. This extension does not include any asynchronous operations: it is expected that other extensions will use these <em>futures</em> and their associated conventions in this extension to define their asynchronous operations.

        An {@code XrFutureEXT} represents the future result of an asynchronous operation, comprising an {@code XrResult} and possibly additional outputs. Long running operations immediately return an {@code XrFutureEXT} when started, letting the application poll the state of the future, and get the result once ready by calling a "complete"-function.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_future_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_FUTURE_EXTENSION_NAME".."XR_EXT_future"
    )

    EnumConstant(
        "XR_NULL_FUTURE_EXT",

        "NULL_FUTURE_EXT".."0"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_FUTURE_PENDING_EXT".."-1000469001",
        "ERROR_FUTURE_INVALID_EXT".."-1000469002"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_FUTURE_CANCEL_INFO_EXT".."1000469000",
        "TYPE_FUTURE_POLL_INFO_EXT".."1000469001",
        "TYPE_FUTURE_COMPLETION_EXT".."1000469002",
        "TYPE_FUTURE_POLL_RESULT_EXT".."1000469003"
    )

    EnumConstant(
        """
        XrFutureStateEXT - Information on future to cancel

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FUTURE_STATE_PENDING_EXT. The state of a future that is waiting for the async operation to conclude. This is typically the initial state of a future returned from an async function.</li>
            <li>#FUTURE_STATE_READY_EXT. The state of a future when the result of the async operation is ready. The application <b>can</b> retrieve the result by calling the associated completion function.</li>
        </ul>

        A future that is not invalidated (or completed) <b>may</b> be in one of two states, {@code Pending} and {@code Ready}, represented by #FUTURE_STATE_PENDING_EXT and #FUTURE_STATE_READY_EXT respectively.

        <ul>
            <li>When successfully returned from an async function the future starts out as {@code Pending}. In this state the future <b>may</b> be polled, but <b>must</b> not be passed to a completion function. Applications <b>should</b> wait for the future to become ready and keep polling the state of the future. If a pending future is passed to the associated completion function, it <b>must</b> return #ERROR_FUTURE_PENDING_EXT.</li>
            <li>Once the asynchronous operation succeeds or fails, the state of the future moves to {@code Ready}. In the ready state the future <b>may</b> be "Completed" with the {@code Complete} function. See <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#ext_future-completing">Completing a Future</a>.</li>
            <li>After being successfully completed, the future becomes invalidated if the completion function returns a success code, and in the case of two-call idioms, the array was not {@code NULL}.</li>
            <li>After a call to #CancelFutureEXT(), the future becomes invalidated immediately and any resources associated with it <b>may</b> be freed (including handles)</li>
            <li>When the associated handle is destroyed, the futures become invalidated. See <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#ext_future-scope">Future Scope</a>.</li>
        </ul>

        A future returned from an async function <b>must</b> be in either the state #FUTURE_STATE_PENDING_EXT or #FUTURE_STATE_READY_EXT. A runtime <b>may</b> skip the {@code Pending} state and go directly to {@code Ready} if the result is immediately available.

        <h5>See Also</h5>
        ##XrFuturePollResultEXT, #CancelFutureEXT()
        """,

        "FUTURE_STATE_PENDING_EXT".."1",
        "FUTURE_STATE_READY_EXT".."2"
    )

    XrResult(
        "PollFutureEXT",
        """
        Polls the lifecycle state of an XrFuture.

        <h5>C Specification</h5>
        The #PollFutureEXT() function is defined as:

        <pre><code>
￿XrResult xrPollFutureEXT(
￿    XrInstance                                  instance,
￿    const XrFuturePollInfoEXT*                  pollInfo,
￿    XrFuturePollResultEXT*                      pollResult);</code></pre>

        <h5>Description</h5>
        Applications <b>can</b> use this function to check the current state of a future, typically while waiting for the async operation to complete and the future to become "ready" to complete.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Each {@code XrFutureEXT} value <b>must</b> be externally synchronized by the application when calling completion, polling, and cancellation functions, and when destroying the associated handle.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTFuture XR_EXT_future} extension <b>must</b> be enabled prior to calling #PollFutureEXT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code pollInfo} <b>must</b> be a pointer to a valid ##XrFuturePollInfoEXT structure</li>
            <li>{@code pollResult} <b>must</b> be a pointer to an ##XrFuturePollResultEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFuturePollInfoEXT, ##XrFuturePollResultEXT
        """,

        XrInstance("instance", "an {@code XrInstance} handle"),
        XrFuturePollInfoEXT.const.p("pollInfo", "a pointer to an ##XrFuturePollInfoEXT structure."),
        XrFuturePollResultEXT.p("pollResult", "a pointer to an ##XrFuturePollResultEXT structure to be populated on a successful call.")
    )

    XrResult(
        "CancelFutureEXT",
        """
        Cancel future.

        <h5>C Specification</h5>
        The #CancelFutureEXT() function is defined as:

        <pre><code>
￿XrResult xrCancelFutureEXT(
￿    XrInstance                                  instance,
￿    const XrFutureCancelInfoEXT*                cancelInfo);</code></pre>

        <h5>Description</h5>
        This function cancels the future and signals that the async operation is not required. After a future has been cancelled any functions using this future <b>must</b> return #ERROR_FUTURE_INVALID_EXT.

        A runtime <b>may</b> stop the asynchronous operation associated with a future after an app has cancelled it.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Each {@code XrFutureEXT} value <b>must</b> be externally synchronized by the application when calling completion, polling, and cancellation functions, or destroying the associated handle.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTFuture XR_EXT_future} extension <b>must</b> be enabled prior to calling #CancelFutureEXT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code cancelInfo} <b>must</b> be a pointer to a valid ##XrFutureCancelInfoEXT structure</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to the {@code future} member of the {@code cancelInfo} parameter <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFutureCancelInfoEXT
        """,

        XrInstance("instance", "an {@code XrInstance} handle"),
        XrFutureCancelInfoEXT.const.p("cancelInfo", "a pointer to an ##XrFutureCancelInfoEXT structure.")
    )
}