/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderBufferFloat32Atomics;
 *     VkBool32 shaderBufferFloat32AtomicAdd;
 *     VkBool32 shaderBufferFloat64Atomics;
 *     VkBool32 shaderBufferFloat64AtomicAdd;
 *     VkBool32 shaderSharedFloat32Atomics;
 *     VkBool32 shaderSharedFloat32AtomicAdd;
 *     VkBool32 shaderSharedFloat64Atomics;
 *     VkBool32 shaderSharedFloat64AtomicAdd;
 *     VkBool32 shaderImageFloat32Atomics;
 *     VkBool32 shaderImageFloat32AtomicAdd;
 *     VkBool32 sparseImageFloat32Atomics;
 *     VkBool32 sparseImageFloat32AtomicAdd;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT extends Struct<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERBUFFERFLOAT32ATOMICS,
        SHADERBUFFERFLOAT32ATOMICADD,
        SHADERBUFFERFLOAT64ATOMICS,
        SHADERBUFFERFLOAT64ATOMICADD,
        SHADERSHAREDFLOAT32ATOMICS,
        SHADERSHAREDFLOAT32ATOMICADD,
        SHADERSHAREDFLOAT64ATOMICS,
        SHADERSHAREDFLOAT64ATOMICADD,
        SHADERIMAGEFLOAT32ATOMICS,
        SHADERIMAGEFLOAT32ATOMICADD,
        SPARSEIMAGEFLOAT32ATOMICS,
        SPARSEIMAGEFLOAT32ATOMICADD;

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
        SHADERBUFFERFLOAT32ATOMICS = layout.offsetof(2);
        SHADERBUFFERFLOAT32ATOMICADD = layout.offsetof(3);
        SHADERBUFFERFLOAT64ATOMICS = layout.offsetof(4);
        SHADERBUFFERFLOAT64ATOMICADD = layout.offsetof(5);
        SHADERSHAREDFLOAT32ATOMICS = layout.offsetof(6);
        SHADERSHAREDFLOAT32ATOMICADD = layout.offsetof(7);
        SHADERSHAREDFLOAT64ATOMICS = layout.offsetof(8);
        SHADERSHAREDFLOAT64ATOMICADD = layout.offsetof(9);
        SHADERIMAGEFLOAT32ATOMICS = layout.offsetof(10);
        SHADERIMAGEFLOAT32ATOMICADD = layout.offsetof(11);
        SPARSEIMAGEFLOAT32ATOMICS = layout.offsetof(12);
        SPARSEIMAGEFLOAT32ATOMICADD = layout.offsetof(13);
    }

    protected VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderBufferFloat32Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat32Atomics() { return nshaderBufferFloat32Atomics(address()) != 0; }
    /** @return the value of the {@code shaderBufferFloat32AtomicAdd} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat32AtomicAdd() { return nshaderBufferFloat32AtomicAdd(address()) != 0; }
    /** @return the value of the {@code shaderBufferFloat64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat64Atomics() { return nshaderBufferFloat64Atomics(address()) != 0; }
    /** @return the value of the {@code shaderBufferFloat64AtomicAdd} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferFloat64AtomicAdd() { return nshaderBufferFloat64AtomicAdd(address()) != 0; }
    /** @return the value of the {@code shaderSharedFloat32Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat32Atomics() { return nshaderSharedFloat32Atomics(address()) != 0; }
    /** @return the value of the {@code shaderSharedFloat32AtomicAdd} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat32AtomicAdd() { return nshaderSharedFloat32AtomicAdd(address()) != 0; }
    /** @return the value of the {@code shaderSharedFloat64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat64Atomics() { return nshaderSharedFloat64Atomics(address()) != 0; }
    /** @return the value of the {@code shaderSharedFloat64AtomicAdd} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedFloat64AtomicAdd() { return nshaderSharedFloat64AtomicAdd(address()) != 0; }
    /** @return the value of the {@code shaderImageFloat32Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderImageFloat32Atomics() { return nshaderImageFloat32Atomics(address()) != 0; }
    /** @return the value of the {@code shaderImageFloat32AtomicAdd} field. */
    @NativeType("VkBool32")
    public boolean shaderImageFloat32AtomicAdd() { return nshaderImageFloat32AtomicAdd(address()) != 0; }
    /** @return the value of the {@code sparseImageFloat32Atomics} field. */
    @NativeType("VkBool32")
    public boolean sparseImageFloat32Atomics() { return nsparseImageFloat32Atomics(address()) != 0; }
    /** @return the value of the {@code sparseImageFloat32AtomicAdd} field. */
    @NativeType("VkBool32")
    public boolean sparseImageFloat32AtomicAdd() { return nsparseImageFloat32AtomicAdd(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderAtomicFloat#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType$Default() { return sType(EXTShaderAtomicFloat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderBufferFloat32Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferFloat32Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderBufferFloat32AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderBufferFloat32AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderBufferFloat64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferFloat64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderBufferFloat64AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderBufferFloat64AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedFloat32Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedFloat32Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedFloat32AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderSharedFloat32AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedFloat64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedFloat64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedFloat64AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderSharedFloat64AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderImageFloat32Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32Atomics(@NativeType("VkBool32") boolean value) { nshaderImageFloat32Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderImageFloat32AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { nshaderImageFloat32AtomicAdd(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseImageFloat32Atomics} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32Atomics(@NativeType("VkBool32") boolean value) { nsparseImageFloat32Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseImageFloat32AtomicAdd} field. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { nsparseImageFloat32AtomicAdd(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderBufferFloat32Atomics,
        boolean shaderBufferFloat32AtomicAdd,
        boolean shaderBufferFloat64Atomics,
        boolean shaderBufferFloat64AtomicAdd,
        boolean shaderSharedFloat32Atomics,
        boolean shaderSharedFloat32AtomicAdd,
        boolean shaderSharedFloat64Atomics,
        boolean shaderSharedFloat64AtomicAdd,
        boolean shaderImageFloat32Atomics,
        boolean shaderImageFloat32AtomicAdd,
        boolean sparseImageFloat32Atomics,
        boolean sparseImageFloat32AtomicAdd
    ) {
        sType(sType);
        pNext(pNext);
        shaderBufferFloat32Atomics(shaderBufferFloat32Atomics);
        shaderBufferFloat32AtomicAdd(shaderBufferFloat32AtomicAdd);
        shaderBufferFloat64Atomics(shaderBufferFloat64Atomics);
        shaderBufferFloat64AtomicAdd(shaderBufferFloat64AtomicAdd);
        shaderSharedFloat32Atomics(shaderSharedFloat32Atomics);
        shaderSharedFloat32AtomicAdd(shaderSharedFloat32AtomicAdd);
        shaderSharedFloat64Atomics(shaderSharedFloat64Atomics);
        shaderSharedFloat64AtomicAdd(shaderSharedFloat64AtomicAdd);
        shaderImageFloat32Atomics(shaderImageFloat32Atomics);
        shaderImageFloat32AtomicAdd(shaderImageFloat32AtomicAdd);
        sparseImageFloat32Atomics(sparseImageFloat32Atomics);
        sparseImageFloat32AtomicAdd(sparseImageFloat32AtomicAdd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT set(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderAtomicFloatFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderBufferFloat32Atomics}. */
    public static int nshaderBufferFloat32Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT32ATOMICS); }
    /** Unsafe version of {@link #shaderBufferFloat32AtomicAdd}. */
    public static int nshaderBufferFloat32AtomicAdd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT32ATOMICADD); }
    /** Unsafe version of {@link #shaderBufferFloat64Atomics}. */
    public static int nshaderBufferFloat64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT64ATOMICS); }
    /** Unsafe version of {@link #shaderBufferFloat64AtomicAdd}. */
    public static int nshaderBufferFloat64AtomicAdd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT64ATOMICADD); }
    /** Unsafe version of {@link #shaderSharedFloat32Atomics}. */
    public static int nshaderSharedFloat32Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT32ATOMICS); }
    /** Unsafe version of {@link #shaderSharedFloat32AtomicAdd}. */
    public static int nshaderSharedFloat32AtomicAdd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT32ATOMICADD); }
    /** Unsafe version of {@link #shaderSharedFloat64Atomics}. */
    public static int nshaderSharedFloat64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT64ATOMICS); }
    /** Unsafe version of {@link #shaderSharedFloat64AtomicAdd}. */
    public static int nshaderSharedFloat64AtomicAdd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT64ATOMICADD); }
    /** Unsafe version of {@link #shaderImageFloat32Atomics}. */
    public static int nshaderImageFloat32Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERIMAGEFLOAT32ATOMICS); }
    /** Unsafe version of {@link #shaderImageFloat32AtomicAdd}. */
    public static int nshaderImageFloat32AtomicAdd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERIMAGEFLOAT32ATOMICADD); }
    /** Unsafe version of {@link #sparseImageFloat32Atomics}. */
    public static int nsparseImageFloat32Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SPARSEIMAGEFLOAT32ATOMICS); }
    /** Unsafe version of {@link #sparseImageFloat32AtomicAdd}. */
    public static int nsparseImageFloat32AtomicAdd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SPARSEIMAGEFLOAT32ATOMICADD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderBufferFloat32Atomics(boolean) shaderBufferFloat32Atomics}. */
    public static void nshaderBufferFloat32Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT32ATOMICS, value); }
    /** Unsafe version of {@link #shaderBufferFloat32AtomicAdd(boolean) shaderBufferFloat32AtomicAdd}. */
    public static void nshaderBufferFloat32AtomicAdd(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT32ATOMICADD, value); }
    /** Unsafe version of {@link #shaderBufferFloat64Atomics(boolean) shaderBufferFloat64Atomics}. */
    public static void nshaderBufferFloat64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderBufferFloat64AtomicAdd(boolean) shaderBufferFloat64AtomicAdd}. */
    public static void nshaderBufferFloat64AtomicAdd(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERBUFFERFLOAT64ATOMICADD, value); }
    /** Unsafe version of {@link #shaderSharedFloat32Atomics(boolean) shaderSharedFloat32Atomics}. */
    public static void nshaderSharedFloat32Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT32ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedFloat32AtomicAdd(boolean) shaderSharedFloat32AtomicAdd}. */
    public static void nshaderSharedFloat32AtomicAdd(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT32ATOMICADD, value); }
    /** Unsafe version of {@link #shaderSharedFloat64Atomics(boolean) shaderSharedFloat64Atomics}. */
    public static void nshaderSharedFloat64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedFloat64AtomicAdd(boolean) shaderSharedFloat64AtomicAdd}. */
    public static void nshaderSharedFloat64AtomicAdd(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERSHAREDFLOAT64ATOMICADD, value); }
    /** Unsafe version of {@link #shaderImageFloat32Atomics(boolean) shaderImageFloat32Atomics}. */
    public static void nshaderImageFloat32Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERIMAGEFLOAT32ATOMICS, value); }
    /** Unsafe version of {@link #shaderImageFloat32AtomicAdd(boolean) shaderImageFloat32AtomicAdd}. */
    public static void nshaderImageFloat32AtomicAdd(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SHADERIMAGEFLOAT32ATOMICADD, value); }
    /** Unsafe version of {@link #sparseImageFloat32Atomics(boolean) sparseImageFloat32Atomics}. */
    public static void nsparseImageFloat32Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SPARSEIMAGEFLOAT32ATOMICS, value); }
    /** Unsafe version of {@link #sparseImageFloat32AtomicAdd(boolean) sparseImageFloat32AtomicAdd}. */
    public static void nsparseImageFloat32AtomicAdd(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SPARSEIMAGEFLOAT32ATOMICADD, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceShaderAtomicFloatFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderBufferFloat32Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32Atomics(address()) != 0; }
        /** @return the value of the {@code shaderBufferFloat32AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32AtomicAdd(address()) != 0; }
        /** @return the value of the {@code shaderBufferFloat64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat64Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64Atomics(address()) != 0; }
        /** @return the value of the {@code shaderBufferFloat64AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferFloat64AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64AtomicAdd(address()) != 0; }
        /** @return the value of the {@code shaderSharedFloat32Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32Atomics(address()) != 0; }
        /** @return the value of the {@code shaderSharedFloat32AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32AtomicAdd(address()) != 0; }
        /** @return the value of the {@code shaderSharedFloat64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat64Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64Atomics(address()) != 0; }
        /** @return the value of the {@code shaderSharedFloat64AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedFloat64AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64AtomicAdd(address()) != 0; }
        /** @return the value of the {@code shaderImageFloat32Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderImageFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32Atomics(address()) != 0; }
        /** @return the value of the {@code shaderImageFloat32AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean shaderImageFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32AtomicAdd(address()) != 0; }
        /** @return the value of the {@code sparseImageFloat32Atomics} field. */
        @NativeType("VkBool32")
        public boolean sparseImageFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32Atomics(address()) != 0; }
        /** @return the value of the {@code sparseImageFloat32AtomicAdd} field. */
        @NativeType("VkBool32")
        public boolean sparseImageFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32AtomicAdd(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderAtomicFloat#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderAtomicFloat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderBufferFloat32Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderBufferFloat32Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderBufferFloat32AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderBufferFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderBufferFloat64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderBufferFloat64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderBufferFloat64AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderBufferFloat64AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedFloat32Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderSharedFloat32Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedFloat32AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderSharedFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedFloat64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderSharedFloat64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedFloat64AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderSharedFloat64AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderImageFloat32Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderImageFloat32Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderImageFloat32AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer shaderImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32AtomicAdd(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseImageFloat32Atomics} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer sparseImageFloat32Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseImageFloat32AtomicAdd} field. */
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer sparseImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32AtomicAdd(address(), value ? 1 : 0); return this; }

    }

}