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

import static org.lwjgl.openxr.MSFTSpatialAnchorPersistence.*;

/**
 * <pre>{@code
 * struct XrSpatialAnchorPersistenceNameMSFT {
 *     char name[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT];
 * }}</pre>
 */
public class XrSpatialAnchorPersistenceNameMSFT extends Struct<XrSpatialAnchorPersistenceNameMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME;

    static {
        Layout layout = __struct(
            __array(1, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
    }

    protected XrSpatialAnchorPersistenceNameMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorPersistenceNameMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorPersistenceNameMSFT(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorPersistenceNameMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorPersistenceNameMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
    public String nameString() { return nnameString(address()); }

    /** Copies the specified encoded string to the {@code name} field. */
    public XrSpatialAnchorPersistenceNameMSFT name(@NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]") ByteBuffer value) { nname(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorPersistenceNameMSFT set(XrSpatialAnchorPersistenceNameMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistenceNameMSFT malloc() {
        return new XrSpatialAnchorPersistenceNameMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistenceNameMSFT calloc() {
        return new XrSpatialAnchorPersistenceNameMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorPersistenceNameMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorPersistenceNameMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance for the specified memory address. */
    public static XrSpatialAnchorPersistenceNameMSFT create(long address) {
        return new XrSpatialAnchorPersistenceNameMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorPersistenceNameMSFT createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorPersistenceNameMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorPersistenceNameMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistenceNameMSFT malloc(MemoryStack stack) {
        return new XrSpatialAnchorPersistenceNameMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistenceNameMSFT calloc(MemoryStack stack) {
        return new XrSpatialAnchorPersistenceNameMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + XrSpatialAnchorPersistenceNameMSFT.NAME, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + XrSpatialAnchorPersistenceNameMSFT.NAME); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT);
        }
        memCopy(memAddress(value), struct + XrSpatialAnchorPersistenceNameMSFT.NAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorPersistenceNameMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorPersistenceNameMSFT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorPersistenceNameMSFT ELEMENT_FACTORY = XrSpatialAnchorPersistenceNameMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorPersistenceNameMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorPersistenceNameMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorPersistenceNameMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
        public ByteBuffer name() { return XrSpatialAnchorPersistenceNameMSFT.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
        public String nameString() { return XrSpatialAnchorPersistenceNameMSFT.nnameString(address()); }

        /** Copies the specified encoded string to the {@code name} field. */
        public XrSpatialAnchorPersistenceNameMSFT.Buffer name(@NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]") ByteBuffer value) { XrSpatialAnchorPersistenceNameMSFT.nname(address(), value); return this; }

    }

}