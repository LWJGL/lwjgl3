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
 * struct XrEventDataMainSessionVisibilityChangedEXTX {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 visible;
 *     XrOverlayMainSessionFlagsEXTX flags;
 * }</code></pre>
 */
public class XrEventDataMainSessionVisibilityChangedEXTX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VISIBLE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VISIBLE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrEventDataMainSessionVisibilityChangedEXTX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataMainSessionVisibilityChangedEXTX(ByteBuffer container) {
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
    /** Returns the value of the {@code visible} field. */
    @NativeType("XrBool32")
    public boolean visible() { return nvisible(address()) != 0; }
    /** Returns the value of the {@code flags} field. */
    @NativeType("XrOverlayMainSessionFlagsEXTX")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code visible} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX visible(@NativeType("XrBool32") boolean value) { nvisible(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrEventDataMainSessionVisibilityChangedEXTX flags(@NativeType("XrOverlayMainSessionFlagsEXTX") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataMainSessionVisibilityChangedEXTX set(
        int type,
        long next,
        boolean visible,
        long flags
    ) {
        type(type);
        next(next);
        visible(visible);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataMainSessionVisibilityChangedEXTX set(XrEventDataMainSessionVisibilityChangedEXTX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataMainSessionVisibilityChangedEXTX malloc() {
        return wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataMainSessionVisibilityChangedEXTX calloc() {
        return wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated with {@link BufferUtils}. */
    public static XrEventDataMainSessionVisibilityChangedEXTX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance for the specified memory address. */
    public static XrEventDataMainSessionVisibilityChangedEXTX create(long address) {
        return wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataMainSessionVisibilityChangedEXTX createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, address);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrEventDataMainSessionVisibilityChangedEXTX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrEventDataMainSessionVisibilityChangedEXTX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX mallocStack(MemoryStack stack) {
        return wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataMainSessionVisibilityChangedEXTX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX callocStack(MemoryStack stack) {
        return wrap(XrEventDataMainSessionVisibilityChangedEXTX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataMainSessionVisibilityChangedEXTX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataMainSessionVisibilityChangedEXTX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataMainSessionVisibilityChangedEXTX.NEXT); }
    /** Unsafe version of {@link #visible}. */
    public static int nvisible(long struct) { return UNSAFE.getInt(null, struct + XrEventDataMainSessionVisibilityChangedEXTX.VISIBLE); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrEventDataMainSessionVisibilityChangedEXTX.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataMainSessionVisibilityChangedEXTX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataMainSessionVisibilityChangedEXTX.NEXT, check(value)); }
    /** Unsafe version of {@link #visible(boolean) visible}. */
    public static void nvisible(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataMainSessionVisibilityChangedEXTX.VISIBLE, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataMainSessionVisibilityChangedEXTX.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataMainSessionVisibilityChangedEXTX.NEXT));
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

    /** An array of {@link XrEventDataMainSessionVisibilityChangedEXTX} structs. */
    public static class Buffer extends StructBuffer<XrEventDataMainSessionVisibilityChangedEXTX, Buffer> implements NativeResource {

        private static final XrEventDataMainSessionVisibilityChangedEXTX ELEMENT_FACTORY = XrEventDataMainSessionVisibilityChangedEXTX.create(-1L);

        /**
         * Creates a new {@code XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataMainSessionVisibilityChangedEXTX#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataMainSessionVisibilityChangedEXTX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataMainSessionVisibilityChangedEXTX.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataMainSessionVisibilityChangedEXTX.nnext(address()); }
        /** Returns the value of the {@code visible} field. */
        @NativeType("XrBool32")
        public boolean visible() { return XrEventDataMainSessionVisibilityChangedEXTX.nvisible(address()) != 0; }
        /** Returns the value of the {@code flags} field. */
        @NativeType("XrOverlayMainSessionFlagsEXTX")
        public long flags() { return XrEventDataMainSessionVisibilityChangedEXTX.nflags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataMainSessionVisibilityChangedEXTX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer next(@NativeType("void const *") long value) { XrEventDataMainSessionVisibilityChangedEXTX.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code visible} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer visible(@NativeType("XrBool32") boolean value) { XrEventDataMainSessionVisibilityChangedEXTX.nvisible(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrEventDataMainSessionVisibilityChangedEXTX.Buffer flags(@NativeType("XrOverlayMainSessionFlagsEXTX") long value) { XrEventDataMainSessionVisibilityChangedEXTX.nflags(address(), value); return this; }

    }

}