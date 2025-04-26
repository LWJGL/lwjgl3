/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class User32 {

    private static final SharedLibrary USER32 = Library.loadNative(User32.class, "org.lwjgl", "user32");

    /** Contains the function pointers loaded from the user32 {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            RegisterClassEx                     = apiGetFunctionAddress(USER32, "RegisterClassExW"),
            UnregisterClass                     = apiGetFunctionAddress(USER32, "UnregisterClassW"),
            CreateWindowEx                      = apiGetFunctionAddress(USER32, "CreateWindowExW"),
            DestroyWindow                       = apiGetFunctionAddress(USER32, "DestroyWindow"),
            DefWindowProc                       = apiGetFunctionAddress(USER32, "DefWindowProcW"),
            CallWindowProc                      = apiGetFunctionAddress(USER32, "CallWindowProcW"),
            ShowWindow                          = apiGetFunctionAddress(USER32, "ShowWindow"),
            UpdateWindow                        = apiGetFunctionAddress(USER32, "UpdateWindow"),
            SetWindowPos                        = apiGetFunctionAddress(USER32, "SetWindowPos"),
            SetWindowText                       = apiGetFunctionAddress(USER32, "SetWindowTextW"),
            GetMessage                          = apiGetFunctionAddress(USER32, "GetMessageW"),
            PeekMessage                         = apiGetFunctionAddress(USER32, "PeekMessageW"),
            TranslateMessage                    = apiGetFunctionAddress(USER32, "TranslateMessage"),
            WaitMessage                         = apiGetFunctionAddress(USER32, "WaitMessage"),
            DispatchMessage                     = apiGetFunctionAddress(USER32, "DispatchMessageW"),
            PostMessage                         = apiGetFunctionAddress(USER32, "PostMessageW"),
            SendMessage                         = apiGetFunctionAddress(USER32, "SendMessageW"),
            AdjustWindowRectEx                  = apiGetFunctionAddress(USER32, "AdjustWindowRectEx"),
            GetWindowRect                       = apiGetFunctionAddress(USER32, "GetWindowRect"),
            MoveWindow                          = apiGetFunctionAddress(USER32, "MoveWindow"),
            GetWindowPlacement                  = apiGetFunctionAddress(USER32, "GetWindowPlacement"),
            SetWindowPlacement                  = apiGetFunctionAddress(USER32, "SetWindowPlacement"),
            IsWindowVisible                     = apiGetFunctionAddress(USER32, "IsWindowVisible"),
            IsIconic                            = apiGetFunctionAddress(USER32, "IsIconic"),
            IsZoomed                            = apiGetFunctionAddress(USER32, "IsZoomed"),
            BringWindowToTop                    = apiGetFunctionAddress(USER32, "BringWindowToTop"),
            SetWindowLongPtr                    = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "SetWindowLongPtrW" : "SetWindowLongW"),
            GetWindowLongPtr                    = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "GetWindowLongPtrW" : "GetWindowLongW"),
            SetClassLongPtr                     = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "SetClassLongPtrW" : "SetClassLongW"),
            GetClassLongPtr                     = apiGetFunctionAddress(USER32, Pointer.BITS64 ? "GetClassLongPtrW" : "GetClassLongW"),
            SetLayeredWindowAttributes          = apiGetFunctionAddress(USER32, "SetLayeredWindowAttributes"),
            LoadIcon                            = apiGetFunctionAddress(USER32, "LoadIconW"),
            LoadCursor                          = apiGetFunctionAddress(USER32, "LoadCursorW"),
            GetDC                               = apiGetFunctionAddress(USER32, "GetDC"),
            ReleaseDC                           = apiGetFunctionAddress(USER32, "ReleaseDC"),
            GetSystemMetrics                    = apiGetFunctionAddress(USER32, "GetSystemMetrics"),
            RegisterTouchWindow                 = apiGetFunctionAddressOptional(USER32, "RegisterTouchWindow"),
            UnregisterTouchWindow               = apiGetFunctionAddressOptional(USER32, "UnregisterTouchWindow"),
            IsTouchWindow                       = apiGetFunctionAddressOptional(USER32, "IsTouchWindow"),
            GetTouchInputInfo                   = apiGetFunctionAddressOptional(USER32, "GetTouchInputInfo"),
            CloseTouchInputHandle               = apiGetFunctionAddressOptional(USER32, "CloseTouchInputHandle"),
            MonitorFromWindow                   = apiGetFunctionAddress(USER32, "MonitorFromWindow"),
            GetMonitorInfo                      = apiGetFunctionAddress(USER32, "GetMonitorInfoW"),
            EnumDisplayDevices                  = apiGetFunctionAddress(USER32, "EnumDisplayDevicesW"),
            EnumDisplaySettingsEx               = apiGetFunctionAddress(USER32, "EnumDisplaySettingsExW"),
            ChangeDisplaySettingsEx             = apiGetFunctionAddress(USER32, "ChangeDisplaySettingsExW"),
            GetCursorPos                        = apiGetFunctionAddress(USER32, "GetCursorPos"),
            SetCursorPos                        = apiGetFunctionAddress(USER32, "SetCursorPos"),
            ClipCursor                          = apiGetFunctionAddress(USER32, "ClipCursor"),
            ShowCursor                          = apiGetFunctionAddress(USER32, "ShowCursor"),
            SetCursor                           = apiGetFunctionAddress(USER32, "SetCursor"),
            ClientToScreen                      = apiGetFunctionAddress(USER32, "ClientToScreen"),
            GetAsyncKeyState                    = apiGetFunctionAddress(USER32, "GetAsyncKeyState"),
            GetMessageExtraInfo                 = apiGetFunctionAddress(USER32, "GetMessageExtraInfo"),
            SendInput                           = apiGetFunctionAddress(USER32, "SendInput"),
            GetDpiForSystem                     = apiGetFunctionAddressOptional(USER32, "GetDpiForSystem"),
            GetDpiForWindow                     = apiGetFunctionAddressOptional(USER32, "GetDpiForWindow"),
            GetAwarenessFromDpiAwarenessContext = apiGetFunctionAddressOptional(USER32, "GetAwarenessFromDpiAwarenessContext"),
            GetThreadDpiAwarenessContext        = apiGetFunctionAddressOptional(USER32, "GetThreadDpiAwarenessContext"),
            GetWindowDpiAwarenessContext        = apiGetFunctionAddressOptional(USER32, "GetWindowDpiAwarenessContext"),
            IsValidDpiAwarenessContext          = apiGetFunctionAddressOptional(USER32, "IsValidDpiAwarenessContext"),
            SetThreadDpiAwarenessContext        = apiGetFunctionAddressOptional(USER32, "SetThreadDpiAwarenessContext");

    }

    /** Returns the user32 {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return USER32;
    }

    public static final int
        WS_OVERLAPPED       = 0x0,
        WS_POPUP            = 0x80000000,
        WS_CHILD            = 0x40000000,
        WS_MINIMIZE         = 0x20000000,
        WS_VISIBLE          = 0x10000000,
        WS_DISABLED         = 0x8000000,
        WS_CLIPSIBLINGS     = 0x4000000,
        WS_CLIPCHILDREN     = 0x2000000,
        WS_MAXIMIZE         = 0x1000000,
        WS_CAPTION          = 0xC00000,
        WS_BORDER           = 0x800000,
        WS_DLGFRAME         = 0x400000,
        WS_VSCROLL          = 0x200000,
        WS_HSCROLL          = 0x100000,
        WS_SYSMENU          = 0x80000,
        WS_THICKFRAME       = 0x40000,
        WS_GROUP            = 0x20000,
        WS_TABSTOP          = 0x10000,
        WS_MINIMIZEBOX      = 0x20000,
        WS_MAXIMIZEBOX      = 0x10000,
        WS_OVERLAPPEDWINDOW = WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX,
        WS_POPUPWINDOW      = WS_POPUP | WS_BORDER | WS_SYSMENU,
        WS_CHILDWINDOW      = WS_CHILD,
        WS_TILED            = WS_OVERLAPPED,
        WS_ICONIC           = WS_MINIMIZE,
        WS_SIZEBOX          = WS_THICKFRAME,
        WS_TILEDWINDOW      = WS_OVERLAPPEDWINDOW;

    public static final int
        WS_EX_DLGMODALFRAME    = 0x1,
        WS_EX_NOPARENTNOTIFY   = 0x4,
        WS_EX_TOPMOST          = 0x8,
        WS_EX_ACCEPTFILES      = 0x10,
        WS_EX_TRANSPARENT      = 0x20,
        WS_EX_MDICHILD         = 0x40,
        WS_EX_TOOLWINDOW       = 0x80,
        WS_EX_WINDOWEDGE       = 0x100,
        WS_EX_CLIENTEDGE       = 0x200,
        WS_EX_CONTEXTHELP      = 0x400,
        WS_EX_RIGHT            = 0x1000,
        WS_EX_LEFT             = 0x0,
        WS_EX_RTLREADING       = 0x2000,
        WS_EX_LTRREADING       = 0x0,
        WS_EX_LEFTSCROLLBAR    = 0x4000,
        WS_EX_RIGHTSCROLLBAR   = 0x0,
        WS_EX_CONTROLPARENT    = 0x10000,
        WS_EX_STATICEDGE       = 0x20000,
        WS_EX_APPWINDOW        = 0x40000,
        WS_EX_OVERLAPPEDWINDOW = WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE,
        WS_EX_PALETTEWINDOW    = WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST,
        WS_EX_LAYERED          = 0x80000,
        WS_EX_NOINHERITLAYOUT  = 0x100000,
        WS_EX_LAYOUTRTL        = 0x400000,
        WS_EX_COMPOSITED       = 0x2000000,
        WS_EX_NOACTIVATE       = 0x8000000;

    public static final int CW_USEDEFAULT = 0x80000000;

    public static final int
        CS_VREDRAW         = 0x1,
        CS_HREDRAW         = 0x2,
        CS_DBLCLKS         = 0x8,
        CS_OWNDC           = 0x20,
        CS_CLASSDC         = 0x40,
        CS_PARENTDC        = 0x80,
        CS_NOCLOSE         = 0x200,
        CS_SAVEBITS        = 0x800,
        CS_BYTEALIGNCLIENT = 0x1000,
        CS_BYTEALIGNWINDOW = 0x2000,
        CS_GLOBALCLASS     = 0x4000,
        CS_IME             = 0x10000,
        CS_DROPSHADOW      = 0x20000;

    public static final int
        WM_NULL                           = 0x0,
        WM_CREATE                         = 0x1,
        WM_DESTROY                        = 0x2,
        WM_MOVE                           = 0x3,
        WM_SIZE                           = 0x5,
        WM_ACTIVATE                       = 0x6,
        WM_SETFOCUS                       = 0x7,
        WM_KILLFOCUS                      = 0x8,
        WM_ENABLE                         = 0xA,
        WM_SETREDRAW                      = 0xB,
        WM_SETTEXT                        = 0xC,
        WM_GETTEXT                        = 0xD,
        WM_GETTEXTLENGTH                  = 0xE,
        WM_PAINT                          = 0xF,
        WM_CLOSE                          = 0x10,
        WM_QUERYENDSESSION                = 0x11,
        WM_QUERYOPEN                      = 0x13,
        WM_ENDSESSION                     = 0x16,
        WM_QUIT                           = 0x12,
        WM_ERASEBKGND                     = 0x14,
        WM_SYSCOLORCHANGE                 = 0x15,
        WM_SHOWWINDOW                     = 0x18,
        WM_WININICHANGE                   = 0x1A,
        WM_SETTINGCHANGE                  = WM_WININICHANGE,
        WM_DEVMODECHANGE                  = 0x1B,
        WM_ACTIVATEAPP                    = 0x1C,
        WM_FONTCHANGE                     = 0x1D,
        WM_TIMECHANGE                     = 0x1E,
        WM_CANCELMODE                     = 0x1F,
        WM_SETCURSOR                      = 0x20,
        WM_MOUSEACTIVATE                  = 0x21,
        WM_CHILDACTIVATE                  = 0x22,
        WM_QUEUESYNC                      = 0x23,
        WM_GETMINMAXINFO                  = 0x24,
        WM_PAINTICON                      = 0x26,
        WM_ICONERASEBKGND                 = 0x27,
        WM_NEXTDLGCTL                     = 0x28,
        WM_SPOOLERSTATUS                  = 0x2A,
        WM_DRAWITEM                       = 0x2B,
        WM_MEASUREITEM                    = 0x2C,
        WM_DELETEITEM                     = 0x2D,
        WM_VKEYTOITEM                     = 0x2E,
        WM_CHARTOITEM                     = 0x2F,
        WM_SETFONT                        = 0x30,
        WM_GETFONT                        = 0x31,
        WM_SETHOTKEY                      = 0x32,
        WM_GETHOTKEY                      = 0x33,
        WM_QUERYDRAGICON                  = 0x37,
        WM_COMPAREITEM                    = 0x39,
        WM_GETOBJECT                      = 0x3D,
        WM_COMPACTING                     = 0x41,
        WM_COMMNOTIFY                     = 0x44,
        WM_WINDOWPOSCHANGING              = 0x46,
        WM_WINDOWPOSCHANGED               = 0x47,
        WM_POWER                          = 0x48,
        WM_COPYDATA                       = 0x4A,
        WM_CANCELJOURNAL                  = 0x4B,
        WM_NOTIFY                         = 0x4E,
        WM_INPUTLANGCHANGEREQUEST         = 0x50,
        WM_INPUTLANGCHANGE                = 0x51,
        WM_TCARD                          = 0x52,
        WM_HELP                           = 0x53,
        WM_USERCHANGED                    = 0x54,
        WM_NOTIFYFORMAT                   = 0x55,
        WM_CONTEXTMENU                    = 0x7B,
        WM_STYLECHANGING                  = 0x7C,
        WM_STYLECHANGED                   = 0x7D,
        WM_DISPLAYCHANGE                  = 0x7E,
        WM_GETICON                        = 0x7F,
        WM_SETICON                        = 0x80,
        WM_NCCREATE                       = 0x81,
        WM_NCDESTROY                      = 0x82,
        WM_NCCALCSIZE                     = 0x83,
        WM_NCHITTEST                      = 0x84,
        WM_NCPAINT                        = 0x85,
        WM_NCACTIVATE                     = 0x86,
        WM_GETDLGCODE                     = 0x87,
        WM_SYNCPAINT                      = 0x88,
        WM_NCMOUSEMOVE                    = 0xA0,
        WM_NCLBUTTONDOWN                  = 0xA1,
        WM_NCLBUTTONUP                    = 0xA2,
        WM_NCLBUTTONDBLCLK                = 0xA3,
        WM_NCRBUTTONDOWN                  = 0xA4,
        WM_NCRBUTTONUP                    = 0xA5,
        WM_NCRBUTTONDBLCLK                = 0xA6,
        WM_NCMBUTTONDOWN                  = 0xA7,
        WM_NCMBUTTONUP                    = 0xA8,
        WM_NCMBUTTONDBLCLK                = 0xA9,
        WM_NCXBUTTONDOWN                  = 0xAB,
        WM_NCXBUTTONUP                    = 0xAC,
        WM_NCXBUTTONDBLCLK                = 0xAD,
        WM_INPUT_DEVICE_CHANGE            = 0xFE,
        WM_INPUT                          = 0xFF,
        WM_KEYFIRST                       = 0x100,
        WM_KEYDOWN                        = 0x100,
        WM_KEYUP                          = 0x101,
        WM_CHAR                           = 0x102,
        WM_DEADCHAR                       = 0x103,
        WM_SYSKEYDOWN                     = 0x104,
        WM_SYSKEYUP                       = 0x105,
        WM_SYSCHAR                        = 0x106,
        WM_SYSDEADCHAR                    = 0x107,
        WM_UNICHAR                        = 0x109,
        UNICODE_NOCHAR                    = 0xFFFF,
        WM_IME_STARTCOMPOSITION           = 0x10D,
        WM_IME_ENDCOMPOSITION             = 0x10E,
        WM_IME_COMPOSITION                = 0x10F,
        WM_IME_KEYLAST                    = 0x10F,
        WM_INITDIALOG                     = 0x110,
        WM_COMMAND                        = 0x111,
        WM_SYSCOMMAND                     = 0x112,
        WM_TIMER                          = 0x113,
        WM_HSCROLL                        = 0x114,
        WM_VSCROLL                        = 0x115,
        WM_INITMENU                       = 0x116,
        WM_INITMENUPOPUP                  = 0x117,
        WM_GESTURE                        = 0x119,
        WM_GESTURENOTIFY                  = 0x11A,
        WM_MENUSELECT                     = 0x11F,
        WM_MENUCHAR                       = 0x120,
        WM_ENTERIDLE                      = 0x121,
        WM_MENURBUTTONUP                  = 0x122,
        WM_MENUDRAG                       = 0x123,
        WM_MENUGETOBJECT                  = 0x124,
        WM_UNINITMENUPOPUP                = 0x125,
        WM_MENUCOMMAND                    = 0x126,
        WM_CHANGEUISTATE                  = 0x127,
        WM_UPDATEUISTATE                  = 0x128,
        WM_QUERYUISTATE                   = 0x129,
        WM_CTLCOLORMSGBOX                 = 0x132,
        WM_CTLCOLOREDIT                   = 0x133,
        WM_CTLCOLORLISTBOX                = 0x134,
        WM_CTLCOLORBTN                    = 0x135,
        WM_CTLCOLORDLG                    = 0x136,
        WM_CTLCOLORSCROLLBAR              = 0x137,
        WM_CTLCOLORSTATIC                 = 0x138,
        MN_GETHMENU                       = 0x1E1,
        WM_MOUSEFIRST                     = 0x200,
        WM_MOUSEMOVE                      = 0x200,
        WM_LBUTTONDOWN                    = 0x201,
        WM_LBUTTONUP                      = 0x202,
        WM_LBUTTONDBLCLK                  = 0x203,
        WM_RBUTTONDOWN                    = 0x204,
        WM_RBUTTONUP                      = 0x205,
        WM_RBUTTONDBLCLK                  = 0x206,
        WM_MBUTTONDOWN                    = 0x207,
        WM_MBUTTONUP                      = 0x208,
        WM_MBUTTONDBLCLK                  = 0x209,
        WM_MOUSEWHEEL                     = 0x20A,
        WM_XBUTTONDOWN                    = 0x20B,
        WM_XBUTTONUP                      = 0x20C,
        WM_XBUTTONDBLCLK                  = 0x20D,
        WM_MOUSEHWHEEL                    = 0x20E,
        WM_PARENTNOTIFY                   = 0x210,
        WM_ENTERMENULOOP                  = 0x211,
        WM_EXITMENULOOP                   = 0x212,
        WM_NEXTMENU                       = 0x213,
        WM_SIZING                         = 0x214,
        WM_CAPTURECHANGED                 = 0x215,
        WM_MOVING                         = 0x216,
        WM_POWERBROADCAST                 = 0x218,
        WM_DEVICECHANGE                   = 0x219,
        WM_MDICREATE                      = 0x220,
        WM_MDIDESTROY                     = 0x221,
        WM_MDIACTIVATE                    = 0x222,
        WM_MDIRESTORE                     = 0x223,
        WM_MDINEXT                        = 0x224,
        WM_MDIMAXIMIZE                    = 0x225,
        WM_MDITILE                        = 0x226,
        WM_MDICASCADE                     = 0x227,
        WM_MDIICONARRANGE                 = 0x228,
        WM_MDIGETACTIVE                   = 0x229,
        WM_MDISETMENU                     = 0x230,
        WM_ENTERSIZEMOVE                  = 0x231,
        WM_EXITSIZEMOVE                   = 0x232,
        WM_DROPFILES                      = 0x233,
        WM_MDIREFRESHMENU                 = 0x234,
        WM_TOUCH                          = 0x240,
        WM_IME_SETCONTEXT                 = 0x281,
        WM_IME_NOTIFY                     = 0x282,
        WM_IME_CONTROL                    = 0x283,
        WM_IME_COMPOSITIONFULL            = 0x284,
        WM_IME_SELECT                     = 0x285,
        WM_IME_CHAR                       = 0x286,
        WM_IME_REQUEST                    = 0x288,
        WM_IME_KEYDOWN                    = 0x290,
        WM_IME_KEYUP                      = 0x291,
        WM_MOUSEHOVER                     = 0x2A1,
        WM_MOUSELEAVE                     = 0x2A3,
        WM_NCMOUSEHOVER                   = 0x2A0,
        WM_NCMOUSELEAVE                   = 0x2A2,
        WM_WTSSESSION_CHANGE              = 0x2B1,
        WM_TABLET_FIRST                   = 0x2C0,
        WM_TABLET_LAST                    = 0x2DF,
        WM_CUT                            = 0x300,
        WM_COPY                           = 0x301,
        WM_PASTE                          = 0x302,
        WM_CLEAR                          = 0x303,
        WM_UNDO                           = 0x304,
        WM_RENDERFORMAT                   = 0x305,
        WM_RENDERALLFORMATS               = 0x306,
        WM_DESTROYCLIPBOARD               = 0x307,
        WM_DRAWCLIPBOARD                  = 0x308,
        WM_PAINTCLIPBOARD                 = 0x309,
        WM_VSCROLLCLIPBOARD               = 0x30A,
        WM_SIZECLIPBOARD                  = 0x30B,
        WM_ASKCBFORMATNAME                = 0x30C,
        WM_CHANGECBCHAIN                  = 0x30D,
        WM_HSCROLLCLIPBOARD               = 0x30E,
        WM_QUERYNEWPALETTE                = 0x30F,
        WM_PALETTEISCHANGING              = 0x310,
        WM_PALETTECHANGED                 = 0x311,
        WM_HOTKEY                         = 0x312,
        WM_PRINT                          = 0x317,
        WM_PRINTCLIENT                    = 0x318,
        WM_APPCOMMAND                     = 0x319,
        WM_THEMECHANGED                   = 0x31A,
        WM_CLIPBOARDUPDATE                = 0x31D,
        WM_DWMCOMPOSITIONCHANGED          = 0x31E,
        WM_DWMNCRENDERINGCHANGED          = 0x31F,
        WM_DWMCOLORIZATIONCOLORCHANGED    = 0x320,
        WM_DWMWINDOWMAXIMIZEDCHANGE       = 0x321,
        WM_DWMSENDICONICTHUMBNAIL         = 0x323,
        WM_DWMSENDICONICLIVEPREVIEWBITMAP = 0x326,
        WM_GETTITLEBARINFOEX              = 0x33F,
        WM_HANDHELDFIRST                  = 0x358,
        WM_HANDHELDLAST                   = 0x35F,
        WM_AFXFIRST                       = 0x360,
        WM_AFXLAST                        = 0x37F,
        WM_PENWINFIRST                    = 0x380,
        WM_PENWINLAST                     = 0x38F,
        WM_APP                            = 0x8000,
        WM_USER                           = 0x400;

    public static final int
        WA_ACTIVE      = 1,
        WA_CLICKACTIVE = 2,
        WA_INACTIVE    = 0;

    public static final int
        SIZE_RESTORED  = 0,
        SIZE_MINIMIZED = 1,
        SIZE_MAXIMIZED = 2,
        SIZE_MAXSHOW   = 3,
        SIZE_MAXHIDE   = 4;

    public static final int
        DBT_APPYBEGIN            = 0x0,
        DBT_APPYEND              = 0x1,
        DBT_DEVNODES_CHANGED     = 0x7,
        DBT_QUERYCHANGECONFIG    = 0x17,
        DBT_CONFIGCHANGED        = 0x18,
        DBT_CONFIGCHANGECANCELED = 0x19,
        DBT_MONITORCHANGE        = 0x1B;

    public static final int
        SC_SIZE         = 0xF000,
        SC_MOVE         = 0xF010,
        SC_MINIMIZE     = 0xF020,
        SC_MAXIMIZE     = 0xF030,
        SC_NEXTWINDOW   = 0xF040,
        SC_PREVWINDOW   = 0xF050,
        SC_CLOSE        = 0xF060,
        SC_VSCROLL      = 0xF070,
        SC_HSCROLL      = 0xF080,
        SC_MOUSEMENU    = 0xF090,
        SC_KEYMENU      = 0xF100,
        SC_ARRANGE      = 0xF110,
        SC_RESTORE      = 0xF120,
        SC_TASKLIST     = 0xF130,
        SC_SCREENSAVE   = 0xF140,
        SC_HOTKEY       = 0xF150,
        SC_DEFAULT      = 0xF160,
        SC_MONITORPOWER = 0xF170,
        SC_CONTEXTHELP  = 0xF180,
        SC_SEPARATOR    = 0xF00F;

    public static final int
        MK_LBUTTON  = 0x1,
        MK_RBUTTON  = 0x2,
        MK_SHIFT    = 0x4,
        MK_CONTROL  = 0x8,
        MK_MBUTTON  = 0x10,
        MK_XBUTTON1 = 0x20,
        MK_XBUTTON2 = 0x40;

    public static final int
        HTERROR       = -2,
        HTTRANSPARENT = -1,
        HTNOWHERE     = 0,
        HTCLIENT      = 1,
        HTCAPTION     = 2,
        HTSYSMENU     = 3,
        HTGROWBOX     = 4,
        HTSIZE        = HTGROWBOX,
        HTMENU        = 5,
        HTHSCROLL     = 6,
        HTVSCROLL     = 7,
        HTMINBUTTON   = 8,
        HTMAXBUTTON   = 9,
        HTLEFT        = 10,
        HTRIGHT       = 11,
        HTTOP         = 12,
        HTTOPLEFT     = 13,
        HTTOPRIGHT    = 14,
        HTBOTTOM      = 15,
        HTBOTTOMLEFT  = 16,
        HTBOTTOMRIGHT = 17,
        HTBORDER      = 18,
        HTREDUCE      = HTMINBUTTON,
        HTZOOM        = HTMAXBUTTON,
        HTSIZEFIRST   = HTLEFT,
        HTSIZELAST    = HTBOTTOMRIGHT,
        HTOBJECT      = 19,
        HTCLOSE       = 20,
        HTHELP        = 21;

    public static final int
        GWL_WNDPROC    = -4,
        GWL_HINSTANCE  = -6,
        GWL_HWNDPARENT = -8,
        GWL_STYLE      = -16,
        GWL_EXSTYLE    = -20,
        GWL_USERDATA   = -21,
        GWL_ID         = -12;

    public static final int
        SW_HIDE            = 0,
        SW_SHOWNORMAL      = 1,
        SW_NORMAL          = 1,
        SW_SHOWMINIMIZED   = 2,
        SW_SHOWMAXIMIZED   = 3,
        SW_MAXIMIZE        = 3,
        SW_SHOWNOACTIVATE  = 4,
        SW_SHOW            = 5,
        SW_MINIMIZE        = 6,
        SW_SHOWMINNOACTIVE = 7,
        SW_SHOWNA          = 8,
        SW_RESTORE         = 9,
        SW_SHOWDEFAULT     = 10,
        SW_FORCEMINIMIZE   = 11,
        SW_MAX             = 11;

    public static final long
        HWND_TOP       = 0x0L,
        HWND_BOTTOM    = 0x1L,
        HWND_TOPMOST   = 0xFFFFFFFFFFFFFFFFL,
        HWND_NOTOPMOST = 0xFFFFFFFFFFFFFFFEL;

    public static final long HWND_BROADCAST = 0xFFFFL;

    public static final int
        SWP_NOSIZE         = 0x1,
        SWP_NOMOVE         = 0x2,
        SWP_NOZORDER       = 0x4,
        SWP_NOREDRAW       = 0x8,
        SWP_NOACTIVATE     = 0x10,
        SWP_FRAMECHANGED   = 0x20,
        SWP_SHOWWINDOW     = 0x40,
        SWP_HIDEWINDOW     = 0x80,
        SWP_NOCOPYBITS     = 0x100,
        SWP_NOOWNERZORDER  = 0x200,
        SWP_NOSENDCHANGING = 0x400,
        SWP_DRAWFRAME      = SWP_FRAMECHANGED,
        SWP_NOREPOSITION   = SWP_NOOWNERZORDER,
        SWP_DEFERERASE     = 0x2000,
        SWP_ASYNCWINDOWPOS = 0x4000;

    public static final int
        IDI_APPLICATION = 32512,
        IDI_HAND        = 32513,
        IDI_QUESTION    = 32514,
        IDI_EXCLAMATION = 32515,
        IDI_ASTERISK    = 32516,
        IDI_WINLOGO     = 32517,
        IDI_SHIELD      = 32518,
        IDI_WARNING     = IDI_EXCLAMATION,
        IDI_ERROR       = IDI_HAND,
        IDI_INFORMATION = IDI_ASTERISK;

    public static final int
        IDC_ARROW       = 32512,
        IDC_IBEAM       = 32513,
        IDC_WAIT        = 32514,
        IDC_CROSS       = 32515,
        IDC_UPARROW     = 32516,
        IDC_SIZE        = 32640,
        IDC_ICON        = 32641,
        IDC_SIZENWSE    = 32642,
        IDC_SIZENESW    = 32643,
        IDC_SIZEWE      = 32644,
        IDC_SIZENS      = 32645,
        IDC_SIZEALL     = 32646,
        IDC_NO          = 32648,
        IDC_HAND        = 32649,
        IDC_APPSTARTING = 32650,
        IDC_HELP        = 32651;

    public static final int
        GCL_MENUNAME      = -8,
        GCL_HBRBACKGROUND = -10,
        GCL_HCURSOR       = -12,
        GCL_HICON         = -14,
        GCL_HMODULE       = -16,
        GCL_CBWNDEXTRA    = -18,
        GCL_CBCLSEXTRA    = -20,
        GCL_WNDPROC       = -24,
        GCL_STYLE         = -26,
        GCW_ATOM          = -32,
        GCL_HICONSM       = -34;

    public static final int
        QS_KEY            = 0x1,
        QS_MOUSEMOVE      = 0x2,
        QS_MOUSEBUTTON    = 0x4,
        QS_POSTMESSAGE    = 0x8,
        QS_TIMER          = 0x10,
        QS_PAINT          = 0x20,
        QS_SENDMESSAGE    = 0x40,
        QS_HOTKEY         = 0x80,
        QS_ALLPOSTMESSAGE = 0x100,
        QS_RAWINPUT       = 0x400,
        QS_MOUSE          = QS_MOUSEMOVE | QS_MOUSEBUTTON,
        QS_INPUT          = QS_MOUSE | QS_KEY,
        QS_ALLEVENTS      = QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY,
        QS_ALLINPUT       = QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY | QS_SENDMESSAGE;

    public static final int
        PM_NOREMOVE       = 0x0,
        PM_REMOVE         = 0x1,
        PM_NOYIELD        = 0x2,
        PM_QS_INPUT       = QS_INPUT << 16,
        PM_QS_POSTMESSAGE = (QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16,
        PM_QS_PAINT       = QS_PAINT << 16,
        PM_QS_SENDMESSAGE = QS_SENDMESSAGE << 16;

    public static final int
        VK_LBUTTON             = 0x1,
        VK_RBUTTON             = 0x2,
        VK_CANCEL              = 0x3,
        VK_MBUTTON             = 0x4,
        VK_XBUTTON1            = 0x5,
        VK_XBUTTON2            = 0x6,
        VK_BACK                = 0x8,
        VK_TAB                 = 0x9,
        VK_CLEAR               = 0xC,
        VK_RETURN              = 0xD,
        VK_SHIFT               = 0x10,
        VK_CONTROL             = 0x11,
        VK_MENU                = 0x12,
        VK_PAUSE               = 0x13,
        VK_CAPITAL             = 0x14,
        VK_KANA                = 0x15,
        VK_HANGEUL             = 0x15,
        VK_HANGUL              = 0x15,
        VK_JUNJA               = 0x17,
        VK_FINAL               = 0x18,
        VK_HANJA               = 0x19,
        VK_KANJI               = 0x19,
        VK_ESCAPE              = 0x1B,
        VK_CONVERT             = 0x1C,
        VK_NONCONVERT          = 0x1D,
        VK_ACCEPT              = 0x1E,
        VK_MODECHANGE          = 0x1F,
        VK_SPACE               = 0x20,
        VK_PRIOR               = 0x21,
        VK_NEXT                = 0x22,
        VK_END                 = 0x23,
        VK_HOME                = 0x24,
        VK_LEFT                = 0x25,
        VK_UP                  = 0x26,
        VK_RIGHT               = 0x27,
        VK_DOWN                = 0x28,
        VK_SELECT              = 0x29,
        VK_PRINT               = 0x2A,
        VK_EXECUTE             = 0x2B,
        VK_SNAPSHOT            = 0x2C,
        VK_INSERT              = 0x2D,
        VK_DELETE              = 0x2E,
        VK_HELP                = 0x2F,
        VK_LWIN                = 0x5B,
        VK_RWIN                = 0x5C,
        VK_APPS                = 0x5D,
        VK_SLEEP               = 0x5F,
        VK_NUMPAD0             = 0x60,
        VK_NUMPAD1             = 0x61,
        VK_NUMPAD2             = 0x62,
        VK_NUMPAD3             = 0x63,
        VK_NUMPAD4             = 0x64,
        VK_NUMPAD5             = 0x65,
        VK_NUMPAD6             = 0x66,
        VK_NUMPAD7             = 0x67,
        VK_NUMPAD8             = 0x68,
        VK_NUMPAD9             = 0x69,
        VK_MULTIPLY            = 0x6A,
        VK_ADD                 = 0x6B,
        VK_SEPARATOR           = 0x6C,
        VK_SUBTRACT            = 0x6D,
        VK_DECIMAL             = 0x6E,
        VK_DIVIDE              = 0x6F,
        VK_F1                  = 0x70,
        VK_F2                  = 0x71,
        VK_F3                  = 0x72,
        VK_F4                  = 0x73,
        VK_F5                  = 0x74,
        VK_F6                  = 0x75,
        VK_F7                  = 0x76,
        VK_F8                  = 0x77,
        VK_F9                  = 0x78,
        VK_F10                 = 0x79,
        VK_F11                 = 0x7A,
        VK_F12                 = 0x7B,
        VK_F13                 = 0x7C,
        VK_F14                 = 0x7D,
        VK_F15                 = 0x7E,
        VK_F16                 = 0x7F,
        VK_F17                 = 0x80,
        VK_F18                 = 0x81,
        VK_F19                 = 0x82,
        VK_F20                 = 0x83,
        VK_F21                 = 0x84,
        VK_F22                 = 0x85,
        VK_F23                 = 0x86,
        VK_F24                 = 0x87,
        VK_NUMLOCK             = 0x90,
        VK_SCROLL              = 0x91,
        VK_OEM_NEC_EQUAL       = 0x92,
        VK_OEM_FJ_JISHO        = 0x92,
        VK_OEM_FJ_MASSHOU      = 0x93,
        VK_OEM_FJ_TOUROKU      = 0x94,
        VK_OEM_FJ_LOYA         = 0x95,
        VK_OEM_FJ_ROYA         = 0x96,
        VK_LSHIFT              = 0xA0,
        VK_RSHIFT              = 0xA1,
        VK_LCONTROL            = 0xA2,
        VK_RCONTROL            = 0xA3,
        VK_LMENU               = 0xA4,
        VK_RMENU               = 0xA5,
        VK_BROWSER_BACK        = 0xA6,
        VK_BROWSER_FORWARD     = 0xA7,
        VK_BROWSER_REFRESH     = 0xA8,
        VK_BROWSER_STOP        = 0xA9,
        VK_BROWSER_SEARCH      = 0xAA,
        VK_BROWSER_FAVORITES   = 0xAB,
        VK_BROWSER_HOME        = 0xAC,
        VK_VOLUME_MUTE         = 0xAD,
        VK_VOLUME_DOWN         = 0xAE,
        VK_VOLUME_UP           = 0xAF,
        VK_MEDIA_NEXT_TRACK    = 0xB0,
        VK_MEDIA_PREV_TRACK    = 0xB1,
        VK_MEDIA_STOP          = 0xB2,
        VK_MEDIA_PLAY_PAUSE    = 0xB3,
        VK_LAUNCH_MAIL         = 0xB4,
        VK_LAUNCH_MEDIA_SELECT = 0xB5,
        VK_LAUNCH_APP1         = 0xB6,
        VK_LAUNCH_APP2         = 0xB7,
        VK_OEM_1               = 0xBA,
        VK_OEM_PLUS            = 0xBB,
        VK_OEM_COMMA           = 0xBC,
        VK_OEM_MINUS           = 0xBD,
        VK_OEM_PERIOD          = 0xBE,
        VK_OEM_2               = 0xBF,
        VK_OEM_3               = 0xC0,
        VK_OEM_4               = 0xDB,
        VK_OEM_5               = 0xDC,
        VK_OEM_6               = 0xDD,
        VK_OEM_7               = 0xDE,
        VK_OEM_8               = 0xDF,
        VK_OEM_AX              = 0xE1,
        VK_OEM_102             = 0xE2,
        VK_ICO_HELP            = 0xE3,
        VK_ICO_00              = 0xE4,
        VK_PROCESSKEY          = 0xE5,
        VK_ICO_CLEAR           = 0xE6,
        VK_PACKET              = 0xE7,
        VK_OEM_RESET           = 0xE9,
        VK_OEM_JUMP            = 0xEA,
        VK_OEM_PA1             = 0xEB,
        VK_OEM_PA2             = 0xEC,
        VK_OEM_PA3             = 0xED,
        VK_OEM_WSCTRL          = 0xEE,
        VK_OEM_CUSEL           = 0xEF,
        VK_OEM_ATTN            = 0xF0,
        VK_OEM_FINISH          = 0xF1,
        VK_OEM_COPY            = 0xF2,
        VK_OEM_AUTO            = 0xF3,
        VK_OEM_ENLW            = 0xF4,
        VK_OEM_BACKTAB         = 0xF5,
        VK_ATTN                = 0xF6,
        VK_CRSEL               = 0xF7,
        VK_EXSEL               = 0xF8,
        VK_EREOF               = 0xF9,
        VK_PLAY                = 0xFA,
        VK_ZOOM                = 0xFB,
        VK_NONAME              = 0xFC,
        VK_PA1                 = 0xFD,
        VK_OEM_CLEAR           = 0xFE;

    public static final int
        XBUTTON1 = 0x1,
        XBUTTON2 = 0x2;

    public static final int WHEEL_DELTA = 120;

    public static final int
        DPI_AWARENESS_INVALID           = -1,
        DPI_AWARENESS_UNAWARE           = 0,
        DPI_AWARENESS_SYSTEM_AWARE      = 1,
        DPI_AWARENESS_PER_MONITOR_AWARE = 2;

    public static final long
        DPI_AWARENESS_CONTEXT_UNAWARE              = -1L,
        DPI_AWARENESS_CONTEXT_SYSTEM_AWARE         = -2L,
        DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE    = -3L,
        DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2 = -4L;

    public static final int
        WPF_SETMINPOSITION       = 0x1,
        WPF_RESTORETOMAXIMIZED   = 0x2,
        WPF_ASYNCWINDOWPLACEMENT = 0x4;

    public static final int
        LWA_COLORKEY = 0x1,
        LWA_ALPHA    = 0x2;

    public static final int
        SM_CXSCREEN                    = 0,
        SM_CYSCREEN                    = 1,
        SM_CXVSCROLL                   = 2,
        SM_CYHSCROLL                   = 3,
        SM_CYCAPTION                   = 4,
        SM_CXBORDER                    = 5,
        SM_CYBORDER                    = 6,
        SM_CXDLGFRAME                  = 7,
        SM_CYDLGFRAME                  = 8,
        SM_CYVTHUMB                    = 9,
        SM_CXHTHUMB                    = 10,
        SM_CXICON                      = 11,
        SM_CYICON                      = 12,
        SM_CXCURSOR                    = 13,
        SM_CYCURSOR                    = 14,
        SM_CYMENU                      = 15,
        SM_CXFULLSCREEN                = 16,
        SM_CYFULLSCREEN                = 17,
        SM_CYKANJIWINDOW               = 18,
        SM_MOUSEPRESENT                = 19,
        SM_CYVSCROLL                   = 20,
        SM_CXHSCROLL                   = 21,
        SM_DEBUG                       = 22,
        SM_SWAPBUTTON                  = 23,
        SM_RESERVED1                   = 24,
        SM_RESERVED2                   = 25,
        SM_RESERVED3                   = 26,
        SM_RESERVED4                   = 27,
        SM_CXMIN                       = 28,
        SM_CYMIN                       = 29,
        SM_CXSIZE                      = 30,
        SM_CYSIZE                      = 31,
        SM_CXFRAME                     = 32,
        SM_CYFRAME                     = 33,
        SM_CXMINTRACK                  = 34,
        SM_CYMINTRACK                  = 35,
        SM_CXDOUBLECLK                 = 36,
        SM_CYDOUBLECLK                 = 37,
        SM_CXICONSPACING               = 38,
        SM_CYICONSPACING               = 39,
        SM_MENUDROPALIGNMENT           = 40,
        SM_PENWINDOWS                  = 41,
        SM_DBCSENABLED                 = 42,
        SM_CMOUSEBUTTONS               = 43,
        SM_CXFIXEDFRAME                = SM_CXDLGFRAME,
        SM_CYFIXEDFRAME                = SM_CYDLGFRAME,
        SM_CXSIZEFRAME                 = SM_CXFRAME,
        SM_CYSIZEFRAME                 = SM_CYFRAME,
        SM_SECURE                      = 44,
        SM_CXEDGE                      = 45,
        SM_CYEDGE                      = 46,
        SM_CXMINSPACING                = 47,
        SM_CYMINSPACING                = 48,
        SM_CXSMICON                    = 49,
        SM_CYSMICON                    = 50,
        SM_CYSMCAPTION                 = 51,
        SM_CXSMSIZE                    = 52,
        SM_CYSMSIZE                    = 53,
        SM_CXMENUSIZE                  = 54,
        SM_CYMENUSIZE                  = 55,
        SM_ARRANGE                     = 56,
        SM_CXMINIMIZED                 = 57,
        SM_CYMINIMIZED                 = 58,
        SM_CXMAXTRACK                  = 59,
        SM_CYMAXTRACK                  = 60,
        SM_CXMAXIMIZED                 = 61,
        SM_CYMAXIMIZED                 = 62,
        SM_NETWORK                     = 63,
        SM_CLEANBOOT                   = 67,
        SM_CXDRAG                      = 68,
        SM_CYDRAG                      = 69,
        SM_SHOWSOUNDS                  = 70,
        SM_CXMENUCHECK                 = 71,
        SM_CYMENUCHECK                 = 72,
        SM_SLOWMACHINE                 = 73,
        SM_MIDEASTENABLED              = 74,
        SM_MOUSEWHEELPRESENT           = 75,
        SM_XVIRTUALSCREEN              = 76,
        SM_YVIRTUALSCREEN              = 77,
        SM_CXVIRTUALSCREEN             = 78,
        SM_CYVIRTUALSCREEN             = 79,
        SM_CMONITORS                   = 80,
        SM_SAMEDISPLAYFORMAT           = 81,
        SM_IMMENABLED                  = 82,
        SM_REMOTESESSION               = 0x1000,
        SM_SHUTTINGDOWN                = 0x2000,
        SM_REMOTECONTROL               = 0x2001,
        SM_CARETBLINKINGENABLED        = 0x2002,
        SM_CXFOCUSBORDER               = 83,
        SM_CYFOCUSBORDER               = 84,
        SM_TABLETPC                    = 86,
        SM_MEDIACENTER                 = 87,
        SM_STARTER                     = 88,
        SM_SERVERR2                    = 89,
        SM_MOUSEHORIZONTALWHEELPRESENT = 91,
        SM_CXPADDEDBORDER              = 92,
        SM_DIGITIZER                   = 94,
        SM_MAXIMUMTOUCHES              = 95;

    public static final int
        TWF_FINETOUCH = 0x1,
        TWF_WANTPALM  = 0x2;

    public static final int
        TOUCHEVENTF_MOVE       = 0x1,
        TOUCHEVENTF_DOWN       = 0x2,
        TOUCHEVENTF_UP         = 0x4,
        TOUCHEVENTF_INRANGE    = 0x8,
        TOUCHEVENTF_PRIMARY    = 0x10,
        TOUCHEVENTF_NOCOALESCE = 0x20,
        TOUCHEVENTF_PEN        = 0x40,
        TOUCHEVENTF_PALM       = 0x80;

    public static final int
        TOUCHINPUTMASKF_TIMEFROMSYSTEM = 0x1,
        TOUCHINPUTMASKF_EXTRAINFO      = 0x2,
        TOUCHINPUTMASKF_CONTACTAREA    = 0x4;

    public static final int
        MONITOR_DEFAULTTONULL    = 0x0,
        MONITOR_DEFAULTTOPRIMARY = 0x1,
        MONITOR_DEFAULTTONEAREST = 0x2;

    public static final int MONITORINFOF_PRIMARY = 0x1;

    public static final int EDD_GET_DEVICE_INTERFACE_NAME = 0x1;

    public static final int
        ENUM_CURRENT_SETTINGS  = -1,
        ENUM_REGISTRY_SETTINGS = -2;

    public static final int
        EDS_RAWMODE     = 0x2,
        EDS_ROTATEDMODE = 0x4;

    public static final int
        CDS_UPDATEREGISTRY       = 0x1,
        CDS_TEST                 = 0x2,
        CDS_FULLSCREEN           = 0x4,
        CDS_GLOBAL               = 0x8,
        CDS_SET_PRIMARY          = 0x10,
        CDS_VIDEOPARAMETERS      = 0x20,
        CDS_ENABLE_UNSAFE_MODES  = 0x100,
        CDS_DISABLE_UNSAFE_MODES = 0x200,
        CDS_RESET                = 0x40000000,
        CDS_RESET_EX             = 0x20000000,
        CDS_NORESET              = 0x10000000;

    public static final int
        DISP_CHANGE_SUCCESSFUL  = 0,
        DISP_CHANGE_RESTART     = 1,
        DISP_CHANGE_FAILED      = -1,
        DISP_CHANGE_BADMODE     = -2,
        DISP_CHANGE_NOTUPDATED  = -3,
        DISP_CHANGE_BADFLAGS    = -4,
        DISP_CHANGE_BADPARAM    = -5,
        DISP_CHANGE_BADDUALVIEW = -6;

    public static final int
        INPUT_MOUSE    = 0,
        INPUT_KEYBOARD = 1,
        INPUT_HARDWARE = 2;

    public static final int
        MOUSEEVENTF_ABSOLUTE        = 0x8000,
        MOUSEEVENTF_HWHEEL          = 0x1000,
        MOUSEEVENTF_MOVE            = 0x1,
        MOUSEEVENTF_MOVE_NOCOALESCE = 0x2000,
        MOUSEEVENTF_LEFTDOWN        = 0x2,
        MOUSEEVENTF_LEFTUP          = 0x4,
        MOUSEEVENTF_RIGHTDOWN       = 0x8,
        MOUSEEVENTF_RIGHTUP         = 0x10,
        MOUSEEVENTF_MIDDLEDOWN      = 0x20,
        MOUSEEVENTF_MIDDLEUP        = 0x40,
        MOUSEEVENTF_VIRTUALDESK     = 0x4000,
        MOUSEEVENTF_WHEEL           = 0x800,
        MOUSEEVENTF_XDOWN           = 0x80,
        MOUSEEVENTF_XUP             = 0x100;

    public static final int
        KEYEVENTF_EXTENDEDKEY = 0x1,
        KEYEVENTF_KEYUP       = 0x2,
        KEYEVENTF_SCANCODE    = 0x8,
        KEYEVENTF_UNICODE     = 0x4;

    protected User32() {
        throw new UnsupportedOperationException();
    }

    // --- [ RegisterClassEx ] ---

    /** {@code ATOM RegisterClassEx(WNDCLASSEX const * lpwcx)} */
    public static native short nRegisterClassEx(long _GetLastError, long lpwcx, long __functionAddress);

    /** {@code ATOM RegisterClassEx(WNDCLASSEX const * lpwcx)} */
    public static short nRegisterClassEx(long _GetLastError, long lpwcx) {
        long __functionAddress = Functions.RegisterClassEx;
        if (CHECKS) {
            WNDCLASSEX.validate(lpwcx);
        }
        return nRegisterClassEx(_GetLastError, lpwcx, __functionAddress);
    }

    /** {@code ATOM RegisterClassEx(WNDCLASSEX const * lpwcx)} */
    @NativeType("ATOM")
    public static short RegisterClassEx(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("WNDCLASSEX const *") WNDCLASSEX lpwcx) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nRegisterClassEx(memAddressSafe(_GetLastError), lpwcx.address());
    }

    // --- [ UnregisterClass ] ---

    /** {@code BOOL UnregisterClass(LPCTSTR lpClassName, HINSTANCE hInstance)} */
    public static native int nUnregisterClass(long _GetLastError, long lpClassName, long hInstance, long __functionAddress);

    /** {@code BOOL UnregisterClass(LPCTSTR lpClassName, HINSTANCE hInstance)} */
    public static int nUnregisterClass(long _GetLastError, long lpClassName, long hInstance) {
        long __functionAddress = Functions.UnregisterClass;
        return nUnregisterClass(_GetLastError, lpClassName, hInstance, __functionAddress);
    }

    /** {@code BOOL UnregisterClass(LPCTSTR lpClassName, HINSTANCE hInstance)} */
    @NativeType("BOOL")
    public static boolean UnregisterClass(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCTSTR") ByteBuffer lpClassName, @NativeType("HINSTANCE") long hInstance) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2(lpClassName);
        }
        return nUnregisterClass(memAddressSafe(_GetLastError), memAddress(lpClassName), hInstance) != 0;
    }

    /** {@code BOOL UnregisterClass(LPCTSTR lpClassName, HINSTANCE hInstance)} */
    @NativeType("BOOL")
    public static boolean UnregisterClass(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCTSTR") CharSequence lpClassName, @NativeType("HINSTANCE") long hInstance) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(lpClassName, true);
            long lpClassNameEncoded = stack.getPointerAddress();
            return nUnregisterClass(memAddressSafe(_GetLastError), lpClassNameEncoded, hInstance) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ CreateWindowEx ] ---

    /** {@code HWND CreateWindowEx(DWORD dwExStyle, LPCTSTR lpClassName, LPCTSTR lpWindowName, DWORD dwStyle, int x, int y, int nWidth, int nHeight, HWND hWndParent, HMENU hMenu, HINSTANCE hInstance, LPVOID lpParam)} */
    public static native long nCreateWindowEx(long _GetLastError, int dwExStyle, long lpClassName, long lpWindowName, int dwStyle, int x, int y, int nWidth, int nHeight, long hWndParent, long hMenu, long hInstance, long lpParam, long __functionAddress);

    /** {@code HWND CreateWindowEx(DWORD dwExStyle, LPCTSTR lpClassName, LPCTSTR lpWindowName, DWORD dwStyle, int x, int y, int nWidth, int nHeight, HWND hWndParent, HMENU hMenu, HINSTANCE hInstance, LPVOID lpParam)} */
    public static long nCreateWindowEx(long _GetLastError, int dwExStyle, long lpClassName, long lpWindowName, int dwStyle, int x, int y, int nWidth, int nHeight, long hWndParent, long hMenu, long hInstance, long lpParam) {
        long __functionAddress = Functions.CreateWindowEx;
        return nCreateWindowEx(_GetLastError, dwExStyle, lpClassName, lpWindowName, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam, __functionAddress);
    }

    /** {@code HWND CreateWindowEx(DWORD dwExStyle, LPCTSTR lpClassName, LPCTSTR lpWindowName, DWORD dwStyle, int x, int y, int nWidth, int nHeight, HWND hWndParent, HMENU hMenu, HINSTANCE hInstance, LPVOID lpParam)} */
    @NativeType("HWND")
    public static long CreateWindowEx(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("DWORD") int dwExStyle, @NativeType("LPCTSTR") @Nullable ByteBuffer lpClassName, @NativeType("LPCTSTR") @Nullable ByteBuffer lpWindowName, @NativeType("DWORD") int dwStyle, int x, int y, int nWidth, int nHeight, @NativeType("HWND") long hWndParent, @NativeType("HMENU") long hMenu, @NativeType("HINSTANCE") long hInstance, @NativeType("LPVOID") long lpParam) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2Safe(lpClassName);
            checkNT2Safe(lpWindowName);
        }
        return nCreateWindowEx(memAddressSafe(_GetLastError), dwExStyle, memAddressSafe(lpClassName), memAddressSafe(lpWindowName), dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
    }

    /** {@code HWND CreateWindowEx(DWORD dwExStyle, LPCTSTR lpClassName, LPCTSTR lpWindowName, DWORD dwStyle, int x, int y, int nWidth, int nHeight, HWND hWndParent, HMENU hMenu, HINSTANCE hInstance, LPVOID lpParam)} */
    @NativeType("HWND")
    public static long CreateWindowEx(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("DWORD") int dwExStyle, @NativeType("LPCTSTR") @Nullable CharSequence lpClassName, @NativeType("LPCTSTR") @Nullable CharSequence lpWindowName, @NativeType("DWORD") int dwStyle, int x, int y, int nWidth, int nHeight, @NativeType("HWND") long hWndParent, @NativeType("HMENU") long hMenu, @NativeType("HINSTANCE") long hInstance, @NativeType("LPVOID") long lpParam) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(lpClassName, true);
            long lpClassNameEncoded = lpClassName == null ? NULL : stack.getPointerAddress();
            stack.nUTF16Safe(lpWindowName, true);
            long lpWindowNameEncoded = lpWindowName == null ? NULL : stack.getPointerAddress();
            return nCreateWindowEx(memAddressSafe(_GetLastError), dwExStyle, lpClassNameEncoded, lpWindowNameEncoded, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ DestroyWindow ] ---

    /** {@code BOOL DestroyWindow(HWND hWnd)} */
    public static native int nDestroyWindow(long _GetLastError, long hWnd, long __functionAddress);

    /** {@code BOOL DestroyWindow(HWND hWnd)} */
    public static int nDestroyWindow(long _GetLastError, long hWnd) {
        long __functionAddress = Functions.DestroyWindow;
        if (CHECKS) {
            check(hWnd);
        }
        return nDestroyWindow(_GetLastError, hWnd, __functionAddress);
    }

    /** {@code BOOL DestroyWindow(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean DestroyWindow(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nDestroyWindow(memAddressSafe(_GetLastError), hWnd) != 0;
    }

    // --- [ DefWindowProc ] ---

    /** {@code LRESULT DefWindowProc(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    @NativeType("LRESULT")
    public static long DefWindowProc(@NativeType("HWND") long hWnd, @NativeType("UINT") int Msg, @NativeType("WPARAM") long wParam, @NativeType("LPARAM") long lParam) {
        long __functionAddress = Functions.DefWindowProc;
        if (CHECKS) {
            check(hWnd);
        }
        return callPPPP(hWnd, Msg, wParam, lParam, __functionAddress);
    }

    // --- [ CallWindowProc ] ---

    /** {@code LRESULT CallWindowProc(WNDPROC lpPrevWndFunc, HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    public static long nCallWindowProc(long lpPrevWndFunc, long hWnd, int Msg, long wParam, long lParam) {
        long __functionAddress = Functions.CallWindowProc;
        if (CHECKS) {
            check(hWnd);
        }
        return callPPPPP(lpPrevWndFunc, hWnd, Msg, wParam, lParam, __functionAddress);
    }

    /** {@code LRESULT CallWindowProc(WNDPROC lpPrevWndFunc, HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    @NativeType("LRESULT")
    public static long CallWindowProc(@NativeType("WNDPROC") WindowProcI lpPrevWndFunc, @NativeType("HWND") long hWnd, @NativeType("UINT") int Msg, @NativeType("WPARAM") long wParam, @NativeType("LPARAM") long lParam) {
        return nCallWindowProc(lpPrevWndFunc.address(), hWnd, Msg, wParam, lParam);
    }

    // --- [ ShowWindow ] ---

    /** {@code BOOL ShowWindow(HWND hWnd, int nCmdShow)} */
    @NativeType("BOOL")
    public static boolean ShowWindow(@NativeType("HWND") long hWnd, int nCmdShow) {
        long __functionAddress = Functions.ShowWindow;
        if (CHECKS) {
            check(hWnd);
        }
        return callPI(hWnd, nCmdShow, __functionAddress) != 0;
    }

    // --- [ UpdateWindow ] ---

    /** {@code BOOL UpdateWindow(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean UpdateWindow(@NativeType("HWND") long hWnd) {
        long __functionAddress = Functions.UpdateWindow;
        if (CHECKS) {
            check(hWnd);
        }
        return callPI(hWnd, __functionAddress) != 0;
    }

    // --- [ SetWindowPos ] ---

    /** {@code BOOL SetWindowPos(HWND hWnd, HWND hWndInsertAfter, int X, int Y, int cx, int cy, UINT uFlags)} */
    public static native int nSetWindowPos(long _GetLastError, long hWnd, long hWndInsertAfter, int X, int Y, int cx, int cy, int uFlags, long __functionAddress);

    /** {@code BOOL SetWindowPos(HWND hWnd, HWND hWndInsertAfter, int X, int Y, int cx, int cy, UINT uFlags)} */
    public static int nSetWindowPos(long _GetLastError, long hWnd, long hWndInsertAfter, int X, int Y, int cx, int cy, int uFlags) {
        long __functionAddress = Functions.SetWindowPos;
        if (CHECKS) {
            check(hWnd);
        }
        return nSetWindowPos(_GetLastError, hWnd, hWndInsertAfter, X, Y, cx, cy, uFlags, __functionAddress);
    }

    /** {@code BOOL SetWindowPos(HWND hWnd, HWND hWndInsertAfter, int X, int Y, int cx, int cy, UINT uFlags)} */
    @NativeType("BOOL")
    public static boolean SetWindowPos(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("HWND") long hWndInsertAfter, int X, int Y, int cx, int cy, @NativeType("UINT") int uFlags) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSetWindowPos(memAddressSafe(_GetLastError), hWnd, hWndInsertAfter, X, Y, cx, cy, uFlags) != 0;
    }

    // --- [ SetWindowText ] ---

    /** {@code BOOL SetWindowText(HWND hWnd, LPCTSTR lpString)} */
    public static native int nSetWindowText(long _GetLastError, long hWnd, long lpString, long __functionAddress);

    /** {@code BOOL SetWindowText(HWND hWnd, LPCTSTR lpString)} */
    public static int nSetWindowText(long _GetLastError, long hWnd, long lpString) {
        long __functionAddress = Functions.SetWindowText;
        if (CHECKS) {
            check(hWnd);
        }
        return nSetWindowText(_GetLastError, hWnd, lpString, __functionAddress);
    }

    /** {@code BOOL SetWindowText(HWND hWnd, LPCTSTR lpString)} */
    @NativeType("BOOL")
    public static boolean SetWindowText(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("LPCTSTR") ByteBuffer lpString) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2(lpString);
        }
        return nSetWindowText(memAddressSafe(_GetLastError), hWnd, memAddress(lpString)) != 0;
    }

    /** {@code BOOL SetWindowText(HWND hWnd, LPCTSTR lpString)} */
    @NativeType("BOOL")
    public static boolean SetWindowText(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("LPCTSTR") CharSequence lpString) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(lpString, true);
            long lpStringEncoded = stack.getPointerAddress();
            return nSetWindowText(memAddressSafe(_GetLastError), hWnd, lpStringEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetMessage ] ---

    /** {@code BOOL GetMessage(LPMSG lpMsg, HWND hWnd, UINT wMsgFilterMin, UINT wMsgFilterMax)} */
    public static native int nGetMessage(long _GetLastError, long lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax, long __functionAddress);

    /** {@code BOOL GetMessage(LPMSG lpMsg, HWND hWnd, UINT wMsgFilterMin, UINT wMsgFilterMax)} */
    public static int nGetMessage(long _GetLastError, long lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax) {
        long __functionAddress = Functions.GetMessage;
        return nGetMessage(_GetLastError, lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax, __functionAddress);
    }

    /** {@code BOOL GetMessage(LPMSG lpMsg, HWND hWnd, UINT wMsgFilterMin, UINT wMsgFilterMax)} */
    @NativeType("BOOL")
    public static boolean GetMessage(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPMSG") MSG lpMsg, @NativeType("HWND") long hWnd, @NativeType("UINT") int wMsgFilterMin, @NativeType("UINT") int wMsgFilterMax) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetMessage(memAddressSafe(_GetLastError), lpMsg.address(), hWnd, wMsgFilterMin, wMsgFilterMax) != 0;
    }

    // --- [ PeekMessage ] ---

    /** {@code BOOL PeekMessage(LPMSG lpMsg, HWND hWnd, UINT wMsgFilterMin, UINT wMsgFilterMax, UINT wRemoveMsg)} */
    public static int nPeekMessage(long lpMsg, long hWnd, int wMsgFilterMin, int wMsgFilterMax, int wRemoveMsg) {
        long __functionAddress = Functions.PeekMessage;
        return callPPI(lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax, wRemoveMsg, __functionAddress);
    }

    /** {@code BOOL PeekMessage(LPMSG lpMsg, HWND hWnd, UINT wMsgFilterMin, UINT wMsgFilterMax, UINT wRemoveMsg)} */
    @NativeType("BOOL")
    public static boolean PeekMessage(@NativeType("LPMSG") MSG lpMsg, @NativeType("HWND") long hWnd, @NativeType("UINT") int wMsgFilterMin, @NativeType("UINT") int wMsgFilterMax, @NativeType("UINT") int wRemoveMsg) {
        return nPeekMessage(lpMsg.address(), hWnd, wMsgFilterMin, wMsgFilterMax, wRemoveMsg) != 0;
    }

    // --- [ TranslateMessage ] ---

    /** {@code BOOL TranslateMessage(MSG const * lpMsg)} */
    public static int nTranslateMessage(long lpMsg) {
        long __functionAddress = Functions.TranslateMessage;
        return callPI(lpMsg, __functionAddress);
    }

    /** {@code BOOL TranslateMessage(MSG const * lpMsg)} */
    @NativeType("BOOL")
    public static boolean TranslateMessage(@NativeType("MSG const *") MSG lpMsg) {
        return nTranslateMessage(lpMsg.address()) != 0;
    }

    // --- [ WaitMessage ] ---

    /** {@code BOOL WaitMessage(void)} */
    public static native int nWaitMessage(long _GetLastError, long __functionAddress);

    /** {@code BOOL WaitMessage(void)} */
    public static int nWaitMessage(long _GetLastError) {
        long __functionAddress = Functions.WaitMessage;
        return nWaitMessage(_GetLastError, __functionAddress);
    }

    /** {@code BOOL WaitMessage(void)} */
    @NativeType("BOOL")
    public static boolean WaitMessage(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nWaitMessage(memAddressSafe(_GetLastError)) != 0;
    }

    // --- [ DispatchMessage ] ---

    /** {@code LRESULT DispatchMessage(MSG const * lpmsg)} */
    public static long nDispatchMessage(long lpmsg) {
        long __functionAddress = Functions.DispatchMessage;
        return callPP(lpmsg, __functionAddress);
    }

    /** {@code LRESULT DispatchMessage(MSG const * lpmsg)} */
    @NativeType("LRESULT")
    public static long DispatchMessage(@NativeType("MSG const *") MSG lpmsg) {
        return nDispatchMessage(lpmsg.address());
    }

    // --- [ PostMessage ] ---

    /** {@code BOOL PostMessage(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    public static native int nPostMessage(long _GetLastError, long hWnd, int Msg, long wParam, long lParam, long __functionAddress);

    /** {@code BOOL PostMessage(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    public static int nPostMessage(long _GetLastError, long hWnd, int Msg, long wParam, long lParam) {
        long __functionAddress = Functions.PostMessage;
        return nPostMessage(_GetLastError, hWnd, Msg, wParam, lParam, __functionAddress);
    }

    /** {@code BOOL PostMessage(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    @NativeType("BOOL")
    public static boolean PostMessage(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("UINT") int Msg, @NativeType("WPARAM") long wParam, @NativeType("LPARAM") long lParam) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nPostMessage(memAddressSafe(_GetLastError), hWnd, Msg, wParam, lParam) != 0;
    }

    // --- [ SendMessage ] ---

    /** {@code BOOL SendMessage(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    public static native int nSendMessage(long _GetLastError, long hWnd, int Msg, long wParam, long lParam, long __functionAddress);

    /** {@code BOOL SendMessage(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    public static int nSendMessage(long _GetLastError, long hWnd, int Msg, long wParam, long lParam) {
        long __functionAddress = Functions.SendMessage;
        if (CHECKS) {
            check(hWnd);
        }
        return nSendMessage(_GetLastError, hWnd, Msg, wParam, lParam, __functionAddress);
    }

    /** {@code BOOL SendMessage(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam)} */
    @NativeType("BOOL")
    public static boolean SendMessage(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("UINT") int Msg, @NativeType("WPARAM") long wParam, @NativeType("LPARAM") long lParam) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSendMessage(memAddressSafe(_GetLastError), hWnd, Msg, wParam, lParam) != 0;
    }

    // --- [ AdjustWindowRectEx ] ---

    /** {@code BOOL AdjustWindowRectEx(LPRECT lpRect, DWORD dwStyle, BOOL bMenu, DWORD dwExStyle)} */
    public static native int nAdjustWindowRectEx(long _GetLastError, long lpRect, int dwStyle, int bMenu, int dwExStyle, long __functionAddress);

    /** {@code BOOL AdjustWindowRectEx(LPRECT lpRect, DWORD dwStyle, BOOL bMenu, DWORD dwExStyle)} */
    public static int nAdjustWindowRectEx(long _GetLastError, long lpRect, int dwStyle, int bMenu, int dwExStyle) {
        long __functionAddress = Functions.AdjustWindowRectEx;
        return nAdjustWindowRectEx(_GetLastError, lpRect, dwStyle, bMenu, dwExStyle, __functionAddress);
    }

    /** {@code BOOL AdjustWindowRectEx(LPRECT lpRect, DWORD dwStyle, BOOL bMenu, DWORD dwExStyle)} */
    @NativeType("BOOL")
    public static boolean AdjustWindowRectEx(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPRECT") RECT lpRect, @NativeType("DWORD") int dwStyle, @NativeType("BOOL") boolean bMenu, @NativeType("DWORD") int dwExStyle) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nAdjustWindowRectEx(memAddressSafe(_GetLastError), lpRect.address(), dwStyle, bMenu ? 1 : 0, dwExStyle) != 0;
    }

    // --- [ GetWindowRect ] ---

    /** {@code BOOL GetWindowRect(HWND hWnd, LPRECT lpRect)} */
    public static native int nGetWindowRect(long _GetLastError, long hWnd, long lpRect, long __functionAddress);

    /** {@code BOOL GetWindowRect(HWND hWnd, LPRECT lpRect)} */
    public static int nGetWindowRect(long _GetLastError, long hWnd, long lpRect) {
        long __functionAddress = Functions.GetWindowRect;
        if (CHECKS) {
            check(hWnd);
        }
        return nGetWindowRect(_GetLastError, hWnd, lpRect, __functionAddress);
    }

    /** {@code BOOL GetWindowRect(HWND hWnd, LPRECT lpRect)} */
    @NativeType("BOOL")
    public static boolean GetWindowRect(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("LPRECT") RECT lpRect) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetWindowRect(memAddressSafe(_GetLastError), hWnd, lpRect.address()) != 0;
    }

    // --- [ MoveWindow ] ---

    /** {@code BOOL MoveWindow(HWND hWnd, int X, int Y, int nWidth, int nHeight, BOOL bRepaint)} */
    public static native int nMoveWindow(long _GetLastError, long hWnd, int X, int Y, int nWidth, int nHeight, int bRepaint, long __functionAddress);

    /** {@code BOOL MoveWindow(HWND hWnd, int X, int Y, int nWidth, int nHeight, BOOL bRepaint)} */
    public static int nMoveWindow(long _GetLastError, long hWnd, int X, int Y, int nWidth, int nHeight, int bRepaint) {
        long __functionAddress = Functions.MoveWindow;
        if (CHECKS) {
            check(hWnd);
        }
        return nMoveWindow(_GetLastError, hWnd, X, Y, nWidth, nHeight, bRepaint, __functionAddress);
    }

    /** {@code BOOL MoveWindow(HWND hWnd, int X, int Y, int nWidth, int nHeight, BOOL bRepaint)} */
    @NativeType("BOOL")
    public static boolean MoveWindow(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, int X, int Y, int nWidth, int nHeight, @NativeType("BOOL") boolean bRepaint) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nMoveWindow(memAddressSafe(_GetLastError), hWnd, X, Y, nWidth, nHeight, bRepaint ? 1 : 0) != 0;
    }

    // --- [ GetWindowPlacement ] ---

    /** {@code BOOL GetWindowPlacement(HWND hWnd, WINDOWPLACEMENT * lpwndpl)} */
    public static native int nGetWindowPlacement(long _GetLastError, long hWnd, long lpwndpl, long __functionAddress);

    /** {@code BOOL GetWindowPlacement(HWND hWnd, WINDOWPLACEMENT * lpwndpl)} */
    public static int nGetWindowPlacement(long _GetLastError, long hWnd, long lpwndpl) {
        long __functionAddress = Functions.GetWindowPlacement;
        if (CHECKS) {
            check(hWnd);
        }
        return nGetWindowPlacement(_GetLastError, hWnd, lpwndpl, __functionAddress);
    }

    /** {@code BOOL GetWindowPlacement(HWND hWnd, WINDOWPLACEMENT * lpwndpl)} */
    @NativeType("BOOL")
    public static boolean GetWindowPlacement(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("WINDOWPLACEMENT *") WINDOWPLACEMENT lpwndpl) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetWindowPlacement(memAddressSafe(_GetLastError), hWnd, lpwndpl.address()) != 0;
    }

    // --- [ SetWindowPlacement ] ---

    /** {@code BOOL SetWindowPlacement(HWND hWnd, WINDOWPLACEMENT const * lpwndpl)} */
    public static native int nSetWindowPlacement(long _GetLastError, long hWnd, long lpwndpl, long __functionAddress);

    /** {@code BOOL SetWindowPlacement(HWND hWnd, WINDOWPLACEMENT const * lpwndpl)} */
    public static int nSetWindowPlacement(long _GetLastError, long hWnd, long lpwndpl) {
        long __functionAddress = Functions.SetWindowPlacement;
        if (CHECKS) {
            check(hWnd);
        }
        return nSetWindowPlacement(_GetLastError, hWnd, lpwndpl, __functionAddress);
    }

    /** {@code BOOL SetWindowPlacement(HWND hWnd, WINDOWPLACEMENT const * lpwndpl)} */
    @NativeType("BOOL")
    public static boolean SetWindowPlacement(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("WINDOWPLACEMENT const *") WINDOWPLACEMENT lpwndpl) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSetWindowPlacement(memAddressSafe(_GetLastError), hWnd, lpwndpl.address()) != 0;
    }

    // --- [ IsWindowVisible ] ---

    /** {@code BOOL IsWindowVisible(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean IsWindowVisible(@NativeType("HWND") long hWnd) {
        long __functionAddress = Functions.IsWindowVisible;
        if (CHECKS) {
            check(hWnd);
        }
        return callPI(hWnd, __functionAddress) != 0;
    }

    // --- [ IsIconic ] ---

    /** {@code BOOL IsIconic(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean IsIconic(@NativeType("HWND") long hWnd) {
        long __functionAddress = Functions.IsIconic;
        if (CHECKS) {
            check(hWnd);
        }
        return callPI(hWnd, __functionAddress) != 0;
    }

    // --- [ IsZoomed ] ---

    /** {@code BOOL IsZoomed(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean IsZoomed(@NativeType("HWND") long hWnd) {
        long __functionAddress = Functions.IsZoomed;
        if (CHECKS) {
            check(hWnd);
        }
        return callPI(hWnd, __functionAddress) != 0;
    }

    // --- [ BringWindowToTop ] ---

    /** {@code BOOL BringWindowToTop(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean BringWindowToTop(@NativeType("HWND") long hWnd) {
        long __functionAddress = Functions.BringWindowToTop;
        if (CHECKS) {
            check(hWnd);
        }
        return callPI(hWnd, __functionAddress) != 0;
    }

    // --- [ SetWindowLongPtr ] ---

    /** {@code LONG_PTR SetWindowLongPtr(HWND hWnd, int nIndex, LONG_PTR dwNewLong)} */
    public static native long nSetWindowLongPtr(long _GetLastError, long hWnd, int nIndex, long dwNewLong, long __functionAddress);

    /** {@code LONG_PTR SetWindowLongPtr(HWND hWnd, int nIndex, LONG_PTR dwNewLong)} */
    public static long nSetWindowLongPtr(long _GetLastError, long hWnd, int nIndex, long dwNewLong) {
        long __functionAddress = Functions.SetWindowLongPtr;
        if (CHECKS) {
            check(hWnd);
        }
        return nSetWindowLongPtr(_GetLastError, hWnd, nIndex, dwNewLong, __functionAddress);
    }

    /** {@code LONG_PTR SetWindowLongPtr(HWND hWnd, int nIndex, LONG_PTR dwNewLong)} */
    @NativeType("LONG_PTR")
    public static long SetWindowLongPtr(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, int nIndex, @NativeType("LONG_PTR") long dwNewLong) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSetWindowLongPtr(memAddressSafe(_GetLastError), hWnd, nIndex, dwNewLong);
    }

    // --- [ GetWindowLongPtr ] ---

    /** {@code LONG_PTR GetWindowLongPtr(HWND hWnd, int nIndex)} */
    public static native long nGetWindowLongPtr(long _GetLastError, long hWnd, int nIndex, long __functionAddress);

    /** {@code LONG_PTR GetWindowLongPtr(HWND hWnd, int nIndex)} */
    public static long nGetWindowLongPtr(long _GetLastError, long hWnd, int nIndex) {
        long __functionAddress = Functions.GetWindowLongPtr;
        if (CHECKS) {
            check(hWnd);
        }
        return nGetWindowLongPtr(_GetLastError, hWnd, nIndex, __functionAddress);
    }

    /** {@code LONG_PTR GetWindowLongPtr(HWND hWnd, int nIndex)} */
    @NativeType("LONG_PTR")
    public static long GetWindowLongPtr(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, int nIndex) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetWindowLongPtr(memAddressSafe(_GetLastError), hWnd, nIndex);
    }

    // --- [ SetClassLongPtr ] ---

    /** {@code LONG_PTR SetClassLongPtr(HWND hWnd, int nIndex, LONG_PTR dwNewLong)} */
    public static native long nSetClassLongPtr(long _GetLastError, long hWnd, int nIndex, long dwNewLong, long __functionAddress);

    /** {@code LONG_PTR SetClassLongPtr(HWND hWnd, int nIndex, LONG_PTR dwNewLong)} */
    public static long nSetClassLongPtr(long _GetLastError, long hWnd, int nIndex, long dwNewLong) {
        long __functionAddress = Functions.SetClassLongPtr;
        if (CHECKS) {
            check(hWnd);
        }
        return nSetClassLongPtr(_GetLastError, hWnd, nIndex, dwNewLong, __functionAddress);
    }

    /** {@code LONG_PTR SetClassLongPtr(HWND hWnd, int nIndex, LONG_PTR dwNewLong)} */
    @NativeType("LONG_PTR")
    public static long SetClassLongPtr(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, int nIndex, @NativeType("LONG_PTR") long dwNewLong) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSetClassLongPtr(memAddressSafe(_GetLastError), hWnd, nIndex, dwNewLong);
    }

    // --- [ GetClassLongPtr ] ---

    /** {@code LONG_PTR GetClassLongPtr(HWND hWnd, int nIndex)} */
    public static native long nGetClassLongPtr(long _GetLastError, long hWnd, int nIndex, long __functionAddress);

    /** {@code LONG_PTR GetClassLongPtr(HWND hWnd, int nIndex)} */
    public static long nGetClassLongPtr(long _GetLastError, long hWnd, int nIndex) {
        long __functionAddress = Functions.GetClassLongPtr;
        if (CHECKS) {
            check(hWnd);
        }
        return nGetClassLongPtr(_GetLastError, hWnd, nIndex, __functionAddress);
    }

    /** {@code LONG_PTR GetClassLongPtr(HWND hWnd, int nIndex)} */
    @NativeType("LONG_PTR")
    public static long GetClassLongPtr(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, int nIndex) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetClassLongPtr(memAddressSafe(_GetLastError), hWnd, nIndex);
    }

    // --- [ SetLayeredWindowAttributes ] ---

    /** {@code BOOL SetLayeredWindowAttributes(HWND hwnd, COLORREF crKey, BYTE bAlpha, DWORD dwFlags)} */
    public static native int nSetLayeredWindowAttributes(long _GetLastError, long hwnd, int crKey, byte bAlpha, int dwFlags, long __functionAddress);

    /** {@code BOOL SetLayeredWindowAttributes(HWND hwnd, COLORREF crKey, BYTE bAlpha, DWORD dwFlags)} */
    public static int nSetLayeredWindowAttributes(long _GetLastError, long hwnd, int crKey, byte bAlpha, int dwFlags) {
        long __functionAddress = Functions.SetLayeredWindowAttributes;
        if (CHECKS) {
            check(hwnd);
        }
        return nSetLayeredWindowAttributes(_GetLastError, hwnd, crKey, bAlpha, dwFlags, __functionAddress);
    }

    /** {@code BOOL SetLayeredWindowAttributes(HWND hwnd, COLORREF crKey, BYTE bAlpha, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean SetLayeredWindowAttributes(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hwnd, @NativeType("COLORREF") int crKey, @NativeType("BYTE") byte bAlpha, @NativeType("DWORD") int dwFlags) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nSetLayeredWindowAttributes(memAddressSafe(_GetLastError), hwnd, crKey, bAlpha, dwFlags) != 0;
    }

    // --- [ LoadIcon ] ---

    /** {@code HICON LoadIcon(HINSTANCE instance, LPCTSTR iconName)} */
    public static native long nLoadIcon(long _GetLastError, long instance, long iconName, long __functionAddress);

    /** {@code HICON LoadIcon(HINSTANCE instance, LPCTSTR iconName)} */
    public static long nLoadIcon(long _GetLastError, long instance, long iconName) {
        long __functionAddress = Functions.LoadIcon;
        return nLoadIcon(_GetLastError, instance, iconName, __functionAddress);
    }

    /** {@code HICON LoadIcon(HINSTANCE instance, LPCTSTR iconName)} */
    @NativeType("HICON")
    public static long LoadIcon(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HINSTANCE") long instance, @NativeType("LPCTSTR") ByteBuffer iconName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2(iconName);
        }
        return nLoadIcon(memAddressSafe(_GetLastError), instance, memAddress(iconName));
    }

    /** {@code HICON LoadIcon(HINSTANCE instance, LPCTSTR iconName)} */
    @NativeType("HICON")
    public static long LoadIcon(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HINSTANCE") long instance, @NativeType("LPCTSTR") CharSequence iconName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(iconName, true);
            long iconNameEncoded = stack.getPointerAddress();
            return nLoadIcon(memAddressSafe(_GetLastError), instance, iconNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadCursor ] ---

    /** {@code HCURSOR LoadCursor(HINSTANCE instance, LPCTSTR cursorName)} */
    public static native long nLoadCursor(long _GetLastError, long instance, long cursorName, long __functionAddress);

    /** {@code HCURSOR LoadCursor(HINSTANCE instance, LPCTSTR cursorName)} */
    public static long nLoadCursor(long _GetLastError, long instance, long cursorName) {
        long __functionAddress = Functions.LoadCursor;
        return nLoadCursor(_GetLastError, instance, cursorName, __functionAddress);
    }

    /** {@code HCURSOR LoadCursor(HINSTANCE instance, LPCTSTR cursorName)} */
    @NativeType("HCURSOR")
    public static long LoadCursor(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HINSTANCE") long instance, @NativeType("LPCTSTR") ByteBuffer cursorName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2(cursorName);
        }
        return nLoadCursor(memAddressSafe(_GetLastError), instance, memAddress(cursorName));
    }

    /** {@code HCURSOR LoadCursor(HINSTANCE instance, LPCTSTR cursorName)} */
    @NativeType("HCURSOR")
    public static long LoadCursor(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HINSTANCE") long instance, @NativeType("LPCTSTR") CharSequence cursorName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(cursorName, true);
            long cursorNameEncoded = stack.getPointerAddress();
            return nLoadCursor(memAddressSafe(_GetLastError), instance, cursorNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetDC ] ---

    /** {@code HDC GetDC(HWND hWnd)} */
    @NativeType("HDC")
    public static long GetDC(@NativeType("HWND") long hWnd) {
        long __functionAddress = Functions.GetDC;
        return callPP(hWnd, __functionAddress);
    }

    // --- [ ReleaseDC ] ---

    /** {@code BOOL ReleaseDC(HWND hWnd, HDC hDC)} */
    @NativeType("BOOL")
    public static boolean ReleaseDC(@NativeType("HWND") long hWnd, @NativeType("HDC") long hDC) {
        long __functionAddress = Functions.ReleaseDC;
        if (CHECKS) {
            check(hWnd);
            check(hDC);
        }
        return callPPI(hWnd, hDC, __functionAddress) != 0;
    }

    // --- [ GetSystemMetrics ] ---

    /** {@code int GetSystemMetrics(int index)} */
    public static int GetSystemMetrics(int index) {
        long __functionAddress = Functions.GetSystemMetrics;
        return callI(index, __functionAddress);
    }

    // --- [ RegisterTouchWindow ] ---

    /** {@code BOOL RegisterTouchWindow(HWND hWnd, ULONG ulFlags)} */
    public static native int nRegisterTouchWindow(long _GetLastError, long hWnd, int ulFlags, long __functionAddress);

    /** {@code BOOL RegisterTouchWindow(HWND hWnd, ULONG ulFlags)} */
    public static int nRegisterTouchWindow(long _GetLastError, long hWnd, int ulFlags) {
        long __functionAddress = Functions.RegisterTouchWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(hWnd);
        }
        return nRegisterTouchWindow(_GetLastError, hWnd, ulFlags, __functionAddress);
    }

    /** {@code BOOL RegisterTouchWindow(HWND hWnd, ULONG ulFlags)} */
    @NativeType("BOOL")
    public static boolean RegisterTouchWindow(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd, @NativeType("ULONG") int ulFlags) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nRegisterTouchWindow(memAddressSafe(_GetLastError), hWnd, ulFlags) != 0;
    }

    // --- [ UnregisterTouchWindow ] ---

    /** {@code BOOL UnregisterTouchWindow(HWND hWnd)} */
    public static native int nUnregisterTouchWindow(long _GetLastError, long hWnd, long __functionAddress);

    /** {@code BOOL UnregisterTouchWindow(HWND hWnd)} */
    public static int nUnregisterTouchWindow(long _GetLastError, long hWnd) {
        long __functionAddress = Functions.UnregisterTouchWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(hWnd);
        }
        return nUnregisterTouchWindow(_GetLastError, hWnd, __functionAddress);
    }

    /** {@code BOOL UnregisterTouchWindow(HWND hWnd)} */
    @NativeType("BOOL")
    public static boolean UnregisterTouchWindow(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HWND") long hWnd) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nUnregisterTouchWindow(memAddressSafe(_GetLastError), hWnd) != 0;
    }

    // --- [ IsTouchWindow ] ---

    /** {@code BOOL IsTouchWindow(HWND hWnd, PULONG pulFlags)} */
    public static int nIsTouchWindow(long hWnd, long pulFlags) {
        long __functionAddress = Functions.IsTouchWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(hWnd);
        }
        return callPPI(hWnd, pulFlags, __functionAddress);
    }

    /** {@code BOOL IsTouchWindow(HWND hWnd, PULONG pulFlags)} */
    @NativeType("BOOL")
    public static boolean IsTouchWindow(@NativeType("HWND") long hWnd, @NativeType("PULONG") @Nullable IntBuffer pulFlags) {
        if (CHECKS) {
            checkSafe(pulFlags, 1);
        }
        return nIsTouchWindow(hWnd, memAddressSafe(pulFlags)) != 0;
    }

    // --- [ GetTouchInputInfo ] ---

    /** {@code BOOL GetTouchInputInfo(HTOUCHINPUT hTouchInput, UINT cInputs, PTOUCHINPUT pInputs, int cbSize)} */
    public static native int nGetTouchInputInfo(long _GetLastError, long hTouchInput, int cInputs, long pInputs, int cbSize, long __functionAddress);

    /** {@code BOOL GetTouchInputInfo(HTOUCHINPUT hTouchInput, UINT cInputs, PTOUCHINPUT pInputs, int cbSize)} */
    public static int nGetTouchInputInfo(long _GetLastError, long hTouchInput, int cInputs, long pInputs, int cbSize) {
        long __functionAddress = Functions.GetTouchInputInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(hTouchInput);
        }
        return nGetTouchInputInfo(_GetLastError, hTouchInput, cInputs, pInputs, cbSize, __functionAddress);
    }

    /** {@code BOOL GetTouchInputInfo(HTOUCHINPUT hTouchInput, UINT cInputs, PTOUCHINPUT pInputs, int cbSize)} */
    @NativeType("BOOL")
    public static boolean GetTouchInputInfo(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HTOUCHINPUT") long hTouchInput, @NativeType("PTOUCHINPUT") TOUCHINPUT.Buffer pInputs, int cbSize) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetTouchInputInfo(memAddressSafe(_GetLastError), hTouchInput, pInputs.remaining(), pInputs.address(), cbSize) != 0;
    }

    // --- [ CloseTouchInputHandle ] ---

    /** {@code BOOL CloseTouchInputHandle(HTOUCHINPUT hTouchInput)} */
    public static native int nCloseTouchInputHandle(long _GetLastError, long hTouchInput, long __functionAddress);

    /** {@code BOOL CloseTouchInputHandle(HTOUCHINPUT hTouchInput)} */
    public static int nCloseTouchInputHandle(long _GetLastError, long hTouchInput) {
        long __functionAddress = Functions.CloseTouchInputHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(hTouchInput);
        }
        return nCloseTouchInputHandle(_GetLastError, hTouchInput, __functionAddress);
    }

    /** {@code BOOL CloseTouchInputHandle(HTOUCHINPUT hTouchInput)} */
    @NativeType("BOOL")
    public static boolean CloseTouchInputHandle(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HTOUCHINPUT") long hTouchInput) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nCloseTouchInputHandle(memAddressSafe(_GetLastError), hTouchInput) != 0;
    }

    // --- [ MonitorFromWindow ] ---

    /** {@code HMONITOR MonitorFromWindow(HWND hWnd, DWORD dwFlags)} */
    @NativeType("HMONITOR")
    public static long MonitorFromWindow(@NativeType("HWND") long hWnd, @NativeType("DWORD") int dwFlags) {
        long __functionAddress = Functions.MonitorFromWindow;
        if (CHECKS) {
            check(hWnd);
        }
        return callPP(hWnd, dwFlags, __functionAddress);
    }

    // --- [ GetMonitorInfo ] ---

    /** {@code BOOL GetMonitorInfo(HMONITOR hMonitor, LPMONITORINFOEX lpmi)} */
    public static int nGetMonitorInfo(long hMonitor, long lpmi) {
        long __functionAddress = Functions.GetMonitorInfo;
        if (CHECKS) {
            check(hMonitor);
        }
        return callPPI(hMonitor, lpmi, __functionAddress);
    }

    /** {@code BOOL GetMonitorInfo(HMONITOR hMonitor, LPMONITORINFOEX lpmi)} */
    @NativeType("BOOL")
    public static boolean GetMonitorInfo(@NativeType("HMONITOR") long hMonitor, @NativeType("LPMONITORINFOEX") MONITORINFOEX lpmi) {
        return nGetMonitorInfo(hMonitor, lpmi.address()) != 0;
    }

    // --- [ EnumDisplayDevices ] ---

    /** {@code BOOL EnumDisplayDevices(LPCTSTR lpDevice, DWORD iDevNum, PDISPLAY_DEVICE lpDisplayDevice, DWORD dwFlags)} */
    public static int nEnumDisplayDevices(long lpDevice, int iDevNum, long lpDisplayDevice, int dwFlags) {
        long __functionAddress = Functions.EnumDisplayDevices;
        return callPPI(lpDevice, iDevNum, lpDisplayDevice, dwFlags, __functionAddress);
    }

    /** {@code BOOL EnumDisplayDevices(LPCTSTR lpDevice, DWORD iDevNum, PDISPLAY_DEVICE lpDisplayDevice, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean EnumDisplayDevices(@NativeType("LPCTSTR") @Nullable ByteBuffer lpDevice, @NativeType("DWORD") int iDevNum, @NativeType("PDISPLAY_DEVICE") DISPLAY_DEVICE lpDisplayDevice, @NativeType("DWORD") int dwFlags) {
        if (CHECKS) {
            checkNT2Safe(lpDevice);
        }
        return nEnumDisplayDevices(memAddressSafe(lpDevice), iDevNum, lpDisplayDevice.address(), dwFlags) != 0;
    }

    /** {@code BOOL EnumDisplayDevices(LPCTSTR lpDevice, DWORD iDevNum, PDISPLAY_DEVICE lpDisplayDevice, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean EnumDisplayDevices(@NativeType("LPCTSTR") @Nullable CharSequence lpDevice, @NativeType("DWORD") int iDevNum, @NativeType("PDISPLAY_DEVICE") DISPLAY_DEVICE lpDisplayDevice, @NativeType("DWORD") int dwFlags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(lpDevice, true);
            long lpDeviceEncoded = lpDevice == null ? NULL : stack.getPointerAddress();
            return nEnumDisplayDevices(lpDeviceEncoded, iDevNum, lpDisplayDevice.address(), dwFlags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ EnumDisplaySettingsEx ] ---

    /** {@code BOOL EnumDisplaySettingsEx(LPCTSTR lpszDeviceName, DWORD iModeNum, DEVMODE * lpDevMode, DWORD dwFlags)} */
    public static int nEnumDisplaySettingsEx(long lpszDeviceName, int iModeNum, long lpDevMode, int dwFlags) {
        long __functionAddress = Functions.EnumDisplaySettingsEx;
        return callPPI(lpszDeviceName, iModeNum, lpDevMode, dwFlags, __functionAddress);
    }

    /** {@code BOOL EnumDisplaySettingsEx(LPCTSTR lpszDeviceName, DWORD iModeNum, DEVMODE * lpDevMode, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean EnumDisplaySettingsEx(@NativeType("LPCTSTR") @Nullable ByteBuffer lpszDeviceName, @NativeType("DWORD") int iModeNum, @NativeType("DEVMODE *") DEVMODE lpDevMode, @NativeType("DWORD") int dwFlags) {
        if (CHECKS) {
            checkNT2Safe(lpszDeviceName);
        }
        return nEnumDisplaySettingsEx(memAddressSafe(lpszDeviceName), iModeNum, lpDevMode.address(), dwFlags) != 0;
    }

    /** {@code BOOL EnumDisplaySettingsEx(LPCTSTR lpszDeviceName, DWORD iModeNum, DEVMODE * lpDevMode, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean EnumDisplaySettingsEx(@NativeType("LPCTSTR") @Nullable CharSequence lpszDeviceName, @NativeType("DWORD") int iModeNum, @NativeType("DEVMODE *") DEVMODE lpDevMode, @NativeType("DWORD") int dwFlags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(lpszDeviceName, true);
            long lpszDeviceNameEncoded = lpszDeviceName == null ? NULL : stack.getPointerAddress();
            return nEnumDisplaySettingsEx(lpszDeviceNameEncoded, iModeNum, lpDevMode.address(), dwFlags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ChangeDisplaySettingsEx ] ---

    /** {@code LONG ChangeDisplaySettingsEx(LPCTSTR lpszDeviceName, DEVMODE * lpDevMode, HWND hwnd, DWORD dwflags, LPVOID lParam)} */
    public static int nChangeDisplaySettingsEx(long lpszDeviceName, long lpDevMode, long hwnd, int dwflags, long lParam) {
        long __functionAddress = Functions.ChangeDisplaySettingsEx;
        return callPPPPI(lpszDeviceName, lpDevMode, hwnd, dwflags, lParam, __functionAddress);
    }

    /** {@code LONG ChangeDisplaySettingsEx(LPCTSTR lpszDeviceName, DEVMODE * lpDevMode, HWND hwnd, DWORD dwflags, LPVOID lParam)} */
    @NativeType("LONG")
    public static int ChangeDisplaySettingsEx(@NativeType("LPCTSTR") @Nullable ByteBuffer lpszDeviceName, @NativeType("DEVMODE *") @Nullable DEVMODE lpDevMode, @NativeType("HWND") long hwnd, @NativeType("DWORD") int dwflags, @NativeType("LPVOID") long lParam) {
        if (CHECKS) {
            checkNT2Safe(lpszDeviceName);
        }
        return nChangeDisplaySettingsEx(memAddressSafe(lpszDeviceName), memAddressSafe(lpDevMode), hwnd, dwflags, lParam);
    }

    /** {@code LONG ChangeDisplaySettingsEx(LPCTSTR lpszDeviceName, DEVMODE * lpDevMode, HWND hwnd, DWORD dwflags, LPVOID lParam)} */
    @NativeType("LONG")
    public static int ChangeDisplaySettingsEx(@NativeType("LPCTSTR") @Nullable CharSequence lpszDeviceName, @NativeType("DEVMODE *") @Nullable DEVMODE lpDevMode, @NativeType("HWND") long hwnd, @NativeType("DWORD") int dwflags, @NativeType("LPVOID") long lParam) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(lpszDeviceName, true);
            long lpszDeviceNameEncoded = lpszDeviceName == null ? NULL : stack.getPointerAddress();
            return nChangeDisplaySettingsEx(lpszDeviceNameEncoded, memAddressSafe(lpDevMode), hwnd, dwflags, lParam);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetCursorPos ] ---

    /** {@code BOOL GetCursorPos(LPPOINT point)} */
    public static int nGetCursorPos(long point) {
        long __functionAddress = Functions.GetCursorPos;
        return callPI(point, __functionAddress);
    }

    /** {@code BOOL GetCursorPos(LPPOINT point)} */
    @NativeType("BOOL")
    public static boolean GetCursorPos(@NativeType("LPPOINT") POINT point) {
        return nGetCursorPos(point.address()) != 0;
    }

    // --- [ SetCursorPos ] ---

    /** {@code BOOL SetCursorPos(int X, int Y)} */
    @NativeType("BOOL")
    public static boolean SetCursorPos(int X, int Y) {
        long __functionAddress = Functions.SetCursorPos;
        return callI(X, Y, __functionAddress) != 0;
    }

    // --- [ ClipCursor ] ---

    /** {@code BOOL ClipCursor(RECT const * rect)} */
    public static int nClipCursor(long rect) {
        long __functionAddress = Functions.ClipCursor;
        return callPI(rect, __functionAddress);
    }

    /** {@code BOOL ClipCursor(RECT const * rect)} */
    @NativeType("BOOL")
    public static boolean ClipCursor(@NativeType("RECT const *") @Nullable RECT rect) {
        return nClipCursor(memAddressSafe(rect)) != 0;
    }

    // --- [ ShowCursor ] ---

    /** {@code int ShowCursor(BOOL show)} */
    public static int ShowCursor(@NativeType("BOOL") boolean show) {
        long __functionAddress = Functions.ShowCursor;
        return callI(show ? 1 : 0, __functionAddress);
    }

    // --- [ SetCursor ] ---

    /** {@code HCURSOR SetCursor(HCURSOR hCursor)} */
    @NativeType("HCURSOR")
    public static long SetCursor(@NativeType("HCURSOR") long hCursor) {
        long __functionAddress = Functions.SetCursor;
        return callPP(hCursor, __functionAddress);
    }

    // --- [ ClientToScreen ] ---

    /** {@code BOOL ClientToScreen(HWND hWnd, LPPOINT lpPoint)} */
    public static int nClientToScreen(long hWnd, long lpPoint) {
        long __functionAddress = Functions.ClientToScreen;
        if (CHECKS) {
            check(hWnd);
        }
        return callPPI(hWnd, lpPoint, __functionAddress);
    }

    /** {@code BOOL ClientToScreen(HWND hWnd, LPPOINT lpPoint)} */
    @NativeType("BOOL")
    public static boolean ClientToScreen(@NativeType("HWND") long hWnd, @NativeType("LPPOINT") POINT lpPoint) {
        return nClientToScreen(hWnd, lpPoint.address()) != 0;
    }

    // --- [ GetAsyncKeyState ] ---

    /** {@code SHORT GetAsyncKeyState(int vKey)} */
    @NativeType("SHORT")
    public static short GetAsyncKeyState(int vKey) {
        long __functionAddress = Functions.GetAsyncKeyState;
        return callS(vKey, __functionAddress);
    }

    // --- [ GetMessageExtraInfo ] ---

    /** {@code LPARAM GetMessageExtraInfo(void)} */
    @NativeType("LPARAM")
    public static long GetMessageExtraInfo() {
        long __functionAddress = Functions.GetMessageExtraInfo;
        return callP(__functionAddress);
    }

    // --- [ SendInput ] ---

    /** {@code UINT SendInput(UINT cInputs, PINPUT pInputs, int cbSize)} */
    public static int nSendInput(int cInputs, long pInputs, int cbSize) {
        long __functionAddress = Functions.SendInput;
        return callPI(cInputs, pInputs, cbSize, __functionAddress);
    }

    /** {@code UINT SendInput(UINT cInputs, PINPUT pInputs, int cbSize)} */
    @NativeType("UINT")
    public static int SendInput(@NativeType("PINPUT") INPUT.Buffer pInputs, int cbSize) {
        return nSendInput(pInputs.remaining(), pInputs.address(), cbSize);
    }

    // --- [ GetDpiForSystem ] ---

    /** {@code UINT GetDpiForSystem(void)} */
    @NativeType("UINT")
    public static int GetDpiForSystem() {
        long __functionAddress = Functions.GetDpiForSystem;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ GetDpiForWindow ] ---

    /** {@code UINT GetDpiForWindow(HWND hwnd)} */
    @NativeType("UINT")
    public static int GetDpiForWindow(@NativeType("HWND") long hwnd) {
        long __functionAddress = Functions.GetDpiForWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(hwnd);
        }
        return callPI(hwnd, __functionAddress);
    }

    // --- [ GetAwarenessFromDpiAwarenessContext ] ---

    /** {@code DPI_AWARENESS GetAwarenessFromDpiAwarenessContext(DPI_AWARENESS_CONTEXT value)} */
    @NativeType("DPI_AWARENESS")
    public static int GetAwarenessFromDpiAwarenessContext(@NativeType("DPI_AWARENESS_CONTEXT") long value) {
        long __functionAddress = Functions.GetAwarenessFromDpiAwarenessContext;
        if (CHECKS) {
            check(__functionAddress);
            check(value);
        }
        return callPI(value, __functionAddress);
    }

    // --- [ GetThreadDpiAwarenessContext ] ---

    /** {@code DPI_AWARENESS_CONTEXT GetThreadDpiAwarenessContext(void)} */
    @NativeType("DPI_AWARENESS_CONTEXT")
    public static long GetThreadDpiAwarenessContext() {
        long __functionAddress = Functions.GetThreadDpiAwarenessContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ GetWindowDpiAwarenessContext ] ---

    /** {@code DPI_AWARENESS_CONTEXT GetWindowDpiAwarenessContext(HWND hwnd)} */
    @NativeType("DPI_AWARENESS_CONTEXT")
    public static long GetWindowDpiAwarenessContext(@NativeType("HWND") long hwnd) {
        long __functionAddress = Functions.GetWindowDpiAwarenessContext;
        if (CHECKS) {
            check(__functionAddress);
            check(hwnd);
        }
        return callPP(hwnd, __functionAddress);
    }

    // --- [ IsValidDpiAwarenessContext ] ---

    /** {@code BOOL IsValidDpiAwarenessContext(DPI_AWARENESS_CONTEXT value)} */
    @NativeType("BOOL")
    public static boolean IsValidDpiAwarenessContext(@NativeType("DPI_AWARENESS_CONTEXT") long value) {
        long __functionAddress = Functions.IsValidDpiAwarenessContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(value, __functionAddress) != 0;
    }

    // --- [ SetThreadDpiAwarenessContext ] ---

    /** {@code DPI_AWARENESS_CONTEXT SetThreadDpiAwarenessContext(DPI_AWARENESS_CONTEXT dpiContext)} */
    @NativeType("DPI_AWARENESS_CONTEXT")
    public static long SetThreadDpiAwarenessContext(@NativeType("DPI_AWARENESS_CONTEXT") long dpiContext) {
        long __functionAddress = Functions.SetThreadDpiAwarenessContext;
        if (CHECKS) {
            check(__functionAddress);
            check(dpiContext);
        }
        return callPP(dpiContext, __functionAddress);
    }

    /** {@code BOOL IsTouchWindow(HWND hWnd, PULONG pulFlags)} */
    @NativeType("BOOL")
    public static boolean IsTouchWindow(@NativeType("HWND") long hWnd, @NativeType("PULONG") int @Nullable [] pulFlags) {
        long __functionAddress = Functions.IsTouchWindow;
        if (CHECKS) {
            check(__functionAddress);
            check(hWnd);
            checkSafe(pulFlags, 1);
        }
        return callPPI(hWnd, pulFlags, __functionAddress) != 0;
    }

    @NativeType("LONG_PTR")
    public static long GetWindowLongPtr(@NativeType("HWND") long hWnd, int nIndex) {
        return nGetWindowLongPtr(NULL, hWnd, nIndex);
    }

}