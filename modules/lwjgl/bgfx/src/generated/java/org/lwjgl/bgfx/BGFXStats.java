/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Renderer statistics data.
 * 
 * <p>All time values are high-resolution timestamps, while time frequencies define timestamps-per-second for that hardware.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cpuTimeFrame} &ndash; CPU time between two {@link BGFX#bgfx_frame frame} calls</li>
 * <li>{@code cpuTimeBegin} &ndash; Render thread CPU submit begin time</li>
 * <li>{@code cpuTimeEnd} &ndash; Render thread CPU submit end time</li>
 * <li>{@code cpuTimerFreq} &ndash; CPU timer frequency. Timestamps-per-second.</li>
 * <li>{@code gpuTimeBegin} &ndash; GPU frame begin time</li>
 * <li>{@code gpuTimeEnd} &ndash; GPU frame end time</li>
 * <li>{@code gpuTimerFreq} &ndash; GPU timer frequency</li>
 * <li>{@code waitRender} &ndash; time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API</li>
 * <li>{@code waitSubmit} &ndash; time spent waiting for submit thread to advance to next frame</li>
 * <li>{@code numDraw} &ndash; number of draw calls submitted</li>
 * <li>{@code numCompute} &ndash; number of compute calls submitted</li>
 * <li>{@code maxGpuLatency} &ndash; GPU driver latency</li>
 * <li>{@code numDynamicIndexBuffers} &ndash; number of used dynamic index buffers</li>
 * <li>{@code numDynamicVertexBuffers} &ndash; number of used dynamic vertex buffers</li>
 * <li>{@code numFrameBuffers} &ndash; number of used frame buffers</li>
 * <li>{@code numIndexBuffers} &ndash; number of used index buffers</li>
 * <li>{@code numOcclusionQueries} &ndash; number of used occlusion queries</li>
 * <li>{@code numPrograms} &ndash; number of used programs</li>
 * <li>{@code numShaders} &ndash; number of used shaders</li>
 * <li>{@code numTextures} &ndash; number of used textures</li>
 * <li>{@code numUniforms} &ndash; number of used uniforms</li>
 * <li>{@code numVertexBuffers} &ndash; number of used vertex buffers</li>
 * <li>{@code numVertexDecls} &ndash; number of used vertex declarations</li>
 * <li>{@code gpuMemoryMax} &ndash; maximum available GPU memory for application</li>
 * <li>{@code gpuMemoryUsed} &ndash; amount of GPU memory used by the application</li>
 * <li>{@code width} &ndash; backbuffer width in pixels</li>
 * <li>{@code height} &ndash; backbuffer height in pixels</li>
 * <li>{@code textWidth} &ndash; debug text width in characters</li>
 * <li>{@code textHeight} &ndash; debug text height in characters</li>
 * <li>{@code numViews} &ndash; number of view stats</li>
 * <li>{@code viewStats} &ndash; array of view stats</li>
 * <li>{@code numEncoder} &ndash; number of encoders used during frame</li>
 * <li>{@code encoderStats} &ndash; array of encoder stats</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
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
 *     uint32_t maxGpuLatency;
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
 *     uint16_t numVertexDecls;
 *     int64_t textureMemoryUsed;
 *     int64_t rtMemoryUsed;
 *     int64_t gpuMemoryMax;
 *     int64_t gpuMemoryUsed;
 *     uint16_t width;
 *     uint16_t height;
 *     uint16_t textWidth;
 *     uint16_t textHeight;
 *     uint16_t numViews;
 *     {@link BGFXViewStats bgfx_view_stats_t} * viewStats;
 *     uint16_t numEncoder;
 *     {@link BGFXEncoderStats bgfx_encoder_stats_t} * encoderStats;
 * }</pre></code>
 */
@NativeType("struct bgfx_stats_t")
public class BGFXStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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
        MAXGPULATENCY,
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
        NUMVERTEXDECLS,
        TEXTUREMEMORYUSED,
        RTMEMORYUSED,
        GPUMEMORYMAX,
        GPUMEMORYUSED,
        WIDTH,
        HEIGHT,
        TEXTWIDTH,
        TEXTHEIGHT,
        NUMVIEWS,
        VIEWSTATS,
        NUMENCODER,
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
        MAXGPULATENCY = layout.offsetof(11);
        NUMDYNAMICINDEXBUFFERS = layout.offsetof(12);
        NUMDYNAMICVERTEXBUFFERS = layout.offsetof(13);
        NUMFRAMEBUFFERS = layout.offsetof(14);
        NUMINDEXBUFFERS = layout.offsetof(15);
        NUMOCCLUSIONQUERIES = layout.offsetof(16);
        NUMPROGRAMS = layout.offsetof(17);
        NUMSHADERS = layout.offsetof(18);
        NUMTEXTURES = layout.offsetof(19);
        NUMUNIFORMS = layout.offsetof(20);
        NUMVERTEXBUFFERS = layout.offsetof(21);
        NUMVERTEXDECLS = layout.offsetof(22);
        TEXTUREMEMORYUSED = layout.offsetof(23);
        RTMEMORYUSED = layout.offsetof(24);
        GPUMEMORYMAX = layout.offsetof(25);
        GPUMEMORYUSED = layout.offsetof(26);
        WIDTH = layout.offsetof(27);
        HEIGHT = layout.offsetof(28);
        TEXTWIDTH = layout.offsetof(29);
        TEXTHEIGHT = layout.offsetof(30);
        NUMVIEWS = layout.offsetof(31);
        VIEWSTATS = layout.offsetof(32);
        NUMENCODER = layout.offsetof(33);
        ENCODERSTATS = layout.offsetof(34);
    }

    BGFXStats(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXStats(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code cpuTimeFrame} field. */
    @NativeType("int64_t")
    public long cpuTimeFrame() { return ncpuTimeFrame(address()); }
    /** Returns the value of the {@code cpuTimeBegin} field. */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** Returns the value of the {@code cpuTimeEnd} field. */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }
    /** Returns the value of the {@code cpuTimerFreq} field. */
    @NativeType("int64_t")
    public long cpuTimerFreq() { return ncpuTimerFreq(address()); }
    /** Returns the value of the {@code gpuTimeBegin} field. */
    @NativeType("int64_t")
    public long gpuTimeBegin() { return ngpuTimeBegin(address()); }
    /** Returns the value of the {@code gpuTimeEnd} field. */
    @NativeType("int64_t")
    public long gpuTimeEnd() { return ngpuTimeEnd(address()); }
    /** Returns the value of the {@code gpuTimerFreq} field. */
    @NativeType("int64_t")
    public long gpuTimerFreq() { return ngpuTimerFreq(address()); }
    /** Returns the value of the {@code waitRender} field. */
    @NativeType("int64_t")
    public long waitRender() { return nwaitRender(address()); }
    /** Returns the value of the {@code waitSubmit} field. */
    @NativeType("int64_t")
    public long waitSubmit() { return nwaitSubmit(address()); }
    /** Returns the value of the {@code numDraw} field. */
    @NativeType("uint32_t")
    public int numDraw() { return nnumDraw(address()); }
    /** Returns the value of the {@code numCompute} field. */
    @NativeType("uint32_t")
    public int numCompute() { return nnumCompute(address()); }
    /** Returns the value of the {@code maxGpuLatency} field. */
    @NativeType("uint32_t")
    public int maxGpuLatency() { return nmaxGpuLatency(address()); }
    /** Returns the value of the {@code numDynamicIndexBuffers} field. */
    @NativeType("uint16_t")
    public short numDynamicIndexBuffers() { return nnumDynamicIndexBuffers(address()); }
    /** Returns the value of the {@code numDynamicVertexBuffers} field. */
    @NativeType("uint16_t")
    public short numDynamicVertexBuffers() { return nnumDynamicVertexBuffers(address()); }
    /** Returns the value of the {@code numFrameBuffers} field. */
    @NativeType("uint16_t")
    public short numFrameBuffers() { return nnumFrameBuffers(address()); }
    /** Returns the value of the {@code numIndexBuffers} field. */
    @NativeType("uint16_t")
    public short numIndexBuffers() { return nnumIndexBuffers(address()); }
    /** Returns the value of the {@code numOcclusionQueries} field. */
    @NativeType("uint16_t")
    public short numOcclusionQueries() { return nnumOcclusionQueries(address()); }
    /** Returns the value of the {@code numPrograms} field. */
    @NativeType("uint16_t")
    public short numPrograms() { return nnumPrograms(address()); }
    /** Returns the value of the {@code numShaders} field. */
    @NativeType("uint16_t")
    public short numShaders() { return nnumShaders(address()); }
    /** Returns the value of the {@code numTextures} field. */
    @NativeType("uint16_t")
    public short numTextures() { return nnumTextures(address()); }
    /** Returns the value of the {@code numUniforms} field. */
    @NativeType("uint16_t")
    public short numUniforms() { return nnumUniforms(address()); }
    /** Returns the value of the {@code numVertexBuffers} field. */
    @NativeType("uint16_t")
    public short numVertexBuffers() { return nnumVertexBuffers(address()); }
    /** Returns the value of the {@code numVertexDecls} field. */
    @NativeType("uint16_t")
    public short numVertexDecls() { return nnumVertexDecls(address()); }
    /** Returns the value of the {@code textureMemoryUsed} field. */
    @NativeType("int64_t")
    public long textureMemoryUsed() { return ntextureMemoryUsed(address()); }
    /** Returns the value of the {@code rtMemoryUsed} field. */
    @NativeType("int64_t")
    public long rtMemoryUsed() { return nrtMemoryUsed(address()); }
    /** Returns the value of the {@code gpuMemoryMax} field. */
    @NativeType("int64_t")
    public long gpuMemoryMax() { return ngpuMemoryMax(address()); }
    /** Returns the value of the {@code gpuMemoryUsed} field. */
    @NativeType("int64_t")
    public long gpuMemoryUsed() { return ngpuMemoryUsed(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** Returns the value of the {@code textWidth} field. */
    @NativeType("uint16_t")
    public short textWidth() { return ntextWidth(address()); }
    /** Returns the value of the {@code textHeight} field. */
    @NativeType("uint16_t")
    public short textHeight() { return ntextHeight(address()); }
    /** Returns the value of the {@code numViews} field. */
    @NativeType("uint16_t")
    public short numViews() { return nnumViews(address()); }
    /** Returns a {@link BGFXViewStats.Buffer} view of the struct array pointed to by the {@code viewStats} field. */
    @NativeType("bgfx_view_stats_t *")
    public BGFXViewStats.Buffer viewStats() { return nviewStats(address()); }
    /** Returns the value of the {@code numEncoder} field. */
    @NativeType("uint16_t")
    public short numEncoder() { return nnumEncoder(address()); }
    /** Returns a {@link BGFXEncoderStats.Buffer} view of the struct array pointed to by the {@code encoderStats} field. */
    @NativeType("bgfx_encoder_stats_t *")
    public BGFXEncoderStats.Buffer encoderStats() { return nencoderStats(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXStats} instance for the specified memory address. */
    public static BGFXStats create(long address) {
        return new BGFXStats(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXStats createSafe(long address) {
        return address == NULL ? null : create(address);
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
    @Nullable
    public static BGFXStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
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
    /** Unsafe version of {@link #maxGpuLatency}. */
    public static int nmaxGpuLatency(long struct) { return memGetInt(struct + BGFXStats.MAXGPULATENCY); }
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
    /** Unsafe version of {@link #numVertexDecls}. */
    public static short nnumVertexDecls(long struct) { return memGetShort(struct + BGFXStats.NUMVERTEXDECLS); }
    /** Unsafe version of {@link #textureMemoryUsed}. */
    public static long ntextureMemoryUsed(long struct) { return memGetLong(struct + BGFXStats.TEXTUREMEMORYUSED); }
    /** Unsafe version of {@link #rtMemoryUsed}. */
    public static long nrtMemoryUsed(long struct) { return memGetLong(struct + BGFXStats.RTMEMORYUSED); }
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
    /** Unsafe version of {@link #numEncoder}. */
    public static short nnumEncoder(long struct) { return memGetShort(struct + BGFXStats.NUMENCODER); }
    /** Unsafe version of {@link #encoderStats}. */
    public static BGFXEncoderStats.Buffer nencoderStats(long struct) { return BGFXEncoderStats.create(memGetAddress(struct + BGFXStats.ENCODERSTATS), Short.toUnsignedInt(nnumEncoder(struct))); }

    // -----------------------------------

    /** An array of {@link BGFXStats} structs. */
    public static class Buffer extends StructBuffer<BGFXStats, Buffer> {

        /**
         * Creates a new {@link BGFXStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXStats#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected BGFXStats newInstance(long address) {
            return new BGFXStats(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code cpuTimeFrame} field. */
        @NativeType("int64_t")
        public long cpuTimeFrame() { return BGFXStats.ncpuTimeFrame(address()); }
        /** Returns the value of the {@code cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXStats.ncpuTimeBegin(address()); }
        /** Returns the value of the {@code cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXStats.ncpuTimeEnd(address()); }
        /** Returns the value of the {@code cpuTimerFreq} field. */
        @NativeType("int64_t")
        public long cpuTimerFreq() { return BGFXStats.ncpuTimerFreq(address()); }
        /** Returns the value of the {@code gpuTimeBegin} field. */
        @NativeType("int64_t")
        public long gpuTimeBegin() { return BGFXStats.ngpuTimeBegin(address()); }
        /** Returns the value of the {@code gpuTimeEnd} field. */
        @NativeType("int64_t")
        public long gpuTimeEnd() { return BGFXStats.ngpuTimeEnd(address()); }
        /** Returns the value of the {@code gpuTimerFreq} field. */
        @NativeType("int64_t")
        public long gpuTimerFreq() { return BGFXStats.ngpuTimerFreq(address()); }
        /** Returns the value of the {@code waitRender} field. */
        @NativeType("int64_t")
        public long waitRender() { return BGFXStats.nwaitRender(address()); }
        /** Returns the value of the {@code waitSubmit} field. */
        @NativeType("int64_t")
        public long waitSubmit() { return BGFXStats.nwaitSubmit(address()); }
        /** Returns the value of the {@code numDraw} field. */
        @NativeType("uint32_t")
        public int numDraw() { return BGFXStats.nnumDraw(address()); }
        /** Returns the value of the {@code numCompute} field. */
        @NativeType("uint32_t")
        public int numCompute() { return BGFXStats.nnumCompute(address()); }
        /** Returns the value of the {@code maxGpuLatency} field. */
        @NativeType("uint32_t")
        public int maxGpuLatency() { return BGFXStats.nmaxGpuLatency(address()); }
        /** Returns the value of the {@code numDynamicIndexBuffers} field. */
        @NativeType("uint16_t")
        public short numDynamicIndexBuffers() { return BGFXStats.nnumDynamicIndexBuffers(address()); }
        /** Returns the value of the {@code numDynamicVertexBuffers} field. */
        @NativeType("uint16_t")
        public short numDynamicVertexBuffers() { return BGFXStats.nnumDynamicVertexBuffers(address()); }
        /** Returns the value of the {@code numFrameBuffers} field. */
        @NativeType("uint16_t")
        public short numFrameBuffers() { return BGFXStats.nnumFrameBuffers(address()); }
        /** Returns the value of the {@code numIndexBuffers} field. */
        @NativeType("uint16_t")
        public short numIndexBuffers() { return BGFXStats.nnumIndexBuffers(address()); }
        /** Returns the value of the {@code numOcclusionQueries} field. */
        @NativeType("uint16_t")
        public short numOcclusionQueries() { return BGFXStats.nnumOcclusionQueries(address()); }
        /** Returns the value of the {@code numPrograms} field. */
        @NativeType("uint16_t")
        public short numPrograms() { return BGFXStats.nnumPrograms(address()); }
        /** Returns the value of the {@code numShaders} field. */
        @NativeType("uint16_t")
        public short numShaders() { return BGFXStats.nnumShaders(address()); }
        /** Returns the value of the {@code numTextures} field. */
        @NativeType("uint16_t")
        public short numTextures() { return BGFXStats.nnumTextures(address()); }
        /** Returns the value of the {@code numUniforms} field. */
        @NativeType("uint16_t")
        public short numUniforms() { return BGFXStats.nnumUniforms(address()); }
        /** Returns the value of the {@code numVertexBuffers} field. */
        @NativeType("uint16_t")
        public short numVertexBuffers() { return BGFXStats.nnumVertexBuffers(address()); }
        /** Returns the value of the {@code numVertexDecls} field. */
        @NativeType("uint16_t")
        public short numVertexDecls() { return BGFXStats.nnumVertexDecls(address()); }
        /** Returns the value of the {@code textureMemoryUsed} field. */
        @NativeType("int64_t")
        public long textureMemoryUsed() { return BGFXStats.ntextureMemoryUsed(address()); }
        /** Returns the value of the {@code rtMemoryUsed} field. */
        @NativeType("int64_t")
        public long rtMemoryUsed() { return BGFXStats.nrtMemoryUsed(address()); }
        /** Returns the value of the {@code gpuMemoryMax} field. */
        @NativeType("int64_t")
        public long gpuMemoryMax() { return BGFXStats.ngpuMemoryMax(address()); }
        /** Returns the value of the {@code gpuMemoryUsed} field. */
        @NativeType("int64_t")
        public long gpuMemoryUsed() { return BGFXStats.ngpuMemoryUsed(address()); }
        /** Returns the value of the {@code width} field. */
        @NativeType("uint16_t")
        public short width() { return BGFXStats.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        @NativeType("uint16_t")
        public short height() { return BGFXStats.nheight(address()); }
        /** Returns the value of the {@code textWidth} field. */
        @NativeType("uint16_t")
        public short textWidth() { return BGFXStats.ntextWidth(address()); }
        /** Returns the value of the {@code textHeight} field. */
        @NativeType("uint16_t")
        public short textHeight() { return BGFXStats.ntextHeight(address()); }
        /** Returns the value of the {@code numViews} field. */
        @NativeType("uint16_t")
        public short numViews() { return BGFXStats.nnumViews(address()); }
        /** Returns a {@link BGFXViewStats.Buffer} view of the struct array pointed to by the {@code viewStats} field. */
        @NativeType("bgfx_view_stats_t *")
        public BGFXViewStats.Buffer viewStats() { return BGFXStats.nviewStats(address()); }
        /** Returns the value of the {@code numEncoder} field. */
        @NativeType("uint16_t")
        public short numEncoder() { return BGFXStats.nnumEncoder(address()); }
        /** Returns a {@link BGFXEncoderStats.Buffer} view of the struct array pointed to by the {@code encoderStats} field. */
        @NativeType("bgfx_encoder_stats_t *")
        public BGFXEncoderStats.Buffer encoderStats() { return BGFXStats.nencoderStats(address()); }

    }

}