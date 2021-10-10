/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides new entry points to query device display properties and capabilities in a way that can be easily extended by other extensions, without introducing any further entry points. This extension can be considered the {@link KHRDisplay VK_KHR_display} equivalent of the {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} extension.
 * 
 * <h5>VK_KHR_get_display_properties2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_get_display_properties2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>122</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRDisplay VK_KHR_display}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_display_properties2]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_display_properties2%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-02-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ian Elliott, Google</li>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRGetDisplayProperties2 {

    /** The extension specification version. */
    public static final int VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_display_properties2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR         = 1000121000,
        VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR   = 1000121001,
        VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR    = 1000121002,
        VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR         = 1000121003,
        VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR = 1000121004;

    protected KHRGetDisplayProperties2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceDisplayProperties2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceDisplayProperties2KHR GetPhysicalDeviceDisplayProperties2KHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of display devices available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * Query information about the available displays.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query information about the available displays, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceDisplayProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pPropertyCount,
     *     VkDisplayProperties2KHR*                    pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetPhysicalDeviceDisplayProperties2KHR} behaves similarly to {@link KHRDisplay#vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR}, with the ability to return extended information via chained output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkDisplayProperties2KHR} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayProperties2KHR}</p>
     *
     * @param physicalDevice a physical device.
     * @param pPropertyCount a pointer to an integer related to the number of display devices available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkDisplayProperties2KHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkDisplayProperties2KHR *") VkDisplayProperties2KHR.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayProperties2KHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetPhysicalDeviceDisplayPlaneProperties2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceDisplayPlaneProperties2KHR GetPhysicalDeviceDisplayPlaneProperties2KHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of display planes available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * Query information about the available display planes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the properties of a device’s display planes, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pPropertyCount,
     *     VkDisplayPlaneProperties2KHR*               pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetPhysicalDeviceDisplayPlaneProperties2KHR} behaves similarly to {@link KHRDisplay#vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR}, with the ability to return extended information via chained output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkDisplayPlaneProperties2KHR} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayPlaneProperties2KHR}</p>
     *
     * @param physicalDevice a physical device.
     * @param pPropertyCount a pointer to an integer related to the number of display planes available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkDisplayPlaneProperties2KHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkDisplayPlaneProperties2KHR *") VkDisplayPlaneProperties2KHR.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPlaneProperties2KHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDisplayModeProperties2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetDisplayModeProperties2KHR GetDisplayModeProperties2KHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of display modes available or queried, as described below.
     */
    public static int nvkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModeProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * Query information about the available display modes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the properties of a device’s built-in display modes, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetDisplayModeProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkDisplayKHR                                display,
     *     uint32_t*                                   pPropertyCount,
     *     VkDisplayModeProperties2KHR*                pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetDisplayModeProperties2KHR} behaves similarly to {@link KHRDisplay#vkGetDisplayModePropertiesKHR GetDisplayModePropertiesKHR}, with the ability to return extended information via chained output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkDisplayModeProperties2KHR} structures</li>
     * <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayModeProperties2KHR}</p>
     *
     * @param physicalDevice the physical device associated with {@code display}.
     * @param display        the display to query.
     * @param pPropertyCount a pointer to an integer related to the number of display modes available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkDisplayModeProperties2KHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkDisplayModeProperties2KHR *") VkDisplayModeProperties2KHR.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetDisplayModeProperties2KHR(physicalDevice, display, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDisplayPlaneCapabilities2KHR ] ---

    /** Unsafe version of: {@link #vkGetDisplayPlaneCapabilities2KHR GetDisplayPlaneCapabilities2KHR} */
    public static int nvkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, long pDisplayPlaneInfo, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneCapabilities2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pDisplayPlaneInfo, pCapabilities, __functionAddress);
    }

    /**
     * Query capabilities of a mode and plane combination.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the capabilities of a given mode and plane combination, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetDisplayPlaneCapabilities2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkDisplayPlaneInfo2KHR*               pDisplayPlaneInfo,
     *     VkDisplayPlaneCapabilities2KHR*             pCapabilities);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetDisplayPlaneCapabilities2KHR} behaves similarly to {@link KHRDisplay#vkGetDisplayPlaneCapabilitiesKHR GetDisplayPlaneCapabilitiesKHR}, with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pDisplayPlaneInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplayPlaneInfo2KHR} structure</li>
     * <li>{@code pCapabilities} <b>must</b> be a valid pointer to a {@link VkDisplayPlaneCapabilities2KHR} structure</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayPlaneCapabilities2KHR}, {@link VkDisplayPlaneInfo2KHR}</p>
     *
     * @param physicalDevice    the physical device associated with {@code pDisplayPlaneInfo}.
     * @param pDisplayPlaneInfo a pointer to a {@link VkDisplayPlaneInfo2KHR} structure describing the plane and mode.
     * @param pCapabilities     a pointer to a {@link VkDisplayPlaneCapabilities2KHR} structure in which the capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayPlaneInfo2KHR const *") VkDisplayPlaneInfo2KHR pDisplayPlaneInfo, @NativeType("VkDisplayPlaneCapabilities2KHR *") VkDisplayPlaneCapabilities2KHR pCapabilities) {
        return nvkGetDisplayPlaneCapabilities2KHR(physicalDevice, pDisplayPlaneInfo.address(), pCapabilities.address());
    }

    /** Array version of: {@link #vkGetPhysicalDeviceDisplayProperties2KHR GetPhysicalDeviceDisplayProperties2KHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkDisplayProperties2KHR *") VkDisplayProperties2KHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** Array version of: {@link #vkGetPhysicalDeviceDisplayPlaneProperties2KHR GetPhysicalDeviceDisplayPlaneProperties2KHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkDisplayPlaneProperties2KHR *") VkDisplayPlaneProperties2KHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** Array version of: {@link #vkGetDisplayModeProperties2KHR GetDisplayModeProperties2KHR} */
    @NativeType("VkResult")
    public static int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkDisplayModeProperties2KHR *") VkDisplayModeProperties2KHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModeProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}