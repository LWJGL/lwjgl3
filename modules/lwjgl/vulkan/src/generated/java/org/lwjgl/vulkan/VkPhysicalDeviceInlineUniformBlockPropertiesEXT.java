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
 * <p>If the {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTInlineUniformBlock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code maxInlineUniformBlockSize} &ndash; the maximum size in bytes of an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-inlineuniformblock">inline uniform block</a> binding.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} &ndash; similar to {@code maxPerStageDescriptorInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the {@link EXTDescriptorIndexing#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT} bit set.</li>
 * <li>{@code maxDescriptorSetInlineUniformBlocks} &ndash; the maximum number of inline uniform block bindings that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of {@link EXTInlineUniformBlock#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link EXTDescriptorIndexing#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT} bit set count against this limit.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} &ndash; similar to {@code maxDescriptorSetInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the {@link EXTDescriptorIndexing#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT} bit set.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceInlineUniformBlockPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxInlineUniformBlockSize;
 *     uint32_t maxPerStageDescriptorInlineUniformBlocks;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
 *     uint32_t maxDescriptorSetInlineUniformBlocks;
 *     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
 * }</code></pre>
 */
public class VkPhysicalDeviceInlineUniformBlockPropertiesEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxInlineUniformBlockSize} field. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockSize() { return nmaxInlineUniformBlockSize(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInlineUniformBlocks() { return nmaxPerStageDescriptorInlineUniformBlocks(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
    /** Returns the value of the {@code maxDescriptorSetInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInlineUniformBlocks() { return nmaxDescriptorSetInlineUniformBlocks(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT set(
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
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT set(VkPhysicalDeviceInlineUniformBlockPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxInlineUniformBlockSize}. */
    public static int nmaxInlineUniformBlockSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.MAXINLINEUNIFORMBLOCKSIZE); }
    /** Unsafe version of {@link #maxPerStageDescriptorInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetInlineUniformBlocks}. */
    public static int nmaxDescriptorSetInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInlineUniformBlockPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInlineUniformBlockPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInlineUniformBlockPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceInlineUniformBlockPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code maxInlineUniformBlockSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockSize() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nmaxInlineUniformBlockSize(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nmaxPerStageDescriptorInlineUniformBlocks(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
        /** Returns the value of the {@code maxDescriptorSetInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nmaxDescriptorSetInlineUniformBlocks(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceInlineUniformBlockPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInlineUniformBlockPropertiesEXT.npNext(address(), value); return this; }

    }

}