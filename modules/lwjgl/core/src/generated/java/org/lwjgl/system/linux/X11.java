/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    public static final int
        True  = 1,
        False = 0;

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

    public static final int
        ShiftMask   = 1<<0,
        LockMask    = 1<<1,
        ControlMask = 1<<2,
        Mod1Mask    = 1<<3,
        Mod2Mask    = 1<<4,
        Mod3Mask    = 1<<5,
        Mod4Mask    = 1<<6,
        Mod5Mask    = 1<<7;

    public static final int
        ShiftMapIndex   = 0,
        LockMapIndex    = 1,
        ControlMapIndex = 2,
        Mod1MapIndex    = 3,
        Mod2MapIndex    = 4,
        Mod3MapIndex    = 5,
        Mod4MapIndex    = 6,
        Mod5MapIndex    = 7;

    public static final int
        Button1Mask = 1<<8,
        Button2Mask = 1<<9,
        Button3Mask = 1<<10,
        Button4Mask = 1<<11,
        Button5Mask = 1<<12,
        AnyModifier = 1<<15;

    public static final int
        Button1 = 1,
        Button2 = 2,
        Button3 = 3,
        Button4 = 4,
        Button5 = 5;

    public static final int
        NotifyNormal       = 0,
        NotifyGrab         = 1,
        NotifyUngrab       = 2,
        NotifyWhileGrabbed = 3,
        NotifyHint         = 1;

    public static final int
        NotifyAncestor         = 0,
        NotifyVirtual          = 1,
        NotifyInferior         = 2,
        NotifyNonlinear        = 3,
        NotifyNonlinearVirtual = 4,
        NotifyPointer          = 5,
        NotifyPointerRoot      = 6,
        NotifyDetailNone       = 7;

    public static final int
        VisibilityUnobscured        = 0,
        VisibilityPartiallyObscured = 1,
        VisibilityFullyObscured     = 2;

    public static final int
        PlaceOnTop    = 0,
        PlaceOnBottom = 1;

    public static final int
        PropertyNewValue = 0,
        PropertyDelete   = 1;

    public static final int
        ColormapUninstalled = 0,
        ColormapInstalled   = 1;

    public static final int
        GrabModeSync  = 0,
        GrabModeAsync = 1;

    public static final int
        GrabSuccess     = 0,
        AlreadyGrabbed  = 1,
        GrabInvalidTime = 2,
        GrabNotViewable = 3,
        GrabFrozen      = 4;

    public static final int
        AsyncPointer   = 0,
        SyncPointer    = 1,
        ReplayPointer  = 2,
        AsyncKeyboard  = 3,
        SyncKeyboard   = 4,
        ReplayKeyboard = 5,
        AsyncBoth      = 6,
        SyncBoth       = 7;

    public static final int
        AllocNone = 0,
        AllocAll  = 1;

    public static final int
        RevertToNone        = None,
        RevertToPointerRoot = PointerRoot,
        RevertToParent      = 2;

    public static final int
        InputOutput = 1,
        InputOnly   = 2;

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

    public static final int
        PropModeReplace = 0,
        PropModePrepend = 1,
        PropModeAppend  = 2;

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

    public static final int
        LineSolid      = 0,
        LineOnOffDash  = 1,
        LineDoubleDash = 2;

    public static final int
        CapNotLast    = 0,
        CapButt       = 1,
        CapRound      = 2,
        CapProjecting = 3;

    public static final int
        JoinMiter = 0,
        JoinRound = 1,
        JoinBevel = 2;

    public static final int
        FillSolid          = 0,
        FillTiled          = 1,
        FillStippled       = 2,
        FillOpaqueStippled = 3;

    public static final int
        EvenOddRule = 0,
        WindingRule = 1;

    public static final int
        ClipByChildren   = 0,
        IncludeInferiors = 1;

    public static final int
        Unsorted = 0,
        YSorted  = 1,
        YXSorted = 2,
        YXBanded = 3;

    public static final int
        CoordModeOrigin   = 0,
        CoordModePrevious = 1;

    public static final int
        Complex   = 0,
        Nonconvex = 1,
        Convex    = 2;

    public static final int
        ArcChord    = 0,
        ArcPieSlice = 1;

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

    /** {@code Display * XOpenDisplay(char const * display_name)} */
    public static long nXOpenDisplay(long display_name) {
        long __functionAddress = Functions.XOpenDisplay;
        return invokePP(display_name, __functionAddress);
    }

    /** {@code Display * XOpenDisplay(char const * display_name)} */
    @NativeType("Display *")
    public static long XOpenDisplay(@NativeType("char const *") @Nullable ByteBuffer display_name) {
        if (CHECKS) {
            checkNT1Safe(display_name);
        }
        return nXOpenDisplay(memAddressSafe(display_name));
    }

    /** {@code Display * XOpenDisplay(char const * display_name)} */
    @NativeType("Display *")
    public static long XOpenDisplay(@NativeType("char const *") @Nullable CharSequence display_name) {
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

    /** {@code void XCloseDisplay(Display * display)} */
    public static void XCloseDisplay(@NativeType("Display *") long display) {
        long __functionAddress = Functions.XCloseDisplay;
        if (CHECKS) {
            check(display);
        }
        invokePV(display, __functionAddress);
    }

    // --- [ XDefaultScreen ] ---

    /** {@code int XDefaultScreen(Display * display)} */
    public static int XDefaultScreen(@NativeType("Display *") long display) {
        long __functionAddress = Functions.XDefaultScreen;
        if (CHECKS) {
            check(display);
        }
        return invokePI(display, __functionAddress);
    }

    // --- [ XRootWindow ] ---

    /** {@code Window XRootWindow(Display * display, int screen_number)} */
    @NativeType("Window")
    public static long XRootWindow(@NativeType("Display *") long display, int screen_number) {
        long __functionAddress = Functions.XRootWindow;
        if (CHECKS) {
            check(display);
        }
        return invokePN(display, screen_number, __functionAddress);
    }

    // --- [ XCreateColormap ] ---

    /** {@code Colormap XCreateColormap(Display * display, Window w, Visual * visual, int alloc)} */
    public static long nXCreateColormap(long display, long w, long visual, int alloc) {
        long __functionAddress = Functions.XCreateColormap;
        if (CHECKS) {
            check(display);
        }
        return invokePNPN(display, w, visual, alloc, __functionAddress);
    }

    /** {@code Colormap XCreateColormap(Display * display, Window w, Visual * visual, int alloc)} */
    @NativeType("Colormap")
    public static long XCreateColormap(@NativeType("Display *") long display, @NativeType("Window") long w, @NativeType("Visual *") Visual visual, int alloc) {
        return nXCreateColormap(display, w, visual.address(), alloc);
    }

    // --- [ XFreeColormap ] ---

    /** {@code int XFreeColormap(Display * display, Colormap colormap)} */
    public static int XFreeColormap(@NativeType("Display *") long display, @NativeType("Colormap") long colormap) {
        long __functionAddress = Functions.XFreeColormap;
        if (CHECKS) {
            check(display);
        }
        return invokePNI(display, colormap, __functionAddress);
    }

    // --- [ XCreateWindow ] ---

    /** {@code Window XCreateWindow(Display * display, Window parent, int x, int y, unsigned int width, unsigned int height, unsigned int border_width, int depth, unsigned int windowClass, Visual * visual, unsigned long valuemask, XSetWindowAttributes * attributes)} */
    public static long nXCreateWindow(long display, long parent, int x, int y, int width, int height, int border_width, int depth, int windowClass, long visual, long valuemask, long attributes) {
        long __functionAddress = Functions.XCreateWindow;
        if (CHECKS) {
            check(display);
        }
        return invokePNPNPN(display, parent, x, y, width, height, border_width, depth, windowClass, visual, valuemask, attributes, __functionAddress);
    }

    /** {@code Window XCreateWindow(Display * display, Window parent, int x, int y, unsigned int width, unsigned int height, unsigned int border_width, int depth, unsigned int windowClass, Visual * visual, unsigned long valuemask, XSetWindowAttributes * attributes)} */
    @NativeType("Window")
    public static long XCreateWindow(@NativeType("Display *") long display, @NativeType("Window") long parent, int x, int y, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("unsigned int") int border_width, int depth, @NativeType("unsigned int") int windowClass, @NativeType("Visual *") Visual visual, @NativeType("unsigned long") long valuemask, @NativeType("XSetWindowAttributes *") XSetWindowAttributes attributes) {
        return nXCreateWindow(display, parent, x, y, width, height, border_width, depth, windowClass, visual.address(), valuemask, attributes.address());
    }

    // --- [ XDestroyWindow ] ---

    /** {@code int XDestroyWindow(Display * display, Window w)} */
    public static int XDestroyWindow(@NativeType("Display *") long display, @NativeType("Window") long w) {
        long __functionAddress = Functions.XDestroyWindow;
        if (CHECKS) {
            check(display);
        }
        return invokePNI(display, w, __functionAddress);
    }

    // --- [ XFree ] ---

    /** {@code int XFree(void * data)} */
    public static int nXFree(long data) {
        long __functionAddress = Functions.XFree;
        return invokePI(data, __functionAddress);
    }

    /** {@code int XFree(void * data)} */
    public static int XFree(@NativeType("void *") ByteBuffer data) {
        return nXFree(memAddress(data));
    }

    /** {@code int XFree(void * data)} */
    public static int XFree(@NativeType("void *") PointerBuffer data) {
        return nXFree(memAddress(data));
    }

    // --- [ XSendEvent ] ---

    /** {@code Status XSendEvent(Display * display, Window w, Bool propagate, long event_mask, XEvent * event_send)} */
    public static int nXSendEvent(long display, long w, int propagate, long event_mask, long event_send) {
        long __functionAddress = Functions.XSendEvent;
        if (CHECKS) {
            check(display);
        }
        return invokePNNPI(display, w, propagate, event_mask, event_send, __functionAddress);
    }

    /** {@code Status XSendEvent(Display * display, Window w, Bool propagate, long event_mask, XEvent * event_send)} */
    @NativeType("Status")
    public static int XSendEvent(@NativeType("Display *") long display, @NativeType("Window") long w, @NativeType("Bool") boolean propagate, long event_mask, @NativeType("XEvent *") XEvent event_send) {
        return nXSendEvent(display, w, propagate ? 1 : 0, event_mask, event_send.address());
    }

    // --- [ XDisplayMotionBufferSize ] ---

    /** {@code unsigned long XDisplayMotionBufferSize(Display * display)} */
    @NativeType("unsigned long")
    public static long XDisplayMotionBufferSize(@NativeType("Display *") long display) {
        long __functionAddress = Functions.XDisplayMotionBufferSize;
        if (CHECKS) {
            check(display);
        }
        return invokePN(display, __functionAddress);
    }

    // --- [ XGetMotionEvents ] ---

    /** {@code XTimeCoord * XGetMotionEvents(Display * display, Window w, Time start, Time stop, int * nevents_return)} */
    public static long nXGetMotionEvents(long display, long w, long start, long stop, long nevents_return) {
        long __functionAddress = Functions.XGetMotionEvents;
        if (CHECKS) {
            check(display);
        }
        return invokePNNNPP(display, w, start, stop, nevents_return, __functionAddress);
    }

    /** {@code XTimeCoord * XGetMotionEvents(Display * display, Window w, Time start, Time stop, int * nevents_return)} */
    @NativeType("XTimeCoord *")
    public static XTimeCoord.@Nullable Buffer XGetMotionEvents(@NativeType("Display *") long display, @NativeType("Window") long w, @NativeType("Time") long start, @NativeType("Time") long stop) {
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

    /** {@code Bool XTranslateCoordinates(Display * display, Window src_w, Window dest_w, int src_x, int src_y, int * dest_x_return, int * dest_y_return, Window * child_return)} */
    public static int nXTranslateCoordinates(long display, long src_w, long dest_w, int src_x, int src_y, long dest_x_return, long dest_y_return, long child_return) {
        long __functionAddress = Functions.XTranslateCoordinates;
        if (CHECKS) {
            check(display);
        }
        return invokePNNPPPI(display, src_w, dest_w, src_x, src_y, dest_x_return, dest_y_return, child_return, __functionAddress);
    }

    /** {@code Bool XTranslateCoordinates(Display * display, Window src_w, Window dest_w, int src_x, int src_y, int * dest_x_return, int * dest_y_return, Window * child_return)} */
    @NativeType("Bool")
    public static boolean XTranslateCoordinates(@NativeType("Display *") long display, @NativeType("Window") long src_w, @NativeType("Window") long dest_w, int src_x, int src_y, @NativeType("int *") IntBuffer dest_x_return, @NativeType("int *") IntBuffer dest_y_return, @NativeType("Window *") CLongBuffer child_return) {
        if (CHECKS) {
            check(dest_x_return, 1);
            check(dest_y_return, 1);
            check(child_return, 1);
        }
        return nXTranslateCoordinates(display, src_w, dest_w, src_x, src_y, memAddress(dest_x_return), memAddress(dest_y_return), memAddress(child_return)) != 0;
    }

    /** {@code Bool XTranslateCoordinates(Display * display, Window src_w, Window dest_w, int src_x, int src_y, int * dest_x_return, int * dest_y_return, Window * child_return)} */
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