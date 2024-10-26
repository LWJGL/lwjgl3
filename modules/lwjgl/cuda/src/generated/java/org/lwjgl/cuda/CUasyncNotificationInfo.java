/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

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
 * struct CUasyncNotificationInfo {
 *     CUasyncNotificationType type;
 *     union {
 *         struct {
 *             unsigned long long bytesOverBudget;
 *         } overBudget;
 *     } info;
 * }</code></pre>
 */
public class CUasyncNotificationInfo extends Struct<CUasyncNotificationInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        INFO,
            INFO_OVERBUDGET,
                INFO_OVERBUDGET_BYTESOVERBUDGET;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __struct(
                    __member(8)
                )
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        INFO = layout.offsetof(1);
            INFO_OVERBUDGET = layout.offsetof(2);
                INFO_OVERBUDGET_BYTESOVERBUDGET = layout.offsetof(3);
    }

    protected CUasyncNotificationInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUasyncNotificationInfo create(long address, @Nullable ByteBuffer container) {
        return new CUasyncNotificationInfo(address, container);
    }

    /**
     * Creates a {@code CUasyncNotificationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUasyncNotificationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("CUasyncNotificationType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code info.overBudget.bytesOverBudget} field. */
    @NativeType("unsigned long long")
    public long info_overBudget_bytesOverBudget() { return ninfo_overBudget_bytesOverBudget(address()); }

    /** Sets the specified value to the {@code type} field. */
    public CUasyncNotificationInfo type(@NativeType("CUasyncNotificationType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code bytesOverBudget} field. */
    public CUasyncNotificationInfo info_overBudget_bytesOverBudget(@NativeType("unsigned long long") long value) { ninfo_overBudget_bytesOverBudget(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUasyncNotificationInfo set(CUasyncNotificationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUasyncNotificationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUasyncNotificationInfo malloc() {
        return new CUasyncNotificationInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUasyncNotificationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUasyncNotificationInfo calloc() {
        return new CUasyncNotificationInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUasyncNotificationInfo} instance allocated with {@link BufferUtils}. */
    public static CUasyncNotificationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUasyncNotificationInfo(memAddress(container), container);
    }

    /** Returns a new {@code CUasyncNotificationInfo} instance for the specified memory address. */
    public static CUasyncNotificationInfo create(long address) {
        return new CUasyncNotificationInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUasyncNotificationInfo createSafe(long address) {
        return address == NULL ? null : new CUasyncNotificationInfo(address, null);
    }

    /**
     * Returns a new {@link CUasyncNotificationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUasyncNotificationInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUasyncNotificationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUasyncNotificationInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUasyncNotificationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUasyncNotificationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUasyncNotificationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUasyncNotificationInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUasyncNotificationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUasyncNotificationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUasyncNotificationInfo malloc(MemoryStack stack) {
        return new CUasyncNotificationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUasyncNotificationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUasyncNotificationInfo calloc(MemoryStack stack) {
        return new CUasyncNotificationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUasyncNotificationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUasyncNotificationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUasyncNotificationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUasyncNotificationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + CUasyncNotificationInfo.TYPE); }
    /** Unsafe version of {@link #info_overBudget_bytesOverBudget}. */
    public static long ninfo_overBudget_bytesOverBudget(long struct) { return memGetLong(struct + CUasyncNotificationInfo.INFO_OVERBUDGET_BYTESOVERBUDGET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + CUasyncNotificationInfo.TYPE, value); }
    /** Unsafe version of {@link #info_overBudget_bytesOverBudget(long) info_overBudget_bytesOverBudget}. */
    public static void ninfo_overBudget_bytesOverBudget(long struct, long value) { memPutLong(struct + CUasyncNotificationInfo.INFO_OVERBUDGET_BYTESOVERBUDGET, value); }

    // -----------------------------------

    /** An array of {@link CUasyncNotificationInfo} structs. */
    public static class Buffer extends StructBuffer<CUasyncNotificationInfo, Buffer> implements NativeResource {

        private static final CUasyncNotificationInfo ELEMENT_FACTORY = CUasyncNotificationInfo.create(-1L);

        /**
         * Creates a new {@code CUasyncNotificationInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUasyncNotificationInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected CUasyncNotificationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("CUasyncNotificationType")
        public int type() { return CUasyncNotificationInfo.ntype(address()); }
        /** @return the value of the {@code info.overBudget.bytesOverBudget} field. */
        @NativeType("unsigned long long")
        public long info_overBudget_bytesOverBudget() { return CUasyncNotificationInfo.ninfo_overBudget_bytesOverBudget(address()); }

        /** Sets the specified value to the {@code type} field. */
        public CUasyncNotificationInfo.Buffer type(@NativeType("CUasyncNotificationType") int value) { CUasyncNotificationInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code bytesOverBudget} field. */
        public CUasyncNotificationInfo.Buffer info_overBudget_bytesOverBudget(@NativeType("unsigned long long") long value) { CUasyncNotificationInfo.ninfo_overBudget_bytesOverBudget(address(), value); return this; }

    }

}