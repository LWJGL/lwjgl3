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
 * struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t bindingCount;
 *     VkDescriptorBindingFlags const * pBindingFlags;
 * }}</pre>
 */
public class VkDescriptorSetLayoutBindingFlagsCreateInfo extends Struct<VkDescriptorSetLayoutBindingFlagsCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BINDINGCOUNT,
        PBINDINGFLAGS;

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
        BINDINGCOUNT = layout.offsetof(2);
        PBINDINGFLAGS = layout.offsetof(3);
    }

    protected VkDescriptorSetLayoutBindingFlagsCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetLayoutBindingFlagsCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code bindingCount} field. */
    @NativeType("uint32_t")
    public int bindingCount() { return nbindingCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pBindingFlags} field. */
    @NativeType("VkDescriptorBindingFlags const *")
    public @Nullable IntBuffer pBindingFlags() { return npBindingFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO} value to the {@code sType} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bindingCount} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(@NativeType("uint32_t") int value) { nbindingCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pBindingFlags} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlags const *") IntBuffer value) { npBindingFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo set(
        int sType,
        long pNext,
        int bindingCount,
        @Nullable IntBuffer pBindingFlags
    ) {
        sType(sType);
        pNext(pNext);
        bindingCount(bindingCount);
        pBindingFlags(pBindingFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo set(VkDescriptorSetLayoutBindingFlagsCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo malloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo calloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance for the specified memory address. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo create(long address) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorSetLayoutBindingFlagsCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PNEXT); }
    /** Unsafe version of {@link #bindingCount}. */
    public static int nbindingCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.BINDINGCOUNT); }
    /** Unsafe version of {@link #pBindingFlags() pBindingFlags}. */
    public static @Nullable IntBuffer npBindingFlags(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PBINDINGFLAGS), nbindingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code bindingCount} field of the specified {@code struct}. */
    public static void nbindingCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.BINDINGCOUNT, value); }
    /** Unsafe version of {@link #pBindingFlags(IntBuffer) pBindingFlags}. */
    public static void npBindingFlags(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PBINDINGFLAGS, memAddressSafe(value)); if (value != null) { nbindingCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutBindingFlagsCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBindingFlagsCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutBindingFlagsCreateInfo ELEMENT_FACTORY = VkDescriptorSetLayoutBindingFlagsCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetLayoutBindingFlagsCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.npNext(address()); }
        /** @return the value of the {@code bindingCount} field. */
        @NativeType("uint32_t")
        public int bindingCount() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.nbindingCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pBindingFlags} field. */
        @NativeType("VkDescriptorBindingFlags const *")
        public @Nullable IntBuffer pBindingFlags() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.npBindingFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO} value to the {@code sType} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bindingCount} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer bindingCount(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.nbindingCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pBindingFlags} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlags const *") IntBuffer value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.npBindingFlags(address(), value); return this; }

    }

}