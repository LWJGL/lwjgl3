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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiAABB {
 *     {@link AIVector3D struct aiVector3D} mMin;
 *     {@link AIVector3D struct aiVector3D} mMax;
 * }</code></pre>
 */
@NativeType("struct aiAABB")
public class AIAABB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MMIN,
        MMAX;

    static {
        Layout layout = __struct(
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MMIN = layout.offsetof(0);
        MMAX = layout.offsetof(1);
    }

    /**
     * Creates a {@code AIAABB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIAABB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIVector3D} view of the {@code mMin} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mMin() { return nmMin(address()); }
    /** @return a {@link AIVector3D} view of the {@code mMax} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mMax() { return nmMax(address()); }

    /** Copies the specified {@link AIVector3D} to the {@code mMin} field. */
    public AIAABB mMin(@NativeType("struct aiVector3D") AIVector3D value) { nmMin(address(), value); return this; }
    /** Passes the {@code mMin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAABB mMin(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mMin()); return this; }
    /** Copies the specified {@link AIVector3D} to the {@code mMax} field. */
    public AIAABB mMax(@NativeType("struct aiVector3D") AIVector3D value) { nmMax(address(), value); return this; }
    /** Passes the {@code mMax} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIAABB mMax(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mMax()); return this; }

    /** Initializes this struct with the specified values. */
    public AIAABB set(
        AIVector3D mMin,
        AIVector3D mMax
    ) {
        mMin(mMin);
        mMax(mMax);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIAABB set(AIAABB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIAABB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIAABB malloc() {
        return wrap(AIAABB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIAABB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIAABB calloc() {
        return wrap(AIAABB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIAABB} instance allocated with {@link BufferUtils}. */
    public static AIAABB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIAABB.class, memAddress(container), container);
    }

    /** Returns a new {@code AIAABB} instance for the specified memory address. */
    public static AIAABB create(long address) {
        return wrap(AIAABB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAABB createSafe(long address) {
        return address == NULL ? null : wrap(AIAABB.class, address);
    }

    /**
     * Returns a new {@link AIAABB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAABB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIAABB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIAABB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAABB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIAABB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIAABB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIAABB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIAABB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIAABB mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIAABB callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIAABB mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIAABB callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAABB.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAABB.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAABB.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIAABB.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIAABB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAABB malloc(MemoryStack stack) {
        return wrap(AIAABB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIAABB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIAABB calloc(MemoryStack stack) {
        return wrap(AIAABB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIAABB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAABB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIAABB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIAABB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mMin}. */
    public static AIVector3D nmMin(long struct) { return AIVector3D.create(struct + AIAABB.MMIN); }
    /** Unsafe version of {@link #mMax}. */
    public static AIVector3D nmMax(long struct) { return AIVector3D.create(struct + AIAABB.MMAX); }

    /** Unsafe version of {@link #mMin(AIVector3D) mMin}. */
    public static void nmMin(long struct, AIVector3D value) { memCopy(value.address(), struct + AIAABB.MMIN, AIVector3D.SIZEOF); }
    /** Unsafe version of {@link #mMax(AIVector3D) mMax}. */
    public static void nmMax(long struct, AIVector3D value) { memCopy(value.address(), struct + AIAABB.MMAX, AIVector3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link AIAABB} structs. */
    public static class Buffer extends StructBuffer<AIAABB, Buffer> implements NativeResource {

        private static final AIAABB ELEMENT_FACTORY = AIAABB.create(-1L);

        /**
         * Creates a new {@code AIAABB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIAABB#SIZEOF}, and its mark will be undefined.
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
        protected AIAABB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIVector3D} view of the {@code mMin} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mMin() { return AIAABB.nmMin(address()); }
        /** @return a {@link AIVector3D} view of the {@code mMax} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mMax() { return AIAABB.nmMax(address()); }

        /** Copies the specified {@link AIVector3D} to the {@code mMin} field. */
        public AIAABB.Buffer mMin(@NativeType("struct aiVector3D") AIVector3D value) { AIAABB.nmMin(address(), value); return this; }
        /** Passes the {@code mMin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAABB.Buffer mMin(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mMin()); return this; }
        /** Copies the specified {@link AIVector3D} to the {@code mMax} field. */
        public AIAABB.Buffer mMax(@NativeType("struct aiVector3D") AIVector3D value) { AIAABB.nmMax(address(), value); return this; }
        /** Passes the {@code mMax} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIAABB.Buffer mMax(java.util.function.Consumer<AIVector3D> consumer) { consumer.accept(mMax()); return this; }

    }

}