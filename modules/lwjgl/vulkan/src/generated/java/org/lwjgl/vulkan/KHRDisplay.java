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
 * This extension provides the API to enumerate displays and available modes on a given device.
 * 
 * <h5>Examples</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The example code for the {@code VK_KHR_display} and {@link KHRDisplaySwapchain VK_KHR_display_swapchain} extensions was removed from the appendix after revision 1.0.43. The display enumeration example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c">https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c</a>).</p>
 * </div>
 * 
 * <h5>VK_KHR_display</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_display}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>3</dd>
 * <dt><b>Revision</b></dt>
 * <dd>23</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_display]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_display%20extension%3E%3E">cubanismo</a></li>
 * <li>Norbert Nopper <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_display]%20@FslNopper%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_display%20extension%3E%3E">FslNopper</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-13</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Norbert Nopper, Freescale</li>
 * <li>Jeff Vigil, Qualcomm</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDisplay {

    /** The extension specification version. */
    public static final int VK_KHR_DISPLAY_SPEC_VERSION = 23;

    /** The extension name. */
    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR    = 1000002000,
        VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;

    /**
     * Extends {@code VkObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_TYPE_DISPLAY_KHR OBJECT_TYPE_DISPLAY_KHR}</li>
     * <li>{@link #VK_OBJECT_TYPE_DISPLAY_MODE_KHR OBJECT_TYPE_DISPLAY_MODE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_OBJECT_TYPE_DISPLAY_KHR      = 1000002000,
        VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;

    /**
     * VkDisplayPlaneAlphaFlagBitsKHR - Alpha blending type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR} specifies that the source image will be treated as opaque.</li>
     * <li>{@link #VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR} specifies that a global alpha value <b>must</b> be specified that will be applied to all pixels in the source image.</li>
     * <li>{@link #VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR} specifies that the alpha value will be determined by the alpha component of the source image’s pixels. If the source format contains no alpha values, no blending will be applied. The source alpha values are not premultiplied into the source image’s other color components.</li>
     * <li>{@link #VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR} is equivalent to {@link #VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR}, except the source alpha values are assumed to be premultiplied into the source image’s other color components.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplaySurfaceCreateInfoKHR}</p>
     */
    public static final int
        VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR                  = 0x1,
        VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR                  = 0x2,
        VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR               = 0x4,
        VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x8;

    protected KHRDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceDisplayPropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of display devices available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPropertiesKHR;
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
     * <p>Various functions are provided for enumerating the available display devices present on a Vulkan physical device. To query information about the available displays, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pPropertyCount,
     *     VkDisplayPropertiesKHR*                     pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pProperties} is {@code NULL}, then the number of display devices available for {@code physicalDevice} is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of display devices for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available properties were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkDisplayPropertiesKHR} structures</li>
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
     * <p>{@link VkDisplayPropertiesKHR}</p>
     *
     * @param physicalDevice a physical device.
     * @param pPropertyCount a pointer to an integer related to the number of display devices available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkDisplayPropertiesKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkDisplayPropertiesKHR *") VkDisplayPropertiesKHR.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetPhysicalDeviceDisplayPlanePropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of display planes available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * Query the plane properties.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Images are presented to individual planes on a display. Devices <b>must</b> support at least one plane on each display. Planes <b>can</b> be stacked and blended to composite multiple images on one display. Devices <b>may</b> support only a fixed stacking order and fixed mapping between planes and displays, or they <b>may</b> allow arbitrary application specified stacking orders and mappings between planes and displays. To query the properties of device display planes, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pPropertyCount,
     *     VkDisplayPlanePropertiesKHR*                pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pProperties} is {@code NULL}, then the number of display planes available for {@code physicalDevice} is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of display planes for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkDisplayPlanePropertiesKHR} structures</li>
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
     * <p>{@link VkDisplayPlanePropertiesKHR}</p>
     *
     * @param physicalDevice a physical device.
     * @param pPropertyCount a pointer to an integer related to the number of display planes available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkDisplayPlanePropertiesKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkDisplayPlanePropertiesKHR *") VkDisplayPlanePropertiesKHR.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDisplayPlaneSupportedDisplaysKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetDisplayPlaneSupportedDisplaysKHR GetDisplayPlaneSupportedDisplaysKHR}
     *
     * @param pDisplayCount a pointer to an integer related to the number of displays available or queried, as described below.
     */
    public static int nvkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, long pDisplayCount, long pDisplays) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneSupportedDisplaysKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), planeIndex, pDisplayCount, pDisplays, __functionAddress);
    }

    /**
     * Query the list of displays a plane supports.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine which displays a plane is usable with, call</p>
     * 
     * <pre><code>
     * VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    planeIndex,
     *     uint32_t*                                   pDisplayCount,
     *     VkDisplayKHR*                               pDisplays);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pDisplays} is {@code NULL}, then the number of displays usable with the specified {@code planeIndex} for {@code physicalDevice} is returned in {@code pDisplayCount}. Otherwise, {@code pDisplayCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pDisplays} array, and on return the variable is overwritten with the number of handles actually written to {@code pDisplays}. If the value of {@code pDisplayCount} is less than the number of usable display-plane pairs for {@code physicalDevice}, at most {@code pDisplayCount} handles will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available pairs were returned.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pDisplayCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pDisplayCount} is not 0, and {@code pDisplays} is not {@code NULL}, {@code pDisplays} <b>must</b> be a valid pointer to an array of {@code pDisplayCount} {@code VkDisplayKHR} handles</li>
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
     * @param physicalDevice a physical device.
     * @param planeIndex     the plane which the application wishes to use, and <b>must</b> be in the range <code>[0, physical device plane count - 1]</code>.
     * @param pDisplayCount  a pointer to an integer related to the number of displays available or queried, as described below.
     * @param pDisplays      either {@code NULL} or a pointer to an array of {@code VkDisplayKHR} handles.
     */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int planeIndex, @NativeType("uint32_t *") IntBuffer pDisplayCount, @Nullable @NativeType("VkDisplayKHR *") LongBuffer pDisplays) {
        if (CHECKS) {
            check(pDisplayCount, 1);
            checkSafe(pDisplays, pDisplayCount.get(pDisplayCount.position()));
        }
        return nvkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, memAddress(pDisplayCount), memAddressSafe(pDisplays));
    }

    // --- [ vkGetDisplayModePropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetDisplayModePropertiesKHR GetDisplayModePropertiesKHR}
     *
     * @param pPropertyCount a pointer to an integer related to the number of display modes available or queried, as described below.
     */
    public static int nvkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * Query the set of mode properties supported by the display.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Each display has one or more supported modes associated with it by default. These built-in modes are queried by calling:</p>
     * 
     * <pre><code>
     * VkResult vkGetDisplayModePropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkDisplayKHR                                display,
     *     uint32_t*                                   pPropertyCount,
     *     VkDisplayModePropertiesKHR*                 pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pProperties} is {@code NULL}, then the number of display modes available on the specified {@code display} for {@code physicalDevice} is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of display modes for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available display modes were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkDisplayModePropertiesKHR} structures</li>
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
     * <p>{@link VkDisplayModePropertiesKHR}</p>
     *
     * @param physicalDevice the physical device associated with {@code display}.
     * @param display        the display to query.
     * @param pPropertyCount a pointer to an integer related to the number of display modes available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkDisplayModePropertiesKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkDisplayModePropertiesKHR *") VkDisplayModePropertiesKHR.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetDisplayModePropertiesKHR(physicalDevice, display, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkCreateDisplayModeKHR ] ---

    /** Unsafe version of: {@link #vkCreateDisplayModeKHR CreateDisplayModeKHR} */
    public static int nvkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDisplayModeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPPI(physicalDevice.address(), display, pCreateInfo, pAllocator, pMode, __functionAddress);
    }

    /**
     * Create a display mode.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Additional modes <b>may</b> also be created by calling:</p>
     * 
     * <pre><code>
     * VkResult vkCreateDisplayModeKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkDisplayKHR                                display,
     *     const VkDisplayModeCreateInfoKHR*           pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDisplayModeKHR*                           pMode);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplayModeCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pMode} <b>must</b> be a valid pointer to a {@code VkDisplayModeKHR} handle</li>
     * <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code display} <b>must</b> be externally synchronized</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDisplayModeCreateInfoKHR}</p>
     *
     * @param physicalDevice the physical device associated with {@code display}.
     * @param display        the display to create an additional mode for.
     * @param pCreateInfo    a pointer to a {@link VkDisplayModeCreateInfoKHR} structure describing the new mode to create.
     * @param pAllocator     the allocator used for host memory allocated for the display mode object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pMode          a pointer to a {@code VkDisplayModeKHR} handle in which the mode created is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayModeCreateInfoKHR const *") VkDisplayModeCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDisplayModeKHR *") LongBuffer pMode) {
        if (CHECKS) {
            check(pMode, 1);
        }
        return nvkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pMode));
    }

    // --- [ vkGetDisplayPlaneCapabilitiesKHR ] ---

    /** Unsafe version of: {@link #vkGetDisplayPlaneCapabilitiesKHR GetDisplayPlaneCapabilitiesKHR} */
    public static int nvkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, long mode, int planeIndex, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(physicalDevice.address(), mode, planeIndex, pCapabilities, __functionAddress);
    }

    /**
     * Query capabilities of a mode and plane combination.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Applications that wish to present directly to a display <b>must</b> select which layer, or “{@code plane}” of the display they wish to target, and a mode to use with the display. Each display supports at least one plane. The capabilities of a given mode and plane combination are determined by calling:</p>
     * 
     * <pre><code>
     * VkResult vkGetDisplayPlaneCapabilitiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkDisplayModeKHR                            mode,
     *     uint32_t                                    planeIndex,
     *     VkDisplayPlaneCapabilitiesKHR*              pCapabilities);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code mode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
     * <li>{@code pCapabilities} <b>must</b> be a valid pointer to a {@link VkDisplayPlaneCapabilitiesKHR} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code mode} <b>must</b> be externally synchronized</li>
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
     * <p>{@link VkDisplayPlaneCapabilitiesKHR}</p>
     *
     * @param physicalDevice the physical device associated with the display specified by {@code mode}
     * @param mode           the display mode the application intends to program when using the specified plane. Note this parameter also implicitly specifies a display.
     * @param planeIndex     the plane which the application intends to use with the display, and is less than the number of display planes supported by the device.
     * @param pCapabilities  a pointer to a {@link VkDisplayPlaneCapabilitiesKHR} structure in which the capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayModeKHR") long mode, @NativeType("uint32_t") int planeIndex, @NativeType("VkDisplayPlaneCapabilitiesKHR *") VkDisplayPlaneCapabilitiesKHR pCapabilities) {
        return nvkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, pCapabilities.address());
    }

    // --- [ vkCreateDisplayPlaneSurfaceKHR ] ---

    /** Unsafe version of: {@link #vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR} */
    public static int nvkCreateDisplayPlaneSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateDisplayPlaneSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /**
     * Create a {@code VkSurfaceKHR} structure representing a display plane and mode.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A complete display configuration includes a mode, one or more display planes and any parameters describing their behavior, and parameters describing some aspects of the images associated with those planes. Display surfaces describe the configuration of a single plane within a complete display configuration. To create a {@code VkSurfaceKHR} object for a display plane, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateDisplayPlaneSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkDisplaySurfaceCreateInfoKHR*        pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplaySurfaceCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSurface} <b>must</b> be a valid pointer to a {@code VkSurfaceKHR} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkDisplaySurfaceCreateInfoKHR}</p>
     *
     * @param instance    the instance corresponding to the physical device the targeted display is on.
     * @param pCreateInfo a pointer to a {@link VkDisplaySurfaceCreateInfoKHR} structure specifying which mode, plane, and other parameters to use, as described below.
     * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSurface    a pointer to a {@code VkSurfaceKHR} handle in which the created surface is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, @NativeType("VkDisplaySurfaceCreateInfoKHR const *") VkDisplaySurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkDisplayPropertiesKHR *") VkDisplayPropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** Array version of: {@link #vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkDisplayPlanePropertiesKHR *") VkDisplayPlanePropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** Array version of: {@link #vkGetDisplayPlaneSupportedDisplaysKHR GetDisplayPlaneSupportedDisplaysKHR} */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int planeIndex, @NativeType("uint32_t *") int[] pDisplayCount, @Nullable @NativeType("VkDisplayKHR *") long[] pDisplays) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneSupportedDisplaysKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDisplayCount, 1);
            checkSafe(pDisplays, pDisplayCount[0]);
        }
        return callPPPI(physicalDevice.address(), planeIndex, pDisplayCount, pDisplays, __functionAddress);
    }

    /** Array version of: {@link #vkGetDisplayModePropertiesKHR GetDisplayModePropertiesKHR} */
    @NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkDisplayModePropertiesKHR *") VkDisplayModePropertiesKHR.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** Array version of: {@link #vkCreateDisplayModeKHR CreateDisplayModeKHR} */
    @NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayModeCreateInfoKHR const *") VkDisplayModeCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDisplayModeKHR *") long[] pMode) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDisplayModeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pMode, 1);
        }
        return callPJPPPI(physicalDevice.address(), display, pCreateInfo.address(), memAddressSafe(pAllocator), pMode, __functionAddress);
    }

    /** Array version of: {@link #vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR} */
    @NativeType("VkResult")
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, @NativeType("VkDisplaySurfaceCreateInfoKHR const *") VkDisplaySurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateDisplayPlaneSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}