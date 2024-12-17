/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_output_base = "EXTOutputBase".nativeClassEGL("EXT_output_base", postfix = EXT) {
    IntConstant(
        "BAD_OUTPUT_LAYER_EXT"..0x322D,
        "BAD_OUTPUT_PORT_EXT"..0x322E,
        "SWAP_INTERVAL_EXT"..0x322F
    )

    LongConstant(
        "NO_OUTPUT_LAYER_EXT"..0L,
        "NO_OUTPUT_PORT_EXT"..0L
    )

    EGLBoolean(
        "GetOutputLayersEXT",

        EGLDisplay("dpy"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list"),
        nullable..EGLOutputLayerEXT.p("layers"),
        AutoSize("layers")..EGLint("max_layers"),
        Check(1)..EGLint.p("num_layers")
    )

    EGLBoolean(
        "GetOutputPortsEXT",

        EGLDisplay("dpy"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list"),
        nullable..EGLOutputPortEXT.p("ports"),
        AutoSize("ports")..EGLint("max_ports"),
        Check(1)..EGLint.p("num_ports")
    )

    EGLBoolean(
        "OutputLayerAttribEXT",

        EGLDisplay("dpy"),
        EGLOutputLayerEXT("layer"),
        EGLint("attribute"),
        EGLAttrib("value")
    )

    EGLBoolean(
        "QueryOutputLayerAttribEXT",

        EGLDisplay("dpy"),
        EGLOutputLayerEXT("layer"),
        EGLint("attribute"),
        Check(1)..EGLAttrib.p("value")
    )

    charASCII.p(
        "QueryOutputLayerStringEXT",

        EGLDisplay("dpy"),
        EGLOutputLayerEXT("layer"),
        EGLint("name")
    )

    EGLBoolean(
        "OutputPortAttribEXT",

        EGLDisplay("dpy"),
        EGLOutputPortEXT("port"),
        EGLint("attribute"),
        EGLAttrib("value")
    )

    EGLBoolean(
        "QueryOutputPortAttribEXT",

        EGLDisplay("dpy"),
        EGLOutputPortEXT("port"),
        EGLint("attribute"),
        Check(1)..EGLAttrib.p("value")
    )

    charASCII.p(
        "QueryOutputPortStringEXT",

        EGLDisplay("dpy"),
        EGLOutputPortEXT("port"),
        EGLint("name")
    )
}