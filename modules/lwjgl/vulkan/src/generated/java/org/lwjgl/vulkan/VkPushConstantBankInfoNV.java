/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPushConstantBankInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t bank;
 * }}</pre>
 */
public class VkPushConstantBankInfoNV extends Struct<VkPushConstantBankInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BANK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BANK = layout.offsetof(2);
    }

    protected VkPushConstantBankInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushConstantBankInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkPushConstantBankInfoNV(address, container);
    }

    /**
     * Creates a {@code VkPushConstantBankInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushConstantBankInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code bank} field. */
    @NativeType("uint32_t")
    public int bank() { return nbank(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPushConstantBankInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPushConstantBank#VK_STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV} value to the {@code sType} field. */
    public VkPushConstantBankInfoNV sType$Default() { return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPushConstantBankInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bank} field. */
    public VkPushConstantBankInfoNV bank(@NativeType("uint32_t") int value) { nbank(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushConstantBankInfoNV set(
        int sType,
        long pNext,
        int bank
    ) {
        sType(sType);
        pNext(pNext);
        bank(bank);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushConstantBankInfoNV set(VkPushConstantBankInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushConstantBankInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushConstantBankInfoNV malloc() {
        return new VkPushConstantBankInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantBankInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushConstantBankInfoNV calloc() {
        return new VkPushConstantBankInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantBankInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPushConstantBankInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantBankInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPushConstantBankInfoNV} instance for the specified memory address. */
    public static VkPushConstantBankInfoNV create(long address) {
        return new VkPushConstantBankInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushConstantBankInfoNV createSafe(long address) {
        return address == NULL ? null : new VkPushConstantBankInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPushConstantBankInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantBankInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantBankInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantBankInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantBankInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantBankInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushConstantBankInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushConstantBankInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushConstantBankInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushConstantBankInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantBankInfoNV malloc(MemoryStack stack) {
        return new VkPushConstantBankInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushConstantBankInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantBankInfoNV calloc(MemoryStack stack) {
        return new VkPushConstantBankInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushConstantBankInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantBankInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantBankInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantBankInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPushConstantBankInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushConstantBankInfoNV.PNEXT); }
    /** Unsafe version of {@link #bank}. */
    public static int nbank(long struct) { return memGetInt(struct + VkPushConstantBankInfoNV.BANK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPushConstantBankInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushConstantBankInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #bank(int) bank}. */
    public static void nbank(long struct, int value) { memPutInt(struct + VkPushConstantBankInfoNV.BANK, value); }

    // -----------------------------------

    /** An array of {@link VkPushConstantBankInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPushConstantBankInfoNV, Buffer> implements NativeResource {

        private static final VkPushConstantBankInfoNV ELEMENT_FACTORY = VkPushConstantBankInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPushConstantBankInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushConstantBankInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushConstantBankInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushConstantBankInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushConstantBankInfoNV.npNext(address()); }
        /** @return the value of the {@code bank} field. */
        @NativeType("uint32_t")
        public int bank() { return VkPushConstantBankInfoNV.nbank(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPushConstantBankInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPushConstantBankInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPushConstantBank#VK_STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV} value to the {@code sType} field. */
        public VkPushConstantBankInfoNV.Buffer sType$Default() { return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPushConstantBankInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPushConstantBankInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bank} field. */
        public VkPushConstantBankInfoNV.Buffer bank(@NativeType("uint32_t") int value) { VkPushConstantBankInfoNV.nbank(address(), value); return this; }

    }

}