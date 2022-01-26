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
 * This extension provides new entry points to query memory requirements of images and buffers in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 {@link VkMemoryRequirements} and {@link VkSparseImageMemoryRequirements} structures do not include {@code sType} and {@code pNext} members. This extension wraps them in new structures with these members, so an application can query a chain of memory requirements structures by constructing the chain and letting the implementation fill them in. A new command is added for each {@code vkGet*MemoryRequrements} command in core Vulkan 1.0.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_get_memory_requirements2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_get_memory_requirements2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>147</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_memory_requirements2]%20@jekstrand%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_memory_requirements2%20extension%3E%3E">jekstrand</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * </ul></dd>
 * </dl>
 */
public class KHRGetMemoryRequirements2 {

    /** The extension specification version. */
    public static final int VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR       = 1000146000,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR        = 1000146001,
        VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146002,
        VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR                   = 1000146003,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR      = 1000146004;

    protected KHRGetMemoryRequirements2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageMemoryRequirements2KHR ] ---

    /** Unsafe version of: {@link #vkGetImageMemoryRequirements2KHR GetImageMemoryRequirements2KHR} */
    public static void nvkGetImageMemoryRequirements2KHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2}.
     *
     * @param device              the logical device that owns the image.
     * @param pInfo               a pointer to a {@link VkImageMemoryRequirementsInfo2} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the image object are returned.
     */
    public static void vkGetImageMemoryRequirements2KHR(VkDevice device, @NativeType("VkImageMemoryRequirementsInfo2 const *") VkImageMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetImageMemoryRequirements2KHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetBufferMemoryRequirements2KHR ] ---

    /** Unsafe version of: {@link #vkGetBufferMemoryRequirements2KHR GetBufferMemoryRequirements2KHR} */
    public static void nvkGetBufferMemoryRequirements2KHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetBufferMemoryRequirements2 GetBufferMemoryRequirements2}.
     *
     * @param device              the logical device that owns the buffer.
     * @param pInfo               a pointer to a {@link VkBufferMemoryRequirementsInfo2} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetBufferMemoryRequirements2KHR(VkDevice device, @NativeType("VkBufferMemoryRequirementsInfo2 const *") VkBufferMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetBufferMemoryRequirements2KHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetImageSparseMemoryRequirements2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetImageSparseMemoryRequirements2KHR GetImageSparseMemoryRequirements2KHR}
     *
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     */
    public static void nvkGetImageSparseMemoryRequirements2KHR(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetImageSparseMemoryRequirements2 GetImageSparseMemoryRequirements2}.
     *
     * @param device                        the logical device that owns the image.
     * @param pInfo                         a pointer to a {@link VkImageSparseMemoryRequirementsInfo2} structure containing parameters required for the memory requirements query.
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements2} structures.
     */
    public static void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements2KHR(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** Array version of: {@link #vkGetImageSparseMemoryRequirements2KHR GetImageSparseMemoryRequirements2KHR} */
    public static void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

}