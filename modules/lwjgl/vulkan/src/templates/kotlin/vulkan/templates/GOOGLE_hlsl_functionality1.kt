/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val GOOGLE_hlsl_functionality1 = "GOOGLEHlslFunctionality1".nativeClassVK("GOOGLE_hlsl_functionality1", type = "device", postfix = "GOOGLE") {
    IntConstant(
        "GOOGLE_HLSL_FUNCTIONALITY_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "GOOGLE_HLSL_FUNCTIONALITY_1_EXTENSION_NAME".."VK_GOOGLE_hlsl_functionality1"
    )

    IntConstant(
        "GOOGLE_HLSL_FUNCTIONALITY1_SPEC_VERSION".."VK_GOOGLE_HLSL_FUNCTIONALITY_1_SPEC_VERSION"
    )

    StringConstant(
        "GOOGLE_HLSL_FUNCTIONALITY1_EXTENSION_NAME".expr("VK_GOOGLE_HLSL_FUNCTIONALITY_1_EXTENSION_NAME")
    )
}