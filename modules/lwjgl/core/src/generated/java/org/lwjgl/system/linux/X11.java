/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to libX11. */
public class X11 {

    private static final SharedLibrary X11 = Library.loadNative(X11.class, "org.lwjgl", null, "libX11.so.6", "libX11.so");

    /** Contains the function pointers loaded from the X11 {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            XOpenDisplay             = apiGetFunctionAddress(X11, "XOpenDisplay"),
            XCloseDisplay            = apiGetFunctionAddress(X11, "XCloseDisplay"),
            XDefaultScreen           = apiGetFunctionAddress(X11, "XDefaultScreen"),
            XRootWindow              = apiGetFunctionAddress(X11, "XRootWindow"),
            XCreateColormap          = apiGetFunctionAddress(X11, "XCreateColormap"),
            XFreeColormap            = apiGetFunctionAddress(X11, "XFreeColormap"),
            XCreateWindow            = apiGetFunctionAddress(X11, "XCreateWindow"),
            XDestroyWindow           = apiGetFunctionAddress(X11, "XDestroyWindow"),
            XFree                    = apiGetFunctionAddress(X11, "XFree"),
            XSendEvent               = apiGetFunctionAddress(X11, "XSendEvent"),
            XDisplayMotionBufferSize = apiGetFunctionAddress(X11, "XDisplayMotionBufferSize"),
            XGetMotionEvents         = apiGetFunctionAddress(X11, "XGetMotionEvents"),
            XTranslateCoordinates    = apiGetFunctionAddress(X11, "XTranslateCoordinates");

    }

    /** Returns the X11 {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return X11;
    }

    /** Boolean values */
    public static final int
        True  = 1,
        False = 0;

    /** RESERVED RESOURCE AND CONSTANT DEFINITIONS */
    public static final int
        None            = 0,
        ParentRelative  = 1,
        CopyFromParent  = 0,
        PointerWindow   = 0,
        InputFocus      = 1,
        PointerRoot     = 1,
        AnyPropertyType = 0,
        AnyKey          = 0,
        AnyButton       = 0,
        AllTemporary    = 0,
        CurrentTime     = 0,
        NoSymbol        = 0;

    /** ERROR CODES */
    public static final int
        Success             = 0,
        BadRequest          = 1,
        BadValue            = 2,
        BadWindow           = 3,
        BadPixmap           = 4,
        BadAtom             = 5,
        BadCursor           = 6,
        BadFont             = 7,
        BadMatch            = 8,
        BadDrawable         = 9,
        BadAccess           = 10,
        BadAlloc            = 11,
        BadColor            = 12,
        BadGC               = 13,
        BadIDChoice         = 14,
        BadName             = 15,
        BadLength           = 16,
        BadImplementation   = 17,
        FirstExtensionError = 128,
        LastExtensionError  = 255;

    /** Window attributes for CreateWindow and ChangeWindowAttributes */
    public static final int
        CWBackPixmap       = 1 << 0,
        CWBackPixel        = 1 << 1,
        CWBorderPixmap     = 1 << 2,
        CWBorderPixel      = 1 << 3,
        CWBitGravity       = 1 << 4,
        CWWinGravity       = 1 << 5,
        CWBackingStore     = 1 << 6,
        CWBackingPlanes    = 1 << 7,
        CWBackingPixel     = 1 << 8,
        CWOverrideRedirect = 1 << 9,
        CWSaveUnder        = 1 << 10,
        CWEventMask        = 1 << 11,
        CWDontPropagate    = 1 << 12,
        CWColormap         = 1 << 13,
        CWCursor           = 1 << 14;

    /** Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names. */
    public static final int
        NoEventMask              = 0,
        KeyPressMask             = 1 << 0,
        KeyReleaseMask           = 1 << 1,
        ButtonPressMask          = 1 << 2,
        ButtonReleaseMask        = 1 << 3,
        EnterWindowMask          = 1 << 4,
        LeaveWindowMask          = 1 << 5,
        PointerMotionMask        = 1 << 6,
        PointerMotionHintMask    = 1 << 7,
        Button1MotionMask        = 1 << 8,
        Button2MotionMask        = 1 << 9,
        Button3MotionMask        = 1 << 10,
        Button4MotionMask        = 1 << 11,
        Button5MotionMask        = 1 << 12,
        ButtonMotionMask         = 1 << 13,
        KeymapStateMask          = 1 << 14,
        ExposureMask             = 1 << 15,
        VisibilityChangeMask     = 1 << 16,
        StructureNotifyMask      = 1 << 17,
        ResizeRedirectMask       = 1 << 18,
        SubstructureNotifyMask   = 1 << 19,
        SubstructureRedirectMask = 1 << 20,
        FocusChangeMask          = 1 << 21,
        PropertyChangeMask       = 1 << 22,
        ColormapChangeMask       = 1 << 23,
        OwnerGrabButtonMask      = 1 << 24;

    /**
     * Event names. Used in "type" field in {@code XEvent} structures. Not to be confused with event masks above. They start from 2 because 0 and 1 are reserved in
     * the protocol for errors and replies.
     */
    public static final int
        KeyPress         = 2,
        KeyRelease       = 3,
        ButtonPress      = 4,
        ButtonRelease    = 5,
        MotionNotify     = 6,
        EnterNotify      = 7,
        LeaveNotify      = 8,
        FocusIn          = 9,
        FocusOut         = 10,
        KeymapNotify     = 11,
        Expose           = 12,
        GraphicsExpose   = 13,
        NoExpose         = 14,
        VisibilityNotify = 15,
        CreateNotify     = 16,
        DestroyNotify    = 17,
        UnmapNotify      = 18,
        MapNotify        = 19,
        MapRequest       = 20,
        ReparentNotify   = 21,
        ConfigureNotify  = 22,
        ConfigureRequest = 23,
        GravityNotify    = 24,
        ResizeRequest    = 25,
        CirculateNotify  = 26,
        CirculateRequest = 27,
        PropertyNotify   = 28,
        SelectionClear   = 29,
        SelectionRequest = 30,
        SelectionNotify  = 31,
        ColormapNotify   = 32,
        ClientMessage    = 33,
        MappingNotify    = 34,
        GenericEvent     = 35,
        LASTEvent        = 36;

    /** Key masks. Used as modifiers to GrabButton and GrabKey, results of QueryPointer, state in various key-, mouse-, and button-related events. */
    public static final int
        ShiftMask   = 1<<0,
        LockMask    = 1<<1,
        ControlMask = 1<<2,
        Mod1Mask    = 1<<3,
        Mod2Mask    = 1<<4,
        Mod3Mask    = 1<<5,
        Mod4Mask    = 1<<6,
        Mod5Mask    = 1<<7;

    /** modifier names. Used to build a SetModifierMapping request or to read a GetModifierMapping request. These correspond to the masks defined above. */
    public static final int
        ShiftMapIndex   = 0,
        LockMapIndex    = 1,
        ControlMapIndex = 2,
        Mod1MapIndex    = 3,
        Mod2MapIndex    = 4,
        Mod3MapIndex    = 5,
        Mod4MapIndex    = 6,
        Mod5MapIndex    = 7;

    /** button masks. Used in same manner as Key masks above. Not to be confused with button names below. */
    public static final int
        Button1Mask = 1<<8,
        Button2Mask = 1<<9,
        Button3Mask = 1<<10,
        Button4Mask = 1<<11,
        Button5Mask = 1<<12,
        AnyModifier = 1<<15;

    /**
     * button names. Used as arguments to GrabButton and as detail in ButtonPress and ButtonRelease events. Not to be confused with button masks above. Note
     * that 0 is already defined above as "AnyButton".
     */
    public static final int
        Button1 = 1,
        Button2 = 2,
        Button3 = 3,
        Button4 = 4,
        Button5 = 5;

    /** Notify modes */
    public static final int
        NotifyNormal       = 0,
        NotifyGrab         = 1,
        NotifyUngrab       = 2,
        NotifyWhileGrabbed = 3,
        NotifyHint         = 1;

    /** Notify detail */
    public static final int
        NotifyAncestor         = 0,
        NotifyVirtual          = 1,
        NotifyInferior         = 2,
        NotifyNonlinear        = 3,
        NotifyNonlinearVirtual = 4,
        NotifyPointer          = 5,
        NotifyPointerRoot      = 6,
        NotifyDetailNone       = 7;

    /** Visibility notify */
    public static final int
        VisibilityUnobscured        = 0,
        VisibilityPartiallyObscured = 1,
        VisibilityFullyObscured     = 2;

    /** Circulation request */
    public static final int
        PlaceOnTop    = 0,
        PlaceOnBottom = 1;

    /** Property notification */
    public static final int
        PropertyNewValue = 0,
        PropertyDelete   = 1;

    /** Color Map notification */
    public static final int
        ColormapUninstalled = 0,
        ColormapInstalled   = 1;

    /** GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes */
    public static final int
        GrabModeSync  = 0,
        GrabModeAsync = 1;

    /** GrabPointer, GrabKeyboard reply status */
    public static final int
        GrabSuccess     = 0,
        AlreadyGrabbed  = 1,
        GrabInvalidTime = 2,
        GrabNotViewable = 3,
        GrabFrozen      = 4;

    /** AllowEvents modes */
    public static final int
        AsyncPointer   = 0,
        SyncPointer    = 1,
        ReplayPointer  = 2,
        AsyncKeyboard  = 3,
        SyncKeyboard   = 4,
        ReplayKeyboard = 5,
        AsyncBoth      = 6,
        SyncBoth       = 7;

    /** For {@link #XCreateColormap}. */
    public static final int
        AllocNone = 0,
        AllocAll  = 1;

    /** Used in XSetInputFocus(), XGetInputFocus(). */
    public static final int
        RevertToNone        = None,
        RevertToPointerRoot = PointerRoot,
        RevertToParent      = 2;

    /** Window classes used by {@link #XCreateWindow}. */
    public static final int
        InputOutput = 1,
        InputOnly   = 2;

    /** SCREEN SAVER STUFF */
    public static final int
        DontPreferBlanking    = 0,
        PreferBlanking        = 1,
        DefaultBlanking       = 2,
        DisableScreenSaver    = 0,
        DisableScreenInterval = 0,
        DontAllowExposures    = 0,
        AllowExposures        = 1,
        DefaultExposures      = 2,
        ScreenSaverReset      = 0,
        ScreenSaverActive     = 1;

    /** Property modes */
    public static final int
        PropModeReplace = 0,
        PropModePrepend = 1,
        PropModeAppend  = 2;

    /** graphics functions, as in GC.alu */
    public static final int
        GXclear        = 0x0,
        GXand          = 0x1,
        GXandReverse   = 0x2,
        GXcopy         = 0x3,
        GXandInverted  = 0x4,
        GXnoop         = 0x5,
        GXxor          = 0x6,
        GXor           = 0x7,
        GXnor          = 0x8,
        GXequiv        = 0x9,
        GXinvert       = 0xA,
        GXorReverse    = 0xB,
        GXcopyInverted = 0xC,
        GXorInverted   = 0xD,
        GXnand         = 0xE,
        GXset          = 0xF;

    /** LineStyle */
    public static final int
        LineSolid      = 0,
        LineOnOffDash  = 1,
        LineDoubleDash = 2;

    /** capStyle */
    public static final int
        CapNotLast    = 0,
        CapButt       = 1,
        CapRound      = 2,
        CapProjecting = 3;

    /** joinStyle */
    public static final int
        JoinMiter = 0,
        JoinRound = 1,
        JoinBevel = 2;

    /** fillStyle */
    public static final int
        FillSolid          = 0,
        FillTiled          = 1,
        FillStippled       = 2,
        FillOpaqueStippled = 3;

    /** fillRule */
    public static final int
        EvenOddRule = 0,
        WindingRule = 1;

    /** subwindow mode */
    public static final int
        ClipByChildren   = 0,
        IncludeInferiors = 1;

    /** SetClipRectangles ordering */
    public static final int
        Unsorted = 0,
        YSorted  = 1,
        YXSorted = 2,
        YXBanded = 3;

    /** CoordinateMode for drawing routines */
    public static final int
        CoordModeOrigin   = 0,
        CoordModePrevious = 1;

    /** Polygon shapes */
    public static final int
        Complex   = 0,
        Nonconvex = 1,
        Convex    = 2;

    /** Arc modes for PolyFillArc */
    public static final int
        ArcChord    = 0,
        ArcPieSlice = 1;

    /** GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges */
    public static final int
        GCFunction          = 1<<0,
        GCPlaneMask         = 1<<1,
        GCForeground        = 1<<2,
        GCBackground        = 1<<3,
        GCLineWidth         = 1<<4,
        GCLineStyle         = 1<<5,
        GCCapStyle          = 1<<6,
        GCJoinStyle         = 1<<7,
        GCFillStyle         = 1<<8,
        GCFillRule          = 1<<9,
        GCTile              = 1<<10,
        GCStipple           = 1<<11,
        GCTileStipXOrigin   = 1<<12,
        GCTileStipYOrigin   = 1<<13,
        GCFont              = 1<<14,
        GCSubwindowMode     = 1<<15,
        GCGraphicsExposures = 1<<16,
        GCClipXOrigin       = 1<<17,
        GCClipYOrigin       = 1<<18,
        GCClipMask          = 1<<19,
        GCDashOffset        = 1<<20,
        GCDashList          = 1<<21,
        GCArcMode           = 1<<22,
        GCLastBit           = 22;

    public static final int
        Above    = 0,
        Below    = 1,
        TopIf    = 2,
        BottomIf = 3,
        Opposite = 4;

    public static final int
        MappingModifier = 0,
        MappingKeyboard = 1,
        MappingPointer  = 2;

    protected X11() {
        throw new UnsupportedOperationException();
    }

    // --- [ XOpenDisplay ] ---

    /** Unsafe version of: {@link #XOpenDisplay} */
    public static long nXOpenDisplay(long display_name) {
        long __functionAddress = Functions.XOpenDisplay;
        return invokePP(display_name, __functionAddress);
    }

    /**
     * Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
     * connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
     * If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
     * If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
     * (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
     * mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
     *
     * @param display_name the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
     *                     {@code display_name} is {@code NULL}, it defaults to the value of the DISPLAY environment variable.
     */
    @NativeType("Display *")
    public static long XOpenDisplay(@Nullable @NativeType("char const *") ByteBuffer display_name) {
        if (CHECKS) {
            checkNT1Safe(display_name);
        }
        return nXOpenDisplay(memAddressSafe(display_name));
    }

    /**
     * Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
     * connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
     * If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
     * If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
     * (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
     * mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
     *
     * @param display_name the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
     *                     {@code display_name} is {@code NULL}, it defaults to the value of the DISPLAY environment variable.
     */
    @NativeType("Display *")
    public static long XOpenDisplay(@Nullable @NativeType("char const *") CharSequence display_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(display_name, true);
            long display_nameEncoded = display_name == null ? NULL : stack.getPointerAddress();
            return nXOpenDisplay(display_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ XCloseDisplay ] ---

    /**
     * Closes the connection to the X server for the display specified in the {@code Display} structure and destroys all windows, resource IDs (Window, Font,
     * Pixmap, Colormap, Cursor, and GContext), or other resources that the client has created on this display, unless the close-down mode of the resource has
     * been changed (see {@code XSetCloseDownMode()}). Therefore, these windows, resource IDs, and other resources should never be referenced again or an error will
     * be generated. Before exiting, you should call {@code XCloseDisplay()} explicitly so that any pending errors are reported as {@code XCloseDisplay()}
     * performs a final {@code XSync()} operation.
     *
     * @param display the connection to the X server
     */
    public static void XCloseDisplay(@NativeType("Display *") long display) {
        long __functionAddress = Functions.XCloseDisplay;
        if (CHECKS) {
            check(display);
        }
        invokePV(display, __functionAddress);
    }

    // --- [ XDefaultScreen ] ---

    /**
     * Returns a pointer to the default screen.
     *
     * @param display the connection to the X server
     */
    public static int XDefaultScreen(@NativeType("Display *") long display) {
        long __functionAddress = Functions.XDefaultScreen;
        if (CHECKS) {
            check(display);
        }
        return invokePI(display, __functionAddress);
    }

    // --- [ XRootWindow ] ---

    /**
     * Returns the root window of the specified screen.
     *
     * @param display       the connection to the X server
     * @param screen_number the appropriate screen number on the host server
     */
    @NativeType("Window")
    public static long XRootWindow(@NativeType("Display *") long display, int screen_number) {
        long __functionAddress = Functions.XRootWindow;
        if (CHECKS) {
            check(display);
        }
        return invokePN(display, screen_number, __functionAddress);
    }

    // --- [ XCreateColormap ] ---

    /** Unsafe version of: {@link #XCreateColormap} */
    public static long nXCreateColormap(long display, long w, long visual, int alloc) {
        long __functionAddress = Functions.XCreateColormap;
        if (CHECKS) {
            check(display);
        }
        return invokePNPN(display, w, visual, alloc, __functionAddress);
    }

    /**
     * Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
     * Note that the specified window is only used to determine the screen.
     *
     * @param display the connection to the X server
     * @param w       the window
     * @param visual  a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results.
     * @param alloc   the colormap entries to be allocated. You can pass AllocNone or AllocAll.
     */
    @NativeType("Colormap")
    public static long XCreateColormap(@NativeType("Display *") long display, @NativeType("Window") long w, @NativeType("Visual *") Visual visual, int alloc) {
        return nXCreateColormap(display, w, visual.address(), alloc);
    }

    // --- [ XFreeColormap ] ---

    /**
     * Deletes the association between the {@code colormap} resource ID and the {@code colormap} and frees the {@code colormap} storage. However, this function
     * has no effect on the default colormap for a screen. If the specified {@code colormap} is an installed map for a screen, it is uninstalled. If the
     * specified {@code colormap} is defined as the {@code colormap} for a window, {@code XFreeColormap()} changes the colormap associated with the window to
     * {@link #None} and generates a {@code ColormapNotify} event. X does not define the colors displayed for a window with a colormap of {@link #None}.
     *
     * @param display  the connection to the X server
     * @param colormap the colormap to destroy
     */
    public static int XFreeColormap(@NativeType("Display *") long display, @NativeType("Colormap") long colormap) {
        long __functionAddress = Functions.XFreeColormap;
        if (CHECKS) {
            check(display);
        }
        return invokePNI(display, colormap, __functionAddress);
    }

    // --- [ XCreateWindow ] ---

    /** Unsafe version of: {@link #XCreateWindow} */
    public static long nXCreateWindow(long display, long parent, int x, int y, int width, int height, int border_width, int depth, int windowClass, long visual, long valuemask, long attributes) {
        long __functionAddress = Functions.XCreateWindow;
        if (CHECKS) {
            check(display);
        }
        return invokePNPNPN(display, parent, x, y, width, height, border_width, depth, windowClass, visual, valuemask, attributes, __functionAddress);
    }

    /**
     * Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
     * {@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.
     * 
     * <p>The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
     * terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
     * the inside, upper-left corner.</p>
     * 
     * <p>The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.</p>
     * 
     * <p>The width and height are the created window's inside dimensions and do not include the created window's borders.</p>
     *
     * @param display      the connection to the X server
     * @param parent       the parent window
     * @param x            the window x-coordinate
     * @param y            the window y-coordinate
     * @param width        the window width
     * @param height       the window height
     * @param border_width the border width
     * @param depth        the window's depth. A depth of {@link #CopyFromParent} means the depth is taken from the parent.
     * @param windowClass  the created window's class. One of:<br><table><tr><td>{@link #InputOutput}</td><td>{@link #InputOnly}</td><td>{@link #CopyFromParent}</td></tr></table>
     * @param visual       the visual type. A visual of {@link #CopyFromParent} means the visual type is taken from the parent.
     * @param valuemask    which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
     *                     {@code valuemask} is zero, the attributes are ignored and are not referenced.
     * @param attributes   the structure from which the values (as specified by the value mask) are to be taken
     */
    @NativeType("Window")
    public static long XCreateWindow(@NativeType("Display *") long display, @NativeType("Window") long parent, int x, int y, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("unsigned int") int border_width, int depth, @NativeType("unsigned int") int windowClass, @NativeType("Visual *") Visual visual, @NativeType("unsigned long") long valuemask, @NativeType("XSetWindowAttributes *") XSetWindowAttributes attributes) {
        return nXCreateWindow(display, parent, x, y, width, height, border_width, depth, windowClass, visual.address(), valuemask, attributes.address());
    }

    // --- [ XDestroyWindow ] ---

    /**
     * Destroys the specified window as well as all of its subwindows and causes the X server to generate a {@code DestroyNotify} event for each window. The
     * window should never be referenced again. If the window specified by the {@code w} argument is mapped, it is unmapped automatically. The ordering of the
     * {@code DestroyNotify} events is such that for any given window being destroyed, {@code DestroyNotify} is generated on any inferiors of the window before
     * being generated on the window itself. The ordering among siblings and across subhierarchies is not otherwise constrained. If the window you specified is
     * a root window, no windows are destroyed. Destroying a mapped window will generate {@code Expose} events on other windows that were obscured by the
     * window being destroyed.
     *
     * @param display the connection to the X server
     * @param w       the window
     */
    public static int XDestroyWindow(@NativeType("Display *") long display, @NativeType("Window") long w) {
        long __functionAddress = Functions.XDestroyWindow;
        if (CHECKS) {
            check(display);
        }
        return invokePNI(display, w, __functionAddress);
    }

    // --- [ XFree ] ---

    /** Unsafe version of: {@link #XFree} */
    public static int nXFree(long data) {
        long __functionAddress = Functions.XFree;
        return invokePI(data, __functionAddress);
    }

    /**
     * Free in-memory data that was created by an Xlib function.
     *
     * @param data the data that is to be freed
     */
    public static int XFree(@NativeType("void *") ByteBuffer data) {
        return nXFree(memAddress(data));
    }

    /**
     * Free in-memory data that was created by an Xlib function.
     *
     * @param data the data that is to be freed
     */
    public static int XFree(@NativeType("void *") PointerBuffer data) {
        return nXFree(memAddress(data));
    }

    // --- [ XSendEvent ] ---

    /** Unsafe version of: {@link #XSendEvent} */
    public static int nXSendEvent(long display, long w, int propagate, long event_mask, long event_send) {
        long __functionAddress = Functions.XSendEvent;
        if (CHECKS) {
            check(display);
        }
        return invokePNNPI(display, w, propagate, event_mask, event_send, __functionAddress);
    }

    /**
     * The {@code XSendEvent} function identifies the destination window, determines which clients should receive the specified events, and ignores any active
     * grabs. This function requires you to pass an event mask. This function uses the {@code w} argument to identify the destination window as follows:
     * 
     * <ul>
     * <li>If {@code w} is {@code PointerWindow}, the destination window is the window that contains the pointer.</li>
     * <li>If {@code w} is {@code InputFocus} and if the focus window contains the pointer, the destination window is the window that contains the pointer;
     * otherwise, the destination window is the focus window.</li>
     * </ul>
     * 
     * <p>To determine which clients should receive the specified events, {@code XSendEvent} uses the propagate argument as follows:</p>
     * 
     * <ul>
     * <li>If {@code event_mask} is the empty set, the event is sent to the client that created the destination window. If that client no longer exists, no
     * event is sent.</li>
     * <li>If {@code propagate} is {@link #False}, the event is sent to every client selecting on destination any of the event types in the {@code event_mask}
     * argument.</li>
     * <li>If {@code propagate} is {@link #True} and no clients have selected on destination any of the event types in event-mask, the destination is replaced with
     * the closest ancestor of destination for which some client has selected a type in event-mask and for which no intervening window has that type in
     * its do-not-propagate-mask. If no such window exists or if the window is an ancestor of the focus window and {@link #InputFocus} was originally specified as
     * the destination, the event is not sent to any clients. Otherwise, the event is reported to every client selecting on the final destination any of
     * the types specified in {@code event_mask}.</li>
     * </ul>
     * 
     * <p>The event in the {@code XEvent} structure must be one of the core events or one of the events defined by an extension (or a {@link #BadValue} error results) so
     * that the X server can correctly byte-swap the contents as necessary. The contents of the event are otherwise unaltered and unchecked by the X server
     * except to force {@code send_event} to {@link #True} in the forwarded event and to set the serial number in the event correctly; therefore these fields and the
     * display field are ignored by {@code XSendEvent}.</p>
     * 
     * <p>{@code XSendEvent} returns zero if the conversion to wire protocol format failed and returns nonzero otherwise. {@code XSendEvent} can generate
     * {@link #BadValue} and {@link #BadWindow} errors.</p>
     * 
     * <p>The server may retain the recent history of the pointer motion and do so to a finer granularity than is reported by {@link #MotionNotify} events. The
     * {@link #XGetMotionEvents} function makes this history available.</p>
     *
     * @param display    the connection to the X server
     * @param w          specifies the window the event is to be sent to
     * @param propagate  specifies a {@code Boolean} value
     * @param event_mask specifies the event mask
     * @param event_send specifies the event that is to be sent
     */
    @NativeType("Status")
    public static int XSendEvent(@NativeType("Display *") long display, @NativeType("Window") long w, @NativeType("Bool") boolean propagate, long event_mask, @NativeType("XEvent *") XEvent event_send) {
        return nXSendEvent(display, w, propagate ? 1 : 0, event_mask, event_send.address());
    }

    // --- [ XDisplayMotionBufferSize ] ---

    /** @param display the connection to the X server */
    @NativeType("unsigned long")
    public static long XDisplayMotionBufferSize(@NativeType("Display *") long display) {
        long __functionAddress = Functions.XDisplayMotionBufferSize;
        if (CHECKS) {
            check(display);
        }
        return invokePN(display, __functionAddress);
    }

    // --- [ XGetMotionEvents ] ---

    /** Unsafe version of: {@link #XGetMotionEvents} */
    public static long nXGetMotionEvents(long display, long w, long start, long stop, long nevents_return) {
        long __functionAddress = Functions.XGetMotionEvents;
        if (CHECKS) {
            check(display);
        }
        return invokePNNNPP(display, w, start, stop, nevents_return, __functionAddress);
    }

    /**
     * The {@code XGetMotionEvents} function returns all events in the motion history buffer that fall between the specified start and stop times, inclusive,
     * and that have coordinates that lie within the specified window (including its borders) at its present placement.
     * 
     * <p>If the server does not support motion history, if the start time is later than the stop time, or if the start time is in the future, no events are
     * returned; {@code XGetMotionEvents} returns {@code NULL}. If the stop time is in the future, it is equivalent to specifying {@link #CurrentTime}.
     * {@code XGetMotionEvents} can generate a {@link #BadWindow} error.</p>
     *
     * @param display the connection to the X server
     */
    @Nullable
    @NativeType("XTimeCoord *")
    public static XTimeCoord.Buffer XGetMotionEvents(@NativeType("Display *") long display, @NativeType("Window") long w, @NativeType("Time") long start, @NativeType("Time") long stop) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer nevents_return = stack.callocInt(1);
        try {
            long __result = nXGetMotionEvents(display, w, start, stop, memAddress(nevents_return));
            return XTimeCoord.createSafe(__result, nevents_return.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ XTranslateCoordinates ] ---

    /** Unsafe version of: {@link #XTranslateCoordinates} */
    public static int nXTranslateCoordinates(long display, long src_w, long dest_w, int src_x, int src_y, long dest_x_return, long dest_y_return, long child_return) {
        long __functionAddress = Functions.XTranslateCoordinates;
        if (CHECKS) {
            check(display);
        }
        return invokePNNPPPI(display, src_w, dest_w, src_x, src_y, dest_x_return, dest_y_return, child_return, __functionAddress);
    }

    /**
     * Translates window coordinates.
     * 
     * <p>If {@code XTranslateCoordinates} returns {@link #True}, it takes the {@code src_x} and {@code src_y} coordinates relative to the source window's origin and
     * returns these coordinates to {@code dest_x_return} and {@code dest_y_return} relative to the destination window's origin. If
     * {@code XTranslateCoordinates} returns {@link #False}, {@code src_w} and {@code dest_w} are on different screens, and {@code dest_x_return} and
     * {@code dest_y_return} are zero. If the coordinates are contained in a mapped child of {@code dest_w}, that child is returned to {@code child_return}.
     * Otherwise, {@code child_return} is set to {@link #None}.</p>
     * 
     * <p>{@code XTranslateCoordinates} can generate a {@link #BadWindow} error.</p>
     *
     * @param display       the connection to the X server
     * @param src_w         specifies the source window
     * @param dest_w        specifies the destination window
     * @param src_x         specifies the x coordinate within the source window
     * @param src_y         specifies the x coordinate within the source window
     * @param dest_x_return returns the x coordinate within the destination window
     * @param dest_y_return returns the y coordinate within the destination window
     * @param child_return  returns the child if the coordinates are contained in a mapped child of the destination window
     */
    @NativeType("Bool")
    public static boolean XTranslateCoordinates(@NativeType("Display *") long display, @NativeType("Window") long src_w, @NativeType("Window") long dest_w, int src_x, int src_y, @NativeType("int *") IntBuffer dest_x_return, @NativeType("int *") IntBuffer dest_y_return, @NativeType("Window *") CLongBuffer child_return) {
        if (CHECKS) {
            check(dest_x_return, 1);
            check(dest_y_return, 1);
            check(child_return, 1);
        }
        return nXTranslateCoordinates(display, src_w, dest_w, src_x, src_y, memAddress(dest_x_return), memAddress(dest_y_return), memAddress(child_return)) != 0;
    }

    /** Array version of: {@link #XTranslateCoordinates} */
    @NativeType("Bool")
    public static boolean XTranslateCoordinates(@NativeType("Display *") long display, @NativeType("Window") long src_w, @NativeType("Window") long dest_w, int src_x, int src_y, @NativeType("int *") int[] dest_x_return, @NativeType("int *") int[] dest_y_return, @NativeType("Window *") CLongBuffer child_return) {
        long __functionAddress = Functions.XTranslateCoordinates;
        if (CHECKS) {
            check(display);
            check(dest_x_return, 1);
            check(dest_y_return, 1);
            check(child_return, 1);
        }
        return invokePNNPPPI(display, src_w, dest_w, src_x, src_y, dest_x_return, dest_y_return, memAddress(child_return), __functionAddress) != 0;
    }

}