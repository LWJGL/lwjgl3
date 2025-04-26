/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows.templates

import org.lwjgl.generator.*
import core.windows.*

val User32 = "User32".nativeClass(Module.CORE_WINDOWS, nativeSubPath = "windows", binding = simpleBinding(Module.CORE_WINDOWS, "user32")) {
    nativeImport("WindowsLWJGL.h")

    IntConstant(
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
        "CW_USEDEFAULT"..0x80000000.i
    )

    IntConstant(
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
        "WA_ACTIVE".."1",
        "WA_CLICKACTIVE".."2",
        "WA_INACTIVE".."0"
    )

    IntConstant(
        "SIZE_RESTORED".."0",
        "SIZE_MINIMIZED".."1",
        "SIZE_MAXIMIZED".."2",
        "SIZE_MAXSHOW".."3",
        "SIZE_MAXHIDE".."4"
    )

    IntConstant(
        "DBT_APPYBEGIN"..0x0000,
        "DBT_APPYEND"..0x0001,
        "DBT_DEVNODES_CHANGED"..0x0007,
        "DBT_QUERYCHANGECONFIG"..0x0017,
        "DBT_CONFIGCHANGED"..0x0018,
        "DBT_CONFIGCHANGECANCELED"..0x0019,
        "DBT_MONITORCHANGE"..0x001B
    )

    IntConstant(
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
        "MK_LBUTTON"..0x0001,
        "MK_RBUTTON"..0x0002,
        "MK_SHIFT"..0x0004,
        "MK_CONTROL"..0x0008,
        "MK_MBUTTON"..0x0010,
        "MK_XBUTTON1"..0x0020,
        "MK_XBUTTON2"..0x0040
    )

    IntConstant(
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

    IntConstant(
        "GWL_WNDPROC".."-4",
        "GWL_HINSTANCE".."-6",
        "GWL_HWNDPARENT".."-8",
        "GWL_STYLE".."-16",
        "GWL_EXSTYLE".."-20",
        "GWL_USERDATA".."-21",
        "GWL_ID".."-12"
    )

    IntConstant(
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
    )

    LongConstant(
        "HWND_TOP"..0L,
        "HWND_BOTTOM"..1L,
        "HWND_TOPMOST"..-1L,
        "HWND_NOTOPMOST"..-2L
    )

    LongConstant(
        "HWND_BROADCAST"..0xFFFFL
    )

    IntConstant(
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
    )

    IntConstant(
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
    )

    IntConstant(
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
    )

    IntConstant(
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
    )

    IntConstant(
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
        "PM_NOREMOVE"..0x0000,
        "PM_REMOVE"..0x0001,
        "PM_NOYIELD"..0x0002,
        "PM_QS_INPUT".."QS_INPUT << 16",
        "PM_QS_POSTMESSAGE".."(QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16",
        "PM_QS_PAINT".."QS_PAINT << 16",
        "PM_QS_SENDMESSAGE".."QS_SENDMESSAGE << 16"
    )

    IntConstant(
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
        "XBUTTON1"..0x0001,
        "XBUTTON2"..0x0002
    )

    IntConstant(
        "WHEEL_DELTA".."120"
    )

    EnumConstant(
        "DPI_AWARENESS_INVALID".enum("-1"),
        "DPI_AWARENESS_UNAWARE".enum("0"),
        "DPI_AWARENESS_SYSTEM_AWARE".enum("1"),
        "DPI_AWARENESS_PER_MONITOR_AWARE".enum("2")
    )

    LongConstant(
        "DPI_AWARENESS_CONTEXT_UNAWARE".."-1L",
        "DPI_AWARENESS_CONTEXT_SYSTEM_AWARE".."-2L",
        "DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE".."-3L",
        "DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2".."-4L"
    )

    NativeName("RegisterClassExW")..ATOM(
        "RegisterClassEx",

        CaptureCallState.GetLastError.param,
        WNDCLASSEX.const.p("lpwcx")
    )

    NativeName("UnregisterClassW")..BOOL(
        "UnregisterClass",

        CaptureCallState.GetLastError.param,
        LPCTSTR("lpClassName"),
        nullable..HINSTANCE("hInstance")
    )

    NativeName("CreateWindowExW")..HWND(
        "CreateWindowEx",

        CaptureCallState.GetLastError.param,
        DWORD("dwExStyle"),
        nullable..LPCTSTR("lpClassName"),
        nullable..LPCTSTR("lpWindowName"),
        DWORD("dwStyle"),
        int("x"),
        int("y"),
        int("nWidth"),
        int("nHeight"),
        nullable..HWND("hWndParent"),
        nullable..HMENU("hMenu"),
        nullable..HINSTANCE("hInstance"),
        nullable..LPVOID("lpParam")
    )

    BOOL(
        "DestroyWindow",

        CaptureCallState.GetLastError.param,
        HWND("hWnd")
    )

    NativeName("DefWindowProcW")..LRESULT(
        "DefWindowProc",

        HWND("hWnd"),
        UINT("Msg"),
        WPARAM("wParam"),
        LPARAM("lParam")
    )

    NativeName("CallWindowProcW")..LRESULT(
        "CallWindowProc",

        WNDPROC("lpPrevWndFunc"),
        HWND("hWnd"),
        UINT("Msg"),
        WPARAM("wParam"),
        LPARAM("lParam")
    )

    BOOL(
        "ShowWindow",

        HWND("hWnd"),
        int("nCmdShow")
    )

    BOOL(
        "UpdateWindow",

        HWND("hWnd")
    )

    BOOL(
        "SetWindowPos",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        nullable..HWND("hWndInsertAfter"),
        int("X"),
        int("Y"),
        int("cx"),
        int("cy"),
        UINT("uFlags")
    )

    NativeName("SetWindowTextW")..BOOL(
        "SetWindowText",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        LPCTSTR("lpString")
    )

    val GetMessage = NativeName("GetMessageW")..BOOL(
        "GetMessage",

        CaptureCallState.GetLastError.param,
        LPMSG("lpMsg"),
        nullable..HWND("hWnd"),
        UINT("wMsgFilterMin"),
        UINT("wMsgFilterMax")
    )

    NativeName("PeekMessageW")..BOOL(
        "PeekMessage",

        LPMSG("lpMsg"),
        GetMessage["hWnd"],
        GetMessage["wMsgFilterMin"],
        GetMessage["wMsgFilterMax"],
        UINT("wRemoveMsg")
    )

    BOOL(
        "TranslateMessage",

        MSG.const.p("lpMsg")
    )

    BOOL(
        "WaitMessage",

        CaptureCallState.GetLastError.param
    )

    NativeName("DispatchMessageW")..LRESULT(
        "DispatchMessage",

        MSG.const.p("lpmsg")
    )

    NativeName("PostMessageW")..BOOL(
        "PostMessage",

        CaptureCallState.GetLastError.param,
        nullable..HWND("hWnd"),
        UINT("Msg"),
        WPARAM("wParam"),
        LPARAM("lParam")
    )

    NativeName("SendMessageW")..BOOL(
        "SendMessage",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        UINT("Msg"),
        WPARAM("wParam"),
        LPARAM("lParam")
    )

    BOOL(
        "AdjustWindowRectEx",

        CaptureCallState.GetLastError.param,
        LPRECT("lpRect"),
        DWORD("dwStyle"),
        BOOL("bMenu"),
        DWORD("dwExStyle")
    )

    BOOL(
        "GetWindowRect",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        LPRECT("lpRect")
    )

    BOOL(
        "MoveWindow",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        int("X"),
        int("Y"),
        int("nWidth"),
        int("nHeight"),
        BOOL("bRepaint")
    )

    IntConstant(
        "WPF_SETMINPOSITION"..0x0001,
        "WPF_RESTORETOMAXIMIZED"..0x0002,
        "WPF_ASYNCWINDOWPLACEMENT"..0x0004
    )

    BOOL(
        "GetWindowPlacement",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        Input..WINDOWPLACEMENT.p("lpwndpl")
    )

    BOOL(
        "SetWindowPlacement",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        WINDOWPLACEMENT.const.p("lpwndpl")
    )

    BOOL(
        "IsWindowVisible",

        HWND("hWnd")
    )

    BOOL(
        "IsIconic",

        HWND("hWnd")
    )

    BOOL(
        "IsZoomed",

        HWND("hWnd")
    )

    BOOL(
        "BringWindowToTop",

        HWND("hWnd")
    )

    NativeName("Pointer.BITS64 ? \"SetWindowLongPtrW\" : \"SetWindowLongW\"")..LONG_PTR(
        "SetWindowLongPtr",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        int("nIndex"),
        LONG_PTR("dwNewLong")
    )

    NativeName("Pointer.BITS64 ? \"GetWindowLongPtrW\" : \"GetWindowLongW\"")..LONG_PTR(
        "GetWindowLongPtr",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        int("nIndex")
    )

    // TODO: remove in LWJGL 4, added for #1052
    customMethod("""
    @NativeType("LONG_PTR")
    public static long GetWindowLongPtr(@NativeType("HWND") long hWnd, int nIndex) {
        return nGetWindowLongPtr(NULL, hWnd, nIndex);
    }""")

    NativeName("Pointer.BITS64 ? \"SetClassLongPtrW\" : \"SetClassLongW\"")..LONG_PTR(
        "SetClassLongPtr",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        int("nIndex"),
        LONG_PTR("dwNewLong")
    )

    NativeName("Pointer.BITS64 ? \"GetClassLongPtrW\" : \"GetClassLongW\"")..LONG_PTR(
        "GetClassLongPtr",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        int("nIndex")
    )

    IntConstant(
        "LWA_COLORKEY"..0x00000001,
        "LWA_ALPHA"..0x00000002
    )

    BOOL(
        "SetLayeredWindowAttributes",

        CaptureCallState.GetLastError.param,
        HWND("hwnd"),
        COLORREF("crKey"),
        BYTE("bAlpha"),
        DWORD("dwFlags")
    )

    NativeName("LoadIconW")..HICON(
        "LoadIcon",

        CaptureCallState.GetLastError.param,
        nullable..HINSTANCE("instance"),
        LPCTSTR("iconName")
    )

    NativeName("LoadCursorW")..HCURSOR(
        "LoadCursor",

        CaptureCallState.GetLastError.param,
        nullable..HINSTANCE("instance"),
        LPCTSTR("cursorName")
    )

    HDC(
        "GetDC",

        nullable..HWND("hWnd")
    )

    BOOL(
        "ReleaseDC",

        HWND("hWnd"),
        HDC("hDC")
    )

    IntConstant(
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
    )

    int(
        "GetSystemMetrics",

        int("index")
    )

    IntConstant(
        "TWF_FINETOUCH"..0x00000001,
        "TWF_WANTPALM"..0x00000002
    )

    IntConstant(
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
        "TOUCHINPUTMASKF_TIMEFROMSYSTEM"..0x0001,
        "TOUCHINPUTMASKF_EXTRAINFO"..0x0002,
        "TOUCHINPUTMASKF_CONTACTAREA"..0x0004
    )

    IgnoreMissing..BOOL(
        "RegisterTouchWindow",

        CaptureCallState.GetLastError.param,
        HWND("hWnd"),
        ULONG("ulFlags")
    )

    IgnoreMissing..BOOL(
        "UnregisterTouchWindow",

        CaptureCallState.GetLastError.param,
        HWND("hWnd")
    )

    IgnoreMissing..BOOL(
        "IsTouchWindow",

        HWND("hWnd"),
        Check(1)..nullable..PULONG("pulFlags")
    )

    IgnoreMissing..BOOL(
        "GetTouchInputInfo",

        CaptureCallState.GetLastError.param,
        HTOUCHINPUT("hTouchInput"),
        AutoSize("pInputs")..UINT("cInputs"),
        PTOUCHINPUT("pInputs"),
        int("cbSize")
    )

    IgnoreMissing..BOOL(
        "CloseTouchInputHandle",

        CaptureCallState.GetLastError.param,
        HTOUCHINPUT("hTouchInput")
    )

    IntConstant(
        "MONITOR_DEFAULTTONULL"..0x00000000,
        "MONITOR_DEFAULTTOPRIMARY"..0x00000001,
        "MONITOR_DEFAULTTONEAREST"..0x00000002
    )

    HMONITOR(
        "MonitorFromWindow",

        HWND("hWnd"),
        DWORD("dwFlags")
    )

    IntConstant(
        "MONITORINFOF_PRIMARY"..0x00000001
    )

    NativeName("GetMonitorInfoW")..BOOL(
        "GetMonitorInfo",

        HMONITOR("hMonitor"),
        LPMONITORINFOEX("lpmi")
    )

    IntConstant(
        "EDD_GET_DEVICE_INTERFACE_NAME"..0x00000001
    )

    IntConstant(
        "ENUM_CURRENT_SETTINGS".."-1",
        "ENUM_REGISTRY_SETTINGS".."-2"
    )

    IntConstant(
        "EDS_RAWMODE"..0x00000002,
        "EDS_ROTATEDMODE"..0x00000004
    )

    IntConstant(
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
    )

    IntConstant(
        "DISP_CHANGE_SUCCESSFUL".."0",
        "DISP_CHANGE_RESTART".."1",
        "DISP_CHANGE_FAILED".."-1",
        "DISP_CHANGE_BADMODE".."-2",
        "DISP_CHANGE_NOTUPDATED".."-3",
        "DISP_CHANGE_BADFLAGS".."-4",
        "DISP_CHANGE_BADPARAM".."-5",

        "DISP_CHANGE_BADDUALVIEW".."-6" // _WIN32_WINNT >= 0x0501
    )

    NativeName("EnumDisplayDevicesW")..BOOL(
        "EnumDisplayDevices",

        nullable..LPCTSTR("lpDevice"),
        DWORD("iDevNum"),
        PDISPLAY_DEVICE("lpDisplayDevice"),
        DWORD("dwFlags")
    )

    NativeName("EnumDisplaySettingsExW")..BOOL(
        "EnumDisplaySettingsEx",

        nullable..LPCTSTR("lpszDeviceName"),
        DWORD("iModeNum"),
        DEVMODE.p("lpDevMode"),
        DWORD("dwFlags")
    )

    NativeName("ChangeDisplaySettingsExW")..LONG(
        "ChangeDisplaySettingsEx",

        nullable..LPCTSTR("lpszDeviceName"),
        nullable..DEVMODE.p("lpDevMode"),
        nullable..HWND("hwnd"),
        DWORD("dwflags"),
        nullable..LPVOID("lParam")
    )

    BOOL(
        "GetCursorPos",

        LPPOINT("point")
    )

    BOOL(
        "SetCursorPos",

        int("X"),
        int("Y")
    )

    BOOL(
        "ClipCursor",

        nullable..RECT.const.p("rect")
    )

    int(
        "ShowCursor",

        BOOL("show")
    )

    HCURSOR(
        "SetCursor",

        nullable..HCURSOR("hCursor")
    )

    BOOL(
        "ClientToScreen",

        HWND("hWnd"),
        LPPOINT("lpPoint")
    )

    SHORT(
        "GetAsyncKeyState",

        int("vKey")
    )

    IntConstant(
        "INPUT_MOUSE".."0",
        "INPUT_KEYBOARD".."1",
        "INPUT_HARDWARE".."2"
    )

    IntConstant(
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
        "KEYEVENTF_EXTENDEDKEY"..0x0001,
        "KEYEVENTF_KEYUP"..0x0002,
        "KEYEVENTF_SCANCODE"..0x0008,
        "KEYEVENTF_UNICODE"..0x0004
    )

    LPARAM(
        "GetMessageExtraInfo",
        void()
    )

    UINT(
        "SendInput",

        AutoSize("pInputs")..UINT("cInputs"),
        LPINPUT("pInputs"),
        int("cbSize")
    )

    IgnoreMissing..UINT(
        "GetDpiForSystem",
        void()
    )

    IgnoreMissing..UINT(
        "GetDpiForWindow",

        HWND("hwnd")
    )

    IgnoreMissing.."DPI_AWARENESS".enumType(
        "GetAwarenessFromDpiAwarenessContext",

        DPI_AWARENESS_CONTEXT("value")
    )

    IgnoreMissing..DPI_AWARENESS_CONTEXT(
        "GetThreadDpiAwarenessContext",
        void()
    )

    IgnoreMissing..DPI_AWARENESS_CONTEXT(
        "GetWindowDpiAwarenessContext",

        HWND("hwnd")
    )

    IgnoreMissing..BOOL(
        "IsValidDpiAwarenessContext",

        nullable..DPI_AWARENESS_CONTEXT("value")
    )

    IgnoreMissing..DPI_AWARENESS_CONTEXT(
        "SetThreadDpiAwarenessContext",

        DPI_AWARENESS_CONTEXT("dpiContext")
    )
}