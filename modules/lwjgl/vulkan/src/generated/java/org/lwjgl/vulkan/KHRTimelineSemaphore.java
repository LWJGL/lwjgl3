/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension introduces a new type of semaphore that has an integer payload identifying a point in a timeline. Such timeline semaphores support the following operations:
 * 
 * <ul>
 * <li>Host query - A host operation that allows querying the payload of the timeline semaphore.</li>
 * <li>Host wait - A host operation that allows a blocking wait for a timeline semaphore to reach a specified value.</li>
 * <li>Host signal - A host operation that allows advancing the timeline semaphore to a specified value.</li>
 * <li>Device wait - A device operation that allows waiting for a timeline semaphore to reach a specified value.</li>
 * <li>Device signal - A device operation that allows advancing the timeline semaphore to a specified value.</li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_timeline_semaphore}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>208</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_timeline_semaphore:%20&amp;body=@jekstrand%20">jekstrand</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-06-12</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension interacts with {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
 * <li>This extension interacts with {@link KHRExternalSemaphore VK_KHR_external_semaphore}</li>
 * <li>This extension interacts with {@link KHRExternalSemaphoreWin32 VK_KHR_external_semaphore_win32}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Yuriy O&#8217;Donnell, Epic Games</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Ray Smith, Arm</li>
 * </ul></dd>
 * </dl>
 */
public class KHRTimelineSemaphore {

    /** The extension specification version. */
    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR   = 1000207000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = 1000207001,
        VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR                    = 1000207002,
        VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR                = 1000207003,
        VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR                           = 1000207004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR                         = 1000207005;

    /**
     * VkSemaphoreTypeKHR - Sepcifies the type of a semaphore object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_TYPE_BINARY_KHR SEMAPHORE_TYPE_BINARY_KHR} specifies a <em>binary semaphore</em> type that has a boolean payload indicating whether the semaphore is currently signaled or unsignaled. When created, the semaphore is in the unsignaled state.</li>
     * <li>{@link #VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR} specifies a <em>timeline semaphore</em> type that has a monotonically increasing 64-bit unsigned integer payload indicating whether the semaphore is signaled with respect to a particular reference value. When created, the semaphore payload has the value given by the {@code initialValue} field of {@link VkSemaphoreTypeCreateInfoKHR}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSemaphoreTypeCreateInfoKHR}</p>
     */
    public static final int
        VK_SEMAPHORE_TYPE_BINARY_KHR   = 0,
        VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;

    /**
     * VkSemaphoreWaitFlagBitsKHR - Bitmask specifying additional parameters of a semaphore wait operation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_WAIT_ANY_BIT_KHR SEMAPHORE_WAIT_ANY_BIT_KHR} specifies that the semaphore wait condition is that at least one of the semaphores in {@link VkSemaphoreWaitInfoKHR}{@code ::pSemaphores} has reached the value specified by the corresponding element of {@link VkSemaphoreWaitInfoKHR}{@code ::pValues}. If {@link #VK_SEMAPHORE_WAIT_ANY_BIT_KHR SEMAPHORE_WAIT_ANY_BIT_KHR} is not set, the semaphore wait condition is that all of the semaphores in {@link VkSemaphoreWaitInfoKHR}{@code ::pSemaphores} have reached the value specified by the corresponding element of {@link VkSemaphoreWaitInfoKHR}{@code ::pValues}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkSemaphoreWaitFlagsKHR}</p>
     */
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 0x1;

    protected KHRTimelineSemaphore() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_timeline_semaphore") && VK.checkExtension("VK_KHR_timeline_semaphore",
               VK.isSupported(provider, "vkGetSemaphoreCounterValueKHR", caps)
            && VK.isSupported(provider, "vkWaitSemaphoresKHR", caps)
            && VK.isSupported(provider, "vkSignalSemaphoreKHR", caps)
        );
    }

    // --- [ vkGetSemaphoreCounterValueKHR ] ---

    /** Unsafe version of: {@link #vkGetSemaphoreCounterValueKHR GetSemaphoreCounterValueKHR} */
    public static int nvkGetSemaphoreCounterValueKHR(VkDevice device, long semaphore, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValueKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

    /**
     * Query the current state of a timeline semaphore.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the current counter value of a semaphore created with a {@code VkSemaphoreTypeKHR} of {@link #VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR} from the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetSemaphoreCounterValueKHR(
     *     VkDevice                                    device,
     *     VkSemaphore                                 semaphore,
     *     uint64_t*                                   pValue);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#devsandqueues-submission">queue submission</a> command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreTypeKHR} of {@link #VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
     * <li>{@code pValue} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>{@code semaphore} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device    the logical device that owns the semaphore.
     * @param semaphore the handle of the semaphore to query.
     * @param pValue    a pointer to a 64-bit integer value in which the current counter value of the semaphore is returned.
     */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") LongBuffer pValue) {
        if (CHECKS) {
            check(pValue, 1);
        }
        return nvkGetSemaphoreCounterValueKHR(device, semaphore, memAddress(pValue));
    }

    // --- [ vkWaitSemaphoresKHR ] ---

    /** Unsafe version of: {@link #vkWaitSemaphoresKHR WaitSemaphoresKHR} */
    public static int nvkWaitSemaphoresKHR(VkDevice device, long pWaitInfo, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkSemaphoreWaitInfoKHR.validate(pWaitInfo);
        }
        return callPPJI(device.address(), pWaitInfo, timeout, __functionAddress);
    }

    /**
     * Wait for timeline semaphores on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To wait for a set of semaphores created with a {@code VkSemaphoreTypeKHR} of {@link #VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR} to reach particular counter values on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkWaitSemaphoresKHR(
     *     VkDevice                                    device,
     *     const VkSemaphoreWaitInfoKHR*               pWaitInfo,
     *     uint64_t                                    timeout);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the condition is satisfied when {@code vkWaitSemaphoresKHR} is called, then {@code vkWaitSemaphoresKHR} returns immediately. If the condition is not satisfied at the time {@code vkWaitSemaphoresKHR} is called, then {@code vkWaitSemaphoresKHR} will block and wait up to {@code timeout} nanoseconds for the condition to become satisfied.</p>
     * 
     * <p>If {@code timeout} is zero, then {@code vkWaitSemaphoresKHR} does not wait, but simply returns information about the current state of the semaphore. {@link VK10#VK_TIMEOUT TIMEOUT} will be returned in this case if the condition is not satisfied, even though no actual wait was performed.</p>
     * 
     * <p>If the specified timeout period expires before the condition is satisfied, {@code vkWaitSemaphoresKHR} returns {@link VK10#VK_TIMEOUT TIMEOUT}. If the condition is satisfied before {@code timeout} nanoseconds has expired, {@code vkWaitSemaphoresKHR} returns {@link VK10#VK_SUCCESS SUCCESS}.</p>
     * 
     * <p>If device loss occurs (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#devsandqueues-lost-device">Lost Device</a>) before the timeout has expired, {@code vkWaitSemaphoresKHR} <b>must</b> return in finite time with either {@link VK10#VK_SUCCESS SUCCESS} or {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pWaitInfo} <b>must</b> be a valid pointer to a valid {@link VkSemaphoreWaitInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSemaphoreWaitInfoKHR}</p>
     *
     * @param device    the logical device that owns the semaphore.
     * @param pWaitInfo a pointer to a {@link VkSemaphoreWaitInfoKHR} structure containing information about the wait condition.
     * @param timeout   the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
     */
    @NativeType("VkResult")
    public static int vkWaitSemaphoresKHR(VkDevice device, @NativeType("VkSemaphoreWaitInfoKHR const *") VkSemaphoreWaitInfoKHR pWaitInfo, @NativeType("uint64_t") long timeout) {
        return nvkWaitSemaphoresKHR(device, pWaitInfo.address(), timeout);
    }

    // --- [ vkSignalSemaphoreKHR ] ---

    /** Unsafe version of: {@link #vkSignalSemaphoreKHR SignalSemaphoreKHR} */
    public static int nvkSignalSemaphoreKHR(VkDevice device, long pSignalInfo) {
        long __functionAddress = device.getCapabilities().vkSignalSemaphoreKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pSignalInfo, __functionAddress);
    }

    /**
     * Signal a timeline semaphore on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To signal a semaphore created with a {@code VkSemaphoreTypeKHR} of {@link #VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR} with a particular counter value, on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkSignalSemaphoreKHR(
     *     VkDevice                                    device,
     *     const VkSemaphoreSignalInfoKHR*             pSignalInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@code vkSignalSemaphoreKHR} is executed on the host, it defines and immediately executes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-semaphores-signaling"><em>semaphore signal operation</em></a> which sets the timeline semaphore to the given value.</p>
     * 
     * <p>The first synchronization scope is defined by the host execution model, but includes execution of {@code vkSignalSemaphoreKHR} on the host and anything that happened-before it.</p>
     * 
     * <p>The second synchronization scope is empty.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pSignalInfo} <b>must</b> be a valid pointer to a valid {@link VkSemaphoreSignalInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSemaphoreSignalInfoKHR}</p>
     *
     * @param device      the logical device that owns the semaphore.
     * @param pSignalInfo a pointer to a {@link VkSemaphoreSignalInfoKHR} structure containing information about the signal operation.
     */
    @NativeType("VkResult")
    public static int vkSignalSemaphoreKHR(VkDevice device, @NativeType("VkSemaphoreSignalInfoKHR const *") VkSemaphoreSignalInfoKHR pSignalInfo) {
        return nvkSignalSemaphoreKHR(device, pSignalInfo.address());
    }

    /** Array version of: {@link #vkGetSemaphoreCounterValueKHR GetSemaphoreCounterValueKHR} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") long[] pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValueKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pValue, 1);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

}