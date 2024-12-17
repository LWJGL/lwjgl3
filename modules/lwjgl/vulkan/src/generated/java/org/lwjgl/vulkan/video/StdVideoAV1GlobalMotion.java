/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*;

/**
 * <pre>{@code
 * struct StdVideoAV1GlobalMotion {
 *     uint8_t GmType[STD_VIDEO_AV1_NUM_REF_FRAMES];
 *     int32_t gm_params[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS];
 * }}</pre>
 */
public class StdVideoAV1GlobalMotion extends Struct<StdVideoAV1GlobalMotion> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GMTYPE,
        GM_PARAMS;

    static {
        Layout layout = __struct(
            __array(1, STD_VIDEO_AV1_NUM_REF_FRAMES),
            __array(4, STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GMTYPE = layout.offsetof(0);
        GM_PARAMS = layout.offsetof(1);
    }

    protected StdVideoAV1GlobalMotion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1GlobalMotion create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1GlobalMotion(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1GlobalMotion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1GlobalMotion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code GmType} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer GmType() { return nGmType(address()); }
    /** @return the value at the specified index of the {@code GmType} field. */
    @NativeType("uint8_t")
    public byte GmType(int index) { return nGmType(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code gm_params} field. */
    @NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]")
    public IntBuffer gm_params() { return ngm_params(address()); }
    /** @return the value at the specified index of the {@code gm_params} field. */
    @NativeType("int32_t")
    public int gm_params(int index) { return ngm_params(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code GmType} field. */
    public StdVideoAV1GlobalMotion GmType(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { nGmType(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code GmType} field. */
    public StdVideoAV1GlobalMotion GmType(int index, @NativeType("uint8_t") byte value) { nGmType(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code gm_params} field. */
    public StdVideoAV1GlobalMotion gm_params(@NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]") IntBuffer value) { ngm_params(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code gm_params} field. */
    public StdVideoAV1GlobalMotion gm_params(int index, @NativeType("int32_t") int value) { ngm_params(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1GlobalMotion set(
        ByteBuffer GmType,
        IntBuffer gm_params
    ) {
        GmType(GmType);
        gm_params(gm_params);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1GlobalMotion set(StdVideoAV1GlobalMotion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1GlobalMotion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1GlobalMotion malloc() {
        return new StdVideoAV1GlobalMotion(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1GlobalMotion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1GlobalMotion calloc() {
        return new StdVideoAV1GlobalMotion(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1GlobalMotion} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1GlobalMotion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1GlobalMotion(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1GlobalMotion} instance for the specified memory address. */
    public static StdVideoAV1GlobalMotion create(long address) {
        return new StdVideoAV1GlobalMotion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1GlobalMotion createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1GlobalMotion(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1GlobalMotion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1GlobalMotion.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1GlobalMotion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1GlobalMotion.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1GlobalMotion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1GlobalMotion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1GlobalMotion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1GlobalMotion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1GlobalMotion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1GlobalMotion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1GlobalMotion malloc(MemoryStack stack) {
        return new StdVideoAV1GlobalMotion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1GlobalMotion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1GlobalMotion calloc(MemoryStack stack) {
        return new StdVideoAV1GlobalMotion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1GlobalMotion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1GlobalMotion.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1GlobalMotion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1GlobalMotion.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #GmType}. */
    public static ByteBuffer nGmType(long struct) { return memByteBuffer(struct + StdVideoAV1GlobalMotion.GMTYPE, STD_VIDEO_AV1_NUM_REF_FRAMES); }
    /** Unsafe version of {@link #GmType(int) GmType}. */
    public static byte nGmType(long struct, int index) {
        return memGetByte(struct + StdVideoAV1GlobalMotion.GMTYPE + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1);
    }
    /** Unsafe version of {@link #gm_params}. */
    public static IntBuffer ngm_params(long struct) { return memIntBuffer(struct + StdVideoAV1GlobalMotion.GM_PARAMS, STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS); }
    /** Unsafe version of {@link #gm_params(int) gm_params}. */
    public static int ngm_params(long struct, int index) {
        return memGetInt(struct + StdVideoAV1GlobalMotion.GM_PARAMS + check(index, STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS) * 4);
    }

    /** Unsafe version of {@link #GmType(ByteBuffer) GmType}. */
    public static void nGmType(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_NUM_REF_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoAV1GlobalMotion.GMTYPE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #GmType(int, byte) GmType}. */
    public static void nGmType(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1GlobalMotion.GMTYPE + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1, value);
    }
    /** Unsafe version of {@link #gm_params(IntBuffer) gm_params}. */
    public static void ngm_params(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS); }
        memCopy(memAddress(value), struct + StdVideoAV1GlobalMotion.GM_PARAMS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #gm_params(int, int) gm_params}. */
    public static void ngm_params(long struct, int index, int value) {
        memPutInt(struct + StdVideoAV1GlobalMotion.GM_PARAMS + check(index, STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1GlobalMotion} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1GlobalMotion, Buffer> implements NativeResource {

        private static final StdVideoAV1GlobalMotion ELEMENT_FACTORY = StdVideoAV1GlobalMotion.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1GlobalMotion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1GlobalMotion#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1GlobalMotion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code GmType} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer GmType() { return StdVideoAV1GlobalMotion.nGmType(address()); }
        /** @return the value at the specified index of the {@code GmType} field. */
        @NativeType("uint8_t")
        public byte GmType(int index) { return StdVideoAV1GlobalMotion.nGmType(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code gm_params} field. */
        @NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]")
        public IntBuffer gm_params() { return StdVideoAV1GlobalMotion.ngm_params(address()); }
        /** @return the value at the specified index of the {@code gm_params} field. */
        @NativeType("int32_t")
        public int gm_params(int index) { return StdVideoAV1GlobalMotion.ngm_params(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code GmType} field. */
        public StdVideoAV1GlobalMotion.Buffer GmType(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { StdVideoAV1GlobalMotion.nGmType(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code GmType} field. */
        public StdVideoAV1GlobalMotion.Buffer GmType(int index, @NativeType("uint8_t") byte value) { StdVideoAV1GlobalMotion.nGmType(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code gm_params} field. */
        public StdVideoAV1GlobalMotion.Buffer gm_params(@NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]") IntBuffer value) { StdVideoAV1GlobalMotion.ngm_params(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code gm_params} field. */
        public StdVideoAV1GlobalMotion.Buffer gm_params(int index, @NativeType("int32_t") int value) { StdVideoAV1GlobalMotion.ngm_params(address(), index, value); return this; }

    }

}