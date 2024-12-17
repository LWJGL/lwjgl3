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
 * struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t descriptorSetCount;
 *     uint32_t const * pDescriptorCounts;
 * }}</pre>
 */
public class VkDescriptorSetVariableDescriptorCountAllocateInfo extends Struct<VkDescriptorSetVariableDescriptorCountAllocateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORSETCOUNT,
        PDESCRIPTORCOUNTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSETCOUNT = layout.offsetof(2);
        PDESCRIPTORCOUNTS = layout.offsetof(3);
    }

    protected VkDescriptorSetVariableDescriptorCountAllocateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetVariableDescriptorCountAllocateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorSetCount} field. */
    @NativeType("uint32_t")
    public int descriptorSetCount() { return ndescriptorSetCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDescriptorCounts} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDescriptorCounts() { return npDescriptorCounts(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO} value to the {@code sType} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorCounts} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo pDescriptorCounts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDescriptorCounts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDescriptorCounts
    ) {
        sType(sType);
        pNext(pNext);
        pDescriptorCounts(pDescriptorCounts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetVariableDescriptorCountAllocateInfo set(VkDescriptorSetVariableDescriptorCountAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo malloc() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo calloc() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance for the specified memory address. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo create(long address) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorSetVariableDescriptorCountAllocateInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #descriptorSetCount}. */
    public static int ndescriptorSetCount(long struct) { return memGetInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.DESCRIPTORSETCOUNT); }
    /** Unsafe version of {@link #pDescriptorCounts() pDescriptorCounts}. */
    public static @Nullable IntBuffer npDescriptorCounts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.PDESCRIPTORCOUNTS), ndescriptorSetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code descriptorSetCount} field of the specified {@code struct}. */
    public static void ndescriptorSetCount(long struct, int value) { memPutInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.DESCRIPTORSETCOUNT, value); }
    /** Unsafe version of {@link #pDescriptorCounts(IntBuffer) pDescriptorCounts}. */
    public static void npDescriptorCounts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.PDESCRIPTORCOUNTS, memAddressSafe(value)); ndescriptorSetCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndescriptorSetCount(struct) != 0) {
            check(memGetAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfo.PDESCRIPTORCOUNTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetVariableDescriptorCountAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetVariableDescriptorCountAllocateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorSetVariableDescriptorCountAllocateInfo ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetVariableDescriptorCountAllocateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetVariableDescriptorCountAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.npNext(address()); }
        /** @return the value of the {@code descriptorSetCount} field. */
        @NativeType("uint32_t")
        public int descriptorSetCount() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.ndescriptorSetCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDescriptorCounts} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDescriptorCounts() { return VkDescriptorSetVariableDescriptorCountAllocateInfo.npDescriptorCounts(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO} value to the {@code sType} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorCounts} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer pDescriptorCounts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDescriptorSetVariableDescriptorCountAllocateInfo.npDescriptorCounts(address(), value); return this; }

    }

}