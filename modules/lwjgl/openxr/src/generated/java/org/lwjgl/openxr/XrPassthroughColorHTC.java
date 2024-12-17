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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrPassthroughColorHTC {
 *     XrStructureType type;
 *     void const * next;
 *     float alpha;
 * }}</pre>
 */
public class XrPassthroughColorHTC extends Struct<XrPassthroughColorHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ALPHA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ALPHA = layout.offsetof(2);
    }

    protected XrPassthroughColorHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorHTC create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorHTC(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorHTC(ByteBuffer container) {
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
    /** @return the value of the {@code alpha} field. */
    public float alpha() { return nalpha(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughColorHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_COLOR_HTC TYPE_PASSTHROUGH_COLOR_HTC} value to the {@code type} field. */
    public XrPassthroughColorHTC type$Default() { return type(HTCPassthrough.XR_TYPE_PASSTHROUGH_COLOR_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughColorHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public XrPassthroughColorHTC alpha(float value) { nalpha(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorHTC set(
        int type,
        long next,
        float alpha
    ) {
        type(type);
        next(next);
        alpha(alpha);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughColorHTC set(XrPassthroughColorHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorHTC malloc() {
        return new XrPassthroughColorHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorHTC calloc() {
        return new XrPassthroughColorHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorHTC} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorHTC} instance for the specified memory address. */
    public static XrPassthroughColorHTC create(long address) {
        return new XrPassthroughColorHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughColorHTC createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorHTC(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughColorHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorHTC malloc(MemoryStack stack) {
        return new XrPassthroughColorHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorHTC calloc(MemoryStack stack) {
        return new XrPassthroughColorHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughColorHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorHTC.NEXT); }
    /** Unsafe version of {@link #alpha}. */
    public static float nalpha(long struct) { return memGetFloat(struct + XrPassthroughColorHTC.ALPHA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughColorHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorHTC.NEXT, value); }
    /** Unsafe version of {@link #alpha(float) alpha}. */
    public static void nalpha(long struct, float value) { memPutFloat(struct + XrPassthroughColorHTC.ALPHA, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorHTC} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorHTC, Buffer> implements NativeResource {

        private static final XrPassthroughColorHTC ELEMENT_FACTORY = XrPassthroughColorHTC.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorHTC.nnext(address()); }
        /** @return the value of the {@code alpha} field. */
        public float alpha() { return XrPassthroughColorHTC.nalpha(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughColorHTC.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_COLOR_HTC TYPE_PASSTHROUGH_COLOR_HTC} value to the {@code type} field. */
        public XrPassthroughColorHTC.Buffer type$Default() { return type(HTCPassthrough.XR_TYPE_PASSTHROUGH_COLOR_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughColorHTC.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public XrPassthroughColorHTC.Buffer alpha(float value) { XrPassthroughColorHTC.nalpha(address(), value); return this; }

    }

}