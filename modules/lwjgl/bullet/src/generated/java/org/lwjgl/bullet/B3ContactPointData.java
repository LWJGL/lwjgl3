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
 * struct b3ContactPointData {
 *     int m_contactFlags;
 *     int m_bodyUniqueIdA;
 *     int m_bodyUniqueIdB;
 *     int m_linkIndexA;
 *     int m_linkIndexB;
 *     double m_positionOnAInWS[3];
 *     double m_positionOnBInWS[3];
 *     double m_contactNormalOnBInWS[3];
 *     double m_contactDistance;
 *     double m_normalForce;
 *     double m_linearFrictionForce1;
 *     double m_linearFrictionForce2;
 *     double m_linearFrictionDirection1[3];
 *     double m_linearFrictionDirection2[3];
 * }</code></pre>
 */
@NativeType("struct b3ContactPointData")
public class B3ContactPointData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_CONTACTFLAGS,
        M_BODYUNIQUEIDA,
        M_BODYUNIQUEIDB,
        M_LINKINDEXA,
        M_LINKINDEXB,
        M_POSITIONONAINWS,
        M_POSITIONONBINWS,
        M_CONTACTNORMALONBINWS,
        M_CONTACTDISTANCE,
        M_NORMALFORCE,
        M_LINEARFRICTIONFORCE1,
        M_LINEARFRICTIONFORCE2,
        M_LINEARFRICTIONDIRECTION1,
        M_LINEARFRICTIONDIRECTION2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(8, 3),
            __array(8, 3),
            __array(8, 3),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __array(8, 3),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_CONTACTFLAGS = layout.offsetof(0);
        M_BODYUNIQUEIDA = layout.offsetof(1);
        M_BODYUNIQUEIDB = layout.offsetof(2);
        M_LINKINDEXA = layout.offsetof(3);
        M_LINKINDEXB = layout.offsetof(4);
        M_POSITIONONAINWS = layout.offsetof(5);
        M_POSITIONONBINWS = layout.offsetof(6);
        M_CONTACTNORMALONBINWS = layout.offsetof(7);
        M_CONTACTDISTANCE = layout.offsetof(8);
        M_NORMALFORCE = layout.offsetof(9);
        M_LINEARFRICTIONFORCE1 = layout.offsetof(10);
        M_LINEARFRICTIONFORCE2 = layout.offsetof(11);
        M_LINEARFRICTIONDIRECTION1 = layout.offsetof(12);
        M_LINEARFRICTIONDIRECTION2 = layout.offsetof(13);
    }

    /**
     * Creates a {@code B3ContactPointData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3ContactPointData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_contactFlags} field. */
    public int m_contactFlags() { return nm_contactFlags(address()); }
    /** Returns the value of the {@code m_bodyUniqueIdA} field. */
    public int m_bodyUniqueIdA() { return nm_bodyUniqueIdA(address()); }
    /** Returns the value of the {@code m_bodyUniqueIdB} field. */
    public int m_bodyUniqueIdB() { return nm_bodyUniqueIdB(address()); }
    /** Returns the value of the {@code m_linkIndexA} field. */
    public int m_linkIndexA() { return nm_linkIndexA(address()); }
    /** Returns the value of the {@code m_linkIndexB} field. */
    public int m_linkIndexB() { return nm_linkIndexB(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_positionOnAInWS} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_positionOnAInWS() { return nm_positionOnAInWS(address()); }
    /** Returns the value at the specified index of the {@code m_positionOnAInWS} field. */
    public double m_positionOnAInWS(int index) { return nm_positionOnAInWS(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_positionOnBInWS} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_positionOnBInWS() { return nm_positionOnBInWS(address()); }
    /** Returns the value at the specified index of the {@code m_positionOnBInWS} field. */
    public double m_positionOnBInWS(int index) { return nm_positionOnBInWS(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_contactNormalOnBInWS} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_contactNormalOnBInWS() { return nm_contactNormalOnBInWS(address()); }
    /** Returns the value at the specified index of the {@code m_contactNormalOnBInWS} field. */
    public double m_contactNormalOnBInWS(int index) { return nm_contactNormalOnBInWS(address(), index); }
    /** Returns the value of the {@code m_contactDistance} field. */
    public double m_contactDistance() { return nm_contactDistance(address()); }
    /** Returns the value of the {@code m_normalForce} field. */
    public double m_normalForce() { return nm_normalForce(address()); }
    /** Returns the value of the {@code m_linearFrictionForce1} field. */
    public double m_linearFrictionForce1() { return nm_linearFrictionForce1(address()); }
    /** Returns the value of the {@code m_linearFrictionForce2} field. */
    public double m_linearFrictionForce2() { return nm_linearFrictionForce2(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_linearFrictionDirection1} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_linearFrictionDirection1() { return nm_linearFrictionDirection1(address()); }
    /** Returns the value at the specified index of the {@code m_linearFrictionDirection1} field. */
    public double m_linearFrictionDirection1(int index) { return nm_linearFrictionDirection1(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_linearFrictionDirection2} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_linearFrictionDirection2() { return nm_linearFrictionDirection2(address()); }
    /** Returns the value at the specified index of the {@code m_linearFrictionDirection2} field. */
    public double m_linearFrictionDirection2(int index) { return nm_linearFrictionDirection2(address(), index); }

    /** Sets the specified value to the {@code m_contactFlags} field. */
    public B3ContactPointData m_contactFlags(int value) { nm_contactFlags(address(), value); return this; }
    /** Sets the specified value to the {@code m_bodyUniqueIdA} field. */
    public B3ContactPointData m_bodyUniqueIdA(int value) { nm_bodyUniqueIdA(address(), value); return this; }
    /** Sets the specified value to the {@code m_bodyUniqueIdB} field. */
    public B3ContactPointData m_bodyUniqueIdB(int value) { nm_bodyUniqueIdB(address(), value); return this; }
    /** Sets the specified value to the {@code m_linkIndexA} field. */
    public B3ContactPointData m_linkIndexA(int value) { nm_linkIndexA(address(), value); return this; }
    /** Sets the specified value to the {@code m_linkIndexB} field. */
    public B3ContactPointData m_linkIndexB(int value) { nm_linkIndexB(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_positionOnAInWS} field. */
    public B3ContactPointData m_positionOnAInWS(@NativeType("double[3]") DoubleBuffer value) { nm_positionOnAInWS(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_positionOnAInWS} field. */
    public B3ContactPointData m_positionOnAInWS(int index, double value) { nm_positionOnAInWS(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_positionOnBInWS} field. */
    public B3ContactPointData m_positionOnBInWS(@NativeType("double[3]") DoubleBuffer value) { nm_positionOnBInWS(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_positionOnBInWS} field. */
    public B3ContactPointData m_positionOnBInWS(int index, double value) { nm_positionOnBInWS(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_contactNormalOnBInWS} field. */
    public B3ContactPointData m_contactNormalOnBInWS(@NativeType("double[3]") DoubleBuffer value) { nm_contactNormalOnBInWS(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_contactNormalOnBInWS} field. */
    public B3ContactPointData m_contactNormalOnBInWS(int index, double value) { nm_contactNormalOnBInWS(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_contactDistance} field. */
    public B3ContactPointData m_contactDistance(double value) { nm_contactDistance(address(), value); return this; }
    /** Sets the specified value to the {@code m_normalForce} field. */
    public B3ContactPointData m_normalForce(double value) { nm_normalForce(address(), value); return this; }
    /** Sets the specified value to the {@code m_linearFrictionForce1} field. */
    public B3ContactPointData m_linearFrictionForce1(double value) { nm_linearFrictionForce1(address(), value); return this; }
    /** Sets the specified value to the {@code m_linearFrictionForce2} field. */
    public B3ContactPointData m_linearFrictionForce2(double value) { nm_linearFrictionForce2(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_linearFrictionDirection1} field. */
    public B3ContactPointData m_linearFrictionDirection1(@NativeType("double[3]") DoubleBuffer value) { nm_linearFrictionDirection1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_linearFrictionDirection1} field. */
    public B3ContactPointData m_linearFrictionDirection1(int index, double value) { nm_linearFrictionDirection1(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_linearFrictionDirection2} field. */
    public B3ContactPointData m_linearFrictionDirection2(@NativeType("double[3]") DoubleBuffer value) { nm_linearFrictionDirection2(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_linearFrictionDirection2} field. */
    public B3ContactPointData m_linearFrictionDirection2(int index, double value) { nm_linearFrictionDirection2(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public B3ContactPointData set(
        int m_contactFlags,
        int m_bodyUniqueIdA,
        int m_bodyUniqueIdB,
        int m_linkIndexA,
        int m_linkIndexB,
        DoubleBuffer m_positionOnAInWS,
        DoubleBuffer m_positionOnBInWS,
        DoubleBuffer m_contactNormalOnBInWS,
        double m_contactDistance,
        double m_normalForce,
        double m_linearFrictionForce1,
        double m_linearFrictionForce2,
        DoubleBuffer m_linearFrictionDirection1,
        DoubleBuffer m_linearFrictionDirection2
    ) {
        m_contactFlags(m_contactFlags);
        m_bodyUniqueIdA(m_bodyUniqueIdA);
        m_bodyUniqueIdB(m_bodyUniqueIdB);
        m_linkIndexA(m_linkIndexA);
        m_linkIndexB(m_linkIndexB);
        m_positionOnAInWS(m_positionOnAInWS);
        m_positionOnBInWS(m_positionOnBInWS);
        m_contactNormalOnBInWS(m_contactNormalOnBInWS);
        m_contactDistance(m_contactDistance);
        m_normalForce(m_normalForce);
        m_linearFrictionForce1(m_linearFrictionForce1);
        m_linearFrictionForce2(m_linearFrictionForce2);
        m_linearFrictionDirection1(m_linearFrictionDirection1);
        m_linearFrictionDirection2(m_linearFrictionDirection2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3ContactPointData set(B3ContactPointData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3ContactPointData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3ContactPointData malloc() {
        return wrap(B3ContactPointData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3ContactPointData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3ContactPointData calloc() {
        return wrap(B3ContactPointData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3ContactPointData} instance allocated with {@link BufferUtils}. */
    public static B3ContactPointData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3ContactPointData.class, memAddress(container), container);
    }

    /** Returns a new {@code B3ContactPointData} instance for the specified memory address. */
    public static B3ContactPointData create(long address) {
        return wrap(B3ContactPointData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3ContactPointData createSafe(long address) {
        return address == NULL ? null : wrap(B3ContactPointData.class, address);
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3ContactPointData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3ContactPointData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3ContactPointData} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3ContactPointData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3ContactPointData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3ContactPointData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3ContactPointData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3ContactPointData mallocStack(MemoryStack stack) {
        return wrap(B3ContactPointData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3ContactPointData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3ContactPointData callocStack(MemoryStack stack) {
        return wrap(B3ContactPointData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3ContactPointData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3ContactPointData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_contactFlags}. */
    public static int nm_contactFlags(long struct) { return UNSAFE.getInt(null, struct + B3ContactPointData.M_CONTACTFLAGS); }
    /** Unsafe version of {@link #m_bodyUniqueIdA}. */
    public static int nm_bodyUniqueIdA(long struct) { return UNSAFE.getInt(null, struct + B3ContactPointData.M_BODYUNIQUEIDA); }
    /** Unsafe version of {@link #m_bodyUniqueIdB}. */
    public static int nm_bodyUniqueIdB(long struct) { return UNSAFE.getInt(null, struct + B3ContactPointData.M_BODYUNIQUEIDB); }
    /** Unsafe version of {@link #m_linkIndexA}. */
    public static int nm_linkIndexA(long struct) { return UNSAFE.getInt(null, struct + B3ContactPointData.M_LINKINDEXA); }
    /** Unsafe version of {@link #m_linkIndexB}. */
    public static int nm_linkIndexB(long struct) { return UNSAFE.getInt(null, struct + B3ContactPointData.M_LINKINDEXB); }
    /** Unsafe version of {@link #m_positionOnAInWS}. */
    public static DoubleBuffer nm_positionOnAInWS(long struct) { return memDoubleBuffer(struct + B3ContactPointData.M_POSITIONONAINWS, 3); }
    /** Unsafe version of {@link #m_positionOnAInWS(int) m_positionOnAInWS}. */
    public static double nm_positionOnAInWS(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3ContactPointData.M_POSITIONONAINWS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_positionOnBInWS}. */
    public static DoubleBuffer nm_positionOnBInWS(long struct) { return memDoubleBuffer(struct + B3ContactPointData.M_POSITIONONBINWS, 3); }
    /** Unsafe version of {@link #m_positionOnBInWS(int) m_positionOnBInWS}. */
    public static double nm_positionOnBInWS(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3ContactPointData.M_POSITIONONBINWS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_contactNormalOnBInWS}. */
    public static DoubleBuffer nm_contactNormalOnBInWS(long struct) { return memDoubleBuffer(struct + B3ContactPointData.M_CONTACTNORMALONBINWS, 3); }
    /** Unsafe version of {@link #m_contactNormalOnBInWS(int) m_contactNormalOnBInWS}. */
    public static double nm_contactNormalOnBInWS(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3ContactPointData.M_CONTACTNORMALONBINWS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_contactDistance}. */
    public static double nm_contactDistance(long struct) { return UNSAFE.getDouble(null, struct + B3ContactPointData.M_CONTACTDISTANCE); }
    /** Unsafe version of {@link #m_normalForce}. */
    public static double nm_normalForce(long struct) { return UNSAFE.getDouble(null, struct + B3ContactPointData.M_NORMALFORCE); }
    /** Unsafe version of {@link #m_linearFrictionForce1}. */
    public static double nm_linearFrictionForce1(long struct) { return UNSAFE.getDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONFORCE1); }
    /** Unsafe version of {@link #m_linearFrictionForce2}. */
    public static double nm_linearFrictionForce2(long struct) { return UNSAFE.getDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONFORCE2); }
    /** Unsafe version of {@link #m_linearFrictionDirection1}. */
    public static DoubleBuffer nm_linearFrictionDirection1(long struct) { return memDoubleBuffer(struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION1, 3); }
    /** Unsafe version of {@link #m_linearFrictionDirection1(int) m_linearFrictionDirection1}. */
    public static double nm_linearFrictionDirection1(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION1 + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_linearFrictionDirection2}. */
    public static DoubleBuffer nm_linearFrictionDirection2(long struct) { return memDoubleBuffer(struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION2, 3); }
    /** Unsafe version of {@link #m_linearFrictionDirection2(int) m_linearFrictionDirection2}. */
    public static double nm_linearFrictionDirection2(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION2 + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #m_contactFlags(int) m_contactFlags}. */
    public static void nm_contactFlags(long struct, int value) { UNSAFE.putInt(null, struct + B3ContactPointData.M_CONTACTFLAGS, value); }
    /** Unsafe version of {@link #m_bodyUniqueIdA(int) m_bodyUniqueIdA}. */
    public static void nm_bodyUniqueIdA(long struct, int value) { UNSAFE.putInt(null, struct + B3ContactPointData.M_BODYUNIQUEIDA, value); }
    /** Unsafe version of {@link #m_bodyUniqueIdB(int) m_bodyUniqueIdB}. */
    public static void nm_bodyUniqueIdB(long struct, int value) { UNSAFE.putInt(null, struct + B3ContactPointData.M_BODYUNIQUEIDB, value); }
    /** Unsafe version of {@link #m_linkIndexA(int) m_linkIndexA}. */
    public static void nm_linkIndexA(long struct, int value) { UNSAFE.putInt(null, struct + B3ContactPointData.M_LINKINDEXA, value); }
    /** Unsafe version of {@link #m_linkIndexB(int) m_linkIndexB}. */
    public static void nm_linkIndexB(long struct, int value) { UNSAFE.putInt(null, struct + B3ContactPointData.M_LINKINDEXB, value); }
    /** Unsafe version of {@link #m_positionOnAInWS(DoubleBuffer) m_positionOnAInWS}. */
    public static void nm_positionOnAInWS(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3ContactPointData.M_POSITIONONAINWS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_positionOnAInWS(int, double) m_positionOnAInWS}. */
    public static void nm_positionOnAInWS(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3ContactPointData.M_POSITIONONAINWS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_positionOnBInWS(DoubleBuffer) m_positionOnBInWS}. */
    public static void nm_positionOnBInWS(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3ContactPointData.M_POSITIONONBINWS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_positionOnBInWS(int, double) m_positionOnBInWS}. */
    public static void nm_positionOnBInWS(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3ContactPointData.M_POSITIONONBINWS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_contactNormalOnBInWS(DoubleBuffer) m_contactNormalOnBInWS}. */
    public static void nm_contactNormalOnBInWS(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3ContactPointData.M_CONTACTNORMALONBINWS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_contactNormalOnBInWS(int, double) m_contactNormalOnBInWS}. */
    public static void nm_contactNormalOnBInWS(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3ContactPointData.M_CONTACTNORMALONBINWS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_contactDistance(double) m_contactDistance}. */
    public static void nm_contactDistance(long struct, double value) { UNSAFE.putDouble(null, struct + B3ContactPointData.M_CONTACTDISTANCE, value); }
    /** Unsafe version of {@link #m_normalForce(double) m_normalForce}. */
    public static void nm_normalForce(long struct, double value) { UNSAFE.putDouble(null, struct + B3ContactPointData.M_NORMALFORCE, value); }
    /** Unsafe version of {@link #m_linearFrictionForce1(double) m_linearFrictionForce1}. */
    public static void nm_linearFrictionForce1(long struct, double value) { UNSAFE.putDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONFORCE1, value); }
    /** Unsafe version of {@link #m_linearFrictionForce2(double) m_linearFrictionForce2}. */
    public static void nm_linearFrictionForce2(long struct, double value) { UNSAFE.putDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONFORCE2, value); }
    /** Unsafe version of {@link #m_linearFrictionDirection1(DoubleBuffer) m_linearFrictionDirection1}. */
    public static void nm_linearFrictionDirection1(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION1, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_linearFrictionDirection1(int, double) m_linearFrictionDirection1}. */
    public static void nm_linearFrictionDirection1(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION1 + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_linearFrictionDirection2(DoubleBuffer) m_linearFrictionDirection2}. */
    public static void nm_linearFrictionDirection2(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION2, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_linearFrictionDirection2(int, double) m_linearFrictionDirection2}. */
    public static void nm_linearFrictionDirection2(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3ContactPointData.M_LINEARFRICTIONDIRECTION2 + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link B3ContactPointData} structs. */
    public static class Buffer extends StructBuffer<B3ContactPointData, Buffer> implements NativeResource {

        private static final B3ContactPointData ELEMENT_FACTORY = B3ContactPointData.create(-1L);

        /**
         * Creates a new {@code B3ContactPointData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3ContactPointData#SIZEOF}, and its mark will be undefined.
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
        protected B3ContactPointData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_contactFlags} field. */
        public int m_contactFlags() { return B3ContactPointData.nm_contactFlags(address()); }
        /** Returns the value of the {@code m_bodyUniqueIdA} field. */
        public int m_bodyUniqueIdA() { return B3ContactPointData.nm_bodyUniqueIdA(address()); }
        /** Returns the value of the {@code m_bodyUniqueIdB} field. */
        public int m_bodyUniqueIdB() { return B3ContactPointData.nm_bodyUniqueIdB(address()); }
        /** Returns the value of the {@code m_linkIndexA} field. */
        public int m_linkIndexA() { return B3ContactPointData.nm_linkIndexA(address()); }
        /** Returns the value of the {@code m_linkIndexB} field. */
        public int m_linkIndexB() { return B3ContactPointData.nm_linkIndexB(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_positionOnAInWS} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_positionOnAInWS() { return B3ContactPointData.nm_positionOnAInWS(address()); }
        /** Returns the value at the specified index of the {@code m_positionOnAInWS} field. */
        public double m_positionOnAInWS(int index) { return B3ContactPointData.nm_positionOnAInWS(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_positionOnBInWS} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_positionOnBInWS() { return B3ContactPointData.nm_positionOnBInWS(address()); }
        /** Returns the value at the specified index of the {@code m_positionOnBInWS} field. */
        public double m_positionOnBInWS(int index) { return B3ContactPointData.nm_positionOnBInWS(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_contactNormalOnBInWS} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_contactNormalOnBInWS() { return B3ContactPointData.nm_contactNormalOnBInWS(address()); }
        /** Returns the value at the specified index of the {@code m_contactNormalOnBInWS} field. */
        public double m_contactNormalOnBInWS(int index) { return B3ContactPointData.nm_contactNormalOnBInWS(address(), index); }
        /** Returns the value of the {@code m_contactDistance} field. */
        public double m_contactDistance() { return B3ContactPointData.nm_contactDistance(address()); }
        /** Returns the value of the {@code m_normalForce} field. */
        public double m_normalForce() { return B3ContactPointData.nm_normalForce(address()); }
        /** Returns the value of the {@code m_linearFrictionForce1} field. */
        public double m_linearFrictionForce1() { return B3ContactPointData.nm_linearFrictionForce1(address()); }
        /** Returns the value of the {@code m_linearFrictionForce2} field. */
        public double m_linearFrictionForce2() { return B3ContactPointData.nm_linearFrictionForce2(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_linearFrictionDirection1} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_linearFrictionDirection1() { return B3ContactPointData.nm_linearFrictionDirection1(address()); }
        /** Returns the value at the specified index of the {@code m_linearFrictionDirection1} field. */
        public double m_linearFrictionDirection1(int index) { return B3ContactPointData.nm_linearFrictionDirection1(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_linearFrictionDirection2} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_linearFrictionDirection2() { return B3ContactPointData.nm_linearFrictionDirection2(address()); }
        /** Returns the value at the specified index of the {@code m_linearFrictionDirection2} field. */
        public double m_linearFrictionDirection2(int index) { return B3ContactPointData.nm_linearFrictionDirection2(address(), index); }

        /** Sets the specified value to the {@code m_contactFlags} field. */
        public B3ContactPointData.Buffer m_contactFlags(int value) { B3ContactPointData.nm_contactFlags(address(), value); return this; }
        /** Sets the specified value to the {@code m_bodyUniqueIdA} field. */
        public B3ContactPointData.Buffer m_bodyUniqueIdA(int value) { B3ContactPointData.nm_bodyUniqueIdA(address(), value); return this; }
        /** Sets the specified value to the {@code m_bodyUniqueIdB} field. */
        public B3ContactPointData.Buffer m_bodyUniqueIdB(int value) { B3ContactPointData.nm_bodyUniqueIdB(address(), value); return this; }
        /** Sets the specified value to the {@code m_linkIndexA} field. */
        public B3ContactPointData.Buffer m_linkIndexA(int value) { B3ContactPointData.nm_linkIndexA(address(), value); return this; }
        /** Sets the specified value to the {@code m_linkIndexB} field. */
        public B3ContactPointData.Buffer m_linkIndexB(int value) { B3ContactPointData.nm_linkIndexB(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_positionOnAInWS} field. */
        public B3ContactPointData.Buffer m_positionOnAInWS(@NativeType("double[3]") DoubleBuffer value) { B3ContactPointData.nm_positionOnAInWS(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_positionOnAInWS} field. */
        public B3ContactPointData.Buffer m_positionOnAInWS(int index, double value) { B3ContactPointData.nm_positionOnAInWS(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_positionOnBInWS} field. */
        public B3ContactPointData.Buffer m_positionOnBInWS(@NativeType("double[3]") DoubleBuffer value) { B3ContactPointData.nm_positionOnBInWS(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_positionOnBInWS} field. */
        public B3ContactPointData.Buffer m_positionOnBInWS(int index, double value) { B3ContactPointData.nm_positionOnBInWS(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_contactNormalOnBInWS} field. */
        public B3ContactPointData.Buffer m_contactNormalOnBInWS(@NativeType("double[3]") DoubleBuffer value) { B3ContactPointData.nm_contactNormalOnBInWS(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_contactNormalOnBInWS} field. */
        public B3ContactPointData.Buffer m_contactNormalOnBInWS(int index, double value) { B3ContactPointData.nm_contactNormalOnBInWS(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_contactDistance} field. */
        public B3ContactPointData.Buffer m_contactDistance(double value) { B3ContactPointData.nm_contactDistance(address(), value); return this; }
        /** Sets the specified value to the {@code m_normalForce} field. */
        public B3ContactPointData.Buffer m_normalForce(double value) { B3ContactPointData.nm_normalForce(address(), value); return this; }
        /** Sets the specified value to the {@code m_linearFrictionForce1} field. */
        public B3ContactPointData.Buffer m_linearFrictionForce1(double value) { B3ContactPointData.nm_linearFrictionForce1(address(), value); return this; }
        /** Sets the specified value to the {@code m_linearFrictionForce2} field. */
        public B3ContactPointData.Buffer m_linearFrictionForce2(double value) { B3ContactPointData.nm_linearFrictionForce2(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_linearFrictionDirection1} field. */
        public B3ContactPointData.Buffer m_linearFrictionDirection1(@NativeType("double[3]") DoubleBuffer value) { B3ContactPointData.nm_linearFrictionDirection1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_linearFrictionDirection1} field. */
        public B3ContactPointData.Buffer m_linearFrictionDirection1(int index, double value) { B3ContactPointData.nm_linearFrictionDirection1(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_linearFrictionDirection2} field. */
        public B3ContactPointData.Buffer m_linearFrictionDirection2(@NativeType("double[3]") DoubleBuffer value) { B3ContactPointData.nm_linearFrictionDirection2(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_linearFrictionDirection2} field. */
        public B3ContactPointData.Buffer m_linearFrictionDirection2(int index, double value) { B3ContactPointData.nm_linearFrictionDirection2(address(), index, value); return this; }

    }

}