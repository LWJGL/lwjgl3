/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.bgfx.BGFX.BGFX_TOPOLOGY_COUNT;

/**
 * <pre>{@code
 * struct bgfx_stats_t {
 *     int64_t cpuTimeFrame;
 *     int64_t cpuTimeBegin;
 *     int64_t cpuTimeEnd;
 *     int64_t cpuTimerFreq;
 *     int64_t gpuTimeBegin;
 *     int64_t gpuTimeEnd;
 *     int64_t gpuTimerFreq;
 *     int64_t waitRender;
 *     int64_t waitSubmit;
 *     uint32_t numDraw;
 *     uint32_t numCompute;
 *     uint32_t numBlit;
 *     uint32_t maxGpuLatency;
 *     uint32_t gpuFrameNum;
 *     uint16_t numDynamicIndexBuffers;
 *     uint16_t numDynamicVertexBuffers;
 *     uint16_t numFrameBuffers;
 *     uint16_t numIndexBuffers;
 *     uint16_t numOcclusionQueries;
 *     uint16_t numPrograms;
 *     uint16_t numShaders;
 *     uint16_t numTextures;
 *     uint16_t numUniforms;
 *     uint16_t numVertexBuffers;
 *     uint16_t numVertexLayouts;
 *     int64_t textureMemoryUsed;
 *     int64_t rtMemoryUsed;
 *     int32_t transientVbUsed;
 *     int32_t transientIbUsed;
 *     uint32_t numPrims[BGFX_TOPOLOGY_COUNT];
 *     int64_t gpuMemoryMax;
 *     int64_t gpuMemoryUsed;
 *     uint16_t width;
 *     uint16_t height;
 *     uint16_t textWidth;
 *     uint16_t textHeight;
 *     uint16_t numViews;
 *     {@link BGFXViewStats bgfx_view_stats_t} * viewStats;
 *     uint16_t numEncoders;
 *     {@link BGFXEncoderStats bgfx_encoder_stats_t} * encoderStats;
 * }}</pre>
 */
@NativeType("struct bgfx_stats_t")
public class BGFXStats extends Struct<BGFXStats> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPUTIMEFRAME,
        CPUTIMEBEGIN,
        CPUTIMEEND,
        CPUTIMERFREQ,
        GPUTIMEBEGIN,
        GPUTIMEEND,
        GPUTIMERFREQ,
        WAITRENDER,
        WAITSUBMIT,
        NUMDRAW,
        NUMCOMPUTE,
        NUMBLIT,
        MAXGPULATENCY,
        GPUFRAMENUM,
        NUMDYNAMICINDEXBUFFERS,
        NUMDYNAMICVERTEXBUFFERS,
        NUMFRAMEBUFFERS,
        NUMINDEXBUFFERS,
        NUMOCCLUSIONQUERIES,
        NUMPROGRAMS,
        NUMSHADERS,
        NUMTEXTURES,
        NUMUNIFORMS,
        NUMVERTEXBUFFERS,
        NUMVERTEXLAYOUTS,
        TEXTUREMEMORYUSED,
        RTMEMORYUSED,
        TRANSIENTVBUSED,
        TRANSIENTIBUSED,
        NUMPRIMS,
        GPUMEMORYMAX,
        GPUMEMORYUSED,
        WIDTH,
        HEIGHT,
        TEXTWIDTH,
        TEXTHEIGHT,
        NUMVIEWS,
        VIEWSTATS,
        NUMENCODERS,
        ENCODERSTATS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __array(4, BGFX_TOPOLOGY_COUNT),
            __member(8),
            __member(8),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(2),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPUTIMEFRAME = layout.offsetof(0);
        CPUTIMEBEGIN = layout.offsetof(1);
        CPUTIMEEND = layout.offsetof(2);
        CPUTIMERFREQ = layout.offsetof(3);
        GPUTIMEBEGIN = layout.offsetof(4);
        GPUTIMEEND = layout.offsetof(5);
        GPUTIMERFREQ = layout.offsetof(6);
        WAITRENDER = layout.offsetof(7);
        WAITSUBMIT = layout.offsetof(8);
        NUMDRAW = layout.offsetof(9);
        NUMCOMPUTE = layout.offsetof(10);
        NUMBLIT = layout.offsetof(11);
        MAXGPULATENCY = layout.offsetof(12);
        GPUFRAMENUM = layout.offsetof(13);
        NUMDYNAMICINDEXBUFFERS = layout.offsetof(14);
        NUMDYNAMICVERTEXBUFFERS = layout.offsetof(15);
        NUMFRAMEBUFFERS = layout.offsetof(16);
        NUMINDEXBUFFERS = layout.offsetof(17);
        NUMOCCLUSIONQUERIES = layout.offsetof(18);
        NUMPROGRAMS = layout.offsetof(19);
        NUMSHADERS = layout.offsetof(20);
        NUMTEXTURES = layout.offsetof(21);
        NUMUNIFORMS = layout.offsetof(22);
        NUMVERTEXBUFFERS = layout.offsetof(23);
        NUMVERTEXLAYOUTS = layout.offsetof(24);
        TEXTUREMEMORYUSED = layout.offsetof(25);
        RTMEMORYUSED = layout.offsetof(26);
        TRANSIENTVBUSED = layout.offsetof(27);
        TRANSIENTIBUSED = layout.offsetof(28);
        NUMPRIMS = layout.offsetof(29);
        GPUMEMORYMAX = layout.offsetof(30);
        GPUMEMORYUSED = layout.offsetof(31);
        WIDTH = layout.offsetof(32);
        HEIGHT = layout.offsetof(33);
        TEXTWIDTH = layout.offsetof(34);
        TEXTHEIGHT = layout.offsetof(35);
        NUMVIEWS = layout.offsetof(36);
        VIEWSTATS = layout.offsetof(37);
        NUMENCODERS = layout.offsetof(38);
        ENCODERSTATS = layout.offsetof(39);
    }

    protected BGFXStats(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXStats create(long address, @Nullable ByteBuffer container) {
        return new BGFXStats(address, container);
    }

    /**
     * Creates a {@code BGFXStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXStats(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cpuTimeFrame} field. */
    @NativeType("int64_t")
    public long cpuTimeFrame() { return ncpuTimeFrame(address()); }
    /** @return the value of the {@code cpuTimeBegin} field. */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** @return the value of the {@code cpuTimeEnd} field. */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }
    /** @return the value of the {@code cpuTimerFreq} field. */
    @NativeType("int64_t")
    public long cpuTimerFreq() { return ncpuTimerFreq(address()); }
    /** @return the value of the {@code gpuTimeBegin} field. */
    @NativeType("int64_t")
    public long gpuTimeBegin() { return ngpuTimeBegin(address()); }
    /** @return the value of the {@code gpuTimeEnd} field. */
    @NativeType("int64_t")
    public long gpuTimeEnd() { return ngpuTimeEnd(address()); }
    /** @return the value of the {@code gpuTimerFreq} field. */
    @NativeType("int64_t")
    public long gpuTimerFreq() { return ngpuTimerFreq(address()); }
    /** @return the value of the {@code waitRender} field. */
    @NativeType("int64_t")
    public long waitRender() { return nwaitRender(address()); }
    /** @return the value of the {@code waitSubmit} field. */
    @NativeType("int64_t")
    public long waitSubmit() { return nwaitSubmit(address()); }
    /** @return the value of the {@code numDraw} field. */
    @NativeType("uint32_t")
    public int numDraw() { return nnumDraw(address()); }
    /** @return the value of the {@code numCompute} field. */
    @NativeType("uint32_t")
    public int numCompute() { return nnumCompute(address()); }
    /** @return the value of the {@code numBlit} field. */
    @NativeType("uint32_t")
    public int numBlit() { return nnumBlit(address()); }
    /** @return the value of the {@code maxGpuLatency} field. */
    @NativeType("uint32_t")
    public int maxGpuLatency() { return nmaxGpuLatency(address()); }
    /** @return the value of the {@code gpuFrameNum} field. */
    @NativeType("uint32_t")
    public int gpuFrameNum() { return ngpuFrameNum(address()); }
    /** @return the value of the {@code numDynamicIndexBuffers} field. */
    @NativeType("uint16_t")
    public short numDynamicIndexBuffers() { return nnumDynamicIndexBuffers(address()); }
    /** @return the value of the {@code numDynamicVertexBuffers} field. */
    @NativeType("uint16_t")
    public short numDynamicVertexBuffers() { return nnumDynamicVertexBuffers(address()); }
    /** @return the value of the {@code numFrameBuffers} field. */
    @NativeType("uint16_t")
    public short numFrameBuffers() { return nnumFrameBuffers(address()); }
    /** @return the value of the {@code numIndexBuffers} field. */
    @NativeType("uint16_t")
    public short numIndexBuffers() { return nnumIndexBuffers(address()); }
    /** @return the value of the {@code numOcclusionQueries} field. */
    @NativeType("uint16_t")
    public short numOcclusionQueries() { return nnumOcclusionQueries(address()); }
    /** @return the value of the {@code numPrograms} field. */
    @NativeType("uint16_t")
    public short numPrograms() { return nnumPrograms(address()); }
    /** @return the value of the {@code numShaders} field. */
    @NativeType("uint16_t")
    public short numShaders() { return nnumShaders(address()); }
    /** @return the value of the {@code numTextures} field. */
    @NativeType("uint16_t")
    public short numTextures() { return nnumTextures(address()); }
    /** @return the value of the {@code numUniforms} field. */
    @NativeType("uint16_t")
    public short numUniforms() { return nnumUniforms(address()); }
    /** @return the value of the {@code numVertexBuffers} field. */
    @NativeType("uint16_t")
    public short numVertexBuffers() { return nnumVertexBuffers(address()); }
    /** @return the value of the {@code numVertexLayouts} field. */
    @NativeType("uint16_t")
    public short numVertexLayouts() { return nnumVertexLayouts(address()); }
    /** @return the value of the {@code textureMemoryUsed} field. */
    @NativeType("int64_t")
    public long textureMemoryUsed() { return ntextureMemoryUsed(address()); }
    /** @return the value of the {@code rtMemoryUsed} field. */
    @NativeType("int64_t")
    public long rtMemoryUsed() { return nrtMemoryUsed(address()); }
    /** @return the value of the {@code transientVbUsed} field. */
    @NativeType("int32_t")
    public int transientVbUsed() { return ntransientVbUsed(address()); }
    /** @return the value of the {@code transientIbUsed} field. */
    @NativeType("int32_t")
    public int transientIbUsed() { return ntransientIbUsed(address()); }
    /** @return a {@link IntBuffer} view of the {@code numPrims} field. */
    @NativeType("uint32_t[BGFX_TOPOLOGY_COUNT]")
    public IntBuffer numPrims() { return nnumPrims(address()); }
    /** @return the value at the specified index of the {@code numPrims} field. */
    @NativeType("uint32_t")
    public int numPrims(int index) { return nnumPrims(address(), index); }
    /** @return the value of the {@code gpuMemoryMax} field. */
    @NativeType("int64_t")
    public long gpuMemoryMax() { return ngpuMemoryMax(address()); }
    /** @return the value of the {@code gpuMemoryUsed} field. */
    @NativeType("int64_t")
    public long gpuMemoryUsed() { return ngpuMemoryUsed(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** @return the value of the {@code textWidth} field. */
    @NativeType("uint16_t")
    public short textWidth() { return ntextWidth(address()); }
    /** @return the value of the {@code textHeight} field. */
    @NativeType("uint16_t")
    public short textHeight() { return ntextHeight(address()); }
    /** @return the value of the {@code numViews} field. */
    @NativeType("uint16_t")
    public short numViews() { return nnumViews(address()); }
    /** @return a {@link BGFXViewStats.Buffer} view of the struct array pointed to by the {@code viewStats} field. */
    @NativeType("bgfx_view_stats_t *")
    public BGFXViewStats.Buffer viewStats() { return nviewStats(address()); }
    /** @return the value of the {@code numEncoders} field. */
    @NativeType("uint16_t")
    public short numEncoders() { return nnumEncoders(address()); }
    /** @return a {@link BGFXEncoderStats.Buffer} view of the struct array pointed to by the {@code encoderStats} field. */
    @NativeType("bgfx_encoder_stats_t *")
    public BGFXEncoderStats.Buffer encoderStats() { return nencoderStats(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXStats} instance for the specified memory address. */
    public static BGFXStats create(long address) {
        return new BGFXStats(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXStats createSafe(long address) {
        return address == NULL ? null : new BGFXStats(address, null);
    }

    /**
     * Create a {@link BGFXStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXStats.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXStats.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpuTimeFrame}. */
    public static long ncpuTimeFrame(long struct) { return memGetLong(struct + BGFXStats.CPUTIMEFRAME); }
    /** Unsafe version of {@link #cpuTimeBegin}. */
    public static long ncpuTimeBegin(long struct) { return memGetLong(struct + BGFXStats.CPUTIMEBEGIN); }
    /** Unsafe version of {@link #cpuTimeEnd}. */
    public static long ncpuTimeEnd(long struct) { return memGetLong(struct + BGFXStats.CPUTIMEEND); }
    /** Unsafe version of {@link #cpuTimerFreq}. */
    public static long ncpuTimerFreq(long struct) { return memGetLong(struct + BGFXStats.CPUTIMERFREQ); }
    /** Unsafe version of {@link #gpuTimeBegin}. */
    public static long ngpuTimeBegin(long struct) { return memGetLong(struct + BGFXStats.GPUTIMEBEGIN); }
    /** Unsafe version of {@link #gpuTimeEnd}. */
    public static long ngpuTimeEnd(long struct) { return memGetLong(struct + BGFXStats.GPUTIMEEND); }
    /** Unsafe version of {@link #gpuTimerFreq}. */
    public static long ngpuTimerFreq(long struct) { return memGetLong(struct + BGFXStats.GPUTIMERFREQ); }
    /** Unsafe version of {@link #waitRender}. */
    public static long nwaitRender(long struct) { return memGetLong(struct + BGFXStats.WAITRENDER); }
    /** Unsafe version of {@link #waitSubmit}. */
    public static long nwaitSubmit(long struct) { return memGetLong(struct + BGFXStats.WAITSUBMIT); }
    /** Unsafe version of {@link #numDraw}. */
    public static int nnumDraw(long struct) { return memGetInt(struct + BGFXStats.NUMDRAW); }
    /** Unsafe version of {@link #numCompute}. */
    public static int nnumCompute(long struct) { return memGetInt(struct + BGFXStats.NUMCOMPUTE); }
    /** Unsafe version of {@link #numBlit}. */
    public static int nnumBlit(long struct) { return memGetInt(struct + BGFXStats.NUMBLIT); }
    /** Unsafe version of {@link #maxGpuLatency}. */
    public static int nmaxGpuLatency(long struct) { return memGetInt(struct + BGFXStats.MAXGPULATENCY); }
    /** Unsafe version of {@link #gpuFrameNum}. */
    public static int ngpuFrameNum(long struct) { return memGetInt(struct + BGFXStats.GPUFRAMENUM); }
    /** Unsafe version of {@link #numDynamicIndexBuffers}. */
    public static short nnumDynamicIndexBuffers(long struct) { return memGetShort(struct + BGFXStats.NUMDYNAMICINDEXBUFFERS); }
    /** Unsafe version of {@link #numDynamicVertexBuffers}. */
    public static short nnumDynamicVertexBuffers(long struct) { return memGetShort(struct + BGFXStats.NUMDYNAMICVERTEXBUFFERS); }
    /** Unsafe version of {@link #numFrameBuffers}. */
    public static short nnumFrameBuffers(long struct) { return memGetShort(struct + BGFXStats.NUMFRAMEBUFFERS); }
    /** Unsafe version of {@link #numIndexBuffers}. */
    public static short nnumIndexBuffers(long struct) { return memGetShort(struct + BGFXStats.NUMINDEXBUFFERS); }
    /** Unsafe version of {@link #numOcclusionQueries}. */
    public static short nnumOcclusionQueries(long struct) { return memGetShort(struct + BGFXStats.NUMOCCLUSIONQUERIES); }
    /** Unsafe version of {@link #numPrograms}. */
    public static short nnumPrograms(long struct) { return memGetShort(struct + BGFXStats.NUMPROGRAMS); }
    /** Unsafe version of {@link #numShaders}. */
    public static short nnumShaders(long struct) { return memGetShort(struct + BGFXStats.NUMSHADERS); }
    /** Unsafe version of {@link #numTextures}. */
    public static short nnumTextures(long struct) { return memGetShort(struct + BGFXStats.NUMTEXTURES); }
    /** Unsafe version of {@link #numUniforms}. */
    public static short nnumUniforms(long struct) { return memGetShort(struct + BGFXStats.NUMUNIFORMS); }
    /** Unsafe version of {@link #numVertexBuffers}. */
    public static short nnumVertexBuffers(long struct) { return memGetShort(struct + BGFXStats.NUMVERTEXBUFFERS); }
    /** Unsafe version of {@link #numVertexLayouts}. */
    public static short nnumVertexLayouts(long struct) { return memGetShort(struct + BGFXStats.NUMVERTEXLAYOUTS); }
    /** Unsafe version of {@link #textureMemoryUsed}. */
    public static long ntextureMemoryUsed(long struct) { return memGetLong(struct + BGFXStats.TEXTUREMEMORYUSED); }
    /** Unsafe version of {@link #rtMemoryUsed}. */
    public static long nrtMemoryUsed(long struct) { return memGetLong(struct + BGFXStats.RTMEMORYUSED); }
    /** Unsafe version of {@link #transientVbUsed}. */
    public static int ntransientVbUsed(long struct) { return memGetInt(struct + BGFXStats.TRANSIENTVBUSED); }
    /** Unsafe version of {@link #transientIbUsed}. */
    public static int ntransientIbUsed(long struct) { return memGetInt(struct + BGFXStats.TRANSIENTIBUSED); }
    /** Unsafe version of {@link #numPrims}. */
    public static IntBuffer nnumPrims(long struct) { return memIntBuffer(struct + BGFXStats.NUMPRIMS, BGFX_TOPOLOGY_COUNT); }
    /** Unsafe version of {@link #numPrims(int) numPrims}. */
    public static int nnumPrims(long struct, int index) {
        return memGetInt(struct + BGFXStats.NUMPRIMS + check(index, BGFX_TOPOLOGY_COUNT) * 4);
    }
    /** Unsafe version of {@link #gpuMemoryMax}. */
    public static long ngpuMemoryMax(long struct) { return memGetLong(struct + BGFXStats.GPUMEMORYMAX); }
    /** Unsafe version of {@link #gpuMemoryUsed}. */
    public static long ngpuMemoryUsed(long struct) { return memGetLong(struct + BGFXStats.GPUMEMORYUSED); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return memGetShort(struct + BGFXStats.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return memGetShort(struct + BGFXStats.HEIGHT); }
    /** Unsafe version of {@link #textWidth}. */
    public static short ntextWidth(long struct) { return memGetShort(struct + BGFXStats.TEXTWIDTH); }
    /** Unsafe version of {@link #textHeight}. */
    public static short ntextHeight(long struct) { return memGetShort(struct + BGFXStats.TEXTHEIGHT); }
    /** Unsafe version of {@link #numViews}. */
    public static short nnumViews(long struct) { return memGetShort(struct + BGFXStats.NUMVIEWS); }
    /** Unsafe version of {@link #viewStats}. */
    public static BGFXViewStats.Buffer nviewStats(long struct) { return BGFXViewStats.create(memGetAddress(struct + BGFXStats.VIEWSTATS), Short.toUnsignedInt(nnumViews(struct))); }
    /** Unsafe version of {@link #numEncoders}. */
    public static short nnumEncoders(long struct) { return memGetShort(struct + BGFXStats.NUMENCODERS); }
    /** Unsafe version of {@link #encoderStats}. */
    public static BGFXEncoderStats.Buffer nencoderStats(long struct) { return BGFXEncoderStats.create(memGetAddress(struct + BGFXStats.ENCODERSTATS), Short.toUnsignedInt(nnumEncoders(struct))); }

    // -----------------------------------

    /** An array of {@link BGFXStats} structs. */
    public static class Buffer extends StructBuffer<BGFXStats, Buffer> {

        private static final BGFXStats ELEMENT_FACTORY = BGFXStats.create(-1L);

        /**
         * Creates a new {@code BGFXStats.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXStats#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cpuTimeFrame} field. */
        @NativeType("int64_t")
        public long cpuTimeFrame() { return BGFXStats.ncpuTimeFrame(address()); }
        /** @return the value of the {@code cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXStats.ncpuTimeBegin(address()); }
        /** @return the value of the {@code cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXStats.ncpuTimeEnd(address()); }
        /** @return the value of the {@code cpuTimerFreq} field. */
        @NativeType("int64_t")
        public long cpuTimerFreq() { return BGFXStats.ncpuTimerFreq(address()); }
        /** @return the value of the {@code gpuTimeBegin} field. */
        @NativeType("int64_t")
        public long gpuTimeBegin() { return BGFXStats.ngpuTimeBegin(address()); }
        /** @return the value of the {@code gpuTimeEnd} field. */
        @NativeType("int64_t")
        public long gpuTimeEnd() { return BGFXStats.ngpuTimeEnd(address()); }
        /** @return the value of the {@code gpuTimerFreq} field. */
        @NativeType("int64_t")
        public long gpuTimerFreq() { return BGFXStats.ngpuTimerFreq(address()); }
        /** @return the value of the {@code waitRender} field. */
        @NativeType("int64_t")
        public long waitRender() { return BGFXStats.nwaitRender(address()); }
        /** @return the value of the {@code waitSubmit} field. */
        @NativeType("int64_t")
        public long waitSubmit() { return BGFXStats.nwaitSubmit(address()); }
        /** @return the value of the {@code numDraw} field. */
        @NativeType("uint32_t")
        public int numDraw() { return BGFXStats.nnumDraw(address()); }
        /** @return the value of the {@code numCompute} field. */
        @NativeType("uint32_t")
        public int numCompute() { return BGFXStats.nnumCompute(address()); }
        /** @return the value of the {@code numBlit} field. */
        @NativeType("uint32_t")
        public int numBlit() { return BGFXStats.nnumBlit(address()); }
        /** @return the value of the {@code maxGpuLatency} field. */
        @NativeType("uint32_t")
        public int maxGpuLatency() { return BGFXStats.nmaxGpuLatency(address()); }
        /** @return the value of the {@code gpuFrameNum} field. */
        @NativeType("uint32_t")
        public int gpuFrameNum() { return BGFXStats.ngpuFrameNum(address()); }
        /** @return the value of the {@code numDynamicIndexBuffers} field. */
        @NativeType("uint16_t")
        public short numDynamicIndexBuffers() { return BGFXStats.nnumDynamicIndexBuffers(address()); }
        /** @return the value of the {@code numDynamicVertexBuffers} field. */
        @NativeType("uint16_t")
        public short numDynamicVertexBuffers() { return BGFXStats.nnumDynamicVertexBuffers(address()); }
        /** @return the value of the {@code numFrameBuffers} field. */
        @NativeType("uint16_t")
        public short numFrameBuffers() { return BGFXStats.nnumFrameBuffers(address()); }
        /** @return the value of the {@code numIndexBuffers} field. */
        @NativeType("uint16_t")
        public short numIndexBuffers() { return BGFXStats.nnumIndexBuffers(address()); }
        /** @return the value of the {@code numOcclusionQueries} field. */
        @NativeType("uint16_t")
        public short numOcclusionQueries() { return BGFXStats.nnumOcclusionQueries(address()); }
        /** @return the value of the {@code numPrograms} field. */
        @NativeType("uint16_t")
        public short numPrograms() { return BGFXStats.nnumPrograms(address()); }
        /** @return the value of the {@code numShaders} field. */
        @NativeType("uint16_t")
        public short numShaders() { return BGFXStats.nnumShaders(address()); }
        /** @return the value of the {@code numTextures} field. */
        @NativeType("uint16_t")
        public short numTextures() { return BGFXStats.nnumTextures(address()); }
        /** @return the value of the {@code numUniforms} field. */
        @NativeType("uint16_t")
        public short numUniforms() { return BGFXStats.nnumUniforms(address()); }
        /** @return the value of the {@code numVertexBuffers} field. */
        @NativeType("uint16_t")
        public short numVertexBuffers() { return BGFXStats.nnumVertexBuffers(address()); }
        /** @return the value of the {@code numVertexLayouts} field. */
        @NativeType("uint16_t")
        public short numVertexLayouts() { return BGFXStats.nnumVertexLayouts(address()); }
        /** @return the value of the {@code textureMemoryUsed} field. */
        @NativeType("int64_t")
        public long textureMemoryUsed() { return BGFXStats.ntextureMemoryUsed(address()); }
        /** @return the value of the {@code rtMemoryUsed} field. */
        @NativeType("int64_t")
        public long rtMemoryUsed() { return BGFXStats.nrtMemoryUsed(address()); }
        /** @return the value of the {@code transientVbUsed} field. */
        @NativeType("int32_t")
        public int transientVbUsed() { return BGFXStats.ntransientVbUsed(address()); }
        /** @return the value of the {@code transientIbUsed} field. */
        @NativeType("int32_t")
        public int transientIbUsed() { return BGFXStats.ntransientIbUsed(address()); }
        /** @return a {@link IntBuffer} view of the {@code numPrims} field. */
        @NativeType("uint32_t[BGFX_TOPOLOGY_COUNT]")
        public IntBuffer numPrims() { return BGFXStats.nnumPrims(address()); }
        /** @return the value at the specified index of the {@code numPrims} field. */
        @NativeType("uint32_t")
        public int numPrims(int index) { return BGFXStats.nnumPrims(address(), index); }
        /** @return the value of the {@code gpuMemoryMax} field. */
        @NativeType("int64_t")
        public long gpuMemoryMax() { return BGFXStats.ngpuMemoryMax(address()); }
        /** @return the value of the {@code gpuMemoryUsed} field. */
        @NativeType("int64_t")
        public long gpuMemoryUsed() { return BGFXStats.ngpuMemoryUsed(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint16_t")
        public short width() { return BGFXStats.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint16_t")
        public short height() { return BGFXStats.nheight(address()); }
        /** @return the value of the {@code textWidth} field. */
        @NativeType("uint16_t")
        public short textWidth() { return BGFXStats.ntextWidth(address()); }
        /** @return the value of the {@code textHeight} field. */
        @NativeType("uint16_t")
        public short textHeight() { return BGFXStats.ntextHeight(address()); }
        /** @return the value of the {@code numViews} field. */
        @NativeType("uint16_t")
        public short numViews() { return BGFXStats.nnumViews(address()); }
        /** @return a {@link BGFXViewStats.Buffer} view of the struct array pointed to by the {@code viewStats} field. */
        @NativeType("bgfx_view_stats_t *")
        public BGFXViewStats.Buffer viewStats() { return BGFXStats.nviewStats(address()); }
        /** @return the value of the {@code numEncoders} field. */
        @NativeType("uint16_t")
        public short numEncoders() { return BGFXStats.nnumEncoders(address()); }
        /** @return a {@link BGFXEncoderStats.Buffer} view of the struct array pointed to by the {@code encoderStats} field. */
        @NativeType("bgfx_encoder_stats_t *")
        public BGFXEncoderStats.Buffer encoderStats() { return BGFXStats.nencoderStats(address()); }

    }

}