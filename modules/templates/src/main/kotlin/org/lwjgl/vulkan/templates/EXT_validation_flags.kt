/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_validation_flags = "EXTValidationFlags".nativeClassVK("EXT_validation_flags", type = "instance", postfix = EXT) {
    documentation =
        """
        This extension provides the ##VkValidationFlagsEXT struct that can be included in the {@code pNext} chain at #CreateInstance() time. The new struct contains an array of {@code VkValidationCheckEXT} values that will be disabled by the validation layers.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_validation_flags</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>62</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-09-06</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.25 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobin Ehlis, Google</li>
                <li>Courtney Goeltzenleuchter, Google</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Tobin Ehlis, Google (mailto:tobine@google.com[tobine@google.com])</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VALIDATION_FLAGS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_VALIDATION_FLAGS_EXTENSION_NAME".."VK_EXT_validation_flags"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VALIDATION_FLAGS_EXT".."1000061000"
    )

    EnumConstant(
        """
        VkValidationCheckEXT - Specify validation checks to disable

        <h5>Description</h5>
        <ul>
            <li>#VALIDATION_CHECK_ALL_EXT specifies that all validation checks are disabled.</li>
            <li>#VALIDATION_CHECK_SHADERS_EXT specifies that shader validation is disabled.</li>
        </ul>

        <h5>See Also</h5>
        ##VkValidationFlagsEXT
        """,

        "VALIDATION_CHECK_ALL_EXT".."0",
        "VALIDATION_CHECK_SHADERS_EXT".."1"
    )
}