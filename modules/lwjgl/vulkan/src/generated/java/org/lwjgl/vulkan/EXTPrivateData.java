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
 * This extension is a device extension which enables attaching arbitrary payloads to Vulkan objects. It introduces the idea of private data slots as a means of storing a 64-bit unsigned integer of application defined data. Private data slots can be created or destroyed any time an associated device is available. Private data slots can be reserved at device creation time, and limiting use to the amount reserved will allow the extension to exhibit better performance characteristics.
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
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
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthew Rusch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_private_data]%20@mattruschnv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_private_data%20extension%3E%3E">mattruschnv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-03-25</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.3 Core</li>
 * </ul></dd>
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
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPrivateDataSlot, __functionAddress);
    }

    /**
     * See {@link VK13#vkCreatePrivateDataSlot CreatePrivateDataSlot}.
     *
     * @param device           the logical device associated with the creation of the object(s) holding the private data slot.
     * @param pCreateInfo      a pointer to a {@link VkPrivateDataSlotCreateInfo}
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pPrivateDataSlot a pointer to a {@code VkPrivateDataSlot} handle in which the resulting private data slot is returned
     */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") LongBuffer pPrivateDataSlot) {
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
        }
        callPJPV(device.address(), privateDataSlot, pAllocator, __functionAddress);
    }

    /**
     * See {@link VK13#vkDestroyPrivateDataSlot DestroyPrivateDataSlot}.
     *
     * @param device          the logical device associated with the creation of the object(s) holding the private data slot.
     * @param privateDataSlot the private data slot to destroy.
     * @param pAllocator      controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyPrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlot") long privateDataSlot, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPrivateDataSlotEXT(device, privateDataSlot, memAddressSafe(pAllocator));
    }

    // --- [ vkSetPrivateDataEXT ] ---

    /**
     * See {@link VK13#vkSetPrivateData SetPrivateData}.
     *
     * @param device          the device that created the object.
     * @param objectType      a {@code VkObjectType} specifying the type of object to associate data with.
     * @param objectHandle    a handle to the object to associate data with.
     * @param privateDataSlot a handle to a {@code VkPrivateDataSlot} specifying location of private data storage.
     * @param data            user defined data to associate the object with. This data will be stored at {@code privateDataSlot}.
     */
    @NativeType("VkResult")
    public static int vkSetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t") long data) {
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
     * See {@link VK13#vkGetPrivateData GetPrivateData}.
     *
     * @param device          the device that created the object
     * @param objectType      a {@code VkObjectType} specifying the type of object data is associated with.
     * @param objectHandle    a handle to the object data is associated with.
     * @param privateDataSlot a handle to a {@code VkPrivateDataSlot} specifying location of private data pointer storage.
     * @param pData           a pointer to specify where user data is returned. 0 will be written in the absence of a previous call to {@code vkSetPrivateData} using the object specified by {@code objectHandle}.
     */
    public static void vkGetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") LongBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        nvkGetPrivateDataEXT(device, objectType, objectHandle, privateDataSlot, memAddress(pData));
    }

    /** Array version of: {@link #vkCreatePrivateDataSlotEXT CreatePrivateDataSlotEXT} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") long[] pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pPrivateDataSlot, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPrivateDataSlot, __functionAddress);
    }

    /** Array version of: {@link #vkGetPrivateDataEXT GetPrivateDataEXT} */
    public static void vkGetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pData, 1);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

}