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
 * <pre><code>
 * struct VkPipelineLayoutCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineLayoutCreateFlags flags;
 *     uint32_t setLayoutCount;
 *     VkDescriptorSetLayout const * pSetLayouts;
 *     uint32_t pushConstantRangeCount;
 *     {@link VkPushConstantRange VkPushConstantRange} const * pPushConstantRanges;
 * }</code></pre>
 */
public class VkPipelineLayoutCreateInfo extends Struct<VkPipelineLayoutCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SETLAYOUTCOUNT,
        PSETLAYOUTS,
        PUSHCONSTANTRANGECOUNT,
        PPUSHCONSTANTRANGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SETLAYOUTCOUNT = layout.offsetof(3);
        PSETLAYOUTS = layout.offsetof(4);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(5);
        PPUSHCONSTANTRANGES = layout.offsetof(6);
    }

    protected VkPipelineLayoutCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineLayoutCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineLayoutCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineLayoutCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineLayoutCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineLayoutCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code setLayoutCount} field. */
    @NativeType("uint32_t")
    public int setLayoutCount() { return nsetLayoutCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
    @NativeType("VkDescriptorSetLayout const *")
    public @Nullable LongBuffer pSetLayouts() { return npSetLayouts(address()); }
    /** @return the value of the {@code pushConstantRangeCount} field. */
    @NativeType("uint32_t")
    public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
    /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.@Nullable Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineLayoutCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineLayoutCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineLayoutCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineLayoutCreateInfo flags(@NativeType("VkPipelineLayoutCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code setLayoutCount} field. */
    public VkPipelineLayoutCreateInfo setLayoutCount(@NativeType("uint32_t") int value) { nsetLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
    public VkPipelineLayoutCreateInfo pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { npSetLayouts(address(), value); return this; }
    /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
    public VkPipelineLayoutCreateInfo pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.@Nullable Buffer value) { npPushConstantRanges(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineLayoutCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int setLayoutCount,
        @Nullable LongBuffer pSetLayouts,
        VkPushConstantRange.@Nullable Buffer pPushConstantRanges
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);
        pPushConstantRanges(pPushConstantRanges);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineLayoutCreateInfo set(VkPipelineLayoutCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineLayoutCreateInfo malloc() {
        return new VkPipelineLayoutCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineLayoutCreateInfo calloc() {
        return new VkPipelineLayoutCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineLayoutCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineLayoutCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance for the specified memory address. */
    public static VkPipelineLayoutCreateInfo create(long address) {
        return new VkPipelineLayoutCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineLayoutCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineLayoutCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineLayoutCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineLayoutCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineLayoutCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineLayoutCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineLayoutCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineLayoutCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineLayoutCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.FLAGS); }
    /** Unsafe version of {@link #setLayoutCount}. */
    public static int nsetLayoutCount(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT); }
    /** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
    public static @Nullable LongBuffer npSetLayouts(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS), nsetLayoutCount(struct)); }
    /** Unsafe version of {@link #pushConstantRangeCount}. */
    public static int npushConstantRangeCount(long struct) { return memGetInt(struct + VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT); }
    /** Unsafe version of {@link #pPushConstantRanges}. */
    public static VkPushConstantRange.@Nullable Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.createSafe(memGetAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code setLayoutCount} field of the specified {@code struct}. */
    public static void nsetLayoutCount(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
    public static void npSetLayouts(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS, memAddressSafe(value)); if (value != null) { nsetLayoutCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
    public static void npushConstantRangeCount(long struct, int value) { memPutInt(struct + VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT, value); }
    /** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
    public static void npPushConstantRanges(long struct, VkPushConstantRange.@Nullable Buffer value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES, memAddressSafe(value)); npushConstantRangeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (npushConstantRangeCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineLayoutCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineLayoutCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineLayoutCreateInfo ELEMENT_FACTORY = VkPipelineLayoutCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineLayoutCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineLayoutCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineLayoutCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineLayoutCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineLayoutCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineLayoutCreateFlags")
        public int flags() { return VkPipelineLayoutCreateInfo.nflags(address()); }
        /** @return the value of the {@code setLayoutCount} field. */
        @NativeType("uint32_t")
        public int setLayoutCount() { return VkPipelineLayoutCreateInfo.nsetLayoutCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
        @NativeType("VkDescriptorSetLayout const *")
        public @Nullable LongBuffer pSetLayouts() { return VkPipelineLayoutCreateInfo.npSetLayouts(address()); }
        /** @return the value of the {@code pushConstantRangeCount} field. */
        @NativeType("uint32_t")
        public int pushConstantRangeCount() { return VkPipelineLayoutCreateInfo.npushConstantRangeCount(address()); }
        /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.@Nullable Buffer pPushConstantRanges() { return VkPipelineLayoutCreateInfo.npPushConstantRanges(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineLayoutCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineLayoutCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineLayoutCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineLayoutCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineLayoutCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineLayoutCreateInfo.Buffer flags(@NativeType("VkPipelineLayoutCreateFlags") int value) { VkPipelineLayoutCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code setLayoutCount} field. */
        public VkPipelineLayoutCreateInfo.Buffer setLayoutCount(@NativeType("uint32_t") int value) { VkPipelineLayoutCreateInfo.nsetLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
        public VkPipelineLayoutCreateInfo.Buffer pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { VkPipelineLayoutCreateInfo.npSetLayouts(address(), value); return this; }
        /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
        public VkPipelineLayoutCreateInfo.Buffer pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.@Nullable Buffer value) { VkPipelineLayoutCreateInfo.npPushConstantRanges(address(), value); return this; }

    }

}