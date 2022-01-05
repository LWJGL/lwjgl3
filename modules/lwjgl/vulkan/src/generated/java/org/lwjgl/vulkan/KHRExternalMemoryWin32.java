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

import org.lwjgl.system.windows.*;

/**
 * An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export Windows handles from Vulkan memory objects and to import Vulkan memory objects from Windows handles exported from other Vulkan memory objects or from similar resources in other APIs.
 * 
 * <h5>VK_KHR_external_memory_win32</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_memory_win32}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>74</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_memory_win32]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_memory_win32%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Carsten Rohde, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalMemoryWin32 {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHR_external_memory_win32";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073000,
        VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073001,
        VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR  = 1000073002,
        VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR    = 1000073003;

    protected KHRExternalMemoryWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryWin32HandleKHR ] ---

    /** Unsafe version of: {@link #vkGetMemoryWin32HandleKHR GetMemoryWin32HandleKHR} */
    public static int nvkGetMemoryWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    /**
     * Get a Windows HANDLE for a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a Windows handle representing the payload of a Vulkan device memory object, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryWin32HandleKHR(
     *     VkDevice                                    device,
     *     const VkMemoryGetWin32HandleInfoKHR*        pGetWin32HandleInfo,
     *     HANDLE*                                     pHandle);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>For handle types defined as NT handles, the handles returned by {@code vkGetMemoryWin32HandleKHR} are owned by the application and hold a reference to their payload. To avoid leaking resources, the application <b>must</b> release ownership of them using the {@code CloseHandle} system call when they are no longer needed.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Non-NT handle types do not add a reference to their associated payload. If the original object owning the payload is destroyed, all resources and handles sharing that payload will become invalid.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetWin32HandleInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryGetWin32HandleInfoKHR} structure</li>
     * <li>{@code pHandle} <b>must</b> be a valid pointer to a {@code HANDLE} value</li>
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
     * <p>{@link VkMemoryGetWin32HandleInfoKHR}</p>
     *
     * @param device              the logical device that created the device memory being exported.
     * @param pGetWin32HandleInfo a pointer to a {@link VkMemoryGetWin32HandleInfoKHR} structure containing parameters of the export operation.
     * @param pHandle             will return the Windows handle representing the payload of the device memory object.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandleKHR(VkDevice device, @NativeType("VkMemoryGetWin32HandleInfoKHR const *") VkMemoryGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetMemoryWin32HandleKHR(device, pGetWin32HandleInfo.address(), memAddress(pHandle));
    }

    // --- [ vkGetMemoryWin32HandlePropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetMemoryWin32HandlePropertiesKHR GetMemoryWin32HandlePropertiesKHR} */
    public static int nvkGetMemoryWin32HandlePropertiesKHR(VkDevice device, int handleType, long handle, long pMemoryWin32HandleProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandlePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(handle);
        }
        return callPPPI(device.address(), handleType, handle, pMemoryWin32HandleProperties, __functionAddress);
    }

    /**
     * Get Properties of External Memory Win32 Handles.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Windows memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryWin32HandlePropertiesKHR(
     *     VkDevice                                    device,
     *     VkExternalMemoryHandleTypeFlagBits          handleType,
     *     HANDLE                                      handle,
     *     VkMemoryWin32HandlePropertiesKHR*           pMemoryWin32HandleProperties);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code handle} <b>must</b> be an external memory handle created outside of the Vulkan API</li>
     * <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
     * <li>{@code pMemoryWin32HandleProperties} <b>must</b> be a valid pointer to a {@link VkMemoryWin32HandlePropertiesKHR} structure</li>
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
     * <p>{@link VkMemoryWin32HandlePropertiesKHR}</p>
     *
     * @param device                       the logical device that will be importing {@code handle}.
     * @param handleType                   a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of the handle {@code handle}.
     * @param handle                       the handle which will be imported.
     * @param pMemoryWin32HandleProperties a pointer to a {@link VkMemoryWin32HandlePropertiesKHR} structure in which properties of {@code handle} are returned.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandlePropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("HANDLE") long handle, @NativeType("VkMemoryWin32HandlePropertiesKHR *") VkMemoryWin32HandlePropertiesKHR pMemoryWin32HandleProperties) {
        return nvkGetMemoryWin32HandlePropertiesKHR(device, handleType, handle, pMemoryWin32HandleProperties.address());
    }

}