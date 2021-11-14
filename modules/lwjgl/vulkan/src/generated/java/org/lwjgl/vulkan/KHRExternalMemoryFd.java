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
 * An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export POSIX file descriptor handles from Vulkan memory objects and to import Vulkan memory objects from POSIX file descriptor handles exported from other Vulkan memory objects or from similar resources in other APIs.
 * 
 * <h5>VK_KHR_external_memory_fd</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_memory_fd}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>75</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_memory_fd]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_memory_fd%20extension%3E%3E">cubanismo</a></li>
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
 * </ul></dd>
 * </dl>
 */
public class KHRExternalMemoryFd {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = 1000074000,
        VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR  = 1000074001,
        VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR    = 1000074002;

    protected KHRExternalMemoryFd() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryFdKHR ] ---

    /** Unsafe version of: {@link #vkGetMemoryFdKHR GetMemoryFdKHR} */
    public static int nvkGetMemoryFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    /**
     * Get a POSIX file descriptor for a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export a POSIX file descriptor referencing the payload of a Vulkan device memory object, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryFdKHR(
     *     VkDevice                                    device,
     *     const VkMemoryGetFdInfoKHR*                 pGetFdInfo,
     *     int*                                        pFd);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call to {@code vkGetMemoryFdKHR} <b>must</b> create a new file descriptor holding a reference to the memory object’s payload and transfer ownership of the file descriptor to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor using the {@code close} system call when it is no longer needed, or by importing a Vulkan memory object from it. Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an {@code execve} system call is made.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pGetFdInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryGetFdInfoKHR} structure</li>
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
     * <p>{@link VkMemoryGetFdInfoKHR}</p>
     *
     * @param device     the logical device that created the device memory being exported.
     * @param pGetFdInfo a pointer to a {@link VkMemoryGetFdInfoKHR} structure containing parameters of the export operation.
     * @param pFd        will return a file descriptor referencing the payload of the device memory object.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("VkMemoryGetFdInfoKHR const *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetMemoryFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    // --- [ vkGetMemoryFdPropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR} */
    public static int nvkGetMemoryFdPropertiesKHR(VkDevice device, int handleType, int fd, long pMemoryFdProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), handleType, fd, pMemoryFdProperties, __functionAddress);
    }

    /**
     * Get Properties of External Memory File Descriptors.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>POSIX file descriptor memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryFdPropertiesKHR(
     *     VkDevice                                    device,
     *     VkExternalMemoryHandleTypeFlagBits          handleType,
     *     int                                         fd,
     *     VkMemoryFdPropertiesKHR*                    pMemoryFdProperties);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code fd} <b>must</b> be an external memory handle created outside of the Vulkan API</li>
     * <li>{@code handleType} <b>must</b> not be {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
     * <li>{@code pMemoryFdProperties} <b>must</b> be a valid pointer to a {@link VkMemoryFdPropertiesKHR} structure</li>
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
     * <p>{@link VkMemoryFdPropertiesKHR}</p>
     *
     * @param device              the logical device that will be importing {@code fd}.
     * @param handleType          a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of the handle {@code fd}.
     * @param fd                  the handle which will be imported.
     * @param pMemoryFdProperties a pointer to a {@link VkMemoryFdPropertiesKHR} structure in which the properties of the handle {@code fd} are returned.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryFdPropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, int fd, @NativeType("VkMemoryFdPropertiesKHR *") VkMemoryFdPropertiesKHR pMemoryFdProperties) {
        return nvkGetMemoryFdPropertiesKHR(device, handleType, fd, pMemoryFdProperties.address());
    }

    /** Array version of: {@link #vkGetMemoryFdKHR GetMemoryFdKHR} */
    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("VkMemoryGetFdInfoKHR const *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }

}