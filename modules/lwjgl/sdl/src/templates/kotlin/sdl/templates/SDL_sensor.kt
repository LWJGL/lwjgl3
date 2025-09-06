/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_sensor = "SDLSensor".nativeClassSDL("SDL_sensor") {
    FloatConstant("STANDARD_GRAVITY"..9.80665f)

    EnumConstant(
        "SENSOR_INVALID".enum("-1"),
        "SENSOR_UNKNOWN".enum,
        "SENSOR_ACCEL".enum,
        "SENSOR_GYRO".enum,
        "SENSOR_ACCEL_L".enum,
        "SENSOR_GYRO_L".enum,
        "SENSOR_ACCEL_R".enum,
        "SENSOR_GYRO_R".enum,
        "SENSOR_COUNT".enum
    )

    SDL_SensorID.p(
        "GetSensors",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetSensorNameForID",

        SDL_SensorID("instance_id")
    )

    SDL_SensorType(
        "GetSensorTypeForID",

        SDL_SensorID("instance_id")
    )

    int(
        "GetSensorNonPortableTypeForID",

        SDL_SensorID("instance_id")
    )

    SDL_Sensor.p(
        "OpenSensor",

        SDL_SensorID("instance_id")
    )

    SDL_Sensor.p(
        "GetSensorFromID",

        SDL_SensorID("instance_id")
    )

    SDL_PropertiesID(
        "GetSensorProperties",

        SDL_Sensor.p("sensor")
    )

    charUTF8.const.p(
        "GetSensorName",

        SDL_Sensor.p("sensor")
    )

    SDL_SensorType(
        "GetSensorType",

        SDL_Sensor.p("sensor")
    )

    int(
        "GetSensorNonPortableType",

        SDL_Sensor.p("sensor")
    )

    SDL_SensorID(
        "GetSensorID",

        SDL_Sensor.p("sensor")
    )

    bool(
        "GetSensorData",

        SDL_Sensor.p("sensor"),
        float.p("data"),
        AutoSize("data")..int("num_values")
    )

    void(
        "CloseSensor",

        SDL_Sensor.p("sensor")
    )

    void(
        "UpdateSensors",

        void()
    )
}