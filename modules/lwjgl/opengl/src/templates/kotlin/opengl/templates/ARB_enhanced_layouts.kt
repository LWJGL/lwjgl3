/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_enhanced_layouts = "ARBEnhancedLayouts".nativeClassGL("ARB_enhanced_layouts") {
    IntConstant(
        "LOCATION_COMPONENT"..0x934A,
        "TRANSFORM_FEEDBACK_BUFFER_INDEX"..0x934B,
        "TRANSFORM_FEEDBACK_BUFFER_STRIDE"..0x934C
    )

}