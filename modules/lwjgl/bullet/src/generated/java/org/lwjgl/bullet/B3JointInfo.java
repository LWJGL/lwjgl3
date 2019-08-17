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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_parentFrame[7]} &ndash; position and orientation (quaternion)</li>
 * <li>{@code m_childFrame[7]} &ndash; position and orientation (quaternion)</li>
 * <li>{@code m_jointAxis[3]} &ndash; joint axis in parent local frame</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3JointInfo {
 *     char m_linkName[1024];
 *     char m_jointName[1024];
 *     int m_jointType;
 *     int m_qIndex;
 *     int m_uIndex;
 *     int m_jointIndex;
 *     int m_flags;
 *     double m_jointDamping;
 *     double m_jointFriction;
 *     double m_jointLowerLimit;
 *     double m_jointUpperLimit;
 *     double m_jointMaxForce;
 *     double m_jointMaxVelocity;
 *     double m_parentFrame[7];
 *     double m_childFrame[7];
 *     double m_jointAxis[3];
 *     int m_parentIndex;
 *     int m_qSize;
 *     int m_uSize;
 * }</code></pre>
 */
@NativeType("struct b3JointInfo")
public class B3JointInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_LINKNAME,
        M_JOINTNAME,
        M_JOINTTYPE,
        M_QINDEX,
        M_UINDEX,
        M_JOINTINDEX,
        M_FLAGS,
        M_JOINTDAMPING,
        M_JOINTFRICTION,
        M_JOINTLOWERLIMIT,
        M_JOINTUPPERLIMIT,
        M_JOINTMAXFORCE,
        M_JOINTMAXVELOCITY,
        M_PARENTFRAME,
        M_CHILDFRAME,
        M_JOINTAXIS,
        M_PARENTINDEX,
        M_QSIZE,
        M_USIZE;

    static {
        Layout layout = __struct(
            __array(1, 1024),
            __array(1, 1024),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __array(8, 7),
            __array(8, 7),
            __array(8, 3),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_LINKNAME = layout.offsetof(0);
        M_JOINTNAME = layout.offsetof(1);
        M_JOINTTYPE = layout.offsetof(2);
        M_QINDEX = layout.offsetof(3);
        M_UINDEX = layout.offsetof(4);
        M_JOINTINDEX = layout.offsetof(5);
        M_FLAGS = layout.offsetof(6);
        M_JOINTDAMPING = layout.offsetof(7);
        M_JOINTFRICTION = layout.offsetof(8);
        M_JOINTLOWERLIMIT = layout.offsetof(9);
        M_JOINTUPPERLIMIT = layout.offsetof(10);
        M_JOINTMAXFORCE = layout.offsetof(11);
        M_JOINTMAXVELOCITY = layout.offsetof(12);
        M_PARENTFRAME = layout.offsetof(13);
        M_CHILDFRAME = layout.offsetof(14);
        M_JOINTAXIS = layout.offsetof(15);
        M_PARENTINDEX = layout.offsetof(16);
        M_QSIZE = layout.offsetof(17);
        M_USIZE = layout.offsetof(18);
    }

    /**
     * Creates a {@code B3JointInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3JointInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code m_linkName} field. */
    @NativeType("char[1024]")
    public ByteBuffer m_linkName() { return nm_linkName(address()); }
    /** Decodes the null-terminated string stored in the {@code m_linkName} field. */
    @NativeType("char[1024]")
    public String m_linkNameString() { return nm_linkNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code m_jointName} field. */
    @NativeType("char[1024]")
    public ByteBuffer m_jointName() { return nm_jointName(address()); }
    /** Decodes the null-terminated string stored in the {@code m_jointName} field. */
    @NativeType("char[1024]")
    public String m_jointNameString() { return nm_jointNameString(address()); }
    /** Returns the value of the {@code m_jointType} field. */
    public int m_jointType() { return nm_jointType(address()); }
    /** Returns the value of the {@code m_qIndex} field. */
    public int m_qIndex() { return nm_qIndex(address()); }
    /** Returns the value of the {@code m_uIndex} field. */
    public int m_uIndex() { return nm_uIndex(address()); }
    /** Returns the value of the {@code m_jointIndex} field. */
    public int m_jointIndex() { return nm_jointIndex(address()); }
    /** Returns the value of the {@code m_flags} field. */
    public int m_flags() { return nm_flags(address()); }
    /** Returns the value of the {@code m_jointDamping} field. */
    public double m_jointDamping() { return nm_jointDamping(address()); }
    /** Returns the value of the {@code m_jointFriction} field. */
    public double m_jointFriction() { return nm_jointFriction(address()); }
    /** Returns the value of the {@code m_jointLowerLimit} field. */
    public double m_jointLowerLimit() { return nm_jointLowerLimit(address()); }
    /** Returns the value of the {@code m_jointUpperLimit} field. */
    public double m_jointUpperLimit() { return nm_jointUpperLimit(address()); }
    /** Returns the value of the {@code m_jointMaxForce} field. */
    public double m_jointMaxForce() { return nm_jointMaxForce(address()); }
    /** Returns the value of the {@code m_jointMaxVelocity} field. */
    public double m_jointMaxVelocity() { return nm_jointMaxVelocity(address()); }
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
    /** Returns the value of the {@code m_parentIndex} field. */
    public int m_parentIndex() { return nm_parentIndex(address()); }
    /** Returns the value of the {@code m_qSize} field. */
    public int m_qSize() { return nm_qSize(address()); }
    /** Returns the value of the {@code m_uSize} field. */
    public int m_uSize() { return nm_uSize(address()); }

    /** Copies the specified encoded string to the {@code m_linkName} field. */
    public B3JointInfo m_linkName(@NativeType("char[1024]") ByteBuffer value) { nm_linkName(address(), value); return this; }
    /** Copies the specified encoded string to the {@code m_jointName} field. */
    public B3JointInfo m_jointName(@NativeType("char[1024]") ByteBuffer value) { nm_jointName(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointType} field. */
    public B3JointInfo m_jointType(int value) { nm_jointType(address(), value); return this; }
    /** Sets the specified value to the {@code m_qIndex} field. */
    public B3JointInfo m_qIndex(int value) { nm_qIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_uIndex} field. */
    public B3JointInfo m_uIndex(int value) { nm_uIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointIndex} field. */
    public B3JointInfo m_jointIndex(int value) { nm_jointIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_flags} field. */
    public B3JointInfo m_flags(int value) { nm_flags(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointDamping} field. */
    public B3JointInfo m_jointDamping(double value) { nm_jointDamping(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointFriction} field. */
    public B3JointInfo m_jointFriction(double value) { nm_jointFriction(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointLowerLimit} field. */
    public B3JointInfo m_jointLowerLimit(double value) { nm_jointLowerLimit(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointUpperLimit} field. */
    public B3JointInfo m_jointUpperLimit(double value) { nm_jointUpperLimit(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointMaxForce} field. */
    public B3JointInfo m_jointMaxForce(double value) { nm_jointMaxForce(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointMaxVelocity} field. */
    public B3JointInfo m_jointMaxVelocity(double value) { nm_jointMaxVelocity(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_parentFrame} field. */
    public B3JointInfo m_parentFrame(@NativeType("double[7]") DoubleBuffer value) { nm_parentFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_parentFrame} field. */
    public B3JointInfo m_parentFrame(int index, double value) { nm_parentFrame(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_childFrame} field. */
    public B3JointInfo m_childFrame(@NativeType("double[7]") DoubleBuffer value) { nm_childFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_childFrame} field. */
    public B3JointInfo m_childFrame(int index, double value) { nm_childFrame(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_jointAxis} field. */
    public B3JointInfo m_jointAxis(@NativeType("double[3]") DoubleBuffer value) { nm_jointAxis(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_jointAxis} field. */
    public B3JointInfo m_jointAxis(int index, double value) { nm_jointAxis(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_parentIndex} field. */
    public B3JointInfo m_parentIndex(int value) { nm_parentIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_qSize} field. */
    public B3JointInfo m_qSize(int value) { nm_qSize(address(), value); return this; }
    /** Sets the specified value to the {@code m_uSize} field. */
    public B3JointInfo m_uSize(int value) { nm_uSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3JointInfo set(
        ByteBuffer m_linkName,
        ByteBuffer m_jointName,
        int m_jointType,
        int m_qIndex,
        int m_uIndex,
        int m_jointIndex,
        int m_flags,
        double m_jointDamping,
        double m_jointFriction,
        double m_jointLowerLimit,
        double m_jointUpperLimit,
        double m_jointMaxForce,
        double m_jointMaxVelocity,
        DoubleBuffer m_parentFrame,
        DoubleBuffer m_childFrame,
        DoubleBuffer m_jointAxis,
        int m_parentIndex,
        int m_qSize,
        int m_uSize
    ) {
        m_linkName(m_linkName);
        m_jointName(m_jointName);
        m_jointType(m_jointType);
        m_qIndex(m_qIndex);
        m_uIndex(m_uIndex);
        m_jointIndex(m_jointIndex);
        m_flags(m_flags);
        m_jointDamping(m_jointDamping);
        m_jointFriction(m_jointFriction);
        m_jointLowerLimit(m_jointLowerLimit);
        m_jointUpperLimit(m_jointUpperLimit);
        m_jointMaxForce(m_jointMaxForce);
        m_jointMaxVelocity(m_jointMaxVelocity);
        m_parentFrame(m_parentFrame);
        m_childFrame(m_childFrame);
        m_jointAxis(m_jointAxis);
        m_parentIndex(m_parentIndex);
        m_qSize(m_qSize);
        m_uSize(m_uSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3JointInfo set(B3JointInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3JointInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3JointInfo malloc() {
        return wrap(B3JointInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3JointInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3JointInfo calloc() {
        return wrap(B3JointInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3JointInfo} instance allocated with {@link BufferUtils}. */
    public static B3JointInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3JointInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code B3JointInfo} instance for the specified memory address. */
    public static B3JointInfo create(long address) {
        return wrap(B3JointInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3JointInfo createSafe(long address) {
        return address == NULL ? null : wrap(B3JointInfo.class, address);
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3JointInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3JointInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3JointInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3JointInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3JointInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3JointInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3JointInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3JointInfo mallocStack(MemoryStack stack) {
        return wrap(B3JointInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3JointInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3JointInfo callocStack(MemoryStack stack) {
        return wrap(B3JointInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3JointInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3JointInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_linkName}. */
    public static ByteBuffer nm_linkName(long struct) { return memByteBuffer(struct + B3JointInfo.M_LINKNAME, 1024); }
    /** Unsafe version of {@link #m_linkNameString}. */
    public static String nm_linkNameString(long struct) { return memASCII(struct + B3JointInfo.M_LINKNAME); }
    /** Unsafe version of {@link #m_jointName}. */
    public static ByteBuffer nm_jointName(long struct) { return memByteBuffer(struct + B3JointInfo.M_JOINTNAME, 1024); }
    /** Unsafe version of {@link #m_jointNameString}. */
    public static String nm_jointNameString(long struct) { return memASCII(struct + B3JointInfo.M_JOINTNAME); }
    /** Unsafe version of {@link #m_jointType}. */
    public static int nm_jointType(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_JOINTTYPE); }
    /** Unsafe version of {@link #m_qIndex}. */
    public static int nm_qIndex(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_QINDEX); }
    /** Unsafe version of {@link #m_uIndex}. */
    public static int nm_uIndex(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_UINDEX); }
    /** Unsafe version of {@link #m_jointIndex}. */
    public static int nm_jointIndex(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_JOINTINDEX); }
    /** Unsafe version of {@link #m_flags}. */
    public static int nm_flags(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_FLAGS); }
    /** Unsafe version of {@link #m_jointDamping}. */
    public static double nm_jointDamping(long struct) { return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTDAMPING); }
    /** Unsafe version of {@link #m_jointFriction}. */
    public static double nm_jointFriction(long struct) { return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTFRICTION); }
    /** Unsafe version of {@link #m_jointLowerLimit}. */
    public static double nm_jointLowerLimit(long struct) { return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTLOWERLIMIT); }
    /** Unsafe version of {@link #m_jointUpperLimit}. */
    public static double nm_jointUpperLimit(long struct) { return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTUPPERLIMIT); }
    /** Unsafe version of {@link #m_jointMaxForce}. */
    public static double nm_jointMaxForce(long struct) { return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTMAXFORCE); }
    /** Unsafe version of {@link #m_jointMaxVelocity}. */
    public static double nm_jointMaxVelocity(long struct) { return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTMAXVELOCITY); }
    /** Unsafe version of {@link #m_parentFrame}. */
    public static DoubleBuffer nm_parentFrame(long struct) { return memDoubleBuffer(struct + B3JointInfo.M_PARENTFRAME, 7); }
    /** Unsafe version of {@link #m_parentFrame(int) m_parentFrame}. */
    public static double nm_parentFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointInfo.M_PARENTFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_childFrame}. */
    public static DoubleBuffer nm_childFrame(long struct) { return memDoubleBuffer(struct + B3JointInfo.M_CHILDFRAME, 7); }
    /** Unsafe version of {@link #m_childFrame(int) m_childFrame}. */
    public static double nm_childFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointInfo.M_CHILDFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_jointAxis}. */
    public static DoubleBuffer nm_jointAxis(long struct) { return memDoubleBuffer(struct + B3JointInfo.M_JOINTAXIS, 3); }
    /** Unsafe version of {@link #m_jointAxis(int) m_jointAxis}. */
    public static double nm_jointAxis(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3JointInfo.M_JOINTAXIS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_parentIndex}. */
    public static int nm_parentIndex(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_PARENTINDEX); }
    /** Unsafe version of {@link #m_qSize}. */
    public static int nm_qSize(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_QSIZE); }
    /** Unsafe version of {@link #m_uSize}. */
    public static int nm_uSize(long struct) { return UNSAFE.getInt(null, struct + B3JointInfo.M_USIZE); }

    /** Unsafe version of {@link #m_linkName(ByteBuffer) m_linkName}. */
    public static void nm_linkName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 1024);
        }
        memCopy(memAddress(value), struct + B3JointInfo.M_LINKNAME, value.remaining());
    }
    /** Unsafe version of {@link #m_jointName(ByteBuffer) m_jointName}. */
    public static void nm_jointName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 1024);
        }
        memCopy(memAddress(value), struct + B3JointInfo.M_JOINTNAME, value.remaining());
    }
    /** Unsafe version of {@link #m_jointType(int) m_jointType}. */
    public static void nm_jointType(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_JOINTTYPE, value); }
    /** Unsafe version of {@link #m_qIndex(int) m_qIndex}. */
    public static void nm_qIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_QINDEX, value); }
    /** Unsafe version of {@link #m_uIndex(int) m_uIndex}. */
    public static void nm_uIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_UINDEX, value); }
    /** Unsafe version of {@link #m_jointIndex(int) m_jointIndex}. */
    public static void nm_jointIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_JOINTINDEX, value); }
    /** Unsafe version of {@link #m_flags(int) m_flags}. */
    public static void nm_flags(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_FLAGS, value); }
    /** Unsafe version of {@link #m_jointDamping(double) m_jointDamping}. */
    public static void nm_jointDamping(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTDAMPING, value); }
    /** Unsafe version of {@link #m_jointFriction(double) m_jointFriction}. */
    public static void nm_jointFriction(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTFRICTION, value); }
    /** Unsafe version of {@link #m_jointLowerLimit(double) m_jointLowerLimit}. */
    public static void nm_jointLowerLimit(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTLOWERLIMIT, value); }
    /** Unsafe version of {@link #m_jointUpperLimit(double) m_jointUpperLimit}. */
    public static void nm_jointUpperLimit(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTUPPERLIMIT, value); }
    /** Unsafe version of {@link #m_jointMaxForce(double) m_jointMaxForce}. */
    public static void nm_jointMaxForce(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTMAXFORCE, value); }
    /** Unsafe version of {@link #m_jointMaxVelocity(double) m_jointMaxVelocity}. */
    public static void nm_jointMaxVelocity(long struct, double value) { UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTMAXVELOCITY, value); }
    /** Unsafe version of {@link #m_parentFrame(DoubleBuffer) m_parentFrame}. */
    public static void nm_parentFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3JointInfo.M_PARENTFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_parentFrame(int, double) m_parentFrame}. */
    public static void nm_parentFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointInfo.M_PARENTFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_childFrame(DoubleBuffer) m_childFrame}. */
    public static void nm_childFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3JointInfo.M_CHILDFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_childFrame(int, double) m_childFrame}. */
    public static void nm_childFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointInfo.M_CHILDFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_jointAxis(DoubleBuffer) m_jointAxis}. */
    public static void nm_jointAxis(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3JointInfo.M_JOINTAXIS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_jointAxis(int, double) m_jointAxis}. */
    public static void nm_jointAxis(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3JointInfo.M_JOINTAXIS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_parentIndex(int) m_parentIndex}. */
    public static void nm_parentIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_PARENTINDEX, value); }
    /** Unsafe version of {@link #m_qSize(int) m_qSize}. */
    public static void nm_qSize(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_QSIZE, value); }
    /** Unsafe version of {@link #m_uSize(int) m_uSize}. */
    public static void nm_uSize(long struct, int value) { UNSAFE.putInt(null, struct + B3JointInfo.M_USIZE, value); }

    // -----------------------------------

    /** An array of {@link B3JointInfo} structs. */
    public static class Buffer extends StructBuffer<B3JointInfo, Buffer> implements NativeResource {

        private static final B3JointInfo ELEMENT_FACTORY = B3JointInfo.create(-1L);

        /**
         * Creates a new {@code B3JointInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3JointInfo#SIZEOF}, and its mark will be undefined.
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
        protected B3JointInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code m_linkName} field. */
        @NativeType("char[1024]")
        public ByteBuffer m_linkName() { return B3JointInfo.nm_linkName(address()); }
        /** Decodes the null-terminated string stored in the {@code m_linkName} field. */
        @NativeType("char[1024]")
        public String m_linkNameString() { return B3JointInfo.nm_linkNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code m_jointName} field. */
        @NativeType("char[1024]")
        public ByteBuffer m_jointName() { return B3JointInfo.nm_jointName(address()); }
        /** Decodes the null-terminated string stored in the {@code m_jointName} field. */
        @NativeType("char[1024]")
        public String m_jointNameString() { return B3JointInfo.nm_jointNameString(address()); }
        /** Returns the value of the {@code m_jointType} field. */
        public int m_jointType() { return B3JointInfo.nm_jointType(address()); }
        /** Returns the value of the {@code m_qIndex} field. */
        public int m_qIndex() { return B3JointInfo.nm_qIndex(address()); }
        /** Returns the value of the {@code m_uIndex} field. */
        public int m_uIndex() { return B3JointInfo.nm_uIndex(address()); }
        /** Returns the value of the {@code m_jointIndex} field. */
        public int m_jointIndex() { return B3JointInfo.nm_jointIndex(address()); }
        /** Returns the value of the {@code m_flags} field. */
        public int m_flags() { return B3JointInfo.nm_flags(address()); }
        /** Returns the value of the {@code m_jointDamping} field. */
        public double m_jointDamping() { return B3JointInfo.nm_jointDamping(address()); }
        /** Returns the value of the {@code m_jointFriction} field. */
        public double m_jointFriction() { return B3JointInfo.nm_jointFriction(address()); }
        /** Returns the value of the {@code m_jointLowerLimit} field. */
        public double m_jointLowerLimit() { return B3JointInfo.nm_jointLowerLimit(address()); }
        /** Returns the value of the {@code m_jointUpperLimit} field. */
        public double m_jointUpperLimit() { return B3JointInfo.nm_jointUpperLimit(address()); }
        /** Returns the value of the {@code m_jointMaxForce} field. */
        public double m_jointMaxForce() { return B3JointInfo.nm_jointMaxForce(address()); }
        /** Returns the value of the {@code m_jointMaxVelocity} field. */
        public double m_jointMaxVelocity() { return B3JointInfo.nm_jointMaxVelocity(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_parentFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_parentFrame() { return B3JointInfo.nm_parentFrame(address()); }
        /** Returns the value at the specified index of the {@code m_parentFrame} field. */
        public double m_parentFrame(int index) { return B3JointInfo.nm_parentFrame(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_childFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_childFrame() { return B3JointInfo.nm_childFrame(address()); }
        /** Returns the value at the specified index of the {@code m_childFrame} field. */
        public double m_childFrame(int index) { return B3JointInfo.nm_childFrame(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_jointAxis} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_jointAxis() { return B3JointInfo.nm_jointAxis(address()); }
        /** Returns the value at the specified index of the {@code m_jointAxis} field. */
        public double m_jointAxis(int index) { return B3JointInfo.nm_jointAxis(address(), index); }
        /** Returns the value of the {@code m_parentIndex} field. */
        public int m_parentIndex() { return B3JointInfo.nm_parentIndex(address()); }
        /** Returns the value of the {@code m_qSize} field. */
        public int m_qSize() { return B3JointInfo.nm_qSize(address()); }
        /** Returns the value of the {@code m_uSize} field. */
        public int m_uSize() { return B3JointInfo.nm_uSize(address()); }

        /** Copies the specified encoded string to the {@code m_linkName} field. */
        public B3JointInfo.Buffer m_linkName(@NativeType("char[1024]") ByteBuffer value) { B3JointInfo.nm_linkName(address(), value); return this; }
        /** Copies the specified encoded string to the {@code m_jointName} field. */
        public B3JointInfo.Buffer m_jointName(@NativeType("char[1024]") ByteBuffer value) { B3JointInfo.nm_jointName(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointType} field. */
        public B3JointInfo.Buffer m_jointType(int value) { B3JointInfo.nm_jointType(address(), value); return this; }
        /** Sets the specified value to the {@code m_qIndex} field. */
        public B3JointInfo.Buffer m_qIndex(int value) { B3JointInfo.nm_qIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_uIndex} field. */
        public B3JointInfo.Buffer m_uIndex(int value) { B3JointInfo.nm_uIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointIndex} field. */
        public B3JointInfo.Buffer m_jointIndex(int value) { B3JointInfo.nm_jointIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_flags} field. */
        public B3JointInfo.Buffer m_flags(int value) { B3JointInfo.nm_flags(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointDamping} field. */
        public B3JointInfo.Buffer m_jointDamping(double value) { B3JointInfo.nm_jointDamping(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointFriction} field. */
        public B3JointInfo.Buffer m_jointFriction(double value) { B3JointInfo.nm_jointFriction(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointLowerLimit} field. */
        public B3JointInfo.Buffer m_jointLowerLimit(double value) { B3JointInfo.nm_jointLowerLimit(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointUpperLimit} field. */
        public B3JointInfo.Buffer m_jointUpperLimit(double value) { B3JointInfo.nm_jointUpperLimit(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointMaxForce} field. */
        public B3JointInfo.Buffer m_jointMaxForce(double value) { B3JointInfo.nm_jointMaxForce(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointMaxVelocity} field. */
        public B3JointInfo.Buffer m_jointMaxVelocity(double value) { B3JointInfo.nm_jointMaxVelocity(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_parentFrame} field. */
        public B3JointInfo.Buffer m_parentFrame(@NativeType("double[7]") DoubleBuffer value) { B3JointInfo.nm_parentFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_parentFrame} field. */
        public B3JointInfo.Buffer m_parentFrame(int index, double value) { B3JointInfo.nm_parentFrame(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_childFrame} field. */
        public B3JointInfo.Buffer m_childFrame(@NativeType("double[7]") DoubleBuffer value) { B3JointInfo.nm_childFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_childFrame} field. */
        public B3JointInfo.Buffer m_childFrame(int index, double value) { B3JointInfo.nm_childFrame(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_jointAxis} field. */
        public B3JointInfo.Buffer m_jointAxis(@NativeType("double[3]") DoubleBuffer value) { B3JointInfo.nm_jointAxis(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_jointAxis} field. */
        public B3JointInfo.Buffer m_jointAxis(int index, double value) { B3JointInfo.nm_jointAxis(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_parentIndex} field. */
        public B3JointInfo.Buffer m_parentIndex(int value) { B3JointInfo.nm_parentIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_qSize} field. */
        public B3JointInfo.Buffer m_qSize(int value) { B3JointInfo.nm_qSize(address(), value); return this; }
        /** Sets the specified value to the {@code m_uSize} field. */
        public B3JointInfo.Buffer m_uSize(int value) { B3JointInfo.nm_uSize(address(), value); return this; }

    }

}