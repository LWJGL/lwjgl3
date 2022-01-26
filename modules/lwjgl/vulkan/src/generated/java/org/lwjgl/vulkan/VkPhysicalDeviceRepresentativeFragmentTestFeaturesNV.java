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
 * Structure describing the representative fragment test features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #representativeFragmentTest};
 * }</code></pre>
 */
public class VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REPRESENTATIVEFRAGMENTTEST;

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
        REPRESENTATIVEFRAGMENTTEST = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports the representative fragment test. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-rep-frag-test">Representative Fragment Test</a>. */
    @NativeType("VkBool32")
    public boolean representativeFragmentTest() { return nrepresentativeFragmentTest(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sType$Default() { return sType(NVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #representativeFragmentTest} field. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV representativeFragmentTest(@NativeType("VkBool32") boolean value) { nrepresentativeFragmentTest(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV set(
        int sType,
        long pNext,
        boolean representativeFragmentTest
    ) {
        sType(sType);
        pNext(pNext);
        representativeFragmentTest(representativeFragmentTest);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV set(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #representativeFragmentTest}. */
    public static int nrepresentativeFragmentTest(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.REPRESENTATIVEFRAGMENTTEST); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #representativeFragmentTest(boolean) representativeFragmentTest}. */
    public static void nrepresentativeFragmentTest(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.REPRESENTATIVEFRAGMENTTEST, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#representativeFragmentTest} field. */
        @NativeType("VkBool32")
        public boolean representativeFragmentTest() { return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nrepresentativeFragmentTest(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#sType} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV} value to the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#sType} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer sType$Default() { return sType(NVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#pNext} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV#representativeFragmentTest} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer representativeFragmentTest(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nrepresentativeFragmentTest(address(), value ? 1 : 0); return this; }

    }

}