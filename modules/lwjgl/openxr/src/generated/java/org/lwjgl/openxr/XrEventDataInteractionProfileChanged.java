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
 * struct XrEventDataInteractionProfileChanged {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 * }}</pre>
 */
public class XrEventDataInteractionProfileChanged extends Struct<XrEventDataInteractionProfileChanged> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
    }

    protected XrEventDataInteractionProfileChanged(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataInteractionProfileChanged create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataInteractionProfileChanged(address, container);
    }

    /**
     * Creates a {@code XrEventDataInteractionProfileChanged} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataInteractionProfileChanged(ByteBuffer container) {
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
    /** @return the value of the {@code session} field. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataInteractionProfileChanged type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED} value to the {@code type} field. */
    public XrEventDataInteractionProfileChanged type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataInteractionProfileChanged next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataInteractionProfileChanged set(
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
    public XrEventDataInteractionProfileChanged set(XrEventDataInteractionProfileChanged src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataInteractionProfileChanged} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataInteractionProfileChanged malloc() {
        return new XrEventDataInteractionProfileChanged(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataInteractionProfileChanged} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataInteractionProfileChanged calloc() {
        return new XrEventDataInteractionProfileChanged(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataInteractionProfileChanged} instance allocated with {@link BufferUtils}. */
    public static XrEventDataInteractionProfileChanged create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataInteractionProfileChanged(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataInteractionProfileChanged} instance for the specified memory address. */
    public static XrEventDataInteractionProfileChanged create(long address) {
        return new XrEventDataInteractionProfileChanged(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataInteractionProfileChanged createSafe(long address) {
        return address == NULL ? null : new XrEventDataInteractionProfileChanged(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataInteractionProfileChanged}. */
    public static XrEventDataInteractionProfileChanged create(XrEventDataBaseHeader value) {
        return new XrEventDataInteractionProfileChanged(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataInteractionProfileChanged.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionProfileChanged.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInteractionProfileChanged.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionProfileChanged.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInteractionProfileChanged.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionProfileChanged.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataInteractionProfileChanged.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionProfileChanged.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataInteractionProfileChanged.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataInteractionProfileChanged.Buffer}. */
    public static XrEventDataInteractionProfileChanged.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataInteractionProfileChanged.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataInteractionProfileChanged} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataInteractionProfileChanged malloc(MemoryStack stack) {
        return new XrEventDataInteractionProfileChanged(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataInteractionProfileChanged} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataInteractionProfileChanged calloc(MemoryStack stack) {
        return new XrEventDataInteractionProfileChanged(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataInteractionProfileChanged.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionProfileChanged.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInteractionProfileChanged.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionProfileChanged.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataInteractionProfileChanged.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataInteractionProfileChanged.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataInteractionProfileChanged.SESSION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataInteractionProfileChanged.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataInteractionProfileChanged.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataInteractionProfileChanged} structs. */
    public static class Buffer extends StructBuffer<XrEventDataInteractionProfileChanged, Buffer> implements NativeResource {

        private static final XrEventDataInteractionProfileChanged ELEMENT_FACTORY = XrEventDataInteractionProfileChanged.create(-1L);

        /**
         * Creates a new {@code XrEventDataInteractionProfileChanged.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataInteractionProfileChanged#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataInteractionProfileChanged getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataInteractionProfileChanged.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataInteractionProfileChanged.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataInteractionProfileChanged.nsession(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataInteractionProfileChanged.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataInteractionProfileChanged.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED} value to the {@code type} field. */
        public XrEventDataInteractionProfileChanged.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataInteractionProfileChanged.Buffer next(@NativeType("void const *") long value) { XrEventDataInteractionProfileChanged.nnext(address(), value); return this; }

    }

}