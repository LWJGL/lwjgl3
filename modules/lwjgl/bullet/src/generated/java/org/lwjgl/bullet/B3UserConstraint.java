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
 * struct b3UserConstraint {
 *     int m_parentBodyIndex;
 *     int m_parentJointIndex;
 *     int m_childBodyIndex;
 *     int m_childJointIndex;
 *     double m_parentFrame[7];
 *     double m_childFrame[7];
 *     double m_jointAxis[3];
 *     int m_jointType;
 *     double m_maxAppliedForce;
 *     int m_userConstraintUniqueId;
 *     double m_gearRatio;
 *     int m_gearAuxLink;
 *     double m_relativePositionTarget;
 *     double m_erp;
 * }</code></pre>
 */
@NativeType("struct b3UserConstraint")
public class B3UserConstraint extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_PARENTBODYINDEX,
        M_PARENTJOINTINDEX,
        M_CHILDBODYINDEX,
        M_CHILDJOINTINDEX,
        M_PARENTFRAME,
        M_CHILDFRAME,
        M_JOINTAXIS,
        M_JOINTTYPE,
        M_MAXAPPLIEDFORCE,
        M_USERCONSTRAINTUNIQUEID,
        M_GEARRATIO,
        M_GEARAUXLINK,
        M_RELATIVEPOSITIONTARGET,
        M_ERP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(8, 7),
            __array(8, 7),
            __array(8, 3),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_PARENTBODYINDEX = layout.offsetof(0);
        M_PARENTJOINTINDEX = layout.offsetof(1);
        M_CHILDBODYINDEX = layout.offsetof(2);
        M_CHILDJOINTINDEX = layout.offsetof(3);
        M_PARENTFRAME = layout.offsetof(4);
        M_CHILDFRAME = layout.offsetof(5);
        M_JOINTAXIS = layout.offsetof(6);
        M_JOINTTYPE = layout.offsetof(7);
        M_MAXAPPLIEDFORCE = layout.offsetof(8);
        M_USERCONSTRAINTUNIQUEID = layout.offsetof(9);
        M_GEARRATIO = layout.offsetof(10);
        M_GEARAUXLINK = layout.offsetof(11);
        M_RELATIVEPOSITIONTARGET = layout.offsetof(12);
        M_ERP = layout.offsetof(13);
    }

    /**
     * Creates a {@code B3UserConstraint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3UserConstraint(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_parentBodyIndex} field. */
    public int m_parentBodyIndex() { return nm_parentBodyIndex(address()); }
    /** Returns the value of the {@code m_parentJointIndex} field. */
    public int m_parentJointIndex() { return nm_parentJointIndex(address()); }
    /** Returns the value of the {@code m_childBodyIndex} field. */
    public int m_childBodyIndex() { return nm_childBodyIndex(address()); }
    /** Returns the value of the {@code m_childJointIndex} field. */
    public int m_childJointIndex() { return nm_childJointIndex(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_parentFrame} field. */
    @NativeType("double[7]")
    public DoubleBuffer m_parentFrame() { return nm_parentFrame(address()); }
    /** Returns the value at the specified index of the {@code m_parentFrame} field. */
    public double m_parentFrame(int index) { return nm_parentFrame(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_childFrame} field. */
    @NativeType("double[7]")
    public DoubleBuffer m_childFrame() { return nm_childFrame(address()); }
    /** Returns the value at the specified index of the {@code m_childFrame} field. */
    public double m_childFrame(int index) { return nm_childFrame(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_jointAxis} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_jointAxis() { return nm_jointAxis(address()); }
    /** Returns the value at the specified index of the {@code m_jointAxis} field. */
    public double m_jointAxis(int index) { return nm_jointAxis(address(), index); }
    /** Returns the value of the {@code m_jointType} field. */
    public int m_jointType() { return nm_jointType(address()); }
    /** Returns the value of the {@code m_maxAppliedForce} field. */
    public double m_maxAppliedForce() { return nm_maxAppliedForce(address()); }
    /** Returns the value of the {@code m_userConstraintUniqueId} field. */
    public int m_userConstraintUniqueId() { return nm_userConstraintUniqueId(address()); }
    /** Returns the value of the {@code m_gearRatio} field. */
    public double m_gearRatio() { return nm_gearRatio(address()); }
    /** Returns the value of the {@code m_gearAuxLink} field. */
    public int m_gearAuxLink() { return nm_gearAuxLink(address()); }
    /** Returns the value of the {@code m_relativePositionTarget} field. */
    public double m_relativePositionTarget() { return nm_relativePositionTarget(address()); }
    /** Returns the value of the {@code m_erp} field. */
    public double m_erp() { return nm_erp(address()); }

    /** Sets the specified value to the {@code m_parentBodyIndex} field. */
    public B3UserConstraint m_parentBodyIndex(int value) { nm_parentBodyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_parentJointIndex} field. */
    public B3UserConstraint m_parentJointIndex(int value) { nm_parentJointIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_childBodyIndex} field. */
    public B3UserConstraint m_childBodyIndex(int value) { nm_childBodyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_childJointIndex} field. */
    public B3UserConstraint m_childJointIndex(int value) { nm_childJointIndex(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_parentFrame} field. */
    public B3UserConstraint m_parentFrame(@NativeType("double[7]") DoubleBuffer value) { nm_parentFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_parentFrame} field. */
    public B3UserConstraint m_parentFrame(int index, double value) { nm_parentFrame(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_childFrame} field. */
    public B3UserConstraint m_childFrame(@NativeType("double[7]") DoubleBuffer value) { nm_childFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_childFrame} field. */
    public B3UserConstraint m_childFrame(int index, double value) { nm_childFrame(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_jointAxis} field. */
    public B3UserConstraint m_jointAxis(@NativeType("double[3]") DoubleBuffer value) { nm_jointAxis(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_jointAxis} field. */
    public B3UserConstraint m_jointAxis(int index, double value) { nm_jointAxis(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_jointType} field. */
    public B3UserConstraint m_jointType(int value) { nm_jointType(address(), value); return this; }
    /** Sets the specified value to the {@code m_maxAppliedForce} field. */
    public B3UserConstraint m_maxAppliedForce(double value) { nm_maxAppliedForce(address(), value); return this; }
    /** Sets the specified value to the {@code m_userConstraintUniqueId} field. */
    public B3UserConstraint m_userConstraintUniqueId(int value) { nm_userConstraintUniqueId(address(), value); return this; }
    /** Sets the specified value to the {@code m_gearRatio} field. */
    public B3UserConstraint m_gearRatio(double value) { nm_gearRatio(address(), value); return this; }
    /** Sets the specified value to the {@code m_gearAuxLink} field. */
    public B3UserConstraint m_gearAuxLink(int value) { nm_gearAuxLink(address(), value); return this; }
    /** Sets the specified value to the {@code m_relativePositionTarget} field. */
    public B3UserConstraint m_relativePositionTarget(double value) { nm_relativePositionTarget(address(), value); return this; }
    /** Sets the specified value to the {@code m_erp} field. */
    public B3UserConstraint m_erp(double value) { nm_erp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3UserConstraint set(
        int m_parentBodyIndex,
        int m_parentJointIndex,
        int m_childBodyIndex,
        int m_childJointIndex,
        DoubleBuffer m_parentFrame,
        DoubleBuffer m_childFrame,
        DoubleBuffer m_jointAxis,
        int m_jointType,
        double m_maxAppliedForce,
        int m_userConstraintUniqueId,
        double m_gearRatio,
        int m_gearAuxLink,
        double m_relativePositionTarget,
        double m_erp
    ) {
        m_parentBodyIndex(m_parentBodyIndex);
        m_parentJointIndex(m_parentJointIndex);
        m_childBodyIndex(m_childBodyIndex);
        m_childJointIndex(m_childJointIndex);
        m_parentFrame(m_parentFrame);
        m_childFrame(m_childFrame);
        m_jointAxis(m_jointAxis);
        m_jointType(m_jointType);
        m_maxAppliedForce(m_maxAppliedForce);
        m_userConstraintUniqueId(m_userConstraintUniqueId);
        m_gearRatio(m_gearRatio);
        m_gearAuxLink(m_gearAuxLink);
        m_relativePositionTarget(m_relativePositionTarget);
        m_erp(m_erp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3UserConstraint set(B3UserConstraint src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3UserConstraint} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3UserConstraint malloc() {
        return wrap(B3UserConstraint.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3UserConstraint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3UserConstraint calloc() {
        return wrap(B3UserConstraint.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3UserConstraint} instance allocated with {@link BufferUtils}. */
    public static B3UserConstraint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3UserConstraint.class, memAddress(container), container);
    }

    /** Returns a new {@code B3UserConstraint} instance for the specified memory address. */
    public static B3UserConstraint create(long address) {
        return wrap(B3UserConstraint.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3UserConstraint createSafe(long address) {
        return address == NULL ? null : wrap(B3UserConstraint.class, address);
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3UserConstraint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3UserConstraint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3UserConstraint} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3UserConstraint mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3UserConstraint} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3UserConstraint callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3UserConstraint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3UserConstraint mallocStack(MemoryStack stack) {
        return wrap(B3UserConstraint.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3UserConstraint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3UserConstraint callocStack(MemoryStack stack) {
        return wrap(B3UserConstraint.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3UserConstraint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3UserConstraint.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_parentBodyIndex}. */
    public static int nm_parentBodyIndex(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_PARENTBODYINDEX); }
    /** Unsafe version of {@link #m_parentJointIndex}. */
    public static int nm_parentJointIndex(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_PARENTJOINTINDEX); }
    /** Unsafe version of {@link #m_childBodyIndex}. */
    public static int nm_childBodyIndex(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_CHILDBODYINDEX); }
    /** Unsafe version of {@link #m_childJointIndex}. */
    public static int nm_childJointIndex(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_CHILDJOINTINDEX); }
    /** Unsafe version of {@link #m_parentFrame}. */
    public static DoubleBuffer nm_parentFrame(long struct) { return memDoubleBuffer(struct + B3UserConstraint.M_PARENTFRAME, 7); }
    /** Unsafe version of {@link #m_parentFrame(int) m_parentFrame}. */
    public static double nm_parentFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3UserConstraint.M_PARENTFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_childFrame}. */
    public static DoubleBuffer nm_childFrame(long struct) { return memDoubleBuffer(struct + B3UserConstraint.M_CHILDFRAME, 7); }
    /** Unsafe version of {@link #m_childFrame(int) m_childFrame}. */
    public static double nm_childFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3UserConstraint.M_CHILDFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_jointAxis}. */
    public static DoubleBuffer nm_jointAxis(long struct) { return memDoubleBuffer(struct + B3UserConstraint.M_JOINTAXIS, 3); }
    /** Unsafe version of {@link #m_jointAxis(int) m_jointAxis}. */
    public static double nm_jointAxis(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3UserConstraint.M_JOINTAXIS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_jointType}. */
    public static int nm_jointType(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_JOINTTYPE); }
    /** Unsafe version of {@link #m_maxAppliedForce}. */
    public static double nm_maxAppliedForce(long struct) { return UNSAFE.getDouble(null, struct + B3UserConstraint.M_MAXAPPLIEDFORCE); }
    /** Unsafe version of {@link #m_userConstraintUniqueId}. */
    public static int nm_userConstraintUniqueId(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_USERCONSTRAINTUNIQUEID); }
    /** Unsafe version of {@link #m_gearRatio}. */
    public static double nm_gearRatio(long struct) { return UNSAFE.getDouble(null, struct + B3UserConstraint.M_GEARRATIO); }
    /** Unsafe version of {@link #m_gearAuxLink}. */
    public static int nm_gearAuxLink(long struct) { return UNSAFE.getInt(null, struct + B3UserConstraint.M_GEARAUXLINK); }
    /** Unsafe version of {@link #m_relativePositionTarget}. */
    public static double nm_relativePositionTarget(long struct) { return UNSAFE.getDouble(null, struct + B3UserConstraint.M_RELATIVEPOSITIONTARGET); }
    /** Unsafe version of {@link #m_erp}. */
    public static double nm_erp(long struct) { return UNSAFE.getDouble(null, struct + B3UserConstraint.M_ERP); }

    /** Unsafe version of {@link #m_parentBodyIndex(int) m_parentBodyIndex}. */
    public static void nm_parentBodyIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_PARENTBODYINDEX, value); }
    /** Unsafe version of {@link #m_parentJointIndex(int) m_parentJointIndex}. */
    public static void nm_parentJointIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_PARENTJOINTINDEX, value); }
    /** Unsafe version of {@link #m_childBodyIndex(int) m_childBodyIndex}. */
    public static void nm_childBodyIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_CHILDBODYINDEX, value); }
    /** Unsafe version of {@link #m_childJointIndex(int) m_childJointIndex}. */
    public static void nm_childJointIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_CHILDJOINTINDEX, value); }
    /** Unsafe version of {@link #m_parentFrame(DoubleBuffer) m_parentFrame}. */
    public static void nm_parentFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3UserConstraint.M_PARENTFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_parentFrame(int, double) m_parentFrame}. */
    public static void nm_parentFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3UserConstraint.M_PARENTFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_childFrame(DoubleBuffer) m_childFrame}. */
    public static void nm_childFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3UserConstraint.M_CHILDFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_childFrame(int, double) m_childFrame}. */
    public static void nm_childFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3UserConstraint.M_CHILDFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_jointAxis(DoubleBuffer) m_jointAxis}. */
    public static void nm_jointAxis(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3UserConstraint.M_JOINTAXIS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_jointAxis(int, double) m_jointAxis}. */
    public static void nm_jointAxis(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3UserConstraint.M_JOINTAXIS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_jointType(int) m_jointType}. */
    public static void nm_jointType(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_JOINTTYPE, value); }
    /** Unsafe version of {@link #m_maxAppliedForce(double) m_maxAppliedForce}. */
    public static void nm_maxAppliedForce(long struct, double value) { UNSAFE.putDouble(null, struct + B3UserConstraint.M_MAXAPPLIEDFORCE, value); }
    /** Unsafe version of {@link #m_userConstraintUniqueId(int) m_userConstraintUniqueId}. */
    public static void nm_userConstraintUniqueId(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_USERCONSTRAINTUNIQUEID, value); }
    /** Unsafe version of {@link #m_gearRatio(double) m_gearRatio}. */
    public static void nm_gearRatio(long struct, double value) { UNSAFE.putDouble(null, struct + B3UserConstraint.M_GEARRATIO, value); }
    /** Unsafe version of {@link #m_gearAuxLink(int) m_gearAuxLink}. */
    public static void nm_gearAuxLink(long struct, int value) { UNSAFE.putInt(null, struct + B3UserConstraint.M_GEARAUXLINK, value); }
    /** Unsafe version of {@link #m_relativePositionTarget(double) m_relativePositionTarget}. */
    public static void nm_relativePositionTarget(long struct, double value) { UNSAFE.putDouble(null, struct + B3UserConstraint.M_RELATIVEPOSITIONTARGET, value); }
    /** Unsafe version of {@link #m_erp(double) m_erp}. */
    public static void nm_erp(long struct, double value) { UNSAFE.putDouble(null, struct + B3UserConstraint.M_ERP, value); }

    // -----------------------------------

    /** An array of {@link B3UserConstraint} structs. */
    public static class Buffer extends StructBuffer<B3UserConstraint, Buffer> implements NativeResource {

        private static final B3UserConstraint ELEMENT_FACTORY = B3UserConstraint.create(-1L);

        /**
         * Creates a new {@code B3UserConstraint.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3UserConstraint#SIZEOF}, and its mark will be undefined.
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
        protected B3UserConstraint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_parentBodyIndex} field. */
        public int m_parentBodyIndex() { return B3UserConstraint.nm_parentBodyIndex(address()); }
        /** Returns the value of the {@code m_parentJointIndex} field. */
        public int m_parentJointIndex() { return B3UserConstraint.nm_parentJointIndex(address()); }
        /** Returns the value of the {@code m_childBodyIndex} field. */
        public int m_childBodyIndex() { return B3UserConstraint.nm_childBodyIndex(address()); }
        /** Returns the value of the {@code m_childJointIndex} field. */
        public int m_childJointIndex() { return B3UserConstraint.nm_childJointIndex(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_parentFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_parentFrame() { return B3UserConstraint.nm_parentFrame(address()); }
        /** Returns the value at the specified index of the {@code m_parentFrame} field. */
        public double m_parentFrame(int index) { return B3UserConstraint.nm_parentFrame(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_childFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_childFrame() { return B3UserConstraint.nm_childFrame(address()); }
        /** Returns the value at the specified index of the {@code m_childFrame} field. */
        public double m_childFrame(int index) { return B3UserConstraint.nm_childFrame(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_jointAxis} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_jointAxis() { return B3UserConstraint.nm_jointAxis(address()); }
        /** Returns the value at the specified index of the {@code m_jointAxis} field. */
        public double m_jointAxis(int index) { return B3UserConstraint.nm_jointAxis(address(), index); }
        /** Returns the value of the {@code m_jointType} field. */
        public int m_jointType() { return B3UserConstraint.nm_jointType(address()); }
        /** Returns the value of the {@code m_maxAppliedForce} field. */
        public double m_maxAppliedForce() { return B3UserConstraint.nm_maxAppliedForce(address()); }
        /** Returns the value of the {@code m_userConstraintUniqueId} field. */
        public int m_userConstraintUniqueId() { return B3UserConstraint.nm_userConstraintUniqueId(address()); }
        /** Returns the value of the {@code m_gearRatio} field. */
        public double m_gearRatio() { return B3UserConstraint.nm_gearRatio(address()); }
        /** Returns the value of the {@code m_gearAuxLink} field. */
        public int m_gearAuxLink() { return B3UserConstraint.nm_gearAuxLink(address()); }
        /** Returns the value of the {@code m_relativePositionTarget} field. */
        public double m_relativePositionTarget() { return B3UserConstraint.nm_relativePositionTarget(address()); }
        /** Returns the value of the {@code m_erp} field. */
        public double m_erp() { return B3UserConstraint.nm_erp(address()); }

        /** Sets the specified value to the {@code m_parentBodyIndex} field. */
        public B3UserConstraint.Buffer m_parentBodyIndex(int value) { B3UserConstraint.nm_parentBodyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_parentJointIndex} field. */
        public B3UserConstraint.Buffer m_parentJointIndex(int value) { B3UserConstraint.nm_parentJointIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_childBodyIndex} field. */
        public B3UserConstraint.Buffer m_childBodyIndex(int value) { B3UserConstraint.nm_childBodyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_childJointIndex} field. */
        public B3UserConstraint.Buffer m_childJointIndex(int value) { B3UserConstraint.nm_childJointIndex(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_parentFrame} field. */
        public B3UserConstraint.Buffer m_parentFrame(@NativeType("double[7]") DoubleBuffer value) { B3UserConstraint.nm_parentFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_parentFrame} field. */
        public B3UserConstraint.Buffer m_parentFrame(int index, double value) { B3UserConstraint.nm_parentFrame(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_childFrame} field. */
        public B3UserConstraint.Buffer m_childFrame(@NativeType("double[7]") DoubleBuffer value) { B3UserConstraint.nm_childFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_childFrame} field. */
        public B3UserConstraint.Buffer m_childFrame(int index, double value) { B3UserConstraint.nm_childFrame(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_jointAxis} field. */
        public B3UserConstraint.Buffer m_jointAxis(@NativeType("double[3]") DoubleBuffer value) { B3UserConstraint.nm_jointAxis(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_jointAxis} field. */
        public B3UserConstraint.Buffer m_jointAxis(int index, double value) { B3UserConstraint.nm_jointAxis(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_jointType} field. */
        public B3UserConstraint.Buffer m_jointType(int value) { B3UserConstraint.nm_jointType(address(), value); return this; }
        /** Sets the specified value to the {@code m_maxAppliedForce} field. */
        public B3UserConstraint.Buffer m_maxAppliedForce(double value) { B3UserConstraint.nm_maxAppliedForce(address(), value); return this; }
        /** Sets the specified value to the {@code m_userConstraintUniqueId} field. */
        public B3UserConstraint.Buffer m_userConstraintUniqueId(int value) { B3UserConstraint.nm_userConstraintUniqueId(address(), value); return this; }
        /** Sets the specified value to the {@code m_gearRatio} field. */
        public B3UserConstraint.Buffer m_gearRatio(double value) { B3UserConstraint.nm_gearRatio(address(), value); return this; }
        /** Sets the specified value to the {@code m_gearAuxLink} field. */
        public B3UserConstraint.Buffer m_gearAuxLink(int value) { B3UserConstraint.nm_gearAuxLink(address(), value); return this; }
        /** Sets the specified value to the {@code m_relativePositionTarget} field. */
        public B3UserConstraint.Buffer m_relativePositionTarget(double value) { B3UserConstraint.nm_relativePositionTarget(address(), value); return this; }
        /** Sets the specified value to the {@code m_erp} field. */
        public B3UserConstraint.Buffer m_erp(double value) { B3UserConstraint.nm_erp(address(), value); return this; }

    }

}