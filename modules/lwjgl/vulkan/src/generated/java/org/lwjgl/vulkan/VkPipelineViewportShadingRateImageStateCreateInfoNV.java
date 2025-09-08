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
 * <pre><code>
 * struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 shadingRateImageEnable;
 *     uint32_t viewportCount;
 *     {@link VkShadingRatePaletteNV VkShadingRatePaletteNV} const * pShadingRatePalettes;
 * }</code></pre>
 */
public class VkPipelineViewportShadingRateImageStateCreateInfoNV extends Struct<VkPipelineViewportShadingRateImageStateCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADINGRATEIMAGEENABLE,
        VIEWPORTCOUNT,
        PSHADINGRATEPALETTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATEIMAGEENABLE = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PSHADINGRATEPALETTES = layout.offsetof(4);
    }

    protected VkPipelineViewportShadingRateImageStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportShadingRateImageStateCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code shadingRateImageEnable} field. */
    @NativeType("VkBool32")
    public boolean shadingRateImageEnable() { return nshadingRateImageEnable(address()) != 0; }
    /** @return the value of the {@code viewportCount} field. */
    @NativeType("uint32_t")
    public int viewportCount() { return nviewportCount(address()); }
    /** @return a {@link VkShadingRatePaletteNV.Buffer} view of the struct array pointed to by the {@code pShadingRatePalettes} field. */
    @NativeType("VkShadingRatePaletteNV const *")
    public VkShadingRatePaletteNV.@Nullable Buffer pShadingRatePalettes() { return npShadingRatePalettes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shadingRateImageEnable} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(@NativeType("VkBool32") boolean value) { nshadingRateImageEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code viewportCount} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(@NativeType("uint32_t") int value) { nviewportCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkShadingRatePaletteNV.Buffer} to the {@code pShadingRatePalettes} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(@NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.@Nullable Buffer value) { npShadingRatePalettes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(
        int sType,
        long pNext,
        boolean shadingRateImageEnable,
        int viewportCount,
        VkShadingRatePaletteNV.@Nullable Buffer pShadingRatePalettes
    ) {
        sType(sType);
        pNext(pNext);
        shadingRateImageEnable(shadingRateImageEnable);
        viewportCount(viewportCount);
        pShadingRatePalettes(pShadingRatePalettes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(VkPipelineViewportShadingRateImageStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV malloc() {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV calloc() {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV create(long address) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineViewportShadingRateImageStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateImageEnable}. */
    public static int nshadingRateImageEnable(long struct) { return memGetInt(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.SHADINGRATEIMAGEENABLE); }
    /** Unsafe version of {@link #viewportCount}. */
    public static int nviewportCount(long struct) { return memGetInt(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.VIEWPORTCOUNT); }
    /** Unsafe version of {@link #pShadingRatePalettes}. */
    public static VkShadingRatePaletteNV.@Nullable Buffer npShadingRatePalettes(long struct) { return VkShadingRatePaletteNV.createSafe(memGetAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PSHADINGRATEPALETTES), nviewportCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #shadingRateImageEnable(boolean) shadingRateImageEnable}. */
    public static void nshadingRateImageEnable(long struct, int value) { memPutInt(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.SHADINGRATEIMAGEENABLE, value); }
    /** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
    public static void nviewportCount(long struct, int value) { memPutInt(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.VIEWPORTCOUNT, value); }
    /** Unsafe version of {@link #pShadingRatePalettes(VkShadingRatePaletteNV.Buffer) pShadingRatePalettes}. */
    public static void npShadingRatePalettes(long struct, VkShadingRatePaletteNV.@Nullable Buffer value) { memPutAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PSHADINGRATEPALETTES, memAddressSafe(value)); if (value != null) { nviewportCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportShadingRateImageStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportShadingRateImageStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineViewportShadingRateImageStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportShadingRateImageStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportShadingRateImageStateCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportShadingRateImageStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code shadingRateImageEnable} field. */
        @NativeType("VkBool32")
        public boolean shadingRateImageEnable() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.nshadingRateImageEnable(address()) != 0; }
        /** @return the value of the {@code viewportCount} field. */
        @NativeType("uint32_t")
        public int viewportCount() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.nviewportCount(address()); }
        /** @return a {@link VkShadingRatePaletteNV.Buffer} view of the struct array pointed to by the {@code pShadingRatePalettes} field. */
        @NativeType("VkShadingRatePaletteNV const *")
        public VkShadingRatePaletteNV.@Nullable Buffer pShadingRatePalettes() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.npShadingRatePalettes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shadingRateImageEnable} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer shadingRateImageEnable(@NativeType("VkBool32") boolean value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.nshadingRateImageEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code viewportCount} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer viewportCount(@NativeType("uint32_t") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.nviewportCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkShadingRatePaletteNV.Buffer} to the {@code pShadingRatePalettes} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer pShadingRatePalettes(@NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.@Nullable Buffer value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.npShadingRatePalettes(address(), value); return this; }

    }

}