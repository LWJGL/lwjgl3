/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.bgfx.BGFX.BGFX_TOPOLOGY_COUNT;

/**
 * Renderer statistics data.
 * 
 * <p>All time values are high-resolution timestamps, while time frequencies define timestamps-per-second for that hardware.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_stats_t {
 *     int64_t {@link #cpuTimeFrame};
 *     int64_t {@link #cpuTimeBegin};
 *     int64_t {@link #cpuTimeEnd};
 *     int64_t {@link #cpuTimerFreq};
 *     int64_t {@link #gpuTimeBegin};
 *     int64_t {@link #gpuTimeEnd};
 *     int64_t {@link #gpuTimerFreq};
 *     int64_t {@link #waitRender};
 *     int64_t {@link #waitSubmit};
 *     uint32_t {@link #numDraw};
 *     uint32_t {@link #numCompute};
 *     uint32_t {@link #numBlit};
 *     uint32_t {@link #maxGpuLatency};
 *     uint16_t {@link #numDynamicIndexBuffers};
 *     uint16_t {@link #numDynamicVertexBuffers};
 *     uint16_t {@link #numFrameBuffers};
 *     uint16_t {@link #numIndexBuffers};
 *     uint16_t {@link #numOcclusionQueries};
 *     uint16_t {@link #numPrograms};
 *     uint16_t {@link #numShaders};
 *     uint16_t {@link #numTextures};
 *     uint16_t {@link #numUniforms};
 *     uint16_t {@link #numVertexBuffers};
 *     uint16_t {@link #numVertexLayouts};
 *     int64_t {@link #textureMemoryUsed};
 *     int64_t {@link #rtMemoryUsed};
 *     int32_t {@link #transientVbUsed};
 *     int32_t {@link #transientIbUsed};
 *     uint32_t {@link #numPrims}[BGFX_TOPOLOGY_COUNT];
 *     int64_t {@link #gpuMemoryMax};
 *     int64_t {@link #gpuMemoryUsed};
 *     uint16_t {@link #width};
 *     uint16_t {@link #height};
 *     uint16_t {@link #textWidth};
 *     uint16_t {@link #textHeight};
 *     uint16_t {@link #numViews};
 *     {@link BGFXViewStats bgfx_view_stats_t} * {@link #viewStats};
 *     uint16_t {@link #numEncoders};
 *     {@link BGFXEncoderStats bgfx_encoder_stats_t} * {@link #encoderStats};
 * }</code></pre>
 */
@NativeType("struct bgfx_stats_t")
public class BGFXStats extends Struct {

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
        NUMDYNAMICINDEXBUFFERS = layout.offsetof(13);
        NUMDYNAMICVERTEXBUFFERS = layout.offsetof(14);
        NUMFRAMEBUFFERS = layout.offsetof(15);
        NUMINDEXBUFFERS = layout.offsetof(16);
        NUMOCCLUSIONQUERIES = layout.offsetof(17);
        NUMPROGRAMS = layout.offsetof(18);
        NUMSHADERS = layout.offsetof(19);
        NUMTEXTURES = layout.offsetof(20);
        NUMUNIFORMS = layout.offsetof(21);
        NUMVERTEXBUFFERS = layout.offsetof(22);
        NUMVERTEXLAYOUTS = layout.offsetof(23);
        TEXTUREMEMORYUSED = layout.offsetof(24);
        RTMEMORYUSED = layout.offsetof(25);
        TRANSIENTVBUSED = layout.offsetof(26);
        TRANSIENTIBUSED = layout.offsetof(27);
        NUMPRIMS = layout.offsetof(28);
        GPUMEMORYMAX = layout.offsetof(29);
        GPUMEMORYUSED = layout.offsetof(30);
        WIDTH = layout.offsetof(31);
        HEIGHT = layout.offsetof(32);
        TEXTWIDTH = layout.offsetof(33);
        TEXTHEIGHT = layout.offsetof(34);
        NUMVIEWS = layout.offsetof(35);
        VIEWSTATS = layout.offsetof(36);
        NUMENCODERS = layout.offsetof(37);
        ENCODERSTATS = layout.offsetof(38);
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

    /** CPU time between two {@link BGFX#bgfx_frame frame} calls */
    @NativeType("int64_t")
    public long cpuTimeFrame() { return ncpuTimeFrame(address()); }
    /** Render thread CPU submit begin time */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** Render thread CPU submit end time */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }
    /** CPU timer frequency. Timestamps-per-second. */
    @NativeType("int64_t")
    public long cpuTimerFreq() { return ncpuTimerFreq(address()); }
    /** GPU frame begin time */
    @NativeType("int64_t")
    public long gpuTimeBegin() { return ngpuTimeBegin(address()); }
    /** GPU frame end time */
    @NativeType("int64_t")
    public long gpuTimeEnd() { return ngpuTimeEnd(address()); }
    /** GPU timer frequency */
    @NativeType("int64_t")
    public long gpuTimerFreq() { return ngpuTimerFreq(address()); }
    /** time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API */
    @NativeType("int64_t")
    public long waitRender() { return nwaitRender(address()); }
    /** time spent waiting for submit thread to advance to next frame */
    @NativeType("int64_t")
    public long waitSubmit() { return nwaitSubmit(address()); }
    /** number of draw calls submitted */
    @NativeType("uint32_t")
    public int numDraw() { return nnumDraw(address()); }
    /** number of compute calls submitted */
    @NativeType("uint32_t")
    public int numCompute() { return nnumCompute(address()); }
    /** number of blit calls submitted */
    @NativeType("uint32_t")
    public int numBlit() { return nnumBlit(address()); }
    /** GPU driver latency */
    @NativeType("uint32_t")
    public int maxGpuLatency() { return nmaxGpuLatency(address()); }
    /** number of used dynamic index buffers */
    @NativeType("uint16_t")
    public short numDynamicIndexBuffers() { return nnumDynamicIndexBuffers(address()); }
    /** number of used dynamic vertex buffers */
    @NativeType("uint16_t")
    public short numDynamicVertexBuffers() { return nnumDynamicVertexBuffers(address()); }
    /** number of used frame buffers */
    @NativeType("uint16_t")
    public short numFrameBuffers() { return nnumFrameBuffers(address()); }
    /** number of used index buffers */
    @NativeType("uint16_t")
    public short numIndexBuffers() { return nnumIndexBuffers(address()); }
    /** number of used occlusion queries */
    @NativeType("uint16_t")
    public short numOcclusionQueries() { return nnumOcclusionQueries(address()); }
    /** number of used programs */
    @NativeType("uint16_t")
    public short numPrograms() { return nnumPrograms(address()); }
    /** number of used shaders */
    @NativeType("uint16_t")
    public short numShaders() { return nnumShaders(address()); }
    /** number of used textures */
    @NativeType("uint16_t")
    public short numTextures() { return nnumTextures(address()); }
    /** number of used uniforms */
    @NativeType("uint16_t")
    public short numUniforms() { return nnumUniforms(address()); }
    /** number of used vertex buffers */
    @NativeType("uint16_t")
    public short numVertexBuffers() { return nnumVertexBuffers(address()); }
    /** number of used vertex layouts */
    @NativeType("uint16_t")
    public short numVertexLayouts() { return nnumVertexLayouts(address()); }
    /** estimate of texture memory used */
    @NativeType("int64_t")
    public long textureMemoryUsed() { return ntextureMemoryUsed(address()); }
    /** estimate of render target memory used */
    @NativeType("int64_t")
    public long rtMemoryUsed() { return nrtMemoryUsed(address()); }
    /** amount of transient vertex buffer used */
    @NativeType("int32_t")
    public int transientVbUsed() { return ntransientVbUsed(address()); }
    /** amount of transient index buffer used */
    @NativeType("int32_t")
    public int transientIbUsed() { return ntransientIbUsed(address()); }
    /** number of primitives rendered */
    @NativeType("uint32_t[BGFX_TOPOLOGY_COUNT]")
    public IntBuffer numPrims() { return nnumPrims(address()); }
    /** number of primitives rendered */
    @NativeType("uint32_t")
    public int numPrims(int index) { return nnumPrims(address(), index); }
    /** maximum available GPU memory for application */
    @NativeType("int64_t")
    public long gpuMemoryMax() { return ngpuMemoryMax(address()); }
    /** amount of GPU memory used by the application */
    @NativeType("int64_t")
    public long gpuMemoryUsed() { return ngpuMemoryUsed(address()); }
    /** backbuffer width in pixels */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** backbuffer height in pixels */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** debug text width in characters */
    @NativeType("uint16_t")
    public short textWidth() { return ntextWidth(address()); }
    /** debug text height in characters */
    @NativeType("uint16_t")
    public short textHeight() { return ntextHeight(address()); }
    /** number of view stats */
    @NativeType("uint16_t")
    public short numViews() { return nnumViews(address()); }
    /** array of view stats */
    @NativeType("bgfx_view_stats_t *")
    public BGFXViewStats.Buffer viewStats() { return nviewStats(address()); }
    /** number of encoders used during frame */
    @NativeType("uint16_t")
    public short numEncoders() { return nnumEncoders(address()); }
    /** array of encoder stats */
    @NativeType("bgfx_encoder_stats_t *")
    public BGFXEncoderStats.Buffer encoderStats() { return nencoderStats(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXStats} instance for the specified memory address. */
    public static BGFXStats create(long address) {
        return wrap(BGFXStats.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXStats createSafe(long address) {
        return address == NULL ? null : wrap(BGFXStats.class, address);
    }

    /**
     * Create a {@link BGFXStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXStats.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpuTimeFrame}. */
    public static long ncpuTimeFrame(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.CPUTIMEFRAME); }
    /** Unsafe version of {@link #cpuTimeBegin}. */
    public static long ncpuTimeBegin(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.CPUTIMEBEGIN); }
    /** Unsafe version of {@link #cpuTimeEnd}. */
    public static long ncpuTimeEnd(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.CPUTIMEEND); }
    /** Unsafe version of {@link #cpuTimerFreq}. */
    public static long ncpuTimerFreq(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.CPUTIMERFREQ); }
    /** Unsafe version of {@link #gpuTimeBegin}. */
    public static long ngpuTimeBegin(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.GPUTIMEBEGIN); }
    /** Unsafe version of {@link #gpuTimeEnd}. */
    public static long ngpuTimeEnd(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.GPUTIMEEND); }
    /** Unsafe version of {@link #gpuTimerFreq}. */
    public static long ngpuTimerFreq(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.GPUTIMERFREQ); }
    /** Unsafe version of {@link #waitRender}. */
    public static long nwaitRender(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.WAITRENDER); }
    /** Unsafe version of {@link #waitSubmit}. */
    public static long nwaitSubmit(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.WAITSUBMIT); }
    /** Unsafe version of {@link #numDraw}. */
    public static int nnumDraw(long struct) { return UNSAFE.getInt(null, struct + BGFXStats.NUMDRAW); }
    /** Unsafe version of {@link #numCompute}. */
    public static int nnumCompute(long struct) { return UNSAFE.getInt(null, struct + BGFXStats.NUMCOMPUTE); }
    /** Unsafe version of {@link #numBlit}. */
    public static int nnumBlit(long struct) { return UNSAFE.getInt(null, struct + BGFXStats.NUMBLIT); }
    /** Unsafe version of {@link #maxGpuLatency}. */
    public static int nmaxGpuLatency(long struct) { return UNSAFE.getInt(null, struct + BGFXStats.MAXGPULATENCY); }
    /** Unsafe version of {@link #numDynamicIndexBuffers}. */
    public static short nnumDynamicIndexBuffers(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMDYNAMICINDEXBUFFERS); }
    /** Unsafe version of {@link #numDynamicVertexBuffers}. */
    public static short nnumDynamicVertexBuffers(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMDYNAMICVERTEXBUFFERS); }
    /** Unsafe version of {@link #numFrameBuffers}. */
    public static short nnumFrameBuffers(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMFRAMEBUFFERS); }
    /** Unsafe version of {@link #numIndexBuffers}. */
    public static short nnumIndexBuffers(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMINDEXBUFFERS); }
    /** Unsafe version of {@link #numOcclusionQueries}. */
    public static short nnumOcclusionQueries(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMOCCLUSIONQUERIES); }
    /** Unsafe version of {@link #numPrograms}. */
    public static short nnumPrograms(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMPROGRAMS); }
    /** Unsafe version of {@link #numShaders}. */
    public static short nnumShaders(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMSHADERS); }
    /** Unsafe version of {@link #numTextures}. */
    public static short nnumTextures(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMTEXTURES); }
    /** Unsafe version of {@link #numUniforms}. */
    public static short nnumUniforms(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMUNIFORMS); }
    /** Unsafe version of {@link #numVertexBuffers}. */
    public static short nnumVertexBuffers(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMVERTEXBUFFERS); }
    /** Unsafe version of {@link #numVertexLayouts}. */
    public static short nnumVertexLayouts(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMVERTEXLAYOUTS); }
    /** Unsafe version of {@link #textureMemoryUsed}. */
    public static long ntextureMemoryUsed(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.TEXTUREMEMORYUSED); }
    /** Unsafe version of {@link #rtMemoryUsed}. */
    public static long nrtMemoryUsed(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.RTMEMORYUSED); }
    /** Unsafe version of {@link #transientVbUsed}. */
    public static int ntransientVbUsed(long struct) { return UNSAFE.getInt(null, struct + BGFXStats.TRANSIENTVBUSED); }
    /** Unsafe version of {@link #transientIbUsed}. */
    public static int ntransientIbUsed(long struct) { return UNSAFE.getInt(null, struct + BGFXStats.TRANSIENTIBUSED); }
    /** Unsafe version of {@link #numPrims}. */
    public static IntBuffer nnumPrims(long struct) { return memIntBuffer(struct + BGFXStats.NUMPRIMS, BGFX_TOPOLOGY_COUNT); }
    /** Unsafe version of {@link #numPrims(int) numPrims}. */
    public static int nnumPrims(long struct, int index) {
        return UNSAFE.getInt(null, struct + BGFXStats.NUMPRIMS + check(index, BGFX_TOPOLOGY_COUNT) * 4);
    }
    /** Unsafe version of {@link #gpuMemoryMax}. */
    public static long ngpuMemoryMax(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.GPUMEMORYMAX); }
    /** Unsafe version of {@link #gpuMemoryUsed}. */
    public static long ngpuMemoryUsed(long struct) { return UNSAFE.getLong(null, struct + BGFXStats.GPUMEMORYUSED); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.HEIGHT); }
    /** Unsafe version of {@link #textWidth}. */
    public static short ntextWidth(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.TEXTWIDTH); }
    /** Unsafe version of {@link #textHeight}. */
    public static short ntextHeight(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.TEXTHEIGHT); }
    /** Unsafe version of {@link #numViews}. */
    public static short nnumViews(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMVIEWS); }
    /** Unsafe version of {@link #viewStats}. */
    public static BGFXViewStats.Buffer nviewStats(long struct) { return BGFXViewStats.create(memGetAddress(struct + BGFXStats.VIEWSTATS), Short.toUnsignedInt(nnumViews(struct))); }
    /** Unsafe version of {@link #numEncoders}. */
    public static short nnumEncoders(long struct) { return UNSAFE.getShort(null, struct + BGFXStats.NUMENCODERS); }
    /** Unsafe version of {@link #encoderStats}. */
    public static BGFXEncoderStats.Buffer nencoderStats(long struct) { return BGFXEncoderStats.create(memGetAddress(struct + BGFXStats.ENCODERSTATS), Short.toUnsignedInt(nnumEncoders(struct))); }

    // -----------------------------------

    /** An array of {@link BGFXStats} structs. */
    public static class Buffer extends StructBuffer<BGFXStats, Buffer> {

        private static final BGFXStats ELEMENT_FACTORY = BGFXStats.create(-1L);

        /**
         * Creates a new {@code BGFXStats.Buffer} instance backed by the specified container.
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
        protected BGFXStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link BGFXStats#cpuTimeFrame} field. */
        @NativeType("int64_t")
        public long cpuTimeFrame() { return BGFXStats.ncpuTimeFrame(address()); }
        /** @return the value of the {@link BGFXStats#cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXStats.ncpuTimeBegin(address()); }
        /** @return the value of the {@link BGFXStats#cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXStats.ncpuTimeEnd(address()); }
        /** @return the value of the {@link BGFXStats#cpuTimerFreq} field. */
        @NativeType("int64_t")
        public long cpuTimerFreq() { return BGFXStats.ncpuTimerFreq(address()); }
        /** @return the value of the {@link BGFXStats#gpuTimeBegin} field. */
        @NativeType("int64_t")
        public long gpuTimeBegin() { return BGFXStats.ngpuTimeBegin(address()); }
        /** @return the value of the {@link BGFXStats#gpuTimeEnd} field. */
        @NativeType("int64_t")
        public long gpuTimeEnd() { return BGFXStats.ngpuTimeEnd(address()); }
        /** @return the value of the {@link BGFXStats#gpuTimerFreq} field. */
        @NativeType("int64_t")
        public long gpuTimerFreq() { return BGFXStats.ngpuTimerFreq(address()); }
        /** @return the value of the {@link BGFXStats#waitRender} field. */
        @NativeType("int64_t")
        public long waitRender() { return BGFXStats.nwaitRender(address()); }
        /** @return the value of the {@link BGFXStats#waitSubmit} field. */
        @NativeType("int64_t")
        public long waitSubmit() { return BGFXStats.nwaitSubmit(address()); }
        /** @return the value of the {@link BGFXStats#numDraw} field. */
        @NativeType("uint32_t")
        public int numDraw() { return BGFXStats.nnumDraw(address()); }
        /** @return the value of the {@link BGFXStats#numCompute} field. */
        @NativeType("uint32_t")
        public int numCompute() { return BGFXStats.nnumCompute(address()); }
        /** @return the value of the {@link BGFXStats#numBlit} field. */
        @NativeType("uint32_t")
        public int numBlit() { return BGFXStats.nnumBlit(address()); }
        /** @return the value of the {@link BGFXStats#maxGpuLatency} field. */
        @NativeType("uint32_t")
        public int maxGpuLatency() { return BGFXStats.nmaxGpuLatency(address()); }
        /** @return the value of the {@link BGFXStats#numDynamicIndexBuffers} field. */
        @NativeType("uint16_t")
        public short numDynamicIndexBuffers() { return BGFXStats.nnumDynamicIndexBuffers(address()); }
        /** @return the value of the {@link BGFXStats#numDynamicVertexBuffers} field. */
        @NativeType("uint16_t")
        public short numDynamicVertexBuffers() { return BGFXStats.nnumDynamicVertexBuffers(address()); }
        /** @return the value of the {@link BGFXStats#numFrameBuffers} field. */
        @NativeType("uint16_t")
        public short numFrameBuffers() { return BGFXStats.nnumFrameBuffers(address()); }
        /** @return the value of the {@link BGFXStats#numIndexBuffers} field. */
        @NativeType("uint16_t")
        public short numIndexBuffers() { return BGFXStats.nnumIndexBuffers(address()); }
        /** @return the value of the {@link BGFXStats#numOcclusionQueries} field. */
        @NativeType("uint16_t")
        public short numOcclusionQueries() { return BGFXStats.nnumOcclusionQueries(address()); }
        /** @return the value of the {@link BGFXStats#numPrograms} field. */
        @NativeType("uint16_t")
        public short numPrograms() { return BGFXStats.nnumPrograms(address()); }
        /** @return the value of the {@link BGFXStats#numShaders} field. */
        @NativeType("uint16_t")
        public short numShaders() { return BGFXStats.nnumShaders(address()); }
        /** @return the value of the {@link BGFXStats#numTextures} field. */
        @NativeType("uint16_t")
        public short numTextures() { return BGFXStats.nnumTextures(address()); }
        /** @return the value of the {@link BGFXStats#numUniforms} field. */
        @NativeType("uint16_t")
        public short numUniforms() { return BGFXStats.nnumUniforms(address()); }
        /** @return the value of the {@link BGFXStats#numVertexBuffers} field. */
        @NativeType("uint16_t")
        public short numVertexBuffers() { return BGFXStats.nnumVertexBuffers(address()); }
        /** @return the value of the {@link BGFXStats#numVertexLayouts} field. */
        @NativeType("uint16_t")
        public short numVertexLayouts() { return BGFXStats.nnumVertexLayouts(address()); }
        /** @return the value of the {@link BGFXStats#textureMemoryUsed} field. */
        @NativeType("int64_t")
        public long textureMemoryUsed() { return BGFXStats.ntextureMemoryUsed(address()); }
        /** @return the value of the {@link BGFXStats#rtMemoryUsed} field. */
        @NativeType("int64_t")
        public long rtMemoryUsed() { return BGFXStats.nrtMemoryUsed(address()); }
        /** @return the value of the {@link BGFXStats#transientVbUsed} field. */
        @NativeType("int32_t")
        public int transientVbUsed() { return BGFXStats.ntransientVbUsed(address()); }
        /** @return the value of the {@link BGFXStats#transientIbUsed} field. */
        @NativeType("int32_t")
        public int transientIbUsed() { return BGFXStats.ntransientIbUsed(address()); }
        /** @return a {@link IntBuffer} view of the {@link BGFXStats#numPrims} field. */
        @NativeType("uint32_t[BGFX_TOPOLOGY_COUNT]")
        public IntBuffer numPrims() { return BGFXStats.nnumPrims(address()); }
        /** @return the value at the specified index of the {@link BGFXStats#numPrims} field. */
        @NativeType("uint32_t")
        public int numPrims(int index) { return BGFXStats.nnumPrims(address(), index); }
        /** @return the value of the {@link BGFXStats#gpuMemoryMax} field. */
        @NativeType("int64_t")
        public long gpuMemoryMax() { return BGFXStats.ngpuMemoryMax(address()); }
        /** @return the value of the {@link BGFXStats#gpuMemoryUsed} field. */
        @NativeType("int64_t")
        public long gpuMemoryUsed() { return BGFXStats.ngpuMemoryUsed(address()); }
        /** @return the value of the {@link BGFXStats#width} field. */
        @NativeType("uint16_t")
        public short width() { return BGFXStats.nwidth(address()); }
        /** @return the value of the {@link BGFXStats#height} field. */
        @NativeType("uint16_t")
        public short height() { return BGFXStats.nheight(address()); }
        /** @return the value of the {@link BGFXStats#textWidth} field. */
        @NativeType("uint16_t")
        public short textWidth() { return BGFXStats.ntextWidth(address()); }
        /** @return the value of the {@link BGFXStats#textHeight} field. */
        @NativeType("uint16_t")
        public short textHeight() { return BGFXStats.ntextHeight(address()); }
        /** @return the value of the {@link BGFXStats#numViews} field. */
        @NativeType("uint16_t")
        public short numViews() { return BGFXStats.nnumViews(address()); }
        /** @return a {@link BGFXViewStats.Buffer} view of the struct array pointed to by the {@link BGFXStats#viewStats} field. */
        @NativeType("bgfx_view_stats_t *")
        public BGFXViewStats.Buffer viewStats() { return BGFXStats.nviewStats(address()); }
        /** @return the value of the {@link BGFXStats#numEncoders} field. */
        @NativeType("uint16_t")
        public short numEncoders() { return BGFXStats.nnumEncoders(address()); }
        /** @return a {@link BGFXEncoderStats.Buffer} view of the struct array pointed to by the {@link BGFXStats#encoderStats} field. */
        @NativeType("bgfx_encoder_stats_t *")
        public BGFXEncoderStats.Buffer encoderStats() { return BGFXStats.nencoderStats(address()); }

    }

}