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
 * <p>If the {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the feature.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code representativeFragmentTest} &ndash; indicates whether the implementation supports the representative fragment test. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#fragops-rep-frag-test">Representative Fragment Test</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 representativeFragmentTest;
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

    VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code representativeFragmentTest} field. */
    @NativeType("VkBool32")
    public boolean representativeFragmentTest() { return nrepresentativeFragmentTest(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code representativeFragmentTest} field. */
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

    /** Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV create() {
        return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV create(long address) {
        return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #representativeFragmentTest}. */
    public static int nrepresentativeFragmentTest(long struct) { return memGetInt(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.REPRESENTATIVEFRAGMENTTEST); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #representativeFragmentTest(boolean) representativeFragmentTest}. */
    public static void nrepresentativeFragmentTest(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.REPRESENTATIVEFRAGMENTTEST, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV newInstance(long address) {
            return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.npNext(address()); }
        /** Returns the value of the {@code representativeFragmentTest} field. */
        @NativeType("VkBool32")
        public boolean representativeFragmentTest() { return VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nrepresentativeFragmentTest(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code representativeFragmentTest} field. */
        public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.Buffer representativeFragmentTest(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV.nrepresentativeFragmentTest(address(), value ? 1 : 0); return this; }

    }

}