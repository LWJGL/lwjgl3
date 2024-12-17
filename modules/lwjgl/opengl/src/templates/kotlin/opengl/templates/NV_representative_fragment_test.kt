/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_representative_fragment_test = "NVRepresentativeFragmentTest".nativeClassGL("NV_representative_fragment_test", postfix = NV) {
    IntConstant(
        "REPRESENTATIVE_FRAGMENT_TEST_NV"..0x937F
    )
}