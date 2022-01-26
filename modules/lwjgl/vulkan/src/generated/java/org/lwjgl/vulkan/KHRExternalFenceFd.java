/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * An application using external memory may wish to synchronize access to that memory using fences. This extension enables an application to export fence payload to and import fence payload from POSIX file descriptors.
 * 
 * <h5>VK_KHR_external_fence_fd</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_fence_fd}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>116</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalFence VK_KHR_external_fence}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_fence_fd]%20@critsec%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_fence_fd%20extension%3E%3E">critsec</a></li>
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
 * <li>Contributors to {@link KHRExternalSemaphoreFd VK_KHR_external_semaphore_fd}</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalFenceFd {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = 1000115000,
        VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR    = 1000115001;

    protected KHRExternalFenceFd() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportFenceFdKHR ] ---

    /** Unsafe version of: {@link #vkImportFenceFdKHR ImportFenceFdKHR} */
    public static int nvkImportFenceFdKHR(VkDevice device, long pImportFenceFdInfo) {
        long __functionAddress = device.getCapabilities().vkImportFenceFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pImportFenceFdInfo, __functionAddress);
    }

    /**
     * Import a fence from a POSIX file descriptor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To import a fence payload from a POSIX file descriptor, call:</p>
     * 
     * <pre><code>
     * VkResult vkImportFenceFdKHR(
     *     VkDevice                                    device,
     *     const VkImportFenceFdInfoKHR*               pImportFenceFdInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Importing a fence payload from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.</p>
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
     * <li>{@code pImportFenceFdInfo} <b>must</b> be a valid pointer to a valid {@link VkImportFenceFdInfoKHR} structure</li>
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
     * <p>{@link VkImportFenceFdInfoKHR}</p>
     *
     * @param device             the logical device that created the fence.
     * @param pImportFenceFdInfo a pointer to a {@link VkImportFenceFdInfoKHR} structure specifying the fence and import parameters.
     */
    @NativeType("VkResult")
    public static int vkImportFenceFdKHR(VkDevice device, @NativeType("VkImportFenceFdInfoKHR const *") VkImportFenceFdInfoKHR pImportFenceFdInfo) {
        return nvkImportFenceFdKHR(device, pImportFenceFdInfo.address());
    }

    // --- [ vkGetFenceFdKHR ] ---

    /** Unsafe version of: {@link #vkGetFenceFdKHR GetFenceFdKHR} */
    public static int nvkGetFenceFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetFenceFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    /**
     * Get a POSIX file descriptor handle for a fence.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a POSIX file descriptor representing the payload of a fence, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetFenceFdKHR(
     *     VkDevice                                    device,
     *     const VkFenceGetFdInfoKHR*                  pGetFdInfo,
     *     int*                                        pFd);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call to {@code vkGetFenceFdKHR} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor when it is no longer needed.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Ownership can be released in many ways. For example, the application can call {@code close}() on the file descriptor, or transfer ownership back to Vulkan by using the file descriptor to import a fence payload.</p>
     * </div>
     * 
     * <p>If {@code pGetFdInfo→handleType} is {@link VK11#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT} and the fence is signaled at the time {@code vkGetFenceFdKHR} is called, {@code pFd} <b>may</b> return the value {@code -1} instead of a valid file descriptor.</p>
     * 
     * <p>Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an {@code execve} system call is made.</p>
     * 
     * <p>Exporting a file descriptor from a fence <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-importing">Importing Fence State</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetFdInfo} <b>must</b> be a valid pointer to a valid {@link VkFenceGetFdInfoKHR} structure</li>
     * <li>{@code pFd} <b>must</b> be a valid pointer to an {@code int} value</li>
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
     * <p>{@link VkFenceGetFdInfoKHR}</p>
     *
     * @param device     the logical device that created the fence being exported.
     * @param pGetFdInfo a pointer to a {@link VkFenceGetFdInfoKHR} structure containing parameters of the export operation.
     * @param pFd        will return the file descriptor representing the fence payload.
     */
    @NativeType("VkResult")
    public static int vkGetFenceFdKHR(VkDevice device, @NativeType("VkFenceGetFdInfoKHR const *") VkFenceGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetFenceFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    /** Array version of: {@link #vkGetFenceFdKHR GetFenceFdKHR} */
    @NativeType("VkResult")
    public static int vkGetFenceFdKHR(VkDevice device, @NativeType("VkFenceGetFdInfoKHR const *") VkFenceGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetFenceFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }

}