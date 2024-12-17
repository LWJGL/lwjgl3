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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoEncodeAV1ExtensionHeader {
 *     uint8_t temporal_id;
 *     uint8_t spatial_id;
 * }}</pre>
 */
public class StdVideoEncodeAV1ExtensionHeader extends Struct<StdVideoEncodeAV1ExtensionHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEMPORAL_ID,
        SPATIAL_ID;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEMPORAL_ID = layout.offsetof(0);
        SPATIAL_ID = layout.offsetof(1);
    }

    protected StdVideoEncodeAV1ExtensionHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeAV1ExtensionHeader create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeAV1ExtensionHeader(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeAV1ExtensionHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeAV1ExtensionHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code temporal_id} field. */
    @NativeType("uint8_t")
    public byte temporal_id() { return ntemporal_id(address()); }
    /** @return the value of the {@code spatial_id} field. */
    @NativeType("uint8_t")
    public byte spatial_id() { return nspatial_id(address()); }

    /** Sets the specified value to the {@code temporal_id} field. */
    public StdVideoEncodeAV1ExtensionHeader temporal_id(@NativeType("uint8_t") byte value) { ntemporal_id(address(), value); return this; }
    /** Sets the specified value to the {@code spatial_id} field. */
    public StdVideoEncodeAV1ExtensionHeader spatial_id(@NativeType("uint8_t") byte value) { nspatial_id(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeAV1ExtensionHeader set(
        byte temporal_id,
        byte spatial_id
    ) {
        temporal_id(temporal_id);
        spatial_id(spatial_id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeAV1ExtensionHeader set(StdVideoEncodeAV1ExtensionHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeAV1ExtensionHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1ExtensionHeader malloc() {
        return new StdVideoEncodeAV1ExtensionHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1ExtensionHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1ExtensionHeader calloc() {
        return new StdVideoEncodeAV1ExtensionHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1ExtensionHeader} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeAV1ExtensionHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1ExtensionHeader(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeAV1ExtensionHeader} instance for the specified memory address. */
    public static StdVideoEncodeAV1ExtensionHeader create(long address) {
        return new StdVideoEncodeAV1ExtensionHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeAV1ExtensionHeader createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeAV1ExtensionHeader(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ExtensionHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ExtensionHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ExtensionHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ExtensionHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ExtensionHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ExtensionHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeAV1ExtensionHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ExtensionHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeAV1ExtensionHeader.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1ExtensionHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1ExtensionHeader malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ExtensionHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1ExtensionHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1ExtensionHeader calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ExtensionHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ExtensionHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ExtensionHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ExtensionHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ExtensionHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #temporal_id}. */
    public static byte ntemporal_id(long struct) { return memGetByte(struct + StdVideoEncodeAV1ExtensionHeader.TEMPORAL_ID); }
    /** Unsafe version of {@link #spatial_id}. */
    public static byte nspatial_id(long struct) { return memGetByte(struct + StdVideoEncodeAV1ExtensionHeader.SPATIAL_ID); }

    /** Unsafe version of {@link #temporal_id(byte) temporal_id}. */
    public static void ntemporal_id(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1ExtensionHeader.TEMPORAL_ID, value); }
    /** Unsafe version of {@link #spatial_id(byte) spatial_id}. */
    public static void nspatial_id(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1ExtensionHeader.SPATIAL_ID, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeAV1ExtensionHeader} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1ExtensionHeader, Buffer> implements NativeResource {

        private static final StdVideoEncodeAV1ExtensionHeader ELEMENT_FACTORY = StdVideoEncodeAV1ExtensionHeader.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeAV1ExtensionHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeAV1ExtensionHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeAV1ExtensionHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code temporal_id} field. */
        @NativeType("uint8_t")
        public byte temporal_id() { return StdVideoEncodeAV1ExtensionHeader.ntemporal_id(address()); }
        /** @return the value of the {@code spatial_id} field. */
        @NativeType("uint8_t")
        public byte spatial_id() { return StdVideoEncodeAV1ExtensionHeader.nspatial_id(address()); }

        /** Sets the specified value to the {@code temporal_id} field. */
        public StdVideoEncodeAV1ExtensionHeader.Buffer temporal_id(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.ntemporal_id(address(), value); return this; }
        /** Sets the specified value to the {@code spatial_id} field. */
        public StdVideoEncodeAV1ExtensionHeader.Buffer spatial_id(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1ExtensionHeader.nspatial_id(address(), value); return this; }

    }

}