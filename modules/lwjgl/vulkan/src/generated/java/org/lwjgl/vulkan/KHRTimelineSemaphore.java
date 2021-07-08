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
 * <h5>Promotion to Vulkan 1.2</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_timeline_semaphore</h5>
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
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_timeline_semaphore:%20&amp;body=@jekstrand%20">jekstrand</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-06-12</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension interacts with {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
 * <li>This extension interacts with {@link KHRExternalSemaphore VK_KHR_external_semaphore}</li>
 * <li>This extension interacts with {@link KHRExternalSemaphoreWin32 VK_KHR_external_semaphore_win32}</li>
 * <li>Promoted to Vulkan 1.2 Core</li>
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
     * Extends {@code VkSemaphoreType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_TYPE_BINARY_KHR SEMAPHORE_TYPE_BINARY_KHR}</li>
     * <li>{@link #VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SEMAPHORE_TYPE_BINARY_KHR   = 0,
        VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;

    /** Extends {@code VkSemaphoreWaitFlagBits}. */
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 0x1;

    protected KHRTimelineSemaphore() {
        throw new UnsupportedOperationException();
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
     * See {@link VK12#vkGetSemaphoreCounterValue GetSemaphoreCounterValue}.
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
            VkSemaphoreWaitInfo.validate(pWaitInfo);
        }
        return callPPJI(device.address(), pWaitInfo, timeout, __functionAddress);
    }

    /**
     * See {@link VK12#vkWaitSemaphores WaitSemaphores}.
     *
     * @param device    the logical device that owns the semaphore.
     * @param pWaitInfo a pointer to a {@link VkSemaphoreWaitInfo} structure containing information about the wait condition.
     * @param timeout   the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
     */
    @NativeType("VkResult")
    public static int vkWaitSemaphoresKHR(VkDevice device, @NativeType("VkSemaphoreWaitInfo const *") VkSemaphoreWaitInfo pWaitInfo, @NativeType("uint64_t") long timeout) {
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
     * See {@link VK12#vkSignalSemaphore SignalSemaphore}.
     *
     * @param device      the logical device that owns the semaphore.
     * @param pSignalInfo a pointer to a {@link VkSemaphoreSignalInfo} structure containing information about the signal operation.
     */
    @NativeType("VkResult")
    public static int vkSignalSemaphoreKHR(VkDevice device, @NativeType("VkSemaphoreSignalInfo const *") VkSemaphoreSignalInfo pSignalInfo) {
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