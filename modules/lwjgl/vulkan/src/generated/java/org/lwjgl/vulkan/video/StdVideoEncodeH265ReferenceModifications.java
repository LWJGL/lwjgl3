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
 *     uint8_t num_ref_idx_l0_active_minus1;
 *     uint8_t num_ref_idx_l1_active_minus1;
 *     uint16_t reserved1;
 *     uint8_t const * pRefPicList0Entries;
 *     uint8_t const * pRefPicList1Entries;
 *     uint8_t const * pRefList0Modifications;
 *     uint8_t const * pRefList1Modifications;
 * }</code></pre>
 */
public class StdVideoEncodeH265ReferenceModifications extends Struct<StdVideoEncodeH265ReferenceModifications> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        NUM_REF_IDX_L0_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_ACTIVE_MINUS1,
        RESERVED1,
        PREFPICLIST0ENTRIES,
        PREFPICLIST1ENTRIES,
        PREFLIST0MODIFICATIONS,
        PREFLIST1MODIFICATIONS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265ReferenceModificationFlags.SIZEOF, StdVideoEncodeH265ReferenceModificationFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(1);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        PREFPICLIST0ENTRIES = layout.offsetof(4);
        PREFPICLIST1ENTRIES = layout.offsetof(5);
        PREFLIST0MODIFICATIONS = layout.offsetof(6);
        PREFLIST1MODIFICATIONS = layout.offsetof(7);
    }

    protected StdVideoEncodeH265ReferenceModifications(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265ReferenceModifications create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceModifications(address, container);
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
    /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() { return nnum_ref_idx_l0_active_minus1(address()); }
    /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() { return nnum_ref_idx_l1_active_minus1(address()); }
    /** @return the value of the {@code reserved1} field. */
    @NativeType("uint16_t")
    public short reserved1() { return nreserved1(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList0Entries} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pRefPicList0Entries() { return npRefPicList0Entries(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList1Entries} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pRefPicList1Entries() { return npRefPicList1Entries(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefList0Modifications} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pRefList0Modifications() { return npRefList0Modifications(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefList1Modifications} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer pRefList1Modifications() { return npRefList1Modifications(address()); }

    /** Copies the specified {@link StdVideoEncodeH265ReferenceModificationFlags} to the {@code flags} field. */
    public StdVideoEncodeH265ReferenceModifications flags(StdVideoEncodeH265ReferenceModificationFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265ReferenceModifications flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
    public StdVideoEncodeH265ReferenceModifications num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
    public StdVideoEncodeH265ReferenceModifications num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code reserved1} field. */
    public StdVideoEncodeH265ReferenceModifications reserved1(@NativeType("uint16_t") short value) { nreserved1(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList0Entries} field. */
    public StdVideoEncodeH265ReferenceModifications pRefPicList0Entries(@NativeType("uint8_t const *") ByteBuffer value) { npRefPicList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList1Entries} field. */
    public StdVideoEncodeH265ReferenceModifications pRefPicList1Entries(@NativeType("uint8_t const *") ByteBuffer value) { npRefPicList1Entries(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefList0Modifications} field. */
    public StdVideoEncodeH265ReferenceModifications pRefList0Modifications(@NativeType("uint8_t const *") ByteBuffer value) { npRefList0Modifications(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefList1Modifications} field. */
    public StdVideoEncodeH265ReferenceModifications pRefList1Modifications(@NativeType("uint8_t const *") ByteBuffer value) { npRefList1Modifications(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265ReferenceModifications set(
        StdVideoEncodeH265ReferenceModificationFlags flags,
        byte num_ref_idx_l0_active_minus1,
        byte num_ref_idx_l1_active_minus1,
        short reserved1,
        ByteBuffer pRefPicList0Entries,
        ByteBuffer pRefPicList1Entries,
        ByteBuffer pRefList0Modifications,
        ByteBuffer pRefList1Modifications
    ) {
        flags(flags);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        reserved1(reserved1);
        pRefPicList0Entries(pRefPicList0Entries);
        pRefPicList1Entries(pRefPicList1Entries);
        pRefList0Modifications(pRefList0Modifications);
        pRefList1Modifications(pRefList1Modifications);

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
        return new StdVideoEncodeH265ReferenceModifications(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModifications calloc() {
        return new StdVideoEncodeH265ReferenceModifications(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265ReferenceModifications create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceModifications(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance for the specified memory address. */
    public static StdVideoEncodeH265ReferenceModifications create(long address) {
        return new StdVideoEncodeH265ReferenceModifications(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModifications createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265ReferenceModifications(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModifications.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModifications malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModifications(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModifications calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModifications(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265ReferenceModificationFlags nflags(long struct) { return StdVideoEncodeH265ReferenceModificationFlags.create(struct + StdVideoEncodeH265ReferenceModifications.FLAGS); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1}. */
    public static byte nnum_ref_idx_l0_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L0_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1}. */
    public static byte nnum_ref_idx_l1_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L1_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #reserved1}. */
    public static short nreserved1(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265ReferenceModifications.RESERVED1); }
    /** Unsafe version of {@link #pRefPicList0Entries() pRefPicList0Entries}. */
    public static ByteBuffer npRefPicList0Entries(long struct) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFPICLIST0ENTRIES), Byte.toUnsignedInt(nnum_ref_idx_l0_active_minus1(struct)) + 1); }
    /** Unsafe version of {@link #pRefPicList1Entries() pRefPicList1Entries}. */
    public static ByteBuffer npRefPicList1Entries(long struct) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFPICLIST1ENTRIES), Byte.toUnsignedInt(nnum_ref_idx_l1_active_minus1(struct)) + 1); }
    /** Unsafe version of {@link #pRefList0Modifications() pRefList0Modifications}. */
    public static ByteBuffer npRefList0Modifications(long struct) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFLIST0MODIFICATIONS), Byte.toUnsignedInt(nnum_ref_idx_l0_active_minus1(struct)) + 1); }
    /** Unsafe version of {@link #pRefList1Modifications() pRefList1Modifications}. */
    public static ByteBuffer npRefList1Modifications(long struct) { return memByteBuffer(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFLIST1MODIFICATIONS), Byte.toUnsignedInt(nnum_ref_idx_l1_active_minus1(struct)) + 1); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265ReferenceModificationFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265ReferenceModificationFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265ReferenceModifications.FLAGS, StdVideoEncodeH265ReferenceModificationFlags.SIZEOF); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1(byte) num_ref_idx_l0_active_minus1}. */
    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L0_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1(byte) num_ref_idx_l1_active_minus1}. */
    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L1_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #reserved1(short) reserved1}. */
    public static void nreserved1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265ReferenceModifications.RESERVED1, value); }
    /** Unsafe version of {@link #pRefPicList0Entries(ByteBuffer) pRefPicList0Entries}. */
    public static void npRefPicList0Entries(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFPICLIST0ENTRIES, memAddress(value)); }
    /** Unsafe version of {@link #pRefPicList1Entries(ByteBuffer) pRefPicList1Entries}. */
    public static void npRefPicList1Entries(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFPICLIST1ENTRIES, memAddress(value)); }
    /** Unsafe version of {@link #pRefList0Modifications(ByteBuffer) pRefList0Modifications}. */
    public static void npRefList0Modifications(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFLIST0MODIFICATIONS, memAddress(value)); }
    /** Unsafe version of {@link #pRefList1Modifications(ByteBuffer) pRefList1Modifications}. */
    public static void npRefList1Modifications(long struct, ByteBuffer value) { memPutAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFLIST1MODIFICATIONS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFPICLIST0ENTRIES));
        check(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFPICLIST1ENTRIES));
        check(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFLIST0MODIFICATIONS));
        check(memGetAddress(struct + StdVideoEncodeH265ReferenceModifications.PREFLIST1MODIFICATIONS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265ReferenceModifications} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceModifications, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265ReferenceModifications ELEMENT_FACTORY = StdVideoEncodeH265ReferenceModifications.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265ReferenceModifications.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265ReferenceModifications#SIZEOF}, and its mark will be undefined.</p>
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
        /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l0_active_minus1(address()); }
        /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l1_active_minus1(address()); }
        /** @return the value of the {@code reserved1} field. */
        @NativeType("uint16_t")
        public short reserved1() { return StdVideoEncodeH265ReferenceModifications.nreserved1(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList0Entries} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pRefPicList0Entries() { return StdVideoEncodeH265ReferenceModifications.npRefPicList0Entries(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefPicList1Entries} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pRefPicList1Entries() { return StdVideoEncodeH265ReferenceModifications.npRefPicList1Entries(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefList0Modifications} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pRefList0Modifications() { return StdVideoEncodeH265ReferenceModifications.npRefList0Modifications(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pRefList1Modifications} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer pRefList1Modifications() { return StdVideoEncodeH265ReferenceModifications.npRefList1Modifications(address()); }

        /** Copies the specified {@link StdVideoEncodeH265ReferenceModificationFlags} to the {@code flags} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer flags(StdVideoEncodeH265ReferenceModificationFlags value) { StdVideoEncodeH265ReferenceModifications.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265ReferenceModifications.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l0_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l1_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code reserved1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer reserved1(@NativeType("uint16_t") short value) { StdVideoEncodeH265ReferenceModifications.nreserved1(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList0Entries} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer pRefPicList0Entries(@NativeType("uint8_t const *") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.npRefPicList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefPicList1Entries} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer pRefPicList1Entries(@NativeType("uint8_t const *") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.npRefPicList1Entries(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefList0Modifications} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer pRefList0Modifications(@NativeType("uint8_t const *") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.npRefList0Modifications(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pRefList1Modifications} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer pRefList1Modifications(@NativeType("uint8_t const *") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.npRefList1Modifications(address(), value); return this; }

    }

}