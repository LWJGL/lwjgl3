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
 * This extension allows the application to query a 64-bit buffer device address value for a buffer, which can be used to access the buffer memory via the {@code PhysicalStorageBufferEXT} storage class in the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> GLSL extension and <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_physical_storage_buffer.html">{@code SPV_EXT_physical_storage_buffer}</a> SPIR-V extension.
 * 
 * <p>It also allows buffer device addresses to be provided by a trace replay tool, so that it matches the address used when the trace was captured.</p>
 * 
 * <h5>VK_EXT_buffer_device_address</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_buffer_device_address}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>245</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> by {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address} extension
 * 
 * <ul>
 * <li>Which in turn was <em>promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul>
 * </li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_buffer_device_address]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_buffer_device_address%20extension%3E%3E">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-01-06</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_physical_storage_buffer.html">{@code SPV_EXT_physical_storage_buffer}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GLSL_EXT_buffer_reference}</a> and <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference_uvec2.txt">{@code GLSL_EXT_buffer_reference_uvec2}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Neil Henning, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Baldur Karlsson, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class EXTBufferDeviceAddress {

    /** The extension specification version. */
    public static final int VK_EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_EXT_buffer_device_address";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT = 1000244000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT        = 1000244000,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT                     = 1000244001,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT              = 1000244002;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT = 0x20000;

    /** Extends {@code VkBufferCreateFlagBits}. */
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 0x10;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = -1000257000;

    protected EXTBufferDeviceAddress() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetBufferDeviceAddressEXT ] ---

    /** Unsafe version of: {@link #vkGetBufferDeviceAddressEXT GetBufferDeviceAddressEXT} */
    public static long nvkGetBufferDeviceAddressEXT(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferDeviceAddressEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * See {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}.
     *
     * @param device the logical device that the buffer was created on.
     * @param pInfo  a pointer to a {@link VkBufferDeviceAddressInfo} structure specifying the buffer to retrieve an address for.
     */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddressEXT(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferDeviceAddressEXT(device, pInfo.address());
    }

}