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

/**
 * <pre>{@code
 * struct StdVideoEncodeAV1ReferenceInfo {
 *     {@link StdVideoEncodeAV1ReferenceInfoFlags StdVideoEncodeAV1ReferenceInfoFlags} flags;
 *     uint32_t RefFrameId;
 *     StdVideoAV1FrameType frame_type;
 *     uint8_t OrderHint;
 *     uint8_t reserved1[3];
 *     {@link StdVideoEncodeAV1ExtensionHeader StdVideoEncodeAV1ExtensionHeader} const * pExtensionHeader;
 * }}</pre>
 */
public class StdVideoEncodeAV1ReferenceInfo extends Struct<StdVideoEncodeAV1ReferenceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        REFFRAMEID,
        FRAME_TYPE,
        ORDERHINT,
        RESERVED1,
        PEXTENSIONHEADER;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeAV1ReferenceInfoFlags.SIZEOF, StdVideoEncodeAV1ReferenceInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(1),
            __array(1, 3),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        REFFRAMEID = layout.offsetof(1);
        FRAME_TYPE = layout.offsetof(2);
        ORDERHINT = layout.offsetof(3);
        RESERVED1 = layout.offsetof(4);
        PEXTENSIONHEADER = layout.offsetof(5);
    }

    protected StdVideoEncodeAV1ReferenceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeAV1ReferenceInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeAV1ReferenceInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeAV1ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeAV1ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeAV1ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeAV1ReferenceInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code RefFrameId} field. */
    @NativeType("uint32_t")
    public int RefFrameId() { return nRefFrameId(address()); }
    /** @return the value of the {@code frame_type} field. */
    @NativeType("StdVideoAV1FrameType")
    public int frame_type() { return nframe_type(address()); }
    /** @return the value of the {@code OrderHint} field. */
    @NativeType("uint8_t")
    public byte OrderHint() { return nOrderHint(address()); }
    /** @return a {@link StdVideoEncodeAV1ExtensionHeader} view of the struct pointed to by the {@code pExtensionHeader} field. */
    @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
    public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() { return npExtensionHeader(address()); }

    /** Copies the specified {@link StdVideoEncodeAV1ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeAV1ReferenceInfo flags(StdVideoEncodeAV1ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeAV1ReferenceInfo flags(java.util.function.Consumer<StdVideoEncodeAV1ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code RefFrameId} field. */
    public StdVideoEncodeAV1ReferenceInfo RefFrameId(@NativeType("uint32_t") int value) { nRefFrameId(address(), value); return this; }
    /** Sets the specified value to the {@code frame_type} field. */
    public StdVideoEncodeAV1ReferenceInfo frame_type(@NativeType("StdVideoAV1FrameType") int value) { nframe_type(address(), value); return this; }
    /** Sets the specified value to the {@code OrderHint} field. */
    public StdVideoEncodeAV1ReferenceInfo OrderHint(@NativeType("uint8_t") byte value) { nOrderHint(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1ExtensionHeader} to the {@code pExtensionHeader} field. */
    public StdVideoEncodeAV1ReferenceInfo pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) { npExtensionHeader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeAV1ReferenceInfo set(
        StdVideoEncodeAV1ReferenceInfoFlags flags,
        int RefFrameId,
        int frame_type,
        byte OrderHint,
        StdVideoEncodeAV1ExtensionHeader pExtensionHeader
    ) {
        flags(flags);
        RefFrameId(RefFrameId);
        frame_type(frame_type);
        OrderHint(OrderHint);
        pExtensionHeader(pExtensionHeader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeAV1ReferenceInfo set(StdVideoEncodeAV1ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeAV1ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1ReferenceInfo malloc() {
        return new StdVideoEncodeAV1ReferenceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1ReferenceInfo calloc() {
        return new StdVideoEncodeAV1ReferenceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeAV1ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1ReferenceInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeAV1ReferenceInfo} instance for the specified memory address. */
    public static StdVideoEncodeAV1ReferenceInfo create(long address) {
        return new StdVideoEncodeAV1ReferenceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeAV1ReferenceInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeAV1ReferenceInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ReferenceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ReferenceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeAV1ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ReferenceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeAV1ReferenceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeAV1ReferenceInfoFlags nflags(long struct) { return StdVideoEncodeAV1ReferenceInfoFlags.create(struct + StdVideoEncodeAV1ReferenceInfo.FLAGS); }
    /** Unsafe version of {@link #RefFrameId}. */
    public static int nRefFrameId(long struct) { return memGetInt(struct + StdVideoEncodeAV1ReferenceInfo.REFFRAMEID); }
    /** Unsafe version of {@link #frame_type}. */
    public static int nframe_type(long struct) { return memGetInt(struct + StdVideoEncodeAV1ReferenceInfo.FRAME_TYPE); }
    /** Unsafe version of {@link #OrderHint}. */
    public static byte nOrderHint(long struct) { return memGetByte(struct + StdVideoEncodeAV1ReferenceInfo.ORDERHINT); }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoEncodeAV1ReferenceInfo.RESERVED1, 3); }
    public static byte nreserved1(long struct, int index) {
        return memGetByte(struct + StdVideoEncodeAV1ReferenceInfo.RESERVED1 + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #pExtensionHeader}. */
    public static StdVideoEncodeAV1ExtensionHeader npExtensionHeader(long struct) { return StdVideoEncodeAV1ExtensionHeader.create(memGetAddress(struct + StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER)); }

    /** Unsafe version of {@link #flags(StdVideoEncodeAV1ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeAV1ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeAV1ReferenceInfo.FLAGS, StdVideoEncodeAV1ReferenceInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #RefFrameId(int) RefFrameId}. */
    public static void nRefFrameId(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1ReferenceInfo.REFFRAMEID, value); }
    /** Unsafe version of {@link #frame_type(int) frame_type}. */
    public static void nframe_type(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1ReferenceInfo.FRAME_TYPE, value); }
    /** Unsafe version of {@link #OrderHint(byte) OrderHint}. */
    public static void nOrderHint(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1ReferenceInfo.ORDERHINT, value); }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + StdVideoEncodeAV1ReferenceInfo.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        memPutByte(struct + StdVideoEncodeAV1ReferenceInfo.RESERVED1 + check(index, 3) * 1, value);
    }
    /** Unsafe version of {@link #pExtensionHeader(StdVideoEncodeAV1ExtensionHeader) pExtensionHeader}. */
    public static void npExtensionHeader(long struct, StdVideoEncodeAV1ExtensionHeader value) { memPutAddress(struct + StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeAV1ReferenceInfo.PEXTENSIONHEADER));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeAV1ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeAV1ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeAV1ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeAV1ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeAV1ReferenceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeAV1ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeAV1ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeAV1ReferenceInfoFlags flags() { return StdVideoEncodeAV1ReferenceInfo.nflags(address()); }
        /** @return the value of the {@code RefFrameId} field. */
        @NativeType("uint32_t")
        public int RefFrameId() { return StdVideoEncodeAV1ReferenceInfo.nRefFrameId(address()); }
        /** @return the value of the {@code frame_type} field. */
        @NativeType("StdVideoAV1FrameType")
        public int frame_type() { return StdVideoEncodeAV1ReferenceInfo.nframe_type(address()); }
        /** @return the value of the {@code OrderHint} field. */
        @NativeType("uint8_t")
        public byte OrderHint() { return StdVideoEncodeAV1ReferenceInfo.nOrderHint(address()); }
        /** @return a {@link StdVideoEncodeAV1ExtensionHeader} view of the struct pointed to by the {@code pExtensionHeader} field. */
        @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
        public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() { return StdVideoEncodeAV1ReferenceInfo.npExtensionHeader(address()); }

        /** Copies the specified {@link StdVideoEncodeAV1ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeAV1ReferenceInfo.Buffer flags(StdVideoEncodeAV1ReferenceInfoFlags value) { StdVideoEncodeAV1ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeAV1ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeAV1ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code RefFrameId} field. */
        public StdVideoEncodeAV1ReferenceInfo.Buffer RefFrameId(@NativeType("uint32_t") int value) { StdVideoEncodeAV1ReferenceInfo.nRefFrameId(address(), value); return this; }
        /** Sets the specified value to the {@code frame_type} field. */
        public StdVideoEncodeAV1ReferenceInfo.Buffer frame_type(@NativeType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1ReferenceInfo.nframe_type(address(), value); return this; }
        /** Sets the specified value to the {@code OrderHint} field. */
        public StdVideoEncodeAV1ReferenceInfo.Buffer OrderHint(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1ReferenceInfo.nOrderHint(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1ExtensionHeader} to the {@code pExtensionHeader} field. */
        public StdVideoEncodeAV1ReferenceInfo.Buffer pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) { StdVideoEncodeAV1ReferenceInfo.npExtensionHeader(address(), value); return this; }

    }

}