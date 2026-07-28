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
 * struct VkPipelineFragmentDensityMapLayeredCreateInfoVALVE {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t maxFragmentDensityMapLayers;
 * }}</pre>
 */
public class VkPipelineFragmentDensityMapLayeredCreateInfoVALVE extends Struct<VkPipelineFragmentDensityMapLayeredCreateInfoVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXFRAGMENTDENSITYMAPLAYERS;

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
        MAXFRAGMENTDENSITYMAPLAYERS = layout.offsetof(2);
    }

    protected VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineFragmentDensityMapLayeredCreateInfoVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(address, container);
    }

    /**
     * Creates a {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code maxFragmentDensityMapLayers} field. */
    @NativeType("uint32_t")
    public int maxFragmentDensityMapLayers() { return nmaxFragmentDensityMapLayers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEFragmentDensityMapLayered#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE} value to the {@code sType} field. */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sType$Default() { return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxFragmentDensityMapLayers} field. */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE maxFragmentDensityMapLayers(@NativeType("uint32_t") int value) { nmaxFragmentDensityMapLayers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE set(
        int sType,
        long pNext,
        int maxFragmentDensityMapLayers
    ) {
        sType(sType);
        pNext(pNext);
        maxFragmentDensityMapLayers(maxFragmentDensityMapLayers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE set(VkPipelineFragmentDensityMapLayeredCreateInfoVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE malloc() {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE calloc() {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance allocated with {@link BufferUtils}. */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance for the specified memory address. */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE create(long address) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineFragmentDensityMapLayeredCreateInfoVALVE createSafe(long address) {
        return address == NULL ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(address, null);
    }

    /**
     * Returns a new {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE malloc(MemoryStack stack) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE calloc(MemoryStack stack) {
        return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.PNEXT); }
    /** Unsafe version of {@link #maxFragmentDensityMapLayers}. */
    public static int nmaxFragmentDensityMapLayers(long struct) { return memGetInt(struct + VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.MAXFRAGMENTDENSITYMAPLAYERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.PNEXT, value); }
    /** Unsafe version of {@link #maxFragmentDensityMapLayers(int) maxFragmentDensityMapLayers}. */
    public static void nmaxFragmentDensityMapLayers(long struct, int value) { memPutInt(struct + VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.MAXFRAGMENTDENSITYMAPLAYERS, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE} structs. */
    public static class Buffer extends StructBuffer<VkPipelineFragmentDensityMapLayeredCreateInfoVALVE, Buffer> implements NativeResource {

        private static final VkPipelineFragmentDensityMapLayeredCreateInfoVALVE ELEMENT_FACTORY = VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.create(-1L);

        /**
         * Creates a new {@code VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineFragmentDensityMapLayeredCreateInfoVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineFragmentDensityMapLayeredCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.npNext(address()); }
        /** @return the value of the {@code maxFragmentDensityMapLayers} field. */
        @NativeType("uint32_t")
        public int maxFragmentDensityMapLayers() { return VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nmaxFragmentDensityMapLayers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEFragmentDensityMapLayered#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE} value to the {@code sType} field. */
        public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer sType$Default() { return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer pNext(@NativeType("void const *") long value) { VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxFragmentDensityMapLayers} field. */
        public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.Buffer maxFragmentDensityMapLayers(@NativeType("uint32_t") int value) { VkPipelineFragmentDensityMapLayeredCreateInfoVALVE.nmaxFragmentDensityMapLayers(address(), value); return this; }

    }

}