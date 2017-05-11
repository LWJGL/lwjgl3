/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_Util = "OVRUtil".nativeClass(packageName = OVR_PACKAGE, prefixMethod = "ovr", prefixConstant = "ovr", library = OVR_LIBRARY) {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4711))
#endif""", beforeIncludes = true)
    includeOVRCAPI()

    documentation = "Native bindings to the libOVR utility functions."

    val ProjectionModifiers = EnumConstant(
        "Enumerates modifications to the projection matrix based on the application's needs.",

        "Projection_None".enum(
            """
            Use for generating a default projection matrix that is:
            ${ul(
                    "Right-handed.",
                    "Near depth values stored in the depth buffer are smaller than far depth values.",
                    "Both near and far are explicitly defined.",
                    "With a clipping range that is (0 to w)."
                )}
            """,
            "0x00"
        ),
        "Projection_LeftHanded".enum("Enable if using left-handed transformations in your application.", "0x01"),
        "Projection_FarLessThanNear".enum(
            """
            After the projection transform is applied, far values stored in the depth buffer will be less than closer depth values. NOTE: Enable only if the
            application is using a floating-point depth buffer for proper precision.
            """,
            "0x02"
        ),
        "Projection_FarClipAtInfinity".enum(
            """
            When this flag is used, the zfar value pushed into #Matrix4f_Projection() will be ignored NOTE: Enable only if #Projection_FarLessThanNear is also
            enabled where the far clipping plane will be pushed to infinity.
            """,
            "0x04"
        ),
        "Projection_ClipRangeOpenGL".enum(
            """
            Enable if the application is rendering with OpenGL and expects a projection matrix with a clipping range of (-w to w). Ignore this flag if your
            application already handles the conversion from D3D range (0 to w) to OpenGL.
            """,
            "0x08"
        )
    ).javaDocLinks

    EnumConstant(
        "Modes used to generate Touch Haptics from audio PCM buffer.",

        "HapticsGenMode_PointSample" enum "Point sample original signal at Haptics frequency",
        "HapticsGenMode_Count".enum("")
    )

    ovrDetectResult(
        "_Detect",
        """
        Detects Oculus Runtime and Device Status.

        Checks for Oculus Runtime and Oculus HMD device status without loading the LibOVRRT shared library. This may be called before #Initialize() to help
        decide whether or not to initialize LibOVR.
        """,

        int.IN("timeoutMilliseconds", "a timeout to wait for HMD to be attached or 0 to poll")
    )

    ovrMatrix4f(
        "Matrix4f_Projection",
        "Used to generate projection from {@code ovrEyeDesc::Fov}.",

        ovrFovPort.IN("fov", "the ##OVRFovPort to use"),
        float.IN("znear", "distance to near Z limit"),
        float.IN("zfar", "distance to far Z limit"),
        unsigned_int.IN(
            "projectionModFlags",
            "a combination of the {@code ovrProjectionModifier} flags",
            "#Projection_None #Projection_FarLessThanNear #Projection_FarClipAtInfinity #Projection_ClipRangeOpenGL",
            LinkMode.BITFIELD
        ),

        returnDoc = "the calculated projection matrix"
    )

    ovrTimewarpProjectionDesc(
        "TimewarpProjectionDesc_FromProjection",
        "Extracts the required data from the result of #Matrix4f_Projection().",

        ovrMatrix4f.IN("projection", "the project matrix from which to extract ##OVRTimewarpProjectionDesc"),
        unsigned_int.IN("projectionModFlags", "a combination of the ovrProjectionModifier flags", ProjectionModifiers, LinkMode.BITFIELD),

        returnDoc = "the extracted ovrTimewarpProjectionDesc"
    )

    ovrMatrix4f(
        "Matrix4f_OrthoSubProjection",
        """
        Generates an orthographic sub-projection.

        Used for 2D rendering, Y is down.
        """,

        ovrMatrix4f.IN("projection", "the perspective matrix that the orthographic matrix is derived from"),
        ovrVector2f.IN("orthoScale", "equal to {@code 1.0f / pixelsPerTanAngleAtCenter}"),
        float.IN("orthoDistance", "equal to the distance from the camera in meters, such as 0.8m"),
        float.IN("HmdToEyeOffsetX", "the offset of the eye from the center"),

        returnDoc = "the calculated projection matrix"
    )

    void(
        "_CalcEyePoses",
        "Computes offset eye poses based on {@code headPose} returned by ##OVRTrackingState.",

        ovrPosef.IN("headPose", "indicates the HMD position and orientation to use for the calculation"),
        Check(2)..const..ovrVector3f_p.IN(
            "HmdToEyeOffset",
            """
            can be ##OVREyeRenderDesc{@code .HmdToEyeViewOffset} returned from #GetRenderDesc(). For monoscopic rendering, use a vector that is the
            average of the two vectors for both eyes.
            """
        ),
        Check(2)..ovrPosef_p.OUT(
            "outEyePoses",
            """
            if {@code outEyePoses} are used for rendering, they should be passed to #SubmitFrame() in ##OVRLayerEyeFov{@code ::RenderPose} or
            ##OVRLayerEyeFovDepth{@code ::RenderPose}
            """
        )
    )

    void(
        "_GetEyePoses",
        """
        Returns the predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses}.

        This is a thread-safe function where caller should increment {@code frameIndex} with every frame and pass that index where applicable to functions
        called on the rendering thread. Assuming {@code outEyePoses} are used for rendering, it should be passed as a part of ##OVRLayerEyeFov. The caller does
        not need to worry about applying {@code HmdToEyeOffset} to the returned {@code outEyePoses} variables.
        """,

        ovrSession.IN("session", "an {@code ovrSession} previously returned by #Create()"),
        long_long.IN("frameIndex", "the targeted frame index, or 0 to refer to one frame after the last time #SubmitFrame() was called"),
        ovrBool.IN(
            "latencyMarker",
            """
            Specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
            "SensorSampleTimestamp", that will override the value stored here.
            """
        ),
        Check(2)..const..ovrVector3f_p.IN(
            "hmdToEyeOffset",
            """
            can be ##OVREyeRenderDesc{@code .HmdToEyeOffset} returned from #GetRenderDesc(). For monoscopic rendering, use a vector that is the
            average of the two vectors for both eyes.
            """
        ),
        Check(2)..ovrPosef_p.OUT("outEyePoses", "the predicted eye poses"),
        Check(1)..nullable..double_p.OUT("outSensorSampleTime", "the time when this function was called. May be NULL, in which case it is ignored.")
    )

    void(
        "Posef_FlipHandedness",
        """
        Tracking poses provided by the SDK come in a right-handed coordinate system. If an application is passing in #Projection_LeftHanded into
        #Matrix4f_Projection(), then it should also use this function to flip the HMD tracking poses to be left-handed.

        While this utility function is intended to convert a left-handed OVRPosef into a right-handed coordinate system, it will also work for converting
        right-handed to left-handed since the flip operation is the same for both cases.
        """,

        const..ovrPosef_p.IN("inPose", "a pose that is right-handed"),
        ovrPosef_p.OUT("outPose", "the pose that is requested to be left-handed (can be the same pointer to {@code inPose})")
    )

    ovrResult(
        "_ReadWavFromBuffer",
        """
        Reads an audio channel from Wav (Waveform Audio File) data.

        Input must be a byte buffer representing a valid Wav file. Audio samples from the specified channel are read, converted to float {@code [-1.0f, 1.0f]}
        and returned through ##OVRAudioChannelData.

        Supported formats: PCM 8b, 16b, 32b and IEEE float (little-endian only).
        """,

        ovrAudioChannelData_p.OUT("outAudioChannel", "output audio channel data"),
        const..void_p.IN("inputData", "a binary buffer representing a valid Wav file data"),
        AutoSize("inputData")..int.IN("dataSizeInBytes", "size of the buffer in bytes"),
        int.IN("stereoChannelToUse", "audio channel index to extract (0 for mono)")
    )

    ovrResult(
        "_GenHapticsFromAudioData",
        "Generates playable Touch Haptics data from an audio channel.",

        ovrHapticsClip_p.OUT("outHapticsClip", "generated Haptics clip"),
        const..ovrAudioChannelData_p.IN("audioChannel", "input audio channel data"),
        ovrHapticsGenMode.IN("genMode", "mode used to convert and audio channel data to Haptics data", "#HapticsGenMode_PointSample")
    )

    void(
        "_ReleaseAudioChannelData",
        "Releases memory allocated for ovrAudioChannelData. Must be called to avoid memory leak.",

        ovrAudioChannelData_p.IN("audioChannel", "pointer to an audio channel")
    )

    void(
        "_ReleaseHapticsClip",
        "Releases memory allocated for ovrHapticsClip. Must be called to avoid memory leak.",

        ovrHapticsClip_p.IN("hapticsClip", "pointer to a haptics clip")
    )
}