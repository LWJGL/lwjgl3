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
 * An application using external memory may wish to synchronize access to that memory using fences. This extension enables an application to export fence payload to and import fence payload from Windows handles.
 * 
 * <h5>VK_KHR_external_fence_win32</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_fence_win32}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>115</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalFence VK_KHR_external_fence}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_fence_win32]%20@critsec%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_fence_win32%20extension%3E%3E">critsec</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-05-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Cass Everitt, Oculus</li>
 * <li>Contributors to {@link KHRExternalSemaphoreWin32 VK_KHR_external_semaphore_win32}</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalFenceWin32 {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME = "VK_KHR_external_fence_win32";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114000,
        VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114001,
        VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR    = 1000114002;

    protected KHRExternalFenceWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportFenceWin32HandleKHR ] ---

    /** Unsafe version of: {@link #vkImportFenceWin32HandleKHR ImportFenceWin32HandleKHR} */
    public static int nvkImportFenceWin32HandleKHR(VkDevice device, long pImportFenceWin32HandleInfo) {
        long __functionAddress = device.getCapabilities().vkImportFenceWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkImportFenceWin32HandleInfoKHR.validate(pImportFenceWin32HandleInfo);
        }
        return callPPI(device.address(), pImportFenceWin32HandleInfo, __functionAddress);
    }

    /**
     * Import a fence from a Windows HANDLE.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To import a fence payload from a Windows handle, call:</p>
     * 
     * <pre><code>
     * VkResult vkImportFenceWin32HandleKHR(
     *     VkDevice                                    device,
     *     const VkImportFenceWin32HandleInfoKHR*      pImportFenceWin32HandleInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Importing a fence payload from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the {@code CloseHandle} system call when the handle is no longer needed.</p>
     * 
     * <p>Applications <b>can</b> import the same fence payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code fence} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pImportFenceWin32HandleInfo} <b>must</b> be a valid pointer to a valid {@link VkImportFenceWin32HandleInfoKHR} structure</li>
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
     * <p>{@link VkImportFenceWin32HandleInfoKHR}</p>
     *
     * @param device                      the logical device that created the fence.
     * @param pImportFenceWin32HandleInfo a pointer to a {@link VkImportFenceWin32HandleInfoKHR} structure specifying the fence and import parameters.
     */
    @NativeType("VkResult")
    public static int vkImportFenceWin32HandleKHR(VkDevice device, @NativeType("VkImportFenceWin32HandleInfoKHR const *") VkImportFenceWin32HandleInfoKHR pImportFenceWin32HandleInfo) {
        return nvkImportFenceWin32HandleKHR(device, pImportFenceWin32HandleInfo.address());
    }

    // --- [ vkGetFenceWin32HandleKHR ] ---

    /** Unsafe version of: {@link #vkGetFenceWin32HandleKHR GetFenceWin32HandleKHR} */
    public static int nvkGetFenceWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetFenceWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    /**
     * Get a Windows HANDLE for a fence.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a Windows handle representing the state of a fence, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetFenceWin32HandleKHR(
     *     VkDevice                                    device,
     *     const VkFenceGetWin32HandleInfoKHR*         pGetWin32HandleInfo,
     *     HANDLE*                                     pHandle);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>For handle types defined as NT handles, the handles returned by {@code vkGetFenceWin32HandleKHR} are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the {@code CloseHandle} system call when they are no longer needed.</p>
     * 
     * <p>Exporting a Windows handle from a fence <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-importing">Importing Fence Payloads</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetWin32HandleInfo} <b>must</b> be a valid pointer to a valid {@link VkFenceGetWin32HandleInfoKHR} structure</li>
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
     * <p>{@link VkFenceGetWin32HandleInfoKHR}</p>
     *
     * @param device              the logical device that created the fence being exported.
     * @param pGetWin32HandleInfo a pointer to a {@link VkFenceGetWin32HandleInfoKHR} structure containing parameters of the export operation.
     * @param pHandle             will return the Windows handle representing the fence state.
     */
    @NativeType("VkResult")
    public static int vkGetFenceWin32HandleKHR(VkDevice device, @NativeType("VkFenceGetWin32HandleInfoKHR const *") VkFenceGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetFenceWin32HandleKHR(device, pGetWin32HandleInfo.address(), memAddress(pHandle));
    }

}