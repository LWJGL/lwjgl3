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
 * <pre><code>
 * struct aiVectorKey {
 *     double mTime;
 *     {@link AIVector3D struct aiVector3D} mValue;
 *     aiAnimInterpolation mInterpolation;
 * }</code></pre>
 */
@NativeType("struct aiVectorKey")
public class AIVectorKey extends Struct<AIVectorKey> implements NativeResource {

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
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTIME = layout.offsetof(0);
        MVALUE = layout.offsetof(1);
        MINTERPOLATION = layout.offsetof(2);
    }

    protected AIVectorKey(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIVectorKey create(long address, @Nullable ByteBuffer container) {
        return new AIVectorKey(address, container);
    }

    /**
     * Creates a {@code AIVectorKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIVectorKey(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mTime} field. */
    public double mTime() { return nmTime(address()); }
    /** @return a {@link AIVector3D} view of the {@code mValue} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mValue() { return nmValue(address()); }
    /** @return the value of the {@code mInterpolation} field. */
    @NativeType("aiAnimInterpolation")
    public int mInterpolation() { return nmInterpolation(address()); }

    /** Sets the specified value to the {@code mTime} field. */
    public AIVectorKey mTime(double value) { nmTime(address(), value); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mValue} field. */
    public AIVectorKey mValue(@NativeType("struct aiVector3D") AIVector3D value) { nmValue(address(), value); return this; }
    /** Passes the {@code mValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIVectorKey mValue(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mValue()); return this; }
    /** Sets the specified value to the {@code mInterpolation} field. */
    public AIVectorKey mInterpolation(@NativeType("aiAnimInterpolation") int value) { nmInterpolation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIVectorKey set(
        double mTime,
        AIVector3D mValue,
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
    public AIVectorKey set(AIVectorKey src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIVectorKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIVectorKey malloc() {
        return new AIVectorKey(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIVectorKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIVectorKey calloc() {
        return new AIVectorKey(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIVectorKey} instance allocated with {@link BufferUtils}. */
    public static AIVectorKey create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIVectorKey(memAddress(container), container);
    }

    /** Returns a new {@code AIVectorKey} instance for the specified memory address. */
    public static AIVectorKey create(long address) {
        return new AIVectorKey(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIVectorKey createSafe(long address) {
        return address == NULL ? null : new AIVectorKey(address, null);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIVectorKey.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIVectorKey.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIVectorKey.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIVectorKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIVectorKey.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIVectorKey.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIVectorKey mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIVectorKey callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIVectorKey mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIVectorKey callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVectorKey.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVectorKey.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVectorKey.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVectorKey.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIVectorKey} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIVectorKey malloc(MemoryStack stack) {
        return new AIVectorKey(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIVectorKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIVectorKey calloc(MemoryStack stack) {
        return new AIVectorKey(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIVectorKey.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVectorKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIVectorKey.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTime}. */
    public static double nmTime(long struct) { return memGetDouble(struct + AIVectorKey.MTIME); }
    /** Unsafe version of {@link #mValue}. */
    public static AIVector3D nmValue(long struct) { return AIVector3D.create(struct + AIVectorKey.MVALUE); }
    /** Unsafe version of {@link #mInterpolation}. */
    public static int nmInterpolation(long struct) { return memGetInt(struct + AIVectorKey.MINTERPOLATION); }

    /** Unsafe version of {@link #mTime(double) mTime}. */
    public static void nmTime(long struct, double value) { memPutDouble(struct + AIVectorKey.MTIME, value); }
    /** Unsafe version of {@link #mValue(AIVector3D) mValue}. */
    public static void nmValue(long struct, AIVector3D value) { memCopy(value.address(), struct + AIVectorKey.MVALUE, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mInterpolation(int) mInterpolation}. */
    public static void nmInterpolation(long struct, int value) { memPutInt(struct + AIVectorKey.MINTERPOLATION, value); }

    // -----------------------------------

    /** An array of {@link AIVectorKey} structs. */
    public static class Buffer extends StructBuffer<AIVectorKey, Buffer> implements NativeResource {

        private static final AIVectorKey ELEMENT_FACTORY = AIVectorKey.create(-1L);

        /**
         * Creates a new {@code AIVectorKey.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIVectorKey#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIVectorKey getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mTime} field. */
        public double mTime() { return AIVectorKey.nmTime(address()); }
        /** @return a {@link AIVector3D} view of the {@code mValue} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mValue() { return AIVectorKey.nmValue(address()); }
        /** @return the value of the {@code mInterpolation} field. */
        @NativeType("aiAnimInterpolation")
        public int mInterpolation() { return AIVectorKey.nmInterpolation(address()); }

        /** Sets the specified value to the {@code mTime} field. */
        public AIVectorKey.Buffer mTime(double value) { AIVectorKey.nmTime(address(), value); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mValue} field. */
        public AIVectorKey.Buffer mValue(@NativeType("struct aiVector3D") AIVector3D value) { AIVectorKey.nmValue(address(), value); return this; }
        /** Passes the {@code mValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIVectorKey.Buffer mValue(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mValue()); return this; }
        /** Sets the specified value to the {@code mInterpolation} field. */
        public AIVectorKey.Buffer mInterpolation(@NativeType("aiAnimInterpolation") int value) { AIVectorKey.nmInterpolation(address(), value); return this; }

    }

}