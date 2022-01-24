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
 * Structure describing features supported by VK_EXT_shader_atomic_float2.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderAtomicFloat2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderBufferFloat16Atomics};
 *     VkBool32 {@link #shaderBufferFloat16AtomicAdd};
 *     VkBool32 {@link #shaderBufferFloat16AtomicMinMax};
 *     VkBool32 {@link #shaderBufferFloat32AtomicMinMax};
 *     VkBool32 {@link #shaderBufferFloat64AtomicMinMax};
 *     VkBool32 {@link #shaderSharedFloat16Atomics};
 *     VkBool32 {@link #shaderSharedFloat16AtomicAdd};
 *     VkBool32 {@link #shaderSharedFloat16AtomicMinMax};
 *     VkBool32 {@link #shaderSharedFloat32AtomicMinMax};
 *     VkBool32 {@link #shaderSharedFloat64AtomicMinMax};
 *     VkBool32 {@link #shaderImageFloat32AtomicMinMax};
 *     VkBool32 {@link #sparseImageFloat32AtomicMinMax};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERBUFFERFLOAT16ATOMICS,
        SHADERBUFFERFLOAT16ATOMICADD,
        SHADERBUFFERFLOAT16ATOMICMINMAX,
        SHADERBUFFERFLOAT32ATOMICMINMAX,
        SHADERBUFFERFLOAT64ATOMICMINMAX,
        SHADERSHAREDFLOAT16ATOMICS,
        SHADERSHAREDFLOAT16ATOMICADD,
        SHADERSHAREDFLOAT16ATOMICMINMAX,
        SHADERSHAREDFLOAT32ATOMICMINMAX,
        SHADERSHAREDFLOAT64ATOMICMINMAX,
        SHADERIMAGEFLOAT32ATOMICMINMAX,
        SPARSEIMAGEFLOAT32ATOMICMINMAX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBUFFERFLOAT16ATOMICS = layout.offsetof(2);
        SHADERBUFFERFLOAT16ATOMICADD = layout.offsetof(3);
        SHADERBUFFERFLOAT16ATOMICMINMAX = layout.offsetof(4);
        SHADERBUFFERFLOAT32ATOMICMINMAX = layout.offsetof(5);
        SHADERBUFFERFLOAT64ATOMICMINMAX = layout.offsetof(6);
        SHADERSHAREDFLOAT16ATOMICS = layout.offsetof(7);
        SHADERSHAREDFLOAT16ATOMICADD = layout.offsetof(8);
        SHADERSHAREDFLOAT16ATOMICMINMAX = layout.offsetof(9);
        SHADERSHAREDFLOAT32ATOMICMINMAX = layout.offsetof(10);
        SHADERSHAREDFLOAT64ATOMICMINMAX = layout.offsetof(11);
        SHADERIMAGEFLOAT32ATOMICMINMAX = layout.offsetof(12);
        SPARSEIMAGEFLOAT32ATOMICMINMAX = layout.offsetof(13);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(ByteBuffer container) {
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
    /** indicates whether shaders <b>can</b> perform 16-bit floating-point load, store, and exchange atomic operations on storage buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat16Atomics() { return nshaderBufferFloat16Atomics(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 16-bit floating-point add atomic operations on storage buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat16AtomicAdd() { return nshaderBufferFloat16AtomicAdd(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 16-bit floating-point min and max atomic operations on storage buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat16AtomicMinMax() { return nshaderBufferFloat16AtomicMinMax(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 32-bit floating-point min and max atomic operations on storage buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat32AtomicMinMax() { return nshaderBufferFloat32AtomicMinMax(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 64-bit floating-point min and max atomic operations on storage buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat64AtomicMinMax() { return nshaderBufferFloat64AtomicMinMax(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 16-bit floating-point load, store and exchange atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat16Atomics() { return nshaderSharedFloat16Atomics(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 16-bit floating-point add atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat16AtomicAdd() { return nshaderSharedFloat16AtomicAdd(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 16-bit floating-point min and max atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat16AtomicMinMax() { return nshaderSharedFloat16AtomicMinMax(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 32-bit floating-point min and max atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat32AtomicMinMax() { return nshaderSharedFloat32AtomicMinMax(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 64-bit floating-point min and max atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat64AtomicMinMax() { return nshaderSharedFloat64AtomicMinMax(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 32-bit floating-point min and max atomic image operations. */
    @NativeType("VkBool32")
    public boolean shaderImageFloat32AtomicMinMax() { return nshaderImageFloat32AtomicMinMax(address()) != 0; }
    /** indicates whether 32-bit floating-point min and max atomic operations <b>can</b> be used on sparse images. */
    @NativeType("VkBool32")
    public boolean sparseImageFloat32AtomicMinMax() { return nsparseImageFloat32AtomicMinMax(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderAtomicFloat2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType$Default() { return sType(EXTShaderAtomicFloat2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderBufferFloat16Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferFloat16Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderBufferFloat16AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderBufferFloat16AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderBufferFloat16AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderBufferFloat16AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderBufferFloat32AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderBufferFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderBufferFloat64AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderBufferFloat64AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedFloat16Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedFloat16Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedFloat16AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderSharedFloat16AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedFloat16AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderSharedFloat16AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedFloat32AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderSharedFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedFloat64AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderSharedFloat64AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderImageFloat32AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { nshaderImageFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseImageFloat32AtomicMinMax} field. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { nsparseImageFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderBufferFloat16Atomics,
        boolean shaderBufferFloat16AtomicAdd,
        boolean shaderBufferFloat16AtomicMinMax,
        boolean shaderBufferFloat32AtomicMinMax,
        boolean shaderBufferFloat64AtomicMinMax,
        boolean shaderSharedFloat16Atomics,
        boolean shaderSharedFloat16AtomicAdd,
        boolean shaderSharedFloat16AtomicMinMax,
        boolean shaderSharedFloat32AtomicMinMax,
        boolean shaderSharedFloat64AtomicMinMax,
        boolean shaderImageFloat32AtomicMinMax,
        boolean sparseImageFloat32AtomicMinMax
    ) {
        sType(sType);
        pNext(pNext);
        shaderBufferFloat16Atomics(shaderBufferFloat16Atomics);
        shaderBufferFloat16AtomicAdd(shaderBufferFloat16AtomicAdd);
        shaderBufferFloat16AtomicMinMax(shaderBufferFloat16AtomicMinMax);
        shaderBufferFloat32AtomicMinMax(shaderBufferFloat32AtomicMinMax);
        shaderBufferFloat64AtomicMinMax(shaderBufferFloat64AtomicMinMax);
        shaderSharedFloat16Atomics(shaderSharedFloat16Atomics);
        shaderSharedFloat16AtomicAdd(shaderSharedFloat16AtomicAdd);
        shaderSharedFloat16AtomicMinMax(shaderSharedFloat16AtomicMinMax);
        shaderSharedFloat32AtomicMinMax(shaderSharedFloat32AtomicMinMax);
        shaderSharedFloat64AtomicMinMax(shaderSharedFloat64AtomicMinMax);
        shaderImageFloat32AtomicMinMax(shaderImageFloat32AtomicMinMax);
        sparseImageFloat32AtomicMinMax(sparseImageFloat32AtomicMinMax);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderBufferFloat16Atomics}. */
    public static int nshaderBufferFloat16Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICS); }
    /** Unsafe version of {@link #shaderBufferFloat16AtomicAdd}. */
    public static int nshaderBufferFloat16AtomicAdd(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICADD); }
    /** Unsafe version of {@link #shaderBufferFloat16AtomicMinMax}. */
    public static int nshaderBufferFloat16AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICMINMAX); }
    /** Unsafe version of {@link #shaderBufferFloat32AtomicMinMax}. */
    public static int nshaderBufferFloat32AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT32ATOMICMINMAX); }
    /** Unsafe version of {@link #shaderBufferFloat64AtomicMinMax}. */
    public static int nshaderBufferFloat64AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT64ATOMICMINMAX); }
    /** Unsafe version of {@link #shaderSharedFloat16Atomics}. */
    public static int nshaderSharedFloat16Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICS); }
    /** Unsafe version of {@link #shaderSharedFloat16AtomicAdd}. */
    public static int nshaderSharedFloat16AtomicAdd(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICADD); }
    /** Unsafe version of {@link #shaderSharedFloat16AtomicMinMax}. */
    public static int nshaderSharedFloat16AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICMINMAX); }
    /** Unsafe version of {@link #shaderSharedFloat32AtomicMinMax}. */
    public static int nshaderSharedFloat32AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT32ATOMICMINMAX); }
    /** Unsafe version of {@link #shaderSharedFloat64AtomicMinMax}. */
    public static int nshaderSharedFloat64AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT64ATOMICMINMAX); }
    /** Unsafe version of {@link #shaderImageFloat32AtomicMinMax}. */
    public static int nshaderImageFloat32AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERIMAGEFLOAT32ATOMICMINMAX); }
    /** Unsafe version of {@link #sparseImageFloat32AtomicMinMax}. */
    public static int nsparseImageFloat32AtomicMinMax(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SPARSEIMAGEFLOAT32ATOMICMINMAX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderBufferFloat16Atomics(boolean) shaderBufferFloat16Atomics}. */
    public static void nshaderBufferFloat16Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICS, value); }
    /** Unsafe version of {@link #shaderBufferFloat16AtomicAdd(boolean) shaderBufferFloat16AtomicAdd}. */
    public static void nshaderBufferFloat16AtomicAdd(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICADD, value); }
    /** Unsafe version of {@link #shaderBufferFloat16AtomicMinMax(boolean) shaderBufferFloat16AtomicMinMax}. */
    public static void nshaderBufferFloat16AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICMINMAX, value); }
    /** Unsafe version of {@link #shaderBufferFloat32AtomicMinMax(boolean) shaderBufferFloat32AtomicMinMax}. */
    public static void nshaderBufferFloat32AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT32ATOMICMINMAX, value); }
    /** Unsafe version of {@link #shaderBufferFloat64AtomicMinMax(boolean) shaderBufferFloat64AtomicMinMax}. */
    public static void nshaderBufferFloat64AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT64ATOMICMINMAX, value); }
    /** Unsafe version of {@link #shaderSharedFloat16Atomics(boolean) shaderSharedFloat16Atomics}. */
    public static void nshaderSharedFloat16Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedFloat16AtomicAdd(boolean) shaderSharedFloat16AtomicAdd}. */
    public static void nshaderSharedFloat16AtomicAdd(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICADD, value); }
    /** Unsafe version of {@link #shaderSharedFloat16AtomicMinMax(boolean) shaderSharedFloat16AtomicMinMax}. */
    public static void nshaderSharedFloat16AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICMINMAX, value); }
    /** Unsafe version of {@link #shaderSharedFloat32AtomicMinMax(boolean) shaderSharedFloat32AtomicMinMax}. */
    public static void nshaderSharedFloat32AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT32ATOMICMINMAX, value); }
    /** Unsafe version of {@link #shaderSharedFloat64AtomicMinMax(boolean) shaderSharedFloat64AtomicMinMax}. */
    public static void nshaderSharedFloat64AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT64ATOMICMINMAX, value); }
    /** Unsafe version of {@link #shaderImageFloat32AtomicMinMax(boolean) shaderImageFloat32AtomicMinMax}. */
    public static void nshaderImageFloat32AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERIMAGEFLOAT32ATOMICMINMAX, value); }
    /** Unsafe version of {@link #sparseImageFloat32AtomicMinMax(boolean) sparseImageFloat32AtomicMinMax}. */
    public static void nsparseImageFloat32AtomicMinMax(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SPARSEIMAGEFLOAT32ATOMICMINMAX, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat16Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat16Atomics() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16Atomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat16AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat16AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicAdd(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat16AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat16AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat32AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat32AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat64AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat64AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat64AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat16Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat16Atomics() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16Atomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat16AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat16AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicAdd(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat16AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat16AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat32AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat32AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat64AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat64AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat64AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderImageFloat32AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean shaderImageFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderImageFloat32AtomicMinMax(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#sparseImageFloat32AtomicMinMax} field. */
        @NativeType("VkBool32")
        public boolean sparseImageFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsparseImageFloat32AtomicMinMax(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderAtomicFloat2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT} value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer sType$Default() { return sType(EXTShaderAtomicFloat2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat16Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat16Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat16AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat16AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat16AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat32AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderBufferFloat64AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat64AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat16Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat16Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat16AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat16AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat16AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat32AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderSharedFloat64AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat64AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#shaderImageFloat32AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderImageFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT#sparseImageFloat32AtomicMinMax} field. */
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer sparseImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsparseImageFloat32AtomicMinMax(address(), value ? 1 : 0); return this; }

    }

}