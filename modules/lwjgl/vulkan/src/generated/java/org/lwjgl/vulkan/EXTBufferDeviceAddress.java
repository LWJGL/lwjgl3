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
 * This extension allows the application to query a 64-bit buffer device address value for a buffer, which can be used to access the buffer memory via the {@code PhysicalStorageBufferEXT} storage class in the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> GLSL extension and <a target="_blank" href="http://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_physical_storage_buffer.html">{@code SPV_EXT_physical_storage_buffer}</a> SPIR-V extension.
 * 
 * <p>It also allows buffer device addresses to be provided by a trace replay tool, so that it matches the address used when the trace was captured.</p>
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
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_buffer_device_address:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-01-06</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
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
    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = -1000244000;

    protected EXTBufferDeviceAddress() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_buffer_device_address") && VK.checkExtension("VK_EXT_buffer_device_address",
               VK.isSupported(provider, "vkGetBufferDeviceAddressEXT", caps)
        );
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
     * Query an address of a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a 64-bit buffer device address value through which buffer memory <b>can</b> be accessed in a shader, call:</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetBufferDeviceAddressEXT(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfoEXT*         pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an address of the start of {@code pInfo}{@code ::buffer}. The address range starting at this value and whose size is the size of the buffer <b>can</b> be used in a shader to access the memory bound to that buffer, using the {@code SPV_EXT_physical_storage_buffer} extension and the {@code PhysicalStorageBufferEXT} storage class. For example, this value <b>can</b> be stored in a uniform buffer, and the shader <b>can</b> read the value from the uniform buffer and use it to do a dependent read/write to this buffer. A value of zero is reserved as a "{@code null}" pointer and <b>must</b> not be returned as a valid buffer device address. All loads, stores, and atomics in a shader through {@code PhysicalStorageBufferEXT} pointers <b>must</b> access addresses in the address range of some buffer.</p>
     * 
     * <p>If the buffer was created with a non-zero value of {@link VkBufferDeviceAddressCreateInfoEXT}{@code ::deviceAddress}, the return value will be the same address.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-bufferDeviceAddress">bufferDeviceAddress</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferDeviceAddressInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferDeviceAddressInfoEXT}</p>
     *
     * @param device the logical device that the buffer was created on.
     * @param pInfo  a pointer to an instance of the {@link VkBufferDeviceAddressInfoEXT} structure specifying the buffer to retrieve an address for.
     */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddressEXT(VkDevice device, @NativeType("VkBufferDeviceAddressInfoEXT const *") VkBufferDeviceAddressInfoEXT pInfo) {
        return nvkGetBufferDeviceAddressEXT(device, pInfo.address());
    }

}