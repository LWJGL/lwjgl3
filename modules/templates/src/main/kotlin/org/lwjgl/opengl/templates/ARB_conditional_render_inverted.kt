/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_conditional_render_inverted = "ARBConditionalRenderInverted".nativeClassGL("ARB_conditional_render_inverted") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds new modes to #BeginConditionalRender() which invert the condition used to determine whether to draw or not.

        Requires ${GL30.core}. ${GL45.promoted}
        """

    IntConstant(
        "Accepted by the {@code mode} parameter of #BeginConditionalRender().",

        "QUERY_WAIT_INVERTED"..0x8E17,
        "QUERY_NO_WAIT_INVERTED"..0x8E18,
        "QUERY_BY_REGION_WAIT_INVERTED"..0x8E19,
        "QUERY_BY_REGION_NO_WAIT_INVERTED"..0x8E1A
    )
}