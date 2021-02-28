/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataEventsLost {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t lostEventCount;
 * }</code></pre>
 */
public class XrEventDataEventsLost extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOSTEVENTCOUNT;

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
        LOSTEVENTCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrEventDataEventsLost} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataEventsLost(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code lostEventCount} field. */
    @NativeType("uint32_t")
    public int lostEventCount() { return nlostEventCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataEventsLost type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataEventsLost next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code lostEventCount} field. */
    public XrEventDataEventsLost lostEventCount(@NativeType("uint32_t") int value) { nlostEventCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataEventsLost set(
        int type,
        long next,
        int lostEventCount
    ) {
        type(type);
        next(next);
        lostEventCount(lostEventCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataEventsLost set(XrEventDataEventsLost src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataEventsLost malloc() {
        return wrap(XrEventDataEventsLost.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataEventsLost calloc() {
        return wrap(XrEventDataEventsLost.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link BufferUtils}. */
    public static XrEventDataEventsLost create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataEventsLost.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataEventsLost} instance for the specified memory address. */
    public static XrEventDataEventsLost create(long address) {
        return wrap(XrEventDataEventsLost.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataEventsLost createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataEventsLost.class, address);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataEventsLost.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataEventsLost.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataEventsLost} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrEventDataEventsLost mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrEventDataEventsLost callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrEventDataEventsLost} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEventsLost mallocStack(MemoryStack stack) {
        return wrap(XrEventDataEventsLost.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataEventsLost} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEventsLost callocStack(MemoryStack stack) {
        return wrap(XrEventDataEventsLost.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataEventsLost.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataEventsLost.NEXT); }
    /** Unsafe version of {@link #lostEventCount}. */
    public static int nlostEventCount(long struct) { return UNSAFE.getInt(null, struct + XrEventDataEventsLost.LOSTEVENTCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataEventsLost.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataEventsLost.NEXT, check(value)); }
    /** Unsafe version of {@link #lostEventCount(int) lostEventCount}. */
    public static void nlostEventCount(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataEventsLost.LOSTEVENTCOUNT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataEventsLost.NEXT));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrEventDataEventsLost} structs. */
    public static class Buffer extends StructBuffer<XrEventDataEventsLost, Buffer> implements NativeResource {

        private static final XrEventDataEventsLost ELEMENT_FACTORY = XrEventDataEventsLost.create(-1L);

        /**
         * Creates a new {@code XrEventDataEventsLost.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataEventsLost#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataEventsLost getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataEventsLost.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataEventsLost.nnext(address()); }
        /** Returns the value of the {@code lostEventCount} field. */
        @NativeType("uint32_t")
        public int lostEventCount() { return XrEventDataEventsLost.nlostEventCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataEventsLost.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataEventsLost.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataEventsLost.Buffer next(@NativeType("void const *") long value) { XrEventDataEventsLost.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code lostEventCount} field. */
        public XrEventDataEventsLost.Buffer lostEventCount(@NativeType("uint32_t") int value) { XrEventDataEventsLost.nlostEventCount(address(), value); return this; }

    }

}