/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.glfw.org/docs/latest/">GLFW</a> library.
 * 
 * <p>GLFW is a free, Open Source, multi-platform library for opening a window, creating an OpenGL context and managing input. It is easy to integrate into
 * existing applications and does not lay claim to the main loop.</p>
 */
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
            SetKeyCallback                = apiGetFunctionAddress(GLFW, "glfwSetKeyCallback"),
            SetCharCallback               = apiGetFunctionAddress(GLFW, "glfwSetCharCallback"),
            SetCharModsCallback           = apiGetFunctionAddress(GLFW, "glfwSetCharModsCallback"),
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

    /**
     * The major version number of the GLFW header.
     * 
     * <p>This is incremented when the API is changed in non-compatible ways.</p>
     */
    public static final int GLFW_VERSION_MAJOR = 3;

    /**
     * The minor version number of the GLFW header.
     * 
     * <p>This is incremented when features are added to the API but it remains backward-compatible.</p>
     */
    public static final int GLFW_VERSION_MINOR = 4;

    /**
     * The revision number of the GLFW header.
     * 
     * <p>This is incremented when a bug fix release is made that does not contain any API changes.</p>
     */
    public static final int GLFW_VERSION_REVISION = 0;

    /** Boolean values. */
    public static final int
        GLFW_TRUE  = 1,
        GLFW_FALSE = 0;

    /** The key or button was released. */
    public static final int GLFW_RELEASE = 0;

    /** The key or button was pressed. */
    public static final int GLFW_PRESS = 1;

    /** The key was held down until it repeated. */
    public static final int GLFW_REPEAT = 2;

    /** Joystick hat states. */
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

    /** The unknown key. */
    public static final int GLFW_KEY_UNKNOWN = -1;

    /** Printable keys. */
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

    /** Function keys. */
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

    /** If this bit is set one or more Shift keys were held down. */
    public static final int GLFW_MOD_SHIFT = 0x1;

    /** If this bit is set one or more Control keys were held down. */
    public static final int GLFW_MOD_CONTROL = 0x2;

    /** If this bit is set one or more Alt keys were held down. */
    public static final int GLFW_MOD_ALT = 0x4;

    /** If this bit is set one or more Super keys were held down. */
    public static final int GLFW_MOD_SUPER = 0x8;

    /** If this bit is set the Caps Lock key is enabled and the {@link #GLFW_LOCK_KEY_MODS LOCK_KEY_MODS} input mode is set. */
    public static final int GLFW_MOD_CAPS_LOCK = 0x10;

    /** If this bit is set the Num Lock key is enabled and the {@link #GLFW_LOCK_KEY_MODS LOCK_KEY_MODS} input mode is set. */
    public static final int GLFW_MOD_NUM_LOCK = 0x20;

    /** Mouse buttons. See <a href="https://www.glfw.org/docs/latest/input.html#input_mouse_button">mouse button input</a> for how these are used. */
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

    /** Joysticks. See <a href="https://www.glfw.org/docs/latest/input.html#joystick">joystick input</a> for how these are used. */
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

    /** Gamepad buttons. See <a href="https://www.glfw.org/docs/latest/input.html#gamepad">gamepad</a> for how these are used. */
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

    /** Gamepad axes. See <a href="https://www.glfw.org/docs/latest/input.html#gamepad">gamepad</a> for how these are used. */
    public static final int
        GLFW_GAMEPAD_AXIS_LEFT_X        = 0,
        GLFW_GAMEPAD_AXIS_LEFT_Y        = 1,
        GLFW_GAMEPAD_AXIS_RIGHT_X       = 2,
        GLFW_GAMEPAD_AXIS_RIGHT_Y       = 3,
        GLFW_GAMEPAD_AXIS_LEFT_TRIGGER  = 4,
        GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        GLFW_GAMEPAD_AXIS_LAST          = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;

    /**
     * Error codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #GLFW_NO_ERROR NO_ERROR} - No error has occurred.</li>
     * <li>{@link #GLFW_NOT_INITIALIZED NOT_INITIALIZED} - 
     * GLFW has not been initialized.
     * 
     * <p>This occurs if a GLFW function was called that may not be called unless the library is initialized.</p>
     * </li>
     * <li>{@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} - 
     * No context is current for this thread.
     * 
     * <p>This occurs if a GLFW function was called that needs and operates on the current OpenGL or OpenGL ES context but no context is current on the
     * calling thread. One such function is {@link #glfwSwapInterval SwapInterval}.</p>
     * </li>
     * <li>{@link #GLFW_INVALID_ENUM INVALID_ENUM} - 
     * One of the arguments to the function was an invalid enum value.
     * 
     * <p>One of the arguments to the function was an invalid enum value, for example requesting {@link #GLFW_RED_BITS RED_BITS} with {@link #glfwGetWindowAttrib GetWindowAttrib}.</p>
     * </li>
     * <li>{@link #GLFW_INVALID_VALUE INVALID_VALUE} - 
     * One of the arguments to the function was an invalid value.
     * 
     * <p>One of the arguments to the function was an invalid value, for example requesting a non-existent OpenGL or OpenGL ES version like 2.7.</p>
     * 
     * <p>Requesting a valid but unavailable OpenGL or OpenGL ES version will instead result in a {@link #GLFW_VERSION_UNAVAILABLE VERSION_UNAVAILABLE} error.</p>
     * </li>
     * <li>{@link #GLFW_OUT_OF_MEMORY OUT_OF_MEMORY} - 
     * A memory allocation failed.
     * 
     * <p>A bug in GLFW or the underlying operating system. Report the bug to our <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.</p>
     * </li>
     * <li>{@link #GLFW_API_UNAVAILABLE API_UNAVAILABLE} - 
     * GLFW could not find support for the requested API on the system.
     * 
     * <p>The installed graphics driver does not support the requested API, or does not support it via the chosen context creation API. Below are a few
     * examples:</p>
     * 
     * <p>Some pre-installed Windows graphics drivers do not support OpenGL. AMD only supports OpenGL ES via EGL, while Nvidia and Intel only support it via
     * a WGL or GLX extension. macOS does not provide OpenGL ES at all. The Mesa EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia
     * binary driver. Older graphics drivers do not support Vulkan.</p>
     * </li>
     * <li>{@link #GLFW_VERSION_UNAVAILABLE VERSION_UNAVAILABLE} - 
     * The requested OpenGL or OpenGL ES version (including any requested context or framebuffer hints) is not available on this machine.
     * 
     * <p>The machine does not support your requirements. If your application is sufficiently flexible, downgrade your requirements and try again. Otherwise,
     * inform the user that their machine does not match your requirements.</p>
     * 
     * <p>Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0 comes out before the 4.x series gets that far, also fail with this
     * error and not {@link #GLFW_INVALID_VALUE INVALID_VALUE}, because GLFW cannot know what future versions will exist.</p>
     * </li>
     * <li>{@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR} - 
     * A platform-specific error occurred that does not match any of the more specific categories.
     * 
     * <p>A bug or configuration error in GLFW, the underlying operating system or its drivers, or a lack of required resources. Report the issue to our
     * <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.</p>
     * </li>
     * <li>{@link #GLFW_FORMAT_UNAVAILABLE FORMAT_UNAVAILABLE} - 
     * The requested format is not supported or available.
     * 
     * <p>If emitted during window creation, one or more hard constraints did not match any of the available pixel formats. If your application is
     * sufficiently flexible, downgrade your requirements and try again. Otherwise, inform the user that their machine does not match your requirements.</p>
     * 
     * <p>If emitted when querying the clipboard, ignore the error or report it to the user, as appropriate.</p>
     * </li>
     * <li>{@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} - 
     * The specified window does not have an OpenGL or OpenGL ES context.
     * 
     * <p>A window that does not have an OpenGL or OpenGL ES context was passed to a function that requires it to have one.</p>
     * 
     * <p>Application programmer error. Fix the offending call.</p>
     * </li>
     * <li>{@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} - 
     * The specified cursor shape is not available.
     * 
     * <p>The specified standard cursor shape is not available, either because the current platform cursor theme does not provide it or because it is not
     * available on the platform.</p>
     * 
     * <p>Platform or system settings limitation. Pick another standard cursor shape or create a custom cursor.</p>
     * </li>
     * <li>{@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE} - 
     * The requested feature is not provided by the platform.
     * 
     * <p>The requested feature is not provided by the platform, so GLFW is unable to implement it. The documentation for each function notes if it could
     * emit this error.</p>
     * 
     * <p>Platform or platform version limitation. The error can be ignored unless the feature is critical to the application.</p>
     * 
     * <p>A function call that emits this error has no effect other than the error and updating any existing out parameters.</p>
     * </li>
     * <li>{@link #GLFW_FEATURE_UNIMPLEMENTED FEATURE_UNIMPLEMENTED} - 
     * The requested feature has not yet been implemented in GLFW for this platform.
     * 
     * <p>An incomplete implementation of GLFW for this platform, hopefully fixed in a future release. The error can be ignored unless the feature is
     * critical to the application.</p>
     * 
     * <p>A function call that emits this error has no effect other than the error and updating any existing out parameters.</p>
     * </li>
     * <li>{@link #GLFW_PLATFORM_UNAVAILABLE PLATFORM_UNAVAILABLE} - 
     * Platform unavailable or no matching platform was found.
     * 
     * <p>If emitted during initialization, no matching platform was found. If {@link #GLFW_PLATFORM PLATFORM} is set to {@link #GLFW_ANY_PLATFORM ANY_PLATFORM}, GLFW could not detect any of the platforms
     * supported by this library binary, except for the {@code Null} platform.  If set to a specific platform, it is either not supported by this library
     * binary or GLFW was not able to detect it.</p>
     * 
     * <p>If emitted by a native access function, GLFW was initialized for a different platform than the function is for.</p>
     * 
     * <p>Failure to detect any platform usually only happens on non-macOS Unix systems, either when no window system is running or the program was run from
     * a terminal that does not have the necessary environment variables.  Fall back to a different platform if possible or notify the user that no usable
     * platform was detected.</p>
     * 
     * <p>Failure to detect a specific platform may have the same cause as above or because support for that platform was not compiled in. Call
     * {@link #glfwPlatformSupported PlatformSupported} to check whether a specific platform is supported by a library binary.</p>
     * </li>
     * </ul>
     */
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

    /**
     * Window attributes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #GLFW_FOCUSED FOCUSED} - 
     * {@code WindowHint}: Specifies whether the windowed mode window will be given input focus when created. This hint is ignored for full screen and
     * initially hidden windows.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window has input focus.</p>
     * </li>
     * <li>{@link #GLFW_ICONIFIED ICONIFIED} - {@code GetWindowAttrib}: Indicates whether the specified window is iconified, whether by the user or with {@link #glfwIconifyWindow IconifyWindow}.</li>
     * <li>{@link #GLFW_RESIZABLE RESIZABLE} - 
     * {@code WindowHint}: Specifies whether the windowed mode window will be resizable <i>by the user</i>. The window will still be resizable using the
     * {@link #glfwSetWindowSize SetWindowSize} function. This hint is ignored for full screen windows.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is resizable <i>by the user</i>.</p>
     * </li>
     * <li>{@link #GLFW_VISIBLE VISIBLE} - 
     * {@code WindowHint}: Specifies whether the windowed mode window will be initially visible. This hint is ignored for full screen windows. Windows created
     * hidden are completely invisible to the user until shown. This can be useful if you need to set up your window further before showing it, for
     * example moving it to a specific location.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is visible. Window visibility can be controlled with {@link #glfwShowWindow ShowWindow} and {@link #glfwHideWindow HideWindow}.</p>
     * </li>
     * <li>{@link #GLFW_DECORATED DECORATED} - 
     * {@code WindowHint}: Specifies whether the windowed mode window will have window decorations such as a border, a close widget, etc. An undecorated window
     * may still allow the user to generate close events on some platforms. This hint is ignored for full screen windows.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window has decorations such as a border, a close widget, etc.</p>
     * </li>
     * <li>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY} - 
     * {@code WindowHint}: Specifies whether the full screen window will automatically iconify and restore the previous video mode on input focus loss. This
     * hint is ignored for windowed mode windows.
     * </li>
     * <li>{@link #GLFW_FLOATING FLOATING} - 
     * {@code WindowHint}: Specifies whether the windowed mode window will be floating above other regular windows, also called topmost or always-on-top. This
     * is intended primarily for debugging purposes and cannot be used to implement proper full screen windows. This hint is ignored for full screen
     * windows.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is floating, also called topmost or always-on-top.</p>
     * </li>
     * <li>{@link #GLFW_MAXIMIZED MAXIMIZED} - 
     * {@code WindowHint}: Specifies whether the windowed mode window will be maximized when created. This hint is ignored for full screen windows.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the specified window is maximized, whether by the user or {@link #glfwMaximizeWindow MaximizeWindow}.</p>
     * </li>
     * <li>{@link #GLFW_CENTER_CURSOR CENTER_CURSOR} - 
     * {@code WindowHint}: Specifies whether the cursor should be centered over newly created full screen windows. This hint is ignored for windowed mode
     * windows.
     * </li>
     * <li>{@link #GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER} - 
     * {@code WindowHint}: Specifies whether the window framebuffer will be transparent. If enabled and supported by the system, the window framebuffer
     * alpha channel will be used to combine the framebuffer with the background. This does not affect window decorations.
     * </li>
     * <li>{@link #GLFW_HOVERED HOVERED} - {@code GetWindowAttrib}: Indicates whether the cursor is currently directly over the content area of the window, with no other windows between.</li>
     * <li>{@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW} - 
     * {@code WindowHint}: Specifies whether input focuses on calling show window.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether input focuses on calling show window.</p>
     * </li>
     * <li>{@link #GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH} - 
     * {@code WindowHint}: Specifies whether the window is transparent to mouse input, letting any mouse events pass through to whatever window is behind
     * it. This is only supported for undecorated windows. Decorated windows with this enabled will behave differently between platforms.
     * 
     * <p>{@code GetWindowAttrib}: Indicates whether the window is transparent to mouse input.</p>
     * </li>
     * <li>{@link #GLFW_POSITION_X POSITION_X} - {@code WindowHint}: Initial position x-coordinate window hint.</li>
     * <li>{@link #GLFW_POSITION_Y POSITION_Y} - {@code WindowHint}: Initial position y-coordinate window hint.</li>
     * </ul>
     */
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
        GLFW_POSITION_Y              = 0x2000F;

    /** Input options. */
    public static final int
        GLFW_CURSOR               = 0x33001,
        GLFW_STICKY_KEYS          = 0x33002,
        GLFW_STICKY_MOUSE_BUTTONS = 0x33003,
        GLFW_LOCK_KEY_MODS        = 0x33004,
        GLFW_RAW_MOUSE_MOTION     = 0x33005;

    /** Cursor state. */
    public static final int
        GLFW_CURSOR_NORMAL   = 0x34001,
        GLFW_CURSOR_HIDDEN   = 0x34002,
        GLFW_CURSOR_DISABLED = 0x34003,
        GLFW_CURSOR_CAPTURED = 0x34004;

    /** The regular arrow cursor shape. */
    public static final int GLFW_ARROW_CURSOR = 0x36001;

    /** The text input I-beam cursor shape. */
    public static final int GLFW_IBEAM_CURSOR = 0x36002;

    /** The crosshair cursor shape. */
    public static final int GLFW_CROSSHAIR_CURSOR = 0x36003;

    /** The pointing hand cursor shape. */
    public static final int GLFW_POINTING_HAND_CURSOR = 0x36004;

    /**
     * The horizontal resize/move arrow shape.
     * 
     * <p>This is usually a horizontal double-headed arrow.</p>
     */
    public static final int GLFW_RESIZE_EW_CURSOR = 0x36005;

    /**
     * The vertical resize/move shape.
     * 
     * <p>This is usually a vertical double-headed arrow.</p>
     */
    public static final int GLFW_RESIZE_NS_CURSOR = 0x36006;

    /**
     * The top-left to bottom-right diagonal resize/move shape.
     * 
     * <p>This is usually a diagonal double-headed arrow.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li><b>macOS</b>: This shape is provided by a private system API and may fail with {@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} in the future.</li>
     * <li><b>X11</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * <li><b>Wayland</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * </ul></div>
     */
    public static final int GLFW_RESIZE_NWSE_CURSOR = 0x36007;

    /**
     * The top-right to bottom-left diagonal resize/move shape.
     * 
     * <p>This is usually a diagonal double-headed arrow.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li><b>macOS</b>: This shape is provided by a private system API and may fail with {@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} in the future.</li>
     * <li><b>X11</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * <li><b>Wayland</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * </ul></div>
     */
    public static final int GLFW_RESIZE_NESW_CURSOR = 0x36008;

    /**
     * The omni-directional resize cursor/move shape.
     * 
     * <p>This is usually either a combined horizontal and vertical double-headed arrow or a grabbing hand.</p>
     */
    public static final int GLFW_RESIZE_ALL_CURSOR = 0x36009;

    /**
     * The operation-not-allowed shape.
     * 
     * <p>This is usually a circle with a diagonal line through it.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li><b>X11</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * <li><b>Wayland</b>: This shape is provided by a newer standard not supported by all cursor themes.</li>
     * </ul></div>
     */
    public static final int GLFW_NOT_ALLOWED_CURSOR = 0x3600A;

    /** Legacy name for compatibility. */
    public static final int GLFW_HRESIZE_CURSOR = GLFW_RESIZE_EW_CURSOR;

    /** Legacy name for compatibility. */
    public static final int GLFW_VRESIZE_CURSOR = GLFW_RESIZE_NS_CURSOR;

    /** Legacy name for compatibility. */
    public static final int GLFW_HAND_CURSOR = GLFW_POINTING_HAND_CURSOR;

    /** Monitor events. */
    public static final int
        GLFW_CONNECTED    = 0x40001,
        GLFW_DISCONNECTED = 0x40002;

    /**
     * Joystick hat buttons init hint.
     * 
     * <p>Specifies whether to also expose joystick hats as buttons, for compatibility with earlier versions of GLFW that did not have {@link #glfwGetJoystickHats GetJoystickHats}.
     * Possible values are {@link #GLFW_TRUE TRUE} and {@link #GLFW_FALSE FALSE}.</p>
     */
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x50001;

    /**
     * ANGLE rendering backend init hint.
     * 
     * <p>Specifies the platform type (rendering backend) to request when using OpenGL ES and EGL via <a href="https://chromium.googlesource.com/angle/angle/">ANGLE</a>. If the requested platform type is unavailable, ANGLE will use its default. Possible values are one of {@link #GLFW_ANGLE_PLATFORM_TYPE_NONE ANGLE_PLATFORM_TYPE_NONE},
     * {@link #GLFW_ANGLE_PLATFORM_TYPE_OPENGL ANGLE_PLATFORM_TYPE_OPENGL}, {@link #GLFW_ANGLE_PLATFORM_TYPE_OPENGLES ANGLE_PLATFORM_TYPE_OPENGLES}, {@link #GLFW_ANGLE_PLATFORM_TYPE_D3D9 ANGLE_PLATFORM_TYPE_D3D9}, {@link #GLFW_ANGLE_PLATFORM_TYPE_D3D11 ANGLE_PLATFORM_TYPE_D3D11}, {@link #GLFW_ANGLE_PLATFORM_TYPE_VULKAN ANGLE_PLATFORM_TYPE_VULKAN} and
     * {@link #GLFW_ANGLE_PLATFORM_TYPE_METAL ANGLE_PLATFORM_TYPE_METAL}.</p>
     */
    public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x50002;

    public static final int GLFW_ANY_POSITION = 0x80000000;

    /** Platform selection init hint. */
    public static final int GLFW_PLATFORM = 0x50003;

    /**
     * macOS specific init hint.
     * 
     * <p>Specifies whether to set the current directory to the application to the {@code Contents/Resources} subdirectory of the application's bundle, if
     * present. Possible values are {@link #GLFW_TRUE TRUE}` and {@link #GLFW_FALSE FALSE}`. This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 0x51001;

    /**
     * macOS specific init hint.
     * 
     * <p>Specifies whether to create the menu bar and dock icon when GLFW is initialized. This applies whether the menu bar is created from a nib or manually by
     * GLFW. Possible values are {@link #GLFW_TRUE TRUE} and {@link #GLFW_FALSE FALSE}. This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_MENUBAR = 0x51002;

    /** X11 specific init hint. */
    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x52001;

    /** Wayland specific init hint. */
    public static final int GLFW_WAYLAND_LIBDECOR = 0x53001;

    /** Hint value for {@link #GLFW_PLATFORM PLATFORM} that enables automatic platform selection. */
    public static final int
        GLFW_ANY_PLATFORM     = 0x60000,
        GLFW_PLATFORM_WIN32   = 0x60001,
        GLFW_PLATFORM_COCOA   = 0x60002,
        GLFW_PLATFORM_WAYLAND = 0x60003,
        GLFW_PLATFORM_X11     = 0x60004,
        GLFW_PLATFORM_NULL    = 0x60005;

    /** Don't care value. */
    public static final int GLFW_DONT_CARE = -1;

    /** PixelFormat hints. */
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

    /**
     * Client API hints.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #GLFW_CLIENT_API CLIENT_API} - 
     * {@code WindowHint}: Specifies which client API to create the context for. Possible values are {@link #GLFW_OPENGL_API OPENGL_API}, {@link #GLFW_OPENGL_ES_API OPENGL_ES_API} and {@link #GLFW_NO_API NO_API}. This is a hard
     * constraint.
     * 
     * <p>{@code GetWindowAttrib}: Indicates the client API provided by the window's context; either {@link #GLFW_OPENGL_API OPENGL_API}, {@link #GLFW_OPENGL_ES_API OPENGL_ES_API} or {@link #GLFW_NO_API NO_API}.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} - 
     * {@code WindowHint}: Specifies the client API major version that the created context must be compatible with. The exact behavior of this hint depends on
     * the requested client API.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>While there is no way to ask the driver for a context of the highest supported version, GLFW will attempt to provide this when you ask for a
     * version 1.0 context, which is the default for these hints.</li>
     * <li><b>OpenGL</b>: {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} and {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} are not hard constraints, but creation will fail if the OpenGL version of the
     * created context is less than the one requested. It is therefore perfectly safe to use the default of version 1.0 for legacy code and you will
     * still get backwards-compatible contexts of version 3.0 and above when available.</li>
     * <li><b>OpenGL ES</b>: {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} and {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} are not hard constraints, but creation will fail if the OpenGL ES version
     * of the created context is less than the one requested. Additionally, OpenGL ES 1.x cannot be returned if 2.0 or later was requested, and vice
     * versa. This is because OpenGL ES 3.x is backward compatible with 2.0, but OpenGL ES 2.0 is not backward compatible with 1.x.</li>
     * </ul></div>
     * 
     * <p>{@code GetWindowAttrib}: Indicate the client API major version of the window's context.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} - 
     * {@code WindowHint}: Specifies the client API minor version that the created context must be compatible with. The exact behavior of this hint depends on
     * the requested client API.
     * 
     * <p>{@code GetWindowAttrib}: Indicate the client API minor version of the window's context.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_REVISION CONTEXT_REVISION} - {@code GetWindowAttrib}: Indicates the client API version of the window's context.</li>
     * <li>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS} - 
     * {@code WindowHint}: Specifies the robustness strategy to be used by the context. This can be one of {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} or {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, or
     * {@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} to not request a robustness strategy.
     * 
     * <p>{@code GetWindowAttrib}: Indicates the robustness strategy used by the context. This is {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET} or {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} if the window's
     * context supports robustness, or {@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} otherwise.</p>
     * </li>
     * <li>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT} - 
     * {@code WindowHint}: Specifies whether the OpenGL context should be forward-compatible, i.e. one where all functionality deprecated in the requested
     * version of OpenGL is removed. This must only be used if the requested OpenGL version is 3.0 or above. If OpenGL ES is requested, this hint is
     * ignored.
     * 
     * <p>{@code GetWindowAttrib}: Indicates if the window's context is an OpenGL forward-compatible one.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_DEBUG CONTEXT_DEBUG} - 
     * {@code WindowHint}: Specifies whether to create a debug context, which may have additional error and performance issue reporting functionality.
     * 
     * <p>{@code GetWindowAttrib}: Indicates if the window's context is a debug context.</p>
     * </li>
     * <li>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT} - Alias of {@link #GLFW_CONTEXT_DEBUG CONTEXT_DEBUG} for compatibility with earlier versions.</li>
     * <li>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} - 
     * {@code WindowHint}: Specifies which OpenGL profile to create the context for. Possible values are one of {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} or {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE},
     * or {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} to not request a specific profile. If requesting an OpenGL version below 3.2, {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} must be used. If OpenGL ES
     * is requested, this hint is ignored.
     * 
     * <p>{@code GetWindowAttrib}: Indicates the OpenGL profile used by the context. This is {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} or {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE} if the context uses a
     * known profile, or {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} if the OpenGL profile is unknown or the context is an OpenGL ES context. Note that the returned profile may
     * not match the profile bits of the context flags, as GLFW will try other means of detecting the profile when no bits are set.</p>
     * </li>
     * <li>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} - 
     * {@code WindowHint}: Specifies the release behavior to be used by the context. If the behavior is {@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}, the default behavior of the
     * context creation API will be used. If the behavior is {@link #GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH}, the pipeline will be flushed whenever the context is released from
     * being the current one. If the behavior is {@link #GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}, the pipeline will not be flushed on release.
     * </li>
     * <li>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR} - 
     * {@code WindowHint}: Specifies whether errors should be generated by the context. If enabled, situations that would have generated errors instead cause
     * undefined behavior.
     * </li>
     * <li>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API} - 
     * {@code WindowHint}: Specifies which context creation API to use to create the context. Possible values are {@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API}, {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}
     * and {@link #GLFW_OSMESA_CONTEXT_API OSMESA_CONTEXT_API}. This is a hard constraint. If no client API is requested, this hint is ignored.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li><b>macOS</b>: The EGL API is not available on this platform and requests to use it will fail.</li>
     * <li><b>Wayland, Mir</b>: The EGL API <i>is</i> the native context creation API, so this hint will have no effect.</li>
     * <li>An OpenGL extension loader library that assumes it knows which context creation API is used on a given platform may fail if you change this
     * hint. This can be resolved by having it load via {@link #glfwGetProcAddress GetProcAddress}, which always uses the selected API.</li>
     * </ul></div>
     * 
     * <p>{@code GetWindowAttrib}: Indicates the context creation API used to create the window's context; either {@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} or {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}.</p>
     * </li>
     * <li>{@link #GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR} - 
     * {@code WindowHint}: Specifies whether the window content area should be resized based on the monitor content scale of any monitor it is placed on.
     * This includes the initial placement when the window is created. Possible values are {@link #GLFW_TRUE TRUE} and {@link #GLFW_FALSE FALSE}.
     * 
     * <p>This hint only has an effect on platforms where screen coordinates and pixels always map 1:1 such as Windows and X11. On platforms like macOS the
     * resolution of the framebuffer is changed independently of the window size.</p>
     * </li>
     * </ul>
     */
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
        GLFW_SCALE_TO_MONITOR         = 0x2200C;

    /**
     * Specifies whether to use full resolution framebuffers on Retina displays.
     * 
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 0x23001;

    /**
     * Specifies the UTF-8 encoded name to use for autosaving the window frame, or if empty disables frame autosaving for the window.
     * 
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_FRAME_NAME = 0x23002;

    /**
     * Specifies whether to enable Automatic Graphics Switching, i.e. to allow the system to choose the integrated GPU for the OpenGL context and move it
     * between GPUs if necessary or whether to force it to always run on the discrete GPU. This only affects systems with both integrated and discrete GPUs.
     * 
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 0x23003;

    /**
     * The desired ASCII encoded class and instance parts of the ICCCM {@code WM_CLASS} window property.
     * 
     * <p>These are ignored on other platforms.</p>
     */
    public static final int
        GLFW_X11_CLASS_NAME    = 0x24001,
        GLFW_X11_INSTANCE_NAME = 0x24002;

    /**
     * Specifies whether to allow access to the window menu via the Alt+Space and Alt-and-then-Space keyboard shortcuts.
     * 
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_WIN32_KEYBOARD_MENU = 0x25001;

    /**
     * Allows specification of the Wayland {@code app_id}.
     * 
     * <p>This is ignored on other platforms.</p>
     */
    public static final int GLFW_WAYLAND_APP_ID = 0x26001;

    /** Values for the {@link #GLFW_CLIENT_API CLIENT_API} hint. */
    public static final int
        GLFW_NO_API        = 0,
        GLFW_OPENGL_API    = 0x30001,
        GLFW_OPENGL_ES_API = 0x30002;

    /** Values for the {@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS} hint. */
    public static final int
        GLFW_NO_ROBUSTNESS         = 0,
        GLFW_NO_RESET_NOTIFICATION = 0x31001,
        GLFW_LOSE_CONTEXT_ON_RESET = 0x31002;

    /** Values for the {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint. */
    public static final int
        GLFW_OPENGL_ANY_PROFILE    = 0,
        GLFW_OPENGL_CORE_PROFILE   = 0x32001,
        GLFW_OPENGL_COMPAT_PROFILE = 0x32002;

    /** Values for the {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} hint. */
    public static final int
        GLFW_ANY_RELEASE_BEHAVIOR   = 0,
        GLFW_RELEASE_BEHAVIOR_FLUSH = 0x35001,
        GLFW_RELEASE_BEHAVIOR_NONE  = 0x35002;

    /** Values for the {@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API} hint. */
    public static final int
        GLFW_NATIVE_CONTEXT_API = 0x36001,
        GLFW_EGL_CONTEXT_API    = 0x36002,
        GLFW_OSMESA_CONTEXT_API = 0x36003;

    /** Values for the {@link #GLFW_ANGLE_PLATFORM_TYPE ANGLE_PLATFORM_TYPE} hint. */
    public static final int
        GLFW_ANGLE_PLATFORM_TYPE_NONE     = 0x37001,
        GLFW_ANGLE_PLATFORM_TYPE_OPENGL   = 0x37002,
        GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x37003,
        GLFW_ANGLE_PLATFORM_TYPE_D3D9     = 0x37004,
        GLFW_ANGLE_PLATFORM_TYPE_D3D11    = 0x37005,
        GLFW_ANGLE_PLATFORM_TYPE_VULKAN   = 0x37007,
        GLFW_ANGLE_PLATFORM_TYPE_METAL    = 0x37008;

    /** Values for the {@link #GLFW_WAYLAND_LIBDECOR WAYLAND_LIBDECOR} hint. */
    public static final int
        GLFW_WAYLAND_PREFER_LIBDECOR  = 0x38001,
        GLFW_WAYLAND_DISABLE_LIBDECOR = 0x38002;

    protected GLFW() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwInit ] ---

    /**
     * Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before an application terminates GLFW should be
     * terminated in order to free any resources allocated during or after initialization.
     * 
     * <p>If this function fails, it calls {@link #glfwTerminate Terminate} before returning. If it succeeds, you should call {@link #glfwTerminate Terminate} before the application exits.</p>
     * 
     * <p>Additional calls to this function after successful initialization but before termination will return {@link #GLFW_TRUE TRUE} immediately.</p>
     * 
     * <p>The {@link #GLFW_PLATFORM PLATFORM} init hint controls which platforms are considered during initialization. This also depends on which platforms the library was compiled to
     * support.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>macOS</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the application's
     * bundle, if present. This can be disabled with the {@link #GLFW_COCOA_CHDIR_RESOURCES COCOA_CHDIR_RESOURCES} init hint.</li>
     * <li><b>macOS</b>: This function will create the main menu and dock icon for the application. If GLFW finds a {@code MainMenu.nib} it is loaded and
     * assumed to contain a menu bar. Otherwise a minimal menu bar is created manually with common commands like Hide, Quit and About. The About entry
     * opens a minimal about dialog with information from the application's bundle. The menu bar and dock icon can be disabled entirely with the
     * {@link #GLFW_COCOA_MENUBAR COCOA_MENUBAR} init hint.</li>
     * <li><b>x11</b>: This function will set the {@code LC_CTYPE} category of the application locale according to the current environment if that category is
     * still "C". This is because the "C" locale breaks Unicode text input.</li>
     * </ul></div>
     *
     * @return {@link #GLFW_TRUE TRUE} if successful, or {@link #GLFW_FALSE FALSE} if an error occurred.
     *         
     *         <p>Possible errors include {@link #GLFW_PLATFORM_UNAVAILABLE PLATFORM_UNAVAILABLE} and {@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</p>
     *
     * @since version 1.0
     */
    @NativeType("int")
    public static boolean glfwInit() {
        long __functionAddress = Functions.Init;
        EventLoop.check();
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glfwTerminate ] ---

    /**
     * Terminates the GLFW library.
     * 
     * <p>This function destroys all remaining windows and cursors, restores any modified gamma ramps and frees any other allocated resources. Once this function
     * is called, you must again call {@link #glfwInit Init} successfully before you will be able to use most GLFW functions.</p>
     * 
     * <p>If GLFW has been successfully initialized, this function should be called before the application exits. If initialization fails, there is no need to
     * call this function, as it is called by {@link #glfwInit Init} before it returns failure.</p>
     * 
     * <p>This function has no effect if GLFW is not initialized.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * <li>No window's context may be current on another thread when this function is called.</li>
     * </ul></div>
     *
     * @since version 1.0
     */
    public static void glfwTerminate() {
        long __functionAddress = Functions.Terminate;
        invokeV(__functionAddress);
    }

    // --- [ glfwInitHint ] ---

    /**
     * Sets hints for the next initialization of GLFW.
     * 
     * <p>The values you set hints to are never reset by GLFW, but they only take effect during initialization. Once GLFW has been initialized, any values you
     * set will be ignored until the library is terminated and initialized again.</p>
     * 
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will simply
     * ignore them. Setting these hints requires no platform specific headers or functions.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function must only be called from the main thread.</li>
     * </ul></div>
     *
     * @param hint  the init hint to set. One of:<br><table><tr><td>{@link #GLFW_JOYSTICK_HAT_BUTTONS JOYSTICK_HAT_BUTTONS}</td><td>{@link #GLFW_ANGLE_PLATFORM_TYPE ANGLE_PLATFORM_TYPE}</td><td>{@link #GLFW_COCOA_CHDIR_RESOURCES COCOA_CHDIR_RESOURCES}</td><td>{@link #GLFW_COCOA_MENUBAR COCOA_MENUBAR}</td></tr><tr><td>{@link #GLFW_PLATFORM PLATFORM}</td><td>{@link #GLFW_X11_XCB_VULKAN_SURFACE X11_XCB_VULKAN_SURFACE}</td></tr></table>
     * @param value the new value of the init hint
     *
     * @since version 3.3
     */
    public static void glfwInitHint(int hint, int value) {
        long __functionAddress = Functions.InitHint;
        invokeV(hint, value, __functionAddress);
    }

    // --- [ glfwInitAllocator ] ---

    /** Unsafe version of: {@link #glfwInitAllocator InitAllocator} */
    public static void nglfwInitAllocator(long allocator) {
        long __functionAddress = Functions.InitAllocator;
        if (CHECKS) {
            if (allocator != NULL) { GLFWAllocator.validate(allocator); }
        }
        invokePV(allocator, __functionAddress);
    }

    /**
     * Sets the init allocator to the desired value.
     * 
     * <p>To use the default allocator, call this function with a {@code NULL} argument.</p>
     * 
     * <p>If you specify an allocator struct, every member must be a valid function pointer. If any member is {@code NULL}, this function emits {@link #GLFW_INVALID_VALUE INVALID_VALUE} and the
     * init allocator is unchanged.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>Possible errors include {@link #GLFW_INVALID_VALUE INVALID_VALUE}.</li>
     * <li>The specified allocator is copied before this function returns.</li>
     * <li>This function must only be called from the main thread.</li>
     * </ul></div>
     *
     * @param allocator the allocator to use at the next initialization, or {@code NULL} to use the default one
     *
     * @since version 3.4
     */
    public static void glfwInitAllocator(@Nullable @NativeType("GLFWallocator const *") GLFWAllocator allocator) {
        nglfwInitAllocator(memAddressSafe(allocator));
    }

    // --- [ glfwGetVersion ] ---

    /** Unsafe version of: {@link #glfwGetVersion GetVersion} */
    public static void nglfwGetVersion(long major, long minor, long rev) {
        long __functionAddress = Functions.GetVersion;
        invokePPPV(major, minor, rev, __functionAddress);
    }

    /**
     * Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
     * that you are using the minimum required version.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>Any or all of the version arguments may be {@code NULL}.</li>
     * <li>This function always succeeds.</li>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function may be called from any thread.</li>
     * </ul></div>
     *
     * @param major where to store the major version number, or {@code NULL}
     * @param minor where to store the minor version number, or {@code NULL}
     * @param rev   where to store the revision number, or {@code NULL}
     *
     * @since version 1.0
     */
    public static void glfwGetVersion(@Nullable @NativeType("int *") IntBuffer major, @Nullable @NativeType("int *") IntBuffer minor, @Nullable @NativeType("int *") IntBuffer rev) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(rev, 1);
        }
        nglfwGetVersion(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(rev));
    }

    // --- [ glfwGetVersionString ] ---

    /** Unsafe version of: {@link #glfwGetVersionString GetVersionString} */
    public static long nglfwGetVersionString() {
        long __functionAddress = Functions.GetVersionString;
        return invokeP(__functionAddress);
    }

    /**
     * Returns the compile-time generated version string of the GLFW library binary. It describes the version, platforms, compiler and any platform or
     * operating system specific compile-time options. It should not be confused with the OpenGL or OpenGL ES version string, queried with
     * {@code glGetString}.
     * 
     * <p><b>Do not use the version string</b> to parse the GLFW library version. The {@link #glfwGetVersion GetVersion} function already provides the version of the library binary
     * in numerical format.</p>
     * 
     * <p><b>Do not use the version string</b> to parse what platforms are supported. The {@link #glfwPlatformSupported PlatformSupported} function lets you query platform support.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function always succeeds.</li>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function may be called from any thread.</li>
     * <li>The returned string is static and compile-time generated.</li>
     * </ul></div>
     *
     * @return the ASCII encoded GLFW version string
     *
     * @since version 3.0
     */
    @NativeType("char const *")
    public static String glfwGetVersionString() {
        long __result = nglfwGetVersionString();
        return memASCII(__result);
    }

    // --- [ glfwGetError ] ---

    /** Unsafe version of: {@link #glfwGetError GetError} */
    public static int nglfwGetError(long description) {
        long __functionAddress = Functions.GetError;
        return invokePI(description, __functionAddress);
    }

    /**
     * Returns and clears the last error for the calling thread.
     * 
     * <p>This function returns and clears the error code of the last error that occurred on the calling thread and optionally a UTF-8 encoded human-readable
     * description of it. If no error has occurred since the last call, it returns {@link #GLFW_NO_ERROR NO_ERROR} (zero), and the description pointer is set to {@code NULL}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function may be called from any thread.</li>
     * <li>The returned string is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the next error occurs
     * or the library is terminated.</li>
     * </ul></div>
     *
     * @param description where to store the error description pointer, or {@code NULL}
     *
     * @return the last error code for the calling thread, or {@link #GLFW_NO_ERROR NO_ERROR} (zero)
     *
     * @since version 3.3
     */
    public static int glfwGetError(@Nullable @NativeType("char const **") PointerBuffer description) {
        if (CHECKS) {
            checkSafe(description, 1);
        }
        return nglfwGetError(memAddressSafe(description));
    }

    // --- [ glfwSetErrorCallback ] ---

    /** Unsafe version of: {@link #glfwSetErrorCallback SetErrorCallback} */
    public static long nglfwSetErrorCallback(long cbfun) {
        long __functionAddress = Functions.SetErrorCallback;
        return invokePP(cbfun, __functionAddress);
    }

    /**
     * Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
     * 
     * <p>The error code is set before the callback is called. Calling {@link #glfwGetError GetError} from the error callback will return the same value as the error code argument.</p>
     * 
     * <p>The error callback is called on the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be
     * written accordingly.</p>
     * 
     * <p>Because the description string may have been generated specifically for that error, it is not guaranteed to be valid after the callback has returned. If
     * you wish to use it after the callback returns, you need to make a copy.</p>
     * 
     * <p>Once set, the error callback remains set even after the library has been terminated.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function may be called before {@link #glfwInit Init}.</li>
     * <li>This function must only be called from the main thread.</li>
     * </ul></div>
     *
     * @param cbfun the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWerrorfun")
    public static GLFWErrorCallback glfwSetErrorCallback(@Nullable @NativeType("GLFWerrorfun") GLFWErrorCallbackI cbfun) {
        return GLFWErrorCallback.createSafe(nglfwSetErrorCallback(memAddressSafe(cbfun)));
    }

    // --- [ glfwGetPlatform ] ---

    /**
     * Returns the currently selected platform.
     * 
     * <p>This function returns the platform that was selected during initialization. The returned value will be one of {@link #GLFW_PLATFORM_WIN32 PLATFORM_WIN32}, {@link #GLFW_PLATFORM_COCOA PLATFORM_COCOA},
     * {@link #GLFW_PLATFORM_WAYLAND PLATFORM_WAYLAND}, {@link #GLFW_PLATFORM_X11 PLATFORM_X11} or {@link #GLFW_PLATFORM_NULL PLATFORM_NULL}.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @return the currently selected platform, or zero if an error occurred.
     *         
     *         <p>Possible errors include {@link #GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.4
     */
    public static int glfwGetPlatform() {
        long __functionAddress = Functions.GetPlatform;
        return invokeI(__functionAddress);
    }

    // --- [ glfwPlatformSupported ] ---

    /**
     * Returns whether the library includes support for the specified platform.
     * 
     * <p>This function returns whether the library was compiled with support for the specified platform.</p>
     * 
     * <p>This function may be called before {@link #glfwInit Init}.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param platform the platform to query. One of:<br><table><tr><td>{@link #GLFW_PLATFORM_WIN32 PLATFORM_WIN32}</td><td>{@link #GLFW_PLATFORM_COCOA PLATFORM_COCOA}</td><td>{@link #GLFW_PLATFORM_WAYLAND PLATFORM_WAYLAND}</td><td>{@link #GLFW_PLATFORM_X11 PLATFORM_X11}</td><td>{@link #GLFW_PLATFORM_NULL PLATFORM_NULL}</td></tr></table>
     *
     * @return {@link #GLFW_TRUE TRUE} if the platform is supported, or {@link #GLFW_FALSE FALSE} otherwise.
     *         
     *         <p>Possible errors include {@link #GLFW_INVALID_ENUM INVALID_ENUM}.</p>
     *
     * @since version 3.4
     */
    @NativeType("int")
    public static boolean glfwPlatformSupported(int platform) {
        long __functionAddress = Functions.PlatformSupported;
        return invokeI(platform, __functionAddress) != 0;
    }

    // --- [ glfwGetMonitors ] ---

    /**
     * Unsafe version of: {@link #glfwGetMonitors GetMonitors}
     *
     * @param count where to store the number of monitors in the returned array. This is set to zero if an error occurred.
     */
    public static long nglfwGetMonitors(long count) {
        long __functionAddress = Functions.GetMonitors;
        return invokePP(count, __functionAddress);
    }

    /**
     * Returns an array of handles for all currently connected monitors. The primary monitor is always first in the returned array. If no monitors were found,
     * this function returns {@code NULL}.
     * 
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
     * changes or the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @return an array of monitor handlers, or {@code NULL} if no monitors were found or if an error occurred
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWmonitor **")
    public static PointerBuffer glfwGetMonitors() {
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

    /**
     * Returns the primary monitor. This is usually the monitor where elements like the task bar or global menu bar are located.
     * 
     * <p>This function must only be called from the main thread.</p>
     * 
     * <p>The primary monitor is always first in the array returned by {@link #glfwGetMonitors GetMonitors}.</p>
     *
     * @return the primary monitor, or {@code NULL} if no monitors were found or if an error occurred
     *
     * @since version 3.0
     */
    @NativeType("GLFWmonitor *")
    public static long glfwGetPrimaryMonitor() {
        long __functionAddress = Functions.GetPrimaryMonitor;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetMonitorPos ] ---

    /** Unsafe version of: {@link #glfwGetMonitorPos GetMonitorPos} */
    public static void nglfwGetMonitorPos(long monitor, long xpos, long ypos) {
        long __functionAddress = Functions.GetMonitorPos;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPV(monitor, xpos, ypos, __functionAddress);
    }

    /**
     * Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
     * 
     * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     * @param xpos    where to store the monitor x-coordinate, or {@code NULL}
     * @param ypos    where to store the monitor y-coordinate, or {@code NULL}
     *
     * @since version 3.0
     */
    public static void glfwGetMonitorPos(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("int *") IntBuffer xpos, @Nullable @NativeType("int *") IntBuffer ypos) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
    }

    // --- [ glfwGetMonitorWorkarea ] ---

    /** Unsafe version of: {@link #glfwGetMonitorWorkarea GetMonitorWorkarea} */
    public static void nglfwGetMonitorWorkarea(long monitor, long xpos, long ypos, long width, long height) {
        long __functionAddress = Functions.GetMonitorWorkarea;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPPPV(monitor, xpos, ypos, width, height, __functionAddress);
    }

    /**
     * Retrieves the work area of the monitor.
     * 
     * <p>This function returns the position, in screen coordinates, of the upper-left corner of the work area of the specified monitor along with the work area
     * size in screen coordinates. The work area is defined as the area of the monitor not occluded by the window system task bar where present. If no task
     * bar exists then the work area is the monitor resolution in screen coordinates.</p>
     * 
     * <p>Any or all of the position and size arguments may be {@code NULL}.  If an error occurs, all non-{@code NULL} position and size arguments will be set to zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     * @param xpos    where to store the working area x-coordinate, or {@code NULL}
     * @param ypos    where to store the working area y-coordinate, or {@code NULL}
     * @param width   where to store the working area width, or {@code NULL}
     * @param height  where to store the working area height, or {@code NULL}
     *
     * @since version 3.3
     */
    public static void glfwGetMonitorWorkarea(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("int *") IntBuffer xpos, @Nullable @NativeType("int *") IntBuffer ypos, @Nullable @NativeType("int *") IntBuffer width, @Nullable @NativeType("int *") IntBuffer height) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        nglfwGetMonitorWorkarea(monitor, memAddressSafe(xpos), memAddressSafe(ypos), memAddressSafe(width), memAddressSafe(height));
    }

    // --- [ glfwGetMonitorPhysicalSize ] ---

    /** Unsafe version of: {@link #glfwGetMonitorPhysicalSize GetMonitorPhysicalSize} */
    public static void nglfwGetMonitorPhysicalSize(long monitor, long widthMM, long heightMM) {
        long __functionAddress = Functions.GetMonitorPhysicalSize;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPV(monitor, widthMM, heightMM, __functionAddress);
    }

    /**
     * Returns the size, in millimetres, of the display area of the specified monitor.
     * 
     * <p>Some platforms do not provide accurate monitor size information, either because the monitor
     * <a href="https://en.wikipedia.org/wiki/Extended_display_identification_data">EDID</a> data is incorrect or because the driver does not report it
     * accurately.</p>
     * 
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Windows</b>: On Windows 8 and earlier the physical size is calculated from the current resolution and system DPI instead of querying the monitor
     * EDID data.</li>
     * </ul></div>
     *
     * @param monitor  the monitor to query
     * @param widthMM  where to store the width, in millimetres, of the monitor's display area, or {@code NULL}
     * @param heightMM where to store the height, in millimetres, of the monitor's display area, or {@code NULL}
     *
     * @since version 3.0
     */
    public static void glfwGetMonitorPhysicalSize(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("int *") IntBuffer widthMM, @Nullable @NativeType("int *") IntBuffer heightMM) {
        if (CHECKS) {
            checkSafe(widthMM, 1);
            checkSafe(heightMM, 1);
        }
        nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(widthMM), memAddressSafe(heightMM));
    }

    // --- [ glfwGetMonitorContentScale ] ---

    /** Unsafe version of: {@link #glfwGetMonitorContentScale GetMonitorContentScale} */
    public static void nglfwGetMonitorContentScale(long monitor, long xscale, long yscale) {
        long __functionAddress = Functions.GetMonitorContentScale;
        if (CHECKS) {
            check(monitor);
        }
        invokePPPV(monitor, xscale, yscale, __functionAddress);
    }

    /**
     * Retrieves the content scale for the specified monitor.
     * 
     * <p>This function retrieves the content scale for the specified monitor. The content scale is the ratio between the current DPI and the platform's default
     * DPI. This is especially important for text and any UI elements. If the pixel dimensions of your UI scaled by this look appropriate on your machine then
     * it should appear at a reasonable size on other machines regardless of their DPI and scaling settings. This relies on the system DPI and scaling
     * settings being somewhat correct.</p>
     * 
     * <p>The content scale may depend on both the monitor resolution and pixel density and on user settings. It may be very different from the raw DPI
     * calculated from the physical size and current resolution.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     * @param xscale  where to store the x-axis content scale, or {@code NULL}
     * @param yscale  where to store the y-axis content scale, or {@code NULL}
     *
     * @since version 3.3
     */
    public static void glfwGetMonitorContentScale(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("float *") FloatBuffer xscale, @Nullable @NativeType("float *") FloatBuffer yscale) {
        if (CHECKS) {
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        nglfwGetMonitorContentScale(monitor, memAddressSafe(xscale), memAddressSafe(yscale));
    }

    // --- [ glfwGetMonitorName ] ---

    /** Unsafe version of: {@link #glfwGetMonitorName GetMonitorName} */
    public static long nglfwGetMonitorName(long monitor) {
        long __functionAddress = Functions.GetMonitorName;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /**
     * Returns a human-readable name, encoded as UTF-8, of the specified monitor. The name typically reflects the make and model of the monitor and is not
     * guaranteed to be unique among the connected monitors.
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
     * library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     *
     * @return the UTF-8 encoded name of the monitor, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetMonitorName(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetMonitorName(monitor);
        return memUTF8Safe(__result);
    }

    // --- [ glfwSetMonitorUserPointer ] ---

    /**
     * Sets the user pointer of the specified monitor.
     * 
     * <p>This function sets the user-defined pointer of the specified monitor. The current value is retained until the monitor is disconnected. The initial
     * value is {@code NULL}.</p>
     * 
     * <p>This function may be called from the monitor callback, even for a monitor that is being disconnected.</p>
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the monitor whose pointer to set
     * @param pointer the new value
     *
     * @since version 3.3
     */
    public static void glfwSetMonitorUserPointer(@NativeType("GLFWmonitor *") long monitor, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.SetMonitorUserPointer;
        if (CHECKS) {
            check(monitor);
            check(pointer);
        }
        invokePPV(monitor, pointer, __functionAddress);
    }

    // --- [ glfwGetMonitorUserPointer ] ---

    /**
     * Returns the user pointer of the specified monitor.
     * 
     * <p>This function returns the current value of the user-defined pointer of the specified monitor. The initial value is {@code NULL}.</p>
     * 
     * <p>This function may be called from the monitor callback, even for a monitor that is being disconnected.</p>
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the monitor whose pointer to return
     *
     * @since version 3.3
     */
    @NativeType("void *")
    public static long glfwGetMonitorUserPointer(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetMonitorUserPointer;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    // --- [ glfwSetMonitorCallback ] ---

    /** Unsafe version of: {@link #glfwSetMonitorCallback SetMonitorCallback} */
    public static long nglfwSetMonitorCallback(long cbfun) {
        long __functionAddress = Functions.SetMonitorCallback;
        return invokePP(cbfun, __functionAddress);
    }

    /**
     * Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
     * system.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWmonitorfun")
    public static GLFWMonitorCallback glfwSetMonitorCallback(@Nullable @NativeType("GLFWmonitorfun") GLFWMonitorCallbackI cbfun) {
        return GLFWMonitorCallback.createSafe(nglfwSetMonitorCallback(memAddressSafe(cbfun)));
    }

    // --- [ glfwGetVideoModes ] ---

    /**
     * Unsafe version of: {@link #glfwGetVideoModes GetVideoModes}
     *
     * @param count where to store the number of video modes in the returned array. This is set to zero if an error occurred.
     */
    public static long nglfwGetVideoModes(long monitor, long count) {
        long __functionAddress = Functions.GetVideoModes;
        if (CHECKS) {
            check(monitor);
        }
        return invokePPP(monitor, count, __functionAddress);
    }

    /**
     * Returns an array of all video modes supported by the specified monitor.
     * 
     * <p>The returned array is sorted in ascending order, first by color bit depth (the sum of all channel depths), then by resolution area (the product of
     * width and height), then resolution width and finally by refresh rate.</p>
     * 
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected, this
     * function is called again for that monitor or the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     *
     * @return an array of video modes, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    @Nullable
    @NativeType("GLFWvidmode const *")
    public static GLFWVidMode.Buffer glfwGetVideoModes(@NativeType("GLFWmonitor *") long monitor) {
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

    /** Unsafe version of: {@link #glfwGetVideoMode GetVideoMode} */
    public static long nglfwGetVideoMode(long monitor) {
        long __functionAddress = Functions.GetVideoMode;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /**
     * Returns the current video mode of the specified monitor. If you have created a full screen window for that monitor, the return value will depend on
     * whether that window is iconified.
     * 
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
     * library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param monitor the monitor to query
     *
     * @return the current mode of the monitor, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWvidmode const *")
    public static GLFWVidMode glfwGetVideoMode(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetVideoMode(monitor);
        return GLFWVidMode.createSafe(__result);
    }

    // --- [ glfwSetGamma ] ---

    /**
     * Generates a gamma ramp and sets it for the specified monitor.
     * 
     * <p>This function generates an appropriately sized gamma ramp from the specified exponent and then calls {@link #glfwSetGammaRamp SetGammaRamp} with it. The value must be a
     * finite number greater than zero.</p>
     * 
     * <p>The software controlled gamma ramp is applied <em>in addition</em> to the hardware gamma correction, which today is usually an approximation of sRGB
     * gamma. This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.</p>
     * 
     * <p>For gamma correct rendering with OpenGL or OpenGL ES, see the {@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE} hint.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</li>
     * </ul>
     *
     * @param monitor the monitor whose gamma ramp to set
     * @param gamma   the desired exponent
     *
     * @since version 3.0
     */
    public static void glfwSetGamma(@NativeType("GLFWmonitor *") long monitor, float gamma) {
        long __functionAddress = Functions.SetGamma;
        if (CHECKS) {
            check(monitor);
        }
        invokePV(monitor, gamma, __functionAddress);
    }

    // --- [ glfwGetGammaRamp ] ---

    /** Unsafe version of: {@link #glfwGetGammaRamp GetGammaRamp} */
    public static long nglfwGetGammaRamp(long monitor) {
        long __functionAddress = Functions.GetGammaRamp;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /**
     * Returns the current gamma ramp of the specified monitor.
     * 
     * <p>The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. They are valid until the specified monitor is
     * disconnected, this function is called again for that monitor or the library is terminated.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR} while returning
     * {@code NULL}.</li>
     * </ul>
     *
     * @param monitor the monitor to query
     *
     * @return the current gamma ramp, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWgammaramp const *")
    public static GLFWGammaRamp glfwGetGammaRamp(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetGammaRamp(monitor);
        return GLFWGammaRamp.createSafe(__result);
    }

    // --- [ glfwSetGammaRamp ] ---

    /** Unsafe version of: {@link #glfwSetGammaRamp SetGammaRamp} */
    public static void nglfwSetGammaRamp(long monitor, long ramp) {
        long __functionAddress = Functions.SetGammaRamp;
        if (CHECKS) {
            check(monitor);
            GLFWGammaRamp.validate(ramp);
        }
        invokePPV(monitor, ramp, __functionAddress);
    }

    /**
     * Sets the current gamma ramp for the specified monitor.
     * 
     * <p>This function sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this
     * function is called and is restored by {@link #glfwTerminate Terminate}.</p>
     * 
     * <p>The software controlled gamma ramp is applied <em>in addition</em> to the hardware gamma correction, which today is usually an approximation of sRGB
     * gamma. This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.</p>
     * 
     * <p>For gamma correct rendering with OpenGL or OpenGL ES, see the {@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE} hint.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The size of the specified gamma ramp should match the size of the current ramp for that monitor.</li>
     * <li><b>Windows</b>: The gamma ramp size must be 256.</li>
     * <li><b>Wayland</b>: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</li>
     * <li>The specified gamma ramp is copied before this function returns.</li>
     * </ul></div>
     *
     * @param monitor the monitor whose gamma ramp to set
     * @param ramp    the gamma ramp to use
     *
     * @since version 3.0
     */
    public static void glfwSetGammaRamp(@NativeType("GLFWmonitor *") long monitor, @NativeType("GLFWgammaramp const *") GLFWGammaRamp ramp) {
        nglfwSetGammaRamp(monitor, ramp.address());
    }

    // --- [ glfwDefaultWindowHints ] ---

    /**
     * Resets all window hints to their default values. See {@link #glfwWindowHint WindowHint} for details.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @since version 3.0
     */
    public static void glfwDefaultWindowHints() {
        long __functionAddress = Functions.DefaultWindowHints;
        invokeV(__functionAddress);
    }

    // --- [ glfwWindowHint ] ---

    /**
     * Sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to this function or
     * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.
     * 
     * <p>Only integer value hints can be set with this function. String value hints are set with {@link #glfwWindowHintString WindowHintString}.</p>
     * 
     * <p>This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
     * call to {@link #glfwCreateWindow CreateWindow}.</p>
     * 
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.</p>
     * 
     * <h5>Supported and default values</h5>
     * 
     * <table class=striped>
     * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
     * <tr><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_DECORATED DECORATED}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_FOCUSED FOCUSED}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_CENTER_CURSOR CENTER_CURSOR}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_RED_BITS RED_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_GREEN_BITS GREEN_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_BLUE_BITS BLUE_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_ALPHA_BITS ALPHA_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_DEPTH_BITS DEPTH_BITS}</td><td>24</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_STENCIL_BITS STENCIL_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
     * <tr><td>{@link #GLFW_SAMPLES SAMPLES}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
     * <tr><td>{@link #GLFW_REFRESH_RATE REFRESH_RATE}</td><td>{@link #GLFW_DONT_CARE DONT_CARE}</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
     * <tr><td>{@link #GLFW_STEREO STEREO}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_DOUBLEBUFFER DOUBLEBUFFER}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_CLIENT_API CLIENT_API}</td><td>{@link #GLFW_OPENGL_API OPENGL_API}</td><td>{@link #GLFW_NO_API NO_API} {@link #GLFW_OPENGL_API OPENGL_API} {@link #GLFW_OPENGL_ES_API OPENGL_ES_API}</td></tr>
     * <tr><td>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API}</td><td>{@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API} {@link #GLFW_OSMESA_CONTEXT_API OSMESA_CONTEXT_API}</td></tr>
     * <tr><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>1</td><td>Any valid major version number of the chosen client API</td></tr>
     * <tr><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>0</td><td>Any valid minor version number of the chosen client API</td></tr>
     * <tr><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS}</td><td>{@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}</td></tr>
     * <tr><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR} {@link #GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH} {@link #GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}</td></tr>
     * <tr><td>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE}</td><td>{@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE}</td></tr>
     * <tr><td>{@link #GLFW_WIN32_KEYBOARD_MENU WIN32_KEYBOARD_MENU}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * <tr><td>{@link #GLFW_COCOA_GRAPHICS_SWITCHING COCOA_GRAPHICS_SWITCHING}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
     * </table>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param hint  the window hint to set. One of:<br><table><tr><td>{@link #GLFW_FOCUSED FOCUSED}</td><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_DECORATED DECORATED}</td><td>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td></tr><tr><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link #GLFW_CENTER_CURSOR CENTER_CURSOR}</td><td>{@link #GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER}</td><td>{@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td></tr><tr><td>{@link #GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td><td>{@link #GLFW_POSITION_X POSITION_X}</td><td>{@link #GLFW_POSITION_Y POSITION_Y}</td><td>{@link #GLFW_CLIENT_API CLIENT_API}</td><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td></tr><tr><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link #GLFW_CONTEXT_DEBUG CONTEXT_DEBUG}</td><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td></tr><tr><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link #GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR}</td></tr><tr><td>{@link #GLFW_RED_BITS RED_BITS}</td><td>{@link #GLFW_GREEN_BITS GREEN_BITS}</td><td>{@link #GLFW_BLUE_BITS BLUE_BITS}</td><td>{@link #GLFW_ALPHA_BITS ALPHA_BITS}</td><td>{@link #GLFW_DEPTH_BITS DEPTH_BITS}</td></tr><tr><td>{@link #GLFW_STENCIL_BITS STENCIL_BITS}</td><td>{@link #GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td><td>{@link #GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td><td>{@link #GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>{@link #GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td></tr><tr><td>{@link #GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>{@link #GLFW_STEREO STEREO}</td><td>{@link #GLFW_SAMPLES SAMPLES}</td><td>{@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link #GLFW_REFRESH_RATE REFRESH_RATE}</td></tr><tr><td>{@link #GLFW_DOUBLEBUFFER DOUBLEBUFFER}</td><td>{@link #GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER}</td><td>{@link #GLFW_COCOA_GRAPHICS_SWITCHING COCOA_GRAPHICS_SWITCHING}</td></tr></table>
     * @param value the new value of the window hint
     *
     * @since version 2.2
     */
    public static void glfwWindowHint(int hint, int value) {
        long __functionAddress = Functions.WindowHint;
        invokeV(hint, value, __functionAddress);
    }

    // --- [ glfwWindowHintString ] ---

    /** Unsafe version of: {@link #glfwWindowHintString WindowHintString} */
    public static void nglfwWindowHintString(int hint, long value) {
        long __functionAddress = Functions.WindowHintString;
        invokePV(hint, value, __functionAddress);
    }

    /**
     * Sets the specified window hint to the desired value.
     * 
     * <p>This function sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to this function or
     * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.</p>
     * 
     * <p>Only string type hints can be set with this function. Integer value hints are set with {@link #glfwWindowHint WindowHint}.</p>
     * 
     * <p>This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
     * call to {@link #glfwCreateWindow CreateWindow}.</p>
     * 
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.</p>
     * 
     * <h5>Supported and default values</h5>
     * 
     * <table class=striped>
     * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
     * <tr><td>{@link #GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>""</td><td>A UTF-8 encoded frame autosave name</td></tr>
     * <tr><td>{@link #GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} class name</td></tr>
     * <tr><td>{@link #GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} instance name</td></tr>
     * <tr><td>{@link #GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td><td>""</td><td>An ASCII encoded Wayland {@code app_id} name</td></tr>
     * </table>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param hint  the window hint to set. One of:<br><table><tr><td>{@link #GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>{@link #GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>{@link #GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>{@link #GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td></tr></table>
     * @param value the new value of the window hint. The specified string is copied before this function returns.
     *
     * @since version 3.3
     */
    public static void glfwWindowHintString(int hint, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
        }
        nglfwWindowHintString(hint, memAddress(value));
    }

    /**
     * Sets the specified window hint to the desired value.
     * 
     * <p>This function sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to this function or
     * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.</p>
     * 
     * <p>Only string type hints can be set with this function. Integer value hints are set with {@link #glfwWindowHint WindowHint}.</p>
     * 
     * <p>This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
     * call to {@link #glfwCreateWindow CreateWindow}.</p>
     * 
     * <p>Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.</p>
     * 
     * <h5>Supported and default values</h5>
     * 
     * <table class=striped>
     * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
     * <tr><td>{@link #GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>""</td><td>A UTF-8 encoded frame autosave name</td></tr>
     * <tr><td>{@link #GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} class name</td></tr>
     * <tr><td>{@link #GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>""</td><td>An ASCII encoded {@code WM_CLASS} instance name</td></tr>
     * <tr><td>{@link #GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td><td>""</td><td>An ASCII encoded Wayland {@code app_id} name</td></tr>
     * </table>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param hint  the window hint to set. One of:<br><table><tr><td>{@link #GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}</td><td>{@link #GLFW_X11_CLASS_NAME X11_CLASS_NAME}</td><td>{@link #GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME}</td><td>{@link #GLFW_WAYLAND_APP_ID WAYLAND_APP_ID}</td></tr></table>
     * @param value the new value of the window hint. The specified string is copied before this function returns.
     *
     * @since version 3.3
     */
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

    /** Unsafe version of: {@link #glfwCreateWindow CreateWindow} */
    public static long nglfwCreateWindow(int width, int height, long title, long monitor, long share) {
        long __functionAddress = Functions.CreateWindow;
        return invokePPPP(width, height, title, monitor, share, __functionAddress);
    }

    /**
     * Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
     * specified with window hints.
     * 
     * <p>Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
     * about the {@code share} parameter, see <a href="https://www.glfw.org/docs/latest/context.html#context_sharing">context sharing</a>.</p>
     * 
     * <p>The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
     * size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
     * {@link #glfwGetWindowAttrib GetWindowAttrib} and {@link #glfwGetWindowSize GetWindowSize} and {@link #glfwGetFramebufferSize GetFramebufferSize}.</p>
     * 
     * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
     * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
     * query connected monitors, see <a href="https://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
     * 
     * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
     * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
     * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
     * <a href="https://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
     * 
     * <p>Once you have created the window, you can switch it between windowed and full screen mode with {@link #glfwSetWindowMonitor SetWindowMonitor}. If the window has an OpenGL or
     * OpenGL ES context, it will be unaffected.</p>
     * 
     * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, set the {@link #GLFW_POSITION_X POSITION_X}
     * and {@link #GLFW_POSITION_Y POSITION_Y} window hints before creation. To restore the default behavior, set either or both hints back to {@link #GLFW_ANY_POSITION ANY_POSITION}.</p>
     * 
     * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
     * 
     * <p>Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
     * actual <a href="https://www.glfw.org/docs/latest/window.html#window_size">size</a> after creation.</p>
     * 
     * <p>The <a href="https://www.glfw.org/docs/latest/window.html#buffer_swap">swap interval</a> is not set during window creation and the initial value may vary
     * depending on driver settings and defaults.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
     * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
     * is present, the {@code IDI_APPLICATION} icon will be used instead. To set a different icon, see {@link #glfwSetWindowIcon SetWindowIcon}.</li>
     * <li><b>Windows</b>: The context to share resources with may not be current on any other thread.</li>
     * <li>The OS only supports core profile contexts for OpenGL versions 3.2 and later. Before creating an OpenGL context of version 3.2 or later you must
     * set the {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.</li>
     * <li><b>macOS</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's icon. For
     * more information on bundles, see the
     * <a href="https://developer.apple.com/library/content/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
     * Developer Library.</li>
     * <li><b>macOS</b>: On macOS 10.10 and later the window frame will not be rendered at full resolution on Retina displays unless the
     * {@link #GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER} hint is {@link #GLFW_TRUE TRUE} and the {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For
     * more information, see <a href="https://developer.apple.com/library/content/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High Resolution Guidelines for macOS</a> in the Mac Developer Library.</li>
     * <li><b>macOS</b>: When activating frame autosaving with {@link #GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}, the specified window size and position may be overridden by previously saved
     * values.</li>
     * <li><b>X11</b>: Some window managers will not respect the placement of initially hidden windows.</li>
     * <li><b>X11</b>: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able
     * to query the final size, position or other attributes directly after window creation.</li>
     * <li><b>X11</b>: The class part of the {@code WM_CLASS} window property will by default be set to the window title passed to this function. The instance
     * part will use the contents of the {@code RESOURCE_NAME} environment variable, if present and not empty, or fall back to the window title. Set the
     * {@link #GLFW_X11_CLASS_NAME X11_CLASS_NAME} and {@link #GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME} window hints to override this.</li>
     * <li><b>Wayland</b>: Compositors should implement the xdg-decoration protocol for GLFW to decorate the window properly. If this protocol isn't
     * supported, or if the compositor prefers client-side decorations, a very simple fallback frame will be drawn using the {@code wp_viewporter}
     * protocol. A compositor can still emit close, maximize or fullscreen events, using for instance a keybind mechanism. If neither of these protocols
     * is supported, the window won't be decorated.</li>
     * <li><b>Wayland</b>: A full screen window will not attempt to change the mode, no matter what the requested size or refresh rate.</li>
     * <li><b>Wayland</b>: Screensaver inhibition requires the idle-inhibit protocol to be implemented in the user's compositor.</li>
     * </ul></div>
     *
     * @param width   the desired width, in screen coordinates, of the window
     * @param height  the desired height, in screen coordinates, of the window
     * @param title   initial, UTF-8 encoded window title
     * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
     * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
     *
     * @return the handle of the created window, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    @NativeType("GLFWwindow *")
    public static long glfwCreateWindow(int width, int height, @NativeType("char const *") ByteBuffer title, @NativeType("GLFWmonitor *") long monitor, @NativeType("GLFWwindow *") long share) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nglfwCreateWindow(width, height, memAddress(title), monitor, share);
    }

    /**
     * Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
     * specified with window hints.
     * 
     * <p>Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
     * about the {@code share} parameter, see <a href="https://www.glfw.org/docs/latest/context.html#context_sharing">context sharing</a>.</p>
     * 
     * <p>The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
     * size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
     * {@link #glfwGetWindowAttrib GetWindowAttrib} and {@link #glfwGetWindowSize GetWindowSize} and {@link #glfwGetFramebufferSize GetFramebufferSize}.</p>
     * 
     * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
     * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
     * query connected monitors, see <a href="https://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
     * 
     * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
     * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
     * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
     * <a href="https://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
     * 
     * <p>Once you have created the window, you can switch it between windowed and full screen mode with {@link #glfwSetWindowMonitor SetWindowMonitor}. If the window has an OpenGL or
     * OpenGL ES context, it will be unaffected.</p>
     * 
     * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, set the {@link #GLFW_POSITION_X POSITION_X}
     * and {@link #GLFW_POSITION_Y POSITION_Y} window hints before creation. To restore the default behavior, set either or both hints back to {@link #GLFW_ANY_POSITION ANY_POSITION}.</p>
     * 
     * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
     * 
     * <p>Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
     * actual <a href="https://www.glfw.org/docs/latest/window.html#window_size">size</a> after creation.</p>
     * 
     * <p>The <a href="https://www.glfw.org/docs/latest/window.html#buffer_swap">swap interval</a> is not set during window creation and the initial value may vary
     * depending on driver settings and defaults.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
     * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
     * is present, the {@code IDI_APPLICATION} icon will be used instead. To set a different icon, see {@link #glfwSetWindowIcon SetWindowIcon}.</li>
     * <li><b>Windows</b>: The context to share resources with may not be current on any other thread.</li>
     * <li>The OS only supports core profile contexts for OpenGL versions 3.2 and later. Before creating an OpenGL context of version 3.2 or later you must
     * set the {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.</li>
     * <li><b>macOS</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's icon. For
     * more information on bundles, see the
     * <a href="https://developer.apple.com/library/content/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
     * Developer Library.</li>
     * <li><b>macOS</b>: On macOS 10.10 and later the window frame will not be rendered at full resolution on Retina displays unless the
     * {@link #GLFW_COCOA_RETINA_FRAMEBUFFER COCOA_RETINA_FRAMEBUFFER} hint is {@link #GLFW_TRUE TRUE} and the {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For
     * more information, see <a href="https://developer.apple.com/library/content/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High Resolution Guidelines for macOS</a> in the Mac Developer Library.</li>
     * <li><b>macOS</b>: When activating frame autosaving with {@link #GLFW_COCOA_FRAME_NAME COCOA_FRAME_NAME}, the specified window size and position may be overridden by previously saved
     * values.</li>
     * <li><b>X11</b>: Some window managers will not respect the placement of initially hidden windows.</li>
     * <li><b>X11</b>: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able
     * to query the final size, position or other attributes directly after window creation.</li>
     * <li><b>X11</b>: The class part of the {@code WM_CLASS} window property will by default be set to the window title passed to this function. The instance
     * part will use the contents of the {@code RESOURCE_NAME} environment variable, if present and not empty, or fall back to the window title. Set the
     * {@link #GLFW_X11_CLASS_NAME X11_CLASS_NAME} and {@link #GLFW_X11_INSTANCE_NAME X11_INSTANCE_NAME} window hints to override this.</li>
     * <li><b>Wayland</b>: Compositors should implement the xdg-decoration protocol for GLFW to decorate the window properly. If this protocol isn't
     * supported, or if the compositor prefers client-side decorations, a very simple fallback frame will be drawn using the {@code wp_viewporter}
     * protocol. A compositor can still emit close, maximize or fullscreen events, using for instance a keybind mechanism. If neither of these protocols
     * is supported, the window won't be decorated.</li>
     * <li><b>Wayland</b>: A full screen window will not attempt to change the mode, no matter what the requested size or refresh rate.</li>
     * <li><b>Wayland</b>: Screensaver inhibition requires the idle-inhibit protocol to be implemented in the user's compositor.</li>
     * </ul></div>
     *
     * @param width   the desired width, in screen coordinates, of the window
     * @param height  the desired height, in screen coordinates, of the window
     * @param title   initial, UTF-8 encoded window title
     * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
     * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
     *
     * @return the handle of the created window, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
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

    /**
     * Destroys the specified window and its context. On calling this function, no further callbacks will be called for that window.
     * 
     * <p>If the context of the specified window is current on the main thread, it is detached before being destroyed.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * <li>The context of the specified window must not be current on any other thread when this function is called.</li>
     * </ul></div>
     *
     * @param window the window to destroy
     *
     * @since version 1.0
     */
    public static void glfwDestroyWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        invokePV(window, __functionAddress);
    }

    // --- [ glfwWindowShouldClose ] ---

    /**
     * Returns the value of the close flag of the specified window.
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param window the window to query
     *
     * @return the value of the close flag
     *
     * @since version 3.0
     */
    @NativeType("int")
    public static boolean glfwWindowShouldClose(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.WindowShouldClose;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress) != 0;
    }

    // --- [ glfwSetWindowShouldClose ] ---

    /**
     * Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
     * should be closed.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the window whose flag to change
     * @param value  the new value
     *
     * @since version 3.0
     */
    public static void glfwSetWindowShouldClose(@NativeType("GLFWwindow *") long window, @NativeType("int") boolean value) {
        long __functionAddress = Functions.SetWindowShouldClose;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, value ? 1 : 0, __functionAddress);
    }

    // --- [ glfwSetWindowTitle ] ---

    /** Unsafe version of: {@link #glfwSetWindowTitle SetWindowTitle} */
    public static void nglfwSetWindowTitle(long window, long title) {
        long __functionAddress = Functions.SetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, title, __functionAddress);
    }

    /**
     * Sets the window title, encoded as UTF-8, of the specified window.
     * 
     * <p>This function must only be called from the main thread.</p>
     * 
     * <p><b>macOS</b>: The window title will not be updated until the next time you process events.</p>
     *
     * @param window the window whose title to change
     * @param title  the UTF-8 encoded window title
     *
     * @since version 1.0
     */
    public static void glfwSetWindowTitle(@NativeType("GLFWwindow *") long window, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        nglfwSetWindowTitle(window, memAddress(title));
    }

    /**
     * Sets the window title, encoded as UTF-8, of the specified window.
     * 
     * <p>This function must only be called from the main thread.</p>
     * 
     * <p><b>macOS</b>: The window title will not be updated until the next time you process events.</p>
     *
     * @param window the window whose title to change
     * @param title  the UTF-8 encoded window title
     *
     * @since version 1.0
     */
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

    /**
     * Unsafe version of: {@link #glfwSetWindowIcon SetWindowIcon}
     *
     * @param count the number of images in the specified array, or zero to revert to the default window icon
     */
    public static void nglfwSetWindowIcon(long window, int count, long images) {
        long __functionAddress = Functions.SetWindowIcon;
        if (CHECKS) {
            check(window);
            if (images != NULL) { Struct.validate(images, count, GLFWImage.SIZEOF, GLFWImage::validate); }
        }
        invokePPV(window, count, images, __functionAddress);
    }

    /**
     * Sets the icon for the specified window.
     * 
     * <p>This function sets the icon of the specified window. If passed an array of candidate images, those of or closest to the sizes desired by the system are
     * selected. If no images are specified, the window reverts to its default icon.</p>
     * 
     * <p>The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel with the red channel first. They are arranged canonically as
     * packed sequential rows, starting from the top-left corner.</p>
     * 
     * <p>The desired image sizes varies depending on platform and system settings. The selected images will be rescaled as needed. Good sizes include 16x16,
     * 32x32 and 48x48.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The specified image data is copied before this function returns.</li>
     * <li><b>macOS</b>: Regular windows do not have icons on macOS. This function will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}. The dock icon will be the same as the
     * application bundle's icon. For more information on bundles, see the <a href="https://developer.apple.com/library/content/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac Developer Library.</li>
     * <li><b>Wayland</b>: There is no existing protocol to change an icon, the window will thus inherit the one defined in the application's desktop file.
     * This function will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window whose icon to set
     * @param images the images to create the icon from. This is ignored if count is zero.
     *
     * @since version 3.2
     */
    public static void glfwSetWindowIcon(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWimage const *") GLFWImage.Buffer images) {
        nglfwSetWindowIcon(window, remainingSafe(images), memAddressSafe(images));
    }

    // --- [ glfwGetWindowPos ] ---

    /** Unsafe version of: {@link #glfwGetWindowPos GetWindowPos} */
    public static void nglfwGetWindowPos(long window, long xpos, long ypos) {
        long __functionAddress = Functions.GetWindowPos;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /**
     * Retrieves the position, in screen coordinates, of the upper-left corner of the content area of the specified window.
     * 
     * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: There is no way for an application to retrieve the global position of its windows. This function will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window to query
     * @param xpos   where to store the x-coordinate of the upper-left corner of the content area, or {@code NULL}
     * @param ypos   where to store the y-coordinate of the upper-left corner of the content area, or {@code NULL}
     *
     * @since version 3.0
     */
    public static void glfwGetWindowPos(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") IntBuffer xpos, @Nullable @NativeType("int *") IntBuffer ypos) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        nglfwGetWindowPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
    }

    // --- [ glfwSetWindowPos ] ---

    /**
     * Sets the position, in screen coordinates, of the upper-left corner of the content area of the specified windowed mode window. If the window is a full
     * screen window, this function does nothing.
     * 
     * <p><b>Do not use this function</b> to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the
     * user.</p>
     * 
     * <p>The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: There is no way for an application to set the global position of its windows. This function will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window to query
     * @param xpos   the x-coordinate of the upper-left corner of the content area
     * @param ypos   the y-coordinate of the upper-left corner of the content area
     *
     * @since version 1.0
     */
    public static void glfwSetWindowPos(@NativeType("GLFWwindow *") long window, int xpos, int ypos) {
        long __functionAddress = Functions.SetWindowPos;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, xpos, ypos, __functionAddress);
    }

    // --- [ glfwGetWindowSize ] ---

    /** Unsafe version of: {@link #glfwGetWindowSize GetWindowSize} */
    public static void nglfwGetWindowSize(long window, long width, long height) {
        long __functionAddress = Functions.GetWindowSize;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /**
     * Retrieves the size, in screen coordinates, of the content area of the specified window. If you wish to retrieve the size of the framebuffer of the
     * window in pixels, see {@link #glfwGetFramebufferSize GetFramebufferSize}.
     * 
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose size to retrieve
     * @param width  where to store the width, in screen coordinates, of the content area, or {@code NULL}
     * @param height where to store the height, in screen coordinates, of the content area, or {@code NULL}
     *
     * @since version 1.0
     */
    public static void glfwGetWindowSize(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") IntBuffer width, @Nullable @NativeType("int *") IntBuffer height) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
    }

    // --- [ glfwSetWindowSizeLimits ] ---

    /**
     * Sets the size limits of the content area of the specified window. If the window is full screen, the size limits only take effect if once it is made
     * windowed. If the window is not resizable, this function does nothing.
     * 
     * <p>The size limits are applied immediately to a windowed mode window and may cause it to be resized.</p>
     * 
     * <p>The maximum dimensions must be greater than or equal to the minimum dimensions and all must be greater than or equal to zero.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The size limits will not be applied until the window is actually resized, either by the user or by the compositor.</li>
     * </ul>
     *
     * @param window    the window to set limits for
     * @param minwidth  the minimum width, in screen coordinates, of the content area, or {@link #GLFW_DONT_CARE DONT_CARE}
     * @param minheight the minimum height, in screen coordinates, of the content area, or {@link #GLFW_DONT_CARE DONT_CARE}
     * @param maxwidth  the maximum width, in screen coordinates, of the content area, or {@link #GLFW_DONT_CARE DONT_CARE}
     * @param maxheight the maximum height, in screen coordinates, of the content area, or {@link #GLFW_DONT_CARE DONT_CARE}
     *
     * @since version 3.2
     */
    public static void glfwSetWindowSizeLimits(@NativeType("GLFWwindow *") long window, int minwidth, int minheight, int maxwidth, int maxheight) {
        long __functionAddress = Functions.SetWindowSizeLimits;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, minwidth, minheight, maxwidth, maxheight, __functionAddress);
    }

    // --- [ glfwSetWindowAspectRatio ] ---

    /**
     * Sets the required aspect ratio of the content area of the specified window. If the window is full screen, the aspect ratio only takes effect once it is
     * made windowed. If the window is not resizable, this function does nothing.
     * 
     * <p>The aspect ratio is specified as a numerator and a denominator and both values must be greater than zero. For example, the common 16:9 aspect ratio is
     * specified as 16 and 9, respectively.</p>
     * 
     * <p>If the numerator and denominator is set to {@link #GLFW_DONT_CARE DONT_CARE} then the aspect ratio limit is disabled.</p>
     * 
     * <p>The aspect ratio is applied immediately to a windowed mode window and may cause it to be resized.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The aspect ratio will not be applied until the window is actually resized, either by the user or by the compositor.</li>
     * </ul>
     *
     * @param window the window to set limits for
     * @param numer  the numerator of the desired aspect ratio, or {@link #GLFW_DONT_CARE DONT_CARE}
     * @param denom  the denominator of the desired aspect ratio, or {@link #GLFW_DONT_CARE DONT_CARE}
     *
     * @since version 3.2
     */
    public static void glfwSetWindowAspectRatio(@NativeType("GLFWwindow *") long window, int numer, int denom) {
        long __functionAddress = Functions.SetWindowAspectRatio;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, numer, denom, __functionAddress);
    }

    // --- [ glfwSetWindowSize ] ---

    /**
     * Sets the size, in pixels, of the content area of the specified window.
     * 
     * <p>For full screen windows, this function updates the resolution of its desired video mode and switches to the video mode closest to it, without affecting
     * the window's context. As the context is unaffected, the bit depths of the framebuffer remain unchanged.</p>
     * 
     * <p>If you wish to update the refresh rate of the desired video mode in addition to its resolution, see {@link #glfwSetWindowMonitor SetWindowMonitor}.</p>
     * 
     * <p>The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: A full screen window will not attempt to change the mode, no matter what the requested size.</li>
     * </ul>
     *
     * @param window the window to resize
     * @param width  the desired width, in screen coordinates, of the window content area
     * @param height the desired height, in screen coordinates, of the window content area
     *
     * @since version 1.0
     */
    public static void glfwSetWindowSize(@NativeType("GLFWwindow *") long window, int width, int height) {
        long __functionAddress = Functions.SetWindowSize;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, width, height, __functionAddress);
    }

    // --- [ glfwGetFramebufferSize ] ---

    /** Unsafe version of: {@link #glfwGetFramebufferSize GetFramebufferSize} */
    public static void nglfwGetFramebufferSize(long window, long width, long height) {
        long __functionAddress = Functions.GetFramebufferSize;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /**
     * Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
     * {@link #glfwGetWindowSize GetWindowSize}.
     * 
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose framebuffer to query
     * @param width  where to store the width, in pixels, of the framebuffer, or {@code NULL}
     * @param height where to store the height, in pixels, of the framebuffer, or {@code NULL}
     *
     * @since version 3.0
     */
    public static void glfwGetFramebufferSize(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") IntBuffer width, @Nullable @NativeType("int *") IntBuffer height) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
    }

    // --- [ glfwGetWindowFrameSize ] ---

    /** Unsafe version of: {@link #glfwGetWindowFrameSize GetWindowFrameSize} */
    public static void nglfwGetWindowFrameSize(long window, long left, long top, long right, long bottom) {
        long __functionAddress = Functions.GetWindowFrameSize;
        if (CHECKS) {
            check(window);
        }
        invokePPPPPV(window, left, top, right, bottom, __functionAddress);
    }

    /**
     * Retrieves the size, in screen coordinates, of each edge of the frame of the specified window. This size includes the title bar, if the window has one.
     * The size of the frame may vary depending on the <a href="https://www.glfw.org/docs/latest/window.html#window-hints_wnd">window-related hints</a> used to
     * create it.
     * 
     * <p>Because this function retrieves the size of each window frame edge and not the offset along a particular coordinate axis, the retrieved values will
     * always be zero or positive.</p>
     * 
     * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose frame size to query
     * @param left   where to store the size, in screen coordinates, of the left edge of the window frame, or {@code NULL}
     * @param top    where to store the size, in screen coordinates, of the top edge of the window frame, or {@code NULL}
     * @param right  where to store the size, in screen coordinates, of the right edge of the window frame, or {@code NULL}
     * @param bottom where to store the size, in screen coordinates, of the bottom edge of the window frame, or {@code NULL}
     *
     * @since version 3.1
     */
    public static void glfwGetWindowFrameSize(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") IntBuffer left, @Nullable @NativeType("int *") IntBuffer top, @Nullable @NativeType("int *") IntBuffer right, @Nullable @NativeType("int *") IntBuffer bottom) {
        if (CHECKS) {
            checkSafe(left, 1);
            checkSafe(top, 1);
            checkSafe(right, 1);
            checkSafe(bottom, 1);
        }
        nglfwGetWindowFrameSize(window, memAddressSafe(left), memAddressSafe(top), memAddressSafe(right), memAddressSafe(bottom));
    }

    // --- [ glfwGetWindowContentScale ] ---

    /** Unsafe version of: {@link #glfwGetWindowContentScale GetWindowContentScale} */
    public static void nglfwGetWindowContentScale(long window, long xscale, long yscale) {
        long __functionAddress = Functions.GetWindowContentScale;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, xscale, yscale, __functionAddress);
    }

    /**
     * Retrieves the content scale for the specified window.
     * 
     * <p>This function retrieves the content scale for the specified window. The content scale is the ratio between the current DPI and the platform's default
     * DPI. This is especially important for text and any UI elements. If the pixel dimensions of your UI scaled by this look appropriate on your machine then
     * it should appear at a reasonable size on other machines regardless of their DPI and scaling settings. This relies on the system DPI and scaling
     * settings being somewhat correct.</p>
     * 
     * <p>On platforms where each monitor can have its own content scale, the window content scale will depend on which monitor the system considers the window
     * to be on.</p>
     *
     * @param window the window to query
     * @param xscale where to store the x-axis content scale, or {@code NULL}
     * @param yscale where to store the y-axis content scale, or {@code NULL}
     *
     * @since version 3.3
     */
    public static void glfwGetWindowContentScale(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("float *") FloatBuffer xscale, @Nullable @NativeType("float *") FloatBuffer yscale) {
        if (CHECKS) {
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        nglfwGetWindowContentScale(window, memAddressSafe(xscale), memAddressSafe(yscale));
    }

    // --- [ glfwGetWindowOpacity ] ---

    /**
     * Returns the opacity of the whole window.
     * 
     * <p>This function returns the opacity of the window, including any decorations.</p>
     * 
     * <p>The opacity (or alpha) value is a positive finite number between zero and one, where zero is fully transparent and one is fully opaque.  If the system
     * does not support whole window transparency, this function always returns one.</p>
     * 
     * <p>The initial opacity value for newly created windows is one.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     *
     * @return the opacity value of the specified window
     *
     * @since version 3.3
     */
    public static float glfwGetWindowOpacity(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ glfwSetWindowOpacity ] ---

    /**
     * Sets the opacity of the whole window.
     * 
     * <p>This function sets the opacity of the window, including any decorations.</p>
     * 
     * <p>The opacity (or alpha) value is a positive finite number between zero and one, where zero is fully transparent and one is fully opaque.</p>
     * 
     * <p>The initial opacity value for newly created windows is one.</p>
     * 
     * <p>A window created with framebuffer transparency may not use whole window transparency. The results of doing this are undefined.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: There is no way to set an opacity factor for a window. This function will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window  the window to set the opacity for
     * @param opacity the desired opacity of the specified window
     *
     * @since version 3.3
     */
    public static void glfwSetWindowOpacity(@NativeType("GLFWwindow *") long window, float opacity) {
        long __functionAddress = Functions.SetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, opacity, __functionAddress);
    }

    // --- [ glfwIconifyWindow ] ---

    /**
     * Iconifies (minimizes) the specified window if it was previously restored. If the window is already iconified, this function does nothing.
     * 
     * <p>If the specified window is a full screen window, GLFW restores the original video mode of the monitor. The window's desired video mode is set again
     * when the window is restored.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Once a window is iconified, {@link #glfwRestoreWindow RestoreWindow} won’t be able to restore it. This is a design decision of the {@code xdg-shell}.</li>
     * </ul>
     *
     * @param window the window to iconify
     *
     * @since version 2.1
     */
    public static void glfwIconifyWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.IconifyWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwRestoreWindow ] ---

    /**
     * Restores the specified window if it was previously iconified (minimized) or maximized. If the window is already restored, this function does nothing.
     * 
     * <p>If the specified window is an iconified full screen window, its desired video mode is set again for its monitor when the window is restored.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to restore
     *
     * @since version 2.1
     */
    public static void glfwRestoreWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.RestoreWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwMaximizeWindow ] ---

    /**
     * Maximizes the specified window if it was previously not maximized. If the window is already maximized, this function does nothing.
     * 
     * <p>If the specified window is a full screen window, this function does nothing.</p>
     * 
     * <p>This function may only be called from the main thread.</p>
     *
     * @param window the window to maximize
     *
     * @since version 3.2
     */
    public static void glfwMaximizeWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.MaximizeWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwShowWindow ] ---

    /**
     * Makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.
     * 
     * <p>By default, windowed mode windows are focused when shown. Set the {@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW} window hint to change this behavior for all newly created windows, or
     * change the behavior for an existing window with {@link #glfwSetWindowAttrib SetWindowAttrib}.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: Because Wayland wants every frame of the desktop to be complete, this function does not immediately make the window visible.
     * Instead it will become visible the next time the window framebuffer is updated after this call.</li>
     * </ul>
     *
     * @param window the window to make visible
     *
     * @since version 3.0
     */
    public static void glfwShowWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.ShowWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwHideWindow ] ---

    /**
     * Hides the specified window, if it was previously visible. If the window is already hidden or is in full screen mode, this function does nothing.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to hide
     *
     * @since version 3.0
     */
    public static void glfwHideWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.HideWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwFocusWindow ] ---

    /**
     * Brings the specified window to front and sets input focus. The window should already be visible and not iconified.
     * 
     * <p>By default, both windowed and full screen mode windows are focused when initially created. Set the {@link #GLFW_FOCUSED FOCUSED} hint to disable this behavior.</p>
     * 
     * <p>Also by default, windowed mode windows are focused when shown with {@link #glfwShowWindow ShowWindow}. Set the {@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW} window hint to disable this behavior.</p>
     * 
     * <p><b>Do not use this function</b> to steal focus from other applications unless you are certain that is what the user wants. Focus stealing can be
     * extremely disruptive.</p>
     * 
     * <p>For a less disruptive way of getting the user's attention, see {@link #glfwRequestWindowAttention RequestWindowAttention}.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: It is not possible for an application to set the input focus. This function will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the window to give input focus
     *
     * @since version 3.2
     */
    public static void glfwFocusWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.FocusWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwRequestWindowAttention ] ---

    /**
     * Requests user attention to the specified window.
     * 
     * <p>This function requests user attention to the specified window. On platforms where this is not supported, attention is requested to the application as
     * a whole.</p>
     * 
     * <p>Once the user has given attention, usually by focusing the window or application, the system will end the request automatically.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>macOS:</b> Attention is requested to the application as a whole, not the specific window.</li>
     * </ul></div>
     *
     * @param window the window to request attention to
     *
     * @since version 3.3
     */
    public static void glfwRequestWindowAttention(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.RequestWindowAttention;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwGetWindowMonitor ] ---

    /**
     * Returns the handle of the monitor that the specified window is in full screen on.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     *
     * @return the monitor, or {@code NULL} if the window is in windowed mode or an error occurred
     *
     * @since version 3.0
     */
    @NativeType("GLFWmonitor *")
    public static long glfwGetWindowMonitor(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWindowMonitor;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwSetWindowMonitor ] ---

    /**
     * Sets the mode, monitor, video mode and placement of a window.
     * 
     * <p>This function sets the monitor that the window uses for full screen mode or, if the monitor is {@code NULL}, makes it windowed mode.</p>
     * 
     * <p>When setting a monitor, this function updates the width, height and refresh rate of the desired video mode and switches to the video mode closest to
     * it. The window position is ignored when setting a monitor.</p>
     * 
     * <p>When the monitor is {@code NULL}, the position, width and height are used to place the window content area. The refresh rate is ignored when no monitor is
     * specified.</p>
     * 
     * <p>If you only wish to update the resolution of a full screen window or the size of a windowed mode window, see {@link #glfwSetWindowSize SetWindowSize}.</p>
     * 
     * <p>When a window transitions from full screen to windowed mode, this function restores any previous window settings such as whether it is decorated,
     * floating, resizable, has size or aspect ratio limits, etc.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: The desired window position is ignored, as there is no way for an application to set this property.</li>
     * <li><b>Wayland</b>: Setting the window to full screen will not attempt to change the mode, no matter what the requested size or refresh rate.</li>
     * </ul>
     *
     * @param window      the window whose monitor, size or video mode to set
     * @param monitor     the desired monitor, or {@code NULL} to set windowed mode
     * @param xpos        the desired x-coordinate of the upper-left corner of the content area
     * @param ypos        the desired y-coordinate of the upper-left corner of the content area
     * @param width       the desired with, in screen coordinates, of the content area or video mode
     * @param height      the desired height, in screen coordinates, of the content area or video mode
     * @param refreshRate the desired refresh rate, in Hz, of the video mode, or {@link #GLFW_DONT_CARE DONT_CARE}
     *
     * @since version 3.2
     */
    public static void glfwSetWindowMonitor(@NativeType("GLFWwindow *") long window, @NativeType("GLFWmonitor *") long monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        long __functionAddress = Functions.SetWindowMonitor;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, monitor, xpos, ypos, width, height, refreshRate, __functionAddress);
    }

    // --- [ glfwGetWindowAttrib ] ---

    /**
     * Returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.
     * 
     * <p>This function must only be called from the main thread.</p>
     * 
     * <p>Framebuffer related hints are not window attributes.</p>
     * 
     * <p>Zero is a valid value for many window and context related attributes so you cannot use a return value of zero as an indication of errors. However, this
     * function should not fail as long as it is passed valid arguments and the library has been initialized.</p>
     * 
     * <p><b>Wayland</b>: The Wayland protocol provides no way to check whether a window is iconfied, so {@link #GLFW_ICONIFIED ICONIFIED} always returns {@link #GLFW_FALSE FALSE}.</p>
     *
     * @param window the window to query
     * @param attrib the <a href="https://www.glfw.org/docs/latest/window.html#window_attribs">window attribute</a> whose value to return. One of:<br><table><tr><td>{@link #GLFW_FOCUSED FOCUSED}</td><td>{@link #GLFW_ICONIFIED ICONIFIED}</td><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_DECORATED DECORATED}</td></tr><tr><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link #GLFW_CENTER_CURSOR CENTER_CURSOR}</td><td>{@link #GLFW_TRANSPARENT_FRAMEBUFFER TRANSPARENT_FRAMEBUFFER}</td><td>{@link #GLFW_HOVERED HOVERED}</td></tr><tr><td>{@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td><td>{@link #GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td><td>{@link #GLFW_POSITION_X POSITION_X}</td><td>{@link #GLFW_POSITION_Y POSITION_Y}</td><td>{@link #GLFW_CLIENT_API CLIENT_API}</td></tr><tr><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>{@link #GLFW_CONTEXT_REVISION CONTEXT_REVISION}</td><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td></tr><tr><td>{@link #GLFW_CONTEXT_DEBUG CONTEXT_DEBUG}</td><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td></tr><tr><td>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link #GLFW_SCALE_TO_MONITOR SCALE_TO_MONITOR}</td></tr></table>
     *
     * @return the value of the attribute, or zero if an error occurred
     *
     * @since version 3.0
     */
    public static int glfwGetWindowAttrib(@NativeType("GLFWwindow *") long window, int attrib) {
        long __functionAddress = Functions.GetWindowAttrib;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, attrib, __functionAddress);
    }

    // --- [ glfwSetWindowAttrib ] ---

    /**
     * Sets an attribute of the specified window.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to set the attribute for
     * @param attrib the attribute to set.
     *               
     *               <p>Some of these attributes are ignored for full screen windows. The new value will take effect if the window is later made windowed.</p>
     *               
     *               <p>Some of these attributes are ignored for windowed mode windows. The new value will take effect if the window is later made full screen.</p>
     *               
     *               <p>Calling {@link #glfwGetWindowAttrib GetWindowAttrib} will always return the latest value, even if that value is ignored by the current mode of the window. One of:<br></p><table><tr><td>{@link #GLFW_DECORATED DECORATED}</td><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link #GLFW_FOCUS_ON_SHOW FOCUS_ON_SHOW}</td><td>{@link #GLFW_MOUSE_PASSTHROUGH MOUSE_PASSTHROUGH}</td></tr></table>
     * @param value  the value to set
     *
     * @since version 3.3
     */
    public static void glfwSetWindowAttrib(@NativeType("GLFWwindow *") long window, int attrib, int value) {
        long __functionAddress = Functions.SetWindowAttrib;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, attrib, value, __functionAddress);
    }

    // --- [ glfwSetWindowUserPointer ] ---

    /**
     * Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is {@code NULL}.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window  the window whose pointer to set
     * @param pointer the new value
     *
     * @since version 3.0
     */
    public static void glfwSetWindowUserPointer(@NativeType("GLFWwindow *") long window, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.SetWindowUserPointer;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, pointer, __functionAddress);
    }

    // --- [ glfwGetWindowUserPointer ] ---

    /**
     * Returns the current value of the user-defined pointer of the specified window. The initial value is {@code NULL}.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the window whose pointer to return
     *
     * @since version 3.0
     */
    @NativeType("void *")
    public static long glfwGetWindowUserPointer(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWindowUserPointer;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwSetWindowPosCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowPosCallback SetWindowPosCallback} */
    public static long nglfwSetWindowPosCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowPosCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the position, in screen
     * coordinates, of the upper-left corner of the content area of the window.
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: This callback will never be called, as there is no way for an application to know its global position.</li>
     * </ul>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 1.0
     */
    @Nullable
    @NativeType("GLFWwindowposfun")
    public static GLFWWindowPosCallback glfwSetWindowPosCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowposfun") GLFWWindowPosCallbackI cbfun) {
        return GLFWWindowPosCallback.createSafe(nglfwSetWindowPosCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowSizeCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowSizeCallback SetWindowSizeCallback} */
    public static long nglfwSetWindowSizeCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowSizeCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
     * coordinates, of the content area of the window.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 1.0
     */
    @Nullable
    @NativeType("GLFWwindowsizefun")
    public static GLFWWindowSizeCallback glfwSetWindowSizeCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowsizefun") GLFWWindowSizeCallbackI cbfun) {
        return GLFWWindowSizeCallback.createSafe(nglfwSetWindowSizeCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowCloseCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowCloseCallback SetWindowCloseCallback} */
    public static long nglfwSetWindowCloseCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowCloseCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
     * the title bar.
     * 
     * <p>The close flag is set before this callback is called, but you can modify it at any time with {@link #glfwSetWindowShouldClose SetWindowShouldClose}.</p>
     * 
     * <p>The close callback is not triggered by {@link #glfwDestroyWindow DestroyWindow}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>macOS:</b> Selecting Quit from the application menu will trigger the close callback for all windows.</li>
     * </ul></div>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 2.5
     */
    @Nullable
    @NativeType("GLFWwindowclosefun")
    public static GLFWWindowCloseCallback glfwSetWindowCloseCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowclosefun") GLFWWindowCloseCallbackI cbfun) {
        return GLFWWindowCloseCallback.createSafe(nglfwSetWindowCloseCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowRefreshCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowRefreshCallback SetWindowRefreshCallback} */
    public static long nglfwSetWindowRefreshCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowRefreshCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the refresh callback of the specified window, which is called when the content area of the window needs to be redrawn, for example if the window has
     * been exposed after having been covered by another window.
     * 
     * <p>On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
     * infrequently or never at all.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 2.5
     */
    @Nullable
    @NativeType("GLFWwindowrefreshfun")
    public static GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowrefreshfun") GLFWWindowRefreshCallbackI cbfun) {
        return GLFWWindowRefreshCallback.createSafe(nglfwSetWindowRefreshCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowFocusCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowFocusCallback SetWindowFocusCallback} */
    public static long nglfwSetWindowFocusCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowFocusCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the focus callback of the specified window, which is called when the window gains or loses input focus.
     * 
     * <p>After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
     * that had been pressed. For more information, see {@link #glfwSetKeyCallback SetKeyCallback} and {@link #glfwSetMouseButtonCallback SetMouseButtonCallback}.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWwindowfocusfun")
    public static GLFWWindowFocusCallback glfwSetWindowFocusCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowfocusfun") GLFWWindowFocusCallbackI cbfun) {
        return GLFWWindowFocusCallback.createSafe(nglfwSetWindowFocusCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowIconifyCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowIconifyCallback SetWindowIconifyCallback} */
    public static long nglfwSetWindowIconifyCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowIconifyCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the iconification callback of the specified window, which is called when the window is iconified or restored.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWwindowiconifyfun")
    public static GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowiconifyfun") GLFWWindowIconifyCallbackI cbfun) {
        return GLFWWindowIconifyCallback.createSafe(nglfwSetWindowIconifyCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowMaximizeCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowMaximizeCallback SetWindowMaximizeCallback} */
    public static long nglfwSetWindowMaximizeCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowMaximizeCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the maximization callback of the specified window, which is called when the window is maximized or restored.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.3
     */
    @Nullable
    @NativeType("GLFWwindowmaximizefun")
    public static GLFWWindowMaximizeCallback glfwSetWindowMaximizeCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowmaximizefun") GLFWWindowMaximizeCallbackI cbfun) {
        return GLFWWindowMaximizeCallback.createSafe(nglfwSetWindowMaximizeCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetFramebufferSizeCallback ] ---

    /** Unsafe version of: {@link #glfwSetFramebufferSizeCallback SetFramebufferSizeCallback} */
    public static long nglfwSetFramebufferSizeCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetFramebufferSizeCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWframebuffersizefun")
    public static GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWframebuffersizefun") GLFWFramebufferSizeCallbackI cbfun) {
        return GLFWFramebufferSizeCallback.createSafe(nglfwSetFramebufferSizeCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetWindowContentScaleCallback ] ---

    /** Unsafe version of: {@link #glfwSetWindowContentScaleCallback SetWindowContentScaleCallback} */
    public static long nglfwSetWindowContentScaleCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetWindowContentScaleCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the window content scale callback for the specified window, which is called when the content scale of the specified window changes.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
     *         <a href="https://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
     *
     * @since version 3.3
     */
    @Nullable
    @NativeType("GLFWwindowcontentscalefun")
    public static GLFWWindowContentScaleCallback glfwSetWindowContentScaleCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWwindowcontentscalefun") GLFWWindowContentScaleCallbackI cbfun) {
        return GLFWWindowContentScaleCallback.createSafe(nglfwSetWindowContentScaleCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwPollEvents ] ---

    /**
     * Processes all pending events.
     * 
     * <p>This function processes only those events that are already in the event queue and then returns immediately. Processing events will cause the window and
     * input callbacks associated with those events to be called.</p>
     * 
     * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
     * those platforms. You can use the <a href="https://www.glfw.org/docs/latest/window.html#window_refresh">window refresh callback</a> to redraw the
     * contents of your window when necessary during such operations.</p>
     * 
     * <p>On some platforms, certain events are sent directly to the application without going through the event queue, causing callbacks to be called outside of
     * a call to one of the event processing functions.</p>
     * 
     * <p>Event processing is not required for joystick input to work.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * </ul></div>
     *
     * @since version 1.0
     */
    public static void glfwPollEvents() {
        long __functionAddress = Functions.PollEvents;
        invokeV(__functionAddress);
    }

    // --- [ glfwWaitEvents ] ---

    /**
     * Waits until events are queued and processes them.
     * 
     * <p>This function puts the calling thread to sleep until at least one event is available in the event queue. Once one or more events are available, it
     * behaves exactly like {@link #glfwPollEvents PollEvents}, i.e. the events in the queue are processed and the function then returns immediately. Processing events will cause
     * the window and input callbacks associated with those events to be called.</p>
     * 
     * <p>Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
     * callbacks.</p>
     * 
     * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
     * those platforms. You can use the <a href="https://www.glfw.org/docs/latest/window.html#window_refresh">window refresh callback</a> to redraw the
     * contents of your window when necessary during such operations.</p>
     * 
     * <p>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</p>
     * 
     * <p>Event processing is not required for joystick input to work.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * </ul></div>
     *
     * @since version 2.5
     */
    public static void glfwWaitEvents() {
        long __functionAddress = Functions.WaitEvents;
        invokeV(__functionAddress);
    }

    // --- [ glfwWaitEventsTimeout ] ---

    /**
     * Waits with timeout until events are queued and processes them.
     * 
     * <p>This function puts the calling thread to sleep until at least one event is available in the event queue, or until the specified timeout is reached. If
     * one or more events are available, it behaves exactly like {@link #glfwPollEvents PollEvents}, i.e. the events in the queue are processed and the function then returns
     * immediately. Processing events will cause the window and input callbacks associated with those events to be called.</p>
     * 
     * <p>The timeout value must be a positive finite number.</p>
     * 
     * <p>Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
     * callbacks.</p>
     * 
     * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
     * those platforms. You can use the window refresh callback to redraw the contents of your window when necessary during such operations.</p>
     * 
     * <p>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</p>
     * 
     * <p>Event processing is not required for joystick input to work.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * </ul></div>
     *
     * @param timeout the maximum amount of time, in seconds, to wait
     *
     * @since version 3.2
     */
    public static void glfwWaitEventsTimeout(double timeout) {
        long __functionAddress = Functions.WaitEventsTimeout;
        invokeV(timeout, __functionAddress);
    }

    // --- [ glfwPostEmptyEvent ] ---

    /**
     * Posts an empty event from the current thread to the main thread event queue, causing {@link #glfwWaitEvents WaitEvents} or {@link #glfwWaitEventsTimeout WaitEventsTimeout} to return.
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @since version 3.1
     */
    public static void glfwPostEmptyEvent() {
        long __functionAddress = Functions.PostEmptyEvent;
        invokeV(__functionAddress);
    }

    // --- [ glfwGetInputMode ] ---

    /**
     * Returns the value of an input option for the specified window.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to query
     * @param mode   the input mode whose value to return. One of:<br><table><tr><td>{@link #GLFW_CURSOR CURSOR}</td><td>{@link #GLFW_STICKY_KEYS STICKY_KEYS}</td><td>{@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}</td><td>{@link #GLFW_LOCK_KEY_MODS LOCK_KEY_MODS}</td><td>{@link #GLFW_RAW_MOUSE_MOTION RAW_MOUSE_MOTION}</td></tr></table>
     *
     * @return the input mode value
     *
     * @since version 3.0
     */
    public static int glfwGetInputMode(@NativeType("GLFWwindow *") long window, int mode) {
        long __functionAddress = Functions.GetInputMode;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, mode, __functionAddress);
    }

    // --- [ glfwSetInputMode ] ---

    /**
     * Sets an input option for the specified window.
     * 
     * <p>If {@code mode} is {@link #GLFW_CURSOR CURSOR}, the value must be one of the following cursor modes:</p>
     * 
     * <ul>
     * <li>{@link #GLFW_CURSOR_NORMAL CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
     * <li>{@link #GLFW_CURSOR_HIDDEN CURSOR_HIDDEN} makes the cursor invisible when it is over the content area of the window but does not restrict the cursor from leaving.</li>
     * <li>{@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} hides and grabs the cursor, providing virtual and unlimited cursor movement. This is useful for implementing for example 3D camera
     * controls.</li>
     * <li>{@link #GLFW_CURSOR_CAPTURED CURSOR_CAPTURED} makes the cursor visible and confines it to the content area of the window.</li>
     * </ul>
     * 
     * <p>If the {@code mode} is {@link #GLFW_STICKY_KEYS STICKY_KEYS}, the value must be either {@link #GLFW_TRUE TRUE} to enable sticky keys, or {@link #GLFW_FALSE FALSE} to disable it. If sticky keys are enabled, a key
     * press will ensure that {@link #glfwGetKey GetKey} returns {@link #GLFW_PRESS PRESS} the next time it is called even if the key had been released before the call. This is useful when you
     * are only interested in whether keys have been pressed but not when or in which order.</p>
     * 
     * <p>If the {@code mode} is {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}, the value must be either {@link #GLFW_TRUE TRUE} to enable sticky mouse buttons, or {@link #GLFW_FALSE FALSE} to disable it. If sticky mouse
     * buttons are enabled, a mouse button press will ensure that {@link #glfwGetMouseButton GetMouseButton} returns {@link #GLFW_PRESS PRESS} the next time it is called even if the mouse button had
     * been released before the call. This is useful when you are only interested in whether mouse buttons have been pressed but not when or in which order.</p>
     * 
     * <p>If the {@code mode} is {@link #GLFW_LOCK_KEY_MODS LOCK_KEY_MODS}, the value must be either {@link #GLFW_TRUE TRUE} to enable lock key modifier bits, or {@link #GLFW_FALSE FALSE} to disable them. If enabled,
     * callbacks that receive modifier bits will also have the {@link #GLFW_MOD_CAPS_LOCK MOD_CAPS_LOCK} bit set when the event was generated with Caps Lock on, and the {@link #GLFW_MOD_NUM_LOCK MOD_NUM_LOCK}
     * bit when Num Lock was on.</p>
     * 
     * <p>If the mode is {@link #GLFW_RAW_MOUSE_MOTION RAW_MOUSE_MOTION}, the value must be either {@link #GLFW_TRUE TRUE} to enable raw (unscaled and unaccelerated) mouse motion when the cursor is disabled,
     * or {@link #GLFW_FALSE FALSE} to disable it. If raw motion is not supported, attempting to set this will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}. Call {@link #glfwRawMouseMotionSupported RawMouseMotionSupported} to
     * check for support.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose input mode to set
     * @param mode   the input mode to set. One of:<br><table><tr><td>{@link #GLFW_CURSOR CURSOR}</td><td>{@link #GLFW_STICKY_KEYS STICKY_KEYS}</td><td>{@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}</td></tr></table>
     * @param value  the new value of the specified input mode
     *
     * @since GFLW 3.0
     */
    public static void glfwSetInputMode(@NativeType("GLFWwindow *") long window, int mode, int value) {
        long __functionAddress = Functions.SetInputMode;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, mode, value, __functionAddress);
    }

    // --- [ glfwRawMouseMotionSupported ] ---

    /**
     * Returns whether raw mouse motion is supported.
     * 
     * <p>This function returns whether raw mouse motion is supported on the current system. This status does not change after GLFW has been initialized so you
     * only need to check this once. If you attempt to enable raw motion on a system that does not support it, {@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR} will be emitted.</p>
     * 
     * <p>Raw mouse motion is closer to the actual motion of the mouse across a surface. It is not affected by the scaling and acceleration applied to the motion
     * of the desktop cursor. That processing is suitable for a cursor while raw motion is better for controlling for example a 3D camera. Because of this,
     * raw mouse motion is only provided when the cursor is disabled.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @return {@link #GLFW_TRUE TRUE} if raw mouse motion is supported on the current machine, or {@link #GLFW_FALSE FALSE} otherwise
     *
     * @since version 3.3
     */
    @NativeType("int")
    public static boolean glfwRawMouseMotionSupported() {
        long __functionAddress = Functions.RawMouseMotionSupported;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glfwGetKeyName ] ---

    /** Unsafe version of: {@link #glfwGetKeyName GetKeyName} */
    public static long nglfwGetKeyName(int key, int scancode) {
        long __functionAddress = Functions.GetKeyName;
        return invokeP(key, scancode, __functionAddress);
    }

    /**
     * Returns the layout-specific name of the specified printable key.
     * 
     * <p>This function returns the name of the specified printable key, encoded as UTF-8. This is typically the character that key would produce without any
     * modifier keys, intended for displaying key bindings to the user. For dead keys, it is typically the diacritic it would add to a character.</p>
     * 
     * <p><b>Do not use this function</b> for text input. You will break text input for many languages even if it happens to work for yours.</p>
     * 
     * <p>If the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, the scancode is used to identify the key, otherwise the scancode is ignored. If you specify a non-printable key, or
     * {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN} and a scancode that maps to a non-printable key, this function returns {@code NULL} but does not emit an error.</p>
     * 
     * <p>This behavior allows you to always pass in the arguments in the key callback without modification.</p>
     * 
     * <p>The printable keys are:</p>
     * 
     * <ul>
     * <li>{@link #GLFW_KEY_APOSTROPHE KEY_APOSTROPHE}</li>
     * <li>{@link #GLFW_KEY_COMMA KEY_COMMA}</li>
     * <li>{@link #GLFW_KEY_MINUS KEY_MINUS}</li>
     * <li>{@link #GLFW_KEY_PERIOD KEY_PERIOD}</li>
     * <li>{@link #GLFW_KEY_SLASH KEY_SLASH}</li>
     * <li>{@link #GLFW_KEY_SEMICOLON KEY_SEMICOLON}</li>
     * <li>{@link #GLFW_KEY_EQUAL KEY_EQUAL}</li>
     * <li>{@link #GLFW_KEY_LEFT_BRACKET KEY_LEFT_BRACKET}</li>
     * <li>{@link #GLFW_KEY_RIGHT_BRACKET KEY_RIGHT_BRACKET}</li>
     * <li>{@link #GLFW_KEY_BACKSLASH KEY_BACKSLASH}</li>
     * <li>{@link #GLFW_KEY_WORLD_1 KEY_WORLD_1}</li>
     * <li>{@link #GLFW_KEY_WORLD_2 KEY_WORLD_2}</li>
     * <li>{@link #GLFW_KEY_0 KEY_0} to {@link #GLFW_KEY_9 KEY_9}</li>
     * <li>{@link #GLFW_KEY_A KEY_A} to {@link #GLFW_KEY_Z KEY_Z}</li>
     * <li>{@link #GLFW_KEY_KP_0 KEY_KP_0} to {@link #GLFW_KEY_KP_9 KEY_KP_9}</li>
     * <li>{@link #GLFW_KEY_KP_DECIMAL KEY_KP_DECIMAL}</li>
     * <li>{@link #GLFW_KEY_KP_DIVIDE KEY_KP_DIVIDE}</li>
     * <li>{@link #GLFW_KEY_KP_MULTIPLY KEY_KP_MULTIPLY}</li>
     * <li>{@link #GLFW_KEY_KP_SUBTRACT KEY_KP_SUBTRACT}</li>
     * <li>{@link #GLFW_KEY_KP_ADD KEY_KP_ADD}</li>
     * <li>{@link #GLFW_KEY_KP_EQUAL KEY_KP_EQUAL}</li>
     * </ul>
     * 
     * <p>Names for printable keys depend on keyboard layout, while names for non-printable keys are the same across layouts but depend on the application
     * language and should be localized along with other user interface text.</p>
     * 
     * <p>The contents of the returned string may change when a keyboard layout change event is received.</p>
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param key      the key to query, or {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}
     * @param scancode the scancode of the key to query
     *
     * @return the UTF-8 encoded, layout-specific name of the key, or {@code NULL}
     *
     * @since version 3.2
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetKeyName(int key, int scancode) {
        long __result = nglfwGetKeyName(key, scancode);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetKeyScancode ] ---

    /**
     * Returns the platform dependent scancode of the specified key.
     * 
     * <p>This function returns the platform dependent scancode of the specified key. This is intended for platform specific default keybindings.</p>
     * 
     * <p>If the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN} or does not exist on the keyboard this method will return {@code -1}.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param key the key to query, or {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}
     *
     * @return the platform dependent scancode for the key, or {@code -1} if an errror occurred
     *
     * @since version 3.3
     */
    public static int glfwGetKeyScancode(int key) {
        long __functionAddress = Functions.GetKeyScancode;
        return invokeI(key, __functionAddress);
    }

    // --- [ glfwGetKey ] ---

    /**
     * Returns the last state reported for the specified key to the specified window. The returned state is one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}. The action {@link #GLFW_REPEAT REPEAT} is
     * only reported to the key callback.
     * 
     * <p>If the {@link #GLFW_STICKY_KEYS STICKY_KEYS} input mode is enabled, this function returns {@link #GLFW_PRESS PRESS} the first time you call it for a key that was pressed, even if that
     * key has already been released.</p>
     * 
     * <p>The key functions deal with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
     * Unicode character callback instead.</p>
     * 
     * <p>The modifier key bit masks are not key tokens and cannot be used with this function.</p>
     * 
     * <p><b>Do not use this function</b> to implement <a href="https://www.glfw.org/docs/latest/input.html#input_char">text input</a>.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>{@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN} is not a valid key for this function.</li>
     * </ul></div>
     *
     * @param window the desired window
     * @param key    the desired keyboard key
     *
     * @return one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}
     *
     * @since version 1.0
     */
    public static int glfwGetKey(@NativeType("GLFWwindow *") long window, int key) {
        long __functionAddress = Functions.GetKey;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, key, __functionAddress);
    }

    // --- [ glfwGetMouseButton ] ---

    /**
     * Returns the last state reported for the specified mouse button to the specified window. The returned state is one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}. The
     * higher-level action {@link #GLFW_REPEAT REPEAT} is only reported to the mouse button callback.
     * 
     * <p>If the {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS} input mode is enabled, this function returns {@link #GLFW_PRESS PRESS} the first time you call it for a mouse button that was pressed, even
     * if that mouse button has already been released.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the desired window
     * @param button the desired mouse button
     *
     * @return one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}
     *
     * @since version 1.0
     */
    public static int glfwGetMouseButton(@NativeType("GLFWwindow *") long window, int button) {
        long __functionAddress = Functions.GetMouseButton;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, button, __functionAddress);
    }

    // --- [ glfwGetCursorPos ] ---

    /** Unsafe version of: {@link #glfwGetCursorPos GetCursorPos} */
    public static void nglfwGetCursorPos(long window, long xpos, long ypos) {
        long __functionAddress = Functions.GetCursorPos;
        if (CHECKS) {
            check(window);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /**
     * Returns the position of the cursor, in screen coordinates, relative to the upper-left corner of the content area of the specified window.
     * 
     * <p>If the cursor is disabled (with {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED}) then the cursor position is unbounded and limited only by the minimum and maximum values of a
     * <b>double</b>.</p>
     * 
     * <p>The coordinates can be converted to their integer equivalents with the {@link Math#floor} function. Casting directly to an integer type works for positive
     * coordinates, but fails for negative ones.</p>
     * 
     * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the desired window
     * @param xpos   where to store the cursor x-coordinate, relative to the left edge of the content area, or {@code NULL}
     * @param ypos   where to store the cursor y-coordinate, relative to the to top edge of the content area, or {@code NULL}.
     *
     * @since version 1.0
     */
    public static void glfwGetCursorPos(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("double *") DoubleBuffer xpos, @Nullable @NativeType("double *") DoubleBuffer ypos) {
        if (CHECKS) {
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        nglfwGetCursorPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
    }

    // --- [ glfwSetCursorPos ] ---

    /**
     * Sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the content area of the specified window. The window must
     * have input focus. If the window does not have input focus when this function is called, it fails silently.
     * 
     * <p><b>Do not use this function</b> to implement things like camera controls. GLFW already provides the {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} cursor mode that hides the cursor,
     * transparently re-centers it and provides unconstrained cursor motion. See {@link #glfwSetInputMode SetInputMode} for more information.</p>
     * 
     * <p>If the cursor mode is {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} then the cursor position is unconstrained and limited only by the minimum and maximum values of <b>double</b>.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: This function will only work when the cursor mode is {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED}, otherwise it will emit {@link #GLFW_FEATURE_UNAVAILABLE FEATURE_UNAVAILABLE}.</li>
     * </ul>
     *
     * @param window the desired window
     * @param xpos   the desired x-coordinate, relative to the left edge of the content area
     * @param ypos   the desired y-coordinate, relative to the top edge of the content area
     *
     * @since version 1.0
     */
    public static void glfwSetCursorPos(@NativeType("GLFWwindow *") long window, double xpos, double ypos) {
        long __functionAddress = Functions.SetCursorPos;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, xpos, ypos, __functionAddress);
    }

    // --- [ glfwCreateCursor ] ---

    /** Unsafe version of: {@link #glfwCreateCursor CreateCursor} */
    public static long nglfwCreateCursor(long image, int xhot, int yhot) {
        long __functionAddress = Functions.CreateCursor;
        if (CHECKS) {
            GLFWImage.validate(image);
        }
        return invokePP(image, xhot, yhot, __functionAddress);
    }

    /**
     * Creates a new custom cursor image that can be set for a window with {@link #glfwSetCursor SetCursor}. The cursor can be destroyed with {@link #glfwDestroyCursor DestroyCursor}. Any remaining
     * cursors are destroyed by {@link #glfwTerminate Terminate}.
     * 
     * <p>The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel with the red channel first. They are arranged canonically as
     * packed sequential rows, starting from the top-left corner.</p>
     * 
     * <p>The cursor hotspot is specified in pixels, relative to the upper-left corner of the cursor image. Like all other coordinate systems in GLFW, the X-axis
     * points to the right and the Y-axis points down.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The specified image data is copied before this function returns.</li>
     * </ul></div>
     *
     * @param image the desired cursor image
     * @param xhot  the desired x-coordinate, in pixels, of the cursor hotspot
     * @param yhot  the desired y-coordinate, in pixels, of the cursor hotspot
     *
     * @return the handle of the created cursor, or {@code NULL} if an error occurred
     *
     * @since version 3.1
     */
    @NativeType("GLFWcursor *")
    public static long glfwCreateCursor(@NativeType("GLFWimage const *") GLFWImage image, int xhot, int yhot) {
        return nglfwCreateCursor(image.address(), xhot, yhot);
    }

    // --- [ glfwCreateStandardCursor ] ---

    /**
     * Returns a cursor with a standard shape, that can be set for a window with {@link #glfwSetCursor SetCursor}.
     * 
     * <p>The images for these cursors come from the system cursor theme and their exact appearance will vary between platforms.</p>
     * 
     * <p>Most of these shapes are guaranteed to exist on every supported platform but a few may not be present. See the table below for details.</p>
     * 
     * <table class=striped>
     * <tr><th>Cursor shape</th><th>Windows</th><th>macOS</th><th>X11</th><th>Wayland</th></tr>
     * <tr><td>{@link #GLFW_ARROW_CURSOR ARROW_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_IBEAM_CURSOR IBEAM_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_CROSSHAIR_CURSOR CROSSHAIR_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_POINTING_HAND_CURSOR POINTING_HAND_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_RESIZE_EW_CURSOR RESIZE_EW_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_RESIZE_NS_CURSOR RESIZE_NS_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_RESIZE_NWSE_CURSOR RESIZE_NWSE_CURSOR}</td><td>Yes</td><td>Yes<sup>1</sup></td><td>Maybe<sup>2</sup></td><td>Maybe<sup>2</sup></td></tr>
     * <tr><td>{@link #GLFW_RESIZE_NESW_CURSOR RESIZE_NESW_CURSOR}</td><td>Yes</td><td>Yes<sup>1</sup></td><td>Maybe<sup>2</sup></td><td>Maybe<sup>2</sup></td></tr>
     * <tr><td>{@link #GLFW_RESIZE_ALL_CURSOR RESIZE_ALL_CURSOR}</td><td>Yes</td><td>Yes</td><td>Yes</td><td>Yes</td></tr>
     * <tr><td>{@link #GLFW_NOT_ALLOWED_CURSOR NOT_ALLOWED_CURSOR}</td><td>Yes</td><td>Yes</td><td>Maybe<sup>2</sup></td><td>Maybe<sup>2</sup></td></tr>
     * </table>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ol>
     * <li>This uses a private system API and may fail in the future.</li>
     * <li>This uses a newer standard that not all cursor themes support.</li>
     * </ol></div>
     * 
     * <p>If the requested shape is not available, this function emits a {@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} error and returns {@code NULL}.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param shape one of the standard shapes. One of:<br><table><tr><td>{@link #GLFW_ARROW_CURSOR ARROW_CURSOR}</td><td>{@link #GLFW_IBEAM_CURSOR IBEAM_CURSOR}</td><td>{@link #GLFW_CROSSHAIR_CURSOR CROSSHAIR_CURSOR}</td><td>{@link #GLFW_POINTING_HAND_CURSOR POINTING_HAND_CURSOR}</td><td>{@link #GLFW_RESIZE_EW_CURSOR RESIZE_EW_CURSOR}</td></tr><tr><td>{@link #GLFW_RESIZE_NS_CURSOR RESIZE_NS_CURSOR}</td><td>{@link #GLFW_RESIZE_NWSE_CURSOR RESIZE_NWSE_CURSOR}</td><td>{@link #GLFW_RESIZE_NESW_CURSOR RESIZE_NESW_CURSOR}</td><td>{@link #GLFW_RESIZE_ALL_CURSOR RESIZE_ALL_CURSOR}</td><td>{@link #GLFW_NOT_ALLOWED_CURSOR NOT_ALLOWED_CURSOR}</td></tr></table>
     *
     * @return a new cursor ready to use or {@code NULL} if an error occurred. Possible errors include {@link #GLFW_NOT_INITIALIZED NOT_INITIALIZED}, {@link #GLFW_INVALID_ENUM INVALID_ENUM}, {@link #GLFW_CURSOR_UNAVAILABLE CURSOR_UNAVAILABLE} and
     *         {@link #GLFW_PLATFORM_ERROR PLATFORM_ERROR}.
     *
     * @since version 3.1
     */
    @NativeType("GLFWcursor *")
    public static long glfwCreateStandardCursor(int shape) {
        long __functionAddress = Functions.CreateStandardCursor;
        return invokeP(shape, __functionAddress);
    }

    // --- [ glfwDestroyCursor ] ---

    /**
     * Destroys a cursor previously created with {@link #glfwCreateCursor CreateCursor}. Any remaining cursors will be destroyed by {@link #glfwTerminate Terminate}.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>This function must not be called from a callback.</li>
     * </ul></div>
     *
     * @param cursor the cursor object to destroy
     *
     * @since version 3.1
     */
    public static void glfwDestroyCursor(@NativeType("GLFWcursor *") long cursor) {
        long __functionAddress = Functions.DestroyCursor;
        if (CHECKS) {
            check(cursor);
        }
        invokePV(cursor, __functionAddress);
    }

    // --- [ glfwSetCursor ] ---

    /**
     * Sets the cursor image to be used when the cursor is over the content area of the specified window. The set cursor will only be visible when the
     * <a href="https://www.glfw.org/docs/latest/input.html#cursor_mode">cursor mode</a> of the window is {@link #GLFW_CURSOR_NORMAL CURSOR_NORMAL}.
     * 
     * <p>On some platforms, the set cursor may not be visible unless the window also has input focus.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window to set the system cursor for
     * @param cursor the cursor to set, or {@code NULL} to switch back to the default arrow cursor
     *
     * @since version 3.1
     */
    public static void glfwSetCursor(@NativeType("GLFWwindow *") long window, @NativeType("GLFWcursor *") long cursor) {
        long __functionAddress = Functions.SetCursor;
        if (CHECKS) {
            check(window);
        }
        invokePPV(window, cursor, __functionAddress);
    }

    // --- [ glfwSetKeyCallback ] ---

    /** Unsafe version of: {@link #glfwSetKeyCallback SetKeyCallback} */
    public static long nglfwSetKeyCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetKeyCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the key callback of the specified window, which is called when a key is pressed, repeated or released.
     * 
     * <p>The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. If you want
     * to input text, use {@link #glfwSetCharCallback SetCharCallback} instead.</p>
     * 
     * <p>When a window loses input focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated
     * events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus callback has been
     * called.</p>
     * 
     * <p>The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
     * a GLFW key token. Such keys have {@code key} set to {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, their state is not saved and so it cannot be queried with {@link #glfwGetKey GetKey}.</p>
     * 
     * <p>Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 1.0
     */
    @Nullable
    @NativeType("GLFWkeyfun")
    public static GLFWKeyCallback glfwSetKeyCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWkeyfun") GLFWKeyCallbackI cbfun) {
        return GLFWKeyCallback.createSafe(nglfwSetKeyCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCharCallback ] ---

    /** Unsafe version of: {@link #glfwSetCharCallback SetCharCallback} */
    public static long nglfwSetCharCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCharCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the character callback of the specified window, which is called when a Unicode character is input.
     * 
     * <p>The character callback is intended for Unicode text input. As it deals with characters, it is keyboard layout dependent, whereas {@link #glfwSetKeyCallback SetKeyCallback} is
     * not. Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key
     * was pressed or released, see the key callback instead.</p>
     * 
     * <p>The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text
     * input on that platform, for example a Super (Command) key on macOS or Alt key on Windows.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 2.4
     */
    @Nullable
    @NativeType("GLFWcharfun")
    public static GLFWCharCallback glfwSetCharCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWcharfun") GLFWCharCallbackI cbfun) {
        return GLFWCharCallback.createSafe(nglfwSetCharCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCharModsCallback ] ---

    /** Unsafe version of: {@link #glfwSetCharModsCallback SetCharModsCallback} */
    public static long nglfwSetCharModsCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCharModsCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys
     * are used.
     * 
     * <p>The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
     * {@link #glfwSetCharCallback SetCharCallback}. Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
     * Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
     * pressed or released, see {@link #glfwSetKeyCallback SetKeyCallback} instead.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     * 
     * <p>Deprecated: scheduled for removal in version 4.0.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.1
     */
    @Nullable
    @NativeType("GLFWcharmodsfun")
    public static GLFWCharModsCallback glfwSetCharModsCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWcharmodsfun") GLFWCharModsCallbackI cbfun) {
        return GLFWCharModsCallback.createSafe(nglfwSetCharModsCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetMouseButtonCallback ] ---

    /** Unsafe version of: {@link #glfwSetMouseButtonCallback SetMouseButtonCallback} */
    public static long nglfwSetMouseButtonCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetMouseButtonCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.
     * 
     * <p>When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
     * user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus
     * callback has been called.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 1.0
     */
    @Nullable
    @NativeType("GLFWmousebuttonfun")
    public static GLFWMouseButtonCallback glfwSetMouseButtonCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWmousebuttonfun") GLFWMouseButtonCallbackI cbfun) {
        return GLFWMouseButtonCallback.createSafe(nglfwSetMouseButtonCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCursorPosCallback ] ---

    /** Unsafe version of: {@link #glfwSetCursorPosCallback SetCursorPosCallback} */
    public static long nglfwSetCursorPosCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCursorPosCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
     * screen coordinates, relative to the upper-left corner of the content area of the window.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 1.0
     */
    @Nullable
    @NativeType("GLFWcursorposfun")
    public static GLFWCursorPosCallback glfwSetCursorPosCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWcursorposfun") GLFWCursorPosCallbackI cbfun) {
        return GLFWCursorPosCallback.createSafe(nglfwSetCursorPosCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetCursorEnterCallback ] ---

    /** Unsafe version of: {@link #glfwSetCursorEnterCallback SetCursorEnterCallback} */
    public static long nglfwSetCursorEnterCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetCursorEnterCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the content area of the window.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("GLFWcursorenterfun")
    public static GLFWCursorEnterCallback glfwSetCursorEnterCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWcursorenterfun") GLFWCursorEnterCallbackI cbfun) {
        return GLFWCursorEnterCallback.createSafe(nglfwSetCursorEnterCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetScrollCallback ] ---

    /** Unsafe version of: {@link #glfwSetScrollCallback SetScrollCallback} */
    public static long nglfwSetScrollCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetScrollCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the scroll callback of the specified window, which is called when a scrolling device is used.
     * 
     * <p>The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 2.1
     */
    @Nullable
    @NativeType("GLFWscrollfun")
    public static GLFWScrollCallback glfwSetScrollCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWscrollfun") GLFWScrollCallbackI cbfun) {
        return GLFWScrollCallback.createSafe(nglfwSetScrollCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwSetDropCallback ] ---

    /** Unsafe version of: {@link #glfwSetDropCallback SetDropCallback} */
    public static long nglfwSetDropCallback(long window, long cbfun) {
        long __functionAddress = Functions.SetDropCallback;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, cbfun, __functionAddress);
    }

    /**
     * Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.
     * 
     * <p>Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
     * returned. If you wish to use them after the callback returns, you need to make a deep copy.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li><b>Wayland</b>: File drop is currently unimplemented.</li>
     * </ul>
     *
     * @param window the window whose callback to set
     * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set
     *
     * @since version 3.1
     */
    @Nullable
    @NativeType("GLFWdropfun")
    public static GLFWDropCallback glfwSetDropCallback(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("GLFWdropfun") GLFWDropCallbackI cbfun) {
        return GLFWDropCallback.createSafe(nglfwSetDropCallback(window, memAddressSafe(cbfun)));
    }

    // --- [ glfwJoystickPresent ] ---

    /**
     * Returns whether the specified joystick is present.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid joystick to query
     *
     * @return {@link #GLFW_TRUE TRUE} if the joystick is present, or {@link #GLFW_FALSE FALSE} otherwise
     *
     * @since version 3.0
     */
    @NativeType("int")
    public static boolean glfwJoystickPresent(int jid) {
        long __functionAddress = Functions.JoystickPresent;
        return invokeI(jid, __functionAddress) != 0;
    }

    // --- [ glfwGetJoystickAxes ] ---

    /**
     * Unsafe version of: {@link #glfwGetJoystickAxes GetJoystickAxes}
     *
     * @param count where to store the number of axis values in the returned array. This is set to zero if the joystick is not present or an error occurred.
     */
    public static long nglfwGetJoystickAxes(int jid, long count) {
        long __functionAddress = Functions.GetJoystickAxes;
        return invokePP(jid, count, __functionAddress);
    }

    /**
     * Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.
     * 
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     * 
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return an array of axis values, or {@code NULL} if the joystick is not present
     *
     * @since version 2.2
     */
    @Nullable
    @NativeType("float const *")
    public static FloatBuffer glfwGetJoystickAxes(int jid) {
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

    /**
     * Unsafe version of: {@link #glfwGetJoystickButtons GetJoystickButtons}
     *
     * @param count where to store the number of button states in the returned array. This is set to zero if the joystick is not present or an error occurred.
     */
    public static long nglfwGetJoystickButtons(int jid, long count) {
        long __functionAddress = Functions.GetJoystickButtons;
        return invokePP(jid, count, __functionAddress);
    }

    /**
     * Returns the state of all buttons of the specified joystick. Each element in the array is either {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}.
     * 
     * <p>For backward compatibility with earlier versions that did not have {@link #glfwGetJoystickHats GetJoystickHats}, the button array also includes all hats, each represented as four
     * buttons. The hats are in the same order as returned by {@link #glfwGetJoystickHats GetJoystickHats} and are in the order up, right, down and left. To disable these extra
     * buttons, set the {@link #GLFW_JOYSTICK_HAT_BUTTONS JOYSTICK_HAT_BUTTONS} init hint before initialization.</p>
     * 
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     * 
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return an array of button states, or {@code NULL} if the joystick is not present
     *
     * @since version 2.2
     */
    @Nullable
    @NativeType("unsigned char const *")
    public static ByteBuffer glfwGetJoystickButtons(int jid) {
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

    /**
     * Unsafe version of: {@link #glfwGetJoystickHats GetJoystickHats}
     *
     * @param count where to store the number of hat states in the returned array. This is set to zero if the joystick is not present or an error occurred.
     */
    public static long nglfwGetJoystickHats(int jid, long count) {
        long __functionAddress = Functions.GetJoystickHats;
        return invokePP(jid, count, __functionAddress);
    }

    /**
     * Returns the state of all hats of the specified joystick.
     * 
     * <p>This function returns the state of all hats of the specified joystick. Each element in the array is one of the following values:</p>
     * 
     * <pre><code>
     * Name                | Value
     * ------------------- | ------------------------------
     * GLFW_HAT_CENTERED   | 0
     * GLFW_HAT_UP         | 1
     * GLFW_HAT_RIGHT      | 2
     * GLFW_HAT_DOWN       | 4
     * GLFW_HAT_LEFT       | 8
     * GLFW_HAT_RIGHT_UP   | GLFW_HAT_RIGHT | GLFW_HAT_UP
     * GLFW_HAT_RIGHT_DOWN | GLFW_HAT_RIGHT | GLFW_HAT_DOWN
     * GLFW_HAT_LEFT_UP    | GLFW_HAT_LEFT  | GLFW_HAT_UP
     * GLFW_HAT_LEFT_DOWN  | GLFW_HAT_LEFT  | GLFW_HAT_DOWN</code></pre>
     * 
     * <p>The diagonal directions are bitwise combinations of the primary (up, right, down and left) directions and you can test for these individually by ANDing
     * it with the corresponding direction.</p>
     * 
     * <pre><code>
     * if (hats[2] &amp; GLFW_HAT_RIGHT)
     * {
     *     // State of hat 2 could be right-up, right or right-down
     * }</code></pre>
     * 
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</li>
     * </ul></div>
     *
     * @param jid the joystick to query
     *
     * @return an array of hat states, or {@code NULL} if the joystick is not present or an error occurred
     *
     * @since version 3.3
     */
    @Nullable
    @NativeType("unsigned char const *")
    public static ByteBuffer glfwGetJoystickHats(int jid) {
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

    /** Unsafe version of: {@link #glfwGetJoystickName GetJoystickName} */
    public static long nglfwGetJoystickName(int jid) {
        long __functionAddress = Functions.GetJoystickName;
        return invokeP(jid, __functionAddress);
    }

    /**
     * Returns the name, encoded as UTF-8, of the specified joystick.
     * 
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
     * function is called again for that joystick or the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return the UTF-8 encoded name of the joystick, or {@code NULL} if the joystick is not present
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetJoystickName(int jid) {
        long __result = nglfwGetJoystickName(jid);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetJoystickGUID ] ---

    /** Unsafe version of: {@link #glfwGetJoystickGUID GetJoystickGUID} */
    public static long nglfwGetJoystickGUID(int jid) {
        long __functionAddress = Functions.GetJoystickGUID;
        return invokeP(jid, __functionAddress);
    }

    /**
     * Returns the SDL compatible GUID, as a UTF-8 encoded hexadecimal string, of the specified joystick.
     * 
     * <p>The GUID is what connects a joystick to a gamepad mapping. A connected joystick will always have a GUID even if there is no gamepad mapping assigned to
     * it.</p>
     * 
     * <p>The GUID uses the format introduced in SDL 2.0.5. This GUID tries to uniquely identify the make and model of a joystick but does not identify a
     * specific unit, e.g. all wired Xbox 360 controllers will have the same GUID on that platform. The GUID for a unit may vary between platforms depending
     * on what hardware information the platform specific APIs provide.</p>
     * 
     * <p>If the specified joystick is not present this function will return {@code NULL} but will not generate an error. This can be used instead of first calling
     * {@link #glfwJoystickPresent JoystickPresent}.</p>
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected or the
     * library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return the UTF-8 encoded GUID of the joystick, or {@code NULL} if the joystick is not present or an error occurred
     *
     * @since version 3.3
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetJoystickGUID(int jid) {
        long __result = nglfwGetJoystickGUID(jid);
        return memUTF8Safe(__result);
    }

    // --- [ glfwSetJoystickUserPointer ] ---

    /**
     * Sets the user pointer of the specified joystick.
     * 
     * <p>This function sets the user-defined pointer of the specified joystick. The current value is retained until the joystick is disconnected. The initial
     * value is {@code NULL}.</p>
     * 
     * <p>This function may be called from the joystick callback, even for a joystick that is being disconnected.</p>
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param jid     the joystick whose pointer to set
     * @param pointer the new value
     *
     * @since version 3.3
     */
    public static void glfwSetJoystickUserPointer(int jid, @NativeType("void *") long pointer) {
        long __functionAddress = Functions.SetJoystickUserPointer;
        if (CHECKS) {
            check(pointer);
        }
        invokePV(jid, pointer, __functionAddress);
    }

    // --- [ glfwGetJoystickUserPointer ] ---

    /**
     * Returns the user pointer of the specified joystick.
     * 
     * <p>This function returns the current value of the user-defined pointer of the specified joystick. The initial value is {@code NULL}.</p>
     * 
     * <p>This function may be called from the joystick callback, even for a joystick that is being disconnected.</p>
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param jid the joystick whose pointer to set
     *
     * @since version 3.3
     */
    @NativeType("void *")
    public static long glfwGetJoystickUserPointer(int jid) {
        long __functionAddress = Functions.GetJoystickUserPointer;
        return invokeP(jid, __functionAddress);
    }

    // --- [ glfwJoystickIsGamepad ] ---

    /**
     * Returns whether the specified joystick is both present and has a gamepad mapping.
     * 
     * <p>If the specified joystick is present but does not have a gamepad mapping this function will return {@code false} but will not generate an error. Call
     * {@link #glfwJoystickPresent JoystickPresent} to check if a joystick is present regardless of whether it has a mapping.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick id to query
     *
     * @return {@code true} if a joystick is both present and has a gamepad mapping or {@code false} otherwise
     *
     * @since version 3.3
     */
    @NativeType("int")
    public static boolean glfwJoystickIsGamepad(int jid) {
        long __functionAddress = Functions.JoystickIsGamepad;
        return invokeI(jid, __functionAddress) != 0;
    }

    // --- [ glfwSetJoystickCallback ] ---

    /** Unsafe version of: {@link #glfwSetJoystickCallback SetJoystickCallback} */
    public static long nglfwSetJoystickCallback(long cbfun) {
        long __functionAddress = Functions.SetJoystickCallback;
        return invokePP(cbfun, __functionAddress);
    }

    /**
     * Sets the joystick configuration callback, or removes the currently set callback. This is called when a joystick is connected to or disconnected from
     * the system.
     * 
     * <p>For joystick connection and disconnection events to be delivered on all platforms, you need to call one of the event processing functions. Joystick
     * disconnection may also be detected and the callback called by joystick functions. The function will then return whatever it returns if the joystick is
     * not present.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
     *
     * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
     *
     * @since version 3.2
     */
    @Nullable
    @NativeType("GLFWjoystickfun")
    public static GLFWJoystickCallback glfwSetJoystickCallback(@Nullable @NativeType("GLFWjoystickfun") GLFWJoystickCallbackI cbfun) {
        return GLFWJoystickCallback.createSafe(nglfwSetJoystickCallback(memAddressSafe(cbfun)));
    }

    // --- [ glfwUpdateGamepadMappings ] ---

    /** Unsafe version of: {@link #glfwUpdateGamepadMappings UpdateGamepadMappings} */
    public static int nglfwUpdateGamepadMappings(long string) {
        long __functionAddress = Functions.UpdateGamepadMappings;
        return invokePI(string, __functionAddress);
    }

    /**
     * Adds the specified SDL_GameControllerDB gamepad mappings.
     * 
     * <p>This function parses the specified ASCII encoded string and updates the internal list with any gamepad mappings it finds. This string may contain either
     * a single gamepad mapping or many mappings separated by newlines. The parser supports the full format of the {@code gamecontrollerdb.txt} source file
     * including empty lines and comments.</p>
     * 
     * <p>See <a href="https://www.glfw.org/docs/latest/input.html#gamepad_mapping">gamepad_mapping</a> for a description of the format.</p>
     * 
     * <p>If there is already a gamepad mapping for a given GUID in the internal list, it will be replaced by the one passed to this function. If the library is
     * terminated and re-initialized the internal list will revert to the built-in default.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param string the string containing the gamepad mappings
     *
     * @return {@code true}, or {@code false} if an error occurred
     *
     * @since version 3.3
     */
    @NativeType("int")
    public static boolean glfwUpdateGamepadMappings(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nglfwUpdateGamepadMappings(memAddress(string)) != 0;
    }

    // --- [ glfwGetGamepadName ] ---

    /** Unsafe version of: {@link #glfwGetGamepadName GetGamepadName} */
    public static long nglfwGetGamepadName(int jid) {
        long __functionAddress = Functions.GetGamepadName;
        return invokeP(jid, __functionAddress);
    }

    /**
     * Returns the human-readable name of the gamepad from the gamepad mapping assigned to the specified joystick.
     * 
     * <p>If the specified joystick is not present or does not have a gamepad mapping this function will return {@code NULL} but will not generate an error. Call
     * {@link #glfwJoystickIsGamepad JoystickIsGamepad} to check if a joystick is present regardless of whether it has a mapping.</p>
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, the
     * gamepad mappings are updated or the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid the joystick to query
     *
     * @return the UTF-8 encoded name of the gamepad, or {@code NULL} if the joystick is not present, does not have a mapping or an error occurred
     *
     * @since version 3.3
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetGamepadName(int jid) {
        long __result = nglfwGetGamepadName(jid);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetGamepadState ] ---

    /** Unsafe version of: {@link #glfwGetGamepadState GetGamepadState} */
    public static int nglfwGetGamepadState(int jid, long state) {
        long __functionAddress = Functions.GetGamepadState;
        return invokePI(jid, state, __functionAddress);
    }

    /**
     * Retrieves the state of the specified joystick remapped to an Xbox-like gamepad.
     * 
     * <p>If the specified joystick is not present or does not have a gamepad mapping this function will return {@link #GLFW_FALSE FALSE} but will not generate an error. Call
     * {@link #glfwJoystickPresent JoystickPresent} to check whether it is present regardless of whether it has a mapping.</p>
     * 
     * <p>The Guide button may not be available for input as it is often hooked by the system or the Steam client.</p>
     * 
     * <p>Not all devices have all the buttons or axes provided by {@link GLFWGamepadState}. Unavailable buttons and axes will always report {@link #GLFW_RELEASE RELEASE} and 0.0
     * respectively.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param jid   the joystick to query
     * @param state the gamepad input state of the joystick
     *
     * @return {@code true} if successful, or {@code false} if no joystick is connected, it has no gamepad mapping or an error occurred
     *
     * @since version 3.3
     */
    @NativeType("int")
    public static boolean glfwGetGamepadState(int jid, @NativeType("GLFWgamepadstate *") GLFWGamepadState state) {
        return nglfwGetGamepadState(jid, state.address()) != 0;
    }

    // --- [ glfwSetClipboardString ] ---

    /** Unsafe version of: {@link #glfwSetClipboardString SetClipboardString} */
    public static void nglfwSetClipboardString(long window, long string) {
        long __functionAddress = Functions.SetClipboardString;
        invokePPV(window, string, __functionAddress);
    }

    /**
     * Sets the system clipboard to the specified, UTF-8 encoded string.
     * 
     * <p>The specified string is copied before this function returns.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * </ul>
     *
     * @param window deprecated, any valid window or {@code NULL}.
     * @param string a UTF-8 encoded string
     *
     * @since version 3.0
     */
    public static void glfwSetClipboardString(@NativeType("GLFWwindow *") long window, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        nglfwSetClipboardString(window, memAddress(string));
    }

    /**
     * Sets the system clipboard to the specified, UTF-8 encoded string.
     * 
     * <p>The specified string is copied before this function returns.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * </ul>
     *
     * @param window deprecated, any valid window or {@code NULL}.
     * @param string a UTF-8 encoded string
     *
     * @since version 3.0
     */
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

    /** Unsafe version of: {@link #glfwGetClipboardString GetClipboardString} */
    public static long nglfwGetClipboardString(long window) {
        long __functionAddress = Functions.GetClipboardString;
        return invokePP(window, __functionAddress);
    }

    /**
     * Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string. If the clipboard is empty or if its contents
     * cannot be converted, {@code NULL} is returned and a {@link #GLFW_FORMAT_UNAVAILABLE FORMAT_UNAVAILABLE} error is generated.
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetClipboardString GetClipboardString} or
     * {@link #glfwSetClipboardString SetClipboardString}, or until the library is terminated.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function must only be called from the main thread.</li>
     * <li>The returned string is allocated and freed by GLFW.  You should not free it yourself.</li>
     * <li>The returned string is valid only until the next call to {@link #glfwGetClipboardString GetClipboardString} or {@link #glfwSetClipboardString SetClipboardString}.</li>
     * </ul></div>
     *
     * @param window deprecated, any valid window or {@code NULL}.
     *
     * @return the contents of the clipboard as a UTF-8 encoded string, or {@code NULL} if an error occurred
     *
     * @since version 3.0
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetClipboardString(@NativeType("GLFWwindow *") long window) {
        long __result = nglfwGetClipboardString(window);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetTime ] ---

    /**
     * Returns the value of the GLFW timer. Unless the timer has been set using {@link #glfwSetTime SetTime}, the timer measures time elapsed since GLFW was initialized.
     * 
     * <p>The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution monotonic
     * time source on each operating system.</p>
     * 
     * <p>This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
     * with calls to {@link #glfwSetTime SetTime}.</p>
     *
     * @return the current value, in seconds, or zero if an error occurred
     *
     * @since version 1.0
     */
    public static double glfwGetTime() {
        long __functionAddress = Functions.GetTime;
        return invokeD(__functionAddress);
    }

    // --- [ glfwSetTime ] ---

    /**
     * Sets the value of the GLFW timer. It then continues to count up from that value. The value must be a positive finite number less than or equal to
     * 18446744073.0, which is approximately 584.5 years.
     * 
     * <p>The upper limit of the timer is calculated as <code>floor((2<sup>64</sup> - 1) / 10<sup>9</sup>)</code> and is due to implementations storing nanoseconds
     * in 64 bits. The limit may be increased in the future.</p>
     * 
     * <p>This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
     * with calls to {@link #glfwGetTime GetTime}.</p>
     *
     * @param time the new value, in seconds
     *
     * @since version 2.2
     */
    public static void glfwSetTime(double time) {
        long __functionAddress = Functions.SetTime;
        invokeV(time, __functionAddress);
    }

    // --- [ glfwGetTimerValue ] ---

    /**
     * Returns the current value of the raw timer.
     * 
     * <p>This function returns the current value of the raw timer, measured in {@code 1 / frequency} seconds. To get the frequency, call {@link #glfwGetTimerFrequency GetTimerFrequency}.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @return the value of the timer, or zero if an error occurred
     *
     * @since version 3.2
     */
    @NativeType("uint64_t")
    public static long glfwGetTimerValue() {
        long __functionAddress = Functions.GetTimerValue;
        return invokeJ(__functionAddress);
    }

    // --- [ glfwGetTimerFrequency ] ---

    /**
     * Returns the frequency, in Hz, of the raw timer.
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @return the frequency of the timer, in Hz, or zero if an error occurred
     *
     * @since version 3.2
     */
    @NativeType("uint64_t")
    public static long glfwGetTimerFrequency() {
        long __functionAddress = Functions.GetTimerFrequency;
        return invokeJ(__functionAddress);
    }

    // --- [ glfwMakeContextCurrent ] ---

    /**
     * Makes the OpenGL or OpenGL ES context of the specified window current on the calling thread. A context must only be made current on a single thread at
     * a time and each thread can have only a single current context at a time.
     * 
     * <p>When moving a context between threads, you must make it non-current on the old thread before making it current on the new one.</p>
     * 
     * <p>By default, making a context non-current implicitly forces a pipeline flush. On machines that support
     * <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_context_flush_control.txt">GL_KHR_context_flush_control</a>, you can control whether
     * a context performs this flush by setting the {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}
     * <a href="https://www.glfw.org/docs/latest/window.html#window_hints_ctx">window hint</a>.</p>
     * 
     * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param window the window whose context to make current, or {@code NULL} to detach the current context
     *
     * @since version 3.0
     */
    public static void glfwMakeContextCurrent(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.MakeContextCurrent;
        invokePV(window, __functionAddress);
    }

    // --- [ glfwGetCurrentContext ] ---

    /**
     * Returns the window whose OpenGL or OpenGL ES context is current on the calling thread.
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @return the window whose context is current, or {@code NULL} if no window's context is current
     *
     * @since version 3.0
     */
    @NativeType("GLFWwindow *")
    public static long glfwGetCurrentContext() {
        long __functionAddress = Functions.GetCurrentContext;
        return invokeP(__functionAddress);
    }

    // --- [ glfwSwapBuffers ] ---

    /**
     * Swaps the front and back buffers of the specified window when rendering with OpenGL or OpenGL ES. If the swap interval is greater than zero, the GPU
     * driver waits the specified number of screen updates before swapping the buffers.
     * 
     * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
     * 
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code vkQueuePresentKHR} instead.</p>
     * 
     * <p><b>EGL</b>: The context of the specified window must be current on the calling thread.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param window the window whose buffers to swap
     *
     * @since version 1.0
     */
    public static void glfwSwapBuffers(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.SwapBuffers;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ glfwSwapInterval ] ---

    /**
     * Sets the swap interval for the current OpenGL or OpenGL ES context, i.e. the number of screen updates to wait from the time {@link #glfwSwapBuffers SwapBuffers} was called
     * before swapping the buffers and returning. This is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i> or just
     * <i>vsync</i>.
     * 
     * <p>A context that supports either of the
     * <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> and
     * <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extensions also accepts
     * <b>negative</b> swap intervals, which allows the driver to swap immediately even if a frame arrives a little bit late. You can check for these
     * extensions with {@link #glfwExtensionSupported ExtensionSupported}. For more information about swap tearing, see the extension specifications.</p>
     * 
     * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     * 
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, see the present mode of your swapchain instead.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>This function may be called from any thread.</li>
     * <li>This function is not called during window creation, leaving the swap interval set to whatever is the default for that API. This is done because
     * some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.</li>
     * <li>Some GPU drivers do not honor the requested swap interval, either because of a user setting that overrides the application's request or due to bugs
     * in the driver.</li>
     * </ul></div>
     *
     * @param interval the minimum number of screen updates to wait for until the buffers are swapped by {@link #glfwSwapBuffers SwapBuffers}
     *
     * @since version 1.0
     */
    public static void glfwSwapInterval(int interval) {
        long __functionAddress = Functions.SwapInterval;
        invokeV(interval, __functionAddress);
    }

    // --- [ glfwExtensionSupported ] ---

    /** Unsafe version of: {@link #glfwExtensionSupported ExtensionSupported} */
    public static int nglfwExtensionSupported(long extension) {
        long __functionAddress = Functions.ExtensionSupported;
        return invokePI(extension, __functionAddress);
    }

    /**
     * Returns whether the specified <a href="https://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
     * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
     * 
     * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     * 
     * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
     * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
     * 
     * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@code glfwGetRequiredInstanceExtensions},
     * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param extension the ASCII encoded name of the extension
     *
     * @return {@link #GLFW_TRUE TRUE} if the extension is available, or {@link #GLFW_FALSE FALSE} otherwise
     *
     * @since version 1.0
     */
    @NativeType("int")
    public static boolean glfwExtensionSupported(@NativeType("char const *") ByteBuffer extension) {
        if (CHECKS) {
            checkNT1(extension);
        }
        return nglfwExtensionSupported(memAddress(extension)) != 0;
    }

    /**
     * Returns whether the specified <a href="https://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
     * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
     * 
     * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     * 
     * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
     * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
     * 
     * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@code glfwGetRequiredInstanceExtensions},
     * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param extension the ASCII encoded name of the extension
     *
     * @return {@link #GLFW_TRUE TRUE} if the extension is available, or {@link #GLFW_FALSE FALSE} otherwise
     *
     * @since version 1.0
     */
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

    /** Unsafe version of: {@link #glfwGetProcAddress GetProcAddress} */
    public static long nglfwGetProcAddress(long procname) {
        long __functionAddress = Functions.GetProcAddress;
        return invokePP(procname, __functionAddress);
    }

    /**
     * Returns the address of the specified OpenGL or OpenGL ES <a href="https://www.glfw.org/docs/latest/context.html#context_glext">core or extension function</a>, if it is supported by the current context.
     * 
     * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     * 
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code glfwGetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
     * {@code vkGetDeviceProcAddr} instead.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>The address of a given function is not guaranteed to be the same between contexts.</li>
     * <li>This function may return a non-{@code NULL} address despite the associated version or extension not being available. Always check the context version or
     * extension string first.</li>
     * <li>The returned function pointer is valid until the context is destroyed or the library is terminated.</li>
     * <li>This function may be called from any thread.</li>
     * </ul></div>
     *
     * @param procname the ASCII encoded name of the function
     *
     * @return the address of the function, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
    @NativeType("GLFWglproc")
    public static long glfwGetProcAddress(@NativeType("char const *") ByteBuffer procname) {
        if (CHECKS) {
            checkNT1(procname);
        }
        return nglfwGetProcAddress(memAddress(procname));
    }

    /**
     * Returns the address of the specified OpenGL or OpenGL ES <a href="https://www.glfw.org/docs/latest/context.html#context_glext">core or extension function</a>, if it is supported by the current context.
     * 
     * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
     * 
     * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code glfwGetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
     * {@code vkGetDeviceProcAddr} instead.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <ul>
     * <li>The address of a given function is not guaranteed to be the same between contexts.</li>
     * <li>This function may return a non-{@code NULL} address despite the associated version or extension not being available. Always check the context version or
     * extension string first.</li>
     * <li>The returned function pointer is valid until the context is destroyed or the library is terminated.</li>
     * <li>This function may be called from any thread.</li>
     * </ul></div>
     *
     * @param procname the ASCII encoded name of the function
     *
     * @return the address of the function, or {@code NULL} if an error occurred
     *
     * @since version 1.0
     */
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

    /** Array version of: {@link #glfwGetVersion GetVersion} */
    public static void glfwGetVersion(@Nullable @NativeType("int *") int[] major, @Nullable @NativeType("int *") int[] minor, @Nullable @NativeType("int *") int[] rev) {
        long __functionAddress = Functions.GetVersion;
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(rev, 1);
        }
        invokePPPV(major, minor, rev, __functionAddress);
    }

    /** Array version of: {@link #glfwGetMonitorPos GetMonitorPos} */
    public static void glfwGetMonitorPos(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("int *") int[] xpos, @Nullable @NativeType("int *") int[] ypos) {
        long __functionAddress = Functions.GetMonitorPos;
        if (CHECKS) {
            check(monitor);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        invokePPPV(monitor, xpos, ypos, __functionAddress);
    }

    /** Array version of: {@link #glfwGetMonitorWorkarea GetMonitorWorkarea} */
    public static void glfwGetMonitorWorkarea(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("int *") int[] xpos, @Nullable @NativeType("int *") int[] ypos, @Nullable @NativeType("int *") int[] width, @Nullable @NativeType("int *") int[] height) {
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

    /** Array version of: {@link #glfwGetMonitorPhysicalSize GetMonitorPhysicalSize} */
    public static void glfwGetMonitorPhysicalSize(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("int *") int[] widthMM, @Nullable @NativeType("int *") int[] heightMM) {
        long __functionAddress = Functions.GetMonitorPhysicalSize;
        if (CHECKS) {
            check(monitor);
            checkSafe(widthMM, 1);
            checkSafe(heightMM, 1);
        }
        invokePPPV(monitor, widthMM, heightMM, __functionAddress);
    }

    /** Array version of: {@link #glfwGetMonitorContentScale GetMonitorContentScale} */
    public static void glfwGetMonitorContentScale(@NativeType("GLFWmonitor *") long monitor, @Nullable @NativeType("float *") float[] xscale, @Nullable @NativeType("float *") float[] yscale) {
        long __functionAddress = Functions.GetMonitorContentScale;
        if (CHECKS) {
            check(monitor);
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        invokePPPV(monitor, xscale, yscale, __functionAddress);
    }

    /** Array version of: {@link #glfwGetWindowPos GetWindowPos} */
    public static void glfwGetWindowPos(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") int[] xpos, @Nullable @NativeType("int *") int[] ypos) {
        long __functionAddress = Functions.GetWindowPos;
        if (CHECKS) {
            check(window);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

    /** Array version of: {@link #glfwGetWindowSize GetWindowSize} */
    public static void glfwGetWindowSize(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") int[] width, @Nullable @NativeType("int *") int[] height) {
        long __functionAddress = Functions.GetWindowSize;
        if (CHECKS) {
            check(window);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /** Array version of: {@link #glfwGetFramebufferSize GetFramebufferSize} */
    public static void glfwGetFramebufferSize(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") int[] width, @Nullable @NativeType("int *") int[] height) {
        long __functionAddress = Functions.GetFramebufferSize;
        if (CHECKS) {
            check(window);
            checkSafe(width, 1);
            checkSafe(height, 1);
        }
        invokePPPV(window, width, height, __functionAddress);
    }

    /** Array version of: {@link #glfwGetWindowFrameSize GetWindowFrameSize} */
    public static void glfwGetWindowFrameSize(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") int[] left, @Nullable @NativeType("int *") int[] top, @Nullable @NativeType("int *") int[] right, @Nullable @NativeType("int *") int[] bottom) {
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

    /** Array version of: {@link #glfwGetWindowContentScale GetWindowContentScale} */
    public static void glfwGetWindowContentScale(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("float *") float[] xscale, @Nullable @NativeType("float *") float[] yscale) {
        long __functionAddress = Functions.GetWindowContentScale;
        if (CHECKS) {
            check(window);
            checkSafe(xscale, 1);
            checkSafe(yscale, 1);
        }
        invokePPPV(window, xscale, yscale, __functionAddress);
    }

    /** Array version of: {@link #glfwGetCursorPos GetCursorPos} */
    public static void glfwGetCursorPos(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("double *") double[] xpos, @Nullable @NativeType("double *") double[] ypos) {
        long __functionAddress = Functions.GetCursorPos;
        if (CHECKS) {
            check(window);
            checkSafe(xpos, 1);
            checkSafe(ypos, 1);
        }
        invokePPPV(window, xpos, ypos, __functionAddress);
    }

}