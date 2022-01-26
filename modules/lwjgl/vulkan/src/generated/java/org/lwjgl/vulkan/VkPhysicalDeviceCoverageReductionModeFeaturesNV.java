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
 * Structure describing the coverage reduction mode features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCoverageReductionModeFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #coverageReductionMode};
 * }</code></pre>
 */
public class VkPhysicalDeviceCoverageReductionModeFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COVERAGEREDUCTIONMODE;

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
        COVERAGEREDUCTIONMODE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports coverage reduction modes. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-coverage-reduction">Coverage Reduction</a>. */
    @NativeType("VkBool32")
    public boolean coverageReductionMode() { return ncoverageReductionMode(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV sType$Default() { return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #coverageReductionMode} field. */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV coverageReductionMode(@NativeType("VkBool32") boolean value) { ncoverageReductionMode(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV set(
        int sType,
        long pNext,
        boolean coverageReductionMode
    ) {
        sType(sType);
        pNext(pNext);
        coverageReductionMode(coverageReductionMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV set(VkPhysicalDeviceCoverageReductionModeFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCoverageReductionModeFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCoverageReductionModeFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCoverageReductionModeFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #coverageReductionMode}. */
    public static int ncoverageReductionMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCoverageReductionModeFeaturesNV.COVERAGEREDUCTIONMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCoverageReductionModeFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCoverageReductionModeFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #coverageReductionMode(boolean) coverageReductionMode}. */
    public static void ncoverageReductionMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCoverageReductionModeFeaturesNV.COVERAGEREDUCTIONMODE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCoverageReductionModeFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCoverageReductionModeFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCoverageReductionModeFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceCoverageReductionModeFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCoverageReductionModeFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCoverageReductionModeFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#coverageReductionMode} field. */
        @NativeType("VkBool32")
        public boolean coverageReductionMode() { return VkPhysicalDeviceCoverageReductionModeFeaturesNV.ncoverageReductionMode(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#sType} field. */
        public VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCoverageReductionModeFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV} value to the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#sType} field. */
        public VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer sType$Default() { return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#pNext} field. */
        public VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCoverageReductionModeFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV#coverageReductionMode} field. */
        public VkPhysicalDeviceCoverageReductionModeFeaturesNV.Buffer coverageReductionMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCoverageReductionModeFeaturesNV.ncoverageReductionMode(address(), value ? 1 : 0); return this; }

    }

}