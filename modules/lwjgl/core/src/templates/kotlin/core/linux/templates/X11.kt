/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import org.lwjgl.generator.*
import core.linux.*

val X11 = "X11".nativeClass(
    Module.CORE_LINUX,
    nativeSubPath = "linux",
    binding = simpleBinding(Module.CORE_LINUX, "X11", libraryExpression = "null, \"libX11.so.6\", \"libX11.so\"")
) {
    IntConstant(
        "True".."1",
        "False".."0"
    )

    IntConstant(
        "None".."0",
        "ParentRelative".."1",
        "CopyFromParent".."0",
        "PointerWindow".."0",
        "InputFocus".."1",
        "PointerRoot".."1",
        "AnyPropertyType".."0",
        "AnyKey".."0",
        "AnyButton".."0",
        "AllTemporary".."0",
        "CurrentTime".."0",
        "NoSymbol".."0"
    )

    IntConstant(
        "Success".."0",
        "BadRequest".."1",
        "BadValue".."2",
        "BadWindow".."3",
        "BadPixmap".."4",
        "BadAtom".."5",
        "BadCursor".."6",
        "BadFont".."7",
        "BadMatch".."8",
        "BadDrawable".."9",
        "BadAccess".."10",
        "BadAlloc".."11",
        "BadColor".."12",
        "BadGC".."13",
        "BadIDChoice".."14",
        "BadName".."15",
        "BadLength".."16",
        "BadImplementation".."17",
        "FirstExtensionError".."128",
        "LastExtensionError".."255"
    )

    IntConstant(
        "CWBackPixmap".."1 << 0",
        "CWBackPixel".."1 << 1",
        "CWBorderPixmap".."1 << 2",
        "CWBorderPixel".."1 << 3",
        "CWBitGravity".."1 << 4",
        "CWWinGravity".."1 << 5",
        "CWBackingStore".."1 << 6",
        "CWBackingPlanes".."1 << 7",
        "CWBackingPixel".."1 << 8",
        "CWOverrideRedirect".."1 << 9",
        "CWSaveUnder".."1 << 10",
        "CWEventMask".."1 << 11",
        "CWDontPropagate".."1 << 12",
        "CWColormap".."1 << 13",
        "CWCursor".."1 << 14"
    )

    IntConstant(
        "NoEventMask".."0",
        "KeyPressMask".."1 << 0",
        "KeyReleaseMask".."1 << 1",
        "ButtonPressMask".."1 << 2",
        "ButtonReleaseMask".."1 << 3",
        "EnterWindowMask".."1 << 4",
        "LeaveWindowMask".."1 << 5",
        "PointerMotionMask".."1 << 6",
        "PointerMotionHintMask".."1 << 7",
        "Button1MotionMask".."1 << 8",
        "Button2MotionMask".."1 << 9",
        "Button3MotionMask".."1 << 10",
        "Button4MotionMask".."1 << 11",
        "Button5MotionMask".."1 << 12",
        "ButtonMotionMask".."1 << 13",
        "KeymapStateMask".."1 << 14",
        "ExposureMask".."1 << 15",
        "VisibilityChangeMask".."1 << 16",
        "StructureNotifyMask".."1 << 17",
        "ResizeRedirectMask".."1 << 18",
        "SubstructureNotifyMask".."1 << 19",
        "SubstructureRedirectMask".."1 << 20",
        "FocusChangeMask".."1 << 21",
        "PropertyChangeMask".."1 << 22",
        "ColormapChangeMask".."1 << 23",
        "OwnerGrabButtonMask".."1 << 24"
    )

    IntConstant(
        "KeyPress".."2",
        "KeyRelease".."3",
        "ButtonPress".."4",
        "ButtonRelease".."5",
        "MotionNotify".."6",
        "EnterNotify".."7",
        "LeaveNotify".."8",
        "FocusIn".."9",
        "FocusOut".."10",
        "KeymapNotify".."11",
        "Expose".."12",
        "GraphicsExpose".."13",
        "NoExpose".."14",
        "VisibilityNotify".."15",
        "CreateNotify".."16",
        "DestroyNotify".."17",
        "UnmapNotify".."18",
        "MapNotify".."19",
        "MapRequest".."20",
        "ReparentNotify".."21",
        "ConfigureNotify".."22",
        "ConfigureRequest".."23",
        "GravityNotify".."24",
        "ResizeRequest".."25",
        "CirculateNotify".."26",
        "CirculateRequest".."27",
        "PropertyNotify".."28",
        "SelectionClear".."29",
        "SelectionRequest".."30",
        "SelectionNotify".."31",
        "ColormapNotify".."32",
        "ClientMessage".."33",
        "MappingNotify".."34",
        "GenericEvent".."35",
        "LASTEvent".."36"
    )

    IntConstant(
        "ShiftMask".."1<<0",
        "LockMask".."1<<1",
        "ControlMask".."1<<2",
        "Mod1Mask".."1<<3",
        "Mod2Mask".."1<<4",
        "Mod3Mask".."1<<5",
        "Mod4Mask".."1<<6",
        "Mod5Mask".."1<<7"
    )

    IntConstant(
        "ShiftMapIndex".."0",
        "LockMapIndex".."1",
        "ControlMapIndex".."2",
        "Mod1MapIndex".."3",
        "Mod2MapIndex".."4",
        "Mod3MapIndex".."5",
        "Mod4MapIndex".."6",
        "Mod5MapIndex".."7"
    )

    IntConstant(
        "Button1Mask".."1<<8",
        "Button2Mask".."1<<9",
        "Button3Mask".."1<<10",
        "Button4Mask".."1<<11",
        "Button5Mask".."1<<12",
        "AnyModifier".."1<<15"
    )

    IntConstant(
        "Button1".."1",
        "Button2".."2",
        "Button3".."3",
        "Button4".."4",
        "Button5".."5"
    )

    IntConstant(
        "NotifyNormal".."0",
        "NotifyGrab".."1",
        "NotifyUngrab".."2",
        "NotifyWhileGrabbed".."3",
        "NotifyHint".."1"
    )

    IntConstant(
        "NotifyAncestor".."0",
        "NotifyVirtual".."1",
        "NotifyInferior".."2",
        "NotifyNonlinear".."3",
        "NotifyNonlinearVirtual".."4",
        "NotifyPointer".."5",
        "NotifyPointerRoot".."6",
        "NotifyDetailNone".."7"
    )

    IntConstant(
        "VisibilityUnobscured".."0",
        "VisibilityPartiallyObscured".."1",
        "VisibilityFullyObscured".."2"
    )

    IntConstant(
        "PlaceOnTop".."0",
        "PlaceOnBottom".."1"
    )

    IntConstant(
        "PropertyNewValue".."0",
        "PropertyDelete".."1"
    )

    IntConstant(
        "ColormapUninstalled".."0",
        "ColormapInstalled".."1"
    )

    IntConstant(
        "GrabModeSync".."0",
        "GrabModeAsync".."1"
    )

    IntConstant(
        "GrabSuccess".."0",
        "AlreadyGrabbed".."1",
        "GrabInvalidTime".."2",
        "GrabNotViewable".."3",
        "GrabFrozen".."4"
    )

    IntConstant(
        "AsyncPointer".."0",
        "SyncPointer".."1",
        "ReplayPointer".."2",
        "AsyncKeyboard".."3",
        "SyncKeyboard".."4",
        "ReplayKeyboard".."5",
        "AsyncBoth".."6",
        "SyncBoth".."7"
    )

    IntConstant(
        "AllocNone".."0",
        "AllocAll".."1"
    )

    IntConstant(
        "RevertToNone".."None",
        "RevertToPointerRoot".."PointerRoot",
        "RevertToParent".."2"
    )

    IntConstant(
        "InputOutput".."1",
        "InputOnly".."2"
    )

    IntConstant(
        "DontPreferBlanking".."0",
        "PreferBlanking".."1",
        "DefaultBlanking".."2",
        "DisableScreenSaver".."0",
        "DisableScreenInterval".."0",
        "DontAllowExposures".."0",
        "AllowExposures".."1",
        "DefaultExposures".."2",
        "ScreenSaverReset".."0",
        "ScreenSaverActive".."1"
    )

    IntConstant(
        "PropModeReplace".."0",
        "PropModePrepend".."1",
        "PropModeAppend".."2"
    )

    IntConstant(
        "GXclear"..0x0,
        "GXand"..0x1,
        "GXandReverse"..0x2,
        "GXcopy"..0x3,
        "GXandInverted"..0x4,
        "GXnoop"..0x5,
        "GXxor"..0x6,
        "GXor"..0x7,
        "GXnor"..0x8,
        "GXequiv"..0x9,
        "GXinvert"..0xa,
        "GXorReverse"..0xb,
        "GXcopyInverted"..0xc,
        "GXorInverted"..0xd,
        "GXnand"..0xe,
        "GXset"..0xf
    )

    IntConstant(
        "LineSolid".."0",
        "LineOnOffDash".."1",
        "LineDoubleDash".."2"
    )

    IntConstant(
        "CapNotLast".."0",
        "CapButt".."1",
        "CapRound".."2",
        "CapProjecting".."3"
    )

    IntConstant(
        "JoinMiter".."0",
        "JoinRound".."1",
        "JoinBevel".."2"
    )

    IntConstant(
        "FillSolid".."0",
        "FillTiled".."1",
        "FillStippled".."2",
        "FillOpaqueStippled".."3"
    )

    IntConstant(
        "EvenOddRule".."0",
        "WindingRule".."1"
    )

    IntConstant(
        "ClipByChildren".."0",
        "IncludeInferiors".."1"
    )

    IntConstant(
        "Unsorted".."0",
        "YSorted".."1",
        "YXSorted".."2",
        "YXBanded".."3"
    )

    IntConstant(
        "CoordModeOrigin".."0",
        "CoordModePrevious".."1"
    )

    IntConstant(
        "Complex".."0",
        "Nonconvex".."1",
        "Convex".."2"
    )

    IntConstant(
        "ArcChord".."0",
        "ArcPieSlice".."1"
    )

    IntConstant(
        "GCFunction".."1<<0",
        "GCPlaneMask".."1<<1",
        "GCForeground".."1<<2",
        "GCBackground".."1<<3",
        "GCLineWidth".."1<<4",
        "GCLineStyle".."1<<5",
        "GCCapStyle".."1<<6",
        "GCJoinStyle".."1<<7",
        "GCFillStyle".."1<<8",
        "GCFillRule".."1<<9",
        "GCTile".."1<<10",
        "GCStipple".."1<<11",
        "GCTileStipXOrigin".."1<<12",
        "GCTileStipYOrigin".."1<<13",
        "GCFont".."1<<14",
        "GCSubwindowMode".."1<<15",
        "GCGraphicsExposures".."1<<16",
        "GCClipXOrigin".."1<<17",
        "GCClipYOrigin".."1<<18",
        "GCClipMask".."1<<19",
        "GCDashOffset".."1<<20",
        "GCDashList".."1<<21",
        "GCArcMode".."1<<22",
        "GCLastBit".."22"
    )

    IntConstant(
        "Above".."0",
        "Below".."1",
        "TopIf".."2",
        "BottomIf".."3",
        "Opposite".."4"
    )

    IntConstant(
        "MappingModifier".."0",
        "MappingKeyboard".."1",
        "MappingPointer".."2"
    )

    val DISPLAY = Display.p("display")
    val WINDOW = Window("w")
    //val DRAWABLE = Drawable("d")

    Display.p(
        "XOpenDisplay",

        nullable..charASCII.const.p("display_name")
    )

    void(
        "XCloseDisplay",

        DISPLAY
    )

    int(
        "XDefaultScreen",

        DISPLAY
    )

    Window(
        "XRootWindow",

        DISPLAY,
        int("screen_number")
    )

    Colormap(
        "XCreateColormap",

        DISPLAY,
        WINDOW,
        Visual.p("visual"),
        int("alloc")
    )

    int(
        "XFreeColormap",

        DISPLAY,
        Colormap("colormap")
    )

    Window(
        "XCreateWindow",

        DISPLAY,
        Window("parent"),
        int("x"),
        int("y"),
        unsigned_int("width"),
        unsigned_int("height"),
        unsigned_int("border_width"),
        int("depth"),
        unsigned_int("windowClass"),
        Visual.p("visual"),
        unsigned_long("valuemask"),
        XSetWindowAttributes.p("attributes")
    )

    int(
        "XDestroyWindow",

        DISPLAY,
        WINDOW
    )

    int(
        "XFree",

        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("data")
    )

    Status(
        "XSendEvent",

        DISPLAY,
        Window("w"),
        Bool("propagate"),
        long("event_mask"),
        XEvent.p("event_send")
    )

    unsigned_long(
        "XDisplayMotionBufferSize",

        DISPLAY
    )

    XTimeCoord.p(
        "XGetMotionEvents",

        DISPLAY,
        Window("w"),
        Time("start"),
        Time("stop"),
        AutoSizeResult..Check(1)..int.p("nevents_return")
    )

    Bool(
        "XTranslateCoordinates",

        DISPLAY,
        Window("src_w"),
        Window("dest_w"),
        int("src_x"),
        int("src_y"),
        Check(1)..int.p("dest_x_return"),
        Check(1)..int.p("dest_y_return"),
        Check(1)..Window.p("child_return")
    )
}