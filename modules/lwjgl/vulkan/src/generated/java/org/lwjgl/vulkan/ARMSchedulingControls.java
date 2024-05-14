/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension exposes a collection of controls to modify the scheduling behavior of Arm Mali devices.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_ARM_scheduling_controls}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>418</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link ARMShaderCoreBuiltins VK_ARM_shader_core_builtins}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ARM_scheduling_controls]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ARM_scheduling_controls%20extension*">kpet</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-08-23</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd>None</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Kévin Petit, Arm Ltd.</li>
 * <li>Jan-Harald Fredriksen, Arm Ltd.</li>
 * <li>Mikel Garai, Arm Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public final class ARMSchedulingControls {

    /** The extension specification version. */
    public static final int VK_ARM_SCHEDULING_CONTROLS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_ARM_SCHEDULING_CONTROLS_EXTENSION_NAME = "VK_ARM_scheduling_controls";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM   = 1000417000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM   = 1000417001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM = 1000417002;

    /**
     * VkPhysicalDeviceSchedulingControlsFlagBitsARM - Bitmask specifying scheduling controls supported by a physical device
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM} indicates that a {@link VkDeviceQueueShaderCoreControlCreateInfoARM} structure <b>may</b> be included in the {@code pNext} chain of a {@link VkDeviceQueueCreateInfo} or {@link VkDeviceCreateInfo} structure.</li>
     * </ul>
     */
    public static final long VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM = 0x1L;

    private ARMSchedulingControls() {}

}