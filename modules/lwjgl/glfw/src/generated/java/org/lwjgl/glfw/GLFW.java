/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLFW {

    private static final SharedLibrary GLFW = Library.loadNative(GLFW.class, "org.lwjgl.glfw", Configuration.GLFW_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("glfw")), true);

    /** Contains the function pointers loaded from the glfw {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Init                          = apiGetFunctionAddress(GLFW, "glfwInit"),
            Terminate                     = apiGetFunctionAddress(GLFW, "glfwTerminate"),
            InitHint                      = apiGetFunctionAddress(GLFW, "glfwInitHint"),
            InitAllocator                 = apiGetFunctionAddress(GLFW, "glfwInitAllocator"),
            GetVersion                    = apiGetFunctionAddress(GLFW, "glfwGetVersion"),
            GetVersionString              = apiGetFunctionAddress(GLFW, "glfwGetVersionString"),
            GetError                      = apiGetFunctionAddress(GLFW, "glfwGetError"),
            SetErrorCallback              = apiGetFunctionAddress(GLFW, "glfwSetErrorCallback"),
            GetPlatform                   = apiGetFunctionAddress(GLFW, "glfwGetPlatform"),
            PlatformSupported             = apiGetFunctionAddress(GLFW, "glfwPlatformSupported"),
            GetMonitors                   = apiGetFunctionAddress(GLFW, "glfwGetMonitors"),
            GetPrimaryMonitor             = apiGetFunctionAddress(GLFW, "glfwGetPrimaryMonitor"),
            GetMonitorPos                 = apiGetFunctionAddress(GLFW, "glfwGetMonitorPos"),
            GetMonitorWorkarea            = apiGetFunctionAddress(GLFW, "glfwGetMonitorWorkarea"),
            GetMonitorPhysicalSize        = apiGetFunctionAddress(GLFW, "glfwGetMonitorPhysicalSize"),
            GetMonitorContentScale        = apiGetFunctionAddress(GLFW, "glfwGetMonitorContentScale"),
            GetMonitorName                = apiGetFunctionAddress(GLFW, "glfwGetMonitorName"),
            SetMonitorUserPointer         = apiGetFunctionAddress(GLFW, "glfwSetMonitorUserPointer"),
            GetMonitorUserPointer         = apiGetFunctionAddress(GLFW, "glfwGetMonitorUserPointer"),
            SetMonitorCallback            = apiGetFunctionAddress(GLFW, "glfwSetMonitorCallback"),
            GetVideoModes                 = apiGetFunctionAddress(GLFW, "glfwGetVideoModes"),
            GetVideoMode                  = apiGetFunctionAddress(GLFW, "glfwGetVideoMode"),
            SetGamma                      = apiGetFunctionAddress(GLFW, "glfwSetGamma"),
            GetGammaRamp                  = apiGetFunctionAddress(GLFW, "glfwGetGammaRamp"),
            SetGammaRamp                  = apiGetFunctionAddress(GLFW, "glfwSetGammaRamp"),
            DefaultWindowHints            = apiGetFunctionAddress(GLFW, "glfwDefaultWindowHints"),
            WindowHint                    = apiGetFunctionAddress(GLFW, "glfwWindowHint"),
            WindowHintString              = apiGetFunctionAddress(GLFW, "glfwWindowHintString"),
            CreateWindow                  = apiGetFunctionAddress(GLFW, "glfwCreateWindow"),
            DestroyWindow                 = apiGetFunctionAddress(GLFW, "glfwDestroyWindow"),
            WindowShouldClose             = apiGetFunctionAddress(GLFW, "glfwWindowShouldClose"),
            SetWindowShouldClose          = apiGetFunctionAddress(GLFW, "glfwSetWindowShouldClose"),
            GetWindowTitle                = apiGetFunctionAddress(GLFW, "glfwGetWindowTitle"),
            SetWindowTitle                = apiGetFunctionAddress(GLFW, "glfwSetWindowTitle"),
            SetWindowIcon                 = apiGetFunctionAddress(GLFW, "glfwSetWindowIcon"),
            GetWindowPos                  = apiGetFunctionAddress(GLFW, "glfwGetWindowPos"),
            SetWindowPos                  = apiGetFunctionAddress(GLFW, "glfwSetWindowPos"),
            GetWindowSize                 = apiGetFunctionAddress(GLFW, "glfwGetWindowSize"),
            SetWindowSizeLimits           = apiGetFunctionAddress(GLFW, "glfwSetWindowSizeLimits"),
            SetWindowAspectRatio          = apiGetFunctionAddress(GLFW, "glfwSetWindowAspectRatio"),
            SetWindowSize                 = apiGetFunctionAddress(GLFW, "glfwSetWindowSize"),
            GetFramebufferSize            = apiGetFunctionAddress(GLFW, "glfwGetFramebufferSize"),
            GetWindowFrameSize            = apiGetFunctionAddress(GLFW, "glfwGetWindowFrameSize"),
            GetWindowContentScale         = apiGetFunctionAddress(GLFW, "glfwGetWindowContentScale"),
            GetWindowOpacity              = apiGetFunctionAddress(GLFW, "glfwGetWindowOpacity"),
            SetWindowOpacity              = apiGetFunctionAddress(GLFW, "glfwSetWindowOpacity"),
            IconifyWindow                 = apiGetFunctionAddress(GLFW, "glfwIconifyWindow"),
            RestoreWindow                 = apiGetFunctionAddress(GLFW, "glfwRestoreWindow"),
            MaximizeWindow                = apiGetFunctionAddress(GLFW, "glfwMaximizeWindow"),
            ShowWindow                    = apiGetFunctionAddress(GLFW, "glfwShowWindow"),
            HideWindow                    = apiGetFunctionAddress(GLFW, "glfwHideWindow"),
            FocusWindow                   = apiGetFunctionAddress(GLFW, "glfwFocusWindow"),
            RequestWindowAttention        = apiGetFunctionAddress(GLFW, "glfwRequestWindowAttention"),
            GetWindowMonitor              = apiGetFunctionAddress(GLFW, "glfwGetWindowMonitor"),
            SetWindowMonitor              = apiGetFunctionAddress(GLFW, "glfwSetWindowMonitor"),
            GetWindowAttrib               = apiGetFunctionAddress(GLFW, "glfwGetWindowAttrib"),
            SetWindowAttrib               = apiGetFunctionAddress(GLFW, "glfwSetWindowAttrib"),
            SetWindowUserPointer          = apiGetFunctionAddress(GLFW, "glfwSetWindowUserPointer"),
            GetWindowUserPointer          = apiGetFunctionAddress(GLFW, "glfwGetWindowUserPointer"),
            SetWindowPosCallback          = apiGetFunctionAddress(GLFW, "glfwSetWindowPosCallback"),
            SetWindowSizeCallback         = apiGetFunctionAddress(GLFW, "glfwSetWindowSizeCallback"),
            SetWindowCloseCallback        = apiGetFunctionAddress(GLFW, "glfwSetWindowCloseCallback"),
            SetWindowRefreshCallback      = apiGetFunctionAddress(GLFW, "glfwSetWindowRefreshCallback"),
            SetWindowFocusCallback        = apiGetFunctionAddress(GLFW, "glfwSetWindowFocusCallback"),
            SetWindowIconifyCallback      = apiGetFunctionAddress(GLFW, "glfwSetWindowIconifyCallback"),
            SetWindowMaximizeCallback     = apiGetFunctionAddress(GLFW, "glfwSetWindowMaximizeCallback"),
            SetFramebufferSizeCallback    = apiGetFunctionAddress(GLFW, "glfwSetFramebufferSizeCallback"),
            SetWindowContentScaleCallback = apiGetFunctionAddress(GLFW, "glfwSetWindowContentScaleCallback"),
            PollEvents                    = apiGetFunctionAddress(GLFW, "glfwPollEvents"),
            WaitEvents                    = apiGetFunctionAddress(GLFW, "glfwWaitEvents"),
            WaitEventsTimeout             = apiGetFunctionAddress(GLFW, "glfwWaitEventsTimeout"),
            PostEmptyEvent                = apiGetFunctionAddress(GLFW, "glfwPostEmptyEvent"),
            GetInputMode                  = apiGetFunctionAddress(GLFW, "glfwGetInputMode"),
            SetInputMode                  = apiGetFunctionAddress(GLFW, "glfwSetInputMode"),
            RawMouseMotionSupported       = apiGetFunctionAddress(GLFW, "glfwRawMouseMotionSupported"),
            GetKeyName                    = apiGetFunctionAddress(GLFW, "glfwGetKeyName"),
            GetKeyScancode                = apiGetFunctionAddress(GLFW, "glfwGetKeyScancode"),
            GetKey                        = apiGetFunctionAddress(GLFW, "glfwGetKey"),
            GetMouseButton                = apiGetFunctionAddress(GLFW, "glfwGetMouseButton"),
            GetCursorPos                  = apiGetFunctionAddress(GLFW, "glfwGetCursorPos"),
            SetCursorPos                  = apiGetFunctionAddress(GLFW, "glfwSetCursorPos"),
            CreateCursor                  = apiGetFunctionAddress(GLFW, "glfwCreateCursor"),
            CreateStandardCursor          = apiGetFunctionAddress(GLFW, "glfwCreateStandardCursor"),
            DestroyCursor                 = apiGetFunctionAddress(GLFW, "glfwDestroyCursor"),
            SetCursor                     = apiGetFunctionAddress(GLFW, "glfwSetCursor"),
            GetPreeditCursorRectangle     = apiGetFunctionAddressOptional(GLFW, "glfwGetPreeditCursorRectangle"),
            SetPreeditCursorRectangle     = apiGetFunctionAddressOptional(GLFW, "glfwSetPreeditCursorRectangle"),
            ResetPreeditText              = apiGetFunctionAddressOptional(GLFW, "glfwResetPreeditText"),
            GetPreeditCandidate           = apiGetFunctionAddressOptional(GLFW, "glfwGetPreeditCandidate"),
            SetKeyCallback                = apiGetFunctionAddress(GLFW, "glfwSetKeyCallback"),
            SetCharCallback               = apiGetFunctionAddress(GLFW, "glfwSetCharCallback"),
            SetCharModsCallback           = apiGetFunctionAddress(GLFW, "glfwSetCharModsCallback"),
            SetPreeditCallback            = apiGetFunctionAddressOptional(GLFW, "glfwSetPreeditCallback"),
            SetIMEStatusCallback          = apiGetFunctionAddressOptional(GLFW, "glfwSetIMEStatusCallback"),
            SetPreeditCandidateCallback   = apiGetFunctionAddressOptional(GLFW, "glfwSetPreeditCandidateCallback"),
            SetMouseButtonCallback        = apiGetFunctionAddress(GLFW, "glfwSetMouseButtonCallback"),
            SetCursorPosCallback          = apiGetFunctionAddress(GLFW, "glfwSetCursorPosCallback"),
            SetCursorEnterCallback        = apiGetFunctionAddress(GLFW, "glfwSetCursorEnterCallback"),
            SetScrollCallback             = apiGetFunctionAddress(GLFW, "glfwSetScrollCallback"),
            SetDropCallback               = apiGetFunctionAddress(GLFW, "glfwSetDropCallback"),
            JoystickPresent               = apiGetFunctionAddress(GLFW, "glfwJoystickPresent"),
            GetJoystickAxes               = apiGetFunctionAddress(GLFW, "glfwGetJoystickAxes"),
            GetJoystickButtons            = apiGetFunctionAddress(GLFW, "glfwGetJoystickButtons"),
            GetJoystickHats               = apiGetFunctionAddress(GLFW, "glfwGetJoystickHats"),
            GetJoystickName               = apiGetFunctionAddress(GLFW, "glfwGetJoystickName"),
            GetJoystickGUID               = apiGetFunctionAddress(GLFW, "glfwGetJoystickGUID"),
            SetJoystickUserPointer        = apiGetFunctionAddress(GLFW, "glfwSetJoystickUserPointer"),
            GetJoystickUserPointer        = apiGetFunctionAddress(GLFW, "glfwGetJoystickUserPointer"),
            JoystickIsGamepad             = apiGetFunctionAddress(GLFW, "glfwJoystickIsGamepad"),
            SetJoystickCallback           = apiGetFunctionAddress(GLFW, "glfwSetJoystickCallback"),
            UpdateGamepadMappings         = apiGetFunctionAddress(GLFW, "glfwUpdateGamepadMappings"),
            GetGamepadName                = apiGetFunctionAddress(GLFW, "glfwGetGamepadName"),
            GetGamepadState               = apiGetFunctionAddress(GLFW, "glfwGetGamepadState"),
            SetClipboardString            = apiGetFunctionAddress(GLFW, "glfwSetClipboardString"),
            GetClipboardString            = apiGetFunctionAddress(GLFW, "glfwGetClipboardString"),
            GetTime                       = apiGetFunctionAddress(GLFW, "glfwGetTime"),
            SetTime                       = apiGetFunctionAddress(GLFW, "glfwSetTime"),
            GetTimerValue                 = apiGetFunctionAddress(GLFW, "glfwGetTimerValue"),
            GetTimerFrequency             = apiGetFunctionAddress(GLFW, "glfwGetTimerFrequency"),
            MakeContextCurrent            = apiGetFunctionAddress(GLFW, "glfwMakeContextCurrent"),
            GetCurrentContext             = apiGetFunctionAddress(GLFW, "glfwGetCurrentContext"),
            SwapBuffers                   = apiGetFunctionAddress(GLFW, "glfwSwapBuffers"),
            SwapInterval                  = apiGetFunctionAddress(GLFW, "glfwSwapInterval"),
            ExtensionSupported            = apiGetFunctionAddress(GLFW, "glfwExtensionSupported"),
            GetProcAddress                = apiGetFunctionAddress(GLFW, "glfwGetProcAddress");

    }

    /** Returns the glfw {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return GLFW;
    }

    public static final int
        GLFW_VERSION_MAJOR    = 3,
        GLFW_VERSION_MINOR    = 4,
        GLFW_VERSION_REVISION = 0;

    public static final int
        GLFW_TRUE  = 1,
        GLFW_FALSE = 0;

    public static final int
        GLFW_RELEASE = 0,
        GLFW_PRESS   = 1,
        GLFW_REPEAT  = 2;

    public static final int
        GLFW_HAT_CENTERED   = 0,
        GLFW_HAT_UP         = 1,
        GLFW_HAT_RIGHT      = 2,
        GLFW_HAT_DOWN       = 4,
        GLFW_HAT_LEFT       = 8,
        GLFW_HAT_RIGHT_UP   = (GLFW_HAT_RIGHT | GLFW_HAT_UP),
        GLFW_HAT_RIGHT_DOWN = (GLFW_HAT_RIGHT | GLFW_HAT_DOWN),
        GLFW_HAT_LEFT_UP    = (GLFW_HAT_LEFT  | GLFW_HAT_UP),
        GLFW_HAT_LEFT_DOWN  = (GLFW_HAT_LEFT  | GLFW_HAT_DOWN);

    public static final int GLFW_KEY_UNKNOWN = -1;

    public static final int
        GLFW_KEY_SPACE         = 32,
        GLFW_KEY_APOSTROPHE    = 39,
        GLFW_KEY_COMMA         = 44,
        GLFW_KEY_MINUS         = 45,
        GLFW_KEY_PERIOD        = 46,
        GLFW_KEY_SLASH         = 47,
        GLFW_KEY_0             = 48,
        GLFW_KEY_1             = 49,
        GLFW_KEY_2             = 50,
        GLFW_KEY_3             = 51,
        GLFW_KEY_4             = 52,
        GLFW_KEY_5             = 53,
        GLFW_KEY_6             = 54,
        GLFW_KEY_7             = 55,
        GLFW_KEY_8             = 56,
        GLFW_KEY_9             = 57,
        GLFW_KEY_SEMICOLON     = 59,
        GLFW_KEY_EQUAL         = 61,
        GLFW_KEY_A             = 65,
        GLFW_KEY_B             = 66,
        GLFW_KEY_C             = 67,
        GLFW_KEY_D             = 68,
        GLFW_KEY_E             = 69,
        GLFW_KEY_F             = 70,
        GLFW_KEY_G             = 71,
        GLFW_KEY_H             = 72,
        GLFW_KEY_I             = 73,
        GLFW_KEY_J             = 74,
        GLFW_KEY_K             = 75,
        GLFW_KEY_L             = 76,
        GLFW_KEY_M             = 77,
        GLFW_KEY_N             = 78,
        GLFW_KEY_O             = 79,
        GLFW_KEY_P             = 80,
        GLFW_KEY_Q             = 81,
        GLFW_KEY_R             = 82,
        GLFW_KEY_S             = 83,
        GLFW_KEY_T             = 84,
        GLFW_KEY_U             = 85,
        GLFW_KEY_V             = 86,
        GLFW_KEY_W             = 87,
        GLFW_KEY_X             = 88,
        GLFW_KEY_Y             = 89,
        GLFW_KEY_Z             = 90,
        GLFW_KEY_LEFT_BRACKET  = 91,
        GLFW_KEY_BACKSLASH     = 92,
        GLFW_KEY_RIGHT_BRACKET = 93,
        GLFW_KEY_GRAVE_ACCENT  = 96,
        GLFW_KEY_WORLD_1       = 161,
        GLFW_KEY_WORLD_2       = 162;

    public static final int
        GLFW_KEY_ESCAPE        = 256,
        GLFW_KEY_ENTER         = 257,
        GLFW_KEY_TAB           = 258,
        GLFW_KEY_BACKSPACE     = 259,
        GLFW_KEY_INSERT        = 260,
        GLFW_KEY_DELETE        = 261,
        GLFW_KEY_RIGHT         = 262,
        GLFW_KEY_LEFT          = 263,
        GLFW_KEY_DOWN          = 264,
        GLFW_KEY_UP            = 265,
        GLFW_KEY_PAGE_UP       = 266,
        GLFW_KEY_PAGE_DOWN     = 267,
        GLFW_KEY_HOME          = 268,
        GLFW_KEY_END           = 269,
        GLFW_KEY_CAPS_LOCK     = 280,
        GLFW_KEY_SCROLL_LOCK   = 281,
        GLFW_KEY_NUM_LOCK      = 282,
        GLFW_KEY_PRINT_SCREEN  = 283,
        GLFW_KEY_PAUSE         = 284,
        GLFW_KEY_F1            = 290,
        GLFW_KEY_F2            = 291,
        GLFW_KEY_F3            = 292,
        GLFW_KEY_F4            = 293,
        GLFW_KEY_F5            = 294,
        GLFW_KEY_F6            = 295,
        GLFW_KEY_F7            = 296,
        GLFW_KEY_F8            = 297,
        GLFW_KEY_F9            = 298,
        GLFW_KEY_F10           = 299,
        GLFW_KEY_F11           = 300,
        GLFW_KEY_F12           = 301,
        GLFW_KEY_F13           = 302,
        GLFW_KEY_F14           = 303,
        GLFW_KEY_F15           = 304,
        GLFW_KEY_F16           = 305,
        GLFW_KEY_F17           = 306,
        GLFW_KEY_F18           = 307,
        GLFW_KEY_F19           = 308,
        GLFW_KEY_F20           = 309,
        GLFW_KEY_F21           = 310,
        GLFW_KEY_F22           = 311,
        GLFW_KEY_F23           = 312,
        GLFW_KEY_F24           = 313,
        GLFW_KEY_F25           = 314,
        GLFW_KEY_KP_0          = 320,
        GLFW_KEY_KP_1          = 321,
        GLFW_KEY_KP_2          = 322,
        GLFW_KEY_KP_3          = 323,
        GLFW_KEY_KP_4          = 324,
        GLFW_KEY_KP_5          = 325,
        GLFW_KEY_KP_6          = 326,
        GLFW_KEY_KP_7          = 327,
        GLFW_KEY_KP_8          = 328,
        GLFW_KEY_KP_9          = 329,
        GLFW_KEY_KP_DECIMAL    = 330,
        GLFW_KEY_KP_DIVIDE     = 331,
        GLFW_KEY_KP_MULTIPLY   = 332,
        GLFW_KEY_KP_SUBTRACT   = 333,
        GLFW_KEY_KP_ADD        = 334,
        GLFW_KEY_KP_ENTER      = 335,
        GLFW_KEY_KP_EQUAL      = 336,
        GLFW_KEY_LEFT_SHIFT    = 340,
        GLFW_KEY_LEFT_CONTROL  = 341,
        GLFW_KEY_LEFT_ALT      = 342,
        GLFW_KEY_LEFT_SUPER    = 343,
        GLFW_KEY_RIGHT_SHIFT   = 344,
        GLFW_KEY_RIGHT_CONTROL = 345,
        GLFW_KEY_RIGHT_ALT     = 346,
        GLFW_KEY_RIGHT_SUPER   = 347,
        GLFW_KEY_MENU          = 348,
        GLFW_KEY_LAST          = GLFW_KEY_MENU;

    public static final int
        GLFW_MOD_SHIFT     = 0x1,
        GLFW_MOD_CONTROL   = 0x2,
        GLFW_MOD_ALT       = 0x4,
        GLFW_MOD_SUPER     = 0x8,
        GLFW_MOD_CAPS_LOCK = 0x10,
        GLFW_MOD_NUM_LOCK  = 0x20;

    public static final int
        GLFW_MOUSE_BUTTON_1      = 0,
        GLFW_MOUSE_BUTTON_2      = 1,
        GLFW_MOUSE_BUTTON_3      = 2,
        GLFW_MOUSE_BUTTON_4      = 3,
        GLFW_MOUSE_BUTTON_5      = 4,
        GLFW_MOUSE_BUTTON_6      = 5,
        GLFW_MOUSE_BUTTON_7      = 6,
        GLFW_MOUSE_BUTTON_8      = 7,
        GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8,
        GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
        GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
        GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

    public static final int
        GLFW_JOYSTICK_1    = 0,
        GLFW_JOYSTICK_2    = 1,
        GLFW_JOYSTICK_3    = 2,
        GLFW_JOYSTICK_4    = 3,
        GLFW_JOYSTICK_5    = 4,
        GLFW_JOYSTICK_6    = 5,
        GLFW_JOYSTICK_7    = 6,
        GLFW_JOYSTICK_8    = 7,
        GLFW_JOYSTICK_9    = 8,
        GLFW_JOYSTICK_10   = 9,
        GLFW_JOYSTICK_11   = 10,
        GLFW_JOYSTICK_12   = 11,
        GLFW_JOYSTICK_13   = 12,
        GLFW_JOYSTICK_14   = 13,
        GLFW_JOYSTICK_15   = 14,
        GLFW_JOYSTICK_16   = 15,
        GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;

    public static final int
        GLFW_GAMEPAD_BUTTON_A            = 0,
        GLFW_GAMEPAD_BUTTON_B            = 1,
        GLFW_GAMEPAD_BUTTON_X            = 2,
        GLFW_GAMEPAD_BUTTON_Y            = 3,
        GLFW_GAMEPAD_BUTTON_LEFT_BUMPER  = 4,
        GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5,
        GLFW_GAMEPAD_BUTTON_BACK         = 6,
        GLFW_GAMEPAD_BUTTON_START        = 7,
        GLFW_GAMEPAD_BUTTON_GUIDE        = 8,
        GLFW_GAMEPAD_BUTTON_LEFT_THUMB   = 9,
        GLFW_GAMEPAD_BUTTON_RIGHT_THUMB  = 10,
        GLFW_GAMEPAD_BUTTON_DPAD_UP      = 11,
        GLFW_GAMEPAD_BUTTON_DPAD_RIGHT   = 12,
        GLFW_GAMEPAD_BUTTON_DPAD_DOWN    = 13,
        GLFW_GAMEPAD_BUTTON_DPAD_LEFT    = 14,
        GLFW_GAMEPAD_BUTTON_LAST         = GLFW_GAMEPAD_BUTTON_DPAD_LEFT,
        GLFW_GAMEPAD_BUTTON_CROSS        = GLFW_GAMEPAD_BUTTON_A,
        GLFW_GAMEPAD_BUTTON_CIRCLE       = GLFW_GAMEPAD_BUTTON_B,
        GLFW_GAMEPAD_BUTTON_SQUARE       = GLFW_GAMEPAD_BUTTON_X,
        GLFW_GAMEPAD_BUTTON_TRIANGLE     = GLFW_GAMEPAD_BUTTON_Y;

    public static final int
        GLFW_GAMEPAD_AXIS_LEFT_X        = 0,
        GLFW_GAMEPAD_AXIS_LEFT_Y        = 1,
        GLFW_GAMEPAD_AXIS_RIGHT_X       = 2,
        GLFW_GAMEPAD_AXIS_RIGHT_Y       = 3,
        GLFW_GAMEPAD_AXIS_LEFT_TRIGGER  = 4,
        GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        GLFW_GAMEPAD_AXIS_LAST          = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;

    public static final int
        GLFW_NO_ERROR              = 0,
        GLFW_NOT_INITIALIZED       = 0x10001,
        GLFW_NO_CURRENT_CONTEXT    = 0x10002,
        GLFW_INVALID_ENUM          = 0x10003,
        GLFW_INVALID_VALUE         = 0x10004,
        GLFW_OUT_OF_MEMORY         = 0x10005,
        GLFW_API_UNAVAILABLE       = 0x10006,
        GLFW_VERSION_UNAVAILABLE   = 0x10007,
        GLFW_PLATFORM_ERROR        = 0x10008,
        GLFW_FORMAT_UNAVAILABLE    = 0x10009,
        GLFW_NO_WINDOW_CONTEXT     = 0x1000A,
        GLFW_CURSOR_UNAVAILABLE    = 0x1000B,
        GLFW_FEATURE_UNAVAILABLE   = 0x1000C,
        GLFW_FEATURE_UNIMPLEMENTED = 0x1000D,
        GLFW_PLATFORM_UNAVAILABLE  = 0x1000E;

    public static final int
        GLFW_FOCUSED                 = 0x20001,
        GLFW_ICONIFIED               = 0x20002,
        GLFW_RESIZABLE               = 0x20003,
        GLFW_VISIBLE                 = 0x20004,
        GLFW_DECORATED               = 0x20005,
        GLFW_AUTO_ICONIFY            = 0x20006,
        GLFW_FLOATING                = 0x20007,
        GLFW_MAXIMIZED               = 0x20008,
        GLFW_CENTER_CURSOR           = 0x20009,
        GLFW_TRANSPARENT_FRAMEBUFFER = 0x2000A,
        GLFW_HOVERED                 = 0x2000B,
        GLFW_FOCUS_ON_SHOW           = 0x2000C,
        GLFW_MOUSE_PASSTHROUGH       = 0x2000D,
        GLFW_POSITION_X              = 0x2000E,
        GLFW_POSITION_Y              = 0x2000F,
        GLFW_SOFT_FULLSCREEN         = 0x20010;

    public static final int
        GLFW_CURSOR                  = 0x33001,
        GLFW_STICKY_KEYS             = 0x33002,
        GLFW_STICKY_MOUSE_BUTTONS    = 0x33003,
        GLFW_LOCK_KEY_MODS           = 0x33004,
        GLFW_RAW_MOUSE_MOTION        = 0x33005,
        GLFW_UNLIMITED_MOUSE_BUTTONS = 0x33006,
        GLFW_IME                     = 0x33007;

    public static final int
        GLFW_CURSOR_NORMAL   = 0x34001,
        GLFW_CURSOR_HIDDEN   = 0x34002,
        GLFW_CURSOR_DISABLED = 0x34003,
        GLFW_CURSOR_CAPTURED = 0x34004;

    public static final int
        GLFW_ARROW_CURSOR         = 0x36001,
        GLFW_IBEAM_CURSOR         = 0x36002,
        GLFW_CROSSHAIR_CURSOR     = 0x36003,
        GLFW_POINTING_HAND_CURSOR = 0x36004,
        GLFW_RESIZE_EW_CURSOR     = 0x36005,
        GLFW_RESIZE_NS_CURSOR     = 0x36006,
        GLFW_RESIZE_NWSE_CURSOR   = 0x36007,
        GLFW_RESIZE_NESW_CURSOR   = 0x36008,
        GLFW_RESIZE_ALL_CURSOR    = 0x36009,
        GLFW_NOT_ALLOWED_CURSOR   = 0x3600A,
        GLFW_HRESIZE_CURSOR       = GLFW_RESIZE_EW_CURSOR,
        GLFW_VRESIZE_CURSOR       = GLFW_RESIZE_NS_CURSOR,
        GLFW_HAND_CURSOR          = GLFW_POINTING_HAND_CURSOR;

    public static final int
        GLFW_CONNECTED    = 0x40001,
        GLFW_DISCONNECTED = 0x40002;

    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x50001;

    public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x50002;

    public static final int GLFW_ANY_POSITION = 0x80000000;

    public static final int GLFW_PLATFORM = 0x50003;

    public static final int GLFW_MANAGE_PREEDIT_CANDIDATE = 0x50004;

    public static final int
        GLFW_COCOA_CHDIR_RESOURCES = 0x51001,
        GLFW_COCOA_MENUBAR         = 0x51002;

    public static final int
        GLFW_X11_XCB_VULKAN_SURFACE = 0x52001,
        GLFW_X11_ONTHESPOT          = 0x52002;

    public static final int GLFW_WAYLAND_LIBDECOR = 0x53001;

    public static final int
        GLFW_ANY_PLATFORM     = 0x60000,
        GLFW_PLATFORM_WIN32   = 0x60001,
        GLFW_PLATFORM_COCOA   = 0x60002,
        GLFW_PLATFORM_WAYLAND = 0x60003,
        GLFW_PLATFORM_X11     = 0x60004,
        GLFW_PLATFORM_NULL    = 0x60005;

    public static final int GLFW_DONT_CARE = -1;

    public static final int
        GLFW_RED_BITS         = 0x21001,
        GLFW_GREEN_BITS       = 0x21002,
        GLFW_BLUE_BITS        = 0x21003,
        GLFW_ALPHA_BITS       = 0x21004,
        GLFW_DEPTH_BITS       = 0x21005,
        GLFW_STENCIL_BITS     = 0x21006,
        GLFW_ACCUM_RED_BITS   = 0x21007,
        GLFW_ACCUM_GREEN_BITS = 0x21008,
        GLFW_ACCUM_BLUE_BITS  = 0x21009,
        GLFW_ACCUM_ALPHA_BITS = 0x2100A,
        GLFW_AUX_BUFFERS      = 0x2100B,
        GLFW_STEREO           = 0x2100C,
        GLFW_SAMPLES          = 0x2100D,
        GLFW_SRGB_CAPABLE     = 0x2100E,
        GLFW_REFRESH_RATE     = 0x2100F,
        GLFW_DOUBLEBUFFER     = 0x21010;

    public static final int
        GLFW_CLIENT_API               = 0x22001,
        GLFW_CONTEXT_VERSION_MAJOR    = 0x22002,
        GLFW_CONTEXT_VERSION_MINOR    = 0x22003,
        GLFW_CONTEXT_REVISION         = 0x22004,
        GLFW_CONTEXT_ROBUSTNESS       = 0x22005,
        GLFW_OPENGL_FORWARD_COMPAT    = 0x22006,
        GLFW_CONTEXT_DEBUG            = 0x22007,
        GLFW_OPENGL_DEBUG_CONTEXT     = GLFW_CONTEXT_DEBUG,
        GLFW_OPENGL_PROFILE           = 0x22008,
        GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x22009,
        GLFW_CONTEXT_NO_ERROR         = 0x2200A,
        GLFW_CONTEXT_CREATION_API     = 0x2200B,
        GLFW_SCALE_TO_MONITOR         = 0x2200C,
        GLFW_SCALE_FRAMEBUFFER        = 0x2200D;

    public static final int
        GLFW_COCOA_RETINA_FRAMEBUFFER = 0x23001,
        GLFW_COCOA_FRAME_NAME         = 0x23002,
        GLFW_COCOA_GRAPHICS_SWITCHING = 0x23003;

    public static final int
        GLFW_X11_CLASS_NAME    = 0x24001,
        GLFW_X11_INSTANCE_NAME = 0x24002;

    public static final int GLFW_WIN32_KEYBOARD_MENU = 0x25001;

    public static final int GLFW_WIN32_SHOWDEFAULT = 0x25002;

    public static final int GLFW_WAYLAND_APP_ID = 0x26001;

    public static final int
        GLFW_NO_API        = 0,
        GLFW_OPENGL_API    = 0x30001,
        GLFW_OPENGL_ES_API = 0x30002;

    public static final int
        GLFW_NO_ROBUSTNESS         = 0,
        GLFW_NO_RESET_NOTIFICATION = 0x31001,
        GLFW_LOSE_CONTEXT_ON_RESET = 0x31002;

    public static final int
        GLFW_OPENGL_ANY_PROFILE    = 0,
        GLFW_OPENGL_CORE_PROFILE   = 0x32001,
        GLFW_OPENGL_COMPAT_PROFILE = 0x32002;

    public static final int
        GLFW_ANY_RELEASE_BEHAVIOR   = 0,
        GLFW_RELEASE_BEHAVIOR_FLUSH = 0x35001,
        GLFW_RELEASE_BEHAVIOR_NONE  = 0x35002;

    public static final int
        GLFW_NATIVE_CONTEXT_API = 0x36001,
        GLFW_EGL_CONTEXT_API    = 0x36002,
        GLFW_OSMESA_CONTEXT_API = 0x36003;

    public static final int
        GLFW_ANGLE_PLATFORM_TYPE_NONE     = 0x37001,
        GLFW_ANGLE_PLATFORM_TYPE_OPENGL   = 0x37002,
        GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x37003,
        GLFW_ANGLE_PLATFORM_TYPE_D3D9     = 0x37004,
        GLFW_ANGLE_PLATFORM_TYPE_D3D11    = 0x37005,
        GLFW_ANGLE_PLATFORM_TYPE_VULKAN   = 0x37007,
        GLFW_ANGLE_PLATFORM_TYPE_METAL    = 0x37008;

    public static final int
        GLFW_WAYLAND_PREFER_LIBDECOR  = 0x38001,
        GLFW_WAYLAND_DISABLE_LIBDECOR = 0x38002;

    protected GLFW() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwInit ] ---

    /** {@code int glfwInit(void)} */
    @NativeType("int")
    public static boolean glfwInit() {
        long __functionAddress = Functions.Init;
        EventLoop.check();
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glfwTerminate ] ---

    /** {@code void glfwTerminate(void)} */
    public static void glfwTerminate() {
        long __functionAddress = Functions.Terminate;
        invokeV(__functionAddress);
    }

    // --- [ glfwInitHint ] ---

    /** {@code void glfwInitHint(int hint, int value)} */
    public static void glfwInitHint(int hint, int value) {
        long __functionAddress = Functions.InitHint;
        invokeV(hint, value, __functionAddress);
    }

    // --- [ glfwInitAllocator ] ---

    /** {@code void glfwInitAllocator(GLFWallocator const * allocator)} */
    public static void nglfwInitAllocator(long allocator) {
        long __functionAddress = Functions.InitAllocator;
        if (CHECKS) {
            if (allocator != NULL) { GLFWAllocator.validate(allocator); }
        }
        invokePV(allocator, __functionAddress);
    }

    /** {@code void glfwInitAllocator(GLFWallocator const * allocator)} */
    public static void glfwInitAllocator(@NativeType("GLFWallocator const *") @Nullable GLFWAllocator allocator) {
        nglfwInitAllocator(memAddressSafe(allocator));
    }

    // --- [ glfwGetVersion ] ---

    /** {@code void glfwGetVersion(int * major, int * minor, int * rev)} */
    public static void nglfwGetVersion(long major, long minor, long rev) {
        long __functionAddress = Functions.GetVersion;
        invokePPPV(major, minor, rev, __functionAddress);
    }

    /** {@code void glfwGetVersion(int * major, int * minor, int * rev)} */
    public static void glfwGetVersion(@NativeType("int *") @Nullable IntBuffer major, @NativeType("int *") @Nullable IntBuffer minor, @NativeType("int *") @Nullable IntBuffer rev) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(rev, 1);
        }
        nglfwGetVersion(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(rev));
    }

    // --- [ glfwGetVersionString ] ---

    /** {@code char const * glfwGetVersionString(void)} */
    public static long nglfwGetVersionString() {
        long __functionAddress = Functions.GetVersionString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * glfwGetVersionString(void)} */
    @NativeType("char const *")
    public static String glfwGetVersionString() {
        long __result = nglfwGetVersionString();
        return memASCII(__result);
    }

    // --- [ glfwGetError ] ---

    /** {@code int glfwGetError(char const ** description)} */
    public static int nglfwGetError(long description) {
        long __functionAddress = Functions.GetError;
        return invokePI(description, __functionAddress);
    }

    /** {@code int glfwGetError(char const ** description)} */
    public static int glfwGetError(@NativeType("char const **") @Nullable PointerBuffer description) {
        if (CHECKS) {
            checkSafe(description, 1);
        }
        return nglfwGetError(memAddressSafe(description));
    }

    // --- [ glfwSetErrorCallback ] ---

    /** {@code GLFWerrorfun glfwSetErrorCallback(GLFWerrorfun cbfun)} */
    public static long nglfwSetErrorCallback(long cbfun) {
        long __functionAddress = Functions.SetErrorCallback;
        return invokePP(cbfun, __functionAddress);
    }

    /** {@code GLFWerrorfun glfwSetErrorCallback(GLFWerrorfun cbfun)} */
    @NativeType("GLFWerrorfun")
    public static @Nullable GLFWErrorCallback glfwSetErrorCallback(@NativeType("GLFWerrorfun") @Nullable GLFWErrorCallbackI cbfun) {
        return GLFWErrorCallback.createSafe(nglfwSetErrorCallback(memAddressSafe(cbfun)));
    }

    // --- [ glfwGetPlatform ] ---

    /** {@code int glfwGetPlatform(void)} */
    public static int glfwGetPlatform() {
        long __functionAddress = Functions.GetPlatform;
        return invokeI(__functionAddress);
    }

    // --- [ glfwPlatformSupported ] ---

    /** {@code int glfwPlatformSupported(int platform)} */
    @NativeType("int")
    public static boolean glfwPlatformSupported(int platform) {
        long __functionAddress = Functions.PlatformSupported;
        return invokeI(platform, __functionAddress) != 0;
    }

    // --- [ glfwGetMonitors ] ---

    /** {@code GLFWmonitor ** glfwGetMonitors(int * count)} */
    public static long nglfwGetMonitors(long count) {
        long __functionAddress = Functions.GetMonitors;
        return invokePP(count, __functionAddress);
    }

    /** {@code GLFWmonitor ** glfwGetMonitors(int * count)} */
    @NativeType("GLFWmonitor **")
    public static @Nullable PointerBuffer glfwGetMonitors() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nglfwGetMonitors(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetPrimaryMonitor ] ---

    /** {@code GLFWmonitor * glfwGetPrimaryMonitor(void)} */
    @NativeType("GLFWmonitor *")
    public static long glfwGetPrimaryMonitor() {
        long __functionAddress = Functions.GetPrimaryMonitor;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetMonitorPos ] ---

    /** {@code void glfwGetMonitorPos(GLFWmonitor * monitor, int * xpos, int * ypos)} */
    public static void nglfwGetMonitorPos(long monitor, long xpos, long ypos) {
        long __functionAddress = Functions.GetMonitorPos;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPV(monitor, xpos, ypos, __functionAddress);
    }

    /** {@code void glfwGetMonitorPos(GLFWmonitor * monitor, int * xpos, int * ypos)} */
    public static void glfwGetMonitorPos(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") @Nullable IntBuffer xpos, @NativeType("int *") @Nullable IntBuffer ypos) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
    }

    // --- [ glfwGetMonitorWorkarea ] ---

    /** {@code void glfwGetMonitorWorkarea(GLFWmonitor * monitor, int * xpos, int * ypos, int * width, int * height)} */
    public static void nglfwGetMonitorWorkarea(long monitor, long xpos, long ypos, long width, long height) {
        long __functionAddress = Functions.GetMonitorWorkarea;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPPPV(monitor, xpos, ypos, width, height, __functionAddress);
    }

    /** {@code void glfwGetMonitorWorkarea(GLFWmonitor * monitor, int * xpos, int * ypos, int * width, int * height)} */
    public static void glfwGetMonitorWorkarea(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") @Nullable IntBuffer xpos, @NativeType("int *") @Nullable IntBuffer ypos, @NativeType("int *") @Nullable IntBuffer width, @NativeType("int *") @Nullable IntBuffer height) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        nglfwGetMonitorWorkarea(monitor, memAddressSafe(xpos), memAddressSafe(ypos), memAddressSafe(width), memAddressSafe(height));
    }

    // --- [ glfwGetMonitorPhysicalSize ] ---

    /** {@code void glfwGetMonitorPhysicalSize(GLFWmonitor * monitor, int * widthMM, int * heightMM)} */
    public static void nglfwGetMonitorPhysicalSize(long monitor, long widthMM, long heightMM) {
        long __functionAddress = Functions.GetMonitorPhysicalSize;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPV(monitor, widthMM, heightMM, __functionAddress);
    }

    /** {@code void glfwGetMonitorPhysicalSize(GLFWmonitor * monitor, int * widthMM, int * heightMM)} */
    public static void glfwGetMonitorPhysicalSize(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") @Nullable IntBuffer widthMM, @NativeType("int *") @Nullable IntBuffer heightMM) {
        if (CHECKS) {
            checkSafe(widthMM, 1);
            checkSafe(heightMM, 1);
        }
        nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(widthMM), memAddressSafe(heightMM));
    }

    // --- [ glfwGetMonitorContentScale ] ---

    /** {@code void glfwGetMonitorContentScale(GLFWmonitor * monitor, float * xscale, float * yscale)} */
    public static void nglfwGetMonitorContentScale(long monitor, long xscale, long yscale) {
        long __functionAddress = Functions.GetMonitorContentScale;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPV(monitor, xscale, yscale, __functionAddress);
    }

    /** {@code void glfwGetMonitorContentScale(GLFWmonitor * monitor, float * xscale, float * yscale)} */
    public static void glfwGetMonitorContentScale(@NativeType("GLFWmonitor *") long monitor, @NativeType("float *") @Nullable FloatBuffer xscale, @NativeType("float *") @Nullable FloatBuffer yscale) {
        if (CHECKS) {
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        nglfwGetMonitorContentScale(monitor, memAddressSafe(xscale), memAddressSafe(yscale));
    }

    // --- [ glfwGetMonitorName ] ---

    /** {@code char const * glfwGetMonitorName(GLFWmonitor * monitor)} */
    public static long nglfwGetMonitorName(long monitor) {
        long __functionAddress = Functions.GetMonitorName;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /** {@code char const * glfwGetMonitorName(GLFWmonitor * monitor)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetMonitorName(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetMonitorName(monitor);
        return memUTF8Safe(__result);
    }

    // --- [ glfwSetMonitorUserPointer ] ---

    /** {@code void glfwSetMonitorUserPointer(GLFWmonitor * monitor, void * pointer)} */
    public static void glfwSetMonitorUserPointer(@NativeType("GLFWmonitor *") long monitor, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.SetMonitorUserPointer;
        if (CHECKS) {
            check(monitor);
            check(pointer);
        }
        invokePPV(monitor, pointer, __functionAddress);
    }

    // --- [ glfwGetMonitorUserPointer ] ---

    /** {@code void * glfwGetMonitorUserPointer(GLFWmonitor * monitor)} */
    @NativeType("void *")
    public static long glfwGetMonitorUserPointer(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetMonitorUserPointer;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    // --- [ glfwSetMonitorCallback ] ---

    /** {@code GLFWmonitorfun glfwSetMonitorCallback(GLFWmonitorfun cbfun)} */
    public static long nglfwSetMonitorCallback(long cbfun) {
        long __functionAddress = Functions.SetMonitorCallback;
        return invokePP(cbfun, __functionAddress);
    }

    /** {@code GLFWmonitorfun glfwSetMonitorCallback(GLFWmonitorfun cbfun)} */
    @NativeType("GLFWmonitorfun")
    public static @Nullable GLFWMonitorCallback glfwSetMonitorCallback(@NativeType("GLFWmonitorfun") @Nullable GLFWMonitorCallbackI cbfun) {
        return GLFWMonitorCallback.createSafe(nglfwSetMonitorCallback(memAddressSafe(cbfun)));
    }

    // --- [ glfwGetVideoModes ] ---

    /** {@code GLFWvidmode const * glfwGetVideoModes(GLFWmonitor * monitor, int * count)} */
    public static long nglfwGetVideoModes(long monitor, long count) {
        long __functionAddress = Functions.GetVideoModes;
        if (CHECKS) {
            check(monitor);
        }
        return invokePPP(monitor, count, __functionAddress);
    }

    /** {@code GLFWvidmode const * glfwGetVideoModes(GLFWmonitor * monitor, int * count)} */
    @NativeType("GLFWvidmode const *")
    public static GLFWVidMode.@Nullable Buffer glfwGetVideoModes(@NativeType("GLFWmonitor *") long monitor) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nglfwGetVideoModes(monitor, memAddress(count));
            return GLFWVidMode.createSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetVideoMode ] ---

    /** {@code GLFWvidmode const * glfwGetVideoMode(GLFWmonitor * monitor)} */
    public static long nglfwGetVideoMode(long monitor) {
        long __functionAddress = Functions.GetVideoMode;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /** {@code GLFWvidmode const * glfwGetVideoMode(GLFWmonitor * monitor)} */
    @NativeType("GLFWvidmode const *")
    public static @Nullable GLFWVidMode glfwGetVideoMode(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetVideoMode(monitor);
        return GLFWVidMode.createSafe(__result);
    }

    // --- [ glfwSetGamma ] ---

    /** {@code void glfwSetGamma(GLFWmonitor * monitor, float gamma)} */
    public static void glfwSetGamma(@NativeType("GLFWmonitor *") long monitor, float gamma) {
        long __functionAddress = Functions.SetGamma;
        if (CHECKS) {
            check(monitor);
        }
        invokePV(monitor, gamma, __functionAddress);
    }

    // --- [ glfwGetGammaRamp ] ---

    /** {@code GLFWgammaramp const * glfwGetGammaRamp(GLFWmonitor * monitor)} */
    public static long nglfwGetGammaRamp(long monitor) {
        long __functionAddress = Functions.GetGammaRamp;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /** {@code GLFWgammaramp const * glfwGetGammaRamp(GLFWmonitor * monitor)} */
    @NativeType("GLFWgammaramp const *")
    public static @Nullable GLFWGammaRamp glfwGetGammaRamp(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetGammaRamp(monitor);
        return GLFWGammaRamp.createSafe(__result);
    }

    // --- [ glfwSetGammaRamp ] ---

    /** {@code void glfwSetGammaRamp(GLFWmonitor * monitor, GLFWgammaramp const * ramp)} */
    public static void nglfwSetGammaRamp(long monitor, long ramp) {
        long __functionAddress = Functions.SetGammaRamp;
        if (CHECKS) {
            check(monitor);
            GLFWGammaRamp.validate(ramp);
        }
        invokePPV(monitor, ramp, __functionAddress);
    }

    /** {@code void glfwSetGammaRamp(GLFWmonitor * monitor, GLFWgammaramp const * ramp)} */
    public static void glfwSetGammaRamp(@NativeType("GLFWmonitor *") long monitor, @NativeType("GLFWgammaramp const *") GLFWGammaRamp ramp) {
        nglfwSetGammaRamp(monitor, ramp.address());
    }

    // --- [ glfwDefaultWindowHints ] ---

    /** {@code void glfwDefaultWindowHints(void)} */
    public static void glfwDefaultWindowHints() {
        long __functionAddress = Functions.DefaultWindowHints;
        invokeV(__functionAddress);
    }

    // --- [ glfwWindowHint ] ---

    /** {@code void glfwWindowHint(int hint, int value)} */
    public static void glfwWindowHint(int hint, int value) {
        long __functionAddress = Functions.WindowHint;
        invokeV(hint, value, __functionAddress);
    }

    // --- [ glfwWindowHintString ] ---

    /** {@code void glfwWindowHintString(int hint, char const * value)} */
    public static void nglfwWindowHintString(int hint, long value) {
        long __functionAddress = Functions.WindowHintString;
        invokePV(hint, value, __functionAddress);
    }

    /** {@code void glfwWindowHintString(int hint, char const * value)} */
    public static void glfwWindowHintString(int hint, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
        }
        nglfwWindowHintString(hint, memAddress(value));
    }

    /** {@code void glfwWindowHintString(int hint, char const * value)} */
    public static void glfwWindowHintString(int hint, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            nglfwWindowHintString(hint, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwCreateWindow ] ---

    /** {@code GLFWwindow * glfwCreateWindow(int width, int height, char const * title, GLFWmonitor * monitor, GLFWwindow * share)} */
    public static long nglfwCreateWindow(int width, int height, long title, long monitor, long share) {
        long __functionAddress = Functions.CreateWindow;
        return invokePPPP(width, height, title, monitor, share, __functionAddress);
    }

    /** {@code GLFWwindow * glfwCreateWindow(int width, int height, char const * title, GLFWmonitor * monitor, GLFWwindow * share)} */
    @NativeType("GLFWwindow *")
    public static long glfwCreateWindow(int width, int height, @NativeType("char const *") ByteBuffer title, @NativeType("GLFWmonitor *") long monitor, @NativeType("GLFWwindow *") long share) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nglfwCreateWindow(width, height, memAddress(title), monitor, share);
    }

    /** {@code GLFWwindow * glfwCreateWindow(int width, int height, char const * title, GLFWmonitor * monitor, GLFWwindow * share)} */
    @NativeType("GLFWwindow *")
    public static long glfwCreateWindow(int width, int height, @NativeType("char const *") CharSequence title, @NativeType("GLFWmonitor *") long monitor, @NativeType("GLFWwindow *") long share) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nglfwCreateWindow(width, height, titleEncoded, monitor, share);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwDestroyWindow ] ---

    /** {@code void glfwDestroyWindow(GLFWwindow * window)} */
    public static void glfwDestroyWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        invokePV(window, __functionAddress);
    }

    // --- [ glfwWindowShouldClose ] ---

    /** {@code int glfwWindowShouldClose(GLFWwindow * window)} */
    @NativeType("int")
    public static boolean glfwWindowShouldClose(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.WindowShouldClose;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress) != 0;
    }

    // --- [ glfwSetWindowShouldClose ] ---

    /** {@code void glfwSetWindowShouldClose(GLFWwindow * window, int value)} */
    public static void glfwSetWindowShouldClose(@NativeType("GLFWwindow *") long window, @NativeType("int") boolean value) {
        long __functionAddress = Functions.SetWindowShouldClose;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, value ? 1 : 0, __functionAddress);
    }

    // --- [ glfwGetWindowTitle ] ---

    /** {@code char const * glfwGetWindowTitle(GLFWwindow * window)} */
    public static long nglfwGetWindowTitle(long window) {
        long __functionAddress = Functions.GetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code char const * glfwGetWindowTitle(GLFWwindow * window)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetWindowTitle(@NativeType("GLFWwindow *") long window) {
        long __result = nglfwGetWindowTitle(window);
        return memUTF8Safe(__result);
    }

    // --- [ glfwSetWindowTitle ] ---

    /** {@code void glfwSetWindowTitle(GLFWwindow * window, char const * title)} */
    public static void nglfwSetWindowTitle(long window, long title) {
        long __functionAddress = Functions.SetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, title, __functionAddress);
    }

    /** {@code void glfwSetWindowTitle(GLFWwindow * window, char const * title)} */
    public static void glfwSetWindowTitle(@NativeType("GLFWwindow *") long window, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        nglfwSetWindowTitle(window, memAddress(title));
    }

    /** {@code void glfwSetWindowTitle(GLFWwindow * window, char const * title)} */
    public static void glfwSetWindowTitle(@NativeType("GLFWwindow *") long window, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            nglfwSetWindowTitle(window, titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwSetWindowIcon ] ---

    /** {@code void glfwSetWindowIcon(GLFWwindow * window, int count, GLFWimage const * images)} */
    public static void nglfwSetWindowIcon(long window, int count, long images) {
        long __functionAddress = Functions.SetWindowIcon;
        if (CHECKS) {
            check(window);
            if (images != NULL) { Struct.validate(images, count, GLFWImage.SIZEOF, GLFWImage::validate); }
        }
        invokePPV(window, count, images, __functionAddress);
    }

    /** {@code void glfwSetWindowIcon(GLFWwindow * window, int count, GLFWimage const * images)} */
    public static void glfwSetWindowIcon(@NativeType("GLFWwindow *") long window, @NativeType("GLFWimage const *") GLFWImage.@Nullable Buffer images) {
        nglfwSetWindowIcon(window, remainingSafe(images), memAddressSafe(images));
    }

    // --- [ glfwGetWindowPos ] ---

    /** {@code void glfwGetWindowPos(GLFWwindow * window, int * xpos, int * ypos)} */
    public static void nglfwGetWindowPos(long window, long xpos, long ypos) {
        long __functionAddress = Functions.GetWindowPos;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /** {@code void glfwGetWindowPos(GLFWwindow * window, int * xpos, int * ypos)} */
    public static void glfwGetWindowPos(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer xpos, @NativeType("int *") @Nullable IntBuffer ypos) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        nglfwGetWindowPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
    }

    // --- [ glfwSetWindowPos ] ---

    /** {@code void glfwSetWindowPos(GLFWwindow * window, int xpos, int ypos)} */
    public static void glfwSetWindowPos(@NativeType("GLFWwindow *") long window, int xpos, int ypos) {
        long __functionAddress = Functions.SetWindowPos;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, xpos, ypos, __functionAddress);
    }

    // --- [ glfwGetWindowSize ] ---

    /** {@code void glfwGetWindowSize(GLFWwindow * window, int * width, int * height)} */
    public static void nglfwGetWindowSize(long window, long width, long height) {
        long __functionAddress = Functions.GetWindowSize;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /** {@code void glfwGetWindowSize(GLFWwindow * window, int * width, int * height)} */
    public static void glfwGetWindowSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer width, @NativeType("int *") @Nullable IntBuffer height) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
    }

    // --- [ glfwSetWindowSizeLimits ] ---

    /** {@code void glfwSetWindowSizeLimits(GLFWwindow * window, int minwidth, int minheight, int maxwidth, int maxheight)} */
    public static void glfwSetWindowSizeLimits(@NativeType("GLFWwindow *") long window, int minwidth, int minheight, int maxwidth, int maxheight) {
        long __functionAddress = Functions.SetWindowSizeLimits;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, minwidth, minheight, maxwidth, maxheight, __functionAddress);
    }

    // --- [ glfwSetWindowAspectRatio ] ---

    /** {@code void glfwSetWindowAspectRatio(GLFWwindow * window, int numer, int denom)} */
    public static void glfwSetWindowAspectRatio(@NativeType("GLFWwindow *") long window, int numer, int denom) {
        long __functionAddress = Functions.SetWindowAspectRatio;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, numer, denom, __functionAddress);
    }

    // --- [ glfwSetWindowSize ] ---

    /** {@code void glfwSetWindowSize(GLFWwindow * window, int width, int height)} */
    public static void glfwSetWindowSize(@NativeType("GLFWwindow *") long window, int width, int height) {
        long __functionAddress = Functions.SetWindowSize;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, width, height, __functionAddress);
    }

    // --- [ glfwGetFramebufferSize ] ---

    /** {@code void glfwGetFramebufferSize(GLFWwindow * window, int * width, int * height)} */
    public static void nglfwGetFramebufferSize(long window, long width, long height) {
        long __functionAddress = Functions.GetFramebufferSize;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /** {@code void glfwGetFramebufferSize(GLFWwindow * window, int * width, int * height)} */
    public static void glfwGetFramebufferSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer width, @NativeType("int *") @Nullable IntBuffer height) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
    }

    // --- [ glfwGetWindowFrameSize ] ---

    /** {@code void glfwGetWindowFrameSize(GLFWwindow * window, int * left, int * top, int * right, int * bottom)} */
    public static void nglfwGetWindowFrameSize(long window, long left, long top, long right, long bottom) {
        long __functionAddress = Functions.GetWindowFrameSize;
        if (CHECKS) {
            check(window);
        }
        invokePPPPPV(window, left, top, right, bottom, __functionAddress);
    }

    /** {@code void glfwGetWindowFrameSize(GLFWwindow * window, int * left, int * top, int * right, int * bottom)} */
    public static void glfwGetWindowFrameSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer left, @NativeType("int *") @Nullable IntBuffer top, @NativeType("int *") @Nullable IntBuffer right, @NativeType("int *") @Nullable IntBuffer bottom) {
        if (CHECKS) {
            checkSafe(left, 1);
            checkSafe(top, 1);
            checkSafe(right, 1);
            checkSafe(bottom, 1);
        }
        nglfwGetWindowFrameSize(window, memAddressSafe(left), memAddressSafe(top), memAddressSafe(right), memAddressSafe(bottom));
    }

    // --- [ glfwGetWindowContentScale ] ---

    /** {@code void glfwGetWindowContentScale(GLFWwindow * window, float * xscale, float * yscale)} */
    public static void nglfwGetWindowContentScale(long window, long xscale, long yscale) {
        long __functionAddress = Functions.GetWindowContentScale;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, xscale, yscale, __functionAddress);
    }

    /** {@code void glfwGetWindowContentScale(GLFWwindow * window, float * xscale, float * yscale)} */
    public static void glfwGetWindowContentScale(@NativeType("GLFWwindow *") long window, @NativeType("float *") @Nullable FloatBuffer xscale, @NativeType("float *") @Nullable FloatBuffer yscale) {
        if (CHECKS) {
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        nglfwGetWindowContentScale(window, memAddressSafe(xscale), memAddressSafe(yscale));
    }

    // --- [ glfwGetWindowOpacity ] ---

    /** {@code float glfwGetWindowOpacity(GLFWwindow * window)} */
    public static float glfwGetWindowOpacity(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ glfwSetWindowOpacity ] ---

    /** {@code void glfwSetWindowOpacity(GLFWwindow * window, float opacity)} */
    public static void glfwSetWindowOpacity(@NativeType("GLFWwindow *") long window, float opacity) {
        long __functionAddress = Functions.SetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, opacity, __functionAddress);
    }

    // --- [ glfwIconifyWindow ] ---

    /** {@code void glfwIconifyWindow(GLFWwindow * window)} */
    public static void glfwIconifyWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.IconifyWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwRestoreWindow ] ---

    /** {@code void glfwRestoreWindow(GLFWwindow * window)} */
    public static void glfwRestoreWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.RestoreWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwMaximizeWindow ] ---

    /** {@code void glfwMaximizeWindow(GLFWwindow * window)} */
    public static void glfwMaximizeWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.MaximizeWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwShowWindow ] ---

    /** {@code void glfwShowWindow(GLFWwindow * window)} */
    public static void glfwShowWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.ShowWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwHideWindow ] ---

    /** {@code void glfwHideWindow(GLFWwindow * window)} */
    public static void glfwHideWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.HideWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwFocusWindow ] ---

    /** {@code void glfwFocusWindow(GLFWwindow * window)} */
    public static void glfwFocusWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.FocusWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwRequestWindowAttention ] ---

    /** {@code void glfwRequestWindowAttention(GLFWwindow * window)} */
    public static void glfwRequestWindowAttention(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.RequestWindowAttention;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwGetWindowMonitor ] ---

    /** {@code GLFWmonitor * glfwGetWindowMonitor(GLFWwindow * window)} */
    @NativeType("GLFWmonitor *")
    public static long glfwGetWindowMonitor(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWindowMonitor;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwSetWindowMonitor ] ---

    /** {@code void glfwSetWindowMonitor(GLFWwindow * window, GLFWmonitor * monitor, int xpos, int ypos, int width, int height, int refreshRate)} */
    public static void glfwSetWindowMonitor(@NativeType("GLFWwindow *") long window, @NativeType("GLFWmonitor *") long monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        long __functionAddress = Functions.SetWindowMonitor;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, monitor, xpos, ypos, width, height, refreshRate, __functionAddress);
    }

    // --- [ glfwGetWindowAttrib ] ---

    /** {@code int glfwGetWindowAttrib(GLFWwindow * window, int attrib)} */
    public static int glfwGetWindowAttrib(@NativeType("GLFWwindow *") long window, int attrib) {
        long __functionAddress = Functions.GetWindowAttrib;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, attrib, __functionAddress);
    }

    // --- [ glfwSetWindowAttrib ] ---

    /** {@code void glfwSetWindowAttrib(GLFWwindow * window, int attrib, int value)} */
    public static void glfwSetWindowAttrib(@NativeType("GLFWwindow *") long window, int attrib, int value) {
        long __functionAddress = Functions.SetWindowAttrib;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, attrib, value, __functionAddress);
    }

    // --- [ glfwSetWindowUserPointer ] ---

    /** {@code void glfwSetWindowUserPointer(GLFWwindow * window, void * pointer)} */
    public static void glfwSetWindowUserPointer(@NativeType("GLFWwindow *") long window, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.SetWindowUserPointer;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, pointer, __functionAddress);
    }

    // --- [ glfwGetWindowUserPointer ] ---

    /** {@code void * glfwGetWindowUserPointer(GLFWwindow * window)} */
    @NativeType("void *")
    public static long glfwGetWindowUserPointer(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWindowUserPointer;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwSetWindowPosCallback ] ---

    /** {@code GLFWwindowposfun glfwSetWindowPosCallback(GLFWwindow * window, GLFWwindowposfun cbfun)} */
    public static long nglfwSetWindowPosCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowPosCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowposfun glfwSetWindowPosCallback(GLFWwindow * window, GLFWwindowposfun cbfun)} */
    @NativeType("GLFWwindowposfun")
    public static @Nullable GLFWWindowPosCallback glfwSetWindowPosCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowposfun") @Nullable GLFWWindowPosCallbackI cbfun) {
        return GLFWWindowPosCallback.createSafe(nglfwSetWindowPosCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowSizeCallback ] ---

    /** {@code GLFWwindowsizefun glfwSetWindowSizeCallback(GLFWwindow * window, GLFWwindowsizefun cbfun)} */
    public static long nglfwSetWindowSizeCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowSizeCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowsizefun glfwSetWindowSizeCallback(GLFWwindow * window, GLFWwindowsizefun cbfun)} */
    @NativeType("GLFWwindowsizefun")
    public static @Nullable GLFWWindowSizeCallback glfwSetWindowSizeCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowsizefun") @Nullable GLFWWindowSizeCallbackI cbfun) {
        return GLFWWindowSizeCallback.createSafe(nglfwSetWindowSizeCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowCloseCallback ] ---

    /** {@code GLFWwindowclosefun glfwSetWindowCloseCallback(GLFWwindow * window, GLFWwindowclosefun cbfun)} */
    public static long nglfwSetWindowCloseCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowCloseCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowclosefun glfwSetWindowCloseCallback(GLFWwindow * window, GLFWwindowclosefun cbfun)} */
    @NativeType("GLFWwindowclosefun")
    public static @Nullable GLFWWindowCloseCallback glfwSetWindowCloseCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowclosefun") @Nullable GLFWWindowCloseCallbackI cbfun) {
        return GLFWWindowCloseCallback.createSafe(nglfwSetWindowCloseCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowRefreshCallback ] ---

    /** {@code GLFWwindowrefreshfun glfwSetWindowRefreshCallback(GLFWwindow * window, GLFWwindowrefreshfun cbfun)} */
    public static long nglfwSetWindowRefreshCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowRefreshCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowrefreshfun glfwSetWindowRefreshCallback(GLFWwindow * window, GLFWwindowrefreshfun cbfun)} */
    @NativeType("GLFWwindowrefreshfun")
    public static @Nullable GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowrefreshfun") @Nullable GLFWWindowRefreshCallbackI cbfun) {
        return GLFWWindowRefreshCallback.createSafe(nglfwSetWindowRefreshCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowFocusCallback ] ---

    /** {@code GLFWwindowfocusfun glfwSetWindowFocusCallback(GLFWwindow * window, GLFWwindowfocusfun cbfun)} */
    public static long nglfwSetWindowFocusCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowFocusCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowfocusfun glfwSetWindowFocusCallback(GLFWwindow * window, GLFWwindowfocusfun cbfun)} */
    @NativeType("GLFWwindowfocusfun")
    public static @Nullable GLFWWindowFocusCallback glfwSetWindowFocusCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowfocusfun") @Nullable GLFWWindowFocusCallbackI cbfun) {
        return GLFWWindowFocusCallback.createSafe(nglfwSetWindowFocusCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowIconifyCallback ] ---

    /** {@code GLFWwindowiconifyfun glfwSetWindowIconifyCallback(GLFWwindow * window, GLFWwindowiconifyfun cbfun)} */
    public static long nglfwSetWindowIconifyCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowIconifyCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowiconifyfun glfwSetWindowIconifyCallback(GLFWwindow * window, GLFWwindowiconifyfun cbfun)} */
    @NativeType("GLFWwindowiconifyfun")
    public static @Nullable GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowiconifyfun") @Nullable GLFWWindowIconifyCallbackI cbfun) {
        return GLFWWindowIconifyCallback.createSafe(nglfwSetWindowIconifyCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowMaximizeCallback ] ---

    /** {@code GLFWwindowmaximizefun glfwSetWindowMaximizeCallback(GLFWwindow * window, GLFWwindowmaximizefun cbfun)} */
    public static long nglfwSetWindowMaximizeCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowMaximizeCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowmaximizefun glfwSetWindowMaximizeCallback(GLFWwindow * window, GLFWwindowmaximizefun cbfun)} */
    @NativeType("GLFWwindowmaximizefun")
    public static @Nullable GLFWWindowMaximizeCallback glfwSetWindowMaximizeCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowmaximizefun") @Nullable GLFWWindowMaximizeCallbackI cbfun) {
        return GLFWWindowMaximizeCallback.createSafe(nglfwSetWindowMaximizeCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetFramebufferSizeCallback ] ---

    /** {@code GLFWframebuffersizefun glfwSetFramebufferSizeCallback(GLFWwindow * window, GLFWframebuffersizefun cbfun)} */
    public static long nglfwSetFramebufferSizeCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetFramebufferSizeCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWframebuffersizefun glfwSetFramebufferSizeCallback(GLFWwindow * window, GLFWframebuffersizefun cbfun)} */
    @NativeType("GLFWframebuffersizefun")
    public static @Nullable GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWframebuffersizefun") @Nullable GLFWFramebufferSizeCallbackI cbfun) {
        return GLFWFramebufferSizeCallback.createSafe(nglfwSetFramebufferSizeCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowContentScaleCallback ] ---

    /** {@code GLFWwindowcontentscalefun glfwSetWindowContentScaleCallback(GLFWwindow * window, GLFWwindowcontentscalefun cbfun)} */
    public static long nglfwSetWindowContentScaleCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowContentScaleCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWwindowcontentscalefun glfwSetWindowContentScaleCallback(GLFWwindow * window, GLFWwindowcontentscalefun cbfun)} */
    @NativeType("GLFWwindowcontentscalefun")
    public static @Nullable GLFWWindowContentScaleCallback glfwSetWindowContentScaleCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWwindowcontentscalefun") @Nullable GLFWWindowContentScaleCallbackI cbfun) {
        return GLFWWindowContentScaleCallback.createSafe(nglfwSetWindowContentScaleCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwPollEvents ] ---

    /** {@code void glfwPollEvents(void)} */
    public static void glfwPollEvents() {
        long __functionAddress = Functions.PollEvents;
        invokeV(__functionAddress);
    }

    // --- [ glfwWaitEvents ] ---

    /** {@code void glfwWaitEvents(void)} */
    public static void glfwWaitEvents() {
        long __functionAddress = Functions.WaitEvents;
        invokeV(__functionAddress);
    }

    // --- [ glfwWaitEventsTimeout ] ---

    /** {@code void glfwWaitEventsTimeout(double timeout)} */
    public static void glfwWaitEventsTimeout(double timeout) {
        long __functionAddress = Functions.WaitEventsTimeout;
        invokeV(timeout, __functionAddress);
    }

    // --- [ glfwPostEmptyEvent ] ---

    /** {@code void glfwPostEmptyEvent(void)} */
    public static void glfwPostEmptyEvent() {
        long __functionAddress = Functions.PostEmptyEvent;
        invokeV(__functionAddress);
    }

    // --- [ glfwGetInputMode ] ---

    /** {@code int glfwGetInputMode(GLFWwindow * window, int mode)} */
    public static int glfwGetInputMode(@NativeType("GLFWwindow *") long window, int mode) {
        long __functionAddress = Functions.GetInputMode;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, mode, __functionAddress);
    }

    // --- [ glfwSetInputMode ] ---

    /** {@code void glfwSetInputMode(GLFWwindow * window, int mode, int value)} */
    public static void glfwSetInputMode(@NativeType("GLFWwindow *") long window, int mode, int value) {
        long __functionAddress = Functions.SetInputMode;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, mode, value, __functionAddress);
    }

    // --- [ glfwRawMouseMotionSupported ] ---

    /** {@code int glfwRawMouseMotionSupported(void)} */
    @NativeType("int")
    public static boolean glfwRawMouseMotionSupported() {
        long __functionAddress = Functions.RawMouseMotionSupported;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glfwGetKeyName ] ---

    /** {@code char const * glfwGetKeyName(int key, int scancode)} */
    public static long nglfwGetKeyName(int key, int scancode) {
        long __functionAddress = Functions.GetKeyName;
        return invokeP(key, scancode, __functionAddress);
    }

    /** {@code char const * glfwGetKeyName(int key, int scancode)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetKeyName(int key, int scancode) {
        long __result = nglfwGetKeyName(key, scancode);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetKeyScancode ] ---

    /** {@code int glfwGetKeyScancode(int key)} */
    public static int glfwGetKeyScancode(int key) {
        long __functionAddress = Functions.GetKeyScancode;
        return invokeI(key, __functionAddress);
    }

    // --- [ glfwGetKey ] ---

    /** {@code int glfwGetKey(GLFWwindow * window, int key)} */
    public static int glfwGetKey(@NativeType("GLFWwindow *") long window, int key) {
        long __functionAddress = Functions.GetKey;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, key, __functionAddress);
    }

    // --- [ glfwGetMouseButton ] ---

    /** {@code int glfwGetMouseButton(GLFWwindow * window, int button)} */
    public static int glfwGetMouseButton(@NativeType("GLFWwindow *") long window, int button) {
        long __functionAddress = Functions.GetMouseButton;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, button, __functionAddress);
    }

    // --- [ glfwGetCursorPos ] ---

    /** {@code void glfwGetCursorPos(GLFWwindow * window, double * xpos, double * ypos)} */
    public static void nglfwGetCursorPos(long window, long xpos, long ypos) {
        long __functionAddress = Functions.GetCursorPos;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /** {@code void glfwGetCursorPos(GLFWwindow * window, double * xpos, double * ypos)} */
    public static void glfwGetCursorPos(@NativeType("GLFWwindow *") long window, @NativeType("double *") @Nullable DoubleBuffer xpos, @NativeType("double *") @Nullable DoubleBuffer ypos) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        nglfwGetCursorPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
    }

    // --- [ glfwSetCursorPos ] ---

    /** {@code void glfwSetCursorPos(GLFWwindow * window, double xpos, double ypos)} */
    public static void glfwSetCursorPos(@NativeType("GLFWwindow *") long window, double xpos, double ypos) {
        long __functionAddress = Functions.SetCursorPos;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, xpos, ypos, __functionAddress);
    }

    // --- [ glfwCreateCursor ] ---

    /** {@code GLFWcursor * glfwCreateCursor(GLFWimage const * image, int xhot, int yhot)} */
    public static long nglfwCreateCursor(long image, int xhot, int yhot) {
        long __functionAddress = Functions.CreateCursor;
        if (CHECKS) {
            GLFWImage.validate(image);
        }
        return invokePP(image, xhot, yhot, __functionAddress);
    }

    /** {@code GLFWcursor * glfwCreateCursor(GLFWimage const * image, int xhot, int yhot)} */
    @NativeType("GLFWcursor *")
    public static long glfwCreateCursor(@NativeType("GLFWimage const *") GLFWImage image, int xhot, int yhot) {
        return nglfwCreateCursor(image.address(), xhot, yhot);
    }

    // --- [ glfwCreateStandardCursor ] ---

    /** {@code GLFWcursor * glfwCreateStandardCursor(int shape)} */
    @NativeType("GLFWcursor *")
    public static long glfwCreateStandardCursor(int shape) {
        long __functionAddress = Functions.CreateStandardCursor;
        return invokeP(shape, __functionAddress);
    }

    // --- [ glfwDestroyCursor ] ---

    /** {@code void glfwDestroyCursor(GLFWcursor * cursor)} */
    public static void glfwDestroyCursor(@NativeType("GLFWcursor *") long cursor) {
        long __functionAddress = Functions.DestroyCursor;
        if (CHECKS) {
            check(cursor);
        }
        invokePV(cursor, __functionAddress);
    }

    // --- [ glfwSetCursor ] ---

    /** {@code void glfwSetCursor(GLFWwindow * window, GLFWcursor * cursor)} */
    public static void glfwSetCursor(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursor *") long cursor) {
        long __functionAddress = Functions.SetCursor;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, cursor, __functionAddress);
    }

    // --- [ glfwGetPreeditCursorRectangle ] ---

    /** {@code void glfwGetPreeditCursorRectangle(GLFWwindow * window, int * x, int * y, int * w, int * h)} */
    public static void nglfwGetPreeditCursorRectangle(long window, long x, long y, long w, long h) {
        long __functionAddress = Functions.GetPreeditCursorRectangle;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        invokePPPPPV(window, x, y, w, h, __functionAddress);
    }

    /** {@code void glfwGetPreeditCursorRectangle(GLFWwindow * window, int * x, int * y, int * w, int * h)} */
    public static void glfwGetPreeditCursorRectangle(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer x, @NativeType("int *") @Nullable IntBuffer y, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        nglfwGetPreeditCursorRectangle(window, memAddressSafe(x), memAddressSafe(y), memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ glfwSetPreeditCursorRectangle ] ---

    /** {@code void glfwSetPreeditCursorRectangle(GLFWwindow * window, int x, int y, int w, int h)} */
    public static void glfwSetPreeditCursorRectangle(@NativeType("GLFWwindow *") long window, int x, int y, int w, int h) {
        long __functionAddress = Functions.SetPreeditCursorRectangle;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        invokePV(window, x, y, w, h, __functionAddress);
    }

    // --- [ glfwResetPreeditText ] ---

    /** {@code void glfwResetPreeditText(GLFWwindow * window)} */
    public static void glfwResetPreeditText(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.ResetPreeditText;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwGetPreeditCandidate ] ---

    /** {@code unsigned int * glfwGetPreeditCandidate(GLFWwindow * window, int index, int * textCount)} */
    public static long nglfwGetPreeditCandidate(long window, int index, long textCount) {
        long __functionAddress = Functions.GetPreeditCandidate;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        return invokePPP(window, index, textCount, __functionAddress);
    }

    /** {@code unsigned int * glfwGetPreeditCandidate(GLFWwindow * window, int index, int * textCount)} */
    @NativeType("unsigned int *")
    public static @Nullable IntBuffer glfwGetPreeditCandidate(@NativeType("GLFWwindow *") long window, int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer textCount = stack.callocInt(1);
        try {
            long __result = nglfwGetPreeditCandidate(window, index, memAddress(textCount));
            return memIntBufferSafe(__result, textCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwSetKeyCallback ] ---

    /** {@code GLFWkeyfun glfwSetKeyCallback(GLFWwindow * window, GLFWkeyfun cbfun)} */
    public static long nglfwSetKeyCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetKeyCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWkeyfun glfwSetKeyCallback(GLFWwindow * window, GLFWkeyfun cbfun)} */
    @NativeType("GLFWkeyfun")
    public static @Nullable GLFWKeyCallback glfwSetKeyCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWkeyfun") @Nullable GLFWKeyCallbackI cbfun) {
        return GLFWKeyCallback.createSafe(nglfwSetKeyCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCharCallback ] ---

    /** {@code GLFWcharfun glfwSetCharCallback(GLFWwindow * window, GLFWcharfun cbfun)} */
    public static long nglfwSetCharCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCharCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWcharfun glfwSetCharCallback(GLFWwindow * window, GLFWcharfun cbfun)} */
    @NativeType("GLFWcharfun")
    public static @Nullable GLFWCharCallback glfwSetCharCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcharfun") @Nullable GLFWCharCallbackI cbfun) {
        return GLFWCharCallback.createSafe(nglfwSetCharCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCharModsCallback ] ---

    /** {@code GLFWcharmodsfun glfwSetCharModsCallback(GLFWwindow * window, GLFWcharmodsfun cbfun)} */
    public static long nglfwSetCharModsCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCharModsCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWcharmodsfun glfwSetCharModsCallback(GLFWwindow * window, GLFWcharmodsfun cbfun)} */
    @NativeType("GLFWcharmodsfun")
    public static @Nullable GLFWCharModsCallback glfwSetCharModsCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcharmodsfun") @Nullable GLFWCharModsCallbackI cbfun) {
        return GLFWCharModsCallback.createSafe(nglfwSetCharModsCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetPreeditCallback ] ---

    /** {@code GLFWpreeditfun glfwSetPreeditCallback(GLFWwindow * window, GLFWpreeditfun cbfun)} */
    public static long nglfwSetPreeditCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetPreeditCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWpreeditfun glfwSetPreeditCallback(GLFWwindow * window, GLFWpreeditfun cbfun)} */
    @NativeType("GLFWpreeditfun")
    public static @Nullable GLFWPreeditCallback glfwSetPreeditCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWpreeditfun") @Nullable GLFWPreeditCallbackI cbfun) {
        return GLFWPreeditCallback.createSafe(nglfwSetPreeditCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetIMEStatusCallback ] ---

    /** {@code GLFWimestatusfun glfwSetIMEStatusCallback(GLFWwindow * window, GLFWimestatusfun cbfun)} */
    public static long nglfwSetIMEStatusCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetIMEStatusCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWimestatusfun glfwSetIMEStatusCallback(GLFWwindow * window, GLFWimestatusfun cbfun)} */
    @NativeType("GLFWimestatusfun")
    public static @Nullable GLFWIMEStatusCallback glfwSetIMEStatusCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWimestatusfun") @Nullable GLFWIMEStatusCallbackI cbfun) {
        return GLFWIMEStatusCallback.createSafe(nglfwSetIMEStatusCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetPreeditCandidateCallback ] ---

    /** {@code GLFWpreeditcandidatefun glfwSetPreeditCandidateCallback(GLFWwindow * window, GLFWpreeditcandidatefun cbfun)} */
    public static long nglfwSetPreeditCandidateCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetPreeditCandidateCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWpreeditcandidatefun glfwSetPreeditCandidateCallback(GLFWwindow * window, GLFWpreeditcandidatefun cbfun)} */
    @NativeType("GLFWpreeditcandidatefun")
    public static @Nullable GLFWPreeditCandidateCallback glfwSetPreeditCandidateCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWpreeditcandidatefun") @Nullable GLFWPreeditCandidateCallbackI cbfun) {
        return GLFWPreeditCandidateCallback.createSafe(nglfwSetPreeditCandidateCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetMouseButtonCallback ] ---

    /** {@code GLFWmousebuttonfun glfwSetMouseButtonCallback(GLFWwindow * window, GLFWmousebuttonfun cbfun)} */
    public static long nglfwSetMouseButtonCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetMouseButtonCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWmousebuttonfun glfwSetMouseButtonCallback(GLFWwindow * window, GLFWmousebuttonfun cbfun)} */
    @NativeType("GLFWmousebuttonfun")
    public static @Nullable GLFWMouseButtonCallback glfwSetMouseButtonCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWmousebuttonfun") @Nullable GLFWMouseButtonCallbackI cbfun) {
        return GLFWMouseButtonCallback.createSafe(nglfwSetMouseButtonCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCursorPosCallback ] ---

    /** {@code GLFWcursorposfun glfwSetCursorPosCallback(GLFWwindow * window, GLFWcursorposfun cbfun)} */
    public static long nglfwSetCursorPosCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCursorPosCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWcursorposfun glfwSetCursorPosCallback(GLFWwindow * window, GLFWcursorposfun cbfun)} */
    @NativeType("GLFWcursorposfun")
    public static @Nullable GLFWCursorPosCallback glfwSetCursorPosCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursorposfun") @Nullable GLFWCursorPosCallbackI cbfun) {
        return GLFWCursorPosCallback.createSafe(nglfwSetCursorPosCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCursorEnterCallback ] ---

    /** {@code GLFWcursorenterfun glfwSetCursorEnterCallback(GLFWwindow * window, GLFWcursorenterfun cbfun)} */
    public static long nglfwSetCursorEnterCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCursorEnterCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWcursorenterfun glfwSetCursorEnterCallback(GLFWwindow * window, GLFWcursorenterfun cbfun)} */
    @NativeType("GLFWcursorenterfun")
    public static @Nullable GLFWCursorEnterCallback glfwSetCursorEnterCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursorenterfun") @Nullable GLFWCursorEnterCallbackI cbfun) {
        return GLFWCursorEnterCallback.createSafe(nglfwSetCursorEnterCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetScrollCallback ] ---

    /** {@code GLFWscrollfun glfwSetScrollCallback(GLFWwindow * window, GLFWscrollfun cbfun)} */
    public static long nglfwSetScrollCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetScrollCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWscrollfun glfwSetScrollCallback(GLFWwindow * window, GLFWscrollfun cbfun)} */
    @NativeType("GLFWscrollfun")
    public static @Nullable GLFWScrollCallback glfwSetScrollCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWscrollfun") @Nullable GLFWScrollCallbackI cbfun) {
        return GLFWScrollCallback.createSafe(nglfwSetScrollCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetDropCallback ] ---

    /** {@code GLFWdropfun glfwSetDropCallback(GLFWwindow * window, GLFWdropfun cbfun)} */
    public static long nglfwSetDropCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetDropCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /** {@code GLFWdropfun glfwSetDropCallback(GLFWwindow * window, GLFWdropfun cbfun)} */
    @NativeType("GLFWdropfun")
    public static @Nullable GLFWDropCallback glfwSetDropCallback(@NativeType("GLFWwindow *") long window, @NativeType("GLFWdropfun") @Nullable GLFWDropCallbackI cbfun) {
        return GLFWDropCallback.createSafe(nglfwSetDropCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwJoystickPresent ] ---

    /** {@code int glfwJoystickPresent(int jid)} */
    @NativeType("int")
    public static boolean glfwJoystickPresent(int jid) {
        long __functionAddress = Functions.JoystickPresent;
        return invokeI(jid, __functionAddress) != 0;
    }

    // --- [ glfwGetJoystickAxes ] ---

    /** {@code float const * glfwGetJoystickAxes(int jid, int * count)} */
    public static long nglfwGetJoystickAxes(int jid, long count) {
        long __functionAddress = Functions.GetJoystickAxes;
        return invokePP(jid, count, __functionAddress);
    }

    /** {@code float const * glfwGetJoystickAxes(int jid, int * count)} */
    @NativeType("float const *")
    public static @Nullable FloatBuffer glfwGetJoystickAxes(int jid) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nglfwGetJoystickAxes(jid, memAddress(count));
            return memFloatBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetJoystickButtons ] ---

    /** {@code unsigned char const * glfwGetJoystickButtons(int jid, int * count)} */
    public static long nglfwGetJoystickButtons(int jid, long count) {
        long __functionAddress = Functions.GetJoystickButtons;
        return invokePP(jid, count, __functionAddress);
    }

    /** {@code unsigned char const * glfwGetJoystickButtons(int jid, int * count)} */
    @NativeType("unsigned char const *")
    public static @Nullable ByteBuffer glfwGetJoystickButtons(int jid) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nglfwGetJoystickButtons(jid, memAddress(count));
            return memByteBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetJoystickHats ] ---

    /** {@code unsigned char const * glfwGetJoystickHats(int jid, int * count)} */
    public static long nglfwGetJoystickHats(int jid, long count) {
        long __functionAddress = Functions.GetJoystickHats;
        return invokePP(jid, count, __functionAddress);
    }

    /** {@code unsigned char const * glfwGetJoystickHats(int jid, int * count)} */
    @NativeType("unsigned char const *")
    public static @Nullable ByteBuffer glfwGetJoystickHats(int jid) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nglfwGetJoystickHats(jid, memAddress(count));
            return memByteBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetJoystickName ] ---

    /** {@code char const * glfwGetJoystickName(int jid)} */
    public static long nglfwGetJoystickName(int jid) {
        long __functionAddress = Functions.GetJoystickName;
        return invokeP(jid, __functionAddress);
    }

    /** {@code char const * glfwGetJoystickName(int jid)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetJoystickName(int jid) {
        long __result = nglfwGetJoystickName(jid);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetJoystickGUID ] ---

    /** {@code char const * glfwGetJoystickGUID(int jid)} */
    public static long nglfwGetJoystickGUID(int jid) {
        long __functionAddress = Functions.GetJoystickGUID;
        return invokeP(jid, __functionAddress);
    }

    /** {@code char const * glfwGetJoystickGUID(int jid)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetJoystickGUID(int jid) {
        long __result = nglfwGetJoystickGUID(jid);
        return memUTF8Safe(__result);
    }

    // --- [ glfwSetJoystickUserPointer ] ---

    /** {@code void glfwSetJoystickUserPointer(int jid, void * pointer)} */
    public static void glfwSetJoystickUserPointer(int jid, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.SetJoystickUserPointer;
        if (CHECKS) {
            check(pointer);
        }
        invokePV(jid, pointer, __functionAddress);
    }

    // --- [ glfwGetJoystickUserPointer ] ---

    /** {@code void * glfwGetJoystickUserPointer(int jid)} */
    @NativeType("void *")
    public static long glfwGetJoystickUserPointer(int jid) {
        long __functionAddress = Functions.GetJoystickUserPointer;
        return invokeP(jid, __functionAddress);
    }

    // --- [ glfwJoystickIsGamepad ] ---

    /** {@code int glfwJoystickIsGamepad(int jid)} */
    @NativeType("int")
    public static boolean glfwJoystickIsGamepad(int jid) {
        long __functionAddress = Functions.JoystickIsGamepad;
        return invokeI(jid, __functionAddress) != 0;
    }

    // --- [ glfwSetJoystickCallback ] ---

    /** {@code GLFWjoystickfun glfwSetJoystickCallback(GLFWjoystickfun cbfun)} */
    public static long nglfwSetJoystickCallback(long cbfun) {
        long __functionAddress = Functions.SetJoystickCallback;
        return invokePP(cbfun, __functionAddress);
    }

    /** {@code GLFWjoystickfun glfwSetJoystickCallback(GLFWjoystickfun cbfun)} */
    @NativeType("GLFWjoystickfun")
    public static @Nullable GLFWJoystickCallback glfwSetJoystickCallback(@NativeType("GLFWjoystickfun") @Nullable GLFWJoystickCallbackI cbfun) {
        return GLFWJoystickCallback.createSafe(nglfwSetJoystickCallback(memAddressSafe(cbfun)));
    }

    // --- [ glfwUpdateGamepadMappings ] ---

    /** {@code int glfwUpdateGamepadMappings(char const * string)} */
    public static int nglfwUpdateGamepadMappings(long string) {
        long __functionAddress = Functions.UpdateGamepadMappings;
        return invokePI(string, __functionAddress);
    }

    /** {@code int glfwUpdateGamepadMappings(char const * string)} */
    @NativeType("int")
    public static boolean glfwUpdateGamepadMappings(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nglfwUpdateGamepadMappings(memAddress(string)) != 0;
    }

    // --- [ glfwGetGamepadName ] ---

    /** {@code char const * glfwGetGamepadName(int jid)} */
    public static long nglfwGetGamepadName(int jid) {
        long __functionAddress = Functions.GetGamepadName;
        return invokeP(jid, __functionAddress);
    }

    /** {@code char const * glfwGetGamepadName(int jid)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetGamepadName(int jid) {
        long __result = nglfwGetGamepadName(jid);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetGamepadState ] ---

    /** {@code int glfwGetGamepadState(int jid, GLFWgamepadstate * state)} */
    public static int nglfwGetGamepadState(int jid, long state) {
        long __functionAddress = Functions.GetGamepadState;
        return invokePI(jid, state, __functionAddress);
    }

    /** {@code int glfwGetGamepadState(int jid, GLFWgamepadstate * state)} */
    @NativeType("int")
    public static boolean glfwGetGamepadState(int jid, @NativeType("GLFWgamepadstate *") GLFWGamepadState state) {
        return nglfwGetGamepadState(jid, state.address()) != 0;
    }

    // --- [ glfwSetClipboardString ] ---

    /** {@code void glfwSetClipboardString(GLFWwindow * window, char const * string)} */
    public static void nglfwSetClipboardString(long window, long string) {
        long __functionAddress = Functions.SetClipboardString;
        invokePPV(window, string, __functionAddress);
    }

    /** {@code void glfwSetClipboardString(GLFWwindow * window, char const * string)} */
    public static void glfwSetClipboardString(@NativeType("GLFWwindow *") long window, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        nglfwSetClipboardString(window, memAddress(string));
    }

    /** {@code void glfwSetClipboardString(GLFWwindow * window, char const * string)} */
    public static void glfwSetClipboardString(@NativeType("GLFWwindow *") long window, @NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(string, true);
            long stringEncoded = stack.getPointerAddress();
            nglfwSetClipboardString(window, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetClipboardString ] ---

    /** {@code char const * glfwGetClipboardString(GLFWwindow * window)} */
    public static long nglfwGetClipboardString(long window) {
        long __functionAddress = Functions.GetClipboardString;
        return invokePP(window, __functionAddress);
    }

    /** {@code char const * glfwGetClipboardString(GLFWwindow * window)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetClipboardString(@NativeType("GLFWwindow *") long window) {
        long __result = nglfwGetClipboardString(window);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetTime ] ---

    /** {@code double glfwGetTime(void)} */
    public static double glfwGetTime() {
        long __functionAddress = Functions.GetTime;
        return invokeD(__functionAddress);
    }

    // --- [ glfwSetTime ] ---

    /** {@code void glfwSetTime(double time)} */
    public static void glfwSetTime(double time) {
        long __functionAddress = Functions.SetTime;
        invokeV(time, __functionAddress);
    }

    // --- [ glfwGetTimerValue ] ---

    /** {@code uint64_t glfwGetTimerValue(void)} */
    @NativeType("uint64_t")
    public static long glfwGetTimerValue() {
        long __functionAddress = Functions.GetTimerValue;
        return invokeJ(__functionAddress);
    }

    // --- [ glfwGetTimerFrequency ] ---

    /** {@code uint64_t glfwGetTimerFrequency(void)} */
    @NativeType("uint64_t")
    public static long glfwGetTimerFrequency() {
        long __functionAddress = Functions.GetTimerFrequency;
        return invokeJ(__functionAddress);
    }

    // --- [ glfwMakeContextCurrent ] ---

    /** {@code void glfwMakeContextCurrent(GLFWwindow * window)} */
    public static void glfwMakeContextCurrent(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.MakeContextCurrent;
        invokePV(window, __functionAddress);
    }

    // --- [ glfwGetCurrentContext ] ---

    /** {@code GLFWwindow * glfwGetCurrentContext(void)} */
    @NativeType("GLFWwindow *")
    public static long glfwGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return invokeP(__functionAddress);
    }

    // --- [ glfwSwapBuffers ] ---

    /** {@code void glfwSwapBuffers(GLFWwindow * window)} */
    public static void glfwSwapBuffers(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.SwapBuffers;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwSwapInterval ] ---

    /** {@code void glfwSwapInterval(int interval)} */
    public static void glfwSwapInterval(int interval) {
        long __functionAddress = Functions.SwapInterval;
        invokeV(interval, __functionAddress);
    }

    // --- [ glfwExtensionSupported ] ---

    /** {@code int glfwExtensionSupported(char const * extension)} */
    public static int nglfwExtensionSupported(long extension) {
        long __functionAddress = Functions.ExtensionSupported;
        return invokePI(extension, __functionAddress);
    }

    /** {@code int glfwExtensionSupported(char const * extension)} */
    @NativeType("int")
    public static boolean glfwExtensionSupported(@NativeType("char const *") ByteBuffer extension) {
        if (CHECKS) {
            checkNT1(extension);
        }
        return nglfwExtensionSupported(memAddress(extension)) != 0;
    }

    /** {@code int glfwExtensionSupported(char const * extension)} */
    @NativeType("int")
    public static boolean glfwExtensionSupported(@NativeType("char const *") CharSequence extension) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extension, true);
            long extensionEncoded = stack.getPointerAddress();
            return nglfwExtensionSupported(extensionEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetProcAddress ] ---

    /** {@code GLFWglproc glfwGetProcAddress(char const * procname)} */
    public static long nglfwGetProcAddress(long procname) {
        long __functionAddress = Functions.GetProcAddress;
        return invokePP(procname, __functionAddress);
    }

    /** {@code GLFWglproc glfwGetProcAddress(char const * procname)} */
    @NativeType("GLFWglproc")
    public static long glfwGetProcAddress(@NativeType("char const *") ByteBuffer procname) {
        if (CHECKS) {
            checkNT1(procname);
        }
        return nglfwGetProcAddress(memAddress(procname));
    }

    /** {@code GLFWglproc glfwGetProcAddress(char const * procname)} */
    @NativeType("GLFWglproc")
    public static long glfwGetProcAddress(@NativeType("char const *") CharSequence procname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procname, true);
            long procnameEncoded = stack.getPointerAddress();
            return nglfwGetProcAddress(procnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glfwGetVersion(int * major, int * minor, int * rev)} */
    public static void glfwGetVersion(@NativeType("int *") int @Nullable [] major, @NativeType("int *") int @Nullable [] minor, @NativeType("int *") int @Nullable [] rev) {
        long __functionAddress = Functions.GetVersion;
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(rev, 1);
        }
        invokePPPV(major, minor, rev, __functionAddress);
    }

    /** {@code void glfwGetMonitorPos(GLFWmonitor * monitor, int * xpos, int * ypos)} */
    public static void glfwGetMonitorPos(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") int @Nullable [] xpos, @NativeType("int *") int @Nullable [] ypos) {
        long __functionAddress = Functions.GetMonitorPos;
        if (CHECKS) {
            check(monitor);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        invokePPPV(monitor, xpos, ypos, __functionAddress);
    }

    /** {@code void glfwGetMonitorWorkarea(GLFWmonitor * monitor, int * xpos, int * ypos, int * width, int * height)} */
    public static void glfwGetMonitorWorkarea(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") int @Nullable [] xpos, @NativeType("int *") int @Nullable [] ypos, @NativeType("int *") int @Nullable [] width, @NativeType("int *") int @Nullable [] height) {
        long __functionAddress = Functions.GetMonitorWorkarea;
        if (CHECKS) {
            check(monitor);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        invokePPPPPV(monitor, xpos, ypos, width, height, __functionAddress);
    }

    /** {@code void glfwGetMonitorPhysicalSize(GLFWmonitor * monitor, int * widthMM, int * heightMM)} */
    public static void glfwGetMonitorPhysicalSize(@NativeType("GLFWmonitor *") long monitor, @NativeType("int *") int @Nullable [] widthMM, @NativeType("int *") int @Nullable [] heightMM) {
        long __functionAddress = Functions.GetMonitorPhysicalSize;
        if (CHECKS) {
            check(monitor);
            checkSafe(widthMM, 1);
            checkSafe(heightMM, 1);
        }
        invokePPPV(monitor, widthMM, heightMM, __functionAddress);
    }

    /** {@code void glfwGetMonitorContentScale(GLFWmonitor * monitor, float * xscale, float * yscale)} */
    public static void glfwGetMonitorContentScale(@NativeType("GLFWmonitor *") long monitor, @NativeType("float *") float @Nullable [] xscale, @NativeType("float *") float @Nullable [] yscale) {
        long __functionAddress = Functions.GetMonitorContentScale;
        if (CHECKS) {
            check(monitor);
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        invokePPPV(monitor, xscale, yscale, __functionAddress);
    }

    /** {@code void glfwGetWindowPos(GLFWwindow * window, int * xpos, int * ypos)} */
    public static void glfwGetWindowPos(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] xpos, @NativeType("int *") int @Nullable [] ypos) {
        long __functionAddress = Functions.GetWindowPos;
        if (CHECKS) {
            check(window);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /** {@code void glfwGetWindowSize(GLFWwindow * window, int * width, int * height)} */
    public static void glfwGetWindowSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] width, @NativeType("int *") int @Nullable [] height) {
        long __functionAddress = Functions.GetWindowSize;
        if (CHECKS) {
            check(window);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /** {@code void glfwGetFramebufferSize(GLFWwindow * window, int * width, int * height)} */
    public static void glfwGetFramebufferSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] width, @NativeType("int *") int @Nullable [] height) {
        long __functionAddress = Functions.GetFramebufferSize;
        if (CHECKS) {
            check(window);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /** {@code void glfwGetWindowFrameSize(GLFWwindow * window, int * left, int * top, int * right, int * bottom)} */
    public static void glfwGetWindowFrameSize(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] left, @NativeType("int *") int @Nullable [] top, @NativeType("int *") int @Nullable [] right, @NativeType("int *") int @Nullable [] bottom) {
        long __functionAddress = Functions.GetWindowFrameSize;
        if (CHECKS) {
            check(window);
            checkSafe(left, 1);
            checkSafe(top, 1);
            checkSafe(right, 1);
            checkSafe(bottom, 1);
        }
        invokePPPPPV(window, left, top, right, bottom, __functionAddress);
    }

    /** {@code void glfwGetWindowContentScale(GLFWwindow * window, float * xscale, float * yscale)} */
    public static void glfwGetWindowContentScale(@NativeType("GLFWwindow *") long window, @NativeType("float *") float @Nullable [] xscale, @NativeType("float *") float @Nullable [] yscale) {
        long __functionAddress = Functions.GetWindowContentScale;
        if (CHECKS) {
            check(window);
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        invokePPPV(window, xscale, yscale, __functionAddress);
    }

    /** {@code void glfwGetCursorPos(GLFWwindow * window, double * xpos, double * ypos)} */
    public static void glfwGetCursorPos(@NativeType("GLFWwindow *") long window, @NativeType("double *") double @Nullable [] xpos, @NativeType("double *") double @Nullable [] ypos) {
        long __functionAddress = Functions.GetCursorPos;
        if (CHECKS) {
            check(window);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /** {@code void glfwGetPreeditCursorRectangle(GLFWwindow * window, int * x, int * y, int * w, int * h)} */
    public static void glfwGetPreeditCursorRectangle(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] x, @NativeType("int *") int @Nullable [] y, @NativeType("int *") int @Nullable [] w, @NativeType("int *") int @Nullable [] h) {
        long __functionAddress = Functions.GetPreeditCursorRectangle;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        invokePPPPPV(window, x, y, w, h, __functionAddress);
    }

}