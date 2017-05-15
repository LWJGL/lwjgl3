/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*

val GLFW = "GLFW".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW", binding = GLFW_BINDING) {
    documentation =
        """
        Native bindings to the ${url("http://www.glfw.org/docs/latest/", "GLFW")} library.

        GLFW is a free, Open Source, multi-platform library for opening a window, creating an OpenGL context and managing input. It is easy to integrate into
        existing applications and does not lay claim to the main loop.
        """

    IntConstant(
        "The major version number of the GLFW library. This is incremented when the API is changed in non-compatible ways.",

        "VERSION_MAJOR".."3"
    )

    IntConstant(
        "The minor version number of the GLFW library. This is incremented when features are added to the API but it remains backward-compatible.",

        "VERSION_MINOR".."3"
    )

    IntConstant(
        "The revision number of the GLFW library. This is incremented when a bug fix release is made that does not contain any API changes.",

        "VERSION_REVISION".."0"
    )

    IntConstant(
        "Boolean values.",
        "TRUE".."1",
        "FALSE".."0"
    )

    IntConstant(
        "The key or button was released.",

        "RELEASE".."0"
    )

    IntConstant(
        "The key or button was pressed.",

        "PRESS".."1"
    )

    IntConstant(
        "The key was held down until it repeated.",

        "REPEAT".."2"
    )

    IntConstant(
        "Joystick hat states.",

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
        "The unknown key.",

        "KEY_UNKNOWN".."-1"
    )

    IntConstant(
        "Printable keys.",

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
        "Function keys.",

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
        "If this bit is set one or more Shift keys were held down.",

        "MOD_SHIFT"..0x0001
    )

    IntConstant(
        "If this bit is set one or more Control keys were held down.",

        "MOD_CONTROL"..0x0002
    )

    IntConstant(
        "If this bit is set one or more Alt keys were held down.",

        "MOD_ALT"..0x0004
    )

    IntConstant(
        "If this bit is set one or more Super keys were held down.",

        "MOD_SUPER"..0x0008
    )

    IntConstant(
        """Mouse buttons. See ${url("http://www.glfw.org/docs/latest/input.html\\#input_mouse_button", "mouse button input")} for how these are used.""",

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
        """Joysticks. See ${url("http://www.glfw.org/docs/latest/input.html\\#joystick", "joystick input")} for how these are used.""",

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

    EnumConstant(
        "Error codes.",

        "NO_ERROR".enum("No error has occurred.", "0"),
        "NOT_INITIALIZED".enum(
            """
            GLFW has not been initialized.

            This occurs if a GLFW function was called that may not be called unless the library is initialized.
            """,
            0x00010001
        ),
        "NO_CURRENT_CONTEXT".enum(
            """
            No context is current for this thread.

            This occurs if a GLFW function was called that needs and operates on the current OpenGL or OpenGL ES context but no context is current on the
            calling thread. One such function is #SwapInterval().
            """,
            0x00010002
        ),
        "INVALID_ENUM".enum(
            """
            One of the arguments to the function was an invalid enum value.

            One of the arguments to the function was an invalid enum value, for example requesting #RED_BITS with #GetWindowAttrib().
            """,
            0x00010003
        ),
        "INVALID_VALUE".enum(
            """
            One of the arguments to the function was an invalid value.

            One of the arguments to the function was an invalid value, for example requesting a non-existent OpenGL or OpenGL ES version like 2.7.

            Requesting a valid but unavailable OpenGL or OpenGL ES version will instead result in a #VERSION_UNAVAILABLE error.
            """,
            0x00010004
        ),
        "OUT_OF_MEMORY".enum(
            """
            A memory allocation failed.

            A bug in GLFW or the underlying operating system. Report the bug to our ${url("https://github.com/glfw/glfw/issues", "issue tracker")}.
            """,
            0x00010005
        ),
        "API_UNAVAILABLE".enum(
            """
            GLFW could not find support for the requested API on the system.

            The installed graphics driver does not support the requested API, or does not support it via the chosen context creation backend. Below are a few
            examples:

            Some pre-installed Windows graphics drivers do not support OpenGL. AMD only supports OpenGL ES via EGL, while Nvidia and Intel only support it via
            a WGL or GLX extension. macOS does not provide OpenGL ES at all. The Mesa EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia
            binary driver. Older graphics drivers do not support Vulkan.
            """,
            0x00010006
        ),
        "VERSION_UNAVAILABLE".enum(
            """
            The requested OpenGL or OpenGL ES version (including any requested context or framebuffer hints) is not available on this machine.

            The machine does not support your requirements. If your application is sufficiently flexible, downgrade your requirements and try again. Otherwise,
            inform the user that their machine does not match your requirements.

            Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0 comes out before the 4.x series gets that far, also fail with this
            error and not #INVALID_VALUE, because GLFW cannot know what future versions will exist.
            """,
            0x00010007
        ),
        "PLATFORM_ERROR".enum(
            """
            A platform-specific error occurred that does not match any of the more specific categories.

            A bug or configuration error in GLFW, the underlying operating system or its drivers, or a lack of required resources. Report the issue to our
            ${url("https://github.com/glfw/glfw/issues", "issue tracker")}.
            """,
            0x00010008
        ),
        "FORMAT_UNAVAILABLE".enum(
            """
            The requested format is not supported or available.

            If emitted during window creation, one or more hard constraints did not match any of the available pixel formats. If your application is
            sufficiently flexible, downgrade your requirements and try again. Otherwise, inform the user that their machine does not match your requirements.

            If emitted when querying the clipboard, ignore the error or report it to the user, as appropriate.
            """,
            0x00010009
        ),
        "NO_WINDOW_CONTEXT".enum(
            """
            The specified window does not have an OpenGL or OpenGL ES context.

            A window that does not have an OpenGL or OpenGL ES context was passed to a function that requires it to have one.

            Application programmer error. Fix the offending call.
            """,
            0x0001000A
        )
    )

    val WindowHints = EnumConstant(
        "Window attributes.",

        "FOCUSED".enum(
            """
            {@code WindowHint}: Specifies whether the windowed mode window will be given input focus when created. This hint is ignored for full screen and
            initially hidden windows.

            {@code GetWindowAttrib}: Indicates whether the specified window has input focus.
            """,
            0x00020001
        ),
        "ICONIFIED".enum("{@code GetWindowAttrib}: Indicates whether the specified window is iconified, whether by the user or with #IconifyWindow().", 0x00020002),
        "RESIZABLE".enum(
            """
            {@code WindowHint}: Specifies whether the windowed mode window will be resizable <i>by the user</i>. The window will still be resizable using the
            #SetWindowSize() function. This hint is ignored for full screen windows.

            {@code GetWindowAttrib}: Indicates whether the specified window is resizable <i>by the user</i>.
            """,
            0x00020003),
        "VISIBLE".enum(
            """
            {@code WindowHint}: Specifies whether the windowed mode window will be initially visible. This hint is ignored for full screen windows. Windows created
            hidden are completely invisible to the user until shown. This can be useful if you need to set up your window further before showing it, for
            example moving it to a specific location.

            {@code GetWindowAttrib}: Indicates whether the specified window is visible. Window visibility can be controlled with #ShowWindow() and #HideWindow().
            """,
            0x00020004),
        "DECORATED".enum(
            """
            {@code WindowHint}: Specifies whether the windowed mode window will have window decorations such as a border, a close widget, etc. An undecorated window
            may still allow the user to generate close events on some platforms. This hint is ignored for full screen windows.

            {@code GetWindowAttrib}: Indicates whether the specified window has decorations such as a border, a close widget, etc.
            """,
            0x00020005),
        "AUTO_ICONIFY".enum(
            """
            {@code WindowHint}: Specifies whether the full screen window will automatically iconify and restore the previous video mode on input focus loss. This
            hint is ignored for windowed mode windows.
            """,
            0x00020006),
        "FLOATING".enum(
            """
            {@code WindowHint}: Specifies whether the windowed mode window will be floating above other regular windows, also called topmost or always-on-top. This
            is intended primarily for debugging purposes and cannot be used to implement proper full screen windows. This hint is ignored for full screen
            windows.

            {@code GetWindowAttrib}: Indicates whether the specified window is floating, also called topmost or always-on-top.
            """,
            0x00020007),
        "MAXIMIZED".enum(
            """
            {@code WindowHint}: Specifies whether the windowed mode window will be maximized when created. This hint is ignored for full screen windows.

            {@code GetWindowAttrib}: Indicates whether the specified window is maximized, whether by the user or #MaximizeWindow().
            """,
            0x00020008),
        "CENTER_CURSOR".enum(
            """
            {@code WindowHint}: Specifies whether the cursor should be centered over newly created full screen windows. This hint is ignored for windowed mode
            windows.
            """,
            0x00020009)
    ).javaDocLinks

    IntConstant(
        "Input options.",

        "CURSOR"..0x00033001,
        "STICKY_KEYS"..0x00033002,
        "STICKY_MOUSE_BUTTONS"..0x00033003
    )

    IntConstant(
        "Cursor state.",

        "CURSOR_NORMAL"..0x00034001,
        "CURSOR_HIDDEN"..0x00034002,
        "CURSOR_DISABLED"..0x00034003
    )

    val CursorShapes = IntConstant(
        """Standard cursor shapes. See ${url("http://www.glfw.org/docs/latest/input.html\\#cursor_standard", "standard cursor creation")} for how these are used.""",

        "ARROW_CURSOR"..0x00036001,
        "IBEAM_CURSOR"..0x00036002,
        "CROSSHAIR_CURSOR"..0x00036003,
        "HAND_CURSOR"..0x00036004,
        "HRESIZE_CURSOR"..0x00036005,
        "VRESIZE_CURSOR"..0x00036006
    ).javaDocLinks

    IntConstant(
        "Monitor events.",

        "CONNECTED"..0x00040001,
        "DISCONNECTED"..0x00040002
    )

    val InitHints = IntConstant(
        "Init hints.",

        "JOYSTICK_HAT_BUTTONS"..0x00050001,

        "COCOA_CHDIR_RESOURCES"..0x00051001,
        "COCOA_MENUBAR"..0x00051002
    ).javaDocLinks

    IntConstant(
        "Don't care value.",

        "DONT_CARE".."-1"
    )

    // [ OpenGL ]

    val PixelFormatHints = IntConstant(
        "PixelFormat hints.",

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
    ).javaDocLinks

    val ClientAPIHints = EnumConstant(
        "Client API hints.",

        "CLIENT_API".enum(
            """
            {@code WindowHint}: Specifies which client API to create the context for. Possible values are #OPENGL_API, #OPENGL_ES_API and #NO_API. This is a hard
            constraint.

            {@code GetWindowAttrib}: Indicates the client API provided by the window's context; either #OPENGL_API, #OPENGL_ES_API or #NO_API.
            """,
            0x00022001
        ),
        "CONTEXT_VERSION_MAJOR".enum(
            """
            {@code WindowHint}: Specifies the client API major version that the created context must be compatible with. The exact behavior of this hint depends on
            the requested client API.

            ${note(ul(
                """
                While there is no way to ask the driver for a context of the highest supported version, GLFW will attempt to provide this when you ask for a
                version 1.0 context, which is the default for these hints.
                """,
                """
                <b>OpenGL</b>: #CONTEXT_VERSION_MAJOR and #CONTEXT_VERSION_MINOR are not hard constraints, but creation will fail if the OpenGL version of the
                created context is less than the one requested. It is therefore perfectly safe to use the default of version 1.0 for legacy code and you will
                still get backwards-compatible contexts of version 3.0 and above when available.
                """,
                """
                <b>OpenGL ES</b>: #CONTEXT_VERSION_MAJOR and #CONTEXT_VERSION_MINOR are not hard constraints, but creation will fail if the OpenGL ES version
                of the created context is less than the one requested. Additionally, OpenGL ES 1.x cannot be returned if 2.0 or later was requested, and vice
                versa. This is because OpenGL ES 3.x is backward compatible with 2.0, but OpenGL ES 2.0 is not backward compatible with 1.x.
                """
            ))}

            {@code GetWindowAttrib}: Indicate the client API major version of the window's context.
            """,
            0x00022002
        ),
        "CONTEXT_VERSION_MINOR".enum(
            """
            {@code WindowHint}: Specifies the client API minor version that the created context must be compatible with. The exact behavior of this hint depends on
            the requested client API.

            {@code GetWindowAttrib}: Indicate the client API minor version of the window's context.
            """,
            0x00022003
        ),
        "CONTEXT_REVISION".enum("{@code GetWindowAttrib}: Indicates the client API version of the window's context.", 0x00022004),
        "CONTEXT_ROBUSTNESS".enum(
            """
            {@code WindowHint}: Specifies the robustness strategy to be used by the context. This can be one of #NO_RESET_NOTIFICATION or #LOSE_CONTEXT_ON_RESET, or
            #NO_ROBUSTNESS to not request a robustness strategy.

            {@code GetWindowAttrib}: Indicates the robustness strategy used by the context. This is #LOSE_CONTEXT_ON_RESET or #NO_RESET_NOTIFICATION if the window's
            context supports robustness, or #NO_ROBUSTNESS otherwise.
            """,
            0x00022005
        ),
        "OPENGL_FORWARD_COMPAT".enum(
            """
            {@code WindowHint}: Specifies whether the OpenGL context should be forward-compatible, i.e. one where all functionality deprecated in the requested
            version of OpenGL is removed. This must only be used if the requested OpenGL version is 3.0 or above. If OpenGL ES is requested, this hint is
            ignored.

            {@code GetWindowAttrib}: Indicates if the window's context is an OpenGL forward-compatible one.
            """,
            0x00022006
        ),
        "OPENGL_DEBUG_CONTEXT".enum(
            """
            {@code WindowHint}: Specifies whether to create a debug OpenGL context, which may have additional error and performance issue reporting functionality.
            If OpenGL ES is requested, this hint is ignored.

            {@code GetWindowAttrib}: Indicates if the window's context is an OpenGL debug context.
            """,
            0x00022007
        ),
        "OPENGL_PROFILE".enum(
            """
            {@code WindowHint}: Specifies which OpenGL profile to create the context for. Possible values are one of #OPENGL_CORE_PROFILE or #OPENGL_COMPAT_PROFILE,
            or #OPENGL_ANY_PROFILE to not request a specific profile. If requesting an OpenGL version below 3.2, #OPENGL_ANY_PROFILE must be used. If OpenGL ES
            is requested, this hint is ignored.

            {@code GetWindowAttrib}: Indicates the OpenGL profile used by the context. This is #OPENGL_CORE_PROFILE or #OPENGL_COMPAT_PROFILE if the context uses a
            known profile, or #OPENGL_ANY_PROFILE if the OpenGL profile is unknown or the context is an OpenGL ES context. Note that the returned profile may
            not match the profile bits of the context flags, as GLFW will try other means of detecting the profile when no bits are set.
            """,
            0x00022008
        ),
        "CONTEXT_RELEASE_BEHAVIOR".enum(
            """
            {@code WindowHint}: Specifies the release behavior to be used by the context. If the behavior is #ANY_RELEASE_BEHAVIOR, the default behavior of the
            context creation API will be used. If the behavior is #RELEASE_BEHAVIOR_FLUSH, the pipeline will be flushed whenever the context is released from
            being the current one. If the behavior is #RELEASE_BEHAVIOR_NONE, the pipeline will not be flushed on release.
            """,
            0x00022009
        ),
        "CONTEXT_NO_ERROR".enum(
            """
            {@code WindowHint}: Specifies whether errors should be generated by the context. If enabled, situations that would have generated errors instead cause
            undefined behavior.
            """,
            0x0002200A
        ),
        "CONTEXT_CREATION_API".enum(
            """
            {@code WindowHint}: Specifies which context creation API to use to create the context. Possible values are #NATIVE_CONTEXT_API and #EGL_CONTEXT_API.
            This is a hard constraint. If no client API is requested, this hint is ignored.

            ${note(ul(
                "<b>macOS</b>: The EGL API is not available on this platform and requests to use it will fail.",
                "<b>Wayland, Mir</b>: The EGL API <i>is</i> the native context creation API, so this hint will have no effect.",
                """
                An OpenGL extension loader library that assumes it knows which context creation API is used on a given platform may fail if you change this
                hint. This can be resolved by having it load via #GetProcAddress(), which always uses the selected API.
                """
            ))}

            {@code GetWindowAttrib}: Indicates the context creation API used to create the window's context; either #NATIVE_CONTEXT_API or #EGL_CONTEXT_API.
            """,
            0x0002200B
        )
    ).javaDocLinks

    IntConstant(
        "Specifies whether to use full resolution framebuffers on Retina displays. This is ignored on other platforms.",

        "COCOA_RETINA_FRAMEBUFFER"..0x00023001
    )

    IntConstant(
        "Specifies whether to activate frame autosaving on macOS. This is ignored on other platforms.",

        "COCOA_FRAME_AUTOSAVE"..0x00023002
    )

    IntConstant(
        """
        Specifies whether to enable Automatic Graphics Switching, i.e. to allow the system to choose the integrated GPU for the OpenGL context and move it
        between GPUs if necessary or whether to force it to always run on the discrete GPU. This only affects systems with both integrated and discrete GPUs.
        This is ignored on other platforms.
        """,

        "COCOA_GRAPHICS_SWITCHING"..0x00023003
    )

    val ClientAPIValues = IntConstant(
        "Values for the #CLIENT_API hint.",

        "NO_API".."0",
        "OPENGL_API"..0x00030001,
        "OPENGL_ES_API"..0x00030002
    ).javaDocLinks

    val ContextRobustnessValues = IntConstant(
        "Values for the #CONTEXT_ROBUSTNESS hint.",

        "NO_ROBUSTNESS".."0",
        "NO_RESET_NOTIFICATION"..0x00031001,
        "LOSE_CONTEXT_ON_RESET"..0x00031002
    ).javaDocLinks

    val OpenGLProfileValues = IntConstant(
        "Values for the #OPENGL_PROFILE hint.",

        "OPENGL_ANY_PROFILE".."0",
        "OPENGL_CORE_PROFILE"..0x00032001,
        "OPENGL_COMPAT_PROFILE"..0x00032002
    ).javaDocLinks

    val ContextReleaseBehaviorValues = IntConstant(
        "Values for the #CONTEXT_RELEASE_BEHAVIOR hint.",

        "ANY_RELEASE_BEHAVIOR".."0",
        "RELEASE_BEHAVIOR_FLUSH"..0x00035001,
        "RELEASE_BEHAVIOR_NONE"..0x00035002
    ).javaDocLinks

    val ContextCreationAPIValues = IntConstant(
        "Values for the #CONTEXT_CREATION_API hint.",

        "NATIVE_CONTEXT_API"..0x00036001,
        "EGL_CONTEXT_API"..0x00036002,
        "OSMESA_CONTEXT_API"..0x00036003
    ).javaDocLinks

    intb(
        "Init",
        """
        Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before an application terminates GLFW should be
        terminated in order to free any resources allocated during or after initialization.

        If this function fails, it calls #Terminate() before returning. If it succeeds, you should call #Terminate() before the application exits.

        Additional calls to this function after successful initialization but before termination will return #TRUE immediately.

        ${note(ul(
            "This function must only be called from the main thread.",
            """
            <b>macOS</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the application's
            bundle, if present. This can be disabled with the #COCOA_CHDIR_RESOURCES init hint.
            """
        ))}
        """,

        returnDoc = "#TRUE if successful, or #FALSE if an error occured.",
        since = "version 1.0"
    )

    void(
        "Terminate",
        """
        Destroys all remaining windows and cursors, restores any modified gamma ramps and frees any other allocated resources. Once this function is called, you
        must again call #Init() successfully before you will be able to use most GLFW functions.

        If GLFW has been successfully initialized, this function should be called before the application exits. If initialization fails, there is no need to
        call this function, as it is called by #Init() before it returns failure.

        ${note(ul(
            "This function may be called before #Init().",
            "This function must only be called from the main thread.",
            "This function must not be called from a callback.",
            "No window's context may be current on another thread when this function is called."
        ))}
        """,
        since = "version 1.0"
    )

    void(
        "InitHint",
        """
        Sets the specified init hint to the desired value.

        This function sets hints for the next initialization of GLFW.

        The values you set are not affected by initialization or termination, but they are only read during initialization. Once GLFW has been initialized,
        setting new hint values will not affect behavior until the next time the library is terminated and initialized.

        Some hints are platform specific. These are always valid to set on any platform but they will only affect their specific platform. Other platforms will
        simply ignore them. Setting these hints requires no platform specific headers or calls.

        ${note(ul(
            "This function may be called before #Init().",
            "This function must only be called from the main thread."
        ))}
        """,

        int.IN("hint", "the init hint to set", InitHints),
        int.IN("value", "the new value of the init hint"),

        since = "version 3.3"
    )

    void(
        "GetVersion",
        """
        Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
        that you are using the minimum required version.

        ${note(ul(
            "Any or all of the version arguments may be #NULL.",
            "This function always succeeds.",
            "This function may be called before #Init().",
            "This function may be called from any thread."
        ))}
        """,

        nullable..Check(1)..int_p.OUT("major", "where to store the major version number, or #NULL"),
        nullable..Check(1)..int_p.OUT("minor", "where to store the minor version number, or #NULL"),
        nullable..Check(1)..int_p.OUT("rev", "where to store the revision number, or #NULL"),
        since = "version 1.0"
    )

    const..charASCII_p(
        "GetVersionString",
        """
        Returns the compile-time generated version string of the GLFW library binary. It describes the version, platform, compiler and any platform-specific
        compile-time options. It should not be confused with the OpenGL or OpenGL ES version string, queried with {@code glGetString}.

        <b>Do not use the version string</b> to parse the GLFW library version. The #GetVersion() function already provides the version of the library binary
        in numerical format.

        ${note(ul(
            "This function always succeeds.",
            "This function may be called before #Init().",
            "This function may be called from any thread.",
            "The returned string is static and compile-time generated."
        ))}
        """,
        returnDoc = "the ASCII encoded GLFW version string",
        since = "version 3.0"
    )

    int(
        "GetError",
        """
        Returns and clears the last error for the calling thread.

        This function returns and clears the error code of the last error that occurred on the calling thread. If no error has occurred since the last call, it
        returns #NO_ERROR.

        ${note(ul(
            "This function may be called before #Init().",
            "This function may be called from any thread."
        ))}
        """,

        returnDoc = "the last error code for the calling thread, or #NO_ERROR",
        since = "version 3.3"
    )

    GLFWerrorfun(
        "SetErrorCallback",
        """
        Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.

        The error code is set before the callback is called. Calling #GetError() from the error callback will return the same value as the error code argument.

        The error callback is called on the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be
        written accordingly.

        Because the description string may have been generated specifically for that error, it is not guaranteed to be valid after the callback has returned. If
        you wish to use it after the callback returns, you need to make a copy.

        Once set, the error callback remains set even after the library has been terminated.

        ${note(ul(
            "This function may be called before #Init().",
            "This function must only be called from the main thread."
        ))}
        """,

        nullable..GLFWerrorfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 3.0"
    )

    GLFWmonitor_p(
        "GetMonitors",
        """
        Returns an array of handles for all currently connected monitors. The primary monitor is always first in the returned array. If no monitors were found,
        this function returns #NULL.

        The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
        changes or the library is terminated.

        This function must only be called from the main thread.
        """,

        AutoSizeResult..int_p.OUT("count", "where to store the number of monitors in the returned array. This is set to zero if an error occurred."),

        returnDoc = "an array of monitor handlers, or #NULL if no monitors were found or if an error occured",
        since = "version 3.0"
    )

    GLFWmonitor(
        "GetPrimaryMonitor",
        """
        Returns the primary monitor. This is usually the monitor where elements like the task bar or global menu bar are located.

        This function must only be called from the main thread.

        The primary monitor is always first in the array returned by #GetMonitors().
        """,

        returnDoc = "the primary monitor, or #NULL if no monitors were found or if an error occured",
        since = "version 3.0"
    )

    void(
        "GetMonitorPos",
        """
        Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.

        Any or all of the position arguments may be #NULL. If an error occurs, all non-#NULL position arguments will be set to zero.

        This function must only be called from the main thread.
        """,

        GLFWmonitor.IN("monitor", "the monitor to query"),
        nullable..Check(1)..int_p.OUT("xpos", "where to store the monitor x-coordinate, or #NULL"),
        nullable..Check(1)..int_p.OUT("ypos", "where to store the monitor y-coordinate, or #NULL"),
        since = "version 3.0"
    )

    void(
        "GetMonitorPhysicalSize",
        """
        Returns the size, in millimetres, of the display area of the specified monitor.

        Some systems do not provide accurate monitor size information, either because the monitor
        ${url("https://en.wikipedia.org/wiki/Extended_display_identification_data", "EDID")} data is incorrect or because the driver does not report it
        accurately.

        Any or all of the size arguments may be #NULL. If an error occurs, all non-#NULL size arguments will be set to zero.

        ${note(ul(
            "This function must only be called from the main thread.",
            """
            <b>Windows</b>: The OS calculates the returned physical size from the current resolution and system DPI instead of querying the monitor EDID data.
            """
        ))}
        """,

        GLFWmonitor.IN("monitor", "the monitor to query"),
        nullable..Check(1)..int_p.OUT("widthMM", "where to store the width, in millimetres, of the monitor's display area, or #NULL"),
        nullable..Check(1)..int_p.OUT("heightMM", "where to store the height, in millimetres, of the monitor's display area, or #NULL"),
        since = "version 3.0"
    )

    const..charUTF8_p(
        "GetMonitorName",
        """
        Returns a human-readable name, encoded as UTF-8, of the specified monitor. The name typically reflects the make and model of the monitor and is not
        guaranteed to be unique among the connected monitors.

        The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
        library is terminated.

        This function must only be called from the main thread.
        """,

        GLFWmonitor.IN("monitor", "the monitor to query"),

        returnDoc = "the UTF-8 encoded name of the monitor, or #NULL if an error occured",
        since = "version 3.0"
    )

    GLFWmonitorfun(
        "SetMonitorCallback",
        """
        Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
        system.

        This function must only be called from the main thread.
        """,

        nullable..GLFWmonitorfun.IN("cbfun", "the new callback, or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set or the library had not been initialized",
        since = "version 3.0"
    )

    const..GLFWvidmode_p(
        "GetVideoModes",
        """
        Returns an array of all video modes supported by the specified monitor. The returned array is sorted in ascending order, first by color bit depth (the
        sum of all channel depths) and then by resolution area (the product of width and height).

        The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected, this
        function is called again for that monitor or the library is terminated.

        This function must only be called from the main thread.
        """,

        GLFWmonitor.IN("monitor", "the monitor to query"),
        AutoSizeResult..int_p.OUT("count", "where to store the number of video modes in the returned array. This is set to zero if an error occurred."),

        returnDoc = "an array of video modes, or #NULL if an error occured",
        since = "version 1.0"
    )

    const..GLFWvidmode_p(
        "GetVideoMode",
        """
        Returns the current video mode of the specified monitor. If you have created a full screen window for that monitor, the return value will depend on
        whether that window is iconified.

        The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
        library is terminated.

          This function must only be called from the main thread.
        """,

        GLFWmonitor.IN("monitor", "the monitor to query"),

        returnDoc = "the current mode of the monitor, or #NULL if an error occurred",
        since = "version 3.0"
    )

    void(
        "SetGamma",
        """
        Generates a 256-element gamma ramp from the specified exponent and then calls #SetGammaRamp() with it. The value must be a finite number greater than
        zero.

        The software controlled gamma ramp is applied <em>in addition</em> to the hardware gamma correction, which today is usually an approximation of sRGB
        gamma. This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.

        For gamma correct rendering with OpenGL or OpenGL ES, see the #SRGB_CAPABLE hint.

        This function must only be called from the main thread.
        """,

        GLFWmonitor.IN("monitor", "the monitor whose gamma ramp to set"),
        float.IN("gamma", "the desired exponent"),
        since = "version 3.0"
    )

    const..GLFWgammaramp_p(
        "GetGammaRamp",
        """
        Returns the current gamma ramp of the specified monitor.

        The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. They are valid until the specified monitor is
        disconnected, this function is called again for that monitor or the library is terminated.

          This function must only be called from the main thread.
        """,

        GLFWmonitor.IN("monitor", "the monitor to query"),

        returnDoc = "the current gamma ramp, or #NULL if an error occurred",
        since = "version 3.0"
    )

    void(
        "SetGammaRamp",
        """
        Sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this function is called
        and is restored by #Terminate().

        The software controlled gamma ramp is applied <em>in addition</em> to the hardware gamma correction, which today is usually an approximation of sRGB
        gamma. This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.

        For gamma correct rendering with OpenGL or OpenGL ES, see the #SRGB_CAPABLE hint.

        ${note(ul(
            "This function must only be called from the main thread.",
            "Gamma ramp sizes other than 256 are not supported by all hardware",
            "<b>Windows</b>: The gamma ramp size must be 256.",
            "The specified gamma ramp is copied before this function returns."
        ))}
        """,

        GLFWmonitor.IN("monitor", "the monitor whose gamma ramp to set"),
        const..GLFWgammaramp_p.IN("ramp", "the gamma ramp to use"),
        since = "version 3.0"
    )

    void(
        "DefaultWindowHints",
        """
        Resets all window hints to their default values. See #WindowHint() for details.

        This function must only be called from the main thread.
        """,
        since = "version 3.0"
    )

    void(
        "WindowHint",
        """
        Sets hints for the next call to #CreateWindow(). The hints, once set, retain their values until changed by a call to glfwWindowHint or
        #DefaultWindowHints(), or until the library is terminated.

        This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
        call to #CreateWindow().

        <h5>Supported and default values</h5>
        ${table(
            tr(th("Name"), th("Default value"), th("Supported values")),

            tr(td("#RESIZABLE"), td("#TRUE"), td("#TRUE or #FALSE")),
            tr(td("#VISIBLE"), td("#TRUE"), td("#TRUE or #FALSE")),
            tr(td("#DECORATED"), td("#TRUE"), td("#TRUE or #FALSE")),
            tr(td("#FOCUSED"), td("#TRUE"), td("#TRUE or #FALSE")),
            tr(td("#AUTO_ICONIFY"), td("#TRUE"), td("#TRUE or #FALSE")),
            tr(td("#FLOATING"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#MAXIMIZED"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#CENTER_CURSOR"), td("#TRUE"), td("#TRUE or #FALSE")),

            tr(td("#RED_BITS"), td("8"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#GREEN_BITS"), td("8"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#BLUE_BITS"), td("8"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#ALPHA_BITS"), td("8"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#DEPTH_BITS"), td("24"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#STENCIL_BITS"), td("8"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#ACCUM_RED_BITS"), td("0"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#ACCUM_GREEN_BITS"), td("0"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#ACCUM_BLUE_BITS"), td("0"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#ACCUM_ALPHA_BITS"), td("0"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),
            tr(td("#AUX_BUFFERS"), td("0"), td("0 to Integer#MAX_VALUE")),
            tr(td("#SAMPLES"), td("0"), td("0 to Integer#MAX_VALUE")),
            tr(td("#REFRESH_RATE"), td("#DONT_CARE"), td("0 to Integer#MAX_VALUE or #DONT_CARE")),

            tr(td("#STEREO"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#SRGB_CAPABLE"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#DOUBLEBUFFER"), td("#TRUE"), td("#TRUE or #FALSE")),

            tr(td("#CLIENT_API"), td("#OPENGL_API"), td(ClientAPIValues)),
            tr(td("#CONTEXT_CREATION_API"), td("#NATIVE_CONTEXT_API"), td(ContextCreationAPIValues)),
            tr(td("#CONTEXT_VERSION_MAJOR"), td("1"), td("Any valid major version number of the chosen client API")),
            tr(td("#CONTEXT_VERSION_MINOR"), td("0"), td("Any valid minor version number of the chosen client API")),

            tr(td("#CONTEXT_ROBUSTNESS"), td("#NO_ROBUSTNESS"), td(ContextRobustnessValues)),
            tr(td("#CONTEXT_RELEASE_BEHAVIOR"), td("#ANY_RELEASE_BEHAVIOR"), td(ContextReleaseBehaviorValues)),
            tr(td("#CONTEXT_NO_ERROR"), td("#FALSE"), td("#TRUE or #FALSE")),

            tr(td("#OPENGL_FORWARD_COMPAT"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#OPENGL_DEBUG_CONTEXT"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#OPENGL_PROFILE"), td("#OPENGL_ANY_PROFILE"), td(OpenGLProfileValues)),

            tr(td("#COCOA_RETINA_FRAMEBUFFER"), td("#TRUE"), td("#TRUE or #FALSE")),
            tr(td("#COCOA_FRAME_AUTOSAVE"), td("#FALSE"), td("#TRUE or #FALSE")),
            tr(td("#COCOA_GRAPHICS_SWITCHING"), td("#FALSE"), td("#TRUE or #FALSE"))
        )}

        This function must only be called from the main thread.
        """,

        int.IN(
            "hint",
            "the window hint to set",
            "${WindowHints.replace("#ICONIFIED ", "")} ${ClientAPIHints.replace("#CONTEXT_REVISION ", "")} $PixelFormatHints #COCOA_RETINA_FRAMEBUFFER"
        ),
        int.IN("value", "the new value of the window hint"),
        since = "version 2.2"
    )

    Code(
        javaInit = statement("$t${t}EventLoop.OffScreen.check();")
    )..GLFWwindow(
        "CreateWindow",
        """
        Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
        specified with window hints.

        Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
        about the {@code share} parameter, see ${url("http://www.glfw.org/docs/latest/context.html\\#context_sharing", "context sharing")}.

        The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
        size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
        #GetWindowAttrib() and #GetWindowSize() and #GetFramebufferSize().

        To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
        Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
        query connected monitors, see ${url("http://www.glfw.org/docs/latest/monitor.html\\#monitor_monitors", "monitors")}.

        For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
        iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
        screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
        ${url("http://www.glfw.org/docs/latest/window.html\\#window_windowed_full_screen", "full screen")}.

        Once you have created the window, you can switch it between windowed and full screen mode with #SetWindowMonitor(). If the window has an OpenGL or
        OpenGL ES context, it will be unaffected.

        By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
        invisible using the #VISIBLE window hint, set its ${url("http://www.glfw.org/docs/latest/window.html\\#window_pos", "position")} and then
        ${url("http://www.glfw.org/docs/latest/window.html\\#window_hide", "show")} it.

        As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.

        Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
        actual ${url("http://www.glfw.org/docs/latest/window.html\\#window_size", "size")} after creation.

        The ${url("http://www.glfw.org/docs/latest/window.html\\#buffer_swap", "swap interval")} is not set during window creation and the initial value may vary
        depending on driver settings and defaults.

        ${note(ul(
            "This function must only be called from the main thread.",
            "<b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.",
            """
            <b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
            is present, the {@code IDI_WINLOGO} icon will be used instead. To set a different icon, see #SetWindowIcon().
            """,
            "<b>Windows</b>: The context to share resources with may not be current on any other thread.",
            """
            The OS only supports forward-compatible core profile contexts for OpenGL versions 3.2 and later. Before creating an OpenGL context of version 3.2
            or later you must set the #OPENGL_FORWARD_COMPAT and #OPENGL_PROFILE hints accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on
            macOS.
            """,
            """
            <b>macOS</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's icon. For
            more information on bundles, see the
            ${url("https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/", "Bundle Programming Guide")} in the Mac
            Developer Library.
            """,
            """
            <b>macOS</b>: The first time a window is created the menu bar is created. If GLFW finds a {@code `MainMenu.nib`} it is loaded and assumed to
            contain a menu bar. Otherwise a minimal menu bar is created manually with common commands like Hide, Quit and About. The About entry opens a
            minimal about dialog with information from the application's bundle. Menu bar creation can be disabled entirely with the #COCOA_MENUBAR init hint.
            """,
            """
            <b>macOS</b>: On macOS 10.10 and later the window frame will not be rendered at full resolution on Retina displays unless the
            #COCOA_RETINA_FRAMEBUFFER hint is #TRUE and the {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For
            more information, see ${url(
                "https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html",
                "High Resolution Guidelines for macOS")
            } in the Mac Developer Library.
            """,
            "When activating frame autosaving with #COCOA_FRAME_AUTOSAVE, the specified window size may be overriden by a previously saved size and position.",
            "<b>X11</b>: Some window managers will not respect the placement of initially hidden windows.",
            """
            <b>X11</b>: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able
            to query the final size, position or other attributes directly after window creation.
            """
        ))}
        """,

        int.IN("width", "the desired width, in screen coordinates, of the window"),
        int.IN("height", "the desired height, in screen coordinates, of the window"),
        const..charUTF8_p.IN("title", "initial, UTF-8 encoded window title"),
        nullable..GLFWmonitor.IN("monitor", "the monitor to use for fullscreen mode, or #NULL for windowed mode"),
        nullable..GLFWwindow.IN("share", " the window whose context to share resources with, or #NULL to not share resources"),

        returnDoc = "the handle of the created window, or #NULL if an error occurred",
        since = "version 1.0"
    )

    void(
        "DestroyWindow",
        """
        Destroys the specified window and its context. On calling this function, no further callbacks will be called for that window.

        If the context of the specified window is current on the main thread, it is detached before being destroyed.

        ${note(ul(
            "This function must only be called from the main thread.",
            "This function must not be called from a callback.",
            "The context of the specified window must not be current on any other thread when this function is called."
        ))}
        """,

        nullable..GLFWwindow.IN("window", "the window to destroy"),
        since = "version 1.0"
    )

    intb(
        "WindowShouldClose",
        """
        Returns the value of the close flag of the specified window.

        This function may be called from any thread.
        """,

        GLFWwindow.IN("window", "the window to query"),

        returnDoc = "the value of the close flag",
        since = "version 3.0"
    )

    void(
        "SetWindowShouldClose",
        """
        Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
        should be closed.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "the window whose flag to change"),
        intb.IN("value", "the new value"),

        since = "version 3.0"
    )

    void(
        "SetWindowTitle",
        """
        Sets the window title, encoded as UTF-8, of the specified window.

        This function must only be called from the main thread.

        <b>macOS</b>: The window title will not be updated until the next time you process events.
        """,

        GLFWwindow.IN("window", "the window whose title to change"),
        const..charUTF8_p.IN("title", "the UTF-8 encoded window title"),

        since = "version 1.0"
    )

    void(
        "SetWindowIcon",
        """
        Sets the icon for the specified window.

        This function sets the icon of the specified window. If passed an array of candidate images, those of or closest to the sizes desired by the system are
        selected. If no images are specified, the window reverts to its default icon.

        The desired image sizes varies depending on platform and system settings. The selected images will be rescaled as needed. Good sizes include 16x16,
        32x32 and 48x48.

        The specified image data is copied before this function returns.

        <b>macOS</b>: The GLFW window has no icon, as it is not a document window, so this function does nothing. The dock icon will be the same as the
        application bundle's icon. For more information on bundles, see the
        ${url("https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/", "Bundle Programming Guide")} in the Mac Developer
        Library.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose icon to set"),
        AutoSize("images")..int.IN("count", "the number of images in the specified array, or zero to revert to the default window icon"),
        nullable..const..GLFWimage_p.IN("images", "the images to create the icon from. This is ignored if count is zero."),

        since = "version 3.2"
    )

    void(
        "GetWindowPos",
        """
        Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.

        Any or all of the position arguments may be #NULL. If an error occurs, all non-#NULL position arguments will be set to zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to query"),
        nullable..Check(1)..int_p.OUT("xpos", "where to store the x-coordinate of the upper-left corner of the client area, or #NULL"),
        nullable..Check(1)..int_p.OUT("ypos", "where to store the y-coordinate of the upper-left corner of the client area, or #NULL"),

        since = "version 3.0"
    )

    void(
        "SetWindowPos",
        """
        Sets the position, in screen coordinates, of the upper-left corner of the client area of the specified windowed mode window. If the window is a full
        screen window, this function does nothing.

        <b>Do not use this function</b> to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the
        user.

        The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to query"),
        int.IN("xpos", "the x-coordinate of the upper-left corner of the client area"),
        int.IN("ypos", "the y-coordinate of the upper-left corner of the client area"),

        since = "version 1.0"
    )

    void(
        "GetWindowSize",
        """
        Retrieves the size, in screen coordinates, of the client area of the specified window. If you wish to retrieve the size of the framebuffer of the
        window in pixels, see #GetFramebufferSize().

        Any or all of the size arguments may be #NULL. If an error occurs, all non-#NULL size arguments will be set to zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose size to retrieve"),
        nullable..Check(1)..int_p.OUT("width", "where to store the width, in screen coordinates, of the client area, or #NULL"),
        nullable..Check(1)..int_p.OUT("height", "where to store the height, in screen coordinates, of the client area, or #NULL"),

        since = "version 1.0"
    )

    void(
        "SetWindowSizeLimits",
        """
        Sets the size limits of the client area of the specified window. If the window is full screen, the size limits only take effect if once it is made
        windowed. If the window is not resizable, this function does nothing.

        The size limits are applied immediately to a windowed mode window and may cause it to be resized.

        The maximum dimensions must be greater than or equal to the minimum dimensions and all must be greater than or equal to zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to set limits for"),
        int.IN("minwidth", "the minimum width, in screen coordinates, of the client area, or #DONT_CARE"),
        int.IN("minheight", "the minimum height, in screen coordinates, of the client area, or #DONT_CARE"),
        int.IN("maxwidth", "the maximum width, in screen coordinates, of the client area, or #DONT_CARE"),
        int.IN("maxheight", "the maximum height, in screen coordinates, of the client area, or #DONT_CARE"),

        since = "version 3.2"
    )

    void(
        "SetWindowAspectRatio",
        """
        Sets the required aspect ratio of the client area of the specified window. If the window is full screen, the aspect ratio only takes effect once it is
        made windowed. If the window is not resizable, this function does nothing.

        The aspect ratio is specified as a numerator and a denominator and both values must be greater than zero. For example, the common 16:9 aspect ratio is
        specified as 16 and 9, respectively.

        If the numerator and denominator is set to #DONT_CARE then the aspect ratio limit is disabled.

        The aspect ratio is applied immediately to a windowed mode window and may cause it to be resized.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to set limits for"),
        int.IN("numer", "the numerator of the desired aspect ratio, or #DONT_CARE"),
        int.IN("denom", "the denominator of the desired aspect ratio, or #DONT_CARE"),

        since = "version 3.2"
    )

    void(
        "SetWindowSize",
        """
        Sets the size, in pixels, of the client area of the specified window.

        For full screen windows, this function updates the resolution of its desired video mode and switches to the video mode closest to it, without affecting
        the window's context. As the context is unaffected, the bit depths of the framebuffer remain unchanged.

        If you wish to update the refresh rate of the desired video mode in addition to its resolution, see #SetWindowMonitor().

        The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to resize"),
        int.IN("width", "the desired width, in screen coordinates, of the window client area"),
        int.IN("height", "the desired height, in screen coordinates, of the window client area"),

        since = "version 1.0"
    )

    void(
        "GetFramebufferSize",
        """
        Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
        #GetWindowSize().

        Any or all of the size arguments may be #NULL. If an error occurs, all non-#NULL size arguments will be set to zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose framebuffer to query"),
        nullable..Check(1)..int_p.OUT("width", "where to store the width, in pixels, of the framebuffer, or #NULL"),
        nullable..Check(1)..int_p.OUT("height", "where to store the height, in pixels, of the framebuffer, or #NULL"),

        since = "version 3.0"
    )

    void(
        "GetWindowFrameSize",
        """
        Retrieves the size, in screen coordinates, of each edge of the frame of the specified window. This size includes the title bar, if the window has one.
        The size of the frame may vary depending on the ${url("http://www.glfw.org/docs/latest/window.html\\#window-hints_wnd", "window-related hints")} used to
        create it.

        Because this function retrieves the size of each window frame edge and not the offset along a particular coordinate axis, the retrieved values will
        always be zero or positive.

        Any or all of the size arguments may be #NULL. If an error occurs, all non-#NULL size arguments will be set to zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose frame size to query"),
        Check(1)..nullable..int_p.OUT("left", "where to store the size, in screen coordinates, of the left edge of the window frame, or #NULL"),
        Check(1)..nullable..int_p.OUT("top", "where to store the size, in screen coordinates, of the top edge of the window frame, or #NULL"),
        Check(1)..nullable..int_p.OUT("right", "where to store the size, in screen coordinates, of the right edge of the window frame, or #NULL"),
        Check(1)..nullable..int_p.OUT("bottom", "where to store the size, in screen coordinates, of the bottom edge of the window frame, or #NULL"),

        since = "version 3.1"
    )

    void(
        "IconifyWindow",
        """
        Iconifies (minimizes) the specified window if it was previously restored. If the window is already iconified, this function does nothing.

        If the specified window is a full screen window, the original monitor resolution is restored until the window is restored.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to iconify"),

        since = "version 2.1"
    )

    void(
        "RestoreWindow",
        """
        Restores the specified window if it was previously iconified (minimized) or maximized. If the window is already restored, this function does nothing.

        If the specified window is a full screen window, the resolution chosen for the window is restored on the selected monitor.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to restore"),

        since = "version 2.1"
    )

    void(
        "MaximizeWindow",
        """
        Maximizes the specified window if it was previously not maximized. If the window is already maximized, this function does nothing.

        If the specified window is a full screen window, this function does nothing.

        This function may only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to maximize"),

        since = "version 3.2"
    )

    Code(
        javaInit = statement("$t${t}EventLoop.OnScreen.check();")
    )..void(
        "ShowWindow",
        """
        Makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to make visible"),

        since = "version 3.0"
    )

    void(
        "HideWindow",
        """
        Hides the specified window, if it was previously visible. If the window is already hidden or is in full screen mode, this function does nothing.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to hide"),

        since = "version 3.0"
    )

    void(
        "FocusWindow",
        """
        Brings the specified window to front and sets input focus. The window should already be visible and not iconified.

        By default, both windowed and full screen mode windows are focused when initially created. Set the #FOCUSED hint to disable this behavior.

        <b>Do not use this function</b> to steal focus from other applications unless you are certain that is what the user wants. Focus stealing can be
        extremely disruptive.

        For a less disruptive way of getting the user's attention, see #RequestWindowAttention().

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to give input focus"),

        since = "version 3.2"
    )

    void(
        "RequestWindowAttention",
        """
        Requests user attention to the specified window.

        This function requests user attention to the specified window. On platforms where this is not supported, attention is requested to the application as
        a whole.

        Once the user has given attention, usually by focusing the window or application, the system will end the request automatically.

        ${note(ul(
            "This function must only be called from the main thread.",
            "<b>macOS:</b> Attention is requested to the application as a whole, not the specific window."
        ))}
        """,

        GLFWwindow.IN("window", "the window to request attention to"),

        since = "version 3.3"
    )

    GLFWmonitor(
        "GetWindowMonitor",
        """
        Returns the handle of the monitor that the specified window is in full screen on.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to query"),

        returnDoc = "the monitor, or #NULL if the window is in windowed mode or an error occurred",
        since = "version 3.0"
    )

    void(
        "SetWindowMonitor",
        """
        Sets the mode, monitor, video mode and placement of a window.

        This function sets the monitor that the window uses for full screen mode or, if the monitor is #NULL, makes it windowed mode.

        When setting a monitor, this function updates the width, height and refresh rate of the desired video mode and switches to the video mode closest to
        it. The window position is ignored when setting a monitor.

        When the monitor is #NULL, the position, width and height are used to place the window client area. The refresh rate is ignored when no monitor is
        specified.

        If you only wish to update the resolution of a full screen window or the size of a windowed mode window, see #SetWindowSize().

        When a window transitions from full screen to windowed mode, this function restores any previous window settings such as whether it is decorated,
        floating, resizable, has size or aspect ratio limits, etc.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose monitor, size or video mode to set"),
        nullable..GLFWmonitor.IN("monitor", "the desired monitor, or #NULL to set windowed mode"),
        int.IN("xpos", "the desired x-coordinate of the upper-left corner of the client area"),
        int.IN("ypos", "the desired y-coordinate of the upper-left corner of the client area"),
        int.IN("width", "the desired with, in screen coordinates, of the client area or video mode"),
        int.IN("height", "the desired height, in screen coordinates, of the client area or video mode"),
        int.IN("refreshRate", "the desired refresh rate, in Hz, of the video mode, or #DONT_CARE"),

        since = "version 3.2"
    )

    int(
        "GetWindowAttrib",
        """
        Returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.

        This function must only be called from the main thread.

        Framebuffer related hints are not window attributes.

        Zero is a valid value for many window and context related attributes so you cannot use a return value of zero as an indication of errors. However, this
        function should not fail as long as it is passed valid arguments and the library has been initialized.
        """,

        GLFWwindow.IN("window", "the window to query"),
        int.IN(
            "attrib",
            "the <a href=\"http://www.glfw.org/docs/latest/window.html\\#window_attribs\">window attribute</a> whose value to return",
            "${WindowHints.replace("#AUTO_ICONIFY ", "")} ${ClientAPIHints.replace("GLFW#(CONTEXT_RELEASE_BEHAVIOR|CONTEXT_NO_ERROR) ", "")}"
        ),

        returnDoc = "the value of the attribute, or zero if an error occured",
        since = "version 3.0"
    )

    void(
        "SetWindowAttrib",
        """
        Sets an attribute of the specified window.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to set the attribute for"),
        int.IN(
            "attrib",
            """
            the attribute to set.

            Some of these attributes are ignored for full screen windows. The new value will take effect if the window is later made windowed.

            Some of these attributes are ignored for windowed mode windows. The new value will take effect if the window is later made full screen.

            Calling #GetWindowAttrib() will always return the latest value, even if that value is ignored by the current mode of the window.
            """,
            "#DECORATED #RESIZABLE #FLOATING #AUTO_ICONIFY"
        ),
        int.IN("value", "the value to set"),

        since = "version 3.3"
    )

    void(
        "SetWindowUserPointer",
        """
        Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is #NULL.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "the window whose pointer to set"),
        nullable..opaque_p.IN("pointer", "the new value"),

        since = "version 3.0"
    )

    opaque_p(
        "GetWindowUserPointer",
        """
        Returns the current value of the user-defined pointer of the specified window. The initial value is #NULL.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "the window whose pointer to return"),

        since = "version 3.0"
    )

    val CallbackReturnDoc =
        """
        the previously set callback, or #NULL if no callback was set or the library had not been
        ${url("http://www.glfw.org/docs/latest/intro.html\\#intro_init", "initialized")}
        """

    val CALLBACK_WINDOW = GLFWwindow.IN("window", "the window whose callback to set")

    GLFWwindowposfun(
        "SetWindowPosCallback",
        """
        Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the screen position of the
        upper-left corner of the client area of the window.

        This function must only be called from the main thread.
         """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowposfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 1.0"
    )

    GLFWwindowsizefun(
        "SetWindowSizeCallback",
        """
        Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
        coordinates, of the client area of the window.

        This function must only be called from the main thread.
        """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowsizefun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 1.0"
    )

    GLFWwindowclosefun(
        "SetWindowCloseCallback",
        """
        Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
        the title bar.

        The close flag is set before this callback is called, but you can modify it at any time with #SetWindowShouldClose().

        The close callback is not triggered by #DestroyWindow().

        ${note(ul(
            "This function must only be called from the main thread.",
            "<b>macOS:</b> Selecting Quit from the application menu will trigger the close callback for all windows."
        ))}
        """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowclosefun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 2.5"
    )

    GLFWwindowrefreshfun(
        "SetWindowRefreshCallback",
        """
        Sets the refresh callback of the specified window, which is called when the client area of the window needs to be redrawn, for example if the window has
        been exposed after having been covered by another window.

        On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
        infrequently or never at all.

        This function must only be called from the main thread.
        """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowrefreshfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 2.5"
    )

    GLFWwindowfocusfun(
        "SetWindowFocusCallback",
        """
        Sets the focus callback of the specified window, which is called when the window gains or loses input focus.

          After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
          that had been pressed. For more information, see #SetKeyCallback() and #SetMouseButtonCallback().

        This function must only be called from the main thread.
        """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowfocusfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 3.0"
    )

    GLFWwindowiconifyfun(
        "SetWindowIconifyCallback",
        """
        Sets the iconification callback of the specified window, which is called when the window is iconified or restored.

        This function must only be called from the main thread.
        """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowiconifyfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 3.0"
    )

    GLFWwindowmaximizefun(
        "SetWindowMaximizeCallback",
        """
        Sets the maximization callback of the specified window, which is called when the window is maximized or restored.

        This function must only be called from the main thread.
        """,

        CALLBACK_WINDOW,
        nullable..GLFWwindowmaximizefun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 3.3"
    )

    GLFWframebuffersizefun(
        "SetFramebufferSizeCallback",
        """
        Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.

        This function must only be called from the main thread.
        """,

        CALLBACK_WINDOW,
        nullable..GLFWframebuffersizefun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = CallbackReturnDoc,
        since = "version 3.0"
    )

    Code(
        javaInit = statement("$t${t}EventLoop.OnScreen.check();")
    )..void(
        "PollEvents",
        """
        Processes all pending events.

        This function processes only those events that are already in the event queue and then returns immediately. Processing events will cause the window and
        input callbacks associated with those events to be called.

        On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
        those platforms. You can use the ${url("http://www.glfw.org/docs/latest/window.html\\#window_refresh", "window refresh callback")} to redraw the
        contents of your window when necessary during such operations.

        On some platforms, certain events are sent directly to the application without going through the event queue, causing callbacks to be called outside of
        a call to one of the event processing functions.

        Event processing is not required for joystick input to work.

        ${note(ul(
            "This function must only be called from the main thread.",
            "This function must not be called from a callback."
        ))}
        """,
        since = "version 1.0"
    )

    Code(
        javaInit = statement("$t${t}EventLoop.OnScreen.check();")
    )..void(
        "WaitEvents",
        """
        Waits until events are queued and processes them.

        This function puts the calling thread to sleep until at least one event is available in the event queue. Once one or more events are available, it
        behaves exactly like #PollEvents(), i.e. the events in the queue are processed and the function then returns immediately. Processing events will cause
        the window and input callbacks associated with those events to be called.

        Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
        callbacks.

        On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
        those platforms. You can use the ${url("http://www.glfw.org/docs/latest/window.html\\#window_refresh", "window refresh callback")} to redraw the
        contents of your window when necessary during such operations.

        On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.

        If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
        library of choice.

        Event processing is not required for joystick input to work.

        ${note(ul(
            "This function must only be called from the main thread.",
            "This function must not be called from a callback."
        ))}
        """,
        since = "version 2.5"
    )

    Code(
        javaInit = statement("$t${t}EventLoop.OnScreen.check();")
    )..void(
        "WaitEventsTimeout",
        """
        Waits with timeout until events are queued and processes them.

        This function puts the calling thread to sleep until at least one event is available in the event queue, or until the specified timeout is reached. If
        one or more events are available, it behaves exactly like #PollEvents(), i.e. the events in the queue are processed and the function then returns
        immediately. Processing events will cause the window and input callbacks associated with those events to be called.

        The timeout value must be a positive finite number.

        Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
        callbacks.

        On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
        those platforms. You can use the window refresh callback to redraw the contents of your window when necessary during such operations.

        On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.

        If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
        library of choice.

        Event processing is not required for joystick input to work.

        ${note(ul(
            "This function must only be called from the main thread.",
            "This function must not be called from a callback."
        ))}
        """,

        double.IN("timeout", "the maximum amount of time, in seconds, to wait"),

        since = "version 3.2"
    )

    void(
        "PostEmptyEvent",
        """
        Posts an empty event from the current thread to the main thread event queue, causing #WaitEvents() or #WaitEventsTimeout() to return.

        If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
        library of choice.

        This function may be called from any thread.
        """,

        since = "version 3.1"
    )

    int(
        "GetInputMode",
        """
        Returns the value of an input option for the specified window.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to query"),
        int.IN("mode", "the input mode whose value to return", "#CURSOR #STICKY_KEYS #STICKY_MOUSE_BUTTONS"),

        returnDoc = "the input mode value",
        since = "version 3.0"
    )

    void(
        "SetInputMode",
        """
        Sets an input option for the specified window.

        If {@code mode} is #CURSOR, the value must be one of the following cursor modes:
        ${ul(
            "#CURSOR_NORMAL makes the cursor visible and behaving normally.",
            "#CURSOR_HIDDEN makes the cursor invisible when it is over the client area of the window but does not restrict the cursor from leaving.",
            """
            #CURSOR_DISABLED hides and grabs the cursor, providing virtual and unlimited cursor movement. This is useful for implementing for example 3D camera
            controls.
            """
        )}

        If {@code mode} is #STICKY_KEYS, the value must be either #TRUE to enable sticky keys, or #FALSE to disable it. If sticky keys are
        enabled, a key press will ensure that #GetKey() returns #PRESS the next time it is called even if the key had been released before the call. This is
        useful when you are only interested in whether keys have been pressed but not when or in which order.

        If {@code mode} is #STICKY_MOUSE_BUTTONS, the value must be either #TRUE to enable sticky mouse buttons, or #FALSE to
        disable it. If sticky mouse buttons are enabled, a mouse button press will ensure that #GetMouseButton() returns #PRESS the next
        time it is called even if the mouse button had been released before the call. This is useful when you are only interested in whether mouse buttons have
        been pressed but not when or in which order.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose input mode to set"),
        int.IN("mode", "the input mode to set", "#CURSOR #STICKY_KEYS #STICKY_MOUSE_BUTTONS"),
        int.IN("value", "the new value of the specified input mode"),

        since = "GFLW 3.0"
    )

    const..charUTF8_p(
        "GetKeyName",
        """
        Returns the layout-specific name of the specified printable key.

        This function returns the name of the specified printable key, encoded as UTF-8. This is typically the character that key would produce without any
        modifier keys, intended for displaying key bindings to the user. For dead keys, it is typically the diacritic it would add to a character.

        <b>Do not use this function</b> for text input. You will break text input for many languages even if it happens to work for yours.

        If the key is #KEY_UNKNOWN, the scancode is used to identify the key, otherwise the scancode is ignored. If you specify a non-printable key, or
        #KEY_UNKNOWN and a scancode that maps to a non-printable key, this function returns #NULL but does not emit an error.

        This behavior allows you to always pass in the arguments in the key callback without modification.

        The printable keys are:
        ${ul(
            "#KEY_APOSTROPHE",
            "#KEY_COMMA",
            "#KEY_MINUS",
            "#KEY_PERIOD",
            "#KEY_SLASH",
            "#KEY_SEMICOLON",
            "#KEY_EQUAL",
            "#KEY_LEFT_BRACKET",
            "#KEY_RIGHT_BRACKET",
            "#KEY_BACKSLASH",
            "#KEY_WORLD_1",
            "#KEY_WORLD_2",
            "#KEY_0 to #KEY_9",
            "#KEY_A to #KEY_Z",
            "#KEY_KP_0 to #KEY_KP_9",
            "#KEY_KP_DECIMAL",
            "#KEY_KP_DIVIDE",
            "#KEY_KP_MULTIPLY",
            "#KEY_KP_SUBTRACT",
            "#KEY_KP_ADD",
            "#KEY_KP_EQUAL"
        )}
        Names for printable keys depend on keyboard layout, while names for non-printable keys are the same across layouts but depend on the application
        language and should be localized along with other user interface text.

        The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to #GetKeyName(), or until the
        library is terminated.

        This function must only be called from the main thread.
        """,

        int.IN("key", "the key to query, or #KEY_UNKNOWN"),
        int.IN("scancode", "the scancode of the key to query"),

        returnDoc = "the UTF-8 encoded, layout-specific name of the key, or #NULL",
        since = "version 3.2"
    )

    int(
        "GetKeyScancode",
        """
        Returns the platform dependent scancode of the specified key.

        This function returns the platform dependent scancode of the specified key. This is intended for platform specific default keybindings.

        If the key is #KEY_UNKNOWN or does not exist on the keyboard this method will return {@code -1}.

        This function may be called from any thread.
        """,

        int.IN("key", "the key to query, or #KEY_UNKNOWN"),

        returnDoc = "the platform dependent scancode for the key, or {@code -1} if an errror occurred",
        since = "version 3.3"
    )

    int(
        "GetKey",
        """
        Returns the last state reported for the specified key to the specified window. The returned state is one of #PRESS or #RELEASE. The higher-level action
        #REPEAT is only reported to the key callback.

        If the #STICKY_KEYS input mode is enabled, this function returns #PRESS the first time you call it for a key that was pressed, even if that
        key has already been released.

        The key functions deal with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
        Unicode character callback instead.

        The modifier key bit masks are not key tokens and cannot be used with this function.

        <b>Do not use this function</b> to implement ${url("http://www.glfw.org/docs/latest/input.html\\#input_char", "text input")}.

        ${note(ul(
            "This function must only be called from the main thread.",
            "#KEY_UNKNOWN is not a valid key for this function."
        ))}
        """,

        GLFWwindow.IN("window", "the desired window"),
        int.IN("key", "the desired keyboard key"),

        returnDoc = "one of #PRESS or #RELEASE",
        since = "version 1.0"
    )

    int(
        "GetMouseButton",
        """
        Returns the last state reported for the specified mouse button to the specified window. The returned state is one of #PRESS or #RELEASE. The
        higher-level action #REPEAT is only reported to the mouse button callback.

        If the #STICKY_MOUSE_BUTTONS input mode is enabled, this function returns #PRESS the first time you call it for a mouse button that has been pressed,
        even if that mouse button has already been released.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the desired window"),
        int.IN("button", "the desired mouse button"),

        returnDoc = "one of #PRESS or #RELEASE",
        since = "version 1.0"
    )

    void(
        "GetCursorPos",
        """
        Returns the position of the cursor, in screen coordinates, relative to the upper-left corner of the client area of the specified window.

        If the cursor is disabled (with #CURSOR_DISABLED) then the cursor position is unbounded and limited only by the minimum and maximum values of a
        <b>double</b>.

        The coordinates can be converted to their integer equivalents with the Math#floor() function. Casting directly to an integer type works for positive
        coordinates, but fails for negative ones.

        Any or all of the position arguments may be #NULL. If an error occurs, all non-#NULL position arguments will be set to zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the desired window"),
        nullable..Check(1)..double_p.OUT("xpos", "where to store the cursor x-coordinate, relative to the left edge of the client area, or #NULL"),
        nullable..Check(1)..double_p.OUT("ypos", "where to store the cursor y-coordinate, relative to the to top edge of the client area, or #NULL."),

        since = "version 1.0"
    )

    void(
        "SetCursorPos",
        """
        Sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the client area of the specified window. The window must
        have input focus. If the window does not have input focus when this function is called, it fails silently.

        <b>Do not use this function</b> to implement things like camera controls. GLFW already provides the #CURSOR_DISABLED cursor mode that hides the cursor,
        transparently re-centers it and provides unconstrained cursor motion. See #SetInputMode() for more information.

          If the cursor mode is #CURSOR_DISABLED then the cursor position is unconstrained and limited only by the minimum and maximum values of <b>double</b>.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the desired window"),
        double.IN("xpos", "the desired x-coordinate, relative to the left edge of the client area"),
        double.IN("ypos", "the desired y-coordinate, relative to the top edge of the client area"),

        since = "version 1.0"
    )

    GLFWcursor(
        "CreateCursor",
        """
        Creates a new custom cursor image that can be set for a window with #SetCursor(). The cursor can be destroyed with #DestroyCursor(). Any remaining
        cursors are destroyed by #Terminate().

        The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel. They are arranged canonically as packed sequential rows,
        starting from the top-left corner.

        The cursor hotspot is specified in pixels, relative to the upper-left corner of the cursor image. Like all other coordinate systems in GLFW, the X-axis
        points to the right and the Y-axis points down.

        ${note(ul(
            "This function must only be called from the main thread.",
            "The specified image data is copied before this function returns."
        ))}
        """,

        const..GLFWimage_p.IN("image", "the desired cursor image"),
        int.IN("xhot", "the desired x-coordinate, in pixels, of the cursor hotspot"),
        int.IN("yhot", "the desired y-coordinate, in pixels, of the cursor hotspot"),

        returnDoc = "the handle of the created cursor, or #NULL if an error occurred",
        since = "version 3.1"
    )

    GLFWcursor(
        "CreateStandardCursor",
        """
        Returns a cursor with a standard shape, that can be set for a window with #SetCursor().

        ${note(ul(
            "This function must only be called from the main thread.",
            "The specified image data is copied before this function returns."
        ))}
        """,

        int.IN("shape", "one of the standard shapes", CursorShapes),

        returnDoc = "a new cursor ready to use or #NULL if an error occurred",
        since = "version 3.1"
    )

    void(
        "DestroyCursor",
        """
        Destroys a cursor previously created with #CreateCursor(). Any remaining cursors will be destroyed by #Terminate().

        ${note(ul(
            "This function must only be called from the main thread.",
            "This function must not be called from a callback."
        ))}
        """,

        GLFWcursor.IN("cursor", "the cursor object to destroy"),

        since = "version 3.1"
    )

    void(
        "SetCursor",
        """
        Sets the cursor image to be used when the cursor is over the client area of the specified window. The set cursor will only be visible when the
        ${url("http://www.glfw.org/docs/latest/input.html\\#cursor_mode", "cursor mode")} of the window is #CURSOR_NORMAL.

        On some platforms, the set cursor may not be visible unless the window also has input focus.

          This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window to set the system cursor for"),
        nullable..GLFWcursor.IN("cursor", "the cursor to set, or #NULL to switch back to the default arrow cursor"),

        since = "version 3.1"
    )

    GLFWkeyfun(
        "SetKeyCallback",
        """
        Sets the key callback of the specified window, which is called when a key is pressed, repeated or released.

        The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. If you want
        to input text, use #SetCharCallback() instead.

        When a window loses input focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated
        events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus callback has been
        called.

        The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
        a GLFW key token. Such keys have {@code key} set to #KEY_UNKNOWN, their state is not saved and so it cannot be queried with #GetKey().

        Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWkeyfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 1.0"
    )

    GLFWcharfun(
        "SetCharCallback",
        """
        Sets the character callback of the specified window, which is called when a Unicode character is input.

        The character callback is intended for Unicode text input. As it deals with characters, it is keyboard layout dependent, whereas #SetKeyCallback() is
        not. Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key
        was pressed or released, see the key callback instead.

        The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text
        input on that platform, for example a Super (Command) key on macOS or Alt key on Windows. There is #SetCharModsCallback() that receives these events.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWcharfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 2.4"
    )

    GLFWcharmodsfun(
        "SetCharModsCallback",
        """
        Sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys
        are used.

        The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
        #SetCharCallback(). Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
        Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
        pressed or released, see #SetKeyCallback() instead.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWcharmodsfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 3.1"
    )

    GLFWmousebuttonfun(
        "SetMouseButtonCallback",
        """
        Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.

        When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
        user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus
        callback has been called.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWmousebuttonfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 1.0"
    )

    GLFWcursorposfun(
        "SetCursorPosCallback",
        """
        Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
        screen coordinates, relative to the upper-left corner of the client area of the window.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWcursorposfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 1.0"
    )

    GLFWcursorenterfun(
        "SetCursorEnterCallback",
        """
        Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the client area of the window.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWcursorenterfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 3.0"
    )

    GLFWscrollfun(
        "SetScrollCallback",
        """
        Sets the scroll callback of the specified window, which is called when a scrolling device is used.

        The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWscrollfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 2.1"
    )

    GLFWdropfun(
        "SetDropCallback",
        """
        Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.

        Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
        returned. If you wish to use them after the callback returns, you need to make a deep copy.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window whose callback to set"),
        nullable..GLFWdropfun.IN("cbfun", "the new callback or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set",
        since = "version 3.1"
    )

    intb(
        "JoystickPresent",
        """
        Returns whether the specified joystick is present.

        This function must only be called from the main thread.
        """,

        int.IN("jid", "joystick to query"),

        returnDoc = "#TRUE if the joystick is present, or #FALSE otherwise",
        since = "version 3.0"
    )

    const..float_p(
        "GetJoystickAxes",
        """
        Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.

        Querying a joystick ID with no device present is not an error, but will cause this function to return #NULL. Call #JoystickPresent() to check device
        presence.

        The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
        function is called again for that joystick or the library is terminated.

        This function must only be called from the main thread.
        """,

        int.IN("jid", "the joystick to query"),
        AutoSizeResult..int_p.OUT(
            "count",
            "where to store the number of axis values in the returned array. This is set to zero if the joystick is not present or an error occurred."
        ),

        returnDoc = "an array of axis values, or #NULL if the joystick is not present",
        since = "version 2.2"
    )

    const..unsigned_char_p(
        "GetJoystickButtons",
        """
        Returns the state of all buttons of the specified joystick. Each element in the array is either #PRESS or #RELEASE.

        For backward compatibility with earlier versions that did not have #GetJoystickHats(), the button array also includes all hats, each represented as four
        buttons. The hats are in the same order as returned by #GetJoystickHats() and are in the order up, right, down and left. To disable these extra
        buttons, set the #JOYSTICK_HAT_BUTTONS init hint before initialization.

         Querying a joystick ID with no device present is not an error, but will cause this function to return #NULL. Call #JoystickPresent() to check device
        presence.

        The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
        function is called again for that joystick or the library is terminated.

          This function must only be called from the main thread.
        """,

        int.IN("jid", "the joystick to query"),
        AutoSizeResult..int_p.OUT(
            "count",
            "where to store the number of button states in the returned array. This is set to zero if the joystick is not present or an error occurred."
        ),

        returnDoc = "an array of button states, or #NULL if the joystick is not present",
        since = "version 2.2"
    )

    const..unsigned_char_p(
        "GetJoystickHats",
        """
        Returns the state of all hats of the specified joystick.

        This function returns the state of all hats of the specified joystick. Each element in the array is one of the following values:
${codeBlock("""
Name                | Value
------------------- | ------------------------------
GLFW_HAT_CENTERED   | 0
GLFW_HAT_UP         | 1
GLFW_HAT_RIGHT      | 2
GLFW_HAT_DOWN       | 4
GLFW_HAT_LEFT       | 8
GLFW_HAT_RIGHT_UP   | GLFW_HAT_RIGHT | GLFW_HAT_UP
GLFW_HAT_RIGHT_DOWN | GLFW_HAT_RIGHT | GLFW_HAT_DOWN
GLFW_HAT_LEFT_UP    | GLFW_HAT_LEFT  | GLFW_HAT_UP
GLFW_HAT_LEFT_DOWN  | GLFW_HAT_LEFT  | GLFW_HAT_DOWN
""")}
        The diagonal directions are bitwise combinations of the primary (up, right, down and left) directions and you can test for these individually by ANDing
        it with the corresponding direction.
        ${codeBlock("""
if (hats[2] & GLFW_HAT_RIGHT)
{
    // State of hat 2 could be right-up, right or right-down
}""")}
        Querying a joystick ID with no device present is not an error, but will cause this function to return #NULL. Call #JoystickPresent() to check device
        presence.

        ${note(ul(
            "Linux: Joystick hats are currently unimplemented.",
            "The returned array is allocated and freed by GLFW.  You *  should not free it yourself.  It is valid until the specified joystick is *  disconnected, this function is called again for that joystick or the library *  is terminated.",
            "This function must only be called from the main thread."
        ))}
        """,

        int.IN("jid", "the joystick to query"),
        AutoSizeResult..int_p.OUT(
            "count",
            "where to store the number of hat states in the returned array. This is set to zero if the joystick is not present or an error occurred."
        ),

        returnDoc = "an array of hat states, or #NULL if the joystick is not present or an error occurred",
        since = "version 3.3"
    )

    const..charUTF8_p(
        "GetJoystickName",
        """
        Returns the name, encoded as UTF-8, of the specified joystick.

        Querying a joystick ID with no device present is not an error, but will cause this function to return #NULL. Call #JoystickPresent() to check device
        presence.

        The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
        function is called again for that joystick or the library is terminated.

        This function must only be called from the main thread.
        """,

        int.IN("jid", "the joystick to query"),

        returnDoc = "the UTF-8 encoded name of the joystick, or #NULL if the joystick is not present",
        since = "version 3.0"
    )

    GLFWjoystickfun(
        "SetJoystickCallback",
        """
        Sets the joystick configuration callback, or removes the currently set callback.

        This is called when a joystick is connected to or disconnected from the system.

        This function must only be called from the main thread.
        """,

        nullable..GLFWjoystickfun.IN("cbfun", "the new callback, or #NULL to remove the currently set callback"),

        returnDoc = "the previously set callback, or #NULL if no callback was set or the library had not been initialized",
        since = "version 3.2"
    )

    void(
        "SetClipboardString",
        """
        Sets the system clipboard to the specified, UTF-8 encoded string.

        The specified string is copied before this function returns.

        This function must only be called from the main thread.
        """,

        GLFWwindow.IN("window", "the window that will own the clipboard contents"),
        const..charUTF8_p.IN("string", "a UTF-8 encoded string"),

        since = "version 3.0"
    )

    const..charUTF8_p(
        "GetClipboardString",
        """
        Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string. If the clipboard is empty or if its contents
        cannot be converted, #NULL is returned and a #FORMAT_UNAVAILABLE error is generated.

        The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to #GetClipboardString() or
        #SetClipboardString(), or until the library is terminated.

        ${note(ul(
            "This function must only be called from the main thread.",
            "The returned string is allocated and freed by GLFW.  You should not free it yourself.",
            "The returned string is valid only until the next call to #GetClipboardString() or #SetClipboardString()."
        ))}
        """,

        GLFWwindow.IN("window", "the window that will request the clipboard contents"),

        returnDoc = "the contents of the clipboard as a UTF-8 encoded string, or #NULL if an error occurred",
        since = "version 3.0"
    )

    double(
        "GetTime",
        """
        Returns the value of the GLFW timer. Unless the timer has been set using #SetTime(), the timer measures time elapsed since GLFW was initialized.

        The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution monotonic
        time source on each supported platform.

        This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
        with calls to #SetTime().
        """,

        returnDoc = "the current value, in seconds, or zero if an error occurred",
        since = "version 1.0"
    )

    void(
        "SetTime",
        """
        Sets the value of the GLFW timer. It then continues to count up from that value. The value must be a positive finite number less than or equal to
        18446744073.0, which is approximately 584.5 years.

        The upper limit of the timer is calculated as ${code("floor((2<sup>64</sup> - 1) / 10<sup>9</sup>)")} and is due to implementations storing nanoseconds
        in 64 bits. The limit may be increased in the future.

        This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
        with calls to #GetTime().
        """,

        double.IN("time", "the new value, in seconds"),

        since = "version 2.2"
    )

    uint64_t(
        "GetTimerValue",
        """
        Returns the current value of the raw timer.

        This function returns the current value of the raw timer, measured in {@code 1 / frequency} seconds. To get the frequency, call #GetTimerFrequency().

        This function may be called from any thread.
        """,

        returnDoc = "the value of the timer, or zero if an error occurred",
        since = "version 3.2"
    )

    uint64_t(
        "GetTimerFrequency",
        """
        Returns the frequency, in Hz, of the raw timer.

        This function may be called from any thread.
        """,

        returnDoc = "the frequency of the timer, in Hz, or zero if an error occurred",
        since = "version 3.2"
    )

    // [ OpenGL ]

    void(
        "MakeContextCurrent",
        """
        Makes the OpenGL or OpenGL ES context of the specified window current on the calling thread. A context can only be made current on a single thread at a
        time and each thread can have only a single current context at a time.

        By default, making a context non-current implicitly forces a pipeline flush. On machines that support
        ${url("https://www.opengl.org/registry/specs/KHR/context_flush_control.txt", "GL_KHR_context_flush_control")}, you can control whether a context
        performs this flush by setting the #CONTEXT_RELEASE_BEHAVIOR ${url("http://www.glfw.org/docs/latest/window.html\\#window_hints_ctx", "window hint")}.

        The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a #NO_WINDOW_CONTEXT error.

        This function may be called from any thread.
        """,

        nullable..GLFWwindow.IN("window", "the window whose context to make current, or #NULL to detach the current context"),

        since = "version 3.0"
    )

    GLFWwindow(
        "GetCurrentContext",
        """
        Returns the window whose OpenGL or OpenGL ES context is current on the calling thread.

        This function may be called from any thread.
        """,

        returnDoc = "the window whose context is current, or #NULL if no window's context is current",
        since = "version 3.0"
    )

    void(
        "SwapBuffers",
        """
        Swaps the front and back buffers of the specified window when rendering with OpenGL or OpenGL ES. If the swap interval is greater than zero, the GPU
        driver waits the specified number of screen updates before swapping the buffers.

        The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a #NO_WINDOW_CONTEXT error.

        This function does not apply to Vulkan. If you are rendering with Vulkan, {@code vkQueuePresentKHR} instead.

        <b>EGL</b>: The context of the specified window must be current on the calling thread.

        This function may be called from any thread.
        """,

        GLFWwindow.IN("window", "the window whose buffers to swap"),

        since = "version 1.0"
    )

    void(
        "SwapInterval",
        """
        Sets the swap interval for the current OpenGL or OpenGL ES context, i.e. the number of screen updates to wait from the time #SwapBuffers() was called
        before swapping the buffers and returning. This is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i> or just
        <i>vsync</i>.

        Contexts that support either of the ${url("https://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt", "WGL_EXT_swap_control_tear")} and
        ${url("https://www.opengl.org/registry/specs/EXT/glx_swap_control_tear.txt", "GLX_EXT_swap_control_tear")} extensions also accept negative swap
        intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
        #ExtensionSupported(). For more information about swap tearing, see the extension specifications.

        A context must be current on the calling thread. Calling this function without a current context will cause a #NO_CURRENT_CONTEXT error.

        This function does not apply to Vulkan. If you are rendering with Vulkan, see the present mode of your swapchain instead.

        ${note(ul(
            "This function may be called from any thread.",
            """
            This function is not called during window creation, leaving the swap interval set to whatever is the default on that platform. This is done because
            some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.
            """,
            """
            Some GPU drivers do not honor the requested swap interval, either because of a user setting that overrides the application's request or due to bugs
            in the driver.
            """
        ))}
        """,

        int.IN("interval", "the minimum number of screen updates to wait for until the buffers are swapped by #SwapBuffers()"),

        since = "version 1.0"
    )

    intb(
        "ExtensionSupported",
        """
        Returns whether the specified ${url("http://www.glfw.org/docs/latest/context.html\\#context_glext", "API extension")} is supported by the current
        OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.

        A context must be current on the calling thread. Calling this function without a current context will cause a #NO_CURRENT_CONTEXT error.

        As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
        frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.

        This function does not apply to Vulkan. If you are using Vulkan, see {@code glfwGetRequiredInstanceExtensions},
        {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.

        This function may be called from any thread.
        """,

        const..charASCII_p.IN("extension", "the ASCII encoded name of the extension"),

        returnDoc = "#TRUE if the extension is available, or #FALSE otherwise",

        since = "version 1.0"
    )

    GLFWglproc(
        "GetProcAddress",
        """
        Returns the address of the specified OpenGL or OpenGL ES ${url(
            "http://www.glfw.org/docs/latest/context.html\\#context_glext",
            "core or extension function")
        }, if it is supported by the current context.

        A context must be current on the calling thread.  Calling this function without a current context will cause a #NO_CURRENT_CONTEXT error.

        This function does not apply to Vulkan. If you are rendering with Vulkan, {@code glfwGetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
        {@code vkGetDeviceProcAddr} instead.

        ${note(ul(
            "The address of a given function is not guaranteed to be the same between contexts.",
            """
            This function may return a non-#NULL address despite the associated version or extension not being available. Always check the context version or
            extension string first.
            """,
            "The returned function pointer is valid until the context is destroyed or the library is terminated.",
            "This function may be called from any thread."
        ))}
        """,

        const..charASCII_p.IN("procname", "the ASCII encoded name of the function"),

        returnDoc = "the address of the function, or #NULL if an error occured",
        since = "version 1.0"
    )
}