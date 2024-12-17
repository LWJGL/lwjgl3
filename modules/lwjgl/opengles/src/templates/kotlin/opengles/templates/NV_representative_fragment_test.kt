/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_representative_fragment_test = "NVRepresentativeFragmentTest".nativeClassGLES("NV_representative_fragment_test", postfix = NV) {
    IntConstant(
        "REPRESENTATIVE_FRAGMENT_TEST_NV"..0x937F
    )
}