/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides a new physical device query which allows retrieving information about the driver implementation, allowing applications to determine which physical device corresponds to which particular vendor's driver, and which conformance test suite version the driver implementation is compliant with.
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_driver_properties}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>197</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_driver_properties:%20&amp;body=@drakos-amd%20">drakos-amd</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-04-11</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Baldur Karlsson</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Alexander Galazin, Arm</li>
 * <li>Jesse Hall, Google</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRDriverProperties {

    /** The extension specification version. */
    public static final int VK_KHR_DRIVER_PROPERTIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DRIVER_PROPERTIES_EXTENSION_NAME = "VK_KHR_driver_properties";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR = 1000196000;

    /** VK_MAX_DRIVER_NAME_SIZE_KHR */
    public static final int VK_MAX_DRIVER_NAME_SIZE_KHR = 256;

    /** VK_MAX_DRIVER_INFO_SIZE_KHR */
    public static final int VK_MAX_DRIVER_INFO_SIZE_KHR = 256;

    /**
     * VkDriverIdKHR - Khronos driver IDs
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Khronos driver IDs may be allocated by vendors at any time. There may be multiple driver IDs for the same vendor, representing different drivers (for e.g. different platforms, proprietary or open source, etc.). Only the latest canonical versions of this Specification, of the corresponding {@code vk.xml} API Registry, and of the corresponding {@code vulkan_core.h} header file <b>must</b> contain all reserved Khronos driver IDs.</p>
     * 
     * <p>Only driver IDs registered with Khronos are given symbolic names. There <b>may</b> be unregistered driver IDs returned.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceDriverPropertiesKHR}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DRIVER_ID_AMD_PROPRIETARY_KHR DRIVER_ID_AMD_PROPRIETARY_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR DRIVER_ID_AMD_OPEN_SOURCE_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_RADV_KHR DRIVER_ID_MESA_RADV_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR DRIVER_ID_NVIDIA_PROPRIETARY_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR DRIVER_ID_IMAGINATION_PROPRIETARY_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR DRIVER_ID_QUALCOMM_PROPRIETARY_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_ARM_PROPRIETARY_KHR DRIVER_ID_ARM_PROPRIETARY_KHR}</li>
     * <li>{@link #VK_DRIVER_ID_GOOGLE_PASTEL_KHR DRIVER_ID_GOOGLE_PASTEL_KHR}</li>
     * </ul>
     */
    public static final int
        VK_DRIVER_ID_AMD_PROPRIETARY_KHR           = 1,
        VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR           = 2,
        VK_DRIVER_ID_MESA_RADV_KHR                 = 3,
        VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR        = 4,
        VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR = 5,
        VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR    = 6,
        VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR   = 7,
        VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR      = 8,
        VK_DRIVER_ID_ARM_PROPRIETARY_KHR           = 9,
        VK_DRIVER_ID_GOOGLE_PASTEL_KHR             = 10;

    private KHRDriverProperties() {}

}