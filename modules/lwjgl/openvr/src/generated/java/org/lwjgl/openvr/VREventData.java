/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VREvent_Data_t {
 *     {@link VREventReserved VREvent_Reserved_t} reserved;
 *     {@link VREventController VREvent_Controller_t} controller;
 *     {@link VREventMouse VREvent_Mouse_t} mouse;
 *     {@link VREventScroll VREvent_Scroll_t} scroll;
 *     {@link VREventProcess VREvent_Process_t} process;
 *     {@link VREventNotification VREvent_Notification_t} notification;
 *     {@link VREventOverlay VREvent_Overlay_t} overlay;
 *     {@link VREventStatus VREvent_Status_t} status;
 *     {@link VREventKeyboard VREvent_Keyboard_t} keyboard;
 *     {@link VREventIpd VREvent_Ipd_t} ipd;
 *     {@link VREventChaperone VREvent_Chaperone_t} chaperone;
 *     {@link VREventPerformanceTest VREvent_PerformanceTest_t} performanceTest;
 *     {@link VREventTouchPadMove VREvent_TouchPadMove_t} touchPadMove;
 *     {@link VREventSeatedZeroPoseReset VREvent_SeatedZeroPoseReset_t} seatedZeroPoseReset;
 *     {@link VREventScreenshot VREvent_Screenshot_t} screenshot;
 *     {@link VREventScreenshotProgress VREvent_ScreenshotProgress_t} screenshotProgress;
 *     {@link VREventApplicationLaunch VREvent_ApplicationLaunch_t} applicationLaunch;
 *     {@link VREventEditingCameraSurface VREvent_EditingCameraSurface_t} cameraSurface;
 *     {@link VREventMessageOverlay VREvent_MessageOverlay_t} messageOverlay;
 *     {@link VREventProperty VREvent_Property_t} property;
 *     {@link VREventHapticVibration VREvent_HapticVibration_t} hapticVibration;
 *     {@link VREventWebConsole VREvent_WebConsole_t} webConsole;
 *     {@link VREventInputBindingLoad VREvent_InputBindingLoad_t} inputBinding;
 *     {@link VREventInputActionManifestLoad VREvent_InputActionManifestLoad_t} actionManifest;
 *     {@link VREventSpatialAnchor VREvent_SpatialAnchor_t} spatialAnchor;
 * }</code></pre>
 */
@NativeType("union VREvent_Data_t")
public class VREventData extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED,
        CONTROLLER,
        MOUSE,
        SCROLL,
        PROCESS,
        NOTIFICATION,
        OVERLAY,
        STATUS,
        KEYBOARD,
        IPD,
        CHAPERONE,
        PERFORMANCETEST,
        TOUCHPADMOVE,
        SEATEDZEROPOSERESET,
        SCREENSHOT,
        SCREENSHOTPROGRESS,
        APPLICATIONLAUNCH,
        CAMERASURFACE,
        MESSAGEOVERLAY,
        PROPERTY,
        HAPTICVIBRATION,
        WEBCONSOLE,
        INPUTBINDING,
        ACTIONMANIFEST,
        SPATIALANCHOR;

    static {
        Layout layout = __union(
            __member(VREventReserved.SIZEOF, VREventReserved.ALIGNOF),
            __member(VREventController.SIZEOF, VREventController.ALIGNOF),
            __member(VREventMouse.SIZEOF, VREventMouse.ALIGNOF),
            __member(VREventScroll.SIZEOF, VREventScroll.ALIGNOF),
            __member(VREventProcess.SIZEOF, VREventProcess.ALIGNOF),
            __member(VREventNotification.SIZEOF, VREventNotification.ALIGNOF),
            __member(VREventOverlay.SIZEOF, VREventOverlay.ALIGNOF),
            __member(VREventStatus.SIZEOF, VREventStatus.ALIGNOF),
            __member(VREventKeyboard.SIZEOF, VREventKeyboard.ALIGNOF),
            __member(VREventIpd.SIZEOF, VREventIpd.ALIGNOF),
            __member(VREventChaperone.SIZEOF, VREventChaperone.ALIGNOF),
            __member(VREventPerformanceTest.SIZEOF, VREventPerformanceTest.ALIGNOF),
            __member(VREventTouchPadMove.SIZEOF, VREventTouchPadMove.ALIGNOF),
            __member(VREventSeatedZeroPoseReset.SIZEOF, VREventSeatedZeroPoseReset.ALIGNOF),
            __member(VREventScreenshot.SIZEOF, VREventScreenshot.ALIGNOF),
            __member(VREventScreenshotProgress.SIZEOF, VREventScreenshotProgress.ALIGNOF),
            __member(VREventApplicationLaunch.SIZEOF, VREventApplicationLaunch.ALIGNOF),
            __member(VREventEditingCameraSurface.SIZEOF, VREventEditingCameraSurface.ALIGNOF),
            __member(VREventMessageOverlay.SIZEOF, VREventMessageOverlay.ALIGNOF),
            __member(VREventProperty.SIZEOF, VREventProperty.ALIGNOF),
            __member(VREventHapticVibration.SIZEOF, VREventHapticVibration.ALIGNOF),
            __member(VREventWebConsole.SIZEOF, VREventWebConsole.ALIGNOF),
            __member(VREventInputBindingLoad.SIZEOF, VREventInputBindingLoad.ALIGNOF),
            __member(VREventInputActionManifestLoad.SIZEOF, VREventInputActionManifestLoad.ALIGNOF),
            __member(VREventSpatialAnchor.SIZEOF, VREventSpatialAnchor.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED = layout.offsetof(0);
        CONTROLLER = layout.offsetof(1);
        MOUSE = layout.offsetof(2);
        SCROLL = layout.offsetof(3);
        PROCESS = layout.offsetof(4);
        NOTIFICATION = layout.offsetof(5);
        OVERLAY = layout.offsetof(6);
        STATUS = layout.offsetof(7);
        KEYBOARD = layout.offsetof(8);
        IPD = layout.offsetof(9);
        CHAPERONE = layout.offsetof(10);
        PERFORMANCETEST = layout.offsetof(11);
        TOUCHPADMOVE = layout.offsetof(12);
        SEATEDZEROPOSERESET = layout.offsetof(13);
        SCREENSHOT = layout.offsetof(14);
        SCREENSHOTPROGRESS = layout.offsetof(15);
        APPLICATIONLAUNCH = layout.offsetof(16);
        CAMERASURFACE = layout.offsetof(17);
        MESSAGEOVERLAY = layout.offsetof(18);
        PROPERTY = layout.offsetof(19);
        HAPTICVIBRATION = layout.offsetof(20);
        WEBCONSOLE = layout.offsetof(21);
        INPUTBINDING = layout.offsetof(22);
        ACTIONMANIFEST = layout.offsetof(23);
        SPATIALANCHOR = layout.offsetof(24);
    }

    /**
     * Creates a {@code VREventData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VREventReserved} view of the {@code reserved} field. */
    @NativeType("VREvent_Reserved_t")
    public VREventReserved reserved() { return nreserved(address()); }
    /** Returns a {@link VREventController} view of the {@code controller} field. */
    @NativeType("VREvent_Controller_t")
    public VREventController controller() { return ncontroller(address()); }
    /** Returns a {@link VREventMouse} view of the {@code mouse} field. */
    @NativeType("VREvent_Mouse_t")
    public VREventMouse mouse() { return nmouse(address()); }
    /** Returns a {@link VREventScroll} view of the {@code scroll} field. */
    @NativeType("VREvent_Scroll_t")
    public VREventScroll scroll() { return nscroll(address()); }
    /** Returns a {@link VREventProcess} view of the {@code process} field. */
    @NativeType("VREvent_Process_t")
    public VREventProcess process() { return nprocess(address()); }
    /** Returns a {@link VREventNotification} view of the {@code notification} field. */
    @NativeType("VREvent_Notification_t")
    public VREventNotification notification() { return nnotification(address()); }
    /** Returns a {@link VREventOverlay} view of the {@code overlay} field. */
    @NativeType("VREvent_Overlay_t")
    public VREventOverlay overlay() { return noverlay(address()); }
    /** Returns a {@link VREventStatus} view of the {@code status} field. */
    @NativeType("VREvent_Status_t")
    public VREventStatus status() { return nstatus(address()); }
    /** Returns a {@link VREventKeyboard} view of the {@code keyboard} field. */
    @NativeType("VREvent_Keyboard_t")
    public VREventKeyboard keyboard() { return nkeyboard(address()); }
    /** Returns a {@link VREventIpd} view of the {@code ipd} field. */
    @NativeType("VREvent_Ipd_t")
    public VREventIpd ipd() { return nipd(address()); }
    /** Returns a {@link VREventChaperone} view of the {@code chaperone} field. */
    @NativeType("VREvent_Chaperone_t")
    public VREventChaperone chaperone() { return nchaperone(address()); }
    /** Returns a {@link VREventPerformanceTest} view of the {@code performanceTest} field. */
    @NativeType("VREvent_PerformanceTest_t")
    public VREventPerformanceTest performanceTest() { return nperformanceTest(address()); }
    /** Returns a {@link VREventTouchPadMove} view of the {@code touchPadMove} field. */
    @NativeType("VREvent_TouchPadMove_t")
    public VREventTouchPadMove touchPadMove() { return ntouchPadMove(address()); }
    /** Returns a {@link VREventSeatedZeroPoseReset} view of the {@code seatedZeroPoseReset} field. */
    @NativeType("VREvent_SeatedZeroPoseReset_t")
    public VREventSeatedZeroPoseReset seatedZeroPoseReset() { return nseatedZeroPoseReset(address()); }
    /** Returns a {@link VREventScreenshot} view of the {@code screenshot} field. */
    @NativeType("VREvent_Screenshot_t")
    public VREventScreenshot screenshot() { return nscreenshot(address()); }
    /** Returns a {@link VREventScreenshotProgress} view of the {@code screenshotProgress} field. */
    @NativeType("VREvent_ScreenshotProgress_t")
    public VREventScreenshotProgress screenshotProgress() { return nscreenshotProgress(address()); }
    /** Returns a {@link VREventApplicationLaunch} view of the {@code applicationLaunch} field. */
    @NativeType("VREvent_ApplicationLaunch_t")
    public VREventApplicationLaunch applicationLaunch() { return napplicationLaunch(address()); }
    /** Returns a {@link VREventEditingCameraSurface} view of the {@code cameraSurface} field. */
    @NativeType("VREvent_EditingCameraSurface_t")
    public VREventEditingCameraSurface cameraSurface() { return ncameraSurface(address()); }
    /** Returns a {@link VREventMessageOverlay} view of the {@code messageOverlay} field. */
    @NativeType("VREvent_MessageOverlay_t")
    public VREventMessageOverlay messageOverlay() { return nmessageOverlay(address()); }
    /** Returns a {@link VREventProperty} view of the {@code property} field. */
    @NativeType("VREvent_Property_t")
    public VREventProperty property() { return nproperty(address()); }
    /** Returns a {@link VREventHapticVibration} view of the {@code hapticVibration} field. */
    @NativeType("VREvent_HapticVibration_t")
    public VREventHapticVibration hapticVibration() { return nhapticVibration(address()); }
    /** Returns a {@link VREventWebConsole} view of the {@code webConsole} field. */
    @NativeType("VREvent_WebConsole_t")
    public VREventWebConsole webConsole() { return nwebConsole(address()); }
    /** Returns a {@link VREventInputBindingLoad} view of the {@code inputBinding} field. */
    @NativeType("VREvent_InputBindingLoad_t")
    public VREventInputBindingLoad inputBinding() { return ninputBinding(address()); }
    /** Returns a {@link VREventInputActionManifestLoad} view of the {@code actionManifest} field. */
    @NativeType("VREvent_InputActionManifestLoad_t")
    public VREventInputActionManifestLoad actionManifest() { return nactionManifest(address()); }
    /** Returns a {@link VREventSpatialAnchor} view of the {@code spatialAnchor} field. */
    @NativeType("VREvent_SpatialAnchor_t")
    public VREventSpatialAnchor spatialAnchor() { return nspatialAnchor(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventData} instance for the specified memory address. */
    public static VREventData create(long address) {
        return wrap(VREventData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventData createSafe(long address) {
        return address == NULL ? null : wrap(VREventData.class, address);
    }

    /**
     * Create a {@link VREventData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved}. */
    public static VREventReserved nreserved(long struct) { return VREventReserved.create(struct + VREventData.RESERVED); }
    /** Unsafe version of {@link #controller}. */
    public static VREventController ncontroller(long struct) { return VREventController.create(struct + VREventData.CONTROLLER); }
    /** Unsafe version of {@link #mouse}. */
    public static VREventMouse nmouse(long struct) { return VREventMouse.create(struct + VREventData.MOUSE); }
    /** Unsafe version of {@link #scroll}. */
    public static VREventScroll nscroll(long struct) { return VREventScroll.create(struct + VREventData.SCROLL); }
    /** Unsafe version of {@link #process}. */
    public static VREventProcess nprocess(long struct) { return VREventProcess.create(struct + VREventData.PROCESS); }
    /** Unsafe version of {@link #notification}. */
    public static VREventNotification nnotification(long struct) { return VREventNotification.create(struct + VREventData.NOTIFICATION); }
    /** Unsafe version of {@link #overlay}. */
    public static VREventOverlay noverlay(long struct) { return VREventOverlay.create(struct + VREventData.OVERLAY); }
    /** Unsafe version of {@link #status}. */
    public static VREventStatus nstatus(long struct) { return VREventStatus.create(struct + VREventData.STATUS); }
    /** Unsafe version of {@link #keyboard}. */
    public static VREventKeyboard nkeyboard(long struct) { return VREventKeyboard.create(struct + VREventData.KEYBOARD); }
    /** Unsafe version of {@link #ipd}. */
    public static VREventIpd nipd(long struct) { return VREventIpd.create(struct + VREventData.IPD); }
    /** Unsafe version of {@link #chaperone}. */
    public static VREventChaperone nchaperone(long struct) { return VREventChaperone.create(struct + VREventData.CHAPERONE); }
    /** Unsafe version of {@link #performanceTest}. */
    public static VREventPerformanceTest nperformanceTest(long struct) { return VREventPerformanceTest.create(struct + VREventData.PERFORMANCETEST); }
    /** Unsafe version of {@link #touchPadMove}. */
    public static VREventTouchPadMove ntouchPadMove(long struct) { return VREventTouchPadMove.create(struct + VREventData.TOUCHPADMOVE); }
    /** Unsafe version of {@link #seatedZeroPoseReset}. */
    public static VREventSeatedZeroPoseReset nseatedZeroPoseReset(long struct) { return VREventSeatedZeroPoseReset.create(struct + VREventData.SEATEDZEROPOSERESET); }
    /** Unsafe version of {@link #screenshot}. */
    public static VREventScreenshot nscreenshot(long struct) { return VREventScreenshot.create(struct + VREventData.SCREENSHOT); }
    /** Unsafe version of {@link #screenshotProgress}. */
    public static VREventScreenshotProgress nscreenshotProgress(long struct) { return VREventScreenshotProgress.create(struct + VREventData.SCREENSHOTPROGRESS); }
    /** Unsafe version of {@link #applicationLaunch}. */
    public static VREventApplicationLaunch napplicationLaunch(long struct) { return VREventApplicationLaunch.create(struct + VREventData.APPLICATIONLAUNCH); }
    /** Unsafe version of {@link #cameraSurface}. */
    public static VREventEditingCameraSurface ncameraSurface(long struct) { return VREventEditingCameraSurface.create(struct + VREventData.CAMERASURFACE); }
    /** Unsafe version of {@link #messageOverlay}. */
    public static VREventMessageOverlay nmessageOverlay(long struct) { return VREventMessageOverlay.create(struct + VREventData.MESSAGEOVERLAY); }
    /** Unsafe version of {@link #property}. */
    public static VREventProperty nproperty(long struct) { return VREventProperty.create(struct + VREventData.PROPERTY); }
    /** Unsafe version of {@link #hapticVibration}. */
    public static VREventHapticVibration nhapticVibration(long struct) { return VREventHapticVibration.create(struct + VREventData.HAPTICVIBRATION); }
    /** Unsafe version of {@link #webConsole}. */
    public static VREventWebConsole nwebConsole(long struct) { return VREventWebConsole.create(struct + VREventData.WEBCONSOLE); }
    /** Unsafe version of {@link #inputBinding}. */
    public static VREventInputBindingLoad ninputBinding(long struct) { return VREventInputBindingLoad.create(struct + VREventData.INPUTBINDING); }
    /** Unsafe version of {@link #actionManifest}. */
    public static VREventInputActionManifestLoad nactionManifest(long struct) { return VREventInputActionManifestLoad.create(struct + VREventData.ACTIONMANIFEST); }
    /** Unsafe version of {@link #spatialAnchor}. */
    public static VREventSpatialAnchor nspatialAnchor(long struct) { return VREventSpatialAnchor.create(struct + VREventData.SPATIALANCHOR); }

    // -----------------------------------

    /** An array of {@link VREventData} structs. */
    public static class Buffer extends StructBuffer<VREventData, Buffer> {

        private static final VREventData ELEMENT_FACTORY = VREventData.create(-1L);

        /**
         * Creates a new {@code VREventData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventData#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VREventData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VREventReserved} view of the {@code reserved} field. */
        @NativeType("VREvent_Reserved_t")
        public VREventReserved reserved() { return VREventData.nreserved(address()); }
        /** Returns a {@link VREventController} view of the {@code controller} field. */
        @NativeType("VREvent_Controller_t")
        public VREventController controller() { return VREventData.ncontroller(address()); }
        /** Returns a {@link VREventMouse} view of the {@code mouse} field. */
        @NativeType("VREvent_Mouse_t")
        public VREventMouse mouse() { return VREventData.nmouse(address()); }
        /** Returns a {@link VREventScroll} view of the {@code scroll} field. */
        @NativeType("VREvent_Scroll_t")
        public VREventScroll scroll() { return VREventData.nscroll(address()); }
        /** Returns a {@link VREventProcess} view of the {@code process} field. */
        @NativeType("VREvent_Process_t")
        public VREventProcess process() { return VREventData.nprocess(address()); }
        /** Returns a {@link VREventNotification} view of the {@code notification} field. */
        @NativeType("VREvent_Notification_t")
        public VREventNotification notification() { return VREventData.nnotification(address()); }
        /** Returns a {@link VREventOverlay} view of the {@code overlay} field. */
        @NativeType("VREvent_Overlay_t")
        public VREventOverlay overlay() { return VREventData.noverlay(address()); }
        /** Returns a {@link VREventStatus} view of the {@code status} field. */
        @NativeType("VREvent_Status_t")
        public VREventStatus status() { return VREventData.nstatus(address()); }
        /** Returns a {@link VREventKeyboard} view of the {@code keyboard} field. */
        @NativeType("VREvent_Keyboard_t")
        public VREventKeyboard keyboard() { return VREventData.nkeyboard(address()); }
        /** Returns a {@link VREventIpd} view of the {@code ipd} field. */
        @NativeType("VREvent_Ipd_t")
        public VREventIpd ipd() { return VREventData.nipd(address()); }
        /** Returns a {@link VREventChaperone} view of the {@code chaperone} field. */
        @NativeType("VREvent_Chaperone_t")
        public VREventChaperone chaperone() { return VREventData.nchaperone(address()); }
        /** Returns a {@link VREventPerformanceTest} view of the {@code performanceTest} field. */
        @NativeType("VREvent_PerformanceTest_t")
        public VREventPerformanceTest performanceTest() { return VREventData.nperformanceTest(address()); }
        /** Returns a {@link VREventTouchPadMove} view of the {@code touchPadMove} field. */
        @NativeType("VREvent_TouchPadMove_t")
        public VREventTouchPadMove touchPadMove() { return VREventData.ntouchPadMove(address()); }
        /** Returns a {@link VREventSeatedZeroPoseReset} view of the {@code seatedZeroPoseReset} field. */
        @NativeType("VREvent_SeatedZeroPoseReset_t")
        public VREventSeatedZeroPoseReset seatedZeroPoseReset() { return VREventData.nseatedZeroPoseReset(address()); }
        /** Returns a {@link VREventScreenshot} view of the {@code screenshot} field. */
        @NativeType("VREvent_Screenshot_t")
        public VREventScreenshot screenshot() { return VREventData.nscreenshot(address()); }
        /** Returns a {@link VREventScreenshotProgress} view of the {@code screenshotProgress} field. */
        @NativeType("VREvent_ScreenshotProgress_t")
        public VREventScreenshotProgress screenshotProgress() { return VREventData.nscreenshotProgress(address()); }
        /** Returns a {@link VREventApplicationLaunch} view of the {@code applicationLaunch} field. */
        @NativeType("VREvent_ApplicationLaunch_t")
        public VREventApplicationLaunch applicationLaunch() { return VREventData.napplicationLaunch(address()); }
        /** Returns a {@link VREventEditingCameraSurface} view of the {@code cameraSurface} field. */
        @NativeType("VREvent_EditingCameraSurface_t")
        public VREventEditingCameraSurface cameraSurface() { return VREventData.ncameraSurface(address()); }
        /** Returns a {@link VREventMessageOverlay} view of the {@code messageOverlay} field. */
        @NativeType("VREvent_MessageOverlay_t")
        public VREventMessageOverlay messageOverlay() { return VREventData.nmessageOverlay(address()); }
        /** Returns a {@link VREventProperty} view of the {@code property} field. */
        @NativeType("VREvent_Property_t")
        public VREventProperty property() { return VREventData.nproperty(address()); }
        /** Returns a {@link VREventHapticVibration} view of the {@code hapticVibration} field. */
        @NativeType("VREvent_HapticVibration_t")
        public VREventHapticVibration hapticVibration() { return VREventData.nhapticVibration(address()); }
        /** Returns a {@link VREventWebConsole} view of the {@code webConsole} field. */
        @NativeType("VREvent_WebConsole_t")
        public VREventWebConsole webConsole() { return VREventData.nwebConsole(address()); }
        /** Returns a {@link VREventInputBindingLoad} view of the {@code inputBinding} field. */
        @NativeType("VREvent_InputBindingLoad_t")
        public VREventInputBindingLoad inputBinding() { return VREventData.ninputBinding(address()); }
        /** Returns a {@link VREventInputActionManifestLoad} view of the {@code actionManifest} field. */
        @NativeType("VREvent_InputActionManifestLoad_t")
        public VREventInputActionManifestLoad actionManifest() { return VREventData.nactionManifest(address()); }
        /** Returns a {@link VREventSpatialAnchor} view of the {@code spatialAnchor} field. */
        @NativeType("VREvent_SpatialAnchor_t")
        public VREventSpatialAnchor spatialAnchor() { return VREventData.nspatialAnchor(address()); }

    }

}