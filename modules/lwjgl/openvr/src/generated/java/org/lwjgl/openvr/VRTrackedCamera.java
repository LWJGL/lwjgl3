/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRTrackedCamera {

    protected VRTrackedCamera() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRTrackedCamera_GetCameraErrorNameFromEnum ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetCameraErrorNameFromEnum GetCameraErrorNameFromEnum} */
    public static long nVRTrackedCamera_GetCameraErrorNameFromEnum(int eCameraError) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eCameraError, __functionAddress);
    }

    /**
     * Returns a string for an error.
     *
     * @param eCameraError one of:<br><table><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_None}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_OperationFailed}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidHandle}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameHeaderVersion}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_OutOfHandles}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_IPCFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_NotSupportedForThisDevice}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_SharedMemoryFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_FrameBufferingFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_StreamSetupFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidGLTextureId}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidSharedTextureHandle}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_FailedToGetGLTextureId}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_SharedTextureFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidArgument}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameBufferSize}</td></tr></table>
     */
    @Nullable
    @NativeType("char const *")
    public static String VRTrackedCamera_GetCameraErrorNameFromEnum(@NativeType("EVRTrackedCameraError") int eCameraError) {
        long __result = nVRTrackedCamera_GetCameraErrorNameFromEnum(eCameraError);
        return memASCIISafe(__result);
    }

    // --- [ VRTrackedCamera_HasCamera ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_HasCamera HasCamera} */
    public static int nVRTrackedCamera_HasCamera(int nDeviceIndex, long pHasCamera) {
        long __functionAddress = OpenVR.VRTrackedCamera.HasCamera;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDeviceIndex, pHasCamera, __functionAddress);
    }

    /** For convenience, same as tracked property request {@link VR#ETrackedDeviceProperty_Prop_HasCamera_Bool}. */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_HasCamera(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("bool *") ByteBuffer pHasCamera) {
        if (CHECKS) {
            check(pHasCamera, 1);
        }
        return nVRTrackedCamera_HasCamera(nDeviceIndex, memAddress(pHasCamera));
    }

    // --- [ VRTrackedCamera_GetCameraFrameSize ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetCameraFrameSize GetCameraFrameSize} */
    public static int nVRTrackedCamera_GetCameraFrameSize(int nDeviceIndex, int eFrameType, long pnWidth, long pnHeight, long pnFrameBufferSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraFrameSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(nDeviceIndex, eFrameType, pnWidth, pnHeight, pnFrameBufferSize, __functionAddress);
    }

    /**
     * Gets size of the image frame.
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetCameraFrameSize(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight, @NativeType("uint32_t *") IntBuffer pnFrameBufferSize) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
            check(pnFrameBufferSize, 1);
        }
        return nVRTrackedCamera_GetCameraFrameSize(nDeviceIndex, eFrameType, memAddress(pnWidth), memAddress(pnHeight), memAddress(pnFrameBufferSize));
    }

    // --- [ VRTrackedCamera_GetCameraIntrinsics ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetCameraIntrinsics GetCameraIntrinsics} */
    public static int nVRTrackedCamera_GetCameraIntrinsics(int nDeviceIndex, int nCameraIndex, int eFrameType, long pFocalLength, long pCenter) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraIntrinsics;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(nDeviceIndex, nCameraIndex, eFrameType, pFocalLength, pCenter, __functionAddress);
    }

    /** @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table> */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetCameraIntrinsics(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("uint32_t") int nCameraIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("HmdVector2_t *") HmdVector2.Buffer pFocalLength, @NativeType("HmdVector2_t *") HmdVector2.Buffer pCenter) {
        if (CHECKS) {
            check(pFocalLength, 1);
            check(pCenter, 1);
        }
        return nVRTrackedCamera_GetCameraIntrinsics(nDeviceIndex, nCameraIndex, eFrameType, pFocalLength.address(), pCenter.address());
    }

    // --- [ VRTrackedCamera_GetCameraProjection ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetCameraProjection GetCameraProjection} */
    public static int nVRTrackedCamera_GetCameraProjection(int nDeviceIndex, int nCameraIndex, int eFrameType, float flZNear, float flZFar, long pProjection) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraProjection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDeviceIndex, nCameraIndex, eFrameType, flZNear, flZFar, pProjection, __functionAddress);
    }

    /** @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table> */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetCameraProjection(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("uint32_t") int nCameraIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, float flZNear, float flZFar, @NativeType("HmdMatrix44_t *") HmdMatrix44 pProjection) {
        return nVRTrackedCamera_GetCameraProjection(nDeviceIndex, nCameraIndex, eFrameType, flZNear, flZFar, pProjection.address());
    }

    // --- [ VRTrackedCamera_AcquireVideoStreamingService ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_AcquireVideoStreamingService AcquireVideoStreamingService} */
    public static int nVRTrackedCamera_AcquireVideoStreamingService(int nDeviceIndex, long pHandle) {
        long __functionAddress = OpenVR.VRTrackedCamera.AcquireVideoStreamingService;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDeviceIndex, pHandle, __functionAddress);
    }

    /**
     * Acquiring streaming service permits video streaming for the caller. Releasing hints the system that video services do not need to be maintained for
     * this client. If the camera has not already been activated, a one time spin up may incur some auto exposure as well as initial streaming frame delays.
     * The camera should be considered a global resource accessible for shared consumption but not exclusive to any caller. The camera may go inactive due to
     * lack of active consumers or headset idleness.
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_AcquireVideoStreamingService(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("TrackedCameraHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nVRTrackedCamera_AcquireVideoStreamingService(nDeviceIndex, memAddress(pHandle));
    }

    // --- [ VRTrackedCamera_ReleaseVideoStreamingService ] ---

    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_ReleaseVideoStreamingService(@NativeType("TrackedCameraHandle_t") long hTrackedCamera) {
        long __functionAddress = OpenVR.VRTrackedCamera.ReleaseVideoStreamingService;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(hTrackedCamera, __functionAddress);
    }

    // --- [ VRTrackedCamera_GetVideoStreamFrameBuffer ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamFrameBuffer GetVideoStreamFrameBuffer} */
    public static int nVRTrackedCamera_GetVideoStreamFrameBuffer(long hTrackedCamera, int eFrameType, long pFrameBuffer, int nFrameBufferSize, long pFrameHeader, int nFrameHeaderSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamFrameBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(hTrackedCamera, eFrameType, pFrameBuffer, nFrameBufferSize, pFrameHeader, nFrameHeaderSize, __functionAddress);
    }

    /**
     * Copies the image frame into a caller's provided buffer. The image data is currently provided as RGBA data, 4 bytes per pixel. A caller can provide null
     * for the framebuffer or frameheader if not desired. Requesting the frame header first, followed by the frame buffer allows the caller to determine if
     * the frame as advanced per the frame header sequence. If there is no frame available yet, due to initial camera spinup or re-activation, the error will
     * be {@link VR#EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable}. Ideally a caller should be polling at ~16ms intervals.
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamFrameBuffer(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("void *") ByteBuffer pFrameBuffer, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader) {
        return nVRTrackedCamera_GetVideoStreamFrameBuffer(hTrackedCamera, eFrameType, memAddress(pFrameBuffer), pFrameBuffer.remaining(), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
    }

    // --- [ VRTrackedCamera_GetVideoStreamTextureSize ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamTextureSize GetVideoStreamTextureSize} */
    public static int nVRTrackedCamera_GetVideoStreamTextureSize(int nDeviceIndex, int eFrameType, long pTextureBounds, long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(nDeviceIndex, eFrameType, pTextureBounds, pnWidth, pnHeight, __functionAddress);
    }

    /**
     * Gets size of the image frame.
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureSize(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("VRTextureBounds_t *") VRTextureBounds pTextureBounds, @NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureSize(nDeviceIndex, eFrameType, pTextureBounds.address(), memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRTrackedCamera_GetVideoStreamTextureD3D11 ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamTextureD3D11 GetVideoStreamTextureD3D11} */
    public static int nVRTrackedCamera_GetVideoStreamTextureD3D11(long hTrackedCamera, int eFrameType, long pD3D11DeviceOrResource, long ppD3D11ShaderResourceView, long pFrameHeader, int nFrameHeaderSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11DeviceOrResource);
        }
        return callJPPPI(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, ppD3D11ShaderResourceView, pFrameHeader, nFrameHeaderSize, __functionAddress);
    }

    /**
     * Access a shared D3D11 texture for the specified tracked camera stream.
     * 
     * <p>The camera frame type {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted} is not supported directly as a shared texture. It is an interior
     * subregion of the shared texture {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}. Instead, use {@link #VRTrackedCamera_GetVideoStreamTextureSize GetVideoStreamTextureSize} with
     * {@code VRTrackedCameraFrameType_Undistorted} to determine the proper interior subregion bounds along with
     * {@code GetVideoStreamTextureD3D11()} with {@code VRTrackedCameraFrameType_MaximumUndistorted} to provide the texture. The
     * {@code VRTrackedCameraFrameType_MaximumUndistorted} will yield an image where the invalid regions are decoded by the alpha channel having a zero
     * component. The valid regions all have a non-zero alpha component. The subregion as described by {@code VRTrackedCameraFrameType_Undistorted} guarantees
     * a rectangle where all pixels are valid.</p>
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureD3D11(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("void *") long pD3D11DeviceOrResource, @NativeType("void **") PointerBuffer ppD3D11ShaderResourceView, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader, @NativeType("uint32_t") int nFrameHeaderSize) {
        if (CHECKS) {
            check(ppD3D11ShaderResourceView, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureD3D11(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView), pFrameHeader.address(), nFrameHeaderSize);
    }

    /**
     * Access a shared D3D11 texture for the specified tracked camera stream.
     * 
     * <p>The camera frame type {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted} is not supported directly as a shared texture. It is an interior
     * subregion of the shared texture {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}. Instead, use {@link #VRTrackedCamera_GetVideoStreamTextureSize GetVideoStreamTextureSize} with
     * {@code VRTrackedCameraFrameType_Undistorted} to determine the proper interior subregion bounds along with
     * {@code GetVideoStreamTextureD3D11()} with {@code VRTrackedCameraFrameType_MaximumUndistorted} to provide the texture. The
     * {@code VRTrackedCameraFrameType_MaximumUndistorted} will yield an image where the invalid regions are decoded by the alpha channel having a zero
     * component. The valid regions all have a non-zero alpha component. The subregion as described by {@code VRTrackedCameraFrameType_Undistorted} guarantees
     * a rectangle where all pixels are valid.</p>
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureD3D11(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("void *") long pD3D11DeviceOrResource, @NativeType("void **") PointerBuffer ppD3D11ShaderResourceView, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader) {
        if (CHECKS) {
            check(ppD3D11ShaderResourceView, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureD3D11(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
    }

    // --- [ VRTrackedCamera_GetVideoStreamTextureGL ] ---

    /** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamTextureGL GetVideoStreamTextureGL} */
    public static int nVRTrackedCamera_GetVideoStreamTextureGL(long hTrackedCamera, int eFrameType, long pglTextureId, long pFrameHeader, int nFrameHeaderSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(hTrackedCamera, eFrameType, pglTextureId, pFrameHeader, nFrameHeaderSize, __functionAddress);
    }

    /**
     * Access a shared GL texture for the specified tracked camera stream.
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureGL(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("glUInt_t *") IntBuffer pglTextureId, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader, @NativeType("uint32_t") int nFrameHeaderSize) {
        if (CHECKS) {
            check(pglTextureId, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureGL(hTrackedCamera, eFrameType, memAddress(pglTextureId), pFrameHeader.address(), nFrameHeaderSize);
    }

    /**
     * Access a shared GL texture for the specified tracked camera stream.
     *
     * @param eFrameType one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
     */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureGL(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("glUInt_t *") IntBuffer pglTextureId, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader) {
        if (CHECKS) {
            check(pglTextureId, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureGL(hTrackedCamera, eFrameType, memAddress(pglTextureId), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
    }

    // --- [ VRTrackedCamera_ReleaseVideoStreamTextureGL ] ---

    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_ReleaseVideoStreamTextureGL(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("glUInt_t") int glTextureId) {
        long __functionAddress = OpenVR.VRTrackedCamera.ReleaseVideoStreamTextureGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(hTrackedCamera, glTextureId, __functionAddress);
    }

    // --- [ VRTrackedCamera_SetCameraTrackingSpace ] ---

    /** @param eUniverse one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table> */
    public static void VRTrackedCamera_SetCameraTrackingSpace(@NativeType("ETrackingUniverseOrigin") int eUniverse) {
        long __functionAddress = OpenVR.VRTrackedCamera.SetCameraTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eUniverse, __functionAddress);
    }

    // --- [ VRTrackedCamera_GetCameraTrackingSpace ] ---

    @NativeType("ETrackingUniverseOrigin")
    public static int VRTrackedCamera_GetCameraTrackingSpace() {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}