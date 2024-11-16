/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A time-value pair specifying a rotation for the given time. Rotations are expressed with quaternions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiQuatKey {
 *     double {@link #mTime};
 *     {@link AIQuaternion struct aiQuaternion} {@link #mValue};
 *     aiAnimInterpolation {@link #mInterpolation};
 * }</code></pre>
 */
@NativeType("struct aiQuatKey")
public class AIQuatKey extends Struct<AIQuatKey> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTIME,
        MVALUE,
        MINTERPOLATION;

    static {
        Layout layout = __struct(
            __member(8),
            __member(AIQuaternion.SIZEOF, AIQuaternion.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTIME = layout.offsetof(0);
        MVALUE = layout.offsetof(1);
        MINTERPOLATION = layout.offsetof(2);
    }

    protected AIQuatKey(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIQuatKey create(long address, @Nullable ByteBuffer container) {
        return new AIQuatKey(address, container);
    }

    /**
     * Creates a {@code AIQuatKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIQuatKey(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** The time of this key */
    public double mTime() { return nmTime(address()); }
    /** The value of this key */
    @NativeType("struct aiQuaternion")
    public AIQuaternion mValue() { return nmValue(address()); }
    /** The interpolation setting of this key */
    @NativeType("aiAnimInterpolation")
    public int mInterpolation() { return nmInterpolation(address()); }

    /** Sets the specified value to the {@link #mTime} field. */
    public AIQuatKey mTime(double value) { nmTime(address(), value); return this; }
    /** Copies the specified {@link AIQuaternion} to the {@link #mValue} field. */
    public AIQuatKey mValue(@NativeType("struct aiQuaternion") AIQuaternion value) { nmValue(address(), value); return this; }
    /** Passes the {@link #mValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIQuatKey mValue(java.util.function.Consumer<AIQuaternion> consumer) { consumer.accept(mValue()); return this; }
    /** Sets the specified value to the {@link #mInterpolation} field. */
    public AIQuatKey mInterpolation(@NativeType("aiAnimInterpolation") int value) { nmInterpolation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIQuatKey set(
        double mTime,
        AIQuaternion mValue,
        int mInterpolation
    ) {
        mTime(mTime);
        mValue(mValue);
        mInterpolation(mInterpolation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIQuatKey set(AIQuatKey src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIQuatKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIQuatKey malloc() {
        return new AIQuatKey(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIQuatKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIQuatKey calloc() {
        return new AIQuatKey(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIQuatKey} instance allocated with {@link BufferUtils}. */
    public static AIQuatKey create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIQuatKey(memAddress(container), container);
    }

    /** Returns a new {@code AIQuatKey} instance for the specified memory address. */
    public static AIQuatKey create(long address) {
        return new AIQuatKey(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIQuatKey createSafe(long address) {
        return address == NULL ? null : new AIQuatKey(address, null);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIQuatKey.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIQuatKey.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIQuatKey.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIQuatKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIQuatKey.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIQuatKey.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIQuatKey mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIQuatKey callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIQuatKey mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIQuatKey callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIQuatKey.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIQuatKey.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIQuatKey.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIQuatKey.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIQuatKey} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIQuatKey malloc(MemoryStack stack) {
        return new AIQuatKey(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIQuatKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIQuatKey calloc(MemoryStack stack) {
        return new AIQuatKey(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIQuatKey.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIQuatKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIQuatKey.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTime}. */
    public static double nmTime(long struct) { return memGetDouble(struct + AIQuatKey.MTIME); }
    /** Unsafe version of {@link #mValue}. */
    public static AIQuaternion nmValue(long struct) { return AIQuaternion.create(struct + AIQuatKey.MVALUE); }
    /** Unsafe version of {@link #mInterpolation}. */
    public static int nmInterpolation(long struct) { return memGetInt(struct + AIQuatKey.MINTERPOLATION); }

    /** Unsafe version of {@link #mTime(double) mTime}. */
    public static void nmTime(long struct, double value) { memPutDouble(struct + AIQuatKey.MTIME, value); }
    /** Unsafe version of {@link #mValue(AIQuaternion) mValue}. */
    public static void nmValue(long struct, AIQuaternion value) { memCopy(value.address(), struct + AIQuatKey.MVALUE, AIQuaternion.SIZEOF); }
    /** Unsafe version of {@link #mInterpolation(int) mInterpolation}. */
    public static void nmInterpolation(long struct, int value) { memPutInt(struct + AIQuatKey.MINTERPOLATION, value); }

    // -----------------------------------

    /** An array of {@link AIQuatKey} structs. */
    public static class Buffer extends StructBuffer<AIQuatKey, Buffer> implements NativeResource {

        private static final AIQuatKey ELEMENT_FACTORY = AIQuatKey.create(-1L);

        /**
         * Creates a new {@code AIQuatKey.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIQuatKey#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIQuatKey getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIQuatKey#mTime} field. */
        public double mTime() { return AIQuatKey.nmTime(address()); }
        /** @return a {@link AIQuaternion} view of the {@link AIQuatKey#mValue} field. */
        @NativeType("struct aiQuaternion")
        public AIQuaternion mValue() { return AIQuatKey.nmValue(address()); }
        /** @return the value of the {@link AIQuatKey#mInterpolation} field. */
        @NativeType("aiAnimInterpolation")
        public int mInterpolation() { return AIQuatKey.nmInterpolation(address()); }

        /** Sets the specified value to the {@link AIQuatKey#mTime} field. */
        public AIQuatKey.Buffer mTime(double value) { AIQuatKey.nmTime(address(), value); return this; }
        /** Copies the specified {@link AIQuaternion} to the {@link AIQuatKey#mValue} field. */
        public AIQuatKey.Buffer mValue(@NativeType("struct aiQuaternion") AIQuaternion value) { AIQuatKey.nmValue(address(), value); return this; }
        /** Passes the {@link AIQuatKey#mValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIQuatKey.Buffer mValue(java.util.function.Consumer<AIQuaternion> consumer) { consumer.accept(mValue()); return this; }
        /** Sets the specified value to the {@link AIQuatKey#mInterpolation} field. */
        public AIQuatKey.Buffer mInterpolation(@NativeType("aiAnimInterpolation") int value) { AIQuatKey.nmInterpolation(address(), value); return this; }

    }

}