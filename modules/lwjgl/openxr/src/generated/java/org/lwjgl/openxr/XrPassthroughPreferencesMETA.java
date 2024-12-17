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
 * struct XrPassthroughPreferencesMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughPreferenceFlagsMETA flags;
 * }}</pre>
 */
public class XrPassthroughPreferencesMETA extends Struct<XrPassthroughPreferencesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected XrPassthroughPreferencesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughPreferencesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughPreferencesMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughPreferencesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughPreferencesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("XrPassthroughPreferenceFlagsMETA")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughPreferencesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughPreferences#XR_TYPE_PASSTHROUGH_PREFERENCES_META TYPE_PASSTHROUGH_PREFERENCES_META} value to the {@code type} field. */
    public XrPassthroughPreferencesMETA type$Default() { return type(METAPassthroughPreferences.XR_TYPE_PASSTHROUGH_PREFERENCES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughPreferencesMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughPreferencesMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughPreferencesMETA set(XrPassthroughPreferencesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughPreferencesMETA malloc() {
        return new XrPassthroughPreferencesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughPreferencesMETA calloc() {
        return new XrPassthroughPreferencesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughPreferencesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughPreferencesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance for the specified memory address. */
    public static XrPassthroughPreferencesMETA create(long address) {
        return new XrPassthroughPreferencesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughPreferencesMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughPreferencesMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughPreferencesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughPreferencesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughPreferencesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughPreferencesMETA malloc(MemoryStack stack) {
        return new XrPassthroughPreferencesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughPreferencesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughPreferencesMETA calloc(MemoryStack stack) {
        return new XrPassthroughPreferencesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughPreferencesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughPreferencesMETA.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrPassthroughPreferencesMETA.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughPreferencesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughPreferencesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughPreferencesMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughPreferencesMETA, Buffer> implements NativeResource {

        private static final XrPassthroughPreferencesMETA ELEMENT_FACTORY = XrPassthroughPreferencesMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughPreferencesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughPreferencesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughPreferencesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughPreferencesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughPreferencesMETA.nnext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrPassthroughPreferenceFlagsMETA")
        public long flags() { return XrPassthroughPreferencesMETA.nflags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughPreferencesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughPreferencesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughPreferences#XR_TYPE_PASSTHROUGH_PREFERENCES_META TYPE_PASSTHROUGH_PREFERENCES_META} value to the {@code type} field. */
        public XrPassthroughPreferencesMETA.Buffer type$Default() { return type(METAPassthroughPreferences.XR_TYPE_PASSTHROUGH_PREFERENCES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughPreferencesMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughPreferencesMETA.nnext(address(), value); return this; }

    }

}