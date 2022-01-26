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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters controlling shading rate image usage.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkCoarseSampleOrderCustomNV} structure is used with a coverage sample ordering type of {@link NVShadingRateImage#VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV} to specify the order of coverage samples for one combination of fragment width, fragment height, and coverage sample count.</p>
 * 
 * <p>When using a custom sample ordering, element <em>j</em> in {@code pSampleLocations} specifies a specific pixel location and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling-coverage-mask">sample index</a> that corresponds to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling-coverage-mask">coverage index</a> <em>j</em> in the multi-pixel fragment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code shadingRate} <b>must</b> be a shading rate that generates fragments with more than one pixel</li>
 * <li>{@code sampleCount} <b>must</b> correspond to a sample count enumerated in {@code VkSampleCountFlags} whose corresponding bit is set in {@link VkPhysicalDeviceLimits}{@code ::framebufferNoAttachmentsSampleCounts}</li>
 * <li>{@code sampleLocationCount} <b>must</b> be equal to the product of {@code sampleCount}, the fragment width for {@code shadingRate}, and the fragment height for {@code shadingRate}</li>
 * <li>{@code sampleLocationCount} <b>must</b> be less than or equal to the value of {@link VkPhysicalDeviceShadingRateImagePropertiesNV}{@code ::shadingRateMaxCoarseSamples}</li>
 * <li>The array {@code pSampleLocations} <b>must</b> contain exactly one entry for every combination of valid values for {@code pixelX}, {@code pixelY}, and {@code sample} in the structure {@link VkCoarseSampleOrderCustomNV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code shadingRate} <b>must</b> be a valid {@code VkShadingRatePaletteEntryNV} value</li>
 * <li>{@code pSampleLocations} <b>must</b> be a valid pointer to an array of {@code sampleLocationCount} {@link VkCoarseSampleLocationNV} structures</li>
 * <li>{@code sampleLocationCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCoarseSampleLocationNV}, {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV}, {@link NVShadingRateImage#vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCoarseSampleOrderCustomNV {
 *     VkShadingRatePaletteEntryNV {@link #shadingRate};
 *     uint32_t {@link #sampleCount};
 *     uint32_t {@link #sampleLocationCount};
 *     {@link VkCoarseSampleLocationNV VkCoarseSampleLocationNV} const * {@link #pSampleLocations};
 * }</code></pre>
 */
public class VkCoarseSampleOrderCustomNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHADINGRATE,
        SAMPLECOUNT,
        SAMPLELOCATIONCOUNT,
        PSAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHADINGRATE = layout.offsetof(0);
        SAMPLECOUNT = layout.offsetof(1);
        SAMPLELOCATIONCOUNT = layout.offsetof(2);
        PSAMPLELOCATIONS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCoarseSampleOrderCustomNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCoarseSampleOrderCustomNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a shading rate palette entry that identifies the fragment width and height for the combination of fragment area and per-pixel coverage sample count to control. */
    @NativeType("VkShadingRatePaletteEntryNV")
    public int shadingRate() { return nshadingRate(address()); }
    /** identifies the per-pixel coverage sample count for the combination of fragment area and coverage sample count to control. */
    @NativeType("uint32_t")
    public int sampleCount() { return nsampleCount(address()); }
    /** specifies the number of sample locations in the custom ordering. */
    @NativeType("uint32_t")
    public int sampleLocationCount() { return nsampleLocationCount(address()); }
    /** a pointer to an array of {@link VkCoarseSampleLocationNV} structures specifying the location of each sample in the custom ordering. */
    @NativeType("VkCoarseSampleLocationNV const *")
    public VkCoarseSampleLocationNV.Buffer pSampleLocations() { return npSampleLocations(address()); }

    /** Sets the specified value to the {@link #shadingRate} field. */
    public VkCoarseSampleOrderCustomNV shadingRate(@NativeType("VkShadingRatePaletteEntryNV") int value) { nshadingRate(address(), value); return this; }
    /** Sets the specified value to the {@link #sampleCount} field. */
    public VkCoarseSampleOrderCustomNV sampleCount(@NativeType("uint32_t") int value) { nsampleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkCoarseSampleLocationNV.Buffer} to the {@link #pSampleLocations} field. */
    public VkCoarseSampleOrderCustomNV pSampleLocations(@NativeType("VkCoarseSampleLocationNV const *") VkCoarseSampleLocationNV.Buffer value) { npSampleLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCoarseSampleOrderCustomNV set(
        int shadingRate,
        int sampleCount,
        VkCoarseSampleLocationNV.Buffer pSampleLocations
    ) {
        shadingRate(shadingRate);
        sampleCount(sampleCount);
        pSampleLocations(pSampleLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCoarseSampleOrderCustomNV set(VkCoarseSampleOrderCustomNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCoarseSampleOrderCustomNV malloc() {
        return wrap(VkCoarseSampleOrderCustomNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCoarseSampleOrderCustomNV calloc() {
        return wrap(VkCoarseSampleOrderCustomNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated with {@link BufferUtils}. */
    public static VkCoarseSampleOrderCustomNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCoarseSampleOrderCustomNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance for the specified memory address. */
    public static VkCoarseSampleOrderCustomNV create(long address) {
        return wrap(VkCoarseSampleOrderCustomNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCoarseSampleOrderCustomNV createSafe(long address) {
        return address == NULL ? null : wrap(VkCoarseSampleOrderCustomNV.class, address);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCoarseSampleOrderCustomNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCoarseSampleOrderCustomNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCoarseSampleOrderCustomNV malloc(MemoryStack stack) {
        return wrap(VkCoarseSampleOrderCustomNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCoarseSampleOrderCustomNV calloc(MemoryStack stack) {
        return wrap(VkCoarseSampleOrderCustomNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #shadingRate}. */
    public static int nshadingRate(long struct) { return UNSAFE.getInt(null, struct + VkCoarseSampleOrderCustomNV.SHADINGRATE); }
    /** Unsafe version of {@link #sampleCount}. */
    public static int nsampleCount(long struct) { return UNSAFE.getInt(null, struct + VkCoarseSampleOrderCustomNV.SAMPLECOUNT); }
    /** Unsafe version of {@link #sampleLocationCount}. */
    public static int nsampleLocationCount(long struct) { return UNSAFE.getInt(null, struct + VkCoarseSampleOrderCustomNV.SAMPLELOCATIONCOUNT); }
    /** Unsafe version of {@link #pSampleLocations}. */
    public static VkCoarseSampleLocationNV.Buffer npSampleLocations(long struct) { return VkCoarseSampleLocationNV.create(memGetAddress(struct + VkCoarseSampleOrderCustomNV.PSAMPLELOCATIONS), nsampleLocationCount(struct)); }

    /** Unsafe version of {@link #shadingRate(int) shadingRate}. */
    public static void nshadingRate(long struct, int value) { UNSAFE.putInt(null, struct + VkCoarseSampleOrderCustomNV.SHADINGRATE, value); }
    /** Unsafe version of {@link #sampleCount(int) sampleCount}. */
    public static void nsampleCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCoarseSampleOrderCustomNV.SAMPLECOUNT, value); }
    /** Sets the specified value to the {@code sampleLocationCount} field of the specified {@code struct}. */
    public static void nsampleLocationCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCoarseSampleOrderCustomNV.SAMPLELOCATIONCOUNT, value); }
    /** Unsafe version of {@link #pSampleLocations(VkCoarseSampleLocationNV.Buffer) pSampleLocations}. */
    public static void npSampleLocations(long struct, VkCoarseSampleLocationNV.Buffer value) { memPutAddress(struct + VkCoarseSampleOrderCustomNV.PSAMPLELOCATIONS, value.address()); nsampleLocationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCoarseSampleOrderCustomNV.PSAMPLELOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCoarseSampleOrderCustomNV} structs. */
    public static class Buffer extends StructBuffer<VkCoarseSampleOrderCustomNV, Buffer> implements NativeResource {

        private static final VkCoarseSampleOrderCustomNV ELEMENT_FACTORY = VkCoarseSampleOrderCustomNV.create(-1L);

        /**
         * Creates a new {@code VkCoarseSampleOrderCustomNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCoarseSampleOrderCustomNV#SIZEOF}, and its mark will be undefined.
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
        protected VkCoarseSampleOrderCustomNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCoarseSampleOrderCustomNV#shadingRate} field. */
        @NativeType("VkShadingRatePaletteEntryNV")
        public int shadingRate() { return VkCoarseSampleOrderCustomNV.nshadingRate(address()); }
        /** @return the value of the {@link VkCoarseSampleOrderCustomNV#sampleCount} field. */
        @NativeType("uint32_t")
        public int sampleCount() { return VkCoarseSampleOrderCustomNV.nsampleCount(address()); }
        /** @return the value of the {@link VkCoarseSampleOrderCustomNV#sampleLocationCount} field. */
        @NativeType("uint32_t")
        public int sampleLocationCount() { return VkCoarseSampleOrderCustomNV.nsampleLocationCount(address()); }
        /** @return a {@link VkCoarseSampleLocationNV.Buffer} view of the struct array pointed to by the {@link VkCoarseSampleOrderCustomNV#pSampleLocations} field. */
        @NativeType("VkCoarseSampleLocationNV const *")
        public VkCoarseSampleLocationNV.Buffer pSampleLocations() { return VkCoarseSampleOrderCustomNV.npSampleLocations(address()); }

        /** Sets the specified value to the {@link VkCoarseSampleOrderCustomNV#shadingRate} field. */
        public VkCoarseSampleOrderCustomNV.Buffer shadingRate(@NativeType("VkShadingRatePaletteEntryNV") int value) { VkCoarseSampleOrderCustomNV.nshadingRate(address(), value); return this; }
        /** Sets the specified value to the {@link VkCoarseSampleOrderCustomNV#sampleCount} field. */
        public VkCoarseSampleOrderCustomNV.Buffer sampleCount(@NativeType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.nsampleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkCoarseSampleLocationNV.Buffer} to the {@link VkCoarseSampleOrderCustomNV#pSampleLocations} field. */
        public VkCoarseSampleOrderCustomNV.Buffer pSampleLocations(@NativeType("VkCoarseSampleLocationNV const *") VkCoarseSampleLocationNV.Buffer value) { VkCoarseSampleOrderCustomNV.npSampleLocations(address(), value); return this; }

    }

}