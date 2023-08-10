/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_portability_enumeration = "KHRPortabilityEnumeration".nativeClassVK("KHR_portability_enumeration", type = "instance", postfix = "KHR") {
    documentation =
        """
        This extension allows applications to control whether devices that expose the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension are included in the results of physical device enumeration. Since devices which support the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension are not fully conformant Vulkan implementations, the Vulkan loader does not report those devices unless the application explicitly asks for them. This prevents applications which may not be aware of non-conformant devices from accidentally using them, as any device which supports the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension mandates that the extension must be enabled if that device is used.

        This extension is implemented in the loader.

        <h5>VK_KHR_portability_enumeration</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_portability_enumeration}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>395</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Charles Giessen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_portability_enumeration]%20@charles-lunarg%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_portability_enumeration%20extension*">charles-lunarg</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with {@link KHRPortabilitySubset VK_KHR_portability_subset}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Lenny Komow, LunarG</li>
                <li>Charles Giessen, LunarG</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PORTABILITY_ENUMERATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME".."VK_KHR_portability_enumeration"
    )

    EnumConstant(
        "Extends {@code VkInstanceCreateFlagBits}.",

        "INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR".enum(0x00000001)
    )
}