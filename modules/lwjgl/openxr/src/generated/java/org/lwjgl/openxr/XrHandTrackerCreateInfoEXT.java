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
 * struct XrHandTrackerCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrHandEXT hand;
 *     XrHandJointSetEXT handJointSet;
 * }</code></pre>
 */
public class XrHandTrackerCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HAND,
        HANDJOINTSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        HAND = layout.offsetof(2);
        HANDJOINTSET = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandTrackerCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackerCreateInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code hand} field. */
    @NativeType("XrHandEXT")
    public int hand() { return nhand(address()); }
    /** Returns the value of the {@code handJointSet} field. */
    @NativeType("XrHandJointSetEXT")
    public int handJointSet() { return nhandJointSet(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandTrackerCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHandTrackerCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code hand} field. */
    public XrHandTrackerCreateInfoEXT hand(@NativeType("XrHandEXT") int value) { nhand(address(), value); return this; }
    /** Sets the specified value to the {@code handJointSet} field. */
    public XrHandTrackerCreateInfoEXT handJointSet(@NativeType("XrHandJointSetEXT") int value) { nhandJointSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackerCreateInfoEXT set(
        int type,
        long next,
        int hand,
        int handJointSet
    ) {
        type(type);
        next(next);
        hand(hand);
        handJointSet(handJointSet);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandTrackerCreateInfoEXT set(XrHandTrackerCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackerCreateInfoEXT malloc() {
        return wrap(XrHandTrackerCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackerCreateInfoEXT calloc() {
        return wrap(XrHandTrackerCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandTrackerCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackerCreateInfoEXT} instance for the specified memory address. */
    public static XrHandTrackerCreateInfoEXT create(long address) {
        return wrap(XrHandTrackerCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackerCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandTrackerCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandTrackerCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackerCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHandTrackerCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHandTrackerCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackerCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(XrHandTrackerCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandTrackerCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackerCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(XrHandTrackerCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackerCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackerCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackerCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackerCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #hand}. */
    public static int nhand(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackerCreateInfoEXT.HAND); }
    /** Unsafe version of {@link #handJointSet}. */
    public static int nhandJointSet(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackerCreateInfoEXT.HANDJOINTSET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackerCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackerCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #hand(int) hand}. */
    public static void nhand(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackerCreateInfoEXT.HAND, value); }
    /** Unsafe version of {@link #handJointSet(int) handJointSet}. */
    public static void nhandJointSet(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackerCreateInfoEXT.HANDJOINTSET, value); }

    // -----------------------------------

    /** An array of {@link XrHandTrackerCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackerCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrHandTrackerCreateInfoEXT ELEMENT_FACTORY = XrHandTrackerCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrHandTrackerCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackerCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandTrackerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackerCreateInfoEXT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHandTrackerCreateInfoEXT.nnext(address()); }
        /** Returns the value of the {@code hand} field. */
        @NativeType("XrHandEXT")
        public int hand() { return XrHandTrackerCreateInfoEXT.nhand(address()); }
        /** Returns the value of the {@code handJointSet} field. */
        @NativeType("XrHandJointSetEXT")
        public int handJointSet() { return XrHandTrackerCreateInfoEXT.nhandJointSet(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandTrackerCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackerCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHandTrackerCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrHandTrackerCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code hand} field. */
        public XrHandTrackerCreateInfoEXT.Buffer hand(@NativeType("XrHandEXT") int value) { XrHandTrackerCreateInfoEXT.nhand(address(), value); return this; }
        /** Sets the specified value to the {@code handJointSet} field. */
        public XrHandTrackerCreateInfoEXT.Buffer handJointSet(@NativeType("XrHandJointSetEXT") int value) { XrHandTrackerCreateInfoEXT.nhandJointSet(address(), value); return this; }

    }

}