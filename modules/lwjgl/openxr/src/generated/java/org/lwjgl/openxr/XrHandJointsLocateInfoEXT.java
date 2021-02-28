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
 * struct XrHandJointsLocateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 * }</code></pre>
 */
public class XrHandJointsLocateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandJointsLocateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointsLocateInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** Returns the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandJointsLocateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHandJointsLocateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrHandJointsLocateInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrHandJointsLocateInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointsLocateInfoEXT set(
        int type,
        long next,
        XrSpace baseSpace,
        long time
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
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
    public XrHandJointsLocateInfoEXT set(XrHandJointsLocateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointsLocateInfoEXT malloc() {
        return wrap(XrHandJointsLocateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointsLocateInfoEXT calloc() {
        return wrap(XrHandJointsLocateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointsLocateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointsLocateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance for the specified memory address. */
    public static XrHandJointsLocateInfoEXT create(long address) {
        return wrap(XrHandJointsLocateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointsLocateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointsLocateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointsLocateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointsLocateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHandJointsLocateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHandJointsLocateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsLocateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(XrHandJointsLocateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsLocateInfoEXT callocStack(MemoryStack stack) {
        return wrap(XrHandJointsLocateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandJointsLocateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointsLocateInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrHandJointsLocateInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrHandJointsLocateInfoEXT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointsLocateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointsLocateInfoEXT.NEXT, check(value)); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrHandJointsLocateInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrHandJointsLocateInfoEXT.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandJointsLocateInfoEXT.NEXT));
        check(memGetAddress(struct + XrHandJointsLocateInfoEXT.BASESPACE));
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

    /** An array of {@link XrHandJointsLocateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointsLocateInfoEXT, Buffer> implements NativeResource {

        private static final XrHandJointsLocateInfoEXT ELEMENT_FACTORY = XrHandJointsLocateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointsLocateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointsLocateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointsLocateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointsLocateInfoEXT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHandJointsLocateInfoEXT.nnext(address()); }
        /** Returns the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrHandJointsLocateInfoEXT.nbaseSpace(address()); }
        /** Returns the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrHandJointsLocateInfoEXT.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandJointsLocateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointsLocateInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHandJointsLocateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrHandJointsLocateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrHandJointsLocateInfoEXT.Buffer baseSpace(XrSpace value) { XrHandJointsLocateInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrHandJointsLocateInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrHandJointsLocateInfoEXT.ntime(address(), value); return this; }

    }

}