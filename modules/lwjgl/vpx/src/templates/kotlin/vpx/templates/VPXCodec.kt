/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vpx.templates

import vpx.*
import org.lwjgl.generator.*

val VPXCodec = "VPXCodec".nativeClass(Module.VPX, prefixConstant = "", prefixMethod = "") {
    nativeDirective("""
#include "vpx_codec.h"
#include "vp8cx.h"
""")

    vpx_codec_err_t(
        "vpx_codec_destroy",
        """
Destroy a codec instance
 *
 * Destroys a codec context, freeing any associated memory buffers.
 *
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context"),

        returnDoc = """
VPX_CODEC_OK
     The codec algorithm initialized.
VPX_CODEC_MEM_ERROR
     Memory allocation failed.
		"""
    )

    vpx_codec_err_t(
        "vpx_codec_control_",
        """
Control algorithm
 *
 * This function is used to exchange algorithm specific data with the codec
 * instance. This can be used to implement features specific to a particular
 * algorithm.
 *
 * This wrapper function dispatches the request to the helper function
 * associated with the given ctrl_id. It tries to call this function
 * transparently, but will return VPX_CODEC_ERROR if the request could not
 * be dispatched.
 *
 * Note that this function should not be used directly. Call the
 * vpx_codec_control wrapper macro instead.
 *
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context"),
        int("ctrl_id", "Algorithm specific control identifier"),
        int("data", "data"),

        returnDoc = """
VPX_CODEC_OK
     The control request was processed.
VPX_CODEC_ERROR
     The control request was not processed.
VPX_CODEC_INVALID_PARAM
     The data was not valid.
		"""
    )
}