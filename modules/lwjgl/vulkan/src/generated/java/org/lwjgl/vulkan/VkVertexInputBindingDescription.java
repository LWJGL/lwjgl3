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
 * Structure specifying vertex input binding description.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code binding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>{@code stride} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindingStride}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, {@code stride} <b>must</b> be a multiple of, and at least as large as, {@link VkPhysicalDevicePortabilitySubsetPropertiesKHR}{@code ::minVertexInputBindingStrideAlignment}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code inputRate} <b>must</b> be a valid {@code VkVertexInputRate} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineVertexInputStateCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVertexInputBindingDescription {
 *     uint32_t {@link #binding};
 *     uint32_t {@link #stride};
 *     VkVertexInputRate {@link #inputRate};
 * }</code></pre>
 */
public class VkVertexInputBindingDescription extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BINDING,
        STRIDE,
        INPUTRATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BINDING = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        INPUTRATE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkVertexInputBindingDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the binding number that this structure describes. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** the byte stride between consecutive elements within the buffer. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** a {@code VkVertexInputRate} value specifying whether vertex attribute addressing is a function of the vertex index or of the instance index. */
    @NativeType("VkVertexInputRate")
    public int inputRate() { return ninputRate(address()); }

    /** Sets the specified value to the {@link #binding} field. */
    public VkVertexInputBindingDescription binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public VkVertexInputBindingDescription stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@link #inputRate} field. */
    public VkVertexInputBindingDescription inputRate(@NativeType("VkVertexInputRate") int value) { ninputRate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputBindingDescription set(
        int binding,
        int stride,
        int inputRate
    ) {
        binding(binding);
        stride(stride);
        inputRate(inputRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputBindingDescription set(VkVertexInputBindingDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription malloc() {
        return wrap(VkVertexInputBindingDescription.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVertexInputBindingDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription calloc() {
        return wrap(VkVertexInputBindingDescription.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVertexInputBindingDescription} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVertexInputBindingDescription.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDescription} instance for the specified memory address. */
    public static VkVertexInputBindingDescription create(long address) {
        return wrap(VkVertexInputBindingDescription.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDescription createSafe(long address) {
        return address == NULL ? null : wrap(VkVertexInputBindingDescription.class, address);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVertexInputBindingDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDescription.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkVertexInputBindingDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription malloc(MemoryStack stack) {
        return wrap(VkVertexInputBindingDescription.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVertexInputBindingDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription calloc(MemoryStack stack) {
        return wrap(VkVertexInputBindingDescription.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription.BINDING); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription.STRIDE); }
    /** Unsafe version of {@link #inputRate}. */
    public static int ninputRate(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription.INPUTRATE); }

    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription.BINDING, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription.STRIDE, value); }
    /** Unsafe version of {@link #inputRate(int) inputRate}. */
    public static void ninputRate(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription.INPUTRATE, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDescription} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDescription, Buffer> implements NativeResource {

        private static final VkVertexInputBindingDescription ELEMENT_FACTORY = VkVertexInputBindingDescription.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDescription.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDescription#SIZEOF}, and its mark will be undefined.
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
        protected VkVertexInputBindingDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVertexInputBindingDescription#binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputBindingDescription.nbinding(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription#stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkVertexInputBindingDescription.nstride(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription#inputRate} field. */
        @NativeType("VkVertexInputRate")
        public int inputRate() { return VkVertexInputBindingDescription.ninputRate(address()); }

        /** Sets the specified value to the {@link VkVertexInputBindingDescription#binding} field. */
        public VkVertexInputBindingDescription.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription#stride} field. */
        public VkVertexInputBindingDescription.Buffer stride(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription.nstride(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription#inputRate} field. */
        public VkVertexInputBindingDescription.Buffer inputRate(@NativeType("VkVertexInputRate") int value) { VkVertexInputBindingDescription.ninputRate(address(), value); return this; }

    }

}