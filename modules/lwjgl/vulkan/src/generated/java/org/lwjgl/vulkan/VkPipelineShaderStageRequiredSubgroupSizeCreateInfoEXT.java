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
 * Structure specifying the required subgroup size of a newly created pipeline shader stage.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} structure is included in the {@code pNext} chain of {@link VkPipelineShaderStageCreateInfo}, it specifies that the pipeline shader stage being compiled has a required subgroup size.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubgroupSizeControl#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t requiredSubgroupSize;
 * }</code></pre>
 */
public class VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REQUIREDSUBGROUPSIZE;

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
        REQUIREDSUBGROUPSIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code requiredSubgroupSize} field. */
    @NativeType("uint32_t")
    public int requiredSubgroupSize() { return nrequiredSubgroupSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT set(
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
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT set(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT malloc() {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT calloc() {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT create(long address) {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #requiredSubgroupSize}. */
    public static int nrequiredSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.REQUIREDSUBGROUPSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT ELEMENT_FACTORY = VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code requiredSubgroupSize} field. */
        @NativeType("uint32_t")
        public int requiredSubgroupSize() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.nrequiredSubgroupSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.npNext(address(), value); return this; }

    }

}