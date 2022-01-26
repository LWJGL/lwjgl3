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
 * Structure specifying image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The bits reported in {@code linearTilingFeatures}, {@code optimalTilingFeatures} and {@code bufferFeatures} <b>must</b> include the bits reported in the corresponding fields of {@link VkFormatProperties2}{@code ::formatProperties}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 STRUCTURE_TYPE_FORMAT_PROPERTIES_3}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFormatProperties3 {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormatFeatureFlags2 {@link #linearTilingFeatures};
 *     VkFormatFeatureFlags2 {@link #optimalTilingFeatures};
 *     VkFormatFeatureFlags2 {@link #bufferFeatures};
 * }</code></pre>
 */
public class VkFormatProperties3 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LINEARTILINGFEATURES,
        OPTIMALTILINGFEATURES,
        BUFFERFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINEARTILINGFEATURES = layout.offsetof(2);
        OPTIMALTILINGFEATURES = layout.offsetof(3);
        BUFFERFEATURES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkFormatProperties3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFormatProperties3(ByteBuffer container) {
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
    /** a bitmask of {@code VkFormatFeatureFlagBits2} specifying features supported by images created with a {@code tiling} parameter of {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}. */
    @NativeType("VkFormatFeatureFlags2")
    public long linearTilingFeatures() { return nlinearTilingFeatures(address()); }
    /** a bitmask of {@code VkFormatFeatureFlagBits2} specifying features supported by images created with a {@code tiling} parameter of {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. */
    @NativeType("VkFormatFeatureFlags2")
    public long optimalTilingFeatures() { return noptimalTilingFeatures(address()); }
    /** a bitmask of {@code VkFormatFeatureFlagBits2} specifying features supported by buffers. */
    @NativeType("VkFormatFeatureFlags2")
    public long bufferFeatures() { return nbufferFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFormatProperties3 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 STRUCTURE_TYPE_FORMAT_PROPERTIES_3} value to the {@code sType} field. */
    public VkFormatProperties3 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFormatProperties3 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFormatProperties3 set(
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
    public VkFormatProperties3 set(VkFormatProperties3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFormatProperties3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFormatProperties3 malloc() {
        return wrap(VkFormatProperties3.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFormatProperties3 calloc() {
        return wrap(VkFormatProperties3.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties3} instance allocated with {@link BufferUtils}. */
    public static VkFormatProperties3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFormatProperties3.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFormatProperties3} instance for the specified memory address. */
    public static VkFormatProperties3 create(long address) {
        return wrap(VkFormatProperties3.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties3 createSafe(long address) {
        return address == NULL ? null : wrap(VkFormatProperties3.class, address);
    }

    /**
     * Returns a new {@link VkFormatProperties3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFormatProperties3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties3.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkFormatProperties3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties3 malloc(MemoryStack stack) {
        return wrap(VkFormatProperties3.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFormatProperties3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties3 calloc(MemoryStack stack) {
        return wrap(VkFormatProperties3.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFormatProperties3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFormatProperties3.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFormatProperties3.PNEXT); }
    /** Unsafe version of {@link #linearTilingFeatures}. */
    public static long nlinearTilingFeatures(long struct) { return UNSAFE.getLong(null, struct + VkFormatProperties3.LINEARTILINGFEATURES); }
    /** Unsafe version of {@link #optimalTilingFeatures}. */
    public static long noptimalTilingFeatures(long struct) { return UNSAFE.getLong(null, struct + VkFormatProperties3.OPTIMALTILINGFEATURES); }
    /** Unsafe version of {@link #bufferFeatures}. */
    public static long nbufferFeatures(long struct) { return UNSAFE.getLong(null, struct + VkFormatProperties3.BUFFERFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFormatProperties3.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFormatProperties3.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkFormatProperties3} structs. */
    public static class Buffer extends StructBuffer<VkFormatProperties3, Buffer> implements NativeResource {

        private static final VkFormatProperties3 ELEMENT_FACTORY = VkFormatProperties3.create(-1L);

        /**
         * Creates a new {@code VkFormatProperties3.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFormatProperties3#SIZEOF}, and its mark will be undefined.
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
        protected VkFormatProperties3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFormatProperties3.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkFormatProperties3.npNext(address()); }
        /** @return the value of the {@link VkFormatProperties3#linearTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long linearTilingFeatures() { return VkFormatProperties3.nlinearTilingFeatures(address()); }
        /** @return the value of the {@link VkFormatProperties3#optimalTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long optimalTilingFeatures() { return VkFormatProperties3.noptimalTilingFeatures(address()); }
        /** @return the value of the {@link VkFormatProperties3#bufferFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long bufferFeatures() { return VkFormatProperties3.nbufferFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFormatProperties3.Buffer sType(@NativeType("VkStructureType") int value) { VkFormatProperties3.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 STRUCTURE_TYPE_FORMAT_PROPERTIES_3} value to the {@code sType} field. */
        public VkFormatProperties3.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFormatProperties3.Buffer pNext(@NativeType("void *") long value) { VkFormatProperties3.npNext(address(), value); return this; }

    }

}