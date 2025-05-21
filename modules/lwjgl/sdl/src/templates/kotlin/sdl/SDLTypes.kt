/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl

import core.linux.*
import core.windows.*
import org.lwjgl.generator.*

// SDL_stdinc.kt
val wchar_t = CharType("wchar_t", CharMapping.UTF16)
val Sint16 = typedef(int16_t, "Sint16")
val Sint32 = typedef(int32_t, "Sint32")
val Sint64 = typedef(int64_t, "Sint64")
val Sint8 = typedef(int8_t, "Sint8")
val Uint16 = typedef(uint16_t, "Uint16")
val Uint32 = typedef(uint32_t, "Uint32")
val Uint64 = typedef(uint64_t, "Uint64")
val Uint8 = typedef(uint8_t, "Uint8")

val SDL_FunctionPointer = "SDL_FunctionPointer".handle
val SDL_Environment = "SDL_Environment".opaque
val SDL_Time = typedef(Sint64, "SDL_Time")

val SDL_malloc_func = Module.SDL.callback {
    void.p(
        "SDL_malloc_func",

        AutoSizeResult..size_t("size"),

        nativeType = "SDL_malloc_func"
    )
}

val SDL_calloc_func = Module.SDL.callback {
    void.p(
        "SDL_calloc_func",

        AutoSizeResult..size_t("nmemb"),
        AutoSizeResult..size_t("size"),

        nativeType = "SDL_calloc_func"
    )
}

val SDL_realloc_func = Module.SDL.callback {
    void.p(
        "SDL_realloc_func",

        nullable..opaque_p("mem"),
        AutoSizeResult..size_t("size"),

        nativeType = "SDL_realloc_func"
    )
}

val SDL_free_func = Module.SDL.callback {
    void(
        "SDL_free_func",

        opaque_p("mem"),

        nativeType = "SDL_free_func"
    )
}

val SDL_CompareCallback = Module.SDL.callback {
    int(
        "SDL_CompareCallback",

        opaque_const_p("a"),
        opaque_const_p("b"),

        nativeType = "SDL_CompareCallback"
    )
}

val SDL_CompareCallback_r = Module.SDL.callback {
    int(
        "SDL_CompareCallback_r",

        nullable..opaque_p("userdata"),
        opaque_const_p("a"),
        opaque_const_p("b"),

        nativeType = "SDL_CompareCallback_r"
    )
}

// SDL_gamepad.h (early definitions)
val SDL_Gamepad = "SDL_Gamepad".opaque

val SDL_GamepadAxis = "SDL_GamepadAxis".enumType
val SDL_GamepadBindingType = "SDL_GamepadBindingType".enumType
val SDL_GamepadButton = "SDL_GamepadButton".enumType
val SDL_GamepadButtonLabel = "SDL_GamepadButtonLabel".enumType
val SDL_GamepadType = "SDL_GamepadType".enumType

// SDL_guid.h (early definitions)
val SDL_GUID = struct(Module.SDL, "SDL_GUID") {
    Uint8("data")[16]
}

// SDL_joystick.h (early definitions)
val SDL_Joystick = "SDL_Joystick".opaque
val SDL_JoystickID = typedef(Uint32, "SDL_JoystickID")

val SDL_JoystickConnectionState = "SDL_JoystickConnectionState".enumType
val SDL_JoystickType = "SDL_JoystickType".enumType

// SDL_keyboard.h (early definitions)
val SDL_KeyboardID = typedef(Uint32, "SDL_KeyboardID")

val SDL_Capitalization = "SDL_Capitalization".enumType
val SDL_TextInputType = "SDL_TextInputType".enumType

// SDL_keycode.h (early definitions)
val SDL_Keycode = typedef(Uint32, "SDL_Keycode")
val SDL_Keymod = typedef(Uint16, "SDL_Keymod")

// SDL_pixels.h (early definitions)
val SDL_ArrayOrder = "SDL_ArrayOrder".enumType
val SDL_BitmapOrder = "SDL_BitmapOrder".enumType
val SDL_ChromaLocation = "SDL_ChromaLocation".enumType
val SDL_ColorPrimaries = "SDL_ColorPrimaries".enumType
val SDL_ColorRange = "SDL_ColorRange".enumType
val SDL_ColorType = "SDL_ColorType".enumType
val SDL_Colorspace = "SDL_Colorspace".enumType
val SDL_MatrixCoefficients = "SDL_MatrixCoefficients".enumType
val SDL_PackedLayout = "SDL_PackedLayout".enumType
val SDL_PackedOrder = "SDL_PackedOrder".enumType
val SDL_PixelFormat = "SDL_PixelFormat".enumType
val SDL_PixelType = "SDL_PixelType".enumType
val SDL_TransferCharacteristics = "SDL_TransferCharacteristics".enumType

val SDL_Color = struct(Module.SDL, "SDL_Color") {
    Uint8("r")
    Uint8("g")
    Uint8("b")
    Uint8("a")
}

val SDL_FColor = struct(Module.SDL, "SDL_FColor") {
    float("r")
    float("g")
    float("b")
    float("a")
}

val SDL_Palette = struct(Module.SDL, "SDL_Palette", mutable = false) {
    AutoSize("colors")..int("ncolors")
    SDL_Color.p("colors")
    Uint32("version").private()
    int("refcount").private()
}

val SDL_PixelFormatDetails = struct(Module.SDL, "SDL_PixelFormatDetails", mutable = false) {
    SDL_PixelFormat("format")
    Uint8("bits_per_pixel")
    Uint8("bytes_per_pixel")
    Uint8("padding")[2].private()
    Uint32("Rmask")
    Uint32("Gmask")
    Uint32("Bmask")
    Uint32("Amask")
    Uint8("Rbits")
    Uint8("Gbits")
    Uint8("Bbits")
    Uint8("Abits")
    Uint8("Rshift")
    Uint8("Gshift")
    Uint8("Bshift")
    Uint8("Ashift")
}

// SDL_power.h (early definitions)
val SDL_PowerState = "SDL_PowerState".enumType

// SDL_rect.h (early definitions)
val SDL_Point = struct(Module.SDL, "SDL_Point") {
    int("x")
    int("y")
}

val SDL_FPoint = struct(Module.SDL, "SDL_FPoint") {
    float("x")
    float("y")
}

val SDL_Rect = struct(Module.SDL, "SDL_Rect") {
    int("x")
    int("y")
    int("w")
    int("h")
}

val SDL_FRect = struct(Module.SDL, "SDL_FRect") {
    float("x")
    float("y")
    float("w")
    float("h")
}

// SDL_scancode.h (early definitions)
val SDL_Scancode = "SDL_Scancode".enumType

// SDL_sensor.h (early definitions)
val SDL_Sensor = "SDL_Sensor".opaque
val SDL_SensorID = typedef(Uint32, "SDL_SensorID")

val SDL_SensorType = "SDL_SensorType".enumType

// SDL_surface.h (early definitions)
val SDL_SurfaceFlags = typedef(Uint32, "SDL_SurfaceFlags")

val SDL_FlipMode = "SDL_FlipMode".enumType
val SDL_ScaleMode = "SDL_ScaleMode".enumType

// TODO: mutable?
val SDL_Surface = struct(Module.SDL, "SDL_Surface") {
    SDL_SurfaceFlags("flags")
    SDL_PixelFormat("format")
    int("w")
    int("h")
    int("pitch")
    Check("pitch * h")..nullable..void.p("pixels")
    int("refcount")
    nullable..opaque_p("reserved").private()
}

// SDL_video.h (early definitions)
val SDL_EGLConfig = "SDL_EGLConfig".handle
val SDL_EGLDisplay = "SDL_EGLDisplay".handle
val SDL_EGLSurface = "SDL_EGLSurface".handle
val SDL_GLContext = "SDL_GLContext".handle

val SDL_DisplayID = typedef(Uint32, "SDL_DisplayID")
val SDL_DisplayModeData = "SDL_DisplayModeData".opaque
val SDL_EGLAttrib = typedef(intptr_t, "SDL_EGLAttrib")
val SDL_EGLint = typedef(int, "SDL_EGLint")
val SDL_GLContextFlag = typedef(Uint32, "SDL_GLContextFlag")
val SDL_GLContextReleaseFlag = typedef(Uint32, "SDL_GLContextReleaseFlag")
val SDL_GLContextResetNotification = typedef(Uint32, "SDL_GLContextResetNotification")
val SDL_GLProfile = typedef(Uint32, "SDL_GLProfile")
val SDL_Window = "SDL_Window".opaque
val SDL_WindowFlags = typedef(Uint64, "SDL_WindowFlags")
val SDL_WindowID = typedef(Uint32, "SDL_WindowID")

val SDL_DisplayOrientation = "SDL_DisplayOrientation".enumType
val SDL_FlashOperation = "SDL_FlashOperation".enumType
val SDL_GLAttr = "SDL_GLAttr".enumType
val SDL_HitTestResult = "SDL_HitTestResult".enumType
val SDL_SystemTheme = "SDL_SystemTheme".enumType

// SDL_asyncio.h
val SDL_AsyncIO = "SDL_AsyncIO".opaque
val SDL_AsyncIOQueue = "SDL_AsyncIOQueue".opaque

val SDL_AsyncIOResult = "SDL_AsyncIOResult".enumType
val SDL_AsyncIOTaskType = "SDL_AsyncIOTaskType".enumType

val SDL_AsyncIOOutcome = struct(Module.SDL, "SDL_AsyncIOOutcome", mutable = false) {
    SDL_AsyncIO.p("asyncio")
    SDL_AsyncIOTaskType("type")
    SDL_AsyncIOResult("result")
    void.p("buffer")
    Uint64("offset")
    Uint64("bytes_requested")
    Uint64("bytes_transferred")
    nullable..opaque_p("userdata")
}

// SDL_audio.h
val SDL_AudioDeviceID = typedef(Uint32, "SDL_AudioDeviceID")
val SDL_AudioStream = "SDL_AudioStream".opaque

val SDL_AudioFormat = "SDL_AudioFormat".enumType

val SDL_AudioSpec = struct(Module.SDL, "SDL_AudioSpec") {
    SDL_AudioFormat("format")
    int("channels")
    int("freq")
}

val SDL_AudioStreamCallback = Module.SDL.callback {
    void(
        "SDL_AudioStreamCallback",

        nullable..opaque_p("userdata"),
        SDL_AudioStream.p("stream"),
        int("additional_amount"),
        int("total_amount"),

        nativeType = "SDL_AudioStreamCallback"
    )
}

val SDL_AudioPostmixCallback = Module.SDL.callback {
    void(
        "SDL_AudioPostmixCallback",

        nullable..opaque_p("userdata"),
        SDL_AudioSpec.const.p("spec"),
        float.p("buffer"),
        AutoSize("buffer")..int("buflen"),

        nativeType = "SDL_AudioPostmixCallback"
    )
}

// SDL_blendmode.h
val SDL_BlendMode = typedef(Uint32, "SDL_BlendMode")

val SDL_BlendFactor = "SDL_BlendFactor".enumType
val SDL_BlendOperation = "SDL_BlendOperation".enumType

// SDL_camera.h
val SDL_Camera = "SDL_Camera".opaque
val SDL_CameraID = typedef(Uint32, "SDL_CameraID")

val SDL_CameraPosition = "SDL_CameraPosition".enumType

val SDL_CameraSpec = struct(Module.SDL, "SDL_CameraSpec") {
    SDL_PixelFormat("format")
    SDL_Colorspace("colorspace")
    int("width")
    int("height")
    int("framerate_numerator")
    int("framerate_denominator")
}

// SDL_clipboard.h
val SDL_ClipboardDataCallback = Module.SDL.callback {
    void.const.p(
        "SDL_ClipboardDataCallback",

        nullable..opaque_p("userdata"),
        charASCII.const.p("mime_type"),
        Check(1)..size_t.p("size"),

        nativeType = "SDL_ClipboardDataCallback"
    )
}

val SDL_ClipboardCleanupCallback = Module.SDL.callback {
    void(
        "SDL_ClipboardCleanupCallback",

        nullable..opaque_p("userdata"),

        nativeType = "SDL_ClipboardCleanupCallback"
    )
}

// SDL_iostream.h
val SDL_IOStream = "SDL_IOStream".opaque

val SDL_IOStatus = "SDL_IOStatus".enumType
val SDL_IOWhence = "SDL_IOWhence".enumType

val SDL_IOStreamInterface = struct(Module.SDL, "SDL_IOStreamInterface") {
    Uint32("version")
    Module.SDL.callback {
        Sint64(
            "SDL_IOStreamInterfaceSizeCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("size")
    Module.SDL.callback {
        Sint64(
            "SDL_IOStreamInterfaceSeekCallback",

            nullable..opaque_p("userdata"),
            Sint64("offset"),
            SDL_IOWhence("whence")
        ) {}
    }("seek")
    Module.SDL.callback {
        size_t(
            "SDL_IOStreamInterfaceReadCallback",

            nullable..opaque_p("userdata"),
            void.p("ptr"),
            AutoSize("ptr")..size_t("size"),
            SDL_IOStatus.p("status")
        ) {}
    }("read")
    Module.SDL.callback {
        size_t(
            "SDL_IOStreamInterfaceWriteCallback",

            nullable..opaque_p("userdata"),
            void.const.p("ptr"),
            AutoSize("ptr")..size_t("size"),
            SDL_IOStatus.p("status")
        ) {}
    }("write")
    Module.SDL.callback {
        bool(
            "SDL_IOStreamInterfaceFlushCallback",

            nullable..opaque_p("userdata"),
            SDL_IOStatus.p("status")
        ) {}
    }("flush")
    Module.SDL.callback {
        bool(
            "SDL_IOStreamInterfaceCloseCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("close")
}

// SDL_dialog.h
val SDL_FileDialogType = "SDL_FileDialogType".enumType

val SDL_DialogFileFilter = struct(Module.SDL, "SDL_DialogFileFilter") {
    charUTF8.const.p("name")
    charUTF8.const.p("pattern")
}

val SDL_DialogFileCallback = Module.SDL.callback {
    void(
        "SDL_DialogFileCallback",

        nullable..opaque_p("userdata"),
        nullable..charUTF8.const.p.const.p("filelist"),
        int("filter"),

        nativeType = "SDL_DialogFileCallback"
    )
}

// SDL_filesystem.h
val SDL_GlobFlags = typedef(Uint32, "SDL_GlobFlags")

val SDL_EnumerationResult = "SDL_EnumerationResult".enumType
val SDL_Folder = "SDL_Folder".enumType
val SDL_PathType = "SDL_PathType".enumType

val SDL_PathInfo = struct(Module.SDL, "SDL_PathInfo") {
    SDL_PathType("type")
    Uint64("size")
    SDL_Time("create_time")
    SDL_Time("modify_time")
    SDL_Time("access_time")
}

val SDL_EnumerateDirectoryCallback = Module.SDL.callback {
    SDL_EnumerationResult(
        "SDL_EnumerateDirectoryCallback",

        nullable..opaque_p("userdata"),
        charUTF8.const.p("dirname"),
        charUTF8.const.p("fname"),

        nativeType = "SDL_EnumerateDirectoryCallback"
    )
}

// SDL_gamepad.h
val SDL_GamepadBinding = struct(Module.SDL, "SDL_GamepadBinding") {
    SDL_GamepadBindingType("input_type")
    union {
        int("button")
        struct {
            int("axis")
            int("axis_min")
            int("axis_max")
        }("axis")
        struct {
            int("hat")
            int("hat_mask")
        }("hat")
    }("input")
    SDL_GamepadBindingType("output_type")
    union {
        SDL_GamepadButton("button")
        struct {
            SDL_GamepadAxis("axis")
            int("axis_min")
            int("axis_max")
        }("axis")
    }("output")
}

// SDL_haptic.h
val SDL_Haptic = "SDL_Haptic".opaque
val SDL_HapticID = typedef(Uint32, "SDL_HapticID")

val SDL_HapticDirection = struct(Module.SDL, "SDL_HapticDirection") {
    Uint8("type")
    Sint32("dir")[3]
}

val SDL_HapticConstant = struct(Module.SDL, "SDL_HapticConstant") {
    Uint16("type")
    SDL_HapticDirection("direction")
    Uint32("length")
    Uint16("delay")
    Uint16("button")
    Uint16("interval")
    Sint16("level")
    Uint16("attack_length")
    Uint16("attack_level")
    Uint16("fade_length")
    Uint16("fade_level")
}

val SDL_HapticPeriodic = struct(Module.SDL, "SDL_HapticPeriodic") {
    Uint16("type")
    SDL_HapticDirection("direction")
    Uint32("length")
    Uint16("delay")
    Uint16("button")
    Uint16("interval")
    Uint16("period")
    Sint16("magnitude")
    Sint16("offset")
    Uint16("phase")
    Uint16("attack_length")
    Uint16("attack_level")
    Uint16("fade_length")
    Uint16("fade_level")
}

val SDL_HapticCondition = struct(Module.SDL, "SDL_HapticCondition") {
    Uint16("type")
    SDL_HapticDirection("direction")
    Uint32("length")
    Uint16("delay")
    Uint16("button")
    Uint16("interval")
    Uint16("right_sat")[3]
    Uint16("left_sat")[3]
    Sint16("right_coeff")[3]
    Sint16("left_coeff")[3]
    Uint16("deadband")[3]
    Sint16("center")[3]
}

val SDL_HapticRamp = struct(Module.SDL, "SDL_HapticRamp") {
    Uint16("type")
    SDL_HapticDirection("direction")
    Uint32("length")
    Uint16("delay")
    Uint16("button")
    Uint16("interval")
    Sint16("start")
    Sint16("end")
    Uint16("attack_length")
    Uint16("attack_level")
    Uint16("fade_length")
    Uint16("fade_level")
}

val SDL_HapticLeftRight = struct(Module.SDL, "SDL_HapticLeftRight") {
    Uint16("type")
    Uint32("length")
    Uint16("large_magnitude")
    Uint16("small_magnitude")
}

val SDL_HapticCustom = struct(Module.SDL, "SDL_HapticCustom") {
    Uint16("type")
    SDL_HapticDirection("direction")
    Uint32("length")
    Uint16("delay")
    Uint16("button")
    Uint16("interval")
    Uint8("channels")
    Uint16("period")
    Uint16("samples")
    Check("channels * samples")..Uint16.p("data")
    Uint16("attack_length")
    Uint16("attack_level")
    Uint16("fade_length")
    Uint16("fade_level")
}

val SDL_HapticEffect = union(Module.SDL, "SDL_HapticEffect") {
    Uint16("type")
    SDL_HapticConstant("constant")
    SDL_HapticPeriodic("periodic")
    SDL_HapticCondition("condition")
    SDL_HapticRamp("ramp")
    SDL_HapticLeftRight("leftright")
    SDL_HapticCustom("custom")
}

// SDL_hidapi.h
val SDL_hid_device = "SDL_hid_device".opaque

val SDL_hid_bus_type = "SDL_hid_bus_type".enumType

val SDL_hid_device_info = struct(Module.SDL, "SDL_hid_device_info") {
    charUTF8.p("path")
    unsigned_short("vendor_id")
    unsigned_short("product_id")
    wchar_t.p("serial_number")
    unsigned_short("release_number")
    wchar_t.p("manufacturer_string")
    wchar_t.p("product_string")
    unsigned_short("usage_page")
    unsigned_short("usage")
    int("interface_number")
    int("interface_class")
    int("interface_subclass")
    int("interface_protocol")
    SDL_hid_bus_type("bus_type")
    struct(Module.SDL, "SDL_hid_device_info").p("next")
}

// SDL_hints.h
val SDL_HintPriority = "SDL_HintPriority".enumType

val SDL_HintCallback = Module.SDL.callback {
    void(
        "SDL_HintCallback",

        nullable..opaque_p("userdata"),
        charASCII.const.p("name"),
        nullable..charUTF8.const.p("oldValue"),
        nullable..charUTF8.const.p("newValue"),

        nativeType = "SDL_HintCallback"
    )
}

// SDL_init.h, removed the app callbacks because they're impossible to use from Java
val SDL_InitFlags = typedef(Uint32, "SDL_InitFlags")

//val SDL_AppResult = "SDL_AppResult".enumType

val SDL_MainThreadCallback = Module.SDL.callback {
    void(
        "SDL_MainThreadCallback",

        nullable..opaque_p("userdata"),

        nativeType = "SDL_MainThreadCallback"
    )
}

// SDL_joystick.h (continued)
val SDL_VirtualJoystickTouchpadDesc = struct(Module.SDL, "SDL_VirtualJoystickTouchpadDesc") {
    Uint16("nfingers")
    Uint16("padding")[3].private()
}

val SDL_VirtualJoystickSensorDesc = struct(Module.SDL, "SDL_VirtualJoystickSensorDesc") {
    SDL_SensorType("type")
    float("rate")
}

val SDL_VirtualJoystickDesc = struct(Module.SDL, "SDL_VirtualJoystickDesc") {
    Uint32("version")
    Uint16("type")
    Uint16("padding").private()
    Uint16("vendor_id")
    Uint16("product_id")
    Uint16("naxes")
    Uint16("nbuttons")
    Uint16("nballs")
    Uint16("nhats")
    AutoSizeMember("touchpads")..Uint16("ntouchpads")
    AutoSizeMember("sensors")..Uint16("nsensors")
    Uint16("padding2")[2].private()
    Uint32("button_mask")
    Uint32("axis_mask")
    charUTF8.const.p("name")
    nullable..SDL_VirtualJoystickTouchpadDesc.const.p("touchpads")
    nullable..SDL_VirtualJoystickSensorDesc.const.p("sensors")
    nullable..opaque_p("userdata")
    nullable..Module.SDL.callback {
        void(
            "SDL_VirtualJoystickDescUpdateCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("Update")
    nullable..Module.SDL.callback {
        void(
            "SDL_VirtualJoystickDescSetPlayerIndexCallback",

            nullable..opaque_p("userdata"),
            int("player_index")
        ) {}
    }("SetPlayerIndex")
    nullable..Module.SDL.callback {
        bool(
            "SDL_VirtualJoystickDescRumbleCallback",

            nullable..opaque_p("userdata"),
            Uint16("low_frequency_rumble"),
            Uint16("high_frequency_rumble")
        ) {}
    }("Rumble")
    nullable..Module.SDL.callback {
        bool(
            "SDL_VirtualJoystickDescRumbleTriggersCallback",

            nullable..opaque_p("userdata"),
            Uint16("left_rumble"),
            Uint16("right_rumble")
        ) {}
    }("RumbleTriggers")
    nullable..Module.SDL.callback {
        bool(
            "SDL_VirtualJoystickDescSetLEDCallback",

            nullable..opaque_p("userdata"),
            Uint8("red"),
            Uint8("green"),
            Uint8("blue")
        ) {}
    }("SetLED")
    nullable..Module.SDL.callback {
        bool(
            "SDL_VirtualJoystickDescSendEffectCallback",

            nullable..opaque_p("userdata"),
            void.const.p("data"),
            AutoSize("data")..int("size")
        ) {}
    }("SendEffect")
    nullable..Module.SDL.callback {
        bool(
            "SDL_VirtualJoystickDescSetSensorsEnabledCallback",

            nullable..opaque_p("userdata"),
            bool("enabled")
        ) {}
    }("SetSensorsEnabled")
    nullable..Module.SDL.callback {
        void(
            "SDL_VirtualJoystickDescCleanupCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("Cleanup")
}

// SDL_loadso.h
val SDL_SharedObject = "SDL_SharedObject".opaque

// SDL_locale.h
val SDL_Locale = struct(Module.SDL, "SDL_Locale") {
    charASCII.const.p("language")
    nullable..charASCII.const.p("country")
}

// SDL_log.h
val SDL_LogCategory = "SDL_LogCategory".enumType
val SDL_LogPriority = "SDL_LogPriority".enumType

val SDL_LogOutputFunction = Module.SDL.callback {
    void(
        "SDL_LogOutputFunction",

        nullable..opaque_p("userdata"),
        int("category"),
        SDL_LogPriority("priority"),
        charUTF8.const.p("message"),

        nativeType = "SDL_LogOutputFunction"
    )
}

// SDL_messagebox.h
val SDL_MessageBoxButtonFlags = typedef(Uint32, "SDL_MessageBoxButtonFlags")
val SDL_MessageBoxFlags = typedef(Uint32, "SDL_MessageBoxFlags")

val SDL_MessageBoxColorType = "SDL_MessageBoxColorType".enumType

val SDL_MessageBoxButtonData = struct(Module.SDL, "SDL_MessageBoxButtonData") {
    SDL_MessageBoxButtonFlags("flags")
    int("buttonID")
    charUTF8.const.p("text")
}

val SDL_MessageBoxColor = struct(Module.SDL, "SDL_MessageBoxColor") {
    Uint8("r")
    Uint8("g")
    Uint8("b")
}

val SDL_MessageBoxColorScheme = struct(Module.SDL, "SDL_MessageBoxColorScheme") {
    SDL_MessageBoxColor("colors")[5]
}

val SDL_MessageBoxData = struct(Module.SDL, "SDL_MessageBoxData") {
    SDL_MessageBoxFlags("flags")
    nullable..SDL_Window.p("window")
    charUTF8.const.p("title")
    charUTF8.const.p("message")
    AutoSize("buttons")..int("numbuttons")
    SDL_MessageBoxButtonData.const.p("buttons")
    nullable..SDL_MessageBoxColorScheme.const.p("colorScheme")
}

// SDL_metal.h
val SDL_MetalView = "SDL_MetalView".handle

// SDL_mouse.h
val SDL_Cursor = "SDL_Cursor".opaque
val SDL_MouseButtonFlags = typedef(Uint32, "SDL_MouseButtonFlags")
val SDL_MouseID = typedef(Uint32, "SDL_MouseID")

val SDL_MouseWheelDirection = "SDL_MouseWheelDirection".enumType
val SDL_SystemCursor = "SDL_SystemCursor".enumType

// SDL_pen.h
val SDL_PenID = typedef(Uint32, "SDL_PenID")
val SDL_PenInputFlags = typedef(Uint32, "SDL_PenInputFlags")

val SDL_PenAxis = "SDL_PenAxis".enumType

// SDL_properties.h
val SDL_PropertiesID = typedef(Uint32, "SDL_PropertiesID")

val SDL_PropertyType = "SDL_PropertyType".enumType

val SDL_CleanupPropertyCallback = Module.SDL.callback {
    void(
        "SDL_CleanupPropertyCallback",

        nullable..opaque_p("userdata"),
        opaque_p("value"),

        nativeType = "SDL_CleanupPropertyCallback"
    )
}

val SDL_EnumeratePropertiesCallback = Module.SDL.callback {
    void(
        "SDL_EnumeratePropertiesCallback",

        nullable..opaque_p("userdata"),
        SDL_PropertiesID("props"),
        charASCII.const.p("name"),

        nativeType = "SDL_EnumeratePropertiesCallback"
    )
}

// SDL_render.h
val SDL_Renderer = "SDL_Renderer".opaque

val SDL_RendererLogicalPresentation = "SDL_RendererLogicalPresentation".enumType
val SDL_TextureAccess = "SDL_TextureAccess".enumType

val SDL_Vertex = struct(Module.SDL, "SDL_Vertex") {
    SDL_FPoint("position")
    SDL_FColor("color")
    SDL_FPoint("tex_coord")
}

val SDL_Texture = struct(Module.SDL, "SDL_Texture") {
    SDL_PixelFormat("format")
    int("w")
    int("h")
    int("refcount")
}

// SDL_storage.h
val SDL_Storage = "SDL_Storage".opaque

val SDL_StorageInterface = struct(Module.SDL, "SDL_StorageInterface") {
    Uint32("version")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceCloseCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("close")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceReadyCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("ready")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceEnumerateCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("path"),
            SDL_EnumerateDirectoryCallback("callback"),
            nullable..opaque_p("callback_userdata")
        ) {}
    }("enumerate")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceInfoCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("path"),
            SDL_PathInfo.p("info")
        ) {}
    }("info")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceReadFileCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("path"),
            void.p("destination"),
            AutoSize("destination")..Uint64("length")
        ) {}
    }("read_file")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceWriteFileCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("path"),
            void.const.p("source"),
            AutoSize("source")..Uint64("length")
        ) {}
    }("write_file")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceMkdirCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("path")
        ) {}
    }("mkdir")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceRemoveCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("path")
        ) {}
    }("remove")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceRenameCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("oldpath"),
            charUTF8.const.p("newpath")
        ) {}
    }("rename")
    nullable..Module.SDL.callback {
        bool(
            "SDL_StorageInterfaceCopyCallback",

            nullable..opaque_p("userdata"),
            charUTF8.const.p("oldpath"),
            charUTF8.const.p("newpath")
        ) {}
    }("copy")
    nullable..Module.SDL.callback {
        Uint64(
            "SDL_StorageInterfaceSpaceRemainingCallback",

            nullable..opaque_p("userdata")
        ) {}
    }("space_remaining")
}

// SDL_system.h
//val XTaskQueueHandle = "XTaskQueueHandle".handle
//val XUserHandle = "XUserHandle".handle

val SDL_Sandbox = "SDL_Sandbox".enumType

val SDL_WindowsMessageHook = Module.SDL.callback {
    bool(
        "SDL_WindowsMessageHook",

        nullable..opaque_p("userdata"),
        MSG.p("msg"),

        nativeType = "SDL_WindowsMessageHook"
    )
}

val SDL_X11EventHook = Module.SDL.callback {
    bool(
        "SDL_X11EventHook",

        nullable..opaque_p("userdata"),
        XEvent.p("xevent"),

        nativeType = "SDL_X11EventHook"
    )
}

/*val SDL_iOSAnimationCallback = Module.SDL.callback {
    void(
        "SDL_iOSAnimationCallback",

        nullable..opaque_p("userdata"),

        nativeType = "SDL_iOSAnimationCallback"
    )
}*/

/*val SDL_RequestAndroidPermissionCallback = Module.SDL.callback {
    void(
        "SDL_RequestAndroidPermissionCallback",

        nullable..opaque_p("userdata"),
        charUTF8.const.p("permission"),
        bool("granted"),

        nativeType = "SDL_RequestAndroidPermissionCallback"
    )
}*/

// SDL_touch.h
val SDL_FingerID = typedef(Uint64, "SDL_FingerID")
val SDL_TouchID = typedef(Uint64, "SDL_TouchID")

val SDL_TouchDeviceType = "SDL_TouchDeviceType".enumType

val SDL_Finger = struct(Module.SDL, "SDL_Finger") {
    SDL_FingerID("id")
    float("x")
    float("y")
    float("pressure")
}

// SDL_thread.h
val SDL_TLSID = typedef(int, "SDL_TLSID")
//val SDL_Thread = "SDL_Thread".opaque
//val SDL_ThreadID = typedef(Uint64, "SDL_ThreadID")

//val SDL_ThreadPriority = "SDL_ThreadPriority".enumType
//val SDL_ThreadState = "SDL_ThreadState".enumType

/*val SDL_ThreadFunction = Module.SDL.callback {
    int(
        "SDL_ThreadFunction",

        nullable..opaque_p("data"),

        nativeType = "SDL_ThreadFunction"
    )
}*/

val SDL_TLSDestructorCallback = Module.SDL.callback {
    void(
        "SDL_TLSDestructorCallback",

        nullable..opaque_p("value"),

        nativeType = "SDL_TLSDestructorCallback"
    )
}

// SDL_time.h
val SDL_DateFormat = "SDL_DateFormat".enumType
val SDL_TimeFormat = "SDL_TimeFormat".enumType

val SDL_DateTime = struct(Module.SDL, "SDL_DateTime") {
    int("year")
    int("month")
    int("day")
    int("hour")
    int("minute")
    int("second")
    int("nanosecond")
    int("day_of_week")
    int("utc_offset")
}

// SDL_timer.h
val SDL_TimerID = typedef(Uint32, "SDL_TimerID")

val SDL_TimerCallback = Module.SDL.callback {
    Uint32(
        "SDL_TimerCallback",

        nullable..opaque_p("userdata"),
        SDL_TimerID("timerID"),
        Uint32("interval"),

        nativeType = "SDL_TimerCallback"
    )
}

val SDL_NSTimerCallback = Module.SDL.callback {
    Uint64(
        "SDL_NSTimerCallback",

        nullable..opaque_p("userdata"),
        SDL_TimerID("timerID"),
        Uint64("interval"),

        nativeType = "SDL_NSTimerCallback"
    )
}

// SDL_tray.h
val SDL_Tray = "SDL_Tray".opaque
val SDL_TrayEntry = "SDL_TrayEntry".opaque
val SDL_TrayEntryFlags = typedef(Uint32, "SDL_TrayEntryFlags")
val SDL_TrayMenu = "SDL_TrayMenu".opaque

val SDL_TrayCallback = Module.SDL.callback {
    void(
        "SDL_TrayCallback",

        nullable..opaque_p("userdata"),
        SDL_TrayEntry.p("entry"),

        nativeType = "SDL_TrayCallback"
    )
}

// SDL_video.h (late definitions)
val SDL_DisplayMode = struct(Module.SDL, "SDL_DisplayMode") {
    SDL_DisplayID("displayID")
    SDL_PixelFormat("format")
    int("w")
    int("h")
    float("pixel_density")
    float("refresh_rate")
    int("refresh_rate_numerator")
    int("refresh_rate_denominator")
    SDL_DisplayModeData.p("internal")
}

val SDL_EGLAttribArrayCallback = Module.SDL.callback {
    SDL_EGLAttrib.p(
        "SDL_EGLAttribArrayCallback",

        nullable..opaque_p("userdata"),

        nativeType = "SDL_EGLAttribArrayCallback"
    )
}

val SDL_EGLIntArrayCallback = Module.SDL.callback {
    SDL_EGLint.p(
        "SDL_EGLIntArrayCallback",

        nullable..opaque_p("userdata"),
        SDL_EGLDisplay("display"),
        SDL_EGLConfig("config"),

        nativeType = "SDL_EGLIntArrayCallback"
    )
}

val SDL_HitTest = Module.SDL.callback {
    SDL_HitTestResult(
        "SDL_HitTest",

        SDL_Window.p("win"),
        SDL_Point.const.p("area"),
        nullable..opaque_p("data"),

        nativeType = "SDL_HitTest"
    )
}

// SDL_gpu.h (keep after video)
val SDL_GPUBuffer = "SDL_GPUBuffer".opaque
val SDL_GPUBufferUsageFlags = typedef(Uint32, "SDL_GPUBufferUsageFlags")
val SDL_GPUColorComponentFlags = typedef(Uint8, "SDL_GPUColorComponentFlags")
val SDL_GPUCommandBuffer = "SDL_GPUCommandBuffer".opaque
val SDL_GPUComputePass = "SDL_GPUComputePass".opaque
val SDL_GPUComputePipeline = "SDL_GPUComputePipeline".opaque
val SDL_GPUCopyPass = "SDL_GPUCopyPass".opaque
val SDL_GPUDevice = "SDL_GPUDevice".opaque
val SDL_GPUFence = "SDL_GPUFence".opaque
val SDL_GPUGraphicsPipeline = "SDL_GPUGraphicsPipeline".opaque
val SDL_GPURenderPass = "SDL_GPURenderPass".opaque
val SDL_GPUSampler = "SDL_GPUSampler".opaque
val SDL_GPUShader = "SDL_GPUShader".opaque
val SDL_GPUShaderFormat = typedef(Uint32, "SDL_GPUShaderFormat")
val SDL_GPUTexture = "SDL_GPUTexture".opaque
val SDL_GPUTextureUsageFlags = typedef(Uint32, "SDL_GPUTextureUsageFlags")
val SDL_GPUTransferBuffer = "SDL_GPUTransferBuffer".opaque

val SDL_GPUBlendFactor = "SDL_GPUBlendFactor".enumType
val SDL_GPUBlendOp = "SDL_GPUBlendOp".enumType
val SDL_GPUCompareOp = "SDL_GPUCompareOp".enumType
val SDL_GPUCubeMapFace = "SDL_GPUCubeMapFace".enumType
val SDL_GPUCullMode = "SDL_GPUCullMode".enumType
val SDL_GPUFillMode = "SDL_GPUFillMode".enumType
val SDL_GPUFilter = "SDL_GPUFilter".enumType
val SDL_GPUFrontFace = "SDL_GPUFrontFace".enumType
val SDL_GPUIndexElementSize = "SDL_GPUIndexElementSize".enumType
val SDL_GPULoadOp = "SDL_GPULoadOp".enumType
val SDL_GPUPresentMode = "SDL_GPUPresentMode".enumType
val SDL_GPUPrimitiveType = "SDL_GPUPrimitiveType".enumType
val SDL_GPUSampleCount = "SDL_GPUSampleCount".enumType
val SDL_GPUSamplerAddressMode = "SDL_GPUSamplerAddressMode".enumType
val SDL_GPUSamplerMipmapMode = "SDL_GPUSamplerMipmapMode".enumType
val SDL_GPUShaderStage = "SDL_GPUShaderStage".enumType
val SDL_GPUStencilOp = "SDL_GPUStencilOp".enumType
val SDL_GPUStoreOp = "SDL_GPUStoreOp".enumType
val SDL_GPUSwapchainComposition = "SDL_GPUSwapchainComposition".enumType
val SDL_GPUTextureFormat = "SDL_GPUTextureFormat".enumType
val SDL_GPUTextureType = "SDL_GPUTextureType".enumType
val SDL_GPUTransferBufferUsage = "SDL_GPUTransferBufferUsage".enumType
val SDL_GPUVertexElementFormat = "SDL_GPUVertexElementFormat".enumType
val SDL_GPUVertexInputRate = "SDL_GPUVertexInputRate".enumType

val SDL_GPUViewport = struct(Module.SDL, "SDL_GPUViewport") {
    float("x")
    float("y")
    float("w")
    float("h")
    float("min_depth")
    float("max_depth")
}

val SDL_GPUTextureTransferInfo = struct(Module.SDL, "SDL_GPUTextureTransferInfo") {
    SDL_GPUTransferBuffer.p("transfer_buffer")
    Uint32("offset")
    Uint32("pixels_per_row")
    Uint32("rows_per_layer")
}

val SDL_GPUTransferBufferLocation = struct(Module.SDL, "SDL_GPUTransferBufferLocation") {
    SDL_GPUTransferBuffer.p("transfer_buffer")
    Uint32("offset")
}

val SDL_GPUTextureLocation = struct(Module.SDL, "SDL_GPUTextureLocation") {
    SDL_GPUTexture.p("texture")
    Uint32("mip_level")
    Uint32("layer")
    Uint32("x")
    Uint32("y")
    Uint32("z")
}

val SDL_GPUTextureRegion = struct(Module.SDL, "SDL_GPUTextureRegion") {
    SDL_GPUTexture.p("texture")
    Uint32("mip_level")
    Uint32("layer")
    Uint32("x")
    Uint32("y")
    Uint32("z")
    Uint32("w")
    Uint32("h")
    Uint32("d")
}

val SDL_GPUBlitRegion = struct(Module.SDL, "SDL_GPUBlitRegion") {
    SDL_GPUTexture.p("texture")
    Uint32("mip_level")
    Uint32("layer_or_depth_plane")
    Uint32("x")
    Uint32("y")
    Uint32("w")
    Uint32("h")
}

val SDL_GPUBufferLocation = struct(Module.SDL, "SDL_GPUBufferLocation") {
    SDL_GPUBuffer.p("buffer")
    Uint32("offset")
}

val SDL_GPUBufferRegion = struct(Module.SDL, "SDL_GPUBufferRegion") {
    SDL_GPUBuffer.p("buffer")
    Uint32("offset")
    Uint32("size")
}

val SDL_GPUIndirectDrawCommand = struct(Module.SDL, "SDL_GPUIndirectDrawCommand") {
    Uint32("num_vertices")
    Uint32("num_instances")
    Uint32("first_vertex")
    Uint32("first_instance")
}

val SDL_GPUIndexedIndirectDrawCommand = struct(Module.SDL, "SDL_GPUIndexedIndirectDrawCommand") {
    Uint32("num_indices")
    Uint32("num_instances")
    Uint32("first_index")
    Sint32("vertex_offset")
    Uint32("first_instance")
}

val SDL_GPUIndirectDispatchCommand = struct(Module.SDL, "SDL_GPUIndirectDispatchCommand") {
    Uint32("groupcount_x")
    Uint32("groupcount_y")
    Uint32("groupcount_z")
}

val SDL_GPUSamplerCreateInfo = struct(Module.SDL, "SDL_GPUSamplerCreateInfo") {
    SDL_GPUFilter("min_filter")
    SDL_GPUFilter("mag_filter")
    SDL_GPUSamplerMipmapMode("mipmap_mode")
    SDL_GPUSamplerAddressMode("address_mode_u")
    SDL_GPUSamplerAddressMode("address_mode_v")
    SDL_GPUSamplerAddressMode("address_mode_w")
    float("mip_lod_bias")
    float("max_anisotropy")
    SDL_GPUCompareOp("compare_op")
    float("min_lod")
    float("max_lod")
    bool("enable_anisotropy")
    bool("enable_compare")
    Uint8("padding1").private()
    Uint8("padding2").private()
    SDL_PropertiesID("props")
}

val SDL_GPUVertexBufferDescription = struct(Module.SDL, "SDL_GPUVertexBufferDescription") {
    Uint32("slot")
    Uint32("pitch")
    SDL_GPUVertexInputRate("input_rate")
    Uint32("instance_step_rate")
}

val SDL_GPUVertexAttribute = struct(Module.SDL, "SDL_GPUVertexAttribute") {
    Uint32("location")
    Uint32("buffer_slot")
    SDL_GPUVertexElementFormat("format")
    Uint32("offset")
}

val SDL_GPUVertexInputState = struct(Module.SDL, "SDL_GPUVertexInputState") {
    nullable..SDL_GPUVertexBufferDescription.const.p("vertex_buffer_descriptions")
    AutoSize("vertex_buffer_descriptions")..Uint32("num_vertex_buffers")
    nullable..SDL_GPUVertexAttribute.const.p("vertex_attributes")
    AutoSize("vertex_attributes")..Uint32("num_vertex_attributes")
}

val SDL_GPUStencilOpState = struct(Module.SDL, "SDL_GPUStencilOpState") {
    SDL_GPUStencilOp("fail_op")
    SDL_GPUStencilOp("pass_op")
    SDL_GPUStencilOp("depth_fail_op")
    SDL_GPUCompareOp("compare_op")
}

val SDL_GPUColorTargetBlendState = struct(Module.SDL, "SDL_GPUColorTargetBlendState") {
    SDL_GPUBlendFactor("src_color_blendfactor")
    SDL_GPUBlendFactor("dst_color_blendfactor")
    SDL_GPUBlendOp("color_blend_op")
    SDL_GPUBlendFactor("src_alpha_blendfactor")
    SDL_GPUBlendFactor("dst_alpha_blendfactor")
    SDL_GPUBlendOp("alpha_blend_op")
    SDL_GPUColorComponentFlags("color_write_mask")
    bool("enable_blend")
    bool("enable_color_write_mask")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_GPUShaderCreateInfo = struct(Module.SDL, "SDL_GPUShaderCreateInfo") {
    AutoSize("code")..size_t("code_size")
    Uint8.const.p("code")
    charUTF8.const.p("entrypoint")
    SDL_GPUShaderFormat("format")
    SDL_GPUShaderStage("stage")
    Uint32("num_samplers")
    Uint32("num_storage_textures")
    Uint32("num_storage_buffers")
    Uint32("num_uniform_buffers")
    SDL_PropertiesID("props")
}

val SDL_GPUTextureCreateInfo = struct(Module.SDL, "SDL_GPUTextureCreateInfo") {
    SDL_GPUTextureType("type")
    SDL_GPUTextureFormat("format")
    SDL_GPUTextureUsageFlags("usage")
    Uint32("width")
    Uint32("height")
    Uint32("layer_count_or_depth")
    Uint32("num_levels")
    SDL_GPUSampleCount("sample_count")
    SDL_PropertiesID("props")
}

val SDL_GPUBufferCreateInfo = struct(Module.SDL, "SDL_GPUBufferCreateInfo") {
    SDL_GPUBufferUsageFlags("usage")
    Uint32("size")
    SDL_PropertiesID("props")
}

val SDL_GPUTransferBufferCreateInfo = struct(Module.SDL, "SDL_GPUTransferBufferCreateInfo") {
    SDL_GPUTransferBufferUsage("usage")
    Uint32("size")
    SDL_PropertiesID("props")
}

val SDL_GPURasterizerState = struct(Module.SDL, "SDL_GPURasterizerState") {
    SDL_GPUFillMode("fill_mode")
    SDL_GPUCullMode("cull_mode")
    SDL_GPUFrontFace("front_face")
    float("depth_bias_constant_factor")
    float("depth_bias_clamp")
    float("depth_bias_slope_factor")
    bool("enable_depth_bias")
    bool("enable_depth_clip")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_GPUMultisampleState = struct(Module.SDL, "SDL_GPUMultisampleState") {
    SDL_GPUSampleCount("sample_count")
    Uint32("sample_mask")
    bool("enable_mask")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_GPUDepthStencilState = struct(Module.SDL, "SDL_GPUDepthStencilState") {
    SDL_GPUCompareOp("compare_op")
    SDL_GPUStencilOpState("back_stencil_state")
    SDL_GPUStencilOpState("front_stencil_state")
    Uint8("compare_mask")
    Uint8("write_mask")
    bool("enable_depth_test")
    bool("enable_depth_write")
    bool("enable_stencil_test")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_GPUColorTargetDescription = struct(Module.SDL, "SDL_GPUColorTargetDescription") {
    SDL_GPUTextureFormat("format")
    SDL_GPUColorTargetBlendState("blend_state")
}

val SDL_GPUGraphicsPipelineTargetInfo = struct(Module.SDL, "SDL_GPUGraphicsPipelineTargetInfo") {
    nullable..SDL_GPUColorTargetDescription.const.p("color_target_descriptions")
    AutoSize("color_target_descriptions")..Uint32("num_color_targets")
    SDL_GPUTextureFormat("depth_stencil_format")
    bool("has_depth_stencil_target")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_GPUGraphicsPipelineCreateInfo = struct(Module.SDL, "SDL_GPUGraphicsPipelineCreateInfo") {
    nullable..SDL_GPUShader.p("vertex_shader")
    nullable..SDL_GPUShader.p("fragment_shader")
    SDL_GPUVertexInputState("vertex_input_state")
    SDL_GPUPrimitiveType("primitive_type")
    SDL_GPURasterizerState("rasterizer_state")
    SDL_GPUMultisampleState("multisample_state")
    SDL_GPUDepthStencilState("depth_stencil_state")
    SDL_GPUGraphicsPipelineTargetInfo("target_info")
    SDL_PropertiesID("props")
}

val SDL_GPUComputePipelineCreateInfo = struct(Module.SDL, "SDL_GPUComputePipelineCreateInfo") {
    AutoSize("code")..size_t("code_size")
    Uint8.const.p("code")
    charUTF8.const.p("entrypoint")
    SDL_GPUShaderFormat("format")
    Uint32("num_samplers")
    Uint32("num_readonly_storage_textures")
    Uint32("num_readonly_storage_buffers")
    Uint32("num_readwrite_storage_textures")
    Uint32("num_readwrite_storage_buffers")
    Uint32("num_uniform_buffers")
    Uint32("threadcount_x")
    Uint32("threadcount_y")
    Uint32("threadcount_z")
    SDL_PropertiesID("props")
}

val SDL_GPUColorTargetInfo = struct(Module.SDL, "SDL_GPUColorTargetInfo") {
    SDL_GPUTexture.p("texture")
    Uint32("mip_level")
    Uint32("layer_or_depth_plane")
    SDL_FColor("clear_color")
    SDL_GPULoadOp("load_op")
    SDL_GPUStoreOp("store_op")
    nullable..SDL_GPUTexture.p("resolve_texture")
    Uint32("resolve_mip_level")
    Uint32("resolve_layer")
    bool("cycle")
    bool("cycle_resolve_texture")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_GPUDepthStencilTargetInfo = struct(Module.SDL, "SDL_GPUDepthStencilTargetInfo") {
    SDL_GPUTexture.p("texture")
    float("clear_depth")
    SDL_GPULoadOp("load_op")
    SDL_GPUStoreOp("store_op")
    SDL_GPULoadOp("stencil_load_op")
    SDL_GPUStoreOp("stencil_store_op")
    bool("cycle")
    Uint8("clear_stencil")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_GPUBlitInfo = struct(Module.SDL, "SDL_GPUBlitInfo") {
    SDL_GPUBlitRegion("source")
    SDL_GPUBlitRegion("destination")
    SDL_GPULoadOp("load_op")
    SDL_FColor("clear_color")
    SDL_FlipMode("flip_mode")
    SDL_GPUFilter("filter")
    bool("cycle")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_GPUBufferBinding = struct(Module.SDL, "SDL_GPUBufferBinding") {
    SDL_GPUBuffer.p("buffer")
    Uint32("offset")
}

val SDL_GPUTextureSamplerBinding = struct(Module.SDL, "SDL_GPUTextureSamplerBinding") {
    SDL_GPUTexture.p("texture")
    SDL_GPUSampler.p("sampler")
}

val SDL_GPUStorageBufferReadWriteBinding = struct(Module.SDL, "SDL_GPUStorageBufferReadWriteBinding") {
    SDL_GPUBuffer.p("buffer")
    bool("cycle")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_GPUStorageTextureReadWriteBinding = struct(Module.SDL, "SDL_GPUStorageTextureReadWriteBinding") {
    SDL_GPUTexture.p("texture")
    Uint32("mip_level")
    Uint32("layer")
    bool("cycle")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

// SDL_events.h (last, because it uses types from almost all other headers)
val SDL_EventAction = "SDL_EventAction".enumType
val SDL_EventType = "SDL_EventType".enumType

val SDL_CommonEvent = struct(Module.SDL, "SDL_CommonEvent") {
    Uint32("type")
    Uint32("reserved").private()
    Uint64("timestamp")
}

val SDL_DisplayEvent = struct(Module.SDL, "SDL_DisplayEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_DisplayID("displayID")
    Sint32("data1")
    Sint32("data2")
}

val SDL_WindowEvent = struct(Module.SDL, "SDL_WindowEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    Sint32("data1")
    Sint32("data2")
}

val SDL_KeyboardDeviceEvent = struct(Module.SDL, "SDL_KeyboardDeviceEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_KeyboardID("which")
}

val SDL_KeyboardEvent = struct(Module.SDL, "SDL_KeyboardEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_KeyboardID("which")
    SDL_Scancode("scancode")
    SDL_Keycode("key")
    SDL_Keymod("mod")
    Uint16("raw")
    bool("down")
    bool("repeat")
}

val SDL_TextEditingEvent = struct(Module.SDL, "SDL_TextEditingEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    nullable..charUTF8.const.p("text")
    Sint32("start")
    Sint32("length")
}

val SDL_TextEditingCandidatesEvent = struct(Module.SDL, "SDL_TextEditingCandidatesEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    nullable..charUTF8.const.p.const.p("candidates")
    AutoSize("candidates")..Sint32("num_candidates")
    Sint32("selected_candidate")
    bool("horizontal")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_TextInputEvent = struct(Module.SDL, "SDL_TextInputEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    nullable..charUTF8.const.p("text")
}

val SDL_MouseDeviceEvent = struct(Module.SDL, "SDL_MouseDeviceEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_MouseID("which")
}

val SDL_MouseMotionEvent = struct(Module.SDL, "SDL_MouseMotionEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_MouseID("which")
    SDL_MouseButtonFlags("state")
    float("x")
    float("y")
    float("xrel")
    float("yrel")
}

val SDL_MouseButtonEvent = struct(Module.SDL, "SDL_MouseButtonEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_MouseID("which")
    Uint8("button")
    bool("down")
    Uint8("clicks")
    Uint8("padding").private()
    float("x")
    float("y")
}

val SDL_MouseWheelEvent = struct(Module.SDL, "SDL_MouseWheelEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_MouseID("which")
    float("x")
    float("y")
    SDL_MouseWheelDirection("direction")
    float("mouse_x")
    float("mouse_y")
    Sint32("integer_x")
    Sint32("integer_y")
}

val SDL_JoyAxisEvent = struct(Module.SDL, "SDL_JoyAxisEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Uint8("axis")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
    Sint16("value")
    Uint16("padding4").private()
}

val SDL_JoyBallEvent = struct(Module.SDL, "SDL_JoyBallEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Uint8("ball")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
    Sint16("xrel")
    Sint16("yrel")
}

val SDL_JoyHatEvent = struct(Module.SDL, "SDL_JoyHatEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Uint8("hat")
    Uint8("value")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_JoyButtonEvent = struct(Module.SDL, "SDL_JoyButtonEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Uint8("button")
    bool("down")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_JoyDeviceEvent = struct(Module.SDL, "SDL_JoyDeviceEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
}

val SDL_JoyBatteryEvent = struct(Module.SDL, "SDL_JoyBatteryEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    SDL_PowerState("state")
    int("percent")
}

val SDL_GamepadAxisEvent = struct(Module.SDL, "SDL_GamepadAxisEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Uint8("axis")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
    Sint16("value")
    Uint16("padding4").private()
}

val SDL_GamepadButtonEvent = struct(Module.SDL, "SDL_GamepadButtonEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Uint8("button")
    bool("down")
    Uint8("padding1").private()
    Uint8("padding2").private()
}

val SDL_GamepadDeviceEvent = struct(Module.SDL, "SDL_GamepadDeviceEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
}

val SDL_GamepadTouchpadEvent = struct(Module.SDL, "SDL_GamepadTouchpadEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Sint32("touchpad")
    Sint32("finger")
    float("x")
    float("y")
    float("pressure")
}

val SDL_GamepadSensorEvent = struct(Module.SDL, "SDL_GamepadSensorEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_JoystickID("which")
    Sint32("sensor")
    float("data")[3]
    Uint64("sensor_timestamp")
}

val SDL_AudioDeviceEvent = struct(Module.SDL, "SDL_AudioDeviceEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_AudioDeviceID("which")
    bool("recording")
    Uint8("padding1").private()
    Uint8("padding2").private()
    Uint8("padding3").private()
}

val SDL_CameraDeviceEvent = struct(Module.SDL, "SDL_CameraDeviceEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_CameraID("which")
}

val SDL_RenderEvent = struct(Module.SDL, "SDL_RenderEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
}

val SDL_TouchFingerEvent = struct(Module.SDL, "SDL_TouchFingerEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_TouchID("touchID")
    SDL_FingerID("fingerID")
    float("x")
    float("y")
    float("dx")
    float("dy")
    float("pressure")
    SDL_WindowID("windowID")
}

val SDL_PenProximityEvent = struct(Module.SDL, "SDL_PenProximityEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_PenID("which")
}

val SDL_PenMotionEvent = struct(Module.SDL, "SDL_PenMotionEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_PenID("which")
    SDL_PenInputFlags("pen_state")
    float("x")
    float("y")
}

val SDL_PenTouchEvent = struct(Module.SDL, "SDL_PenTouchEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_PenID("which")
    SDL_PenInputFlags("pen_state")
    float("x")
    float("y")
    bool("eraser")
    bool("down")
}

val SDL_PenButtonEvent = struct(Module.SDL, "SDL_PenButtonEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_PenID("which")
    SDL_PenInputFlags("pen_state")
    float("x")
    float("y")
    Uint8("button")
    bool("down")
}

val SDL_PenAxisEvent = struct(Module.SDL, "SDL_PenAxisEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    SDL_PenID("which")
    SDL_PenInputFlags("pen_state")
    float("x")
    float("y")
    SDL_PenAxis("axis")
    float("value")
}

val SDL_DropEvent = struct(Module.SDL, "SDL_DropEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    float("x")
    float("y")
    nullable..charUTF8.const.p("source")
    nullable..charUTF8.const.p("data")
}

val SDL_ClipboardEvent = struct(Module.SDL, "SDL_ClipboardEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    bool("owner")
    AutoSize("mime_types")..Sint32("num_mime_types")
    nullable..charUTF8.const.p.p("mime_types")
}

val SDL_SensorEvent = struct(Module.SDL, "SDL_SensorEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_SensorID("which")
    float("data")[6]
    Uint64("sensor_timestamp")
}

val SDL_QuitEvent = struct(Module.SDL, "SDL_QuitEvent") {
    SDL_EventType("type")
    Uint32("reserved").private()
    Uint64("timestamp")
}

val SDL_UserEvent = struct(Module.SDL, "SDL_UserEvent") {
    Uint32("type")
    Uint32("reserved").private()
    Uint64("timestamp")
    SDL_WindowID("windowID")
    Sint32("code")
    nullable..opaque_p("data1")
    nullable..opaque_p("data2")
}

val SDL_Event = union(Module.SDL, "SDL_Event") {
    Uint32("type")
    SDL_CommonEvent("common")
    SDL_DisplayEvent("display")
    SDL_WindowEvent("window")
    SDL_KeyboardDeviceEvent("kdevice")
    SDL_KeyboardEvent("key")
    SDL_TextEditingEvent("edit")
    SDL_TextEditingCandidatesEvent("edit_candidates")
    SDL_TextInputEvent("text")
    SDL_MouseDeviceEvent("mdevice")
    SDL_MouseMotionEvent("motion")
    SDL_MouseButtonEvent("button")
    SDL_MouseWheelEvent("wheel")
    SDL_JoyDeviceEvent("jdevice")
    SDL_JoyAxisEvent("jaxis")
    SDL_JoyBallEvent("jball")
    SDL_JoyHatEvent("jhat")
    SDL_JoyButtonEvent("jbutton")
    SDL_JoyBatteryEvent("jbattery")
    SDL_GamepadDeviceEvent("gdevice")
    SDL_GamepadAxisEvent("gaxis")
    SDL_GamepadButtonEvent("gbutton")
    SDL_GamepadTouchpadEvent("gtouchpad")
    SDL_GamepadSensorEvent("gsensor")
    SDL_AudioDeviceEvent("adevice")
    SDL_CameraDeviceEvent("cdevice")
    SDL_SensorEvent("sensor")
    SDL_QuitEvent("quit")
    SDL_UserEvent("user")
    SDL_TouchFingerEvent("tfinger")
    SDL_PenProximityEvent("pproximity")
    SDL_PenTouchEvent("ptouch")
    SDL_PenMotionEvent("pmotion")
    SDL_PenButtonEvent("pbutton")
    SDL_PenAxisEvent("paxis")
    SDL_RenderEvent("render")
    SDL_DropEvent("drop")
    SDL_ClipboardEvent("clipboard")
    Uint8("padding")[128].private()
}

val SDL_EventFilter = Module.SDL.callback {
    bool(
        "SDL_EventFilter",

        nullable..opaque_p("userdata"),
        SDL_Event.p("event"),

        nativeType = "SDL_EventFilter"
    )
}
