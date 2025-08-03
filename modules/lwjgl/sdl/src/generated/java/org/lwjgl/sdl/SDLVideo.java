/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLVideo {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNumVideoDrivers              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumVideoDrivers"),
            GetVideoDriver                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetVideoDriver"),
            GetCurrentVideoDriver           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentVideoDriver"),
            GetSystemTheme                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSystemTheme"),
            GetDisplays                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplays"),
            GetPrimaryDisplay               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPrimaryDisplay"),
            GetDisplayProperties            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayProperties"),
            GetDisplayName                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayName"),
            GetDisplayBounds                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayBounds"),
            GetDisplayUsableBounds          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayUsableBounds"),
            GetNaturalDisplayOrientation    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNaturalDisplayOrientation"),
            GetCurrentDisplayOrientation    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentDisplayOrientation"),
            GetDisplayContentScale          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayContentScale"),
            GetFullscreenDisplayModes       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetFullscreenDisplayModes"),
            GetClosestFullscreenDisplayMode = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClosestFullscreenDisplayMode"),
            GetDesktopDisplayMode           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDesktopDisplayMode"),
            GetCurrentDisplayMode           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentDisplayMode"),
            GetDisplayForPoint              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayForPoint"),
            GetDisplayForRect               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayForRect"),
            GetDisplayForWindow             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDisplayForWindow"),
            GetWindowPixelDensity           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowPixelDensity"),
            GetWindowDisplayScale           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowDisplayScale"),
            SetWindowFullscreenMode         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFullscreenMode"),
            GetWindowFullscreenMode         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFullscreenMode"),
            GetWindowICCProfile             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowICCProfile"),
            GetWindowPixelFormat            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowPixelFormat"),
            GetWindows                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindows"),
            CreateWindow                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateWindow"),
            CreatePopupWindow               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreatePopupWindow"),
            CreateWindowWithProperties      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateWindowWithProperties"),
            GetWindowID                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowID"),
            GetWindowFromID                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFromID"),
            GetWindowParent                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowParent"),
            GetWindowProperties             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowProperties"),
            GetWindowFlags                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFlags"),
            SetWindowTitle                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowTitle"),
            GetWindowTitle                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowTitle"),
            SetWindowIcon                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowIcon"),
            SetWindowPosition               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowPosition"),
            GetWindowPosition               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowPosition"),
            SetWindowSize                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowSize"),
            GetWindowSize                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSize"),
            GetWindowSafeArea               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSafeArea"),
            SetWindowAspectRatio            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowAspectRatio"),
            GetWindowAspectRatio            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowAspectRatio"),
            GetWindowBordersSize            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowBordersSize"),
            GetWindowSizeInPixels           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSizeInPixels"),
            SetWindowMinimumSize            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMinimumSize"),
            GetWindowMinimumSize            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMinimumSize"),
            SetWindowMaximumSize            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMaximumSize"),
            GetWindowMaximumSize            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMaximumSize"),
            SetWindowBordered               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowBordered"),
            SetWindowResizable              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowResizable"),
            SetWindowAlwaysOnTop            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowAlwaysOnTop"),
            ShowWindow                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowWindow"),
            HideWindow                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HideWindow"),
            RaiseWindow                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RaiseWindow"),
            MaximizeWindow                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MaximizeWindow"),
            MinimizeWindow                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MinimizeWindow"),
            RestoreWindow                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RestoreWindow"),
            SetWindowFullscreen             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFullscreen"),
            SyncWindow                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SyncWindow"),
            WindowHasSurface                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WindowHasSurface"),
            GetWindowSurface                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSurface"),
            SetWindowSurfaceVSync           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowSurfaceVSync"),
            GetWindowSurfaceVSync           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowSurfaceVSync"),
            UpdateWindowSurface             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateWindowSurface"),
            UpdateWindowSurfaceRects        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateWindowSurfaceRects"),
            DestroyWindowSurface            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyWindowSurface"),
            SetWindowKeyboardGrab           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowKeyboardGrab"),
            SetWindowMouseGrab              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMouseGrab"),
            GetWindowKeyboardGrab           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowKeyboardGrab"),
            GetWindowMouseGrab              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMouseGrab"),
            GetGrabbedWindow                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGrabbedWindow"),
            SetWindowMouseRect              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowMouseRect"),
            GetWindowMouseRect              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowMouseRect"),
            SetWindowOpacity                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowOpacity"),
            GetWindowOpacity                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowOpacity"),
            SetWindowParent                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowParent"),
            SetWindowModal                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowModal"),
            SetWindowFocusable              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowFocusable"),
            ShowWindowSystemMenu            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowWindowSystemMenu"),
            SetWindowHitTest                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowHitTest"),
            SetWindowShape                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowShape"),
            FlashWindow                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlashWindow"),
            DestroyWindow                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyWindow"),
            ScreenSaverEnabled              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ScreenSaverEnabled"),
            EnableScreenSaver               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnableScreenSaver"),
            DisableScreenSaver              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DisableScreenSaver"),
            GL_LoadLibrary                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_LoadLibrary"),
            GL_GetProcAddress               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetProcAddress"),
            EGL_GetProcAddress              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetProcAddress"),
            GL_UnloadLibrary                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_UnloadLibrary"),
            GL_ExtensionSupported           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_ExtensionSupported"),
            GL_ResetAttributes              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_ResetAttributes"),
            GL_SetAttribute                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_SetAttribute"),
            GL_GetAttribute                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetAttribute"),
            GL_CreateContext                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_CreateContext"),
            GL_MakeCurrent                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_MakeCurrent"),
            GL_GetCurrentWindow             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetCurrentWindow"),
            GL_GetCurrentContext            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetCurrentContext"),
            EGL_GetCurrentDisplay           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetCurrentDisplay"),
            EGL_GetCurrentConfig            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetCurrentConfig"),
            EGL_GetWindowSurface            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_GetWindowSurface"),
            EGL_SetAttributeCallbacks       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EGL_SetAttributeCallbacks"),
            GL_SetSwapInterval              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_SetSwapInterval"),
            GL_GetSwapInterval              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_GetSwapInterval"),
            GL_SwapWindow                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_SwapWindow"),
            GL_DestroyContext               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GL_DestroyContext");

    }

    public static final String SDL_PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER = "SDL.video.wayland.wl_display";

    public static final int
        SDL_SYSTEM_THEME_UNKNOWN = 0,
        SDL_SYSTEM_THEME_LIGHT   = 1,
        SDL_SYSTEM_THEME_DARK    = 2;

    public static final int
        SDL_ORIENTATION_UNKNOWN           = 0,
        SDL_ORIENTATION_LANDSCAPE         = 1,
        SDL_ORIENTATION_LANDSCAPE_FLIPPED = 2,
        SDL_ORIENTATION_PORTRAIT          = 3,
        SDL_ORIENTATION_PORTRAIT_FLIPPED  = 4;

    public static final long
        SDL_WINDOW_FULLSCREEN          = 0x0000000000000001L,
        SDL_WINDOW_OPENGL              = 0x0000000000000002L,
        SDL_WINDOW_OCCLUDED            = 0x0000000000000004L,
        SDL_WINDOW_HIDDEN              = 0x0000000000000008L,
        SDL_WINDOW_BORDERLESS          = 0x0000000000000010L,
        SDL_WINDOW_RESIZABLE           = 0x0000000000000020L,
        SDL_WINDOW_MINIMIZED           = 0x0000000000000040L,
        SDL_WINDOW_MAXIMIZED           = 0x0000000000000080L,
        SDL_WINDOW_MOUSE_GRABBED       = 0x0000000000000100L,
        SDL_WINDOW_INPUT_FOCUS         = 0x0000000000000200L,
        SDL_WINDOW_MOUSE_FOCUS         = 0x0000000000000400L,
        SDL_WINDOW_EXTERNAL            = 0x0000000000000800L,
        SDL_WINDOW_MODAL               = 0x0000000000001000L,
        SDL_WINDOW_HIGH_PIXEL_DENSITY  = 0x0000000000002000L,
        SDL_WINDOW_MOUSE_CAPTURE       = 0x0000000000004000L,
        SDL_WINDOW_MOUSE_RELATIVE_MODE = 0x0000000000008000L,
        SDL_WINDOW_ALWAYS_ON_TOP       = 0x0000000000010000L,
        SDL_WINDOW_UTILITY             = 0x0000000000020000L,
        SDL_WINDOW_TOOLTIP             = 0x0000000000040000L,
        SDL_WINDOW_POPUP_MENU          = 0x0000000000080000L,
        SDL_WINDOW_KEYBOARD_GRABBED    = 0x0000000000100000L,
        SDL_WINDOW_VULKAN              = 0x0000000010000000L,
        SDL_WINDOW_METAL               = 0x0000000020000000L,
        SDL_WINDOW_TRANSPARENT         = 0x0000000040000000L,
        SDL_WINDOW_NOT_FOCUSABLE       = 0x0000000080000000L;

    public static final int
        SDL_WINDOWPOS_UNDEFINED_MASK = 0x1FFF0000,
        SDL_WINDOWPOS_UNDEFINED      = SDL_WINDOWPOS_UNDEFINED_DISPLAY(0),
        SDL_WINDOWPOS_CENTERED_MASK  = 0x2FFF0000,
        SDL_WINDOWPOS_CENTERED       = SDL_WINDOWPOS_CENTERED_DISPLAY(0);

    public static final int
        SDL_FLASH_CANCEL        = 0,
        SDL_FLASH_BRIEFLY       = 1,
        SDL_FLASH_UNTIL_FOCUSED = 2;

    public static final int
        SDL_GL_RED_SIZE                   = 0,
        SDL_GL_GREEN_SIZE                 = 1,
        SDL_GL_BLUE_SIZE                  = 2,
        SDL_GL_ALPHA_SIZE                 = 3,
        SDL_GL_BUFFER_SIZE                = 4,
        SDL_GL_DOUBLEBUFFER               = 5,
        SDL_GL_DEPTH_SIZE                 = 6,
        SDL_GL_STENCIL_SIZE               = 7,
        SDL_GL_ACCUM_RED_SIZE             = 8,
        SDL_GL_ACCUM_GREEN_SIZE           = 9,
        SDL_GL_ACCUM_BLUE_SIZE            = 10,
        SDL_GL_ACCUM_ALPHA_SIZE           = 11,
        SDL_GL_STEREO                     = 12,
        SDL_GL_MULTISAMPLEBUFFERS         = 13,
        SDL_GL_MULTISAMPLESAMPLES         = 14,
        SDL_GL_ACCELERATED_VISUAL         = 15,
        SDL_GL_RETAINED_BACKING           = 16,
        SDL_GL_CONTEXT_MAJOR_VERSION      = 17,
        SDL_GL_CONTEXT_MINOR_VERSION      = 18,
        SDL_GL_CONTEXT_FLAGS              = 19,
        SDL_GL_CONTEXT_PROFILE_MASK       = 20,
        SDL_GL_SHARE_WITH_CURRENT_CONTEXT = 21,
        SDL_GL_FRAMEBUFFER_SRGB_CAPABLE   = 22,
        SDL_GL_CONTEXT_RELEASE_BEHAVIOR   = 23,
        SDL_GL_CONTEXT_RESET_NOTIFICATION = 24,
        SDL_GL_CONTEXT_NO_ERROR           = 25,
        SDL_GL_FLOATBUFFERS               = 26,
        SDL_GL_EGL_PLATFORM               = 27;

    public static final int
        SDL_GL_CONTEXT_PROFILE_CORE          = 0x0001,
        SDL_GL_CONTEXT_PROFILE_COMPATIBILITY = 0x0002,
        SDL_GL_CONTEXT_PROFILE_ES            = 0x0004;

    public static final int
        SDL_GL_CONTEXT_DEBUG_FLAG              = 0x0001,
        SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = 0x0002,
        SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG      = 0x0004,
        SDL_GL_CONTEXT_RESET_ISOLATION_FLAG    = 0x0008;

    public static final int
        SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE  = 0x0000,
        SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x0001;

    public static final int
        SDL_GL_CONTEXT_RESET_NO_NOTIFICATION = 0x0000,
        SDL_GL_CONTEXT_RESET_LOSE_CONTEXT    = 0x0001;

    public static final String
        SDL_PROP_DISPLAY_HDR_ENABLED_BOOLEAN             = "SDL.display.HDR_enabled",
        SDL_PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER = "SDL.display.KMSDRM.panel_orientation";

    public static final String
        SDL_PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN               = "SDL.window.create.always_on_top",
        SDL_PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN                  = "SDL.window.create.borderless",
        SDL_PROP_WINDOW_CREATE_CONSTRAIN_POPUP_BOOLEAN             = "SDL.window.create.constrain_popup",
        SDL_PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN                   = "SDL.window.create.focusable",
        SDL_PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN   = "SDL.window.create.external_graphics_context",
        SDL_PROP_WINDOW_CREATE_FLAGS_NUMBER                        = "SDL.window.create.flags",
        SDL_PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN                  = "SDL.window.create.fullscreen",
        SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER                       = "SDL.window.create.height",
        SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN                      = "SDL.window.create.hidden",
        SDL_PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN          = "SDL.window.create.high_pixel_density",
        SDL_PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN                   = "SDL.window.create.maximized",
        SDL_PROP_WINDOW_CREATE_MENU_BOOLEAN                        = "SDL.window.create.menu",
        SDL_PROP_WINDOW_CREATE_METAL_BOOLEAN                       = "SDL.window.create.metal",
        SDL_PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN                   = "SDL.window.create.minimized",
        SDL_PROP_WINDOW_CREATE_MODAL_BOOLEAN                       = "SDL.window.create.modal",
        SDL_PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN               = "SDL.window.create.mouse_grabbed",
        SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN                      = "SDL.window.create.opengl",
        SDL_PROP_WINDOW_CREATE_PARENT_POINTER                      = "SDL.window.create.parent",
        SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN                   = "SDL.window.create.resizable",
        SDL_PROP_WINDOW_CREATE_TITLE_STRING                        = "SDL.window.create.title",
        SDL_PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN                 = "SDL.window.create.transparent",
        SDL_PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN                     = "SDL.window.create.tooltip",
        SDL_PROP_WINDOW_CREATE_UTILITY_BOOLEAN                     = "SDL.window.create.utility",
        SDL_PROP_WINDOW_CREATE_VULKAN_BOOLEAN                      = "SDL.window.create.vulkan",
        SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER                        = "SDL.window.create.width",
        SDL_PROP_WINDOW_CREATE_X_NUMBER                            = "SDL.window.create.x",
        SDL_PROP_WINDOW_CREATE_Y_NUMBER                            = "SDL.window.create.y",
        SDL_PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER                = "SDL.window.create.cocoa.window",
        SDL_PROP_WINDOW_CREATE_COCOA_VIEW_POINTER                  = "SDL.window.create.cocoa.view",
        SDL_PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN = "SDL.window.create.wayland.surface_role_custom",
        SDL_PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN   = "SDL.window.create.wayland.create_egl_window",
        SDL_PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER          = "SDL.window.create.wayland.wl_surface",
        SDL_PROP_WINDOW_CREATE_WIN32_HWND_POINTER                  = "SDL.window.create.win32.hwnd",
        SDL_PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER     = "SDL.window.create.win32.pixel_format_hwnd",
        SDL_PROP_WINDOW_CREATE_X11_WINDOW_NUMBER                   = "SDL.window.create.x11.window";

    public static final String
        SDL_PROP_WINDOW_SHAPE_POINTER                             = "SDL.window.shape",
        SDL_PROP_WINDOW_HDR_ENABLED_BOOLEAN                       = "SDL.window.HDR_enabled",
        SDL_PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT                     = "SDL.window.SDR_white_level",
        SDL_PROP_WINDOW_HDR_HEADROOM_FLOAT                        = "SDL.window.HDR_headroom",
        SDL_PROP_WINDOW_ANDROID_WINDOW_POINTER                    = "SDL.window.android.window",
        SDL_PROP_WINDOW_ANDROID_SURFACE_POINTER                   = "SDL.window.android.surface",
        SDL_PROP_WINDOW_UIKIT_WINDOW_POINTER                      = "SDL.window.uikit.window",
        SDL_PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER               = "SDL.window.uikit.metal_view_tag",
        SDL_PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER           = "SDL.window.uikit.opengl.framebuffer",
        SDL_PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER          = "SDL.window.uikit.opengl.renderbuffer",
        SDL_PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER   = "SDL.window.uikit.opengl.resolve_framebuffer",
        SDL_PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER                = "SDL.window.kmsdrm.dev_index",
        SDL_PROP_WINDOW_KMSDRM_DRM_FD_NUMBER                      = "SDL.window.kmsdrm.drm_fd",
        SDL_PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER                 = "SDL.window.kmsdrm.gbm_dev",
        SDL_PROP_WINDOW_COCOA_WINDOW_POINTER                      = "SDL.window.cocoa.window",
        SDL_PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER               = "SDL.window.cocoa.metal_view_tag",
        SDL_PROP_WINDOW_OPENVR_OVERLAY_ID                         = "SDL.window.openvr.overlay_id",
        SDL_PROP_WINDOW_VIVANTE_DISPLAY_POINTER                   = "SDL.window.vivante.display",
        SDL_PROP_WINDOW_VIVANTE_WINDOW_POINTER                    = "SDL.window.vivante.window",
        SDL_PROP_WINDOW_VIVANTE_SURFACE_POINTER                   = "SDL.window.vivante.surface",
        SDL_PROP_WINDOW_WIN32_HWND_POINTER                        = "SDL.window.win32.hwnd",
        SDL_PROP_WINDOW_WIN32_HDC_POINTER                         = "SDL.window.win32.hdc",
        SDL_PROP_WINDOW_WIN32_INSTANCE_POINTER                    = "SDL.window.win32.instance",
        SDL_PROP_WINDOW_WAYLAND_DISPLAY_POINTER                   = "SDL.window.wayland.display",
        SDL_PROP_WINDOW_WAYLAND_SURFACE_POINTER                   = "SDL.window.wayland.surface",
        SDL_PROP_WINDOW_WAYLAND_VIEWPORT_POINTER                  = "SDL.window.wayland.viewport",
        SDL_PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER                = "SDL.window.wayland.egl_window",
        SDL_PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER               = "SDL.window.wayland.xdg_surface",
        SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER              = "SDL.window.wayland.xdg_toplevel",
        SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING = "SDL.window.wayland.xdg_toplevel_export_handle",
        SDL_PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER                 = "SDL.window.wayland.xdg_popup",
        SDL_PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER            = "SDL.window.wayland.xdg_positioner",
        SDL_PROP_WINDOW_X11_DISPLAY_POINTER                       = "SDL.window.x11.display",
        SDL_PROP_WINDOW_X11_SCREEN_NUMBER                         = "SDL.window.x11.screen",
        SDL_PROP_WINDOW_X11_WINDOW_NUMBER                         = "SDL.window.x11.window";

    public static final int
        SDL_WINDOW_SURFACE_VSYNC_DISABLED = 0,
        SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE = -1;

    public static final int
        SDL_HITTEST_NORMAL             = 0,
        SDL_HITTEST_DRAGGABLE          = 1,
        SDL_HITTEST_RESIZE_TOPLEFT     = 2,
        SDL_HITTEST_RESIZE_TOP         = 3,
        SDL_HITTEST_RESIZE_TOPRIGHT    = 4,
        SDL_HITTEST_RESIZE_RIGHT       = 5,
        SDL_HITTEST_RESIZE_BOTTOMRIGHT = 6,
        SDL_HITTEST_RESIZE_BOTTOM      = 7,
        SDL_HITTEST_RESIZE_BOTTOMLEFT  = 8,
        SDL_HITTEST_RESIZE_LEFT        = 9;

    protected SDLVideo() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetNumVideoDrivers ] ---

    /** {@code int SDL_GetNumVideoDrivers(void)} */
    public static int SDL_GetNumVideoDrivers() {
        long __functionAddress = Functions.GetNumVideoDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetVideoDriver ] ---

    /** {@code char const * SDL_GetVideoDriver(int index)} */
    public static long nSDL_GetVideoDriver(int index) {
        long __functionAddress = Functions.GetVideoDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetVideoDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetVideoDriver(int index) {
        long __result = nSDL_GetVideoDriver(index);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCurrentVideoDriver ] ---

    /** {@code char const * SDL_GetCurrentVideoDriver(void)} */
    public static long nSDL_GetCurrentVideoDriver() {
        long __functionAddress = Functions.GetCurrentVideoDriver;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetCurrentVideoDriver(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCurrentVideoDriver() {
        long __result = nSDL_GetCurrentVideoDriver();
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetSystemTheme ] ---

    /** {@code SDL_SystemTheme SDL_GetSystemTheme(void)} */
    @NativeType("SDL_SystemTheme")
    public static int SDL_GetSystemTheme() {
        long __functionAddress = Functions.GetSystemTheme;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetDisplays ] ---

    /** {@code SDL_DisplayID * SDL_GetDisplays(int * count)} */
    public static long nSDL_GetDisplays(long count) {
        long __functionAddress = Functions.GetDisplays;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_DisplayID * SDL_GetDisplays(int * count)} */
    @NativeType("SDL_DisplayID *")
    public static @Nullable IntBuffer SDL_GetDisplays() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetDisplays(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPrimaryDisplay ] ---

    /** {@code SDL_DisplayID SDL_GetPrimaryDisplay(void)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetPrimaryDisplay() {
        long __functionAddress = Functions.GetPrimaryDisplay;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetDisplayProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetDisplayProperties(SDL_DisplayID displayID)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetDisplayProperties(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDisplayProperties;
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetDisplayName ] ---

    /** {@code char const * SDL_GetDisplayName(SDL_DisplayID displayID)} */
    public static long nSDL_GetDisplayName(int displayID) {
        long __functionAddress = Functions.GetDisplayName;
        return invokeP(displayID, __functionAddress);
    }

    /** {@code char const * SDL_GetDisplayName(SDL_DisplayID displayID)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetDisplayName(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetDisplayName(displayID);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetDisplayBounds ] ---

    /** {@code bool SDL_GetDisplayBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    public static boolean nSDL_GetDisplayBounds(int displayID, long rect) {
        long __functionAddress = Functions.GetDisplayBounds;
        return invokePZ(displayID, rect, __functionAddress);
    }

    /** {@code bool SDL_GetDisplayBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetDisplayBounds(@NativeType("SDL_DisplayID") int displayID, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetDisplayBounds(displayID, rect.address());
    }

    // --- [ SDL_GetDisplayUsableBounds ] ---

    /** {@code bool SDL_GetDisplayUsableBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    public static boolean nSDL_GetDisplayUsableBounds(int displayID, long rect) {
        long __functionAddress = Functions.GetDisplayUsableBounds;
        return invokePZ(displayID, rect, __functionAddress);
    }

    /** {@code bool SDL_GetDisplayUsableBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetDisplayUsableBounds(@NativeType("SDL_DisplayID") int displayID, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetDisplayUsableBounds(displayID, rect.address());
    }

    // --- [ SDL_GetNaturalDisplayOrientation ] ---

    /** {@code SDL_DisplayOrientation SDL_GetNaturalDisplayOrientation(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayOrientation")
    public static int SDL_GetNaturalDisplayOrientation(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetNaturalDisplayOrientation;
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetCurrentDisplayOrientation ] ---

    /** {@code SDL_DisplayOrientation SDL_GetCurrentDisplayOrientation(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayOrientation")
    public static int SDL_GetCurrentDisplayOrientation(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetCurrentDisplayOrientation;
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetDisplayContentScale ] ---

    /** {@code float SDL_GetDisplayContentScale(SDL_DisplayID displayID)} */
    public static float SDL_GetDisplayContentScale(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDisplayContentScale;
        return invokeF(displayID, __functionAddress);
    }

    // --- [ SDL_GetFullscreenDisplayModes ] ---

    /** {@code SDL_DisplayMode ** SDL_GetFullscreenDisplayModes(SDL_DisplayID displayID, int * count)} */
    public static long nSDL_GetFullscreenDisplayModes(int displayID, long count) {
        long __functionAddress = Functions.GetFullscreenDisplayModes;
        return invokePP(displayID, count, __functionAddress);
    }

    /** {@code SDL_DisplayMode ** SDL_GetFullscreenDisplayModes(SDL_DisplayID displayID, int * count)} */
    @NativeType("SDL_DisplayMode **")
    public static @Nullable PointerBuffer SDL_GetFullscreenDisplayModes(@NativeType("SDL_DisplayID") int displayID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetFullscreenDisplayModes(displayID, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetClosestFullscreenDisplayMode ] ---

    /** {@code bool SDL_GetClosestFullscreenDisplayMode(SDL_DisplayID displayID, int w, int h, float refresh_rate, bool include_high_density_modes, SDL_DisplayMode * closest)} */
    public static boolean nSDL_GetClosestFullscreenDisplayMode(int displayID, int w, int h, float refresh_rate, boolean include_high_density_modes, long closest) {
        long __functionAddress = Functions.GetClosestFullscreenDisplayMode;
        return invokePZ(displayID, w, h, refresh_rate, include_high_density_modes, closest, __functionAddress);
    }

    /** {@code bool SDL_GetClosestFullscreenDisplayMode(SDL_DisplayID displayID, int w, int h, float refresh_rate, bool include_high_density_modes, SDL_DisplayMode * closest)} */
    @NativeType("bool")
    public static boolean SDL_GetClosestFullscreenDisplayMode(@NativeType("SDL_DisplayID") int displayID, int w, int h, float refresh_rate, @NativeType("bool") boolean include_high_density_modes, @NativeType("SDL_DisplayMode *") SDL_DisplayMode closest) {
        return nSDL_GetClosestFullscreenDisplayMode(displayID, w, h, refresh_rate, include_high_density_modes, closest.address());
    }

    // --- [ SDL_GetDesktopDisplayMode ] ---

    /** {@code SDL_DisplayMode const * SDL_GetDesktopDisplayMode(SDL_DisplayID displayID)} */
    public static long nSDL_GetDesktopDisplayMode(int displayID) {
        long __functionAddress = Functions.GetDesktopDisplayMode;
        return invokeP(displayID, __functionAddress);
    }

    /** {@code SDL_DisplayMode const * SDL_GetDesktopDisplayMode(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayMode const *")
    public static @Nullable SDL_DisplayMode SDL_GetDesktopDisplayMode(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetDesktopDisplayMode(displayID);
        return SDL_DisplayMode.createSafe(__result);
    }

    // --- [ SDL_GetCurrentDisplayMode ] ---

    /** {@code SDL_DisplayMode const * SDL_GetCurrentDisplayMode(SDL_DisplayID displayID)} */
    public static long nSDL_GetCurrentDisplayMode(int displayID) {
        long __functionAddress = Functions.GetCurrentDisplayMode;
        return invokeP(displayID, __functionAddress);
    }

    /** {@code SDL_DisplayMode const * SDL_GetCurrentDisplayMode(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayMode const *")
    public static @Nullable SDL_DisplayMode SDL_GetCurrentDisplayMode(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetCurrentDisplayMode(displayID);
        return SDL_DisplayMode.createSafe(__result);
    }

    // --- [ SDL_GetDisplayForPoint ] ---

    /** {@code SDL_DisplayID SDL_GetDisplayForPoint(SDL_Point const * point)} */
    public static int nSDL_GetDisplayForPoint(long point) {
        long __functionAddress = Functions.GetDisplayForPoint;
        return invokePI(point, __functionAddress);
    }

    /** {@code SDL_DisplayID SDL_GetDisplayForPoint(SDL_Point const * point)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForPoint(@NativeType("SDL_Point const *") SDL_Point point) {
        return nSDL_GetDisplayForPoint(point.address());
    }

    // --- [ SDL_GetDisplayForRect ] ---

    /** {@code SDL_DisplayID SDL_GetDisplayForRect(SDL_Rect const * rect)} */
    public static int nSDL_GetDisplayForRect(long rect) {
        long __functionAddress = Functions.GetDisplayForRect;
        return invokePI(rect, __functionAddress);
    }

    /** {@code SDL_DisplayID SDL_GetDisplayForRect(SDL_Rect const * rect)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForRect(@NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_GetDisplayForRect(rect.address());
    }

    // --- [ SDL_GetDisplayForWindow ] ---

    /** {@code SDL_DisplayID SDL_GetDisplayForWindow(SDL_Window * window)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetDisplayForWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindowPixelDensity ] ---

    /** {@code float SDL_GetWindowPixelDensity(SDL_Window * window)} */
    public static float SDL_GetWindowPixelDensity(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowPixelDensity;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ SDL_GetWindowDisplayScale ] ---

    /** {@code float SDL_GetWindowDisplayScale(SDL_Window * window)} */
    public static float SDL_GetWindowDisplayScale(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowDisplayScale;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ SDL_SetWindowFullscreenMode ] ---

    /** {@code bool SDL_SetWindowFullscreenMode(SDL_Window * window, SDL_DisplayMode const * mode)} */
    public static boolean nSDL_SetWindowFullscreenMode(long window, long mode) {
        long __functionAddress = Functions.SetWindowFullscreenMode;
        if (CHECKS) {
            check(window);
            if (mode != NULL) { SDL_DisplayMode.validate(mode); }
        }
        return invokePPZ(window, mode, __functionAddress);
    }

    /** {@code bool SDL_SetWindowFullscreenMode(SDL_Window * window, SDL_DisplayMode const * mode)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowFullscreenMode(@NativeType("SDL_Window *") long window, @NativeType("SDL_DisplayMode const *") @Nullable SDL_DisplayMode mode) {
        return nSDL_SetWindowFullscreenMode(window, memAddressSafe(mode));
    }

    // --- [ SDL_GetWindowFullscreenMode ] ---

    /** {@code SDL_DisplayMode const * SDL_GetWindowFullscreenMode(SDL_Window * window)} */
    public static long nSDL_GetWindowFullscreenMode(long window) {
        long __functionAddress = Functions.GetWindowFullscreenMode;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code SDL_DisplayMode const * SDL_GetWindowFullscreenMode(SDL_Window * window)} */
    @NativeType("SDL_DisplayMode const *")
    public static @Nullable SDL_DisplayMode SDL_GetWindowFullscreenMode(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowFullscreenMode(window);
        return SDL_DisplayMode.createSafe(__result);
    }

    // --- [ SDL_GetWindowICCProfile ] ---

    /** {@code void * SDL_GetWindowICCProfile(SDL_Window * window, size_t * size)} */
    public static long nSDL_GetWindowICCProfile(long window, long size) {
        long __functionAddress = Functions.GetWindowICCProfile;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, size, __functionAddress);
    }

    /** {@code void * SDL_GetWindowICCProfile(SDL_Window * window, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_GetWindowICCProfile(@NativeType("SDL_Window *") long window) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nSDL_GetWindowICCProfile(window, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetWindowPixelFormat ] ---

    /** {@code SDL_PixelFormat SDL_GetWindowPixelFormat(SDL_Window * window)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_GetWindowPixelFormat(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowPixelFormat;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindows ] ---

    /** {@code SDL_Window ** SDL_GetWindows(int * count)} */
    public static long nSDL_GetWindows(long count) {
        long __functionAddress = Functions.GetWindows;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_Window ** SDL_GetWindows(int * count)} */
    @NativeType("SDL_Window **")
    public static @Nullable PointerBuffer SDL_GetWindows() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetWindows(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateWindow ] ---

    /** {@code SDL_Window * SDL_CreateWindow(char const * title, int w, int h, SDL_WindowFlags flags)} */
    public static long nSDL_CreateWindow(long title, int w, int h, long flags) {
        long __functionAddress = Functions.CreateWindow;
        return invokePJP(title, w, h, flags, __functionAddress);
    }

    /** {@code SDL_Window * SDL_CreateWindow(char const * title, int w, int h, SDL_WindowFlags flags)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreateWindow(@NativeType("char const *") @Nullable ByteBuffer title, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        if (CHECKS) {
            checkNT1Safe(title);
        }
        return nSDL_CreateWindow(memAddressSafe(title), w, h, flags);
    }

    /** {@code SDL_Window * SDL_CreateWindow(char const * title, int w, int h, SDL_WindowFlags flags)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreateWindow(@NativeType("char const *") @Nullable CharSequence title, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(title, true);
            long titleEncoded = title == null ? NULL : stack.getPointerAddress();
            return nSDL_CreateWindow(titleEncoded, w, h, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreatePopupWindow ] ---

    /** {@code SDL_Window * SDL_CreatePopupWindow(SDL_Window * parent, int offset_x, int offset_y, int w, int h, SDL_WindowFlags flags)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreatePopupWindow(@NativeType("SDL_Window *") long parent, int offset_x, int offset_y, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        long __functionAddress = Functions.CreatePopupWindow;
        if (CHECKS) {
            check(parent);
        }
        return invokePJP(parent, offset_x, offset_y, w, h, flags, __functionAddress);
    }

    // --- [ SDL_CreateWindowWithProperties ] ---

    /** {@code SDL_Window * SDL_CreateWindowWithProperties(SDL_PropertiesID props)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreateWindowWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateWindowWithProperties;
        return invokeP(props, __functionAddress);
    }

    // --- [ SDL_GetWindowID ] ---

    /** {@code SDL_WindowID SDL_GetWindowID(SDL_Window * window)} */
    @NativeType("SDL_WindowID")
    public static int SDL_GetWindowID(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowID;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindowFromID ] ---

    /** {@code SDL_Window * SDL_GetWindowFromID(SDL_WindowID id)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetWindowFromID(@NativeType("SDL_WindowID") int id) {
        long __functionAddress = Functions.GetWindowFromID;
        return invokeP(id, __functionAddress);
    }

    // --- [ SDL_GetWindowParent ] ---

    /** {@code SDL_Window * SDL_GetWindowParent(SDL_Window * window)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetWindowParent(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowParent;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_GetWindowProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetWindowProperties(SDL_Window * window)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetWindowProperties(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowProperties;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindowFlags ] ---

    /** {@code SDL_WindowFlags SDL_GetWindowFlags(SDL_Window * window)} */
    @NativeType("SDL_WindowFlags")
    public static long SDL_GetWindowFlags(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowFlags;
        if (CHECKS) {
            check(window);
        }
        return invokePJ(window, __functionAddress);
    }

    // --- [ SDL_SetWindowTitle ] ---

    /** {@code bool SDL_SetWindowTitle(SDL_Window * window, char const * title)} */
    public static boolean nSDL_SetWindowTitle(long window, long title) {
        long __functionAddress = Functions.SetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, title, __functionAddress);
    }

    /** {@code bool SDL_SetWindowTitle(SDL_Window * window, char const * title)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowTitle(@NativeType("SDL_Window *") long window, @NativeType("char const *") @Nullable ByteBuffer title) {
        if (CHECKS) {
            checkNT1Safe(title);
        }
        return nSDL_SetWindowTitle(window, memAddressSafe(title));
    }

    /** {@code bool SDL_SetWindowTitle(SDL_Window * window, char const * title)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowTitle(@NativeType("SDL_Window *") long window, @NativeType("char const *") @Nullable CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(title, true);
            long titleEncoded = title == null ? NULL : stack.getPointerAddress();
            return nSDL_SetWindowTitle(window, titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetWindowTitle ] ---

    /** {@code char const * SDL_GetWindowTitle(SDL_Window * window)} */
    public static long nSDL_GetWindowTitle(long window) {
        long __functionAddress = Functions.GetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code char const * SDL_GetWindowTitle(SDL_Window * window)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetWindowTitle(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowTitle(window);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_SetWindowIcon ] ---

    /** {@code bool SDL_SetWindowIcon(SDL_Window * window, SDL_Surface * icon)} */
    public static boolean nSDL_SetWindowIcon(long window, long icon) {
        long __functionAddress = Functions.SetWindowIcon;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, icon, __functionAddress);
    }

    /** {@code bool SDL_SetWindowIcon(SDL_Window * window, SDL_Surface * icon)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowIcon(@NativeType("SDL_Window *") long window, @NativeType("SDL_Surface *") SDL_Surface icon) {
        return nSDL_SetWindowIcon(window, icon.address());
    }

    // --- [ SDL_SetWindowPosition ] ---

    /** {@code bool SDL_SetWindowPosition(SDL_Window * window, int x, int y)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowPosition(@NativeType("SDL_Window *") long window, int x, int y) {
        long __functionAddress = Functions.SetWindowPosition;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, x, y, __functionAddress);
    }

    // --- [ SDL_GetWindowPosition ] ---

    /** {@code bool SDL_GetWindowPosition(SDL_Window * window, int * x, int * y)} */
    public static boolean nSDL_GetWindowPosition(long window, long x, long y) {
        long __functionAddress = Functions.GetWindowPosition;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, x, y, __functionAddress);
    }

    /** {@code bool SDL_GetWindowPosition(SDL_Window * window, int * x, int * y)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowPosition(@NativeType("SDL_Window *") long window, @NativeType("int *") @Nullable IntBuffer x, @NativeType("int *") @Nullable IntBuffer y) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
        }
        return nSDL_GetWindowPosition(window, memAddressSafe(x), memAddressSafe(y));
    }

    // --- [ SDL_SetWindowSize ] ---

    /** {@code bool SDL_SetWindowSize(SDL_Window * window, int w, int h)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowSize(@NativeType("SDL_Window *") long window, int w, int h) {
        long __functionAddress = Functions.SetWindowSize;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, w, h, __functionAddress);
    }

    // --- [ SDL_GetWindowSize ] ---

    /** {@code bool SDL_GetWindowSize(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSize(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSize(@NativeType("SDL_Window *") long window, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetWindowSize(window, memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_GetWindowSafeArea ] ---

    /** {@code bool SDL_GetWindowSafeArea(SDL_Window * window, SDL_Rect * rect)} */
    public static boolean nSDL_GetWindowSafeArea(long window, long rect) {
        long __functionAddress = Functions.GetWindowSafeArea;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rect, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSafeArea(SDL_Window * window, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSafeArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetWindowSafeArea(window, rect.address());
    }

    // --- [ SDL_SetWindowAspectRatio ] ---

    /** {@code bool SDL_SetWindowAspectRatio(SDL_Window * window, float min_aspect, float max_aspect)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowAspectRatio(@NativeType("SDL_Window *") long window, float min_aspect, float max_aspect) {
        long __functionAddress = Functions.SetWindowAspectRatio;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, min_aspect, max_aspect, __functionAddress);
    }

    // --- [ SDL_GetWindowAspectRatio ] ---

    /** {@code bool SDL_GetWindowAspectRatio(SDL_Window * window, float * min_aspect, float * max_aspect)} */
    public static boolean nSDL_GetWindowAspectRatio(long window, long min_aspect, long max_aspect) {
        long __functionAddress = Functions.GetWindowAspectRatio;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, min_aspect, max_aspect, __functionAddress);
    }

    /** {@code bool SDL_GetWindowAspectRatio(SDL_Window * window, float * min_aspect, float * max_aspect)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowAspectRatio(@NativeType("SDL_Window *") long window, @NativeType("float *") @Nullable FloatBuffer min_aspect, @NativeType("float *") @Nullable FloatBuffer max_aspect) {
        if (CHECKS) {
            checkSafe(min_aspect, 1);
            checkSafe(max_aspect, 1);
        }
        return nSDL_GetWindowAspectRatio(window, memAddressSafe(min_aspect), memAddressSafe(max_aspect));
    }

    // --- [ SDL_GetWindowBordersSize ] ---

    /** {@code bool SDL_GetWindowBordersSize(SDL_Window * window, int * top, int * left, int * bottom, int * right)} */
    public static boolean nSDL_GetWindowBordersSize(long window, long top, long left, long bottom, long right) {
        long __functionAddress = Functions.GetWindowBordersSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPPZ(window, top, left, bottom, right, __functionAddress);
    }

    /** {@code bool SDL_GetWindowBordersSize(SDL_Window * window, int * top, int * left, int * bottom, int * right)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowBordersSize(@NativeType("SDL_Window *") long window, @NativeType("int *") @Nullable IntBuffer top, @NativeType("int *") @Nullable IntBuffer left, @NativeType("int *") @Nullable IntBuffer bottom, @NativeType("int *") @Nullable IntBuffer right) {
        if (CHECKS) {
            checkSafe(top, 1);
            checkSafe(left, 1);
            checkSafe(bottom, 1);
            checkSafe(right, 1);
        }
        return nSDL_GetWindowBordersSize(window, memAddressSafe(top), memAddressSafe(left), memAddressSafe(bottom), memAddressSafe(right));
    }

    // --- [ SDL_GetWindowSizeInPixels ] ---

    /** {@code bool SDL_GetWindowSizeInPixels(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowSizeInPixels(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowSizeInPixels;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSizeInPixels(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSizeInPixels(@NativeType("SDL_Window *") long window, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetWindowSizeInPixels(window, memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_SetWindowMinimumSize ] ---

    /** {@code bool SDL_SetWindowMinimumSize(SDL_Window * window, int min_w, int min_h)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMinimumSize(@NativeType("SDL_Window *") long window, int min_w, int min_h) {
        long __functionAddress = Functions.SetWindowMinimumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, min_w, min_h, __functionAddress);
    }

    // --- [ SDL_GetWindowMinimumSize ] ---

    /** {@code bool SDL_GetWindowMinimumSize(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowMinimumSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowMinimumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowMinimumSize(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowMinimumSize(@NativeType("SDL_Window *") long window, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetWindowMinimumSize(window, memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_SetWindowMaximumSize ] ---

    /** {@code bool SDL_SetWindowMaximumSize(SDL_Window * window, int max_w, int max_h)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMaximumSize(@NativeType("SDL_Window *") long window, int max_w, int max_h) {
        long __functionAddress = Functions.SetWindowMaximumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, max_w, max_h, __functionAddress);
    }

    // --- [ SDL_GetWindowMaximumSize ] ---

    /** {@code bool SDL_GetWindowMaximumSize(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowMaximumSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowMaximumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowMaximumSize(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowMaximumSize(@NativeType("SDL_Window *") long window, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetWindowMaximumSize(window, memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_SetWindowBordered ] ---

    /** {@code bool SDL_SetWindowBordered(SDL_Window * window, bool bordered)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowBordered(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean bordered) {
        long __functionAddress = Functions.SetWindowBordered;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, bordered, __functionAddress);
    }

    // --- [ SDL_SetWindowResizable ] ---

    /** {@code bool SDL_SetWindowResizable(SDL_Window * window, bool resizable)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowResizable(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean resizable) {
        long __functionAddress = Functions.SetWindowResizable;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, resizable, __functionAddress);
    }

    // --- [ SDL_SetWindowAlwaysOnTop ] ---

    /** {@code bool SDL_SetWindowAlwaysOnTop(SDL_Window * window, bool on_top)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowAlwaysOnTop(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean on_top) {
        long __functionAddress = Functions.SetWindowAlwaysOnTop;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, on_top, __functionAddress);
    }

    // --- [ SDL_ShowWindow ] ---

    /** {@code bool SDL_ShowWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ShowWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ShowWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_HideWindow ] ---

    /** {@code bool SDL_HideWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_HideWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.HideWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_RaiseWindow ] ---

    /** {@code bool SDL_RaiseWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_RaiseWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.RaiseWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_MaximizeWindow ] ---

    /** {@code bool SDL_MaximizeWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_MaximizeWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.MaximizeWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_MinimizeWindow ] ---

    /** {@code bool SDL_MinimizeWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_MinimizeWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.MinimizeWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_RestoreWindow ] ---

    /** {@code bool SDL_RestoreWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_RestoreWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.RestoreWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SetWindowFullscreen ] ---

    /** {@code bool SDL_SetWindowFullscreen(SDL_Window * window, bool fullscreen)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowFullscreen(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean fullscreen) {
        long __functionAddress = Functions.SetWindowFullscreen;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, fullscreen, __functionAddress);
    }

    // --- [ SDL_SyncWindow ] ---

    /** {@code bool SDL_SyncWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_SyncWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.SyncWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_WindowHasSurface ] ---

    /** {@code bool SDL_WindowHasSurface(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_WindowHasSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.WindowHasSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GetWindowSurface ] ---

    /** {@code SDL_Surface * SDL_GetWindowSurface(SDL_Window * window)} */
    public static long nSDL_GetWindowSurface(long window) {
        long __functionAddress = Functions.GetWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_GetWindowSurface(SDL_Window * window)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_GetWindowSurface(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowSurface(window);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_SetWindowSurfaceVSync ] ---

    /** {@code bool SDL_SetWindowSurfaceVSync(SDL_Window * window, int vsync)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowSurfaceVSync(@NativeType("SDL_Window *") long window, int vsync) {
        long __functionAddress = Functions.SetWindowSurfaceVSync;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, vsync, __functionAddress);
    }

    // --- [ SDL_GetWindowSurfaceVSync ] ---

    /** {@code bool SDL_GetWindowSurfaceVSync(SDL_Window * window, int * vsync)} */
    public static boolean nSDL_GetWindowSurfaceVSync(long window, long vsync) {
        long __functionAddress = Functions.GetWindowSurfaceVSync;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, vsync, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSurfaceVSync(SDL_Window * window, int * vsync)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSurfaceVSync(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer vsync) {
        if (CHECKS) {
            check(vsync, 1);
        }
        return nSDL_GetWindowSurfaceVSync(window, memAddress(vsync));
    }

    // --- [ SDL_UpdateWindowSurface ] ---

    /** {@code bool SDL_UpdateWindowSurface(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_UpdateWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.UpdateWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_UpdateWindowSurfaceRects ] ---

    /** {@code bool SDL_UpdateWindowSurfaceRects(SDL_Window * window, SDL_Rect const * rects, int numrects)} */
    public static boolean nSDL_UpdateWindowSurfaceRects(long window, long rects, int numrects) {
        long __functionAddress = Functions.UpdateWindowSurfaceRects;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rects, numrects, __functionAddress);
    }

    /** {@code bool SDL_UpdateWindowSurfaceRects(SDL_Window * window, SDL_Rect const * rects, int numrects)} */
    @NativeType("bool")
    public static boolean SDL_UpdateWindowSurfaceRects(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rects) {
        return nSDL_UpdateWindowSurfaceRects(window, rects.address(), rects.remaining());
    }

    // --- [ SDL_DestroyWindowSurface ] ---

    /** {@code bool SDL_DestroyWindowSurface(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_DestroyWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.DestroyWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SetWindowKeyboardGrab ] ---

    /** {@code bool SDL_SetWindowKeyboardGrab(SDL_Window * window, bool grabbed)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowKeyboardGrab(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean grabbed) {
        long __functionAddress = Functions.SetWindowKeyboardGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, grabbed, __functionAddress);
    }

    // --- [ SDL_SetWindowMouseGrab ] ---

    /** {@code bool SDL_SetWindowMouseGrab(SDL_Window * window, bool grabbed)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMouseGrab(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean grabbed) {
        long __functionAddress = Functions.SetWindowMouseGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, grabbed, __functionAddress);
    }

    // --- [ SDL_GetWindowKeyboardGrab ] ---

    /** {@code bool SDL_GetWindowKeyboardGrab(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowKeyboardGrab(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowKeyboardGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GetWindowMouseGrab ] ---

    /** {@code bool SDL_GetWindowMouseGrab(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowMouseGrab(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowMouseGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GetGrabbedWindow ] ---

    /** {@code SDL_Window * SDL_GetGrabbedWindow(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetGrabbedWindow() {
        long __functionAddress = Functions.GetGrabbedWindow;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_SetWindowMouseRect ] ---

    /** {@code bool SDL_SetWindowMouseRect(SDL_Window * window, SDL_Rect const * rect)} */
    public static boolean nSDL_SetWindowMouseRect(long window, long rect) {
        long __functionAddress = Functions.SetWindowMouseRect;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rect, __functionAddress);
    }

    /** {@code bool SDL_SetWindowMouseRect(SDL_Window * window, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMouseRect(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_SetWindowMouseRect(window, rect.address());
    }

    // --- [ SDL_GetWindowMouseRect ] ---

    /** {@code SDL_Rect const * SDL_GetWindowMouseRect(SDL_Window * window)} */
    public static long nSDL_GetWindowMouseRect(long window) {
        long __functionAddress = Functions.GetWindowMouseRect;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code SDL_Rect const * SDL_GetWindowMouseRect(SDL_Window * window)} */
    @NativeType("SDL_Rect const *")
    public static @Nullable SDL_Rect SDL_GetWindowMouseRect(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowMouseRect(window);
        return SDL_Rect.createSafe(__result);
    }

    // --- [ SDL_SetWindowOpacity ] ---

    /** {@code bool SDL_SetWindowOpacity(SDL_Window * window, float opacity)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowOpacity(@NativeType("SDL_Window *") long window, float opacity) {
        long __functionAddress = Functions.SetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, opacity, __functionAddress);
    }

    // --- [ SDL_GetWindowOpacity ] ---

    /** {@code float SDL_GetWindowOpacity(SDL_Window * window)} */
    public static float SDL_GetWindowOpacity(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ SDL_SetWindowParent ] ---

    /** {@code bool SDL_SetWindowParent(SDL_Window * window, SDL_Window * parent)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowParent(@NativeType("SDL_Window *") long window, @NativeType("SDL_Window *") long parent) {
        long __functionAddress = Functions.SetWindowParent;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, parent, __functionAddress);
    }

    // --- [ SDL_SetWindowModal ] ---

    /** {@code bool SDL_SetWindowModal(SDL_Window * window, bool modal)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowModal(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean modal) {
        long __functionAddress = Functions.SetWindowModal;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, modal, __functionAddress);
    }

    // --- [ SDL_SetWindowFocusable ] ---

    /** {@code bool SDL_SetWindowFocusable(SDL_Window * window, bool focusable)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowFocusable(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean focusable) {
        long __functionAddress = Functions.SetWindowFocusable;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, focusable, __functionAddress);
    }

    // --- [ SDL_ShowWindowSystemMenu ] ---

    /** {@code bool SDL_ShowWindowSystemMenu(SDL_Window * window, int x, int y)} */
    @NativeType("bool")
    public static boolean SDL_ShowWindowSystemMenu(@NativeType("SDL_Window *") long window, int x, int y) {
        long __functionAddress = Functions.ShowWindowSystemMenu;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, x, y, __functionAddress);
    }

    // --- [ SDL_SetWindowHitTest ] ---

    /** {@code bool SDL_SetWindowHitTest(SDL_Window * window, SDL_HitTest callback, void * callback_data)} */
    public static boolean nSDL_SetWindowHitTest(long window, long callback, long callback_data) {
        long __functionAddress = Functions.SetWindowHitTest;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, callback, callback_data, __functionAddress);
    }

    /** {@code bool SDL_SetWindowHitTest(SDL_Window * window, SDL_HitTest callback, void * callback_data)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowHitTest(@NativeType("SDL_Window *") long window, @NativeType("SDL_HitTest") @Nullable SDL_HitTestI callback, @NativeType("void *") long callback_data) {
        return nSDL_SetWindowHitTest(window, memAddressSafe(callback), callback_data);
    }

    // --- [ SDL_SetWindowShape ] ---

    /** {@code bool SDL_SetWindowShape(SDL_Window * window, SDL_Surface * shape)} */
    public static boolean nSDL_SetWindowShape(long window, long shape) {
        long __functionAddress = Functions.SetWindowShape;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, shape, __functionAddress);
    }

    /** {@code bool SDL_SetWindowShape(SDL_Window * window, SDL_Surface * shape)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowShape(@NativeType("SDL_Window *") long window, @NativeType("SDL_Surface *") @Nullable SDL_Surface shape) {
        return nSDL_SetWindowShape(window, memAddressSafe(shape));
    }

    // --- [ SDL_FlashWindow ] ---

    /** {@code bool SDL_FlashWindow(SDL_Window * window, SDL_FlashOperation operation)} */
    @NativeType("bool")
    public static boolean SDL_FlashWindow(@NativeType("SDL_Window *") long window, @NativeType("SDL_FlashOperation") int operation) {
        long __functionAddress = Functions.FlashWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, operation, __functionAddress);
    }

    // --- [ SDL_DestroyWindow ] ---

    /** {@code void SDL_DestroyWindow(SDL_Window * window)} */
    public static void SDL_DestroyWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ SDL_ScreenSaverEnabled ] ---

    /** {@code bool SDL_ScreenSaverEnabled(void)} */
    @NativeType("bool")
    public static boolean SDL_ScreenSaverEnabled() {
        long __functionAddress = Functions.ScreenSaverEnabled;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_EnableScreenSaver ] ---

    /** {@code bool SDL_EnableScreenSaver(void)} */
    @NativeType("bool")
    public static boolean SDL_EnableScreenSaver() {
        long __functionAddress = Functions.EnableScreenSaver;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_DisableScreenSaver ] ---

    /** {@code bool SDL_DisableScreenSaver(void)} */
    @NativeType("bool")
    public static boolean SDL_DisableScreenSaver() {
        long __functionAddress = Functions.DisableScreenSaver;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GL_LoadLibrary ] ---

    /** {@code bool SDL_GL_LoadLibrary(char const * path)} */
    public static boolean nSDL_GL_LoadLibrary(long path) {
        long __functionAddress = Functions.GL_LoadLibrary;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_GL_LoadLibrary(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_GL_LoadLibrary(@NativeType("char const *") @Nullable ByteBuffer path) {
        if (CHECKS) {
            checkNT1Safe(path);
        }
        return nSDL_GL_LoadLibrary(memAddressSafe(path));
    }

    /** {@code bool SDL_GL_LoadLibrary(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_GL_LoadLibrary(@NativeType("char const *") @Nullable CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? NULL : stack.getPointerAddress();
            return nSDL_GL_LoadLibrary(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GL_GetProcAddress ] ---

    /** {@code SDL_FunctionPointer SDL_GL_GetProcAddress(char const * proc)} */
    public static long nSDL_GL_GetProcAddress(long proc) {
        long __functionAddress = Functions.GL_GetProcAddress;
        return invokePP(proc, __functionAddress);
    }

    /** {@code SDL_FunctionPointer SDL_GL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_GL_GetProcAddress(@NativeType("char const *") ByteBuffer proc) {
        if (CHECKS) {
            checkNT1(proc);
        }
        return nSDL_GL_GetProcAddress(memAddress(proc));
    }

    /** {@code SDL_FunctionPointer SDL_GL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_GL_GetProcAddress(@NativeType("char const *") CharSequence proc) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            return nSDL_GL_GetProcAddress(procEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EGL_GetProcAddress ] ---

    /** {@code SDL_FunctionPointer SDL_EGL_GetProcAddress(char const * proc)} */
    public static long nSDL_EGL_GetProcAddress(long proc) {
        long __functionAddress = Functions.EGL_GetProcAddress;
        return invokePP(proc, __functionAddress);
    }

    /** {@code SDL_FunctionPointer SDL_EGL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_EGL_GetProcAddress(@NativeType("char const *") ByteBuffer proc) {
        if (CHECKS) {
            checkNT1(proc);
        }
        return nSDL_EGL_GetProcAddress(memAddress(proc));
    }

    /** {@code SDL_FunctionPointer SDL_EGL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_EGL_GetProcAddress(@NativeType("char const *") CharSequence proc) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            return nSDL_EGL_GetProcAddress(procEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GL_UnloadLibrary ] ---

    /** {@code void SDL_GL_UnloadLibrary(void)} */
    public static void SDL_GL_UnloadLibrary() {
        long __functionAddress = Functions.GL_UnloadLibrary;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GL_ExtensionSupported ] ---

    /** {@code bool SDL_GL_ExtensionSupported(char const * extension)} */
    public static boolean nSDL_GL_ExtensionSupported(long extension) {
        long __functionAddress = Functions.GL_ExtensionSupported;
        return invokePZ(extension, __functionAddress);
    }

    /** {@code bool SDL_GL_ExtensionSupported(char const * extension)} */
    @NativeType("bool")
    public static boolean SDL_GL_ExtensionSupported(@NativeType("char const *") ByteBuffer extension) {
        if (CHECKS) {
            checkNT1(extension);
        }
        return nSDL_GL_ExtensionSupported(memAddress(extension));
    }

    /** {@code bool SDL_GL_ExtensionSupported(char const * extension)} */
    @NativeType("bool")
    public static boolean SDL_GL_ExtensionSupported(@NativeType("char const *") CharSequence extension) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extension, true);
            long extensionEncoded = stack.getPointerAddress();
            return nSDL_GL_ExtensionSupported(extensionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GL_ResetAttributes ] ---

    /** {@code void SDL_GL_ResetAttributes(void)} */
    public static void SDL_GL_ResetAttributes() {
        long __functionAddress = Functions.GL_ResetAttributes;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GL_SetAttribute ] ---

    /** {@code bool SDL_GL_SetAttribute(SDL_GLAttr attr, int value)} */
    @NativeType("bool")
    public static boolean SDL_GL_SetAttribute(@NativeType("SDL_GLAttr") int attr, int value) {
        long __functionAddress = Functions.GL_SetAttribute;
        return invokeZ(attr, value, __functionAddress);
    }

    // --- [ SDL_GL_GetAttribute ] ---

    /** {@code bool SDL_GL_GetAttribute(SDL_GLAttr attr, int * value)} */
    public static boolean nSDL_GL_GetAttribute(int attr, long value) {
        long __functionAddress = Functions.GL_GetAttribute;
        return invokePZ(attr, value, __functionAddress);
    }

    /** {@code bool SDL_GL_GetAttribute(SDL_GLAttr attr, int * value)} */
    @NativeType("bool")
    public static boolean SDL_GL_GetAttribute(@NativeType("SDL_GLAttr") int attr, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_GL_GetAttribute(attr, memAddress(value));
    }

    // --- [ SDL_GL_CreateContext ] ---

    /** {@code SDL_GLContext SDL_GL_CreateContext(SDL_Window * window)} */
    @NativeType("SDL_GLContext")
    public static long SDL_GL_CreateContext(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GL_CreateContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_GL_MakeCurrent ] ---

    /** {@code bool SDL_GL_MakeCurrent(SDL_Window * window, SDL_GLContext context)} */
    @NativeType("bool")
    public static boolean SDL_GL_MakeCurrent(@NativeType("SDL_Window *") long window, @NativeType("SDL_GLContext") long context) {
        long __functionAddress = Functions.GL_MakeCurrent;
        return invokePPZ(window, context, __functionAddress);
    }

    // --- [ SDL_GL_GetCurrentWindow ] ---

    /** {@code SDL_Window * SDL_GL_GetCurrentWindow(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GL_GetCurrentWindow() {
        long __functionAddress = Functions.GL_GetCurrentWindow;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GL_GetCurrentContext ] ---

    /** {@code SDL_GLContext SDL_GL_GetCurrentContext(void)} */
    @NativeType("SDL_GLContext")
    public static long SDL_GL_GetCurrentContext() {
        long __functionAddress = Functions.GL_GetCurrentContext;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_EGL_GetCurrentDisplay ] ---

    /** {@code SDL_EGLDisplay SDL_EGL_GetCurrentDisplay(void)} */
    @NativeType("SDL_EGLDisplay")
    public static long SDL_EGL_GetCurrentDisplay() {
        long __functionAddress = Functions.EGL_GetCurrentDisplay;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_EGL_GetCurrentConfig ] ---

    /** {@code SDL_EGLConfig SDL_EGL_GetCurrentConfig(void)} */
    @NativeType("SDL_EGLConfig")
    public static long SDL_EGL_GetCurrentConfig() {
        long __functionAddress = Functions.EGL_GetCurrentConfig;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_EGL_GetWindowSurface ] ---

    /** {@code SDL_EGLSurface SDL_EGL_GetWindowSurface(SDL_Window * window)} */
    @NativeType("SDL_EGLSurface")
    public static long SDL_EGL_GetWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.EGL_GetWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_EGL_SetAttributeCallbacks ] ---

    /** {@code void SDL_EGL_SetAttributeCallbacks(SDL_EGLAttribArrayCallback platformAttribCallback, SDL_EGLIntArrayCallback surfaceAttribCallback, SDL_EGLIntArrayCallback contextAttribCallback, void * userdata)} */
    public static void nSDL_EGL_SetAttributeCallbacks(long platformAttribCallback, long surfaceAttribCallback, long contextAttribCallback, long userdata) {
        long __functionAddress = Functions.EGL_SetAttributeCallbacks;
        invokePPPPV(platformAttribCallback, surfaceAttribCallback, contextAttribCallback, userdata, __functionAddress);
    }

    /** {@code void SDL_EGL_SetAttributeCallbacks(SDL_EGLAttribArrayCallback platformAttribCallback, SDL_EGLIntArrayCallback surfaceAttribCallback, SDL_EGLIntArrayCallback contextAttribCallback, void * userdata)} */
    public static void SDL_EGL_SetAttributeCallbacks(@NativeType("SDL_EGLAttribArrayCallback") @Nullable SDL_EGLAttribArrayCallbackI platformAttribCallback, @NativeType("SDL_EGLIntArrayCallback") @Nullable SDL_EGLIntArrayCallbackI surfaceAttribCallback, @NativeType("SDL_EGLIntArrayCallback") @Nullable SDL_EGLIntArrayCallbackI contextAttribCallback, @NativeType("void *") long userdata) {
        nSDL_EGL_SetAttributeCallbacks(memAddressSafe(platformAttribCallback), memAddressSafe(surfaceAttribCallback), memAddressSafe(contextAttribCallback), userdata);
    }

    // --- [ SDL_GL_SetSwapInterval ] ---

    /** {@code bool SDL_GL_SetSwapInterval(int interval)} */
    @NativeType("bool")
    public static boolean SDL_GL_SetSwapInterval(int interval) {
        long __functionAddress = Functions.GL_SetSwapInterval;
        return invokeZ(interval, __functionAddress);
    }

    // --- [ SDL_GL_GetSwapInterval ] ---

    /** {@code bool SDL_GL_GetSwapInterval(int * interval)} */
    public static boolean nSDL_GL_GetSwapInterval(long interval) {
        long __functionAddress = Functions.GL_GetSwapInterval;
        return invokePZ(interval, __functionAddress);
    }

    /** {@code bool SDL_GL_GetSwapInterval(int * interval)} */
    @NativeType("bool")
    public static boolean SDL_GL_GetSwapInterval(@NativeType("int *") IntBuffer interval) {
        if (CHECKS) {
            check(interval, 1);
        }
        return nSDL_GL_GetSwapInterval(memAddress(interval));
    }

    // --- [ SDL_GL_SwapWindow ] ---

    /** {@code bool SDL_GL_SwapWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GL_SwapWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GL_SwapWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GL_DestroyContext ] ---

    /** {@code bool SDL_GL_DestroyContext(SDL_GLContext context)} */
    @NativeType("bool")
    public static boolean SDL_GL_DestroyContext(@NativeType("SDL_GLContext") long context) {
        long __functionAddress = Functions.GL_DestroyContext;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ SDL_WINDOWPOS_UNDEFINED_DISPLAY ] ---

    /** {@code uint32_t SDL_WINDOWPOS_UNDEFINED_DISPLAY(SDL_DisplayID X)} */
    @NativeType("uint32_t")
    public static int SDL_WINDOWPOS_UNDEFINED_DISPLAY(@NativeType("SDL_DisplayID") int X) {
        return SDL_WINDOWPOS_UNDEFINED_MASK | X;
    }

    // --- [ SDL_WINDOWPOS_ISUNDEFINED ] ---

    /** {@code bool SDL_WINDOWPOS_ISUNDEFINED(uint32_t X)} */
    @NativeType("bool")
    public static boolean SDL_WINDOWPOS_ISUNDEFINED(@NativeType("uint32_t") int X) {
        return (X & 0xFFFF0000) == SDL_WINDOWPOS_UNDEFINED_MASK;
    }

    // --- [ SDL_WINDOWPOS_CENTERED_DISPLAY ] ---

    /** {@code uint32_t SDL_WINDOWPOS_CENTERED_DISPLAY(SDL_DisplayID X)} */
    @NativeType("uint32_t")
    public static int SDL_WINDOWPOS_CENTERED_DISPLAY(@NativeType("SDL_DisplayID") int X) {
        return SDL_WINDOWPOS_CENTERED_MASK | X;
    }

    // --- [ SDL_WINDOWPOS_ISCENTERED ] ---

    /** {@code bool SDL_WINDOWPOS_ISCENTERED(uint32_t X)} */
    @NativeType("bool")
    public static boolean SDL_WINDOWPOS_ISCENTERED(@NativeType("uint32_t") int X) {
        return (X & 0xFFFF0000) == SDL_WINDOWPOS_CENTERED_MASK;
    }

}