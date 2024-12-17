/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrMaxProvidedFrameStats;

/**
 * <pre>{@code
 * struct ovrPerfStats {
 *     {@link OVRPerfStatsPerCompositorFrame ovrPerfStatsPerCompositorFrame} FrameStats[ovrMaxProvidedFrameStats];
 *     int FrameStatsCount;
 *     ovrBool AnyFrameStatsDropped;
 *     float AdaptiveGpuPerformanceScale;
 *     ovrBool AswIsAvailable;
 *     ovrProcessId VisibleProcessId;
 * }}</pre>
 */
@NativeType("struct ovrPerfStats")
public class OVRPerfStats extends Struct<OVRPerfStats> implements NativeResource {

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

    protected OVRPerfStats(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRPerfStats create(long address, @Nullable ByteBuffer container) {
        return new OVRPerfStats(address, container);
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

    /** @return a {@link OVRPerfStatsPerCompositorFrame}.Buffer view of the {@code FrameStats} field. */
    @NativeType("ovrPerfStatsPerCompositorFrame[ovrMaxProvidedFrameStats]")
    public OVRPerfStatsPerCompositorFrame.Buffer FrameStats() { return nFrameStats(address()); }
    /** @return a {@link OVRPerfStatsPerCompositorFrame} view of the struct at the specified index of the {@code FrameStats} field. */
    @NativeType("ovrPerfStatsPerCompositorFrame")
    public OVRPerfStatsPerCompositorFrame FrameStats(int index) { return nFrameStats(address(), index); }
    /** @return the value of the {@code FrameStatsCount} field. */
    public int FrameStatsCount() { return nFrameStatsCount(address()); }
    /** @return the value of the {@code AnyFrameStatsDropped} field. */
    @NativeType("ovrBool")
    public boolean AnyFrameStatsDropped() { return nAnyFrameStatsDropped(address()); }
    /** @return the value of the {@code AdaptiveGpuPerformanceScale} field. */
    public float AdaptiveGpuPerformanceScale() { return nAdaptiveGpuPerformanceScale(address()); }
    /** @return the value of the {@code AswIsAvailable} field. */
    @NativeType("ovrBool")
    public boolean AswIsAvailable() { return nAswIsAvailable(address()); }
    /** @return the value of the {@code VisibleProcessId} field. */
    @NativeType("ovrProcessId")
    public int VisibleProcessId() { return nVisibleProcessId(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRPerfStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRPerfStats malloc() {
        return new OVRPerfStats(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRPerfStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRPerfStats calloc() {
        return new OVRPerfStats(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRPerfStats} instance allocated with {@link BufferUtils}. */
    public static OVRPerfStats create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRPerfStats(memAddress(container), container);
    }

    /** Returns a new {@code OVRPerfStats} instance for the specified memory address. */
    public static OVRPerfStats create(long address) {
        return new OVRPerfStats(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRPerfStats createSafe(long address) {
        return address == NULL ? null : new OVRPerfStats(address, null);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRPerfStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRPerfStats.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPerfStats.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRPerfStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPerfStats malloc(MemoryStack stack) {
        return new OVRPerfStats(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRPerfStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPerfStats calloc(MemoryStack stack) {
        return new OVRPerfStats(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPerfStats.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FrameStats}. */
    public static OVRPerfStatsPerCompositorFrame.Buffer nFrameStats(long struct) { return OVRPerfStatsPerCompositorFrame.create(struct + OVRPerfStats.FRAMESTATS, nFrameStatsCount(struct)); }
    /** Unsafe version of {@link #FrameStats(int) FrameStats}. */
    public static OVRPerfStatsPerCompositorFrame nFrameStats(long struct, int index) {
        return OVRPerfStatsPerCompositorFrame.create(struct + OVRPerfStats.FRAMESTATS + check(index, nFrameStatsCount(struct)) * OVRPerfStatsPerCompositorFrame.SIZEOF);
    }
    /** Unsafe version of {@link #FrameStatsCount}. */
    public static int nFrameStatsCount(long struct) { return memGetInt(struct + OVRPerfStats.FRAMESTATSCOUNT); }
    /** Unsafe version of {@link #AnyFrameStatsDropped}. */
    public static boolean nAnyFrameStatsDropped(long struct) { return memGetByte(struct + OVRPerfStats.ANYFRAMESTATSDROPPED) != 0; }
    /** Unsafe version of {@link #AdaptiveGpuPerformanceScale}. */
    public static float nAdaptiveGpuPerformanceScale(long struct) { return memGetFloat(struct + OVRPerfStats.ADAPTIVEGPUPERFORMANCESCALE); }
    /** Unsafe version of {@link #AswIsAvailable}. */
    public static boolean nAswIsAvailable(long struct) { return memGetByte(struct + OVRPerfStats.ASWISAVAILABLE) != 0; }
    /** Unsafe version of {@link #VisibleProcessId}. */
    public static int nVisibleProcessId(long struct) { return memGetInt(struct + OVRPerfStats.VISIBLEPROCESSID); }

    // -----------------------------------

    /** An array of {@link OVRPerfStats} structs. */
    public static class Buffer extends StructBuffer<OVRPerfStats, Buffer> implements NativeResource {

        private static final OVRPerfStats ELEMENT_FACTORY = OVRPerfStats.create(-1L);

        /**
         * Creates a new {@code OVRPerfStats.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRPerfStats#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRPerfStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRPerfStatsPerCompositorFrame}.Buffer view of the {@code FrameStats} field. */
        @NativeType("ovrPerfStatsPerCompositorFrame[ovrMaxProvidedFrameStats]")
        public OVRPerfStatsPerCompositorFrame.Buffer FrameStats() { return OVRPerfStats.nFrameStats(address()); }
        /** @return a {@link OVRPerfStatsPerCompositorFrame} view of the struct at the specified index of the {@code FrameStats} field. */
        @NativeType("ovrPerfStatsPerCompositorFrame")
        public OVRPerfStatsPerCompositorFrame FrameStats(int index) { return OVRPerfStats.nFrameStats(address(), index); }
        /** @return the value of the {@code FrameStatsCount} field. */
        public int FrameStatsCount() { return OVRPerfStats.nFrameStatsCount(address()); }
        /** @return the value of the {@code AnyFrameStatsDropped} field. */
        @NativeType("ovrBool")
        public boolean AnyFrameStatsDropped() { return OVRPerfStats.nAnyFrameStatsDropped(address()); }
        /** @return the value of the {@code AdaptiveGpuPerformanceScale} field. */
        public float AdaptiveGpuPerformanceScale() { return OVRPerfStats.nAdaptiveGpuPerformanceScale(address()); }
        /** @return the value of the {@code AswIsAvailable} field. */
        @NativeType("ovrBool")
        public boolean AswIsAvailable() { return OVRPerfStats.nAswIsAvailable(address()); }
        /** @return the value of the {@code VisibleProcessId} field. */
        @NativeType("ovrProcessId")
        public int VisibleProcessId() { return OVRPerfStats.nVisibleProcessId(address()); }

    }

}