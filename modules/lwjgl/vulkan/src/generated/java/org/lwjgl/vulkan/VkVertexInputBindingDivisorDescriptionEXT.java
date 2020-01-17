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
 * <p>If this structure is not used to define a divisor value for an attribute then the divisor has a logical default value of 1.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code binding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>If the {@code vertexAttributeInstanceRateZeroDivisor} feature is not enabled, {@code divisor} <b>must</b> not be 0</li>
 * <li>If the {@code vertexAttributeInstanceRateDivisor} feature is not enabled, {@code divisor} <b>must</b> be 1</li>
 * <li>{@code divisor} <b>must</b> be a value between 0 and {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT}{@code ::maxVertexAttribDivisor}, inclusive.</li>
 * <li>{@link VkVertexInputBindingDescription}{@code ::inputRate} <b>must</b> be of type {@link VK10#VK_VERTEX_INPUT_RATE_INSTANCE VERTEX_INPUT_RATE_INSTANCE} for this {@code binding}.</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineVertexInputDivisorStateCreateInfoEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code binding} &ndash; the binding number for which the divisor is specified.</li>
 * <li>{@code divisor} &ndash; the number of successive instances that will use the same value of the vertex attribute when instanced rendering is enabled. For example, if the divisor is N, the same vertex attribute will be applied to N successive instances before moving on to the next vertex attribute. The maximum value of divisor is implementation dependent and can be queried using {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT}{@code ::maxVertexAttribDivisor}. A value of 0 <b>can</b> be used for the divisor if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-vertexAttributeInstanceRateZeroDivisor">{@code vertexAttributeInstanceRateZeroDivisor}</a> feature is enabled. In this case, the same vertex attribute will be applied to all instances.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVertexInputBindingDivisorDescriptionEXT {
 *     uint32_t binding;
 *     uint32_t divisor;
 * }</code></pre>
 */
public class VkVertexInputBindingDivisorDescriptionEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkVertexInputBindingDivisorDescriptionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDivisorDescriptionEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** Returns the value of the {@code divisor} field. */
    @NativeType("uint32_t")
    public int divisor() { return ndivisor(address()); }

    /** Sets the specified value to the {@code binding} field. */
    public VkVertexInputBindingDivisorDescriptionEXT binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code divisor} field. */
    public VkVertexInputBindingDivisorDescriptionEXT divisor(@NativeType("uint32_t") int value) { ndivisor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputBindingDivisorDescriptionEXT set(
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
    public VkVertexInputBindingDivisorDescriptionEXT set(VkVertexInputBindingDivisorDescriptionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDivisorDescriptionEXT malloc() {
        return wrap(VkVertexInputBindingDivisorDescriptionEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDivisorDescriptionEXT calloc() {
        return wrap(VkVertexInputBindingDivisorDescriptionEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDivisorDescriptionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVertexInputBindingDivisorDescriptionEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance for the specified memory address. */
    public static VkVertexInputBindingDivisorDescriptionEXT create(long address) {
        return wrap(VkVertexInputBindingDivisorDescriptionEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDivisorDescriptionEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVertexInputBindingDivisorDescriptionEXT.class, address);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkVertexInputBindingDivisorDescriptionEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkVertexInputBindingDivisorDescriptionEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDivisorDescriptionEXT mallocStack(MemoryStack stack) {
        return wrap(VkVertexInputBindingDivisorDescriptionEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDivisorDescriptionEXT callocStack(MemoryStack stack) {
        return wrap(VkVertexInputBindingDivisorDescriptionEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDivisorDescriptionEXT.BINDING); }
    /** Unsafe version of {@link #divisor}. */
    public static int ndivisor(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDivisorDescriptionEXT.DIVISOR); }

    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDivisorDescriptionEXT.BINDING, value); }
    /** Unsafe version of {@link #divisor(int) divisor}. */
    public static void ndivisor(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDivisorDescriptionEXT.DIVISOR, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDivisorDescriptionEXT} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDivisorDescriptionEXT, Buffer> implements NativeResource {

        private static final VkVertexInputBindingDivisorDescriptionEXT ELEMENT_FACTORY = VkVertexInputBindingDivisorDescriptionEXT.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDivisorDescriptionEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVertexInputBindingDivisorDescriptionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputBindingDivisorDescriptionEXT.nbinding(address()); }
        /** Returns the value of the {@code divisor} field. */
        @NativeType("uint32_t")
        public int divisor() { return VkVertexInputBindingDivisorDescriptionEXT.ndivisor(address()); }

        /** Sets the specified value to the {@code binding} field. */
        public VkVertexInputBindingDivisorDescriptionEXT.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDivisorDescriptionEXT.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code divisor} field. */
        public VkVertexInputBindingDivisorDescriptionEXT.Buffer divisor(@NativeType("uint32_t") int value) { VkVertexInputBindingDivisorDescriptionEXT.ndivisor(address(), value); return this; }

    }

}