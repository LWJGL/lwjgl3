/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*

val GLFW = "GLFW".nativeClass(Module.GLFW, prefix = "GLFW", binding = GLFW_BINDING) {
    IntConstant(
        "VERSION_MAJOR".."3",
        "VERSION_MINOR".."4",
        "VERSION_REVISION".."0"
    )

    IntConstant(
        "TRUE".."1",
        "FALSE".."0"
    )

    IntConstant(
        "RELEASE".."0",
        "PRESS".."1",
        "REPEAT".."2"
    )

    IntConstant(
        "HAT_CENTERED".."0",
        "HAT_UP".."1",
        "HAT_RIGHT".."2",
        "HAT_DOWN".."4",
        "HAT_LEFT".."8",
        "HAT_RIGHT_UP".."(GLFW_HAT_RIGHT | GLFW_HAT_UP)",
        "HAT_RIGHT_DOWN".."(GLFW_HAT_RIGHT | GLFW_HAT_DOWN)",
        "HAT_LEFT_UP".."(GLFW_HAT_LEFT  | GLFW_HAT_UP)",
        "HAT_LEFT_DOWN".."(GLFW_HAT_LEFT  | GLFW_HAT_DOWN)"
    )

    IntConstant(
        "KEY_UNKNOWN".."-1"
    )

    IntConstant(
        "KEY_SPACE".."32",
        "KEY_APOSTROPHE".."39",
        "KEY_COMMA".."44",
        "KEY_MINUS".."45",
        "KEY_PERIOD".."46",
        "KEY_SLASH".."47",
        "KEY_0".."48",
        "KEY_1".."49",
        "KEY_2".."50",
        "KEY_3".."51",
        "KEY_4".."52",
        "KEY_5".."53",
        "KEY_6".."54",
        "KEY_7".."55",
        "KEY_8".."56",
        "KEY_9".."57",
        "KEY_SEMICOLON".."59",
        "KEY_EQUAL".."61",
        "KEY_A".."65",
        "KEY_B".."66",
        "KEY_C".."67",
        "KEY_D".."68",
        "KEY_E".."69",
        "KEY_F".."70",
        "KEY_G".."71",
        "KEY_H".."72",
        "KEY_I".."73",
        "KEY_J".."74",
        "KEY_K".."75",
        "KEY_L".."76",
        "KEY_M".."77",
        "KEY_N".."78",
        "KEY_O".."79",
        "KEY_P".."80",
        "KEY_Q".."81",
        "KEY_R".."82",
        "KEY_S".."83",
        "KEY_T".."84",
        "KEY_U".."85",
        "KEY_V".."86",
        "KEY_W".."87",
        "KEY_X".."88",
        "KEY_Y".."89",
        "KEY_Z".."90",
        "KEY_LEFT_BRACKET".."91",
        "KEY_BACKSLASH".."92",
        "KEY_RIGHT_BRACKET".."93",
        "KEY_GRAVE_ACCENT".."96",
        "KEY_WORLD_1".."161",
        "KEY_WORLD_2".."162"
    )

    IntConstant(
        "KEY_ESCAPE".."256",
        "KEY_ENTER".."257",
        "KEY_TAB".."258",
        "KEY_BACKSPACE".."259",
        "KEY_INSERT".."260",
        "KEY_DELETE".."261",
        "KEY_RIGHT".."262",
        "KEY_LEFT".."263",
        "KEY_DOWN".."264",
        "KEY_UP".."265",
        "KEY_PAGE_UP".."266",
        "KEY_PAGE_DOWN".."267",
        "KEY_HOME".."268",
        "KEY_END".."269",
        "KEY_CAPS_LOCK".."280",
        "KEY_SCROLL_LOCK".."281",
        "KEY_NUM_LOCK".."282",
        "KEY_PRINT_SCREEN".."283",
        "KEY_PAUSE".."284",
        "KEY_F1".."290",
        "KEY_F2".."291",
        "KEY_F3".."292",
        "KEY_F4".."293",
        "KEY_F5".."294",
        "KEY_F6".."295",
        "KEY_F7".."296",
        "KEY_F8".."297",
        "KEY_F9".."298",
        "KEY_F10".."299",
        "KEY_F11".."300",
        "KEY_F12".."301",
        "KEY_F13".."302",
        "KEY_F14".."303",
        "KEY_F15".."304",
        "KEY_F16".."305",
        "KEY_F17".."306",
        "KEY_F18".."307",
        "KEY_F19".."308",
        "KEY_F20".."309",
        "KEY_F21".."310",
        "KEY_F22".."311",
        "KEY_F23".."312",
        "KEY_F24".."313",
        "KEY_F25".."314",
        "KEY_KP_0".."320",
        "KEY_KP_1".."321",
        "KEY_KP_2".."322",
        "KEY_KP_3".."323",
        "KEY_KP_4".."324",
        "KEY_KP_5".."325",
        "KEY_KP_6".."326",
        "KEY_KP_7".."327",
        "KEY_KP_8".."328",
        "KEY_KP_9".."329",
        "KEY_KP_DECIMAL".."330",
        "KEY_KP_DIVIDE".."331",
        "KEY_KP_MULTIPLY".."332",
        "KEY_KP_SUBTRACT".."333",
        "KEY_KP_ADD".."334",
        "KEY_KP_ENTER".."335",
        "KEY_KP_EQUAL".."336",
        "KEY_LEFT_SHIFT".."340",
        "KEY_LEFT_CONTROL".."341",
        "KEY_LEFT_ALT".."342",
        "KEY_LEFT_SUPER".."343",
        "KEY_RIGHT_SHIFT".."344",
        "KEY_RIGHT_CONTROL".."345",
        "KEY_RIGHT_ALT".."346",
        "KEY_RIGHT_SUPER".."347",
        "KEY_MENU".."348",
        "KEY_LAST".."GLFW_KEY_MENU"
    )

    IntConstant(
        "MOD_SHIFT"..0x0001,
        "MOD_CONTROL"..0x0002,
        "MOD_ALT"..0x0004,
        "MOD_SUPER"..0x0008,
        "MOD_CAPS_LOCK"..0x0010,
        "MOD_NUM_LOCK"..0x0020
    )

    IntConstant(
        "MOUSE_BUTTON_1".."0",
        "MOUSE_BUTTON_2".."1",
        "MOUSE_BUTTON_3".."2",
        "MOUSE_BUTTON_4".."3",
        "MOUSE_BUTTON_5".."4",
        "MOUSE_BUTTON_6".."5",
        "MOUSE_BUTTON_7".."6",
        "MOUSE_BUTTON_8".."7",
        "MOUSE_BUTTON_LAST".."GLFW_MOUSE_BUTTON_8",
        "MOUSE_BUTTON_LEFT".."GLFW_MOUSE_BUTTON_1",
        "MOUSE_BUTTON_RIGHT".."GLFW_MOUSE_BUTTON_2",
        "MOUSE_BUTTON_MIDDLE".."GLFW_MOUSE_BUTTON_3"
    )

    IntConstant(
        "JOYSTICK_1".."0",
        "JOYSTICK_2".."1",
        "JOYSTICK_3".."2",
        "JOYSTICK_4".."3",
        "JOYSTICK_5".."4",
        "JOYSTICK_6".."5",
        "JOYSTICK_7".."6",
        "JOYSTICK_8".."7",
        "JOYSTICK_9".."8",
        "JOYSTICK_10".."9",
        "JOYSTICK_11".."10",
        "JOYSTICK_12".."11",
        "JOYSTICK_13".."12",
        "JOYSTICK_14".."13",
        "JOYSTICK_15".."14",
        "JOYSTICK_16".."15",
        "JOYSTICK_LAST".."GLFW_JOYSTICK_16"
    )

    IntConstant(
        "GAMEPAD_BUTTON_A".."0",
        "GAMEPAD_BUTTON_B".."1",
        "GAMEPAD_BUTTON_X".."2",
        "GAMEPAD_BUTTON_Y".."3",
        "GAMEPAD_BUTTON_LEFT_BUMPER".."4",
        "GAMEPAD_BUTTON_RIGHT_BUMPER".."5",
        "GAMEPAD_BUTTON_BACK".."6",
        "GAMEPAD_BUTTON_START".."7",
        "GAMEPAD_BUTTON_GUIDE".."8",
        "GAMEPAD_BUTTON_LEFT_THUMB".."9",
        "GAMEPAD_BUTTON_RIGHT_THUMB".."10",
        "GAMEPAD_BUTTON_DPAD_UP".."11",
        "GAMEPAD_BUTTON_DPAD_RIGHT".."12",
        "GAMEPAD_BUTTON_DPAD_DOWN".."13",
        "GAMEPAD_BUTTON_DPAD_LEFT".."14",
        "GAMEPAD_BUTTON_LAST".."GLFW_GAMEPAD_BUTTON_DPAD_LEFT",
        "GAMEPAD_BUTTON_CROSS".."GLFW_GAMEPAD_BUTTON_A",
        "GAMEPAD_BUTTON_CIRCLE".."GLFW_GAMEPAD_BUTTON_B",
        "GAMEPAD_BUTTON_SQUARE".."GLFW_GAMEPAD_BUTTON_X",
        "GAMEPAD_BUTTON_TRIANGLE".."GLFW_GAMEPAD_BUTTON_Y"
    )

    IntConstant(
        "GAMEPAD_AXIS_LEFT_X".."0",
        "GAMEPAD_AXIS_LEFT_Y".."1",
        "GAMEPAD_AXIS_RIGHT_X".."2",
        "GAMEPAD_AXIS_RIGHT_Y".."3",
        "GAMEPAD_AXIS_LEFT_TRIGGER".."4",
        "GAMEPAD_AXIS_RIGHT_TRIGGER".."5",
        "GAMEPAD_AXIS_LAST".."GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER"
    )

    EnumConstant(
        "NO_ERROR".enum("0"),
        "NOT_INITIALIZED".enum(0x00010001),
        "NO_CURRENT_CONTEXT".enum(0x00010002),
        "INVALID_ENUM".enum(0x00010003),
        "INVALID_VALUE".enum(0x00010004),
        "OUT_OF_MEMORY".enum(0x00010005),
        "API_UNAVAILABLE".enum(0x00010006),
        "VERSION_UNAVAILABLE".enum(0x00010007),
        "PLATFORM_ERROR".enum(0x00010008),
        "FORMAT_UNAVAILABLE".enum(0x00010009),
        "NO_WINDOW_CONTEXT".enum(0x0001000A),
        "CURSOR_UNAVAILABLE".enum(0x0001000B),
        "FEATURE_UNAVAILABLE".enum(0x0001000C),
        "FEATURE_UNIMPLEMENTED".enum(0x0001000D),
        "PLATFORM_UNAVAILABLE".enum(0x0001000E)
    )

    EnumConstant(
        "FOCUSED".enum(0x00020001),
        "ICONIFIED".enum(0x00020002),
        "RESIZABLE".enum(0x00020003),
        "VISIBLE".enum(0x00020004),
        "DECORATED".enum(0x00020005),
        "AUTO_ICONIFY".enum(0x00020006),
        "FLOATING".enum(0x00020007),
        "MAXIMIZED".enum(0x00020008),
        "CENTER_CURSOR".enum(0x00020009),
        "TRANSPARENT_FRAMEBUFFER".enum(0x0002000A),
        "HOVERED".enum(0x0002000B),
        "FOCUS_ON_SHOW".enum(0x0002000C),
        "MOUSE_PASSTHROUGH".enum(0x0002000D),
        "POSITION_X".enum(0x0002000E),
        "POSITION_Y".enum(0x0002000F),
        "SOFT_FULLSCREEN".enum(0x00020010)
    )

    IntConstant(
        "CURSOR"..0x00033001,
        "STICKY_KEYS"..0x00033002,
        "STICKY_MOUSE_BUTTONS"..0x00033003,
        "LOCK_KEY_MODS"..0x00033004,
        "RAW_MOUSE_MOTION"..0x00033005,
        "UNLIMITED_MOUSE_BUTTONS"..0x00033006,
        "IME"..0x00033007
    )

    IntConstant(
        "CURSOR_NORMAL"..0x00034001,
        "CURSOR_HIDDEN"..0x00034002,
        "CURSOR_DISABLED"..0x00034003,
        "CURSOR_CAPTURED"..0x00034004
    )

    IntConstant(
        "ARROW_CURSOR"..0x00036001,
        "IBEAM_CURSOR"..0x00036002,
        "CROSSHAIR_CURSOR"..0x00036003,
        "POINTING_HAND_CURSOR"..0x00036004,
        "RESIZE_EW_CURSOR"..0x00036005,
        "RESIZE_NS_CURSOR"..0x00036006,
        "RESIZE_NWSE_CURSOR"..0x00036007,
        "RESIZE_NESW_CURSOR"..0x00036008,
        "RESIZE_ALL_CURSOR"..0x00036009,
        "NOT_ALLOWED_CURSOR"..0x0003600A,
        "HRESIZE_CURSOR".."GLFW_RESIZE_EW_CURSOR",
        "VRESIZE_CURSOR".."GLFW_RESIZE_NS_CURSOR",
        "HAND_CURSOR".."GLFW_POINTING_HAND_CURSOR"
    )

    IntConstant(
        "CONNECTED"..0x00040001,
        "DISCONNECTED"..0x00040002
    )

    IntConstant(
        "JOYSTICK_HAT_BUTTONS"..0x00050001
    )

    IntConstant(
        "ANGLE_PLATFORM_TYPE"..0x00050002
    )

    IntConstant(
        "ANY_POSITION"..0x80000000.i
    )

    IntConstant(
        "PLATFORM"..0x00050003
    )

    IntConstant(
        "MANAGE_PREEDIT_CANDIDATE"..0x00050004
    )

    IntConstant(
        "COCOA_CHDIR_RESOURCES"..0x00051001,
        "COCOA_MENUBAR"..0x00051002
    )

    IntConstant(
        "X11_XCB_VULKAN_SURFACE"..0x00052001,
        "X11_ONTHESPOT"..0x00052002
    )

    IntConstant(
        "WAYLAND_LIBDECOR"..0x00053001
    )

    IntConstant(
        "ANY_PLATFORM"..0x00060000,
        "PLATFORM_WIN32"..0x00060001,
        "PLATFORM_COCOA"..0x00060002,
        "PLATFORM_WAYLAND"..0x00060003,
        "PLATFORM_X11"..0x00060004,
        "PLATFORM_NULL"..0x00060005
    )

    IntConstant(
        "DONT_CARE".."-1"
    )

    // [ OpenGL ]

    IntConstant(
        "RED_BITS"..0x00021001,
        "GREEN_BITS"..0x00021002,
        "BLUE_BITS"..0x00021003,
        "ALPHA_BITS"..0x00021004,
        "DEPTH_BITS"..0x00021005,
        "STENCIL_BITS"..0x00021006,
        "ACCUM_RED_BITS"..0x00021007,
        "ACCUM_GREEN_BITS"..0x00021008,
        "ACCUM_BLUE_BITS"..0x00021009,
        "ACCUM_ALPHA_BITS"..0x0002100A,
        "AUX_BUFFERS"..0x0002100B,
        "STEREO"..0x0002100C,
        "SAMPLES"..0x0002100D,
        "SRGB_CAPABLE"..0x0002100E,
        "REFRESH_RATE"..0x0002100F,
        "DOUBLEBUFFER"..0x00021010
    )

    EnumConstant(
        "CLIENT_API".enum(0x00022001),
        "CONTEXT_VERSION_MAJOR".enum(0x00022002),
        "CONTEXT_VERSION_MINOR".enum(0x00022003),
        "CONTEXT_REVISION".enum(0x00022004),
        "CONTEXT_ROBUSTNESS".enum(0x00022005),
        "OPENGL_FORWARD_COMPAT".enum(0x00022006),
        "CONTEXT_DEBUG".enum(0x00022007),
        "OPENGL_DEBUG_CONTEXT".enum("GLFW_CONTEXT_DEBUG"),
        "OPENGL_PROFILE".enum(0x00022008),
        "CONTEXT_RELEASE_BEHAVIOR".enum(0x00022009),
        "CONTEXT_NO_ERROR".enum(0x0002200A),
        "CONTEXT_CREATION_API".enum(0x0002200B),
        "SCALE_TO_MONITOR".enum(0x0002200C),
        "SCALE_FRAMEBUFFER".enum(0x0002200D)
    )

    IntConstant(
        "COCOA_RETINA_FRAMEBUFFER"..0x00023001,
        "COCOA_FRAME_NAME"..0x00023002,
        "COCOA_GRAPHICS_SWITCHING"..0x00023003
    )

    IntConstant(
        "X11_CLASS_NAME"..0x00024001,
        "X11_INSTANCE_NAME"..0x00024002
    )

    IntConstant(
        "WIN32_KEYBOARD_MENU"..0x00025001
    )

    IntConstant(
        "WIN32_SHOWDEFAULT"..0x00025002
    )

    IntConstant(
        "WAYLAND_APP_ID"..0x00026001
    )

    IntConstant(
        "NO_API".."0",
        "OPENGL_API"..0x00030001,
        "OPENGL_ES_API"..0x00030002
    )

    IntConstant(
        "NO_ROBUSTNESS".."0",
        "NO_RESET_NOTIFICATION"..0x00031001,
        "LOSE_CONTEXT_ON_RESET"..0x00031002
    )

    IntConstant(
        "OPENGL_ANY_PROFILE".."0",
        "OPENGL_CORE_PROFILE"..0x00032001,
        "OPENGL_COMPAT_PROFILE"..0x00032002
    )

    IntConstant(
        "ANY_RELEASE_BEHAVIOR".."0",
        "RELEASE_BEHAVIOR_FLUSH"..0x00035001,
        "RELEASE_BEHAVIOR_NONE"..0x00035002
    )

    IntConstant(
        "NATIVE_CONTEXT_API"..0x00036001,
        "EGL_CONTEXT_API"..0x00036002,
        "OSMESA_CONTEXT_API"..0x00036003
    )

    IntConstant(
        "ANGLE_PLATFORM_TYPE_NONE"..0x00037001,
        "ANGLE_PLATFORM_TYPE_OPENGL"..0x00037002,
        "ANGLE_PLATFORM_TYPE_OPENGLES"..0x00037003,
        "ANGLE_PLATFORM_TYPE_D3D9"..0x00037004,
        "ANGLE_PLATFORM_TYPE_D3D11"..0x00037005,
        "ANGLE_PLATFORM_TYPE_VULKAN"..0x00037007,
        "ANGLE_PLATFORM_TYPE_METAL"..0x00037008
    )

    IntConstant(
        "WAYLAND_PREFER_LIBDECOR"..0x00038001,
        "WAYLAND_DISABLE_LIBDECOR"..0x00038002
    )

    Code(
        javaInit = statement("$t${t}EventLoop.check();")
    )..intb(
        "Init",
        void()
    )

    void(
        "Terminate",
        void()
    )

    void(
        "InitHint",

        int("hint"),
        int("value")
    )

    void(
        "InitAllocator",

        nullable..GLFWallocator.const.p("allocator")
    )

    void(
        "GetVersion",

        nullable..Check(1)..int.p("major"),
        nullable..Check(1)..int.p("minor"),
        nullable..Check(1)..int.p("rev")
    )

    Nonnull..charASCII.const.p(
        "GetVersionString",
        void()
    )

    int(
        "GetError",

        Check("1")..nullable..charUTF8.const.p.p("description")
    )

    GLFWerrorfun(
        "SetErrorCallback",

        nullable..GLFWerrorfun("cbfun")
    )

    int(
        "GetPlatform",
        void()
    )

    intb(
        "PlatformSupported",

        int("platform")
    )

    GLFWmonitor.p.p(
        "GetMonitors",

        AutoSizeResult..int.p("count")
    )

    GLFWmonitor.p(
        "GetPrimaryMonitor",
        void()
    )

    void(
        "GetMonitorPos",

        GLFWmonitor.p("monitor"),
        nullable..Check(1)..int.p("xpos"),
        nullable..Check(1)..int.p("ypos")
    )

    void(
        "GetMonitorWorkarea",

        GLFWmonitor.p("monitor"),
        nullable..Check(1)..int.p("xpos"),
        nullable..Check(1)..int.p("ypos"),
        nullable..Check(1)..int.p("width"),
        nullable..Check(1)..int.p("height")
    )

    void(
        "GetMonitorPhysicalSize",

        GLFWmonitor.p("monitor"),
        nullable..Check(1)..int.p("widthMM"),
        nullable..Check(1)..int.p("heightMM")
    )

    void(
        "GetMonitorContentScale",

        GLFWmonitor.p("monitor"),
        nullable..Check(1)..float.p("xscale"),
        nullable..Check(1)..float.p("yscale")
    )

    charUTF8.const.p(
        "GetMonitorName",

        GLFWmonitor.p("monitor")
    )

    void(
        "SetMonitorUserPointer",

        GLFWmonitor.p("monitor"),
        opaque_p("pointer")
    )

    opaque_p(
        "GetMonitorUserPointer",

        GLFWmonitor.p("monitor")
    )

    GLFWmonitorfun(
        "SetMonitorCallback",

        nullable..GLFWmonitorfun("cbfun")
    )

    GLFWvidmode.const.p(
        "GetVideoModes",

        GLFWmonitor.p("monitor"),
        AutoSizeResult..int.p("count")
    )

    GLFWvidmode.const.p(
        "GetVideoMode",

        GLFWmonitor.p("monitor")
    )

    void(
        "SetGamma",

        GLFWmonitor.p("monitor"),
        float("gamma")
    )

    GLFWgammaramp.const.p(
        "GetGammaRamp",

        GLFWmonitor.p("monitor")
    )

    void(
        "SetGammaRamp",

        GLFWmonitor.p("monitor"),
        GLFWgammaramp.const.p("ramp")
    )

    void("DefaultWindowHints")

    void(
        "WindowHint",

        int("hint"),
        int("value")
    )

    void(
        "WindowHintString",

        int("hint"),
        charUTF8.const.p("value")
    )

    GLFWwindow.p(
        "CreateWindow",

        int("width"),
        int("height"),
        charUTF8.const.p("title"),
        nullable..GLFWmonitor.p("monitor"),
        nullable..GLFWwindow.p("share")
    )

    void(
        "DestroyWindow",

        nullable..GLFWwindow.p("window")
    )

    intb(
        "WindowShouldClose",

        GLFWwindow.p("window")
    )

    void(
        "SetWindowShouldClose",

        GLFWwindow.p("window"),
        intb("value")
    )

    charUTF8.const.p(
        "GetWindowTitle",

        GLFWwindow.p("window")
    )

    void(
        "SetWindowTitle",

        GLFWwindow.p("window"),
        charUTF8.const.p("title")
    )

    void(
        "SetWindowIcon",

        GLFWwindow.p("window"),
        AutoSize("images")..int("count"),
        nullable..GLFWimage.const.p("images")
    )

    void(
        "GetWindowPos",

        GLFWwindow.p("window"),
        nullable..Check(1)..int.p("xpos"),
        nullable..Check(1)..int.p("ypos")
    )

    void(
        "SetWindowPos",

        GLFWwindow.p("window"),
        int("xpos"),
        int("ypos")
    )

    void(
        "GetWindowSize",

        GLFWwindow.p("window"),
        nullable..Check(1)..int.p("width"),
        nullable..Check(1)..int.p("height")
    )

    void(
        "SetWindowSizeLimits",

        GLFWwindow.p("window"),
        int("minwidth"),
        int("minheight"),
        int("maxwidth"),
        int("maxheight")
    )

    void(
        "SetWindowAspectRatio",

        GLFWwindow.p("window"),
        int("numer"),
        int("denom")
    )

    void(
        "SetWindowSize",

        GLFWwindow.p("window"),
        int("width"),
        int("height")
    )

    void(
        "GetFramebufferSize",

        GLFWwindow.p("window"),
        nullable..Check(1)..int.p("width"),
        nullable..Check(1)..int.p("height")
    )

    void(
        "GetWindowFrameSize",

        GLFWwindow.p("window"),
        Check(1)..nullable..int.p("left"),
        Check(1)..nullable..int.p("top"),
        Check(1)..nullable..int.p("right"),
        Check(1)..nullable..int.p("bottom")
    )

    void(
        "GetWindowContentScale",

        GLFWwindow.p("window"),
        nullable..Check(1)..float.p("xscale"),
        nullable..Check(1)..float.p("yscale")
    )

    float(
        "GetWindowOpacity",

        GLFWwindow.p("window")
    )

    void(
        "SetWindowOpacity",

        GLFWwindow.p("window"),
        float("opacity")
    )

    void(
        "IconifyWindow",

        GLFWwindow.p("window")
    )

    void(
        "RestoreWindow",

        GLFWwindow.p("window")
    )

    void(
        "MaximizeWindow",

        GLFWwindow.p("window")
    )

    void(
        "ShowWindow",

        GLFWwindow.p("window")
    )

    void(
        "HideWindow",

        GLFWwindow.p("window")
    )

    void(
        "FocusWindow",

        GLFWwindow.p("window")
    )

    void(
        "RequestWindowAttention",

        GLFWwindow.p("window")
    )

    GLFWmonitor.p(
        "GetWindowMonitor",

        GLFWwindow.p("window")
    )

    void(
        "SetWindowMonitor",

        GLFWwindow.p("window"),
        nullable..GLFWmonitor.p("monitor"),
        int("xpos"),
        int("ypos"),
        int("width"),
        int("height"),
        int("refreshRate")
    )

    int(
        "GetWindowAttrib",

        GLFWwindow.p("window"),
        int("attrib")
    )

    void(
        "SetWindowAttrib",

        GLFWwindow.p("window"),
        int("attrib"),
        int("value")
    )

    void(
        "SetWindowUserPointer",

        GLFWwindow.p("window"),
        nullable..opaque_p("pointer")
    )

    opaque_p(
        "GetWindowUserPointer",

        GLFWwindow.p("window")
    )

    val CALLBACK_WINDOW = GLFWwindow.p("window")

    GLFWwindowposfun(
        "SetWindowPosCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowposfun("cbfun")
    )

    GLFWwindowsizefun(
        "SetWindowSizeCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowsizefun("cbfun")
    )

    GLFWwindowclosefun(
        "SetWindowCloseCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowclosefun("cbfun")
    )

    GLFWwindowrefreshfun(
        "SetWindowRefreshCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowrefreshfun("cbfun")
    )

    GLFWwindowfocusfun(
        "SetWindowFocusCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowfocusfun("cbfun")
    )

    GLFWwindowiconifyfun(
        "SetWindowIconifyCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowiconifyfun("cbfun")
    )

    GLFWwindowmaximizefun(
        "SetWindowMaximizeCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowmaximizefun("cbfun")
    )

    GLFWframebuffersizefun(
        "SetFramebufferSizeCallback",

        CALLBACK_WINDOW,
        nullable..GLFWframebuffersizefun("cbfun")
    )

    GLFWwindowcontentscalefun(
        "SetWindowContentScaleCallback",

        CALLBACK_WINDOW,
        nullable..GLFWwindowcontentscalefun("cbfun")
    )

    void("PollEvents", void())
    void("WaitEvents", void())

    void(
        "WaitEventsTimeout",

        double("timeout")
    )

    void("PostEmptyEvent", void())

    int(
        "GetInputMode",

        GLFWwindow.p("window"),
        int("mode")
    )

    void(
        "SetInputMode",

        GLFWwindow.p("window"),
        int("mode"),
        int("value")
    )

    intb(
        "RawMouseMotionSupported",
        void()
    )

    charUTF8.const.p(
        "GetKeyName",

        int("key"),
        int("scancode")
    )

    int(
        "GetKeyScancode",

        int("key")
    )

    int(
        "GetKey",

        GLFWwindow.p("window"),
        int("key")
    )

    int(
        "GetMouseButton",

        GLFWwindow.p("window"),
        int("button")
    )

    void(
        "GetCursorPos",

        GLFWwindow.p("window"),
        nullable..Check(1)..double.p("xpos"),
        nullable..Check(1)..double.p("ypos")
    )

    void(
        "SetCursorPos",

        GLFWwindow.p("window"),
        double("xpos"),
        double("ypos")
    )

    GLFWcursor.p(
        "CreateCursor",

        GLFWimage.const.p("image"),
        int("xhot"),
        int("yhot")
    )

    GLFWcursor.p(
        "CreateStandardCursor",

        int("shape")
    )

    void(
        "DestroyCursor",

        GLFWcursor.p("cursor")
    )

    void(
        "SetCursor",

        GLFWwindow.p("window"),
        nullable..GLFWcursor.p("cursor")
    )

    IgnoreMissing..void(
        "GetPreeditCursorRectangle",

        GLFWwindow.p("window"),
        Check(1)..nullable..int.p("x"),
        Check(1)..nullable..int.p("y"),
        Check(1)..nullable..int.p("w"),
        Check(1)..nullable..int.p("h")
    )

    IgnoreMissing..void(
        "SetPreeditCursorRectangle",

        GLFWwindow.p("window"),
        int("x"),
        int("y"),
        int("w"),
        int("h")
    )

    IgnoreMissing..void(
        "ResetPreeditText",

        GLFWwindow.p("window")
    )

    IgnoreMissing..unsigned_int.p(
        "GetPreeditCandidate",

        GLFWwindow.p("window"),
        int("index"),
        AutoSizeResult..Check(1)..int.p("textCount")
    )

    GLFWkeyfun(
        "SetKeyCallback",

        GLFWwindow.p("window"),
        nullable..GLFWkeyfun("cbfun")
    )

    GLFWcharfun(
        "SetCharCallback",

        GLFWwindow.p("window"),
        nullable..GLFWcharfun("cbfun")
    )

    GLFWcharmodsfun(
        "SetCharModsCallback",

        GLFWwindow.p("window"),
        nullable..GLFWcharmodsfun("cbfun")
    )

    IgnoreMissing..GLFWpreeditfun(
        "SetPreeditCallback",

        GLFWwindow.p("window"),
        nullable..GLFWpreeditfun("cbfun")
    )

    IgnoreMissing..GLFWimestatusfun(
        "SetIMEStatusCallback",

        GLFWwindow.p("window"),
        nullable..GLFWimestatusfun("cbfun")
    )

    IgnoreMissing..GLFWpreeditcandidatefun(
        "SetPreeditCandidateCallback",

        GLFWwindow.p("window"),
        nullable..GLFWpreeditcandidatefun("cbfun")
    )

    GLFWmousebuttonfun(
        "SetMouseButtonCallback",

        GLFWwindow.p("window"),
        nullable..GLFWmousebuttonfun("cbfun")
    )

    GLFWcursorposfun(
        "SetCursorPosCallback",

        GLFWwindow.p("window"),
        nullable..GLFWcursorposfun("cbfun")
    )

    GLFWcursorenterfun(
        "SetCursorEnterCallback",

        GLFWwindow.p("window"),
        nullable..GLFWcursorenterfun("cbfun")
    )

    GLFWscrollfun(
        "SetScrollCallback",

        GLFWwindow.p("window"),
        nullable..GLFWscrollfun("cbfun")
    )

    GLFWdropfun(
        "SetDropCallback",

        GLFWwindow.p("window"),
        nullable..GLFWdropfun("cbfun")
    )

    intb(
        "JoystickPresent",

        int("jid")
    )

    float.const.p(
        "GetJoystickAxes",

        int("jid"),
        AutoSizeResult..int.p("count")
    )

    unsigned_char.const.p(
        "GetJoystickButtons",

        int("jid"),
        AutoSizeResult..int.p("count")
    )

    unsigned_char.const.p(
        "GetJoystickHats",

        int("jid"),
        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetJoystickName",

        int("jid")
    )

    charUTF8.const.p(
        "GetJoystickGUID",

        int("jid")
    )

    void(
        "SetJoystickUserPointer",

        int("jid"),
        opaque_p("pointer")
    )

    opaque_p(
        "GetJoystickUserPointer",

        int("jid")
    )

    intb(
        "JoystickIsGamepad",

        int("jid")
    )

    GLFWjoystickfun(
        "SetJoystickCallback",

        nullable..GLFWjoystickfun("cbfun")
    )

    intb(
        "UpdateGamepadMappings",

        NullTerminated..char.const.p("string")
    )

    charUTF8.const.p(
        "GetGamepadName",

        int("jid")
    )

    intb(
        "GetGamepadState",

        int("jid"),
        GLFWgamepadstate.p("state")
    )

    void(
        "SetClipboardString",

        nullable..GLFWwindow.p("window"),
        charUTF8.const.p("string")
    )

    charUTF8.const.p(
        "GetClipboardString",

        nullable..GLFWwindow.p("window")
    )

    double(
        "GetTime",
        void()
    )

    void(
        "SetTime",

        double("time")
    )

    uint64_t(
        "GetTimerValue",
        void()
    )

    uint64_t(
        "GetTimerFrequency",
        void()
    )

    // [ OpenGL ]

    void(
        "MakeContextCurrent",

        nullable..GLFWwindow.p("window")
    )

    GLFWwindow.p(
        "GetCurrentContext",
        void()
    )

    void(
        "SwapBuffers",

        GLFWwindow.p("window")
    )

    void(
        "SwapInterval",

        int("interval")
    )

    intb(
        "ExtensionSupported",

        charASCII.const.p("extension")
    )

    GLFWglproc(
        "GetProcAddress",

        charASCII.const.p("procname")
    )
}
