/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrColocationAdvertisementStartInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t bufferSize;
 *     uint8_t * buffer;
 * }}</pre>
 */
public class XrColocationAdvertisementStartInfoMETA extends Struct<XrColocationAdvertisementStartInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERSIZE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BUFFERSIZE = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
    }

    protected XrColocationAdvertisementStartInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColocationAdvertisementStartInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrColocationAdvertisementStartInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrColocationAdvertisementStartInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColocationAdvertisementStartInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code bufferSize} field. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("uint8_t *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrColocationAdvertisementStartInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META} value to the {@code type} field. */
    public XrColocationAdvertisementStartInfoMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrColocationAdvertisementStartInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrColocationAdvertisementStartInfoMETA buffer(@NativeType("uint8_t *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColocationAdvertisementStartInfoMETA set(
        int type,
        long next,
        ByteBuffer buffer
    ) {
        type(type);
        next(next);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrColocationAdvertisementStartInfoMETA set(XrColocationAdvertisementStartInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColocationAdvertisementStartInfoMETA malloc() {
        return new XrColocationAdvertisementStartInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColocationAdvertisementStartInfoMETA calloc() {
        return new XrColocationAdvertisementStartInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrColocationAdvertisementStartInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColocationAdvertisementStartInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance for the specified memory address. */
    public static XrColocationAdvertisementStartInfoMETA create(long address) {
        return new XrColocationAdvertisementStartInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColocationAdvertisementStartInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrColocationAdvertisementStartInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColocationAdvertisementStartInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationAdvertisementStartInfoMETA malloc(MemoryStack stack) {
        return new XrColocationAdvertisementStartInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationAdvertisementStartInfoMETA calloc(MemoryStack stack) {
        return new XrColocationAdvertisementStartInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrColocationAdvertisementStartInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrColocationAdvertisementStartInfoMETA.NEXT); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return memGetInt(struct + XrColocationAdvertisementStartInfoMETA.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(memGetAddress(struct + XrColocationAdvertisementStartInfoMETA.BUFFER), nbufferSize(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrColocationAdvertisementStartInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrColocationAdvertisementStartInfoMETA.NEXT, value); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { memPutInt(struct + XrColocationAdvertisementStartInfoMETA.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) { memPutAddress(struct + XrColocationAdvertisementStartInfoMETA.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrColocationAdvertisementStartInfoMETA.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrColocationAdvertisementStartInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrColocationAdvertisementStartInfoMETA, Buffer> implements NativeResource {

        private static final XrColocationAdvertisementStartInfoMETA ELEMENT_FACTORY = XrColocationAdvertisementStartInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrColocationAdvertisementStartInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColocationAdvertisementStartInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColocationAdvertisementStartInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrColocationAdvertisementStartInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrColocationAdvertisementStartInfoMETA.nnext(address()); }
        /** @return the value of the {@code bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrColocationAdvertisementStartInfoMETA.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("uint8_t *")
        public ByteBuffer buffer() { return XrColocationAdvertisementStartInfoMETA.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrColocationAdvertisementStartInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META} value to the {@code type} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer next(@NativeType("void const *") long value) { XrColocationAdvertisementStartInfoMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer buffer(@NativeType("uint8_t *") ByteBuffer value) { XrColocationAdvertisementStartInfoMETA.nbuffer(address(), value); return this; }

    }

}