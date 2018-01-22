/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_DEFAULT_FILTER_ORDER = "EXTDefaultFilterOrder".nativeClassALC("EXT_DEFAULT_FILTER_ORDER") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension allows the default filter order (i.e. slope) to be selected at context creation time. Attibute #DEFAULT_FILTER_ORDER can be used with a
        value of 1 (for -6dB/oct) or 2 (for -12dB/oct).

        #DEFAULT_FILTER_ORDER can also be used with ALC10#alcGetIntegerv() to find out the current default filter order.
        """

    IntConstant(
        "$extensionName tokens.",

        "DEFAULT_FILTER_ORDER"..0x1100
    )
}