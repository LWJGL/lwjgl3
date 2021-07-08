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
 * Structure describing features supported by VK_EXT_shader_image_atomic_int64.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderImageAtomicInt64#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderImageInt64Atomics};
 *     VkBool32 {@link #sparseImageInt64Atomics};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERIMAGEINT64ATOMICS,
        SPARSEIMAGEINT64ATOMICS;

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
        SHADERIMAGEINT64ATOMICS = layout.offsetof(2);
        SPARSEIMAGEINT64ATOMICS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(ByteBuffer container) {
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
    /** indicates whether shaders <b>can</b> support 64-bit unsigned and signed integer atomic operations on images. */
    @NativeType("VkBool32")
    public boolean shaderImageInt64Atomics() { return nshaderImageInt64Atomics(address()) != 0; }
    /** indicates whether 64-bit integer atomics <b>can</b> be used on sparse images. */
    @NativeType("VkBool32")
    public boolean sparseImageInt64Atomics() { return nsparseImageInt64Atomics(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderImageInt64Atomics} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderImageInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseImageInt64Atomics} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(@NativeType("VkBool32") boolean value) { nsparseImageInt64Atomics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderImageInt64Atomics,
        boolean sparseImageInt64Atomics
    ) {
        sType(sType);
        pNext(pNext);
        shaderImageInt64Atomics(shaderImageInt64Atomics);
        sparseImageInt64Atomics(sparseImageInt64Atomics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderImageInt64Atomics}. */
    public static int nshaderImageInt64Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SHADERIMAGEINT64ATOMICS); }
    /** Unsafe version of {@link #sparseImageInt64Atomics}. */
    public static int nsparseImageInt64Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SPARSEIMAGEINT64ATOMICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderImageInt64Atomics(boolean) shaderImageInt64Atomics}. */
    public static void nshaderImageInt64Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SHADERIMAGEINT64ATOMICS, value); }
    /** Unsafe version of {@link #sparseImageInt64Atomics(boolean) sparseImageInt64Atomics}. */
    public static void nsparseImageInt64Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SPARSEIMAGEINT64ATOMICS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#shaderImageInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderImageInt64Atomics() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nshaderImageInt64Atomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#sparseImageInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean sparseImageInt64Atomics() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsparseImageInt64Atomics(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#sType} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#shaderImageInt64Atomics} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer shaderImageInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nshaderImageInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#sparseImageInt64Atomics} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer sparseImageInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsparseImageInt64Atomics(address(), value ? 1 : 0); return this; }

    }

}