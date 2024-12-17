/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_robustness_application_isolation = "GLXARBRobustnessApplicationIsolation".nativeClassGLX("GLX_ARB_robustness_application_isolation", ARB) {
    IntConstant(
        "CONTEXT_RESET_ISOLATION_BIT_ARB"..0x00000008
    )
}

val GLX_ARB_robustness_share_group_isolation = EXT_FLAG.nativeClassGLX("GLX_ARB_robustness_share_group_isolation", postfix = ARB)