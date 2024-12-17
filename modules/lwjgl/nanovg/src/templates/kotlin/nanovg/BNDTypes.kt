/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val BNDcornerFlags = "BNDcornerFlags".enumType
val BNDicon = "BNDicon".enumType
val BNDtextAlignment = "BNDtextAlignment".enumType
val BNDwidgetState = "BNDwidgetState".enumType

val BNDwidgetTheme = struct(Module.NANOVG, "BNDwidgetTheme") {
    NVGcolor("outlineColor")
    NVGcolor("itemColor")
    NVGcolor("innerColor")
    NVGcolor("innerSelectedColor")
    NVGcolor("textColor")
    NVGcolor("textSelectedColor")
    int("shadeTop")
    int("shadeDown")
}

val BNDnodeTheme = struct(Module.NANOVG, "BNDnodeTheme") {
    NVGcolor("nodeSelectedColor")
    NVGcolor("wiresColor")
    NVGcolor("textSelectedColor")
    NVGcolor("activeNodeColor")
    NVGcolor("wireSelectColor")
    NVGcolor("nodeBackdropColor")
    int("noodleCurving")
}

val BNDtheme = struct(Module.NANOVG, "BNDtheme") {
    NVGcolor("backgroundColor")
    BNDwidgetTheme("regularTheme")
    BNDwidgetTheme("toolTheme")
    BNDwidgetTheme("radioTheme")
    BNDwidgetTheme("textFieldTheme")
    BNDwidgetTheme("optionTheme")
    BNDwidgetTheme("choiceTheme")
    BNDwidgetTheme("numberFieldTheme")
    BNDwidgetTheme("sliderTheme")
    BNDwidgetTheme("scrollBarTheme")
    BNDwidgetTheme("tooltipTheme")
    BNDwidgetTheme("menuTheme")
    BNDwidgetTheme("menuItemTheme")
    BNDnodeTheme("nodeTheme")
}
