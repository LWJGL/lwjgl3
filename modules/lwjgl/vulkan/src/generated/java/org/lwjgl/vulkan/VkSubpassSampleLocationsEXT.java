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
 * Structure specifying the sample locations state to use for layout transitions of attachments performed after a given subpass.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the image referenced by the depth/stencil attachment used in the subpass identified by {@code subpassIndex} was not created with {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} or if the subpass does not use a depth/stencil attachment, and {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}{@code ::variableSampleLocations} is {@link VK10#VK_TRUE TRUE} then the values specified in {@code sampleLocationsInfo} are ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code subpassIndex} <b>must</b> be less than the {@code subpassCount} specified in {@link VkRenderPassCreateInfo} the render pass specified by {@link VkRenderPassBeginInfo}{@code ::renderPass} was created with</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sampleLocationsInfo} <b>must</b> be a valid {@link VkSampleLocationsInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassSampleLocationsBeginInfoEXT}, {@link VkSampleLocationsInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassSampleLocationsEXT {
 *     uint32_t {@link #subpassIndex};
 *     {@link VkSampleLocationsInfoEXT VkSampleLocationsInfoEXT} {@link #sampleLocationsInfo};
 * }</code></pre>
 */
public class VkSubpassSampleLocationsEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUBPASSINDEX,
        SAMPLELOCATIONSINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkSampleLocationsInfoEXT.SIZEOF, VkSampleLocationsInfoEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBPASSINDEX = layout.offsetof(0);
        SAMPLELOCATIONSINFO = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkSubpassSampleLocationsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassSampleLocationsEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the index of the subpass for which the sample locations state is provided. */
    @NativeType("uint32_t")
    public int subpassIndex() { return nsubpassIndex(address()); }
    /** the sample locations state to use for the layout transition of the depth/stencil attachment away from the image layout the attachment is used with in the subpass specified in {@code subpassIndex}. */
    public VkSampleLocationsInfoEXT sampleLocationsInfo() { return nsampleLocationsInfo(address()); }

    /** Sets the specified value to the {@link #subpassIndex} field. */
    public VkSubpassSampleLocationsEXT subpassIndex(@NativeType("uint32_t") int value) { nsubpassIndex(address(), value); return this; }
    /** Copies the specified {@link VkSampleLocationsInfoEXT} to the {@link #sampleLocationsInfo} field. */
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(VkSampleLocationsInfoEXT value) { nsampleLocationsInfo(address(), value); return this; }
    /** Passes the {@link #sampleLocationsInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(java.util.function.Consumer<VkSampleLocationsInfoEXT> consumer) { consumer.accept(sampleLocationsInfo()); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassSampleLocationsEXT set(
        int subpassIndex,
        VkSampleLocationsInfoEXT sampleLocationsInfo
    ) {
        subpassIndex(subpassIndex);
        sampleLocationsInfo(sampleLocationsInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassSampleLocationsEXT set(VkSubpassSampleLocationsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassSampleLocationsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassSampleLocationsEXT malloc() {
        return wrap(VkSubpassSampleLocationsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassSampleLocationsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassSampleLocationsEXT calloc() {
        return wrap(VkSubpassSampleLocationsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassSampleLocationsEXT} instance allocated with {@link BufferUtils}. */
    public static VkSubpassSampleLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassSampleLocationsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassSampleLocationsEXT} instance for the specified memory address. */
    public static VkSubpassSampleLocationsEXT create(long address) {
        return wrap(VkSubpassSampleLocationsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassSampleLocationsEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassSampleLocationsEXT.class, address);
    }

    /**
     * Returns a new {@link VkSubpassSampleLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassSampleLocationsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassSampleLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassSampleLocationsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassSampleLocationsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassSampleLocationsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassSampleLocationsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassSampleLocationsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassSampleLocationsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassSampleLocationsEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubpassSampleLocationsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassSampleLocationsEXT malloc(MemoryStack stack) {
        return wrap(VkSubpassSampleLocationsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassSampleLocationsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassSampleLocationsEXT calloc(MemoryStack stack) {
        return wrap(VkSubpassSampleLocationsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassSampleLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassSampleLocationsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassSampleLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassSampleLocationsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subpassIndex}. */
    public static int nsubpassIndex(long struct) { return UNSAFE.getInt(null, struct + VkSubpassSampleLocationsEXT.SUBPASSINDEX); }
    /** Unsafe version of {@link #sampleLocationsInfo}. */
    public static VkSampleLocationsInfoEXT nsampleLocationsInfo(long struct) { return VkSampleLocationsInfoEXT.create(struct + VkSubpassSampleLocationsEXT.SAMPLELOCATIONSINFO); }

    /** Unsafe version of {@link #subpassIndex(int) subpassIndex}. */
    public static void nsubpassIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassSampleLocationsEXT.SUBPASSINDEX, value); }
    /** Unsafe version of {@link #sampleLocationsInfo(VkSampleLocationsInfoEXT) sampleLocationsInfo}. */
    public static void nsampleLocationsInfo(long struct, VkSampleLocationsInfoEXT value) { memCopy(value.address(), struct + VkSubpassSampleLocationsEXT.SAMPLELOCATIONSINFO, VkSampleLocationsInfoEXT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkSampleLocationsInfoEXT.validate(struct + VkSubpassSampleLocationsEXT.SAMPLELOCATIONSINFO);
    }

    // -----------------------------------

    /** An array of {@link VkSubpassSampleLocationsEXT} structs. */
    public static class Buffer extends StructBuffer<VkSubpassSampleLocationsEXT, Buffer> implements NativeResource {

        private static final VkSubpassSampleLocationsEXT ELEMENT_FACTORY = VkSubpassSampleLocationsEXT.create(-1L);

        /**
         * Creates a new {@code VkSubpassSampleLocationsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassSampleLocationsEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassSampleLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassSampleLocationsEXT#subpassIndex} field. */
        @NativeType("uint32_t")
        public int subpassIndex() { return VkSubpassSampleLocationsEXT.nsubpassIndex(address()); }
        /** @return a {@link VkSampleLocationsInfoEXT} view of the {@link VkSubpassSampleLocationsEXT#sampleLocationsInfo} field. */
        public VkSampleLocationsInfoEXT sampleLocationsInfo() { return VkSubpassSampleLocationsEXT.nsampleLocationsInfo(address()); }

        /** Sets the specified value to the {@link VkSubpassSampleLocationsEXT#subpassIndex} field. */
        public VkSubpassSampleLocationsEXT.Buffer subpassIndex(@NativeType("uint32_t") int value) { VkSubpassSampleLocationsEXT.nsubpassIndex(address(), value); return this; }
        /** Copies the specified {@link VkSampleLocationsInfoEXT} to the {@link VkSubpassSampleLocationsEXT#sampleLocationsInfo} field. */
        public VkSubpassSampleLocationsEXT.Buffer sampleLocationsInfo(VkSampleLocationsInfoEXT value) { VkSubpassSampleLocationsEXT.nsampleLocationsInfo(address(), value); return this; }
        /** Passes the {@link VkSubpassSampleLocationsEXT#sampleLocationsInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSubpassSampleLocationsEXT.Buffer sampleLocationsInfo(java.util.function.Consumer<VkSampleLocationsInfoEXT> consumer) { consumer.accept(sampleLocationsInfo()); return this; }

    }

}