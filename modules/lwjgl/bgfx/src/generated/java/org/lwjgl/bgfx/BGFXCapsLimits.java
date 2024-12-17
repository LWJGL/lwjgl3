/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct bgfx_caps_limits_t {
 *     uint32_t maxDrawCalls;
 *     uint32_t maxBlits;
 *     uint32_t maxTextureSize;
 *     uint32_t maxTextureLayers;
 *     uint32_t maxViews;
 *     uint32_t maxFrameBuffers;
 *     uint32_t maxFBAttachments;
 *     uint32_t maxPrograms;
 *     uint32_t maxShaders;
 *     uint32_t maxTextures;
 *     uint32_t maxTextureSamplers;
 *     uint32_t maxComputeBindings;
 *     uint32_t maxVertexLayouts;
 *     uint32_t maxVertexStreams;
 *     uint32_t maxIndexBuffers;
 *     uint32_t maxVertexBuffers;
 *     uint32_t maxDynamicIndexBuffers;
 *     uint32_t maxDynamicVertexBuffers;
 *     uint32_t maxUniforms;
 *     uint32_t maxOcclusionQueries;
 *     uint32_t maxEncoders;
 *     uint32_t minResourceCbSize;
 *     uint32_t transientVbSize;
 *     uint32_t transientIbSize;
 * }}</pre>
 */
@NativeType("struct bgfx_caps_limits_t")
public class BGFXCapsLimits extends Struct<BGFXCapsLimits> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXDRAWCALLS,
        MAXBLITS,
        MAXTEXTURESIZE,
        MAXTEXTURELAYERS,
        MAXVIEWS,
        MAXFRAMEBUFFERS,
        MAXFBATTACHMENTS,
        MAXPROGRAMS,
        MAXSHADERS,
        MAXTEXTURES,
        MAXTEXTURESAMPLERS,
        MAXCOMPUTEBINDINGS,
        MAXVERTEXLAYOUTS,
        MAXVERTEXSTREAMS,
        MAXINDEXBUFFERS,
        MAXVERTEXBUFFERS,
        MAXDYNAMICINDEXBUFFERS,
        MAXDYNAMICVERTEXBUFFERS,
        MAXUNIFORMS,
        MAXOCCLUSIONQUERIES,
        MAXENCODERS,
        MINRESOURCECBSIZE,
        TRANSIENTVBSIZE,
        TRANSIENTIBSIZE;

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
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXDRAWCALLS = layout.offsetof(0);
        MAXBLITS = layout.offsetof(1);
        MAXTEXTURESIZE = layout.offsetof(2);
        MAXTEXTURELAYERS = layout.offsetof(3);
        MAXVIEWS = layout.offsetof(4);
        MAXFRAMEBUFFERS = layout.offsetof(5);
        MAXFBATTACHMENTS = layout.offsetof(6);
        MAXPROGRAMS = layout.offsetof(7);
        MAXSHADERS = layout.offsetof(8);
        MAXTEXTURES = layout.offsetof(9);
        MAXTEXTURESAMPLERS = layout.offsetof(10);
        MAXCOMPUTEBINDINGS = layout.offsetof(11);
        MAXVERTEXLAYOUTS = layout.offsetof(12);
        MAXVERTEXSTREAMS = layout.offsetof(13);
        MAXINDEXBUFFERS = layout.offsetof(14);
        MAXVERTEXBUFFERS = layout.offsetof(15);
        MAXDYNAMICINDEXBUFFERS = layout.offsetof(16);
        MAXDYNAMICVERTEXBUFFERS = layout.offsetof(17);
        MAXUNIFORMS = layout.offsetof(18);
        MAXOCCLUSIONQUERIES = layout.offsetof(19);
        MAXENCODERS = layout.offsetof(20);
        MINRESOURCECBSIZE = layout.offsetof(21);
        TRANSIENTVBSIZE = layout.offsetof(22);
        TRANSIENTIBSIZE = layout.offsetof(23);
    }

    protected BGFXCapsLimits(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXCapsLimits create(long address, @Nullable ByteBuffer container) {
        return new BGFXCapsLimits(address, container);
    }

    /**
     * Creates a {@code BGFXCapsLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCapsLimits(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code maxDrawCalls} field. */
    @NativeType("uint32_t")
    public int maxDrawCalls() { return nmaxDrawCalls(address()); }
    /** @return the value of the {@code maxBlits} field. */
    @NativeType("uint32_t")
    public int maxBlits() { return nmaxBlits(address()); }
    /** @return the value of the {@code maxTextureSize} field. */
    @NativeType("uint32_t")
    public int maxTextureSize() { return nmaxTextureSize(address()); }
    /** @return the value of the {@code maxTextureLayers} field. */
    @NativeType("uint32_t")
    public int maxTextureLayers() { return nmaxTextureLayers(address()); }
    /** @return the value of the {@code maxViews} field. */
    @NativeType("uint32_t")
    public int maxViews() { return nmaxViews(address()); }
    /** @return the value of the {@code maxFrameBuffers} field. */
    @NativeType("uint32_t")
    public int maxFrameBuffers() { return nmaxFrameBuffers(address()); }
    /** @return the value of the {@code maxFBAttachments} field. */
    @NativeType("uint32_t")
    public int maxFBAttachments() { return nmaxFBAttachments(address()); }
    /** @return the value of the {@code maxPrograms} field. */
    @NativeType("uint32_t")
    public int maxPrograms() { return nmaxPrograms(address()); }
    /** @return the value of the {@code maxShaders} field. */
    @NativeType("uint32_t")
    public int maxShaders() { return nmaxShaders(address()); }
    /** @return the value of the {@code maxTextures} field. */
    @NativeType("uint32_t")
    public int maxTextures() { return nmaxTextures(address()); }
    /** @return the value of the {@code maxTextureSamplers} field. */
    @NativeType("uint32_t")
    public int maxTextureSamplers() { return nmaxTextureSamplers(address()); }
    /** @return the value of the {@code maxComputeBindings} field. */
    @NativeType("uint32_t")
    public int maxComputeBindings() { return nmaxComputeBindings(address()); }
    /** @return the value of the {@code maxVertexLayouts} field. */
    @NativeType("uint32_t")
    public int maxVertexLayouts() { return nmaxVertexLayouts(address()); }
    /** @return the value of the {@code maxVertexStreams} field. */
    @NativeType("uint32_t")
    public int maxVertexStreams() { return nmaxVertexStreams(address()); }
    /** @return the value of the {@code maxIndexBuffers} field. */
    @NativeType("uint32_t")
    public int maxIndexBuffers() { return nmaxIndexBuffers(address()); }
    /** @return the value of the {@code maxVertexBuffers} field. */
    @NativeType("uint32_t")
    public int maxVertexBuffers() { return nmaxVertexBuffers(address()); }
    /** @return the value of the {@code maxDynamicIndexBuffers} field. */
    @NativeType("uint32_t")
    public int maxDynamicIndexBuffers() { return nmaxDynamicIndexBuffers(address()); }
    /** @return the value of the {@code maxDynamicVertexBuffers} field. */
    @NativeType("uint32_t")
    public int maxDynamicVertexBuffers() { return nmaxDynamicVertexBuffers(address()); }
    /** @return the value of the {@code maxUniforms} field. */
    @NativeType("uint32_t")
    public int maxUniforms() { return nmaxUniforms(address()); }
    /** @return the value of the {@code maxOcclusionQueries} field. */
    @NativeType("uint32_t")
    public int maxOcclusionQueries() { return nmaxOcclusionQueries(address()); }
    /** @return the value of the {@code maxEncoders} field. */
    @NativeType("uint32_t")
    public int maxEncoders() { return nmaxEncoders(address()); }
    /** @return the value of the {@code minResourceCbSize} field. */
    @NativeType("uint32_t")
    public int minResourceCbSize() { return nminResourceCbSize(address()); }
    /** @return the value of the {@code transientVbSize} field. */
    @NativeType("uint32_t")
    public int transientVbSize() { return ntransientVbSize(address()); }
    /** @return the value of the {@code transientIbSize} field. */
    @NativeType("uint32_t")
    public int transientIbSize() { return ntransientIbSize(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXCapsLimits} instance for the specified memory address. */
    public static BGFXCapsLimits create(long address) {
        return new BGFXCapsLimits(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXCapsLimits createSafe(long address) {
        return address == NULL ? null : new BGFXCapsLimits(address, null);
    }

    /**
     * Create a {@link BGFXCapsLimits.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXCapsLimits.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXCapsLimits.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxDrawCalls}. */
    public static int nmaxDrawCalls(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXDRAWCALLS); }
    /** Unsafe version of {@link #maxBlits}. */
    public static int nmaxBlits(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXBLITS); }
    /** Unsafe version of {@link #maxTextureSize}. */
    public static int nmaxTextureSize(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURESIZE); }
    /** Unsafe version of {@link #maxTextureLayers}. */
    public static int nmaxTextureLayers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURELAYERS); }
    /** Unsafe version of {@link #maxViews}. */
    public static int nmaxViews(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVIEWS); }
    /** Unsafe version of {@link #maxFrameBuffers}. */
    public static int nmaxFrameBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXFRAMEBUFFERS); }
    /** Unsafe version of {@link #maxFBAttachments}. */
    public static int nmaxFBAttachments(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXFBATTACHMENTS); }
    /** Unsafe version of {@link #maxPrograms}. */
    public static int nmaxPrograms(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXPROGRAMS); }
    /** Unsafe version of {@link #maxShaders}. */
    public static int nmaxShaders(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXSHADERS); }
    /** Unsafe version of {@link #maxTextures}. */
    public static int nmaxTextures(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURES); }
    /** Unsafe version of {@link #maxTextureSamplers}. */
    public static int nmaxTextureSamplers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXTEXTURESAMPLERS); }
    /** Unsafe version of {@link #maxComputeBindings}. */
    public static int nmaxComputeBindings(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXCOMPUTEBINDINGS); }
    /** Unsafe version of {@link #maxVertexLayouts}. */
    public static int nmaxVertexLayouts(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVERTEXLAYOUTS); }
    /** Unsafe version of {@link #maxVertexStreams}. */
    public static int nmaxVertexStreams(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVERTEXSTREAMS); }
    /** Unsafe version of {@link #maxIndexBuffers}. */
    public static int nmaxIndexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXINDEXBUFFERS); }
    /** Unsafe version of {@link #maxVertexBuffers}. */
    public static int nmaxVertexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXVERTEXBUFFERS); }
    /** Unsafe version of {@link #maxDynamicIndexBuffers}. */
    public static int nmaxDynamicIndexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXDYNAMICINDEXBUFFERS); }
    /** Unsafe version of {@link #maxDynamicVertexBuffers}. */
    public static int nmaxDynamicVertexBuffers(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXDYNAMICVERTEXBUFFERS); }
    /** Unsafe version of {@link #maxUniforms}. */
    public static int nmaxUniforms(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXUNIFORMS); }
    /** Unsafe version of {@link #maxOcclusionQueries}. */
    public static int nmaxOcclusionQueries(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXOCCLUSIONQUERIES); }
    /** Unsafe version of {@link #maxEncoders}. */
    public static int nmaxEncoders(long struct) { return memGetInt(struct + BGFXCapsLimits.MAXENCODERS); }
    /** Unsafe version of {@link #minResourceCbSize}. */
    public static int nminResourceCbSize(long struct) { return memGetInt(struct + BGFXCapsLimits.MINRESOURCECBSIZE); }
    /** Unsafe version of {@link #transientVbSize}. */
    public static int ntransientVbSize(long struct) { return memGetInt(struct + BGFXCapsLimits.TRANSIENTVBSIZE); }
    /** Unsafe version of {@link #transientIbSize}. */
    public static int ntransientIbSize(long struct) { return memGetInt(struct + BGFXCapsLimits.TRANSIENTIBSIZE); }

    // -----------------------------------

    /** An array of {@link BGFXCapsLimits} structs. */
    public static class Buffer extends StructBuffer<BGFXCapsLimits, Buffer> {

        private static final BGFXCapsLimits ELEMENT_FACTORY = BGFXCapsLimits.create(-1L);

        /**
         * Creates a new {@code BGFXCapsLimits.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXCapsLimits#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXCapsLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code maxDrawCalls} field. */
        @NativeType("uint32_t")
        public int maxDrawCalls() { return BGFXCapsLimits.nmaxDrawCalls(address()); }
        /** @return the value of the {@code maxBlits} field. */
        @NativeType("uint32_t")
        public int maxBlits() { return BGFXCapsLimits.nmaxBlits(address()); }
        /** @return the value of the {@code maxTextureSize} field. */
        @NativeType("uint32_t")
        public int maxTextureSize() { return BGFXCapsLimits.nmaxTextureSize(address()); }
        /** @return the value of the {@code maxTextureLayers} field. */
        @NativeType("uint32_t")
        public int maxTextureLayers() { return BGFXCapsLimits.nmaxTextureLayers(address()); }
        /** @return the value of the {@code maxViews} field. */
        @NativeType("uint32_t")
        public int maxViews() { return BGFXCapsLimits.nmaxViews(address()); }
        /** @return the value of the {@code maxFrameBuffers} field. */
        @NativeType("uint32_t")
        public int maxFrameBuffers() { return BGFXCapsLimits.nmaxFrameBuffers(address()); }
        /** @return the value of the {@code maxFBAttachments} field. */
        @NativeType("uint32_t")
        public int maxFBAttachments() { return BGFXCapsLimits.nmaxFBAttachments(address()); }
        /** @return the value of the {@code maxPrograms} field. */
        @NativeType("uint32_t")
        public int maxPrograms() { return BGFXCapsLimits.nmaxPrograms(address()); }
        /** @return the value of the {@code maxShaders} field. */
        @NativeType("uint32_t")
        public int maxShaders() { return BGFXCapsLimits.nmaxShaders(address()); }
        /** @return the value of the {@code maxTextures} field. */
        @NativeType("uint32_t")
        public int maxTextures() { return BGFXCapsLimits.nmaxTextures(address()); }
        /** @return the value of the {@code maxTextureSamplers} field. */
        @NativeType("uint32_t")
        public int maxTextureSamplers() { return BGFXCapsLimits.nmaxTextureSamplers(address()); }
        /** @return the value of the {@code maxComputeBindings} field. */
        @NativeType("uint32_t")
        public int maxComputeBindings() { return BGFXCapsLimits.nmaxComputeBindings(address()); }
        /** @return the value of the {@code maxVertexLayouts} field. */
        @NativeType("uint32_t")
        public int maxVertexLayouts() { return BGFXCapsLimits.nmaxVertexLayouts(address()); }
        /** @return the value of the {@code maxVertexStreams} field. */
        @NativeType("uint32_t")
        public int maxVertexStreams() { return BGFXCapsLimits.nmaxVertexStreams(address()); }
        /** @return the value of the {@code maxIndexBuffers} field. */
        @NativeType("uint32_t")
        public int maxIndexBuffers() { return BGFXCapsLimits.nmaxIndexBuffers(address()); }
        /** @return the value of the {@code maxVertexBuffers} field. */
        @NativeType("uint32_t")
        public int maxVertexBuffers() { return BGFXCapsLimits.nmaxVertexBuffers(address()); }
        /** @return the value of the {@code maxDynamicIndexBuffers} field. */
        @NativeType("uint32_t")
        public int maxDynamicIndexBuffers() { return BGFXCapsLimits.nmaxDynamicIndexBuffers(address()); }
        /** @return the value of the {@code maxDynamicVertexBuffers} field. */
        @NativeType("uint32_t")
        public int maxDynamicVertexBuffers() { return BGFXCapsLimits.nmaxDynamicVertexBuffers(address()); }
        /** @return the value of the {@code maxUniforms} field. */
        @NativeType("uint32_t")
        public int maxUniforms() { return BGFXCapsLimits.nmaxUniforms(address()); }
        /** @return the value of the {@code maxOcclusionQueries} field. */
        @NativeType("uint32_t")
        public int maxOcclusionQueries() { return BGFXCapsLimits.nmaxOcclusionQueries(address()); }
        /** @return the value of the {@code maxEncoders} field. */
        @NativeType("uint32_t")
        public int maxEncoders() { return BGFXCapsLimits.nmaxEncoders(address()); }
        /** @return the value of the {@code minResourceCbSize} field. */
        @NativeType("uint32_t")
        public int minResourceCbSize() { return BGFXCapsLimits.nminResourceCbSize(address()); }
        /** @return the value of the {@code transientVbSize} field. */
        @NativeType("uint32_t")
        public int transientVbSize() { return BGFXCapsLimits.ntransientVbSize(address()); }
        /** @return the value of the {@code transientIbSize} field. */
        @NativeType("uint32_t")
        public int transientIbSize() { return BGFXCapsLimits.ntransientIbSize(address()); }

    }

}