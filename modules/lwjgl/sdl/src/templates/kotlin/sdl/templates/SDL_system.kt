/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_system = "SDLSystem".nativeClassSDL("SDL_system") {
    /*IntConstant(
        "ANDROID_EXTERNAL_STORAGE_READ".."0x01",
        "ANDROID_EXTERNAL_STORAGE_WRITE".."0x02"
    )*/

    EnumConstant(
        "SANDBOX_NONE".enum("0"),
        "SANDBOX_UNKNOWN_CONTAINER".enum,
        "SANDBOX_FLATPAK".enum,
        "SANDBOX_SNAP".enum,
        "SANDBOX_MACOS".enum
    )

    IgnoreMissing..void(
        "SetWindowsMessageHook",

        nullable..SDL_WindowsMessageHook("callback"),
        nullable..opaque_p("userdata")
    )

    IgnoreMissing..int(
        "GetDirect3D9AdapterIndex",

        SDL_DisplayID("displayID")
    )

    IgnoreMissing..bool(
        "GetDXGIOutputInfo",

        SDL_DisplayID("displayID"),
        Check(1)..int.p("adapterIndex"),
        Check(1)..int.p("outputIndex")
    )

    IgnoreMissing..void(
        "SetX11EventHook",

        nullable..SDL_X11EventHook("callback"),
        nullable..opaque_p("userdata")
    )

    IgnoreMissing..bool(
        "SetLinuxThreadPriority",

        Sint64("threadID"),
        int("priority")
    )

    IgnoreMissing..bool(
        "SetLinuxThreadPriorityAndPolicy",

        Sint64("threadID"),
        int("sdlPriority"),
        int("schedPolicy")
    )

    /*IgnoreMissing..bool(
        "SetiOSAnimationCallback",

        SDL_Window.p("window"),
        int("interval"),
        nullable..SDL_iOSAnimationCallback("callback"),
        nullable..opaque_p("callbackParam")
    )

    IgnoreMissing..void(
        "SetiOSEventPump",

        bool("enabled")
    )*/

    /*IgnoreMissing..opaque_p(
        "GetAndroidJNIEnv",

        void()
    )

    IgnoreMissing..opaque_p(
        "GetAndroidActivity",

        void()
    )

    IgnoreMissing..int(
        "GetAndroidSDKVersion",

        void()
    )

    IgnoreMissing..bool(
        "IsChromebook",

        void()
    )

    IgnoreMissing..bool(
        "IsDeXMode",

        void()
    )

    IgnoreMissing..void(
        "SendAndroidBackButton",

        void()
    )

    IgnoreMissing..charUTF8.const.p(
        "GetAndroidInternalStoragePath",

        void()
    )

    IgnoreMissing..Uint32(
        "GetAndroidExternalStorageState",

        void()
    )

    IgnoreMissing..charUTF8.const.p(
        "GetAndroidExternalStoragePath",

        void()
    )

    IgnoreMissing..charUTF8.const.p(
        "GetAndroidCachePath",

        void()
    )

    IgnoreMissing..bool(
        "RequestAndroidPermission",

        charUTF8.const.p("permission"),
        SDL_RequestAndroidPermissionCallback("cb"),
        nullable..opaque_p("userdata")
    )

    IgnoreMissing..bool(
        "ShowAndroidToast",

        charUTF8.const.p("message"),
        int("duration"),
        int("gravity"),
        int("xoffset"),
        int("yoffset")
    )

    IgnoreMissing..bool(
        "SendAndroidMessage",

        Uint32("command"),
        int("param")
    )*/

    bool("IsTablet", void())
    bool("IsTV", void())

    SDL_Sandbox(
        "GetSandbox",

        void()
    )

    /*void("OnApplicationWillTerminate", void())
    void("OnApplicationDidReceiveMemoryWarning", void())
    void("OnApplicationWillEnterBackground", void())
    void("OnApplicationDidEnterBackground", void())
    void("OnApplicationWillEnterForeground", void())
    void("OnApplicationDidEnterForeground", void())
    void("OnApplicationDidChangeStatusBarOrientation", void())*/

    /*IgnoreMissing..bool(
        "GetGDKTaskQueue",

        Check(1)..XTaskQueueHandle.p("outTaskQueue")
    )

    IgnoreMissing..bool(
        "GetGDKDefaultUser",

        Check(1)..XUserHandle.p("outUserHandle")
    )*/
}