/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_hints = "SDLHints".nativeClassSDL("SDL_hints") {
    StringConstant(
        "HINT_ALLOW_ALT_TAB_WHILE_GRABBED".."SDL_ALLOW_ALT_TAB_WHILE_GRABBED",
        "HINT_ANDROID_ALLOW_RECREATE_ACTIVITY".."SDL_ANDROID_ALLOW_RECREATE_ACTIVITY",
        "HINT_ANDROID_BLOCK_ON_PAUSE".."SDL_ANDROID_BLOCK_ON_PAUSE",
        "HINT_ANDROID_LOW_LATENCY_AUDIO".."SDL_ANDROID_LOW_LATENCY_AUDIO",
        "HINT_ANDROID_TRAP_BACK_BUTTON".."SDL_ANDROID_TRAP_BACK_BUTTON",
        "HINT_APP_ID".."SDL_APP_ID",
        "HINT_APP_NAME".."SDL_APP_NAME",
        "HINT_APPLE_TV_CONTROLLER_UI_EVENTS".."SDL_APPLE_TV_CONTROLLER_UI_EVENTS",
        "HINT_APPLE_TV_REMOTE_ALLOW_ROTATION".."SDL_APPLE_TV_REMOTE_ALLOW_ROTATION",
        "HINT_AUDIO_ALSA_DEFAULT_DEVICE".."SDL_AUDIO_ALSA_DEFAULT_DEVICE",
        "HINT_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE".."SDL_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE",
        "HINT_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE".."SDL_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE",
        "HINT_AUDIO_CATEGORY".."SDL_AUDIO_CATEGORY",
        "HINT_AUDIO_CHANNELS".."SDL_AUDIO_CHANNELS",
        "HINT_AUDIO_DEVICE_APP_ICON_NAME".."SDL_AUDIO_DEVICE_APP_ICON_NAME",
        "HINT_AUDIO_DEVICE_SAMPLE_FRAMES".."SDL_AUDIO_DEVICE_SAMPLE_FRAMES",
        "HINT_AUDIO_DEVICE_STREAM_NAME".."SDL_AUDIO_DEVICE_STREAM_NAME",
        "HINT_AUDIO_DEVICE_STREAM_ROLE".."SDL_AUDIO_DEVICE_STREAM_ROLE",
        "HINT_AUDIO_DISK_INPUT_FILE".."SDL_AUDIO_DISK_INPUT_FILE",
        "HINT_AUDIO_DISK_OUTPUT_FILE".."SDL_AUDIO_DISK_OUTPUT_FILE",
        "HINT_AUDIO_DISK_TIMESCALE".."SDL_AUDIO_DISK_TIMESCALE",
        "HINT_AUDIO_DRIVER".."SDL_AUDIO_DRIVER",
        "HINT_AUDIO_DUMMY_TIMESCALE".."SDL_AUDIO_DUMMY_TIMESCALE",
        "HINT_AUDIO_FORMAT".."SDL_AUDIO_FORMAT",
        "HINT_AUDIO_FREQUENCY".."SDL_AUDIO_FREQUENCY",
        "HINT_AUDIO_INCLUDE_MONITORS".."SDL_AUDIO_INCLUDE_MONITORS",
        "HINT_AUTO_UPDATE_JOYSTICKS".."SDL_AUTO_UPDATE_JOYSTICKS",
        "HINT_AUTO_UPDATE_SENSORS".."SDL_AUTO_UPDATE_SENSORS",
        "HINT_BMP_SAVE_LEGACY_FORMAT".."SDL_BMP_SAVE_LEGACY_FORMAT",
        "HINT_CAMERA_DRIVER".."SDL_CAMERA_DRIVER",
        "HINT_CPU_FEATURE_MASK".."SDL_CPU_FEATURE_MASK",
        "HINT_JOYSTICK_DIRECTINPUT".."SDL_JOYSTICK_DIRECTINPUT",
        "HINT_FILE_DIALOG_DRIVER".."SDL_FILE_DIALOG_DRIVER",
        "HINT_DISPLAY_USABLE_BOUNDS".."SDL_DISPLAY_USABLE_BOUNDS",
        "HINT_EMSCRIPTEN_ASYNCIFY".."SDL_EMSCRIPTEN_ASYNCIFY",
        "HINT_EMSCRIPTEN_CANVAS_SELECTOR".."SDL_EMSCRIPTEN_CANVAS_SELECTOR",
        "HINT_EMSCRIPTEN_KEYBOARD_ELEMENT".."SDL_EMSCRIPTEN_KEYBOARD_ELEMENT",
        "HINT_ENABLE_SCREEN_KEYBOARD".."SDL_ENABLE_SCREEN_KEYBOARD",
        "HINT_EVDEV_DEVICES".."SDL_EVDEV_DEVICES",
        "HINT_EVENT_LOGGING".."SDL_EVENT_LOGGING",
        "HINT_FORCE_RAISEWINDOW".."SDL_FORCE_RAISEWINDOW",
        "HINT_FRAMEBUFFER_ACCELERATION".."SDL_FRAMEBUFFER_ACCELERATION",
        "HINT_GAMECONTROLLERCONFIG".."SDL_GAMECONTROLLERCONFIG",
        "HINT_GAMECONTROLLERCONFIG_FILE".."SDL_GAMECONTROLLERCONFIG_FILE",
        "HINT_GAMECONTROLLERTYPE".."SDL_GAMECONTROLLERTYPE",
        "HINT_GAMECONTROLLER_IGNORE_DEVICES".."SDL_GAMECONTROLLER_IGNORE_DEVICES",
        "HINT_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT".."SDL_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT",
        "HINT_GAMECONTROLLER_SENSOR_FUSION".."SDL_GAMECONTROLLER_SENSOR_FUSION",
        "HINT_GDK_TEXTINPUT_DEFAULT_TEXT".."SDL_GDK_TEXTINPUT_DEFAULT_TEXT",
        "HINT_GDK_TEXTINPUT_DESCRIPTION".."SDL_GDK_TEXTINPUT_DESCRIPTION",
        "HINT_GDK_TEXTINPUT_MAX_LENGTH".."SDL_GDK_TEXTINPUT_MAX_LENGTH",
        "HINT_GDK_TEXTINPUT_SCOPE".."SDL_GDK_TEXTINPUT_SCOPE",
        "HINT_GDK_TEXTINPUT_TITLE".."SDL_GDK_TEXTINPUT_TITLE",
        "HINT_HIDAPI_LIBUSB".."SDL_HIDAPI_LIBUSB",
        "HINT_HIDAPI_LIBUSB_WHITELIST".."SDL_HIDAPI_LIBUSB_WHITELIST",
        "HINT_HIDAPI_UDEV".."SDL_HIDAPI_UDEV",
        "HINT_GPU_DRIVER".."SDL_GPU_DRIVER",
        "HINT_HIDAPI_ENUMERATE_ONLY_CONTROLLERS".."SDL_HIDAPI_ENUMERATE_ONLY_CONTROLLERS",
        "HINT_HIDAPI_IGNORE_DEVICES".."SDL_HIDAPI_IGNORE_DEVICES",
        "HINT_IME_IMPLEMENTED_UI".."SDL_IME_IMPLEMENTED_UI",
        "HINT_IOS_HIDE_HOME_INDICATOR".."SDL_IOS_HIDE_HOME_INDICATOR",
        "HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS".."SDL_JOYSTICK_ALLOW_BACKGROUND_EVENTS",
        "HINT_JOYSTICK_ARCADESTICK_DEVICES".."SDL_JOYSTICK_ARCADESTICK_DEVICES",
        "HINT_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED".."SDL_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED",
        "HINT_JOYSTICK_BLACKLIST_DEVICES".."SDL_JOYSTICK_BLACKLIST_DEVICES",
        "HINT_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED".."SDL_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED",
        "HINT_JOYSTICK_DEVICE".."SDL_JOYSTICK_DEVICE",
        "HINT_JOYSTICK_ENHANCED_REPORTS".."SDL_JOYSTICK_ENHANCED_REPORTS",
        "HINT_JOYSTICK_FLIGHTSTICK_DEVICES".."SDL_JOYSTICK_FLIGHTSTICK_DEVICES",
        "HINT_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED".."SDL_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED",
        "HINT_JOYSTICK_GAMEINPUT".."SDL_JOYSTICK_GAMEINPUT",
        "HINT_JOYSTICK_GAMECUBE_DEVICES".."SDL_JOYSTICK_GAMECUBE_DEVICES",
        "HINT_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED".."SDL_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED",
        "HINT_JOYSTICK_HIDAPI".."SDL_JOYSTICK_HIDAPI",
        "HINT_JOYSTICK_HIDAPI_COMBINE_JOY_CONS".."SDL_JOYSTICK_HIDAPI_COMBINE_JOY_CONS",
        "HINT_JOYSTICK_HIDAPI_GAMECUBE".."SDL_JOYSTICK_HIDAPI_GAMECUBE",
        "HINT_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE".."SDL_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE",
        "HINT_JOYSTICK_HIDAPI_JOY_CONS".."SDL_JOYSTICK_HIDAPI_JOY_CONS",
        "HINT_JOYSTICK_HIDAPI_JOYCON_HOME_LED".."SDL_JOYSTICK_HIDAPI_JOYCON_HOME_LED",
        "HINT_JOYSTICK_HIDAPI_LUNA".."SDL_JOYSTICK_HIDAPI_LUNA",
        "HINT_JOYSTICK_HIDAPI_NINTENDO_CLASSIC".."SDL_JOYSTICK_HIDAPI_NINTENDO_CLASSIC",
        "HINT_JOYSTICK_HIDAPI_PS3".."SDL_JOYSTICK_HIDAPI_PS3",
        "HINT_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER".."SDL_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER",
        "HINT_JOYSTICK_HIDAPI_PS4".."SDL_JOYSTICK_HIDAPI_PS4",
        "HINT_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL".."SDL_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL",
        "HINT_JOYSTICK_HIDAPI_PS5".."SDL_JOYSTICK_HIDAPI_PS5",
        "HINT_JOYSTICK_HIDAPI_PS5_PLAYER_LED".."SDL_JOYSTICK_HIDAPI_PS5_PLAYER_LED",
        "HINT_JOYSTICK_HIDAPI_SHIELD".."SDL_JOYSTICK_HIDAPI_SHIELD",
        "HINT_JOYSTICK_HIDAPI_STADIA".."SDL_JOYSTICK_HIDAPI_STADIA",
        "HINT_JOYSTICK_HIDAPI_STEAM".."SDL_JOYSTICK_HIDAPI_STEAM",
        "HINT_JOYSTICK_HIDAPI_STEAM_HOME_LED".."SDL_JOYSTICK_HIDAPI_STEAM_HOME_LED",
        "HINT_JOYSTICK_HIDAPI_STEAMDECK".."SDL_JOYSTICK_HIDAPI_STEAMDECK",
        "HINT_JOYSTICK_HIDAPI_STEAM_HORI".."SDL_JOYSTICK_HIDAPI_STEAM_HORI",
        "HINT_JOYSTICK_HIDAPI_SWITCH".."SDL_JOYSTICK_HIDAPI_SWITCH",
        "HINT_JOYSTICK_HIDAPI_SWITCH_HOME_LED".."SDL_JOYSTICK_HIDAPI_SWITCH_HOME_LED",
        "HINT_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED".."SDL_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED",
        "HINT_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS".."SDL_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS",
        "HINT_JOYSTICK_HIDAPI_WII".."SDL_JOYSTICK_HIDAPI_WII",
        "HINT_JOYSTICK_HIDAPI_WII_PLAYER_LED".."SDL_JOYSTICK_HIDAPI_WII_PLAYER_LED",
        "HINT_JOYSTICK_HIDAPI_XBOX".."SDL_JOYSTICK_HIDAPI_XBOX",
        "HINT_JOYSTICK_HIDAPI_XBOX_360".."SDL_JOYSTICK_HIDAPI_XBOX_360",
        "HINT_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED".."SDL_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED",
        "HINT_JOYSTICK_HIDAPI_XBOX_360_WIRELESS".."SDL_JOYSTICK_HIDAPI_XBOX_360_WIRELESS",
        "HINT_JOYSTICK_HIDAPI_XBOX_ONE".."SDL_JOYSTICK_HIDAPI_XBOX_ONE",
        "HINT_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED".."SDL_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED",
        "HINT_JOYSTICK_IOKIT".."SDL_JOYSTICK_IOKIT",
        "HINT_JOYSTICK_LINUX_CLASSIC".."SDL_JOYSTICK_LINUX_CLASSIC",
        "HINT_JOYSTICK_LINUX_DEADZONES".."SDL_JOYSTICK_LINUX_DEADZONES",
        "HINT_JOYSTICK_LINUX_DIGITAL_HATS".."SDL_JOYSTICK_LINUX_DIGITAL_HATS",
        "HINT_JOYSTICK_LINUX_HAT_DEADZONES".."SDL_JOYSTICK_LINUX_HAT_DEADZONES",
        "HINT_JOYSTICK_MFI".."SDL_JOYSTICK_MFI",
        "HINT_JOYSTICK_RAWINPUT".."SDL_JOYSTICK_RAWINPUT",
        "HINT_JOYSTICK_RAWINPUT_CORRELATE_XINPUT".."SDL_JOYSTICK_RAWINPUT_CORRELATE_XINPUT",
        "HINT_JOYSTICK_ROG_CHAKRAM".."SDL_JOYSTICK_ROG_CHAKRAM",
        "HINT_JOYSTICK_THREAD".."SDL_JOYSTICK_THREAD",
        "HINT_JOYSTICK_THROTTLE_DEVICES".."SDL_JOYSTICK_THROTTLE_DEVICES",
        "HINT_JOYSTICK_THROTTLE_DEVICES_EXCLUDED".."SDL_JOYSTICK_THROTTLE_DEVICES_EXCLUDED",
        "HINT_JOYSTICK_WGI".."SDL_JOYSTICK_WGI",
        "HINT_JOYSTICK_WHEEL_DEVICES".."SDL_JOYSTICK_WHEEL_DEVICES",
        "HINT_JOYSTICK_WHEEL_DEVICES_EXCLUDED".."SDL_JOYSTICK_WHEEL_DEVICES_EXCLUDED",
        "HINT_JOYSTICK_ZERO_CENTERED_DEVICES".."SDL_JOYSTICK_ZERO_CENTERED_DEVICES",
        "HINT_JOYSTICK_HAPTIC_AXES".."SDL_JOYSTICK_HAPTIC_AXES",
        "HINT_KEYCODE_OPTIONS".."SDL_KEYCODE_OPTIONS",
        "HINT_KMSDRM_DEVICE_INDEX".."SDL_KMSDRM_DEVICE_INDEX",
        "HINT_KMSDRM_REQUIRE_DRM_MASTER".."SDL_KMSDRM_REQUIRE_DRM_MASTER",
        "HINT_LOGGING".."SDL_LOGGING",
        "HINT_MAC_BACKGROUND_APP".."SDL_MAC_BACKGROUND_APP",
        "HINT_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK".."SDL_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK",
        "HINT_MAC_OPENGL_ASYNC_DISPATCH".."SDL_MAC_OPENGL_ASYNC_DISPATCH",
        "HINT_MAC_OPTION_AS_ALT".."SDL_MAC_OPTION_AS_ALT",
        "HINT_MAC_SCROLL_MOMENTUM".."SDL_MAC_SCROLL_MOMENTUM",
        "HINT_MAIN_CALLBACK_RATE".."SDL_MAIN_CALLBACK_RATE",
        "HINT_MOUSE_AUTO_CAPTURE".."SDL_MOUSE_AUTO_CAPTURE",
        "HINT_MOUSE_DOUBLE_CLICK_RADIUS".."SDL_MOUSE_DOUBLE_CLICK_RADIUS",
        "HINT_MOUSE_DOUBLE_CLICK_TIME".."SDL_MOUSE_DOUBLE_CLICK_TIME",
        "HINT_MOUSE_DEFAULT_SYSTEM_CURSOR".."SDL_MOUSE_DEFAULT_SYSTEM_CURSOR",
        "HINT_MOUSE_EMULATE_WARP_WITH_RELATIVE".."SDL_MOUSE_EMULATE_WARP_WITH_RELATIVE",
        "HINT_MOUSE_FOCUS_CLICKTHROUGH".."SDL_MOUSE_FOCUS_CLICKTHROUGH",
        "HINT_MOUSE_NORMAL_SPEED_SCALE".."SDL_MOUSE_NORMAL_SPEED_SCALE",
        "HINT_MOUSE_RELATIVE_MODE_CENTER".."SDL_MOUSE_RELATIVE_MODE_CENTER",
        "HINT_MOUSE_RELATIVE_SPEED_SCALE".."SDL_MOUSE_RELATIVE_SPEED_SCALE",
        "HINT_MOUSE_RELATIVE_SYSTEM_SCALE".."SDL_MOUSE_RELATIVE_SYSTEM_SCALE",
        "HINT_MOUSE_RELATIVE_WARP_MOTION".."SDL_MOUSE_RELATIVE_WARP_MOTION",
        "HINT_MOUSE_RELATIVE_CURSOR_VISIBLE".."SDL_MOUSE_RELATIVE_CURSOR_VISIBLE",
        "HINT_MOUSE_TOUCH_EVENTS".."SDL_MOUSE_TOUCH_EVENTS",
        "HINT_MUTE_CONSOLE_KEYBOARD".."SDL_MUTE_CONSOLE_KEYBOARD",
        "HINT_NO_SIGNAL_HANDLERS".."SDL_NO_SIGNAL_HANDLERS",
        "HINT_OPENGL_LIBRARY".."SDL_OPENGL_LIBRARY",
        "HINT_EGL_LIBRARY".."SDL_EGL_LIBRARY",
        "HINT_OPENGL_ES_DRIVER".."SDL_OPENGL_ES_DRIVER",
        "HINT_OPENVR_LIBRARY".."SDL_OPENVR_LIBRARY",
        "HINT_ORIENTATIONS".."SDL_ORIENTATIONS",
        "HINT_POLL_SENTINEL".."SDL_POLL_SENTINEL",
        "HINT_PREFERRED_LOCALES".."SDL_PREFERRED_LOCALES",
        "HINT_QUIT_ON_LAST_WINDOW_CLOSE".."SDL_QUIT_ON_LAST_WINDOW_CLOSE",
        "HINT_RENDER_DIRECT3D_THREADSAFE".."SDL_RENDER_DIRECT3D_THREADSAFE",
        "HINT_RENDER_DIRECT3D11_DEBUG".."SDL_RENDER_DIRECT3D11_DEBUG",
        "HINT_RENDER_VULKAN_DEBUG".."SDL_RENDER_VULKAN_DEBUG",
        "HINT_RENDER_GPU_DEBUG".."SDL_RENDER_GPU_DEBUG",
        "HINT_RENDER_GPU_LOW_POWER".."SDL_RENDER_GPU_LOW_POWER",
        "HINT_RENDER_DRIVER".."SDL_RENDER_DRIVER",
        "HINT_RENDER_LINE_METHOD".."SDL_RENDER_LINE_METHOD",
        "HINT_RENDER_METAL_PREFER_LOW_POWER_DEVICE".."SDL_RENDER_METAL_PREFER_LOW_POWER_DEVICE",
        "HINT_RENDER_VSYNC".."SDL_RENDER_VSYNC",
        "HINT_RETURN_KEY_HIDES_IME".."SDL_RETURN_KEY_HIDES_IME",
        "HINT_ROG_GAMEPAD_MICE".."SDL_ROG_GAMEPAD_MICE",
        "HINT_ROG_GAMEPAD_MICE_EXCLUDED".."SDL_ROG_GAMEPAD_MICE_EXCLUDED",
        "HINT_RPI_VIDEO_LAYER".."SDL_RPI_VIDEO_LAYER",
        "HINT_SCREENSAVER_INHIBIT_ACTIVITY_NAME".."SDL_SCREENSAVER_INHIBIT_ACTIVITY_NAME",
        "HINT_SHUTDOWN_DBUS_ON_QUIT".."SDL_SHUTDOWN_DBUS_ON_QUIT",
        "HINT_STORAGE_TITLE_DRIVER".."SDL_STORAGE_TITLE_DRIVER",
        "HINT_STORAGE_USER_DRIVER".."SDL_STORAGE_USER_DRIVER",
        "HINT_THREAD_FORCE_REALTIME_TIME_CRITICAL".."SDL_THREAD_FORCE_REALTIME_TIME_CRITICAL",
        "HINT_THREAD_PRIORITY_POLICY".."SDL_THREAD_PRIORITY_POLICY",
        "HINT_TIMER_RESOLUTION".."SDL_TIMER_RESOLUTION",
        "HINT_TOUCH_MOUSE_EVENTS".."SDL_TOUCH_MOUSE_EVENTS",
        "HINT_TRACKPAD_IS_TOUCH_ONLY".."SDL_TRACKPAD_IS_TOUCH_ONLY",
        "HINT_TV_REMOTE_AS_JOYSTICK".."SDL_TV_REMOTE_AS_JOYSTICK",
        "HINT_VIDEO_ALLOW_SCREENSAVER".."SDL_VIDEO_ALLOW_SCREENSAVER",
        "HINT_VIDEO_DISPLAY_PRIORITY".."SDL_VIDEO_DISPLAY_PRIORITY",
        "HINT_VIDEO_DOUBLE_BUFFER".."SDL_VIDEO_DOUBLE_BUFFER",
        "HINT_VIDEO_DRIVER".."SDL_VIDEO_DRIVER",
        "HINT_VIDEO_DUMMY_SAVE_FRAMES".."SDL_VIDEO_DUMMY_SAVE_FRAMES",
        "HINT_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK".."SDL_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK",
        "HINT_VIDEO_FORCE_EGL".."SDL_VIDEO_FORCE_EGL",
        "HINT_VIDEO_MAC_FULLSCREEN_SPACES".."SDL_VIDEO_MAC_FULLSCREEN_SPACES",
        "HINT_VIDEO_MAC_FULLSCREEN_MENU_VISIBILITY".."SDL_VIDEO_MAC_FULLSCREEN_MENU_VISIBILITY",
        "HINT_VIDEO_MINIMIZE_ON_FOCUS_LOSS".."SDL_VIDEO_MINIMIZE_ON_FOCUS_LOSS",
        "HINT_VIDEO_OFFSCREEN_SAVE_FRAMES".."SDL_VIDEO_OFFSCREEN_SAVE_FRAMES",
        "HINT_VIDEO_SYNC_WINDOW_OPERATIONS".."SDL_VIDEO_SYNC_WINDOW_OPERATIONS",
        "HINT_VIDEO_WAYLAND_ALLOW_LIBDECOR".."SDL_VIDEO_WAYLAND_ALLOW_LIBDECOR",
        "HINT_VIDEO_WAYLAND_MODE_EMULATION".."SDL_VIDEO_WAYLAND_MODE_EMULATION",
        "HINT_VIDEO_WAYLAND_MODE_SCALING".."SDL_VIDEO_WAYLAND_MODE_SCALING",
        "HINT_VIDEO_WAYLAND_PREFER_LIBDECOR".."SDL_VIDEO_WAYLAND_PREFER_LIBDECOR",
        "HINT_VIDEO_WAYLAND_SCALE_TO_DISPLAY".."SDL_VIDEO_WAYLAND_SCALE_TO_DISPLAY",
        "HINT_VIDEO_WIN_D3DCOMPILER".."SDL_VIDEO_WIN_D3DCOMPILER",
        "HINT_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR".."SDL_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR",
        "HINT_VIDEO_X11_NET_WM_PING".."SDL_VIDEO_X11_NET_WM_PING",
        "HINT_VIDEO_X11_NODIRECTCOLOR".."SDL_VIDEO_X11_NODIRECTCOLOR",
        "HINT_VIDEO_X11_SCALING_FACTOR".."SDL_VIDEO_X11_SCALING_FACTOR",
        "HINT_VIDEO_X11_VISUALID".."SDL_VIDEO_X11_VISUALID",
        "HINT_VIDEO_X11_WINDOW_VISUALID".."SDL_VIDEO_X11_WINDOW_VISUALID",
        "HINT_VIDEO_X11_XRANDR".."SDL_VIDEO_X11_XRANDR",
        "HINT_VITA_ENABLE_BACK_TOUCH".."SDL_VITA_ENABLE_BACK_TOUCH",
        "HINT_VITA_ENABLE_FRONT_TOUCH".."SDL_VITA_ENABLE_FRONT_TOUCH",
        "HINT_VITA_MODULE_PATH".."SDL_VITA_MODULE_PATH",
        "HINT_VITA_PVR_INIT".."SDL_VITA_PVR_INIT",
        "HINT_VITA_RESOLUTION".."SDL_VITA_RESOLUTION",
        "HINT_VITA_PVR_OPENGL".."SDL_VITA_PVR_OPENGL",
        "HINT_VITA_TOUCH_MOUSE_DEVICE".."SDL_VITA_TOUCH_MOUSE_DEVICE",
        "HINT_VULKAN_DISPLAY".."SDL_VULKAN_DISPLAY",
        "HINT_VULKAN_LIBRARY".."SDL_VULKAN_LIBRARY",
        "HINT_WAVE_FACT_CHUNK".."SDL_WAVE_FACT_CHUNK",
        "HINT_WAVE_CHUNK_LIMIT".."SDL_WAVE_CHUNK_LIMIT",
        "HINT_WAVE_RIFF_CHUNK_SIZE".."SDL_WAVE_RIFF_CHUNK_SIZE",
        "HINT_WAVE_TRUNCATION".."SDL_WAVE_TRUNCATION",
        "HINT_WINDOW_ACTIVATE_WHEN_RAISED".."SDL_WINDOW_ACTIVATE_WHEN_RAISED",
        "HINT_WINDOW_ACTIVATE_WHEN_SHOWN".."SDL_WINDOW_ACTIVATE_WHEN_SHOWN",
        "HINT_WINDOW_ALLOW_TOPMOST".."SDL_WINDOW_ALLOW_TOPMOST",
        "HINT_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN".."SDL_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN",
        "HINT_WINDOWS_CLOSE_ON_ALT_F4".."SDL_WINDOWS_CLOSE_ON_ALT_F4",
        "HINT_WINDOWS_ENABLE_MENU_MNEMONICS".."SDL_WINDOWS_ENABLE_MENU_MNEMONICS",
        "HINT_WINDOWS_ENABLE_MESSAGELOOP".."SDL_WINDOWS_ENABLE_MESSAGELOOP",
        "HINT_WINDOWS_GAMEINPUT".."SDL_WINDOWS_GAMEINPUT",
        "HINT_WINDOWS_RAW_KEYBOARD".."SDL_WINDOWS_RAW_KEYBOARD",
        "HINT_WINDOWS_FORCE_SEMAPHORE_KERNEL".."SDL_WINDOWS_FORCE_SEMAPHORE_KERNEL",
        "HINT_WINDOWS_INTRESOURCE_ICON".."SDL_WINDOWS_INTRESOURCE_ICON",
        "HINT_WINDOWS_INTRESOURCE_ICON_SMALL".."SDL_WINDOWS_INTRESOURCE_ICON_SMALL",
        "HINT_WINDOWS_USE_D3D9EX".."SDL_WINDOWS_USE_D3D9EX",
        "HINT_WINDOWS_ERASE_BACKGROUND_MODE".."SDL_WINDOWS_ERASE_BACKGROUND_MODE",
        "HINT_X11_FORCE_OVERRIDE_REDIRECT".."SDL_X11_FORCE_OVERRIDE_REDIRECT",
        "HINT_X11_WINDOW_TYPE".."SDL_X11_WINDOW_TYPE",
        "HINT_X11_XCB_LIBRARY".."SDL_X11_XCB_LIBRARY",
        "HINT_XINPUT_ENABLED".."SDL_XINPUT_ENABLED",
        "HINT_ASSERT".."SDL_ASSERT",
        "HINT_PEN_MOUSE_EVENTS".."SDL_PEN_MOUSE_EVENTS",
        "HINT_PEN_TOUCH_EVENTS".."SDL_PEN_TOUCH_EVENTS"
    )

    EnumConstant(
        "HINT_DEFAULT".enum("0"),
        "HINT_NORMAL".enum,
        "HINT_OVERRIDE".enum
    )

    bool(
        "SetHintWithPriority",

        charASCII.const.p("name"),
        nullable..charUTF8.const.p("value"),
        SDL_HintPriority("priority")
    )

    bool(
        "SetHint",

        charASCII.const.p("name"),
        nullable..charUTF8.const.p("value")
    )

    bool(
        "ResetHint",

        charASCII.const.p("name")
    )

    void(
        "ResetHints",

        void()
    )

    charUTF8.const.p(
        "GetHint",

        charASCII.const.p("name")
    )

    bool(
        "GetHintBoolean",

        charASCII.const.p("name"),
        bool("default_value")
    )

    bool(
        "AddHintCallback",

        charASCII.const.p("name"),
        SDL_HintCallback("callback"),
        nullable..opaque_p("userdata")
    )

    void(
        "RemoveHintCallback",

        charASCII.const.p("name"),
        SDL_HintCallback("callback"),
        nullable..opaque_p("userdata")
    )
}