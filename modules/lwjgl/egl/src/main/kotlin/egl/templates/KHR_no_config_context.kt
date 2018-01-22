/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_no_config_context = "KHRNoConfigContext".nativeClassEGL("KHR_no_config_context", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Modern GPUs allow contexts to render to almost any combination of supported color and auxiliary buffer formats. Traditionally EGL context creation is
        done with respect to an {@code EGLConfig} specifying buffer formats, and constrains contexts to only work with surfaces created with a "compatible"
        config.

        This extension allows creation of GL & ES contexts without specifying an {@code EGLConfig}.

        Requires ${EGL14.core}.
        """

    LongConstant(
        "Accepted as the {@code config} parameter of #CreateContext().",

        "NO_CONFIG_KHR".."0L"
    )
}