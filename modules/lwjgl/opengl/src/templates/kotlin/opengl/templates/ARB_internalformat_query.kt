/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_internalformat_query = "ARBInternalformatQuery".nativeClassGL("ARB_internalformat_query") {
    IntConstant(
        "NUM_SAMPLE_COUNTS"..0x9380
    )

    reuse(GL42C, "GetInternalformativ")
}