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
 * struct b3RayHitInfo {
 *     double m_hitFraction;
 *     int m_hitObjectUniqueId;
 *     int m_hitObjectLinkIndex;
 *     double m_hitPositionWorld[3];
 *     double m_hitNormalWorld[3];
 * }</code></pre>
 */
@NativeType("struct b3RayHitInfo")
public class B3RayHitInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_HITFRACTION,
        M_HITOBJECTUNIQUEID,
        M_HITOBJECTLINKINDEX,
        M_HITPOSITIONWORLD,
        M_HITNORMALWORLD;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __array(8, 3),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_HITFRACTION = layout.offsetof(0);
        M_HITOBJECTUNIQUEID = layout.offsetof(1);
        M_HITOBJECTLINKINDEX = layout.offsetof(2);
        M_HITPOSITIONWORLD = layout.offsetof(3);
        M_HITNORMALWORLD = layout.offsetof(4);
    }

    /**
     * Creates a {@code B3RayHitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3RayHitInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_hitFraction} field. */
    public double m_hitFraction() { return nm_hitFraction(address()); }
    /** Returns the value of the {@code m_hitObjectUniqueId} field. */
    public int m_hitObjectUniqueId() { return nm_hitObjectUniqueId(address()); }
    /** Returns the value of the {@code m_hitObjectLinkIndex} field. */
    public int m_hitObjectLinkIndex() { return nm_hitObjectLinkIndex(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_hitPositionWorld} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_hitPositionWorld() { return nm_hitPositionWorld(address()); }
    /** Returns the value at the specified index of the {@code m_hitPositionWorld} field. */
    public double m_hitPositionWorld(int index) { return nm_hitPositionWorld(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_hitNormalWorld} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_hitNormalWorld() { return nm_hitNormalWorld(address()); }
    /** Returns the value at the specified index of the {@code m_hitNormalWorld} field. */
    public double m_hitNormalWorld(int index) { return nm_hitNormalWorld(address(), index); }

    /** Sets the specified value to the {@code m_hitFraction} field. */
    public B3RayHitInfo m_hitFraction(double value) { nm_hitFraction(address(), value); return this; }
    /** Sets the specified value to the {@code m_hitObjectUniqueId} field. */
    public B3RayHitInfo m_hitObjectUniqueId(int value) { nm_hitObjectUniqueId(address(), value); return this; }
    /** Sets the specified value to the {@code m_hitObjectLinkIndex} field. */
    public B3RayHitInfo m_hitObjectLinkIndex(int value) { nm_hitObjectLinkIndex(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_hitPositionWorld} field. */
    public B3RayHitInfo m_hitPositionWorld(@NativeType("double[3]") DoubleBuffer value) { nm_hitPositionWorld(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_hitPositionWorld} field. */
    public B3RayHitInfo m_hitPositionWorld(int index, double value) { nm_hitPositionWorld(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_hitNormalWorld} field. */
    public B3RayHitInfo m_hitNormalWorld(@NativeType("double[3]") DoubleBuffer value) { nm_hitNormalWorld(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_hitNormalWorld} field. */
    public B3RayHitInfo m_hitNormalWorld(int index, double value) { nm_hitNormalWorld(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public B3RayHitInfo set(
        double m_hitFraction,
        int m_hitObjectUniqueId,
        int m_hitObjectLinkIndex,
        DoubleBuffer m_hitPositionWorld,
        DoubleBuffer m_hitNormalWorld
    ) {
        m_hitFraction(m_hitFraction);
        m_hitObjectUniqueId(m_hitObjectUniqueId);
        m_hitObjectLinkIndex(m_hitObjectLinkIndex);
        m_hitPositionWorld(m_hitPositionWorld);
        m_hitNormalWorld(m_hitNormalWorld);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3RayHitInfo set(B3RayHitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3RayHitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3RayHitInfo malloc() {
        return wrap(B3RayHitInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3RayHitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3RayHitInfo calloc() {
        return wrap(B3RayHitInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3RayHitInfo} instance allocated with {@link BufferUtils}. */
    public static B3RayHitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3RayHitInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code B3RayHitInfo} instance for the specified memory address. */
    public static B3RayHitInfo create(long address) {
        return wrap(B3RayHitInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3RayHitInfo createSafe(long address) {
        return address == NULL ? null : wrap(B3RayHitInfo.class, address);
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3RayHitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3RayHitInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3RayHitInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3RayHitInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3RayHitInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3RayHitInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3RayHitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3RayHitInfo mallocStack(MemoryStack stack) {
        return wrap(B3RayHitInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3RayHitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3RayHitInfo callocStack(MemoryStack stack) {
        return wrap(B3RayHitInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3RayHitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3RayHitInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_hitFraction}. */
    public static double nm_hitFraction(long struct) { return UNSAFE.getDouble(null, struct + B3RayHitInfo.M_HITFRACTION); }
    /** Unsafe version of {@link #m_hitObjectUniqueId}. */
    public static int nm_hitObjectUniqueId(long struct) { return UNSAFE.getInt(null, struct + B3RayHitInfo.M_HITOBJECTUNIQUEID); }
    /** Unsafe version of {@link #m_hitObjectLinkIndex}. */
    public static int nm_hitObjectLinkIndex(long struct) { return UNSAFE.getInt(null, struct + B3RayHitInfo.M_HITOBJECTLINKINDEX); }
    /** Unsafe version of {@link #m_hitPositionWorld}. */
    public static DoubleBuffer nm_hitPositionWorld(long struct) { return memDoubleBuffer(struct + B3RayHitInfo.M_HITPOSITIONWORLD, 3); }
    /** Unsafe version of {@link #m_hitPositionWorld(int) m_hitPositionWorld}. */
    public static double nm_hitPositionWorld(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3RayHitInfo.M_HITPOSITIONWORLD + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_hitNormalWorld}. */
    public static DoubleBuffer nm_hitNormalWorld(long struct) { return memDoubleBuffer(struct + B3RayHitInfo.M_HITNORMALWORLD, 3); }
    /** Unsafe version of {@link #m_hitNormalWorld(int) m_hitNormalWorld}. */
    public static double nm_hitNormalWorld(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3RayHitInfo.M_HITNORMALWORLD + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #m_hitFraction(double) m_hitFraction}. */
    public static void nm_hitFraction(long struct, double value) { UNSAFE.putDouble(null, struct + B3RayHitInfo.M_HITFRACTION, value); }
    /** Unsafe version of {@link #m_hitObjectUniqueId(int) m_hitObjectUniqueId}. */
    public static void nm_hitObjectUniqueId(long struct, int value) { UNSAFE.putInt(null, struct + B3RayHitInfo.M_HITOBJECTUNIQUEID, value); }
    /** Unsafe version of {@link #m_hitObjectLinkIndex(int) m_hitObjectLinkIndex}. */
    public static void nm_hitObjectLinkIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3RayHitInfo.M_HITOBJECTLINKINDEX, value); }
    /** Unsafe version of {@link #m_hitPositionWorld(DoubleBuffer) m_hitPositionWorld}. */
    public static void nm_hitPositionWorld(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3RayHitInfo.M_HITPOSITIONWORLD, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_hitPositionWorld(int, double) m_hitPositionWorld}. */
    public static void nm_hitPositionWorld(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3RayHitInfo.M_HITPOSITIONWORLD + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_hitNormalWorld(DoubleBuffer) m_hitNormalWorld}. */
    public static void nm_hitNormalWorld(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3RayHitInfo.M_HITNORMALWORLD, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_hitNormalWorld(int, double) m_hitNormalWorld}. */
    public static void nm_hitNormalWorld(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3RayHitInfo.M_HITNORMALWORLD + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link B3RayHitInfo} structs. */
    public static class Buffer extends StructBuffer<B3RayHitInfo, Buffer> implements NativeResource {

        private static final B3RayHitInfo ELEMENT_FACTORY = B3RayHitInfo.create(-1L);

        /**
         * Creates a new {@code B3RayHitInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3RayHitInfo#SIZEOF}, and its mark will be undefined.
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
        protected B3RayHitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_hitFraction} field. */
        public double m_hitFraction() { return B3RayHitInfo.nm_hitFraction(address()); }
        /** Returns the value of the {@code m_hitObjectUniqueId} field. */
        public int m_hitObjectUniqueId() { return B3RayHitInfo.nm_hitObjectUniqueId(address()); }
        /** Returns the value of the {@code m_hitObjectLinkIndex} field. */
        public int m_hitObjectLinkIndex() { return B3RayHitInfo.nm_hitObjectLinkIndex(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_hitPositionWorld} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_hitPositionWorld() { return B3RayHitInfo.nm_hitPositionWorld(address()); }
        /** Returns the value at the specified index of the {@code m_hitPositionWorld} field. */
        public double m_hitPositionWorld(int index) { return B3RayHitInfo.nm_hitPositionWorld(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_hitNormalWorld} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_hitNormalWorld() { return B3RayHitInfo.nm_hitNormalWorld(address()); }
        /** Returns the value at the specified index of the {@code m_hitNormalWorld} field. */
        public double m_hitNormalWorld(int index) { return B3RayHitInfo.nm_hitNormalWorld(address(), index); }

        /** Sets the specified value to the {@code m_hitFraction} field. */
        public B3RayHitInfo.Buffer m_hitFraction(double value) { B3RayHitInfo.nm_hitFraction(address(), value); return this; }
        /** Sets the specified value to the {@code m_hitObjectUniqueId} field. */
        public B3RayHitInfo.Buffer m_hitObjectUniqueId(int value) { B3RayHitInfo.nm_hitObjectUniqueId(address(), value); return this; }
        /** Sets the specified value to the {@code m_hitObjectLinkIndex} field. */
        public B3RayHitInfo.Buffer m_hitObjectLinkIndex(int value) { B3RayHitInfo.nm_hitObjectLinkIndex(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_hitPositionWorld} field. */
        public B3RayHitInfo.Buffer m_hitPositionWorld(@NativeType("double[3]") DoubleBuffer value) { B3RayHitInfo.nm_hitPositionWorld(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_hitPositionWorld} field. */
        public B3RayHitInfo.Buffer m_hitPositionWorld(int index, double value) { B3RayHitInfo.nm_hitPositionWorld(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_hitNormalWorld} field. */
        public B3RayHitInfo.Buffer m_hitNormalWorld(@NativeType("double[3]") DoubleBuffer value) { B3RayHitInfo.nm_hitNormalWorld(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_hitNormalWorld} field. */
        public B3RayHitInfo.Buffer m_hitNormalWorld(int index, double value) { B3RayHitInfo.nm_hitNormalWorld(address(), index, value); return this; }

    }

}