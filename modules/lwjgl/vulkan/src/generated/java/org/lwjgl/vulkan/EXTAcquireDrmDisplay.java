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
 * This extension allows an application to take exclusive control of a display using the Direct Rendering Manager (DRM) interface. When acquired, the display will be under full control of the application until the display is either released or the connector is unplugged.
 * 
 * <h5>VK_EXT_acquire_drm_display</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_acquire_drm_display}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>286</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link EXTDirectModeDisplay VK_EXT_direct_mode_display}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Drew DeVault <a target="_blank" href="mailto:sir@cmpwn.com">sir@cmpwn.com</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-06-09</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Simon Zeni, Status Holdings, Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public class EXTAcquireDrmDisplay {

    /** The extension specification version. */
    public static final int VK_EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_drm_display";

    protected EXTAcquireDrmDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkAcquireDrmDisplayEXT ] ---

    /**
     * Acquire access to a VkDisplayKHR using DRM.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire permission to directly a display in Vulkan from the Direct Rendering Manager (DRM) interface, call:</p>
     * 
     * <pre><code>
     * VkResult vkAcquireDrmDisplayEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     int32_t                                     drmFd,
     *     VkDisplayKHR                                display);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>All permissions necessary to control the display are granted to the Vulkan instance associated with the provided {@code physicalDevice} until the display is either released or the connector is unplugged. The provided {@code drmFd} must correspond to the one owned by the {@code physicalDevice}. If not, the error code {@link VK10#VK_ERROR_UNKNOWN ERROR_UNKNOWN} must be returned. The DRM FD must have DRM master permissions. If any error is encountered during the acquisition of the display, the call must return the error code {@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}.</p>
     * 
     * <p>The provided DRM fd should not be closed before the display is released, attempting to do it may result in undefined behaviour.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param physicalDevice The physical device the display is on.
     * @param drmFd          DRM primary file descriptor.
     * @param display        The display the caller wishes Vulkan to control.
     */
    @NativeType("VkResult")
    public static int vkAcquireDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireDrmDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(physicalDevice.address(), drmFd, display, __functionAddress);
    }

    // --- [ vkGetDrmDisplayEXT ] ---

    /** Unsafe version of: {@link #vkGetDrmDisplayEXT GetDrmDisplayEXT} */
    public static int nvkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, int connectorId, long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDrmDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(physicalDevice.address(), drmFd, connectorId, display, __functionAddress);
    }

    /**
     * Query the VkDisplayKHR corresponding to a DRM connector ID.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Before acquiring a display from the DRM interface, the caller may want to select a specific {@code VkDisplayKHR} handle by identifying it using a {@code connectorId}. To do so, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetDrmDisplayEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     int32_t                                     drmFd,
     *     uint32_t                                    connectorId,
     *     VkDisplayKHR*                               display);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If there is no {@code VkDisplayKHR} corresponding to the {@code connectorId} on the {@code physicalDevice}, the returning {@code display} must be set to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. The provided {@code drmFd} must correspond to the one owned by the {@code physicalDevice}. If not, the error code {@link VK10#VK_ERROR_UNKNOWN ERROR_UNKNOWN} must be returned. Master permissions are not required, because the file descriptor is just used for information gathering purposes. The given {@code connectorId} must be a resource owned by the provided {@code drmFd}. If not, the error code {@link VK10#VK_ERROR_UNKNOWN ERROR_UNKNOWN} must be returned. If any error is encountered during the identification of the display, the call must return the error code {@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid pointer to a {@code VkDisplayKHR} handle</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param physicalDevice The physical device to query the display from.
     * @param drmFd          DRM primary file descriptor.
     * @param connectorId    Identifier of the specified DRM connector.
     * @param display        The corresponding {@code VkDisplayKHR} handle will be returned here.
     */
    @NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("uint32_t") int connectorId, @NativeType("VkDisplayKHR *") LongBuffer display) {
        if (CHECKS) {
            check(display, 1);
        }
        return nvkGetDrmDisplayEXT(physicalDevice, drmFd, connectorId, memAddress(display));
    }

    /** Array version of: {@link #vkGetDrmDisplayEXT GetDrmDisplayEXT} */
    @NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("uint32_t") int connectorId, @NativeType("VkDisplayKHR *") long[] display) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDrmDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display, 1);
        }
        return callPPI(physicalDevice.address(), drmFd, connectorId, display, __functionAddress);
    }

}