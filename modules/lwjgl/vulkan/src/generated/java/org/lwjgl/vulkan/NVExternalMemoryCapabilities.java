/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Applications may wish to import memory from the Direct 3D API, or export memory to other Vulkan instances. This extension provides a set of capability queries that allow applications determine what types of win32 memory handles an implementation supports for a given set of use cases.
 * 
 * <h5>VK_NV_external_memory_capabilities</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_external_memory_capabilities}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>56</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> by {@link KHRExternalMemoryCapabilities VK_KHR_external_memory_capabilities} extension
 * 
 * <ul>
 * <li>Which in turn was <em>promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul>
 * </li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_external_memory_capabilities]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_external_memory_capabilities%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-08-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with Vulkan 1.1.</li>
 * <li>Interacts with {@link KHRDedicatedAllocation VK_KHR_dedicated_allocation}.</li>
 * <li>Interacts with {@link NVDedicatedAllocation VK_NV_dedicated_allocation}.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVExternalMemoryCapabilities {

    /** The extension specification version. */
    public static final int VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_NV_external_memory_capabilities";

    /**
     * VkExternalMemoryHandleTypeFlagBitsNV - Bitmask specifying external memory handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV} specifies a handle to memory returned by {@link NVExternalMemoryWin32#vkGetMemoryWin32HandleNV GetMemoryWin32HandleNV}.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV} specifies a handle to memory returned by {@link NVExternalMemoryWin32#vkGetMemoryWin32HandleNV GetMemoryWin32HandleNV}, or one duplicated from such a handle using {@code DuplicateHandle()}.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV} specifies a valid NT handle to memory returned by {@code IDXGIResource1::CreateSharedHandle}, or a handle duplicated from such a handle using {@code DuplicateHandle()}.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV} specifies a handle to memory returned by {@code IDXGIResource::GetSharedHandle()}.</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV     = 0x1,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV = 0x2,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV      = 0x4,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV  = 0x8;

    /**
     * VkExternalMemoryFeatureFlagBitsNV - Bitmask specifying external memory features
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV} specifies that external memory of the specified type <b>must</b> be created as a dedicated allocation when used in the manner specified.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV} specifies that the implementation supports exporting handles of the specified type.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV} specifies that the implementation supports importing handles of the specified type.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalImageFormatPropertiesNV}, {@link #vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}</p>
     */
    public static final int
        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 0x1,
        VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV     = 0x2,
        VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV     = 0x4;

    protected NVExternalMemoryCapabilities() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceExternalImageFormatPropertiesNV ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV} */
    public static int nvkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, int externalHandleType, long pExternalImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalImageFormatPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(physicalDevice.address(), format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties, __functionAddress);
    }

    /**
     * Determine image capabilities compatible with external memory handle types.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the image capabilities compatible with an external memory handle type, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkFormat                                    format,
     *     VkImageType                                 type,
     *     VkImageTiling                               tiling,
     *     VkImageUsageFlags                           usage,
     *     VkImageCreateFlags                          flags,
     *     VkExternalMemoryHandleTypeFlagsNV           externalHandleType,
     *     VkExternalImageFormatPropertiesNV*          pExternalImageFormatProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code externalHandleType} is 0, {@code pExternalImageFormatProperties→imageFormatProperties} will return the same values as a call to {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, and the other members of {@code pExternalImageFormatProperties} will all be 0. Otherwise, they are filled in as described for {@link VkExternalImageFormatPropertiesNV}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
     * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
     * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
     * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
     * <li>{@code usage} <b>must</b> not be 0</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
     * <li>{@code externalHandleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
     * <li>{@code pExternalImageFormatProperties} <b>must</b> be a valid pointer to a {@link VkExternalImageFormatPropertiesNV} structure</li>
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
     * <li>{@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalImageFormatPropertiesNV}</p>
     *
     * @param physicalDevice                 the physical device from which to query the image capabilities
     * @param format                         the image format, corresponding to {@link VkImageCreateInfo}{@code ::format}.
     * @param type                           the image type, corresponding to {@link VkImageCreateInfo}{@code ::imageType}.
     * @param tiling                         the image tiling, corresponding to {@link VkImageCreateInfo}{@code ::tiling}.
     * @param usage                          the intended usage of the image, corresponding to {@link VkImageCreateInfo}{@code ::usage}.
     * @param flags                          a bitmask describing additional parameters of the image, corresponding to {@link VkImageCreateInfo}{@code ::flags}.
     * @param externalHandleType             either one of the bits from {@code VkExternalMemoryHandleTypeFlagBitsNV}, or 0.
     * @param pExternalImageFormatProperties a pointer to a {@link VkExternalImageFormatPropertiesNV} structure in which capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageCreateFlags") int flags, @NativeType("VkExternalMemoryHandleTypeFlagsNV") int externalHandleType, @NativeType("VkExternalImageFormatPropertiesNV *") VkExternalImageFormatPropertiesNV pExternalImageFormatProperties) {
        return nvkGetPhysicalDeviceExternalImageFormatPropertiesNV(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties.address());
    }

}