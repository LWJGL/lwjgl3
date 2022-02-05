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
 * This extension provides functionality to use a logical device that consists of multiple physical devices, as created with the {@link KHRDeviceGroupCreation VK_KHR_device_group_creation} extension. A device group can allocate memory across the subdevices, bind memory from one subdevice to a resource on another subdevice, record command buffers where some work executes on an arbitrary subset of the subdevices, and potentially present a swapchain image from one or more subdevices.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>The following enums, types and commands are included as interactions with {@link KHRSwapchain VK_KHR_swapchain}:</p>
 * 
 * <ul>
 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR}</li>
 * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR}</li>
 * <li>{@link #VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR}</li>
 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR}</li>
 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>{@link #VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR}</li>
 * <li>{@code VkDeviceGroupPresentModeFlagBitsKHR}</li>
 * <li>{@link VkDeviceGroupPresentCapabilitiesKHR}</li>
 * <li>{@link VkImageSwapchainCreateInfoKHR}</li>
 * <li>{@link VkBindImageMemorySwapchainInfoKHR}</li>
 * <li>{@link VkAcquireNextImageInfoKHR}</li>
 * <li>{@link VkDeviceGroupPresentInfoKHR}</li>
 * <li>{@link VkDeviceGroupSwapchainCreateInfoKHR}</li>
 * <li>{@link #vkGetDeviceGroupPresentCapabilitiesKHR GetDeviceGroupPresentCapabilitiesKHR}</li>
 * <li>{@link #vkGetDeviceGroupSurfacePresentModesKHR GetDeviceGroupSurfacePresentModesKHR}</li>
 * <li>{@link #vkGetPhysicalDevicePresentRectanglesKHR GetPhysicalDevicePresentRectanglesKHR}</li>
 * <li>{@link #vkAcquireNextImage2KHR AcquireNextImage2KHR}</li>
 * </ul>
 * 
 * <p>If Vulkan 1.1 and {@link KHRSwapchain VK_KHR_swapchain} are supported, these are included by {@code VK_KHR_swapchain}.</p>
 * 
 * <p>The base functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_device_group</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_device_group}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>61</dd>
 * <dt><b>Revision</b></dt>
 * <dd>4</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRDeviceGroupCreation VK_KHR_device_group_creation}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_device_group]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_device_group%20extension%3E%3E">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-10-10</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_device_group.html">{@code SPV_KHR_device_group}</a></li>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDeviceGroup {

    /** The extension specification version. */
    public static final int VK_KHR_DEVICE_GROUP_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR             = 1000060000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR    = 1000060003,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = 1000060004,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR               = 1000060005,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR          = 1000060006;

    /**
     * Extends {@code VkPeerMemoryFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR}</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR}</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR}</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR    = 0x1,
        VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR    = 0x2,
        VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = 0x4,
        VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = 0x8;

    /** Extends {@code VkMemoryAllocateFlagBits}. */
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = 0x1;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_DISPATCH_BASE_KHR PIPELINE_CREATE_DISPATCH_BASE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x8,
        VK_PIPELINE_CREATE_DISPATCH_BASE_KHR                    = 0x10;

    /** Extends {@code VkDependencyFlagBits}. */
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = 0x4;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060013,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR  = 1000060014;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x40;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR        = 1000060008,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR   = 1000060009,
        VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR            = 1000060010,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR          = 1000060011,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;

    /** Extends {@code VkSwapchainCreateFlagBitsKHR}. */
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x1;

    protected KHRDeviceGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceGroupPeerMemoryFeaturesKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupPeerMemoryFeaturesKHR GetDeviceGroupPeerMemoryFeaturesKHR} */
    public static void nvkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeaturesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetDeviceGroupPeerMemoryFeatures GetDeviceGroupPeerMemoryFeatures}.
     *
     * @param device              the logical device that owns the memory.
     * @param heapIndex           the index of the memory heap from which the memory is allocated.
     * @param localDeviceIndex    the device index of the physical device that performs the memory access.
     * @param remoteDeviceIndex   the device index of the physical device that the memory is allocated for.
     * @param pPeerMemoryFeatures a pointer to a {@code VkPeerMemoryFeatureFlags} bitmask indicating which types of memory accesses are supported for the combination of heap, local, and remote devices.
     */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") IntBuffer pPeerMemoryFeatures) {
        if (CHECKS) {
            check(pPeerMemoryFeatures, 1);
        }
        nvkGetDeviceGroupPeerMemoryFeaturesKHR(device, heapIndex, localDeviceIndex, remoteDeviceIndex, memAddress(pPeerMemoryFeatures));
    }

    // --- [ vkCmdSetDeviceMaskKHR ] ---

    /**
     * See {@link VK11#vkCmdSetDeviceMask CmdSetDeviceMask}.
     *
     * @param commandBuffer command buffer whose current device mask is modified.
     * @param deviceMask    the new value of the current device mask.
     */
    public static void vkCmdSetDeviceMaskKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int deviceMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDeviceMaskKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), deviceMask, __functionAddress);
    }

    // --- [ vkCmdDispatchBaseKHR ] ---

    /**
     * See {@link VK11#vkCmdDispatchBase CmdDispatchBase}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param baseGroupX    the start value for the X component of {@code WorkgroupId}.
     * @param baseGroupY    the start value for the Y component of {@code WorkgroupId}.
     * @param baseGroupZ    the start value for the Z component of {@code WorkgroupId}.
     * @param groupCountX   the number of local workgroups to dispatch in the X dimension.
     * @param groupCountY   the number of local workgroups to dispatch in the Y dimension.
     * @param groupCountZ   the number of local workgroups to dispatch in the Z dimension.
     */
    public static void vkCmdDispatchBaseKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int baseGroupX, @NativeType("uint32_t") int baseGroupY, @NativeType("uint32_t") int baseGroupZ, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchBaseKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    // --- [ vkGetDeviceGroupPresentCapabilitiesKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupPresentCapabilitiesKHR GetDeviceGroupPresentCapabilitiesKHR} */
    public static int nvkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, long pDeviceGroupPresentCapabilities) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPresentCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pDeviceGroupPresentCapabilities, __functionAddress);
    }

    /**
     * Query present capabilities from other physical devices.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A logical device that represents multiple physical devices <b>may</b> support presenting from images on more than one physical device, or combining images from multiple physical devices.</p>
     * 
     * <p>To query these capabilities, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
     *     VkDevice                                    device,
     *     VkDeviceGroupPresentCapabilitiesKHR*        pDeviceGroupPresentCapabilities);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pDeviceGroupPresentCapabilities} <b>must</b> be a valid pointer to a {@link VkDeviceGroupPresentCapabilitiesKHR} structure</li>
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
     * <p>{@link VkDeviceGroupPresentCapabilitiesKHR}</p>
     *
     * @param device                          the logical device.
     * @param pDeviceGroupPresentCapabilities a pointer to a {@link VkDeviceGroupPresentCapabilitiesKHR} structure in which the device’s capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, @NativeType("VkDeviceGroupPresentCapabilitiesKHR *") VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities) {
        return nvkGetDeviceGroupPresentCapabilitiesKHR(device, pDeviceGroupPresentCapabilities.address());
    }

    // --- [ vkGetDeviceGroupSurfacePresentModesKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupSurfacePresentModesKHR GetDeviceGroupSurfacePresentModesKHR} */
    public static int nvkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, long surface, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), surface, pModes, __functionAddress);
    }

    /**
     * Query present capabilities for a surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Some surfaces <b>may</b> not be capable of using all the device group present modes.</p>
     * 
     * <p>To query the supported device group present modes for a particular surface, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetDeviceGroupSurfacePresentModesKHR(
     *     VkDevice                                    device,
     *     VkSurfaceKHR                                surface,
     *     VkDeviceGroupPresentModeFlagsKHR*           pModes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The modes returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded. These modes <b>must</b> be a subset of the modes returned by {@link #vkGetDeviceGroupPresentCapabilitiesKHR GetDeviceGroupPresentCapabilitiesKHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code surface} <b>must</b> be supported by all physical devices associated with {@code device}, as reported by {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} or an equivalent platform-specific mechanism</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} value</li>
     * <li>Both of {@code device}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device  the logical device.
     * @param surface the surface.
     * @param pModes  a pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} in which the supported device group present modes for the surface are returned.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (CHECKS) {
            check(pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModesKHR(device, surface, memAddress(pModes));
    }

    // --- [ vkGetPhysicalDevicePresentRectanglesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDevicePresentRectanglesKHR GetPhysicalDevicePresentRectanglesKHR}
     *
     * @param pRectCount a pointer to an integer related to the number of rectangles available or queried, as described below.
     */
    public static int nvkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, long surface, long pRectCount, long pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), surface, pRectCount, pRects, __functionAddress);
    }

    /**
     * Query present rectangles for a surface on a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When using {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR}, the application <b>may</b> need to know which regions of the surface are used when presenting locally on each physical device. Presentation of swapchain images to this surface need only have valid contents in the regions returned by this command.</p>
     * 
     * <p>To query a set of rectangles used in presentation on the physical device, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDevicePresentRectanglesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkSurfaceKHR                                surface,
     *     uint32_t*                                   pRectCount,
     *     VkRect2D*                                   pRects);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pRects} is {@code NULL}, then the number of rectangles used when presenting the given {@code surface} is returned in {@code pRectCount}. Otherwise, {@code pRectCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pRects} array, and on return the variable is overwritten with the number of structures actually written to {@code pRects}. If the value of {@code pRectCount} is less than the number of rectangles, at most {@code pRectCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available rectangles were returned.</p>
     * 
     * <p>The values returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded.</p>
     * 
     * <p>The rectangles returned by this command <b>must</b> not overlap.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code surface} <b>must</b> be supported by {@code physicalDevice}, as reported by {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} or an equivalent platform-specific mechanism</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pRectCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pRectCount} is not 0, and {@code pRects} is not {@code NULL}, {@code pRects} <b>must</b> be a valid pointer to an array of {@code pRectCount} {@link VkRect2D} structures</li>
     * <li>Both of {@code physicalDevice}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
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
     * <p>{@link VkRect2D}</p>
     *
     * @param physicalDevice the physical device.
     * @param surface        the surface.
     * @param pRectCount     a pointer to an integer related to the number of rectangles available or queried, as described below.
     * @param pRects         either {@code NULL} or a pointer to an array of {@link VkRect2D} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pRectCount, @Nullable @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        if (CHECKS) {
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount.get(pRectCount.position()));
        }
        return nvkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, memAddress(pRectCount), memAddressSafe(pRects));
    }

    // --- [ vkAcquireNextImage2KHR ] ---

    /** Unsafe version of: {@link #vkAcquireNextImage2KHR AcquireNextImage2KHR} */
    public static int nvkAcquireNextImage2KHR(VkDevice device, long pAcquireInfo, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pAcquireInfo, pImageIndex, __functionAddress);
    }

    /**
     * Retrieve the index of the next available presentable image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire an available presentable image to use, and retrieve the index of that image, call:</p>
     * 
     * <pre><code>
     * VkResult vkAcquireNextImage2KHR(
     *     VkDevice                                    device,
     *     const VkAcquireNextImageInfoKHR*            pAcquireInfo,
     *     uint32_t*                                   pImageIndex);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the number of currently acquired images is greater than the difference between the number of images in the {@code swapchain} member of {@code pAcquireInfo} and the value of {@link VkSurfaceCapabilitiesKHR}{@code ::minImageCount} as returned by a call to {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} with the {@code surface} used to create {@code swapchain}, the {@code timeout} member of {@code pAcquireInfo} <b>must</b> not be {@code UINT64_MAX}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pAcquireInfo} <b>must</b> be a valid pointer to a valid {@link VkAcquireNextImageInfoKHR} structure</li>
     * <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
     * <li>{@link VK10#VK_NOT_READY NOT_READY}</li>
     * <li>{@link KHRSwapchain#VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * <li>{@link EXTFullScreenExclusive#VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAcquireNextImageInfoKHR}</p>
     *
     * @param device       the device associated with {@code swapchain}.
     * @param pAcquireInfo a pointer to a {@link VkAcquireNextImageInfoKHR} structure containing parameters of the acquire.
     * @param pImageIndex  a pointer to a {@code uint32_t} that is set to the index of the next image to use.
     */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (CHECKS) {
            check(pImageIndex, 1);
        }
        return nvkAcquireNextImage2KHR(device, pAcquireInfo.address(), memAddress(pImageIndex));
    }

    /** Array version of: {@link #vkGetDeviceGroupPeerMemoryFeaturesKHR GetDeviceGroupPeerMemoryFeaturesKHR} */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") int[] pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeaturesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPeerMemoryFeatures, 1);
        }
        callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    /** Array version of: {@link #vkGetDeviceGroupSurfacePresentModesKHR GetDeviceGroupSurfacePresentModesKHR} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pModes, 1);
        }
        return callPJPI(device.address(), surface, pModes, __functionAddress);
    }

    /** Array version of: {@link #vkGetPhysicalDevicePresentRectanglesKHR GetPhysicalDevicePresentRectanglesKHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pRectCount, @Nullable @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount[0]);
        }
        return callPJPPI(physicalDevice.address(), surface, pRectCount, memAddressSafe(pRects), __functionAddress);
    }

    /** Array version of: {@link #vkAcquireNextImage2KHR AcquireNextImage2KHR} */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pImageIndex, 1);
        }
        return callPPPI(device.address(), pAcquireInfo.address(), pImageIndex, __functionAddress);
    }

}