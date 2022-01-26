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
 * Structure specifying provoking vertex mode used by a graphics pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this struct is not provided when creating the pipeline, the pipeline will use the {@link EXTProvokingVertex#VK_PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT} mode.</p>
 * 
 * <p>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-provokingVertexModePerPipeline">provokingVertexModePerPipeline</a> limit is {@link VK10#VK_FALSE FALSE}, then all pipelines bound within a render pass instance <b>must</b> have the same {@code provokingVertexMode}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code provokingVertexMode} is {@link EXTProvokingVertex#VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-provokingVertexLast">provokingVertexLast</a> feature <b>must</b> be enabled</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code provokingVertexMode} <b>must</b> be a valid {@code VkProvokingVertexModeEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationProvokingVertexStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkProvokingVertexModeEXT {@link #provokingVertexMode};
 * }</code></pre>
 */
public class VkPipelineRasterizationProvokingVertexStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROVOKINGVERTEXMODE;

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
        PROVOKINGVERTEXMODE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkProvokingVertexModeEXT} value selecting the provoking vertex mode. */
    @NativeType("VkProvokingVertexModeEXT")
    public int provokingVertexMode() { return nprovokingVertexMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #provokingVertexMode} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT provokingVertexMode(@NativeType("VkProvokingVertexModeEXT") int value) { nprovokingVertexMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(
        int sType,
        long pNext,
        int provokingVertexMode
    ) {
        sType(sType);
        pNext(pNext);
        provokingVertexMode(provokingVertexMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT malloc() {
        return wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT calloc() {
        return wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #provokingVertexMode}. */
    public static int nprovokingVertexMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PROVOKINGVERTEXMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #provokingVertexMode(int) provokingVertexMode}. */
    public static void nprovokingVertexMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PROVOKINGVERTEXMODE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationProvokingVertexStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRasterizationProvokingVertexStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#provokingVertexMode} field. */
        @NativeType("VkProvokingVertexModeEXT")
        public int provokingVertexMode() { return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nprovokingVertexMode(address()); }

        /** Sets the specified value to the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#pNext} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#provokingVertexMode} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer provokingVertexMode(@NativeType("VkProvokingVertexModeEXT") int value) { VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nprovokingVertexMode(address(), value); return this; }

    }

}