/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_video() = SDL.apply {

    StringConstant("PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER".."SDL.video.wayland.wl_display")
    LongConstant("WINDOW_FULLSCREEN"           .."0x0000000000000001L")
    LongConstant("WINDOW_OPENGL"               .."0x0000000000000002L")
    LongConstant("WINDOW_OCCLUDED"             .."0x0000000000000004L")
    LongConstant("WINDOW_HIDDEN"               .."0x0000000000000008L")
    LongConstant("WINDOW_BORDERLESS"           .."0x0000000000000010L")
    LongConstant("WINDOW_RESIZABLE"            .."0x0000000000000020L")
    LongConstant("WINDOW_MINIMIZED"            .."0x0000000000000040L")
    LongConstant("WINDOW_MAXIMIZED"            .."0x0000000000000080L")
    LongConstant("WINDOW_MOUSE_GRABBED"        .."0x0000000000000100L")
    LongConstant("WINDOW_INPUT_FOCUS"          .."0x0000000000000200L")
    LongConstant("WINDOW_MOUSE_FOCUS"          .."0x0000000000000400L")
    LongConstant("WINDOW_EXTERNAL"             .."0x0000000000000800L")
    LongConstant("WINDOW_MODAL"                .."0x0000000000001000L")
    LongConstant("WINDOW_HIGH_PIXEL_DENSITY"   .."0x0000000000002000L")
    LongConstant("WINDOW_MOUSE_CAPTURE"        .."0x0000000000004000L")
    LongConstant("WINDOW_MOUSE_RELATIVE_MODE"  .."0x0000000000008000L")
    LongConstant("WINDOW_ALWAYS_ON_TOP"        .."0x0000000000010000L")
    LongConstant("WINDOW_UTILITY"              .."0x0000000000020000L")
    LongConstant("WINDOW_TOOLTIP"              .."0x0000000000040000L")
    LongConstant("WINDOW_POPUP_MENU"           .."0x0000000000080000L")
    LongConstant("WINDOW_KEYBOARD_GRABBED"     .."0x0000000000100000L")
    LongConstant("WINDOW_VULKAN"               .."0x0000000010000000L")
    LongConstant("WINDOW_METAL"                .."0x0000000020000000L")
    LongConstant("WINDOW_TRANSPARENT"          .."0x0000000040000000L")
    LongConstant("WINDOW_NOT_FOCUSABLE"        .."0x0000000080000000L")
    IntConstant("WINDOWPOS_UNDEFINED_MASK".."0x1FFF0000")
    IntConstant("WINDOWPOS_UNDEFINED".."SDL_WINDOWPOS_UNDEFINED_MASK")
    IntConstant("WINDOWPOS_CENTERED_MASK".."0x2FFF0000")
    IntConstant("WINDOWPOS_CENTERED".."SDL_WINDOWPOS_CENTERED_MASK")
    IntConstant("GL_CONTEXT_PROFILE_CORE".."0x0001")
    IntConstant("GL_CONTEXT_PROFILE_COMPATIBILITY".."0x0002")
    IntConstant("GL_CONTEXT_PROFILE_ES".."0x0004")
    IntConstant("GL_CONTEXT_DEBUG_FLAG".."0x0001")
    IntConstant("GL_CONTEXT_FORWARD_COMPATIBLE_FLAG".."0x0002")
    IntConstant("GL_CONTEXT_ROBUST_ACCESS_FLAG".."0x0004")
    IntConstant("GL_CONTEXT_RESET_ISOLATION_FLAG".."0x0008")
    IntConstant("GL_CONTEXT_RELEASE_BEHAVIOR_NONE".."0x0000")
    IntConstant("GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH".."0x0001")
    IntConstant("GL_CONTEXT_RESET_NO_NOTIFICATION".."0x0000")
    IntConstant("GL_CONTEXT_RESET_LOSE_CONTEXT".."0x0001")
    StringConstant("PROP_DISPLAY_HDR_ENABLED_BOOLEAN".."SDL.display.HDR_enabled")
    StringConstant("PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER".."SDL.display.KMSDRM.panel_orientation")
    StringConstant("PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN".."SDL.window.create.always_on_top")
    StringConstant("PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN".."SDL.window.create.borderless")
    StringConstant("PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN".."SDL.window.create.focusable")
    StringConstant("PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN".."SDL.window.create.external_graphics_context")
    StringConstant("PROP_WINDOW_CREATE_FLAGS_NUMBER".."SDL.window.create.flags")
    StringConstant("PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN".."SDL.window.create.fullscreen")
    StringConstant("PROP_WINDOW_CREATE_HEIGHT_NUMBER".."SDL.window.create.height")
    StringConstant("PROP_WINDOW_CREATE_HIDDEN_BOOLEAN".."SDL.window.create.hidden")
    StringConstant("PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN".."SDL.window.create.high_pixel_density")
    StringConstant("PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN".."SDL.window.create.maximized")
    StringConstant("PROP_WINDOW_CREATE_MENU_BOOLEAN".."SDL.window.create.menu")
    StringConstant("PROP_WINDOW_CREATE_METAL_BOOLEAN".."SDL.window.create.metal")
    StringConstant("PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN".."SDL.window.create.minimized")
    StringConstant("PROP_WINDOW_CREATE_MODAL_BOOLEAN".."SDL.window.create.modal")
    StringConstant("PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN".."SDL.window.create.mouse_grabbed")
    StringConstant("PROP_WINDOW_CREATE_OPENGL_BOOLEAN".."SDL.window.create.opengl")
    StringConstant("PROP_WINDOW_CREATE_PARENT_POINTER".."SDL.window.create.parent")
    StringConstant("PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN".."SDL.window.create.resizable")
    StringConstant("PROP_WINDOW_CREATE_TITLE_STRING".."SDL.window.create.title")
    StringConstant("PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN".."SDL.window.create.transparent")
    StringConstant("PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN".."SDL.window.create.tooltip")
    StringConstant("PROP_WINDOW_CREATE_UTILITY_BOOLEAN".."SDL.window.create.utility")
    StringConstant("PROP_WINDOW_CREATE_VULKAN_BOOLEAN".."SDL.window.create.vulkan")
    StringConstant("PROP_WINDOW_CREATE_WIDTH_NUMBER".."SDL.window.create.width")
    StringConstant("PROP_WINDOW_CREATE_X_NUMBER".."SDL.window.create.x")
    StringConstant("PROP_WINDOW_CREATE_Y_NUMBER".."SDL.window.create.y")
    StringConstant("PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER".."SDL.window.create.cocoa.window")
    StringConstant("PROP_WINDOW_CREATE_COCOA_VIEW_POINTER".."SDL.window.create.cocoa.view")
    StringConstant("PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN".."SDL.window.create.wayland.surface_role_custom")
    StringConstant("PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN".."SDL.window.create.wayland.create_egl_window")
    StringConstant("PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER".."SDL.window.create.wayland.wl_surface")
    StringConstant("PROP_WINDOW_CREATE_WIN32_HWND_POINTER".."SDL.window.create.win32.hwnd")
    StringConstant("PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER".."SDL.window.create.win32.pixel_format_hwnd")
    StringConstant("PROP_WINDOW_CREATE_X11_WINDOW_NUMBER".."SDL.window.create.x11.window")
    StringConstant("PROP_WINDOW_SHAPE_POINTER".."SDL.window.shape")
    StringConstant("PROP_WINDOW_HDR_ENABLED_BOOLEAN".."SDL.window.HDR_enabled")
    StringConstant("PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT".."SDL.window.SDR_white_level")
    StringConstant("PROP_WINDOW_HDR_HEADROOM_FLOAT".."SDL.window.HDR_headroom")
    StringConstant("PROP_WINDOW_ANDROID_WINDOW_POINTER".."SDL.window.android.window")
    StringConstant("PROP_WINDOW_ANDROID_SURFACE_POINTER".."SDL.window.android.surface")
    StringConstant("PROP_WINDOW_UIKIT_WINDOW_POINTER".."SDL.window.uikit.window")
    StringConstant("PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER".."SDL.window.uikit.metal_view_tag")
    StringConstant("PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER".."SDL.window.uikit.opengl.framebuffer")
    StringConstant("PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER".."SDL.window.uikit.opengl.renderbuffer")
    StringConstant("PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER".."SDL.window.uikit.opengl.resolve_framebuffer")
    StringConstant("PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER".."SDL.window.kmsdrm.dev_index")
    StringConstant("PROP_WINDOW_KMSDRM_DRM_FD_NUMBER".."SDL.window.kmsdrm.drm_fd")
    StringConstant("PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER".."SDL.window.kmsdrm.gbm_dev")
    StringConstant("PROP_WINDOW_COCOA_WINDOW_POINTER".."SDL.window.cocoa.window")
    StringConstant("PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER".."SDL.window.cocoa.metal_view_tag")
    StringConstant("PROP_WINDOW_OPENVR_OVERLAY_ID".."SDL.window.openvr.overlay_id")
    StringConstant("PROP_WINDOW_VIVANTE_DISPLAY_POINTER".."SDL.window.vivante.display")
    StringConstant("PROP_WINDOW_VIVANTE_WINDOW_POINTER".."SDL.window.vivante.window")
    StringConstant("PROP_WINDOW_VIVANTE_SURFACE_POINTER".."SDL.window.vivante.surface")
    StringConstant("PROP_WINDOW_WIN32_HWND_POINTER".."SDL.window.win32.hwnd")
    StringConstant("PROP_WINDOW_WIN32_HDC_POINTER".."SDL.window.win32.hdc")
    StringConstant("PROP_WINDOW_WIN32_INSTANCE_POINTER".."SDL.window.win32.instance")
    StringConstant("PROP_WINDOW_WAYLAND_DISPLAY_POINTER".."SDL.window.wayland.display")
    StringConstant("PROP_WINDOW_WAYLAND_SURFACE_POINTER".."SDL.window.wayland.surface")
    StringConstant("PROP_WINDOW_WAYLAND_VIEWPORT_POINTER".."SDL.window.wayland.viewport")
    StringConstant("PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER".."SDL.window.wayland.egl_window")
    StringConstant("PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER".."SDL.window.wayland.xdg_surface")
    StringConstant("PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER".."SDL.window.wayland.xdg_toplevel")
    StringConstant("PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING".."SDL.window.wayland.xdg_toplevel_export_handle")
    StringConstant("PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER".."SDL.window.wayland.xdg_popup")
    StringConstant("PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER".."SDL.window.wayland.xdg_positioner")
    StringConstant("PROP_WINDOW_X11_DISPLAY_POINTER".."SDL.window.x11.display")
    StringConstant("PROP_WINDOW_X11_SCREEN_NUMBER".."SDL.window.x11.screen")
    StringConstant("PROP_WINDOW_X11_WINDOW_NUMBER".."SDL.window.x11.window")
    IntConstant("WINDOW_SURFACE_VSYNC_DISABLED".."0")
    IntConstant("WINDOW_SURFACE_VSYNC_ADAPTIVE".."-1")

    EnumConstant(
        "SYSTEM_THEME_UNKNOWN".enum("0"),
        "SYSTEM_THEME_LIGHT".enum,
        "SYSTEM_THEME_DARK".enum
    )

    EnumConstant(
        "ORIENTATION_UNKNOWN".enum("0"),
        "ORIENTATION_LANDSCAPE".enum,
        "ORIENTATION_LANDSCAPE_FLIPPED".enum,
        "ORIENTATION_PORTRAIT".enum,
        "ORIENTATION_PORTRAIT_FLIPPED".enum
    )

    EnumConstant(
        "FLASH_CANCEL".enum("0"),
        "FLASH_BRIEFLY".enum,
        "FLASH_UNTIL_FOCUSED".enum
    )

    EnumConstant(
        "GL_RED_SIZE".enum("0"),
        "GL_GREEN_SIZE".enum,
        "GL_BLUE_SIZE".enum,
        "GL_ALPHA_SIZE".enum,
        "GL_BUFFER_SIZE".enum,
        "GL_DOUBLEBUFFER".enum,
        "GL_DEPTH_SIZE".enum,
        "GL_STENCIL_SIZE".enum,
        "GL_ACCUM_RED_SIZE".enum,
        "GL_ACCUM_GREEN_SIZE".enum,
        "GL_ACCUM_BLUE_SIZE".enum,
        "GL_ACCUM_ALPHA_SIZE".enum,
        "GL_STEREO".enum,
        "GL_MULTISAMPLEBUFFERS".enum,
        "GL_MULTISAMPLESAMPLES".enum,
        "GL_ACCELERATED_VISUAL".enum,
        "GL_RETAINED_BACKING".enum,
        "GL_CONTEXT_MAJOR_VERSION".enum,
        "GL_CONTEXT_MINOR_VERSION".enum,
        "GL_CONTEXT_FLAGS".enum,
        "GL_CONTEXT_PROFILE_MASK".enum,
        "GL_SHARE_WITH_CURRENT_CONTEXT".enum,
        "GL_FRAMEBUFFER_SRGB_CAPABLE".enum,
        "GL_CONTEXT_RELEASE_BEHAVIOR".enum,
        "GL_CONTEXT_RESET_NOTIFICATION".enum,
        "GL_CONTEXT_NO_ERROR".enum,
        "GL_FLOATBUFFERS".enum,
        "GL_EGL_PLATFORM".enum
    )

    EnumConstant(
        "HITTEST_NORMAL".enum("0"),
        "HITTEST_DRAGGABLE".enum,
        "HITTEST_RESIZE_TOPLEFT".enum,
        "HITTEST_RESIZE_TOP".enum,
        "HITTEST_RESIZE_TOPRIGHT".enum,
        "HITTEST_RESIZE_RIGHT".enum,
        "HITTEST_RESIZE_BOTTOMRIGHT".enum,
        "HITTEST_RESIZE_BOTTOM".enum,
        "HITTEST_RESIZE_BOTTOMLEFT".enum,
        "HITTEST_RESIZE_LEFT".enum
    )

    int(
        "GetNumVideoDrivers",

        void()
    )

    charUTF8.const.p(
        "GetVideoDriver",

        int("index")
    )

    charUTF8.const.p(
        "GetCurrentVideoDriver",

        void()
    )

    SDL_SystemTheme(
        "GetSystemTheme",

        void()
    )

    SDL_DisplayID.p(
        "GetDisplays",

        AutoSizeResult..int.p("count")
    )

    SDL_DisplayID(
        "GetPrimaryDisplay",

        void()
    )

    SDL_PropertiesID(
        "GetDisplayProperties",

        SDL_DisplayID("displayID")
    )

    charUTF8.const.p(
        "GetDisplayName",

        SDL_DisplayID("displayID")
    )

    bool(
        "GetDisplayBounds",

        SDL_DisplayID("displayID"),
        Check(1)..SDL_Rect.p("rect")
    )

    bool(
        "GetDisplayUsableBounds",

        SDL_DisplayID("displayID"),
        Check(1)..SDL_Rect.p("rect")
    )

    SDL_DisplayOrientation(
        "GetNaturalDisplayOrientation",

        SDL_DisplayID("displayID")
    )

    SDL_DisplayOrientation(
        "GetCurrentDisplayOrientation",

        SDL_DisplayID("displayID")
    )

    float(
        "GetDisplayContentScale",

        SDL_DisplayID("displayID")
    )

    SDL_DisplayMode.p.p(
        "GetFullscreenDisplayModes",

        SDL_DisplayID("displayID"),
        AutoSizeResult..int.p("count")
    )

    bool(
        "GetClosestFullscreenDisplayMode",

        SDL_DisplayID("displayID"),
        int("w"),
        int("h"),
        float("refresh_rate"),
        bool("include_high_density_modes"),
        Check(1)..SDL_DisplayMode.p("closest")
    )

    SDL_DisplayMode.const.p(
        "GetDesktopDisplayMode",

        SDL_DisplayID("displayID")
    )

    SDL_DisplayMode.const.p(
        "GetCurrentDisplayMode",

        SDL_DisplayID("displayID")
    )

    SDL_DisplayID(
        "GetDisplayForPoint",

        Check(1)..SDL_Point.const.p("point")
    )

    SDL_DisplayID(
        "GetDisplayForRect",

        Check(1)..SDL_Rect.const.p("rect")
    )

    SDL_DisplayID(
        "GetDisplayForWindow",

        SDL_Window.p("window")
    )

    float(
        "GetWindowPixelDensity",

        SDL_Window.p("window")
    )

    float(
        "GetWindowDisplayScale",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowFullscreenMode",

        SDL_Window.p("window"),
        Check(1)..SDL_DisplayMode.const.p("mode")
    )

    SDL_DisplayMode.const.p(
        "GetWindowFullscreenMode",

        SDL_Window.p("window")
    )

    void.p(
        "GetWindowICCProfile",

        SDL_Window.p("window"),
        AutoSizeResult..size_t.p("size")
    )

    SDL_PixelFormat(
        "GetWindowPixelFormat",

        SDL_Window.p("window")
    )

    SDL_Window.p.p(
        "GetWindows",

        AutoSizeResult..int.p("count")
    )

    SDL_Window.p(
        "CreateWindow",

        charUTF8.const.p("title"),
        int("w"),
        int("h"),
        SDL_WindowFlags("flags")
    )

    SDL_Window.p(
        "CreatePopupWindow",

        SDL_Window.p("parent"),
        int("offset_x"),
        int("offset_y"),
        int("w"),
        int("h"),
        SDL_WindowFlags("flags")
    )

    SDL_Window.p(
        "CreateWindowWithProperties",

        SDL_PropertiesID("props")
    )

    SDL_WindowID(
        "GetWindowID",

        SDL_Window.p("window")
    )

    SDL_Window.p(
        "GetWindowFromID",

        SDL_WindowID("id")
    )

    SDL_Window.p(
        "GetWindowParent",

        SDL_Window.p("window")
    )

    SDL_PropertiesID(
        "GetWindowProperties",

        SDL_Window.p("window")
    )

    SDL_WindowFlags(
        "GetWindowFlags",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowTitle",

        SDL_Window.p("window"),
        charUTF8.const.p("title")
    )

    charUTF8.const.p(
        "GetWindowTitle",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowIcon",

        SDL_Window.p("window"),
        Check(1)..SDL_Surface.p("icon")
    )

    bool(
        "SetWindowPosition",

        SDL_Window.p("window"),
        int("x"),
        int("y")
    )

    bool(
        "GetWindowPosition",

        SDL_Window.p("window"),
        Check(1)..int.p("x"),
        Check(1)..int.p("y")
    )

    bool(
        "SetWindowSize",

        SDL_Window.p("window"),
        int("w"),
        int("h")
    )

    bool(
        "GetWindowSize",

        SDL_Window.p("window"),
        Check(1)..int.p("w"),
        Check(1)..int.p("h")
    )

    bool(
        "GetWindowSafeArea",

        SDL_Window.p("window"),
        Check(1)..SDL_Rect.p("rect")
    )

    bool(
        "SetWindowAspectRatio",

        SDL_Window.p("window"),
        float("min_aspect"),
        float("max_aspect")
    )

    bool(
        "GetWindowAspectRatio",

        SDL_Window.p("window"),
        Check(1)..float.p("min_aspect"),
        Check(1)..float.p("max_aspect")
    )

    bool(
        "GetWindowBordersSize",

        SDL_Window.p("window"),
        Check(1)..int.p("top"),
        Check(1)..int.p("left"),
        Check(1)..int.p("bottom"),
        Check(1)..int.p("right")
    )

    bool(
        "GetWindowSizeInPixels",

        SDL_Window.p("window"),
        Check(1)..int.p("w"),
        Check(1)..int.p("h")
    )

    bool(
        "SetWindowMinimumSize",

        SDL_Window.p("window"),
        int("min_w"),
        int("min_h")
    )

    bool(
        "GetWindowMinimumSize",

        SDL_Window.p("window"),
        Check(1)..int.p("w"),
        Check(1)..int.p("h")
    )

    bool(
        "SetWindowMaximumSize",

        SDL_Window.p("window"),
        int("max_w"),
        int("max_h")
    )

    bool(
        "GetWindowMaximumSize",

        SDL_Window.p("window"),
        Check(1)..int.p("w"),
        Check(1)..int.p("h")
    )

    bool(
        "SetWindowBordered",

        SDL_Window.p("window"),
        bool("bordered")
    )

    bool(
        "SetWindowResizable",

        SDL_Window.p("window"),
        bool("resizable")
    )

    bool(
        "SetWindowAlwaysOnTop",

        SDL_Window.p("window"),
        bool("on_top")
    )

    bool(
        "ShowWindow",

        SDL_Window.p("window")
    )

    bool(
        "HideWindow",

        SDL_Window.p("window")
    )

    bool(
        "RaiseWindow",

        SDL_Window.p("window")
    )

    bool(
        "MaximizeWindow",

        SDL_Window.p("window")
    )

    bool(
        "MinimizeWindow",

        SDL_Window.p("window")
    )

    bool(
        "RestoreWindow",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowFullscreen",

        SDL_Window.p("window"),
        bool("fullscreen")
    )

    bool(
        "SyncWindow",

        SDL_Window.p("window")
    )

    bool(
        "WindowHasSurface",

        SDL_Window.p("window")
    )

    SDL_Surface.p(
        "GetWindowSurface",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowSurfaceVSync",

        SDL_Window.p("window"),
        int("vsync")
    )

    bool(
        "GetWindowSurfaceVSync",

        SDL_Window.p("window"),
        Check(1)..int.p("vsync")
    )

    bool(
        "UpdateWindowSurface",

        SDL_Window.p("window")
    )

    bool(
        "UpdateWindowSurfaceRects",

        SDL_Window.p("window"),
        SDL_Rect.const.p("rects"),
        AutoSize("rects")..int("numrects")
    )

    bool(
        "DestroyWindowSurface",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowKeyboardGrab",

        SDL_Window.p("window"),
        bool("grabbed")
    )

    bool(
        "SetWindowMouseGrab",

        SDL_Window.p("window"),
        bool("grabbed")
    )

    bool(
        "GetWindowKeyboardGrab",

        SDL_Window.p("window")
    )

    bool(
        "GetWindowMouseGrab",

        SDL_Window.p("window")
    )

    SDL_Window.p(
        "GetGrabbedWindow",

        void()
    )

    bool(
        "SetWindowMouseRect",

        SDL_Window.p("window"),
        Check(1)..SDL_Rect.const.p("rect")
    )

    SDL_Rect.const.p(
        "GetWindowMouseRect",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowOpacity",

        SDL_Window.p("window"),
        float("opacity")
    )

    float(
        "GetWindowOpacity",

        SDL_Window.p("window")
    )

    bool(
        "SetWindowParent",

        SDL_Window.p("window"),
        SDL_Window.p("parent")
    )

    bool(
        "SetWindowModal",

        SDL_Window.p("window"),
        bool("modal")
    )

    bool(
        "SetWindowFocusable",

        SDL_Window.p("window"),
        bool("focusable")
    )

    bool(
        "ShowWindowSystemMenu",

        SDL_Window.p("window"),
        int("x"),
        int("y")
    )

    bool(
        "SetWindowHitTest",

        SDL_Window.p("window"),
        SDL_HitTest("callback"),
        nullable..opaque_p("callback_data")
    )

    bool(
        "SetWindowShape",

        SDL_Window.p("window"),
        Check(1)..SDL_Surface.p("shape")
    )

    bool(
        "FlashWindow",

        SDL_Window.p("window"),
        SDL_FlashOperation("operation")
    )

    void(
        "DestroyWindow",

        SDL_Window.p("window")
    )

    bool(
        "ScreenSaverEnabled",

        void()
    )

    bool(
        "EnableScreenSaver",

        void()
    )

    bool(
        "DisableScreenSaver",

        void()
    )

    bool(
        "GL_LoadLibrary",

        nullable..charUTF8.const.p("path")
    )

    SDL_FunctionPointer(
        "GL_GetProcAddress",

        charUTF8.const.p("proc")
    )

    SDL_FunctionPointer(
        "EGL_GetProcAddress",

        charUTF8.const.p("proc")
    )

    void(
        "GL_UnloadLibrary",

        void()
    )

    bool(
        "GL_ExtensionSupported",

        charUTF8.const.p("extension")
    )

    void(
        "GL_ResetAttributes",

        void()
    )

    bool(
        "GL_SetAttribute",

        SDL_GLAttr("attr"),
        int("value")
    )

    bool(
        "GL_GetAttribute",

        SDL_GLAttr("attr"),
        Check(1)..int.p("value")
    )

    SDL_GLContext(
        "GL_CreateContext",

        SDL_Window.p("window")
    )

    bool(
        "GL_MakeCurrent",

        SDL_Window.p("window"),
        nullable..SDL_GLContext("context")
    )

    SDL_Window.p(
        "GL_GetCurrentWindow",

        void()
    )

    SDL_GLContext(
        "GL_GetCurrentContext",

        void()
    )

    SDL_EGLDisplay(
        "EGL_GetCurrentDisplay",

        void()
    )

    SDL_EGLConfig(
        "EGL_GetCurrentConfig",

        void()
    )

    SDL_EGLSurface(
        "EGL_GetWindowSurface",

        SDL_Window.p("window")
    )

    void(
        "EGL_SetAttributeCallbacks",

        SDL_EGLAttribArrayCallback("platformAttribCallback"),
        SDL_EGLIntArrayCallback("surfaceAttribCallback"),
        SDL_EGLIntArrayCallback("contextAttribCallback"),
        nullable..opaque_p("userdata")
    )

    bool(
        "GL_SetSwapInterval",

        int("interval")
    )

    bool(
        "GL_GetSwapInterval",

        Check(1)..int.p("interval")
    )

    bool(
        "GL_SwapWindow",

        SDL_Window.p("window")
    )

    bool(
        "GL_DestroyContext",

        SDL_GLContext("context")
    )

    macro(expression = "(SDL_WINDOWPOS_UNDEFINED_MASK|(X))")..uint32_t(
        "SDL_WINDOWPOS_UNDEFINED_DISPLAY",
        SDL_DisplayID("X"),
        noPrefix = true
    )
    macro(expression = "(((X)&0xFFFF0000) == SDL_WINDOWPOS_UNDEFINED_MASK)")..bool(
        "SDL_WINDOWPOS_ISUNDEFINED",
        uint32_t("X"),
        noPrefix = true
    )
    macro(expression = "(SDL_WINDOWPOS_CENTERED_MASK|(X))")..uint32_t(
        "SDL_WINDOWPOS_CENTERED_DISPLAY",
        SDL_DisplayID("X"),
        noPrefix = true
    )
    macro(expression = "(((X)&0xFFFF0000) == SDL_WINDOWPOS_CENTERED_MASK)")..bool(
        "SDL_WINDOWPOS_ISCENTERED",
        uint32_t("X"),
        noPrefix = true
    )
}