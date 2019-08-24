/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBulletFile = "BTBulletFile".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "bParse_btBulletFile_new",
        "",

        void()
    )

    opaque_p(
        "bParse_btBulletFile_new2",
        "",

        charUTF8.const.p("fileName", "")
    )

    opaque_p(
        "bParse_btBulletFile_new3",
        "",

        char.p("memoryBuffer", ""),
        AutoSize("memoryBuffer")..int("len", "")
    )

    void(
        "bParse_btBulletFile_addDataBlock",
        "",

        opaque_p("obj", ""),
        Unsafe..char.p("dataBlock", "")
    )

    void(
        "bParse_btBulletFile_addStruct",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("structType", ""),
        opaque_p("data", ""),
        int("len", ""),
        opaque_p("oldPtr", ""),
        int("code", "")
    )

    opaque_p(
        "bParse_btBulletFile_getBvhs",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getCollisionObjects",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getCollisionShapes",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getConstraints",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getDataBlocks",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getDynamicsWorldInfo",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getMultiBodies",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getRigidBodies",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getSoftBodies",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "bParse_btBulletFile_getTriangleInfoMaps",
        "",

        opaque_p("obj", "")
    )

    void(
        "bParse_btBulletFile_parse",
        "",

        opaque_p("obj", ""),
        int("verboseMode", "")
    )

    void(
        "bParse_btBulletFile_parseData",
        "",

        opaque_p("obj", "")
    )

    int(
        "bParse_btBulletFile_write",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("fileName", "")
    )

    int(
        "bParse_btBulletFile_write2",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("fileName", ""),
        bool("fixupPointers", "")
    )
/*
    void(
        "bParse_btBulletFile_writeDNA",
        "",

        opaque_p("obj", ""),
        Check(1)..int.p("fp", "")
    )
*/
    void(
        "bParse_btBulletFile_delete",
        "",

        opaque_p("obj", "")
    )

}