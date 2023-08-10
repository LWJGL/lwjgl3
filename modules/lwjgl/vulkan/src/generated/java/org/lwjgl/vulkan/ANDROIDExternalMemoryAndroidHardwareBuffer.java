/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension enables an application to import Android {@code AHardwareBuffer} objects created outside of the Vulkan device into Vulkan memory objects, where they <b>can</b> be bound to images and buffers. It also allows exporting an {@code AHardwareBuffer} from a Vulkan memory object for symmetry with other operating systems. But since not all {@code AHardwareBuffer} usages and formats have Vulkan equivalents, exporting from Vulkan provides strictly less functionality than creating the {@code AHardwareBuffer} externally and importing it.
 * 
 * <p>Some {@code AHardwareBuffer} images have implementation-defined <em>external formats</em> that <b>may</b> not correspond to Vulkan formats. Sampler Y′C<sub>B</sub>C<sub>R</sub> conversion <b>can</b> be used to sample from these images and convert them to a known color space.</p>
 * 
 * <h5>VK_ANDROID_external_memory_android_hardware_buffer</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_ANDROID_external_memory_android_hardware_buffer}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>130</dd>
 * <dt><b>Revision</b></dt>
 * <dd>5</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} and {@link KHRExternalMemory VK_KHR_external_memory} and {@link EXTQueueFamilyForeign VK_EXT_queue_family_foreign} and {@link KHRDedicatedAllocation VK_KHR_dedicated_allocation}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ANDROID_external_memory_android_hardware_buffer]%20@critsec%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ANDROID_external_memory_android_hardware_buffer%20extension*">critsec</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-30</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ray Smith, ARM</li>
 * <li>Lina Versace, Google</li>
 * <li>Jesse Hall, Google</li>
 * <li>Tobias Hector, Imagination</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * <li>Andrew Garrard, Samsung</li>
 * </ul></dd>
 * </dl>
 */
public class ANDROIDExternalMemoryAndroidHardwareBuffer {

    /** The extension specification version. */
    public static final int VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION = 5;

    /** The extension name. */
    public static final String VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME = "VK_ANDROID_external_memory_android_hardware_buffer";

    /** Extends {@code VkExternalMemoryHandleTypeFlagBits}. */
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID = 0x400;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID             = 1000129000,
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID        = 1000129001,
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID = 1000129002,
        VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID       = 1000129003,
        VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID   = 1000129004,
        VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID                           = 1000129005;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID = 1000129006;

    protected ANDROIDExternalMemoryAndroidHardwareBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetAndroidHardwareBufferPropertiesANDROID ] ---

    /** Unsafe version of: {@link #vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID} */
    public static int nvkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, long buffer, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetAndroidHardwareBufferPropertiesANDROID;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
        }
        return callPPPI(device.address(), buffer, pProperties, __functionAddress);
    }

    /**
     * Get Properties of External Memory Android Hardware Buffers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory parameters to use when importing an Android hardware buffer, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetAndroidHardwareBufferPropertiesANDROID(
     *     VkDevice                                    device,
     *     const struct AHardwareBuffer*               buffer,
     *     VkAndroidHardwareBufferPropertiesANDROID*   pProperties);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code buffer} <b>must</b> be a valid Android hardware buffer object with at least one of the {@code AHARDWAREBUFFER_USAGE_GPU_*} flags in its {@code AHardwareBuffer_Desc}{@code ::usage}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid pointer to a valid {@code AHardwareBuffer} value</li>
     * <li>{@code pProperties} <b>must</b> be a valid pointer to a {@link VkAndroidHardwareBufferPropertiesANDROID} structure</li>
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
     * <li>{@link KHRExternalMemory#VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR ERROR_INVALID_EXTERNAL_HANDLE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAndroidHardwareBufferPropertiesANDROID}</p>
     *
     * @param device      the logical device that will be importing {@code buffer}.
     * @param buffer      the Android hardware buffer which will be imported.
     * @param pProperties a pointer to a {@link VkAndroidHardwareBufferPropertiesANDROID} structure in which the properties of {@code buffer} are returned.
     */
    @NativeType("VkResult")
    public static int vkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, @NativeType("AHardwareBuffer const *") long buffer, @NativeType("VkAndroidHardwareBufferPropertiesANDROID *") VkAndroidHardwareBufferPropertiesANDROID pProperties) {
        return nvkGetAndroidHardwareBufferPropertiesANDROID(device, buffer, pProperties.address());
    }

    // --- [ vkGetMemoryAndroidHardwareBufferANDROID ] ---

    /** Unsafe version of: {@link #vkGetMemoryAndroidHardwareBufferANDROID GetMemoryAndroidHardwareBufferANDROID} */
    public static int nvkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, long pInfo, long pBuffer) {
        long __functionAddress = device.getCapabilities().vkGetMemoryAndroidHardwareBufferANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pBuffer, __functionAddress);
    }

    /**
     * Get an Android hardware buffer for a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export an Android hardware buffer referencing the payload of a Vulkan device memory object, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryAndroidHardwareBufferANDROID(
     *     VkDevice                                    device,
     *     const VkMemoryGetAndroidHardwareBufferInfoANDROID* pInfo,
     *     struct AHardwareBuffer**                    pBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call to {@code vkGetMemoryAndroidHardwareBufferANDROID} <b>must</b> return an Android hardware buffer with a new reference acquired in addition to the reference held by the {@code VkDeviceMemory}. To avoid leaking resources, the application <b>must</b> release the reference by calling {@code AHardwareBuffer_release} when it is no longer needed. When called with the same handle in {@link VkMemoryGetAndroidHardwareBufferInfoANDROID}{@code ::memory}, {@code vkGetMemoryAndroidHardwareBufferANDROID} <b>must</b> return the same Android hardware buffer object. If the device memory was created by importing an Android hardware buffer, {@code vkGetMemoryAndroidHardwareBufferANDROID} <b>must</b> return that same Android hardware buffer object.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryGetAndroidHardwareBufferInfoANDROID} structure</li>
     * <li>{@code pBuffer} <b>must</b> be a valid pointer to a valid pointer to an {@code AHardwareBuffer} value</li>
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
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryGetAndroidHardwareBufferInfoANDROID}</p>
     *
     * @param device  the logical device that created the device memory being exported.
     * @param pInfo   a pointer to a {@link VkMemoryGetAndroidHardwareBufferInfoANDROID} structure containing parameters of the export operation.
     * @param pBuffer will return an Android hardware buffer referencing the payload of the device memory object.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, @NativeType("VkMemoryGetAndroidHardwareBufferInfoANDROID const *") VkMemoryGetAndroidHardwareBufferInfoANDROID pInfo, @NativeType("AHardwareBuffer **") PointerBuffer pBuffer) {
        if (CHECKS) {
            check(pBuffer, 1);
        }
        return nvkGetMemoryAndroidHardwareBufferANDROID(device, pInfo.address(), memAddress(pBuffer));
    }

}