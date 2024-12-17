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
 * struct VkPushDescriptorSetInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags stageFlags;
 *     VkPipelineLayout layout;
 *     uint32_t set;
 *     uint32_t descriptorWriteCount;
 *     {@link VkWriteDescriptorSet VkWriteDescriptorSet} const * pDescriptorWrites;
 * }}</pre>
 */
public class VkPushDescriptorSetInfo extends Struct<VkPushDescriptorSetInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGEFLAGS,
        LAYOUT,
        SET,
        DESCRIPTORWRITECOUNT,
        PDESCRIPTORWRITES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
        DESCRIPTORWRITECOUNT = layout.offsetof(5);
        PDESCRIPTORWRITES = layout.offsetof(6);
    }

    protected VkPushDescriptorSetInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushDescriptorSetInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPushDescriptorSetInfo(address, container);
    }

    /**
     * Creates a {@code VkPushDescriptorSetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushDescriptorSetInfo(ByteBuffer container) {
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
    /** @return the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }
    /** @return the value of the {@code descriptorWriteCount} field. */
    @NativeType("uint32_t")
    public int descriptorWriteCount() { return ndescriptorWriteCount(address()); }
    /** @return a {@link VkWriteDescriptorSet.Buffer} view of the struct array pointed to by the {@code pDescriptorWrites} field. */
    @NativeType("VkWriteDescriptorSet const *")
    public VkWriteDescriptorSet.Buffer pDescriptorWrites() { return npDescriptorWrites(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPushDescriptorSetInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO} value to the {@code sType} field. */
    public VkPushDescriptorSetInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPushDescriptorSetInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkPushDescriptorSetInfo pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkPushDescriptorSetInfo stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkPushDescriptorSetInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    public VkPushDescriptorSetInfo set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }
    /** Sets the address of the specified {@link VkWriteDescriptorSet.Buffer} to the {@code pDescriptorWrites} field. */
    public VkPushDescriptorSetInfo pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) { npDescriptorWrites(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushDescriptorSetInfo set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int set,
        VkWriteDescriptorSet.Buffer pDescriptorWrites
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);
        pDescriptorWrites(pDescriptorWrites);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushDescriptorSetInfo set(VkPushDescriptorSetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushDescriptorSetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetInfo malloc() {
        return new VkPushDescriptorSetInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetInfo calloc() {
        return new VkPushDescriptorSetInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetInfo} instance allocated with {@link BufferUtils}. */
    public static VkPushDescriptorSetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPushDescriptorSetInfo} instance for the specified memory address. */
    public static VkPushDescriptorSetInfo create(long address) {
        return new VkPushDescriptorSetInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushDescriptorSetInfo createSafe(long address) {
        return address == NULL ? null : new VkPushDescriptorSetInfo(address, null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushDescriptorSetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushDescriptorSetInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetInfo malloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetInfo calloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPushDescriptorSetInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushDescriptorSetInfo.PNEXT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkPushDescriptorSetInfo.STAGEFLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkPushDescriptorSetInfo.LAYOUT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return memGetInt(struct + VkPushDescriptorSetInfo.SET); }
    /** Unsafe version of {@link #descriptorWriteCount}. */
    public static int ndescriptorWriteCount(long struct) { return memGetInt(struct + VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT); }
    /** Unsafe version of {@link #pDescriptorWrites}. */
    public static VkWriteDescriptorSet.Buffer npDescriptorWrites(long struct) { return VkWriteDescriptorSet.create(memGetAddress(struct + VkPushDescriptorSetInfo.PDESCRIPTORWRITES), ndescriptorWriteCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPushDescriptorSetInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushDescriptorSetInfo.PNEXT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkPushDescriptorSetInfo.STAGEFLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkPushDescriptorSetInfo.LAYOUT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { memPutInt(struct + VkPushDescriptorSetInfo.SET, value); }
    /** Sets the specified value to the {@code descriptorWriteCount} field of the specified {@code struct}. */
    public static void ndescriptorWriteCount(long struct, int value) { memPutInt(struct + VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT, value); }
    /** Unsafe version of {@link #pDescriptorWrites(VkWriteDescriptorSet.Buffer) pDescriptorWrites}. */
    public static void npDescriptorWrites(long struct, VkWriteDescriptorSet.Buffer value) { memPutAddress(struct + VkPushDescriptorSetInfo.PDESCRIPTORWRITES, value.address()); ndescriptorWriteCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPushDescriptorSetInfo.PDESCRIPTORWRITES));
    }

    // -----------------------------------

    /** An array of {@link VkPushDescriptorSetInfo} structs. */
    public static class Buffer extends StructBuffer<VkPushDescriptorSetInfo, Buffer> implements NativeResource {

        private static final VkPushDescriptorSetInfo ELEMENT_FACTORY = VkPushDescriptorSetInfo.create(-1L);

        /**
         * Creates a new {@code VkPushDescriptorSetInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushDescriptorSetInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushDescriptorSetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushDescriptorSetInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushDescriptorSetInfo.npNext(address()); }
        /** @return the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkPushDescriptorSetInfo.nstageFlags(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkPushDescriptorSetInfo.nlayout(address()); }
        /** @return the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return VkPushDescriptorSetInfo.nset(address()); }
        /** @return the value of the {@code descriptorWriteCount} field. */
        @NativeType("uint32_t")
        public int descriptorWriteCount() { return VkPushDescriptorSetInfo.ndescriptorWriteCount(address()); }
        /** @return a {@link VkWriteDescriptorSet.Buffer} view of the struct array pointed to by the {@code pDescriptorWrites} field. */
        @NativeType("VkWriteDescriptorSet const *")
        public VkWriteDescriptorSet.Buffer pDescriptorWrites() { return VkPushDescriptorSetInfo.npDescriptorWrites(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPushDescriptorSetInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPushDescriptorSetInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO} value to the {@code sType} field. */
        public VkPushDescriptorSetInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPushDescriptorSetInfo.Buffer pNext(@NativeType("void const *") long value) { VkPushDescriptorSetInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkPushDescriptorSetInfo.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkPushDescriptorSetInfo.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushDescriptorSetInfo.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkPushDescriptorSetInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushDescriptorSetInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        public VkPushDescriptorSetInfo.Buffer set(@NativeType("uint32_t") int value) { VkPushDescriptorSetInfo.nset(address(), value); return this; }
        /** Sets the address of the specified {@link VkWriteDescriptorSet.Buffer} to the {@code pDescriptorWrites} field. */
        public VkPushDescriptorSetInfo.Buffer pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) { VkPushDescriptorSetInfo.npDescriptorWrites(address(), value); return this; }

    }

}