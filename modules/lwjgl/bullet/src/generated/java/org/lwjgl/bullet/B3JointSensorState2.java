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
 * struct b3JointSensorState2 {
 *     double m_jointPosition[4];
 *     double m_jointVelocity[3];
 *     double m_jointReactionForceTorque[6];
 *     double m_jointMotorTorque;
 *     int m_qDofSize;
 *     int m_uDofSize;
 * }</code></pre>
 */
@NativeType("struct b3JointSensorState2")
public class B3JointSensorState2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_JOINTPOSITION,
        M_JOINTVELOCITY,
        M_JOINTREACTIONFORCETORQUE,
        M_JOINTMOTORTORQUE,
        M_QDOFSIZE,
        M_UDOFSIZE;

    static {
        Layout layout = __struct(
            __array(8, 4),
            __array(8, 3),
            __array(8, 6),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_JOINTPOSITION = layout.offsetof(0);
        M_JOINTVELOCITY = layout.offsetof(1);
        M_JOINTREACTIONFORCETORQUE = layout.offsetof(2);
        M_JOINTMOTORTORQUE = layout.offsetof(3);
        M_QDOFSIZE = layout.offsetof(4);
        M_UDOFSIZE = layout.offsetof(5);
    }

    /**
     * Creates a {@code B3JointSensorState2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3JointSensorState2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link DoubleBuffer} view of the {@code m_jointPosition} field. */
    @NativeType("double[4]")
    public DoubleBuffer m_jointPosition() { return nm_jointPosition(address()); }
    /** Returns the value at the specified index of the {@code m_jointPosition} field. */
    public double m_jointPosition(int index) { return nm_jointPosition(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_jointVelocity} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_jointVelocity() { return nm_jointVelocity(address()); }
    /** Returns the value at the specified index of the {@code m_jointVelocity} field. */
    public double m_jointVelocity(int index) { return nm_jointVelocity(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_jointReactionForceTorque} field. */
    @NativeType("double[6]")
    public DoubleBuffer m_jointReactionForceTorque() { return nm_jointReactionForceTorque(address()); }
    /** Returns the value at the specified index of the {@code m_jointReactionForceTorque} field. */
    public double m_jointReactionForceTorque(int index) { return nm_jointReactionForceTorque(address(), index); }
    /** Returns the value of the {@code m_jointMotorTorque} field. */
    public double m_jointMotorTorque() { return nm_jointMotorTorque(address()); }
    /** Returns the value of the {@code m_qDofSize} field. */
    public int m_qDofSize() { return nm_qDofSize(address()); }
    /** Returns the value of the {@code m_uDofSize} field. */
    public int m_uDofSize() { return nm_uDofSize(address()); }

    /** Copies the specified {@link DoubleBuffer} to the {@code m_jointPosition} field. */
    public B3JointSensorState2 m_jointPosition(@NativeType("double[4]") DoubleBuffer value) { nm_jointPosition(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_jointPosition} field. */
    public B3JointSensorState2 m_jointPosition(int index, double value) { nm_jointPosition(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_jointVelocity} field. */
    public B3JointSensorState2 m_jointVelocity(@NativeType("double[3]") DoubleBuffer value) { nm_jointVelocity(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_jointVelocity} field. */
    public B3JointSensorState2 m_jointVelocity(int index, double value) { nm_jointVelocity(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_jointReactionForceTorque} field. */
    public B3JointSensorState2 m_jointReactionForceTorque(@NativeType("double[6]") DoubleBuffer value) { nm_jointReactionForceTorque(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_jointReactionForceTorque} field. */
    public B3JointSensorState2 m_jointReactionForceTorque(int index, double value) { nm_jointReactionForceTorque(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_jointMotorTorque} field. */
    public B3JointSensorState2 m_jointMotorTorque(double value) { nm_jointMotorTorque(address(), value); return this; }
    /** Sets the specified value to the {@code m_qDofSize} field. */
    public B3JointSensorState2 m_qDofSize(int value) { nm_qDofSize(address(), value); return this; }
    /** Sets the specified value to the {@code m_uDofSize} field. */
    public B3JointSensorState2 m_uDofSize(int value) { nm_uDofSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3JointSensorState2 set(
        DoubleBuffer m_jointPosition,
        DoubleBuffer m_jointVelocity,
        DoubleBuffer m_jointReactionForceTorque,
        double m_jointMotorTorque,
        int m_qDofSize,
        int m_uDofSize
    ) {
        m_jointPosition(m_jointPosition);
        m_jointVelocity(m_jointVelocity);
        m_jointReactionForceTorque(m_jointReactionForceTorque);
        m_jointMotorTorque(m_jointMotorTorque);
        m_qDofSize(m_qDofSize);
        m_uDofSize(m_uDofSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3JointSensorState2 set(B3JointSensorState2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3JointSensorState2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3JointSensorState2 malloc() {
        return wrap(B3JointSensorState2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3JointSensorState2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3JointSensorState2 calloc() {
        return wrap(B3JointSensorState2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3JointSensorState2} instance allocated with {@link BufferUtils}. */
    public static B3JointSensorState2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3JointSensorState2.class, memAddress(container), container);
    }

    /** Returns a new {@code B3JointSensorState2} instance for the specified memory address. */
    public static B3JointSensorState2 create(long address) {
        return wrap(B3JointSensorState2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3JointSensorState2 createSafe(long address) {
        return address == NULL ? null : wrap(B3JointSensorState2.class, address);
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3JointSensorState2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3JointSensorState2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3JointSensorState2} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3JointSensorState2 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3JointSensorState2} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3JointSensorState2 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3JointSensorState2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3JointSensorState2 mallocStack(MemoryStack stack) {
        return wrap(B3JointSensorState2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3JointSensorState2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3JointSensorState2 callocStack(MemoryStack stack) {
        return wrap(B3JointSensorState2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3JointSensorState2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3JointSensorState2.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_jointPosition}. */
    public static DoubleBuffer nm_jointPosition(long struct) { return memDoubleBuffer(struct + B3JointSensorState2.M_JOINTPOSITION, 4); }
    /** Unsafe version of {@link #m_jointPosition(int) m_jointPosition}. */
    public static double nm_jointPosition(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointSensorState2.M_JOINTPOSITION + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #m_jointVelocity}. */
    public static DoubleBuffer nm_jointVelocity(long struct) { return memDoubleBuffer(struct + B3JointSensorState2.M_JOINTVELOCITY, 3); }
    /** Unsafe version of {@link #m_jointVelocity(int) m_jointVelocity}. */
    public static double nm_jointVelocity(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointSensorState2.M_JOINTVELOCITY + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_jointReactionForceTorque}. */
    public static DoubleBuffer nm_jointReactionForceTorque(long struct) { return memDoubleBuffer(struct + B3JointSensorState2.M_JOINTREACTIONFORCETORQUE, 6); }
    /** Unsafe version of {@link #m_jointReactionForceTorque(int) m_jointReactionForceTorque}. */
    public static double nm_jointReactionForceTorque(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointSensorState2.M_JOINTREACTIONFORCETORQUE + check(index, 6) * 8);
    }
    /** Unsafe version of {@link #m_jointMotorTorque}. */
    public static double nm_jointMotorTorque(long struct) { return UNSAFE.getDouble(null, struct + B3JointSensorState2.M_JOINTMOTORTORQUE); }
    /** Unsafe version of {@link #m_qDofSize}. */
    public static int nm_qDofSize(long struct) { return UNSAFE.getInt(null, struct + B3JointSensorState2.M_QDOFSIZE); }
    /** Unsafe version of {@link #m_uDofSize}. */
    public static int nm_uDofSize(long struct) { return UNSAFE.getInt(null, struct + B3JointSensorState2.M_UDOFSIZE); }

    /** Unsafe version of {@link #m_jointPosition(DoubleBuffer) m_jointPosition}. */
    public static void nm_jointPosition(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3JointSensorState2.M_JOINTPOSITION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_jointPosition(int, double) m_jointPosition}. */
    public static void nm_jointPosition(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointSensorState2.M_JOINTPOSITION + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #m_jointVelocity(DoubleBuffer) m_jointVelocity}. */
    public static void nm_jointVelocity(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3JointSensorState2.M_JOINTVELOCITY, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_jointVelocity(int, double) m_jointVelocity}. */
    public static void nm_jointVelocity(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointSensorState2.M_JOINTVELOCITY + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_jointReactionForceTorque(DoubleBuffer) m_jointReactionForceTorque}. */
    public static void nm_jointReactionForceTorque(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + B3JointSensorState2.M_JOINTREACTIONFORCETORQUE, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_jointReactionForceTorque(int, double) m_jointReactionForceTorque}. */
    public static void nm_jointReactionForceTorque(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointSensorState2.M_JOINTREACTIONFORCETORQUE + check(index, 6) * 8, value);
    }
    /** Unsafe version of {@link #m_jointMotorTorque(double) m_jointMotorTorque}. */
    public static void nm_jointMotorTorque(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointSensorState2.M_JOINTMOTORTORQUE, value); }
    /** Unsafe version of {@link #m_qDofSize(int) m_qDofSize}. */
    public static void nm_qDofSize(long struct, int value) { UNSAFE.putInt(null, struct + B3JointSensorState2.M_QDOFSIZE, value); }
    /** Unsafe version of {@link #m_uDofSize(int) m_uDofSize}. */
    public static void nm_uDofSize(long struct, int value) { UNSAFE.putInt(null, struct + B3JointSensorState2.M_UDOFSIZE, value); }

    // -----------------------------------

    /** An array of {@link B3JointSensorState2} structs. */
    public static class Buffer extends StructBuffer<B3JointSensorState2, Buffer> implements NativeResource {

        private static final B3JointSensorState2 ELEMENT_FACTORY = B3JointSensorState2.create(-1L);

        /**
         * Creates a new {@code B3JointSensorState2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3JointSensorState2#SIZEOF}, and its mark will be undefined.
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
        protected B3JointSensorState2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link DoubleBuffer} view of the {@code m_jointPosition} field. */
        @NativeType("double[4]")
        public DoubleBuffer m_jointPosition() { return B3JointSensorState2.nm_jointPosition(address()); }
        /** Returns the value at the specified index of the {@code m_jointPosition} field. */
        public double m_jointPosition(int index) { return B3JointSensorState2.nm_jointPosition(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_jointVelocity} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_jointVelocity() { return B3JointSensorState2.nm_jointVelocity(address()); }
        /** Returns the value at the specified index of the {@code m_jointVelocity} field. */
        public double m_jointVelocity(int index) { return B3JointSensorState2.nm_jointVelocity(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_jointReactionForceTorque} field. */
        @NativeType("double[6]")
        public DoubleBuffer m_jointReactionForceTorque() { return B3JointSensorState2.nm_jointReactionForceTorque(address()); }
        /** Returns the value at the specified index of the {@code m_jointReactionForceTorque} field. */
        public double m_jointReactionForceTorque(int index) { return B3JointSensorState2.nm_jointReactionForceTorque(address(), index); }
        /** Returns the value of the {@code m_jointMotorTorque} field. */
        public double m_jointMotorTorque() { return B3JointSensorState2.nm_jointMotorTorque(address()); }
        /** Returns the value of the {@code m_qDofSize} field. */
        public int m_qDofSize() { return B3JointSensorState2.nm_qDofSize(address()); }
        /** Returns the value of the {@code m_uDofSize} field. */
        public int m_uDofSize() { return B3JointSensorState2.nm_uDofSize(address()); }

        /** Copies the specified {@link DoubleBuffer} to the {@code m_jointPosition} field. */
        public B3JointSensorState2.Buffer m_jointPosition(@NativeType("double[4]") DoubleBuffer value) { B3JointSensorState2.nm_jointPosition(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_jointPosition} field. */
        public B3JointSensorState2.Buffer m_jointPosition(int index, double value) { B3JointSensorState2.nm_jointPosition(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_jointVelocity} field. */
        public B3JointSensorState2.Buffer m_jointVelocity(@NativeType("double[3]") DoubleBuffer value) { B3JointSensorState2.nm_jointVelocity(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_jointVelocity} field. */
        public B3JointSensorState2.Buffer m_jointVelocity(int index, double value) { B3JointSensorState2.nm_jointVelocity(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_jointReactionForceTorque} field. */
        public B3JointSensorState2.Buffer m_jointReactionForceTorque(@NativeType("double[6]") DoubleBuffer value) { B3JointSensorState2.nm_jointReactionForceTorque(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_jointReactionForceTorque} field. */
        public B3JointSensorState2.Buffer m_jointReactionForceTorque(int index, double value) { B3JointSensorState2.nm_jointReactionForceTorque(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_jointMotorTorque} field. */
        public B3JointSensorState2.Buffer m_jointMotorTorque(double value) { B3JointSensorState2.nm_jointMotorTorque(address(), value); return this; }
        /** Sets the specified value to the {@code m_qDofSize} field. */
        public B3JointSensorState2.Buffer m_qDofSize(int value) { B3JointSensorState2.nm_qDofSize(address(), value); return this; }
        /** Sets the specified value to the {@code m_uDofSize} field. */
        public B3JointSensorState2.Buffer m_uDofSize(int value) { B3JointSensorState2.nm_uDofSize(address(), value); return this; }

    }

}