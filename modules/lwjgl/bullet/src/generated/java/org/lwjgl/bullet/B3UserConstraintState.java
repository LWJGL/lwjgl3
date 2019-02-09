/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

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
 * struct b3UserConstraintState {
 *     double m_appliedConstraintForces[6];
 *     int m_numDofs;
 * }</code></pre>
 */
@NativeType("struct b3UserConstraintState")
public class B3UserConstraintState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_APPLIEDCONSTRAINTFORCES,
        M_NUMDOFS;

    static {
        Layout layout = __struct(
            __array(8, 6),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_APPLIEDCONSTRAINTFORCES = layout.offsetof(0);
        M_NUMDOFS = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3UserConstraintState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3UserConstraintState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link DoubleBuffer} view of the {@code m_appliedConstraintForces} field. */
    @NativeType("double[6]")
    public DoubleBuffer m_appliedConstraintForces() { return nm_appliedConstraintForces(address()); }
    /** Returns the value at the specified index of the {@code m_appliedConstraintForces} field. */
    public double m_appliedConstraintForces(int index) { return nm_appliedConstraintForces(address(), index); }
    /** Returns the value of the {@code m_numDofs} field. */
    public int m_numDofs() { return nm_numDofs(address()); }

    /** Copies the specified {@link DoubleBuffer} to the {@code m_appliedConstraintForces} field. */
    public B3UserConstraintState m_appliedConstraintForces(@NativeType("double[6]") DoubleBuffer value) { nm_appliedConstraintForces(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_appliedConstraintForces} field. */
    public B3UserConstraintState m_appliedConstraintForces(int index, double value) { nm_appliedConstraintForces(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_numDofs} field. */
    public B3UserConstraintState m_numDofs(int value) { nm_numDofs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3UserConstraintState set(
        DoubleBuffer m_appliedConstraintForces,
        int m_numDofs
    ) {
        m_appliedConstraintForces(m_appliedConstraintForces);
        m_numDofs(m_numDofs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3UserConstraintState set(B3UserConstraintState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3UserConstraintState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3UserConstraintState malloc() {
        return wrap(B3UserConstraintState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3UserConstraintState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3UserConstraintState calloc() {
        return wrap(B3UserConstraintState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3UserConstraintState} instance allocated with {@link BufferUtils}. */
    public static B3UserConstraintState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3UserConstraintState.class, memAddress(container), container);
    }

    /** Returns a new {@code B3UserConstraintState} instance for the specified memory address. */
    public static B3UserConstraintState create(long address) {
        return wrap(B3UserConstraintState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3UserConstraintState createSafe(long address) {
        return address == NULL ? null : wrap(B3UserConstraintState.class, address);
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3UserConstraintState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3UserConstraintState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3UserConstraintState} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3UserConstraintState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3UserConstraintState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3UserConstraintState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3UserConstraintState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3UserConstraintState mallocStack(MemoryStack stack) {
        return wrap(B3UserConstraintState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3UserConstraintState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3UserConstraintState callocStack(MemoryStack stack) {
        return wrap(B3UserConstraintState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3UserConstraintState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3UserConstraintState.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_appliedConstraintForces}. */
    public static DoubleBuffer nm_appliedConstraintForces(long struct) { return memDoubleBuffer(struct + B3UserConstraintState.M_APPLIEDCONSTRAINTFORCES, 6); }
    /** Unsafe version of {@link #m_appliedConstraintForces(int) m_appliedConstraintForces}. */
    public static double nm_appliedConstraintForces(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3UserConstraintState.M_APPLIEDCONSTRAINTFORCES + check(index, 6) * 8);
    }
    /** Unsafe version of {@link #m_numDofs}. */
    public static int nm_numDofs(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraintState.M_NUMDOFS); }

    /** Unsafe version of {@link #m_appliedConstraintForces(DoubleBuffer) m_appliedConstraintForces}. */
    public static void nm_appliedConstraintForces(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + B3UserConstraintState.M_APPLIEDCONSTRAINTFORCES, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_appliedConstraintForces(int, double) m_appliedConstraintForces}. */
    public static void nm_appliedConstraintForces(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3UserConstraintState.M_APPLIEDCONSTRAINTFORCES + check(index, 6) * 8, value);
    }
    /** Unsafe version of {@link #m_numDofs(int) m_numDofs}. */
    public static void nm_numDofs(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraintState.M_NUMDOFS, value); }

    // -----------------------------------

    /** An array of {@link B3UserConstraintState} structs. */
    public static class Buffer extends StructBuffer<B3UserConstraintState, Buffer> implements NativeResource {

        private static final B3UserConstraintState ELEMENT_FACTORY = B3UserConstraintState.create(-1L);

        /**
         * Creates a new {@code B3UserConstraintState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3UserConstraintState#SIZEOF}, and its mark will be undefined.
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
        protected B3UserConstraintState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link DoubleBuffer} view of the {@code m_appliedConstraintForces} field. */
        @NativeType("double[6]")
        public DoubleBuffer m_appliedConstraintForces() { return B3UserConstraintState.nm_appliedConstraintForces(address()); }
        /** Returns the value at the specified index of the {@code m_appliedConstraintForces} field. */
        public double m_appliedConstraintForces(int index) { return B3UserConstraintState.nm_appliedConstraintForces(address(), index); }
        /** Returns the value of the {@code m_numDofs} field. */
        public int m_numDofs() { return B3UserConstraintState.nm_numDofs(address()); }

        /** Copies the specified {@link DoubleBuffer} to the {@code m_appliedConstraintForces} field. */
        public B3UserConstraintState.Buffer m_appliedConstraintForces(@NativeType("double[6]") DoubleBuffer value) { B3UserConstraintState.nm_appliedConstraintForces(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_appliedConstraintForces} field. */
        public B3UserConstraintState.Buffer m_appliedConstraintForces(int index, double value) { B3UserConstraintState.nm_appliedConstraintForces(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_numDofs} field. */
        public B3UserConstraintState.Buffer m_numDofs(int value) { B3UserConstraintState.nm_numDofs(address(), value); return this; }

    }

}