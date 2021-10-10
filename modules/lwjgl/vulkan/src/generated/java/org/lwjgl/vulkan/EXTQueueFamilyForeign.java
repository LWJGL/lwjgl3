/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension defines a special queue family, {@link #VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT}, which can be used to transfer ownership of resources backed by external memory to foreign, external queues. This is similar to {@link KHRExternalMemory#VK_QUEUE_FAMILY_EXTERNAL_KHR QUEUE_FAMILY_EXTERNAL_KHR}, defined in {@link KHRExternalMemory VK_KHR_external_memory}. The key differences between the two are:
 * 
 * <ul>
 * <li>The queues represented by {@link KHRExternalMemory#VK_QUEUE_FAMILY_EXTERNAL_KHR QUEUE_FAMILY_EXTERNAL_KHR} must share the same physical device and the same driver version as the current {@code VkInstance}. {@link #VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT} has no such restrictions. It can represent devices and drivers from other vendors, and can even represent non-Vulkan-capable devices.</li>
 * <li>All resources backed by external memory support {@link KHRExternalMemory#VK_QUEUE_FAMILY_EXTERNAL_KHR QUEUE_FAMILY_EXTERNAL_KHR}. Support for {@link #VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT} is more restrictive.</li>
 * <li>Applications should expect transitions to/from {@link #VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT} to be more expensive than transitions to/from {@link KHRExternalMemory#VK_QUEUE_FAMILY_EXTERNAL_KHR QUEUE_FAMILY_EXTERNAL_KHR}.</li>
 * </ul>
 * 
 * <h5>VK_EXT_queue_family_foreign</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_queue_family_foreign}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>127</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Chad Versace <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_queue_family_foreign]%20@chadversary%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_queue_family_foreign%20extension%3E%3E">chadversary</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-11-01</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Chad Versace, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jesse Hall, Google</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Ray Smith, ARM</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTQueueFamilyForeign {

    /** The extension specification version. */
    public static final int VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME = "VK_EXT_queue_family_foreign";

    /** VK_QUEUE_FAMILY_FOREIGN_EXT */
    public static final int VK_QUEUE_FAMILY_FOREIGN_EXT = (~2);

    private EXTQueueFamilyForeign() {}

}