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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEyeGazeSampleTimeEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrTime time;
 * }</code></pre>
 */
public class XrEyeGazeSampleTimeEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME;

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
        TIME = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrEyeGazeSampleTimeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeGazeSampleTimeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEyeGazeSampleTimeEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrEyeGazeSampleTimeEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrEyeGazeSampleTimeEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeGazeSampleTimeEXT set(
        int type,
        long next,
        long time
    ) {
        type(type);
        next(next);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyeGazeSampleTimeEXT set(XrEyeGazeSampleTimeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeGazeSampleTimeEXT malloc() {
        return wrap(XrEyeGazeSampleTimeEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeGazeSampleTimeEXT calloc() {
        return wrap(XrEyeGazeSampleTimeEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated with {@link BufferUtils}. */
    public static XrEyeGazeSampleTimeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEyeGazeSampleTimeEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEyeGazeSampleTimeEXT} instance for the specified memory address. */
    public static XrEyeGazeSampleTimeEXT create(long address) {
        return wrap(XrEyeGazeSampleTimeEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeGazeSampleTimeEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrEyeGazeSampleTimeEXT.class, address);
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEyeGazeSampleTimeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeGazeSampleTimeEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrEyeGazeSampleTimeEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrEyeGazeSampleTimeEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazeSampleTimeEXT mallocStack(MemoryStack stack) {
        return wrap(XrEyeGazeSampleTimeEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEyeGazeSampleTimeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazeSampleTimeEXT callocStack(MemoryStack stack) {
        return wrap(XrEyeGazeSampleTimeEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeSampleTimeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeSampleTimeEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEyeGazeSampleTimeEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEyeGazeSampleTimeEXT.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrEyeGazeSampleTimeEXT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEyeGazeSampleTimeEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEyeGazeSampleTimeEXT.NEXT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrEyeGazeSampleTimeEXT.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrEyeGazeSampleTimeEXT} structs. */
    public static class Buffer extends StructBuffer<XrEyeGazeSampleTimeEXT, Buffer> implements NativeResource {

        private static final XrEyeGazeSampleTimeEXT ELEMENT_FACTORY = XrEyeGazeSampleTimeEXT.create(-1L);

        /**
         * Creates a new {@code XrEyeGazeSampleTimeEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeGazeSampleTimeEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrEyeGazeSampleTimeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEyeGazeSampleTimeEXT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrEyeGazeSampleTimeEXT.nnext(address()); }
        /** Returns the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEyeGazeSampleTimeEXT.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEyeGazeSampleTimeEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEyeGazeSampleTimeEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrEyeGazeSampleTimeEXT.Buffer next(@NativeType("void *") long value) { XrEyeGazeSampleTimeEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrEyeGazeSampleTimeEXT.Buffer time(@NativeType("XrTime") long value) { XrEyeGazeSampleTimeEXT.ntime(address(), value); return this; }

    }

}