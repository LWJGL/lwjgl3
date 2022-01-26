/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_deferred_host_operations = "KHRDeferredHostOperations".nativeClassVK("KHR_deferred_host_operations", type = "device", postfix = "KHR") {
    documentation =
        """
        The {@link KHRDeferredHostOperations VK_KHR_deferred_host_operations} extension defines the infrastructure and usage patterns for deferrable commands, but does not specify any commands as deferrable. This is left to additional dependent extensions. Commands <b>must</b> not be deferred unless the deferral is specifically allowed by another extension which depends on {@link KHRDeferredHostOperations VK_KHR_deferred_host_operations}.

        <h5>Code Examples</h5>
        The following examples will illustrate the concept of deferrable operations using a hypothetical example. The command {@code vkDoSomethingExpensiveEXT} denotes a deferrable command. The structure stext:VkExpensiveOperationArgsEXT represents the arguments which it would normally accept.

        The following example illustrates how a vulkan application might request deferral of an expensive operation:

        <pre><code>
￿// create a deferred operation
￿VkDeferredOperationKHR hOp;
￿VkResult result = vkCreateDeferredOperationKHR(device, pCallbacks, &amp;hOp);
￿assert(result == VK_SUCCESS);
￿
￿result = vkDoSomethingExpensive(device, hOp, ...);
￿assert( result == VK_OPERATION_DEFERRED_KHR );
￿
￿// operation was deferred.  Execute it asynchronously
￿std::async::launch(
￿    [ hOp ] ( )
￿    {
￿        vkDeferredOperationJoinKHR(device, hOp);
￿
￿        result = vkGetDeferredOperationResultKHR(device, hOp);
￿
￿        // deferred operation is now complete.  'result' indicates success or failure
￿
￿        vkDestroyDeferredOperationKHR(device, hOp, pCallbacks);
￿    }
￿);</code></pre>

        The following example illustrates extracting concurrency from a single deferred operation:

        <pre><code>
￿// create a deferred operation
￿VkDeferredOperationKHR hOp;
￿VkResult result = vkCreateDeferredOperationKHR(device, pCallbacks, &amp;hOp);
￿assert(result == VK_SUCCESS);
￿
￿result = vkDoSomethingExpensive(device, hOp, ...);
￿assert( result == VK_OPERATION_DEFERRED_KHR );
￿
￿// Query the maximum amount of concurrency and clamp to the desired maximum
￿uint32_t numLaunches = std::min(vkGetDeferredOperationMaxConcurrencyKHR(device, hOp), maxThreads);
￿
￿std::vector&lt;std::future&lt;void&gt; &gt; joins;
￿
￿for (uint32_t i = 0; i &lt; numLaunches; i++) {
￿  joins.emplace_back(std::async::launch(
￿    [ hOp ] ( )
￿    {
￿        vkDeferredOperationJoinKHR(device, hOp);
￿                // in a job system, a return of VK_THREAD_IDLE_KHR should queue another
￿                // job, but it is not functionally required
￿    }
￿  );
￿}
￿
￿for (auto &amp;f : joins) {
￿  f.get();
￿}
￿
￿result = vkGetDeferredOperationResultKHR(device, hOp);
￿
￿// deferred operation is now complete.  'result' indicates success or failure
￿
￿vkDestroyDeferredOperationKHR(device, hOp, pCallbacks);</code></pre>

        The following example shows a subroutine which guarantees completion of a deferred operation, in the presence of multiple worker threads, and returns the result of the operation.

        <pre><code>
￿VkResult FinishDeferredOperation(VkDeferredOperationKHR hOp)
￿{
￿    // Attempt to join the operation until the implementation indicates that we should stop
￿
￿    VkResult result = vkDeferredOperationJoinKHR(device, hOp);
￿    while( result == VK_THREAD_IDLE_KHR )
￿    {
￿        std::this_thread::yield();
￿        result = vkDeferredOperationJoinKHR(device, hOp);
￿    }
￿
￿    switch( result )
￿    {
￿    case VK_SUCCESS:
￿        {
￿            // deferred operation has finished.  Query its result
￿            result = vkGetDeferredOperationResultKHR(device, hOp);
￿        }
￿        break;
￿
￿    case VK_THREAD_DONE_KHR:
￿        {
￿            // deferred operation is being wrapped up by another thread
￿            //  wait for that thread to finish
￿            do
￿            {
￿                std::this_thread::yield();
￿                result = vkGetDeferredOperationResultKHR(device, hOp);
￿            } while( result == VK_NOT_READY );
￿        }
￿        break;
￿
￿    default:
￿        assert(false); // other conditions are illegal.
￿        break;
￿    }
￿
￿    return result;
￿}</code></pre>

        <h5>VK_KHR_deferred_host_operations</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_deferred_host_operations}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>269</dd>

            <dt><b>Revision</b></dt>
            <dd>4</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Josh Barczak <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_deferred_host_operations]%20@jbarczak%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_deferred_host_operations%20extension%3E%3E">jbarczak</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-11-12</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Joshua Barczak, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Slawek Grajewski, Intel</li>
                <li>Tobias Hector, AMD</li>
                <li>Yuriy O’Donnell, Epic</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Baldur Karlsson, Valve</li>
                <li>Jesse Barker, Unity</li>
                <li>Contributors to VK_KHR_acceleration_structure, VK_KHR_ray_tracing_pipeline</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DEFERRED_HOST_OPERATIONS_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME".."VK_KHR_deferred_host_operations"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_DEFERRED_OPERATION_KHR".."1000268000"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "THREAD_IDLE_KHR".."1000268000",
        "THREAD_DONE_KHR".."1000268001",
        "OPERATION_DEFERRED_KHR".."1000268002",
        "OPERATION_NOT_DEFERRED_KHR".."1000268003"
    )

    VkResult(
        "CreateDeferredOperationKHR",
        """
        Create a deferred operation handle.

        <h5>C Specification</h5>
        To construct the tracking object for a deferred command, call:

        <pre><code>
￿VkResult vkCreateDeferredOperationKHR(
￿    VkDevice                                    device,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDeferredOperationKHR*                     pDeferredOperation);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDeferredOperation} <b>must</b> be a valid pointer to a {@code VkDeferredOperationKHR} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the device which owns {@code operation}."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDeferredOperationKHR.p("pDeferredOperation", "a pointer to a handle in which the created {@code VkDeferredOperationKHR} is returned.")
    )

    void(
        "DestroyDeferredOperationKHR",
        """
        Destroy a deferred operation handle.

        <h5>C Specification</h5>
        When a deferred operation is completed, the application <b>can</b> destroy the tracking object by calling:

        <pre><code>
￿void vkDestroyDeferredOperationKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      operation,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code operation} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code operation} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
            <li>{@code operation} <b>must</b> be completed</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code operation} is not #NULL_HANDLE, {@code operation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code operation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code operation} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the device which owns {@code operation}."),
        VkDeferredOperationKHR("operation", "the completed operation to be destroyed."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    uint32_t(
        "GetDeferredOperationMaxConcurrencyKHR",
        """
        Query the maximum concurrency on a deferred operation.

        <h5>C Specification</h5>
        To query the number of additional threads that can usefully be joined to a deferred operation, call:

        <pre><code>
￿uint32_t vkGetDeferredOperationMaxConcurrencyKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      operation);</code></pre>

        <h5>Description</h5>
        The returned value is the maximum number of threads that can usefully execute a deferred operation concurrently, reported for the state of the deferred operation at the point this command is called. This value is intended to be used to better schedule work onto available threads. Applications <b>can</b> join any number of threads to the deferred operation and expect it to eventually complete, though excessive joins <b>may</b> return #THREAD_DONE_KHR immediately, performing no useful work.

        If {@code operation} is complete, {@code vkGetDeferredOperationMaxConcurrencyKHR} returns zero.

        If {@code operation} is currently joined to any threads, the value returned by this command <b>may</b> immediately be out of date.

        If {@code operation} is pending, implementations <b>must</b> not return zero unless at least one thread is currently executing #DeferredOperationJoinKHR() on {@code operation}. If there are such threads, the implementation <b>should</b> return an estimate of the number of additional threads which it could profitably use.

        Implementations <b>may</b> return <code>2<sup>32</sup>-1</code> to indicate that the maximum concurrency is unknown and cannot be easily derived. Implementations <b>may</b> return values larger than the maximum concurrency available on the host CPU. In these situations, an application <b>should</b> clamp the return value rather than oversubscribing the machine.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The recommended usage pattern for applications is to query this value once, after deferral, and schedule no more than the specified number of threads to join the operation. Each time a joined thread receives #THREAD_IDLE_KHR, the application should schedule an additional join at some point in the future, but is not required to do so.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code operation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code operation} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the device which owns {@code operation}."),
        VkDeferredOperationKHR("operation", "the deferred operation to be queried.")
    )

    VkResult(
        "GetDeferredOperationResultKHR",
        """
        Query the result of a deferred operation.

        <h5>C Specification</h5>
        The {@code vkGetDeferredOperationResultKHR} function is defined as:

        <pre><code>
￿VkResult vkGetDeferredOperationResultKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      operation);</code></pre>

        <h5>Description</h5>
        If no command has been deferred on {@code operation}, {@code vkGetDeferredOperationResultKHR} returns #SUCCESS.

        If the deferred operation is pending, {@code vkGetDeferredOperationResultKHR} returns #NOT_READY.

        If the deferred operation is complete, it returns the appropriate return value from the original command. This value <b>must</b> be one of the {@code VkResult} values which could have been returned by the original command if the operation had not been deferred.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code operation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code operation} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#NOT_READY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device which owns {@code operation}."),
        VkDeferredOperationKHR("operation", "the operation whose deferred result is being queried.")
    )

    VkResult(
        "DeferredOperationJoinKHR",
        """
        Assign a thread to a deferred operation.

        <h5>C Specification</h5>
        To assign a thread to a deferred operation, call:

        <pre><code>
￿VkResult vkDeferredOperationJoinKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      operation);</code></pre>

        <h5>Description</h5>
        The {@code vkDeferredOperationJoinKHR} command will execute a portion of the deferred operation on the calling thread.

        The return value will be one of the following:

        <ul>
            <li>A return value of #SUCCESS indicates that {@code operation} is complete. The application <b>should</b> use #GetDeferredOperationResultKHR() to retrieve the result of {@code operation}.</li>
            <li>A return value of #THREAD_DONE_KHR indicates that the deferred operation is not complete, but there is no work remaining to assign to threads. Future calls to #DeferredOperationJoinKHR() are not necessary and will simply harm performance. This situation <b>may</b> occur when other threads executing #DeferredOperationJoinKHR() are about to complete {@code operation}, and the implementation is unable to partition the workload any further.</li>
            <li>A return value of #THREAD_IDLE_KHR indicates that the deferred operation is not complete, and there is no work for the thread to do at the time of the call. This situation <b>may</b> occur if the operation encounters a temporary reduction in parallelism. By returning #THREAD_IDLE_KHR, the implementation is signaling that it expects that more opportunities for parallelism will emerge as execution progresses, and that future calls to #DeferredOperationJoinKHR() <b>can</b> be beneficial. In the meantime, the application <b>can</b> perform other work on the calling thread.</li>
        </ul>

        Implementations <b>must</b> guarantee forward progress by enforcing the following invariants:

        <ul>
            <li>If only one thread has invoked #DeferredOperationJoinKHR() on a given operation, that thread <b>must</b> execute the operation to completion and return #SUCCESS.</li>
            <li>If multiple threads have concurrently invoked #DeferredOperationJoinKHR() on the same operation, then at least one of them <b>must</b> complete the operation and return #SUCCESS.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code operation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code operation} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#THREAD_DONE_KHR</li>
                <li>#THREAD_IDLE_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device which owns {@code operation}."),
        VkDeferredOperationKHR("operation", "the deferred operation that the calling thread should work on.")
    )
}