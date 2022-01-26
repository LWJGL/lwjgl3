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
 * An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore payload to and import semaphore payload from POSIX file descriptors.
 * 
 * <h5>VK_KHR_external_semaphore_fd</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_semaphore_fd}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>80</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalSemaphore VK_KHR_external_semaphore}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_semaphore_fd]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_semaphore_fd%20extension%3E%3E">cubanismo</a></li>
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
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Carsten Rohde, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalSemaphoreFd {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR = 1000079000,
        VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR    = 1000079001;

    protected KHRExternalSemaphoreFd() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportSemaphoreFdKHR ] ---

    /** Unsafe version of: {@link #vkImportSemaphoreFdKHR ImportSemaphoreFdKHR} */
    public static int nvkImportSemaphoreFdKHR(VkDevice device, long pImportSemaphoreFdInfo) {
        long __functionAddress = device.getCapabilities().vkImportSemaphoreFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pImportSemaphoreFdInfo, __functionAddress);
    }

    /**
     * Import a semaphore from a POSIX file descriptor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To import a semaphore payload from a POSIX file descriptor, call:</p>
     * 
     * <pre><code>
     * VkResult vkImportSemaphoreFdKHR(
     *     VkDevice                                    device,
     *     const VkImportSemaphoreFdInfoKHR*           pImportSemaphoreFdInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Importing a semaphore payload from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.</p>
     * 
     * <p>Applications <b>can</b> import the same semaphore payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code semaphore} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pImportSemaphoreFdInfo} <b>must</b> be a valid pointer to a valid {@link VkImportSemaphoreFdInfoKHR} structure</li>
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
     * <p>{@link VkImportSemaphoreFdInfoKHR}</p>
     *
     * @param device                 the logical device that created the semaphore.
     * @param pImportSemaphoreFdInfo a pointer to a {@link VkImportSemaphoreFdInfoKHR} structure specifying the semaphore and import parameters.
     */
    @NativeType("VkResult")
    public static int vkImportSemaphoreFdKHR(VkDevice device, @NativeType("VkImportSemaphoreFdInfoKHR const *") VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo) {
        return nvkImportSemaphoreFdKHR(device, pImportSemaphoreFdInfo.address());
    }

    // --- [ vkGetSemaphoreFdKHR ] ---

    /** Unsafe version of: {@link #vkGetSemaphoreFdKHR GetSemaphoreFdKHR} */
    public static int nvkGetSemaphoreFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    /**
     * Get a POSIX file descriptor handle for a semaphore.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a POSIX file descriptor representing the payload of a semaphore, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetSemaphoreFdKHR(
     *     VkDevice                                    device,
     *     const VkSemaphoreGetFdInfoKHR*              pGetFdInfo,
     *     int*                                        pFd);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call to {@code vkGetSemaphoreFdKHR} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor when it is no longer needed.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Ownership can be released in many ways. For example, the application can call {@code close}() on the file descriptor, or transfer ownership back to Vulkan by using the file descriptor to import a semaphore payload.</p>
     * </div>
     * 
     * <p>Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an {@code execve} system call is made.</p>
     * 
     * <p>Exporting a file descriptor from a semaphore <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore State</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetFdInfo} <b>must</b> be a valid pointer to a valid {@link VkSemaphoreGetFdInfoKHR} structure</li>
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
     * <p>{@link VkSemaphoreGetFdInfoKHR}</p>
     *
     * @param device     the logical device that created the semaphore being exported.
     * @param pGetFdInfo a pointer to a {@link VkSemaphoreGetFdInfoKHR} structure containing parameters of the export operation.
     * @param pFd        will return the file descriptor representing the semaphore payload.
     */
    @NativeType("VkResult")
    public static int vkGetSemaphoreFdKHR(VkDevice device, @NativeType("VkSemaphoreGetFdInfoKHR const *") VkSemaphoreGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetSemaphoreFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    /** Array version of: {@link #vkGetSemaphoreFdKHR GetSemaphoreFdKHR} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreFdKHR(VkDevice device, @NativeType("VkSemaphoreGetFdInfoKHR const *") VkSemaphoreGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }

}