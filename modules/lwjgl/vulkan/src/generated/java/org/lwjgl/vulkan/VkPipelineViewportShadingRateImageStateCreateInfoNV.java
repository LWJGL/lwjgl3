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
 * Structure specifying parameters controlling shading rate image usage.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code shadingRateImageEnable} is considered to be {@link VK10#VK_FALSE FALSE}, and the shading rate image and palettes are not used.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 0 or 1</li>
 * <li>{@code viewportCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
 * <li>If {@code shadingRateImageEnable} is {@link VK10#VK_TRUE TRUE}, {@code viewportCount} <b>must</b> be equal to the {@code viewportCount} member of {@link VkPipelineViewportStateCreateInfo}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV}, {@code pShadingRatePalettes} <b>must</b> be a valid pointer to an array of {@code viewportCount} {@link VkShadingRatePaletteNV} structures</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV}</li>
 * <li>If {@code viewportCount} is not 0, and {@code pShadingRatePalettes} is not {@code NULL}, {@code pShadingRatePalettes} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkShadingRatePaletteNV} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkShadingRatePaletteNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code shadingRateImageEnable} &ndash; specifies whether shading rate image and palettes are used during rasterization.</li>
 * <li>{@code viewportCount} &ndash; specifies the number of per-viewport palettes used to translate values stored in shading rate images.</li>
 * <li>{@code pShadingRatePalettes} &ndash; a pointer to an array of {@link VkShadingRatePaletteNV} structures defining the palette for each viewport. If the shading rate palette state is dynamic, this member is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 shadingRateImageEnable;
 *     uint32_t viewportCount;
 *     {@link VkShadingRatePaletteNV VkShadingRatePaletteNV} const * pShadingRatePalettes;
 * }</code></pre>
 */
public class VkPipelineViewportShadingRateImageStateCreateInfoNV extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shadingRateImageEnable} field. */
    @NativeType("VkBool32")
    public boolean shadingRateImageEnable() { return nshadingRateImageEnable(address()) != 0; }
    /** Returns the value of the {@code viewportCount} field. */
    @NativeType("uint32_t")
    public int viewportCount() { return nviewportCount(address()); }
    /** Returns a {@link VkShadingRatePaletteNV.Buffer} view of the struct array pointed to by the {@code pShadingRatePalettes} field. */
    @Nullable
    @NativeType("VkShadingRatePaletteNV const *")
    public VkShadingRatePaletteNV.Buffer pShadingRatePalettes() { return npShadingRatePalettes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shadingRateImageEnable} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(@NativeType("VkBool32") boolean value) { nshadingRateImageEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code viewportCount} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(@NativeType("uint32_t") int value) { nviewportCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkShadingRatePaletteNV.Buffer} to the {@code pShadingRatePalettes} field. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(@Nullable @NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer value) { npShadingRatePalettes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(
        int sType,
        long pNext,
        boolean shadingRateImageEnable,
        int viewportCount,
        @Nullable VkShadingRatePaletteNV.Buffer pShadingRatePalettes
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
        return wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV calloc() {
        return wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV create(long address) {
        return wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV callocStack(MemoryStack stack) {
        return wrap(VkPipelineViewportShadingRateImageStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateImageEnable}. */
    public static int nshadingRateImageEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.SHADINGRATEIMAGEENABLE); }
    /** Unsafe version of {@link #viewportCount}. */
    public static int nviewportCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.VIEWPORTCOUNT); }
    /** Unsafe version of {@link #pShadingRatePalettes}. */
    @Nullable public static VkShadingRatePaletteNV.Buffer npShadingRatePalettes(long struct) { return VkShadingRatePaletteNV.createSafe(memGetAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PSHADINGRATEPALETTES), nviewportCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #shadingRateImageEnable(boolean) shadingRateImageEnable}. */
    public static void nshadingRateImageEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.SHADINGRATEIMAGEENABLE, value); }
    /** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
    public static void nviewportCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.VIEWPORTCOUNT, value); }
    /** Unsafe version of {@link #pShadingRatePalettes(VkShadingRatePaletteNV.Buffer) pShadingRatePalettes}. */
    public static void npShadingRatePalettes(long struct, @Nullable VkShadingRatePaletteNV.Buffer value) { memPutAddress(struct + VkPipelineViewportShadingRateImageStateCreateInfoNV.PSHADINGRATEPALETTES, memAddressSafe(value)); if (value != null) { nviewportCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportShadingRateImageStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportShadingRateImageStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineViewportShadingRateImageStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportShadingRateImageStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportShadingRateImageStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineViewportShadingRateImageStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code shadingRateImageEnable} field. */
        @NativeType("VkBool32")
        public boolean shadingRateImageEnable() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.nshadingRateImageEnable(address()) != 0; }
        /** Returns the value of the {@code viewportCount} field. */
        @NativeType("uint32_t")
        public int viewportCount() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.nviewportCount(address()); }
        /** Returns a {@link VkShadingRatePaletteNV.Buffer} view of the struct array pointed to by the {@code pShadingRatePalettes} field. */
        @Nullable
        @NativeType("VkShadingRatePaletteNV const *")
        public VkShadingRatePaletteNV.Buffer pShadingRatePalettes() { return VkPipelineViewportShadingRateImageStateCreateInfoNV.npShadingRatePalettes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shadingRateImageEnable} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer shadingRateImageEnable(@NativeType("VkBool32") boolean value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.nshadingRateImageEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code viewportCount} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer viewportCount(@NativeType("uint32_t") int value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.nviewportCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkShadingRatePaletteNV.Buffer} to the {@code pShadingRatePalettes} field. */
        public VkPipelineViewportShadingRateImageStateCreateInfoNV.Buffer pShadingRatePalettes(@Nullable @NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer value) { VkPipelineViewportShadingRateImageStateCreateInfoNV.npShadingRatePalettes(address(), value); return this; }

    }

}