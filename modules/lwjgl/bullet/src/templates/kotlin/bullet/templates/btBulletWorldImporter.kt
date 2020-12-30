/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBulletWorldImporter = "BTBulletWorldImporter".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BulletWorldImporter_new",
        "",

        void()
    )

    opaque_p(
        "BulletWorldImporter_new2",
        "",

        opaque_p("world", "")
    )

    bool(
        "BulletWorldImporter_convertAllObjects",
        "",

        opaque_p("obj", ""),
        opaque_p("file", "")
    )

    bool(
        "BulletWorldImporter_loadFile",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("fileName", "")
    )

    bool(
        "BulletWorldImporter_loadFile2",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("fileName", ""),
        charUTF8.const.p("preSwapFilenameOut", "")
    )

    bool(
        "BulletWorldImporter_loadFileFromMemory",
        "",

        opaque_p("obj", ""),
        char.p("memoryBuffer", ""),
        AutoSize("memoryBuffer")..int("len", "")
    )

    bool(
        "BulletWorldImporter_loadFileFromMemory2",
        "",

        opaque_p("obj", ""),
        opaque_p("file", "")
    )

}