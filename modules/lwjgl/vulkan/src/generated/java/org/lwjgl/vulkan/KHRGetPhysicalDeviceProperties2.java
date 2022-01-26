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
 * This extension provides new entry points to query device features, device properties, and format properties in a way that can be easily extended by other extensions, without introducing any further entry points. The Vulkan 1.0 feature/limit/formatproperty structures do not include {@code sType}/{@code pNext} members. This extension wraps them in new structures with {@code sType}/{@code pNext} members, so an application can query a chain of feature/limit/formatproperty structures by constructing the chain and letting the implementation fill them in. A new command is added for each {@code vkGetPhysicalDevice*} command in core Vulkan 1.0. The new feature structure (and a {@code pNext} chain of extending structures) can also be passed in to device creation to enable features.
 * 
 * <p>This extension also allows applications to use the physical-device components of device extensions before {@link VK10#vkCreateDevice CreateDevice} is called.</p>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 *     // Get features with a hypothetical future extension.
 *     VkHypotheticalExtensionFeaturesKHR hypotheticalFeatures =
 *     {
 *         VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                // sType
 *         NULL,                                                       // pNext
 *     };
 * 
 *     VkPhysicalDeviceFeatures2KHR features =
 *     {
 *         VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,           // sType
 *         &amp;hypotheticalFeatures,                                      // pNext
 *     };
 * 
 *     // After this call, features and hypotheticalFeatures have been filled out.
 *     vkGetPhysicalDeviceFeatures2KHR(physicalDevice, &amp;features);
 * 
 *     // Properties/limits can be chained and queried similarly.
 * 
 *     // Enable some features:
 *     VkHypotheticalExtensionFeaturesKHR enabledHypotheticalFeatures =
 *     {
 *         VK_STRUCTURE_TYPE_HYPOTHETICAL_FEATURES_KHR,                // sType
 *         NULL,                                                       // pNext
 *     };
 * 
 *     VkPhysicalDeviceFeatures2KHR enabledFeatures =
 *     {
 *         VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR,           // sType
 *         &amp;enabledHypotheticalFeatures,                               // pNext
 *     };
 * 
 *     enabledFeatures.features.xyz = VK_TRUE;
 *     enabledHypotheticalFeatures.abc = VK_TRUE;
 * 
 *     VkDeviceCreateInfo deviceCreateInfo =
 *     {
 *         VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO,                       // sType
 *         &amp;enabledFeatures,                                           // pNext
 *         ...
 *         NULL,                                                       // pEnabledFeatures
 *     };
 * 
 *     VkDevice device;
 *     vkCreateDevice(physicalDevice, &amp;deviceCreateInfo, NULL, &amp;device);</code></pre>
 * 
 * <h5>VK_KHR_get_physical_device_properties2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>60</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
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
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_physical_device_properties2]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_physical_device_properties2%20extension%3E%3E">jeffbolznv</a></li>
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
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Ian Elliott, Google</li>
 * </ul></dd>
 * </dl>
 */
public class KHRGetPhysicalDeviceProperties2 {

    /** The extension specification version. */
    public static final int VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR                 = 1000059000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR               = 1000059001,
        VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR                        = 1000059002,
        VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR                  = 1000059003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR        = 1000059004,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR                  = 1000059005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR        = 1000059006,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR           = 1000059007,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR = 1000059008;

    protected KHRGetPhysicalDeviceProperties2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceFeatures2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR} */
    public static void nvkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pFeatures, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.
     *
     * @param physicalDevice the physical device from which to query the supported features.
     * @param pFeatures      a pointer to a {@link VkPhysicalDeviceFeatures2} structure in which the physical device features are returned.
     */
    public static void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures2 *") VkPhysicalDeviceFeatures2 pFeatures) {
        nvkGetPhysicalDeviceFeatures2KHR(physicalDevice, pFeatures.address());
    }

    // --- [ vkGetPhysicalDeviceProperties2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceProperties2KHR GetPhysicalDeviceProperties2KHR} */
    public static void nvkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}.
     *
     * @param physicalDevice the handle to the physical device whose properties will be queried.
     * @param pProperties    a pointer to a {@link VkPhysicalDeviceProperties2} structure in which properties are returned.
     */
    public static void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties2 *") VkPhysicalDeviceProperties2 pProperties) {
        nvkGetPhysicalDeviceProperties2KHR(physicalDevice, pProperties.address());
    }

    // --- [ vkGetPhysicalDeviceFormatProperties2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceFormatProperties2KHR GetPhysicalDeviceFormatProperties2KHR} */
    public static void nvkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), format, pFormatProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2}.
     *
     * @param physicalDevice    the physical device from which to query the format properties.
     * @param format            the format whose properties are queried.
     * @param pFormatProperties a pointer to a {@link VkFormatProperties2} structure in which physical device properties for {@code format} are returned.
     */
    public static void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties2 *") VkFormatProperties2 pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties2KHR(physicalDevice, format, pFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceImageFormatProperties2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} */
    public static int nvkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, long pImageFormatInfo, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pImageFormatInfo, pImageFormatProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}.
     *
     * @param physicalDevice         the physical device from which to query the image capabilities.
     * @param pImageFormatInfo       a pointer to a {@link VkPhysicalDeviceImageFormatInfo2} structure describing the parameters that would be consumed by {@link VK10#vkCreateImage CreateImage}.
     * @param pImageFormatProperties a pointer to a {@link VkImageFormatProperties2} structure in which capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceImageFormatInfo2 const *") VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, @NativeType("VkImageFormatProperties2 *") VkImageFormatProperties2 pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice, pImageFormatInfo.address(), pImageFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyProperties2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR}
     *
     * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}.
     */
    public static void nvkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2}.
     *
     * @param physicalDevice            the handle to the physical device whose properties will be queried.
     * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}.
     * @param pQueueFamilyProperties    either {@code NULL} or a pointer to an array of {@link VkQueueFamilyProperties2} structures.
     */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @Nullable @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.Buffer pQueueFamilyProperties) {
        if (CHECKS) {
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
    }

    // --- [ vkGetPhysicalDeviceMemoryProperties2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceMemoryProperties2KHR GetPhysicalDeviceMemoryProperties2KHR} */
    public static void nvkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pMemoryProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceMemoryProperties2 GetPhysicalDeviceMemoryProperties2}.
     *
     * @param physicalDevice    the handle to the device to query.
     * @param pMemoryProperties a pointer to a {@link VkPhysicalDeviceMemoryProperties2} structure in which the properties are returned.
     */
    public static void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties2 *") VkPhysicalDeviceMemoryProperties2 pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice, pMemoryProperties.address());
    }

    // --- [ vkGetPhysicalDeviceSparseImageFormatProperties2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
     */
    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(physicalDevice.address(), pFormatInfo, pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2}.
     *
     * @param physicalDevice the physical device from which to query the sparse image format properties.
     * @param pFormatInfo    a pointer to a {@link VkPhysicalDeviceSparseImageFormatInfo2} structure containing input parameters to the command.
     * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkSparseImageFormatProperties2} structures.
     */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice, pFormatInfo.address(), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @Nullable @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties), __functionAddress);
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        callPPPPV(physicalDevice.address(), pFormatInfo.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}