/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrMaxProvidedFrameStats;

/**
 * This is a complete descriptor of the performance stats provided by the SDK.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code FrameStats[ovrMaxProvidedFrameStats]} &ndash; 
 * an array of performance stats.
 * 
 * <p>The performance entries will be ordered in reverse chronological order such that the first entry will be the most recent one.</p></li>
 * <li>{@code FrameStatsCount} &ndash; 
 * will have a maximum value set by {@link OVR#ovrMaxProvidedFrameStats MaxProvidedFrameStats}.
 * 
 * <p>If the application calls {@link OVR#ovr_GetPerfStats GetPerfStats} at the native refresh rate of the HMD then {@code FrameStatsCount} will be 1. If the app's workload happens to
 * force {@link OVR#ovr_GetPerfStats GetPerfStats} to be called at a lower rate, then {@code FrameStatsCount} will be 2 or more.</p>
 * 
 * <p>If the app does not want to miss any performance data for any frame, it needs to ensure that it is calling {@link OVR#ovr_SubmitFrame SubmitFrame} and {@link OVR#ovr_GetPerfStats GetPerfStats} at a rate
 * that is at least: {@code HMD_refresh_rate / ovrMaxProvidedFrameStats}. On the Oculus Rift CV1 HMD, this will be equal to 18 times per second.</p></li>
 * <li>{@code AnyFrameStatsDropped} &ndash; 
 * If the app calls {@link OVR#ovr_SubmitFrame SubmitFrame} at a rate less than 18 fps, then when calling {@link OVR#ovr_GetPerfStats GetPerfStats}, expect {@code AnyFrameStatsDropped} to become {@link OVR#ovrTrue True}
 * while {@code FrameStatsCount} is equal to {@link OVR#ovrMaxProvidedFrameStats MaxProvidedFrameStats}.</li>
 * <li>{@code AdaptiveGpuPerformanceScale} &ndash; 
 * an edge-filtered value that a caller can use to adjust the graphics quality of the application to keep the GPU utilization in check. The value is
 * calculated as: {@code (desired_GPU_utilization / current_GPU_utilization)}
 * 
 * <p>As such, when this value is 1.0, the GPU is doing the right amount of work for the app. Lower values mean the app needs to pull back on the GPU
 * utilization. If the app is going to directly drive render-target resolution using this value, then be sure to take the square-root of the value before
 * scaling the resolution with it. Changing render target resolutions however is one of the many things an app can do increase or decrease the amount of
 * GPU utilization. Since {@code AdaptiveGpuPerformanceScale} is edge-filtered and does not change rapidly (i.e. reports non-1.0 values once every couple
 * of seconds) the app can make the necessary adjustments and then keep watching the value to see if it has been satisfied.</p></li>
 * <li>{@code AswIsAvailable} &ndash; 
 * Will be true if Async Spacewarp (ASW) is available for this system which is dependent on several factors such as choice of GPU, OS and debug overrides.</li>
 * <li>{@code VisibleProcessId} &ndash; 
 * Contains the Process ID of the VR application the stats are being polled for. If an app continues to grab perf stats even when it is not visible, then
 * expect this value to point to the other VR app that has grabbed focus (i.e. became visible).</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrPerfStats {
 *     {@link OVRPerfStatsPerCompositorFrame ovrPerfStatsPerCompositorFrame} FrameStats[ovrMaxProvidedFrameStats];
 *     int FrameStatsCount;
 *     ovrBool AnyFrameStatsDropped;
 *     float AdaptiveGpuPerformanceScale;
 *     ovrBool AswIsAvailable;
 *     ovrProcessId VisibleProcessId;
 * }</code></pre>
 */
@NativeType("struct ovrPerfStats")
public class OVRPerfStats extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMESTATS,
        FRAMESTATSCOUNT,
        ANYFRAMESTATSDROPPED,
        ADAPTIVEGPUPERFORMANCESCALE,
        ASWISAVAILABLE,
        VISIBLEPROCESSID;

    static {
        Layout layout = __struct(
            __array(OVRPerfStatsPerCompositorFrame.SIZEOF, OVRPerfStatsPerCompositorFrame.ALIGNOF, ovrMaxProvidedFrameStats),
            __member(4),
            __member(1),
            __member(4),
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMESTATS = layout.offsetof(0);
        FRAMESTATSCOUNT = layout.offsetof(1);
        ANYFRAMESTATSDROPPED = layout.offsetof(2);
        ADAPTIVEGPUPERFORMANCESCALE = layout.offsetof(3);
        ASWISAVAILABLE = layout.offsetof(4);
        VISIBLEPROCESSID = layout.offsetof(5);
    }

    /**
     * Creates a {@code OVRPerfStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRPerfStats(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRPerfStatsPerCompositorFrame}.Buffer view of the {@code FrameStats} field. */
    @NativeType("ovrPerfStatsPerCompositorFrame[ovrMaxProvidedFrameStats]")
    public OVRPerfStatsPerCompositorFrame.Buffer FrameStats() { return nFrameStats(address()); }
    /** Returns a {@link OVRPerfStatsPerCompositorFrame} view of the struct at the specified index of the {@code FrameStats} field. */
    @NativeType("ovrPerfStatsPerCompositorFrame")
    public OVRPerfStatsPerCompositorFrame FrameStats(int index) { return nFrameStats(address(), index); }
    /** Returns the value of the {@code FrameStatsCount} field. */
    public int FrameStatsCount() { return nFrameStatsCount(address()); }
    /** Returns the value of the {@code AnyFrameStatsDropped} field. */
    @NativeType("ovrBool")
    public boolean AnyFrameStatsDropped() { return nAnyFrameStatsDropped(address()); }
    /** Returns the value of the {@code AdaptiveGpuPerformanceScale} field. */
    public float AdaptiveGpuPerformanceScale() { return nAdaptiveGpuPerformanceScale(address()); }
    /** Returns the value of the {@code AswIsAvailable} field. */
    @NativeType("ovrBool")
    public boolean AswIsAvailable() { return nAswIsAvailable(address()); }
    /** Returns the value of the {@code VisibleProcessId} field. */
    @NativeType("ovrProcessId")
    public int VisibleProcessId() { return nVisibleProcessId(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRPerfStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRPerfStats malloc() {
        return wrap(OVRPerfStats.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRPerfStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRPerfStats calloc() {
        return wrap(OVRPerfStats.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRPerfStats} instance allocated with {@link BufferUtils}. */
    public static OVRPerfStats create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRPerfStats.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRPerfStats} instance for the specified memory address. */
    public static OVRPerfStats create(long address) {
        return wrap(OVRPerfStats.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPerfStats createSafe(long address) {
        return address == NULL ? null : wrap(OVRPerfStats.class, address);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRPerfStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPerfStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRPerfStats} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRPerfStats mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRPerfStats} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRPerfStats callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRPerfStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPerfStats mallocStack(MemoryStack stack) {
        return wrap(OVRPerfStats.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRPerfStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPerfStats callocStack(MemoryStack stack) {
        return wrap(OVRPerfStats.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FrameStats}. */
    public static OVRPerfStatsPerCompositorFrame.Buffer nFrameStats(long struct) { return OVRPerfStatsPerCompositorFrame.create(struct + OVRPerfStats.FRAMESTATS, nFrameStatsCount(struct)); }
    /** Unsafe version of {@link #FrameStats(int) FrameStats}. */
    public static OVRPerfStatsPerCompositorFrame nFrameStats(long struct, int index) {
        return OVRPerfStatsPerCompositorFrame.create(struct + OVRPerfStats.FRAMESTATS + check(index, nFrameStatsCount(struct)) * OVRPerfStatsPerCompositorFrame.SIZEOF);
    }
    /** Unsafe version of {@link #FrameStatsCount}. */
    public static int nFrameStatsCount(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStats.FRAMESTATSCOUNT); }
    /** Unsafe version of {@link #AnyFrameStatsDropped}. */
    public static boolean nAnyFrameStatsDropped(long struct) { return UNSAFE.getByte(null, struct + OVRPerfStats.ANYFRAMESTATSDROPPED) != 0; }
    /** Unsafe version of {@link #AdaptiveGpuPerformanceScale}. */
    public static float nAdaptiveGpuPerformanceScale(long struct) { return UNSAFE.getFloat(null, struct + OVRPerfStats.ADAPTIVEGPUPERFORMANCESCALE); }
    /** Unsafe version of {@link #AswIsAvailable}. */
    public static boolean nAswIsAvailable(long struct) { return UNSAFE.getByte(null, struct + OVRPerfStats.ASWISAVAILABLE) != 0; }
    /** Unsafe version of {@link #VisibleProcessId}. */
    public static int nVisibleProcessId(long struct) { return UNSAFE.getInt(null, struct + OVRPerfStats.VISIBLEPROCESSID); }

    // -----------------------------------

    /** An array of {@link OVRPerfStats} structs. */
    public static class Buffer extends StructBuffer<OVRPerfStats, Buffer> implements NativeResource {

        private static final OVRPerfStats ELEMENT_FACTORY = OVRPerfStats.create(-1L);

        /**
         * Creates a new {@code OVRPerfStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRPerfStats#SIZEOF}, and its mark will be undefined.
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
        protected OVRPerfStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link OVRPerfStatsPerCompositorFrame}.Buffer view of the {@code FrameStats} field. */
        @NativeType("ovrPerfStatsPerCompositorFrame[ovrMaxProvidedFrameStats]")
        public OVRPerfStatsPerCompositorFrame.Buffer FrameStats() { return OVRPerfStats.nFrameStats(address()); }
        /** Returns a {@link OVRPerfStatsPerCompositorFrame} view of the struct at the specified index of the {@code FrameStats} field. */
        @NativeType("ovrPerfStatsPerCompositorFrame")
        public OVRPerfStatsPerCompositorFrame FrameStats(int index) { return OVRPerfStats.nFrameStats(address(), index); }
        /** Returns the value of the {@code FrameStatsCount} field. */
        public int FrameStatsCount() { return OVRPerfStats.nFrameStatsCount(address()); }
        /** Returns the value of the {@code AnyFrameStatsDropped} field. */
        @NativeType("ovrBool")
        public boolean AnyFrameStatsDropped() { return OVRPerfStats.nAnyFrameStatsDropped(address()); }
        /** Returns the value of the {@code AdaptiveGpuPerformanceScale} field. */
        public float AdaptiveGpuPerformanceScale() { return OVRPerfStats.nAdaptiveGpuPerformanceScale(address()); }
        /** Returns the value of the {@code AswIsAvailable} field. */
        @NativeType("ovrBool")
        public boolean AswIsAvailable() { return OVRPerfStats.nAswIsAvailable(address()); }
        /** Returns the value of the {@code VisibleProcessId} field. */
        @NativeType("ovrProcessId")
        public int VisibleProcessId() { return OVRPerfStats.nVisibleProcessId(address()); }

    }

}