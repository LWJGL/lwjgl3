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
 * Structure describing Y'CbCr conversion features that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code samplerYcbcrConversion} &ndash; specifies whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>. If {@code samplerYcbcrConversion} is {@link VK10#VK_FALSE FALSE}, sampler Y′C<sub>B</sub>C<sub>R</sub> conversion is not supported, and samplers using sampler Y′C<sub>B</sub>C<sub>R</sub> conversion <b>must</b> not be used.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSamplerYcbcrConversionFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 samplerYcbcrConversion;
 * }</code></pre>
 */
public class VkPhysicalDeviceSamplerYcbcrConversionFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLERYCBCRCONVERSION;

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
        SAMPLERYCBCRCONVERSION = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code samplerYcbcrConversion} field. */
    @NativeType("VkBool32")
    public boolean samplerYcbcrConversion() { return nsamplerYcbcrConversion(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code samplerYcbcrConversion} field. */
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures set(
        int sType,
        long pNext,
        boolean samplerYcbcrConversion
    ) {
        sType(sType);
        pNext(pNext);
        samplerYcbcrConversion(samplerYcbcrConversion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures set(VkPhysicalDeviceSamplerYcbcrConversionFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures malloc() {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures calloc() {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures create(long address) {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerYcbcrConversionFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSamplerYcbcrConversionFeatures.PNEXT); }
    /** Unsafe version of {@link #samplerYcbcrConversion}. */
    public static int nsamplerYcbcrConversion(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerYcbcrConversionFeatures.SAMPLERYCBCRCONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSamplerYcbcrConversionFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSamplerYcbcrConversionFeatures.PNEXT, value); }
    /** Unsafe version of {@link #samplerYcbcrConversion(boolean) samplerYcbcrConversion}. */
    public static void nsamplerYcbcrConversion(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSamplerYcbcrConversionFeatures.SAMPLERYCBCRCONVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSamplerYcbcrConversionFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSamplerYcbcrConversionFeatures ELEMENT_FACTORY = VkPhysicalDeviceSamplerYcbcrConversionFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSamplerYcbcrConversionFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSamplerYcbcrConversionFeatures.npNext(address()); }
        /** Returns the value of the {@code samplerYcbcrConversion} field. */
        @NativeType("VkBool32")
        public boolean samplerYcbcrConversion() { return VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsamplerYcbcrConversion(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSamplerYcbcrConversionFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code samplerYcbcrConversion} field. */
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSamplerYcbcrConversionFeatures.nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }

    }

}