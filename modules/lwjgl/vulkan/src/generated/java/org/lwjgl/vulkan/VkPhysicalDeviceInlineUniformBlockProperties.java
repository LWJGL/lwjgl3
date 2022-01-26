/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing inline uniform block properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceInlineUniformBlockProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceInlineUniformBlockProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxInlineUniformBlockSize};
 *     uint32_t maxPerStageDescriptorInlineUniformBlocks;
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks};
 *     uint32_t {@link #maxDescriptorSetInlineUniformBlocks};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks};
 * }</code></pre>
 */
public class VkPhysicalDeviceInlineUniformBlockProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINLINEUNIFORMBLOCKSIZE,
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS,
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS,
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINLINEUNIFORMBLOCKSIZE = layout.offsetof(2);
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS = layout.offsetof(3);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(4);
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS = layout.offsetof(5);
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceInlineUniformBlockProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInlineUniformBlockProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum size in bytes of an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-inlineuniformblock">inline uniform block</a> binding. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockSize() { return nmaxInlineUniformBlockSize(address()); }
    /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInlineUniformBlocks() { return nmaxPerStageDescriptorInlineUniformBlocks(address()); }
    /** similar to {@code maxPerStageDescriptorInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
    /** the maximum number of inline uniform block bindings that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInlineUniformBlocks() { return nmaxDescriptorSetInlineUniformBlocks(address()); }
    /** similar to {@code maxDescriptorSetInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceInlineUniformBlockProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceInlineUniformBlockProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceInlineUniformBlockProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInlineUniformBlockProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceInlineUniformBlockProperties set(VkPhysicalDeviceInlineUniformBlockProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockProperties malloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockProperties calloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInlineUniformBlockProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceInlineUniformBlockProperties create(long address) {
        return wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInlineUniformBlockProperties.PNEXT); }
    /** Unsafe version of {@link #maxInlineUniformBlockSize}. */
    public static int nmaxInlineUniformBlockSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXINLINEUNIFORMBLOCKSIZE); }
    /** Unsafe version of {@link #maxPerStageDescriptorInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetInlineUniformBlocks}. */
    public static int nmaxDescriptorSetInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInlineUniformBlockProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInlineUniformBlockProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInlineUniformBlockProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInlineUniformBlockProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInlineUniformBlockProperties ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInlineUniformBlockProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceInlineUniformBlockProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInlineUniformBlockProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInlineUniformBlockProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockProperties#maxInlineUniformBlockSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockSize() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxInlineUniformBlockSize(address()); }
        /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxPerStageDescriptorInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockProperties#maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockProperties#maxDescriptorSetInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxDescriptorSetInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockProperties#maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceInlineUniformBlockProperties#sType} field. */
        public VkPhysicalDeviceInlineUniformBlockProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES} value to the {@link VkPhysicalDeviceInlineUniformBlockProperties#sType} field. */
        public VkPhysicalDeviceInlineUniformBlockProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceInlineUniformBlockProperties#pNext} field. */
        public VkPhysicalDeviceInlineUniformBlockProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInlineUniformBlockProperties.npNext(address(), value); return this; }

    }

}