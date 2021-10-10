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
 * This extension enables an application to import host allocations and host mapped foreign device memory to Vulkan memory objects.
 * 
 * <h5>VK_EXT_external_memory_host</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_external_memory_host}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>179</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_external_memory_host]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_external_memory_host%20extension%3E%3E">drakos-amd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-11-10</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jaakko Konttinen, AMD</li>
 * <li>David Mao, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTExternalMemoryHost {

    /** The extension specification version. */
    public static final int VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = "VK_EXT_external_memory_host";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT                 = 1000178000,
        VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT                  = 1000178001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT = 1000178002;

    /**
     * Extends {@code VkExternalMemoryHandleTypeFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT            = 0x80,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT = 0x100;

    protected EXTExternalMemoryHost() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryHostPointerPropertiesEXT ] ---

    /** Unsafe version of: {@link #vkGetMemoryHostPointerPropertiesEXT GetMemoryHostPointerPropertiesEXT} */
    public static int nvkGetMemoryHostPointerPropertiesEXT(VkDevice device, int handleType, long pHostPointer, long pMemoryHostPointerProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryHostPointerPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pHostPointer);
        }
        return callPPPI(device.address(), handleType, pHostPointer, pMemoryHostPointerProperties, __functionAddress);
    }

    /**
     * Get properties of external memory host pointer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the correct parameters to use when importing host pointers, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryHostPointerPropertiesEXT(
     *     VkDevice                                    device,
     *     VkExternalMemoryHandleTypeFlagBits          handleType,
     *     const void*                                 pHostPointer,
     *     VkMemoryHostPointerPropertiesEXT*           pMemoryHostPointerProperties);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code handleType} <b>must</b> be {@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT} or {@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}</li>
     * <li>{@code pHostPointer} <b>must</b> be a pointer aligned to an integer multiple of {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT}{@code ::minImportedHostPointerAlignment}</li>
     * <li>If {@code handleType} is {@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT}, {@code pHostPointer} <b>must</b> be a pointer to host memory</li>
     * <li>If {@code handleType} is {@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}, {@code pHostPointer} <b>must</b> be a pointer to host mapped foreign memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
     * <li>{@code pMemoryHostPointerProperties} <b>must</b> be a valid pointer to a {@link VkMemoryHostPointerPropertiesEXT} structure</li>
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
     * <li>{@link VK11#VK_ERROR_INVALID_EXTERNAL_HANDLE ERROR_INVALID_EXTERNAL_HANDLE}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryHostPointerPropertiesEXT}</p>
     *
     * @param device                       the logical device that will be importing {@code pHostPointer}.
     * @param handleType                   a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of the handle {@code pHostPointer}.
     * @param pHostPointer                 the host pointer to import from.
     * @param pMemoryHostPointerProperties a pointer to a {@link VkMemoryHostPointerPropertiesEXT} structure in which the host pointer properties are returned.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryHostPointerPropertiesEXT(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("void const *") long pHostPointer, @NativeType("VkMemoryHostPointerPropertiesEXT *") VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties) {
        return nvkGetMemoryHostPointerPropertiesEXT(device, handleType, pHostPointer, pMemoryHostPointerProperties.address());
    }

}