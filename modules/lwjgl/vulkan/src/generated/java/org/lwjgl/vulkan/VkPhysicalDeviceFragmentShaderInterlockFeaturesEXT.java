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
 * Structure describing fragment shader interlock features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFragmentShaderInterlock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #fragmentShaderSampleInterlock};
 *     VkBool32 {@link #fragmentShaderPixelInterlock};
 *     VkBool32 {@link #fragmentShaderShadingRateInterlock};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSHADERSAMPLEINTERLOCK,
        FRAGMENTSHADERPIXELINTERLOCK,
        FRAGMENTSHADERSHADINGRATEINTERLOCK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSHADERSAMPLEINTERLOCK = layout.offsetof(2);
        FRAGMENTSHADERPIXELINTERLOCK = layout.offsetof(3);
        FRAGMENTSHADERSHADINGRATEINTERLOCK = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports the {@code FragmentShaderSampleInterlockEXT} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean fragmentShaderSampleInterlock() { return nfragmentShaderSampleInterlock(address()) != 0; }
    /** indicates that the implementation supports the {@code FragmentShaderPixelInterlockEXT} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean fragmentShaderPixelInterlock() { return nfragmentShaderPixelInterlock(address()) != 0; }
    /** indicates that the implementation supports the {@code FragmentShaderShadingRateInterlockEXT} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean fragmentShaderShadingRateInterlock() { return nfragmentShaderShadingRateInterlock(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentShaderInterlock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType$Default() { return sType(EXTFragmentShaderInterlock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentShaderSampleInterlock} field. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlock(@NativeType("VkBool32") boolean value) { nfragmentShaderSampleInterlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fragmentShaderPixelInterlock} field. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlock(@NativeType("VkBool32") boolean value) { nfragmentShaderPixelInterlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fragmentShaderShadingRateInterlock} field. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlock(@NativeType("VkBool32") boolean value) { nfragmentShaderShadingRateInterlock(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT set(
        int sType,
        long pNext,
        boolean fragmentShaderSampleInterlock,
        boolean fragmentShaderPixelInterlock,
        boolean fragmentShaderShadingRateInterlock
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShaderSampleInterlock(fragmentShaderSampleInterlock);
        fragmentShaderPixelInterlock(fragmentShaderPixelInterlock);
        fragmentShaderShadingRateInterlock(fragmentShaderShadingRateInterlock);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT set(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #fragmentShaderSampleInterlock}. */
    public static int nfragmentShaderSampleInterlock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.FRAGMENTSHADERSAMPLEINTERLOCK); }
    /** Unsafe version of {@link #fragmentShaderPixelInterlock}. */
    public static int nfragmentShaderPixelInterlock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.FRAGMENTSHADERPIXELINTERLOCK); }
    /** Unsafe version of {@link #fragmentShaderShadingRateInterlock}. */
    public static int nfragmentShaderShadingRateInterlock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.FRAGMENTSHADERSHADINGRATEINTERLOCK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #fragmentShaderSampleInterlock(boolean) fragmentShaderSampleInterlock}. */
    public static void nfragmentShaderSampleInterlock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.FRAGMENTSHADERSAMPLEINTERLOCK, value); }
    /** Unsafe version of {@link #fragmentShaderPixelInterlock(boolean) fragmentShaderPixelInterlock}. */
    public static void nfragmentShaderPixelInterlock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.FRAGMENTSHADERPIXELINTERLOCK, value); }
    /** Unsafe version of {@link #fragmentShaderShadingRateInterlock(boolean) fragmentShaderShadingRateInterlock}. */
    public static void nfragmentShaderShadingRateInterlock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.FRAGMENTSHADERSHADINGRATEINTERLOCK, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#fragmentShaderSampleInterlock} field. */
        @NativeType("VkBool32")
        public boolean fragmentShaderSampleInterlock() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderSampleInterlock(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#fragmentShaderPixelInterlock} field. */
        @NativeType("VkBool32")
        public boolean fragmentShaderPixelInterlock() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderPixelInterlock(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#fragmentShaderShadingRateInterlock} field. */
        @NativeType("VkBool32")
        public boolean fragmentShaderShadingRateInterlock() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderShadingRateInterlock(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#sType} field. */
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentShaderInterlock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT} value to the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#sType} field. */
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer sType$Default() { return sType(EXTFragmentShaderInterlock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#fragmentShaderSampleInterlock} field. */
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer fragmentShaderSampleInterlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderSampleInterlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#fragmentShaderPixelInterlock} field. */
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer fragmentShaderPixelInterlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderPixelInterlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#fragmentShaderShadingRateInterlock} field. */
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer fragmentShaderShadingRateInterlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.nfragmentShaderShadingRateInterlock(address(), value ? 1 : 0); return this; }

    }

}