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
 * Structure describing support for legacy dithering.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTLegacyDithering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLegacyDitheringFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #legacyDithering};
 * }</code></pre>
 */
public class VkPhysicalDeviceLegacyDitheringFeaturesEXT extends Struct<VkPhysicalDeviceLegacyDitheringFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LEGACYDITHERING;

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
        LEGACYDITHERING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceLegacyDitheringFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLegacyDitheringFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-legacy-dithering">Legacy Dithering</a>. */
    @NativeType("VkBool32")
    public boolean legacyDithering() { return nlegacyDithering(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTLegacyDithering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT sType$Default() { return sType(EXTLegacyDithering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #legacyDithering} field. */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT legacyDithering(@NativeType("VkBool32") boolean value) { nlegacyDithering(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT set(
        int sType,
        long pNext,
        boolean legacyDithering
    ) {
        sType(sType);
        pNext(pNext);
        legacyDithering(legacyDithering);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT set(VkPhysicalDeviceLegacyDitheringFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT malloc() {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT calloc() {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT create(long address) {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLegacyDitheringFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLegacyDitheringFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLegacyDitheringFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #legacyDithering}. */
    public static int nlegacyDithering(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLegacyDitheringFeaturesEXT.LEGACYDITHERING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLegacyDitheringFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLegacyDitheringFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #legacyDithering(boolean) legacyDithering}. */
    public static void nlegacyDithering(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLegacyDitheringFeaturesEXT.LEGACYDITHERING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLegacyDitheringFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLegacyDitheringFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceLegacyDitheringFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLegacyDitheringFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLegacyDitheringFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLegacyDitheringFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#legacyDithering} field. */
        @NativeType("VkBool32")
        public boolean legacyDithering() { return VkPhysicalDeviceLegacyDitheringFeaturesEXT.nlegacyDithering(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#sType} field. */
        public VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLegacyDitheringFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTLegacyDithering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT} value to the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#sType} field. */
        public VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer sType$Default() { return sType(EXTLegacyDithering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLegacyDitheringFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT#legacyDithering} field. */
        public VkPhysicalDeviceLegacyDitheringFeaturesEXT.Buffer legacyDithering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLegacyDitheringFeaturesEXT.nlegacyDithering(address(), value ? 1 : 0); return this; }

    }

}