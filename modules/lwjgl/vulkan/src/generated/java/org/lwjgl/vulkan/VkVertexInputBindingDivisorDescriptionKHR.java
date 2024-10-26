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
 * Structure specifying a divisor used in instanced rendering.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not used to define a divisor value for an attribute, then the divisor has a logical default value of 1.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code binding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>If the {@code vertexAttributeInstanceRateZeroDivisor} feature is not enabled, {@code divisor} <b>must</b> not be 0</li>
 * <li>If the {@code vertexAttributeInstanceRateDivisor} feature is not enabled, {@code divisor} <b>must</b> be 1</li>
 * <li>{@code divisor} <b>must</b> be a value between 0 and {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR}{@code ::maxVertexAttribDivisor}, inclusive</li>
 * <li>{@link VkVertexInputBindingDescription}{@code ::inputRate} <b>must</b> be of type {@link VK10#VK_VERTEX_INPUT_RATE_INSTANCE VERTEX_INPUT_RATE_INSTANCE} for this {@code binding}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineVertexInputDivisorStateCreateInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVertexInputBindingDivisorDescriptionKHR {
 *     uint32_t {@link #binding};
 *     uint32_t {@link #divisor};
 * }</code></pre>
 */
public class VkVertexInputBindingDivisorDescriptionKHR extends Struct<VkVertexInputBindingDivisorDescriptionKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BINDING,
        DIVISOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BINDING = layout.offsetof(0);
        DIVISOR = layout.offsetof(1);
    }

    protected VkVertexInputBindingDivisorDescriptionKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVertexInputBindingDivisorDescriptionKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVertexInputBindingDivisorDescriptionKHR(address, container);
    }

    /**
     * Creates a {@code VkVertexInputBindingDivisorDescriptionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDivisorDescriptionKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the binding number for which the divisor is specified. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** the number of successive instances that will use the same value of the vertex attribute when instanced rendering is enabled. For example, if the divisor is N, the same vertex attribute will be applied to N successive instances before moving on to the next vertex attribute. The maximum value of {@code divisor} is implementation-dependent and can be queried using {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR}{@code ::maxVertexAttribDivisor}. A value of 0 <b>can</b> be used for the divisor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexAttributeInstanceRateZeroDivisor">{@code vertexAttributeInstanceRateZeroDivisor}</a> feature is enabled. In this case, the same vertex attribute will be applied to all instances. */
    @NativeType("uint32_t")
    public int divisor() { return ndivisor(address()); }

    /** Sets the specified value to the {@link #binding} field. */
    public VkVertexInputBindingDivisorDescriptionKHR binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@link #divisor} field. */
    public VkVertexInputBindingDivisorDescriptionKHR divisor(@NativeType("uint32_t") int value) { ndivisor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputBindingDivisorDescriptionKHR set(
        int binding,
        int divisor
    ) {
        binding(binding);
        divisor(divisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputBindingDivisorDescriptionKHR set(VkVertexInputBindingDivisorDescriptionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDivisorDescriptionKHR malloc() {
        return new VkVertexInputBindingDivisorDescriptionKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDivisorDescriptionKHR calloc() {
        return new VkVertexInputBindingDivisorDescriptionKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionKHR} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDivisorDescriptionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDivisorDescriptionKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionKHR} instance for the specified memory address. */
    public static VkVertexInputBindingDivisorDescriptionKHR create(long address) {
        return new VkVertexInputBindingDivisorDescriptionKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDivisorDescriptionKHR createSafe(long address) {
        return address == NULL ? null : new VkVertexInputBindingDivisorDescriptionKHR(address, null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDivisorDescriptionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDivisorDescriptionKHR malloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescriptionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDivisorDescriptionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDivisorDescriptionKHR calloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescriptionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDivisorDescriptionKHR.BINDING); }
    /** Unsafe version of {@link #divisor}. */
    public static int ndivisor(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDivisorDescriptionKHR.DIVISOR); }

    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDivisorDescriptionKHR.BINDING, value); }
    /** Unsafe version of {@link #divisor(int) divisor}. */
    public static void ndivisor(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDivisorDescriptionKHR.DIVISOR, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDivisorDescriptionKHR} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDivisorDescriptionKHR, Buffer> implements NativeResource {

        private static final VkVertexInputBindingDivisorDescriptionKHR ELEMENT_FACTORY = VkVertexInputBindingDivisorDescriptionKHR.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDivisorDescriptionKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDivisorDescriptionKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVertexInputBindingDivisorDescriptionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVertexInputBindingDivisorDescriptionKHR#binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputBindingDivisorDescriptionKHR.nbinding(address()); }
        /** @return the value of the {@link VkVertexInputBindingDivisorDescriptionKHR#divisor} field. */
        @NativeType("uint32_t")
        public int divisor() { return VkVertexInputBindingDivisorDescriptionKHR.ndivisor(address()); }

        /** Sets the specified value to the {@link VkVertexInputBindingDivisorDescriptionKHR#binding} field. */
        public VkVertexInputBindingDivisorDescriptionKHR.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDivisorDescriptionKHR.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDivisorDescriptionKHR#divisor} field. */
        public VkVertexInputBindingDivisorDescriptionKHR.Buffer divisor(@NativeType("uint32_t") int value) { VkVertexInputBindingDivisorDescriptionKHR.ndivisor(address(), value); return this; }

    }

}