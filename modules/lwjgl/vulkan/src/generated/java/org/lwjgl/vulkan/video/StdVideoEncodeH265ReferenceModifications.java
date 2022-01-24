/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

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
 * struct StdVideoEncodeH265ReferenceModifications {
 *     {@link StdVideoEncodeH265ReferenceModificationFlags StdVideoEncodeH265ReferenceModificationFlags} flags;
 *     uint8_t {@link #referenceList0ModificationsCount};
 *     uint8_t * {@link #pReferenceList0Modifications};
 *     uint8_t {@link #referenceList1ModificationsCount};
 *     uint8_t * {@link #pReferenceList1Modifications};
 * }</code></pre>
 */
public class StdVideoEncodeH265ReferenceModifications extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        REFERENCELIST0MODIFICATIONSCOUNT,
        PREFERENCELIST0MODIFICATIONS,
        REFERENCELIST1MODIFICATIONSCOUNT,
        PREFERENCELIST1MODIFICATIONS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265ReferenceModificationFlags.SIZEOF, StdVideoEncodeH265ReferenceModificationFlags.ALIGNOF),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        REFERENCELIST0MODIFICATIONSCOUNT = layout.offsetof(1);
        PREFERENCELIST0MODIFICATIONS = layout.offsetof(2);
        REFERENCELIST1MODIFICATIONSCOUNT = layout.offsetof(3);
        PREFERENCELIST1MODIFICATIONS = layout.offsetof(4);
    }

    /**
     * Creates a {@code StdVideoEncodeH265ReferenceModifications} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265ReferenceModifications(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH265ReferenceModificationFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265ReferenceModificationFlags flags() { return nflags(address()); }
    /** num_ref_idx_l0_active_minus1 */
    @NativeType("uint8_t")
    public byte referenceList0ModificationsCount() { return nreferenceList0ModificationsCount(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return list_entry_l0
     */
    @NativeType("uint8_t *")
    public ByteBuffer pReferenceList0Modifications(int capacity) { return npReferenceList0Modifications(address(), capacity); }
    /** num_ref_idx_l1_active_minus1 */
    @NativeType("uint8_t")
    public byte referenceList1ModificationsCount() { return nreferenceList1ModificationsCount(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return list_entry_l1
     */
    @NativeType("uint8_t *")
    public ByteBuffer pReferenceList1Modifications(int capacity) { return npReferenceList1Modifications(address(), capacity); }

    /** Copies the specified {@link StdVideoEncodeH265ReferenceModificationFlags} to the {@code flags} field. */
    public StdVideoEncodeH265ReferenceModifications flags(StdVideoEncodeH265ReferenceModificationFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265ReferenceModifications flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@link #referenceList0ModificationsCount} field. */
    public StdVideoEncodeH265ReferenceModifications referenceList0ModificationsCount(@NativeType("uint8_t") byte value) { nreferenceList0ModificationsCount(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pReferenceList0Modifications} field. */
    public StdVideoEncodeH265ReferenceModifications pReferenceList0Modifications(@NativeType("uint8_t *") ByteBuffer value) { npReferenceList0Modifications(address(), value); return this; }
    /** Sets the specified value to the {@link #referenceList1ModificationsCount} field. */
    public StdVideoEncodeH265ReferenceModifications referenceList1ModificationsCount(@NativeType("uint8_t") byte value) { nreferenceList1ModificationsCount(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pReferenceList1Modifications} field. */
    public StdVideoEncodeH265ReferenceModifications pReferenceList1Modifications(@NativeType("uint8_t *") ByteBuffer value) { npReferenceList1Modifications(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265ReferenceModifications set(
        StdVideoEncodeH265ReferenceModificationFlags flags,
        byte referenceList0ModificationsCount,
        ByteBuffer pReferenceList0Modifications,
        byte referenceList1ModificationsCount,
        ByteBuffer pReferenceList1Modifications
    ) {
        flags(flags);
        referenceList0ModificationsCount(referenceList0ModificationsCount);
        pReferenceList0Modifications(pReferenceList0Modifications);
        referenceList1ModificationsCount(referenceList1ModificationsCount);
        pReferenceList1Modifications(pReferenceList1Modifications);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265ReferenceModifications set(StdVideoEncodeH265ReferenceModifications src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModifications malloc() {
        return wrap(StdVideoEncodeH265ReferenceModifications.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModifications calloc() {
        return wrap(StdVideoEncodeH265ReferenceModifications.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265ReferenceModifications create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265ReferenceModifications.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance for the specified memory address. */
    public static StdVideoEncodeH265ReferenceModifications create(long address) {
        return wrap(StdVideoEncodeH265ReferenceModifications.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModifications createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265ReferenceModifications.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModifications.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModifications malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265ReferenceModifications.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModifications calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265ReferenceModifications.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265ReferenceModificationFlags nflags(long struct) { return StdVideoEncodeH265ReferenceModificationFlags.create(struct + StdVideoEncodeH265ReferenceModifications.FLAGS); }
    /** Unsafe version of {@link #referenceList0ModificationsCount}. */
    public static byte nreferenceList0ModificationsCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFERENCELIST0MODIFICATIONSCOUNT); }
    /** Unsafe version of {@link #pReferenceList0Modifications(int) pReferenceList0Modifications}. */
    public static ByteBuffer npReferenceList0Modifications(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFERENCELIST0MODIFICATIONS), capacity); }
    /** Unsafe version of {@link #referenceList1ModificationsCount}. */
    public static byte nreferenceList1ModificationsCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFERENCELIST1MODIFICATIONSCOUNT); }
    /** Unsafe version of {@link #pReferenceList1Modifications(int) pReferenceList1Modifications}. */
    public static ByteBuffer npReferenceList1Modifications(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFERENCELIST1MODIFICATIONS), capacity); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265ReferenceModificationFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265ReferenceModificationFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265ReferenceModifications.FLAGS, StdVideoEncodeH265ReferenceModificationFlags.SIZEOF); }
    /** Unsafe version of {@link #referenceList0ModificationsCount(byte) referenceList0ModificationsCount}. */
    public static void nreferenceList0ModificationsCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFERENCELIST0MODIFICATIONSCOUNT, value); }
    /** Unsafe version of {@link #pReferenceList0Modifications(ByteBuffer) pReferenceList0Modifications}. */
    public static void npReferenceList0Modifications(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFERENCELIST0MODIFICATIONS, memAddress(value)); }
    /** Unsafe version of {@link #referenceList1ModificationsCount(byte) referenceList1ModificationsCount}. */
    public static void nreferenceList1ModificationsCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFERENCELIST1MODIFICATIONSCOUNT, value); }
    /** Unsafe version of {@link #pReferenceList1Modifications(ByteBuffer) pReferenceList1Modifications}. */
    public static void npReferenceList1Modifications(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFERENCELIST1MODIFICATIONS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFERENCELIST0MODIFICATIONS));
        check(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFERENCELIST1MODIFICATIONS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265ReferenceModifications} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceModifications, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265ReferenceModifications ELEMENT_FACTORY = StdVideoEncodeH265ReferenceModifications.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265ReferenceModifications.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265ReferenceModifications#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH265ReferenceModifications getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH265ReferenceModificationFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265ReferenceModificationFlags flags() { return StdVideoEncodeH265ReferenceModifications.nflags(address()); }
        /** @return the value of the {@link StdVideoEncodeH265ReferenceModifications#referenceList0ModificationsCount} field. */
        @NativeType("uint8_t")
        public byte referenceList0ModificationsCount() { return StdVideoEncodeH265ReferenceModifications.nreferenceList0ModificationsCount(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link StdVideoEncodeH265ReferenceModifications#pReferenceList0Modifications} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t *")
        public ByteBuffer pReferenceList0Modifications(int capacity) { return StdVideoEncodeH265ReferenceModifications.npReferenceList0Modifications(address(), capacity); }
        /** @return the value of the {@link StdVideoEncodeH265ReferenceModifications#referenceList1ModificationsCount} field. */
        @NativeType("uint8_t")
        public byte referenceList1ModificationsCount() { return StdVideoEncodeH265ReferenceModifications.nreferenceList1ModificationsCount(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link StdVideoEncodeH265ReferenceModifications#pReferenceList1Modifications} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t *")
        public ByteBuffer pReferenceList1Modifications(int capacity) { return StdVideoEncodeH265ReferenceModifications.npReferenceList1Modifications(address(), capacity); }

        /** Copies the specified {@link StdVideoEncodeH265ReferenceModificationFlags} to the {@code flags} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer flags(StdVideoEncodeH265ReferenceModificationFlags value) { StdVideoEncodeH265ReferenceModifications.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265ReferenceModifications.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265ReferenceModifications#referenceList0ModificationsCount} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer referenceList0ModificationsCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nreferenceList0ModificationsCount(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link StdVideoEncodeH265ReferenceModifications#pReferenceList0Modifications} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer pReferenceList0Modifications(@NativeType("uint8_t *") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.npReferenceList0Modifications(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265ReferenceModifications#referenceList1ModificationsCount} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer referenceList1ModificationsCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nreferenceList1ModificationsCount(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link StdVideoEncodeH265ReferenceModifications#pReferenceList1Modifications} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer pReferenceList1Modifications(@NativeType("uint8_t *") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.npReferenceList1Modifications(address(), value); return this; }

    }

}