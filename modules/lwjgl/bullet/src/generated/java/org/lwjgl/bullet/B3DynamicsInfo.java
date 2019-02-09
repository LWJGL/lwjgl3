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
 * struct b3DynamicsInfo {
 *     double m_mass;
 *     double m_localInertialDiagonal[3];
 *     double m_localInertialFrame[7];
 *     double m_lateralFrictionCoeff;
 *     double m_rollingFrictionCoeff;
 *     double m_spinningFrictionCoeff;
 *     double m_restitution;
 *     double m_contactStiffness;
 *     double m_contactDamping;
 *     int m_activationState;
 *     double m_angularDamping;
 *     double m_linearDamping;
 *     double m_ccdSweptSphereRadius;
 *     double m_contactProcessingThreshold;
 *     int m_frictionAnchor;
 * }</code></pre>
 */
@NativeType("struct b3DynamicsInfo")
public class B3DynamicsInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_MASS,
        M_LOCALINERTIALDIAGONAL,
        M_LOCALINERTIALFRAME,
        M_LATERALFRICTIONCOEFF,
        M_ROLLINGFRICTIONCOEFF,
        M_SPINNINGFRICTIONCOEFF,
        M_RESTITUTION,
        M_CONTACTSTIFFNESS,
        M_CONTACTDAMPING,
        M_ACTIVATIONSTATE,
        M_ANGULARDAMPING,
        M_LINEARDAMPING,
        M_CCDSWEPTSPHERERADIUS,
        M_CONTACTPROCESSINGTHRESHOLD,
        M_FRICTIONANCHOR;

    static {
        Layout layout = __struct(
            __member(8),
            __array(8, 3),
            __array(8, 7),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_MASS = layout.offsetof(0);
        M_LOCALINERTIALDIAGONAL = layout.offsetof(1);
        M_LOCALINERTIALFRAME = layout.offsetof(2);
        M_LATERALFRICTIONCOEFF = layout.offsetof(3);
        M_ROLLINGFRICTIONCOEFF = layout.offsetof(4);
        M_SPINNINGFRICTIONCOEFF = layout.offsetof(5);
        M_RESTITUTION = layout.offsetof(6);
        M_CONTACTSTIFFNESS = layout.offsetof(7);
        M_CONTACTDAMPING = layout.offsetof(8);
        M_ACTIVATIONSTATE = layout.offsetof(9);
        M_ANGULARDAMPING = layout.offsetof(10);
        M_LINEARDAMPING = layout.offsetof(11);
        M_CCDSWEPTSPHERERADIUS = layout.offsetof(12);
        M_CONTACTPROCESSINGTHRESHOLD = layout.offsetof(13);
        M_FRICTIONANCHOR = layout.offsetof(14);
    }

    /**
     * Creates a {@code B3DynamicsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3DynamicsInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_mass} field. */
    public double m_mass() { return nm_mass(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialDiagonal} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_localInertialDiagonal() { return nm_localInertialDiagonal(address()); }
    /** Returns the value at the specified index of the {@code m_localInertialDiagonal} field. */
    public double m_localInertialDiagonal(int index) { return nm_localInertialDiagonal(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialFrame} field. */
    @NativeType("double[7]")
    public DoubleBuffer m_localInertialFrame() { return nm_localInertialFrame(address()); }
    /** Returns the value at the specified index of the {@code m_localInertialFrame} field. */
    public double m_localInertialFrame(int index) { return nm_localInertialFrame(address(), index); }
    /** Returns the value of the {@code m_lateralFrictionCoeff} field. */
    public double m_lateralFrictionCoeff() { return nm_lateralFrictionCoeff(address()); }
    /** Returns the value of the {@code m_rollingFrictionCoeff} field. */
    public double m_rollingFrictionCoeff() { return nm_rollingFrictionCoeff(address()); }
    /** Returns the value of the {@code m_spinningFrictionCoeff} field. */
    public double m_spinningFrictionCoeff() { return nm_spinningFrictionCoeff(address()); }
    /** Returns the value of the {@code m_restitution} field. */
    public double m_restitution() { return nm_restitution(address()); }
    /** Returns the value of the {@code m_contactStiffness} field. */
    public double m_contactStiffness() { return nm_contactStiffness(address()); }
    /** Returns the value of the {@code m_contactDamping} field. */
    public double m_contactDamping() { return nm_contactDamping(address()); }
    /** Returns the value of the {@code m_activationState} field. */
    public int m_activationState() { return nm_activationState(address()); }
    /** Returns the value of the {@code m_angularDamping} field. */
    public double m_angularDamping() { return nm_angularDamping(address()); }
    /** Returns the value of the {@code m_linearDamping} field. */
    public double m_linearDamping() { return nm_linearDamping(address()); }
    /** Returns the value of the {@code m_ccdSweptSphereRadius} field. */
    public double m_ccdSweptSphereRadius() { return nm_ccdSweptSphereRadius(address()); }
    /** Returns the value of the {@code m_contactProcessingThreshold} field. */
    public double m_contactProcessingThreshold() { return nm_contactProcessingThreshold(address()); }
    /** Returns the value of the {@code m_frictionAnchor} field. */
    public int m_frictionAnchor() { return nm_frictionAnchor(address()); }

    /** Sets the specified value to the {@code m_mass} field. */
    public B3DynamicsInfo m_mass(double value) { nm_mass(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialDiagonal} field. */
    public B3DynamicsInfo m_localInertialDiagonal(@NativeType("double[3]") DoubleBuffer value) { nm_localInertialDiagonal(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_localInertialDiagonal} field. */
    public B3DynamicsInfo m_localInertialDiagonal(int index, double value) { nm_localInertialDiagonal(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialFrame} field. */
    public B3DynamicsInfo m_localInertialFrame(@NativeType("double[7]") DoubleBuffer value) { nm_localInertialFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_localInertialFrame} field. */
    public B3DynamicsInfo m_localInertialFrame(int index, double value) { nm_localInertialFrame(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_lateralFrictionCoeff} field. */
    public B3DynamicsInfo m_lateralFrictionCoeff(double value) { nm_lateralFrictionCoeff(address(), value); return this; }
    /** Sets the specified value to the {@code m_rollingFrictionCoeff} field. */
    public B3DynamicsInfo m_rollingFrictionCoeff(double value) { nm_rollingFrictionCoeff(address(), value); return this; }
    /** Sets the specified value to the {@code m_spinningFrictionCoeff} field. */
    public B3DynamicsInfo m_spinningFrictionCoeff(double value) { nm_spinningFrictionCoeff(address(), value); return this; }
    /** Sets the specified value to the {@code m_restitution} field. */
    public B3DynamicsInfo m_restitution(double value) { nm_restitution(address(), value); return this; }
    /** Sets the specified value to the {@code m_contactStiffness} field. */
    public B3DynamicsInfo m_contactStiffness(double value) { nm_contactStiffness(address(), value); return this; }
    /** Sets the specified value to the {@code m_contactDamping} field. */
    public B3DynamicsInfo m_contactDamping(double value) { nm_contactDamping(address(), value); return this; }
    /** Sets the specified value to the {@code m_activationState} field. */
    public B3DynamicsInfo m_activationState(int value) { nm_activationState(address(), value); return this; }
    /** Sets the specified value to the {@code m_angularDamping} field. */
    public B3DynamicsInfo m_angularDamping(double value) { nm_angularDamping(address(), value); return this; }
    /** Sets the specified value to the {@code m_linearDamping} field. */
    public B3DynamicsInfo m_linearDamping(double value) { nm_linearDamping(address(), value); return this; }
    /** Sets the specified value to the {@code m_ccdSweptSphereRadius} field. */
    public B3DynamicsInfo m_ccdSweptSphereRadius(double value) { nm_ccdSweptSphereRadius(address(), value); return this; }
    /** Sets the specified value to the {@code m_contactProcessingThreshold} field. */
    public B3DynamicsInfo m_contactProcessingThreshold(double value) { nm_contactProcessingThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code m_frictionAnchor} field. */
    public B3DynamicsInfo m_frictionAnchor(int value) { nm_frictionAnchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3DynamicsInfo set(
        double m_mass,
        DoubleBuffer m_localInertialDiagonal,
        DoubleBuffer m_localInertialFrame,
        double m_lateralFrictionCoeff,
        double m_rollingFrictionCoeff,
        double m_spinningFrictionCoeff,
        double m_restitution,
        double m_contactStiffness,
        double m_contactDamping,
        int m_activationState,
        double m_angularDamping,
        double m_linearDamping,
        double m_ccdSweptSphereRadius,
        double m_contactProcessingThreshold,
        int m_frictionAnchor
    ) {
        m_mass(m_mass);
        m_localInertialDiagonal(m_localInertialDiagonal);
        m_localInertialFrame(m_localInertialFrame);
        m_lateralFrictionCoeff(m_lateralFrictionCoeff);
        m_rollingFrictionCoeff(m_rollingFrictionCoeff);
        m_spinningFrictionCoeff(m_spinningFrictionCoeff);
        m_restitution(m_restitution);
        m_contactStiffness(m_contactStiffness);
        m_contactDamping(m_contactDamping);
        m_activationState(m_activationState);
        m_angularDamping(m_angularDamping);
        m_linearDamping(m_linearDamping);
        m_ccdSweptSphereRadius(m_ccdSweptSphereRadius);
        m_contactProcessingThreshold(m_contactProcessingThreshold);
        m_frictionAnchor(m_frictionAnchor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3DynamicsInfo set(B3DynamicsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3DynamicsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3DynamicsInfo malloc() {
        return wrap(B3DynamicsInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3DynamicsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3DynamicsInfo calloc() {
        return wrap(B3DynamicsInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3DynamicsInfo} instance allocated with {@link BufferUtils}. */
    public static B3DynamicsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3DynamicsInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code B3DynamicsInfo} instance for the specified memory address. */
    public static B3DynamicsInfo create(long address) {
        return wrap(B3DynamicsInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3DynamicsInfo createSafe(long address) {
        return address == NULL ? null : wrap(B3DynamicsInfo.class, address);
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3DynamicsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3DynamicsInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3DynamicsInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3DynamicsInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3DynamicsInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3DynamicsInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3DynamicsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3DynamicsInfo mallocStack(MemoryStack stack) {
        return wrap(B3DynamicsInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3DynamicsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3DynamicsInfo callocStack(MemoryStack stack) {
        return wrap(B3DynamicsInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3DynamicsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3DynamicsInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_mass}. */
    public static double nm_mass(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_MASS); }
    /** Unsafe version of {@link #m_localInertialDiagonal}. */
    public static DoubleBuffer nm_localInertialDiagonal(long struct) { return memDoubleBuffer(struct + B3DynamicsInfo.M_LOCALINERTIALDIAGONAL, 3); }
    /** Unsafe version of {@link #m_localInertialDiagonal(int) m_localInertialDiagonal}. */
    public static double nm_localInertialDiagonal(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_LOCALINERTIALDIAGONAL + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_localInertialFrame}. */
    public static DoubleBuffer nm_localInertialFrame(long struct) { return memDoubleBuffer(struct + B3DynamicsInfo.M_LOCALINERTIALFRAME, 7); }
    /** Unsafe version of {@link #m_localInertialFrame(int) m_localInertialFrame}. */
    public static double nm_localInertialFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_LOCALINERTIALFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_lateralFrictionCoeff}. */
    public static double nm_lateralFrictionCoeff(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_LATERALFRICTIONCOEFF); }
    /** Unsafe version of {@link #m_rollingFrictionCoeff}. */
    public static double nm_rollingFrictionCoeff(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_ROLLINGFRICTIONCOEFF); }
    /** Unsafe version of {@link #m_spinningFrictionCoeff}. */
    public static double nm_spinningFrictionCoeff(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_SPINNINGFRICTIONCOEFF); }
    /** Unsafe version of {@link #m_restitution}. */
    public static double nm_restitution(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_RESTITUTION); }
    /** Unsafe version of {@link #m_contactStiffness}. */
    public static double nm_contactStiffness(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_CONTACTSTIFFNESS); }
    /** Unsafe version of {@link #m_contactDamping}. */
    public static double nm_contactDamping(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_CONTACTDAMPING); }
    /** Unsafe version of {@link #m_activationState}. */
    public static int nm_activationState(long struct) { return UNSAFE.getInt(null, struct + B3DynamicsInfo.M_ACTIVATIONSTATE); }
    /** Unsafe version of {@link #m_angularDamping}. */
    public static double nm_angularDamping(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_ANGULARDAMPING); }
    /** Unsafe version of {@link #m_linearDamping}. */
    public static double nm_linearDamping(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_LINEARDAMPING); }
    /** Unsafe version of {@link #m_ccdSweptSphereRadius}. */
    public static double nm_ccdSweptSphereRadius(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_CCDSWEPTSPHERERADIUS); }
    /** Unsafe version of {@link #m_contactProcessingThreshold}. */
    public static double nm_contactProcessingThreshold(long struct) { return UNSAFE.getDouble(null, struct + B3DynamicsInfo.M_CONTACTPROCESSINGTHRESHOLD); }
    /** Unsafe version of {@link #m_frictionAnchor}. */
    public static int nm_frictionAnchor(long struct) { return UNSAFE.getInt(null, struct + B3DynamicsInfo.M_FRICTIONANCHOR); }

    /** Unsafe version of {@link #m_mass(double) m_mass}. */
    public static void nm_mass(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_MASS, value); }
    /** Unsafe version of {@link #m_localInertialDiagonal(DoubleBuffer) m_localInertialDiagonal}. */
    public static void nm_localInertialDiagonal(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3DynamicsInfo.M_LOCALINERTIALDIAGONAL, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_localInertialDiagonal(int, double) m_localInertialDiagonal}. */
    public static void nm_localInertialDiagonal(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_LOCALINERTIALDIAGONAL + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_localInertialFrame(DoubleBuffer) m_localInertialFrame}. */
    public static void nm_localInertialFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3DynamicsInfo.M_LOCALINERTIALFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_localInertialFrame(int, double) m_localInertialFrame}. */
    public static void nm_localInertialFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_LOCALINERTIALFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_lateralFrictionCoeff(double) m_lateralFrictionCoeff}. */
    public static void nm_lateralFrictionCoeff(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_LATERALFRICTIONCOEFF, value); }
    /** Unsafe version of {@link #m_rollingFrictionCoeff(double) m_rollingFrictionCoeff}. */
    public static void nm_rollingFrictionCoeff(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_ROLLINGFRICTIONCOEFF, value); }
    /** Unsafe version of {@link #m_spinningFrictionCoeff(double) m_spinningFrictionCoeff}. */
    public static void nm_spinningFrictionCoeff(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_SPINNINGFRICTIONCOEFF, value); }
    /** Unsafe version of {@link #m_restitution(double) m_restitution}. */
    public static void nm_restitution(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_RESTITUTION, value); }
    /** Unsafe version of {@link #m_contactStiffness(double) m_contactStiffness}. */
    public static void nm_contactStiffness(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_CONTACTSTIFFNESS, value); }
    /** Unsafe version of {@link #m_contactDamping(double) m_contactDamping}. */
    public static void nm_contactDamping(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_CONTACTDAMPING, value); }
    /** Unsafe version of {@link #m_activationState(int) m_activationState}. */
    public static void nm_activationState(long struct, int value) { UNSAFE.putInt(null, struct + B3DynamicsInfo.M_ACTIVATIONSTATE, value); }
    /** Unsafe version of {@link #m_angularDamping(double) m_angularDamping}. */
    public static void nm_angularDamping(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_ANGULARDAMPING, value); }
    /** Unsafe version of {@link #m_linearDamping(double) m_linearDamping}. */
    public static void nm_linearDamping(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_LINEARDAMPING, value); }
    /** Unsafe version of {@link #m_ccdSweptSphereRadius(double) m_ccdSweptSphereRadius}. */
    public static void nm_ccdSweptSphereRadius(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_CCDSWEPTSPHERERADIUS, value); }
    /** Unsafe version of {@link #m_contactProcessingThreshold(double) m_contactProcessingThreshold}. */
    public static void nm_contactProcessingThreshold(long struct, double value) { UNSAFE.putDouble(null, struct + B3DynamicsInfo.M_CONTACTPROCESSINGTHRESHOLD, value); }
    /** Unsafe version of {@link #m_frictionAnchor(int) m_frictionAnchor}. */
    public static void nm_frictionAnchor(long struct, int value) { UNSAFE.putInt(null, struct + B3DynamicsInfo.M_FRICTIONANCHOR, value); }

    // -----------------------------------

    /** An array of {@link B3DynamicsInfo} structs. */
    public static class Buffer extends StructBuffer<B3DynamicsInfo, Buffer> implements NativeResource {

        private static final B3DynamicsInfo ELEMENT_FACTORY = B3DynamicsInfo.create(-1L);

        /**
         * Creates a new {@code B3DynamicsInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3DynamicsInfo#SIZEOF}, and its mark will be undefined.
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
        protected B3DynamicsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_mass} field. */
        public double m_mass() { return B3DynamicsInfo.nm_mass(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialDiagonal} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_localInertialDiagonal() { return B3DynamicsInfo.nm_localInertialDiagonal(address()); }
        /** Returns the value at the specified index of the {@code m_localInertialDiagonal} field. */
        public double m_localInertialDiagonal(int index) { return B3DynamicsInfo.nm_localInertialDiagonal(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_localInertialFrame() { return B3DynamicsInfo.nm_localInertialFrame(address()); }
        /** Returns the value at the specified index of the {@code m_localInertialFrame} field. */
        public double m_localInertialFrame(int index) { return B3DynamicsInfo.nm_localInertialFrame(address(), index); }
        /** Returns the value of the {@code m_lateralFrictionCoeff} field. */
        public double m_lateralFrictionCoeff() { return B3DynamicsInfo.nm_lateralFrictionCoeff(address()); }
        /** Returns the value of the {@code m_rollingFrictionCoeff} field. */
        public double m_rollingFrictionCoeff() { return B3DynamicsInfo.nm_rollingFrictionCoeff(address()); }
        /** Returns the value of the {@code m_spinningFrictionCoeff} field. */
        public double m_spinningFrictionCoeff() { return B3DynamicsInfo.nm_spinningFrictionCoeff(address()); }
        /** Returns the value of the {@code m_restitution} field. */
        public double m_restitution() { return B3DynamicsInfo.nm_restitution(address()); }
        /** Returns the value of the {@code m_contactStiffness} field. */
        public double m_contactStiffness() { return B3DynamicsInfo.nm_contactStiffness(address()); }
        /** Returns the value of the {@code m_contactDamping} field. */
        public double m_contactDamping() { return B3DynamicsInfo.nm_contactDamping(address()); }
        /** Returns the value of the {@code m_activationState} field. */
        public int m_activationState() { return B3DynamicsInfo.nm_activationState(address()); }
        /** Returns the value of the {@code m_angularDamping} field. */
        public double m_angularDamping() { return B3DynamicsInfo.nm_angularDamping(address()); }
        /** Returns the value of the {@code m_linearDamping} field. */
        public double m_linearDamping() { return B3DynamicsInfo.nm_linearDamping(address()); }
        /** Returns the value of the {@code m_ccdSweptSphereRadius} field. */
        public double m_ccdSweptSphereRadius() { return B3DynamicsInfo.nm_ccdSweptSphereRadius(address()); }
        /** Returns the value of the {@code m_contactProcessingThreshold} field. */
        public double m_contactProcessingThreshold() { return B3DynamicsInfo.nm_contactProcessingThreshold(address()); }
        /** Returns the value of the {@code m_frictionAnchor} field. */
        public int m_frictionAnchor() { return B3DynamicsInfo.nm_frictionAnchor(address()); }

        /** Sets the specified value to the {@code m_mass} field. */
        public B3DynamicsInfo.Buffer m_mass(double value) { B3DynamicsInfo.nm_mass(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialDiagonal} field. */
        public B3DynamicsInfo.Buffer m_localInertialDiagonal(@NativeType("double[3]") DoubleBuffer value) { B3DynamicsInfo.nm_localInertialDiagonal(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_localInertialDiagonal} field. */
        public B3DynamicsInfo.Buffer m_localInertialDiagonal(int index, double value) { B3DynamicsInfo.nm_localInertialDiagonal(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialFrame} field. */
        public B3DynamicsInfo.Buffer m_localInertialFrame(@NativeType("double[7]") DoubleBuffer value) { B3DynamicsInfo.nm_localInertialFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_localInertialFrame} field. */
        public B3DynamicsInfo.Buffer m_localInertialFrame(int index, double value) { B3DynamicsInfo.nm_localInertialFrame(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_lateralFrictionCoeff} field. */
        public B3DynamicsInfo.Buffer m_lateralFrictionCoeff(double value) { B3DynamicsInfo.nm_lateralFrictionCoeff(address(), value); return this; }
        /** Sets the specified value to the {@code m_rollingFrictionCoeff} field. */
        public B3DynamicsInfo.Buffer m_rollingFrictionCoeff(double value) { B3DynamicsInfo.nm_rollingFrictionCoeff(address(), value); return this; }
        /** Sets the specified value to the {@code m_spinningFrictionCoeff} field. */
        public B3DynamicsInfo.Buffer m_spinningFrictionCoeff(double value) { B3DynamicsInfo.nm_spinningFrictionCoeff(address(), value); return this; }
        /** Sets the specified value to the {@code m_restitution} field. */
        public B3DynamicsInfo.Buffer m_restitution(double value) { B3DynamicsInfo.nm_restitution(address(), value); return this; }
        /** Sets the specified value to the {@code m_contactStiffness} field. */
        public B3DynamicsInfo.Buffer m_contactStiffness(double value) { B3DynamicsInfo.nm_contactStiffness(address(), value); return this; }
        /** Sets the specified value to the {@code m_contactDamping} field. */
        public B3DynamicsInfo.Buffer m_contactDamping(double value) { B3DynamicsInfo.nm_contactDamping(address(), value); return this; }
        /** Sets the specified value to the {@code m_activationState} field. */
        public B3DynamicsInfo.Buffer m_activationState(int value) { B3DynamicsInfo.nm_activationState(address(), value); return this; }
        /** Sets the specified value to the {@code m_angularDamping} field. */
        public B3DynamicsInfo.Buffer m_angularDamping(double value) { B3DynamicsInfo.nm_angularDamping(address(), value); return this; }
        /** Sets the specified value to the {@code m_linearDamping} field. */
        public B3DynamicsInfo.Buffer m_linearDamping(double value) { B3DynamicsInfo.nm_linearDamping(address(), value); return this; }
        /** Sets the specified value to the {@code m_ccdSweptSphereRadius} field. */
        public B3DynamicsInfo.Buffer m_ccdSweptSphereRadius(double value) { B3DynamicsInfo.nm_ccdSweptSphereRadius(address(), value); return this; }
        /** Sets the specified value to the {@code m_contactProcessingThreshold} field. */
        public B3DynamicsInfo.Buffer m_contactProcessingThreshold(double value) { B3DynamicsInfo.nm_contactProcessingThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code m_frictionAnchor} field. */
        public B3DynamicsInfo.Buffer m_frictionAnchor(int value) { B3DynamicsInfo.nm_frictionAnchor(address(), value); return this; }

    }

}