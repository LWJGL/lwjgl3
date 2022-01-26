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
 * Structure indicating support for std430-like packing in uniform buffers.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceUniformBufferStandardLayoutFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #uniformBufferStandardLayout};
 * }</code></pre>
 */
public class VkPhysicalDeviceUniformBufferStandardLayoutFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        UNIFORMBUFFERSTANDARDLAYOUT;

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
        UNIFORMBUFFERSTANDARDLAYOUT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures(ByteBuffer container) {
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
    /** indicates that the implementation supports the same layouts for uniform buffers as for storage and other kinds of buffers. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources-standard-layout">Standard Buffer Layout</a>. */
    @NativeType("VkBool32")
    public boolean uniformBufferStandardLayout() { return nuniformBufferStandardLayout(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #uniformBufferStandardLayout} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures set(
        int sType,
        long pNext,
        boolean uniformBufferStandardLayout
    ) {
        sType(sType);
        pNext(pNext);
        uniformBufferStandardLayout(uniformBufferStandardLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures set(VkPhysicalDeviceUniformBufferStandardLayoutFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures malloc() {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures calloc() {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures create(long address) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceUniformBufferStandardLayoutFeatures.PNEXT); }
    /** Unsafe version of {@link #uniformBufferStandardLayout}. */
    public static int nuniformBufferStandardLayout(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeatures.UNIFORMBUFFERSTANDARDLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceUniformBufferStandardLayoutFeatures.PNEXT, value); }
    /** Unsafe version of {@link #uniformBufferStandardLayout(boolean) uniformBufferStandardLayout}. */
    public static void nuniformBufferStandardLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeatures.UNIFORMBUFFERSTANDARDLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceUniformBufferStandardLayoutFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceUniformBufferStandardLayoutFeatures ELEMENT_FACTORY = VkPhysicalDeviceUniformBufferStandardLayoutFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceUniformBufferStandardLayoutFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceUniformBufferStandardLayoutFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#uniformBufferStandardLayout} field. */
        @NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() { return VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nuniformBufferStandardLayout(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#sType} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES} value to the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#sType} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#pNext} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceUniformBufferStandardLayoutFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures#uniformBufferStandardLayout} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }

    }

}