/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_scheduling_controls = "ARMSchedulingControls".nativeClassVK("ARM_scheduling_controls", type = "device", postfix = "ARM") {
    documentation =
        """
        This extension exposes a collection of controls to modify the scheduling behaviour of Arm Mali devices.

        <h5>VK_ARM_scheduling_controls</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_ARM_scheduling_controls}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>418</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link ARMShaderCoreBuiltins VK_ARM_shader_core_builtins}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ARM_scheduling_controls]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ARM_scheduling_controls%20extension*">kpet</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-08-23</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd>None</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Kévin Petit, Arm Ltd.</li>
                <li>Jan-Harald Fredriksen, Arm Ltd.</li>
                <li>Mikel Garai, Arm Ltd.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "ARM_SCHEDULING_CONTROLS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ARM_SCHEDULING_CONTROLS_EXTENSION_NAME".."VK_ARM_scheduling_controls"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM".."1000417000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM".."1000417001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM".."1000417002"
    )

    EnumConstantLong(
        """
        VkPhysicalDeviceSchedulingControlsFlagBitsARM - Bitmask specifying scheduling controls supported by a physical device

        <h5>Description</h5>
        <ul>
            <li>#PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM indicates that a ##VkDeviceQueueShaderCoreControlCreateInfoARM structure <b>may</b> be included in the {@code pNext} chain of a ##VkDeviceQueueCreateInfo or ##VkDeviceCreateInfo structure.</li>
        </ul>
        """,

        "PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM".enum(0x00000001L)
    )
}