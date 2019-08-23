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
    documentation = "Native bindings to libX11."

    IntConstant(
        "Boolean values",

        "True".."1",
        "False".."0"
    )

    IntConstant(
        "RESERVED RESOURCE AND CONSTANT DEFINITIONS",

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
        "ERROR CODES",

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
        "Window attributes for CreateWindow and ChangeWindowAttributes",

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
        "Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names.",

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
        """
        Event names. Used in "type" field in {@code XEvent} structures. Not to be confused with event masks above. They start from 2 because 0 and 1 are reserved in
        the protocol for errors and replies.
        """,

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
        "Key masks. Used as modifiers to GrabButton and GrabKey, results of QueryPointer, state in various key-, mouse-, and button-related events.",

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
        "modifier names. Used to build a SetModifierMapping request or to read a GetModifierMapping request. These correspond to the masks defined above.",

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
        "button masks. Used in same manner as Key masks above. Not to be confused with button names below.",

        "Button1Mask".."1<<8",
        "Button2Mask".."1<<9",
        "Button3Mask".."1<<10",
        "Button4Mask".."1<<11",
        "Button5Mask".."1<<12",
        "AnyModifier".."1<<15"
    )

    IntConstant(
        """
        button names. Used as arguments to GrabButton and as detail in ButtonPress and ButtonRelease events. Not to be confused with button masks above. Note
        that 0 is already defined above as "AnyButton".
        """,

        "Button1".."1",
        "Button2".."2",
        "Button3".."3",
        "Button4".."4",
        "Button5".."5"
    )

    IntConstant(
        "Notify modes",

        "NotifyNormal".."0",
        "NotifyGrab".."1",
        "NotifyUngrab".."2",
        "NotifyWhileGrabbed".."3",
        "NotifyHint".."1"
    )

    IntConstant(
        "Notify detail",

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
        "Visibility notify",

        "VisibilityUnobscured".."0",
        "VisibilityPartiallyObscured".."1",
        "VisibilityFullyObscured".."2"
    )

    IntConstant(
        "Circulation request",

        "PlaceOnTop".."0",
        "PlaceOnBottom".."1"
    )

    IntConstant(
        "Property notification",

        "PropertyNewValue".."0",
        "PropertyDelete".."1"
    )

    IntConstant(
        "Color Map notification",

        "ColormapUninstalled".."0",
        "ColormapInstalled".."1"
    )

    IntConstant(
        "GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes",

        "GrabModeSync".."0",
        "GrabModeAsync".."1"
    )

    IntConstant(
        "GrabPointer, GrabKeyboard reply status",

        "GrabSuccess".."0",
        "AlreadyGrabbed".."1",
        "GrabInvalidTime".."2",
        "GrabNotViewable".."3",
        "GrabFrozen".."4"
    )

    IntConstant(
        "AllowEvents modes",

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
        "For #XCreateColormap().",

        "AllocNone".."0",
        "AllocAll".."1"
    )

    IntConstant(
        "Used in XSetInputFocus(), XGetInputFocus().",

        "RevertToNone".."None",
        "RevertToPointerRoot".."PointerRoot",
        "RevertToParent".."2"
    )

    IntConstant(
        "Window classes used by #XCreateWindow().",

        "InputOutput".."1",
        "InputOnly".."2"
    )

    IntConstant(
        "SCREEN SAVER STUFF",

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
        "Property modes",

        "PropModeReplace".."0",
        "PropModePrepend".."1",
        "PropModeAppend".."2"
    )

    IntConstant(
        "graphics functions, as in GC.alu",

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
        "LineStyle",

        "LineSolid".."0",
        "LineOnOffDash".."1",
        "LineDoubleDash".."2"
    )

    IntConstant(
        "capStyle",

        "CapNotLast".."0",
        "CapButt".."1",
        "CapRound".."2",
        "CapProjecting".."3"
    )

    IntConstant(
        "joinStyle",

        "JoinMiter".."0",
        "JoinRound".."1",
        "JoinBevel".."2"
    )

    IntConstant(
        "fillStyle",

        "FillSolid".."0",
        "FillTiled".."1",
        "FillStippled".."2",
        "FillOpaqueStippled".."3"
    )

    IntConstant(
        "fillRule",

        "EvenOddRule".."0",
        "WindingRule".."1"
    )

    IntConstant(
        "subwindow mode",

        "ClipByChildren".."0",
        "IncludeInferiors".."1"
    )

    IntConstant(
        "SetClipRectangles ordering",

        "Unsorted".."0",
        "YSorted".."1",
        "YXSorted".."2",
        "YXBanded".."3"
    )

    IntConstant(
        "CoordinateMode for drawing routines",

        "CoordModeOrigin".."0",
        "CoordModePrevious".."1"
    )

    IntConstant(
        "Polygon shapes",

        "Complex".."0",
        "Nonconvex".."1",
        "Convex".."2"
    )

    IntConstant(
        "Arc modes for PolyFillArc",

        "ArcChord".."0",
        "ArcPieSlice".."1"
    )

    IntConstant(
        "GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges",

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
        "",

        "Above".."0",
        "Below".."1",
        "TopIf".."2",
        "BottomIf".."3",
        "Opposite".."4"
    )

    IntConstant(
        "",

        "MappingModifier".."0",
        "MappingKeyboard".."1",
        "MappingPointer".."2"
    )

    val DISPLAY = Display.p("display", "the connection to the X server")
    val WINDOW = Window("w", "the window")
    //val DRAWABLE = Drawable("d", "the drawable")

    Display.p(
        "XOpenDisplay",
        """
        Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
        connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
        If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
        If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
        (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
        mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
        """,

        nullable..charASCII.const.p(
            "display_name",
            """
            the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
            {@code display_name} is #NULL, it defaults to the value of the DISPLAY environment variable.
            """
        )
    )

    void(
        "XCloseDisplay",
        """
        Closes the connection to the X server for the display specified in the {@code Display} structure and destroys all windows, resource IDs (Window, Font,
        Pixmap, Colormap, Cursor, and GContext), or other resources that the client has created on this display, unless the close-down mode of the resource has
        been changed (see {@code XSetCloseDownMode()}). Therefore, these windows, resource IDs, and other resources should never be referenced again or an error will
        be generated. Before exiting, you should call {@code XCloseDisplay()} explicitly so that any pending errors are reported as {@code XCloseDisplay()}
        performs a final {@code XSync()} operation.
        """,

        DISPLAY
    )

    int(
        "XDefaultScreen",
        "Returns a pointer to the default screen.",

        DISPLAY
    )

    Window(
        "XRootWindow",
        "Returns the root window of the specified screen.",

        DISPLAY,
        int("screen_number", "the appropriate screen number on the host server")
    )

    Colormap(
        "XCreateColormap",
        """
        Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
        Note that the specified window is only used to determine the screen.
        """,

        DISPLAY,
        WINDOW,
        Visual.p("visual", "a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results."),
        int("alloc", "the colormap entries to be allocated. You can pass AllocNone or AllocAll.")
    )

    int(
        "XFreeColormap",
        """
        Deletes the association between the {@code colormap} resource ID and the {@code colormap} and frees the {@code colormap} storage. However, this function
        has no effect on the default colormap for a screen. If the specified {@code colormap} is an installed map for a screen, it is uninstalled. If the
        specified {@code colormap} is defined as the {@code colormap} for a window, {@code XFreeColormap()} changes the colormap associated with the window to
        #None and generates a {@code ColormapNotify} event. X does not define the colors displayed for a window with a colormap of #None.
        """,

        DISPLAY,
        Colormap("colormap", "the colormap to destroy")
    )

    Window(
        "XCreateWindow",
        """
        Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
        {@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.

        The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
        terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
        the inside, upper-left corner.

        The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.

        The width and height are the created window's inside dimensions and do not include the created window's borders.
        """,

        DISPLAY,
        Window("parent", "the parent window"),
        int("x", "the window x-coordinate"),
        int("y", "the window y-coordinate"),
        unsigned_int("width", "the window width"),
        unsigned_int("height", "the window height"),
        unsigned_int("border_width", "the border width"),
        int("depth", "the window's depth. A depth of #CopyFromParent means the depth is taken from the parent."),
        unsigned_int("windowClass", "the created window's class", "#InputOutput #InputOnly #CopyFromParent"),
        Visual.p("visual", "the visual type. A visual of #CopyFromParent means the visual type is taken from the parent."),
        unsigned_long(
            "valuemask",
            """
            which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
            {@code valuemask} is zero, the attributes are ignored and are not referenced.
            """
        ),
        XSetWindowAttributes.p("attributes", "the structure from which the values (as specified by the value mask) are to be taken")
    )

    int(
        "XDestroyWindow",
        """
        Destroys the specified window as well as all of its subwindows and causes the X server to generate a {@code DestroyNotify} event for each window. The
        window should never be referenced again. If the window specified by the {@code w} argument is mapped, it is unmapped automatically. The ordering of the
        {@code DestroyNotify} events is such that for any given window being destroyed, {@code DestroyNotify} is generated on any inferiors of the window before
        being generated on the window itself. The ordering among siblings and across subhierarchies is not otherwise constrained. If the window you specified is
        a root window, no windows are destroyed. Destroying a mapped window will generate {@code Expose} events on other windows that were obscured by the
        window being destroyed.
        """,

        DISPLAY,
        WINDOW
    )

    int(
        "XFree",
        "Free in-memory data that was created by an Xlib function.",

        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("data", "the data that is to be freed")
    )

    Status(
        "XSendEvent",
        """
        The {@code XSendEvent} function identifies the destination window, determines which clients should receive the specified events, and ignores any active
        grabs. This function requires you to pass an event mask. This function uses the {@code w} argument to identify the destination window as follows:
        ${ul(
            "If {@code w} is {@code PointerWindow}, the destination window is the window that contains the pointer.",
            """
            If {@code w} is {@code InputFocus} and if the focus window contains the pointer, the destination window is the window that contains the pointer;
            otherwise, the destination window is the focus window.
            """
        )}

        To determine which clients should receive the specified events, {@code XSendEvent} uses the propagate argument as follows:
        ${ul(
            """
            If {@code event_mask} is the empty set, the event is sent to the client that created the destination window. If that client no longer exists, no
            event is sent.
            """,
            """
            If {@code propagate} is #False, the event is sent to every client selecting on destination any of the event types in the {@code event_mask}
            argument.
            """,
            """
            If {@code propagate} is #True and no clients have selected on destination any of the event types in event-mask, the destination is replaced with
            the closest ancestor of destination for which some client has selected a type in event-mask and for which no intervening window has that type in
            its do-not-propagate-mask. If no such window exists or if the window is an ancestor of the focus window and #InputFocus was originally specified as
            the destination, the event is not sent to any clients. Otherwise, the event is reported to every client selecting on the final destination any of
            the types specified in {@code event_mask}.
            """
        )}

        The event in the {@code XEvent} structure must be one of the core events or one of the events defined by an extension (or a #BadValue error results) so
        that the X server can correctly byte-swap the contents as necessary. The contents of the event are otherwise unaltered and unchecked by the X server
        except to force {@code send_event} to #True in the forwarded event and to set the serial number in the event correctly; therefore these fields and the
        display field are ignored by {@code XSendEvent}.

        {@code XSendEvent} returns zero if the conversion to wire protocol format failed and returns nonzero otherwise. {@code XSendEvent} can generate
        #BadValue and #BadWindow errors.

        The server may retain the recent history of the pointer motion and do so to a finer granularity than is reported by #MotionNotify events. The
        #XGetMotionEvents() function makes this history available.
        """,

        DISPLAY,
        Window("w", "specifies the window the event is to be sent to"),
        Bool("propagate", "specifies a {@code Boolean} value"),
        long("event_mask", "specifies the event mask"),
        XEvent.p("event_send", "specifies the event that is to be sent")
    )

    unsigned_long(
        "XDisplayMotionBufferSize",
        "",

        DISPLAY
    )

    XTimeCoord.p(
        "XGetMotionEvents",
        """
        The {@code XGetMotionEvents} function returns all events in the motion history buffer that fall between the specified start and stop times, inclusive,
        and that have coordinates that lie within the specified window (including its borders) at its present placement.
        
        If the server does not support motion history, if the start time is later than the stop time, or if the start time is in the future, no events are
        returned; {@code XGetMotionEvents} returns #NULL. If the stop time is in the future, it is equivalent to specifying #CurrentTime.
        {@code XGetMotionEvents} can generate a #BadWindow error.
        """,

        DISPLAY,
        Window("w" ,""),
        Time("start", ""),
        Time("stop", ""),
        AutoSizeResult..Check(1)..int.p("nevents_return", "")
    )

    Bool(
        "XTranslateCoordinates",
        """
        Translates window coordinates.
        
        If {@code XTranslateCoordinates} returns #True, it takes the {@code src_x} and {@code src_y} coordinates relative to the source window's origin and
        returns these coordinates to {@code dest_x_return} and {@code dest_y_return} relative to the destination window's origin. If
        {@code XTranslateCoordinates} returns #False, {@code src_w} and {@code dest_w} are on different screens, and {@code dest_x_return} and
        {@code dest_y_return} are zero. If the coordinates are contained in a mapped child of {@code dest_w}, that child is returned to {@code child_return}.
        Otherwise, {@code child_return} is set to #None.

        {@code XTranslateCoordinates} can generate a #BadWindow error.
        """,

        DISPLAY,
        Window("src_w", "specifies the source window"),
        Window("dest_w", "specifies the destination window"),
        int("src_x", "specifies the x coordinate within the source window"),
        int("src_y", "specifies the x coordinate within the source window"),
        Check(1)..int.p("dest_x_return", "returns the x coordinate within the destination window"),
        Check(1)..int.p("dest_y_return", "returns the y coordinate within the destination window"),
        Check(1)..Window.p("child_return", "returns the child if the coordinates are contained in a mapped child of the destination window")
    )
}