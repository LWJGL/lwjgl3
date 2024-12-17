/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
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
 * }}</pre>
 */
@NativeType("struct ovrPerfStatsPerCompositorFrame")
public class OVRPerfStatsPerCompositorFrame extends Struct<OVRPerfStatsPerCompositorFrame> {

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

    protected OVRPerfStatsPerCompositorFrame(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRPerfStatsPerCompositorFrame create(long address, @Nullable ByteBuffer container) {
        return new OVRPerfStatsPerCompositorFrame(address, container);
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

    /** @return the value of the {@code HmdVsyncIndex} field. */
    public int HmdVsyncIndex() { return nHmdVsyncIndex(address()); }
    /** @return the value of the {@code AppFrameIndex} field. */
    public int AppFrameIndex() { return nAppFrameIndex(address()); }
    /** @return the value of the {@code AppDroppedFrameCount} field. */
    public int AppDroppedFrameCount() { return nAppDroppedFrameCount(address()); }
    /** @return the value of the {@code AppMotionToPhotonLatency} field. */
    public float AppMotionToPhotonLatency() { return nAppMotionToPhotonLatency(address()); }
    /** @return the value of the {@code AppQueueAheadTime} field. */
    public float AppQueueAheadTime() { return nAppQueueAheadTime(address()); }
    /** @return the value of the {@code AppCpuElapsedTime} field. */
    public float AppCpuElapsedTime() { return nAppCpuElapsedTime(address()); }
    /** @return the value of the {@code AppGpuElapsedTime} field. */
    public float AppGpuElapsedTime() { return nAppGpuElapsedTime(address()); }
    /** @return the value of the {@code CompositorFrameIndex} field. */
    public int CompositorFrameIndex() { return nCompositorFrameIndex(address()); }
    /** @return the value of the {@code CompositorDroppedFrameCount} field. */
    public int CompositorDroppedFrameCount() { return nCompositorDroppedFrameCount(address()); }
    /** @return the value of the {@code CompositorLatency} field. */
    public float CompositorLatency() { return nCompositorLatency(address()); }
    /** @return the value of the {@code CompositorCpuElapsedTime} field. */
    public float CompositorCpuElapsedTime() { return nCompositorCpuElapsedTime(address()); }
    /** @return the value of the {@code CompositorGpuElapsedTime} field. */
    public float CompositorGpuElapsedTime() { return nCompositorGpuElapsedTime(address()); }
    /** @return the value of the {@code CompositorCpuStartToGpuEndElapsedTime} field. */
    public float CompositorCpuStartToGpuEndElapsedTime() { return nCompositorCpuStartToGpuEndElapsedTime(address()); }
    /** @return the value of the {@code CompositorGpuEndToVsyncElapsedTime} field. */
    public float CompositorGpuEndToVsyncElapsedTime() { return nCompositorGpuEndToVsyncElapsedTime(address()); }
    /** @return the value of the {@code AswIsActive} field. */
    @NativeType("ovrBool")
    public boolean AswIsActive() { return nAswIsActive(address()); }
    /** @return the value of the {@code AswActivatedToggleCount} field. */
    public int AswActivatedToggleCount() { return nAswActivatedToggleCount(address()); }
    /** @return the value of the {@code AswPresentedFrameCount} field. */
    public int AswPresentedFrameCount() { return nAswPresentedFrameCount(address()); }
    /** @return the value of the {@code AswFailedFrameCount} field. */
    public int AswFailedFrameCount() { return nAswFailedFrameCount(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRPerfStatsPerCompositorFrame} instance for the specified memory address. */
    public static OVRPerfStatsPerCompositorFrame create(long address) {
        return new OVRPerfStatsPerCompositorFrame(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRPerfStatsPerCompositorFrame createSafe(long address) {
        return address == NULL ? null : new OVRPerfStatsPerCompositorFrame(address, null);
    }

    /**
     * Create a {@link OVRPerfStatsPerCompositorFrame.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPerfStatsPerCompositorFrame.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRPerfStatsPerCompositorFrame.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #HmdVsyncIndex}. */
    public static int nHmdVsyncIndex(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.HMDVSYNCINDEX); }
    /** Unsafe version of {@link #AppFrameIndex}. */
    public static int nAppFrameIndex(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.APPFRAMEINDEX); }
    /** Unsafe version of {@link #AppDroppedFrameCount}. */
    public static int nAppDroppedFrameCount(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.APPDROPPEDFRAMECOUNT); }
    /** Unsafe version of {@link #AppMotionToPhotonLatency}. */
    public static float nAppMotionToPhotonLatency(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.APPMOTIONTOPHOTONLATENCY); }
    /** Unsafe version of {@link #AppQueueAheadTime}. */
    public static float nAppQueueAheadTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.APPQUEUEAHEADTIME); }
    /** Unsafe version of {@link #AppCpuElapsedTime}. */
    public static float nAppCpuElapsedTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.APPCPUELAPSEDTIME); }
    /** Unsafe version of {@link #AppGpuElapsedTime}. */
    public static float nAppGpuElapsedTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.APPGPUELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorFrameIndex}. */
    public static int nCompositorFrameIndex(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORFRAMEINDEX); }
    /** Unsafe version of {@link #CompositorDroppedFrameCount}. */
    public static int nCompositorDroppedFrameCount(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORDROPPEDFRAMECOUNT); }
    /** Unsafe version of {@link #CompositorLatency}. */
    public static float nCompositorLatency(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORLATENCY); }
    /** Unsafe version of {@link #CompositorCpuElapsedTime}. */
    public static float nCompositorCpuElapsedTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORCPUELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorGpuElapsedTime}. */
    public static float nCompositorGpuElapsedTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORGPUELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorCpuStartToGpuEndElapsedTime}. */
    public static float nCompositorCpuStartToGpuEndElapsedTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORCPUSTARTTOGPUENDELAPSEDTIME); }
    /** Unsafe version of {@link #CompositorGpuEndToVsyncElapsedTime}. */
    public static float nCompositorGpuEndToVsyncElapsedTime(long struct) { return memGetFloat(struct + OVRPerfStatsPerCompositorFrame.COMPOSITORGPUENDTOVSYNCELAPSEDTIME); }
    /** Unsafe version of {@link #AswIsActive}. */
    public static boolean nAswIsActive(long struct) { return memGetByte(struct + OVRPerfStatsPerCompositorFrame.ASWISACTIVE) != 0; }
    /** Unsafe version of {@link #AswActivatedToggleCount}. */
    public static int nAswActivatedToggleCount(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.ASWACTIVATEDTOGGLECOUNT); }
    /** Unsafe version of {@link #AswPresentedFrameCount}. */
    public static int nAswPresentedFrameCount(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.ASWPRESENTEDFRAMECOUNT); }
    /** Unsafe version of {@link #AswFailedFrameCount}. */
    public static int nAswFailedFrameCount(long struct) { return memGetInt(struct + OVRPerfStatsPerCompositorFrame.ASWFAILEDFRAMECOUNT); }

    // -----------------------------------

    /** An array of {@link OVRPerfStatsPerCompositorFrame} structs. */
    public static class Buffer extends StructBuffer<OVRPerfStatsPerCompositorFrame, Buffer> {

        private static final OVRPerfStatsPerCompositorFrame ELEMENT_FACTORY = OVRPerfStatsPerCompositorFrame.create(-1L);

        /**
         * Creates a new {@code OVRPerfStatsPerCompositorFrame.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRPerfStatsPerCompositorFrame#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected OVRPerfStatsPerCompositorFrame getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code HmdVsyncIndex} field. */
        public int HmdVsyncIndex() { return OVRPerfStatsPerCompositorFrame.nHmdVsyncIndex(address()); }
        /** @return the value of the {@code AppFrameIndex} field. */
        public int AppFrameIndex() { return OVRPerfStatsPerCompositorFrame.nAppFrameIndex(address()); }
        /** @return the value of the {@code AppDroppedFrameCount} field. */
        public int AppDroppedFrameCount() { return OVRPerfStatsPerCompositorFrame.nAppDroppedFrameCount(address()); }
        /** @return the value of the {@code AppMotionToPhotonLatency} field. */
        public float AppMotionToPhotonLatency() { return OVRPerfStatsPerCompositorFrame.nAppMotionToPhotonLatency(address()); }
        /** @return the value of the {@code AppQueueAheadTime} field. */
        public float AppQueueAheadTime() { return OVRPerfStatsPerCompositorFrame.nAppQueueAheadTime(address()); }
        /** @return the value of the {@code AppCpuElapsedTime} field. */
        public float AppCpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nAppCpuElapsedTime(address()); }
        /** @return the value of the {@code AppGpuElapsedTime} field. */
        public float AppGpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nAppGpuElapsedTime(address()); }
        /** @return the value of the {@code CompositorFrameIndex} field. */
        public int CompositorFrameIndex() { return OVRPerfStatsPerCompositorFrame.nCompositorFrameIndex(address()); }
        /** @return the value of the {@code CompositorDroppedFrameCount} field. */
        public int CompositorDroppedFrameCount() { return OVRPerfStatsPerCompositorFrame.nCompositorDroppedFrameCount(address()); }
        /** @return the value of the {@code CompositorLatency} field. */
        public float CompositorLatency() { return OVRPerfStatsPerCompositorFrame.nCompositorLatency(address()); }
        /** @return the value of the {@code CompositorCpuElapsedTime} field. */
        public float CompositorCpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorCpuElapsedTime(address()); }
        /** @return the value of the {@code CompositorGpuElapsedTime} field. */
        public float CompositorGpuElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorGpuElapsedTime(address()); }
        /** @return the value of the {@code CompositorCpuStartToGpuEndElapsedTime} field. */
        public float CompositorCpuStartToGpuEndElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorCpuStartToGpuEndElapsedTime(address()); }
        /** @return the value of the {@code CompositorGpuEndToVsyncElapsedTime} field. */
        public float CompositorGpuEndToVsyncElapsedTime() { return OVRPerfStatsPerCompositorFrame.nCompositorGpuEndToVsyncElapsedTime(address()); }
        /** @return the value of the {@code AswIsActive} field. */
        @NativeType("ovrBool")
        public boolean AswIsActive() { return OVRPerfStatsPerCompositorFrame.nAswIsActive(address()); }
        /** @return the value of the {@code AswActivatedToggleCount} field. */
        public int AswActivatedToggleCount() { return OVRPerfStatsPerCompositorFrame.nAswActivatedToggleCount(address()); }
        /** @return the value of the {@code AswPresentedFrameCount} field. */
        public int AswPresentedFrameCount() { return OVRPerfStatsPerCompositorFrame.nAswPresentedFrameCount(address()); }
        /** @return the value of the {@code AswFailedFrameCount} field. */
        public int AswFailedFrameCount() { return OVRPerfStatsPerCompositorFrame.nAswFailedFrameCount(address()); }

    }

}