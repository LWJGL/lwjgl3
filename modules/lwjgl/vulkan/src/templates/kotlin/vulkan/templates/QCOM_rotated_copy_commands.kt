/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_rotated_copy_commands = "QCOMRotatedCopyCommands".nativeClassVK("QCOM_rotated_copy_commands", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_ROTATED_COPY_COMMANDS_SPEC_VERSION".."2"
    )

    StringConstant(
        "QCOM_ROTATED_COPY_COMMANDS_EXTENSION_NAME".."VK_QCOM_rotated_copy_commands"
    )

    EnumConstant(
        "STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM".."1000333000"
    )
}