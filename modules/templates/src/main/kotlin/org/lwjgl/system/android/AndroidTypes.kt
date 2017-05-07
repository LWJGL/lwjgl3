/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.android

import org.lwjgl.generator.*

val ANDROID_PACKAGE = "org.lwjgl.system.android"

fun config() {
    packageInfo(
        ANDROID_PACKAGE,
        "Contains bindings to native APIs specific to Android."
    )
}

val ANativeWindow_p = "ANativeWindow".p

val Surface = android.view.Surface::class.jobject

val ANativeWindow_Buffer_p = struct(ANDROID_PACKAGE, "ANativeWindowBuffer", nativeName = "ANativeWindow_Buffer", mutable = false) {
    documentation = "A struct that represents a window buffer."

    int32_t.member("left", "left position")
    int32_t.member("top", "top position")
    int32_t.member("right", "right position")
    int32_t.member("bottom", "bottom position")
}.p

val ARect_p = struct(ANDROID_PACKAGE, "ARect") {
    documentation = "A struct that represents a rectangular window area."

    int32_t.member("width", "The number of pixels that are shown horizontally.")
    int32_t.member("height", "The number of pixels that are shown vertically.")
    int32_t.member("stride", "The number of <b>pixels</b> that a line in the buffer takes in memory. This may be {@code >= width}.")
    int32_t.member("format", " The format of the buffer.").links("WINDOW_FORMAT_\\w+")
    void_p.member("bits", "The actual bits.")
    uint32_t.array("reserved", "Do not touch.", size = 6)
}.p