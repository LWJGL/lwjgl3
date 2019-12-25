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
 * This extension allows the application to query a 64-bit buffer device address value for a buffer, which can be used to access the buffer memory via the {@code PhysicalStorageBuffer} storage class in the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> GLSL extension and <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_physical_storage_buffer.html">{@code SPV_KHR_physical_storage_buffer}</a> SPIR-V extension.
 * 
 * <p>This extension also allows opaque addresses for buffers and memory objects to be queried and later supplied by a trace capture and replay tool, so that addresses used at replay time match the addresses used when the trace was captured. To enable tools to insert these queries, new memory allocation flags must be specified for memory objects that will be bound to buffers accessed via the {@code PhysicalStorageBuffer} storage class.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_buffer_device_address}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>258</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_buffer_device_address:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-06-24</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Neil Henning, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Baldur Karlsson, Valve</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * </ul></dd>
 * </dl>
 */
public class KHRBufferDeviceAddress {

    /** The extension specification version. */
    public static final int VK_KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_KHR_buffer_device_address";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR = 1000257000,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR                     = 1000244001,
        VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR      = 1000257002,
        VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR    = 1000257003,
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR      = 1000257004;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR = 0x20000;

    /** Extends {@code VkBufferCreateFlagBits}. */
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x10;

    /**
     * Extends {@code VkMemoryAllocateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR}</li>
     * <li>{@link #VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR                = 0x2,
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x4;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR = -1000244000;

    protected KHRBufferDeviceAddress() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_buffer_device_address") && VK.checkExtension("VK_KHR_buffer_device_address",
               VK.isSupported(provider, "vkGetBufferDeviceAddressKHR", caps)
            && VK.isSupported(provider, "vkGetBufferOpaqueCaptureAddressKHR", caps)
            && VK.isSupported(provider, "vkGetDeviceMemoryOpaqueCaptureAddressKHR", caps)
        );
    }

    // --- [ vkGetBufferDeviceAddressKHR ] ---

    /** Unsafe version of: {@link #vkGetBufferDeviceAddressKHR GetBufferDeviceAddressKHR} */
    public static long nvkGetBufferDeviceAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferDeviceAddressKHR;
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
     * VkDeviceAddress vkGetBufferDeviceAddressKHR(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfoKHR*         pInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetBufferDeviceAddressEXT(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfoKHR*         pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an address of the start of {@code pInfo}-&gt;buffer. The address range starting at this value and whose size is the size of the buffer <b>can</b> be used in a shader to access the memory bound to that buffer, using the {@code SPV_KHR_physical_storage_buffer} extension or the equivalent {@code SPV_EXT_physical_storage_buffer} extension and the {@code PhysicalStorageBuffer} storage class. For example, this value <b>can</b> be stored in a uniform buffer, and the shader <b>can</b> read the value from the uniform buffer and use it to do a dependent read/write to this buffer. A value of zero is reserved as a "{@code null}" pointer and <b>must</b> not be returned as a valid buffer device address. All loads, stores, and atomics in a shader through {@code PhysicalStorageBuffer} pointers <b>must</b> access addresses in the address range of some buffer.</p>
     * 
     * <p>If the buffer was created with a non-zero value of {@link VkBufferOpaqueCaptureAddressCreateInfoKHR}{@code ::opaqueCaptureAddress} or {@link VkBufferDeviceAddressCreateInfoEXT}{@code ::deviceAddress} the return value will be the same address that was returned at capture time.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-bufferDeviceAddress">bufferDeviceAddress</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-bufferDeviceAddressEXT">{@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}{@code ::bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDeviceEXT">{@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}{@code ::bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferDeviceAddressInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferDeviceAddressInfoKHR}</p>
     *
     * @param device the logical device that the buffer was created on.
     * @param pInfo  a pointer to a {@link VkBufferDeviceAddressInfoKHR} structure specifying the buffer to retrieve an address for.
     */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddressKHR(VkDevice device, @NativeType("VkBufferDeviceAddressInfoKHR const *") VkBufferDeviceAddressInfoKHR pInfo) {
        return nvkGetBufferDeviceAddressKHR(device, pInfo.address());
    }

    // --- [ vkGetBufferOpaqueCaptureAddressKHR ] ---

    /** Unsafe version of: {@link #vkGetBufferOpaqueCaptureAddressKHR GetBufferOpaqueCaptureAddressKHR} */
    public static long nvkGetBufferOpaqueCaptureAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Query an opaque capture address of a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a 64-bit buffer opaque capture address, call:</p>
     * 
     * <pre><code>
     * uint64_t vkGetBufferOpaqueCaptureAddressKHR(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfoKHR*         pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an opaque capture address of the start of {@code pInfo}-&gt;buffer.</p>
     * 
     * <p>If the buffer was created with a non-zero value of {@link VkBufferOpaqueCaptureAddressCreateInfoKHR}{@code ::opaqueCaptureAddress} the return value <b>must</b> be the same address.</p>
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
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferDeviceAddressInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferDeviceAddressInfoKHR}</p>
     *
     * @param device the logical device that the buffer was created on.
     * @param pInfo  a pointer to a {@link VkBufferDeviceAddressInfoKHR} structure specifying the buffer to retrieve an address for.
     */
    @NativeType("uint64_t")
    public static long vkGetBufferOpaqueCaptureAddressKHR(VkDevice device, @NativeType("VkBufferDeviceAddressInfoKHR const *") VkBufferDeviceAddressInfoKHR pInfo) {
        return nvkGetBufferOpaqueCaptureAddressKHR(device, pInfo.address());
    }

    // --- [ vkGetDeviceMemoryOpaqueCaptureAddressKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceMemoryOpaqueCaptureAddressKHR GetDeviceMemoryOpaqueCaptureAddressKHR} */
    public static long nvkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryOpaqueCaptureAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Query an opaque capture address of a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a 64-bit opaque capture address value from a memory object, call:</p>
     * 
     * <pre><code>
     * uint64_t vkGetDeviceMemoryOpaqueCaptureAddressKHR(
     *     VkDevice                                    device,
     *     const VkDeviceMemoryOpaqueCaptureAddressInfoKHR* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an opaque address representing the start of {@code pInfo}-&gt;memory.</p>
     * 
     * <p>If the memory object was allocated with a non-zero value of {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR}{@code ::opaqueCaptureAddress}, the return value <b>must</b> be the same address.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The expected usage for these opaque addresses is only for trace capture/replay tools to store these addresses in a trace and subsequently specify them during replay.</p>
     * </div>
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
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR}</p>
     *
     * @param device the logical device that the memory object was allocated on.
     * @param pInfo  a pointer to a {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR} structure specifying the memory object to retrieve an address for.
     */
    @NativeType("uint64_t")
    public static long vkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, @NativeType("VkDeviceMemoryOpaqueCaptureAddressInfoKHR const *") VkDeviceMemoryOpaqueCaptureAddressInfoKHR pInfo) {
        return nvkGetDeviceMemoryOpaqueCaptureAddressKHR(device, pInfo.address());
    }

}