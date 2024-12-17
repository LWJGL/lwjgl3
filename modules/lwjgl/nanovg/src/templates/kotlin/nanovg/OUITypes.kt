/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val UIcontext = "UIcontext".opaque
val UIuint = typedef(unsigned_int, "UIuint")

val UIboxFlags = "UIboxFlags".enumType
val UIevent = "UIevent".enumType
val UIitemState = "UIitemState".enumType
val UIlayoutFlags = "UIlayoutFlags".enumType

val UIhandler = Module.NANOVG.callback {
    void(
        "UIHandler",

        int("item"),
        UIevent("event"),

        nativeType = "UIhandler"
    ) {
    }
}

val UIvec2 = struct(Module.NANOVG, "UIVec2", nativeName = "UIvec2") {
    union {
        int("v")[2]
        struct {
            int("x")
            int("y")
        }
    }
}

val UIrect = struct(Module.NANOVG, "UIRect", nativeName = "UIrect") {
    union {
        int("v")[4]
        struct {
            int("x")
            int("y")
            int("w")
            int("h")
        }
    }
}

// -------------

/*
val UIData = struct(Module.NANOVG, "UIData") {
    int("subtype")
    nullable..UIhandler("handler")
}

val UIRectData = struct(Module.NANOVG, "UIRectData") {
    UIData("head")
    nullable..charUTF8.const.p("label")
    NVGcolor("color")
}

val UIButtonData = struct(Module.NANOVG, "UIButtonData") {
    UIData("head")
    int("iconid")
    nullable..charUTF8.const.p("label")
}

val UICheckData = struct(Module.NANOVG, "UICheckData") {
    UIData("head")
    nullable..charUTF8.const.p("label")
    int.p("option")
}

val UIRadioData = struct(Module.NANOVG, "UIRadioData") {
    UIData("head")
    int("iconid")
    nullable..charUTF8.const.p("label")
    int.p("value")
}

val UISliderData = struct(Module.NANOVG, "UISliderData") {
    UIData("head")
    nullable..charUTF8.const.p("label")
    float.p("progress")
}

val UITextData = struct(Module.NANOVG, "UITextData") {
    UIData("head")
    nullable..charUTF8.p("text")
    int("maxsize")
}
 */