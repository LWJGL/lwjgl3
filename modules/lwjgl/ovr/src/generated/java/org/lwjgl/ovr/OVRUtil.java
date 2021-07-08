/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the libOVR utility functions. */
public class OVRUtil {

    static { LibOVR.initialize(); }

    /**
     * Enumerates modifications to the projection matrix based on the application's needs.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrProjection_None Projection_None} - 
     * Use for generating a default projection matrix that is:
     * 
     * <ul>
     * <li>Right-handed.</li>
     * <li>Near depth values stored in the depth buffer are smaller than far depth values.</li>
     * <li>Both near and far are explicitly defined.</li>
     * <li>With a clipping range that is (0 to w).</li>
     * </ul>
     * </li>
     * <li>{@link #ovrProjection_LeftHanded Projection_LeftHanded} - Enable if using left-handed transformations in your application.</li>
     * <li>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear} - 
     * After the projection transform is applied, far values stored in the depth buffer will be less than closer depth values. NOTE: Enable only if the
     * application is using a floating-point depth buffer for proper precision.
     * </li>
     * <li>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity} - 
     * When this flag is used, the zfar value pushed into {@link #ovrMatrix4f_Projection Matrix4f_Projection} will be ignored NOTE: Enable only if {@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear} is also
     * enabled where the far clipping plane will be pushed to infinity.
     * </li>
     * <li>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL} - 
     * Enable if the application is rendering with OpenGL and expects a projection matrix with a clipping range of (-w to w). Ignore this flag if your
     * application already handles the conversion from D3D range (0 to w) to OpenGL.
     * </li>
     * </ul>
     */
    public static final int
        ovrProjection_None              = 0x00,
        ovrProjection_LeftHanded        = 0x01,
        ovrProjection_FarLessThanNear   = 0x02,
        ovrProjection_FarClipAtInfinity = 0x04,
        ovrProjection_ClipRangeOpenGL   = 0x08;

    /**
     * Modes used to generate Touch Haptics from audio PCM buffer.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrHapticsGenMode_PointSample HapticsGenMode_PointSample} - Point sample original signal at Haptics frequency</li>
     * <li>{@link #ovrHapticsGenMode_Count HapticsGenMode_Count}</li>
     * </ul>
     */
    public static final int
        ovrHapticsGenMode_PointSample = 0,
        ovrHapticsGenMode_Count       = 1;

    protected OVRUtil() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_Detect ] ---

    /** Unsafe version of: {@link #ovr_Detect _Detect} */
    public static native void novr_Detect(int timeoutMilliseconds, long __result);

    /**
     * Detects Oculus Runtime and Device Status.
     * 
     * <p>Checks for Oculus Runtime and Oculus HMD device status without loading the LibOVRRT shared library. This may be called before {@link OVR#ovr_Initialize Initialize} to help
     * decide whether or not to initialize LibOVR.</p>
     *
     * @param timeoutMilliseconds a timeout to wait for HMD to be attached or 0 to poll
     */
    @NativeType("ovrDetectResult")
    public static OVRDetectResult ovr_Detect(int timeoutMilliseconds, @NativeType("ovrDetectResult") OVRDetectResult __result) {
        novr_Detect(timeoutMilliseconds, __result.address());
        return __result;
    }

    // --- [ ovrMatrix4f_Projection ] ---

    /** Unsafe version of: {@link #ovrMatrix4f_Projection Matrix4f_Projection} */
    public static native void novrMatrix4f_Projection(long fov, float znear, float zfar, int projectionModFlags, long __result);

    /**
     * Used to generate projection from {@code ovrEyeDesc::Fov}.
     *
     * @param fov                the {@link OVRFovPort} to use
     * @param znear              distance to near Z limit
     * @param zfar               distance to far Z limit
     * @param projectionModFlags a combination of the {@code ovrProjectionModifier} flags. One or more of:<br><table><tr><td>{@link #ovrProjection_None Projection_None}</td><td>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}</td><td>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}</td></tr><tr><td>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}</td></tr></table>
     * @param __result           the calculated projection matrix
     */
    @NativeType("ovrMatrix4f")
    public static OVRMatrix4f ovrMatrix4f_Projection(@NativeType("ovrFovPort") OVRFovPort fov, float znear, float zfar, @NativeType("unsigned int") int projectionModFlags, @NativeType("ovrMatrix4f") OVRMatrix4f __result) {
        novrMatrix4f_Projection(fov.address(), znear, zfar, projectionModFlags, __result.address());
        return __result;
    }

    // --- [ ovrTimewarpProjectionDesc_FromProjection ] ---

    /** Unsafe version of: {@link #ovrTimewarpProjectionDesc_FromProjection TimewarpProjectionDesc_FromProjection} */
    public static native void novrTimewarpProjectionDesc_FromProjection(long projection, int projectionModFlags, long __result);

    /**
     * Extracts the required data from the result of {@link #ovrMatrix4f_Projection Matrix4f_Projection}.
     *
     * @param projection         the project matrix from which to extract {@link OVRTimewarpProjectionDesc}
     * @param projectionModFlags a combination of the ovrProjectionModifier flags. One or more of:<br><table><tr><td>{@link #ovrProjection_None Projection_None}</td><td>{@link #ovrProjection_LeftHanded Projection_LeftHanded}</td><td>{@link #ovrProjection_FarLessThanNear Projection_FarLessThanNear}</td></tr><tr><td>{@link #ovrProjection_FarClipAtInfinity Projection_FarClipAtInfinity}</td><td>{@link #ovrProjection_ClipRangeOpenGL Projection_ClipRangeOpenGL}</td></tr></table>
     * @param __result           the extracted ovrTimewarpProjectionDesc
     */
    @NativeType("ovrTimewarpProjectionDesc")
    public static OVRTimewarpProjectionDesc ovrTimewarpProjectionDesc_FromProjection(@NativeType("ovrMatrix4f") OVRMatrix4f projection, @NativeType("unsigned int") int projectionModFlags, @NativeType("ovrTimewarpProjectionDesc") OVRTimewarpProjectionDesc __result) {
        novrTimewarpProjectionDesc_FromProjection(projection.address(), projectionModFlags, __result.address());
        return __result;
    }

    // --- [ ovrMatrix4f_OrthoSubProjection ] ---

    /** Unsafe version of: {@link #ovrMatrix4f_OrthoSubProjection Matrix4f_OrthoSubProjection} */
    public static native void novrMatrix4f_OrthoSubProjection(long projection, long orthoScale, float orthoDistance, float HmdToEyeOffsetX, long __result);

    /**
     * Generates an orthographic sub-projection.
     * 
     * <p>Used for 2D rendering, Y is down.</p>
     *
     * @param projection      the perspective matrix that the orthographic matrix is derived from
     * @param orthoScale      equal to {@code 1.0f / pixelsPerTanAngleAtCenter}
     * @param orthoDistance   equal to the distance from the camera in meters, such as 0.8m
     * @param HmdToEyeOffsetX the offset of the eye from the center
     * @param __result        the calculated projection matrix
     */
    @NativeType("ovrMatrix4f")
    public static OVRMatrix4f ovrMatrix4f_OrthoSubProjection(@NativeType("ovrMatrix4f") OVRMatrix4f projection, @NativeType("ovrVector2f") OVRVector2f orthoScale, float orthoDistance, float HmdToEyeOffsetX, @NativeType("ovrMatrix4f") OVRMatrix4f __result) {
        novrMatrix4f_OrthoSubProjection(projection.address(), orthoScale.address(), orthoDistance, HmdToEyeOffsetX, __result.address());
        return __result;
    }

    // --- [ ovr_CalcEyePoses ] ---

    /** Unsafe version of: {@link #ovr_CalcEyePoses _CalcEyePoses} */
    public static native void novr_CalcEyePoses(long headPose, long HmdToEyePose, long outEyePoses);

    /**
     * Computes offset eye poses based on {@code headPose} returned by {@link OVRTrackingState}.
     *
     * @param headPose     indicates the HMD position and orientation to use for the calculation
     * @param HmdToEyePose can be {@link OVREyeRenderDesc}{@code .HmdToEyePose} returned from {@link OVR#ovr_GetRenderDesc GetRenderDesc}. For monoscopic rendering, use a position vector that is average of
     *                     the two position vectors for each eye   .
     * @param outEyePoses  if {@code outEyePoses} are used for rendering, they should be passed to {@link OVR#ovr_SubmitFrame SubmitFrame} in {@link OVRLayerEyeFov}{@code ::RenderPose} or
     *                     {@link OVRLayerEyeFovDepth}{@code ::RenderPose}
     */
    public static void ovr_CalcEyePoses(@NativeType("ovrPosef") OVRPosef headPose, @NativeType("ovrPosef const *") OVRPosef.Buffer HmdToEyePose, @NativeType("ovrPosef *") OVRPosef.Buffer outEyePoses) {
        if (CHECKS) {
            check(HmdToEyePose, 2);
            check(outEyePoses, 2);
        }
        novr_CalcEyePoses(headPose.address(), HmdToEyePose.address(), outEyePoses.address());
    }

    // --- [ ovr_GetEyePoses ] ---

    /** Unsafe version of: {@link #ovr_GetEyePoses _GetEyePoses} */
    public static native void novr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, long HmdToEyePose, long outEyePoses, long outSensorSampleTime);

    /**
     * Returns the predicted head pose in {@code outHmdTrackingState} and offset eye poses in {@code outEyePoses}.
     * 
     * <p>This is a thread-safe function where caller should increment {@code frameIndex} with every frame and pass that index where applicable to functions
     * called on the rendering thread. Assuming {@code outEyePoses} are used for rendering, it should be passed as a part of {@link OVRLayerEyeFov}. The caller does
     * not need to worry about applying {@code HmdToEyePose} to the returned {@code outEyePoses} variables.</p>
     *
     * @param session             an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param frameIndex          the targeted frame index, or 0 to refer to one frame after the last time {@link OVR#ovr_SubmitFrame SubmitFrame} was called
     * @param latencyMarker       Specifies that this call is the point in time where the "App-to-Mid-Photon" latency timer starts from. If a given {@code ovrLayer} provides
     *                            "SensorSampleTimestamp", that will override the value stored here.
     * @param HmdToEyePose        can be {@link OVREyeRenderDesc}{@code .HmdToEyePose} returned from {@link OVR#ovr_GetRenderDesc GetRenderDesc}. For monoscopic rendering, use a position vector that is the
     *                            average of the two position vectors for each eye.
     * @param outEyePoses         the predicted eye poses
     * @param outSensorSampleTime the time when this function was called. May be NULL, in which case it is ignored.
     */
    public static void ovr_GetEyePoses(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @NativeType("ovrBool") boolean latencyMarker, @NativeType("ovrPosef const *") OVRPosef.Buffer HmdToEyePose, @NativeType("ovrPosef *") OVRPosef.Buffer outEyePoses, @Nullable @NativeType("double *") DoubleBuffer outSensorSampleTime) {
        if (CHECKS) {
            check(session);
            check(HmdToEyePose, 2);
            check(outEyePoses, 2);
            checkSafe(outSensorSampleTime, 1);
        }
        novr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyePose.address(), outEyePoses.address(), memAddressSafe(outSensorSampleTime));
    }

    // --- [ ovrPosef_FlipHandedness ] ---

    /** Unsafe version of: {@link #ovrPosef_FlipHandedness Posef_FlipHandedness} */
    public static native void novrPosef_FlipHandedness(long inPose, long outPose);

    /**
     * Tracking poses provided by the SDK come in a right-handed coordinate system. If an application is passing in {@link #ovrProjection_LeftHanded Projection_LeftHanded} into
     * {@link #ovrMatrix4f_Projection Matrix4f_Projection}, then it should also use this function to flip the HMD tracking poses to be left-handed.
     * 
     * <p>While this utility function is intended to convert a left-handed OVRPosef into a right-handed coordinate system, it will also work for converting
     * right-handed to left-handed since the flip operation is the same for both cases.</p>
     *
     * @param inPose  a pose that is right-handed
     * @param outPose the pose that is requested to be left-handed (can be the same pointer to {@code inPose})
     */
    public static void ovrPosef_FlipHandedness(@NativeType("ovrPosef const *") OVRPosef inPose, @NativeType("ovrPosef *") OVRPosef outPose) {
        novrPosef_FlipHandedness(inPose.address(), outPose.address());
    }

    // --- [ ovr_ReadWavFromBuffer ] ---

    /**
     * Unsafe version of: {@link #ovr_ReadWavFromBuffer _ReadWavFromBuffer}
     *
     * @param dataSizeInBytes size of the buffer in bytes
     */
    public static native int novr_ReadWavFromBuffer(long outAudioChannel, long inputData, int dataSizeInBytes, int stereoChannelToUse);

    /**
     * Reads an audio channel from Wav (Waveform Audio File) data.
     * 
     * <p>Input must be a byte buffer representing a valid Wav file. Audio samples from the specified channel are read, converted to float {@code [-1.0f, 1.0f]}
     * and returned through {@link OVRAudioChannelData}.</p>
     * 
     * <p>Supported formats: PCM 8b, 16b, 32b and IEEE float (little-endian only).</p>
     *
     * @param outAudioChannel    output audio channel data
     * @param inputData          a binary buffer representing a valid Wav file data
     * @param stereoChannelToUse audio channel index to extract (0 for mono)
     */
    @NativeType("ovrResult")
    public static int ovr_ReadWavFromBuffer(@NativeType("ovrAudioChannelData *") OVRAudioChannelData outAudioChannel, @NativeType("void const *") ByteBuffer inputData, int stereoChannelToUse) {
        return novr_ReadWavFromBuffer(outAudioChannel.address(), memAddress(inputData), inputData.remaining(), stereoChannelToUse);
    }

    // --- [ ovr_GenHapticsFromAudioData ] ---

    /** Unsafe version of: {@link #ovr_GenHapticsFromAudioData _GenHapticsFromAudioData} */
    public static native int novr_GenHapticsFromAudioData(long outHapticsClip, long audioChannel, int genMode);

    /**
     * Generates playable Touch Haptics data from an audio channel.
     *
     * @param outHapticsClip generated Haptics clip
     * @param audioChannel   input audio channel data
     * @param genMode        mode used to convert and audio channel data to Haptics data. Must be:<br><table><tr><td>{@link #ovrHapticsGenMode_PointSample HapticsGenMode_PointSample}</td></tr></table>
     */
    @NativeType("ovrResult")
    public static int ovr_GenHapticsFromAudioData(@NativeType("ovrHapticsClip *") OVRHapticsClip outHapticsClip, @NativeType("ovrAudioChannelData const *") OVRAudioChannelData audioChannel, @NativeType("ovrHapticsGenMode") int genMode) {
        return novr_GenHapticsFromAudioData(outHapticsClip.address(), audioChannel.address(), genMode);
    }

    // --- [ ovr_ReleaseAudioChannelData ] ---

    /** Unsafe version of: {@link #ovr_ReleaseAudioChannelData _ReleaseAudioChannelData} */
    public static native void novr_ReleaseAudioChannelData(long audioChannel);

    /**
     * Releases memory allocated for ovrAudioChannelData. Must be called to avoid memory leak.
     *
     * @param audioChannel pointer to an audio channel
     */
    public static void ovr_ReleaseAudioChannelData(@NativeType("ovrAudioChannelData *") OVRAudioChannelData audioChannel) {
        novr_ReleaseAudioChannelData(audioChannel.address());
    }

    // --- [ ovr_ReleaseHapticsClip ] ---

    /** Unsafe version of: {@link #ovr_ReleaseHapticsClip _ReleaseHapticsClip} */
    public static native void novr_ReleaseHapticsClip(long hapticsClip);

    /**
     * Releases memory allocated for ovrHapticsClip. Must be called to avoid memory leak.
     *
     * @param hapticsClip pointer to a haptics clip
     */
    public static void ovr_ReleaseHapticsClip(@NativeType("ovrHapticsClip *") OVRHapticsClip hapticsClip) {
        novr_ReleaseHapticsClip(hapticsClip.address());
    }

    /** Array version of: {@link #novr_GetEyePoses} */
    public static native void novr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, long HmdToEyePose, long outEyePoses, double[] outSensorSampleTime);

    /** Array version of: {@link #ovr_GetEyePoses _GetEyePoses} */
    public static void ovr_GetEyePoses(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @NativeType("ovrBool") boolean latencyMarker, @NativeType("ovrPosef const *") OVRPosef.Buffer HmdToEyePose, @NativeType("ovrPosef *") OVRPosef.Buffer outEyePoses, @Nullable @NativeType("double *") double[] outSensorSampleTime) {
        if (CHECKS) {
            check(session);
            check(HmdToEyePose, 2);
            check(outEyePoses, 2);
            checkSafe(outSensorSampleTime, 1);
        }
        novr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyePose.address(), outEyePoses.address(), outSensorSampleTime);
    }

}