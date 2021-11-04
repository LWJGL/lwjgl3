/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Binds a morph anim mesh to a specific point in time.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMeshMorphKey {
 *     double {@link #mTime};
 *     unsigned int * {@link #mValues};
 *     double * {@link #mWeights};
 *     unsigned int {@link #mNumValuesAndWeights};
 * }</code></pre>
 */
@NativeType("struct aiMeshMorphKey")
public class AIMeshMorphKey extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTIME,
        MVALUES,
        MWEIGHTS,
        MNUMVALUESANDWEIGHTS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTIME = layout.offsetof(0);
        MVALUES = layout.offsetof(1);
        MWEIGHTS = layout.offsetof(2);
        MNUMVALUESANDWEIGHTS = layout.offsetof(3);
    }

    /**
     * Creates a {@code AIMeshMorphKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMeshMorphKey(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the time of this key */
    public double mTime() { return nmTime(address()); }
    /** the values at the time of this key */
    @NativeType("unsigned int *")
    public IntBuffer mValues() { return nmValues(address()); }
    /** the weights at the time of this key */
    @NativeType("double *")
    public DoubleBuffer mWeights() { return nmWeights(address()); }
    /** the number of values and weights */
    @NativeType("unsigned int")
    public int mNumValuesAndWeights() { return nmNumValuesAndWeights(address()); }

    /** Sets the specified value to the {@link #mTime} field. */
    public AIMeshMorphKey mTime(double value) { nmTime(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #mValues} field. */
    public AIMeshMorphKey mValues(@NativeType("unsigned int *") IntBuffer value) { nmValues(address(), value); return this; }
    /** Sets the address of the specified {@link DoubleBuffer} to the {@link #mWeights} field. */
    public AIMeshMorphKey mWeights(@NativeType("double *") DoubleBuffer value) { nmWeights(address(), value); return this; }
    /** Sets the specified value to the {@link #mNumValuesAndWeights} field. */
    public AIMeshMorphKey mNumValuesAndWeights(@NativeType("unsigned int") int value) { nmNumValuesAndWeights(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMeshMorphKey set(
        double mTime,
        IntBuffer mValues,
        DoubleBuffer mWeights,
        int mNumValuesAndWeights
    ) {
        mTime(mTime);
        mValues(mValues);
        mWeights(mWeights);
        mNumValuesAndWeights(mNumValuesAndWeights);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMeshMorphKey set(AIMeshMorphKey src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMeshMorphKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMeshMorphKey malloc() {
        return wrap(AIMeshMorphKey.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMeshMorphKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMeshMorphKey calloc() {
        return wrap(AIMeshMorphKey.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMeshMorphKey} instance allocated with {@link BufferUtils}. */
    public static AIMeshMorphKey create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMeshMorphKey.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMeshMorphKey} instance for the specified memory address. */
    public static AIMeshMorphKey create(long address) {
        return wrap(AIMeshMorphKey.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMeshMorphKey createSafe(long address) {
        return address == NULL ? null : wrap(AIMeshMorphKey.class, address);
    }

    /**
     * Returns a new {@link AIMeshMorphKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphKey.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMeshMorphKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphKey.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshMorphKey.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphKey.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMeshMorphKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphKey.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMeshMorphKey.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphKey.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMeshMorphKey} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshMorphKey malloc(MemoryStack stack) {
        return wrap(AIMeshMorphKey.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMeshMorphKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshMorphKey calloc(MemoryStack stack) {
        return wrap(AIMeshMorphKey.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMeshMorphKey.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphKey.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshMorphKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphKey.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTime}. */
    public static double nmTime(long struct) { return UNSAFE.getDouble(null, struct + AIMeshMorphKey.MTIME); }
    /** Unsafe version of {@link #mValues() mValues}. */
    public static IntBuffer nmValues(long struct) { return memIntBuffer(memGetAddress(struct + AIMeshMorphKey.MVALUES), nmNumValuesAndWeights(struct)); }
    /** Unsafe version of {@link #mWeights() mWeights}. */
    public static DoubleBuffer nmWeights(long struct) { return memDoubleBuffer(memGetAddress(struct + AIMeshMorphKey.MWEIGHTS), nmNumValuesAndWeights(struct)); }
    /** Unsafe version of {@link #mNumValuesAndWeights}. */
    public static int nmNumValuesAndWeights(long struct) { return UNSAFE.getInt(null, struct + AIMeshMorphKey.MNUMVALUESANDWEIGHTS); }

    /** Unsafe version of {@link #mTime(double) mTime}. */
    public static void nmTime(long struct, double value) { UNSAFE.putDouble(null, struct + AIMeshMorphKey.MTIME, value); }
    /** Unsafe version of {@link #mValues(IntBuffer) mValues}. */
    public static void nmValues(long struct, IntBuffer value) { memPutAddress(struct + AIMeshMorphKey.MVALUES, memAddress(value)); }
    /** Unsafe version of {@link #mWeights(DoubleBuffer) mWeights}. */
    public static void nmWeights(long struct, DoubleBuffer value) { memPutAddress(struct + AIMeshMorphKey.MWEIGHTS, memAddress(value)); }
    /** Sets the specified value to the {@code mNumValuesAndWeights} field of the specified {@code struct}. */
    public static void nmNumValuesAndWeights(long struct, int value) { UNSAFE.putInt(null, struct + AIMeshMorphKey.MNUMVALUESANDWEIGHTS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIMeshMorphKey.MVALUES));
        check(memGetAddress(struct + AIMeshMorphKey.MWEIGHTS));
    }

    // -----------------------------------

    /** An array of {@link AIMeshMorphKey} structs. */
    public static class Buffer extends StructBuffer<AIMeshMorphKey, Buffer> implements NativeResource {

        private static final AIMeshMorphKey ELEMENT_FACTORY = AIMeshMorphKey.create(-1L);

        /**
         * Creates a new {@code AIMeshMorphKey.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMeshMorphKey#SIZEOF}, and its mark will be undefined.
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
        protected AIMeshMorphKey getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIMeshMorphKey#mTime} field. */
        public double mTime() { return AIMeshMorphKey.nmTime(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link AIMeshMorphKey#mValues} field. */
        @NativeType("unsigned int *")
        public IntBuffer mValues() { return AIMeshMorphKey.nmValues(address()); }
        /** @return a {@link DoubleBuffer} view of the data pointed to by the {@link AIMeshMorphKey#mWeights} field. */
        @NativeType("double *")
        public DoubleBuffer mWeights() { return AIMeshMorphKey.nmWeights(address()); }
        /** @return the value of the {@link AIMeshMorphKey#mNumValuesAndWeights} field. */
        @NativeType("unsigned int")
        public int mNumValuesAndWeights() { return AIMeshMorphKey.nmNumValuesAndWeights(address()); }

        /** Sets the specified value to the {@link AIMeshMorphKey#mTime} field. */
        public AIMeshMorphKey.Buffer mTime(double value) { AIMeshMorphKey.nmTime(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link AIMeshMorphKey#mValues} field. */
        public AIMeshMorphKey.Buffer mValues(@NativeType("unsigned int *") IntBuffer value) { AIMeshMorphKey.nmValues(address(), value); return this; }
        /** Sets the address of the specified {@link DoubleBuffer} to the {@link AIMeshMorphKey#mWeights} field. */
        public AIMeshMorphKey.Buffer mWeights(@NativeType("double *") DoubleBuffer value) { AIMeshMorphKey.nmWeights(address(), value); return this; }
        /** Sets the specified value to the {@link AIMeshMorphKey#mNumValuesAndWeights} field. */
        public AIMeshMorphKey.Buffer mNumValuesAndWeights(@NativeType("unsigned int") int value) { AIMeshMorphKey.nmNumValuesAndWeights(address(), value); return this; }

    }

}