/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CGRect {
 *     {@link CGPoint CGPoint} origin;
 *     {@link CGSize CGSize} size;
 * }</code></pre>
 */
public class CGRect extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIGIN,
        SIZE;

    static {
        Layout layout = __struct(
            __member(CGPoint.SIZEOF, CGPoint.ALIGNOF),
            __member(CGSize.SIZEOF, CGSize.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIGIN = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    /**
     * Creates a {@code CGRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CGRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link CGPoint} view of the {@code origin} field. */
    public CGPoint origin() { return norigin(address()); }
    /** Returns a {@link CGSize} view of the {@code size} field. */
    public CGSize size() { return nsize(address()); }

    /** Copies the specified {@link CGPoint} to the {@code origin} field. */
    public CGRect origin(CGPoint value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CGRect origin(java.util.function.Consumer<CGPoint> consumer) { consumer.accept(origin()); return this; }
    /** Copies the specified {@link CGSize} to the {@code size} field. */
    public CGRect size(CGSize value) { nsize(address(), value); return this; }
    /** Passes the {@code size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CGRect size(java.util.function.Consumer<CGSize> consumer) { consumer.accept(size()); return this; }

    /** Initializes this struct with the specified values. */
    public CGRect set(
        CGPoint origin,
        CGSize size
    ) {
        origin(origin);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CGRect set(CGRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CGRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CGRect malloc() {
        return wrap(CGRect.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CGRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CGRect calloc() {
        return wrap(CGRect.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CGRect} instance allocated with {@link BufferUtils}. */
    public static CGRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CGRect.class, memAddress(container), container);
    }

    /** Returns a new {@code CGRect} instance for the specified memory address. */
    public static CGRect create(long address) {
        return wrap(CGRect.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGRect createSafe(long address) {
        return address == NULL ? null : wrap(CGRect.class, address);
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CGRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGRect.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CGRect} instance allocated on the thread-local {@link MemoryStack}. */
    public static CGRect mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CGRect} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CGRect callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CGRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CGRect mallocStack(MemoryStack stack) {
        return wrap(CGRect.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CGRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CGRect callocStack(MemoryStack stack) {
        return wrap(CGRect.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGRect.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #origin}. */
    public static CGPoint norigin(long struct) { return CGPoint.create(struct + CGRect.ORIGIN); }
    /** Unsafe version of {@link #size}. */
    public static CGSize nsize(long struct) { return CGSize.create(struct + CGRect.SIZE); }

    /** Unsafe version of {@link #origin(CGPoint) origin}. */
    public static void norigin(long struct, CGPoint value) { memCopy(value.address(), struct + CGRect.ORIGIN, CGPoint.SIZEOF); }
    /** Unsafe version of {@link #size(CGSize) size}. */
    public static void nsize(long struct, CGSize value) { memCopy(value.address(), struct + CGRect.SIZE, CGSize.SIZEOF); }

    // -----------------------------------

    /** An array of {@link CGRect} structs. */
    public static class Buffer extends StructBuffer<CGRect, Buffer> implements NativeResource {

        private static final CGRect ELEMENT_FACTORY = CGRect.create(-1L);

        /**
         * Creates a new {@code CGRect.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CGRect#SIZEOF}, and its mark will be undefined.
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
        protected CGRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link CGPoint} view of the {@code origin} field. */
        public CGPoint origin() { return CGRect.norigin(address()); }
        /** Returns a {@link CGSize} view of the {@code size} field. */
        public CGSize size() { return CGRect.nsize(address()); }

        /** Copies the specified {@link CGPoint} to the {@code origin} field. */
        public CGRect.Buffer origin(CGPoint value) { CGRect.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CGRect.Buffer origin(java.util.function.Consumer<CGPoint> consumer) { consumer.accept(origin()); return this; }
        /** Copies the specified {@link CGSize} to the {@code size} field. */
        public CGRect.Buffer size(CGSize value) { CGRect.nsize(address(), value); return this; }
        /** Passes the {@code size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CGRect.Buffer size(java.util.function.Consumer<CGSize> consumer) { consumer.accept(size()); return this; }

    }

}