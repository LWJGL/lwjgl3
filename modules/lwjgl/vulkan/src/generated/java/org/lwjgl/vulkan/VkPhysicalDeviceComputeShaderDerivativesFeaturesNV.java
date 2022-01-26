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
 * Structure describing compute shader derivative features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-quad">Quad shader scope</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceComputeShaderDerivativesFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #computeDerivativeGroupQuads};
 *     VkBool32 {@link #computeDerivativeGroupLinear};
 * }</code></pre>
 */
public class VkPhysicalDeviceComputeShaderDerivativesFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPUTEDERIVATIVEGROUPQUADS,
        COMPUTEDERIVATIVEGROUPLINEAR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPUTEDERIVATIVEGROUPQUADS = layout.offsetof(2);
        COMPUTEDERIVATIVEGROUPLINEAR = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(ByteBuffer container) {
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
    /** indicates that the implementation supports the {@code ComputeDerivativeGroupQuadsNV} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean computeDerivativeGroupQuads() { return ncomputeDerivativeGroupQuads(address()) != 0; }
    /** indicates that the implementation supports the {@code ComputeDerivativeGroupLinearNV} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean computeDerivativeGroupLinear() { return ncomputeDerivativeGroupLinear(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType$Default() { return sType(NVComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #computeDerivativeGroupQuads} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) { ncomputeDerivativeGroupQuads(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #computeDerivativeGroupLinear} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) { ncomputeDerivativeGroupLinear(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV set(
        int sType,
        long pNext,
        boolean computeDerivativeGroupQuads,
        boolean computeDerivativeGroupLinear
    ) {
        sType(sType);
        pNext(pNext);
        computeDerivativeGroupQuads(computeDerivativeGroupQuads);
        computeDerivativeGroupLinear(computeDerivativeGroupLinear);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV set(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #computeDerivativeGroupQuads}. */
    public static int ncomputeDerivativeGroupQuads(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.COMPUTEDERIVATIVEGROUPQUADS); }
    /** Unsafe version of {@link #computeDerivativeGroupLinear}. */
    public static int ncomputeDerivativeGroupLinear(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.COMPUTEDERIVATIVEGROUPLINEAR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #computeDerivativeGroupQuads(boolean) computeDerivativeGroupQuads}. */
    public static void ncomputeDerivativeGroupQuads(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.COMPUTEDERIVATIVEGROUPQUADS, value); }
    /** Unsafe version of {@link #computeDerivativeGroupLinear(boolean) computeDerivativeGroupLinear}. */
    public static void ncomputeDerivativeGroupLinear(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.COMPUTEDERIVATIVEGROUPLINEAR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceComputeShaderDerivativesFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceComputeShaderDerivativesFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceComputeShaderDerivativesFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#computeDerivativeGroupQuads} field. */
        @NativeType("VkBool32")
        public boolean computeDerivativeGroupQuads() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupQuads(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#computeDerivativeGroupLinear} field. */
        @NativeType("VkBool32")
        public boolean computeDerivativeGroupLinear() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupLinear(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#sType} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV} value to the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#sType} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer sType$Default() { return sType(NVComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#pNext} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#computeDerivativeGroupQuads} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupQuads(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#computeDerivativeGroupLinear} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupLinear(address(), value ? 1 : 0); return this; }

    }

}