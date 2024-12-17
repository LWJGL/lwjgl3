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
 * struct XrPassthroughCreateInfoHTC {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughFormHTC form;
 * }}</pre>
 */
public class XrPassthroughCreateInfoHTC extends Struct<XrPassthroughCreateInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FORM;

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
        FORM = layout.offsetof(2);
    }

    protected XrPassthroughCreateInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughCreateInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughCreateInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrPassthroughCreateInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughCreateInfoHTC(ByteBuffer container) {
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
    /** @return the value of the {@code form} field. */
    @NativeType("XrPassthroughFormHTC")
    public int form() { return nform(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughCreateInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC TYPE_PASSTHROUGH_CREATE_INFO_HTC} value to the {@code type} field. */
    public XrPassthroughCreateInfoHTC type$Default() { return type(HTCPassthrough.XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughCreateInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code form} field. */
    public XrPassthroughCreateInfoHTC form(@NativeType("XrPassthroughFormHTC") int value) { nform(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughCreateInfoHTC set(
        int type,
        long next,
        int form
    ) {
        type(type);
        next(next);
        form(form);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughCreateInfoHTC set(XrPassthroughCreateInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughCreateInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughCreateInfoHTC malloc() {
        return new XrPassthroughCreateInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughCreateInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughCreateInfoHTC calloc() {
        return new XrPassthroughCreateInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughCreateInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughCreateInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughCreateInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughCreateInfoHTC} instance for the specified memory address. */
    public static XrPassthroughCreateInfoHTC create(long address) {
        return new XrPassthroughCreateInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughCreateInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrPassthroughCreateInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughCreateInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughCreateInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughCreateInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughCreateInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughCreateInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughCreateInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughCreateInfoHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughCreateInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughCreateInfoHTC malloc(MemoryStack stack) {
        return new XrPassthroughCreateInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughCreateInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughCreateInfoHTC calloc(MemoryStack stack) {
        return new XrPassthroughCreateInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughCreateInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughCreateInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughCreateInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughCreateInfoHTC.NEXT); }
    /** Unsafe version of {@link #form}. */
    public static int nform(long struct) { return memGetInt(struct + XrPassthroughCreateInfoHTC.FORM); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughCreateInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughCreateInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #form(int) form}. */
    public static void nform(long struct, int value) { memPutInt(struct + XrPassthroughCreateInfoHTC.FORM, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughCreateInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughCreateInfoHTC, Buffer> implements NativeResource {

        private static final XrPassthroughCreateInfoHTC ELEMENT_FACTORY = XrPassthroughCreateInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrPassthroughCreateInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughCreateInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughCreateInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughCreateInfoHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughCreateInfoHTC.nnext(address()); }
        /** @return the value of the {@code form} field. */
        @NativeType("XrPassthroughFormHTC")
        public int form() { return XrPassthroughCreateInfoHTC.nform(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughCreateInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughCreateInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC TYPE_PASSTHROUGH_CREATE_INFO_HTC} value to the {@code type} field. */
        public XrPassthroughCreateInfoHTC.Buffer type$Default() { return type(HTCPassthrough.XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughCreateInfoHTC.Buffer next(@NativeType("void const *") long value) { XrPassthroughCreateInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code form} field. */
        public XrPassthroughCreateInfoHTC.Buffer form(@NativeType("XrPassthroughFormHTC") int value) { XrPassthroughCreateInfoHTC.nform(address(), value); return this; }

    }

}