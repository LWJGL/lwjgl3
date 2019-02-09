/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains the performance stats for a given SDK compositor frame.
 * 
 * <p>All of the int fields can be reset via the {@link OVR#ovr_ResetPerfStats ResetPerfStats} call.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code HmdVsyncIndex} &ndash; 
 * Vsync Frame Index - increments with each HMD vertical synchronization signal (i.e. vsync or refresh rate).
 * 
 * <p>If the compositor drops a frame, expect this value to increment more than 1 at a time.</p></li>
 * <li>{@code AppFrameIndex} &ndash; index that increments with each successive {@link OVR#ovr_SubmitFrame SubmitFrame} call</li>
 * <li>{@code AppDroppedFrameCount} &ndash; if the app fails to call {@link OVR#ovr_SubmitFrame SubmitFrame} on time, then expect this value to increment with each missed frame</li>
 * <li>{@code AppMotionToPhotonLatency} &ndash; 
 * motion-to-photon latency for the application
 * 
 * <p>This value is calculated by either using the {@code SensorSampleTime} provided for the {@link OVRLayerEyeFov} or if that is not available, then the call to
 * {@link OVR#ovr_GetTrackingState GetTrackingState} which has {@code latencyMarker} set to {@link OVR#ovrTrue True}.</p></li>
 * <li>{@code AppQueueAheadTime} &ndash; 
 * amount of queue-ahead in seconds provided to the app based on performance and overlap of CPU and GPU utilization.
 * 
 * <p>A value of 0.0 would mean the CPU &amp; GPU workload is being completed in 1 frame's worth of time, while 11 ms (on the CV1) of queue ahead would
 * indicate that the app's CPU workload for the next frame is overlapping the app's GPU workload for the current frame.</p></li>
 * <li>{@code AppCpuElapsedTime} &ndash; 
 * amount of time in seconds spent on the CPU by the app's render-thread that calls {@link OVR#ovr_SubmitFrame SubmitFrame}.
 * 
 * <p>Measured as elapsed time between from when app regains control from {@link OVR#ovr_SubmitFrame SubmitFrame} to the next time the app calls {@link OVR#ovr_SubmitFrame SubmitFrame}.</p></li>
 * <li>{@code AppGpuElapsedTime} &ndash; 
 * amount of time in seconds spent on the GPU by the app.
 * 
 * <p>Measured as elapsed time between each {@link OVR#ovr_SubmitFrame SubmitFrame} call using GPU timing queries.</p></li>
 * <li>{@code CompositorFrameIndex} &ndash; 
 * index that increments each time the SDK compositor completes a distortion and timewarp pass.
 * 
 * <p>Since the compositor operates asynchronously, even if the app calls {@link OVR#ovr_SubmitFrame SubmitFrame} too late, the compositor will kick off for each vsync.</p></li>
 * <li>{@code CompositorDroppedFrameCount} &ndash; 
 * increments each time the SDK compositor fails to complete in time.
 * 
 * <p>This is not tied to the app's performance, but failure to complete can be related to other factors such as OS capabilities, overall available hardware
 * cycles to execute the compositor in time and other factors outside of the app's control.</p></li>
 * <li>{@code CompositorLatency} &ndash; 
 * motion-to-photon latency of the SDK compositor in seconds.
 * 
 * <p>This is the latency of timewarp which corrects the higher app latency as well as dropped app frames.</p></li>
 * <li>{@code CompositorCpuElapsedTime} &ndash; 
 * the amount of time in seconds spent on the CPU by the SDK compositor.
 * 
 * <p>Unless the VR app is utilizing all of the CPU cores at their peak performance, there is a good chance the compositor CPU times will not affect the
 * app's CPU performance in a major way.</p></li>
 * <li>{@code CompositorGpuElapsedTime} &ndash; 
 * the amount of time in seconds spent on the GPU by the SDK compositor. Any time spent on the compositor will eat away from the available GPU time for
 * the app.</li>
 * <li>{@code CompositorCpuStartToGpuEndElapsedTime} &ndash; 
 * the amount of time in seconds spent from the point the CPU kicks off the compositor to the point in time the compositor completes the distortion &amp;
 * timewarp on the GPU.
 * 
 * <p>In the event the GPU time is not available, expect this value to be -1.0f.</p></li>
 * <li>{@code CompositorGpuEndToVsyncElapsedTime} &ndash; 
 * the amount of time in seconds left after the compositor is done on the GPU to the associated V-Sync time.
 * 
 * <p>In the event the GPU time is not available, expect this value to be -1.0f.</p></li>
 * <li>{@code AswIsActive} &ndash; 
 * Will be true if ASW is active for the given frame such that the application is being forced into  half the frame-rate while the compositor continues to
 * run at full frame-rate.</li>
 * <li>{@code AswActivatedToggleCount} &ndash; Increments each time ASW it activated where the app was forced in and out of half-rate rendering.</li>
 * <li>{@code AswPresentedFrameCount} &ndash; Accumulates the number of frames presented by the compositor which had extrapolated ASW frames presented</li>
 * <li>{@code AswFailedFrameCount} &ndash; Accumulates the number of frames that the compositor tried to present when ASW is active but failed</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrPerfStatsPerCompositorFrame {
 *     int HmdVsyncIndex;
 *     int AppFrameIndex;
 *     int AppDroppedFrameCount;
 *     float AppMotionToPhotonLatency;
 *     float AppQueueAheadTime;
 *     float AppCpuElapsedTime;
 *     float AppGpuElapsedTime;
 *     int CompositorFrameIndex;
 *     int CompositorDroppedFrameCount;
 *     float CompositorLatency;
 *     float CompositorCpuElapsedTime;
 *     float CompositorGpuElapsedTime;
 *     float CompositorCpuStartToGpuEndElapsedTime;
 *     float CompositorGpuEndToVsyncElapsedTime;
 *     ovrBool AswIsActive;
 *     int AswActivatedToggleCount;
 *     int AswPresentedFrameCount;
 *     int AswFailedFrameCount;
 * }</code></pre>
 */
@NativeType("struct ovrPerfStatsPerCompositorFrame")
public class OVRPerfStatsPerCompositorFrame extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HMDVSYNCINDEX,
        APPFRAMEINDEX,
        APPDROPPEDFRAMECOUNT,
        APPMOTIONTOPHOTONLATENCY,
        APPQUEUEAHEADTIME,
        APPCPUELAPSEDTIME,
        APPGPUELAPSEDTIME,
        COMPOSITORFRAMEINDEX,
        COMPOSITORDROPPEDFRAMECOUNT,
        COMPOSITORLATENCY,
        COMPOSITORCPUELAPSEDTIME,
        COMPOSITORGPUELAPSEDTIME,
        COMPOSITORCPUSTARTTOGPUENDELAPSEDTIME,
        COMPOSITORGPUENDTOVSYNCELAPSEDTIME,
        ASWISACTIVE,
        ASWACTIVATEDTOGGLECOUNT,
        ASWPRESENTEDFRAMECOUNT,
        ASWFAILEDFRAMECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HMDVSYNCINDEX = layout.offsetof(0);
        APPFRAMEINDEX = layout.offsetof(1);
        APPDROPPEDFRAMECOUNT = layout.offsetof(2);
        APPMOTIONTOPHOTONLATENCY = layout.offsetof(3);
        APPQUEUEAHEADTIME = layout.offsetof(4);
        APPCPUELAPSEDTIME = layout.offsetof(5);
        APPGPUELAPSEDTIME = layout.offsetof(6);
        COMPOSITORFRAMEINDEX = layout.offsetof(7);
        COMPOSITORDROPPEDFRAMECOUNT = layout.offsetof(8);
        COMPOSITORLATENCY = layout.offsetof(9);
        COMPOSITORCPUELAPSEDTIME = layout.offsetof(10);
        COMPOSITORGPUELAPSEDTIME = layout.offsetof(11);
        COMPOSITORCPUSTARTTOGPUENDELAPSEDTIME = layout.offsetof(12);
        COMPOSITORGPUENDTOVSYNCELAPSEDTIME = layout.offsetof(13);
        ASWISACTIVE = layout.offsetof(14);
        ASWACTIVATEDTOGGLECOUNT = layout.offsetof(15);
        ASWPRESENTEDFRAMECOUNT = layout.offsetof(16);
        ASWFAILEDFRAMECOUNT = layout.offsetof(17);
    }

    /**
     * Creates a {@code OVRPerfStatsPerCompositorFrame} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRPerfStatsPerCompositorFrame(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code HmdVsyncIndex} field. */
    public int HmdVsyncIndex() { return nHmdVsyncIndex(address()); }
    /** Returns the value of the {@code AppFrameIndex} field. */
    public int AppFrameIndex() { return nAppFrameIndex(address()); }
    /** Returns the value of the {@code AppDroppedFrameCount} field. */
    public int AppDroppedFrameCount() { return nAppDroppedFrameCount(address()); }
    /** Returns the value of the {@code AppMotionToPhotonLatency} field. */
    public float AppMotionToPhotonLatency() { return nAppMotionToPhotonLatency(address()); }
    /** Returns the value of the {@code AppQueueAheadTime} field. */
    public float AppQueueAheadTime() { return nAppQueueAheadTime(address()); }
    /** Returns the value of the {@code AppCpuElapsedTime} field. */
    public float AppCpuElapsedTime() { return nAppCpuElapsedTime(address()); }
    /** Returns the value of the {@code AppGpuElapsedTime} field. */
    public float AppGpuElapsedTime() { return nAppGpuElapsedTime(address()); }
    /** Returns the value of the {@code CompositorFrameIndex} field. */
    public int CompositorFrameIndex() { return nCompositorFrameIndex(address()); }
    /** Returns the value of the {@code CompositorDroppedFrameCount} field. */
    public int CompositorDroppedFrameCount() { return nCompositorDroppedFrameCount(address()); }
    /** Returns the value of the {@code CompositorLatency} field. */
    public float CompositorLatency() { return nCompositorLatency(address()); }
    /** Returns the value of the {@code CompositorCpuElapsedTime} field. */
    public float CompositorCpuElapsedTime() { return nCompositorCpuElapsedTime(address()); }
    /** Returns the value of the {@code CompositorGpuElapsedTime} field. */
    public float CompositorGpuElapsedTime() { return nCompositorGpuElapsedTime(address()); }
    /** Returns the value of the {@code CompositorCpuStartToGpuEndElapsedTime} field. */
    public float CompositorCpuStartToGpuEndElapsedTime() { return nCompositorCpuStartToGpuEndElapsedTime(address()); }
    /** Returns the value of the {@code CompositorGpuEndToVsyncElapsedTime} field. */
    public float CompositorGpuEndToVsyncElapsedTime() { return nCompositorGpuEndToVsyncElapsedTime(address()); }
    /** Returns the value of the {@code AswIsActive} field. */
    @NativeType("ovrBool")
    public boolean AswIsActive() { return nAswIsActive(address()); }
    /** Returns the value of the {@code AswActivatedToggleCount} field. */
    public int AswActivatedToggleCount() { return nAswActivatedToggleCount(address()); }
    /** Returns the value of the {@code AswPresentedFrameCount} field. */
    public int AswPresentedFrameCount() { return nAswPresentedFrameCount(address()); }
    /** Returns the value of the {@code AswFailedFrameCount} field. */
    public int AswFailedFrameCount() { return nAswFailedFrameCount(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRPerfStatsPerCompositorFrame} instance for the specified memory address. */
    public static OVRPerfStatsPerCompositorFrame create(long address) {
        return wrap(OVRPerfStatsPerCompositorFrame.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPerfStatsPerCompositorFrame createSafe(long address) {
        return address == NULL ? null : wrap(OVRPerfStatsPerCompositorFrame.class, address);
    }

    /**
     * Create a {@link OVRPerfStatsPerCompositorFrame.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPerfStatsPerCompositorFrame.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPerfStatsPerCompositorFrame.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #HmdVsyncIndex}. */
    public static int nHmdVsyncIndex(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.HMDVSYNCINDEX); }
    /** Unsafe version of {@link #AppFrameIndex}. */
    public static int nAppFrameIndex(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.APPFRAMEINDEX); }
    /** Unsafe version of {@link #AppDroppedFrameCount}. */
    public static int nAppDroppedFrameCount(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.APPDROPPEDFRAMECOUNT); }
    /** Unsafe version of {@link #AppMotionToPhotonLatency}. */
    public static float nAppMotionToPhotonLatency(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.APPMOTIONTOPHOTONLATENCY); }
    /** Unsafe version of {@link #AppQueueAheadTime}. */
    public static float nAppQueueAheadTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.APPQUEUEAHEADTIME); }
    /** Unsafe version of {@link #AppCpuElapsedTime}. */
    public static float nAppCpuElapsedTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.APPCPUELAPSEDTIME); }
    /** Unsafe version of {@link #AppGpuElapsedTime}. */
    public static float nAppGpuElapsedTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.APPGPUELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorFrameIndex}. */
    public static int nCompositorFrameIndex(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORFRAMEINDEX); }
    /** Unsafe version of {@link #CompositorDroppedFrameCount}. */
    public static int nCompositorDroppedFrameCount(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORDROPPEDFRAMECOUNT); }
    /** Unsafe version of {@link #CompositorLatency}. */
    public static float nCompositorLatency(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORLATENCY); }
    /** Unsafe version of {@link #CompositorCpuElapsedTime}. */
    public static float nCompositorCpuElapsedTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORCPUELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorGpuElapsedTime}. */
    public static float nCompositorGpuElapsedTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORGPUELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorCpuStartToGpuEndElapsedTime}. */
    public static float nCompositorCpuStartToGpuEndElapsedTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORCPUSTARTTOGPUENDELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorGpuEndToVsyncElapsedTime}. */
    public static float nCompositorGpuEndToVsyncElapsedTime(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStatsPerCompositorFrame.COMPOSITORGPUENDTOVSYNCELAPSEDTIME); }
    /** Unsafe version of {@link #AswIsActive}. */
    public static boolean nAswIsActive(long struct) { return UNSAFE.getByte(null, struct + OVRPerfStatsPerCompositorFrame.ASWISACTIVE) != 0; }
    /** Unsafe version of {@link #AswActivatedToggleCount}. */
    public static int nAswActivatedToggleCount(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.ASWACTIVATEDTOGGLECOUNT); }
    /** Unsafe version of {@link #AswPresentedFrameCount}. */
    public static int nAswPresentedFrameCount(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.ASWPRESENTEDFRAMECOUNT); }
    /** Unsafe version of {@link #AswFailedFrameCount}. */
    public static int nAswFailedFrameCount(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStatsPerCompositorFrame.ASWFAILEDFRAMECOUNT); }

    // -----------------------------------

    /** An array of {@link OVRPerfStatsPerCompositorFrame} structs. */
    public static class Buffer extends StructBuffer<OVRPerfStatsPerCompositorFrame, Buffer> {

        private static final OVRPerfStatsPerCompositorFrame ELEMENT_FACTORY = OVRPerfStatsPerCompositorFrame.create(-1L);

        /**
         * Creates a new {@code OVRPerfStatsPerCompositorFrame.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRPerfStatsPerCompositorFrame#SIZEOF}, and its mark will be undefined.
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
        protected OVRPerfStatsPerCompositorFrame getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code HmdVsyncIndex} field. */
        public int HmdVsyncIndex() { return OVRPerfStatsPerCompositorFrame.nHmdVsyncIndex(address()); }
        /** Returns the value of the {@code AppFrameIndex} field. */
        public int AppFrameIndex() { return OVRPerfStatsPerCompositorFrame.nAppFrameIndex(address()); }
        /** Returns the value of the {@code AppDroppedFrameCount} field. */
        public int AppDroppedFrameCount() { return OVRPerfStatsPerCompositorFrame.nAppDroppedFrameCount(address()); }
        /** Returns the value of the {@code AppMotionToPhotonLatency} field. */
        public float AppMotionToPhotonLatency() { return OVRPerfStatsPerCompositorFrame.nAppMotionToPhotonLatency(address()); }
        /** Returns the value of the {@code AppQueueAheadTime} field. */
        public float AppQueueAheadTime() { return OVRPerfStatsPerCompositorFrame.nAppQueueAheadTime(address()); }
        /** Returns the value of the {@code AppCpuElapsedTime} field. */
        public float AppCpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nAppCpuElapsedTime(address()); }
        /** Returns the value of the {@code AppGpuElapsedTime} field. */
        public float AppGpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nAppGpuElapsedTime(address()); }
        /** Returns the value of the {@code CompositorFrameIndex} field. */
        public int CompositorFrameIndex() { return OVRPerfStatsPerCompositorFrame.nCompositorFrameIndex(address()); }
        /** Returns the value of the {@code CompositorDroppedFrameCount} field. */
        public int CompositorDroppedFrameCount() { return OVRPerfStatsPerCompositorFrame.nCompositorDroppedFrameCount(address()); }
        /** Returns the value of the {@code CompositorLatency} field. */
        public float CompositorLatency() { return OVRPerfStatsPerCompositorFrame.nCompositorLatency(address()); }
        /** Returns the value of the {@code CompositorCpuElapsedTime} field. */
        public float CompositorCpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorCpuElapsedTime(address()); }
        /** Returns the value of the {@code CompositorGpuElapsedTime} field. */
        public float CompositorGpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorGpuElapsedTime(address()); }
        /** Returns the value of the {@code CompositorCpuStartToGpuEndElapsedTime} field. */
        public float CompositorCpuStartToGpuEndElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorCpuStartToGpuEndElapsedTime(address()); }
        /** Returns the value of the {@code CompositorGpuEndToVsyncElapsedTime} field. */
        public float CompositorGpuEndToVsyncElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorGpuEndToVsyncElapsedTime(address()); }
        /** Returns the value of the {@code AswIsActive} field. */
        @NativeType("ovrBool")
        public boolean AswIsActive() { return OVRPerfStatsPerCompositorFrame.nAswIsActive(address()); }
        /** Returns the value of the {@code AswActivatedToggleCount} field. */
        public int AswActivatedToggleCount() { return OVRPerfStatsPerCompositorFrame.nAswActivatedToggleCount(address()); }
        /** Returns the value of the {@code AswPresentedFrameCount} field. */
        public int AswPresentedFrameCount() { return OVRPerfStatsPerCompositorFrame.nAswPresentedFrameCount(address()); }
        /** Returns the value of the {@code AswFailedFrameCount} field. */
        public int AswFailedFrameCount() { return OVRPerfStatsPerCompositorFrame.nAswFailedFrameCount(address()); }

    }

}