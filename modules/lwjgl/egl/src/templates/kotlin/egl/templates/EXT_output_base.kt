/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_output_base = "EXTOutputBase".nativeClassEGL("EXT_output_base", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        This extension defines new EGL resource types for referencing display control hardware associated with an EGL device. Its purpose is to allow rendering
        to be directed to a screen in the absence of (or bypassing) a window system. Because the use models for these resources are potentially diverse, only
        the objects themselves and basic functions to acquire and query them are defined here. More detailed functions and enumerants required to operate on
        outputs are provided by separate extensions.

        Requires ${EXT_device_base.link}.
        """

    IntConstant(
        "",

        "BAD_OUTPUT_LAYER_EXT"..0x322D,
        "BAD_OUTPUT_PORT_EXT"..0x322E,
        "SWAP_INTERVAL_EXT"..0x322F
    )

    LongConstant(
        "",

        "NO_OUTPUT_LAYER_EXT"..0L,
        "NO_OUTPUT_PORT_EXT"..0L
    )

    EGLBoolean(
        "GetOutputLayersEXT",
        "",

        EGLDisplay("dpy", ""),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list", ""),
        nullable..EGLOutputLayerEXT.p("layers", ""),
        AutoSize("layers")..EGLint("max_layers", ""),
        Check(1)..EGLint.p("num_layers", "")
    )

    EGLBoolean(
        "GetOutputPortsEXT",
        "",

        EGLDisplay("dpy", ""),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list", ""),
        nullable..EGLOutputPortEXT.p("ports", ""),
        AutoSize("ports")..EGLint("max_ports", ""),
        Check(1)..EGLint.p("num_ports", "")
    )

    EGLBoolean(
        "OutputLayerAttribEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLOutputLayerEXT("layer", ""),
        EGLint("attribute", ""),
        EGLAttrib("value", "")
    )

    EGLBoolean(
        "QueryOutputLayerAttribEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLOutputLayerEXT("layer", ""),
        EGLint("attribute", ""),
        Check(1)..EGLAttrib.p("value", "")
    )

    charASCII.p(
        "QueryOutputLayerStringEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLOutputLayerEXT("layer", ""),
        EGLint("name", "")
    )

    EGLBoolean(
        "OutputPortAttribEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLOutputPortEXT("port", ""),
        EGLint("attribute", ""),
        EGLAttrib("value", "")
    )

    EGLBoolean(
        "QueryOutputPortAttribEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLOutputPortEXT("port", ""),
        EGLint("attribute", ""),
        Check(1)..EGLAttrib.p("value", "")
    )

    charASCII.p(
        "QueryOutputPortStringEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLOutputPortEXT("port", ""),
        EGLint("name", "")
    )
}