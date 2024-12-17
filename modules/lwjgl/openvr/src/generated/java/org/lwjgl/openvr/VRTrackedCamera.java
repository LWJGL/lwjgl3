/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

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

    /** {@code char const * VRTrackedCamera_GetCameraErrorNameFromEnum(EVRTrackedCameraError eCameraError)} */
    public static long nVRTrackedCamera_GetCameraErrorNameFromEnum(int eCameraError) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eCameraError, __functionAddress);
    }

    /** {@code char const * VRTrackedCamera_GetCameraErrorNameFromEnum(EVRTrackedCameraError eCameraError)} */
    @NativeType("char const *")
    public static @Nullable String VRTrackedCamera_GetCameraErrorNameFromEnum(@NativeType("EVRTrackedCameraError") int eCameraError) {
        long __result = nVRTrackedCamera_GetCameraErrorNameFromEnum(eCameraError);
        return memASCIISafe(__result);
    }

    // --- [ VRTrackedCamera_HasCamera ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_HasCamera(TrackedDeviceIndex_t nDeviceIndex, bool * pHasCamera)} */
    public static int nVRTrackedCamera_HasCamera(int nDeviceIndex, long pHasCamera) {
        long __functionAddress = OpenVR.VRTrackedCamera.HasCamera;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDeviceIndex, pHasCamera, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_HasCamera(TrackedDeviceIndex_t nDeviceIndex, bool * pHasCamera)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_HasCamera(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("bool *") ByteBuffer pHasCamera) {
        if (CHECKS) {
            check(pHasCamera, 1);
        }
        return nVRTrackedCamera_HasCamera(nDeviceIndex, memAddress(pHasCamera));
    }

    // --- [ VRTrackedCamera_GetCameraFrameSize ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetCameraFrameSize(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, uint32_t * pnWidth, uint32_t * pnHeight, uint32_t * pnFrameBufferSize)} */
    public static int nVRTrackedCamera_GetCameraFrameSize(int nDeviceIndex, int eFrameType, long pnWidth, long pnHeight, long pnFrameBufferSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraFrameSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(nDeviceIndex, eFrameType, pnWidth, pnHeight, pnFrameBufferSize, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetCameraFrameSize(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, uint32_t * pnWidth, uint32_t * pnHeight, uint32_t * pnFrameBufferSize)} */
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

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetCameraIntrinsics(TrackedDeviceIndex_t nDeviceIndex, uint32_t nCameraIndex, EVRTrackedCameraFrameType eFrameType, HmdVector2_t * pFocalLength, HmdVector2_t * pCenter)} */
    public static int nVRTrackedCamera_GetCameraIntrinsics(int nDeviceIndex, int nCameraIndex, int eFrameType, long pFocalLength, long pCenter) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraIntrinsics;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(nDeviceIndex, nCameraIndex, eFrameType, pFocalLength, pCenter, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetCameraIntrinsics(TrackedDeviceIndex_t nDeviceIndex, uint32_t nCameraIndex, EVRTrackedCameraFrameType eFrameType, HmdVector2_t * pFocalLength, HmdVector2_t * pCenter)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetCameraIntrinsics(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("uint32_t") int nCameraIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("HmdVector2_t *") HmdVector2.Buffer pFocalLength, @NativeType("HmdVector2_t *") HmdVector2.Buffer pCenter) {
        if (CHECKS) {
            check(pFocalLength, 1);
            check(pCenter, 1);
        }
        return nVRTrackedCamera_GetCameraIntrinsics(nDeviceIndex, nCameraIndex, eFrameType, pFocalLength.address(), pCenter.address());
    }

    // --- [ VRTrackedCamera_GetCameraProjection ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetCameraProjection(TrackedDeviceIndex_t nDeviceIndex, uint32_t nCameraIndex, EVRTrackedCameraFrameType eFrameType, float flZNear, float flZFar, HmdMatrix44_t * pProjection)} */
    public static int nVRTrackedCamera_GetCameraProjection(int nDeviceIndex, int nCameraIndex, int eFrameType, float flZNear, float flZFar, long pProjection) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraProjection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDeviceIndex, nCameraIndex, eFrameType, flZNear, flZFar, pProjection, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetCameraProjection(TrackedDeviceIndex_t nDeviceIndex, uint32_t nCameraIndex, EVRTrackedCameraFrameType eFrameType, float flZNear, float flZFar, HmdMatrix44_t * pProjection)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetCameraProjection(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("uint32_t") int nCameraIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, float flZNear, float flZFar, @NativeType("HmdMatrix44_t *") HmdMatrix44 pProjection) {
        return nVRTrackedCamera_GetCameraProjection(nDeviceIndex, nCameraIndex, eFrameType, flZNear, flZFar, pProjection.address());
    }

    // --- [ VRTrackedCamera_AcquireVideoStreamingService ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_AcquireVideoStreamingService(TrackedDeviceIndex_t nDeviceIndex, TrackedCameraHandle_t * pHandle)} */
    public static int nVRTrackedCamera_AcquireVideoStreamingService(int nDeviceIndex, long pHandle) {
        long __functionAddress = OpenVR.VRTrackedCamera.AcquireVideoStreamingService;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDeviceIndex, pHandle, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_AcquireVideoStreamingService(TrackedDeviceIndex_t nDeviceIndex, TrackedCameraHandle_t * pHandle)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_AcquireVideoStreamingService(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("TrackedCameraHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nVRTrackedCamera_AcquireVideoStreamingService(nDeviceIndex, memAddress(pHandle));
    }

    // --- [ VRTrackedCamera_ReleaseVideoStreamingService ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_ReleaseVideoStreamingService(TrackedCameraHandle_t hTrackedCamera)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_ReleaseVideoStreamingService(@NativeType("TrackedCameraHandle_t") long hTrackedCamera) {
        long __functionAddress = OpenVR.VRTrackedCamera.ReleaseVideoStreamingService;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(hTrackedCamera, __functionAddress);
    }

    // --- [ VRTrackedCamera_GetVideoStreamFrameBuffer ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamFrameBuffer(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pFrameBuffer, uint32_t nFrameBufferSize, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    public static int nVRTrackedCamera_GetVideoStreamFrameBuffer(long hTrackedCamera, int eFrameType, long pFrameBuffer, int nFrameBufferSize, long pFrameHeader, int nFrameHeaderSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamFrameBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(hTrackedCamera, eFrameType, pFrameBuffer, nFrameBufferSize, pFrameHeader, nFrameHeaderSize, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamFrameBuffer(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pFrameBuffer, uint32_t nFrameBufferSize, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamFrameBuffer(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("void *") ByteBuffer pFrameBuffer, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader) {
        return nVRTrackedCamera_GetVideoStreamFrameBuffer(hTrackedCamera, eFrameType, memAddress(pFrameBuffer), pFrameBuffer.remaining(), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
    }

    // --- [ VRTrackedCamera_GetVideoStreamTextureSize ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureSize(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, VRTextureBounds_t * pTextureBounds, uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static int nVRTrackedCamera_GetVideoStreamTextureSize(int nDeviceIndex, int eFrameType, long pTextureBounds, long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(nDeviceIndex, eFrameType, pTextureBounds, pnWidth, pnHeight, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureSize(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, VRTextureBounds_t * pTextureBounds, uint32_t * pnWidth, uint32_t * pnHeight)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureSize(@NativeType("TrackedDeviceIndex_t") int nDeviceIndex, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("VRTextureBounds_t *") VRTextureBounds pTextureBounds, @NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureSize(nDeviceIndex, eFrameType, pTextureBounds.address(), memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRTrackedCamera_GetVideoStreamTextureD3D11 ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureD3D11(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pD3D11DeviceOrResource, void ** ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    public static int nVRTrackedCamera_GetVideoStreamTextureD3D11(long hTrackedCamera, int eFrameType, long pD3D11DeviceOrResource, long ppD3D11ShaderResourceView, long pFrameHeader, int nFrameHeaderSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11DeviceOrResource);
        }
        return callJPPPI(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, ppD3D11ShaderResourceView, pFrameHeader, nFrameHeaderSize, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureD3D11(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pD3D11DeviceOrResource, void ** ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureD3D11(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("void *") long pD3D11DeviceOrResource, @NativeType("void **") PointerBuffer ppD3D11ShaderResourceView, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader, @NativeType("uint32_t") int nFrameHeaderSize) {
        if (CHECKS) {
            check(ppD3D11ShaderResourceView, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureD3D11(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView), pFrameHeader.address(), nFrameHeaderSize);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureD3D11(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pD3D11DeviceOrResource, void ** ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureD3D11(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("void *") long pD3D11DeviceOrResource, @NativeType("void **") PointerBuffer ppD3D11ShaderResourceView, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader) {
        if (CHECKS) {
            check(ppD3D11ShaderResourceView, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureD3D11(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
    }

    // --- [ VRTrackedCamera_GetVideoStreamTextureGL ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureGL(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, glUInt_t * pglTextureId, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    public static int nVRTrackedCamera_GetVideoStreamTextureGL(long hTrackedCamera, int eFrameType, long pglTextureId, long pFrameHeader, int nFrameHeaderSize) {
        long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(hTrackedCamera, eFrameType, pglTextureId, pFrameHeader, nFrameHeaderSize, __functionAddress);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureGL(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, glUInt_t * pglTextureId, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureGL(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("glUInt_t *") IntBuffer pglTextureId, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader, @NativeType("uint32_t") int nFrameHeaderSize) {
        if (CHECKS) {
            check(pglTextureId, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureGL(hTrackedCamera, eFrameType, memAddress(pglTextureId), pFrameHeader.address(), nFrameHeaderSize);
    }

    /** {@code EVRTrackedCameraError VRTrackedCamera_GetVideoStreamTextureGL(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, glUInt_t * pglTextureId, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_GetVideoStreamTextureGL(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("EVRTrackedCameraFrameType") int eFrameType, @NativeType("glUInt_t *") IntBuffer pglTextureId, @NativeType("CameraVideoStreamFrameHeader_t *") CameraVideoStreamFrameHeader pFrameHeader) {
        if (CHECKS) {
            check(pglTextureId, 1);
        }
        return nVRTrackedCamera_GetVideoStreamTextureGL(hTrackedCamera, eFrameType, memAddress(pglTextureId), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
    }

    // --- [ VRTrackedCamera_ReleaseVideoStreamTextureGL ] ---

    /** {@code EVRTrackedCameraError VRTrackedCamera_ReleaseVideoStreamTextureGL(TrackedCameraHandle_t hTrackedCamera, glUInt_t glTextureId)} */
    @NativeType("EVRTrackedCameraError")
    public static int VRTrackedCamera_ReleaseVideoStreamTextureGL(@NativeType("TrackedCameraHandle_t") long hTrackedCamera, @NativeType("glUInt_t") int glTextureId) {
        long __functionAddress = OpenVR.VRTrackedCamera.ReleaseVideoStreamTextureGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(hTrackedCamera, glTextureId, __functionAddress);
    }

    // --- [ VRTrackedCamera_SetCameraTrackingSpace ] ---

    /** {@code void VRTrackedCamera_SetCameraTrackingSpace(ETrackingUniverseOrigin eUniverse)} */
    public static void VRTrackedCamera_SetCameraTrackingSpace(@NativeType("ETrackingUniverseOrigin") int eUniverse) {
        long __functionAddress = OpenVR.VRTrackedCamera.SetCameraTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eUniverse, __functionAddress);
    }

    // --- [ VRTrackedCamera_GetCameraTrackingSpace ] ---

    /** {@code ETrackingUniverseOrigin VRTrackedCamera_GetCameraTrackingSpace(void)} */
    @NativeType("ETrackingUniverseOrigin")
    public static int VRTrackedCamera_GetCameraTrackingSpace() {
        long __functionAddress = OpenVR.VRTrackedCamera.GetCameraTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}