/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The 'VK_EXT_private_data' extension is a device extension which enables attaching arbitrary payloads to Vulkan objects. It introduces the idea of private data slots as a means of storing a 64-bit unsigned integer of application defined data. Private data slots can be created or destroyed any time an associated device is available. Private data slots can be reserved at device creation time, and limiting use to the amount reserved will allow the extension to exhibit better performance characteristics.
 * 
 * <h5>Examples</h5>
 * 
 * <ul>
 * <li>In progress</li>
 * </ul>
 * 
 * <h5>VK_EXT_private_data</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_private_data}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>296</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthew Rusch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_private_data:%20&amp;body=@mattruschnv%20">mattruschnv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-03-25</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthew Rusch, NVIDIA</li>
 * <li>Nuno Subtil, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTPrivateData {

    /** The extension specification version. */
    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = 1000295000,
        VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT       = 1000295001,
        VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT         = 1000295002;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = 1000295000;

    protected EXTPrivateData() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreatePrivateDataSlotEXT ] ---

    /** Unsafe version of: {@link #vkCreatePrivateDataSlotEXT CreatePrivateDataSlotEXT} */
    public static int nvkCreatePrivateDataSlotEXT(VkDevice device, long pCreateInfo, long pAllocator, long pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPrivateDataSlot, __functionAddress);
    }

    /**
     * Create a slot for private data storage.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a private data slot, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreatePrivateDataSlotEXT(
     *     VkDevice                                    device,
     *     const VkPrivateDataSlotCreateInfoEXT*       pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPrivateDataSlotEXT*                       pPrivateDataSlot);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-privateData">{@code privateData}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkPrivateDataSlotCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pPrivateDataSlot} <b>must</b> be a valid pointer to a {@code VkPrivateDataSlotEXT} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkPrivateDataSlotCreateInfoEXT}</p>
     *
     * @param device           the logical device associated with the creation of the object(s) holding the private data slot.
     * @param pCreateInfo      a pointer to a {@link VkPrivateDataSlotCreateInfoEXT}
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pPrivateDataSlot a pointer to a {@code VkPrivateDataSlotEXT} handle in which the resulting private data slot is returned
     */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfoEXT const *") VkPrivateDataSlotCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlotEXT *") LongBuffer pPrivateDataSlot) {
        if (CHECKS) {
            check(pPrivateDataSlot, 1);
        }
        return nvkCreatePrivateDataSlotEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPrivateDataSlot));
    }

    // --- [ vkDestroyPrivateDataSlotEXT ] ---

    /** Unsafe version of: {@link #vkDestroyPrivateDataSlotEXT DestroyPrivateDataSlotEXT} */
    public static void nvkDestroyPrivateDataSlotEXT(VkDevice device, long privateDataSlot, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(device.address(), privateDataSlot, pAllocator, __functionAddress);
    }

    /**
     * Destroy a private data slot.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a private data slot, call:</p>
     * 
     * <pre><code>
     * void vkDestroyPrivateDataSlotEXT(
     *     VkDevice                                    device,
     *     VkPrivateDataSlotEXT                        privateDataSlot,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code privateDataSlot} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code privateDataSlot} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code privateDataSlot} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlotEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code privateDataSlot} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code privateDataSlot} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device          the logical device associated with the creation of the object(s) holding the private data slot.
     * @param privateDataSlot the private data slot to destroy.
     * @param pAllocator      controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyPrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotEXT") long privateDataSlot, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPrivateDataSlotEXT(device, privateDataSlot, memAddressSafe(pAllocator));
    }

    // --- [ vkSetPrivateDataEXT ] ---

    /**
     * Associate data with a Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To store user defined data in a slot associated with a Vulkan object, call:</p>
     * 
     * <pre><code>
     * VkResult vkSetPrivateDataEXT(
     *     VkDevice                                    device,
     *     VkObjectType                                objectType,
     *     uint64_t                                    objectHandle,
     *     VkPrivateDataSlotEXT                        privateDataSlot,
     *     uint64_t                                    data);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code objectHandle} <b>must</b> be {@code device} or a child of {@code device}</li>
     * <li>{@code objectHandle} <b>must</b> be a valid handle to an object of type {@code objectType}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
     * <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlotEXT} handle</li>
     * <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * </ul></dd>
     * </dl>
     *
     * @param device          the device that created the object.
     * @param objectType      a {@code VkObjectType} specifying the type of object to associate data with.
     * @param objectHandle    a handle to the object to associate data with.
     * @param privateDataSlot a handle to a {@code VkPrivateDataSlotEXT} specifying location of private data storage.
     * @param data            user defined data to associate the object with. This data will be stored at {@code privateDataSlot}.
     */
    @NativeType("VkResult")
    public static int vkSetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlotEXT") long privateDataSlot, @NativeType("uint64_t") long data) {
        long __functionAddress = device.getCapabilities().vkSetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJI(device.address(), objectType, objectHandle, privateDataSlot, data, __functionAddress);
    }

    // --- [ vkGetPrivateDataEXT ] ---

    /** Unsafe version of: {@link #vkGetPrivateDataEXT GetPrivateDataEXT} */
    public static void nvkGetPrivateDataEXT(VkDevice device, int objectType, long objectHandle, long privateDataSlot, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    /**
     * Retrieve data associated with a Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To retrieve user defined data from a slot associated with a Vulkan object, call:</p>
     * 
     * <pre><code>
     * void vkGetPrivateDataEXT(
     *     VkDevice                                    device,
     *     VkObjectType                                objectType,
     *     uint64_t                                    objectHandle,
     *     VkPrivateDataSlotEXT                        privateDataSlot,
     *     uint64_t*                                   pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Due to platform details on Android, implementations might not be able to reliably return 0 from calls to {@code vkGetPrivateDataEXT} for {@code VkSwapchainKHR} objects on which {@code vkSetPrivateDataEXT} has not previously been called. This erratum is exclusive to the Android platform and objects of type {@code VkSwapchainKHR}.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code objectType} <b>must</b> be {@link VK10#VK_OBJECT_TYPE_DEVICE OBJECT_TYPE_DEVICE}, or an object type whose parent is {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
     * <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlotEXT} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device          the device that created the object
     * @param objectType      a {@code VkObjectType} specifying the type of object data is associated with.
     * @param objectHandle    a handle to the object data is associated with.
     * @param privateDataSlot a handle to a {@code VkPrivateDataSlotEXT} specifying location of private data pointer storage.
     * @param pData           a pointer to specify where user data is returned. 0 will be written in the absence of a previous call to {@code vkSetPrivateDataEXT} using the object specified by {@code objectHandle}.
     */
    public static void vkGetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlotEXT") long privateDataSlot, @NativeType("uint64_t *") LongBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        nvkGetPrivateDataEXT(device, objectType, objectHandle, privateDataSlot, memAddress(pData));
    }

    /** Array version of: {@link #vkCreatePrivateDataSlotEXT CreatePrivateDataSlotEXT} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfoEXT const *") VkPrivateDataSlotCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlotEXT *") long[] pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pPrivateDataSlot, 1);
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPrivateDataSlot, __functionAddress);
    }

    /** Array version of: {@link #vkGetPrivateDataEXT GetPrivateDataEXT} */
    public static void vkGetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlotEXT") long privateDataSlot, @NativeType("uint64_t *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pData, 1);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

}