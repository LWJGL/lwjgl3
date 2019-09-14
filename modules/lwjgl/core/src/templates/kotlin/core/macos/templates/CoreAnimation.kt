/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import core.macos.*
import org.lwjgl.generator.*

val CoreAnimation = "CoreAnimation".nativeClass(Module.CORE_MACOS, nativeSubPath = "macos") {
    nativeImport("<QuartzCore/CoreAnimation.h>")

    documentation = "Native bindings to &lt;QuartzCore/CoreAnimation.h&gt;."

    Code(
        nativeCall = "${t}*((CGRect *)(intptr_t)$RESULT) = _this.bounds;"
    )..CGRect(
        "CALayerGetBounds",
        "",

        CALayer.p("_this", "")
    )

    Code(
        nativeCall = "${t}_this.bounds = *bounds;"
    )..void(
        "CALayerSetBounds",
        "",

        CALayer.p("_this", ""),
        CGRect("bounds", "")
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)[CAMetalLayer layer];"
    )..CAMetalLayer.p(
        "CAMetalLayerLayer",
        "",

        void()
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)[_this nextDrawable];"
    )..CAMetalDrawable.p(
        "CAMetalLayerNextDrawable",
        "",

        CAMetalLayer.p("_this", "")
    )
}