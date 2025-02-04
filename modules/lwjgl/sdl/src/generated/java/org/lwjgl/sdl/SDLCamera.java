/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLCamera {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNumCameraDrivers       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumCameraDrivers"),
            GetCameraDriver           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraDriver"),
            GetCurrentCameraDriver    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentCameraDriver"),
            GetCameras                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameras"),
            GetCameraSupportedFormats = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraSupportedFormats"),
            GetCameraName             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraName"),
            GetCameraPosition         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraPosition"),
            OpenCamera                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenCamera"),
            GetCameraPermissionState  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraPermissionState"),
            GetCameraID               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraID"),
            GetCameraProperties       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraProperties"),
            GetCameraFormat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCameraFormat"),
            AcquireCameraFrame        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AcquireCameraFrame"),
            ReleaseCameraFrame        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseCameraFrame"),
            CloseCamera               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseCamera");

    }

    public static final int
        SDL_CAMERA_POSITION_UNKNOWN      = 0,
        SDL_CAMERA_POSITION_FRONT_FACING = 1,
        SDL_CAMERA_POSITION_BACK_FACING  = 2;

    protected SDLCamera() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetNumCameraDrivers ] ---

    /** {@code int SDL_GetNumCameraDrivers(void)} */
    public static int SDL_GetNumCameraDrivers() {
        long __functionAddress = Functions.GetNumCameraDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetCameraDriver ] ---

    /** {@code char const * SDL_GetCameraDriver(int index)} */
    public static long nSDL_GetCameraDriver(int index) {
        long __functionAddress = Functions.GetCameraDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetCameraDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCameraDriver(int index) {
        long __result = nSDL_GetCameraDriver(index);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCurrentCameraDriver ] ---

    /** {@code char const * SDL_GetCurrentCameraDriver(void)} */
    public static long nSDL_GetCurrentCameraDriver() {
        long __functionAddress = Functions.GetCurrentCameraDriver;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetCurrentCameraDriver(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCurrentCameraDriver() {
        long __result = nSDL_GetCurrentCameraDriver();
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCameras ] ---

    /** {@code SDL_CameraID * SDL_GetCameras(int * count)} */
    public static long nSDL_GetCameras(long count) {
        long __functionAddress = Functions.GetCameras;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_CameraID * SDL_GetCameras(int * count)} */
    @NativeType("SDL_CameraID *")
    public static @Nullable IntBuffer SDL_GetCameras() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetCameras(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetCameraSupportedFormats ] ---

    /** {@code SDL_CameraSpec ** SDL_GetCameraSupportedFormats(SDL_CameraID instance_id, int * count)} */
    public static long nSDL_GetCameraSupportedFormats(int instance_id, long count) {
        long __functionAddress = Functions.GetCameraSupportedFormats;
        return invokePP(instance_id, count, __functionAddress);
    }

    /** {@code SDL_CameraSpec ** SDL_GetCameraSupportedFormats(SDL_CameraID instance_id, int * count)} */
    @NativeType("SDL_CameraSpec **")
    public static @Nullable PointerBuffer SDL_GetCameraSupportedFormats(@NativeType("SDL_CameraID") int instance_id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetCameraSupportedFormats(instance_id, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetCameraName ] ---

    /** {@code char const * SDL_GetCameraName(SDL_CameraID instance_id)} */
    public static long nSDL_GetCameraName(int instance_id) {
        long __functionAddress = Functions.GetCameraName;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetCameraName(SDL_CameraID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCameraName(@NativeType("SDL_CameraID") int instance_id) {
        long __result = nSDL_GetCameraName(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetCameraPosition ] ---

    /** {@code SDL_CameraPosition SDL_GetCameraPosition(SDL_CameraID instance_id)} */
    @NativeType("SDL_CameraPosition")
    public static int SDL_GetCameraPosition(@NativeType("SDL_CameraID") int instance_id) {
        long __functionAddress = Functions.GetCameraPosition;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_OpenCamera ] ---

    /** {@code SDL_Camera * SDL_OpenCamera(SDL_CameraID instance_id, SDL_CameraSpec const * spec)} */
    public static long nSDL_OpenCamera(int instance_id, long spec) {
        long __functionAddress = Functions.OpenCamera;
        return invokePP(instance_id, spec, __functionAddress);
    }

    /** {@code SDL_Camera * SDL_OpenCamera(SDL_CameraID instance_id, SDL_CameraSpec const * spec)} */
    @NativeType("SDL_Camera *")
    public static long SDL_OpenCamera(@NativeType("SDL_CameraID") int instance_id, @NativeType("SDL_CameraSpec const *") @Nullable SDL_CameraSpec spec) {
        return nSDL_OpenCamera(instance_id, memAddressSafe(spec));
    }

    // --- [ SDL_GetCameraPermissionState ] ---

    /** {@code int SDL_GetCameraPermissionState(SDL_Camera * camera)} */
    public static int SDL_GetCameraPermissionState(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraPermissionState;
        if (CHECKS) {
            check(camera);
        }
        return invokePI(camera, __functionAddress);
    }

    // --- [ SDL_GetCameraID ] ---

    /** {@code SDL_CameraID SDL_GetCameraID(SDL_Camera * camera)} */
    @NativeType("SDL_CameraID")
    public static int SDL_GetCameraID(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraID;
        if (CHECKS) {
            check(camera);
        }
        return invokePI(camera, __functionAddress);
    }

    // --- [ SDL_GetCameraProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetCameraProperties(SDL_Camera * camera)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetCameraProperties(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraProperties;
        if (CHECKS) {
            check(camera);
        }
        return invokePI(camera, __functionAddress);
    }

    // --- [ SDL_GetCameraFormat ] ---

    /** {@code bool SDL_GetCameraFormat(SDL_Camera * camera, SDL_CameraSpec * spec)} */
    public static boolean nSDL_GetCameraFormat(long camera, long spec) {
        long __functionAddress = Functions.GetCameraFormat;
        if (CHECKS) {
            check(camera);
        }
        return invokePPZ(camera, spec, __functionAddress);
    }

    /** {@code bool SDL_GetCameraFormat(SDL_Camera * camera, SDL_CameraSpec * spec)} */
    @NativeType("bool")
    public static boolean SDL_GetCameraFormat(@NativeType("SDL_Camera *") long camera, @NativeType("SDL_CameraSpec *") SDL_CameraSpec spec) {
        return nSDL_GetCameraFormat(camera, spec.address());
    }

    // --- [ SDL_AcquireCameraFrame ] ---

    /** {@code SDL_Surface * SDL_AcquireCameraFrame(SDL_Camera * camera, Uint64 * timestampNS)} */
    public static long nSDL_AcquireCameraFrame(long camera, long timestampNS) {
        long __functionAddress = Functions.AcquireCameraFrame;
        if (CHECKS) {
            check(camera);
        }
        return invokePPP(camera, timestampNS, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_AcquireCameraFrame(SDL_Camera * camera, Uint64 * timestampNS)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_AcquireCameraFrame(@NativeType("SDL_Camera *") long camera, @NativeType("Uint64 *") @Nullable LongBuffer timestampNS) {
        if (CHECKS) {
            checkSafe(timestampNS, 1);
        }
        long __result = nSDL_AcquireCameraFrame(camera, memAddressSafe(timestampNS));
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ReleaseCameraFrame ] ---

    /** {@code void SDL_ReleaseCameraFrame(SDL_Camera * camera, SDL_Surface * frame)} */
    public static void nSDL_ReleaseCameraFrame(long camera, long frame) {
        long __functionAddress = Functions.ReleaseCameraFrame;
        if (CHECKS) {
            check(camera);
        }
        invokePPV(camera, frame, __functionAddress);
    }

    /** {@code void SDL_ReleaseCameraFrame(SDL_Camera * camera, SDL_Surface * frame)} */
    public static void SDL_ReleaseCameraFrame(@NativeType("SDL_Camera *") long camera, @NativeType("SDL_Surface *") SDL_Surface frame) {
        nSDL_ReleaseCameraFrame(camera, frame.address());
    }

    // --- [ SDL_CloseCamera ] ---

    /** {@code void SDL_CloseCamera(SDL_Camera * camera)} */
    public static void SDL_CloseCamera(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.CloseCamera;
        if (CHECKS) {
            check(camera);
        }
        invokePV(camera, __functionAddress);
    }

}