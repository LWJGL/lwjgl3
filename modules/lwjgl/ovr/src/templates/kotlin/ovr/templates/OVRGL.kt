/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*

val OVRGL = "OVRGL".dependsOn(Module.OPENGL)?.nativeClass(Module.OVR, prefixMethod = "ovr_", prefixConstant = "ovr") {
    includeOVRCAPI_GL()

    val session = ovrSession("session")

    ovrResult(
        "CreateTextureSwapChainGL",

        session,
        ovrTextureSwapChainDesc.const.p("desc"),
        Check(1)..ovrTextureSwapChain.p("out_TextureSwapChain")
    )

    ovrResult(
        "GetTextureSwapChainBufferGL",

        session,
        ovrTextureSwapChain("chain"),
        int("index"),
        Check(1)..unsigned_int.p("out_TexId")
    )

    ovrResult(
        "CreateMirrorTextureWithOptionsGL",

        session,
        ovrMirrorTextureDesc.const.p("desc"),
        Check(1)..ovrMirrorTexture.p("out_MirrorTexture")
    )

    ovrResult(
        "CreateMirrorTextureGL",

        session,
        ovrMirrorTextureDesc.const.p("desc"),
        Check(1)..ovrMirrorTexture.p("out_MirrorTexture")
    )

    ovrResult(
        "GetMirrorTextureBufferGL",

        session,
        ovrMirrorTexture("mirrorTexture"),
        Check(1)..unsigned_int.p("out_TexId")
    )
}