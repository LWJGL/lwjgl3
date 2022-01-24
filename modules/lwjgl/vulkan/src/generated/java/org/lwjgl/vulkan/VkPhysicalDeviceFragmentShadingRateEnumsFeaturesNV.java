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
 * Structure indicating support for fragment shading rate enums.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #fragmentShadingRateEnums};
 *     VkBool32 {@link #supersampleFragmentShadingRates};
 *     VkBool32 {@link #noInvocationFragmentShadingRates};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSHADINGRATEENUMS,
        SUPERSAMPLEFRAGMENTSHADINGRATES,
        NOINVOCATIONFRAGMENTSHADINGRATES;

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
        FRAGMENTSHADINGRATEENUMS = layout.offsetof(2);
        SUPERSAMPLEFRAGMENTSHADINGRATES = layout.offsetof(3);
        NOINVOCATIONFRAGMENTSHADINGRATES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(ByteBuffer container) {
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
    /** indicates that the implementation supports specifying fragment shading rates using the {@code VkFragmentShadingRateNV} enumerated type. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateEnums() { return nfragmentShadingRateEnums(address()) != 0; }
    /** indicates that the implementation supports fragment shading rate enum values indicating more than one invocation per fragment. */
    @NativeType("VkBool32")
    public boolean supersampleFragmentShadingRates() { return nsupersampleFragmentShadingRates(address()) != 0; }
    /** indicates that the implementation supports a fragment shading rate enum value indicating that no fragment shaders should be invoked when that shading rate is used. */
    @NativeType("VkBool32")
    public boolean noInvocationFragmentShadingRates() { return nnoInvocationFragmentShadingRates(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentShadingRateEnums} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(@NativeType("VkBool32") boolean value) { nfragmentShadingRateEnums(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #supersampleFragmentShadingRates} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(@NativeType("VkBool32") boolean value) { nsupersampleFragmentShadingRates(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #noInvocationFragmentShadingRates} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(@NativeType("VkBool32") boolean value) { nnoInvocationFragmentShadingRates(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(
        int sType,
        long pNext,
        boolean fragmentShadingRateEnums,
        boolean supersampleFragmentShadingRates,
        boolean noInvocationFragmentShadingRates
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShadingRateEnums(fragmentShadingRateEnums);
        supersampleFragmentShadingRates(supersampleFragmentShadingRates);
        noInvocationFragmentShadingRates(noInvocationFragmentShadingRates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #fragmentShadingRateEnums}. */
    public static int nfragmentShadingRateEnums(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.FRAGMENTSHADINGRATEENUMS); }
    /** Unsafe version of {@link #supersampleFragmentShadingRates}. */
    public static int nsupersampleFragmentShadingRates(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.SUPERSAMPLEFRAGMENTSHADINGRATES); }
    /** Unsafe version of {@link #noInvocationFragmentShadingRates}. */
    public static int nnoInvocationFragmentShadingRates(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.NOINVOCATIONFRAGMENTSHADINGRATES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #fragmentShadingRateEnums(boolean) fragmentShadingRateEnums}. */
    public static void nfragmentShadingRateEnums(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.FRAGMENTSHADINGRATEENUMS, value); }
    /** Unsafe version of {@link #supersampleFragmentShadingRates(boolean) supersampleFragmentShadingRates}. */
    public static void nsupersampleFragmentShadingRates(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.SUPERSAMPLEFRAGMENTSHADINGRATES, value); }
    /** Unsafe version of {@link #noInvocationFragmentShadingRates(boolean) noInvocationFragmentShadingRates}. */
    public static void nnoInvocationFragmentShadingRates(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.NOINVOCATIONFRAGMENTSHADINGRATES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#fragmentShadingRateEnums} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateEnums() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nfragmentShadingRateEnums(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#supersampleFragmentShadingRates} field. */
        @NativeType("VkBool32")
        public boolean supersampleFragmentShadingRates() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsupersampleFragmentShadingRates(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#noInvocationFragmentShadingRates} field. */
        @NativeType("VkBool32")
        public boolean noInvocationFragmentShadingRates() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nnoInvocationFragmentShadingRates(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV} value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#fragmentShadingRateEnums} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer fragmentShadingRateEnums(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nfragmentShadingRateEnums(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#supersampleFragmentShadingRates} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer supersampleFragmentShadingRates(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsupersampleFragmentShadingRates(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#noInvocationFragmentShadingRates} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer noInvocationFragmentShadingRates(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nnoInvocationFragmentShadingRates(address(), value ? 1 : 0); return this; }

    }

}