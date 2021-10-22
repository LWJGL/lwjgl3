/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_config_select_group = "EXTConfigSelectGroup".nativeClassEGL("EXT_config_select_group", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism to lower the config selection priority of the configs returned by #ChooseConfig().
        
        A new config attribute is introduced, providing a way for the implementation to group configs into different config selection categories. The config
        selection priorities of all the configs in one category may be higher or lower than the ones in other categories. The config selection priorities in
        one category follow the rules of {@code eglChooseConfig}. See also {@code GLX_SGIX_visual_select_group}.
        """

    IntConstant(
        "Accepted as a new {@code EGLConfig} attribute.",

        "CONFIG_SELECT_GROUP_EXT"..0x34C0
    )
}