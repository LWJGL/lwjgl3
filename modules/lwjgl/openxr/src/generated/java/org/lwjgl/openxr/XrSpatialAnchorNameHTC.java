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

import static org.lwjgl.openxr.HTCAnchor.*;

/**
 * <pre>{@code
 * struct XrSpatialAnchorNameHTC {
 *     char name[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC];
 * }}</pre>
 */
public class XrSpatialAnchorNameHTC extends Struct<XrSpatialAnchorNameHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME;

    static {
        Layout layout = __struct(
            __array(1, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
    }

    protected XrSpatialAnchorNameHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorNameHTC create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorNameHTC(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorNameHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorNameHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC]")
    public String nameString() { return nnameString(address()); }

    /** Copies the specified encoded string to the {@code name} field. */
    public XrSpatialAnchorNameHTC name(@NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC]") ByteBuffer value) { nname(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorNameHTC set(XrSpatialAnchorNameHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorNameHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorNameHTC malloc() {
        return new XrSpatialAnchorNameHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorNameHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorNameHTC calloc() {
        return new XrSpatialAnchorNameHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorNameHTC} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorNameHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorNameHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorNameHTC} instance for the specified memory address. */
    public static XrSpatialAnchorNameHTC create(long address) {
        return new XrSpatialAnchorNameHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorNameHTC createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorNameHTC(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorNameHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorNameHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorNameHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorNameHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorNameHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorNameHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorNameHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorNameHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorNameHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorNameHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorNameHTC malloc(MemoryStack stack) {
        return new XrSpatialAnchorNameHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorNameHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorNameHTC calloc(MemoryStack stack) {
        return new XrSpatialAnchorNameHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorNameHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorNameHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorNameHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorNameHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + XrSpatialAnchorNameHTC.NAME, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + XrSpatialAnchorNameHTC.NAME); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC);
        }
        memCopy(memAddress(value), struct + XrSpatialAnchorNameHTC.NAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorNameHTC} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorNameHTC, Buffer> implements NativeResource {

        private static final XrSpatialAnchorNameHTC ELEMENT_FACTORY = XrSpatialAnchorNameHTC.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorNameHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorNameHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorNameHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC]")
        public ByteBuffer name() { return XrSpatialAnchorNameHTC.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC]")
        public String nameString() { return XrSpatialAnchorNameHTC.nnameString(address()); }

        /** Copies the specified encoded string to the {@code name} field. */
        public XrSpatialAnchorNameHTC.Buffer name(@NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC]") ByteBuffer value) { XrSpatialAnchorNameHTC.nname(address(), value); return this; }

    }

}