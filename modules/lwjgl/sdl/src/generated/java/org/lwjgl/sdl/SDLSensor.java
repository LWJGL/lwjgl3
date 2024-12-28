/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLSensor {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetSensors                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensors"),
            GetSensorNameForID            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorNameForID"),
            GetSensorTypeForID            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorTypeForID"),
            GetSensorNonPortableTypeForID = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorNonPortableTypeForID"),
            OpenSensor                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenSensor"),
            GetSensorFromID               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorFromID"),
            GetSensorProperties           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorProperties"),
            GetSensorName                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorName"),
            GetSensorType                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorType"),
            GetSensorNonPortableType      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorNonPortableType"),
            GetSensorID                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorID"),
            GetSensorData                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSensorData"),
            CloseSensor                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseSensor"),
            UpdateSensors                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateSensors");

    }

    public static final float SDL_STANDARD_GRAVITY = 9.80665f;

    public static final int
        SDL_SENSOR_INVALID = -1,
        SDL_SENSOR_UNKNOWN = 0,
        SDL_SENSOR_ACCEL   = 1,
        SDL_SENSOR_GYRO    = 2,
        SDL_SENSOR_ACCEL_L = 3,
        SDL_SENSOR_GYRO_L  = 4,
        SDL_SENSOR_ACCEL_R = 5,
        SDL_SENSOR_GYRO_R  = 6;

    protected SDLSensor() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetSensors ] ---

    /** {@code SDL_SensorID * SDL_GetSensors(int * count)} */
    public static long nSDL_GetSensors(long count) {
        long __functionAddress = Functions.GetSensors;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_SensorID * SDL_GetSensors(int * count)} */
    @NativeType("SDL_SensorID *")
    public static @Nullable IntBuffer SDL_GetSensors() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetSensors(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetSensorNameForID ] ---

    /** {@code char const * SDL_GetSensorNameForID(SDL_SensorID instance_id)} */
    public static long nSDL_GetSensorNameForID(int instance_id) {
        long __functionAddress = Functions.GetSensorNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetSensorNameForID(SDL_SensorID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetSensorNameForID(@NativeType("SDL_SensorID") int instance_id) {
        long __result = nSDL_GetSensorNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetSensorTypeForID ] ---

    /** {@code SDL_SensorType SDL_GetSensorTypeForID(SDL_SensorID instance_id)} */
    @NativeType("SDL_SensorType")
    public static int SDL_GetSensorTypeForID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetSensorNonPortableTypeForID ] ---

    /** {@code int SDL_GetSensorNonPortableTypeForID(SDL_SensorID instance_id)} */
    public static int SDL_GetSensorNonPortableTypeForID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorNonPortableTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_OpenSensor ] ---

    /** {@code SDL_Sensor * SDL_OpenSensor(SDL_SensorID instance_id)} */
    @NativeType("SDL_Sensor *")
    public static long SDL_OpenSensor(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.OpenSensor;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetSensorFromID ] ---

    /** {@code SDL_Sensor * SDL_GetSensorFromID(SDL_SensorID instance_id)} */
    @NativeType("SDL_Sensor *")
    public static long SDL_GetSensorFromID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetSensorProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetSensorProperties(SDL_Sensor * sensor)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetSensorProperties(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorProperties;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorName ] ---

    /** {@code char const * SDL_GetSensorName(SDL_Sensor * sensor)} */
    public static long nSDL_GetSensorName(long sensor) {
        long __functionAddress = Functions.GetSensorName;
        if (CHECKS) {
            check(sensor);
        }
        return invokePP(sensor, __functionAddress);
    }

    /** {@code char const * SDL_GetSensorName(SDL_Sensor * sensor)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetSensorName(@NativeType("SDL_Sensor *") long sensor) {
        long __result = nSDL_GetSensorName(sensor);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetSensorType ] ---

    /** {@code SDL_SensorType SDL_GetSensorType(SDL_Sensor * sensor)} */
    @NativeType("SDL_SensorType")
    public static int SDL_GetSensorType(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorType;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorNonPortableType ] ---

    /** {@code int SDL_GetSensorNonPortableType(SDL_Sensor * sensor)} */
    public static int SDL_GetSensorNonPortableType(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorNonPortableType;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorID ] ---

    /** {@code SDL_SensorID SDL_GetSensorID(SDL_Sensor * sensor)} */
    @NativeType("SDL_SensorID")
    public static int SDL_GetSensorID(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorID;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorData ] ---

    /** {@code bool SDL_GetSensorData(SDL_Sensor * sensor, float * data, int num_values)} */
    public static boolean nSDL_GetSensorData(long sensor, long data, int num_values) {
        long __functionAddress = Functions.GetSensorData;
        if (CHECKS) {
            check(sensor);
        }
        return invokePPZ(sensor, data, num_values, __functionAddress);
    }

    /** {@code bool SDL_GetSensorData(SDL_Sensor * sensor, float * data, int num_values)} */
    @NativeType("bool")
    public static boolean SDL_GetSensorData(@NativeType("SDL_Sensor *") long sensor, @NativeType("float *") FloatBuffer data) {
        return nSDL_GetSensorData(sensor, memAddress(data), data.remaining());
    }

    // --- [ SDL_CloseSensor ] ---

    /** {@code void SDL_CloseSensor(SDL_Sensor * sensor)} */
    public static void SDL_CloseSensor(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.CloseSensor;
        if (CHECKS) {
            check(sensor);
        }
        invokePV(sensor, __functionAddress);
    }

    // --- [ SDL_UpdateSensors ] ---

    /** {@code void SDL_UpdateSensors(void)} */
    public static void SDL_UpdateSensors() {
        long __functionAddress = Functions.UpdateSensors;
        invokeV(__functionAddress);
    }

}