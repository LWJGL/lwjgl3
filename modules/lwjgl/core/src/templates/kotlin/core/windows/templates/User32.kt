/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows.templates

import org.lwjgl.generator.*
import core.windows.*

val User32 = "User32".nativeClass(Module.CORE_WINDOWS, nativeSubPath = "windows", binding = simpleBinding(Module.CORE_WINDOWS, "user32")) {
    nativeDirective("#define APIENTRY __stdcall")

    documentation = "Native bindings to WinUser.h and user32.dll."

    IntConstant(
        "Window Styles",
        "WS_OVERLAPPED"..0x00000000,
        "WS_POPUP"..0x80000000.i,
        "WS_CHILD"..0x40000000,
        "WS_MINIMIZE"..0x20000000,
        "WS_VISIBLE"..0x10000000,
        "WS_DISABLED"..0x08000000,
        "WS_CLIPSIBLINGS"..0x04000000,
        "WS_CLIPCHILDREN"..0x02000000,
        "WS_MAXIMIZE"..0x01000000,
        "WS_CAPTION"..0x00C00000, /* WS_BORDER | WS_DLGFRAME  */
        "WS_BORDER"..0x00800000,
        "WS_DLGFRAME"..0x00400000,
        "WS_VSCROLL"..0x00200000,
        "WS_HSCROLL"..0x00100000,
        "WS_SYSMENU"..0x00080000,
        "WS_THICKFRAME"..0x00040000,
        "WS_GROUP"..0x00020000,
        "WS_TABSTOP"..0x00010000,

        "WS_MINIMIZEBOX"..0x00020000,
        "WS_MAXIMIZEBOX"..0x00010000,

        // Common Window Styles
        "WS_OVERLAPPEDWINDOW".."WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX",
        "WS_POPUPWINDOW".."WS_POPUP | WS_BORDER | WS_SYSMENU",
        "WS_CHILDWINDOW".."WS_CHILD",

        "WS_TILED".."WS_OVERLAPPED",
        "WS_ICONIC".."WS_MINIMIZE",
        "WS_SIZEBOX".."WS_THICKFRAME",
        "WS_TILEDWINDOW".."WS_OVERLAPPEDWINDOW"
    )

    IntConstant(
        "Extended Window Styles",
        "WS_EX_DLGMODALFRAME"..0x00000001,
        "WS_EX_NOPARENTNOTIFY"..0x00000004,
        "WS_EX_TOPMOST"..0x00000008,
        "WS_EX_ACCEPTFILES"..0x00000010,
        "WS_EX_TRANSPARENT"..0x00000020,
        "WS_EX_MDICHILD"..0x00000040,
        "WS_EX_TOOLWINDOW"..0x00000080,
        "WS_EX_WINDOWEDGE"..0x00000100,
        "WS_EX_CLIENTEDGE"..0x00000200,
        "WS_EX_CONTEXTHELP"..0x00000400,

        "WS_EX_RIGHT"..0x00001000,
        "WS_EX_LEFT"..0x00000000,
        "WS_EX_RTLREADING"..0x00002000,
        "WS_EX_LTRREADING"..0x00000000,
        "WS_EX_LEFTSCROLLBAR"..0x00004000,
        "WS_EX_RIGHTSCROLLBAR"..0x00000000,

        "WS_EX_CONTROLPARENT"..0x00010000,
        "WS_EX_STATICEDGE"..0x00020000,
        "WS_EX_APPWINDOW"..0x00040000,

        "WS_EX_OVERLAPPEDWINDOW".."WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE",
        "WS_EX_PALETTEWINDOW".."WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST",

        "WS_EX_LAYERED"..0x00080000,

        "WS_EX_NOINHERITLAYOUT"..0x00100000, // Disable inheritence of mirroring by children
        "WS_EX_LAYOUTRTL"..0x00400000, // Right to left mirroring

        "WS_EX_COMPOSITED"..0x02000000, // WIN32_WINNT >= 0x0501

        "WS_EX_NOACTIVATE"..0x08000000
    )

    IntConstant(
        "May be used in #CreateWindowEx() for the x, y, width, height parameters.",
        "CW_USEDEFAULT"..0x80000000.i
    )

    IntConstant(
        "Class styles",
        "CS_VREDRAW"..0x0001,
        "CS_HREDRAW"..0x0002,
        "CS_DBLCLKS"..0x0008,
        "CS_OWNDC"..0x0020,
        "CS_CLASSDC"..0x0040,
        "CS_PARENTDC"..0x0080,
        "CS_NOCLOSE"..0x0200,
        "CS_SAVEBITS"..0x0800,
        "CS_BYTEALIGNCLIENT"..0x1000,
        "CS_BYTEALIGNWINDOW"..0x2000,
        "CS_GLOBALCLASS"..0x4000,

        "CS_IME"..0x00010000,
        "CS_DROPSHADOW"..0x00020000 // _WIN32_WINNT >="..0x0501,
    )

    IntConstant(
        "Windows messages.",

        "WM_NULL"..0x0000,
        "WM_CREATE"..0x0001,
        "WM_DESTROY"..0x0002,
        "WM_MOVE"..0x0003,
        "WM_SIZE"..0x0005,
        "WM_ACTIVATE"..0x0006,
        "WM_SETFOCUS"..0x0007,
        "WM_KILLFOCUS"..0x0008,
        "WM_ENABLE"..0x000A,
        "WM_SETREDRAW"..0x000B,
        "WM_SETTEXT"..0x000C,
        "WM_GETTEXT"..0x000D,
        "WM_GETTEXTLENGTH"..0x000E,
        "WM_PAINT"..0x000F,
        "WM_CLOSE"..0x0010,
        "WM_QUERYENDSESSION"..0x0011,
        "WM_QUERYOPEN"..0x0013,
        "WM_ENDSESSION"..0x0016,
        "WM_QUIT"..0x0012,
        "WM_ERASEBKGND"..0x0014,
        "WM_SYSCOLORCHANGE"..0x0015,
        "WM_SHOWWINDOW"..0x0018,
        "WM_WININICHANGE"..0x001A,
        "WM_SETTINGCHANGE".."WM_WININICHANGE",
        "WM_DEVMODECHANGE"..0x001B,
        "WM_ACTIVATEAPP"..0x001C,
        "WM_FONTCHANGE"..0x001D,
        "WM_TIMECHANGE"..0x001E,
        "WM_CANCELMODE"..0x001F,
        "WM_SETCURSOR"..0x0020,
        "WM_MOUSEACTIVATE"..0x0021,
        "WM_CHILDACTIVATE"..0x0022,
        "WM_QUEUESYNC"..0x0023,
        "WM_GETMINMAXINFO"..0x0024,
        "WM_PAINTICON"..0x0026,
        "WM_ICONERASEBKGND"..0x0027,
        "WM_NEXTDLGCTL"..0x0028,
        "WM_SPOOLERSTATUS"..0x002A,
        "WM_DRAWITEM"..0x002B,
        "WM_MEASUREITEM"..0x002C,
        "WM_DELETEITEM"..0x002D,
        "WM_VKEYTOITEM"..0x002E,
        "WM_CHARTOITEM"..0x002F,
        "WM_SETFONT"..0x0030,
        "WM_GETFONT"..0x0031,
        "WM_SETHOTKEY"..0x0032,
        "WM_GETHOTKEY"..0x0033,
        "WM_QUERYDRAGICON"..0x0037,
        "WM_COMPAREITEM"..0x0039,
        "WM_GETOBJECT"..0x003D,
        "WM_COMPACTING"..0x0041,
        "WM_COMMNOTIFY"..0x0044,
        "WM_WINDOWPOSCHANGING"..0x0046,
        "WM_WINDOWPOSCHANGED"..0x0047,
        "WM_POWER"..0x0048,
        "WM_COPYDATA"..0x004A,
        "WM_CANCELJOURNAL"..0x004B,
        "WM_NOTIFY"..0x004E,
        "WM_INPUTLANGCHANGEREQUEST"..0x0050,
        "WM_INPUTLANGCHANGE"..0x0051,
        "WM_TCARD"..0x0052,
        "WM_HELP"..0x0053,
        "WM_USERCHANGED"..0x0054,
        "WM_NOTIFYFORMAT"..0x0055,
        "WM_CONTEXTMENU"..0x007B,
        "WM_STYLECHANGING"..0x007C,
        "WM_STYLECHANGED"..0x007D,
        "WM_DISPLAYCHANGE"..0x007E,
        "WM_GETICON"..0x007F,
        "WM_SETICON"..0x0080,
        "WM_NCCREATE"..0x0081,
        "WM_NCDESTROY"..0x0082,
        "WM_NCCALCSIZE"..0x0083,
        "WM_NCHITTEST"..0x0084,
        "WM_NCPAINT"..0x0085,
        "WM_NCACTIVATE"..0x0086,
        "WM_GETDLGCODE"..0x0087,
        "WM_SYNCPAINT"..0x0088,
        "WM_NCMOUSEMOVE"..0x00A0,
        "WM_NCLBUTTONDOWN"..0x00A1,
        "WM_NCLBUTTONUP"..0x00A2,
        "WM_NCLBUTTONDBLCLK"..0x00A3,
        "WM_NCRBUTTONDOWN"..0x00A4,
        "WM_NCRBUTTONUP"..0x00A5,
        "WM_NCRBUTTONDBLCLK"..0x00A6,
        "WM_NCMBUTTONDOWN"..0x00A7,
        "WM_NCMBUTTONUP"..0x00A8,
        "WM_NCMBUTTONDBLCLK"..0x00A9,
        "WM_NCXBUTTONDOWN"..0x00AB,
        "WM_NCXBUTTONUP"..0x00AC,
        "WM_NCXBUTTONDBLCLK"..0x00AD,

        // _WIN32_WINNT >= 0x0501
        "WM_INPUT_DEVICE_CHANGE"..0x00FE,
        "WM_INPUT"..0x00FF,

        "WM_KEYFIRST"..0x0100,
        "WM_KEYDOWN"..0x0100,
        "WM_KEYUP"..0x0101,
        "WM_CHAR"..0x0102,
        "WM_DEADCHAR"..0x0103,
        "WM_SYSKEYDOWN"..0x0104,
        "WM_SYSKEYUP"..0x0105,
        "WM_SYSCHAR"..0x0106,
        "WM_SYSDEADCHAR"..0x0107,

        // _WIN32_WINNT >= 0x0501
        "WM_UNICHAR"..0x0109,
        "UNICODE_NOCHAR"..0xFFFF,

        "WM_IME_STARTCOMPOSITION"..0x010D,
        "WM_IME_ENDCOMPOSITION"..0x010E,
        "WM_IME_COMPOSITION"..0x010F,
        "WM_IME_KEYLAST"..0x010F,
        "WM_INITDIALOG"..0x0110,
        "WM_COMMAND"..0x0111,
        "WM_SYSCOMMAND"..0x0112,
        "WM_TIMER"..0x0113,
        "WM_HSCROLL"..0x0114,
        "WM_VSCROLL"..0x0115,
        "WM_INITMENU"..0x0116,
        "WM_INITMENUPOPUP"..0x0117,

        // WINVER >= 0x0601
        "WM_GESTURE"..0x0119,
        "WM_GESTURENOTIFY"..0x011A,

        "WM_MENUSELECT"..0x011F,
        "WM_MENUCHAR"..0x0120,
        "WM_ENTERIDLE"..0x0121,
        "WM_MENURBUTTONUP"..0x0122,
        "WM_MENUDRAG"..0x0123,
        "WM_MENUGETOBJECT"..0x0124,
        "WM_UNINITMENUPOPUP"..0x0125,
        "WM_MENUCOMMAND"..0x0126,
        "WM_CHANGEUISTATE"..0x0127,
        "WM_UPDATEUISTATE"..0x0128,
        "WM_QUERYUISTATE"..0x0129,
        "WM_CTLCOLORMSGBOX"..0x0132,
        "WM_CTLCOLOREDIT"..0x0133,
        "WM_CTLCOLORLISTBOX"..0x0134,
        "WM_CTLCOLORBTN"..0x0135,
        "WM_CTLCOLORDLG"..0x0136,
        "WM_CTLCOLORSCROLLBAR"..0x0137,
        "WM_CTLCOLORSTATIC"..0x0138,
        "MN_GETHMENU"..0x01E1,
        "WM_MOUSEFIRST"..0x0200,
        "WM_MOUSEMOVE"..0x0200,
        "WM_LBUTTONDOWN"..0x0201,
        "WM_LBUTTONUP"..0x0202,
        "WM_LBUTTONDBLCLK"..0x0203,
        "WM_RBUTTONDOWN"..0x0204,
        "WM_RBUTTONUP"..0x0205,
        "WM_RBUTTONDBLCLK"..0x0206,
        "WM_MBUTTONDOWN"..0x0207,
        "WM_MBUTTONUP"..0x0208,
        "WM_MBUTTONDBLCLK"..0x0209,
        "WM_MOUSEWHEEL"..0x020A,
        "WM_XBUTTONDOWN"..0x020B,
        "WM_XBUTTONUP"..0x020C,
        "WM_XBUTTONDBLCLK"..0x020D,

        // _WIN32_WINNT >= 0x0600
        "WM_MOUSEHWHEEL"..0x020E,

        // TODO
        /*
        #if (_WIN32_WINNT >= 0x0600)
        "WM_MOUSELAST"..0x020E,
        #elif (_WIN32_WINNT >= 0x0500)
        "WM_MOUSELAST"..0x020D,
        #elif (_WIN32_WINNT >= 0x0400) || (_WIN32_WINDOWS > 0x0400)
        "WM_MOUSELAST"..0x020A,
        #else
        "WM_MOUSELAST"..0x0209,
        #endif
        */

        "WM_PARENTNOTIFY"..0x0210,
        "WM_ENTERMENULOOP"..0x0211,
        "WM_EXITMENULOOP"..0x0212,
        "WM_NEXTMENU"..0x0213,
        "WM_SIZING"..0x0214,
        "WM_CAPTURECHANGED"..0x0215,
        "WM_MOVING"..0x0216,
        "WM_POWERBROADCAST"..0x0218,
        "WM_DEVICECHANGE"..0x0219,
        "WM_MDICREATE"..0x0220,
        "WM_MDIDESTROY"..0x0221,
        "WM_MDIACTIVATE"..0x0222,
        "WM_MDIRESTORE"..0x0223,
        "WM_MDINEXT"..0x0224,
        "WM_MDIMAXIMIZE"..0x0225,
        "WM_MDITILE"..0x0226,
        "WM_MDICASCADE"..0x0227,
        "WM_MDIICONARRANGE"..0x0228,
        "WM_MDIGETACTIVE"..0x0229,
        "WM_MDISETMENU"..0x0230,
        "WM_ENTERSIZEMOVE"..0x0231,
        "WM_EXITSIZEMOVE"..0x0232,
        "WM_DROPFILES"..0x0233,
        "WM_MDIREFRESHMENU"..0x0234,

        // WINVER >= 0x0601
        "WM_TOUCH"..0x0240,

        "WM_IME_SETCONTEXT"..0x0281,
        "WM_IME_NOTIFY"..0x0282,
        "WM_IME_CONTROL"..0x0283,
        "WM_IME_COMPOSITIONFULL"..0x0284,
        "WM_IME_SELECT"..0x0285,
        "WM_IME_CHAR"..0x0286,
        "WM_IME_REQUEST"..0x0288,
        "WM_IME_KEYDOWN"..0x0290,
        "WM_IME_KEYUP"..0x0291,
        "WM_MOUSEHOVER"..0x02A1,
        "WM_MOUSELEAVE"..0x02A3,
        "WM_NCMOUSEHOVER"..0x02A0,
        "WM_NCMOUSELEAVE"..0x02A2,

        // _WIN32_WINNT >= 0x0501
        "WM_WTSSESSION_CHANGE"..0x02B1,
        "WM_TABLET_FIRST"..0x02c0,
        "WM_TABLET_LAST"..0x02df,

        "WM_CUT"..0x0300,
        "WM_COPY"..0x0301,
        "WM_PASTE"..0x0302,
        "WM_CLEAR"..0x0303,
        "WM_UNDO"..0x0304,
        "WM_RENDERFORMAT"..0x0305,
        "WM_RENDERALLFORMATS"..0x0306,
        "WM_DESTROYCLIPBOARD"..0x0307,
        "WM_DRAWCLIPBOARD"..0x0308,
        "WM_PAINTCLIPBOARD"..0x0309,
        "WM_VSCROLLCLIPBOARD"..0x030A,
        "WM_SIZECLIPBOARD"..0x030B,
        "WM_ASKCBFORMATNAME"..0x030C,
        "WM_CHANGECBCHAIN"..0x030D,
        "WM_HSCROLLCLIPBOARD"..0x030E,
        "WM_QUERYNEWPALETTE"..0x030F,
        "WM_PALETTEISCHANGING"..0x0310,
        "WM_PALETTECHANGED"..0x0311,
        "WM_HOTKEY"..0x0312,
        "WM_PRINT"..0x0317,
        "WM_PRINTCLIENT"..0x0318,
        "WM_APPCOMMAND"..0x0319,

        // _WIN32_WINNT >= 0x0501
        "WM_THEMECHANGED"..0x031A,
        "WM_CLIPBOARDUPDATE"..0x031D,

        // _WIN32_WINNT >= 0x0600
        "WM_DWMCOMPOSITIONCHANGED"..0x031E,
        "WM_DWMNCRENDERINGCHANGED"..0x031F,
        "WM_DWMCOLORIZATIONCOLORCHANGED"..0x0320,
        "WM_DWMWINDOWMAXIMIZEDCHANGE"..0x0321,
        "WM_DWMSENDICONICTHUMBNAIL"..0x0323,
        "WM_DWMSENDICONICLIVEPREVIEWBITMAP"..0x0326,
        "WM_GETTITLEBARINFOEX"..0x033F,

        "WM_HANDHELDFIRST"..0x0358,
        "WM_HANDHELDLAST"..0x035F,

        "WM_AFXFIRST"..0x0360,
        "WM_AFXLAST"..0x037F,
        "WM_PENWINFIRST"..0x0380,
        "WM_PENWINLAST"..0x038F,
        "WM_APP"..0x8000,

        "WM_USER"..0x0400
    )

    IntConstant(
        "#WM_ACTIVATE message {@code wParam} values.",

        "WA_ACTIVE".."1",
        "WA_CLICKACTIVE".."2",
        "WA_INACTIVE".."0"
    )

    IntConstant(
        "#WM_SIZE message {@code wParam} values.",

        "SIZE_RESTORED".."0",
        "SIZE_MINIMIZED".."1",
        "SIZE_MAXIMIZED".."2",
        "SIZE_MAXSHOW".."3",
        "SIZE_MAXHIDE".."4"
    )

    IntConstant(
        "#WM_DEVICECHANGE message {@code wParam} params.",

        "DBT_APPYBEGIN"..0x0000,
        "DBT_APPYEND"..0x0001,
        "DBT_DEVNODES_CHANGED"..0x0007,
        "DBT_QUERYCHANGECONFIG"..0x0017,
        "DBT_CONFIGCHANGED"..0x0018,
        "DBT_CONFIGCHANGECANCELED"..0x0019,
        "DBT_MONITORCHANGE"..0x001B
    )

    IntConstant(
        "System menu command values.",

        "SC_SIZE"..0xF000,
        "SC_MOVE"..0xF010,
        "SC_MINIMIZE"..0xF020,
        "SC_MAXIMIZE"..0xF030,
        "SC_NEXTWINDOW"..0xF040,
        "SC_PREVWINDOW"..0xF050,
        "SC_CLOSE"..0xF060,
        "SC_VSCROLL"..0xF070,
        "SC_HSCROLL"..0xF080,
        "SC_MOUSEMENU"..0xF090,
        "SC_KEYMENU"..0xF100,
        "SC_ARRANGE"..0xF110,
        "SC_RESTORE"..0xF120,
        "SC_TASKLIST"..0xF130,
        "SC_SCREENSAVE"..0xF140,
        "SC_HOTKEY"..0xF150,
        "SC_DEFAULT"..0xF160,
        "SC_MONITORPOWER"..0xF170,
        "SC_CONTEXTHELP"..0xF180,
        "SC_SEPARATOR"..0xF00F
    )

    IntConstant(
        "Key state masks for mouse messages.",

        "MK_LBUTTON"..0x0001,
        "MK_RBUTTON"..0x0002,
        "MK_SHIFT"..0x0004,
        "MK_CONTROL"..0x0008,
        "MK_MBUTTON"..0x0010,
        "MK_XBUTTON1"..0x0020,
        "MK_XBUTTON2"..0x0040
    )

    IntConstant(
        "Mouse position codes.",

        "HTERROR".."-2",
        "HTTRANSPARENT".."-1",
        "HTNOWHERE".."0",
        "HTCLIENT".."1",
        "HTCAPTION".."2",
        "HTSYSMENU".."3",
        "HTGROWBOX".."4",
        "HTSIZE".."HTGROWBOX",
        "HTMENU".."5",
        "HTHSCROLL".."6",
        "HTVSCROLL".."7",
        "HTMINBUTTON".."8",
        "HTMAXBUTTON".."9",
        "HTLEFT".."10",
        "HTRIGHT".."11",
        "HTTOP".."12",
        "HTTOPLEFT".."13",
        "HTTOPRIGHT".."14",
        "HTBOTTOM".."15",
        "HTBOTTOMLEFT".."16",
        "HTBOTTOMRIGHT".."17",
        "HTBORDER".."18",
        "HTREDUCE".."HTMINBUTTON",
        "HTZOOM".."HTMAXBUTTON",
        "HTSIZEFIRST".."HTLEFT",
        "HTSIZELAST".."HTBOTTOMRIGHT",
        "HTOBJECT".."19",
        "HTCLOSE".."20",
        "HTHELP".."21"
    )

    val WindowLongOffsets = IntConstant(
        "Window field offsets for #GetWindowLongPtr().",

        "GWL_WNDPROC".."-4",
        "GWL_HINSTANCE".."-6",
        "GWL_HWNDPARENT".."-8",
        "GWL_STYLE".."-16",
        "GWL_EXSTYLE".."-20",
        "GWL_USERDATA".."-21",
        "GWL_ID".."-12"
    ).javaDocLinks

    val ShowWindowCommands = IntConstant(
        "#ShowWindow() commands.",

        "SW_HIDE".."0",
        "SW_SHOWNORMAL".."1",
        "SW_NORMAL".."1",
        "SW_SHOWMINIMIZED".."2",
        "SW_SHOWMAXIMIZED".."3",
        "SW_MAXIMIZE".."3",
        "SW_SHOWNOACTIVATE".."4",
        "SW_SHOW".."5",
        "SW_MINIMIZE".."6",
        "SW_SHOWMINNOACTIVE".."7",
        "SW_SHOWNA".."8",
        "SW_RESTORE".."9",
        "SW_SHOWDEFAULT".."10",
        "SW_FORCEMINIMIZE".."11",
        "SW_MAX".."11"
    ).javaDocLinks

    val VirtualWindowHandles = LongConstant(
        "Virtual window handles used by the #SetWindowPos() insertAfter argument.",

        "HWND_TOP"..0L,
        "HWND_BOTTOM"..1L,
        "HWND_TOPMOST"..-1L,
        "HWND_NOTOPMOST"..-2L
    ).javaDocLinks

    LongConstant(
        """
        Virtual window handle used by #PostMessage() that matches all top-level windows in the system, including disabled or invisible unowned windows,
        overlapped windows, and pop-up windows.
        """,

        "HWND_BROADCAST"..0xFFFFL
    )

    val SizePosFlags = IntConstant(
        "Window sizing and positiong flags used by the #SetWindowPos() flags argument.",

        "SWP_NOSIZE"..0x0001,
        "SWP_NOMOVE"..0x0002,
        "SWP_NOZORDER"..0x0004,
        "SWP_NOREDRAW"..0x0008,
        "SWP_NOACTIVATE"..0x0010,
        "SWP_FRAMECHANGED"..0x0020, // The frame changed: send WM_NCCALCSIZE
        "SWP_SHOWWINDOW"..0x0040,
        "SWP_HIDEWINDOW"..0x0080,
        "SWP_NOCOPYBITS"..0x0100,
        "SWP_NOOWNERZORDER"..0x0200, // Don't do owner Z ordering
        "SWP_NOSENDCHANGING"..0x0400, // Don't send WM_WINDOWPOSCHANGING

        "SWP_DRAWFRAME".."SWP_FRAMECHANGED",
        "SWP_NOREPOSITION".."SWP_NOOWNERZORDER",

        "SWP_DEFERERASE"..0x2000,
        "SWP_ASYNCWINDOWPOS"..0x4000
    ).javaDocLinks

    val StandardIcons = IntConstant(
        "Standard Icon IDs. Use with #LoadIcon().",

        "IDI_APPLICATION".."32512",
        "IDI_HAND".."32513",
        "IDI_QUESTION".."32514",
        "IDI_EXCLAMATION".."32515",
        "IDI_ASTERISK".."32516",
        "IDI_WINLOGO".."32517",
        "IDI_SHIELD".."32518", // WINVER >= 0x0600
        "IDI_WARNING".."IDI_EXCLAMATION",
        "IDI_ERROR".."IDI_HAND",
        "IDI_INFORMATION".."IDI_ASTERISK"
    ).javaDocLinks

    val StandardCursors = IntConstant(
        "Standard Cursor IDs. Use with #LoadCursor().",

        "IDC_ARROW".."32512",
        "IDC_IBEAM".."32513",
        "IDC_WAIT".."32514",
        "IDC_CROSS".."32515",
        "IDC_UPARROW".."32516",
        "IDC_SIZE".."32640",
        "IDC_ICON".."32641",
        "IDC_SIZENWSE".."32642",
        "IDC_SIZENESW".."32643",
        "IDC_SIZEWE".."32644",
        "IDC_SIZENS".."32645",
        "IDC_SIZEALL".."32646",
        "IDC_NO".."32648",
        "IDC_HAND".."32649",
        "IDC_APPSTARTING".."32650",
        "IDC_HELP".."32651"
    ).javaDocLinks

    val ClassLongOffsets = IntConstant(
        "Class field offsets for #GetClassLongPtr().",

        "GCL_MENUNAME".."-8",
        "GCL_HBRBACKGROUND".."-10",
        "GCL_HCURSOR".."-12",
        "GCL_HICON".."-14",
        "GCL_HMODULE".."-16",
        "GCL_CBWNDEXTRA".."-18",
        "GCL_CBCLSEXTRA".."-20",
        "GCL_WNDPROC".."-24",
        "GCL_STYLE".."-26",
        "GCW_ATOM".."-32",
        "GCL_HICONSM".."-34"
    ).javaDocLinks

    IntConstant(
        "Queue status flags for {@code GetQueueStatus} and {@code MsgWaitForMultipleObjects}",

        "QS_KEY"..0x0001,
        "QS_MOUSEMOVE"..0x0002,
        "QS_MOUSEBUTTON"..0x0004,
        "QS_POSTMESSAGE"..0x0008,
        "QS_TIMER"..0x0010,
        "QS_PAINT"..0x0020,
        "QS_SENDMESSAGE"..0x0040,
        "QS_HOTKEY"..0x0080,
        "QS_ALLPOSTMESSAGE"..0x0100,
        "QS_RAWINPUT"..0x0400, // _WIN32_WINNT >= 0x0501
        "QS_MOUSE".."QS_MOUSEMOVE | QS_MOUSEBUTTON",
        "QS_INPUT".."QS_MOUSE | QS_KEY", // TODO: Add | QS_RAWINPUT if _WIN32_WINNT >= 0x0501
        "QS_ALLEVENTS".."QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY",
        "QS_ALLINPUT".."QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY | QS_SENDMESSAGE"
    )

    IntConstant(
        "Remove message flags for #PeekMessage().",

        "PM_NOREMOVE"..0x0000,
        "PM_REMOVE"..0x0001,
        "PM_NOYIELD"..0x0002,
        "PM_QS_INPUT".."QS_INPUT << 16",
        "PM_QS_POSTMESSAGE".."(QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16",
        "PM_QS_PAINT".."QS_PAINT << 16",
        "PM_QS_SENDMESSAGE".."QS_SENDMESSAGE << 16"
    )

    IntConstant(
        "Virtual Keys.",

        "VK_LBUTTON"..0x01,
        "VK_RBUTTON"..0x02,
        "VK_CANCEL"..0x03,
        "VK_MBUTTON"..0x04,
        "VK_XBUTTON1"..0x05,
        "VK_XBUTTON2"..0x06,
        "VK_BACK"..0x08,
        "VK_TAB"..0x09,
        "VK_CLEAR"..0x0C,
        "VK_RETURN"..0x0D,
        "VK_SHIFT"..0x10,
        "VK_CONTROL"..0x11,
        "VK_MENU"..0x12,
        "VK_PAUSE"..0x13,
        "VK_CAPITAL"..0x14,
        "VK_KANA"..0x15,
        "VK_HANGEUL"..0x15,
        "VK_HANGUL"..0x15,
        "VK_JUNJA"..0x17,
        "VK_FINAL"..0x18,
        "VK_HANJA"..0x19,
        "VK_KANJI"..0x19,
        "VK_ESCAPE"..0x1B,
        "VK_CONVERT"..0x1C,
        "VK_NONCONVERT"..0x1D,
        "VK_ACCEPT"..0x1E,
        "VK_MODECHANGE"..0x1F,
        "VK_SPACE"..0x20,
        "VK_PRIOR"..0x21,
        "VK_NEXT"..0x22,
        "VK_END"..0x23,
        "VK_HOME"..0x24,
        "VK_LEFT"..0x25,
        "VK_UP"..0x26,
        "VK_RIGHT"..0x27,
        "VK_DOWN"..0x28,
        "VK_SELECT"..0x29,
        "VK_PRINT"..0x2A,
        "VK_EXECUTE"..0x2B,
        "VK_SNAPSHOT"..0x2C,
        "VK_INSERT"..0x2D,
        "VK_DELETE"..0x2E,
        "VK_HELP"..0x2F,
        "VK_LWIN"..0x5B,
        "VK_RWIN"..0x5C,
        "VK_APPS"..0x5D,
        "VK_SLEEP"..0x5F,
        "VK_NUMPAD0"..0x60,
        "VK_NUMPAD1"..0x61,
        "VK_NUMPAD2"..0x62,
        "VK_NUMPAD3"..0x63,
        "VK_NUMPAD4"..0x64,
        "VK_NUMPAD5"..0x65,
        "VK_NUMPAD6"..0x66,
        "VK_NUMPAD7"..0x67,
        "VK_NUMPAD8"..0x68,
        "VK_NUMPAD9"..0x69,
        "VK_MULTIPLY"..0x6A,
        "VK_ADD"..0x6B,
        "VK_SEPARATOR"..0x6C,
        "VK_SUBTRACT"..0x6D,
        "VK_DECIMAL"..0x6E,
        "VK_DIVIDE"..0x6F,
        "VK_F1"..0x70,
        "VK_F2"..0x71,
        "VK_F3"..0x72,
        "VK_F4"..0x73,
        "VK_F5"..0x74,
        "VK_F6"..0x75,
        "VK_F7"..0x76,
        "VK_F8"..0x77,
        "VK_F9"..0x78,
        "VK_F10"..0x79,
        "VK_F11"..0x7A,
        "VK_F12"..0x7B,
        "VK_F13"..0x7C,
        "VK_F14"..0x7D,
        "VK_F15"..0x7E,
        "VK_F16"..0x7F,
        "VK_F17"..0x80,
        "VK_F18"..0x81,
        "VK_F19"..0x82,
        "VK_F20"..0x83,
        "VK_F21"..0x84,
        "VK_F22"..0x85,
        "VK_F23"..0x86,
        "VK_F24"..0x87,
        "VK_NUMLOCK"..0x90,
        "VK_SCROLL"..0x91,
        "VK_OEM_NEC_EQUAL"..0x92,
        "VK_OEM_FJ_JISHO"..0x92,
        "VK_OEM_FJ_MASSHOU"..0x93,
        "VK_OEM_FJ_TOUROKU"..0x94,
        "VK_OEM_FJ_LOYA"..0x95,
        "VK_OEM_FJ_ROYA"..0x96,
        "VK_LSHIFT"..0xA0,
        "VK_RSHIFT"..0xA1,
        "VK_LCONTROL"..0xA2,
        "VK_RCONTROL"..0xA3,
        "VK_LMENU"..0xA4,
        "VK_RMENU"..0xA5,
        "VK_BROWSER_BACK"..0xA6,
        "VK_BROWSER_FORWARD"..0xA7,
        "VK_BROWSER_REFRESH"..0xA8,
        "VK_BROWSER_STOP"..0xA9,
        "VK_BROWSER_SEARCH"..0xAA,
        "VK_BROWSER_FAVORITES"..0xAB,
        "VK_BROWSER_HOME"..0xAC,
        "VK_VOLUME_MUTE"..0xAD,
        "VK_VOLUME_DOWN"..0xAE,
        "VK_VOLUME_UP"..0xAF,
        "VK_MEDIA_NEXT_TRACK"..0xB0,
        "VK_MEDIA_PREV_TRACK"..0xB1,
        "VK_MEDIA_STOP"..0xB2,
        "VK_MEDIA_PLAY_PAUSE"..0xB3,
        "VK_LAUNCH_MAIL"..0xB4,
        "VK_LAUNCH_MEDIA_SELECT"..0xB5,
        "VK_LAUNCH_APP1"..0xB6,
        "VK_LAUNCH_APP2"..0xB7,
        "VK_OEM_1"..0xBA,
        "VK_OEM_PLUS"..0xBB,
        "VK_OEM_COMMA"..0xBC,
        "VK_OEM_MINUS"..0xBD,
        "VK_OEM_PERIOD"..0xBE,
        "VK_OEM_2"..0xBF,
        "VK_OEM_3"..0xC0,
        "VK_OEM_4"..0xDB,
        "VK_OEM_5"..0xDC,
        "VK_OEM_6"..0xDD,
        "VK_OEM_7"..0xDE,
        "VK_OEM_8"..0xDF,
        "VK_OEM_AX"..0xE1,
        "VK_OEM_102"..0xE2,
        "VK_ICO_HELP"..0xE3,
        "VK_ICO_00"..0xE4,
        "VK_PROCESSKEY"..0xE5,
        "VK_ICO_CLEAR"..0xE6,
        "VK_PACKET"..0xE7,
        "VK_OEM_RESET"..0xE9,
        "VK_OEM_JUMP"..0xEA,
        "VK_OEM_PA1"..0xEB,
        "VK_OEM_PA2"..0xEC,
        "VK_OEM_PA3"..0xED,
        "VK_OEM_WSCTRL"..0xEE,
        "VK_OEM_CUSEL"..0xEF,
        "VK_OEM_ATTN"..0xF0,
        "VK_OEM_FINISH"..0xF1,
        "VK_OEM_COPY"..0xF2,
        "VK_OEM_AUTO"..0xF3,
        "VK_OEM_ENLW"..0xF4,
        "VK_OEM_BACKTAB"..0xF5,
        "VK_ATTN"..0xF6,
        "VK_CRSEL"..0xF7,
        "VK_EXSEL"..0xF8,
        "VK_EREOF"..0xF9,
        "VK_PLAY"..0xFA,
        "VK_ZOOM"..0xFB,
        "VK_NONAME"..0xFC,
        "VK_PA1"..0xFD,
        "VK_OEM_CLEAR"..0xFE
    )

    IntConstant(
        "XButton values.",

        "XBUTTON1"..0x0001,
        "XBUTTON2"..0x0002
    )

    IntConstant(
        "Value for rolling one detent.",

        "WHEEL_DELTA".."120"
    )

    EnumConstant(
        "Identifies the dots per inch (dpi) setting for a thread, process, or window. ({@code DPI_AWARENESS})",

        "DPI_AWARENESS_INVALID".enum(
            """
            Invalid DPI awareness.

            This is an invalid DPI awareness value.
            """,
            "-1"
        ),
        "DPI_AWARENESS_UNAWARE".enum(
            """
            DPI unaware.

            This process does not scale for DPI changes and is always assumed to have a scale factor of 100% (96 DPI). It will be automatically scaled by the
            system on any other DPI setting.
            """,
            "0"
        ),
        "DPI_AWARENESS_SYSTEM_AWARE".enum(
            """
            System DPI aware.

            This process does not scale for DPI changes. It will query for the DPI once and use that value for the lifetime of the process. If the DPI changes,
            the process will not adjust to the new DPI value. It will be automatically scaled up or down by the system when the DPI changes from the system
            value.
            """,
            "1"
        ),
        "DPI_AWARENESS_PER_MONITOR_AWARE".enum(
            """
            Per monitor DPI aware.

            This process checks for the DPI when it is created and adjusts the scale factor whenever the DPI changes. These processes are not automatically
            scaled by the system.
            """,
            "2"
        )
    )

    LongConstant(
        """
        DPI unaware.

        This window does not scale for DPI changes and is always assumed to have a scale factor of 100% (96 DPI). It will be automatically scaled by the system
        on any other DPI setting.
        """,

        "DPI_AWARENESS_CONTEXT_UNAWARE".."-1L"
    )

    LongConstant(
        """
        System DPI aware.

        This window does not scale for DPI changes. It will query for the DPI once and use that value for the lifetime of the process. If the DPI changes, the
        process will not adjust to the new DPI value. It will be automatically scaled up or down by the system when the DPI changes from the system value.
        """,

        "DPI_AWARENESS_CONTEXT_SYSTEM_AWARE".."-2L"
    )

    LongConstant(
        """
        Per monitor DPI aware.

        This window checks for the DPI when it is created and adjusts the scale factor whenever the DPI changes. These processes are not automatically scaled
        by the system.
        """,

        "DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE".."-3L"
    )

    LongConstant(
        """
        Also known as Per Monitor v2.

        An advancement over the original per-monitor DPI awareness mode, which enables applications to access new DPI-related scaling behaviors on a per
        top-level window basis.

        Per Monitor v2 was made available in the Creators Update of Windows 10, and is not available on earlier versions of the operating system.

        The additional behaviors introduced are as follows:
        ${ul(
            "Child window DPI change notifications - In Per Monitor v2 contexts, the entire window tree is notified of any DPI changes that occur.",
            """
            Scaling of non-client area - All windows will automatically have their non-client area drawn in a DPI sensitive fashion. Calls to
            {@code EnableNonClientDpiScaling} are unnecessary.
            """,
            "Scaling of Win32 menus - All {@code NTUSER} menus created in Per Monitor v2 contexts will be scaling in a per-monitor fashion.",
            "Dialog Scaling - Win32 dialogs created in Per Monitor v2 contexts will automatically respond to DPI changes.",
            "Improved scaling of {@code comctl32} controls - Various {@code comctl32} controls have improved DPI scaling behavior in Per Monitor v2 contexts.",
            """
            Improved theming behavior - {@code UxTheme} handles opened in the context of a Per Monitor v2 window will operate in terms of the DPI associated
            with that window.
            """
        )}
        """,

        "DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2".."-4L"
    )

    NativeName("RegisterClassExW")..SaveLastError..ATOM(
        "RegisterClassEx",
        "Registers a window class for subsequent use in calls to the #CreateWindowEx() function.",

        WNDCLASSEX.const.p(
            "lpwcx",
            "a ##WNDCLASSEX structure. You must fill the structure with the appropriate class attributes before passing it to the function."
        )
    )

    NativeName("UnregisterClassW")..SaveLastError..BOOL(
        "UnregisterClass",
        "Unregisters a window class, freeing the memory required for the class.",

        LPCTSTR(
            "lpClassName",
            """
            a null-terminated string or a class atom. If {@code lpClassName} is a string, it specifies the window class name. This class name must have been
            registered by a previous call to the #RegisterClassEx() function. System classes, such as dialog box controls, cannot be unregistered. If this
            parameter is an atom, it must be a class atom created by a previous call to the #RegisterClassEx() function. The atom must be in the low-order
            word of {@code lpClassName}; the high-order word must be zero.
            """
        ),
        nullable..HINSTANCE("hInstance", "a handle to the instance of the module that created the class")
    )

    NativeName("CreateWindowExW")..SaveLastError..HWND(
        "CreateWindowEx",
        "Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.",

        DWORD("dwExStyle", "the extended window style of the window being created"),
        nullable..LPCTSTR(
            "lpClassName",
            "a null-terminated string or a class atom created by a previous call to the #RegisterClassEx(WNDCLASSEX) function."
        ),
        nullable..LPCTSTR(
            "lpWindowName",
            "the window name. If the window style specifies a title bar, the window title pointed to by {@code lpWindowName} is displayed in the title bar."
        ),
        DWORD("dwStyle", "the style of the window being created"),
        int("x", "the initial horizontal position of the window"),
        int("y", "the initial vertical position of the window"),
        int("nWidth", "the width, in device units, of the window"),
        int("nHeight", "the height, in device units, of the window"),
        nullable..HWND(
            "hWndParent",
            "a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle."
        ),
        nullable..HMENU("hMenu", "a handle to a menu, or specifies a child-window identifier, depending on the window style"),
        nullable..HINSTANCE("hInstance", "a handle to the instance of the module to be associated with the window"),
        nullable..LPVOID(
            "lpParam",
            """
            a value to be passed to the window through the {@code CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param
            of the #WM_CREATE message.
            """
        )
    )

    SaveLastError..BOOL(
        "DestroyWindow",
        """
        Destroys the specified window. The function sends #WM_DESTROY and #WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus
        from it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
        clipboard viewer chain (if the window is at the top of the viewer chain).

        If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
        parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.
        """,

        HWND("hWnd", "a handle to the window to be destroyed")
    )

    NativeName("DefWindowProcW")..LRESULT(
        "DefWindowProc",
        """
        Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
        that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
        """,

        HWND("hWnd", "a handle to the window that received the message"),
        UINT("Msg", "the message"),
        WPARAM("wParam", "additional message information. The content of this parameter depends on the value of the {@code Msg} parameter."),
        LPARAM("lParam", "additional message information. The content of this parameter depends on the value of the {@code Msg} parameter.")
    )

    NativeName("CallWindowProcW")..LRESULT(
        "CallWindowProc",
        "Passes message information to the specified window procedure.",

        WNDPROC(
            "lpPrevWndFunc",
            """
            the previous window procedure.

            If this value is obtained by calling the #GetWindowLongPtr() function with the {@code nIndex} parameter set to #GWL_WNDPROC or {@code DWL_DLGPROC},
            it is actually either the address of a window or dialog box procedure, or a special internal value meaningful only to {@code CallWindowProc}.
            """
        ),
        HWND("hWnd", "a handle to the window procedure to receive the message"),
        UINT("Msg", "the message"),
        WPARAM("wParam", "additional message information. The content of this parameter depends on the value of the {@code Msg} parameter."),
        LPARAM("lParam", "additional message information. The content of this parameter depends on the value of the {@code Msg} parameter.")
    )

    BOOL(
        "ShowWindow",
        "Sets the specified window's show state.",

        HWND("hWnd", "a handle to the window"),
        int(
            "nCmdShow",
            """
            controls how the window is to be shown. This parameter is ignored the first time an application calls {@code ShowWindow}, if the program that
            launched the application provides a {@code STARTUPINFO} structure. Otherwise, the first time {@code ShowWindow} is called, the value should be the
            value obtained by the {@code WinMain} function in its {@code nCmdShow} parameter. In subsequent calls, this parameter can be
            """,
            ShowWindowCommands, LinkMode.SINGLE_CNT
        )
    )

    BOOL(
        "UpdateWindow",
        """
        Updates the client area of the specified window by sending a #WM_PAINT message to the window if the window's update region is not empty. The function
        sends a #WM_PAINT message directly to the window procedure of the specified window, bypassing the application queue. If the update region is empty, no
        message is sent.
        """,

        HWND("hWnd", "handle to the window to be updated")
    )

    SaveLastError..BOOL(
        "SetWindowPos",
        """
        Changes the size, position, and Z order of a child, pop-up, or top-level window. These windows are ordered according to their appearance on the screen.
        The topmost window receives the highest rank and is the first window in the Z order.
        """,

        HWND("hWnd", "a handle to the window"),
        nullable..HWND(
            "hWndInsertAfter",
            "a handle to the window to precede the positioned window in the Z order. This parameter must be a window handle or",
            VirtualWindowHandles, LinkMode.SINGLE_CNT
        ),
        int("X", "the new position of the left side of the window, in client coordinates"),
        int("Y", "the new position of the top of the window, in client coordinates"),
        int("cx", "the new width of the window, in pixels"),
        int("cy", "the new height of the window, in pixels"),
        UINT("uFlags", "the window sizing and positioning flags", SizePosFlags, LinkMode.BITFIELD)
    )

    NativeName("SetWindowTextW")..SaveLastError..BOOL(
        "SetWindowText",
        """
        Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed.
        However, {@code SetWindowText} cannot change the text of a control in another application.
        """,

        HWND("hWnd", "a handle to the window or control whose text is to be changed"),
        LPCTSTR("lpString", "the new title or control text")
    )

    val GetMessage = NativeName("GetMessageW")..SaveLastError..BOOL(
        "GetMessage",
        """
        Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
        retrieval. Unlike GetMessage, the #PeekMessage() function does not wait for a message to be posted before returning.
        """,

        LPMSG("lpMsg", "a pointer to an ##MSG structure that receives message information from the thread's message queue"),
        nullable..HWND(
            "hWnd",
            """
            a handle to the window whose messages are to be retrieved. The window must belong to the current thread.

            If {@code hWnd} is #NULL, {@code GetMessage} retrieves messages for any window that belongs to the current thread, and any messages on the current
            thread's message queue whose {@code hwnd} value is #NULL (see the ##MSG structure). Therefore if {@code hWnd} is #NULL, both window messages and
            thread messages are processed.

            If {@code hWnd} is -1, {@code GetMessage} retrieves only messages on the current thread's message queue whose {@code hwnd} value is #NULL, that is,
            thread messages as posted by #PostMessage() (when the {@code hWnd} parameter is #NULL) or {@code PostThreadMessage}.
            """
        ),
        UINT("wMsgFilterMin", "the integer value of the lowest message value to be retrieved"),
        UINT("wMsgFilterMax", "the integer value of the highest message value to be retrieved")
    )

    NativeName("PeekMessageW")..BOOL(
        "PeekMessage",
        "Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).",

        LPMSG("lpMsg", "a pointer to an ##MSG structure that receives message information"),
        GetMessage["hWnd"],
        GetMessage["wMsgFilterMin"],
        GetMessage["wMsgFilterMax"],
        UINT("wRemoveMsg", "specifies how messages are to be handled.", "#PM_NOREMOVE #PM_REMOVE #PM_NOYIELD")
    )

    BOOL(
        "TranslateMessage",
        """
        Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
        time the thread calls the #GetMessage() or #PeekMessage() function.
        """,

        MSG.const.p(
            "lpMsg",
            """
            an ##MSG structure that contains message information retrieved from the calling thread's message queue by using the #GetMessage() or #PeekMessage()
            function.
            """
        )
    )

    SaveLastError..BOOL(
        "WaitMessage",
        """
        Yields control to other threads when a thread has no other messages in its message queue. The WaitMessage function suspends the thread and does not
        return until a new message is placed in the thread's message queue.
        """,
        void()
    )

    NativeName("DispatchMessageW")..LRESULT(
        "DispatchMessage",
        "Dispatches a message to a window procedure. It is typically used to dispatch a message retrieved by the #GetMessage() function.",

        MSG.const.p("lpmsg", "a pointer to a structure that contains the message.")
    )

    NativeName("PostMessageW")..SaveLastError..BOOL(
        "PostMessage",
        """
        Places (posts) a message in the message queue associated with the thread that created the specified window and returns without waiting for the thread
        to process the message.
        """,

        nullable..HWND(
            "hWnd",
            """
            a handle to the window whose window procedure is to receive the message. The following values have special meanings:
            ${ul(
                """
                #HWND_BROADCAST - The message is posted to all top-level windows in the system, including disabled or invisible unowned windows, overlapped
                windows, and pop-up windows. The message is not posted to child windows.
                """,
                "#NULL - The function behaves like a call to PostThreadMessage with the dwThreadId parameter set to the identifier of the current thread."
            )}
            """
        ),
        UINT("Msg", "the message to be posted"),
        WPARAM("wParam", "additional message-specific information"),
        LPARAM("lParam", "additional message-specific information")
    )

    NativeName("SendMessageW")..SaveLastError..BOOL(
        "SendMessage",
        """
        Sends the specified message to a window or windows. The {@code SendMessage} function calls the window procedure for the specified window and does not
        return until the window procedure has processed the message.
        """,

        HWND(
            "hWnd",
            """
            a handle to the window whose window procedure will receive the message. If this parameter is #HWND_BROADCAST, the message is sent to all top-level
            windows in the system, including disabled or invisible unowned windows, overlapped windows, and pop-up windows; but the message is not sent to
            child windows.

            Message sending is subject to UIPI. The thread of a process can send messages only to message queues of threads in processes of lesser or equal
            integrity level.
            """
        ),
        UINT("Msg", "the message to be sent"),
        WPARAM("wParam", "additional message-specific information"),
        LPARAM("lParam", "additional message-specific information")
    )

    SaveLastError..BOOL(
        "AdjustWindowRectEx",
        """
        Calculates the required size of the window rectangle, based on the desired size of the client rectangle. The window rectangle can then be passed to the
        #CreateWindowEx() function to create a window whose client area is the desired size.
        """,

        LPRECT(
            "lpRect",
            """
            a pointer to a ##RECT structure that contains the coordinates of the top-left and bottom-right corners of the desired client area. When the
            function returns, the structure contains the coordinates of the top-left and bottom-right corners of the window to accommodate the desired client
            area.
            """
        ),
        DWORD("dwStyle", "the window style of the window whose required size is to be calculated. Note that you cannot specify the #WS_OVERLAPPED style."),
        BOOL("bMenu", "indicates whether the window has a menu"),
        DWORD("dwExStyle", "the extended window style of the window whose required size is to be calculated")
    )

    SaveLastError..BOOL(
        "GetWindowRect",
        """
        Retrieves the dimensions of the bounding rectangle of the specified window. The dimensions are given in screen coordinates that are relative to the
        upper-left corner of the screen.
        """,

        HWND("hWnd", "a handle to the window"),
        LPRECT("lpRect", "a pointer to a ##RECT structure that receives the screen coordinates of the upper-left and lower-right corners of the window")
    )

    SaveLastError..BOOL(
        "MoveWindow",
        """
        Changes the position and dimensions of the specified window. For a top-level window, the position and dimensions are relative to the upper-left corner
        of the screen. For a child window, they are relative to the upper-left corner of the parent window's client area.
        """,

        HWND("hWnd", "a handle to the window"),
        int("X", "the new position of the left side of the window"),
        int("Y", "the new position of the top of the window"),
        int("nWidth", "the new width of the window"),
        int("nHeight", "the new height of the window"),
        BOOL(
            "bRepaint",
            """
            indicates whether the window is to be repainted. If this parameter is TRUE, the window receives a message. If the parameter is FALSE, no repainting
            of any kind occurs. This applies to the client area, the nonclient area (including the title bar and scroll bars), and any part of the parent
            window uncovered as a result of moving a child window.
            """
        )
    )

    IntConstant(
        "##WINDOWPLACEMENT flags.",

        "WPF_SETMINPOSITION"..0x0001,
        "WPF_RESTORETOMAXIMIZED"..0x0002,
        "WPF_ASYNCWINDOWPLACEMENT"..0x0004
    )

    SaveLastError..BOOL(
        "GetWindowPlacement",
        "Retrieves the show state and the restored, minimized, and maximized positions of the specified window.",

        HWND("hWnd", "a handle to the window"),
        Input..WINDOWPLACEMENT.p(
            "lpwndpl",
            """
            a pointer to the ##WINDOWPLACEMENT structure that receives the show state and position information.

            Before calling {@code GetWindowPlacement}, set the length member to WINDOWPLACEMENT#SIZEOF. {@code GetWindowPlacement} fails if
            {@code lpwndpl->length} is not set correctly.
            """
        )
    )

    SaveLastError..BOOL(
        "SetWindowPlacement",
        "Sets the show state and the restored, minimized, and maximized positions of the specified window.",

        HWND("hWnd", "a handle to the window"),
        WINDOWPLACEMENT.const.p(
            "lpwndpl",
            """
            a pointer to the ##WINDOWPLACEMENT structure that specifies the new show state and window positions.

            Before calling {@code SetWindowPlacement}, set the {@code length} member of the {@code WINDOWPLACEMENT} structure to WINDOWPLACEMENT#SIZEOF.
            {@code SetWindowPlacement} fails if the length member is not set correctly.
            """
        )
    )

    BOOL(
        "IsWindowVisible",
        "Determines the visibility state of the specified window.",

        HWND("hWnd", "a handle to the window to be tested")
    )

    BOOL(
        "IsIconic",
        "Determines whether the specified window is minimized (iconic).",

        HWND("hWnd", "a handle to the window to be tested")
    )

    BOOL(
        "IsZoomed",
        "Determines whether a window is maximized.",

        HWND("hWnd", "a handle to the window to be tested")
    )

    BOOL(
        "BringWindowToTop",
        """
        Brings the specified window to the top of the Z order. If the window is a top-level window, it is activated. If the window is a child window, the
        top-level parent window associated with the child window is activated.
        """,

        HWND("hWnd", "a handle to the window to bring to the top of the Z order")
    )

    NativeName("Pointer.BITS64 ? \"SetWindowLongPtrW\" : \"SetWindowLongW\"")..SaveLastError..LONG_PTR(
        "SetWindowLongPtr",
        "Changes an attribute of the specified window. The function also sets a value at the specified offset in the extra window memory.",

        HWND("hWnd", "a handle to the window and, indirectly, the class to which the window belongs"),
        int(
            "nIndex",
            """
            the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
            of an integer. To set any other value, specify
            """,
            WindowLongOffsets, LinkMode.SINGLE_CNT
        ),
        LONG_PTR("dwNewLong", "the replacement value"),

        returnDoc = "the previous value at the given {@code index}"
    )

    NativeName("Pointer.BITS64 ? \"GetWindowLongPtrW\" : \"GetWindowLongW\"")..SaveLastError..LONG_PTR(
        "GetWindowLongPtr",
        "Retrieves information about the specified window. The function also retrieves the value at a specified offset into the extra window memory.",

        HWND("hWnd", "a handle to the window and, indirectly, the class to which the window belongs"),
        int(
            "nIndex",
            """
            the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
            of an integer. To set any other value, specify
            """,
            WindowLongOffsets, LinkMode.SINGLE_CNT
        )
    )

    NativeName("Pointer.BITS64 ? \"SetClassLongPtrW\" : \"SetClassLongW\"")..SaveLastError..LONG_PTR(
        "SetClassLongPtr",
        """
        Replaces the specified value at the specified offset in the extra class memory or the ##WNDCLASSEX structure for the class to which the specified
        window belongs.
        """,

        HWND("hWnd", "a handle to the window and, indirectly, the class to which the window belongs"),
        int(
            "nIndex",
            """
            the value to be replaced. To set a value in the extra class memory, specify the positive, zero-based byte offset of the value to be set. Valid
            values are in the range zero through the number of bytes of extra class memory, minus eight; for example, if you specified 24 or more bytes of
            extra class memory, a value of 16 would be an index to the third integer. To set a value other than the ##WNDCLASSEX structure, specify
            """,
            ClassLongOffsets, LinkMode.SINGLE_CNT
        ),
        LONG_PTR("dwNewLong", "the replacement value"),

        returnDoc =
        """
        if the function succeeds, the return value is the previous value of the specified offset. If this was not previously set, the return value is zero.

        If the function fails, the return value is zero. To get extended error information, call #getLastError().
        """
    )

    NativeName("Pointer.BITS64 ? \"GetClassLongPtrW\" : \"GetClassLongW\"")..SaveLastError..LONG_PTR(
        "GetClassLongPtr",
        "Retrieves the specified value from the ##WNDCLASSEX structure associated with the specified window.",

        HWND("hWnd", "a handle to the window and, indirectly, the class to which the window belongs"),
        int(
            "nIndex",
            """
            the value to be retrieved. To retrieve a value from the extra class memory, specify the positive, zero-based byte offset of the value to be
            retrieved. Valid values are in the range zero through the number of bytes of extra class memory, minus eight; for example, if you specified 24 or
            more bytes of extra class memory, a value of 16 would be an index to the third integer. To retrieve any other value from the ##WNDCLASSEX
            structure, specify
            """,
            ClassLongOffsets, LinkMode.SINGLE_CNT
        )
    )

    IntConstant(
        "Actions for #SetLayeredWindowAttributes().",

        "LWA_COLORKEY"..0x00000001,
        "LWA_ALPHA"..0x00000002
    )

    SaveLastError..BOOL(
        "SetLayeredWindowAttributes",
        "",

        HWND(
            "hwnd",
            """
            a handle to the layered window. A layered window is created by specifying #WS_EX_LAYERED when creating the window with the #CreateWindowEx()
            function or by setting #WS_EX_LAYERED via #SetWindowLongPtr() after the window has been created.
            """
        ),
        COLORREF(
            "crKey",
            """
            the transparency color key (0x00bbggrr) to be used when composing the layered window. All pixels painted by the window in this color will be
            transparent.
            """
        ),
        BYTE(
            "bAlpha",
            """
            the alpha value used to describe the opacity of the layered window. When {@code bAlpha} is 0, the window is completely transparent. When
            {@code bAlpha} is 255, the window is opaque.
            """
        ),
        DWORD("dwFlags", "an action to be taken", "#LWA_COLORKEY #LWA_ALPHA", LinkMode.BITFIELD)
    )

    NativeName("LoadIconW")..SaveLastError..HICON(
        "LoadIcon",
        "Loads the specified icon resource from the executable (.exe) file associated with an application instance.",

        nullable..HINSTANCE(
            "instance",
            """
            a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be #NULL when a standard icon is
            being loaded.
            """
        ),
        LPCTSTR("iconName", "the name of the icon resource to be loaded or", StandardIcons, LinkMode.SINGLE_CNT)
    )

    NativeName("LoadCursorW")..SaveLastError..HCURSOR(
        "LoadCursor",
        "Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.",

        nullable..HINSTANCE("instance", "a handle to an instance of the module whose executable file contains the cursor to be loaded."),
        LPCTSTR("cursorName", "the name of the cursor resource to be loaded or", StandardCursors, LinkMode.SINGLE_CNT)
    )

    HDC(
        "GetDC",
        """
        Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
        subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
        """,

        nullable..HWND("hWnd", "a handle to the window whose DC is to be retrieved. If this value is #NULL, GetDC retrieves the DC for the entire screen.")
    )

    BOOL(
        "ReleaseDC",
        """
        Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
        common and window DCs. It has no effect on class or private DCs.
        """,

        HWND("hWnd", "a handle to the window whose DC is to be released"),
        HDC("hDC", "a handle to the DC to be released")
    )

    val SystemMetrics = IntConstant(
        "#GetSystemMetrics() codes.",

        "SM_CXSCREEN".."0",
        "SM_CYSCREEN".."1",
        "SM_CXVSCROLL".."2",
        "SM_CYHSCROLL".."3",
        "SM_CYCAPTION".."4",
        "SM_CXBORDER".."5",
        "SM_CYBORDER".."6",
        "SM_CXDLGFRAME".."7",
        "SM_CYDLGFRAME".."8",
        "SM_CYVTHUMB".."9",
        "SM_CXHTHUMB".."10",
        "SM_CXICON".."11",
        "SM_CYICON".."12",
        "SM_CXCURSOR".."13",
        "SM_CYCURSOR".."14",
        "SM_CYMENU".."15",
        "SM_CXFULLSCREEN".."16",
        "SM_CYFULLSCREEN".."17",
        "SM_CYKANJIWINDOW".."18",
        "SM_MOUSEPRESENT".."19",
        "SM_CYVSCROLL".."20",
        "SM_CXHSCROLL".."21",
        "SM_DEBUG".."22",
        "SM_SWAPBUTTON".."23",
        "SM_RESERVED1".."24",
        "SM_RESERVED2".."25",
        "SM_RESERVED3".."26",
        "SM_RESERVED4".."27",
        "SM_CXMIN".."28",
        "SM_CYMIN".."29",
        "SM_CXSIZE".."30",
        "SM_CYSIZE".."31",
        "SM_CXFRAME".."32",
        "SM_CYFRAME".."33",
        "SM_CXMINTRACK".."34",
        "SM_CYMINTRACK".."35",
        "SM_CXDOUBLECLK".."36",
        "SM_CYDOUBLECLK".."37",
        "SM_CXICONSPACING".."38",
        "SM_CYICONSPACING".."39",
        "SM_MENUDROPALIGNMENT".."40",
        "SM_PENWINDOWS".."41",
        "SM_DBCSENABLED".."42",
        "SM_CMOUSEBUTTONS".."43",

        "SM_CXFIXEDFRAME".."SM_CXDLGFRAME",
        "SM_CYFIXEDFRAME".."SM_CYDLGFRAME",
        "SM_CXSIZEFRAME".."SM_CXFRAME",
        "SM_CYSIZEFRAME".."SM_CYFRAME",

        "SM_SECURE".."44",
        "SM_CXEDGE".."45",
        "SM_CYEDGE".."46",
        "SM_CXMINSPACING".."47",
        "SM_CYMINSPACING".."48",
        "SM_CXSMICON".."49",
        "SM_CYSMICON".."50",
        "SM_CYSMCAPTION".."51",
        "SM_CXSMSIZE".."52",
        "SM_CYSMSIZE".."53",
        "SM_CXMENUSIZE".."54",
        "SM_CYMENUSIZE".."55",
        "SM_ARRANGE".."56",
        "SM_CXMINIMIZED".."57",
        "SM_CYMINIMIZED".."58",
        "SM_CXMAXTRACK".."59",
        "SM_CYMAXTRACK".."60",
        "SM_CXMAXIMIZED".."61",
        "SM_CYMAXIMIZED".."62",
        "SM_NETWORK".."63",
        "SM_CLEANBOOT".."67",
        "SM_CXDRAG".."68",
        "SM_CYDRAG".."69",
        "SM_SHOWSOUNDS".."70",
        "SM_CXMENUCHECK".."71",
        "SM_CYMENUCHECK".."72",
        "SM_SLOWMACHINE".."73",
        "SM_MIDEASTENABLED".."74",

        "SM_MOUSEWHEELPRESENT".."75",
        "SM_XVIRTUALSCREEN".."76",
        "SM_YVIRTUALSCREEN".."77",
        "SM_CXVIRTUALSCREEN".."78",
        "SM_CYVIRTUALSCREEN".."79",
        "SM_CMONITORS".."80",
        "SM_SAMEDISPLAYFORMAT".."81",
        "SM_IMMENABLED".."82",

        "SM_REMOTESESSION"..0x1000,

        // _WIN32_WINNT >= 0x0501

        "SM_SHUTTINGDOWN"..0x2000,
        "SM_REMOTECONTROL"..0x2001,
        "SM_CARETBLINKINGENABLED"..0x2002,

        "SM_CXFOCUSBORDER".."83",
        "SM_CYFOCUSBORDER".."84",

        "SM_TABLETPC".."86",
        "SM_MEDIACENTER".."87",
        "SM_STARTER".."88",
        "SM_SERVERR2".."89",

        // _WIN32_WINNT >= 0x0600

        "SM_MOUSEHORIZONTALWHEELPRESENT".."91",
        "SM_CXPADDEDBORDER".."92",

        // WINVER >= 0x0601

        "SM_DIGITIZER".."94",
        "SM_MAXIMUMTOUCHES".."95"
    ).javaDocLinks

    int(
        "GetSystemMetrics",
        "Retrieves the specified system metric or system configuration setting.",

        int("index", "the system metric or configuration setting to be retrieved", SystemMetrics)
    )

    val TouchFlags = IntConstant(
        "#RegisterTouchWindow() flags.",

        "TWF_FINETOUCH"..0x00000001,
        "TWF_WANTPALM"..0x00000002
    ).javaDocLinks

    IntConstant(
        "Touch input flag values (TOUCHINPUT#dwFlags()).",

        "TOUCHEVENTF_MOVE"..0x0001,
        "TOUCHEVENTF_DOWN"..0x0002,
        "TOUCHEVENTF_UP"..0x0004,
        "TOUCHEVENTF_INRANGE"..0x0008,
        "TOUCHEVENTF_PRIMARY"..0x0010,
        "TOUCHEVENTF_NOCOALESCE"..0x0020,
        "TOUCHEVENTF_PEN"..0x0040,
        "TOUCHEVENTF_PALM"..0x0080
    )

    IntConstant(
        "Touch input mask values (TOUCHINPUT#dwMask()).",

        "TOUCHINPUTMASKF_TIMEFROMSYSTEM"..0x0001,
        "TOUCHINPUTMASKF_EXTRAINFO"..0x0002,
        "TOUCHINPUTMASKF_CONTACTAREA"..0x0004
    )

    IgnoreMissing..SaveLastError..BOOL(
        "RegisterTouchWindow",
        """
        Registers a window as being touch-capable.

        {@code RegisterTouchWindow} must be called on every window that will be used for touch input. This means that if you have an application that has
        multiple windows within it, {@code RegisterTouchWindow} must be called on every window in that application that uses touch features. Also, an
        application can call {@code RegisterTouchWindow} any number of times for the same window if it desires to change the modifier flags. A window can be
        marked as no longer requiring touch input using the #UnregisterTouchWindow() function.
        """,

        HWND(
            "hWnd",
            """
            the handle of the window being registered. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread does not own the specified
            window.
            """
        ),
        ULONG(
            "ulFlags",
            "a set of bit flags that specify optional modifications. This field may contain 0 or",
            TouchFlags, LinkMode.BITFIELD_CNT
        ),

        since = "Windows 7 (desktop apps only)"
    )

    IgnoreMissing..SaveLastError..BOOL(
        "UnregisterTouchWindow",
        "Registers a window as no longer being touch-capable.",

        HWND(
            "hWnd",
            "the handle of the window. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread does not own the specified window."
        ),

        since = "Windows 7 (desktop apps only)"
    )

    IgnoreMissing..BOOL(
        "IsTouchWindow",
        "Checks whether a specified window is touch-capable and, optionally, retrieves the modifier flags set for the window's touch capability.",

        HWND(
            "hWnd",
            """
            the handle of the window. The function fails with {@code ERROR_ACCESS_DENIED} if the calling thread is not on the same desktop as the specified
            window.
            """
        ),
        Check(1)..nullable..PULONG(
            "pulFlags",
            "an optional address of the {@code ULONG} variable to receive the modifier flags for the specified window's touch capability."
        ),

        since = "Windows 7 (desktop apps only)"
    )

    IgnoreMissing..SaveLastError..BOOL(
        "GetTouchInputInfo",
        "Retrieves detailed information about touch inputs associated with a particular touch input handle.",

        HTOUCHINPUT(
            "hTouchInput",
            """
            the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
            not valid. Note that the handle is not valid after it has been used in a successful call to #CloseTouchInputHandle() or after it has been passed to
            #DefWindowProc(), #PostMessage(), #SendMessage() or one of their variants.
            """
        ),
        AutoSize("pInputs")..UINT(
            "cInputs",
            """
            The number of structures in the {@code pInputs} array. This should ideally be at least equal to the number of touch points associated with the
            message as indicated in the message {@code WPARAM}. If {@code cInputs} is less than the number of touch points, the function will still succeed and
            populate the {@code pInputs} buffer with information about {@code cInputs} touch points.
            """
        ),
        PTOUCHINPUT(
            "pInputs",
            "a pointer to an array of ##TOUCHINPUT structures to receive information about the touch points associated with the specified touch input handle"
        ),
        int(
            "cbSize",
            """
            the size, in bytes, of a single ##TOUCHINPUT structure. If {@code cbSize} is not the size of a single {@code TOUCHINPUT} structure, the function
            fails with {@code ERROR_INVALID_PARAMETER}.
            """
        ),

        since = "Windows 7 (desktop apps only)"
    )

    IgnoreMissing..SaveLastError..BOOL(
        "CloseTouchInputHandle",
        "Closes a touch input handle, frees process memory associated with it, and invalidates the handle.",

        HTOUCHINPUT(
            "hTouchInput",
            """
            the touch input handle received in the {@code LPARAM} of a touch message. The function fails with {@code ERROR_INVALID_HANDLE} if this handle is
            not valid. Note that the handle is not valid after it has been used in a successful call to #CloseTouchInputHandle() or after it has been passed to
            #DefWindowProc(), #PostMessage(), #SendMessage() or one of their variants.
            """
        ),

        since = "Windows 7 (desktop apps only)"
    )

    val MonitorFromWindowFlags = IntConstant(
        "#MonitorFromWindow() flags.",

        "MONITOR_DEFAULTTONULL"..0x00000000,
        "MONITOR_DEFAULTTOPRIMARY"..0x00000001,
        "MONITOR_DEFAULTTONEAREST"..0x00000002
    ).javaDocLinks

    HMONITOR(
        "MonitorFromWindow",
        "Retrieves a handle to the display monitor that has the largest area of intersection with the bounding rectangle of a specified window.",

        HWND("hWnd", "a handle to the window of interest"),
        DWORD("dwFlags", "determines the function's return value if the window does not intersect any display monitor", MonitorFromWindowFlags)
    )

    IntConstant(
        "##MONITORINFOEX flags.",

        "MONITORINFOF_PRIMARY"..0x00000001
    )

    NativeName("GetMonitorInfoW")..BOOL(
        "GetMonitorInfo",
        "Retrieves information about a display monitor.",

        HMONITOR("hMonitor", "a handle to the display monitor of interest"),
        LPMONITORINFOEX(
            "lpmi",
            """
            a pointer to a ##MONITORINFOEX structure that receives information about the specified display monitor.

            You must set the {@code cbSize} member of the structure to MONITORINFOEX#SIZEOF before calling the {@code GetMonitorInfo} function. Doing so lets
            the function determine the type of structure you are passing to it.
            """
        )
    )

    IntConstant(
        "Flag for #EnumDisplayDevices().",

        "EDD_GET_DEVICE_INTERFACE_NAME"..0x00000001
    )

    val EnumDisplaySettingsMode = IntConstant(
        "#EnumDisplaySettingsEx() mode.",

        "ENUM_CURRENT_SETTINGS".."-1",
        "ENUM_REGISTRY_SETTINGS".."-2"
    ).javaDocLinks

    val EnumDisplaySettingsFlags = IntConstant(
        "Flags for #EnumDisplaySettingsEx().",

        "EDS_RAWMODE"..0x00000002,
        "EDS_ROTATEDMODE"..0x00000004
    ).javaDocLinks

    val ChangeDisplaySettingsFlags = IntConstant(
        "Flags for #ChangeDisplaySettingsEx().",

        "CDS_UPDATEREGISTRY"..0x00000001,
        "CDS_TEST"..0x00000002,
        "CDS_FULLSCREEN"..0x00000004,
        "CDS_GLOBAL"..0x00000008,
        "CDS_SET_PRIMARY"..0x00000010,
        "CDS_VIDEOPARAMETERS"..0x00000020,

        "CDS_ENABLE_UNSAFE_MODES"..0x00000100, // WINVER >= 0x0600
        "CDS_DISABLE_UNSAFE_MODES"..0x00000200, // WINVER >= 0x0600

        "CDS_RESET"..0x40000000,
        "CDS_RESET_EX"..0x20000000,
        "CDS_NORESET"..0x10000000
    ).javaDocLinks

    val ChangeDisplaySettingsResults = IntConstant(
        "Return values for #ChangeDisplaySettingsEx().",

        "DISP_CHANGE_SUCCESSFUL".."0",
        "DISP_CHANGE_RESTART".."1",
        "DISP_CHANGE_FAILED".."-1",
        "DISP_CHANGE_BADMODE".."-2",
        "DISP_CHANGE_NOTUPDATED".."-3",
        "DISP_CHANGE_BADFLAGS".."-4",
        "DISP_CHANGE_BADPARAM".."-5",

        "DISP_CHANGE_BADDUALVIEW".."-6" // _WIN32_WINNT >= 0x0501
    ).javaDocLinks

    NativeName("EnumDisplayDevicesW")..BOOL(
        "EnumDisplayDevices",
        "Obtains information about the display devices in the current session.",

        nullable..LPCTSTR(
            "lpDevice",
            "the device name. If #NULL, function returns information for the display adapter(s) on the machine, based on {@code devNum}."
        ),
        DWORD(
            "iDevNum",
            """
            an index value that specifies the display device of interest.

            The operating system identifies each display device in the current session with an index value. The index values are consecutive integers, starting
            at 0. If the current session has three display devices, for example, they are specified by the index values 0, 1, and 2.
            """
        ),
        PDISPLAY_DEVICE(
            "lpDisplayDevice",
            """
            a pointer to a ##DISPLAY_DEVICE structure that receives information about the display device specified by {@code iDevNum}.

            Before calling {@code EnumDisplayDevices}, you must initialize the {@code cb} member of {@code DISPLAY_DEVICE} to the size, in bytes, of
            {@code DISPLAY_DEVICE}.
            """
        ),
        DWORD(
            "dwFlags",
            """
            set this flag to #EDD_GET_DEVICE_INTERFACE_NAME to retrieve the device interface name for {@code GUID_DEVINTERFACE_MONITOR}, which is registered by
            the operating system on a per monitor basis. The value is placed in the {@code DeviceID} member of the ##DISPLAY_DEVICE structure returned in
            {@code lpDisplayDevice}. The resulting device interface name can be used with SetupAPI functions and serves as a link between GDI monitor devices
            and SetupAPI monitor devices.
            """
        )
    )

    NativeName("EnumDisplaySettingsExW")..BOOL(
        "EnumDisplaySettingsEx",
        """
        Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
        make a series of calls to this function.
        """,

        nullable..LPCTSTR(
            "lpszDeviceName",
            """
            a pointer to a null-terminated string that specifies the display device about which graphics mode the function will obtain information.

            This parameter is either #NULL or a DISPLAY_DEVICE#DeviceName() returned from #EnumDisplayDevices(). A #NULL value specifies the current display
            device on the computer that the calling thread is running on.
            """
        ),
        DWORD(
            "iModeNum",
            """
            indicates the type of information to be retrieved.

            Graphics mode indexes start at zero. To obtain information for all of a display device's graphics modes, make a series of calls to
            {@code EnumDisplaySettingsEx}, as follows: Set {@code iModeNum} to zero for the first call, and increment {@code iModeNum} by one for each
            subsequent call. Continue calling the function until the return value is zero.

            When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to zero, the operating system initializes and caches information about the
            display device. When you call {@code EnumDisplaySettingsEx} with {@code iModeNum} set to a nonzero value, the function returns the information that
            was cached the last time the function was called with {@code iModeNum} set to zero.

            This value can be a graphics mode index or
            """,
            EnumDisplaySettingsMode,
            LinkMode.SINGLE_CNT
        ),
        DEVMODE.p(
            "lpDevMode",
            """
            a pointer to a ##DEVMODE structure into which the function stores information about the specified graphics mode. Before calling
            {@code EnumDisplaySettingsEx}, set the {@code dmSize} member to DEVMODE#SIZEOF, and set the {@code dmDriverExtra} member to indicate the size, in
            bytes, of the additional space available to receive private driver data.

            The {@code EnumDisplaySettingsEx} function will populate the {@code dmFields} member of the {@code lpDevMode} and one or more other members of the
            {@code DEVMODE} structure. To determine which members were set by the call to {@code EnumDisplaySettingsEx}, inspect the {@code dmFields} bitmask.
            """
        ),
        DWORD("dwFlags", "this parameter can be", EnumDisplaySettingsFlags, LinkMode.SINGLE_CNT)
    )

    NativeName("ChangeDisplaySettingsExW")..LONG(
        "ChangeDisplaySettingsEx",
        "Changes the settings of the specified display device to the specified graphics mode.",

        nullable..LPCTSTR(
            "lpszDeviceName",
            """
            a pointer to a null-terminated string that specifies the display device whose graphics mode will change. Only display device names as returned by
            #EnumDisplayDevices() are valid.

            The {@code lpszDeviceName} parameter can be #NULL. A #NULL value specifies the default display device. The default device can be determined by
            calling {@code EnumDisplayDevices} and checking for the #DISPLAY_DEVICE_PRIMARY_DEVICE flag.
            """
        ),
        nullable..DEVMODE.p(
            "lpDevMode",
            """
            a pointer to a ##DEVMODE structure that describes the new graphics mode. If {@code lpDevMode} is #NULL, all the values currently in the registry
            will be used for the display setting. Passing #NULL for the {@code lpDevMode} parameter and 0 for the {@code dwFlags} parameter is the easiest way
            to return to the default mode after a dynamic mode change.

            The {@code dmSize} member must be initialized to the size, in bytes, of the {@code DEVMODE} structure. The {@code dmDriverExtra} member must be
            initialized to indicate the number of bytes of private driver data following the {@code DEVMODE} structure.
            """
        ),
        nullable..HWND("hwnd", "reserved; must be #NULL"),
        DWORD("dwflags", "indicates how the graphics mode should be changed", ChangeDisplaySettingsFlags),
        nullable..LPVOID(
            "lParam",
            """
            if {@code flags} is #CDS_VIDEOPARAMETERS, {@code lParam} is a pointer to a {@code VIDEOPARAMETERS} structure. Otherwise {@code lParam} must be #NULL.
            """
        ),

        returnDoc = "one of the following values: $ChangeDisplaySettingsResults"
    )

    BOOL(
        "GetCursorPos",
        "Retrieves the position of the mouse cursor, in screen coordinates.",

        LPPOINT("point", "a pointer to a {@link POINT} structure that receives the screen coordinates of the cursor")
    )

    BOOL(
        "SetCursorPos",
        """
        Moves the cursor to the specified screen coordinates. If the new coordinates are not within the screen rectangle set by the most recent #ClipCursor()
        function call, the system automatically adjusts the coordinates so that the cursor stays within the rectangle.
        """,

        int("X", "the new x-coordinate of the cursor, in screen coordinates."),
        int("Y", "the new y-coordinate of the cursor, in screen coordinates.")
    )

    BOOL(
        "ClipCursor",
        """
        Confines the cursor to a rectangular area on the screen. If a subsequent cursor position (set by the #SetCursorPos() function or the mouse) lies
        outside the rectangle, the system automatically adjusts the position to keep the cursor inside the rectangular area.
        """,

        nullable..RECT.const.p(
            "rect",
            """
            a pointer to the structure that contains the screen coordinates of the upper-left and lower-right corners of the confining rectangle. If this
            parameter is #NULL, the cursor is free to move anywhere on the screen.
            """
        )
    )

    int(
        "ShowCursor",
        """
        Displays or hides the cursor.

        This function sets an internal display counter that determines whether the cursor should be displayed. The cursor is displayed only if the display
        count is greater than or equal to 0. If a mouse is installed, the initial display count is 0. If no mouse is installed, the display count is –1.
        """,

        BOOL(
            "show",
            "If {@code show} is #TRUE, the display count is incremented by one. If {@code show} is #FALSE, the display count is decremented by one."
        ),

        returnDoc = "the new display counter"
    )

    HCURSOR(
        "SetCursor",
        """
        Sets the cursor shape.

        The cursor is set only if the new cursor is different from the previous cursor; otherwise, the function returns immediately.

        The cursor is a shared resource. A window should set the cursor shape only when the cursor is in its client area or when the window is capturing mouse
        input. In systems without a mouse, the window should restore the previous cursor before the cursor leaves the client area or before it relinquishes
        control to another window.

        If your application must set the cursor while it is in a window, make sure the class cursor for the specified window's class is set to #NULL. If the
        class cursor is not #NULL, the system restores the class cursor each time the mouse is moved.

        The cursor is not shown on the screen if the internal cursor display count is less than zero. This occurs if the application uses the #ShowCursor()
        function to hide the cursor more times than to show the cursor.
        """,

        nullable..HCURSOR(
            "hCursor",
            """
            a handle to the cursor. The cursor must have been created by the {@code CreateCursor} function or loaded by the #LoadCursor() or {@code LoadImage}
            function. If this parameter is #NULL, the cursor is removed from the screen.
            """
        ),

        returnDoc = "the handle to the previous cursor, if there was one"
    )

    BOOL(
        "ClientToScreen",
        """
        Converts the client-area coordinates of a specified point to screen coordinates.
                    
        The {@code ClientToScreen} function replaces the client-area coordinates in the ##POINT structure with the screen coordinates. The screen coordinates
        are relative to the upper-left corner of the screen. Note, a screen-coordinate point that is above the window's client area has a negative
        y-coordinate. Similarly, a screen coordinate to the left of a client area has a negative x-coordinate.

        All coordinates are device coordinates.
        """,

        HWND("hWnd", "a handle to the window whose client area is used for the conversion"),
        LPPOINT(
            "lpPoint",
            """
            a pointer to a {@code POINT} structure that contains the client coordinates to be converted. The new screen coordinates are copied into this
            structure if the function succeeds.
            """
        )
    )

    SHORT(
        "GetAsyncKeyState",
        """
        Determines whether a key is up or down at the time the function is called, and whether the key was pressed after a previous call to
        {@code GetAsyncKeyState}.
        
        The {@code GetAsyncKeyState} function works with mouse buttons. However, it checks on the state of the physical mouse buttons, not on the logical mouse
        buttons that the physical buttons are mapped to. For example, the call {@code GetAsyncKeyState(VK_LBUTTON)} always returns the state of the left
        physical mouse button, regardless of whether it is mapped to the left or right logical mouse button. You can determine the system's current mapping of
        physical mouse buttons to logical mouse buttons by calling {@code GetSystemMetrics(SM_SWAPBUTTON)} which returns #TRUE if the mouse buttons have been
        swapped.

        Although the least significant bit of the return value indicates whether the key has been pressed since the last query, due to the pre-emptive
        multitasking nature of Windows, another application can call {@code GetAsyncKeyState} and receive the "recently pressed" bit instead of your
        application. The behavior of the least significant bit of the return value is retained strictly for compatibility with 16-bit Windows applications
        (which are non-preemptive) and should not be relied upon.

        You can use the virtual-key code constants #VK_SHIFT, #VK_CONTROL, and #VK_MENU as values for the {@code vKey} parameter. This gives the state of the
        SHIFT, CTRL, or ALT keys without distinguishing between left and right.
        """,

        int("vKey", "the virtual-key code. You can use left- and right-distinguishing constants to specify certain keys."),
        
        returnDoc =
        """
        if the function succeeds, the return value specifies whether the key was pressed since the last call to {@code GetAsyncKeyState}, and whether the key
        is currently up or down. If the most significant bit is set, the key is down, and if the least significant bit is set, the key was pressed after the
        previous call to {@code GetAsyncKeyState}. However, you should not rely on this last behavior; for more information, see the Remarks.

        The return value is zero for the following cases:
        ${ul(
            "The current desktop is not the active desktop",
            "The foreground thread belongs to another process and the desktop does not allow the hook or the journal record."
        )}
        """
    )

    IntConstant(
        "The type of input event.",

        "INPUT_MOUSE".."0",
        "INPUT_KEYBOARD".."1",
        "INPUT_HARDWARE".."2"
    )

    IntConstant(
        "##MOUSEINPUT flags.",

        "MOUSEEVENTF_ABSOLUTE"..0x8000,
        "MOUSEEVENTF_HWHEEL"..0x01000,
        "MOUSEEVENTF_MOVE"..0x0001,
        "MOUSEEVENTF_MOVE_NOCOALESCE"..0x2000,
        "MOUSEEVENTF_LEFTDOWN"..0x0002,
        "MOUSEEVENTF_LEFTUP"..0x0004,
        "MOUSEEVENTF_RIGHTDOWN"..0x0008,
        "MOUSEEVENTF_RIGHTUP"..0x0010,
        "MOUSEEVENTF_MIDDLEDOWN"..0x0020,
        "MOUSEEVENTF_MIDDLEUP"..0x0040,
        "MOUSEEVENTF_VIRTUALDESK"..0x4000,
        "MOUSEEVENTF_WHEEL"..0x0800,
        "MOUSEEVENTF_XDOWN"..0x0080,
        "MOUSEEVENTF_XUP"..0x0100
    )

    IntConstant(
        "##KEYBDINPUT flags.",

        "KEYEVENTF_EXTENDEDKEY"..0x0001,
        "KEYEVENTF_KEYUP"..0x0002,
        "KEYEVENTF_SCANCODE"..0x0008,
        "KEYEVENTF_UNICODE"..0x0004
    )

    LPARAM(
        "GetMessageExtraInfo",
        """
        Retrieves the extra message information for the current thread.
        
        Extra message information is an application- or driver-defined value associated with the current thread's message queue.
        """,

        returnDoc = "the extra information. The meaning of the extra information is device specific."
    )

    UINT(
        "SendInput",
        """
        Synthesizes keystrokes, mouse motions, and button clicks.
        
        This function is subject to UIPI. Applications are permitted to inject input only into applications that are at an equal or lesser integrity level.

        The {@code SendInput} function inserts the events in the ##INPUT structures serially into the keyboard or mouse input stream. These events are not
        interspersed with other keyboard or mouse input events inserted either by the user (with the keyboard or mouse) or by calls to {@code keybd_event},
        {@code mouse_event}, or other calls to {@code SendInput}.

        This function does not reset the keyboard's current state. Any keys that are already pressed when the function is called might interfere with the
        events that this function generates. To avoid this problem, check the keyboard's state with the #GetAsyncKeyState() function and correct as necessary.

        Because the touch keyboard uses the surrogate macros defined in {@code winnls.h} to send input to the system, a listener on the keyboard event hook
        must decode input originating from the touch keyboard.

        An accessibility application can use {@code SendInput} to inject keystrokes corresponding to application launch shortcut keys that are handled by the
        shell. This functionality is not guaranteed to work for other types of applications.
        """,

        AutoSize("pInputs")..UINT("cInputs", "the number of structures in the {@code pInputs} array"),
        LPINPUT("pInputs", "an array of {@code INPUT} structures. Each structure represents an event to be inserted into the keyboard or mouse input stream."),
        int(
            "cbSize",
            "the size, in bytes, of an {@code INPUT} structure. If {@code cbSiz}e is not the size of an {@code INPUT} structure, the function fails."
        ),

        returnDoc =
        """
        the number of events that it successfully inserted into the keyboard or mouse input stream. If the function returns zero, the input was already blocked
        by another thread. To get extended error information, call #GetLastError().

        This function fails when it is blocked by UIPI. Note that neither GetLastError nor the return value will indicate the failure was caused by UIPI
        blocking.
        """
    )

    IgnoreMissing..UINT(
        "GetDpiForSystem",
        """
        Returns the system DPI.

        The return value will be dependent based upon the calling context. If the current thread has a {@code DPI_AWARENESS} value of #DPI_AWARENESS_UNAWARE,
        the return value will be 96. That is because the current context always assumes a DPI of 96. For any other {@code DPI_AWARENESS} value, the return
        value will be the actual system DPI.

        You should not cache the system DPI, but should use {@code GetDpiForSystem} whenever you need the system DPI value.
        """,

        returnDoc = "the system DPI value",
        since = "Windows 10"
    )

    IgnoreMissing..UINT(
        "GetDpiForWindow",
        "Returns the dots per inch (dpi) value for the associated window.",

        HWND("hwnd", "the window you want to get information about"),

        returnDoc =
        "the DPI for the window which depends on the {@code DPI_AWARENESS} of the window. An invalid {@code hwnd} value will result in a return value of 0.",
        since = "Windows 10"
    )

    IgnoreMissing.."DPI_AWARENESS".enumType(
        "GetAwarenessFromDpiAwarenessContext",
        "Retrieves the {@code DPI_AWARENESS} value from a {@code DPI_AWARENESS_CONTEXT}.",

        DPI_AWARENESS_CONTEXT("value", "the {@code DPI_AWARENESS_CONTEXT} you want to examine"),

        returnDoc = "the {@code DPI_AWARENESS}. If the provided value is null or invalid, this method will return #DPI_AWARENESS_INVALID.",
        since = "Windows 10"
    )

    IgnoreMissing..DPI_AWARENESS_CONTEXT(
        "GetThreadDpiAwarenessContext",
        """
        Gets the {@code DPI_AWARENESS_CONTEXT} for the current thread.

        If #SetThreadDpiAwarenessContext() was never called for this thread, then the return value will equal the default {@code DPI_AWARENESS_CONTEXT} for the
        process.
        """,

        returnDoc = "the current {@code DPI_AWARENESS_CONTEXT} for the thread.",
        since = "Windows 10"
    )

    IgnoreMissing..DPI_AWARENESS_CONTEXT(
        "GetWindowDpiAwarenessContext",
        "Returns the {@code DPI_AWARENESS_CONTEXT}  associated with a window.",

        HWND("hwnd", "the window to query"),

        returnDoc = "the {@code DPI_AWARENESS_CONTEXT} for the provided window. If the window is not valid, the return value is #NULL.",
        since = "Windows 10"
    )

    IgnoreMissing..BOOL(
        "IsValidDpiAwarenessContext",
        "Determines if a specified {@code DPI_AWARENESS_CONTEXT} is valid and supported by the current system.",

        nullable..DPI_AWARENESS_CONTEXT("value", "the context that you want to determine if it is supported"),

        returnDoc = "#TRUE if the provided context is supported, otherwise #FALSE",
        since = "Windows 10"
    )

    IgnoreMissing..DPI_AWARENESS_CONTEXT(
        "SetThreadDpiAwarenessContext",
        "Set the DPI awareness for the current thread to the provided value.",

        DPI_AWARENESS_CONTEXT("dpiContext", "the DPI awareness value to set"),

        returnDoc =
        """
        The old {@code DPI_AWARENESS_CONTEXT} for the thread. If the {@code dpiContext} is invalid, the thread will not be updated and the return value will be
        #NULL. You can use this value to restore the old {@code DPI_AWARENESS_CONTEXT} after overriding it with a predefined value.
        """,
        since = "Windows 10"
    )
}