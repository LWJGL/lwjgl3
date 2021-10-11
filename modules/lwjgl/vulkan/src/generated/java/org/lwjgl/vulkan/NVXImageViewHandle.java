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
 * This extension allows applications to query an opaque handle from an image view for use as a sampled image or storage image. This provides no direct functionality itself.
 * 
 * <h5>VK_NVX_image_view_handle</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NVX_image_view_handle}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>31</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_image_view_handle]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_image_view_handle%20extension%3E%3E">ewerness-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-04-03</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVXImageViewHandle {

    /** The extension specification version. */
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX        = 1000030000,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;

    protected NVXImageViewHandle() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageViewHandleNVX ] ---

    /** Unsafe version of: {@link #vkGetImageViewHandleNVX GetImageViewHandleNVX} */
    public static int nvkGetImageViewHandleNVX(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetImageViewHandleNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /**
     * Get the handle for an image view for a specific descriptor type.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the handle for an image view, call:</p>
     * 
     * <pre><code>
     * uint32_t vkGetImageViewHandleNVX(
     *     VkDevice                                    device,
     *     const VkImageViewHandleInfoNVX*             pInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkImageViewHandleInfoNVX} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageViewHandleInfoNVX}</p>
     *
     * @param device the logical device that owns the image view.
     * @param pInfo  describes the image view to query and type of handle.
     */
    @NativeType("uint32_t")
    public static int vkGetImageViewHandleNVX(VkDevice device, @NativeType("VkImageViewHandleInfoNVX const *") VkImageViewHandleInfoNVX pInfo) {
        return nvkGetImageViewHandleNVX(device, pInfo.address());
    }

    // --- [ vkGetImageViewAddressNVX ] ---

    /** Unsafe version of: {@link #vkGetImageViewAddressNVX GetImageViewAddressNVX} */
    public static int nvkGetImageViewAddressNVX(VkDevice device, long imageView, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetImageViewAddressNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), imageView, pProperties, __functionAddress);
    }

    /**
     * Get the device address of an image view.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the device address for an image view, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetImageViewAddressNVX(
     *     VkDevice                                    device,
     *     VkImageView                                 imageView,
     *     VkImageViewAddressPropertiesNVX*            pProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
     * <li>{@code pProperties} <b>must</b> be a valid pointer to a {@link VkImageViewAddressPropertiesNVX} structure</li>
     * <li>{@code imageView} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_UNKNOWN ERROR_UNKNOWN}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageViewAddressPropertiesNVX}</p>
     *
     * @param device      the logical device that owns the image view.
     * @param imageView   a handle to the image view.
     * @param pProperties contains the device address and size when the call returns.
     */
    @NativeType("VkResult")
    public static int vkGetImageViewAddressNVX(VkDevice device, @NativeType("VkImageView") long imageView, @NativeType("VkImageViewAddressPropertiesNVX *") VkImageViewAddressPropertiesNVX pProperties) {
        return nvkGetImageViewAddressNVX(device, imageView, pProperties.address());
    }

}