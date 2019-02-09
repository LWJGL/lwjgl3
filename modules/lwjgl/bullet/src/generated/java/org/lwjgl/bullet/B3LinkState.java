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
 * struct b3LinkState {
 *     double m_worldPosition[3];
 *     double m_worldOrientation[4];
 *     double m_localInertialPosition[3];
 *     double m_localInertialOrientation[4];
 *     double m_worldLinkFramePosition[3];
 *     double m_worldLinkFrameOrientation[4];
 *     double m_worldLinearVelocity[3];
 *     double m_worldAngularVelocity[3];
 *     double m_worldAABBMin[3];
 *     double m_worldAABBMax[3];
 * }</code></pre>
 */
@NativeType("struct b3LinkState")
public class B3LinkState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_WORLDPOSITION,
        M_WORLDORIENTATION,
        M_LOCALINERTIALPOSITION,
        M_LOCALINERTIALORIENTATION,
        M_WORLDLINKFRAMEPOSITION,
        M_WORLDLINKFRAMEORIENTATION,
        M_WORLDLINEARVELOCITY,
        M_WORLDANGULARVELOCITY,
        M_WORLDAABBMIN,
        M_WORLDAABBMAX;

    static {
        Layout layout = __struct(
            __array(8, 3),
            __array(8, 4),
            __array(8, 3),
            __array(8, 4),
            __array(8, 3),
            __array(8, 4),
            __array(8, 3),
            __array(8, 3),
            __array(8, 3),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_WORLDPOSITION = layout.offsetof(0);
        M_WORLDORIENTATION = layout.offsetof(1);
        M_LOCALINERTIALPOSITION = layout.offsetof(2);
        M_LOCALINERTIALORIENTATION = layout.offsetof(3);
        M_WORLDLINKFRAMEPOSITION = layout.offsetof(4);
        M_WORLDLINKFRAMEORIENTATION = layout.offsetof(5);
        M_WORLDLINEARVELOCITY = layout.offsetof(6);
        M_WORLDANGULARVELOCITY = layout.offsetof(7);
        M_WORLDAABBMIN = layout.offsetof(8);
        M_WORLDAABBMAX = layout.offsetof(9);
    }

    /**
     * Creates a {@code B3LinkState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3LinkState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link DoubleBuffer} view of the {@code m_worldPosition} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_worldPosition() { return nm_worldPosition(address()); }
    /** Returns the value at the specified index of the {@code m_worldPosition} field. */
    public double m_worldPosition(int index) { return nm_worldPosition(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldOrientation} field. */
    @NativeType("double[4]")
    public DoubleBuffer m_worldOrientation() { return nm_worldOrientation(address()); }
    /** Returns the value at the specified index of the {@code m_worldOrientation} field. */
    public double m_worldOrientation(int index) { return nm_worldOrientation(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialPosition} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_localInertialPosition() { return nm_localInertialPosition(address()); }
    /** Returns the value at the specified index of the {@code m_localInertialPosition} field. */
    public double m_localInertialPosition(int index) { return nm_localInertialPosition(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialOrientation} field. */
    @NativeType("double[4]")
    public DoubleBuffer m_localInertialOrientation() { return nm_localInertialOrientation(address()); }
    /** Returns the value at the specified index of the {@code m_localInertialOrientation} field. */
    public double m_localInertialOrientation(int index) { return nm_localInertialOrientation(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldLinkFramePosition} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_worldLinkFramePosition() { return nm_worldLinkFramePosition(address()); }
    /** Returns the value at the specified index of the {@code m_worldLinkFramePosition} field. */
    public double m_worldLinkFramePosition(int index) { return nm_worldLinkFramePosition(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldLinkFrameOrientation} field. */
    @NativeType("double[4]")
    public DoubleBuffer m_worldLinkFrameOrientation() { return nm_worldLinkFrameOrientation(address()); }
    /** Returns the value at the specified index of the {@code m_worldLinkFrameOrientation} field. */
    public double m_worldLinkFrameOrientation(int index) { return nm_worldLinkFrameOrientation(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldLinearVelocity} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_worldLinearVelocity() { return nm_worldLinearVelocity(address()); }
    /** Returns the value at the specified index of the {@code m_worldLinearVelocity} field. */
    public double m_worldLinearVelocity(int index) { return nm_worldLinearVelocity(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldAngularVelocity} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_worldAngularVelocity() { return nm_worldAngularVelocity(address()); }
    /** Returns the value at the specified index of the {@code m_worldAngularVelocity} field. */
    public double m_worldAngularVelocity(int index) { return nm_worldAngularVelocity(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldAABBMin} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_worldAABBMin() { return nm_worldAABBMin(address()); }
    /** Returns the value at the specified index of the {@code m_worldAABBMin} field. */
    public double m_worldAABBMin(int index) { return nm_worldAABBMin(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_worldAABBMax} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_worldAABBMax() { return nm_worldAABBMax(address()); }
    /** Returns the value at the specified index of the {@code m_worldAABBMax} field. */
    public double m_worldAABBMax(int index) { return nm_worldAABBMax(address(), index); }

    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldPosition} field. */
    public B3LinkState m_worldPosition(@NativeType("double[3]") DoubleBuffer value) { nm_worldPosition(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldPosition} field. */
    public B3LinkState m_worldPosition(int index, double value) { nm_worldPosition(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldOrientation} field. */
    public B3LinkState m_worldOrientation(@NativeType("double[4]") DoubleBuffer value) { nm_worldOrientation(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldOrientation} field. */
    public B3LinkState m_worldOrientation(int index, double value) { nm_worldOrientation(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialPosition} field. */
    public B3LinkState m_localInertialPosition(@NativeType("double[3]") DoubleBuffer value) { nm_localInertialPosition(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_localInertialPosition} field. */
    public B3LinkState m_localInertialPosition(int index, double value) { nm_localInertialPosition(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialOrientation} field. */
    public B3LinkState m_localInertialOrientation(@NativeType("double[4]") DoubleBuffer value) { nm_localInertialOrientation(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_localInertialOrientation} field. */
    public B3LinkState m_localInertialOrientation(int index, double value) { nm_localInertialOrientation(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldLinkFramePosition} field. */
    public B3LinkState m_worldLinkFramePosition(@NativeType("double[3]") DoubleBuffer value) { nm_worldLinkFramePosition(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldLinkFramePosition} field. */
    public B3LinkState m_worldLinkFramePosition(int index, double value) { nm_worldLinkFramePosition(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldLinkFrameOrientation} field. */
    public B3LinkState m_worldLinkFrameOrientation(@NativeType("double[4]") DoubleBuffer value) { nm_worldLinkFrameOrientation(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldLinkFrameOrientation} field. */
    public B3LinkState m_worldLinkFrameOrientation(int index, double value) { nm_worldLinkFrameOrientation(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldLinearVelocity} field. */
    public B3LinkState m_worldLinearVelocity(@NativeType("double[3]") DoubleBuffer value) { nm_worldLinearVelocity(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldLinearVelocity} field. */
    public B3LinkState m_worldLinearVelocity(int index, double value) { nm_worldLinearVelocity(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldAngularVelocity} field. */
    public B3LinkState m_worldAngularVelocity(@NativeType("double[3]") DoubleBuffer value) { nm_worldAngularVelocity(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldAngularVelocity} field. */
    public B3LinkState m_worldAngularVelocity(int index, double value) { nm_worldAngularVelocity(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldAABBMin} field. */
    public B3LinkState m_worldAABBMin(@NativeType("double[3]") DoubleBuffer value) { nm_worldAABBMin(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldAABBMin} field. */
    public B3LinkState m_worldAABBMin(int index, double value) { nm_worldAABBMin(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_worldAABBMax} field. */
    public B3LinkState m_worldAABBMax(@NativeType("double[3]") DoubleBuffer value) { nm_worldAABBMax(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_worldAABBMax} field. */
    public B3LinkState m_worldAABBMax(int index, double value) { nm_worldAABBMax(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public B3LinkState set(
        DoubleBuffer m_worldPosition,
        DoubleBuffer m_worldOrientation,
        DoubleBuffer m_localInertialPosition,
        DoubleBuffer m_localInertialOrientation,
        DoubleBuffer m_worldLinkFramePosition,
        DoubleBuffer m_worldLinkFrameOrientation,
        DoubleBuffer m_worldLinearVelocity,
        DoubleBuffer m_worldAngularVelocity,
        DoubleBuffer m_worldAABBMin,
        DoubleBuffer m_worldAABBMax
    ) {
        m_worldPosition(m_worldPosition);
        m_worldOrientation(m_worldOrientation);
        m_localInertialPosition(m_localInertialPosition);
        m_localInertialOrientation(m_localInertialOrientation);
        m_worldLinkFramePosition(m_worldLinkFramePosition);
        m_worldLinkFrameOrientation(m_worldLinkFrameOrientation);
        m_worldLinearVelocity(m_worldLinearVelocity);
        m_worldAngularVelocity(m_worldAngularVelocity);
        m_worldAABBMin(m_worldAABBMin);
        m_worldAABBMax(m_worldAABBMax);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3LinkState set(B3LinkState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3LinkState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3LinkState malloc() {
        return wrap(B3LinkState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3LinkState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3LinkState calloc() {
        return wrap(B3LinkState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3LinkState} instance allocated with {@link BufferUtils}. */
    public static B3LinkState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3LinkState.class, memAddress(container), container);
    }

    /** Returns a new {@code B3LinkState} instance for the specified memory address. */
    public static B3LinkState create(long address) {
        return wrap(B3LinkState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3LinkState createSafe(long address) {
        return address == NULL ? null : wrap(B3LinkState.class, address);
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3LinkState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3LinkState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3LinkState} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3LinkState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3LinkState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3LinkState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3LinkState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3LinkState mallocStack(MemoryStack stack) {
        return wrap(B3LinkState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3LinkState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3LinkState callocStack(MemoryStack stack) {
        return wrap(B3LinkState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3LinkState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3LinkState.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_worldPosition}. */
    public static DoubleBuffer nm_worldPosition(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDPOSITION, 3); }
    /** Unsafe version of {@link #m_worldPosition(int) m_worldPosition}. */
    public static double nm_worldPosition(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDPOSITION + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_worldOrientation}. */
    public static DoubleBuffer nm_worldOrientation(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDORIENTATION, 4); }
    /** Unsafe version of {@link #m_worldOrientation(int) m_worldOrientation}. */
    public static double nm_worldOrientation(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDORIENTATION + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #m_localInertialPosition}. */
    public static DoubleBuffer nm_localInertialPosition(long struct) { return memDoubleBuffer(struct + B3LinkState.M_LOCALINERTIALPOSITION, 3); }
    /** Unsafe version of {@link #m_localInertialPosition(int) m_localInertialPosition}. */
    public static double nm_localInertialPosition(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_LOCALINERTIALPOSITION + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_localInertialOrientation}. */
    public static DoubleBuffer nm_localInertialOrientation(long struct) { return memDoubleBuffer(struct + B3LinkState.M_LOCALINERTIALORIENTATION, 4); }
    /** Unsafe version of {@link #m_localInertialOrientation(int) m_localInertialOrientation}. */
    public static double nm_localInertialOrientation(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_LOCALINERTIALORIENTATION + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #m_worldLinkFramePosition}. */
    public static DoubleBuffer nm_worldLinkFramePosition(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDLINKFRAMEPOSITION, 3); }
    /** Unsafe version of {@link #m_worldLinkFramePosition(int) m_worldLinkFramePosition}. */
    public static double nm_worldLinkFramePosition(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDLINKFRAMEPOSITION + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_worldLinkFrameOrientation}. */
    public static DoubleBuffer nm_worldLinkFrameOrientation(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDLINKFRAMEORIENTATION, 4); }
    /** Unsafe version of {@link #m_worldLinkFrameOrientation(int) m_worldLinkFrameOrientation}. */
    public static double nm_worldLinkFrameOrientation(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDLINKFRAMEORIENTATION + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #m_worldLinearVelocity}. */
    public static DoubleBuffer nm_worldLinearVelocity(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDLINEARVELOCITY, 3); }
    /** Unsafe version of {@link #m_worldLinearVelocity(int) m_worldLinearVelocity}. */
    public static double nm_worldLinearVelocity(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDLINEARVELOCITY + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_worldAngularVelocity}. */
    public static DoubleBuffer nm_worldAngularVelocity(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDANGULARVELOCITY, 3); }
    /** Unsafe version of {@link #m_worldAngularVelocity(int) m_worldAngularVelocity}. */
    public static double nm_worldAngularVelocity(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDANGULARVELOCITY + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_worldAABBMin}. */
    public static DoubleBuffer nm_worldAABBMin(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDAABBMIN, 3); }
    /** Unsafe version of {@link #m_worldAABBMin(int) m_worldAABBMin}. */
    public static double nm_worldAABBMin(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDAABBMIN + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_worldAABBMax}. */
    public static DoubleBuffer nm_worldAABBMax(long struct) { return memDoubleBuffer(struct + B3LinkState.M_WORLDAABBMAX, 3); }
    /** Unsafe version of {@link #m_worldAABBMax(int) m_worldAABBMax}. */
    public static double nm_worldAABBMax(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3LinkState.M_WORLDAABBMAX + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #m_worldPosition(DoubleBuffer) m_worldPosition}. */
    public static void nm_worldPosition(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDPOSITION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldPosition(int, double) m_worldPosition}. */
    public static void nm_worldPosition(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDPOSITION + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_worldOrientation(DoubleBuffer) m_worldOrientation}. */
    public static void nm_worldOrientation(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDORIENTATION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldOrientation(int, double) m_worldOrientation}. */
    public static void nm_worldOrientation(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDORIENTATION + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #m_localInertialPosition(DoubleBuffer) m_localInertialPosition}. */
    public static void nm_localInertialPosition(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_LOCALINERTIALPOSITION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_localInertialPosition(int, double) m_localInertialPosition}. */
    public static void nm_localInertialPosition(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_LOCALINERTIALPOSITION + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_localInertialOrientation(DoubleBuffer) m_localInertialOrientation}. */
    public static void nm_localInertialOrientation(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3LinkState.M_LOCALINERTIALORIENTATION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_localInertialOrientation(int, double) m_localInertialOrientation}. */
    public static void nm_localInertialOrientation(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_LOCALINERTIALORIENTATION + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #m_worldLinkFramePosition(DoubleBuffer) m_worldLinkFramePosition}. */
    public static void nm_worldLinkFramePosition(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDLINKFRAMEPOSITION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldLinkFramePosition(int, double) m_worldLinkFramePosition}. */
    public static void nm_worldLinkFramePosition(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDLINKFRAMEPOSITION + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_worldLinkFrameOrientation(DoubleBuffer) m_worldLinkFrameOrientation}. */
    public static void nm_worldLinkFrameOrientation(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDLINKFRAMEORIENTATION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldLinkFrameOrientation(int, double) m_worldLinkFrameOrientation}. */
    public static void nm_worldLinkFrameOrientation(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDLINKFRAMEORIENTATION + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #m_worldLinearVelocity(DoubleBuffer) m_worldLinearVelocity}. */
    public static void nm_worldLinearVelocity(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDLINEARVELOCITY, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldLinearVelocity(int, double) m_worldLinearVelocity}. */
    public static void nm_worldLinearVelocity(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDLINEARVELOCITY + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_worldAngularVelocity(DoubleBuffer) m_worldAngularVelocity}. */
    public static void nm_worldAngularVelocity(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDANGULARVELOCITY, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldAngularVelocity(int, double) m_worldAngularVelocity}. */
    public static void nm_worldAngularVelocity(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDANGULARVELOCITY + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_worldAABBMin(DoubleBuffer) m_worldAABBMin}. */
    public static void nm_worldAABBMin(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDAABBMIN, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldAABBMin(int, double) m_worldAABBMin}. */
    public static void nm_worldAABBMin(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDAABBMIN + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_worldAABBMax(DoubleBuffer) m_worldAABBMax}. */
    public static void nm_worldAABBMax(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3LinkState.M_WORLDAABBMAX, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_worldAABBMax(int, double) m_worldAABBMax}. */
    public static void nm_worldAABBMax(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3LinkState.M_WORLDAABBMAX + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link B3LinkState} structs. */
    public static class Buffer extends StructBuffer<B3LinkState, Buffer> implements NativeResource {

        private static final B3LinkState ELEMENT_FACTORY = B3LinkState.create(-1L);

        /**
         * Creates a new {@code B3LinkState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3LinkState#SIZEOF}, and its mark will be undefined.
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
        protected B3LinkState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link DoubleBuffer} view of the {@code m_worldPosition} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_worldPosition() { return B3LinkState.nm_worldPosition(address()); }
        /** Returns the value at the specified index of the {@code m_worldPosition} field. */
        public double m_worldPosition(int index) { return B3LinkState.nm_worldPosition(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldOrientation} field. */
        @NativeType("double[4]")
        public DoubleBuffer m_worldOrientation() { return B3LinkState.nm_worldOrientation(address()); }
        /** Returns the value at the specified index of the {@code m_worldOrientation} field. */
        public double m_worldOrientation(int index) { return B3LinkState.nm_worldOrientation(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialPosition} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_localInertialPosition() { return B3LinkState.nm_localInertialPosition(address()); }
        /** Returns the value at the specified index of the {@code m_localInertialPosition} field. */
        public double m_localInertialPosition(int index) { return B3LinkState.nm_localInertialPosition(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_localInertialOrientation} field. */
        @NativeType("double[4]")
        public DoubleBuffer m_localInertialOrientation() { return B3LinkState.nm_localInertialOrientation(address()); }
        /** Returns the value at the specified index of the {@code m_localInertialOrientation} field. */
        public double m_localInertialOrientation(int index) { return B3LinkState.nm_localInertialOrientation(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldLinkFramePosition} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_worldLinkFramePosition() { return B3LinkState.nm_worldLinkFramePosition(address()); }
        /** Returns the value at the specified index of the {@code m_worldLinkFramePosition} field. */
        public double m_worldLinkFramePosition(int index) { return B3LinkState.nm_worldLinkFramePosition(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldLinkFrameOrientation} field. */
        @NativeType("double[4]")
        public DoubleBuffer m_worldLinkFrameOrientation() { return B3LinkState.nm_worldLinkFrameOrientation(address()); }
        /** Returns the value at the specified index of the {@code m_worldLinkFrameOrientation} field. */
        public double m_worldLinkFrameOrientation(int index) { return B3LinkState.nm_worldLinkFrameOrientation(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldLinearVelocity} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_worldLinearVelocity() { return B3LinkState.nm_worldLinearVelocity(address()); }
        /** Returns the value at the specified index of the {@code m_worldLinearVelocity} field. */
        public double m_worldLinearVelocity(int index) { return B3LinkState.nm_worldLinearVelocity(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldAngularVelocity} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_worldAngularVelocity() { return B3LinkState.nm_worldAngularVelocity(address()); }
        /** Returns the value at the specified index of the {@code m_worldAngularVelocity} field. */
        public double m_worldAngularVelocity(int index) { return B3LinkState.nm_worldAngularVelocity(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldAABBMin} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_worldAABBMin() { return B3LinkState.nm_worldAABBMin(address()); }
        /** Returns the value at the specified index of the {@code m_worldAABBMin} field. */
        public double m_worldAABBMin(int index) { return B3LinkState.nm_worldAABBMin(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_worldAABBMax} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_worldAABBMax() { return B3LinkState.nm_worldAABBMax(address()); }
        /** Returns the value at the specified index of the {@code m_worldAABBMax} field. */
        public double m_worldAABBMax(int index) { return B3LinkState.nm_worldAABBMax(address(), index); }

        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldPosition} field. */
        public B3LinkState.Buffer m_worldPosition(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_worldPosition(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldPosition} field. */
        public B3LinkState.Buffer m_worldPosition(int index, double value) { B3LinkState.nm_worldPosition(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldOrientation} field. */
        public B3LinkState.Buffer m_worldOrientation(@NativeType("double[4]") DoubleBuffer value) { B3LinkState.nm_worldOrientation(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldOrientation} field. */
        public B3LinkState.Buffer m_worldOrientation(int index, double value) { B3LinkState.nm_worldOrientation(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialPosition} field. */
        public B3LinkState.Buffer m_localInertialPosition(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_localInertialPosition(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_localInertialPosition} field. */
        public B3LinkState.Buffer m_localInertialPosition(int index, double value) { B3LinkState.nm_localInertialPosition(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_localInertialOrientation} field. */
        public B3LinkState.Buffer m_localInertialOrientation(@NativeType("double[4]") DoubleBuffer value) { B3LinkState.nm_localInertialOrientation(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_localInertialOrientation} field. */
        public B3LinkState.Buffer m_localInertialOrientation(int index, double value) { B3LinkState.nm_localInertialOrientation(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldLinkFramePosition} field. */
        public B3LinkState.Buffer m_worldLinkFramePosition(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_worldLinkFramePosition(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldLinkFramePosition} field. */
        public B3LinkState.Buffer m_worldLinkFramePosition(int index, double value) { B3LinkState.nm_worldLinkFramePosition(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldLinkFrameOrientation} field. */
        public B3LinkState.Buffer m_worldLinkFrameOrientation(@NativeType("double[4]") DoubleBuffer value) { B3LinkState.nm_worldLinkFrameOrientation(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldLinkFrameOrientation} field. */
        public B3LinkState.Buffer m_worldLinkFrameOrientation(int index, double value) { B3LinkState.nm_worldLinkFrameOrientation(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldLinearVelocity} field. */
        public B3LinkState.Buffer m_worldLinearVelocity(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_worldLinearVelocity(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldLinearVelocity} field. */
        public B3LinkState.Buffer m_worldLinearVelocity(int index, double value) { B3LinkState.nm_worldLinearVelocity(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldAngularVelocity} field. */
        public B3LinkState.Buffer m_worldAngularVelocity(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_worldAngularVelocity(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldAngularVelocity} field. */
        public B3LinkState.Buffer m_worldAngularVelocity(int index, double value) { B3LinkState.nm_worldAngularVelocity(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldAABBMin} field. */
        public B3LinkState.Buffer m_worldAABBMin(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_worldAABBMin(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldAABBMin} field. */
        public B3LinkState.Buffer m_worldAABBMin(int index, double value) { B3LinkState.nm_worldAABBMin(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_worldAABBMax} field. */
        public B3LinkState.Buffer m_worldAABBMax(@NativeType("double[3]") DoubleBuffer value) { B3LinkState.nm_worldAABBMax(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_worldAABBMax} field. */
        public B3LinkState.Buffer m_worldAABBMax(int index, double value) { B3LinkState.nm_worldAABBMax(address(), index, value); return this; }

    }

}