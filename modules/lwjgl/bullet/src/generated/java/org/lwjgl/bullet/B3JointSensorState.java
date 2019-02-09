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
 * struct b3JointSensorState {
 *     double m_jointPosition;
 *     double m_jointVelocity;
 *     double m_jointForceTorque[6];
 *     double m_jointMotorTorque;
 * }</code></pre>
 */
@NativeType("struct b3JointSensorState")
public class B3JointSensorState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_JOINTPOSITION,
        M_JOINTVELOCITY,
        M_JOINTFORCETORQUE,
        M_JOINTMOTORTORQUE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __array(8, 6),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_JOINTPOSITION = layout.offsetof(0);
        M_JOINTVELOCITY = layout.offsetof(1);
        M_JOINTFORCETORQUE = layout.offsetof(2);
        M_JOINTMOTORTORQUE = layout.offsetof(3);
    }

    /**
     * Creates a {@code B3JointSensorState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3JointSensorState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_jointPosition} field. */
    public double m_jointPosition() { return nm_jointPosition(address()); }
    /** Returns the value of the {@code m_jointVelocity} field. */
    public double m_jointVelocity() { return nm_jointVelocity(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_jointForceTorque} field. */
    @NativeType("double[6]")
    public DoubleBuffer m_jointForceTorque() { return nm_jointForceTorque(address()); }
    /** Returns the value at the specified index of the {@code m_jointForceTorque} field. */
    public double m_jointForceTorque(int index) { return nm_jointForceTorque(address(), index); }
    /** Returns the value of the {@code m_jointMotorTorque} field. */
    public double m_jointMotorTorque() { return nm_jointMotorTorque(address()); }

    /** Sets the specified value to the {@code m_jointPosition} field. */
    public B3JointSensorState m_jointPosition(double value) { nm_jointPosition(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointVelocity} field. */
    public B3JointSensorState m_jointVelocity(double value) { nm_jointVelocity(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_jointForceTorque} field. */
    public B3JointSensorState m_jointForceTorque(@NativeType("double[6]") DoubleBuffer value) { nm_jointForceTorque(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_jointForceTorque} field. */
    public B3JointSensorState m_jointForceTorque(int index, double value) { nm_jointForceTorque(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_jointMotorTorque} field. */
    public B3JointSensorState m_jointMotorTorque(double value) { nm_jointMotorTorque(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3JointSensorState set(
        double m_jointPosition,
        double m_jointVelocity,
        DoubleBuffer m_jointForceTorque,
        double m_jointMotorTorque
    ) {
        m_jointPosition(m_jointPosition);
        m_jointVelocity(m_jointVelocity);
        m_jointForceTorque(m_jointForceTorque);
        m_jointMotorTorque(m_jointMotorTorque);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3JointSensorState set(B3JointSensorState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3JointSensorState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3JointSensorState malloc() {
        return wrap(B3JointSensorState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3JointSensorState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3JointSensorState calloc() {
        return wrap(B3JointSensorState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3JointSensorState} instance allocated with {@link BufferUtils}. */
    public static B3JointSensorState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3JointSensorState.class, memAddress(container), container);
    }

    /** Returns a new {@code B3JointSensorState} instance for the specified memory address. */
    public static B3JointSensorState create(long address) {
        return wrap(B3JointSensorState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3JointSensorState createSafe(long address) {
        return address == NULL ? null : wrap(B3JointSensorState.class, address);
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3JointSensorState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3JointSensorState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3JointSensorState} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3JointSensorState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3JointSensorState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3JointSensorState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3JointSensorState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3JointSensorState mallocStack(MemoryStack stack) {
        return wrap(B3JointSensorState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3JointSensorState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3JointSensorState callocStack(MemoryStack stack) {
        return wrap(B3JointSensorState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3JointSensorState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_jointPosition}. */
    public static double nm_jointPosition(long struct) { return UNSAFE.getDouble(null, struct + B3JointSensorState.M_JOINTPOSITION); }
    /** Unsafe version of {@link #m_jointVelocity}. */
    public static double nm_jointVelocity(long struct) { return UNSAFE.getDouble(null, struct + B3JointSensorState.M_JOINTVELOCITY); }
    /** Unsafe version of {@link #m_jointForceTorque}. */
    public static DoubleBuffer nm_jointForceTorque(long struct) { return memDoubleBuffer(struct + B3JointSensorState.M_JOINTFORCETORQUE, 6); }
    /** Unsafe version of {@link #m_jointForceTorque(int) m_jointForceTorque}. */
    public static double nm_jointForceTorque(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointSensorState.M_JOINTFORCETORQUE + check(index, 6) * 8);
    }
    /** Unsafe version of {@link #m_jointMotorTorque}. */
    public static double nm_jointMotorTorque(long struct) { return UNSAFE.getDouble(null, struct + B3JointSensorState.M_JOINTMOTORTORQUE); }

    /** Unsafe version of {@link #m_jointPosition(double) m_jointPosition}. */
    public static void nm_jointPosition(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointSensorState.M_JOINTPOSITION, value); }
    /** Unsafe version of {@link #m_jointVelocity(double) m_jointVelocity}. */
    public static void nm_jointVelocity(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointSensorState.M_JOINTVELOCITY, value); }
    /** Unsafe version of {@link #m_jointForceTorque(DoubleBuffer) m_jointForceTorque}. */
    public static void nm_jointForceTorque(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + B3JointSensorState.M_JOINTFORCETORQUE, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_jointForceTorque(int, double) m_jointForceTorque}. */
    public static void nm_jointForceTorque(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointSensorState.M_JOINTFORCETORQUE + check(index, 6) * 8, value);
    }
    /** Unsafe version of {@link #m_jointMotorTorque(double) m_jointMotorTorque}. */
    public static void nm_jointMotorTorque(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointSensorState.M_JOINTMOTORTORQUE, value); }

    // -----------------------------------

    /** An array of {@link B3JointSensorState} structs. */
    public static class Buffer extends StructBuffer<B3JointSensorState, Buffer> implements NativeResource {

        private static final B3JointSensorState ELEMENT_FACTORY = B3JointSensorState.create(-1L);

        /**
         * Creates a new {@code B3JointSensorState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3JointSensorState#SIZEOF}, and its mark will be undefined.
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
        protected B3JointSensorState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_jointPosition} field. */
        public double m_jointPosition() { return B3JointSensorState.nm_jointPosition(address()); }
        /** Returns the value of the {@code m_jointVelocity} field. */
        public double m_jointVelocity() { return B3JointSensorState.nm_jointVelocity(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_jointForceTorque} field. */
        @NativeType("double[6]")
        public DoubleBuffer m_jointForceTorque() { return B3JointSensorState.nm_jointForceTorque(address()); }
        /** Returns the value at the specified index of the {@code m_jointForceTorque} field. */
        public double m_jointForceTorque(int index) { return B3JointSensorState.nm_jointForceTorque(address(), index); }
        /** Returns the value of the {@code m_jointMotorTorque} field. */
        public double m_jointMotorTorque() { return B3JointSensorState.nm_jointMotorTorque(address()); }

        /** Sets the specified value to the {@code m_jointPosition} field. */
        public B3JointSensorState.Buffer m_jointPosition(double value) { B3JointSensorState.nm_jointPosition(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointVelocity} field. */
        public B3JointSensorState.Buffer m_jointVelocity(double value) { B3JointSensorState.nm_jointVelocity(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_jointForceTorque} field. */
        public B3JointSensorState.Buffer m_jointForceTorque(@NativeType("double[6]") DoubleBuffer value) { B3JointSensorState.nm_jointForceTorque(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_jointForceTorque} field. */
        public B3JointSensorState.Buffer m_jointForceTorque(int index, double value) { B3JointSensorState.nm_jointForceTorque(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_jointMotorTorque} field. */
        public B3JointSensorState.Buffer m_jointMotorTorque(double value) { B3JointSensorState.nm_jointMotorTorque(address(), value); return this; }

    }

}