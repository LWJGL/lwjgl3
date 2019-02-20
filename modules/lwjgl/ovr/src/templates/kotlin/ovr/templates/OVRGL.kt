/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*

val OVRGL = "OVRGL".dependsOn(Module.OPENGL)?.nativeClass(Module.OVR, prefixMethod = "ovr_", prefixConstant = "ovr") {
    includeOVRCAPI_GL()

    documentation =
        """
        Native bindings to libOVR, using the ${url("https://developer.oculus.com/", "Oculus SDK")} C API.

        This class contains OpenGL specific functionality.
        """

    val session = ovrSession("session", "an {@code ovrSession} previously returned by #Create()")

    ovrResult(
        "CreateTextureSwapChainGL",
        """
        Creates a TextureSwapChain suitable for use with OpenGL.

        The format provided should be thought of as the format the distortion compositor will use when reading the contents of the texture. To that end, it is
        highly recommended that the application requests texture swap chain formats that are in sRGB-space (e.g. OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB) as the
        distortion compositor does sRGB-correct rendering. Furthermore, the app should then make sure "{@code glEnable(GL_FRAMEBUFFER_SRGB);}" is called before
        rendering into these textures. Even though it is not recommended, if the application would like to treat the texture as a linear format and do
        linear-to-gamma conversion in GLSL, then the application can avoid calling "{@code glEnable(GL_FRAMEBUFFER_SRGB);}", but should still pass in an sRGB
        variant for the format. Failure to do so will cause the distortion compositor to apply incorrect gamma conversions leading to gamma-curve artifacts.
        """,

        session,
        ovrTextureSwapChainDesc.const.p("desc", "the requested texture properties. See notes for more info about texture format."),
        Check(1)..ovrTextureSwapChain.p(
            "out_TextureSwapChain",
            """
            returns the created {@code ovrTextureSwapChain}, which will be valid upon a successful return value, else it will be #NULL. This texture swap chain must
            be eventually destroyed via #DestroyTextureSwapChain() before destroying the session with #Destroy().
            """
        ),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "GetTextureSwapChainBufferGL",
        "Get a specific buffer within the chain as a GL texture name.",

        session,
        ovrTextureSwapChain("chain", "an {@code ovrTextureSwapChain} previously returned by #CreateTextureSwapChainGL()"),
        int(
            "index",
            """
            the index within the chain to retrieve. Must be between 0 and length (see #GetTextureSwapChainLength()) or may pass -1 to get the buffer at the
            {@code CurrentIndex} location. (Saving a call to #GetTextureSwapChainCurrentIndex())
            """
        ),
        Check(1)..unsigned_int.p("out_TexId", "returns the GL texture object name associated with the specific index requested"),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "CreateMirrorTextureWithOptionsGL",
        """
        Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.

        A second call to {@code ovr_CreateMirrorTextureWithOptionsGL} for a given {@code ovrSession} before destroying the first one is not supported and will
        result in an error return.

        ${note("""
        The {@code format} provided should be thought of as the format the distortion compositor will use when writing into the mirror texture. It is highly
        recommended that mirror textures are requested as sRGB formats because the distortion compositor does sRGB-correct rendering. If the application
        requests a non-sRGB format (e.g. {@code R8G8B8A8_UNORM}) as the mirror texture, then the application might have to apply a manual linear-to-gamma
        conversion when reading from the mirror texture. Failure to do so can result in incorrect gamma conversions leading to gamma-curve artifacts and color
        banding.""")}
        """,

        session,
        ovrMirrorTextureDesc.const.p("desc", "specifies the requested mirror texture description"),
        Check(1)..ovrMirrorTexture.p(
            "out_MirrorTexture",
            """
            specifies the created {@code ovrMirrorTexture}, which will be valid upon a successful return value, else it will be #NULL. This texture must be
            eventually destroyed via #DestroyMirrorTexture() before destroying the session with #Destroy().
            """
        ),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "CreateMirrorTextureGL",
        """
         Deprecated. Use #CreateMirrorTextureWithOptionsGL() instead.

        Same as {@code ovr_CreateMirrorTextureWithOptionsGL} except doesn't use {@code ovrMirrorOptions} flags as part of ##OVRMirrorTextureDesc's
        {@code MirrorOptions} field, and defaults to #MirrorOption_PostDistortion.
        """,

        session,
        ovrMirrorTextureDesc.const.p("desc", "the requested mirror texture description"),
        Check(1)..ovrMirrorTexture.p(
            "out_MirrorTexture",
            """
            returns the created {@code OVRMirrorTextur}e, which will be valid upon a successful return value, else it will be #NULL. This texture must be
            eventually destroyed via #DestroyMirrorTexture() before destroying the session with #Destroy().
            """
        ),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "GetMirrorTextureBufferGL",
        "Gets a the underlying buffer as a GL texture name.",

        session,
        ovrMirrorTexture("mirrorTexture", "an {@code OVRMirrorTexture} previously returned by #CreateMirrorTextureWithOptionsGL()"),
        Check(1)..unsigned_int.p("out_TexId", "returns the GL texture object name associated with the mirror texture"),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )
}