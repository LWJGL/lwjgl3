/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_camera = "SDLCamera".nativeClassSDL("SDL_camera") {
    EnumConstant(
        "CAMERA_POSITION_UNKNOWN".enum("0"),
        "CAMERA_POSITION_FRONT_FACING".enum,
        "CAMERA_POSITION_BACK_FACING".enum
    )

    int(
        "GetNumCameraDrivers",

        void()
    )

    charASCII.const.p(
        "GetCameraDriver",

        int("index")
    )

    charASCII.const.p(
        "GetCurrentCameraDriver",

        void()
    )

    SDL_CameraID.p(
        "GetCameras",

        AutoSizeResult..int.p("count")
    )

    SDL_CameraSpec.p.p(
        "GetCameraSupportedFormats",

        SDL_CameraID("instance_id"),
        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetCameraName",

        SDL_CameraID("instance_id")
    )

    SDL_CameraPosition(
        "GetCameraPosition",

        SDL_CameraID("instance_id")
    )

    SDL_Camera.p(
        "OpenCamera",

        SDL_CameraID("instance_id"),
        nullable..SDL_CameraSpec.const.p("spec")
    )

    int(
        "GetCameraPermissionState",

        SDL_Camera.p("camera")
    )

    SDL_CameraID(
        "GetCameraID",

        SDL_Camera.p("camera")
    )

    SDL_PropertiesID(
        "GetCameraProperties",

        SDL_Camera.p("camera")
    )

    bool(
        "GetCameraFormat",

        SDL_Camera.p("camera"),
        SDL_CameraSpec.p("spec")
    )

    SDL_Surface.p(
        "AcquireCameraFrame",

        SDL_Camera.p("camera"),
        Check(1)..nullable..Uint64.p("timestampNS")
    )

    void(
        "ReleaseCameraFrame",

        SDL_Camera.p("camera"),
        SDL_Surface.p("frame")
    )

    void(
        "CloseCamera",

        SDL_Camera.p("camera")
    )
}