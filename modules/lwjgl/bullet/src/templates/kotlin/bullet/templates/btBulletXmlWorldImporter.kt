/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBulletXmlWorldImporter = "BTBulletXmlWorldImporter".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BulletXmlWorldImporter_new",
        "",

        opaque_p("world", "")
    )

    bool(
        "BulletXmlWorldImporter_loadFile",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("fileName", "")
    )

}