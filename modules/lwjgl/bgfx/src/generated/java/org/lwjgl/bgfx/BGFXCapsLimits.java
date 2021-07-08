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
 * Renderer runtime limits.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_caps_limits_t {
 *     uint32_t {@link #maxDrawCalls};
 *     uint32_t {@link #maxBlits};
 *     uint32_t {@link #maxTextureSize};
 *     uint32_t {@link #maxTextureLayers};
 *     uint32_t {@link #maxViews};
 *     uint32_t {@link #maxFrameBuffers};
 *     uint32_t {@link #maxFBAttachments};
 *     uint32_t {@link #maxPrograms};
 *     uint32_t {@link #maxShaders};
 *     uint32_t {@link #maxTextures};
 *     uint32_t {@link #maxTextureSamplers};
 *     uint32_t {@link #maxComputeBindings};
 *     uint32_t {@link #maxVertexLayouts};
 *     uint32_t {@link #maxVertexStreams};
 *     uint32_t {@link #maxIndexBuffers};
 *     uint32_t {@link #maxVertexBuffers};
 *     uint32_t {@link #maxDynamicIndexBuffers};
 *     uint32_t {@link #maxDynamicVertexBuffers};
 *     uint32_t {@link #maxUniforms};
 *     uint32_t {@link #maxOcclusionQueries};
 *     uint32_t {@link #maxEncoders};
 *     uint32_t {@link #minResourceCbSize};
 *     uint32_t {@link #transientVbSize};
 *     uint32_t {@link #transientIbSize};
 * }</code></pre>
 */
@NativeType("struct bgfx_caps_limits_t")
public class BGFXCapsLimits extends Struct {

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

    /** maximum number of draw calls */
    @NativeType("uint32_t")
    public int maxDrawCalls() { return nmaxDrawCalls(address()); }
    /** maximum number of blit calls */
    @NativeType("uint32_t")
    public int maxBlits() { return nmaxBlits(address()); }
    /** maximum texture size */
    @NativeType("uint32_t")
    public int maxTextureSize() { return nmaxTextureSize(address()); }
    /** maximum texture layers */
    @NativeType("uint32_t")
    public int maxTextureLayers() { return nmaxTextureLayers(address()); }
    /** maximum number of views */
    @NativeType("uint32_t")
    public int maxViews() { return nmaxViews(address()); }
    /** maximum number of frame buffer handles */
    @NativeType("uint32_t")
    public int maxFrameBuffers() { return nmaxFrameBuffers(address()); }
    /** maximum number of frame buffer attachments */
    @NativeType("uint32_t")
    public int maxFBAttachments() { return nmaxFBAttachments(address()); }
    /** maximum number of program handles */
    @NativeType("uint32_t")
    public int maxPrograms() { return nmaxPrograms(address()); }
    /** maximum number of shader handles */
    @NativeType("uint32_t")
    public int maxShaders() { return nmaxShaders(address()); }
    /** maximum number of texture handles */
    @NativeType("uint32_t")
    public int maxTextures() { return nmaxTextures(address()); }
    /** maximum number of texture samplers */
    @NativeType("uint32_t")
    public int maxTextureSamplers() { return nmaxTextureSamplers(address()); }
    /** maximum number of compute bindings */
    @NativeType("uint32_t")
    public int maxComputeBindings() { return nmaxComputeBindings(address()); }
    /** maximum number of vertex format layouts */
    @NativeType("uint32_t")
    public int maxVertexLayouts() { return nmaxVertexLayouts(address()); }
    /** maximum number of vertex streams */
    @NativeType("uint32_t")
    public int maxVertexStreams() { return nmaxVertexStreams(address()); }
    /** maximum number of index buffer handles */
    @NativeType("uint32_t")
    public int maxIndexBuffers() { return nmaxIndexBuffers(address()); }
    /** maximum number of vertex buffer handles */
    @NativeType("uint32_t")
    public int maxVertexBuffers() { return nmaxVertexBuffers(address()); }
    /** maximum number of dynamic index buffer handles */
    @NativeType("uint32_t")
    public int maxDynamicIndexBuffers() { return nmaxDynamicIndexBuffers(address()); }
    /** maximum number of vertex buffer handles */
    @NativeType("uint32_t")
    public int maxDynamicVertexBuffers() { return nmaxDynamicVertexBuffers(address()); }
    /** maximum number of uniform handles */
    @NativeType("uint32_t")
    public int maxUniforms() { return nmaxUniforms(address()); }
    /** maximum number of occlusion query handles */
    @NativeType("uint32_t")
    public int maxOcclusionQueries() { return nmaxOcclusionQueries(address()); }
    /** maximum number of encoder threads */
    @NativeType("uint32_t")
    public int maxEncoders() { return nmaxEncoders(address()); }
    /** minimum resource command buffer size */
    @NativeType("uint32_t")
    public int minResourceCbSize() { return nminResourceCbSize(address()); }
    /** maximum transient vertex buffer size */
    @NativeType("uint32_t")
    public int transientVbSize() { return ntransientVbSize(address()); }
    /** maximum transient index buffer size */
    @NativeType("uint32_t")
    public int transientIbSize() { return ntransientIbSize(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXCapsLimits} instance for the specified memory address. */
    public static BGFXCapsLimits create(long address) {
        return wrap(BGFXCapsLimits.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXCapsLimits createSafe(long address) {
        return address == NULL ? null : wrap(BGFXCapsLimits.class, address);
    }

    /**
     * Create a {@link BGFXCapsLimits.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXCapsLimits.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXCapsLimits.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxDrawCalls}. */
    public static int nmaxDrawCalls(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXDRAWCALLS); }
    /** Unsafe version of {@link #maxBlits}. */
    public static int nmaxBlits(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXBLITS); }
    /** Unsafe version of {@link #maxTextureSize}. */
    public static int nmaxTextureSize(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXTEXTURESIZE); }
    /** Unsafe version of {@link #maxTextureLayers}. */
    public static int nmaxTextureLayers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXTEXTURELAYERS); }
    /** Unsafe version of {@link #maxViews}. */
    public static int nmaxViews(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXVIEWS); }
    /** Unsafe version of {@link #maxFrameBuffers}. */
    public static int nmaxFrameBuffers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXFRAMEBUFFERS); }
    /** Unsafe version of {@link #maxFBAttachments}. */
    public static int nmaxFBAttachments(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXFBATTACHMENTS); }
    /** Unsafe version of {@link #maxPrograms}. */
    public static int nmaxPrograms(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXPROGRAMS); }
    /** Unsafe version of {@link #maxShaders}. */
    public static int nmaxShaders(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXSHADERS); }
    /** Unsafe version of {@link #maxTextures}. */
    public static int nmaxTextures(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXTEXTURES); }
    /** Unsafe version of {@link #maxTextureSamplers}. */
    public static int nmaxTextureSamplers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXTEXTURESAMPLERS); }
    /** Unsafe version of {@link #maxComputeBindings}. */
    public static int nmaxComputeBindings(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXCOMPUTEBINDINGS); }
    /** Unsafe version of {@link #maxVertexLayouts}. */
    public static int nmaxVertexLayouts(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXVERTEXLAYOUTS); }
    /** Unsafe version of {@link #maxVertexStreams}. */
    public static int nmaxVertexStreams(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXVERTEXSTREAMS); }
    /** Unsafe version of {@link #maxIndexBuffers}. */
    public static int nmaxIndexBuffers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXINDEXBUFFERS); }
    /** Unsafe version of {@link #maxVertexBuffers}. */
    public static int nmaxVertexBuffers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXVERTEXBUFFERS); }
    /** Unsafe version of {@link #maxDynamicIndexBuffers}. */
    public static int nmaxDynamicIndexBuffers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXDYNAMICINDEXBUFFERS); }
    /** Unsafe version of {@link #maxDynamicVertexBuffers}. */
    public static int nmaxDynamicVertexBuffers(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXDYNAMICVERTEXBUFFERS); }
    /** Unsafe version of {@link #maxUniforms}. */
    public static int nmaxUniforms(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXUNIFORMS); }
    /** Unsafe version of {@link #maxOcclusionQueries}. */
    public static int nmaxOcclusionQueries(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXOCCLUSIONQUERIES); }
    /** Unsafe version of {@link #maxEncoders}. */
    public static int nmaxEncoders(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MAXENCODERS); }
    /** Unsafe version of {@link #minResourceCbSize}. */
    public static int nminResourceCbSize(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.MINRESOURCECBSIZE); }
    /** Unsafe version of {@link #transientVbSize}. */
    public static int ntransientVbSize(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.TRANSIENTVBSIZE); }
    /** Unsafe version of {@link #transientIbSize}. */
    public static int ntransientIbSize(long struct) { return UNSAFE.getInt(null, struct + BGFXCapsLimits.TRANSIENTIBSIZE); }

    // -----------------------------------

    /** An array of {@link BGFXCapsLimits} structs. */
    public static class Buffer extends StructBuffer<BGFXCapsLimits, Buffer> {

        private static final BGFXCapsLimits ELEMENT_FACTORY = BGFXCapsLimits.create(-1L);

        /**
         * Creates a new {@code BGFXCapsLimits.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXCapsLimits#SIZEOF}, and its mark will be undefined.
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
        protected BGFXCapsLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link BGFXCapsLimits#maxDrawCalls} field. */
        @NativeType("uint32_t")
        public int maxDrawCalls() { return BGFXCapsLimits.nmaxDrawCalls(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxBlits} field. */
        @NativeType("uint32_t")
        public int maxBlits() { return BGFXCapsLimits.nmaxBlits(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxTextureSize} field. */
        @NativeType("uint32_t")
        public int maxTextureSize() { return BGFXCapsLimits.nmaxTextureSize(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxTextureLayers} field. */
        @NativeType("uint32_t")
        public int maxTextureLayers() { return BGFXCapsLimits.nmaxTextureLayers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxViews} field. */
        @NativeType("uint32_t")
        public int maxViews() { return BGFXCapsLimits.nmaxViews(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxFrameBuffers} field. */
        @NativeType("uint32_t")
        public int maxFrameBuffers() { return BGFXCapsLimits.nmaxFrameBuffers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxFBAttachments} field. */
        @NativeType("uint32_t")
        public int maxFBAttachments() { return BGFXCapsLimits.nmaxFBAttachments(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxPrograms} field. */
        @NativeType("uint32_t")
        public int maxPrograms() { return BGFXCapsLimits.nmaxPrograms(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxShaders} field. */
        @NativeType("uint32_t")
        public int maxShaders() { return BGFXCapsLimits.nmaxShaders(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxTextures} field. */
        @NativeType("uint32_t")
        public int maxTextures() { return BGFXCapsLimits.nmaxTextures(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxTextureSamplers} field. */
        @NativeType("uint32_t")
        public int maxTextureSamplers() { return BGFXCapsLimits.nmaxTextureSamplers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxComputeBindings} field. */
        @NativeType("uint32_t")
        public int maxComputeBindings() { return BGFXCapsLimits.nmaxComputeBindings(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxVertexLayouts} field. */
        @NativeType("uint32_t")
        public int maxVertexLayouts() { return BGFXCapsLimits.nmaxVertexLayouts(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxVertexStreams} field. */
        @NativeType("uint32_t")
        public int maxVertexStreams() { return BGFXCapsLimits.nmaxVertexStreams(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxIndexBuffers} field. */
        @NativeType("uint32_t")
        public int maxIndexBuffers() { return BGFXCapsLimits.nmaxIndexBuffers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxVertexBuffers} field. */
        @NativeType("uint32_t")
        public int maxVertexBuffers() { return BGFXCapsLimits.nmaxVertexBuffers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxDynamicIndexBuffers} field. */
        @NativeType("uint32_t")
        public int maxDynamicIndexBuffers() { return BGFXCapsLimits.nmaxDynamicIndexBuffers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxDynamicVertexBuffers} field. */
        @NativeType("uint32_t")
        public int maxDynamicVertexBuffers() { return BGFXCapsLimits.nmaxDynamicVertexBuffers(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxUniforms} field. */
        @NativeType("uint32_t")
        public int maxUniforms() { return BGFXCapsLimits.nmaxUniforms(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxOcclusionQueries} field. */
        @NativeType("uint32_t")
        public int maxOcclusionQueries() { return BGFXCapsLimits.nmaxOcclusionQueries(address()); }
        /** @return the value of the {@link BGFXCapsLimits#maxEncoders} field. */
        @NativeType("uint32_t")
        public int maxEncoders() { return BGFXCapsLimits.nmaxEncoders(address()); }
        /** @return the value of the {@link BGFXCapsLimits#minResourceCbSize} field. */
        @NativeType("uint32_t")
        public int minResourceCbSize() { return BGFXCapsLimits.nminResourceCbSize(address()); }
        /** @return the value of the {@link BGFXCapsLimits#transientVbSize} field. */
        @NativeType("uint32_t")
        public int transientVbSize() { return BGFXCapsLimits.ntransientVbSize(address()); }
        /** @return the value of the {@link BGFXCapsLimits#transientIbSize} field. */
        @NativeType("uint32_t")
        public int transientIbSize() { return BGFXCapsLimits.ntransientIbSize(address()); }

    }

}