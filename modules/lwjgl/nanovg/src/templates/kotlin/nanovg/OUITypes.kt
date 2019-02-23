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
        "handler callback; event is one of UI_EVENT_*",

        int("item", ""),
        UIevent("event", ""),

        nativeType = "UIhandler"
    ) {
        documentation = "Instances of this interface may be passed to the #SetHandler() method."
    }
}

val UIvec2 = struct(Module.NANOVG, "UIVec2", nativeName = "UIvec2") {
    documentation = "for cursor positions, mainly"

    union {
        int("v", "")[2]
        struct {
            int("x", "")
            int("y", "")
        }
    }
}

val UIrect = struct(Module.NANOVG, "UIRect", nativeName = "UIrect") {
    documentation = "layout rectangle"

    union {
        int("v", "")[4]
        struct {
            int("x", "")
            int("y", "")
            int("w", "")
            int("h", "")
        }
    }
}

// -------------

/*
val UIData = struct(Module.NANOVG, "UIData") {
    documentation = ""

    int("subtype", "")
    nullable..UIhandler("handler", "")
}

val UIRectData = struct(Module.NANOVG, "UIRectData") {
    documentation = ""

    UIData("head", "")
    nullable..charUTF8.const.p("label", "")
    NVGcolor("color", "")
}

val UIButtonData = struct(Module.NANOVG, "UIButtonData") {
    documentation = ""

    UIData("head", "")
    int("iconid", "")
    nullable..charUTF8.const.p("label", "")
}

val UICheckData = struct(Module.NANOVG, "UICheckData") {
    documentation = ""

    UIData("head", "")
    nullable..charUTF8.const.p("label", "")
    int.p("option", "")
}

val UIRadioData = struct(Module.NANOVG, "UIRadioData") {
    documentation = ""

    UIData("head", "")
    int("iconid", "")
    nullable..charUTF8.const.p("label", "")
    int.p("value", "")
}

val UISliderData = struct(Module.NANOVG, "UISliderData") {
    documentation = ""

    UIData("head", "")
    nullable..charUTF8.const.p("label", "")
    float.p("progress", "")
}

val UITextData = struct(Module.NANOVG, "UITextData") {
    documentation = ""

    UIData("head", "")
    nullable..charUTF8.p("text", "")
    int("maxsize", "")
}
 */