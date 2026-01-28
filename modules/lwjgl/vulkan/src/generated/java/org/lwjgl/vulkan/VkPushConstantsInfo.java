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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPushConstantsInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineLayout layout;
 *     VkShaderStageFlags stageFlags;
 *     uint32_t offset;
 *     uint32_t size;
 *     void const * pValues;
 * }}</pre>
 */
public class VkPushConstantsInfo extends Struct<VkPushConstantsInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LAYOUT,
        STAGEFLAGS,
        OFFSET,
        SIZE,
        PVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LAYOUT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        PVALUES = layout.offsetof(6);
    }

    protected VkPushConstantsInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushConstantsInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPushConstantsInfo(address, container);
    }

    /**
     * Creates a {@code VkPushConstantsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushConstantsInfo(ByteBuffer container) {
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
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pValues} field. */
    @NativeType("void const *")
    public ByteBuffer pValues() { return npValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPushConstantsInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO STRUCTURE_TYPE_PUSH_CONSTANTS_INFO} value to the {@code sType} field. */
    public VkPushConstantsInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPushConstantsInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkPushConstantsInfo pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
    public VkPushConstantsInfo pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code layout} field. */
    public VkPushConstantsInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkPushConstantsInfo stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkPushConstantsInfo offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pValues} field. */
    public VkPushConstantsInfo pValues(@NativeType("void const *") ByteBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushConstantsInfo set(
        int sType,
        long pNext,
        long layout,
        int stageFlags,
        int offset,
        ByteBuffer pValues
    ) {
        sType(sType);
        pNext(pNext);
        layout(layout);
        stageFlags(stageFlags);
        offset(offset);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushConstantsInfo set(VkPushConstantsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushConstantsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushConstantsInfo malloc() {
        return new VkPushConstantsInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushConstantsInfo calloc() {
        return new VkPushConstantsInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantsInfo} instance allocated with {@link BufferUtils}. */
    public static VkPushConstantsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantsInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPushConstantsInfo} instance for the specified memory address. */
    public static VkPushConstantsInfo create(long address) {
        return new VkPushConstantsInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushConstantsInfo createSafe(long address) {
        return address == NULL ? null : new VkPushConstantsInfo(address, null);
    }

    /**
     * Returns a new {@link VkPushConstantsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushConstantsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushConstantsInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushConstantsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantsInfo malloc(MemoryStack stack) {
        return new VkPushConstantsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushConstantsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantsInfo calloc(MemoryStack stack) {
        return new VkPushConstantsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushConstantsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPushConstantsInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushConstantsInfo.PNEXT); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkPushConstantsInfo.LAYOUT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkPushConstantsInfo.STAGEFLAGS); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkPushConstantsInfo.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + VkPushConstantsInfo.SIZE); }
    /** Unsafe version of {@link #pValues() pValues}. */
    public static ByteBuffer npValues(long struct) { return memByteBuffer(memGetAddress(struct + VkPushConstantsInfo.PVALUES), nsize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPushConstantsInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushConstantsInfo.PNEXT, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkPushConstantsInfo.LAYOUT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkPushConstantsInfo.STAGEFLAGS, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkPushConstantsInfo.OFFSET, value); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + VkPushConstantsInfo.SIZE, value); }
    /** Unsafe version of {@link #pValues(ByteBuffer) pValues}. */
    public static void npValues(long struct, ByteBuffer value) { memPutAddress(struct + VkPushConstantsInfo.PVALUES, memAddress(value)); nsize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPushConstantsInfo.PVALUES));
    }

    // -----------------------------------

    /** An array of {@link VkPushConstantsInfo} structs. */
    public static class Buffer extends StructBuffer<VkPushConstantsInfo, Buffer> implements NativeResource {

        private static final VkPushConstantsInfo ELEMENT_FACTORY = VkPushConstantsInfo.create(-1L);

        /**
         * Creates a new {@code VkPushConstantsInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushConstantsInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushConstantsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushConstantsInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushConstantsInfo.npNext(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkPushConstantsInfo.nlayout(address()); }
        /** @return the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkPushConstantsInfo.nstageFlags(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkPushConstantsInfo.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return VkPushConstantsInfo.nsize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pValues} field. */
        @NativeType("void const *")
        public ByteBuffer pValues() { return VkPushConstantsInfo.npValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPushConstantsInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPushConstantsInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO STRUCTURE_TYPE_PUSH_CONSTANTS_INFO} value to the {@code sType} field. */
        public VkPushConstantsInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPushConstantsInfo.Buffer pNext(@NativeType("void const *") long value) { VkPushConstantsInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkPushConstantsInfo.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
        public VkPushConstantsInfo.Buffer pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code layout} field. */
        public VkPushConstantsInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushConstantsInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkPushConstantsInfo.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushConstantsInfo.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkPushConstantsInfo.Buffer offset(@NativeType("uint32_t") int value) { VkPushConstantsInfo.noffset(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pValues} field. */
        public VkPushConstantsInfo.Buffer pValues(@NativeType("void const *") ByteBuffer value) { VkPushConstantsInfo.npValues(address(), value); return this; }

    }

}